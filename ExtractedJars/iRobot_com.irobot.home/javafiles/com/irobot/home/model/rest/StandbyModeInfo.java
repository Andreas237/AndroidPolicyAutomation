// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;

public class StandbyModeInfo
	implements Parcelable
{

	public StandbyModeInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		standbyModeLink = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <String "">
	//    4    7:putfield        #27  <Field String standbyModeLink>
		standbyModeLink = parcel.readString();
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #33  <Method String Parcel.readString()>
	//    8   15:putfield        #27  <Field String standbyModeLink>
	//    9   18:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(standbyModeLink);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String standbyModeLink>
	//    3    5:invokevirtual   #41  <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public StandbyModeInfo createFromParcel(Parcel parcel)
		{
			return new StandbyModeInfo(parcel);
		//    0    0:new             #9   <Class StandbyModeInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void StandbyModeInfo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method StandbyModeInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public StandbyModeInfo[] newArray(int i)
		{
			return new StandbyModeInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       StandbyModeInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method StandbyModeInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String standbyModeLink;

	static 
	{
	//    0    0:new             #8   <Class StandbyModeInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StandbyModeInfo$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
