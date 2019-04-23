// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import java.util.*;

// Referenced classes of package androidx.work.impl.constraints:
//			WorkConstraintsCallback

public class WorkConstraintsTracker
	implements androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
{

	public WorkConstraintsTracker(Context context, WorkConstraintsCallback workconstraintscallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		context = context.getApplicationContext();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//    4    8:astore_1        
		mCallback = workconstraintscallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field WorkConstraintsCallback mCallback>
		mConstraintControllers = (new ConstraintController[] {
			new BatteryChargingController(context), new BatteryNotLowController(context), new StorageNotLowController(context), new NetworkConnectedController(context), new NetworkUnmeteredController(context), new NetworkNotRoamingController(context), new NetworkMeteredController(context)
		});
	//    8   14:aload_0         
	//    9   15:bipush          7
	//   10   17:anewarray       ConstraintController[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:new             #44  <Class BatteryChargingController>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:invokespecial   #47  <Method void BatteryChargingController(Context)>
	//   17   30:aastore         
	//   18   31:dup             
	//   19   32:iconst_1        
	//   20   33:new             #49  <Class BatteryNotLowController>
	//   21   36:dup             
	//   22   37:aload_1         
	//   23   38:invokespecial   #50  <Method void BatteryNotLowController(Context)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_2        
	//   27   44:new             #52  <Class StorageNotLowController>
	//   28   47:dup             
	//   29   48:aload_1         
	//   30   49:invokespecial   #53  <Method void StorageNotLowController(Context)>
	//   31   52:aastore         
	//   32   53:dup             
	//   33   54:iconst_3        
	//   34   55:new             #55  <Class NetworkConnectedController>
	//   35   58:dup             
	//   36   59:aload_1         
	//   37   60:invokespecial   #56  <Method void NetworkConnectedController(Context)>
	//   38   63:aastore         
	//   39   64:dup             
	//   40   65:iconst_4        
	//   41   66:new             #58  <Class NetworkUnmeteredController>
	//   42   69:dup             
	//   43   70:aload_1         
	//   44   71:invokespecial   #59  <Method void NetworkUnmeteredController(Context)>
	//   45   74:aastore         
	//   46   75:dup             
	//   47   76:iconst_5        
	//   48   77:new             #61  <Class NetworkNotRoamingController>
	//   49   80:dup             
	//   50   81:aload_1         
	//   51   82:invokespecial   #62  <Method void NetworkNotRoamingController(Context)>
	//   52   85:aastore         
	//   53   86:dup             
	//   54   87:bipush          6
	//   55   89:new             #64  <Class NetworkMeteredController>
	//   56   92:dup             
	//   57   93:aload_1         
	//   58   94:invokespecial   #65  <Method void NetworkMeteredController(Context)>
	//   59   97:aastore         
	//   60   98:putfield        #67  <Field ConstraintController[] mConstraintControllers>
		mLock = new Object();
	//   61  101:aload_0         
	//   62  102:new             #4   <Class Object>
	//   63  105:dup             
	//   64  106:invokespecial   #32  <Method void Object()>
	//   65  109:putfield        #69  <Field Object mLock>
	//   66  112:return          
	}

	WorkConstraintsTracker(WorkConstraintsCallback workconstraintscallback, ConstraintController aconstraintcontroller[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mCallback = workconstraintscallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field WorkConstraintsCallback mCallback>
		mConstraintControllers = aconstraintcontroller;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #67  <Field ConstraintController[] mConstraintControllers>
		mLock = new Object();
	//    8   14:aload_0         
	//    9   15:new             #4   <Class Object>
	//   10   18:dup             
	//   11   19:invokespecial   #32  <Method void Object()>
	//   12   22:putfield        #69  <Field Object mLock>
	//   13   25:return          
	}

	public boolean areAllConstraintsMet(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object mLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j;
		ConstraintController aconstraintcontroller[];
		aconstraintcontroller = mConstraintControllers;
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field ConstraintController[] mConstraintControllers>
	//    7   13:astore          5
		j = aconstraintcontroller.length;
	//    8   15:aload           5
	//    9   17:arraylength     
	//   10   18:istore_3        
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
_L2:
		ConstraintController constraintcontroller;
		if(i >= j)
			break MISSING_BLOCK_LABEL_83;
	//   13   21:iload_2         
	//   14   22:iload_3         
	//   15   23:icmpge          83
		constraintcontroller = aconstraintcontroller[i];
	//   16   26:aload           5
	//   17   28:iload_2         
	//   18   29:aaload          
	//   19   30:astore          6
		if(!constraintcontroller.isWorkSpecConstrained(s))
			break MISSING_BLOCK_LABEL_94;
	//   20   32:aload           6
	//   21   34:aload_1         
	//   22   35:invokevirtual   #79  <Method boolean ConstraintController.isWorkSpecConstrained(String)>
	//   23   38:ifeq            94
		Logger.get().debug(TAG, String.format("Work %s constrained by %s", new Object[] {
			s, ((Object) (constraintcontroller)).getClass().getSimpleName()
		}), new Throwable[0]);
	//   24   41:invokestatic    #83  <Method Logger Logger.get()>
	//   25   44:getstatic       #27  <Field String TAG>
	//   26   47:ldc1            #85  <String "Work %s constrained by %s">
	//   27   49:iconst_2        
	//   28   50:anewarray       Object[]
	//   29   53:dup             
	//   30   54:iconst_0        
	//   31   55:aload_1         
	//   32   56:aastore         
	//   33   57:dup             
	//   34   58:iconst_1        
	//   35   59:aload           6
	//   36   61:invokevirtual   #89  <Method Class Object.getClass()>
	//   37   64:invokevirtual   #95  <Method String Class.getSimpleName()>
	//   38   67:aastore         
	//   39   68:invokestatic    #101 <Method String String.format(String, Object[])>
	//   40   71:iconst_0        
	//   41   72:anewarray       Throwable[]
	//   42   75:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   43   78:aload           4
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj;
	//   47   83:aload           4
		JVM INSTR monitorexit ;
	//   48   85:monitorexit     
		return true;
	//   49   86:iconst_1        
	//   50   87:ireturn         
		s;
	//   51   88:astore_1        
		obj;
	//   52   89:aload           4
		JVM INSTR monitorexit ;
	//   53   91:monitorexit     
		throw s;
	//   54   92:aload_1         
	//   55   93:athrow          
		i++;
	//   56   94:iload_2         
	//   57   95:iconst_1        
	//   58   96:iadd            
	//   59   97:istore_2        
		if(true) goto _L2; else goto _L1
	//   60   98:goto            21
_L1:
	}

	public void onConstraintMet(List list)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    5    7:new             #111 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #112 <Method void ArrayList()>
	//    8   14:astore_3        
		list = ((List) (list.iterator()));
	//    9   15:aload_1         
	//   10   16:invokeinterface #118 <Method Iterator List.iterator()>
	//   11   21:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   12   22:aload_1         
	//   13   23:invokeinterface #124 <Method boolean Iterator.hasNext()>
	//   14   28:ifeq            90
			String s = (String)((Iterator) (list)).next();
	//   15   31:aload_1         
	//   16   32:invokeinterface #128 <Method Object Iterator.next()>
	//   17   37:checkcast       #97  <Class String>
	//   18   40:astore          4
			if(areAllConstraintsMet(s))
	//*  19   42:aload_0         
	//*  20   43:aload           4
	//*  21   45:invokevirtual   #130 <Method boolean areAllConstraintsMet(String)>
	//*  22   48:ifeq            22
			{
				Logger.get().debug(TAG, String.format("Constraints met for %s", new Object[] {
					s
				}), new Throwable[0]);
	//   23   51:invokestatic    #83  <Method Logger Logger.get()>
	//   24   54:getstatic       #27  <Field String TAG>
	//   25   57:ldc1            #132 <String "Constraints met for %s">
	//   26   59:iconst_1        
	//   27   60:anewarray       Object[]
	//   28   63:dup             
	//   29   64:iconst_0        
	//   30   65:aload           4
	//   31   67:aastore         
	//   32   68:invokestatic    #101 <Method String String.format(String, Object[])>
	//   33   71:iconst_0        
	//   34   72:anewarray       Throwable[]
	//   35   75:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
				((List) (arraylist)).add(((Object) (s)));
	//   36   78:aload_3         
	//   37   79:aload           4
	//   38   81:invokeinterface #136 <Method boolean List.add(Object)>
	//   39   86:pop             
			}
		} while(true);
	//   40   87:goto            22
		if(mCallback != null)
	//*  41   90:aload_0         
	//*  42   91:getfield        #40  <Field WorkConstraintsCallback mCallback>
	//*  43   94:ifnull          107
			mCallback.onAllConstraintsMet(((List) (arraylist)));
	//   44   97:aload_0         
	//   45   98:getfield        #40  <Field WorkConstraintsCallback mCallback>
	//   46  101:aload_3         
	//   47  102:invokeinterface #141 <Method void WorkConstraintsCallback.onAllConstraintsMet(List)>
		obj;
	//   48  107:aload_2         
		JVM INSTR monitorexit ;
	//   49  108:monitorexit     
		return;
	//   50  109:return          
		list;
	//   51  110:astore_1        
		obj;
	//   52  111:aload_2         
		JVM INSTR monitorexit ;
	//   53  112:monitorexit     
		throw list;
	//   54  113:aload_1         
	//   55  114:athrow          
	}

	public void onConstraintNotMet(List list)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mCallback != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #40  <Field WorkConstraintsCallback mCallback>
	//*   7   11:ifnull          24
				mCallback.onAllConstraintsNotMet(list);
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field WorkConstraintsCallback mCallback>
	//   10   18:aload_1         
	//   11   19:invokeinterface #147 <Method void WorkConstraintsCallback.onAllConstraintsNotMet(List)>
		}
	//   12   24:aload_2         
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		list;
	//   15   27:astore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw list;
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	public void replace(List list)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j;
		ConstraintController aconstraintcontroller[];
		aconstraintcontroller = mConstraintControllers;
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field ConstraintController[] mConstraintControllers>
	//    7   13:astore          6
		j = aconstraintcontroller.length;
	//    8   15:aload           6
	//    9   17:arraylength     
	//   10   18:istore          4
		int i;
		boolean flag;
		flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_3        
		i = 0;
	//   13   22:iconst_0        
	//   14   23:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   24:iload_2         
	//   16   25:iload           4
	//   17   27:icmpge          45
		aconstraintcontroller[i].setCallback(((androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback) (null)));
	//   18   30:aload           6
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aconst_null     
	//   22   35:invokevirtual   #152 <Method void ConstraintController.setCallback(androidx.work.impl.constraints.controllers.ConstraintController$OnConstraintUpdatedCallback)>
		i++;
	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
		if(true) goto _L2; else goto _L1
	//   27   42:goto            24
