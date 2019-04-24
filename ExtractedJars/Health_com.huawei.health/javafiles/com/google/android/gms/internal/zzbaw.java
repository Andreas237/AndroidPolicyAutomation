// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaf;

// Referenced classes of package com.google.android.gms.internal:
//			zzbax

public class zzbaw extends zza
{

	public zzbaw(int i)
	{
		this(new ConnectionResult(i, ((android.app.PendingIntent) (null))), ((zzaf) (null)));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #29  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #32  <Method void zzbaw(ConnectionResult, zzaf)>
	//    8   14:return          
	}

	zzbaw(int i, ConnectionResult connectionresult, zzaf zzaf)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int zzaiI>
		zzaGE = connectionresult;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field ConnectionResult zzaGE>
		zzbEu = zzaf;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field zzaf zzbEu>
	//   11   19:return          
	}

	public zzbaw(ConnectionResult connectionresult, zzaf zzaf)
	{
		this(1, connectionresult, zzaf);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #42  <Method void zzbaw(int, ConnectionResult, zzaf)>
	//    5    7:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzbax.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #48  <Method void com.google.android.gms.internal.zzbax.zza(zzbaw, Parcel, int)>
	//    4    6:return          
	}

	public zzaf zzPU()
	{
		return zzbEu;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzaf zzbEu>
	//    2    4:areturn         
	}

	public ConnectionResult zzyh()
	{
		return zzaGE;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ConnectionResult zzaGE>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbax();
	private final ConnectionResult zzaGE;
	final int zzaiI;
	private final zzaf zzbEu;

	static 
	{
	//    0    0:new             #17  <Class zzbax>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzbax()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
