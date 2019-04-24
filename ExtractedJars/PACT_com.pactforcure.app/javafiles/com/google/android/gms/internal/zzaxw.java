// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxx

public class zzaxw extends zza
{

	zzaxw(int i, Account account, Scope ascope[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int mVersionCode>
		zzagg = account;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Account zzagg>
		zzbCp = ascope;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Scope[] zzbCp>
		zzajk = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String zzajk>
	//   14   25:return          
	}

	public Account getAccount()
	{
		return zzagg;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Account zzagg>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaxx.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #43  <Method void com.google.android.gms.internal.zzaxx.zza(zzaxw, Parcel, int)>
	//    4    6:return          
	}

	public Scope[] zzOm()
	{
		return zzbCp;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Scope[] zzbCp>
	//    2    4:areturn         
	}

	public String zzqN()
	{
		return zzajk;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzajk>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaxx();
	final int mVersionCode;
	private final Account zzagg;
	private final String zzajk;
	private final Scope zzbCp[];

	static 
	{
	//    0    0:new             #19  <Class zzaxx>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzaxx()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
