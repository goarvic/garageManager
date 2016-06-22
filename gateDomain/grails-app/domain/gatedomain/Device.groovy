package gatedomain

class Device {

    String ipAddress
    int port
    Date dateCreated

    static constraints = {
    }

    def beforeInsert() {
        dateCreated = new Date()
    }
}