_L1:
		aconstraintcontroller = mConstraintControllers;
	//   28   45:aload_0         
	//   29   46:getfield        #67  <Field ConstraintController[] mConstraintControllers>
	//   30   49:astore          6
		j = aconstraintcontroller.length;
	//   31   51:aload           6
	//   32   53:arraylength     
	//   33   54:istore          4
		i = 0;
	//   34   56:iconst_0        
	//   35   57:istore_2        
_L4:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   36   58:iload_2         
	//   37   59:iload           4
	//   38   61:icmpge          79
		aconstraintcontroller[i].replace(list);
	//   39   64:aload           6
	//   40   66:iload_2         
	//   41   67:aaload          
	//   42   68:aload_1         
	//   43   69:invokevirtual   #154 <Method void ConstraintController.replace(List)>
		i++;
	//   44   72:iload_2         
	//   45   73:iconst_1        
	//   46   74:iadd            
	//   47   75:istore_2        
		if(true) goto _L4; else goto _L3
	//   48   76:goto            58
_L3:
		list = ((List) (mConstraintControllers));
	//   49   79:aload_0         
	//   50   80:getfield        #67  <Field ConstraintController[] mConstraintControllers>
	//   51   83:astore_1        
		j = list.length;
	//   52   84:aload_1         
	//   53   85:arraylength     
	//   54   86:istore          4
		i = ((int) (flag));
	//   55   88:iload_3         
	//   56   89:istore_2        
