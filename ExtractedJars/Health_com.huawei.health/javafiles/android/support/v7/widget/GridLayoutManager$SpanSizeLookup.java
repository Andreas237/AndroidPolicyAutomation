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
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int j = mSpanIndexCache.size() - 1; k <= j;)
	//*   2    2:aload_0         
	//*   3    3:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*   4    6:invokevirtual   #29  <Method int SparseIntArray.size()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_2        
	//*   8   12:iload_3         
	//*   9   13:iload_2         
	//*  10   14:icmpgt          53
		{
			int l = k + j >>> 1;
	//   11   17:iload_3         
	//   12   18:iload_2         
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
				k = l + 1;
	//   23   37:iload           4
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_3        
			else
	//*  27   42:goto            50
				j = l - 1;
	//   28   45:iload           4
	//   29   47:iconst_1        
	//   30   48:isub            
	//   31   49:istore_2        
		}

	//*  32   50:goto            12
		i = k - 1;
	//   33   53:iload_3         
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
		if(!mCacheSpanIndices)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean mCacheSpanIndices>
	//*   2    4:ifne            14
			return getSpanIndex(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #37  <Method int getSpanIndex(int, int)>
	//    7   13:ireturn         
		int k = mSpanIndexCache.get(i, -1);
	//    8   14:aload_0         
	//    9   15:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   10   18:iload_1         
	//   11   19:iconst_m1       
	//   12   20:invokevirtual   #40  <Method int SparseIntArray.get(int, int)>
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
	//   22   34:invokevirtual   #37  <Method int getSpanIndex(int, int)>
	//   23   37:istore_2        
			mSpanIndexCache.put(i, j);
	//   24   38:aload_0         
	//   25   39:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   26   42:iload_1         
	//   27   43:iload_2         
	//   28   44:invokevirtual   #44  <Method void SparseIntArray.put(int, int)>
			return j;
	//   29   47:iload_2         
	//   30   48:ireturn         
		}
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
		for(int j1 = 0; j1 < i;)
	//*   8   12:iconst_0        
	//*   9   13:istore          6
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
	//*  23   38:icmpne          52
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
					k = k1;
	//   38   65:iload           7
	//   39   67:istore_3        
					i1 = l + 1;
	//   40   68:iload           4
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:istore          5
				}
			}
			j1++;
	//   44   74:iload           6
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:istore          6
			l = i1;
	//   48   80:iload           5
	//   49   82:istore          4
		}

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
		int k1 = getSpanSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
	//    3    5:istore          7
		if(k1 == j)
	//*   4    7:iload           7
	//*   5    9:iload_2         
	//*   6   10:icmpne          15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		boolean flag = false;
	//    9   15:iconst_0        
	//   10   16:istore          5
		boolean flag1 = false;
	//   11   18:iconst_0        
	//   12   19:istore          6
		int k = ((int) (flag));
	//   13   21:iload           5
	//   14   23:istore_3        
		int l = ((int) (flag1));
	//   15   24:iload           6
	//   16   26:istore          4
		if(mCacheSpanIndices)
	//*  17   28:aload_0         
	//*  18   29:getfield        #22  <Field boolean mCacheSpanIndices>
	//*  19   32:ifeq            94
		{
			k = ((int) (flag));
	//   20   35:iload           5
	//   21   37:istore_3        
			l = ((int) (flag1));
	//   22   38:iload           6
	//   23   40:istore          4
			if(mSpanIndexCache.size() > 0)
	//*  24   42:aload_0         
	//*  25   43:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//*  26   46:invokevirtual   #29  <Method int SparseIntArray.size()>
	//*  27   49:ifle            94
			{
				int l1 = findReferenceIndexFromCache(i);
	//   28   52:aload_0         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #50  <Method int findReferenceIndexFromCache(int)>
	//   31   57:istore          8
				k = ((int) (flag));
	//   32   59:iload           5
	//   33   61:istore_3        
				l = ((int) (flag1));
	//   34   62:iload           6
	//   35   64:istore          4
				if(l1 >= 0)
	//*  36   66:iload           8
	//*  37   68:iflt            94
				{
					k = mSpanIndexCache.get(l1) + getSpanSize(l1);
	//   38   71:aload_0         
	//   39   72:getfield        #20  <Field SparseIntArray mSpanIndexCache>
	//   40   75:iload           8
	//   41   77:invokevirtual   #52  <Method int SparseIntArray.get(int)>
	//   42   80:aload_0         
	//   43   81:iload           8
	//   44   83:invokevirtual   #48  <Method int getSpanSize(int)>
	//   45   86:iadd            
	//   46   87:istore_3        
					l = l1 + 1;
	//   47   88:iload           8
	//   48   90:iconst_1        
	//   49   91:iadd            
	//   50   92:istore          4
				}
			}
		}
		for(; l < i; l++)
	//*  51   94:iload           4
	//*  52   96:iload_1         
	//*  53   97:icmpge          146
		{
			int i1 = getSpanSize(l);
	//   54  100:aload_0         
	//   55  101:iload           4
	//   56  103:invokevirtual   #48  <Method int getSpanSize(int)>
	//   57  106:istore          5
			int j1 = k + i1;
	//   58  108:iload_3         
	//   59  109:iload           5
	//   60  111:iadd            
	//   61  112:istore          6
			if(j1 == j)
	//*  62  114:iload           6
	//*  63  116:iload_2         
	//*  64  117:icmpne          125
			{
				k = 0;
	//   65  120:iconst_0        
	//   66  121:istore_3        
				continue;
	//   67  122:goto            137
			}
			k = j1;
	//   68  125:iload           6
	//   69  127:istore_3        
			if(j1 > j)
	//*  70  128:iload           6
	//*  71  130:iload_2         
	//*  72  131:icmple          137
				k = i1;
	//   73  134:iload           5
	//   74  136:istore_3        
		}

	//   75  137:iload           4
	//   76  139:iconst_1        
	//   77  140:iadd            
	//   78  141:istore          4
	//*  79  143:goto            94
		if(k + k1 <= j)
	//*  80  146:iload_3         
	//*  81  147:iload           7
	//*  82  149:iadd            
	//*  83  150:iload_2         
	//*  84  151:icmpgt          156
			return k;
	//   85  154:iload_3         
	//   86  155:ireturn         
		else
			return 0;
	//   87  156:iconst_0        
	//   88  157:ireturn         
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
