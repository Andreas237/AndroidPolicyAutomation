// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.*;

public abstract class ConstraintController
	implements ConstraintListener
{
	public static interface OnConstraintUpdatedCallback
	{

		public abstract void onConstraintMet(List list);

		public abstract void onConstraintNotMet(List list);
	}


	ConstraintController(ConstraintTracker constrainttracker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List mMatchingWorkSpecIds>
		mTracker = constrainttracker;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field ConstraintTracker mTracker>
	//   10   20:return          
	}

	private void updateCallback()
	{
		if(!mMatchingWorkSpecIds.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field List mMatchingWorkSpecIds>
	//*   2    4:invokeinterface #43  <Method boolean List.isEmpty()>
	//*   3    9:ifne            68
		{
			if(mCallback == null)
	//*   4   12:aload_0         
	//*   5   13:getfield        #45  <Field ConstraintController$OnConstraintUpdatedCallback mCallback>
	//*   6   16:ifnonnull       20
				return;
	//    7   19:return          
			Object obj = mCurrentValue;
	//    8   20:aload_0         
	//    9   21:getfield        #47  <Field Object mCurrentValue>
	//   10   24:astore_1        
			if(obj != null && !isConstrained(obj))
	//*  11   25:aload_1         
	//*  12   26:ifnull          54
	//*  13   29:aload_0         
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #51  <Method boolean isConstrained(Object)>
	//*  16   34:ifeq            40
	//*  17   37:goto            54
			{
				mCallback.onConstraintMet(mMatchingWorkSpecIds);
	//   18   40:aload_0         
	//   19   41:getfield        #45  <Field ConstraintController$OnConstraintUpdatedCallback mCallback>
	//   20   44:aload_0         
	//   21   45:getfield        #31  <Field List mMatchingWorkSpecIds>
	//   22   48:invokeinterface #55  <Method void ConstraintController$OnConstraintUpdatedCallback.onConstraintMet(List)>
				return;
	//   23   53:return          
			} else
			{
				mCallback.onConstraintNotMet(mMatchingWorkSpecIds);
	//   24   54:aload_0         
	//   25   55:getfield        #45  <Field ConstraintController$OnConstraintUpdatedCallback mCallback>
	//   26   58:aload_0         
	//   27   59:getfield        #31  <Field List mMatchingWorkSpecIds>
	//   28   62:invokeinterface #58  <Method void ConstraintController$OnConstraintUpdatedCallback.onConstraintNotMet(List)>
				return;
	//   29   67:return          
			}
		} else
		{
			return;
	//   30   68:return          
		}
	}

	abstract boolean hasConstraint(WorkSpec workspec);

	abstract boolean isConstrained(Object obj);

	public boolean isWorkSpecConstrained(String s)
	{
		Object obj = mCurrentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object mCurrentValue>
	//    2    4:astore_2        
		return obj != null && isConstrained(obj) && mMatchingWorkSpecIds.contains(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:ifnull          32
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #51  <Method boolean isConstrained(Object)>
	//    8   14:ifeq            32
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field List mMatchingWorkSpecIds>
	//   11   21:aload_1         
	//   12   22:invokeinterface #66  <Method boolean List.contains(Object)>
	//   13   27:ifeq            32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public void onConstraintChanged(Object obj)
	{
		mCurrentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Object mCurrentValue>
		updateCallback();
	//    3    5:aload_0         
	//    4    6:invokespecial   #72  <Method void updateCallback()>
	//    5    9:return          
	}

	public void replace(List list)
	{
		mMatchingWorkSpecIds.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List mMatchingWorkSpecIds>
	//    2    4:invokeinterface #77  <Method void List.clear()>
		list = ((List) (list.iterator()));
	//    3    9:aload_1         
	//    4   10:invokeinterface #81  <Method Iterator List.iterator()>
	//    5   15:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    6   16:aload_1         
	//    7   17:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            60
			WorkSpec workspec = (WorkSpec)((Iterator) (list)).next();
	//    9   25:aload_1         
	//   10   26:invokeinterface #90  <Method Object Iterator.next()>
	//   11   31:checkcast       #92  <Class WorkSpec>
	//   12   34:astore_2        
			if(hasConstraint(workspec))
	//*  13   35:aload_0         
	//*  14   36:aload_2         
	//*  15   37:invokevirtual   #94  <Method boolean hasConstraint(WorkSpec)>
	//*  16   40:ifeq            16
				mMatchingWorkSpecIds.add(((Object) (workspec.id)));
	//   17   43:aload_0         
	//   18   44:getfield        #31  <Field List mMatchingWorkSpecIds>
	//   19   47:aload_2         
	//   20   48:getfield        #98  <Field String WorkSpec.id>
	//   21   51:invokeinterface #101 <Method boolean List.add(Object)>
	//   22   56:pop             
		} while(true);
	//   23   57:goto            16
		if(mMatchingWorkSpecIds.isEmpty())
	//*  24   60:aload_0         
	//*  25   61:getfield        #31  <Field List mMatchingWorkSpecIds>
	//*  26   64:invokeinterface #43  <Method boolean List.isEmpty()>
	//*  27   69:ifeq            83
			mTracker.removeListener(((ConstraintListener) (this)));
	//   28   72:aload_0         
	//   29   73:getfield        #33  <Field ConstraintTracker mTracker>
	//   30   76:aload_0         
	//   31   77:invokevirtual   #107 <Method void ConstraintTracker.removeListener(ConstraintListener)>
		else
	//*  32   80:goto            91
			mTracker.addListener(((ConstraintListener) (this)));
	//   33   83:aload_0         
	//   34   84:getfield        #33  <Field ConstraintTracker mTracker>
	//   35   87:aload_0         
	//   36   88:invokevirtual   #110 <Method void ConstraintTracker.addListener(ConstraintListener)>
		updateCallback();
	//   37   91:aload_0         
	//   38   92:invokespecial   #72  <Method void updateCallback()>
	//   39   95:return          
	}

	public void reset()
	{
		if(!mMatchingWorkSpecIds.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field List mMatchingWorkSpecIds>
	//*   2    4:invokeinterface #43  <Method boolean List.isEmpty()>
	//*   3    9:ifne            29
		{
			mMatchingWorkSpecIds.clear();
	//    4   12:aload_0         
	//    5   13:getfield        #31  <Field List mMatchingWorkSpecIds>
	//    6   16:invokeinterface #77  <Method void List.clear()>
			mTracker.removeListener(((ConstraintListener) (this)));
	//    7   21:aload_0         
	//    8   22:getfield        #33  <Field ConstraintTracker mTracker>
	//    9   25:aload_0         
	//   10   26:invokevirtual   #107 <Method void ConstraintTracker.removeListener(ConstraintListener)>
		}
	//   11   29:return          
	}

	public void setCallback(OnConstraintUpdatedCallback onconstraintupdatedcallback)
	{
		if(mCallback != onconstraintupdatedcallback)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ConstraintController$OnConstraintUpdatedCallback mCallback>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mCallback = onconstraintupdatedcallback;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #45  <Field ConstraintController$OnConstraintUpdatedCallback mCallback>
			updateCallback();
	//    7   13:aload_0         
	//    8   14:invokespecial   #72  <Method void updateCallback()>
		}
	//    9   17:return          
	}

	private OnConstraintUpdatedCallback mCallback;
	private Object mCurrentValue;
	private final List mMatchingWorkSpecIds = new ArrayList();
	private ConstraintTracker mTracker;
}