_L6:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   57   90:iload_2         
	//   58   91:iload           4
	//   59   93:icmpge          110
		((ConstraintController) (list[i])).setCallback(((androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback) (this)));
	//   60   96:aload_1         
	//   61   97:iload_2         
	//   62   98:aaload          
	//   63   99:aload_0         
	//   64  100:invokevirtual   #152 <Method void ConstraintController.setCallback(androidx.work.impl.constraints.controllers.ConstraintController$OnConstraintUpdatedCallback)>
		i++;
	//   65  103:iload_2         
	//   66  104:iconst_1        
	//   67  105:iadd            
	//   68  106:istore_2        
		if(true) goto _L6; else goto _L5
	//   69  107:goto            90
_L5:
		obj;
	//   70  110:aload           5
		JVM INSTR monitorexit ;
	//   71  112:monitorexit     
		return;
	//   72  113:return          
		list;
	//   73  114:astore_1        
		obj;
	//   74  115:aload           5
		JVM INSTR monitorexit ;
	//   75  117:monitorexit     
		throw list;
	//   76  118:aload_1         
	//   77  119:athrow          
	}

	public void reset()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int j;
		ConstraintController aconstraintcontroller[];
		aconstraintcontroller = mConstraintControllers;
	//    5    7:aload_0         
	//    6    8:getfield        #67  <Field ConstraintController[] mConstraintControllers>
	//    7   11:astore          4
		j = aconstraintcontroller.length;
	//    8   13:aload           4
	//    9   15:arraylength     
	//   10   16:istore_2        
		int i = 0;
	//   11   17:iconst_0        
	//   12   18:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:icmpge          38
		aconstraintcontroller[i].reset();
	//   16   24:aload           4
	//   17   26:iload_1         
	//   18   27:aaload          
	//   19   28:invokevirtual   #158 <Method void ConstraintController.reset()>
		i++;
	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
		if(true) goto _L2; else goto _L1
	//   24   35:goto            19
_L1:
		obj;
	//   25   38:aload_3         
		JVM INSTR monitorexit ;
	//   26   39:monitorexit     
		return;
	//   27   40:return          
		Exception exception;
		exception;
	//   28   41:astore          4
		obj;
	//   29   43:aload_3         
		JVM INSTR monitorexit ;
	//   30   44:monitorexit     
		throw exception;
	//   31   45:aload           4
	//   32   47:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("WorkConstraintsTracker");
	private final WorkConstraintsCallback mCallback;
	private final ConstraintController mConstraintControllers[];
	private final Object mLock;

	static 
	{
	//    0    0:ldc1            #19  <String "WorkConstraintsTracker">
	//    1    2:invokestatic    #25  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #27  <Field String TAG>
	//*   3    8:return          
	}
}
