// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home.model:
//			z, ac, y

public class WifiStatus
	implements Parcelable
{

	public WifiStatus(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		j = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #41  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void ArrayList()>
	//    6   12:putfield        #44  <Field List j>
		a = (z)parcel.readSerializable();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #50  <Method java.io.Serializable Parcel.readSerializable()>
	//   10   20:checkcast       #52  <Class z>
	//   11   23:putfield        #54  <Field z a>
		b = (ac)parcel.readSerializable();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #50  <Method java.io.Serializable Parcel.readSerializable()>
	//   15   31:checkcast       #56  <Class ac>
	//   16   34:putfield        #58  <Field ac b>
		c = parcel.readInt();
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #62  <Method int Parcel.readInt()>
	//   20   42:putfield        #64  <Field int c>
		d = parcel.readInt();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #62  <Method int Parcel.readInt()>
	//   24   50:putfield        #66  <Field int d>
		e = parcel.readInt();
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #62  <Method int Parcel.readInt()>
	//   28   58:putfield        #68  <Field int e>
		f = parcel.readLong();
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #72  <Method long Parcel.readLong()>
	//   32   66:putfield        #74  <Field long f>
		g = parcel.readLong();
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokevirtual   #72  <Method long Parcel.readLong()>
	//   36   74:putfield        #76  <Field long g>
		h = parcel.readLong();
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #72  <Method long Parcel.readLong()>
	//   40   82:putfield        #78  <Field long h>
		i = parcel.readLong();
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:invokevirtual   #72  <Method long Parcel.readLong()>
	//   44   90:putfield        #80  <Field long i>
		j = ((List) (parcel.readArrayList(((Class) (java/lang/Short)).getClassLoader())));
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:ldc1            #82  <Class Short>
	//   48   97:invokevirtual   #88  <Method ClassLoader Class.getClassLoader()>
	//   49  100:invokevirtual   #92  <Method ArrayList Parcel.readArrayList(ClassLoader)>
	//   50  103:putfield        #44  <Field List j>
		k = (y)parcel.readSerializable();
	//   51  106:aload_0         
	//   52  107:aload_1         
	//   53  108:invokevirtual   #50  <Method java.io.Serializable Parcel.readSerializable()>
	//   54  111:checkcast       #94  <Class y>
	//   55  114:putfield        #96  <Field y k>
	//   56  117:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int l)
	{
		parcel.writeSerializable(((java.io.Serializable) (a)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field z a>
	//    3    5:invokevirtual   #103 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeSerializable(((java.io.Serializable) (b)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field ac b>
	//    7   13:invokevirtual   #103 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #64  <Field int c>
	//   11   21:invokevirtual   #107 <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #66  <Field int d>
	//   15   29:invokevirtual   #107 <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #68  <Field int e>
	//   19   37:invokevirtual   #107 <Method void Parcel.writeInt(int)>
		parcel.writeLong(f);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #74  <Field long f>
	//   23   45:invokevirtual   #111 <Method void Parcel.writeLong(long)>
		parcel.writeLong(g);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #76  <Field long g>
	//   27   53:invokevirtual   #111 <Method void Parcel.writeLong(long)>
		parcel.writeLong(h);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #78  <Field long h>
	//   31   61:invokevirtual   #111 <Method void Parcel.writeLong(long)>
		parcel.writeLong(i);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #80  <Field long i>
	//   35   69:invokevirtual   #111 <Method void Parcel.writeLong(long)>
		parcel.writeList(j);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #44  <Field List j>
	//   39   77:invokevirtual   #115 <Method void Parcel.writeList(List)>
		parcel.writeSerializable(((java.io.Serializable) (k)));
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #96  <Field y k>
	//   43   85:invokevirtual   #103 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//   44   88:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WifiStatus a(Parcel parcel)
		{
			return new WifiStatus(parcel);
		//    0    0:new             #9   <Class WifiStatus>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void WifiStatus(Parcel)>
		//    4    8:areturn         
		}

		public WifiStatus[] a(int l)
		{
			return new WifiStatus[l];
		//    0    0:iload_1         
		//    1    1:anewarray       WifiStatus[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method WifiStatus a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int l)
		{
			return ((Object []) (a(l)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method WifiStatus[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private z a;
	private ac b;
	private int c;
	private int d;
	private int e;
	private long f;
	private long g;
	private long h;
	private long i;
	private List j;
	private y k;

	static 
	{
	//    0    0:new             #8   <Class WifiStatus$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void WifiStatus$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
