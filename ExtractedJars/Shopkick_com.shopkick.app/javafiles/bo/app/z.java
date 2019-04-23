// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.Activity;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;

// Referenced classes of package bo.app:
//			aa, dg

public class z
	implements aa
{

	public z(Executor executor, dg dg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #46  <Field ConcurrentMap b>
	//    7   15:aload_0         
	//    8   16:new             #43  <Class ConcurrentHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #44  <Method void ConcurrentHashMap()>
	//   11   23:putfield        #48  <Field ConcurrentMap c>
	//   12   26:aload_0         
	//   13   27:new             #43  <Class ConcurrentHashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #44  <Method void ConcurrentHashMap()>
	//   16   34:putfield        #50  <Field ConcurrentMap d>
	//   17   37:aload_0         
	//   18   38:new             #4   <Class Object>
	//   19   41:dup             
	//   20   42:invokespecial   #41  <Method void Object()>
	//   21   45:putfield        #52  <Field Object g>
	//   22   48:aload_0         
	//   23   49:new             #4   <Class Object>
	//   24   52:dup             
	//   25   53:invokespecial   #41  <Method void Object()>
	//   26   56:putfield        #54  <Field Object h>
	//   27   59:aload_0         
	//   28   60:new             #4   <Class Object>
	//   29   63:dup             
	//   30   64:invokespecial   #41  <Method void Object()>
	//   31   67:putfield        #56  <Field Object i>
		e = executor;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #58  <Field Executor e>
		f = dg1;
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:putfield        #60  <Field dg f>
	//   38   80:return          
	}

	static CopyOnWriteArraySet a(z z1, Class class1, CopyOnWriteArraySet copyonwritearrayset)
	{
		return z1.a(class1, copyonwritearrayset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #64  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//    4    6:areturn         
	}

	private CopyOnWriteArraySet a(Class class1, CopyOnWriteArraySet copyonwritearrayset)
	{
		CopyOnWriteArraySet copyonwritearrayset1 = (CopyOnWriteArraySet)copyonwritearrayset;
	//    0    0:aload_2         
	//    1    1:checkcast       #66  <Class CopyOnWriteArraySet>
	//    2    4:astore_3        
		String s = a;
	//    3    5:getstatic       #36  <Field String a>
	//    4    8:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #68  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #69  <Method void StringBuilder()>
	//    8   17:astore          5
		stringbuilder.append("Triggering ");
	//    9   19:aload           5
	//   10   21:ldc1            #71  <String "Triggering ">
	//   11   23:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(class1.getName());
	//   13   27:aload           5
	//   14   29:aload_1         
	//   15   30:invokevirtual   #81  <Method String Class.getName()>
	//   16   33:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		stringbuilder.append(" on ");
	//   18   37:aload           5
	//   19   39:ldc1            #83  <String " on ">
	//   20   41:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(copyonwritearrayset.size());
	//   22   45:aload           5
	//   23   47:aload_2         
	//   24   48:invokevirtual   #87  <Method int CopyOnWriteArraySet.size()>
	//   25   51:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		stringbuilder.append(" subscribers.");
	//   27   55:aload           5
	//   28   57:ldc1            #92  <String " subscribers.">
	//   29   59:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		AppboyLogger.d(s, stringbuilder.toString(), false);
	//   31   63:aload           4
	//   32   65:aload           5
	//   33   67:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   34   70:iconst_0        
	//   35   71:invokestatic    #98  <Method int AppboyLogger.d(String, String, boolean)>
	//   36   74:pop             
		return copyonwritearrayset1;
	//   37   75:aload_3         
	//   38   76:areturn         
	}

	private boolean a(IEventSubscriber ieventsubscriber, Class class1, ConcurrentMap concurrentmap)
	{
		if(ieventsubscriber == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       62
		{
			if(class1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
				ieventsubscriber = "null eventClass";
	//    4    8:ldc1            #103 <String "null eventClass">
	//    5   10:astore_1        
			else
	//*   6   11:goto            19
				ieventsubscriber = ((IEventSubscriber) (class1.getName()));
	//    7   14:aload_2         
	//    8   15:invokevirtual   #81  <Method String Class.getName()>
	//    9   18:astore_1        
			class1 = ((Class) (a));
	//   10   19:getstatic       #36  <Field String a>
	//   11   22:astore_2        
			concurrentmap = ((ConcurrentMap) (new StringBuilder()));
	//   12   23:new             #68  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #69  <Method void StringBuilder()>
	//   15   30:astore_3        
			((StringBuilder) (concurrentmap)).append("Error: Attempted to add a null subscriber for eventClass ");
	//   16   31:aload_3         
	//   17   32:ldc1            #105 <String "Error: Attempted to add a null subscriber for eventClass ">
	//   18   34:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			((StringBuilder) (concurrentmap)).append(((String) (ieventsubscriber)));
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			((StringBuilder) (concurrentmap)).append(". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.");
	//   24   44:aload_3         
	//   25   45:ldc1            #107 <String ". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.">
	//   26   47:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			AppboyLogger.e(((String) (class1)), ((StringBuilder) (concurrentmap)).toString());
	//   28   51:aload_2         
	//   29   52:aload_3         
	//   30   53:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   31   56:invokestatic    #110 <Method int AppboyLogger.e(String, String)>
	//   32   59:pop             
			return false;
	//   33   60:iconst_0        
	//   34   61:ireturn         
		}
		CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)concurrentmap.get(((Object) (class1)));
	//   35   62:aload_3         
	//   36   63:aload_2         
	//   37   64:invokeinterface #116 <Method Object ConcurrentMap.get(Object)>
	//   38   69:checkcast       #66  <Class CopyOnWriteArraySet>
	//   39   72:astore          5
		Object obj = ((Object) (copyonwritearrayset));
	//   40   74:aload           5
	//   41   76:astore          4
		if(copyonwritearrayset == null)
	//*  42   78:aload           5
	//*  43   80:ifnonnull       115
		{
			obj = ((Object) (new CopyOnWriteArraySet()));
	//   44   83:new             #66  <Class CopyOnWriteArraySet>
	//   45   86:dup             
	//   46   87:invokespecial   #117 <Method void CopyOnWriteArraySet()>
	//   47   90:astore          4
			class1 = ((Class) ((CopyOnWriteArraySet)concurrentmap.putIfAbsent(((Object) (class1)), obj)));
	//   48   92:aload_3         
	//   49   93:aload_2         
	//   50   94:aload           4
	//   51   96:invokeinterface #121 <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   52  101:checkcast       #66  <Class CopyOnWriteArraySet>
	//   53  104:astore_2        
			if(class1 != null)
	//*  54  105:aload_2         
	//*  55  106:ifnonnull       112
	//*  56  109:goto            115
				obj = ((Object) (class1));
	//   57  112:aload_2         
	//   58  113:astore          4
		}
		return ((CopyOnWriteArraySet) (obj)).add(((Object) (ieventsubscriber)));
	//   59  115:aload           4
	//   60  117:aload_1         
	//   61  118:invokevirtual   #125 <Method boolean CopyOnWriteArraySet.add(Object)>
	//   62  121:ireturn         
	}

	private boolean a(CopyOnWriteArraySet copyonwritearrayset, IEventSubscriber ieventsubscriber)
	{
		return copyonwritearrayset != null && ieventsubscriber != null && copyonwritearrayset.remove(((Object) (ieventsubscriber)));
	//    0    0:aload_1         
	//    1    1:ifnull          18
	//    2    4:aload_2         
	//    3    5:ifnull          18
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #130 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void a()
	{
		synchronized(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Object h>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			c.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field ConcurrentMap c>
	//    7   11:invokeinterface #134 <Method void ConcurrentMap.clear()>
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		synchronized(i)
	//*  10   18:aload_0         
	//*  11   19:getfield        #56  <Field Object i>
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:monitorenter    
		{
			d.clear();
	//   15   25:aload_0         
	//   16   26:getfield        #50  <Field ConcurrentMap d>
	//   17   29:invokeinterface #134 <Method void ConcurrentMap.clear()>
		}
	//   18   34:aload_1         
	//   19   35:monitorexit     
		synchronized(g)
	//*  20   36:aload_0         
	//*  21   37:getfield        #52  <Field Object g>
	//*  22   40:astore_1        
	//*  23   41:aload_1         
	//*  24   42:monitorenter    
		{
			b.clear();
	//   25   43:aload_0         
	//   26   44:getfield        #46  <Field ConcurrentMap b>
	//   27   47:invokeinterface #134 <Method void ConcurrentMap.clear()>
		}
	//   28   52:aload_1         
	//   29   53:monitorexit     
		return;
	//   30   54:return          
		exception;
	//   31   55:astore_2        
		obj;
	//   32   56:aload_1         
		JVM INSTR monitorexit ;
	//   33   57:monitorexit     
		throw exception;
	//   34   58:aload_2         
	//   35   59:athrow          
		exception1;
	//   36   60:astore_2        
		obj;
	//   37   61:aload_1         
		JVM INSTR monitorexit ;
	//   38   62:monitorexit     
		throw exception1;
	//   39   63:aload_2         
	//   40   64:athrow          
		exception2;
	//   41   65:astore_2        
		obj;
	//   42   66:aload_1         
		JVM INSTR monitorexit ;
	//   43   67:monitorexit     
		throw exception2;
	//   44   68:aload_2         
	//   45   69:athrow          
	}

	public void a(Object obj, Class class1)
	{
		if(f.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field dg f>
	//*   2    4:invokevirtual   #140 <Method boolean dg.a()>
	//*   3    7:ifeq            72
		{
			String s = a;
	//    4   10:getstatic       #36  <Field String a>
	//    5   13:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//    6   15:new             #68  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #69  <Method void StringBuilder()>
	//    9   22:astore          6
			stringbuilder.append("SDK is disabled. Not publishing event class: ");
	//   10   24:aload           6
	//   11   26:ldc1            #142 <String "SDK is disabled. Not publishing event class: ">
	//   12   28:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
			stringbuilder.append(class1.getName());
	//   14   32:aload           6
	//   15   34:aload_2         
	//   16   35:invokevirtual   #81  <Method String Class.getName()>
	//   17   38:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			stringbuilder.append(" and message: ");
	//   19   42:aload           6
	//   20   44:ldc1            #144 <String " and message: ">
	//   21   46:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			stringbuilder.append(obj.toString());
	//   23   50:aload           6
	//   24   52:aload_1         
	//   25   53:invokevirtual   #145 <Method String Object.toString()>
	//   26   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   28   60:aload           5
	//   29   62:aload           6
	//   30   64:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   31   67:invokestatic    #147 <Method int AppboyLogger.d(String, String)>
	//   32   70:pop             
			return;
	//   33   71:return          
		}
		Object obj1 = ((Object) (a));
	//   34   72:getstatic       #36  <Field String a>
	//   35   75:astore          5
		Object obj2 = ((Object) (new StringBuilder()));
	//   36   77:new             #68  <Class StringBuilder>
	//   37   80:dup             
	//   38   81:invokespecial   #69  <Method void StringBuilder()>
	//   39   84:astore          6
		((StringBuilder) (obj2)).append(class1.getName());
	//   40   86:aload           6
	//   41   88:aload_2         
	//   42   89:invokevirtual   #81  <Method String Class.getName()>
	//   43   92:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44   95:pop             
		((StringBuilder) (obj2)).append(" fired: ");
	//   45   96:aload           6
	//   46   98:ldc1            #149 <String " fired: ">
	//   47  100:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   48  103:pop             
		((StringBuilder) (obj2)).append(obj.toString());
	//   49  104:aload           6
	//   50  106:aload_1         
	//   51  107:invokevirtual   #145 <Method String Object.toString()>
	//   52  110:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   53  113:pop             
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//   54  114:aload           6
	//   55  116:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   56  119:astore          6
		boolean flag1 = false;
	//   57  121:iconst_0        
	//   58  122:istore          4
		AppboyLogger.d(((String) (obj1)), ((String) (obj2)), false);
	//   59  124:aload           5
	//   60  126:aload           6
	//   61  128:iconst_0        
	//   62  129:invokestatic    #98  <Method int AppboyLogger.d(String, String, boolean)>
	//   63  132:pop             
		obj1 = ((Object) (b.entrySet().iterator()));
	//   64  133:aload_0         
	//   65  134:getfield        #46  <Field ConcurrentMap b>
	//   66  137:invokeinterface #153 <Method Set ConcurrentMap.entrySet()>
	//   67  142:invokeinterface #159 <Method Iterator Set.iterator()>
	//   68  147:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   69  149:aload           5
	//   70  151:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//   71  156:ifeq            236
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   72  159:aload           5
	//   73  161:invokeinterface #168 <Method Object Iterator.next()>
	//   74  166:checkcast       #170 <Class java.util.Map$Entry>
	//   75  169:astore          6
			CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)((ConcurrentMap)entry.getValue()).get(((Object) (class1)));
	//   76  171:aload           6
	//   77  173:invokeinterface #173 <Method Object java.util.Map$Entry.getValue()>
	//   78  178:checkcast       #112 <Class ConcurrentMap>
	//   79  181:aload_2         
	//   80  182:invokeinterface #116 <Method Object ConcurrentMap.get(Object)>
	//   81  187:checkcast       #66  <Class CopyOnWriteArraySet>
	//   82  190:astore          7
			if(copyonwritearrayset != null && !copyonwritearrayset.isEmpty())
	//*  83  192:aload           7
	//*  84  194:ifnull          149
	//*  85  197:aload           7
	//*  86  199:invokevirtual   #176 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//*  87  202:ifne            149
			{
				((Activity)entry.getKey()).runOnUiThread(new Runnable(class1, copyonwritearrayset, obj) {

					public void run()
					{
						for(Iterator iterator2 = z.a(d, a, b).iterator(); iterator2.hasNext(); ((IEventSubscriber)iterator2.next()).trigger(c));
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

			
			{
				d = z.this;
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
);
	//   88  205:aload           6
	//   89  207:invokeinterface #179 <Method Object java.util.Map$Entry.getKey()>
	//   90  212:checkcast       #181 <Class Activity>
	//   91  215:new             #8   <Class z$1>
	//   92  218:dup             
	//   93  219:aload_0         
	//   94  220:aload_2         
	//   95  221:aload           7
	//   96  223:aload_1         
	//   97  224:invokespecial   #184 <Method void z$1(z, Class, CopyOnWriteArraySet, Object)>
	//   98  227:invokevirtual   #188 <Method void Activity.runOnUiThread(Runnable)>
				flag1 = true;
	//   99  230:iconst_1        
	//  100  231:istore          4
			}
		} while(true);
	//  101  233:goto            149
		obj1 = ((Object) ((CopyOnWriteArraySet)c.get(((Object) (class1)))));
	//  102  236:aload_0         
	//  103  237:getfield        #48  <Field ConcurrentMap c>
	//  104  240:aload_2         
	//  105  241:invokeinterface #116 <Method Object ConcurrentMap.get(Object)>
	//  106  246:checkcast       #66  <Class CopyOnWriteArraySet>
	//  107  249:astore          5
		boolean flag = flag1;
	//  108  251:iload           4
	//  109  253:istore_3        
		if(obj1 != null)
	//* 110  254:aload           5
	//* 111  256:ifnull          329
		{
			IEventSubscriber ieventsubscriber;
			for(Iterator iterator = a(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); iterator.hasNext(); e.execute(new Runnable(ieventsubscriber, obj) {

		public void run()
		{
			a.trigger(b);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field IEventSubscriber a>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field Object b>
		//    4    8:invokeinterface #35  <Method void IEventSubscriber.trigger(Object)>
		//    5   13:return          
		}

		final IEventSubscriber a;
		final Object b;
		final z c;

			
			{
				c = z.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field z c>
				a = ieventsubscriber;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field IEventSubscriber a>
				b = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field Object b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
	}
))
	//* 112  259:aload_0         
	//* 113  260:aload_2         
	//* 114  261:aload           5
	//* 115  263:invokespecial   #64  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//* 116  266:invokevirtual   #189 <Method Iterator CopyOnWriteArraySet.iterator()>
	//* 117  269:astore          6
	//* 118  271:aload           6
	//* 119  273:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//* 120  278:ifeq            316
				ieventsubscriber = (IEventSubscriber)iterator.next();
	//  121  281:aload           6
	//  122  283:invokeinterface #168 <Method Object Iterator.next()>
	//  123  288:checkcast       #191 <Class IEventSubscriber>
	//  124  291:astore          7

	//  125  293:aload_0         
	//  126  294:getfield        #58  <Field Executor e>
	//  127  297:new             #10  <Class z$2>
	//  128  300:dup             
	//  129  301:aload_0         
	//  130  302:aload           7
	//  131  304:aload_1         
	//  132  305:invokespecial   #194 <Method void z$2(z, IEventSubscriber, Object)>
	//  133  308:invokeinterface #199 <Method void Executor.execute(Runnable)>
	//* 134  313:goto            271
			flag = flag1;
	//  135  316:iload           4
	//  136  318:istore_3        
			if(!((CopyOnWriteArraySet) (obj1)).isEmpty())
	//* 137  319:aload           5
	//* 138  321:invokevirtual   #176 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//* 139  324:ifne            329
				flag = true;
	//  140  327:iconst_1        
	//  141  328:istore_3        
		}
		obj1 = ((Object) ((CopyOnWriteArraySet)d.get(((Object) (class1)))));
	//  142  329:aload_0         
	//  143  330:getfield        #50  <Field ConcurrentMap d>
	//  144  333:aload_2         
	//  145  334:invokeinterface #116 <Method Object ConcurrentMap.get(Object)>
	//  146  339:checkcast       #66  <Class CopyOnWriteArraySet>
	//  147  342:astore          5
		flag1 = flag;
	//  148  344:iload_3         
	//  149  345:istore          4
		if(obj1 != null)
	//* 150  347:aload           5
	//* 151  349:ifnull          407
		{
			for(Iterator iterator1 = a(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); iterator1.hasNext(); ((IEventSubscriber)iterator1.next()).trigger(obj));
	//  152  352:aload_0         
	//  153  353:aload_2         
	//  154  354:aload           5
	//  155  356:invokespecial   #64  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//  156  359:invokevirtual   #189 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  157  362:astore          6
	//  158  364:aload           6
	//  159  366:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//  160  371:ifeq            393
	//  161  374:aload           6
	//  162  376:invokeinterface #168 <Method Object Iterator.next()>
	//  163  381:checkcast       #191 <Class IEventSubscriber>
	//  164  384:aload_1         
	//  165  385:invokeinterface #203 <Method void IEventSubscriber.trigger(Object)>
	//* 166  390:goto            364
			flag1 = flag;
	//  167  393:iload_3         
	//  168  394:istore          4
			if(!((CopyOnWriteArraySet) (obj1)).isEmpty())
	//* 169  396:aload           5
	//* 170  398:invokevirtual   #176 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//* 171  401:ifne            407
				flag1 = true;
	//  172  404:iconst_1        
	//  173  405:istore          4
		}
		if(!flag1 && ((Object) (class1)).equals(com/appboy/events/InAppMessageEvent))
	//* 174  407:iload           4
	//* 175  409:ifne            493
	//* 176  412:aload_2         
	//* 177  413:ldc1            #205 <Class InAppMessageEvent>
	//* 178  415:invokevirtual   #208 <Method boolean Object.equals(Object)>
	//* 179  418:ifeq            493
		{
			AppboyLogger.i(a, "***********************************************************************************************");
	//  180  421:getstatic       #36  <Field String a>
	//  181  424:ldc1            #210 <String "***********************************************************************************************">
	//  182  426:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  183  429:pop             
			AppboyLogger.i(a, "**                                       !! WARNING !!                                       **");
	//  184  430:getstatic       #36  <Field String a>
	//  185  433:ldc1            #214 <String "**                                       !! WARNING !!                                       **">
	//  186  435:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  187  438:pop             
			AppboyLogger.i(a, "**             InAppMessageEvent was published, but no subscribers were found.               **");
	//  188  439:getstatic       #36  <Field String a>
	//  189  442:ldc1            #216 <String "**             InAppMessageEvent was published, but no subscribers were found.               **">
	//  190  444:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  191  447:pop             
			AppboyLogger.i(a, "**  This is likely an integration error. Please ensure that the AppboyInAppMessageManager is **");
	//  192  448:getstatic       #36  <Field String a>
	//  193  451:ldc1            #218 <String "**  This is likely an integration error. Please ensure that the AppboyInAppMessageManager is **">
	//  194  453:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  195  456:pop             
			AppboyLogger.i(a, "**               registered as early as possible. Additionally, be sure to call              **");
	//  196  457:getstatic       #36  <Field String a>
	//  197  460:ldc1            #220 <String "**               registered as early as possible. Additionally, be sure to call              **">
	//  198  462:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  199  465:pop             
			AppboyLogger.i(a, "**       AppboyInAppMessageManager.ensureSubscribedToInAppMessageEvents(Context) in your     **");
	//  200  466:getstatic       #36  <Field String a>
	//  201  469:ldc1            #222 <String "**       AppboyInAppMessageManager.ensureSubscribedToInAppMessageEvents(Context) in your     **">
	//  202  471:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  203  474:pop             
			AppboyLogger.i(a, "**          Application onCreate() to avoid losing any in-app messages in the future.        **");
	//  204  475:getstatic       #36  <Field String a>
	//  205  478:ldc1            #224 <String "**          Application onCreate() to avoid losing any in-app messages in the future.        **">
	//  206  480:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  207  483:pop             
			AppboyLogger.i(a, "***********************************************************************************************");
	//  208  484:getstatic       #36  <Field String a>
	//  209  487:ldc1            #210 <String "***********************************************************************************************">
	//  210  489:invokestatic    #212 <Method int AppboyLogger.i(String, String)>
	//  211  492:pop             
		}
	//  212  493:return          
	}

	public boolean a(IEventSubscriber ieventsubscriber, Class class1)
	{
		boolean flag;
		synchronized(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Object h>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			flag = a(ieventsubscriber, class1, c);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #48  <Field ConcurrentMap c>
	//   10   16:invokespecial   #228 <Method boolean a(IEventSubscriber, Class, ConcurrentMap)>
	//   11   19:istore_3        
		}
	//   12   20:aload           4
	//   13   22:monitorexit     
		return flag;
	//   14   23:iload_3         
	//   15   24:ireturn         
		ieventsubscriber;
	//   16   25:astore_1        
		obj;
	//   17   26:aload           4
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw ieventsubscriber;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public boolean b(IEventSubscriber ieventsubscriber, Class class1)
	{
		boolean flag;
		synchronized(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Object h>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			flag = a((CopyOnWriteArraySet)c.get(((Object) (class1))), ieventsubscriber);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field ConcurrentMap c>
	//    8   14:aload_2         
	//    9   15:invokeinterface #116 <Method Object ConcurrentMap.get(Object)>
	//   10   20:checkcast       #66  <Class CopyOnWriteArraySet>
	//   11   23:aload_1         
	//   12   24:invokespecial   #231 <Method boolean a(CopyOnWriteArraySet, IEventSubscriber)>
	//   13   27:istore_3        
		}
	//   14   28:aload           4
	//   15   30:monitorexit     
		return flag;
	//   16   31:iload_3         
	//   17   32:ireturn         
		ieventsubscriber;
	//   18   33:astore_1        
		obj;
	//   19   34:aload           4
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw ieventsubscriber;
	//   21   37:aload_1         
	//   22   38:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/z);
	private final ConcurrentMap b = new ConcurrentHashMap();
	private final ConcurrentMap c = new ConcurrentHashMap();
	private final ConcurrentMap d = new ConcurrentHashMap();
	private final Executor e;
	private final dg f;
	private final Object g = new Object();
	private final Object h = new Object();
	private final Object i = new Object();

	static 
	{
	//    0    0:ldc1            #2   <Class z>
	//    1    2:invokestatic    #34  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #36  <Field String a>
	//*   3    8:return          
	}
}
