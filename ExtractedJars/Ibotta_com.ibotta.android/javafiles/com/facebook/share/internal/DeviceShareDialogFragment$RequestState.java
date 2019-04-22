// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.share.internal:
//			DeviceShareDialogFragment

private static class DeviceShareDialogFragment$RequestState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long getExpiresIn()
	{
		return expiresIn;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long expiresIn>
	//    2    4:lreturn         
	}

	public String getUserCode()
	{
		return userCode;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String userCode>
	//    2    4:areturn         
	}

	public void setExpiresIn(long l)
	{
		expiresIn = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #42  <Field long expiresIn>
	//    3    5:return          
	}

	public void setUserCode(String s)
	{
		userCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String userCode>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(userCode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field String userCode>
	//    3    5:invokevirtual   #55  <Method void Parcel.writeString(String)>
		parcel.writeLong(expiresIn);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field long expiresIn>
	//    7   13:invokevirtual   #58  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DeviceShareDialogFragment.RequestState createFromParcel(Parcel parcel)
		{
			return new DeviceShareDialogFragment.RequestState(parcel);
		//    0    0:new             #9   <Class DeviceShareDialogFragment$RequestState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void DeviceShareDialogFragment$RequestState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method DeviceShareDialogFragment$RequestState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DeviceShareDialogFragment.RequestState[] newArray(int i)
		{
			return new DeviceShareDialogFragment.RequestState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DeviceShareDialogFragment.RequestState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method DeviceShareDialogFragment$RequestState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private long expiresIn;
	private String userCode;

	static 
	{
	//    0    0:new             #11  <Class DeviceShareDialogFragment$RequestState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void DeviceShareDialogFragment$RequestState$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	DeviceShareDialogFragment$RequestState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	protected DeviceShareDialogFragment$RequestState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		userCode = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method String Parcel.readString()>
	//    5    9:putfield        #36  <Field String userCode>
		expiresIn = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #40  <Method long Parcel.readLong()>
	//    9   17:putfield        #42  <Field long expiresIn>
	//   10   20:return          
	}
}
