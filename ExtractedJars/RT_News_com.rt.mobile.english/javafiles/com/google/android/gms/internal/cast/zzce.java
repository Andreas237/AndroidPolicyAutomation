// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcd

public final class zzce
	implements android.os.Parcelable.Creator
{

	public zzce()
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
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(parcel.dataPosition() < i) 
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   7   12:iload_2         
	//*   8   13:icmpge          47
		{
			int j = SafeParcelReader.readHeader(parcel);
	//    9   16:aload_1         
	//   10   17:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   11   20:istore_3        
			if(SafeParcelReader.getFieldId(j) != 2)
	//*  12   21:iload_3         
	//*  13   22:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
	//*  14   25:iconst_2        
	//*  15   26:icmpeq          37
				SafeParcelReader.skipUnknownField(parcel, j);
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
			else
	//*  19   34:goto            8
				s = SafeParcelReader.createString(parcel, j);
	//   20   37:aload_1         
	//   21   38:iload_3         
	//   22   39:invokestatic    #41  <Method String SafeParcelReader.createString(Parcel, int)>
	//   23   42:astore          4
		}
	//*  24   44:goto            8
		SafeParcelReader.ensureAtEnd(parcel, i);
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:invokestatic    #44  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
		return ((Object) (new zzcd(s)));
	//   28   52:new             #46  <Class zzcd>
	//   29   55:dup             
	//   30   56:aload           4
	//   31   58:invokespecial   #49  <Method void zzcd(String)>
	//   32   61:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzcd[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzcd[]
	//    2    4:areturn         
	}
}
