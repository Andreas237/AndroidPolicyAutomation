// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.support.v4.util.ArrayMap;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.databinding:
//			ObservableMap, MapChangeRegistry

public class ObservableArrayMap extends ArrayMap
	implements ObservableMap
{

	public ObservableArrayMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ArrayMap()>
	//    2    4:return          
	}

	private void notifyChange(Object obj)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field MapChangeRegistry mListeners>
	//*   2    4:ifnull          17
			mListeners.notifyCallbacks(((Object) (this)), 0, obj);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field MapChangeRegistry mListeners>
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokevirtual   #24  <Method void MapChangeRegistry.notifyCallbacks(Object, int, Object)>
	//    9   17:return          
	}

	public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback onmapchangedcallback)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field MapChangeRegistry mListeners>
	//*   2    4:ifnonnull       18
			mListeners = new MapChangeRegistry();
	//    3    7:aload_0         
	//    4    8:new             #20  <Class MapChangeRegistry>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void MapChangeRegistry()>
	//    7   15:putfield        #18  <Field MapChangeRegistry mListeners>
		mListeners.add(((Object) (onmapchangedcallback)));
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field MapChangeRegistry mListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #30  <Method void MapChangeRegistry.add(Object)>
	//   12   26:return          
	}

	public void clear()
	{
		if(!isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean isEmpty()>
	//*   2    4:ifne            16
		{
			super.clear();
	//    3    7:aload_0         
	//    4    8:invokespecial   #39  <Method void ArrayMap.clear()>
			notifyChange(((Object) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokespecial   #41  <Method void notifyChange(Object)>
		}
	//    8   16:return          
	}

	public Object put(Object obj, Object obj1)
	{
		super.put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method Object ArrayMap.put(Object, Object)>
	//    4    6:pop             
		notifyChange(obj);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #41  <Method void notifyChange(Object)>
		return obj1;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public boolean removeAll(Collection collection)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		collection = ((Collection) (collection.iterator()));
	//    2    2:aload_1         
	//    3    3:invokeinterface #54  <Method Iterator Collection.iterator()>
	//    4    8:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    5    9:aload_1         
	//    6   10:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            44
			int i = indexOfKey(((Iterator) (collection)).next());
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #63  <Method Object Iterator.next()>
	//   11   25:invokevirtual   #67  <Method int indexOfKey(Object)>
	//   12   28:istore_2        
			if(i >= 0)
	//*  13   29:iload_2         
	//*  14   30:iflt            9
			{
				flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_3        
				removeAt(i);
	//   17   35:aload_0         
	//   18   36:iload_2         
	//   19   37:invokevirtual   #71  <Method Object removeAt(int)>
	//   20   40:pop             
			}
		} while(true);
	//   21   41:goto            9
		return flag;
	//   22   44:iload_3         
	//   23   45:ireturn         
	}

	public Object removeAt(int i)
	{
		Object obj = keyAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #75  <Method Object keyAt(int)>
	//    3    5:astore_2        
		Object obj1 = super.removeAt(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokespecial   #76  <Method Object ArrayMap.removeAt(int)>
	//    7   11:astore_3        
		if(obj1 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          21
			notifyChange(obj);
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokespecial   #41  <Method void notifyChange(Object)>
		return obj1;
	//   13   21:aload_3         
	//   14   22:areturn         
	}

	public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback onmapchangedcallback)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field MapChangeRegistry mListeners>
	//*   2    4:ifnull          15
			mListeners.remove(((Object) (onmapchangedcallback)));
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field MapChangeRegistry mListeners>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #81  <Method void MapChangeRegistry.remove(Object)>
	//    7   15:return          
	}

	public boolean retainAll(Collection collection)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int i = size() - 1; i >= 0; i--)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #86  <Method int size()>
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iflt            42
			if(!collection.contains(keyAt(i)))
	//*   9   13:aload_1         
	//*  10   14:aload_0         
	//*  11   15:iload_2         
	//*  12   16:invokevirtual   #75  <Method Object keyAt(int)>
	//*  13   19:invokeinterface #90  <Method boolean Collection.contains(Object)>
	//*  14   24:ifne            35
			{
				removeAt(i);
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #71  <Method Object removeAt(int)>
	//   18   32:pop             
				flag = true;
	//   19   33:iconst_1        
	//   20   34:istore_3        
			}

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:isub            
	//   24   38:istore_2        
	//*  25   39:goto            9
		return flag;
	//   26   42:iload_3         
	//   27   43:ireturn         
	}

	public Object setValueAt(int i, Object obj)
	{
		Object obj1 = keyAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #75  <Method Object keyAt(int)>
	//    3    5:astore_3        
		obj = super.setValueAt(i, obj);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #94  <Method Object ArrayMap.setValueAt(int, Object)>
	//    8   12:astore_2        
		notifyChange(obj1);
	//    9   13:aload_0         
	//   10   14:aload_3         
	//   11   15:invokespecial   #41  <Method void notifyChange(Object)>
		return obj;
	//   12   18:aload_2         
	//   13   19:areturn         
	}

	private transient MapChangeRegistry mListeners;
}
