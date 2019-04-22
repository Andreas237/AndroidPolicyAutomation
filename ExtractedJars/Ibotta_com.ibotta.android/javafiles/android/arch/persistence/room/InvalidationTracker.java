// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.core.internal.SafeIterableMap;
import android.arch.persistence.db.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

// Referenced classes of package android.arch.persistence.room:
//			RoomDatabase

public class InvalidationTracker
{
	static class ObservedTableTracker
	{

		int[] getTablesToSync()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(mNeedsSync && !mPendingSync) goto _L2; else goto _L1
		//    2    2:aload_0         
		//    3    3:getfield        #42  <Field boolean mNeedsSync>
		//    4    6:ifeq            119
		//    5    9:aload_0         
		//    6   10:getfield        #44  <Field boolean mPendingSync>
		//    7   13:ifeq            19
		//*   8   16:goto            119
_L2:
			int j = mTableObservers.length;
		//    9   19:aload_0         
		//   10   20:getfield        #23  <Field long[] mTableObservers>
		//   11   23:arraylength     
		//   12   24:istore_3        
			int i = 0;
		//   13   25:iconst_0        
		//   14   26:istore_1        
_L5:
			byte byte0 = 1;
		//   15   27:iconst_1        
		//   16   28:istore_2        
			if(i >= j) goto _L4; else goto _L3
		//   17   29:iload_1         
		//   18   30:iload_3         
		//   19   31:icmpge          98
_L3:
			boolean flag;
			Object obj;
			if(mTableObservers[i] > 0L)
		//*  20   34:aload_0         
		//*  21   35:getfield        #23  <Field long[] mTableObservers>
		//*  22   38:iload_1         
		//*  23   39:laload          
		//*  24   40:lconst_0        
		//*  25   41:lcmp            
		//*  26   42:ifle            130
				flag = true;
		//   27   45:iconst_1        
		//   28   46:istore          4
			else
		//*  29   48:goto            51
		//*  30   51:iload           4
		//*  31   53:aload_0         
		//*  32   54:getfield        #25  <Field boolean[] mTriggerStates>
		//*  33   57:iload_1         
		//*  34   58:baload          
		//*  35   59:icmpeq          76
		//*  36   62:aload_0         
		//*  37   63:getfield        #27  <Field int[] mTriggerStateChanges>
		//*  38   66:astore          5
		//*  39   68:iload           4
		//*  40   70:ifeq            136
		//*  41   73:goto            138
		//*  42   76:aload_0         
		//*  43   77:getfield        #27  <Field int[] mTriggerStateChanges>
		//*  44   80:iload_1         
		//*  45   81:iconst_0        
		//*  46   82:iastore         
		//*  47   83:aload_0         
		//*  48   84:getfield        #25  <Field boolean[] mTriggerStates>
		//*  49   87:iload_1         
		//*  50   88:iload           4
		//*  51   90:bastore         
		//*  52   91:iload_1         
		//*  53   92:iconst_1        
		//*  54   93:iadd            
		//*  55   94:istore_1        
		//*  56   95:goto            27
		//*  57   98:aload_0         
		//*  58   99:iconst_1        
		//*  59  100:putfield        #44  <Field boolean mPendingSync>
		//*  60  103:aload_0         
		//*  61  104:iconst_0        
		//*  62  105:putfield        #42  <Field boolean mNeedsSync>
		//*  63  108:aload_0         
		//*  64  109:getfield        #27  <Field int[] mTriggerStateChanges>
		//*  65  112:astore          5
		//*  66  114:aload_0         
		//*  67  115:monitorexit     
		//*  68  116:aload           5
		//*  69  118:areturn         
		//*  70  119:aload_0         
		//*  71  120:monitorexit     
		//*  72  121:aconst_null     
		//*  73  122:areturn         
		//*  74  123:astore          5
		//*  75  125:aload_0         
		//*  76  126:monitorexit     
		//*  77  127:aload           5
		//*  78  129:athrow          
				flag = false;
		//   79  130:iconst_0        
		//   80  131:istore          4
			if(flag == mTriggerStates[i])
				break MISSING_BLOCK_LABEL_76;
			obj = ((Object) (mTriggerStateChanges));
			if(!flag)
		//*  81  133:goto            51
				byte0 = 2;
		//   82  136:iconst_2        
		//   83  137:istore_2        
			break MISSING_BLOCK_LABEL_138;
			mTriggerStateChanges[i] = 0;
_L6:
			mTriggerStates[i] = flag;
			i++;
			  goto _L5
_L4:
			mPendingSync = true;
			mNeedsSync = false;
			obj = ((Object) (mTriggerStateChanges));
			this;
			JVM INSTR monitorexit ;
			return ((int []) (obj));
_L1:
			this;
			JVM INSTR monitorexit ;
			return null;
			obj;
			this;
			JVM INSTR monitorexit ;
			throw obj;
			obj[i] = ((int) (byte0));
		//   84  138:aload           5
		//   85  140:iload_1         
		//   86  141:iload_2         
		//   87  142:iastore         
			  goto _L6
		//*  88  143:goto            83
		}

		transient boolean onAdded(int ai[])
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int j = ai.length;
		//    2    2:aload_1         
		//    3    3:arraylength     
		//    4    4:istore_3        
			int i;
			boolean flag;
			i = 0;
		//    5    5:iconst_0        
		//    6    6:istore_2        
			flag = false;
		//    7    7:iconst_0        
		//    8    8:istore          5
_L2:
			int k;
			if(i >= j)
				break MISSING_BLOCK_LABEL_58;
		//    9   10:iload_2         
		//   10   11:iload_3         
		//   11   12:icmpge          58
			k = ai[i];
		//   12   15:aload_1         
		//   13   16:iload_2         
		//   14   17:iaload          
		//   15   18:istore          4
			long l;
			l = mTableObservers[k];
		//   16   20:aload_0         
		//   17   21:getfield        #23  <Field long[] mTableObservers>
		//   18   24:iload           4
		//   19   26:laload          
		//   20   27:lstore          6
			mTableObservers[k] = 1L + l;
		//   21   29:aload_0         
		//   22   30:getfield        #23  <Field long[] mTableObservers>
		//   23   33:iload           4
		//   24   35:lconst_1        
		//   25   36:lload           6
		//   26   38:ladd            
		//   27   39:lastore         
			if(l != 0L)
				break MISSING_BLOCK_LABEL_68;
		//   28   40:lload           6
		//   29   42:lconst_0        
		//   30   43:lcmp            
		//   31   44:ifne            68
			mNeedsSync = true;
		//   32   47:aload_0         
		//   33   48:iconst_1        
		//   34   49:putfield        #42  <Field boolean mNeedsSync>
			flag = true;
		//   35   52:iconst_1        
		//   36   53:istore          5
			break MISSING_BLOCK_LABEL_68;
		//   37   55:goto            68
			this;
		//   38   58:aload_0         
			JVM INSTR monitorexit ;
		//   39   59:monitorexit     
			return flag;
		//   40   60:iload           5
		//   41   62:ireturn         
			ai;
		//   42   63:astore_1        
			this;
		//   43   64:aload_0         
			JVM INSTR monitorexit ;
		//   44   65:monitorexit     
			throw ai;
		//   45   66:aload_1         
		//   46   67:athrow          
			i++;
		//   47   68:iload_2         
		//   48   69:iconst_1        
		//   49   70:iadd            
		//   50   71:istore_2        
			if(true) goto _L2; else goto _L1
		//   51   72:goto            10
_L1:
		}

		transient boolean onRemoved(int ai[])
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int j = ai.length;
		//    2    2:aload_1         
		//    3    3:arraylength     
		//    4    4:istore_3        
			int i;
			boolean flag;
			i = 0;
		//    5    5:iconst_0        
		//    6    6:istore_2        
			flag = false;
		//    7    7:iconst_0        
		//    8    8:istore          5
