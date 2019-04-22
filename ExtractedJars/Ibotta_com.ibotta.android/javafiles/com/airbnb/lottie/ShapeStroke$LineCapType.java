// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			ShapeStroke

static final class ShapeStroke$LineCapType extends Enum
{

	public static ShapeStroke$LineCapType valueOf(String s)
	{
		return (ShapeStroke$LineCapType)Enum.valueOf(com/airbnb/lottie/ShapeStroke$LineCapType, s);
	//    0    0:ldc1            #2   <Class ShapeStroke$LineCapType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShapeStroke$LineCapType>
	//    4    9:areturn         
	}

	public static ShapeStroke$LineCapType[] values()
	{
		return (ShapeStroke$LineCapType[])((ShapeStroke$LineCapType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ShapeStroke$LineCapType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.ShapeStroke$LineCapType_3B_.clone()>
	//    2    6:checkcast       #42  <Class ShapeStroke$LineCapType[]>
	//    3    9:areturn         
	}

	android.graphics.Paint.Cap toPaintCap()
	{
		switch(ShapeStroke._cls1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[ordinal()])
	//*   0    0:getstatic       #54  <Field int[] ShapeStroke$1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #58  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 40
	//	               2 36
		default:
			return android.graphics.Paint.Cap.SQUARE;
	//    5   32:getstatic       #64  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
	//    6   35:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Cap.ROUND;
	//    7   36:getstatic       #67  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//    8   39:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Cap.BUTT;
	//    9   40:getstatic       #70  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   10   43:areturn         
		}
	}

	private static final ShapeStroke$LineCapType $VALUES[];
	public static final ShapeStroke$LineCapType Butt;
	public static final ShapeStroke$LineCapType Round;
	public static final ShapeStroke$LineCapType Unknown;

	static 
	{
		Butt = new ShapeStroke$LineCapType("Butt", 0);
	//    0    0:new             #2   <Class ShapeStroke$LineCapType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Butt">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
	//    5   10:putstatic       #23  <Field ShapeStroke$LineCapType Butt>
		Round = new ShapeStroke$LineCapType("Round", 1);
	//    6   13:new             #2   <Class ShapeStroke$LineCapType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Round">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
	//   11   23:putstatic       #26  <Field ShapeStroke$LineCapType Round>
		Unknown = new ShapeStroke$LineCapType("Unknown", 2);
	//   12   26:new             #2   <Class ShapeStroke$LineCapType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Unknown">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
	//   17   36:putstatic       #29  <Field ShapeStroke$LineCapType Unknown>
		$VALUES = (new ShapeStroke$LineCapType[] {
			Butt, Round, Unknown
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ShapeStroke$LineCapType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ShapeStroke$LineCapType Butt>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ShapeStroke$LineCapType Round>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ShapeStroke$LineCapType Unknown>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ShapeStroke$LineCapType[] $VALUES>
	//*  33   64:return          
	}

	private ShapeStroke$LineCapType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
