// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhi

public final class zzhj
	implements android.os.Parcelable.Creator
{

	public zzhj()
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
		ParcelFileDescriptor parcelfiledescriptor = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(parcel.dataPosition() < i) 
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   7   12:iload_2         
	//*   8   13:icmpge          53
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
				parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, j, ParcelFileDescriptor.CREATOR);
	//   20   37:aload_1         
	//   21   38:iload_3         
	//   22   39:getstatic       #43  <Field android.os.Parcelable$Creator ParcelFileDescriptor.CREATOR>
	//   23   42:invokestatic    #47  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   24   45:checkcast       #39  <Class ParcelFileDescriptor>
	//   25   48:astore          4
		}
	//*  26   50:goto            8
		SafeParcelReader.ensureAtEnd(parcel, i);
	//   27   53:aload_1         
	//   28   54:iload_2         
	//   29   55:invokestatic    #50  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
		return ((Object) (new zzhi(parcelfiledescriptor)));
	//   30   58:new             #52  <Class zzhi>
	//   31   61:dup             
	//   32   62:aload           4
	//   33   64:invokespecial   #55  <Method void zzhi(ParcelFileDescriptor)>
	//   34   67:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzhi[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzhi[]
	//    2    4:areturn         
	}
}
