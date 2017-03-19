class ApplicationFilters {


    def filters = {
        all(controller: '*', action: '*') {
            before = {
                log.info("GrailsAccessLog at ${new Date()}:${request.getHeader("User-Agent")}  : ${request.getRemoteAddr()} ${params}");
            }
        }
    }
}
