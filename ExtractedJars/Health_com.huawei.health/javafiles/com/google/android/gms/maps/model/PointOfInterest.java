// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzj, LatLng

public final class PointOfInterest extends zza
{

	public PointOfInterest(LatLng latlng, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		latLng = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field LatLng latLng>
		placeId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String placeId>
		name = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field String name>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzj.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #36  <Method void com.google.android.gms.maps.model.zzj.zza(PointOfInterest, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzj();
	public final LatLng latLng;
	public final String name;
	public final String placeId;

	static 
	{
	//    0    0:new             #16  <Class zzj>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzj()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
