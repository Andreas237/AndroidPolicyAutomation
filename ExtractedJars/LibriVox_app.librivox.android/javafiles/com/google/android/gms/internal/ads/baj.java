// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ee, bcm, boq, za, 
//			azi, bmq, bwq, bbl, 
//			b

public final class baj extends Thread
{

	public baj(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, za za1, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Thread()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean f>
		b = blockingqueue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #32  <Field BlockingQueue b>
		c = blockingqueue1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #34  <Field BlockingQueue c>
		d = za1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #36  <Field za d>
		e = b1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #38  <Field b e>
	//   17   30:aload_0         
	//   18   31:new             #40  <Class bcm>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:invokespecial   #43  <Method void bcm(baj)>
	//   22   39:putfield        #45  <Field bcm g>
	//   23   42:return          
	}

	static BlockingQueue a(baj baj1)
	{
		return baj1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BlockingQueue c>
	//    2    4:areturn         
	}

	static b b(baj baj1)
	{
		return baj1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field b e>
	//    2    4:areturn         
	}

	private final void b()
	{
		boq boq1 = (boq)b.take();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field BlockingQueue b>
	//    2    4:invokeinterface #53  <Method Object BlockingQueue.take()>
	//    3    9:checkcast       #55  <Class boq>
	//    4   12:astore_2        
		boq1.b("cache-queue-take");
	//    5   13:aload_2         
	//    6   14:ldc1            #57  <String "cache-queue-take">
	//    7   16:invokevirtual   #60  <Method void boq.b(String)>
		boq1.h();
	//    8   19:aload_2         
	//    9   20:invokevirtual   #64  <Method boolean boq.h()>
	//   10   23:pop             
		azi azi1 = d.a(boq1.f());
	//   11   24:aload_0         
	//   12   25:getfield        #36  <Field za d>
	//   13   28:aload_2         
	//   14   29:invokevirtual   #67  <Method String boq.f()>
	//   15   32:invokeinterface #72  <Method azi za.a(String)>
	//   16   37:astore_3        
		if(azi1 == null)
	//*  17   38:aload_3         
	//*  18   39:ifnonnull       70
		{
			boq1.b("cache-miss");
	//   19   42:aload_2         
	//   20   43:ldc1            #74  <String "cache-miss">
	//   21   45:invokevirtual   #60  <Method void boq.b(String)>
			if(!bcm.a(g, boq1))
	//*  22   48:aload_0         
	//*  23   49:getfield        #45  <Field bcm g>
	//*  24   52:aload_2         
	//*  25   53:invokestatic    #77  <Method boolean bcm.a(bcm, boq)>
	//*  26   56:ifne            69
				c.put(((Object) (boq1)));
	//   27   59:aload_0         
	//   28   60:getfield        #34  <Field BlockingQueue c>
	//   29   63:aload_2         
	//   30   64:invokeinterface #81  <Method void BlockingQueue.put(Object)>
			return;
	//   31   69:return          
		}
		if(azi1.a())
	//*  32   70:aload_3         
	//*  33   71:invokevirtual   #85  <Method boolean azi.a()>
	//*  34   74:ifeq            111
		{
			boq1.b("cache-hit-expired");
	//   35   77:aload_2         
	//   36   78:ldc1            #87  <String "cache-hit-expired">
	//   37   80:invokevirtual   #60  <Method void boq.b(String)>
			boq1.a(azi1);
	//   38   83:aload_2         
	//   39   84:aload_3         
	//   40   85:invokevirtual   #90  <Method boq boq.a(azi)>
	//   41   88:pop             
			if(!bcm.a(g, boq1))
	//*  42   89:aload_0         
	//*  43   90:getfield        #45  <Field bcm g>
	//*  44   93:aload_2         
	//*  45   94:invokestatic    #77  <Method boolean bcm.a(bcm, boq)>
	//*  46   97:ifne            110
				c.put(((Object) (boq1)));
	//   47  100:aload_0         
	//   48  101:getfield        #34  <Field BlockingQueue c>
	//   49  104:aload_2         
	//   50  105:invokeinterface #81  <Method void BlockingQueue.put(Object)>
			return;
	//   51  110:return          
		}
		boq1.b("cache-hit");
	//   52  111:aload_2         
	//   53  112:ldc1            #92  <String "cache-hit">
	//   54  114:invokevirtual   #60  <Method void boq.b(String)>
		bwq bwq1 = boq1.a(new bmq(azi1.a, azi1.g));
	//   55  117:aload_2         
	//   56  118:new             #94  <Class bmq>
	//   57  121:dup             
	//   58  122:aload_3         
	//   59  123:getfield        #97  <Field byte[] azi.a>
	//   60  126:aload_3         
	//   61  127:getfield        #100 <Field java.util.Map azi.g>
	//   62  130:invokespecial   #103 <Method void bmq(byte[], java.util.Map)>
	//   63  133:invokevirtual   #106 <Method bwq boq.a(bmq)>
	//   64  136:astore          4
		boq1.b("cache-hit-parsed");
	//   65  138:aload_2         
	//   66  139:ldc1            #108 <String "cache-hit-parsed">
	//   67  141:invokevirtual   #60  <Method void boq.b(String)>
		boolean flag;
		if(azi1.f < System.currentTimeMillis())
	//*  68  144:aload_3         
	//*  69  145:getfield        #111 <Field long azi.f>
	//*  70  148:invokestatic    #117 <Method long System.currentTimeMillis()>
	//*  71  151:lcmp            
	//*  72  152:ifge            160
			flag = true;
	//   73  155:iconst_1        
	//   74  156:istore_1        
		else
	//*  75  157:goto            162
			flag = false;
	//   76  160:iconst_0        
	//   77  161:istore_1        
		if(flag)
	//*  78  162:iload_1         
	//*  79  163:ifeq            217
		{
			boq1.b("cache-hit-refresh-needed");
	//   80  166:aload_2         
	//   81  167:ldc1            #119 <String "cache-hit-refresh-needed">
	//   82  169:invokevirtual   #60  <Method void boq.b(String)>
			boq1.a(azi1);
	//   83  172:aload_2         
	//   84  173:aload_3         
	//   85  174:invokevirtual   #90  <Method boq boq.a(azi)>
	//   86  177:pop             
			bwq1.d = true;
	//   87  178:aload           4
	//   88  180:iconst_1        
	//   89  181:putfield        #123 <Field boolean bwq.d>
			if(!bcm.a(g, boq1))
	//*  90  184:aload_0         
	//*  91  185:getfield        #45  <Field bcm g>
	//*  92  188:aload_2         
	//*  93  189:invokestatic    #77  <Method boolean bcm.a(bcm, boq)>
	//*  94  192:ifne            217
			{
				e.a(boq1, bwq1, ((Runnable) (new bbl(this, boq1))));
	//   95  195:aload_0         
	//   96  196:getfield        #38  <Field b e>
	//   97  199:aload_2         
	//   98  200:aload           4
	//   99  202:new             #125 <Class bbl>
	//  100  205:dup             
	//  101  206:aload_0         
	//  102  207:aload_2         
	//  103  208:invokespecial   #128 <Method void bbl(baj, boq)>
	//  104  211:invokeinterface #133 <Method void b.a(boq, bwq, Runnable)>
				return;
	//  105  216:return          
			}
		}
		e.a(boq1, bwq1);
	//  106  217:aload_0         
	//  107  218:getfield        #38  <Field b e>
	//  108  221:aload_2         
	//  109  222:aload           4
	//  110  224:invokeinterface #136 <Method void b.a(boq, bwq)>
	//  111  229:return          
	}

