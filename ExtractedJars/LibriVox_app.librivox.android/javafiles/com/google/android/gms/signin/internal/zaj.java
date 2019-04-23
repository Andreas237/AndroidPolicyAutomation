// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.signin.internal:
//			i

public final class zaj extends AbstractSafeParcelable
{

	public zaj(int j)
	{
		this(new ConnectionResult(8, ((android.app.PendingIntent) (null))), ((ResolveAccountResponse) (null)));
	//    0    0:aload_0         
	//    1    1:new             #25  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aconst_null     
	//    5    8:invokespecial   #28  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #31  <Method void zaj(ConnectionResult, ResolveAccountResponse)>
	//    8   15:return          
	}

	zaj(int j, ConnectionResult connectionresult, ResolveAccountResponse resolveaccountresponse)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		a = j;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int a>
		b = connectionresult;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field ConnectionResult b>
		c = resolveaccountresponse;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field ResolveAccountResponse c>
	//   11   19:return          
	}

	private zaj(ConnectionResult connectionresult, ResolveAccountResponse resolveaccountresponse)
	{
		this(1, connectionresult, ((ResolveAccountResponse) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #41  <Method void zaj(int, ConnectionResult, ResolveAccountResponse)>
	//    5    7:return          
	}

	public final ConnectionResult a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ConnectionResult b>
	//    2    4:areturn         
	}

	public final ResolveAccountResponse b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ResolveAccountResponse c>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field int a>
	//    7   11:invokestatic    #53  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (b)), j, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field ConnectionResult b>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #56  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c)), j, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #39  <Field ResolveAccountResponse c>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #56  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #58  <Method void c.a(Parcel, int)>
	//   25   41:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new i();
	private final int a;
	private final ConnectionResult b;
	private final ResolveAccountResponse c;

	static 
	{
	//    0    0:new             #16  <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void i()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
