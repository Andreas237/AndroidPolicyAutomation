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
		if(i < 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmpge          23
			return (1L << i & mFirst64Removed) != 0L;
	//    3    6:lconst_1        
	//    4    7:iload_1         
	//    5    8:lshl            
	//    6    9:aload_0         
	//    7   10:getfield        #38  <Field long mFirst64Removed>
	//    8   13:land            
	//    9   14:lconst_0        
	//   10   15:lcmp            
	//   11   16:ifeq            21
	//   12   19:iconst_1        
	//   13   20:ireturn         
	//   14   21:iconst_0        
	//   15   22:ireturn         
		long al[] = mRemainderRemoved;
	//   16   23:aload_0         
	//   17   24:getfield        #47  <Field long[] mRemainderRemoved>
	//   18   27:astore_3        
		if(al == null)
	//*  19   28:aload_3         
	//*  20   29:ifnonnull       34
			return false;
	//   21   32:iconst_0        
	//   22   33:ireturn         
		int j = i / 64 - 1;
	//   23   34:iload_1         
	//   24   35:bipush          64
	//   25   37:idiv            
	//   26   38:iconst_1        
	//   27   39:isub            
	//   28   40:istore_2        
		if(j >= al.length)
	//*  29   41:iload_2         
	//*  30   42:aload_3         
	//*  31   43:arraylength     
	//*  32   44:icmplt          49
			return false;
	//   33   47:iconst_0        
	//   34   48:ireturn         
		return (1L << i % 64 & al[j]) != 0L;
	//   35   49:lconst_1        
	//   36   50:iload_1         
	//   37   51:bipush          64
	//   38   53:irem            
	//   39   54:lshl            
	//   40   55:aload_3         
	//   41   56:iload_2         
	//   42   57:laload          
	//   43   58:land            
	//   44   59:lconst_0        
	//   45   60:lcmp            
	//   46   61:ifeq            66
	//   47   64:iconst_1        
	//   48   65:ireturn         
	//   49   66:iconst_0        
	//   50   67:ireturn         
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
		long al[] = mRemainderRemoved;
	//    4   11:aload_0         
	//    5   12:getfield        #47  <Field long[] mRemainderRemoved>
	//    6   15:astore          6
		int j;
		if(al == null)
	//*   7   17:aload           6
	//*   8   19:ifnonnull       28
			j = -1;
	//    9   22:iconst_m1       
	//   10   23:istore          4
		else
	//*  11   25:goto            35
			j = al.length - 1;
	//   12   28:aload           6
	//   13   30:arraylength     
	//   14   31:iconst_1        
	//   15   32:isub            
	//   16   33:istore          4
		notifyRemainder(obj, i, obj1, j);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:aload_3         
	//   21   39:iload           4
	//   22   41:invokespecial   #80  <Method void notifyRemainder(Object, int, Object, int)>
		notifyCallbacks(obj, i, obj1, (j + 2) * 64, k, 0L);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:iload_2         
	//   26   47:aload_3         
	//   27   48:iload           4
	//   28   50:iconst_2        
	//   29   51:iadd            
	//   30   52:bipush          64
	//   31   54:imul            
	//   32   55:iload           5
	//   33   57:lconst_0        
	//   34   58:invokespecial   #74  <Method void notifyCallbacks(Object, int, Object, int, int, long)>
	//   35   61:return          
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
		int j = (i + 64) - 1;
	//    0    0:iload_1         
	//    1    1:bipush          64
	//    2    3:iadd            
	//    3    4:iconst_1        
	//    4    5:isub            
	//    5    6:istore          4
		long l1 = 0x0L;
	//    6    8:ldc2w           #86  <Long 0x0L>
	//    7   11:lstore          5
		for(; j >= i; j--)
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
		if(i < 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmpge          19
		{
			mFirst64Removed = 1L << i | mFirst64Removed;
	//    3    6:aload_0         
	//    4    7:lconst_1        
	//    5    8:iload_1         
	//    6    9:lshl            
	//    7   10:aload_0         
	//    8   11:getfield        #38  <Field long mFirst64Removed>
	//    9   14:lor             
	//   10   15:putfield        #38  <Field long mFirst64Removed>
			return;
	//   11   18:return          
		}
		int j = i / 64 - 1;
	//   12   19:iload_1         
	//   13   20:bipush          64
	//   14   22:idiv            
	//   15   23:iconst_1        
	//   16   24:isub            
	//   17   25:istore_2        
		long al[] = mRemainderRemoved;
	//   18   26:aload_0         
	//   19   27:getfield        #47  <Field long[] mRemainderRemoved>
	//   20   30:astore_3        
		if(al == null)
	//*  21   31:aload_3         
	//*  22   32:ifnonnull       56
			mRemainderRemoved = new long[mCallbacks.size() / 64];
	//   23   35:aload_0         
	//   24   36:aload_0         
	//   25   37:getfield        #36  <Field List mCallbacks>
	//   26   40:invokeinterface #66  <Method int List.size()>
	//   27   45:bipush          64
	//   28   47:idiv            
	//   29   48:newarray        long[]
	//   30   50:putfield        #47  <Field long[] mRemainderRemoved>
		else
	//*  31   53:goto            99
		if(al.length <= j)
	//*  32   56:aload_3         
	//*  33   57:arraylength     
	//*  34   58:iload_2         
	//*  35   59:icmpgt          99
		{
			al = new long[mCallbacks.size() / 64];
	//   36   62:aload_0         
	//   37   63:getfield        #36  <Field List mCallbacks>
	//   38   66:invokeinterface #66  <Method int List.size()>
	//   39   71:bipush          64
	//   40   73:idiv            
	//   41   74:newarray        long[]
	//   42   76:astore_3        
			long al1[] = mRemainderRemoved;
	//   43   77:aload_0         
	//   44   78:getfield        #47  <Field long[] mRemainderRemoved>
	//   45   81:astore          4
			System.arraycopy(((Object) (al1)), 0, ((Object) (al)), 0, al1.length);
	//   46   83:aload           4
	//   47   85:iconst_0        
	//   48   86:aload_3         
	//   49   87:iconst_0        
	//   50   88:aload           4
	//   51   90:arraylength     
	//   52   91:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			mRemainderRemoved = al;
	//   53   94:aload_0         
	//   54   95:aload_3         
	//   55   96:putfield        #47  <Field long[] mRemainderRemoved>
		}
		al = mRemainderRemoved;
	//   56   99:aload_0         
	//   57  100:getfield        #47  <Field long[] mRemainderRemoved>
	//   58  103:astore_3        
		al[j] = 1L << i % 64 | al[j];
	//   59  104:aload_3         
	//   60  105:iload_2         
	//   61  106:lconst_1        
	//   62  107:iload_1         
	//   63  108:bipush          64
	//   64  110:irem            
	//   65  111:lshl            
	//   66  112:aload_3         
	//   67  113:iload_2         
	//   68  114:laload          
	//   69  115:lor             
	//   70  116:lastore         
	//   71  117:return          
	}

	public void add(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(obj == null)
			break MISSING_BLOCK_LABEL_47;
	//    2    2:aload_1         
	//    3    3:ifnull          47
		int i = mCallbacks.lastIndexOf(obj);
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field List mCallbacks>
	//    6   10:aload_1         
	//    7   11:invokeinterface #104 <Method int List.lastIndexOf(Object)>
	//    8   16:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_29;
	//    9   17:iload_2         
	//   10   18:iflt            29
		if(!isRemoved(i))
			break MISSING_BLOCK_LABEL_40;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:invokespecial   #106 <Method boolean isRemoved(int)>
	//   14   26:ifeq            40
		mCallbacks.add(obj);
	//   15   29:aload_0         
	//   16   30:getfield        #36  <Field List mCallbacks>
	//   17   33:aload_1         
	//   18   34:invokeinterface #109 <Method boolean List.add(Object)>
	//   19   39:pop             
		this;
	//   20   40:aload_0         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		obj;
	//   23   43:astore_1        
		break MISSING_BLOCK_LABEL_58;
	//   24   44:goto            57
		throw new IllegalArgumentException("callback cannot be null");
	//   25   47:new             #111 <Class IllegalArgumentException>
	//   26   50:dup             
	//   27   51:ldc1            #113 <String "callback cannot be null">
	//   28   53:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   29   56:athrow          
	//*  30   57:aload_0         
		throw obj;
	//   31   58:monitorexit     
	//   32   59:aload_1         
	//   33   60:athrow          
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
		  goto _L3
	//*   8   18:goto            61
_L2:
		if(mCallbacks.isEmpty()) goto _L3; else goto _L4
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field List mCallbacks>
	//   11   25:invokeinterface #126 <Method boolean List.isEmpty()>
	//   12   30:ifne            61
_L4:
		int i = mCallbacks.size() - 1;
	//   13   33:aload_0         
	//   14   34:getfield        #36  <Field List mCallbacks>
	//   15   37:invokeinterface #66  <Method int List.size()>
	//   16   42:iconst_1        
	//   17   43:isub            
	//   18   44:istore_1        
_L5:
		if(i < 0)
			break; /* Loop/switch isn't completed */
	//   19   45:iload_1         
	//   20   46:iflt            61
		setRemovalBit(i);
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:invokespecial   #128 <Method void setRemovalBit(int)>
		i--;
	//   24   54:iload_1         
	//   25   55:iconst_1        
	//   26   56:isub            
	//   27   57:istore_1        
		if(true) goto _L5; else goto _L3
	//   28   58:goto            45
_L3:
		this;
	//   29   61:aload_0         
		JVM INSTR monitorexit ;
	//   30   62:monitorexit     
		return;
	//   31   63:return          
		Exception exception;
		exception;
	//   32   64:astore_2        
	//*  33   65:aload_0         
		throw exception;
	//   34   66:monitorexit     
	//   35   67:aload_2         
	//   36   68:athrow          
	}

	public CallbackRegistry clone()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) ((CallbackRegistry)super.clone()));
	//    2    2:aload_0         
	//    3    3:invokespecial   #135 <Method Object Object.clone()>
	//    4    6:checkcast       #2   <Class CallbackRegistry>
	//    5    9:astore_3        
		Object obj1;
		int i;
		int j;
		try
		{
			obj.mFirst64Removed = 0L;
	//    6   10:aload_3         
	//    7   11:lconst_0        
	//    8   12:putfield        #38  <Field long mFirst64Removed>
			obj.mRemainderRemoved = null;
	//    9   15:aload_3         
	//   10   16:aconst_null     
	//   11   17:putfield        #47  <Field long[] mRemainderRemoved>
		}
	//*  12   20:iconst_0        
	//*  13   21:istore_1        
	//*  14   22:aload_3         
	//*  15   23:iconst_0        
	//*  16   24:putfield        #120 <Field int mNotificationLevel>
	//*  17   27:aload_3         
	//*  18   28:new             #33  <Class ArrayList>
	//*  19   31:dup             
	//*  20   32:invokespecial   #34  <Method void ArrayList()>
	//*  21   35:putfield        #36  <Field List mCallbacks>
	//*  22   38:aload_0         
	//*  23   39:getfield        #36  <Field List mCallbacks>
	//*  24   42:invokeinterface #66  <Method int List.size()>
	//*  25   47:istore_2        
	//*  26   48:aload_3         
	//*  27   49:astore          4
	//*  28   51:iload_1         
	//*  29   52:iload_2         
	//*  30   53:icmpge          112
	//*  31   56:aload_0         
	//*  32   57:iload_1         
	//*  33   58:invokespecial   #106 <Method boolean isRemoved(int)>
	//*  34   61:ifne            84
	//*  35   64:aload_3         
	//*  36   65:getfield        #36  <Field List mCallbacks>
	//*  37   68:aload_0         
	//*  38   69:getfield        #36  <Field List mCallbacks>
	//*  39   72:iload_1         
	//*  40   73:invokeinterface #55  <Method Object List.get(int)>
	//*  41   78:invokeinterface #109 <Method boolean List.add(Object)>
	//*  42   83:pop             
	//*  43   84:iload_1         
	//*  44   85:iconst_1        
	//*  45   86:iadd            
	//*  46   87:istore_1        
	//*  47   88:goto            48
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  48   91:astore          4
		{
			break MISSING_BLOCK_LABEL_104;
	//   49   93:goto            104
		}
		i = 0;
		obj.mNotificationLevel = 0;
		obj.mCallbacks = ((List) (new ArrayList()));
		j = mCallbacks.size();
