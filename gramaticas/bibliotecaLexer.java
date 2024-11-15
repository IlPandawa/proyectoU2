// $ANTLR 3.5.2 .\\biblioteca.g 2024-11-15 10:42:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class bibliotecaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int COMMA=4;
	public static final int DATE=5;
	public static final int DOUBLE=6;
	public static final int INT=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public bibliotecaLexer() {} 
	public bibliotecaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public bibliotecaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\biblioteca.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:2:7: ( 'Libros' )
			// .\\biblioteca.g:2:9: 'Libros'
			{
			match("Libros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:3:7: ( 'Prestamos' )
			// .\\biblioteca.g:3:9: 'Prestamos'
			{
			match("Prestamos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:4:7: ( 'Usuarios' )
			// .\\biblioteca.g:4:9: 'Usuarios'
			{
			match("Usuarios"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:93:4: ( ( '0' .. '9' )+ )
			// .\\biblioteca.g:93:6: ( '0' .. '9' )+
			{
			// .\\biblioteca.g:93:6: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\biblioteca.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:94:7: ( INT '.' INT )
			// .\\biblioteca.g:94:9: INT '.' INT
			{
			mINT(); 

			match('.'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:95:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' )* )
			// .\\biblioteca.g:95:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// .\\biblioteca.g:95:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==' '||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\biblioteca.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:96:5: ( INT '/' INT '/' INT )
			// .\\biblioteca.g:96:7: INT '/' INT '/' INT
			{
			mINT(); 

			match('/'); 
			mINT(); 

			match('/'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:97:6: ( ',' )
			// .\\biblioteca.g:97:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\biblioteca.g:98:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// .\\biblioteca.g:98:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// .\\biblioteca.g:98:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// .\\biblioteca.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			_channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// .\\biblioteca.g:1:8: ( T__10 | T__11 | T__12 | INT | DOUBLE | STRING | DATE | COMMA | WS )
		int alt4=9;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// .\\biblioteca.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// .\\biblioteca.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// .\\biblioteca.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// .\\biblioteca.g:1:28: INT
				{
				mINT(); 

				}
				break;
			case 5 :
				// .\\biblioteca.g:1:32: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 6 :
				// .\\biblioteca.g:1:39: STRING
				{
				mSTRING(); 

				}
				break;
			case 7 :
				// .\\biblioteca.g:1:46: DATE
				{
				mDATE(); 

				}
				break;
			case 8 :
				// .\\biblioteca.g:1:51: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 9 :
				// .\\biblioteca.g:1:57: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\3\5\1\13\3\uffff\3\5\3\uffff\11\5\1\32\2\5\1\uffff\3\5\1\40\1"+
		"\41\2\uffff";
	static final String DFA4_eofS =
		"\42\uffff";
	static final String DFA4_minS =
		"\1\11\1\151\1\162\1\163\1\56\3\uffff\1\142\1\145\1\165\3\uffff\1\162\1"+
		"\163\1\141\1\157\1\164\1\162\1\163\1\141\1\151\1\40\1\155\1\157\1\uffff"+
		"\1\157\2\163\2\40\2\uffff";
	static final String DFA4_maxS =
		"\1\172\1\151\1\162\1\163\1\71\3\uffff\1\142\1\145\1\165\3\uffff\1\162"+
		"\1\163\1\141\1\157\1\164\1\162\1\163\1\141\1\151\1\172\1\155\1\157\1\uffff"+
		"\1\157\2\163\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\5\uffff\1\6\1\10\1\11\3\uffff\1\4\1\5\1\7\14\uffff\1\1\5\uffff\1\3\1"+
		"\2";
	static final String DFA4_specialS =
		"\42\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\7\2\uffff\1\7\22\uffff\1\7\13\uffff\1\6\3\uffff\12\4\7\uffff\13\5"+
			"\1\1\3\5\1\2\4\5\1\3\5\5\4\uffff\1\5\1\uffff\32\5",
			"\1\10",
			"\1\11",
			"\1\12",
			"\1\14\1\15\12\4",
			"",
			"",
			"",
			"\1\16",
			"\1\17",
			"\1\20",
			"",
			"",
			"",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\5\17\uffff\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
			"\1\33",
			"\1\34",
			"",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\5\17\uffff\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
			"\1\5\17\uffff\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | INT | DOUBLE | STRING | DATE | COMMA | WS );";
		}
	}

}