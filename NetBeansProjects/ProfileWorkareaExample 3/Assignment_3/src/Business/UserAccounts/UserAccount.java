/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;
    Date lastAccessed;
    Date lastUpdated;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        password = pw;
        this.profile = profile;
        lastUpdated = new Date();

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public String getUserLoginName() {
        return username;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    public Date getLastAccessed() {
        return lastAccessed;
    }

    public void markAccessed() {
        lastAccessed = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void markUpdated() {
        lastUpdated = new Date();
    }
    
    public String getStatus() {
        if (lastAccessed == null) {
            return "Inactive";
        }
        return "Active";
    }

    @Override
    public String toString() {

        return getUserLoginName();
    }

}
