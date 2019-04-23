// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.ConcurrentModificationException;
import java.util.Map;

// Referenced classes of package android.support.v4.util:
//			ContainerHelpers, ArrayMap

public class SimpleArrayMap
{

	public SimpleArrayMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mHashes = ContainerHelpers.EMPTY_INTS;
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    4    8:putfield        #40  <Field int[] mHashes>
		mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    5   11:aload_0         
	//    6   12:getstatic       #43  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    7   15:putfield        #45  <Field Object[] mArray>
		mSize = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #47  <Field int mSize>
	//   11   23:return          
	}

	public SimpleArrayMap(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            25
		{
			mHashes = ContainerHelpers.EMPTY_INTS;
	//    4    8:aload_0         
	//    5    9:getstatic       #38  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    6   12:putfield        #40  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    7   15:aload_0         
	//    8   16:getstatic       #43  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    9   19:putfield        #45  <Field Object[] mArray>
		} else
	//*  10   22:goto            30
		{
			allocArrays(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #52  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #47  <Field int mSize>
	//   17   35:return          
	}

	public SimpleArrayMap(SimpleArrayMap simplearraymap)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void SimpleArrayMap()>
		if(simplearraymap != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			putAll(simplearraymap);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #57  <Method void putAll(SimpleArrayMap)>
	//    7   13:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_81;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          81
		android/support/v4/util/ArrayMap;
	//    3    6:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(mTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_69;
	//    5    9:getstatic       #63  <Field Object[] mTwiceBaseCache>
	//    6   12:ifnull          69
		aobj = mTwiceBaseCache;
	//    7   15:getstatic       #63  <Field Object[] mTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #45  <Field Object[] mArray>
		mTwiceBaseCache = (Object[])(Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #64  <Class Object[]>
	//   16   30:checkcast       #64  <Class Object[]>
	//   17   33:putstatic       #63  <Field Object[] mTwiceBaseCache>
		mHashes = (int[])(int[])aobj[1];
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aaload          
	//   22   40:checkcast       #65  <Class int[]>
	//   23   43:checkcast       #65  <Class int[]>
	//   24   46:putfield        #40  <Field int[] mHashes>
		aobj[1] = null;
	//   25   49:aload_2         
	//   26   50:iconst_1        
	//   27   51:aconst_null     
	//   28   52:aastore         
		aobj[0] = null;
	//   29   53:aload_2         
	//   30   54:iconst_0        
	//   31   55:aconst_null     
	//   32   56:aastore         
		mTwiceBaseCacheSize--;
	//   33   57:getstatic       #67  <Field int mTwiceBaseCacheSize>
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:putstatic       #67  <Field int mTwiceBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   37   65:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   38   67:monitorexit     
		return;
	//   39   68:return          
		android/support/v4/util/ArrayMap;
	//   40   69:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
		break MISSING_BLOCK_LABEL_161;
	//   42   72:goto            161
		Exception exception;
		exception;
	//   43   75:astore_2        
		android/support/v4/util/ArrayMap;
	//   44   76:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   45   78:monitorexit     
		throw exception;
	//   46   79:aload_2         
	//   47   80:athrow          
		if(i != 4)
			break MISSING_BLOCK_LABEL_161;
	//   48   81:iload_1         
	//   49   82:iconst_4        
	//   50   83:icmpne          161
		android/support/v4/util/ArrayMap;
	//   51   86:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   52   88:monitorenter    
		if(mBaseCache == null)
			break MISSING_BLOCK_LABEL_149;
	//   53   89:getstatic       #69  <Field Object[] mBaseCache>
	//   54   92:ifnull          149
		exception = ((Exception) (mBaseCache));
	//   55   95:getstatic       #69  <Field Object[] mBaseCache>
	//   56   98:astore_2        
		mArray = ((Object []) (exception));
	//   57   99:aload_0         
	//   58  100:aload_2         
	//   59  101:putfield        #45  <Field Object[] mArray>
		mBaseCache = (Object[])(Object[])exception[0];
	//   60  104:aload_2         
	//   61  105:iconst_0        
	//   62  106:aaload          
	//   63  107:checkcast       #64  <Class Object[]>
	//   64  110:checkcast       #64  <Class Object[]>
	//   65  113:putstatic       #69  <Field Object[] mBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   66  116:aload_0         
	//   67  117:aload_2         
	//   68  118:iconst_1        
	//   69  119:aaload          
	//   70  120:checkcast       #65  <Class int[]>
	//   71  123:checkcast       #65  <Class int[]>
	//   72  126:putfield        #40  <Field int[] mHashes>
		exception[1] = null;
	//   73  129:aload_2         
	//   74  130:iconst_1        
	//   75  131:aconst_null     
	//   76  132:aastore         
		exception[0] = null;
	//   77  133:aload_2         
	//   78  134:iconst_0        
	//   79  135:aconst_null     
	//   80  136:aastore         
		mBaseCacheSize--;
	//   81  137:getstatic       #71  <Field int mBaseCacheSize>
	//   82  140:iconst_1        
	//   83  141:isub            
	//   84  142:putstatic       #71  <Field int mBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   85  145:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   86  147:monitorexit     
		return;
	//   87  148:return          
		android/support/v4/util/ArrayMap;
	//   88  149:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   89  151:monitorexit     
		break MISSING_BLOCK_LABEL_161;
	//   90  152:goto            161
		exception;
	//   91  155:astore_2        
		android/support/v4/util/ArrayMap;
	//   92  156:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   93  158:monitorexit     
		throw exception;
	//   94  159:aload_2         
	//   95  160:athrow          
		mHashes = new int[i];
	//   96  161:aload_0         
	//   97  162:iload_1         
	//   98  163:newarray        int[]
	//   99  165:putfield        #40  <Field int[] mHashes>
		mArray = new Object[i << 1];
	//  100  168:aload_0         
	//  101  169:iload_1         
	//  102  170:iconst_1        
	//  103  171:ishl            
	//  104  172:anewarray       Object[]
	//  105  175:putfield        #45  <Field Object[] mArray>
		return;
	//  106  178:return          
	}

	private static int binarySearchHashes(int ai[], int i, int j)
	{
		try
		{
			i = ContainerHelpers.binarySearch(ai, i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #78  <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//    4    6:istore_1        
		}
	//*   5    7:iload_1         
	//*   6    8:ireturn         
	//*   7    9:new             #80  <Class ConcurrentModificationException>
	//*   8   12:dup             
	//*   9   13:invokespecial   #81  <Method void ConcurrentModificationException()>
	//*  10   16:athrow          
		// Misplaced declaration of an exception variable
		catch(int ai[])
		{
			throw new ConcurrentModificationException();
		}
		return i;
	//*  11   17:astore_0        
	//*  12   18:goto            9
	}

	private static void freeArrays(int ai[], Object aobj[], int i)
	{
		if(ai.length != 8) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:bipush          8
	//    3    4:icmpne          59
_L1:
		android/support/v4/util/ArrayMap;
	//    4    7:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mTwiceBaseCacheSize < 10)
	//*   6   10:getstatic       #67  <Field int mTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          49
		{
			aobj[0] = ((Object) (mTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #63  <Field Object[] mTwiceBaseCache>
	//   12   23:aastore         
			break MISSING_BLOCK_LABEL_24;
		}
		  goto _L3
	//*  13   24:aload_1         
	//*  14   25:iconst_1        
	//*  15   26:aload_0         
	//*  16   27:aastore         
	//*  17   28:iload_2         
	//*  18   29:iconst_1        
	//*  19   30:ishl            
	//*  20   31:iconst_1        
	//*  21   32:isub            
	//*  22   33:istore_2        
	//*  23   34:goto            118
_L8:
		mTwiceBaseCache = aobj;
	//   24   37:aload_1         
	//   25   38:putstatic       #63  <Field Object[] mTwiceBaseCache>
		mTwiceBaseCacheSize++;
	//   26   41:getstatic       #67  <Field int mTwiceBaseCacheSize>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putstatic       #67  <Field int mTwiceBaseCacheSize>
_L3:
		android/support/v4/util/ArrayMap;
	//   30   49:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		return;
	//   32   52:return          
		ai;
	//   33   53:astore_0        
		android/support/v4/util/ArrayMap;
	//   34   54:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   35   56:monitorexit     
		throw ai;
	//   36   57:aload_0         
	//   37   58:athrow          
_L2:
		if(ai.length != 4) goto _L5; else goto _L4
	//   38   59:aload_0         
	//   39   60:arraylength     
	//   40   61:iconst_4        
	//   41   62:icmpne          117
_L4:
		android/support/v4/util/ArrayMap;
	//   42   65:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   43   67:monitorenter    
		if(mBaseCacheSize >= 10) goto _L7; else goto _L6
	//   44   68:getstatic       #71  <Field int mBaseCacheSize>
	//   45   71:bipush          10
	//   46   73:icmpge          107
_L6:
		aobj[0] = ((Object) (mBaseCache));
	//   47   76:aload_1         
	//   48   77:iconst_0        
	//   49   78:getstatic       #69  <Field Object[] mBaseCache>
	//   50   81:aastore         
		aobj[1] = ((Object) (ai));
	//   51   82:aload_1         
	//   52   83:iconst_1        
	//   53   84:aload_0         
	//   54   85:aastore         
		i = (i << 1) - 1;
	//   55   86:iload_2         
	//   56   87:iconst_1        
	//   57   88:ishl            
	//   58   89:iconst_1        
	//   59   90:isub            
	//   60   91:istore_2        
		break MISSING_BLOCK_LABEL_134;
	//   61   92:goto            134
_L9:
		mBaseCache = aobj;
	//   62   95:aload_1         
	//   63   96:putstatic       #69  <Field Object[] mBaseCache>
		mBaseCacheSize++;
	//   64   99:getstatic       #71  <Field int mBaseCacheSize>
	//   65  102:iconst_1        
	//   66  103:iadd            
	//   67  104:putstatic       #71  <Field int mBaseCacheSize>
_L7:
		android/support/v4/util/ArrayMap;
	//   68  107:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   69  109:monitorexit     
		return;
	//   70  110:return          
		ai;
	//   71  111:astore_0        
		android/support/v4/util/ArrayMap;
	//   72  112:ldc1            #61  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   73  114:monitorexit     
		throw ai;
	//   74  115:aload_0         
	//   75  116:athrow          
_L5:
		return;
	//   76  117:return          
		aobj[1] = ((Object) (ai));
		i = (i << 1) - 1;
		while(i >= 2) 
	//*  77  118:iload_2         
	//*  78  119:iconst_2        
	//*  79  120:icmplt          37
		{
			aobj[i] = null;
	//   80  123:aload_1         
	//   81  124:iload_2         
	//   82  125:aconst_null     
	//   83  126:aastore         
			i--;
	//   84  127:iload_2         
	//   85  128:iconst_1        
	//   86  129:isub            
	//   87  130:istore_2        
		}
		  goto _L8
	//*  88  131:goto            118
		while(i >= 2) 
	//*  89  134:iload_2         
	//*  90  135:iconst_2        
	//*  91  136:icmplt          95
		{
			aobj[i] = null;
	//   92  139:aload_1         
	//   93  140:iload_2         
	//   94  141:aconst_null     
	//   95  142:aastore         
			i--;
	//   96  143:iload_2         
	//   97  144:iconst_1        
	//   98  145:isub            
	//   99  146:istore_2        
		}
		  goto _L9
	//* 100  147:goto            134
	}

	public void clear()
	{
		int i = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            44
		{
			int ai[] = mHashes;
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field int[] mHashes>
	//    7   13:astore_2        
			Object aobj[] = mArray;
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field Object[] mArray>
	//   10   18:astore_3        
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   11   19:aload_0         
	//   12   20:getstatic       #38  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   13   23:putfield        #40  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   14   26:aload_0         
	//   15   27:getstatic       #43  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   16   30:putfield        #45  <Field Object[] mArray>
			mSize = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #47  <Field int mSize>
			freeArrays(ai, aobj, i);
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokestatic    #86  <Method void freeArrays(int[], Object[], int)>
		}
		if(mSize <= 0)
	//*  24   44:aload_0         
	//*  25   45:getfield        #47  <Field int mSize>
	//*  26   48:ifgt            52
			return;
	//   27   51:return          
		else
			throw new ConcurrentModificationException();
	//   28   52:new             #80  <Class ConcurrentModificationException>
	//   29   55:dup             
	//   30   56:invokespecial   #81  <Method void ConcurrentModificationException()>
	//   31   59:athrow          
	}

	public boolean containsKey(Object obj)
	{
		return indexOfKey(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method int indexOfKey(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean containsValue(Object obj)
	{
		return indexOfValue(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method int indexOfValue(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void ensureCapacity(int i)
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore_2        
		int ai[] = mHashes;
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field int[] mHashes>
	//    5    9:astore_3        
		if(ai.length < i)
	//*   6   10:aload_3         
	//*   7   11:arraylength     
	//*   8   12:iload_1         
	//*   9   13:icmpge          66
		{
			Object aobj[] = mArray;
	//   10   16:aload_0         
	//   11   17:getfield        #45  <Field Object[] mArray>
	//   12   20:astore          4
			allocArrays(i);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:invokespecial   #52  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  16   27:aload_0         
	//*  17   28:getfield        #47  <Field int mSize>
	//*  18   31:ifle            59
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, j);
	//   19   34:aload_3         
	//   20   35:iconst_0        
	//   21   36:aload_0         
	//   22   37:getfield        #40  <Field int[] mHashes>
	//   23   40:iconst_0        
	//   24   41:iload_2         
	//   25   42:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, j << 1);
	//   26   45:aload           4
	//   27   47:iconst_0        
	//   28   48:aload_0         
	//   29   49:getfield        #45  <Field Object[] mArray>
	//   30   52:iconst_0        
	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:ishl            
	//   34   56:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, j);
	//   35   59:aload_3         
	//   36   60:aload           4
	//   37   62:iload_2         
	//   38   63:invokestatic    #86  <Method void freeArrays(int[], Object[], int)>
		}
		if(mSize == j)
	//*  39   66:aload_0         
	//*  40   67:getfield        #47  <Field int mSize>
	//*  41   70:iload_2         
	//*  42   71:icmpne          75
			return;
	//   43   74:return          
		else
			throw new ConcurrentModificationException();
	//   44   75:new             #80  <Class ConcurrentModificationException>
	//   45   78:dup             
	//   46   79:invokespecial   #81  <Method void ConcurrentModificationException()>
	//   47   82:athrow          
	}

	public boolean equals(Object obj)
	{
		int i;
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof SimpleArrayMap))
			break MISSING_BLOCK_LABEL_108;
	//    5    7:aload_1         
	//    6    8:instanceof      #2   <Class SimpleArrayMap>
	//    7   11:ifeq            108
		obj = ((Object) ((SimpleArrayMap)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class SimpleArrayMap>
	//   10   18:astore_1        
		if(size() != ((SimpleArrayMap) (obj)).size())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #113 <Method int size()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #113 <Method int size()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		i = 0;
	//   18   32:iconst_0        
	//   19   33:istore_2        
_L2:
		Object obj1;
		Object obj3;
		Object obj4;
		if(i >= mSize)
			break; /* Loop/switch isn't completed */
	//   20   34:iload_2         
	//   21   35:aload_0         
	//   22   36:getfield        #47  <Field int mSize>
	//   23   39:icmpge          106
		obj1 = keyAt(i);
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #117 <Method Object keyAt(int)>
	//   27   47:astore          4
		obj3 = valueAt(i);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #120 <Method Object valueAt(int)>
	//   31   54:astore          5
		obj4 = ((SimpleArrayMap) (obj)).get(obj1);
	//   32   56:aload_1         
	//   33   57:aload           4
	//   34   59:invokevirtual   #124 <Method Object get(Object)>
	//   35   62:astore          6
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_85;
	//   36   64:aload           5
	//   37   66:ifnonnull       85
		if(obj4 != null)
			break MISSING_BLOCK_LABEL_229;
	//   38   69:aload           6
	//   39   71:ifnonnull       229
		if(!((SimpleArrayMap) (obj)).containsKey(obj1))
	//*  40   74:aload_1         
	//*  41   75:aload           4
	//*  42   77:invokevirtual   #126 <Method boolean containsKey(Object)>
	//*  43   80:ifne            99
			return false;
	//   44   83:iconst_0        
	//   45   84:ireturn         
		break MISSING_BLOCK_LABEL_99;
		boolean flag;
		Object obj2;
		try
		{
			flag = obj3.equals(obj4);
	//   46   85:aload           5
	//   47   87:aload           6
	//   48   89:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//   49   92:istore_3        
		}
	//*  50   93:iload_3         
	//*  51   94:ifne            99
	//*  52   97:iconst_0        
	//*  53   98:ireturn         
	//*  54   99:iload_2         
	//*  55  100:iconst_1        
	//*  56  101:iadd            
	//*  57  102:istore_2        
	//*  58  103:goto            34
	//*  59  106:iconst_1        
	//*  60  107:ireturn         
	//*  61  108:aload_1         
	//*  62  109:instanceof      #130 <Class Map>
	//*  63  112:ifeq            215
	//*  64  115:aload_1         
	//*  65  116:checkcast       #130 <Class Map>
	//*  66  119:astore_1        
	//*  67  120:aload_0         
	//*  68  121:invokevirtual   #113 <Method int size()>
	//*  69  124:aload_1         
	//*  70  125:invokeinterface #131 <Method int Map.size()>
	//*  71  130:icmpeq          135
	//*  72  133:iconst_0        
	//*  73  134:ireturn         
	//*  74  135:iconst_0        
	//*  75  136:istore_2        
	//*  76  137:iload_2         
	//*  77  138:aload_0         
	//*  78  139:getfield        #47  <Field int mSize>
	//*  79  142:icmpge          213
	//*  80  145:aload_0         
	//*  81  146:iload_2         
	//*  82  147:invokevirtual   #117 <Method Object keyAt(int)>
	//*  83  150:astore          4
	//*  84  152:aload_0         
	//*  85  153:iload_2         
	//*  86  154:invokevirtual   #120 <Method Object valueAt(int)>
	//*  87  157:astore          5
	//*  88  159:aload_1         
	//*  89  160:aload           4
	//*  90  162:invokeinterface #132 <Method Object Map.get(Object)>
	//*  91  167:astore          6
	//*  92  169:aload           5
	//*  93  171:ifnonnull       192
	//*  94  174:aload           6
	//*  95  176:ifnonnull       231
	//*  96  179:aload_1         
	//*  97  180:aload           4
	//*  98  182:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  99  187:ifne            206
	//* 100  190:iconst_0        
	//* 101  191:ireturn         
	//* 102  192:aload           5
	//* 103  194:aload           6
	//* 104  196:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//* 105  199:istore_3        
	//* 106  200:iload_3         
	//* 107  201:ifne            206
	//* 108  204:iconst_0        
	//* 109  205:ireturn         
	//* 110  206:iload_2         
	//* 111  207:iconst_1        
	//* 112  208:iadd            
	//* 113  209:istore_2        
	//* 114  210:goto            137
	//* 115  213:iconst_1        
	//* 116  214:ireturn         
	//* 117  215:iconst_0        
	//* 118  216:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 119  217:astore_1        
		{
			return false;
	//  120  218:iconst_0        
	//  121  219:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 122  220:astore_1        
		{
			return false;
	//  123  221:iconst_0        
	//  124  222:ireturn         
		}
		if(!flag)
			return false;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		return true;
		if(!(obj instanceof Map))
			break MISSING_BLOCK_LABEL_215;
		obj = ((Object) ((Map)obj));
		if(size() != ((Map) (obj)).size())
			return false;
		i = 0;
_L4:
		if(i >= mSize)
			break; /* Loop/switch isn't completed */
		obj2 = keyAt(i);
		obj3 = valueAt(i);
		obj4 = ((Map) (obj)).get(obj2);
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_192;
		if(obj4 != null)
			break MISSING_BLOCK_LABEL_231;
		if(!((Map) (obj)).containsKey(obj2))
			return false;
		break MISSING_BLOCK_LABEL_206;
		try
		{
			flag = obj3.equals(obj4);
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 125  223:astore_1        
		{
			return false;
	//  126  224:iconst_0        
	//  127  225:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 128  226:astore_1        
		{
			return false;
	//  129  227:iconst_0        
	//  130  228:ireturn         
		}
		if(!flag)
			return false;
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		return true;
		return false;
		return false;
	//  131  229:iconst_0        
	//  132  230:ireturn         
		return false;
	//  133  231:iconst_0        
	//  134  232:ireturn         
	}

	public Object get(Object obj)
	{
		int i = indexOfKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            21
			return mArray[(i << 1) + 1];
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field Object[] mArray>
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:ishl            
	//   11   17:iconst_1        
	//   12   18:iadd            
	//   13   19:aaload          
	//   14   20:areturn         
		else
			return ((Object) (null));
	//   15   21:aconst_null     
	//   16   22:areturn         
	}

	public int hashCode()
	{
		int ai[] = mHashes;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int[] mHashes>
	//    2    4:astore          7
		Object aobj[] = mArray;
	//    3    6:aload_0         
	//    4    7:getfield        #45  <Field Object[] mArray>
	//    5   10:astore          8
		int i1 = mSize;
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field int mSize>
	//    8   16:istore          5
		int i = 1;
	//    9   18:iconst_1        
	//   10   19:istore_1        
		int j = 0;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		int k = j;
	//   13   22:iload_2         
	//   14   23:istore_3        
		while(j < i1) 
	//*  15   24:iload_2         
	//*  16   25:iload           5
	//*  17   27:icmpge          79
		{
			Object obj = aobj[i];
	//   18   30:aload           8
	//   19   32:iload_1         
	//   20   33:aaload          
	//   21   34:astore          9
			int j1 = ai[j];
	//   22   36:aload           7
	//   23   38:iload_2         
	//   24   39:iaload          
	//   25   40:istore          6
			int l;
			if(obj == null)
	//*  26   42:aload           9
	//*  27   44:ifnonnull       53
				l = 0;
	//   28   47:iconst_0        
	//   29   48:istore          4
			else
	//*  30   50:goto            60
				l = obj.hashCode();
	//   31   53:aload           9
	//   32   55:invokevirtual   #138 <Method int Object.hashCode()>
	//   33   58:istore          4
			k += l ^ j1;
	//   34   60:iload_3         
	//   35   61:iload           4
	//   36   63:iload           6
	//   37   65:ixor            
	//   38   66:iadd            
	//   39   67:istore_3        
			j++;
	//   40   68:iload_2         
	//   41   69:iconst_1        
	//   42   70:iadd            
	//   43   71:istore_2        
			i += 2;
	//   44   72:iload_1         
	//   45   73:iconst_2        
	//   46   74:iadd            
	//   47   75:istore_1        
		}
	//*  48   76:goto            24
		return k;
	//   49   79:iload_3         
	//   50   80:ireturn         
	}

	int indexOf(Object obj, int i)
	{
		int k = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = binarySearchHashes(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #142 <Method int binarySearchHashes(int[], int, int)>
	//   12   23:istore          5
		if(i1 < 0)
	//*  13   25:iload           5
	//*  14   27:ifge            33
			return i1;
	//   15   30:iload           5
	//   16   32:ireturn         
		if(obj.equals(mArray[i1 << 1]))
	//*  17   33:aload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #45  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:iconst_1        
	//*  22   41:ishl            
	//*  23   42:aaload          
	//*  24   43:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//*  25   46:ifeq            52
			return i1;
	//   26   49:iload           5
	//   27   51:ireturn         
		int j;
		for(j = i1 + 1; j < k && mHashes[j] == i; j++)
	//*  28   52:iload           5
	//*  29   54:iconst_1        
	//*  30   55:iadd            
	//*  31   56:istore_3        
	//*  32   57:iload_3         
	//*  33   58:iload           4
	//*  34   60:icmpge          97
	//*  35   63:aload_0         
	//*  36   64:getfield        #40  <Field int[] mHashes>
	//*  37   67:iload_3         
	//*  38   68:iaload          
	//*  39   69:iload_2         
	//*  40   70:icmpne          97
			if(obj.equals(mArray[j << 1]))
	//*  41   73:aload_1         
	//*  42   74:aload_0         
	//*  43   75:getfield        #45  <Field Object[] mArray>
	//*  44   78:iload_3         
	//*  45   79:iconst_1        
	//*  46   80:ishl            
	//*  47   81:aaload          
	//*  48   82:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//*  49   85:ifeq            90
				return j;
	//   50   88:iload_3         
	//   51   89:ireturn         

	//   52   90:iload_3         
	//   53   91:iconst_1        
	//   54   92:iadd            
	//   55   93:istore_3        
	//*  56   94:goto            57
		for(int l = i1 - 1; l >= 0 && mHashes[l] == i; l--)
	//*  57   97:iload           5
	//*  58   99:iconst_1        
	//*  59  100:isub            
	//*  60  101:istore          4
	//*  61  103:iload           4
	//*  62  105:iflt            147
	//*  63  108:aload_0         
	//*  64  109:getfield        #40  <Field int[] mHashes>
	//*  65  112:iload           4
	//*  66  114:iaload          
	//*  67  115:iload_2         
	//*  68  116:icmpne          147
			if(obj.equals(mArray[l << 1]))
	//*  69  119:aload_1         
	//*  70  120:aload_0         
	//*  71  121:getfield        #45  <Field Object[] mArray>
	//*  72  124:iload           4
	//*  73  126:iconst_1        
	//*  74  127:ishl            
	//*  75  128:aaload          
	//*  76  129:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//*  77  132:ifeq            138
				return l;
	//   78  135:iload           4
	//   79  137:ireturn         

	//   80  138:iload           4
	//   81  140:iconst_1        
	//   82  141:isub            
	//   83  142:istore          4
	//*  84  144:goto            103
		return j;
	//   85  147:iload_3         
	//   86  148:ireturn         
	}

	public int indexOfKey(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #145 <Method int indexOfNull()>
	//    4    8:ireturn         
		else
			return indexOf(obj, obj.hashCode());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #138 <Method int Object.hashCode()>
	//    9   15:invokevirtual   #147 <Method int indexOf(Object, int)>
	//   10   18:ireturn         
	}

	int indexOfNull()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = binarySearchHashes(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #40  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #142 <Method int binarySearchHashes(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l << 1] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #45  <Field Object[] mArray>
	//*  19   31:iload_3         
	//*  20   32:iconst_1        
	//*  21   33:ishl            
	//*  22   34:aaload          
	//*  23   35:ifnonnull       40
			return l;
	//   24   38:iload_3         
	//   25   39:ireturn         
		int i;
		for(i = l + 1; i < j && mHashes[i] == 0; i++)
	//*  26   40:iload_3         
	//*  27   41:iconst_1        
	//*  28   42:iadd            
	//*  29   43:istore_1        
	//*  30   44:iload_1         
	//*  31   45:iload_2         
	//*  32   46:icmpge          78
	//*  33   49:aload_0         
	//*  34   50:getfield        #40  <Field int[] mHashes>
	//*  35   53:iload_1         
	//*  36   54:iaload          
	//*  37   55:ifne            78
			if(mArray[i << 1] == null)
	//*  38   58:aload_0         
	//*  39   59:getfield        #45  <Field Object[] mArray>
	//*  40   62:iload_1         
	//*  41   63:iconst_1        
	//*  42   64:ishl            
	//*  43   65:aaload          
	//*  44   66:ifnonnull       71
				return i;
	//   45   69:iload_1         
	//   46   70:ireturn         

	//   47   71:iload_1         
	//   48   72:iconst_1        
	//   49   73:iadd            
	//   50   74:istore_1        
	//*  51   75:goto            44
		for(int k = l - 1; k >= 0 && mHashes[k] == 0; k--)
	//*  52   78:iload_3         
	//*  53   79:iconst_1        
	//*  54   80:isub            
	//*  55   81:istore_2        
	//*  56   82:iload_2         
	//*  57   83:iflt            115
	//*  58   86:aload_0         
	//*  59   87:getfield        #40  <Field int[] mHashes>
	//*  60   90:iload_2         
	//*  61   91:iaload          
	//*  62   92:ifne            115
			if(mArray[k << 1] == null)
	//*  63   95:aload_0         
	//*  64   96:getfield        #45  <Field Object[] mArray>
	//*  65   99:iload_2         
	//*  66  100:iconst_1        
	//*  67  101:ishl            
	//*  68  102:aaload          
	//*  69  103:ifnonnull       108
				return k;
	//   70  106:iload_2         
	//   71  107:ireturn         

	//   72  108:iload_2         
	//   73  109:iconst_1        
	//   74  110:isub            
	//   75  111:istore_2        
	//*  76  112:goto            82
		return i;
	//   77  115:iload_1         
	//   78  116:ireturn         
	}

	int indexOfValue(Object obj)
	{
		int k = mSize * 2;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:istore_3        
		Object aobj[] = mArray;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field Object[] mArray>
	//    7   11:astore          4
		if(obj == null)
	//*   8   13:aload_1         
	//*   9   14:ifnonnull       42
		{
			for(int i = 1; i < k; i += 2)
	//*  10   17:iconst_1        
	//*  11   18:istore_2        
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          71
				if(aobj[i] == null)
	//*  15   24:aload           4
	//*  16   26:iload_2         
	//*  17   27:aaload          
	//*  18   28:ifnonnull       35
					return i >> 1;
	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:ishr            
	//   22   34:ireturn         

	//   23   35:iload_2         
	//   24   36:iconst_2        
	//   25   37:iadd            
	//   26   38:istore_2        
		} else
	//*  27   39:goto            19
		{
			for(int j = 1; j < k; j += 2)
	//*  28   42:iconst_1        
	//*  29   43:istore_2        
	//*  30   44:iload_2         
	//*  31   45:iload_3         
	//*  32   46:icmpge          71
				if(obj.equals(aobj[j]))
	//*  33   49:aload_1         
	//*  34   50:aload           4
	//*  35   52:iload_2         
	//*  36   53:aaload          
	//*  37   54:invokevirtual   #128 <Method boolean Object.equals(Object)>
	//*  38   57:ifeq            64
					return j >> 1;
	//   39   60:iload_2         
	//   40   61:iconst_1        
	//   41   62:ishr            
	//   42   63:ireturn         

	//   43   64:iload_2         
	//   44   65:iconst_2        
	//   45   66:iadd            
	//   46   67:istore_2        
		}
	//*  47   68:goto            44
		return -1;
	//   48   71:iconst_m1       
	//   49   72:ireturn         
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Object keyAt(int i)
	{
		return mArray[i << 1];
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:ishl            
	//    5    7:aaload          
	//    6    8:areturn         
	}

	public Object put(Object obj, Object obj1)
	{
		int k = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore          5
		int i;
		int j;
		if(obj == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       21
		{
			i = indexOfNull();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #145 <Method int indexOfNull()>
	//    7   14:istore_3        
			j = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
		} else
	//*  10   18:goto            35
		{
			j = obj.hashCode();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #138 <Method int Object.hashCode()>
	//   13   25:istore          4
			i = indexOf(obj, j);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload           4
	//   17   31:invokevirtual   #147 <Method int indexOf(Object, int)>
	//   18   34:istore_3        
		}
		if(i >= 0)
	//*  19   35:iload_3         
	//*  20   36:iflt            62
		{
			i = (i << 1) + 1;
	//   21   39:iload_3         
	//   22   40:iconst_1        
	//   23   41:ishl            
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_3        
			obj = ((Object) (mArray));
	//   27   45:aload_0         
	//   28   46:getfield        #45  <Field Object[] mArray>
	//   29   49:astore_1        
			Object obj2 = obj[i];
	//   30   50:aload_1         
	//   31   51:iload_3         
	//   32   52:aaload          
	//   33   53:astore          7
			obj[i] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//   34   55:aload_1         
	//   35   56:iload_3         
	//   36   57:aload_2         
	//   37   58:aastore         
			return ((Object) (obj2));
	//   38   59:aload           7
	//   39   61:areturn         
		}
		int l = i;
	//   40   62:iload_3         
	//   41   63:istore          6
		if(k >= mHashes.length)
	//*  42   65:iload           5
	//*  43   67:aload_0         
	//*  44   68:getfield        #40  <Field int[] mHashes>
	//*  45   71:arraylength     
	//*  46   72:icmplt          188
		{
			i = 4;
	//   47   75:iconst_4        
	//   48   76:istore_3        
			if(k >= 8)
	//*  49   77:iload           5
	//*  50   79:bipush          8
	//*  51   81:icmplt          95
				i = (k >> 1) + k;
	//   52   84:iload           5
	//   53   86:iconst_1        
	//   54   87:ishr            
	//   55   88:iload           5
	//   56   90:iadd            
	//   57   91:istore_3        
			else
	//*  58   92:goto            104
			if(k >= 4)
	//*  59   95:iload           5
	//*  60   97:iconst_4        
	//*  61   98:icmplt          104
				i = 8;
	//   62  101:bipush          8
	//   63  103:istore_3        
			int ai[] = mHashes;
	//   64  104:aload_0         
	//   65  105:getfield        #40  <Field int[] mHashes>
	//   66  108:astore          7
			Object aobj[] = mArray;
	//   67  110:aload_0         
	//   68  111:getfield        #45  <Field Object[] mArray>
	//   69  114:astore          8
			allocArrays(i);
	//   70  116:aload_0         
	//   71  117:iload_3         
	//   72  118:invokespecial   #52  <Method void allocArrays(int)>
			if(k == mSize)
	//*  73  121:iload           5
	//*  74  123:aload_0         
	//*  75  124:getfield        #47  <Field int mSize>
	//*  76  127:icmpne          180
			{
				int ai3[] = mHashes;
	//   77  130:aload_0         
	//   78  131:getfield        #40  <Field int[] mHashes>
	//   79  134:astore          9
				if(ai3.length > 0)
	//*  80  136:aload           9
	//*  81  138:arraylength     
	//*  82  139:ifle            168
				{
					System.arraycopy(((Object) (ai)), 0, ((Object) (ai3)), 0, ai.length);
	//   83  142:aload           7
	//   84  144:iconst_0        
	//   85  145:aload           9
	//   86  147:iconst_0        
	//   87  148:aload           7
	//   88  150:arraylength     
	//   89  151:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   90  154:aload           8
	//   91  156:iconst_0        
	//   92  157:aload_0         
	//   93  158:getfield        #45  <Field Object[] mArray>
	//   94  161:iconst_0        
	//   95  162:aload           8
	//   96  164:arraylength     
	//   97  165:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				freeArrays(ai, aobj, k);
	//   98  168:aload           7
	//   99  170:aload           8
	//  100  172:iload           5
	//  101  174:invokestatic    #86  <Method void freeArrays(int[], Object[], int)>
			} else
	//* 102  177:goto            188
			{
				throw new ConcurrentModificationException();
	//  103  180:new             #80  <Class ConcurrentModificationException>
	//  104  183:dup             
	//  105  184:invokespecial   #81  <Method void ConcurrentModificationException()>
	//  106  187:athrow          
			}
		}
		if(l < k)
	//* 107  188:iload           6
	//* 108  190:iload           5
	//* 109  192:icmpge          250
		{
			int ai1[] = mHashes;
	//  110  195:aload_0         
	//  111  196:getfield        #40  <Field int[] mHashes>
	//  112  199:astore          7
			i = l + 1;
	//  113  201:iload           6
	//  114  203:iconst_1        
	//  115  204:iadd            
	//  116  205:istore_3        
			System.arraycopy(((Object) (ai1)), l, ((Object) (ai1)), i, k - l);
	//  117  206:aload           7
	//  118  208:iload           6
	//  119  210:aload           7
	//  120  212:iload_3         
	//  121  213:iload           5
	//  122  215:iload           6
	//  123  217:isub            
	//  124  218:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
			ai1 = ((int []) (mArray));
	//  125  221:aload_0         
	//  126  222:getfield        #45  <Field Object[] mArray>
	//  127  225:astore          7
			System.arraycopy(((Object) (ai1)), l << 1, ((Object) (ai1)), i << 1, mSize - l << 1);
	//  128  227:aload           7
	//  129  229:iload           6
	//  130  231:iconst_1        
	//  131  232:ishl            
	//  132  233:aload           7
	//  133  235:iload_3         
	//  134  236:iconst_1        
	//  135  237:ishl            
	//  136  238:aload_0         
	//  137  239:getfield        #47  <Field int mSize>
	//  138  242:iload           6
	//  139  244:isub            
	//  140  245:iconst_1        
	//  141  246:ishl            
	//  142  247:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		i = mSize;
	//  143  250:aload_0         
	//  144  251:getfield        #47  <Field int mSize>
	//  145  254:istore_3        
		if(k == i)
	//* 146  255:iload           5
	//* 147  257:iload_3         
	//* 148  258:icmpne          317
		{
			int ai2[] = mHashes;
	//  149  261:aload_0         
	//  150  262:getfield        #40  <Field int[] mHashes>
	//  151  265:astore          7
			if(l < ai2.length)
	//* 152  267:iload           6
	//* 153  269:aload           7
	//* 154  271:arraylength     
	//* 155  272:icmpge          317
			{
				ai2[l] = j;
	//  156  275:aload           7
	//  157  277:iload           6
	//  158  279:iload           4
	//  159  281:iastore         
				ai2 = ((int []) (mArray));
	//  160  282:aload_0         
	//  161  283:getfield        #45  <Field Object[] mArray>
	//  162  286:astore          7
				j = l << 1;
	//  163  288:iload           6
	//  164  290:iconst_1        
	//  165  291:ishl            
	//  166  292:istore          4
				ai2[j] = obj;
	//  167  294:aload           7
	//  168  296:iload           4
	//  169  298:aload_1         
	//  170  299:aastore         
				ai2[j + 1] = obj1;
	//  171  300:aload           7
	//  172  302:iload           4
	//  173  304:iconst_1        
	//  174  305:iadd            
	//  175  306:aload_2         
	//  176  307:aastore         
				mSize = i + 1;
	//  177  308:aload_0         
	//  178  309:iload_3         
	//  179  310:iconst_1        
	//  180  311:iadd            
	//  181  312:putfield        #47  <Field int mSize>
				return ((Object) (null));
	//  182  315:aconst_null     
	//  183  316:areturn         
			}
		}
		throw new ConcurrentModificationException();
	//  184  317:new             #80  <Class ConcurrentModificationException>
	//  185  320:dup             
	//  186  321:invokespecial   #81  <Method void ConcurrentModificationException()>
	//  187  324:athrow          
	}

	public void putAll(SimpleArrayMap simplearraymap)
	{
		int j = simplearraymap.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:istore_3        
		ensureCapacity(mSize + j);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field int mSize>
	//    6   10:iload_3         
	//    7   11:iadd            
	//    8   12:invokevirtual   #156 <Method void ensureCapacity(int)>
		int k = mSize;
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field int mSize>
	//   11   19:istore          4
		int i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		if(k == 0)
	//*  14   23:iload           4
	//*  15   25:ifne            68
		{
			if(j > 0)
	//*  16   28:iload_3         
	//*  17   29:ifle            95
			{
				System.arraycopy(((Object) (simplearraymap.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   18   32:aload_1         
	//   19   33:getfield        #40  <Field int[] mHashes>
	//   20   36:iconst_0        
	//   21   37:aload_0         
	//   22   38:getfield        #40  <Field int[] mHashes>
	//   23   41:iconst_0        
	//   24   42:iload_3         
	//   25   43:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (simplearraymap.mArray)), 0, ((Object) (mArray)), 0, j << 1);
	//   26   46:aload_1         
	//   27   47:getfield        #45  <Field Object[] mArray>
	//   28   50:iconst_0        
	//   29   51:aload_0         
	//   30   52:getfield        #45  <Field Object[] mArray>
	//   31   55:iconst_0        
	//   32   56:iload_3         
	//   33   57:iconst_1        
	//   34   58:ishl            
	//   35   59:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   36   62:aload_0         
	//   37   63:iload_3         
	//   38   64:putfield        #47  <Field int mSize>
				return;
	//   39   67:return          
			}
		} else
		{
			for(; i < j; i++)
	//*  40   68:iload_2         
	//*  41   69:iload_3         
	//*  42   70:icmpge          95
				put(simplearraymap.keyAt(i), simplearraymap.valueAt(i));
	//   43   73:aload_0         
	//   44   74:aload_1         
	//   45   75:iload_2         
	//   46   76:invokevirtual   #117 <Method Object keyAt(int)>
	//   47   79:aload_1         
	//   48   80:iload_2         
	//   49   81:invokevirtual   #120 <Method Object valueAt(int)>
	//   50   84:invokevirtual   #158 <Method Object put(Object, Object)>
	//   51   87:pop             

	//   52   88:iload_2         
	//   53   89:iconst_1        
	//   54   90:iadd            
	//   55   91:istore_2        
		}
	//*  56   92:goto            68
	//   57   95:return          
	}

	public Object remove(Object obj)
	{
		int i = indexOfKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
			return removeAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #163 <Method Object removeAt(int)>
	//    9   15:areturn         
		else
			return ((Object) (null));
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public Object removeAt(int i)
	{
		Object aobj[] = mArray;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object[] mArray>
	//    2    4:astore          8
		int i1 = i << 1;
	//    3    6:iload_1         
	//    4    7:iconst_1        
	//    5    8:ishl            
	//    6    9:istore          5
		Object obj = aobj[i1 + 1];
	//    7   11:aload           8
	//    8   13:iload           5
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:aaload          
	//   12   18:astore          7
		int l = mSize;
	//   13   20:aload_0         
	//   14   21:getfield        #47  <Field int mSize>
	//   15   24:istore          4
		int j;
		if(l <= 1)
	//*  16   26:iload           4
	//*  17   28:iconst_1        
	//*  18   29:icmpgt          62
		{
			freeArrays(mHashes, aobj, l);
	//   19   32:aload_0         
	//   20   33:getfield        #40  <Field int[] mHashes>
	//   21   36:aload           8
	//   22   38:iload           4
	//   23   40:invokestatic    #86  <Method void freeArrays(int[], Object[], int)>
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   24   43:aload_0         
	//   25   44:getstatic       #38  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   26   47:putfield        #40  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   27   50:aload_0         
	//   28   51:getstatic       #43  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   29   54:putfield        #45  <Field Object[] mArray>
			j = 0;
	//   30   57:iconst_0        
	//   31   58:istore_2        
		} else
	//*  32   59:goto            309
		{
			int k = l - 1;
	//   33   62:iload           4
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:istore_3        
			int ai[] = mHashes;
	//   37   67:aload_0         
	//   38   68:getfield        #40  <Field int[] mHashes>
	//   39   71:astore          8
			int j1 = ai.length;
	//   40   73:aload           8
	//   41   75:arraylength     
	//   42   76:istore          6
			j = 8;
	//   43   78:bipush          8
	//   44   80:istore_2        
			if(j1 > 8 && l < ai.length / 3)
	//*  45   81:iload           6
	//*  46   83:bipush          8
	//*  47   85:icmple          232
	//*  48   88:iload           4
	//*  49   90:aload           8
	//*  50   92:arraylength     
	//*  51   93:iconst_3        
	//*  52   94:idiv            
	//*  53   95:icmpge          232
			{
				if(l > 8)
	//*  54   98:iload           4
	//*  55  100:bipush          8
	//*  56  102:icmple          113
					j = l + (l >> 1);
	//   57  105:iload           4
	//   58  107:iload           4
	//   59  109:iconst_1        
	//   60  110:ishr            
	//   61  111:iadd            
	//   62  112:istore_2        
				int ai1[] = mHashes;
	//   63  113:aload_0         
	//   64  114:getfield        #40  <Field int[] mHashes>
	//   65  117:astore          8
				Object aobj2[] = mArray;
	//   66  119:aload_0         
	//   67  120:getfield        #45  <Field Object[] mArray>
	//   68  123:astore          9
				allocArrays(j);
	//   69  125:aload_0         
	//   70  126:iload_2         
	//   71  127:invokespecial   #52  <Method void allocArrays(int)>
				if(l == mSize)
	//*  72  130:iload           4
	//*  73  132:aload_0         
	//*  74  133:getfield        #47  <Field int mSize>
	//*  75  136:icmpne          224
				{
					if(i > 0)
	//*  76  139:iload_1         
	//*  77  140:ifle            168
					{
						System.arraycopy(((Object) (ai1)), 0, ((Object) (mHashes)), 0, i);
	//   78  143:aload           8
	//   79  145:iconst_0        
	//   80  146:aload_0         
	//   81  147:getfield        #40  <Field int[] mHashes>
	//   82  150:iconst_0        
	//   83  151:iload_1         
	//   84  152:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(((Object) (aobj2)), 0, ((Object) (mArray)), 0, i1);
	//   85  155:aload           9
	//   86  157:iconst_0        
	//   87  158:aload_0         
	//   88  159:getfield        #45  <Field Object[] mArray>
	//   89  162:iconst_0        
	//   90  163:iload           5
	//   91  165:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
					}
					j = k;
	//   92  168:iload_3         
	//   93  169:istore_2        
					if(i < k)
	//*  94  170:iload_1         
	//*  95  171:iload_3         
	//*  96  172:icmpge          309
					{
						j = i + 1;
	//   97  175:iload_1         
	//   98  176:iconst_1        
	//   99  177:iadd            
	//  100  178:istore_2        
						int ai3[] = mHashes;
	//  101  179:aload_0         
	//  102  180:getfield        #40  <Field int[] mHashes>
	//  103  183:astore          10
						int k1 = k - i;
	//  104  185:iload_3         
	//  105  186:iload_1         
	//  106  187:isub            
	//  107  188:istore          6
						System.arraycopy(((Object) (ai1)), j, ((Object) (ai3)), i, k1);
	//  108  190:aload           8
	//  109  192:iload_2         
	//  110  193:aload           10
	//  111  195:iload_1         
	//  112  196:iload           6
	//  113  198:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(((Object) (aobj2)), j << 1, ((Object) (mArray)), i1, k1 << 1);
	//  114  201:aload           9
	//  115  203:iload_2         
	//  116  204:iconst_1        
	//  117  205:ishl            
	//  118  206:aload_0         
	//  119  207:getfield        #45  <Field Object[] mArray>
	//  120  210:iload           5
	//  121  212:iload           6
	//  122  214:iconst_1        
	//  123  215:ishl            
	//  124  216:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
						j = k;
	//  125  219:iload_3         
	//  126  220:istore_2        
					}
				} else
	//* 127  221:goto            309
				{
					throw new ConcurrentModificationException();
	//  128  224:new             #80  <Class ConcurrentModificationException>
	//  129  227:dup             
	//  130  228:invokespecial   #81  <Method void ConcurrentModificationException()>
	//  131  231:athrow          
				}
			} else
			{
				if(i < k)
	//* 132  232:iload_1         
	//* 133  233:iload_3         
	//* 134  234:icmpge          285
				{
					int ai2[] = mHashes;
	//  135  237:aload_0         
	//  136  238:getfield        #40  <Field int[] mHashes>
	//  137  241:astore          8
					j = i + 1;
	//  138  243:iload_1         
	//  139  244:iconst_1        
	//  140  245:iadd            
	//  141  246:istore_2        
					int l1 = k - i;
	//  142  247:iload_3         
	//  143  248:iload_1         
	//  144  249:isub            
	//  145  250:istore          6
					System.arraycopy(((Object) (ai2)), j, ((Object) (ai2)), i, l1);
	//  146  252:aload           8
	//  147  254:iload_2         
	//  148  255:aload           8
	//  149  257:iload_1         
	//  150  258:iload           6
	//  151  260:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
					ai2 = ((int []) (mArray));
	//  152  263:aload_0         
	//  153  264:getfield        #45  <Field Object[] mArray>
	//  154  267:astore          8
					System.arraycopy(((Object) (ai2)), j << 1, ((Object) (ai2)), i1, l1 << 1);
	//  155  269:aload           8
	//  156  271:iload_2         
	//  157  272:iconst_1        
	//  158  273:ishl            
	//  159  274:aload           8
	//  160  276:iload           5
	//  161  278:iload           6
	//  162  280:iconst_1        
	//  163  281:ishl            
	//  164  282:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				Object aobj1[] = mArray;
	//  165  285:aload_0         
	//  166  286:getfield        #45  <Field Object[] mArray>
	//  167  289:astore          8
				i = k << 1;
	//  168  291:iload_3         
	//  169  292:iconst_1        
	//  170  293:ishl            
	//  171  294:istore_1        
				aobj1[i] = null;
	//  172  295:aload           8
	//  173  297:iload_1         
	//  174  298:aconst_null     
	//  175  299:aastore         
				aobj1[i + 1] = null;
	//  176  300:aload           8
	//  177  302:iload_1         
	//  178  303:iconst_1        
	//  179  304:iadd            
	//  180  305:aconst_null     
	//  181  306:aastore         
				j = k;
	//  182  307:iload_3         
	//  183  308:istore_2        
			}
		}
		if(l == mSize)
	//* 184  309:iload           4
	//* 185  311:aload_0         
	//* 186  312:getfield        #47  <Field int mSize>
	//* 187  315:icmpne          326
		{
			mSize = j;
	//  188  318:aload_0         
	//  189  319:iload_2         
	//  190  320:putfield        #47  <Field int mSize>
			return obj;
	//  191  323:aload           7
	//  192  325:areturn         
		} else
		{
			throw new ConcurrentModificationException();
	//  193  326:new             #80  <Class ConcurrentModificationException>
	//  194  329:dup             
	//  195  330:invokespecial   #81  <Method void ConcurrentModificationException()>
	//  196  333:athrow          
		}
	}

	public Object setValueAt(int i, Object obj)
	{
		i = (i << 1) + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:ishl            
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:istore_1        
		Object aobj[] = mArray;
	//    6    6:aload_0         
	//    7    7:getfield        #45  <Field Object[] mArray>
	//    8   10:astore_3        
		Object obj1 = aobj[i];
	//    9   11:aload_3         
	//   10   12:iload_1         
	//   11   13:aaload          
	//   12   14:astore          4
		aobj[i] = obj;
	//   13   16:aload_3         
	//   14   17:iload_1         
	//   15   18:aload_2         
	//   16   19:aastore         
		return obj1;
	//   17   20:aload           4
	//   18   22:areturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSize>
	//    2    4:ireturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #171 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "{}";
	//    3    7:ldc1            #173 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #175 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #47  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #177 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #181 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #47  <Field int mSize>
	//*  22   39:icmpge          121
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #183 <String ", ">
	//   27   49:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = keyAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #117 <Method Object keyAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Map)");
	//   41   73:aload_2         
	//   42   74:ldc1            #191 <String "(this Map)">
	//   43   76:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
			stringbuilder.append('=');
	//   45   80:aload_2         
	//   46   81:bipush          61
	//   47   83:invokevirtual   #181 <Method StringBuilder StringBuilder.append(char)>
	//   48   86:pop             
			obj = valueAt(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokevirtual   #120 <Method Object valueAt(int)>
	//   52   92:astore_3        
			if(obj != this)
	//*  53   93:aload_3         
	//*  54   94:aload_0         
	//*  55   95:if_acmpeq       107
				stringbuilder.append(obj);
	//   56   98:aload_2         
	//   57   99:aload_3         
	//   58  100:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
	//   59  103:pop             
			else
	//*  60  104:goto            114
				stringbuilder.append("(this Map)");
	//   61  107:aload_2         
	//   62  108:ldc1            #191 <String "(this Map)">
	//   63  110:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   64  113:pop             
		}

	//   65  114:iload_1         
	//   66  115:iconst_1        
	//   67  116:iadd            
	//   68  117:istore_1        
	//*  69  118:goto            34
		stringbuilder.append('}');
	//   70  121:aload_2         
	//   71  122:bipush          125
	//   72  124:invokevirtual   #181 <Method StringBuilder StringBuilder.append(char)>
	//   73  127:pop             
		return stringbuilder.toString();
	//   74  128:aload_2         
	//   75  129:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   76  132:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[(i << 1) + 1];
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:aaload          
	//    8   10:areturn         
	}

	private static final int BASE_SIZE = 4;
	private static final int CACHE_SIZE = 10;
	private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
	private static final boolean DEBUG = false;
	private static final String TAG = "ArrayMap";
	static Object mBaseCache[];
	static int mBaseCacheSize;
	static Object mTwiceBaseCache[];
	static int mTwiceBaseCacheSize;
	Object mArray[];
	int mHashes[];
	int mSize;
}
