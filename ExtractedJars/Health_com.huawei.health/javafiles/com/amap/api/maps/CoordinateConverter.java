// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import com.amap.api.mapcore.util.*;
import com.amap.api.maps.model.LatLng;

public class CoordinateConverter
{
	public static final class CoordType extends Enum
	{

		public static CoordType valueOf(String s)
		{
			return (CoordType)Enum.valueOf(com/amap/api/maps/CoordinateConverter$CoordType, s);
		//    0    0:ldc1            #2   <Class CoordinateConverter$CoordType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CoordinateConverter$CoordType>
		//    4    9:areturn         
		}

		public static CoordType[] values()
		{
			return (CoordType[])((CoordType []) (a)).clone();
		//    0    0:getstatic       #47  <Field CoordinateConverter$CoordType[] a>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.amap.api.maps.CoordinateConverter$CoordType_3B_.clone()>
		//    2    6:checkcast       #58  <Class CoordinateConverter$CoordType[]>
		//    3    9:areturn         
		}

		public static final CoordType ALIYUN;
		public static final CoordType BAIDU;
		public static final CoordType GOOGLE;
		public static final CoordType GPS;
		public static final CoordType MAPABC;
		public static final CoordType MAPBAR;
		public static final CoordType SOSOMAP;
		private static final CoordType a[];

		static 
		{
			BAIDU = new CoordType("BAIDU", 0);
		//    0    0:new             #2   <Class CoordinateConverter$CoordType>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "BAIDU">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//    5   10:putstatic       #27  <Field CoordinateConverter$CoordType BAIDU>
			MAPBAR = new CoordType("MAPBAR", 1);
		//    6   13:new             #2   <Class CoordinateConverter$CoordType>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "MAPBAR">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   11   23:putstatic       #30  <Field CoordinateConverter$CoordType MAPBAR>
			GPS = new CoordType("GPS", 2);
		//   12   26:new             #2   <Class CoordinateConverter$CoordType>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "GPS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   17   36:putstatic       #33  <Field CoordinateConverter$CoordType GPS>
			MAPABC = new CoordType("MAPABC", 3);
		//   18   39:new             #2   <Class CoordinateConverter$CoordType>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "MAPABC">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   23   49:putstatic       #36  <Field CoordinateConverter$CoordType MAPABC>
			SOSOMAP = new CoordType("SOSOMAP", 4);
		//   24   52:new             #2   <Class CoordinateConverter$CoordType>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "SOSOMAP">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   29   62:putstatic       #39  <Field CoordinateConverter$CoordType SOSOMAP>
			ALIYUN = new CoordType("ALIYUN", 5);
		//   30   65:new             #2   <Class CoordinateConverter$CoordType>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "ALIYUN">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   35   75:putstatic       #42  <Field CoordinateConverter$CoordType ALIYUN>
			GOOGLE = new CoordType("GOOGLE", 6);
		//   36   78:new             #2   <Class CoordinateConverter$CoordType>
		//   37   81:dup             
		//   38   82:ldc1            #43  <String "GOOGLE">
		//   39   84:bipush          6
		//   40   86:invokespecial   #25  <Method void CoordinateConverter$CoordType(String, int)>
		//   41   89:putstatic       #45  <Field CoordinateConverter$CoordType GOOGLE>
			a = (new CoordType[] {
				BAIDU, MAPBAR, GPS, MAPABC, SOSOMAP, ALIYUN, GOOGLE
			});
		//   42   92:bipush          7
		//   43   94:anewarray       CoordType[]
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

		private CoordType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CoordinateConverter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field CoordinateConverter$CoordType b>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field LatLng c>
		a = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #26  <Field Context a>
	//   11   19:return          
	}

	public static boolean isAMapDataAvailable(double d, double d1)
	{
		return ew.a(d, d1);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #33  <Method boolean ew.a(double, double)>
	//    3    5:ireturn         
	}

