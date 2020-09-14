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

WebUI.click(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/a_Add a new computer'))

WebUI.setText(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/input_Computer name_name'), 'Acer')

WebUI.setText(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/input_Introduced date_introduced'), 
    '2020-10-20')

WebUI.setText(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/input_Discontinued date_discontinued'), 
    'date your place')

WebUI.selectOptionByValue(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/select_-- Choose a company --              _09cfcf'), 
    '3', true)

WebUI.click(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/input_or_btn primary'))

WebUI.click(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/div_Date (yyyy-MM-dd)'))

WebUI.click(findTestObject('Computer Database/OR-006 - Field Discontinued date not allowed to input alpha character/span_Date (yyyy-MM-dd)'))

WebUI.closeBrowser()

