// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, sv, zzasm, xo, 
//			zzawd, zzaso, zzawo, zzasi

public final class st
{

	public st(zzasi zzasi, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		j = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #58  <Long -1L>
	//    4    8:putfield        #61  <Field long j>
		k = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #63  <Field boolean k>
	//    8   16:aload_0         
	//    9   17:ldc2w           #58  <Long -1L>
	//   10   20:putfield        #65  <Field long l>
		n = -1L;
	//   11   23:aload_0         
	//   12   24:ldc2w           #58  <Long -1L>
	//   13   27:putfield        #67  <Field long n>
		o = -1;
	//   14   30:aload_0         
	//   15   31:iconst_m1       
	//   16   32:putfield        #69  <Field int o>
		p = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #71  <Field boolean p>
		q = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #73  <Field boolean q>
		r = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #75  <Field boolean r>
		s = true;
	//   26   50:aload_0         
	//   27   51:iconst_1        
	//   28   52:putfield        #77  <Field boolean s>
		t = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #79  <Field boolean t>
		u = "";
	//   32   60:aload_0         
	//   33   61:ldc1            #81  <String "">
	//   34   63:putfield        #83  <Field String u>
		v = false;
	//   35   66:aload_0         
	//   36   67:iconst_0        
	//   37   68:putfield        #85  <Field boolean v>
		w = false;
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:putfield        #87  <Field boolean w>
		A = false;
	//   41   76:aload_0         
	//   42   77:iconst_0        
	//   43   78:putfield        #89  <Field boolean A>
		C = false;
	//   44   81:aload_0         
	//   45   82:iconst_0        
	//   46   83:putfield        #91  <Field boolean C>
		b = s1;
	//   47   86:aload_0         
	//   48   87:aload_2         
	//   49   88:putfield        #93  <Field String b>
		N = zzasi;
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:putfield        #95  <Field zzasi N>
	//   53   96:return          
	}

