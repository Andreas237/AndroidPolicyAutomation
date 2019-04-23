// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.d.g;
import com.google.android.gms.internal.firebase-perf.ab;
import com.google.android.gms.internal.firebase-perf.gf;
import com.google.android.gms.internal.firebase-perf.hg;
import com.google.android.gms.internal.firebase-perf.jd;
import com.google.android.gms.internal.firebase-perf.je;
import com.google.android.gms.internal.firebase-perf.jh;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.FirebaseApp;
import com.google.firebase.d.a;
import com.google.firebase.d.e;
import com.google.firebase.h;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.firebase.perf.internal:
//			ab, ac, c, d, 
//			e

public class RemoteConfigManager
{

	private RemoteConfigManager()
	{
		this(((Executor) (new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue()))))), a.a(), FirebasePerfProvider.zzda());
	//    0    0:aload_0         
	//    1    1:new             #58  <Class ThreadPoolExecutor>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:lconst_0        
	//    6    8:getstatic       #37  <Field TimeUnit TimeUnit.SECONDS>
	//    7   11:new             #60  <Class LinkedBlockingQueue>
	//    8   14:dup             
	//    9   15:invokespecial   #61  <Method void LinkedBlockingQueue()>
	//   10   18:invokespecial   #64  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   11   21:invokestatic    #70  <Method a a.a()>
	//   12   24:invokestatic    #76  <Method zzbg FirebasePerfProvider.zzda()>
	//   13   27:invokespecial   #79  <Method void RemoteConfigManager(Executor, a, zzbg)>
	//   14   30:return          
	}

	private RemoteConfigManager(Executor executor, a a1, zzbg zzbg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		zzfk = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #82  <Field boolean zzfk>
		zzfl = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #84  <Field boolean zzfl>
		zzfm = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #86  <Field long zzfm>
		zzfn = hg.a(com.google.firebase.perf.internal.ab.a);
	//   11   19:aload_0         
	//   12   20:getstatic       #90  <Field gf com.google.firebase.perf.internal.ab.a>
	//   13   23:invokestatic    #95  <Method gf hg.a(gf)>
	//   14   26:putfield        #97  <Field gf zzfn>
		zzfo = jh.a();
	//   15   29:aload_0         
	//   16   30:invokestatic    #102 <Method jh jh.a()>
	//   17   33:putfield        #104 <Field jh zzfo>
		zzfq = executor;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #106 <Field Executor zzfq>
		zzfp = a1;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #108 <Field a zzfp>
		zzfr = zzbg1;
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:putfield        #110 <Field zzbg zzfr>
	//   27   51:return          
	}

	private static jd zza(Context context, String s)
	{
		je je1 = jd.g();
	//    0    0:invokestatic    #120 <Method je jd.g()>
	//    1    3:astore          5
		int i = zze(context);
	//    2    5:aload_0         
	//    3    6:invokestatic    #124 <Method int zze(Context)>
	//    4    9:istore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 12);
	//    5   10:new             #126 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_1         
	//    8   15:invokestatic    #132 <Method String String.valueOf(Object)>
	//    9   18:invokevirtual   #136 <Method int String.length()>
	//   10   21:bipush          12
	//   11   23:iadd            
	//   12   24:invokespecial   #139 <Method void StringBuilder(int)>
	//   13   27:astore_3        
		stringbuilder.append(s);
	//   14   28:aload_3         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(":");
	//   18   34:aload_3         
	//   19   35:ldc1            #145 <String ":">
	//   20   37:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(i);
	//   22   41:aload_3         
	//   23   42:iload_2         
	//   24   43:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
		String s1 = stringbuilder.toString();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   28   51:astore          6
		for(int j = 0; j < 3; j++)
	//*  29   53:iconst_0        
	//*  30   54:istore_2        
	//*  31   55:iload_2         
	//*  32   56:iconst_3        
	//*  33   57:icmpge          255
		{
			Object obj1 = ((Object) ((new String[] {
				s1, s, "1.0.0.225053256"
			})[j]));
	//   34   60:iconst_3        
	//   35   61:anewarray       String[]
	//   36   64:dup             
	//   37   65:iconst_0        
	//   38   66:aload           6
	//   39   68:aastore         
	//   40   69:dup             
	//   41   70:iconst_1        
	//   42   71:aload_1         
	//   43   72:aastore         
	//   44   73:dup             
	//   45   74:iconst_2        
	//   46   75:ldc1            #154 <String "1.0.0.225053256">
	//   47   77:aastore         
	//   48   78:iload_2         
	//   49   79:aaload          
	//   50   80:astore          4
			Object obj = ((Object) (String.valueOf("_fireperf1:")));
	//   51   82:ldc1            #156 <String "_fireperf1:">
	//   52   84:invokestatic    #132 <Method String String.valueOf(Object)>
	//   53   87:astore_3        
			obj1 = ((Object) (String.valueOf(obj1)));
	//   54   88:aload           4
	//   55   90:invokestatic    #132 <Method String String.valueOf(Object)>
	//   56   93:astore          4
			if(((String) (obj1)).length() != 0)
	//*  57   95:aload           4
	//*  58   97:invokevirtual   #136 <Method int String.length()>
	//*  59  100:ifeq            113
				obj = ((Object) (((String) (obj)).concat(((String) (obj1)))));
	//   60  103:aload_3         
	//   61  104:aload           4
	//   62  106:invokevirtual   #160 <Method String String.concat(String)>
	//   63  109:astore_3        
			else
	//*  64  110:goto            122
				obj = ((Object) (new String(((String) (obj)))));
	//   65  113:new             #128 <Class String>
	//   66  116:dup             
	//   67  117:aload_3         
	//   68  118:invokespecial   #163 <Method void String(String)>
	//   69  121:astore_3        
			obj = ((Object) (zzh(((String) (obj)))));
	//   70  122:aload_3         
	//   71  123:invokestatic    #166 <Method String zzh(String)>
	//   72  126:astore_3        
			obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 16)));
	//   73  127:new             #126 <Class StringBuilder>
	//   74  130:dup             
	//   75  131:aload_3         
	//   76  132:invokestatic    #132 <Method String String.valueOf(Object)>
	//   77  135:invokevirtual   #136 <Method int String.length()>
	//   78  138:bipush          16
	//   79  140:iadd            
	//   80  141:invokespecial   #139 <Method void StringBuilder(int)>
	//   81  144:astore          4
			((StringBuilder) (obj1)).append("fireperf:");
	//   82  146:aload           4
	//   83  148:ldc1            #168 <String "fireperf:">
	//   84  150:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   85  153:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   86  154:aload           4
	//   87  156:aload_3         
	//   88  157:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   89  160:pop             
			((StringBuilder) (obj1)).append("_limits");
	//   90  161:aload           4
	//   91  163:ldc1            #170 <String "_limits">
	//   92  165:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   93  168:pop             
			obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   94  169:aload           4
	//   95  171:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   96  174:astore_3        
			obj1 = null;
	//   97  175:aconst_null     
	//   98  176:astore          4
			try
			{
				obj = ((Object) (com.google.android.gms.internal.firebase_2D_perf.a.a(context.getContentResolver(), ((String) (obj)), ((String) (null)))));
	//   99  178:aload_0         
	//  100  179:invokevirtual   #176 <Method android.content.ContentResolver Context.getContentResolver()>
	//  101  182:aload_3         
	//  102  183:aconst_null     
	//  103  184:invokestatic    #181 <Method String com.google.android.gms.internal.firebase_2D_perf.a.a(android.content.ContentResolver, String, String)>
	//  104  187:astore_3        
			}
	//* 105  188:goto            237
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 106  191:astore_3        
			{
				obj = ((Object) (String.valueOf(((Object) (((SecurityException) (obj)).getMessage())))));
	//  107  192:aload_3         
	//  108  193:invokevirtual   #184 <Method String SecurityException.getMessage()>
	//  109  196:invokestatic    #132 <Method String String.valueOf(Object)>
	//  110  199:astore_3        
				if(((String) (obj)).length() != 0)
	//* 111  200:aload_3         
	//* 112  201:invokevirtual   #136 <Method int String.length()>
	//* 113  204:ifeq            217
					obj = ((Object) ("Failed to fetch Gservices flag. SecurityException: ".concat(((String) (obj)))));
	//  114  207:ldc1            #186 <String "Failed to fetch Gservices flag. SecurityException: ">
	//  115  209:aload_3         
	//  116  210:invokevirtual   #160 <Method String String.concat(String)>
	//  117  213:astore_3        
				else
	//* 118  214:goto            227
					obj = ((Object) (new String("Failed to fetch Gservices flag. SecurityException: ")));
	//  119  217:new             #128 <Class String>
	//  120  220:dup             
	//  121  221:ldc1            #186 <String "Failed to fetch Gservices flag. SecurityException: ">
	//  122  223:invokespecial   #163 <Method void String(String)>
	//  123  226:astore_3        
				Log.w("FirebasePerformance", ((String) (obj)));
	//  124  227:ldc1            #188 <String "FirebasePerformance">
	//  125  229:aload_3         
	//  126  230:invokestatic    #194 <Method int Log.w(String, String)>
	//  127  233:pop             
				obj = obj1;
	//  128  234:aload           4
	//  129  236:astore_3        
			}
			if(obj != null)
	//* 130  237:aload_3         
	//* 131  238:ifnull          248
				je1.a(obj);
	//  132  241:aload           5
	//  133  243:aload_3         
	//  134  244:invokevirtual   #199 <Method com.google.android.gms.internal.firebase_2D_perf.jb je.a(Object)>
	//  135  247:pop             
		}

	//  136  248:iload_2         
	//  137  249:iconst_1        
	//  138  250:iadd            
	//  139  251:istore_2        
	//* 140  252:goto            55
		return je1.a();
	//  141  255:aload           5
	//  142  257:invokevirtual   #202 <Method jd je.a()>
	//  143  260:areturn         
	}

	private static jh zzc(List list)
	{
		HashMap hashmap;
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return jh.a();
	//    2    4:invokestatic    #102 <Method jh jh.a()>
	//    3    7:areturn         
		hashmap = new HashMap();
	//    4    8:new             #208 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #209 <Method void HashMap()>
	//    7   15:astore          5
		list = ((List) (list.iterator()));
	//    8   17:aload_0         
	//    9   18:invokeinterface #215 <Method Iterator List.iterator()>
	//   10   23:astore_0        
_L4:
		if(!((Iterator) (list)).hasNext()) goto _L2; else goto _L1
	//   11   24:aload_0         
	//   12   25:invokeinterface #221 <Method boolean Iterator.hasNext()>
	//   13   30:ifeq            145
_L1:
		int i;
		int j;
		String as[];
		as = ((String)((Iterator) (list)).next()).split(",");
	//   14   33:aload_0         
	//   15   34:invokeinterface #225 <Method Object Iterator.next()>
	//   16   39:checkcast       #128 <Class String>
	//   17   42:ldc1            #227 <String ",">
	//   18   44:invokevirtual   #231 <Method String[] String.split(String)>
	//   19   47:astore          6
		j = as.length;
	//   20   49:aload           6
	//   21   51:arraylength     
	//   22   52:istore_2        
		i = 0;
	//   23   53:iconst_0        
	//   24   54:istore_1        
_L5:
		if(i >= j) goto _L4; else goto _L3
	//   25   55:iload_1         
	//   26   56:iload_2         
	//   27   57:icmpge          24
_L3:
		String as1[];
		String s;
		as1 = as[i].split(":");
	//   28   60:aload           6
	//   29   62:iload_1         
	//   30   63:aaload          
	//   31   64:ldc1            #145 <String ":">
	//   32   66:invokevirtual   #231 <Method String[] String.split(String)>
	//   33   69:astore          7
		if(as1.length < 2)
			break MISSING_BLOCK_LABEL_138;
	//   34   71:aload           7
	//   35   73:arraylength     
	//   36   74:iconst_2        
	//   37   75:icmplt          138
		s = as1[0].trim();
	//   38   78:aload           7
	//   39   80:iconst_0        
	//   40   81:aaload          
	//   41   82:invokevirtual   #234 <Method String String.trim()>
	//   42   85:astore          8
		if(s.isEmpty() || ((Map) (hashmap)).containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_138;
	//   43   87:aload           8
	//   44   89:invokevirtual   #237 <Method boolean String.isEmpty()>
	//   45   92:ifne            138
	//   46   95:aload           5
	//   47   97:aload           8
	//   48   99:invokeinterface #243 <Method boolean Map.containsKey(Object)>
	//   49  104:ifne            138
		long l = Long.parseLong(as1[1].trim());
	//   50  107:aload           7
	//   51  109:iconst_1        
	//   52  110:aaload          
	//   53  111:invokevirtual   #234 <Method String String.trim()>
	//   54  114:invokestatic    #249 <Method long Long.parseLong(String)>
	//   55  117:lstore_3        
		if(l >= 0L)
	//*  56  118:lload_3         
	//*  57  119:lconst_0        
	//*  58  120:lcmp            
	//*  59  121:iflt            138
			((Map) (hashmap)).put(((Object) (s)), ((Object) (Long.valueOf(l))));
	//   60  124:aload           5
	//   61  126:aload           8
	//   62  128:lload_3         
	//   63  129:invokestatic    #252 <Method Long Long.valueOf(long)>
	//   64  132:invokeinterface #256 <Method Object Map.put(Object, Object)>
	//   65  137:pop             
_L6:
		i++;
	//   66  138:iload_1         
	//   67  139:iconst_1        
	//   68  140:iadd            
	//   69  141:istore_1        
		  goto _L5
		  goto _L4
	//*  70  142:goto            55
_L2:
		return jh.a(((Map) (hashmap)));
	//   71  145:aload           5
	//   72  147:invokestatic    #259 <Method jh jh.a(Map)>
	//   73  150:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   74  151:astore          7
		  goto _L6
	//*  75  153:goto            138
	}

	public static RemoteConfigManager zzcb()
	{
		return zzfh;
	//    0    0:getstatic       #31  <Field RemoteConfigManager zzfh>
	//    1    3:areturn         
	}

	private final jh zzcc()
	{
		zzfo = (jh)zzfn.a();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field gf zzfn>
	//    3    5:invokeinterface #267 <Method Object gf.a()>
	//    4   10:checkcast       #99  <Class jh>
	//    5   13:putfield        #104 <Field jh zzfo>
		zzfk = true;
	//    6   16:aload_0         
	//    7   17:iconst_1        
	//    8   18:putfield        #82  <Field boolean zzfk>
		return zzfo;
	//    9   21:aload_0         
	//   10   22:getfield        #104 <Field jh zzfo>
	//   11   25:areturn         
	}

	private final void zzce()
	{
		if(zzfk)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean zzfk>
	//*   2    4:ifeq            12
		{
			zzcf();
	//    3    7:aload_0         
	//    4    8:invokespecial   #272 <Method void zzcf()>
			return;
	//    5   11:return          
		} else
		{
			zzfq.execute(((Runnable) (new ac(this))));
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field Executor zzfq>
	//    8   16:new             #274 <Class ac>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #277 <Method void ac(RemoteConfigManager)>
	//   12   24:invokeinterface #283 <Method void Executor.execute(Runnable)>
			return;
	//   13   29:return          
		}
	}

	private final void zzcf()
	{
		if(!zzch())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #286 <Method boolean zzch()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i = zzfp.b().a();
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field a zzfp>
	//    6   12:invokevirtual   #290 <Method e a.b()>
	//    7   15:invokeinterface #294 <Method int e.a()>
	//    8   20:istore_2        
		boolean flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		if((i == 1 || i == 0) && zzcj())
	//*  11   23:iload_2         
	//*  12   24:iconst_1        
	//*  13   25:icmpeq          32
	//*  14   28:iload_2         
	//*  15   29:ifne            67
	//*  16   32:aload_0         
	//*  17   33:invokespecial   #297 <Method boolean zzcj()>
	//*  18   36:ifeq            67
		{
			if(zzfr.c() <= zzfi)
	//*  19   39:aload_0         
	//*  20   40:getfield        #110 <Field zzbg zzfr>
	//*  21   43:invokevirtual   #303 <Method long zzbg.c()>
	//*  22   46:getstatic       #45  <Field long zzfi>
	//*  23   49:lcmp            
	//*  24   50:ifle            56
	//*  25   53:goto            58
				flag = false;
	//   26   56:iconst_0        
	//   27   57:istore_1        
			if(flag)
	//*  28   58:iload_1         
	//*  29   59:ifeq            125
			{
				zzcg();
	//   30   62:aload_0         
	//   31   63:invokespecial   #306 <Method void zzcg()>
				return;
	//   32   66:return          
			}
		} else
		if(i == -1 || i == 2)
	//*  33   67:iload_2         
	//*  34   68:iconst_m1       
	//*  35   69:icmpeq          77
	//*  36   72:iload_2         
	//*  37   73:iconst_2        
	//*  38   74:icmpne          125
		{
			if(!zzfl)
	//*  39   77:aload_0         
	//*  40   78:getfield        #84  <Field boolean zzfl>
	//*  41   81:ifne            114
			{
				zzfm = System.currentTimeMillis();
	//   42   84:aload_0         
	//   43   85:invokestatic    #311 <Method long System.currentTimeMillis()>
	//   44   88:putfield        #86  <Field long zzfm>
				zzfl = true;
	//   45   91:aload_0         
	//   46   92:iconst_1        
	//   47   93:putfield        #84  <Field boolean zzfl>
				zzfq.execute(((Runnable) (new c(this))));
	//   48   96:aload_0         
	//   49   97:getfield        #106 <Field Executor zzfq>
	//   50  100:new             #313 <Class c>
	//   51  103:dup             
	//   52  104:aload_0         
	//   53  105:invokespecial   #314 <Method void c(RemoteConfigManager)>
	//   54  108:invokeinterface #283 <Method void Executor.execute(Runnable)>
				return;
	//   55  113:return          
			}
			if(zzcj())
	//*  56  114:aload_0         
	//*  57  115:invokespecial   #297 <Method boolean zzcj()>
	//*  58  118:ifeq            125
				zzcg();
	//   59  121:aload_0         
	//   60  122:invokespecial   #306 <Method void zzcg()>
		}
	//   61  125:return          
	}

	private final void zzcg()
	{
		zzfm = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #311 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #86  <Field long zzfm>
		zzfp.c().a(zzfq, ((com.google.android.gms.d.c) (new d(this)))).a(zzfq, ((com.google.android.gms.d.d) (new com.google.firebase.perf.internal.e(this))));
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field a zzfp>
	//    5   11:invokevirtual   #317 <Method g a.c()>
	//    6   14:aload_0         
	//    7   15:getfield        #106 <Field Executor zzfq>
	//    8   18:new             #319 <Class d>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #320 <Method void d(RemoteConfigManager)>
	//   12   26:invokevirtual   #325 <Method g g.a(Executor, com.google.android.gms.d.c)>
	//   13   29:aload_0         
	//   14   30:getfield        #106 <Field Executor zzfq>
	//   15   33:new             #327 <Class com.google.firebase.perf.internal.e>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #328 <Method void com.google.firebase.perf.internal.e(RemoteConfigManager)>
	//   19   41:invokevirtual   #331 <Method g g.a(Executor, com.google.android.gms.d.d)>
	//   20   44:pop             
	//   21   45:return          
	}

	private final boolean zzch()
	{
		return ((Long)zzfo.getOrDefault(((Object) (ab.a("firebase_remote_config_enabled"))), ((Object) (Long.valueOf(1L))))).longValue() == 1L;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field jh zzfo>
	//    2    4:ldc2            #333 <String "firebase_remote_config_enabled">
	//    3    7:invokestatic    #337 <Method String ab.a(String)>
	//    4   10:lconst_1        
	//    5   11:invokestatic    #252 <Method Long Long.valueOf(long)>
	//    6   14:invokevirtual   #340 <Method Object jh.getOrDefault(Object, Object)>
	//    7   17:checkcast       #245 <Class Long>
	//    8   20:invokevirtual   #343 <Method long Long.longValue()>
	//    9   23:lconst_1        
	//   10   24:lcmp            
	//   11   25:ifne            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	private final void zzci()
	{
		if(zzfp.a("configns:fireperf"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field a zzfp>
	//*   2    4:ldc2            #346 <String "configns:fireperf">
	//*   3    7:invokevirtual   #349 <Method boolean a.a(String)>
	//*   4   10:ifeq            22
			Log.d("FirebasePerformance", "Activated Firebase Remote Config Values for the Fireperf Namespace");
	//    5   13:ldc1            #188 <String "FirebasePerformance">
	//    6   15:ldc2            #351 <String "Activated Firebase Remote Config Values for the Fireperf Namespace">
	//    7   18:invokestatic    #354 <Method int Log.d(String, String)>
	//    8   21:pop             
	//    9   22:return          
	}

	private final boolean zzcj()
	{
		return System.currentTimeMillis() - zzfm > zzfj;
	//    0    0:invokestatic    #311 <Method long System.currentTimeMillis()>
	//    1    3:aload_0         
	//    2    4:getfield        #86  <Field long zzfm>
	//    3    7:lsub            
	//    4    8:getstatic       #55  <Field long zzfj>
	//    5   11:lcmp            
	//    6   12:ifle            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	static final jh zzcl()
	{
		String s = FirebaseApp.getInstance().c().a();
	//    0    0:invokestatic    #361 <Method FirebaseApp FirebaseApp.getInstance()>
	//    1    3:invokevirtual   #364 <Method h FirebaseApp.c()>
	//    2    6:invokevirtual   #368 <Method String h.a()>
	//    3    9:astore_0        
		return zzc(((List) (zza(FirebaseApp.getInstance().a(), s))));
	//    4   10:invokestatic    #361 <Method FirebaseApp FirebaseApp.getInstance()>
	//    5   13:invokevirtual   #371 <Method Context FirebaseApp.a()>
	//    6   16:aload_0         
	//    7   17:invokestatic    #373 <Method jd zza(Context, String)>
	//    8   20:invokestatic    #375 <Method jh zzc(List)>
	//    9   23:areturn         
	}

	private static int zze(Context context)
	{
		int i;
		try
		{
			i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #381 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #384 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #390 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #396 <Field int PackageInfo.versionCode>
	//    7   15:istore_1        
		}
	//*   8   16:iload_1         
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			return 0;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
		return i;
	}

	private static String zzh(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i;
		int j;
		StringBuilder stringbuilder;
		try
		{
			s = ((String) (MessageDigest.getInstance("SHA-1").digest(s.getBytes())));
	//    4    6:ldc2            #400 <String "SHA-1">
	//    5    9:invokestatic    #405 <Method MessageDigest MessageDigest.getInstance(String)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #409 <Method byte[] String.getBytes()>
	//    8   16:invokevirtual   #413 <Method byte[] MessageDigest.digest(byte[])>
	//    9   19:astore_0        
			stringbuilder = new StringBuilder();
	//   10   20:new             #126 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #414 <Method void StringBuilder()>
	//   13   27:astore_3        
			j = s.length;
	//   14   28:aload_0         
	//   15   29:arraylength     
	//   16   30:istore_2        
		}
	//*  17   31:iconst_0        
	//*  18   32:istore_1        
	//*  19   33:iload_1         
	//*  20   34:iload_2         
	//*  21   35:icmpge          69
	//*  22   38:aload_3         
	//*  23   39:ldc2            #416 <String "%02x">
	//*  24   42:iconst_1        
	//*  25   43:anewarray       Object[]
	//*  26   46:dup             
	//*  27   47:iconst_0        
	//*  28   48:aload_0         
	//*  29   49:iload_1         
	//*  30   50:baload          
	//*  31   51:invokestatic    #421 <Method Byte Byte.valueOf(byte)>
	//*  32   54:aastore         
	//*  33   55:invokestatic    #425 <Method String String.format(String, Object[])>
	//*  34   58:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  35   61:pop             
	//*  36   62:iload_1         
	//*  37   63:iconst_1        
	//*  38   64:iadd            
	//*  39   65:istore_1        
	//*  40   66:goto            33
	//*  41   69:aload_3         
	//*  42   70:invokevirtual   #152 <Method String StringBuilder.toString()>
	//*  43   73:astore_0        
	//*  44   74:aload_0         
	//*  45   75:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  46   76:astore_0        
		{
			return null;
	//   47   77:aconst_null     
	//   48   78:areturn         
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		stringbuilder.append(String.format("%02x", new Object[] {
			Byte.valueOf(s[i])
		}));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_33;
_L1:
		s = stringbuilder.toString();
		return s;
	}

	public final float zza(String s, float f)
	{
		zzce();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method void zzce()>
		Long long1 = (Long)zzfo.get(((Object) (ab.a(s))));
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field jh zzfo>
	//    4    8:aload_1         
	//    5    9:invokestatic    #337 <Method String ab.a(String)>
	//    6   12:invokevirtual   #432 <Method Object jh.get(Object)>
	//    7   15:checkcast       #245 <Class Long>
	//    8   18:astore          4
		if(long1 != null)
	//*   9   20:aload           4
	//*  10   22:ifnull          32
			f = long1.longValue();
	//   11   25:aload           4
	//   12   27:invokevirtual   #343 <Method long Long.longValue()>
	//   13   30:l2f             
	//   14   31:fstore_2        
		if(!zzch()) goto _L2; else goto _L1
	//   15   32:aload_0         
	//   16   33:invokespecial   #286 <Method boolean zzch()>
	//   17   36:ifeq            156
_L1:
		String s1 = zzfp.a(ab.b(s), "configns:fireperf");
	//   18   39:aload_0         
	//   19   40:getfield        #108 <Field a zzfp>
	//   20   43:aload_1         
	//   21   44:invokestatic    #434 <Method String ab.b(String)>
	//   22   47:ldc2            #346 <String "configns:fireperf">
	//   23   50:invokevirtual   #437 <Method String a.a(String, String)>
	//   24   53:astore          4
		float f1 = Float.parseFloat(s1);
	//   25   55:aload           4
	//   26   57:invokestatic    #443 <Method float Float.parseFloat(String)>
	//   27   60:fstore_3        
		return 100F * f1;
	//   28   61:ldc2            #444 <Float 100F>
	//   29   64:fload_3         
	//   30   65:fmul            
	//   31   66:freturn         
_L4:
		if(!s1.isEmpty())
	//*  32   67:aload           4
	//*  33   69:invokevirtual   #237 <Method boolean String.isEmpty()>
	//*  34   72:ifne            156
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 46 + String.valueOf(((Object) (s))).length());
	//   35   75:new             #126 <Class StringBuilder>
	//   36   78:dup             
	//   37   79:aload           4
	//   38   81:invokestatic    #132 <Method String String.valueOf(Object)>
	//   39   84:invokevirtual   #136 <Method int String.length()>
	//   40   87:bipush          46
	//   41   89:iadd            
	//   42   90:aload_1         
	//   43   91:invokestatic    #132 <Method String String.valueOf(Object)>
	//   44   94:invokevirtual   #136 <Method int String.length()>
	//   45   97:iadd            
	//   46   98:invokespecial   #139 <Method void StringBuilder(int)>
	//   47  101:astore          5
			stringbuilder.append("Could not parse value: ");
	//   48  103:aload           5
	//   49  105:ldc2            #446 <String "Could not parse value: ">
	//   50  108:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   51  111:pop             
			stringbuilder.append(s1);
	//   52  112:aload           5
	//   53  114:aload           4
	//   54  116:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   55  119:pop             
			stringbuilder.append(" for key: ");
	//   56  120:aload           5
	//   57  122:ldc2            #448 <String " for key: ">
	//   58  125:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   59  128:pop             
			stringbuilder.append(s);
	//   60  129:aload           5
	//   61  131:aload_1         
	//   62  132:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   63  135:pop             
			stringbuilder.append(" into a float");
	//   64  136:aload           5
	//   65  138:ldc2            #450 <String " into a float">
	//   66  141:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:pop             
			Log.d("FirebasePerformance", stringbuilder.toString());
	//   68  145:ldc1            #188 <String "FirebasePerformance">
	//   69  147:aload           5
	//   70  149:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   71  152:invokestatic    #354 <Method int Log.d(String, String)>
	//   72  155:pop             
		}
_L2:
		return f;
	//   73  156:fload_2         
	//   74  157:freturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   75  158:astore          5
		if(true) goto _L4; else goto _L3
	//   76  160:goto            67
_L3:
	}

	final void zza(g g1)
	{
		if(g1.b())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #453 <Method boolean g.b()>
	//*   2    4:ifeq            16
		{
			zzci();
	//    3    7:aload_0         
	//    4    8:invokespecial   #455 <Method void zzci()>
			zzfl = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #84  <Field boolean zzfl>
		}
	//    8   16:return          
	}

	final void zza(Exception exception)
	{
		zzfm = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #86  <Field long zzfm>
	//    3    5:return          
	}

	public final long zzc(String s, long l)
	{
		long l1;
		zzce();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method void zzce()>
		l = ((Long)zzfo.getOrDefault(((Object) (ab.a(s))), ((Object) (Long.valueOf(l))))).longValue();
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field jh zzfo>
	//    4    8:aload_1         
	//    5    9:invokestatic    #337 <Method String ab.a(String)>
	//    6   12:lload_2         
	//    7   13:invokestatic    #252 <Method Long Long.valueOf(long)>
	//    8   16:invokevirtual   #340 <Method Object jh.getOrDefault(Object, Object)>
	//    9   19:checkcast       #245 <Class Long>
	//   10   22:invokevirtual   #343 <Method long Long.longValue()>
	//   11   25:lstore_2        
		l1 = l;
	//   12   26:lload_2         
	//   13   27:lstore          4
		if(!zzch()) goto _L2; else goto _L1
	//   14   29:aload_0         
	//   15   30:invokespecial   #286 <Method boolean zzch()>
	//   16   33:ifeq            256
_L1:
		String s1 = zzfp.a(ab.b(s), "configns:fireperf");
	//   17   36:aload_0         
	//   18   37:getfield        #108 <Field a zzfp>
	//   19   40:aload_1         
	//   20   41:invokestatic    #434 <Method String ab.b(String)>
	//   21   44:ldc2            #346 <String "configns:fireperf">
	//   22   47:invokevirtual   #437 <Method String a.a(String, String)>
	//   23   50:astore          6
		l1 = (long)((float)Long.parseLong(s1) * 100F);
	//   24   52:aload           6
	//   25   54:invokestatic    #249 <Method long Long.parseLong(String)>
	//   26   57:l2f             
	//   27   58:ldc2            #444 <Float 100F>
	//   28   61:fmul            
	//   29   62:f2l             
	//   30   63:lstore          4
		l = l1;
	//   31   65:lload           4
	//   32   67:lstore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 74);
	//   33   68:new             #126 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:aload_1         
	//   36   73:invokestatic    #132 <Method String String.valueOf(Object)>
	//   37   76:invokevirtual   #136 <Method int String.length()>
	//   38   79:bipush          74
	//   39   81:iadd            
	//   40   82:invokespecial   #139 <Method void StringBuilder(int)>
	//   41   85:astore          7
		l = l1;
	//   42   87:lload           4
	//   43   89:lstore_2        
		stringbuilder.append("Fetched value: ");
	//   44   90:aload           7
	//   45   92:ldc2            #459 <String "Fetched value: ">
	//   46   95:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   47   98:pop             
		l = l1;
	//   48   99:lload           4
	//   49  101:lstore_2        
		stringbuilder.append(l1);
	//   50  102:aload           7
	//   51  104:lload           4
	//   52  106:invokevirtual   #462 <Method StringBuilder StringBuilder.append(long)>
	//   53  109:pop             
		l = l1;
	//   54  110:lload           4
	//   55  112:lstore_2        
		stringbuilder.append(" for key: ");
	//   56  113:aload           7
	//   57  115:ldc2            #448 <String " for key: ">
	//   58  118:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   59  121:pop             
		l = l1;
	//   60  122:lload           4
	//   61  124:lstore_2        
		stringbuilder.append(s);
	//   62  125:aload           7
	//   63  127:aload_1         
	//   64  128:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
		l = l1;
	//   66  132:lload           4
	//   67  134:lstore_2        
		stringbuilder.append(" from firebase remote config.");
	//   68  135:aload           7
	//   69  137:ldc2            #464 <String " from firebase remote config.">
	//   70  140:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
		l = l1;
	//   72  144:lload           4
	//   73  146:lstore_2        
		Log.d("FirebasePerformance", stringbuilder.toString());
	//   74  147:ldc1            #188 <String "FirebasePerformance">
	//   75  149:aload           7
	//   76  151:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   77  154:invokestatic    #354 <Method int Log.d(String, String)>
	//   78  157:pop             
		return l1;
	//   79  158:lload           4
	//   80  160:lreturn         
_L4:
		l1 = l;
	//   81  161:lload_2         
	//   82  162:lstore          4
		if(!s1.isEmpty())
	//*  83  164:aload           6
	//*  84  166:invokevirtual   #237 <Method boolean String.isEmpty()>
	//*  85  169:ifne            256
		{
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s1))).length() + 45 + String.valueOf(((Object) (s))).length());
	//   86  172:new             #126 <Class StringBuilder>
	//   87  175:dup             
	//   88  176:aload           6
	//   89  178:invokestatic    #132 <Method String String.valueOf(Object)>
	//   90  181:invokevirtual   #136 <Method int String.length()>
	//   91  184:bipush          45
	//   92  186:iadd            
	//   93  187:aload_1         
	//   94  188:invokestatic    #132 <Method String String.valueOf(Object)>
	//   95  191:invokevirtual   #136 <Method int String.length()>
	//   96  194:iadd            
	//   97  195:invokespecial   #139 <Method void StringBuilder(int)>
	//   98  198:astore          7
			stringbuilder1.append("Could not parse value: ");
	//   99  200:aload           7
	//  100  202:ldc2            #446 <String "Could not parse value: ">
	//  101  205:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  102  208:pop             
			stringbuilder1.append(s1);
	//  103  209:aload           7
	//  104  211:aload           6
	//  105  213:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  106  216:pop             
			stringbuilder1.append(" for key: ");
	//  107  217:aload           7
	//  108  219:ldc2            #448 <String " for key: ">
	//  109  222:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  110  225:pop             
			stringbuilder1.append(s);
	//  111  226:aload           7
	//  112  228:aload_1         
	//  113  229:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  114  232:pop             
			stringbuilder1.append(" into a long");
	//  115  233:aload           7
	//  116  235:ldc2            #466 <String " into a long">
	//  117  238:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  118  241:pop             
			Log.d("FirebasePerformance", stringbuilder1.toString());
	//  119  242:ldc1            #188 <String "FirebasePerformance">
	//  120  244:aload           7
	//  121  246:invokevirtual   #152 <Method String StringBuilder.toString()>
	//  122  249:invokestatic    #354 <Method int Log.d(String, String)>
	//  123  252:pop             
			l1 = l;
	//  124  253:lload_2         
	//  125  254:lstore          4
		}
_L2:
		return l1;
	//  126  256:lload           4
	//  127  258:lreturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//  128  259:astore          7
		if(true) goto _L4; else goto _L3
	//  129  261:goto            161
_L3:
	}

	public final void zzcd()
	{
		zzcc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method jh zzcc()>
	//    2    4:pop             
		if(zzch())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #286 <Method boolean zzch()>
	//*   5    9:ifeq            16
			zzci();
	//    6   12:aload_0         
	//    7   13:invokespecial   #455 <Method void zzci()>
	//    8   16:return          
	}

	final void zzck()
	{
		zzcc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method jh zzcc()>
	//    2    4:pop             
		zzcf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #272 <Method void zzcf()>
	//    5    9:return          
	}

	final void zzcm()
	{
		zzci();
	//    0    0:aload_0         
	//    1    1:invokespecial   #455 <Method void zzci()>
	//    2    4:return          
	}

	private static final RemoteConfigManager zzfh = new RemoteConfigManager();
	private static final long zzfi;
	private static final long zzfj;
	private boolean zzfk;
	private boolean zzfl;
	private long zzfm;
	private gf zzfn;
	private jh zzfo;
	private final a zzfp;
	private final Executor zzfq;
	private final zzbg zzfr;

	static 
	{
	//    0    0:new             #2   <Class RemoteConfigManager>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void RemoteConfigManager()>
	//    3    7:putstatic       #31  <Field RemoteConfigManager zzfh>
		zzfi = TimeUnit.SECONDS.toMicros(30L);
	//    4   10:getstatic       #37  <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:ldc2w           #38  <Long 30L>
	//    6   16:invokevirtual   #43  <Method long TimeUnit.toMicros(long)>
	//    7   19:putstatic       #45  <Field long zzfi>
		zzfj = TimeUnit.HOURS.toMillis(12L);
	//    8   22:getstatic       #48  <Field TimeUnit TimeUnit.HOURS>
	//    9   25:ldc2w           #49  <Long 12L>
	//   10   28:invokevirtual   #53  <Method long TimeUnit.toMillis(long)>
	//   11   31:putstatic       #55  <Field long zzfj>
	//*  12   34:return          
	}
}
