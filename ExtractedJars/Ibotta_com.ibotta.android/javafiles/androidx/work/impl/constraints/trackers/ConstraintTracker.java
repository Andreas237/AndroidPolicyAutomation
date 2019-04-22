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
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class LinkedHashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void LinkedHashSet()>
	//   11   23:putfield        #30  <Field Set mListeners>
		mAppContext = context.getApplicationContext();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//   15   31:putfield        #38  <Field Context mAppContext>
	//   16   34:return          
	}

	public void addListener(ConstraintListener constraintlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mListeners.add(((Object) (constraintlistener))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field Set mListeners>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #47  <Method boolean Set.add(Object)>
	//*   9   17:ifeq            90
			{
				if(mListeners.size() == 1)
	//*  10   20:aload_0         
	//*  11   21:getfield        #30  <Field Set mListeners>
	//*  12   24:invokeinterface #51  <Method int Set.size()>
	//*  13   29:iconst_1        
	//*  14   30:icmpne          80
				{
					mCurrentState = getInitialState();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #55  <Method Object getInitialState()>
	//   18   38:putfield        #57  <Field Object mCurrentState>
					Logger.debug("ConstraintTracker", String.format("%s: initial state = %s", new Object[] {
						((Object)this).getClass().getSimpleName(), mCurrentState
					}), new Throwable[0]);
	//   19   41:ldc1            #59  <String "ConstraintTracker">
	//   20   43:ldc1            #61  <String "%s: initial state = %s">
	//   21   45:iconst_2        
	//   22   46:anewarray       Object[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:aload_0         
	//   26   52:invokevirtual   #65  <Method Class Object.getClass()>
	//   27   55:invokevirtual   #71  <Method String Class.getSimpleName()>
	//   28   58:aastore         
	//   29   59:dup             
	//   30   60:iconst_1        
	//   31   61:aload_0         
	//   32   62:getfield        #57  <Field Object mCurrentState>
	//   33   65:aastore         
	//   34   66:invokestatic    #77  <Method String String.format(String, Object[])>
	//   35   69:iconst_0        
	//   36   70:anewarray       Throwable[]
	//   37   73:invokestatic    #85  <Method void Logger.debug(String, String, Throwable[])>
					startTracking();
	//   38   76:aload_0         
	//   39   77:invokevirtual   #88  <Method void startTracking()>
				}
				constraintlistener.onConstraintChanged(mCurrentState);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #57  <Field Object mCurrentState>
	//   43   85:invokeinterface #94  <Method void ConstraintListener.onConstraintChanged(Object)>
			}
		}
	//   44   90:aload_2         
	//   45   91:monitorexit     
		return;
	//   46   92:return          
		constraintlistener;
	//   47   93:astore_1        
		obj;
	//   48   94:aload_2         
		JVM INSTR monitorexit ;
	//   49   95:monitorexit     
		throw constraintlistener;
	//   50   96:aload_1         
	//   51   97:athrow          
	}

	public abstract Object getInitialState();

	public void removeListener(ConstraintListener constraintlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mListeners.remove(((Object) (constraintlistener))) && mListeners.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field Set mListeners>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #100 <Method boolean Set.remove(Object)>
	//*   9   17:ifeq            36
	//*  10   20:aload_0         
	//*  11   21:getfield        #30  <Field Set mListeners>
	//*  12   24:invokeinterface #104 <Method boolean Set.isEmpty()>
	//*  13   29:ifeq            36
				stopTracking();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #107 <Method void stopTracking()>
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
	//    1    1:getfield        #25  <Field Object mLock>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mCurrentState == obj || mCurrentState != null && mCurrentState.equals(obj))
	//*   5    7:aload_0         
	//*   6    8:getfield        #57  <Field Object mCurrentState>
	//*   7   11:aload_1         
	//*   8   12:if_acmpeq       91
	//*   9   15:aload_0         
	//*  10   16:getfield        #57  <Field Object mCurrentState>
	//*  11   19:ifnull          36
	//*  12   22:aload_0         
	//*  13   23:getfield        #57  <Field Object mCurrentState>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #111 <Method boolean Object.equals(Object)>
	//*  16   30:ifeq            36
			break MISSING_BLOCK_LABEL_91;
	//   17   33:goto            91
		mCurrentState = obj;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #57  <Field Object mCurrentState>
		for(obj = ((Object) (((List) (new ArrayList(((java.util.Collection) (mListeners))))).iterator())); ((Iterator) (obj)).hasNext(); ((ConstraintListener)((Iterator) (obj)).next()).onConstraintChanged(mCurrentState));
	//   21   41:new             #113 <Class ArrayList>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #30  <Field Set mListeners>
	//   25   49:invokespecial   #116 <Method void ArrayList(java.util.Collection)>
	//   26   52:invokeinterface #122 <Method Iterator List.iterator()>
	//   27   57:astore_1        
	//   28   58:aload_1         
	//   29   59:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   30   64:ifeq            88
	//   31   67:aload_1         
	//   32   68:invokeinterface #130 <Method Object Iterator.next()>
	//   33   73:checkcast       #90  <Class ConstraintListener>
	//   34   76:aload_0         
	//   35   77:getfield        #57  <Field Object mCurrentState>
	//   36   80:invokeinterface #94  <Method void ConstraintListener.onConstraintChanged(Object)>
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

	protected final Context mAppContext;
	private Object mCurrentState;
	private final Set mListeners = new LinkedHashSet();
	private final Object mLock = new Object();
}
