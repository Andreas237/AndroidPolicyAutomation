// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bwn

public abstract class bwo extends bcj
	implements bwn
{

	public bwo()
	{
		super("com.google.android.gms.ads.internal.client.IAdClickListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdClickListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          15
		{
			a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #19  <Method void a()>
			parcel1.writeNoException();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #24  <Method void Parcel.writeNoException()>
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		} else
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		}
	}
}
