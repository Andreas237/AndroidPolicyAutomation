// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.c;

import com.irobot.a.g;
import com.irobot.home.util.o;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.irobot.home.c:
//			a, c, b

private class a$b$b
	implements Runnable
{

	public void a()
	{
		b = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #23  <Field boolean b>
	//    3    5:return          
	}

	public void b()
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #23  <Field boolean b>
	//    3    5:return          
	}

	public void run()
	{
_L2:
		if(!b)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean b>
	//    2    4:ifeq            247
		if(com.irobot.home.c.a.b.a(a).c().availablePermits() > 1)
	//*   3    7:aload_0         
	//*   4    8:getfield        #18  <Field a$b a>
	//*   5   11:invokestatic    #33  <Method c a$b.a(a$b)>
	//*   6   14:invokevirtual   #39  <Method Semaphore c.c()>
	//*   7   17:invokevirtual   #45  <Method int Semaphore.availablePermits()>
	//*   8   20:iconst_1        
	//*   9   21:icmple          66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   24:new             #47  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #48  <Method void StringBuilder()>
	//   13   31:astore_1        
			stringbuilder.append("Availble permits are too high for the operation queue. Available: ");
	//   14   32:aload_1         
	//   15   33:ldc1            #50  <String "Availble permits are too high for the operation queue. Available: ">
	//   16   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
			stringbuilder.append(com.irobot.home.c.a.b.a(a).c().availablePermits());
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #18  <Field a$b a>
	//   21   44:invokestatic    #33  <Method c a$b.a(a$b)>
	//   22   47:invokevirtual   #39  <Method Semaphore c.c()>
	//   23   50:invokevirtual   #45  <Method int Semaphore.availablePermits()>
	//   24   53:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   25   56:pop             
			o.e("AltNetSession", stringbuilder.toString());
	//   26   57:ldc1            #59  <String "AltNetSession">
	//   27   59:aload_1         
	//   28   60:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   29   63:invokestatic    #69  <Method void o.e(String, String)>
		}
		com.irobot.home.c.a.b.a(a).c().acquire();
	//   30   66:aload_0         
	//   31   67:getfield        #18  <Field a$b a>
	//   32   70:invokestatic    #33  <Method c a$b.a(a$b)>
	//   33   73:invokevirtual   #39  <Method Semaphore c.c()>
	//   34   76:invokevirtual   #72  <Method void Semaphore.acquire()>
		if(com.irobot.home.c.a.b.a(a).a().h())
	//*  35   79:aload_0         
	//*  36   80:getfield        #18  <Field a$b a>
	//*  37   83:invokestatic    #33  <Method c a$b.a(a$b)>
	//*  38   86:invokevirtual   #75  <Method g c.a()>
	//*  39   89:invokevirtual   #81  <Method boolean g.h()>
	//*  40   92:ifeq            124
		{
			com.irobot.home.c.a.b.a(a).c().release();
	//   41   95:aload_0         
	//   42   96:getfield        #18  <Field a$b a>
	//   43   99:invokestatic    #33  <Method c a$b.a(a$b)>
	//   44  102:invokevirtual   #39  <Method Semaphore c.c()>
	//   45  105:invokevirtual   #84  <Method void Semaphore.release()>
			o.c("AltNetSession", "Operation queue: robot is busy, sleeping...");
	//   46  108:ldc1            #59  <String "AltNetSession">
	//   47  110:ldc1            #86  <String "Operation queue: robot is busy, sleeping...">
	//   48  112:invokestatic    #88  <Method void o.c(String, String)>
			Thread.sleep(5L);
	//   49  115:ldc2w           #89  <Long 5L>
	//   50  118:invokestatic    #96  <Method void Thread.sleep(long)>
			continue; /* Loop/switch isn't completed */
	//   51  121:goto            0
		}
		if(!b)
			break MISSING_BLOCK_LABEL_236;
	//   52  124:aload_0         
	//   53  125:getfield        #23  <Field boolean b>
	//   54  128:ifeq            236
		if(com.irobot.home.c.a.b.b(a) == null)
	//*  55  131:aload_0         
	//*  56  132:getfield        #18  <Field a$b a>
	//*  57  135:invokestatic    #99  <Method com.irobot.core.AssetId a$b.b(a$b)>
	//*  58  138:ifnonnull       142
			return;
	//   59  141:return          
		try
		{
			com.irobot.home.c.a.b.a(a, (b)com.irobot.home.c.a.b.c(a).takeFirst());
	//   60  142:aload_0         
	//   61  143:getfield        #18  <Field a$b a>
	//   62  146:aload_0         
	//   63  147:getfield        #18  <Field a$b a>
	//   64  150:invokestatic    #102 <Method LinkedBlockingDeque a$b.c(a$b)>
	//   65  153:invokevirtual   #108 <Method Object LinkedBlockingDeque.takeFirst()>
	//   66  156:checkcast       #110 <Class b>
	//   67  159:invokestatic    #113 <Method b a$b.a(a$b, b)>
	//   68  162:pop             
			if(b && com.irobot.home.c.a.b.b(a) != null)
	//*  69  163:aload_0         
	//*  70  164:getfield        #23  <Field boolean b>
	//*  71  167:ifeq            0
	//*  72  170:aload_0         
	//*  73  171:getfield        #18  <Field a$b a>
	//*  74  174:invokestatic    #99  <Method com.irobot.core.AssetId a$b.b(a$b)>
	//*  75  177:ifnull          0
			{
				b b1 = com.irobot.home.c.a.b.d(a);
	//   76  180:aload_0         
	//   77  181:getfield        #18  <Field a$b a>
	//   78  184:invokestatic    #117 <Method b a$b.d(a$b)>
	//   79  187:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   80  188:new             #47  <Class StringBuilder>
	//   81  191:dup             
	//   82  192:invokespecial   #48  <Method void StringBuilder()>
	//   83  195:astore_2        
				stringbuilder1.append("Operation:");
	//   84  196:aload_2         
	//   85  197:ldc1            #119 <String "Operation:">
	//   86  199:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   87  202:pop             
				stringbuilder1.append(com.irobot.home.c.a.b.d(a).b());
	//   88  203:aload_2         
	//   89  204:aload_0         
	//   90  205:getfield        #18  <Field a$b a>
	//   91  208:invokestatic    #117 <Method b a$b.d(a$b)>
	//   92  211:invokevirtual   #121 <Method String b.b()>
	//   93  214:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   94  217:pop             
				(new Thread(((Runnable) (b1)), stringbuilder1.toString())).start();
	//   95  218:new             #92  <Class Thread>
	//   96  221:dup             
	//   97  222:aload_1         
	//   98  223:aload_2         
	//   99  224:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  100  227:invokespecial   #124 <Method void Thread(Runnable, String)>
	//  101  230:invokevirtual   #127 <Method void Thread.start()>
			}
		}
	//* 102  233:goto            0
	//* 103  236:return          
	//* 104  237:ldc1            #129 <String "ACA">
	//* 105  239:ldc1            #131 <String "Count down latch interrupted while draining operation queue.">
	//* 106  241:invokestatic    #69  <Method void o.e(String, String)>
	//* 107  244:goto            0
	//* 108  247:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			o.e("ACA", "Count down latch interrupted while draining operation queue.");
		}
		continue; /* Loop/switch isn't completed */
		return;
		if(true) goto _L2; else goto _L1
_L1:
		InterruptedException interruptedexception;
	//* 109  248:astore_1        
	//* 110  249:goto            237
	}

	final a.b a;
	private boolean b;

	private a$b$b(a.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field a$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		b = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #23  <Field boolean b>
	//    8   14:return          
	}

	a$b$b(a.b b1, a._cls1 _pcls1)
	{
		this(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void a$b$b(a$b)>
	//    3    5:return          
	}
}
