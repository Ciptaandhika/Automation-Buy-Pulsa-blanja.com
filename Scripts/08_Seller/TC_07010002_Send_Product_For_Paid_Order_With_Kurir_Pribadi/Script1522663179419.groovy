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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/a_Transaksi Penjualan'))

WebUI.setText(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_OrderNumber'), orderNumber)

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_Cari'))

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_kirim'))

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_logisticsCompany_lainnya'))

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/Logistics_List'))

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/li_Kurir Pribadi'))

WebUI.setText(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_NomorResi'), orderNumber)

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_OK_Resi'))

WebUI.click(findTestObject('SC_08_010001_Seller_Admin/SC_02_Menu/SC_02_01_TransaksiPenjualan/input_OK_ConfirmBox'))

