// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.internal.base.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			ResolveAccountResponse

public interface IResolveAccountCallbacks
	extends IInterface
{
	public static abstract class Stub extends zab
		implements IResolveAccountCallbacks
	{

		public static IResolveAccountCallbacks asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IResolveAccountCallbacks)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IResolveAccountCallbacks>
		//*  10   19:ifeq            27
				return (IResolveAccountCallbacks)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IResolveAccountCallbacks>
		//   13   26:areturn         
			else
				return ((IResolveAccountCallbacks) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IResolveAccountCallbacks$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IResolveAccountCallbacks$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		{
			if(i == 2)
		//*   0    0:iload_1         
		//*   1    1:iconst_2        
		//*   2    2:icmpne          25
			{
				onAccountResolutionComplete((ResolveAccountResponse)zac.zaa(parcel, ResolveAccountResponse.CREATOR));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:getstatic       #37  <Field android.os.Parcelable$Creator ResolveAccountResponse.CREATOR>
		//    6   10:invokestatic    #43  <Method android.os.Parcelable zac.zaa(Parcel, android.os.Parcelable$Creator)>
		//    7   13:checkcast       #33  <Class ResolveAccountResponse>
		//    8   16:invokevirtual   #47  <Method void onAccountResolutionComplete(ResolveAccountResponse)>
				parcel1.writeNoException();
		//    9   19:aload_3         
		//   10   20:invokevirtual   #52  <Method void Parcel.writeNoException()>
				return true;
		//   11   23:iconst_1        
		//   12   24:ireturn         
			} else
			{
				return false;
		//   13   25:iconst_0        
		//   14   26:ireturn         
			}
		}

		public Stub()
		{
			super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
		//    2    3:invokespecial   #17  <Method void zab(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zaa
		implements IResolveAccountCallbacks
	{

		public void onAccountResolutionComplete(ResolveAccountResponse resolveaccountresponse)
		{
			Parcel parcel = ((zaa)this).zaa();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #24  <Method Parcel zaa.zaa()>
		//    2    4:astore_2        
			zac.zaa(parcel, ((android.os.Parcelable) (resolveaccountresponse)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #29  <Method void zac.zaa(Parcel, android.os.Parcelable)>
			((zaa)this).zab(2, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_2        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #33  <Method void zaa.zab(int, Parcel)>
		//   10   16:return          
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
		//    3    4:invokespecial   #17  <Method void zaa(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract void onAccountResolutionComplete(ResolveAccountResponse resolveaccountresponse);
}
