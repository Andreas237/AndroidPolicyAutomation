// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxq

public abstract class bxs extends bcj
	implements bxq
{

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          23
		{
			long l = a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #12  <Method long a()>
	//    5    9:lstore          5
			parcel1.writeNoException();
	//    6   11:aload_3         
	//    7   12:invokevirtual   #18  <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//    8   15:aload_3         
	//    9   16:lload           5
	//   10   18:invokevirtual   #22  <Method void Parcel.writeLong(long)>
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
