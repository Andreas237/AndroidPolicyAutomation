// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbi

public class zzbh extends zza
{

	public zzbh(int i, ConnectionConfiguration connectionconfiguration)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int statusCode>
		zzbUz = connectionconfiguration;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field ConnectionConfiguration zzbUz>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzbi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #34  <Method void com.google.android.gms.wearable.internal.zzbi.zza(zzbh, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbi();
	public final int statusCode;
	public final ConnectionConfiguration zzbUz;

	static 
	{
	//    0    0:new             #16  <Class zzbi>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzbi()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
