package blj.common.report

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class Autoplaced {
	@Keyword
	def AppendToBlanjaAutoplacedReport(String message, Boolean isNewLine){
		String filename = 'Blanja_Autoplaced.txt'
		FileWriter fw = new FileWriter(filename, true)
		if(isNewLine){
			Date currentTime = new Date()
			fw.write((currentTime.toString() + ' - ') + message)
		}
		else{
			fw.write((' - ') + message + '\n')
		}
		fw.close()
	}

	@Keyword
	def SplitPostUniqueAmount(String postText) {
		return postText.substring(0, 3)
	}
}
