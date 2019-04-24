// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.util.ArrayList;
import java.util.List;

public class CallbackRegistry
	implements Cloneable
{
	public static abstract class NotifierCallback
	{

		public abstract void onNotifyCallback(Object obj, Object obj1, int i, Object obj2);

		public NotifierCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}


	public CallbackRegistry(NotifierCallback notifiercallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mCallbacks = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field List mCallbacks>
		mFirst64Removed = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #38  <Field long mFirst64Removed>
		mNotifier = notifiercallback;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #40  <Field CallbackRegistry$NotifierCallback mNotifier>
	//   13   25:return          
	}

	private boolean isRemoved(int i)
	{
		if(i >= 64) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          64
	//    2    3:icmpge          23
_L1:
		if((mFirst64Removed & 1L << i) == 0L) goto _L4; else goto _L3
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field long mFirst64Removed>
	//    5   10:lconst_1        
	//    6   11:iload_1         
	//    7   12:lshl            
	//    8   13:land            
	//    9   14:lconst_0        
	//   10   15:lcmp            
	//   11   16:ifeq            21
_L3:
		return true;
	//   12   19:iconst_1        
	//   13   20:ireturn         
_L4:
		return false;
	//   14   21:iconst_0        
	//   15   22:ireturn         
_L2:
		if(mRemainderRemoved == null)
	//*  16   23:aload_0         
	//*  17   24:getfield        #47  <Field long[] mRemainderRemoved>
	//*  18   27:ifnonnull       32
			return false;
	//   19   30:iconst_0        
	//   20   31:ireturn         
		int j = i / 64 - 1;
	//   21   32:iload_1         
	//   22   33:bipush          64
	//   23   35:idiv            
	//   24   36:iconst_1        
	//   25   37:isub            
	//   26   38:istore_2        
		if(j >= mRemainderRemoved.length)
	//*  27   39:iload_2         
	//*  28   40:aload_0         
	//*  29   41:getfield        #47  <Field long[] mRemainderRemoved>
	//*  30   44:arraylength     
	//*  31   45:icmplt          50
			return false;
	//   32   48:iconst_0        
	//   33   49:ireturn         
		if((mRemainderRemoved[j] & 1L << i % 64) == 0L)
	//*  34   50:aload_0         
	//*  35   51:getfield        #47  <Field long[] mRemainderRemoved>
	//*  36   54:iload_2         
	//*  37   55:laload          
	//*  38   56:lconst_1        
	//*  39   57:iload_1         
	//*  40   58:bipush          64
	//*  41   60:irem            
	//*  42   61:lshl            
	//*  43   62:land            
	//*  44   63:lconst_0        
	//*  45   64:lcmp            
	//*  46   65:ifne            19
			return false;
	//   47   68:iconst_0        
	//   48   69:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	private void notifyCallbacks(Object obj, int i, Object obj1, int j, int k, long l)
	{
		long l1 = 1L;
	//    0    0:lconst_1        
	//    1    1:lstore          8
		for(; j < k; j++)
	//*   2    3:iload           4
	//*   3    5:iload           5
	//*   4    7:icmpge          56
		{
			if((l & l1) == 0L)
	//*   5   10:lload           6
	//*   6   12:lload           8
	//*   7   14:land            
	//*   8   15:lconst_0        
	//*   9   16:lcmp            
	//*  10   17:ifne            41
				mNotifier.onNotifyCallback(mCallbacks.get(j), obj, i, obj1);
	//   11   20:aload_0         
	//   12   21:getfield        #40  <Field CallbackRegistry$NotifierCallback mNotifier>
	//   13   24:aload_0         
	//   14   25:getfield        #36  <Field List mCallbacks>
	//   15   28:iload           4
	//   16   30:invokeinterface #55  <Method Object List.get(int)>
	//   17   35:aload_1         
	//   18   36:iload_2         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #59  <Method void CallbackRegistry$NotifierCallback.onNotifyCallback(Object, Object, int, Object)>
			l1 <<= 1;
	//   21   41:lload           8
	//   22   43:iconst_1        
	//   23   44:lshl            
	//   24   45:lstore          8
		}

	//   25   47:iload           4
	//   26   49:iconst_1        
	//   27   50:iadd            
	//   28   51:istore          4
	//*  29   53:goto            3
	//   30   56:return          
	}

	private void notifyFirst64(Object obj, int i, Object obj1)
	{
		notifyCallbacks(obj, i, obj1, 0, Math.min(64, mCallbacks.size()), mFirst64Removed);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:bipush          64
	//    6    7:aload_0         
	//    7    8:getfield        #36  <Field List mCallbacks>
	//    8   11:invokeinterface #66  <Method int List.size()>
	//    9   16:invokestatic    #72  <Method int Math.min(int, int)>
	//   10   19:aload_0         
	//   11   20:getfield        #38  <Field long mFirst64Removed>
	//   12   23:invokespecial   #74  <Method void notifyCallbacks(Object, int, Object, int, int, long)>
	//   13   26:return          
	}

	private void notifyRecurse(Object obj, int i, Object obj1)
	{
		int k = mCallbacks.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List mCallbacks>
	//    2    4:invokeinterface #66  <Method int List.size()>
	//    3    9:istore          5
		int j;
		if(mRemainderRemoved == null)
	//*   4   11:aload_0         
	//*   5   12:getfield        #47  <Field long[] mRemainderRemoved>
	//*   6   15:ifnonnull       48
			j = -1;
	//    7   18:iconst_m1       
	//    8   19:istore          4
		else
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:iload_2         
	//*  12   24:aload_3         
	//*  13   25:iload           4
	//*  14   27:invokespecial   #80  <Method void notifyRemainder(Object, int, Object, int)>
	//*  15   30:aload_0         
	//*  16   31:aload_1         
	//*  17   32:iload_2         
	//*  18   33:aload_3         
	//*  19   34:iload           4
	//*  20   36:iconst_2        
	//*  21   37:iadd            
	//*  22   38:bipush          64
	//*  23   40:imul            
	//*  24   41:iload           5
	//*  25   43:lconst_0        
	//*  26   44:invokespecial   #74  <Method void notifyCallbacks(Object, int, Object, int, int, long)>
	//*  27   47:return          
			j = mRemainderRemoved.length - 1;
	//   28   48:aload_0         
	//   29   49:getfield        #47  <Field long[] mRemainderRemoved>
	//   30   52:arraylength     
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:istore          4
		notifyRemainder(obj, i, obj1, j);
		notifyCallbacks(obj, i, obj1, (j + 2) * 64, k, 0L);
	//*  34   57:goto            21
	}

	private void notifyRemainder(Object obj, int i, Object obj1, int j)
	{
		if(j < 0)
	//*   0    0:iload           4
	//*   1    2:ifge            13
		{
			notifyFirst64(obj, i, obj1);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_3         
	//    6    9:invokespecial   #82  <Method void notifyFirst64(Object, int, Object)>
			return;
	//    7   12:return          
		} else
		{
			long l1 = mRemainderRemoved[j];
	//    8   13:aload_0         
	//    9   14:getfield        #47  <Field long[] mRemainderRemoved>
	//   10   17:iload           4
	//   11   19:laload          
	//   12   20:lstore          7
			int k = (j + 1) * 64;
	//   13   22:iload           4
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:bipush          64
	//   17   28:imul            
	//   18   29:istore          5
			int l = Math.min(mCallbacks.size(), k + 64);
	//   19   31:aload_0         
	//   20   32:getfield        #36  <Field List mCallbacks>
	//   21   35:invokeinterface #66  <Method int List.size()>
	//   22   40:iload           5
	//   23   42:bipush          64
	//   24   44:iadd            
	//   25   45:invokestatic    #72  <Method int Math.min(int, int)>
	//   26   48:istore          6
			notifyRemainder(obj, i, obj1, j - 1);
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:iload_2         
	//   30   53:aload_3         
	//   31   54:iload           4
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:invokespecial   #80  <Method void notifyRemainder(Object, int, Object, int)>
			notifyCallbacks(obj, i, obj1, k, l, l1);
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:iload_2         
	//   38   64:aload_3         
	//   39   65:iload           5
	//   40   67:iload           6
	//   41   69:lload           7
	//   42   71:invokespecial   #74  <Method void notifyCallbacks(Object, int, Object, int, int, long)>
			return;
	//   43   74:return          
		}
	}

	private void removeRemovedCallbacks(int i, long l)
	{
		long l1 = 0x0L;
	//    0    0:ldc2w           #86  <Long 0x0L>
	//    1    3:lstore          5
		for(int j = (i + 64) - 1; j >= i; j--)
	//*   2    5:iload_1         
	//*   3    6:bipush          64
	//*   4    8:iadd            
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore          4
	//*   8   13:iload           4
	//*   9   15:iload_1         
	//*  10   16:icmplt          55
		{
			if((l & l1) != 0L)
	//*  11   19:lload_2         
	//*  12   20:lload           5
	//*  13   22:land            
	//*  14   23:lconst_0        
	//*  15   24:lcmp            
	//*  16   25:ifeq            40
				mCallbacks.remove(j);
	//   17   28:aload_0         
	//   18   29:getfield        #36  <Field List mCallbacks>
	//   19   32:iload           4
	//   20   34:invokeinterface #90  <Method Object List.remove(int)>
	//   21   39:pop             
			l1 >>>= 1;
	//   22   40:lload           5
	//   23   42:iconst_1        
	//   24   43:lushr           
	//   25   44:lstore          5
		}

	//   26   46:iload           4
	//   27   48:iconst_1        
	//   28   49:isub            
	//   29   50:istore          4
	//*  30   52:goto            13
	//   31   55:return          
	}

	private void setRemovalBit(int i)
	{
		int j;
		if(i < 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmpge          19
		{
			mFirst64Removed = mFirst64Removed | 1L << i;
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #38  <Field long mFirst64Removed>
	//    6   11:lconst_1        
	//    7   12:iload_1         
	//    8   13:lshl            
	//    9   14:lor             
	//   10   15:putfield        #38  <Field long mFirst64Removed>
			return;
	//   11   18:return          
		}
		j = i / 64 - 1;
	//   12   19:iload_1         
	//   13   20:bipush          64
	//   14   22:idiv            
	//   15   23:iconst_1        
	//   16   24:isub            
	//   17   25:istore_2        
		if(mRemainderRemoved != null) goto _L2; else goto _L1
	//   18   26:aload_0         
	//   19   27:getfield        #47  <Field long[] mRemainderRemoved>
	//   20   30:ifnonnull       70
_L1:
		mRemainderRemoved = new long[mCallbacks.size() / 64];
	//   21   33:aload_0         
	//   22   34:aload_0         
	//   23   35:getfield        #36  <Field List mCallbacks>
	//   24   38:invokeinterface #66  <Method int List.size()>
	//   25   43:bipush          64
	//   26   45:idiv            
	//   27   46:newarray        long[]
	//   28   48:putfield        #47  <Field long[] mRemainderRemoved>
_L4:
		long al[] = mRemainderRemoved;
	//   29   51:aload_0         
	//   30   52:getfield        #47  <Field long[] mRemainderRemoved>
	//   31   55:astore_3        
		al[j] = al[j] | 1L << i % 64;
	//   32   56:aload_3         
	//   33   57:iload_2         
	//   34   58:aload_3         
	//   35   59:iload_2         
	//   36   60:laload          
	//   37   61:lconst_1        
	//   38   62:iload_1         
	//   39   63:bipush          64
	//   40   65:irem            
	//   41   66:lshl            
	//   42   67:lor             
	//   43   68:lastore         
		return;
	//   44   69:return          
_L2:
		if(mRemainderRemoved.length <= j)
	//*  45   70:aload_0         
	//*  46   71:getfield        #47  <Field long[] mRemainderRemoved>
	//*  47   74:arraylength     
	//*  48   75:iload_2         
	//*  49   76:icmpgt          51
		{
			long al1[] = new long[mCallbacks.size() / 64];
	//   50   79:aload_0         
	//   51   80:getfield        #36  <Field List mCallbacks>
	//   52   83:invokeinterface #66  <Method int List.size()>
	//   53   88:bipush          64
	//   54   90:idiv            
	//   55   91:newarray        long[]
	//   56   93:astore_3        
			System.arraycopy(((Object) (mRemainderRemoved)), 0, ((Object) (al1)), 0, mRemainderRemoved.length);
	//   57   94:aload_0         
	//   58   95:getfield        #47  <Field long[] mRemainderRemoved>
	//   59   98:iconst_0        
	//   60   99:aload_3         
	//   61  100:iconst_0        
	//   62  101:aload_0         
	//   63  102:getfield        #47  <Field long[] mRemainderRemoved>
	//   64  105:arraylength     
	//   65  106:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			mRemainderRemoved = al1;
	//   66  109:aload_0         
	//   67  110:aload_3         
	//   68  111:putfield        #47  <Field long[] mRemainderRemoved>
		}
		if(true) goto _L4; else goto _L3
	//   69  114:goto            51
_L3:
	}

	public void add(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(obj != null)
			break MISSING_BLOCK_LABEL_21;
	//    2    2:aload_1         
	//    3    3:ifnonnull       21
		throw new IllegalArgumentException("callback cannot be null");
	//    4    6:new             #102 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #104 <String "callback cannot be null">
	//    7   12:invokespecial   #107 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		obj;
	//    9   16:astore_1        
		this;
	//   10   17:aload_0         
		JVM INSTR monitorexit ;
	//   11   18:monitorexit     
		throw obj;
	//   12   19:aload_1         
	//   13   20:athrow          
		int i = mCallbacks.lastIndexOf(obj);
	//   14   21:aload_0         
	//   15   22:getfield        #36  <Field List mCallbacks>
	//   16   25:aload_1         
	//   17   26:invokeinterface #111 <Method int List.lastIndexOf(Object)>
	//   18   31:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_44;
	//   19   32:iload_2         
	//   20   33:iflt            44
		if(!isRemoved(i))
			break MISSING_BLOCK_LABEL_55;
	//   21   36:aload_0         
	//   22   37:iload_2         
	//   23   38:invokespecial   #113 <Method boolean isRemoved(int)>
	//   24   41:ifeq            55
		mCallbacks.add(obj);
	//   25   44:aload_0         
	//   26   45:getfield        #36  <Field List mCallbacks>
	//   27   48:aload_1         
	//   28   49:invokeinterface #116 <Method boolean List.add(Object)>
	//   29   54:pop             
		this;
	//   30   55:aload_0         
		JVM INSTR monitorexit ;
	//   31   56:monitorexit     
	//   32   57:return          
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mNotificationLevel != 0) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #120 <Field int mNotificationLevel>
	//    4    6:ifne            21
_L1:
		mCallbacks.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field List mCallbacks>
	//    7   13:invokeinterface #122 <Method void List.clear()>
_L6:
		this;
	//    8   18:aload_0         
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		return;
	//   10   20:return          
_L2:
		int i;
		if(mCallbacks.isEmpty())
			continue; /* Loop/switch isn't completed */
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field List mCallbacks>
	//   13   25:invokeinterface #126 <Method boolean List.isEmpty()>
	//   14   30:ifne            18
		i = mCallbacks.size() - 1;
	//   15   33:aload_0         
	//   16   34:getfield        #36  <Field List mCallbacks>
	//   17   37:invokeinterface #66  <Method int List.size()>
	//   18   42:iconst_1        
	//   19   43:isub            
	//   20   44:istore_1        
_L4:
		if(i < 0)
			break; /* Loop/switch isn't completed */
	//   21   45:iload_1         
	//   22   46:iflt            18
		setRemovalBit(i);
	//   23   49:aload_0         
	//   24   50:iload_1         
	//   25   51:invokespecial   #128 <Method void setRemovalBit(int)>
		i--;
	//   26   54:iload_1         
	//   27   55:iconst_1        
	//   28   56:isub            
	//   29   57:istore_1        
		if(true) goto _L4; else goto _L3
_L3:
		if(true) goto _L6; else goto _L5
_L5:
	//*  30   58:goto            45
		Exception exception;
		exception;
	//   31   61:astore_2        
	//*  32   62:aload_0         
		throw exception;
	//   33   63:monitorexit     
	//   34   64:aload_2         
	//   35   65:athrow          
	}

	public CallbackRegistry clone()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CallbackRegistry callbackregistry = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		CallbackRegistry callbackregistry1 = (CallbackRegistry)super.clone();
	//    4    4:aload_0         
	//    5    5:invokespecial   #135 <Method Object Object.clone()>
	//    6    8:checkcast       #2   <Class CallbackRegistry>
	//    7   11:astore          4
		callbackregistry = callbackregistry1;
	//    8   13:aload           4
	//    9   15:astore_3        
		callbackregistry1.mFirst64Removed = 0L;
	//   10   16:aload           4
	//   11   18:lconst_0        
	//   12   19:putfield        #38  <Field long mFirst64Removed>
		callbackregistry = callbackregistry1;
	//   13   22:aload           4
	//   14   24:astore_3        
		callbackregistry1.mRemainderRemoved = null;
	//   15   25:aload           4
	//   16   27:aconst_null     
	//   17   28:putfield        #47  <Field long[] mRemainderRemoved>
		callbackregistry = callbackregistry1;
	//   18   31:aload           4
	//   19   33:astore_3        
		callbackregistry1.mNotificationLevel = 0;
	//   20   34:aload           4
	//   21   36:iconst_0        
	//   22   37:putfield        #120 <Field int mNotificationLevel>
		callbackregistry = callbackregistry1;
	//   23   40:aload           4
	//   24   42:astore_3        
		callbackregistry1.mCallbacks = ((List) (new ArrayList()));
	//   25   43:aload           4
	//   26   45:new             #33  <Class ArrayList>
	//   27   48:dup             
	//   28   49:invokespecial   #34  <Method void ArrayList()>
	//   29   52:putfield        #36  <Field List mCallbacks>
		callbackregistry = callbackregistry1;
	//   30   55:aload           4
	//   31   57:astore_3        
		int j = mCallbacks.size();
	//   32   58:aload_0         
	//   33   59:getfield        #36  <Field List mCallbacks>
	//   34   62:invokeinterface #66  <Method int List.size()>
	//   35   67:istore_2        
		int i = 0;
	//   36   68:iconst_0        
	//   37   69:istore_1        
_L2:
		callbackregistry = callbackregistry1;
	//   38   70:aload           4
	//   39   72:astore_3        
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   40   73:iload_1         
	//   41   74:iload_2         
	//   42   75:icmpge          127
		callbackregistry = callbackregistry1;
	//   43   78:aload           4
	//   44   80:astore_3        
		if(isRemoved(i))
			break MISSING_BLOCK_LABEL_113;
	//   45   81:aload_0         
	//   46   82:iload_1         
	//   47   83:invokespecial   #113 <Method boolean isRemoved(int)>
	//   48   86:ifne            113
		callbackregistry = callbackregistry1;
	//   49   89:aload           4
	//   50   91:astore_3        
		callbackregistry1.mCallbacks.add(mCallbacks.get(i));
	//   51   92:aload           4
	//   52   94:getfield        #36  <Field List mCallbacks>
	//   53   97:aload_0         
	//   54   98:getfield        #36  <Field List mCallbacks>
	//   55  101:iload_1         
	//   56  102:invokeinterface #55  <Method Object List.get(int)>
	//   57  107:invokeinterface #116 <Method boolean List.add(Object)>
	//   58  112:pop             
		i++;
	//   59  113:iload_1         
	//   60  114:iconst_1        
	//   61  115:iadd            
	//   62  116:istore_1        
		if(true) goto _L2; else goto _L1
	//   63  117:goto            70
		CloneNotSupportedException clonenotsupportedexception;
		clonenotsupportedexception;
	//   64  120:astore          4
		clonenotsupportedexception.printStackTrace();
	//   65  122:aload           4
	//   66  124:invokevirtual   #138 <Method void CloneNotSupportedException.printStackTrace()>
_L1:
		this;
	//   67  127:aload_0         
		JVM INSTR monitorexit ;
	//   68  128:monitorexit     
		return callbackregistry;
	//   69  129:aload_3         
	//   70  130:areturn         
		Exception exception;
		exception;
	//   71  131:astore_3        
	//*  72  132:aload_0         
		throw exception;
	//   73  133:monitorexit     
	//   74  134:aload_3         
	//   75  135:athrow          
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method CallbackRegistry clone()>
	//    2    4:areturn         
	}

	public ArrayList copyCallbacks()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		ArrayList arraylist;
		arraylist = new ArrayList(mCallbacks.size());
	//    2    2:new             #33  <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field List mCallbacks>
	//    6   10:invokeinterface #66  <Method int List.size()>
	//    7   15:invokespecial   #146 <Method void ArrayList(int)>
	//    8   18:astore_3        
		j = mCallbacks.size();
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field List mCallbacks>
	//   11   23:invokeinterface #66  <Method int List.size()>
	//   12   28:istore_2        
		int i = 0;
	//   13   29:iconst_0        
	//   14   30:istore_1        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   15   31:iload_1         
	//   16   32:iload_2         
	//   17   33:icmpge          66
_L1:
		if(!isRemoved(i))
	//*  18   36:aload_0         
	//*  19   37:iload_1         
	//*  20   38:invokespecial   #113 <Method boolean isRemoved(int)>
	//*  21   41:ifne            59
			arraylist.add(mCallbacks.get(i));
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #36  <Field List mCallbacks>
	//   25   49:iload_1         
	//   26   50:invokeinterface #55  <Method Object List.get(int)>
	//   27   55:invokevirtual   #147 <Method boolean ArrayList.add(Object)>
	//   28   58:pop             
		i++;
	//   29   59:iload_1         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_1        
		  goto _L3
	//*  33   63:goto            31
	//*  34   66:aload_0         
_L2:
		return arraylist;
	//   35   67:monitorexit     
	//   36   68:aload_3         
	//   37   69:areturn         
		Exception exception;
		exception;
	//   38   70:astore_3        
	//*  39   71:aload_0         
		throw exception;
	//   40   72:monitorexit     
	//   41   73:aload_3         
	//   42   74:athrow          
	}

	public void copyCallbacks(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		list.clear();
	//    2    2:aload_1         
	//    3    3:invokeinterface #122 <Method void List.clear()>
		j = mCallbacks.size();
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field List mCallbacks>
	//    6   12:invokeinterface #66  <Method int List.size()>
	//    7   17:istore_3        
		int i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   10   20:iload_2         
	//   11   21:iload_3         
	//   12   22:icmpge          57
_L1:
		if(!isRemoved(i))
	//*  13   25:aload_0         
	//*  14   26:iload_2         
	//*  15   27:invokespecial   #113 <Method boolean isRemoved(int)>
	//*  16   30:ifne            50
			list.add(mCallbacks.get(i));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #36  <Field List mCallbacks>
	//   20   38:iload_2         
	//   21   39:invokeinterface #55  <Method Object List.get(int)>
	//   22   44:invokeinterface #116 <Method boolean List.add(Object)>
	//   23   49:pop             
		i++;
	//   24   50:iload_2         
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:istore_2        
		  goto _L3
	//*  28   54:goto            20
	//*  29   57:aload_0         
_L2:
		return;
	//   30   58:monitorexit     
	//   31   59:return          
		list;
	//   32   60:astore_1        
	//*  33   61:aload_0         
		throw list;
	//   34   62:monitorexit     
	//   35   63:aload_1         
	//   36   64:athrow          
	}

	public boolean isEmpty()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		this;
	//    2    3:aload_0         
		JVM INSTR monitorenter ;
	//    3    4:monitorenter    
		boolean flag = mCallbacks.isEmpty();
	//    4    5:aload_0         
	//    5    6:getfield        #36  <Field List mCallbacks>
	//    6    9:invokeinterface #126 <Method boolean List.isEmpty()>
	//    7   14:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    8   15:iload_3         
	//    9   16:ifeq            26
