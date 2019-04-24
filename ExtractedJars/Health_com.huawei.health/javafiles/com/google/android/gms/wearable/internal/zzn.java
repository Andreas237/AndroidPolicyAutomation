// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzb, zzcv, zzn, zzm, 
//			zzcx

public class zzn
	implements CapabilityApi
{
	public static class zza extends Binder
		implements zzn
	{
		static class zza
			implements zzn
		{

			public IBinder asBinder()
			{
				return zzrk;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field IBinder zzrk>
			//    2    4:areturn         
			}

			public void zzg(com.google.android.gms.maps.model.internal.zzf zzf1)
				throws RemoteException
			{
				Parcel parcel;
				Parcel parcel1;
				parcel = Parcel.obtain();
			//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
			//    1    3:astore_2        
				parcel1 = Parcel.obtain();
			//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
			//    3    7:astore_3        
				parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
			//    4    8:aload_2         
			//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener">
			//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
				if(zzf1 == null) goto _L2; else goto _L1
			//    7   14:aload_1         
			//    8   15:ifnull          71
_L1:
				zzf1 = ((com.google.android.gms.maps.model.internal.zzf) (zzf1.asBinder()));
			//    9   18:aload_1         
			//   10   19:invokeinterface #41  <Method IBinder com.google.android.gms.maps.model.internal.zzf.asBinder()>
			//   11   24:astore_1        
			//*  12   25:goto            28
_L4:
				parcel.writeStrongBinder(((IBinder) (zzf1)));
			//   13   28:aload_2         
			//   14   29:aload_1         
			//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
				zzrk.transact(1, parcel, parcel1, 0);
			//   16   33:aload_0         
			//   17   34:getfield        #18  <Field IBinder zzrk>
			//   18   37:iconst_1        
			//   19   38:aload_2         
			//   20   39:aload_3         
			//   21   40:iconst_0        
			//   22   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
			//   23   46:pop             
				parcel1.readException();
			//   24   47:aload_3         
			//   25   48:invokevirtual   #53  <Method void Parcel.readException()>
				parcel1.recycle();
			//   26   51:aload_3         
			//   27   52:invokevirtual   #56  <Method void Parcel.recycle()>
				parcel.recycle();
			//   28   55:aload_2         
			//   29   56:invokevirtual   #56  <Method void Parcel.recycle()>
				return;
			//   30   59:return          
				zzf1;
			//   31   60:astore_1        
				parcel1.recycle();
			//   32   61:aload_3         
			//   33   62:invokevirtual   #56  <Method void Parcel.recycle()>
				parcel.recycle();
			//   34   65:aload_2         
			//   35   66:invokevirtual   #56  <Method void Parcel.recycle()>
				throw zzf1;
			//   36   69:aload_1         
			//   37   70:athrow          
_L2:
				zzf1 = null;
			//   38   71:aconst_null     
			//   39   72:astore_1        
				if(true) goto _L4; else goto _L3
			//   40   73:goto            28
_L3:
			}

			private IBinder zzrk;

			zza(IBinder ibinder)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #16  <Method void Object()>
				zzrk = ibinder;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #18  <Field IBinder zzrk>
			//    5    9:return          
			}
		}


		public static zzn zzdI(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener">
		//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzn))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzn>
		//*  12   23:ifeq            31
				return (zzn)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzn>
		//   15   30:areturn         
			else
				return ((zzn) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzn$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzn$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    2: default 28
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            62
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				zzg(com.google.android.gms.maps.model.internal.zzf.zza.zzen(parcel.readStrongBinder()));
		//   11   45:aload_0         
		//   12   46:aload_2         
		//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   14   50:invokestatic    #55  <Method com.google.android.gms.maps.model.internal.zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
		//   15   53:invokevirtual   #59  <Method void zzg(com.google.android.gms.maps.model.internal.zzf)>
				parcel1.writeNoException();
		//   16   56:aload_3         
		//   17   57:invokevirtual   #62  <Method void Parcel.writeNoException()>
				return true;
		//   18   60:iconst_1        
		//   19   61:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   20   62:aload_0         
		//   21   63:iload_1         
		//   22   64:aload_2         
		//   23   65:aload_3         
		//   24   66:iload           4
		//   25   68:invokespecial   #64  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   26   71:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener">
		//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
		//    6   11:return          
		}
	}

	static class zzb
		implements com.google.android.gms.wearable.CapabilityApi.CapabilityListener
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null || ((Object)this).getClass() != obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          22
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			obj = ((Object) ((zzb)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class zzn$zzb>
		//   16   28:astore_1        
			if(!((Object) (zzbTL)).equals(((Object) (((zzb) (obj)).zzbTL))))
		//*  17   29:aload_0         
		//*  18   30:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//*  19   33:aload_1         
		//*  20   34:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//*  21   37:invokevirtual   #31  <Method boolean Object.equals(Object)>
		//*  22   40:ifne            45
				return false;
		//   23   43:iconst_0        
		//   24   44:ireturn         
			else
				return zzbTM.equals(((Object) (((zzb) (obj)).zzbTM)));
		//   25   45:aload_0         
		//   26   46:getfield        #22  <Field String zzbTM>
		//   27   49:aload_1         
		//   28   50:getfield        #22  <Field String zzbTM>
		//   29   53:invokevirtual   #34  <Method boolean String.equals(Object)>
		//   30   56:ireturn         
		}

		public int hashCode()
		{
			return ((Object) (zzbTL)).hashCode() * 31 + zzbTM.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//    2    4:invokevirtual   #38  <Method int Object.hashCode()>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #22  <Field String zzbTM>
		//    7   14:invokevirtual   #39  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		public void onCapabilityChanged(CapabilityInfo capabilityinfo)
		{
			zzbTL.onCapabilityChanged(capabilityinfo);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//    2    4:aload_1         
		//    3    5:invokeinterface #43  <Method void com.google.android.gms.wearable.CapabilityApi$CapabilityListener.onCapabilityChanged(CapabilityInfo)>
		//    4   10:return          
		}

		final com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzbTL;
		final String zzbTM;

		zzb(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzbTL = capabilitylistener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
			zzbTM = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String zzbTM>
		//    8   14:return          
		}
	}

	public static class zzc
		implements CapabilityInfo
	{

		public String getName()
		{
			return mName;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field String mName>
		//    2    4:areturn         
		}

		public Set getNodes()
		{
			return zzbTN;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Set zzbTN>
		//    2    4:areturn         
		}

		private final String mName;
		private final Set zzbTN;

		public zzc(CapabilityInfo capabilityinfo)
		{
			this(capabilityinfo.getName(), capabilityinfo.getNodes());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #20  <Method String CapabilityInfo.getName()>
		//    3    7:aload_1         
		//    4    8:invokeinterface #24  <Method Set CapabilityInfo.getNodes()>
		//    5   13:invokespecial   #27  <Method void zzn$zzc(String, Set)>
		//    6   16:return          
		}

		public zzc(String s, Set set)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field String mName>
			zzbTN = set;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field Set zzbTN>
		//    8   14:return          
		}
	}

	public static class zzd
		implements com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
	{

		public Map getAllCapabilities()
		{
			return zzbTO;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Map zzbTO>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final Map zzbTO;

		public zzd(Status status, Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Status zzair>
			zzbTO = map;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Map zzbTO>
		//    8   14:return          
		}
	}

	public static class zze
		implements com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
	{

		public CapabilityInfo getCapability()
		{
			return zzbTP;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CapabilityInfo zzbTP>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final CapabilityInfo zzbTP;

		public zze(Status status, CapabilityInfo capabilityinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzair>
			zzbTP = capabilityinfo;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field CapabilityInfo zzbTP>
		//    8   14:return          
		}
	}

	static final class zzf extends zzm
	{

		public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
			throws RemoteException
		{
			zza((zzcx)zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class zzcx>
		//    3    5:invokevirtual   #30  <Method void zza(zzcx)>
		//    4    8:return          
		}

		protected void zza(zzcx zzcx1)
			throws RemoteException
		{
			zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTL);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_0         
		//    3    3:getfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//    4    6:invokevirtual   #34  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.CapabilityApi$CapabilityListener)>
			zzbTL = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//    8   14:return          
		}

		public Status zzb(Status status)
		{
			zzbTL = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
			return status;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		public Result zzc(Status status)
		{
			return ((Result) (zzb(status)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #40  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzbTL;

		private zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
			zzbTL = capabilitylistener;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		//    6   10:return          
		}

	}


	public zzn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, IntentFilter aintentfilter[])
	{
		return com.google.android.gms.wearable.internal.zzb.zza(googleapiclient, zza(aintentfilter), ((Object) (capabilitylistener)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokestatic    #43  <Method zzb$zza zza(IntentFilter[])>
	//    3    5:aload_2         
	//    4    6:invokestatic    #48  <Method PendingResult zzb.zza(GoogleApiClient, zzb$zza, Object)>
	//    5    9:areturn         
	}

	private static zzb.zza zza(IntentFilter aintentfilter[])
	{
		return new zzb.zza(aintentfilter) {

			public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, zzabh zzabh)
				throws RemoteException
			{
				zzcx1.zza(zzb1, capabilitylistener, zzabh, zzbTK);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:aload           4
			//    4    5:aload_0         
			//    5    6:getfield        #18  <Field IntentFilter[] zzbTK>
			//    6    9:invokevirtual   #30  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, zzabh, IntentFilter[])>
			//    7   12:return          
			}

			public volatile void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj, zzabh zzabh)
				throws RemoteException
			{
				zza(zzcx1, zzb1, (com.google.android.gms.wearable.CapabilityApi.CapabilityListener)obj, zzabh);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #36  <Class com.google.android.gms.wearable.CapabilityApi$CapabilityListener>
			//    5    7:aload           4
			//    6    9:invokevirtual   #38  <Method void zza(zzcx, com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, zzabh)>
			//    7   12:return          
			}

			final IntentFilter zzbTK[];

			
			{
				zzbTK = aintentfilter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field IntentFilter[] zzbTK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #16  <Class zzn$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void zzn$5(IntentFilter[])>
	//    4    8:areturn         
	}

	public PendingResult addCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
	{
		boolean flag;
		if(s != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		zzac.zzb(flag, "capability must not be null");
	//    7   13:iload           4
	//    8   15:ldc1            #58  <String "capability must not be null">
	//    9   17:invokestatic    #63  <Method void zzac.zzb(boolean, Object)>
		zzb zzb1 = new zzb(capabilitylistener, s);
	//   10   20:new             #21  <Class zzn$zzb>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokespecial   #66  <Method void zzn$zzb(com.google.android.gms.wearable.CapabilityApi$CapabilityListener, String)>
	//   15   29:astore          5
		IntentFilter intentfilter = zzcv.zzip("com.google.android.gms.wearable.CAPABILITY_CHANGED");
	//   16   31:ldc1            #68  <String "com.google.android.gms.wearable.CAPABILITY_CHANGED">
	//   17   33:invokestatic    #74  <Method IntentFilter zzcv.zzip(String)>
	//   18   36:astore          6
		capabilitylistener = ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) (s));
	//   19   38:aload_3         
	//   20   39:astore_2        
		if(!s.startsWith("/"))
	//*  21   40:aload_3         
	//*  22   41:ldc1            #76  <String "/">
	//*  23   43:invokevirtual   #82  <Method boolean String.startsWith(String)>
	//*  24   46:ifne            81
		{
			capabilitylistener = ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) (String.valueOf(((Object) (s)))));
	//   25   49:aload_3         
	//   26   50:invokestatic    #86  <Method String String.valueOf(Object)>
	//   27   53:astore_2        
			if(((String) (capabilitylistener)).length() != 0)
	//*  28   54:aload_2         
	//*  29   55:invokevirtual   #90  <Method int String.length()>
	//*  30   58:ifeq            71
				capabilitylistener = ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) ("/".concat(((String) (capabilitylistener)))));
	//   31   61:ldc1            #76  <String "/">
	//   32   63:aload_2         
	//   33   64:invokevirtual   #94  <Method String String.concat(String)>
	//   34   67:astore_2        
			else
	//*  35   68:goto            81
				capabilitylistener = ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) (new String("/")));
	//   36   71:new             #78  <Class String>
	//   37   74:dup             
	//   38   75:ldc1            #76  <String "/">
	//   39   77:invokespecial   #97  <Method void String(String)>
	//   40   80:astore_2        
		}
		intentfilter.addDataPath(((String) (capabilitylistener)), 0);
	//   41   81:aload           6
	//   42   83:aload_2         
	//   43   84:iconst_0        
	//   44   85:invokevirtual   #103 <Method void IntentFilter.addDataPath(String, int)>
		return zza(googleapiclient, ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) (zzb1)), new IntentFilter[] {
			intentfilter
		});
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:aload           5
	//   48   92:iconst_1        
	//   49   93:anewarray       IntentFilter[]
	//   50   96:dup             
	//   51   97:iconst_0        
	//   52   98:aload           6
	//   53  100:aastore         
	//   54  101:invokespecial   #105 <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, IntentFilter[])>
	//   55  104:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, Uri uri, int i)
	{
		boolean flag;
		if(uri != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
		zzac.zzb(flag, "uri must not be null");
	//    7   13:iload           5
	//    8   15:ldc1            #110 <String "uri must not be null">
	//    9   17:invokestatic    #63  <Method void zzac.zzb(boolean, Object)>
		if(i == 0 || i == 1)
	//*  10   20:iload           4
	//*  11   22:ifeq            31
	//*  12   25:iload           4
	//*  13   27:iconst_1        
	//*  14   28:icmpne          37
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore          5
		else
	//*  17   34:goto            40
			flag = false;
	//   18   37:iconst_0        
	//   19   38:istore          5
		zzac.zzb(flag, "invalid filter type");
	//   20   40:iload           5
	//   21   42:ldc1            #112 <String "invalid filter type">
	//   22   44:invokestatic    #63  <Method void zzac.zzb(boolean, Object)>
		return zza(googleapiclient, capabilitylistener, new IntentFilter[] {
			zzcv.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i)
		});
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:iconst_1        
	//   27   51:anewarray       IntentFilter[]
	//   28   54:dup             
	//   29   55:iconst_0        
	//   30   56:ldc1            #68  <String "com.google.android.gms.wearable.CAPABILITY_CHANGED">
	//   31   58:aload_3         
	//   32   59:iload           4
	//   33   61:invokestatic    #115 <Method IntentFilter zzcv.zza(String, Uri, int)>
	//   34   64:aastore         
	//   35   65:invokespecial   #105 <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, IntentFilter[])>
	//   36   68:areturn         
	}

	public PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, s) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzv(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTI);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field String zzbTI>
			//    4    6:invokevirtual   #34  <Method void zzcx.zzv(com.google.android.gms.internal.zzaad$zzb, String)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult zzbR(Status status)
			{
				return ((com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult) (new zza(status)));
			//    0    0:new             #38  <Class zzn$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #41  <Method void zzn$zza(Status)>
			//    4    8:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbR(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method com.google.android.gms.wearable.CapabilityApi$AddLocalCapabilityResult zzbR(Status)>
			//    3    5:areturn         
			}

			final String zzbTI;

			
			{
				zzbTI = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field String zzbTI>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzn$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #121 <Method void zzn$3(zzn, GoogleApiClient, String)>
	//    7   11:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i)
	{
		boolean flag;
		if(i == 0 || i == 1)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
	//*   2    4:iload_2         
	//*   3    5:iconst_1        
	//*   4    6:icmpne          14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		zzac.zzax(flag);
	//   10   16:iload_3         
	//   11   17:invokestatic    #133 <Method void zzac.zzax(boolean)>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, i) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzd(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTJ);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field int zzbTJ>
			//    4    6:invokevirtual   #34  <Method void zzcx.zzd(com.google.android.gms.internal.zzaad$zzb, int)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult zzbQ(Status status)
			{
				return ((com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult) (new zzd(status, ((Map) (null)))));
			//    0    0:new             #38  <Class zzn$zzd>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #41  <Method void zzn$zzd(Status, Map)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbQ(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method com.google.android.gms.wearable.CapabilityApi$GetAllCapabilitiesResult zzbQ(Status)>
			//    3    5:areturn         
			}

			final int zzbTJ;

			
			{
				zzbTJ = i;
			//    0    0:aload_0         
			//    1    1:iload_3         
			//    2    2:putfield        #16  <Field int zzbTJ>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//   12   20:aload_1         
	//   13   21:new             #10  <Class zzn$2>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:invokespecial   #136 <Method void zzn$2(zzn, GoogleApiClient, int)>
	//   19   31:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   20   34:areturn         
	}

	public PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i)
	{
		boolean flag;
		if(i == 0 || i == 1)
	//*   0    0:iload_3         
	//*   1    1:ifeq            9
	//*   2    4:iload_3         
	//*   3    5:iconst_1        
	//*   4    6:icmpne          15
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore          4
		else
	//*   7   12:goto            18
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          4
		zzac.zzax(flag);
	//   10   18:iload           4
	//   11   20:invokestatic    #133 <Method void zzac.zzax(boolean)>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, s, i) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class zzcx>
			//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzh(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTI, zzbTJ);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #18  <Field String zzbTI>
			//    4    6:aload_0         
			//    5    7:getfield        #20  <Field int zzbTJ>
			//    6   10:invokevirtual   #38  <Method void zzcx.zzh(com.google.android.gms.internal.zzaad$zzb, String, int)>
			//    7   13:return          
			}

			protected com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult zzbP(Status status)
			{
				return ((com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult) (new zze(status, ((CapabilityInfo) (null)))));
			//    0    0:new             #42  <Class zzn$zze>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #45  <Method void zzn$zze(Status, CapabilityInfo)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbP(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #49  <Method com.google.android.gms.wearable.CapabilityApi$GetCapabilityResult zzbP(Status)>
			//    3    5:areturn         
			}

			final String zzbTI;
			final int zzbTJ;

			
			{
				zzbTI = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field String zzbTI>
				zzbTJ = i;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #20  <Field int zzbTJ>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #23  <Method void zzm(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//   12   23:aload_1         
	//   13   24:new             #8   <Class zzn$1>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:iload_3         
	//   19   32:invokespecial   #142 <Method void zzn$1(zzn, GoogleApiClient, String, int)>
	//   20   35:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   21   38:areturn         
	}

	public PendingResult removeCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzf(googleapiclient, ((com.google.android.gms.wearable.CapabilityApi.CapabilityListener) (new zzb(capabilitylistener, s)))))))));
	//    0    0:aload_1         
	//    1    1:new             #33  <Class zzn$zzf>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:new             #21  <Class zzn$zzb>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #66  <Method void zzn$zzb(com.google.android.gms.wearable.CapabilityApi$CapabilityListener, String)>
	//    9   15:aconst_null     
	//   10   16:invokespecial   #147 <Method void zzn$zzf(GoogleApiClient, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, zzn$1)>
	//   11   19:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   12   22:areturn         
	}

	public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzf(googleapiclient, capabilitylistener))))));
	//    0    0:aload_1         
	//    1    1:new             #33  <Class zzn$zzf>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #147 <Method void zzn$zzf(GoogleApiClient, com.google.android.gms.wearable.CapabilityApi$CapabilityListener, zzn$1)>
	//    7   11:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult removeLocalCapability(GoogleApiClient googleapiclient, String s)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, s) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzw(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTI);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field String zzbTI>
			//    4    6:invokevirtual   #34  <Method void zzcx.zzw(com.google.android.gms.internal.zzaad$zzb, String)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult zzbS(Status status)
			{
				return ((com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult) (new zza(status)));
			//    0    0:new             #38  <Class zzn$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #41  <Method void zzn$zza(Status)>
			//    4    8:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbS(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method com.google.android.gms.wearable.CapabilityApi$RemoveLocalCapabilityResult zzbS(Status)>
			//    3    5:areturn         
			}

			final String zzbTI;

			
			{
				zzbTI = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field String zzbTI>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzn$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #152 <Method void zzn$4(zzn, GoogleApiClient, String)>
	//    7   11:invokevirtual   #126 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}
}
