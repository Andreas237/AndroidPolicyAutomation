// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common:
//			Feature

public class FeatureCreator
	implements android.os.Parcelable.Creator
{

	public FeatureCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public Feature createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          7
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		long l = -1L;
	//    7   10:ldc2w           #24  <Long -1L>
	//    8   13:lstore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #31  <Method int Parcel.dataPosition()>
	//*  11   19:iload_3         
	//*  12   20:icmpge          101
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   13   23:aload_1         
	//   14   24:invokestatic    #34  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   27:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  16   29:iload           4
	//*  17   31:invokestatic    #38  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   34:tableswitch     1 3: default 60
	//	               1 90
	//	               2 80
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #42  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            15
				case 3: // '\003'
					l = SafeParcelReader.readLong(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #46  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   26   75:lstore          5
					break;

	//*  27   77:goto            15
				case 2: // '\002'
					i = SafeParcelReader.readInt(parcel, k);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:invokestatic    #50  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   31   86:istore_2        
					break;

	//*  32   87:goto            15
				case 1: // '\001'
					s = SafeParcelReader.createString(parcel, k);
	//   33   90:aload_1         
	//   34   91:iload           4
	//   35   93:invokestatic    #54  <Method String SafeParcelReader.createString(Parcel, int)>
	//   36   96:astore          7
					break;
				}
			} else
	//*  37   98:goto            15
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   38  101:aload_1         
	//   39  102:iload_3         
	//   40  103:invokestatic    #57  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new Feature(s, i, l);
	//   41  106:new             #59  <Class Feature>
	//   42  109:dup             
	//   43  110:aload           7
	//   44  112:iload_2         
	//   45  113:lload           5
	//   46  115:invokespecial   #62  <Method void Feature(String, int, long)>
	//   47  118:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method Feature createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public Feature[] newArray(int i)
	{
		return new Feature[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Feature[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method Feature[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
