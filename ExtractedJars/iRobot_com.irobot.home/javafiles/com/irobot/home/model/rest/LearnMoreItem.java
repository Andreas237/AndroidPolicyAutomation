// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;

public class LearnMoreItem
	implements Parcelable
{

	public LearnMoreItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		product = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "">
	//    4    7:putfield        #28  <Field String product>
		learnUrl = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <String "">
	//    7   13:putfield        #30  <Field String learnUrl>
		product = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #36  <Method String Parcel.readString()>
	//   11   21:putfield        #28  <Field String product>
		learnUrl = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #36  <Method String Parcel.readString()>
	//   15   29:putfield        #30  <Field String learnUrl>
	//   16   32:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(product);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field String product>
	//    3    5:invokevirtual   #44  <Method void Parcel.writeString(String)>
		parcel.writeString(learnUrl);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field String learnUrl>
	//    7   13:invokevirtual   #44  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LearnMoreItem createFromParcel(Parcel parcel)
		{
			return new LearnMoreItem(parcel);
		//    0    0:new             #9   <Class LearnMoreItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void LearnMoreItem(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method LearnMoreItem createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LearnMoreItem[] newArray(int i)
		{
			return new LearnMoreItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LearnMoreItem[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method LearnMoreItem[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String learnUrl;
	public String product;

	static 
	{
	//    0    0:new             #8   <Class LearnMoreItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void LearnMoreItem$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
