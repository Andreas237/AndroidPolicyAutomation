// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastSafeParcelableJsonResponse, f, zak

public class SafeParcelResponse extends FastSafeParcelableJsonResponse
{

	SafeParcelResponse(int i, Parcel parcel, zak zak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void FastSafeParcelableJsonResponse()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int a>
		b = (Parcel)am.a(((Object) (parcel)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method Object am.a(Object)>
	//    8   14:checkcast       #38  <Class Parcel>
	//    9   17:putfield        #40  <Field Parcel b>
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #42  <Field int c>
		d = zak1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #44  <Field zak d>
		parcel = ((Parcel) (d));
	//   16   30:aload_0         
	//   17   31:getfield        #44  <Field zak d>
	//   18   34:astore_2        
		if(parcel == null)
	//*  19   35:aload_2         
	//*  20   36:ifnonnull       47
			e = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #46  <Field String e>
		else
	//*  24   44:goto            55
			e = ((zak) (parcel)).b();
	//   25   47:aload_0         
	//   26   48:aload_2         
	//   27   49:invokevirtual   #51  <Method String com.google.android.gms.common.server.response.zak.b()>
	//   28   52:putfield        #46  <Field String e>
		f = 2;
	//   29   55:aload_0         
	//   30   56:iconst_2        
	//   31   57:putfield        #53  <Field int f>
	//   32   60:return          
	}

	private static void a(StringBuilder stringbuilder, int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 199
	//	               1 199
	//	               2 199
	//	               3 199
	//	               4 199
	//	               5 199
	//	               6 199
	//	               7 172
	//	               8 145
	//	               9 118
	//	               10 109
	//	               11 99
		default:
			stringbuilder = new StringBuilder(26);
	//    2   64:new             #56  <Class StringBuilder>
	//    3   67:dup             
	//    4   68:bipush          26
	//    5   70:invokespecial   #59  <Method void StringBuilder(int)>
	//    6   73:astore_0        
			stringbuilder.append("Unknown type = ");
	//    7   74:aload_0         
	//    8   75:ldc1            #61  <String "Unknown type = ">
	//    9   77:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   10   80:pop             
			stringbuilder.append(i);
	//   11   81:aload_0         
	//   12   82:iload_1         
	//   13   83:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   14   86:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   15   87:new             #70  <Class IllegalArgumentException>
	//   16   90:dup             
	//   17   91:aload_0         
	//   18   92:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   19   95:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   20   98:athrow          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//   21   99:new             #70  <Class IllegalArgumentException>
	//   22  102:dup             
	//   23  103:ldc1            #78  <String "Method does not accept concrete type.">
	//   24  105:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   25  108:athrow          

		case 10: // '\n'
			m.a(stringbuilder, (HashMap)obj);
	//   26  109:aload_0         
	//   27  110:aload_2         
	//   28  111:checkcast       #80  <Class HashMap>
	//   29  114:invokestatic    #85  <Method void m.a(StringBuilder, HashMap)>
			return;
	//   30  117:return          

		case 9: // '\t'
			stringbuilder.append("\"");
	//   31  118:aload_0         
	//   32  119:ldc1            #87  <String "\"">
	//   33  121:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   34  124:pop             
			stringbuilder.append(com.google.android.gms.common.util.c.b((byte[])obj));
	//   35  125:aload_0         
	//   36  126:aload_2         
	//   37  127:checkcast       #89  <Class byte[]>
	//   38  130:invokestatic    #94  <Method String c.b(byte[])>
	//   39  133:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   40  136:pop             
			stringbuilder.append("\"");
	//   41  137:aload_0         
	//   42  138:ldc1            #87  <String "\"">
	//   43  140:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   44  143:pop             
			return;
	//   45  144:return          

		case 8: // '\b'
			stringbuilder.append("\"");
	//   46  145:aload_0         
	//   47  146:ldc1            #87  <String "\"">
	//   48  148:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   49  151:pop             
			stringbuilder.append(com.google.android.gms.common.util.c.a((byte[])obj));
	//   50  152:aload_0         
	//   51  153:aload_2         
	//   52  154:checkcast       #89  <Class byte[]>
	//   53  157:invokestatic    #96  <Method String c.a(byte[])>
	//   54  160:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   55  163:pop             
			stringbuilder.append("\"");
	//   56  164:aload_0         
	//   57  165:ldc1            #87  <String "\"">
	//   58  167:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   59  170:pop             
			return;
	//   60  171:return          

		case 7: // '\007'
			stringbuilder.append("\"");
	//   61  172:aload_0         
	//   62  173:ldc1            #87  <String "\"">
	//   63  175:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   64  178:pop             
			stringbuilder.append(l.a(obj.toString()));
	//   65  179:aload_0         
	//   66  180:aload_2         
	//   67  181:invokevirtual   #99  <Method String Object.toString()>
	//   68  184:invokestatic    #104 <Method String l.a(String)>
	//   69  187:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   70  190:pop             
			stringbuilder.append("\"");
	//   71  191:aload_0         
	//   72  192:ldc1            #87  <String "\"">
	//   73  194:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   74  197:pop             
			return;
	//   75  198:return          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			stringbuilder.append(obj);
	//   76  199:aload_0         
	//   77  200:aload_2         
	//   78  201:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//   79  204:pop             
			return;
	//   80  205:return          
		}
	}

	private final void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
	{
		if(field.b)
	//*   0    0:aload_2         
	//*   1    1:getfield        #113 <Field boolean com.google.android.gms.common.server.response.FastJsonResponse$Field.b>
	//*   2    4:ifeq            78
		{
			obj = ((Object) ((ArrayList)obj));
	//    3    7:aload_3         
	//    4    8:checkcast       #115 <Class ArrayList>
	//    5   11:astore_3        
			stringbuilder.append("[");
	//    6   12:aload_1         
	//    7   13:ldc1            #117 <String "[">
	//    8   15:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			int j = ((ArrayList) (obj)).size();
	//   10   19:aload_3         
	//   11   20:invokevirtual   #121 <Method int ArrayList.size()>
	//   12   23:istore          5
			for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore          4
	//*  15   28:iload           4
	//*  16   30:iload           5
	//*  17   32:icmpge          70
			{
				if(i != 0)
	//*  18   35:iload           4
	//*  19   37:ifeq            47
					stringbuilder.append(",");
	//   20   40:aload_1         
	//   21   41:ldc1            #123 <String ",">
	//   22   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
				a(stringbuilder, field.a, ((ArrayList) (obj)).get(i));
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:getfield        #124 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.a>
	//   27   52:aload_3         
	//   28   53:iload           4
	//   29   55:invokevirtual   #128 <Method Object ArrayList.get(int)>
	//   30   58:invokestatic    #130 <Method void a(StringBuilder, int, Object)>
			}

	//   31   61:iload           4
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore          4
	//*  35   67:goto            28
			stringbuilder.append("]");
	//   36   70:aload_1         
	//   37   71:ldc1            #132 <String "]">
	//   38   73:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			return;
	//   40   77:return          
		} else
		{
			a(stringbuilder, field.a, obj);
	//   41   78:aload_1         
	//   42   79:aload_2         
	//   43   80:getfield        #124 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.a>
	//   44   83:aload_3         
	//   45   84:invokestatic    #130 <Method void a(StringBuilder, int, Object)>
			return;
	//   46   87:return          
		}
	}

	private final void a(StringBuilder stringbuilder, Map map, Parcel parcel)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #135 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void SparseArray()>
	//    3    7:astore          7
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sparsearray.put(((FastJsonResponse.Field)entry.getValue()).a(), ((Object) (entry))))
	//*   4    9:aload_2         
	//*   5   10:invokeinterface #142 <Method Set Map.entrySet()>
	//*   6   15:invokeinterface #148 <Method Iterator Set.iterator()>
	//*   7   20:astore_2        
	//*   8   21:aload_2         
	//*   9   22:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  10   27:ifeq            64
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   30:aload_2         
	//   12   31:invokeinterface #158 <Method Object Iterator.next()>
	//   13   36:checkcast       #160 <Class java.util.Map$Entry>
	//   14   39:astore          8

