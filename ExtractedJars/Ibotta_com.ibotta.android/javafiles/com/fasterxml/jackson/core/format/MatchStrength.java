// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;


public final class MatchStrength extends Enum
{

	private MatchStrength(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MatchStrength valueOf(String s)
	{
		return (MatchStrength)Enum.valueOf(com/fasterxml/jackson/core/format/MatchStrength, s);
	//    0    0:ldc1            #2   <Class MatchStrength>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MatchStrength>
	//    4    9:areturn         
	}

	public static MatchStrength[] values()
	{
		return (MatchStrength[])((MatchStrength []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field MatchStrength[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.fasterxml.jackson.core.format.MatchStrength_3B_.clone()>
	//    2    6:checkcast       #47  <Class MatchStrength[]>
	//    3    9:areturn         
	}

	private static final MatchStrength $VALUES[];
	public static final MatchStrength FULL_MATCH;
	public static final MatchStrength INCONCLUSIVE;
	public static final MatchStrength NO_MATCH;
	public static final MatchStrength SOLID_MATCH;
	public static final MatchStrength WEAK_MATCH;

	static 
	{
		NO_MATCH = new MatchStrength("NO_MATCH", 0);
	//    0    0:new             #2   <Class MatchStrength>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "NO_MATCH">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void MatchStrength(String, int)>
	//    5   10:putstatic       #22  <Field MatchStrength NO_MATCH>
		INCONCLUSIVE = new MatchStrength("INCONCLUSIVE", 1);
	//    6   13:new             #2   <Class MatchStrength>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "INCONCLUSIVE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void MatchStrength(String, int)>
	//   11   23:putstatic       #25  <Field MatchStrength INCONCLUSIVE>
		WEAK_MATCH = new MatchStrength("WEAK_MATCH", 2);
	//   12   26:new             #2   <Class MatchStrength>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "WEAK_MATCH">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void MatchStrength(String, int)>
	//   17   36:putstatic       #28  <Field MatchStrength WEAK_MATCH>
		SOLID_MATCH = new MatchStrength("SOLID_MATCH", 3);
	//   18   39:new             #2   <Class MatchStrength>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "SOLID_MATCH">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void MatchStrength(String, int)>
	//   23   49:putstatic       #31  <Field MatchStrength SOLID_MATCH>
		FULL_MATCH = new MatchStrength("FULL_MATCH", 4);
	//   24   52:new             #2   <Class MatchStrength>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "FULL_MATCH">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void MatchStrength(String, int)>
	//   29   62:putstatic       #34  <Field MatchStrength FULL_MATCH>
		$VALUES = (new MatchStrength[] {
			NO_MATCH, INCONCLUSIVE, WEAK_MATCH, SOLID_MATCH, FULL_MATCH
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       MatchStrength[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field MatchStrength NO_MATCH>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field MatchStrength INCONCLUSIVE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field MatchStrength WEAK_MATCH>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field MatchStrength SOLID_MATCH>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field MatchStrength FULL_MATCH>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field MatchStrength[] $VALUES>
	//*  53  102:return          
	}
}
