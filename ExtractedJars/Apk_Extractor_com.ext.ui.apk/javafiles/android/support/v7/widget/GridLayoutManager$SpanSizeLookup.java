// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.widget:
//			GridLayoutManager

public static abstract class GridLayoutManager$SpanSizeLookup
{

	int findReferenceIndexFromCache(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int k = mSpanIndexCache.size() - 1; j <= k;)
	//*   2    2:aload_0         
	//*   3    3:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*   4    6:invokevirtual   #29  <Method int SparseIntArray.size()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_3        
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
	//*  18   25:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*  19   28:iload           4
	//*  20   30:invokevirtual   #32  <Method int SparseIntArray.keyAt(int)>
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
	//*  41   63:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*  42   66:invokevirtual   #29  <Method int SparseIntArray.size()>
	//*  43   69:icmpge          81
			return mSpanIndexCache.keyAt(i);
	//   44   72:aload_0         
	//   45   73:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   46   76:iload_1         
	//   47   77:invokevirtual   #32  <Method int SparseIntArray.keyAt(int)>
	//   48   80:ireturn         
		else
			return -1;
	//   49   81:iconst_m1       
	//   50   82:ireturn         
	}

	int getCachedSpanIndex(int i, int j)
	{
		int k;
		if(!mCacheSpanIndices)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean mCacheSpanIndices>
	//*   2    4:ifne            16
		{
			k = getSpanIndex(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #37  <Method int getSpanIndex(int, int)>
	//    7   13:istore_3        
		} else
	//*   8   14:iload_3         
	//*   9   15:ireturn         
		{
			int l = mSpanIndexCache.get(i, -1);
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   12   20:iload_1         
	//   13   21:iconst_m1       
	//   14   22:invokevirtual   #40  <Method int SparseIntArray.get(int, int)>
	//   15   25:istore          4
			k = l;
	//   16   27:iload           4
	//   17   29:istore_3        
			if(l == -1)
	//*  18   30:iload           4
	//*  19   32:iconst_m1       
	//*  20   33:icmpne          14
			{
				j = getSpanIndex(i, j);
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:iload_2         
	//   24   39:invokevirtual   #37  <Method int getSpanIndex(int, int)>
	//   25   42:istore_2        
				mSpanIndexCache.put(i, j);
	//   26   43:aload_0         
	//   27   44:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   28   47:iload_1         
	//   29   48:iload_2         
	//   30   49:invokevirtual   #44  <Method void SparseIntArray.put(int, int)>
				return j;
	//   31   52:iload_2         
	//   32   53:ireturn         
			}
		}
		return k;
	}

	public int getSpanGroupIndex(int i, int j)
	{
		int l1 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
	//    3    5:istore          7
		int i1 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          5
		int k = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		int l = 0;
	//    8   12:iconst_0        
	//    9   13:istore          4
		while(i1 < i) 
	//*  10   15:iload           5
	//*  11   17:iload_1         
	//*  12   18:icmpge          89
		{
			int j1 = getSpanSize(i1);
	//   13   21:aload_0         
	//   14   22:iload           5
	//   15   24:invokevirtual   #48  <Method int getSpanSize(int)>
	//   16   27:istore          6
			l += j1;
	//   17   29:iload           4
	//   18   31:iload           6
	//   19   33:iadd            
	//   20   34:istore          4
			if(l == j)
	//*  21   36:iload           4
	//*  22   38:iload_2         
	//*  23   39:icmpne          72
			{
				l = k + 1;
	//   24   42:iload_3         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore          4
				k = 0;
	//   28   47:iconst_0        
	//   29   48:istore_3        
			} else
	//*  30   49:iload           5
	//*  31   51:iconst_1        
	//*  32   52:iadd            
	//*  33   53:istore          6
	//*  34   55:iload_3         
	//*  35   56:istore          5
	//*  36   58:iload           4
	//*  37   60:istore_3        
	//*  38   61:iload           5
	//*  39   63:istore          4
	//*  40   65:iload           6
	//*  41   67:istore          5
	//*  42   69:goto            15
			if(l > j)
	//*  43   72:iload           4
	//*  44   74:iload_2         
	//*  45   75:icmple          106
			{
				l = k + 1;
	//   46   78:iload_3         
	//   47   79:iconst_1        
	//   48   80:iadd            
	//   49   81:istore          4
				k = j1;
	//   50   83:iload           6
	//   51   85:istore_3        
			} else
	//*  52   86:goto            49
	//*  53   89:iload_3         
	//*  54   90:istore_1        
	//*  55   91:iload           4
	//*  56   93:iload           7
	//*  57   95:iadd            
	//*  58   96:iload_2         
	//*  59   97:icmple          104
	//*  60  100:iload_3         
	//*  61  101:iconst_1        
	//*  62  102:iadd            
	//*  63  103:istore_1        
	//*  64  104:iload_1         
	//*  65  105:ireturn         
			{
				int k1 = l;
	//   66  106:iload           4
	//   67  108:istore          6
				l = k;
	//   68  110:iload_3         
	//   69  111:istore          4
				k = k1;
	//   70  113:iload           6
	//   71  115:istore_3        
			}
			j1 = i1 + 1;
			i1 = k;
			k = l;
			l = i1;
			i1 = j1;
		}
		i = k;
		if(l + l1 > j)
			i = k + 1;
		return i;
	//*  72  116:goto            49
	}

	public int getSpanIndex(int i, int j)
	{
		int k1 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
	//    3    5:istore          7
		if(k1 != j) goto _L2; else goto _L1
	//    4    7:iload           7
	//    5    9:iload_2         
	//    6   10:icmpne          15
_L1:
		return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
_L2:
		int k;
		int l;
		if(!mCacheSpanIndices || mSpanIndexCache.size() <= 0)
			break MISSING_BLOCK_LABEL_129;
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field boolean mCacheSpanIndices>
	//   11   19:ifeq            129
	//   12   22:aload_0         
	//   13   23:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   14   26:invokevirtual   #29  <Method int SparseIntArray.size()>
	//   15   29:ifle            129
		l = findReferenceIndexFromCache(i);
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokevirtual   #50  <Method int findReferenceIndexFromCache(int)>
	//   19   37:istore          4
		if(l < 0)
			break MISSING_BLOCK_LABEL_129;
	//   20   39:iload           4
	//   21   41:iflt            129
		k = mSpanIndexCache.get(l) + getSpanSize(l);
	//   22   44:aload_0         
	//   23   45:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   24   48:iload           4
	//   25   50:invokevirtual   #52  <Method int SparseIntArray.get(int)>
	//   26   53:aload_0         
	//   27   54:iload           4
	//   28   56:invokevirtual   #48  <Method int getSpanSize(int)>
	//   29   59:iadd            
	//   30   60:istore_3        
		l++;
	//   31   61:iload           4
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore          4
_L4:
		do
		{
			if(l >= i)
				continue; /* Loop/switch isn't completed */
	//   35   67:iload           4
	//   36   69:iload_1         
	//   37   70:icmpge          119
			int i1 = getSpanSize(l);
	//   38   73:aload_0         
	//   39   74:iload           4
	//   40   76:invokevirtual   #48  <Method int getSpanSize(int)>
	//   41   79:istore          5
			int j1 = k + i1;
	//   42   81:iload_3         
	//   43   82:iload           5
	//   44   84:iadd            
	//   45   85:istore          6
			if(j1 == j)
	//*  46   87:iload           6
	//*  47   89:iload_2         
	//*  48   90:icmpne          104
			{
				k = 0;
	//   49   93:iconst_0        
	//   50   94:istore_3        
			} else
	//*  51   95:iload           4
	//*  52   97:iconst_1        
	//*  53   98:iadd            
	//*  54   99:istore          4
	//*  55  101:goto            67
			{
				k = i1;
	//   56  104:iload           5
	//   57  106:istore_3        
				if(j1 <= j)
	//*  58  107:iload           6
	//*  59  109:iload_2         
	//*  60  110:icmpgt          95
					k = j1;
	//   61  113:iload           6
	//   62  115:istore_3        
			}
			l++;
		} while(true);
	//   63  116:goto            95
		if(k + k1 > j) goto _L1; else goto _L3
	//   64  119:iload_3         
	//   65  120:iload           7
	//   66  122:iadd            
	//   67  123:iload_2         
	//   68  124:icmpgt          13
_L3:
		return k;
	//   69  127:iload_3         
	//   70  128:ireturn         
		l = 0;
	//   71  129:iconst_0        
	//   72  130:istore          4
		k = 0;
	//   73  132:iconst_0        
	//   74  133:istore_3        
		  goto _L4
	//*  75  134:goto            67
	}

	public abstract int getSpanSize(int i);

	public void invalidateSpanIndexCache()
	{
		mSpanIndexCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//    2    4:invokevirtual   #56  <Method void SparseIntArray.clear()>
	//    3    7:return          
	}

	public boolean isSpanIndexCacheEnabled()
	{
		return mCacheSpanIndices;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mCacheSpanIndices>
	//    2    4:ireturn         
	}

	public void setSpanIndexCacheEnabled(boolean flag)
	{
		mCacheSpanIndices = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean mCacheSpanIndices>
	//    3    5:return          
	}

	private boolean mCacheSpanIndices;
	final SparseIntArray mSpanIndexCache = new SparseIntArray();

	public GridLayoutManager$SpanSizeLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void SparseIntArray()>
	//    6   12:putfield        #20  <Field SparseIntArray mSpanIndexCache>
		mCacheSpanIndices = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #22  <Field boolean mCacheSpanIndices>
	//   10   20:return          
	}
}
