// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MissionRunStatistic
	implements Parcelable
{

	public MissionRunStatistic()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public MissionRunStatistic(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #39  <Method int Parcel.readInt()>
	//    5    9:putfield        #41  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #39  <Method int Parcel.readInt()>
	//    9   17:putfield        #43  <Field int b>
		c = parcel.readLong();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #47  <Method long Parcel.readLong()>
	//   13   25:putfield        #49  <Field long c>
		d = parcel.readInt();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #39  <Method int Parcel.readInt()>
	//   17   33:putfield        #51  <Field int d>
		e = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #39  <Method int Parcel.readInt()>
	//   21   41:putfield        #53  <Field int e>
		f = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #39  <Method int Parcel.readInt()>
	//   25   49:putfield        #55  <Field int f>
		g = parcel.readInt();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #39  <Method int Parcel.readInt()>
	//   29   57:putfield        #57  <Field int g>
		h = parcel.readInt();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #39  <Method int Parcel.readInt()>
	//   33   65:putfield        #59  <Field int h>
		i = parcel.readInt();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #39  <Method int Parcel.readInt()>
	//   37   73:putfield        #61  <Field int i>
	//   38   76:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field int a>
	//    3    5:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field int b>
	//    7   13:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeLong(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field long c>
	//   11   21:invokevirtual   #72  <Method void Parcel.writeLong(long)>
		parcel.writeInt(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #51  <Field int d>
	//   15   29:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field int e>
	//   19   37:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #55  <Field int f>
	//   23   45:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #57  <Field int g>
	//   27   53:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(h);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #59  <Field int h>
	//   31   61:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #61  <Field int i>
	//   35   69:invokevirtual   #68  <Method void Parcel.writeInt(int)>
	//   36   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MissionRunStatistic a(Parcel parcel)
		{
			return new MissionRunStatistic(parcel);
		//    0    0:new             #9   <Class MissionRunStatistic>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MissionRunStatistic(Parcel)>
		//    4    8:areturn         
		}

		public MissionRunStatistic[] a(int j)
		{
			return new MissionRunStatistic[j];
		//    0    0:iload_1         
		//    1    1:anewarray       MissionRunStatistic[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MissionRunStatistic a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int j)
		{
			return ((Object []) (a(j)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MissionRunStatistic[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	int b;
	long c;
	int d;
	int e;
	int f;
	int g;
	int h;
	int i;

	static 
	{
	//    0    0:new             #8   <Class MissionRunStatistic$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void MissionRunStatistic$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
