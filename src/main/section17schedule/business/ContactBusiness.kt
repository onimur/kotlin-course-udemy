package section17schedule.business

import section17schedule.model.ContactModel
import section17schedule.repository.ContactRepository
import java.lang.Exception

class ContactBusiness {
    fun save(name: String, phone: String) {
        validate(name, phone)
        val contact = ContactModel(name, phone)
        ContactRepository.save(contact)
    }

    fun delete(name: String, phone: String) {
        validate(name, phone, true)
        val contact = ContactModel(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList(): List<ContactModel> {
        return ContactRepository.getList()
    }

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