// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import java.util.*;

public abstract class ConstraintTracker
{

	ConstraintTracker(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void Object()>
	//    6   12:putfield        #39  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #41  <Class LinkedHashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void LinkedHashSet()>
	//   11   23:putfield        #44  <Field Set mListeners>
		mAppContext = context.getApplicationContext();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #50  <Method Context Context.getApplicationContext()>
	//   15   31:putfield        #52  <Field Context mAppContext>
	//   16   34:return          
	}

	public void addListener(ConstraintListener constraintlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mListeners.add(((Object) (constraintlistener))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #44  <Field Set mListeners>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #60  <Method boolean Set.add(Object)>
	//*   9   17:ifeq            94
			{
				if(mListeners.size() == 1)
	//*  10   20:aload_0         
	//*  11   21:getfield        #44  <Field Set mListeners>
	//*  12   24:invokeinterface #64  <Method int Set.size()>
	//*  13   29:iconst_1        
	//*  14   30:icmpne          84
				{
					mCurrentState = getInitialState();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #68  <Method Object getInitialState()>
	//   18   38:putfield        #70  <Field Object mCurrentState>
					Logger.get().debug(TAG, String.format("%s: initial state = %s", new Object[] {
						((Object)this).getClass().getSimpleName(), mCurrentState
					}), new Throwable[0]);
	//   19   41:invokestatic    #74  <Method Logger Logger.get()>
	//   20   44:getstatic       #32  <Field String TAG>
	//   21   47:ldc1            #76  <String "%s: initial state = %s">
	//   22   49:iconst_2        
	//   23   50:anewarray       Object[]
	//   24   53:dup             
	//   25   54:iconst_0        
	//   26   55:aload_0         
	//   27   56:invokevirtual   #80  <Method Class Object.getClass()>
	//   28   59:invokevirtual   #86  <Method String Class.getSimpleName()>
	//   29   62:aastore         
	//   30   63:dup             
	//   31   64:iconst_1        
	//   32   65:aload_0         
	//   33   66:getfield        #70  <Field Object mCurrentState>
	//   34   69:aastore         
	//   35   70:invokestatic    #92  <Method String String.format(String, Object[])>
	//   36   73:iconst_0        
	//   37   74:anewarray       Throwable[]
	//   38   77:invokevirtual   #98  <Method void Logger.debug(String, String, Throwable[])>
					startTracking();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #101 <Method void startTracking()>
				}
				constraintlistener.onConstraintChanged(mCurrentState);
	//   41   84:aload_1         
	//   42   85:aload_0         
	//   43   86:getfield        #70  <Field Object mCurrentState>
	//   44   89:invokeinterface #107 <Method void ConstraintListener.onConstraintChanged(Object)>
			}
		}
	//   45   94:aload_2         
	//   46   95:monitorexit     
		return;
	//   47   96:return          
		constraintlistener;
	//   48   97:astore_1        
		obj;
	//   49   98:aload_2         
		JVM INSTR monitorexit ;
	//   50   99:monitorexit     
		throw constraintlistener;
	//   51  100:aload_1         
	//   52  101:athrow          
	}

	public abstract Object getInitialState();

	public void removeListener(ConstraintListener constraintlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mListeners.remove(((Object) (constraintlistener))) && mListeners.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #44  <Field Set mListeners>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #113 <Method boolean Set.remove(Object)>
	//*   9   17:ifeq            36
	//*  10   20:aload_0         
	//*  11   21:getfield        #44  <Field Set mListeners>
	//*  12   24:invokeinterface #117 <Method boolean Set.isEmpty()>
	//*  13   29:ifeq            36
				stopTracking();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #120 <Method void stopTracking()>
		}
	//   16   36:aload_2         
	//   17   37:monitorexit     
		return;
	//   18   38:return          
		constraintlistener;
	//   19   39:astore_1        
		obj;
	//   20   40:aload_2         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		throw constraintlistener;
	//   22   42:aload_1         
	//   23   43:athrow          
	}

	public void setState(Object obj)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object mLock>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mCurrentState == obj || mCurrentState != null && mCurrentState.equals(obj))
	//*   5    7:aload_0         
	//*   6    8:getfield        #70  <Field Object mCurrentState>
	//*   7   11:aload_1         
	//*   8   12:if_acmpeq       91
	//*   9   15:aload_0         
	//*  10   16:getfield        #70  <Field Object mCurrentState>
	//*  11   19:ifnull          36
	//*  12   22:aload_0         
	//*  13   23:getfield        #70  <Field Object mCurrentState>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #124 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            36
			break MISSING_BLOCK_LABEL_91;
	//   17   33:goto            91
		mCurrentState = obj;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #70  <Field Object mCurrentState>
		for(obj = ((Object) (((List) (new ArrayList(((java.util.Collection) (mListeners))))).iterator())); ((Iterator) (obj)).hasNext(); ((ConstraintListener)((Iterator) (obj)).next()).onConstraintChanged(mCurrentState));
	//   21   41:new             #126 <Class ArrayList>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #44  <Field Set mListeners>
	//   25   49:invokespecial   #129 <Method void ArrayList(java.util.Collection)>
	//   26   52:invokeinterface #135 <Method Iterator List.iterator()>
	//   27   57:astore_1        
	//   28   58:aload_1         
	//   29   59:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   30   64:ifeq            88
	//   31   67:aload_1         
	//   32   68:invokeinterface #143 <Method Object Iterator.next()>
	//   33   73:checkcast       #103 <Class ConstraintListener>
	//   34   76:aload_0         
	//   35   77:getfield        #70  <Field Object mCurrentState>
	//   36   80:invokeinterface #107 <Method void ConstraintListener.onConstraintChanged(Object)>
	//*  37   85:goto            58
		obj1;
	//   38   88:aload_2         
		JVM INSTR monitorexit ;
	//   39   89:monitorexit     
		return;
	//   40   90:return          
		obj1;
	//   41   91:aload_2         
		JVM INSTR monitorexit ;
	//   42   92:monitorexit     
		return;
	//   43   93:return          
		obj;
	//   44   94:astore_1        
		obj1;
	//   45   95:aload_2         
		JVM INSTR monitorexit ;
	//   46   96:monitorexit     
		throw obj;
	//   47   97:aload_1         
	//   48   98:athrow          
	}

	public abstract void startTracking();

	public abstract void stopTracking();

	private static final String TAG = Logger.tagWithPrefix("ConstraintTracker");
	protected final Context mAppContext;
	private Object mCurrentState;
	private final Set mListeners = new LinkedHashSet();
	private final Object mLock = new Object();

	static 
	{
	//    0    0:ldc1            #24  <String "ConstraintTracker">
	//    1    2:invokestatic    #30  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #32  <Field String TAG>
	//*   3    8:return          
	}
}
