// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			ResolveAccountResponse

public class ResolveAccountResponseCreator
	implements android.os.Parcelable.Creator
{

	public ResolveAccountResponseCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ResolveAccountResponse createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		android.os.IBinder ibinder = null;
	//    3    5:aconst_null     
	//    4    6:astore          8
		Object obj = ((Object) (ibinder));
	//    5    8:aload           8
	//    6   10:astore          7
		int i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		boolean flag1 = false;
	//    9   14:iconst_0        
	//   10   15:istore          6
		boolean flag = false;
	//   11   17:iconst_0        
	//   12   18:istore          5
		do
			if(parcel.dataPosition() < j)
	//*  13   20:aload_1         
	//*  14   21:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  15   24:iload_3         
	//*  16   25:icmpge          141
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   17   28:aload_1         
	//   18   29:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   19   32:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  20   34:iload           4
	//*  21   36:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  22   39:tableswitch     1 5: default 72
	//	               1 131
	//	               2 120
	//	               3 103
	//	               4 92
	//	               5 81
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   23   72:aload_1         
	//   24   73:iload           4
	//   25   75:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  26   78:goto            20
				case 5: // '\005'
					flag = SafeParcelReader.readBoolean(parcel, k);
	//   27   81:aload_1         
	//   28   82:iload           4
	//   29   84:invokestatic    #44  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   30   87:istore          5
					break;

	//*  31   89:goto            20
				case 4: // '\004'
					flag1 = SafeParcelReader.readBoolean(parcel, k);
	//   32   92:aload_1         
	//   33   93:iload           4
	//   34   95:invokestatic    #44  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   35   98:istore          6
					break;

	//*  36  100:goto            20
				case 3: // '\003'
					obj = ((Object) ((ConnectionResult)SafeParcelReader.createParcelable(parcel, k, ConnectionResult.CREATOR)));
	//   37  103:aload_1         
	//   38  104:iload           4
	//   39  106:getstatic       #50  <Field android.os.Parcelable$Creator ConnectionResult.CREATOR>
	//   40  109:invokestatic    #54  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   41  112:checkcast       #46  <Class ConnectionResult>
	//   42  115:astore          7
					break;

	//*  43  117:goto            20
				case 2: // '\002'
					ibinder = SafeParcelReader.readIBinder(parcel, k);
	//   44  120:aload_1         
	//   45  121:iload           4
	//   46  123:invokestatic    #58  <Method android.os.IBinder SafeParcelReader.readIBinder(Parcel, int)>
	//   47  126:astore          8
					break;

	//*  48  128:goto            20
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   49  131:aload_1         
	//   50  132:iload           4
	//   51  134:invokestatic    #62  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   52  137:istore_2        
					break;
				}
			} else
	//*  53  138:goto            20
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   54  141:aload_1         
	//   55  142:iload_3         
	//   56  143:invokestatic    #65  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ResolveAccountResponse(i, ibinder, ((ConnectionResult) (obj)), flag1, flag);
	//   57  146:new             #67  <Class ResolveAccountResponse>
	//   58  149:dup             
	//   59  150:iload_2         
	//   60  151:aload           8
	//   61  153:aload           7
	//   62  155:iload           6
	//   63  157:iload           5
	//   64  159:invokespecial   #70  <Method void ResolveAccountResponse(int, android.os.IBinder, ConnectionResult, boolean, boolean)>
	//   65  162:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method ResolveAccountResponse createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ResolveAccountResponse[] newArray(int i)
	{
		return new ResolveAccountResponse[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ResolveAccountResponse[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #78  <Method ResolveAccountResponse[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
