// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatt

public final class zzatu
	implements android.os.Parcelable.Creator
{

	public zzatu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		String s1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		String s = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          101
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   25:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 91
	//	               2 80
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					s = SafeParcelReader.createString(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #41  <Method String SafeParcelReader.createString(Parcel, int)>
	//   26   75:astore          5
					break;

	//*  27   77:goto            13
				case 2: // '\002'
					s1 = SafeParcelReader.createString(parcel, k);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:invokestatic    #41  <Method String SafeParcelReader.createString(Parcel, int)>
	//   31   86:astore          6
					break;

	//*  32   88:goto            13
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   33   91:aload_1         
	//   34   92:iload           4
	//   35   94:invokestatic    #45  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   36   97:istore_2        
					break;
				}
			} else
	//*  37   98:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   38  101:aload_1         
	//   39  102:iload_3         
	//   40  103:invokestatic    #48  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzatt(i, s1, s)));
	//   41  106:new             #50  <Class zzatt>
	//   42  109:dup             
	//   43  110:iload_2         
	//   44  111:aload           6
	//   45  113:aload           5
	//   46  115:invokespecial   #53  <Method void zzatt(int, String, String)>
	//   47  118:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzatt[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzatt[]
	//    2    4:areturn         
	}
}
