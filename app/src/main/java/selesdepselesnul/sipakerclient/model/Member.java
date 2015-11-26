package selesdepselesnul.sipakerclient.model;

/**
 * @author Moch Deden (https://github.com/selesdepselesnul)
 */
public class Member {
    public final String id;
    public final String password;

    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (!id.equals(member.id)) return false;
        return password.equals(member.password);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
