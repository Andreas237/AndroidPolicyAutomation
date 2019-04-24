// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			SignInButtonConfig

public class SignInButtonConfigCreator
	implements android.os.Parcelable.Creator
{

	public SignInButtonConfigCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public SignInButtonConfig createFromParcel(Parcel parcel)
	{
		int l = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Scope ascope[] = null;
	//    7   11:aconst_null     
	//    8   12:astore          7
		int j = i;
	//    9   14:iload_2         
	//   10   15:istore_3        
		do
			if(parcel.dataPosition() < l)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  13   20:iload           5
	//*  14   22:icmpge          125
			{
				int i1 = SafeParcelReader.readHeader(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   17   29:istore          6
				switch(SafeParcelReader.getFieldId(i1))
	//*  18   31:iload           6
	//*  19   33:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  20   36:tableswitch     1 4: default 68
	//	               1 114
	//	               2 104
	//	               3 94
	//	               4 77
				default:
					SafeParcelReader.skipUnknownField(parcel, i1);
	//   21   68:aload_1         
	//   22   69:iload           6
	//   23   71:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  24   74:goto            16
				case 4: // '\004'
					ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, i1, Scope.CREATOR);
	//   25   77:aload_1         
	//   26   78:iload           6
	//   27   80:getstatic       #46  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   28   83:invokestatic    #50  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   29   86:checkcast       #52  <Class Scope[]>
	//   30   89:astore          7
					break;

	//*  31   91:goto            16
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, i1);
	//   32   94:aload_1         
	//   33   95:iload           6
	//   34   97:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   35  100:istore_2        
					break;

	//*  36  101:goto            16
				case 2: // '\002'
					j = SafeParcelReader.readInt(parcel, i1);
	//   37  104:aload_1         
	//   38  105:iload           6
	//   39  107:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   40  110:istore_3        
					break;

	//*  41  111:goto            16
				case 1: // '\001'
					k = SafeParcelReader.readInt(parcel, i1);
	//   42  114:aload_1         
	//   43  115:iload           6
	//   44  117:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   45  120:istore          4
					break;
				}
			} else
	//*  46  122:goto            16
			{
				SafeParcelReader.ensureAtEnd(parcel, l);
	//   47  125:aload_1         
	//   48  126:iload           5
	//   49  128:invokestatic    #59  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new SignInButtonConfig(k, j, i, ascope);
	//   50  131:new             #61  <Class SignInButtonConfig>
	//   51  134:dup             
	//   52  135:iload           4
	//   53  137:iload_3         
	//   54  138:iload_2         
	//   55  139:aload           7
	//   56  141:invokespecial   #64  <Method void SignInButtonConfig(int, int, int, Scope[])>
	//   57  144:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method SignInButtonConfig createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public SignInButtonConfig[] newArray(int i)
	{
		return new SignInButtonConfig[i];
	//    0    0:iload_1         
	//    1    1:anewarray       SignInButtonConfig[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #72  <Method SignInButtonConfig[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
