// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;


// Referenced classes of package com.amap.api.maps:
//			CoordinateConverter

public static final class CoordinateConverter$CoordType extends Enum
{

	public static CoordinateConverter$CoordType valueOf(String s)
	{
		return (CoordinateConverter$CoordType)Enum.valueOf(com/amap/api/maps/CoordinateConverter$CoordType, s);
	//    0    0:ldc1            #2   <Class CoordinateConverter$CoordType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CoordinateConverter$CoordType>
	//    4    9:areturn         
	}

	public static CoordinateConverter$CoordType[] values()
	{
		return (CoordinateConverter$CoordType[])((CoordinateConverter$CoordType []) (a)).clone();
	//    0    0:getstatic       #47  <Field CoordinateConverter$CoordType[] a>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.amap.api.maps.CoordinateConverter$CoordType_3B_.clone()>
	//    2    6:checkcast       #58  <Class CoordinateConverter$CoordType[]>
	//    3    9:areturn         
	}

	public static final CoordinateConverter$CoordType ALIYUN;
	public static final CoordinateConverter$CoordType BAIDU;
	public static final CoordinateConverter$CoordType GOOGLE;
	public static final CoordinateConverter$CoordType GPS;
	public static final CoordinateConverter$CoordType MAPABC;
	public static final CoordinateConverter$CoordType MAPBAR;
	public static final CoordinateConverter$CoordType SOSOMAP;
	private static final CoordinateConverter$CoordType a[];

	static 
	{
		BAIDU = new CoordinateConverter$CoordType("BAIDU", 0);
	//    0    0:new             #2   <Class CoordinateConverter$CoordType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "BAIDU">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//    5   10:putstatic       #27  <Field CoordinateConverter$CoordType BAIDU>
		MAPBAR = new CoordinateConverter$CoordType("MAPBAR", 1);
	//    6   13:new             #2   <Class CoordinateConverter$CoordType>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "MAPBAR">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   11   23:putstatic       #30  <Field CoordinateConverter$CoordType MAPBAR>
		GPS = new CoordinateConverter$CoordType("GPS", 2);
	//   12   26:new             #2   <Class CoordinateConverter$CoordType>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "GPS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   17   36:putstatic       #33  <Field CoordinateConverter$CoordType GPS>
		MAPABC = new CoordinateConverter$CoordType("MAPABC", 3);
	//   18   39:new             #2   <Class CoordinateConverter$CoordType>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "MAPABC">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   23   49:putstatic       #36  <Field CoordinateConverter$CoordType MAPABC>
		SOSOMAP = new CoordinateConverter$CoordType("SOSOMAP", 4);
	//   24   52:new             #2   <Class CoordinateConverter$CoordType>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "SOSOMAP">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   29   62:putstatic       #39  <Field CoordinateConverter$CoordType SOSOMAP>
		ALIYUN = new CoordinateConverter$CoordType("ALIYUN", 5);
	//   30   65:new             #2   <Class CoordinateConverter$CoordType>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "ALIYUN">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   35   75:putstatic       #42  <Field CoordinateConverter$CoordType ALIYUN>
		GOOGLE = new CoordinateConverter$CoordType("GOOGLE", 6);
	//   36   78:new             #2   <Class CoordinateConverter$CoordType>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "GOOGLE">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
	//   41   89:putstatic       #45  <Field CoordinateConverter$CoordType GOOGLE>
		a = (new CoordinateConverter$CoordType[] {
			BAIDU, MAPBAR, GPS, MAPABC, SOSOMAP, ALIYUN, GOOGLE
		});
	//   42   92:bipush          7
	//   43   94:anewarray       CoordinateConverter$CoordType[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #27  <Field CoordinateConverter$CoordType BAIDU>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #30  <Field CoordinateConverter$CoordType MAPBAR>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #33  <Field CoordinateConverter$CoordType GPS>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #36  <Field CoordinateConverter$CoordType MAPABC>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #39  <Field CoordinateConverter$CoordType SOSOMAP>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #42  <Field CoordinateConverter$CoordType ALIYUN>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #45  <Field CoordinateConverter$CoordType GOOGLE>
	//   71  139:aastore         
	//   72  140:putstatic       #47  <Field CoordinateConverter$CoordType[] a>
	//*  73  143:return          
	}

	private CoordinateConverter$CoordType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
