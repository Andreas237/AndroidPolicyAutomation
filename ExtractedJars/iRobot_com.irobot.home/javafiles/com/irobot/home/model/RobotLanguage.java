// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.home.util.j;

public class RobotLanguage
	implements Parcelable, Comparable
{

	public RobotLanguage(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String b>
	//    8   14:return          
	}

	public RobotLanguage(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method int Parcel.readInt()>
	//    5    9:putfield        #29  <Field int a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method String Parcel.readString()>
	//    9   17:putfield        #31  <Field String b>
	//   10   20:return          
	}

	public String a()
	{
		return j.c(b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String b>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #48  <Method String j.c(String, boolean)>
	//    4    8:areturn         
	}

	public String a(boolean flag)
	{
		return j.b(b, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String b>
	//    2    4:iload_1         
	//    3    5:invokestatic    #51  <Method String j.b(String, boolean)>
	//    4    8:areturn         
	}

	public int compareTo(Object obj)
	{
		if(obj instanceof RobotLanguage)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class RobotLanguage>
	//*   2    4:ifeq            22
			return b.compareTo(((RobotLanguage)obj).b);
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field String b>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class RobotLanguage>
	//    7   15:getfield        #31  <Field String b>
	//    8   18:invokevirtual   #58  <Method int String.compareTo(String)>
	//    9   21:ireturn         
		else
			return 0;
	//   10   22:iconst_0        
	//   11   23:ireturn         
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
	//    2    2:getfield        #29  <Field int a>
	//    3    5:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field String b>
	//    7   13:invokevirtual   #69  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotLanguage a(Parcel parcel)
		{
			return new RobotLanguage(parcel);
		//    0    0:new             #9   <Class RobotLanguage>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotLanguage(Parcel)>
		//    4    8:areturn         
		}

		public RobotLanguage[] a(int i)
		{
			return new RobotLanguage[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotLanguage[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotLanguage a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotLanguage[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public int a;
	public String b;

	static 
	{
	//    0    0:new             #10  <Class RobotLanguage$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void RobotLanguage$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
