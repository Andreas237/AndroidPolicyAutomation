// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzacw, zzacv

public static class zzacw$zzb extends zza
{

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacv.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #45  <Method void com.google.android.gms.internal.zzacv.zza(zzacw$zzb, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os..Creator CREATOR = new zzacv();
	final int versionCode;
	final String zzaB;
	final zzacs$zza zzaHl;

	static 
	{
	//    0    0:new             #21  <Class zzacv>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzacv()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	zzacw$zzb(int i, String s, zzacs$zza zzacs$zza)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int versionCode>
		zzaB = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field String zzaB>
		zzaHl = zzacs$zza;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field zzacs$zza zzaHl>
	//   11   19:return          
	}

	zzacw$zzb(String s, zzacs$zza zzacs$zza)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		versionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field int versionCode>
		zzaB = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field String zzaB>
		zzaHl = zzacs$zza;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #35  <Field zzacs$zza zzaHl>
	//   11   19:return          
	}
}
