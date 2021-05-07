// Generated from Test.g4 by ANTLR 4.5.3
package autogenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Expressions}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(TestParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link TestParser#attrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TestParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TestParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(TestParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TestParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(TestParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(TestParser.MultDivContext ctx);
}