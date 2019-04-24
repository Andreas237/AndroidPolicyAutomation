// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzoa

public abstract class zzob extends zzek
	implements zzoa
{

	public zzob()
	{
		super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
						switch(i)
	//*   0    0:iload_1         
						{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 78
	//	               2 70
	//	               3 52
	//	               4 45
	//	               5 38
						default:
							return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         

						case 1: // '\001'
							break label2;

						case 2: // '\002'
							break label3;

						case 5: // '\005'
							recordImpression();
	//    4   38:aload_0         
	//    5   39:invokevirtual   #21  <Method void recordImpression()>
							break;
	//    6   42:goto            63

						case 4: // '\004'
							recordClick();
	//    7   45:aload_0         
	//    8   46:invokevirtual   #24  <Method void recordClick()>
							break;
	//    9   49:goto            63

						case 3: // '\003'
							zzg(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   10   52:aload_0         
	//   11   53:aload_2         
	//   12   54:invokevirtual   #30  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   13   57:invokestatic    #36  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   14   60:invokevirtual   #40  <Method void zzg(com.google.android.gms.dynamic.IObjectWrapper)>
							break;
						}
						parcel1.writeNoException();
	//   15   63:aload_3         
	//   16   64:invokevirtual   #43  <Method void Parcel.writeNoException()>
						break label0;
	//   17   67:goto            92
					}
					parcel = ((Parcel) (getContent()));
	//   18   70:aload_0         
	//   19   71:invokevirtual   #47  <Method String getContent()>
	//   20   74:astore_2        
					break label1;
	//   21   75:goto            83
				}
				parcel = ((Parcel) (zzjn()));
	//   22   78:aload_0         
	//   23   79:invokevirtual   #50  <Method String zzjn()>
	//   24   82:astore_2        
			}
			parcel1.writeNoException();
	//   25   83:aload_3         
	//   26   84:invokevirtual   #43  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   27   87:aload_3         
	//   28   88:aload_2         
	//   29   89:invokevirtual   #53  <Method void Parcel.writeString(String)>
		}
		return true;
	//   30   92:iconst_1        
	//   31   93:ireturn         
	}
}
