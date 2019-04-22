// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			ValidateAccountRequest

public class ValidateAccountRequestCreator
	implements android.os.Parcelable.Creator
{

	public ValidateAccountRequestCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ValidateAccountRequest createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		while(parcel.dataPosition() < j) 
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*   7   11:iload_3         
	//*   8   12:icmpge          49
		{
			int k = SafeParcelReader.readHeader(parcel);
	//    9   15:aload_1         
	//   10   16:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   11   19:istore          4
			if(SafeParcelReader.getFieldId(k) != 1)
	//*  12   21:iload           4
	//*  13   23:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
	//*  14   26:iconst_1        
	//*  15   27:icmpeq          39
				SafeParcelReader.skipUnknownField(parcel, k);
	//   16   30:aload_1         
	//   17   31:iload           4
	//   18   33:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
			else
	//*  19   36:goto            7
				i = SafeParcelReader.readInt(parcel, k);
	//   20   39:aload_1         
	//   21   40:iload           4
	//   22   42:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   23   45:istore_2        
		}
	//*  24   46:goto            7
		SafeParcelReader.ensureAtEnd(parcel, j);
	//   25   49:aload_1         
	//   26   50:iload_3         
	//   27   51:invokestatic    #47  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
		return new ValidateAccountRequest(i);
	//   28   54:new             #49  <Class ValidateAccountRequest>
	//   29   57:dup             
	//   30   58:iload_2         
	//   31   59:invokespecial   #52  <Method void ValidateAccountRequest(int)>
	//   32   62:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method ValidateAccountRequest createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ValidateAccountRequest[] newArray(int i)
	{
		return new ValidateAccountRequest[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ValidateAccountRequest[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method ValidateAccountRequest[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
