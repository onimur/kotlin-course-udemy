package section17schedule.repository

import section17schedule.model.ContactModel

class ContactRepository {

    //The companion object will be initialized even before calling the constructor
    //of that class as similar to Java static initializer.
    companion object {
        private val contactList = mutableListOf<ContactModel>()

        fun save(contact: ContactModel) {
            contactList.add(contact)
        }

        fun delete(contact: ContactModel) {
            var index = 0
            for (item in contactList.withIndex()) {
                if (item.value.name == contact.name && item.value.phone == contact.phone) {
                    index = item.index
                    break
                }
            }

            contactList.removeAt(index)
        }

        fun getList(): List<ContactModel> {
            return contactList
        }
    }
}