// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			de, boq, bjn, bmq, 
//			bwq, za, b, ee

public final class bko extends Thread
{

	public bko(BlockingQueue blockingqueue, bjn bjn1, za za1, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Thread()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean e>
		a = blockingqueue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field BlockingQueue a>
		b = bjn1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #25  <Field bjn b>
		c = za1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #27  <Field za c>
		d = b1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #29  <Field b d>
	//   17   30:return          
	}

	private final void b()
	{
		boq boq1 = (boq)a.take();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BlockingQueue a>
	//    2    4:invokeinterface #40  <Method Object BlockingQueue.take()>
	//    3    9:checkcast       #42  <Class boq>
	//    4   12:astore_3        
		long l = SystemClock.elapsedRealtime();
	//    5   13:invokestatic    #48  <Method long SystemClock.elapsedRealtime()>
	//    6   16:lstore_1        
		Object obj;
		try
		{
			boq1.b("network-queue-take");
	//    7   17:aload_3         
	//    8   18:ldc1            #50  <String "network-queue-take">
	//    9   20:invokevirtual   #53  <Method void boq.b(String)>
			boq1.h();
	//   10   23:aload_3         
	//   11   24:invokevirtual   #57  <Method boolean boq.h()>
	//   12   27:pop             
			TrafficStats.setThreadStatsTag(boq1.d());
	//   13   28:aload_3         
	//   14   29:invokevirtual   #60  <Method int boq.d()>
	//   15   32:invokestatic    #66  <Method void TrafficStats.setThreadStatsTag(int)>
			obj = ((Object) (b.a(boq1)));
	//   16   35:aload_0         
	//   17   36:getfield        #25  <Field bjn b>
	//   18   39:aload_3         
	//   19   40:invokeinterface #71  <Method bmq bjn.a(boq)>
	//   20   45:astore          4
			boq1.b("network-http-complete");
	//   21   47:aload_3         
	//   22   48:ldc1            #73  <String "network-http-complete">
	//   23   50:invokevirtual   #53  <Method void boq.b(String)>
			if(((bmq) (obj)).e && boq1.m())
	//*  24   53:aload           4
	//*  25   55:getfield        #76  <Field boolean bmq.e>
	//*  26   58:ifeq            79
	//*  27   61:aload_3         
	//*  28   62:invokevirtual   #79  <Method boolean boq.m()>
	//*  29   65:ifeq            79
			{
				boq1.c("not-modified");
	//   30   68:aload_3         
	//   31   69:ldc1            #81  <String "not-modified">
	//   32   71:invokevirtual   #83  <Method void boq.c(String)>
				boq1.n();
	//   33   74:aload_3         
	//   34   75:invokevirtual   #86  <Method void boq.n()>
				return;
	//   35   78:return          
			}
		}
	//*  36   79:aload_3         
	//*  37   80:aload           4
	//*  38   82:invokevirtual   #89  <Method bwq boq.a(bmq)>
	//*  39   85:astore          4
	//*  40   87:aload_3         
	//*  41   88:ldc1            #91  <String "network-parse-complete">
	//*  42   90:invokevirtual   #53  <Method void boq.b(String)>
	//*  43   93:aload_3         
	//*  44   94:invokevirtual   #94  <Method boolean boq.i()>
	//*  45   97:ifeq            132
	//*  46  100:aload           4
	//*  47  102:getfield        #99  <Field azi bwq.b>
	//*  48  105:ifnull          132
	//*  49  108:aload_0         
	//*  50  109:getfield        #27  <Field za c>
	//*  51  112:aload_3         
	//*  52  113:invokevirtual   #103 <Method String boq.f()>
	//*  53  116:aload           4
	//*  54  118:getfield        #99  <Field azi bwq.b>
	//*  55  121:invokeinterface #108 <Method void za.a(String, azi)>
	//*  56  126:aload_3         
	//*  57  127:ldc1            #110 <String "network-cache-written">
	//*  58  129:invokevirtual   #53  <Method void boq.b(String)>
	//*  59  132:aload_3         
	//*  60  133:invokevirtual   #113 <Method void boq.l()>
	//*  61  136:aload_0         
	//*  62  137:getfield        #29  <Field b d>
	//*  63  140:aload_3         
	//*  64  141:aload           4
	//*  65  143:invokeinterface #118 <Method void b.a(boq, bwq)>
	//*  66  148:aload_3         
	//*  67  149:aload           4
	//*  68  151:invokevirtual   #121 <Method void boq.a(bwq)>
	//*  69  154:return          
	//*  70  155:astore          4
	//*  71  157:aload           4
	//*  72  159:ldc1            #123 <String "Unhandled exception %s">
	//*  73  161:iconst_1        
	//*  74  162:anewarray       Object[]
	//*  75  165:dup             
	//*  76  166:iconst_0        
	//*  77  167:aload           4
	//*  78  169:invokevirtual   #128 <Method String Exception.toString()>
	//*  79  172:aastore         
	//*  80  173:invokestatic    #133 <Method void ee.a(Throwable, String, Object[])>
	//*  81  176:new             #32  <Class de>
	//*  82  179:dup             
	//*  83  180:aload           4
	//*  84  182:invokespecial   #136 <Method void de(Throwable)>
	//*  85  185:astore          4
	//*  86  187:aload           4
	//*  87  189:invokestatic    #48  <Method long SystemClock.elapsedRealtime()>
	//*  88  192:lload_1         
	//*  89  193:lsub            
	//*  90  194:invokevirtual   #139 <Method void de.a(long)>
	//*  91  197:aload_0         
	//*  92  198:getfield        #29  <Field b d>
	//*  93  201:aload_3         
	//*  94  202:aload           4
	//*  95  204:invokeinterface #142 <Method void b.a(boq, de)>
	//*  96  209:aload_3         
	//*  97  210:invokevirtual   #86  <Method void boq.n()>
	//*  98  213:return          
		catch(de de2)
	//*  99  214:astore          4
		{
			de2.a(SystemClock.elapsedRealtime() - l);
	//  100  216:aload           4
	//  101  218:invokestatic    #48  <Method long SystemClock.elapsedRealtime()>
	//  102  221:lload_1         
	//  103  222:lsub            
	//  104  223:invokevirtual   #139 <Method void de.a(long)>
			d.a(boq1, de2);
	//  105  226:aload_0         
	//  106  227:getfield        #29  <Field b d>
	//  107  230:aload_3         
	//  108  231:aload           4
	//  109  233:invokeinterface #142 <Method void b.a(boq, de)>
			boq1.n();
	//  110  238:aload_3         
	//  111  239:invokevirtual   #86  <Method void boq.n()>
			return;
	//  112  242:return          
		}
		catch(Exception exception)
		{
			ee.a(((Throwable) (exception)), "Unhandled exception %s", new Object[] {
				exception.toString()
			});
			de de1 = new de(((Throwable) (exception)));
			de1.a(SystemClock.elapsedRealtime() - l);
			d.a(boq1, de1);
			boq1.n();
			return;
		}
		obj = ((Object) (boq1.a(((bmq) (obj)))));
		boq1.b("network-parse-complete");
		if(boq1.i() && ((bwq) (obj)).b != null)
		{
			c.a(boq1.f(), ((bwq) (obj)).b);
			boq1.b("network-cache-written");
		}
		boq1.l();
		d.a(boq1, ((bwq) (obj)));
		boq1.a(((bwq) (obj)));
		return;
	}