	public LatLng convert()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field CoordinateConverter$CoordType b>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(c == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #24  <Field LatLng c>
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		LatLng latlng;
		if(ew.a(c.latitude, c.longitude))
			break MISSING_BLOCK_LABEL_45;
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field LatLng c>
	//   12   22:getfield        #43  <Field double LatLng.latitude>
	//   13   25:aload_0         
	//   14   26:getfield        #24  <Field LatLng c>
	//   15   29:getfield        #46  <Field double LatLng.longitude>
	//   16   32:invokestatic    #33  <Method boolean ew.a(double, double)>
	//   17   35:ifne            45
		latlng = c;
	//   18   38:aload_0         
	//   19   39:getfield        #24  <Field LatLng c>
	//   20   42:astore_1        
		return latlng;
	//   21   43:aload_1         
	//   22   44:areturn         
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[CoordType.values().length];
			//    0    0:invokestatic    #18  <Method CoordinateConverter$CoordType[] CoordinateConverter$CoordType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[CoordType.BAIDU.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.BAIDU>
			//    6   15:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					a[CoordType.MAPBAR.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] a>
			//   12   27:getstatic       #31  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.MAPBAR>
			//   13   30:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					a[CoordType.MAPABC.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] a>
			//   19   42:getstatic       #34  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.MAPABC>
			//   20   45:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					a[CoordType.SOSOMAP.ordinal()] = 4;
			//   25   54:getstatic       #20  <Field int[] a>
			//   26   57:getstatic       #37  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.SOSOMAP>
			//   27   60:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
				}
			//*  30   65:goto            69
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   68:astore_0        
				try
				{
					a[CoordType.ALIYUN.ordinal()] = 5;
			//   32   69:getstatic       #20  <Field int[] a>
			//   33   72:getstatic       #40  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.ALIYUN>
			//   34   75:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   35   78:iconst_5        
			//   36   79:iastore         
				}
			//*  37   80:goto            84
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   83:astore_0        
				try
				{
					a[CoordType.GOOGLE.ordinal()] = 6;
			//   39   84:getstatic       #20  <Field int[] a>
			//   40   87:getstatic       #43  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.GOOGLE>
			//   41   90:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   42   93:bipush          6
			//   43   95:iastore         
				}
			//*  44   96:goto            100
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   99:astore_0        
				try
				{
					a[CoordType.GPS.ordinal()] = 7;
			//   46  100:getstatic       #20  <Field int[] a>
			//   47  103:getstatic       #46  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.GPS>
			//   48  106:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
			//   49  109:bipush          7
			//   50  111:iastore         
			//   51  112:return          
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   52  113:astore_0        
			//*  53  114:return          
			}
		}

		_cls1.a[b.ordinal()];
	//   23   45:getstatic       #49  <Field int[] CoordinateConverter$1.a>
	//   24   48:aload_0         
	//   25   49:getfield        #22  <Field CoordinateConverter$CoordType b>
	//   26   52:invokevirtual   #53  <Method int CoordinateConverter$CoordType.ordinal()>
	//   27   55:iaload          
		JVM INSTR tableswitch 1 7: default 166
	//	               1 100
	//	               2 111
	//	               3 126
	//	               4 126
	//	               5 126
	//	               6 126
	//	               7 134;
	//   28   56:tableswitch     1 7: default 166
	//	               1 100
	//	               2 111
	//	               3 126
	//	               4 126
	//	               5 126
	//	               6 126
	//	               7 134
		   goto _L1 _L2 _L3 _L4 _L4 _L4 _L4 _L5
_L1:
		break MISSING_BLOCK_LABEL_166;
_L2:
		latlng = am.a(c);
	//   29  100:aload_0         
	//   30  101:getfield        #24  <Field LatLng c>
	//   31  104:invokestatic    #58  <Method LatLng am.a(LatLng)>
	//   32  107:astore_1        
		break; /* Loop/switch isn't completed */
	//   33  108:goto            146
_L3:
		try
		{
			latlng = am.b(a, c);
	//   34  111:aload_0         
	//   35  112:getfield        #26  <Field Context a>
	//   36  115:aload_0         
	//   37  116:getfield        #24  <Field LatLng c>
	//   38  119:invokestatic    #61  <Method LatLng am.b(Context, LatLng)>
	//   39  122:astore_1        
			break; /* Loop/switch isn't completed */
	//   40  123:goto            146
		}
	//*  41  126:aload_0         
	//*  42  127:getfield        #24  <Field LatLng c>
	//*  43  130:astore_1        
	//*  44  131:goto            146
	//*  45  134:aload_0         
	//*  46  135:getfield        #26  <Field Context a>
	//*  47  138:aload_0         
	//*  48  139:getfield        #24  <Field LatLng c>
	//*  49  142:invokestatic    #63  <Method LatLng am.a(Context, LatLng)>
	//*  50  145:astore_1        
	//*  51  146:aload_1         
	//*  52  147:areturn         
		catch(Throwable throwable)
	//*  53  148:astore_1        
		{
			throwable.printStackTrace();
	//   54  149:aload_1         
	//   55  150:invokevirtual   #66  <Method void Throwable.printStackTrace()>
			hm.c(throwable, "CoordinateConverter", "convert");
	//   56  153:aload_1         
	//   57  154:ldc1            #68  <String "CoordinateConverter">
	//   58  156:ldc1            #69  <String "convert">
	//   59  158:invokestatic    #74  <Method void hm.c(Throwable, String, String)>
			return c;
	//   60  161:aload_0         
	//   61  162:getfield        #24  <Field LatLng c>
	//   62  165:areturn         
		}
_L4:
		latlng = c;
		break; /* Loop/switch isn't completed */
_L5:
		latlng = am.a(a, c);
		return latlng;
		return null;
	//   63  166:aconst_null     
	//   64  167:areturn         
	}

	public CoordinateConverter coord(LatLng latlng)
	{
		c = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field LatLng c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CoordinateConverter from(CoordType coordtype)
	{
		b = coordtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CoordinateConverter$CoordType b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Context a;
	private CoordType b;
	private LatLng c;
}
