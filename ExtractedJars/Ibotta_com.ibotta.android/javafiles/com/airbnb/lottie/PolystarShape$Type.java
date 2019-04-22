// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			PolystarShape

static final class PolystarShape$Type extends Enum
{

	static PolystarShape$Type forValue(int i)
	{
		PolystarShape$Type apolystarshape$type[] = values();
	//    0    0:invokestatic    #43  <Method PolystarShape$Type[] values()>
	//    1    3:astore_3        
		int k = apolystarshape$type.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			PolystarShape$Type polystarshape$type = apolystarshape$type[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(polystarshape$type.value == i)
	//*  14   19:aload           4
	//*  15   21:getfield        #35  <Field int value>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return polystarshape$type;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static PolystarShape$Type valueOf(String s)
	{
		return (PolystarShape$Type)Enum.valueOf(com/airbnb/lottie/PolystarShape$Type, s);
	//    0    0:ldc1            #2   <Class PolystarShape$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PolystarShape$Type>
	//    4    9:areturn         
	}

	public static PolystarShape$Type[] values()
	{
		return (PolystarShape$Type[])((PolystarShape$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #29  <Field PolystarShape$Type[] $VALUES>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.airbnb.lottie.PolystarShape$Type_3B_.clone()>
	//    2    6:checkcast       #49  <Class PolystarShape$Type[]>
	//    3    9:areturn         
	}

	private static final PolystarShape$Type $VALUES[];
	public static final PolystarShape$Type Polygon;
	public static final PolystarShape$Type Star;
	private final int value;

	static 
	{
		Star = new PolystarShape$Type("Star", 0, 1);
	//    0    0:new             #2   <Class PolystarShape$Type>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Star">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #22  <Method void PolystarShape$Type(String, int, int)>
	//    6   11:putstatic       #24  <Field PolystarShape$Type Star>
		Polygon = new PolystarShape$Type("Polygon", 1, 2);
	//    7   14:new             #2   <Class PolystarShape$Type>
	//    8   17:dup             
	//    9   18:ldc1            #25  <String "Polygon">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #22  <Method void PolystarShape$Type(String, int, int)>
	//   13   25:putstatic       #27  <Field PolystarShape$Type Polygon>
		$VALUES = (new PolystarShape$Type[] {
			Star, Polygon
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       PolystarShape$Type[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #24  <Field PolystarShape$Type Star>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #27  <Field PolystarShape$Type Polygon>
	//   23   43:aastore         
	//   24   44:putstatic       #29  <Field PolystarShape$Type[] $VALUES>
	//*  25   47:return          
	}

	private PolystarShape$Type(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #35  <Field int value>
	//    7   11:return          
	}
}
