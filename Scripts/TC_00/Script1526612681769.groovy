import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

for ( i in 0..5 ){

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(loginUrl)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_nick'), userName)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_password'), password)

WebUI.click(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/a_Masuk'))

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/a_Oranye'))

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_29_Direct_Transfer_Mandiri'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

post = CustomKeywords.'blj.common.report.Autoplaced.SplitPostUniqueAmount'(WebUI.getText(findTestObject('SC_04010004_Trade_SuccessPayment/unique_amt_post')))

uniqueAmount = ((' - ' + WebUI.getText(findTestObject('SC_04010004_Trade_SuccessPayment/unique_amt_pre'))) + post)

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(uniqueAmount, false)

paymentMethod = ('Direct Transfer Mandiri ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Transfer Bank')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.closeBrowser()

}
