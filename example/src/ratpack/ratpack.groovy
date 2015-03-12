import static ratpack.groovy.Groovy.ratpack

import ratpack.tuprolog.*

ratpack {
	bindings {

		add new TuPrologModule()

	}
    handlers {
        get("test2p") {
            render PrologService.getSolution()
        }
    }
}
