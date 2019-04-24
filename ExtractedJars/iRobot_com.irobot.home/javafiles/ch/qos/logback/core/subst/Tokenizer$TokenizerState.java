// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			Tokenizer

static final class Tokenizer$TokenizerState extends Enum
{

	public static Tokenizer$TokenizerState valueOf(String s)
	{
		return (Tokenizer$TokenizerState)Enum.valueOf(ch/qos/logback/core/subst/Tokenizer$TokenizerState, s);
	//    0    0:ldc1            #2   <Class Tokenizer$TokenizerState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Tokenizer$TokenizerState>
	//    4    9:areturn         
	}

	public static Tokenizer$TokenizerState[] values()
	{
		return (Tokenizer$TokenizerState[])((Tokenizer$TokenizerState []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Tokenizer$TokenizerState[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lch.qos.logback.core.subst.Tokenizer$TokenizerState_3B_.clone()>
	//    2    6:checkcast       #42  <Class Tokenizer$TokenizerState[]>
	//    3    9:areturn         
	}

	private static final Tokenizer$TokenizerState $VALUES[];
	public static final Tokenizer$TokenizerState DEFAULT_VAL_STATE;
	public static final Tokenizer$TokenizerState LITERAL_STATE;
	public static final Tokenizer$TokenizerState START_STATE;

	static 
	{
		LITERAL_STATE = new Tokenizer$TokenizerState("LITERAL_STATE", 0);
	//    0    0:new             #2   <Class Tokenizer$TokenizerState>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LITERAL_STATE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
	//    5   10:putstatic       #23  <Field Tokenizer$TokenizerState LITERAL_STATE>
		START_STATE = new Tokenizer$TokenizerState("START_STATE", 1);
	//    6   13:new             #2   <Class Tokenizer$TokenizerState>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "START_STATE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
	//   11   23:putstatic       #26  <Field Tokenizer$TokenizerState START_STATE>
		DEFAULT_VAL_STATE = new Tokenizer$TokenizerState("DEFAULT_VAL_STATE", 2);
	//   12   26:new             #2   <Class Tokenizer$TokenizerState>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "DEFAULT_VAL_STATE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Tokenizer$TokenizerState(String, int)>
	//   17   36:putstatic       #29  <Field Tokenizer$TokenizerState DEFAULT_VAL_STATE>
		$VALUES = (new Tokenizer$TokenizerState[] {
			LITERAL_STATE, START_STATE, DEFAULT_VAL_STATE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Tokenizer$TokenizerState[]
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

	private Tokenizer$TokenizerState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
