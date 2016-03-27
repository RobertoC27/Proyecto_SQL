// Generated from C:\Users\juankboix1309\Documents\NetBeansProjects\Proyecto_SQL\CompiladorSQL\src\compiladorsql\Gramatica.g4 by ANTLR 4.2.2
package compiladorsql.grammar;
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, DATABASE=2, DATABASES=3, DROP=4, USE=5, SHOW=6, ALTER=7, RENAME=8, 
		TO=9, TABLE=10, TABLES=11, CONSTRAINT=12, COLUMN=13, COLUMNS=14, FROM=15, 
		ADD=16, SELECT=17, WHERE=18, INT=19, DATE=20, CHAR=21, FLOAT=22, PRIMARY=23, 
		CHECK=24, REFERENCES=25, FOREIGN=26, KEY=27, INSERT=28, INTO=29, VALUES=30, 
		ORDER=31, SET=32, UPDATE=33, BY=34, ASC=35, DESC=36, AND=37, OR=38, NOT=39, 
		NULO=40, DELETE=41, WH=42, SINGLE_LINE_COMMENT=43, ID=44, NUM=45, NUM_DATE=46, 
		CHARACTER=47, DOTCOMMA=48, LPARENT=49, RPARENT=50, COMMA=51, DOT=52, EQ=53, 
		NOTEQ=54, LTHAN=55, EQLTHAN=56, GTHAN=57, EQGTHAN=58, MINUS=59, ASTERISK=60;
	public static final String[] tokenNames = {
		"<INVALID>", "CREATE", "DATABASE", "DATABASES", "DROP", "USE", "SHOW", 
		"ALTER", "RENAME", "TO", "TABLE", "TABLES", "CONSTRAINT", "COLUMN", "COLUMNS", 
		"FROM", "ADD", "SELECT", "WHERE", "INT", "DATE", "CHAR", "FLOAT", "PRIMARY", 
		"CHECK", "REFERENCES", "FOREIGN", "KEY", "INSERT", "INTO", "VALUES", "ORDER", 
		"SET", "UPDATE", "BY", "ASC", "DESC", "AND", "OR", "NOT", "NULO", "DELETE", 
		"WH", "SINGLE_LINE_COMMENT", "ID", "NUM", "NUM_DATE", "CHARACTER", "';'", 
		"'('", "')'", "','", "'.'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", 
		"'-'", "'*'"
	};
	public static final int
		RULE_sqlProgram = 0, RULE_statement = 1, RULE_dbOperation = 2, RULE_dOperation = 3, 
		RULE_tOperation = 4, RULE_constraints = 5, RULE_tableAction = 6, RULE_type = 7, 
		RULE_constraint = 8, RULE_references = 9, RULE_exp1 = 10, RULE_exp2 = 11, 
		RULE_exp3 = 12, RULE_exp4 = 13, RULE_exp5 = 14, RULE_unarianFactorExp = 15, 
		RULE_factor = 16, RULE_literal = 17, RULE_exp = 18, RULE_notExp = 19, 
		RULE_orExp = 20, RULE_andExp = 21, RULE_eqExp = 22, RULE_glExp = 23, RULE_relExp = 24, 
		RULE_insert = 25, RULE_value = 26, RULE_nullo = 27, RULE_entero = 28, 
		RULE_decimal = 29, RULE_fecha = 30, RULE_character = 31, RULE_update = 32, 
		RULE_asignacion = 33, RULE_cond = 34, RULE_delete = 35, RULE_query = 36, 
		RULE_column = 37, RULE_orderBy = 38, RULE_expression = 39;
	public static final String[] ruleNames = {
		"sqlProgram", "statement", "dbOperation", "dOperation", "tOperation", 
		"constraints", "tableAction", "type", "constraint", "references", "exp1", 
		"exp2", "exp3", "exp4", "exp5", "unarianFactorExp", "factor", "literal", 
		"exp", "notExp", "orExp", "andExp", "eqExp", "glExp", "relExp", "insert", 
		"value", "nullo", "entero", "decimal", "fecha", "character", "update", 
		"asignacion", "cond", "delete", "query", "column", "orderBy", "expression"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public List<TerminalNode> DOTCOMMA() { return getTokens(GramaticaParser.DOTCOMMA); }
		public TerminalNode DOTCOMMA(int i) {
			return getToken(GramaticaParser.DOTCOMMA, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
			setState(80); statement();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); match(DOTCOMMA);
					setState(82); statement();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(89);
			_la = _input.LA(1);
			if (_la==DOTCOMMA) {
				{
				setState(88); match(DOTCOMMA);
				}
			}

			setState(91); match(EOF);
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
		public TOperationContext tOperation() {
			return getRuleContext(TOperationContext.class,0);
		}
		public DOperationContext dOperation() {
			return getRuleContext(DOperationContext.class,0);
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); dbOperation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); tOperation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); dOperation();
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
		public TerminalNode DATABASE() { return getToken(GramaticaParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public TerminalNode USE() { return getToken(GramaticaParser.USE, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaParser.ALTER, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode DATABASES() { return getToken(GramaticaParser.DATABASES, 0); }
		public TerminalNode RENAME() { return getToken(GramaticaParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public TerminalNode SHOW() { return getToken(GramaticaParser.SHOW, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public DbOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDbOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDbOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDbOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbOperationContext dbOperation() throws RecognitionException {
		DbOperationContext _localctx = new DbOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dbOperation);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(CREATE);
				setState(99); match(DATABASE);
				setState(100); match(ID);
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(DROP);
				setState(102); match(DATABASE);
				setState(103); match(ID);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); match(USE);
				setState(105); match(DATABASE);
				setState(106); match(ID);
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(SHOW);
				setState(108); match(DATABASES);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); match(ALTER);
				setState(110); match(DATABASE);
				setState(111); match(ID);
				setState(112); match(RENAME);
				setState(113); match(TO);
				setState(114); match(ID);
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
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
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
			setState(121);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); query();
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
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public TerminalNode COLUMNS() { return getToken(GramaticaParser.COLUMNS, 0); }
		public TableActionContext tableAction(int i) {
			return getRuleContext(TableActionContext.class,i);
		}
		public TerminalNode ALTER() { return getToken(GramaticaParser.ALTER, 0); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode TABLES() { return getToken(GramaticaParser.TABLES, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public TerminalNode SHOW() { return getToken(GramaticaParser.SHOW, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public List<TableActionContext> tableAction() {
			return getRuleContexts(TableActionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode TABLE() { return getToken(GramaticaParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TOperationContext tOperation() throws RecognitionException {
		TOperationContext _localctx = new TOperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tOperation);
		int _la;
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(CREATE);
				setState(124); match(TABLE);
				setState(125); match(ID);
				setState(126); match(LPARENT);
				setState(127); match(ID);
				setState(128); type();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129); match(COMMA);
					setState(130); match(ID);
					setState(131); type();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(137); constraints();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143); match(RPARENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(ALTER);
				setState(146); match(TABLE);
				setState(147); match(ID);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148); tableAction();
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(149); match(COMMA);
						setState(150); tableAction();
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DROP) | (1L << RENAME) | (1L << ADD))) != 0) );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(DROP);
				setState(161); match(TABLE);
				setState(162); match(ID);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(SHOW);
				setState(164); match(TABLES);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165); match(SHOW);
				setState(166); match(COLUMNS);
				setState(167); match(FROM);
				setState(168); match(ID);
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

	public static class ConstraintsContext extends ParserRuleContext {
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<TerminalNode> CONSTRAINT() { return getTokens(GramaticaParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(GramaticaParser.CONSTRAINT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
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
		enterRule(_localctx, 10, RULE_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171); match(CONSTRAINT);
			setState(172); constraint();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173); match(COMMA);
					setState(174); match(CONSTRAINT);
					setState(175); constraint();
					}
					} 
				}
				setState(180);
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
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(GramaticaParser.COLUMN, 0); }
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(GramaticaParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaParser.CONSTRAINT, 0); }
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public TerminalNode DROP() { return getToken(GramaticaParser.DROP, 0); }
		public TerminalNode ADD() { return getToken(GramaticaParser.ADD, 0); }
		public TableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTableAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableActionContext tableAction() throws RecognitionException {
		TableActionContext _localctx = new TableActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableAction);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(ADD);
				setState(182); match(COLUMN);
				setState(183); match(ID);
				setState(184); type();
				{
				setState(185); constraints();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(ADD);
				setState(188); match(CONSTRAINT);
				setState(189); constraint();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190); match(DROP);
				setState(191); match(COLUMN);
				setState(192); match(ID);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(DROP);
				setState(194); match(CONSTRAINT);
				setState(195); match(ID);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196); match(RENAME);
				setState(197); match(TO);
				setState(198); match(ID);
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
		public TerminalNode DATE() { return getToken(GramaticaParser.DATE, 0); }
		public TerminalNode FLOAT() { return getToken(GramaticaParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(204); match(CHAR);
				setState(205); match(LPARENT);
				setState(206); match(NUM);
				setState(207); match(RPARENT);
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
		public TerminalNode CHECK() { return getToken(GramaticaParser.CHECK, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public TerminalNode KEY() { return getToken(GramaticaParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(GramaticaParser.PRIMARY, 0); }
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(GramaticaParser.FOREIGN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraint);
		int _la;
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); match(ID);
				setState(211); match(PRIMARY);
				setState(212); match(KEY);
				setState(213); match(LPARENT);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(214); match(ID);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(215); match(COMMA);
						setState(216); match(ID);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227); match(RPARENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); match(ID);
				setState(229); match(FOREIGN);
				setState(230); match(KEY);
				setState(231); match(LPARENT);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(232); match(ID);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(233); match(COMMA);
						setState(234); match(ID);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245); match(RPARENT);
				setState(246); references();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247); match(ID);
				setState(248); match(CHECK);
				{
				setState(249); exp1();
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
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode REFERENCES() { return getToken(GramaticaParser.REFERENCES, 0); }
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
		enterRule(_localctx, 18, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(REFERENCES);
			setState(253); match(ID);
			setState(269);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(254); match(LPARENT);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(255); match(ID);
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(256); match(COMMA);
						setState(257); match(ID);
						}
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268); match(RPARENT);
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
		enterRule(_localctx, 20, RULE_exp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); exp2(0);
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
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274); exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277); andExp();
					setState(278); exp3(0);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286); exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(288);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(289); orExp();
					setState(290); exp4(0);
					}
					} 
				}
				setState(296);
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

	public static class Exp4Context extends ParserRuleContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(298); exp5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(300);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(301); eqExp();
					setState(302); exp5(0);
					}
					} 
				}
				setState(308);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310); unarianFactorExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp5);
					setState(312);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(313); glExp();
					setState(314); unarianFactorExp();
					}
					} 
				}
				setState(320);
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
		enterRule(_localctx, 30, RULE_unarianFactorExp);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); match(NOT);
				setState(322); factor();
				}
				break;
			case DATE:
			case CHAR:
			case NULO:
			case ID:
			case NUM:
			case LPARENT:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); factor();
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
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode RPARENT() { return getToken(GramaticaParser.RPARENT, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode LPARENT() { return getToken(GramaticaParser.LPARENT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case DATE:
			case CHAR:
			case NULO:
			case NUM:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); literal();
				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(LPARENT);
				setState(328); exp1();
				setState(329); match(RPARENT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(331); match(ID);
				setState(334);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(332); match(DOT);
					setState(333); match(ID);
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
		enterRule(_localctx, 34, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); value();
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
		public NotExpContext notExp() {
			return getRuleContext(NotExpContext.class,0);
		}
		public OrExpContext orExp() {
			return getRuleContext(OrExpContext.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
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
		enterRule(_localctx, 36, RULE_exp);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); andExp();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); orExp();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); notExp();
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
		enterRule(_localctx, 38, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(NOT);
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
		enterRule(_localctx, 40, RULE_orExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(OR);
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
		enterRule(_localctx, 42, RULE_andExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(AND);
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
		public TerminalNode NOTEQ() { return getToken(GramaticaParser.NOTEQ, 0); }
		public TerminalNode EQ() { return getToken(GramaticaParser.EQ, 0); }
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
		enterRule(_localctx, 44, RULE_eqExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		public TerminalNode GTHAN() { return getToken(GramaticaParser.GTHAN, 0); }
		public TerminalNode EQLTHAN() { return getToken(GramaticaParser.EQLTHAN, 0); }
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
		enterRule(_localctx, 46, RULE_glExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 48, RULE_relExp);
		try {
			setState(357);
			switch (_input.LA(1)) {
			case EQ:
			case NOTEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); eqExp();
				}
				break;
			case LTHAN:
			case EQLTHAN:
			case GTHAN:
			case EQGTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); glExp();
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
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode RPARENT(int i) {
			return getToken(GramaticaParser.RPARENT, i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(GramaticaParser.RPARENT); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode INTO() { return getToken(GramaticaParser.INTO, 0); }
		public List<TerminalNode> LPARENT() { return getTokens(GramaticaParser.LPARENT); }
		public TerminalNode INSERT() { return getToken(GramaticaParser.INSERT, 0); }
		public TerminalNode LPARENT(int i) {
			return getToken(GramaticaParser.LPARENT, i);
		}
		public TerminalNode VALUES() { return getToken(GramaticaParser.VALUES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
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
		enterRule(_localctx, 50, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(INSERT);
			setState(360); match(INTO);
			setState(361); match(ID);
			setState(377);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(362); match(LPARENT);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(363); match(ID);
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(364); match(COMMA);
						setState(365); match(ID);
						}
						}
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376); match(RPARENT);
				}
			}

			setState(379); match(VALUES);
			setState(380); match(LPARENT);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << CHAR) | (1L << NULO) | (1L << NUM) | (1L << MINUS))) != 0)) {
				{
				{
				setState(381); value();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(382); match(COMMA);
					setState(383); value();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394); match(RPARENT);
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
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public NulloContext nullo() {
			return getRuleContext(NulloContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
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
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); entero();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); decimal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); fecha();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399); character();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400); nullo();
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
		enterRule(_localctx, 54, RULE_nullo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(NULO);
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
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
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
		enterRule(_localctx, 56, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(405); match(MINUS);
				}
			}

			setState(408); match(NUM);
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
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
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
		enterRule(_localctx, 58, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); entero();
			setState(411); match(DOT);
			setState(412); match(NUM);
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
		public TerminalNode DATE() { return getToken(GramaticaParser.DATE, 0); }
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
		enterRule(_localctx, 60, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(DATE);
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
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
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
		enterRule(_localctx, 62, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(CHAR);
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
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public TerminalNode SET() { return getToken(GramaticaParser.SET, 0); }
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode UPDATE() { return getToken(GramaticaParser.UPDATE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
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
		enterRule(_localctx, 64, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(UPDATE);
			setState(419); match(ID);
			setState(420); match(SET);
			setState(421); asignacion();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(422); match(COMMA);
				setState(423); asignacion();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(429); match(WHERE);
				setState(430); exp1();
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
		enterRule(_localctx, 66, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(ID);
			setState(434); match(EQ);
			setState(435); literal();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
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
		enterRule(_localctx, 68, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437); expression();
			setState(438); relExp();
			setState(441);
			switch (_input.LA(1)) {
			case DATE:
			case CHAR:
			case NULO:
			case NUM:
			case MINUS:
				{
				setState(439); value();
				}
				break;
			case ID:
				{
				setState(440); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(443); exp();
				setState(444); cond();
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
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DELETE() { return getToken(GramaticaParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
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
		enterRule(_localctx, 70, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(DELETE);
			setState(449); match(FROM);
			setState(450); match(ID);
			setState(453);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(451); match(WHERE);
				setState(452); exp();
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
		public List<OrderByContext> orderBy() {
			return getRuleContexts(OrderByContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(GramaticaParser.SELECT, 0); }
		public OrderByContext orderBy(int i) {
			return getRuleContext(OrderByContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public TerminalNode WHERE() { return getToken(GramaticaParser.WHERE, 0); }
		public TerminalNode ASTERISK() { return getToken(GramaticaParser.ASTERISK, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode ORDER() { return getToken(GramaticaParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(GramaticaParser.BY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode FROM() { return getToken(GramaticaParser.FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
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
		enterRule(_localctx, 72, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(SELECT);
			setState(465);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(456); match(ASTERISK);
				}
				break;
			case ID:
				{
				setState(457); column();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(458); match(COMMA);
					setState(459); column();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(467); match(FROM);
			setState(468); match(ID);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(469); match(COMMA);
				setState(470); match(ID);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(476); match(WHERE);
				setState(477); exp1();
				}
			}

			setState(490);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(480); match(ORDER);
				setState(481); match(BY);
				setState(482); orderBy();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483); match(COMMA);
					setState(484); orderBy();
					}
					}
					setState(489);
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
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
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
		enterRule(_localctx, 74, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(ID);
			setState(495);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(493); match(DOT);
				setState(494); match(ID);
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
		public TerminalNode DESC() { return getToken(GramaticaParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(GramaticaParser.ASC, 0); }
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
		enterRule(_localctx, 76, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); expression();
			setState(499);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(498);
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
		public TerminalNode DOT() { return getToken(GramaticaParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
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
		enterRule(_localctx, 78, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(ID);
			setState(504);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(502); match(DOT);
				setState(503); match(ID);
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
		case 11: return exp2_sempred((Exp2Context)_localctx, predIndex);

		case 12: return exp3_sempred((Exp3Context)_localctx, predIndex);

		case 13: return exp4_sempred((Exp4Context)_localctx, predIndex);

		case 14: return exp5_sempred((Exp5Context)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\5\2\\\n\2\3\2\3\2\3\3\3\3\3\3\5\3c\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4v"+
		"\n\4\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u0087\n\6\f\6\16\6\u008a\13\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\6\6\u009f"+
		"\n\6\r\6\16\6\u00a0\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ca\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00dc\n\n\f\n\16\n\u00df\13\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ee\n\n\f\n\16\n\u00f1\13\n\7\n\u00f3"+
		"\n\n\f\n\16\n\u00f6\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fd\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0105\n\13\f\13\16\13\u0108\13\13\7\13\u010a\n"+
		"\13\f\13\16\13\u010d\13\13\3\13\5\13\u0110\n\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u011b\n\r\f\r\16\r\u011e\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0127\n\16\f\16\16\16\u012a\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0133\n\17\f\17\16\17\u0136\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142\13\20\3\21\3"+
		"\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0151\n\22\5\22\u0153\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u015a\n\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0168"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0171\n\33\f\33\16\33\u0174"+
		"\13\33\7\33\u0176\n\33\f\33\16\33\u0179\13\33\3\33\5\33\u017c\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0183\n\33\f\33\16\33\u0186\13\33\7\33\u0188"+
		"\n\33\f\33\16\33\u018b\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0194"+
		"\n\34\3\35\3\35\3\36\5\36\u0199\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01ab\n\"\f\"\16\"\u01ae\13\"\3"+
		"\"\3\"\5\"\u01b2\n\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u01bc\n$\3$\3$\3$\5$\u01c1"+
		"\n$\3%\3%\3%\3%\3%\5%\u01c8\n%\3&\3&\3&\3&\3&\7&\u01cf\n&\f&\16&\u01d2"+
		"\13&\5&\u01d4\n&\3&\3&\3&\3&\7&\u01da\n&\f&\16&\u01dd\13&\3&\3&\5&\u01e1"+
		"\n&\3&\3&\3&\3&\3&\7&\u01e8\n&\f&\16&\u01eb\13&\5&\u01ed\n&\3\'\3\'\3"+
		"\'\5\'\u01f2\n\'\3(\3(\5(\u01f6\n(\3)\3)\3)\5)\u01fb\n)\3)\2\6\30\32\34"+
		"\36*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNP\2\5\3\2\678\3\29<\3\2%&\u021b\2R\3\2\2\2\4b\3\2\2\2\6u\3\2\2"+
		"\2\b{\3\2\2\2\n\u00ab\3\2\2\2\f\u00ad\3\2\2\2\16\u00c9\3\2\2\2\20\u00d2"+
		"\3\2\2\2\22\u00fc\3\2\2\2\24\u00fe\3\2\2\2\26\u0111\3\2\2\2\30\u0113\3"+
		"\2\2\2\32\u011f\3\2\2\2\34\u012b\3\2\2\2\36\u0137\3\2\2\2 \u0146\3\2\2"+
		"\2\"\u0152\3\2\2\2$\u0154\3\2\2\2&\u0159\3\2\2\2(\u015b\3\2\2\2*\u015d"+
		"\3\2\2\2,\u015f\3\2\2\2.\u0161\3\2\2\2\60\u0163\3\2\2\2\62\u0167\3\2\2"+
		"\2\64\u0169\3\2\2\2\66\u0193\3\2\2\28\u0195\3\2\2\2:\u0198\3\2\2\2<\u019c"+
		"\3\2\2\2>\u01a0\3\2\2\2@\u01a2\3\2\2\2B\u01a4\3\2\2\2D\u01b3\3\2\2\2F"+
		"\u01b7\3\2\2\2H\u01c2\3\2\2\2J\u01c9\3\2\2\2L\u01ee\3\2\2\2N\u01f3\3\2"+
		"\2\2P\u01f7\3\2\2\2RW\5\4\3\2ST\7\62\2\2TV\5\4\3\2US\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2Z\\\7\62\2\2[Z\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]^\7\2\2\3^\3\3\2\2\2_c\5\6\4\2`c\5\n\6\2ac\5\b\5\2b_\3"+
		"\2\2\2b`\3\2\2\2ba\3\2\2\2c\5\3\2\2\2de\7\3\2\2ef\7\4\2\2fv\7.\2\2gh\7"+
		"\6\2\2hi\7\4\2\2iv\7.\2\2jk\7\7\2\2kl\7\4\2\2lv\7.\2\2mn\7\b\2\2nv\7\5"+
		"\2\2op\7\t\2\2pq\7\4\2\2qr\7.\2\2rs\7\n\2\2st\7\13\2\2tv\7.\2\2ud\3\2"+
		"\2\2ug\3\2\2\2uj\3\2\2\2um\3\2\2\2uo\3\2\2\2v\7\3\2\2\2w|\5\64\33\2x|"+
		"\5B\"\2y|\5H%\2z|\5J&\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\t\3\2"+
		"\2\2}~\7\3\2\2~\177\7\f\2\2\177\u0080\7.\2\2\u0080\u0081\7\63\2\2\u0081"+
		"\u0082\7.\2\2\u0082\u0088\5\20\t\2\u0083\u0084\7\65\2\2\u0084\u0085\7"+
		".\2\2\u0085\u0087\5\20\t\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008d\5\f\7\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\64\2\2\u0092\u00ac\3\2\2\2\u0093\u0094\7\t\2\2\u0094"+
		"\u0095\7\f\2\2\u0095\u009e\7.\2\2\u0096\u009b\5\16\b\2\u0097\u0098\7\65"+
		"\2\2\u0098\u009a\5\16\b\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u0096\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00ac\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7\f"+
		"\2\2\u00a4\u00ac\7.\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00ac\7\r\2\2\u00a7"+
		"\u00a8\7\b\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ac\7"+
		".\2\2\u00ab}\3\2\2\2\u00ab\u0093\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae"+
		"\u00b4\5\22\n\2\u00af\u00b0\7\65\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b3"+
		"\5\22\n\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\r\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7"+
		"\22\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\5\20\t\2\u00bb"+
		"\u00bc\5\f\7\2\u00bc\u00ca\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\7"+
		"\16\2\2\u00bf\u00ca\5\22\n\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\17\2\2"+
		"\u00c2\u00ca\7.\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00ca"+
		"\7.\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00ca\7.\2\2\u00c9"+
		"\u00b7\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00d3\7\25\2\2\u00cc\u00d3"+
		"\7\30\2\2\u00cd\u00d3\7\26\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\7\63\2"+
		"\2\u00d0\u00d1\7/\2\2\u00d1\u00d3\7\64\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc"+
		"\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\21\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00e2\7"+
		"\63\2\2\u00d8\u00dd\7.\2\2\u00d9\u00da\7\65\2\2\u00da\u00dc\7.\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00fd\7\64\2\2\u00e6\u00e7\7.\2\2\u00e7"+
		"\u00e8\7\34\2\2\u00e8\u00e9\7\35\2\2\u00e9\u00f4\7\63\2\2\u00ea\u00ef"+
		"\7.\2\2\u00eb\u00ec\7\65\2\2\u00ec\u00ee\7.\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7\64\2\2\u00f8\u00fd\5\24\13\2\u00f9\u00fa\7.\2\2\u00fa"+
		"\u00fb\7\32\2\2\u00fb\u00fd\5\26\f\2\u00fc\u00d4\3\2\2\2\u00fc\u00e6\3"+
		"\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\23\3\2\2\2\u00fe\u00ff\7\33\2\2\u00ff"+
		"\u010f\7.\2\2\u0100\u010b\7\63\2\2\u0101\u0106\7.\2\2\u0102\u0103\7\65"+
		"\2\2\u0103\u0105\7.\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u0101\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\64"+
		"\2\2\u010f\u0100\3\2\2\2\u010f\u0110\3\2\2\2\u0110\25\3\2\2\2\u0111\u0112"+
		"\5\30\r\2\u0112\27\3\2\2\2\u0113\u0114\b\r\1\2\u0114\u0115\5\32\16\2\u0115"+
		"\u011c\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\5,\27\2\u0118\u0119\5\32"+
		"\16\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\31\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011f\u0120\b\16\1\2\u0120\u0121\5\34\17\2\u0121\u0128\3\2\2\2\u0122"+
		"\u0123\f\4\2\2\u0123\u0124\5*\26\2\u0124\u0125\5\34\17\2\u0125\u0127\3"+
		"\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\33\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\b\17\1"+
		"\2\u012c\u012d\5\36\20\2\u012d\u0134\3\2\2\2\u012e\u012f\f\4\2\2\u012f"+
		"\u0130\5.\30\2\u0130\u0131\5\36\20\2\u0131\u0133\3\2\2\2\u0132\u012e\3"+
		"\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\35\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b\20\1\2\u0138\u0139\5 \21"+
		"\2\u0139\u0140\3\2\2\2\u013a\u013b\f\4\2\2\u013b\u013c\5\60\31\2\u013c"+
		"\u013d\5 \21\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\37\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0147\5\"\22\2\u0145\u0147\5\"\22\2"+
		"\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147!\3\2\2\2\u0148\u0153\5"+
		"$\23\2\u0149\u014a\7\63\2\2\u014a\u014b\5\26\f\2\u014b\u014c\7\64\2\2"+
		"\u014c\u0153\3\2\2\2\u014d\u0150\7.\2\2\u014e\u014f\7\66\2\2\u014f\u0151"+
		"\7.\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0148\3\2\2\2\u0152\u0149\3\2\2\2\u0152\u014d\3\2\2\2\u0153#\3\2\2\2"+
		"\u0154\u0155\5\66\34\2\u0155%\3\2\2\2\u0156\u015a\5,\27\2\u0157\u015a"+
		"\5*\26\2\u0158\u015a\5(\25\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\'\3\2\2\2\u015b\u015c\7)\2\2\u015c)\3\2\2\2\u015d"+
		"\u015e\7(\2\2\u015e+\3\2\2\2\u015f\u0160\7\'\2\2\u0160-\3\2\2\2\u0161"+
		"\u0162\t\2\2\2\u0162/\3\2\2\2\u0163\u0164\t\3\2\2\u0164\61\3\2\2\2\u0165"+
		"\u0168\5.\30\2\u0166\u0168\5\60\31\2\u0167\u0165\3\2\2\2\u0167\u0166\3"+
		"\2\2\2\u0168\63\3\2\2\2\u0169\u016a\7\36\2\2\u016a\u016b\7\37\2\2\u016b"+
		"\u017b\7.\2\2\u016c\u0177\7\63\2\2\u016d\u0172\7.\2\2\u016e\u016f\7\65"+
		"\2\2\u016f\u0171\7.\2\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u016d\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\7\64"+
		"\2\2\u017b\u016c\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\7 \2\2\u017e\u0189\7\63\2\2\u017f\u0184\5\66\34\2\u0180\u0181\7"+
		"\65\2\2\u0181\u0183\5\66\34\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u017f\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\64"+
		"\2\2\u018d\65\3\2\2\2\u018e\u0194\5:\36\2\u018f\u0194\5<\37\2\u0190\u0194"+
		"\5> \2\u0191\u0194\5@!\2\u0192\u0194\58\35\2\u0193\u018e\3\2\2\2\u0193"+
		"\u018f\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2"+
		"\2\2\u0194\67\3\2\2\2\u0195\u0196\7*\2\2\u01969\3\2\2\2\u0197\u0199\7"+
		"=\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\7/\2\2\u019b;\3\2\2\2\u019c\u019d\5:\36\2\u019d\u019e\7\66\2\2"+
		"\u019e\u019f\7/\2\2\u019f=\3\2\2\2\u01a0\u01a1\7\26\2\2\u01a1?\3\2\2\2"+
		"\u01a2\u01a3\7\27\2\2\u01a3A\3\2\2\2\u01a4\u01a5\7#\2\2\u01a5\u01a6\7"+
		".\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01ac\5D#\2\u01a8\u01a9\7\65\2\2\u01a9"+
		"\u01ab\5D#\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0"+
		"\7\24\2\2\u01b0\u01b2\5\26\f\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2"+
		"\u01b2C\3\2\2\2\u01b3\u01b4\7.\2\2\u01b4\u01b5\7\67\2\2\u01b5\u01b6\5"+
		"$\23\2\u01b6E\3\2\2\2\u01b7\u01b8\5P)\2\u01b8\u01bb\5\62\32\2\u01b9\u01bc"+
		"\5\66\34\2\u01ba\u01bc\5P)\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01c0\3\2\2\2\u01bd\u01be\5&\24\2\u01be\u01bf\5F$\2\u01bf\u01c1\3\2\2"+
		"\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1G\3\2\2\2\u01c2\u01c3"+
		"\7+\2\2\u01c3\u01c4\7\21\2\2\u01c4\u01c7\7.\2\2\u01c5\u01c6\7\24\2\2\u01c6"+
		"\u01c8\5&\24\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8I\3\2\2\2"+
		"\u01c9\u01d3\7\23\2\2\u01ca\u01d4\7>\2\2\u01cb\u01d0\5L\'\2\u01cc\u01cd"+
		"\7\65\2\2\u01cd\u01cf\5L\'\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01ca\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\7\21\2\2\u01d6\u01db\7.\2\2\u01d7\u01d8\7\65\2\2\u01d8\u01da\7"+
		".\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01e0\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\24"+
		"\2\2\u01df\u01e1\5\26\f\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01ec\3\2\2\2\u01e2\u01e3\7!\2\2\u01e3\u01e4\7$\2\2\u01e4\u01e9\5N(\2"+
		"\u01e5\u01e6\7\65\2\2\u01e6\u01e8\5N(\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01e2\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edK\3\2\2\2"+
		"\u01ee\u01f1\7.\2\2\u01ef\u01f0\7\66\2\2\u01f0\u01f2\7.\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2M\3\2\2\2\u01f3\u01f5\5P)\2\u01f4\u01f6"+
		"\t\4\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6O\3\2\2\2\u01f7"+
		"\u01fa\7.\2\2\u01f8\u01f9\7\66\2\2\u01f9\u01fb\7.\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fbQ\3\2\2\2\65W[bu{\u0088\u008e\u009b\u00a0"+
		"\u00ab\u00b4\u00c9\u00d2\u00dd\u00e2\u00ef\u00f4\u00fc\u0106\u010b\u010f"+
		"\u011c\u0128\u0134\u0140\u0146\u0150\u0152\u0159\u0167\u0172\u0177\u017b"+
		"\u0184\u0189\u0193\u0198\u01ac\u01b1\u01bb\u01c0\u01c7\u01d0\u01d3\u01db"+
		"\u01e0\u01e9\u01ec\u01f1\u01f5\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}