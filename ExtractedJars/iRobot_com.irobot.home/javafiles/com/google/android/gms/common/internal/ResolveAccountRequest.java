// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			zam

public class ResolveAccountRequest extends AbstractSafeParcelable
{

	ResolveAccountRequest(int i, Account account, int j, GoogleSignInAccount googlesigninaccount)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int zale>
		zax = account;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field Account zax>
		zaoz = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #48  <Field int zaoz>
		zapa = googlesigninaccount;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field GoogleSignInAccount zapa>
	//   14   25:return          
	}

	public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googlesigninaccount)
	{
		this(2, account, i, googlesigninaccount);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #55  <Method void ResolveAccountRequest(int, Account, int, GoogleSignInAccount)>
	//    6    8:return          
	}

	public Account getAccount()
	{
		return zax;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Account zax>
	//    2    4:areturn         
	}

	public int getSessionId()
	{
		return zaoz;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zaoz>
	//    2    4:ireturn         
	}

	public GoogleSignInAccount getSignInAccountHint()
	{
		return zapa;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleSignInAccount zapa>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field int zale>
	//    7   11:invokestatic    #70  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getAccount())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #72  <Method Account getAccount()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #76  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getSessionId());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #78  <Method int getSessionId()>
	//   19   31:invokestatic    #70  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (getSignInAccountHint())), i, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #80  <Method GoogleSignInAccount getSignInAccountHint()>
	//   24   40:iload_2         
	//   25   41:iconst_0        
	//   26   42:invokestatic    #76  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   27   45:aload_1         
	//   28   46:iload_3         
	//   29   47:invokestatic    #83  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   30   50:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zam();
	private final int zale;
	private final int zaoz;
	private final GoogleSignInAccount zapa;
	private final Account zax;

	static 
	{
	//    0    0:new             #32  <Class zam>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zam()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
