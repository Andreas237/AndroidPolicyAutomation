// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class LatLngCreator
	implements android.os.Parcelable.Creator
{

	public LatLngCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public LatLng createFromParcel(Parcel parcel)
	{
		double d = parcel.readDouble();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method double Parcel.readDouble()>
	//    2    4:dstore_2        
		return new LatLng(parcel.readDouble(), d);
	//    3    5:new             #25  <Class LatLng>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method double Parcel.readDouble()>
	//    7   13:dload_2         
	//    8   14:invokespecial   #28  <Method void LatLng(double, double)>
	//    9   17:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method LatLng createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LatLng[] newArray(int i)
	{
		return new LatLng[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LatLng[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #36  <Method LatLng[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
