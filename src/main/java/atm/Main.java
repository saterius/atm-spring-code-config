package atm;

import config.ATMconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMconfig.class);
        DataSourceFile dataSourceFile = context.getBean(DataSourceFile.class);
        Bank bank = context.getBean(Bank.class);
        ATM atm = context.getBean(ATM.class);
        AtmUI atmUI = context.getBean(AtmUI.class);
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
