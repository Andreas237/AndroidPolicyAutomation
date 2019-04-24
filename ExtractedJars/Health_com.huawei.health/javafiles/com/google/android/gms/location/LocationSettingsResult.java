// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//			zzr, LocationSettingsStates

public final class LocationSettingsResult extends zza
	implements Result
{

	public LocationSettingsResult(Status status)
	{
		this(status, ((LocationSettingsStates) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #27  <Method void LocationSettingsResult(Status, LocationSettingsStates)>
	//    4    6:return          
	}

	public LocationSettingsResult(Status status, LocationSettingsStates locationsettingsstates)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzair = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Status zzair>
		zzbki = locationsettingsstates;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field LocationSettingsStates zzbki>
	//    8   14:return          
	}

	public LocationSettingsStates getLocationSettingsStates()
	{
		return zzbki;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LocationSettingsStates zzbki>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Status zzair>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzr.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #42  <Method void com.google.android.gms.location.zzr.zza(LocationSettingsResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzr();
	private final Status zzair;
	private final LocationSettingsStates zzbki;

	static 
	{
	//    0    0:new             #17  <Class zzr>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzr()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
