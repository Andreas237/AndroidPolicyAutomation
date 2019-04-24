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
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #48  <Method void ArraySet(int)>
	//    3    5:return          
	}

	public ArraySet(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            25
		{
			mHashes = INT;
	//    4    8:aload_0         
	//    5    9:getstatic       #41  <Field int[] INT>
	//    6   12:putfield        #52  <Field int[] mHashes>
			mArray = OBJECT;
	//    7   15:aload_0         
	//    8   16:getstatic       #43  <Field Object[] OBJECT>
	//    9   19:putfield        #54  <Field Object[] mArray>
		} else
	//*  10   22:goto            30
		{
			allocArrays(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #57  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #59  <Field int mSize>
	//   17   35:return          
	}

	public ArraySet(ArraySet arrayset)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ArraySet()>
		if(arrayset != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			addAll(arrayset);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method void addAll(ArraySet)>
	//    7   13:return          
	}

	public ArraySet(Collection collection)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ArraySet()>
		if(collection != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
			addAll(collection);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #72  <Method boolean addAll(Collection)>
	//    7   13:pop             
	//    8   14:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_75;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          75
		android/support/v4/util/ArraySet;
	//    3    6:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(sTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_63;
	//    5    9:getstatic       #79  <Field Object[] sTwiceBaseCache>
	//    6   12:ifnull          63
		aobj = sTwiceBaseCache;
	//    7   15:getstatic       #79  <Field Object[] sTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #54  <Field Object[] mArray>
		sTwiceBaseCache = (Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #80  <Class Object[]>
	//   16   30:putstatic       #79  <Field Object[] sTwiceBaseCache>
		mHashes = (int[])aobj[1];
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:iconst_1        
	//   20   36:aaload          
	//   21   37:checkcast       #81  <Class int[]>
	//   22   40:putfield        #52  <Field int[] mHashes>
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
		sTwiceBaseCacheSize--;
	//   31   51:getstatic       #83  <Field int sTwiceBaseCacheSize>
	//   32   54:iconst_1        
	//   33   55:isub            
	//   34   56:putstatic       #83  <Field int sTwiceBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   35   59:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   36   61:monitorexit     
		return;
	//   37   62:return          
		android/support/v4/util/ArraySet;
	//   38   63:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   39   65:monitorexit     
		break MISSING_BLOCK_LABEL_149;
	//   40   66:goto            149
		Exception exception;
		exception;
	//   41   69:astore_2        
		android/support/v4/util/ArraySet;
	//   42   70:ldc1            #2   <Class ArraySet>
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
		android/support/v4/util/ArraySet;
	//   49   80:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   50   82:monitorenter    
		if(sBaseCache == null)
			break MISSING_BLOCK_LABEL_137;
	//   51   83:getstatic       #85  <Field Object[] sBaseCache>
	//   52   86:ifnull          137
		exception = ((Exception) (sBaseCache));
	//   53   89:getstatic       #85  <Field Object[] sBaseCache>
	//   54   92:astore_2        
		mArray = ((Object []) (exception));
	//   55   93:aload_0         
	//   56   94:aload_2         
	//   57   95:putfield        #54  <Field Object[] mArray>
		sBaseCache = (Object[])exception[0];
	//   58   98:aload_2         
	//   59   99:iconst_0        
	//   60  100:aaload          
	//   61  101:checkcast       #80  <Class Object[]>
	//   62  104:putstatic       #85  <Field Object[] sBaseCache>
		mHashes = (int[])exception[1];
	//   63  107:aload_0         
	//   64  108:aload_2         
	//   65  109:iconst_1        
	//   66  110:aaload          
	//   67  111:checkcast       #81  <Class int[]>
	//   68  114:putfield        #52  <Field int[] mHashes>
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
		sBaseCacheSize--;
	//   77  125:getstatic       #87  <Field int sBaseCacheSize>
	//   78  128:iconst_1        
	//   79  129:isub            
	//   80  130:putstatic       #87  <Field int sBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   81  133:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   82  135:monitorexit     
		return;
	//   83  136:return          
		android/support/v4/util/ArraySet;
	//   84  137:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   85  139:monitorexit     
		break MISSING_BLOCK_LABEL_149;
	//   86  140:goto            149
		exception;
	//   87  143:astore_2        
		android/support/v4/util/ArraySet;
	//   88  144:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   89  146:monitorexit     
		throw exception;
	//   90  147:aload_2         
	//   91  148:athrow          
		mHashes = new int[i];
	//   92  149:aload_0         
	//   93  150:iload_1         
	//   94  151:newarray        int[]
	//   95  153:putfield        #52  <Field int[] mHashes>
		mArray = new Object[i];
	//   96  156:aload_0         
	//   97  157:iload_1         
	//   98  158:anewarray       Object[]
	//   99  161:putfield        #54  <Field Object[] mArray>
		return;
	//  100  164:return          
	}

	private static void freeArrays(int ai[], Object aobj[], int i)
	{
		if(ai.length != 8) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:bipush          8
	//    3    4:icmpne          57
_L1:
		android/support/v4/util/ArraySet;
	//    4    7:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(sTwiceBaseCacheSize < 10)
	//*   6   10:getstatic       #83  <Field int sTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          47
		{
			aobj[0] = ((Object) (sTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #79  <Field Object[] sTwiceBaseCache>
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
	//*  21   32:goto            114
_L8:
		sTwiceBaseCache = aobj;
	//   22   35:aload_1         
	//   23   36:putstatic       #79  <Field Object[] sTwiceBaseCache>
		sTwiceBaseCacheSize++;
	//   24   39:getstatic       #83  <Field int sTwiceBaseCacheSize>
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:putstatic       #83  <Field int sTwiceBaseCacheSize>
_L3:
		android/support/v4/util/ArraySet;
	//   28   47:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return;
	//   30   50:return          
		ai;
	//   31   51:astore_0        
		android/support/v4/util/ArraySet;
	//   32   52:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		throw ai;
	//   34   55:aload_0         
	//   35   56:athrow          
_L2:
		if(ai.length != 4) goto _L5; else goto _L4
	//   36   57:aload_0         
	//   37   58:arraylength     
	//   38   59:iconst_4        
	//   39   60:icmpne          113
_L4:
		android/support/v4/util/ArraySet;
	//   40   63:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   41   65:monitorenter    
		if(sBaseCacheSize >= 10) goto _L7; else goto _L6
	//   42   66:getstatic       #87  <Field int sBaseCacheSize>
	//   43   69:bipush          10
	//   44   71:icmpge          103
_L6:
		aobj[0] = ((Object) (sBaseCache));
	//   45   74:aload_1         
	//   46   75:iconst_0        
	//   47   76:getstatic       #85  <Field Object[] sBaseCache>
	//   48   79:aastore         
		aobj[1] = ((Object) (ai));
	//   49   80:aload_1         
	//   50   81:iconst_1        
	//   51   82:aload_0         
	//   52   83:aastore         
		i--;
	//   53   84:iload_2         
	//   54   85:iconst_1        
	//   55   86:isub            
	//   56   87:istore_2        
		break MISSING_BLOCK_LABEL_130;
	//   57   88:goto            130
_L9:
		sBaseCache = aobj;
	//   58   91:aload_1         
	//   59   92:putstatic       #85  <Field Object[] sBaseCache>
		sBaseCacheSize++;
	//   60   95:getstatic       #87  <Field int sBaseCacheSize>
	//   61   98:iconst_1        
	//   62   99:iadd            
	//   63  100:putstatic       #87  <Field int sBaseCacheSize>
_L7:
		android/support/v4/util/ArraySet;
	//   64  103:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   65  105:monitorexit     
		return;
	//   66  106:return          
		ai;
	//   67  107:astore_0        
		android/support/v4/util/ArraySet;
	//   68  108:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   69  110:monitorexit     
		throw ai;
	//   70  111:aload_0         
	//   71  112:athrow          
_L5:
		return;
	//   72  113:return          
		aobj[1] = ((Object) (ai));
		i--;
		while(i >= 2) 
	//*  73  114:iload_2         
	//*  74  115:iconst_2        
	//*  75  116:icmplt          35
		{
			aobj[i] = null;
	//   76  119:aload_1         
	//   77  120:iload_2         
	//   78  121:aconst_null     
	//   79  122:aastore         
			i--;
	//   80  123:iload_2         
	//   81  124:iconst_1        
	//   82  125:isub            
	//   83  126:istore_2        
		}
		  goto _L8
	//*  84  127:goto            114
		while(i >= 2) 
	//*  85  130:iload_2         
	//*  86  131:iconst_2        
	//*  87  132:icmplt          91
		{
			aobj[i] = null;
	//   88  135:aload_1         
	//   89  136:iload_2         
	//   90  137:aconst_null     
	//   91  138:aastore         
			i--;
	//   92  139:iload_2         
	//   93  140:iconst_1        
	//   94  141:isub            
	//   95  142:istore_2        
		}
		  goto _L9
	//*  96  143:goto            130
	}

	private MapCollections getCollection()
	{
		if(mCollections == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field MapCollections mCollections>
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
				//    2    4:invokestatic    #30  <Method Object[] ArraySet.access$100(ArraySet)>
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
				//    2    4:invokestatic    #47  <Method int ArraySet.access$000(ArraySet)>
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
	//    7   13:invokespecial   #95  <Method void ArraySet$1(ArraySet)>
	//    8   16:putfield        #93  <Field MapCollections mCollections>
		return mCollections;
	//    9   19:aload_0         
	//   10   20:getfield        #93  <Field MapCollections mCollections>
	//   11   23:areturn         
	}

	private int indexOf(Object obj, int i)
	{
		int k = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = ContainerHelpers.binarySearch(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #104 <Method int ContainerHelpers.binarySearch(int[], int, int)>
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
	//*  19   35:getfield        #54  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:aaload          
	//*  22   41:invokevirtual   #108 <Method boolean Object.equals(Object)>
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
	//*  34   62:getfield        #52  <Field int[] mHashes>
	//*  35   65:iload_3         
	//*  36   66:iaload          
	//*  37   67:iload_2         
	//*  38   68:icmpne          93
			if(obj.equals(mArray[j]))
	//*  39   71:aload_1         
	//*  40   72:aload_0         
	//*  41   73:getfield        #54  <Field Object[] mArray>
	//*  42   76:iload_3         
	//*  43   77:aaload          
	//*  44   78:invokevirtual   #108 <Method boolean Object.equals(Object)>
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
	//*  60  105:getfield        #52  <Field int[] mHashes>
	//*  61  108:iload           4
	//*  62  110:iaload          
	//*  63  111:iload_2         
	//*  64  112:icmpne          141
			if(obj.equals(mArray[l]))
	//*  65  115:aload_1         
	//*  66  116:aload_0         
	//*  67  117:getfield        #54  <Field Object[] mArray>
	//*  68  120:iload           4
	//*  69  122:aaload          
	//*  70  123:invokevirtual   #108 <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = ContainerHelpers.binarySearch(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #104 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #54  <Field Object[] mArray>
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
	//*  32   48:getfield        #52  <Field int[] mHashes>
	//*  33   51:iload_1         
	//*  34   52:iaload          
	//*  35   53:ifne            74
			if(mArray[i] == null)
	//*  36   56:aload_0         
	//*  37   57:getfield        #54  <Field Object[] mArray>
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
	//*  55   83:getfield        #52  <Field int[] mHashes>
	//*  56   86:iload_2         
	//*  57   87:iaload          
	//*  58   88:ifne            109
			if(mArray[k] == null)
	//*  59   91:aload_0         
	//*  60   92:getfield        #54  <Field Object[] mArray>
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
		int i;
		int l;
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			i = indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokespecial   #113 <Method int indexOfNull()>
	//    4    8:istore_2        
			l = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		} else
	//*   7   11:goto            26
		{
			l = obj.hashCode();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #116 <Method int Object.hashCode()>
	//   10   18:istore_3        
			i = indexOf(obj, l);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:iload_3         
	//   14   22:invokespecial   #118 <Method int indexOf(Object, int)>
	//   15   25:istore_2        
		}
		if(i >= 0)
	//*  16   26:iload_2         
	//*  17   27:iflt            32
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
		int i1 = ~i;
	//   20   32:iload_2         
	//   21   33:iconst_m1       
	//   22   34:ixor            
	//   23   35:istore          4
		if(mSize >= mHashes.length)
	//*  24   37:aload_0         
	//*  25   38:getfield        #59  <Field int mSize>
	//*  26   41:aload_0         
	//*  27   42:getfield        #52  <Field int[] mHashes>
	//*  28   45:arraylength     
	//*  29   46:icmplt          156
		{
			int j1 = mSize;
	//   30   49:aload_0         
	//   31   50:getfield        #59  <Field int mSize>
	//   32   53:istore          5
			int j = 4;
	//   33   55:iconst_4        
	//   34   56:istore_2        
			if(j1 >= 8)
	//*  35   57:iload           5
	//*  36   59:bipush          8
	//*  37   61:icmplt          81
			{
				j = mSize;
	//   38   64:aload_0         
	//   39   65:getfield        #59  <Field int mSize>
	//   40   68:istore_2        
				j = (mSize >> 1) + j;
	//   41   69:aload_0         
	//   42   70:getfield        #59  <Field int mSize>
	//   43   73:iconst_1        
	//   44   74:ishr            
	//   45   75:iload_2         
	//   46   76:iadd            
	//   47   77:istore_2        
			} else
	//*  48   78:goto            92
			if(mSize >= 4)
	//*  49   81:aload_0         
	//*  50   82:getfield        #59  <Field int mSize>
	//*  51   85:iconst_4        
	//*  52   86:icmplt          92
				j = 8;
	//   53   89:bipush          8
	//   54   91:istore_2        
			int ai[] = mHashes;
	//   55   92:aload_0         
	//   56   93:getfield        #52  <Field int[] mHashes>
	//   57   96:astore          6
			Object aobj[] = mArray;
	//   58   98:aload_0         
	//   59   99:getfield        #54  <Field Object[] mArray>
	//   60  102:astore          7
			allocArrays(j);
	//   61  104:aload_0         
	//   62  105:iload_2         
	//   63  106:invokespecial   #57  <Method void allocArrays(int)>
			if(mHashes.length > 0)
	//*  64  109:aload_0         
	//*  65  110:getfield        #52  <Field int[] mHashes>
	//*  66  113:arraylength     
	//*  67  114:ifle            145
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
	//   68  117:aload           6
	//   69  119:iconst_0        
	//   70  120:aload_0         
	//   71  121:getfield        #52  <Field int[] mHashes>
	//   72  124:iconst_0        
	//   73  125:aload           6
	//   74  127:arraylength     
	//   75  128:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   76  131:aload           7
	//   77  133:iconst_0        
	//   78  134:aload_0         
	//   79  135:getfield        #54  <Field Object[] mArray>
	//   80  138:iconst_0        
	//   81  139:aload           7
	//   82  141:arraylength     
	//   83  142:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   84  145:aload           6
	//   85  147:aload           7
	//   86  149:aload_0         
	//   87  150:getfield        #59  <Field int mSize>
	//   88  153:invokestatic    #126 <Method void freeArrays(int[], Object[], int)>
		}
		if(i1 < mSize)
	//*  89  156:iload           4
	//*  90  158:aload_0         
	//*  91  159:getfield        #59  <Field int mSize>
	//*  92  162:icmpge          220
		{
			int ai1[] = mHashes;
	//   93  165:aload_0         
	//   94  166:getfield        #52  <Field int[] mHashes>
	//   95  169:astore          6
			int ai2[] = mHashes;
	//   96  171:aload_0         
	//   97  172:getfield        #52  <Field int[] mHashes>
	//   98  175:astore          7
			int k = i1 + 1;
	//   99  177:iload           4
	//  100  179:iconst_1        
	//  101  180:iadd            
	//  102  181:istore_2        
			System.arraycopy(((Object) (ai1)), i1, ((Object) (ai2)), k, mSize - i1);
	//  103  182:aload           6
	//  104  184:iload           4
	//  105  186:aload           7
	//  106  188:iload_2         
	//  107  189:aload_0         
	//  108  190:getfield        #59  <Field int mSize>
	//  109  193:iload           4
	//  110  195:isub            
	//  111  196:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mArray)), i1, ((Object) (mArray)), k, mSize - i1);
	//  112  199:aload_0         
	//  113  200:getfield        #54  <Field Object[] mArray>
	//  114  203:iload           4
	//  115  205:aload_0         
	//  116  206:getfield        #54  <Field Object[] mArray>
	//  117  209:iload_2         
	//  118  210:aload_0         
	//  119  211:getfield        #59  <Field int mSize>
	//  120  214:iload           4
	//  121  216:isub            
	//  122  217:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mHashes[i1] = l;
	//  123  220:aload_0         
	//  124  221:getfield        #52  <Field int[] mHashes>
	//  125  224:iload           4
	//  126  226:iload_3         
	//  127  227:iastore         
		mArray[i1] = obj;
	//  128  228:aload_0         
	//  129  229:getfield        #54  <Field Object[] mArray>
	//  130  232:iload           4
	//  131  234:aload_1         
	//  132  235:aastore         
		mSize = mSize + 1;
	//  133  236:aload_0         
	//  134  237:aload_0         
	//  135  238:getfield        #59  <Field int mSize>
	//  136  241:iconst_1        
	//  137  242:iadd            
	//  138  243:putfield        #59  <Field int mSize>
		return true;
	//  139  246:iconst_1        
	//  140  247:ireturn         
	}

	public void addAll(ArraySet arrayset)
	{
		int j = arrayset.mSize;
	//    0    0:aload_1         
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:istore_3        
		ensureCapacity(mSize + j);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #59  <Field int mSize>
	//    6   10:iload_3         
	//    7   11:iadd            
	//    8   12:invokevirtual   #131 <Method void ensureCapacity(int)>
		int k = mSize;
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field int mSize>
	//   11   19:istore          4
		int i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		if(k == 0)
	//*  14   23:iload           4
	//*  15   25:ifne            66
		{
			if(j > 0)
	//*  16   28:iload_3         
	//*  17   29:ifle            88
			{
				System.arraycopy(((Object) (arrayset.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   18   32:aload_1         
	//   19   33:getfield        #52  <Field int[] mHashes>
	//   20   36:iconst_0        
	//   21   37:aload_0         
	//   22   38:getfield        #52  <Field int[] mHashes>
	//   23   41:iconst_0        
	//   24   42:iload_3         
	//   25   43:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (arrayset.mArray)), 0, ((Object) (mArray)), 0, j);
	//   26   46:aload_1         
	//   27   47:getfield        #54  <Field Object[] mArray>
	//   28   50:iconst_0        
	//   29   51:aload_0         
	//   30   52:getfield        #54  <Field Object[] mArray>
	//   31   55:iconst_0        
	//   32   56:iload_3         
	//   33   57:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:putfield        #59  <Field int mSize>
				return;
	//   37   65:return          
			}
		} else
		{
			for(; i < j; i++)
	//*  38   66:iload_2         
	//*  39   67:iload_3         
	//*  40   68:icmpge          88
				add(arrayset.valueAt(i));
	//   41   71:aload_0         
	//   42   72:aload_1         
	//   43   73:iload_2         
	//   44   74:invokevirtual   #135 <Method Object valueAt(int)>
	//   45   77:invokevirtual   #137 <Method boolean add(Object)>
	//   46   80:pop             

	//   47   81:iload_2         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:istore_2        
		}
	//*  51   85:goto            66
	//   52   88:return          
	}

	public boolean addAll(Collection collection)
	{
		ensureCapacity(mSize + collection.size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field int mSize>
	//    3    5:aload_1         
	//    4    6:invokeinterface #141 <Method int Collection.size()>
	//    5   11:iadd            
	//    6   12:invokevirtual   #131 <Method void ensureCapacity(int)>
		collection = ((Collection) (collection.iterator()));
	//    7   15:aload_1         
	//    8   16:invokeinterface #145 <Method Iterator Collection.iterator()>
	//    9   21:astore_1        
		boolean flag;
		for(flag = false; ((Iterator) (collection)).hasNext(); flag |= add(((Iterator) (collection)).next()));
	//   10   22:iconst_0        
	//   11   23:istore_2        
	//   12   24:aload_1         
	//   13   25:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            49
	//   15   33:iload_2         
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokeinterface #155 <Method Object Iterator.next()>
	//   19   41:invokevirtual   #137 <Method boolean add(Object)>
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
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:istore_3        
		int i;
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            19
			i = obj.hashCode();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #116 <Method int Object.hashCode()>
	//   10   18:istore_2        
		if(j >= mHashes.length)
	//*  11   19:iload_3         
	//*  12   20:aload_0         
	//*  13   21:getfield        #52  <Field int[] mHashes>
	//*  14   24:arraylength     
	//*  15   25:icmplt          38
			throw new IllegalStateException("Array is full");
	//   16   28:new             #164 <Class IllegalStateException>
	//   17   31:dup             
	//   18   32:ldc1            #166 <String "Array is full">
	//   19   34:invokespecial   #169 <Method void IllegalStateException(String)>
	//   20   37:athrow          
		if(j > 0 && mHashes[j - 1] > i)
	//*  21   38:iload_3         
	//*  22   39:ifle            61
	//*  23   42:aload_0         
	//*  24   43:getfield        #52  <Field int[] mHashes>
	//*  25   46:iload_3         
	//*  26   47:iconst_1        
	//*  27   48:isub            
	//*  28   49:iaload          
	//*  29   50:iload_2         
	//*  30   51:icmple          61
		{
			add(obj);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:invokevirtual   #137 <Method boolean add(Object)>
	//   34   59:pop             
			return;
	//   35   60:return          
		} else
		{
			mSize = j + 1;
	//   36   61:aload_0         
	//   37   62:iload_3         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:putfield        #59  <Field int mSize>
			mHashes[j] = i;
	//   41   68:aload_0         
	//   42   69:getfield        #52  <Field int[] mHashes>
	//   43   72:iload_3         
	//   44   73:iload_2         
	//   45   74:iastore         
			mArray[j] = obj;
	//   46   75:aload_0         
	//   47   76:getfield        #54  <Field Object[] mArray>
	//   48   79:iload_3         
	//   49   80:aload_1         
	//   50   81:aastore         
			return;
	//   51   82:return          
		}
	}

	public void clear()
	{
		if(mSize != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int mSize>
	//*   2    4:ifeq            41
		{
			freeArrays(mHashes, mArray, mSize);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field int[] mHashes>
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field Object[] mArray>
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field int mSize>
	//    9   19:invokestatic    #126 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   10   22:aload_0         
	//   11   23:getstatic       #41  <Field int[] INT>
	//   12   26:putfield        #52  <Field int[] mHashes>
			mArray = OBJECT;
	//   13   29:aload_0         
	//   14   30:getstatic       #43  <Field Object[] OBJECT>
	//   15   33:putfield        #54  <Field Object[] mArray>
			mSize = 0;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #59  <Field int mSize>
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
	//*   1    1:invokeinterface #145 <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            31
			if(!contains(((Iterator) (collection)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #155 <Method Object Iterator.next()>
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
	//*   1    1:getfield        #52  <Field int[] mHashes>
	//*   2    4:arraylength     
	//*   3    5:iload_1         
	//*   4    6:icmpge          68
		{
			int ai[] = mHashes;
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field int[] mHashes>
	//    7   13:astore_2        
			Object aobj[] = mArray;
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field Object[] mArray>
	//   10   18:astore_3        
			allocArrays(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokespecial   #57  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  14   24:aload_0         
	//*  15   25:getfield        #59  <Field int mSize>
	//*  16   28:ifle            59
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, mSize);
	//   17   31:aload_2         
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #52  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #59  <Field int mSize>
	//   24   42:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize);
	//   25   45:aload_3         
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #54  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:aload_0         
	//   31   53:getfield        #59  <Field int mSize>
	//   32   56:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:aload_0         
	//   36   62:getfield        #59  <Field int mSize>
	//   37   65:invokestatic    #126 <Method void freeArrays(int[], Object[], int)>
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
	//*   7   11:ifeq            71
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
	//   22   38:getfield        #59  <Field int mSize>
	//   23   41:icmpge          69
					flag = ((Set) (obj)).contains(valueAt(i));
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #135 <Method Object valueAt(int)>
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
	//*  39   69:iconst_1        
	//*  40   70:ireturn         
	//*  41   71:iconst_0        
	//*  42   72:ireturn         
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  43   73:astore_1        
				{
					return false;
	//   44   74:iconst_0        
	//   45   75:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  46   76:astore_1        
				{
					return false;
	//   47   77:iconst_0        
	//   48   78:ireturn         
				}
				if(!flag)
					return false;
				i++;
			} while(true);
			return true;
		} else
		{
			return false;
		}
	}

	public int hashCode()
	{
		int ai[] = mHashes;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int[] mHashes>
	//    2    4:astore          4
		int k = mSize;
	//    3    6:aload_0         
	//    4    7:getfield        #59  <Field int mSize>
	//    5   10:istore_3        
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		int j = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		for(; i < k; i++)
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
	//    3    5:invokespecial   #113 <Method int indexOfNull()>
	//    4    8:ireturn         
		else
			return indexOf(obj, obj.hashCode());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #116 <Method int Object.hashCode()>
	//    9   15:invokespecial   #118 <Method int indexOf(Object, int)>
	//   10   18:ireturn         
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mSize>
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
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:istore_3        
		int k = mSize;
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int mSize>
	//    5    9:istore          4
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          5
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          38
			remove(arrayset.valueAt(i));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:invokevirtual   #135 <Method Object valueAt(int)>
	//   17   27:invokevirtual   #206 <Method boolean remove(Object)>
	//   18   30:pop             

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            16
		if(k != mSize)
	//*  24   38:iload           4
	//*  25   40:aload_0         
	//*  26   41:getfield        #59  <Field int mSize>
	//*  27   44:icmpeq          50
			flag = true;
	//   28   47:iconst_1        
	//   29   48:istore          5
		return flag;
	//   30   50:iload           5
	//   31   52:ireturn         
	}

	public boolean removeAll(Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #145 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
		boolean flag;
		for(flag = false; ((Iterator) (collection)).hasNext(); flag |= remove(((Iterator) (collection)).next()));
	//    3    7:iconst_0        
	//    4    8:istore_2        
	//    5    9:aload_1         
	//    6   10:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            34
	//    8   18:iload_2         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #155 <Method Object Iterator.next()>
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
	//    1    1:getfield        #54  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_3        
		if(mSize <= 1)
	//*   5    7:aload_0         
	//*   6    8:getfield        #59  <Field int mSize>
	//*   7   11:iconst_1        
	//*   8   12:icmpgt          51
		{
			freeArrays(mHashes, mArray, mSize);
	//    9   15:aload_0         
	//   10   16:getfield        #52  <Field int[] mHashes>
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field Object[] mArray>
	//   13   23:aload_0         
	//   14   24:getfield        #59  <Field int mSize>
	//   15   27:invokestatic    #126 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   16   30:aload_0         
	//   17   31:getstatic       #41  <Field int[] INT>
	//   18   34:putfield        #52  <Field int[] mHashes>
			mArray = OBJECT;
	//   19   37:aload_0         
	//   20   38:getstatic       #43  <Field Object[] OBJECT>
	//   21   41:putfield        #54  <Field Object[] mArray>
			mSize = 0;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #59  <Field int mSize>
			return obj;
	//   25   49:aload_3         
	//   26   50:areturn         
		}
		int ai[] = mHashes;
	//   27   51:aload_0         
	//   28   52:getfield        #52  <Field int[] mHashes>
	//   29   55:astore          4
		int j = 8;
	//   30   57:bipush          8
	//   31   59:istore_2        
		if(ai.length > 8 && mSize < mHashes.length / 3)
	//*  32   60:aload           4
	//*  33   62:arraylength     
	//*  34   63:bipush          8
	//*  35   65:icmple          208
	//*  36   68:aload_0         
	//*  37   69:getfield        #59  <Field int mSize>
	//*  38   72:aload_0         
	//*  39   73:getfield        #52  <Field int[] mHashes>
	//*  40   76:arraylength     
	//*  41   77:iconst_3        
	//*  42   78:idiv            
	//*  43   79:icmpge          208
		{
			if(mSize > 8)
	//*  44   82:aload_0         
	//*  45   83:getfield        #59  <Field int mSize>
	//*  46   86:bipush          8
	//*  47   88:icmple          105
			{
				j = mSize;
	//   48   91:aload_0         
	//   49   92:getfield        #59  <Field int mSize>
	//   50   95:istore_2        
				j = (mSize >> 1) + j;
	//   51   96:aload_0         
	//   52   97:getfield        #59  <Field int mSize>
	//   53  100:iconst_1        
	//   54  101:ishr            
	//   55  102:iload_2         
	//   56  103:iadd            
	//   57  104:istore_2        
			}
			int ai1[] = mHashes;
	//   58  105:aload_0         
	//   59  106:getfield        #52  <Field int[] mHashes>
	//   60  109:astore          4
			Object aobj[] = mArray;
	//   61  111:aload_0         
	//   62  112:getfield        #54  <Field Object[] mArray>
	//   63  115:astore          5
			allocArrays(j);
	//   64  117:aload_0         
	//   65  118:iload_2         
	//   66  119:invokespecial   #57  <Method void allocArrays(int)>
			mSize = mSize - 1;
	//   67  122:aload_0         
	//   68  123:aload_0         
	//   69  124:getfield        #59  <Field int mSize>
	//   70  127:iconst_1        
	//   71  128:isub            
	//   72  129:putfield        #59  <Field int mSize>
			if(i > 0)
	//*  73  132:iload_1         
	//*  74  133:ifle            160
			{
				System.arraycopy(((Object) (ai1)), 0, ((Object) (mHashes)), 0, i);
	//   75  136:aload           4
	//   76  138:iconst_0        
	//   77  139:aload_0         
	//   78  140:getfield        #52  <Field int[] mHashes>
	//   79  143:iconst_0        
	//   80  144:iload_1         
	//   81  145:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i);
	//   82  148:aload           5
	//   83  150:iconst_0        
	//   84  151:aload_0         
	//   85  152:getfield        #54  <Field Object[] mArray>
	//   86  155:iconst_0        
	//   87  156:iload_1         
	//   88  157:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			if(i < mSize)
	//*  89  160:iload_1         
	//*  90  161:aload_0         
	//*  91  162:getfield        #59  <Field int mSize>
	//*  92  165:icmpge          282
			{
				int k = i + 1;
	//   93  168:iload_1         
	//   94  169:iconst_1        
	//   95  170:iadd            
	//   96  171:istore_2        
				System.arraycopy(((Object) (ai1)), k, ((Object) (mHashes)), i, mSize - i);
	//   97  172:aload           4
	//   98  174:iload_2         
	//   99  175:aload_0         
	//  100  176:getfield        #52  <Field int[] mHashes>
	//  101  179:iload_1         
	//  102  180:aload_0         
	//  103  181:getfield        #59  <Field int mSize>
	//  104  184:iload_1         
	//  105  185:isub            
	//  106  186:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), k, ((Object) (mArray)), i, mSize - i);
	//  107  189:aload           5
	//  108  191:iload_2         
	//  109  192:aload_0         
	//  110  193:getfield        #54  <Field Object[] mArray>
	//  111  196:iload_1         
	//  112  197:aload_0         
	//  113  198:getfield        #59  <Field int mSize>
	//  114  201:iload_1         
	//  115  202:isub            
	//  116  203:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				return obj;
	//  117  206:aload_3         
	//  118  207:areturn         
			}
		} else
		{
			mSize = mSize - 1;
	//  119  208:aload_0         
	//  120  209:aload_0         
	//  121  210:getfield        #59  <Field int mSize>
	//  122  213:iconst_1        
	//  123  214:isub            
	//  124  215:putfield        #59  <Field int mSize>
			if(i < mSize)
	//* 125  218:iload_1         
	//* 126  219:aload_0         
	//* 127  220:getfield        #59  <Field int mSize>
	//* 128  223:icmpge          272
			{
				int ai2[] = mHashes;
	//  129  226:aload_0         
	//  130  227:getfield        #52  <Field int[] mHashes>
	//  131  230:astore          4
				int l = i + 1;
	//  132  232:iload_1         
	//  133  233:iconst_1        
	//  134  234:iadd            
	//  135  235:istore_2        
				System.arraycopy(((Object) (ai2)), l, ((Object) (mHashes)), i, mSize - i);
	//  136  236:aload           4
	//  137  238:iload_2         
	//  138  239:aload_0         
	//  139  240:getfield        #52  <Field int[] mHashes>
	//  140  243:iload_1         
	//  141  244:aload_0         
	//  142  245:getfield        #59  <Field int mSize>
	//  143  248:iload_1         
	//  144  249:isub            
	//  145  250:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mArray)), l, ((Object) (mArray)), i, mSize - i);
	//  146  253:aload_0         
	//  147  254:getfield        #54  <Field Object[] mArray>
	//  148  257:iload_2         
	//  149  258:aload_0         
	//  150  259:getfield        #54  <Field Object[] mArray>
	//  151  262:iload_1         
	//  152  263:aload_0         
	//  153  264:getfield        #59  <Field int mSize>
	//  154  267:iload_1         
	//  155  268:isub            
	//  156  269:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mArray[mSize] = null;
	//  157  272:aload_0         
	//  158  273:getfield        #54  <Field Object[] mArray>
	//  159  276:aload_0         
	//  160  277:getfield        #59  <Field int mSize>
	//  161  280:aconst_null     
	//  162  281:aastore         
		}
		return obj;
	//  163  282:aload_3         
	//  164  283:areturn         
	}

	public boolean retainAll(Collection collection)
	{
		int i = mSize - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_2        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		for(; i >= 0; i--)
	//*   7    9:iload_2         
	//*   8   10:iflt            43
			if(!collection.contains(mArray[i]))
	//*   9   13:aload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #54  <Field Object[] mArray>
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
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:ireturn         
	}

	public Object[] toArray()
	{
		Object aobj[] = new Object[mSize];
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:anewarray       Object[]
	//    3    7:astore_1        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj)), 0, mSize);
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field Object[] mArray>
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field int mSize>
	//   11   19:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//*   5    5:getfield        #59  <Field int mSize>
	//*   6    8:icmpge          29
			aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), mSize);
	//    7   11:aload_1         
	//    8   12:invokevirtual   #217 <Method Class Object.getClass()>
	//    9   15:invokevirtual   #222 <Method Class Class.getComponentType()>
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field int mSize>
	//   12   22:invokestatic    #228 <Method Object Array.newInstance(Class, int)>
	//   13   25:checkcast       #80  <Class Object[]>
	//   14   28:astore_2        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj1)), 0, mSize);
	//   15   29:aload_0         
	//   16   30:getfield        #54  <Field Object[] mArray>
	//   17   33:iconst_0        
	//   18   34:aload_2         
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:getfield        #59  <Field int mSize>
	//   22   40:invokestatic    #124 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(aobj1.length > mSize)
	//*  23   43:aload_2         
	//*  24   44:arraylength     
	//*  25   45:aload_0         
	//*  26   46:getfield        #59  <Field int mSize>
	//*  27   49:icmple          59
			aobj1[mSize] = null;
	//   28   52:aload_2         
	//   29   53:aload_0         
	//   30   54:getfield        #59  <Field int mSize>
	//   31   57:aconst_null     
	//   32   58:aastore         
		return aobj1;
	//   33   59:aload_2         
	//   34   60:areturn         
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
	//    8   15:getfield        #59  <Field int mSize>
	//    9   18:bipush          14
	//   10   20:imul            
	//   11   21:invokespecial   #238 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #241 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #59  <Field int mSize>
	//*  22   39:icmpge          87
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #243 <String ", ">
	//   27   49:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = valueAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #135 <Method Object valueAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #249 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Set)");
	//   41   73:aload_2         
	//   42   74:ldc1            #251 <String "(this Set)">
	//   43   76:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
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
	//   52   90:invokevirtual   #241 <Method StringBuilder StringBuilder.append(char)>
	//   53   93:pop             
		return stringbuilder.toString();
	//   54   94:aload_2         
	//   55   95:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   56   98:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[i];
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object[] mArray>
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
	private static Object sBaseCache[];
	private static int sBaseCacheSize;
	private static Object sTwiceBaseCache[];
	private static int sTwiceBaseCacheSize;
	private Object mArray[];
	private MapCollections mCollections;
	private int mHashes[];
	private int mSize;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #41  <Field int[] INT>
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:putstatic       #43  <Field Object[] OBJECT>
	//*   6   13:return          
	}


/*
	static int access$000(ArraySet arrayset)
	{
		return arrayset.mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mSize>
	//    2    4:ireturn         
	}

*/


/*
	static Object[] access$100(ArraySet arrayset)
	{
		return arrayset.mArray;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object[] mArray>
	//    2    4:areturn         
	}

*/
}
