// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			ReflectiveGenericLifecycleObserver

static class ReflectiveGenericLifecycleObserver$a
{

	final Map a = new HashMap();
	final Map b;

	ReflectiveGenericLifecycleObserver$a(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Map b>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void HashMap()>
	//    9   17:putfield        #23  <Field Map a>
		java.util.Map.Entry entry;
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((List) (map)).add(entry.getKey()))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #29  <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #35  <Method Iterator Set.iterator()>
	//*  13   31:astore_3        
	//*  14   32:aload_3         
	//*  15   33:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            123
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   17   41:aload_3         
	//   18   42:invokeinterface #45  <Method Object Iterator.next()>
	//   19   47:checkcast       #47  <Class java.util.Map$Entry>
	//   20   50:astore          4
			b.a a1 = (b.a)entry.getValue();
	//   21   52:aload           4
	//   22   54:invokeinterface #50  <Method Object java.util.Map$Entry.getValue()>
	//   23   59:checkcast       #52  <Class b$a>
	//   24   62:astore          5
			List list = (List)a.get(((Object) (a1)));
	//   25   64:aload_0         
	//   26   65:getfield        #23  <Field Map a>
	//   27   68:aload           5
	//   28   70:invokeinterface #56  <Method Object Map.get(Object)>
	//   29   75:checkcast       #58  <Class List>
	//   30   78:astore_2        
			map = ((Map) (list));
	//   31   79:aload_2         
	//   32   80:astore_1        
			if(list == null)
	//*  33   81:aload_2         
	//*  34   82:ifnonnull       106
			{
				map = ((Map) (new ArrayList()));
	//   35   85:new             #60  <Class ArrayList>
	//   36   88:dup             
	//   37   89:invokespecial   #61  <Method void ArrayList()>
	//   38   92:astore_1        
				a.put(((Object) (a1)), ((Object) (map)));
	//   39   93:aload_0         
	//   40   94:getfield        #23  <Field Map a>
	//   41   97:aload           5
	//   42   99:aload_1         
	//   43  100:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   44  105:pop             
			}
		}

	//   45  106:aload_1         
	//   46  107:aload           4
	//   47  109:invokeinterface #68  <Method Object java.util.Map$Entry.getKey()>
	//   48  114:invokeinterface #72  <Method boolean List.add(Object)>
	//   49  119:pop             
	//*  50  120:goto            32
	//   51  123:return          
	}
}
