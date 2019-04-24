// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location.core;

import android.a.a.a.p;
import android.os.*;

// Referenced classes of package com.amap.api.location.core:
//			f

public class GeoPoint
	implements Parcelable
{

	public GeoPoint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #27  <Long 0x0L>
	//    4    8:putfield        #30  <Field long a>
		b = 0x0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #27  <Long 0x0L>
	//    7   15:putfield        #32  <Field long b>
		c = 4.9406564584124654E-324D;
	//    8   18:aload_0         
	//    9   19:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   10   22:putfield        #36  <Field double c>
		d = 4.9406564584124654E-324D;
	//   11   25:aload_0         
	//   12   26:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   13   29:putfield        #38  <Field double d>
		a = 0L;
	//   14   32:aload_0         
	//   15   33:lconst_0        
	//   16   34:putfield        #30  <Field long a>
		b = 0L;
	//   17   37:aload_0         
	//   18   38:lconst_0        
	//   19   39:putfield        #32  <Field long b>
	//   20   42:return          
	}

	public GeoPoint(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #27  <Long 0x0L>
	//    4    8:putfield        #30  <Field long a>
		b = 0x0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #27  <Long 0x0L>
	//    7   15:putfield        #32  <Field long b>
		c = 4.9406564584124654E-324D;
	//    8   18:aload_0         
	//    9   19:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   10   22:putfield        #36  <Field double c>
		d = 4.9406564584124654E-324D;
	//   11   25:aload_0         
	//   12   26:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   13   29:putfield        #38  <Field double d>
		a = i;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:i2l             
	//   17   35:putfield        #30  <Field long a>
		b = j;
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:i2l             
	//   21   41:putfield        #32  <Field long b>
	//   22   44:return          
	}

	public GeoPoint(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #27  <Long 0x0L>
	//    4    8:putfield        #30  <Field long a>
		b = 0x0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #27  <Long 0x0L>
	//    7   15:putfield        #32  <Field long b>
		c = 4.9406564584124654E-324D;
	//    8   18:aload_0         
	//    9   19:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   10   22:putfield        #36  <Field double c>
		d = 4.9406564584124654E-324D;
	//   11   25:aload_0         
	//   12   26:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   13   29:putfield        #38  <Field double d>
		a = l;
	//   14   32:aload_0         
	//   15   33:lload_1         
	//   16   34:putfield        #30  <Field long a>
		b = l1;
	//   17   37:aload_0         
	//   18   38:lload_3         
	//   19   39:putfield        #32  <Field long b>
	//   20   42:return          
	}

	private GeoPoint(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #27  <Long 0x0L>
	//    4    8:putfield        #30  <Field long a>
		b = 0x0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #27  <Long 0x0L>
	//    7   15:putfield        #32  <Field long b>
		c = 4.9406564584124654E-324D;
	//    8   18:aload_0         
	//    9   19:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   10   22:putfield        #36  <Field double c>
		d = 4.9406564584124654E-324D;
	//   11   25:aload_0         
	//   12   26:ldc2w           #33  <Double 4.9406564584124654E-324D>
	//   13   29:putfield        #38  <Field double d>
		a = parcel.readLong();
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokevirtual   #47  <Method long Parcel.readLong()>
	//   17   37:putfield        #30  <Field long a>
		b = parcel.readLong();
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #47  <Method long Parcel.readLong()>
	//   21   45:putfield        #32  <Field long b>
	//   22   48:return          
	}

	GeoPoint(Parcel parcel, f f1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void GeoPoint(Parcel)>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #58  <Method Class Object.getClass()>
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #58  <Method Class Object.getClass()>
	//*   8   14:if_acmpeq       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		obj = ((Object) ((GeoPoint)obj));
	//   11   19:aload_1         
	//   12   20:checkcast       #2   <Class GeoPoint>
	//   13   23:astore_1        
		return c == ((GeoPoint) (obj)).c && d == ((GeoPoint) (obj)).d && a == ((GeoPoint) (obj)).a && b == ((GeoPoint) (obj)).b;
	//   14   24:aload_0         
	//   15   25:getfield        #36  <Field double c>
	//   16   28:aload_1         
	//   17   29:getfield        #36  <Field double c>
	//   18   32:dcmpl           
	//   19   33:ifne            74
	//   20   36:aload_0         
	//   21   37:getfield        #38  <Field double d>
	//   22   40:aload_1         
	//   23   41:getfield        #38  <Field double d>
	//   24   44:dcmpl           
	//   25   45:ifne            74
	//   26   48:aload_0         
	//   27   49:getfield        #30  <Field long a>
	//   28   52:aload_1         
	//   29   53:getfield        #30  <Field long a>
	//   30   56:lcmp            
	//   31   57:ifne            74
	//   32   60:aload_0         
	//   33   61:getfield        #32  <Field long b>
	//   34   64:aload_1         
	//   35   65:getfield        #32  <Field long b>
	//   36   68:lcmp            
	//   37   69:ifne            74
	//   38   72:iconst_1        
	//   39   73:ireturn         
	//   40   74:iconst_0        
	//   41   75:ireturn         
	}

	public int getLatitudeE6()
	{
		return (int)a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long a>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	public int getLongitudeE6()
	{
		return (int)b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long b>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	public int hashCode()
	{
		return (int)(d * 7D + c * 11D);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field double d>
	//    2    4:ldc2w           #62  <Double 7D>
	//    3    7:dmul            
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field double c>
	//    6   12:ldc2w           #64  <Double 11D>
	//    7   15:dmul            
	//    8   16:dadd            
	//    9   17:d2i             
	//   10   18:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("").append(a).append(",").append(b).toString();
	//    0    0:new             #69  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:ldc1            #72  <String "">
	//    4    9:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #30  <Field long a>
	//    7   16:invokevirtual   #79  <Method StringBuilder StringBuilder.append(long)>
	//    8   19:ldc1            #81  <String ",">
	//    9   21:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #32  <Field long b>
	//   12   28:invokevirtual   #79  <Method StringBuilder StringBuilder.append(long)>
	//   13   31:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field long a>
	//    3    5:invokevirtual   #89  <Method void Parcel.writeLong(long)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field long b>
	//    7   13:invokevirtual   #89  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new f();
	private long a;
	private long b;
	private double c;
	private double d;

	static 
	{
	//    0    0:new             #8   <Class f>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void f()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	// Unreferenced inner class o/f
	static final class f
		implements android.a.a.a.s.a.a
	{

		public p a(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
		{
			return new p(s, charsequence, acharsequence, flag, bundle);
		//    0    0:new             #15  <Class p>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:aload           5
		//    7   11:invokespecial   #18  <Method void p(String, CharSequence, CharSequence[], boolean, Bundle)>
		//    8   14:areturn         
		}

		public p[] a(int i)
		{
			return new p[i];
		//    0    0:iload_1         
		//    1    1:anewarray       p[]
		//    2    4:areturn         
		}

		public android.a.a.a.s.a b(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
		{
			return ((android.a.a.a.s.a) (a(s, charsequence, acharsequence, flag, bundle)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:aload           5
		//    6    8:invokevirtual   #23  <Method p a(String, CharSequence, CharSequence[], boolean, Bundle)>
		//    7   11:areturn         
		}

		public android.a.a.a.s.a[] b(int i)
		{
			return ((android.a.a.a.s.a []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method p[] a(int)>
		//    3    5:areturn         
		}

			public f()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
	}

}
