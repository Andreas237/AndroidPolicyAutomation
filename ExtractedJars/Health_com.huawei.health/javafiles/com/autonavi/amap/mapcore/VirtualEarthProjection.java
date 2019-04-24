// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.Point;

// Referenced classes of package com.autonavi.amap.mapcore:
//			DPoint

public class VirtualEarthProjection
{

	public VirtualEarthProjection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static double clip(double d, double d1, double d2)
	{
		return Math.min(Math.max(d, d1), d2);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #50  <Method double Math.max(double, double)>
	//    3    5:dload           4
	//    4    7:invokestatic    #53  <Method double Math.min(double, double)>
	//    5   10:dreturn         
	}

	private static double degToRad(double d)
	{
		return 0.017453292519943295D * d;
	//    0    0:ldc2w           #56  <Double 0.017453292519943295D>
	//    1    3:dload_0         
	//    2    4:dmul            
	//    3    5:dreturn         
	}

	public static Point latLongToPixels(double d, double d1, int i)
	{
		Point point = new Point();
	//    0    0:new             #61  <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void Point()>
	//    3    7:astore          7
		double d2 = clip(d, -85.051128779799996D, 85.051128779799996D);
	//    4    9:dload_0         
	//    5   10:ldc2w           #29  <Double -85.051128779799996D>
	//    6   13:ldc2w           #23  <Double 85.051128779799996D>
	//    7   16:invokestatic    #64  <Method double clip(double, double, double)>
	//    8   19:dstore          5
		d = degToRad(clip(d1, -180D, 180D));
	//    9   21:dload_2         
	//   10   22:ldc2w           #32  <Double -180D>
	//   11   25:ldc2w           #26  <Double 180D>
	//   12   28:invokestatic    #64  <Method double clip(double, double, double)>
	//   13   31:invokestatic    #66  <Method double degToRad(double)>
	//   14   34:dstore_0        
		d1 = Math.sin(degToRad(d2));
	//   15   35:dload           5
	//   16   37:invokestatic    #66  <Method double degToRad(double)>
	//   17   40:invokestatic    #69  <Method double Math.sin(double)>
	//   18   43:dstore_2        
		d1 = (6378137D * Math.log((1.0D + d1) / (1.0D - d1))) / 2D;
	//   19   44:ldc2w           #70  <Double 6378137D>
	//   20   47:dconst_1        
	//   21   48:dload_2         
	//   22   49:dadd            
	//   23   50:dconst_1        
	//   24   51:dload_2         
	//   25   52:dsub            
	//   26   53:ddiv            
	//   27   54:invokestatic    #74  <Method double Math.log(double)>
	//   28   57:dmul            
	//   29   58:ldc2w           #75  <Double 2D>
	//   30   61:ddiv            
	//   31   62:dstore_2        
		d = (20037508D + 6378137D * d) / 0.14929106831550598D;
	//   32   63:ldc2w           #18  <Double 20037508D>
	//   33   66:ldc2w           #70  <Double 6378137D>
	//   34   69:dload_0         
	//   35   70:dmul            
	//   36   71:dadd            
	//   37   72:ldc2w           #77  <Double 0.14929106831550598D>
	//   38   75:ddiv            
	//   39   76:dstore_0        
		d1 = (20037508D - d1) / 0.14929106831550598D;
	//   40   77:ldc2w           #18  <Double 20037508D>
	//   41   80:dload_2         
	//   42   81:dsub            
	//   43   82:ldc2w           #77  <Double 0.14929106831550598D>
	//   44   85:ddiv            
	//   45   86:dstore_2        
		point.x = (int)clip(0.0D, d, 268435456D);
	//   46   87:aload           7
	//   47   89:dconst_0        
	//   48   90:dload_0         
	//   49   91:ldc2w           #79  <Double 268435456D>
	//   50   94:invokestatic    #64  <Method double clip(double, double, double)>
	//   51   97:d2i             
	//   52   98:putfield        #83  <Field int Point.x>
		point.y = (int)clip(0.0D, d1, 268435456D);
	//   53  101:aload           7
	//   54  103:dconst_0        
	//   55  104:dload_2         
	//   56  105:ldc2w           #79  <Double 268435456D>
	//   57  108:invokestatic    #64  <Method double clip(double, double, double)>
	//   58  111:d2i             
	//   59  112:putfield        #86  <Field int Point.y>
		return point;
	//   60  115:aload           7
	//   61  117:areturn         
	}

