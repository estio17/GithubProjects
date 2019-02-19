// Generated from C:/Users/estok/Downloads/vsdj autodielna/Autodielna/src\Autodielna.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutodielnaParser}.
 */
public interface AutodielnaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#car}.
	 * @param ctx the parse tree
	 */
	void enterCar(AutodielnaParser.CarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#car}.
	 * @param ctx the parse tree
	 */
	void exitCar(AutodielnaParser.CarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#bodywork}.
	 * @param ctx the parse tree
	 */
	void enterBodywork(AutodielnaParser.BodyworkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#bodywork}.
	 * @param ctx the parse tree
	 */
	void exitBodywork(AutodielnaParser.BodyworkContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#machinery}.
	 * @param ctx the parse tree
	 */
	void enterMachinery(AutodielnaParser.MachineryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#machinery}.
	 * @param ctx the parse tree
	 */
	void exitMachinery(AutodielnaParser.MachineryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AutodielnaParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AutodielnaParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#supplier}.
	 * @param ctx the parse tree
	 */
	void enterSupplier(AutodielnaParser.SupplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#supplier}.
	 * @param ctx the parse tree
	 */
	void exitSupplier(AutodielnaParser.SupplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutodielnaParser#brand}.
	 * @param ctx the parse tree
	 */
	void enterBrand(AutodielnaParser.BrandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutodielnaParser#brand}.
	 * @param ctx the parse tree
	 */
	void exitBrand(AutodielnaParser.BrandContext ctx);
}