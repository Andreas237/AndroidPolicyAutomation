// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzv

public static abstract class zzv$zza extends Binder
	implements zzv
{
	static class zza
		implements zzv
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zzb(zzf zzf1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(zzf1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			zzf1 = ((zzf) (zzf1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #41  <Method IBinder zzf.asBinder()>
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

		public void zzc(zzf zzf1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(zzf1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			zzf1 = ((zzf) (zzf1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #41  <Method IBinder zzf.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzf1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(3, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:iconst_3        
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

		public void zzd(zzf zzf1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(zzf1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			zzf1 = ((zzf) (zzf1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #41  <Method IBinder zzf.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzf1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:iconst_2        
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


	public static zzv zzdQ(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzv))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzv>
	//*  12   23:ifeq            31
			return (zzv)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzv>
	//   15   30:areturn         
		else
			return ((zzv) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzv$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzv$zza$zza(IBinder)>
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
	//	               2: 78
	//	               3: 101
	//	               1598968902: 47
	//*   2   44:goto            124
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//    3   47:aload_3         
	//    4   48:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//    5   50:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   53:iconst_1        
	//    7   54:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//    8   55:aload_2         
	//    9   56:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//   10   58:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zzb(com.google.android.gms.maps.model.internal.zzf$zza.zzen(parcel.readStrongBinder()));
	//   11   61:aload_0         
	//   12   62:aload_2         
	//   13   63:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   14   66:invokestatic    #55  <Method zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
	//   15   69:invokevirtual   #59  <Method void zzb(zzf)>
			parcel1.writeNoException();
	//   16   72:aload_3         
	//   17   73:invokevirtual   #62  <Method void Parcel.writeNoException()>
			return true;
	//   18   76:iconst_1        
	//   19   77:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//   20   78:aload_2         
	//   21   79:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//   22   81:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zzd(com.google.android.gms.maps.model.internal.zzf$zza.zzen(parcel.readStrongBinder()));
	//   23   84:aload_0         
	//   24   85:aload_2         
	//   25   86:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   26   89:invokestatic    #55  <Method zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
	//   27   92:invokevirtual   #65  <Method void zzd(zzf)>
			parcel1.writeNoException();
	//   28   95:aload_3         
	//   29   96:invokevirtual   #62  <Method void Parcel.writeNoException()>
			return true;
	//   30   99:iconst_1        
	//   31  100:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//   32  101:aload_2         
	//   33  102:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//   34  104:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zzc(com.google.android.gms.maps.model.internal.zzf$zza.zzen(parcel.readStrongBinder()));
	//   35  107:aload_0         
	//   36  108:aload_2         
	//   37  109:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   38  112:invokestatic    #55  <Method zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
	//   39  115:invokevirtual   #68  <Method void zzc(zzf)>
			parcel1.writeNoException();
	//   40  118:aload_3         
	//   41  119:invokevirtual   #62  <Method void Parcel.writeNoException()>
			return true;
	//   42  122:iconst_1        
	//   43  123:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   44  124:aload_0         
	//   45  125:iload_1         
	//   46  126:aload_2         
	//   47  127:aload_3         
	//   48  128:iload           4
	//   49  130:invokespecial   #70  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   50  133:ireturn         
	}

	public zzv$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMarkerDragListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerDragListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
