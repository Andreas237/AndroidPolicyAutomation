// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.stats:
//			ConnectionEvent

public class ConnectionEventCreator
	implements android.os.Parcelable.Creator
{

	public ConnectionEventCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ConnectionEvent createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = j;
	//    5    8:iload_3         
	//    6    9:istore_2        
		long l3 = 0L;
	//    7   10:lconst_0        
	//    8   11:lstore          10
		long l1 = l3;
	//    9   13:lload           10
	//   10   15:lstore          6
		long l2 = l1;
	//   11   17:lload           6
	//   12   19:lstore          8
		String s5 = null;
	//   13   21:aconst_null     
	//   14   22:astore          17
		String s = s5;
	//   15   24:aload           17
	//   16   26:astore          12
		String s1 = s;
	//   17   28:aload           12
	//   18   30:astore          13
		String s2 = s1;
	//   19   32:aload           13
	//   20   34:astore          14
		String s3 = s2;
	//   21   36:aload           14
	//   22   38:astore          15
		String s4 = s3;
	//   23   40:aload           15
	//   24   42:astore          16
		do
			if(parcel.dataPosition() < k)
	//*  25   44:aload_1         
	//*  26   45:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  27   48:iload           4
	//*  28   50:icmpge          260
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   29   53:aload_1         
	//   30   54:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   31   57:istore          5
				switch(SafeParcelReader.getFieldId(l))
	//*  32   59:iload           5
	//*  33   61:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  34   64:tableswitch     1 13: default 132
	//	               1 250
	//	               2 239
	//	               3 132
	//	               4 228
	//	               5 217
	//	               6 206
	//	               7 195
	//	               8 184
	//	               9 132
	//	               10 173
	//	               11 162
	//	               12 152
	//	               13 141
				case 3: // '\003'
				case 9: // '\t'
				default:
					SafeParcelReader.skipUnknownField(parcel, l);
	//   35  132:aload_1         
	//   36  133:iload           5
	//   37  135:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  38  138:goto            44
				case 13: // '\r'
					s4 = SafeParcelReader.createString(parcel, l);
	//   39  141:aload_1         
	//   40  142:iload           5
	//   41  144:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   42  147:astore          16
					break;

	//*  43  149:goto            44
				case 12: // '\f'
					i = SafeParcelReader.readInt(parcel, l);
	//   44  152:aload_1         
	//   45  153:iload           5
	//   46  155:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   47  158:istore_2        
					break;

	//*  48  159:goto            44
				case 11: // '\013'
					l2 = SafeParcelReader.readLong(parcel, l);
	//   49  162:aload_1         
	//   50  163:iload           5
	//   51  165:invokestatic    #52  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   52  168:lstore          8
					break;

	//*  53  170:goto            44
				case 10: // '\n'
					l1 = SafeParcelReader.readLong(parcel, l);
	//   54  173:aload_1         
	//   55  174:iload           5
	//   56  176:invokestatic    #52  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   57  179:lstore          6
					break;

	//*  58  181:goto            44
				case 8: // '\b'
					s3 = SafeParcelReader.createString(parcel, l);
	//   59  184:aload_1         
	//   60  185:iload           5
	//   61  187:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   62  190:astore          15
					break;

	//*  63  192:goto            44
				case 7: // '\007'
					s2 = SafeParcelReader.createString(parcel, l);
	//   64  195:aload_1         
	//   65  196:iload           5
	//   66  198:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   67  201:astore          14
					break;

	//*  68  203:goto            44
				case 6: // '\006'
					s1 = SafeParcelReader.createString(parcel, l);
	//   69  206:aload_1         
	//   70  207:iload           5
	//   71  209:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   72  212:astore          13
					break;

	//*  73  214:goto            44
				case 5: // '\005'
					s = SafeParcelReader.createString(parcel, l);
	//   74  217:aload_1         
	//   75  218:iload           5
	//   76  220:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   77  223:astore          12
					break;

	//*  78  225:goto            44
				case 4: // '\004'
					s5 = SafeParcelReader.createString(parcel, l);
	//   79  228:aload_1         
	//   80  229:iload           5
	//   81  231:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   82  234:astore          17
					break;

	//*  83  236:goto            44
				case 2: // '\002'
					l3 = SafeParcelReader.readLong(parcel, l);
	//   84  239:aload_1         
	//   85  240:iload           5
	//   86  242:invokestatic    #52  <Method long SafeParcelReader.readLong(Parcel, int)>
	//   87  245:lstore          10
					break;

	//*  88  247:goto            44
				case 1: // '\001'
					j = SafeParcelReader.readInt(parcel, l);
	//   89  250:aload_1         
	//   90  251:iload           5
	//   91  253:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   92  256:istore_3        
					break;
				}
			} else
	//*  93  257:goto            44
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   94  260:aload_1         
	//   95  261:iload           4
	//   96  263:invokestatic    #55  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ConnectionEvent(j, l3, i, s5, s, s1, s2, s3, s4, l1, l2);
	//   97  266:new             #57  <Class ConnectionEvent>
	//   98  269:dup             
	//   99  270:iload_3         
	//  100  271:lload           10
	//  101  273:iload_2         
	//  102  274:aload           17
	//  103  276:aload           12
	//  104  278:aload           13
	//  105  280:aload           14
	//  106  282:aload           15
	//  107  284:aload           16
	//  108  286:lload           6
	//  109  288:lload           8
	//  110  290:invokespecial   #60  <Method void ConnectionEvent(int, long, int, String, String, String, String, String, String, long, long)>
	//  111  293:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #63  <Method ConnectionEvent createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ConnectionEvent[] newArray(int i)
	{
		return new ConnectionEvent[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ConnectionEvent[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #68  <Method ConnectionEvent[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
