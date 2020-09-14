import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://computer-database.herokuapp.com/computers')

WebUI.setText(findTestObject('Computer Database/Read Computer Information/input_Play sample application  Computer database_f'), 
    'ARRA')

WebUI.click(findTestObject('Computer Database/Read Computer Information/input_Play sample application  Computer dat_32edac'))

WebUI.setText(findTestObject('Computer Database/Read Computer Information/input_Play sample application  Computer database_f'), 
    '')

WebUI.click(findTestObject('Computer Database/Read Computer Information/input_Play sample application  Computer dat_32edac'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/th_Computer name'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/th_Introduced'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/a_Computer name'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/a_Introduced'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/a_Company'))

WebUI.click(findTestObject('Computer Database/Read Computer Information/th_Company'))

