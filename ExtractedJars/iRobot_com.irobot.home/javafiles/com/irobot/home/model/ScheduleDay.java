// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.irobot.home.model:
//			x

public class ScheduleDay
	implements Parcelable
{

	public ScheduleDay(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = (Schedule.a)parcel.readSerializable();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method java.io.Serializable Parcel.readSerializable()>
	//    5    9:checkcast       #37  <Class Schedule$a>
	//    6   12:putfield        #39  <Field Schedule$a a>
		b = parcel.readInt();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method int Parcel.readInt()>
	//   10   20:putfield        #45  <Field int b>
		c = parcel.readInt();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #43  <Method int Parcel.readInt()>
	//   14   28:putfield        #47  <Field int c>
		d = (x)parcel.readSerializable();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #35  <Method java.io.Serializable Parcel.readSerializable()>
	//   18   36:checkcast       #49  <Class x>
	//   19   39:putfield        #51  <Field x d>
	//   20   42:return          
	}

	public ScheduleDay(Schedule.a a1, int i, int j, x x1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field Schedule$a a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #45  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #47  <Field int c>
		d = x1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #51  <Field x d>
	//   14   25:return          
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
	//    2    2:getfield        #39  <Field Schedule$a a>
	//    3    5:invokevirtual   #59  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field int b>
	//    7   13:invokevirtual   #63  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field int c>
	//   11   21:invokevirtual   #63  <Method void Parcel.writeInt(int)>
		parcel.writeSerializable(((java.io.Serializable) (d)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #51  <Field x d>
	//   15   29:invokevirtual   #59  <Method void Parcel.writeSerializable(java.io.Serializable)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ScheduleDay a(Parcel parcel)
		{
			return new ScheduleDay(parcel);
		//    0    0:new             #9   <Class ScheduleDay>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ScheduleDay(Parcel)>
		//    4    8:areturn         
		}

		public ScheduleDay[] a(int i)
		{
			return new ScheduleDay[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ScheduleDay[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method ScheduleDay a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method ScheduleDay[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public Schedule.a a;
	public int b;
	public int c;
	public x d;

	static 
	{
	//    0    0:new             #8   <Class ScheduleDay$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ScheduleDay$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
