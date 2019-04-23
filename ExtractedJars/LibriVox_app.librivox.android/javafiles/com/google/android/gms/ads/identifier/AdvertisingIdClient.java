// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.am;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//			c, a, b

public class AdvertisingIdClient
{

	public AdvertisingIdClient(Context context)
	{
		this(context, 30000L, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #27  <Long 30000L>
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #31  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//    6   10:return          
	}

	private AdvertisingIdClient(Context context, long l, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Object()>
	//    6   12:putfield        #37  <Field Object zzh>
		am.a(((Object) (context)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #43  <Method Object am.a(Object)>
	//    9   19:pop             
		Context context1 = context;
	//   10   20:aload_1         
	//   11   21:astore          6
		if(flag)
	//*  12   23:iload           4
	//*  13   25:ifeq            45
		{
			context1 = context.getApplicationContext();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #49  <Method Context Context.getApplicationContext()>
	//   16   32:astore          6
			if(context1 == null)
	//*  17   34:aload           6
	//*  18   36:ifnonnull       45
				context1 = context;
	//   19   39:aload_1         
	//   20   40:astore          6
		}
	//*  21   42:goto            45
		mContext = context1;
	//   22   45:aload_0         
	//   23   46:aload           6
	//   24   48:putfield        #51  <Field Context mContext>
		zzg = false;
	//   25   51:aload_0         
	//   26   52:iconst_0        
	//   27   53:putfield        #53  <Field boolean zzg>
		zzk = l;
	//   28   56:aload_0         
	//   29   57:lload_2         
	//   30   58:putfield        #55  <Field long zzk>
		zzj = flag1;
	//   31   61:aload_0         
	//   32   62:iload           5
	//   33   64:putfield        #57  <Field boolean zzj>
	//   34   67:return          
	}

	public static Info getAdvertisingIdInfo(Context context)
	{
		float f1;
		boolean flag;
		Object obj;
		c c1 = new c(context);
	//    0    0:new             #63  <Class c>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void c(Context)>
	//    4    8:astore          6
		flag = c1.a("gads:ad_id_app_context:enabled", false);
	//    5   10:aload           6
	//    6   12:ldc1            #67  <String "gads:ad_id_app_context:enabled">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #70  <Method boolean com.google.android.gms.ads.identifier.c.a(String, boolean)>
	//    9   18:istore_2        
		f1 = c1.a("gads:ad_id_app_context:ping_ratio", 0.0F);
	//   10   19:aload           6
	//   11   21:ldc1            #72  <String "gads:ad_id_app_context:ping_ratio">
	//   12   23:fconst_0        
	//   13   24:invokevirtual   #75  <Method float com.google.android.gms.ads.identifier.c.a(String, float)>
	//   14   27:fstore_1        
		obj = ((Object) (c1.a("gads:ad_id_use_shared_preference:experiment_id", "")));
	//   15   28:aload           6
	//   16   30:ldc1            #77  <String "gads:ad_id_use_shared_preference:experiment_id">
	//   17   32:ldc1            #79  <String "">
	//   18   34:invokevirtual   #82  <Method String com.google.android.gms.ads.identifier.c.a(String, String)>
	//   19   37:astore          5
		context = ((Context) (new AdvertisingIdClient(context, -1L, flag, c1.a("gads:ad_id_use_persistent_service:enabled", false))));
	//   20   39:new             #2   <Class AdvertisingIdClient>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:ldc2w           #83  <Long -1L>
	//   24   47:iload_2         
	//   25   48:aload           6
	//   26   50:ldc1            #86  <String "gads:ad_id_use_persistent_service:enabled">
	//   27   52:iconst_0        
	//   28   53:invokevirtual   #70  <Method boolean com.google.android.gms.ads.identifier.c.a(String, boolean)>
	//   29   56:invokespecial   #31  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//   30   59:astore_0        
		Info info;
		long l = SystemClock.elapsedRealtime();
	//   31   60:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   32   63:lstore_3        
		((AdvertisingIdClient) (context)).zza(false);
	//   33   64:aload_0         
	//   34   65:iconst_0        
	//   35   66:invokespecial   #96  <Method void zza(boolean)>
		info = ((AdvertisingIdClient) (context)).getInfo();
	//   36   69:aload_0         
	//   37   70:invokevirtual   #100 <Method AdvertisingIdClient$Info getInfo()>
	//   38   73:astore          6
		((AdvertisingIdClient) (context)).zza(info, flag, f1, SystemClock.elapsedRealtime() - l, ((String) (obj)), ((Throwable) (null)));
	//   39   75:aload_0         
	//   40   76:aload           6
	//   41   78:iload_2         
	//   42   79:fload_1         
	//   43   80:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   44   83:lload_3         
	//   45   84:lsub            
	//   46   85:aload           5
	//   47   87:aconst_null     
	//   48   88:invokespecial   #103 <Method boolean zza(AdvertisingIdClient$Info, boolean, float, long, String, Throwable)>
	//   49   91:pop             
		((AdvertisingIdClient) (context)).finish();
	//   50   92:aload_0         
	//   51   93:invokevirtual   #106 <Method void finish()>
		return info;
	//   52   96:aload           6
	//   53   98:areturn         
		obj;
	//   54   99:astore          5
		break MISSING_BLOCK_LABEL_124;
	//   55  101:goto            124
		Throwable throwable;
		throwable;
	//   56  104:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (null)), flag, f1, -1L, ((String) (obj)), throwable);
	//   57  106:aload_0         
	//   58  107:aconst_null     
	//   59  108:iload_2         
	//   60  109:fload_1         
	//   61  110:ldc2w           #83  <Long -1L>
	//   62  113:aload           5
	//   63  115:aload           6
	//   64  117:invokespecial   #103 <Method boolean zza(AdvertisingIdClient$Info, boolean, float, long, String, Throwable)>
	//   65  120:pop             
		throw throwable;
	//   66  121:aload           6
	//   67  123:athrow          
		((AdvertisingIdClient) (context)).finish();
	//   68  124:aload_0         
	//   69  125:invokevirtual   #106 <Method void finish()>
		throw obj;
	//   70  128:aload           5
	//   71  130:athrow          
	}

	public static boolean getIsAdIdFakeForDebugLogging(Context context)
	{
		c c1 = new c(context);
	//    0    0:new             #63  <Class c>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void c(Context)>
	//    4    8:astore_2        
		context = ((Context) (new AdvertisingIdClient(context, -1L, c1.a("gads:ad_id_app_context:enabled", false), c1.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false))));
	//    5    9:new             #2   <Class AdvertisingIdClient>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc2w           #83  <Long -1L>
	//    9   17:aload_2         
	//   10   18:ldc1            #67  <String "gads:ad_id_app_context:enabled">
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #70  <Method boolean com.google.android.gms.ads.identifier.c.a(String, boolean)>
	//   13   24:aload_2         
	//   14   25:ldc1            #110 <String "com.google.android.gms.ads.identifier.service.PERSISTENT_START">
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #70  <Method boolean com.google.android.gms.ads.identifier.c.a(String, boolean)>
	//   17   31:invokespecial   #31  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//   18   34:astore_0        
		boolean flag;
		((AdvertisingIdClient) (context)).zza(false);
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:invokespecial   #96  <Method void zza(boolean)>
		flag = ((AdvertisingIdClient) (context)).zzb();
	//   22   40:aload_0         
	//   23   41:invokespecial   #114 <Method boolean zzb()>
	//   24   44:istore_1        
		((AdvertisingIdClient) (context)).finish();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #106 <Method void finish()>
		return flag;
	//   27   49:iload_1         
	//   28   50:ireturn         
		Exception exception;
		exception;
	//   29   51:astore_2        
		((AdvertisingIdClient) (context)).finish();
	//   30   52:aload_0         
	//   31   53:invokevirtual   #106 <Method void finish()>
		throw exception;
	//   32   56:aload_2         
	//   33   57:athrow          
	}

	public static void setShouldSkipGmsCoreVersionCheck(boolean flag)
	{
	//    0    0:return          
	}

	private static a zza(Context context, boolean flag)
	{
		int i;
		Object obj;
		a a1;
		try
		{
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #124 <String "com.android.vending">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #130 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:pop             
		}
	//*   6   11:invokestatic    #136 <Method e e.b()>
	//*   7   14:aload_0         
	//*   8   15:ldc1            #137 <Int 0xbdfcb8>
	//*   9   17:invokevirtual   #140 <Method int e.b(Context, int)>
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:ifeq            43
	//*  13   25:iload_2         
	//*  14   26:iconst_2        
	//*  15   27:icmpne          33
	//*  16   30:goto            43
	//*  17   33:new             #142 <Class IOException>
	//*  18   36:dup             
	//*  19   37:ldc1            #144 <String "Google Play services not available">
	//*  20   39:invokespecial   #147 <Method void IOException(String)>
	//*  21   42:athrow          
	//*  22   43:iload_1         
	//*  23   44:ifeq            53
	//*  24   47:ldc1            #110 <String "com.google.android.gms.ads.identifier.service.PERSISTENT_START">
	//*  25   49:astore_3        
	//*  26   50:goto            56
	//*  27   53:ldc1            #149 <String "com.google.android.gms.ads.identifier.service.START">
	//*  28   55:astore_3        
	//*  29   56:new             #151 <Class a>
	//*  30   59:dup             
	//*  31   60:invokespecial   #152 <Method void a()>
	//*  32   63:astore          4
	//*  33   65:new             #154 <Class Intent>
	//*  34   68:dup             
	//*  35   69:aload_3         
	//*  36   70:invokespecial   #155 <Method void Intent(String)>
	//*  37   73:astore_3        
	//*  38   74:aload_3         
	//*  39   75:ldc1            #157 <String "com.google.android.gms">
	//*  40   77:invokevirtual   #161 <Method Intent Intent.setPackage(String)>
	//*  41   80:pop             
	//*  42   81:invokestatic    #166 <Method com.google.android.gms.common.stats.a com.google.android.gms.common.stats.a.a()>
	//*  43   84:aload_0         
	//*  44   85:aload_3         
	//*  45   86:aload           4
	//*  46   88:iconst_1        
	//*  47   89:invokevirtual   #169 <Method boolean com.google.android.gms.common.stats.a.a(Context, Intent, android.content.ServiceConnection, int)>
	//*  48   92:istore_1        
	//*  49   93:iload_1         
	//*  50   94:ifeq            100
	//*  51   97:aload           4
	//*  52   99:areturn         
	//*  53  100:new             #142 <Class IOException>
	//*  54  103:dup             
	//*  55  104:ldc1            #171 <String "Connection failure">
	//*  56  106:invokespecial   #147 <Method void IOException(String)>
	//*  57  109:athrow          
	//*  58  110:astore_0        
	//*  59  111:new             #142 <Class IOException>
	//*  60  114:dup             
	//*  61  115:aload_0         
	//*  62  116:invokespecial   #174 <Method void IOException(Throwable)>
	//*  63  119:athrow          
	//*  64  120:new             #176 <Class f>
	//*  65  123:dup             
	//*  66  124:bipush          9
	//*  67  126:invokespecial   #179 <Method void f(int)>
	//*  68  129:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new f(9);
		}
		i = e.b().b(context, 0xbdfcb8);
		if(i != 0 && i != 2)
			throw new IOException("Google Play services not available");
		if(flag)
			obj = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
		else
			obj = "com.google.android.gms.ads.identifier.service.START";
		a1 = new a();
		obj = ((Object) (new Intent(((String) (obj)))));
		((Intent) (obj)).setPackage("com.google.android.gms");
		try
		{
			flag = com.google.android.gms.common.stats.a.a().a(context, ((Intent) (obj)), ((android.content.ServiceConnection) (a1)), 1);
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException(((Throwable) (context)));
		}
		if(flag)
			return a1;
		else
			throw new IOException("Connection failure");
	//*  69  130:astore_0        
	//*  70  131:goto            120
	}

	private static com.google.android.gms.internal.a.e zza(Context context, a a1)
	{
		try
		{
			context = ((Context) (com.google.android.gms.internal.a.f.a(a1.a(10000L, TimeUnit.MILLISECONDS))));
	//    0    0:aload_1         
	//    1    1:ldc2w           #183 <Long 10000L>
	//    2    4:getstatic       #190 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokevirtual   #193 <Method android.os.IBinder a.a(long, TimeUnit)>
	//    4   10:invokestatic    #198 <Method com.google.android.gms.internal.a.e com.google.android.gms.internal.a.f.a(android.os.IBinder)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
	//*   8   16:astore_0        
	//*   9   17:new             #142 <Class IOException>
	//*  10   20:dup             
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #174 <Method void IOException(Throwable)>
	//*  13   25:athrow          
	//*  14   26:new             #142 <Class IOException>
	//*  15   29:dup             
	//*  16   30:ldc1            #200 <String "Interrupted exception">
	//*  17   32:invokespecial   #147 <Method void IOException(String)>
	//*  18   35:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException("Interrupted exception");
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException(((Throwable) (context)));
		}
		return ((com.google.android.gms.internal.a.e) (context));
	//*  19   36:astore_0        
	//*  20   37:goto            26
	}

	private final void zza()
	{
		Object obj = zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object zzh>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzi == null)
			break MISSING_BLOCK_LABEL_31;
	//    5    7:aload_0         
	//    6    8:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//    7   11:ifnull          31
		zzi.a.countDown();
	//    8   14:aload_0         
	//    9   15:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   10   18:getfield        #207 <Field CountDownLatch com.google.android.gms.ads.identifier.a.a>
	//   11   21:invokevirtual   #212 <Method void CountDownLatch.countDown()>
		Exception exception;
		try
		{
			zzi.join();
	//   12   24:aload_0         
	//   13   25:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   14   28:invokevirtual   #215 <Method void a.join()>
		}
	//*  15   31:aload_0         
	//*  16   32:getfield        #55  <Field long zzk>
	//*  17   35:lconst_0        
	//*  18   36:lcmp            
	//*  19   37:ifle            56
	//*  20   40:aload_0         
	//*  21   41:new             #204 <Class com.google.android.gms.ads.identifier.a>
	//*  22   44:dup             
	//*  23   45:aload_0         
	//*  24   46:aload_0         
	//*  25   47:getfield        #55  <Field long zzk>
	//*  26   50:invokespecial   #218 <Method void com.google.android.gms.ads.identifier.a(AdvertisingIdClient, long)>
	//*  27   53:putfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//*  28   56:aload_1         
	//*  29   57:monitorexit     
	//*  30   58:return          
	//*  31   59:astore_2        
	//*  32   60:aload_1         
	//*  33   61:monitorexit     
	//*  34   62:aload_2         
	//*  35   63:athrow          
		catch(InterruptedException interruptedexception) { }
	//   36   64:astore_2        
		if(zzk > 0L)
			zzi = new com.google.android.gms.ads.identifier.a(this, zzk);
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  37   65:goto            31
	}

