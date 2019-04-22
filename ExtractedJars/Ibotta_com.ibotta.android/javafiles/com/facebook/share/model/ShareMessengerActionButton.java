// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel

public abstract class ShareMessengerActionButton
	implements ShareModel
{

	ShareMessengerActionButton(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		title = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method String Parcel.readString()>
	//    5    9:putfield        #21  <Field String title>
	//    6   12:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String title>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String title>
	//    3    5:invokevirtual   #31  <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	private final String title;
}
