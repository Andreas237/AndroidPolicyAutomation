// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfn, bko, boq, baj, 
//			bvs, za, bjn, b

public final class bus
{

	public bus(za za, bjn bjn)
	{
		this(za, bjn, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #28  <Method void bus(za, bjn, int)>
	//    5    7:return          
	}

	private bus(za za, bjn bjn, int k)
	{
		this(za, bjn, 4, ((b) (new bfn(new Handler(Looper.getMainLooper())))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_4        
	//    4    4:new             #31  <Class bfn>
	//    5    7:dup             
	//    6    8:new             #33  <Class Handler>
	//    7   11:dup             
	//    8   12:invokestatic    #39  <Method Looper Looper.getMainLooper()>
	//    9   15:invokespecial   #42  <Method void Handler(Looper)>
	//   10   18:invokespecial   #45  <Method void bfn(Handler)>
	//   11   21:invokespecial   #48  <Method void bus(za, bjn, int, b)>
	//   12   24:return          
	}

	private bus(za za, bjn bjn, int k, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		a = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #53  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #54  <Method void AtomicInteger()>
	//    6   12:putfield        #56  <Field AtomicInteger a>
		b = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #58  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #59  <Method void HashSet()>
	//   11   23:putfield        #61  <Field Set b>
		c = new PriorityBlockingQueue();
	//   12   26:aload_0         
	//   13   27:new             #63  <Class PriorityBlockingQueue>
	//   14   30:dup             
	//   15   31:invokespecial   #64  <Method void PriorityBlockingQueue()>
	//   16   34:putfield        #66  <Field PriorityBlockingQueue c>
		d = new PriorityBlockingQueue();
	//   17   37:aload_0         
	//   18   38:new             #63  <Class PriorityBlockingQueue>
	//   19   41:dup             
	//   20   42:invokespecial   #64  <Method void PriorityBlockingQueue()>
	//   21   45:putfield        #68  <Field PriorityBlockingQueue d>
		j = ((List) (new ArrayList()));
	//   22   48:aload_0         
	//   23   49:new             #70  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #71  <Method void ArrayList()>
	//   26   56:putfield        #73  <Field List j>
		e = za;
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:putfield        #75  <Field za e>
		f = bjn;
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:putfield        #77  <Field bjn f>
		h = new bko[4];
	//   33   69:aload_0         
	//   34   70:iconst_4        
	//   35   71:anewarray       bko[]
	//   36   74:putfield        #81  <Field bko[] h>
		g = b1;
	//   37   77:aload_0         
	//   38   78:aload           4
	//   39   80:putfield        #83  <Field b g>
	//   40   83:return          
	}

	public final boq a(boq boq1)
	{
		boq1.a(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #89  <Method boq boq.a(bus)>
	//    3    5:pop             
		synchronized(b)
	//*   4    6:aload_0         
	//*   5    7:getfield        #61  <Field Set b>
	//*   6   10:astore_2        
	//*   7   11:aload_2         
	//*   8   12:monitorenter    
		{
			b.add(((Object) (boq1)));
	//    9   13:aload_0         
	//   10   14:getfield        #61  <Field Set b>
	//   11   17:aload_1         
	//   12   18:invokeinterface #95  <Method boolean Set.add(Object)>
	//   13   23:pop             
		}
	//   14   24:aload_2         
	//   15   25:monitorexit     
		boq1.a(a.incrementAndGet());
	//   16   26:aload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #56  <Field AtomicInteger a>
	//   19   31:invokevirtual   #99  <Method int AtomicInteger.incrementAndGet()>
	//   20   34:invokevirtual   #102 <Method boq boq.a(int)>
	//   21   37:pop             
		boq1.b("add-to-queue");
	//   22   38:aload_1         
	//   23   39:ldc1            #104 <String "add-to-queue">
	//   24   41:invokevirtual   #107 <Method void boq.b(String)>
		if(!boq1.i())
	//*  25   44:aload_1         
	//*  26   45:invokevirtual   #110 <Method boolean boq.i()>
	//*  27   48:ifne            62
		{
			d.add(((Object) (boq1)));
	//   28   51:aload_0         
	//   29   52:getfield        #68  <Field PriorityBlockingQueue d>
	//   30   55:aload_1         
	//   31   56:invokevirtual   #111 <Method boolean PriorityBlockingQueue.add(Object)>
	//   32   59:pop             
			return boq1;
	//   33   60:aload_1         
	//   34   61:areturn         
		} else
		{
			c.add(((Object) (boq1)));
	//   35   62:aload_0         
	//   36   63:getfield        #66  <Field PriorityBlockingQueue c>
	//   37   66:aload_1         
	//   38   67:invokevirtual   #111 <Method boolean PriorityBlockingQueue.add(Object)>
	//   39   70:pop             
			return boq1;
	//   40   71:aload_1         
	//   41   72:areturn         
		}
		boq1;
	//   42   73:astore_1        
		set;
	//   43   74:aload_2         
		JVM INSTR monitorexit ;
	//   44   75:monitorexit     
		throw boq1;
	//   45   76:aload_1         
	//   46   77:athrow          
	}

	public final void a()
	{
		baj baj1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field baj i>
	//    2    4:astore          4
		if(baj1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			baj1.a();
	//    5   11:aload           4
	//    6   13:invokevirtual   #117 <Method void baj.a()>
		bko abko[] = h;
	//    7   16:aload_0         
	//    8   17:getfield        #81  <Field bko[] h>
	//    9   20:astore          4
		int i1 = abko.length;
	//   10   22:aload           4
	//   11   24:arraylength     
	//   12   25:istore_3        
		boolean flag = false;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		for(int k = 0; k < i1; k++)
	//*  15   28:iconst_0        
	//*  16   29:istore_1        
	//*  17   30:iload_1         
	//*  18   31:iload_3         
	//*  19   32:icmpge          58
		{
			bko bko2 = abko[k];
	//   20   35:aload           4
	//   21   37:iload_1         
	//   22   38:aaload          
	//   23   39:astore          5
			if(bko2 != null)
	//*  24   41:aload           5
	//*  25   43:ifnull          51
				bko2.a();
	//   26   46:aload           5
	//   27   48:invokevirtual   #118 <Method void bko.a()>
		}

	//   28   51:iload_1         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_1        
	//*  32   55:goto            30
		i = new baj(((java.util.concurrent.BlockingQueue) (c)), ((java.util.concurrent.BlockingQueue) (d)), e, g);
	//   33   58:aload_0         
	//   34   59:new             #115 <Class baj>
	//   35   62:dup             
	//   36   63:aload_0         
	//   37   64:getfield        #66  <Field PriorityBlockingQueue c>
	//   38   67:aload_0         
	//   39   68:getfield        #68  <Field PriorityBlockingQueue d>
	//   40   71:aload_0         
	//   41   72:getfield        #75  <Field za e>
	//   42   75:aload_0         
	//   43   76:getfield        #83  <Field b g>
	//   44   79:invokespecial   #121 <Method void baj(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, za, b)>
	//   45   82:putfield        #113 <Field baj i>
		i.start();
	//   46   85:aload_0         
	//   47   86:getfield        #113 <Field baj i>
	//   48   89:invokevirtual   #124 <Method void baj.start()>
		for(int l = ((int) (flag)); l < h.length; l++)
	//*  49   92:iload_2         
	//*  50   93:istore_1        
	//*  51   94:iload_1         
	//*  52   95:aload_0         
	//*  53   96:getfield        #81  <Field bko[] h>
	//*  54   99:arraylength     
	//*  55  100:icmpge          148
		{
			bko bko1 = new bko(((java.util.concurrent.BlockingQueue) (d)), f, e, g);
	//   56  103:new             #79  <Class bko>
	//   57  106:dup             
	//   58  107:aload_0         
	//   59  108:getfield        #68  <Field PriorityBlockingQueue d>
	//   60  111:aload_0         
	//   61  112:getfield        #77  <Field bjn f>
	//   62  115:aload_0         
	//   63  116:getfield        #75  <Field za e>
	//   64  119:aload_0         
	//   65  120:getfield        #83  <Field b g>
	//   66  123:invokespecial   #127 <Method void bko(java.util.concurrent.BlockingQueue, bjn, za, b)>
	//   67  126:astore          4
			h[l] = bko1;
	//   68  128:aload_0         
	//   69  129:getfield        #81  <Field bko[] h>
	//   70  132:iload_1         
	//   71  133:aload           4
	//   72  135:aastore         
			bko1.start();
	//   73  136:aload           4
	//   74  138:invokevirtual   #128 <Method void bko.start()>
		}

	//   75  141:iload_1         
	//   76  142:iconst_1        
	//   77  143:iadd            
	//   78  144:istore_1        
	//*  79  145:goto            94
	//   80  148:return          
	}

	final void b(boq boq1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Set b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			b.remove(((Object) (boq1)));
	//    5    7:aload_0         
	//    6    8:getfield        #61  <Field Set b>
	//    7   11:aload_1         
	//    8   12:invokeinterface #132 <Method boolean Set.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		obj = ((Object) (j));
	//   12   20:aload_0         
	//   13   21:getfield        #73  <Field List j>
	//   14   24:astore_2        
		obj;
	//   15   25:aload_2         
		JVM INSTR monitorenter ;
	//   16   26:monitorenter    
		for(Iterator iterator = j.iterator(); iterator.hasNext(); ((bvs)iterator.next()).a(boq1));
	//   17   27:aload_0         
	//   18   28:getfield        #73  <Field List j>
	//   19   31:invokeinterface #138 <Method Iterator List.iterator()>
	//   20   36:astore_3        
	//   21   37:aload_3         
	//   22   38:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   23   43:ifeq            64
	//   24   46:aload_3         
	//   25   47:invokeinterface #147 <Method Object Iterator.next()>
	//   26   52:checkcast       #149 <Class bvs>
	//   27   55:aload_1         
	//   28   56:invokeinterface #151 <Method void bvs.a(boq)>
	//*  29   61:goto            37
		obj;
	//   30   64:aload_2         
		JVM INSTR monitorexit ;
	//   31   65:monitorexit     
		return;
	//   32   66:return          
		boq1;
	//   33   67:astore_1        
		obj;
	//   34   68:aload_2         
		JVM INSTR monitorexit ;
	//   35   69:monitorexit     
		throw boq1;
	//   36   70:aload_1         
	//   37   71:athrow          
		boq1;
	//   38   72:astore_1        
		obj;
	//   39   73:aload_2         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		throw boq1;
	//   41   75:aload_1         
	//   42   76:athrow          
	}

	private final AtomicInteger a;
	private final Set b;
	private final PriorityBlockingQueue c;
	private final PriorityBlockingQueue d;
	private final za e;
	private final bjn f;
	private final b g;
	private final bko h[];
	private baj i;
	private final List j;
}
