package section17schedule.business
import java.lang.Exception

class ContactBusiness  {
    fun save(name:String, phone:String){
        validate(name, phone)
    }

    fun delete (name:String, phone:String){
        validate(name, phone, true)
    }
    private fun validate(name: String, phone: String, removal: Boolean = false) {

        if (removal){
            if (name.isBlank() || phone.isBlank()){
                throw Exception ("You must select a contact before removing.")
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