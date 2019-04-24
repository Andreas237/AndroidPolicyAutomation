// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxq

public class zzaxp extends zza
	implements Result
{

	public zzaxp()
	{
		this(0, ((Intent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:invokespecial   #27  <Method void zzaxp(int, Intent)>
	//    4    6:return          
	}

	zzaxp(int i, int j, Intent intent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int mVersionCode>
		zzbCl = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #33  <Field int zzbCl>
		zzbCm = intent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field Intent zzbCm>
	//   11   19:return          
	}

	public zzaxp(int i, Intent intent)
	{
		this(2, i, intent);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #37  <Method void zzaxp(int, int, Intent)>
	//    5    7:return          
	}

	public Status getStatus()
	{
		if(zzbCl == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int zzbCl>
	//*   2    4:ifne            11
			return Status.zzayh;
	//    3    7:getstatic       #45  <Field Status Status.zzayh>
	//    4   10:areturn         
		else
			return Status.zzayl;
	//    5   11:getstatic       #48  <Field Status Status.zzayl>
	//    6   14:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaxq.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #54  <Method void com.google.android.gms.internal.zzaxq.zza(zzaxp, Parcel, int)>
	//    4    6:return          
	}

	public int zzOk()
	{
		return zzbCl;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzbCl>
	//    2    4:ireturn         
	}

	public Intent zzOl()
	{
		return zzbCm;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent zzbCm>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaxq();
	final int mVersionCode;
	private int zzbCl;
	private Intent zzbCm;

	static 
	{
	//    0    0:new             #18  <Class zzaxq>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzaxq()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
