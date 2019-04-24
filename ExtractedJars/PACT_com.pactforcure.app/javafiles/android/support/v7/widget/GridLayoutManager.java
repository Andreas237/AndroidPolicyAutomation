// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.*;
import android.view.View;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager, OrientationHelper, RecyclerView

public class GridLayoutManager extends LinearLayoutManager
{
	public static final class DefaultSpanSizeLookup extends SpanSizeLookup
	{

		public int getSpanIndex(int i, int j)
		{
			return i % j;
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:irem            
		//    3    3:ireturn         
		}

		public int getSpanSize(int i)
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public DefaultSpanSizeLookup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void GridLayoutManager$SpanSizeLookup()>
		//    2    4:return          
		}
	}

	public static class LayoutParams extends RecyclerView.LayoutParams
	{

		public int getSpanIndex()
		{
			return mSpanIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int mSpanIndex>
		//    2    4:ireturn         
		}

		public int getSpanSize()
		{
			return mSpanSize;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int mSpanSize>
		//    2    4:ireturn         
		}

		public static final int INVALID_SPAN_ID = -1;
		int mSpanIndex;
		int mSpanSize;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #16  <Method void RecyclerView$LayoutParams(int, int)>
			mSpanIndex = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #18  <Field int mSpanIndex>
			mSpanSize = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #20  <Field int mSpanSize>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
			mSpanIndex = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #18  <Field int mSpanIndex>
			mSpanSize = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #20  <Field int mSpanSize>
		//   10   16:return          
		}

		public LayoutParams(RecyclerView.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
			mSpanIndex = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #18  <Field int mSpanIndex>
			mSpanSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #20  <Field int mSpanSize>
		//    9   15:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mSpanIndex = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #18  <Field int mSpanIndex>
			mSpanSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #20  <Field int mSpanSize>
		//    9   15:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mSpanIndex = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #18  <Field int mSpanIndex>
			mSpanSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #20  <Field int mSpanSize>
		//    9   15:return          
		}
	}

	public static abstract class SpanSizeLookup
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

		public SpanSizeLookup()
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


	public GridLayoutManager(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void LinearLayoutManager(Context)>
		mPendingSpanCountChange = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #43  <Field boolean mPendingSpanCountChange>
		mSpanCount = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #45  <Field int mSpanCount>
		mPreLayoutSpanSizeCache = new SparseIntArray();
	//    9   15:aload_0         
	//   10   16:new             #47  <Class SparseIntArray>
	//   11   19:dup             
	//   12   20:invokespecial   #50  <Method void SparseIntArray()>
	//   13   23:putfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
		mPreLayoutSpanIndexCache = new SparseIntArray();
	//   14   26:aload_0         
	//   15   27:new             #47  <Class SparseIntArray>
	//   16   30:dup             
	//   17   31:invokespecial   #50  <Method void SparseIntArray()>
	//   18   34:putfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
		mSpanSizeLookup = ((SpanSizeLookup) (new DefaultSpanSizeLookup()));
	//   19   37:aload_0         
	//   20   38:new             #6   <Class GridLayoutManager$DefaultSpanSizeLookup>
	//   21   41:dup             
	//   22   42:invokespecial   #55  <Method void GridLayoutManager$DefaultSpanSizeLookup()>
	//   23   45:putfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
		mDecorInsets = new Rect();
	//   24   48:aload_0         
	//   25   49:new             #59  <Class Rect>
	//   26   52:dup             
	//   27   53:invokespecial   #60  <Method void Rect()>
	//   28   56:putfield        #62  <Field Rect mDecorInsets>
		setSpanCount(i);
	//   29   59:aload_0         
	//   30   60:iload_2         
	//   31   61:invokevirtual   #66  <Method void setSpanCount(int)>
	//   32   64:return          
	}

	public GridLayoutManager(Context context, int i, int j, boolean flag)
	{
		super(context, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #71  <Method void LinearLayoutManager(Context, int, boolean)>
		mPendingSpanCountChange = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #43  <Field boolean mPendingSpanCountChange>
		mSpanCount = -1;
	//    8   13:aload_0         
	//    9   14:iconst_m1       
	//   10   15:putfield        #45  <Field int mSpanCount>
		mPreLayoutSpanSizeCache = new SparseIntArray();
	//   11   18:aload_0         
	//   12   19:new             #47  <Class SparseIntArray>
	//   13   22:dup             
	//   14   23:invokespecial   #50  <Method void SparseIntArray()>
	//   15   26:putfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
		mPreLayoutSpanIndexCache = new SparseIntArray();
	//   16   29:aload_0         
	//   17   30:new             #47  <Class SparseIntArray>
	//   18   33:dup             
	//   19   34:invokespecial   #50  <Method void SparseIntArray()>
	//   20   37:putfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
		mSpanSizeLookup = ((SpanSizeLookup) (new DefaultSpanSizeLookup()));
	//   21   40:aload_0         
	//   22   41:new             #6   <Class GridLayoutManager$DefaultSpanSizeLookup>
	//   23   44:dup             
	//   24   45:invokespecial   #55  <Method void GridLayoutManager$DefaultSpanSizeLookup()>
	//   25   48:putfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
		mDecorInsets = new Rect();
	//   26   51:aload_0         
	//   27   52:new             #59  <Class Rect>
	//   28   55:dup             
	//   29   56:invokespecial   #60  <Method void Rect()>
	//   30   59:putfield        #62  <Field Rect mDecorInsets>
		setSpanCount(i);
	//   31   62:aload_0         
	//   32   63:iload_2         
	//   33   64:invokevirtual   #66  <Method void setSpanCount(int)>
	//   34   67:return          
	}

	public GridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #74  <Method void LinearLayoutManager(Context, AttributeSet, int, int)>
		mPendingSpanCountChange = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #43  <Field boolean mPendingSpanCountChange>
		mSpanCount = -1;
	//    9   14:aload_0         
	//   10   15:iconst_m1       
	//   11   16:putfield        #45  <Field int mSpanCount>
		mPreLayoutSpanSizeCache = new SparseIntArray();
	//   12   19:aload_0         
	//   13   20:new             #47  <Class SparseIntArray>
	//   14   23:dup             
	//   15   24:invokespecial   #50  <Method void SparseIntArray()>
	//   16   27:putfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
		mPreLayoutSpanIndexCache = new SparseIntArray();
	//   17   30:aload_0         
	//   18   31:new             #47  <Class SparseIntArray>
	//   19   34:dup             
	//   20   35:invokespecial   #50  <Method void SparseIntArray()>
	//   21   38:putfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
		mSpanSizeLookup = ((SpanSizeLookup) (new DefaultSpanSizeLookup()));
	//   22   41:aload_0         
	//   23   42:new             #6   <Class GridLayoutManager$DefaultSpanSizeLookup>
	//   24   45:dup             
	//   25   46:invokespecial   #55  <Method void GridLayoutManager$DefaultSpanSizeLookup()>
	//   26   49:putfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
		mDecorInsets = new Rect();
	//   27   52:aload_0         
	//   28   53:new             #59  <Class Rect>
	//   29   56:dup             
	//   30   57:invokespecial   #60  <Method void Rect()>
	//   31   60:putfield        #62  <Field Rect mDecorInsets>
		setSpanCount(getProperties(context, attributeset, i, j).spanCount);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:iload_3         
	//   36   67:iload           4
	//   37   69:invokestatic    #78  <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   38   72:getfield        #83  <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   39   75:invokevirtual   #66  <Method void setSpanCount(int)>
	//   40   78:return          
	}

	private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, boolean flag)
	{
		int k;
		int l;
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            86
		{
			boolean flag1 = false;
	//    2    5:iconst_0        
	//    3    6:istore          7
			k = i;
	//    4    8:iload_3         
	//    5    9:istore          6
			j = 1;
	//    6   11:iconst_1        
	//    7   12:istore          4
			i = ((int) (flag1));
	//    8   14:iload           7
	//    9   16:istore_3        
		} else
	//*  10   17:iconst_0        
	//*  11   18:istore          7
	//*  12   20:iload_3         
	//*  13   21:iload           6
	//*  14   23:icmpeq          99
	//*  15   26:aload_0         
	//*  16   27:getfield        #87  <Field View[] mSet>
	//*  17   30:iload_3         
	//*  18   31:aaload          
	//*  19   32:astore          8
	//*  20   34:aload           8
	//*  21   36:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  22   39:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//*  23   42:astore          9
	//*  24   44:aload           9
	//*  25   46:aload_0         
	//*  26   47:aload_1         
	//*  27   48:aload_2         
	//*  28   49:aload_0         
	//*  29   50:aload           8
	//*  30   52:invokevirtual   #97  <Method int getPosition(View)>
	//*  31   55:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  32   58:putfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//*  33   61:aload           9
	//*  34   63:iload           7
	//*  35   65:putfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//*  36   68:iload           7
	//*  37   70:aload           9
	//*  38   72:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//*  39   75:iadd            
	//*  40   76:istore          7
	//*  41   78:iload_3         
	//*  42   79:iload           4
	//*  43   81:iadd            
	//*  44   82:istore_3        
	//*  45   83:goto            20
		{
			i--;
	//   46   86:iload_3         
	//   47   87:iconst_1        
	//   48   88:isub            
	//   49   89:istore_3        
			k = -1;
	//   50   90:iconst_m1       
	//   51   91:istore          6
			j = -1;
	//   52   93:iconst_m1       
	//   53   94:istore          4
		}
		l = 0;
		for(; i != k; i += j)
		{
			View view = mSet[i];
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
			layoutparams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
			layoutparams.mSpanIndex = l;
			l += layoutparams.mSpanSize;
		}

	//*  54   96:goto            17
	//   55   99:return          
	}

	private void cachePreLayoutSpanMapping()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          64
		{
			LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #116 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   23:astore          4
			int k = layoutparams.getViewLayoutPosition();
	//   14   25:aload           4
	//   15   27:invokevirtual   #119 <Method int GridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   16   30:istore_3        
			mPreLayoutSpanSizeCache.put(k, layoutparams.getSpanSize());
	//   17   31:aload_0         
	//   18   32:getfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//   19   35:iload_3         
	//   20   36:aload           4
	//   21   38:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   22   41:invokevirtual   #125 <Method void SparseIntArray.put(int, int)>
			mPreLayoutSpanIndexCache.put(k, layoutparams.getSpanIndex());
	//   23   44:aload_0         
	//   24   45:getfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//   25   48:iload_3         
	//   26   49:aload           4
	//   27   51:invokevirtual   #128 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   28   54:invokevirtual   #125 <Method void SparseIntArray.put(int, int)>
		}

	//   29   57:iload_1         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_1        
	//*  33   61:goto            7
	//   34   64:return          
	}

	private void calculateItemBorders(int i)
	{
		mCachedBorders = calculateItemBorders(mCachedBorders, mSpanCount, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #131 <Field int[] mCachedBorders>
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field int mSpanCount>
	//    5    9:iload_1         
	//    6   10:invokestatic    #134 <Method int[] calculateItemBorders(int[], int, int)>
	//    7   13:putfield        #131 <Field int[] mCachedBorders>
	//    8   16:return          
	}

	static int[] calculateItemBorders(int ai[], int i, int j)
	{
		int ai1[];
label0:
		{
			if(ai != null && ai.length == i + 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iload_1         
	//*   5    7:iconst_1        
	//*   6    8:iadd            
	//*   7    9:icmpne          25
			{
				ai1 = ai;
	//    8   12:aload_0         
	//    9   13:astore          10
				if(ai[ai.length - 1] == j)
					break label0;
	//   10   15:aload_0         
	//   11   16:aload_0         
	//   12   17:arraylength     
	//   13   18:iconst_1        
	//   14   19:isub            
	//   15   20:iaload          
	//   16   21:iload_2         
	//   17   22:icmpeq          32
			}
			ai1 = new int[i + 1];
	//   18   25:iload_1         
	//   19   26:iconst_1        
	//   20   27:iadd            
	//   21   28:newarray        int[]
	//   22   30:astore          10
		}
		ai1[0] = 0;
	//   23   32:aload           10
	//   24   34:iconst_0        
	//   25   35:iconst_0        
	//   26   36:iastore         
		int k1 = j / i;
	//   27   37:iload_2         
	//   28   38:iload_1         
	//   29   39:idiv            
	//   30   40:istore          7
		int i2 = j % i;
	//   31   42:iload_2         
	//   32   43:iload_1         
	//   33   44:irem            
	//   34   45:istore          9
		int l = 0;
	//   35   47:iconst_0        
	//   36   48:istore          4
		j = 0;
	//   37   50:iconst_0        
	//   38   51:istore_2        
		for(int k = 1; k <= i; k++)
	//*  39   52:iconst_1        
	//*  40   53:istore_3        
	//*  41   54:iload_3         
	//*  42   55:iload_1         
	//*  43   56:icmpgt          128
		{
			int i1 = k1;
	//   44   59:iload           7
	//   45   61:istore          5
			int l1 = j + i2;
	//   46   63:iload_2         
	//   47   64:iload           9
	//   48   66:iadd            
	//   49   67:istore          8
			j = l1;
	//   50   69:iload           8
	//   51   71:istore_2        
			int j1 = i1;
	//   52   72:iload           5
	//   53   74:istore          6
			if(l1 > 0)
	//*  54   76:iload           8
	//*  55   78:ifle            108
			{
				j = l1;
	//   56   81:iload           8
	//   57   83:istore_2        
				j1 = i1;
	//   58   84:iload           5
	//   59   86:istore          6
				if(i - l1 < i2)
	//*  60   88:iload_1         
	//*  61   89:iload           8
	//*  62   91:isub            
	//*  63   92:iload           9
	//*  64   94:icmpge          108
				{
					j1 = i1 + 1;
	//   65   97:iload           5
	//   66   99:iconst_1        
	//   67  100:iadd            
	//   68  101:istore          6
					j = l1 - i;
	//   69  103:iload           8
	//   70  105:iload_1         
	//   71  106:isub            
	//   72  107:istore_2        
				}
			}
			l += j1;
	//   73  108:iload           4
	//   74  110:iload           6
	//   75  112:iadd            
	//   76  113:istore          4
			ai1[k] = l;
	//   77  115:aload           10
	//   78  117:iload_3         
	//   79  118:iload           4
	//   80  120:iastore         
		}

	//   81  121:iload_3         
	//   82  122:iconst_1        
	//   83  123:iadd            
	//   84  124:istore_3        
	//*  85  125:goto            54
		return ai1;
	//   86  128:aload           10
	//   87  130:areturn         
	}

	private void clearPreLayoutSpanMappingCache()
	{
		mPreLayoutSpanSizeCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//    2    4:invokevirtual   #138 <Method void SparseIntArray.clear()>
		mPreLayoutSpanIndexCache.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//    5   11:invokevirtual   #138 <Method void SparseIntArray.clear()>
	//    6   14:return          
	}

	private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(i != 1)
	//*   2    3:iload           4
	//*   3    5:iconst_1        
	//*   4    6:icmpne          63
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  10   16:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  11   19:istore          4
	//*  12   21:iload           5
	//*  13   23:ifeq            69
	//*  14   26:iload           4
	//*  15   28:ifle            128
	//*  16   31:aload_3         
	//*  17   32:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  18   35:ifle            128
	//*  19   38:aload_3         
	//*  20   39:aload_3         
	//*  21   40:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  22   43:iconst_1        
	//*  23   44:isub            
	//*  24   45:putfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  25   48:aload_0         
	//*  26   49:aload_1         
	//*  27   50:aload_2         
	//*  28   51:aload_3         
	//*  29   52:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  30   55:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  31   58:istore          4
	//*  32   60:goto            26
			flag = false;
	//   33   63:iconst_0        
	//   34   64:istore          5
		i = getSpanIndex(recycler, state, anchorinfo.mPosition);
		if(flag)
		{
			for(; i > 0 && anchorinfo.mPosition > 0; i = getSpanIndex(recycler, state, anchorinfo.mPosition))
				anchorinfo.mPosition = anchorinfo.mPosition - 1;

		} else
	//*  35   66:goto            9
		{
			int l = state.getItemCount();
	//   36   69:aload_2         
	//   37   70:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//   38   73:istore          7
			int j = anchorinfo.mPosition;
	//   39   75:aload_3         
	//   40   76:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   41   79:istore          5
			do
			{
				if(j >= l - 1)
					break;
	//   42   81:iload           5
	//   43   83:iload           7
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:icmpge          122
				int k = getSpanIndex(recycler, state, j + 1);
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:iload           5
	//   51   95:iconst_1        
	//   52   96:iadd            
	//   53   97:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   54  100:istore          6
				if(k <= i)
					break;
	//   55  102:iload           6
	//   56  104:iload           4
	//   57  106:icmple          122
				j++;
	//   58  109:iload           5
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore          5
				i = k;
	//   62  115:iload           6
	//   63  117:istore          4
			} while(true);
	//   64  119:goto            81
			anchorinfo.mPosition = j;
	//   65  122:aload_3         
	//   66  123:iload           5
	//   67  125:putfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		}
	//   68  128:return          
	}

	private void ensureViewSet()
	{
		if(mSet == null || mSet.length != mSpanCount)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field View[] mSet>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #87  <Field View[] mSet>
	//*   5   11:arraylength     
	//*   6   12:aload_0         
	//*   7   13:getfield        #45  <Field int mSpanCount>
	//*   8   16:icmpeq          30
			mSet = new View[mSpanCount];
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field int mSpanCount>
	//   12   24:anewarray       View[]
	//   13   27:putfield        #87  <Field View[] mSet>
	//   14   30:return          
	}

	private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            20
			return mSpanSizeLookup.getSpanGroupIndex(i, mSpanCount);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field int mSpanCount>
	//    8   16:invokevirtual   #161 <Method int GridLayoutManager$SpanSizeLookup.getSpanGroupIndex(int, int)>
	//    9   19:ireturn         
		int j = recycler.convertPreLayoutPositionToPostLayout(i);
	//   10   20:aload_1         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #167 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   13   25:istore          4
		if(j == -1)
	//*  14   27:iload           4
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          60
		{
			Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. ").append(i).toString());
	//   17   33:ldc1            #23  <String "GridLayoutManager">
	//   18   35:new             #169 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #170 <Method void StringBuilder()>
	//   21   42:ldc1            #172 <String "Cannot find span size for pre layout position. ">
	//   22   44:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:iload_3         
	//   24   48:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   25   51:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   26   54:invokestatic    #189 <Method int Log.w(String, String)>
	//   27   57:pop             
			return 0;
	//   28   58:iconst_0        
	//   29   59:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanGroupIndex(j, mSpanCount);
	//   30   60:aload_0         
	//   31   61:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   32   64:iload           4
	//   33   66:aload_0         
	//   34   67:getfield        #45  <Field int mSpanCount>
	//   35   70:invokevirtual   #161 <Method int GridLayoutManager$SpanSizeLookup.getSpanGroupIndex(int, int)>
	//   36   73:ireturn         
		}
	}

	private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		int j;
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            24
		{
			j = mSpanSizeLookup.getCachedSpanIndex(i, mSpanCount);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field int mSpanCount>
	//    8   16:invokevirtual   #192 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//    9   19:istore          4
		} else
	//*  10   21:iload           4
	//*  11   23:ireturn         
		{
			int l = mPreLayoutSpanIndexCache.get(i, -1);
	//   12   24:aload_0         
	//   13   25:getfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//   14   28:iload_3         
	//   15   29:iconst_m1       
	//   16   30:invokevirtual   #195 <Method int SparseIntArray.get(int, int)>
	//   17   33:istore          5
			j = l;
	//   18   35:iload           5
	//   19   37:istore          4
			if(l == -1)
	//*  20   39:iload           5
	//*  21   41:iconst_m1       
	//*  22   42:icmpne          21
			{
				int k = recycler.convertPreLayoutPositionToPostLayout(i);
	//   23   45:aload_1         
	//   24   46:iload_3         
	//   25   47:invokevirtual   #167 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   26   50:istore          4
				if(k == -1)
	//*  27   52:iload           4
	//*  28   54:iconst_m1       
	//*  29   55:icmpne          85
				{
					Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
	//   30   58:ldc1            #23  <String "GridLayoutManager">
	//   31   60:new             #169 <Class StringBuilder>
	//   32   63:dup             
	//   33   64:invokespecial   #170 <Method void StringBuilder()>
	//   34   67:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   35   69:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:iload_3         
	//   37   73:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   38   76:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   39   79:invokestatic    #189 <Method int Log.w(String, String)>
	//   40   82:pop             
					return 0;
	//   41   83:iconst_0        
	//   42   84:ireturn         
				} else
				{
					return mSpanSizeLookup.getCachedSpanIndex(k, mSpanCount);
	//   43   85:aload_0         
	//   44   86:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   45   89:iload           4
	//   46   91:aload_0         
	//   47   92:getfield        #45  <Field int mSpanCount>
	//   48   95:invokevirtual   #192 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//   49   98:ireturn         
				}
			}
		}
		return j;
	}

	private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		int j;
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            20
		{
			j = mSpanSizeLookup.getSpanSize(i);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//    7   15:istore          4
		} else
	//*   8   17:iload           4
	//*   9   19:ireturn         
		{
			int l = mPreLayoutSpanSizeCache.get(i, -1);
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//   12   24:iload_3         
	//   13   25:iconst_m1       
	//   14   26:invokevirtual   #195 <Method int SparseIntArray.get(int, int)>
	//   15   29:istore          5
			j = l;
	//   16   31:iload           5
	//   17   33:istore          4
			if(l == -1)
	//*  18   35:iload           5
	//*  19   37:iconst_m1       
	//*  20   38:icmpne          17
			{
				int k = recycler.convertPreLayoutPositionToPostLayout(i);
	//   21   41:aload_1         
	//   22   42:iload_3         
	//   23   43:invokevirtual   #167 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   24   46:istore          4
				if(k == -1)
	//*  25   48:iload           4
	//*  26   50:iconst_m1       
	//*  27   51:icmpne          81
				{
					Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
	//   28   54:ldc1            #23  <String "GridLayoutManager">
	//   29   56:new             #169 <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #170 <Method void StringBuilder()>
	//   32   63:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   33   65:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:iload_3         
	//   35   69:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   36   72:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   37   75:invokestatic    #189 <Method int Log.w(String, String)>
	//   38   78:pop             
					return 1;
	//   39   79:iconst_1        
	//   40   80:ireturn         
				} else
				{
					return mSpanSizeLookup.getSpanSize(k);
	//   41   81:aload_0         
	//   42   82:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   43   85:iload           4
	//   44   87:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   45   90:ireturn         
				}
			}
		}
		return j;
	}

	private void guessMeasurement(float f, int i)
	{
		calculateItemBorders(Math.max(Math.round((float)mSpanCount * f), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field int mSpanCount>
	//    3    5:i2f             
	//    4    6:fload_1         
	//    5    7:fmul            
	//    6    8:invokestatic    #207 <Method int Math.round(float)>
	//    7   11:iload_2         
	//    8   12:invokestatic    #210 <Method int Math.max(int, int)>
	//    9   15:invokespecial   #212 <Method void calculateItemBorders(int)>
	//   10   18:return          
	}

	private void measureChild(View view, int i, boolean flag)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//    3    7:astore          7
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           7
	//    5   11:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//    6   14:astore          8
		int k = rect.top + rect.bottom + layoutparams.topMargin + layoutparams.bottomMargin;
	//    7   16:aload           8
	//    8   18:getfield        #218 <Field int Rect.top>
	//    9   21:aload           8
	//   10   23:getfield        #221 <Field int Rect.bottom>
	//   11   26:iadd            
	//   12   27:aload           7
	//   13   29:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//   14   32:iadd            
	//   15   33:aload           7
	//   16   35:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//   17   38:iadd            
	//   18   39:istore          5
		int j = rect.left + rect.right + layoutparams.leftMargin + layoutparams.rightMargin;
	//   19   41:aload           8
	//   20   43:getfield        #230 <Field int Rect.left>
	//   21   46:aload           8
	//   22   48:getfield        #233 <Field int Rect.right>
	//   23   51:iadd            
	//   24   52:aload           7
	//   25   54:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//   26   57:iadd            
	//   27   58:aload           7
	//   28   60:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//   29   63:iadd            
	//   30   64:istore          4
		int l = getSpaceForSpanRange(layoutparams.mSpanIndex, layoutparams.mSpanSize);
	//   31   66:aload_0         
	//   32   67:aload           7
	//   33   69:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   34   72:aload           7
	//   35   74:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   36   77:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//   37   80:istore          6
		if(mOrientation == 1)
	//*  38   82:aload_0         
	//*  39   83:getfield        #245 <Field int mOrientation>
	//*  40   86:iconst_1        
	//*  41   87:icmpne          139
		{
			j = getChildMeasureSpec(l, i, j, layoutparams.width, false);
	//   42   90:iload           6
	//   43   92:iload_2         
	//   44   93:iload           4
	//   45   95:aload           7
	//   46   97:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   47  100:iconst_0        
	//   48  101:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   49  104:istore          4
			i = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getHeightMode(), k, layoutparams.height, true);
	//   50  106:aload_0         
	//   51  107:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   52  110:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   53  113:aload_0         
	//   54  114:invokevirtual   #264 <Method int getHeightMode()>
	//   55  117:iload           5
	//   56  119:aload           7
	//   57  121:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   58  124:iconst_1        
	//   59  125:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   60  128:istore_2        
		} else
	//*  61  129:aload_0         
	//*  62  130:aload_1         
	//*  63  131:iload           4
	//*  64  133:iload_2         
	//*  65  134:iload_3         
	//*  66  135:invokespecial   #271 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//*  67  138:return          
		{
			i = getChildMeasureSpec(l, i, k, layoutparams.height, false);
	//   68  139:iload           6
	//   69  141:iload_2         
	//   70  142:iload           5
	//   71  144:aload           7
	//   72  146:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   73  149:iconst_0        
	//   74  150:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   75  153:istore_2        
			j = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), j, layoutparams.width, true);
	//   76  154:aload_0         
	//   77  155:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   78  158:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   79  161:aload_0         
	//   80  162:invokevirtual   #274 <Method int getWidthMode()>
	//   81  165:iload           4
	//   82  167:aload           7
	//   83  169:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   84  172:iconst_1        
	//   85  173:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   86  176:istore          4
		}
		measureChildWithDecorationsAndMargin(view, j, i, flag);
	//*  87  178:goto            129
	}

	private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #276 <Class RecyclerView$LayoutParams>
	//    3    7:astore          5
		if(flag)
	//*   4    9:iload           4
	//*   5   11:ifeq            37
			flag = shouldReMeasureChild(view, i, j, layoutparams);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:aload           5
	//   11   20:invokevirtual   #280 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   12   23:istore          4
		else
	//*  13   25:iload           4
	//*  14   27:ifeq            36
	//*  15   30:aload_1         
	//*  16   31:iload_2         
	//*  17   32:iload_3         
	//*  18   33:invokevirtual   #283 <Method void View.measure(int, int)>
	//*  19   36:return          
			flag = shouldMeasureChild(view, i, j, layoutparams);
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:iload_2         
	//   23   40:iload_3         
	//   24   41:aload           5
	//   25   43:invokevirtual   #286 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   26   46:istore          4
		if(flag)
			view.measure(i, j);
	//*  27   48:goto            25
	}

	private void updateMeasurements()
	{
		int i;
		if(getOrientation() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #290 <Method int getOrientation()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          29
			i = getWidth() - getPaddingRight() - getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #293 <Method int getWidth()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #296 <Method int getPaddingRight()>
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:invokevirtual   #299 <Method int getPaddingLeft()>
	//   11   21:isub            
	//   12   22:istore_1        
		else
	//*  13   23:aload_0         
	//*  14   24:iload_1         
	//*  15   25:invokespecial   #212 <Method void calculateItemBorders(int)>
	//*  16   28:return          
			i = getHeight() - getPaddingBottom() - getPaddingTop();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #302 <Method int getHeight()>
	//   19   33:aload_0         
	//   20   34:invokevirtual   #305 <Method int getPaddingBottom()>
	//   21   37:isub            
	//   22   38:aload_0         
	//   23   39:invokevirtual   #308 <Method int getPaddingTop()>
	//   24   42:isub            
	//   25   43:istore_1        
		calculateItemBorders(i);
	//*  26   44:goto            23
	}

	public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #9   <Class GridLayoutManager$LayoutParams>
	//    2    4:ireturn         
	}

	void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutstate, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int j = mSpanCount;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mSpanCount>
	//    2    4:istore          5
		for(int i = 0; i < mSpanCount && layoutstate.hasMore(state) && j > 0; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:aload_0         
	//*   7   12:getfield        #45  <Field int mSpanCount>
	//*   8   15:icmpge          89
	//*   9   18:aload_2         
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #318 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//*  12   23:ifeq            89
	//*  13   26:iload           5
	//*  14   28:ifle            89
		{
			int k = layoutstate.mCurrentPosition;
	//   15   31:aload_2         
	//   16   32:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   17   35:istore          6
			layoutprefetchregistry.addPosition(k, Math.max(0, layoutstate.mScrollingOffset));
	//   18   37:aload_3         
	//   19   38:iload           6
	//   20   40:iconst_0        
	//   21   41:aload_2         
	//   22   42:getfield        #324 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   23   45:invokestatic    #210 <Method int Math.max(int, int)>
	//   24   48:invokeinterface #329 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
			j -= mSpanSizeLookup.getSpanSize(k);
	//   25   53:iload           5
	//   26   55:aload_0         
	//   27   56:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   28   59:iload           6
	//   29   61:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   30   64:isub            
	//   31   65:istore          5
			layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + layoutstate.mItemDirection;
	//   32   67:aload_2         
	//   33   68:aload_2         
	//   34   69:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   35   72:aload_2         
	//   36   73:getfield        #332 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//   37   76:iadd            
	//   38   77:putfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		}

	//   39   80:iload           4
	//   40   82:iconst_1        
	//   41   83:iadd            
	//   42   84:istore          4
	//*  43   86:goto            9
	//   44   89:return          
	}

	View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
	{
label0:
		{
			ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method void ensureLayoutState()>
			Object obj1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          11
			Object obj = null;
	//    4    7:aconst_null     
	//    5    8:astore          10
			int i1 = mOrientationHelper.getStartAfterPadding();
	//    6   10:aload_0         
	//    7   11:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #340 <Method int OrientationHelper.getStartAfterPadding()>
	//    9   17:istore          7
			int j1 = mOrientationHelper.getEndAfterPadding();
	//   10   19:aload_0         
	//   11   20:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   12   23:invokevirtual   #343 <Method int OrientationHelper.getEndAfterPadding()>
	//   13   26:istore          8
			int l;
			View view1;
			if(j > i)
	//*  14   28:iload           4
	//*  15   30:iload_3         
	//*  16   31:icmple          121
				l = 1;
	//   17   34:iconst_1        
	//   18   35:istore          6
			else
	//*  19   37:iload_3         
	//*  20   38:iload           4
	//*  21   40:icmpeq          221
	//*  22   43:aload_0         
	//*  23   44:iload_3         
	//*  24   45:invokevirtual   #116 <Method View getChildAt(int)>
	//*  25   48:astore          12
	//*  26   50:aload_0         
	//*  27   51:aload           12
	//*  28   53:invokevirtual   #97  <Method int getPosition(View)>
	//*  29   56:istore          9
	//*  30   58:aload           11
	//*  31   60:astore          13
	//*  32   62:aload           10
	//*  33   64:astore          14
	//*  34   66:iload           9
	//*  35   68:iflt            105
	//*  36   71:aload           11
	//*  37   73:astore          13
	//*  38   75:aload           10
	//*  39   77:astore          14
	//*  40   79:iload           9
	//*  41   81:iload           5
	//*  42   83:icmpge          105
	//*  43   86:aload_0         
	//*  44   87:aload_1         
	//*  45   88:aload_2         
	//*  46   89:iload           9
	//*  47   91:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  48   94:ifeq            127
	//*  49   97:aload           10
	//*  50   99:astore          14
	//*  51  101:aload           11
	//*  52  103:astore          13
	//*  53  105:iload_3         
	//*  54  106:iload           6
	//*  55  108:iadd            
	//*  56  109:istore_3        
	//*  57  110:aload           13
	//*  58  112:astore          11
	//*  59  114:aload           14
	//*  60  116:astore          10
	//*  61  118:goto            37
				l = -1;
	//   62  121:iconst_m1       
	//   63  122:istore          6
			while(i != j) 
			{
				View view = getChildAt(i);
				int k1 = getPosition(view);
				view1 = ((View) (obj1));
				View view2 = ((View) (obj));
				if(k1 >= 0)
				{
					view1 = ((View) (obj1));
					view2 = ((View) (obj));
					if(k1 < k)
						if(getSpanIndex(recycler, state, k1) != 0)
						{
							view2 = ((View) (obj));
							view1 = ((View) (obj1));
						} else
	//*  64  124:goto            37
						if(((RecyclerView.LayoutParams)view.getLayoutParams()).isItemRemoved())
	//*  65  127:aload           12
	//*  66  129:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  67  132:checkcast       #276 <Class RecyclerView$LayoutParams>
	//*  68  135:invokevirtual   #346 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  69  138:ifeq            165
						{
							view1 = ((View) (obj1));
	//   70  141:aload           11
	//   71  143:astore          13
							view2 = ((View) (obj));
	//   72  145:aload           10
	//   73  147:astore          14
							if(obj1 == null)
	//*  74  149:aload           11
	//*  75  151:ifnonnull       105
							{
								view1 = view;
	//   76  154:aload           12
	//   77  156:astore          13
								view2 = ((View) (obj));
	//   78  158:aload           10
	//   79  160:astore          14
							}
						} else
	//*  80  162:goto            105
						{
							if(mOrientationHelper.getDecoratedStart(view) < j1)
	//*  81  165:aload_0         
	//*  82  166:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  83  169:aload           12
	//*  84  171:invokevirtual   #349 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  85  174:iload           8
	//*  86  176:icmpge          197
							{
								view1 = view;
	//   87  179:aload           12
	//   88  181:astore          13
								if(mOrientationHelper.getDecoratedEnd(view) >= i1)
									break label0;
	//   89  183:aload_0         
	//   90  184:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   91  187:aload           12
	//   92  189:invokevirtual   #352 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   93  192:iload           7
	//   94  194:icmpge          230
							}
							view1 = ((View) (obj1));
	//   95  197:aload           11
	//   96  199:astore          13
							view2 = ((View) (obj));
	//   97  201:aload           10
	//   98  203:astore          14
							if(obj == null)
	//*  99  205:aload           10
	//* 100  207:ifnonnull       105
							{
								view1 = ((View) (obj1));
	//  101  210:aload           11
	//  102  212:astore          13
								view2 = view;
	//  103  214:aload           12
	//  104  216:astore          14
							}
						}
				}
				i += l;
				obj1 = ((/*<invalid signature>*/java.lang.Object) (view1));
				obj = ((/*<invalid signature>*/java.lang.Object) (view2));
			}
	//* 105  218:goto            105
			if(obj == null)
	//* 106  221:aload           10
	//* 107  223:ifnull          233
	//* 108  226:aload           10
	//* 109  228:astore          13
	//* 110  230:aload           13
	//* 111  232:areturn         
				obj = obj1;
	//  112  233:aload           11
	//  113  235:astore          10
			view1 = ((View) (obj));
		}
		return view1;
	//* 114  237:goto            226
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field int mOrientation>
	//*   2    4:ifne            18
			return ((RecyclerView.LayoutParams) (new LayoutParams(-2, -1)));
	//    3    7:new             #9   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #356 <Method void GridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #9   <Class GridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #356 <Method void GridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #9   <Class GridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #361 <Method void GridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #364 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #9   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #364 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #367 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #9   <Class GridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #370 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return mSpanCount;
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field int mSpanCount>
	//    6   12:ireturn         
		if(state.getItemCount() < 1)
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//*   9   17:iconst_1        
	//*  10   18:icmpge          23
			return 0;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		else
			return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field int mOrientation>
	//*   2    4:ifne            12
			return mSpanCount;
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field int mSpanCount>
	//    5   11:ireturn         
		if(state.getItemCount() < 1)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//*   8   16:iconst_1        
	//*   9   17:icmpge          22
			return 0;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		else
			return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	int getSpaceForSpanRange(int i, int j)
	{
		if(mOrientation == 1 && isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          41
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//*   6   12:ifeq            41
			return mCachedBorders[mSpanCount - i] - mCachedBorders[mSpanCount - i - j];
	//    7   15:aload_0         
	//    8   16:getfield        #131 <Field int[] mCachedBorders>
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field int mSpanCount>
	//   11   23:iload_1         
	//   12   24:isub            
	//   13   25:iaload          
	//   14   26:aload_0         
	//   15   27:getfield        #131 <Field int[] mCachedBorders>
	//   16   30:aload_0         
	//   17   31:getfield        #45  <Field int mSpanCount>
	//   18   34:iload_1         
	//   19   35:isub            
	//   20   36:iload_2         
	//   21   37:isub            
	//   22   38:iaload          
	//   23   39:isub            
	//   24   40:ireturn         
		else
			return mCachedBorders[i + j] - mCachedBorders[i];
	//   25   41:aload_0         
	//   26   42:getfield        #131 <Field int[] mCachedBorders>
	//   27   45:iload_1         
	//   28   46:iload_2         
	//   29   47:iadd            
	//   30   48:iaload          
	//   31   49:aload_0         
	//   32   50:getfield        #131 <Field int[] mCachedBorders>
	//   33   53:iload_1         
	//   34   54:iaload          
	//   35   55:isub            
	//   36   56:ireturn         
	}

	public int getSpanCount()
	{
		return mSpanCount;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mSpanCount>
	//    2    4:ireturn         
	}

	public SpanSizeLookup getSpanSizeLookup()
	{
		return mSpanSizeLookup;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:areturn         
	}

	void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutstate, LinearLayoutManager.LayoutChunkResult layoutchunkresult)
	{
		int i;
		boolean flag;
		int j1;
		int k1;
		int l1;
		int i2;
		int i4;
		boolean flag1;
		i4 = mOrientationHelper.getModeInOther();
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #386 <Method int OrientationHelper.getModeInOther()>
	//    3    7:istore          15
		int j3;
		if(i4 != 0x40000000)
	//*   4    9:iload           15
	//*   5   11:ldc2            #387 <Int 0x40000000>
	//*   6   14:icmpeq          220
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          9
		else
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #112 <Method int getChildCount()>
	//*  11   24:ifle            226
	//*  12   27:aload_0         
	//*  13   28:getfield        #131 <Field int[] mCachedBorders>
	//*  14   31:aload_0         
	//*  15   32:getfield        #45  <Field int mSpanCount>
	//*  16   35:iaload          
	//*  17   36:istore          11
	//*  18   38:iload           9
	//*  19   40:ifeq            47
	//*  20   43:aload_0         
	//*  21   44:invokespecial   #389 <Method void updateMeasurements()>
	//*  22   47:aload_3         
	//*  23   48:getfield        #332 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  24   51:iconst_1        
	//*  25   52:icmpne          232
	//*  26   55:iconst_1        
	//*  27   56:istore          16
	//*  28   58:iconst_0        
	//*  29   59:istore          13
	//*  30   61:iconst_0        
	//*  31   62:istore          14
	//*  32   64:aload_0         
	//*  33   65:getfield        #45  <Field int mSpanCount>
	//*  34   68:istore          8
	//*  35   70:iload           13
	//*  36   72:istore          12
	//*  37   74:iload           14
	//*  38   76:istore          10
	//*  39   78:iload           16
	//*  40   80:ifne            114
	//*  41   83:aload_0         
	//*  42   84:aload_1         
	//*  43   85:aload_2         
	//*  44   86:aload_3         
	//*  45   87:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  46   90:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  47   93:aload_0         
	//*  48   94:aload_1         
	//*  49   95:aload_2         
	//*  50   96:aload_3         
	//*  51   97:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  52  100:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  53  103:iadd            
	//*  54  104:istore          8
	//*  55  106:iload           14
	//*  56  108:istore          10
	//*  57  110:iload           13
	//*  58  112:istore          12
	//*  59  114:iload           12
	//*  60  116:aload_0         
	//*  61  117:getfield        #45  <Field int mSpanCount>
	//*  62  120:icmpge          250
	//*  63  123:aload_3         
	//*  64  124:aload_2         
	//*  65  125:invokevirtual   #318 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//*  66  128:ifeq            250
	//*  67  131:iload           8
	//*  68  133:ifle            250
	//*  69  136:aload_3         
	//*  70  137:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  71  140:istore          14
	//*  72  142:aload_0         
	//*  73  143:aload_1         
	//*  74  144:aload_2         
	//*  75  145:iload           14
	//*  76  147:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  77  150:istore          13
	//*  78  152:iload           13
	//*  79  154:aload_0         
	//*  80  155:getfield        #45  <Field int mSpanCount>
	//*  81  158:icmple          238
	//*  82  161:new             #391 <Class IllegalArgumentException>
	//*  83  164:dup             
	//*  84  165:new             #169 <Class StringBuilder>
	//*  85  168:dup             
	//*  86  169:invokespecial   #170 <Method void StringBuilder()>
	//*  87  172:ldc2            #393 <String "Item at position ">
	//*  88  175:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//*  89  178:iload           14
	//*  90  180:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//*  91  183:ldc2            #395 <String " requires ">
	//*  92  186:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//*  93  189:iload           13
	//*  94  191:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//*  95  194:ldc2            #397 <String " spans but GridLayoutManager has only ">
	//*  96  197:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//*  97  200:aload_0         
	//*  98  201:getfield        #45  <Field int mSpanCount>
	//*  99  204:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//* 100  207:ldc2            #399 <String " spans.">
	//* 101  210:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//* 102  213:invokevirtual   #183 <Method String StringBuilder.toString()>
	//* 103  216:invokespecial   #402 <Method void IllegalArgumentException(String)>
	//* 104  219:athrow          
			flag = false;
	//  105  220:iconst_0        
	//  106  221:istore          9
		if(getChildCount() > 0)
			k1 = mCachedBorders[mSpanCount];
		else
	//* 107  223:goto            20
			k1 = 0;
	//  108  226:iconst_0        
	//  109  227:istore          11
		if(flag)
			updateMeasurements();
		if(layoutstate.mItemDirection == 1)
			flag1 = true;
		else
	//* 110  229:goto            38
			flag1 = false;
	//  111  232:iconst_0        
	//  112  233:istore          16
		i2 = 0;
		j3 = 0;
		i = mSpanCount;
		l1 = i2;
		j1 = j3;
		if(!flag1)
		{
			i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
			j1 = j3;
			l1 = i2;
		}
_L6:
		if(l1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0) goto _L2; else goto _L1
_L1:
		j3 = layoutstate.mCurrentPosition;
		i2 = getSpanSize(recycler, state, j3);
		if(i2 > mSpanCount)
			throw new IllegalArgumentException((new StringBuilder()).append("Item at position ").append(j3).append(" requires ").append(i2).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
	//* 113  235:goto            58
		i -= i2;
	//  114  238:iload           8
	//  115  240:iload           13
	//  116  242:isub            
	//  117  243:istore          8
		if(i >= 0) goto _L3; else goto _L2
	//  118  245:iload           8
	//  119  247:ifge            262
_L2:
		View view;
		if(l1 == 0)
	//* 120  250:iload           12
	//* 121  252:ifne            299
		{
			layoutchunkresult.mFinished = true;
	//  122  255:aload           4
	//  123  257:iconst_1        
	//  124  258:putfield        #407 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//  125  261:return          
		}
		break; /* Loop/switch isn't completed */
	//* 126  262:aload_3         
	//* 127  263:aload_1         
	//* 128  264:invokevirtual   #411 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//* 129  267:astore          17
_L3:
		if((view = layoutstate.next(recycler)) == null) goto _L2; else goto _L4
	//  130  269:aload           17
	//  131  271:ifnull          250
_L4:
		j1 += i2;
	//  132  274:iload           10
	//  133  276:iload           13
	//  134  278:iadd            
	//  135  279:istore          10
		mSet[l1] = view;
	//  136  281:aload_0         
	//  137  282:getfield        #87  <Field View[] mSet>
	//  138  285:iload           12
	//  139  287:aload           17
	//  140  289:aastore         
		l1++;
	//  141  290:iload           12
	//  142  292:iconst_1        
	//  143  293:iadd            
	//  144  294:istore          12
		if(true) goto _L6; else goto _L5
	//  145  296:goto            114
_L5:
		int j = 0;
	//  146  299:iconst_0        
	//  147  300:istore          8
		float f = 0.0F;
	//  148  302:fconst_0        
	//  149  303:fstore          5
		assignSpans(recycler, state, l1, j1, flag1);
	//  150  305:aload_0         
	//  151  306:aload_1         
	//  152  307:aload_2         
	//  153  308:iload           12
	//  154  310:iload           10
	//  155  312:iload           16
	//  156  314:invokespecial   #413 <Method void assignSpans(RecyclerView$Recycler, RecyclerView$State, int, int, boolean)>
		j1 = 0;
	//  157  317:iconst_0        
	//  158  318:istore          10
		while(j1 < l1) 
	//* 159  320:iload           10
	//* 160  322:iload           12
	//* 161  324:icmpge          485
		{
			recycler = ((RecyclerView.Recycler) (mSet[j1]));
	//  162  327:aload_0         
	//  163  328:getfield        #87  <Field View[] mSet>
	//  164  331:iload           10
	//  165  333:aaload          
	//  166  334:astore_1        
			float f1;
			float f2;
			int j2;
			int k3;
			if(layoutstate.mScrapList == null)
	//* 167  335:aload_3         
	//* 168  336:getfield        #417 <Field java.util.List LinearLayoutManager$LayoutState.mScrapList>
	//* 169  339:ifnonnull       463
			{
				if(flag1)
	//* 170  342:iload           16
	//* 171  344:ifeq            454
					addView(((View) (recycler)));
	//  172  347:aload_0         
	//  173  348:aload_1         
	//  174  349:invokevirtual   #421 <Method void addView(View)>
				else
	//* 175  352:aload_0         
	//* 176  353:aload_1         
	//* 177  354:aload_0         
	//* 178  355:getfield        #62  <Field Rect mDecorInsets>
	//* 179  358:invokevirtual   #425 <Method void calculateItemDecorationsForChild(View, Rect)>
	//* 180  361:aload_0         
	//* 181  362:aload_1         
	//* 182  363:iload           15
	//* 183  365:iconst_0        
	//* 184  366:invokespecial   #427 <Method void measureChild(View, int, boolean)>
	//* 185  369:aload_0         
	//* 186  370:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 187  373:aload_1         
	//* 188  374:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 189  377:istore          14
	//* 190  379:iload           8
	//* 191  381:istore          13
	//* 192  383:iload           14
	//* 193  385:iload           8
	//* 194  387:icmple          394
	//* 195  390:iload           14
	//* 196  392:istore          13
	//* 197  394:aload_1         
	//* 198  395:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 199  398:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 200  401:astore_2        
	//* 201  402:fconst_1        
	//* 202  403:aload_0         
	//* 203  404:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 204  407:aload_1         
	//* 205  408:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//* 206  411:i2f             
	//* 207  412:fmul            
	//* 208  413:aload_2         
	//* 209  414:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//* 210  417:i2f             
	//* 211  418:fdiv            
	//* 212  419:fstore          7
	//* 213  421:fload           5
	//* 214  423:fstore          6
	//* 215  425:fload           7
	//* 216  427:fload           5
	//* 217  429:fcmpl           
	//* 218  430:ifle            437
	//* 219  433:fload           7
	//* 220  435:fstore          6
	//* 221  437:iload           10
	//* 222  439:iconst_1        
	//* 223  440:iadd            
	//* 224  441:istore          10
	//* 225  443:iload           13
	//* 226  445:istore          8
	//* 227  447:fload           6
	//* 228  449:fstore          5
	//* 229  451:goto            320
					addView(((View) (recycler)), 0);
	//  230  454:aload_0         
	//  231  455:aload_1         
	//  232  456:iconst_0        
	//  233  457:invokevirtual   #436 <Method void addView(View, int)>
			} else
	//* 234  460:goto            352
			if(flag1)
	//* 235  463:iload           16
	//* 236  465:ifeq            476
				addDisappearingView(((View) (recycler)));
	//  237  468:aload_0         
	//  238  469:aload_1         
	//  239  470:invokevirtual   #439 <Method void addDisappearingView(View)>
			else
	//* 240  473:goto            352
				addDisappearingView(((View) (recycler)), 0);
	//  241  476:aload_0         
	//  242  477:aload_1         
	//  243  478:iconst_0        
	//  244  479:invokevirtual   #441 <Method void addDisappearingView(View, int)>
			calculateItemDecorationsForChild(((View) (recycler)), mDecorInsets);
			measureChild(((View) (recycler)), i4, false);
			k3 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
			j2 = j;
			if(k3 > j)
				j2 = k3;
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
			f2 = (1.0F * (float)mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)))) / (float)((LayoutParams) (state)).mSpanSize;
			f1 = f;
			if(f2 > f)
				f1 = f2;
			j1++;
			j = j2;
			f = f1;
		}
	//* 245  482:goto            352
		j1 = j;
	//  246  485:iload           8
	//  247  487:istore          10
		if(flag)
	//* 248  489:iload           9
	//* 249  491:ifeq            574
		{
			guessMeasurement(f, k1);
	//  250  494:aload_0         
	//  251  495:fload           5
	//  252  497:iload           11
	//  253  499:invokespecial   #443 <Method void guessMeasurement(float, int)>
			j = 0;
	//  254  502:iconst_0        
	//  255  503:istore          8
			int k = 0;
	//  256  505:iconst_0        
	//  257  506:istore          9
			do
			{
				j1 = j;
	//  258  508:iload           8
	//  259  510:istore          10
				if(k >= l1)
					break;
	//  260  512:iload           9
	//  261  514:iload           12
	//  262  516:icmpge          574
				recycler = ((RecyclerView.Recycler) (mSet[k]));
	//  263  519:aload_0         
	//  264  520:getfield        #87  <Field View[] mSet>
	//  265  523:iload           9
	//  266  525:aaload          
	//  267  526:astore_1        
				measureChild(((View) (recycler)), 0x40000000, true);
	//  268  527:aload_0         
	//  269  528:aload_1         
	//  270  529:ldc2            #387 <Int 0x40000000>
	//  271  532:iconst_1        
	//  272  533:invokespecial   #427 <Method void measureChild(View, int, boolean)>
				k1 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  273  536:aload_0         
	//  274  537:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  275  540:aload_1         
	//  276  541:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  277  544:istore          11
				j1 = j;
	//  278  546:iload           8
	//  279  548:istore          10
				if(k1 > j)
	//* 280  550:iload           11
	//* 281  552:iload           8
	//* 282  554:icmple          561
					j1 = k1;
	//  283  557:iload           11
	//  284  559:istore          10
				k++;
	//  285  561:iload           9
	//  286  563:iconst_1        
	//  287  564:iadd            
	//  288  565:istore          9
				j = j1;
	//  289  567:iload           10
	//  290  569:istore          8
			} while(true);
	//  291  571:goto            508
		}
		j = 0;
	//  292  574:iconst_0        
	//  293  575:istore          8
		while(j < l1) 
	//* 294  577:iload           8
	//* 295  579:iload           12
	//* 296  581:icmpge          769
		{
			recycler = ((RecyclerView.Recycler) (mSet[j]));
	//  297  584:aload_0         
	//  298  585:getfield        #87  <Field View[] mSet>
	//  299  588:iload           8
	//  300  590:aaload          
	//  301  591:astore_1        
			if(mOrientationHelper.getDecoratedMeasurement(((View) (recycler))) != j1)
	//* 302  592:aload_0         
	//* 303  593:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 304  596:aload_1         
	//* 305  597:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 306  600:iload           10
	//* 307  602:icmpeq          727
			{
				state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  308  605:aload_1         
	//  309  606:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  310  609:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  311  612:astore_2        
				Rect rect = ((LayoutParams) (state)).mDecorInsets;
	//  312  613:aload_2         
	//  313  614:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//  314  617:astore          17
				int l = rect.top + rect.bottom + ((LayoutParams) (state)).topMargin + ((LayoutParams) (state)).bottomMargin;
	//  315  619:aload           17
	//  316  621:getfield        #218 <Field int Rect.top>
	//  317  624:aload           17
	//  318  626:getfield        #221 <Field int Rect.bottom>
	//  319  629:iadd            
	//  320  630:aload_2         
	//  321  631:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  322  634:iadd            
	//  323  635:aload_2         
	//  324  636:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  325  639:iadd            
	//  326  640:istore          9
				k1 = rect.left + rect.right + ((LayoutParams) (state)).leftMargin + ((LayoutParams) (state)).rightMargin;
	//  327  642:aload           17
	//  328  644:getfield        #230 <Field int Rect.left>
	//  329  647:aload           17
	//  330  649:getfield        #233 <Field int Rect.right>
	//  331  652:iadd            
	//  332  653:aload_2         
	//  333  654:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  334  657:iadd            
	//  335  658:aload_2         
	//  336  659:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  337  662:iadd            
	//  338  663:istore          11
				int k2 = getSpaceForSpanRange(((LayoutParams) (state)).mSpanIndex, ((LayoutParams) (state)).mSpanSize);
	//  339  665:aload_0         
	//  340  666:aload_2         
	//  341  667:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  342  670:aload_2         
	//  343  671:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  344  674:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//  345  677:istore          13
				if(mOrientation == 1)
	//* 346  679:aload_0         
	//* 347  680:getfield        #245 <Field int mOrientation>
	//* 348  683:iconst_1        
	//* 349  684:icmpne          736
				{
					k1 = getChildMeasureSpec(k2, 0x40000000, k1, ((LayoutParams) (state)).width, false);
	//  350  687:iload           13
	//  351  689:ldc2            #387 <Int 0x40000000>
	//  352  692:iload           11
	//  353  694:aload_2         
	//  354  695:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//  355  698:iconst_0        
	//  356  699:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  357  702:istore          11
					l = android.view.View.MeasureSpec.makeMeasureSpec(j1 - l, 0x40000000);
	//  358  704:iload           10
	//  359  706:iload           9
	//  360  708:isub            
	//  361  709:ldc2            #387 <Int 0x40000000>
	//  362  712:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  363  715:istore          9
				} else
	//* 364  717:aload_0         
	//* 365  718:aload_1         
	//* 366  719:iload           11
	//* 367  721:iload           9
	//* 368  723:iconst_1        
	//* 369  724:invokespecial   #271 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//* 370  727:iload           8
	//* 371  729:iconst_1        
	//* 372  730:iadd            
	//* 373  731:istore          8
	//* 374  733:goto            577
				{
					k1 = android.view.View.MeasureSpec.makeMeasureSpec(j1 - k1, 0x40000000);
	//  375  736:iload           10
	//  376  738:iload           11
	//  377  740:isub            
	//  378  741:ldc2            #387 <Int 0x40000000>
	//  379  744:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  380  747:istore          11
					l = getChildMeasureSpec(k2, 0x40000000, l, ((LayoutParams) (state)).height, false);
	//  381  749:iload           13
	//  382  751:ldc2            #387 <Int 0x40000000>
	//  383  754:iload           9
	//  384  756:aload_2         
	//  385  757:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//  386  760:iconst_0        
	//  387  761:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  388  764:istore          9
				}
				measureChildWithDecorationsAndMargin(((View) (recycler)), k1, l, true);
			}
			j++;
		}
	//* 389  766:goto            717
		layoutchunkresult.mConsumed = j1;
	//  390  769:aload           4
	//  391  771:iload           10
	//  392  773:putfield        #451 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		j = 0;
	//  393  776:iconst_0        
	//  394  777:istore          8
		int l2 = 0;
	//  395  779:iconst_0        
	//  396  780:istore          13
		int i1 = 0;
	//  397  782:iconst_0        
	//  398  783:istore          9
		k1 = 0;
	//  399  785:iconst_0        
	//  400  786:istore          11
		int l3;
		if(mOrientation == 1)
	//* 401  788:aload_0         
	//* 402  789:getfield        #245 <Field int mOrientation>
	//* 403  792:iconst_1        
	//* 404  793:icmpne          985
		{
			if(layoutstate.mLayoutDirection == -1)
	//* 405  796:aload_3         
	//* 406  797:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 407  800:iconst_m1       
	//* 408  801:icmpne          965
			{
				k1 = layoutstate.mOffset;
	//  409  804:aload_3         
	//  410  805:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  411  808:istore          11
				i1 = k1 - j1;
	//  412  810:iload           11
	//  413  812:iload           10
	//  414  814:isub            
	//  415  815:istore          9
				j1 = l2;
	//  416  817:iload           13
	//  417  819:istore          10
			} else
	//* 418  821:iconst_0        
	//* 419  822:istore          13
	//* 420  824:iload           10
	//* 421  826:istore          14
	//* 422  828:iload           9
	//* 423  830:istore          10
	//* 424  832:iload           13
	//* 425  834:iload           12
	//* 426  836:icmpge          1097
	//* 427  839:aload_0         
	//* 428  840:getfield        #87  <Field View[] mSet>
	//* 429  843:iload           13
	//* 430  845:aaload          
	//* 431  846:astore_1        
	//* 432  847:aload_1         
	//* 433  848:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 434  851:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 435  854:astore_2        
	//* 436  855:aload_0         
	//* 437  856:getfield        #245 <Field int mOrientation>
	//* 438  859:iconst_1        
	//* 439  860:icmpne          1061
	//* 440  863:aload_0         
	//* 441  864:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//* 442  867:ifeq            1029
	//* 443  870:aload_0         
	//* 444  871:invokevirtual   #299 <Method int getPaddingLeft()>
	//* 445  874:aload_0         
	//* 446  875:getfield        #131 <Field int[] mCachedBorders>
	//* 447  878:aload_0         
	//* 448  879:getfield        #45  <Field int mSpanCount>
	//* 449  882:aload_2         
	//* 450  883:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 451  886:isub            
	//* 452  887:iaload          
	//* 453  888:iadd            
	//* 454  889:istore          9
	//* 455  891:iload           9
	//* 456  893:aload_0         
	//* 457  894:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 458  897:aload_1         
	//* 459  898:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//* 460  901:isub            
	//* 461  902:istore          8
	//* 462  904:aload_0         
	//* 463  905:aload_1         
	//* 464  906:iload           8
	//* 465  908:iload           10
	//* 466  910:iload           9
	//* 467  912:iload           11
	//* 468  914:invokevirtual   #461 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
	//* 469  917:aload_2         
	//* 470  918:invokevirtual   #462 <Method boolean GridLayoutManager$LayoutParams.isItemRemoved()>
	//* 471  921:ifne            931
	//* 472  924:aload_2         
	//* 473  925:invokevirtual   #465 <Method boolean GridLayoutManager$LayoutParams.isItemChanged()>
	//* 474  928:ifeq            937
	//* 475  931:aload           4
	//* 476  933:iconst_1        
	//* 477  934:putfield        #468 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//* 478  937:aload           4
	//* 479  939:aload           4
	//* 480  941:getfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//* 481  944:aload_1         
	//* 482  945:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 483  948:ior             
	//* 484  949:putfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//* 485  952:iload           13
	//* 486  954:iconst_1        
	//* 487  955:iadd            
	//* 488  956:istore          13
	//* 489  958:iload           9
	//* 490  960:istore          14
	//* 491  962:goto            832
			{
				i1 = layoutstate.mOffset;
	//  492  965:aload_3         
	//  493  966:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  494  969:istore          9
				k1 = i1 + j1;
	//  495  971:iload           9
	//  496  973:iload           10
	//  497  975:iadd            
	//  498  976:istore          11
				j1 = l2;
	//  499  978:iload           13
	//  500  980:istore          10
			}
		} else
	//* 501  982:goto            821
		if(layoutstate.mLayoutDirection == -1)
	//* 502  985:aload_3         
	//* 503  986:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 504  989:iconst_m1       
	//* 505  990:icmpne          1013
		{
			int i3 = layoutstate.mOffset;
	//  506  993:aload_3         
	//  507  994:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  508  997:istore          13
			j = i3 - j1;
	//  509  999:iload           13
	//  510 1001:iload           10
	//  511 1003:isub            
	//  512 1004:istore          8
			j1 = i3;
	//  513 1006:iload           13
	//  514 1008:istore          10
		} else
	//* 515 1010:goto            821
		{
			j = layoutstate.mOffset;
	//  516 1013:aload_3         
	//  517 1014:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  518 1017:istore          8
			j1 = j + j1;
	//  519 1019:iload           8
	//  520 1021:iload           10
	//  521 1023:iadd            
	//  522 1024:istore          10
		}
		l2 = 0;
		l3 = j1;
		j1 = i1;
		while(l2 < l1) 
		{
			recycler = ((RecyclerView.Recycler) (mSet[l2]));
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
			if(mOrientation == 1)
			{
				if(isLayoutRTL())
				{
					i1 = getPaddingLeft() + mCachedBorders[mSpanCount - ((LayoutParams) (state)).mSpanIndex];
					j = i1 - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
				} else
	//* 523 1026:goto            821
				{
					j = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  524 1029:aload_0         
	//  525 1030:invokevirtual   #299 <Method int getPaddingLeft()>
	//  526 1033:aload_0         
	//  527 1034:getfield        #131 <Field int[] mCachedBorders>
	//  528 1037:aload_2         
	//  529 1038:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  530 1041:iaload          
	//  531 1042:iadd            
	//  532 1043:istore          8
					i1 = j + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  533 1045:iload           8
	//  534 1047:aload_0         
	//  535 1048:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  536 1051:aload_1         
	//  537 1052:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  538 1055:iadd            
	//  539 1056:istore          9
				}
			} else
	//* 540 1058:goto            904
			{
				j1 = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  541 1061:aload_0         
	//  542 1062:invokevirtual   #308 <Method int getPaddingTop()>
	//  543 1065:aload_0         
	//  544 1066:getfield        #131 <Field int[] mCachedBorders>
	//  545 1069:aload_2         
	//  546 1070:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  547 1073:iaload          
	//  548 1074:iadd            
	//  549 1075:istore          10
				k1 = j1 + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  550 1077:iload           10
	//  551 1079:aload_0         
	//  552 1080:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  553 1083:aload_1         
	//  554 1084:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  555 1087:iadd            
	//  556 1088:istore          11
				i1 = l3;
	//  557 1090:iload           14
	//  558 1092:istore          9
			}
			layoutDecoratedWithMargins(((View) (recycler)), j, j1, i1, k1);
			if(((LayoutParams) (state)).isItemRemoved() || ((LayoutParams) (state)).isItemChanged())
				layoutchunkresult.mIgnoreConsumed = true;
			layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | ((View) (recycler)).hasFocusable();
			l2++;
			l3 = i1;
		}
	//* 559 1094:goto            904
		Arrays.fill(((Object []) (mSet)), ((Object) (null)));
	//  560 1097:aload_0         
	//  561 1098:getfield        #87  <Field View[] mSet>
	//  562 1101:aconst_null     
	//  563 1102:invokestatic    #480 <Method void Arrays.fill(Object[], Object)>
		return;
	//  564 1105:return          
	}

	void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo, int i)
	{
		super.onAnchorReady(recycler, state, anchorinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #483 <Method void LinearLayoutManager.onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		updateMeasurements();
	//    6    9:aload_0         
	//    7   10:invokespecial   #389 <Method void updateMeasurements()>
		if(state.getItemCount() > 0 && !state.isPreLayout())
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//*  10   17:ifle            36
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*  13   24:ifne            36
			ensureAnchorIsInCorrectSpan(recycler, state, anchorinfo, i);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:iload           4
	//   19   33:invokespecial   #485 <Method void ensureAnchorIsInCorrectSpan(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		ensureViewSet();
	//   20   36:aload_0         
	//   21   37:invokespecial   #487 <Method void ensureViewSet()>
	//   22   40:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		View view4 = findContainingItemView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method View findContainingItemView(View)>
	//    3    5:astore          27
		if(view4 != null) goto _L2; else goto _L1
	//    4    7:aload           27
	//    5    9:ifnonnull       18
_L1:
		View view2 = null;
	//    6   12:aconst_null     
	//    7   13:astore          25
_L10:
		return view2;
	//    8   15:aload           25
	//    9   17:areturn         
_L2:
		byte byte0;
		int k;
		int l;
		byte byte1;
		int i1;
		int j1;
		int k1;
		int l2;
		int i3;
		int j3;
		Object obj;
		View view1;
		obj = ((Object) ((LayoutParams)view4.getLayoutParams()));
	//   10   18:aload           27
	//   11   20:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   23:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   26:astore          23
		l2 = ((LayoutParams) (obj)).mSpanIndex;
	//   14   28:aload           23
	//   15   30:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   16   33:istore          17
		i3 = ((LayoutParams) (obj)).mSpanIndex + ((LayoutParams) (obj)).mSpanSize;
	//   17   35:aload           23
	//   18   37:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   19   40:aload           23
	//   20   42:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   21   45:iadd            
	//   22   46:istore          18
		if(super.onFocusSearchFailed(view, i, recycler, state) == null)
	//*  23   48:aload_0         
	//*  24   49:aload_1         
	//*  25   50:iload_2         
	//*  26   51:aload_3         
	//*  27   52:aload           4
	//*  28   54:invokespecial   #495 <Method View LinearLayoutManager.onFocusSearchFailed(View, int, RecyclerView$Recycler, RecyclerView$State)>
	//*  29   57:ifnonnull       62
			return null;
	//   30   60:aconst_null     
	//   31   61:areturn         
		int j;
		boolean flag;
		if(convertFocusDirectionToLayoutDirection(i) == 1)
	//*  32   62:aload_0         
	//*  33   63:iload_2         
	//*  34   64:invokevirtual   #498 <Method int convertFocusDirectionToLayoutDirection(int)>
	//*  35   67:iconst_1        
	//*  36   68:icmpne          190
			flag = true;
	//   37   71:iconst_1        
	//   38   72:istore          22
		else
	//*  39   74:iload           22
	//*  40   76:aload_0         
	//*  41   77:getfield        #501 <Field boolean mShouldReverseLayout>
	//*  42   80:icmpeq          196
	//*  43   83:iconst_1        
	//*  44   84:istore_2        
	//*  45   85:iload_2         
	//*  46   86:ifeq            201
	//*  47   89:aload_0         
	//*  48   90:invokevirtual   #112 <Method int getChildCount()>
	//*  49   93:iconst_1        
	//*  50   94:isub            
	//*  51   95:istore_2        
	//*  52   96:iconst_m1       
	//*  53   97:istore          5
	//*  54   99:iconst_m1       
	//*  55  100:istore          6
	//*  56  102:aload_0         
	//*  57  103:getfield        #245 <Field int mOrientation>
	//*  58  106:iconst_1        
	//*  59  107:icmpne          215
	//*  60  110:aload_0         
	//*  61  111:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//*  62  114:ifeq            215
	//*  63  117:iconst_1        
	//*  64  118:istore          7
	//*  65  120:aconst_null     
	//*  66  121:astore          23
	//*  67  123:iconst_m1       
	//*  68  124:istore          11
	//*  69  126:iconst_0        
	//*  70  127:istore          12
	//*  71  129:aconst_null     
	//*  72  130:astore_1        
	//*  73  131:iconst_m1       
	//*  74  132:istore          9
	//*  75  134:iconst_0        
	//*  76  135:istore          10
	//*  77  137:aload_0         
	//*  78  138:aload_3         
	//*  79  139:aload           4
	//*  80  141:iload_2         
	//*  81  142:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  82  145:istore          19
	//*  83  147:iload_2         
	//*  84  148:istore          8
	//*  85  150:iload           8
	//*  86  152:iload           6
	//*  87  154:icmpeq          182
	//*  88  157:aload_0         
	//*  89  158:aload_3         
	//*  90  159:aload           4
	//*  91  161:iload           8
	//*  92  163:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  93  166:istore_2        
	//*  94  167:aload_0         
	//*  95  168:iload           8
	//*  96  170:invokevirtual   #116 <Method View getChildAt(int)>
	//*  97  173:astore          24
	//*  98  175:aload           24
	//*  99  177:aload           27
	//* 100  179:if_acmpne       221
	//* 101  182:aload           23
	//* 102  184:ifnull          657
	//* 103  187:aload           23
	//* 104  189:areturn         
			flag = false;
	//  105  190:iconst_0        
	//  106  191:istore          22
		if(flag != mShouldReverseLayout)
			i = 1;
		else
	//* 107  193:goto            74
			i = 0;
	//  108  196:iconst_0        
	//  109  197:istore_2        
		if(i != 0)
		{
			i = getChildCount() - 1;
			byte0 = -1;
			j = -1;
		} else
	//* 110  198:goto            85
		{
			i = 0;
	//  111  201:iconst_0        
	//  112  202:istore_2        
			byte0 = 1;
	//  113  203:iconst_1        
	//  114  204:istore          5
			j = getChildCount();
	//  115  206:aload_0         
	//  116  207:invokevirtual   #112 <Method int getChildCount()>
	//  117  210:istore          6
		}
		if(mOrientation == 1 && isLayoutRTL())
			k = 1;
		else
	//* 118  212:goto            102
			k = 0;
	//  119  215:iconst_0        
	//  120  216:istore          7
		obj = null;
		j1 = -1;
		k1 = 0;
		view = null;
		byte1 = -1;
		i1 = 0;
		j3 = getSpanGroupIndex(recycler, state, i);
		l = i;
_L8:
		if(l == j) goto _L4; else goto _L3
_L3:
		i = getSpanGroupIndex(recycler, state, l);
		view1 = getChildAt(l);
		if(view1 != view4) goto _L5; else goto _L4
_L4:
		int l1;
		int i2;
		int j2;
		int k2;
		int k3;
		int l3;
		View view3;
		LayoutParams layoutparams;
		if(obj == null)
	//* 121  218:goto            120
	//* 122  221:aload           24
	//* 123  223:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 124  226:ifeq            296
	//* 125  229:iload_2         
	//* 126  230:iload           19
	//* 127  232:icmpeq          296
	//* 128  235:aload           23
	//* 129  237:ifnonnull       182
	//* 130  240:iload           9
	//* 131  242:istore          16
	//* 132  244:iload           10
	//* 133  246:istore          15
	//* 134  248:aload_1         
	//* 135  249:astore          26
	//* 136  251:iload           11
	//* 137  253:istore          14
	//* 138  255:iload           12
	//* 139  257:istore          13
	//* 140  259:aload           23
	//* 141  261:astore          25
	//* 142  263:iload           8
	//* 143  265:iload           5
	//* 144  267:iadd            
	//* 145  268:istore          8
	//* 146  270:aload           25
	//* 147  272:astore          23
	//* 148  274:iload           13
	//* 149  276:istore          12
	//* 150  278:iload           14
	//* 151  280:istore          11
	//* 152  282:aload           26
	//* 153  284:astore_1        
	//* 154  285:iload           15
	//* 155  287:istore          10
	//* 156  289:iload           16
	//* 157  291:istore          9
	//* 158  293:goto            150
	//* 159  296:aload           24
	//* 160  298:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 161  301:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 162  304:astore          28
	//* 163  306:aload           28
	//* 164  308:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 165  311:istore          20
	//* 166  313:aload           28
	//* 167  315:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 168  318:aload           28
	//* 169  320:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//* 170  323:iadd            
	//* 171  324:istore          21
	//* 172  326:aload           24
	//* 173  328:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 174  331:ifeq            352
	//* 175  334:iload           20
	//* 176  336:iload           17
	//* 177  338:icmpne          352
	//* 178  341:aload           24
	//* 179  343:astore          25
	//* 180  345:iload           21
	//* 181  347:iload           18
	//* 182  349:icmpeq          15
	//* 183  352:iconst_0        
	//* 184  353:istore          14
	//* 185  355:aload           24
	//* 186  357:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 187  360:ifeq            368
	//* 188  363:aload           23
	//* 189  365:ifnull          380
	//* 190  368:aload           24
	//* 191  370:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 192  373:ifne            459
	//* 193  376:aload_1         
	//* 194  377:ifnonnull       459
	//* 195  380:iconst_1        
	//* 196  381:istore_2        
	//* 197  382:aload           23
	//* 198  384:astore          25
	//* 199  386:iload           12
	//* 200  388:istore          13
	//* 201  390:iload           11
	//* 202  392:istore          14
	//* 203  394:aload_1         
	//* 204  395:astore          26
	//* 205  397:iload           10
	//* 206  399:istore          15
	//* 207  401:iload           9
	//* 208  403:istore          16
	//* 209  405:iload_2         
	//* 210  406:ifeq            263
	//* 211  409:aload           24
	//* 212  411:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 213  414:ifeq            614
	//* 214  417:aload           28
	//* 215  419:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 216  422:istore          14
	//* 217  424:iload           21
	//* 218  426:iload           18
	//* 219  428:invokestatic    #504 <Method int Math.min(int, int)>
	//* 220  431:iload           20
	//* 221  433:iload           17
	//* 222  435:invokestatic    #210 <Method int Math.max(int, int)>
	//* 223  438:isub            
	//* 224  439:istore          13
	//* 225  441:aload           24
	//* 226  443:astore          25
	//* 227  445:aload_1         
	//* 228  446:astore          26
	//* 229  448:iload           10
	//* 230  450:istore          15
	//* 231  452:iload           9
	//* 232  454:istore          16
	//* 233  456:goto            263
	//* 234  459:iload           20
	//* 235  461:iload           17
	//* 236  463:invokestatic    #210 <Method int Math.max(int, int)>
	//* 237  466:istore_2        
	//* 238  467:iload           21
	//* 239  469:iload           18
	//* 240  471:invokestatic    #504 <Method int Math.min(int, int)>
	//* 241  474:iload_2         
	//* 242  475:isub            
	//* 243  476:istore          13
	//* 244  478:aload           24
	//* 245  480:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 246  483:ifeq            539
	//* 247  486:iload           13
	//* 248  488:iload           12
	//* 249  490:icmple          498
	//* 250  493:iconst_1        
	//* 251  494:istore_2        
	//* 252  495:goto            382
	//* 253  498:iload           14
	//* 254  500:istore_2        
	//* 255  501:iload           13
	//* 256  503:iload           12
	//* 257  505:icmpne          382
	//* 258  508:iload           20
	//* 259  510:iload           11
	//* 260  512:icmple          533
	//* 261  515:iconst_1        
	//* 262  516:istore          13
	//* 263  518:iload           14
	//* 264  520:istore_2        
	//* 265  521:iload           7
	//* 266  523:iload           13
	//* 267  525:icmpne          382
	//* 268  528:iconst_1        
	//* 269  529:istore_2        
	//* 270  530:goto            382
	//* 271  533:iconst_0        
	//* 272  534:istore          13
	//* 273  536:goto            518
	//* 274  539:iload           14
	//* 275  541:istore_2        
	//* 276  542:aload           23
	//* 277  544:ifnonnull       382
	//* 278  547:iload           14
	//* 279  549:istore_2        
	//* 280  550:aload_0         
	//* 281  551:aload           24
	//* 282  553:iconst_0        
	//* 283  554:iconst_1        
	//* 284  555:invokevirtual   #508 <Method boolean isViewPartiallyVisible(View, boolean, boolean)>
	//* 285  558:ifeq            382
	//* 286  561:iload           13
	//* 287  563:iload           10
	//* 288  565:icmple          573
	//* 289  568:iconst_1        
	//* 290  569:istore_2        
	//* 291  570:goto            382
	//* 292  573:iload           14
	//* 293  575:istore_2        
	//* 294  576:iload           13
	//* 295  578:iload           10
	//* 296  580:icmpne          382
	//* 297  583:iload           20
	//* 298  585:iload           9
	//* 299  587:icmple          608
	//* 300  590:iconst_1        
	//* 301  591:istore          13
	//* 302  593:iload           14
	//* 303  595:istore_2        
	//* 304  596:iload           7
	//* 305  598:iload           13
	//* 306  600:icmpne          382
	//* 307  603:iconst_1        
	//* 308  604:istore_2        
	//* 309  605:goto            382
	//* 310  608:iconst_0        
	//* 311  609:istore          13
	//* 312  611:goto            593
	//* 313  614:aload           28
	//* 314  616:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 315  619:istore          16
	//* 316  621:iload           21
	//* 317  623:iload           18
	//* 318  625:invokestatic    #504 <Method int Math.min(int, int)>
	//* 319  628:iload           20
	//* 320  630:iload           17
	//* 321  632:invokestatic    #210 <Method int Math.max(int, int)>
	//* 322  635:isub            
	//* 323  636:istore          15
	//* 324  638:aload           23
	//* 325  640:astore          25
	//* 326  642:iload           12
	//* 327  644:istore          13
	//* 328  646:iload           11
	//* 329  648:istore          14
	//* 330  650:aload           24
	//* 331  652:astore          26
	//* 332  654:goto            263
			obj = ((Object) (view));
	//  333  657:aload_1         
	//  334  658:astore          23
		return ((View) (obj));
_L5:
		if(!view1.hasFocusable() || i == j3)
			break; /* Loop/switch isn't completed */
		if(obj != null) goto _L4; else goto _L6
_L6:
		k2 = ((int) (byte1));
		j2 = i1;
		view3 = view;
		i2 = j1;
		l1 = k1;
		view2 = ((View) (obj));
_L11:
		l += ((int) (byte0));
		obj = ((Object) (view2));
		k1 = l1;
		j1 = i2;
		view = view3;
		i1 = j2;
		byte1 = ((byte) (k2));
		if(true) goto _L8; else goto _L7
_L7:
		layoutparams = (LayoutParams)view1.getLayoutParams();
		k3 = layoutparams.mSpanIndex;
		l3 = layoutparams.mSpanIndex + layoutparams.mSpanSize;
		if(!view1.hasFocusable() || k3 != l2)
			break; /* Loop/switch isn't completed */
		view2 = view1;
		if(l3 == i3) goto _L10; else goto _L9
_L9:
		i2 = 0;
		if(view1.hasFocusable() && obj == null || !view1.hasFocusable() && view == null)
		{
			i = 1;
		} else
		{
			i = Math.max(k3, l2);
			l1 = Math.min(l3, i3) - i;
			if(view1.hasFocusable())
			{
				if(l1 > k1)
				{
					i = 1;
				} else
				{
					i = i2;
					if(l1 == k1)
					{
						if(k3 > j1)
							l1 = 1;
						else
							l1 = 0;
						i = i2;
						if(k == l1)
							i = 1;
					}
				}
			} else
			{
				i = i2;
				if(obj == null)
				{
					i = i2;
					if(isViewPartiallyVisible(view1, false, true))
						if(l1 > i1)
						{
							i = 1;
						} else
						{
							i = i2;
							if(l1 == i1)
							{
								if(k3 > byte1)
									l1 = 1;
								else
									l1 = 0;
								i = i2;
								if(k == l1)
									i = 1;
							}
						}
				}
			}
		}
		view2 = ((View) (obj));
		l1 = k1;
		i2 = j1;
		view3 = view;
		j2 = i1;
		k2 = ((int) (byte1));
		if(i != 0)
			if(view1.hasFocusable())
			{
				i2 = layoutparams.mSpanIndex;
				l1 = Math.min(l3, i3) - Math.max(k3, l2);
				view2 = view1;
				view3 = view;
				j2 = i1;
				k2 = ((int) (byte1));
			} else
			{
				k2 = layoutparams.mSpanIndex;
				j2 = Math.min(l3, i3) - Math.max(k3, l2);
				view2 = ((View) (obj));
				l1 = k1;
				i2 = j1;
				view3 = view1;
			}
		  goto _L11
	//* 335  660:goto            187
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          9
		if(!(layoutparams instanceof LayoutParams))
	//*   3    6:aload           9
	//*   4    8:instanceof      #9   <Class GridLayoutManager$LayoutParams>
	//*   5   11:ifne            22
		{
			super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
	//    6   14:aload_0         
	//    7   15:aload_3         
	//    8   16:aload           4
	//    9   18:invokespecial   #513 <Method void LinearLayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
			return;
	//   10   21:return          
		}
		view = ((View) ((LayoutParams)layoutparams));
	//   11   22:aload           9
	//   12   24:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   27:astore_3        
		int i = getSpanGroupIndex(recycler, state, ((LayoutParams) (view)).getViewLayoutPosition());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #119 <Method int GridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   19   35:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   20   38:istore          5
		if(mOrientation == 0)
	//*  21   40:aload_0         
	//*  22   41:getfield        #245 <Field int mOrientation>
	//*  23   44:ifne            106
		{
			int j = ((LayoutParams) (view)).getSpanIndex();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #128 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   26   51:istore          6
			int l = ((LayoutParams) (view)).getSpanSize();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   29   57:istore          7
			boolean flag;
			if(mSpanCount > 1 && ((LayoutParams) (view)).getSpanSize() == mSpanCount)
	//*  30   59:aload_0         
	//*  31   60:getfield        #45  <Field int mSpanCount>
	//*  32   63:iconst_1        
	//*  33   64:icmple          100
	//*  34   67:aload_3         
	//*  35   68:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  36   71:aload_0         
	//*  37   72:getfield        #45  <Field int mSpanCount>
	//*  38   75:icmpne          100
				flag = true;
	//   39   78:iconst_1        
	//   40   79:istore          8
			else
	//*  41   81:aload           4
	//*  42   83:iload           6
	//*  43   85:iload           7
	//*  44   87:iload           5
	//*  45   89:iconst_1        
	//*  46   90:iload           8
	//*  47   92:iconst_0        
	//*  48   93:invokestatic    #519 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//*  49   96:invokevirtual   #525 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//*  50   99:return          
				flag = false;
	//   51  100:iconst_0        
	//   52  101:istore          8
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(j, l, i, 1, flag, false))));
			return;
		}
	//*  53  103:goto            81
		int k = ((LayoutParams) (view)).getSpanIndex();
	//   54  106:aload_3         
	//   55  107:invokevirtual   #128 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   56  110:istore          6
		int i1 = ((LayoutParams) (view)).getSpanSize();
	//   57  112:aload_3         
	//   58  113:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   59  116:istore          7
		boolean flag1;
		if(mSpanCount > 1 && ((LayoutParams) (view)).getSpanSize() == mSpanCount)
	//*  60  118:aload_0         
	//*  61  119:getfield        #45  <Field int mSpanCount>
	//*  62  122:iconst_1        
	//*  63  123:icmple          159
	//*  64  126:aload_3         
	//*  65  127:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  66  130:aload_0         
	//*  67  131:getfield        #45  <Field int mSpanCount>
	//*  68  134:icmpne          159
			flag1 = true;
	//   69  137:iconst_1        
	//   70  138:istore          8
		else
	//*  71  140:aload           4
	//*  72  142:iload           5
	//*  73  144:iconst_1        
	//*  74  145:iload           6
	//*  75  147:iload           7
	//*  76  149:iload           8
	//*  77  151:iconst_0        
	//*  78  152:invokestatic    #519 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//*  79  155:invokevirtual   #525 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//*  80  158:return          
			flag1 = false;
	//   81  159:iconst_0        
	//   82  160:istore          8
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, k, i1, flag1, false))));
	//*  83  162:goto            140
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifeq            11
			cachePreLayoutSpanMapping();
	//    3    7:aload_0         
	//    4    8:invokespecial   #541 <Method void cachePreLayoutSpanMapping()>
		super.onLayoutChildren(recycler, state);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #543 <Method void LinearLayoutManager.onLayoutChildren(RecyclerView$Recycler, RecyclerView$State)>
		clearPreLayoutSpanMappingCache();
	//    9   17:aload_0         
	//   10   18:invokespecial   #545 <Method void clearPreLayoutSpanMappingCache()>
	//   11   21:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #549 <Method void LinearLayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingSpanCountChange = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #43  <Field boolean mPendingSpanCountChange>
	//    6   10:return          
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		updateMeasurements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void updateMeasurements()>
		ensureViewSet();
	//    2    4:aload_0         
	//    3    5:invokespecial   #487 <Method void ensureViewSet()>
		return super.scrollHorizontallyBy(i, recycler, state);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #553 <Method int LinearLayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    9   15:ireturn         
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		updateMeasurements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void updateMeasurements()>
		ensureViewSet();
	//    2    4:aload_0         
	//    3    5:invokespecial   #487 <Method void ensureViewSet()>
		return super.scrollVerticallyBy(i, recycler, state);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #556 <Method int LinearLayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    9   15:ireturn         
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		if(mCachedBorders == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field int[] mCachedBorders>
	//*   2    4:ifnonnull       14
			super.setMeasuredDimension(rect, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #560 <Method void LinearLayoutManager.setMeasuredDimension(Rect, int, int)>
		int i1 = getPaddingLeft() + getPaddingRight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #299 <Method int getPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #296 <Method int getPaddingRight()>
	//   12   22:iadd            
	//   13   23:istore          5
		int j1 = getPaddingTop() + getPaddingBottom();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #308 <Method int getPaddingTop()>
	//   16   29:aload_0         
	//   17   30:invokevirtual   #305 <Method int getPaddingBottom()>
	//   18   33:iadd            
	//   19   34:istore          6
		if(mOrientation == 1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #245 <Field int mOrientation>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          95
		{
			int k = chooseSize(j, rect.height() + j1, getMinimumHeight());
	//   24   44:iload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #562 <Method int Rect.height()>
	//   27   49:iload           6
	//   28   51:iadd            
	//   29   52:aload_0         
	//   30   53:invokevirtual   #565 <Method int getMinimumHeight()>
	//   31   56:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   32   59:istore          4
			j = chooseSize(i, mCachedBorders[mCachedBorders.length - 1] + i1, getMinimumWidth());
	//   33   61:iload_2         
	//   34   62:aload_0         
	//   35   63:getfield        #131 <Field int[] mCachedBorders>
	//   36   66:aload_0         
	//   37   67:getfield        #131 <Field int[] mCachedBorders>
	//   38   70:arraylength     
	//   39   71:iconst_1        
	//   40   72:isub            
	//   41   73:iaload          
	//   42   74:iload           5
	//   43   76:iadd            
	//   44   77:aload_0         
	//   45   78:invokevirtual   #572 <Method int getMinimumWidth()>
	//   46   81:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   47   84:istore_3        
			i = k;
	//   48   85:iload           4
	//   49   87:istore_2        
		} else
	//*  50   88:aload_0         
	//*  51   89:iload_3         
	//*  52   90:iload_2         
	//*  53   91:invokevirtual   #574 <Method void setMeasuredDimension(int, int)>
	//*  54   94:return          
		{
			int l = chooseSize(i, rect.width() + i1, getMinimumWidth());
	//   55   95:iload_2         
	//   56   96:aload_1         
	//   57   97:invokevirtual   #576 <Method int Rect.width()>
	//   58  100:iload           5
	//   59  102:iadd            
	//   60  103:aload_0         
	//   61  104:invokevirtual   #572 <Method int getMinimumWidth()>
	//   62  107:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   63  110:istore          4
			i = chooseSize(j, mCachedBorders[mCachedBorders.length - 1] + j1, getMinimumHeight());
	//   64  112:iload_3         
	//   65  113:aload_0         
	//   66  114:getfield        #131 <Field int[] mCachedBorders>
	//   67  117:aload_0         
	//   68  118:getfield        #131 <Field int[] mCachedBorders>
	//   69  121:arraylength     
	//   70  122:iconst_1        
	//   71  123:isub            
	//   72  124:iaload          
	//   73  125:iload           6
	//   74  127:iadd            
	//   75  128:aload_0         
	//   76  129:invokevirtual   #565 <Method int getMinimumHeight()>
	//   77  132:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   78  135:istore_2        
			j = l;
	//   79  136:iload           4
	//   80  138:istore_3        
		}
		setMeasuredDimension(j, i);
	//*  81  139:goto            88
	}

	public void setSpanCount(int i)
	{
		if(i == mSpanCount)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #45  <Field int mSpanCount>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mPendingSpanCountChange = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #43  <Field boolean mPendingSpanCountChange>
		if(i < 1)
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmpge          47
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Span count should be at least 1. Provided ").append(i).toString());
	//   11   19:new             #391 <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:new             #169 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #170 <Method void StringBuilder()>
	//   16   30:ldc2            #578 <String "Span count should be at least 1. Provided ">
	//   17   33:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:iload_1         
	//   19   37:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   20   40:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   21   43:invokespecial   #402 <Method void IllegalArgumentException(String)>
	//   22   46:athrow          
		} else
		{
			mSpanCount = i;
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:putfield        #45  <Field int mSpanCount>
			mSpanSizeLookup.invalidateSpanIndexCache();
	//   26   52:aload_0         
	//   27   53:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   28   56:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
			requestLayout();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #581 <Method void requestLayout()>
			return;
	//   31   63:return          
		}
	}

	public void setSpanSizeLookup(SpanSizeLookup spansizelookup)
	{
		mSpanSizeLookup = spansizelookup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    3    5:return          
	}

	public void setStackFromEnd(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
	//    2    4:new             #587 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc2            #589 <String "GridLayoutManager does not support stack from end. Consider using reverse layout">
	//    5   11:invokespecial   #590 <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
		} else
		{
			super.setStackFromEnd(false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokespecial   #592 <Method void LinearLayoutManager.setStackFromEnd(boolean)>
			return;
	//   10   20:return          
		}
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null && !mPendingSpanCountChange;
	//    0    0:aload_0         
	//    1    1:getfield        #597 <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field boolean mPendingSpanCountChange>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static final boolean DEBUG = false;
	public static final int DEFAULT_SPAN_COUNT = -1;
	private static final String TAG = "GridLayoutManager";
	int mCachedBorders[];
	final Rect mDecorInsets;
	boolean mPendingSpanCountChange;
	final SparseIntArray mPreLayoutSpanIndexCache;
	final SparseIntArray mPreLayoutSpanSizeCache;
	View mSet[];
	int mSpanCount;
	SpanSizeLookup mSpanSizeLookup;
}
