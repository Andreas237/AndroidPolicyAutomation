// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatm

public final class sk
	implements android.os.Parcelable.Creator
{

	public sk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore_2        
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(parcel.dataPosition() < i) 
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*   7   12:iload_2         
	//*   8   13:icmpge          47
		{
			int j = a.a(parcel);
	//    9   16:aload_1         
	//   10   17:invokestatic    #28  <Method int a.a(Parcel)>
	//   11   20:istore_3        
			if(a.a(j) != 2)
	//*  12   21:iload_3         
	//*  13   22:invokestatic    #31  <Method int a.a(int)>
	//*  14   25:iconst_2        
	//*  15   26:icmpeq          37
				a.b(parcel, j);
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokestatic    #34  <Method void a.b(Parcel, int)>
			else
	//*  19   34:goto            8
				s = a.n(parcel, j);
	//   20   37:aload_1         
	//   21   38:iload_3         
	//   22   39:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   23   42:astore          4
		}
	//*  24   44:goto            8
		a.E(parcel, i);
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:invokestatic    #41  <Method void a.E(Parcel, int)>
		return ((Object) (new zzatm(s)));
	//   28   52:new             #43  <Class zzatm>
	//   29   55:dup             
	//   30   56:aload           4
	//   31   58:invokespecial   #46  <Method void zzatm(String)>
	//   32   61:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzatm[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzatm[]
	//    2    4:areturn         
	}
}
