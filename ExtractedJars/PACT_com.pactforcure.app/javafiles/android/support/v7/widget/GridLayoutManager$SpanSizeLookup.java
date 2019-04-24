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
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int l = 0;
	//    2    2:iconst_0        
	//    3    3:istore          4
		int i2 = getSpanSize(i);
	//    4    5:aload_0         
	//    5    6:iload_1         
	//    6    7:invokevirtual   #48  <Method int getSpanSize(int)>
	//    7   10:istore          9
		int j1 = 0;
	//    8   12:iconst_0        
	//    9   13:istore          6
		while(j1 < i) 
	//*  10   15:iload           6
	//*  11   17:iload_1         
	//*  12   18:icmpge          87
		{
			int k1 = getSpanSize(j1);
	//   13   21:aload_0         
	//   14   22:iload           6
	//   15   24:invokevirtual   #48  <Method int getSpanSize(int)>
	//   16   27:istore          7
			int l1 = k + k1;
	//   17   29:iload_3         
	//   18   30:iload           7
	//   19   32:iadd            
	//   20   33:istore          8
			int i1;
			if(l1 == j)
	//*  21   35:iload           8
	//*  22   37:iload_2         
	//*  23   38:icmpne          62
			{
				k = 0;
	//   24   41:iconst_0        
	//   25   42:istore_3        
				i1 = l + 1;
	//   26   43:iload           4
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore          5
			} else
	//*  30   49:iload           6
	//*  31   51:iconst_1        
	//*  32   52:iadd            
	//*  33   53:istore          6
	//*  34   55:iload           5
	//*  35   57:istore          4
	//*  36   59:goto            15
			{
				i1 = l;
	//   37   62:iload           4
	//   38   64:istore          5
				k = l1;
	//   39   66:iload           8
	//   40   68:istore_3        
				if(l1 > j)
	//*  41   69:iload           8
	//*  42   71:iload_2         
	//*  43   72:icmple          49
				{
					k = k1;
	//   44   75:iload           7
	//   45   77:istore_3        
					i1 = l + 1;
	//   46   78:iload           4
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:istore          5
				}
			}
			j1++;
			l = i1;
		}
	//*  50   84:goto            49
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
		int k1 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
	//    3    5:istore          7
		if(k1 == j)
	//*   4    7:iload           7
	//*   5    9:iload_2         
	//*   6   10:icmpne          17
		{
			i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		} else
	//*   9   15:iload_1         
	//*  10   16:ireturn         
		{
			boolean flag = false;
	//   11   17:iconst_0        
	//   12   18:istore          5
			boolean flag1 = false;
	//   13   20:iconst_0        
	//   14   21:istore          6
			int k = ((int) (flag));
	//   15   23:iload           5
	//   16   25:istore_3        
			int l = ((int) (flag1));
	//   17   26:iload           6
	//   18   28:istore          4
			if(mCacheSpanIndices)
	//*  19   30:aload_0         
	//*  20   31:getfield        #22  <Field boolean mCacheSpanIndices>
	//*  21   34:ifeq            96
			{
				k = ((int) (flag));
	//   22   37:iload           5
	//   23   39:istore_3        
				l = ((int) (flag1));
	//   24   40:iload           6
	//   25   42:istore          4
				if(mSpanIndexCache.size() > 0)
	//*  26   44:aload_0         
	//*  27   45:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*  28   48:invokevirtual   #29  <Method int SparseIntArray.size()>
	//*  29   51:ifle            96
				{
					int l1 = findReferenceIndexFromCache(i);
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #50  <Method int findReferenceIndexFromCache(int)>
	//   33   59:istore          8
					k = ((int) (flag));
	//   34   61:iload           5
	//   35   63:istore_3        
					l = ((int) (flag1));
	//   36   64:iload           6
	//   37   66:istore          4
					if(l1 >= 0)
	//*  38   68:iload           8
	//*  39   70:iflt            96
					{
						k = mSpanIndexCache.get(l1) + getSpanSize(l1);
	//   40   73:aload_0         
	//   41   74:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   42   77:iload           8
	//   43   79:invokevirtual   #52  <Method int SparseIntArray.get(int)>
	//   44   82:aload_0         
	//   45   83:iload           8
	//   46   85:invokevirtual   #48  <Method int getSpanSize(int)>
	//   47   88:iadd            
	//   48   89:istore_3        
						l = l1 + 1;
	//   49   90:iload           8
	//   50   92:iconst_1        
	//   51   93:iadd            
	//   52   94:istore          4
					}
				}
			}
			while(l < i) 
	//*  53   96:iload           4
	//*  54   98:iload_1         
	//*  55   99:icmpge          148
			{
				int i1 = getSpanSize(l);
	//   56  102:aload_0         
	//   57  103:iload           4
	//   58  105:invokevirtual   #48  <Method int getSpanSize(int)>
	//   59  108:istore          5
				int j1 = k + i1;
	//   60  110:iload_3         
	//   61  111:iload           5
	//   62  113:iadd            
	//   63  114:istore          6
				if(j1 == j)
	//*  64  116:iload           6
	//*  65  118:iload_2         
	//*  66  119:icmpne          133
				{
					k = 0;
	//   67  122:iconst_0        
	//   68  123:istore_3        
				} else
	//*  69  124:iload           4
	//*  70  126:iconst_1        
	//*  71  127:iadd            
	//*  72  128:istore          4
	//*  73  130:goto            96
				{
					k = j1;
	//   74  133:iload           6
	//   75  135:istore_3        
					if(j1 > j)
	//*  76  136:iload           6
	//*  77  138:iload_2         
	//*  78  139:icmple          124
						k = i1;
	//   79  142:iload           5
	//   80  144:istore_3        
				}
				l++;
			}
	//*  81  145:goto            124
			i = k;
	//   82  148:iload_3         
	//   83  149:istore_1        
			if(k + k1 > j)
	//*  84  150:iload_3         
	//*  85  151:iload           7
	//*  86  153:iadd            
	//*  87  154:iload_2         
	//*  88  155:icmple          15
				return 0;
	//   89  158:iconst_0        
	//   90  159:ireturn         
		}
		return i;
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
