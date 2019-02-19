// Generated from C:/Users/estok/Downloads/vsdj autodielna/Autodielna/src\Autodielna.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutodielnaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING=11, WS=12;
	public static final int
		RULE_car = 0, RULE_bodywork = 1, RULE_machinery = 2, RULE_component = 3, 
		RULE_supplier = 4, RULE_brand = 5;
	public static final String[] ruleNames = {
		"car", "bodywork", "machinery", "component", "supplier", "brand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'-bodywork'", "'-machinery'", "','", "'front:'", "'rear:'", 
		"'name:'", "'brand:'", "'supplier:'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "STRING", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Autodielna.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutodielnaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutodielnaParser.STRING, 0); }
		public BodyworkContext bodywork() {
			return getRuleContext(BodyworkContext.class,0);
		}
		public MachineryContext machinery() {
			return getRuleContext(MachineryContext.class,0);
		}
		public CarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_car; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterCar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitCar(this);
		}
	}

	public final CarContext car() throws RecognitionException {
		CarContext _localctx = new CarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_car);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(STRING);
			setState(14);
			match(T__1);
			setState(15);
			bodywork();
			setState(16);
			match(T__2);
			setState(17);
			machinery();
			setState(18);
			match(T__3);
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

	public static class BodyworkContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public BodyworkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodywork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterBodywork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitBodywork(this);
		}
	}

	public final BodyworkContext bodywork() throws RecognitionException {
		BodyworkContext _localctx = new BodyworkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bodywork);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__4);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				component();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(26);
			match(T__5);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				component();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	public static class MachineryContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public MachineryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machinery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterMachinery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitMachinery(this);
		}
	}

	public final MachineryContext machinery() throws RecognitionException {
		MachineryContext _localctx = new MachineryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_machinery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				component();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutodielnaParser.STRING, 0); }
		public List<BrandContext> brand() {
			return getRuleContexts(BrandContext.class);
		}
		public BrandContext brand(int i) {
			return getRuleContext(BrandContext.class,i);
		}
		public List<SupplierContext> supplier() {
			return getRuleContexts(SupplierContext.class);
		}
		public SupplierContext supplier(int i) {
			return getRuleContext(SupplierContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__6);
			setState(38);
			match(STRING);
			setState(39);
			match(T__7);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				brand();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(45);
			match(T__8);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				supplier();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(51);
			match(T__9);
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

	public static class SupplierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutodielnaParser.STRING, 0); }
		public SupplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterSupplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitSupplier(this);
		}
	}

	public final SupplierContext supplier() throws RecognitionException {
		SupplierContext _localctx = new SupplierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_supplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(STRING);
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

	public static class BrandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutodielnaParser.STRING, 0); }
		public BrandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).enterBrand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutodielnaListener ) ((AutodielnaListener)listener).exitBrand(this);
		}
	}

	public final BrandContext brand() throws RecognitionException {
		BrandContext _localctx = new BrandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_brand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STRING);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\6\4$\n\4"+
		"\r\4\16\4%\3\5\3\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\5\3\5\6\5\62\n\5\r\5\16"+
		"\5\63\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2:\2\16\3\2\2"+
		"\2\4\26\3\2\2\2\6#\3\2\2\2\b\'\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16\17\7"+
		"\3\2\2\17\20\7\r\2\2\20\21\7\4\2\2\21\22\5\4\3\2\22\23\7\5\2\2\23\24\5"+
		"\6\4\2\24\25\7\6\2\2\25\3\3\2\2\2\26\30\7\7\2\2\27\31\5\b\5\2\30\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\7"+
		"\b\2\2\35\37\5\b\5\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!"+
		"\5\3\2\2\2\"$\5\b\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2"+
		"\2\2\'(\7\t\2\2()\7\r\2\2)+\7\n\2\2*,\5\f\7\2+*\3\2\2\2,-\3\2\2\2-+\3"+
		"\2\2\2-.\3\2\2\2./\3\2\2\2/\61\7\13\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\f\2\2\66"+
		"\t\3\2\2\2\678\7\r\2\28\13\3\2\2\29:\7\r\2\2:\r\3\2\2\2\7\32 %-\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}