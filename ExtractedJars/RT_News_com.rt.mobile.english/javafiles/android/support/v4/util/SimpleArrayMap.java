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
	//    1    1:invokespecial   #32  <Method void Object()>
		mHashes = ContainerHelpers.EMPTY_INTS;
	//    2    4:aload_0         
	//    3    5:getstatic       #37  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    4    8:putfield        #39  <Field int[] mHashes>
		mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    5   11:aload_0         
	//    6   12:getstatic       #42  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    7   15:putfield        #44  <Field Object[] mArray>
		mSize = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #46  <Field int mSize>
	//   11   23:return          
	}

	public SimpleArrayMap(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            25
		{
			mHashes = ContainerHelpers.EMPTY_INTS;
	//    4    8:aload_0         
	//    5    9:getstatic       #37  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    6   12:putfield        #39  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    7   15:aload_0         
	//    8   16:getstatic       #42  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    9   19:putfield        #44  <Field Object[] mArray>
		} else
	//*  10   22:goto            30
		{
			allocArrays(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #51  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #46  <Field int mSize>
	//   17   35:return          
	}

	public SimpleArrayMap(SimpleArrayMap simplearraymap)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void SimpleArrayMap()>
		if(simplearraymap != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			putAll(simplearraymap);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #56  <Method void putAll(SimpleArrayMap)>
	//    7   13:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_75;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          75
		android/support/v4/util/ArrayMap;
	//    3    6:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(mTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_63;
	//    5    9:getstatic       #62  <Field Object[] mTwiceBaseCache>
	//    6   12:ifnull          63
		aobj = mTwiceBaseCache;
	//    7   15:getstatic       #62  <Field Object[] mTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #44  <Field Object[] mArray>
		mTwiceBaseCache = (Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #63  <Class Object[]>
	//   16   30:putstatic       #62  <Field Object[] mTwiceBaseCache>
		mHashes = (int[])aobj[1];
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:iconst_1        
	//   20   36:aaload          
	//   21   37:checkcast       #64  <Class int[]>
	//   22   40:putfield        #39  <Field int[] mHashes>
		aobj[1] = null;
	//   23   43:aload_2         
	//   24   44:iconst_1        
	//   25   45:aconst_null     
	//   26   46:aastore         
		aobj[0] = null;
	//   27   47:aload_2         
	//   28   48:iconst_0        
	//   29   49:aconst_null     
	//   30   50:aastore         
		mTwiceBaseCacheSize--;
	//   31   51:getstatic       #66  <Field int mTwiceBaseCacheSize>
	//   32   54:iconst_1        
	//   33   55:isub            
	//   34   56:putstatic       #66  <Field int mTwiceBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   35   59:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   36   61:monitorexit     
		return;
	//   37   62:return          
		android/support/v4/util/ArrayMap;
	//   38   63:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   39   65:monitorexit     
		break MISSING_BLOCK_LABEL_149;
	//   40   66:goto            149
		Exception exception;
		exception;
	//   41   69:astore_2        
		android/support/v4/util/ArrayMap;
	//   42   70:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   43   72:monitorexit     
		throw exception;
	//   44   73:aload_2         
	//   45   74:athrow          
		if(i != 4)
			break MISSING_BLOCK_LABEL_149;
	//   46   75:iload_1         
	//   47   76:iconst_4        
	//   48   77:icmpne          149
		android/support/v4/util/ArrayMap;
	//   49   80:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   50   82:monitorenter    
		if(mBaseCache == null)
			break MISSING_BLOCK_LABEL_137;
	//   51   83:getstatic       #68  <Field Object[] mBaseCache>
	//   52   86:ifnull          137
		exception = ((Exception) (mBaseCache));
	//   53   89:getstatic       #68  <Field Object[] mBaseCache>
	//   54   92:astore_2        
		mArray = ((Object []) (exception));
	//   55   93:aload_0         
	//   56   94:aload_2         
	//   57   95:putfield        #44  <Field Object[] mArray>
		mBaseCache = (Object[])exception[0];
	//   58   98:aload_2         
	//   59   99:iconst_0        
	//   60  100:aaload          
	//   61  101:checkcast       #63  <Class Object[]>
	//   62  104:putstatic       #68  <Field Object[] mBaseCache>
		mHashes = (int[])exception[1];
	//   63  107:aload_0         
	//   64  108:aload_2         
	//   65  109:iconst_1        
	//   66  110:aaload          
	//   67  111:checkcast       #64  <Class int[]>
	//   68  114:putfield        #39  <Field int[] mHashes>
		exception[1] = null;
	//   69  117:aload_2         
	//   70  118:iconst_1        
	//   71  119:aconst_null     
	//   72  120:aastore         
		exception[0] = null;
	//   73  121:aload_2         
	//   74  122:iconst_0        
	//   75  123:aconst_null     
	//   76  124:aastore         
		mBaseCacheSize--;
	//   77  125:getstatic       #70  <Field int mBaseCacheSize>
	//   78  128:iconst_1        
	//   79  129:isub            
	//   80  130:putstatic       #70  <Field int mBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   81  133:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   82  135:monitorexit     
		return;
	//   83  136:return          
		android/support/v4/util/ArrayMap;
	//   84  137:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   85  139:monitorexit     
		break MISSING_BLOCK_LABEL_149;
	//   86  140:goto            149
		exception;
	//   87  143:astore_2        
		android/support/v4/util/ArrayMap;
	//   88  144:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   89  146:monitorexit     
		throw exception;
	//   90  147:aload_2         
	//   91  148:athrow          
		mHashes = new int[i];
	//   92  149:aload_0         
	//   93  150:iload_1         
	//   94  151:newarray        int[]
	//   95  153:putfield        #39  <Field int[] mHashes>
		mArray = new Object[i << 1];
	//   96  156:aload_0         
	//   97  157:iload_1         
	//   98  158:iconst_1        
	//   99  159:ishl            
	//  100  160:anewarray       Object[]
	//  101  163:putfield        #44  <Field Object[] mArray>
		return;
	//  102  166:return          
	}

	private static int binarySearchHashes(int ai[], int i, int j)
	{
		try
		{
			i = ContainerHelpers.binarySearch(ai, i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #77  <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//    4    6:istore_1        
		}
	//*   5    7:iload_1         
	//*   6    8:ireturn         
	//*   7    9:new             #79  <Class ConcurrentModificationException>
	//*   8   12:dup             
	//*   9   13:invokespecial   #80  <Method void ConcurrentModificationException()>
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
	//    4    7:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mTwiceBaseCacheSize < 10)
	//*   6   10:getstatic       #66  <Field int mTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          49
		{
			aobj[0] = ((Object) (mTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #62  <Field Object[] mTwiceBaseCache>
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
	//   25   38:putstatic       #62  <Field Object[] mTwiceBaseCache>
		mTwiceBaseCacheSize++;
	//   26   41:getstatic       #66  <Field int mTwiceBaseCacheSize>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putstatic       #66  <Field int mTwiceBaseCacheSize>
_L3:
		android/support/v4/util/ArrayMap;
	//   30   49:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		return;
	//   32   52:return          
		ai;
	//   33   53:astore_0        
		android/support/v4/util/ArrayMap;
	//   34   54:ldc1            #60  <Class ArrayMap>
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
	//   42   65:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   43   67:monitorenter    
		if(mBaseCacheSize >= 10) goto _L7; else goto _L6
	//   44   68:getstatic       #70  <Field int mBaseCacheSize>
	//   45   71:bipush          10
	//   46   73:icmpge          107
_L6:
		aobj[0] = ((Object) (mBaseCache));
	//   47   76:aload_1         
	//   48   77:iconst_0        
	//   49   78:getstatic       #68  <Field Object[] mBaseCache>
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
	//   63   96:putstatic       #68  <Field Object[] mBaseCache>
		mBaseCacheSize++;
	//   64   99:getstatic       #70  <Field int mBaseCacheSize>
	//   65  102:iconst_1        
	//   66  103:iadd            
	//   67  104:putstatic       #70  <Field int mBaseCacheSize>
_L7:
		android/support/v4/util/ArrayMap;
	//   68  107:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   69  109:monitorexit     
		return;
	//   70  110:return          
		ai;
	//   71  111:astore_0        
		android/support/v4/util/ArrayMap;
	//   72  112:ldc1            #60  <Class ArrayMap>
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
		if(mSize > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int mSize>
	//*   2    4:ifle            47
		{
			int ai[] = mHashes;
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field int[] mHashes>
	//    5   11:astore_2        
			Object aobj[] = mArray;
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field Object[] mArray>
	//    8   16:astore_3        
			int i = mSize;
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field int mSize>
	//   11   21:istore_1        
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   12   22:aload_0         
	//   13   23:getstatic       #37  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   14   26:putfield        #39  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   15   29:aload_0         
	//   16   30:getstatic       #42  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   17   33:putfield        #44  <Field Object[] mArray>
			mSize = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #46  <Field int mSize>
			freeArrays(ai, aobj, i);
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:iload_1         
	//   24   44:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
		}
		if(mSize > 0)
	//*  25   47:aload_0         
	//*  26   48:getfield        #46  <Field int mSize>
	//*  27   51:ifle            62
			throw new ConcurrentModificationException();
	//   28   54:new             #79  <Class ConcurrentModificationException>
	//   29   57:dup             
	//   30   58:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   31   61:athrow          
		else
			return;
	//   32   62:return          
	}

	public boolean containsKey(Object obj)
	{
		return indexOfKey(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method int indexOfKey(Object)>
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
	//    2    2:invokevirtual   #95  <Method int indexOfValue(Object)>
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
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore_2        
		if(mHashes.length < i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field int[] mHashes>
	//*   5    9:arraylength     
	//*   6   10:iload_1         
	//*   7   11:icmpge          69
		{
			int ai[] = mHashes;
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field int[] mHashes>
	//   10   18:astore_3        
			Object aobj[] = mArray;
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field Object[] mArray>
	//   13   23:astore          4
			allocArrays(i);
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:invokespecial   #51  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  17   30:aload_0         
	//*  18   31:getfield        #46  <Field int mSize>
	//*  19   34:ifle            62
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, j);
	//   20   37:aload_3         
	//   21   38:iconst_0        
	//   22   39:aload_0         
	//   23   40:getfield        #39  <Field int[] mHashes>
	//   24   43:iconst_0        
	//   25   44:iload_2         
	//   26   45:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, j << 1);
	//   27   48:aload           4
	//   28   50:iconst_0        
	//   29   51:aload_0         
	//   30   52:getfield        #44  <Field Object[] mArray>
	//   31   55:iconst_0        
	//   32   56:iload_2         
	//   33   57:iconst_1        
	//   34   58:ishl            
	//   35   59:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, j);
	//   36   62:aload_3         
	//   37   63:aload           4
	//   38   65:iload_2         
	//   39   66:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
		}
		if(mSize != j)
	//*  40   69:aload_0         
	//*  41   70:getfield        #46  <Field int mSize>
	//*  42   73:iload_2         
	//*  43   74:icmpeq          85
			throw new ConcurrentModificationException();
	//   44   77:new             #79  <Class ConcurrentModificationException>
	//   45   80:dup             
	//   46   81:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   47   84:athrow          
		else
			return;
	//   48   85:return          
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
	//*  12   20:invokevirtual   #111 <Method int size()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #111 <Method int size()>
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
	//   22   36:getfield        #46  <Field int mSize>
	//   23   39:icmpge          106
		obj1 = keyAt(i);
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #115 <Method Object keyAt(int)>
	//   27   47:astore          4
		obj3 = valueAt(i);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #118 <Method Object valueAt(int)>
	//   31   54:astore          5
		obj4 = ((SimpleArrayMap) (obj)).get(obj1);
	//   32   56:aload_1         
	//   33   57:aload           4
	//   34   59:invokevirtual   #122 <Method Object get(Object)>
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
	//*  42   77:invokevirtual   #124 <Method boolean containsKey(Object)>
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
	//   48   89:invokevirtual   #126 <Method boolean Object.equals(Object)>
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
	//*  62  109:instanceof      #128 <Class Map>
	//*  63  112:ifeq            215
	//*  64  115:aload_1         
	//*  65  116:checkcast       #128 <Class Map>
	//*  66  119:astore_1        
	//*  67  120:aload_0         
	//*  68  121:invokevirtual   #111 <Method int size()>
	//*  69  124:aload_1         
	//*  70  125:invokeinterface #129 <Method int Map.size()>
	//*  71  130:icmpeq          135
	//*  72  133:iconst_0        
	//*  73  134:ireturn         
	//*  74  135:iconst_0        
	//*  75  136:istore_2        
	//*  76  137:iload_2         
	//*  77  138:aload_0         
	//*  78  139:getfield        #46  <Field int mSize>
	//*  79  142:icmpge          213
	//*  80  145:aload_0         
	//*  81  146:iload_2         
	//*  82  147:invokevirtual   #115 <Method Object keyAt(int)>
	//*  83  150:astore          4
	//*  84  152:aload_0         
	//*  85  153:iload_2         
	//*  86  154:invokevirtual   #118 <Method Object valueAt(int)>
	//*  87  157:astore          5
	//*  88  159:aload_1         
	//*  89  160:aload           4
	//*  90  162:invokeinterface #130 <Method Object Map.get(Object)>
	//*  91  167:astore          6
	//*  92  169:aload           5
	//*  93  171:ifnonnull       192
	//*  94  174:aload           6
	//*  95  176:ifnonnull       231
	//*  96  179:aload_1         
	//*  97  180:aload           4
	//*  98  182:invokeinterface #131 <Method boolean Map.containsKey(Object)>
	//*  99  187:ifne            206
	//* 100  190:iconst_0        
	//* 101  191:ireturn         
	//* 102  192:aload           5
	//* 103  194:aload           6
	//* 104  196:invokevirtual   #126 <Method boolean Object.equals(Object)>
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
	//    2    2:invokevirtual   #91  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            21
			return mArray[(i << 1) + 1];
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field Object[] mArray>
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
	//    1    1:getfield        #39  <Field int[] mHashes>
	//    2    4:astore          7
		Object aobj[] = mArray;
	//    3    6:aload_0         
	//    4    7:getfield        #44  <Field Object[] mArray>
	//    5   10:astore          8
		int i1 = mSize;
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field int mSize>
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
	//   32   55:invokevirtual   #135 <Method int Object.hashCode()>
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
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = binarySearchHashes(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
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
	//*  19   35:getfield        #44  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:iconst_1        
	//*  22   41:ishl            
	//*  23   42:aaload          
	//*  24   43:invokevirtual   #126 <Method boolean Object.equals(Object)>
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
	//*  36   64:getfield        #39  <Field int[] mHashes>
	//*  37   67:iload_3         
	//*  38   68:iaload          
	//*  39   69:iload_2         
	//*  40   70:icmpne          97
			if(obj.equals(mArray[j << 1]))
	//*  41   73:aload_1         
	//*  42   74:aload_0         
	//*  43   75:getfield        #44  <Field Object[] mArray>
	//*  44   78:iload_3         
	//*  45   79:iconst_1        
	//*  46   80:ishl            
	//*  47   81:aaload          
	//*  48   82:invokevirtual   #126 <Method boolean Object.equals(Object)>
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
	//*  64  109:getfield        #39  <Field int[] mHashes>
	//*  65  112:iload           4
	//*  66  114:iaload          
	//*  67  115:iload_2         
	//*  68  116:icmpne          147
			if(obj.equals(mArray[l << 1]))
	//*  69  119:aload_1         
	//*  70  120:aload_0         
	//*  71  121:getfield        #44  <Field Object[] mArray>
	//*  72  124:iload           4
	//*  73  126:iconst_1        
	//*  74  127:ishl            
	//*  75  128:aaload          
	//*  76  129:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  77  132:ifeq            138
				return l;
	//   78  135:iload           4
	//   79  137:ireturn         

	//   80  138:iload           4
	//   81  140:iconst_1        
	//   82  141:isub            
	//   83  142:istore          4
	//*  84  144:goto            103
		return ~j;
	//   85  147:iload_3         
	//   86  148:iconst_m1       
	//   87  149:ixor            
	//   88  150:ireturn         
	}

	public int indexOfKey(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #142 <Method int indexOfNull()>
	//    4    8:ireturn         
		else
			return indexOf(obj, obj.hashCode());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #135 <Method int Object.hashCode()>
	//    9   15:invokevirtual   #144 <Method int indexOf(Object, int)>
	//   10   18:ireturn         
	}

	int indexOfNull()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = binarySearchHashes(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #39  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l << 1] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #44  <Field Object[] mArray>
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
	//*  34   50:getfield        #39  <Field int[] mHashes>
	//*  35   53:iload_1         
	//*  36   54:iaload          
	//*  37   55:ifne            78
			if(mArray[i << 1] == null)
	//*  38   58:aload_0         
	//*  39   59:getfield        #44  <Field Object[] mArray>
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
	//*  59   87:getfield        #39  <Field int[] mHashes>
	//*  60   90:iload_2         
	//*  61   91:iaload          
	//*  62   92:ifne            115
			if(mArray[k << 1] == null)
	//*  63   95:aload_0         
	//*  64   96:getfield        #44  <Field Object[] mArray>
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
		return ~i;
	//   77  115:iload_1         
	//   78  116:iconst_m1       
	//   79  117:ixor            
	//   80  118:ireturn         
	}

	int indexOfValue(Object obj)
	{
		int k = mSize * 2;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:istore_3        
		Object aobj[] = mArray;
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field Object[] mArray>
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
	//*  37   54:invokevirtual   #126 <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #46  <Field int mSize>
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
	//    1    1:getfield        #44  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:ishl            
	//    5    7:aaload          
	//    6    8:areturn         
	}

	public Object put(Object obj, Object obj1)
	{
		int j1 = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore          5
		int i;
		int i1;
		if(obj == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       21
		{
			i = indexOfNull();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #142 <Method int indexOfNull()>
	//    7   14:istore_3        
			i1 = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
		} else
	//*  10   18:goto            35
		{
			i1 = obj.hashCode();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #135 <Method int Object.hashCode()>
	//   13   25:istore          4
			i = indexOf(obj, i1);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload           4
	//   17   31:invokevirtual   #144 <Method int indexOf(Object, int)>
	//   18   34:istore_3        
		}
		if(i >= 0)
	//*  19   35:iload_3         
	//*  20   36:iflt            61
		{
			i = (i << 1) + 1;
	//   21   39:iload_3         
	//   22   40:iconst_1        
	//   23   41:ishl            
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_3        
			obj = mArray[i];
	//   27   45:aload_0         
	//   28   46:getfield        #44  <Field Object[] mArray>
	//   29   49:iload_3         
	//   30   50:aaload          
	//   31   51:astore_1        
			mArray[i] = obj1;
	//   32   52:aload_0         
	//   33   53:getfield        #44  <Field Object[] mArray>
	//   34   56:iload_3         
	//   35   57:aload_2         
	//   36   58:aastore         
			return obj;
	//   37   59:aload_1         
	//   38   60:areturn         
		}
		int k1 = ~i;
	//   39   61:iload_3         
	//   40   62:iconst_m1       
	//   41   63:ixor            
	//   42   64:istore          6
		if(j1 >= mHashes.length)
	//*  43   66:iload           5
	//*  44   68:aload_0         
	//*  45   69:getfield        #39  <Field int[] mHashes>
	//*  46   72:arraylength     
	//*  47   73:icmplt          184
		{
			int j = 4;
	//   48   76:iconst_4        
	//   49   77:istore_3        
			if(j1 >= 8)
	//*  50   78:iload           5
	//*  51   80:bipush          8
	//*  52   82:icmplt          96
				j = (j1 >> 1) + j1;
	//   53   85:iload           5
	//   54   87:iconst_1        
	//   55   88:ishr            
	//   56   89:iload           5
	//   57   91:iadd            
	//   58   92:istore_3        
			else
	//*  59   93:goto            105
			if(j1 >= 4)
	//*  60   96:iload           5
	//*  61   98:iconst_4        
	//*  62   99:icmplt          105
				j = 8;
	//   63  102:bipush          8
	//   64  104:istore_3        
			int ai[] = mHashes;
	//   65  105:aload_0         
	//   66  106:getfield        #39  <Field int[] mHashes>
	//   67  109:astore          7
			Object aobj1[] = mArray;
	//   68  111:aload_0         
	//   69  112:getfield        #44  <Field Object[] mArray>
	//   70  115:astore          8
			allocArrays(j);
	//   71  117:aload_0         
	//   72  118:iload_3         
	//   73  119:invokespecial   #51  <Method void allocArrays(int)>
			if(j1 != mSize)
	//*  74  122:iload           5
	//*  75  124:aload_0         
	//*  76  125:getfield        #46  <Field int mSize>
	//*  77  128:icmpeq          139
				throw new ConcurrentModificationException();
	//   78  131:new             #79  <Class ConcurrentModificationException>
	//   79  134:dup             
	//   80  135:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   81  138:athrow          
			if(mHashes.length > 0)
	//*  82  139:aload_0         
	//*  83  140:getfield        #39  <Field int[] mHashes>
	//*  84  143:arraylength     
	//*  85  144:ifle            175
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
	//   86  147:aload           7
	//   87  149:iconst_0        
	//   88  150:aload_0         
	//   89  151:getfield        #39  <Field int[] mHashes>
	//   90  154:iconst_0        
	//   91  155:aload           7
	//   92  157:arraylength     
	//   93  158:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj1)), 0, ((Object) (mArray)), 0, aobj1.length);
	//   94  161:aload           8
	//   95  163:iconst_0        
	//   96  164:aload_0         
	//   97  165:getfield        #44  <Field Object[] mArray>
	//   98  168:iconst_0        
	//   99  169:aload           8
	//  100  171:arraylength     
	//  101  172:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj1, j1);
	//  102  175:aload           7
	//  103  177:aload           8
	//  104  179:iload           5
	//  105  181:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
		}
		if(k1 < j1)
	//* 106  184:iload           6
	//* 107  186:iload           5
	//* 108  188:icmpge          250
		{
			int ai1[] = mHashes;
	//  109  191:aload_0         
	//  110  192:getfield        #39  <Field int[] mHashes>
	//  111  195:astore          7
			int ai2[] = mHashes;
	//  112  197:aload_0         
	//  113  198:getfield        #39  <Field int[] mHashes>
	//  114  201:astore          8
			int k = k1 + 1;
	//  115  203:iload           6
	//  116  205:iconst_1        
	//  117  206:iadd            
	//  118  207:istore_3        
			System.arraycopy(((Object) (ai1)), k1, ((Object) (ai2)), k, j1 - k1);
	//  119  208:aload           7
	//  120  210:iload           6
	//  121  212:aload           8
	//  122  214:iload_3         
	//  123  215:iload           5
	//  124  217:iload           6
	//  125  219:isub            
	//  126  220:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), k1 << 1, ((Object) (mArray)), k << 1, mSize - k1 << 1);
	//  127  223:aload_0         
	//  128  224:getfield        #44  <Field Object[] mArray>
	//  129  227:iload           6
	//  130  229:iconst_1        
	//  131  230:ishl            
	//  132  231:aload_0         
	//  133  232:getfield        #44  <Field Object[] mArray>
	//  134  235:iload_3         
	//  135  236:iconst_1        
	//  136  237:ishl            
	//  137  238:aload_0         
	//  138  239:getfield        #46  <Field int mSize>
	//  139  242:iload           6
	//  140  244:isub            
	//  141  245:iconst_1        
	//  142  246:ishl            
	//  143  247:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		if(j1 == mSize && k1 < mHashes.length)
	//* 144  250:iload           5
	//* 145  252:aload_0         
	//* 146  253:getfield        #46  <Field int mSize>
	//* 147  256:icmpne          318
	//* 148  259:iload           6
	//* 149  261:aload_0         
	//* 150  262:getfield        #39  <Field int[] mHashes>
	//* 151  265:arraylength     
	//* 152  266:icmplt          272
	//* 153  269:goto            318
		{
			mHashes[k1] = i1;
	//  154  272:aload_0         
	//  155  273:getfield        #39  <Field int[] mHashes>
	//  156  276:iload           6
	//  157  278:iload           4
	//  158  280:iastore         
			Object aobj[] = mArray;
	//  159  281:aload_0         
	//  160  282:getfield        #44  <Field Object[] mArray>
	//  161  285:astore          7
			int l = k1 << 1;
	//  162  287:iload           6
	//  163  289:iconst_1        
	//  164  290:ishl            
	//  165  291:istore_3        
			aobj[l] = obj;
	//  166  292:aload           7
	//  167  294:iload_3         
	//  168  295:aload_1         
	//  169  296:aastore         
			mArray[l + 1] = obj1;
	//  170  297:aload_0         
	//  171  298:getfield        #44  <Field Object[] mArray>
	//  172  301:iload_3         
	//  173  302:iconst_1        
	//  174  303:iadd            
	//  175  304:aload_2         
	//  176  305:aastore         
			mSize = mSize + 1;
	//  177  306:aload_0         
	//  178  307:aload_0         
	//  179  308:getfield        #46  <Field int mSize>
	//  180  311:iconst_1        
	//  181  312:iadd            
	//  182  313:putfield        #46  <Field int mSize>
			return ((Object) (null));
	//  183  316:aconst_null     
	//  184  317:areturn         
		} else
		{
			throw new ConcurrentModificationException();
	//  185  318:new             #79  <Class ConcurrentModificationException>
	//  186  321:dup             
	//  187  322:invokespecial   #80  <Method void ConcurrentModificationException()>
	//  188  325:athrow          
		}
	}

	public void putAll(SimpleArrayMap simplearraymap)
	{
		int j = simplearraymap.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore_3        
		ensureCapacity(mSize + j);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field int mSize>
	//    6   10:iload_3         
	//    7   11:iadd            
	//    8   12:invokevirtual   #152 <Method void ensureCapacity(int)>
		int k = mSize;
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field int mSize>
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
	//   19   33:getfield        #39  <Field int[] mHashes>
	//   20   36:iconst_0        
	//   21   37:aload_0         
	//   22   38:getfield        #39  <Field int[] mHashes>
	//   23   41:iconst_0        
	//   24   42:iload_3         
	//   25   43:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (simplearraymap.mArray)), 0, ((Object) (mArray)), 0, j << 1);
	//   26   46:aload_1         
	//   27   47:getfield        #44  <Field Object[] mArray>
	//   28   50:iconst_0        
	//   29   51:aload_0         
	//   30   52:getfield        #44  <Field Object[] mArray>
	//   31   55:iconst_0        
	//   32   56:iload_3         
	//   33   57:iconst_1        
	//   34   58:ishl            
	//   35   59:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   36   62:aload_0         
	//   37   63:iload_3         
	//   38   64:putfield        #46  <Field int mSize>
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
	//   46   76:invokevirtual   #115 <Method Object keyAt(int)>
	//   47   79:aload_1         
	//   48   80:iload_2         
	//   49   81:invokevirtual   #118 <Method Object valueAt(int)>
	//   50   84:invokevirtual   #154 <Method Object put(Object, Object)>
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
	//    2    2:invokevirtual   #91  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
			return removeAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #159 <Method Object removeAt(int)>
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
	//    1    1:getfield        #44  <Field Object[] mArray>
	//    2    4:astore          7
		int k1 = i << 1;
	//    3    6:iload_1         
	//    4    7:iconst_1        
	//    5    8:ishl            
	//    6    9:istore          5
		Object obj = aobj[k1 + 1];
	//    7   11:aload           7
	//    8   13:iload           5
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:aaload          
	//   12   18:astore          7
		int j1 = mSize;
	//   13   20:aload_0         
	//   14   21:getfield        #46  <Field int mSize>
	//   15   24:istore          4
		boolean flag = false;
	//   16   26:iconst_0        
	//   17   27:istore_2        
		if(j1 <= 1)
	//*  18   28:iload           4
	//*  19   30:iconst_1        
	//*  20   31:icmpgt          66
		{
			freeArrays(mHashes, mArray, j1);
	//   21   34:aload_0         
	//   22   35:getfield        #39  <Field int[] mHashes>
	//   23   38:aload_0         
	//   24   39:getfield        #44  <Field Object[] mArray>
	//   25   42:iload           4
	//   26   44:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   27   47:aload_0         
	//   28   48:getstatic       #37  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   29   51:putfield        #39  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   30   54:aload_0         
	//   31   55:getstatic       #42  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   32   58:putfield        #44  <Field Object[] mArray>
			i = ((int) (flag));
	//   33   61:iload_2         
	//   34   62:istore_1        
		} else
	//*  35   63:goto            315
		{
			int i1 = j1 - 1;
	//   36   66:iload           4
	//   37   68:iconst_1        
	//   38   69:isub            
	//   39   70:istore_3        
			int ai[] = mHashes;
	//   40   71:aload_0         
	//   41   72:getfield        #39  <Field int[] mHashes>
	//   42   75:astore          8
			int j = 8;
	//   43   77:bipush          8
	//   44   79:istore_2        
			if(ai.length > 8 && mSize < mHashes.length / 3)
	//*  45   80:aload           8
	//*  46   82:arraylength     
	//*  47   83:bipush          8
	//*  48   85:icmple          232
	//*  49   88:aload_0         
	//*  50   89:getfield        #46  <Field int mSize>
	//*  51   92:aload_0         
	//*  52   93:getfield        #39  <Field int[] mHashes>
	//*  53   96:arraylength     
	//*  54   97:iconst_3        
	//*  55   98:idiv            
	//*  56   99:icmpge          232
			{
				if(j1 > 8)
	//*  57  102:iload           4
	//*  58  104:bipush          8
	//*  59  106:icmple          117
					j = j1 + (j1 >> 1);
	//   60  109:iload           4
	//   61  111:iload           4
	//   62  113:iconst_1        
	//   63  114:ishr            
	//   64  115:iadd            
	//   65  116:istore_2        
				int ai1[] = mHashes;
	//   66  117:aload_0         
	//   67  118:getfield        #39  <Field int[] mHashes>
	//   68  121:astore          8
				Object aobj2[] = mArray;
	//   69  123:aload_0         
	//   70  124:getfield        #44  <Field Object[] mArray>
	//   71  127:astore          9
				allocArrays(j);
	//   72  129:aload_0         
	//   73  130:iload_2         
	//   74  131:invokespecial   #51  <Method void allocArrays(int)>
				if(j1 != mSize)
	//*  75  134:iload           4
	//*  76  136:aload_0         
	//*  77  137:getfield        #46  <Field int mSize>
	//*  78  140:icmpeq          151
					throw new ConcurrentModificationException();
	//   79  143:new             #79  <Class ConcurrentModificationException>
	//   80  146:dup             
	//   81  147:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   82  150:athrow          
				if(i > 0)
	//*  83  151:iload_1         
	//*  84  152:ifle            180
				{
					System.arraycopy(((Object) (ai1)), 0, ((Object) (mHashes)), 0, i);
	//   85  155:aload           8
	//   86  157:iconst_0        
	//   87  158:aload_0         
	//   88  159:getfield        #39  <Field int[] mHashes>
	//   89  162:iconst_0        
	//   90  163:iload_1         
	//   91  164:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj2)), 0, ((Object) (mArray)), 0, k1);
	//   92  167:aload           9
	//   93  169:iconst_0        
	//   94  170:aload_0         
	//   95  171:getfield        #44  <Field Object[] mArray>
	//   96  174:iconst_0        
	//   97  175:iload           5
	//   98  177:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				if(i < i1)
	//*  99  180:iload_1         
	//* 100  181:iload_3         
	//* 101  182:icmpge          313
				{
					int k = i + 1;
	//  102  185:iload_1         
	//  103  186:iconst_1        
	//  104  187:iadd            
	//  105  188:istore_2        
					int ai4[] = mHashes;
	//  106  189:aload_0         
	//  107  190:getfield        #39  <Field int[] mHashes>
	//  108  193:astore          10
					int l1 = i1 - i;
	//  109  195:iload_3         
	//  110  196:iload_1         
	//  111  197:isub            
	//  112  198:istore          6
					System.arraycopy(((Object) (ai1)), k, ((Object) (ai4)), i, l1);
	//  113  200:aload           8
	//  114  202:iload_2         
	//  115  203:aload           10
	//  116  205:iload_1         
	//  117  206:iload           6
	//  118  208:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj2)), k << 1, ((Object) (mArray)), k1, l1 << 1);
	//  119  211:aload           9
	//  120  213:iload_2         
	//  121  214:iconst_1        
	//  122  215:ishl            
	//  123  216:aload_0         
	//  124  217:getfield        #44  <Field Object[] mArray>
	//  125  220:iload           5
	//  126  222:iload           6
	//  127  224:iconst_1        
	//  128  225:ishl            
	//  129  226:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
			} else
	//* 130  229:goto            313
			{
				if(i < i1)
	//* 131  232:iload_1         
	//* 132  233:iload_3         
	//* 133  234:icmpge          289
				{
					int ai2[] = mHashes;
	//  134  237:aload_0         
	//  135  238:getfield        #39  <Field int[] mHashes>
	//  136  241:astore          8
					int l = i + 1;
	//  137  243:iload_1         
	//  138  244:iconst_1        
	//  139  245:iadd            
	//  140  246:istore_2        
					int ai3[] = mHashes;
	//  141  247:aload_0         
	//  142  248:getfield        #39  <Field int[] mHashes>
	//  143  251:astore          9
					int i2 = i1 - i;
	//  144  253:iload_3         
	//  145  254:iload_1         
	//  146  255:isub            
	//  147  256:istore          6
					System.arraycopy(((Object) (ai2)), l, ((Object) (ai3)), i, i2);
	//  148  258:aload           8
	//  149  260:iload_2         
	//  150  261:aload           9
	//  151  263:iload_1         
	//  152  264:iload           6
	//  153  266:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (mArray)), l << 1, ((Object) (mArray)), k1, i2 << 1);
	//  154  269:aload_0         
	//  155  270:getfield        #44  <Field Object[] mArray>
	//  156  273:iload_2         
	//  157  274:iconst_1        
	//  158  275:ishl            
	//  159  276:aload_0         
	//  160  277:getfield        #44  <Field Object[] mArray>
	//  161  280:iload           5
	//  162  282:iload           6
	//  163  284:iconst_1        
	//  164  285:ishl            
	//  165  286:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				Object aobj1[] = mArray;
	//  166  289:aload_0         
	//  167  290:getfield        #44  <Field Object[] mArray>
	//  168  293:astore          8
				i = i1 << 1;
	//  169  295:iload_3         
	//  170  296:iconst_1        
	//  171  297:ishl            
	//  172  298:istore_1        
				aobj1[i] = null;
	//  173  299:aload           8
	//  174  301:iload_1         
	//  175  302:aconst_null     
	//  176  303:aastore         
				mArray[i + 1] = null;
	//  177  304:aload_0         
	//  178  305:getfield        #44  <Field Object[] mArray>
	//  179  308:iload_1         
	//  180  309:iconst_1        
	//  181  310:iadd            
	//  182  311:aconst_null     
	//  183  312:aastore         
			}
			i = i1;
	//  184  313:iload_3         
	//  185  314:istore_1        
		}
		if(j1 != mSize)
	//* 186  315:iload           4
	//* 187  317:aload_0         
	//* 188  318:getfield        #46  <Field int mSize>
	//* 189  321:icmpeq          332
		{
			throw new ConcurrentModificationException();
	//  190  324:new             #79  <Class ConcurrentModificationException>
	//  191  327:dup             
	//  192  328:invokespecial   #80  <Method void ConcurrentModificationException()>
	//  193  331:athrow          
		} else
		{
			mSize = i;
	//  194  332:aload_0         
	//  195  333:iload_1         
	//  196  334:putfield        #46  <Field int mSize>
			return obj;
	//  197  337:aload           7
	//  198  339:areturn         
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
		Object obj1 = mArray[i];
	//    6    6:aload_0         
	//    7    7:getfield        #44  <Field Object[] mArray>
	//    8   10:iload_1         
	//    9   11:aaload          
	//   10   12:astore_3        
		mArray[i] = obj;
	//   11   13:aload_0         
	//   12   14:getfield        #44  <Field Object[] mArray>
	//   13   17:iload_1         
	//   14   18:aload_2         
	//   15   19:aastore         
		return obj1;
	//   16   20:aload_3         
	//   17   21:areturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:ireturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #167 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "{}";
	//    3    7:ldc1            #169 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #171 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #46  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #173 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #46  <Field int mSize>
	//*  22   39:icmpge          121
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #179 <String ", ">
	//   27   49:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = keyAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #115 <Method Object keyAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Map)");
	//   41   73:aload_2         
	//   42   74:ldc1            #187 <String "(this Map)">
	//   43   76:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
			stringbuilder.append('=');
	//   45   80:aload_2         
	//   46   81:bipush          61
	//   47   83:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   48   86:pop             
			obj = valueAt(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokevirtual   #118 <Method Object valueAt(int)>
	//   52   92:astore_3        
			if(obj != this)
	//*  53   93:aload_3         
	//*  54   94:aload_0         
	//*  55   95:if_acmpeq       107
				stringbuilder.append(obj);
	//   56   98:aload_2         
	//   57   99:aload_3         
	//   58  100:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//   59  103:pop             
			else
	//*  60  104:goto            114
				stringbuilder.append("(this Map)");
	//   61  107:aload_2         
	//   62  108:ldc1            #187 <String "(this Map)">
	//   63  110:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
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
	//   72  124:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   73  127:pop             
		return stringbuilder.toString();
	//   74  128:aload_2         
	//   75  129:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   76  132:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[(i << 1) + 1];
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object[] mArray>
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
