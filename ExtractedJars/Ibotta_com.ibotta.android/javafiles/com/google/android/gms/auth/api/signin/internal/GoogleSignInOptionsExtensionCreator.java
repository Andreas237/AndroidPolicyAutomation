// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			GoogleSignInOptionsExtensionParcelable

public class GoogleSignInOptionsExtensionCreator
	implements android.os.Parcelable.Creator
{

	public GoogleSignInOptionsExtensionCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		android.os.Bundle bundle = null;
	//    5    8:aconst_null     
	//    6    9:astore          6
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		do
			if(parcel.dataPosition() < k)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  11   17:iload           4
	//*  12   19:icmpge          100
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   26:istore          5
				switch(SafeParcelReader.getFieldId(l))
	//*  16   28:iload           5
	//*  17   30:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 90
	//	               2 80
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, l);
	//   19   60:aload_1         
	//   20   61:iload           5
	//   21   63:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					bundle = SafeParcelReader.createBundle(parcel, l);
	//   23   69:aload_1         
	//   24   70:iload           5
	//   25   72:invokestatic    #44  <Method android.os.Bundle SafeParcelReader.createBundle(Parcel, int)>
	//   26   75:astore          6
					break;

	//*  27   77:goto            13
				case 2: // '\002'
					i = SafeParcelReader.readInt(parcel, l);
	//   28   80:aload_1         
	//   29   81:iload           5
	//   30   83:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   31   86:istore_2        
					break;

	//*  32   87:goto            13
				case 1: // '\001'
					j = SafeParcelReader.readInt(parcel, l);
	//   33   90:aload_1         
	//   34   91:iload           5
	//   35   93:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   36   96:istore_3        
					break;
				}
			} else
	//*  37   97:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   38  100:aload_1         
	//   39  101:iload           4
	//   40  103:invokestatic    #51  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new GoogleSignInOptionsExtensionParcelable(j, i, bundle);
	//   41  106:new             #53  <Class GoogleSignInOptionsExtensionParcelable>
	//   42  109:dup             
	//   43  110:iload_3         
	//   44  111:iload_2         
	//   45  112:aload           6
	//   46  114:invokespecial   #56  <Method void GoogleSignInOptionsExtensionParcelable(int, int, android.os.Bundle)>
	//   47  117:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GoogleSignInOptionsExtensionParcelable[] newArray(int i)
	{
		return new GoogleSignInOptionsExtensionParcelable[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GoogleSignInOptionsExtensionParcelable[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #64  <Method GoogleSignInOptionsExtensionParcelable[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
