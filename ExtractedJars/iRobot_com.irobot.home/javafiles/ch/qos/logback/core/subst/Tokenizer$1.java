// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			Tokenizer

static class Tokenizer$1
{

	static final int $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[];

	static 
	{
		$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = new int[kenizerState.values().length];
	//    0    0:invokestatic    #18  <Method Tokenizer$TokenizerState[] Tokenizer$TokenizerState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState>
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[kenizerState.LITERAL_STATE.ordinal()] = 1;
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
			$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[kenizerState.START_STATE.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[kenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
