// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.b;
import com.google.firebase.b.d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.firebase.iid:
//			q, ak, z, b, 
//			as, ad, t, ao, 
//			ba, ay, aa, ap, 
//			aq, a, ab, ar

public class FirebaseInstanceId
{
	private final class a
	{

		private final Boolean b()
		{
			Object obj;
			obj = ((Object) (FirebaseInstanceId.a(a).a()));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field FirebaseInstanceId a>
		//    2    4:invokestatic    #59  <Method b FirebaseInstanceId.a(FirebaseInstanceId)>
		//    3    7:invokevirtual   #64  <Method Context b.a()>
		//    4   10:astore_2        
			SharedPreferences sharedpreferences = ((Context) (obj)).getSharedPreferences("com.google.firebase.messaging", 0);
		//    5   11:aload_2         
		//    6   12:ldc1            #66  <String "com.google.firebase.messaging">
		//    7   14:iconst_0        
		//    8   15:invokevirtual   #72  <Method SharedPreferences Context.getSharedPreferences(String, int)>
		//    9   18:astore_3        
			if(sharedpreferences.contains("auto_init"))
		//*  10   19:aload_3         
		//*  11   20:ldc1            #74  <String "auto_init">
		//*  12   22:invokeinterface #80  <Method boolean SharedPreferences.contains(String)>
		//*  13   27:ifeq            43
				return Boolean.valueOf(sharedpreferences.getBoolean("auto_init", false));
		//   14   30:aload_3         
		//   15   31:ldc1            #74  <String "auto_init">
		//   16   33:iconst_0        
		//   17   34:invokeinterface #84  <Method boolean SharedPreferences.getBoolean(String, boolean)>
		//   18   39:invokestatic    #90  <Method Boolean Boolean.valueOf(boolean)>
		//   19   42:areturn         
			PackageManager packagemanager = ((Context) (obj)).getPackageManager();
		//   20   43:aload_2         
		//   21   44:invokevirtual   #94  <Method PackageManager Context.getPackageManager()>
		//   22   47:astore_3        
			if(packagemanager == null)
				break MISSING_BLOCK_LABEL_102;
		//   23   48:aload_3         
		//   24   49:ifnull          102
			obj = ((Object) (packagemanager.getApplicationInfo(((Context) (obj)).getPackageName(), 128)));
		//   25   52:aload_3         
		//   26   53:aload_2         
		//   27   54:invokevirtual   #98  <Method String Context.getPackageName()>
		//   28   57:sipush          128
		//   29   60:invokevirtual   #104 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
		//   30   63:astore_2        
			if(obj == null)
				break MISSING_BLOCK_LABEL_102;
		//   31   64:aload_2         
		//   32   65:ifnull          102
			boolean flag;
			if(((ApplicationInfo) (obj)).metaData == null || !((ApplicationInfo) (obj)).metaData.containsKey("firebase_messaging_auto_init_enabled"))
				break MISSING_BLOCK_LABEL_102;
		//   33   68:aload_2         
		//   34   69:getfield        #110 <Field Bundle ApplicationInfo.metaData>
		//   35   72:ifnull          102
		//   36   75:aload_2         
		//   37   76:getfield        #110 <Field Bundle ApplicationInfo.metaData>
		//   38   79:ldc1            #112 <String "firebase_messaging_auto_init_enabled">
		//   39   81:invokevirtual   #117 <Method boolean Bundle.containsKey(String)>
		//   40   84:ifeq            102
			flag = ((ApplicationInfo) (obj)).metaData.getBoolean("firebase_messaging_auto_init_enabled");
		//   41   87:aload_2         
		//   42   88:getfield        #110 <Field Bundle ApplicationInfo.metaData>
		//   43   91:ldc1            #112 <String "firebase_messaging_auto_init_enabled">
		//   44   93:invokevirtual   #119 <Method boolean Bundle.getBoolean(String)>
		//   45   96:istore_1        
			return Boolean.valueOf(flag);
		//   46   97:iload_1         
		//   47   98:invokestatic    #90  <Method Boolean Boolean.valueOf(boolean)>
		//   48  101:areturn         
_L2:
			return null;
		//   49  102:aconst_null     
		//   50  103:areturn         
			android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
			namenotfoundexception;
		//   51  104:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  52  105:goto            102
		}

