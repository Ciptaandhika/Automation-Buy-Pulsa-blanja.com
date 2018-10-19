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

WebUI.maximizeWindow()

WebUI.navigateToUrl(loginUrl)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_nick'), userName)

WebUI.setText(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/input_password'), password)

WebUI.click(findTestObject('SC_01010001_Mainsite/SC_02010001_Member_Login/a_Masuk'))

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/a_Saya Mengerti'))

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('TEMP/select_Pilih Jasa PengirimanKu'), 'Kurir Standar', true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_01_mandiri_bank_transfer_bank'))

paymentMethod = ('Mandiri ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bank_Transfer_Virtual_Account')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

WebUI.click(findTestObject('SC_02010003_Member_BlanjaanSaya/a_closeDialog grey-closeDialog'))

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_02_mandiri_debit_online'))

paymentMethod = ('Mandiri ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Debit Online')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_04_mandiri_kartu_kredit'))

paymentMethod = ('Mandiri ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Kartu Kredit')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_05_mandiri_e_cash'))

paymentMethod = ('Mandiri ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri E-Cash')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_06_BNI_Bank_Transfer_Virtual_Account'))

paymentMethod = ('BNI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bank_Transfer_Virtual_Account')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_07_BNI_Debit_Online'))

paymentMethod = ('BNI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_BNI Debit Online')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_08_BNI_Kartu_Kredit'))

paymentMethod = ('BNI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Kartu Kredit')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_09_BNI_SMS_Payment'))

paymentMethod = ('BNI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_SMS Payment')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_10_BRI_Bank_Transfer_Virtual_Account'))

paymentMethod = ('BRI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bank_Transfer_Virtual_Account')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_11_BRI_EPay'))

paymentMethod = ('BRI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_e-Pay BRI')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_12_BRI_Kartu_Kredit'))

paymentMethod = ('BRI ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Kartu Kredit')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_13_BTN_Bank_Transfer_Virtual_Account'))

paymentMethod = ('BTN ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bank_Transfer_Virtual_Account')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_14_BTN_Debit_Online'))

paymentMethod = ('BTN ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_BTN Debit Online')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_15_BTN_Kartu_Kredit'))

paymentMethod = ('BTN ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Kartu Kredit')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_16_BCA_KlikBCA'))

paymentMethod = ('BCA ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_KlikBCA')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_17_BCA_KlikPay'))

paymentMethod = ('BCA ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_BCA KlikPay')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_18_TCash'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Tcash'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_19_Finpay_ATM'))

paymentMethod = ('Finpay ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bayar di ATM Menu Telkom')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_20_Finpay_T_Money'))

paymentMethod = ('Finpay ' + WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bayar via T-Money')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_21_Bank_Transfer'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Bank_Transfer'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_22_Kartu_Kredit'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Mandiri Kartu Kredit'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_23_CIMBNiagaPermata_Debit_Online'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Debit Online'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_24_Kartu_Kredit_Cicilan'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Kartu Kredit Cicilan'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_25_Indomaret'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Indomaret'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_26_Alfamart_Via_Finpay'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Alfamart via Finpay'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_27_Pegadaian_Via_Finpay'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Pegadaian via Finpay'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

WebUI.navigateToUrl(PDPUrl)

WebUI.click(findTestObject('SC_03010001_Product_PDP/span_Blanja sekarang'))

WebUI.selectOptionByValue(findTestObject('SC_04010001_Trade_OrderConfirm/select_- Pilih Pengiriman -'), 'Kurir Standar', 
    true)

WebUI.click(findTestObject('SC_04010001_Trade_OrderConfirm/input_checkOut'))

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/RadioButtonPaymentMethod/rb_28_Pos_Indonesia_Via_Finpay'))

paymentMethod = WebUI.getText(findTestObject('SC_04010002_Trade_PaymentMethod/LabelPaymentMethod/label_Pos Indonesia via Finpay'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(paymentMethod, true)

WebUI.click(findTestObject('SC_04010002_Trade_PaymentMethod/input_checkOut'))

WebUI.navigateToUrl(memberOrderListUrl)

orderNumber = (' - ' + WebUI.getText(findTestObject('SC_02010003_Member_BlanjaanSaya/Label_FirstOrderNumber')))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'(orderNumber, false)

