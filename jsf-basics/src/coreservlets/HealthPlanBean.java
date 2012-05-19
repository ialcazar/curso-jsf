package coreservlets;

import javax.faces.bean.*;

@ManagedBean   
public class HealthPlanBean {
  public String signup() {
    if (Math.random() < 0.2) {
      return("accepted");
    } else {
      return("rejected");
    }
  }
}


// Note: there is no persistent state, so I could have specified @ApplicationScoped above class.
// But I wanted to keep this simple. Besides, in real applications, application scope is rare,
// because most beans of this type have state (properties that capture user input).
