// Generated from C:\Users\juankboix1309\Documents\NetBeansProjects\Proyecto_SQL\CompiladorSQL\src\compiladorsql\Gramatica.g4 by ANTLR 4.2.2
package compiladorsql.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GramaticaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull GramaticaParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull GramaticaParser.UpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tOperation}.
	 * @param ctx the parse tree
	 */
	void enterTOperation(@NotNull GramaticaParser.TOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tOperation}.
	 * @param ctx the parse tree
	 */
	void exitTOperation(@NotNull GramaticaParser.TOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nullo}.
	 * @param ctx the parse tree
	 */
	void enterNullo(@NotNull GramaticaParser.NulloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nullo}.
	 * @param ctx the parse tree
	 */
	void exitNullo(@NotNull GramaticaParser.NulloContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(@NotNull GramaticaParser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(@NotNull GramaticaParser.Exp5Context ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(@NotNull GramaticaParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(@NotNull GramaticaParser.OrderByContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterTableAction(@NotNull GramaticaParser.TableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitTableAction(@NotNull GramaticaParser.TableActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull GramaticaParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull GramaticaParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#notExp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(@NotNull GramaticaParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#notExp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(@NotNull GramaticaParser.NotExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull GramaticaParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull GramaticaParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dOperation}.
	 * @param ctx the parse tree
	 */
	void enterDOperation(@NotNull GramaticaParser.DOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dOperation}.
	 * @param ctx the parse tree
	 */
	void exitDOperation(@NotNull GramaticaParser.DOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull GramaticaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(@NotNull GramaticaParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(@NotNull GramaticaParser.Exp4Context ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull GramaticaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull GramaticaParser.CondContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull GramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull GramaticaParser.AsignacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(@NotNull GramaticaParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(@NotNull GramaticaParser.Exp3Context ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#glExp}.
	 * @param ctx the parse tree
	 */
	void enterGlExp(@NotNull GramaticaParser.GlExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#glExp}.
	 * @param ctx the parse tree
	 */
	void exitGlExp(@NotNull GramaticaParser.GlExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(@NotNull GramaticaParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(@NotNull GramaticaParser.Exp2Context ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull GramaticaParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull GramaticaParser.CharacterContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(@NotNull GramaticaParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(@NotNull GramaticaParser.Exp1Context ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(@NotNull GramaticaParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(@NotNull GramaticaParser.ReferencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dbOperation}.
	 * @param ctx the parse tree
	 */
	void enterDbOperation(@NotNull GramaticaParser.DbOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dbOperation}.
	 * @param ctx the parse tree
	 */
	void exitDbOperation(@NotNull GramaticaParser.DbOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull GramaticaParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull GramaticaParser.DeleteContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull GramaticaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull GramaticaParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void enterFecha(@NotNull GramaticaParser.FechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void exitFecha(@NotNull GramaticaParser.FechaContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(@NotNull GramaticaParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(@NotNull GramaticaParser.ConstraintsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull GramaticaParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull GramaticaParser.EnteroContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#orExp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(@NotNull GramaticaParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#orExp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(@NotNull GramaticaParser.OrExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#unarianFactorExp}.
	 * @param ctx the parse tree
	 */
	void enterUnarianFactorExp(@NotNull GramaticaParser.UnarianFactorExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#unarianFactorExp}.
	 * @param ctx the parse tree
	 */
	void exitUnarianFactorExp(@NotNull GramaticaParser.UnarianFactorExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull GramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull GramaticaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull GramaticaParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull GramaticaParser.DecimalContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(@NotNull GramaticaParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(@NotNull GramaticaParser.RelExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GramaticaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(@NotNull GramaticaParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(@NotNull GramaticaParser.AndExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull GramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull GramaticaParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sqlProgram}.
	 * @param ctx the parse tree
	 */
	void enterSqlProgram(@NotNull GramaticaParser.SqlProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sqlProgram}.
	 * @param ctx the parse tree
	 */
	void exitSqlProgram(@NotNull GramaticaParser.SqlProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull GramaticaParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull GramaticaParser.ColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull GramaticaParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull GramaticaParser.InsertContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(@NotNull GramaticaParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(@NotNull GramaticaParser.EqExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull GramaticaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull GramaticaParser.LiteralContext ctx);
}