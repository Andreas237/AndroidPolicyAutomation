// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzqa, zzqc, zzel

public abstract class zzqb extends zzek
	implements zzqa
{

	public zzqb()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzqa zzi(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzqa)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzqa>
	//*  10   19:ifeq            27
			return (zzqa)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzqa>
	//   13   26:areturn         
		else
			return ((zzqa) (new zzqc(ibinder)));
	//   14   27:new             #24  <Class zzqc>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzqc(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
			switch(i)
	//*   0    0:iload_1         
			{
	//*   1    1:tableswitch     1 6: default 40
	//	               1 116
	//	               2 95
	//	               3 81
	//	               4 74
	//	               5 56
	//	               6 42
			default:
				return false;
	//    2   40:iconst_0        
	//    3   41:ireturn         

			case 6: // '\006'
				zzc(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4   42:aload_0         
	//    5   43:aload_2         
	//    6   44:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    7   47:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   50:invokevirtual   #47  <Method void zzc(com.google.android.gms.dynamic.IObjectWrapper)>
				break;
	//    9   53:goto            131

			case 5: // '\005'
				zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
	//   10   56:aload_0         
	//   11   57:aload_2         
	//   12   58:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   13   61:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   64:aload_2         
	//   15   65:invokevirtual   #51  <Method int Parcel.readInt()>
	//   16   68:invokevirtual   #55  <Method void zzb(com.google.android.gms.dynamic.IObjectWrapper, int)>
				break;
	//   17   71:goto            131

			case 4: // '\004'
				destroy();
	//   18   74:aload_0         
	//   19   75:invokevirtual   #58  <Method void destroy()>
				break;
	//   20   78:goto            131

			case 3: // '\003'
				zza(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   21   81:aload_0         
	//   22   82:aload_2         
	//   23   83:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   24   86:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   25   89:invokevirtual   #61  <Method void zza(com.google.android.gms.dynamic.IObjectWrapper)>
				break;
	//   26   92:goto            131

			case 2: // '\002'
				parcel = ((Parcel) (zzak(parcel.readString())));
	//   27   95:aload_0         
	//   28   96:aload_2         
	//   29   97:invokevirtual   #65  <Method String Parcel.readString()>
	//   30  100:invokevirtual   #69  <Method com.google.android.gms.dynamic.IObjectWrapper zzak(String)>
	//   31  103:astore_2        
				parcel1.writeNoException();
	//   32  104:aload_3         
	//   33  105:invokevirtual   #72  <Method void Parcel.writeNoException()>
				zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   34  108:aload_3         
	//   35  109:aload_2         
	//   36  110:invokestatic    #77  <Method void zzel.zza(Parcel, android.os.IInterface)>
				break label0;
	//   37  113:goto            135

			case 1: // '\001'
				zzb(parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   38  116:aload_0         
	//   39  117:aload_2         
	//   40  118:invokevirtual   #65  <Method String Parcel.readString()>
	//   41  121:aload_2         
	//   42  122:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   43  125:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   44  128:invokevirtual   #80  <Method void zzb(String, com.google.android.gms.dynamic.IObjectWrapper)>
				break;
			}
			parcel1.writeNoException();
	//   45  131:aload_3         
	//   46  132:invokevirtual   #72  <Method void Parcel.writeNoException()>
		}
		return true;
	//   47  135:iconst_1        
	//   48  136:ireturn         
	}
}
