// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.util.a.b;
import com.google.android.gms.d.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import java.io.IOException;
import java.util.concurrent.*;

// Referenced classes of package com.google.firebase.iid:
//			r, am, aa, c, 
//			av, af, a, u, 
//			ar, ab, bd, b, 
//			ac, bb, as, at

public class FirebaseInstanceId
{

	FirebaseInstanceId(FirebaseApp firebaseapp, d d1)
	{
		this(firebaseapp, new r(firebaseapp.a()), com.google.firebase.iid.am.b(), com.google.firebase.iid.am.b(), d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #51  <Class r>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #56  <Method android.content.Context FirebaseApp.a()>
	//    6   10:invokespecial   #59  <Method void r(android.content.Context)>
	//    7   13:invokestatic    #64  <Method Executor com.google.firebase.iid.am.b()>
	//    8   16:invokestatic    #64  <Method Executor com.google.firebase.iid.am.b()>
	//    9   19:aload_2         
	//   10   20:invokespecial   #67  <Method void FirebaseInstanceId(FirebaseApp, r, Executor, Executor, d)>
	//   11   23:return          
	}

	private FirebaseInstanceId(FirebaseApp firebaseapp, r r1, Executor executor, Executor executor1, d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		j = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #71  <Field boolean j>
		if(r.a(firebaseapp) == null)
			break MISSING_BLOCK_LABEL_183;
	//    5    9:aload_1         
	//    6   10:invokestatic    #74  <Method String r.a(FirebaseApp)>
	//    7   13:ifnull          183
		com/google/firebase/iid/FirebaseInstanceId;
	//    8   16:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorenter ;
	//    9   18:monitorenter    
		if(b == null)
	//*  10   19:getstatic       #76  <Field aa b>
	//*  11   22:ifnonnull       39
			b = new aa(firebaseapp.a());
	//   12   25:new             #78  <Class aa>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokevirtual   #56  <Method android.content.Context FirebaseApp.a()>
	//   16   33:invokespecial   #79  <Method void aa(android.content.Context)>
	//   17   36:putstatic       #76  <Field aa b>
		com/google/firebase/iid/FirebaseInstanceId;
	//   18   39:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   19   41:monitorexit     
		e = firebaseapp;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #81  <Field FirebaseApp e>
		f = r1;
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:putfield        #83  <Field r f>
		if(g == null)
	//*  26   52:aload_0         
	//*  27   53:getfield        #85  <Field c g>
	//*  28   56:ifnonnull       108
		{
			c c1 = (c)firebaseapp.a(com/google/firebase/iid/c);
	//   29   59:aload_1         
	//   30   60:ldc1            #87  <Class c>
	//   31   62:invokevirtual   #90  <Method Object FirebaseApp.a(Class)>
	//   32   65:checkcast       #87  <Class c>
	//   33   68:astore          6
			if(c1 != null && c1.b())
	//*  34   70:aload           6
	//*  35   72:ifnull          94
	//*  36   75:aload           6
	//*  37   77:invokeinterface #93  <Method boolean com.google.firebase.iid.c.b()>
	//*  38   82:ifeq            94
				g = c1;
	//   39   85:aload_0         
	//   40   86:aload           6
	//   41   88:putfield        #85  <Field c g>
			else
	//*  42   91:goto            108
				g = ((c) (new av(firebaseapp, r1, executor)));
	//   43   94:aload_0         
	//   44   95:new             #95  <Class av>
	//   45   98:dup             
	//   46   99:aload_1         
	//   47  100:aload_2         
	//   48  101:aload_3         
	//   49  102:invokespecial   #98  <Method void av(FirebaseApp, r, Executor)>
	//   50  105:putfield        #85  <Field c g>
		}
		g = g;
	//   51  108:aload_0         
	//   52  109:aload_0         
	//   53  110:getfield        #85  <Field c g>
	//   54  113:putfield        #85  <Field c g>
		d = executor1;
	//   55  116:aload_0         
	//   56  117:aload           4
	//   57  119:putfield        #100 <Field Executor d>
		i = new af(b);
	//   58  122:aload_0         
	//   59  123:new             #102 <Class af>
	//   60  126:dup             
	//   61  127:getstatic       #76  <Field aa b>
	//   62  130:invokespecial   #105 <Method void af(aa)>
	//   63  133:putfield        #107 <Field af i>
		k = new a(this, d1);
	//   64  136:aload_0         
	//   65  137:new             #109 <Class a>
	//   66  140:dup             
	//   67  141:aload_0         
	//   68  142:aload           5
	//   69  144:invokespecial   #112 <Method void a(FirebaseInstanceId, d)>
	//   70  147:putfield        #114 <Field a k>
		h = new u(executor);
	//   71  150:aload_0         
	//   72  151:new             #116 <Class u>
	//   73  154:dup             
	//   74  155:aload_3         
	//   75  156:invokespecial   #119 <Method void u(Executor)>
	//   76  159:putfield        #121 <Field u h>
		if(k.a())
	//*  77  162:aload_0         
	//*  78  163:getfield        #114 <Field a k>
	//*  79  166:invokevirtual   #123 <Method boolean a.a()>
	//*  80  169:ifeq            176
			m();
	//   81  172:aload_0         
	//   82  173:invokespecial   #126 <Method void m()>
		return;
	//   83  176:return          
		firebaseapp;
	//   84  177:astore_1        
		com/google/firebase/iid/FirebaseInstanceId;
	//   85  178:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//   86  180:monitorexit     
		throw firebaseapp;
	//   87  181:aload_1         
	//   88  182:athrow          
		throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
	//   89  183:new             #128 <Class IllegalStateException>
	//   90  186:dup             
	//   91  187:ldc1            #130 <String "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID">
	//   92  189:invokespecial   #133 <Method void IllegalStateException(String)>
	//   93  192:athrow          
	}

	static FirebaseApp a(FirebaseInstanceId firebaseinstanceid)
	{
		return firebaseinstanceid.e;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field FirebaseApp e>
	//    2    4:areturn         
	}

	public static FirebaseInstanceId a()
	{
		return getInstance(FirebaseApp.getInstance());
	//    0    0:invokestatic    #139 <Method FirebaseApp FirebaseApp.getInstance()>
	//    1    3:invokestatic    #142 <Method FirebaseInstanceId getInstance(FirebaseApp)>
	//    2    6:areturn         
	}

	private final Object a(g g1)
	{
		try
		{
			g1 = ((g) (com.google.android.gms.d.k.a(g1, 30000L, TimeUnit.MILLISECONDS)));
	//    0    0:aload_1         
	//    1    1:ldc2w           #150 <Long 30000L>
	//    2    4:getstatic       #154 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokestatic    #159 <Method Object k.a(g, long, TimeUnit)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
	//*   7   13:new             #161 <Class IOException>
	//*   8   16:dup             
	//*   9   17:ldc1            #163 <String "SERVICE_NOT_AVAILABLE">
	//*  10   19:invokespecial   #164 <Method void IOException(String)>
	//*  11   22:athrow          
		// Misplaced declaration of an exception variable
		catch(g g1)
	//*  12   23:astore_1        
		{
			Throwable throwable = ((ExecutionException) (g1)).getCause();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #168 <Method Throwable ExecutionException.getCause()>
	//   15   28:astore_2        
			if(throwable instanceof IOException)
	//*  16   29:aload_2         
	//*  17   30:instanceof      #161 <Class IOException>
	//*  18   33:ifeq            57
			{
				if("INSTANCE_ID_RESET".equals(((Object) (throwable.getMessage()))))
	//*  19   36:ldc1            #170 <String "INSTANCE_ID_RESET">
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #176 <Method String Throwable.getMessage()>
	//*  22   42:invokevirtual   #182 <Method boolean String.equals(Object)>
	//*  23   45:ifeq            52
					h();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #184 <Method void h()>
				throw (IOException)throwable;
	//   26   52:aload_2         
	//   27   53:checkcast       #161 <Class IOException>
	//   28   56:athrow          
			}
			if(throwable instanceof RuntimeException)
	//*  29   57:aload_2         
	//*  30   58:instanceof      #186 <Class RuntimeException>
	//*  31   61:ifeq            69
				throw (RuntimeException)throwable;
	//   32   64:aload_2         
	//   33   65:checkcast       #186 <Class RuntimeException>
	//   34   68:athrow          
			else
				throw new IOException(((Throwable) (g1)));
	//   35   69:new             #161 <Class IOException>
	//   36   72:dup             
	//   37   73:aload_1         
	//   38   74:invokespecial   #189 <Method void IOException(Throwable)>
	//   39   77:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(g g1)
		{
			throw new IOException("SERVICE_NOT_AVAILABLE");
		}
		return ((Object) (g1));
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
	//*   2    3:getstatic       #192 <Field ScheduledThreadPoolExecutor c>
	//*   3    6:ifnonnull       29
			c = new ScheduledThreadPoolExecutor(1, ((java.util.concurrent.ThreadFactory) (new b("FirebaseInstanceId"))));
	//    4    9:new             #194 <Class ScheduledThreadPoolExecutor>
	//    5   12:dup             
	//    6   13:iconst_1        
	//    7   14:new             #196 <Class b>
	//    8   17:dup             
	//    9   18:ldc1            #198 <String "FirebaseInstanceId">
	//   10   20:invokespecial   #199 <Method void b(String)>
	//   11   23:invokespecial   #202 <Method void ScheduledThreadPoolExecutor(int, java.util.concurrent.ThreadFactory)>
	//   12   26:putstatic       #192 <Field ScheduledThreadPoolExecutor c>
		c.schedule(runnable, l1, TimeUnit.SECONDS);
	//   13   29:getstatic       #192 <Field ScheduledThreadPoolExecutor c>
	//   14   32:aload_0         
	//   15   33:lload_1         
	//   16   34:getstatic       #205 <Field TimeUnit TimeUnit.SECONDS>
	//   17   37:invokevirtual   #209 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
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

	private final g b(String s, String s1)
	{
		String s2 = c(s1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #213 <Method String c(String)>
	//    2    4:astore_3        
		h h1 = new h();
	//    3    5:new             #215 <Class h>
	//    4    8:dup             
	//    5    9:invokespecial   #216 <Method void h()>
	//    6   12:astore          4
		d.execute(((Runnable) (new ar(this, s, s1, h1, s2))));
	//    7   14:aload_0         
	//    8   15:getfield        #100 <Field Executor d>
	//    9   18:new             #218 <Class ar>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload           4
	//   15   27:aload_3         
	//   16   28:invokespecial   #221 <Method void ar(FirebaseInstanceId, String, String, h, String)>
	//   17   31:invokeinterface #227 <Method void Executor.execute(Runnable)>
		return h1.a();
	//   18   36:aload           4
	//   19   38:invokevirtual   #230 <Method g h.a()>
	//   20   41:areturn         
	}

	static void b(FirebaseInstanceId firebaseinstanceid)
	{
		firebaseinstanceid.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void m()>
	//    2    4:return          
	}

	private static ab c(String s, String s1)
	{
		return b.a("", s, s1);
	//    0    0:getstatic       #76  <Field aa b>
	//    1    3:ldc1            #234 <String "">
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:invokevirtual   #237 <Method ab aa.a(String, String, String)>
	//    5   10:areturn         
	}

	private static String c(String s)
	{
		if(!s.isEmpty() && !s.equalsIgnoreCase("fcm") && !s.equalsIgnoreCase("gcm"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #240 <Method boolean String.isEmpty()>
	//*   2    4:ifne            30
	//*   3    7:aload_0         
	//*   4    8:ldc1            #242 <String "fcm">
	//*   5   10:invokevirtual   #246 <Method boolean String.equalsIgnoreCase(String)>
	//*   6   13:ifne            30
	//*   7   16:aload_0         
	//*   8   17:ldc1            #248 <String "gcm">
	//*   9   19:invokevirtual   #246 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   22:ifeq            28
	//*  11   25:goto            30
			return s;
	//   12   28:aload_0         
	//   13   29:areturn         
		else
			return "*";
	//   14   30:ldc1            #250 <String "*">
	//   15   32:areturn         
	}

	static boolean g()
	{
		return Log.isLoggable("FirebaseInstanceId", 3) || android.os.Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
	//    0    0:ldc1            #198 <String "FirebaseInstanceId">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #256 <Method boolean Log.isLoggable(String, int)>
	//    3    6:ifne            31
	//    4    9:getstatic       #262 <Field int android.os.Build$VERSION.SDK_INT>
	//    5   12:bipush          23
	//    6   14:icmpne          29
	//    7   17:ldc1            #198 <String "FirebaseInstanceId">
	//    8   19:iconst_3        
	//    9   20:invokestatic    #256 <Method boolean Log.isLoggable(String, int)>
	//   10   23:ifeq            29
	//   11   26:goto            31
	//   12   29:iconst_0        
	//   13   30:ireturn         
	//   14   31:iconst_1        
	//   15   32:ireturn         
	}

	public static FirebaseInstanceId getInstance(FirebaseApp firebaseapp)
	{
		com/google/firebase/iid/FirebaseInstanceId;
	//    0    0:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		firebaseapp = ((FirebaseApp) ((FirebaseInstanceId)firebaseapp.a(com/google/firebase/iid/FirebaseInstanceId)));
	//    2    3:aload_0         
	//    3    4:ldc1            #2   <Class FirebaseInstanceId>
	//    4    6:invokevirtual   #90  <Method Object FirebaseApp.a(Class)>
	//    5    9:checkcast       #2   <Class FirebaseInstanceId>
	//    6   12:astore_0        
		com/google/firebase/iid/FirebaseInstanceId;
	//    7   13:ldc1            #2   <Class FirebaseInstanceId>
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return ((FirebaseInstanceId) (firebaseapp));
	//    9   16:aload_0         
	//   10   17:areturn         
		firebaseapp;
	//   11   18:astore_0        
	//*  12   19:ldc1            #2   <Class FirebaseInstanceId>
		throw firebaseapp;
	//   13   21:monitorexit     
	//   14   22:aload_0         
	//   15   23:athrow          
	}

	private final void m()
	{
		ab ab1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method ab e()>
	//    2    4:astore_1        
		if(!j() || ab1 == null || ab1.b(f.b()) || i.a())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #269 <Method boolean j()>
	//*   5    9:ifeq            40
	//*   6   12:aload_1         
	//*   7   13:ifnull          40
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #83  <Field r f>
	//*  11   21:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//*  12   24:invokevirtual   #275 <Method boolean com.google.firebase.iid.ab.b(String)>
	//*  13   27:ifne            40
	//*  14   30:aload_0         
	//*  15   31:getfield        #107 <Field af i>
	//*  16   34:invokevirtual   #276 <Method boolean af.a()>
	//*  17   37:ifeq            44
			n();
	//   18   40:aload_0         
	//   19   41:invokespecial   #279 <Method void n()>
	//   20   44:return          
	}

	private final void n()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!j)
	//*   2    2:aload_0         
	//*   3    3:getfield        #71  <Field boolean j>
	//*   4    6:ifne            14
			a(0L);
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:invokevirtual   #282 <Method void a(long)>
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

	private static String o()
	{
		return r.a(b.b("").a());
	//    0    0:getstatic       #76  <Field aa b>
	//    1    3:ldc1            #234 <String "">
	//    2    5:invokevirtual   #286 <Method bd com.google.firebase.iid.aa.b(String)>
	//    3    8:invokevirtual   #291 <Method java.security.KeyPair bd.a()>
	//    4   11:invokestatic    #294 <Method String r.a(java.security.KeyPair)>
	//    5   14:areturn         
	}

	final g a(String s, String s1, String s2, String s3)
	{
		return g.a(s, s1, s2, s3);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field c g>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #297 <Method g c.a(String, String, String, String)>
	//    7   14:areturn         
	}

	public String a(String s, String s1)
	{
		if(Looper.getMainLooper() != Looper.myLooper())
	//*   0    0:invokestatic    #304 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #307 <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpeq       28
			return ((com.google.firebase.iid.b)a(b(s, s1))).a();
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #309 <Method g b(String, String)>
	//    8   16:invokespecial   #311 <Method Object a(g)>
	//    9   19:checkcast       #313 <Class com.google.firebase.iid.b>
	//   10   22:invokeinterface #315 <Method String b.a()>
	//   11   27:areturn         
		else
			throw new IOException("MAIN_THREAD");
	//   12   28:new             #161 <Class IOException>
	//   13   31:dup             
	//   14   32:ldc2            #317 <String "MAIN_THREAD">
	//   15   35:invokespecial   #164 <Method void IOException(String)>
	//   16   38:athrow          
	}

	final void a(long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l2 = Math.min(Math.max(30L, l1 << 1), a);
	//    2    2:ldc2w           #318 <Long 30L>
	//    3    5:lload_1         
	//    4    6:iconst_1        
	//    5    7:lshl            
	//    6    8:invokestatic    #325 <Method long Math.max(long, long)>
	//    7   11:getstatic       #46  <Field long a>
	//    8   14:invokestatic    #328 <Method long Math.min(long, long)>
	//    9   17:lstore_3        
		a(((Runnable) (new ac(this, f, i, l2))), l1);
	//   10   18:new             #330 <Class ac>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #83  <Field r f>
	//   15   27:aload_0         
	//   16   28:getfield        #107 <Field af i>
	//   17   31:lload_3         
	//   18   32:invokespecial   #333 <Method void ac(FirebaseInstanceId, r, af, long)>
	//   19   35:lload_1         
	//   20   36:invokestatic    #335 <Method void a(Runnable, long)>
		j = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #71  <Field boolean j>
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
	//    1    1:invokevirtual   #267 <Method ab e()>
	//    2    4:astore_3        
		if(obj != null && !((ab) (obj)).b(f.b()))
	//*   3    5:aload_3         
	//*   4    6:ifnull          50
	//*   5    9:aload_3         
	//*   6   10:aload_0         
	//*   7   11:getfield        #83  <Field r f>
	//*   8   14:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//*   9   17:invokevirtual   #275 <Method boolean com.google.firebase.iid.ab.b(String)>
	//*  10   20:ifne            50
		{
			String s1 = o();
	//   11   23:invokestatic    #337 <Method String o()>
	//   12   26:astore_2        
			obj = ((Object) (((ab) (obj)).a));
	//   13   27:aload_3         
	//   14   28:getfield        #340 <Field String ab.a>
	//   15   31:astore_3        
			a(g.a(s1, ((String) (obj)), s));
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #85  <Field c g>
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokeinterface #343 <Method g c.a(String, String, String)>
	//   23   45:invokespecial   #311 <Method Object a(g)>
	//   24   48:pop             
			return;
	//   25   49:return          
		} else
		{
			throw new IOException("token not available");
	//   26   50:new             #161 <Class IOException>
	//   27   53:dup             
	//   28   54:ldc2            #345 <String "token not available">
	//   29   57:invokespecial   #164 <Method void IOException(String)>
	//   30   60:athrow          
		}
	}

	final void a(String s, String s1, h h1, String s2)
	{
		String s3 = o();
	//    0    0:invokestatic    #337 <Method String o()>
	//    1    3:astore          5
		s1 = ((String) (c(s, s1)));
	//    2    5:aload_1         
	//    3    6:aload_2         
	//    4    7:invokestatic    #348 <Method ab c(String, String)>
	//    5   10:astore_2        
		if(s1 != null && !((ab) (s1)).b(f.b()))
	//*   6   11:aload_2         
	//*   7   12:ifnull          47
	//*   8   15:aload_2         
	//*   9   16:aload_0         
	//*  10   17:getfield        #83  <Field r f>
	//*  11   20:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//*  12   23:invokevirtual   #275 <Method boolean com.google.firebase.iid.ab.b(String)>
	//*  13   26:ifne            47
		{
			h1.a(((Object) (new bb(s3, ((ab) (s1)).a))));
	//   14   29:aload_3         
	//   15   30:new             #350 <Class bb>
	//   16   33:dup             
	//   17   34:aload           5
	//   18   36:aload_2         
	//   19   37:getfield        #340 <Field String ab.a>
	//   20   40:invokespecial   #353 <Method void bb(String, String)>
	//   21   43:invokevirtual   #356 <Method void h.a(Object)>
			return;
	//   22   46:return          
		} else
		{
			s1 = ab.a(((ab) (s1)));
	//   23   47:aload_2         
	//   24   48:invokestatic    #359 <Method String ab.a(ab)>
	//   25   51:astore_2        
			h.a(s, s2, ((w) (new as(this, s3, s1, s, s2)))).a(d, ((com.google.android.gms.d.c) (new at(this, s, s2, h1, s3))));
	//   26   52:aload_0         
	//   27   53:getfield        #121 <Field u h>
	//   28   56:aload_1         
	//   29   57:aload           4
	//   30   59:new             #361 <Class as>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:aload           5
	//   34   66:aload_2         
	//   35   67:aload_1         
	//   36   68:aload           4
	//   37   70:invokespecial   #364 <Method void as(FirebaseInstanceId, String, String, String, String)>
	//   38   73:invokevirtual   #367 <Method g u.a(String, String, w)>
	//   39   76:aload_0         
	//   40   77:getfield        #100 <Field Executor d>
	//   41   80:new             #369 <Class at>
	//   42   83:dup             
	//   43   84:aload_0         
	//   44   85:aload_1         
	//   45   86:aload           4
	//   46   88:aload_3         
	//   47   89:aload           5
	//   48   91:invokespecial   #370 <Method void at(FirebaseInstanceId, String, String, h, String)>
	//   49   94:invokevirtual   #375 <Method g g.a(Executor, com.google.android.gms.d.c)>
	//   50   97:pop             
			return;
	//   51   98:return          
		}
	}

	final void a(String s, String s1, h h1, String s2, g g1)
	{
		if(g1.b())
	//*   0    0:aload           5
	//*   1    2:invokevirtual   #377 <Method boolean g.b()>
	//*   2    5:ifeq            53
		{
			g1 = ((g) ((String)g1.d()));
	//    3    8:aload           5
	//    4   10:invokevirtual   #380 <Method Object g.d()>
	//    5   13:checkcast       #178 <Class String>
	//    6   16:astore          5
			b.a("", s, s1, ((String) (g1)), f.b());
	//    7   18:getstatic       #76  <Field aa b>
	//    8   21:ldc1            #234 <String "">
	//    9   23:aload_1         
	//   10   24:aload_2         
	//   11   25:aload           5
	//   12   27:aload_0         
	//   13   28:getfield        #83  <Field r f>
	//   14   31:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//   15   34:invokevirtual   #383 <Method void aa.a(String, String, String, String, String)>
			h1.a(((Object) (new bb(s2, ((String) (g1))))));
	//   16   37:aload_3         
	//   17   38:new             #350 <Class bb>
	//   18   41:dup             
	//   19   42:aload           4
	//   20   44:aload           5
	//   21   46:invokespecial   #353 <Method void bb(String, String)>
	//   22   49:invokevirtual   #356 <Method void h.a(Object)>
			return;
	//   23   52:return          
		} else
		{
			h1.a(g1.e());
	//   24   53:aload_3         
	//   25   54:aload           5
	//   26   56:invokevirtual   #386 <Method Exception g.e()>
	//   27   59:invokevirtual   #389 <Method void h.a(Exception)>
			return;
	//   28   62:return          
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
	//    4    4:putfield        #71  <Field boolean j>
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

	final FirebaseApp b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field FirebaseApp e>
	//    2    4:areturn         
	}

	final void b(String s)
	{
		ab ab1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method ab e()>
	//    2    4:astore_2        
		if(ab1 != null && !ab1.b(f.b()))
	//*   3    5:aload_2         
	//*   4    6:ifnull          48
	//*   5    9:aload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #83  <Field r f>
	//*   8   14:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//*   9   17:invokevirtual   #275 <Method boolean com.google.firebase.iid.ab.b(String)>
	//*  10   20:ifne            48
		{
			String s1 = o();
	//   11   23:invokestatic    #337 <Method String o()>
	//   12   26:astore_3        
			a(g.b(s1, ab1.a, s));
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #85  <Field c g>
	//   16   32:aload_3         
	//   17   33:aload_2         
	//   18   34:getfield        #340 <Field String ab.a>
	//   19   37:aload_1         
	//   20   38:invokeinterface #392 <Method g com.google.firebase.iid.c.b(String, String, String)>
	//   21   43:invokespecial   #311 <Method Object a(g)>
	//   22   46:pop             
			return;
	//   23   47:return          
		} else
		{
			throw new IOException("token not available");
	//   24   48:new             #161 <Class IOException>
	//   25   51:dup             
	//   26   52:ldc2            #345 <String "token not available">
	//   27   55:invokespecial   #164 <Method void IOException(String)>
	//   28   58:athrow          
		}
	}

	public String c()
	{
		m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void m()>
		return o();
	//    2    4:invokestatic    #337 <Method String o()>
	//    3    7:areturn         
	}

	public String d()
	{
		ab ab1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method ab e()>
	//    2    4:astore_1        
		if(ab1 == null || ab1.b(f.b()))
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #83  <Field r f>
	//*   8   14:invokevirtual   #271 <Method String com.google.firebase.iid.r.b()>
	//*   9   17:invokevirtual   #275 <Method boolean com.google.firebase.iid.ab.b(String)>
	//*  10   20:ifeq            27
			n();
	//   11   23:aload_0         
	//   12   24:invokespecial   #279 <Method void n()>
		if(ab1 != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          36
			return ab1.a;
	//   15   31:aload_1         
	//   16   32:getfield        #340 <Field String ab.a>
	//   17   35:areturn         
		else
			return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
	}

	final ab e()
	{
		return c(r.a(e), "*");
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field FirebaseApp e>
	//    2    4:invokestatic    #74  <Method String r.a(FirebaseApp)>
	//    3    7:ldc1            #250 <String "*">
	//    4    9:invokestatic    #348 <Method ab c(String, String)>
	//    5   12:areturn         
	}

	final String f()
	{
		return a(r.a(e), "*");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #81  <Field FirebaseApp e>
	//    3    5:invokestatic    #74  <Method String r.a(FirebaseApp)>
	//    4    8:ldc1            #250 <String "*">
	//    5   10:invokevirtual   #396 <Method String a(String, String)>
	//    6   13:areturn         
	}

	final void h()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b.b();
	//    2    2:getstatic       #76  <Field aa b>
	//    3    5:invokevirtual   #398 <Method void com.google.firebase.iid.aa.b()>
		if(k.a())
	//*   4    8:aload_0         
	//*   5    9:getfield        #114 <Field a k>
	//*   6   12:invokevirtual   #123 <Method boolean a.a()>
	//*   7   15:ifeq            22
			n();
	//    8   18:aload_0         
	//    9   19:invokespecial   #279 <Method void n()>
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
		return g.b();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field c g>
	//    2    4:invokeinterface #93  <Method boolean com.google.firebase.iid.c.b()>
	//    3    9:ireturn         
	}

	final boolean j()
	{
		return g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field c g>
	//    2    4:invokeinterface #399 <Method boolean c.a()>
	//    3    9:ireturn         
	}

	final void k()
	{
		String s = o();
	//    0    0:invokestatic    #337 <Method String o()>
	//    1    3:astore_1        
		String s1 = ab.a(e());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #267 <Method ab e()>
	//    4    8:invokestatic    #359 <Method String ab.a(ab)>
	//    5   11:astore_2        
		a(g.a(s, s1));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #85  <Field c g>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokeinterface #401 <Method g c.a(String, String)>
	//   12   24:invokespecial   #311 <Method Object a(g)>
	//   13   27:pop             
	//   14   28:return          
	}

	final void l()
	{
		b.c("");
	//    0    0:getstatic       #76  <Field aa b>
	//    1    3:ldc1            #234 <String "">
	//    2    5:invokevirtual   #404 <Method void aa.c(String)>
		n();
	//    3    8:aload_0         
	//    4    9:invokespecial   #279 <Method void n()>
	//    5   12:return          
	}

	private static final long a;
	private static aa b;
	private static ScheduledThreadPoolExecutor c;
	private final Executor d;
	private final FirebaseApp e;
	private final r f;
	private c g;
	private final u h;
	private final af i;
	private boolean j;
	private final a k;

	static 
	{
		a = TimeUnit.HOURS.toSeconds(8L);
	//    0    0:getstatic       #38  <Field TimeUnit TimeUnit.HOURS>
	//    1    3:ldc2w           #39  <Long 8L>
	//    2    6:invokevirtual   #44  <Method long TimeUnit.toSeconds(long)>
	//    3    9:putstatic       #46  <Field long a>
	//*   4   12:return          
	}
}
