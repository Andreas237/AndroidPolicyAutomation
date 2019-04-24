// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package android.databinding:
//			ObservableList, ListChangeRegistry

public class ObservableArrayList extends ArrayList
	implements ObservableList
{

	public ObservableArrayList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ArrayList()>
		mListeners = new ListChangeRegistry();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ListChangeRegistry>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ListChangeRegistry()>
	//    6   12:putfield        #18  <Field ListChangeRegistry mListeners>
	//    7   15:return          
	}

	private void notifyAdd(int i, int j)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ListChangeRegistry mListeners>
	//*   2    4:ifnull          17
			mListeners.notifyInserted(((ObservableList) (this)), i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field ListChangeRegistry mListeners>
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #25  <Method void ListChangeRegistry.notifyInserted(ObservableList, int, int)>
	//    9   17:return          
	}

	private void notifyRemove(int i, int j)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ListChangeRegistry mListeners>
	//*   2    4:ifnull          17
			mListeners.notifyRemoved(((ObservableList) (this)), i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field ListChangeRegistry mListeners>
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #29  <Method void ListChangeRegistry.notifyRemoved(ObservableList, int, int)>
	//    9   17:return          
	}

	public void add(int i, Object obj)
	{
		super.add(i, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void ArrayList.add(int, Object)>
		notifyAdd(i, 1);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_1        
	//    7    9:invokespecial   #35  <Method void notifyAdd(int, int)>
	//    8   12:return          
	}

	public boolean add(Object obj)
	{
		super.add(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method boolean ArrayList.add(Object)>
	//    3    5:pop             
		notifyAdd(size() - 1, 1);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #44  <Method int size()>
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iconst_1        
	//   10   14:invokespecial   #35  <Method void notifyAdd(int, int)>
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
	}

	public boolean addAll(int i, Collection collection)
	{
		boolean flag = super.addAll(i, collection);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #49  <Method boolean ArrayList.addAll(int, Collection)>
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_3         
	//*   6    8:ifeq            22
			notifyAdd(i, collection.size());
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_2         
	//   10   14:invokeinterface #52  <Method int Collection.size()>
	//   11   19:invokespecial   #35  <Method void notifyAdd(int, int)>
		return flag;
	//   12   22:iload_3         
	//   13   23:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method int size()>
	//    2    4:istore_2        
		boolean flag = super.addAll(collection);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #56  <Method boolean ArrayList.addAll(Collection)>
	//    6   10:istore_3        
		if(flag)
	//*   7   11:iload_3         
	//*   8   12:ifeq            26
			notifyAdd(i, size() - i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #44  <Method int size()>
	//   13   21:iload_2         
	//   14   22:isub            
	//   15   23:invokespecial   #35  <Method void notifyAdd(int, int)>
		return flag;
	//   16   26:iload_3         
	//   17   27:ireturn         
	}

	public void addOnListChangedCallback(ObservableList.OnListChangedCallback onlistchangedcallback)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ListChangeRegistry mListeners>
	//*   2    4:ifnonnull       18
			mListeners = new ListChangeRegistry();
	//    3    7:aload_0         
	//    4    8:new             #15  <Class ListChangeRegistry>
	//    5   11:dup             
	//    6   12:invokespecial   #16  <Method void ListChangeRegistry()>
	//    7   15:putfield        #18  <Field ListChangeRegistry mListeners>
		mListeners.add(((Object) (onlistchangedcallback)));
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field ListChangeRegistry mListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #62  <Method void ListChangeRegistry.add(Object)>
	//   12   26:return          
	}

	public void clear()
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method int size()>
	//    2    4:istore_1        
		super.clear();
	//    3    5:aload_0         
	//    4    6:invokespecial   #65  <Method void ArrayList.clear()>
		if(i != 0)
	//*   5    9:iload_1         
	//*   6   10:ifeq            19
			notifyRemove(0, i);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:iload_1         
	//   10   16:invokespecial   #67  <Method void notifyRemove(int, int)>
	//   11   19:return          
	}

	public Object remove(int i)
	{
		Object obj = super.remove(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #71  <Method Object ArrayList.remove(int)>
	//    3    5:astore_2        
		notifyRemove(i, 1);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_1        
	//    7    9:invokespecial   #67  <Method void notifyRemove(int, int)>
		return obj;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public boolean remove(Object obj)
	{
		int i = indexOf(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method int indexOf(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            18
		{
			remove(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #77  <Method Object remove(int)>
	//    9   15:pop             
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		} else
		{
			return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
		}
	}

	public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onlistchangedcallback)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ListChangeRegistry mListeners>
	//*   2    4:ifnull          15
			mListeners.remove(((Object) (onlistchangedcallback)));
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field ListChangeRegistry mListeners>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #80  <Method void ListChangeRegistry.remove(Object)>
	//    7   15:return          
	}

	protected void removeRange(int i, int j)
	{
		super.removeRange(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #83  <Method void ArrayList.removeRange(int, int)>
		notifyRemove(i, j - i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iload_2         
	//    7    9:iload_1         
	//    8   10:isub            
	//    9   11:invokespecial   #67  <Method void notifyRemove(int, int)>
	//   10   14:return          
	}

	public Object set(int i, Object obj)
	{
		obj = super.set(i, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method Object ArrayList.set(int, Object)>
	//    4    6:astore_2        
		if(mListeners != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #18  <Field ListChangeRegistry mListeners>
	//*   7   11:ifnull          24
			mListeners.notifyChanged(((ObservableList) (this)), i, 1);
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field ListChangeRegistry mListeners>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #90  <Method void ListChangeRegistry.notifyChanged(ObservableList, int, int)>
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	private transient ListChangeRegistry mListeners;
}
