// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package bo.app:
//			z

class z$1
	implements Runnable
{

	public void run()
	{
		for(Iterator iterator = z.a(d, a, b).iterator(); iterator.hasNext(); ((IEventSubscriber)iterator.next()).trigger(c));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field z d>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Class a>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field CopyOnWriteArraySet b>
	//    6   12:invokestatic    #36  <Method CopyOnWriteArraySet z.a(z, Class, CopyOnWriteArraySet)>
	//    7   15:invokevirtual   #42  <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   18:astore_1        
	//    9   19:aload_1         
	//   10   20:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            49
	//   12   28:aload_1         
	//   13   29:invokeinterface #52  <Method Object Iterator.next()>
	//   14   34:checkcast       #54  <Class IEventSubscriber>
	//   15   37:aload_0         
	//   16   38:getfield        #28  <Field Object c>
	//   17   41:invokeinterface #58  <Method void IEventSubscriber.trigger(Object)>
	//*  18   46:goto            19
	//   19   49:return          
	}

	final Class a;
	final CopyOnWriteArraySet b;
	final Object c;
	final z d;

	z$1(z z1, Class class1, CopyOnWriteArraySet copyonwritearrayset, Object obj)
	{
		d = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field z d>
		a = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Class a>
		b = copyonwritearrayset;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field CopyOnWriteArraySet b>
		c = obj;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Object c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