	public final void a()
	{
		f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #30  <Field boolean f>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #139 <Method void interrupt()>
	//    5    9:return          
	}

	public final void run()
	{
		if(a)
	//*   0    0:getstatic       #23  <Field boolean a>
	//*   1    3:ifeq            15
			ee.a("start new dispatcher", new Object[0]);
	//    2    6:ldc1            #144 <String "start new dispatcher">
	//    3    8:iconst_0        
	//    4    9:anewarray       Object[]
	//    5   12:invokestatic    #149 <Method void ee.a(String, Object[])>
		Process.setThreadPriority(10);
	//    6   15:bipush          10
	//    7   17:invokestatic    #155 <Method void Process.setThreadPriority(int)>
		d.a();
	//    8   20:aload_0         
	//    9   21:getfield        #36  <Field za d>
	//   10   24:invokeinterface #157 <Method void za.a()>
		do
		{
			try
			{
				do
					b();
	//   11   29:aload_0         
	//   12   30:invokespecial   #159 <Method void b()>
				while(true);
	//   13   33:goto            29
			}
	//*  14   36:aload_0         
	//*  15   37:getfield        #30  <Field boolean f>
	//*  16   40:ifeq            50
	//*  17   43:invokestatic    #163 <Method Thread Thread.currentThread()>
	//*  18   46:invokevirtual   #164 <Method void Thread.interrupt()>
	//*  19   49:return          
	//*  20   50:ldc1            #166 <String "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it">
	//*  21   52:iconst_0        
	//*  22   53:anewarray       Object[]
	//*  23   56:invokestatic    #168 <Method void ee.c(String, Object[])>
	//*  24   59:goto            29
			catch(InterruptedException interruptedexception) { }
	//   25   62:astore_1        
			if(f)
			{
				Thread.currentThread().interrupt();
				return;
			}
			ee.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
		} while(true);
	//   26   63:goto            36
	}

	private static final boolean a;
	private final BlockingQueue b;
	private final BlockingQueue c;
	private final za d;
	private final b e;
	private volatile boolean f;
	private final bcm g = new bcm(this);

	static 
	{
		a = ee.a;
	//    0    0:getstatic       #22  <Field boolean ee.a>
	//    1    3:putstatic       #23  <Field boolean a>
	//*   2    6:return          
	}
}
