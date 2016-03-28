// Generated from C:\Users\Toshiba_U55\Desktop\UVG\S7\Bases de Datos\P1\Proyecto_SQL\CompiladorSQL\src\compiladorsql\Gramatica.g4 by ANTLR 4.4
package compiladorsql;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull GramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences(@NotNull GramaticaParser.ReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#andExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(@NotNull GramaticaParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTOperation(@NotNull GramaticaParser.TOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dbOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbOperation(@NotNull GramaticaParser.DbOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull GramaticaParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(@NotNull GramaticaParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(@NotNull GramaticaParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(@NotNull GramaticaParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#nullo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullo(@NotNull GramaticaParser.NulloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull GramaticaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(@NotNull GramaticaParser.ConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#notExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(@NotNull GramaticaParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(@NotNull GramaticaParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull GramaticaParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull GramaticaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(@NotNull GramaticaParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(@NotNull GramaticaParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp5(@NotNull GramaticaParser.Exp5Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull GramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp4(@NotNull GramaticaParser.Exp4Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp3(@NotNull GramaticaParser.Exp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(@NotNull GramaticaParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(@NotNull GramaticaParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull GramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull GramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull GramaticaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOperation(@NotNull GramaticaParser.DOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#unarianFactorExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarianFactorExp(@NotNull GramaticaParser.UnarianFactorExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull GramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#glExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlExp(@NotNull GramaticaParser.GlExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull GramaticaParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(@NotNull GramaticaParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#orExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(@NotNull GramaticaParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sqlProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlProgram(@NotNull GramaticaParser.SqlProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFecha(@NotNull GramaticaParser.FechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAction(@NotNull GramaticaParser.TableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull GramaticaParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(@NotNull GramaticaParser.DecimalContext ctx);
}