_L1:
		flag = flag1;
	//   10   19:iload           4
	//   11   21:istore_3        
_L6:
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return flag;
	//   14   24:iload_3         
	//   15   25:ireturn         
_L2:
		if(mNotificationLevel == 0)
	//*  16   26:aload_0         
	//*  17   27:getfield        #120 <Field int mNotificationLevel>
	//*  18   30:ifne            38
		{
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_3        
			continue; /* Loop/switch isn't completed */
	//   21   35:goto            22
		}
		int j = mCallbacks.size();
	//   22   38:aload_0         
	//   23   39:getfield        #36  <Field List mCallbacks>
	//   24   42:invokeinterface #66  <Method int List.size()>
	//   25   47:istore_2        
		int i = 0;
	//   26   48:iconst_0        
	//   27   49:istore_1        
_L4:
		flag = flag1;
	//   28   50:iload           4
	//   29   52:istore_3        
		if(i >= j)
			continue; /* Loop/switch isn't completed */
	//   30   53:iload_1         
	//   31   54:iload_2         
	//   32   55:icmpge          22
		flag = isRemoved(i);
	//   33   58:aload_0         
	//   34   59:iload_1         
	//   35   60:invokespecial   #113 <Method boolean isRemoved(int)>
	//   36   63:istore_3        
		if(!flag)
	//*  37   64:iload_3         
	//*  38   65:ifne            73
		{
			flag = false;
	//   39   68:iconst_0        
	//   40   69:istore_3        
			continue; /* Loop/switch isn't completed */
	//   41   70:goto            22
		}
		i++;
	//   42   73:iload_1         
	//   43   74:iconst_1        
	//   44   75:iadd            
	//   45   76:istore_1        
		if(true) goto _L4; else goto _L3
	//   46   77:goto            50
