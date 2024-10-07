package ejb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.ClassMAPTable;
import java.util.HashMap;
import javax.ejb.Remote;
/**
 *
 * @author ryrab
 */
@Remote
public interface StationRemote {
    public Object[] select(ClassMAPTable c,String request)throws Exception;
    public int insertToTable(ClassMAPTable c)throws Exception;
    public HashMap<String,Object[]> selectAll(HashMap<String,Request> requetes)throws Exception;
}