	public static Point latLongToPixels(int i, int j, int k)
	{
		return latLongToPixels((double)j / 3600000D, (double)i / 3600000D, k);
	//    0    0:iload_1         
	//    1    1:i2d             
	//    2    2:ldc2w           #88  <Double 3600000D>
	//    3    5:ddiv            
	//    4    6:iload_0         
	//    5    7:i2d             
	//    6    8:ldc2w           #88  <Double 3600000D>
	//    7   11:ddiv            
	//    8   12:iload_2         
	//    9   13:invokestatic    #91  <Method Point latLongToPixels(double, double, int)>
	//   10   16:areturn         
	}

	public static DPoint pixelsToLatLong(long l, long l1, int i)
	{
		DPoint dpoint = DPoint.obtain();
	//    0    0:invokestatic    #99  <Method DPoint DPoint.obtain()>
	//    1    3:astore          9
		double d = l;
	//    2    5:lload_0         
	//    3    6:l2d             
	//    4    7:dstore          5
		double d1 = l1;
	//    5    9:lload_2         
	//    6   10:l2d             
	//    7   11:dstore          7
		dpoint.x = radToDeg((d * 0.14929106831550598D - 20037508D) / 6378137D);
	//    8   13:aload           9
	//    9   15:dload           5
	//   10   17:ldc2w           #77  <Double 0.14929106831550598D>
	//   11   20:dmul            
	//   12   21:ldc2w           #18  <Double 20037508D>
	//   13   24:dsub            
	//   14   25:ldc2w           #70  <Double 6378137D>
	//   15   28:ddiv            
	//   16   29:invokestatic    #102 <Method double radToDeg(double)>
	//   17   32:putfield        #104 <Field double DPoint.x>
		d = Math.exp(2D * ((20037508D - d1 * 0.14929106831550598D) / 6378137D));
	//   18   35:ldc2w           #75  <Double 2D>
	//   19   38:ldc2w           #18  <Double 20037508D>
	//   20   41:dload           7
	//   21   43:ldc2w           #77  <Double 0.14929106831550598D>
	//   22   46:dmul            
	//   23   47:dsub            
	//   24   48:ldc2w           #70  <Double 6378137D>
	//   25   51:ddiv            
	//   26   52:dmul            
	//   27   53:invokestatic    #107 <Method double Math.exp(double)>
	//   28   56:dstore          5
		dpoint.y = radToDeg(Math.asin((d - 1.0D) / (1.0D + d)));
	//   29   58:aload           9
	//   30   60:dload           5
	//   31   62:dconst_1        
	//   32   63:dsub            
	//   33   64:dconst_1        
	//   34   65:dload           5
	//   35   67:dadd            
	//   36   68:ddiv            
	//   37   69:invokestatic    #110 <Method double Math.asin(double)>
	//   38   72:invokestatic    #102 <Method double radToDeg(double)>
	//   39   75:putfield        #112 <Field double DPoint.y>
		return dpoint;
	//   40   78:aload           9
	//   41   80:areturn         
	}

	private static double radToDeg(double d)
	{
		return 57.295779513082323D * d;
	//    0    0:ldc2w           #113 <Double 57.295779513082323D>
	//    1    3:dload_0         
	//    2    4:dmul            
	//    3    5:dreturn         
	}

	public static final double EARTH_CIRCUMFERENCE_IN_METERS = 40075016.685578488D;
	public static final int EARTH_RADIUS_IN_METERS = 0x615299;
	private static final int KMA_MAX_MAP_SIZE = 0x10000000;
	private static final double K_EARTH_CIRCLE = 40075016D;
	private static final double K_EARTH_CIRCLE_2 = 20037508D;
	public static final int MAXZOOMLEVEL = 20;
	public static final double MAX_LATITUDE = 85.051128779799996D;
	public static final double MAX_LONGITUDE = 180D;
	public static final double MIN_LATITUDE = -85.051128779799996D;
	public static final double MIN_LONGITUDE = -180D;
	public static final int PIXELS_PER_TILE = 256;
	public static final int TILE_SPLIT_LEVEL = 0;
}
