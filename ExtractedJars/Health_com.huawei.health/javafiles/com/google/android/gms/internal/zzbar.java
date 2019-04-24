// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzbas

public class zzbar extends zza
{

	zzbar(int i, Account account, Scope ascope[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int zzaiI>
		zzahh = account;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Account zzahh>
		zzbEr = ascope;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Scope[] zzbEr>
		zzajw = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String zzajw>
	//   14   25:return          
	}

	public Account getAccount()
	{
		return zzahh;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Account zzahh>
	//    2    4:areturn         
	}

	public String getServerClientId()
	{
		return zzajw;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzajw>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzbas.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #45  <Method void com.google.android.gms.internal.zzbas.zza(zzbar, Parcel, int)>
	//    4    6:return          
	}

	public Scope[] zzPR()
	{
		return zzbEr;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Scope[] zzbEr>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbas();
	private final Account zzahh;
	final int zzaiI;
	private final String zzajw;
	private final Scope zzbEr[];

	static 
	{
	//    0    0:new             #19  <Class zzbas>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzbas()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
