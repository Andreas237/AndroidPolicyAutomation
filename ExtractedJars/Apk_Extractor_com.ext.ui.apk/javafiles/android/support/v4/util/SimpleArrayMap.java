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
	//*   3    5:ifne            28
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
	//*  10   22:aload_0         
	//*  11   23:iconst_0        
	//*  12   24:putfield        #46  <Field int mSize>
	//*  13   27:return          
		{
			allocArrays(i);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokespecial   #51  <Method void allocArrays(int)>
		}
		mSize = 0;
	//*  17   33:goto            22
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
		if(i != 8) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          96
_L1:
		android/support/v4/util/ArrayMap;
	//    3    6:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(mTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_69;
	//    5    9:getstatic       #62  <Field Object[] mTwiceBaseCache>
	//    6   12:ifnull          69
		aobj = mTwiceBaseCache;
	//    7   15:getstatic       #62  <Field Object[] mTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #44  <Field Object[] mArray>
		mTwiceBaseCache = (Object[])(Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #63  <Class Object[]>
	//   16   30:checkcast       #63  <Class Object[]>
	//   17   33:putstatic       #62  <Field Object[] mTwiceBaseCache>
		mHashes = (int[])(int[])aobj[1];
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aaload          
	//   22   40:checkcast       #64  <Class int[]>
	//   23   43:checkcast       #64  <Class int[]>
	//   24   46:putfield        #39  <Field int[] mHashes>
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
	//   33   57:getstatic       #66  <Field int mTwiceBaseCacheSize>
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:putstatic       #66  <Field int mTwiceBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   37   65:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   38   67:monitorexit     
		return;
	//   39   68:return          
		android/support/v4/util/ArrayMap;
	//   40   69:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
_L4:
		mHashes = new int[i];
	//   42   72:aload_0         
	//   43   73:iload_1         
	//   44   74:newarray        int[]
	//   45   76:putfield        #39  <Field int[] mHashes>
		mArray = new Object[i << 1];
	//   46   79:aload_0         
	//   47   80:iload_1         
	//   48   81:iconst_1        
	//   49   82:ishl            
	//   50   83:anewarray       Object[]
	//   51   86:putfield        #44  <Field Object[] mArray>
		return;
	//   52   89:return          
		Exception exception;
		exception;
	//   53   90:astore_2        
		android/support/v4/util/ArrayMap;
	//   54   91:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   55   93:monitorexit     
		throw exception;
	//   56   94:aload_2         
	//   57   95:athrow          
_L2:
		if(i != 4) goto _L4; else goto _L3
	//   58   96:iload_1         
	//   59   97:iconst_4        
	//   60   98:icmpne          72
_L3:
		android/support/v4/util/ArrayMap;
	//   61  101:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   62  103:monitorenter    
		if(mBaseCache == null)
			break MISSING_BLOCK_LABEL_170;
	//   63  104:getstatic       #68  <Field Object[] mBaseCache>
	//   64  107:ifnull          170
		exception = ((Exception) (mBaseCache));
	//   65  110:getstatic       #68  <Field Object[] mBaseCache>
	//   66  113:astore_2        
		mArray = ((Object []) (exception));
	//   67  114:aload_0         
	//   68  115:aload_2         
	//   69  116:putfield        #44  <Field Object[] mArray>
		mBaseCache = (Object[])(Object[])exception[0];
	//   70  119:aload_2         
	//   71  120:iconst_0        
	//   72  121:aaload          
	//   73  122:checkcast       #63  <Class Object[]>
	//   74  125:checkcast       #63  <Class Object[]>
	//   75  128:putstatic       #68  <Field Object[] mBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   76  131:aload_0         
	//   77  132:aload_2         
	//   78  133:iconst_1        
	//   79  134:aaload          
	//   80  135:checkcast       #64  <Class int[]>
	//   81  138:checkcast       #64  <Class int[]>
	//   82  141:putfield        #39  <Field int[] mHashes>
		exception[1] = null;
	//   83  144:aload_2         
	//   84  145:iconst_1        
	//   85  146:aconst_null     
	//   86  147:aastore         
		exception[0] = null;
	//   87  148:aload_2         
	//   88  149:iconst_0        
	//   89  150:aconst_null     
	//   90  151:aastore         
		mBaseCacheSize--;
	//   91  152:getstatic       #70  <Field int mBaseCacheSize>
	//   92  155:iconst_1        
	//   93  156:isub            
	//   94  157:putstatic       #70  <Field int mBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   95  160:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   96  162:monitorexit     
		return;
	//   97  163:return          
		exception;
	//   98  164:astore_2        
		android/support/v4/util/ArrayMap;
	//   99  165:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//  100  167:monitorexit     
		throw exception;
	//  101  168:aload_2         
	//  102  169:athrow          
		android/support/v4/util/ArrayMap;
	//  103  170:ldc1            #60  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//  104  172:monitorexit     
		  goto _L4
	//* 105  173:goto            72
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
		// Misplaced declaration of an exception variable
		catch(int ai[])
	//*   7    9:astore_0        
		{
			throw new ConcurrentModificationException();
	//    8   10:new             #79  <Class ConcurrentModificationException>
	//    9   13:dup             
	//   10   14:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   11   17:athrow          
		}
		return i;
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
	//*  23   34:goto            117
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
	//   41   62:icmpne          133
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
		aobj[1] = ((Object) (ai));
		i = (i << 1) - 1;
		while(i >= 2) 
	//*  76  117:iload_2         
	//*  77  118:iconst_2        
	//*  78  119:icmplt          37
		{
			aobj[i] = null;
	//   79  122:aload_1         
	//   80  123:iload_2         
	//   81  124:aconst_null     
	//   82  125:aastore         
			i--;
	//   83  126:iload_2         
	//   84  127:iconst_1        
	//   85  128:isub            
	//   86  129:istore_2        
		}
		  goto _L8
	//*  87  130:goto            117
_L5:
		return;
	//   88  133:return          
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
		if(this != obj) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(!(obj instanceof SimpleArrayMap)) goto _L4; else goto _L3
	//    5    7:aload_1         
	//    6    8:instanceof      #2   <Class SimpleArrayMap>
	//    7   11:ifeq            113
_L3:
		int i;
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
_L5:
		Object obj1;
		Object obj2;
		Object obj3;
		if(i >= mSize)
			continue; /* Loop/switch isn't completed */
	//   20   34:iload_2         
	//   21   35:aload_0         
	//   22   36:getfield        #46  <Field int mSize>
	//   23   39:icmpge          5
		obj1 = keyAt(i);
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #115 <Method Object keyAt(int)>
	//   27   47:astore          4
		obj2 = valueAt(i);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #118 <Method Object valueAt(int)>
	//   31   54:astore          5
		obj3 = ((SimpleArrayMap) (obj)).get(obj1);
	//   32   56:aload_1         
	//   33   57:aload           4
	//   34   59:invokevirtual   #122 <Method Object get(Object)>
	//   35   62:astore          6
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_86;
	//   36   64:aload           5
	//   37   66:ifnonnull       86
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_227;
	//   38   69:aload           6
	//   39   71:ifnonnull       227
		if(!((SimpleArrayMap) (obj)).containsKey(obj1))
	//*  40   74:aload_1         
	//*  41   75:aload           4
	//*  42   77:invokevirtual   #124 <Method boolean containsKey(Object)>
	//*  43   80:ifne            100
			break MISSING_BLOCK_LABEL_227;
	//   44   83:goto            227
		break MISSING_BLOCK_LABEL_100;
		boolean flag;
		try
		{
			flag = obj2.equals(obj3);
	//   45   86:aload           5
	//   46   88:aload           6
	//   47   90:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//   48   93:istore_3        
		}
	//*  49   94:iload_3         
	//*  50   95:ifne            100
	//*  51   98:iconst_0        
	//*  52   99:ireturn         
	//*  53  100:iload_2         
	//*  54  101:iconst_1        
	//*  55  102:iadd            
	//*  56  103:istore_2        
	//*  57  104:goto            34
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  58  107:astore_1        
		{
			return false;
	//   59  108:iconst_0        
	//   60  109:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  61  110:astore_1        
		{
			return false;
	//   62  111:iconst_0        
	//   63  112:ireturn         
		}
		if(!flag)
			return false;
		i++;
		if(true) goto _L5; else goto _L4
_L4:
		if(!(obj instanceof Map))
			break; /* Loop/switch isn't completed */
	//   64  113:aload_1         
	//   65  114:instanceof      #128 <Class Map>
	//   66  117:ifeq            225
		obj = ((Object) ((Map)obj));
	//   67  120:aload_1         
	//   68  121:checkcast       #128 <Class Map>
	//   69  124:astore_1        
		if(size() != ((Map) (obj)).size())
	//*  70  125:aload_0         
	//*  71  126:invokevirtual   #111 <Method int size()>
	//*  72  129:aload_1         
	//*  73  130:invokeinterface #129 <Method int Map.size()>
	//*  74  135:icmpeq          140
			return false;
	//   75  138:iconst_0        
	//   76  139:ireturn         
		i = 0;
	//   77  140:iconst_0        
	//   78  141:istore_2        
_L7:
		if(i >= mSize)
			break; /* Loop/switch isn't completed */
	//   79  142:iload_2         
	//   80  143:aload_0         
	//   81  144:getfield        #46  <Field int mSize>
	//   82  147:icmpge          5
		obj1 = keyAt(i);
	//   83  150:aload_0         
	//   84  151:iload_2         
	//   85  152:invokevirtual   #115 <Method Object keyAt(int)>
	//   86  155:astore          4
		obj2 = valueAt(i);
	//   87  157:aload_0         
	//   88  158:iload_2         
	//   89  159:invokevirtual   #118 <Method Object valueAt(int)>
	//   90  162:astore          5
		obj3 = ((Map) (obj)).get(obj1);
	//   91  164:aload_1         
	//   92  165:aload           4
	//   93  167:invokeinterface #130 <Method Object Map.get(Object)>
	//   94  172:astore          6
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_198;
	//   95  174:aload           5
	//   96  176:ifnonnull       198
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_229;
	//   97  179:aload           6
	//   98  181:ifnonnull       229
		if(!((Map) (obj)).containsKey(obj1))
	//*  99  184:aload_1         
	//* 100  185:aload           4
	//* 101  187:invokeinterface #131 <Method boolean Map.containsKey(Object)>
	//* 102  192:ifne            212
			break MISSING_BLOCK_LABEL_229;
	//  103  195:goto            229
		break MISSING_BLOCK_LABEL_212;
		boolean flag1;
		try
		{
			flag1 = obj2.equals(obj3);
	//  104  198:aload           5
	//  105  200:aload           6
	//  106  202:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//  107  205:istore_3        
		}
	//* 108  206:iload_3         
	//* 109  207:ifne            212
	//* 110  210:iconst_0        
	//* 111  211:ireturn         
	//* 112  212:iload_2         
	//* 113  213:iconst_1        
	//* 114  214:iadd            
	//* 115  215:istore_2        
	//* 116  216:goto            142
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 117  219:astore_1        
		{
			return false;
	//  118  220:iconst_0        
	//  119  221:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 120  222:astore_1        
		{
			return false;
	//  121  223:iconst_0        
	//  122  224:ireturn         
		}
		if(!flag1)
			return false;
		i++;
		if(true) goto _L7; else goto _L6
_L6:
		if(true) goto _L1; else goto _L8
_L8:
		return false;
	//  123  225:iconst_0        
	//  124  226:ireturn         
		return false;
	//  125  227:iconst_0        
	//  126  228:ireturn         
		return false;
	//  127  229:iconst_0        
	//  128  230:ireturn         
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
		int k = 0;
	//   13   22:iconst_0        
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
	//*  27   44:ifnonnull       69
				l = 0;
	//   28   47:iconst_0        
	//   29   48:istore          4
			else
	//*  30   50:iload_3         
	//*  31   51:iload           4
	//*  32   53:iload           6
	//*  33   55:ixor            
	//*  34   56:iadd            
	//*  35   57:istore_3        
	//*  36   58:iload_2         
	//*  37   59:iconst_1        
	//*  38   60:iadd            
	//*  39   61:istore_2        
	//*  40   62:iload_1         
	//*  41   63:iconst_2        
	//*  42   64:iadd            
	//*  43   65:istore_1        
	//*  44   66:goto            24
				l = obj.hashCode();
	//   45   69:aload           9
	//   46   71:invokevirtual   #135 <Method int Object.hashCode()>
	//   47   74:istore          4
			k += l ^ j1;
			j++;
			i += 2;
		}
	//*  48   76:goto            50
		return k;
	//   49   79:iload_3         
	//   50   80:ireturn         
	}

	int indexOf(Object obj, int i)
	{
		int i1 = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore          6
		if(i1 != 0) goto _L2; else goto _L1
	//    3    6:iload           6
	//    4    8:ifne            15
_L1:
		int j = -1;
	//    5   11:iconst_m1       
	//    6   12:istore_3        
_L4:
		return j;
	//    7   13:iload_3         
	//    8   14:ireturn         
_L2:
		int l;
		int k = binarySearchHashes(mHashes, i1, i);
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int[] mHashes>
	//   11   19:iload           6
	//   12   21:iload_2         
	//   13   22:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
	//   14   25:istore          4
		j = k;
	//   15   27:iload           4
	//   16   29:istore_3        
		if(k >= 0)
	//*  17   30:iload           4
	//*  18   32:iflt            13
		{
			j = k;
	//   19   35:iload           4
	//   20   37:istore_3        
			if(!obj.equals(mArray[k << 1]))
	//*  21   38:aload_1         
	//*  22   39:aload_0         
	//*  23   40:getfield        #44  <Field Object[] mArray>
	//*  24   43:iload           4
	//*  25   45:iconst_1        
	//*  26   46:ishl            
	//*  27   47:aaload          
	//*  28   48:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  29   51:ifne            13
			{
				for(l = k + 1; l < i1 && mHashes[l] == i; l++)
	//*  30   54:iload           4
	//*  31   56:iconst_1        
	//*  32   57:iadd            
	//*  33   58:istore          5
	//*  34   60:iload           5
	//*  35   62:iload           6
	//*  36   64:icmpge          106
	//*  37   67:aload_0         
	//*  38   68:getfield        #39  <Field int[] mHashes>
	//*  39   71:iload           5
	//*  40   73:iaload          
	//*  41   74:iload_2         
	//*  42   75:icmpne          106
					if(obj.equals(mArray[l << 1]))
	//*  43   78:aload_1         
	//*  44   79:aload_0         
	//*  45   80:getfield        #44  <Field Object[] mArray>
	//*  46   83:iload           5
	//*  47   85:iconst_1        
	//*  48   86:ishl            
	//*  49   87:aaload          
	//*  50   88:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  51   91:ifeq            97
						return l;
	//   52   94:iload           5
	//   53   96:ireturn         

	//   54   97:iload           5
	//   55   99:iconst_1        
	//   56  100:iadd            
	//   57  101:istore          5
	//*  58  103:goto            60
				k--;
	//   59  106:iload           4
	//   60  108:iconst_1        
	//   61  109:isub            
	//   62  110:istore          4
label0:
				do
				{
label1:
					{
						if(k < 0 || mHashes[k] != i)
							break label1;
	//   63  112:iload           4
	//   64  114:iflt            156
	//   65  117:aload_0         
	//   66  118:getfield        #39  <Field int[] mHashes>
	//   67  121:iload           4
	//   68  123:iaload          
	//   69  124:iload_2         
	//   70  125:icmpne          156
						j = k;
	//   71  128:iload           4
	//   72  130:istore_3        
						if(obj.equals(mArray[k << 1]))
							break label0;
	//   73  131:aload_1         
	//   74  132:aload_0         
	//   75  133:getfield        #44  <Field Object[] mArray>
	//   76  136:iload           4
	//   77  138:iconst_1        
	//   78  139:ishl            
	//   79  140:aaload          
	//   80  141:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//   81  144:ifne            13
						k--;
	//   82  147:iload           4
	//   83  149:iconst_1        
	//   84  150:isub            
	//   85  151:istore          4
					}
				} while(true);
	//   86  153:goto            112
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
		return ~l;
	//   87  156:iload           5
	//   88  158:iconst_m1       
	//   89  159:ixor            
	//   90  160:ireturn         
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
		int l = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mSize>
	//    2    4:istore          4
		if(l != 0) goto _L2; else goto _L1
	//    3    6:iload           4
	//    4    8:ifne            15
_L1:
		int i = -1;
	//    5   11:iconst_m1       
	//    6   12:istore_1        
_L4:
		return i;
	//    7   13:iload_1         
	//    8   14:ireturn         
_L2:
		int k;
		int j = binarySearchHashes(mHashes, l, 0);
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int[] mHashes>
	//   11   19:iload           4
	//   12   21:iconst_0        
	//   13   22:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
	//   14   25:istore_2        
		i = j;
	//   15   26:iload_2         
	//   16   27:istore_1        
		if(j >= 0)
	//*  17   28:iload_2         
	//*  18   29:iflt            13
		{
			i = j;
	//   19   32:iload_2         
	//   20   33:istore_1        
			if(mArray[j << 1] != null)
	//*  21   34:aload_0         
	//*  22   35:getfield        #44  <Field Object[] mArray>
	//*  23   38:iload_2         
	//*  24   39:iconst_1        
	//*  25   40:ishl            
	//*  26   41:aaload          
	//*  27   42:ifnull          13
			{
				for(k = j + 1; k < l && mHashes[k] == 0; k++)
	//*  28   45:iload_2         
	//*  29   46:iconst_1        
	//*  30   47:iadd            
	//*  31   48:istore_3        
	//*  32   49:iload_3         
	//*  33   50:iload           4
	//*  34   52:icmpge          84
	//*  35   55:aload_0         
	//*  36   56:getfield        #39  <Field int[] mHashes>
	//*  37   59:iload_3         
	//*  38   60:iaload          
	//*  39   61:ifne            84
					if(mArray[k << 1] == null)
	//*  40   64:aload_0         
	//*  41   65:getfield        #44  <Field Object[] mArray>
	//*  42   68:iload_3         
	//*  43   69:iconst_1        
	//*  44   70:ishl            
	//*  45   71:aaload          
	//*  46   72:ifnonnull       77
						return k;
	//   47   75:iload_3         
	//   48   76:ireturn         

	//   49   77:iload_3         
	//   50   78:iconst_1        
	//   51   79:iadd            
	//   52   80:istore_3        
	//*  53   81:goto            49
				j--;
	//   54   84:iload_2         
	//   55   85:iconst_1        
	//   56   86:isub            
	//   57   87:istore_2        
label0:
				do
				{
label1:
					{
						if(j < 0 || mHashes[j] != 0)
							break label1;
	//   58   88:iload_2         
	//   59   89:iflt            121
	//   60   92:aload_0         
	//   61   93:getfield        #39  <Field int[] mHashes>
	//   62   96:iload_2         
	//   63   97:iaload          
	//   64   98:ifne            121
						i = j;
	//   65  101:iload_2         
	//   66  102:istore_1        
						if(mArray[j << 1] == null)
							break label0;
	//   67  103:aload_0         
	//   68  104:getfield        #44  <Field Object[] mArray>
	//   69  107:iload_2         
	//   70  108:iconst_1        
	//   71  109:ishl            
	//   72  110:aaload          
	//   73  111:ifnull          13
						j--;
	//   74  114:iload_2         
	//   75  115:iconst_1        
	//   76  116:isub            
	//   77  117:istore_2        
					}
				} while(true);
	//   78  118:goto            88
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
		return ~k;
	//   79  121:iload_3         
	//   80  122:iconst_m1       
	//   81  123:ixor            
	//   82  124:ireturn         
	}

	int indexOfValue(Object obj)
	{
		int i;
		boolean flag;
		int j;
		Object aobj[];
		i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		flag = true;
	//    2    2:iconst_1        
	//    3    3:istore_3        
		j = mSize * 2;
	//    4    4:aload_0         
	//    5    5:getfield        #46  <Field int mSize>
	//    6    8:iconst_2        
	//    7    9:imul            
	//    8   10:istore          4
		aobj = mArray;
	//    9   12:aload_0         
	//   10   13:getfield        #44  <Field Object[] mArray>
	//   11   16:astore          5
		if(obj != null) goto _L2; else goto _L1
	//   12   18:aload_1         
	//   13   19:ifnonnull       52
_L1:
		for(i = ((int) (flag)); i < j; i += 2)
	//*  14   22:iload_3         
	//*  15   23:istore_2        
	//*  16   24:iload_2         
	//*  17   25:iload           4
	//*  18   27:icmpge          73
			if(aobj[i] == null)
	//*  19   30:aload           5
	//*  20   32:iload_2         
	//*  21   33:aaload          
	//*  22   34:ifnonnull       41
				return i >> 1;
	//   23   37:iload_2         
	//   24   38:iconst_1        
	//   25   39:ishr            
	//   26   40:ireturn         

	//   27   41:iload_2         
	//   28   42:iconst_2        
	//   29   43:iadd            
	//   30   44:istore_2        
		  goto _L3
	//*  31   45:goto            24
_L4:
		i += 2;
	//   32   48:iload_2         
	//   33   49:iconst_2        
	//   34   50:iadd            
	//   35   51:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   36   52:iload_2         
	//   37   53:iload           4
	//   38   55:icmpge          73
		if(obj.equals(aobj[i]))
	//*  39   58:aload_1         
	//*  40   59:aload           5
	//*  41   61:iload_2         
	//*  42   62:aaload          
	//*  43   63:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  44   66:ifeq            48
			return i >> 1;
	//   45   69:iload_2         
	//   46   70:iconst_1        
	//   47   71:ishr            
	//   48   72:ireturn         
		if(true) goto _L4; else goto _L3
_L3:
		return -1;
	//   49   73:iconst_m1       
	//   50   74:ireturn         
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
		int k;
		byte byte0;
		int l;
		int i1;
		byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore          5
		l = mSize;
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int mSize>
	//    4    8:istore          6
		int i;
		if(obj == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       48
		{
			i = indexOfNull();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #142 <Method int indexOfNull()>
	//    9   18:istore_3        
			k = 0;
	//   10   19:iconst_0        
	//   11   20:istore          4
		} else
	//*  12   22:iload_3         
	//*  13   23:iflt            65
	//*  14   26:iload_3         
	//*  15   27:iconst_1        
	//*  16   28:ishl            
	//*  17   29:iconst_1        
	//*  18   30:iadd            
	//*  19   31:istore_3        
	//*  20   32:aload_0         
	//*  21   33:getfield        #44  <Field Object[] mArray>
	//*  22   36:iload_3         
	//*  23   37:aaload          
	//*  24   38:astore_1        
	//*  25   39:aload_0         
	//*  26   40:getfield        #44  <Field Object[] mArray>
	//*  27   43:iload_3         
	//*  28   44:aload_2         
	//*  29   45:aastore         
	//*  30   46:aload_1         
	//*  31   47:areturn         
		{
			k = obj.hashCode();
	//   32   48:aload_1         
	//   33   49:invokevirtual   #135 <Method int Object.hashCode()>
	//   34   52:istore          4
			i = indexOf(obj, k);
	//   35   54:aload_0         
	//   36   55:aload_1         
	//   37   56:iload           4
	//   38   58:invokevirtual   #144 <Method int indexOf(Object, int)>
	//   39   61:istore_3        
		}
		if(i >= 0)
		{
			i = (i << 1) + 1;
			obj = mArray[i];
			mArray[i] = obj1;
			return obj;
		}
	//*  40   62:goto            22
		i1 = ~i;
	//   41   65:iload_3         
	//   42   66:iconst_m1       
	//   43   67:ixor            
	//   44   68:istore          7
		if(l < mHashes.length)
			break MISSING_BLOCK_LABEL_188;
	//   45   70:iload           6
	//   46   72:aload_0         
	//   47   73:getfield        #39  <Field int[] mHashes>
	//   48   76:arraylength     
	//   49   77:icmplt          188
		if(l < 8) goto _L2; else goto _L1
	//   50   80:iload           6
	//   51   82:bipush          8
	//   52   84:icmplt          129
_L1:
		int j = (l >> 1) + l;
	//   53   87:iload           6
	//   54   89:iconst_1        
	//   55   90:ishr            
	//   56   91:iload           6
	//   57   93:iadd            
	//   58   94:istore_3        
_L4:
		int ai[];
		Object aobj[];
		ai = mHashes;
	//   59   95:aload_0         
	//   60   96:getfield        #39  <Field int[] mHashes>
	//   61   99:astore          8
		aobj = mArray;
	//   62  101:aload_0         
	//   63  102:getfield        #44  <Field Object[] mArray>
	//   64  105:astore          9
		allocArrays(j);
	//   65  107:aload_0         
	//   66  108:iload_3         
	//   67  109:invokespecial   #51  <Method void allocArrays(int)>
		if(l != mSize)
	//*  68  112:iload           6
	//*  69  114:aload_0         
	//*  70  115:getfield        #46  <Field int mSize>
	//*  71  118:icmpeq          143
			throw new ConcurrentModificationException();
	//   72  121:new             #79  <Class ConcurrentModificationException>
	//   73  124:dup             
	//   74  125:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   75  128:athrow          
		break; /* Loop/switch isn't completed */
_L2:
		j = ((int) (byte0));
	//   76  129:iload           5
	//   77  131:istore_3        
		if(l < 4)
	//*  78  132:iload           6
	//*  79  134:iconst_4        
	//*  80  135:icmpge          95
			j = 4;
	//   81  138:iconst_4        
	//   82  139:istore_3        
		if(true) goto _L4; else goto _L3
	//   83  140:goto            95
_L3:
		if(mHashes.length > 0)
	//*  84  143:aload_0         
	//*  85  144:getfield        #39  <Field int[] mHashes>
	//*  86  147:arraylength     
	//*  87  148:ifle            179
		{
			System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
	//   88  151:aload           8
	//   89  153:iconst_0        
	//   90  154:aload_0         
	//   91  155:getfield        #39  <Field int[] mHashes>
	//   92  158:iconst_0        
	//   93  159:aload           8
	//   94  161:arraylength     
	//   95  162:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   96  165:aload           9
	//   97  167:iconst_0        
	//   98  168:aload_0         
	//   99  169:getfield        #44  <Field Object[] mArray>
	//  100  172:iconst_0        
	//  101  173:aload           9
	//  102  175:arraylength     
	//  103  176:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		freeArrays(ai, aobj, l);
	//  104  179:aload           8
	//  105  181:aload           9
	//  106  183:iload           6
	//  107  185:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
		if(i1 < l)
	//* 108  188:iload           7
	//* 109  190:iload           6
	//* 110  192:icmpge          247
		{
			System.arraycopy(((Object) (mHashes)), i1, ((Object) (mHashes)), i1 + 1, l - i1);
	//  111  195:aload_0         
	//  112  196:getfield        #39  <Field int[] mHashes>
	//  113  199:iload           7
	//  114  201:aload_0         
	//  115  202:getfield        #39  <Field int[] mHashes>
	//  116  205:iload           7
	//  117  207:iconst_1        
	//  118  208:iadd            
	//  119  209:iload           6
	//  120  211:iload           7
	//  121  213:isub            
	//  122  214:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), i1 << 1, ((Object) (mArray)), i1 + 1 << 1, mSize - i1 << 1);
	//  123  217:aload_0         
	//  124  218:getfield        #44  <Field Object[] mArray>
	//  125  221:iload           7
	//  126  223:iconst_1        
	//  127  224:ishl            
	//  128  225:aload_0         
	//  129  226:getfield        #44  <Field Object[] mArray>
	//  130  229:iload           7
	//  131  231:iconst_1        
	//  132  232:iadd            
	//  133  233:iconst_1        
	//  134  234:ishl            
	//  135  235:aload_0         
	//  136  236:getfield        #46  <Field int mSize>
	//  137  239:iload           7
	//  138  241:isub            
	//  139  242:iconst_1        
	//  140  243:ishl            
	//  141  244:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		if(l != mSize || i1 >= mHashes.length)
	//* 142  247:iload           6
	//* 143  249:aload_0         
	//* 144  250:getfield        #46  <Field int mSize>
	//* 145  253:icmpne          266
	//* 146  256:iload           7
	//* 147  258:aload_0         
	//* 148  259:getfield        #39  <Field int[] mHashes>
	//* 149  262:arraylength     
	//* 150  263:icmplt          274
		{
			throw new ConcurrentModificationException();
	//  151  266:new             #79  <Class ConcurrentModificationException>
	//  152  269:dup             
	//  153  270:invokespecial   #80  <Method void ConcurrentModificationException()>
	//  154  273:athrow          
		} else
		{
			mHashes[i1] = k;
	//  155  274:aload_0         
	//  156  275:getfield        #39  <Field int[] mHashes>
	//  157  278:iload           7
	//  158  280:iload           4
	//  159  282:iastore         
			mArray[i1 << 1] = obj;
	//  160  283:aload_0         
	//  161  284:getfield        #44  <Field Object[] mArray>
	//  162  287:iload           7
	//  163  289:iconst_1        
	//  164  290:ishl            
	//  165  291:aload_1         
	//  166  292:aastore         
			mArray[(i1 << 1) + 1] = obj1;
	//  167  293:aload_0         
	//  168  294:getfield        #44  <Field Object[] mArray>
	//  169  297:iload           7
	//  170  299:iconst_1        
	//  171  300:ishl            
	//  172  301:iconst_1        
	//  173  302:iadd            
	//  174  303:aload_2         
	//  175  304:aastore         
			mSize = mSize + 1;
	//  176  305:aload_0         
	//  177  306:aload_0         
	//  178  307:getfield        #46  <Field int mSize>
	//  179  310:iconst_1        
	//  180  311:iadd            
	//  181  312:putfield        #46  <Field int mSize>
			return ((Object) (null));
	//  182  315:aconst_null     
	//  183  316:areturn         
		}
	}

	public void putAll(SimpleArrayMap simplearraymap)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = simplearraymap.mSize;
	//    2    2:aload_1         
	//    3    3:getfield        #46  <Field int mSize>
	//    4    6:istore_3        
		ensureCapacity(mSize + j);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #46  <Field int mSize>
	//    8   12:iload_3         
	//    9   13:iadd            
	//   10   14:invokevirtual   #152 <Method void ensureCapacity(int)>
		if(mSize == 0)
	//*  11   17:aload_0         
	//*  12   18:getfield        #46  <Field int mSize>
	//*  13   21:ifne            64
		{
			if(j > 0)
	//*  14   24:iload_3         
	//*  15   25:ifle            63
			{
				System.arraycopy(((Object) (simplearraymap.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   16   28:aload_1         
	//   17   29:getfield        #39  <Field int[] mHashes>
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #39  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:iload_3         
	//   23   39:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (simplearraymap.mArray)), 0, ((Object) (mArray)), 0, j << 1);
	//   24   42:aload_1         
	//   25   43:getfield        #44  <Field Object[] mArray>
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #44  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:iload_3         
	//   31   53:iconst_1        
	//   32   54:ishl            
	//   33   55:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   34   58:aload_0         
	//   35   59:iload_3         
	//   36   60:putfield        #46  <Field int mSize>
			}
		} else
	//*  37   63:return          
		{
			while(i < j) 
	//*  38   64:iload_2         
	//*  39   65:iload_3         
	//*  40   66:icmpge          63
			{
				put(simplearraymap.keyAt(i), simplearraymap.valueAt(i));
	//   41   69:aload_0         
	//   42   70:aload_1         
	//   43   71:iload_2         
	//   44   72:invokevirtual   #115 <Method Object keyAt(int)>
	//   45   75:aload_1         
	//   46   76:iload_2         
	//   47   77:invokevirtual   #118 <Method Object valueAt(int)>
	//   48   80:invokevirtual   #154 <Method Object put(Object, Object)>
	//   49   83:pop             
				i++;
	//   50   84:iload_2         
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:istore_2        
			}
		}
	//*  54   88:goto            64
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
		int k = 8;
	//    0    0:bipush          8
	//    1    2:istore_3        
		Object obj = mArray[(i << 1) + 1];
	//    2    3:aload_0         
	//    3    4:getfield        #44  <Field Object[] mArray>
	//    4    7:iload_1         
	//    5    8:iconst_1        
	//    6    9:ishl            
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:aaload          
	//   10   13:astore          5
		int l = mSize;
	//   11   15:aload_0         
	//   12   16:getfield        #46  <Field int mSize>
	//   13   19:istore          4
		if(l <= 1)
	//*  14   21:iload           4
	//*  15   23:iconst_1        
	//*  16   24:icmpgt          73
		{
			freeArrays(mHashes, mArray, l);
	//   17   27:aload_0         
	//   18   28:getfield        #39  <Field int[] mHashes>
	//   19   31:aload_0         
	//   20   32:getfield        #44  <Field Object[] mArray>
	//   21   35:iload           4
	//   22   37:invokestatic    #85  <Method void freeArrays(int[], Object[], int)>
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   23   40:aload_0         
	//   24   41:getstatic       #37  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   25   44:putfield        #39  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   26   47:aload_0         
	//   27   48:getstatic       #42  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   28   51:putfield        #44  <Field Object[] mArray>
			i = 0;
	//   29   54:iconst_0        
	//   30   55:istore_1        
		} else
	//*  31   56:iload           4
	//*  32   58:aload_0         
	//*  33   59:getfield        #46  <Field int mSize>
	//*  34   62:icmpeq          301
	//*  35   65:new             #79  <Class ConcurrentModificationException>
	//*  36   68:dup             
	//*  37   69:invokespecial   #80  <Method void ConcurrentModificationException()>
	//*  38   72:athrow          
		{
			int j = l - 1;
	//   39   73:iload           4
	//   40   75:iconst_1        
	//   41   76:isub            
	//   42   77:istore_2        
			if(mHashes.length > 8 && mSize < mHashes.length / 3)
	//*  43   78:aload_0         
	//*  44   79:getfield        #39  <Field int[] mHashes>
	//*  45   82:arraylength     
	//*  46   83:bipush          8
	//*  47   85:icmple          229
	//*  48   88:aload_0         
	//*  49   89:getfield        #46  <Field int mSize>
	//*  50   92:aload_0         
	//*  51   93:getfield        #39  <Field int[] mHashes>
	//*  52   96:arraylength     
	//*  53   97:iconst_3        
	//*  54   98:idiv            
	//*  55   99:icmpge          229
			{
				if(l > 8)
	//*  56  102:iload           4
	//*  57  104:bipush          8
	//*  58  106:icmple          117
					k = (l >> 1) + l;
	//   59  109:iload           4
	//   60  111:iconst_1        
	//   61  112:ishr            
	//   62  113:iload           4
	//   63  115:iadd            
	//   64  116:istore_3        
				int ai[] = mHashes;
	//   65  117:aload_0         
	//   66  118:getfield        #39  <Field int[] mHashes>
	//   67  121:astore          6
				Object aobj[] = mArray;
	//   68  123:aload_0         
	//   69  124:getfield        #44  <Field Object[] mArray>
	//   70  127:astore          7
				allocArrays(k);
	//   71  129:aload_0         
	//   72  130:iload_3         
	//   73  131:invokespecial   #51  <Method void allocArrays(int)>
				if(l != mSize)
	//*  74  134:iload           4
	//*  75  136:aload_0         
	//*  76  137:getfield        #46  <Field int mSize>
	//*  77  140:icmpeq          151
					throw new ConcurrentModificationException();
	//   78  143:new             #79  <Class ConcurrentModificationException>
	//   79  146:dup             
	//   80  147:invokespecial   #80  <Method void ConcurrentModificationException()>
	//   81  150:athrow          
				if(i > 0)
	//*  82  151:iload_1         
	//*  83  152:ifle            181
				{
					System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   84  155:aload           6
	//   85  157:iconst_0        
	//   86  158:aload_0         
	//   87  159:getfield        #39  <Field int[] mHashes>
	//   88  162:iconst_0        
	//   89  163:iload_1         
	//   90  164:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i << 1);
	//   91  167:aload           7
	//   92  169:iconst_0        
	//   93  170:aload_0         
	//   94  171:getfield        #44  <Field Object[] mArray>
	//   95  174:iconst_0        
	//   96  175:iload_1         
	//   97  176:iconst_1        
	//   98  177:ishl            
	//   99  178:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				if(i < j)
	//* 100  181:iload_1         
	//* 101  182:iload_2         
	//* 102  183:icmpge          224
				{
					System.arraycopy(((Object) (ai)), i + 1, ((Object) (mHashes)), i, j - i);
	//  103  186:aload           6
	//  104  188:iload_1         
	//  105  189:iconst_1        
	//  106  190:iadd            
	//  107  191:aload_0         
	//  108  192:getfield        #39  <Field int[] mHashes>
	//  109  195:iload_1         
	//  110  196:iload_2         
	//  111  197:iload_1         
	//  112  198:isub            
	//  113  199:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, j - i << 1);
	//  114  202:aload           7
	//  115  204:iload_1         
	//  116  205:iconst_1        
	//  117  206:iadd            
	//  118  207:iconst_1        
	//  119  208:ishl            
	//  120  209:aload_0         
	//  121  210:getfield        #44  <Field Object[] mArray>
	//  122  213:iload_1         
	//  123  214:iconst_1        
	//  124  215:ishl            
	//  125  216:iload_2         
	//  126  217:iload_1         
	//  127  218:isub            
	//  128  219:iconst_1        
	//  129  220:ishl            
	//  130  221:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				i = j;
	//  131  224:iload_2         
	//  132  225:istore_1        
			} else
	//* 133  226:goto            56
			{
				if(i < j)
	//* 134  229:iload_1         
	//* 135  230:iload_2         
	//* 136  231:icmpge          276
				{
					System.arraycopy(((Object) (mHashes)), i + 1, ((Object) (mHashes)), i, j - i);
	//  137  234:aload_0         
	//  138  235:getfield        #39  <Field int[] mHashes>
	//  139  238:iload_1         
	//  140  239:iconst_1        
	//  141  240:iadd            
	//  142  241:aload_0         
	//  143  242:getfield        #39  <Field int[] mHashes>
	//  144  245:iload_1         
	//  145  246:iload_2         
	//  146  247:iload_1         
	//  147  248:isub            
	//  148  249:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, j - i << 1);
	//  149  252:aload_0         
	//  150  253:getfield        #44  <Field Object[] mArray>
	//  151  256:iload_1         
	//  152  257:iconst_1        
	//  153  258:iadd            
	//  154  259:iconst_1        
	//  155  260:ishl            
	//  156  261:aload_0         
	//  157  262:getfield        #44  <Field Object[] mArray>
	//  158  265:iload_1         
	//  159  266:iconst_1        
	//  160  267:ishl            
	//  161  268:iload_2         
	//  162  269:iload_1         
	//  163  270:isub            
	//  164  271:iconst_1        
	//  165  272:ishl            
	//  166  273:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				mArray[j << 1] = null;
	//  167  276:aload_0         
	//  168  277:getfield        #44  <Field Object[] mArray>
	//  169  280:iload_2         
	//  170  281:iconst_1        
	//  171  282:ishl            
	//  172  283:aconst_null     
	//  173  284:aastore         
				mArray[(j << 1) + 1] = null;
	//  174  285:aload_0         
	//  175  286:getfield        #44  <Field Object[] mArray>
	//  176  289:iload_2         
	//  177  290:iconst_1        
	//  178  291:ishl            
	//  179  292:iconst_1        
	//  180  293:iadd            
	//  181  294:aconst_null     
	//  182  295:aastore         
				i = j;
	//  183  296:iload_2         
	//  184  297:istore_1        
			}
		}
		if(l != mSize)
		{
			throw new ConcurrentModificationException();
		} else
	//* 185  298:goto            56
		{
			mSize = i;
	//  186  301:aload_0         
	//  187  302:iload_1         
	//  188  303:putfield        #46  <Field int mSize>
			return obj;
	//  189  306:aload           5
	//  190  308:areturn         
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
		int i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_1        
		while(i < mSize) 
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
	//*  35   61:if_acmpeq       101
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:aload_2         
	//*  41   71:bipush          61
	//*  42   73:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//*  43   76:pop             
	//*  44   77:aload_0         
	//*  45   78:iload_1         
	//*  46   79:invokevirtual   #118 <Method Object valueAt(int)>
	//*  47   82:astore_3        
	//*  48   83:aload_3         
	//*  49   84:aload_0         
	//*  50   85:if_acmpeq       111
	//*  51   88:aload_2         
	//*  52   89:aload_3         
	//*  53   90:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//*  54   93:pop             
	//*  55   94:iload_1         
	//*  56   95:iconst_1        
	//*  57   96:iadd            
	//*  58   97:istore_1        
	//*  59   98:goto            34
				stringbuilder.append("(this Map)");
	//   60  101:aload_2         
	//   61  102:ldc1            #187 <String "(this Map)">
	//   62  104:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   63  107:pop             
			stringbuilder.append('=');
			obj = valueAt(i);
			if(obj != this)
				stringbuilder.append(obj);
			else
	//*  64  108:goto            70
				stringbuilder.append("(this Map)");
	//   65  111:aload_2         
	//   66  112:ldc1            #187 <String "(this Map)">
	//   67  114:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   68  117:pop             
			i++;
		}
	//*  69  118:goto            94
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
