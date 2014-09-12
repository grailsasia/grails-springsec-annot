package sample
import grails.plugins.springsecurity.Secured

class ScreenController {

    def publicPage() {
        render "This is a public page"
    }

    @Secured(['IS_AUTHENTICATED_FULLY'])
    def authenticatedPage() {
        render "This is a authenticated only page"
    }

    @Secured(['ROLE_COMMON'])
    def commonPage() {
        render "This is a common role page"
    }

    @Secured(['ROLE_ROYALTY'])
    def royalPage() {
        render "This is a royal role page"
    }

}
