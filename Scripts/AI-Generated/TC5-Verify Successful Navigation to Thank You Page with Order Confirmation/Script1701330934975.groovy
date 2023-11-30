import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page thank-you-8806-4a9e-8e4a-789270127f80'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/97524264-8806-4a9e-8e4a-789270127f80')

'step 2: Add visual checkpoint at Page thank-you-8806-4a9e-8e4a-789270127f80'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Navigation to Thank You Page with Order Confirmation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
