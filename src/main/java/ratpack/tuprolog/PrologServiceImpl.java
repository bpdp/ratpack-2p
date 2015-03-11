package ratpack.tuprolog;

import alice.tuprolog.*;

/**
 * Prolog service implementation.
 *
 * @author bpdp
 */
public class PrologServiceImpl implements PrologService {

	Prolog engine = new Prolog();

    public Term getSolution() throws Exception {

		SolveInfo info = engine.solve("append([1],[2,3],X).");

        return info.getSolution();

    }

}
