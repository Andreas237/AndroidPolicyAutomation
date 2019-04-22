// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			Layer

static final class Layer$LayerType extends Enum
{

	public static Layer$LayerType valueOf(String s)
	{
		return (Layer$LayerType)Enum.valueOf(com/airbnb/lottie/Layer$LayerType, s);
	//    0    0:ldc1            #2   <Class Layer$LayerType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Layer$LayerType>
	//    4    9:areturn         
	}

	public static Layer$LayerType[] values()
	{
		return (Layer$LayerType[])((Layer$LayerType []) ($VALUES)).clone();
	//    0    0:getstatic       #47  <Field Layer$LayerType[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.airbnb.lottie.Layer$LayerType_3B_.clone()>
	//    2    6:checkcast       #58  <Class Layer$LayerType[]>
	//    3    9:areturn         
	}

	private static final Layer$LayerType $VALUES[];
	public static final Layer$LayerType Image;
	public static final Layer$LayerType Null;
	public static final Layer$LayerType PreComp;
	public static final Layer$LayerType Shape;
	public static final Layer$LayerType Solid;
	public static final Layer$LayerType Text;
	public static final Layer$LayerType Unknown;

	static 
	{
		PreComp = new Layer$LayerType("PreComp", 0);
	//    0    0:new             #2   <Class Layer$LayerType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "PreComp">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//    5   10:putstatic       #27  <Field Layer$LayerType PreComp>
		Solid = new Layer$LayerType("Solid", 1);
	//    6   13:new             #2   <Class Layer$LayerType>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "Solid">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   11   23:putstatic       #30  <Field Layer$LayerType Solid>
		Image = new Layer$LayerType("Image", 2);
	//   12   26:new             #2   <Class Layer$LayerType>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "Image">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   17   36:putstatic       #33  <Field Layer$LayerType Image>
		Null = new Layer$LayerType("Null", 3);
	//   18   39:new             #2   <Class Layer$LayerType>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "Null">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   23   49:putstatic       #36  <Field Layer$LayerType Null>
		Shape = new Layer$LayerType("Shape", 4);
	//   24   52:new             #2   <Class Layer$LayerType>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "Shape">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   29   62:putstatic       #39  <Field Layer$LayerType Shape>
		Text = new Layer$LayerType("Text", 5);
	//   30   65:new             #2   <Class Layer$LayerType>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "Text">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   35   75:putstatic       #42  <Field Layer$LayerType Text>
		Unknown = new Layer$LayerType("Unknown", 6);
	//   36   78:new             #2   <Class Layer$LayerType>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "Unknown">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void Layer$LayerType(String, int)>
	//   41   89:putstatic       #45  <Field Layer$LayerType Unknown>
		$VALUES = (new Layer$LayerType[] {
			PreComp, Solid, Image, Null, Shape, Text, Unknown
		});
	//   42   92:bipush          7
	//   43   94:anewarray       Layer$LayerType[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #27  <Field Layer$LayerType PreComp>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #30  <Field Layer$LayerType Solid>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #33  <Field Layer$LayerType Image>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #36  <Field Layer$LayerType Null>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #39  <Field Layer$LayerType Shape>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #42  <Field Layer$LayerType Text>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #45  <Field Layer$LayerType Unknown>
	//   71  139:aastore         
	//   72  140:putstatic       #47  <Field Layer$LayerType[] $VALUES>
	//*  73  143:return          
	}

	private Layer$LayerType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
