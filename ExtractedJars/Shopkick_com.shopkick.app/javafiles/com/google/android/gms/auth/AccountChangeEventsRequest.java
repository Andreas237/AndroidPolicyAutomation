// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//			zzb

public class AccountChangeEventsRequest extends AbstractSafeParcelable
{

	public AccountChangeEventsRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractSafeParcelable()>
		zze = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #38  <Field int zze>
	//    5    9:return          
	}

	AccountChangeEventsRequest(int i, int j, String s, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractSafeParcelable()>
		zze = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field int zze>
		zzi = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #43  <Field int zzi>
		zzg = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field String zzg>
		if(account == null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   19:aload           4
	//*  12   21:ifnonnull       46
	//*  13   24:aload_3         
	//*  14   25:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   28:ifne            46
		{
			zzk = new Account(s, "com.google");
	//   16   31:aload_0         
	//   17   32:new             #53  <Class Account>
	//   18   35:dup             
	//   19   36:aload_3         
	//   20   37:ldc1            #55  <String "com.google">
	//   21   39:invokespecial   #58  <Method void Account(String, String)>
	//   22   42:putfield        #60  <Field Account zzk>
			return;
	//   23   45:return          
		} else
		{
			zzk = account;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #60  <Field Account zzk>
			return;
	//   27   52:return          
		}
	}

	public Account getAccount()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Account zzk>
	//    2    4:areturn         
	}

	public String getAccountName()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String zzg>
	//    2    4:areturn         
	}

	public int getEventIndex()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzi>
	//    2    4:ireturn         
	}

	public AccountChangeEventsRequest setAccount(Account account)
	{
		zzk = account;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field Account zzk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AccountChangeEventsRequest setAccountName(String s)
	{
		zzg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String zzg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AccountChangeEventsRequest setEventIndex(int i)
	{
		zzi = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int zzi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zze);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field int zze>
	//    7   11:invokestatic    #87  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zzi);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #43  <Field int zzi>
	//   12   20:invokestatic    #87  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 3, zzg, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #45  <Field String zzg>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #91  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (zzk)), i, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #60  <Field Account zzk>
	//   23   39:iload_2         
	//   24   40:iconst_0        
	//   25   41:invokestatic    #95  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   26   44:aload_1         
	//   27   45:iload_3         
	//   28   46:invokestatic    #98  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   29   49:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private final int zze;
	private String zzg;
	private int zzi;
	private Account zzk;

	static 
	{
	//    0    0:new             #29  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzb()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