_L2:
			int k;
			if(i >= j)
				break MISSING_BLOCK_LABEL_58;
		//    9   10:iload_2         
		//   10   11:iload_3         
		//   11   12:icmpge          58
			k = ai[i];
		//   12   15:aload_1         
		//   13   16:iload_2         
		//   14   17:iaload          
		//   15   18:istore          4
			long l;
			l = mTableObservers[k];
		//   16   20:aload_0         
		//   17   21:getfield        #23  <Field long[] mTableObservers>
		//   18   24:iload           4
		//   19   26:laload          
		//   20   27:lstore          6
			mTableObservers[k] = l - 1L;
		//   21   29:aload_0         
		//   22   30:getfield        #23  <Field long[] mTableObservers>
		//   23   33:iload           4
		//   24   35:lload           6
		//   25   37:lconst_1        
		//   26   38:lsub            
		//   27   39:lastore         
			if(l != 1L)
				break MISSING_BLOCK_LABEL_68;
		//   28   40:lload           6
		//   29   42:lconst_1        
		//   30   43:lcmp            
		//   31   44:ifne            68
			mNeedsSync = true;
		//   32   47:aload_0         
		//   33   48:iconst_1        
		//   34   49:putfield        #42  <Field boolean mNeedsSync>
			flag = true;
		//   35   52:iconst_1        
		//   36   53:istore          5
			break MISSING_BLOCK_LABEL_68;
		//   37   55:goto            68
			this;
		//   38   58:aload_0         
			JVM INSTR monitorexit ;
		//   39   59:monitorexit     
			return flag;
		//   40   60:iload           5
		//   41   62:ireturn         
			ai;
		//   42   63:astore_1        
			this;
		//   43   64:aload_0         
			JVM INSTR monitorexit ;
		//   44   65:monitorexit     
			throw ai;
		//   45   66:aload_1         
		//   46   67:athrow          
			i++;
		//   47   68:iload_2         
		//   48   69:iconst_1        
		//   49   70:iadd            
		//   50   71:istore_2        
			if(true) goto _L2; else goto _L1
		//   51   72:goto            10
