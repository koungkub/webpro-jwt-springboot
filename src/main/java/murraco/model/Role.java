package murraco.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
  ROLE_ADMIN, ROLE_CLIENT, ROLE_MONEY;

  public String getAuthority() {
    return name();
  }

}
