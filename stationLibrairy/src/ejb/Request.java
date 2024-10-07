/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import bean.ClassMAPTable;
import java.io.Serializable;

/**
 *
 * @author ryrab
 */
public class Request implements Serializable {
    ClassMAPTable classes;
    String request;
    public Request(ClassMAPTable classes,String request){
        this.setClasses(classes);
        this.setRequest(request);
    }

    public ClassMAPTable getClasses() {
        return classes;
    }

    public void setClasses(ClassMAPTable classes) {
        this.classes = classes;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    
}
