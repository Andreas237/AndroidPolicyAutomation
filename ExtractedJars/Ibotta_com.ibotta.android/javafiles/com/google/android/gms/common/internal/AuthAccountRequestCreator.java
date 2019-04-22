// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			AuthAccountRequest

public class AuthAccountRequestCreator
	implements android.os.Parcelable.Creator
{

	public AuthAccountRequestCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public AuthAccountRequest createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		android.os.IBinder ibinder = null;
	//    3    5:aconst_null     
	//    4    6:astore          9
		Scope ascope[] = ((Scope []) (ibinder));
	//    5    8:aload           9
	//    6   10:astore          5
		Object obj = ((Object) (ascope));
	//    7   12:aload           5
	//    8   14:astore          6
		Object obj1 = obj;
	//    9   16:aload           6
	//   10   18:astore          7
		Object obj2 = obj1;
	//   11   20:aload           7
	//   12   22:astore          8
		int i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*  15   26:aload_1         
	//*  16   27:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  17   30:iload_3         
	//*  18   31:icmpge          170
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   19   34:aload_1         
	//   20   35:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   21   38:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  22   40:iload           4
	//*  23   42:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  24   45:tableswitch     1 6: default 84
	//	               1 160
	//	               2 149
	//	               3 132
	//	               4 121
	//	               5 110
	//	               6 93
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   25   84:aload_1         
	//   26   85:iload           4
	//   27   87:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  28   90:goto            26
				case 6: // '\006'
					obj2 = ((Object) ((Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR)));
	//   29   93:aload_1         
	//   30   94:iload           4
	//   31   96:getstatic       #46  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   32   99:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   33  102:checkcast       #42  <Class Account>
	//   34  105:astore          8
					break;

	//*  35  107:goto            26
				case 5: // '\005'
					obj1 = ((Object) (SafeParcelReader.readIntegerObject(parcel, k)));
	//   36  110:aload_1         
	//   37  111:iload           4
	//   38  113:invokestatic    #54  <Method Integer SafeParcelReader.readIntegerObject(Parcel, int)>
	//   39  116:astore          7
					break;

	//*  40  118:goto            26
				case 4: // '\004'
					obj = ((Object) (SafeParcelReader.readIntegerObject(parcel, k)));
	//   41  121:aload_1         
	//   42  122:iload           4
	//   43  124:invokestatic    #54  <Method Integer SafeParcelReader.readIntegerObject(Parcel, int)>
	//   44  127:astore          6
					break;

	//*  45  129:goto            26
				case 3: // '\003'
					ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, k, Scope.CREATOR);
	//   46  132:aload_1         
	//   47  133:iload           4
	//   48  135:getstatic       #57  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   49  138:invokestatic    #61  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   50  141:checkcast       #63  <Class Scope[]>
	//   51  144:astore          5
					break;

	//*  52  146:goto            26
				case 2: // '\002'
					ibinder = SafeParcelReader.readIBinder(parcel, k);
	//   53  149:aload_1         
	//   54  150:iload           4
	//   55  152:invokestatic    #67  <Method android.os.IBinder SafeParcelReader.readIBinder(Parcel, int)>
	//   56  155:astore          9
					break;

	//*  57  157:goto            26
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   58  160:aload_1         
	//   59  161:iload           4
	//   60  163:invokestatic    #71  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   61  166:istore_2        
					break;
				}
			} else
	//*  62  167:goto            26
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   63  170:aload_1         
	//   64  171:iload_3         
	//   65  172:invokestatic    #74  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new AuthAccountRequest(i, ibinder, ascope, ((Integer) (obj)), ((Integer) (obj1)), ((Account) (obj2)));
	//   66  175:new             #76  <Class AuthAccountRequest>
	//   67  178:dup             
	//   68  179:iload_2         
	//   69  180:aload           9
	//   70  182:aload           5
	//   71  184:aload           6
	//   72  186:aload           7
	//   73  188:aload           8
	//   74  190:invokespecial   #79  <Method void AuthAccountRequest(int, android.os.IBinder, Scope[], Integer, Integer, Account)>
	//   75  193:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method AuthAccountRequest createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public AuthAccountRequest[] newArray(int i)
	{
		return new AuthAccountRequest[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AuthAccountRequest[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #87  <Method AuthAccountRequest[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
