// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			CallbackRegistry, ObservableList

public class ListChangeRegistry extends CallbackRegistry
{
	static class ListChanges
	{

		public int count;
		public int start;
		public int to;

		ListChanges()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public ListChangeRegistry()
	{
		super(NOTIFIER_CALLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #41  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//    2    4:invokespecial   #45  <Method void CallbackRegistry(CallbackRegistry$NotifierCallback)>
	//    3    7:return          
	}

	private static ListChanges acquire(int i, int j, int k)
	{
		ListChanges listchanges1 = (ListChanges)sListChanges.acquire();
	//    0    0:getstatic       #37  <Field android.support.v4.util.Pools$SynchronizedPool sListChanges>
	//    1    3:invokevirtual   #50  <Method Object android.support.v4.util.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #9   <Class ListChangeRegistry$ListChanges>
	//    3    9:astore          4
		ListChanges listchanges = listchanges1;
	//    4   11:aload           4
	//    5   13:astore_3        
		if(listchanges1 == null)
	//*   6   14:aload           4
	//*   7   16:ifnonnull       27
			listchanges = new ListChanges();
	//    8   19:new             #9   <Class ListChangeRegistry$ListChanges>
	//    9   22:dup             
	//   10   23:invokespecial   #51  <Method void ListChangeRegistry$ListChanges()>
	//   11   26:astore_3        
		listchanges.start = i;
	//   12   27:aload_3         
	//   13   28:iload_0         
	//   14   29:putfield        #54  <Field int ListChangeRegistry$ListChanges.start>
		listchanges.to = j;
	//   15   32:aload_3         
	//   16   33:iload_1         
	//   17   34:putfield        #57  <Field int ListChangeRegistry$ListChanges.to>
		listchanges.count = k;
	//   18   37:aload_3         
	//   19   38:iload_2         
	//   20   39:putfield        #60  <Field int ListChangeRegistry$ListChanges.count>
		return listchanges;
	//   21   42:aload_3         
	//   22   43:areturn         
	}

	public void notifyCallbacks(ObservableList observablelist, int i, ListChanges listchanges)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.notifyCallbacks(((Object) (observablelist)), i, ((Object) (listchanges)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:aload_3         
	//    6    6:invokespecial   #66  <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
		if(listchanges == null)
			break MISSING_BLOCK_LABEL_21;
	//    7    9:aload_3         
	//    8   10:ifnull          21
		sListChanges.release(((Object) (listchanges)));
	//    9   13:getstatic       #37  <Field android.support.v4.util.Pools$SynchronizedPool sListChanges>
	//   10   16:aload_3         
	//   11   17:invokevirtual   #70  <Method boolean android.support.v4.util.Pools$SynchronizedPool.release(Object)>
	//   12   20:pop             
		this;
	//   13   21:aload_0         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		observablelist;
	//   16   24:astore_1        
	//*  17   25:aload_0         
		throw observablelist;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
	}

	public volatile void notifyCallbacks(Object obj, int i, Object obj1)
	{
		notifyCallbacks((ObservableList)obj, i, (ListChanges)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #73  <Class ObservableList>
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:checkcast       #9   <Class ListChangeRegistry$ListChanges>
	//    6   10:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    7   13:return          
	}

	public void notifyChanged(ObservableList observablelist)
	{
		notifyCallbacks(observablelist, 0, ((ListChanges) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    5    7:return          
	}

	public void notifyChanged(ObservableList observablelist, int i, int j)
	{
		notifyCallbacks(observablelist, 1, acquire(i, 0, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iload_2         
	//    4    4:iconst_0        
	//    5    5:iload_3         
	//    6    6:invokestatic    #80  <Method ListChangeRegistry$ListChanges acquire(int, int, int)>
	//    7    9:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    8   12:return          
	}

	public void notifyInserted(ObservableList observablelist, int i, int j)
	{
		notifyCallbacks(observablelist, 2, acquire(i, 0, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:iload_2         
	//    4    4:iconst_0        
	//    5    5:iload_3         
	//    6    6:invokestatic    #80  <Method ListChangeRegistry$ListChanges acquire(int, int, int)>
	//    7    9:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    8   12:return          
	}

	public void notifyMoved(ObservableList observablelist, int i, int j, int k)
	{
		notifyCallbacks(observablelist, 3, acquire(i, j, k));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:invokestatic    #80  <Method ListChangeRegistry$ListChanges acquire(int, int, int)>
	//    7   10:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    8   13:return          
	}

	public void notifyRemoved(ObservableList observablelist, int i, int j)
	{
		notifyCallbacks(observablelist, 4, acquire(i, 0, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:iload_2         
	//    4    4:iconst_0        
	//    5    5:iload_3         
	//    6    6:invokestatic    #80  <Method ListChangeRegistry$ListChanges acquire(int, int, int)>
	//    7    9:invokevirtual   #75  <Method void notifyCallbacks(ObservableList, int, ListChangeRegistry$ListChanges)>
	//    8   12:return          
	}

	private static final int ALL = 0;
	private static final int CHANGED = 1;
	private static final int INSERTED = 2;
	private static final int MOVED = 3;
	private static final CallbackRegistry.NotifierCallback NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback() {

		public void onNotifyCallback(ObservableList.OnListChangedCallback onlistchangedcallback, ObservableList observablelist, int i, ListChanges listchanges)
		{
			switch(i)
		//*   0    0:iload_3         
			{
		//*   1    1:tableswitch     1 4: default 32
		//		               1 91
		//		               2 75
		//		               3 54
		//		               4 38
			default:
				onlistchangedcallback.onChanged(observablelist);
		//    2   32:aload_1         
		//    3   33:aload_2         
		//    4   34:invokevirtual   #20  <Method void ObservableList$OnListChangedCallback.onChanged(ObservableList)>
				return;
		//    5   37:return          

			case 4: // '\004'
				onlistchangedcallback.onItemRangeRemoved(observablelist, listchanges.start, listchanges.count);
		//    6   38:aload_1         
		//    7   39:aload_2         
		//    8   40:aload           4
		//    9   42:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
		//   10   45:aload           4
		//   11   47:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
		//   12   50:invokevirtual   #33  <Method void ObservableList$OnListChangedCallback.onItemRangeRemoved(ObservableList, int, int)>
				return;
		//   13   53:return          

			case 3: // '\003'
				onlistchangedcallback.onItemRangeMoved(observablelist, listchanges.start, listchanges.to, listchanges.count);
		//   14   54:aload_1         
		//   15   55:aload_2         
		//   16   56:aload           4
		//   17   58:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
		//   18   61:aload           4
		//   19   63:getfield        #36  <Field int ListChangeRegistry$ListChanges.to>
		//   20   66:aload           4
		//   21   68:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
		//   22   71:invokevirtual   #40  <Method void ObservableList$OnListChangedCallback.onItemRangeMoved(ObservableList, int, int, int)>
				return;
		//   23   74:return          

			case 2: // '\002'
				onlistchangedcallback.onItemRangeInserted(observablelist, listchanges.start, listchanges.count);
		//   24   75:aload_1         
		//   25   76:aload_2         
		//   26   77:aload           4
		//   27   79:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
		//   28   82:aload           4
		//   29   84:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
		//   30   87:invokevirtual   #43  <Method void ObservableList$OnListChangedCallback.onItemRangeInserted(ObservableList, int, int)>
				return;
		//   31   90:return          

			case 1: // '\001'
				onlistchangedcallback.onItemRangeChanged(observablelist, listchanges.start, listchanges.count);
		//   32   91:aload_1         
		//   33   92:aload_2         
		//   34   93:aload           4
		//   35   95:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
		//   36   98:aload           4
		//   37  100:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
		//   38  103:invokevirtual   #46  <Method void ObservableList$OnListChangedCallback.onItemRangeChanged(ObservableList, int, int)>
				return;
		//   39  106:return          
			}
		}

		public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
		{
			onNotifyCallback((ObservableList.OnListChangedCallback)obj, (ObservableList)obj1, i, (ListChanges)obj2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class ObservableList$OnListChangedCallback>
		//    3    5:aload_2         
		//    4    6:checkcast       #49  <Class ObservableList>
		//    5    9:iload_3         
		//    6   10:aload           4
		//    7   12:checkcast       #22  <Class ListChangeRegistry$ListChanges>
		//    8   15:invokevirtual   #51  <Method void onNotifyCallback(ObservableList$OnListChangedCallback, ObservableList, int, ListChangeRegistry$ListChanges)>
		//    9   18:return          
		}

	}
;
	private static final int REMOVED = 4;
	private static final android.support.v4.util.Pools.SynchronizedPool sListChanges = new android.support.v4.util.Pools.SynchronizedPool(10);

	static 
	{
	//    0    0:new             #31  <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:invokespecial   #35  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #37  <Field android.support.v4.util.Pools$SynchronizedPool sListChanges>
	//    5   12:new             #7   <Class ListChangeRegistry$1>
	//    6   15:dup             
	//    7   16:invokespecial   #39  <Method void ListChangeRegistry$1()>
	//    8   19:putstatic       #41  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//*   9   22:return          
	}
}
