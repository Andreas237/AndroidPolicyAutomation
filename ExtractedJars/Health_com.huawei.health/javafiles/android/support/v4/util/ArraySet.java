// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package android.support.v4.util:
//			ContainerHelpers, MapCollections

public final class ArraySet
	implements Collection, Set
{

	public ArraySet()
	{
		this(0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokespecial   #49  <Method void ArraySet(int, boolean)>
	//    4    6:return          
	}

	public ArraySet(int i)
	{
		this(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #49  <Method void ArraySet(int, boolean)>
	//    4    6:return          
	}

	public ArraySet(int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		mIdentityHashCode = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #54  <Field boolean mIdentityHashCode>
		if(i == 0)
	//*   5    9:iload_1         
	//*   6   10:ifne            30
		{
			mHashes = INT;
	//    7   13:aload_0         
	//    8   14:getstatic       #42  <Field int[] INT>
	//    9   17:putfield        #56  <Field int[] mHashes>
			mArray = OBJECT;
	//   10   20:aload_0         
	//   11   21:getstatic       #44  <Field Object[] OBJECT>
	//   12   24:putfield        #58  <Field Object[] mArray>
		} else
	//*  13   27:goto            35
		{
			allocArrays(i);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:invokespecial   #61  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #63  <Field int mSize>
	//   20   40:return          
	}

	public ArraySet(ArraySet arrayset)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void ArraySet()>
		if(arrayset != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			addAll(arrayset);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #68  <Method void addAll(ArraySet)>
	//    7   13:return          
	}

	public ArraySet(Collection collection)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void ArraySet()>
		if(collection != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
			addAll(collection);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #74  <Method boolean addAll(Collection)>
	//    7   13:pop             
	//    8   14:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_84;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          84
		android/support/v4/util/ArraySet;
	//    3    6:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(sTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_69;
	//    5    9:getstatic       #77  <Field Object[] sTwiceBaseCache>
	//    6   12:ifnull          69
		aobj = sTwiceBaseCache;
	//    7   15:getstatic       #77  <Field Object[] sTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #58  <Field Object[] mArray>
		sTwiceBaseCache = (Object[])(Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #78  <Class Object[]>
	//   16   30:checkcast       #78  <Class Object[]>
	//   17   33:putstatic       #77  <Field Object[] sTwiceBaseCache>
		mHashes = (int[])(int[])aobj[1];
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aaload          
	//   22   40:checkcast       #79  <Class int[]>
	//   23   43:checkcast       #79  <Class int[]>
	//   24   46:putfield        #56  <Field int[] mHashes>
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
		sTwiceBaseCacheSize--;
	//   33   57:getstatic       #81  <Field int sTwiceBaseCacheSize>
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:putstatic       #81  <Field int sTwiceBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   37   65:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   38   67:monitorexit     
		return;
	//   39   68:return          
		android/support/v4/util/ArraySet;
	//   40   69:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
		break MISSING_BLOCK_LABEL_164;
	//   42   72:goto            81
		Exception exception;
		exception;
	//   43   75:astore_2        
	//*  44   76:ldc1            #2   <Class ArraySet>
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
		android/support/v4/util/ArraySet;
	//   52   89:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   53   91:monitorenter    
		if(sBaseCache == null)
			break MISSING_BLOCK_LABEL_152;
	//   54   92:getstatic       #83  <Field Object[] sBaseCache>
	//   55   95:ifnull          152
		exception = ((Exception) (sBaseCache));
	//   56   98:getstatic       #83  <Field Object[] sBaseCache>
	//   57  101:astore_2        
		mArray = ((Object []) (exception));
	//   58  102:aload_0         
	//   59  103:aload_2         
	//   60  104:putfield        #58  <Field Object[] mArray>
		sBaseCache = (Object[])(Object[])exception[0];
	//   61  107:aload_2         
	//   62  108:iconst_0        
	//   63  109:aaload          
	//   64  110:checkcast       #78  <Class Object[]>
	//   65  113:checkcast       #78  <Class Object[]>
	//   66  116:putstatic       #83  <Field Object[] sBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   67  119:aload_0         
	//   68  120:aload_2         
	//   69  121:iconst_1        
	//   70  122:aaload          
	//   71  123:checkcast       #79  <Class int[]>
	//   72  126:checkcast       #79  <Class int[]>
	//   73  129:putfield        #56  <Field int[] mHashes>
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
		sBaseCacheSize--;
	//   82  140:getstatic       #85  <Field int sBaseCacheSize>
	//   83  143:iconst_1        
	//   84  144:isub            
	//   85  145:putstatic       #85  <Field int sBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   86  148:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   87  150:monitorexit     
		return;
	//   88  151:return          
		android/support/v4/util/ArraySet;
	//   89  152:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   90  154:monitorexit     
		break MISSING_BLOCK_LABEL_164;
	//   91  155:goto            164
		exception;
	//   92  158:astore_2        
	//*  93  159:ldc1            #2   <Class ArraySet>
		throw exception;
	//   94  161:monitorexit     
	//   95  162:aload_2         
	//   96  163:athrow          
		mHashes = new int[i];
	//   97  164:aload_0         
	//   98  165:iload_1         
	//   99  166:newarray        int[]
	//  100  168:putfield        #56  <Field int[] mHashes>
		mArray = new Object[i];
	//  101  171:aload_0         
	//  102  172:iload_1         
	//  103  173:anewarray       Object[]
	//  104  176:putfield        #58  <Field Object[] mArray>
		return;
	//  105  179:return          
	}

	private static void freeArrays(int ai[], Object aobj[], int i)
	{
		if(ai.length != 8) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:bipush          8
	//    3    4:icmpne          60
_L1:
		android/support/v4/util/ArraySet;
	//    4    7:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(sTwiceBaseCacheSize < 10)
	//*   6   10:getstatic       #81  <Field int sTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          47
		{
			aobj[0] = ((Object) (sTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #77  <Field Object[] sTwiceBaseCache>
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
	//*  19   30:isub            
	//*  20   31:istore_2        
	//*  21   32:goto            117
_L9:
		sTwiceBaseCache = aobj;
	//   22   35:aload_1         
	//   23   36:putstatic       #77  <Field Object[] sTwiceBaseCache>
		sTwiceBaseCacheSize++;
	//   24   39:getstatic       #81  <Field int sTwiceBaseCacheSize>
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:putstatic       #81  <Field int sTwiceBaseCacheSize>
_L3:
		android/support/v4/util/ArraySet;
	//   28   47:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		  goto _L4
	//*  30   50:goto            59
		ai;
	//   31   53:astore_0        
	//*  32   54:ldc1            #2   <Class ArraySet>
		throw ai;
	//   33   56:monitorexit     
	//   34   57:aload_0         
	//   35   58:athrow          
_L4:
		return;
	//   36   59:return          
_L2:
		if(ai.length != 4) goto _L6; else goto _L5
	//   37   60:aload_0         
	//   38   61:arraylength     
	//   39   62:iconst_4        
	//   40   63:icmpne          116
_L5:
		android/support/v4/util/ArraySet;
	//   41   66:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   42   68:monitorenter    
		if(sBaseCacheSize >= 10) goto _L8; else goto _L7
	//   43   69:getstatic       #85  <Field int sBaseCacheSize>
	//   44   72:bipush          10
	//   45   74:icmpge          106
_L7:
		aobj[0] = ((Object) (sBaseCache));
	//   46   77:aload_1         
	//   47   78:iconst_0        
	//   48   79:getstatic       #83  <Field Object[] sBaseCache>
	//   49   82:aastore         
		aobj[1] = ((Object) (ai));
	//   50   83:aload_1         
	//   51   84:iconst_1        
	//   52   85:aload_0         
	//   53   86:aastore         
		i--;
	//   54   87:iload_2         
	//   55   88:iconst_1        
	//   56   89:isub            
	//   57   90:istore_2        
		break MISSING_BLOCK_LABEL_133;
	//   58   91:goto            133
_L10:
		sBaseCache = aobj;
	//   59   94:aload_1         
	//   60   95:putstatic       #83  <Field Object[] sBaseCache>
		sBaseCacheSize++;
	//   61   98:getstatic       #85  <Field int sBaseCacheSize>
	//   62  101:iconst_1        
	//   63  102:iadd            
	//   64  103:putstatic       #85  <Field int sBaseCacheSize>
_L8:
		android/support/v4/util/ArraySet;
	//   65  106:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   66  108:monitorexit     
		return;
	//   67  109:return          
		ai;
	//   68  110:astore_0        
	//*  69  111:ldc1            #2   <Class ArraySet>
		throw ai;
	//   70  113:monitorexit     
	//   71  114:aload_0         
	//   72  115:athrow          
_L6:
		return;
	//   73  116:return          
		aobj[1] = ((Object) (ai));
		i--;
		while(i >= 2) 
	//*  74  117:iload_2         
	//*  75  118:iconst_2        
	//*  76  119:icmplt          35
		{
			aobj[i] = null;
	//   77  122:aload_1         
	//   78  123:iload_2         
	//   79  124:aconst_null     
	//   80  125:aastore         
			i--;
	//   81  126:iload_2         
	//   82  127:iconst_1        
	//   83  128:isub            
	//   84  129:istore_2        
		}
		  goto _L9
	//*  85  130:goto            117
		while(i >= 2) 
	//*  86  133:iload_2         
	//*  87  134:iconst_2        
	//*  88  135:icmplt          94
		{
			aobj[i] = null;
	//   89  138:aload_1         
	//   90  139:iload_2         
	//   91  140:aconst_null     
	//   92  141:aastore         
			i--;
	//   93  142:iload_2         
	//   94  143:iconst_1        
	//   95  144:isub            
	//   96  145:istore_2        
		}
		  goto _L10
	//*  97  146:goto            133
	}

	private MapCollections getCollection()
	{
		if(mCollections == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field MapCollections mCollections>
	//*   2    4:ifnonnull       19
			mCollections = ((MapCollections) (new MapCollections() {

				protected void colClear()
				{
					clear();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:invokevirtual   #24  <Method void ArraySet.clear()>
				//    3    7:return          
				}

				protected Object colGetEntry(int i, int j)
				{
					return mArray[i];
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:getfield        #30  <Field Object[] ArraySet.mArray>
				//    3    7:iload_1         
				//    4    8:aaload          
				//    5    9:areturn         
				}

				protected Map colGetMap()
				{
					throw new UnsupportedOperationException("not a map");
				//    0    0:new             #34  <Class UnsupportedOperationException>
				//    1    3:dup             
				//    2    4:ldc1            #36  <String "not a map">
				//    3    6:invokespecial   #39  <Method void UnsupportedOperationException(String)>
				//    4    9:athrow          
				}

				protected int colGetSize()
				{
					return mSize;
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:getfield        #47  <Field int ArraySet.mSize>
				//    3    7:ireturn         
				}

				protected int colIndexOfKey(Object obj)
				{
					return indexOf(obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #52  <Method int ArraySet.indexOf(Object)>
				//    4    8:ireturn         
				}

				protected int colIndexOfValue(Object obj)
				{
					return indexOf(obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #52  <Method int ArraySet.indexOf(Object)>
				//    4    8:ireturn         
				}

				protected void colPut(Object obj, Object obj1)
				{
					add(obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #59  <Method boolean ArraySet.add(Object)>
				//    4    8:pop             
				//    5    9:return          
				}

				protected void colRemoveAt(int i)
				{
					removeAt(i);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArraySet this$0>
				//    2    4:iload_1         
				//    3    5:invokevirtual   #66  <Method Object ArraySet.removeAt(int)>
				//    4    8:pop             
				//    5    9:return          
				}

				protected Object colSetValue(int i, Object obj)
				{
					throw new UnsupportedOperationException("not a map");
				//    0    0:new             #34  <Class UnsupportedOperationException>
				//    1    3:dup             
				//    2    4:ldc1            #36  <String "not a map">
				//    3    6:invokespecial   #39  <Method void UnsupportedOperationException(String)>
				//    4    9:athrow          
				}

				final ArraySet this$0;

			
			{
				this$0 = ArraySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ArraySet this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void MapCollections()>
			//    5    9:return          
			}
			}
));
	//    3    7:aload_0         
	//    4    8:new             #11  <Class ArraySet$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #93  <Method void ArraySet$1(ArraySet)>
	//    8   16:putfield        #91  <Field MapCollections mCollections>
		return mCollections;
	//    9   19:aload_0         
	//   10   20:getfield        #91  <Field MapCollections mCollections>
	//   11   23:areturn         
	}

	private int indexOf(Object obj, int i)
	{
		int k = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = ContainerHelpers.binarySearch(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   12   23:istore          5
		if(i1 < 0)
	//*  13   25:iload           5
	//*  14   27:ifge            33
			return i1;
	//   15   30:iload           5
	//   16   32:ireturn         
		if(obj.equals(mArray[i1]))
	//*  17   33:aload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #58  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:aaload          
	//*  22   41:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//*  23   44:ifeq            50
			return i1;
	//   24   47:iload           5
	//   25   49:ireturn         
		int j;
		for(j = i1 + 1; j < k && mHashes[j] == i; j++)
	//*  26   50:iload           5
	//*  27   52:iconst_1        
	//*  28   53:iadd            
	//*  29   54:istore_3        
	//*  30   55:iload_3         
	//*  31   56:iload           4
	//*  32   58:icmpge          93
	//*  33   61:aload_0         
	//*  34   62:getfield        #56  <Field int[] mHashes>
	//*  35   65:iload_3         
	//*  36   66:iaload          
	//*  37   67:iload_2         
	//*  38   68:icmpne          93
			if(obj.equals(mArray[j]))
	//*  39   71:aload_1         
	//*  40   72:aload_0         
	//*  41   73:getfield        #58  <Field Object[] mArray>
	//*  42   76:iload_3         
	//*  43   77:aaload          
	//*  44   78:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//*  45   81:ifeq            86
				return j;
	//   46   84:iload_3         
	//   47   85:ireturn         

	//   48   86:iload_3         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:istore_3        
	//*  52   90:goto            55
		for(int l = i1 - 1; l >= 0 && mHashes[l] == i; l--)
	//*  53   93:iload           5
	//*  54   95:iconst_1        
	//*  55   96:isub            
	//*  56   97:istore          4
	//*  57   99:iload           4
	//*  58  101:iflt            141
	//*  59  104:aload_0         
	//*  60  105:getfield        #56  <Field int[] mHashes>
	//*  61  108:iload           4
	//*  62  110:iaload          
	//*  63  111:iload_2         
	//*  64  112:icmpne          141
			if(obj.equals(mArray[l]))
	//*  65  115:aload_1         
	//*  66  116:aload_0         
	//*  67  117:getfield        #58  <Field Object[] mArray>
	//*  68  120:iload           4
	//*  69  122:aaload          
	//*  70  123:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//*  71  126:ifeq            132
				return l;
	//   72  129:iload           4
	//   73  131:ireturn         

	//   74  132:iload           4
	//   75  134:iconst_1        
	//   76  135:isub            
	//   77  136:istore          4
	//*  78  138:goto            99
		return ~j;
	//   79  141:iload_3         
	//   80  142:iconst_m1       
	//   81  143:ixor            
	//   82  144:ireturn         
	}

	private int indexOfNull()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = ContainerHelpers.binarySearch(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #58  <Field Object[] mArray>
	//*  19   31:iload_3         
	//*  20   32:aaload          
	//*  21   33:ifnonnull       38
			return l;
	//   22   36:iload_3         
	//   23   37:ireturn         
		int i;
		for(i = l + 1; i < j && mHashes[i] == 0; i++)
	//*  24   38:iload_3         
	//*  25   39:iconst_1        
	//*  26   40:iadd            
	//*  27   41:istore_1        
	//*  28   42:iload_1         
	//*  29   43:iload_2         
	//*  30   44:icmpge          74
	//*  31   47:aload_0         
	//*  32   48:getfield        #56  <Field int[] mHashes>
	//*  33   51:iload_1         
	//*  34   52:iaload          
	//*  35   53:ifne            74
			if(mArray[i] == null)
	//*  36   56:aload_0         
	//*  37   57:getfield        #58  <Field Object[] mArray>
	//*  38   60:iload_1         
	//*  39   61:aaload          
	//*  40   62:ifnonnull       67
				return i;
	//   41   65:iload_1         
	//   42   66:ireturn         

	//   43   67:iload_1         
	//   44   68:iconst_1        
	//   45   69:iadd            
	//   46   70:istore_1        
	//*  47   71:goto            42
		for(int k = l - 1; k >= 0 && mHashes[k] == 0; k--)
	//*  48   74:iload_3         
	//*  49   75:iconst_1        
	//*  50   76:isub            
	//*  51   77:istore_2        
	//*  52   78:iload_2         
	//*  53   79:iflt            109
	//*  54   82:aload_0         
	//*  55   83:getfield        #56  <Field int[] mHashes>
	//*  56   86:iload_2         
	//*  57   87:iaload          
	//*  58   88:ifne            109
			if(mArray[k] == null)
	//*  59   91:aload_0         
	//*  60   92:getfield        #58  <Field Object[] mArray>
	//*  61   95:iload_2         
	//*  62   96:aaload          
	//*  63   97:ifnonnull       102
				return k;
	//   64  100:iload_2         
	//   65  101:ireturn         

	//   66  102:iload_2         
	//   67  103:iconst_1        
	//   68  104:isub            
	//   69  105:istore_2        
	//*  70  106:goto            78
		return ~i;
	//   71  109:iload_1         
	//   72  110:iconst_m1       
	//   73  111:ixor            
	//   74  112:ireturn         
	}

	public boolean add(Object obj)
	{
		int k;
		int l;
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			k = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
			l = indexOfNull();
	//    4    6:aload_0         
	//    5    7:invokespecial   #111 <Method int indexOfNull()>
	//    6   10:istore          4
		} else
	//*   7   12:goto            45
		{
			int i;
			if(mIdentityHashCode)
	//*   8   15:aload_0         
	//*   9   16:getfield        #54  <Field boolean mIdentityHashCode>
	//*  10   19:ifeq            30
				i = System.identityHashCode(obj);
	//   11   22:aload_1         
	//   12   23:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   13   26:istore_2        
			else
	//*  14   27:goto            35
				i = obj.hashCode();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #120 <Method int Object.hashCode()>
	//   17   34:istore_2        
			l = indexOf(obj, i);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:iload_2         
	//   21   38:invokespecial   #122 <Method int indexOf(Object, int)>
	//   22   41:istore          4
			k = i;
	//   23   43:iload_2         
	//   24   44:istore_3        
		}
		if(l >= 0)
	//*  25   45:iload           4
	//*  26   47:iflt            52
			return false;
	//   27   50:iconst_0        
	//   28   51:ireturn         
		l = ~l;
	//   29   52:iload           4
	//   30   54:iconst_m1       
	//   31   55:ixor            
	//   32   56:istore          4
		if(mSize >= mHashes.length)
	//*  33   58:aload_0         
	//*  34   59:getfield        #63  <Field int mSize>
	//*  35   62:aload_0         
	//*  36   63:getfield        #56  <Field int[] mHashes>
	//*  37   66:arraylength     
	//*  38   67:icmplt          174
		{
			int j;
			if(mSize >= 8)
	//*  39   70:aload_0         
	//*  40   71:getfield        #63  <Field int mSize>
	//*  41   74:bipush          8
	//*  42   76:icmplt          94
				j = mSize + (mSize >> 1);
	//   43   79:aload_0         
	//   44   80:getfield        #63  <Field int mSize>
	//   45   83:aload_0         
	//   46   84:getfield        #63  <Field int mSize>
	//   47   87:iconst_1        
	//   48   88:ishr            
	//   49   89:iadd            
	//   50   90:istore_2        
			else
	//*  51   91:goto            110
			if(mSize >= 4)
	//*  52   94:aload_0         
	//*  53   95:getfield        #63  <Field int mSize>
	//*  54   98:iconst_4        
	//*  55   99:icmplt          108
				j = 8;
	//   56  102:bipush          8
	//   57  104:istore_2        
			else
	//*  58  105:goto            110
				j = 4;
	//   59  108:iconst_4        
	//   60  109:istore_2        
			int ai[] = mHashes;
	//   61  110:aload_0         
	//   62  111:getfield        #56  <Field int[] mHashes>
	//   63  114:astore          5
			Object aobj[] = mArray;
	//   64  116:aload_0         
	//   65  117:getfield        #58  <Field Object[] mArray>
	//   66  120:astore          6
			allocArrays(j);
	//   67  122:aload_0         
	//   68  123:iload_2         
	//   69  124:invokespecial   #61  <Method void allocArrays(int)>
			if(mHashes.length > 0)
	//*  70  127:aload_0         
	//*  71  128:getfield        #56  <Field int[] mHashes>
	//*  72  131:arraylength     
	//*  73  132:ifle            163
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
	//   74  135:aload           5
	//   75  137:iconst_0        
	//   76  138:aload_0         
	//   77  139:getfield        #56  <Field int[] mHashes>
	//   78  142:iconst_0        
	//   79  143:aload           5
	//   80  145:arraylength     
	//   81  146:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   82  149:aload           6
	//   83  151:iconst_0        
	//   84  152:aload_0         
	//   85  153:getfield        #58  <Field Object[] mArray>
	//   86  156:iconst_0        
	//   87  157:aload           6
	//   88  159:arraylength     
	//   89  160:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   90  163:aload           5
	//   91  165:aload           6
	//   92  167:aload_0         
	//   93  168:getfield        #63  <Field int mSize>
	//   94  171:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
		}
		if(l < mSize)
	//*  95  174:iload           4
	//*  96  176:aload_0         
	//*  97  177:getfield        #63  <Field int mSize>
	//*  98  180:icmpge          231
		{
			System.arraycopy(((Object) (mHashes)), l, ((Object) (mHashes)), l + 1, mSize - l);
	//   99  183:aload_0         
	//  100  184:getfield        #56  <Field int[] mHashes>
	//  101  187:iload           4
	//  102  189:aload_0         
	//  103  190:getfield        #56  <Field int[] mHashes>
	//  104  193:iload           4
	//  105  195:iconst_1        
	//  106  196:iadd            
	//  107  197:aload_0         
	//  108  198:getfield        #63  <Field int mSize>
	//  109  201:iload           4
	//  110  203:isub            
	//  111  204:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), l, ((Object) (mArray)), l + 1, mSize - l);
	//  112  207:aload_0         
	//  113  208:getfield        #58  <Field Object[] mArray>
	//  114  211:iload           4
	//  115  213:aload_0         
	//  116  214:getfield        #58  <Field Object[] mArray>
	//  117  217:iload           4
	//  118  219:iconst_1        
	//  119  220:iadd            
	//  120  221:aload_0         
	//  121  222:getfield        #63  <Field int mSize>
	//  122  225:iload           4
	//  123  227:isub            
	//  124  228:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mHashes[l] = k;
	//  125  231:aload_0         
	//  126  232:getfield        #56  <Field int[] mHashes>
	//  127  235:iload           4
	//  128  237:iload_3         
	//  129  238:iastore         
		mArray[l] = obj;
	//  130  239:aload_0         
	//  131  240:getfield        #58  <Field Object[] mArray>
	//  132  243:iload           4
	//  133  245:aload_1         
	//  134  246:aastore         
		mSize = mSize + 1;
	//  135  247:aload_0         
	//  136  248:aload_0         
	//  137  249:getfield        #63  <Field int mSize>
	//  138  252:iconst_1        
	//  139  253:iadd            
	//  140  254:putfield        #63  <Field int mSize>
		return true;
	//  141  257:iconst_1        
	//  142  258:ireturn         
	}

	public void addAll(ArraySet arrayset)
	{
		int j = arrayset.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:istore_3        
		ensureCapacity(mSize + j);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #63  <Field int mSize>
	//    6   10:iload_3         
	//    7   11:iadd            
	//    8   12:invokevirtual   #132 <Method void ensureCapacity(int)>
		if(mSize == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #63  <Field int mSize>
	//*  11   19:ifne            60
		{
			if(j > 0)
	//*  12   22:iload_3         
	//*  13   23:ifle            84
			{
				System.arraycopy(((Object) (arrayset.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   14   26:aload_1         
	//   15   27:getfield        #56  <Field int[] mHashes>
	//   16   30:iconst_0        
	//   17   31:aload_0         
	//   18   32:getfield        #56  <Field int[] mHashes>
	//   19   35:iconst_0        
	//   20   36:iload_3         
	//   21   37:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (arrayset.mArray)), 0, ((Object) (mArray)), 0, j);
	//   22   40:aload_1         
	//   23   41:getfield        #58  <Field Object[] mArray>
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #58  <Field Object[] mArray>
	//   27   49:iconst_0        
	//   28   50:iload_3         
	//   29   51:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   30   54:aload_0         
	//   31   55:iload_3         
	//   32   56:putfield        #63  <Field int mSize>
				return;
	//   33   59:return          
			}
		} else
		{
			for(int i = 0; i < j; i++)
	//*  34   60:iconst_0        
	//*  35   61:istore_2        
	//*  36   62:iload_2         
	//*  37   63:iload_3         
	//*  38   64:icmpge          84
				add(arrayset.valueAt(i));
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:iload_2         
	//   42   70:invokevirtual   #136 <Method Object valueAt(int)>
	//   43   73:invokevirtual   #138 <Method boolean add(Object)>
	//   44   76:pop             

	//   45   77:iload_2         
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore_2        
		}
	//*  49   81:goto            62
	//   50   84:return          
	}

	public boolean addAll(Collection collection)
	{
		ensureCapacity(mSize + collection.size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field int mSize>
	//    3    5:aload_1         
	//    4    6:invokeinterface #142 <Method int Collection.size()>
	//    5   11:iadd            
	//    6   12:invokevirtual   #132 <Method void ensureCapacity(int)>
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #146 <Method Iterator Collection.iterator()>
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            49
			flag |= add(((Iterator) (collection)).next());
	//   15   33:iload_2         
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokeinterface #156 <Method Object Iterator.next()>
	//   19   41:invokevirtual   #138 <Method boolean add(Object)>
	//   20   44:ior             
	//   21   45:istore_2        

	//*  22   46:goto            24
		return flag;
	//   23   49:iload_2         
	//   24   50:ireturn         
	}

	public void append(Object obj)
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:istore_3        
		int i;
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            34
		if(mIdentityHashCode)
	//*   8   14:aload_0         
	//*   9   15:getfield        #54  <Field boolean mIdentityHashCode>
	//*  10   18:ifeq            29
			i = System.identityHashCode(obj);
	//   11   21:aload_1         
	//   12   22:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   13   25:istore_2        
		else
	//*  14   26:goto            34
			i = obj.hashCode();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #120 <Method int Object.hashCode()>
	//   17   33:istore_2        
		if(j >= mHashes.length)
	//*  18   34:iload_3         
	//*  19   35:aload_0         
	//*  20   36:getfield        #56  <Field int[] mHashes>
	//*  21   39:arraylength     
	//*  22   40:icmplt          53
			throw new IllegalStateException("Array is full");
	//   23   43:new             #165 <Class IllegalStateException>
	//   24   46:dup             
	//   25   47:ldc1            #167 <String "Array is full">
	//   26   49:invokespecial   #170 <Method void IllegalStateException(String)>
	//   27   52:athrow          
		if(j > 0 && mHashes[j - 1] > i)
	//*  28   53:iload_3         
	//*  29   54:ifle            76
	//*  30   57:aload_0         
	//*  31   58:getfield        #56  <Field int[] mHashes>
	//*  32   61:iload_3         
	//*  33   62:iconst_1        
	//*  34   63:isub            
	//*  35   64:iaload          
	//*  36   65:iload_2         
	//*  37   66:icmple          76
		{
			add(obj);
	//   38   69:aload_0         
	//   39   70:aload_1         
	//   40   71:invokevirtual   #138 <Method boolean add(Object)>
	//   41   74:pop             
			return;
	//   42   75:return          
		} else
		{
			mSize = j + 1;
	//   43   76:aload_0         
	//   44   77:iload_3         
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:putfield        #63  <Field int mSize>
			mHashes[j] = i;
	//   48   83:aload_0         
	//   49   84:getfield        #56  <Field int[] mHashes>
	//   50   87:iload_3         
	//   51   88:iload_2         
	//   52   89:iastore         
			mArray[j] = obj;
	//   53   90:aload_0         
	//   54   91:getfield        #58  <Field Object[] mArray>
	//   55   94:iload_3         
	//   56   95:aload_1         
	//   57   96:aastore         
			return;
	//   58   97:return          
		}
	}

	public void clear()
	{
		if(mSize != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int mSize>
	//*   2    4:ifeq            41
		{
			freeArrays(mHashes, mArray, mSize);
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field int[] mHashes>
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field Object[] mArray>
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field int mSize>
	//    9   19:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   10   22:aload_0         
	//   11   23:getstatic       #42  <Field int[] INT>
	//   12   26:putfield        #56  <Field int[] mHashes>
			mArray = OBJECT;
	//   13   29:aload_0         
	//   14   30:getstatic       #44  <Field Object[] OBJECT>
	//   15   33:putfield        #58  <Field Object[] mArray>
			mSize = 0;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #63  <Field int mSize>
		}
	//   19   41:return          
	}

	public boolean contains(Object obj)
	{
		return indexOf(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method int indexOf(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean containsAll(Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #146 <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            31
			if(!contains(((Iterator) (collection)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #156 <Method Object Iterator.next()>
	//*   9   23:invokevirtual   #179 <Method boolean contains(Object)>
	//*  10   26:ifne            7
				return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         

		return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	}

	public void ensureCapacity(int i)
	{
		if(mHashes.length < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int[] mHashes>
	//*   2    4:arraylength     
	//*   3    5:iload_1         
	//*   4    6:icmpge          68
		{
			int ai[] = mHashes;
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field int[] mHashes>
	//    7   13:astore_2        
			Object aobj[] = mArray;
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field Object[] mArray>
	//   10   18:astore_3        
			allocArrays(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokespecial   #61  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  14   24:aload_0         
	//*  15   25:getfield        #63  <Field int mSize>
	//*  16   28:ifle            59
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, mSize);
	//   17   31:aload_2         
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #56  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #63  <Field int mSize>
	//   24   42:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize);
	//   25   45:aload_3         
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #58  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:aload_0         
	//   31   53:getfield        #63  <Field int mSize>
	//   32   56:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:aload_0         
	//   36   62:getfield        #63  <Field int mSize>
	//   37   65:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
		}
	//   38   68:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof Set)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #9   <Class Set>
	//*   7   11:ifeq            80
		{
			obj = ((Object) ((Set)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #9   <Class Set>
	//   10   18:astore_1        
			if(size() != ((Set) (obj)).size())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #185 <Method int size()>
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #186 <Method int Set.size()>
	//*  15   29:icmpeq          34
				return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
			int i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
			do
			{
				boolean flag;
				try
				{
					if(i >= mSize)
						break;
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #63  <Field int mSize>
	//   23   41:icmpge          69
					flag = ((Set) (obj)).contains(valueAt(i));
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #136 <Method Object valueAt(int)>
	//   28   50:invokeinterface #187 <Method boolean Set.contains(Object)>
	//   29   55:istore_3        
				}
	//*  30   56:iload_3         
	//*  31   57:ifne            62
	//*  32   60:iconst_0        
	//*  33   61:ireturn         
	//*  34   62:iload_2         
	//*  35   63:iconst_1        
	//*  36   64:iadd            
	//*  37   65:istore_2        
	//*  38   66:goto            36
	//*  39   69:goto            78
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  40   72:astore_1        
				{
					return false;
	//   41   73:iconst_0        
	//   42   74:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  43   75:astore_1        
				{
					return false;
	//   44   76:iconst_0        
	//   45   77:ireturn         
				}
				if(!flag)
					return false;
				i++;
			} while(true);
			return true;
	//   46   78:iconst_1        
	//   47   79:ireturn         
		} else
		{
			return false;
	//   48   80:iconst_0        
	//   49   81:ireturn         
		}
	}

	public int hashCode()
	{
		int ai[] = mHashes;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int[] mHashes>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		for(int k = mSize; i < k; i++)
	//*   7   10:aload_0         
	//*   8   11:getfield        #63  <Field int mSize>
	//*   9   14:istore_3        
	//*  10   15:iload_1         
	//*  11   16:iload_3         
	//*  12   17:icmpge          34
			j += ai[i];
	//   13   20:iload_2         
	//   14   21:aload           4
	//   15   23:iload_1         
	//   16   24:iaload          
	//   17   25:iadd            
	//   18   26:istore_2        

	//   19   27:iload_1         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_1        
	//*  23   31:goto            15
		return j;
	//   24   34:iload_2         
	//   25   35:ireturn         
	}

	public int indexOf(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokespecial   #111 <Method int indexOfNull()>
	//    4    8:ireturn         
		int i;
		if(mIdentityHashCode)
	//*   5    9:aload_0         
	//*   6   10:getfield        #54  <Field boolean mIdentityHashCode>
	//*   7   13:ifeq            24
			i = System.identityHashCode(obj);
	//    8   16:aload_1         
	//    9   17:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i = obj.hashCode();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #120 <Method int Object.hashCode()>
	//   14   28:istore_2        
		return indexOf(obj, i);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokespecial   #122 <Method int indexOf(Object, int)>
	//   19   35:ireturn         
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Iterator iterator()
	{
		return getCollection().getKeySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method MapCollections getCollection()>
	//    2    4:invokevirtual   #196 <Method Set MapCollections.getKeySet()>
	//    3    7:invokeinterface #197 <Method Iterator Set.iterator()>
	//    4   12:areturn         
	}

	public boolean remove(Object obj)
	{
		int i = indexOf(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method int indexOf(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            18
		{
			removeAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #202 <Method Object removeAt(int)>
	//    9   15:pop             
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		} else
		{
			return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
		}
	}

	public boolean removeAll(ArraySet arrayset)
	{
		int j = arrayset.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:istore_3        
		int k = mSize;
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field int mSize>
	//    5    9:istore          4
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          35
			remove(arrayset.valueAt(i));
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:invokevirtual   #136 <Method Object valueAt(int)>
	//   15   24:invokevirtual   #206 <Method boolean remove(Object)>
	//   16   27:pop             

	//   17   28:iload_2         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_2        
	//*  21   32:goto            13
		return k != mSize;
	//   22   35:iload           4
	//   23   37:aload_0         
	//   24   38:getfield        #63  <Field int mSize>
	//   25   41:icmpeq          46
	//   26   44:iconst_1        
	//   27   45:ireturn         
	//   28   46:iconst_0        
	//   29   47:ireturn         
	}

	public boolean removeAll(Collection collection)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   2    2:aload_1         
	//*   3    3:invokeinterface #146 <Method Iterator Collection.iterator()>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//*   7   15:ifeq            34
			flag |= remove(((Iterator) (collection)).next());
	//    8   18:iload_2         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #156 <Method Object Iterator.next()>
	//   12   26:invokevirtual   #206 <Method boolean remove(Object)>
	//   13   29:ior             
	//   14   30:istore_2        

	//*  15   31:goto            9
		return flag;
	//   16   34:iload_2         
	//   17   35:ireturn         
	}

	public Object removeAt(int i)
	{
		Object obj = mArray[i];
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_3        
		if(mSize <= 1)
	//*   5    7:aload_0         
	//*   6    8:getfield        #63  <Field int mSize>
	//*   7   11:iconst_1        
	//*   8   12:icmpgt          51
		{
			freeArrays(mHashes, mArray, mSize);
	//    9   15:aload_0         
	//   10   16:getfield        #56  <Field int[] mHashes>
	//   11   19:aload_0         
	//   12   20:getfield        #58  <Field Object[] mArray>
	//   13   23:aload_0         
	//   14   24:getfield        #63  <Field int mSize>
	//   15   27:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   16   30:aload_0         
	//   17   31:getstatic       #42  <Field int[] INT>
	//   18   34:putfield        #56  <Field int[] mHashes>
			mArray = OBJECT;
	//   19   37:aload_0         
	//   20   38:getstatic       #44  <Field Object[] OBJECT>
	//   21   41:putfield        #58  <Field Object[] mArray>
			mSize = 0;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #63  <Field int mSize>
			return obj;
	//   25   49:aload_3         
	//   26   50:areturn         
		}
		if(mHashes.length > 8 && mSize < mHashes.length / 3)
	//*  27   51:aload_0         
	//*  28   52:getfield        #56  <Field int[] mHashes>
	//*  29   55:arraylength     
	//*  30   56:bipush          8
	//*  31   58:icmple          205
	//*  32   61:aload_0         
	//*  33   62:getfield        #63  <Field int mSize>
	//*  34   65:aload_0         
	//*  35   66:getfield        #56  <Field int[] mHashes>
	//*  36   69:arraylength     
	//*  37   70:iconst_3        
	//*  38   71:idiv            
	//*  39   72:icmpge          205
		{
			int j;
			if(mSize > 8)
	//*  40   75:aload_0         
	//*  41   76:getfield        #63  <Field int mSize>
	//*  42   79:bipush          8
	//*  43   81:icmple          99
				j = mSize + (mSize >> 1);
	//   44   84:aload_0         
	//   45   85:getfield        #63  <Field int mSize>
	//   46   88:aload_0         
	//   47   89:getfield        #63  <Field int mSize>
	//   48   92:iconst_1        
	//   49   93:ishr            
	//   50   94:iadd            
	//   51   95:istore_2        
			else
	//*  52   96:goto            102
				j = 8;
	//   53   99:bipush          8
	//   54  101:istore_2        
			int ai[] = mHashes;
	//   55  102:aload_0         
	//   56  103:getfield        #56  <Field int[] mHashes>
	//   57  106:astore          4
			Object aobj[] = mArray;
	//   58  108:aload_0         
	//   59  109:getfield        #58  <Field Object[] mArray>
	//   60  112:astore          5
			allocArrays(j);
	//   61  114:aload_0         
	//   62  115:iload_2         
	//   63  116:invokespecial   #61  <Method void allocArrays(int)>
			mSize = mSize - 1;
	//   64  119:aload_0         
	//   65  120:aload_0         
	//   66  121:getfield        #63  <Field int mSize>
	//   67  124:iconst_1        
	//   68  125:isub            
	//   69  126:putfield        #63  <Field int mSize>
			if(i > 0)
	//*  70  129:iload_1         
	//*  71  130:ifle            157
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   72  133:aload           4
	//   73  135:iconst_0        
	//   74  136:aload_0         
	//   75  137:getfield        #56  <Field int[] mHashes>
	//   76  140:iconst_0        
	//   77  141:iload_1         
	//   78  142:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i);
	//   79  145:aload           5
	//   80  147:iconst_0        
	//   81  148:aload_0         
	//   82  149:getfield        #58  <Field Object[] mArray>
	//   83  152:iconst_0        
	//   84  153:iload_1         
	//   85  154:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			if(i < mSize)
	//*  86  157:iload_1         
	//*  87  158:aload_0         
	//*  88  159:getfield        #63  <Field int mSize>
	//*  89  162:icmpge          203
			{
				System.arraycopy(((Object) (ai)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//   90  165:aload           4
	//   91  167:iload_1         
	//   92  168:iconst_1        
	//   93  169:iadd            
	//   94  170:aload_0         
	//   95  171:getfield        #56  <Field int[] mHashes>
	//   96  174:iload_1         
	//   97  175:aload_0         
	//   98  176:getfield        #63  <Field int mSize>
	//   99  179:iload_1         
	//  100  180:isub            
	//  101  181:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), i + 1, ((Object) (mArray)), i, mSize - i);
	//  102  184:aload           5
	//  103  186:iload_1         
	//  104  187:iconst_1        
	//  105  188:iadd            
	//  106  189:aload_0         
	//  107  190:getfield        #58  <Field Object[] mArray>
	//  108  193:iload_1         
	//  109  194:aload_0         
	//  110  195:getfield        #63  <Field int mSize>
	//  111  198:iload_1         
	//  112  199:isub            
	//  113  200:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			return obj;
	//  114  203:aload_3         
	//  115  204:areturn         
		}
		mSize = mSize - 1;
	//  116  205:aload_0         
	//  117  206:aload_0         
	//  118  207:getfield        #63  <Field int mSize>
	//  119  210:iconst_1        
	//  120  211:isub            
	//  121  212:putfield        #63  <Field int mSize>
		if(i < mSize)
	//* 122  215:iload_1         
	//* 123  216:aload_0         
	//* 124  217:getfield        #63  <Field int mSize>
	//* 125  220:icmpge          265
		{
			System.arraycopy(((Object) (mHashes)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//  126  223:aload_0         
	//  127  224:getfield        #56  <Field int[] mHashes>
	//  128  227:iload_1         
	//  129  228:iconst_1        
	//  130  229:iadd            
	//  131  230:aload_0         
	//  132  231:getfield        #56  <Field int[] mHashes>
	//  133  234:iload_1         
	//  134  235:aload_0         
	//  135  236:getfield        #63  <Field int mSize>
	//  136  239:iload_1         
	//  137  240:isub            
	//  138  241:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), i + 1, ((Object) (mArray)), i, mSize - i);
	//  139  244:aload_0         
	//  140  245:getfield        #58  <Field Object[] mArray>
	//  141  248:iload_1         
	//  142  249:iconst_1        
	//  143  250:iadd            
	//  144  251:aload_0         
	//  145  252:getfield        #58  <Field Object[] mArray>
	//  146  255:iload_1         
	//  147  256:aload_0         
	//  148  257:getfield        #63  <Field int mSize>
	//  149  260:iload_1         
	//  150  261:isub            
	//  151  262:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mArray[mSize] = null;
	//  152  265:aload_0         
	//  153  266:getfield        #58  <Field Object[] mArray>
	//  154  269:aload_0         
	//  155  270:getfield        #63  <Field int mSize>
	//  156  273:aconst_null     
	//  157  274:aastore         
		return obj;
	//  158  275:aload_3         
	//  159  276:areturn         
	}

	public boolean retainAll(Collection collection)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int i = mSize - 1; i >= 0; i--)
	//*   2    2:aload_0         
	//*   3    3:getfield        #63  <Field int mSize>
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iflt            43
			if(!collection.contains(mArray[i]))
	//*   9   13:aload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #58  <Field Object[] mArray>
	//*  12   18:iload_2         
	//*  13   19:aaload          
	//*  14   20:invokeinterface #210 <Method boolean Collection.contains(Object)>
	//*  15   25:ifne            36
			{
				removeAt(i);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #202 <Method Object removeAt(int)>
	//   19   33:pop             
				flag = true;
	//   20   34:iconst_1        
	//   21   35:istore_3        
			}

	//   22   36:iload_2         
	//   23   37:iconst_1        
	//   24   38:isub            
	//   25   39:istore_2        
	//*  26   40:goto            9
		return flag;
	//   27   43:iload_3         
	//   28   44:ireturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:ireturn         
	}

	public Object[] toArray()
	{
		Object aobj[] = new Object[mSize];
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSize>
	//    2    4:anewarray       Object[]
	//    3    7:astore_1        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj)), 0, mSize);
	//    4    8:aload_0         
	//    5    9:getfield        #58  <Field Object[] mArray>
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #63  <Field int mSize>
	//   11   19:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		Object aobj1[] = aobj;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(aobj.length < mSize)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:aload_0         
	//*   5    5:getfield        #63  <Field int mSize>
	//*   6    8:icmpge          32
			aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), mSize);
	//    7   11:aload_1         
	//    8   12:invokevirtual   #217 <Method Class Object.getClass()>
	//    9   15:invokevirtual   #222 <Method Class Class.getComponentType()>
	//   10   18:aload_0         
	//   11   19:getfield        #63  <Field int mSize>
	//   12   22:invokestatic    #228 <Method Object Array.newInstance(Class, int)>
	//   13   25:checkcast       #78  <Class Object[]>
	//   14   28:checkcast       #78  <Class Object[]>
	//   15   31:astore_2        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj1)), 0, mSize);
	//   16   32:aload_0         
	//   17   33:getfield        #58  <Field Object[] mArray>
	//   18   36:iconst_0        
	//   19   37:aload_2         
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #63  <Field int mSize>
	//   23   43:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(aobj1.length > mSize)
	//*  24   46:aload_2         
	//*  25   47:arraylength     
	//*  26   48:aload_0         
	//*  27   49:getfield        #63  <Field int mSize>
	//*  28   52:icmple          62
			aobj1[mSize] = null;
	//   29   55:aload_2         
	//   30   56:aload_0         
	//   31   57:getfield        #63  <Field int mSize>
	//   32   60:aconst_null     
	//   33   61:aastore         
		return aobj1;
	//   34   62:aload_2         
	//   35   63:areturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #233 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "{}";
	//    3    7:ldc1            #235 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 14);
	//    5   10:new             #237 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #63  <Field int mSize>
	//    9   18:bipush          14
	//   10   20:imul            
	//   11   21:invokespecial   #239 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #242 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #63  <Field int mSize>
	//*  22   39:icmpge          87
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #244 <String ", ">
	//   27   49:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = valueAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #136 <Method Object valueAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #250 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Set)");
	//   41   73:aload_2         
	//   42   74:ldc1            #252 <String "(this Set)">
	//   43   76:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
		}

	//   45   80:iload_1         
	//   46   81:iconst_1        
	//   47   82:iadd            
	//   48   83:istore_1        
	//*  49   84:goto            34
		stringbuilder.append('}');
	//   50   87:aload_2         
	//   51   88:bipush          125
	//   52   90:invokevirtual   #242 <Method StringBuilder StringBuilder.append(char)>
	//   53   93:pop             
		return stringbuilder.toString();
	//   54   94:aload_2         
	//   55   95:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   56   98:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[i];
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final int BASE_SIZE = 4;
	private static final int CACHE_SIZE = 10;
	private static final boolean DEBUG = false;
	private static final int INT[] = new int[0];
	private static final Object OBJECT[] = new Object[0];
	private static final String TAG = "ArraySet";
	static Object sBaseCache[];
	static int sBaseCacheSize = 0;
	static Object sTwiceBaseCache[];
	static int sTwiceBaseCacheSize = 0;
	Object mArray[];
	MapCollections mCollections;
	int mHashes[];
	final boolean mIdentityHashCode;
	int mSize;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #42  <Field int[] INT>
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:putstatic       #44  <Field Object[] OBJECT>
	//*   6   13:return          
	}
}
