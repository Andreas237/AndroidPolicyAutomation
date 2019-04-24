// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;


// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			TokenStream

static final class TokenStream$TokenizerState extends Enum
{

	public static TokenStream$TokenizerState valueOf(String s)
	{
		return (TokenStream$TokenizerState)Enum.valueOf(ch/qos/logback/core/pattern/parser/TokenStream$TokenizerState, s);
	//    0    0:ldc1            #2   <Class TokenStream$TokenizerState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TokenStream$TokenizerState>
	//    4    9:areturn         
	}

	public static TokenStream$TokenizerState[] values()
	{
		return (TokenStream$TokenizerState[])((TokenStream$TokenizerState []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field TokenStream$TokenizerState[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lch.qos.logback.core.pattern.parser.TokenStream$TokenizerState_3B_.clone()>
	//    2    6:checkcast       #50  <Class TokenStream$TokenizerState[]>
	//    3    9:areturn         
	}

	private static final TokenStream$TokenizerState $VALUES[];
	public static final TokenStream$TokenizerState FORMAT_MODIFIER_STATE;
	public static final TokenStream$TokenizerState KEYWORD_STATE;
	public static final TokenStream$TokenizerState LITERAL_STATE;
	public static final TokenStream$TokenizerState OPTION_STATE;
	public static final TokenStream$TokenizerState RIGHT_PARENTHESIS_STATE;

	static 
	{
		LITERAL_STATE = new TokenStream$TokenizerState("LITERAL_STATE", 0);
	//    0    0:new             #2   <Class TokenStream$TokenizerState>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "LITERAL_STATE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
	//    5   10:putstatic       #25  <Field TokenStream$TokenizerState LITERAL_STATE>
		FORMAT_MODIFIER_STATE = new TokenStream$TokenizerState("FORMAT_MODIFIER_STATE", 1);
	//    6   13:new             #2   <Class TokenStream$TokenizerState>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "FORMAT_MODIFIER_STATE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
	//   11   23:putstatic       #28  <Field TokenStream$TokenizerState FORMAT_MODIFIER_STATE>
		KEYWORD_STATE = new TokenStream$TokenizerState("KEYWORD_STATE", 2);
	//   12   26:new             #2   <Class TokenStream$TokenizerState>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "KEYWORD_STATE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
	//   17   36:putstatic       #31  <Field TokenStream$TokenizerState KEYWORD_STATE>
		OPTION_STATE = new TokenStream$TokenizerState("OPTION_STATE", 3);
	//   18   39:new             #2   <Class TokenStream$TokenizerState>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "OPTION_STATE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
	//   23   49:putstatic       #34  <Field TokenStream$TokenizerState OPTION_STATE>
		RIGHT_PARENTHESIS_STATE = new TokenStream$TokenizerState("RIGHT_PARENTHESIS_STATE", 4);
	//   24   52:new             #2   <Class TokenStream$TokenizerState>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "RIGHT_PARENTHESIS_STATE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void TokenStream$TokenizerState(String, int)>
	//   29   62:putstatic       #37  <Field TokenStream$TokenizerState RIGHT_PARENTHESIS_STATE>
		$VALUES = (new TokenStream$TokenizerState[] {
			LITERAL_STATE, FORMAT_MODIFIER_STATE, KEYWORD_STATE, OPTION_STATE, RIGHT_PARENTHESIS_STATE
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       TokenStream$TokenizerState[]
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

	private TokenStream$TokenizerState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
