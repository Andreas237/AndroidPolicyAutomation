// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class RegisterRobotListItem
	implements Parcelable
{

	public RegisterRobotListItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method String Parcel.readString()>
	//    5    9:putfield        #34  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method String Parcel.readString()>
	//    9   17:putfield        #36  <Field String b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #40  <Method int Parcel.readInt()>
	//   13   25:putfield        #42  <Field int c>
	//   14   28:return          
	}

	public RegisterRobotListItem(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field String b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #42  <Field int c>
	//   11   19:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String b>
	//    2    4:areturn         
	}

	public int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int c>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field String a>
	//    3    5:invokevirtual   #50  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field String b>
	//    7   13:invokevirtual   #50  <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field int c>
	//   11   21:invokevirtual   #54  <Method void Parcel.writeInt(int)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RegisterRobotListItem a(Parcel parcel)
		{
			return new RegisterRobotListItem(parcel);
		//    0    0:new             #9   <Class RegisterRobotListItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RegisterRobotListItem(Parcel)>
		//    4    8:areturn         
		}

		public RegisterRobotListItem[] a(int i)
		{
			return new RegisterRobotListItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RegisterRobotListItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RegisterRobotListItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RegisterRobotListItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private int c;

	static 
	{
	//    0    0:new             #8   <Class RegisterRobotListItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RegisterRobotListItem$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
