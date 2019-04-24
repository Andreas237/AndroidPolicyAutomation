// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzv, zzcv, zzb, zzu, 
//			zzm, zzcx

public class zzu extends com.google.android.gms.common.internal.safeparcel.zza
	implements Channel
{
	static final class zza extends Binder
		implements zzu
	{
		static class zza
			implements zzu
		{

			public IBinder asBinder()
			{
				return zzrk;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field IBinder zzrk>
			//    2    4:areturn         
			}

			public boolean zza(zzf zzf1)
				throws RemoteException
			{
				Parcel parcel;
				Parcel parcel1;
				parcel = Parcel.obtain();
			//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
			//    1    3:astore          4
				parcel1 = Parcel.obtain();
			//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
			//    3    8:astore          5
				parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
			//    4   10:aload           4
			//    5   12:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
			//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				if(zzf1 == null) goto _L2; else goto _L1
			//    7   17:aload_1         
			//    8   18:ifnull          100
_L1:
				zzf1 = ((zzf) (zzf1.asBinder()));
			//    9   21:aload_1         
			//   10   22:invokeinterface #40  <Method IBinder zzf.asBinder()>
			//   11   27:astore_1        
			//*  12   28:goto            31
_L4:
				int i;
				parcel.writeStrongBinder(((IBinder) (zzf1)));
			//   13   31:aload           4
			//   14   33:aload_1         
			//   15   34:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
				zzrk.transact(1, parcel, parcel1, 0);
			//   16   37:aload_0         
			//   17   38:getfield        #18  <Field IBinder zzrk>
			//   18   41:iconst_1        
			//   19   42:aload           4
			//   20   44:aload           5
			//   21   46:iconst_0        
			//   22   47:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
			//   23   52:pop             
				parcel1.readException();
			//   24   53:aload           5
			//   25   55:invokevirtual   #52  <Method void Parcel.readException()>
				i = parcel1.readInt();
			//   26   58:aload           5
			//   27   60:invokevirtual   #56  <Method int Parcel.readInt()>
			//   28   63:istore_2        
				boolean flag;
				if(i != 0)
			//*  29   64:iload_2         
			//*  30   65:ifeq            73
					flag = true;
			//   31   68:iconst_1        
			//   32   69:istore_3        
				else
			//*  33   70:goto            75
					flag = false;
			//   34   73:iconst_0        
			//   35   74:istore_3        
				parcel1.recycle();
			//   36   75:aload           5
			//   37   77:invokevirtual   #59  <Method void Parcel.recycle()>
				parcel.recycle();
			//   38   80:aload           4
			//   39   82:invokevirtual   #59  <Method void Parcel.recycle()>
				return flag;
			//   40   85:iload_3         
			//   41   86:ireturn         
				zzf1;
			//   42   87:astore_1        
				parcel1.recycle();
			//   43   88:aload           5
			//   44   90:invokevirtual   #59  <Method void Parcel.recycle()>
				parcel.recycle();
			//   45   93:aload           4
			//   46   95:invokevirtual   #59  <Method void Parcel.recycle()>
				throw zzf1;
			//   47   98:aload_1         
			//   48   99:athrow          
_L2:
				zzf1 = null;
			//   49  100:aconst_null     
			//   50  101:astore_1        
				if(true) goto _L4; else goto _L3
			//   51  102:goto            31
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


		public static zzu zzdP(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
		//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzu))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzu>
		//*  12   23:ifeq            31
				return (zzu)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzu>
		//   15   30:areturn         
			else
				return ((zzu) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzu$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzu$zza$zza(IBinder)>
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
		//*   2   28:goto            81
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				boolean flag = zza(com.google.android.gms.maps.model.internal.zzf.zza.zzen(parcel.readStrongBinder()));
		//   11   45:aload_0         
		//   12   46:aload_2         
		//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   14   50:invokestatic    #55  <Method zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
		//   15   53:invokevirtual   #58  <Method boolean zza(zzf)>
		//   16   56:istore          5
				parcel1.writeNoException();
		//   17   58:aload_3         
		//   18   59:invokevirtual   #61  <Method void Parcel.writeNoException()>
				if(flag)
		//*  19   62:iload           5
		//*  20   64:ifeq            72
					i = 1;
		//   21   67:iconst_1        
		//   22   68:istore_1        
				else
		//*  23   69:goto            74
					i = 0;
		//   24   72:iconst_0        
		//   25   73:istore_1        
				parcel1.writeInt(i);
		//   26   74:aload_3         
		//   27   75:iload_1         
		//   28   76:invokevirtual   #65  <Method void Parcel.writeInt(int)>
				return true;
		//   29   79:iconst_1        
		//   30   80:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   31   81:aload_0         
		//   32   82:iload_1         
		//   33   83:aload_2         
		//   34   84:aload_3         
		//   35   85:iload           4
		//   36   87:invokespecial   #67  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   37   90:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMarkerClickListener");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
		//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
		//    6   11:return          
		}
	}

	static final class zzb
		implements com.google.android.gms.wearable.Channel.GetOutputStreamResult
	{

		public OutputStream getOutputStream()
		{
			return zzbUc;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field OutputStream zzbUc>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Status zzair>
		//    2    4:areturn         
		}

		public void release()
		{
			if(zzbUc == null)
				break MISSING_BLOCK_LABEL_14;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field OutputStream zzbUc>
		//    2    4:ifnull          14
			zzbUc.close();
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field OutputStream zzbUc>
		//    5   11:invokevirtual   #43  <Method void OutputStream.close()>
			return;
		//    6   14:return          
			IOException ioexception;
			ioexception;
		//    7   15:astore_1        
		//    8   16:return          
		}

		private final Status zzair;
		private final OutputStream zzbUc;

		zzb(Status status, OutputStream outputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = (Status)zzac.zzw(((Object) (status)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #24  <Method Object zzac.zzw(Object)>
		//    5    9:checkcast       #26  <Class Status>
		//    6   12:putfield        #28  <Field Status zzair>
			zzbUc = outputstream;
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:putfield        #30  <Field OutputStream zzbUc>
		//   10   20:return          
		}
	}


	public zzu(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void zza()>
		zzaiJ = (String)zzac.zzw(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #51  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #53  <Class String>
	//    6   12:putfield        #55  <Field String zzaiJ>
		zzbSS = (String)zzac.zzw(((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #51  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #53  <Class String>
	//   11   23:putfield        #57  <Field String zzbSS>
		mPath = (String)zzac.zzw(((Object) (s2)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #51  <Method Object zzac.zzw(Object)>
	//   15   31:checkcast       #53  <Class String>
	//   16   34:putfield        #59  <Field String mPath>
	//   17   37:return          
	}

	private static zzb.zza zza(String s, IntentFilter aintentfilter[])
	{
		return new zzb.zza(s, aintentfilter) {

			public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, zzabh zzabh)
				throws RemoteException
			{
				zzcx1.zza(zzb1, channellistener, zzabh, zzaiD, zzbTK);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:aload           4
			//    4    5:aload_0         
			//    5    6:getfield        #20  <Field String zzaiD>
			//    6    9:aload_0         
			//    7   10:getfield        #22  <Field IntentFilter[] zzbTK>
			//    8   13:invokevirtual   #34  <Method void com.google.android.gms.wearable.internal.zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.ChannelApi$ChannelListener, zzabh, String, IntentFilter[])>
			//    9   16:return          
			}

			public volatile void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj, zzabh zzabh)
				throws RemoteException
			{
				zza(zzcx1, zzb1, (com.google.android.gms.wearable.ChannelApi.ChannelListener)obj, zzabh);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #40  <Class com.google.android.gms.wearable.ChannelApi$ChannelListener>
			//    5    7:aload           4
			//    6    9:invokevirtual   #42  <Method void zza(zzcx, com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.ChannelApi$ChannelListener, zzabh)>
			//    7   12:return          
			}

			final String zzaiD;
			final IntentFilter zzbTK[];

			
			{
				zzaiD = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field String zzaiD>
				zzbTK = aintentfilter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field IntentFilter[] zzbTK>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #20  <Class zzu$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #63  <Method void zzu$7(String, IntentFilter[])>
	//    5    9:areturn         
	}

	static String zza(zzu zzu1)
	{
		return zzu1.zzaiJ;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaiJ>
	//    2    4:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
	{
		IntentFilter intentfilter = zzcv.zzip("com.google.android.gms.wearable.CHANNEL_EVENT");
	//    0    0:ldc1            #70  <String "com.google.android.gms.wearable.CHANNEL_EVENT">
	//    1    2:invokestatic    #76  <Method IntentFilter zzcv.zzip(String)>
	//    2    5:astore_3        
		return com.google.android.gms.wearable.internal.zzb.zza(googleapiclient, zza(zzaiJ, new IntentFilter[] {
			intentfilter
		}), ((Object) (channellistener)));
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #55  <Field String zzaiJ>
	//    6   11:iconst_1        
	//    7   12:anewarray       IntentFilter[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_3         
	//   11   18:aastore         
	//   12   19:invokestatic    #80  <Method zzb$zza zza(String, IntentFilter[])>
	//   13   22:aload_2         
	//   14   23:invokestatic    #85  <Method PendingResult com.google.android.gms.wearable.internal.zzb.zza(GoogleApiClient, zzb$zza, Object)>
	//   15   26:areturn         
	}

	public PendingResult close(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

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
				zzcx1.zzx(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field zzu zzbTX>
			//    4    6:invokestatic    #33  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:invokevirtual   #37  <Method void zzcx.zzx(com.google.android.gms.internal.zzaad$zzb, String)>
			//    6   12:return          
			}

			protected Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #43  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final zzu zzbTX;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field zzu zzbTX>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzu$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #91  <Method void zzu$1(zzu, GoogleApiClient)>
	//    6   10:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult close(GoogleApiClient googleapiclient, int i)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, i) {

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
				zzcx1.zzi(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX), zzIO);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #18  <Field zzu zzbTX>
			//    4    6:invokestatic    #37  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:aload_0         
			//    6   10:getfield        #20  <Field int zzIO>
			//    7   13:invokevirtual   #41  <Method void zzcx.zzi(com.google.android.gms.internal.zzaad$zzb, String, int)>
			//    8   16:return          
			}

			protected Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #47  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final int zzIO;
			final zzu zzbTX;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field zzu zzbTX>
				zzIO = i;
			//    3    5:aload_0         
			//    4    6:iload_3         
			//    5    7:putfield        #20  <Field int zzIO>
				super(googleapiclient);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #23  <Method void zzm(GoogleApiClient)>
			//    9   15:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzu$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #101 <Method void zzu$2(zzu, GoogleApiClient, int)>
	//    7   11:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzu))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzu>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzu)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzu>
	//   12   20:astore_1        
		return zzaiJ.equals(((Object) (((zzu) (obj)).zzaiJ))) && zzaa.equal(((Object) (((zzu) (obj)).zzbSS)), ((Object) (zzbSS))) && zzaa.equal(((Object) (((zzu) (obj)).mPath)), ((Object) (mPath)));
	//   13   21:aload_0         
	//   14   22:getfield        #55  <Field String zzaiJ>
	//   15   25:aload_1         
	//   16   26:getfield        #55  <Field String zzaiJ>
	//   17   29:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   18   32:ifeq            65
	//   19   35:aload_1         
	//   20   36:getfield        #57  <Field String zzbSS>
	//   21   39:aload_0         
	//   22   40:getfield        #57  <Field String zzbSS>
	//   23   43:invokestatic    #112 <Method boolean zzaa.equal(Object, Object)>
	//   24   46:ifeq            65
	//   25   49:aload_1         
	//   26   50:getfield        #59  <Field String mPath>
	//   27   53:aload_0         
	//   28   54:getfield        #59  <Field String mPath>
	//   29   57:invokestatic    #112 <Method boolean zzaa.equal(Object, Object)>
	//   30   60:ifeq            65
	//   31   63:iconst_1        
	//   32   64:ireturn         
	//   33   65:iconst_0        
	//   34   66:ireturn         
	}

	public PendingResult getInputStream(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

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
				zzcx1.zzy(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field zzu zzbTX>
			//    4    6:invokestatic    #33  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:invokevirtual   #37  <Method void zzcx.zzy(com.google.android.gms.internal.zzaad$zzb, String)>
			//    6   12:return          
			}

			public com.google.android.gms.wearable.Channel.GetInputStreamResult zzbU(Status status)
			{
				return ((com.google.android.gms.wearable.Channel.GetInputStreamResult) (new zza(status, ((java.io.InputStream) (null)))));
			//    0    0:new             #41  <Class zzu$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #44  <Method void zzu$zza(Status, java.io.InputStream)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbU(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #48  <Method com.google.android.gms.wearable.Channel$GetInputStreamResult zzbU(Status)>
			//    3    5:areturn         
			}

			final zzu zzbTX;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field zzu zzbTX>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzu$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #114 <Method void zzu$3(zzu, GoogleApiClient)>
	//    6   10:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public String getNodeId()
	{
		return zzbSS;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String zzbSS>
	//    2    4:areturn         
	}

	public PendingResult getOutputStream(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

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
				zzcx1.zzz(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field zzu zzbTX>
			//    4    6:invokestatic    #33  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:invokevirtual   #37  <Method void zzcx.zzz(com.google.android.gms.internal.zzaad$zzb, String)>
			//    6   12:return          
			}

			public com.google.android.gms.wearable.Channel.GetOutputStreamResult zzbV(Status status)
			{
				return ((com.google.android.gms.wearable.Channel.GetOutputStreamResult) (new zzb(status, ((OutputStream) (null)))));
			//    0    0:new             #41  <Class zzu$zzb>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #44  <Method void zzu$zzb(Status, OutputStream)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbV(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #48  <Method com.google.android.gms.wearable.Channel$GetOutputStreamResult zzbV(Status)>
			//    3    5:areturn         
			}

			final zzu zzbTX;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field zzu zzbTX>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzu$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #119 <Method void zzu$4(zzu, GoogleApiClient)>
	//    6   10:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public String getPath()
	{
		return mPath;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String mPath>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return zzaiJ;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaiJ>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzaiJ.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaiJ>
	//    2    4:invokevirtual   #126 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public PendingResult receiveFile(GoogleApiClient googleapiclient, Uri uri, boolean flag)
	{
		zzac.zzb(((Object) (googleapiclient)), "client is null");
	//    0    0:aload_1         
	//    1    1:ldc1            #130 <String "client is null">
	//    2    3:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (uri)), "uri is null");
	//    4    7:aload_2         
	//    5    8:ldc1            #135 <String "uri is null">
	//    6   10:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, uri, flag) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #34  <Class zzcx>
			//    3    5:invokevirtual   #37  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX), zzbBv, zzbTY);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #20  <Field zzu zzbTX>
			//    4    6:invokestatic    #41  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:aload_0         
			//    6   10:getfield        #22  <Field Uri zzbBv>
			//    7   13:aload_0         
			//    8   14:getfield        #24  <Field boolean zzbTY>
			//    9   17:invokevirtual   #44  <Method void com.google.android.gms.wearable.internal.zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, Uri, boolean)>
			//   10   20:return          
			}

			public Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #50  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final Uri zzbBv;
			final zzu zzbTX;
			final boolean zzbTY;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzu zzbTX>
				zzbBv = uri;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field Uri zzbBv>
				zzbTY = flag;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #24  <Field boolean zzbTY>
				super(googleapiclient);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void zzm(GoogleApiClient)>
			//   12   21:return          
			}
		}
)))));
	//    8   14:aload_1         
	//    9   15:new             #16  <Class zzu$5>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:iload_3         
	//   15   23:invokespecial   #138 <Method void zzu$5(zzu, GoogleApiClient, Uri, boolean)>
	//   16   26:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   17   29:areturn         
	}

	public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
	{
		zzac.zzb(((Object) (googleapiclient)), "client is null");
	//    0    0:aload_1         
	//    1    1:ldc1            #130 <String "client is null">
	//    2    3:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (channellistener)), "listener is null");
	//    4    7:aload_2         
	//    5    8:ldc1            #142 <String "listener is null">
	//    6   10:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzq.zzb(googleapiclient, channellistener, zzaiJ))))));
	//    8   14:aload_1         
	//    9   15:new             #144 <Class zzq$zzb>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #55  <Field String zzaiJ>
	//   15   25:invokespecial   #147 <Method void zzq$zzb(GoogleApiClient, com.google.android.gms.wearable.ChannelApi$ChannelListener, String)>
	//   16   28:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   17   31:areturn         
	}

	public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri)
	{
		return sendFile(googleapiclient, uri, 0L, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:ldc2w           #150 <Long -1L>
	//    5    7:invokevirtual   #154 <Method PendingResult sendFile(GoogleApiClient, Uri, long, long)>
	//    6   10:areturn         
	}

	public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri, long l, long l1)
	{
		zzac.zzb(((Object) (googleapiclient)), "client is null");
	//    0    0:aload_1         
	//    1    1:ldc1            #130 <String "client is null">
	//    2    3:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (zzaiJ)), "token is null");
	//    4    7:aload_0         
	//    5    8:getfield        #55  <Field String zzaiJ>
	//    6   11:ldc1            #157 <String "token is null">
	//    7   13:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//    8   16:pop             
		zzac.zzb(((Object) (uri)), "uri is null");
	//    9   17:aload_2         
	//   10   18:ldc1            #135 <String "uri is null">
	//   11   20:invokestatic    #133 <Method Object zzac.zzb(Object, Object)>
	//   12   23:pop             
		boolean flag;
		if(l >= 0L)
	//*  13   24:lload_3         
	//*  14   25:lconst_0        
	//*  15   26:lcmp            
	//*  16   27:iflt            36
			flag = true;
	//   17   30:iconst_1        
	//   18   31:istore          7
		else
	//*  19   33:goto            39
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore          7
		zzac.zzb(flag, "startOffset is negative: %s", new Object[] {
			Long.valueOf(l)
		});
	//   22   39:iload           7
	//   23   41:ldc1            #159 <String "startOffset is negative: %s">
	//   24   43:iconst_1        
	//   25   44:anewarray       Object[]
	//   26   47:dup             
	//   27   48:iconst_0        
	//   28   49:lload_3         
	//   29   50:invokestatic    #167 <Method Long Long.valueOf(long)>
	//   30   53:aastore         
	//   31   54:invokestatic    #170 <Method void zzac.zzb(boolean, String, Object[])>
		if(l1 >= 0L || l1 == -1L)
	//*  32   57:lload           5
	//*  33   59:lconst_0        
	//*  34   60:lcmp            
	//*  35   61:ifge            73
	//*  36   64:lload           5
	//*  37   66:ldc2w           #150 <Long -1L>
	//*  38   69:lcmp            
	//*  39   70:ifne            79
			flag = true;
	//   40   73:iconst_1        
	//   41   74:istore          7
		else
	//*  42   76:goto            82
			flag = false;
	//   43   79:iconst_0        
	//   44   80:istore          7
		zzac.zzb(flag, "invalid length: %s", new Object[] {
			Long.valueOf(l1)
		});
	//   45   82:iload           7
	//   46   84:ldc1            #172 <String "invalid length: %s">
	//   47   86:iconst_1        
	//   48   87:anewarray       Object[]
	//   49   90:dup             
	//   50   91:iconst_0        
	//   51   92:lload           5
	//   52   94:invokestatic    #167 <Method Long Long.valueOf(long)>
	//   53   97:aastore         
	//   54   98:invokestatic    #170 <Method void zzac.zzb(boolean, String, Object[])>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, uri, l, l1) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #37  <Class zzcx>
			//    3    5:invokevirtual   #40  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), com.google.android.gms.wearable.internal.zzu.zza(zzbTX), zzbBv, zzbTZ, zzbUa);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #21  <Field zzu zzbTX>
			//    4    6:invokestatic    #44  <Method String com.google.android.gms.wearable.internal.zzu.zza(zzu)>
			//    5    9:aload_0         
			//    6   10:getfield        #23  <Field Uri zzbBv>
			//    7   13:aload_0         
			//    8   14:getfield        #25  <Field long zzbTZ>
			//    9   17:aload_0         
			//   10   18:getfield        #27  <Field long zzbUa>
			//   11   21:invokevirtual   #47  <Method void com.google.android.gms.wearable.internal.zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, Uri, long, long)>
			//   12   24:return          
			}

			public Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #53  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final Uri zzbBv;
			final zzu zzbTX;
			final long zzbTZ;
			final long zzbUa;

			
			{
				zzbTX = zzu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzu zzbTX>
				zzbBv = uri;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field Uri zzbBv>
				zzbTZ = l;
			//    6   10:aload_0         
			//    7   11:lload           4
			//    8   13:putfield        #25  <Field long zzbTZ>
				zzbUa = l1;
			//    9   16:aload_0         
			//   10   17:lload           6
			//   11   19:putfield        #27  <Field long zzbUa>
				super(googleapiclient);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #30  <Method void zzm(GoogleApiClient)>
			//   15   27:return          
			}
		}
)))));
	//   55  101:aload_1         
	//   56  102:new             #18  <Class zzu$6>
	//   57  105:dup             
	//   58  106:aload_0         
	//   59  107:aload_1         
	//   60  108:aload_2         
	//   61  109:lload_3         
	//   62  110:lload           5
	//   63  112:invokespecial   #175 <Method void zzu$6(zzu, GoogleApiClient, Uri, long, long)>
	//   64  115:invokevirtual   #96  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   65  118:areturn         
	}

	public String toString()
	{
		String s = zzaiJ;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaiJ>
	//    2    4:astore_3        
		String s1 = zzbSS;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field String zzbSS>
	//    5    9:astore          4
		String s2 = mPath;
	//    6   11:aload_0         
	//    7   12:getfield        #59  <Field String mPath>
	//    8   15:astore          5
		int i = String.valueOf(((Object) (s))).length();
	//    9   17:aload_3         
	//   10   18:invokestatic    #180 <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #183 <Method int String.length()>
	//   12   24:istore_1        
		int j = String.valueOf(((Object) (s1))).length();
	//   13   25:aload           4
	//   14   27:invokestatic    #180 <Method String String.valueOf(Object)>
	//   15   30:invokevirtual   #183 <Method int String.length()>
	//   16   33:istore_2        
		return (new StringBuilder(String.valueOf(((Object) (s2))).length() + (i + 43 + j))).append("ChannelImpl{, token='").append(s).append("'").append(", nodeId='").append(s1).append("'").append(", path='").append(s2).append("'").append("}").toString();
	//   17   34:new             #185 <Class StringBuilder>
	//   18   37:dup             
	//   19   38:aload           5
	//   20   40:invokestatic    #180 <Method String String.valueOf(Object)>
	//   21   43:invokevirtual   #183 <Method int String.length()>
	//   22   46:iload_1         
	//   23   47:bipush          43
	//   24   49:iadd            
	//   25   50:iload_2         
	//   26   51:iadd            
	//   27   52:iadd            
	//   28   53:invokespecial   #188 <Method void StringBuilder(int)>
	//   29   56:ldc1            #190 <String "ChannelImpl{, token='">
	//   30   58:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:aload_3         
	//   32   62:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:ldc1            #196 <String "'">
	//   34   67:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:ldc1            #198 <String ", nodeId='">
	//   36   72:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:aload           4
	//   38   77:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:ldc1            #196 <String "'">
	//   40   82:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:ldc1            #200 <String ", path='">
	//   42   87:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:aload           5
	//   44   92:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:ldc1            #196 <String "'">
	//   46   97:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:ldc1            #202 <String "}">
	//   48  102:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   49  105:invokevirtual   #204 <Method String StringBuilder.toString()>
	//   50  108:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzv.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #209 <Method void com.google.android.gms.wearable.internal.zzv.zza(zzu, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzv();
	private final String mPath;
	private final String zzaiJ;
	private final String zzbSS;

	static 
	{
	//    0    0:new             #37  <Class zzv>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void zzv()>
	//    3    7:putstatic       #42  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
