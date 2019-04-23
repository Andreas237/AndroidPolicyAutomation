// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.util.Arrays;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker

static class InvalidationTracker$ObservedTableTracker
{

	int[] getTablesToSync()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mNeedsSync && !mPendingSync) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #49  <Field boolean mNeedsSync>
	//    4    6:ifeq            119
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field boolean mPendingSync>
	//    7   13:ifeq            19
	//*   8   16:goto            119
_L2:
		int j = mTableObservers.length;
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field long[] mTableObservers>
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
	//*  21   35:getfield        #30  <Field long[] mTableObservers>
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
	//*  32   54:getfield        #32  <Field boolean[] mTriggerStates>
	//*  33   57:iload_1         
	//*  34   58:baload          
	//*  35   59:icmpeq          76
	//*  36   62:aload_0         
	//*  37   63:getfield        #34  <Field int[] mTriggerStateChanges>
	//*  38   66:astore          5
	//*  39   68:iload           4
	//*  40   70:ifeq            136
	//*  41   73:goto            138
	//*  42   76:aload_0         
	//*  43   77:getfield        #34  <Field int[] mTriggerStateChanges>
	//*  44   80:iload_1         
	//*  45   81:iconst_0        
	//*  46   82:iastore         
	//*  47   83:aload_0         
	//*  48   84:getfield        #32  <Field boolean[] mTriggerStates>
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
	//*  59  100:putfield        #51  <Field boolean mPendingSync>
	//*  60  103:aload_0         
	//*  61  104:iconst_0        
	//*  62  105:putfield        #49  <Field boolean mNeedsSync>
	//*  63  108:aload_0         
	//*  64  109:getfield        #34  <Field int[] mTriggerStateChanges>
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
	//   17   21:getfield        #30  <Field long[] mTableObservers>
	//   18   24:iload           4
	//   19   26:laload          
	//   20   27:lstore          6
		mTableObservers[k] = 1L + l;
	//   21   29:aload_0         
	//   22   30:getfield        #30  <Field long[] mTableObservers>
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
	//   34   49:putfield        #49  <Field boolean mNeedsSync>
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
	//   17   21:getfield        #30  <Field long[] mTableObservers>
	//   18   24:iload           4
	//   19   26:laload          
	//   20   27:lstore          6
		mTableObservers[k] = l - 1L;
	//   21   29:aload_0         
	//   22   30:getfield        #30  <Field long[] mTableObservers>
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
	//   34   49:putfield        #49  <Field boolean mNeedsSync>
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
	//    4    4:putfield        #51  <Field boolean mPendingSync>
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

	static final int ADD = 1;
	static final int NO_OP = 0;
	static final int REMOVE = 2;
	boolean mNeedsSync;
	boolean mPendingSync;
	final long mTableObservers[];
	final int mTriggerStateChanges[];
	final boolean mTriggerStates[];

	InvalidationTracker$ObservedTableTracker(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mTableObservers = new long[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        long[]
	//    5    8:putfield        #30  <Field long[] mTableObservers>
		mTriggerStates = new boolean[i];
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:newarray        boolean[]
	//    9   15:putfield        #32  <Field boolean[] mTriggerStates>
		mTriggerStateChanges = new int[i];
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:newarray        int[]
	//   13   22:putfield        #34  <Field int[] mTriggerStateChanges>
		Arrays.fill(mTableObservers, 0L);
	//   14   25:aload_0         
	//   15   26:getfield        #30  <Field long[] mTableObservers>
	//   16   29:lconst_0        
	//   17   30:invokestatic    #40  <Method void Arrays.fill(long[], long)>
		Arrays.fill(mTriggerStates, false);
	//   18   33:aload_0         
	//   19   34:getfield        #32  <Field boolean[] mTriggerStates>
	//   20   37:iconst_0        
	//   21   38:invokestatic    #43  <Method void Arrays.fill(boolean[], boolean)>
	//   22   41:return          
	}
}
