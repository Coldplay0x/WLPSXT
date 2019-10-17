
package com.zxl.crm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://service.crm.zxl.com/")
@XmlSeeAlso({
})
public interface ICustomerService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.zxl.crm.service.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerByTelephone", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindCustomerByTelephone")
    @ResponseWrapper(localName = "findCustomerByTelephoneResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindCustomerByTelephoneResponse")
    public Customer findCustomerByTelephone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findDecidedzoneIdByAddress", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindDecidedzoneIdByAddress")
    @ResponseWrapper(localName = "findDecidedzoneIdByAddressResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindDecidedzoneIdByAddressResponse")
    public String findDecidedzoneIdByAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.zxl.crm.service.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListHasAssociation", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindListHasAssociation")
    @ResponseWrapper(localName = "findListHasAssociationResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindListHasAssociationResponse")
    public List<Customer> findListHasAssociation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "assigncustomerstodecidedzone", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.Assigncustomerstodecidedzone")
    @ResponseWrapper(localName = "assigncustomerstodecidedzoneResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.AssigncustomerstodecidedzoneResponse")
    public void assigncustomerstodecidedzone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.zxl.crm.service.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListNotAssociation", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindListNotAssociation")
    @ResponseWrapper(localName = "findListNotAssociationResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindListNotAssociationResponse")
    public List<Customer> findListNotAssociation();

    /**
     * 
     * @return
     *     returns java.util.List<com.zxl.crm.service.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service.crm.zxl.com/", className = "com.zxl.crm.service.FindAllResponse")
    public List<Customer> findAll();

}
