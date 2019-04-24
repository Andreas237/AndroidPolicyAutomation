// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzlj, zzel

public abstract class zzlk extends zzek
	implements zzlj
{

	public zzlk()
	{
		super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
			switch(i)
	//*   0    0:iload_1         
			{
	//*   1    1:tableswitch     1 8: default 48
	//	               1 157
	//	               2 146
	//	               3 135
	//	               4 124
	//	               5 106
	//	               6 88
	//	               7 69
	//	               8 50
			default:
				return false;
	//    2   48:iconst_0        
	//    3   49:ireturn         

			case 8: // '\b'
				boolean flag = zzdp();
	//    4   50:aload_0         
	//    5   51:invokevirtual   #22  <Method boolean zzdp()>
	//    6   54:istore          6
				parcel1.writeNoException();
	//    7   56:aload_3         
	//    8   57:invokevirtual   #27  <Method void Parcel.writeNoException()>
				zzel.zza(parcel1, flag);
	//    9   60:aload_3         
	//   10   61:iload           6
	//   11   63:invokestatic    #33  <Method void zzel.zza(Parcel, boolean)>
				break label0;
	//   12   66:goto            165

			case 7: // '\007'
				float f = zzdo();
	//   13   69:aload_0         
	//   14   70:invokevirtual   #37  <Method float zzdo()>
	//   15   73:fstore          5
				parcel1.writeNoException();
	//   16   75:aload_3         
	//   17   76:invokevirtual   #27  <Method void Parcel.writeNoException()>
				parcel1.writeFloat(f);
	//   18   79:aload_3         
	//   19   80:fload           5
	//   20   82:invokevirtual   #41  <Method void Parcel.writeFloat(float)>
				break label0;
	//   21   85:goto            165

			case 6: // '\006'
				zza(parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   22   88:aload_0         
	//   23   89:aload_2         
	//   24   90:invokevirtual   #45  <Method String Parcel.readString()>
	//   25   93:aload_2         
	//   26   94:invokevirtual   #49  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   27   97:invokestatic    #55  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   28  100:invokevirtual   #58  <Method void zza(String, com.google.android.gms.dynamic.IObjectWrapper)>
				break;
	//   29  103:goto            161

			case 5: // '\005'
				zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
	//   30  106:aload_0         
	//   31  107:aload_2         
	//   32  108:invokevirtual   #49  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   33  111:invokestatic    #55  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   34  114:aload_2         
	//   35  115:invokevirtual   #45  <Method String Parcel.readString()>
	//   36  118:invokevirtual   #62  <Method void zzb(com.google.android.gms.dynamic.IObjectWrapper, String)>
				break;
	//   37  121:goto            161

			case 4: // '\004'
				setAppMuted(zzel.zza(parcel));
	//   38  124:aload_0         
	//   39  125:aload_2         
	//   40  126:invokestatic    #65  <Method boolean zzel.zza(Parcel)>
	//   41  129:invokevirtual   #69  <Method void setAppMuted(boolean)>
				break;
	//   42  132:goto            161

			case 3: // '\003'
				zzt(parcel.readString());
	//   43  135:aload_0         
	//   44  136:aload_2         
	//   45  137:invokevirtual   #45  <Method String Parcel.readString()>
	//   46  140:invokevirtual   #72  <Method void zzt(String)>
				break;
	//   47  143:goto            161

			case 2: // '\002'
				setAppVolume(parcel.readFloat());
	//   48  146:aload_0         
	//   49  147:aload_2         
	//   50  148:invokevirtual   #75  <Method float Parcel.readFloat()>
	//   51  151:invokevirtual   #78  <Method void setAppVolume(float)>
				break;
	//   52  154:goto            161

			case 1: // '\001'
				zza();
	//   53  157:aload_0         
	//   54  158:invokevirtual   #80  <Method void zza()>
				break;
			}
			parcel1.writeNoException();
	//   55  161:aload_3         
	//   56  162:invokevirtual   #27  <Method void Parcel.writeNoException()>
		}
		return true;
	//   57  165:iconst_1        
	//   58  166:ireturn         
	}
}
