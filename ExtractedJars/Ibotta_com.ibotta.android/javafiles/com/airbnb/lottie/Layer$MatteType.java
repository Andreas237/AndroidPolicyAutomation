// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			Layer

static final class Layer$MatteType extends Enum
{

	public static Layer$MatteType valueOf(String s)
	{
		return (Layer$MatteType)Enum.valueOf(com/airbnb/lottie/Layer$MatteType, s);
	//    0    0:ldc1            #2   <Class Layer$MatteType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Layer$MatteType>
	//    4    9:areturn         
	}

	public static Layer$MatteType[] values()
	{
		return (Layer$MatteType[])((Layer$MatteType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Layer$MatteType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.airbnb.lottie.Layer$MatteType_3B_.clone()>
	//    2    6:checkcast       #46  <Class Layer$MatteType[]>
	//    3    9:areturn         
	}

	private static final Layer$MatteType $VALUES[];
	public static final Layer$MatteType Add;
	public static final Layer$MatteType Invert;
	public static final Layer$MatteType None;
	public static final Layer$MatteType Unknown;

	static 
	{
		None = new Layer$MatteType("None", 0);
	//    0    0:new             #2   <Class Layer$MatteType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Layer$MatteType(String, int)>
	//    5   10:putstatic       #24  <Field Layer$MatteType None>
		Add = new Layer$MatteType("Add", 1);
	//    6   13:new             #2   <Class Layer$MatteType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "Add">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Layer$MatteType(String, int)>
	//   11   23:putstatic       #27  <Field Layer$MatteType Add>
		Invert = new Layer$MatteType("Invert", 2);
	//   12   26:new             #2   <Class Layer$MatteType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "Invert">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Layer$MatteType(String, int)>
	//   17   36:putstatic       #30  <Field Layer$MatteType Invert>
		Unknown = new Layer$MatteType("Unknown", 3);
	//   18   39:new             #2   <Class Layer$MatteType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "Unknown">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Layer$MatteType(String, int)>
	//   23   49:putstatic       #33  <Field Layer$MatteType Unknown>
		$VALUES = (new Layer$MatteType[] {
			None, Add, Invert, Unknown
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Layer$MatteType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Layer$MatteType None>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Layer$MatteType Add>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Layer$MatteType Invert>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Layer$MatteType Unknown>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Layer$MatteType[] $VALUES>
	//*  43   83:return          
	}

	private Layer$MatteType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
