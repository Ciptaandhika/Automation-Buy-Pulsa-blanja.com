import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Test Suites/TS_02_Autoplaced Pulsa/TS_01_Autoplaced_Mandiri_Debit Online')

suiteProperties.put('name', 'TS_01_Autoplaced_Mandiri_Debit Online')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\cipta.andhika\\Katalon Studio\\blanja.test\\blanja.test\\Reports\\Test Suites\\TS_02_Autoplaced Pulsa\\TS_01_Autoplaced_Mandiri_Debit Online\\20181019_092338\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Suites/TS_02_Autoplaced Pulsa/TS_01_Autoplaced_Mandiri_Debit Online', suiteProperties, [new TestCaseBinding('Test Cases/10_Test Case Besar Pulsa/Pulsa_1', 'Test Cases/10_Test Case Besar Pulsa/Pulsa_1',  null), new TestCaseBinding('Test Cases/04_Trade/TC_04010002_ChooseMethodPayment/TC_04010002_02_ChooseMethodPayment_Mandiri_MandiriDebitOnline', 'Test Cases/04_Trade/TC_04010002_ChooseMethodPayment/TC_04010002_02_ChooseMethodPayment_Mandiri_MandiriDebitOnline',  null), new TestCaseBinding('Test Cases/04_Trade/TC_04010003_ClickCheckout_GetLastOrderID_ExportTo_Blanja_Autoplaced', 'Test Cases/04_Trade/TC_04010003_ClickCheckout_GetLastOrderID_ExportTo_Blanja_Autoplaced',  null)])
