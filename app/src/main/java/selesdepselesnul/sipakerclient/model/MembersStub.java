package selesdepselesnul.sipakerclient.model;

import android.text.Editable;

/**
 * Created by morrisseymarr on 11/26/15.
 */
public class MembersStub implements Members {
    @Override
    public Member get(String id) {
        return new Member("123456", "secretpassword");
    }
}
