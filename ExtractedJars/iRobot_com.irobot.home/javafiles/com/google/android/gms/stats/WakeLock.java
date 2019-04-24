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
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.stats:
//			zza, zzb

public class WakeLock
{
	public static interface zza
	{
	}


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
	//    6   11:invokevirtual   #55  <Method String Context.getPackageName()>
	//    7   14:astore          4
	//*   8   16:goto            7
		this(context, i, s, ((String) (null)), s1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:aconst_null     
	//   14   24:aload           4
	//   15   26:invokespecial   #58  <Method void WakeLock(Context, int, String, String, String)>
	//   16   29:return          
	}

	private WakeLock(Context context, int i, String s, String s1, String s2)
	{
		this(context, i, s, ((String) (null)), s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aload           5
	//    6    7:aconst_null     
	//    7    8:invokespecial   #62  <Method void WakeLock(Context, int, String, String, String, String)>
	//    8   11:return          
	}

	private WakeLock(Context context, int i, String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		zza = ((Object) (this));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:putfield        #72  <Field Object zza>
		zzi = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #74  <Field boolean zzi>
		zzj = ((Map) (new HashMap()));
	//    8   14:aload_0         
	//    9   15:new             #76  <Class HashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #77  <Method void HashMap()>
	//   12   22:putfield        #79  <Field Map zzj>
		zzk = Collections.synchronizedSet(((Set) (new HashSet())));
	//   13   25:aload_0         
	//   14   26:new             #81  <Class HashSet>
	//   15   29:dup             
	//   16   30:invokespecial   #82  <Method void HashSet()>
	//   17   33:invokestatic    #88  <Method Set Collections.synchronizedSet(Set)>
	//   18   36:putfield        #90  <Field Set zzk>
		zzm = new AtomicInteger(0);
	//   19   39:aload_0         
	//   20   40:new             #92  <Class AtomicInteger>
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:invokespecial   #95  <Method void AtomicInteger(int)>
	//   24   48:putfield        #97  <Field AtomicInteger zzm>
		Preconditions.checkNotNull(((Object) (context)), "WakeLock: context must not be null");
	//   25   51:aload_1         
	//   26   52:ldc1            #99  <String "WakeLock: context must not be null">
	//   27   54:invokestatic    #105 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   28   57:pop             
		Preconditions.checkNotEmpty(s, "WakeLock: wakeLockName must not be empty");
	//   29   58:aload_3         
	//   30   59:ldc1            #107 <String "WakeLock: wakeLockName must not be empty">
	//   31   61:invokestatic    #111 <Method String Preconditions.checkNotEmpty(String, Object)>
	//   32   64:pop             
		zzd = i;
	//   33   65:aload_0         
	//   34   66:iload_2         
	//   35   67:putfield        #113 <Field int zzd>
		zzf = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #115 <Field String zzf>
		zzg = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #117 <Field String zzg>
		zzh = context.getApplicationContext();
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #121 <Method Context Context.getApplicationContext()>
	//   45   85:putfield        #123 <Field Context zzh>
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))))
	//*  46   88:ldc1            #125 <String "com.google.android.gms">
	//*  47   90:aload_1         
	//*  48   91:invokevirtual   #55  <Method String Context.getPackageName()>
	//*  49   94:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  50   97:ifne            153
		{
			s1 = String.valueOf("*gcore*:");
	//   51  100:ldc1            #133 <String "*gcore*:">
	//   52  102:invokestatic    #137 <Method String String.valueOf(Object)>
	//   53  105:astore          4
			s3 = String.valueOf(((Object) (s)));
	//   54  107:aload_3         
	//   55  108:invokestatic    #137 <Method String String.valueOf(Object)>
	//   56  111:astore          6
			if(s3.length() != 0)
	//*  57  113:aload           6
	//*  58  115:invokevirtual   #141 <Method int String.length()>
	//*  59  118:ifeq            133
				s1 = s1.concat(s3);
	//   60  121:aload           4
	//   61  123:aload           6
	//   62  125:invokevirtual   #145 <Method String String.concat(String)>
	//   63  128:astore          4
			else
	//*  64  130:goto            144
				s1 = new String(s1);
	//   65  133:new             #127 <Class String>
	//   66  136:dup             
	//   67  137:aload           4
	//   68  139:invokespecial   #148 <Method void String(String)>
	//   69  142:astore          4
			zze = s1;
	//   70  144:aload_0         
	//   71  145:aload           4
	//   72  147:putfield        #150 <Field String zze>
		} else
	//*  73  150:goto            158
		{
			zze = s;
	//   74  153:aload_0         
	//   75  154:aload_3         
	//   76  155:putfield        #150 <Field String zze>
		}
		zzb = ((PowerManager)context.getSystemService("power")).newWakeLock(i, s);
	//   77  158:aload_0         
	//   78  159:aload_1         
	//   79  160:ldc1            #152 <String "power">
	//   80  162:invokevirtual   #156 <Method Object Context.getSystemService(String)>
	//   81  165:checkcast       #158 <Class PowerManager>
	//   82  168:iload_2         
	//   83  169:aload_3         
	//   84  170:invokevirtual   #162 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   85  173:putfield        #164 <Field android.os.PowerManager$WakeLock zzb>
		if(!WorkSourceUtil.hasWorkSourcePermission(context))
			break MISSING_BLOCK_LABEL_278;
	//   86  176:aload_1         
	//   87  177:invokestatic    #170 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//   88  180:ifeq            278
		s = s2;
	//   89  183:aload           5
	//   90  185:astore_3        
		if(Strings.isEmptyOrWhitespace(s2))
	//*  91  186:aload           5
	//*  92  188:invokestatic    #176 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*  93  191:ifeq            199
			s = context.getPackageName();
	//   94  194:aload_1         
	//   95  195:invokevirtual   #55  <Method String Context.getPackageName()>
	//   96  198:astore_3        
		zzc = WorkSourceUtil.fromPackage(context, s);
	//   97  199:aload_0         
	//   98  200:aload_1         
	//   99  201:aload_3         
	//  100  202:invokestatic    #180 <Method WorkSource WorkSourceUtil.fromPackage(Context, String)>
	//  101  205:putfield        #182 <Field WorkSource zzc>
		context = ((Context) (zzc));
	//  102  208:aload_0         
	//  103  209:getfield        #182 <Field WorkSource zzc>
	//  104  212:astore_1        
		if(context == null || !WorkSourceUtil.hasWorkSourcePermission(zzh))
			break MISSING_BLOCK_LABEL_278;
	//  105  213:aload_1         
	//  106  214:ifnull          278
	//  107  217:aload_0         
	//  108  218:getfield        #123 <Field Context zzh>
	//  109  221:invokestatic    #170 <Method boolean WorkSourceUtil.hasWorkSourcePermission(Context)>
	//  110  224:ifeq            278
		if(zzc != null)
	//* 111  227:aload_0         
	//* 112  228:getfield        #182 <Field WorkSource zzc>
	//* 113  231:ifnull          246
			zzc.add(((WorkSource) (context)));
	//  114  234:aload_0         
	//  115  235:getfield        #182 <Field WorkSource zzc>
	//  116  238:aload_1         
	//  117  239:invokevirtual   #188 <Method boolean WorkSource.add(WorkSource)>
	//  118  242:pop             
		else
	//* 119  243:goto            251
			zzc = ((WorkSource) (context));
	//  120  246:aload_0         
	//  121  247:aload_1         
	//  122  248:putfield        #182 <Field WorkSource zzc>
		context = ((Context) (zzc));
	//  123  251:aload_0         
	//  124  252:getfield        #182 <Field WorkSource zzc>
	//  125  255:astore_1        
		try
		{
			zzb.setWorkSource(((WorkSource) (context)));
	//  126  256:aload_0         
	//  127  257:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//  128  260:aload_1         
	//  129  261:invokevirtual   #194 <Method void android.os.PowerManager$WakeLock.setWorkSource(WorkSource)>
		}
	//* 130  264:goto            278
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 131  267:astore_1        
		{
			Log.wtf("WakeLock", ((RuntimeException) (context)).toString());
	//  132  268:ldc1            #196 <String "WakeLock">
	//  133  270:aload_1         
	//  134  271:invokevirtual   #201 <Method String RuntimeException.toString()>
	//  135  274:invokestatic    #207 <Method int Log.wtf(String, String)>
	//  136  277:pop             
		}
		if(zzn == null)
	//* 137  278:getstatic       #209 <Field ScheduledExecutorService zzn>
	//* 138  281:ifnonnull       295
			zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
	//  139  284:invokestatic    #215 <Method com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory PooledExecutorsProvider.getInstance()>
	//  140  287:invokeinterface #221 <Method ScheduledExecutorService com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory.newSingleThreadScheduledExecutor()>
	//  141  292:putstatic       #209 <Field ScheduledExecutorService zzn>
		return;
	//  142  295:return          
	}

	private final String zza(String s)
	{
		if(zzi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field boolean zzi>
	//*   2    4:ifeq            21
		{
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            16
				return s;
	//    6   14:aload_1         
	//    7   15:areturn         
			else
				return zzf;
	//    8   16:aload_0         
	//    9   17:getfield        #115 <Field String zzf>
	//   10   20:areturn         
		} else
		{
			return zzf;
	//   11   21:aload_0         
	//   12   22:getfield        #115 <Field String zzf>
	//   13   25:areturn         
		}
	}

	private final List zza()
	{
		return WorkSourceUtil.getNames(zzc);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field WorkSource zzc>
	//    2    4:invokestatic    #232 <Method List WorkSourceUtil.getNames(WorkSource)>
	//    3    7:areturn         
	}

	private final void zza(int i)
	{
		if(!zzb.isHeld())
			break MISSING_BLOCK_LABEL_63;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//    2    4:invokevirtual   #238 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ifeq            63
		zzb.release();
	//    4   10:aload_0         
	//    5   11:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//    6   14:invokevirtual   #241 <Method void android.os.PowerManager$WakeLock.release()>
		break MISSING_BLOCK_LABEL_52;
	//    7   17:goto            52
		RuntimeException runtimeexception;
		runtimeexception;
	//    8   20:astore_2        
		if(!((Object) (((Object) (runtimeexception)).getClass())).equals(java/lang/RuntimeException))
			break MISSING_BLOCK_LABEL_61;
	//    9   21:aload_2         
	//   10   22:invokevirtual   #245 <Method Class Object.getClass()>
	//   11   25:ldc1            #198 <Class RuntimeException>
	//   12   27:invokevirtual   #246 <Method boolean Object.equals(Object)>
	//   13   30:ifeq            61
		Log.e("WakeLock", String.valueOf(((Object) (zze))).concat(" was already released!"), ((Throwable) (runtimeexception)));
	//   14   33:ldc1            #196 <String "WakeLock">
	//   15   35:aload_0         
	//   16   36:getfield        #150 <Field String zze>
	//   17   39:invokestatic    #137 <Method String String.valueOf(Object)>
	//   18   42:ldc1            #248 <String " was already released!">
	//   19   44:invokevirtual   #145 <Method String String.concat(String)>
	//   20   47:aload_2         
	//   21   48:invokestatic    #252 <Method int Log.e(String, String, Throwable)>
	//   22   51:pop             
		zzb.isHeld();
	//   23   52:aload_0         
	//   24   53:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//   25   56:invokevirtual   #238 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//   26   59:pop             
		return;
	//   27   60:return          
		throw runtimeexception;
	//   28   61:aload_2         
	//   29   62:athrow          
	//   30   63:return          
	}

	static void zza(WakeLock wakelock, int i)
	{
		wakelock.zza(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #255 <Method void zza(int)>
	//    3    5:return          
	}

	public void acquire(long l)
	{
		String s;
		zzm.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field AtomicInteger zzm>
	//    2    4:invokevirtual   #260 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		s = zza(((String) (null)));
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #262 <Method String zza(String)>
	//    7   13:astore          6
		Object obj = zza;
	//    8   15:aload_0         
	//    9   16:getfield        #72  <Field Object zza>
	//   10   19:astore          5
		obj;
	//   11   21:aload           5
		JVM INSTR monitorenter ;
	//   12   23:monitorenter    
		boolean flag1 = zzj.isEmpty();
	//   13   24:aload_0         
	//   14   25:getfield        #79  <Field Map zzj>
	//   15   28:invokeinterface #266 <Method boolean Map.isEmpty()>
	//   16   33:istore          4
		boolean flag;
		flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_3        
		if(!flag1)
			break MISSING_BLOCK_LABEL_49;
	//   19   37:iload           4
	//   20   39:ifeq            49
		if(zzl <= 0)
			break MISSING_BLOCK_LABEL_73;
	//   21   42:aload_0         
	//   22   43:getfield        #268 <Field int zzl>
	//   23   46:ifle            73
		if(!zzb.isHeld())
	//*  24   49:aload_0         
	//*  25   50:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//*  26   53:invokevirtual   #238 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//*  27   56:ifne            73
		{
			zzj.clear();
	//   28   59:aload_0         
	//   29   60:getfield        #79  <Field Map zzj>
	//   30   63:invokeinterface #271 <Method void Map.clear()>
			zzl = 0;
	//   31   68:aload_0         
	//   32   69:iconst_0        
	//   33   70:putfield        #268 <Field int zzl>
		}
		if(!zzi) goto _L2; else goto _L1
	//   34   73:aload_0         
	//   35   74:getfield        #74  <Field boolean zzi>
	//   36   77:ifeq            148
_L1:
		Integer ainteger[] = (Integer[])zzj.get(((Object) (s)));
	//   37   80:aload_0         
	//   38   81:getfield        #79  <Field Map zzj>
	//   39   84:aload           6
	//   40   86:invokeinterface #275 <Method Object Map.get(Object)>
	//   41   91:checkcast       #277 <Class Integer[]>
	//   42   94:astore          7
		if(ainteger != null) goto _L4; else goto _L3
	//   43   96:aload           7
	//   44   98:ifnonnull       129
_L3:
		zzj.put(((Object) (s)), ((Object) (new Integer[] {
			Integer.valueOf(1)
		})));
	//   45  101:aload_0         
	//   46  102:getfield        #79  <Field Map zzj>
	//   47  105:aload           6
	//   48  107:iconst_1        
	//   49  108:anewarray       Integer[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:iconst_1        
	//   53  114:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   54  117:aastore         
	//   55  118:invokeinterface #285 <Method Object Map.put(Object, Object)>
	//   56  123:pop             
		flag = true;
	//   57  124:iconst_1        
	//   58  125:istore_3        
		  goto _L5
	//*  59  126:goto            255
_L4:
		ainteger[0] = Integer.valueOf(ainteger[0].intValue() + 1);
	//   60  129:aload           7
	//   61  131:iconst_0        
	//   62  132:aload           7
	//   63  134:iconst_0        
	//   64  135:aaload          
	//   65  136:invokevirtual   #288 <Method int Integer.intValue()>
	//   66  139:iconst_1        
	//   67  140:iadd            
	//   68  141:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   69  144:aastore         
		  goto _L5
	//*  70  145:goto            255
_L2:
		if(zzi || zzl != 0) goto _L7; else goto _L6
	//   71  148:aload_0         
	//   72  149:getfield        #74  <Field boolean zzi>
	//   73  152:ifne            209
	//   74  155:aload_0         
	//   75  156:getfield        #268 <Field int zzl>
	//   76  159:ifne            209
_L6:
		WakeLockTracker.getInstance().registerEvent(zzh, StatsUtils.getEventKey(zzb, s), 7, zze, s, ((String) (null)), zzd, zza(), l);
	//   77  162:invokestatic    #293 <Method WakeLockTracker WakeLockTracker.getInstance()>
	//   78  165:aload_0         
	//   79  166:getfield        #123 <Field Context zzh>
	//   80  169:aload_0         
	//   81  170:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//   82  173:aload           6
	//   83  175:invokestatic    #299 <Method String StatsUtils.getEventKey(android.os.PowerManager$WakeLock, String)>
	//   84  178:bipush          7
	//   85  180:aload_0         
	//   86  181:getfield        #150 <Field String zze>
	//   87  184:aload           6
	//   88  186:aconst_null     
	//   89  187:aload_0         
	//   90  188:getfield        #113 <Field int zzd>
	//   91  191:aload_0         
	//   92  192:invokespecial   #301 <Method List zza()>
	//   93  195:lload_1         
	//   94  196:invokevirtual   #305 <Method void WakeLockTracker.registerEvent(Context, String, int, String, String, String, int, List, long)>
		zzl = zzl + 1;
	//   95  199:aload_0         
	//   96  200:aload_0         
	//   97  201:getfield        #268 <Field int zzl>
	//   98  204:iconst_1        
	//   99  205:iadd            
	//  100  206:putfield        #268 <Field int zzl>
_L7:
		obj;
	//  101  209:aload           5
		JVM INSTR monitorexit ;
	//  102  211:monitorexit     
		zzb.acquire();
	//  103  212:aload_0         
	//  104  213:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//  105  216:invokevirtual   #307 <Method void android.os.PowerManager$WakeLock.acquire()>
		if(l > 0L)
	//* 106  219:lload_1         
	//* 107  220:lconst_0        
	//* 108  221:lcmp            
	//* 109  222:ifle            246
			zzn.schedule(((Runnable) (new zzb(this))), l, TimeUnit.MILLISECONDS);
	//  110  225:getstatic       #209 <Field ScheduledExecutorService zzn>
	//  111  228:new             #309 <Class zzb>
	//  112  231:dup             
	//  113  232:aload_0         
	//  114  233:invokespecial   #312 <Method void zzb(WakeLock)>
	//  115  236:lload_1         
	//  116  237:getstatic       #318 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  117  240:invokeinterface #324 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//  118  245:pop             
		return;
	//  119  246:return          
		Exception exception;
		exception;
	//  120  247:astore          6
		obj;
	//  121  249:aload           5
		JVM INSTR monitorexit ;
	//  122  251:monitorexit     
		throw exception;
	//  123  252:aload           6
	//  124  254:athrow          
_L5:
		if(flag) goto _L6; else goto _L2
	//  125  255:iload_3         
	//  126  256:ifne            162
	//* 127  259:goto            148
	}

	public boolean isHeld()
	{
		return zzb.isHeld();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//    2    4:invokevirtual   #238 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ireturn         
	}

	public void release()
	{
		String s;
		if(zzm.decrementAndGet() < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field AtomicInteger zzm>
	//*   2    4:invokevirtual   #327 <Method int AtomicInteger.decrementAndGet()>
	//*   3    7:ifge            29
			Log.e("WakeLock", String.valueOf(((Object) (zze))).concat(" release without a matched acquire!"));
	//    4   10:ldc1            #196 <String "WakeLock">
	//    5   12:aload_0         
	//    6   13:getfield        #150 <Field String zze>
	//    7   16:invokestatic    #137 <Method String String.valueOf(Object)>
	//    8   19:ldc2            #329 <String " release without a matched acquire!">
	//    9   22:invokevirtual   #145 <Method String String.concat(String)>
	//   10   25:invokestatic    #331 <Method int Log.e(String, String)>
	//   11   28:pop             
		s = zza(((String) (null)));
	//   12   29:aload_0         
	//   13   30:aconst_null     
	//   14   31:invokespecial   #262 <Method String zza(String)>
	//   15   34:astore_3        
		Object obj = zza;
	//   16   35:aload_0         
	//   17   36:getfield        #72  <Field Object zza>
	//   18   39:astore_2        
		obj;
	//   19   40:aload_2         
		JVM INSTR monitorenter ;
	//   20   41:monitorenter    
		if(!zzi) goto _L2; else goto _L1
	//   21   42:aload_0         
	//   22   43:getfield        #74  <Field boolean zzi>
	//   23   46:ifeq            118
_L1:
		Integer ainteger[] = (Integer[])zzj.get(((Object) (s)));
	//   24   49:aload_0         
	//   25   50:getfield        #79  <Field Map zzj>
	//   26   53:aload_3         
	//   27   54:invokeinterface #275 <Method Object Map.get(Object)>
	//   28   59:checkcast       #277 <Class Integer[]>
	//   29   62:astore          4
		if(ainteger != null) goto _L4; else goto _L3
	//   30   64:aload           4
	//   31   66:ifnonnull       72
	//*  32   69:goto            190
_L4:
		if(ainteger[0].intValue() != 1) goto _L6; else goto _L5
	//   33   72:aload           4
	//   34   74:iconst_0        
	//   35   75:aaload          
	//   36   76:invokevirtual   #288 <Method int Integer.intValue()>
	//   37   79:iconst_1        
	//   38   80:icmpne          99
_L5:
		zzj.remove(((Object) (s)));
	//   39   83:aload_0         
	//   40   84:getfield        #79  <Field Map zzj>
	//   41   87:aload_3         
	//   42   88:invokeinterface #334 <Method Object Map.remove(Object)>
	//   43   93:pop             
		boolean flag = true;
	//   44   94:iconst_1        
	//   45   95:istore_1        
		  goto _L7
	//*  46   96:goto            192
_L6:
		ainteger[0] = Integer.valueOf(ainteger[0].intValue() - 1);
	//   47   99:aload           4
	//   48  101:iconst_0        
	//   49  102:aload           4
	//   50  104:iconst_0        
	//   51  105:aaload          
	//   52  106:invokevirtual   #288 <Method int Integer.intValue()>
	//   53  109:iconst_1        
	//   54  110:isub            
	//   55  111:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   56  114:aastore         
		  goto _L3
	//*  57  115:goto            190
_L2:
		if(zzi || zzl != 1) goto _L9; else goto _L8
	//   58  118:aload_0         
	//   59  119:getfield        #74  <Field boolean zzi>
	//   60  122:ifne            177
	//   61  125:aload_0         
	//   62  126:getfield        #268 <Field int zzl>
	//   63  129:iconst_1        
	//   64  130:icmpne          177
_L8:
		WakeLockTracker.getInstance().registerEvent(zzh, StatsUtils.getEventKey(zzb, s), 8, zze, s, ((String) (null)), zzd, zza());
	//   65  133:invokestatic    #293 <Method WakeLockTracker WakeLockTracker.getInstance()>
	//   66  136:aload_0         
	//   67  137:getfield        #123 <Field Context zzh>
	//   68  140:aload_0         
	//   69  141:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//   70  144:aload_3         
	//   71  145:invokestatic    #299 <Method String StatsUtils.getEventKey(android.os.PowerManager$WakeLock, String)>
	//   72  148:bipush          8
	//   73  150:aload_0         
	//   74  151:getfield        #150 <Field String zze>
	//   75  154:aload_3         
	//   76  155:aconst_null     
	//   77  156:aload_0         
	//   78  157:getfield        #113 <Field int zzd>
	//   79  160:aload_0         
	//   80  161:invokespecial   #301 <Method List zza()>
	//   81  164:invokevirtual   #337 <Method void WakeLockTracker.registerEvent(Context, String, int, String, String, String, int, List)>
		zzl = zzl - 1;
	//   82  167:aload_0         
	//   83  168:aload_0         
	//   84  169:getfield        #268 <Field int zzl>
	//   85  172:iconst_1        
	//   86  173:isub            
	//   87  174:putfield        #268 <Field int zzl>
_L9:
		obj;
	//   88  177:aload_2         
		JVM INSTR monitorexit ;
	//   89  178:monitorexit     
		zza(0);
	//   90  179:aload_0         
	//   91  180:iconst_0        
	//   92  181:invokespecial   #255 <Method void zza(int)>
		return;
	//   93  184:return          
		Exception exception;
		exception;
	//   94  185:astore_3        
		obj;
	//   95  186:aload_2         
		JVM INSTR monitorexit ;
	//   96  187:monitorexit     
		throw exception;
	//   97  188:aload_3         
	//   98  189:athrow          
_L3:
		flag = false;
	//   99  190:iconst_0        
	//  100  191:istore_1        
_L7:
		if(flag) goto _L8; else goto _L2
	//  101  192:iload_1         
	//  102  193:ifne            133
	//* 103  196:goto            118
	}

	public void setReferenceCounted(boolean flag)
	{
		zzb.setReferenceCounted(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field android.os.PowerManager$WakeLock zzb>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #341 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		zzi = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #74  <Field boolean zzi>
	//    7   13:return          
	}

	private static ScheduledExecutorService zzn;
	private static volatile zza zzo = new com.google.android.gms.stats.zza();
	private final Object zza;
	private final android.os.PowerManager.WakeLock zzb;
	private WorkSource zzc;
	private final int zzd;
	private final String zze;
	private final String zzf;
	private final String zzg;
	private final Context zzh;
	private boolean zzi;
	private final Map zzj;
	private final Set zzk;
	private int zzl;
	private AtomicInteger zzm;

	static 
	{
	//    0    0:new             #42  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void zza()>
	//    3    7:putstatic       #47  <Field WakeLock$zza zzo>
	//*   4   10:return          
	}
}
