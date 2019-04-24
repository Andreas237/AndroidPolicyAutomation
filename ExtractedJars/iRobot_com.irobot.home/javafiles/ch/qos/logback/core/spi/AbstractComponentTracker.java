// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import java.util.*;

// Referenced classes of package ch.qos.logback.core.spi:
//			ComponentTracker

public abstract class AbstractComponentTracker
	implements ComponentTracker
{
	private static class Entry
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #35  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #35  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((Entry)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class AbstractComponentTracker$Entry>
		//   18   30:astore_1        
			if(key == null)
		//*  19   31:aload_0         
		//*  20   32:getfield        #22  <Field String key>
		//*  21   35:ifnonnull       47
			{
				if(((Entry) (obj)).key != null)
		//*  22   38:aload_1         
		//*  23   39:getfield        #22  <Field String key>
		//*  24   42:ifnull          63
					return false;
		//   25   45:iconst_0        
		//   26   46:ireturn         
			} else
			if(!key.equals(((Object) (((Entry) (obj)).key))))
		//*  27   47:aload_0         
		//*  28   48:getfield        #22  <Field String key>
		//*  29   51:aload_1         
		//*  30   52:getfield        #22  <Field String key>
		//*  31   55:invokevirtual   #39  <Method boolean String.equals(Object)>
		//*  32   58:ifne            63
				return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
			if(component == null)
		//*  35   63:aload_0         
		//*  36   64:getfield        #24  <Field Object component>
		//*  37   67:ifnonnull       79
			{
				if(((Entry) (obj)).component != null)
		//*  38   70:aload_1         
		//*  39   71:getfield        #24  <Field Object component>
		//*  40   74:ifnull          95
					return false;
		//   41   77:iconst_0        
		//   42   78:ireturn         
			} else
			if(!component.equals(((Entry) (obj)).component))
		//*  43   79:aload_0         
		//*  44   80:getfield        #24  <Field Object component>
		//*  45   83:aload_1         
		//*  46   84:getfield        #24  <Field Object component>
		//*  47   87:invokevirtual   #40  <Method boolean Object.equals(Object)>
		//*  48   90:ifne            95
				return false;
		//   49   93:iconst_0        
		//   50   94:ireturn         
			return true;
		//   51   95:iconst_1        
		//   52   96:ireturn         
		}

		public int hashCode()
		{
			return key.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String key>
		//    2    4:invokevirtual   #44  <Method int String.hashCode()>
		//    3    7:ireturn         
		}

		public void setTimestamp(long l)
		{
			timestamp = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #26  <Field long timestamp>
		//    3    5:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #50  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("(");
		//    4    8:aload_1         
		//    5    9:ldc1            #53  <String "(">
		//    6   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(key);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #22  <Field String key>
		//   11   20:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(", ");
		//   13   24:aload_1         
		//   14   25:ldc1            #59  <String ", ">
		//   15   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(component);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #24  <Field Object component>
		//   20   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
		//   21   39:pop             
			stringbuilder.append(")");
		//   22   40:aload_1         
		//   23   41:ldc1            #64  <String ")">
		//   24   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #66  <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		Object component;
		String key;
		long timestamp;

		Entry(String s, Object obj, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			key = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String key>
			component = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object component>
			timestamp = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #26  <Field long timestamp>
		//   11   19:return          
		}
	}

	private static interface RemovalPredicator
	{

		public abstract boolean isSlatedForRemoval(Entry entry, long l);
	}


	public AbstractComponentTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		maxComponents = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <Int 0x7fffffff>
	//    4    7:putfield        #49  <Field int maxComponents>
		timeout = 0x1b7740L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #50  <Long 0x1b7740L>
	//    7   14:putfield        #53  <Field long timeout>
		liveMap = new LinkedHashMap(32, 0.75F, true);
	//    8   17:aload_0         
	//    9   18:new             #55  <Class LinkedHashMap>
	//   10   21:dup             
	//   11   22:bipush          32
	//   12   24:ldc1            #56  <Float 0.75F>
	//   13   26:iconst_1        
	//   14   27:invokespecial   #59  <Method void LinkedHashMap(int, float, boolean)>
	//   15   30:putfield        #61  <Field LinkedHashMap liveMap>
		lingerersMap = new LinkedHashMap(16, 0.75F, true);
	//   16   33:aload_0         
	//   17   34:new             #55  <Class LinkedHashMap>
	//   18   37:dup             
	//   19   38:bipush          16
	//   20   40:ldc1            #56  <Float 0.75F>
	//   21   42:iconst_1        
	//   22   43:invokespecial   #59  <Method void LinkedHashMap(int, float, boolean)>
	//   23   46:putfield        #63  <Field LinkedHashMap lingerersMap>
		lastCheck = 0L;
	//   24   49:aload_0         
	//   25   50:lconst_0        
	//   26   51:putfield        #65  <Field long lastCheck>
		byExcedent = new RemovalPredicator() {

			public boolean isSlatedForRemoval(Entry entry, long l)
			{
				return liveMap.size() > maxComponents;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AbstractComponentTracker this$0>
			//    2    4:getfield        #25  <Field LinkedHashMap AbstractComponentTracker.liveMap>
			//    3    7:invokevirtual   #31  <Method int LinkedHashMap.size()>
			//    4   10:aload_0         
			//    5   11:getfield        #15  <Field AbstractComponentTracker this$0>
			//    6   14:getfield        #35  <Field int AbstractComponentTracker.maxComponents>
			//    7   17:icmple          22
			//    8   20:iconst_1        
			//    9   21:ireturn         
			//   10   22:iconst_0        
			//   11   23:ireturn         
			}

			final AbstractComponentTracker this$0;

			
			{
				this$0 = AbstractComponentTracker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AbstractComponentTracker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   27   54:aload_0         
	//   28   55:new             #9   <Class AbstractComponentTracker$1>
	//   29   58:dup             
	//   30   59:aload_0         
	//   31   60:invokespecial   #68  <Method void AbstractComponentTracker$1(AbstractComponentTracker)>
	//   32   63:putfield        #70  <Field AbstractComponentTracker$RemovalPredicator byExcedent>
		byTimeout = new RemovalPredicator() {

			public boolean isSlatedForRemoval(Entry entry, long l)
			{
				return isEntryStale(entry, l);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AbstractComponentTracker this$0>
			//    2    4:aload_1         
			//    3    5:lload_2         
			//    4    6:invokestatic    #25  <Method boolean AbstractComponentTracker.access$000(AbstractComponentTracker, AbstractComponentTracker$Entry, long)>
			//    5    9:ireturn         
			}

			final AbstractComponentTracker this$0;

			
			{
				this$0 = AbstractComponentTracker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AbstractComponentTracker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   33   66:aload_0         
	//   34   67:new             #11  <Class AbstractComponentTracker$2>
	//   35   70:dup             
	//   36   71:aload_0         
	//   37   72:invokespecial   #71  <Method void AbstractComponentTracker$2(AbstractComponentTracker)>
	//   38   75:putfield        #73  <Field AbstractComponentTracker$RemovalPredicator byTimeout>
		byLingering = new RemovalPredicator() {

			public boolean isSlatedForRemoval(Entry entry, long l)
			{
				return isEntryDoneLingering(entry, l);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AbstractComponentTracker this$0>
			//    2    4:aload_1         
			//    3    5:lload_2         
			//    4    6:invokestatic    #25  <Method boolean AbstractComponentTracker.access$100(AbstractComponentTracker, AbstractComponentTracker$Entry, long)>
			//    5    9:ireturn         
			}

			final AbstractComponentTracker this$0;

			
			{
				this$0 = AbstractComponentTracker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AbstractComponentTracker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   39   78:aload_0         
	//   40   79:new             #13  <Class AbstractComponentTracker$3>
	//   41   82:dup             
	//   42   83:aload_0         
	//   43   84:invokespecial   #74  <Method void AbstractComponentTracker$3(AbstractComponentTracker)>
	//   44   87:putfield        #76  <Field AbstractComponentTracker$RemovalPredicator byLingering>
	//   45   90:return          
	}

	private void genericStaleComponentRemover(LinkedHashMap linkedhashmap, long l, RemovalPredicator removalpredicator)
	{
		linkedhashmap = ((LinkedHashMap) (linkedhashmap.entrySet().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method Set LinkedHashMap.entrySet()>
	//    2    4:invokeinterface #99  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
		do
		{
			if(!((Iterator) (linkedhashmap)).hasNext())
				break;
	//    4   10:aload_1         
	//    5   11:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            69
			Entry entry = (Entry)((java.util.Map.Entry)((Iterator) (linkedhashmap)).next()).getValue();
	//    7   19:aload_1         
	//    8   20:invokeinterface #109 <Method Object Iterator.next()>
	//    9   25:checkcast       #111 <Class java.util.Map$Entry>
	//   10   28:invokeinterface #114 <Method Object java.util.Map$Entry.getValue()>
	//   11   33:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//   12   36:astore          5
			if(!removalpredicator.isSlatedForRemoval(entry, l))
				break;
	//   13   38:aload           4
	//   14   40:aload           5
	//   15   42:lload_2         
	//   16   43:invokeinterface #117 <Method boolean AbstractComponentTracker$RemovalPredicator.isSlatedForRemoval(AbstractComponentTracker$Entry, long)>
	//   17   48:ifeq            69
			((Iterator) (linkedhashmap)).remove();
	//   18   51:aload_1         
	//   19   52:invokeinterface #120 <Method void Iterator.remove()>
			processPriorToRemoval(entry.component);
	//   20   57:aload_0         
	//   21   58:aload           5
	//   22   60:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//   23   63:invokevirtual   #128 <Method void processPriorToRemoval(Object)>
		} while(true);
	//   24   66:goto            10
	//   25   69:return          
	}

	private Entry getFromEitherMap(String s)
	{
		Entry entry = (Entry)liveMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LinkedHashMap liveMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method Object LinkedHashMap.get(Object)>
	//    4    8:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//    5   11:astore_2        
		if(entry != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
			return entry;
	//    8   16:aload_2         
	//    9   17:areturn         
		else
			return (Entry)lingerersMap.get(((Object) (s)));
	//   10   18:aload_0         
	//   11   19:getfield        #63  <Field LinkedHashMap lingerersMap>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #136 <Method Object LinkedHashMap.get(Object)>
	//   14   26:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//   15   29:areturn         
	}

	private boolean isEntryDoneLingering(Entry entry, long l)
	{
		return entry.timestamp + 10000L < l;
	//    0    0:aload_1         
	//    1    1:getfield        #140 <Field long AbstractComponentTracker$Entry.timestamp>
	//    2    4:ldc2w           #25  <Long 10000L>
	//    3    7:ladd            
	//    4    8:lload_2         
	//    5    9:lcmp            
	//    6   10:ifge            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	private boolean isEntryStale(Entry entry, long l)
	{
		if(isComponentStale(entry.component))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//*   3    5:invokevirtual   #144 <Method boolean isComponentStale(Object)>
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		return entry.timestamp + timeout < l;
	//    7   13:aload_1         
	//    8   14:getfield        #140 <Field long AbstractComponentTracker$Entry.timestamp>
	//    9   17:aload_0         
	//   10   18:getfield        #53  <Field long timeout>
	//   11   21:ladd            
	//   12   22:lload_2         
	//   13   23:lcmp            
	//   14   24:ifge            29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	private boolean isTooSoonForRemovalIteration(long l)
	{
		if(lastCheck + 1000L > l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field long lastCheck>
	//*   2    4:ldc2w           #28  <Long 1000L>
	//*   3    7:ladd            
	//*   4    8:lload_1         
	//*   5    9:lcmp            
	//*   6   10:ifle            15
		{
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		} else
		{
			lastCheck = l;
	//    9   15:aload_0         
	//   10   16:lload_1         
	//   11   17:putfield        #65  <Field long lastCheck>
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	private void removeExcedentComponents()
	{
		genericStaleComponentRemover(liveMap, 0L, byExcedent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field LinkedHashMap liveMap>
	//    3    5:lconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #70  <Field AbstractComponentTracker$RemovalPredicator byExcedent>
	//    6   10:invokespecial   #150 <Method void genericStaleComponentRemover(LinkedHashMap, long, AbstractComponentTracker$RemovalPredicator)>
	//    7   13:return          
	}

	private void removeStaleComponentsFromLingerersMap(long l)
	{
		genericStaleComponentRemover(lingerersMap, l, byLingering);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field LinkedHashMap lingerersMap>
	//    3    5:lload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #76  <Field AbstractComponentTracker$RemovalPredicator byLingering>
	//    6   10:invokespecial   #150 <Method void genericStaleComponentRemover(LinkedHashMap, long, AbstractComponentTracker$RemovalPredicator)>
	//    7   13:return          
	}

	private void removeStaleComponentsFromMainMap(long l)
	{
		genericStaleComponentRemover(liveMap, l, byTimeout);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field LinkedHashMap liveMap>
	//    3    5:lload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #73  <Field AbstractComponentTracker$RemovalPredicator byTimeout>
	//    6   10:invokespecial   #150 <Method void genericStaleComponentRemover(LinkedHashMap, long, AbstractComponentTracker$RemovalPredicator)>
	//    7   13:return          
	}

	public Collection allComponents()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #157 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = liveMap.values().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Entry)iterator.next()).component));
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field LinkedHashMap liveMap>
	//    6   12:invokevirtual   #161 <Method Collection LinkedHashMap.values()>
	//    7   15:invokeinterface #164 <Method Iterator Collection.iterator()>
	//    8   20:astore_2        
	//    9   21:aload_2         
	//   10   22:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            52
	//   12   30:aload_1         
	//   13   31:aload_2         
	//   14   32:invokeinterface #109 <Method Object Iterator.next()>
	//   15   37:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//   16   40:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//   17   43:invokeinterface #169 <Method boolean List.add(Object)>
	//   18   48:pop             
	//*  19   49:goto            21
		for(Iterator iterator1 = lingerersMap.values().iterator(); iterator1.hasNext(); ((List) (arraylist)).add(((Entry)iterator1.next()).component));
	//   20   52:aload_0         
	//   21   53:getfield        #63  <Field LinkedHashMap lingerersMap>
	//   22   56:invokevirtual   #161 <Method Collection LinkedHashMap.values()>
	//   23   59:invokeinterface #164 <Method Iterator Collection.iterator()>
	//   24   64:astore_2        
	//   25   65:aload_2         
	//   26   66:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   27   71:ifeq            96
	//   28   74:aload_1         
	//   29   75:aload_2         
	//   30   76:invokeinterface #109 <Method Object Iterator.next()>
	//   31   81:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//   32   84:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//   33   87:invokeinterface #169 <Method boolean List.add(Object)>
	//   34   92:pop             
	//*  35   93:goto            65
		return ((Collection) (arraylist));
	//   36   96:aload_1         
	//   37   97:areturn         
	}

	public Set allKeys()
	{
		HashSet hashset = new HashSet(((Collection) (liveMap.keySet())));
	//    0    0:new             #173 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field LinkedHashMap liveMap>
	//    4    8:invokevirtual   #176 <Method Set LinkedHashMap.keySet()>
	//    5   11:invokespecial   #179 <Method void HashSet(Collection)>
	//    6   14:astore_1        
		hashset.addAll(((Collection) (lingerersMap.keySet())));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #63  <Field LinkedHashMap lingerersMap>
	//   10   20:invokevirtual   #176 <Method Set LinkedHashMap.keySet()>
	//   11   23:invokevirtual   #183 <Method boolean HashSet.addAll(Collection)>
	//   12   26:pop             
		return ((Set) (hashset));
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	protected abstract Object buildComponent(String s);

	public void endOfLife(String s)
	{
		Entry entry = (Entry)liveMap.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LinkedHashMap liveMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method Object LinkedHashMap.remove(Object)>
	//    4    8:checkcast       #15  <Class AbstractComponentTracker$Entry>
	//    5   11:astore_2        
		if(entry == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       17
		{
			return;
	//    8   16:return          
		} else
		{
			lingerersMap.put(((Object) (s)), ((Object) (entry)));
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field LinkedHashMap lingerersMap>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #194 <Method Object LinkedHashMap.put(Object, Object)>
	//   14   26:pop             
			return;
	//   15   27:return          
		}
	}

	public Object find(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (getFromEitherMap(s)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #197 <Method AbstractComponentTracker$Entry getFromEitherMap(String)>
	//    5    7:astore_1        
		if(s != null)
			break MISSING_BLOCK_LABEL_16;
	//    6    8:aload_1         
	//    7    9:ifnonnull       16
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return ((Object) (null));
	//   10   14:aconst_null     
	//   11   15:areturn         
		s = ((String) (((Entry) (s)).component));
	//   12   16:aload_1         
	//   13   17:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//   14   20:astore_1        
		this;
	//   15   21:aload_0         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		return ((Object) (s));
	//   17   23:aload_1         
	//   18   24:areturn         
		s;
	//   19   25:astore_1        
	//*  20   26:aload_0         
		throw s;
	//   21   27:monitorexit     
	//   22   28:aload_1         
	//   23   29:athrow          
	}

	public int getComponentCount()
	{
		return liveMap.size() + lingerersMap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LinkedHashMap liveMap>
	//    2    4:invokevirtual   #203 <Method int LinkedHashMap.size()>
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field LinkedHashMap lingerersMap>
	//    5   11:invokevirtual   #203 <Method int LinkedHashMap.size()>
	//    6   14:iadd            
	//    7   15:ireturn         
	}

	public int getMaxComponents()
	{
		return maxComponents;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int maxComponents>
	//    2    4:ireturn         
	}

	public Object getOrCreate(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry = getFromEitherMap(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #197 <Method AbstractComponentTracker$Entry getFromEitherMap(String)>
	//    5    7:astore          4
		if(entry != null)
			break MISSING_BLOCK_LABEL_47;
	//    6    9:aload           4
	//    7   11:ifnonnull       47
		entry = new Entry(s, buildComponent(s), l);
	//    8   14:new             #15  <Class AbstractComponentTracker$Entry>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #208 <Method Object buildComponent(String)>
	//   14   24:lload_2         
	//   15   25:invokespecial   #211 <Method void AbstractComponentTracker$Entry(String, Object, long)>
	//   16   28:astore          4
		liveMap.put(((Object) (s)), ((Object) (entry)));
	//   17   30:aload_0         
	//   18   31:getfield        #61  <Field LinkedHashMap liveMap>
	//   19   34:aload_1         
	//   20   35:aload           4
	//   21   37:invokevirtual   #194 <Method Object LinkedHashMap.put(Object, Object)>
	//   22   40:pop             
		s = ((String) (entry));
	//   23   41:aload           4
	//   24   43:astore_1        
		break MISSING_BLOCK_LABEL_56;
	//   25   44:goto            56
		entry.setTimestamp(l);
	//   26   47:aload           4
	//   27   49:lload_2         
	//   28   50:invokevirtual   #214 <Method void AbstractComponentTracker$Entry.setTimestamp(long)>
		s = ((String) (entry));
	//   29   53:aload           4
	//   30   55:astore_1        
		s = ((String) (((Entry) (s)).component));
	//   31   56:aload_1         
	//   32   57:getfield        #124 <Field Object AbstractComponentTracker$Entry.component>
	//   33   60:astore_1        
		this;
	//   34   61:aload_0         
		JVM INSTR monitorexit ;
	//   35   62:monitorexit     
		return ((Object) (s));
	//   36   63:aload_1         
	//   37   64:areturn         
		s;
	//   38   65:astore_1        
	//*  39   66:aload_0         
		throw s;
	//   40   67:monitorexit     
	//   41   68:aload_1         
	//   42   69:athrow          
	}

	public long getTimeout()
	{
		return timeout;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long timeout>
	//    2    4:lreturn         
	}

	protected abstract boolean isComponentStale(Object obj);

	protected abstract void processPriorToRemoval(Object obj);

	public void removeStaleComponents(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isTooSoonForRemovalIteration(l);
	//    2    2:aload_0         
	//    3    3:lload_1         
	//    4    4:invokespecial   #220 <Method boolean isTooSoonForRemovalIteration(long)>
	//    5    7:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_15;
	//    6    8:iload_3         
	//    7    9:ifeq            15
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		removeExcedentComponents();
	//   11   15:aload_0         
	//   12   16:invokespecial   #222 <Method void removeExcedentComponents()>
		removeStaleComponentsFromMainMap(l);
	//   13   19:aload_0         
	//   14   20:lload_1         
	//   15   21:invokespecial   #224 <Method void removeStaleComponentsFromMainMap(long)>
		removeStaleComponentsFromLingerersMap(l);
	//   16   24:aload_0         
	//   17   25:lload_1         
	//   18   26:invokespecial   #226 <Method void removeStaleComponentsFromLingerersMap(long)>
		this;
	//   19   29:aload_0         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		return;
	//   21   31:return          
		Exception exception;
		exception;
	//   22   32:astore          4
	//*  23   34:aload_0         
		throw exception;
	//   24   35:monitorexit     
	//   25   36:aload           4
	//   26   38:athrow          
	}

	public void setMaxComponents(int i)
	{
		maxComponents = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int maxComponents>
	//    3    5:return          
	}

	public void setTimeout(long l)
	{
		timeout = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #53  <Field long timeout>
	//    3    5:return          
	}

	private static final boolean ACCESS_ORDERED = true;
	public static final long LINGERING_TIMEOUT = 10000L;
	public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000L;
	private RemovalPredicator byExcedent;
	private RemovalPredicator byLingering;
	private RemovalPredicator byTimeout;
	long lastCheck;
	LinkedHashMap lingerersMap;
	LinkedHashMap liveMap;
	protected int maxComponents;
	protected long timeout;


/*
	static boolean access$000(AbstractComponentTracker abstractcomponenttracker, Entry entry, long l)
	{
		return abstractcomponenttracker.isEntryStale(entry, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #83  <Method boolean isEntryStale(AbstractComponentTracker$Entry, long)>
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$100(AbstractComponentTracker abstractcomponenttracker, Entry entry, long l)
	{
		return abstractcomponenttracker.isEntryDoneLingering(entry, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #87  <Method boolean isEntryDoneLingering(AbstractComponentTracker$Entry, long)>
	//    4    6:ireturn         
	}

*/
}
