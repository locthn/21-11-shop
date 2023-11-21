import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink product apple iphone new --> navigate to Page product apple-iphone-15-new'

testObj = findTestObject('Object Repository/Page_home/hyperlink_product_apple_iphone_new')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page product apple-iphone-15-new click on label object'

testObj = findTestObject('Object Repository/Page_product/label_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product apple-iphone-15-new click on label object'

testObj = findTestObject('Object Repository/Page_product/label_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page product apple-iphone-15-new click on button object'

testObj = findTestObject('Object Repository/Page_product/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page product apple-iphone-15-new click on hyperlink cart --> navigate to Page cart'

testObj = findTestObject('Object Repository/Page_product/hyperlink_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page cart click on button object --> navigate to Page checkout info'

testObj = findTestObject('Object Repository/Page_cart/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page checkout info click on div object'

testObj = findTestObject('Object Repository/Page_checkout_info/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page checkout info input on input email'

testObj = findTestObject('Object Repository/Page_checkout_info/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_email)

'step 10: At Page checkout info click on input receive marketing info'

testObj = findTestObject('Object Repository/Page_checkout_info/input_receive_marketing_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page checkout info click on button object --> navigate to Page checkout shipping-address'

testObj = findTestObject('Object Repository/Page_checkout_info/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page checkout shipping-address click on input delivery id'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_delivery_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page checkout shipping-address input on input shipping address first name'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_first_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_shipping_address_first_name)

'step 15: At Page checkout shipping-address input on input shipping address last name'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_last_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_shipping_address_last_name)

'step 16: At Page checkout shipping-address input on input shipping address address line 1'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_address_line_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_shipping_address_address_line_1)

'step 17: At Page checkout shipping-address input on input shipping address zip'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_zip')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_shipping_address_zip)

'step 18: At Page checkout shipping-address input on input shipping address city'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_city')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_6_input_shipping_address_city)

'step 19: At Page checkout shipping-address input on input shipping address state'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_state')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_7_input_shipping_address_state)

'step 20: At Page checkout shipping-address select on select shipping address country id'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_shipping_address_country_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByValue(testObj, 'United States', false)

'step 21: At Page checkout shipping-address input on input shipping address phone'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_shipping_address_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_8_input_shipping_address_phone)

'step 22: At Page checkout shipping-address click on input billing address the same'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_the_same')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 23: At Page checkout shipping-address input on input billing address first name'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_first_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_9_input_billing_address_first_name)

'step 24: At Page checkout shipping-address input on input billing address last name'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_last_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_10_input_billing_address_last_name)

'step 25: At Page checkout shipping-address input on input billing address address line 1'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_address_line_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_11_input_billing_address_address_line_1)

'step 26: At Page checkout shipping-address input on input billing address zip'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_zip')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_12_input_billing_address_zip)

'step 27: At Page checkout shipping-address input on input billing address city'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_city')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_13_input_billing_address_city)

'step 28: At Page checkout shipping-address input on input billing address state'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_state')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_14_input_billing_address_state)

'step 29: At Page checkout shipping-address select on select billing address country id'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_billing_address_country_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByIndex(testObj, '168')

'step 30: At Page checkout shipping-address click on button object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 31: Add visual checkpoint at Page checkout shipping-address'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Checkout Shipping Address Page after Providing Shipping and Billing Address_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
