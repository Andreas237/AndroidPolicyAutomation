// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			aw

public class ResolveAccountRequest extends AbstractSafeParcelable
{

	ResolveAccountRequest(int i, Account account, int j, GoogleSignInAccount googlesigninaccount)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int a>
		b = account;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Account b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int c>
		d = googlesigninaccount;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field GoogleSignInAccount d>
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
	//    5    5:invokespecial   #36  <Method void ResolveAccountRequest(int, Account, int, GoogleSignInAccount)>
	//    6    8:return          
	}

	public Account a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Account b>
	//    2    4:areturn         
	}

	public int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int c>
	//    2    4:ireturn         
	}

	public GoogleSignInAccount c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GoogleSignInAccount d>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokestatic    #49  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (a())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #51  <Method Account a()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #54  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #56  <Method int b()>
	//   19   31:invokestatic    #49  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable) (c())), i, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #58  <Method GoogleSignInAccount c()>
	//   24   40:iload_2         
	//   25   41:iconst_0        
	//   26   42:invokestatic    #54  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   27   45:aload_1         
	//   28   46:iload_3         
	//   29   47:invokestatic    #60  <Method void c.a(Parcel, int)>
	//   30   50:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aw();
	private final int a;
	private final Account b;
	private final int c;
	private final GoogleSignInAccount d;

	static 
	{
	//    0    0:new             #17  <Class aw>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void aw()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
