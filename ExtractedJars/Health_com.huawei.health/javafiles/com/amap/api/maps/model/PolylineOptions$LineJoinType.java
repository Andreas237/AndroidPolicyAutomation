// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			PolylineOptions

public static final class PolylineOptions$LineJoinType extends Enum
{

	public static PolylineOptions$LineJoinType valueOf(int i)
	{
		PolylineOptions$LineJoinType apolylineoptions$linejointype[] = values();
	//    0    0:invokestatic    #47  <Method PolylineOptions$LineJoinType[] values()>
	//    1    3:astore_1        
		return apolylineoptions$linejointype[Math.max(0, Math.min(i, apolylineoptions$linejointype.length))];
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:iload_0         
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #53  <Method int Math.min(int, int)>
	//    8   12:invokestatic    #56  <Method int Math.max(int, int)>
	//    9   15:aaload          
	//   10   16:areturn         
	}

	public static PolylineOptions$LineJoinType valueOf(String s)
	{
		return (PolylineOptions$LineJoinType)Enum.valueOf(com/amap/api/maps/model/PolylineOptions$LineJoinType, s);
	//    0    0:ldc1            #2   <Class PolylineOptions$LineJoinType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PolylineOptions$LineJoinType>
	//    4    9:areturn         
	}

	public static PolylineOptions$LineJoinType[] values()
	{
		return (PolylineOptions$LineJoinType[])((PolylineOptions$LineJoinType []) (b)).clone();
	//    0    0:getstatic       #33  <Field PolylineOptions$LineJoinType[] b>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.amap.api.maps.model.PolylineOptions$LineJoinType_3B_.clone()>
	//    2    6:checkcast       #61  <Class PolylineOptions$LineJoinType[]>
	//    3    9:areturn         
	}

	public int getTypeValue()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int a>
	//    2    4:ireturn         
	}

	public static final PolylineOptions$LineJoinType LineJoinBevel;
	public static final PolylineOptions$LineJoinType LineJoinMiter;
	public static final PolylineOptions$LineJoinType LineJoinRound;
	private static final PolylineOptions$LineJoinType b[];
	private int a;

	static 
	{
		LineJoinBevel = new PolylineOptions$LineJoinType("LineJoinBevel", 0, 0);
	//    0    0:new             #2   <Class PolylineOptions$LineJoinType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "LineJoinBevel">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #23  <Method void PolylineOptions$LineJoinType(String, int, int)>
	//    6   11:putstatic       #25  <Field PolylineOptions$LineJoinType LineJoinBevel>
		LineJoinMiter = new PolylineOptions$LineJoinType("LineJoinMiter", 1, 1);
	//    7   14:new             #2   <Class PolylineOptions$LineJoinType>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "LineJoinMiter">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #23  <Method void PolylineOptions$LineJoinType(String, int, int)>
	//   13   25:putstatic       #28  <Field PolylineOptions$LineJoinType LineJoinMiter>
		LineJoinRound = new PolylineOptions$LineJoinType("LineJoinRound", 2, 2);
	//   14   28:new             #2   <Class PolylineOptions$LineJoinType>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "LineJoinRound">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #23  <Method void PolylineOptions$LineJoinType(String, int, int)>
	//   20   39:putstatic       #31  <Field PolylineOptions$LineJoinType LineJoinRound>
		b = (new PolylineOptions$LineJoinType[] {
			LineJoinBevel, LineJoinMiter, LineJoinRound
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       PolylineOptions$LineJoinType[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #25  <Field PolylineOptions$LineJoinType LineJoinBevel>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #28  <Field PolylineOptions$LineJoinType LineJoinMiter>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #31  <Field PolylineOptions$LineJoinType LineJoinRound>
	//   34   63:aastore         
	//   35   64:putstatic       #33  <Field PolylineOptions$LineJoinType[] b>
	//*  36   67:return          
	}

	private PolylineOptions$LineJoinType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		a = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #39  <Field int a>
	//    7   11:return          
	}
}
