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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://flip.id/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/Email'), 'alanjulian07@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login/Password'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Password'),'12345678')

WebUI.click(findTestObject('Page_Login/btn_MASUK'))

WebUI.click(findTestObject('Page_Beranda/btn_KirimUang'))

WebUI.click(findTestObject('Page_Beranda/btn_KirimUangTanpaVerifikasi'))

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/a_Alan Julian'))

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/a_ Logout'))

WebUI.closeBrowser()

