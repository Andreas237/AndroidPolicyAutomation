// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//			y, ab, co, cg, 
//			dh, cz, dj, bt, 
//			bu, q

class y$5
	implements IEventSubscriber
{

	public void a(ab ab1)
	{
		ab1 = ((ab) (ab1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method co ab.a()>
	//    2    4:astore_1        
		Object obj = ((Object) (((co) (ab1)).e()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #34  <Method cg co.e()>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          55
		{
			if(((cg) (obj)).d())
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #40  <Method boolean cg.d()>
	//*  10   20:ifeq            37
			{
				a.c();
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field y a>
	//   13   27:invokevirtual   #43  <Method void y.c()>
				a.d();
	//   14   30:aload_0         
	//   15   31:getfield        #18  <Field y a>
	//   16   34:invokevirtual   #45  <Method void y.d()>
			}
			if(((cg) (obj)).c())
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #47  <Method boolean cg.c()>
	//*  19   41:ifeq            55
				y.a(a).a(true);
	//   20   44:aload_0         
	//   21   45:getfield        #18  <Field y a>
	//   22   48:invokestatic    #50  <Method dh y.a(y)>
	//   23   51:iconst_1        
	//   24   52:invokevirtual   #55  <Method void dh.a(boolean)>
		}
		obj = ((Object) (((co) (ab1)).c()));
	//   25   55:aload_1         
	//   26   56:invokeinterface #58  <Method ce co.c()>
	//   27   61:astore_2        
		if(obj != null)
	//*  28   62:aload_2         
	//*  29   63:ifnull          79
			y.b(a).b(obj, false);
	//   30   66:aload_0         
	//   31   67:getfield        #18  <Field y a>
	//   32   70:invokestatic    #61  <Method cz y.b(y)>
	//   33   73:aload_2         
	//   34   74:iconst_0        
	//   35   75:invokevirtual   #66  <Method boolean cz.b(Object, boolean)>
	//   36   78:pop             
		obj = ((Object) (((co) (ab1)).d()));
	//   37   79:aload_1         
	//   38   80:invokeinterface #69  <Method ch co.d()>
	//   39   85:astore_2        
		if(obj != null)
	//*  40   86:aload_2         
	//*  41   87:ifnull          103
			y.c(a).b(obj, false);
	//   42   90:aload_0         
	//   43   91:getfield        #18  <Field y a>
	//   44   94:invokestatic    #72  <Method dj y.c(y)>
	//   45   97:aload_2         
	//   46   98:iconst_0        
	//   47   99:invokevirtual   #75  <Method boolean dj.b(Object, boolean)>
	//   48  102:pop             
		ab1 = ((ab) (((co) (ab1)).f()));
	//   49  103:aload_1         
	//   50  104:invokeinterface #79  <Method bt co.f()>
	//   51  109:astore_1        
		if(ab1 != null)
	//*  52  110:aload_1         
	//*  53  111:ifnull          159
		{
			bu bu1;
			for(ab1 = ((ab) (((bt) (ab1)).a().iterator())); ((Iterator) (ab1)).hasNext(); y.e(a).a(bu1))
	//*  54  114:aload_1         
	//*  55  115:invokevirtual   #84  <Method Set bt.a()>
	//*  56  118:invokeinterface #90  <Method Iterator Set.iterator()>
	//*  57  123:astore_1        
	//*  58  124:aload_1         
	//*  59  125:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//*  60  130:ifeq            159
				bu1 = (bu)((Iterator) (ab1)).next();
	//   61  133:aload_1         
	//   62  134:invokeinterface #99  <Method Object Iterator.next()>
	//   63  139:checkcast       #101 <Class bu>
	//   64  142:astore_2        

	//   65  143:aload_0         
	//   66  144:getfield        #18  <Field y a>
	//   67  147:invokestatic    #104 <Method q y.e(y)>
	//   68  150:aload_2         
	//   69  151:invokeinterface #109 <Method void q.a(bu)>
		}
	//*  70  156:goto            124
	//   71  159:return          
	}

	public void trigger(Object obj)
	{
		a((ab)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class ab>
	//    3    5:invokevirtual   #113 <Method void a(ab)>
	//    4    8:return          
	}

	final y a;

	y$5(y y1)
	{
		a = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field y a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
