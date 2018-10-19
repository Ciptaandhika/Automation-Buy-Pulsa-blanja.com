package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object loginURL
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object PDPURL
     
    /**
     * <p></p>
     */
    public static Object MemberOrderListURL
     
    /**
     * <p></p>
     */
    public static Object URLPulsa
     
    /**
     * <p></p>
     */
    public static Object nmr_hp
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Production', allVariables['default'] + ['loginURL' : 'https://member.blanja.com/member/login', 'username' : 'testblj2', 'password' : '123qwe', 'PDPURL' : 'https://item.blanja.com/item/jual-beli-pantene-black-shine-18983897', 'MemberOrderListURL' : 'https://member.blanja.com/trades/orderList.html', 'URLPulsa' : 'https://www.blanja.com/top-up/pulsa', 'nmr_hp' : '081289138338'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        loginURL = selectedVariables['loginURL']
        username = selectedVariables['username']
        password = selectedVariables['password']
        PDPURL = selectedVariables['PDPURL']
        MemberOrderListURL = selectedVariables['MemberOrderListURL']
        URLPulsa = selectedVariables['URLPulsa']
        nmr_hp = selectedVariables['nmr_hp']
        
    }
}
