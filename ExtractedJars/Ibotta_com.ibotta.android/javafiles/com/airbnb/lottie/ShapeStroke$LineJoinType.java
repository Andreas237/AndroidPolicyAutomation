// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			ShapeStroke

static final class ShapeStroke$LineJoinType extends Enum
{

	public static ShapeStroke$LineJoinType valueOf(String s)
	{
		return (ShapeStroke$LineJoinType)Enum.valueOf(com/airbnb/lottie/ShapeStroke$LineJoinType, s);
	//    0    0:ldc1            #2   <Class ShapeStroke$LineJoinType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShapeStroke$LineJoinType>
	//    4    9:areturn         
	}

	public static ShapeStroke$LineJoinType[] values()
	{
		return (ShapeStroke$LineJoinType[])((ShapeStroke$LineJoinType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ShapeStroke$LineJoinType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.ShapeStroke$LineJoinType_3B_.clone()>
	//    2    6:checkcast       #42  <Class ShapeStroke$LineJoinType[]>
	//    3    9:areturn         
	}

	android.graphics.Paint.Join toPaintJoin()
	{
		switch(ShapeStroke._cls1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[ordinal()])
	//*   0    0:getstatic       #54  <Field int[] ShapeStroke$1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #58  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 46
	//	               2 42
	//	               3 38
		default:
			return null;
	//    5   36:aconst_null     
	//    6   37:areturn         

		case 3: // '\003'
			return android.graphics.Paint.Join.ROUND;
	//    7   38:getstatic       #64  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//    8   41:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Join.MITER;
	//    9   42:getstatic       #67  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   10   45:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Join.BEVEL;
	//   11   46:getstatic       #70  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
	//   12   49:areturn         
		}
	}

	private static final ShapeStroke$LineJoinType $VALUES[];
	public static final ShapeStroke$LineJoinType Bevel;
	public static final ShapeStroke$LineJoinType Miter;
	public static final ShapeStroke$LineJoinType Round;

	static 
	{
		Miter = new ShapeStroke$LineJoinType("Miter", 0);
	//    0    0:new             #2   <Class ShapeStroke$LineJoinType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Miter">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
	//    5   10:putstatic       #23  <Field ShapeStroke$LineJoinType Miter>
		Round = new ShapeStroke$LineJoinType("Round", 1);
	//    6   13:new             #2   <Class ShapeStroke$LineJoinType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Round">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
	//   11   23:putstatic       #26  <Field ShapeStroke$LineJoinType Round>
		Bevel = new ShapeStroke$LineJoinType("Bevel", 2);
	//   12   26:new             #2   <Class ShapeStroke$LineJoinType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Bevel">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
	//   17   36:putstatic       #29  <Field ShapeStroke$LineJoinType Bevel>
		$VALUES = (new ShapeStroke$LineJoinType[] {
			Miter, Round, Bevel
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ShapeStroke$LineJoinType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ShapeStroke$LineJoinType Miter>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ShapeStroke$LineJoinType Round>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ShapeStroke$LineJoinType Bevel>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ShapeStroke$LineJoinType[] $VALUES>
	//*  33   64:return          
	}

	private ShapeStroke$LineJoinType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
