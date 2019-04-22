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
	//    2    2:invokespecial   #38  <Method void ArraySet(int)>
	//    3    5:return          
	}

	public ArraySet(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            25
		{
			mHashes = INT;
	//    4    8:aload_0         
	//    5    9:getstatic       #31  <Field int[] INT>
	//    6   12:putfield        #42  <Field int[] mHashes>
			mArray = OBJECT;
	//    7   15:aload_0         
	//    8   16:getstatic       #33  <Field Object[] OBJECT>
	//    9   19:putfield        #44  <Field Object[] mArray>
		} else
	//*  10   22:goto            30
		{
			allocArrays(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #47  <Method void allocArrays(int)>
		}
		mSize = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #49  <Field int mSize>
	//   17   35:return          
	}

	private void allocArrays(int i)
	{
		if(i != 8)
			break MISSING_BLOCK_LABEL_81;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:icmpne          81
		android/support/v4/util/ArraySet;
	//    3    6:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object aobj[];
		if(sTwiceBaseCache == null)
			break MISSING_BLOCK_LABEL_69;
	//    5    9:getstatic       #51  <Field Object[] sTwiceBaseCache>
	//    6   12:ifnull          69
		aobj = sTwiceBaseCache;
	//    7   15:getstatic       #51  <Field Object[] sTwiceBaseCache>
	//    8   18:astore_2        
		mArray = aobj;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #44  <Field Object[] mArray>
		sTwiceBaseCache = (Object[])(Object[])aobj[0];
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:checkcast       #52  <Class Object[]>
	//   16   30:checkcast       #52  <Class Object[]>
	//   17   33:putstatic       #51  <Field Object[] sTwiceBaseCache>
		mHashes = (int[])(int[])aobj[1];
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aaload          
	//   22   40:checkcast       #53  <Class int[]>
	//   23   43:checkcast       #53  <Class int[]>
	//   24   46:putfield        #42  <Field int[] mHashes>
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
	//   33   57:getstatic       #55  <Field int sTwiceBaseCacheSize>
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:putstatic       #55  <Field int sTwiceBaseCacheSize>
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
		break MISSING_BLOCK_LABEL_161;
	//   42   72:goto            161
		Exception exception;
		exception;
	//   43   75:astore_2        
		android/support/v4/util/ArraySet;
	//   44   76:ldc1            #2   <Class ArraySet>
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
		android/support/v4/util/ArraySet;
	//   51   86:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorenter ;
	//   52   88:monitorenter    
		if(sBaseCache == null)
			break MISSING_BLOCK_LABEL_149;
	//   53   89:getstatic       #57  <Field Object[] sBaseCache>
	//   54   92:ifnull          149
		exception = ((Exception) (sBaseCache));
	//   55   95:getstatic       #57  <Field Object[] sBaseCache>
	//   56   98:astore_2        
		mArray = ((Object []) (exception));
	//   57   99:aload_0         
	//   58  100:aload_2         
	//   59  101:putfield        #44  <Field Object[] mArray>
		sBaseCache = (Object[])(Object[])exception[0];
	//   60  104:aload_2         
	//   61  105:iconst_0        
	//   62  106:aaload          
	//   63  107:checkcast       #52  <Class Object[]>
	//   64  110:checkcast       #52  <Class Object[]>
	//   65  113:putstatic       #57  <Field Object[] sBaseCache>
		mHashes = (int[])(int[])exception[1];
	//   66  116:aload_0         
	//   67  117:aload_2         
	//   68  118:iconst_1        
	//   69  119:aaload          
	//   70  120:checkcast       #53  <Class int[]>
	//   71  123:checkcast       #53  <Class int[]>
	//   72  126:putfield        #42  <Field int[] mHashes>
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
		sBaseCacheSize--;
	//   81  137:getstatic       #59  <Field int sBaseCacheSize>
	//   82  140:iconst_1        
	//   83  141:isub            
	//   84  142:putstatic       #59  <Field int sBaseCacheSize>
		android/support/v4/util/ArraySet;
	//   85  145:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   86  147:monitorexit     
		return;
	//   87  148:return          
		android/support/v4/util/ArraySet;
	//   88  149:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   89  151:monitorexit     
		break MISSING_BLOCK_LABEL_161;
	//   90  152:goto            161
		exception;
	//   91  155:astore_2        
		android/support/v4/util/ArraySet;
	//   92  156:ldc1            #2   <Class ArraySet>
		JVM INSTR monitorexit ;
	//   93  158:monitorexit     
		throw exception;
	//   94  159:aload_2         
	//   95  160:athrow          
		mHashes = new int[i];
	//   96  161:aload_0         
	//   97  162:iload_1         
	//   98  163:newarray        int[]
	//   99  165:putfield        #42  <Field int[] mHashes>
		mArray = new Object[i];
	//  100  168:aload_0         
	//  101  169:iload_1         
	//  102  170:anewarray       Object[]
	//  103  173:putfield        #44  <Field Object[] mArray>
		return;
	//  104  176:return          
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
	//*   6   10:getstatic       #55  <Field int sTwiceBaseCacheSize>
	//*   7   13:bipush          10
	//*   8   15:icmpge          47
		{
			aobj[0] = ((Object) (sTwiceBaseCache));
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:getstatic       #51  <Field Object[] sTwiceBaseCache>
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
	//   23   36:putstatic       #51  <Field Object[] sTwiceBaseCache>
		sTwiceBaseCacheSize++;
	//   24   39:getstatic       #55  <Field int sTwiceBaseCacheSize>
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:putstatic       #55  <Field int sTwiceBaseCacheSize>
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
	//   42   66:getstatic       #59  <Field int sBaseCacheSize>
	//   43   69:bipush          10
	//   44   71:icmpge          103
_L6:
		aobj[0] = ((Object) (sBaseCache));
	//   45   74:aload_1         
	//   46   75:iconst_0        
	//   47   76:getstatic       #57  <Field Object[] sBaseCache>
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
	//   59   92:putstatic       #57  <Field Object[] sBaseCache>
		sBaseCacheSize++;
	//   60   95:getstatic       #59  <Field int sBaseCacheSize>
	//   61   98:iconst_1        
	//   62   99:iadd            
	//   63  100:putstatic       #59  <Field int sBaseCacheSize>
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
	//*   1    1:getfield        #65  <Field MapCollections mCollections>
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
	//    7   13:invokespecial   #68  <Method void ArraySet$1(ArraySet)>
	//    8   16:putfield        #65  <Field MapCollections mCollections>
		return mCollections;
	//    9   19:aload_0         
	//   10   20:getfield        #65  <Field MapCollections mCollections>
	//   11   23:areturn         
	}

	private int indexOf(Object obj, int i)
	{
		int k = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		int i1 = ContainerHelpers.binarySearch(mHashes, k, i);
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field int[] mHashes>
	//    9   17:iload           4
	//   10   19:iload_2         
	//   11   20:invokestatic    #78  <Method int ContainerHelpers.binarySearch(int[], int, int)>
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
	//*  19   35:getfield        #44  <Field Object[] mArray>
	//*  20   38:iload           5
	//*  21   40:aaload          
	//*  22   41:invokevirtual   #82  <Method boolean Object.equals(Object)>
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
	//*  34   62:getfield        #42  <Field int[] mHashes>
	//*  35   65:iload_3         
	//*  36   66:iaload          
	//*  37   67:iload_2         
	//*  38   68:icmpne          93
			if(obj.equals(mArray[j]))
	//*  39   71:aload_1         
	//*  40   72:aload_0         
	//*  41   73:getfield        #44  <Field Object[] mArray>
	//*  42   76:iload_3         
	//*  43   77:aaload          
	//*  44   78:invokevirtual   #82  <Method boolean Object.equals(Object)>
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
	//*  60  105:getfield        #42  <Field int[] mHashes>
	//*  61  108:iload           4
	//*  62  110:iaload          
	//*  63  111:iload_2         
	//*  64  112:icmpne          141
			if(obj.equals(mArray[l]))
	//*  65  115:aload_1         
	//*  66  116:aload_0         
	//*  67  117:getfield        #44  <Field Object[] mArray>
	//*  68  120:iload           4
	//*  69  122:aaload          
	//*  70  123:invokevirtual   #82  <Method boolean Object.equals(Object)>
	//*  71  126:ifeq            132
				return l;
	//   72  129:iload           4
	//   73  131:ireturn         

	//   74  132:iload           4
	//   75  134:iconst_1        
	//   76  135:isub            
	//   77  136:istore          4
	//*  78  138:goto            99
		return j;
	//   79  141:iload_3         
	//   80  142:ireturn         
	}

	private int indexOfNull()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int l = ContainerHelpers.binarySearch(mHashes, j, 0);
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field int[] mHashes>
	//    9   15:iload_2         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #78  <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   12   20:istore_3        
		if(l < 0)
	//*  13   21:iload_3         
	//*  14   22:ifge            27
			return l;
	//   15   25:iload_3         
	//   16   26:ireturn         
		if(mArray[l] == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #44  <Field Object[] mArray>
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
	//*  32   48:getfield        #42  <Field int[] mHashes>
	//*  33   51:iload_1         
	//*  34   52:iaload          
	//*  35   53:ifne            74
			if(mArray[i] == null)
	//*  36   56:aload_0         
	//*  37   57:getfield        #44  <Field Object[] mArray>
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
	//*  55   83:getfield        #42  <Field int[] mHashes>
	//*  56   86:iload_2         
	//*  57   87:iaload          
	//*  58   88:ifne            109
			if(mArray[k] == null)
	//*  59   91:aload_0         
	//*  60   92:getfield        #44  <Field Object[] mArray>
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
		return i;
	//   71  109:iload_1         
	//   72  110:ireturn         
	}

	public boolean add(Object obj)
	{
		int i;
		int j;
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			i = indexOfNull();
	//    2    4:aload_0         
	//    3    5:invokespecial   #87  <Method int indexOfNull()>
	//    4    8:istore_2        
			j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		} else
	//*   7   11:goto            26
		{
			j = obj.hashCode();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #90  <Method int Object.hashCode()>
	//   10   18:istore_3        
			i = indexOf(obj, j);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:iload_3         
	//   14   22:invokespecial   #92  <Method int indexOf(Object, int)>
	//   15   25:istore_2        
		}
		if(i >= 0)
	//*  16   26:iload_2         
	//*  17   27:iflt            32
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
		int k = i;
	//   20   32:iload_2         
	//   21   33:istore          4
		int l = mSize;
	//   22   35:aload_0         
	//   23   36:getfield        #49  <Field int mSize>
	//   24   39:istore          5
		if(l >= mHashes.length)
	//*  25   41:iload           5
	//*  26   43:aload_0         
	//*  27   44:getfield        #42  <Field int[] mHashes>
	//*  28   47:arraylength     
	//*  29   48:icmplt          146
		{
			i = 4;
	//   30   51:iconst_4        
	//   31   52:istore_2        
			if(l >= 8)
	//*  32   53:iload           5
	//*  33   55:bipush          8
	//*  34   57:icmplt          71
				i = (l >> 1) + l;
	//   35   60:iload           5
	//   36   62:iconst_1        
	//   37   63:ishr            
	//   38   64:iload           5
	//   39   66:iadd            
	//   40   67:istore_2        
			else
	//*  41   68:goto            80
			if(l >= 4)
	//*  42   71:iload           5
	//*  43   73:iconst_4        
	//*  44   74:icmplt          80
				i = 8;
	//   45   77:bipush          8
	//   46   79:istore_2        
			int ai[] = mHashes;
	//   47   80:aload_0         
	//   48   81:getfield        #42  <Field int[] mHashes>
	//   49   84:astore          6
			Object aobj[] = mArray;
	//   50   86:aload_0         
	//   51   87:getfield        #44  <Field Object[] mArray>
	//   52   90:astore          7
			allocArrays(i);
	//   53   92:aload_0         
	//   54   93:iload_2         
	//   55   94:invokespecial   #47  <Method void allocArrays(int)>
			int ai2[] = mHashes;
	//   56   97:aload_0         
	//   57   98:getfield        #42  <Field int[] mHashes>
	//   58  101:astore          8
			if(ai2.length > 0)
	//*  59  103:aload           8
	//*  60  105:arraylength     
	//*  61  106:ifle            135
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (ai2)), 0, ai.length);
	//   62  109:aload           6
	//   63  111:iconst_0        
	//   64  112:aload           8
	//   65  114:iconst_0        
	//   66  115:aload           6
	//   67  117:arraylength     
	//   68  118:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
	//   69  121:aload           7
	//   70  123:iconst_0        
	//   71  124:aload_0         
	//   72  125:getfield        #44  <Field Object[] mArray>
	//   73  128:iconst_0        
	//   74  129:aload           7
	//   75  131:arraylength     
	//   76  132:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   77  135:aload           6
	//   78  137:aload           7
	//   79  139:aload_0         
	//   80  140:getfield        #49  <Field int mSize>
	//   81  143:invokestatic    #100 <Method void freeArrays(int[], Object[], int)>
		}
		i = mSize;
	//   82  146:aload_0         
	//   83  147:getfield        #49  <Field int mSize>
	//   84  150:istore_2        
		if(k < i)
	//*  85  151:iload           4
	//*  86  153:iload_2         
	//*  87  154:icmpge          208
		{
			int ai1[] = mHashes;
	//   88  157:aload_0         
	//   89  158:getfield        #42  <Field int[] mHashes>
	//   90  161:astore          6
			int i1 = k + 1;
	//   91  163:iload           4
	//   92  165:iconst_1        
	//   93  166:iadd            
	//   94  167:istore          5
			System.arraycopy(((Object) (ai1)), k, ((Object) (ai1)), i1, i - k);
	//   95  169:aload           6
	//   96  171:iload           4
	//   97  173:aload           6
	//   98  175:iload           5
	//   99  177:iload_2         
	//  100  178:iload           4
	//  101  180:isub            
	//  102  181:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai1 = ((int []) (mArray));
	//  103  184:aload_0         
	//  104  185:getfield        #44  <Field Object[] mArray>
	//  105  188:astore          6
			System.arraycopy(((Object) (ai1)), k, ((Object) (ai1)), i1, mSize - k);
	//  106  190:aload           6
	//  107  192:iload           4
	//  108  194:aload           6
	//  109  196:iload           5
	//  110  198:aload_0         
	//  111  199:getfield        #49  <Field int mSize>
	//  112  202:iload           4
	//  113  204:isub            
	//  114  205:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mHashes[k] = j;
	//  115  208:aload_0         
	//  116  209:getfield        #42  <Field int[] mHashes>
	//  117  212:iload           4
	//  118  214:iload_3         
	//  119  215:iastore         
		mArray[k] = obj;
	//  120  216:aload_0         
	//  121  217:getfield        #44  <Field Object[] mArray>
	//  122  220:iload           4
	//  123  222:aload_1         
	//  124  223:aastore         
		mSize = mSize + 1;
	//  125  224:aload_0         
	//  126  225:aload_0         
	//  127  226:getfield        #49  <Field int mSize>
	//  128  229:iconst_1        
	//  129  230:iadd            
	//  130  231:putfield        #49  <Field int mSize>
		return true;
	//  131  234:iconst_1        
	//  132  235:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		ensureCapacity(mSize + collection.size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field int mSize>
	//    3    5:aload_1         
	//    4    6:invokeinterface #108 <Method int Collection.size()>
	//    5   11:iadd            
	//    6   12:invokevirtual   #111 <Method void ensureCapacity(int)>
		collection = ((Collection) (collection.iterator()));
	//    7   15:aload_1         
	//    8   16:invokeinterface #115 <Method Iterator Collection.iterator()>
	//    9   21:astore_1        
		boolean flag;
		for(flag = false; ((Iterator) (collection)).hasNext(); flag |= add(((Iterator) (collection)).next()));
	//   10   22:iconst_0        
	//   11   23:istore_2        
	//   12   24:aload_1         
	//   13   25:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            49
	//   15   33:iload_2         
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokeinterface #125 <Method Object Iterator.next()>
	//   19   41:invokevirtual   #127 <Method boolean add(Object)>
	//   20   44:ior             
	//   21   45:istore_2        
	//*  22   46:goto            24
		return flag;
	//   23   49:iload_2         
	//   24   50:ireturn         
	}

	public void clear()
	{
		int i = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            40
		{
			freeArrays(mHashes, mArray, i);
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field int[] mHashes>
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field Object[] mArray>
	//    9   17:iload_1         
	//   10   18:invokestatic    #100 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   11   21:aload_0         
	//   12   22:getstatic       #31  <Field int[] INT>
	//   13   25:putfield        #42  <Field int[] mHashes>
			mArray = OBJECT;
	//   14   28:aload_0         
	//   15   29:getstatic       #33  <Field Object[] OBJECT>
	//   16   32:putfield        #44  <Field Object[] mArray>
			mSize = 0;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #49  <Field int mSize>
		}
	//   20   40:return          
	}

	public boolean contains(Object obj)
	{
		return indexOf(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method int indexOf(Object)>
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
	//*   1    1:invokeinterface #115 <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            31
			if(!contains(((Iterator) (collection)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #125 <Method Object Iterator.next()>
	//*   9   23:invokevirtual   #136 <Method boolean contains(Object)>
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
		int ai[] = mHashes;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int[] mHashes>
	//    2    4:astore_2        
		if(ai.length < i)
	//*   3    5:aload_2         
	//*   4    6:arraylength     
	//*   5    7:iload_1         
	//*   6    8:icmpge          64
		{
			Object aobj[] = mArray;
	//    7   11:aload_0         
	//    8   12:getfield        #44  <Field Object[] mArray>
	//    9   15:astore_3        
			allocArrays(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokespecial   #47  <Method void allocArrays(int)>
			i = mSize;
	//   13   21:aload_0         
	//   14   22:getfield        #49  <Field int mSize>
	//   15   25:istore_1        
			if(i > 0)
	//*  16   26:iload_1         
	//*  17   27:ifle            55
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   18   30:aload_2         
	//   19   31:iconst_0        
	//   20   32:aload_0         
	//   21   33:getfield        #42  <Field int[] mHashes>
	//   22   36:iconst_0        
	//   23   37:iload_1         
	//   24   38:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize);
	//   25   41:aload_3         
	//   26   42:iconst_0        
	//   27   43:aload_0         
	//   28   44:getfield        #44  <Field Object[] mArray>
	//   29   47:iconst_0        
	//   30   48:aload_0         
	//   31   49:getfield        #49  <Field int mSize>
	//   32   52:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			freeArrays(ai, aobj, mSize);
	//   33   55:aload_2         
	//   34   56:aload_3         
	//   35   57:aload_0         
	//   36   58:getfield        #49  <Field int mSize>
	//   37   61:invokestatic    #100 <Method void freeArrays(int[], Object[], int)>
		}
	//   38   64:return          
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
	//*  12   20:invokevirtual   #142 <Method int size()>
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #143 <Method int Set.size()>
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
	//   22   38:getfield        #49  <Field int mSize>
	//   23   41:icmpge          69
					flag = ((Set) (obj)).contains(valueAt(i));
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #147 <Method Object valueAt(int)>
	//   28   50:invokeinterface #148 <Method boolean Set.contains(Object)>
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
	//    1    1:getfield        #42  <Field int[] mHashes>
	//    2    4:astore          4
		int k = mSize;
	//    3    6:aload_0         
	//    4    7:getfield        #49  <Field int mSize>
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
	//    3    5:invokespecial   #87  <Method int indexOfNull()>
	//    4    8:ireturn         
		else
			return indexOf(obj, obj.hashCode());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #90  <Method int Object.hashCode()>
	//    9   15:invokespecial   #92  <Method int indexOf(Object, int)>
	//   10   18:ireturn         
	}

	public boolean isEmpty()
	{
		return mSize <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
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
	//    1    1:invokespecial   #151 <Method MapCollections getCollection()>
	//    2    4:invokevirtual   #157 <Method Set MapCollections.getKeySet()>
	//    3    7:invokeinterface #158 <Method Iterator Set.iterator()>
	//    4   12:areturn         
	}

	public boolean remove(Object obj)
	{
		int i = indexOf(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method int indexOf(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            18
		{
			removeAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #163 <Method Object removeAt(int)>
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

	public boolean removeAll(Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #115 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
		boolean flag;
		for(flag = false; ((Iterator) (collection)).hasNext(); flag |= remove(((Iterator) (collection)).next()));
	//    3    7:iconst_0        
	//    4    8:istore_2        
	//    5    9:aload_1         
	//    6   10:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            34
	//    8   18:iload_2         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #125 <Method Object Iterator.next()>
	//   12   26:invokevirtual   #166 <Method boolean remove(Object)>
	//   13   29:ior             
	//   14   30:istore_2        
	//*  15   31:goto            9
		return flag;
	//   16   34:iload_2         
	//   17   35:ireturn         
	}

	public Object removeAt(int i)
	{
		Object aobj[] = mArray;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object[] mArray>
	//    2    4:astore          6
		Object obj = aobj[i];
	//    3    6:aload           6
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:astore          5
		int l = mSize;
	//    7   12:aload_0         
	//    8   13:getfield        #49  <Field int mSize>
	//    9   16:istore_3        
		if(l <= 1)
	//*  10   17:iload_3         
	//*  11   18:iconst_1        
	//*  12   19:icmpgt          54
		{
			freeArrays(mHashes, aobj, l);
	//   13   22:aload_0         
	//   14   23:getfield        #42  <Field int[] mHashes>
	//   15   26:aload           6
	//   16   28:iload_3         
	//   17   29:invokestatic    #100 <Method void freeArrays(int[], Object[], int)>
			mHashes = INT;
	//   18   32:aload_0         
	//   19   33:getstatic       #31  <Field int[] INT>
	//   20   36:putfield        #42  <Field int[] mHashes>
			mArray = OBJECT;
	//   21   39:aload_0         
	//   22   40:getstatic       #33  <Field Object[] OBJECT>
	//   23   43:putfield        #44  <Field Object[] mArray>
			mSize = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #49  <Field int mSize>
			return obj;
	//   27   51:aload           5
	//   28   53:areturn         
		}
		aobj = ((Object []) (mHashes));
	//   29   54:aload_0         
	//   30   55:getfield        #42  <Field int[] mHashes>
	//   31   58:astore          6
		int k1 = aobj.length;
	//   32   60:aload           6
	//   33   62:arraylength     
	//   34   63:istore          4
		int j = 8;
	//   35   65:bipush          8
	//   36   67:istore_2        
		if(k1 > 8 && l < aobj.length / 3)
	//*  37   68:iload           4
	//*  38   70:bipush          8
	//*  39   72:icmple          199
	//*  40   75:iload_3         
	//*  41   76:aload           6
	//*  42   78:arraylength     
	//*  43   79:iconst_3        
	//*  44   80:idiv            
	//*  45   81:icmpge          199
		{
			if(l > 8)
	//*  46   84:iload_3         
	//*  47   85:bipush          8
	//*  48   87:icmple          96
				j = l + (l >> 1);
	//   49   90:iload_3         
	//   50   91:iload_3         
	//   51   92:iconst_1        
	//   52   93:ishr            
	//   53   94:iadd            
	//   54   95:istore_2        
			int ai[] = mHashes;
	//   55   96:aload_0         
	//   56   97:getfield        #42  <Field int[] mHashes>
	//   57  100:astore          6
			Object aobj1[] = mArray;
	//   58  102:aload_0         
	//   59  103:getfield        #44  <Field Object[] mArray>
	//   60  106:astore          7
			allocArrays(j);
	//   61  108:aload_0         
	//   62  109:iload_2         
	//   63  110:invokespecial   #47  <Method void allocArrays(int)>
			mSize = mSize - 1;
	//   64  113:aload_0         
	//   65  114:aload_0         
	//   66  115:getfield        #49  <Field int mSize>
	//   67  118:iconst_1        
	//   68  119:isub            
	//   69  120:putfield        #49  <Field int mSize>
			if(i > 0)
	//*  70  123:iload_1         
	//*  71  124:ifle            151
			{
				System.arraycopy(((Object) (ai)), 0, ((Object) (mHashes)), 0, i);
	//   72  127:aload           6
	//   73  129:iconst_0        
	//   74  130:aload_0         
	//   75  131:getfield        #42  <Field int[] mHashes>
	//   76  134:iconst_0        
	//   77  135:iload_1         
	//   78  136:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj1)), 0, ((Object) (mArray)), 0, i);
	//   79  139:aload           7
	//   80  141:iconst_0        
	//   81  142:aload_0         
	//   82  143:getfield        #44  <Field Object[] mArray>
	//   83  146:iconst_0        
	//   84  147:iload_1         
	//   85  148:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			j = mSize;
	//   86  151:aload_0         
	//   87  152:getfield        #49  <Field int mSize>
	//   88  155:istore_2        
			if(i < j)
	//*  89  156:iload_1         
	//*  90  157:iload_2         
	//*  91  158:icmpge          272
			{
				int i1 = i + 1;
	//   92  161:iload_1         
	//   93  162:iconst_1        
	//   94  163:iadd            
	//   95  164:istore_3        
				System.arraycopy(((Object) (ai)), i1, ((Object) (mHashes)), i, j - i);
	//   96  165:aload           6
	//   97  167:iload_3         
	//   98  168:aload_0         
	//   99  169:getfield        #42  <Field int[] mHashes>
	//  100  172:iload_1         
	//  101  173:iload_2         
	//  102  174:iload_1         
	//  103  175:isub            
	//  104  176:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (aobj1)), i1, ((Object) (mArray)), i, mSize - i);
	//  105  179:aload           7
	//  106  181:iload_3         
	//  107  182:aload_0         
	//  108  183:getfield        #44  <Field Object[] mArray>
	//  109  186:iload_1         
	//  110  187:aload_0         
	//  111  188:getfield        #49  <Field int mSize>
	//  112  191:iload_1         
	//  113  192:isub            
	//  114  193:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				return obj;
	//  115  196:aload           5
	//  116  198:areturn         
			}
		} else
		{
			mSize = mSize - 1;
	//  117  199:aload_0         
	//  118  200:aload_0         
	//  119  201:getfield        #49  <Field int mSize>
	//  120  204:iconst_1        
	//  121  205:isub            
	//  122  206:putfield        #49  <Field int mSize>
			int k = mSize;
	//  123  209:aload_0         
	//  124  210:getfield        #49  <Field int mSize>
	//  125  213:istore_2        
			if(i < k)
	//* 126  214:iload_1         
	//* 127  215:iload_2         
	//* 128  216:icmpge          262
			{
				int ai1[] = mHashes;
	//  129  219:aload_0         
	//  130  220:getfield        #42  <Field int[] mHashes>
	//  131  223:astore          6
				int j1 = i + 1;
	//  132  225:iload_1         
	//  133  226:iconst_1        
	//  134  227:iadd            
	//  135  228:istore_3        
				System.arraycopy(((Object) (ai1)), j1, ((Object) (ai1)), i, k - i);
	//  136  229:aload           6
	//  137  231:iload_3         
	//  138  232:aload           6
	//  139  234:iload_1         
	//  140  235:iload_2         
	//  141  236:iload_1         
	//  142  237:isub            
	//  143  238:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
				ai1 = ((int []) (mArray));
	//  144  241:aload_0         
	//  145  242:getfield        #44  <Field Object[] mArray>
	//  146  245:astore          6
				System.arraycopy(((Object) (ai1)), j1, ((Object) (ai1)), i, mSize - i);
	//  147  247:aload           6
	//  148  249:iload_3         
	//  149  250:aload           6
	//  150  252:iload_1         
	//  151  253:aload_0         
	//  152  254:getfield        #49  <Field int mSize>
	//  153  257:iload_1         
	//  154  258:isub            
	//  155  259:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mArray[mSize] = null;
	//  156  262:aload_0         
	//  157  263:getfield        #44  <Field Object[] mArray>
	//  158  266:aload_0         
	//  159  267:getfield        #49  <Field int mSize>
	//  160  270:aconst_null     
	//  161  271:aastore         
		}
		return obj;
	//  162  272:aload           5
	//  163  274:areturn         
	}

	public boolean retainAll(Collection collection)
	{
		int i = mSize - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
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
	//*  11   15:getfield        #44  <Field Object[] mArray>
	//*  12   18:iload_2         
	//*  13   19:aaload          
	//*  14   20:invokeinterface #169 <Method boolean Collection.contains(Object)>
	//*  15   25:ifne            36
			{
				removeAt(i);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #163 <Method Object removeAt(int)>
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
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:ireturn         
	}

	public Object[] toArray()
	{
		int i = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore_1        
		Object aobj[] = new Object[i];
	//    3    5:iload_1         
	//    4    6:anewarray       Object[]
	//    5    9:astore_2        
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj)), 0, i);
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field Object[] mArray>
	//    8   14:iconst_0        
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:iload_1         
	//   12   18:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj;
	//   13   21:aload_2         
	//   14   22:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		Object aobj1[] = aobj;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(aobj.length < mSize)
	//*   2    3:aload_1         
	//*   3    4:arraylength     
	//*   4    5:aload_0         
	//*   5    6:getfield        #49  <Field int mSize>
	//*   6    9:icmpge          31
			aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), mSize);
	//    7   12:aload_1         
	//    8   13:invokevirtual   #177 <Method Class Object.getClass()>
	//    9   16:invokevirtual   #182 <Method Class Class.getComponentType()>
	//   10   19:aload_0         
	//   11   20:getfield        #49  <Field int mSize>
	//   12   23:invokestatic    #188 <Method Object Array.newInstance(Class, int)>
	//   13   26:checkcast       #52  <Class Object[]>
	//   14   29:astore          4
		System.arraycopy(((Object) (mArray)), 0, ((Object) (aobj1)), 0, mSize);
	//   15   31:aload_0         
	//   16   32:getfield        #44  <Field Object[] mArray>
	//   17   35:iconst_0        
	//   18   36:aload           4
	//   19   38:iconst_0        
	//   20   39:aload_0         
	//   21   40:getfield        #49  <Field int mSize>
	//   22   43:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
		int i = aobj1.length;
	//   23   46:aload           4
	//   24   48:arraylength     
	//   25   49:istore_2        
		int j = mSize;
	//   26   50:aload_0         
	//   27   51:getfield        #49  <Field int mSize>
	//   28   54:istore_3        
		if(i > j)
	//*  29   55:iload_2         
	//*  30   56:iload_3         
	//*  31   57:icmple          65
			aobj1[j] = null;
	//   32   60:aload           4
	//   33   62:iload_3         
	//   34   63:aconst_null     
	//   35   64:aastore         
		return aobj1;
	//   36   65:aload           4
	//   37   67:areturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #193 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "{}";
	//    3    7:ldc1            #195 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 14);
	//    5   10:new             #197 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #49  <Field int mSize>
	//    9   18:bipush          14
	//   10   20:imul            
	//   11   21:invokespecial   #198 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #49  <Field int mSize>
	//*  22   39:icmpge          87
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #204 <String ", ">
	//   27   49:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			Object obj = valueAt(i);
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #147 <Method Object valueAt(int)>
	//   32   58:astore_3        
			if(obj != this)
	//*  33   59:aload_3         
	//*  34   60:aload_0         
	//*  35   61:if_acmpeq       73
				stringbuilder.append(obj);
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			else
	//*  40   70:goto            80
				stringbuilder.append("(this Set)");
	//   41   73:aload_2         
	//   42   74:ldc1            #212 <String "(this Set)">
	//   43   76:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
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
	//   52   90:invokevirtual   #202 <Method StringBuilder StringBuilder.append(char)>
	//   53   93:pop             
		return stringbuilder.toString();
	//   54   94:aload_2         
	//   55   95:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   56   98:areturn         
	}

	public Object valueAt(int i)
	{
		return mArray[i];
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final int INT[] = new int[0];
	private static final Object OBJECT[] = new Object[0];
	private static Object sBaseCache[];
	private static int sBaseCacheSize;
	private static Object sTwiceBaseCache[];
	private static int sTwiceBaseCacheSize;
	Object mArray[];
	private MapCollections mCollections;
	private int mHashes[];
	int mSize;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #31  <Field int[] INT>
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:putstatic       #33  <Field Object[] OBJECT>
	//*   6   13:return          
	}
}
