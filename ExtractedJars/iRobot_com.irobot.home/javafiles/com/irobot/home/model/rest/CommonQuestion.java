// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;

public class CommonQuestion
	implements Parcelable
{

	public CommonQuestion(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		title = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "">
	//    4    7:putfield        #28  <Field String title>
		content = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <String "">
	//    7   13:putfield        #30  <Field String content>
		title = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #36  <Method String Parcel.readString()>
	//   11   21:putfield        #28  <Field String title>
		content = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #36  <Method String Parcel.readString()>
	//   15   29:putfield        #30  <Field String content>
	//   16   32:return          
	}

	public CommonQuestion(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		title = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "">
	//    4    7:putfield        #28  <Field String title>
		content = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <String "">
	//    7   13:putfield        #30  <Field String content>
		title = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #28  <Field String title>
		content = s1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #30  <Field String content>
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
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field String title>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeString(String)>
		parcel.writeString(content);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field String content>
	//    7   13:invokevirtual   #45  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CommonQuestion createFromParcel(Parcel parcel)
		{
			return new CommonQuestion(parcel);
		//    0    0:new             #9   <Class CommonQuestion>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void CommonQuestion(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method CommonQuestion createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CommonQuestion[] newArray(int i)
		{
			return new CommonQuestion[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CommonQuestion[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method CommonQuestion[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String content;
	public String title;

	static 
	{
	//    0    0:new             #8   <Class CommonQuestion$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void CommonQuestion$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
