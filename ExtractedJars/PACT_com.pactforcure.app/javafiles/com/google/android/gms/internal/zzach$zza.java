// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzach, zzacj

public static final class zzach$zza extends zza
{

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacj.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #39  <Method void com.google.android.gms.internal.zzacj.zza(zzach$zza, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os..Creator CREATOR = new zzacj();
	final int versionCode;
	final String zzaFy;
	final int zzaFz;

	static 
	{
	//    0    0:new             #19  <Class zzacj>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzacj()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	zzach$zza(int i, String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int versionCode>
		zzaFy = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String zzaFy>
		zzaFz = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int zzaFz>
	//   11   19:return          
	}

	zzach$zza(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		versionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #29  <Field int versionCode>
		zzaFy = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field String zzaFy>
		zzaFz = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #33  <Field int zzaFz>
	//   11   19:return          
	}
}
