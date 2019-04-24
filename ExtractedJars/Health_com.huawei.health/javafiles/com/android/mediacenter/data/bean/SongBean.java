// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.mediacenter.data.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class SongBean
	implements Parcelable
{

	public SongBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
	//    0    0:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SongBean createFromParcel(Parcel parcel)
		{
			return new SongBean();
		//    0    0:new             #9   <Class SongBean>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void SongBean()>
		//    3    7:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method SongBean createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SongBean[] newArray(int i)
		{
			return new SongBean[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SongBean[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #25  <Method SongBean[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #8   <Class SongBean$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void SongBean$1()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
