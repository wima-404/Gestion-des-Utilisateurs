public class Role {
    private String nomRole;

    public Role(String nomRole) {
        this.nomRole = nomRole;
    }
    public Role() {
    }


    public String getNomRole() {
        return nomRole;
    }
    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    @Override
    public String toString() {
        return nomRole;
    }
}