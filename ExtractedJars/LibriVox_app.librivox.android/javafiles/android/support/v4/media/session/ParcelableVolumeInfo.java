// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.media.session:
//			bl

public class ParcelableVolumeInfo
	implements Parcelable
{

	public ParcelableVolumeInfo(int i, int j, int k, int l, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int c>
		d = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field int d>
		e = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field int e>
	//   17   31:return          
	}

	public ParcelableVolumeInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method int Parcel.readInt()>
	//    5    9:putfield        #28  <Field int a>
		c = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #43  <Method int Parcel.readInt()>
	//    9   17:putfield        #32  <Field int c>
		d = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #43  <Method int Parcel.readInt()>
	//   13   25:putfield        #34  <Field int d>
		e = parcel.readInt();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #43  <Method int Parcel.readInt()>
	//   17   33:putfield        #36  <Field int e>
		b = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #43  <Method int Parcel.readInt()>
	//   21   41:putfield        #30  <Field int b>
	//   22   44:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int a>
	//    3    5:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int c>
	//    7   13:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field int d>
	//   11   21:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #36  <Field int e>
	//   15   29:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field int b>
	//   19   37:invokevirtual   #50  <Method void Parcel.writeInt(int)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bl();
	public int a;
	public int b;
	public int c;
	public int d;
	public int e;

	static 
	{
	//    0    0:new             #18  <Class bl>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void bl()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
