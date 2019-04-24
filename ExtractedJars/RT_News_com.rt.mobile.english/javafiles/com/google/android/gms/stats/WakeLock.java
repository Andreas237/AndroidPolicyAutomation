// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;
import com.google.android.gms.common.util.*;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.stats:
//			zza, zzb, zzc

public class WakeLock
{

	public WakeLock(Context context, int i, String s)
	{
		String s1;
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			s1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:goto            19
			s1 = context.getPackageName();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method String Context.getPackageName()>
	//    7   14:astore          4
	//*   8   16:goto            7
		this(context, i, s, ((String) (null)), s1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:aconst_null     
	//   14   24:aload           4
	//   15   26:invokespecial   #55  <Method void WakeLock(Context, int, String, String, String)>
	//   16   29:return          
	}

	public WakeLock(Context context, int i, String s, String s1)
	{
		String s2;
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			s2 = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
		else
	//*   4    7:goto            19
			s2 = context.getPackageName();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method String Context.getPackageName()>
	//    7   14:astore          5
	//*   8   16:goto            7
		this(context, i, s, s1, s2);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:aload           4
	//   14   25:aload           5
	//   15   27:invokespecial   #55  <Method void WakeLock(Context, int, String, String, String)>
	//   16   30:return          
	}

	public WakeLock(Context context, int i, String s, String s1, String s2)
	{
		this(context, i, s, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #64  <Method void WakeLock(Context, int, String, String, String, String)>
	//    8   12:return          
	}

	public WakeLock(Context context, int i, String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		zzaec = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #68  <Field boolean zzaec>
		zzaed = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #70  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #71  <Method void HashMap()>
	//    9   17:putfield        #73  <Field Map zzaed>
		zzaef = new AtomicInteger(0);
	//   10   20:aload_0         
	//   11   21:new             #75  <Class AtomicInteger>
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:invokespecial   #78  <Method void AtomicInteger(int)>
	//   15   29:putfield        #80  <Field AtomicInteger zzaef>
		Preconditions.checkNotEmpty(s, "Wake lock name can NOT be empty");
	//   16   32:aload_3         
	//   17   33:ldc1            #82  <String "Wake lock name can NOT be empty">
	//   18   35:invokestatic    #88  <Method String Preconditions.checkNotEmpty(String, Object)>
	//   19   38:pop             
		zzady = i;
	//   20   39:aload_0         
	//   21   40:iload_2         
	//   22   41:putfield        #90  <Field int zzady>
		zzaea = s1;
	//   23   44:aload_0         
	//   24   45:aload           4
	//   25   47:putfield        #92  <Field String zzaea>
		zzaeb = s3;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #94  <Field String zzaeb>
		zzjp = context.getApplicationContext();
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #98  <Method Context Context.getApplicationContext()>
	//   32   61:putfield        #100 <Field Context zzjp>
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))))
	//*  33   64:ldc1            #102 <String "com.google.android.gms">
	//*  34   66:aload_1         
	//*  35   67:invokevirtual   #52  <Method String Context.getPackageName()>
	//*  36   70:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*  37   73:ifne            129
		{
			s1 = String.valueOf("*gcore*:");
	//   38   76:ldc1            #110 <String "*gcore*:">
	//   39   78:invokestatic    #114 <Method String String.valueOf(Object)>
	//   40   81:astore          4
			String s4 = String.valueOf(((Object) (s)));
	//   41   83:aload_3         
	//   42   84:invokestatic    #114 <Method String String.valueOf(Object)>
	//   43   87:astore          7
			if(s4.length() != 0)
	//*  44   89:aload           7
	//*  45   91:invokevirtual   #118 <Method int String.length()>
	//*  46   94:ifeq            109
				s1 = s1.concat(s4);
	//   47   97:aload           4
	//   48   99:aload           7
	//   49  101:invokevirtual   #122 <Method String String.concat(String)>
	//   50  104:astore          4
			else
	//*  51  106:goto            120
				s1 = new String(s1);
	//   52  109:new             #104 <Class String>
	//   53  112:dup             
	//   54  113:aload           4
	//   55  115:invokespecial   #125 <Method void String(String)>
	//   56  118:astore          4
			zzadz = s1;
	//   57  120:aload_0         
	//   58  121:aload           4
	//   59  123:putfield        #127 <Field String zzadz>
		} else
	//*  60  126:goto            134
		{
			zzadz = s;
	//   61  129:aload_0         
	//   62  130:aload_3         
	//   63  131:putfield        #127 <Field String zzadz>
		}
		zzadv = ((PowerManager)context.getSystemService("power")).newWakeLock(i, s);
	//   64  134:aload_0         
	//   65  135:aload_1         
	//   66  136:ldc1            #129 <String "power">
	//   67  138:invokevirtual   #133 <Method Object Context.getSystemService(String)>
	//   68  141:checkcast       #135 <Class PowerManager>
	//   69  144:iload_2         
	//   70  145:aload_3         
	//   71  146:invokevirtual   #139 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   72  149:putfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
		if(WorkSourceUtil.hasWorkSourcePermission(context))
	//*  73  152:aload_1         
	//*  74  153:invokestatic    #147 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//*  75  156:ifeq            300
		{
			s = s2;
	//   76  159:aload           5
	//   77  161:astore_3        
			if(Strings.isEmptyOrWhitespace(s2))
	//*  78  162:aload           5
	//*  79  164:invokestatic    #153 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*  80  167:ifeq            175
				s = context.getPackageName();
	//   81  170:aload_1         
	//   82  171:invokevirtual   #52  <Method String Context.getPackageName()>
	//   83  174:astore_3        
	/* block-local class not found */
	class Configuration {}

			if(zzaeh.isWorkChainsEnabled() && s != null && s3 != null)
	//*  84  175:getstatic       #43  <Field WakeLock$Configuration zzaeh>
	//*  85  178:invokeinterface #157 <Method boolean WakeLock$Configuration.isWorkChainsEnabled()>
	//*  86  183:ifeq            281
	//*  87  186:aload_3         
	//*  88  187:ifnull          281
	//*  89  190:aload           6
	//*  90  192:ifnull          281
			{
				s1 = ((String) (new StringBuilder(42 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s3))).length())));
	//   91  195:new             #159 <Class StringBuilder>
	//   92  198:dup             
	//   93  199:bipush          42
	//   94  201:aload_3         
	//   95  202:invokestatic    #114 <Method String String.valueOf(Object)>
	//   96  205:invokevirtual   #118 <Method int String.length()>
	//   97  208:iadd            
	//   98  209:aload           6
	//   99  211:invokestatic    #114 <Method String String.valueOf(Object)>
	//  100  214:invokevirtual   #118 <Method int String.length()>
	//  101  217:iadd            
	//  102  218:invokespecial   #160 <Method void StringBuilder(int)>
	//  103  221:astore          4
				((StringBuilder) (s1)).append("Using experimental Pi WorkSource chains: ");
	//  104  223:aload           4
	//  105  225:ldc1            #162 <String "Using experimental Pi WorkSource chains: ">
	//  106  227:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  107  230:pop             
				((StringBuilder) (s1)).append(s);
	//  108  231:aload           4
	//  109  233:aload_3         
	//  110  234:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  111  237:pop             
				((StringBuilder) (s1)).append(",");
	//  112  238:aload           4
	//  113  240:ldc1            #168 <String ",">
	//  114  242:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  115  245:pop             
				((StringBuilder) (s1)).append(s3);
	//  116  246:aload           4
	//  117  248:aload           6
	//  118  250:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  119  253:pop             
				Log.d("WakeLock", ((StringBuilder) (s1)).toString());
	//  120  254:ldc1            #170 <String "WakeLock">
	//  121  256:aload           4
	//  122  258:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  123  261:invokestatic    #179 <Method int Log.d(String, String)>
	//  124  264:pop             
				zzadx = s;
	//  125  265:aload_0         
	//  126  266:aload_3         
	//  127  267:putfield        #181 <Field String zzadx>
				context = ((Context) (WorkSourceUtil.fromPackageAndModuleExperimentalPi(context, s, s3)));
	//  128  270:aload_1         
	//  129  271:aload_3         
	//  130  272:aload           6
	//  131  274:invokestatic    #185 <Method WorkSource WorkSourceUtil.fromPackageAndModuleExperimentalPi(Context, String, String)>
	//  132  277:astore_1        
			} else
	//* 133  278:goto            287
			{
				context = ((Context) (WorkSourceUtil.fromPackage(context, s)));
	//  134  281:aload_1         
	//  135  282:aload_3         
	//  136  283:invokestatic    #189 <Method WorkSource WorkSourceUtil.fromPackage(Context, String)>
	//  137  286:astore_1        
			}
			zzadw = ((WorkSource) (context));
	//  138  287:aload_0         
	//  139  288:aload_1         
	//  140  289:putfield        #191 <Field WorkSource zzadw>
			addWorkSource(zzadw);
	//  141  292:aload_0         
	//  142  293:aload_0         
	//  143  294:getfield        #191 <Field WorkSource zzadw>
	//  144  297:invokevirtual   #195 <Method void addWorkSource(WorkSource)>
		}
		if(zzaeg == null)
	//* 145  300:getstatic       #197 <Field ScheduledExecutorService zzaeg>
	//* 146  303:ifnonnull       317
			zzaeg = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
	//  147  306:invokestatic    #203 <Method com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory PooledExecutorsProvider.getInstance()>
	//  148  309:invokeinterface #209 <Method ScheduledExecutorService com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory.newSingleThreadScheduledExecutor()>
	//  149  314:putstatic       #197 <Field ScheduledExecutorService zzaeg>
	//  150  317:return          
	}

	public static void setConfiguration(Configuration configuration)
	{
		zzaeh = configuration;
	//    0    0:aload_0         
	//    1    1:putstatic       #43  <Field WakeLock$Configuration zzaeh>
	//    2    4:return          
	}

	private final void zza(WorkSource worksource)
	{
		try
		{
			zzadv.setWorkSource(worksource);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method void android.os.PowerManager$WakeLock.setWorkSource(WorkSource)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(WorkSource worksource)
	//*   5    9:astore_1        
		{
			Log.wtf("WakeLock", ((RuntimeException) (worksource)).toString());
	//    6   10:ldc1            #170 <String "WakeLock">
	//    7   12:aload_1         
	//    8   13:invokevirtual   #224 <Method String RuntimeException.toString()>
	//    9   16:invokestatic    #227 <Method int Log.wtf(String, String)>
	//   10   19:pop             
		}
	//   11   20:return          
	}

	static void zza(WakeLock wakelock, int i)
	{
		wakelock.zzn(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #231 <Method void zzn(int)>
	//    3    5:return          
	}

	static void zza(WakeLock wakelock, String s, int i)
	{
		wakelock.zzc(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #236 <Method void zzc(String, int)>
	//    4    6:return          
	}

	private final void zza(String s, long l)
	{
		s = zzn(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method String zzn(String)>
	//    3    5:astore_1        
		this;
	//    4    6:aload_0         
		JVM INSTR monitorenter ;
	//    5    7:monitorenter    
		boolean flag1 = zzaed.isEmpty();
	//    6    8:aload_0         
	//    7    9:getfield        #73  <Field Map zzaed>
	//    8   12:invokeinterface #245 <Method boolean Map.isEmpty()>
	//    9   17:istore          5
		boolean flag;
		flag = false;
	//   10   19:iconst_0        
	//   11   20:istore          4
		if(!flag1)
			break MISSING_BLOCK_LABEL_34;
	//   12   22:iload           5
	//   13   24:ifeq            34
		if(zzaee <= 0)
			break MISSING_BLOCK_LABEL_58;
	//   14   27:aload_0         
	//   15   28:getfield        #247 <Field int zzaee>
	//   16   31:ifle            58
		if(!zzadv.isHeld())
	//*  17   34:aload_0         
	//*  18   35:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//*  19   38:invokevirtual   #250 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//*  20   41:ifne            58
		{
			zzaed.clear();
	//   21   44:aload_0         
	//   22   45:getfield        #73  <Field Map zzaed>
	//   23   48:invokeinterface #253 <Method void Map.clear()>
			zzaee = 0;
	//   24   53:aload_0         
	//   25   54:iconst_0        
	//   26   55:putfield        #247 <Field int zzaee>
		}
		if(!zzaec) goto _L2; else goto _L1
	//   27   58:aload_0         
	//   28   59:getfield        #68  <Field boolean zzaec>
	//   29   62:ifeq            132
_L1:
		Integer ainteger[] = (Integer[])zzaed.get(((Object) (s)));
	//   30   65:aload_0         
	//   31   66:getfield        #73  <Field Map zzaed>
	//   32   69:aload_1         
	//   33   70:invokeinterface #257 <Method Object Map.get(Object)>
	//   34   75:checkcast       #259 <Class Integer[]>
	//   35   78:astore          6
		if(ainteger != null) goto _L4; else goto _L3
	//   36   80:aload           6
	//   37   82:ifnonnull       113
_L3:
		zzaed.put(((Object) (s)), ((Object) (new Integer[] {
			Integer.valueOf(1)
		})));
	//   38   85:aload_0         
	//   39   86:getfield        #73  <Field Map zzaed>
	//   40   89:aload_1         
	//   41   90:iconst_1        
	//   42   91:anewarray       Integer[]
	//   43   94:dup             
	//   44   95:iconst_0        
	//   45   96:iconst_1        
	//   46   97:invokestatic    #264 <Method Integer Integer.valueOf(int)>
	//   47  100:aastore         
	//   48  101:invokeinterface #268 <Method Object Map.put(Object, Object)>
	//   49  106:pop             
		flag = true;
	//   50  107:iconst_1        
	//   51  108:istore          4
		  goto _L5
	//*  52  110:goto            293
_L4:
		ainteger[0] = Integer.valueOf(ainteger[0].intValue() + 1);
	//   53  113:aload           6
	//   54  115:iconst_0        
	//   55  116:aload           6
	//   56  118:iconst_0        
	//   57  119:aaload          
	//   58  120:invokevirtual   #271 <Method int Integer.intValue()>
	//   59  123:iconst_1        
	//   60  124:iadd            
	//   61  125:invokestatic    #264 <Method Integer Integer.valueOf(int)>
	//   62  128:aastore         
		  goto _L5
	//*  63  129:goto            293
_L2:
		if(zzaec || zzaee != 0) goto _L7; else goto _L6
	//   64  132:aload_0         
	//   65  133:getfield        #68  <Field boolean zzaec>
	//   66  136:ifne            194
	//   67  139:aload_0         
	//   68  140:getfield        #247 <Field int zzaee>
	//   69  143:ifne            194
_L6:
		WakeLockTracker.getInstance().registerEvent(zzjp, StatsUtils.getEventKey(zzadv, s), 7, zzadz, s, zzaeb, zzady, zzdo(), l);
	//   70  146:invokestatic    #276 <Method WakeLockTracker WakeLockTracker.getInstance()>
	//   71  149:aload_0         
	//   72  150:getfield        #100 <Field Context zzjp>
	//   73  153:aload_0         
	//   74  154:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//   75  157:aload_1         
	//   76  158:invokestatic    #282 <Method String StatsUtils.getEventKey(android.os.PowerManager$WakeLock, String)>
	//   77  161:bipush          7
	//   78  163:aload_0         
	//   79  164:getfield        #127 <Field String zzadz>
	//   80  167:aload_1         
	//   81  168:aload_0         
	//   82  169:getfield        #94  <Field String zzaeb>
	//   83  172:aload_0         
	//   84  173:getfield        #90  <Field int zzady>
	//   85  176:aload_0         
	//   86  177:invokespecial   #286 <Method List zzdo()>
	//   87  180:lload_2         
	//   88  181:invokevirtual   #290 <Method void WakeLockTracker.registerEvent(Context, String, int, String, String, String, int, List, long)>
		zzaee = zzaee + 1;
	//   89  184:aload_0         
	//   90  185:aload_0         
	//   91  186:getfield        #247 <Field int zzaee>
	//   92  189:iconst_1        
	//   93  190:iadd            
	//   94  191:putfield        #247 <Field int zzaee>
_L7:
		this;
	//   95  194:aload_0         
		JVM INSTR monitorexit ;
	//   96  195:monitorexit     
		zzadv.acquire();
	//   97  196:aload_0         
	//   98  197:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//   99  200:invokevirtual   #293 <Method void android.os.PowerManager$WakeLock.acquire()>
		if(l > 0L)
	//* 100  203:lload_2         
	//* 101  204:lconst_0        
	//* 102  205:lcmp            
	//* 103  206:ifle            287
		{
			zzaeg.schedule(((Runnable) (new zzb(this))), l, TimeUnit.MILLISECONDS);
	//  104  209:getstatic       #197 <Field ScheduledExecutorService zzaeg>
	//  105  212:new             #295 <Class zzb>
	//  106  215:dup             
	//  107  216:aload_0         
	//  108  217:invokespecial   #298 <Method void zzb(WakeLock)>
	//  109  220:lload_2         
	//  110  221:getstatic       #304 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  111  224:invokeinterface #310 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//  112  229:pop             
			if(!PlatformVersion.isAtLeastIceCreamSandwich() && zzaec)
	//* 113  230:invokestatic    #315 <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//* 114  233:ifne            287
	//* 115  236:aload_0         
	//* 116  237:getfield        #68  <Field boolean zzaec>
	//* 117  240:ifeq            287
			{
				s = String.valueOf(((Object) (zzadz)));
	//  118  243:aload_0         
	//  119  244:getfield        #127 <Field String zzadz>
	//  120  247:invokestatic    #114 <Method String String.valueOf(Object)>
	//  121  250:astore_1        
				if(s.length() != 0)
	//* 122  251:aload_1         
	//* 123  252:invokevirtual   #118 <Method int String.length()>
	//* 124  255:ifeq            269
					s = "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: ".concat(s);
	//  125  258:ldc2            #317 <String "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: ">
	//  126  261:aload_1         
	//  127  262:invokevirtual   #122 <Method String String.concat(String)>
	//  128  265:astore_1        
				else
	//* 129  266:goto            280
					s = new String("Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: ");
	//  130  269:new             #104 <Class String>
	//  131  272:dup             
	//  132  273:ldc2            #317 <String "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: ">
	//  133  276:invokespecial   #125 <Method void String(String)>
	//  134  279:astore_1        
				Log.wtf("WakeLock", s);
	//  135  280:ldc1            #170 <String "WakeLock">
	//  136  282:aload_1         
	//  137  283:invokestatic    #227 <Method int Log.wtf(String, String)>
	//  138  286:pop             
			}
		}
		return;
	//  139  287:return          
		s;
	//  140  288:astore_1        
		this;
	//  141  289:aload_0         
		JVM INSTR monitorexit ;
	//  142  290:monitorexit     
		throw s;
	//  143  291:aload_1         
	//  144  292:athrow          
_L5:
		if(flag) goto _L6; else goto _L2
	//  145  293:iload           4
	//  146  295:ifne            146
	//* 147  298:goto            132
	}

	private final void zzb(String s, int i)
	{
		if(zzaef.decrementAndGet() < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field AtomicInteger zzaef>
	//*   2    4:invokevirtual   #321 <Method int AtomicInteger.decrementAndGet()>
	//*   3    7:ifge            19
			Log.e("WakeLock", "release without a matched acquire!");
	//    4   10:ldc1            #170 <String "WakeLock">
	//    5   12:ldc2            #323 <String "release without a matched acquire!">
	//    6   15:invokestatic    #326 <Method int Log.e(String, String)>
	//    7   18:pop             
		zzc(s, i);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokespecial   #236 <Method void zzc(String, int)>
	//   12   25:return          
	}

	private final void zzc(String s, int i)
	{
		s = zzn(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method String zzn(String)>
	//    3    5:astore_1        
		this;
	//    4    6:aload_0         
		JVM INSTR monitorenter ;
	//    5    7:monitorenter    
		if(!zzaec) goto _L2; else goto _L1
	//    6    8:aload_0         
	//    7    9:getfield        #68  <Field boolean zzaec>
	//    8   12:ifeq            86
_L1:
		Integer ainteger[] = (Integer[])zzaed.get(((Object) (s)));
	//    9   15:aload_0         
	//   10   16:getfield        #73  <Field Map zzaed>
	//   11   19:aload_1         
	//   12   20:invokeinterface #257 <Method Object Map.get(Object)>
	//   13   25:checkcast       #259 <Class Integer[]>
	//   14   28:astore          4
		boolean flag = false;
	//   15   30:iconst_0        
	//   16   31:istore_3        
		if(ainteger != null) goto _L4; else goto _L3
	//   17   32:aload           4
	//   18   34:ifnonnull       40
	//*  19   37:goto            161
_L4:
		if(ainteger[0].intValue() != 1) goto _L6; else goto _L5
	//   20   40:aload           4
	//   21   42:iconst_0        
	//   22   43:aaload          
	//   23   44:invokevirtual   #271 <Method int Integer.intValue()>
	//   24   47:iconst_1        
	//   25   48:icmpne          67
_L5:
		zzaed.remove(((Object) (s)));
	//   26   51:aload_0         
	//   27   52:getfield        #73  <Field Map zzaed>
	//   28   55:aload_1         
	//   29   56:invokeinterface #329 <Method Object Map.remove(Object)>
	//   30   61:pop             
		flag = true;
	//   31   62:iconst_1        
	//   32   63:istore_3        
		  goto _L3
	//*  33   64:goto            161
_L6:
		ainteger[0] = Integer.valueOf(ainteger[0].intValue() - 1);
	//   34   67:aload           4
	//   35   69:iconst_0        
	//   36   70:aload           4
	//   37   72:iconst_0        
	//   38   73:aaload          
	//   39   74:invokevirtual   #271 <Method int Integer.intValue()>
	//   40   77:iconst_1        
	//   41   78:isub            
	//   42   79:invokestatic    #264 <Method Integer Integer.valueOf(int)>
	//   43   82:aastore         
		  goto _L3
	//*  44   83:goto            161
_L2:
		if(zzaec || zzaee != 1) goto _L8; else goto _L7
	//   45   86:aload_0         
	//   46   87:getfield        #68  <Field boolean zzaec>
	//   47   90:ifne            148
	//   48   93:aload_0         
	//   49   94:getfield        #247 <Field int zzaee>
	//   50   97:iconst_1        
	//   51   98:icmpne          148
_L7:
		WakeLockTracker.getInstance().registerEvent(zzjp, StatsUtils.getEventKey(zzadv, s), 8, zzadz, s, zzaeb, zzady, zzdo());
	//   52  101:invokestatic    #276 <Method WakeLockTracker WakeLockTracker.getInstance()>
	//   53  104:aload_0         
	//   54  105:getfield        #100 <Field Context zzjp>
	//   55  108:aload_0         
	//   56  109:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//   57  112:aload_1         
	//   58  113:invokestatic    #282 <Method String StatsUtils.getEventKey(android.os.PowerManager$WakeLock, String)>
	//   59  116:bipush          8
	//   60  118:aload_0         
	//   61  119:getfield        #127 <Field String zzadz>
	//   62  122:aload_1         
	//   63  123:aload_0         
	//   64  124:getfield        #94  <Field String zzaeb>
	//   65  127:aload_0         
	//   66  128:getfield        #90  <Field int zzady>
	//   67  131:aload_0         
	//   68  132:invokespecial   #286 <Method List zzdo()>
	//   69  135:invokevirtual   #332 <Method void WakeLockTracker.registerEvent(Context, String, int, String, String, String, int, List)>
		zzaee = zzaee - 1;
	//   70  138:aload_0         
	//   71  139:aload_0         
	//   72  140:getfield        #247 <Field int zzaee>
	//   73  143:iconst_1        
	//   74  144:isub            
	//   75  145:putfield        #247 <Field int zzaee>
_L8:
		this;
	//   76  148:aload_0         
		JVM INSTR monitorexit ;
	//   77  149:monitorexit     
		zzn(i);
	//   78  150:aload_0         
	//   79  151:iload_2         
	//   80  152:invokespecial   #231 <Method void zzn(int)>
		return;
	//   81  155:return          
		s;
	//   82  156:astore_1        
		this;
	//   83  157:aload_0         
		JVM INSTR monitorexit ;
	//   84  158:monitorexit     
		throw s;
	//   85  159:aload_1         
	//   86  160:athrow          
_L3:
		if(flag) goto _L7; else goto _L2
	//   87  161:iload_3         
	//   88  162:ifne            101
	//*  89  165:goto            86
	}

	private final List zzdo()
	{
		Object obj = ((Object) (WorkSourceUtil.getNames(zzadw)));
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field WorkSource zzadw>
	//    2    4:invokestatic    #336 <Method List WorkSourceUtil.getNames(WorkSource)>
	//    3    7:astore_1        
		if(zzadx == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #181 <Field String zzadx>
	//*   6   12:ifnonnull       17
		{
			return ((List) (obj));
	//    7   15:aload_1         
	//    8   16:areturn         
		} else
		{
			obj = ((Object) (new ArrayList(((java.util.Collection) (obj)))));
	//    9   17:new             #338 <Class ArrayList>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #341 <Method void ArrayList(java.util.Collection)>
	//   13   25:astore_1        
			((List) (obj)).add(((Object) (zzadx)));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #181 <Field String zzadx>
	//   17   31:invokeinterface #346 <Method boolean List.add(Object)>
	//   18   36:pop             
			return ((List) (obj));
	//   19   37:aload_1         
	//   20   38:areturn         
		}
	}

	private final String zzn(String s)
	{
		if(zzaec)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean zzaec>
	//*   2    4:ifeq            21
		{
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #353 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            16
				return s;
	//    6   14:aload_1         
	//    7   15:areturn         
			else
				return zzaea;
	//    8   16:aload_0         
	//    9   17:getfield        #92  <Field String zzaea>
	//   10   20:areturn         
		} else
		{
			return zzaea;
	//   11   21:aload_0         
	//   12   22:getfield        #92  <Field String zzaea>
	//   13   25:areturn         
		}
	}

	private final void zzn(int i)
	{
		if(!zzadv.isHeld())
			break MISSING_BLOCK_LABEL_75;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//    2    4:invokevirtual   #250 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ifeq            75
		if(android.os.Build.VERSION.SDK_INT >= 21 && i > 0)
	//*   4   10:getstatic       #358 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          21
	//*   6   15:icmplt          31
	//*   7   18:iload_1         
	//*   8   19:ifle            31
			try
			{
				zzadv.release(i);
	//    9   22:aload_0         
	//   10   23:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//   11   26:iload_1         
	//   12   27:invokevirtual   #361 <Method void android.os.PowerManager$WakeLock.release(int)>
				return;
	//   13   30:return          
			}
	//*  14   31:aload_0         
	//*  15   32:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//*  16   35:invokevirtual   #363 <Method void android.os.PowerManager$WakeLock.release()>
	//*  17   38:return          
			catch(RuntimeException runtimeexception)
	//*  18   39:astore_2        
			{
				if(((Object) (((Object) (runtimeexception)).getClass())).equals(java/lang/RuntimeException))
	//*  19   40:aload_2         
	//*  20   41:invokevirtual   #367 <Method Class Object.getClass()>
	//*  21   44:ldc1            #223 <Class RuntimeException>
	//*  22   46:invokevirtual   #368 <Method boolean Object.equals(Object)>
	//*  23   49:ifeq            73
				{
					Log.e("WakeLock", String.valueOf(((Object) (zzadz))).concat(" was already released!"), ((Throwable) (runtimeexception)));
	//   24   52:ldc1            #170 <String "WakeLock">
	//   25   54:aload_0         
	//   26   55:getfield        #127 <Field String zzadz>
	//   27   58:invokestatic    #114 <Method String String.valueOf(Object)>
	//   28   61:ldc2            #370 <String " was already released!">
	//   29   64:invokevirtual   #122 <Method String String.concat(String)>
	//   30   67:aload_2         
	//   31   68:invokestatic    #373 <Method int Log.e(String, String, Throwable)>
	//   32   71:pop             
					return;
	//   33   72:return          
				} else
				{
					throw runtimeexception;
	//   34   73:aload_2         
	//   35   74:athrow          
				}
			}
		zzadv.release();
		return;
	//   36   75:return          
	}

	public void acquire()
	{
		zzaef.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field AtomicInteger zzaef>
	//    2    4:invokevirtual   #376 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		zza(((String) (null)), 0L);
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:lconst_0        
	//    7   11:invokespecial   #378 <Method void zza(String, long)>
	//    8   14:return          
	}

	public void acquire(long l)
	{
		zzaef.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field AtomicInteger zzaef>
	//    2    4:invokevirtual   #376 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		zza(((String) (null)), l);
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:lload_1         
	//    7   11:invokespecial   #378 <Method void zza(String, long)>
	//    8   14:return          
	}

	public void acquire(String s)
	{
		zzaef.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field AtomicInteger zzaef>
	//    2    4:invokevirtual   #376 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		zza(s, 0L);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:lconst_0        
	//    7   11:invokespecial   #378 <Method void zza(String, long)>
	//    8   14:return          
	}

	public void acquire(String s, long l)
	{
		zzaef.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field AtomicInteger zzaef>
	//    2    4:invokevirtual   #376 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		zza(s, l);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokespecial   #378 <Method void zza(String, long)>
	//    8   14:return          
	}

	public HeldLock acquireLock(long l, String s)
	{
		l = Math.min(l, zzaeh.getMaximumTimeout(zzadz, s));
	//    0    0:lload_1         
	//    1    1:getstatic       #43  <Field WakeLock$Configuration zzaeh>
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field String zzadz>
	//    4    8:aload_3         
	//    5    9:invokeinterface #385 <Method long WakeLock$Configuration.getMaximumTimeout(String, String)>
	//    6   14:invokestatic    #391 <Method long Math.min(long, long)>
	//    7   17:lstore_1        
	/* block-local class not found */
	class HeldLock {}

		HeldLock heldlock = new HeldLock(s, ((zza) (null)));
	//    8   18:new             #8   <Class WakeLock$HeldLock>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #394 <Method void WakeLock$HeldLock(WakeLock, String, zza)>
	//   14   28:astore          4
		zza(s, 0L);
	//   15   30:aload_0         
	//   16   31:aload_3         
	//   17   32:lconst_0        
	//   18   33:invokespecial   #378 <Method void zza(String, long)>
		s = ((String) (new WeakReference(((Object) (heldlock)))));
	//   19   36:new             #396 <Class WeakReference>
	//   20   39:dup             
	//   21   40:aload           4
	//   22   42:invokespecial   #399 <Method void WeakReference(Object)>
	//   23   45:astore_3        
		HeldLock.zza(heldlock, ((java.util.concurrent.Future) (zzaeg.schedule(((Runnable) (new zzc(((WeakReference) (s))))), l, TimeUnit.MILLISECONDS))));
	//   24   46:aload           4
	//   25   48:getstatic       #197 <Field ScheduledExecutorService zzaeg>
	//   26   51:new             #401 <Class zzc>
	//   27   54:dup             
	//   28   55:aload_3         
	//   29   56:invokespecial   #404 <Method void zzc(WeakReference)>
	//   30   59:lload_1         
	//   31   60:getstatic       #304 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   32   63:invokeinterface #310 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   33   68:invokestatic    #407 <Method java.util.concurrent.Future WakeLock$HeldLock.zza(WakeLock$HeldLock, java.util.concurrent.Future)>
	//   34   71:pop             
		return heldlock;
	//   35   72:aload           4
	//   36   74:areturn         
	}

	public void addWorkSource(WorkSource worksource)
	{
		if(worksource != null && WorkSourceUtil.hasWorkSourcePermission(zzjp))
	//*   0    0:aload_1         
	//*   1    1:ifnull          46
	//*   2    4:aload_0         
	//*   3    5:getfield        #100 <Field Context zzjp>
	//*   4    8:invokestatic    #147 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//*   5   11:ifeq            46
		{
			if(zzadw != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #191 <Field WorkSource zzadw>
	//*   8   18:ifnull          33
				zzadw.add(worksource);
	//    9   21:aload_0         
	//   10   22:getfield        #191 <Field WorkSource zzadw>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #412 <Method boolean WorkSource.add(WorkSource)>
	//   13   29:pop             
			else
	//*  14   30:goto            38
				zzadw = worksource;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #191 <Field WorkSource zzadw>
			zza(zzadw);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #191 <Field WorkSource zzadw>
	//   21   43:invokespecial   #414 <Method void zza(WorkSource)>
		}
	//   22   46:return          
	}

	public android.os.PowerManager.WakeLock getWakeLock()
	{
		return zzadv;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//    2    4:areturn         
	}

	public boolean isHeld()
	{
		return zzadv.isHeld();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//    2    4:invokevirtual   #250 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ireturn         
	}

	public void release()
	{
		zzb(((String) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:invokespecial   #418 <Method void zzb(String, int)>
	//    4    6:return          
	}

	public void release(int i)
	{
		zzb(((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokespecial   #418 <Method void zzb(String, int)>
	//    4    6:return          
	}

	public void release(String s)
	{
		zzb(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #418 <Method void zzb(String, int)>
	//    4    6:return          
	}

	public void release(String s, int i)
	{
		zzb(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #418 <Method void zzb(String, int)>
	//    4    6:return          
	}

	public void removeWorkSource(WorkSource worksource)
	{
		if(worksource != null && WorkSourceUtil.hasWorkSourcePermission(zzjp))
	//*   0    0:aload_1         
	//*   1    1:ifnull          50
	//*   2    4:aload_0         
	//*   3    5:getfield        #100 <Field Context zzjp>
	//*   4    8:invokestatic    #147 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//*   5   11:ifeq            50
			try
			{
				if(zzadw != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #191 <Field WorkSource zzadw>
	//*   8   18:ifnull          30
					zzadw.remove(worksource);
	//    9   21:aload_0         
	//   10   22:getfield        #191 <Field WorkSource zzadw>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #421 <Method boolean WorkSource.remove(WorkSource)>
	//   13   29:pop             
				zza(zzadw);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #191 <Field WorkSource zzadw>
	//   17   35:invokespecial   #414 <Method void zza(WorkSource)>
				return;
	//   18   38:return          
			}
			// Misplaced declaration of an exception variable
			catch(WorkSource worksource)
	//*  19   39:astore_1        
			{
				Log.e("WakeLock", ((ArrayIndexOutOfBoundsException) (worksource)).toString());
	//   20   40:ldc1            #170 <String "WakeLock">
	//   21   42:aload_1         
	//   22   43:invokevirtual   #422 <Method String ArrayIndexOutOfBoundsException.toString()>
	//   23   46:invokestatic    #326 <Method int Log.e(String, String)>
	//   24   49:pop             
			}
	//   25   50:return          
	}

	public void setReferenceCounted(boolean flag)
	{
		zzadv.setReferenceCounted(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field android.os.PowerManager$WakeLock zzadv>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #426 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		zzaec = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #68  <Field boolean zzaec>
	//    7   13:return          
	}

	public void setWorkSource(WorkSource worksource)
	{
		if(WorkSourceUtil.hasWorkSourcePermission(zzjp))
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field Context zzjp>
	//*   2    4:invokestatic    #147 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//*   3    7:ifeq            25
		{
			zza(worksource);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #414 <Method void zza(WorkSource)>
			zzadw = worksource;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #191 <Field WorkSource zzadw>
			zzadx = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #181 <Field String zzadx>
		}
	//   13   25:return          
	}

	private static ScheduledExecutorService zzaeg;
	private static Configuration zzaeh = new zza();
	private final android.os.PowerManager.WakeLock zzadv;
	private WorkSource zzadw;
	private String zzadx;
	private final int zzady;
	private final String zzadz;
	private final String zzaea;
	private final String zzaeb;
	private boolean zzaec;
	private final Map zzaed;
	private int zzaee;
	private AtomicInteger zzaef;
	private final Context zzjp;

	static 
	{
	//    0    0:new             #38  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void zza()>
	//    3    7:putstatic       #43  <Field WakeLock$Configuration zzaeh>
	//*   4   10:return          
	}
}