		private final boolean c()
		{
			ClassNotFoundException classnotfoundexception;
			Object obj;
			Intent intent;
			try
			{
				Class.forName("com.google.firebase.messaging.a");
		//    0    0:ldc1            #123 <String "com.google.firebase.messaging.a">
		//    1    2:invokestatic    #129 <Method Class Class.forName(String)>
		//    2    5:pop             
			}
		//*   3    6:iconst_1        
		//*   4    7:ireturn         
		//*   5    8:aload_0         
		//*   6    9:getfield        #24  <Field FirebaseInstanceId a>
		//*   7   12:invokestatic    #59  <Method b FirebaseInstanceId.a(FirebaseInstanceId)>
		//*   8   15:invokevirtual   #64  <Method Context b.a()>
		//*   9   18:astore_1        
		//*  10   19:new             #131 <Class Intent>
		//*  11   22:dup             
		//*  12   23:ldc1            #133 <String "com.google.firebase.MESSAGING_EVENT">
		//*  13   25:invokespecial   #136 <Method void Intent(String)>
		//*  14   28:astore_2        
		//*  15   29:aload_2         
		//*  16   30:aload_1         
		//*  17   31:invokevirtual   #98  <Method String Context.getPackageName()>
		//*  18   34:invokevirtual   #140 <Method Intent Intent.setPackage(String)>
		//*  19   37:pop             
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #94  <Method PackageManager Context.getPackageManager()>
		//*  22   42:aload_2         
		//*  23   43:iconst_0        
		//*  24   44:invokevirtual   #144 <Method ResolveInfo PackageManager.resolveService(Intent, int)>
		//*  25   47:astore_1        
		//*  26   48:aload_1         
		//*  27   49:ifnull          61
		//*  28   52:aload_1         
		//*  29   53:getfield        #150 <Field android.content.pm.ServiceInfo ResolveInfo.serviceInfo>
		//*  30   56:ifnull          61
		//*  31   59:iconst_1        
		//*  32   60:ireturn         
		//*  33   61:iconst_0        
		//*  34   62:ireturn         
			// Misplaced declaration of an exception variable
			catch(ClassNotFoundException classnotfoundexception)
			{
				obj = ((Object) (FirebaseInstanceId.a(a).a()));
				intent = new Intent("com.google.firebase.MESSAGING_EVENT");
				intent.setPackage(((Context) (obj)).getPackageName());
				obj = ((Object) (((Context) (obj)).getPackageManager().resolveService(intent, 0)));
				return obj != null && ((ResolveInfo) (obj)).serviceInfo != null;
			}
			return true;
		//*  35   63:astore_1        
		//*  36   64:goto            8
		}

		final boolean a()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			boolean flag;
			if(e == null)
				break MISSING_BLOCK_LABEL_21;
		//    2    2:aload_0         
		//    3    3:getfield        #39  <Field Boolean e>
		//    4    6:ifnull          21
			flag = e.booleanValue();
		//    5    9:aload_0         
		//    6   10:getfield        #39  <Field Boolean e>
		//    7   13:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
		//    8   16:istore_1        
			this;
		//    9   17:aload_0         
			JVM INSTR monitorexit ;
		//   10   18:monitorexit     
			return flag;
		//   11   19:iload_1         
		//   12   20:ireturn         
			if(!b) goto _L2; else goto _L1
		//   13   21:aload_0         
		//   14   22:getfield        #34  <Field boolean b>
		//   15   25:ifeq            49
_L1:
			flag = FirebaseInstanceId.a(a).e();
		//   16   28:aload_0         
		//   17   29:getfield        #24  <Field FirebaseInstanceId a>
		//   18   32:invokestatic    #59  <Method b FirebaseInstanceId.a(FirebaseInstanceId)>
		//   19   35:invokevirtual   #155 <Method boolean b.e()>
		//   20   38:istore_1        
			if(!flag) goto _L2; else goto _L3
		//   21   39:iload_1         
		//   22   40:ifeq            49
_L3:
			flag = true;
		//   23   43:iconst_1        
		//   24   44:istore_1        
_L5:
			this;
		//   25   45:aload_0         
			JVM INSTR monitorexit ;
		//   26   46:monitorexit     
			return flag;
		//   27   47:iload_1         
		//   28   48:ireturn         
_L2:
			flag = false;
		//   29   49:iconst_0        
		//   30   50:istore_1        
			if(true) goto _L5; else goto _L4
		//   31   51:goto            45
_L4:
			Exception exception;
			exception;
		//   32   54:astore_2        
		//*  33   55:aload_0         
			throw exception;
		//   34   56:monitorexit     
		//   35   57:aload_2         
		//   36   58:athrow          
		}

		final FirebaseInstanceId a;
		private final boolean b = c();
		private final d c;
		private com.google.firebase.b.b d;
		private Boolean e;

