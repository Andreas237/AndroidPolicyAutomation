// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwb, zzavh

public final class ug
	implements android.os.Parcelable.Creator
{

	public ug()
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
		zzwb zzwb1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		String s = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*   9   15:iload_2         
	//*  10   16:icmpge          86
			{
				int j = a.a(parcel);
	//   11   19:aload_1         
	//   12   20:invokestatic    #28  <Method int a.a(Parcel)>
	//   13   23:istore_3        
				switch(a.a(j))
	//*  14   24:iload_3         
	//*  15   25:invokestatic    #31  <Method int a.a(int)>
				{
	//*  16   28:tableswitch     2 3: default 52
	//	               2 70
	//	               3 60
				default:
					a.b(parcel, j);
	//   17   52:aload_1         
	//   18   53:iload_3         
	//   19   54:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  20   57:goto            11
				case 3: // '\003'
					s = a.n(parcel, j);
	//   21   60:aload_1         
	//   22   61:iload_3         
	//   23   62:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   24   65:astore          4
					break;

	//*  25   67:goto            11
				case 2: // '\002'
					zzwb1 = (zzwb)a.a(parcel, j, zzwb.CREATOR);
	//   26   70:aload_1         
	//   27   71:iload_3         
	//   28   72:getstatic       #44  <Field android.os.Parcelable$Creator zzwb.CREATOR>
	//   29   75:invokestatic    #47  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   30   78:checkcast       #40  <Class zzwb>
	//   31   81:astore          5
					break;
				}
			} else
	//*  32   83:goto            11
			{
				a.E(parcel, i);
	//   33   86:aload_1         
	//   34   87:iload_2         
	//   35   88:invokestatic    #50  <Method void a.E(Parcel, int)>
				return ((Object) (new zzavh(zzwb1, s)));
	//   36   91:new             #52  <Class zzavh>
	//   37   94:dup             
	//   38   95:aload           5
	//   39   97:aload           4
	//   40   99:invokespecial   #55  <Method void zzavh(zzwb, String)>
	//   41  102:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzavh[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzavh[]
	//    2    4:areturn         
	}
}
