// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.irobot.home.model:
//			y

public class WifiConfig
	implements Parcelable
{

	public WifiConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public WifiConfig(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method String Parcel.readString()>
	//    5    9:putfield        #42  <Field String a>
		c = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #40  <Method String Parcel.readString()>
	//    9   17:putfield        #44  <Field String c>
		b = (y)parcel.readSerializable();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #48  <Method java.io.Serializable Parcel.readSerializable()>
	//   13   25:checkcast       #50  <Class y>
	//   14   28:putfield        #52  <Field y b>
		d = parcel.readInt();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #56  <Method int Parcel.readInt()>
	//   18   36:putfield        #58  <Field int d>
		e = parcel.readLong();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #62  <Method long Parcel.readLong()>
	//   22   44:putfield        #64  <Field long e>
		f = parcel.readLong();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #62  <Method long Parcel.readLong()>
	//   26   52:putfield        #66  <Field long f>
		g = parcel.readLong();
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #62  <Method long Parcel.readLong()>
	//   30   60:putfield        #68  <Field long g>
		h = parcel.readLong();
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #62  <Method long Parcel.readLong()>
	//   34   68:putfield        #70  <Field long h>
		i = parcel.readLong();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #62  <Method long Parcel.readLong()>
	//   38   76:putfield        #72  <Field long i>
	//   39   79:return          
	}

	public WifiConfig(String s, y y1, String s1, int j, long l, long l1, long l2, long l3, long l4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field String a>
		b = y1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field y b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String c>
		d = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #58  <Field int d>
		e = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #64  <Field long e>
		f = l1;
	//   17   31:aload_0         
	//   18   32:lload           7
	//   19   34:putfield        #66  <Field long f>
		g = l2;
	//   20   37:aload_0         
	//   21   38:lload           9
	//   22   40:putfield        #68  <Field long g>
		h = l3;
	//   23   43:aload_0         
	//   24   44:lload           11
	//   25   46:putfield        #70  <Field long h>
		i = l4;
	//   26   49:aload_0         
	//   27   50:lload           13
	//   28   52:putfield        #72  <Field long i>
	//   29   55:return          
	}

	public void a(int j)
	{
		d = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int d>
	//    3    5:return          
	}

	public void a(y y1)
	{
		b = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field y b>
	//    3    5:return          
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String a>
	//    3    5:return          
	}

	public boolean a()
	{
		return d == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int d>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String a>
	//    2    4:areturn         
	}

	public void b(int j)
	{
		e = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #64  <Field long e>
	//    4    6:return          
	}

	public void b(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String c>
	//    3    5:return          
	}

	public y c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field y b>
	//    2    4:areturn         
	}

	public void c(int j)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #66  <Field long f>
	//    4    6:return          
	}

	public String d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String c>
	//    2    4:areturn         
	}

	public void d(int j)
	{
		g = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #68  <Field long g>
	//    4    6:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long e>
	//    2    4:lreturn         
	}

	public void e(int j)
	{
		h = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #70  <Field long h>
	//    4    6:return          
	}

	public long f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long f>
	//    2    4:lreturn         
	}

	public void f(int j)
	{
		i = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #72  <Field long i>
	//    4    6:return          
	}

	public long g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long g>
	//    2    4:lreturn         
	}

	public long h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long h>
	//    2    4:lreturn         
	}

	public long i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long i>
	//    2    4:lreturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field String a>
	//    3    5:invokevirtual   #84  <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field String c>
	//    7   13:invokevirtual   #84  <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (b)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field y b>
	//   11   21:invokevirtual   #88  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #58  <Field int d>
	//   15   29:invokevirtual   #91  <Method void Parcel.writeInt(int)>
		parcel.writeLong(e);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #64  <Field long e>
	//   19   37:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		parcel.writeLong(f);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field long f>
	//   23   45:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		parcel.writeLong(g);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #68  <Field long g>
	//   27   53:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		parcel.writeLong(h);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #70  <Field long h>
	//   31   61:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		parcel.writeLong(i);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #72  <Field long i>
	//   35   69:invokevirtual   #95  <Method void Parcel.writeLong(long)>
	//   36   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WifiConfig a(Parcel parcel)
		{
			return new WifiConfig(parcel);
		//    0    0:new             #9   <Class WifiConfig>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void WifiConfig(Parcel)>
		//    4    8:areturn         
		}

		public WifiConfig[] a(int j)
		{
			return new WifiConfig[j];
		//    0    0:iload_1         
		//    1    1:anewarray       WifiConfig[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method WifiConfig a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int j)
		{
			return ((Object []) (a(j)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method WifiConfig[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private y b;
	private String c;
	private int d;
	private long e;
	private long f;
	private long g;
	private long h;
	private long i;

	static 
	{
	//    0    0:new             #8   <Class WifiConfig$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void WifiConfig$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
