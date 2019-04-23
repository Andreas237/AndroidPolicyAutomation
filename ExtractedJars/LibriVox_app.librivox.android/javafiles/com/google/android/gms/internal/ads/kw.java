// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, kv

public abstract class kw extends bcj
	implements kv
{

	public kw()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          21
		{
			i = a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method int a()>
	//    5    9:istore_1        
			parcel1.writeNoException();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//    8   14:aload_3         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #29  <Method void Parcel.writeInt(int)>
			return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
		} else
		{
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		}
	}
}
