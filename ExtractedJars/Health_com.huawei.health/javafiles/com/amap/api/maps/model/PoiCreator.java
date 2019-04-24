// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			Poi, LatLng

public class PoiCreator
	implements android.os.Parcelable.Creator
{

	public PoiCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Poi createFromParcel(Parcel parcel)
	{
		return new Poi(parcel.readString(), (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader()), parcel.readString());
	//    0    0:new             #16  <Class Poi>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method String Parcel.readString()>
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <Class LatLng>
	//    6   11:invokevirtual   #30  <Method ClassLoader Class.getClassLoader()>
	//    7   14:invokevirtual   #34  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   17:checkcast       #24  <Class LatLng>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #22  <Method String Parcel.readString()>
	//   11   24:invokespecial   #37  <Method void Poi(String, LatLng, String)>
	//   12   27:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method Poi createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public Poi[] newArray(int i)
	{
		return new Poi[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Poi[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #45  <Method Poi[] newArray(int)>
	//    3    5:areturn         
	}
}
