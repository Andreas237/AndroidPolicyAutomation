// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaig

public final class zzaih
	implements android.os.Parcelable.Creator
{

	public zzaih()
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
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          82
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   13   22:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  16   29:tableswitch     2 3: default 52
	//	               2 71
	//	               3 61
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, k);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:invokestatic    #41  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   24   67:istore_2        
					break;

	//*  25   68:goto            10
				case 2: // '\002'
					s = SafeParcelReader.createString(parcel, k);
	//   26   71:aload_1         
	//   27   72:iload           4
	//   28   74:invokestatic    #45  <Method String SafeParcelReader.createString(Parcel, int)>
	//   29   77:astore          5
					break;
				}
			} else
	//*  30   79:goto            10
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   31   82:aload_1         
	//   32   83:iload_3         
	//   33   84:invokestatic    #48  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzaig(s, i)));
	//   34   87:new             #50  <Class zzaig>
	//   35   90:dup             
	//   36   91:aload           5
	//   37   93:iload_2         
	//   38   94:invokespecial   #53  <Method void zzaig(String, int)>
	//   39   97:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzaig[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzaig[]
	//    2    4:areturn         
	}
}
