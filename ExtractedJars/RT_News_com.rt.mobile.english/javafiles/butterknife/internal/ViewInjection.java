// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import java.util.*;

// Referenced classes of package butterknife.internal:
//			ViewBinding, ListenerBinding, ListenerClass, ListenerMethod

final class ViewInjection
{

	ViewInjection(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class LinkedHashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void LinkedHashSet()>
	//    6   12:putfield        #22  <Field Set viewBindings>
	//    7   15:aload_0         
	//    8   16:new             #24  <Class LinkedHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #25  <Method void LinkedHashMap()>
	//   11   23:putfield        #27  <Field LinkedHashMap listenerBindings>
		id = i;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:putfield        #29  <Field int id>
	//   15   31:return          
	}

	public void addListenerBinding(ListenerClass listenerclass, ListenerMethod listenermethod, ListenerBinding listenerbinding)
	{
		Object obj = ((Object) ((Map)listenerBindings.get(((Object) (listenerclass)))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LinkedHashMap listenerBindings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method Object LinkedHashMap.get(Object)>
	//    4    8:checkcast       #38  <Class Map>
	//    5   11:astore          4
		if(obj == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       43
		{
			obj = ((Object) (new LinkedHashMap()));
	//    8   18:new             #24  <Class LinkedHashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #25  <Method void LinkedHashMap()>
	//   11   25:astore          4
			listenerBindings.put(((Object) (listenerclass)), obj);
	//   12   27:aload_0         
	//   13   28:getfield        #27  <Field LinkedHashMap listenerBindings>
	//   14   31:aload_1         
	//   15   32:aload           4
	//   16   34:invokevirtual   #42  <Method Object LinkedHashMap.put(Object, Object)>
	//   17   37:pop             
			listenerclass = null;
	//   18   38:aconst_null     
	//   19   39:astore_1        
		} else
	//*  20   40:goto            55
		{
			listenerclass = ((ListenerClass) ((Set)((Map) (obj)).get(((Object) (listenermethod)))));
	//   21   43:aload           4
	//   22   45:aload_2         
	//   23   46:invokeinterface #43  <Method Object Map.get(Object)>
	//   24   51:checkcast       #45  <Class Set>
	//   25   54:astore_1        
		}
		Object obj1 = ((Object) (listenerclass));
	//   26   55:aload_1         
	//   27   56:astore          5
		if(listenerclass == null)
	//*  28   58:aload_1         
	//*  29   59:ifnonnull       82
		{
			obj1 = ((Object) (new LinkedHashSet()));
	//   30   62:new             #19  <Class LinkedHashSet>
	//   31   65:dup             
	//   32   66:invokespecial   #20  <Method void LinkedHashSet()>
	//   33   69:astore          5
			((Map) (obj)).put(((Object) (listenermethod)), obj1);
	//   34   71:aload           4
	//   35   73:aload_2         
	//   36   74:aload           5
	//   37   76:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   38   81:pop             
		}
		((Set) (obj1)).add(((Object) (listenerbinding)));
	//   39   82:aload           5
	//   40   84:aload_3         
	//   41   85:invokeinterface #50  <Method boolean Set.add(Object)>
	//   42   90:pop             
	//   43   91:return          
	}

	public void addViewBinding(ViewBinding viewbinding)
	{
		viewBindings.add(((Object) (viewbinding)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Set viewBindings>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int id>
	//    2    4:ireturn         
	}

	public Map getListenerBindings()
	{
		return ((Map) (listenerBindings));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LinkedHashMap listenerBindings>
	//    2    4:areturn         
	}

	public List getRequiredBindings()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #62  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = viewBindings.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Set viewBindings>
	//    6   12:invokeinterface #67  <Method Iterator Set.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            55
			ViewBinding viewbinding = (ViewBinding)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #77  <Method Object Iterator.next()>
	//   13   33:checkcast       #79  <Class ViewBinding>
	//   14   36:astore_3        
			if(viewbinding.isRequired())
	//*  15   37:aload_3         
	//*  16   38:invokevirtual   #82  <Method boolean ViewBinding.isRequired()>
	//*  17   41:ifeq            18
				((List) (arraylist)).add(((Object) (viewbinding)));
	//   18   44:aload_1         
	//   19   45:aload_3         
	//   20   46:invokeinterface #85  <Method boolean List.add(Object)>
	//   21   51:pop             
		} while(true);
	//   22   52:goto            18
		for(Iterator iterator1 = listenerBindings.values().iterator(); iterator1.hasNext();)
	//*  23   55:aload_0         
	//*  24   56:getfield        #27  <Field LinkedHashMap listenerBindings>
	//*  25   59:invokevirtual   #89  <Method Collection LinkedHashMap.values()>
	//*  26   62:invokeinterface #92  <Method Iterator Collection.iterator()>
	//*  27   67:astore_2        
	//*  28   68:aload_2         
	//*  29   69:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  30   74:ifeq            164
		{
			Iterator iterator2 = ((Map)iterator1.next()).values().iterator();
	//   31   77:aload_2         
	//   32   78:invokeinterface #77  <Method Object Iterator.next()>
	//   33   83:checkcast       #38  <Class Map>
	//   34   86:invokeinterface #93  <Method Collection Map.values()>
	//   35   91:invokeinterface #92  <Method Iterator Collection.iterator()>
	//   36   96:astore_3        
			while(iterator2.hasNext()) 
	//*  37   97:aload_3         
	//*  38   98:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  39  103:ifeq            68
			{
				Iterator iterator3 = ((Set)iterator2.next()).iterator();
	//   40  106:aload_3         
	//   41  107:invokeinterface #77  <Method Object Iterator.next()>
	//   42  112:checkcast       #45  <Class Set>
	//   43  115:invokeinterface #67  <Method Iterator Set.iterator()>
	//   44  120:astore          4
				while(iterator3.hasNext()) 
	//*  45  122:aload           4
	//*  46  124:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  47  129:ifeq            97
				{
					ListenerBinding listenerbinding = (ListenerBinding)iterator3.next();
	//   48  132:aload           4
	//   49  134:invokeinterface #77  <Method Object Iterator.next()>
	//   50  139:checkcast       #95  <Class ListenerBinding>
	//   51  142:astore          5
					if(listenerbinding.isRequired())
	//*  52  144:aload           5
	//*  53  146:invokevirtual   #96  <Method boolean ListenerBinding.isRequired()>
	//*  54  149:ifeq            122
						((List) (arraylist)).add(((Object) (listenerbinding)));
	//   55  152:aload_1         
	//   56  153:aload           5
	//   57  155:invokeinterface #85  <Method boolean List.add(Object)>
	//   58  160:pop             
				}
			}
		}

	//*  59  161:goto            122
		return ((List) (arraylist));
	//   60  164:aload_1         
	//   61  165:areturn         
	}

	public Collection getViewBindings()
	{
		return ((Collection) (viewBindings));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Set viewBindings>
	//    2    4:areturn         
	}

	public boolean hasListenerBinding(ListenerClass listenerclass, ListenerMethod listenermethod)
	{
		listenerclass = ((ListenerClass) ((Map)listenerBindings.get(((Object) (listenerclass)))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LinkedHashMap listenerBindings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method Object LinkedHashMap.get(Object)>
	//    4    8:checkcast       #38  <Class Map>
	//    5   11:astore_1        
		return listenerclass != null && ((Map) (listenerclass)).containsKey(((Object) (listenermethod)));
	//    6   12:aload_1         
	//    7   13:ifnull          28
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #104 <Method boolean Map.containsKey(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private final int id;
	private final LinkedHashMap listenerBindings = new LinkedHashMap();
	private final Set viewBindings = new LinkedHashSet();
}
