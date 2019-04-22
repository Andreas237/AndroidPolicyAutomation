// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.hsr.geohash;

import java.io.Serializable;

public class WGS84Point
	implements Serializable
{

	public WGS84Point(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		latitude = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #20  <Field double latitude>
		longitude = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #22  <Field double longitude>
		if(Math.abs(d) <= 90D && Math.abs(d1) <= 180D)
	//*   8   14:dload_1         
	//*   9   15:invokestatic    #28  <Method double Math.abs(double)>
	//*  10   18:ldc2w           #29  <Double 90D>
	//*  11   21:dcmpl           
	//*  12   22:ifgt            37
	//*  13   25:dload_3         
	//*  14   26:invokestatic    #28  <Method double Math.abs(double)>
	//*  15   29:ldc2w           #31  <Double 180D>
	//*  16   32:dcmpl           
	//*  17   33:ifgt            37
		{
			return;
	//   18   36:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   37:new             #34  <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #35  <Method void StringBuilder()>
	//   22   44:astore          5
			stringbuilder.append("The supplied coordinates ");
	//   23   46:aload           5
	//   24   48:ldc1            #37  <String "The supplied coordinates ">
	//   25   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			stringbuilder.append(((Object) (this)));
	//   27   54:aload           5
	//   28   56:aload_0         
	//   29   57:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
			stringbuilder.append(" are out of range.");
	//   31   61:aload           5
	//   32   63:ldc1            #46  <String " are out of range.">
	//   33   65:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   69:new             #48  <Class IllegalArgumentException>
	//   36   72:dup             
	//   37   73:aload           5
	//   38   75:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   39   78:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   40   81:athrow          
		}
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof WGS84Point;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class WGS84Point>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            48
		{
			obj = ((Object) ((WGS84Point)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class WGS84Point>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(latitude == ((WGS84Point) (obj)).latitude)
	//*  12   18:aload_0         
	//*  13   19:getfield        #20  <Field double latitude>
	//*  14   22:aload_1         
	//*  15   23:getfield        #20  <Field double latitude>
	//*  16   26:dcmpl           
	//*  17   27:ifne            46
			{
				flag1 = flag2;
	//   18   30:iload_3         
	//   19   31:istore_2        
				if(longitude == ((WGS84Point) (obj)).longitude)
	//*  20   32:aload_0         
	//*  21   33:getfield        #22  <Field double longitude>
	//*  22   36:aload_1         
	//*  23   37:getfield        #22  <Field double longitude>
	//*  24   40:dcmpl           
	//*  25   41:ifne            46
					flag1 = true;
	//   26   44:iconst_1        
	//   27   45:istore_2        
			}
			return flag1;
	//   28   46:iload_2         
	//   29   47:ireturn         
		} else
		{
			return false;
	//   30   48:iconst_0        
	//   31   49:ireturn         
		}
	}

	public double getLatitude()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field double latitude>
	//    2    4:dreturn         
	}

	public double getLongitude()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field double longitude>
	//    2    4:dreturn         
	}

	public int hashCode()
	{
		long l = Double.doubleToLongBits(latitude);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field double latitude>
	//    2    4:invokestatic    #69  <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_1        
		long l1 = Double.doubleToLongBits(longitude);
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field double longitude>
	//    6   12:invokestatic    #69  <Method long Double.doubleToLongBits(double)>
	//    7   15:lstore_3        
		return (1302 + (int)(l ^ l >>> 32)) * 31 + (int)(l1 ^ l1 >>> 32);
	//    8   16:sipush          1302
	//    9   19:lload_1         
	//   10   20:lload_1         
	//   11   21:bipush          32
	//   12   23:lushr           
	//   13   24:lxor            
	//   14   25:l2i             
	//   15   26:iadd            
	//   16   27:bipush          31
	//   17   29:imul            
	//   18   30:lload_3         
	//   19   31:lload_3         
	//   20   32:bipush          32
	//   21   34:lushr           
	//   22   35:lxor            
	//   23   36:l2i             
	//   24   37:iadd            
	//   25   38:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("(");
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "(">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(latitude);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #20  <Field double latitude>
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(double)>
	//   12   23:pop             
		stringbuilder.append(",");
	//   13   24:aload_1         
	//   14   25:ldc1            #76  <String ",">
	//   15   27:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(longitude);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #22  <Field double longitude>
	//   20   36:invokevirtual   #74  <Method StringBuilder StringBuilder.append(double)>
	//   21   39:pop             
		stringbuilder.append(")");
	//   22   40:aload_1         
	//   23   41:ldc1            #78  <String ")">
	//   24   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return String.format(stringbuilder.toString(), new Object[0]);
	//   26   47:aload_1         
	//   27   48:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   28   51:iconst_0        
	//   29   52:anewarray       Object[]
	//   30   55:invokestatic    #84  <Method String String.format(String, Object[])>
	//   31   58:areturn         
	}

	private static final long serialVersionUID = 0xcf4e3048L;
	private final double latitude;
	private final double longitude;
}
