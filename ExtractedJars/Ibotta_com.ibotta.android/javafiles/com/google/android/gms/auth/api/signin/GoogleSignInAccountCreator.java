// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInAccount

public class GoogleSignInAccountCreator
	implements android.os.Parcelable.Creator
{

	public GoogleSignInAccountCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GoogleSignInAccount createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		String s3 = null;
	//    3    5:aconst_null     
	//    4    6:astore          16
		String s = s3;
	//    5    8:aload           16
	//    6   10:astore          7
		String s1 = s;
	//    7   12:aload           7
	//    8   14:astore          8
		String s2 = s1;
	//    9   16:aload           8
	//   10   18:astore          9
		Object obj = ((Object) (s2));
	//   11   20:aload           9
	//   12   22:astore          10
		Object obj1 = obj;
	//   13   24:aload           10
	//   14   26:astore          11
		Object obj2 = obj1;
	//   15   28:aload           11
	//   16   30:astore          12
		Object obj3 = obj2;
	//   17   32:aload           12
	//   18   34:astore          13
		Object obj4 = obj3;
	//   19   36:aload           13
	//   20   38:astore          14
		Object obj5 = obj4;
	//   21   40:aload           14
	//   22   42:astore          15
		long l = 0L;
	//   23   44:lconst_0        
	//   24   45:lstore          5
		int i = 0;
	//   25   47:iconst_0        
	//   26   48:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  29   53:iload_3         
	//*  30   54:icmpge          281
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   31   57:aload_1         
	//   32   58:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   33   61:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  34   63:iload           4
	//*  35   65:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  36   68:tableswitch     1 12: default 132
	//	               1 271
	//	               2 260
	//	               3 249
	//	               4 238
	//	               5 227
	//	               6 210
	//	               7 199
	//	               8 188
	//	               9 177
	//	               10 163
	//	               11 152
	//	               12 141
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   37  132:aload_1         
	//   38  133:iload           4
	//   39  135:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  40  138:goto            49
				case 12: // '\f'
					obj5 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   41  141:aload_1         
	//   42  142:iload           4
	//   43  144:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   44  147:astore          15
					break;

	//*  45  149:goto            49
				case 11: // '\013'
					obj4 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   46  152:aload_1         
	//   47  153:iload           4
	//   48  155:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   49  158:astore          14
					break;

	//*  50  160:goto            49
				case 10: // '\n'
					obj3 = ((Object) (SafeParcelReader.createTypedList(parcel, k, Scope.CREATOR)));
	//   51  163:aload_1         
	//   52  164:iload           4
	//   53  166:getstatic       #50  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   54  169:invokestatic    #54  <Method java.util.ArrayList SafeParcelReader.createTypedList(Parcel, int, android.os.Parcelable$Creator)>
	//   55  172:astore          13
					break;

	//*  56  174:goto            49
				case 9: // '\t'
					obj2 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   57  177:aload_1         
	//   58  178:iload           4
	//   59  180:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   60  183:astore          12
					break;

	//*  61  185:goto            49
				case 8: // '\b'
					l = SafeParcelReader.readLong(parcel, k);
	//   62  188:aload_1         
	//   63  189:iload           4
	//   64  191:invokestatic    #58  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   65  194:lstore          5
					break;

	//*  66  196:goto            49
				case 7: // '\007'
					obj1 = ((Object) (SafeParcelReader.createString(parcel, k)));
	//   67  199:aload_1         
	//   68  200:iload           4
	//   69  202:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   70  205:astore          11
					break;

	//*  71  207:goto            49
				case 6: // '\006'
					obj = ((Object) ((Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR)));
	//   72  210:aload_1         
	//   73  211:iload           4
	//   74  213:getstatic       #61  <Field android.os.Parcelable$Creator Uri.CREATOR>
	//   75  216:invokestatic    #65  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   76  219:checkcast       #60  <Class Uri>
	//   77  222:astore          10
					break;

	//*  78  224:goto            49
				case 5: // '\005'
					s2 = SafeParcelReader.createString(parcel, k);
	//   79  227:aload_1         
	//   80  228:iload           4
	//   81  230:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   82  233:astore          9
					break;

	//*  83  235:goto            49
				case 4: // '\004'
					s1 = SafeParcelReader.createString(parcel, k);
	//   84  238:aload_1         
	//   85  239:iload           4
	//   86  241:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   87  244:astore          8
					break;

	//*  88  246:goto            49
				case 3: // '\003'
					s = SafeParcelReader.createString(parcel, k);
	//   89  249:aload_1         
	//   90  250:iload           4
	//   91  252:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   92  255:astore          7
					break;

	//*  93  257:goto            49
				case 2: // '\002'
					s3 = SafeParcelReader.createString(parcel, k);
	//   94  260:aload_1         
	//   95  261:iload           4
	//   96  263:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   97  266:astore          16
					break;

	//*  98  268:goto            49
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   99  271:aload_1         
	//  100  272:iload           4
	//  101  274:invokestatic    #69  <Method int SafeParcelReader.readInt(Parcel, int)>
	//  102  277:istore_2        
					break;
				}
			} else
	//* 103  278:goto            49
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//  104  281:aload_1         
	//  105  282:iload_3         
	//  106  283:invokestatic    #72  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new GoogleSignInAccount(i, s3, s, s1, s2, ((Uri) (obj)), ((String) (obj1)), l, ((String) (obj2)), ((java.util.List) (obj3)), ((String) (obj4)), ((String) (obj5)));
	//  107  286:new             #74  <Class GoogleSignInAccount>
	//  108  289:dup             
	//  109  290:iload_2         
	//  110  291:aload           16
	//  111  293:aload           7
	//  112  295:aload           8
	//  113  297:aload           9
	//  114  299:aload           10
	//  115  301:aload           11
	//  116  303:lload           5
	//  117  305:aload           12
	//  118  307:aload           13
	//  119  309:aload           14
	//  120  311:aload           15
	//  121  313:invokespecial   #77  <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, java.util.List, String, String)>
	//  122  316:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #80  <Method GoogleSignInAccount createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GoogleSignInAccount[] newArray(int i)
	{
		return new GoogleSignInAccount[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GoogleSignInAccount[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #85  <Method GoogleSignInAccount[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