	private final void zza(boolean flag)
	{
		am.c("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #220 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #223 <Method void am.c(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
	//*   4    7:aload_0         
	//*   5    8:getfield        #53  <Field boolean zzg>
	//*   6   11:ifeq            18
			finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #106 <Method void finish()>
		zze = zza(mContext, zzj);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #51  <Field Context mContext>
	//   12   23:aload_0         
	//   13   24:getfield        #57  <Field boolean zzj>
	//   14   27:invokestatic    #225 <Method a zza(Context, boolean)>
	//   15   30:putfield        #227 <Field a zze>
		zzf = zza(mContext, zze);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #51  <Field Context mContext>
	//   19   38:aload_0         
	//   20   39:getfield        #227 <Field a zze>
	//   21   42:invokestatic    #229 <Method com.google.android.gms.internal.a.e zza(Context, a)>
	//   22   45:putfield        #231 <Field com.google.android.gms.internal.a.e zzf>
		zzg = true;
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:putfield        #53  <Field boolean zzg>
		if(!flag)
			break MISSING_BLOCK_LABEL_61;
	//   26   53:iload_1         
	//   27   54:ifeq            61
		zza();
	//   28   57:aload_0         
	//   29   58:invokespecial   #233 <Method void zza()>
		this;
	//   30   61:aload_0         
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		return;
	//   32   63:return          
		Exception exception;
		exception;
	//   33   64:astore_2        
		this;
	//   34   65:aload_0         
		JVM INSTR monitorexit ;
	//   35   66:monitorexit     
		throw exception;
	//   36   67:aload_2         
	//   37   68:athrow          
	}

	private final boolean zza(Info info, boolean flag, float f1, long l, String s, Throwable throwable)
	{
		if(Math.random() > (double)f1)
	//*   0    0:invokestatic    #239 <Method double Math.random()>
	//*   1    3:fload_3         
	//*   2    4:f2d             
	//*   3    5:dcmpl           
	//*   4    6:ifle            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #241 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #242 <Method void HashMap()>
	//   10   18:astore          9
		String s1;
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            31
			s1 = "1";
	//   13   24:ldc1            #244 <String "1">
	//   14   26:astore          8
		else
	//*  15   28:goto            35
			s1 = "0";
	//   16   31:ldc1            #246 <String "0">
	//   17   33:astore          8
		((Map) (hashmap)).put("app_context", ((Object) (s1)));
	//   18   35:aload           9
	//   19   37:ldc1            #248 <String "app_context">
	//   20   39:aload           8
	//   21   41:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   22   46:pop             
		if(info != null)
	//*  23   47:aload_1         
	//*  24   48:ifnull          82
		{
			String s2;
			if(info.isLimitAdTrackingEnabled())
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #259 <Method boolean AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  27   55:ifeq            65
				s2 = "1";
	//   28   58:ldc1            #244 <String "1">
	//   29   60:astore          8
			else
	//*  30   62:goto            69
				s2 = "0";
	//   31   65:ldc1            #246 <String "0">
	//   32   67:astore          8
			((Map) (hashmap)).put("limit_ad_tracking", ((Object) (s2)));
	//   33   69:aload           9
	//   34   71:ldc2            #261 <String "limit_ad_tracking">
	//   35   74:aload           8
	//   36   76:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   37   81:pop             
		}
		if(info != null && info.getId() != null)
	//*  38   82:aload_1         
	//*  39   83:ifnull          114
	//*  40   86:aload_1         
	//*  41   87:invokevirtual   #265 <Method String AdvertisingIdClient$Info.getId()>
	//*  42   90:ifnull          114
			((Map) (hashmap)).put("ad_id_size", ((Object) (Integer.toString(info.getId().length()))));
	//   43   93:aload           9
	//   44   95:ldc2            #267 <String "ad_id_size">
	//   45   98:aload_1         
	//   46   99:invokevirtual   #265 <Method String AdvertisingIdClient$Info.getId()>
	//   47  102:invokevirtual   #273 <Method int String.length()>
	//   48  105:invokestatic    #279 <Method String Integer.toString(int)>
	//   49  108:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   50  113:pop             
		if(throwable != null)
	//*  51  114:aload           7
	//*  52  116:ifnull          138
			((Map) (hashmap)).put("error", ((Object) (((Object) (throwable)).getClass().getName())));
	//   53  119:aload           9
	//   54  121:ldc2            #281 <String "error">
	//   55  124:aload           7
	//   56  126:invokevirtual   #285 <Method Class Object.getClass()>
	//   57  129:invokevirtual   #290 <Method String Class.getName()>
	//   58  132:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   59  137:pop             
		if(s != null && !s.isEmpty())
	//*  60  138:aload           6
	//*  61  140:ifnull          164
	//*  62  143:aload           6
	//*  63  145:invokevirtual   #293 <Method boolean String.isEmpty()>
	//*  64  148:ifne            164
			((Map) (hashmap)).put("experiment_id", ((Object) (s)));
	//   65  151:aload           9
	//   66  153:ldc2            #295 <String "experiment_id">
	//   67  156:aload           6
	//   68  158:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   69  163:pop             
		((Map) (hashmap)).put("tag", "AdvertisingIdClient");
	//   70  164:aload           9
	//   71  166:ldc2            #297 <String "tag">
	//   72  169:ldc2            #299 <String "AdvertisingIdClient">
	//   73  172:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   74  177:pop             
		((Map) (hashmap)).put("time_spent", ((Object) (Long.toString(l))));
	//   75  178:aload           9
	//   76  180:ldc2            #301 <String "time_spent">
	//   77  183:lload           4
	//   78  185:invokestatic    #306 <Method String Long.toString(long)>
	//   79  188:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//   80  193:pop             
		(new b(this, ((Map) (hashmap)))).start();
	//   81  194:new             #308 <Class b>
	//   82  197:dup             
	//   83  198:aload_0         
	//   84  199:aload           9
	//   85  201:invokespecial   #311 <Method void b(AdvertisingIdClient, Map)>
	//   86  204:invokevirtual   #314 <Method void b.start()>
		return true;
	//   87  207:iconst_1        
	//   88  208:ireturn         
	}

	private final boolean zzb()
	{
		am.c("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #220 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #223 <Method void am.c(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
			break MISSING_BLOCK_LABEL_95;
	//    4    7:aload_0         
	//    5    8:getfield        #53  <Field boolean zzg>
	//    6   11:ifne            95
		synchronized(zzh)
	//*   7   14:aload_0         
	//*   8   15:getfield        #37  <Field Object zzh>
	//*   9   18:astore_2        
	//*  10   19:aload_2         
	//*  11   20:monitorenter    
		{
			if(zzi == null || !zzi.b)
				break MISSING_BLOCK_LABEL_79;
	//   12   21:aload_0         
	//   13   22:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   14   25:ifnull          79
	//   15   28:aload_0         
	//   16   29:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   17   32:getfield        #320 <Field boolean a.b>
	//   18   35:ifeq            79
		}
	//   19   38:aload_2         
	//   20   39:monitorexit     
		zza(false);
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokespecial   #96  <Method void zza(boolean)>
		if(zzg)
	//*  24   45:aload_0         
	//*  25   46:getfield        #53  <Field boolean zzg>
	//*  26   49:ifeq            55
			break MISSING_BLOCK_LABEL_95;
	//   27   52:goto            95
		throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   28   55:new             #142 <Class IOException>
	//   29   58:dup             
	//   30   59:ldc2            #322 <String "AdvertisingIdClient cannot reconnect.">
	//   31   62:invokespecial   #147 <Method void IOException(String)>
	//   32   65:athrow          
		obj;
	//   33   66:astore_2        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj)));
	//   34   67:new             #142 <Class IOException>
	//   35   70:dup             
	//   36   71:ldc2            #322 <String "AdvertisingIdClient cannot reconnect.">
	//   37   74:aload_2         
	//   38   75:invokespecial   #325 <Method void IOException(String, Throwable)>
	//   39   78:athrow          
		throw new IOException("AdvertisingIdClient is not connected.");
	//   40   79:new             #142 <Class IOException>
	//   41   82:dup             
	//   42   83:ldc2            #327 <String "AdvertisingIdClient is not connected.">
	//   43   86:invokespecial   #147 <Method void IOException(String)>
	//   44   89:athrow          
		exception;
	//   45   90:astore_3        
		obj;
	//   46   91:aload_2         
		JVM INSTR monitorexit ;
	//   47   92:monitorexit     
		throw exception;
	//   48   93:aload_3         
	//   49   94:athrow          
		am.a(((Object) (zze)));
	//   50   95:aload_0         
	//   51   96:getfield        #227 <Field a zze>
	//   52   99:invokestatic    #43  <Method Object am.a(Object)>
	//   53  102:pop             
		am.a(((Object) (zzf)));
	//   54  103:aload_0         
	//   55  104:getfield        #231 <Field com.google.android.gms.internal.a.e zzf>
	//   56  107:invokestatic    #43  <Method Object am.a(Object)>
	//   57  110:pop             
		boolean flag = zzf.b();
	//   58  111:aload_0         
	//   59  112:getfield        #231 <Field com.google.android.gms.internal.a.e zzf>
	//   60  115:invokeinterface #331 <Method boolean com.google.android.gms.internal.a.e.b()>
	//   61  120:istore_1        
		this;
	//   62  121:aload_0         
		JVM INSTR monitorexit ;
	//   63  122:monitorexit     
		zza();
	//   64  123:aload_0         
	//   65  124:invokespecial   #233 <Method void zza()>
		return flag;
	//   66  127:iload_1         
	//   67  128:ireturn         
		Object obj1;
		obj1;
	//   68  129:astore_2        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
	//   69  130:ldc2            #299 <String "AdvertisingIdClient">
	//   70  133:ldc2            #333 <String "GMS remote exception ">
	//   71  136:aload_2         
	//   72  137:invokestatic    #339 <Method int Log.i(String, String, Throwable)>
	//   73  140:pop             
		throw new IOException("Remote exception");
	//   74  141:new             #142 <Class IOException>
	//   75  144:dup             
	//   76  145:ldc2            #341 <String "Remote exception">
	//   77  148:invokespecial   #147 <Method void IOException(String)>
	//   78  151:athrow          
		obj1;
	//   79  152:astore_2        
		this;
	//   80  153:aload_0         
		JVM INSTR monitorexit ;
	//   81  154:monitorexit     
		throw obj1;
	//   82  155:aload_2         
	//   83  156:athrow          
	}

	protected void finalize()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method void finish()>
		super.finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #344 <Method void Object.finalize()>
	//    4    8:return          
	}

	public final void finish()
	{
		am.c("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #220 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #223 <Method void am.c(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		a a1;
		if(mContext == null)
			break MISSING_BLOCK_LABEL_80;
	//    4    7:aload_0         
	//    5    8:getfield        #51  <Field Context mContext>
	//    6   11:ifnull          80
		a1 = zze;
	//    7   14:aload_0         
	//    8   15:getfield        #227 <Field a zze>
	//    9   18:astore_1        
		if(a1 == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       26
			break MISSING_BLOCK_LABEL_80;
	//   12   23:goto            80
		if(zzg)
	//*  13   26:aload_0         
	//*  14   27:getfield        #53  <Field boolean zzg>
	//*  15   30:ifeq            62
			com.google.android.gms.common.stats.a.a().a(mContext, ((android.content.ServiceConnection) (zze)));
	//   16   33:invokestatic    #166 <Method com.google.android.gms.common.stats.a com.google.android.gms.common.stats.a.a()>
	//   17   36:aload_0         
	//   18   37:getfield        #51  <Field Context mContext>
	//   19   40:aload_0         
	//   20   41:getfield        #227 <Field a zze>
	//   21   44:invokevirtual   #347 <Method void com.google.android.gms.common.stats.a.a(Context, android.content.ServiceConnection)>
		break MISSING_BLOCK_LABEL_62;
	//   22   47:goto            62
		Object obj;
		obj;
	//   23   50:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   24   51:ldc2            #299 <String "AdvertisingIdClient">
	//   25   54:ldc2            #349 <String "AdvertisingIdClient unbindService failed.">
	//   26   57:aload_1         
	//   27   58:invokestatic    #339 <Method int Log.i(String, String, Throwable)>
	//   28   61:pop             
		zzg = false;
	//   29   62:aload_0         
	//   30   63:iconst_0        
	//   31   64:putfield        #53  <Field boolean zzg>
		zzf = null;
	//   32   67:aload_0         
	//   33   68:aconst_null     
	//   34   69:putfield        #231 <Field com.google.android.gms.internal.a.e zzf>
		zze = null;
	//   35   72:aload_0         
	//   36   73:aconst_null     
	//   37   74:putfield        #227 <Field a zze>
		this;
	//   38   77:aload_0         
		JVM INSTR monitorexit ;
	//   39   78:monitorexit     
		return;
	//   40   79:return          
		this;
	//   41   80:aload_0         
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		obj;
	//   44   83:astore_1        
		this;
	//   45   84:aload_0         
		JVM INSTR monitorexit ;
	//   46   85:monitorexit     
		throw obj;
	//   47   86:aload_1         
	//   48   87:athrow          
	}

	public Info getInfo()
	{
		am.c("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #220 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #223 <Method void am.c(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
			break MISSING_BLOCK_LABEL_95;
	//    4    7:aload_0         
	//    5    8:getfield        #53  <Field boolean zzg>
	//    6   11:ifne            95
		synchronized(zzh)
	//*   7   14:aload_0         
	//*   8   15:getfield        #37  <Field Object zzh>
	//*   9   18:astore_1        
	//*  10   19:aload_1         
	//*  11   20:monitorenter    
		{
			if(zzi == null || !zzi.b)
				break MISSING_BLOCK_LABEL_79;
	//   12   21:aload_0         
	//   13   22:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   14   25:ifnull          79
	//   15   28:aload_0         
	//   16   29:getfield        #202 <Field com.google.android.gms.ads.identifier.a zzi>
	//   17   32:getfield        #320 <Field boolean a.b>
	//   18   35:ifeq            79
		}
	//   19   38:aload_1         
	//   20   39:monitorexit     
		zza(false);
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokespecial   #96  <Method void zza(boolean)>
		if(zzg)
	//*  24   45:aload_0         
	//*  25   46:getfield        #53  <Field boolean zzg>
	//*  26   49:ifeq            55
			break MISSING_BLOCK_LABEL_95;
	//   27   52:goto            95
		throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   28   55:new             #142 <Class IOException>
	//   29   58:dup             
	//   30   59:ldc2            #322 <String "AdvertisingIdClient cannot reconnect.">
	//   31   62:invokespecial   #147 <Method void IOException(String)>
	//   32   65:athrow          
		obj;
	//   33   66:astore_1        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj)));
	//   34   67:new             #142 <Class IOException>
	//   35   70:dup             
	//   36   71:ldc2            #322 <String "AdvertisingIdClient cannot reconnect.">
	//   37   74:aload_1         
	//   38   75:invokespecial   #325 <Method void IOException(String, Throwable)>
	//   39   78:athrow          
		throw new IOException("AdvertisingIdClient is not connected.");
	//   40   79:new             #142 <Class IOException>
	//   41   82:dup             
	//   42   83:ldc2            #327 <String "AdvertisingIdClient is not connected.">
	//   43   86:invokespecial   #147 <Method void IOException(String)>
	//   44   89:athrow          
		exception;
	//   45   90:astore_2        
		obj;
	//   46   91:aload_1         
		JVM INSTR monitorexit ;
	//   47   92:monitorexit     
		throw exception;
	//   48   93:aload_2         
	//   49   94:athrow          
		am.a(((Object) (zze)));
	//   50   95:aload_0         
	//   51   96:getfield        #227 <Field a zze>
	//   52   99:invokestatic    #43  <Method Object am.a(Object)>
	//   53  102:pop             
		am.a(((Object) (zzf)));
	//   54  103:aload_0         
	//   55  104:getfield        #231 <Field com.google.android.gms.internal.a.e zzf>
	//   56  107:invokestatic    #43  <Method Object am.a(Object)>
	//   57  110:pop             
		Info info = new Info(zzf.a(), zzf.a(true));
	//   58  111:new             #256 <Class AdvertisingIdClient$Info>
	//   59  114:dup             
	//   60  115:aload_0         
	//   61  116:getfield        #231 <Field com.google.android.gms.internal.a.e zzf>
	//   62  119:invokeinterface #351 <Method String com.google.android.gms.internal.a.e.a()>
	//   63  124:aload_0         
	//   64  125:getfield        #231 <Field com.google.android.gms.internal.a.e zzf>
	//   65  128:iconst_1        
	//   66  129:invokeinterface #354 <Method boolean com.google.android.gms.internal.a.e.a(boolean)>
	//   67  134:invokespecial   #357 <Method void AdvertisingIdClient$Info(String, boolean)>
	//   68  137:astore_1        
		this;
	//   69  138:aload_0         
		JVM INSTR monitorexit ;
	//   70  139:monitorexit     
		zza();
	//   71  140:aload_0         
	//   72  141:invokespecial   #233 <Method void zza()>
		return info;
	//   73  144:aload_1         
	//   74  145:areturn         
		Object obj1;
		obj1;
	//   75  146:astore_1        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
	//   76  147:ldc2            #299 <String "AdvertisingIdClient">
	//   77  150:ldc2            #333 <String "GMS remote exception ">
	//   78  153:aload_1         
	//   79  154:invokestatic    #339 <Method int Log.i(String, String, Throwable)>
	//   80  157:pop             
		throw new IOException("Remote exception");
	//   81  158:new             #142 <Class IOException>
	//   82  161:dup             
	//   83  162:ldc2            #341 <String "Remote exception">
	//   84  165:invokespecial   #147 <Method void IOException(String)>
	//   85  168:athrow          
		obj1;
	//   86  169:astore_1        
		this;
	//   87  170:aload_0         
		JVM INSTR monitorexit ;
	//   88  171:monitorexit     
		throw obj1;
	//   89  172:aload_1         
	//   90  173:athrow          
	}

	public void start()
	{
		zza(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #96  <Method void zza(boolean)>
	//    3    5:return          
	}

	private final Context mContext;
	private a zze;
	private com.google.android.gms.internal.a.e zzf;
	private boolean zzg;
	private final Object zzh;
	private com.google.android.gms.ads.identifier.a zzi;
	private final boolean zzj;
	private final long zzk;

	private class Info
	{

		public final String getId()
		{
			return zzq;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field String zzq>
		//    2    4:areturn         
		}

		public final boolean isLimitAdTrackingEnabled()
		{
			return zzr;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field boolean zzr>
		//    2    4:ireturn         
		}

		public final String toString()
		{
			String s = zzq;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field String zzq>
		//    2    4:astore_2        
			boolean flag = zzr;
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field boolean zzr>
		//    5    9:istore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 7);
		//    6   10:new             #25  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:invokestatic    #31  <Method String String.valueOf(Object)>
		//   10   18:invokevirtual   #35  <Method int String.length()>
		//   11   21:bipush          7
		//   12   23:iadd            
		//   13   24:invokespecial   #38  <Method void StringBuilder(int)>
		//   14   27:astore_3        
			stringbuilder.append("{");
		//   15   28:aload_3         
		//   16   29:ldc1            #40  <String "{">
		//   17   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   18   34:pop             
			stringbuilder.append(s);
		//   19   35:aload_3         
		//   20   36:aload_2         
		//   21   37:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   22   40:pop             
			stringbuilder.append("}");
		//   23   41:aload_3         
		//   24   42:ldc1            #46  <String "}">
		//   25   44:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   26   47:pop             
			stringbuilder.append(flag);
		//   27   48:aload_3         
		//   28   49:iload_1         
		//   29   50:invokevirtual   #49  <Method StringBuilder StringBuilder.append(boolean)>
		//   30   53:pop             
			return stringbuilder.toString();
		//   31   54:aload_3         
		//   32   55:invokevirtual   #51  <Method String StringBuilder.toString()>
		//   33   58:areturn         
		}

		private final String zzq;
		private final boolean zzr;

		public Info(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			zzq = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field String zzq>
			zzr = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #17  <Field boolean zzr>
		//    8   14:return          
		}
	}

}
