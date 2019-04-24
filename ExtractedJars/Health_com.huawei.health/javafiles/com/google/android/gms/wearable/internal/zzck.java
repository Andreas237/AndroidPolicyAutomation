// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcl, zzbv

public class zzck extends zza
{

	zzck(int i, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int zzaiI>
		if(ibinder != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
		{
			zzbTx = zzbv.zza.zzfC(ibinder);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokestatic    #31  <Method zzbv zzbv$zza.zzfC(IBinder)>
	//   10   18:putfield        #33  <Field zzbv zzbTx>
			return;
	//   11   21:return          
		} else
		{
			zzbTx = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #33  <Field zzbv zzbTx>
			return;
	//   15   27:return          
		}
	}

	public zzck(zzbv zzbv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field int zzaiI>
		zzbTx = zzbv1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field zzbv zzbTx>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzcl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #40  <Method void com.google.android.gms.wearable.internal.zzcl.zza(zzck, Parcel, int)>
	//    4    6:return          
	}

	IBinder zzAh()
	{
		if(zzbTx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field zzbv zzbTx>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzbTx.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field zzbv zzbTx>
	//    7   13:invokeinterface #47  <Method IBinder zzbv.asBinder()>
	//    8   18:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzcl();
	final int zzaiI;
	public final zzbv zzbTx;

	static 
	{
	//    0    0:new             #15  <Class zzcl>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzcl()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
