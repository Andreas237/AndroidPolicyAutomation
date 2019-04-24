// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbo, zzao

public class zzbn extends zza
{

	public zzbn(int i, zzao zzao)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int statusCode>
		zzbUC = zzao;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field zzao zzbUC>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzbo.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #33  <Method void com.google.android.gms.wearable.internal.zzbo.zza(zzbn, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbo();
	public final int statusCode;
	public final zzao zzbUC;

	static 
	{
	//    0    0:new             #15  <Class zzbo>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzbo()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
