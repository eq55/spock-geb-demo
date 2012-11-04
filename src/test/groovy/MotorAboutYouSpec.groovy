import geb.spock.GebSpec

class MotorAboutYouSpec extends GebSpec {
	
	def "I can read the Motor About You Page"() {
		given:
		to MotorAboutYou
		expect:
		waitFor (10) {at MotorAboutYou }
	}
	
	def "I can use Postcode Lookup on the Motor About You Page"() {
		given:
		to MotorAboutYou
		waitFor (10) {at MotorAboutYou }
		and:
		postcode.value("BH1 2NF")
		when:
		postcodeLookupButton.click()
		then:
		selectedAddress.contains("LIVERPOOL VICTORIA FRIENDLY SOCIETY LTD COUNTY GATES")
	}
	
}