// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.server:
//			zza

public class FavaDiagnosticsEntity extends zza
	implements ReflectedParcelable
{

	public FavaDiagnosticsEntity(int i, String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int mVersionCode>
		zzaFs = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field String zzaFs>
		zzaFt = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int zzaFt>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.server.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #38  <Method void com.google.android.gms.common.server.zza.zza(FavaDiagnosticsEntity, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.server.zza();
	final int mVersionCode;
	public final String zzaFs;
	public final int zzaFt;

	static 
	{
	//    0    0:new             #18  <Class com.google.android.gms.common.server.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void com.google.android.gms.common.server.zza()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
