package gatedomain

class Gate {


    int deviceNumber
    Device device
    Date dateCreated

    static hasMany = [admins : User, users: User]
    static belongsTo = User

    static constraints = {
    }


    def beforeInsert() {
        dateCreated = new Date()
    }
}