		a(d d1)
		{
			a = FirebaseInstanceId.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field FirebaseInstanceId a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			c = d1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field d c>
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:invokespecial   #32  <Method boolean c()>
		//   11   19:putfield        #34  <Field boolean b>
			e = b();
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:invokespecial   #37  <Method Boolean b()>
		//   15   27:putfield        #39  <Field Boolean e>
			if(e == null && b)
		//*  16   30:aload_0         
		//*  17   31:getfield        #39  <Field Boolean e>
		//*  18   34:ifnonnull       68
		//*  19   37:aload_0         
		//*  20   38:getfield        #34  <Field boolean b>
		//*  21   41:ifeq            68
			{
				d = ((com.google.firebase.b.b) (new ar(this)));
		//   22   44:aload_0         
		//   23   45:new             #41  <Class ar>
		//   24   48:dup             
		//   25   49:aload_0         
		//   26   50:invokespecial   #44  <Method void ar(FirebaseInstanceId$a)>
		//   27   53:putfield        #46  <Field com.google.firebase.b.b d>
				d1.a(com/google/firebase/a, d);
		//   28   56:aload_2         
		//   29   57:ldc1            #48  <Class com.google.firebase.a>
		//   30   59:aload_0         
		//   31   60:getfield        #46  <Field com.google.firebase.b.b d>
		//   32   63:invokeinterface #53  <Method void d.a(Class, com.google.firebase.b.b)>
			}
		//   33   68:return          
		}
	}


	FirebaseInstanceId(b b1, d d1)
	{
		this(b1, new q(b1.a()), com.google.firebase.iid.ak.b(), com.google.firebase.iid.ak.b(), d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #54  <Class q>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #59  <Method Context b.a()>
	//    6   10:invokespecial   #62  <Method void q(Context)>
	//    7   13:invokestatic    #67  <Method Executor com.google.firebase.iid.ak.b()>
	//    8   16:invokestatic    #67  <Method Executor com.google.firebase.iid.ak.b()>
	//    9   19:aload_2         
	//   10   20:invokespecial   #70  <Method void FirebaseInstanceId(b, q, Executor, Executor, d)>
	//   11   23:return          
	}

	private FirebaseInstanceId(b b1, q q1, Executor executor, Executor executor1, d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
		j = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #74  <Field boolean j>
		if(q.a(b1) == null)
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #77  <Method String q.a(b)>
	//*   7   13:ifnonnull       26
			throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
	//    8   16:new             #79  <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #81  <String "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID">
	//   11   22:invokespecial   #84  <Method void IllegalStateException(String)>
	//   12   25:athrow          
		com/google/firebase/iid/FirebaseInstanceId;
	//   13   26:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorenter ;
	//   14   28:monitorenter    
		if(b == null)
	//*  15   29:getstatic       #86  <Field z b>
	//*  16   32:ifnonnull       49
			b = new z(b1.a());
	//   17   35:new             #88  <Class z>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokevirtual   #59  <Method Context b.a()>
	//   21   43:invokespecial   #89  <Method void z(Context)>
	//   22   46:putstatic       #86  <Field z b>
		com/google/firebase/iid/FirebaseInstanceId;
	//   23   49:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   24   51:monitorexit     
		e = b1;
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:putfield        #91  <Field b e>
		f = q1;
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:putfield        #93  <Field q f>
		if(g == null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #95  <Field com.google.firebase.iid.b g>
	//*  33   66:ifnonnull       117
		{
			com.google.firebase.iid.b b2 = (com.google.firebase.iid.b)b1.a(com/google/firebase/iid/b);
	//   34   69:aload_1         
	//   35   70:ldc1            #97  <Class com.google.firebase.iid.b>
	//   36   72:invokevirtual   #100 <Method Object b.a(Class)>
	//   37   75:checkcast       #97  <Class com.google.firebase.iid.b>
	//   38   78:astore          6
			if(b2 != null && b2.a())
	//*  39   80:aload           6
	//*  40   82:ifnull          101
	//*  41   85:aload           6
	//*  42   87:invokeinterface #103 <Method boolean b.a()>
	//*  43   92:ifeq            101
				b1 = ((b) (b2));
	//   44   95:aload           6
	//   45   97:astore_1        
			else
	//*  46   98:goto            112
				b1 = ((b) (new as(b1, q1, executor)));
	//   47  101:new             #105 <Class as>
	//   48  104:dup             
	//   49  105:aload_1         
	//   50  106:aload_2         
	//   51  107:aload_3         
	//   52  108:invokespecial   #108 <Method void as(b, q, Executor)>
	//   53  111:astore_1        
			g = ((com.google.firebase.iid.b) (b1));
	//   54  112:aload_0         
	//   55  113:aload_1         
	//   56  114:putfield        #95  <Field com.google.firebase.iid.b g>
		}
		g = g;
	//   57  117:aload_0         
	//   58  118:aload_0         
	//   59  119:getfield        #95  <Field com.google.firebase.iid.b g>
	//   60  122:putfield        #95  <Field com.google.firebase.iid.b g>
		d = executor1;
	//   61  125:aload_0         
	//   62  126:aload           4
	//   63  128:putfield        #110 <Field Executor d>
		i = new ad(b);
	//   64  131:aload_0         
	//   65  132:new             #112 <Class ad>
	//   66  135:dup             
	//   67  136:getstatic       #86  <Field z b>
	//   68  139:invokespecial   #115 <Method void ad(z)>
	//   69  142:putfield        #117 <Field ad i>
		k = new a(d1);
	//   70  145:aload_0         
	//   71  146:new             #6   <Class FirebaseInstanceId$a>
	//   72  149:dup             
	//   73  150:aload_0         
	//   74  151:aload           5
	//   75  153:invokespecial   #120 <Method void FirebaseInstanceId$a(FirebaseInstanceId, d)>
	//   76  156:putfield        #122 <Field FirebaseInstanceId$a k>
		h = new t(executor);
	//   77  159:aload_0         
	//   78  160:new             #124 <Class t>
	//   79  163:dup             
	//   80  164:aload_3         
	//   81  165:invokespecial   #127 <Method void t(Executor)>
	//   82  168:putfield        #129 <Field t h>
		if(k.a())
	//*  83  171:aload_0         
	//*  84  172:getfield        #122 <Field FirebaseInstanceId$a k>
	//*  85  175:invokevirtual   #130 <Method boolean FirebaseInstanceId$a.a()>
	//*  86  178:ifeq            185
			l();
	//   87  181:aload_0         
	//   88  182:invokespecial   #133 <Method void l()>
		return;
	//   89  185:return          
		b1;
	//   90  186:astore_1        
		com/google/firebase/iid/FirebaseInstanceId;
	//   91  187:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   92  189:monitorexit     
		throw b1;
	//   93  190:aload_1         
	//   94  191:athrow          
	}

	static b a(FirebaseInstanceId firebaseinstanceid)
	{
		return firebaseinstanceid.e;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field b e>
	//    2    4:areturn         
	}

	public static FirebaseInstanceId a()
	{
		return getInstance(com.google.firebase.b.d());
	//    0    0:invokestatic    #138 <Method b b.d()>
	//    1    3:invokestatic    #142 <Method FirebaseInstanceId getInstance(b)>
	//    2    6:areturn         
	}

	private final Object a(Task task)
	{
		try
		{
			task = ((Task) (Tasks.await(task, 30000L, TimeUnit.MILLISECONDS)));
	//    0    0:aload_1         
	//    1    1:ldc2w           #150 <Long 30000L>
	//    2    4:getstatic       #154 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokestatic    #160 <Method Object Tasks.await(Task, long, TimeUnit)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
	//*   7   13:new             #162 <Class IOException>
	//*   8   16:dup             
	//*   9   17:ldc1            #164 <String "SERVICE_NOT_AVAILABLE">
	//*  10   19:invokespecial   #165 <Method void IOException(String)>
	//*  11   22:athrow          
		// Misplaced declaration of an exception variable
		catch(Task task)
	//*  12   23:astore_1        
		{
			Throwable throwable = ((ExecutionException) (task)).getCause();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #169 <Method Throwable ExecutionException.getCause()>
	//   15   28:astore_2        
			if(throwable instanceof IOException)
	//*  16   29:aload_2         
	//*  17   30:instanceof      #162 <Class IOException>
	//*  18   33:ifeq            57
			{
				if("INSTANCE_ID_RESET".equals(((Object) (throwable.getMessage()))))
	//*  19   36:ldc1            #171 <String "INSTANCE_ID_RESET">
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #177 <Method String Throwable.getMessage()>
	//*  22   42:invokevirtual   #183 <Method boolean String.equals(Object)>
	//*  23   45:ifeq            52
					h();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #185 <Method void h()>
				throw (IOException)throwable;
	//   26   52:aload_2         
	//   27   53:checkcast       #162 <Class IOException>
	//   28   56:athrow          
			}
			if(throwable instanceof RuntimeException)
	//*  29   57:aload_2         
	//*  30   58:instanceof      #187 <Class RuntimeException>
	//*  31   61:ifeq            69
				throw (RuntimeException)throwable;
	//   32   64:aload_2         
	//   33   65:checkcast       #187 <Class RuntimeException>
	//   34   68:athrow          
			else
				throw new IOException(((Throwable) (task)));
	//   35   69:new             #162 <Class IOException>
	//   36   72:dup             
	//   37   73:aload_1         
	//   38   74:invokespecial   #190 <Method void IOException(Throwable)>
	//   39   77:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Task task)
		{
			throw new IOException("SERVICE_NOT_AVAILABLE");
		}
		return ((Object) (task));
	//*  40   78:astore_1        
	//*  41   79:goto            13
	}

	static void a(Runnable runnable, long l1)
	{
		com/google/firebase/iid/FirebaseInstanceId;
	//    0    0:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(c == null)
	//*   2    3:getstatic       #195 <Field ScheduledThreadPoolExecutor c>
	//*   3    6:ifnonnull       29
			c = new ScheduledThreadPoolExecutor(1, ((java.util.concurrent.ThreadFactory) (new NamedThreadFactory("FirebaseInstanceId"))));
	//    4    9:new             #197 <Class ScheduledThreadPoolExecutor>
	//    5   12:dup             
	//    6   13:iconst_1        
	//    7   14:new             #199 <Class NamedThreadFactory>
	//    8   17:dup             
	//    9   18:ldc1            #201 <String "FirebaseInstanceId">
	//   10   20:invokespecial   #202 <Method void NamedThreadFactory(String)>
	//   11   23:invokespecial   #205 <Method void ScheduledThreadPoolExecutor(int, java.util.concurrent.ThreadFactory)>
	//   12   26:putstatic       #195 <Field ScheduledThreadPoolExecutor c>
		c.schedule(runnable, l1, TimeUnit.SECONDS);
	//   13   29:getstatic       #195 <Field ScheduledThreadPoolExecutor c>
	//   14   32:aload_0         
	//   15   33:lload_1         
	//   16   34:getstatic       #208 <Field TimeUnit TimeUnit.SECONDS>
	//   17   37:invokevirtual   #212 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   18   40:pop             
		com/google/firebase/iid/FirebaseInstanceId;
	//   19   41:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   20   43:monitorexit     
		return;
	//   21   44:return          
		runnable;
	//   22   45:astore_0        
		com/google/firebase/iid/FirebaseInstanceId;
	//   23   46:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   24   48:monitorexit     
		throw runnable;
	//   25   49:aload_0         
	//   26   50:athrow          
	}

	private final Task b(String s, String s1)
	{
		s1 = c(s1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #216 <Method String c(String)>
	//    2    4:astore_2        
		return Tasks.forResult(((Object) (null))).continueWithTask(d, ((com.google.android.gms.tasks.Continuation) (new ao(this, s, s1))));
	//    3    5:aconst_null     
	//    4    6:invokestatic    #220 <Method Task Tasks.forResult(Object)>
	//    5    9:aload_0         
	//    6   10:getfield        #110 <Field Executor d>
	//    7   13:new             #222 <Class ao>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #225 <Method void ao(FirebaseInstanceId, String, String)>
	//   13   23:invokevirtual   #231 <Method Task Task.continueWithTask(Executor, com.google.android.gms.tasks.Continuation)>
	//   14   26:areturn         
	}

	static void b(FirebaseInstanceId firebaseinstanceid)
	{
		firebaseinstanceid.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void l()>
	//    2    4:return          
	}

	private static aa c(String s, String s1)
	{
		return b.a("", s, s1);
	//    0    0:getstatic       #86  <Field z b>
	//    1    3:ldc1            #236 <String "">
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:invokevirtual   #239 <Method aa z.a(String, String, String)>
	//    5   10:areturn         
	}

	private static String c(String s)
	{
		if(!s.isEmpty() && !s.equalsIgnoreCase("fcm") && !s.equalsIgnoreCase("gcm"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #243 <Method boolean String.isEmpty()>
	//*   2    4:ifne            30
	//*   3    7:aload_0         
	//*   4    8:ldc1            #245 <String "fcm">
	//*   5   10:invokevirtual   #249 <Method boolean String.equalsIgnoreCase(String)>
	//*   6   13:ifne            30
	//*   7   16:aload_0         
	//*   8   17:ldc1            #251 <String "gcm">
	//*   9   19:invokevirtual   #249 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   22:ifeq            28
	//*  11   25:goto            30
			return s;
	//   12   28:aload_0         
	//   13   29:areturn         
		else
			return "*";
	//   14   30:ldc1            #253 <String "*">
	//   15   32:areturn         
	}

	static boolean g()
	{
		return Log.isLoggable("FirebaseInstanceId", 3) || android.os.Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
	//    0    0:ldc1            #201 <String "FirebaseInstanceId">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #259 <Method boolean Log.isLoggable(String, int)>
	//    3    6:ifne            31
	//    4    9:getstatic       #265 <Field int android.os.Build$VERSION.SDK_INT>
	//    5   12:bipush          23
	//    6   14:icmpne          29
	//    7   17:ldc1            #201 <String "FirebaseInstanceId">
	//    8   19:iconst_3        
	//    9   20:invokestatic    #259 <Method boolean Log.isLoggable(String, int)>
	//   10   23:ifeq            29
	//   11   26:goto            31
	//   12   29:iconst_0        
	//   13   30:ireturn         
	//   14   31:iconst_1        
	//   15   32:ireturn         
	}

	public static FirebaseInstanceId getInstance(b b1)
	{
		return (FirebaseInstanceId)b1.a(com/google/firebase/iid/FirebaseInstanceId);
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class FirebaseInstanceId>
	//    2    3:invokevirtual   #100 <Method Object b.a(Class)>
	//    3    6:checkcast       #2   <Class FirebaseInstanceId>
	//    4    9:areturn         
	}

	private final void l()
	{
		aa aa1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method aa e()>
	//    2    4:astore_1        
		if(k() || a(aa1) || i.a())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #271 <Method boolean k()>
	//*   5    9:ifne            30
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #274 <Method boolean a(aa)>
	//*   9   17:ifne            30
	//*  10   20:aload_0         
	//*  11   21:getfield        #117 <Field ad i>
	//*  12   24:invokevirtual   #275 <Method boolean ad.a()>
	//*  13   27:ifeq            34
			m();
	//   14   30:aload_0         
	//   15   31:invokespecial   #278 <Method void m()>
	//   16   34:return          
	}

	private final void m()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!j)
	//*   2    2:aload_0         
	//*   3    3:getfield        #74  <Field boolean j>
	//*   4    6:ifne            14
			a(0L);
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:invokevirtual   #281 <Method void a(long)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	private static String n()
	{
		return q.a(b.b("").a());
	//    0    0:getstatic       #86  <Field z b>
	//    1    3:ldc1            #236 <String "">
	//    2    5:invokevirtual   #285 <Method ba com.google.firebase.iid.z.b(String)>
	//    3    8:invokevirtual   #290 <Method java.security.KeyPair ba.a()>
	//    4   11:invokestatic    #293 <Method String q.a(java.security.KeyPair)>
	//    5   14:areturn         
	}

	final Task a(String s, String s1, Task task)
	{
		task = ((Task) (n()));
	//    0    0:invokestatic    #296 <Method String n()>
	//    1    3:astore_3        
		Object obj = ((Object) (c(s, s1)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #298 <Method aa c(String, String)>
	//    5    9:astore          4
		if(!g.b() && !a(((aa) (obj))))
	//*   6   11:aload_0         
	//*   7   12:getfield        #95  <Field com.google.firebase.iid.b g>
	//*   8   15:invokeinterface #300 <Method boolean com.google.firebase.iid.b.b()>
	//*   9   20:ifne            49
	//*  10   23:aload_0         
	//*  11   24:aload           4
	//*  12   26:invokevirtual   #274 <Method boolean a(aa)>
	//*  13   29:ifne            49
		{
			return Tasks.forResult(((Object) (new ay(((String) (task)), ((aa) (obj)).a))));
	//   14   32:new             #302 <Class ay>
	//   15   35:dup             
	//   16   36:aload_3         
	//   17   37:aload           4
	//   18   39:getfield        #307 <Field String aa.a>
	//   19   42:invokespecial   #310 <Method void ay(String, String)>
	//   20   45:invokestatic    #220 <Method Task Tasks.forResult(Object)>
	//   21   48:areturn         
		} else
		{
			obj = ((Object) (aa.a(((aa) (obj)))));
	//   22   49:aload           4
	//   23   51:invokestatic    #313 <Method String aa.a(aa)>
	//   24   54:astore          4
			return h.a(s, s1, ((v) (new ap(this, ((String) (task)), ((String) (obj)), s, s1))));
	//   25   56:aload_0         
	//   26   57:getfield        #129 <Field t h>
	//   27   60:aload_1         
	//   28   61:aload_2         
	//   29   62:new             #315 <Class ap>
	//   30   65:dup             
	//   31   66:aload_0         
	//   32   67:aload_3         
	//   33   68:aload           4
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokespecial   #318 <Method void ap(FirebaseInstanceId, String, String, String, String)>
	//   37   75:invokevirtual   #321 <Method Task t.a(String, String, v)>
	//   38   78:areturn         
		}
	}

	final Task a(String s, String s1, String s2, String s3)
	{
		return g.a(s, s1, s2, s3).onSuccessTask(d, ((com.google.android.gms.tasks.SuccessContinuation) (new aq(this, s2, s3, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field com.google.firebase.iid.b g>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #324 <Method Task b.a(String, String, String, String)>
	//    7   14:aload_0         
	//    8   15:getfield        #110 <Field Executor d>
	//    9   18:new             #326 <Class aq>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:aload_1         
	//   15   27:invokespecial   #329 <Method void aq(FirebaseInstanceId, String, String, String)>
	//   16   30:invokevirtual   #333 <Method Task Task.onSuccessTask(Executor, com.google.android.gms.tasks.SuccessContinuation)>
	//   17   33:areturn         
	}

	public String a(String s, String s1)
	{
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   0    0:invokestatic    #340 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #343 <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpne       20
			throw new IOException("MAIN_THREAD");
	//    3    9:new             #162 <Class IOException>
	//    4   12:dup             
	//    5   13:ldc2            #345 <String "MAIN_THREAD">
	//    6   16:invokespecial   #165 <Method void IOException(String)>
	//    7   19:athrow          
		else
			return ((com.google.firebase.iid.a)a(b(s, s1))).a();
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokespecial   #347 <Method Task b(String, String)>
	//   13   27:invokespecial   #349 <Method Object a(Task)>
	//   14   30:checkcast       #351 <Class a>
	//   15   33:invokeinterface #353 <Method String a.a()>
	//   16   38:areturn         
	}

	final void a(long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l2 = Math.min(Math.max(30L, l1 << 1), a);
	//    2    2:ldc2w           #354 <Long 30L>
	//    3    5:lload_1         
	//    4    6:iconst_1        
	//    5    7:lshl            
	//    6    8:invokestatic    #361 <Method long Math.max(long, long)>
	//    7   11:getstatic       #49  <Field long a>
	//    8   14:invokestatic    #364 <Method long Math.min(long, long)>
	//    9   17:lstore_3        
		a(((Runnable) (new ab(this, f, i, l2))), l1);
	//   10   18:new             #366 <Class ab>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field q f>
	//   15   27:aload_0         
	//   16   28:getfield        #117 <Field ad i>
	//   17   31:lload_3         
	//   18   32:invokespecial   #369 <Method void ab(FirebaseInstanceId, q, ad, long)>
	//   19   35:lload_1         
	//   20   36:invokestatic    #371 <Method void a(Runnable, long)>
		j = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #74  <Field boolean j>
		this;
	//   24   44:aload_0         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		return;
	//   26   46:return          
		Exception exception;
		exception;
	//   27   47:astore          5
	//*  28   49:aload_0         
		throw exception;
	//   29   50:monitorexit     
	//   30   51:aload           5
	//   31   53:athrow          
	}

	final void a(String s)
	{
		Object obj = ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method aa e()>
	//    2    4:astore_3        
		if(a(((aa) (obj))))
	//*   3    5:aload_0         
	//*   4    6:aload_3         
	//*   5    7:invokevirtual   #274 <Method boolean a(aa)>
	//*   6   10:ifeq            24
		{
			throw new IOException("token not available");
	//    7   13:new             #162 <Class IOException>
	//    8   16:dup             
	//    9   17:ldc2            #373 <String "token not available">
	//   10   20:invokespecial   #165 <Method void IOException(String)>
	//   11   23:athrow          
		} else
		{
			String s1 = n();
	//   12   24:invokestatic    #296 <Method String n()>
	//   13   27:astore_2        
			obj = ((Object) (((aa) (obj)).a));
	//   14   28:aload_3         
	//   15   29:getfield        #307 <Field String aa.a>
	//   16   32:astore_3        
			a(g.a(s1, ((String) (obj)), s));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #95  <Field com.google.firebase.iid.b g>
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:aload_1         
	//   23   41:invokeinterface #376 <Method Task b.a(String, String, String)>
	//   24   46:invokespecial   #349 <Method Object a(Task)>
	//   25   49:pop             
			return;
	//   26   50:return          
		}
	}

	final void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		j = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #74  <Field boolean j>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_2        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_2         
	//   12   14:athrow          
	}

	final boolean a(aa aa1)
	{
		return aa1 == null || aa1.b(f.b());
	//    0    0:aload_1         
	//    1    1:ifnull          23
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field q f>
	//    5    9:invokevirtual   #379 <Method String com.google.firebase.iid.q.b()>
	//    6   12:invokevirtual   #381 <Method boolean com.google.firebase.iid.aa.b(String)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	final Task b(String s, String s1, String s2, String s3)
	{
		b.a("", s, s1, s3, f.b());
	//    0    0:getstatic       #86  <Field z b>
	//    1    3:ldc1            #236 <String "">
	//    2    5:aload_1         
	//    3    6:aload_2         
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field q f>
	//    7   13:invokevirtual   #379 <Method String com.google.firebase.iid.q.b()>
	//    8   16:invokevirtual   #384 <Method void z.a(String, String, String, String, String)>
		return Tasks.forResult(((Object) (new ay(s2, s3))));
	//    9   19:new             #302 <Class ay>
	//   10   22:dup             
	//   11   23:aload_3         
	//   12   24:aload           4
	//   13   26:invokespecial   #310 <Method void ay(String, String)>
	//   14   29:invokestatic    #220 <Method Task Tasks.forResult(Object)>
	//   15   32:areturn         
	}

	final b b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field b e>
	//    2    4:areturn         
	}

	final void b(String s)
	{
		aa aa1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method aa e()>
	//    2    4:astore_2        
		if(a(aa1))
	//*   3    5:aload_0         
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #274 <Method boolean a(aa)>
	//*   6   10:ifeq            24
		{
			throw new IOException("token not available");
	//    7   13:new             #162 <Class IOException>
	//    8   16:dup             
	//    9   17:ldc2            #373 <String "token not available">
	//   10   20:invokespecial   #165 <Method void IOException(String)>
	//   11   23:athrow          
		} else
		{
			String s1 = n();
	//   12   24:invokestatic    #296 <Method String n()>
	//   13   27:astore_3        
			a(g.b(s1, aa1.a, s));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #95  <Field com.google.firebase.iid.b g>
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:getfield        #307 <Field String aa.a>
	//   20   38:aload_1         
	//   21   39:invokeinterface #386 <Method Task com.google.firebase.iid.b.b(String, String, String)>
	//   22   44:invokespecial   #349 <Method Object a(Task)>
	//   23   47:pop             
			return;
	//   24   48:return          
		}
	}

	public void c()
	{
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   0    0:invokestatic    #340 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #343 <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpne       20
		{
			throw new IOException("MAIN_THREAD");
	//    3    9:new             #162 <Class IOException>
	//    4   12:dup             
	//    5   13:ldc2            #345 <String "MAIN_THREAD">
	//    6   16:invokespecial   #165 <Method void IOException(String)>
	//    7   19:athrow          
		} else
		{
			String s = n();
	//    8   20:invokestatic    #296 <Method String n()>
	//    9   23:astore_1        
			a(g.a(s));
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #95  <Field com.google.firebase.iid.b g>
	//   13   29:aload_1         
	//   14   30:invokeinterface #389 <Method Task b.a(String)>
	//   15   35:invokespecial   #349 <Method Object a(Task)>
	//   16   38:pop             
			h();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #185 <Method void h()>
			return;
	//   19   43:return          
		}
	}

	public String d()
	{
		aa aa1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method aa e()>
	//    2    4:astore_1        
		if(g.b() || a(aa1))
	//*   3    5:aload_0         
	//*   4    6:getfield        #95  <Field com.google.firebase.iid.b g>
	//*   5    9:invokeinterface #300 <Method boolean com.google.firebase.iid.b.b()>
	//*   6   14:ifne            25
	//*   7   17:aload_0         
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #274 <Method boolean a(aa)>
	//*  10   22:ifeq            29
			m();
	//   11   25:aload_0         
	//   12   26:invokespecial   #278 <Method void m()>
		return aa.a(aa1);
	//   13   29:aload_1         
	//   14   30:invokestatic    #313 <Method String aa.a(aa)>
	//   15   33:areturn         
	}

	final aa e()
	{
		return c(q.a(e), "*");
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field b e>
	//    2    4:invokestatic    #77  <Method String q.a(b)>
	//    3    7:ldc1            #253 <String "*">
	//    4    9:invokestatic    #298 <Method aa c(String, String)>
	//    5   12:areturn         
	}

	final String f()
	{
		return a(q.a(e), "*");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field b e>
	//    3    5:invokestatic    #77  <Method String q.a(b)>
	//    4    8:ldc1            #253 <String "*">
	//    5   10:invokevirtual   #393 <Method String a(String, String)>
	//    6   13:areturn         
	}

	final void h()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b.b();
	//    2    2:getstatic       #86  <Field z b>
	//    3    5:invokevirtual   #395 <Method void com.google.firebase.iid.z.b()>
		if(k.a())
	//*   4    8:aload_0         
	//*   5    9:getfield        #122 <Field FirebaseInstanceId$a k>
	//*   6   12:invokevirtual   #130 <Method boolean FirebaseInstanceId$a.a()>
	//*   7   15:ifeq            22
			m();
	//    8   18:aload_0         
	//    9   19:invokespecial   #278 <Method void m()>
		this;
	//   10   22:aload_0         
		JVM INSTR monitorexit ;
	//   11   23:monitorexit     
		return;
	//   12   24:return          
		Exception exception;
		exception;
	//   13   25:astore_1        
	//*  14   26:aload_0         
		throw exception;
	//   15   27:monitorexit     
	//   16   28:aload_1         
	//   17   29:athrow          
	}

	final boolean i()
	{
		return g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field com.google.firebase.iid.b g>
	//    2    4:invokeinterface #103 <Method boolean b.a()>
	//    3    9:ireturn         
	}

	final void j()
	{
		b.c("");
	//    0    0:getstatic       #86  <Field z b>
	//    1    3:ldc1            #236 <String "">
	//    2    5:invokevirtual   #397 <Method void z.c(String)>
		m();
	//    3    8:aload_0         
	//    4    9:invokespecial   #278 <Method void m()>
	//    5   12:return          
	}

	final boolean k()
	{
		return g.b();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field com.google.firebase.iid.b g>
	//    2    4:invokeinterface #300 <Method boolean com.google.firebase.iid.b.b()>
	//    3    9:ireturn         
	}

	private static final long a;
	private static z b;
	private static ScheduledThreadPoolExecutor c;
	private final Executor d;
	private final b e;
	private final q f;
	private com.google.firebase.iid.b g;
	private final t h;
	private final ad i;
	private boolean j;
	private final a k;

	static 
	{
		a = TimeUnit.HOURS.toSeconds(8L);
	//    0    0:getstatic       #41  <Field TimeUnit TimeUnit.HOURS>
	//    1    3:ldc2w           #42  <Long 8L>
	//    2    6:invokevirtual   #47  <Method long TimeUnit.toSeconds(long)>
	//    3    9:putstatic       #49  <Field long a>
	//*   4   12:return          
	}
}
