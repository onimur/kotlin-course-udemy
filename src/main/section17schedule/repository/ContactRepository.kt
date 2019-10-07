package section17schedule.repository

import section17schedule.model.ContactModel

/**
 * In application architecture, the Repository layer handles application data.
 */
class ContactRepository {

    //The companion object will be initialized even before calling the constructor
    //of that class as similar to Java static initializer.
    companion object {
        //Initialize empty contact list
        private val contactList = mutableListOf<ContactModel>()

        /**
         * Create a new contact
         */
        fun save(contact: ContactModel) {
            contactList.add(contact)
        }

        /**
         * Remove contact
         */
        fun delete(name: String, phone: String) {
            // Contact list search
            val list = getList()

            // Find the contact in the list
            var index = -1
            for (item in list.withIndex()) {
                if (item.value.name == name && item.value.phone == phone) {
                    index = item.index
                }
            }
            //remove
            contactList.removeAt(index)
        }

        fun getList(): List<ContactModel> {
            return contactList
        }
    }
}