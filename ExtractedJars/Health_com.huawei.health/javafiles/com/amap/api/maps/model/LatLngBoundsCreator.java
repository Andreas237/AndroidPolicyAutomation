// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.BadParcelableException;
import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			LatLngBounds, LatLng

public class LatLngBoundsCreator
	implements android.os.Parcelable.Creator
{

	public LatLngBoundsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
	{
		parcel.writeInt(latlngbounds.a());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method int LatLngBounds.a()>
	//    3    5:invokevirtual   #28  <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((android.os.Parcelable) (latlngbounds.southwest)), i);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field LatLng LatLngBounds.southwest>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (latlngbounds.northeast)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field LatLng LatLngBounds.northeast>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   14   26:return          
	}

	public LatLngBounds createFromParcel(Parcel parcel)
	{
		int i;
		LatLng latlng;
		Object obj;
		latlng = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		i = parcel.readInt();
	//    4    5:aload_1         
	//    5    6:invokevirtual   #46  <Method int Parcel.readInt()>
	//    6    9:istore_2        
		LatLng latlng1 = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLngBounds)).getClassLoader());
	//    7   10:aload_1         
	//    8   11:ldc1            #19  <Class LatLngBounds>
	//    9   13:invokevirtual   #52  <Method ClassLoader Class.getClassLoader()>
	//   10   16:invokevirtual   #56  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   11   19:checkcast       #58  <Class LatLng>
	//   12   22:astore          4
		latlng = latlng1;
	//   13   24:aload           4
	//   14   26:astore_3        
		parcel = ((Parcel) ((LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLngBounds)).getClassLoader())));
	//   15   27:aload_1         
	//   16   28:ldc1            #19  <Class LatLngBounds>
	//   17   30:invokevirtual   #52  <Method ClassLoader Class.getClassLoader()>
	//   18   33:invokevirtual   #56  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   19   36:checkcast       #58  <Class LatLng>
	//   20   39:astore_1        
		latlng = latlng1;
	//   21   40:aload           4
	//   22   42:astore_3        
		break MISSING_BLOCK_LABEL_54;
	//   23   43:goto            54
		parcel;
	//   24   46:astore_1        
		((BadParcelableException) (parcel)).printStackTrace();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #61  <Method void BadParcelableException.printStackTrace()>
		parcel = ((Parcel) (obj));
	//   27   51:aload           5
	//   28   53:astore_1        
		return new LatLngBounds(i, latlng, ((LatLng) (parcel)));
	//   29   54:new             #19  <Class LatLngBounds>
	//   30   57:dup             
	//   31   58:iload_2         
	//   32   59:aload_3         
	//   33   60:aload_1         
	//   34   61:invokespecial   #64  <Method void LatLngBounds(int, LatLng, LatLng)>
	//   35   64:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method LatLngBounds createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LatLngBounds[] newArray(int i)
	{
		return new LatLngBounds[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LatLngBounds[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #72  <Method LatLngBounds[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
