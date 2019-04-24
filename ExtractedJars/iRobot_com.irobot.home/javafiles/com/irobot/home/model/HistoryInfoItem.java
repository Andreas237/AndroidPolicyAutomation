// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class HistoryInfoItem
	implements Parcelable
{

	public HistoryInfoItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "">
	//    4    7:putfield        #28  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <String "">
	//    7   13:putfield        #30  <Field String b>
		a = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #36  <Method String Parcel.readString()>
	//   11   21:putfield        #28  <Field String a>
		b = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #36  <Method String Parcel.readString()>
	//   15   29:putfield        #30  <Field String b>
	//   16   32:return          
	}

	public HistoryInfoItem(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "">
	//    4    7:putfield        #28  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <String "">
	//    7   13:putfield        #30  <Field String b>
		a = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #28  <Field String a>
		b = s1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #30  <Field String b>
	//   14   26:return          
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
	//    2    2:getfield        #28  <Field String a>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field String b>
	//    7   13:invokevirtual   #45  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public HistoryInfoItem a(Parcel parcel)
		{
			return new HistoryInfoItem(parcel);
		//    0    0:new             #9   <Class HistoryInfoItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void HistoryInfoItem(Parcel)>
		//    4    8:areturn         
		}

		public HistoryInfoItem[] a(int i)
		{
			return new HistoryInfoItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       HistoryInfoItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method HistoryInfoItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method HistoryInfoItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public String a;
	public String b;

	static 
	{
	//    0    0:new             #8   <Class HistoryInfoItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void HistoryInfoItem$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
