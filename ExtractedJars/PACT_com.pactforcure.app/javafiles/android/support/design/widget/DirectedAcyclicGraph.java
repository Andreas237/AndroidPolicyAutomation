// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.util.SimpleArrayMap;
import java.util.*;

final class DirectedAcyclicGraph
{

	DirectedAcyclicGraph()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class android.support.v4.util.Pools$SimplePool>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #26  <Method void android.support.v4.util.Pools$SimplePool(int)>
	//    7   14:putfield        #28  <Field android.support.v4.util.Pools$Pool mListPool>
	//    8   17:aload_0         
	//    9   18:new             #30  <Class SimpleArrayMap>
	//   10   21:dup             
	//   11   22:invokespecial   #31  <Method void SimpleArrayMap()>
	//   12   25:putfield        #33  <Field SimpleArrayMap mGraph>
	//   13   28:aload_0         
	//   14   29:new             #35  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #36  <Method void ArrayList()>
	//   17   36:putfield        #38  <Field ArrayList mSortResult>
	//   18   39:aload_0         
	//   19   40:new             #40  <Class HashSet>
	//   20   43:dup             
	//   21   44:invokespecial   #41  <Method void HashSet()>
	//   22   47:putfield        #43  <Field HashSet mSortTmpMarked>
	//   23   50:return          
	}

	private void dfs(Object obj, ArrayList arraylist, HashSet hashset)
	{
		if(arraylist.contains(obj))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #50  <Method boolean ArrayList.contains(Object)>
	//*   3    5:ifeq            9
			return;
	//    4    8:return          
		if(hashset.contains(obj))
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #51  <Method boolean HashSet.contains(Object)>
	//*   8   14:ifeq            27
			throw new RuntimeException("This graph contains cyclic dependencies");
	//    9   17:new             #53  <Class RuntimeException>
	//   10   20:dup             
	//   11   21:ldc1            #55  <String "This graph contains cyclic dependencies">
	//   12   23:invokespecial   #58  <Method void RuntimeException(String)>
	//   13   26:athrow          
		hashset.add(obj);
	//   14   27:aload_3         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #61  <Method boolean HashSet.add(Object)>
	//   17   32:pop             
		ArrayList arraylist1 = (ArrayList)mGraph.get(obj);
	//   18   33:aload_0         
	//   19   34:getfield        #33  <Field SimpleArrayMap mGraph>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #65  <Method Object SimpleArrayMap.get(Object)>
	//   22   41:checkcast       #35  <Class ArrayList>
	//   23   44:astore          6
		if(arraylist1 != null)
	//*  24   46:aload           6
	//*  25   48:ifnull          90
		{
			int i = 0;
	//   26   51:iconst_0        
	//   27   52:istore          4
			for(int j = arraylist1.size(); i < j; i++)
	//*  28   54:aload           6
	//*  29   56:invokevirtual   #69  <Method int ArrayList.size()>
	//*  30   59:istore          5
	//*  31   61:iload           4
	//*  32   63:iload           5
	//*  33   65:icmpge          90
				dfs(arraylist1.get(i), arraylist, hashset);
	//   34   68:aload_0         
	//   35   69:aload           6
	//   36   71:iload           4
	//   37   73:invokevirtual   #72  <Method Object ArrayList.get(int)>
	//   38   76:aload_2         
	//   39   77:aload_3         
	//   40   78:invokespecial   #74  <Method void dfs(Object, ArrayList, HashSet)>

	//   41   81:iload           4
	//   42   83:iconst_1        
	//   43   84:iadd            
	//   44   85:istore          4
		}
	//*  45   87:goto            61
		hashset.remove(obj);
	//   46   90:aload_3         
	//   47   91:aload_1         
	//   48   92:invokevirtual   #77  <Method boolean HashSet.remove(Object)>
	//   49   95:pop             
		arraylist.add(obj);
	//   50   96:aload_2         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   53  101:pop             
	//   54  102:return          
	}

	private ArrayList getEmptyList()
	{
		ArrayList arraylist1 = (ArrayList)mListPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field android.support.v4.util.Pools$Pool mListPool>
	//    2    4:invokeinterface #89  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #35  <Class ArrayList>
	//    4   12:astore_2        
		ArrayList arraylist = arraylist1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(arraylist1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       27
			arraylist = new ArrayList();
	//    9   19:new             #35  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #36  <Method void ArrayList()>
	//   12   26:astore_1        
		return arraylist;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	private void poolList(ArrayList arraylist)
	{
		arraylist.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #96  <Method void ArrayList.clear()>
		mListPool.release(((Object) (arraylist)));
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field android.support.v4.util.Pools$Pool mListPool>
	//    4    8:aload_1         
	//    5    9:invokeinterface #99  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	void addEdge(Object obj, Object obj1)
	{
		if(!mGraph.containsKey(obj) || !mGraph.containsKey(obj1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #106 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   4    8:ifeq            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #106 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   9   19:ifne            32
			throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
	//   10   22:new             #108 <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc1            #110 <String "All nodes must be present in the graph before being added as an edge">
	//   13   28:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//   14   31:athrow          
		ArrayList arraylist1 = (ArrayList)mGraph.get(obj);
	//   15   32:aload_0         
	//   16   33:getfield        #33  <Field SimpleArrayMap mGraph>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #65  <Method Object SimpleArrayMap.get(Object)>
	//   19   40:checkcast       #35  <Class ArrayList>
	//   20   43:astore          4
		ArrayList arraylist = arraylist1;
	//   21   45:aload           4
	//   22   47:astore_3        
		if(arraylist1 == null)
	//*  23   48:aload           4
	//*  24   50:ifnonnull       68
		{
			arraylist = getEmptyList();
	//   25   53:aload_0         
	//   26   54:invokespecial   #113 <Method ArrayList getEmptyList()>
	//   27   57:astore_3        
			mGraph.put(obj, ((Object) (arraylist)));
	//   28   58:aload_0         
	//   29   59:getfield        #33  <Field SimpleArrayMap mGraph>
	//   30   62:aload_1         
	//   31   63:aload_3         
	//   32   64:invokevirtual   #117 <Method Object SimpleArrayMap.put(Object, Object)>
	//   33   67:pop             
		}
		arraylist.add(obj1);
	//   34   68:aload_3         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   37   73:pop             
	//   38   74:return          
	}

	void addNode(Object obj)
	{
		if(!mGraph.containsKey(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #106 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   4    8:ifne            21
			mGraph.put(obj, ((Object) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field SimpleArrayMap mGraph>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #117 <Method Object SimpleArrayMap.put(Object, Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	void clear()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int j = mGraph.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   4    6:invokevirtual   #122 <Method int SimpleArrayMap.size()>
	//*   5    9:istore_2        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          43
		{
			ArrayList arraylist = (ArrayList)mGraph.valueAt(i);
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field SimpleArrayMap mGraph>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #125 <Method Object SimpleArrayMap.valueAt(int)>
	//   13   23:checkcast       #35  <Class ArrayList>
	//   14   26:astore_3        
			if(arraylist != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          36
				poolList(arraylist);
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:invokespecial   #127 <Method void poolList(ArrayList)>
		}

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
	//*  24   40:goto            10
		mGraph.clear();
	//   25   43:aload_0         
	//   26   44:getfield        #33  <Field SimpleArrayMap mGraph>
	//   27   47:invokevirtual   #128 <Method void SimpleArrayMap.clear()>
	//   28   50:return          
	}

	boolean contains(Object obj)
	{
		return mGraph.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SimpleArrayMap mGraph>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method boolean SimpleArrayMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	List getIncomingEdges(Object obj)
	{
		return (List)mGraph.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SimpleArrayMap mGraph>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #65  <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #134 <Class List>
	//    5   11:areturn         
	}

	List getOutgoingEdges(Object obj)
	{
		ArrayList arraylist = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		for(int j = mGraph.size(); i < j;)
	//*   4    5:aload_0         
	//*   5    6:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   6    9:invokevirtual   #122 <Method int SimpleArrayMap.size()>
	//*   7   12:istore_3        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          96
		{
			ArrayList arraylist2 = (ArrayList)mGraph.valueAt(i);
	//   11   18:aload_0         
	//   12   19:getfield        #33  <Field SimpleArrayMap mGraph>
	//   13   22:iload_2         
	//   14   23:invokevirtual   #125 <Method Object SimpleArrayMap.valueAt(int)>
	//   15   26:checkcast       #35  <Class ArrayList>
	//   16   29:astore          6
			ArrayList arraylist1 = arraylist;
	//   17   31:aload           4
	//   18   33:astore          5
			if(arraylist2 != null)
	//*  19   35:aload           6
	//*  20   37:ifnull          85
			{
				arraylist1 = arraylist;
	//   21   40:aload           4
	//   22   42:astore          5
				if(arraylist2.contains(obj))
	//*  23   44:aload           6
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #50  <Method boolean ArrayList.contains(Object)>
	//*  26   50:ifeq            85
				{
					arraylist1 = arraylist;
	//   27   53:aload           4
	//   28   55:astore          5
					if(arraylist == null)
	//*  29   57:aload           4
	//*  30   59:ifnonnull       71
						arraylist1 = new ArrayList();
	//   31   62:new             #35  <Class ArrayList>
	//   32   65:dup             
	//   33   66:invokespecial   #36  <Method void ArrayList()>
	//   34   69:astore          5
					arraylist1.add(mGraph.keyAt(i));
	//   35   71:aload           5
	//   36   73:aload_0         
	//   37   74:getfield        #33  <Field SimpleArrayMap mGraph>
	//   38   77:iload_2         
	//   39   78:invokevirtual   #139 <Method Object SimpleArrayMap.keyAt(int)>
	//   40   81:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   41   84:pop             
				}
			}
			i++;
	//   42   85:iload_2         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_2        
			arraylist = arraylist1;
	//   46   89:aload           5
	//   47   91:astore          4
		}

	//*  48   93:goto            13
		return ((List) (arraylist));
	//   49   96:aload           4
	//   50   98:areturn         
	}

	ArrayList getSortedList()
	{
		mSortResult.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mSortResult>
	//    2    4:invokevirtual   #96  <Method void ArrayList.clear()>
		mSortTmpMarked.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field HashSet mSortTmpMarked>
	//    5   11:invokevirtual   #142 <Method void HashSet.clear()>
		int i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		for(int j = mGraph.size(); i < j; i++)
	//*   8   16:aload_0         
	//*   9   17:getfield        #33  <Field SimpleArrayMap mGraph>
	//*  10   20:invokevirtual   #122 <Method int SimpleArrayMap.size()>
	//*  11   23:istore_2        
	//*  12   24:iload_1         
	//*  13   25:iload_2         
	//*  14   26:icmpge          56
			dfs(mGraph.keyAt(i), mSortResult, mSortTmpMarked);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field SimpleArrayMap mGraph>
	//   18   34:iload_1         
	//   19   35:invokevirtual   #139 <Method Object SimpleArrayMap.keyAt(int)>
	//   20   38:aload_0         
	//   21   39:getfield        #38  <Field ArrayList mSortResult>
	//   22   42:aload_0         
	//   23   43:getfield        #43  <Field HashSet mSortTmpMarked>
	//   24   46:invokespecial   #74  <Method void dfs(Object, ArrayList, HashSet)>

	//   25   49:iload_1         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_1        
	//*  29   53:goto            24
		return mSortResult;
	//   30   56:aload_0         
	//   31   57:getfield        #38  <Field ArrayList mSortResult>
	//   32   60:areturn         
	}

	boolean hasOutgoingEdges(Object obj)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = mGraph.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #33  <Field SimpleArrayMap mGraph>
	//*   4    6:invokevirtual   #122 <Method int SimpleArrayMap.size()>
	//*   5    9:istore_3        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          51
		{
			ArrayList arraylist = (ArrayList)mGraph.valueAt(i);
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field SimpleArrayMap mGraph>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #125 <Method Object SimpleArrayMap.valueAt(int)>
	//   13   23:checkcast       #35  <Class ArrayList>
	//   14   26:astore          4
			if(arraylist != null && arraylist.contains(obj))
	//*  15   28:aload           4
	//*  16   30:ifnull          44
	//*  17   33:aload           4
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #50  <Method boolean ArrayList.contains(Object)>
	//*  20   39:ifeq            44
				return true;
	//   21   42:iconst_1        
	//   22   43:ireturn         
		}

	//   23   44:iload_2         
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore_2        
	//*  27   48:goto            10
		return false;
	//   28   51:iconst_0        
	//   29   52:ireturn         
	}

	int size()
	{
		return mGraph.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SimpleArrayMap mGraph>
	//    2    4:invokevirtual   #122 <Method int SimpleArrayMap.size()>
	//    3    7:ireturn         
	}

	private final SimpleArrayMap mGraph = new SimpleArrayMap();
	private final android.support.v4.util.Pools.Pool mListPool = new android.support.v4.util.Pools.SimplePool(10);
	private final ArrayList mSortResult = new ArrayList();
	private final HashSet mSortTmpMarked = new HashSet();
}
