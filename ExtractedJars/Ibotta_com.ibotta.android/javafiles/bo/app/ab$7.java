// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//			ab, ae, db, cm, 
//			dx, do, ea, ca, 
//			cc, t

class ab$7
	implements IEventSubscriber
{

	public void a(ae ae1)
	{
		ae1 = ((ae) (ae1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method db ae.a()>
	//    2    4:astore_1        
		Object obj = ((Object) (((db) (ae1)).e()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #34  <Method cm db.e()>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          55
		{
			if(((cm) (obj)).d())
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #40  <Method boolean cm.d()>
	//*  10   20:ifeq            37
			{
				a.c();
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field ab a>
	//   13   27:invokevirtual   #43  <Method void ab.c()>
				a.d();
	//   14   30:aload_0         
	//   15   31:getfield        #18  <Field ab a>
	//   16   34:invokevirtual   #45  <Method void ab.d()>
			}
			if(((cm) (obj)).c())
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #47  <Method boolean cm.c()>
	//*  19   41:ifeq            55
				ab.a(a).a(true);
	//   20   44:aload_0         
	//   21   45:getfield        #18  <Field ab a>
	//   22   48:invokestatic    #50  <Method dx ab.a(ab)>
	//   23   51:iconst_1        
	//   24   52:invokevirtual   #55  <Method void dx.a(boolean)>
		}
		obj = ((Object) (((db) (ae1)).c()));
	//   25   55:aload_1         
	//   26   56:invokeinterface #58  <Method ck db.c()>
	//   27   61:astore_2        
		if(obj != null)
	//*  28   62:aload_2         
	//*  29   63:ifnull          79
			ab.b(a).b(obj, false);
	//   30   66:aload_0         
	//   31   67:getfield        #18  <Field ab a>
	//   32   70:invokestatic    #61  <Method do ab.b(ab)>
	//   33   73:aload_2         
	//   34   74:iconst_0        
	//   35   75:invokevirtual   #66  <Method boolean do.b(Object, boolean)>
	//   36   78:pop             
		obj = ((Object) (((db) (ae1)).d()));
	//   37   79:aload_1         
	//   38   80:invokeinterface #69  <Method cn db.d()>
	//   39   85:astore_2        
		if(obj != null)
	//*  40   86:aload_2         
	//*  41   87:ifnull          103
			ab.c(a).b(obj, false);
	//   42   90:aload_0         
	//   43   91:getfield        #18  <Field ab a>
	//   44   94:invokestatic    #72  <Method ea ab.c(ab)>
	//   45   97:aload_2         
	//   46   98:iconst_0        
	//   47   99:invokevirtual   #75  <Method boolean ea.b(Object, boolean)>
	//   48  102:pop             
		ae1 = ((ae) (((db) (ae1)).f()));
	//   49  103:aload_1         
	//   50  104:invokeinterface #79  <Method ca db.f()>
	//   51  109:astore_1        
		if(ae1 != null)
	//*  52  110:aload_1         
	//*  53  111:ifnull          159
		{
			cc cc1;
			for(ae1 = ((ae) (((ca) (ae1)).a().iterator())); ((Iterator) (ae1)).hasNext(); ab.e(a).a(cc1))
	//*  54  114:aload_1         
	//*  55  115:invokevirtual   #84  <Method Set ca.a()>
	//*  56  118:invokeinterface #90  <Method Iterator Set.iterator()>
	//*  57  123:astore_1        
	//*  58  124:aload_1         
	//*  59  125:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//*  60  130:ifeq            159
				cc1 = (cc)((Iterator) (ae1)).next();
	//   61  133:aload_1         
	//   62  134:invokeinterface #99  <Method Object Iterator.next()>
	//   63  139:checkcast       #101 <Class cc>
	//   64  142:astore_2        

	//   65  143:aload_0         
	//   66  144:getfield        #18  <Field ab a>
	//   67  147:invokestatic    #104 <Method t ab.e(ab)>
	//   68  150:aload_2         
	//   69  151:invokeinterface #109 <Method void t.a(cc)>
		}
	//*  70  156:goto            124
	//   71  159:return          
	}

	public void trigger(Object obj)
	{
		a((ae)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class ae>
	//    3    5:invokevirtual   #113 <Method void a(ae)>
	//    4    8:return          
	}

	final ab a;

	ab$7(ab ab1)
	{
		a = ab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ab a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
