// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqs, boq, ee, baj, 
//			bwq, azi, b

final class bcm
	implements bqs
{

	bcm(baj baj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map a>
		b = baj1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field baj b>
	//   10   20:return          
	}

	static boolean a(bcm bcm1, boq boq1)
	{
		return bcm1.b(boq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method boolean b(boq)>
	//    3    5:ireturn         
	}

	private final boolean b(boq boq1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list;
		String s;
		s = boq1.f();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #33  <Method String boq.f()>
	//    4    6:astore          4
		if(!a.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_102;
	//    5    8:aload_0         
	//    6    9:getfield        #20  <Field Map a>
	//    7   12:aload           4
	//    8   14:invokeinterface #39  <Method boolean Map.containsKey(Object)>
	//    9   19:ifeq            102
		list = (List)a.get(((Object) (s)));
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field Map a>
	//   12   26:aload           4
	//   13   28:invokeinterface #43  <Method Object Map.get(Object)>
	//   14   33:checkcast       #45  <Class List>
	//   15   36:astore_3        
		Object obj;
		obj = ((Object) (list));
	//   16   37:aload_3         
	//   17   38:astore_2        
		if(list != null)
			break MISSING_BLOCK_LABEL_51;
	//   18   39:aload_3         
	//   19   40:ifnonnull       51
		obj = ((Object) (new ArrayList()));
	//   20   43:new             #47  <Class ArrayList>
	//   21   46:dup             
	//   22   47:invokespecial   #48  <Method void ArrayList()>
	//   23   50:astore_2        
		boq1.b("waiting-for-response");
	//   24   51:aload_1         
	//   25   52:ldc1            #50  <String "waiting-for-response">
	//   26   54:invokevirtual   #53  <Method void boq.b(String)>
		((List) (obj)).add(((Object) (boq1)));
	//   27   57:aload_2         
	//   28   58:aload_1         
	//   29   59:invokeinterface #56  <Method boolean List.add(Object)>
	//   30   64:pop             
		a.put(((Object) (s)), obj);
	//   31   65:aload_0         
	//   32   66:getfield        #20  <Field Map a>
	//   33   69:aload           4
	//   34   71:aload_2         
	//   35   72:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   36   77:pop             
		if(ee.a)
	//*  37   78:getstatic       #65  <Field boolean ee.a>
	//*  38   81:ifeq            98
			ee.b("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
				s
			});
	//   39   84:ldc1            #67  <String "Request for cacheKey=%s is in flight, putting on hold.">
	//   40   86:iconst_1        
	//   41   87:anewarray       Object[]
	//   42   90:dup             
	//   43   91:iconst_0        
	//   44   92:aload           4
	//   45   94:aastore         
	//   46   95:invokestatic    #70  <Method void ee.b(String, Object[])>
		this;
	//   47   98:aload_0         
		JVM INSTR monitorexit ;
	//   48   99:monitorexit     
		return true;
	//   49  100:iconst_1        
	//   50  101:ireturn         
		a.put(((Object) (s)), ((Object) (null)));
	//   51  102:aload_0         
	//   52  103:getfield        #20  <Field Map a>
	//   53  106:aload           4
	//   54  108:aconst_null     
	//   55  109:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   56  114:pop             
		boq1.a(((bqs) (this)));
	//   57  115:aload_1         
	//   58  116:aload_0         
	//   59  117:invokevirtual   #73  <Method void boq.a(bqs)>
		if(ee.a)
	//*  60  120:getstatic       #65  <Field boolean ee.a>
	//*  61  123:ifeq            140
			ee.b("new request, sending to network %s", new Object[] {
				s
			});
	//   62  126:ldc1            #75  <String "new request, sending to network %s">
	//   63  128:iconst_1        
	//   64  129:anewarray       Object[]
	//   65  132:dup             
	//   66  133:iconst_0        
	//   67  134:aload           4
	//   68  136:aastore         
	//   69  137:invokestatic    #70  <Method void ee.b(String, Object[])>
		this;
	//   70  140:aload_0         
		JVM INSTR monitorexit ;
	//   71  141:monitorexit     
		return false;
	//   72  142:iconst_0        
	//   73  143:ireturn         
		boq1;
	//   74  144:astore_1        
	//*  75  145:aload_0         
		throw boq1;
	//   76  146:monitorexit     
	//   77  147:aload_1         
	//   78  148:athrow          
	}

	public final void a(boq boq1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list;
		boq1 = ((boq) (boq1.f()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #33  <Method String boq.f()>
	//    4    6:astore_1        
		list = (List)a.remove(((Object) (boq1)));
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map a>
	//    7   11:aload_1         
	//    8   12:invokeinterface #81  <Method Object Map.remove(Object)>
	//    9   17:checkcast       #45  <Class List>
	//   10   20:astore_2        
		if(list == null)
			break MISSING_BLOCK_LABEL_139;
	//   11   21:aload_2         
	//   12   22:ifnull          139
		boq boq2;
		if(list.isEmpty())
			break MISSING_BLOCK_LABEL_139;
	//   13   25:aload_2         
	//   14   26:invokeinterface #85  <Method boolean List.isEmpty()>
	//   15   31:ifne            139
		if(ee.a)
	//*  16   34:getstatic       #65  <Field boolean ee.a>
	//*  17   37:ifeq            65
			ee.a("%d waiting requests for cacheKey=%s; resend to network", new Object[] {
				Integer.valueOf(list.size()), boq1
			});
	//   18   40:ldc1            #87  <String "%d waiting requests for cacheKey=%s; resend to network">
	//   19   42:iconst_2        
	//   20   43:anewarray       Object[]
	//   21   46:dup             
	//   22   47:iconst_0        
	//   23   48:aload_2         
	//   24   49:invokeinterface #91  <Method int List.size()>
	//   25   54:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:aload_1         
	//   30   61:aastore         
	//   31   62:invokestatic    #99  <Method void ee.a(String, Object[])>
		boq2 = (boq)list.remove(0);
	//   32   65:aload_2         
	//   33   66:iconst_0        
	//   34   67:invokeinterface #102 <Method Object List.remove(int)>
	//   35   72:checkcast       #29  <Class boq>
	//   36   75:astore_3        
		a.put(((Object) (boq1)), ((Object) (list)));
	//   37   76:aload_0         
	//   38   77:getfield        #20  <Field Map a>
	//   39   80:aload_1         
	//   40   81:aload_2         
	//   41   82:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   42   87:pop             
		boq2.a(((bqs) (this)));
	//   43   88:aload_3         
	//   44   89:aload_0         
	//   45   90:invokevirtual   #73  <Method void boq.a(bqs)>
		baj.a(b).put(((Object) (boq2)));
	//   46   93:aload_0         
	//   47   94:getfield        #22  <Field baj b>
	//   48   97:invokestatic    #107 <Method BlockingQueue baj.a(baj)>
	//   49  100:aload_3         
	//   50  101:invokeinterface #112 <Method void BlockingQueue.put(Object)>
		this;
	//   51  106:aload_0         
		JVM INSTR monitorexit ;
	//   52  107:monitorexit     
		return;
	//   53  108:return          
		boq1;
	//   54  109:astore_1        
		ee.c("Couldn't add request to queue. %s", new Object[] {
			((InterruptedException) (boq1)).toString()
		});
	//   55  110:ldc1            #114 <String "Couldn't add request to queue. %s">
	//   56  112:iconst_1        
	//   57  113:anewarray       Object[]
	//   58  116:dup             
	//   59  117:iconst_0        
	//   60  118:aload_1         
	//   61  119:invokevirtual   #117 <Method String InterruptedException.toString()>
	//   62  122:aastore         
	//   63  123:invokestatic    #120 <Method void ee.c(String, Object[])>
		Thread.currentThread().interrupt();
	//   64  126:invokestatic    #126 <Method Thread Thread.currentThread()>
	//   65  129:invokevirtual   #129 <Method void Thread.interrupt()>
		b.a();
	//   66  132:aload_0         
	//   67  133:getfield        #22  <Field baj b>
	//   68  136:invokevirtual   #131 <Method void baj.a()>
		this;
	//   69  139:aload_0         
		JVM INSTR monitorexit ;
	//   70  140:monitorexit     
		return;
	//   71  141:return          
		boq1;
	//   72  142:astore_1        
	//*  73  143:aload_0         
		throw boq1;
	//   74  144:monitorexit     
	//   75  145:aload_1         
	//   76  146:athrow          
	}

	public final void a(boq boq1, bwq bwq1)
	{
		if(bwq1.b == null || bwq1.b.a())
	//*   0    0:aload_2         
	//*   1    1:getfield        #137 <Field azi bwq.b>
	//*   2    4:ifnull          127
	//*   3    7:aload_2         
	//*   4    8:getfield        #137 <Field azi bwq.b>
	//*   5   11:invokevirtual   #141 <Method boolean azi.a()>
	//*   6   14:ifeq            20
			break MISSING_BLOCK_LABEL_127;
	//    7   17:goto            127
		boq1 = ((boq) (boq1.f()));
	//    8   20:aload_1         
	//    9   21:invokevirtual   #33  <Method String boq.f()>
	//   10   24:astore_1        
		this;
	//   11   25:aload_0         
		JVM INSTR monitorenter ;
	//   12   26:monitorenter    
		Object obj = ((Object) ((List)a.remove(((Object) (boq1)))));
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field Map a>
	//   15   31:aload_1         
	//   16   32:invokeinterface #81  <Method Object Map.remove(Object)>
	//   17   37:checkcast       #45  <Class List>
	//   18   40:astore_3        
		this;
	//   19   41:aload_0         
		JVM INSTR monitorexit ;
	//   20   42:monitorexit     
		if(obj != null)
	//*  21   43:aload_3         
	//*  22   44:ifnull          121
		{
			if(ee.a)
	//*  23   47:getstatic       #65  <Field boolean ee.a>
	//*  24   50:ifeq            78
				ee.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
					Integer.valueOf(((List) (obj)).size()), boq1
				});
	//   25   53:ldc1            #143 <String "Releasing %d waiting requests for cacheKey=%s.">
	//   26   55:iconst_2        
	//   27   56:anewarray       Object[]
	//   28   59:dup             
	//   29   60:iconst_0        
	//   30   61:aload_3         
	//   31   62:invokeinterface #91  <Method int List.size()>
	//   32   67:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   33   70:aastore         
	//   34   71:dup             
	//   35   72:iconst_1        
	//   36   73:aload_1         
	//   37   74:aastore         
	//   38   75:invokestatic    #99  <Method void ee.a(String, Object[])>
			for(boq1 = ((boq) (((List) (obj)).iterator())); ((Iterator) (boq1)).hasNext(); baj.b(b).a(((boq) (obj)), bwq1))
	//*  39   78:aload_3         
	//*  40   79:invokeinterface #147 <Method Iterator List.iterator()>
	//*  41   84:astore_1        
	//*  42   85:aload_1         
	//*  43   86:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//*  44   91:ifeq            121
				obj = ((Object) ((boq)((Iterator) (boq1)).next()));
	//   45   94:aload_1         
	//   46   95:invokeinterface #156 <Method Object Iterator.next()>
	//   47  100:checkcast       #29  <Class boq>
	//   48  103:astore_3        

	//   49  104:aload_0         
	//   50  105:getfield        #22  <Field baj b>
	//   51  108:invokestatic    #159 <Method b baj.b(baj)>
	//   52  111:aload_3         
	//   53  112:aload_2         
	//   54  113:invokeinterface #163 <Method void b.a(boq, bwq)>
		}
	//*  55  118:goto            85
		return;
	//   56  121:return          
		boq1;
	//   57  122:astore_1        
		this;
	//   58  123:aload_0         
		JVM INSTR monitorexit ;
	//   59  124:monitorexit     
		throw boq1;
	//   60  125:aload_1         
	//   61  126:athrow          
		a(boq1);
	//   62  127:aload_0         
	//   63  128:aload_1         
	//   64  129:invokevirtual   #165 <Method void a(boq)>
		return;
	//   65  132:return          
	}

	private final Map a = new HashMap();
	private final baj b;
}
