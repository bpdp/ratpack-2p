package ratpack.tuprolog;

import alice.tuprolog.*;

/**
 * Interface for tuprolog engine
 *
 * @author bpdp
 */
public interface PrologService {

    Term getSolution() throws Exception;

}
