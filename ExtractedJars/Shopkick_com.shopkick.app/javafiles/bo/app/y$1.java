// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//			y, ac, co, cg, 
//			dh, cz, dj, bt, 
//			bu, bb

class y$1
	implements IEventSubscriber
{

	public void a(ac ac1)
	{
		ac1 = ((ac) (ac1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method co ac.a()>
	//    2    4:astore_1        
		Object obj = ((Object) (((co) (ac1)).e()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #33  <Method cg co.e()>
	//    5   11:astore_2        
		if(obj != null && ((cg) (obj)).c())
	//*   6   12:aload_2         
	//*   7   13:ifnull          34
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #39  <Method boolean cg.c()>
	//*  10   20:ifeq            34
			y.a(a).a(false);
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field y a>
	//   13   27:invokestatic    #42  <Method dh y.a(y)>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #47  <Method void dh.a(boolean)>
		obj = ((Object) (((co) (ac1)).c()));
	//   16   34:aload_1         
	//   17   35:invokeinterface #50  <Method ce co.c()>
	//   18   40:astore_2        
		if(obj != null)
	//*  19   41:aload_2         
	//*  20   42:ifnull          58
			y.b(a).b(obj, true);
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field y a>
	//   23   49:invokestatic    #54  <Method cz y.b(y)>
	//   24   52:aload_2         
	//   25   53:iconst_1        
	//   26   54:invokevirtual   #59  <Method boolean cz.b(Object, boolean)>
	//   27   57:pop             
		obj = ((Object) (((co) (ac1)).d()));
	//   28   58:aload_1         
	//   29   59:invokeinterface #63  <Method ch co.d()>
	//   30   64:astore_2        
		if(obj != null)
	//*  31   65:aload_2         
	//*  32   66:ifnull          82
			y.c(a).b(obj, true);
	//   33   69:aload_0         
	//   34   70:getfield        #17  <Field y a>
	//   35   73:invokestatic    #66  <Method dj y.c(y)>
	//   36   76:aload_2         
	//   37   77:iconst_1        
	//   38   78:invokevirtual   #69  <Method boolean dj.b(Object, boolean)>
	//   39   81:pop             
		ac1 = ((ac) (((co) (ac1)).f()));
	//   40   82:aload_1         
	//   41   83:invokeinterface #73  <Method bt co.f()>
	//   42   88:astore_1        
		if(ac1 != null)
	//*  43   89:aload_1         
	//*  44   90:ifnull          136
		{
			bu bu1;
			for(ac1 = ((ac) (((bt) (ac1)).a().iterator())); ((Iterator) (ac1)).hasNext(); y.d(a).b(bu1))
	//*  45   93:aload_1         
	//*  46   94:invokevirtual   #78  <Method Set bt.a()>
	//*  47   97:invokeinterface #84  <Method Iterator Set.iterator()>
	//*  48  102:astore_1        
	//*  49  103:aload_1         
	//*  50  104:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*  51  109:ifeq            136
				bu1 = (bu)((Iterator) (ac1)).next();
	//   52  112:aload_1         
	//   53  113:invokeinterface #93  <Method Object Iterator.next()>
	//   54  118:checkcast       #95  <Class bu>
	//   55  121:astore_2        

	//   56  122:aload_0         
	//   57  123:getfield        #17  <Field y a>
	//   58  126:invokestatic    #98  <Method bb y.d(y)>
	//   59  129:aload_2         
	//   60  130:invokevirtual   #103 <Method void bb.b(bu)>
		}
	//*  61  133:goto            103
	//   62  136:return          
	}

	public void trigger(Object obj)
	{
		a((ac)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class ac>
	//    3    5:invokevirtual   #107 <Method void a(ac)>
	//    4    8:return          
	}

	final y a;

	y$1(y y1)
	{
		a = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field y a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
