// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.AssetTimeEvent;

public class HourMinTime
	implements Parcelable
{

	public HourMinTime()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public HourMinTime(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method int Parcel.readInt()>
	//    5    9:putfield        #32  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #30  <Method int Parcel.readInt()>
	//    9   17:putfield        #34  <Field int b>
	//   10   20:return          
	}

	public void a(AssetTimeEvent assettimeevent)
	{
		a = ((int) (assettimeevent.hour()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method short AssetTimeEvent.hour()>
	//    3    5:putfield        #32  <Field int a>
		b = ((int) (assettimeevent.minute()));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method short AssetTimeEvent.minute()>
	//    7   13:putfield        #34  <Field int b>
	//    8   16:return          
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
	//    2    2:getfield        #32  <Field int a>
	//    3    5:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field int b>
	//    7   13:invokevirtual   #51  <Method void Parcel.writeInt(int)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public HourMinTime a(Parcel parcel)
		{
			return new HourMinTime(parcel);
		//    0    0:new             #9   <Class HourMinTime>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void HourMinTime(Parcel)>
		//    4    8:areturn         
		}

		public HourMinTime[] a(int i)
		{
			return new HourMinTime[i];
		//    0    0:iload_1         
		//    1    1:anewarray       HourMinTime[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method HourMinTime a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method HourMinTime[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	int b;

	static 
	{
	//    0    0:new             #8   <Class HourMinTime$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void HourMinTime$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
