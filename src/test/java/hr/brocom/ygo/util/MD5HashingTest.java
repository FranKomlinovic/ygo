package hr.brocom.ygo.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class MD5HashingTest {

    @Test
    void hashPassword() {
        String password = MD5Hashing.hashPassword("password");
        String password2 = MD5Hashing.hashPassword("password2");
        String samePassword = MD5Hashing.hashPassword("password");
        String longPassword = MD5Hashing.hashPassword("+dksfjgnsdklfgndslfkgnsuhnrčl kl7894h3kli24nllkedfj-s.,mn58i342523lk nbcvkj 923p56 34l5zh687");
        Assert.assertEquals(32, longPassword.length());
        Assert.assertEquals(password, samePassword);
        Assert.assertNotEquals(password, password2);
        Assert.assertNotEquals(samePassword, password2);

    }
}
