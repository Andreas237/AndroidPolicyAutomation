// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			zan, IAccountAccessor

public class ResolveAccountResponse extends AbstractSafeParcelable
{

	public ResolveAccountResponse(int i)
	{
		this(new ConnectionResult(i, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #44  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #47  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   10:invokespecial   #50  <Method void ResolveAccountResponse(ConnectionResult)>
	//    7   13:return          
	}

	ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #56  <Field int zale>
		zanw = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #58  <Field IBinder zanw>
		zadh = connectionresult;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #60  <Field ConnectionResult zadh>
		zagf = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #62  <Field boolean zagf>
		zapb = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #64  <Field boolean zapb>
	//   17   31:return          
	}

	public ResolveAccountResponse(ConnectionResult connectionresult)
	{
		this(1, ((IBinder) (null)), connectionresult, false, false);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:invokespecial   #68  <Method void ResolveAccountResponse(int, IBinder, ConnectionResult, boolean, boolean)>
	//    7    9:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ResolveAccountResponse))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ResolveAccountResponse>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ResolveAccountResponse)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ResolveAccountResponse>
	//   12   20:astore_1        
		return zadh.equals(((Object) (((ResolveAccountResponse) (obj)).zadh))) && ((Object) (getAccountAccessor())).equals(((Object) (((ResolveAccountResponse) (obj)).getAccountAccessor())));
	//   13   21:aload_0         
	//   14   22:getfield        #60  <Field ConnectionResult zadh>
	//   15   25:aload_1         
	//   16   26:getfield        #60  <Field ConnectionResult zadh>
	//   17   29:invokevirtual   #72  <Method boolean ConnectionResult.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:invokevirtual   #76  <Method IAccountAccessor getAccountAccessor()>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #76  <Method IAccountAccessor getAccountAccessor()>
	//   23   43:invokevirtual   #79  <Method boolean Object.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public IAccountAccessor getAccountAccessor()
	{
		return IAccountAccessor.Stub.asInterface(zanw);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field IBinder zanw>
	//    2    4:invokestatic    #85  <Method IAccountAccessor IAccountAccessor$Stub.asInterface(IBinder)>
	//    3    7:areturn         
	}

	public ConnectionResult getConnectionResult()
	{
		return zadh;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ConnectionResult zadh>
	//    2    4:areturn         
	}

	public boolean getSaveDefaultAccount()
	{
		return zagf;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean zagf>
	//    2    4:ireturn         
	}

	public boolean isFromCrossClientAuth()
	{
		return zapb;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean zapb>
	//    2    4:ireturn         
	}

	public ResolveAccountResponse setAccountAccessor(IAccountAccessor iaccountaccessor)
	{
		if(iaccountaccessor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			iaccountaccessor = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            16
			iaccountaccessor = ((IAccountAccessor) (iaccountaccessor.asBinder()));
	//    5    9:aload_1         
	//    6   10:invokeinterface #95  <Method IBinder IAccountAccessor.asBinder()>
	//    7   15:astore_1        
		zanw = ((IBinder) (iaccountaccessor));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #58  <Field IBinder zanw>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public ResolveAccountResponse setIsFromCrossClientAuth(boolean flag)
	{
		zapb = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean zapb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ResolveAccountResponse setSaveDefaultAccount(boolean flag)
	{
		zagf = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean zagf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #56  <Field int zale>
	//    7   11:invokestatic    #110 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeIBinder(parcel, 2, zanw, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field IBinder zanw>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #114 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getConnectionResult())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #116 <Method ConnectionResult getConnectionResult()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #120 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, getSaveDefaultAccount());
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #122 <Method boolean getSaveDefaultAccount()>
	//   25   41:invokestatic    #126 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, isFromCrossClientAuth());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #128 <Method boolean isFromCrossClientAuth()>
	//   30   50:invokestatic    #126 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   31   53:aload_1         
	//   32   54:iload_3         
	//   33   55:invokestatic    #131 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   34   58:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zan();
	private ConnectionResult zadh;
	private boolean zagf;
	private final int zale;
	private IBinder zanw;
	private boolean zapb;

	static 
	{
	//    0    0:new             #35  <Class zan>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void zan()>
	//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
