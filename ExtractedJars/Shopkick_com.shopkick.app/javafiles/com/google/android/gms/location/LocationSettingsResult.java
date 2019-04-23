// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//			zzah, LocationSettingsStates

public final class LocationSettingsResult extends AbstractSafeParcelable
	implements Result
{

	public LocationSettingsResult(Status status)
	{
		this(status, ((LocationSettingsStates) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #40  <Method void LocationSettingsResult(Status, LocationSettingsStates)>
	//    4    6:return          
	}

	public LocationSettingsResult(Status status, LocationSettingsStates locationsettingsstates)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		zzbl = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field Status zzbl>
		zzbm = locationsettingsstates;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field LocationSettingsStates zzbm>
	//    8   14:return          
	}

	public final LocationSettingsStates getLocationSettingsStates()
	{
		return zzbm;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field LocationSettingsStates zzbm>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzbl;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Status zzbl>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 1, ((android.os.Parcelable) (getStatus())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #61  <Method Status getStatus()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #65  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getLocationSettingsStates())), i, false);
	//   10   16:aload_1         
	//   11   17:iconst_2        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #67  <Method LocationSettingsStates getLocationSettingsStates()>
	//   14   22:iload_2         
	//   15   23:iconst_0        
	//   16   24:invokestatic    #65  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   17   27:aload_1         
	//   18   28:iload_3         
	//   19   29:invokestatic    #70  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   20   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzah();
	private final Status zzbl;
	private final LocationSettingsStates zzbm;

	static 
	{
	//    0    0:new             #30  <Class zzah>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzah()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
