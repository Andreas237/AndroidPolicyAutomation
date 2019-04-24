// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			ResolveAccountRequest

public class ResolveAccountRequestCreator
	implements android.os.Parcelable.Creator
{

	public ResolveAccountRequestCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ResolveAccountRequest createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		Account account = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		GoogleSignInAccount googlesigninaccount = null;
	//    7   11:aconst_null     
	//    8   12:astore          6
		int i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		do
			if(parcel.dataPosition() < k)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  13   20:iload           4
	//*  14   22:icmpge          131
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   17   29:istore          5
				switch(SafeParcelReader.getFieldId(l))
	//*  18   31:iload           5
	//*  19   33:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  20   36:tableswitch     1 4: default 68
	//	               1 121
	//	               2 104
	//	               3 94
	//	               4 77
				default:
					SafeParcelReader.skipUnknownField(parcel, l);
	//   21   68:aload_1         
	//   22   69:iload           5
	//   23   71:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  24   74:goto            16
				case 4: // '\004'
					googlesigninaccount = (GoogleSignInAccount)SafeParcelReader.createParcelable(parcel, l, GoogleSignInAccount.CREATOR);
	//   25   77:aload_1         
	//   26   78:iload           5
	//   27   80:getstatic       #46  <Field android.os.Parcelable$Creator GoogleSignInAccount.CREATOR>
	//   28   83:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   29   86:checkcast       #42  <Class GoogleSignInAccount>
	//   30   89:astore          6
					break;

	//*  31   91:goto            16
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, l);
	//   32   94:aload_1         
	//   33   95:iload           5
	//   34   97:invokestatic    #54  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   35  100:istore_2        
					break;

	//*  36  101:goto            16
				case 2: // '\002'
					account = (Account)SafeParcelReader.createParcelable(parcel, l, Account.CREATOR);
	//   37  104:aload_1         
	//   38  105:iload           5
	//   39  107:getstatic       #57  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   40  110:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   41  113:checkcast       #56  <Class Account>
	//   42  116:astore          7
					break;

	//*  43  118:goto            16
				case 1: // '\001'
					j = SafeParcelReader.readInt(parcel, l);
	//   44  121:aload_1         
	//   45  122:iload           5
	//   46  124:invokestatic    #54  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   47  127:istore_3        
					break;
				}
			} else
	//*  48  128:goto            16
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   49  131:aload_1         
	//   50  132:iload           4
	//   51  134:invokestatic    #60  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ResolveAccountRequest(j, account, i, googlesigninaccount);
	//   52  137:new             #62  <Class ResolveAccountRequest>
	//   53  140:dup             
	//   54  141:iload_3         
	//   55  142:aload           7
	//   56  144:iload_2         
	//   57  145:aload           6
	//   58  147:invokespecial   #65  <Method void ResolveAccountRequest(int, Account, int, GoogleSignInAccount)>
	//   59  150:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method ResolveAccountRequest createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ResolveAccountRequest[] newArray(int i)
	{
		return new ResolveAccountRequest[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ResolveAccountRequest[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #73  <Method ResolveAccountRequest[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
