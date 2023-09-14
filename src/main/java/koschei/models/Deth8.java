package koschei.models;

import koschei.KoscheiTheDeathless;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {

    @Autowired
    private KoscheiTheDeathless deathless;

    @Override
    public String toString() {
        return ", Смерть Кощея!";
    }
}
