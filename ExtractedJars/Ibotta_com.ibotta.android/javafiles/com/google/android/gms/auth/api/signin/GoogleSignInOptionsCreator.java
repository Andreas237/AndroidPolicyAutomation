// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInOptions

public class GoogleSignInOptionsCreator
	implements android.os.Parcelable.Creator
{

	public GoogleSignInOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GoogleSignInOptions createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		java.util.ArrayList arraylist = null;
	//    3    5:aconst_null     
	//    4    6:astore          12
		Object obj = ((Object) (arraylist));
	//    5    8:aload           12
	//    6   10:astore          8
		Object obj1 = obj;
	//    7   12:aload           8
	//    8   14:astore          9
		Object obj2 = obj1;
	//    9   16:aload           9
	//   10   18:astore          10
		Object obj3 = obj2;
	//   11   20:aload           10
	//   12   22:astore          11
		int i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		boolean flag2 = false;
	//   15   26:iconst_0        
	//   16   27:istore          7
		boolean flag1 = false;
	//   17   29:iconst_0        
	//   18   30:istore          6
		boolean flag = false;
	//   19   32:iconst_0        
	//   20   33:istore          5
		do
			if(parcel.dataPosition() < j)
	//*  21   35:aload_1         
	//*  22   36:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  23   39:iload_3         
	//*  24   40:icmpge          223
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   25   43:aload_1         
	//   26   44:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   27   47:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  28   49:iload           4
	//*  29   51:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  30   54:tableswitch     1 9: default 104
	//	               1 213
	//	               2 199
	//	               3 182
	//	               4 171
	//	               5 160
	//	               6 149
	//	               7 138
	//	               8 127
	//	               9 113
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   31  104:aload_1         
	//   32  105:iload           4
	//   33  107:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  34  110:goto            35
				case 9: // '\t'
					obj3 = ((Object) (SafeParcelReader.createTypedList(parcel, k, GoogleSignInOptionsExtensionParcelable.CREATOR)));
	//   35  113:aload_1         
	//   36  114:iload           4
	//   37  116:getstatic       #46  <Field android.os.Parcelable$Creator GoogleSignInOptionsExtensionParcelable.CREATOR>
	//   38  119:invokestatic    #50  <Method java.util.ArrayList SafeParcelReader.createTypedList(Parcel, int, android.os.Parcelable$Creator)>
	//   39  122:astore          11
					break;

	//*  40  124:goto            35
				case 8: // '\b'
					obj2 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   41  127:aload_1         
	//   42  128:iload           4
	//   43  130:invokestatic    #54  <Method String SafeParcelReader.createString(Parcel, int)>
	//   44  133:astore          10
					break;

	//*  45  135:goto            35
				case 7: // '\007'
					obj1 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   46  138:aload_1         
	//   47  139:iload           4
	//   48  141:invokestatic    #54  <Method String SafeParcelReader.createString(Parcel, int)>
	//   49  144:astore          9
					break;

	//*  50  146:goto            35
				case 6: // '\006'
					flag = SafeParcelReader.readBoolean(parcel, k);
	//   51  149:aload_1         
	//   52  150:iload           4
	//   53  152:invokestatic    #58  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   54  155:istore          5
					break;

	//*  55  157:goto            35
				case 5: // '\005'
					flag1 = SafeParcelReader.readBoolean(parcel, k);
	//   56  160:aload_1         
	//   57  161:iload           4
	//   58  163:invokestatic    #58  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   59  166:istore          6
					break;

	//*  60  168:goto            35
				case 4: // '\004'
					flag2 = SafeParcelReader.readBoolean(parcel, k);
	//   61  171:aload_1         
	//   62  172:iload           4
	//   63  174:invokestatic    #58  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   64  177:istore          7
					break;

	//*  65  179:goto            35
				case 3: // '\003'
					obj = ((Object) ((Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR)));
	//   66  182:aload_1         
	//   67  183:iload           4
	//   68  185:getstatic       #61  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   69  188:invokestatic    #65  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   70  191:checkcast       #60  <Class Account>
	//   71  194:astore          8
					break;

	//*  72  196:goto            35
				case 2: // '\002'
					arraylist = SafeParcelReader.createTypedList(parcel, k, Scope.CREATOR);
	//   73  199:aload_1         
	//   74  200:iload           4
	//   75  202:getstatic       #68  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   76  205:invokestatic    #50  <Method java.util.ArrayList SafeParcelReader.createTypedList(Parcel, int, android.os.Parcelable$Creator)>
	//   77  208:astore          12
					break;

	//*  78  210:goto            35
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   79  213:aload_1         
	//   80  214:iload           4
	//   81  216:invokestatic    #72  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   82  219:istore_2        
					break;
				}
			} else
	//*  83  220:goto            35
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   84  223:aload_1         
	//   85  224:iload_3         
	//   86  225:invokestatic    #75  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new GoogleSignInOptions(i, arraylist, ((Account) (obj)), flag2, flag1, flag, ((String) (obj1)), ((String) (obj2)), ((java.util.ArrayList) (obj3)));
	//   87  228:new             #77  <Class GoogleSignInOptions>
	//   88  231:dup             
	//   89  232:iload_2         
	//   90  233:aload           12
	//   91  235:aload           8
	//   92  237:iload           7
	//   93  239:iload           6
	//   94  241:iload           5
	//   95  243:aload           9
	//   96  245:aload           10
	//   97  247:aload           11
	//   98  249:invokespecial   #80  <Method void GoogleSignInOptions(int, java.util.ArrayList, Account, boolean, boolean, boolean, String, String, java.util.ArrayList)>
	//   99  252:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #83  <Method GoogleSignInOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GoogleSignInOptions[] newArray(int i)
	{
		return new GoogleSignInOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GoogleSignInOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #88  <Method GoogleSignInOptions[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
