// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.signin.internal:
//			zak

public final class zaj extends AbstractSafeParcelable
{

	public zaj(int i)
	{
		this(new ConnectionResult(8, ((android.app.PendingIntent) (null))), ((ResolveAccountResponse) (null)));
	//    0    0:aload_0         
	//    1    1:new             #38  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aconst_null     
	//    5    8:invokespecial   #41  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #44  <Method void zaj(ConnectionResult, ResolveAccountResponse)>
	//    8   15:return          
	}

	zaj(int i, ConnectionResult connectionresult, ResolveAccountResponse resolveaccountresponse)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #50  <Field int zale>
		zadh = connectionresult;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field ConnectionResult zadh>
		zasb = resolveaccountresponse;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field ResolveAccountResponse zasb>
	//   11   19:return          
	}

	private zaj(ConnectionResult connectionresult, ResolveAccountResponse resolveaccountresponse)
	{
		this(1, connectionresult, ((ResolveAccountResponse) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #58  <Method void zaj(int, ConnectionResult, ResolveAccountResponse)>
	//    5    7:return          
	}

	public final ConnectionResult getConnectionResult()
	{
		return zadh;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ConnectionResult zadh>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #67  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field int zale>
	//    7   11:invokestatic    #71  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zadh)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #52  <Field ConnectionResult zadh>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #75  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zasb)), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #54  <Field ResolveAccountResponse zasb>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #75  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #78  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   25   41:return          
	}

	public final ResolveAccountResponse zacw()
	{
		return zasb;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ResolveAccountResponse zasb>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zak();
	private final ConnectionResult zadh;
	private final int zale;
	private final ResolveAccountResponse zasb;

	static 
	{
	//    0    0:new             #29  <Class zak>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zak()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
