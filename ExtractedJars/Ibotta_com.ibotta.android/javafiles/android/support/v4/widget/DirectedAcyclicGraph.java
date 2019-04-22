// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.util.SimpleArrayMap;
import java.util.*;

public final class DirectedAcyclicGraph
{

	public DirectedAcyclicGraph()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class android.support.v4.util.Pools$SimplePool>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #30  <Method void android.support.v4.util.Pools$SimplePool(int)>
	//    7   14:putfield        #32  <Field android.support.v4.util.Pools$Pool mListPool>
	//    8   17:aload_0         
	//    9   18:new             #34  <Class SimpleArrayMap>
	//   10   21:dup             
	//   11   22:invokespecial   #35  <Method void SimpleArrayMap()>
	//   12   25:putfield        #37  <Field SimpleArrayMap mGraph>
	//   13   28:aload_0         
	//   14   29:new             #39  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #40  <Method void ArrayList()>
	//   17   36:putfield        #42  <Field ArrayList mSortResult>
	//   18   39:aload_0         
	//   19   40:new             #44  <Class HashSet>
	//   20   43:dup             
	//   21   44:invokespecial   #45  <Method void HashSet()>
	//   22   47:putfield        #47  <Field HashSet mSortTmpMarked>
	//   23   50:return          
	}

	private void dfs(Object obj, ArrayList arraylist, HashSet hashset)
	{
		if(arraylist.contains(obj))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #54  <Method boolean ArrayList.contains(Object)>
	//*   3    5:ifeq            9
			return;
	//    4    8:return          
		if(!hashset.contains(obj))
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #55  <Method boolean HashSet.contains(Object)>
	//*   8   14:ifne            93
		{
			hashset.add(obj);
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #58  <Method boolean HashSet.add(Object)>
	//   12   22:pop             
			ArrayList arraylist1 = (ArrayList)mGraph.get(obj);
	//   13   23:aload_0         
	//   14   24:getfield        #37  <Field SimpleArrayMap mGraph>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #62  <Method Object SimpleArrayMap.get(Object)>
	//   17   31:checkcast       #39  <Class ArrayList>
	//   18   34:astore          6
			if(arraylist1 != null)
	//*  19   36:aload           6
	//*  20   38:ifnull          80
			{
				int i = 0;
	//   21   41:iconst_0        
	//   22   42:istore          4
				for(int j = arraylist1.size(); i < j; i++)
	//*  23   44:aload           6
	//*  24   46:invokevirtual   #66  <Method int ArrayList.size()>
	//*  25   49:istore          5
	//*  26   51:iload           4
	//*  27   53:iload           5
	//*  28   55:icmpge          80
					dfs(arraylist1.get(i), arraylist, hashset);
	//   29   58:aload_0         
	//   30   59:aload           6
	//   31   61:iload           4
	//   32   63:invokevirtual   #69  <Method Object ArrayList.get(int)>
	//   33   66:aload_2         
	//   34   67:aload_3         
	//   35   68:invokespecial   #71  <Method void dfs(Object, ArrayList, HashSet)>

	//   36   71:iload           4
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore          4
			}
	//*  40   77:goto            51
			hashset.remove(obj);
	//   41   80:aload_3         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #74  <Method boolean HashSet.remove(Object)>
	//   44   85:pop             
			arraylist.add(obj);
	//   45   86:aload_2         
	//   46   87:aload_1         
	//   47   88:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   48   91:pop             
			return;
	//   49   92:return          
		} else
		{
			throw new RuntimeException("This graph contains cyclic dependencies");
	//   50   93:new             #77  <Class RuntimeException>
	//   51   96:dup             
	//   52   97:ldc1            #79  <String "This graph contains cyclic dependencies">
	//   53   99:invokespecial   #82  <Method void RuntimeException(String)>
	//   54  102:athrow          
		}
	}

	private ArrayList getEmptyList()
	{
		ArrayList arraylist1 = (ArrayList)mListPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field android.support.v4.util.Pools$Pool mListPool>
	//    2    4:invokeinterface #93  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #39  <Class ArrayList>
	//    4   12:astore_2        
		ArrayList arraylist = arraylist1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(arraylist1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       27
			arraylist = new ArrayList();
	//    9   19:new             #39  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #40  <Method void ArrayList()>
	//   12   26:astore_1        
		return arraylist;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	private void poolList(ArrayList arraylist)
	{
		arraylist.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #100 <Method void ArrayList.clear()>
		mListPool.release(((Object) (arraylist)));
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field android.support.v4.util.Pools$Pool mListPool>
	//    4    8:aload_1         
	//    5    9:invokeinterface #103 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void addEdge(Object obj, Object obj1)
	{
		if(mGraph.containsKey(obj) && mGraph.containsKey(obj1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #110 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   4    8:ifeq            65
	//*   5   11:aload_0         
	//*   6   12:getfield        #37  <Field SimpleArrayMap mGraph>
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #110 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   9   19:ifeq            65
		{
			ArrayList arraylist1 = (ArrayList)mGraph.get(obj);
	//   10   22:aload_0         
	//   11   23:getfield        #37  <Field SimpleArrayMap mGraph>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #62  <Method Object SimpleArrayMap.get(Object)>
	//   14   30:checkcast       #39  <Class ArrayList>
	//   15   33:astore          4
			ArrayList arraylist = arraylist1;
	//   16   35:aload           4
	//   17   37:astore_3        
			if(arraylist1 == null)
	//*  18   38:aload           4
	//*  19   40:ifnonnull       58
			{
				arraylist = getEmptyList();
	//   20   43:aload_0         
	//   21   44:invokespecial   #112 <Method ArrayList getEmptyList()>
	//   22   47:astore_3        
				mGraph.put(obj, ((Object) (arraylist)));
	//   23   48:aload_0         
	//   24   49:getfield        #37  <Field SimpleArrayMap mGraph>
	//   25   52:aload_1         
	//   26   53:aload_3         
	//   27   54:invokevirtual   #116 <Method Object SimpleArrayMap.put(Object, Object)>
	//   28   57:pop             
			}
			arraylist.add(obj1);
	//   29   58:aload_3         
	//   30   59:aload_2         
	//   31   60:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   32   63:pop             
			return;
	//   33   64:return          
		} else
		{
			throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
	//   34   65:new             #118 <Class IllegalArgumentException>
	//   35   68:dup             
	//   36   69:ldc1            #120 <String "All nodes must be present in the graph before being added as an edge">
	//   37   71:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   38   74:athrow          
		}
	}

	public void addNode(Object obj)
	{
		if(!mGraph.containsKey(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #110 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*   4    8:ifne            21
			mGraph.put(obj, ((Object) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field SimpleArrayMap mGraph>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #116 <Method Object SimpleArrayMap.put(Object, Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void clear()
	{
		int j = mGraph.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//    2    4:invokevirtual   #126 <Method int SimpleArrayMap.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          43
		{
			ArrayList arraylist = (ArrayList)mGraph.valueAt(i);
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field SimpleArrayMap mGraph>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #129 <Method Object SimpleArrayMap.valueAt(int)>
	//   13   23:checkcast       #39  <Class ArrayList>
	//   14   26:astore_3        
			if(arraylist != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          36
				poolList(arraylist);
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:invokespecial   #131 <Method void poolList(ArrayList)>
		}

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
	//*  24   40:goto            10
		mGraph.clear();
	//   25   43:aload_0         
	//   26   44:getfield        #37  <Field SimpleArrayMap mGraph>
	//   27   47:invokevirtual   #132 <Method void SimpleArrayMap.clear()>
	//   28   50:return          
	}

	public boolean contains(Object obj)
	{
		return mGraph.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method boolean SimpleArrayMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public List getIncomingEdges(Object obj)
	{
		return (List)mGraph.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #138 <Class List>
	//    5   11:areturn         
	}

	public List getOutgoingEdges(Object obj)
	{
		int j = mGraph.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//    2    4:invokevirtual   #126 <Method int SimpleArrayMap.size()>
	//    3    7:istore_3        
		ArrayList arraylist = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		for(int i = 0; i < j;)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          96
		{
			ArrayList arraylist2 = (ArrayList)mGraph.valueAt(i);
	//   11   18:aload_0         
	//   12   19:getfield        #37  <Field SimpleArrayMap mGraph>
	//   13   22:iload_2         
	//   14   23:invokevirtual   #129 <Method Object SimpleArrayMap.valueAt(int)>
	//   15   26:checkcast       #39  <Class ArrayList>
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
	//*  25   47:invokevirtual   #54  <Method boolean ArrayList.contains(Object)>
	//*  26   50:ifeq            85
				{
					arraylist1 = arraylist;
	//   27   53:aload           4
	//   28   55:astore          5
					if(arraylist == null)
	//*  29   57:aload           4
	//*  30   59:ifnonnull       71
						arraylist1 = new ArrayList();
	//   31   62:new             #39  <Class ArrayList>
	//   32   65:dup             
	//   33   66:invokespecial   #40  <Method void ArrayList()>
	//   34   69:astore          5
					arraylist1.add(mGraph.keyAt(i));
	//   35   71:aload           5
	//   36   73:aload_0         
	//   37   74:getfield        #37  <Field SimpleArrayMap mGraph>
	//   38   77:iload_2         
	//   39   78:invokevirtual   #143 <Method Object SimpleArrayMap.keyAt(int)>
	//   40   81:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
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

	public ArrayList getSortedList()
	{
		mSortResult.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mSortResult>
	//    2    4:invokevirtual   #100 <Method void ArrayList.clear()>
		mSortTmpMarked.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field HashSet mSortTmpMarked>
	//    5   11:invokevirtual   #146 <Method void HashSet.clear()>
		int j = mGraph.size();
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field SimpleArrayMap mGraph>
	//    8   18:invokevirtual   #126 <Method int SimpleArrayMap.size()>
	//    9   21:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_1        
	//*  12   24:iload_1         
	//*  13   25:iload_2         
	//*  14   26:icmpge          56
			dfs(mGraph.keyAt(i), mSortResult, mSortTmpMarked);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #37  <Field SimpleArrayMap mGraph>
	//   18   34:iload_1         
	//   19   35:invokevirtual   #143 <Method Object SimpleArrayMap.keyAt(int)>
	//   20   38:aload_0         
	//   21   39:getfield        #42  <Field ArrayList mSortResult>
	//   22   42:aload_0         
	//   23   43:getfield        #47  <Field HashSet mSortTmpMarked>
	//   24   46:invokespecial   #71  <Method void dfs(Object, ArrayList, HashSet)>

	//   25   49:iload_1         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_1        
	//*  29   53:goto            24
		return mSortResult;
	//   30   56:aload_0         
	//   31   57:getfield        #42  <Field ArrayList mSortResult>
	//   32   60:areturn         
	}

	public boolean hasOutgoingEdges(Object obj)
	{
		int j = mGraph.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SimpleArrayMap mGraph>
	//    2    4:invokevirtual   #126 <Method int SimpleArrayMap.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          51
		{
			ArrayList arraylist = (ArrayList)mGraph.valueAt(i);
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field SimpleArrayMap mGraph>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #129 <Method Object SimpleArrayMap.valueAt(int)>
	//   13   23:checkcast       #39  <Class ArrayList>
	//   14   26:astore          4
			if(arraylist != null && arraylist.contains(obj))
	//*  15   28:aload           4
	//*  16   30:ifnull          44
	//*  17   33:aload           4
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #54  <Method boolean ArrayList.contains(Object)>
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

	private final SimpleArrayMap mGraph = new SimpleArrayMap();
	private final android.support.v4.util.Pools.Pool mListPool = new android.support.v4.util.Pools.SimplePool(10);
	private final ArrayList mSortResult = new ArrayList();
	private final HashSet mSortTmpMarked = new HashSet();
}
