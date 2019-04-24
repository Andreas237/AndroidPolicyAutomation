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
	//*   6   10:ifne            33
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
	//*  13   27:aload_0         
	//*  14   28:iconst_0        
	//*  15   29:putfield        #60  <Field int mSize>
	//*  16   32:return          
		{
			allocArrays(i);
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:invokespecial   #63  <Method void allocArrays(int)>
		}
		mSize = 0;
	//*  20   38:goto            27
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
		if(i != 8) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          94
_L1:
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
_L4:
		mHashes = new int[i];
	//   42   72:aload_0         
	//   43   73:iload_1         
	//   44   74:newarray        int[]
	//   45   76:putfield        #56  <Field int[] mHashes>
		mArray = new Object[i];
	//   46   79:aload_0         
	//   47   80:iload_1         
	//   48   81:anewarray       Object[]
	//   49   84:putfield        #58  <Field Object[] mArray>
		return;
	//   50   87:return          
		Exception exception;
		exception;
	//   51   88:astore_2        
		android/support/v4/util/ArraySet;
	//   52   89:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   53   91:monitorexit     
		throw exception;
	//   54   92:aload_2         
	//   55   93:athrow          
_L2:
		if(i != 4) goto _L4; else goto _L3
	//   56   94:iload_1         
	//   57   95:iconst_4        
	//   58   96:icmpne          72
_L3:
		android/support/v4/util/ArraySet;
	//   59   99:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   60  101:monitorenter    
		if(sBaseCache == null)
			break MISSING_BLOCK_LABEL_168;
	//   61  102:getstatic       #83  <Field Object[] sBaseCache>
	//   62  105:ifnull          168
		exception = ((Exception) (sBaseCache));
	//   63  108:getstatic       #83  <Field Object[] sBaseCache>
	//   64  111:astore_2        
		mArray = ((Object []) (exception));
	//   65  112:aload_0         
	//   66  113:aload_2         
	//   67  114:putfield        #58  <Field Object[] mArray>
		sBaseCache = (Object[])(Object[])exception[0];
	//   68  117:aload_2         
	//   69  118:iconst_0        
	//   70  119:aaload          
	//   71  120:checkcast       #78  <Class Object[]>
	//   72  123:checkcast       #78  <Class Object[]>
	//   73  126:putstatic       #83  <Field Object[] sBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   74  129:aload_0         
	//   75  130:aload_2         
	//   76  131:iconst_1        
	//   77  132:aaload          
	//   78  133:checkcast       #79  <Class int[]>
	//   79  136:checkcast       #79  <Class int[]>
	//   80  139:putfield        #56  <Field int[] mHashes>
		exception[1] = null;
	//   81  142:aload_2         
	//   82  143:iconst_1        
	//   83  144:aconst_null     
	//   84  145:aastore         
		exception[0] = null;
	//   85  146:aload_2         
	//   86  147:iconst_0        
	//   87  148:aconst_null     
	//   88  149:aastore         
		sBaseCacheSize--;
	//   89  150:getstatic       #85  <Field int sBaseCacheSize>
	//   90  153:iconst_1        
	//   91  154:isub            
	//   92  155:putstatic       #85  <Field int sBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   93  158:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   94  160:monitorexit     
		return;
	//   95  161:return          
		exception;
	//   96  162:astore_2        
		android/support/v4/util/ArraySet;
	//   97  163:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   98  165:monitorexit     
		throw exception;
	//   99  166:aload_2         
	//  100  167:athrow          
		android/support/v4/util/ArraySet;
	//  101  168:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//  102  170:monitorexit     
		  goto _L4
	//* 103  171:goto            72
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
	//*  21   32:goto            113
_L8:
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
	//   39   60:icmpne          129
_L4:
		android/support/v4/util/ArraySet;
	//   40   63:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   41   65:monitorenter    
		if(sBaseCacheSize >= 10) goto _L7; else goto _L6
	//   42   66:getstatic       #85  <Field int sBaseCacheSize>
	//   43   69:bipush          10
	//   44   71:icmpge          103