_L1:
		}

		void onSyncCompleted()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mPendingSync = false;
		//    2    2:aload_0         
		//    3    3:iconst_0        
		//    4    4:putfield        #44  <Field boolean mPendingSync>
			this;
		//    5    7:aload_0         
			JVM INSTR monitorexit ;
		//    6    8:monitorexit     
			return;
		//    7    9:return          
			Exception exception;
			exception;
		//    8   10:astore_1        
			this;
		//    9   11:aload_0         
			JVM INSTR monitorexit ;
		//   10   12:monitorexit     
			throw exception;
		//   11   13:aload_1         
		//   12   14:athrow          
		}

		boolean mNeedsSync;
		boolean mPendingSync;
		final long mTableObservers[];
		final int mTriggerStateChanges[];
		final boolean mTriggerStates[];

		ObservedTableTracker(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mTableObservers = new long[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:newarray        long[]
		//    5    8:putfield        #23  <Field long[] mTableObservers>
			mTriggerStates = new boolean[i];
		//    6   11:aload_0         
		//    7   12:iload_1         
		//    8   13:newarray        boolean[]
		//    9   15:putfield        #25  <Field boolean[] mTriggerStates>
			mTriggerStateChanges = new int[i];
		//   10   18:aload_0         
		//   11   19:iload_1         
		//   12   20:newarray        int[]
		//   13   22:putfield        #27  <Field int[] mTriggerStateChanges>
			Arrays.fill(mTableObservers, 0L);
		//   14   25:aload_0         
		//   15   26:getfield        #23  <Field long[] mTableObservers>
		//   16   29:lconst_0        
		//   17   30:invokestatic    #33  <Method void Arrays.fill(long[], long)>
			Arrays.fill(mTriggerStates, false);
		//   18   33:aload_0         
		//   19   34:getfield        #25  <Field boolean[] mTriggerStates>
		//   20   37:iconst_0        
		//   21   38:invokestatic    #36  <Method void Arrays.fill(boolean[], boolean)>
		//   22   41:return          
		}
	}

	public static abstract class Observer
	{

		public abstract void onInvalidated(Set set);

		final String mTables[];

		protected transient Observer(String s, String as[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mTables = (String[])Arrays.copyOf(((Object []) (as)), as.length + 1);
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:arraylength     
		//    6    8:iconst_1        
		//    7    9:iadd            
		//    8   10:invokestatic    #21  <Method Object[] Arrays.copyOf(Object[], int)>
		//    9   13:checkcast       #22  <Class String[]>
		//   10   16:putfield        #24  <Field String[] mTables>
			mTables[as.length] = s;
		//   11   19:aload_0         
		//   12   20:getfield        #24  <Field String[] mTables>
		//   13   23:aload_2         
		//   14   24:arraylength     
		//   15   25:aload_1         
		//   16   26:aastore         
		//   17   27:return          
		}

		public Observer(String as[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mTables = (String[])Arrays.copyOf(((Object []) (as)), as.length);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:arraylength     
		//    6    8:invokestatic    #21  <Method Object[] Arrays.copyOf(Object[], int)>
		//    7   11:checkcast       #22  <Class String[]>
		//    8   14:putfield        #24  <Field String[] mTables>
		//    9   17:return          
		}
	}

	static class ObserverWrapper
	{

		void checkForInvalidation(long al[])
		{
			int j = mTableIds.length;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int[] mTableIds>
		//    2    4:arraylength     
		//    3    5:istore_3        
			Object obj = null;
		//    4    6:aconst_null     
		//    5    7:astore          6
			for(int i = 0; i < j;)
		//*   6    9:iconst_0        
		//*   7   10:istore_2        
		//*   8   11:iload_2         
		//*   9   12:iload_3         
		//*  10   13:icmpge          110
			{
				long l = al[mTableIds[i]];
		//   11   16:aload_1         
		//   12   17:aload_0         
		//   13   18:getfield        #27  <Field int[] mTableIds>
		//   14   21:iload_2         
		//   15   22:iaload          
		//   16   23:laload          
		//   17   24:lstore          4
				long al1[] = mVersions;
		//   18   26:aload_0         
		//   19   27:getfield        #31  <Field long[] mVersions>
		//   20   30:astore          8
				Object obj1 = obj;
		//   21   32:aload           6
		//   22   34:astore          7
				if(al1[i] < l)
		//*  23   36:aload           8
		//*  24   38:iload_2         
		//*  25   39:laload          
		//*  26   40:lload           4
		//*  27   42:lcmp            
		//*  28   43:ifge            99
				{
					al1[i] = l;
		//   29   46:aload           8
		//   30   48:iload_2         
		//   31   49:lload           4
		//   32   51:lastore         
					if(j == 1)
		//*  33   52:iload_3         
		//*  34   53:iconst_1        
		//*  35   54:icmpne          66
					{
						obj1 = ((Object) (mSingleTableSet));
		//   36   57:aload_0         
		//   37   58:getfield        #46  <Field Set mSingleTableSet>
		//   38   61:astore          7
					} else
		//*  39   63:goto            99
					{
						obj1 = obj;
		//   40   66:aload           6
		//   41   68:astore          7
						if(obj == null)
		//*  42   70:aload           6
		//*  43   72:ifnonnull       85
							obj1 = ((Object) (new ArraySet(j)));
		//   44   75:new             #33  <Class ArraySet>
		//   45   78:dup             
		//   46   79:iload_3         
		//   47   80:invokespecial   #52  <Method void ArraySet(int)>
		//   48   83:astore          7
						((Set) (obj1)).add(((Object) (mTableNames[i])));
		//   49   85:aload           7
		//   50   87:aload_0         
		//   51   88:getfield        #29  <Field String[] mTableNames>
		//   52   91:iload_2         
		//   53   92:aaload          
		//   54   93:invokeinterface #55  <Method boolean Set.add(Object)>
		//   55   98:pop             
					}
				}
				i++;
		//   56   99:iload_2         
		//   57  100:iconst_1        
		//   58  101:iadd            
		//   59  102:istore_2        
				obj = obj1;
		//   60  103:aload           7
		//   61  105:astore          6
			}

		//*  62  107:goto            11
			if(obj != null)
		//*  63  110:aload           6
		//*  64  112:ifnull          124
				mObserver.onInvalidated(((Set) (obj)));
		//   65  115:aload_0         
		//   66  116:getfield        #25  <Field InvalidationTracker$Observer mObserver>
		//   67  119:aload           6
		//   68  121:invokevirtual   #61  <Method void InvalidationTracker$Observer.onInvalidated(Set)>
		//   69  124:return          
		}

		final Observer mObserver;
		private final Set mSingleTableSet;
		final int mTableIds[];
		private final String mTableNames[];
		private final long mVersions[];

		ObserverWrapper(Observer observer, int ai[], String as[], long al[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mObserver = observer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field InvalidationTracker$Observer mObserver>
			mTableIds = ai;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field int[] mTableIds>
			mTableNames = as;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #29  <Field String[] mTableNames>
			mVersions = al;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #31  <Field long[] mVersions>
			if(ai.length == 1)
		//*  14   25:aload_2         
		//*  15   26:arraylength     
		//*  16   27:iconst_1        
		//*  17   28:icmpne          59
			{
				observer = ((Observer) (new ArraySet()));
		//   18   31:new             #33  <Class ArraySet>
		//   19   34:dup             
		//   20   35:invokespecial   #34  <Method void ArraySet()>
		//   21   38:astore_1        
				((ArraySet) (observer)).add(((Object) (mTableNames[0])));
		//   22   39:aload_1         
		//   23   40:aload_0         
		//   24   41:getfield        #29  <Field String[] mTableNames>
		//   25   44:iconst_0        
		//   26   45:aaload          
		//   27   46:invokevirtual   #38  <Method boolean ArraySet.add(Object)>
		//   28   49:pop             
				mSingleTableSet = Collections.unmodifiableSet(((Set) (observer)));
		//   29   50:aload_0         
		//   30   51:aload_1         
		//   31   52:invokestatic    #44  <Method Set Collections.unmodifiableSet(Set)>
		//   32   55:putfield        #46  <Field Set mSingleTableSet>
				return;
		//   33   58:return          
			} else
			{
				mSingleTableSet = null;
		//   34   59:aload_0         
		//   35   60:aconst_null     
		//   36   61:putfield        #46  <Field Set mSingleTableSet>
				return;
		//   37   64:return          
			}
		}
	}

	static class WeakObserver extends Observer
	{

		public void onInvalidated(Set set)
		{
			Observer observer = (Observer)mDelegateRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field WeakReference mDelegateRef>
		//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
		//    3    7:checkcast       #4   <Class InvalidationTracker$Observer>
		//    4   10:astore_2        
			if(observer == null)
		//*   5   11:aload_2         
		//*   6   12:ifnonnull       24
			{
				mTracker.removeObserver(((Observer) (this)));
		//    7   15:aload_0         
		//    8   16:getfield        #23  <Field InvalidationTracker mTracker>
		//    9   19:aload_0         
		//   10   20:invokevirtual   #42  <Method void InvalidationTracker.removeObserver(InvalidationTracker$Observer)>
				return;
		//   11   23:return          
			} else
			{
				observer.onInvalidated(set);
		//   12   24:aload_2         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #44  <Method void InvalidationTracker$Observer.onInvalidated(Set)>
				return;
		//   15   29:return          
			}
		}

		final WeakReference mDelegateRef;
		final InvalidationTracker mTracker;

		WeakObserver(InvalidationTracker invalidationtracker, Observer observer)
		{
			super(observer.mTables);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:getfield        #18  <Field String[] InvalidationTracker$Observer.mTables>
		//    3    5:invokespecial   #21  <Method void InvalidationTracker$Observer(String[])>
			mTracker = invalidationtracker;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #23  <Field InvalidationTracker mTracker>
			mDelegateRef = new WeakReference(((Object) (observer)));
		//    7   13:aload_0         
		//    8   14:new             #25  <Class WeakReference>
		//    9   17:dup             
		//   10   18:aload_2         
		//   11   19:invokespecial   #28  <Method void WeakReference(Object)>
		//   12   22:putfield        #30  <Field WeakReference mDelegateRef>
		//   13   25:return          
		}
	}


	public transient InvalidationTracker(RoomDatabase roomdatabase, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		mQueryArgs = new Object[1];
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:putfield        #70  <Field Object[] mQueryArgs>
		mMaxVersion = 0L;
	//    6   12:aload_0         
	//    7   13:lconst_0        
	//    8   14:putfield        #72  <Field long mMaxVersion>
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		mPendingRefresh = new AtomicBoolean(false);
	//   11   19:aload_0         
	//   12   20:new             #74  <Class AtomicBoolean>
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:invokespecial   #77  <Method void AtomicBoolean(boolean)>
	//   16   28:putfield        #79  <Field AtomicBoolean mPendingRefresh>
		mInitialized = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #81  <Field boolean mInitialized>
	//   20   36:aload_0         
	//   21   37:new             #83  <Class SafeIterableMap>
	//   22   40:dup             
	//   23   41:invokespecial   #84  <Method void SafeIterableMap()>
	//   24   44:putfield        #86  <Field SafeIterableMap mObserverMap>
		mRefreshRunnable = new Runnable() {

			private boolean checkUpdatedTable()
			{
				boolean flag;
				Cursor cursor;
				cursor = mDatabase.query("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", mQueryArgs);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field InvalidationTracker this$0>
			//    2    4:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
			//    3    7:ldc1            #26  <String "SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;">
			//    4    9:aload_0         
			//    5   10:getfield        #14  <Field InvalidationTracker this$0>
			//    6   13:invokestatic    #30  <Method Object[] InvalidationTracker.access$300(InvalidationTracker)>
			//    7   16:invokevirtual   #36  <Method Cursor RoomDatabase.query(String, Object[])>
			//    8   19:astore          5
				flag = false;
			//    9   21:iconst_0        
			//   10   22:istore_2        
_L2:
				if(!cursor.moveToNext())
					break; /* Loop/switch isn't completed */
			//   11   23:aload           5
			//   12   25:invokeinterface #41  <Method boolean Cursor.moveToNext()>
			//   13   30:ifeq            75
				long l = cursor.getLong(0);
			//   14   33:aload           5
			//   15   35:iconst_0        
			//   16   36:invokeinterface #45  <Method long Cursor.getLong(int)>
			//   17   41:lstore_3        
				int k = cursor.getInt(1);
			//   18   42:aload           5
			//   19   44:iconst_1        
			//   20   45:invokeinterface #49  <Method int Cursor.getInt(int)>
			//   21   50:istore_1        
				mTableVersions[k] = l;
			//   22   51:aload_0         
			//   23   52:getfield        #14  <Field InvalidationTracker this$0>
			//   24   55:getfield        #53  <Field long[] InvalidationTracker.mTableVersions>
			//   25   58:iload_1         
			//   26   59:lload_3         
			//   27   60:lastore         
				mMaxVersion = l;
			//   28   61:aload_0         
			//   29   62:getfield        #14  <Field InvalidationTracker this$0>
			//   30   65:lload_3         
			//   31   66:invokestatic    #57  <Method long InvalidationTracker.access$402(InvalidationTracker, long)>
			//   32   69:pop2            
				flag = true;
			//   33   70:iconst_1        
			//   34   71:istore_2        
				if(true) goto _L2; else goto _L1
			//   35   72:goto            23
_L1:
				cursor.close();
			//   36   75:aload           5
			//   37   77:invokeinterface #60  <Method void Cursor.close()>
				return flag;
			//   38   82:iload_2         
			//   39   83:ireturn         
				Exception exception;
				exception;
			//   40   84:astore          6
				cursor.close();
			//   41   86:aload           5
			//   42   88:invokeinterface #60  <Method void Cursor.close()>
				throw exception;
			//   43   93:aload           6
			//   44   95:athrow          
			}

			public void run()
			{
				boolean flag;
				boolean flag1;
				boolean flag2;
				boolean flag3;
				boolean flag4;
				Object obj2;
				obj2 = ((Object) (mDatabase.getCloseLock()));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field InvalidationTracker this$0>
			//    2    4:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
			//    3    7:invokevirtual   #69  <Method Lock RoomDatabase.getCloseLock()>
			//    4   10:astore          8
				flag2 = false;
			//    5   12:iconst_0        
			//    6   13:istore_3        
				flag4 = false;
			//    7   14:iconst_0        
			//    8   15:istore          5
				flag3 = false;
			//    9   17:iconst_0        
			//   10   18:istore          4
				flag = flag2;
			//   11   20:iload_3         
			//   12   21:istore_1        
				flag1 = flag4;
			//   13   22:iload           5
			//   14   24:istore_2        
				((Lock) (obj2)).lock();
			//   15   25:aload           8
			//   16   27:invokeinterface #74  <Method void Lock.lock()>
				flag = flag2;
			//   17   32:iload_3         
			//   18   33:istore_1        
				flag1 = flag4;
			//   19   34:iload           5
			//   20   36:istore_2        
				boolean flag5 = ensureInitialization();
			//   21   37:aload_0         
			//   22   38:getfield        #14  <Field InvalidationTracker this$0>
			//   23   41:invokestatic    #78  <Method boolean InvalidationTracker.access$100(InvalidationTracker)>
			//   24   44:istore          6
				if(!flag5)
			//*  25   46:iload           6
			//*  26   48:ifne            59
				{
					((Lock) (obj2)).unlock();
			//   27   51:aload           8
			//   28   53:invokeinterface #81  <Method void Lock.unlock()>
					return;
			//   29   58:return          
				}
				flag = flag2;
			//   30   59:iload_3         
			//   31   60:istore_1        
				flag1 = flag4;
			//   32   61:iload           5
			//   33   63:istore_2        
				flag5 = mPendingRefresh.compareAndSet(true, false);
			//   34   64:aload_0         
			//   35   65:getfield        #14  <Field InvalidationTracker this$0>
			//   36   68:getfield        #85  <Field AtomicBoolean InvalidationTracker.mPendingRefresh>
			//   37   71:iconst_1        
			//   38   72:iconst_0        
			//   39   73:invokevirtual   #91  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
			//   40   76:istore          6
				if(!flag5)
			//*  41   78:iload           6
			//*  42   80:ifne            91
				{
					((Lock) (obj2)).unlock();
			//   43   83:aload           8
			//   44   85:invokeinterface #81  <Method void Lock.unlock()>
					return;
			//   45   90:return          
				}
				flag = flag2;
			//   46   91:iload_3         
			//   47   92:istore_1        
				flag1 = flag4;
			//   48   93:iload           5
			//   49   95:istore_2        
				flag5 = mDatabase.inTransaction();
			//   50   96:aload_0         
			//   51   97:getfield        #14  <Field InvalidationTracker this$0>
			//   52  100:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
			//   53  103:invokevirtual   #94  <Method boolean RoomDatabase.inTransaction()>
			//   54  106:istore          6
				if(flag5)
			//*  55  108:iload           6
			//*  56  110:ifeq            121
				{
					((Lock) (obj2)).unlock();
			//   57  113:aload           8
			//   58  115:invokeinterface #81  <Method void Lock.unlock()>
					return;
			//   59  120:return          
				}
				flag = flag2;
			//   60  121:iload_3         
			//   61  122:istore_1        
				flag1 = flag4;
			//   62  123:iload           5
			//   63  125:istore_2        
				mCleanupStatement.executeUpdateDelete();
			//   64  126:aload_0         
			//   65  127:getfield        #14  <Field InvalidationTracker this$0>
			//   66  130:invokestatic    #98  <Method SupportSQLiteStatement InvalidationTracker.access$200(InvalidationTracker)>
			//   67  133:invokeinterface #104 <Method int SupportSQLiteStatement.executeUpdateDelete()>
			//   68  138:pop             
				flag = flag2;
			//   69  139:iload_3         
			//   70  140:istore_1        
				flag1 = flag4;
			//   71  141:iload           5
			//   72  143:istore_2        
				mQueryArgs[0] = ((Object) (Long.valueOf(mMaxVersion)));
			//   73  144:aload_0         
			//   74  145:getfield        #14  <Field InvalidationTracker this$0>
			//   75  148:invokestatic    #30  <Method Object[] InvalidationTracker.access$300(InvalidationTracker)>
			//   76  151:iconst_0        
			//   77  152:aload_0         
			//   78  153:getfield        #14  <Field InvalidationTracker this$0>
			//   79  156:invokestatic    #108 <Method long InvalidationTracker.access$400(InvalidationTracker)>
			//   80  159:invokestatic    #114 <Method Long Long.valueOf(long)>
			//   81  162:aastore         
				flag = flag2;
			//   82  163:iload_3         
			//   83  164:istore_1        
				flag1 = flag4;
			//   84  165:iload           5
			//   85  167:istore_2        
				if(!mDatabase.mWriteAheadLoggingEnabled)
					break MISSING_BLOCK_LABEL_271;
			//   86  168:aload_0         
			//   87  169:getfield        #14  <Field InvalidationTracker this$0>
			//   88  172:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
			//   89  175:getfield        #118 <Field boolean RoomDatabase.mWriteAheadLoggingEnabled>
			//   90  178:ifeq            271
				flag = flag2;
			//   91  181:iload_3         
			//   92  182:istore_1        
				flag1 = flag4;
			//   93  183:iload           5
			//   94  185:istore_2        
				Object obj = ((Object) (mDatabase.getOpenHelper().getWritableDatabase()));
			//   95  186:aload_0         
			//   96  187:getfield        #14  <Field InvalidationTracker this$0>
			//   97  190:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
			//   98  193:invokevirtual   #122 <Method SupportSQLiteOpenHelper RoomDatabase.getOpenHelper()>
			//   99  196:invokeinterface #128 <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
			//  100  201:astore          7
				flag2 = flag3;
			//  101  203:iload           4
			//  102  205:istore_3        
				((SupportSQLiteDatabase) (obj)).beginTransaction();
			//  103  206:aload           7
			//  104  208:invokeinterface #133 <Method void SupportSQLiteDatabase.beginTransaction()>
				flag2 = flag3;
			//  105  213:iload           4
			//  106  215:istore_3        
				flag3 = checkUpdatedTable();
			//  107  216:aload_0         
			//  108  217:invokespecial   #135 <Method boolean checkUpdatedTable()>
			//  109  220:istore          4
				flag2 = flag3;
			//  110  222:iload           4
			//  111  224:istore_3        
				((SupportSQLiteDatabase) (obj)).setTransactionSuccessful();
			//  112  225:aload           7
			//  113  227:invokeinterface #138 <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
				flag = flag3;
			//  114  232:iload           4
			//  115  234:istore_1        
				flag1 = flag3;
			//  116  235:iload           4
			//  117  237:istore_2        
				((SupportSQLiteDatabase) (obj)).endTransaction();
			//  118  238:aload           7
			//  119  240:invokeinterface #141 <Method void SupportSQLiteDatabase.endTransaction()>
				flag = flag3;
			//  120  245:iload           4
			//  121  247:istore_1        
				break MISSING_BLOCK_LABEL_310;
			//  122  248:goto            310
				Exception exception;
				exception;
			//  123  251:astore          9
				flag = flag2;
			//  124  253:iload_3         
			//  125  254:istore_1        
				flag1 = flag2;
			//  126  255:iload_3         
			//  127  256:istore_2        
				((SupportSQLiteDatabase) (obj)).endTransaction();
			//  128  257:aload           7
			//  129  259:invokeinterface #141 <Method void SupportSQLiteDatabase.endTransaction()>
				flag = flag2;
			//  130  264:iload_3         
			//  131  265:istore_1        
				flag1 = flag2;
			//  132  266:iload_3         
			//  133  267:istore_2        
				Object obj1;
				try
				{
					throw exception;
			//  134  268:aload           9
			//  135  270:athrow          
				}
			//* 136  271:iload_3         
			//* 137  272:istore_1        
			//* 138  273:iload           5
			//* 139  275:istore_2        
			//* 140  276:aload_0         
			//* 141  277:invokespecial   #135 <Method boolean checkUpdatedTable()>
			//* 142  280:istore_3        
			//* 143  281:iload_3         
			//* 144  282:istore_1        
			//* 145  283:goto            310
			//* 146  286:astore          7
			//* 147  288:goto            399
			//* 148  291:astore          7
			//* 149  293:goto            300
				// Misplaced declaration of an exception variable
				catch(Object obj1)
			//* 150  296:astore          7
				{
					flag = flag1;
			//  151  298:iload_2         
			//  152  299:istore_1        
				}
				// Misplaced declaration of an exception variable
				catch(Object obj1) { }
				break MISSING_BLOCK_LABEL_300;
				flag = flag2;
				flag1 = flag4;
				flag2 = checkUpdatedTable();
				flag = flag2;
				break MISSING_BLOCK_LABEL_310;
				obj1;
				break MISSING_BLOCK_LABEL_399;
				Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", ((Throwable) (obj1)));
			//  153  300:ldc1            #143 <String "ROOM">
			//  154  302:ldc1            #145 <String "Cannot run invalidation tracker. Is the db closed?">
			//  155  304:aload           7
			//  156  306:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
			//  157  309:pop             
				((Lock) (obj2)).unlock();
			//  158  310:aload           8
			//  159  312:invokeinterface #81  <Method void Lock.unlock()>
				if(!flag)
					break MISSING_BLOCK_LABEL_398;
			//  160  317:iload_1         
			//  161  318:ifeq            398
				obj1 = ((Object) (mObserverMap));
			//  162  321:aload_0         
			//  163  322:getfield        #14  <Field InvalidationTracker this$0>
			//  164  325:getfield        #155 <Field SafeIterableMap InvalidationTracker.mObserverMap>
			//  165  328:astore          7
				obj1;
			//  166  330:aload           7
				JVM INSTR monitorenter ;
			//  167  332:monitorenter    
				for(obj2 = ((Object) (mObserverMap.iterator())); ((Iterator) (obj2)).hasNext(); ((ObserverWrapper)((java.util.Map.Entry)((Iterator) (obj2)).next()).getValue()).checkForInvalidation(mTableVersions));
			//  168  333:aload_0         
			//  169  334:getfield        #14  <Field InvalidationTracker this$0>
			//  170  337:getfield        #155 <Field SafeIterableMap InvalidationTracker.mObserverMap>
			//  171  340:invokevirtual   #161 <Method Iterator SafeIterableMap.iterator()>
			//  172  343:astore          8
			//  173  345:aload           8
			//  174  347:invokeinterface #166 <Method boolean Iterator.hasNext()>
			//  175  352:ifeq            386
			//  176  355:aload           8
			//  177  357:invokeinterface #170 <Method Object Iterator.next()>
			//  178  362:checkcast       #172 <Class java.util.Map$Entry>
			//  179  365:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
			//  180  370:checkcast       #177 <Class InvalidationTracker$ObserverWrapper>
			//  181  373:aload_0         
			//  182  374:getfield        #14  <Field InvalidationTracker this$0>
			//  183  377:getfield        #53  <Field long[] InvalidationTracker.mTableVersions>
			//  184  380:invokevirtual   #181 <Method void InvalidationTracker$ObserverWrapper.checkForInvalidation(long[])>
			//* 185  383:goto            345
				obj1;
			//  186  386:aload           7
				JVM INSTR monitorexit ;
			//  187  388:monitorexit     
				return;
			//  188  389:return          
				obj2;
			//  189  390:astore          8
				obj1;
			//  190  392:aload           7
				JVM INSTR monitorexit ;
			//  191  394:monitorexit     
				throw obj2;
			//  192  395:aload           8
			//  193  397:athrow          
				return;
			//  194  398:return          
				((Lock) (obj2)).unlock();
			//  195  399:aload           8
			//  196  401:invokeinterface #81  <Method void Lock.unlock()>
				throw obj1;
			//  197  406:aload           7
			//  198  408:athrow          
			}

			final InvalidationTracker this$0;

			
			{
				this$0 = InvalidationTracker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field InvalidationTracker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   25   47:aload_0         
	//   26   48:new             #6   <Class InvalidationTracker$1>
	//   27   51:dup             
	//   28   52:aload_0         
	//   29   53:invokespecial   #89  <Method void InvalidationTracker$1(InvalidationTracker)>
	//   30   56:putfield        #91  <Field Runnable mRefreshRunnable>
		mDatabase = roomdatabase;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:putfield        #93  <Field RoomDatabase mDatabase>
		mObservedTableTracker = new ObservedTableTracker(as.length);
	//   34   64:aload_0         
	//   35   65:new             #8   <Class InvalidationTracker$ObservedTableTracker>
	//   36   68:dup             
	//   37   69:aload_2         
	//   38   70:arraylength     
	//   39   71:invokespecial   #96  <Method void InvalidationTracker$ObservedTableTracker(int)>
	//   40   74:putfield        #98  <Field InvalidationTracker$ObservedTableTracker mObservedTableTracker>
		mTableIdLookup = new ArrayMap();
	//   41   77:aload_0         
	//   42   78:new             #100 <Class ArrayMap>
	//   43   81:dup             
	//   44   82:invokespecial   #101 <Method void ArrayMap()>
	//   45   85:putfield        #103 <Field ArrayMap mTableIdLookup>
		int j = as.length;
	//   46   88:aload_2         
	//   47   89:arraylength     
	//   48   90:istore          4
		mTableNames = new String[j];
	//   49   92:aload_0         
	//   50   93:iload           4
	//   51   95:anewarray       String[]
	//   52   98:putfield        #105 <Field String[] mTableNames>
		for(; i < j; i++)
	//*  53  101:iload_3         
	//*  54  102:iload           4
	//*  55  104:icmpge          144
		{
			roomdatabase = ((RoomDatabase) (as[i].toLowerCase(Locale.US)));
	//   56  107:aload_2         
	//   57  108:iload_3         
	//   58  109:aaload          
	//   59  110:getstatic       #111 <Field Locale Locale.US>
	//   60  113:invokevirtual   #115 <Method String String.toLowerCase(Locale)>
	//   61  116:astore_1        
			mTableIdLookup.put(((Object) (roomdatabase)), ((Object) (Integer.valueOf(i))));
	//   62  117:aload_0         
	//   63  118:getfield        #103 <Field ArrayMap mTableIdLookup>
	//   64  121:aload_1         
	//   65  122:iload_3         
	//   66  123:invokestatic    #121 <Method Integer Integer.valueOf(int)>
	//   67  126:invokevirtual   #125 <Method Object ArrayMap.put(Object, Object)>
	//   68  129:pop             
			mTableNames[i] = ((String) (roomdatabase));
	//   69  130:aload_0         
	//   70  131:getfield        #105 <Field String[] mTableNames>
	//   71  134:iload_3         
	//   72  135:aload_1         
	//   73  136:aastore         
		}

	//   74  137:iload_3         
	//   75  138:iconst_1        
	//   76  139:iadd            
	//   77  140:istore_3        
	//*  78  141:goto            101
		mTableVersions = new long[as.length];
	//   79  144:aload_0         
	//   80  145:aload_2         
	//   81  146:arraylength     
	//   82  147:newarray        long[]
	//   83  149:putfield        #127 <Field long[] mTableVersions>
		Arrays.fill(mTableVersions, 0L);
	//   84  152:aload_0         
	//   85  153:getfield        #127 <Field long[] mTableVersions>
	//   86  156:lconst_0        
	//   87  157:invokestatic    #133 <Method void Arrays.fill(long[], long)>
	//   88  160:return          
	}

	private static void appendTriggerName(StringBuilder stringbuilder, String s, String s1)
	{
		stringbuilder.append("`");
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <String "`">
	//    2    3:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append("room_table_modification_trigger_");
	//    4    7:aload_0         
	//    5    8:ldc1            #164 <String "room_table_modification_trigger_">
	//    6   10:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(s);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   11   19:pop             
		stringbuilder.append("_");
	//   12   20:aload_0         
	//   13   21:ldc1            #166 <String "_">
	//   14   23:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		stringbuilder.append(s1);
	//   16   27:aload_0         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
		stringbuilder.append("`");
	//   20   33:aload_0         
	//   21   34:ldc1            #156 <String "`">
	//   22   36:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   23   39:pop             
	//   24   40:return          
	}

	private boolean ensureInitialization()
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field RoomDatabase mDatabase>
	//*   2    4:invokevirtual   #171 <Method boolean RoomDatabase.isOpen()>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(!mInitialized)
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field boolean mInitialized>
	//*   8   16:ifne            32
			mDatabase.getOpenHelper().getWritableDatabase();
	//    9   19:aload_0         
	//   10   20:getfield        #93  <Field RoomDatabase mDatabase>
	//   11   23:invokevirtual   #175 <Method SupportSQLiteOpenHelper RoomDatabase.getOpenHelper()>
	//   12   26:invokeinterface #181 <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//   13   31:pop             
		if(!mInitialized)
	//*  14   32:aload_0         
	//*  15   33:getfield        #81  <Field boolean mInitialized>
	//*  16   36:ifne            49
		{
			Log.e("ROOM", "database is not initialized even though it is open");
	//   17   39:ldc1            #183 <String "ROOM">
	//   18   41:ldc1            #185 <String "database is not initialized even though it is open">
	//   19   43:invokestatic    #191 <Method int Log.e(String, String)>
	//   20   46:pop             
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
		} else
		{
			return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         
		}
	}

	private void startTrackingTable(SupportSQLiteDatabase supportsqlitedatabase, int i)
	{
		String s = mTableNames[i];
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String[] mTableNames>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    5    8:new             #158 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #194 <Method void StringBuilder()>
	//    8   15:astore          6
		String as[] = TRIGGERS;
	//    9   17:getstatic       #59  <Field String[] TRIGGERS>
	//   10   20:astore          7
		int k = as.length;
	//   11   22:aload           7
	//   12   24:arraylength     
	//   13   25:istore          4
		for(int j = 0; j < k; j++)
	//*  14   27:iconst_0        
	//*  15   28:istore_3        
	//*  16   29:iload_3         
	//*  17   30:iload           4
	//*  18   32:icmpge          153
		{
			String s1 = as[j];
	//   19   35:aload           7
	//   20   37:iload_3         
	//   21   38:aaload          
	//   22   39:astore          8
			stringbuilder.setLength(0);
	//   23   41:aload           6
	//   24   43:iconst_0        
	//   25   44:invokevirtual   #197 <Method void StringBuilder.setLength(int)>
			stringbuilder.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
	//   26   47:aload           6
	//   27   49:ldc1            #199 <String "CREATE TEMP TRIGGER IF NOT EXISTS ">
	//   28   51:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			appendTriggerName(stringbuilder, s, s1);
	//   30   55:aload           6
	//   31   57:aload           5
	//   32   59:aload           8
	//   33   61:invokestatic    #201 <Method void appendTriggerName(StringBuilder, String, String)>
			stringbuilder.append(" AFTER ");
	//   34   64:aload           6
	//   35   66:ldc1            #203 <String " AFTER ">
	//   36   68:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			stringbuilder.append(s1);
	//   38   72:aload           6
	//   39   74:aload           8
	//   40   76:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			stringbuilder.append(" ON `");
	//   42   80:aload           6
	//   43   82:ldc1            #205 <String " ON `">
	//   44   84:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   45   87:pop             
			stringbuilder.append(s);
	//   46   88:aload           6
	//   47   90:aload           5
	//   48   92:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
			stringbuilder.append("` BEGIN INSERT OR REPLACE INTO ");
	//   50   96:aload           6
	//   51   98:ldc1            #207 <String "` BEGIN INSERT OR REPLACE INTO ">
	//   52  100:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
			stringbuilder.append("room_table_modification_log");
	//   54  104:aload           6
	//   55  106:ldc1            #209 <String "room_table_modification_log">
	//   56  108:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
			stringbuilder.append(" VALUES(null, ");
	//   58  112:aload           6
	//   59  114:ldc1            #211 <String " VALUES(null, ">
	//   60  116:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   61  119:pop             
			stringbuilder.append(i);
	//   62  120:aload           6
	//   63  122:iload_2         
	//   64  123:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   65  126:pop             
			stringbuilder.append("); END");
	//   66  127:aload           6
	//   67  129:ldc1            #216 <String "); END">
	//   68  131:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   69  134:pop             
			supportsqlitedatabase.execSQL(stringbuilder.toString());
	//   70  135:aload_1         
	//   71  136:aload           6
	//   72  138:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   73  141:invokeinterface #226 <Method void SupportSQLiteDatabase.execSQL(String)>
		}

	//   74  146:iload_3         
	//   75  147:iconst_1        
	//   76  148:iadd            
	//   77  149:istore_3        
	//*  78  150:goto            29
	//   79  153:return          
	}

	private void stopTrackingTable(SupportSQLiteDatabase supportsqlitedatabase, int i)
	{
		String s = mTableNames[i];
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String[] mTableNames>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    5    8:new             #158 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #194 <Method void StringBuilder()>
	//    8   15:astore          5
		String as[] = TRIGGERS;
	//    9   17:getstatic       #59  <Field String[] TRIGGERS>
	//   10   20:astore          6
		int j = as.length;
	//   11   22:aload           6
	//   12   24:arraylength     
	//   13   25:istore_3        
		for(i = 0; i < j; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          80
		{
			String s1 = as[i];
	//   19   33:aload           6
	//   20   35:iload_2         
	//   21   36:aaload          
	//   22   37:astore          7
			stringbuilder.setLength(0);
	//   23   39:aload           5
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #197 <Method void StringBuilder.setLength(int)>
			stringbuilder.append("DROP TRIGGER IF EXISTS ");
	//   26   45:aload           5
	//   27   47:ldc1            #229 <String "DROP TRIGGER IF EXISTS ">
	//   28   49:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			appendTriggerName(stringbuilder, s, s1);
	//   30   53:aload           5
	//   31   55:aload           4
	//   32   57:aload           7
	//   33   59:invokestatic    #201 <Method void appendTriggerName(StringBuilder, String, String)>
			supportsqlitedatabase.execSQL(stringbuilder.toString());
	//   34   62:aload_1         
	//   35   63:aload           5
	//   36   65:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   37   68:invokeinterface #226 <Method void SupportSQLiteDatabase.execSQL(String)>
		}

	//   38   73:iload_2         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_2        
	//*  42   77:goto            28
	//   43   80:return          
	}

	public void addObserver(Observer observer)
	{
		String as[] = observer.mTables;
	//    0    0:aload_1         
	//    1    1:getfield        #235 <Field String[] InvalidationTracker$Observer.mTables>
	//    2    4:astore          5
		int ai[] = new int[as.length];
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:newarray        int[]
	//    6   11:astore          4
		int j = as.length;
	//    7   13:aload           5
	//    8   15:arraylength     
	//    9   16:istore_3        
		long al[] = new long[as.length];
	//   10   17:aload           5
	//   11   19:arraylength     
	//   12   20:newarray        long[]
	//   13   22:astore          6
		for(int i = 0; i < j;)
	//*  14   24:iconst_0        
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          118
		{
			Integer integer = (Integer)mTableIdLookup.get(((Object) (as[i].toLowerCase(Locale.US))));
	//   19   31:aload_0         
	//   20   32:getfield        #103 <Field ArrayMap mTableIdLookup>
	//   21   35:aload           5
	//   22   37:iload_2         
	//   23   38:aaload          
	//   24   39:getstatic       #111 <Field Locale Locale.US>
	//   25   42:invokevirtual   #115 <Method String String.toLowerCase(Locale)>
	//   26   45:invokevirtual   #239 <Method Object ArrayMap.get(Object)>
	//   27   48:checkcast       #117 <Class Integer>
	//   28   51:astore          7
			if(integer != null)
	//*  29   53:aload           7
	//*  30   55:ifnull          82
			{
				ai[i] = integer.intValue();
	//   31   58:aload           4
	//   32   60:iload_2         
	//   33   61:aload           7
	//   34   63:invokevirtual   #243 <Method int Integer.intValue()>
	//   35   66:iastore         
				al[i] = mMaxVersion;
	//   36   67:aload           6
	//   37   69:iload_2         
	//   38   70:aload_0         
	//   39   71:getfield        #72  <Field long mMaxVersion>
	//   40   74:lastore         
				i++;
	//   41   75:iload_2         
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore_2        
			} else
	//*  45   79:goto            26
			{
				observer = ((Observer) (new StringBuilder()));
	//   46   82:new             #158 <Class StringBuilder>
	//   47   85:dup             
	//   48   86:invokespecial   #194 <Method void StringBuilder()>
	//   49   89:astore_1        
				((StringBuilder) (observer)).append("There is no table with name ");
	//   50   90:aload_1         
	//   51   91:ldc1            #245 <String "There is no table with name ">
	//   52   93:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
				((StringBuilder) (observer)).append(as[i]);
	//   54   97:aload_1         
	//   55   98:aload           5
	//   56  100:iload_2         
	//   57  101:aaload          
	//   58  102:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   59  105:pop             
				throw new IllegalArgumentException(((StringBuilder) (observer)).toString());
	//   60  106:new             #247 <Class IllegalArgumentException>
	//   61  109:dup             
	//   62  110:aload_1         
	//   63  111:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   64  114:invokespecial   #249 <Method void IllegalArgumentException(String)>
	//   65  117:athrow          
			}
		}

		ObserverWrapper observerwrapper = new ObserverWrapper(observer, ai, as, al);
	//   66  118:new             #14  <Class InvalidationTracker$ObserverWrapper>
	//   67  121:dup             
	//   68  122:aload_1         
	//   69  123:aload           4
	//   70  125:aload           5
	//   71  127:aload           6
	//   72  129:invokespecial   #252 <Method void InvalidationTracker$ObserverWrapper(InvalidationTracker$Observer, int[], String[], long[])>
	//   73  132:astore          6
		synchronized(mObserverMap)
	//*  74  134:aload_0         
	//*  75  135:getfield        #86  <Field SafeIterableMap mObserverMap>
	//*  76  138:astore          5
	//*  77  140:aload           5
	//*  78  142:monitorenter    
		{
			observer = ((Observer) ((ObserverWrapper)mObserverMap.putIfAbsent(((Object) (observer)), ((Object) (observerwrapper)))));
	//   79  143:aload_0         
	//   80  144:getfield        #86  <Field SafeIterableMap mObserverMap>
	//   81  147:aload_1         
	//   82  148:aload           6
	//   83  150:invokevirtual   #255 <Method Object SafeIterableMap.putIfAbsent(Object, Object)>
	//   84  153:checkcast       #14  <Class InvalidationTracker$ObserverWrapper>
	//   85  156:astore_1        
		}
	//   86  157:aload           5
	//   87  159:monitorexit     
		if(observer == null && mObservedTableTracker.onAdded(ai))
	//*  88  160:aload_1         
	//*  89  161:ifnonnull       180
	//*  90  164:aload_0         
	//*  91  165:getfield        #98  <Field InvalidationTracker$ObservedTableTracker mObservedTableTracker>
	//*  92  168:aload           4
	//*  93  170:invokevirtual   #259 <Method boolean InvalidationTracker$ObservedTableTracker.onAdded(int[])>
	//*  94  173:ifeq            180
			syncTriggers();
	//   95  176:aload_0         
	//   96  177:invokevirtual   #262 <Method void syncTriggers()>
		return;
	//   97  180:return          
		observer;
	//   98  181:astore_1        
		safeiterablemap;
	//   99  182:aload           5
		JVM INSTR monitorexit ;
	//  100  184:monitorexit     
		throw observer;
	//  101  185:aload_1         
	//  102  186:athrow          
	}

	public void addWeakObserver(Observer observer)
	{
		addObserver(((Observer) (new WeakObserver(this, observer))));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class InvalidationTracker$WeakObserver>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #267 <Method void InvalidationTracker$WeakObserver(InvalidationTracker, InvalidationTracker$Observer)>
	//    6   10:invokevirtual   #269 <Method void addObserver(InvalidationTracker$Observer)>
	//    7   13:return          
	}

	void internalInit(SupportSQLiteDatabase supportsqlitedatabase)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!mInitialized)
			break MISSING_BLOCK_LABEL_21;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean mInitialized>
	//    4    6:ifeq            21
		Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
	//    5    9:ldc1            #183 <String "ROOM">
	//    6   11:ldc2            #273 <String "Invalidation tracker is initialized twice :/.">
	//    7   14:invokestatic    #191 <Method int Log.e(String, String)>
	//    8   17:pop             
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return;
	//   11   20:return          
		supportsqlitedatabase.beginTransaction();
	//   12   21:aload_1         
	//   13   22:invokeinterface #276 <Method void SupportSQLiteDatabase.beginTransaction()>
		supportsqlitedatabase.execSQL("PRAGMA temp_store = MEMORY;");
	//   14   27:aload_1         
	//   15   28:ldc2            #278 <String "PRAGMA temp_store = MEMORY;">
	//   16   31:invokeinterface #226 <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("PRAGMA recursive_triggers='ON';");
	//   17   36:aload_1         
	//   18   37:ldc2            #280 <String "PRAGMA recursive_triggers='ON';">
	//   19   40:invokeinterface #226 <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
	//   20   45:aload_1         
	//   21   46:ldc2            #282 <String "CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)">
	//   22   49:invokeinterface #226 <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.setTransactionSuccessful();
	//   23   54:aload_1         
	//   24   55:invokeinterface #285 <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
		supportsqlitedatabase.endTransaction();
	//   25   60:aload_1         
	//   26   61:invokeinterface #288 <Method void SupportSQLiteDatabase.endTransaction()>
		syncTriggers(supportsqlitedatabase);
	//   27   66:aload_0         
	//   28   67:aload_1         
	//   29   68:invokevirtual   #290 <Method void syncTriggers(SupportSQLiteDatabase)>
		mCleanupStatement = supportsqlitedatabase.compileStatement("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
	//   30   71:aload_0         
	//   31   72:aload_1         
	//   32   73:ldc2            #292 <String "DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)">
	//   33   76:invokeinterface #296 <Method SupportSQLiteStatement SupportSQLiteDatabase.compileStatement(String)>
	//   34   81:putfield        #146 <Field SupportSQLiteStatement mCleanupStatement>
		mInitialized = true;
	//   35   84:aload_0         
	//   36   85:iconst_1        
	//   37   86:putfield        #81  <Field boolean mInitialized>
		this;
	//   38   89:aload_0         
		JVM INSTR monitorexit ;
	//   39   90:monitorexit     
		return;
	//   40   91:return          
		Exception exception;
		exception;
	//   41   92:astore_2        
		supportsqlitedatabase.endTransaction();
	//   42   93:aload_1         
	//   43   94:invokeinterface #288 <Method void SupportSQLiteDatabase.endTransaction()>
		throw exception;
	//   44   99:aload_2         
	//   45  100:athrow          
		supportsqlitedatabase;
	//   46  101:astore_1        
		this;
	//   47  102:aload_0         
		JVM INSTR monitorexit ;
	//   48  103:monitorexit     
		throw supportsqlitedatabase;
	//   49  104:aload_1         
	//   50  105:athrow          
	}

	public void refreshVersionsAsync()
	{
		if(mPendingRefresh.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AtomicBoolean mPendingRefresh>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #301 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            22
			ArchTaskExecutor.getInstance().executeOnDiskIO(mRefreshRunnable);
	//    6   12:invokestatic    #307 <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//    7   15:aload_0         
	//    8   16:getfield        #91  <Field Runnable mRefreshRunnable>
	//    9   19:invokevirtual   #311 <Method void ArchTaskExecutor.executeOnDiskIO(Runnable)>
	//   10   22:return          
	}

	public void removeObserver(Observer observer)
	{
		synchronized(mObserverMap)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field SafeIterableMap mObserverMap>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			observer = ((Observer) ((ObserverWrapper)mObserverMap.remove(((Object) (observer)))));
	//    5    7:aload_0         
	//    6    8:getfield        #86  <Field SafeIterableMap mObserverMap>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #315 <Method Object SafeIterableMap.remove(Object)>
	//    9   15:checkcast       #14  <Class InvalidationTracker$ObserverWrapper>
	//   10   18:astore_1        
		}
	//   11   19:aload_2         
	//   12   20:monitorexit     
		if(observer != null && mObservedTableTracker.onRemoved(((ObserverWrapper) (observer)).mTableIds))
	//*  13   21:aload_1         
	//*  14   22:ifnull          43
	//*  15   25:aload_0         
	//*  16   26:getfield        #98  <Field InvalidationTracker$ObservedTableTracker mObservedTableTracker>
	//*  17   29:aload_1         
	//*  18   30:getfield        #319 <Field int[] InvalidationTracker$ObserverWrapper.mTableIds>
	//*  19   33:invokevirtual   #322 <Method boolean InvalidationTracker$ObservedTableTracker.onRemoved(int[])>
	//*  20   36:ifeq            43
			syncTriggers();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #262 <Method void syncTriggers()>
		return;
	//   23   43:return          
		observer;
	//   24   44:astore_1        
		safeiterablemap;
	//   25   45:aload_2         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		throw observer;
	//   27   47:aload_1         
	//   28   48:athrow          
	}

	void syncTriggers()
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field RoomDatabase mDatabase>
	//*   2    4:invokevirtual   #171 <Method boolean RoomDatabase.isOpen()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			syncTriggers(mDatabase.getOpenHelper().getWritableDatabase());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #93  <Field RoomDatabase mDatabase>
	//    8   16:invokevirtual   #175 <Method SupportSQLiteOpenHelper RoomDatabase.getOpenHelper()>
	//    9   19:invokeinterface #181 <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//   10   24:invokevirtual   #290 <Method void syncTriggers(SupportSQLiteDatabase)>
			return;
	//   11   27:return          
		}
	}

	void syncTriggers(SupportSQLiteDatabase supportsqlitedatabase)
	{
		if(supportsqlitedatabase.inTransaction())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #329 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//*   2    6:ifeq            10
			return;
	//    3    9:return          
_L3:
		Lock lock;
		lock = mDatabase.getCloseLock();
	//    4   10:aload_0         
	//    5   11:getfield        #93  <Field RoomDatabase mDatabase>
	//    6   14:invokevirtual   #333 <Method Lock RoomDatabase.getCloseLock()>
	//    7   17:astore          4
		lock.lock();
	//    8   19:aload           4
	//    9   21:invokeinterface #338 <Method void Lock.lock()>
		Object obj = ((Object) (mObservedTableTracker.getTablesToSync()));
	//   10   26:aload_0         
	//   11   27:getfield        #98  <Field InvalidationTracker$ObservedTableTracker mObservedTableTracker>
	//   12   30:invokevirtual   #342 <Method int[] InvalidationTracker$ObservedTableTracker.getTablesToSync()>
	//   13   33:astore          5
		int i;
		int j;
		if(obj == null)
	//*  14   35:aload           5
	//*  15   37:ifnonnull       48
		{
			try
			{
				lock.unlock();
	//   16   40:aload           4
	//   17   42:invokeinterface #345 <Method void Lock.unlock()>
				return;
	//   18   47:return          
			}
	//*  19   48:aload           5
	//*  20   50:arraylength     
	//*  21   51:istore_3        
	//*  22   52:aload_1         
	//*  23   53:invokeinterface #276 <Method void SupportSQLiteDatabase.beginTransaction()>
	//*  24   58:iconst_0        
	//*  25   59:istore_2        
	//*  26   60:goto            147
	//*  27   63:aload_0         
	//*  28   64:aload_1         
	//*  29   65:iload_2         
	//*  30   66:invokespecial   #347 <Method void stopTrackingTable(SupportSQLiteDatabase, int)>
	//*  31   69:goto            180
	//*  32   72:aload_0         
	//*  33   73:aload_1         
	//*  34   74:iload_2         
	//*  35   75:invokespecial   #349 <Method void startTrackingTable(SupportSQLiteDatabase, int)>
	//*  36   78:goto            180
	//*  37   81:aload_1         
	//*  38   82:invokeinterface #285 <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
	//*  39   87:aload_1         
	//*  40   88:invokeinterface #288 <Method void SupportSQLiteDatabase.endTransaction()>
	//*  41   93:aload_0         
	//*  42   94:getfield        #98  <Field InvalidationTracker$ObservedTableTracker mObservedTableTracker>
	//*  43   97:invokevirtual   #352 <Method void InvalidationTracker$ObservedTableTracker.onSyncCompleted()>
	//*  44  100:aload           4
	//*  45  102:invokeinterface #345 <Method void Lock.unlock()>
	//*  46  107:goto            10
	//*  47  110:astore          5
	//*  48  112:aload_1         
	//*  49  113:invokeinterface #288 <Method void SupportSQLiteDatabase.endTransaction()>
	//*  50  118:aload           5
	//*  51  120:athrow          
	//*  52  121:astore_1        
	//*  53  122:aload           4
	//*  54  124:invokeinterface #345 <Method void Lock.unlock()>
	//*  55  129:aload_1         
	//*  56  130:athrow          
	//*  57  131:astore_1        
	//*  58  132:goto            136
			// Misplaced declaration of an exception variable
			catch(SupportSQLiteDatabase supportsqlitedatabase) { }
	//   59  135:astore_1        
			// Misplaced declaration of an exception variable
			catch(SupportSQLiteDatabase supportsqlitedatabase) { }
			Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", ((Throwable) (supportsqlitedatabase)));
	//   60  136:ldc1            #183 <String "ROOM">
	//   61  138:ldc2            #354 <String "Cannot run invalidation tracker. Is the db closed?">
	//   62  141:aload_1         
	//   63  142:invokestatic    #357 <Method int Log.e(String, String, Throwable)>
	//   64  145:pop             
			return;
	//   65  146:return          
		}
		j = obj.length;
		supportsqlitedatabase.beginTransaction();
		i = 0;
		  goto _L1
_L7:
		stopTrackingTable(supportsqlitedatabase, i);
		  goto _L2
_L6:
		startTrackingTable(supportsqlitedatabase, i);
		  goto _L2
_L5:
		supportsqlitedatabase.setTransactionSuccessful();
		supportsqlitedatabase.endTransaction();
		mObservedTableTracker.onSyncCompleted();
		lock.unlock();
		  goto _L3
		obj;
		supportsqlitedatabase.endTransaction();
		throw obj;
		supportsqlitedatabase;
		lock.unlock();
		throw supportsqlitedatabase;
_L1:
		if(i >= j) goto _L5; else goto _L4
	//   66  147:iload_2         
	//   67  148:iload_3         
	//   68  149:icmpge          81
_L4:
		obj[i];
	//   69  152:aload           5
	//   70  154:iload_2         
	//   71  155:iaload          
		JVM INSTR tableswitch 1 2: default 180
	//	               1 72
	//	               2 63;
	//   72  156:tableswitch     1 2: default 180
	//	               1 72
	//	               2 63
		   goto _L2 _L6 _L7
_L2:
		i++;
	//   73  180:iload_2         
	//   74  181:iconst_1        
	//   75  182:iadd            
	//   76  183:istore_2        
		  goto _L1
	//*  77  184:goto            147
	}

	private static final String TRIGGERS[] = {
		"UPDATE", "DELETE", "INSERT"
	};
	private volatile SupportSQLiteStatement mCleanupStatement;
	private final RoomDatabase mDatabase;
	private volatile boolean mInitialized;
	private long mMaxVersion;
	private ObservedTableTracker mObservedTableTracker;
	final SafeIterableMap mObserverMap = new SafeIterableMap();
	AtomicBoolean mPendingRefresh;
	private Object mQueryArgs[];
	Runnable mRefreshRunnable;
	ArrayMap mTableIdLookup;
	private String mTableNames[];
	long mTableVersions[];

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #53  <String "UPDATE">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #55  <String "DELETE">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #57  <String "INSERT">
	//   13   18:aastore         
	//   14   19:putstatic       #59  <Field String[] TRIGGERS>
	//*  15   22:return          
	}


/*
	static RoomDatabase access$000(InvalidationTracker invalidationtracker)
	{
		return invalidationtracker.mDatabase;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RoomDatabase mDatabase>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(InvalidationTracker invalidationtracker)
	{
		return invalidationtracker.ensureInitialization();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method boolean ensureInitialization()>
	//    2    4:ireturn         
	}

*/


/*
	static SupportSQLiteStatement access$200(InvalidationTracker invalidationtracker)
	{
		return invalidationtracker.mCleanupStatement;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field SupportSQLiteStatement mCleanupStatement>
	//    2    4:areturn         
	}

*/


/*
	static Object[] access$300(InvalidationTracker invalidationtracker)
	{
		return invalidationtracker.mQueryArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Object[] mQueryArgs>
	//    2    4:areturn         
	}

*/


/*
	static long access$400(InvalidationTracker invalidationtracker)
	{
		return invalidationtracker.mMaxVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long mMaxVersion>
	//    2    4:lreturn         
	}

*/


/*
	static long access$402(InvalidationTracker invalidationtracker, long l)
	{
		invalidationtracker.mMaxVersion = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #72  <Field long mMaxVersion>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/
}
