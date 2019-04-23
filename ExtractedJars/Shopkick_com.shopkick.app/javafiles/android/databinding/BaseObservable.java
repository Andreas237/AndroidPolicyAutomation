// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			Observable, PropertyChangeRegistry

public class BaseObservable
	implements Observable
{

	public BaseObservable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void addOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mCallbacks == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//*   4    6:ifnonnull       20
			mCallbacks = new PropertyChangeRegistry();
	//    5    9:aload_0         
	//    6   10:new             #20  <Class PropertyChangeRegistry>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void PropertyChangeRegistry()>
	//    9   17:putfield        #18  <Field PropertyChangeRegistry mCallbacks>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		mCallbacks.add(((Object) (onpropertychangedcallback)));
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #25  <Method void PropertyChangeRegistry.add(Object)>
		return;
	//   16   30:return          
		onpropertychangedcallback;
	//   17   31:astore_1        
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw onpropertychangedcallback;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public void notifyChange()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mCallbacks != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		mCallbacks.notifyCallbacks(((Object) (this)), 0, ((Object) (null)));
	//   10   14:aload_0         
	//   11   15:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:aconst_null     
	//   15   21:invokevirtual   #31  <Method void PropertyChangeRegistry.notifyCallbacks(Object, int, Object)>
		return;
	//   16   24:return          
		Exception exception;
		exception;
	//   17   25:astore_1        
		this;
	//   18   26:aload_0         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw exception;
	//   20   28:aload_1         
	//   21   29:athrow          
	}

	public void notifyPropertyChanged(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mCallbacks != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		mCallbacks.notifyCallbacks(((Object) (this)), i, ((Object) (null)));
	//   10   14:aload_0         
	//   11   15:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:aconst_null     
	//   15   21:invokevirtual   #31  <Method void PropertyChangeRegistry.notifyCallbacks(Object, int, Object)>
		return;
	//   16   24:return          
		Exception exception;
		exception;
	//   17   25:astore_2        
		this;
	//   18   26:aload_0         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw exception;
	//   20   28:aload_2         
	//   21   29:athrow          
	}

	public void removeOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mCallbacks != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		mCallbacks.remove(((Object) (onpropertychangedcallback)));
	//   10   14:aload_0         
	//   11   15:getfield        #18  <Field PropertyChangeRegistry mCallbacks>
	//   12   18:aload_1         
	//   13   19:invokevirtual   #37  <Method void PropertyChangeRegistry.remove(Object)>
		return;
	//   14   22:return          
		onpropertychangedcallback;
	//   15   23:astore_1        
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw onpropertychangedcallback;
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	private transient PropertyChangeRegistry mCallbacks;
}