_L2:
		obj1 = obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		if(!isRemoved(i))
			((CallbackRegistry) (obj)).mCallbacks.add(mCallbacks.get(i));
		i++;
		if(true) goto _L2; else goto _L1
		obj;
	//   50   96:astore_3        
		break MISSING_BLOCK_LABEL_118;
	//   51   97:goto            117
		obj1;
	//   52  100:astore          4
		obj = null;
	//   53  102:aconst_null     
	//   54  103:astore_3        
		((CloneNotSupportedException) (obj1)).printStackTrace();
	//   55  104:aload           4
	//   56  106:invokevirtual   #138 <Method void CloneNotSupportedException.printStackTrace()>
		obj1 = obj;
	//   57  109:aload_3         
	//   58  110:astore          4
_L1:
		this;
	//   59  112:aload_0         
		JVM INSTR monitorexit ;
	//   60  113:monitorexit     
		return ((CallbackRegistry) (obj1));
	//   61  114:aload           4
	//   62  116:areturn         
	//*  63  117:aload_0         
		throw obj;
	//   64  118:monitorexit     
	//   65  119:aload_3         
	//   66  120:athrow          
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
	//*  20   38:invokespecial   #106 <Method boolean isRemoved(int)>
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
	//*  15   27:invokespecial   #106 <Method boolean isRemoved(int)>
	//*  16   30:ifne            50
			list.add(mCallbacks.get(i));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #36  <Field List mCallbacks>
	//   20   38:iload_2         
	//   21   39:invokeinterface #55  <Method Object List.get(int)>
	//   22   44:invokeinterface #109 <Method boolean List.add(Object)>
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mCallbacks.isEmpty();
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field List mCallbacks>
	//    4    6:invokeinterface #126 <Method boolean List.isEmpty()>
	//    5   11:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_20;
	//    6   12:iload_3         
	//    7   13:ifeq            20
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		int i = mNotificationLevel;
	//   12   20:aload_0         
	//   13   21:getfield        #120 <Field int mNotificationLevel>
	//   14   24:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_33;
	//   15   25:iload_1         
	//   16   26:ifne            33
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return false;
	//   19   31:iconst_0        
	//   20   32:ireturn         
		int j = mCallbacks.size();
	//   21   33:aload_0         
	//   22   34:getfield        #36  <Field List mCallbacks>
	//   23   37:invokeinterface #66  <Method int List.size()>
	//   24   42:istore_2        
		i = 0;
	//   25   43:iconst_0        
	//   26   44:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   27   45:iload_1         
	//   28   46:iload_2         
	//   29   47:icmpge          71
		flag = isRemoved(i);
	//   30   50:aload_0         
	//   31   51:iload_1         
	//   32   52:invokespecial   #106 <Method boolean isRemoved(int)>
	//   33   55:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_64;
	//   34   56:iload_3         
	//   35   57:ifne            64
		this;
	//   36   60:aload_0         
		JVM INSTR monitorexit ;
	//   37   61:monitorexit     
		return false;
	//   38   62:iconst_0        
	//   39   63:ireturn         
		i++;
	//   40   64:iload_1         
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore_1        
		if(true) goto _L2; else goto _L1
	//   44   68:goto            45
	//*  45   71:aload_0         
_L1:
		return true;
	//   46   72:monitorexit     
	//   47   73:iconst_1        
	//   48   74:ireturn         
		Exception exception;
		exception;
	//   49   75:astore          4
	//*  50   77:aload_0         
		throw exception;
	//   51   78:monitorexit     
	//   52   79:aload           4
	//   53   81:athrow          
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
		if(mNotificationLevel == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #120 <Field int mNotificationLevel>
	//*   4    6:ifne            23
		{
			mCallbacks.remove(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field List mCallbacks>
	//    7   13:aload_1         
	//    8   14:invokeinterface #156 <Method boolean List.remove(Object)>
	//    9   19:pop             
			break MISSING_BLOCK_LABEL_43;
	//   10   20:goto            43
		}
		int i = mCallbacks.lastIndexOf(obj);
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field List mCallbacks>
	//   13   27:aload_1         
	//   14   28:invokeinterface #104 <Method int List.lastIndexOf(Object)>
	//   15   33:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_43;
	//   16   34:iload_2         
	//   17   35:iflt            43
		setRemovalBit(i);
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:invokespecial   #128 <Method void setRemovalBit(int)>
		this;
	//   21   43:aload_0         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
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
