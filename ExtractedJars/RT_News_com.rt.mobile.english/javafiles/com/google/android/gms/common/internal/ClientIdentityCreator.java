// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			ClientIdentity

public class ClientIdentityCreator
	implements android.os.Parcelable.Creator
{

	public ClientIdentityCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ClientIdentity createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		String s = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          82
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   13   22:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  16   29:tableswitch     1 2: default 52
	//	               1 72
	//	               2 61
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 2: // '\002'
					s = SafeParcelReader.createString(parcel, k);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   24   67:astore          5
					break;

	//*  25   69:goto            10
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   26   72:aload_1         
	//   27   73:iload           4
	//   28   75:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   29   78:istore_2        
					break;
				}
			} else
	//*  30   79:goto            10
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   31   82:aload_1         
	//   32   83:iload_3         
	//   33   84:invokestatic    #51  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ClientIdentity(i, s);
	//   34   87:new             #53  <Class ClientIdentity>
	//   35   90:dup             
	//   36   91:iload_2         
	//   37   92:aload           5
	//   38   94:invokespecial   #56  <Method void ClientIdentity(int, String)>
	//   39   97:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method ClientIdentity createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ClientIdentity[] newArray(int i)
	{
		return new ClientIdentity[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ClientIdentity[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #64  <Method ClientIdentity[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