_L3:
		Exception exception;
		exception;
	//   47   80:astore          5
	//*  48   82:aload_0         
		throw exception;
	//   49   83:monitorexit     
	//   50   84:aload           5
	//   51   86:athrow          
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void notifyCallbacks(Object obj, int i, Object obj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mNotificationLevel = mNotificationLevel + 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #120 <Field int mNotificationLevel>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #120 <Field int mNotificationLevel>
		notifyRecurse(obj, i, obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:aload_3         
	//   12   16:invokespecial   #152 <Method void notifyRecurse(Object, int, Object)>
		mNotificationLevel = mNotificationLevel - 1;
	//   13   19:aload_0         
	//   14   20:aload_0         
	//   15   21:getfield        #120 <Field int mNotificationLevel>
	//   16   24:iconst_1        
	//   17   25:isub            
	//   18   26:putfield        #120 <Field int mNotificationLevel>
		if(mNotificationLevel != 0) goto _L2; else goto _L1
	//   19   29:aload_0         
	//   20   30:getfield        #120 <Field int mNotificationLevel>
	//   21   33:ifne            115
_L1:
		if(mRemainderRemoved == null) goto _L4; else goto _L3
	//   22   36:aload_0         
	//   23   37:getfield        #47  <Field long[] mRemainderRemoved>
	//   24   40:ifnull          92
_L3:
		i = mRemainderRemoved.length - 1;
	//   25   43:aload_0         
	//   26   44:getfield        #47  <Field long[] mRemainderRemoved>
	//   27   47:arraylength     
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:istore_2        
_L9:
		if(i < 0) goto _L4; else goto _L5
	//   31   51:iload_2         
	//   32   52:iflt            92
_L5:
		long l = mRemainderRemoved[i];
	//   33   55:aload_0         
	//   34   56:getfield        #47  <Field long[] mRemainderRemoved>
	//   35   59:iload_2         
	//   36   60:laload          
	//   37   61:lstore          4
		if(l == 0L) goto _L7; else goto _L6
	//   38   63:lload           4
	//   39   65:lconst_0        
	//   40   66:lcmp            
	//   41   67:ifeq            123
_L6:
		removeRemovedCallbacks((i + 1) * 64, l);
	//   42   70:aload_0         
	//   43   71:iload_2         
	//   44   72:iconst_1        
	//   45   73:iadd            
	//   46   74:bipush          64
	//   47   76:imul            
	//   48   77:lload           4
	//   49   79:invokespecial   #154 <Method void removeRemovedCallbacks(int, long)>
		mRemainderRemoved[i] = 0L;
	//   50   82:aload_0         
	//   51   83:getfield        #47  <Field long[] mRemainderRemoved>
	//   52   86:iload_2         
	//   53   87:lconst_0        
	//   54   88:lastore         
		  goto _L7
	//*  55   89:goto            123
_L4:
		if(mFirst64Removed != 0L)
	//*  56   92:aload_0         
	//*  57   93:getfield        #38  <Field long mFirst64Removed>
	//*  58   96:lconst_0        
	//*  59   97:lcmp            
	//*  60   98:ifeq            115
		{
			removeRemovedCallbacks(0, mFirst64Removed);
	//   61  101:aload_0         
	//   62  102:iconst_0        
	//   63  103:aload_0         
	//   64  104:getfield        #38  <Field long mFirst64Removed>
	//   65  107:invokespecial   #154 <Method void removeRemovedCallbacks(int, long)>
			mFirst64Removed = 0L;
	//   66  110:aload_0         
	//   67  111:lconst_0        
	//   68  112:putfield        #38  <Field long mFirst64Removed>
		}
_L2:
		this;
	//   69  115:aload_0         
		JVM INSTR monitorexit ;
	//   70  116:monitorexit     
		return;
	//   71  117:return          
		obj;
	//   72  118:astore_1        
	//*  73  119:aload_0         
		throw obj;
	//   74  120:monitorexit     
	//   75  121:aload_1         
	//   76  122:athrow          
_L7:
		i--;
	//   77  123:iload_2         
	//   78  124:iconst_1        
	//   79  125:isub            
	//   80  126:istore_2        
		if(true) goto _L9; else goto _L8
	//   81  127:goto            51
_L8:
	}

	public void remove(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mNotificationLevel != 0) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #120 <Field int mNotificationLevel>
	//    4    6:ifne            23
_L1:
		mCallbacks.remove(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field List mCallbacks>
	//    7   13:aload_1         
	//    8   14:invokeinterface #156 <Method boolean List.remove(Object)>
	//    9   19:pop             
_L4:
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
_L2:
		int i = mCallbacks.lastIndexOf(obj);
	//   13   23:aload_0         
	//   14   24:getfield        #36  <Field List mCallbacks>
	//   15   27:aload_1         
	//   16   28:invokeinterface #111 <Method int List.lastIndexOf(Object)>
	//   17   33:istore_2        
		if(i < 0) goto _L4; else goto _L3
	//   18   34:iload_2         
	//   19   35:iflt            20
_L3:
		setRemovalBit(i);
	//   20   38:aload_0         
	//   21   39:iload_2         
	//   22   40:invokespecial   #128 <Method void setRemovalBit(int)>
		  goto _L4
	//*  23   43:goto            20
		obj;
	//   24   46:astore_1        
	//*  25   47:aload_0         
		throw obj;
	//   26   48:monitorexit     
	//   27   49:aload_1         
	//   28   50:athrow          
	}

	private static final String TAG = "CallbackRegistry";
	private List mCallbacks;
	private long mFirst64Removed;
	private int mNotificationLevel;
	private final NotifierCallback mNotifier;
	private long mRemainderRemoved[];
}
