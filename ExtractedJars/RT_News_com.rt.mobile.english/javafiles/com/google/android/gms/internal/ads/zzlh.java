// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzlg

public abstract class zzlh extends zzek
	implements zzlg
{

	public zzlh()
	{
		super("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          23
		{
			long l = getValue();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #22  <Method long getValue()>
	//    5    9:lstore          5
			parcel1.writeNoException();
	//    6   11:aload_3         
	//    7   12:invokevirtual   #27  <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//    8   15:aload_3         
	//    9   16:lload           5
	//   10   18:invokevirtual   #31  <Method void Parcel.writeLong(long)>
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		} else
		{
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
	}
}
