// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.hsr.geohash;

import java.io.Serializable;

// Referenced classes of package ch.hsr.geohash:
//			WGS84Point

public class BoundingBox
	implements Serializable
{

	public BoundingBox(double d, double d1, double d2, double d3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		minLon = Math.min(d2, d3);
	//    2    4:aload_0         
	//    3    5:dload           5
	//    4    7:dload           7
	//    5    9:invokestatic    #26  <Method double Math.min(double, double)>
	//    6   12:putfield        #28  <Field double minLon>
		maxLon = Math.max(d2, d3);
	//    7   15:aload_0         
	//    8   16:dload           5
	//    9   18:dload           7
	//   10   20:invokestatic    #31  <Method double Math.max(double, double)>
	//   11   23:putfield        #33  <Field double maxLon>
		minLat = Math.min(d, d1);
	//   12   26:aload_0         
	//   13   27:dload_1         
	//   14   28:dload_3         
	//   15   29:invokestatic    #26  <Method double Math.min(double, double)>
	//   16   32:putfield        #35  <Field double minLat>
		maxLat = Math.max(d, d1);
	//   17   35:aload_0         
	//   18   36:dload_1         
	//   19   37:dload_3         
	//   20   38:invokestatic    #31  <Method double Math.max(double, double)>
	//   21   41:putfield        #37  <Field double maxLat>
	//   22   44:return          
	}

	public BoundingBox(WGS84Point wgs84point, WGS84Point wgs84point1)
	{
		this(wgs84point.getLatitude(), wgs84point1.getLatitude(), wgs84point.getLongitude(), wgs84point1.getLongitude());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method double WGS84Point.getLatitude()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #45  <Method double WGS84Point.getLatitude()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #48  <Method double WGS84Point.getLongitude()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #48  <Method double WGS84Point.getLongitude()>
	//    9   17:invokespecial   #50  <Method void BoundingBox(double, double, double, double)>
	//   10   20:return          
	}

	private static int hashCode(double d)
	{
		long l = Double.doubleToLongBits(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #58  <Method long Double.doubleToLongBits(double)>
	//    2    4:lstore_2        
		return (int)(l ^ l >>> 32);
	//    3    5:lload_2         
	//    4    6:lload_2         
	//    5    7:bipush          32
	//    6    9:lushr           
	//    7   10:lxor            
	//    8   11:l2i             
	//    9   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof BoundingBox)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class BoundingBox>
	//*   7   11:ifeq            71
		{
			obj = ((Object) ((BoundingBox)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class BoundingBox>
	//   10   18:astore_1        
			return minLat == ((BoundingBox) (obj)).minLat && minLon == ((BoundingBox) (obj)).minLon && maxLat == ((BoundingBox) (obj)).maxLat && maxLon == ((BoundingBox) (obj)).maxLon;
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field double minLat>
	//   13   23:aload_1         
	//   14   24:getfield        #35  <Field double minLat>
	//   15   27:dcmpl           
	//   16   28:ifne            69
	//   17   31:aload_0         
	//   18   32:getfield        #28  <Field double minLon>
	//   19   35:aload_1         
	//   20   36:getfield        #28  <Field double minLon>
	//   21   39:dcmpl           
	//   22   40:ifne            69
	//   23   43:aload_0         
	//   24   44:getfield        #37  <Field double maxLat>
	//   25   47:aload_1         
	//   26   48:getfield        #37  <Field double maxLat>
	//   27   51:dcmpl           
	//   28   52:ifne            69
	//   29   55:aload_0         
	//   30   56:getfield        #33  <Field double maxLon>
	//   31   59:aload_1         
	//   32   60:getfield        #33  <Field double maxLon>
	//   33   63:dcmpl           
	//   34   64:ifne            69
	//   35   67:iconst_1        
	//   36   68:ireturn         
	//   37   69:iconst_0        
	//   38   70:ireturn         
		} else
		{
			return false;
	//   39   71:iconst_0        
	//   40   72:ireturn         
		}
	}

	public WGS84Point getLowerRight()
	{
		return new WGS84Point(minLat, maxLon);
	//    0    0:new             #41  <Class WGS84Point>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field double minLat>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field double maxLon>
	//    6   12:invokespecial   #65  <Method void WGS84Point(double, double)>
	//    7   15:areturn         
	}

	public WGS84Point getUpperLeft()
	{
		return new WGS84Point(maxLat, minLon);
	//    0    0:new             #41  <Class WGS84Point>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field double maxLat>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field double minLon>
	//    6   12:invokespecial   #65  <Method void WGS84Point(double, double)>
	//    7   15:areturn         
	}

	public int hashCode()
	{
		return (((629 + hashCode(minLat)) * 37 + hashCode(maxLat)) * 37 + hashCode(minLon)) * 37 + hashCode(maxLon);
	//    0    0:sipush          629
	//    1    3:aload_0         
	//    2    4:getfield        #35  <Field double minLat>
	//    3    7:invokestatic    #69  <Method int hashCode(double)>
	//    4   10:iadd            
	//    5   11:bipush          37
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #37  <Field double maxLat>
	//    9   18:invokestatic    #69  <Method int hashCode(double)>
	//   10   21:iadd            
	//   11   22:bipush          37
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #28  <Field double minLon>
	//   15   29:invokestatic    #69  <Method int hashCode(double)>
	//   16   32:iadd            
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:aload_0         
	//   20   37:getfield        #33  <Field double maxLon>
	//   21   40:invokestatic    #69  <Method int hashCode(double)>
	//   22   43:iadd            
	//   23   44:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (getUpperLeft())));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #76  <Method WGS84Point getUpperLeft()>
	//    7   13:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(" -> ");
	//    9   17:aload_1         
	//   10   18:ldc1            #82  <String " -> ">
	//   11   20:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (getLowerRight())));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #87  <Method WGS84Point getLowerRight()>
	//   16   29:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	private static final long serialVersionUID = 0x508fadacL;
	private double maxLat;
	private double maxLon;
	private double minLat;
	private double minLon;
}
