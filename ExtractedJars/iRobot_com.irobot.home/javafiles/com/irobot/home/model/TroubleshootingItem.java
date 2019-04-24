// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TroubleshootingItem
	implements Parcelable
{

	public TroubleshootingItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method String Parcel.readString()>
	//    5    9:putfield        #32  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #30  <Method String Parcel.readString()>
	//    9   17:putfield        #34  <Field String b>
	//   10   20:return          
	}

	public TroubleshootingItem(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field String b>
	//    8   14:return          
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
	//    2    2:getfield        #32  <Field String a>
	//    3    5:invokevirtual   #43  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field String b>
	//    7   13:invokevirtual   #43  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TroubleshootingItem a(Parcel parcel)
		{
			return new TroubleshootingItem(parcel);
		//    0    0:new             #9   <Class TroubleshootingItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TroubleshootingItem(Parcel)>
		//    4    8:areturn         
		}

		public TroubleshootingItem[] a(int i)
		{
			return new TroubleshootingItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TroubleshootingItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method TroubleshootingItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method TroubleshootingItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public String a;
	public String b;

	static 
	{
	//    0    0:new             #8   <Class TroubleshootingItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void TroubleshootingItem$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
