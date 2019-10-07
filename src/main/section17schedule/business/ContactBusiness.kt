package section17schedule.business

import section17schedule.model.ContactModel
import section17schedule.repository.ContactRepository
import java.lang.Exception

/**
 * In the application architecture, the Business layer handles all the necessary business logic.
 * */
class ContactBusiness {

    /**
     * Create a new user
     */
    fun save(name: String, phone: String) {
        // Validate before proceeding
        validate(name, phone)
        // Create the entity
        val contact = ContactModel(name, phone)
        ContactRepository.save(contact)
    }

    /**
     * Remove a user
     */
    fun delete(name: String, phone: String) {
        validate(name, phone, true)
        ContactRepository.delete(name, phone)
    }

    /**
     * Load contact list
     */
    fun getList(): List<ContactModel> {
        return ContactRepository.getList()
    }

    /**
     * Returns the text used to describe the number of contacts.
     */
    fun getCount(): String {
        val list = getList()
        return when {
            list.isEmpty() -> "0 contact"
            list.size == 1 -> "1 contact"
            else -> "${list.size} contacts"
        }
    }

    /**
     * Do business validations
     * Useful for creating a new contact as much as updating an existing one
     * */
    private fun validate(name: String, phone: String, removal: Boolean = false) {

        if (removal) {
            if (name.isBlank() || phone.isBlank()) {
                throw Exception("You must select a contact before removing.")
            }
        } else {
            if (name.isBlank()) {
                throw Exception("Name is required")
            }
            if (phone.isBlank()) {
                throw Exception("Phone is required")
            }
        }
    }
}