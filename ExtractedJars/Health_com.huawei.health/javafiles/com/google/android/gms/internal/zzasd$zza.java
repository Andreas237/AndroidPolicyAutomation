// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzasd

public static abstract class zzasd$zza extends Binder
	implements zzasd
{
	static class zza
		implements zzasd
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(int i, PendingIntent pendingintent)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
		//    2    4:aload_3         
		//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
		//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_3         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(pendingintent == null)
				break MISSING_BLOCK_LABEL_33;
		//    8   15:aload_2         
		//    9   16:ifnull          33
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			pendingintent.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #46  <Method void PendingIntent.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   17   30:goto            38
			parcel.writeInt(0);
		//   18   33:aload_3         
		//   19   34:iconst_0        
		//   20   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(3, parcel, ((Parcel) (null)), 1);
		//   21   38:aload_0         
		//   22   39:getfield        #18  <Field IBinder zzrk>
		//   23   42:iconst_3        
		//   24   43:aload_3         
		//   25   44:aconst_null     
		//   26   45:iconst_1        
		//   27   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   51:pop             
			parcel.recycle();
		//   29   52:aload_3         
		//   30   53:invokevirtual   #55  <Method void Parcel.recycle()>
			return;
		//   31   56:return          
			pendingintent;
		//   32   57:astore_2        
			parcel.recycle();
		//   33   58:aload_3         
		//   34   59:invokevirtual   #55  <Method void Parcel.recycle()>
			throw pendingintent;
		//   35   62:aload_2         
		//   36   63:athrow          
		}

		public void zza(int i, String as[])
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
		//    2    4:aload_3         
		//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
		//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_3         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeStringArray(as);
		//    8   15:aload_3         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #61  <Method void Parcel.writeStringArray(String[])>
			zzrk.transact(1, parcel, ((Parcel) (null)), 1);
		//   11   20:aload_0         
		//   12   21:getfield        #18  <Field IBinder zzrk>
		//   13   24:iconst_1        
		//   14   25:aload_3         
		//   15   26:aconst_null     
		//   16   27:iconst_1        
		//   17   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   18   33:pop             
			parcel.recycle();
		//   19   34:aload_3         
		//   20   35:invokevirtual   #55  <Method void Parcel.recycle()>
			return;
		//   21   38:return          
			as;
		//   22   39:astore_2        
			parcel.recycle();
		//   23   40:aload_3         
		//   24   41:invokevirtual   #55  <Method void Parcel.recycle()>
			throw as;
		//   25   44:aload_2         
		//   26   45:athrow          
		}

		public void zzb(int i, String as[])
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
		//    2    4:aload_3         
		//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
		//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_3         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeStringArray(as);
		//    8   15:aload_3         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #61  <Method void Parcel.writeStringArray(String[])>
			zzrk.transact(2, parcel, ((Parcel) (null)), 1);
		//   11   20:aload_0         
		//   12   21:getfield        #18  <Field IBinder zzrk>
		//   13   24:iconst_2        
		//   14   25:aload_3         
		//   15   26:aconst_null     
		//   16   27:iconst_1        
		//   17   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   18   33:pop             
			parcel.recycle();
		//   19   34:aload_3         
		//   20   35:invokevirtual   #55  <Method void Parcel.recycle()>
			return;
		//   21   38:return          
			as;
		//   22   39:astore_2        
			parcel.recycle();
		//   23   40:aload_3         
		//   24   41:invokevirtual   #55  <Method void Parcel.recycle()>
			throw as;
		//   25   44:aload_2         
		//   26   45:athrow          
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


	public static zzasd zzdh(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzasd))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzasd>
	//*  12   23:ifeq            31
			return (zzasd)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzasd>
	//   15   30:areturn         
		else
			return ((zzasd) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzasd$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzasd$zza$zza(IBinder)>
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
	//*   1    1:lookupswitch    4: default 44
	//	               1: 55
	//	               2: 75
	//	               3: 95
	//	               1598968902: 47
	//*   2   44:goto            139
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    3   47:aload_3         
	//    4   48:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    5   50:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   53:iconst_1        
	//    7   54:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    8   55:aload_2         
	//    9   56:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//   10   58:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zza(parcel.readInt(), parcel.createStringArray());
	//   11   61:aload_0         
	//   12   62:aload_2         
	//   13   63:invokevirtual   #50  <Method int Parcel.readInt()>
	//   14   66:aload_2         
	//   15   67:invokevirtual   #54  <Method String[] Parcel.createStringArray()>
	//   16   70:invokevirtual   #57  <Method void zza(int, String[])>
			return true;
	//   17   73:iconst_1        
	//   18   74:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//   19   75:aload_2         
	//   20   76:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//   21   78:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zzb(parcel.readInt(), parcel.createStringArray());
	//   22   81:aload_0         
	//   23   82:aload_2         
	//   24   83:invokevirtual   #50  <Method int Parcel.readInt()>
	//   25   86:aload_2         
	//   26   87:invokevirtual   #54  <Method String[] Parcel.createStringArray()>
	//   27   90:invokevirtual   #60  <Method void zzb(int, String[])>
			return true;
	//   28   93:iconst_1        
	//   29   94:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//   30   95:aload_2         
	//   31   96:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//   32   98:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   33  101:aload_2         
	//   34  102:invokevirtual   #50  <Method int Parcel.readInt()>
	//   35  105:istore_1        
			if(parcel.readInt() != 0)
	//*  36  106:aload_2         
	//*  37  107:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  38  110:ifeq            129
				parcel = ((Parcel) ((PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel)));
	//   39  113:getstatic       #66  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
	//   40  116:aload_2         
	//   41  117:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   42  122:checkcast       #62  <Class PendingIntent>
	//   43  125:astore_2        
			else
	//*  44  126:goto            131
				parcel = null;
	//   45  129:aconst_null     
	//   46  130:astore_2        
			zza(i, ((PendingIntent) (parcel)));
	//   47  131:aload_0         
	//   48  132:iload_1         
	//   49  133:aload_2         
	//   50  134:invokevirtual   #75  <Method void zza(int, PendingIntent)>
			return true;
	//   51  137:iconst_1        
	//   52  138:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   53  139:aload_0         
	//   54  140:iload_1         
	//   55  141:aload_2         
	//   56  142:aload_3         
	//   57  143:iload           4
	//   58  145:invokespecial   #77  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   59  148:ireturn         
	}

	public zzasd$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
