// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzt

public final class zzzu
	implements android.os.Parcelable.Creator
{

	public zzzu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int l = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i = j;
	//    7   11:iload_3         
	//    8   12:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*  11   17:iload           5
	//*  12   19:icmpge          100
			{
				int i1 = SafeParcelReader.readHeader(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   26:istore          6
				switch(SafeParcelReader.getFieldId(i1))
	//*  16   28:iload           6
	//*  17   30:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 89
	//	               2 79
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, i1);
	//   19   60:aload_1         
	//   20   61:iload           6
	//   21   63:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, i1);
	//   23   69:aload_1         
	//   24   70:iload           6
	//   25   72:invokestatic    #41  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					j = SafeParcelReader.readInt(parcel, i1);
	//   28   79:aload_1         
	//   29   80:iload           6
	//   30   82:invokestatic    #41  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   31   85:istore_3        
					break;

	//*  32   86:goto            13
				case 1: // '\001'
					k = SafeParcelReader.readInt(parcel, i1);
	//   33   89:aload_1         
	//   34   90:iload           6
	//   35   92:invokestatic    #41  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   36   95:istore          4
					break;
				}
			} else
	//*  37   97:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, l);
	//   38  100:aload_1         
	//   39  101:iload           5
	//   40  103:invokestatic    #44  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzzt(k, j, i)));
	//   41  106:new             #46  <Class zzzt>
	//   42  109:dup             
	//   43  110:iload           4
	//   44  112:iload_3         
	//   45  113:iload_2         
	//   46  114:invokespecial   #49  <Method void zzzt(int, int, int)>
	//   47  117:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzzt[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzzt[]
	//    2    4:areturn         
	}
}
