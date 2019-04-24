// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//			ContainerHelpers, ArrayMap

public class SimpleArrayMap
{

	public SimpleArrayMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mHashes = ContainerHelpers.EMPTY_INTS;
	//    2    4:aload_0         
	//    3    5:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    4    8:putfield        #37  <Field int[] mHashes>
		mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    5   11:aload_0         
	//    6   12:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    7   15:putfield        #42  <Field Object[] mArray>
		mSize = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #44  <Field int mSize>
	//   11   23:return          
	}

	public SimpleArrayMap(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            25
		{
			mHashes = ContainerHelpers.EMPTY_INTS;
	//    4    8:aload_0         
	//    5    9:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    6   12:putfield        #37  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//    7   15:aload_0         
	//    8   16:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//    9   19:putfield        #42  <Field Object[] mArray>
		} else
	//*  10   22:goto            30
		{
			allocArrays(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #49  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #44  <Field int mSize>
	//   17   35:return          
	}

	public SimpleArrayMap(SimpleArrayMap simplearraymap)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void SimpleArrayMap()>
		if(simplearraymap != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			putAll(simplearraymap);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #54  <Method void putAll(SimpleArrayMap)>
	//    7   13:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_84;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          84
		android/support/v4/util/ArrayMap;
	//    3    6:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(mTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_69;
	//    5    9:getstatic       #58  <Field Object[] mTwiceBaseCache>
	//    6   12:ifnull          69
		aobj = mTwiceBaseCache;
	//    7   15:getstatic       #58  <Field Object[] mTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #42  <Field Object[] mArray>
		mTwiceBaseCache = (Object[])(Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #59  <Class Object[]>
	//   16   30:checkcast       #59  <Class Object[]>
	//   17   33:putstatic       #58  <Field Object[] mTwiceBaseCache>
		mHashes = (int[])(int[])aobj[1];
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aaload          
	//   22   40:checkcast       #60  <Class int[]>
	//   23   43:checkcast       #60  <Class int[]>
	//   24   46:putfield        #37  <Field int[] mHashes>
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
	//   33   57:getstatic       #62  <Field int mTwiceBaseCacheSize>
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:putstatic       #62  <Field int mTwiceBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   37   65:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   38   67:monitorexit     
		return;
	//   39   68:return          
		android/support/v4/util/ArrayMap;
	//   40   69:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
		break MISSING_BLOCK_LABEL_164;
	//   42   72:goto            81
		Exception exception;
		exception;
	//   43   75:astore_2        
	//*  44   76:ldc1            #56  <Class ArrayMap>
		throw exception;
	//   45   78:monitorexit     
	//   46   79:aload_2         
	//   47   80:athrow          
	//*  48   81:goto            164
		if(i != 4)
			break MISSING_BLOCK_LABEL_164;
	//   49   84:iload_1         
	//   50   85:iconst_4        
	//   51   86:icmpne          164
		android/support/v4/util/ArrayMap;
	//   52   89:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   53   91:monitorenter    
		if(mBaseCache == null)
			break MISSING_BLOCK_LABEL_152;
	//   54   92:getstatic       #64  <Field Object[] mBaseCache>
	//   55   95:ifnull          152
		exception = ((Exception) (mBaseCache));
	//   56   98:getstatic       #64  <Field Object[] mBaseCache>
	//   57  101:astore_2        
		mArray = ((Object []) (exception));
	//   58  102:aload_0         
	//   59  103:aload_2         
	//   60  104:putfield        #42  <Field Object[] mArray>
		mBaseCache = (Object[])(Object[])exception[0];
	//   61  107:aload_2         
	//   62  108:iconst_0        
	//   63  109:aaload          
	//   64  110:checkcast       #59  <Class Object[]>
	//   65  113:checkcast       #59  <Class Object[]>
	//   66  116:putstatic       #64  <Field Object[] mBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   67  119:aload_0         
	//   68  120:aload_2         
	//   69  121:iconst_1        
	//   70  122:aaload          
	//   71  123:checkcast       #60  <Class int[]>
	//   72  126:checkcast       #60  <Class int[]>
	//   73  129:putfield        #37  <Field int[] mHashes>
		exception[1] = null;
	//   74  132:aload_2         
	//   75  133:iconst_1        
	//   76  134:aconst_null     
	//   77  135:aastore         
		exception[0] = null;
	//   78  136:aload_2         
	//   79  137:iconst_0        
	//   80  138:aconst_null     
	//   81  139:aastore         
		mBaseCacheSize--;
	//   82  140:getstatic       #66  <Field int mBaseCacheSize>
	//   83  143:iconst_1        
	//   84  144:isub            
	//   85  145:putstatic       #66  <Field int mBaseCacheSize>
		android/support/v4/util/ArrayMap;
	//   86  148:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   87  150:monitorexit     
		return;
	//   88  151:return          
		android/support/v4/util/ArrayMap;
	//   89  152:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   90  154:monitorexit     
		break MISSING_BLOCK_LABEL_164;
	//   91  155:goto            164
		exception;
	//   92  158:astore_2        
	//*  93  159:ldc1            #56  <Class ArrayMap>
		throw exception;
	//   94  161:monitorexit     
	//   95  162:aload_2         
	//   96  163:athrow          
		mHashes = new int[i];
	//   97  164:aload_0         
	//   98  165:iload_1         
	//   99  166:newarray        int[]
	//  100  168:putfield        #37  <Field int[] mHashes>
		mArray = new Object[i << 1];
	//  101  171:aload_0         
	//  102  172:iload_1         
	//  103  173:iconst_1        
	//  104  174:ishl            
	//  105  175:anewarray       Object[]
	//  106  178:putfield        #42  <Field Object[] mArray>
		return;
	//  107  181:return          
	}

	private static void freeArrays(int ai[], Object aobj[], int i)
	{
		if(ai.length != 8) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:bipush          8
	//    3    4:icmpne          62
_L1:
		android/support/v4/util/ArrayMap;
	//    4    7:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mTwiceBaseCacheSize < 10)
	//*   6   10:getstatic       #62  <Field int mTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          49
		{
			aobj[0] = ((Object) (mTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #58  <Field Object[] mTwiceBaseCache>
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
	//*  23   34:goto            121
_L9:
		mTwiceBaseCache = aobj;
	//   24   37:aload_1         
	//   25   38:putstatic       #58  <Field Object[] mTwiceBaseCache>
		mTwiceBaseCacheSize++;
	//   26   41:getstatic       #62  <Field int mTwiceBaseCacheSize>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putstatic       #62  <Field int mTwiceBaseCacheSize>
_L3:
		android/support/v4/util/ArrayMap;
	//   30   49:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		  goto _L4
	//*  32   52:goto            61
		ai;
	//   33   55:astore_0        
	//*  34   56:ldc1            #56  <Class ArrayMap>
		throw ai;
	//   35   58:monitorexit     
	//   36   59:aload_0         
	//   37   60:athrow          
_L4:
		return;
	//   38   61:return          
_L2:
		if(ai.length != 4) goto _L6; else goto _L5
	//   39   62:aload_0         
	//   40   63:arraylength     
	//   41   64:iconst_4        
	//   42   65:icmpne          120
_L5:
		android/support/v4/util/ArrayMap;
	//   43   68:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorenter ;
	//   44   70:monitorenter    
		if(mBaseCacheSize >= 10) goto _L8; else goto _L7
	//   45   71:getstatic       #66  <Field int mBaseCacheSize>
	//   46   74:bipush          10
	//   47   76:icmpge          110
_L7:
		aobj[0] = ((Object) (mBaseCache));
	//   48   79:aload_1         
	//   49   80:iconst_0        
	//   50   81:getstatic       #64  <Field Object[] mBaseCache>
	//   51   84:aastore         
		aobj[1] = ((Object) (ai));
	//   52   85:aload_1         
	//   53   86:iconst_1        
	//   54   87:aload_0         
	//   55   88:aastore         
		i = (i << 1) - 1;
	//   56   89:iload_2         
	//   57   90:iconst_1        
	//   58   91:ishl            
	//   59   92:iconst_1        
	//   60   93:isub            
	//   61   94:istore_2        
		break MISSING_BLOCK_LABEL_137;
	//   62   95:goto            137
_L10:
		mBaseCache = aobj;
	//   63   98:aload_1         
	//   64   99:putstatic       #64  <Field Object[] mBaseCache>
		mBaseCacheSize++;
	//   65  102:getstatic       #66  <Field int mBaseCacheSize>
	//   66  105:iconst_1        
	//   67  106:iadd            
	//   68  107:putstatic       #66  <Field int mBaseCacheSize>
_L8:
		android/support/v4/util/ArrayMap;
	//   69  110:ldc1            #56  <Class ArrayMap>
		JVM INSTR monitorexit ;
	//   70  112:monitorexit     
		return;
	//   71  113:return          
		ai;
	//   72  114:astore_0        
	//*  73  115:ldc1            #56  <Class ArrayMap>
		throw ai;
	//   74  117:monitorexit     
	//   75  118:aload_0         
	//   76  119:athrow          
_L6:
		return;
	//   77  120:return          
		aobj[1] = ((Object) (ai));
		i = (i << 1) - 1;
		while(i >= 2) 
	//*  78  121:iload_2         
	//*  79  122:iconst_2        
	//*  80  123:icmplt          37
		{
			aobj[i] = null;
	//   81  126:aload_1         
	//   82  127:iload_2         
	//   83  128:aconst_null     
	//   84  129:aastore         
			i--;
	//   85  130:iload_2         
	//   86  131:iconst_1        
	//   87  132:isub            
	//   88  133:istore_2        
		}
		  goto _L9
	//*  89  134:goto            121
		while(i >= 2) 
	//*  90  137:iload_2         
	//*  91  138:iconst_2        
	//*  92  139:icmplt          98
		{
			aobj[i] = null;
	//   93  142:aload_1         
	//   94  143:iload_2         
	//   95  144:aconst_null     
	//   96  145:aastore         
			i--;
	//   97  146:iload_2         
	//   98  147:iconst_1        
	//   99  148:isub            
	//  100  149:istore_2        
		}
		  goto _L10
	//* 101  150:goto            137
	}

	public void clear()
	{
		if(mSize != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mSize>
	//*   2    4:ifeq            41
		{
			freeArrays(mHashes, mArray, mSize);
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field int[] mHashes>
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field Object[] mArray>
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field int mSize>
	//    9   19:invokestatic    #71  <Method void freeArrays(int[], Object[], int)>
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   10   22:aload_0         
	//   11   23:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   12   26:putfield        #37  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   13   29:aload_0         
	//   14   30:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   15   33:putfield        #42  <Field Object[] mArray>
			mSize = 0;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #44  <Field int mSize>
		}
	//   19   41:return          
	}

	public boolean containsKey(Object obj)
	{
		return indexOfKey(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method int indexOfKey(Object)>
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
	//    2    2:invokevirtual   #81  <Method int indexOfValue(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void ensureCapacity(int i)
	{
		if(mHashes.length < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int[] mHashes>
	//*   2    4:arraylength     
	//*   3    5:iload_1         
	//*   4    6:icmpge          70
		{
			int ai[] = mHashes;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field int[] mHashes>
	//    7   13:astore_2        
			Object aobj[] = mArray;
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field Object[] mArray>
	//   10   18:astore_3        
			allocArrays(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokespecial   #49  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  14   24:aload_0         
	//*  15   25:getfield        #44  <Field int mSize>
	//*  16   28:ifle            61
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, mSize);
	//   17   31:aload_2         
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #37  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #44  <Field int mSize>
	//   24   42:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize << 1);
	//   25   45:aload_3         
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #42  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:aload_0         
	//   31   53:getfield        #44  <Field int mSize>
	//   32   56:iconst_1        
	//   33   57:ishl            
	//   34   58:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   35   61:aload_2         
	//   36   62:aload_3         
	//   37   63:aload_0         
	//   38   64:getfield        #44  <Field int mSize>
	//   39   67:invokestatic    #71  <Method void freeArrays(int[], Object[], int)>
		}
	//   40   70:return          
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
			break MISSING_BLOCK_LABEL_119;
	//    5    7:aload_1         
	//    6    8:instanceof      #2   <Class SimpleArrayMap>
	//    7   11:ifeq            119
		obj = ((Object) ((SimpleArrayMap)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class SimpleArrayMap>
	//   10   18:astore_1        
		if(size() != ((SimpleArrayMap) (obj)).size())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #97  <Method int size()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #97  <Method int size()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		i = 0;
	//   18   32:iconst_0        
	//   19   33:istore_2        
_L2:
		Object obj1;
		Object obj2;
		Object obj3;
		if(i >= mSize)
			break; /* Loop/switch isn't completed */
	//   20   34:iload_2         
	//   21   35:aload_0         
	//   22   36:getfield        #44  <Field int mSize>
	//   23   39:icmpge          108
		obj1 = keyAt(i);
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #101 <Method Object keyAt(int)>
	//   27   47:astore          4
		obj2 = valueAt(i);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #104 <Method Object valueAt(int)>
	//   31   54:astore          5
		obj3 = ((SimpleArrayMap) (obj)).get(obj1);
	//   32   56:aload_1         
	//   33   57:aload           4
	//   34   59:invokevirtual   #108 <Method Object get(Object)>
	//   35   62:astore          6
		if(obj2 == null)
	//*  36   64:aload           5
	//*  37   66:ifnonnull       87
		{
			if(obj3 == null)
	//*  38   69:aload           6
	//*  39   71:ifnonnull       85
			{
				boolean flag;
				try
				{
					flag = ((SimpleArrayMap) (obj)).containsKey(obj1);
	//   40   74:aload_1         
	//   41   75:aload           4
	//   42   77:invokevirtual   #110 <Method boolean containsKey(Object)>
	//   43   80:istore_3        
				}
	//*  44   81:iload_3         
	//*  45   82:ifne            101
	//*  46   85:iconst_0        
	//*  47   86:ireturn         
	//*  48   87:aload           5
	//*  49   89:aload           6
	//*  50   91:invokevirtual   #112 <Method boolean Object.equals(Object)>
	//*  51   94:istore_3        
	//*  52   95:iload_3         
	//*  53   96:ifne            101
	//*  54   99:iconst_0        
	//*  55  100:ireturn         
	//*  56  101:iload_2         
	//*  57  102:iconst_1        
	//*  58  103:iadd            
	//*  59  104:istore_2        
	//*  60  105:goto            34
	//*  61  108:goto            117
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  62  111:astore_1        
				{
					return false;
	//   63  112:iconst_0        
	//   64  113:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  65  114:astore_1        
				{
					return false;
	//   66  115:iconst_0        
	//   67  116:ireturn         
				}
				if(flag)
					break MISSING_BLOCK_LABEL_101;
			}
			return false;
		}
		flag = obj2.equals(obj3);
		if(!flag)
			return false;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		return true;
	//   68  117:iconst_1        
	//   69  118:ireturn         
		if(!(obj instanceof Map))
			break MISSING_BLOCK_LABEL_237;
	//   70  119:aload_1         
	//   71  120:instanceof      #114 <Class Map>
	//   72  123:ifeq            237
		obj = ((Object) ((Map)obj));
	//   73  126:aload_1         
	//   74  127:checkcast       #114 <Class Map>
	//   75  130:astore_1        
		if(size() != ((Map) (obj)).size())
	//*  76  131:aload_0         
	//*  77  132:invokevirtual   #97  <Method int size()>
	//*  78  135:aload_1         
	//*  79  136:invokeinterface #115 <Method int Map.size()>
	//*  80  141:icmpeq          146
			return false;
	//   81  144:iconst_0        
	//   82  145:ireturn         
		i = 0;
	//   83  146:iconst_0        
	//   84  147:istore_2        
_L4:
		if(i >= mSize)
			break; /* Loop/switch isn't completed */
	//   85  148:iload_2         
	//   86  149:aload_0         
	//   87  150:getfield        #44  <Field int mSize>
	//   88  153:icmpge          226
		obj1 = keyAt(i);
	//   89  156:aload_0         
	//   90  157:iload_2         
	//   91  158:invokevirtual   #101 <Method Object keyAt(int)>
	//   92  161:astore          4
		obj2 = valueAt(i);
	//   93  163:aload_0         
	//   94  164:iload_2         
	//   95  165:invokevirtual   #104 <Method Object valueAt(int)>
	//   96  168:astore          5
		obj3 = ((Map) (obj)).get(obj1);
	//   97  170:aload_1         
	//   98  171:aload           4
	//   99  173:invokeinterface #116 <Method Object Map.get(Object)>
	//  100  178:astore          6
		if(obj2 == null)
	//* 101  180:aload           5
	//* 102  182:ifnonnull       205
		{
			if(obj3 == null)
	//* 103  185:aload           6
	//* 104  187:ifnonnull       203
			{
				boolean flag1;
				try
				{
					flag1 = ((Map) (obj)).containsKey(obj1);
	//  105  190:aload_1         
	//  106  191:aload           4
	//  107  193:invokeinterface #117 <Method boolean Map.containsKey(Object)>
	//  108  198:istore_3        
				}
	//* 109  199:iload_3         
	//* 110  200:ifne            219
	//* 111  203:iconst_0        
	//* 112  204:ireturn         
	//* 113  205:aload           5
	//* 114  207:aload           6
	//* 115  209:invokevirtual   #112 <Method boolean Object.equals(Object)>
	//* 116  212:istore_3        
	//* 117  213:iload_3         
	//* 118  214:ifne            219
	//* 119  217:iconst_0        
	//* 120  218:ireturn         
	//* 121  219:iload_2         
	//* 122  220:iconst_1        
	//* 123  221:iadd            
	//* 124  222:istore_2        
	//* 125  223:goto            148
	//* 126  226:goto            235
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//* 127  229:astore_1        
				{
					return false;
	//  128  230:iconst_0        
	//  129  231:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//* 130  232:astore_1        
				{
					return false;
	//  131  233:iconst_0        
	//  132  234:ireturn         
				}
				if(flag1)
					break MISSING_BLOCK_LABEL_219;
			}
			return false;
		}
		flag1 = obj2.equals(obj3);
		if(!flag1)
			return false;
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		return true;
	//  133  235:iconst_1        
	//  134  236:ireturn         
		return false;
	//  135  237:iconst_0        
	//  136  238:ireturn         
	}

	public Object get(Object obj)
	{
		int i = indexOfKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            21
			return mArray[(i << 1) + 1];
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field Object[] mArray>
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
	//    1    1:getfield        #37  <Field int[] mHashes>
	//    2    4:astore          7
		Object aobj[] = mArray;
	//    3    6:aload_0         
	//    4    7:getfield        #42  <Field Object[] mArray>
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
		for(int i1 = mSize; j < i1;)
	//*  12   18:aload_0         
	//*  13   19:getfield        #44  <Field int mSize>
	//*  14   22:istore          5
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
	//   32   55:invokevirtual   #122 <Method int Object.hashCode()>
	//   33   58:istore          4
			k += j1 ^ l;
	//   34   60:iload_3         
	//   35   61:iload           6
	//   36   63:iload           4
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
	//    1    1:getfield        #44  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = ContainerHelpers.binarySearch(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #128 <Method int ContainerHelpers.binarySearch(int[], int, int)>
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
	//*  19   35:getfield        #42  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:iconst_1        
	//*  22   41:ishl            
	//*  23   42:aaload          
	//*  24   43:invokevirtual   #112 <Method boolean Object.equals(Object)>
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
	//*  36   64:getfield        #37  <Field int[] mHashes>
	//*  37   67:iload_3         
	//*  38   68:iaload          
	//*  39   69:iload_2         
	//*  40   70:icmpne          97
			if(obj.equals(mArray[j << 1]))
	//*  41   73:aload_1         
	//*  42   74:aload_0         
	//*  43   75:getfield        #42  <Field Object[] mArray>
	//*  44   78:iload_3         
	//*  45   79:iconst_1        
	//*  46   80:ishl            
	//*  47   81:aaload          
	//*  48   82:invokevirtual   #112 <Method boolean Object.equals(Object)>
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
	//*  64  109:getfield        #37  <Field int[] mHashes>
	//*  65  112:iload           4
	//*  66  114:iaload          
	//*  67  115:iload_2         
	//*  68  116:icmpne          147
			if(obj.equals(mArray[l << 1]))
	//*  69  119:aload_1         
	//*  70  120:aload_0         
	//*  71  121:getfield        #42  <Field Object[] mArray>
	//*  72  124:iload           4
	//*  73  126:iconst_1        
	//*  74  127:ishl            
	//*  75  128:aaload          
	//*  76  129:invokevirtual   #112 <Method boolean Object.equals(Object)>
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
	//    3    5:invokevirtual   #131 <Method int indexOfNull()>
	//    4    8:ireturn         
		else
			return indexOf(obj, obj.hashCode());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #122 <Method int Object.hashCode()>
	//    9   15:invokevirtual   #133 <Method int indexOf(Object, int)>
	//   10   18:ireturn         
	}

	int indexOfNull()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = ContainerHelpers.binarySearch(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #37  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #128 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l << 1] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #42  <Field Object[] mArray>
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
	//*  34   50:getfield        #37  <Field int[] mHashes>
	//*  35   53:iload_1         
	//*  36   54:iaload          
	//*  37   55:ifne            78
			if(mArray[i << 1] == null)
	//*  38   58:aload_0         
	//*  39   59:getfield        #42  <Field Object[] mArray>
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
	//*  59   87:getfield        #37  <Field int[] mHashes>
	//*  60   90:iload_2         
	//*  61   91:iaload          
	//*  62   92:ifne            115
			if(mArray[k << 1] == null)
	//*  63   95:aload_0         
	//*  64   96:getfield        #42  <Field Object[] mArray>
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
	//    1    1:getfield        #44  <Field int mSize>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:istore_3        
		Object aobj[] = mArray;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field Object[] mArray>
	//    7   11:astore          4
		if(obj == null)
	//*   8   13:aload_1         
	//*   9   14:ifnonnull       45
		{
			for(int i = 1; i < k; i += 2)
	//*  10   17:iconst_1        
	//*  11   18:istore_2        
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          42
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
	//*  28   42:goto            74
		{
			for(int j = 1; j < k; j += 2)
	//*  29   45:iconst_1        
	//*  30   46:istore_2        
	//*  31   47:iload_2         
	//*  32   48:iload_3         
	//*  33   49:icmpge          74
				if(obj.equals(aobj[j]))
	//*  34   52:aload_1         
	//*  35   53:aload           4
	//*  36   55:iload_2         
	//*  37   56:aaload          
	//*  38   57:invokevirtual   #112 <Method boolean Object.equals(Object)>
	//*  39   60:ifeq            67
					return j >> 1;
	//   40   63:iload_2         
	//   41   64:iconst_1        
	//   42   65:ishr            
	//   43   66:ireturn         

	//   44   67:iload_2         
	//   45   68:iconst_2        
	//   46   69:iadd            
	//   47   70:istore_2        
		}
	//*  48   71:goto            47
		return -1;
	//   49   74:iconst_m1       
	//   50   75:ireturn         
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mSize>
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
	//    1    1:getfield        #42  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:ishl            
	//    5    7:aaload          
	//    6    8:areturn         
	}

	public Object put(Object obj, Object obj1)
	{
		int i;
		int k;
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			k = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
			i = indexOfNull();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #131 <Method int indexOfNull()>
	//    6   11:istore_3        
		} else
	//*   7   12:goto            29
		{
			k = obj.hashCode();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #122 <Method int Object.hashCode()>
	//   10   19:istore          4
			i = indexOf(obj, k);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload           4
	//   14   25:invokevirtual   #133 <Method int indexOf(Object, int)>
	//   15   28:istore_3        
		}
		if(i >= 0)
	//*  16   29:iload_3         
	//*  17   30:iflt            55
		{
			i = (i << 1) + 1;
	//   18   33:iload_3         
	//   19   34:iconst_1        
	//   20   35:ishl            
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore_3        
			obj = mArray[i];
	//   24   39:aload_0         
	//   25   40:getfield        #42  <Field Object[] mArray>
	//   26   43:iload_3         
	//   27   44:aaload          
	//   28   45:astore_1        
			mArray[i] = obj1;
	//   29   46:aload_0         
	//   30   47:getfield        #42  <Field Object[] mArray>
	//   31   50:iload_3         
	//   32   51:aload_2         
	//   33   52:aastore         
			return obj;
	//   34   53:aload_1         
	//   35   54:areturn         
		}
		int l = ~i;
	//   36   55:iload_3         
	//   37   56:iconst_m1       
	//   38   57:ixor            
	//   39   58:istore          5
		if(mSize >= mHashes.length)
	//*  40   60:aload_0         
	//*  41   61:getfield        #44  <Field int mSize>
	//*  42   64:aload_0         
	//*  43   65:getfield        #37  <Field int[] mHashes>
	//*  44   68:arraylength     
	//*  45   69:icmplt          176
		{
			int j;
			if(mSize >= 8)
	//*  46   72:aload_0         
	//*  47   73:getfield        #44  <Field int mSize>
	//*  48   76:bipush          8
	//*  49   78:icmplt          96
				j = mSize + (mSize >> 1);
	//   50   81:aload_0         
	//   51   82:getfield        #44  <Field int mSize>
	//   52   85:aload_0         
	//   53   86:getfield        #44  <Field int mSize>
	//   54   89:iconst_1        
	//   55   90:ishr            
	//   56   91:iadd            
	//   57   92:istore_3        
			else
	//*  58   93:goto            112
			if(mSize >= 4)
	//*  59   96:aload_0         
	//*  60   97:getfield        #44  <Field int mSize>
	//*  61  100:iconst_4        
	//*  62  101:icmplt          110
				j = 8;
	//   63  104:bipush          8
	//   64  106:istore_3        
			else
	//*  65  107:goto            112
				j = 4;
	//   66  110:iconst_4        
	//   67  111:istore_3        
			int ai[] = mHashes;
	//   68  112:aload_0         
	//   69  113:getfield        #37  <Field int[] mHashes>
	//   70  116:astore          6
			Object aobj[] = mArray;
	//   71  118:aload_0         
	//   72  119:getfield        #42  <Field Object[] mArray>
	//   73  122:astore          7
			allocArrays(j);
	//   74  124:aload_0         
	//   75  125:iload_3         
	//   76  126:invokespecial   #49  <Method void allocArrays(int)>
			if(mHashes.length > 0)
	//*  77  129:aload_0         
	//*  78  130:getfield        #37  <Field int[] mHashes>
	//*  79  133:arraylength     
	//*  80  134:ifle            165
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
	//   81  137:aload           6
	//   82  139:iconst_0        
	//   83  140:aload_0         
	//   84  141:getfield        #37  <Field int[] mHashes>
	//   85  144:iconst_0        
	//   86  145:aload           6
	//   87  147:arraylength     
	//   88  148:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   89  151:aload           7
	//   90  153:iconst_0        
	//   91  154:aload_0         
	//   92  155:getfield        #42  <Field Object[] mArray>
	//   93  158:iconst_0        
	//   94  159:aload           7
	//   95  161:arraylength     
	//   96  162:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   97  165:aload           6
	//   98  167:aload           7
	//   99  169:aload_0         
	//  100  170:getfield        #44  <Field int mSize>
	//  101  173:invokestatic    #71  <Method void freeArrays(int[], Object[], int)>
		}
		if(l < mSize)
	//* 102  176:iload           5
	//* 103  178:aload_0         
	//* 104  179:getfield        #44  <Field int mSize>
	//* 105  182:icmpge          239
		{
			System.arraycopy(((Object) (mHashes)), l, ((Object) (mHashes)), l + 1, mSize - l);
	//  106  185:aload_0         
	//  107  186:getfield        #37  <Field int[] mHashes>
	//  108  189:iload           5
	//  109  191:aload_0         
	//  110  192:getfield        #37  <Field int[] mHashes>
	//  111  195:iload           5
	//  112  197:iconst_1        
	//  113  198:iadd            
	//  114  199:aload_0         
	//  115  200:getfield        #44  <Field int mSize>
	//  116  203:iload           5
	//  117  205:isub            
	//  118  206:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), l << 1, ((Object) (mArray)), l + 1 << 1, mSize - l << 1);
	//  119  209:aload_0         
	//  120  210:getfield        #42  <Field Object[] mArray>
	//  121  213:iload           5
	//  122  215:iconst_1        
	//  123  216:ishl            
	//  124  217:aload_0         
	//  125  218:getfield        #42  <Field Object[] mArray>
	//  126  221:iload           5
	//  127  223:iconst_1        
	//  128  224:iadd            
	//  129  225:iconst_1        
	//  130  226:ishl            
	//  131  227:aload_0         
	//  132  228:getfield        #44  <Field int mSize>
	//  133  231:iload           5
	//  134  233:isub            
	//  135  234:iconst_1        
	//  136  235:ishl            
	//  137  236:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mHashes[l] = k;
	//  138  239:aload_0         
	//  139  240:getfield        #37  <Field int[] mHashes>
	//  140  243:iload           5
	//  141  245:iload           4
	//  142  247:iastore         
		mArray[l << 1] = obj;
	//  143  248:aload_0         
	//  144  249:getfield        #42  <Field Object[] mArray>
	//  145  252:iload           5
	//  146  254:iconst_1        
	//  147  255:ishl            
	//  148  256:aload_1         
	//  149  257:aastore         
		mArray[(l << 1) + 1] = obj1;
	//  150  258:aload_0         
	//  151  259:getfield        #42  <Field Object[] mArray>
	//  152  262:iload           5
	//  153  264:iconst_1        
	//  154  265:ishl            
	//  155  266:iconst_1        
	//  156  267:iadd            
	//  157  268:aload_2         
	//  158  269:aastore         
		mSize = mSize + 1;
	//  159  270:aload_0         
	//  160  271:aload_0         
	//  161  272:getfield        #44  <Field int mSize>
	//  162  275:iconst_1        
	//  163  276:iadd            
	//  164  277:putfield        #44  <Field int mSize>
		return ((Object) (null));
	//  165  280:aconst_null     
	//  166  281:areturn         
	}

	public void putAll(SimpleArrayMap simplearraymap)
	{
		int j = simplearraymap.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #44  <Field int mSize>
	//    2    4:istore_3        
		ensureCapacity(mSize + j);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field int mSize>
	//    6   10:iload_3         
	//    7   11:iadd            
	//    8   12:invokevirtual   #141 <Method void ensureCapacity(int)>
		if(mSize == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #44  <Field int mSize>
	//*  11   19:ifne            62
		{
			if(j > 0)
	//*  12   22:iload_3         
	//*  13   23:ifle            91
			{
				System.arraycopy(((Object) (simplearraymap.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   14   26:aload_1         
	//   15   27:getfield        #37  <Field int[] mHashes>
	//   16   30:iconst_0        
	//   17   31:aload_0         
	//   18   32:getfield        #37  <Field int[] mHashes>
	//   19   35:iconst_0        
	//   20   36:iload_3         
	//   21   37:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (simplearraymap.mArray)), 0, ((Object) (mArray)), 0, j << 1);
	//   22   40:aload_1         
	//   23   41:getfield        #42  <Field Object[] mArray>
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #42  <Field Object[] mArray>
	//   27   49:iconst_0        
	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:ishl            
	//   31   53:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   32   56:aload_0         
	//   33   57:iload_3         
	//   34   58:putfield        #44  <Field int mSize>
				return;
	//   35   61:return          
			}
		} else
		{
			for(int i = 0; i < j; i++)
	//*  36   62:iconst_0        
	//*  37   63:istore_2        
	//*  38   64:iload_2         
	//*  39   65:iload_3         
	//*  40   66:icmpge          91
				put(simplearraymap.keyAt(i), simplearraymap.valueAt(i));
	//   41   69:aload_0         
	//   42   70:aload_1         
	//   43   71:iload_2         
	//   44   72:invokevirtual   #101 <Method Object keyAt(int)>
	//   45   75:aload_1         
	//   46   76:iload_2         
	//   47   77:invokevirtual   #104 <Method Object valueAt(int)>
	//   48   80:invokevirtual   #143 <Method Object put(Object, Object)>
	//   49   83:pop             

	//   50   84:iload_2         
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:istore_2        
		}
	//*  54   88:goto            64
	//   55   91:return          
	}

	public Object remove(Object obj)
	{
		int i = indexOfKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method int indexOfKey(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
			return removeAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #148 <Method Object removeAt(int)>
	//    9   15:areturn         
		else
			return ((Object) (null));
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public Object removeAt(int i)
	{
		Object obj = mArray[(i << 1) + 1];
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:aaload          
	//    8   10:astore_3        
		if(mSize <= 1)
	//*   9   11:aload_0         
	//*  10   12:getfield        #44  <Field int mSize>
	//*  11   15:iconst_1        
	//*  12   16:icmpgt          55
		{
			freeArrays(mHashes, mArray, mSize);
	//   13   19:aload_0         
	//   14   20:getfield        #37  <Field int[] mHashes>
	//   15   23:aload_0         
	//   16   24:getfield        #42  <Field Object[] mArray>
	//   17   27:aload_0         
	//   18   28:getfield        #44  <Field int mSize>
	//   19   31:invokestatic    #71  <Method void freeArrays(int[], Object[], int)>
			mHashes = ContainerHelpers.EMPTY_INTS;
	//   20   34:aload_0         
	//   21   35:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
	//   22   38:putfield        #37  <Field int[] mHashes>
			mArray = ContainerHelpers.EMPTY_OBJECTS;
	//   23   41:aload_0         
	//   24   42:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   25   45:putfield        #42  <Field Object[] mArray>
			mSize = 0;
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:putfield        #44  <Field int mSize>
			return obj;
	//   29   53:aload_3         
	//   30   54:areturn         
		}
		if(mHashes.length > 8 && mSize < mHashes.length / 3)
	//*  31   55:aload_0         
	//*  32   56:getfield        #37  <Field int[] mHashes>
	//*  33   59:arraylength     
	//*  34   60:bipush          8
	//*  35   62:icmple          217
	//*  36   65:aload_0         
	//*  37   66:getfield        #44  <Field int mSize>
	//*  38   69:aload_0         
	//*  39   70:getfield        #37  <Field int[] mHashes>
	//*  40   73:arraylength     
	//*  41   74:iconst_3        
	//*  42   75:idiv            
	//*  43   76:icmpge          217
		{
			int j;
			if(mSize > 8)
	//*  44   79:aload_0         
	//*  45   80:getfield        #44  <Field int mSize>
	//*  46   83:bipush          8
	//*  47   85:icmple          103
				j = mSize + (mSize >> 1);
	//   48   88:aload_0         
	//   49   89:getfield        #44  <Field int mSize>
	//   50   92:aload_0         
	//   51   93:getfield        #44  <Field int mSize>
	//   52   96:iconst_1        
	//   53   97:ishr            
	//   54   98:iadd            
	//   55   99:istore_2        
			else
	//*  56  100:goto            106
				j = 8;
	//   57  103:bipush          8
	//   58  105:istore_2        
			int ai[] = mHashes;
	//   59  106:aload_0         
	//   60  107:getfield        #37  <Field int[] mHashes>
	//   61  110:astore          4
			Object aobj[] = mArray;
	//   62  112:aload_0         
	//   63  113:getfield        #42  <Field Object[] mArray>
	//   64  116:astore          5
			allocArrays(j);
	//   65  118:aload_0         
	//   66  119:iload_2         
	//   67  120:invokespecial   #49  <Method void allocArrays(int)>
			mSize = mSize - 1;
	//   68  123:aload_0         
	//   69  124:aload_0         
	//   70  125:getfield        #44  <Field int mSize>
	//   71  128:iconst_1        
	//   72  129:isub            
	//   73  130:putfield        #44  <Field int mSize>
			if(i > 0)
	//*  74  133:iload_1         
	//*  75  134:ifle            163
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   76  137:aload           4
	//   77  139:iconst_0        
	//   78  140:aload_0         
	//   79  141:getfield        #37  <Field int[] mHashes>
	//   80  144:iconst_0        
	//   81  145:iload_1         
	//   82  146:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i << 1);
	//   83  149:aload           5
	//   84  151:iconst_0        
	//   85  152:aload_0         
	//   86  153:getfield        #42  <Field Object[] mArray>
	//   87  156:iconst_0        
	//   88  157:iload_1         
	//   89  158:iconst_1        
	//   90  159:ishl            
	//   91  160:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			if(i < mSize)
	//*  92  163:iload_1         
	//*  93  164:aload_0         
	//*  94  165:getfield        #44  <Field int mSize>
	//*  95  168:icmpge          215
			{
				System.arraycopy(((Object) (ai)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//   96  171:aload           4
	//   97  173:iload_1         
	//   98  174:iconst_1        
	//   99  175:iadd            
	//  100  176:aload_0         
	//  101  177:getfield        #37  <Field int[] mHashes>
	//  102  180:iload_1         
	//  103  181:aload_0         
	//  104  182:getfield        #44  <Field int mSize>
	//  105  185:iload_1         
	//  106  186:isub            
	//  107  187:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
	//  108  190:aload           5
	//  109  192:iload_1         
	//  110  193:iconst_1        
	//  111  194:iadd            
	//  112  195:iconst_1        
	//  113  196:ishl            
	//  114  197:aload_0         
	//  115  198:getfield        #42  <Field Object[] mArray>
	//  116  201:iload_1         
	//  117  202:iconst_1        
	//  118  203:ishl            
	//  119  204:aload_0         
	//  120  205:getfield        #44  <Field int mSize>
	//  121  208:iload_1         
	//  122  209:isub            
	//  123  210:iconst_1        
	//  124  211:ishl            
	//  125  212:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			return obj;
	//  126  215:aload_3         
	//  127  216:areturn         
		}
		mSize = mSize - 1;
	//  128  217:aload_0         
	//  129  218:aload_0         
	//  130  219:getfield        #44  <Field int mSize>
	//  131  222:iconst_1        
	//  132  223:isub            
	//  133  224:putfield        #44  <Field int mSize>
		if(i < mSize)
	//* 134  227:iload_1         
	//* 135  228:aload_0         
	//* 136  229:getfield        #44  <Field int mSize>
	//* 137  232:icmpge          283
		{
			System.arraycopy(((Object) (mHashes)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//  138  235:aload_0         
	//  139  236:getfield        #37  <Field int[] mHashes>
	//  140  239:iload_1         
	//  141  240:iconst_1        
	//  142  241:iadd            
	//  143  242:aload_0         
	//  144  243:getfield        #37  <Field int[] mHashes>
	//  145  246:iload_1         
	//  146  247:aload_0         
	//  147  248:getfield        #44  <Field int mSize>
	//  148  251:iload_1         
	//  149  252:isub            
	//  150  253:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
	//  151  256:aload_0         
	//  152  257:getfield        #42  <Field Object[] mArray>
	//  153  260:iload_1         
	//  154  261:iconst_1        
	//  155  262:iadd            
	//  156  263:iconst_1        
	//  157  264:ishl            
	//  158  265:aload_0         
	//  159  266:getfield        #42  <Field Object[] mArray>
	//  160  269:iload_1         
	//  161  270:iconst_1        
	//  162  271:ishl            
	//  163  272:aload_0         
	//  164  273:getfield        #44  <Field int mSize>
	//  165  276:iload_1         
	//  166  277:isub            
	//  167  278:iconst_1        
	//  168  279:ishl            
	//  169  280:invokestatic    #88  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mArray[mSize << 1] = null;
	//  170  283:aload_0         
	//  171  284:getfield        #42  <Field Object[] mArray>
	//  172  287:aload_0         
	//  173  288:getfield        #44  <Field int mSize>
	//  174  291:iconst_1        
	//  175  292:ishl            
	//  176  293:aconst_null     
	//  177  294:aastore         
		mArray[(mSize << 1) + 1] = null;
	//  178  295:aload_0         
	//  179  296:getfield        #42  <Field Object[] mArray>
	//  180  299:aload_0         
	//  181  300:getfield        #44  <Field int mSize>
	//  182  303:iconst_1        
	//  183  304:ishl            
	//  184  305:iconst_1        
	//  185  306:iadd            
	//  186  307:aconst_null     
	//  187  308:aastore         
		return obj;
	//  188  309:aload_3         
	//  189  310:areturn         
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
	//    7    7:getfield        #42  <Field Object[] mArray>
	//    8   10:iload_1         
	//    9   11:aaload          
	//   10   12:astore_3        
		mArray[i] = obj;
	//   11   13:aload_0         
	//   12   14:getfield        #42  <Field Object[] mArray>
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
	//    1    1:getfield        #44  <Field int mSize>
	//    2    4:ireturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #156 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "{}";
	//    3    7:ldc1            #158 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #160 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #44  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #162 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #166 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #44  <Field int mSize>
	//*  22   39:icmpge          121
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #168 <String ", ">
	//   27   49:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = keyAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #101 <Method Object keyAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Map)");
	//   41   73:aload_2         
	//   42   74:ldc1            #176 <String "(this Map)">
	//   43   76:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
			stringbuilder.append('=');
	//   45   80:aload_2         
	//   46   81:bipush          61
	//   47   83:invokevirtual   #166 <Method StringBuilder StringBuilder.append(char)>
	//   48   86:pop             
			obj = valueAt(i);
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokevirtual   #104 <Method Object valueAt(int)>
	//   52   92:astore_3        
			if(obj != this)
	//*  53   93:aload_3         
	//*  54   94:aload_0         
	//*  55   95:if_acmpeq       107
				stringbuilder.append(obj);
	//   56   98:aload_2         
	//   57   99:aload_3         
	//   58  100:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   59  103:pop             
			else
	//*  60  104:goto            114
				stringbuilder.append("(this Map)");
	//   61  107:aload_2         
	//   62  108:ldc1            #176 <String "(this Map)">
	//   63  110:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
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
	//   72  124:invokevirtual   #166 <Method StringBuilder StringBuilder.append(char)>
	//   73  127:pop             
		return stringbuilder.toString();
	//   74  128:aload_2         
	//   75  129:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   76  132:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[(i << 1) + 1];
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object[] mArray>
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
	private static final boolean DEBUG = false;
	private static final String TAG = "ArrayMap";
	static Object mBaseCache[];
	static int mBaseCacheSize = 0;
	static Object mTwiceBaseCache[];
	static int mTwiceBaseCacheSize = 0;
	Object mArray[];
	int mHashes[];
	int mSize;
}
