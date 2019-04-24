// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			PolygonHoleOptions

static final class PolygonHoleOptions$1
	implements android.os.Parcelable.Creator
{

	public PolygonHoleOptions a(Parcel parcel)
	{
		return new PolygonHoleOptions(parcel);
	//    0    0:new             #9   <Class PolygonHoleOptions>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void PolygonHoleOptions(Parcel)>
	//    4    8:areturn         
	}

	public PolygonHoleOptions[] a(int i)
	{
		return new PolygonHoleOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PolygonHoleOptions[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method PolygonHoleOptions a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method PolygonHoleOptions[] a(int)>
	//    3    5:areturn         
	}

	PolygonHoleOptions$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
