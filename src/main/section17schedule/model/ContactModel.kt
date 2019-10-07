package section17schedule.model

/**
 *  Contact Entity
 * Data could be trafficked as attributes in methods.
 *
 * However, it is advised that there is an entity that encompasses data and facilitates information traffic.
 *
 * A class that is used to traffic data and requires no methods is a strong candidate to be created as a data class.
 */
class ContactModel(val name: String, val phone: String) {

}