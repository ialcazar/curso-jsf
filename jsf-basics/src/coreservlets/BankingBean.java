package coreservlets;

import javax.faces.bean.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

@ManagedBean 
public class BankingBean {
  private String customerId, password, message="";

  private BankCustomer customer;

  public String getCustomerId() {
    return(customerId);
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getPassword() {
    return(password);
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public BankCustomer getCustomer() {
    return(customer);
  }
  
  public String getMessage() {
    return(message);
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  public String showBalancePage() {
    if (!password.equals("secret")) {
      return("wrong-password");
    }
    customer =
      BankCustomerLookupService.getCustomer(customerId);
    if (customer == null) {
      return("unknown-customer");
    } else if (customer.getBalance() < 0) {
      return("negative-balance");
    } else if (customer.getBalance() < 10000) {
      return("normal-balance");
    } else {
      return("high-balance");
    }
  }
  
  public String showBalanceMessage() {
    if (!password.equals("secret")) {
      message = "Incorrect password";
    } else {
      customer =
        BankCustomerLookupService.getCustomer(customerId);
      if (customer == null) {
        message = "Unknown customer";
      } else {
        message = 
          String.format("Balance for %s %s is $%,.2f",
                        customer.getFirstName(),
                        customer.getLastName(),
                        customer.getBalance());
      }
    }
    return(null);
  }
}
