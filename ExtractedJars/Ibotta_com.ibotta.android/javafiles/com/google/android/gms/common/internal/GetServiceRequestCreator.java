// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			GetServiceRequest

public class GetServiceRequestCreator
	implements android.os.Parcelable.Creator
{

	public GetServiceRequestCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GetServiceRequest createFromParcel(Parcel parcel)
	{
		int l = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          5
		String s = null;
	//    3    6:aconst_null     
	//    4    7:astore          14
		Object obj = ((Object) (s));
	//    5    9:aload           14
	//    6   11:astore          8
		Scope ascope[] = ((Scope []) (obj));
	//    7   13:aload           8
	//    8   15:astore          9
		Object obj1 = ((Object) (ascope));
	//    9   17:aload           9
	//   10   19:astore          10
		Object obj2 = obj1;
	//   11   21:aload           10
	//   12   23:astore          11
		Feature afeature[] = ((Feature []) (obj2));
	//   13   25:aload           11
	//   14   27:astore          12
		Feature afeature1[] = afeature;
	//   15   29:aload           12
	//   16   31:astore          13
		int k = 0;
	//   17   33:iconst_0        
	//   18   34:istore          4
		int j = 0;
	//   19   36:iconst_0        
	//   20   37:istore_3        
		int i = 0;
	//   21   38:iconst_0        
	//   22   39:istore_2        
		boolean flag = false;
	//   23   40:iconst_0        
	//   24   41:istore          7
		do
			if(parcel.dataPosition() < l)
	//*  25   43:aload_1         
	//*  26   44:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  27   47:iload           5
	//*  28   49:icmpge          276
			{
				int i1 = SafeParcelReader.readHeader(parcel);
	//   29   52:aload_1         
	//   30   53:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   31   56:istore          6
				switch(SafeParcelReader.getFieldId(i1))
	//*  32   58:iload           6
	//*  33   60:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  34   63:tableswitch     1 12: default 124
	//	               1 265
	//	               2 255
	//	               3 245
	//	               4 234
	//	               5 223
	//	               6 206
	//	               7 195
	//	               8 178
	//	               9 124
	//	               10 161
	//	               11 144
	//	               12 133
				case 9: // '\t'
				default:
					SafeParcelReader.skipUnknownField(parcel, i1);
	//   35  124:aload_1         
	//   36  125:iload           6
	//   37  127:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  38  130:goto            43
				case 12: // '\f'
					flag = SafeParcelReader.readBoolean(parcel, i1);
	//   39  133:aload_1         
	//   40  134:iload           6
	//   41  136:invokestatic    #44  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   42  139:istore          7
					break;

	//*  43  141:goto            43
				case 11: // '\013'
					afeature1 = (Feature[])SafeParcelReader.createTypedArray(parcel, i1, Feature.CREATOR);
	//   44  144:aload_1         
	//   45  145:iload           6
	//   46  147:getstatic       #50  <Field android.os.Parcelable$Creator Feature.CREATOR>
	//   47  150:invokestatic    #54  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   48  153:checkcast       #56  <Class Feature[]>
	//   49  156:astore          13
					break;

	//*  50  158:goto            43
				case 10: // '\n'
					afeature = (Feature[])SafeParcelReader.createTypedArray(parcel, i1, Feature.CREATOR);
	//   51  161:aload_1         
	//   52  162:iload           6
	//   53  164:getstatic       #50  <Field android.os.Parcelable$Creator Feature.CREATOR>
	//   54  167:invokestatic    #54  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   55  170:checkcast       #56  <Class Feature[]>
	//   56  173:astore          12
					break;

	//*  57  175:goto            43
				case 8: // '\b'
					obj2 = ((Object) ((Account)SafeParcelReader.createParcelable(parcel, i1, Account.CREATOR)));
	//   58  178:aload_1         
	//   59  179:iload           6
	//   60  181:getstatic       #59  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   61  184:invokestatic    #63  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   62  187:checkcast       #58  <Class Account>
	//   63  190:astore          11
					break;

	//*  64  192:goto            43
				case 7: // '\007'
					obj1 = ((Object) (SafeParcelReader.createBundle(parcel, i1)));
	//   65  195:aload_1         
	//   66  196:iload           6
	//   67  198:invokestatic    #67  <Method android.os.Bundle SafeParcelReader.createBundle(Parcel, int)>
	//   68  201:astore          10
					break;

	//*  69  203:goto            43
				case 6: // '\006'
					ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, i1, Scope.CREATOR);
	//   70  206:aload_1         
	//   71  207:iload           6
	//   72  209:getstatic       #70  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   73  212:invokestatic    #54  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   74  215:checkcast       #72  <Class Scope[]>
	//   75  218:astore          9
					break;

	//*  76  220:goto            43
				case 5: // '\005'
					obj = ((Object) (SafeParcelReader.readIBinder(parcel, i1)));
	//   77  223:aload_1         
	//   78  224:iload           6
	//   79  226:invokestatic    #76  <Method android.os.IBinder SafeParcelReader.readIBinder(Parcel, int)>
	//   80  229:astore          8
					break;

	//*  81  231:goto            43
				case 4: // '\004'
					s = SafeParcelReader.createString(parcel, i1);
	//   82  234:aload_1         
	//   83  235:iload           6
	//   84  237:invokestatic    #80  <Method String SafeParcelReader.createString(Parcel, int)>
	//   85  240:astore          14
					break;

	//*  86  242:goto            43
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, i1);
	//   87  245:aload_1         
	//   88  246:iload           6
	//   89  248:invokestatic    #84  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   90  251:istore_2        
					break;

	//*  91  252:goto            43
				case 2: // '\002'
					j = SafeParcelReader.readInt(parcel, i1);
	//   92  255:aload_1         
	//   93  256:iload           6
	//   94  258:invokestatic    #84  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   95  261:istore_3        
					break;

	//*  96  262:goto            43
				case 1: // '\001'
					k = SafeParcelReader.readInt(parcel, i1);
	//   97  265:aload_1         
	//   98  266:iload           6
	//   99  268:invokestatic    #84  <Method int SafeParcelReader.readInt(Parcel, int)>
	//  100  271:istore          4
					break;
				}
			} else
	//* 101  273:goto            43
			{
				SafeParcelReader.ensureAtEnd(parcel, l);
	//  102  276:aload_1         
	//  103  277:iload           5
	//  104  279:invokestatic    #87  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new GetServiceRequest(k, j, i, s, ((android.os.IBinder) (obj)), ascope, ((android.os.Bundle) (obj1)), ((Account) (obj2)), afeature, afeature1, flag);
	//  105  282:new             #89  <Class GetServiceRequest>
	//  106  285:dup             
	//  107  286:iload           4
	//  108  288:iload_3         
	//  109  289:iload_2         
	//  110  290:aload           14
	//  111  292:aload           8
	//  112  294:aload           9
	//  113  296:aload           10
	//  114  298:aload           11
	//  115  300:aload           12
	//  116  302:aload           13
	//  117  304:iload           7
	//  118  306:invokespecial   #92  <Method void GetServiceRequest(int, int, int, String, android.os.IBinder, Scope[], android.os.Bundle, Account, Feature[], Feature[], boolean)>
	//  119  309:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method GetServiceRequest createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GetServiceRequest[] newArray(int i)
	{
		return new GetServiceRequest[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GetServiceRequest[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #100 <Method GetServiceRequest[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
