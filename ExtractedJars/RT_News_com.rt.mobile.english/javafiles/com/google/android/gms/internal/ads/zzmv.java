// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmu

public final class zzmv
	implements android.os.Parcelable.Creator
{

	public zzmv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          6
		boolean flag1 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		boolean flag = flag1;
	//    7   11:iload           5
	//    8   13:istore          4
		do
			if(parcel.dataPosition() < i)
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*  11   19:iload_2         
	//*  12   20:icmpge          98
			{
				int j = SafeParcelReader.readHeader(parcel);
	//   13   23:aload_1         
	//   14   24:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   27:istore_3        
				switch(SafeParcelReader.getFieldId(j))
	//*  16   28:iload_3         
	//*  17   29:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   32:tableswitch     2 4: default 60
	//	               2 88
	//	               3 78
	//	               4 68
				default:
					SafeParcelReader.skipUnknownField(parcel, j);
	//   19   60:aload_1         
	//   20   61:iload_3         
	//   21   62:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   65:goto            15
				case 4: // '\004'
					flag = SafeParcelReader.readBoolean(parcel, j);
	//   23   68:aload_1         
	//   24   69:iload_3         
	//   25   70:invokestatic    #41  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   26   73:istore          4
					break;

	//*  27   75:goto            15
				case 3: // '\003'
					flag1 = SafeParcelReader.readBoolean(parcel, j);
	//   28   78:aload_1         
	//   29   79:iload_3         
	//   30   80:invokestatic    #41  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   31   83:istore          5
					break;

	//*  32   85:goto            15
				case 2: // '\002'
					flag2 = SafeParcelReader.readBoolean(parcel, j);
	//   33   88:aload_1         
	//   34   89:iload_3         
	//   35   90:invokestatic    #41  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   36   93:istore          6
					break;
				}
			} else
	//*  37   95:goto            15
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   38   98:aload_1         
	//   39   99:iload_2         
	//   40  100:invokestatic    #44  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzmu(flag2, flag1, flag)));
	//   41  103:new             #46  <Class zzmu>
	//   42  106:dup             
	//   43  107:iload           6
	//   44  109:iload           5
	//   45  111:iload           4
	//   46  113:invokespecial   #49  <Method void zzmu(boolean, boolean, boolean)>
	//   47  116:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzmu[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzmu[]
	//    2    4:areturn         
	}
}
