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

WebUI.openBrowser('')

WebUI.navigateToUrl(loginUrl)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_nick'), userName)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_password'), password)

WebUI.click(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/a_Masuk'))

WebUI.navigateToUrl(memberUrl)

WebUI.click(findTestObject('SC_02010003_Member_BlanjaanSaya/a_closeDialog grey-closeDialog'))

result = WebUI.getText(findTestObject('New Folder/Page_My orders - BLANJA.com/span_Nomor Pemesanan4181913092'))

println(result)

Strattribute=WebUI.concatenate(['https://katalon.com/', result] as String[],
	FailureHandling.STOP_ON_FAILURE)

println(Strattribute)

WebUI.navigateToUrl(Strattribute)



