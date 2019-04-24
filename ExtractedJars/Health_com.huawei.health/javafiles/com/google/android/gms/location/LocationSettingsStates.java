// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;

// Referenced classes of package com.google.android.gms.location:
//			zzs

public final class LocationSettingsStates extends zza
{

	public LocationSettingsStates(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		zzbkj = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field boolean zzbkj>
		zzbkk = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field boolean zzbkk>
		zzbkl = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field boolean zzbkl>
		zzbkm = flag3;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field boolean zzbkm>
		zzbkn = flag4;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field boolean zzbkn>
		zzbko = flag5;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #38  <Field boolean zzbko>
	//   20   37:return          
	}

	public static LocationSettingsStates fromIntent(Intent intent)
	{
		return (LocationSettingsStates)zzd.zza(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "com.google.android.gms.location.LOCATION_SETTINGS_STATES">
	//    2    3:getstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//    3    6:invokestatic    #48  <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(Intent, String, android.os.Parcelable$Creator)>
	//    4    9:checkcast       #2   <Class LocationSettingsStates>
	//    5   12:areturn         
	}

	public boolean isBlePresent()
	{
		return zzbko;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean zzbko>
	//    2    4:ireturn         
	}

	public boolean isBleUsable()
	{
		return zzbkl;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean zzbkl>
	//    2    4:ireturn         
	}

	public boolean isGpsPresent()
	{
		return zzbkm;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzbkm>
	//    2    4:ireturn         
	}

	public boolean isGpsUsable()
	{
		return zzbkj;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean zzbkj>
	//    2    4:ireturn         
	}

	public boolean isLocationPresent()
	{
		return zzbkm || zzbkn;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzbkm>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field boolean zzbkn>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isLocationUsable()
	{
		return zzbkj || zzbkk;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean zzbkj>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field boolean zzbkk>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isNetworkLocationPresent()
	{
		return zzbkn;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzbkn>
	//    2    4:ireturn         
	}

	public boolean isNetworkLocationUsable()
	{
		return zzbkk;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean zzbkk>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzs.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #62  <Method void com.google.android.gms.location.zzs.zza(LocationSettingsStates, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzs();
	private final boolean zzbkj;
	private final boolean zzbkk;
	private final boolean zzbkl;
	private final boolean zzbkm;
	private final boolean zzbkn;
	private final boolean zzbko;

	static 
	{
	//    0    0:new             #18  <Class zzs>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzs()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
