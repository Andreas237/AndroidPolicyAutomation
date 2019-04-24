// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor._private;

import android.os.Parcel;

// Referenced classes of package com.samsung.android.sdk.health.sensor._private:
//			_PrivilegeSensorDevice

static final class _PrivilegeSensorDevice$1
	implements android.os.Parcelable.Creator
{

	public _PrivilegeSensorDevice createFromParcel(Parcel parcel)
	{
		return new _PrivilegeSensorDevice(parcel);
	//    0    0:new             #9   <Class _PrivilegeSensorDevice>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void _PrivilegeSensorDevice(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method _PrivilegeSensorDevice createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public _PrivilegeSensorDevice[] newArray(int i)
	{
		return new _PrivilegeSensorDevice[i];
	//    0    0:iload_1         
	//    1    1:anewarray       _PrivilegeSensorDevice[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method _PrivilegeSensorDevice[] newArray(int)>
	//    3    5:areturn         
	}

	_PrivilegeSensorDevice$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
