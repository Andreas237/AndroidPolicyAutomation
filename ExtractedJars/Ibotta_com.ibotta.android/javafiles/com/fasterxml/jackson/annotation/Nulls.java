// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


public final class Nulls extends Enum
{

	private Nulls(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Nulls valueOf(String s)
	{
		return (Nulls)Enum.valueOf(com/fasterxml/jackson/annotation/Nulls, s);
	//    0    0:ldc1            #2   <Class Nulls>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Nulls>
	//    4    9:areturn         
	}

	public static Nulls[] values()
	{
		return (Nulls[])((Nulls []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field Nulls[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.fasterxml.jackson.annotation.Nulls_3B_.clone()>
	//    2    6:checkcast       #47  <Class Nulls[]>
	//    3    9:areturn         
	}

	private static final Nulls $VALUES[];
	public static final Nulls AS_EMPTY;
	public static final Nulls DEFAULT;
	public static final Nulls FAIL;
	public static final Nulls SET;
	public static final Nulls SKIP;

	static 
	{
		SET = new Nulls("SET", 0);
	//    0    0:new             #2   <Class Nulls>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "SET">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Nulls(String, int)>
	//    5   10:putstatic       #22  <Field Nulls SET>
		SKIP = new Nulls("SKIP", 1);
	//    6   13:new             #2   <Class Nulls>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "SKIP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Nulls(String, int)>
	//   11   23:putstatic       #25  <Field Nulls SKIP>
		FAIL = new Nulls("FAIL", 2);
	//   12   26:new             #2   <Class Nulls>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "FAIL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void Nulls(String, int)>
	//   17   36:putstatic       #28  <Field Nulls FAIL>
		AS_EMPTY = new Nulls("AS_EMPTY", 3);
	//   18   39:new             #2   <Class Nulls>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "AS_EMPTY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void Nulls(String, int)>
	//   23   49:putstatic       #31  <Field Nulls AS_EMPTY>
		DEFAULT = new Nulls("DEFAULT", 4);
	//   24   52:new             #2   <Class Nulls>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "DEFAULT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void Nulls(String, int)>
	//   29   62:putstatic       #34  <Field Nulls DEFAULT>
		$VALUES = (new Nulls[] {
			SET, SKIP, FAIL, AS_EMPTY, DEFAULT
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       Nulls[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field Nulls SET>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field Nulls SKIP>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field Nulls FAIL>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field Nulls AS_EMPTY>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field Nulls DEFAULT>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field Nulls[] $VALUES>
	//*  53  102:return          
	}
}
