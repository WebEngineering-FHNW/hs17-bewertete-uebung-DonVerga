package challengebook

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ChallengeTimeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    def scaffold = ChallengeTime


    def show(ChallengeTime challengeTime) {
        respond challengeTime
    }

    def create() {
        respond new ChallengeTime(params)
    }

    @Transactional
    def save(ChallengeTime challengeTime) {
        if (challengeTime == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (challengeTime.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond challengeTime.errors, view:'create'
            return
        }

        challengeTime.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'challengeTime.label', default: 'ChallengeTime'), challengeTime.id])
                redirect challengeTime
            }
            '*' { respond challengeTime, [status: CREATED] }
        }
    }

    def edit(ChallengeTime challengeTime) {
        respond challengeTime
    }

    @Transactional
    def update(ChallengeTime challengeTime) {
        if (challengeTime == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (challengeTime.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond challengeTime.errors, view:'edit'
            return
        }

        challengeTime.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'challengeTime.label', default: 'ChallengeTime'), challengeTime.id])
                redirect challengeTime
            }
            '*'{ respond challengeTime, [status: OK] }
        }
    }

    @Transactional
    def delete(ChallengeTime challengeTime) {

        if (challengeTime == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        challengeTime.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'challengeTime.label', default: 'ChallengeTime'), challengeTime.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'challengeTime.label', default: 'ChallengeTime'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

}
