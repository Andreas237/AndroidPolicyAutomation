// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzawd

public final class vc
	implements android.os.Parcelable.Creator
{

	public vc()
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
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          82
			{
				int k = a.a(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #28  <Method int a.a(Parcel)>
	//   13   22:istore          4
				switch(a.a(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #31  <Method int a.a(int)>
				{
	//*  16   29:tableswitch     2 3: default 52
	//	               2 71
	//	               3 61
				default:
					a.b(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 3: // '\003'
					i = a.d(parcel, k);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   24   67:istore_2        
					break;

	//*  25   68:goto            10
				case 2: // '\002'
					s = a.n(parcel, k);
	//   26   71:aload_1         
	//   27   72:iload           4
	//   28   74:invokestatic    #42  <Method String a.n(Parcel, int)>
	//   29   77:astore          5
					break;
				}
			} else
	//*  30   79:goto            10
			{
				a.E(parcel, j);
	//   31   82:aload_1         
	//   32   83:iload_3         
	//   33   84:invokestatic    #45  <Method void a.E(Parcel, int)>
				return ((Object) (new zzawd(s, i)));
	//   34   87:new             #47  <Class zzawd>
	//   35   90:dup             
	//   36   91:aload           5
	//   37   93:iload_2         
	//   38   94:invokespecial   #50  <Method void zzawd(String, int)>
	//   39   97:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzawd[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzawd[]
	//    2    4:areturn         
	}
}
