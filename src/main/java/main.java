import org.apache.commons.lang.StringUtils;

/**
 * @author Alexei Vainshtein
 */
public class main {

    public static void main(String[] args) {
        String a = null;
        String b = System.getenv("MISSING");

        if (StringUtils.isBlank(a)) {
            System.out.println("A is blank");
        }

        if (StringUtils.isBlank(b)) {
            System.out.println("B is blank");
        }
    }
}
