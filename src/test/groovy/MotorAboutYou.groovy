import geb.Page
import org.openqa.selenium.support.ui.Select

class MotorAboutYou extends Page {
	static url = "https://www.lvgirqp.co.uk/lv_gihm/M_Welcome.jsp?Group=lv"
	
	static at = { title == "LV= Car Insurance - About You"}
	
	static content = {
		postcode { $("input", name: endsWith("POSTCODE")) }
		forename { $("input", name: endsWith("FORENAME1")) }
		surname { $("input", name: endsWith("SURNAME")) }
		phoneNumber { $("input", name: endsWith("EVENING")) }
		postcodeLookupButton (to: MotorAboutYou) { 
			$("button", title: "Find my address")
		}
		selectedAddress {  new Select($("#addressLookup").getElement(0)).getFirstSelectedOption().getText() }
	}
}