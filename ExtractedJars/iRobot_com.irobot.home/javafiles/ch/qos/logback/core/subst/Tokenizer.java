// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;

import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.subst:
//			Token

public class Tokenizer
{
	static final class TokenizerState extends Enum
	{

		public static TokenizerState valueOf(String s)
		{
			return (TokenizerState)Enum.valueOf(ch/qos/logback/core/subst/Tokenizer$TokenizerState, s);
		//    0    0:ldc1            #2   <Class Tokenizer$TokenizerState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Tokenizer$TokenizerState>
		//    4    9:areturn         
		}

		public static TokenizerState[] values()
		{
			return (TokenizerState[])((TokenizerState []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Tokenizer$TokenizerState[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lch.qos.logback.core.subst.Tokenizer$TokenizerState_3B_.clone()>
		//    2    6:checkcast       #42  <Class Tokenizer$TokenizerState[]>
		//    3    9:areturn         
		}

		private static final TokenizerState $VALUES[];
		public static final TokenizerState DEFAULT_VAL_STATE;
		public static final TokenizerState LITERAL_STATE;
		public static final TokenizerState START_STATE;

		static 
		{
			LITERAL_STATE = new TokenizerState("LITERAL_STATE", 0);
		//    0    0:new             #2   <Class Tokenizer$TokenizerState>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LITERAL_STATE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
		//    5   10:putstatic       #23  <Field Tokenizer$TokenizerState LITERAL_STATE>
			START_STATE = new TokenizerState("START_STATE", 1);
		//    6   13:new             #2   <Class Tokenizer$TokenizerState>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "START_STATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
		//   11   23:putstatic       #26  <Field Tokenizer$TokenizerState START_STATE>
			DEFAULT_VAL_STATE = new TokenizerState("DEFAULT_VAL_STATE", 2);
		//   12   26:new             #2   <Class Tokenizer$TokenizerState>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DEFAULT_VAL_STATE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
		//   17   36:putstatic       #29  <Field Tokenizer$TokenizerState DEFAULT_VAL_STATE>
			$VALUES = (new TokenizerState[] {
				LITERAL_STATE, START_STATE, DEFAULT_VAL_STATE
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       TokenizerState[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Tokenizer$TokenizerState LITERAL_STATE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Tokenizer$TokenizerState START_STATE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Tokenizer$TokenizerState DEFAULT_VAL_STATE>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Tokenizer$TokenizerState[] $VALUES>
		//*  33   64:return          
		}

		private TokenizerState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Tokenizer(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		state = TokenizerState.LITERAL_STATE;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.LITERAL_STATE>
	//    4    8:putfield        #26  <Field Tokenizer$TokenizerState state>
		pointer = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #28  <Field int pointer>
		pattern = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #30  <Field String pattern>
		patternLength = s.length();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #36  <Method int String.length()>
	//   14   26:putfield        #38  <Field int patternLength>
	//   15   29:return          
	}

	private void addLiteralToken(List list, StringBuilder stringbuilder)
	{
		if(stringbuilder.length() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #44  <Method int StringBuilder.length()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			list.add(((Object) (new Token(Token.Type.LITERAL, stringbuilder.toString()))));
	//    4    8:aload_1         
	//    5    9:new             #46  <Class Token>
	//    6   12:dup             
	//    7   13:getstatic       #52  <Field Token$Type Token$Type.LITERAL>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   10   20:invokespecial   #59  <Method void Token(Token$Type, String)>
	//   11   23:invokeinterface #65  <Method boolean List.add(Object)>
	//   12   28:pop             
			return;
	//   13   29:return          
		}
	}

	private void handleDefaultValueState(char c, List list, StringBuilder stringbuilder)
	{
		if(c != '$')
	//*   0    0:iload_1         
	//*   1    1:bipush          36
	//*   2    3:icmpeq          48
		{
			if(c != '-')
	//*   3    6:iload_1         
	//*   4    7:bipush          45
	//*   5    9:icmpeq          35
			{
				stringbuilder.append(':');
	//    6   12:aload_3         
	//    7   13:bipush          58
	//    8   15:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//    9   18:pop             
				stringbuilder.append(c);
	//   10   19:aload_3         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   13   24:pop             
			} else
	//*  14   25:getstatic       #24  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.LITERAL_STATE>
	//*  15   28:astore_2        
	//*  16   29:aload_0         
	//*  17   30:aload_2         
	//*  18   31:putfield        #26  <Field Tokenizer$TokenizerState state>
	//*  19   34:return          
			{
				list.add(((Object) (Token.DEFAULT_SEP_TOKEN)));
	//   20   35:aload_2         
	//   21   36:getstatic       #77  <Field Token Token.DEFAULT_SEP_TOKEN>
	//   22   39:invokeinterface #65  <Method boolean List.add(Object)>
	//   23   44:pop             
			}
			list = ((List) (TokenizerState.LITERAL_STATE));
		} else
	//*  24   45:goto            25
		{
			stringbuilder.append(':');
	//   25   48:aload_3         
	//   26   49:bipush          58
	//   27   51:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   28   54:pop             
			addLiteralToken(list, stringbuilder);
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
			stringbuilder.setLength(0);
	//   33   61:aload_3         
	//   34   62:iconst_0        
	//   35   63:invokevirtual   #83  <Method void StringBuilder.setLength(int)>
			list = ((List) (TokenizerState.START_STATE));
	//   36   66:getstatic       #86  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.START_STATE>
	//   37   69:astore_2        
		}
		state = ((TokenizerState) (list));
	//*  38   70:goto            29
	}

	private void handleLiteralState(char c, List list, StringBuilder stringbuilder)
	{
		if(c != '$') goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          36
	//    2    3:icmpne          27
_L1:
		addLiteralToken(list, stringbuilder);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
		stringbuilder.setLength(0);
	//    7   12:aload_3         
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #83  <Method void StringBuilder.setLength(int)>
		list = ((List) (TokenizerState.START_STATE));
	//   10   17:getstatic       #86  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.START_STATE>
	//   11   20:astore_2        
_L4:
		state = ((TokenizerState) (list));
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:putfield        #26  <Field Tokenizer$TokenizerState state>
		return;
	//   15   26:return          
_L2:
		if(c != ':')
			break; /* Loop/switch isn't completed */
	//   16   27:iload_1         
	//   17   28:bipush          58
	//   18   30:icmpne          51
		addLiteralToken(list, stringbuilder);
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:aload_3         
	//   22   36:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
		stringbuilder.setLength(0);
	//   23   39:aload_3         
	//   24   40:iconst_0        
	//   25   41:invokevirtual   #83  <Method void StringBuilder.setLength(int)>
		list = ((List) (TokenizerState.DEFAULT_VAL_STATE));
	//   26   44:getstatic       #91  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.DEFAULT_VAL_STATE>
	//   27   47:astore_2        
		if(true) goto _L4; else goto _L3
	//   28   48:goto            21
_L3:
		Token token;
		if(c == '{')
	//*  29   51:iload_1         
	//*  30   52:bipush          123
	//*  31   54:icmpne          83
		{
			addLiteralToken(list, stringbuilder);
	//   32   57:aload_0         
	//   33   58:aload_2         
	//   34   59:aload_3         
	//   35   60:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
			token = Token.CURLY_LEFT_TOKEN;
	//   36   63:getstatic       #94  <Field Token Token.CURLY_LEFT_TOKEN>
	//   37   66:astore          4
		} else
	//*  38   68:aload_2         
	//*  39   69:aload           4
	//*  40   71:invokeinterface #65  <Method boolean List.add(Object)>
	//*  41   76:pop             
	//*  42   77:aload_3         
	//*  43   78:iconst_0        
	//*  44   79:invokevirtual   #83  <Method void StringBuilder.setLength(int)>
	//*  45   82:return          
		if(c == '}')
	//*  46   83:iload_1         
	//*  47   84:bipush          125
	//*  48   86:icmpne          103
		{
			addLiteralToken(list, stringbuilder);
	//   49   89:aload_0         
	//   50   90:aload_2         
	//   51   91:aload_3         
	//   52   92:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
			token = Token.CURLY_RIGHT_TOKEN;
	//   53   95:getstatic       #97  <Field Token Token.CURLY_RIGHT_TOKEN>
	//   54   98:astore          4
		} else
	//*  55  100:goto            68
		{
			stringbuilder.append(c);
	//   56  103:aload_3         
	//   57  104:iload_1         
	//   58  105:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   59  108:pop             
			return;
	//   60  109:return          
		}
		list.add(((Object) (token)));
		stringbuilder.setLength(0);
		return;
	}

	private void handleStartState(char c, List list, StringBuilder stringbuilder)
	{
		if(c == '{')
	//*   0    0:iload_1         
	//*   1    1:bipush          123
	//*   2    3:icmpne          19
		{
			list.add(((Object) (Token.START_TOKEN)));
	//    3    6:aload_2         
	//    4    7:getstatic       #101 <Field Token Token.START_TOKEN>
	//    5   10:invokeinterface #65  <Method boolean List.add(Object)>
	//    6   15:pop             
		} else
	//*   7   16:goto            32
		{
			stringbuilder.append('$');
	//    8   19:aload_3         
	//    9   20:bipush          36
	//   10   22:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   11   25:pop             
			stringbuilder.append(c);
	//   12   26:aload_3         
	//   13   27:iload_1         
	//   14   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   15   31:pop             
		}
		state = TokenizerState.LITERAL_STATE;
	//   16   32:aload_0         
	//   17   33:getstatic       #24  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.LITERAL_STATE>
	//   18   36:putfield        #26  <Field Tokenizer$TokenizerState state>
	//   19   39:return          
	}

	List tokenize()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #105 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void ArrayList()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #43  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #107 <Method void StringBuilder()>
	//    7   15:astore_3        
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = new int[TokenizerState.values().length];
			//    0    0:invokestatic    #18  <Method Tokenizer$TokenizerState[] Tokenizer$TokenizerState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
				try
				{
					$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.LITERAL_STATE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
			//    5   12:getstatic       #24  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.LITERAL_STATE>
			//    6   15:invokevirtual   #28  <Method int Tokenizer$TokenizerState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
			//*  10   23:getstatic       #31  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.START_STATE>
			//*  11   26:invokevirtual   #28  <Method int Tokenizer$TokenizerState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
			//*  15   34:getstatic       #34  <Field Tokenizer$TokenizerState Tokenizer$TokenizerState.DEFAULT_VAL_STATE>
			//*  16   37:invokevirtual   #28  <Method int Tokenizer$TokenizerState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		do
			if(pointer < patternLength)
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field int pointer>
	//*  10   20:aload_0         
	//*  11   21:getfield        #38  <Field int patternLength>
	//*  12   24:icmpge          121
			{
				char c = pattern.charAt(pointer);
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field String pattern>
	//   15   31:aload_0         
	//   16   32:getfield        #28  <Field int pointer>
	//   17   35:invokevirtual   #111 <Method char String.charAt(int)>
	//   18   38:istore_1        
				pointer = pointer + 1;
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #28  <Field int pointer>
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:putfield        #28  <Field int pointer>
				switch(_cls1..SwitchMap.ch.qos.logback.core.subst.Tokenizer.TokenizerState[state.ordinal()])
	//*  25   49:getstatic       #115 <Field int[] Tokenizer$1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
	//*  26   52:aload_0         
	//*  27   53:getfield        #26  <Field Tokenizer$TokenizerState state>
	//*  28   56:invokevirtual   #118 <Method int Tokenizer$TokenizerState.ordinal()>
	//*  29   59:iaload          
				{
	//*  30   60:tableswitch     1 3: default 88
	//	               1 111
	//	               2 101
	//	               3 91
	//*  31   88:goto            16
				case 3: // '\003'
					handleDefaultValueState(c, ((List) (arraylist)), stringbuilder);
	//   32   91:aload_0         
	//   33   92:iload_1         
	//   34   93:aload_2         
	//   35   94:aload_3         
	//   36   95:invokespecial   #120 <Method void handleDefaultValueState(char, List, StringBuilder)>
					break;

	//*  37   98:goto            16
				case 2: // '\002'
					handleStartState(c, ((List) (arraylist)), stringbuilder);
	//   38  101:aload_0         
	//   39  102:iload_1         
	//   40  103:aload_2         
	//   41  104:aload_3         
	//   42  105:invokespecial   #122 <Method void handleStartState(char, List, StringBuilder)>
					break;

	//*  43  108:goto            16
				case 1: // '\001'
					handleLiteralState(c, ((List) (arraylist)), stringbuilder);
	//   44  111:aload_0         
	//   45  112:iload_1         
	//   46  113:aload_2         
	//   47  114:aload_3         
	//   48  115:invokespecial   #124 <Method void handleLiteralState(char, List, StringBuilder)>
					break;
				}
			} else
	//*  49  118:goto            16
			{
				switch(_cls1..SwitchMap.ch.qos.logback.core.subst.Tokenizer.TokenizerState[state.ordinal()])
	//*  50  121:getstatic       #115 <Field int[] Tokenizer$1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
	//*  51  124:aload_0         
	//*  52  125:getfield        #26  <Field Tokenizer$TokenizerState state>
	//*  53  128:invokevirtual   #118 <Method int Tokenizer$TokenizerState.ordinal()>
	//*  54  131:iaload          
				{
	//*  55  132:tableswitch     1 2: default 156
	//	               1 168
	//	               2 158
				default:
					return ((List) (arraylist));
	//   56  156:aload_2         
	//   57  157:areturn         

				case 2: // '\002'
					throw new ScanException("Unexpected end of pattern string");
	//   58  158:new             #126 <Class ScanException>
	//   59  161:dup             
	//   60  162:ldc1            #128 <String "Unexpected end of pattern string">
	//   61  164:invokespecial   #130 <Method void ScanException(String)>
	//   62  167:athrow          

				case 1: // '\001'
					addLiteralToken(((List) (arraylist)), stringbuilder);
	//   63  168:aload_0         
	//   64  169:aload_2         
	//   65  170:aload_3         
	//   66  171:invokespecial   #79  <Method void addLiteralToken(List, StringBuilder)>
					break;
				}
				return ((List) (arraylist));
	//   67  174:aload_2         
	//   68  175:areturn         
			}
		while(true);
	}

	final String pattern;
	final int patternLength;
	int pointer;
	TokenizerState state;
}
