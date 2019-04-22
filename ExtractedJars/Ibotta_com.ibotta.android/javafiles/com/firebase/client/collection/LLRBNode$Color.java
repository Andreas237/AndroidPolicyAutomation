// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;


// Referenced classes of package com.firebase.client.collection:
//			LLRBNode

public static final class LLRBNode$Color extends Enum
{

	public static LLRBNode$Color valueOf(String s)
	{
		return (LLRBNode$Color)Enum.valueOf(com/firebase/client/collection/LLRBNode$Color, s);
	//    0    0:ldc1            #2   <Class LLRBNode$Color>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LLRBNode$Color>
	//    4    9:areturn         
	}

	public static LLRBNode$Color[] values()
	{
		return (LLRBNode$Color[])((LLRBNode$Color []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field LLRBNode$Color[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.collection.LLRBNode$Color_3B_.clone()>
	//    2    6:checkcast       #38  <Class LLRBNode$Color[]>
	//    3    9:areturn         
	}

	private static final LLRBNode$Color $VALUES[];
	public static final LLRBNode$Color BLACK;
	public static final LLRBNode$Color RED;

	static 
	{
		RED = new LLRBNode$Color("RED", 0);
	//    0    0:new             #2   <Class LLRBNode$Color>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "RED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void LLRBNode$Color(String, int)>
	//    5   10:putstatic       #22  <Field LLRBNode$Color RED>
		BLACK = new LLRBNode$Color("BLACK", 1);
	//    6   13:new             #2   <Class LLRBNode$Color>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "BLACK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void LLRBNode$Color(String, int)>
	//   11   23:putstatic       #25  <Field LLRBNode$Color BLACK>
		$VALUES = (new LLRBNode$Color[] {
			RED, BLACK
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       LLRBNode$Color[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field LLRBNode$Color RED>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field LLRBNode$Color BLACK>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field LLRBNode$Color[] $VALUES>
	//*  23   45:return          
	}

	private LLRBNode$Color(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
