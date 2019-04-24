// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.irobot.home.model:
//			z, ac, h

public class WifiLastStat
	implements Parcelable
{

	public WifiLastStat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public WifiLastStat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = (z)parcel.readSerializable();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method java.io.Serializable Parcel.readSerializable()>
	//    5    9:checkcast       #38  <Class z>
	//    6   12:putfield        #40  <Field z a>
		b = (ac)parcel.readSerializable();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #36  <Method java.io.Serializable Parcel.readSerializable()>
	//   10   20:checkcast       #42  <Class ac>
	//   11   23:putfield        #44  <Field ac b>
		c = (h)parcel.readSerializable();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #36  <Method java.io.Serializable Parcel.readSerializable()>
	//   15   31:checkcast       #46  <Class h>
	//   16   34:putfield        #48  <Field h c>
		d = parcel.readInt();
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #52  <Method int Parcel.readInt()>
	//   20   42:putfield        #54  <Field int d>
		e = parcel.readInt();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #52  <Method int Parcel.readInt()>
	//   24   50:putfield        #56  <Field int e>
	//   25   53:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeSerializable(((java.io.Serializable) (a)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field z a>
	//    3    5:invokevirtual   #63  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeSerializable(((java.io.Serializable) (b)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field ac b>
	//    7   13:invokevirtual   #63  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeSerializable(((java.io.Serializable) (c)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field h c>
	//   11   21:invokevirtual   #63  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field int d>
	//   15   29:invokevirtual   #67  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field int e>
	//   19   37:invokevirtual   #67  <Method void Parcel.writeInt(int)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WifiLastStat a(Parcel parcel)
		{
			return new WifiLastStat(parcel);
		//    0    0:new             #9   <Class WifiLastStat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void WifiLastStat(Parcel)>
		//    4    8:areturn         
		}

		public WifiLastStat[] a(int i)
		{
			return new WifiLastStat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       WifiLastStat[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method WifiLastStat a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method WifiLastStat[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private z a;
	private ac b;
	private h c;
	private int d;
	private int e;

	static 
	{
	//    0    0:new             #8   <Class WifiLastStat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void WifiLastStat$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
