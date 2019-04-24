// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			PolylineOptions

public static final class PolylineOptions$LineCapType extends Enum
{

	public static PolylineOptions$LineCapType valueOf(int i)
	{
		PolylineOptions$LineCapType apolylineoptions$linecaptype[] = values();
	//    0    0:invokestatic    #51  <Method PolylineOptions$LineCapType[] values()>
	//    1    3:astore_1        
		return apolylineoptions$linecaptype[Math.max(0, Math.min(i, apolylineoptions$linecaptype.length))];
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:iload_0         
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #57  <Method int Math.min(int, int)>
	//    8   12:invokestatic    #60  <Method int Math.max(int, int)>
	//    9   15:aaload          
	//   10   16:areturn         
	}

	public static PolylineOptions$LineCapType valueOf(String s)
	{
		return (PolylineOptions$LineCapType)Enum.valueOf(com/amap/api/maps/model/PolylineOptions$LineCapType, s);
	//    0    0:ldc1            #2   <Class PolylineOptions$LineCapType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #64  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PolylineOptions$LineCapType>
	//    4    9:areturn         
	}

	public static PolylineOptions$LineCapType[] values()
	{
		return (PolylineOptions$LineCapType[])((PolylineOptions$LineCapType []) (b)).clone();
	//    0    0:getstatic       #37  <Field PolylineOptions$LineCapType[] b>
	//    1    3:invokevirtual   #69  <Method Object _5B_Lcom.amap.api.maps.model.PolylineOptions$LineCapType_3B_.clone()>
	//    2    6:checkcast       #65  <Class PolylineOptions$LineCapType[]>
	//    3    9:areturn         
	}

	public int getTypeValue()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int a>
	//    2    4:ireturn         
	}

	public static final PolylineOptions$LineCapType LineCapArrow;
	public static final PolylineOptions$LineCapType LineCapButt;
	public static final PolylineOptions$LineCapType LineCapRound;
	public static final PolylineOptions$LineCapType LineCapSquare;
	private static final PolylineOptions$LineCapType b[];
	private int a;

	static 
	{
		LineCapButt = new PolylineOptions$LineCapType("LineCapButt", 0, 0);
	//    0    0:new             #2   <Class PolylineOptions$LineCapType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "LineCapButt">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void PolylineOptions$LineCapType(String, int, int)>
	//    6   11:putstatic       #26  <Field PolylineOptions$LineCapType LineCapButt>
		LineCapSquare = new PolylineOptions$LineCapType("LineCapSquare", 1, 1);
	//    7   14:new             #2   <Class PolylineOptions$LineCapType>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "LineCapSquare">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void PolylineOptions$LineCapType(String, int, int)>
	//   13   25:putstatic       #29  <Field PolylineOptions$LineCapType LineCapSquare>
		LineCapArrow = new PolylineOptions$LineCapType("LineCapArrow", 2, 2);
	//   14   28:new             #2   <Class PolylineOptions$LineCapType>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "LineCapArrow">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #24  <Method void PolylineOptions$LineCapType(String, int, int)>
	//   20   39:putstatic       #32  <Field PolylineOptions$LineCapType LineCapArrow>
		LineCapRound = new PolylineOptions$LineCapType("LineCapRound", 3, 3);
	//   21   42:new             #2   <Class PolylineOptions$LineCapType>
	//   22   45:dup             
	//   23   46:ldc1            #33  <String "LineCapRound">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #24  <Method void PolylineOptions$LineCapType(String, int, int)>
	//   27   53:putstatic       #35  <Field PolylineOptions$LineCapType LineCapRound>
		b = (new PolylineOptions$LineCapType[] {
			LineCapButt, LineCapSquare, LineCapArrow, LineCapRound
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       PolylineOptions$LineCapType[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #26  <Field PolylineOptions$LineCapType LineCapButt>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #29  <Field PolylineOptions$LineCapType LineCapSquare>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #32  <Field PolylineOptions$LineCapType LineCapArrow>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #35  <Field PolylineOptions$LineCapType LineCapRound>
	//   45   83:aastore         
	//   46   84:putstatic       #37  <Field PolylineOptions$LineCapType[] b>
	//*  47   87:return          
	}

	private PolylineOptions$LineCapType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		a = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #43  <Field int a>
	//    7   11:return          
	}
}
