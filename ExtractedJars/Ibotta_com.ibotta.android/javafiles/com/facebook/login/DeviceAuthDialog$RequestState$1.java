// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

static final class DeviceAuthDialog$RequestState$1
	implements android.os.Parcelable.Creator
{

	public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel)
	{
		return new DeviceAuthDialog.RequestState(parcel);
	//    0    0:new             #9   <Class DeviceAuthDialog$RequestState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void DeviceAuthDialog$RequestState(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method DeviceAuthDialog$RequestState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public DeviceAuthDialog.RequestState[] newArray(int i)
	{
		return new DeviceAuthDialog.RequestState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DeviceAuthDialog.RequestState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method DeviceAuthDialog$RequestState[] newArray(int)>
	//    3    5:areturn         
	}

	DeviceAuthDialog$RequestState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
