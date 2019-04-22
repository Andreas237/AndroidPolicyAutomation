// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			ShapeTrimPath

static final class ShapeTrimPath$Type extends Enum
{

	static ShapeTrimPath$Type forId(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 61
	//	               2 57
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   24:new             #34  <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #36  <Method void StringBuilder()>
	//    5   31:astore_1        
			stringbuilder.append("Unknown trim path type ");
	//    6   32:aload_1         
	//    7   33:ldc1            #38  <String "Unknown trim path type ">
	//    8   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			stringbuilder.append(i);
	//   10   39:aload_1         
	//   11   40:iload_0         
	//   12   41:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   14   45:new             #47  <Class IllegalArgumentException>
	//   15   48:dup             
	//   16   49:aload_1         
	//   17   50:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   19   56:athrow          

		case 2: // '\002'
			return Individually;
	//   20   57:getstatic       #25  <Field ShapeTrimPath$Type Individually>
	//   21   60:areturn         

		case 1: // '\001'
			return Simultaneously;
	//   22   61:getstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
	//   23   64:areturn         
		}
	}

	public static ShapeTrimPath$Type valueOf(String s)
	{
		return (ShapeTrimPath$Type)Enum.valueOf(com/airbnb/lottie/ShapeTrimPath$Type, s);
	//    0    0:ldc1            #2   <Class ShapeTrimPath$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShapeTrimPath$Type>
	//    4    9:areturn         
	}

	public static ShapeTrimPath$Type[] values()
	{
		return (ShapeTrimPath$Type[])((ShapeTrimPath$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ShapeTrimPath$Type[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.airbnb.lottie.ShapeTrimPath$Type_3B_.clone()>
	//    2    6:checkcast       #62  <Class ShapeTrimPath$Type[]>
	//    3    9:areturn         
	}

	private static final ShapeTrimPath$Type $VALUES[];
	public static final ShapeTrimPath$Type Individually;
	public static final ShapeTrimPath$Type Simultaneously;

	static 
	{
		Simultaneously = new ShapeTrimPath$Type("Simultaneously", 0);
	//    0    0:new             #2   <Class ShapeTrimPath$Type>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "Simultaneously">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ShapeTrimPath$Type(String, int)>
	//    5   10:putstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
		Individually = new ShapeTrimPath$Type("Individually", 1);
	//    6   13:new             #2   <Class ShapeTrimPath$Type>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "Individually">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ShapeTrimPath$Type(String, int)>
	//   11   23:putstatic       #25  <Field ShapeTrimPath$Type Individually>
		$VALUES = (new ShapeTrimPath$Type[] {
			Simultaneously, Individually
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ShapeTrimPath$Type[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ShapeTrimPath$Type Simultaneously>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ShapeTrimPath$Type Individually>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ShapeTrimPath$Type[] $VALUES>
	//*  23   45:return          
	}

	private ShapeTrimPath$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