	public final void a()
	{
		e = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #21  <Field boolean e>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #145 <Method void interrupt()>
	//    5    9:return          
	}

	public final void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #153 <Method void Process.setThreadPriority(int)>
		do
		{
			try
			{
				do
					b();
	//    2    5:aload_0         
	//    3    6:invokespecial   #155 <Method void b()>
				while(true);
	//    4    9:goto            5
			}
	//*   5   12:aload_0         
	//*   6   13:getfield        #21  <Field boolean e>
	//*   7   16:ifeq            26
	//*   8   19:invokestatic    #159 <Method Thread Thread.currentThread()>
	//*   9   22:invokevirtual   #160 <Method void Thread.interrupt()>
	//*  10   25:return          
	//*  11   26:ldc1            #162 <String "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it">
	//*  12   28:iconst_0        
	//*  13   29:anewarray       Object[]
	//*  14   32:invokestatic    #165 <Method void ee.c(String, Object[])>
	//*  15   35:goto            5
			catch(InterruptedException interruptedexception) { }
	//   16   38:astore_1        
			if(e)
			{
				Thread.currentThread().interrupt();
				return;
			}
			ee.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
		} while(true);
	//   17   39:goto            12
	}

	private final BlockingQueue a;
	private final bjn b;
	private final za c;
	private final b d;
	private volatile boolean e;
}
