// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzj, LatLng

public final class PointOfInterest extends AbstractSafeParcelable
{

	public PointOfInterest(LatLng latlng, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		latLng = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field LatLng latLng>
		placeId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field String placeId>
		name = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field String name>
	//   11   19:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (latLng)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field LatLng latLng>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #57  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 3, placeId, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #41  <Field String placeId>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #61  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, name, false);
	//   16   26:aload_1         
	//   17   27:iconst_4        
	//   18   28:aload_0         
	//   19   29:getfield        #43  <Field String name>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #61  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #64  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   25   41:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzj();
	public final LatLng latLng;
	public final String name;
	public final String placeId;

	static 
	{
	//    0    0:new             #27  <Class zzj>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzj()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
