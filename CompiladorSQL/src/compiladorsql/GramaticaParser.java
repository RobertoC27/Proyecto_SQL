// Generated from C:\Users\u005Cuser\Desktop\proyecto_DB\Proyecto_SQL\CompiladorSQL\src\compiladorsql\Gramatica.g4 by ANTLR 4.4
package compiladorsql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, DATABASE=2, DATABASES=3, DROP=4, USE=5, SHOW=6, ALTER=7, RENAME=8, 
		TO=9, TABLE=10, TABLES=11, CONSTRAINT=12, COLUMN=13, COLUMNS=14, FROM=15, 
		ADD=16, SELECT=17, WHERE=18, INT=19, DATE=20, CHAR=21, FLOAT=22, PRIMARY=23, 
		CHECK=24, REFERENCES=25, FOREIGN=26, KEY=27, INSERT=28, INTO=29, VALUES=30, 
		ORDER=31, SET=32, UPDATE=33, BY=34, ASC=35, DESC=36, AND=37, OR=38, NOT=39, 
		NULO=40, DELETE=41, WH=42, SINGLE_LINE_COMMENT=43, ID=44, NUM=45, COMILLA=46, 
		NUM_DATE=47, CHARACTER=48, DOTCOMMA=49, LPARENT=50, RPARENT=51, COMMA=52, 
		DOT=53, EQ=54, NOTEQ=55, LTHAN=56, EQLTHAN=57, GTHAN=58, EQGTHAN=59, MINUS=60, 
		ASTERISK=61;
	public static final String[] tokenNames = {
		"<INVALID>", "CREATE", "DATABASE", "DATABASES", "DROP", "USE", "SHOW", 
		"ALTER", "RENAME", "TO", "TABLE", "TABLES", "CONSTRAINT", "COLUMN", "COLUMNS", 
		"FROM", "ADD", "SELECT", "WHERE", "INT", "DATE", "CHAR", "FLOAT", "PRIMARY", 
		"CHECK", "REFERENCES", "FOREIGN", "KEY", "INSERT", "INTO", "VALUES", "ORDER", 
		"SET", "UPDATE", "BY", "ASC", "DESC", "AND", "OR", "NOT", "NULO", "DELETE", 
		"WH", "SINGLE_LINE_COMMENT", "ID", "NUM", "'''", "NUM_DATE", "CHARACTER", 
		"';'", "'('", "')'", "','", "'.'", "'='", "'<>'", "'<'", "'<='", "'>'", 
		"'>='", "'-'", "'*'"
	};
	public static final int
		RULE_sqlProgram = 0, RULE_statement = 1, RULE_dbOperation = 2, RULE_dOperation = 3, 
		RULE_tOperation = 4, RULE_columna = 5, RULE_constraints = 6, RULE_tableAction = 7, 
		RULE_type = 8, RULE_constraint = 9, RULE_references = 10, RULE_exp1 = 11, 
		RULE_exp2 = 12, RULE_exp3 = 13, RULE_exp4 = 14, RULE_exp5 = 15, RULE_unarianFactorExp = 16, 
		RULE_factor = 17, RULE_literal = 18, RULE_exp = 19, RULE_notExp = 20, 
		RULE_orExp = 21, RULE_andExp = 22, RULE_eqExp = 23, RULE_glExp = 24, RULE_relExp = 25, 
		RULE_insert = 26, RULE_value = 27, RULE_nullo = 28, RULE_entero = 29, 
		RULE_decimal = 30, RULE_fecha = 31, RULE_nUM_YEAR = 32, RULE_nUM_MONTH = 33, 
		RULE_nUM_DAY = 34, RULE_character = 35, RULE_update = 36, RULE_asignacion = 37, 
		RULE_cond = 38, RULE_delete = 39, RULE_query = 40, RULE_column = 41, RULE_orderBy = 42, 
		RULE_expression = 43;
	public static final String[] ruleNames = {
		"sqlProgram", "statement", "dbOperation", "dOperation", "tOperation", 
		"columna", "constraints", "tableAction", "type", "constraint", "references", 
		"exp1", "exp2", "exp3", "exp4", "exp5", "unarianFactorExp", "factor", 
		"literal", "exp", "notExp", "orExp", "andExp", "eqExp", "glExp", "relExp", 
		"insert", "value", "nullo", "entero", "decimal", "fecha", "nUM_YEAR", 
		"nUM_MONTH", "nUM_DAY", "character", "update", "asignacion", "cond", "delete", 
		"query", "column", "orderBy", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SqlProgramContext extends ParserRuleContext {
		public TerminalNode DOTCOMMA(int i) {
			return getToken(GramaticaParser.DOTCOMMA, i);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> DOTCOMMA() { return getTokens(GramaticaParser.DOTCOMMA); }
		public SqlProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSqlProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSqlProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSqlProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlProgramContext sqlProgram() throws RecognitionException {
		SqlProgramContext _localctx = new SqlProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlProgram);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); statement();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89); match(DOTCOMMA);
					setState(90); statement();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(97);
			_la = _input.LA(1);
			if (_la==DOTCOMMA) {
				{
				setState(96); match(DOTCOMMA);
				}
			}

			setState(99); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DOperationContext dOperation() {
			return getRuleContext(DOperationContext.class,0);
		}
		public TOperationContext tOperation() {
			return getRuleContext(TOperationContext.class,0);
		}
		public DbOperationContext dbOperation() {
			return getRuleContext(DbOperationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); dbOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); tOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); dOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbOperationContext extends ParserRuleContext {
		public DbOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbOperation; }
	 
		public DbOperationContext() { }
		public void copyFrom(DbOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsarDBContext extends DbOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaParser.DATABASE, 0); }
		public TerminalNode USE() { return getToken(GramaticaParser.USE, 0); }
		public UsarDBContext(DbOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterUsarDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitUsarDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitUsarDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MostrarDBContext extends DbOperationContext {
		public TerminalNode SHOW() { return getToken(GramaticaParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(GramaticaParser.DATABASES, 0); }
		public MostrarDBContext(DbOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMostrarDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMostrarDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMostrarDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterarDBContext extends DbOperationContext {
		public TerminalNode RENAME() { return getToken(GramaticaParser.RENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode DATABASE() { return getToken(GramaticaParser.DATABASE, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaParser.ALTER, 0); }
		public AlterarDBContext(DbOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAlterarDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAlterarDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAlterarDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrearDBContext extends DbOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public CrearDBContext(DbOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCrearDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCrearDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCrearDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EliminarDBContext extends DbOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaParser.DATABASE, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public EliminarDBContext(DbOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEliminarDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEliminarDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEliminarDB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbOperationContext dbOperation() throws RecognitionException {
		DbOperationContext _localctx = new DbOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dbOperation);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case CREATE:
				_localctx = new CrearDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(CREATE);
				setState(107); match(DATABASE);
				setState(108); match(ID);
				}
				break;
			case DROP:
				_localctx = new EliminarDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(DROP);
				setState(110); match(DATABASE);
				setState(111); match(ID);
				}
				break;
			case USE:
				_localctx = new UsarDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(USE);
				setState(113); match(DATABASE);
				setState(114); match(ID);
				}
				break;
			case SHOW:
				_localctx = new MostrarDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(SHOW);
				setState(116); match(DATABASES);
				}
				break;
			case ALTER:
				_localctx = new AlterarDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117); match(ALTER);
				setState(118); match(DATABASE);
				setState(119); match(ID);
				setState(120); match(RENAME);
				setState(121); match(TO);
				setState(122); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DOperationContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public DOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DOperationContext dOperation() throws RecognitionException {
		DOperationContext _localctx = new DOperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dOperation);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(127); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(128); query();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TOperationContext extends ParserRuleContext {
		public TOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tOperation; }
	 
		public TOperationContext() { }
		public void copyFrom(TOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MostrarTablasTBContext extends TOperationContext {
		public TerminalNode SHOW() { return getToken(GramaticaParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(GramaticaParser.TABLES, 0); }
		public MostrarTablasTBContext(TOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMostrarTablasTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMostrarTablasTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMostrarTablasTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterarTBContext extends TOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode ALTER() { return getToken(GramaticaParser.ALTER, 0); }
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(GramaticaParser.TABLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public AlterarTBContext(TOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAlterarTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAlterarTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAlterarTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrearTBContext extends TOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public TerminalNode TABLE() { return getToken(GramaticaParser.TABLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public CrearTBContext(TOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCrearTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCrearTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCrearTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EliminarTBContext extends TOperationContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaParser.TABLE, 0); }
		public EliminarTBContext(TOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEliminarTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEliminarTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEliminarTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MostrarColumnasTBContext extends TOperationContext {
		public TerminalNode SHOW() { return getToken(GramaticaParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode COLUMNS() { return getToken(GramaticaParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
		public MostrarColumnasTBContext(TOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMostrarColumnasTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMostrarColumnasTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMostrarColumnasTB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TOperationContext tOperation() throws RecognitionException {
		TOperationContext _localctx = new TOperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tOperation);
		int _la;
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CrearTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(CREATE);
				setState(132); match(TABLE);
				setState(133); match(ID);
				setState(134); match(LPARENT);
				setState(135); columna();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136); match(COMMA);
					setState(137); columna();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(143); constraints();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); match(RPARENT);
				}
				break;
			case 2:
				_localctx = new AlterarTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(ALTER);
				setState(152); match(TABLE);
				setState(153); match(ID);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154); tableAction();
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(155); match(COMMA);
						setState(156); tableAction();
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DROP) | (1L << RENAME) | (1L << ADD))) != 0) );
				}
				break;
			case 3:
				_localctx = new EliminarTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166); match(DROP);
				setState(167); match(TABLE);
				setState(168); match(ID);
				}
				break;
			case 4:
				_localctx = new MostrarTablasTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169); match(SHOW);
				setState(170); match(TABLES);
				}
				break;
			case 5:
				_localctx = new MostrarColumnasTBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171); match(SHOW);
				setState(172); match(COLUMNS);
				setState(173); match(FROM);
				setState(174); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(ID);
			setState(178); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintsContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT(int i) {
			return getToken(GramaticaParser.CONSTRAINT, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<TerminalNode> CONSTRAINT() { return getTokens(GramaticaParser.CONSTRAINT); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180); match(CONSTRAINT);
			setState(181); constraint();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182); match(COMMA);
					setState(183); match(CONSTRAINT);
					setState(184); constraint();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableActionContext extends ParserRuleContext {
		public TableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAction; }
	 
		public TableActionContext() { }
		public void copyFrom(TableActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddColumnTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaParser.COLUMN, 0); }
		public TerminalNode ADD() { return getToken(GramaticaParser.ADD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public AddColumnTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAddColumnTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAddColumnTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAddColumnTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintTBContext extends TableActionContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GramaticaParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaParser.CONSTRAINT, 0); }
		public AddConstraintTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAddConstraintTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAddConstraintTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAddConstraintTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public DropColumnTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDropColumnTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDropColumnTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDropColumnTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnTBContext extends TableActionContext {
		public TerminalNode RENAME() { return getToken(GramaticaParser.RENAME, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public RenameColumnTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRenameColumnTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRenameColumnTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRenameColumnTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConstraintTBContext extends TableActionContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaParser.CONSTRAINT, 0); }
		public DropConstraintTBContext(TableActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDropConstraintTB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDropConstraintTB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDropConstraintTB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableActionContext tableAction() throws RecognitionException {
		TableActionContext _localctx = new TableActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableAction);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AddColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(ADD);
				setState(191); match(COLUMN);
				setState(192); match(ID);
				setState(193); type();
				setState(196);
				switch (_input.LA(1)) {
				case CONSTRAINT:
					{
					setState(194); constraints();
					}
					break;
				case EOF:
				case DROP:
				case RENAME:
				case ADD:
				case DOTCOMMA:
				case COMMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(ADD);
				setState(199); match(CONSTRAINT);
				setState(200); constraint();
				}
				break;
			case 3:
				_localctx = new DropColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201); match(DROP);
				setState(202); match(COLUMN);
				setState(203); match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintTBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204); match(DROP);
				setState(205); match(CONSTRAINT);
				setState(206); match(ID);
				}
				break;
			case 5:
				_localctx = new RenameColumnTBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207); match(RENAME);
				setState(208); match(TO);
				setState(209); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoDAteContext extends TypeContext {
		public TerminalNode DATE() { return getToken(GramaticaParser.DATE, 0); }
		public TipoDAteContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoDAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoDAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoDAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(GramaticaParser.FLOAT, 0); }
		public TipoFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoEnteroContext extends TypeContext {
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TipoEnteroContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoEntero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoCharContext extends TypeContext {
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
		public TipoCharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213); match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new TipoDAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214); match(DATE);
				}
				break;
			case CHAR:
				_localctx = new TipoCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215); match(CHAR);
				setState(216); match(LPARENT);
				setState(217); match(NUM);
				setState(218); match(RPARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstraintPKContext extends ConstraintContext {
		public TerminalNode PRIMARY() { return getToken(GramaticaParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(GramaticaParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ConstraintPKContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstraintPK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstraintPK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstraintPK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstraintCheckContext extends ConstraintContext {
		public TerminalNode CHECK() { return getToken(GramaticaParser.CHECK, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ConstraintCheckContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstraintCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstraintCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstraintCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstraintFKContext extends ConstraintContext {
		public TerminalNode KEY() { return getToken(GramaticaParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(GramaticaParser.FOREIGN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ConstraintFKContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstraintFK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstraintFK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstraintFK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constraint);
		int _la;
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ConstraintPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); match(ID);
				setState(222); match(PRIMARY);
				setState(223); match(KEY);
				setState(224); match(LPARENT);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(225); match(ID);
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(226); match(COMMA);
						setState(227); match(ID);
						}
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238); match(RPARENT);
				}
				break;
			case 2:
				_localctx = new ConstraintFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(ID);
				setState(240); match(FOREIGN);
				setState(241); match(KEY);
				setState(242); match(LPARENT);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(243); match(ID);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(244); match(COMMA);
						setState(245); match(ID);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256); match(RPARENT);
				setState(257); references();
				}
				break;
			case 3:
				_localctx = new ConstraintCheckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258); match(ID);
				setState(259); match(CHECK);
				{
				setState(260); exp1();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode REFERENCES() { return getToken(GramaticaParser.REFERENCES, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(REFERENCES);
			setState(264); match(ID);
			setState(280);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(265); match(LPARENT);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(266); match(ID);
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(267); match(COMMA);
						setState(268); match(ID);
						}
						}
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279); match(RPARENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp1Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); exp2(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		return exp2(0);
	}

	private Exp2Context exp2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp2Context _localctx = new Exp2Context(_ctx, _parentState);
		Exp2Context _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288); andExp();
					setState(289); exp3(0);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		return exp3(0);
	}

	private Exp3Context exp3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp3Context _localctx = new Exp3Context(_ctx, _parentState);
		Exp3Context _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(299);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(300); orExp();
					setState(301); exp4(0);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp4Context extends ParserRuleContext {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		return exp4(0);
	}

	private Exp4Context exp4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp4Context _localctx = new Exp4Context(_ctx, _parentState);
		Exp4Context _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(309); exp5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(311);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(312); eqExp();
					setState(313); exp5(0);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp5Context extends ParserRuleContext {
		public UnarianFactorExpContext unarianFactorExp() {
			return getRuleContext(UnarianFactorExpContext.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public GlExpContext glExp() {
			return getRuleContext(GlExpContext.class,0);
		}
		public Exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp5Context exp5() throws RecognitionException {
		return exp5(0);
	}

	private Exp5Context exp5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp5Context _localctx = new Exp5Context(_ctx, _parentState);
		Exp5Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321); unarianFactorExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp5);
					setState(323);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(324); glExp();
					setState(325); unarianFactorExp();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnarianFactorExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnarianFactorExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarianFactorExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterUnarianFactorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitUnarianFactorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitUnarianFactorExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarianFactorExpContext unarianFactorExp() throws RecognitionException {
		UnarianFactorExpContext _localctx = new UnarianFactorExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unarianFactorExp);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); match(NOT);
				setState(333); factor();
				}
				break;
			case NULO:
			case ID:
			case NUM:
			case NUM_DATE:
			case CHARACTER:
			case LPARENT:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(334); factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case NULO:
			case NUM:
			case NUM_DATE:
			case CHARACTER:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); literal();
				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); match(LPARENT);
				setState(339); exp1();
				setState(340); match(RPARENT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); match(ID);
				setState(345);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(343); match(DOT);
					setState(344); match(ID);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public NotExpContext notExp() {
			return getRuleContext(NotExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); andExp();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); orExp();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); notExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaParser.NOT, 0); }
		public NotExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpContext notExp() throws RecognitionException {
		NotExpContext _localctx = new NotExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public OrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpContext orExp() throws RecognitionException {
		OrExpContext _localctx = new OrExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GramaticaParser.AND, 0); }
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqExpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(GramaticaParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(GramaticaParser.NOTEQ, 0); }
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		EqExpContext _localctx = new EqExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eqExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlExpContext extends ParserRuleContext {
		public TerminalNode EQGTHAN() { return getToken(GramaticaParser.EQGTHAN, 0); }
		public TerminalNode LTHAN() { return getToken(GramaticaParser.LTHAN, 0); }
		public TerminalNode EQLTHAN() { return getToken(GramaticaParser.EQLTHAN, 0); }
		public TerminalNode GTHAN() { return getToken(GramaticaParser.GTHAN, 0); }
		public GlExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterGlExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitGlExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitGlExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlExpContext glExp() throws RecognitionException {
		GlExpContext _localctx = new GlExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_glExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTHAN) | (1L << EQLTHAN) | (1L << GTHAN) | (1L << EQGTHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpContext extends ParserRuleContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public GlExpContext glExp() {
			return getRuleContext(GlExpContext.class,0);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relExp);
		try {
			setState(368);
			switch (_input.LA(1)) {
			case EQ:
			case NOTEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); eqExp();
				}
				break;
			case LTHAN:
			case EQLTHAN:
			case GTHAN:
			case EQGTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(367); glExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public List<TerminalNode> LPARENT() { return getTokens(GramaticaParser.LPARENT); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode VALUES() { return getToken(GramaticaParser.VALUES, 0); }
		public List<TerminalNode> RPARENT() { return getTokens(GramaticaParser.RPARENT); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode INTO() { return getToken(GramaticaParser.INTO, 0); }
		public TerminalNode RPARENT(int i) {
			return getToken(GramaticaParser.RPARENT, i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode LPARENT(int i) {
			return getToken(GramaticaParser.LPARENT, i);
		}
		public TerminalNode INSERT() { return getToken(GramaticaParser.INSERT, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(INSERT);
			setState(371); match(INTO);
			setState(372); match(ID);
			setState(388);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(373); match(LPARENT);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(374); match(ID);
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(375); match(COMMA);
						setState(376); match(ID);
						}
						}
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387); match(RPARENT);
				}
			}

			setState(390); match(VALUES);
			setState(391); match(LPARENT);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULO) | (1L << NUM) | (1L << NUM_DATE) | (1L << CHARACTER) | (1L << MINUS))) != 0)) {
				{
				{
				setState(392); value();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393); match(COMMA);
					setState(394); value();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405); match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public NulloContext nullo() {
			return getRuleContext(NulloContext.class,0);
		}
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408); decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409); fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410); character();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411); nullo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NulloContext extends ParserRuleContext {
		public TerminalNode NULO() { return getToken(GramaticaParser.NULO, 0); }
		public NulloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNullo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNullo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNullo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NulloContext nullo() throws RecognitionException {
		NulloContext _localctx = new NulloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nullo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(NULO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(416); match(MINUS);
				}
			}

			setState(419); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); entero();
			setState(422); match(DOT);
			setState(423); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FechaContext extends ParserRuleContext {
		public TerminalNode NUM_DATE() { return getToken(GramaticaParser.NUM_DATE, 0); }
		public FechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFecha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FechaContext fecha() throws RecognitionException {
		FechaContext _localctx = new FechaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(NUM_DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NUM_YEARContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NUM_YEARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nUM_YEAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNUM_YEAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNUM_YEAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNUM_YEAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NUM_YEARContext nUM_YEAR() throws RecognitionException {
		NUM_YEARContext _localctx = new NUM_YEARContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nUM_YEAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NUM_MONTHContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NUM_MONTHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nUM_MONTH; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNUM_MONTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNUM_MONTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNUM_MONTH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NUM_MONTHContext nUM_MONTH() throws RecognitionException {
		NUM_MONTHContext _localctx = new NUM_MONTHContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nUM_MONTH);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NUM_DAYContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NUM_DAYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nUM_DAY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNUM_DAY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNUM_DAY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNUM_DAY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NUM_DAYContext nUM_DAY() throws RecognitionException {
		NUM_DAYContext _localctx = new NUM_DAYContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nUM_DAY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(GramaticaParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(CHARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode UPDATE() { return getToken(GramaticaParser.UPDATE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode SET() { return getToken(GramaticaParser.SET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(UPDATE);
			setState(436); match(ID);
			setState(437); match(SET);
			setState(438); asignacion();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439); match(COMMA);
				setState(440); asignacion();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(446); match(WHERE);
				setState(447); exp1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GramaticaParser.EQ, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(ID);
			setState(451); match(EQ);
			setState(452); literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(454); expression();
			setState(455); relExp();
			setState(458);
			switch (_input.LA(1)) {
			case NULO:
			case NUM:
			case NUM_DATE:
			case CHARACTER:
			case MINUS:
				{
				setState(456); value();
				}
				break;
			case ID:
				{
				setState(457); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(460); exp();
				setState(461); cond();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DELETE() { return getToken(GramaticaParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(DELETE);
			setState(466); match(FROM);
			setState(467); match(ID);
			setState(470);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(468); match(WHERE);
				setState(469); exp1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public OrderByContext orderBy(int i) {
			return getRuleContext(OrderByContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode ASTERISK() { return getToken(GramaticaParser.ASTERISK, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public List<OrderByContext> orderBy() {
			return getRuleContexts(OrderByContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode ORDER() { return getToken(GramaticaParser.ORDER, 0); }
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(GramaticaParser.SELECT, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode BY() { return getToken(GramaticaParser.BY, 0); }
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(SELECT);
			setState(482);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(473); match(ASTERISK);
				}
				break;
			case ID:
				{
				setState(474); column();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(475); match(COMMA);
					setState(476); column();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(484); match(FROM);
			setState(485); match(ID);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(486); match(COMMA);
				setState(487); match(ID);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(493); match(WHERE);
				setState(494); exp1();
				}
			}

			setState(507);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(497); match(ORDER);
				setState(498); match(BY);
				setState(499); orderBy();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(500); match(COMMA);
					setState(501); orderBy();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); match(ID);
			setState(512);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(510); match(DOT);
				setState(511); match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(GramaticaParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(GramaticaParser.DESC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); expression();
			setState(516);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); match(ID);
			setState(521);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(519); match(DOT);
				setState(520); match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 13: return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 14: return exp4_sempred((Exp4Context)_localctx, predIndex);
		case 15: return exp5_sempred((Exp5Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp5_sempred(Exp5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp4_sempred(Exp4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp3_sempred(Exp3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u020e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\5\2d\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\7\6\u0093\n\6\f"+
		"\6\16\6\u0096\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16"+
		"\6\u00a3\13\6\6\6\u00a5\n\6\r\6\16\6\u00a6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00b2\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00bc\n\b\f"+
		"\b\16\b\u00bf\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d5\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00de\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e7\n\13"+
		"\f\13\16\13\u00ea\13\13\7\13\u00ec\n\13\f\13\16\13\u00ef\13\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13"+
		"\13\7\13\u00fe\n\13\f\13\16\13\u0101\13\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0108\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0110\n\f\f\f\16\f\u0113\13"+
		"\f\7\f\u0115\n\f\f\f\16\f\u0118\13\f\3\f\5\f\u011b\n\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0132\n\17\f\17\16\17\u0135\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013e\n\20\f\20\16\20\u0141"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u014a\n\21\f\21\16\21\u014d"+
		"\13\21\3\22\3\22\3\22\5\22\u0152\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u015c\n\23\5\23\u015e\n\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0165\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\5\33\u0173\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u017c\n\34\f"+
		"\34\16\34\u017f\13\34\7\34\u0181\n\34\f\34\16\34\u0184\13\34\3\34\5\34"+
		"\u0187\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u018e\n\34\f\34\16\34\u0191"+
		"\13\34\7\34\u0193\n\34\f\34\16\34\u0196\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u019f\n\35\3\36\3\36\3\37\5\37\u01a4\n\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\7&\u01bc"+
		"\n&\f&\16&\u01bf\13&\3&\3&\5&\u01c3\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5("+
		"\u01cd\n(\3(\3(\3(\5(\u01d2\n(\3)\3)\3)\3)\3)\5)\u01d9\n)\3*\3*\3*\3*"+
		"\3*\7*\u01e0\n*\f*\16*\u01e3\13*\5*\u01e5\n*\3*\3*\3*\3*\7*\u01eb\n*\f"+
		"*\16*\u01ee\13*\3*\3*\5*\u01f2\n*\3*\3*\3*\3*\3*\7*\u01f9\n*\f*\16*\u01fc"+
		"\13*\5*\u01fe\n*\3+\3+\3+\5+\u0203\n+\3,\3,\5,\u0207\n,\3-\3-\3-\5-\u020c"+
		"\n-\3-\2\6\32\34\36 .\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVX\2\5\3\289\3\2:=\3\2%&\u0229\2Z\3\2\2\2\4"+
		"j\3\2\2\2\6}\3\2\2\2\b\u0083\3\2\2\2\n\u00b1\3\2\2\2\f\u00b3\3\2\2\2\16"+
		"\u00b6\3\2\2\2\20\u00d4\3\2\2\2\22\u00dd\3\2\2\2\24\u0107\3\2\2\2\26\u0109"+
		"\3\2\2\2\30\u011c\3\2\2\2\32\u011e\3\2\2\2\34\u012a\3\2\2\2\36\u0136\3"+
		"\2\2\2 \u0142\3\2\2\2\"\u0151\3\2\2\2$\u015d\3\2\2\2&\u015f\3\2\2\2(\u0164"+
		"\3\2\2\2*\u0166\3\2\2\2,\u0168\3\2\2\2.\u016a\3\2\2\2\60\u016c\3\2\2\2"+
		"\62\u016e\3\2\2\2\64\u0172\3\2\2\2\66\u0174\3\2\2\28\u019e\3\2\2\2:\u01a0"+
		"\3\2\2\2<\u01a3\3\2\2\2>\u01a7\3\2\2\2@\u01ab\3\2\2\2B\u01ad\3\2\2\2D"+
		"\u01af\3\2\2\2F\u01b1\3\2\2\2H\u01b3\3\2\2\2J\u01b5\3\2\2\2L\u01c4\3\2"+
		"\2\2N\u01c8\3\2\2\2P\u01d3\3\2\2\2R\u01da\3\2\2\2T\u01ff\3\2\2\2V\u0204"+
		"\3\2\2\2X\u0208\3\2\2\2Z_\5\4\3\2[\\\7\63\2\2\\^\5\4\3\2][\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\7\63\2\2cb\3\2\2\2cd"+
		"\3\2\2\2de\3\2\2\2ef\7\2\2\3f\3\3\2\2\2gk\5\6\4\2hk\5\n\6\2ik\5\b\5\2"+
		"jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\5\3\2\2\2lm\7\3\2\2mn\7\4\2\2n~\7.\2\2"+
		"op\7\6\2\2pq\7\4\2\2q~\7.\2\2rs\7\7\2\2st\7\4\2\2t~\7.\2\2uv\7\b\2\2v"+
		"~\7\5\2\2wx\7\t\2\2xy\7\4\2\2yz\7.\2\2z{\7\n\2\2{|\7\13\2\2|~\7.\2\2}"+
		"l\3\2\2\2}o\3\2\2\2}r\3\2\2\2}u\3\2\2\2}w\3\2\2\2~\7\3\2\2\2\177\u0084"+
		"\5\66\34\2\u0080\u0084\5J&\2\u0081\u0084\5P)\2\u0082\u0084\5R*\2\u0083"+
		"\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\t\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\7\f\2\2\u0087\u0088"+
		"\7.\2\2\u0088\u0089\7\64\2\2\u0089\u008e\5\f\7\2\u008a\u008b\7\66\2\2"+
		"\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0094\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\5\16\b\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\65\2\2\u0098\u00b2\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\7"+
		"\f\2\2\u009b\u00a4\7.\2\2\u009c\u00a1\5\20\t\2\u009d\u009e\7\66\2\2\u009e"+
		"\u00a0\5\20\t\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u009c\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00b2\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7\f\2\2\u00aa"+
		"\u00b2\7.\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00b2\7\r\2\2\u00ad\u00ae\7\b"+
		"\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b2\7.\2\2\u00b1"+
		"\u0085\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b5"+
		"\5\22\n\2\u00b5\r\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00bd\5\24\13\2\u00b8"+
		"\u00b9\7\66\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bc\5\24\13\2\u00bb\u00b8"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\17\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\7\17"+
		"\2\2\u00c2\u00c3\7.\2\2\u00c3\u00c6\5\22\n\2\u00c4\u00c7\5\16\b\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00d5\3\2"+
		"\2\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00d5\5\24\13\2\u00cb"+
		"\u00cc\7\6\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00d5\7.\2\2\u00ce\u00cf\7\6"+
		"\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d5\7.\2\2\u00d1\u00d2\7\n\2\2\u00d2"+
		"\u00d3\7\13\2\2\u00d3\u00d5\7.\2\2\u00d4\u00c0\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5"+
		"\21\3\2\2\2\u00d6\u00de\7\25\2\2\u00d7\u00de\7\30\2\2\u00d8\u00de\7\26"+
		"\2\2\u00d9\u00da\7\27\2\2\u00da\u00db\7\64\2\2\u00db\u00dc\7/\2\2\u00dc"+
		"\u00de\7\65\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3"+
		"\2\2\2\u00dd\u00d9\3\2\2\2\u00de\23\3\2\2\2\u00df\u00e0\7.\2\2\u00e0\u00e1"+
		"\7\31\2\2\u00e1\u00e2\7\35\2\2\u00e2\u00ed\7\64\2\2\u00e3\u00e8\7.\2\2"+
		"\u00e4\u00e5\7\66\2\2\u00e5\u00e7\7.\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u0108\7\65\2\2\u00f1\u00f2\7.\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00f4\7"+
		"\35\2\2\u00f4\u00ff\7\64\2\2\u00f5\u00fa\7.\2\2\u00f6\u00f7\7\66\2\2\u00f7"+
		"\u00f9\7.\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\65\2\2\u0103"+
		"\u0108\5\26\f\2\u0104\u0105\7.\2\2\u0105\u0106\7\32\2\2\u0106\u0108\5"+
		"\30\r\2\u0107\u00df\3\2\2\2\u0107\u00f1\3\2\2\2\u0107\u0104\3\2\2\2\u0108"+
		"\25\3\2\2\2\u0109\u010a\7\33\2\2\u010a\u011a\7.\2\2\u010b\u0116\7\64\2"+
		"\2\u010c\u0111\7.\2\2\u010d\u010e\7\66\2\2\u010e\u0110\7.\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\7\65\2\2\u011a\u010b\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\27\3\2\2\2\u011c\u011d\5\32\16\2\u011d\31\3\2\2\2\u011e\u011f"+
		"\b\16\1\2\u011f\u0120\5\34\17\2\u0120\u0127\3\2\2\2\u0121\u0122\f\4\2"+
		"\2\u0122\u0123\5.\30\2\u0123\u0124\5\34\17\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\33\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\b\17\1\2\u012b\u012c"+
		"\5\36\20\2\u012c\u0133\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\5,\27\2"+
		"\u012f\u0130\5\36\20\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\35\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\b\20\1\2\u0137\u0138\5 \21\2\u0138\u013f\3"+
		"\2\2\2\u0139\u013a\f\4\2\2\u013a\u013b\5\60\31\2\u013b\u013c\5 \21\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\37\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143"+
		"\b\21\1\2\u0143\u0144\5\"\22\2\u0144\u014b\3\2\2\2\u0145\u0146\f\4\2\2"+
		"\u0146\u0147\5\62\32\2\u0147\u0148\5\"\22\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0145\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c!\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7)\2\2\u014f\u0152"+
		"\5$\23\2\u0150\u0152\5$\23\2\u0151\u014e\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"#\3\2\2\2\u0153\u015e\5&\24\2\u0154\u0155\7\64\2\2\u0155\u0156\5\30\r"+
		"\2\u0156\u0157\7\65\2\2\u0157\u015e\3\2\2\2\u0158\u015b\7.\2\2\u0159\u015a"+
		"\7\67\2\2\u015a\u015c\7.\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0158\3\2"+
		"\2\2\u015e%\3\2\2\2\u015f\u0160\58\35\2\u0160\'\3\2\2\2\u0161\u0165\5"+
		".\30\2\u0162\u0165\5,\27\2\u0163\u0165\5*\26\2\u0164\u0161\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165)\3\2\2\2\u0166\u0167\7)\2\2\u0167"+
		"+\3\2\2\2\u0168\u0169\7(\2\2\u0169-\3\2\2\2\u016a\u016b\7\'\2\2\u016b"+
		"/\3\2\2\2\u016c\u016d\t\2\2\2\u016d\61\3\2\2\2\u016e\u016f\t\3\2\2\u016f"+
		"\63\3\2\2\2\u0170\u0173\5\60\31\2\u0171\u0173\5\62\32\2\u0172\u0170\3"+
		"\2\2\2\u0172\u0171\3\2\2\2\u0173\65\3\2\2\2\u0174\u0175\7\36\2\2\u0175"+
		"\u0176\7\37\2\2\u0176\u0186\7.\2\2\u0177\u0182\7\64\2\2\u0178\u017d\7"+
		".\2\2\u0179\u017a\7\66\2\2\u017a\u017c\7.\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0178\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0187\7\65\2\2\u0186\u0177\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7 \2\2\u0189\u0194\7\64\2\2\u018a\u018f\58"+
		"\35\2\u018b\u018c\7\66\2\2\u018c\u018e\58\35\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u018a\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0197\u0198\7\65\2\2\u0198\67\3\2\2\2\u0199\u019f\5<\37\2\u019a\u019f"+
		"\5> \2\u019b\u019f\5@!\2\u019c\u019f\5H%\2\u019d\u019f\5:\36\2\u019e\u0199"+
		"\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f9\3\2\2\2\u01a0\u01a1\7*\2\2\u01a1;\3\2\2\2\u01a2"+
		"\u01a4\7>\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7/\2\2\u01a6=\3\2\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9"+
		"\7\67\2\2\u01a9\u01aa\7/\2\2\u01aa?\3\2\2\2\u01ab\u01ac\7\61\2\2\u01ac"+
		"A\3\2\2\2\u01ad\u01ae\7/\2\2\u01aeC\3\2\2\2\u01af\u01b0\7/\2\2\u01b0E"+
		"\3\2\2\2\u01b1\u01b2\7/\2\2\u01b2G\3\2\2\2\u01b3\u01b4\7\62\2\2\u01b4"+
		"I\3\2\2\2\u01b5\u01b6\7#\2\2\u01b6\u01b7\7.\2\2\u01b7\u01b8\7\"\2\2\u01b8"+
		"\u01bd\5L\'\2\u01b9\u01ba\7\66\2\2\u01ba\u01bc\5L\'\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c2\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7\24\2\2\u01c1\u01c3\5"+
		"\30\r\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3K\3\2\2\2\u01c4\u01c5"+
		"\7.\2\2\u01c5\u01c6\78\2\2\u01c6\u01c7\5&\24\2\u01c7M\3\2\2\2\u01c8\u01c9"+
		"\5X-\2\u01c9\u01cc\5\64\33\2\u01ca\u01cd\58\35\2\u01cb\u01cd\5X-\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d1\3\2\2\2\u01ce\u01cf\5("+
		"\25\2\u01cf\u01d0\5N(\2\u01d0\u01d2\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2O\3\2\2\2\u01d3\u01d4\7+\2\2\u01d4\u01d5\7\21\2\2"+
		"\u01d5\u01d8\7.\2\2\u01d6\u01d7\7\24\2\2\u01d7\u01d9\5\30\r\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9Q\3\2\2\2\u01da\u01e4\7\23\2\2\u01db"+
		"\u01e5\7?\2\2\u01dc\u01e1\5T+\2\u01dd\u01de\7\66\2\2\u01de\u01e0\5T+\2"+
		"\u01df\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4"+
		"\u01dc\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\21\2\2\u01e7\u01ec\7"+
		".\2\2\u01e8\u01e9\7\66\2\2\u01e9\u01eb\7.\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\3\2"+
		"\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\24\2\2\u01f0\u01f2\5\30\r\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fd\3\2\2\2\u01f3\u01f4\7!"+
		"\2\2\u01f4\u01f5\7$\2\2\u01f5\u01fa\5V,\2\u01f6\u01f7\7\66\2\2\u01f7\u01f9"+
		"\5V,\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01f3\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01feS\3\2\2\2\u01ff\u0202\7.\2\2\u0200\u0201"+
		"\7\67\2\2\u0201\u0203\7.\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"U\3\2\2\2\u0204\u0206\5X-\2\u0205\u0207\t\4\2\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207W\3\2\2\2\u0208\u020b\7.\2\2\u0209\u020a\7\67\2\2"+
		"\u020a\u020c\7.\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020cY\3\2"+
		"\2\2\66_cj}\u0083\u008e\u0094\u00a1\u00a6\u00b1\u00bd\u00c6\u00d4\u00dd"+
		"\u00e8\u00ed\u00fa\u00ff\u0107\u0111\u0116\u011a\u0127\u0133\u013f\u014b"+
		"\u0151\u015b\u015d\u0164\u0172\u017d\u0182\u0186\u018f\u0194\u019e\u01a3"+
		"\u01bd\u01c2\u01cc\u01d1\u01d8\u01e1\u01e4\u01ec\u01f1\u01fa\u01fd\u0202"+
		"\u0206\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}