	private static String a(Map map, String s1)
	{
		map = ((Map) ((List)map.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #103 <Method Object Map.get(Object)>
	//    3    7:checkcast       #105 <Class List>
	//    4   10:astore_0        
		if(map != null && !((List) (map)).isEmpty())
	//*   5   11:aload_0         
	//*   6   12:ifnull          35
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #109 <Method boolean List.isEmpty()>
	//*   9   21:ifne            35
			return (String)((List) (map)).get(0);
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #112 <Method Object List.get(int)>
	//   13   31:checkcast       #114 <Class String>
	//   14   34:areturn         
		else
			return null;
	//   15   35:aconst_null     
	//   16   36:areturn         
	}

	private static long b(Map map, String s1)
	{
		map = ((Map) ((List)map.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #103 <Method Object Map.get(Object)>
	//    3    7:checkcast       #105 <Class List>
	//    4   10:astore_0        
		if(map == null || ((List) (map)).isEmpty()) goto _L2; else goto _L1
	//    5   11:aload_0         
	//    6   12:ifnull          105
	//    7   15:aload_0         
	//    8   16:invokeinterface #109 <Method boolean List.isEmpty()>
	//    9   21:ifne            105
_L1:
		map = ((Map) ((String)((List) (map)).get(0)));
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #112 <Method Object List.get(int)>
	//   13   31:checkcast       #114 <Class String>
	//   14   34:astore_0        
		float f1 = Float.parseFloat(((String) (map)));
	//   15   35:aload_0         
	//   16   36:invokestatic    #123 <Method float Float.parseFloat(String)>
	//   17   39:fstore_2        
		return (long)(f1 * 1000F);
	//   18   40:fload_2         
	//   19   41:ldc1            #124 <Float 1000F>
	//   20   43:fmul            
	//   21   44:f2l             
	//   22   45:lreturn         
_L4:
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 36 + String.valueOf(((Object) (map))).length());
	//   23   46:new             #126 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:aload_1         
	//   26   51:invokestatic    #130 <Method String String.valueOf(Object)>
	//   27   54:invokevirtual   #134 <Method int String.length()>
	//   28   57:bipush          36
	//   29   59:iadd            
	//   30   60:aload_0         
	//   31   61:invokestatic    #130 <Method String String.valueOf(Object)>
	//   32   64:invokevirtual   #134 <Method int String.length()>
	//   33   67:iadd            
	//   34   68:invokespecial   #137 <Method void StringBuilder(int)>
	//   35   71:astore_3        
		stringbuilder.append("Could not parse float from ");
	//   36   72:aload_3         
	//   37   73:ldc1            #139 <String "Could not parse float from ">
	//   38   75:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		stringbuilder.append(s1);
	//   40   79:aload_3         
	//   41   80:aload_1         
	//   42   81:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   43   84:pop             
		stringbuilder.append(" header: ");
	//   44   85:aload_3         
	//   45   86:ldc1            #145 <String " header: ">
	//   46   88:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
		stringbuilder.append(((String) (map)));
	//   48   92:aload_3         
	//   49   93:aload_0         
	//   50   94:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		wx.e(stringbuilder.toString());
	//   52   98:aload_3         
	//   53   99:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   54  102:invokestatic    #154 <Method void wx.e(String)>
_L2:
		return -1L;
	//   55  105:ldc2w           #58  <Long -1L>
	//   56  108:lreturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   57  109:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  58  110:goto            46
	}

	private static List c(Map map, String s1)
	{
		map = ((Map) ((List)map.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #103 <Method Object Map.get(Object)>
	//    3    7:checkcast       #105 <Class List>
	//    4   10:astore_0        
		if(map != null && !((List) (map)).isEmpty())
	//*   5   11:aload_0         
	//*   6   12:ifnull          52
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #109 <Method boolean List.isEmpty()>
	//*   9   21:ifne            52
		{
			map = ((Map) ((String)((List) (map)).get(0)));
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #112 <Method Object List.get(int)>
	//   13   31:checkcast       #114 <Class String>
	//   14   34:astore_0        
			if(map != null)
	//*  15   35:aload_0         
	//*  16   36:ifnull          52
				return Arrays.asList(((Object []) (((String) (map)).trim().split("\\s+"))));
	//   17   39:aload_0         
	//   18   40:invokevirtual   #158 <Method String String.trim()>
	//   19   43:ldc1            #160 <String "\\s+">
	//   20   45:invokevirtual   #164 <Method String[] String.split(String)>
	//   21   48:invokestatic    #170 <Method List Arrays.asList(Object[])>
	//   22   51:areturn         
		}
		return null;
	//   23   52:aconst_null     
	//   24   53:areturn         
	}

	private static boolean d(Map map, String s1)
	{
		map = ((Map) ((List)map.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #103 <Method Object Map.get(Object)>
	//    3    7:checkcast       #105 <Class List>
	//    4   10:astore_0        
		if(map != null)
	//*   5   11:aload_0         
	//*   6   12:ifnull          43
		{
			if(((List) (map)).isEmpty())
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #109 <Method boolean List.isEmpty()>
	//*   9   21:ifeq            26
				return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
			else
				return Boolean.valueOf((String)((List) (map)).get(0)).booleanValue();
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokeinterface #112 <Method Object List.get(int)>
	//   15   33:checkcast       #114 <Class String>
	//   16   36:invokestatic    #176 <Method Boolean Boolean.valueOf(String)>
	//   17   39:invokevirtual   #179 <Method boolean Boolean.booleanValue()>
	//   18   42:ireturn         
		} else
		{
			return false;
	//   19   43:iconst_0        
	//   20   44:ireturn         
		}
	}

	public final zzasm a(long l1, sv sv1)
	{
		zzasi zzasi = N;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field zzasi N>
	//    2    4:astore          23
		String s1 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #93  <Field String b>
	//    5   10:astore          24
		String s2 = c;
	//    6   12:aload_0         
	//    7   13:getfield        #182 <Field String c>
	//    8   16:astore          25
		List list = d;
	//    9   18:aload_0         
	//   10   19:getfield        #184 <Field List d>
	//   11   22:astore          26
		List list1 = h;
	//   12   24:aload_0         
	//   13   25:getfield        #186 <Field List h>
	//   14   28:astore          27
		long l2 = j;
	//   15   30:aload_0         
	//   16   31:getfield        #61  <Field long j>
	//   17   34:lstore          6
		boolean flag = k;
	//   18   36:aload_0         
	//   19   37:getfield        #63  <Field boolean k>
	//   20   40:istore          10
		List list2 = m;
	//   21   42:aload_0         
	//   22   43:getfield        #188 <Field List m>
	//   23   46:astore          28
		long l3 = n;
	//   24   48:aload_0         
	//   25   49:getfield        #67  <Field long n>
	//   26   52:lstore          8
		int i1 = o;
	//   27   54:aload_0         
	//   28   55:getfield        #69  <Field int o>
	//   29   58:istore          5
		String s3 = a;
	//   30   60:aload_0         
	//   31   61:getfield        #190 <Field String a>
	//   32   64:astore          29
		String s4 = f;
	//   33   66:aload_0         
	//   34   67:getfield        #192 <Field String f>
	//   35   70:astore          30
		String s5 = g;
	//   36   72:aload_0         
	//   37   73:getfield        #194 <Field String g>
	//   38   76:astore          31
		boolean flag1 = p;
	//   39   78:aload_0         
	//   40   79:getfield        #71  <Field boolean p>
	//   41   82:istore          11
		boolean flag2 = q;
	//   42   84:aload_0         
	//   43   85:getfield        #73  <Field boolean q>
	//   44   88:istore          12
		boolean flag3 = r;
	//   45   90:aload_0         
	//   46   91:getfield        #75  <Field boolean r>
	//   47   94:istore          13
		boolean flag4 = s;
	//   48   96:aload_0         
	//   49   97:getfield        #77  <Field boolean s>
	//   50  100:istore          14
		String s6 = u;
	//   51  102:aload_0         
	//   52  103:getfield        #83  <Field String u>
	//   53  106:astore          32
		boolean flag5 = v;
	//   54  108:aload_0         
	//   55  109:getfield        #85  <Field boolean v>
	//   56  112:istore          15
		boolean flag6 = w;
	//   57  114:aload_0         
	//   58  115:getfield        #87  <Field boolean w>
	//   59  118:istore          16
		zzawd zzawd1 = x;
	//   60  120:aload_0         
	//   61  121:getfield        #196 <Field zzawd x>
	//   62  124:astore          33
		List list3 = y;
	//   63  126:aload_0         
	//   64  127:getfield        #198 <Field List y>
	//   65  130:astore          34
		List list4 = z;
	//   66  132:aload_0         
	//   67  133:getfield        #200 <Field List z>
	//   68  136:astore          35
		boolean flag7 = A;
	//   69  138:aload_0         
	//   70  139:getfield        #89  <Field boolean A>
	//   71  142:istore          17
		zzaso zzaso1 = B;
	//   72  144:aload_0         
	//   73  145:getfield        #202 <Field zzaso B>
	//   74  148:astore          36
		boolean flag8 = C;
	//   75  150:aload_0         
	//   76  151:getfield        #91  <Field boolean C>
	//   77  154:istore          18
		String s7 = D;
	//   78  156:aload_0         
	//   79  157:getfield        #204 <Field String D>
	//   80  160:astore          37
		List list5 = E;
	//   81  162:aload_0         
	//   82  163:getfield        #206 <Field List E>
	//   83  166:astore          38
		boolean flag9 = F;
	//   84  168:aload_0         
	//   85  169:getfield        #208 <Field boolean F>
	//   86  172:istore          19
		String s8 = G;
	//   87  174:aload_0         
	//   88  175:getfield        #210 <Field String G>
	//   89  178:astore          39
		zzawo zzawo1 = H;
	//   90  180:aload_0         
	//   91  181:getfield        #212 <Field zzawo H>
	//   92  184:astore          40
		String s9 = e;
	//   93  186:aload_0         
	//   94  187:getfield        #214 <Field String e>
	//   95  190:astore          41
		boolean flag10 = t;
	//   96  192:aload_0         
	//   97  193:getfield        #79  <Field boolean t>
	//   98  196:istore          20
		boolean flag11 = I;
	//   99  198:aload_0         
	//  100  199:getfield        #216 <Field boolean I>
	//  101  202:istore          21
		boolean flag12 = J;
	//  102  204:aload_0         
	//  103  205:getfield        #218 <Field boolean J>
	//  104  208:istore          22
		byte byte0;
		if(sv1.g())
	//* 105  210:aload_3         
	//* 106  211:invokevirtual   #222 <Method boolean sv.g()>
	//* 107  214:ifeq            223
			byte0 = 2;
	//  108  217:iconst_2        
	//  109  218:istore          4
		else
	//* 110  220:goto            226
			byte0 = 1;
	//  111  223:iconst_1        
	//  112  224:istore          4
		return new zzasm(zzasi, s1, s2, list, list1, l2, flag, -1L, list2, l3, i1, s3, l1, s4, s5, flag1, flag2, flag3, flag4, false, s6, flag5, flag6, zzawd1, list3, list4, flag7, zzaso1, flag8, s7, list5, flag9, s8, zzawo1, s9, flag10, flag11, flag12, ((int) (byte0)), K, i, L, M, sv1.h(), sv1.i());
	//  113  226:new             #224 <Class zzasm>
	//  114  229:dup             
	//  115  230:aload           23
	//  116  232:aload           24
	//  117  234:aload           25
	//  118  236:aload           26
	//  119  238:aload           27
	//  120  240:lload           6
	//  121  242:iload           10
	//  122  244:ldc2w           #58  <Long -1L>
	//  123  247:aload           28
	//  124  249:lload           8
	//  125  251:iload           5
	//  126  253:aload           29
	//  127  255:lload_1         
	//  128  256:aload           30
	//  129  258:aload           31
	//  130  260:iload           11
	//  131  262:iload           12
	//  132  264:iload           13
	//  133  266:iload           14
	//  134  268:iconst_0        
	//  135  269:aload           32
	//  136  271:iload           15
	//  137  273:iload           16
	//  138  275:aload           33
	//  139  277:aload           34
	//  140  279:aload           35
	//  141  281:iload           17
	//  142  283:aload           36
	//  143  285:iload           18
	//  144  287:aload           37
	//  145  289:aload           38
	//  146  291:iload           19
	//  147  293:aload           39
	//  148  295:aload           40
	//  149  297:aload           41
	//  150  299:iload           20
	//  151  301:iload           21
	//  152  303:iload           22
	//  153  305:iload           4
	//  154  307:aload_0         
	//  155  308:getfield        #226 <Field boolean K>
	//  156  311:aload_0         
	//  157  312:getfield        #228 <Field List i>
	//  158  315:aload_0         
	//  159  316:getfield        #230 <Field boolean L>
	//  160  319:aload_0         
	//  161  320:getfield        #232 <Field String M>
	//  162  323:aload_3         
	//  163  324:invokevirtual   #234 <Method String sv.h()>
	//  164  327:aload_3         
	//  165  328:invokevirtual   #236 <Method boolean sv.i()>
	//  166  331:invokespecial   #239 <Method void zzasm(zzasi, String, String, List, List, long, boolean, long, List, long, int, String, long, String, String, boolean, boolean, boolean, boolean, boolean, String, boolean, boolean, zzawd, List, List, boolean, zzaso, boolean, String, List, boolean, String, zzawo, String, boolean, boolean, boolean, int, boolean, List, boolean, String, String, boolean)>
	//  167  334:areturn         
	}

	public final void a(String s1, Map map, String s2)
	{
		c = s2;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #182 <Field String c>
		a(map);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #243 <Method void a(Map)>
	//    6   10:return          
	}

	public final void a(Map map)
	{
		a = a(map, "X-Afma-Ad-Size");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #247 <String "X-Afma-Ad-Size">
	//    3    4:invokestatic    #249 <Method String a(Map, String)>
	//    4    7:putfield        #190 <Field String a>
		G = a(map, "X-Afma-Ad-Slot-Size");
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:ldc1            #251 <String "X-Afma-Ad-Slot-Size">
	//    8   14:invokestatic    #249 <Method String a(Map, String)>
	//    9   17:putfield        #210 <Field String G>
		Object obj = ((Object) (c(map, "X-Afma-Click-Tracking-Urls")));
	//   10   20:aload_1         
	//   11   21:ldc1            #253 <String "X-Afma-Click-Tracking-Urls">
	//   12   23:invokestatic    #255 <Method List c(Map, String)>
	//   13   26:astore          4
		if(obj != null)
	//*  14   28:aload           4
	//*  15   30:ifnull          39
			d = ((List) (obj));
	//   16   33:aload_0         
	//   17   34:aload           4
	//   18   36:putfield        #184 <Field List d>
		e = a(map, "X-Afma-Debug-Signals");
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:ldc2            #257 <String "X-Afma-Debug-Signals">
	//   22   44:invokestatic    #249 <Method String a(Map, String)>
	//   23   47:putfield        #214 <Field String e>
		obj = ((Object) ((List)map.get("X-Afma-Debug-Dialog")));
	//   24   50:aload_1         
	//   25   51:ldc2            #259 <String "X-Afma-Debug-Dialog">
	//   26   54:invokeinterface #103 <Method Object Map.get(Object)>
	//   27   59:checkcast       #105 <Class List>
	//   28   62:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//*  29   64:aload           4
	//*  30   66:ifnull          94
	//*  31   69:aload           4
	//*  32   71:invokeinterface #109 <Method boolean List.isEmpty()>
	//*  33   76:ifne            94
			f = (String)((List) (obj)).get(0);
	//   34   79:aload_0         
	//   35   80:aload           4
	//   36   82:iconst_0        
	//   37   83:invokeinterface #112 <Method Object List.get(int)>
	//   38   88:checkcast       #114 <Class String>
	//   39   91:putfield        #192 <Field String f>
		obj = ((Object) (c(map, "X-Afma-Tracking-Urls")));
	//   40   94:aload_1         
	//   41   95:ldc2            #261 <String "X-Afma-Tracking-Urls">
	//   42   98:invokestatic    #255 <Method List c(Map, String)>
	//   43  101:astore          4
		if(obj != null)
	//*  44  103:aload           4
	//*  45  105:ifnull          114
			h = ((List) (obj));
	//   46  108:aload_0         
	//   47  109:aload           4
	//   48  111:putfield        #186 <Field List h>
		obj = ((Object) (c(map, "X-Afma-Downloaded-Impression-Urls")));
	//   49  114:aload_1         
	//   50  115:ldc2            #263 <String "X-Afma-Downloaded-Impression-Urls">
	//   51  118:invokestatic    #255 <Method List c(Map, String)>
	//   52  121:astore          4
		if(obj != null)
	//*  53  123:aload           4
	//*  54  125:ifnull          134
			i = ((List) (obj));
	//   55  128:aload_0         
	//   56  129:aload           4
	//   57  131:putfield        #228 <Field List i>
		long l1 = b(map, "X-Afma-Interstitial-Timeout");
	//   58  134:aload_1         
	//   59  135:ldc2            #265 <String "X-Afma-Interstitial-Timeout">
	//   60  138:invokestatic    #267 <Method long b(Map, String)>
	//   61  141:lstore_2        
		if(l1 != -1L)
	//*  62  142:lload_2         
	//*  63  143:ldc2w           #58  <Long -1L>
	//*  64  146:lcmp            
	//*  65  147:ifeq            155
			j = l1;
	//   66  150:aload_0         
	//   67  151:lload_2         
	//   68  152:putfield        #61  <Field long j>
		k = k | d(map, "X-Afma-Mediation");
	//   69  155:aload_0         
	//   70  156:aload_0         
	//   71  157:getfield        #63  <Field boolean k>
	//   72  160:aload_1         
	//   73  161:ldc2            #269 <String "X-Afma-Mediation">
	//   74  164:invokestatic    #271 <Method boolean d(Map, String)>
	//   75  167:ior             
	//   76  168:putfield        #63  <Field boolean k>
		obj = ((Object) (c(map, "X-Afma-Manual-Tracking-Urls")));
	//   77  171:aload_1         
	//   78  172:ldc2            #273 <String "X-Afma-Manual-Tracking-Urls">
	//   79  175:invokestatic    #255 <Method List c(Map, String)>
	//   80  178:astore          4
		if(obj != null)
	//*  81  180:aload           4
	//*  82  182:ifnull          191
			m = ((List) (obj));
	//   83  185:aload_0         
	//   84  186:aload           4
	//   85  188:putfield        #188 <Field List m>
		l1 = b(map, "X-Afma-Refresh-Rate");
	//   86  191:aload_1         
	//   87  192:ldc2            #275 <String "X-Afma-Refresh-Rate">
	//   88  195:invokestatic    #267 <Method long b(Map, String)>
	//   89  198:lstore_2        
		if(l1 != -1L)
	//*  90  199:lload_2         
	//*  91  200:ldc2w           #58  <Long -1L>
	//*  92  203:lcmp            
	//*  93  204:ifeq            212
			n = l1;
	//   94  207:aload_0         
	//   95  208:lload_2         
	//   96  209:putfield        #67  <Field long n>
		obj = ((Object) ((List)map.get("X-Afma-Orientation")));
	//   97  212:aload_1         
	//   98  213:ldc2            #277 <String "X-Afma-Orientation">
	//   99  216:invokeinterface #103 <Method Object Map.get(Object)>
	//  100  221:checkcast       #105 <Class List>
	//  101  224:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//* 102  226:aload           4
	//* 103  228:ifnull          299
	//* 104  231:aload           4
	//* 105  233:invokeinterface #109 <Method boolean List.isEmpty()>
	//* 106  238:ifne            299
		{
			obj = ((Object) ((String)((List) (obj)).get(0)));
	//  107  241:aload           4
	//  108  243:iconst_0        
	//  109  244:invokeinterface #112 <Method Object List.get(int)>
	//  110  249:checkcast       #114 <Class String>
	//  111  252:astore          4
			if("portrait".equalsIgnoreCase(((String) (obj))))
	//* 112  254:ldc2            #279 <String "portrait">
	//* 113  257:aload           4
	//* 114  259:invokevirtual   #283 <Method boolean String.equalsIgnoreCase(String)>
	//* 115  262:ifeq            278
				o = aw.g().b();
	//  116  265:aload_0         
	//  117  266:invokestatic    #288 <Method xo aw.g()>
	//  118  269:invokevirtual   #292 <Method int xo.b()>
	//  119  272:putfield        #69  <Field int o>
			else
	//* 120  275:goto            299
			if("landscape".equalsIgnoreCase(((String) (obj))))
	//* 121  278:ldc2            #294 <String "landscape">
	//* 122  281:aload           4
	//* 123  283:invokevirtual   #283 <Method boolean String.equalsIgnoreCase(String)>
	//* 124  286:ifeq            299
				o = aw.g().a();
	//  125  289:aload_0         
	//  126  290:invokestatic    #288 <Method xo aw.g()>
	//  127  293:invokevirtual   #296 <Method int xo.a()>
	//  128  296:putfield        #69  <Field int o>
		}
		g = a(map, "X-Afma-ActiveView");
	//  129  299:aload_0         
	//  130  300:aload_1         
	//  131  301:ldc2            #298 <String "X-Afma-ActiveView">
	//  132  304:invokestatic    #249 <Method String a(Map, String)>
	//  133  307:putfield        #194 <Field String g>
		obj = ((Object) ((List)map.get("X-Afma-Use-HTTPS")));
	//  134  310:aload_1         
	//  135  311:ldc2            #300 <String "X-Afma-Use-HTTPS">
	//  136  314:invokeinterface #103 <Method Object Map.get(Object)>
	//  137  319:checkcast       #105 <Class List>
	//  138  322:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//* 139  324:aload           4
	//* 140  326:ifnull          360
	//* 141  329:aload           4
	//* 142  331:invokeinterface #109 <Method boolean List.isEmpty()>
	//* 143  336:ifne            360
			r = Boolean.valueOf((String)((List) (obj)).get(0)).booleanValue();
	//  144  339:aload_0         
	//  145  340:aload           4
	//  146  342:iconst_0        
	//  147  343:invokeinterface #112 <Method Object List.get(int)>
	//  148  348:checkcast       #114 <Class String>
	//  149  351:invokestatic    #176 <Method Boolean Boolean.valueOf(String)>
	//  150  354:invokevirtual   #179 <Method boolean Boolean.booleanValue()>
	//  151  357:putfield        #75  <Field boolean r>
		p = p | d(map, "X-Afma-Custom-Rendering-Allowed");
	//  152  360:aload_0         
	//  153  361:aload_0         
	//  154  362:getfield        #71  <Field boolean p>
	//  155  365:aload_1         
	//  156  366:ldc2            #302 <String "X-Afma-Custom-Rendering-Allowed">
	//  157  369:invokestatic    #271 <Method boolean d(Map, String)>
	//  158  372:ior             
	//  159  373:putfield        #71  <Field boolean p>
		q = "native".equals(((Object) (a(map, "X-Afma-Ad-Format"))));
	//  160  376:aload_0         
	//  161  377:ldc2            #304 <String "native">
	//  162  380:aload_1         
	//  163  381:ldc2            #306 <String "X-Afma-Ad-Format">
	//  164  384:invokestatic    #249 <Method String a(Map, String)>
	//  165  387:invokevirtual   #310 <Method boolean String.equals(Object)>
	//  166  390:putfield        #73  <Field boolean q>
		obj = ((Object) ((List)map.get("X-Afma-Content-Url-Opted-Out")));
	//  167  393:aload_1         
	//  168  394:ldc2            #312 <String "X-Afma-Content-Url-Opted-Out">
	//  169  397:invokeinterface #103 <Method Object Map.get(Object)>
	//  170  402:checkcast       #105 <Class List>
	//  171  405:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//* 172  407:aload           4
	//* 173  409:ifnull          443
	//* 174  412:aload           4
	//* 175  414:invokeinterface #109 <Method boolean List.isEmpty()>
	//* 176  419:ifne            443
			s = Boolean.valueOf((String)((List) (obj)).get(0)).booleanValue();
	//  177  422:aload_0         
	//  178  423:aload           4
	//  179  425:iconst_0        
	//  180  426:invokeinterface #112 <Method Object List.get(int)>
	//  181  431:checkcast       #114 <Class String>
	//  182  434:invokestatic    #176 <Method Boolean Boolean.valueOf(String)>
	//  183  437:invokevirtual   #179 <Method boolean Boolean.booleanValue()>
	//  184  440:putfield        #77  <Field boolean s>
		obj = ((Object) ((List)map.get("X-Afma-Content-Vertical-Opted-Out")));
	//  185  443:aload_1         
	//  186  444:ldc2            #314 <String "X-Afma-Content-Vertical-Opted-Out">
	//  187  447:invokeinterface #103 <Method Object Map.get(Object)>
	//  188  452:checkcast       #105 <Class List>
	//  189  455:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//* 190  457:aload           4
	//* 191  459:ifnull          493
	//* 192  462:aload           4
	//* 193  464:invokeinterface #109 <Method boolean List.isEmpty()>
	//* 194  469:ifne            493
			t = Boolean.valueOf((String)((List) (obj)).get(0)).booleanValue();
	//  195  472:aload_0         
	//  196  473:aload           4
	//  197  475:iconst_0        
	//  198  476:invokeinterface #112 <Method Object List.get(int)>
	//  199  481:checkcast       #114 <Class String>
	//  200  484:invokestatic    #176 <Method Boolean Boolean.valueOf(String)>
	//  201  487:invokevirtual   #179 <Method boolean Boolean.booleanValue()>
	//  202  490:putfield        #79  <Field boolean t>
		obj = ((Object) ((List)map.get("X-Afma-Gws-Query-Id")));
	//  203  493:aload_1         
	//  204  494:ldc2            #316 <String "X-Afma-Gws-Query-Id">
	//  205  497:invokeinterface #103 <Method Object Map.get(Object)>
	//  206  502:checkcast       #105 <Class List>
	//  207  505:astore          4
		if(obj != null && !((List) (obj)).isEmpty())
	//* 208  507:aload           4
	//* 209  509:ifnull          537
	//* 210  512:aload           4
	//* 211  514:invokeinterface #109 <Method boolean List.isEmpty()>
	//* 212  519:ifne            537
			u = (String)((List) (obj)).get(0);
	//  213  522:aload_0         
	//  214  523:aload           4
	//  215  525:iconst_0        
	//  216  526:invokeinterface #112 <Method Object List.get(int)>
	//  217  531:checkcast       #114 <Class String>
	//  218  534:putfield        #83  <Field String u>
		obj = ((Object) (a(map, "X-Afma-Fluid")));
	//  219  537:aload_1         
	//  220  538:ldc2            #318 <String "X-Afma-Fluid">
	//  221  541:invokestatic    #249 <Method String a(Map, String)>
	//  222  544:astore          4
		if(obj != null && ((String) (obj)).equals("height"))
	//* 223  546:aload           4
	//* 224  548:ifnull          567
	//* 225  551:aload           4
	//* 226  553:ldc2            #320 <String "height">
	//* 227  556:invokevirtual   #310 <Method boolean String.equals(Object)>
	//* 228  559:ifeq            567
			v = true;
	//  229  562:aload_0         
	//  230  563:iconst_1        
	//  231  564:putfield        #85  <Field boolean v>
		w = "native_express".equals(((Object) (a(map, "X-Afma-Ad-Format"))));
	//  232  567:aload_0         
	//  233  568:ldc2            #322 <String "native_express">
	//  234  571:aload_1         
	//  235  572:ldc2            #306 <String "X-Afma-Ad-Format">
	//  236  575:invokestatic    #249 <Method String a(Map, String)>
	//  237  578:invokevirtual   #310 <Method boolean String.equals(Object)>
	//  238  581:putfield        #87  <Field boolean w>
		x = zzawd.a(a(map, "X-Afma-Rewards"));
	//  239  584:aload_0         
	//  240  585:aload_1         
	//  241  586:ldc2            #324 <String "X-Afma-Rewards">
	//  242  589:invokestatic    #249 <Method String a(Map, String)>
	//  243  592:invokestatic    #329 <Method zzawd zzawd.a(String)>
	//  244  595:putfield        #196 <Field zzawd x>
		if(y == null)
	//* 245  598:aload_0         
	//* 246  599:getfield        #198 <Field List y>
	//* 247  602:ifnonnull       616
			y = c(map, "X-Afma-Reward-Video-Start-Urls");
	//  248  605:aload_0         
	//  249  606:aload_1         
	//  250  607:ldc2            #331 <String "X-Afma-Reward-Video-Start-Urls">
	//  251  610:invokestatic    #255 <Method List c(Map, String)>
	//  252  613:putfield        #198 <Field List y>
		if(z == null)
	//* 253  616:aload_0         
	//* 254  617:getfield        #200 <Field List z>
	//* 255  620:ifnonnull       634
			z = c(map, "X-Afma-Reward-Video-Complete-Urls");
	//  256  623:aload_0         
	//  257  624:aload_1         
	//  258  625:ldc2            #333 <String "X-Afma-Reward-Video-Complete-Urls">
	//  259  628:invokestatic    #255 <Method List c(Map, String)>
	//  260  631:putfield        #200 <Field List z>
		A = A | d(map, "X-Afma-Use-Displayed-Impression");
	//  261  634:aload_0         
	//  262  635:aload_0         
	//  263  636:getfield        #89  <Field boolean A>
	//  264  639:aload_1         
	//  265  640:ldc2            #335 <String "X-Afma-Use-Displayed-Impression">
	//  266  643:invokestatic    #271 <Method boolean d(Map, String)>
	//  267  646:ior             
	//  268  647:putfield        #89  <Field boolean A>
		C = C | d(map, "X-Afma-Auto-Collect-Location");
	//  269  650:aload_0         
	//  270  651:aload_0         
	//  271  652:getfield        #91  <Field boolean C>
	//  272  655:aload_1         
	//  273  656:ldc2            #337 <String "X-Afma-Auto-Collect-Location">
	//  274  659:invokestatic    #271 <Method boolean d(Map, String)>
	//  275  662:ior             
	//  276  663:putfield        #91  <Field boolean C>
		D = a(map, "Set-Cookie");
	//  277  666:aload_0         
	//  278  667:aload_1         
	//  279  668:ldc2            #339 <String "Set-Cookie">
	//  280  671:invokestatic    #249 <Method String a(Map, String)>
	//  281  674:putfield        #204 <Field String D>
		obj = ((Object) (a(map, "X-Afma-Auto-Protection-Configuration")));
	//  282  677:aload_1         
	//  283  678:ldc2            #341 <String "X-Afma-Auto-Protection-Configuration">
	//  284  681:invokestatic    #249 <Method String a(Map, String)>
	//  285  684:astore          4
		if(obj != null && !TextUtils.isEmpty(((CharSequence) (obj))))
	//* 286  686:aload           4
	//* 287  688:ifnull          745
	//* 288  691:aload           4
	//* 289  693:invokestatic    #346 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 290  696:ifeq            702
	//* 291  699:goto            745
		{
			try
			{
				B = zzaso.a(new JSONObject(((String) (obj))));
	//  292  702:aload_0         
	//  293  703:new             #348 <Class JSONObject>
	//  294  706:dup             
	//  295  707:aload           4
	//  296  709:invokespecial   #350 <Method void JSONObject(String)>
	//  297  712:invokestatic    #355 <Method zzaso zzaso.a(JSONObject)>
	//  298  715:putfield        #202 <Field zzaso B>
			}
	//* 299  718:goto            862
			catch(JSONException jsonexception)
	//* 300  721:astore          4
			{
				wx.c("Error parsing configuration JSON", ((Throwable) (jsonexception)));
	//  301  723:ldc2            #357 <String "Error parsing configuration JSON">
	//  302  726:aload           4
	//  303  728:invokestatic    #360 <Method void wx.c(String, Throwable)>
				B = new zzaso();
	//  304  731:aload_0         
	//  305  732:new             #352 <Class zzaso>
	//  306  735:dup             
	//  307  736:invokespecial   #361 <Method void zzaso()>
	//  308  739:putfield        #202 <Field zzaso B>
			}
		} else
	//* 309  742:goto            862
		{
			jsonexception = ((JSONException) (Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon()));
	//  310  745:ldc2            #363 <String "https://pagead2.googlesyndication.com/pagead/gen_204">
	//  311  748:invokestatic    #369 <Method Uri Uri.parse(String)>
	//  312  751:invokevirtual   #373 <Method android.net.Uri$Builder Uri.buildUpon()>
	//  313  754:astore          4
			((android.net.Uri.Builder) (jsonexception)).appendQueryParameter("id", "gmob-apps-blocked-navigation");
	//  314  756:aload           4
	//  315  758:ldc2            #375 <String "id">
	//  316  761:ldc2            #377 <String "gmob-apps-blocked-navigation">
	//  317  764:invokevirtual   #383 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  318  767:pop             
			if(!TextUtils.isEmpty(((CharSequence) (f))))
	//* 319  768:aload_0         
	//* 320  769:getfield        #192 <Field String f>
	//* 321  772:invokestatic    #346 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 322  775:ifne            791
				((android.net.Uri.Builder) (jsonexception)).appendQueryParameter("debugDialog", f);
	//  323  778:aload           4
	//  324  780:ldc2            #385 <String "debugDialog">
	//  325  783:aload_0         
	//  326  784:getfield        #192 <Field String f>
	//  327  787:invokevirtual   #383 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  328  790:pop             
			jsonexception = ((JSONException) (((android.net.Uri.Builder) (jsonexception)).toString()));
	//  329  791:aload           4
	//  330  793:invokevirtual   #386 <Method String android.net.Uri$Builder.toString()>
	//  331  796:astore          4
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (jsonexception))).length() + 31);
	//  332  798:new             #126 <Class StringBuilder>
	//  333  801:dup             
	//  334  802:aload           4
	//  335  804:invokestatic    #130 <Method String String.valueOf(Object)>
	//  336  807:invokevirtual   #134 <Method int String.length()>
	//  337  810:bipush          31
	//  338  812:iadd            
	//  339  813:invokespecial   #137 <Method void StringBuilder(int)>
	//  340  816:astore          5
			stringbuilder.append(((String) (jsonexception)));
	//  341  818:aload           5
	//  342  820:aload           4
	//  343  822:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  344  825:pop             
			stringbuilder.append("&navigationURL={NAVIGATION_URL}");
	//  345  826:aload           5
	//  346  828:ldc2            #388 <String "&navigationURL={NAVIGATION_URL}">
	//  347  831:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  348  834:pop             
			B = new zzaso(true, Arrays.asList(((Object []) (new String[] {
				stringbuilder.toString()
			}))));
	//  349  835:aload_0         
	//  350  836:new             #352 <Class zzaso>
	//  351  839:dup             
	//  352  840:iconst_1        
	//  353  841:iconst_1        
	//  354  842:anewarray       String[]
	//  355  845:dup             
	//  356  846:iconst_0        
	//  357  847:aload           5
	//  358  849:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  359  852:aastore         
	//  360  853:invokestatic    #170 <Method List Arrays.asList(Object[])>
	//  361  856:invokespecial   #391 <Method void zzaso(boolean, List)>
	//  362  859:putfield        #202 <Field zzaso B>
		}
		jsonexception = ((JSONException) (c(map, "X-Afma-Remote-Ping-Urls")));
	//  363  862:aload_1         
	//  364  863:ldc2            #393 <String "X-Afma-Remote-Ping-Urls">
	//  365  866:invokestatic    #255 <Method List c(Map, String)>
	//  366  869:astore          4
		if(jsonexception != null)
	//* 367  871:aload           4
	//* 368  873:ifnull          882
			E = ((List) (jsonexception));
	//  369  876:aload_0         
	//  370  877:aload           4
	//  371  879:putfield        #206 <Field List E>
		jsonexception = ((JSONException) (a(map, "X-Afma-Safe-Browsing")));
	//  372  882:aload_1         
	//  373  883:ldc2            #395 <String "X-Afma-Safe-Browsing">
	//  374  886:invokestatic    #249 <Method String a(Map, String)>
	//  375  889:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (jsonexception))))
	//* 376  891:aload           4
	//* 377  893:invokestatic    #346 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 378  896:ifne            928
			try
			{
				H = zzawo.a(new JSONObject(((String) (jsonexception))));
	//  379  899:aload_0         
	//  380  900:new             #348 <Class JSONObject>
	//  381  903:dup             
	//  382  904:aload           4
	//  383  906:invokespecial   #350 <Method void JSONObject(String)>
	//  384  909:invokestatic    #400 <Method zzawo zzawo.a(JSONObject)>
	//  385  912:putfield        #212 <Field zzawo H>
			}
	//* 386  915:goto            928
			catch(JSONException jsonexception1)
	//* 387  918:astore          4
			{
				wx.c("Error parsing safe browsing header", ((Throwable) (jsonexception1)));
	//  388  920:ldc2            #402 <String "Error parsing safe browsing header">
	//  389  923:aload           4
	//  390  925:invokestatic    #360 <Method void wx.c(String, Throwable)>
			}
		F = F | d(map, "X-Afma-Render-In-Browser");
	//  391  928:aload_0         
	//  392  929:aload_0         
	//  393  930:getfield        #208 <Field boolean F>
	//  394  933:aload_1         
	//  395  934:ldc2            #404 <String "X-Afma-Render-In-Browser">
	//  396  937:invokestatic    #271 <Method boolean d(Map, String)>
	//  397  940:ior             
	//  398  941:putfield        #208 <Field boolean F>
		jsonexception1 = ((JSONException) (a(map, "X-Afma-Pool")));
	//  399  944:aload_1         
	//  400  945:ldc2            #406 <String "X-Afma-Pool">
	//  401  948:invokestatic    #249 <Method String a(Map, String)>
	//  402  951:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (jsonexception1))))
	//* 403  953:aload           4
	//* 404  955:invokestatic    #346 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 405  958:ifne            993
			try
			{
				I = (new JSONObject(((String) (jsonexception1)))).getBoolean("never_pool");
	//  406  961:aload_0         
	//  407  962:new             #348 <Class JSONObject>
	//  408  965:dup             
	//  409  966:aload           4
	//  410  968:invokespecial   #350 <Method void JSONObject(String)>
	//  411  971:ldc2            #408 <String "never_pool">
	//  412  974:invokevirtual   #411 <Method boolean JSONObject.getBoolean(String)>
	//  413  977:putfield        #216 <Field boolean I>
			}
	//* 414  980:goto            993
			catch(JSONException jsonexception2)
	//* 415  983:astore          4
			{
				wx.c("Error parsing interstitial pool header", ((Throwable) (jsonexception2)));
	//  416  985:ldc2            #413 <String "Error parsing interstitial pool header">
	//  417  988:aload           4
	//  418  990:invokestatic    #360 <Method void wx.c(String, Throwable)>
			}
		J = d(map, "X-Afma-Custom-Close-Blocked");
	//  419  993:aload_0         
	//  420  994:aload_1         
	//  421  995:ldc2            #415 <String "X-Afma-Custom-Close-Blocked">
	//  422  998:invokestatic    #271 <Method boolean d(Map, String)>
	//  423 1001:putfield        #218 <Field boolean J>
		K = d(map, "X-Afma-Enable-Omid");
	//  424 1004:aload_0         
	//  425 1005:aload_1         
	//  426 1006:ldc2            #417 <String "X-Afma-Enable-Omid">
	//  427 1009:invokestatic    #271 <Method boolean d(Map, String)>
	//  428 1012:putfield        #226 <Field boolean K>
		L = d(map, "X-Afma-Disable-Closable-Area");
	//  429 1015:aload_0         
	//  430 1016:aload_1         
	//  431 1017:ldc2            #419 <String "X-Afma-Disable-Closable-Area">
	//  432 1020:invokestatic    #271 <Method boolean d(Map, String)>
	//  433 1023:putfield        #230 <Field boolean L>
		M = a(map, "X-Afma-Omid-Settings");
	//  434 1026:aload_0         
	//  435 1027:aload_1         
	//  436 1028:ldc2            #421 <String "X-Afma-Omid-Settings">
	//  437 1031:invokestatic    #249 <Method String a(Map, String)>
	//  438 1034:putfield        #232 <Field String M>
	//  439 1037:return          
	}

	private boolean A;
	private zzaso B;
	private boolean C;
	private String D;
	private List E;
	private boolean F;
	private String G;
	private zzawo H;
	private boolean I;
	private boolean J;
	private boolean K;
	private boolean L;
	private String M;
	private final zzasi N;
	private String a;
	private String b;
	private String c;
	private List d;
	private String e;
	private String f;
	private String g;
	private List h;
	private List i;
	private long j;
	private boolean k;
	private final long l = -1L;
	private List m;
	private long n;
	private int o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private boolean t;
	private String u;
	private boolean v;
	private boolean w;
	private zzawd x;
	private List y;
	private List z;
}
