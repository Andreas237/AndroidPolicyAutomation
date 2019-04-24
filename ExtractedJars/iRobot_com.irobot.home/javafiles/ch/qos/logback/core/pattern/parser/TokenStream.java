// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.*;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			Token, OptionTokenizer

class TokenStream
{
	static final class TokenizerState extends Enum
	{

		public static TokenizerState valueOf(String s)
		{
			return (TokenizerState)Enum.valueOf(ch/qos/logback/core/pattern/parser/TokenStream$TokenizerState, s);
		//    0    0:ldc1            #2   <Class TokenStream$TokenizerState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class TokenStream$TokenizerState>
		//    4    9:areturn         
		}

		public static TokenizerState[] values()
		{
			return (TokenizerState[])((TokenizerState []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field TokenStream$TokenizerState[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lch.qos.logback.core.pattern.parser.TokenStream$TokenizerState_3B_.clone()>
		//    2    6:checkcast       #50  <Class TokenStream$TokenizerState[]>
		//    3    9:areturn         
		}

		private static final TokenizerState $VALUES[];
		public static final TokenizerState FORMAT_MODIFIER_STATE;
		public static final TokenizerState KEYWORD_STATE;
		public static final TokenizerState LITERAL_STATE;
		public static final TokenizerState OPTION_STATE;
		public static final TokenizerState RIGHT_PARENTHESIS_STATE;

		static 
		{
			LITERAL_STATE = new TokenizerState("LITERAL_STATE", 0);
		//    0    0:new             #2   <Class TokenStream$TokenizerState>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "LITERAL_STATE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
		//    5   10:putstatic       #25  <Field TokenStream$TokenizerState LITERAL_STATE>
			FORMAT_MODIFIER_STATE = new TokenizerState("FORMAT_MODIFIER_STATE", 1);
		//    6   13:new             #2   <Class TokenStream$TokenizerState>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "FORMAT_MODIFIER_STATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
		//   11   23:putstatic       #28  <Field TokenStream$TokenizerState FORMAT_MODIFIER_STATE>
			KEYWORD_STATE = new TokenizerState("KEYWORD_STATE", 2);
		//   12   26:new             #2   <Class TokenStream$TokenizerState>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "KEYWORD_STATE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
		//   17   36:putstatic       #31  <Field TokenStream$TokenizerState KEYWORD_STATE>
			OPTION_STATE = new TokenizerState("OPTION_STATE", 3);
		//   18   39:new             #2   <Class TokenStream$TokenizerState>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "OPTION_STATE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
		//   23   49:putstatic       #34  <Field TokenStream$TokenizerState OPTION_STATE>
			RIGHT_PARENTHESIS_STATE = new TokenizerState("RIGHT_PARENTHESIS_STATE", 4);
		//   24   52:new             #2   <Class TokenStream$TokenizerState>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "RIGHT_PARENTHESIS_STATE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
		//   29   62:putstatic       #37  <Field TokenStream$TokenizerState RIGHT_PARENTHESIS_STATE>
			$VALUES = (new TokenizerState[] {
				LITERAL_STATE, FORMAT_MODIFIER_STATE, KEYWORD_STATE, OPTION_STATE, RIGHT_PARENTHESIS_STATE
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       TokenizerState[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field TokenStream$TokenizerState LITERAL_STATE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field TokenStream$TokenizerState FORMAT_MODIFIER_STATE>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field TokenStream$TokenizerState KEYWORD_STATE>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field TokenStream$TokenizerState OPTION_STATE>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field TokenStream$TokenizerState RIGHT_PARENTHESIS_STATE>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field TokenStream$TokenizerState[] $VALUES>
		//*  53  102:return          
		}

		private TokenizerState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	TokenStream(String s)
	{
		this(s, ((IEscapeUtil) (new RegularEscapeUtil())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #23  <Class RegularEscapeUtil>
	//    3    5:dup             
	//    4    6:invokespecial   #26  <Method void RegularEscapeUtil()>
	//    5    9:invokespecial   #29  <Method void TokenStream(String, IEscapeUtil)>
	//    6   12:return          
	}

	TokenStream(String s, IEscapeUtil iescapeutil)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		optionEscapeUtil = ((IEscapeUtil) (new RestrictedEscapeUtil()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class RestrictedEscapeUtil>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void RestrictedEscapeUtil()>
	//    6   12:putfield        #36  <Field IEscapeUtil optionEscapeUtil>
		state = TokenizerState.LITERAL_STATE;
	//    7   15:aload_0         
	//    8   16:getstatic       #39  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
	//    9   19:putfield        #41  <Field TokenStream$TokenizerState state>
		pointer = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #43  <Field int pointer>
		if(s != null && s.length() != 0)
	//*  13   27:aload_1         
	//*  14   28:ifnull          60
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #49  <Method int String.length()>
	//*  17   35:ifne            41
	//*  18   38:goto            60
		{
			pattern = s;
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #51  <Field String pattern>
			patternLength = s.length();
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #49  <Method int String.length()>
	//   25   51:putfield        #53  <Field int patternLength>
			escapeUtil = iescapeutil;
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:putfield        #55  <Field IEscapeUtil escapeUtil>
			return;
	//   29   59:return          
		} else
		{
			throw new IllegalArgumentException("null or empty pattern string not allowed");
	//   30   60:new             #57  <Class IllegalArgumentException>
	//   31   63:dup             
	//   32   64:ldc1            #59  <String "null or empty pattern string not allowed">
	//   33   66:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   34   69:athrow          
		}
	}

	private void addValuedToken(int i, StringBuffer stringbuffer, List list)
	{
		if(stringbuffer.length() > 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #66  <Method int StringBuffer.length()>
	//*   2    4:ifle            31
		{
			list.add(((Object) (new Token(i, ((Object) (stringbuffer.toString()))))));
	//    3    7:aload_3         
	//    4    8:new             #68  <Class Token>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #72  <Method String StringBuffer.toString()>
	//    9   17:invokespecial   #75  <Method void Token(int, Object)>
	//   10   20:invokeinterface #81  <Method boolean List.add(Object)>
	//   11   25:pop             
			stringbuffer.setLength(0);
	//   12   26:aload_2         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #85  <Method void StringBuffer.setLength(int)>
		}
	//   15   31:return          
	}

	private void handleFormatModifierState(char c, List list, StringBuffer stringbuffer)
	{
		if(c == '(')
	//*   0    0:iload_1         
	//*   1    1:bipush          40
	//*   2    3:icmpne          33
		{
			addValuedToken(1002, stringbuffer, list);
	//    3    6:aload_0         
	//    4    7:sipush          1002
	//    5   10:aload_3         
	//    6   11:aload_2         
	//    7   12:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
			list.add(((Object) (Token.BARE_COMPOSITE_KEYWORD_TOKEN)));
	//    8   15:aload_2         
	//    9   16:getstatic       #95  <Field Token Token.BARE_COMPOSITE_KEYWORD_TOKEN>
	//   10   19:invokeinterface #81  <Method boolean List.add(Object)>
	//   11   24:pop             
			state = TokenizerState.LITERAL_STATE;
	//   12   25:aload_0         
	//   13   26:getstatic       #39  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
	//   14   29:putfield        #41  <Field TokenStream$TokenizerState state>
			return;
	//   15   32:return          
		}
		if(Character.isJavaIdentifierStart(c))
	//*  16   33:iload_1         
	//*  17   34:invokestatic    #101 <Method boolean Character.isJavaIdentifierStart(char)>
	//*  18   37:ifeq            56
		{
			addValuedToken(1002, stringbuffer, list);
	//   19   40:aload_0         
	//   20   41:sipush          1002
	//   21   44:aload_3         
	//   22   45:aload_2         
	//   23   46:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
			state = TokenizerState.KEYWORD_STATE;
	//   24   49:aload_0         
	//   25   50:getstatic       #104 <Field TokenStream$TokenizerState TokenStream$TokenizerState.KEYWORD_STATE>
	//   26   53:putfield        #41  <Field TokenStream$TokenizerState state>
		}
		stringbuffer.append(c);
	//   27   56:aload_3         
	//   28   57:iload_1         
	//   29   58:invokevirtual   #108 <Method StringBuffer StringBuffer.append(char)>
	//   30   61:pop             
	//   31   62:return          
	}

	private void handleKeywordState(char c, List list, StringBuffer stringbuffer)
	{
		if(Character.isJavaIdentifierPart(c))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #113 <Method boolean Character.isJavaIdentifierPart(char)>
	//*   2    4:ifeq            14
		{
			stringbuffer.append(c);
	//    3    7:aload_3         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #108 <Method StringBuffer StringBuffer.append(char)>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
		if(c != '{') goto _L2; else goto _L1
	//    8   14:iload_1         
	//    9   15:bipush          123
	//   10   17:icmpne          39
_L1:
		addValuedToken(1004, stringbuffer, list);
	//   11   20:aload_0         
	//   12   21:sipush          1004
	//   13   24:aload_3         
	//   14   25:aload_2         
	//   15   26:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
		list = ((List) (TokenizerState.OPTION_STATE));
	//   16   29:getstatic       #116 <Field TokenStream$TokenizerState TokenStream$TokenizerState.OPTION_STATE>
	//   17   32:astore_2        
_L5:
		state = ((TokenizerState) (list));
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #41  <Field TokenStream$TokenizerState state>
		return;
	//   21   38:return          
_L2:
		if(c != '(') goto _L4; else goto _L3
	//   22   39:iload_1         
	//   23   40:bipush          40
	//   24   42:icmpne          61
_L3:
		addValuedToken(1005, stringbuffer, list);
	//   25   45:aload_0         
	//   26   46:sipush          1005
	//   27   49:aload_3         
	//   28   50:aload_2         
	//   29   51:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
_L6:
		list = ((List) (TokenizerState.LITERAL_STATE));
	//   30   54:getstatic       #39  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
	//   31   57:astore_2        
		  goto _L5
	//*  32   58:goto            33
_L4:
		if(c == '%')
	//*  33   61:iload_1         
	//*  34   62:bipush          37
	//*  35   64:icmpne          93
		{
			addValuedToken(1004, stringbuffer, list);
	//   36   67:aload_0         
	//   37   68:sipush          1004
	//   38   71:aload_3         
	//   39   72:aload_2         
	//   40   73:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
			list.add(((Object) (Token.PERCENT_TOKEN)));
	//   41   76:aload_2         
	//   42   77:getstatic       #119 <Field Token Token.PERCENT_TOKEN>
	//   43   80:invokeinterface #81  <Method boolean List.add(Object)>
	//   44   85:pop             
			list = ((List) (TokenizerState.FORMAT_MODIFIER_STATE));
	//   45   86:getstatic       #122 <Field TokenStream$TokenizerState TokenStream$TokenizerState.FORMAT_MODIFIER_STATE>
	//   46   89:astore_2        
		} else
	//*  47   90:goto            33
		{
label0:
			{
				if(c != ')')
					break label0;
	//   48   93:iload_1         
	//   49   94:bipush          41
	//   50   96:icmpne          115
				addValuedToken(1004, stringbuffer, list);
	//   51   99:aload_0         
	//   52  100:sipush          1004
	//   53  103:aload_3         
	//   54  104:aload_2         
	//   55  105:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
				list = ((List) (TokenizerState.RIGHT_PARENTHESIS_STATE));
	//   56  108:getstatic       #125 <Field TokenStream$TokenizerState TokenStream$TokenizerState.RIGHT_PARENTHESIS_STATE>
	//   57  111:astore_2        
			}
		}
		  goto _L5
	//*  58  112:goto            33
		addValuedToken(1004, stringbuffer, list);
	//   59  115:aload_0         
	//   60  116:sipush          1004
	//   61  119:aload_3         
	//   62  120:aload_2         
	//   63  121:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
		if(c == '\\')
	//*  64  124:iload_1         
	//*  65  125:bipush          92
	//*  66  127:icmpne          187
		{
			if(pointer < patternLength)
	//*  67  130:aload_0         
	//*  68  131:getfield        #43  <Field int pointer>
	//*  69  134:aload_0         
	//*  70  135:getfield        #53  <Field int patternLength>
	//*  71  138:icmpge          54
			{
				list = ((List) (pattern));
	//   72  141:aload_0         
	//   73  142:getfield        #51  <Field String pattern>
	//   74  145:astore_2        
				int i = pointer;
	//   75  146:aload_0         
	//   76  147:getfield        #43  <Field int pointer>
	//   77  150:istore          4
				pointer = i + 1;
	//   78  152:aload_0         
	//   79  153:iload           4
	//   80  155:iconst_1        
	//   81  156:iadd            
	//   82  157:putfield        #43  <Field int pointer>
				c = ((String) (list)).charAt(i);
	//   83  160:aload_2         
	//   84  161:iload           4
	//   85  163:invokevirtual   #129 <Method char String.charAt(int)>
	//   86  166:istore_1        
				escapeUtil.escape("%()", stringbuffer, c, pointer);
	//   87  167:aload_0         
	//   88  168:getfield        #55  <Field IEscapeUtil escapeUtil>
	//   89  171:ldc1            #131 <String "%()">
	//   90  173:aload_3         
	//   91  174:iload_1         
	//   92  175:aload_0         
	//   93  176:getfield        #43  <Field int pointer>
	//   94  179:invokeinterface #137 <Method void IEscapeUtil.escape(String, StringBuffer, char, int)>
			}
		} else
	//*  95  184:goto            54
		{
			stringbuffer.append(c);
	//   96  187:aload_3         
	//   97  188:iload_1         
	//   98  189:invokevirtual   #108 <Method StringBuffer StringBuffer.append(char)>
	//   99  192:pop             
		}
		  goto _L6
	//* 100  193:goto            54
	}

	private void handleLiteralState(char c, List list, StringBuffer stringbuffer)
	{
		if(c != '%')
	//*   0    0:iload_1         
	//*   1    1:bipush          37
	//*   2    3:icmpeq          49
		{
			if(c != ')')
	//*   3    6:iload_1         
	//*   4    7:bipush          41
	//*   5    9:icmpeq          33
				if(c != '\\')
	//*   6   12:iload_1         
	//*   7   13:bipush          92
	//*   8   15:icmpeq          25
				{
					stringbuffer.append(c);
	//    9   18:aload_3         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #108 <Method StringBuffer StringBuffer.append(char)>
	//   12   23:pop             
					return;
	//   13   24:return          
				} else
				{
					escape("%()", stringbuffer);
	//   14   25:aload_0         
	//   15   26:ldc1            #131 <String "%()">
	//   16   28:aload_3         
	//   17   29:invokevirtual   #141 <Method void escape(String, StringBuffer)>
					return;
	//   18   32:return          
				}
			addValuedToken(1000, stringbuffer, list);
	//   19   33:aload_0         
	//   20   34:sipush          1000
	//   21   37:aload_3         
	//   22   38:aload_2         
	//   23   39:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
			list = ((List) (TokenizerState.RIGHT_PARENTHESIS_STATE));
	//   24   42:getstatic       #125 <Field TokenStream$TokenizerState TokenStream$TokenizerState.RIGHT_PARENTHESIS_STATE>
	//   25   45:astore_2        
		} else
	//*  26   46:goto            72
		{
			addValuedToken(1000, stringbuffer, list);
	//   27   49:aload_0         
	//   28   50:sipush          1000
	//   29   53:aload_3         
	//   30   54:aload_2         
	//   31   55:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
			list.add(((Object) (Token.PERCENT_TOKEN)));
	//   32   58:aload_2         
	//   33   59:getstatic       #119 <Field Token Token.PERCENT_TOKEN>
	//   34   62:invokeinterface #81  <Method boolean List.add(Object)>
	//   35   67:pop             
			list = ((List) (TokenizerState.FORMAT_MODIFIER_STATE));
	//   36   68:getstatic       #122 <Field TokenStream$TokenizerState TokenStream$TokenizerState.FORMAT_MODIFIER_STATE>
	//   37   71:astore_2        
		}
		state = ((TokenizerState) (list));
	//   38   72:aload_0         
	//   39   73:aload_2         
	//   40   74:putfield        #41  <Field TokenStream$TokenizerState state>
	//   41   77:return          
	}

	private void handleRightParenthesisState(char c, List list, StringBuffer stringbuffer)
	{
		list.add(((Object) (Token.RIGHT_PARENTHESIS_TOKEN)));
	//    0    0:aload_2         
	//    1    1:getstatic       #145 <Field Token Token.RIGHT_PARENTHESIS_TOKEN>
	//    2    4:invokeinterface #81  <Method boolean List.add(Object)>
	//    3    9:pop             
		if(c == ')') goto _L2; else goto _L1
	//    4   10:iload_1         
	//    5   11:bipush          41
	//    6   13:icmpeq          61
_L1:
		if(c == '\\') goto _L4; else goto _L3
	//    7   16:iload_1         
	//    8   17:bipush          92
	//    9   19:icmpeq          51
_L3:
		if(c == '{') goto _L6; else goto _L5
	//   10   22:iload_1         
	//   11   23:bipush          123
	//   12   25:icmpeq          44
_L5:
		stringbuffer.append(c);
	//   13   28:aload_3         
	//   14   29:iload_1         
	//   15   30:invokevirtual   #108 <Method StringBuffer StringBuffer.append(char)>
	//   16   33:pop             
_L8:
		list = ((List) (TokenizerState.LITERAL_STATE));
	//   17   34:getstatic       #39  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
	//   18   37:astore_2        
_L7:
		state = ((TokenizerState) (list));
	//   19   38:aload_0         
	//   20   39:aload_2         
	//   21   40:putfield        #41  <Field TokenStream$TokenizerState state>
		return;
	//   22   43:return          
_L6:
		list = ((List) (TokenizerState.OPTION_STATE));
	//   23   44:getstatic       #116 <Field TokenStream$TokenizerState TokenStream$TokenizerState.OPTION_STATE>
	//   24   47:astore_2        
		if(true) goto _L7; else goto _L4
	//   25   48:goto            38
_L4:
		escape("%{}", stringbuffer);
	//   26   51:aload_0         
	//   27   52:ldc1            #147 <String "%{}">
	//   28   54:aload_3         
	//   29   55:invokevirtual   #141 <Method void escape(String, StringBuffer)>
		if(true) goto _L8; else goto _L2
	//   30   58:goto            34
_L2:
	//   31   61:return          
	}

	private void processOption(char c, List list, StringBuffer stringbuffer)
	{
		(new OptionTokenizer(this)).tokenize(c, list);
	//    0    0:new             #150 <Class OptionTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #153 <Method void OptionTokenizer(TokenStream)>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #157 <Method void OptionTokenizer.tokenize(char, List)>
	//    7   13:return          
	}

	void escape(String s, StringBuffer stringbuffer)
	{
		if(pointer < patternLength)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field int pointer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #53  <Field int patternLength>
	//*   4    8:icmpge          55
		{
			String s1 = pattern;
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field String pattern>
	//    7   15:astore          5
			int i = pointer;
	//    8   17:aload_0         
	//    9   18:getfield        #43  <Field int pointer>
	//   10   21:istore          4
			pointer = i + 1;
	//   11   23:aload_0         
	//   12   24:iload           4
	//   13   26:iconst_1        
	//   14   27:iadd            
	//   15   28:putfield        #43  <Field int pointer>
			char c = s1.charAt(i);
	//   16   31:aload           5
	//   17   33:iload           4
	//   18   35:invokevirtual   #129 <Method char String.charAt(int)>
	//   19   38:istore_3        
			escapeUtil.escape(s, stringbuffer, c, pointer);
	//   20   39:aload_0         
	//   21   40:getfield        #55  <Field IEscapeUtil escapeUtil>
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:iload_3         
	//   25   46:aload_0         
	//   26   47:getfield        #43  <Field int pointer>
	//   27   50:invokeinterface #137 <Method void IEscapeUtil.escape(String, StringBuffer, char, int)>
		}
	//   28   55:return          
	}

	void optionEscape(String s, StringBuffer stringbuffer)
	{
		if(pointer < patternLength)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field int pointer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #53  <Field int patternLength>
	//*   4    8:icmpge          55
		{
			String s1 = pattern;
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field String pattern>
	//    7   15:astore          5
			int i = pointer;
	//    8   17:aload_0         
	//    9   18:getfield        #43  <Field int pointer>
	//   10   21:istore          4
			pointer = i + 1;
	//   11   23:aload_0         
	//   12   24:iload           4
	//   13   26:iconst_1        
	//   14   27:iadd            
	//   15   28:putfield        #43  <Field int pointer>
			char c = s1.charAt(i);
	//   16   31:aload           5
	//   17   33:iload           4
	//   18   35:invokevirtual   #129 <Method char String.charAt(int)>
	//   19   38:istore_3        
			optionEscapeUtil.escape(s, stringbuffer, c, pointer);
	//   20   39:aload_0         
	//   21   40:getfield        #36  <Field IEscapeUtil optionEscapeUtil>
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:iload_3         
	//   25   46:aload_0         
	//   26   47:getfield        #43  <Field int pointer>
	//   27   50:invokeinterface #137 <Method void IEscapeUtil.escape(String, StringBuffer, char, int)>
		}
	//   28   55:return          
	}

	List tokenize()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #161 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #162 <Method void ArrayList()>
	//    3    7:astore_2        
		StringBuffer stringbuffer = new StringBuffer();
	//    4    8:new             #65  <Class StringBuffer>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void StringBuffer()>
	//    7   15:astore_3        
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = new int[TokenizerState.values().length];
			//    0    0:invokestatic    #18  <Method TokenStream$TokenizerState[] TokenStream$TokenizerState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
				try
				{
					$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.LITERAL_STATE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
			//    5   12:getstatic       #24  <Field TokenStream$TokenizerState TokenStream$TokenizerState.LITERAL_STATE>
			//    6   15:invokevirtual   #28  <Method int TokenStream$TokenizerState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
			//*  10   23:getstatic       #31  <Field TokenStream$TokenizerState TokenStream$TokenizerState.FORMAT_MODIFIER_STATE>
			//*  11   26:invokevirtual   #28  <Method int TokenStream$TokenizerState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
			//*  15   34:getstatic       #34  <Field TokenStream$TokenizerState TokenStream$TokenizerState.OPTION_STATE>
			//*  16   37:invokevirtual   #28  <Method int TokenStream$TokenizerState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
			//*  20   45:getstatic       #37  <Field TokenStream$TokenizerState TokenStream$TokenizerState.KEYWORD_STATE>
			//*  21   48:invokevirtual   #28  <Method int TokenStream$TokenizerState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
			//*  25   56:getstatic       #40  <Field TokenStream$TokenizerState TokenStream$TokenizerState.RIGHT_PARENTHESIS_STATE>
			//*  26   59:invokevirtual   #28  <Method int TokenStream$TokenizerState.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		do
			if(pointer < patternLength)
	//*   8   16:aload_0         
	//*   9   17:getfield        #43  <Field int pointer>
	//*  10   20:aload_0         
	//*  11   21:getfield        #53  <Field int patternLength>
	//*  12   24:icmpge          149
			{
				char c = pattern.charAt(pointer);
	//   13   27:aload_0         
	//   14   28:getfield        #51  <Field String pattern>
	//   15   31:aload_0         
	//   16   32:getfield        #43  <Field int pointer>
	//   17   35:invokevirtual   #129 <Method char String.charAt(int)>
	//   18   38:istore_1        
				pointer = pointer + 1;
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #43  <Field int pointer>
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:putfield        #43  <Field int pointer>
				switch(_cls1..SwitchMap.ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState[state.ordinal()])
	//*  25   49:getstatic       #167 <Field int[] TokenStream$1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
	//*  26   52:aload_0         
	//*  27   53:getfield        #41  <Field TokenStream$TokenizerState state>
	//*  28   56:invokevirtual   #170 <Method int TokenStream$TokenizerState.ordinal()>
	//*  29   59:iaload          
				{
	//*  30   60:tableswitch     1 5: default 96
	//	               1 139
	//	               2 129
	//	               3 119
	//	               4 109
	//	               5 99
	//*  31   96:goto            16
				case 5: // '\005'
					handleRightParenthesisState(c, ((List) (arraylist)), stringbuffer);
	//   32   99:aload_0         
	//   33  100:iload_1         
	//   34  101:aload_2         
	//   35  102:aload_3         
	//   36  103:invokespecial   #172 <Method void handleRightParenthesisState(char, List, StringBuffer)>
					break;

	//*  37  106:goto            16
				case 4: // '\004'
					handleKeywordState(c, ((List) (arraylist)), stringbuffer);
	//   38  109:aload_0         
	//   39  110:iload_1         
	//   40  111:aload_2         
	//   41  112:aload_3         
	//   42  113:invokespecial   #174 <Method void handleKeywordState(char, List, StringBuffer)>
					break;

	//*  43  116:goto            16
				case 3: // '\003'
					processOption(c, ((List) (arraylist)), stringbuffer);
	//   44  119:aload_0         
	//   45  120:iload_1         
	//   46  121:aload_2         
	//   47  122:aload_3         
	//   48  123:invokespecial   #176 <Method void processOption(char, List, StringBuffer)>
					break;

	//*  49  126:goto            16
				case 2: // '\002'
					handleFormatModifierState(c, ((List) (arraylist)), stringbuffer);
	//   50  129:aload_0         
	//   51  130:iload_1         
	//   52  131:aload_2         
	//   53  132:aload_3         
	//   54  133:invokespecial   #178 <Method void handleFormatModifierState(char, List, StringBuffer)>
					break;

	//*  55  136:goto            16
				case 1: // '\001'
					handleLiteralState(c, ((List) (arraylist)), stringbuffer);
	//   56  139:aload_0         
	//   57  140:iload_1         
	//   58  141:aload_2         
	//   59  142:aload_3         
	//   60  143:invokespecial   #180 <Method void handleLiteralState(char, List, StringBuffer)>
					break;
				}
			} else
	//*  61  146:goto            16
			{
				switch(_cls1..SwitchMap.ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState[state.ordinal()])
	//*  62  149:getstatic       #167 <Field int[] TokenStream$1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState>
	//*  63  152:aload_0         
	//*  64  153:getfield        #41  <Field TokenStream$TokenizerState state>
	//*  65  156:invokevirtual   #170 <Method int TokenStream$TokenizerState.ordinal()>
	//*  66  159:iaload          
				{
	//*  67  160:tableswitch     1 5: default 196
	//	               1 243
	//	               2 233
	//	               3 233
	//	               4 210
	//	               5 198
				default:
					return ((List) (arraylist));
	//   68  196:aload_2         
	//   69  197:areturn         

				case 5: // '\005'
					((List) (arraylist)).add(((Object) (Token.RIGHT_PARENTHESIS_TOKEN)));
	//   70  198:aload_2         
	//   71  199:getstatic       #145 <Field Token Token.RIGHT_PARENTHESIS_TOKEN>
	//   72  202:invokeinterface #81  <Method boolean List.add(Object)>
	//   73  207:pop             
					return ((List) (arraylist));
	//   74  208:aload_2         
	//   75  209:areturn         

				case 4: // '\004'
					((List) (arraylist)).add(((Object) (new Token(1004, ((Object) (stringbuffer.toString()))))));
	//   76  210:aload_2         
	//   77  211:new             #68  <Class Token>
	//   78  214:dup             
	//   79  215:sipush          1004
	//   80  218:aload_3         
	//   81  219:invokevirtual   #72  <Method String StringBuffer.toString()>
	//   82  222:invokespecial   #75  <Method void Token(int, Object)>
	//   83  225:invokeinterface #81  <Method boolean List.add(Object)>
	//   84  230:pop             
					return ((List) (arraylist));
	//   85  231:aload_2         
	//   86  232:areturn         

				case 2: // '\002'
				case 3: // '\003'
					throw new ScanException("Unexpected end of pattern string");
	//   87  233:new             #182 <Class ScanException>
	//   88  236:dup             
	//   89  237:ldc1            #184 <String "Unexpected end of pattern string">
	//   90  239:invokespecial   #185 <Method void ScanException(String)>
	//   91  242:athrow          

				case 1: // '\001'
					addValuedToken(1000, stringbuffer, ((List) (arraylist)));
	//   92  243:aload_0         
	//   93  244:sipush          1000
	//   94  247:aload_3         
	//   95  248:aload_2         
	//   96  249:invokespecial   #91  <Method void addValuedToken(int, StringBuffer, List)>
					return ((List) (arraylist));
	//   97  252:aload_2         
	//   98  253:areturn         
				}
			}
		while(true);
	}

	final IEscapeUtil escapeUtil;
	final IEscapeUtil optionEscapeUtil;
	final String pattern;
	final int patternLength;
	int pointer;
	TokenizerState state;
}
