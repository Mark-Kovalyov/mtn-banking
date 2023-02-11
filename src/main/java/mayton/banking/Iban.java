package mayton.banking;

import static com.google.common.base.Preconditions.checkNotNull;

public class Iban {

    static final class IbanComponents {

        public final String country;
        public final String checkNumber;
        public final String mfo;
        public final String accountNumber;

        public IbanComponents(String country, String checkNumber, String mfo, String accountNumber) {
            this.country = country;
            this.checkNumber = checkNumber;
            this.mfo = mfo;
            this.accountNumber = accountNumber;
        }
    }

    public static boolean isValidIban(String iban) {
        checkNotNull(iban);
        if (iban.length() != 29) {
            return false;
        }
        // TODO:
        return true;
    }

    public static IbanComponents parse(String iban) {
        // TODO:
        return new IbanComponents("","","","");
    }

}
