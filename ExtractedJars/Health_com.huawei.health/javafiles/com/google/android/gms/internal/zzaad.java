// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaf

public class zzaad
{
	public static abstract class zza extends zzaaf
		implements zzb
	{

		private void zzc(RemoteException remoteexception)
		{
			zzB(new Status(8, remoteexception.getLocalizedMessage(), ((android.app.PendingIntent) (null))));
		//    0    0:aload_0         
		//    1    1:new             #58  <Class Status>
		//    2    4:dup             
		//    3    5:bipush          8
		//    4    7:aload_1         
		//    5    8:invokevirtual   #64  <Method String RemoteException.getLocalizedMessage()>
		//    6   11:aconst_null     
		//    7   12:invokespecial   #67  <Method void Status(int, String, android.app.PendingIntent)>
		//    8   15:invokevirtual   #71  <Method void zzB(Status)>
		//    9   18:return          
		}

		public final Api getApi()
		{
			return zzaxf;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Api zzaxf>
		//    2    4:areturn         
		}

		public void setResult(Object obj)
		{
			super.zzb((Result)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #78  <Class Result>
		//    3    5:invokespecial   #81  <Method void zzaaf.zzb(Result)>
		//    4    8:return          
		}

		public final void zzB(Status status)
		{
			boolean flag;
			if(!status.isSuccess())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #85  <Method boolean Status.isSuccess()>
		//*   2    4:ifne            12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_2        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_2        
			zzac.zzb(flag, "Failed result must not be success");
		//    8   14:iload_2         
		//    9   15:ldc1            #87  <String "Failed result must not be success">
		//   10   17:invokestatic    #90  <Method void zzac.zzb(boolean, Object)>
			zzb(zzc(status));
		//   11   20:aload_0         
		//   12   21:aload_0         
		//   13   22:aload_1         
		//   14   23:invokevirtual   #93  <Method Result zzc(Status)>
		//   15   26:invokevirtual   #94  <Method void zzb(Result)>
		//   16   29:return          
		}

		protected abstract void zza(com.google.android.gms.common.api.Api.zzb zzb1)
			throws RemoteException;

		public final void zzb(com.google.android.gms.common.api.Api.zzb zzb1)
			throws DeadObjectException
		{
			try
			{
				zza(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #99  <Method void zza(com.google.android.gms.common.api.Api$zzb)>
				return;
		//    3    5:return          
			}
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.common.api.Api.zzb zzb1)
		//*   4    6:astore_1        
			{
				zzc(((RemoteException) (zzb1)));
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:invokespecial   #101 <Method void zzc(RemoteException)>
				throw zzb1;
		//    8   12:aload_1         
		//    9   13:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.common.api.Api.zzb zzb1)
		//*  10   14:astore_1        
			{
				zzc(((RemoteException) (zzb1)));
		//   11   15:aload_0         
		//   12   16:aload_1         
		//   13   17:invokespecial   #101 <Method void zzc(RemoteException)>
			}
		//   14   20:return          
		}

		public final com.google.android.gms.common.api.Api.zzc zzvg()
		{
			return zzazY;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzazY>
		//    2    4:areturn         
		}

		private final Api zzaxf;
		private final com.google.android.gms.common.api.Api.zzc zzazY;

		protected zza(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
		{
			super((GoogleApiClient)zzac.zzb(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:ldc1            #21  <String "GoogleApiClient must not be null">
		//    3    4:invokestatic    #27  <Method Object zzac.zzb(Object, Object)>
		//    4    7:checkcast       #29  <Class GoogleApiClient>
		//    5   10:invokespecial   #32  <Method void zzaaf(GoogleApiClient)>
			zzazY = (com.google.android.gms.common.api.Api.zzc)zzac.zzw(((Object) (zzc1)));
		//    6   13:aload_0         
		//    7   14:aload_1         
		//    8   15:invokestatic    #36  <Method Object zzac.zzw(Object)>
		//    9   18:checkcast       #38  <Class com.google.android.gms.common.api.Api$zzc>
		//   10   21:putfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzazY>
			zzaxf = null;
		//   11   24:aload_0         
		//   12   25:aconst_null     
		//   13   26:putfield        #42  <Field Api zzaxf>
		//   14   29:return          
		}

		protected zza(Api api, GoogleApiClient googleapiclient)
		{
			super((GoogleApiClient)zzac.zzb(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:ldc1            #21  <String "GoogleApiClient must not be null">
		//    3    4:invokestatic    #27  <Method Object zzac.zzb(Object, Object)>
		//    4    7:checkcast       #29  <Class GoogleApiClient>
		//    5   10:invokespecial   #32  <Method void zzaaf(GoogleApiClient)>
			zzazY = api.zzvg();
		//    6   13:aload_0         
		//    7   14:aload_1         
		//    8   15:invokevirtual   #53  <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
		//    9   18:putfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzazY>
			zzaxf = api;
		//   10   21:aload_0         
		//   11   22:aload_1         
		//   12   23:putfield        #42  <Field Api zzaxf>
		//   13   26:return          
		}
	}

	public static interface zzb
	{

		public abstract void setResult(Object obj);

		public abstract void zzB(Status status);
	}

}
