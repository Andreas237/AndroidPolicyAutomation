// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzw

public final class bzk
	implements android.os.Parcelable.Creator
{

	public bzk()
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
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          6
		boolean flag1 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          4
		do
			if(parcel.dataPosition() < i)
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  11   18:iload_2         
	//*  12   19:icmpge          94
			{
				int j = a.a(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #28  <Method int a.a(Parcel)>
	//   15   26:istore_3        
				switch(a.a(j))
	//*  16   27:iload_3         
	//*  17   28:invokestatic    #31  <Method int a.a(int)>
				{
	//*  18   31:tableswitch     2 4: default 56
	//	               2 84
	//	               3 74
	//	               4 64
				default:
					a.b(parcel, j);
	//   19   56:aload_1         
	//   20   57:iload_3         
	//   21   58:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  22   61:goto            14
				case 4: // '\004'
					flag = a.c(parcel, j);
	//   23   64:aload_1         
	//   24   65:iload_3         
	//   25   66:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   26   69:istore          4
					break;

	//*  27   71:goto            14
				case 3: // '\003'
					flag1 = a.c(parcel, j);
	//   28   74:aload_1         
	//   29   75:iload_3         
	//   30   76:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   31   79:istore          5
					break;

	//*  32   81:goto            14
				case 2: // '\002'
					flag2 = a.c(parcel, j);
	//   33   84:aload_1         
	//   34   85:iload_3         
	//   35   86:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   36   89:istore          6
					break;
				}
			} else
	//*  37   91:goto            14
			{
				a.E(parcel, i);
	//   38   94:aload_1         
	//   39   95:iload_2         
	//   40   96:invokestatic    #41  <Method void a.E(Parcel, int)>
				return ((Object) (new zzzw(flag2, flag1, flag)));
	//   41   99:new             #43  <Class zzzw>
	//   42  102:dup             
	//   43  103:iload           6
	//   44  105:iload           5
	//   45  107:iload           4
	//   46  109:invokespecial   #46  <Method void zzzw(boolean, boolean, boolean)>
	//   47  112:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzzw[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzzw[]
	//    2    4:areturn         
	}
}
