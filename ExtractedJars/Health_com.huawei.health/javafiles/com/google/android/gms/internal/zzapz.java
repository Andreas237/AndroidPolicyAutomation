// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzapf, zzapv, zzaon, zzapx

public interface zzapz
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzapz
	{

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
		//		               1: 55
		//		               2: 100
		//		               3: 145
		//		               1598968902: 47
		//*   2   44:goto            190
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
		//    3   47:aload_3         
		//    4   48:ldc1            #13  <String "com.google.android.gms.fitness.internal.service.IFitnessSensorService">
		//    5   50:invokevirtual   #30  <Method void Parcel.writeString(String)>
				return true;
		//    6   53:iconst_1        
		//    7   54:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
		//    8   55:aload_2         
		//    9   56:ldc1            #13  <String "com.google.android.gms.fitness.internal.service.IFitnessSensorService">
		//   10   58:invokevirtual   #33  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11   61:aload_2         
		//*  12   62:invokevirtual   #37  <Method int Parcel.readInt()>
		//*  13   65:ifeq            84
					parcel1 = ((Parcel) ((zzapv)zzapv.CREATOR.createFromParcel(parcel)));
		//   14   68:getstatic       #43  <Field android.os.Parcelable$Creator zzapv.CREATOR>
		//   15   71:aload_2         
		//   16   72:invokeinterface #49  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17   77:checkcast       #39  <Class zzapv>
		//   18   80:astore_3        
				else
		//*  19   81:goto            86
					parcel1 = null;
		//   20   84:aconst_null     
		//   21   85:astore_3        
				zza(((zzapv) (parcel1)), zzaon.zza.zzcr(parcel.readStrongBinder()));
		//   22   86:aload_0         
		//   23   87:aload_3         
		//   24   88:aload_2         
		//   25   89:invokevirtual   #52  <Method IBinder Parcel.readStrongBinder()>
		//   26   92:invokestatic    #58  <Method zzaon zzaon$zza.zzcr(IBinder)>
		//   27   95:invokevirtual   #61  <Method void zza(zzapv, zzaon)>
				return true;
		//   28   98:iconst_1        
		//   29   99:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
		//   30  100:aload_2         
		//   31  101:ldc1            #13  <String "com.google.android.gms.fitness.internal.service.IFitnessSensorService">
		//   32  103:invokevirtual   #33  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  33  106:aload_2         
		//*  34  107:invokevirtual   #37  <Method int Parcel.readInt()>
		//*  35  110:ifeq            129
					parcel1 = ((Parcel) ((FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel)));
		//   36  113:getstatic       #64  <Field android.os.Parcelable$Creator FitnessSensorServiceRequest.CREATOR>
		//   37  116:aload_2         
		//   38  117:invokeinterface #49  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   39  122:checkcast       #63  <Class FitnessSensorServiceRequest>
		//   40  125:astore_3        
				else
		//*  41  126:goto            131
					parcel1 = null;
		//   42  129:aconst_null     
		//   43  130:astore_3        
				zza(((FitnessSensorServiceRequest) (parcel1)), zzapf.zza.zzcJ(parcel.readStrongBinder()));
		//   44  131:aload_0         
		//   45  132:aload_3         
		//   46  133:aload_2         
		//   47  134:invokevirtual   #52  <Method IBinder Parcel.readStrongBinder()>
		//   48  137:invokestatic    #70  <Method zzapf zzapf$zza.zzcJ(IBinder)>
		//   49  140:invokevirtual   #73  <Method void zza(FitnessSensorServiceRequest, zzapf)>
				return true;
		//   50  143:iconst_1        
		//   51  144:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
		//   52  145:aload_2         
		//   53  146:ldc1            #13  <String "com.google.android.gms.fitness.internal.service.IFitnessSensorService">
		//   54  148:invokevirtual   #33  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  55  151:aload_2         
		//*  56  152:invokevirtual   #37  <Method int Parcel.readInt()>
		//*  57  155:ifeq            174
					parcel1 = ((Parcel) ((zzapx)zzapx.CREATOR.createFromParcel(parcel)));
		//   58  158:getstatic       #76  <Field android.os.Parcelable$Creator zzapx.CREATOR>
		//   59  161:aload_2         
		//   60  162:invokeinterface #49  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   61  167:checkcast       #75  <Class zzapx>
		//   62  170:astore_3        
				else
		//*  63  171:goto            176
					parcel1 = null;
		//   64  174:aconst_null     
		//   65  175:astore_3        
				zza(((zzapx) (parcel1)), zzapf.zza.zzcJ(parcel.readStrongBinder()));
		//   66  176:aload_0         
		//   67  177:aload_3         
		//   68  178:aload_2         
		//   69  179:invokevirtual   #52  <Method IBinder Parcel.readStrongBinder()>
		//   70  182:invokestatic    #70  <Method zzapf zzapf$zza.zzcJ(IBinder)>
		//   71  185:invokevirtual   #79  <Method void zza(zzapx, zzapf)>
				return true;
		//   72  188:iconst_1        
		//   73  189:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   74  190:aload_0         
		//   75  191:iload_1         
		//   76  192:aload_2         
		//   77  193:aload_3         
		//   78  194:iload           4
		//   79  196:invokespecial   #81  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   80  199:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #13  <String "com.google.android.gms.fitness.internal.service.IFitnessSensorService">
		//    5    8:invokevirtual   #17  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}


	public abstract void zza(FitnessSensorServiceRequest fitnesssensorservicerequest, zzapf zzapf)
		throws RemoteException;

	public abstract void zza(zzapv zzapv, zzaon zzaon)
		throws RemoteException;

	public abstract void zza(zzapx zzapx, zzapf zzapf)
		throws RemoteException;
}