_L6:
		aobj[0] = ((Object) (sBaseCache));
	//   45   74:aload_1         
	//   46   75:iconst_0        
	//   47   76:getstatic       #83  <Field Object[] sBaseCache>
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
	//   59   92:putstatic       #83  <Field Object[] sBaseCache>
		sBaseCacheSize++;
	//   60   95:getstatic       #85  <Field int sBaseCacheSize>
	//   61   98:iconst_1        
	//   62   99:iadd            
	//   63  100:putstatic       #85  <Field int sBaseCacheSize>
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
		aobj[1] = ((Object) (ai));
		i--;
		while(i >= 2) 
	//*  72  113:iload_2         
	//*  73  114:iconst_2        
	//*  74  115:icmplt          35
		{
			aobj[i] = null;
	//   75  118:aload_1         
	//   76  119:iload_2         
	//   77  120:aconst_null     
	//   78  121:aastore         
			i--;
	//   79  122:iload_2         
	//   80  123:iconst_1        
	//   81  124:isub            
	//   82  125:istore_2        
		}
		  goto _L8
	//*  83  126:goto            113
_L5:
		return;
	//   84  129:return          
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
		int i1 = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
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
		int k = ContainerHelpers.binarySearch(mHashes, i1, i);
	//    9   15:aload_0         
	//   10   16:getfield        #56  <Field int[] mHashes>
	//   11   19:iload           6
	//   12   21:iload_2         
	//   13   22:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
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
			if(!obj.equals(mArray[k]))
	//*  21   38:aload_1         
	//*  22   39:aload_0         
	//*  23   40:getfield        #58  <Field Object[] mArray>
	//*  24   43:iload           4
	//*  25   45:aaload          
	//*  26   46:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//*  27   49:ifne            13
			{
				for(l = k + 1; l < i1 && mHashes[l] == i; l++)
	//*  28   52:iload           4
	//*  29   54:iconst_1        
	//*  30   55:iadd            
	//*  31   56:istore          5
	//*  32   58:iload           5
	//*  33   60:iload           6
	//*  34   62:icmpge          102
	//*  35   65:aload_0         
	//*  36   66:getfield        #56  <Field int[] mHashes>
	//*  37   69:iload           5
	//*  38   71:iaload          
	//*  39   72:iload_2         
	//*  40   73:icmpne          102
					if(obj.equals(mArray[l]))
	//*  41   76:aload_1         
	//*  42   77:aload_0         
	//*  43   78:getfield        #58  <Field Object[] mArray>
	//*  44   81:iload           5
	//*  45   83:aaload          
	//*  46   84:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//*  47   87:ifeq            93
						return l;
	//   48   90:iload           5
	//   49   92:ireturn         

	//   50   93:iload           5
	//   51   95:iconst_1        
	//   52   96:iadd            
	//   53   97:istore          5
	//*  54   99:goto            58
				k--;
	//   55  102:iload           4
	//   56  104:iconst_1        
	//   57  105:isub            
	//   58  106:istore          4
label0:
				do
				{
label1:
					{
						if(k < 0 || mHashes[k] != i)
							break label1;
	//   59  108:iload           4
	//   60  110:iflt            150
	//   61  113:aload_0         
	//   62  114:getfield        #56  <Field int[] mHashes>
	//   63  117:iload           4
	//   64  119:iaload          
	//   65  120:iload_2         
	//   66  121:icmpne          150
						j = k;
	//   67  124:iload           4
	//   68  126:istore_3        
						if(obj.equals(mArray[k]))
							break label0;
	//   69  127:aload_1         
	//   70  128:aload_0         
	//   71  129:getfield        #58  <Field Object[] mArray>
	//   72  132:iload           4
	//   73  134:aaload          
	//   74  135:invokevirtual   #106 <Method boolean Object.equals(Object)>
	//   75  138:ifne            13
						k--;
	//   76  141:iload           4
	//   77  143:iconst_1        
	//   78  144:isub            
	//   79  145:istore          4
					}
				} while(true);
	//   80  147:goto            108
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
		return ~l;
	//   81  150:iload           5
	//   82  152:iconst_m1       
	//   83  153:ixor            
	//   84  154:ireturn         
	}

	private int indexOfNull()
	{
		int l = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
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
		int j = ContainerHelpers.binarySearch(mHashes, l, 0);
	//    9   15:aload_0         
	//   10   16:getfield        #56  <Field int[] mHashes>
	//   11   19:iload           4
	//   12   21:iconst_0        
	//   13   22:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
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
			if(mArray[j] != null)
	//*  21   34:aload_0         
	//*  22   35:getfield        #58  <Field Object[] mArray>
	//*  23   38:iload_2         
	//*  24   39:aaload          
	//*  25   40:ifnull          13
			{
				for(k = j + 1; k < l && mHashes[k] == 0; k++)
	//*  26   43:iload_2         
	//*  27   44:iconst_1        
	//*  28   45:iadd            
	//*  29   46:istore_3        
	//*  30   47:iload_3         
	//*  31   48:iload           4
	//*  32   50:icmpge          80
	//*  33   53:aload_0         
	//*  34   54:getfield        #56  <Field int[] mHashes>
	//*  35   57:iload_3         
	//*  36   58:iaload          
	//*  37   59:ifne            80
					if(mArray[k] == null)
	//*  38   62:aload_0         
	//*  39   63:getfield        #58  <Field Object[] mArray>
	//*  40   66:iload_3         
	//*  41   67:aaload          
	//*  42   68:ifnonnull       73
						return k;
	//   43   71:iload_3         
	//   44   72:ireturn         

	//   45   73:iload_3         
	//   46   74:iconst_1        
	//   47   75:iadd            
	//   48   76:istore_3        
	//*  49   77:goto            47
				j--;
	//   50   80:iload_2         
	//   51   81:iconst_1        
	//   52   82:isub            
	//   53   83:istore_2        
label0:
				do
				{
label1:
					{
						if(j < 0 || mHashes[j] != 0)
							break label1;
	//   54   84:iload_2         
	//   55   85:iflt            115
	//   56   88:aload_0         
	//   57   89:getfield        #56  <Field int[] mHashes>
	//   58   92:iload_2         
	//   59   93:iaload          
	//   60   94:ifne            115
						i = j;
	//   61   97:iload_2         
	//   62   98:istore_1        
						if(mArray[j] == null)
							break label0;
	//   63   99:aload_0         
	//   64  100:getfield        #58  <Field Object[] mArray>
	//   65  103:iload_2         
	//   66  104:aaload          
	//   67  105:ifnull          13
						j--;
	//   68  108:iload_2         
	//   69  109:iconst_1        
	//   70  110:isub            
	//   71  111:istore_2        
					}
				} while(true);
	//   72  112:goto            84
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
		return ~k;
	//   73  115:iload_3         
	//   74  116:iconst_m1       
	//   75  117:ixor            
	//   76  118:ireturn         
	}

	public boolean add(Object obj)
	{
		int k;
		int l;
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			l = indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokespecial   #111 <Method int indexOfNull()>
	//    4    8:istore          4
			k = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		} else
	//*   7   12:iload           4
	//*   8   14:iflt            52
	//*   9   17:iconst_0        
	//*  10   18:ireturn         
		{
			int i;
			if(mIdentityHashCode)
	//*  11   19:aload_0         
	//*  12   20:getfield        #54  <Field boolean mIdentityHashCode>
	//*  13   23:ifeq            44
				i = System.identityHashCode(obj);
	//   14   26:aload_1         
	//   15   27:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   16   30:istore_2        
			else
	//*  17   31:aload_0         
	//*  18   32:aload_1         
	//*  19   33:iload_2         
	//*  20   34:invokespecial   #119 <Method int indexOf(Object, int)>
	//*  21   37:istore          4
	//*  22   39:iload_2         
	//*  23   40:istore_3        
	//*  24   41:goto            12
				i = obj.hashCode();
	//   25   44:aload_1         
	//   26   45:invokevirtual   #122 <Method int Object.hashCode()>
	//   27   48:istore_2        
			l = indexOf(obj, i);
			k = i;
		}
		if(l >= 0)
			return false;
	//*  28   49:goto            31
		l = ~l;
	//   29   52:iload           4
	//   30   54:iconst_m1       
	//   31   55:ixor            
	//   32   56:istore          4
		if(mSize >= mHashes.length)
	//*  33   58:aload_0         
	//*  34   59:getfield        #60  <Field int mSize>
	//*  35   62:aload_0         
	//*  36   63:getfield        #56  <Field int[] mHashes>
	//*  37   66:arraylength     
	//*  38   67:icmplt          155
		{
			int j;
			int ai[];
			Object aobj[];
			if(mSize >= 8)
	//*  39   70:aload_0         
	//*  40   71:getfield        #60  <Field int mSize>
	//*  41   74:bipush          8
	//*  42   76:icmplt          240
				j = mSize + (mSize >> 1);
	//   43   79:aload_0         
	//   44   80:getfield        #60  <Field int mSize>
	//   45   83:aload_0         
	//   46   84:getfield        #60  <Field int mSize>
	//   47   87:iconst_1        
	//   48   88:ishr            
	//   49   89:iadd            
	//   50   90:istore_2        
			else
	//*  51   91:aload_0         
	//*  52   92:getfield        #56  <Field int[] mHashes>
	//*  53   95:astore          5
	//*  54   97:aload_0         
	//*  55   98:getfield        #58  <Field Object[] mArray>
	//*  56  101:astore          6
	//*  57  103:aload_0         
	//*  58  104:iload_2         
	//*  59  105:invokespecial   #63  <Method void allocArrays(int)>
	//*  60  108:aload_0         
	//*  61  109:getfield        #56  <Field int[] mHashes>
	//*  62  112:arraylength     
	//*  63  113:ifle            144
	//*  64  116:aload           5
	//*  65  118:iconst_0        
	//*  66  119:aload_0         
	//*  67  120:getfield        #56  <Field int[] mHashes>
	//*  68  123:iconst_0        
	//*  69  124:aload           5
	//*  70  126:arraylength     
	//*  71  127:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  72  130:aload           6
	//*  73  132:iconst_0        
	//*  74  133:aload_0         
	//*  75  134:getfield        #58  <Field Object[] mArray>
	//*  76  137:iconst_0        
	//*  77  138:aload           6
	//*  78  140:arraylength     
	//*  79  141:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  80  144:aload           5
	//*  81  146:aload           6
	//*  82  148:aload_0         
	//*  83  149:getfield        #60  <Field int mSize>
	//*  84  152:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
	//*  85  155:iload           4
	//*  86  157:aload_0         
	//*  87  158:getfield        #60  <Field int mSize>
	//*  88  161:icmpge          212
	//*  89  164:aload_0         
	//*  90  165:getfield        #56  <Field int[] mHashes>
	//*  91  168:iload           4
	//*  92  170:aload_0         
	//*  93  171:getfield        #56  <Field int[] mHashes>
	//*  94  174:iload           4
	//*  95  176:iconst_1        
	//*  96  177:iadd            
	//*  97  178:aload_0         
	//*  98  179:getfield        #60  <Field int mSize>
	//*  99  182:iload           4
	//* 100  184:isub            
	//* 101  185:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 102  188:aload_0         
	//* 103  189:getfield        #58  <Field Object[] mArray>
	//* 104  192:iload           4
	//* 105  194:aload_0         
	//* 106  195:getfield        #58  <Field Object[] mArray>
	//* 107  198:iload           4
	//* 108  200:iconst_1        
	//* 109  201:iadd            
	//* 110  202:aload_0         
	//* 111  203:getfield        #60  <Field int mSize>
	//* 112  206:iload           4
	//* 113  208:isub            
	//* 114  209:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 115  212:aload_0         
	//* 116  213:getfield        #56  <Field int[] mHashes>
	//* 117  216:iload           4
	//* 118  218:iload_3         
	//* 119  219:iastore         
	//* 120  220:aload_0         
	//* 121  221:getfield        #58  <Field Object[] mArray>
	//* 122  224:iload           4
	//* 123  226:aload_1         
	//* 124  227:aastore         
	//* 125  228:aload_0         
	//* 126  229:aload_0         
	//* 127  230:getfield        #60  <Field int mSize>
	//* 128  233:iconst_1        
	//* 129  234:iadd            
	//* 130  235:putfield        #60  <Field int mSize>
	//* 131  238:iconst_1        
	//* 132  239:ireturn         
			if(mSize >= 4)
	//* 133  240:aload_0         
	//* 134  241:getfield        #60  <Field int mSize>
	//* 135  244:iconst_4        
	//* 136  245:icmplt          254
				j = 8;
	//  137  248:bipush          8
	//  138  250:istore_2        
			else
	//* 139  251:goto            91
				j = 4;
	//  140  254:iconst_4        
	//  141  255:istore_2        
			ai = mHashes;
			aobj = mArray;
			allocArrays(j);
			if(mHashes.length > 0)
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, ai.length);
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
			}
			freeArrays(ai, aobj, mSize);
		}
		if(l < mSize)
		{
			System.arraycopy(((Object) (mHashes)), l, ((Object) (mHashes)), l + 1, mSize - l);
			System.arraycopy(((Object) (mArray)), l, ((Object) (mArray)), l + 1, mSize - l);
		}
		mHashes[l] = k;
		mArray[l] = obj;
		mSize = mSize + 1;
		return true;
	//* 142  256:goto            91
	}

	public void addAll(ArraySet arrayset)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = arrayset.mSize;
	//    2    2:aload_1         
	//    3    3:getfield        #60  <Field int mSize>
	//    4    6:istore_3        
		ensureCapacity(mSize + j);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #60  <Field int mSize>
	//    8   12:iload_3         
	//    9   13:iadd            
	//   10   14:invokevirtual   #132 <Method void ensureCapacity(int)>
		if(mSize == 0)
	//*  11   17:aload_0         
	//*  12   18:getfield        #60  <Field int mSize>
	//*  13   21:ifne            62
		{
			if(j > 0)
	//*  14   24:iload_3         
	//*  15   25:ifle            61
			{
				System.arraycopy(((Object) (arrayset.mHashes)), 0, ((Object) (mHashes)), 0, j);
	//   16   28:aload_1         
	//   17   29:getfield        #56  <Field int[] mHashes>
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #56  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:iload_3         
	//   23   39:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (arrayset.mArray)), 0, ((Object) (mArray)), 0, j);
	//   24   42:aload_1         
	//   25   43:getfield        #58  <Field Object[] mArray>
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #58  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:iload_3         
	//   31   53:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				mSize = j;
	//   32   56:aload_0         
	//   33   57:iload_3         
	//   34   58:putfield        #60  <Field int mSize>
			}
		} else
	//*  35   61:return          
		{
			while(i < j) 
	//*  36   62:iload_2         
	//*  37   63:iload_3         
	//*  38   64:icmpge          61
			{
				add(arrayset.valueAt(i));
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:iload_2         
	//   42   70:invokevirtual   #136 <Method Object valueAt(int)>
	//   43   73:invokevirtual   #138 <Method boolean add(Object)>
	//   44   76:pop             
				i++;
	//   45   77:iload_2         
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore_2        
			}
		}
	//*  49   81:goto            62
	}

	public boolean addAll(Collection collection)
	{
		ensureCapacity(mSize + collection.size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field int mSize>
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
	//    1    1:getfield        #60  <Field int mSize>
	//    2    4:istore_3        
		int i;
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       30
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #56  <Field int[] mHashes>
	//*  10   16:arraylength     
	//*  11   17:icmplt          53
	//*  12   20:new             #165 <Class IllegalStateException>
	//*  13   23:dup             
	//*  14   24:ldc1            #167 <String "Array is full">
	//*  15   26:invokespecial   #170 <Method void IllegalStateException(String)>
	//*  16   29:athrow          
		if(mIdentityHashCode)
	//*  17   30:aload_0         
	//*  18   31:getfield        #54  <Field boolean mIdentityHashCode>
	//*  19   34:ifeq            45
			i = System.identityHashCode(obj);
	//   20   37:aload_1         
	//   21   38:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   22   41:istore_2        
		else
	//*  23   42:goto            11
			i = obj.hashCode();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #122 <Method int Object.hashCode()>
	//   26   49:istore_2        
		if(j >= mHashes.length)
			throw new IllegalStateException("Array is full");
	//*  27   50:goto            11
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
	//   47   80:putfield        #60  <Field int mSize>
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
	//*   1    1:getfield        #60  <Field int mSize>
	//*   2    4:ifeq            41
		{
			freeArrays(mHashes, mArray, mSize);
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field int[] mHashes>
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field Object[] mArray>
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field int mSize>
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
	//   18   38:putfield        #60  <Field int mSize>
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
	//   13   21:invokespecial   #63  <Method void allocArrays(int)>
			if(mSize > 0)
	//*  14   24:aload_0         
	//*  15   25:getfield        #60  <Field int mSize>
	//*  16   28:ifle            59
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, mSize);
	//   17   31:aload_2         
	//   18   32:iconst_0        
	//   19   33:aload_0         
	//   20   34:getfield        #56  <Field int[] mHashes>
	//   21   37:iconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #60  <Field int mSize>
	//   24   42:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize);
	//   25   45:aload_3         
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:getfield        #58  <Field Object[] mArray>
	//   29   51:iconst_0        
	//   30   52:aload_0         
	//   31   53:getfield        #60  <Field int mSize>
	//   32   56:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:aload_0         
	//   36   62:getfield        #60  <Field int mSize>
	//   37   65:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
		}
	//   38   68:return          
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
label0:
		{
			if(!(obj instanceof Set))
				break label0;
	//    5    7:aload_1         
	//    6    8:instanceof      #9   <Class Set>
	//    7   11:ifeq            75
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
	//   22   38:getfield        #60  <Field int mSize>
	//   23   41:icmpge          5
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
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  39   69:astore_1        
				{
					return false;
	//   40   70:iconst_0        
	//   41   71:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  42   72:astore_1        
				{
					return false;
	//   43   73:iconst_0        
	//   44   74:ireturn         
				}
				if(!flag)
					return false;
				i++;
			} while(true);
		}
		if(true) goto _L1; else goto _L3
_L3:
		return false;
	//   45   75:iconst_0        
	//   46   76:ireturn         
	}

	public int hashCode()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int ai[] = mHashes;
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field int[] mHashes>
	//    4    6:astore          4
		int k = mSize;
	//    5    8:aload_0         
	//    6    9:getfield        #60  <Field int mSize>
	//    7   12:istore_3        
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
	//    3    5:invokespecial   #111 <Method int indexOfNull()>
	//    4    8:ireturn         
		int i;
		if(mIdentityHashCode)
	//*   5    9:aload_0         
	//*   6   10:getfield        #54  <Field boolean mIdentityHashCode>
	//*   7   13:ifeq            28
			i = System.identityHashCode(obj);
	//    8   16:aload_1         
	//    9   17:invokestatic    #117 <Method int System.identityHashCode(Object)>
	//   10   20:istore_2        
		else
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #119 <Method int indexOf(Object, int)>
	//*  15   27:ireturn         
			i = obj.hashCode();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #122 <Method int Object.hashCode()>
	//   18   32:istore_2        
		return indexOf(obj, i);
	//*  19   33:goto            21
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int j = arrayset.mSize;
	//    2    3:aload_1         
	//    3    4:getfield        #60  <Field int mSize>
	//    4    7:istore_3        
		int k = mSize;
	//    5    8:aload_0         
	//    6    9:getfield        #60  <Field int mSize>
	//    7   12:istore          4
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
	//   16   24:invokevirtual   #136 <Method Object valueAt(int)>
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
	//*  26   41:getfield        #60  <Field int mSize>
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
		int j = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
		Object obj = mArray[i];
	//    2    3:aload_0         
	//    3    4:getfield        #58  <Field Object[] mArray>
	//    4    7:iload_1         
	//    5    8:aaload          
	//    6    9:astore_3        
		if(mSize <= 1)
	//*   7   10:aload_0         
	//*   8   11:getfield        #60  <Field int mSize>
	//*   9   14:iconst_1        
	//*  10   15:icmpgt          54
		{
			freeArrays(mHashes, mArray, mSize);
	//   11   18:aload_0         
	//   12   19:getfield        #56  <Field int[] mHashes>
	//   13   22:aload_0         
	//   14   23:getfield        #58  <Field Object[] mArray>
	//   15   26:aload_0         
	//   16   27:getfield        #60  <Field int mSize>
	//   17   30:invokestatic    #128 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   18   33:aload_0         
	//   19   34:getstatic       #42  <Field int[] INT>
	//   20   37:putfield        #56  <Field int[] mHashes>
			mArray = OBJECT;
	//   21   40:aload_0         
	//   22   41:getstatic       #44  <Field Object[] OBJECT>
	//   23   44:putfield        #58  <Field Object[] mArray>
			mSize = 0;
	//   24   47:aload_0         
	//   25   48:iconst_0        
	//   26   49:putfield        #60  <Field int mSize>
		} else
	//*  27   52:aload_3         
	//*  28   53:areturn         
		if(mHashes.length > 8 && mSize < mHashes.length / 3)
	//*  29   54:aload_0         
	//*  30   55:getfield        #56  <Field int[] mHashes>
	//*  31   58:arraylength     
	//*  32   59:bipush          8
	//*  33   61:icmple          202
	//*  34   64:aload_0         
	//*  35   65:getfield        #60  <Field int mSize>
	//*  36   68:aload_0         
	//*  37   69:getfield        #56  <Field int[] mHashes>
	//*  38   72:arraylength     
	//*  39   73:iconst_3        
	//*  40   74:idiv            
	//*  41   75:icmpge          202
		{
			if(mSize > 8)
	//*  42   78:aload_0         
	//*  43   79:getfield        #60  <Field int mSize>
	//*  44   82:bipush          8
	//*  45   84:icmple          99
				j = mSize + (mSize >> 1);
	//   46   87:aload_0         
	//   47   88:getfield        #60  <Field int mSize>
	//   48   91:aload_0         
	//   49   92:getfield        #60  <Field int mSize>
	//   50   95:iconst_1        
	//   51   96:ishr            
	//   52   97:iadd            
	//   53   98:istore_2        
			int ai[] = mHashes;
	//   54   99:aload_0         
	//   55  100:getfield        #56  <Field int[] mHashes>
	//   56  103:astore          4
			Object aobj[] = mArray;
	//   57  105:aload_0         
	//   58  106:getfield        #58  <Field Object[] mArray>
	//   59  109:astore          5
			allocArrays(j);
	//   60  111:aload_0         
	//   61  112:iload_2         
	//   62  113:invokespecial   #63  <Method void allocArrays(int)>
			mSize = mSize - 1;
	//   63  116:aload_0         
	//   64  117:aload_0         
	//   65  118:getfield        #60  <Field int mSize>
	//   66  121:iconst_1        
	//   67  122:isub            
	//   68  123:putfield        #60  <Field int mSize>
			if(i > 0)
	//*  69  126:iload_1         
	//*  70  127:ifle            154
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   71  130:aload           4
	//   72  132:iconst_0        
	//   73  133:aload_0         
	//   74  134:getfield        #56  <Field int[] mHashes>
	//   75  137:iconst_0        
	//   76  138:iload_1         
	//   77  139:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i);
	//   78  142:aload           5
	//   79  144:iconst_0        
	//   80  145:aload_0         
	//   81  146:getfield        #58  <Field Object[] mArray>
	//   82  149:iconst_0        
	//   83  150:iload_1         
	//   84  151:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			if(i < mSize)
	//*  85  154:iload_1         
	//*  86  155:aload_0         
	//*  87  156:getfield        #60  <Field int mSize>
	//*  88  159:icmpge          52
			{
				System.arraycopy(((Object) (ai)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//   89  162:aload           4
	//   90  164:iload_1         
	//   91  165:iconst_1        
	//   92  166:iadd            
	//   93  167:aload_0         
	//   94  168:getfield        #56  <Field int[] mHashes>
	//   95  171:iload_1         
	//   96  172:aload_0         
	//   97  173:getfield        #60  <Field int mSize>
	//   98  176:iload_1         
	//   99  177:isub            
	//  100  178:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), i + 1, ((Object) (mArray)), i, mSize - i);
	//  101  181:aload           5
	//  102  183:iload_1         
	//  103  184:iconst_1        
	//  104  185:iadd            
	//  105  186:aload_0         
	//  106  187:getfield        #58  <Field Object[] mArray>
	//  107  190:iload_1         
	//  108  191:aload_0         
	//  109  192:getfield        #60  <Field int mSize>
	//  110  195:iload_1         
	//  111  196:isub            
	//  112  197:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				return obj;
	//  113  200:aload_3         
	//  114  201:areturn         
			}
		} else
		{
			mSize = mSize - 1;
	//  115  202:aload_0         
	//  116  203:aload_0         
	//  117  204:getfield        #60  <Field int mSize>
	//  118  207:iconst_1        
	//  119  208:isub            
	//  120  209:putfield        #60  <Field int mSize>
			if(i < mSize)
	//* 121  212:iload_1         
	//* 122  213:aload_0         
	//* 123  214:getfield        #60  <Field int mSize>
	//* 124  217:icmpge          262
			{
				System.arraycopy(((Object) (mHashes)), i + 1, ((Object) (mHashes)), i, mSize - i);
	//  125  220:aload_0         
	//  126  221:getfield        #56  <Field int[] mHashes>
	//  127  224:iload_1         
	//  128  225:iconst_1        
	//  129  226:iadd            
	//  130  227:aload_0         
	//  131  228:getfield        #56  <Field int[] mHashes>
	//  132  231:iload_1         
	//  133  232:aload_0         
	//  134  233:getfield        #60  <Field int mSize>
	//  135  236:iload_1         
	//  136  237:isub            
	//  137  238:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mArray)), i + 1, ((Object) (mArray)), i, mSize - i);
	//  138  241:aload_0         
	//  139  242:getfield        #58  <Field Object[] mArray>
	//  140  245:iload_1         
	//  141  246:iconst_1        
	//  142  247:iadd            
	//  143  248:aload_0         
	//  144  249:getfield        #58  <Field Object[] mArray>
	//  145  252:iload_1         
	//  146  253:aload_0         
	//  147  254:getfield        #60  <Field int mSize>
	//  148  257:iload_1         
	//  149  258:isub            
	//  150  259:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mArray[mSize] = null;
	//  151  262:aload_0         
	//  152  263:getfield        #58  <Field Object[] mArray>
	//  153  266:aload_0         
	//  154  267:getfield        #60  <Field int mSize>
	//  155  270:aconst_null     
	//  156  271:aastore         
			return obj;
	//  157  272:aload_3         
	//  158  273:areturn         
		}
		return obj;
	}

	public boolean retainAll(Collection collection)
	{
		int i = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(i--; i >= 0; i--)
	//*   5    7:iload_2         
	//*   6    8:iconst_1        
	//*   7    9:isub            
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iflt            45
			if(!collection.contains(mArray[i]))
	//*  11   15:aload_1         
	//*  12   16:aload_0         
	//*  13   17:getfield        #58  <Field Object[] mArray>
	//*  14   20:iload_2         
	//*  15   21:aaload          
	//*  16   22:invokeinterface #210 <Method boolean Collection.contains(Object)>
	//*  17   27:ifne            38
			{
				removeAt(i);
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:invokevirtual   #202 <Method Object removeAt(int)>
	//   21   35:pop             
				flag = true;
	//   22   36:iconst_1        
	//   23   37:istore_3        
			}

	//   24   38:iload_2         
	//   25   39:iconst_1        
	//   26   40:isub            
	//   27   41:istore_2        
	//*  28   42:goto            11
		return flag;
	//   29   45:iload_3         
	//   30   46:ireturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
	//    2    4:ireturn         
	}

	public Object[] toArray()
	{
		Object aobj[] = new Object[mSize];
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mSize>
	//    2    4:anewarray       Object[]
	//    3    7:astore_1        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj)), 0, mSize);
	//    4    8:aload_0         
	//    5    9:getfield        #58  <Field Object[] mArray>
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #60  <Field int mSize>
	//   11   19:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		if(aobj.length < mSize)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #60  <Field int mSize>
	//*   4    6:icmpge          62
			aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), mSize);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #217 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #222 <Method Class Class.getComponentType()>
	//    8   16:aload_0         
	//    9   17:getfield        #60  <Field int mSize>
	//   10   20:invokestatic    #228 <Method Object Array.newInstance(Class, int)>
	//   11   23:checkcast       #78  <Class Object[]>
	//   12   26:checkcast       #78  <Class Object[]>
	//   13   29:astore_1        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj)), 0, mSize);
	//   14   30:aload_0         
	//   15   31:getfield        #58  <Field Object[] mArray>
	//   16   34:iconst_0        
	//   17   35:aload_1         
	//   18   36:iconst_0        
	//   19   37:aload_0         
	//   20   38:getfield        #60  <Field int mSize>
	//   21   41:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(aobj.length > mSize)
	//*  22   44:aload_1         
	//*  23   45:arraylength     
	//*  24   46:aload_0         
	//*  25   47:getfield        #60  <Field int mSize>
	//*  26   50:icmple          60
			aobj[mSize] = null;
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #60  <Field int mSize>
	//   30   58:aconst_null     
	//   31   59:aastore         
		return aobj;
	//   32   60:aload_1         
	//   33   61:areturn         
	//*  34   62:goto            30
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
	//    8   15:getfield        #60  <Field int mSize>
	//    9   18:bipush          14
	//   10   20:imul            
	//   11   21:invokespecial   #239 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #242 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		int i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_1        
		while(i < mSize) 
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #60  <Field int mSize>
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
	//*  35   61:if_acmpeq       77
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #250 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:iload_1         
	//*  41   71:iconst_1        
	//*  42   72:iadd            
	//*  43   73:istore_1        
	//*  44   74:goto            34
				stringbuilder.append("(this Set)");
	//   45   77:aload_2         
	//   46   78:ldc1            #252 <String "(this Set)">
	//   47   80:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   48   83:pop             
			i++;
		}
	//*  49   84:goto            70
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
	static int sBaseCacheSize;
	static Object sTwiceBaseCache[];
	static int sTwiceBaseCacheSize;
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
