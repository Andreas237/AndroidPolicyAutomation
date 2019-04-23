// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$SpanSizeLookup
{

	int findReferenceIndexFromCache(int i)
	{
		int k = mSpanIndexCache.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//    2    4:invokevirtual   #26  <Method int SparseIntArray.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		int j;
		for(j = 0; j <= k;)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpgt          53
		{
			int l = j + k >>> 1;
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:iadd            
	//   14   20:iconst_1        
	//   15   21:iushr           
	//   16   22:istore          4
			if(mSpanIndexCache.keyAt(l) < i)
	//*  17   24:aload_0         
	//*  18   25:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//*  19   28:iload           4
	//*  20   30:invokevirtual   #29  <Method int SparseIntArray.keyAt(int)>
	//*  21   33:iload_1         
	//*  22   34:icmpge          45
				j = l + 1;
	//   23   37:iload           4
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
			else
	//*  27   42:goto            12
				k = l - 1;
	//   28   45:iload           4
	//   29   47:iconst_1        
	//   30   48:isub            
	//   31   49:istore_3        
		}

	//*  32   50:goto            12
		i = j - 1;
	//   33   53:iload_2         
	//   34   54:iconst_1        
	//   35   55:isub            
	//   36   56:istore_1        
		if(i >= 0 && i < mSpanIndexCache.size())
	//*  37   57:iload_1         
	//*  38   58:iflt            81
	//*  39   61:iload_1         
	//*  40   62:aload_0         
	//*  41   63:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//*  42   66:invokevirtual   #26  <Method int SparseIntArray.size()>
	//*  43   69:icmpge          81
			return mSpanIndexCache.keyAt(i);
	//   44   72:aload_0         
	//   45   73:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//   46   76:iload_1         
	//   47   77:invokevirtual   #29  <Method int SparseIntArray.keyAt(int)>
	//   48   80:ireturn         
		else
			return -1;
	//   49   81:iconst_m1       
	//   50   82:ireturn         
	}

	int getCachedSpanIndex(int i, int j)
	{
		if(!mCacheSpanIndices)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mCacheSpanIndices>
	//*   2    4:ifne            14
			return getSpanIndex(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #34  <Method int getSpanIndex(int, int)>
	//    7   13:ireturn         
		int k = mSpanIndexCache.get(i, -1);
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//   10   18:iload_1         
	//   11   19:iconst_m1       
	//   12   20:invokevirtual   #37  <Method int SparseIntArray.get(int, int)>
	//   13   23:istore_3        
		if(k != -1)
	//*  14   24:iload_3         
	//*  15   25:iconst_m1       
	//*  16   26:icmpeq          31
		{
			return k;
	//   17   29:iload_3         
	//   18   30:ireturn         
		} else
		{
			j = getSpanIndex(i, j);
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:iload_2         
	//   22   34:invokevirtual   #34  <Method int getSpanIndex(int, int)>
	//   23   37:istore_2        
			mSpanIndexCache.put(i, j);
	//   24   38:aload_0         
	//   25   39:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//   26   42:iload_1         
	//   27   43:iload_2         
	//   28   44:invokevirtual   #41  <Method void SparseIntArray.put(int, int)>
			return j;
	//   29   47:iload_2         
	//   30   48:ireturn         
		}
	}

	public int getSpanGroupIndex(int i, int j)
	{
		int i2 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #45  <Method int getSpanSize(int)>
	//    3    5:istore          9
		int j1 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          6
		int k = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		int l;
		int i1;
		for(l = 0; j1 < i; l = i1)
	//*   8   12:iconst_0        
	//*   9   13:istore          4
	//*  10   15:iload           6
	//*  11   17:iload_1         
	//*  12   18:icmpge          87
		{
			int k1 = getSpanSize(j1);
	//   13   21:aload_0         
	//   14   22:iload           6
	//   15   24:invokevirtual   #45  <Method int getSpanSize(int)>
	//   16   27:istore          7
			int l1 = k + k1;
	//   17   29:iload_3         
	//   18   30:iload           7
	//   19   32:iadd            
	//   20   33:istore          8
			if(l1 == j)
	//*  21   35:iload           8
	//*  22   37:iload_2         
	//*  23   38:icmpne          52
			{
				i1 = l + 1;
	//   24   41:iload           4
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore          5
				k = 0;
	//   28   47:iconst_0        
	//   29   48:istore_3        
			} else
	//*  30   49:goto            74
			{
				k = l1;
	//   31   52:iload           8
	//   32   54:istore_3        
				i1 = l;
	//   33   55:iload           4
	//   34   57:istore          5
				if(l1 > j)
	//*  35   59:iload           8
	//*  36   61:iload_2         
	//*  37   62:icmple          74
				{
					i1 = l + 1;
	//   38   65:iload           4
	//   39   67:iconst_1        
	//   40   68:iadd            
	//   41   69:istore          5
					k = k1;
	//   42   71:iload           7
	//   43   73:istore_3        
				}
			}
			j1++;
	//   44   74:iload           6
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:istore          6
		}

	//   48   80:iload           5
	//   49   82:istore          4
	//*  50   84:goto            15
		i = l;
	//   51   87:iload           4
	//   52   89:istore_1        
		if(k + i2 > j)
	//*  53   90:iload_3         
	//*  54   91:iload           9
	//*  55   93:iadd            
	//*  56   94:iload_2         
	//*  57   95:icmple          103
			i = l + 1;
	//   58   98:iload           4
	//   59  100:iconst_1        
	//   60  101:iadd            
	//   61  102:istore_1        
		return i;
	//   62  103:iload_1         
	//   63  104:ireturn         
	}

	public int getSpanIndex(int i, int j)
	{
		int k;
		int l;
		int k1;
label0:
		{
			k1 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #45  <Method int getSpanSize(int)>
	//    3    5:istore          7
			if(k1 == j)
	//*   4    7:iload           7
	//*   5    9:iload_2         
	//*   6   10:icmpne          15
				return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
			if(!mCacheSpanIndices || mSpanIndexCache.size() <= 0)
				break label0;
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field boolean mCacheSpanIndices>
	//   11   19:ifeq            70
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//   14   26:invokevirtual   #26  <Method int SparseIntArray.size()>
	//   15   29:ifle            70
			l = findReferenceIndexFromCache(i);
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokevirtual   #47  <Method int findReferenceIndexFromCache(int)>
	//   19   37:istore          4
			if(l < 0)
				break label0;
	//   20   39:iload           4
	//   21   41:iflt            70
			k = mSpanIndexCache.get(l) + getSpanSize(l);
	//   22   44:aload_0         
	//   23   45:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//   24   48:iload           4
	//   25   50:invokevirtual   #49  <Method int SparseIntArray.get(int)>
	//   26   53:aload_0         
	//   27   54:iload           4
	//   28   56:invokevirtual   #45  <Method int getSpanSize(int)>
	//   29   59:iadd            
	//   30   60:istore_3        
		}
		  goto _L1
	//*  31   61:iload           4
	//*  32   63:iconst_1        
	//*  33   64:iadd            
	//*  34   65:istore          4
	//*  35   67:goto            75
		l = 0;
	//   36   70:iconst_0        
	//   37   71:istore          4
		k = 0;
	//   38   73:iconst_0        
	//   39   74:istore_3        
_L1:
		for(l++; l < i; l++)
	//*  40   75:iload           4
	//*  41   77:iload_1         
	//*  42   78:icmpge          127
		{
			int i1 = getSpanSize(l);
	//   43   81:aload_0         
	//   44   82:iload           4
	//   45   84:invokevirtual   #45  <Method int getSpanSize(int)>
	//   46   87:istore          5
			int j1 = k + i1;
	//   47   89:iload_3         
	//   48   90:iload           5
	//   49   92:iadd            
	//   50   93:istore          6
			if(j1 == j)
	//*  51   95:iload           6
	//*  52   97:iload_2         
	//*  53   98:icmpne          106
			{
				k = 0;
	//   54  101:iconst_0        
	//   55  102:istore_3        
				continue;
	//   56  103:goto            118
			}
			k = j1;
	//   57  106:iload           6
	//   58  108:istore_3        
			if(j1 > j)
	//*  59  109:iload           6
	//*  60  111:iload_2         
	//*  61  112:icmple          118
				k = i1;
	//   62  115:iload           5
	//   63  117:istore_3        
		}

	//   64  118:iload           4
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore          4
	//*  68  124:goto            75
		if(k1 + k <= j)
	//*  69  127:iload           7
	//*  70  129:iload_3         
	//*  71  130:iadd            
	//*  72  131:iload_2         
	//*  73  132:icmpgt          137
			return k;
	//   74  135:iload_3         
	//   75  136:ireturn         
		else
			return 0;
	//   76  137:iconst_0        
	//   77  138:ireturn         
	}

	public abstract int getSpanSize(int i);

	public void invalidateSpanIndexCache()
	{
		mSpanIndexCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SparseIntArray mSpanIndexCache>
	//    2    4:invokevirtual   #53  <Method void SparseIntArray.clear()>
	//    3    7:return          
	}

	public boolean isSpanIndexCacheEnabled()
	{
		return mCacheSpanIndices;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean mCacheSpanIndices>
	//    2    4:ireturn         
	}

	public void setSpanIndexCacheEnabled(boolean flag)
	{
		mCacheSpanIndices = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field boolean mCacheSpanIndices>
	//    3    5:return          
	}

	private boolean mCacheSpanIndices;
	final SparseIntArray mSpanIndexCache = new SparseIntArray();

	public GridLayoutManager$SpanSizeLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void SparseIntArray()>
	//    6   12:putfield        #17  <Field SparseIntArray mSpanIndexCache>
		mCacheSpanIndices = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #19  <Field boolean mCacheSpanIndices>
	//   10   20:return          
	}
}