	//   15   41:aload           7
	//   16   43:aload           8
	//   17   45:invokeinterface #163 <Method Object java.util.Map$Entry.getValue()>
	//   18   50:checkcast       #110 <Class FastJsonResponse$Field>
	//   19   53:invokevirtual   #165 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//   20   56:aload           8
	//   21   58:invokevirtual   #169 <Method void SparseArray.put(int, Object)>
	//*  22   61:goto            21
		stringbuilder.append('{');
	//   23   64:aload_1         
	//   24   65:bipush          123
	//   25   67:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   26   70:pop             
		int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
	//   27   71:aload_3         
	//   28   72:invokestatic    #177 <Method int a.b(Parcel)>
	//   29   75:istore          5
		int i = 0;
	//   30   77:iconst_0        
	//   31   78:istore          4
		do
		{
			if(parcel.dataPosition() >= j)
				break;
	//   32   80:aload_3         
	//   33   81:invokevirtual   #180 <Method int Parcel.dataPosition()>
	//   34   84:iload           5
	//   35   86:icmpge          1300
			int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
	//   36   89:aload_3         
	//   37   90:invokestatic    #182 <Method int a.a(Parcel)>
	//   38   93:istore          6
			map = ((Map) ((java.util.Map.Entry)sparsearray.get(com.google.android.gms.common.internal.safeparcel.a.a(k))));
	//   39   95:aload           7
	//   40   97:iload           6
	//   41   99:invokestatic    #185 <Method int a.a(int)>
	//   42  102:invokevirtual   #186 <Method Object SparseArray.get(int)>
	//   43  105:checkcast       #160 <Class java.util.Map$Entry>
	//   44  108:astore_2        
			if(map != null)
	//*  45  109:aload_2         
	//*  46  110:ifnull          80
			{
				if(i != 0)
	//*  47  113:iload           4
	//*  48  115:ifeq            125
					stringbuilder.append(",");
	//   49  118:aload_1         
	//   50  119:ldc1            #123 <String ",">
	//   51  121:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   52  124:pop             
				String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   53  125:aload_2         
	//   54  126:invokeinterface #189 <Method Object java.util.Map$Entry.getKey()>
	//   55  131:checkcast       #191 <Class String>
	//   56  134:astore          8
				map = ((Map) ((FastJsonResponse.Field)((java.util.Map.Entry) (map)).getValue()));
	//   57  136:aload_2         
	//   58  137:invokeinterface #163 <Method Object java.util.Map$Entry.getValue()>
	//   59  142:checkcast       #110 <Class FastJsonResponse$Field>
	//   60  145:astore_2        
				stringbuilder.append("\"");
	//   61  146:aload_1         
	//   62  147:ldc1            #87  <String "\"">
	//   63  149:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   64  152:pop             
				stringbuilder.append(s);
	//   65  153:aload_1         
	//   66  154:aload           8
	//   67  156:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   68  159:pop             
				stringbuilder.append("\":");
	//   69  160:aload_1         
	//   70  161:ldc1            #193 <String "\":">
	//   71  163:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   72  166:pop             
				if(((FastJsonResponse.Field) (map)).b())
	//*  73  167:aload_2         
	//*  74  168:invokevirtual   #195 <Method boolean com.google.android.gms.common.server.response.FastJsonResponse$Field.b()>
	//*  75  171:ifeq            562
					switch(((FastJsonResponse.Field) (map)).c)
	//*  76  174:aload_2         
	//*  77  175:getfield        #196 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
					{
	//*  78  178:tableswitch     0 11: default 240
	//	               0 540
	//	               1 521
	//	               2 499
	//	               3 477
	//	               4 455
	//	               5 436
	//	               6 414
	//	               7 395
	//	               8 376
	//	               9 376
	//	               10 292
	//	               11 282
					default:
						i = ((FastJsonResponse.Field) (map)).c;
	//   79  240:aload_2         
	//   80  241:getfield        #196 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
	//   81  244:istore          4
						stringbuilder = new StringBuilder(36);
	//   82  246:new             #56  <Class StringBuilder>
	//   83  249:dup             
	//   84  250:bipush          36
	//   85  252:invokespecial   #59  <Method void StringBuilder(int)>
	//   86  255:astore_1        
						stringbuilder.append("Unknown field out type = ");
	//   87  256:aload_1         
	//   88  257:ldc1            #198 <String "Unknown field out type = ">
	//   89  259:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   90  262:pop             
						stringbuilder.append(i);
	//   91  263:aload_1         
	//   92  264:iload           4
	//   93  266:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   94  269:pop             
						throw new IllegalArgumentException(stringbuilder.toString());
	//   95  270:new             #70  <Class IllegalArgumentException>
	//   96  273:dup             
	//   97  274:aload_1         
	//   98  275:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   99  278:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//  100  281:athrow          

					case 11: // '\013'
						throw new IllegalArgumentException("Method does not accept concrete type.");
	//  101  282:new             #70  <Class IllegalArgumentException>
	//  102  285:dup             
	//  103  286:ldc1            #78  <String "Method does not accept concrete type.">
	//  104  288:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//  105  291:athrow          

					case 10: // '\n'
						Bundle bundle = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
	//  106  292:aload_3         
	//  107  293:iload           6
	//  108  295:invokestatic    #202 <Method Bundle a.p(Parcel, int)>
	//  109  298:astore          8
						HashMap hashmap = new HashMap();
	//  110  300:new             #80  <Class HashMap>
	//  111  303:dup             
	//  112  304:invokespecial   #203 <Method void HashMap()>
	//  113  307:astore          9
						String s2;
						for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s2)), ((Object) (bundle.getString(s2)))))
	//* 114  309:aload           8
	//* 115  311:invokevirtual   #208 <Method Set Bundle.keySet()>
	//* 116  314:invokeinterface #148 <Method Iterator Set.iterator()>
	//* 117  319:astore          10
	//* 118  321:aload           10
	//* 119  323:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//* 120  328:ifeq            361
							s2 = (String)iterator.next();
	//  121  331:aload           10
	//  122  333:invokeinterface #158 <Method Object Iterator.next()>
	//  123  338:checkcast       #191 <Class String>
	//  124  341:astore          11

	//  125  343:aload           9
	//  126  345:aload           11
	//  127  347:aload           8
	//  128  349:aload           11
	//  129  351:invokevirtual   #211 <Method String Bundle.getString(String)>
	//  130  354:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
	//  131  357:pop             
	//* 132  358:goto            321
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (hashmap))));
	//  133  361:aload_0         
	//  134  362:aload_1         
	//  135  363:aload_2         
	//  136  364:aload_2         
	//  137  365:aload           9
	//  138  367:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  139  370:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 140  373:goto            1294
					case 8: // '\b'
					case 9: // '\t'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (com.google.android.gms.common.internal.safeparcel.a.q(parcel, k)))));
	//  141  376:aload_0         
	//  142  377:aload_1         
	//  143  378:aload_2         
	//  144  379:aload_2         
	//  145  380:aload_3         
	//  146  381:iload           6
	//  147  383:invokestatic    #223 <Method byte[] a.q(Parcel, int)>
	//  148  386:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  149  389:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 150  392:goto            1294
					case 7: // '\007'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (com.google.android.gms.common.internal.safeparcel.a.n(parcel, k)))));
	//  151  395:aload_0         
	//  152  396:aload_1         
	//  153  397:aload_2         
	//  154  398:aload_2         
	//  155  399:aload_3         
	//  156  400:iload           6
	//  157  402:invokestatic    #227 <Method String a.n(Parcel, int)>
	//  158  405:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  159  408:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 160  411:goto            1294
					case 6: // '\006'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, k))))));
	//  161  414:aload_0         
	//  162  415:aload_1         
	//  163  416:aload_2         
	//  164  417:aload_2         
	//  165  418:aload_3         
	//  166  419:iload           6
	//  167  421:invokestatic    #230 <Method boolean a.c(Parcel, int)>
	//  168  424:invokestatic    #236 <Method Boolean Boolean.valueOf(boolean)>
	//  169  427:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  170  430:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 171  433:goto            1294
					case 5: // '\005'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (com.google.android.gms.common.internal.safeparcel.a.m(parcel, k)))));
	//  172  436:aload_0         
	//  173  437:aload_1         
	//  174  438:aload_2         
	//  175  439:aload_2         
	//  176  440:aload_3         
	//  177  441:iload           6
	//  178  443:invokestatic    #240 <Method java.math.BigDecimal a.m(Parcel, int)>
	//  179  446:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  180  449:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 181  452:goto            1294
					case 4: // '\004'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.k(parcel, k))))));
	//  182  455:aload_0         
	//  183  456:aload_1         
	//  184  457:aload_2         
	//  185  458:aload_2         
	//  186  459:aload_3         
	//  187  460:iload           6
	//  188  462:invokestatic    #244 <Method double a.k(Parcel, int)>
	//  189  465:invokestatic    #249 <Method Double Double.valueOf(double)>
	//  190  468:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  191  471:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 192  474:goto            1294
					case 3: // '\003'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, k))))));
	//  193  477:aload_0         
	//  194  478:aload_1         
	//  195  479:aload_2         
	//  196  480:aload_2         
	//  197  481:aload_3         
	//  198  482:iload           6
	//  199  484:invokestatic    #253 <Method float a.i(Parcel, int)>
	//  200  487:invokestatic    #258 <Method Float Float.valueOf(float)>
	//  201  490:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  202  493:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 203  496:goto            1294
					case 2: // '\002'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, k))))));
	//  204  499:aload_0         
	//  205  500:aload_1         
	//  206  501:aload_2         
	//  207  502:aload_2         
	//  208  503:aload_3         
	//  209  504:iload           6
	//  210  506:invokestatic    #261 <Method long a.f(Parcel, int)>
	//  211  509:invokestatic    #266 <Method Long Long.valueOf(long)>
	//  212  512:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  213  515:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 214  518:goto            1294
					case 1: // '\001'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (com.google.android.gms.common.internal.safeparcel.a.h(parcel, k)))));
	//  215  521:aload_0         
	//  216  522:aload_1         
	//  217  523:aload_2         
	//  218  524:aload_2         
	//  219  525:aload_3         
	//  220  526:iload           6
	//  221  528:invokestatic    #270 <Method java.math.BigInteger a.h(Parcel, int)>
	//  222  531:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  223  534:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 224  537:goto            1294
					case 0: // '\0'
						a(stringbuilder, ((FastJsonResponse.Field) (map)), a(((FastJsonResponse.Field) (map)), ((Object) (Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.d(parcel, k))))));
	//  225  540:aload_0         
	//  226  541:aload_1         
	//  227  542:aload_2         
	//  228  543:aload_2         
	//  229  544:aload_3         
	//  230  545:iload           6
	//  231  547:invokestatic    #273 <Method int a.d(Parcel, int)>
	//  232  550:invokestatic    #278 <Method Integer Integer.valueOf(int)>
	//  233  553:invokestatic    #217 <Method Object a(FastJsonResponse$Field, Object)>
	//  234  556:invokespecial   #219 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
						break;
					}
				else
	//* 235  559:goto            1294
				if(((FastJsonResponse.Field) (map)).d)
	//* 236  562:aload_2         
	//* 237  563:getfield        #280 <Field boolean FastJsonResponse$Field.d>
	//* 238  566:ifeq            844
				{
					stringbuilder.append("[");
	//  239  569:aload_1         
	//  240  570:ldc1            #117 <String "[">
	//  241  572:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  242  575:pop             
label0:
					switch(((FastJsonResponse.Field) (map)).c)
	//* 243  576:aload_2         
	//* 244  577:getfield        #196 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
					{
	//* 245  580:tableswitch     0 11: default 644
	//	               0 824
	//	               1 811
	//	               2 798
	//	               3 785
	//	               4 772
	//	               5 759
	//	               6 746
	//	               7 733
	//	               8 722
	//	               9 722
	//	               10 722
	//	               11 655
					default:
						throw new IllegalStateException("Unknown field type out.");
	//  246  644:new             #282 <Class IllegalStateException>
	//  247  647:dup             
	//  248  648:ldc2            #284 <String "Unknown field type out.">
	//  249  651:invokespecial   #285 <Method void IllegalStateException(String)>
	//  250  654:athrow          

					case 11: // '\013'
						Parcel aparcel[] = com.google.android.gms.common.internal.safeparcel.a.D(parcel, k);
	//  251  655:aload_3         
	//  252  656:iload           6
	//  253  658:invokestatic    #289 <Method Parcel[] a.D(Parcel, int)>
	//  254  661:astore          8
						k = aparcel.length;
	//  255  663:aload           8
	//  256  665:arraylength     
	//  257  666:istore          6
						i = 0;
	//  258  668:iconst_0        
	//  259  669:istore          4
						do
						{
							if(i >= k)
								break label0;
	//  260  671:iload           4
	//  261  673:iload           6
	//  262  675:icmpge          834
							if(i > 0)
	//* 263  678:iload           4
	//* 264  680:ifle            690
								stringbuilder.append(",");
	//  265  683:aload_1         
	//  266  684:ldc1            #123 <String ",">
	//  267  686:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  268  689:pop             
							aparcel[i].setDataPosition(0);
	//  269  690:aload           8
	//  270  692:iload           4
	//  271  694:aaload          
	//  272  695:iconst_0        
	//  273  696:invokevirtual   #292 <Method void Parcel.setDataPosition(int)>
							a(stringbuilder, ((FastJsonResponse.Field) (map)).c(), aparcel[i]);
	//  274  699:aload_0         
	//  275  700:aload_1         
	//  276  701:aload_2         
	//  277  702:invokevirtual   #295 <Method Map com.google.android.gms.common.server.response.FastJsonResponse$Field.c()>
	//  278  705:aload           8
	//  279  707:iload           4
	//  280  709:aaload          
	//  281  710:invokespecial   #297 <Method void a(StringBuilder, Map, Parcel)>
							i++;
	//  282  713:iload           4
	//  283  715:iconst_1        
	//  284  716:iadd            
	//  285  717:istore          4
						} while(true);
	//  286  719:goto            671

					case 8: // '\b'
					case 9: // '\t'
					case 10: // '\n'
						throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//  287  722:new             #299 <Class UnsupportedOperationException>
	//  288  725:dup             
	//  289  726:ldc2            #301 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//  290  729:invokespecial   #302 <Method void UnsupportedOperationException(String)>
	//  291  732:athrow          

					case 7: // '\007'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.z(parcel, k));
	//  292  733:aload_1         
	//  293  734:aload_3         
	//  294  735:iload           6
	//  295  737:invokestatic    #306 <Method String[] a.z(Parcel, int)>
	//  296  740:invokestatic    #311 <Method void b.a(StringBuilder, String[])>
						break;

	//* 297  743:goto            834
					case 6: // '\006'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, k));
	//  298  746:aload_1         
	//  299  747:aload_3         
	//  300  748:iload           6
	//  301  750:invokestatic    #315 <Method boolean[] a.s(Parcel, int)>
	//  302  753:invokestatic    #318 <Method void b.a(StringBuilder, boolean[])>
						break;

	//* 303  756:goto            834
					case 5: // '\005'
						com.google.android.gms.common.util.b.a(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.a.y(parcel, k))));
	//  304  759:aload_1         
	//  305  760:aload_3         
	//  306  761:iload           6
	//  307  763:invokestatic    #322 <Method java.math.BigDecimal[] a.y(Parcel, int)>
	//  308  766:invokestatic    #325 <Method void b.a(StringBuilder, Object[])>
						break;

	//* 309  769:goto            834
					case 4: // '\004'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, k));
	//  310  772:aload_1         
	//  311  773:aload_3         
	//  312  774:iload           6
	//  313  776:invokestatic    #329 <Method double[] a.x(Parcel, int)>
	//  314  779:invokestatic    #332 <Method void b.a(StringBuilder, double[])>
						break;

	//* 315  782:goto            834
					case 3: // '\003'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, k));
	//  316  785:aload_1         
	//  317  786:aload_3         
	//  318  787:iload           6
	//  319  789:invokestatic    #336 <Method float[] a.w(Parcel, int)>
	//  320  792:invokestatic    #339 <Method void b.a(StringBuilder, float[])>
						break;

	//* 321  795:goto            834
					case 2: // '\002'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, k));
	//  322  798:aload_1         
	//  323  799:aload_3         
	//  324  800:iload           6
	//  325  802:invokestatic    #343 <Method long[] a.u(Parcel, int)>
	//  326  805:invokestatic    #346 <Method void b.a(StringBuilder, long[])>
						break;

	//* 327  808:goto            834
					case 1: // '\001'
						com.google.android.gms.common.util.b.a(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.a.v(parcel, k))));
	//  328  811:aload_1         
	//  329  812:aload_3         
	//  330  813:iload           6
	//  331  815:invokestatic    #350 <Method java.math.BigInteger[] a.v(Parcel, int)>
	//  332  818:invokestatic    #325 <Method void b.a(StringBuilder, Object[])>
						break;

	//* 333  821:goto            834
					case 0: // '\0'
						com.google.android.gms.common.util.b.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, k));
	//  334  824:aload_1         
	//  335  825:aload_3         
	//  336  826:iload           6
	//  337  828:invokestatic    #354 <Method int[] a.t(Parcel, int)>
	//  338  831:invokestatic    #357 <Method void b.a(StringBuilder, int[])>
						break;
					}
					stringbuilder.append("]");
	//  339  834:aload_1         
	//  340  835:ldc1            #132 <String "]">
	//  341  837:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  342  840:pop             
				} else
	//* 343  841:goto            1294
				{
					switch(((FastJsonResponse.Field) (map)).c)
	//* 344  844:aload_2         
	//* 345  845:getfield        #196 <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
					{
	//* 346  848:tableswitch     0 11: default 912
	//	               0 1283
	//	               1 1269
	//	               2 1255
	//	               3 1241
	//	               4 1227
	//	               5 1213
	//	               6 1199
	//	               7 1166
	//	               8 1133
	//	               9 1100
	//	               10 951
	//	               11 923
					default:
						throw new IllegalStateException("Unknown field type out");
	//  347  912:new             #282 <Class IllegalStateException>
	//  348  915:dup             
	//  349  916:ldc2            #359 <String "Unknown field type out">
	//  350  919:invokespecial   #285 <Method void IllegalStateException(String)>
	//  351  922:athrow          

					case 11: // '\013'
						Parcel parcel1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
	//  352  923:aload_3         
	//  353  924:iload           6
	//  354  926:invokestatic    #363 <Method Parcel a.C(Parcel, int)>
	//  355  929:astore          8
						parcel1.setDataPosition(0);
	//  356  931:aload           8
	//  357  933:iconst_0        
	//  358  934:invokevirtual   #292 <Method void Parcel.setDataPosition(int)>
						a(stringbuilder, ((FastJsonResponse.Field) (map)).c(), parcel1);
	//  359  937:aload_0         
	//  360  938:aload_1         
	//  361  939:aload_2         
	//  362  940:invokevirtual   #295 <Method Map com.google.android.gms.common.server.response.FastJsonResponse$Field.c()>
	//  363  943:aload           8
	//  364  945:invokespecial   #297 <Method void a(StringBuilder, Map, Parcel)>
						break;
	//  365  948:goto            1294

					case 10: // '\n'
						map = ((Map) (com.google.android.gms.common.internal.safeparcel.a.p(parcel, k)));
	//  366  951:aload_3         
	//  367  952:iload           6
	//  368  954:invokestatic    #202 <Method Bundle a.p(Parcel, int)>
	//  369  957:astore_2        
						Object obj = ((Object) (((Bundle) (map)).keySet()));
	//  370  958:aload_2         
	//  371  959:invokevirtual   #208 <Method Set Bundle.keySet()>
	//  372  962:astore          8
						((Set) (obj)).size();
	//  373  964:aload           8
	//  374  966:invokeinterface #364 <Method int Set.size()>
	//  375  971:pop             
						stringbuilder.append("{");
	//  376  972:aload_1         
	//  377  973:ldc2            #366 <String "{">
	//  378  976:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  379  979:pop             
						obj = ((Object) (((Set) (obj)).iterator()));
	//  380  980:aload           8
	//  381  982:invokeinterface #148 <Method Iterator Set.iterator()>
	//  382  987:astore          8
						for(i = 1; ((Iterator) (obj)).hasNext(); i = 0)
	//* 383  989:iconst_1        
	//* 384  990:istore          4
	//* 385  992:aload           8
	//* 386  994:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//* 387  999:ifeq            1089
						{
							String s1 = (String)((Iterator) (obj)).next();
	//  388 1002:aload           8
	//  389 1004:invokeinterface #158 <Method Object Iterator.next()>
	//  390 1009:checkcast       #191 <Class String>
	//  391 1012:astore          9
							if(i == 0)
	//* 392 1014:iload           4
	//* 393 1016:ifne            1026
								stringbuilder.append(",");
	//  394 1019:aload_1         
	//  395 1020:ldc1            #123 <String ",">
	//  396 1022:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  397 1025:pop             
							stringbuilder.append("\"");
	//  398 1026:aload_1         
	//  399 1027:ldc1            #87  <String "\"">
	//  400 1029:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  401 1032:pop             
							stringbuilder.append(s1);
	//  402 1033:aload_1         
	//  403 1034:aload           9
	//  404 1036:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  405 1039:pop             
							stringbuilder.append("\"");
	//  406 1040:aload_1         
	//  407 1041:ldc1            #87  <String "\"">
	//  408 1043:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  409 1046:pop             
							stringbuilder.append(":");
	//  410 1047:aload_1         
	//  411 1048:ldc2            #368 <String ":">
	//  412 1051:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  413 1054:pop             
							stringbuilder.append("\"");
	//  414 1055:aload_1         
	//  415 1056:ldc1            #87  <String "\"">
	//  416 1058:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  417 1061:pop             
							stringbuilder.append(l.a(((Bundle) (map)).getString(s1)));
	//  418 1062:aload_1         
	//  419 1063:aload_2         
	//  420 1064:aload           9
	//  421 1066:invokevirtual   #211 <Method String Bundle.getString(String)>
	//  422 1069:invokestatic    #104 <Method String l.a(String)>
	//  423 1072:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  424 1075:pop             
							stringbuilder.append("\"");
	//  425 1076:aload_1         
	//  426 1077:ldc1            #87  <String "\"">
	//  427 1079:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  428 1082:pop             
						}

	//  429 1083:iconst_0        
	//  430 1084:istore          4
	//* 431 1086:goto            992
						stringbuilder.append("}");
	//  432 1089:aload_1         
	//  433 1090:ldc2            #370 <String "}">
	//  434 1093:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  435 1096:pop             
						break;

	//* 436 1097:goto            1294
					case 9: // '\t'
						map = ((Map) (com.google.android.gms.common.internal.safeparcel.a.q(parcel, k)));
	//  437 1100:aload_3         
	//  438 1101:iload           6
	//  439 1103:invokestatic    #223 <Method byte[] a.q(Parcel, int)>
	//  440 1106:astore_2        
						stringbuilder.append("\"");
	//  441 1107:aload_1         
	//  442 1108:ldc1            #87  <String "\"">
	//  443 1110:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  444 1113:pop             
						stringbuilder.append(com.google.android.gms.common.util.c.b(((byte []) (map))));
	//  445 1114:aload_1         
	//  446 1115:aload_2         
	//  447 1116:invokestatic    #94  <Method String c.b(byte[])>
	//  448 1119:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  449 1122:pop             
						stringbuilder.append("\"");
	//  450 1123:aload_1         
	//  451 1124:ldc1            #87  <String "\"">
	//  452 1126:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  453 1129:pop             
						break;

	//* 454 1130:goto            1294
					case 8: // '\b'
						map = ((Map) (com.google.android.gms.common.internal.safeparcel.a.q(parcel, k)));
	//  455 1133:aload_3         
	//  456 1134:iload           6
	//  457 1136:invokestatic    #223 <Method byte[] a.q(Parcel, int)>
	//  458 1139:astore_2        
						stringbuilder.append("\"");
	//  459 1140:aload_1         
	//  460 1141:ldc1            #87  <String "\"">
	//  461 1143:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  462 1146:pop             
						stringbuilder.append(com.google.android.gms.common.util.c.a(((byte []) (map))));
	//  463 1147:aload_1         
	//  464 1148:aload_2         
	//  465 1149:invokestatic    #96  <Method String c.a(byte[])>
	//  466 1152:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  467 1155:pop             
						stringbuilder.append("\"");
	//  468 1156:aload_1         
	//  469 1157:ldc1            #87  <String "\"">
	//  470 1159:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  471 1162:pop             
						break;

	//* 472 1163:goto            1294
					case 7: // '\007'
						map = ((Map) (com.google.android.gms.common.internal.safeparcel.a.n(parcel, k)));
	//  473 1166:aload_3         
	//  474 1167:iload           6
	//  475 1169:invokestatic    #227 <Method String a.n(Parcel, int)>
	//  476 1172:astore_2        
						stringbuilder.append("\"");
	//  477 1173:aload_1         
	//  478 1174:ldc1            #87  <String "\"">
	//  479 1176:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  480 1179:pop             
						stringbuilder.append(l.a(((String) (map))));
	//  481 1180:aload_1         
	//  482 1181:aload_2         
	//  483 1182:invokestatic    #104 <Method String l.a(String)>
	//  484 1185:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  485 1188:pop             
						stringbuilder.append("\"");
	//  486 1189:aload_1         
	//  487 1190:ldc1            #87  <String "\"">
	//  488 1192:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  489 1195:pop             
						break;

	//* 490 1196:goto            1294
					case 6: // '\006'
						stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, k));
	//  491 1199:aload_1         
	//  492 1200:aload_3         
	//  493 1201:iload           6
	//  494 1203:invokestatic    #230 <Method boolean a.c(Parcel, int)>
	//  495 1206:invokevirtual   #373 <Method StringBuilder StringBuilder.append(boolean)>
	//  496 1209:pop             
						break;

	//* 497 1210:goto            1294
					case 5: // '\005'
						stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.a.m(parcel, k))));
	//  498 1213:aload_1         
	//  499 1214:aload_3         
	//  500 1215:iload           6
	//  501 1217:invokestatic    #240 <Method java.math.BigDecimal a.m(Parcel, int)>
	//  502 1220:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//  503 1223:pop             
						break;

	//* 504 1224:goto            1294
					case 4: // '\004'
						stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, k));
	//  505 1227:aload_1         
	//  506 1228:aload_3         
	//  507 1229:iload           6
	//  508 1231:invokestatic    #244 <Method double a.k(Parcel, int)>
	//  509 1234:invokevirtual   #376 <Method StringBuilder StringBuilder.append(double)>
	//  510 1237:pop             
						break;

	//* 511 1238:goto            1294
					case 3: // '\003'
						stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, k));
	//  512 1241:aload_1         
	//  513 1242:aload_3         
	//  514 1243:iload           6
	//  515 1245:invokestatic    #253 <Method float a.i(Parcel, int)>
	//  516 1248:invokevirtual   #379 <Method StringBuilder StringBuilder.append(float)>
	//  517 1251:pop             
						break;

	//* 518 1252:goto            1294
					case 2: // '\002'
						stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, k));
	//  519 1255:aload_1         
	//  520 1256:aload_3         
	//  521 1257:iload           6
	//  522 1259:invokestatic    #261 <Method long a.f(Parcel, int)>
	//  523 1262:invokevirtual   #382 <Method StringBuilder StringBuilder.append(long)>
	//  524 1265:pop             
						break;

	//* 525 1266:goto            1294
					case 1: // '\001'
						stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.a.h(parcel, k))));
	//  526 1269:aload_1         
	//  527 1270:aload_3         
	//  528 1271:iload           6
	//  529 1273:invokestatic    #270 <Method java.math.BigInteger a.h(Parcel, int)>
	//  530 1276:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//  531 1279:pop             
						break;

	//* 532 1280:goto            1294
					case 0: // '\0'
						stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.d(parcel, k));
	//  533 1283:aload_1         
	//  534 1284:aload_3         
	//  535 1285:iload           6
	//  536 1287:invokestatic    #273 <Method int a.d(Parcel, int)>
	//  537 1290:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//  538 1293:pop             
						break;
					}
				}
				i = 1;
	//  539 1294:iconst_1        
	//  540 1295:istore          4
			}
		} while(true);
	//  541 1297:goto            80
		if(parcel.dataPosition() == j)
	//* 542 1300:aload_3         
	//* 543 1301:invokevirtual   #180 <Method int Parcel.dataPosition()>
	//* 544 1304:iload           5
	//* 545 1306:icmpne          1317
		{
			stringbuilder.append('}');
	//  546 1309:aload_1         
	//  547 1310:bipush          125
	//  548 1312:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//  549 1315:pop             
			return;
	//  550 1316:return          
		} else
		{
			stringbuilder = new StringBuilder(37);
	//  551 1317:new             #56  <Class StringBuilder>
	//  552 1320:dup             
	//  553 1321:bipush          37
	//  554 1323:invokespecial   #59  <Method void StringBuilder(int)>
	//  555 1326:astore_1        
			stringbuilder.append("Overread allowed size end=");
	//  556 1327:aload_1         
	//  557 1328:ldc2            #384 <String "Overread allowed size end=">
	//  558 1331:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  559 1334:pop             
			stringbuilder.append(j);
	//  560 1335:aload_1         
	//  561 1336:iload           5
	//  562 1338:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//  563 1341:pop             
			throw new com.google.android.gms.common.internal.safeparcel.b(stringbuilder.toString(), parcel);
	//  564 1342:new             #386 <Class com.google.android.gms.common.internal.safeparcel.b>
	//  565 1345:dup             
	//  566 1346:aload_1         
	//  567 1347:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  568 1350:aload_3         
	//  569 1351:invokespecial   #389 <Method void com.google.android.gms.common.internal.safeparcel.b(String, Parcel)>
	//  570 1354:athrow          
		}
	}

	private final Parcel b()
	{
		switch(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int f>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 31
	//	               1 42
	//*   3   28:goto            58
		case 0: // '\0'
			g = com.google.android.gms.common.internal.safeparcel.c.a(b);
	//    4   31:aload_0         
	//    5   32:aload_0         
	//    6   33:getfield        #40  <Field Parcel b>
	//    7   36:invokestatic    #393 <Method int com.google.android.gms.common.internal.safeparcel.c.a(Parcel)>
	//    8   39:putfield        #395 <Field int g>
			// fall through

		case 1: // '\001'
			com.google.android.gms.common.internal.safeparcel.c.a(b, g);
	//    9   42:aload_0         
	//   10   43:getfield        #40  <Field Parcel b>
	//   11   46:aload_0         
	//   12   47:getfield        #395 <Field int g>
	//   13   50:invokestatic    #398 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int)>
			f = 2;
	//   14   53:aload_0         
	//   15   54:iconst_2        
	//   16   55:putfield        #53  <Field int f>
			// fall through

		default:
			return b;
	//   17   58:aload_0         
	//   18   59:getfield        #40  <Field Parcel b>
	//   19   62:areturn         
		}
	}

	public Object a(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #299 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #401 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #302 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public Map a()
	{
		zak zak1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zak d>
	//    2    4:astore_1        
		if(zak1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zak1.a(e);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #46  <Field String e>
	//   10   16:invokevirtual   #404 <Method Map com.google.android.gms.common.server.response.zak.a(String)>
	//   11   19:areturn         
	}

	public boolean b(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #299 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #401 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #302 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public String toString()
	{
		am.a(((Object) (d)), "Cannot convert to JSON on client side.");
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zak d>
	//    2    4:ldc2            #407 <String "Cannot convert to JSON on client side.">
	//    3    7:invokestatic    #409 <Method Object am.a(Object, Object)>
	//    4   10:pop             
		Parcel parcel = b();
	//    5   11:aload_0         
	//    6   12:invokespecial   #411 <Method Parcel b()>
	//    7   15:astore_1        
		parcel.setDataPosition(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #292 <Method void Parcel.setDataPosition(int)>
		StringBuilder stringbuilder = new StringBuilder(100);
	//   11   21:new             #56  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:bipush          100
	//   14   27:invokespecial   #59  <Method void StringBuilder(int)>
	//   15   30:astore_2        
		a(stringbuilder, d.a(e), parcel);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #44  <Field zak d>
	//   20   37:aload_0         
	//   21   38:getfield        #46  <Field String e>
	//   22   41:invokevirtual   #404 <Method Map com.google.android.gms.common.server.response.zak.a(String)>
	//   23   44:aload_1         
	//   24   45:invokespecial   #297 <Method void a(StringBuilder, Map, Parcel)>
		return stringbuilder.toString();
	//   25   48:aload_2         
	//   26   49:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #393 <Method int com.google.android.gms.common.internal.safeparcel.c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field int a>
	//    7   11:invokestatic    #415 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokespecial   #411 <Method Parcel b()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #418 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, Parcel, boolean)>
		int k = c;
	//   14   24:aload_0         
	//   15   25:getfield        #42  <Field int c>
	//   16   28:istore          4
		zak zak1;
		switch(k)
	//*  17   30:iload           4
		{
	//*  18   32:tableswitch     0 2: default 60
	//	               0 115
	//	               1 106
	//	               2 97
		default:
			parcel = ((Parcel) (new StringBuilder(34)));
	//   19   60:new             #56  <Class StringBuilder>
	//   20   63:dup             
	//   21   64:bipush          34
	//   22   66:invokespecial   #59  <Method void StringBuilder(int)>
	//   23   69:astore_1        
			((StringBuilder) (parcel)).append("Invalid creation type: ");
	//   24   70:aload_1         
	//   25   71:ldc2            #420 <String "Invalid creation type: ">
	//   26   74:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   27   77:pop             
			((StringBuilder) (parcel)).append(k);
	//   28   78:aload_1         
	//   29   79:iload           4
	//   30   81:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   31   84:pop             
			throw new IllegalStateException(((StringBuilder) (parcel)).toString());
	//   32   85:new             #282 <Class IllegalStateException>
	//   33   88:dup             
	//   34   89:aload_1         
	//   35   90:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   36   93:invokespecial   #285 <Method void IllegalStateException(String)>
	//   37   96:athrow          

		case 2: // '\002'
			zak1 = d;
	//   38   97:aload_0         
	//   39   98:getfield        #44  <Field zak d>
	//   40  101:astore          5
			break;

	//*  41  103:goto            118
		case 1: // '\001'
			zak1 = d;
	//   42  106:aload_0         
	//   43  107:getfield        #44  <Field zak d>
	//   44  110:astore          5
			break;

	//*  45  112:goto            118
		case 0: // '\0'
			zak1 = null;
	//   46  115:aconst_null     
	//   47  116:astore          5
			break;
		}
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (zak1)), i, false);
	//   48  118:aload_1         
	//   49  119:iconst_3        
	//   50  120:aload           5
	//   51  122:iload_2         
	//   52  123:iconst_0        
	//   53  124:invokestatic    #423 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   54  127:aload_1         
	//   55  128:iload_3         
	//   56  129:invokestatic    #398 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int)>
	//   57  132:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new f();
	private final int a;
	private final Parcel b;
	private final int c = 2;
	private final zak d;
	private final String e;
	private int f;
	private int g;

	static 
	{
	//    0    0:new             #21  <Class f>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void f()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
