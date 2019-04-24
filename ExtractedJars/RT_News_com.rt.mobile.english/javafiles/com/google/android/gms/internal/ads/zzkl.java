// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzkk, zzjj, zzel

public abstract class zzkl extends zzek
	implements zzkk
{

	public zzkl()
	{
		super("com.google.android.gms.ads.internal.client.IAdLoader");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 1 5: default 36
	//	               1 103
	//	               2 86
	//	               3 67
	//	               4 59
	//	               5 38;
	//    1    1:tableswitch     1 5: default 36
	//	               1 103
	//	               2 86
	//	               3 67
	//	               4 59
	//	               5 38
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         
_L6:
		zza((zzjj)zzel.zza(parcel, zzjj.CREATOR), parcel.readInt());
	//    4   38:aload_0         
	//    5   39:aload_2         
	//    6   40:getstatic       #24  <Field android.os.Parcelable$Creator zzjj.CREATOR>
	//    7   43:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    8   46:checkcast       #20  <Class zzjj>
	//    9   49:aload_2         
	//   10   50:invokevirtual   #36  <Method int Parcel.readInt()>
	//   11   53:invokevirtual   #39  <Method void zza(zzjj, int)>
		  goto _L7
	//*  12   56:goto            117
_L5:
		parcel = ((Parcel) (zzck()));
	//   13   59:aload_0         
	//   14   60:invokevirtual   #43  <Method String zzck()>
	//   15   63:astore_2        
		  goto _L8
	//*  16   64:goto            91
_L4:
		boolean flag = isLoading();
	//   17   67:aload_0         
	//   18   68:invokevirtual   #47  <Method boolean isLoading()>
	//   19   71:istore          5
		parcel1.writeNoException();
	//   20   73:aload_3         
	//   21   74:invokevirtual   #50  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, flag);
	//   22   77:aload_3         
	//   23   78:iload           5
	//   24   80:invokestatic    #53  <Method void zzel.zza(Parcel, boolean)>
		break MISSING_BLOCK_LABEL_121;
	//   25   83:goto            121
_L3:
		parcel = ((Parcel) (getMediationAdapterClassName()));
	//   26   86:aload_0         
	//   27   87:invokevirtual   #56  <Method String getMediationAdapterClassName()>
	//   28   90:astore_2        
_L8:
		parcel1.writeNoException();
	//   29   91:aload_3         
	//   30   92:invokevirtual   #50  <Method void Parcel.writeNoException()>
		parcel1.writeString(((String) (parcel)));
	//   31   95:aload_3         
	//   32   96:aload_2         
	//   33   97:invokevirtual   #59  <Method void Parcel.writeString(String)>
		break MISSING_BLOCK_LABEL_121;
	//   34  100:goto            121
_L2:
		zzd((zzjj)zzel.zza(parcel, zzjj.CREATOR));
	//   35  103:aload_0         
	//   36  104:aload_2         
	//   37  105:getstatic       #24  <Field android.os.Parcelable$Creator zzjj.CREATOR>
	//   38  108:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   39  111:checkcast       #20  <Class zzjj>
	//   40  114:invokevirtual   #63  <Method void zzd(zzjj)>
_L7:
		parcel1.writeNoException();
	//   41  117:aload_3         
	//   42  118:invokevirtual   #50  <Method void Parcel.writeNoException()>
		return true;
	//   43  121:iconst_1        
	//   44  122:ireturn         
	}
}
