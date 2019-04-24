// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlu

public final class zzlv
	implements android.os.Parcelable.Creator
{

	public zzlv()
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
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		while(parcel.dataPosition() < j) 
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   7   11:iload_3         
	//*   8   12:icmpge          49
		{
			int k = SafeParcelReader.readHeader(parcel);
	//    9   15:aload_1         
	//   10   16:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   11   19:istore          4
			if(SafeParcelReader.getFieldId(k) != 2)
	//*  12   21:iload           4
	//*  13   23:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
	//*  14   26:iconst_2        
	//*  15   27:icmpeq          39
				SafeParcelReader.skipUnknownField(parcel, k);
	//   16   30:aload_1         
	//   17   31:iload           4
	//   18   33:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
			else
	//*  19   36:goto            7
				i = SafeParcelReader.readInt(parcel, k);
	//   20   39:aload_1         
	//   21   40:iload           4
	//   22   42:invokestatic    #41  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   23   45:istore_2        
		}
	//*  24   46:goto            7
		SafeParcelReader.ensureAtEnd(parcel, j);
	//   25   49:aload_1         
	//   26   50:iload_3         
	//   27   51:invokestatic    #44  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
		return ((Object) (new zzlu(i)));
	//   28   54:new             #46  <Class zzlu>
	//   29   57:dup             
	//   30   58:iload_2         
	//   31   59:invokespecial   #49  <Method void zzlu(int)>
	//   32   62:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzlu[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzlu[]
	//    2    4:areturn         
	}
}
