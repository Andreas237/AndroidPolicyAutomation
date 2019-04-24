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
		int k = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		int j = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		int i = 1;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		int i1 = mSize;
	//   12   18:aload_0         
	//   13   19:getfield        #46  <Field int mSize>
	//   14   22:istore          5
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
	//    2    4:istore          5
		int j;
		if(i1 == 0)
	//*   3    6:iload           5
	//*   4    8:ifne            15
		{
			j = -1;
	//    5   11:iconst_m1       
	//    6   12:istore_3        
		} else
	//*   7   13:iload_3         
	//*   8   14:ireturn         
		{
			int l = binarySearchHashes(mHashes, i1, i);
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int[] mHashes>
	//   11   19:iload           5
	//   12   21:iload_2         
	//   13   22:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
	//   14   25:istore          4
			j = l;
	//   15   27:iload           4
	//   16   29:istore_3        
			if(l >= 0)
	//*  17   30:iload           4
	//*  18   32:iflt            13
			{
				j = l;
	//   19   35:iload           4
	//   20   37:istore_3        
				if(!obj.equals(mArray[l << 1]))
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
					int k;
					for(k = l + 1; k < i1 && mHashes[k] == i; k++)
	//*  30   54:iload           4
	//*  31   56:iconst_1        
	//*  32   57:iadd            
	//*  33   58:istore_3        
	//*  34   59:iload_3         
	//*  35   60:iload           5
	//*  36   62:icmpge          99
	//*  37   65:aload_0         
	//*  38   66:getfield        #39  <Field int[] mHashes>
	//*  39   69:iload_3         
	//*  40   70:iaload          
	//*  41   71:iload_2         
	//*  42   72:icmpne          99
						if(obj.equals(mArray[k << 1]))
	//*  43   75:aload_1         
	//*  44   76:aload_0         
	//*  45   77:getfield        #44  <Field Object[] mArray>
	//*  46   80:iload_3         
	//*  47   81:iconst_1        
	//*  48   82:ishl            
	//*  49   83:aaload          
	//*  50   84:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  51   87:ifeq            92
							return k;
	//   52   90:iload_3         
	//   53   91:ireturn         

	//   54   92:iload_3         
	//   55   93:iconst_1        
	//   56   94:iadd            
	//   57   95:istore_3        
	//*  58   96:goto            59
					for(l--; l >= 0 && mHashes[l] == i; l--)
	//*  59   99:iload           4
	//*  60  101:iconst_1        
	//*  61  102:isub            
	//*  62  103:istore          4
	//*  63  105:iload           4
	//*  64  107:iflt            149
	//*  65  110:aload_0         
	//*  66  111:getfield        #39  <Field int[] mHashes>
	//*  67  114:iload           4
	//*  68  116:iaload          
	//*  69  117:iload_2         
	//*  70  118:icmpne          149
						if(obj.equals(mArray[l << 1]))
	//*  71  121:aload_1         
	//*  72  122:aload_0         
	//*  73  123:getfield        #44  <Field Object[] mArray>
	//*  74  126:iload           4
	//*  75  128:iconst_1        
	//*  76  129:ishl            
	//*  77  130:aaload          
	//*  78  131:invokevirtual   #126 <Method boolean Object.equals(Object)>
	//*  79  134:ifeq            140
							return l;
	//   80  137:iload           4
	//   81  139:ireturn         

	//   82  140:iload           4
	//   83  142:iconst_1        
	//   84  143:isub            
	//   85  144:istore          4
	//*  86  146:goto            105
					return ~k;
	//   87  149:iload_3         
	//   88  150:iconst_m1       
	//   89  151:ixor            
	//   90  152:ireturn         
				}
			}
		}
		return j;
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
	//    2    4:istore_3        
		int i;
		if(l == 0)
	//*   3    5:iload_3         
	//*   4    6:ifne            13
		{
			i = -1;
	//    5    9:iconst_m1       
	//    6   10:istore_1        
		} else
	//*   7   11:iload_1         
	//*   8   12:ireturn         
		{
			int k = binarySearchHashes(mHashes, l, 0);
	//    9   13:aload_0         
	//   10   14:getfield        #39  <Field int[] mHashes>
	//   11   17:iload_3         
	//   12   18:iconst_0        
	//   13   19:invokestatic    #139 <Method int binarySearchHashes(int[], int, int)>
	//   14   22:istore_2        
			i = k;
	//   15   23:iload_2         
	//   16   24:istore_1        
			if(k >= 0)
	//*  17   25:iload_2         
	//*  18   26:iflt            11
			{
				i = k;
	//   19   29:iload_2         
	//   20   30:istore_1        
				if(mArray[k << 1] != null)
	//*  21   31:aload_0         
	//*  22   32:getfield        #44  <Field Object[] mArray>
	//*  23   35:iload_2         
	//*  24   36:iconst_1        
	//*  25   37:ishl            
	//*  26   38:aaload          
	//*  27   39:ifnull          11
				{
					int j;
					for(j = k + 1; j < l && mHashes[j] == 0; j++)
	//*  28   42:iload_2         
	//*  29   43:iconst_1        
	//*  30   44:iadd            
	//*  31   45:istore_1        
	//*  32   46:iload_1         
	//*  33   47:iload_3         
	//*  34   48:icmpge          80
	//*  35   51:aload_0         
	//*  36   52:getfield        #39  <Field int[] mHashes>
	//*  37   55:iload_1         
	//*  38   56:iaload          
	//*  39   57:ifne            80
						if(mArray[j << 1] == null)
	//*  40   60:aload_0         
	//*  41   61:getfield        #44  <Field Object[] mArray>
	//*  42   64:iload_1         
	//*  43   65:iconst_1        
	//*  44   66:ishl            
	//*  45   67:aaload          
	//*  46   68:ifnonnull       73
							return j;
	//   47   71:iload_1         
	//   48   72:ireturn         

	//   49   73:iload_1         
	//   50   74:iconst_1        
	//   51   75:iadd            
	//   52   76:istore_1        
	//*  53   77:goto            46
					for(k--; k >= 0 && mHashes[k] == 0; k--)
	//*  54   80:iload_2         
	//*  55   81:iconst_1        
	//*  56   82:isub            
	//*  57   83:istore_2        
	//*  58   84:iload_2         
	//*  59   85:iflt            117
	//*  60   88:aload_0         
	//*  61   89:getfield        #39  <Field int[] mHashes>
	//*  62   92:iload_2         
	//*  63   93:iaload          
	//*  64   94:ifne            117
						if(mArray[k << 1] == null)
	//*  65   97:aload_0         
	//*  66   98:getfield        #44  <Field Object[] mArray>
	//*  67  101:iload_2         
	//*  68  102:iconst_1        
	//*  69  103:ishl            
	//*  70  104:aaload          
	//*  71  105:ifnonnull       110
							return k;
	//   72  108:iload_2         
	//   73  109:ireturn         

	//   74  110:iload_2         
	//   75  111:iconst_1        
	//   76  112:isub            
	//   77  113:istore_2        
	//*  78  114:goto            84
					return ~j;
	//   79  117:iload_1         
	//   80  118:iconst_m1       
	//   81  119:ixor            
	//   82  120:ireturn         
				}
			}
		}
		return i;
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
			k = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
			i = indexOfNull();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #142 <Method int indexOfNull()>
	//   11   21:istore_3        
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
		int j = l + (l >> 1);
	//   53   87:iload           6
	//   54   89:iload           6
	//   55   91:iconst_1        
	//   56   92:ishr            
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
		if(mSize == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #46  <Field int mSize>
	//*  11   19:ifne            62
		{
			if(j > 0)
	//*  12   22:iload_3         
	//*  13   23:ifle            61
			{
				System.arraycopy(((Object) (simplearraymap.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   14   26:aload_1         
	//   15   27:getfield        #39  <Field int[] mHashes>
	//   16   30:iconst_0        
	//   17   31:aload_0         
	//   18   32:getfield        #39  <Field int[] mHashes>
	//   19   35:iconst_0        
	//   20   36:iload_3         
	//   21   37:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (simplearraymap.mArray)), 0, ((Object) (mArray)), 0, j << 1);
	//   22   40:aload_1         
	//   23   41:getfield        #44  <Field Object[] mArray>
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #44  <Field Object[] mArray>
	//   27   49:iconst_0        
	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:ishl            
	//   31   53:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   32   56:aload_0         
	//   33   57:iload_3         
	//   34   58:putfield        #46  <Field int mSize>
			}
		} else
	//*  35   61:return          
		{
			int i = 0;
	//   36   62:iconst_0        
	//   37   63:istore_2        
			while(i < j) 
	//*  38   64:iload_2         
	//*  39   65:iload_3         
	//*  40   66:icmpge          61
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
		int j = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
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
			j = 0;
	//   29   54:iconst_0        
	//   30   55:istore_2        
		} else
	//*  31   56:iload           4
	//*  32   58:aload_0         
	//*  33   59:getfield        #46  <Field int mSize>
	//*  34   62:icmpeq          303
	//*  35   65:new             #79  <Class ConcurrentModificationException>
	//*  36   68:dup             
	//*  37   69:invokespecial   #80  <Method void ConcurrentModificationException()>
	//*  38   72:athrow          
		{
			int k = l - 1;
	//   39   73:iload           4
	//   40   75:iconst_1        
	//   41   76:isub            
	//   42   77:istore_3        
			if(mHashes.length > 8 && mSize < mHashes.length / 3)
	//*  43   78:aload_0         
	//*  44   79:getfield        #39  <Field int[] mHashes>
	//*  45   82:arraylength     
	//*  46   83:bipush          8
	//*  47   85:icmple          231
	//*  48   88:aload_0         
	//*  49   89:getfield        #46  <Field int mSize>
	//*  50   92:aload_0         
	//*  51   93:getfield        #39  <Field int[] mHashes>
	//*  52   96:arraylength     
	//*  53   97:iconst_3        
	//*  54   98:idiv            
	//*  55   99:icmpge          231
			{
				if(l > 8)
	//*  56  102:iload           4
	//*  57  104:bipush          8
	//*  58  106:icmple          117
					j = l + (l >> 1);
	//   59  109:iload           4
	//   60  111:iload           4
	//   61  113:iconst_1        
	//   62  114:ishr            
	//   63  115:iadd            
	//   64  116:istore_2        
				int ai[] = mHashes;
	//   65  117:aload_0         
	//   66  118:getfield        #39  <Field int[] mHashes>
	//   67  121:astore          6
				Object aobj[] = mArray;
	//   68  123:aload_0         
	//   69  124:getfield        #44  <Field Object[] mArray>
	//   70  127:astore          7
				allocArrays(j);
	//   71  129:aload_0         
	//   72  130:iload_2         
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
				j = k;
	//  100  181:iload_3         
	//  101  182:istore_2        
				if(i < k)
	//* 102  183:iload_1         
	//* 103  184:iload_3         
	//* 104  185:icmpge          56
				{
					System.arraycopy(((Object) (ai)), i + 1, ((Object) (mHashes)), i, k - i);
	//  105  188:aload           6
	//  106  190:iload_1         
	//  107  191:iconst_1        
	//  108  192:iadd            
	//  109  193:aload_0         
	//  110  194:getfield        #39  <Field int[] mHashes>
	//  111  197:iload_1         
	//  112  198:iload_3         
	//  113  199:iload_1         
	//  114  200:isub            
	//  115  201:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, k - i << 1);
	//  116  204:aload           7
	//  117  206:iload_1         
	//  118  207:iconst_1        
	//  119  208:iadd            
	//  120  209:iconst_1        
	//  121  210:ishl            
	//  122  211:aload_0         
	//  123  212:getfield        #44  <Field Object[] mArray>
	//  124  215:iload_1         
	//  125  216:iconst_1        
	//  126  217:ishl            
	//  127  218:iload_3         
	//  128  219:iload_1         
	//  129  220:isub            
	//  130  221:iconst_1        
	//  131  222:ishl            
	//  132  223:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					j = k;
	//  133  226:iload_3         
	//  134  227:istore_2        
				}
			} else
	//* 135  228:goto            56
			{
				if(i < k)
	//* 136  231:iload_1         
	//* 137  232:iload_3         
	//* 138  233:icmpge          278
				{
					System.arraycopy(((Object) (mHashes)), i + 1, ((Object) (mHashes)), i, k - i);
	//  139  236:aload_0         
	//  140  237:getfield        #39  <Field int[] mHashes>
	//  141  240:iload_1         
	//  142  241:iconst_1        
	//  143  242:iadd            
	//  144  243:aload_0         
	//  145  244:getfield        #39  <Field int[] mHashes>
	//  146  247:iload_1         
	//  147  248:iload_3         
	//  148  249:iload_1         
	//  149  250:isub            
	//  150  251:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, k - i << 1);
	//  151  254:aload_0         
	//  152  255:getfield        #44  <Field Object[] mArray>
	//  153  258:iload_1         
	//  154  259:iconst_1        
	//  155  260:iadd            
	//  156  261:iconst_1        
	//  157  262:ishl            
	//  158  263:aload_0         
	//  159  264:getfield        #44  <Field Object[] mArray>
	//  160  267:iload_1         
	//  161  268:iconst_1        
	//  162  269:ishl            
	//  163  270:iload_3         
	//  164  271:iload_1         
	//  165  272:isub            
	//  166  273:iconst_1        
	//  167  274:ishl            
	//  168  275:invokestatic    #102 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				mArray[k << 1] = null;
	//  169  278:aload_0         
	//  170  279:getfield        #44  <Field Object[] mArray>
	//  171  282:iload_3         
	//  172  283:iconst_1        
	//  173  284:ishl            
	//  174  285:aconst_null     
	//  175  286:aastore         
				mArray[(k << 1) + 1] = null;
	//  176  287:aload_0         
	//  177  288:getfield        #44  <Field Object[] mArray>
	//  178  291:iload_3         
	//  179  292:iconst_1        
	//  180  293:ishl            
	//  181  294:iconst_1        
	//  182  295:iadd            
	//  183  296:aconst_null     
	//  184  297:aastore         
				j = k;
	//  185  298:iload_3         
	//  186  299:istore_2        
			}
		}
		if(l != mSize)
		{
			throw new ConcurrentModificationException();
		} else
	//* 187  300:goto            56
		{
			mSize = j;
	//  188  303:aload_0         
	//  189  304:iload_2         
	//  190  305:putfield        #46  <Field int mSize>
			return obj;
	//  191  308:aload           5
	//  192  310:areturn         
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
