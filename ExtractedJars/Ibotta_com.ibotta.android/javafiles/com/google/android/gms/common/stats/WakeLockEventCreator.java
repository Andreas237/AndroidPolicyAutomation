// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.stats:
//			WakeLockEvent

public class WakeLockEventCreator
	implements android.os.Parcelable.Creator
{

	public WakeLockEventCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public WakeLockEvent createFromParcel(Parcel parcel)
	{
		int i1 = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          7
		long l3 = 0L;
	//    3    6:lconst_0        
	//    4    7:lstore          13
		long l1 = l3;
	//    5    9:lload           13
	//    6   11:lstore          9
		long l2 = l1;
	//    7   13:lload           9
	//    8   15:lstore          11
		String s = null;
	//    9   17:aconst_null     
	//   10   18:astore          20
		Object obj = ((Object) (s));
	//   11   20:aload           20
	//   12   22:astore          15
		Object obj1 = obj;
	//   13   24:aload           15
	//   14   26:astore          16
		Object obj2 = obj1;
	//   15   28:aload           16
	//   16   30:astore          17
		Object obj3 = obj2;
	//   17   32:aload           17
	//   18   34:astore          18
		Object obj4 = obj3;
	//   19   36:aload           18
	//   20   38:astore          19
		int l = 0;
	//   21   40:iconst_0        
	//   22   41:istore          6
		int k = 0;
	//   23   43:iconst_0        
	//   24   44:istore          5
		int j = 0;
	//   25   46:iconst_0        
	//   26   47:istore          4
		int i = 0;
	//   27   49:iconst_0        
	//   28   50:istore_3        
		float f = 0.0F;
	//   29   51:fconst_0        
	//   30   52:fstore_2        
		do
			if(parcel.dataPosition() < i1)
	//*  31   53:aload_1         
	//*  32   54:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  33   57:iload           7
	//*  34   59:icmpge          317
			{
				int j1 = SafeParcelReader.readHeader(parcel);
	//   35   62:aload_1         
	//   36   63:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   37   66:istore          8
				switch(SafeParcelReader.getFieldId(j1))
	//*  38   68:iload           8
	//*  39   70:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  40   73:tableswitch     1 17: default 156
	//	               1 306
	//	               2 295
	//	               3 156
	//	               4 284
	//	               5 273
	//	               6 262
	//	               7 156
	//	               8 251
	//	               9 156
	//	               10 240
	//	               11 229
	//	               12 218
	//	               13 207
	//	               14 197
	//	               15 187
	//	               16 176
	//	               17 165
				case 3: // '\003'
				case 7: // '\007'
				case 9: // '\t'
				default:
					SafeParcelReader.skipUnknownField(parcel, j1);
	//   41  156:aload_1         
	//   42  157:iload           8
	//   43  159:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  44  162:goto            53
				case 17: // '\021'
					obj4 = ((Object) (SafeParcelReader.createString(parcel, j1)));
	//   45  165:aload_1         
	//   46  166:iload           8
	//   47  168:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   48  171:astore          19
					break;

	//*  49  173:goto            53
				case 16: // '\020'
					l2 = SafeParcelReader.readLong(parcel, j1);
	//   50  176:aload_1         
	//   51  177:iload           8
	//   52  179:invokestatic    #48  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   53  182:lstore          11
					break;

	//*  54  184:goto            53
				case 15: // '\017'
					f = SafeParcelReader.readFloat(parcel, j1);
	//   55  187:aload_1         
	//   56  188:iload           8
	//   57  190:invokestatic    #52  <Method float SafeParcelReader.readFloat(Parcel, int)>
	//   58  193:fstore_2        
					break;

	//*  59  194:goto            53
				case 14: // '\016'
					i = SafeParcelReader.readInt(parcel, j1);
	//   60  197:aload_1         
	//   61  198:iload           8
	//   62  200:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   63  203:istore_3        
					break;

	//*  64  204:goto            53
				case 13: // '\r'
					obj3 = ((Object) (SafeParcelReader.createString(parcel, j1)));
	//   65  207:aload_1         
	//   66  208:iload           8
	//   67  210:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   68  213:astore          18
					break;

	//*  69  215:goto            53
				case 12: // '\f'
					obj1 = ((Object) (SafeParcelReader.createString(parcel, j1)));
	//   70  218:aload_1         
	//   71  219:iload           8
	//   72  221:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   73  224:astore          16
					break;

	//*  74  226:goto            53
				case 11: // '\013'
					k = SafeParcelReader.readInt(parcel, j1);
	//   75  229:aload_1         
	//   76  230:iload           8
	//   77  232:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   78  235:istore          5
					break;

	//*  79  237:goto            53
				case 10: // '\n'
					obj2 = ((Object) (SafeParcelReader.createString(parcel, j1)));
	//   80  240:aload_1         
	//   81  241:iload           8
	//   82  243:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   83  246:astore          17
					break;

	//*  84  248:goto            53
				case 8: // '\b'
					l1 = SafeParcelReader.readLong(parcel, j1);
	//   85  251:aload_1         
	//   86  252:iload           8
	//   87  254:invokestatic    #48  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   88  257:lstore          9
					break;

	//*  89  259:goto            53
				case 6: // '\006'
					obj = ((Object) (SafeParcelReader.createStringList(parcel, j1)));
	//   90  262:aload_1         
	//   91  263:iload           8
	//   92  265:invokestatic    #60  <Method java.util.ArrayList SafeParcelReader.createStringList(Parcel, int)>
	//   93  268:astore          15
					break;

	//*  94  270:goto            53
				case 5: // '\005'
					j = SafeParcelReader.readInt(parcel, j1);
	//   95  273:aload_1         
	//   96  274:iload           8
	//   97  276:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   98  279:istore          4
					break;

	//*  99  281:goto            53
				case 4: // '\004'
					s = SafeParcelReader.createString(parcel, j1);
	//  100  284:aload_1         
	//  101  285:iload           8
	//  102  287:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//  103  290:astore          20
					break;

	//* 104  292:goto            53
				case 2: // '\002'
					l3 = SafeParcelReader.readLong(parcel, j1);
	//  105  295:aload_1         
	//  106  296:iload           8
	//  107  298:invokestatic    #48  <Method long SafeParcelReader.readLong(Parcel, int)>
	//  108  301:lstore          13
					break;

	//* 109  303:goto            53
				case 1: // '\001'
					l = SafeParcelReader.readInt(parcel, j1);
	//  110  306:aload_1         
	//  111  307:iload           8
	//  112  309:invokestatic    #56  <Method int SafeParcelReader.readInt(Parcel, int)>
	//  113  312:istore          6
					break;
				}
			} else
	//* 114  314:goto            53
			{
				SafeParcelReader.ensureAtEnd(parcel, i1);
	//  115  317:aload_1         
	//  116  318:iload           7
	//  117  320:invokestatic    #63  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new WakeLockEvent(l, l3, k, s, j, ((java.util.List) (obj)), ((String) (obj1)), l1, i, ((String) (obj2)), ((String) (obj3)), f, l2, ((String) (obj4)));
	//  118  323:new             #65  <Class WakeLockEvent>
	//  119  326:dup             
	//  120  327:iload           6
	//  121  329:lload           13
	//  122  331:iload           5
	//  123  333:aload           20
	//  124  335:iload           4
	//  125  337:aload           15
	//  126  339:aload           16
	//  127  341:lload           9
	//  128  343:iload_3         
	//  129  344:aload           17
	//  130  346:aload           18
	//  131  348:fload_2         
	//  132  349:lload           11
	//  133  351:aload           19
	//  134  353:invokespecial   #68  <Method void WakeLockEvent(int, long, int, String, int, java.util.List, String, long, int, String, String, float, long, String)>
	//  135  356:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #71  <Method WakeLockEvent createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public WakeLockEvent[] newArray(int i)
	{
		return new WakeLockEvent[i];
	//    0    0:iload_1         
	//    1    1:anewarray       WakeLockEvent[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #76  <Method WakeLockEvent[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
