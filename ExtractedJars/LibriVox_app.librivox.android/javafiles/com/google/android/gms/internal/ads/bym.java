// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyv

public final class bym
	implements android.os.Parcelable.Creator
{

	public bym()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int j = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		while(parcel.dataPosition() < j) 
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*   7   11:iload_3         
	//*   8   12:icmpge          49
		{
			int k = a.a(parcel);
	//    9   15:aload_1         
	//   10   16:invokestatic    #28  <Method int a.a(Parcel)>
	//   11   19:istore          4
			if(a.a(k) != 2)
	//*  12   21:iload           4
	//*  13   23:invokestatic    #31  <Method int a.a(int)>
	//*  14   26:iconst_2        
	//*  15   27:icmpeq          39
				a.b(parcel, k);
	//   16   30:aload_1         
	//   17   31:iload           4
	//   18   33:invokestatic    #34  <Method void a.b(Parcel, int)>
			else
	//*  19   36:goto            7
				i = a.d(parcel, k);
	//   20   39:aload_1         
	//   21   40:iload           4
	//   22   42:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   23   45:istore_2        
		}
	//*  24   46:goto            7
		a.E(parcel, j);
	//   25   49:aload_1         
	//   26   50:iload_3         
	//   27   51:invokestatic    #41  <Method void a.E(Parcel, int)>
		return ((Object) (new zzyv(i)));
	//   28   54:new             #43  <Class zzyv>
	//   29   57:dup             
	//   30   58:iload_2         
	//   31   59:invokespecial   #46  <Method void zzyv(int)>
	//   32   62:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzyv[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzyv[]
	//    2    4:areturn         
	}
}
