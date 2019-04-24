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
		byte byte0;
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            20
		{
			boolean flag1 = false;
	//    2    5:iconst_0        
	//    3    6:istore          7
			j = i;
	//    4    8:iload_3         
	//    5    9:istore          4
			byte0 = 1;
	//    6   11:iconst_1        
	//    7   12:istore          6
			i = ((int) (flag1));
	//    8   14:iload           7
	//    9   16:istore_3        
		} else
	//*  10   17:goto            30
		{
			i--;
	//   11   20:iload_3         
	//   12   21:iconst_1        
	//   13   22:isub            
	//   14   23:istore_3        
			j = -1;
	//   15   24:iconst_m1       
	//   16   25:istore          4
			byte0 = -1;
	//   17   27:iconst_m1       
	//   18   28:istore          6
		}
		int k = 0;
	//   19   30:iconst_0        
	//   20   31:istore          7
		for(; i != j; i += ((int) (byte0)))
	//*  21   33:iload_3         
	//*  22   34:iload           4
	//*  23   36:icmpeq          99
		{
			View view = mSet[i];
	//   24   39:aload_0         
	//   25   40:getfield        #87  <Field View[] mSet>
	//   26   43:iload_3         
	//   27   44:aaload          
	//   28   45:astore          8
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   29   47:aload           8
	//   30   49:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   31   52:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   32   55:astore          9
			layoutparams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
	//   33   57:aload           9
	//   34   59:aload_0         
	//   35   60:aload_1         
	//   36   61:aload_2         
	//   37   62:aload_0         
	//   38   63:aload           8
	//   39   65:invokevirtual   #97  <Method int getPosition(View)>
	//   40   68:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   41   71:putfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
			layoutparams.mSpanIndex = k;
	//   42   74:aload           9
	//   43   76:iload           7
	//   44   78:putfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
			k += layoutparams.mSpanSize;
	//   45   81:iload           7
	//   46   83:aload           9
	//   47   85:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   48   88:iadd            
	//   49   89:istore          7
		}

	//   50   91:iload_3         
	//   51   92:iload           6
	//   52   94:iadd            
	//   53   95:istore_3        
	//*  54   96:goto            33
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
		boolean flag;
		if(i == 1)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:icmpne          12
			flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		else
	//*   5    9:goto            15
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          5
		i = getSpanIndex(recycler, state, anchorinfo.mPosition);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   13   22:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   14   25:istore          4
		if(flag)
	//*  15   27:iload           5
	//*  16   29:ifeq            69
		{
			for(; i > 0 && anchorinfo.mPosition > 0; i = getSpanIndex(recycler, state, anchorinfo.mPosition))
	//*  17   32:iload           4
	//*  18   34:ifle            136
	//*  19   37:aload_3         
	//*  20   38:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  21   41:ifle            136
				anchorinfo.mPosition = anchorinfo.mPosition - 1;
	//   22   44:aload_3         
	//   23   45:aload_3         
	//   24   46:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   25   49:iconst_1        
	//   26   50:isub            
	//   27   51:putfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>

	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   33   61:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   34   64:istore          4
		} else
	//*  35   66:goto            32
		{
			int i1 = state.getItemCount();
	//   36   69:aload_2         
	//   37   70:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//   38   73:istore          7
			int k = anchorinfo.mPosition;
	//   39   75:aload_3         
	//   40   76:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   41   79:istore          6
			int j = i;
	//   42   81:iload           4
	//   43   83:istore          5
			i = k;
	//   44   85:iload           6
	//   45   87:istore          4
			do
			{
				if(i >= i1 - 1)
					break;
	//   46   89:iload           4
	//   47   91:iload           7
	//   48   93:iconst_1        
	//   49   94:isub            
	//   50   95:icmpge          130
				int l = getSpanIndex(recycler, state, i + 1);
	//   51   98:aload_0         
	//   52   99:aload_1         
	//   53  100:aload_2         
	//   54  101:iload           4
	//   55  103:iconst_1        
	//   56  104:iadd            
	//   57  105:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   58  108:istore          6
				if(l <= j)
					break;
	//   59  110:iload           6
	//   60  112:iload           5
	//   61  114:icmple          130
				i++;
	//   62  117:iload           4
	//   63  119:iconst_1        
	//   64  120:iadd            
	//   65  121:istore          4
				j = l;
	//   66  123:iload           6
	//   67  125:istore          5
			} while(true);
	//   68  127:goto            89
			anchorinfo.mPosition = i;
	//   69  130:aload_3         
	//   70  131:iload           4
	//   71  133:putfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		}
	//   72  136:return          
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
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            20
			return mSpanSizeLookup.getCachedSpanIndex(i, mSpanCount);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field int mSpanCount>
	//    8   16:invokevirtual   #192 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//    9   19:ireturn         
		int j = mPreLayoutSpanIndexCache.get(i, -1);
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//   12   24:iload_3         
	//   13   25:iconst_m1       
	//   14   26:invokevirtual   #195 <Method int SparseIntArray.get(int, int)>
	//   15   29:istore          4
		if(j != -1)
	//*  16   31:iload           4
	//*  17   33:iconst_m1       
	//*  18   34:icmpeq          40
			return j;
	//   19   37:iload           4
	//   20   39:ireturn         
		j = recycler.convertPreLayoutPositionToPostLayout(i);
	//   21   40:aload_1         
	//   22   41:iload_3         
	//   23   42:invokevirtual   #167 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   24   45:istore          4
		if(j == -1)
	//*  25   47:iload           4
	//*  26   49:iconst_m1       
	//*  27   50:icmpne          80
		{
			Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
	//   28   53:ldc1            #23  <String "GridLayoutManager">
	//   29   55:new             #169 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #170 <Method void StringBuilder()>
	//   32   62:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   33   64:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:iload_3         
	//   35   68:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   36   71:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #189 <Method int Log.w(String, String)>
	//   38   77:pop             
			return 0;
	//   39   78:iconst_0        
	//   40   79:ireturn         
		} else
		{
			return mSpanSizeLookup.getCachedSpanIndex(j, mSpanCount);
	//   41   80:aload_0         
	//   42   81:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   43   84:iload           4
	//   44   86:aload_0         
	//   45   87:getfield        #45  <Field int mSpanCount>
	//   46   90:invokevirtual   #192 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//   47   93:ireturn         
		}
	}

	private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #158 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            16
			return mSpanSizeLookup.getSpanSize(i);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//    7   15:ireturn         
		int j = mPreLayoutSpanSizeCache.get(i, -1);
	//    8   16:aload_0         
	//    9   17:getfield        #52  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//   10   20:iload_3         
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #195 <Method int SparseIntArray.get(int, int)>
	//   13   25:istore          4
		if(j != -1)
	//*  14   27:iload           4
	//*  15   29:iconst_m1       
	//*  16   30:icmpeq          36
			return j;
	//   17   33:iload           4
	//   18   35:ireturn         
		j = recycler.convertPreLayoutPositionToPostLayout(i);
	//   19   36:aload_1         
	//   20   37:iload_3         
	//   21   38:invokevirtual   #167 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   22   41:istore          4
		if(j == -1)
	//*  23   43:iload           4
	//*  24   45:iconst_m1       
	//*  25   46:icmpne          76
		{
			Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
	//   26   49:ldc1            #23  <String "GridLayoutManager">
	//   27   51:new             #169 <Class StringBuilder>
	//   28   54:dup             
	//   29   55:invokespecial   #170 <Method void StringBuilder()>
	//   30   58:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   31   60:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:iload_3         
	//   33   64:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   34   67:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   35   70:invokestatic    #189 <Method int Log.w(String, String)>
	//   36   73:pop             
			return 1;
	//   37   74:iconst_1        
	//   38   75:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanSize(j);
	//   39   76:aload_0         
	//   40   77:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   41   80:iload           4
	//   42   82:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   43   85:ireturn         
		}
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
		int j = rect.top + rect.bottom + layoutparams.topMargin + layoutparams.bottomMargin;
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
	//   18   39:istore          4
		int k = rect.left + rect.right + layoutparams.leftMargin + layoutparams.rightMargin;
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
	//   30   64:istore          5
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
	//*  41   87:icmpne          132
		{
			i = getChildMeasureSpec(l, i, k, layoutparams.width, false);
	//   42   90:iload           6
	//   43   92:iload_2         
	//   44   93:iload           5
	//   45   95:aload           7
	//   46   97:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   47  100:iconst_0        
	//   48  101:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   49  104:istore_2        
			j = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getHeightMode(), j, layoutparams.height, true);
	//   50  105:aload_0         
	//   51  106:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   52  109:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   53  112:aload_0         
	//   54  113:invokevirtual   #264 <Method int getHeightMode()>
	//   55  116:iload           4
	//   56  118:aload           7
	//   57  120:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   58  123:iconst_1        
	//   59  124:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   60  127:istore          4
		} else
	//*  61  129:goto            171
		{
			j = getChildMeasureSpec(l, i, j, layoutparams.height, false);
	//   62  132:iload           6
	//   63  134:iload_2         
	//   64  135:iload           4
	//   65  137:aload           7
	//   66  139:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   67  142:iconst_0        
	//   68  143:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   69  146:istore          4
			i = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), k, layoutparams.width, true);
	//   70  148:aload_0         
	//   71  149:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   72  152:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   73  155:aload_0         
	//   74  156:invokevirtual   #270 <Method int getWidthMode()>
	//   75  159:iload           5
	//   76  161:aload           7
	//   77  163:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   78  166:iconst_1        
	//   79  167:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   80  170:istore_2        
		}
		measureChildWithDecorationsAndMargin(view, i, j, flag);
	//   81  171:aload_0         
	//   82  172:aload_1         
	//   83  173:iload_2         
	//   84  174:iload           4
	//   85  176:iload_3         
	//   86  177:invokespecial   #274 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//   87  180:return          
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
	//*   5   11:ifeq            28
			flag = shouldReMeasureChild(view, i, j, layoutparams);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:aload           5
	//   11   20:invokevirtual   #280 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   12   23:istore          4
		else
	//*  13   25:goto            39
			flag = shouldMeasureChild(view, i, j, layoutparams);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:aload           5
	//   19   34:invokevirtual   #283 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   20   37:istore          4
		if(flag)
	//*  21   39:iload           4
	//*  22   41:ifeq            50
			view.measure(i, j);
	//   23   44:aload_1         
	//   24   45:iload_2         
	//   25   46:iload_3         
	//   26   47:invokevirtual   #286 <Method void View.measure(int, int)>
	//   27   50:return          
	}

	private void updateMeasurements()
	{
		int i;
		if(getOrientation() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #290 <Method int getOrientation()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
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
	//*  13   23:goto            41
			i = getHeight() - getPaddingBottom() - getPaddingTop();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #302 <Method int getHeight()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #305 <Method int getPaddingBottom()>
	//   18   34:isub            
	//   19   35:aload_0         
	//   20   36:invokevirtual   #308 <Method int getPaddingTop()>
	//   21   39:isub            
	//   22   40:istore_1        
		calculateItemBorders(i);
	//   23   41:aload_0         
	//   24   42:iload_1         
	//   25   43:invokespecial   #212 <Method void calculateItemBorders(int)>
	//   26   46:return          
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
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method void ensureLayoutState()>
		View view1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          11
		View view = null;
	//    4    7:aconst_null     
	//    5    8:astore          10
		int l = mOrientationHelper.getStartAfterPadding();
	//    6   10:aload_0         
	//    7   11:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #340 <Method int OrientationHelper.getStartAfterPadding()>
	//    9   17:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//   10   19:aload_0         
	//   11   20:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   12   23:invokevirtual   #343 <Method int OrientationHelper.getEndAfterPadding()>
	//   13   26:istore          8
		byte byte0;
		if(j > i)
	//*  14   28:iload           4
	//*  15   30:iload_3         
	//*  16   31:icmple          40
			byte0 = 1;
	//   17   34:iconst_1        
	//   18   35:istore          6
		else
	//*  19   37:goto            43
			byte0 = -1;
	//   20   40:iconst_m1       
	//   21   41:istore          6
		while(i != j) 
	//*  22   43:iload_3         
	//*  23   44:iload           4
	//*  24   46:icmpeq          223
		{
			View view3 = getChildAt(i);
	//   25   49:aload_0         
	//   26   50:iload_3         
	//   27   51:invokevirtual   #116 <Method View getChildAt(int)>
	//   28   54:astore          13
			int j1 = getPosition(view3);
	//   29   56:aload_0         
	//   30   57:aload           13
	//   31   59:invokevirtual   #97  <Method int getPosition(View)>
	//   32   62:istore          9
			View view2 = view1;
	//   33   64:aload           11
	//   34   66:astore          12
			View view4 = view;
	//   35   68:aload           10
	//   36   70:astore          14
			if(j1 >= 0)
	//*  37   72:iload           9
	//*  38   74:iflt            207
			{
				view2 = view1;
	//   39   77:aload           11
	//   40   79:astore          12
				view4 = view;
	//   41   81:aload           10
	//   42   83:astore          14
				if(j1 < k)
	//*  43   85:iload           9
	//*  44   87:iload           5
	//*  45   89:icmpge          207
					if(getSpanIndex(recycler, state, j1) != 0)
	//*  46   92:aload_0         
	//*  47   93:aload_1         
	//*  48   94:aload_2         
	//*  49   95:iload           9
	//*  50   97:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  51  100:ifeq            114
					{
						view2 = view1;
	//   52  103:aload           11
	//   53  105:astore          12
						view4 = view;
	//   54  107:aload           10
	//   55  109:astore          14
					} else
	//*  56  111:goto            207
					if(((RecyclerView.LayoutParams)view3.getLayoutParams()).isItemRemoved())
	//*  57  114:aload           13
	//*  58  116:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  59  119:checkcast       #276 <Class RecyclerView$LayoutParams>
	//*  60  122:invokevirtual   #346 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  61  125:ifeq            152
					{
						view2 = view1;
	//   62  128:aload           11
	//   63  130:astore          12
						view4 = view;
	//   64  132:aload           10
	//   65  134:astore          14
						if(view1 == null)
	//*  66  136:aload           11
	//*  67  138:ifnonnull       207
						{
							view2 = view3;
	//   68  141:aload           13
	//   69  143:astore          12
							view4 = view;
	//   70  145:aload           10
	//   71  147:astore          14
						}
					} else
	//*  72  149:goto            207
					if(mOrientationHelper.getDecoratedStart(view3) >= i1 || mOrientationHelper.getDecoratedEnd(view3) < l)
	//*  73  152:aload_0         
	//*  74  153:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  75  156:aload           13
	//*  76  158:invokevirtual   #349 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  77  161:iload           8
	//*  78  163:icmpge          180
	//*  79  166:aload_0         
	//*  80  167:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  81  170:aload           13
	//*  82  172:invokevirtual   #352 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  83  175:iload           7
	//*  84  177:icmpge          204
					{
						view2 = view1;
	//   85  180:aload           11
	//   86  182:astore          12
						view4 = view;
	//   87  184:aload           10
	//   88  186:astore          14
						if(view == null)
	//*  89  188:aload           10
	//*  90  190:ifnonnull       207
						{
							view2 = view1;
	//   91  193:aload           11
	//   92  195:astore          12
							view4 = view3;
	//   93  197:aload           13
	//   94  199:astore          14
						}
					} else
	//*  95  201:goto            207
					{
						return view3;
	//   96  204:aload           13
	//   97  206:areturn         
					}
			}
			i += ((int) (byte0));
	//   98  207:iload_3         
	//   99  208:iload           6
	//  100  210:iadd            
	//  101  211:istore_3        
			view1 = view2;
	//  102  212:aload           12
	//  103  214:astore          11
			view = view4;
	//  104  216:aload           14
	//  105  218:astore          10
		}
	//* 106  220:goto            43
		if(view != null)
	//* 107  223:aload           10
	//* 108  225:ifnull          231
			return view;
	//  109  228:aload           10
	//  110  230:areturn         
		else
			return view1;
	//  111  231:aload           11
	//  112  233:areturn         
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
		int l2 = mOrientationHelper.getModeInOther();
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #386 <Method int OrientationHelper.getModeInOther()>
	//    3    7:istore          15
		boolean flag;
		if(l2 != 0x40000000)
	//*   4    9:iload           15
	//*   5   11:ldc2            #387 <Int 0x40000000>
	//*   6   14:icmpeq          23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          9
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          9
		int j1;
		if(getChildCount() > 0)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #112 <Method int getChildCount()>
	//*  14   30:ifle            47
			j1 = mCachedBorders[mSpanCount];
	//   15   33:aload_0         
	//   16   34:getfield        #131 <Field int[] mCachedBorders>
	//   17   37:aload_0         
	//   18   38:getfield        #45  <Field int mSpanCount>
	//   19   41:iaload          
	//   20   42:istore          11
		else
	//*  21   44:goto            50
			j1 = 0;
	//   22   47:iconst_0        
	//   23   48:istore          11
		if(flag)
	//*  24   50:iload           9
	//*  25   52:ifeq            59
			updateMeasurements();
	//   26   55:aload_0         
	//   27   56:invokespecial   #389 <Method void updateMeasurements()>
		boolean flag2;
		if(layoutstate.mItemDirection == 1)
	//*  28   59:aload_3         
	//*  29   60:getfield        #332 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  30   63:iconst_1        
	//*  31   64:icmpne          73
			flag2 = true;
	//   32   67:iconst_1        
	//   33   68:istore          16
		else
	//*  34   70:goto            76
			flag2 = false;
	//   35   73:iconst_0        
	//   36   74:istore          16
		int l1 = 0;
	//   37   76:iconst_0        
	//   38   77:istore          13
		boolean flag1 = false;
	//   39   79:iconst_0        
	//   40   80:istore          14
		int i = mSpanCount;
	//   41   82:aload_0         
	//   42   83:getfield        #45  <Field int mSpanCount>
	//   43   86:istore          8
		int k1 = l1;
	//   44   88:iload           13
	//   45   90:istore          12
		int i1 = ((int) (flag1));
	//   46   92:iload           14
	//   47   94:istore          10
		if(!flag2)
	//*  48   96:iload           16
	//*  49   98:ifne            132
		{
			i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:aload_2         
	//   53  104:aload_3         
	//   54  105:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   55  108:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   56  111:aload_0         
	//   57  112:aload_1         
	//   58  113:aload_2         
	//   59  114:aload_3         
	//   60  115:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   61  118:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   62  121:iadd            
	//   63  122:istore          8
			i1 = ((int) (flag1));
	//   64  124:iload           14
	//   65  126:istore          10
			k1 = l1;
	//   66  128:iload           13
	//   67  130:istore          12
		}
		do
		{
			if(k1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0)
				break;
	//   68  132:iload           12
	//   69  134:aload_0         
	//   70  135:getfield        #45  <Field int mSpanCount>
	//   71  138:icmpge          293
	//   72  141:aload_3         
	//   73  142:aload_2         
	//   74  143:invokevirtual   #318 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   75  146:ifeq            293
	//   76  149:iload           8
	//   77  151:ifle            293
			int j2 = layoutstate.mCurrentPosition;
	//   78  154:aload_3         
	//   79  155:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   80  158:istore          14
			l1 = getSpanSize(recycler, state, j2);
	//   81  160:aload_0         
	//   82  161:aload_1         
	//   83  162:aload_2         
	//   84  163:iload           14
	//   85  165:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   86  168:istore          13
			if(l1 > mSpanCount)
	//*  87  170:iload           13
	//*  88  172:aload_0         
	//*  89  173:getfield        #45  <Field int mSpanCount>
	//*  90  176:icmple          238
				throw new IllegalArgumentException((new StringBuilder()).append("Item at position ").append(j2).append(" requires ").append(l1).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
	//   91  179:new             #391 <Class IllegalArgumentException>
	//   92  182:dup             
	//   93  183:new             #169 <Class StringBuilder>
	//   94  186:dup             
	//   95  187:invokespecial   #170 <Method void StringBuilder()>
	//   96  190:ldc2            #393 <String "Item at position ">
	//   97  193:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   98  196:iload           14
	//   99  198:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  100  201:ldc2            #395 <String " requires ">
	//  101  204:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  102  207:iload           13
	//  103  209:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  104  212:ldc2            #397 <String " spans but GridLayoutManager has only ">
	//  105  215:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  106  218:aload_0         
	//  107  219:getfield        #45  <Field int mSpanCount>
	//  108  222:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  109  225:ldc2            #399 <String " spans.">
	//  110  228:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  111  231:invokevirtual   #183 <Method String StringBuilder.toString()>
	//  112  234:invokespecial   #402 <Method void IllegalArgumentException(String)>
	//  113  237:athrow          
			i -= l1;
	//  114  238:iload           8
	//  115  240:iload           13
	//  116  242:isub            
	//  117  243:istore          8
			if(i < 0)
	//* 118  245:iload           8
	//* 119  247:ifge            253
				break;
	//  120  250:goto            293
			View view = layoutstate.next(recycler);
	//  121  253:aload_3         
	//  122  254:aload_1         
	//  123  255:invokevirtual   #406 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//  124  258:astore          17
			if(view == null)
	//* 125  260:aload           17
	//* 126  262:ifnonnull       268
				break;
	//  127  265:goto            293
			i1 += l1;
	//  128  268:iload           10
	//  129  270:iload           13
	//  130  272:iadd            
	//  131  273:istore          10
			mSet[k1] = view;
	//  132  275:aload_0         
	//  133  276:getfield        #87  <Field View[] mSet>
	//  134  279:iload           12
	//  135  281:aload           17
	//  136  283:aastore         
			k1++;
	//  137  284:iload           12
	//  138  286:iconst_1        
	//  139  287:iadd            
	//  140  288:istore          12
		} while(true);
	//  141  290:goto            132
		if(k1 == 0)
	//* 142  293:iload           12
	//* 143  295:ifne            305
		{
			layoutchunkresult.mFinished = true;
	//  144  298:aload           4
	//  145  300:iconst_1        
	//  146  301:putfield        #411 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//  147  304:return          
		}
		i = 0;
	//  148  305:iconst_0        
	//  149  306:istore          8
		float f = 0.0F;
	//  150  308:fconst_0        
	//  151  309:fstore          5
		assignSpans(recycler, state, k1, i1, flag2);
	//  152  311:aload_0         
	//  153  312:aload_1         
	//  154  313:aload_2         
	//  155  314:iload           12
	//  156  316:iload           10
	//  157  318:iload           16
	//  158  320:invokespecial   #413 <Method void assignSpans(RecyclerView$Recycler, RecyclerView$State, int, int, boolean)>
		for(i1 = 0; i1 < k1;)
	//* 159  323:iconst_0        
	//* 160  324:istore          10
	//* 161  326:iload           10
	//* 162  328:iload           12
	//* 163  330:icmpge          491
		{
			recycler = ((RecyclerView.Recycler) (mSet[i1]));
	//  164  333:aload_0         
	//  165  334:getfield        #87  <Field View[] mSet>
	//  166  337:iload           10
	//  167  339:aaload          
	//  168  340:astore_1        
			if(layoutstate.mScrapList == null)
	//* 169  341:aload_3         
	//* 170  342:getfield        #417 <Field java.util.List LinearLayoutManager$LayoutState.mScrapList>
	//* 171  345:ifnonnull       370
			{
				if(flag2)
	//* 172  348:iload           16
	//* 173  350:ifeq            361
					addView(((View) (recycler)));
	//  174  353:aload_0         
	//  175  354:aload_1         
	//  176  355:invokevirtual   #421 <Method void addView(View)>
				else
	//* 177  358:goto            389
					addView(((View) (recycler)), 0);
	//  178  361:aload_0         
	//  179  362:aload_1         
	//  180  363:iconst_0        
	//  181  364:invokevirtual   #424 <Method void addView(View, int)>
			} else
	//* 182  367:goto            389
			if(flag2)
	//* 183  370:iload           16
	//* 184  372:ifeq            383
				addDisappearingView(((View) (recycler)));
	//  185  375:aload_0         
	//  186  376:aload_1         
	//  187  377:invokevirtual   #427 <Method void addDisappearingView(View)>
			else
	//* 188  380:goto            389
				addDisappearingView(((View) (recycler)), 0);
	//  189  383:aload_0         
	//  190  384:aload_1         
	//  191  385:iconst_0        
	//  192  386:invokevirtual   #429 <Method void addDisappearingView(View, int)>
			calculateItemDecorationsForChild(((View) (recycler)), mDecorInsets);
	//  193  389:aload_0         
	//  194  390:aload_1         
	//  195  391:aload_0         
	//  196  392:getfield        #62  <Field Rect mDecorInsets>
	//  197  395:invokevirtual   #433 <Method void calculateItemDecorationsForChild(View, Rect)>
			measureChild(((View) (recycler)), l2, false);
	//  198  398:aload_0         
	//  199  399:aload_1         
	//  200  400:iload           15
	//  201  402:iconst_0        
	//  202  403:invokespecial   #435 <Method void measureChild(View, int, boolean)>
			int k2 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  203  406:aload_0         
	//  204  407:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  205  410:aload_1         
	//  206  411:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  207  414:istore          14
			l1 = i;
	//  208  416:iload           8
	//  209  418:istore          13
			if(k2 > i)
	//* 210  420:iload           14
	//* 211  422:iload           8
	//* 212  424:icmple          431
				l1 = k2;
	//  213  427:iload           14
	//  214  429:istore          13
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  215  431:aload_1         
	//  216  432:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  217  435:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  218  438:astore_2        
			float f2 = ((float)mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) * 1.0F) / (float)((LayoutParams) (state)).mSpanSize;
	//  219  439:aload_0         
	//  220  440:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  221  443:aload_1         
	//  222  444:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  223  447:i2f             
	//  224  448:fconst_1        
	//  225  449:fmul            
	//  226  450:aload_2         
	//  227  451:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  228  454:i2f             
	//  229  455:fdiv            
	//  230  456:fstore          7
			float f1 = f;
	//  231  458:fload           5
	//  232  460:fstore          6
			if(f2 > f)
	//* 233  462:fload           7
	//* 234  464:fload           5
	//* 235  466:fcmpl           
	//* 236  467:ifle            474
				f1 = f2;
	//  237  470:fload           7
	//  238  472:fstore          6
			i1++;
	//  239  474:iload           10
	//  240  476:iconst_1        
	//  241  477:iadd            
	//  242  478:istore          10
			i = l1;
	//  243  480:iload           13
	//  244  482:istore          8
			f = f1;
	//  245  484:fload           6
	//  246  486:fstore          5
		}

	//* 247  488:goto            326
		i1 = i;
	//  248  491:iload           8
	//  249  493:istore          10
		if(flag)
	//* 250  495:iload           9
	//* 251  497:ifeq            580
		{
			guessMeasurement(f, j1);
	//  252  500:aload_0         
	//  253  501:fload           5
	//  254  503:iload           11
	//  255  505:invokespecial   #443 <Method void guessMeasurement(float, int)>
			i = 0;
	//  256  508:iconst_0        
	//  257  509:istore          8
			int j = 0;
	//  258  511:iconst_0        
	//  259  512:istore          9
			do
			{
				i1 = i;
	//  260  514:iload           8
	//  261  516:istore          10
				if(j >= k1)
					break;
	//  262  518:iload           9
	//  263  520:iload           12
	//  264  522:icmpge          580
				recycler = ((RecyclerView.Recycler) (mSet[j]));
	//  265  525:aload_0         
	//  266  526:getfield        #87  <Field View[] mSet>
	//  267  529:iload           9
	//  268  531:aaload          
	//  269  532:astore_1        
				measureChild(((View) (recycler)), 0x40000000, true);
	//  270  533:aload_0         
	//  271  534:aload_1         
	//  272  535:ldc2            #387 <Int 0x40000000>
	//  273  538:iconst_1        
	//  274  539:invokespecial   #435 <Method void measureChild(View, int, boolean)>
				j1 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  275  542:aload_0         
	//  276  543:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  277  546:aload_1         
	//  278  547:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  279  550:istore          11
				i1 = i;
	//  280  552:iload           8
	//  281  554:istore          10
				if(j1 > i)
	//* 282  556:iload           11
	//* 283  558:iload           8
	//* 284  560:icmple          567
					i1 = j1;
	//  285  563:iload           11
	//  286  565:istore          10
				j++;
	//  287  567:iload           9
	//  288  569:iconst_1        
	//  289  570:iadd            
	//  290  571:istore          9
				i = i1;
	//  291  573:iload           10
	//  292  575:istore          8
			} while(true);
	//  293  577:goto            514
		}
		for(i = 0; i < k1; i++)
	//* 294  580:iconst_0        
	//* 295  581:istore          8
	//* 296  583:iload           8
	//* 297  585:iload           12
	//* 298  587:icmpge          775
		{
			recycler = ((RecyclerView.Recycler) (mSet[i]));
	//  299  590:aload_0         
	//  300  591:getfield        #87  <Field View[] mSet>
	//  301  594:iload           8
	//  302  596:aaload          
	//  303  597:astore_1        
			if(mOrientationHelper.getDecoratedMeasurement(((View) (recycler))) == i1)
				continue;
	//  304  598:aload_0         
	//  305  599:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  306  602:aload_1         
	//  307  603:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  308  606:iload           10
	//  309  608:icmpeq          766
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  310  611:aload_1         
	//  311  612:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  312  615:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  313  618:astore_2        
			Rect rect = ((LayoutParams) (state)).mDecorInsets;
	//  314  619:aload_2         
	//  315  620:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//  316  623:astore          17
			j1 = rect.top + rect.bottom + ((LayoutParams) (state)).topMargin + ((LayoutParams) (state)).bottomMargin;
	//  317  625:aload           17
	//  318  627:getfield        #218 <Field int Rect.top>
	//  319  630:aload           17
	//  320  632:getfield        #221 <Field int Rect.bottom>
	//  321  635:iadd            
	//  322  636:aload_2         
	//  323  637:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  324  640:iadd            
	//  325  641:aload_2         
	//  326  642:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  327  645:iadd            
	//  328  646:istore          11
			int k = rect.left + rect.right + ((LayoutParams) (state)).leftMargin + ((LayoutParams) (state)).rightMargin;
	//  329  648:aload           17
	//  330  650:getfield        #230 <Field int Rect.left>
	//  331  653:aload           17
	//  332  655:getfield        #233 <Field int Rect.right>
	//  333  658:iadd            
	//  334  659:aload_2         
	//  335  660:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  336  663:iadd            
	//  337  664:aload_2         
	//  338  665:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  339  668:iadd            
	//  340  669:istore          9
			l1 = getSpaceForSpanRange(((LayoutParams) (state)).mSpanIndex, ((LayoutParams) (state)).mSpanSize);
	//  341  671:aload_0         
	//  342  672:aload_2         
	//  343  673:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  344  676:aload_2         
	//  345  677:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  346  680:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//  347  683:istore          13
			if(mOrientation == 1)
	//* 348  685:aload_0         
	//* 349  686:getfield        #245 <Field int mOrientation>
	//* 350  689:iconst_1        
	//* 351  690:icmpne          726
			{
				k = getChildMeasureSpec(l1, 0x40000000, k, ((LayoutParams) (state)).width, false);
	//  352  693:iload           13
	//  353  695:ldc2            #387 <Int 0x40000000>
	//  354  698:iload           9
	//  355  700:aload_2         
	//  356  701:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//  357  704:iconst_0        
	//  358  705:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  359  708:istore          9
				j1 = android.view.View.MeasureSpec.makeMeasureSpec(i1 - j1, 0x40000000);
	//  360  710:iload           10
	//  361  712:iload           11
	//  362  714:isub            
	//  363  715:ldc2            #387 <Int 0x40000000>
	//  364  718:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  365  721:istore          11
			} else
	//* 366  723:goto            756
			{
				k = android.view.View.MeasureSpec.makeMeasureSpec(i1 - k, 0x40000000);
	//  367  726:iload           10
	//  368  728:iload           9
	//  369  730:isub            
	//  370  731:ldc2            #387 <Int 0x40000000>
	//  371  734:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  372  737:istore          9
				j1 = getChildMeasureSpec(l1, 0x40000000, j1, ((LayoutParams) (state)).height, false);
	//  373  739:iload           13
	//  374  741:ldc2            #387 <Int 0x40000000>
	//  375  744:iload           11
	//  376  746:aload_2         
	//  377  747:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//  378  750:iconst_0        
	//  379  751:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  380  754:istore          11
			}
			measureChildWithDecorationsAndMargin(((View) (recycler)), k, j1, true);
	//  381  756:aload_0         
	//  382  757:aload_1         
	//  383  758:iload           9
	//  384  760:iload           11
	//  385  762:iconst_1        
	//  386  763:invokespecial   #274 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
		}

	//  387  766:iload           8
	//  388  768:iconst_1        
	//  389  769:iadd            
	//  390  770:istore          8
	//* 391  772:goto            583
		layoutchunkresult.mConsumed = i1;
	//  392  775:aload           4
	//  393  777:iload           10
	//  394  779:putfield        #451 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		i = 0;
	//  395  782:iconst_0        
	//  396  783:istore          8
		int l = 0;
	//  397  785:iconst_0        
	//  398  786:istore          9
		l1 = 0;
	//  399  788:iconst_0        
	//  400  789:istore          13
		j1 = 0;
	//  401  791:iconst_0        
	//  402  792:istore          11
		if(mOrientation == 1)
	//* 403  794:aload_0         
	//* 404  795:getfield        #245 <Field int mOrientation>
	//* 405  798:iconst_1        
	//* 406  799:icmpne          850
		{
			if(layoutstate.mLayoutDirection == -1)
	//* 407  802:aload_3         
	//* 408  803:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 409  806:iconst_m1       
	//* 410  807:icmpne          826
			{
				j1 = layoutstate.mOffset;
	//  411  810:aload_3         
	//  412  811:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  413  814:istore          11
				i1 = j1 - i1;
	//  414  816:iload           11
	//  415  818:iload           10
	//  416  820:isub            
	//  417  821:istore          10
			} else
	//* 418  823:goto            895
			{
				j1 = layoutstate.mOffset;
	//  419  826:aload_3         
	//  420  827:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  421  830:istore          11
				l1 = j1 + i1;
	//  422  832:iload           11
	//  423  834:iload           10
	//  424  836:iadd            
	//  425  837:istore          13
				i1 = j1;
	//  426  839:iload           11
	//  427  841:istore          10
				j1 = l1;
	//  428  843:iload           13
	//  429  845:istore          11
			}
		} else
	//* 430  847:goto            895
		if(layoutstate.mLayoutDirection == -1)
	//* 431  850:aload_3         
	//* 432  851:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 433  854:iconst_m1       
	//* 434  855:icmpne          878
		{
			l = layoutstate.mOffset;
	//  435  858:aload_3         
	//  436  859:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  437  862:istore          9
			i = l - i1;
	//  438  864:iload           9
	//  439  866:iload           10
	//  440  868:isub            
	//  441  869:istore          8
			i1 = l1;
	//  442  871:iload           13
	//  443  873:istore          10
		} else
	//* 444  875:goto            895
		{
			i = layoutstate.mOffset;
	//  445  878:aload_3         
	//  446  879:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  447  882:istore          8
			l = i + i1;
	//  448  884:iload           8
	//  449  886:iload           10
	//  450  888:iadd            
	//  451  889:istore          9
			i1 = l1;
	//  452  891:iload           13
	//  453  893:istore          10
		}
		for(int i2 = 0; i2 < k1; i2++)
	//* 454  895:iconst_0        
	//* 455  896:istore          13
	//* 456  898:iload           13
	//* 457  900:iload           12
	//* 458  902:icmpge          1091
		{
			recycler = ((RecyclerView.Recycler) (mSet[i2]));
	//  459  905:aload_0         
	//  460  906:getfield        #87  <Field View[] mSet>
	//  461  909:iload           13
	//  462  911:aaload          
	//  463  912:astore_1        
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  464  913:aload_1         
	//  465  914:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  466  917:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  467  920:astore_2        
			if(mOrientation == 1)
	//* 468  921:aload_0         
	//* 469  922:getfield        #245 <Field int mOrientation>
	//* 470  925:iconst_1        
	//* 471  926:icmpne          1005
			{
				if(isLayoutRTL())
	//* 472  929:aload_0         
	//* 473  930:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//* 474  933:ifeq            973
				{
					l = getPaddingLeft() + mCachedBorders[mSpanCount - ((LayoutParams) (state)).mSpanIndex];
	//  475  936:aload_0         
	//  476  937:invokevirtual   #299 <Method int getPaddingLeft()>
	//  477  940:aload_0         
	//  478  941:getfield        #131 <Field int[] mCachedBorders>
	//  479  944:aload_0         
	//  480  945:getfield        #45  <Field int mSpanCount>
	//  481  948:aload_2         
	//  482  949:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  483  952:isub            
	//  484  953:iaload          
	//  485  954:iadd            
	//  486  955:istore          9
					i = l - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  487  957:iload           9
	//  488  959:aload_0         
	//  489  960:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  490  963:aload_1         
	//  491  964:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  492  967:isub            
	//  493  968:istore          8
				} else
	//* 494  970:goto            1034
				{
					i = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  495  973:aload_0         
	//  496  974:invokevirtual   #299 <Method int getPaddingLeft()>
	//  497  977:aload_0         
	//  498  978:getfield        #131 <Field int[] mCachedBorders>
	//  499  981:aload_2         
	//  500  982:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  501  985:iaload          
	//  502  986:iadd            
	//  503  987:istore          8
					l = i + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  504  989:iload           8
	//  505  991:aload_0         
	//  506  992:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  507  995:aload_1         
	//  508  996:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  509  999:iadd            
	//  510 1000:istore          9
				}
			} else
	//* 511 1002:goto            1034
			{
				i1 = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  512 1005:aload_0         
	//  513 1006:invokevirtual   #308 <Method int getPaddingTop()>
	//  514 1009:aload_0         
	//  515 1010:getfield        #131 <Field int[] mCachedBorders>
	//  516 1013:aload_2         
	//  517 1014:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  518 1017:iaload          
	//  519 1018:iadd            
	//  520 1019:istore          10
				j1 = i1 + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  521 1021:iload           10
	//  522 1023:aload_0         
	//  523 1024:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  524 1027:aload_1         
	//  525 1028:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  526 1031:iadd            
	//  527 1032:istore          11
			}
			layoutDecoratedWithMargins(((View) (recycler)), i, i1, l, j1);
	//  528 1034:aload_0         
	//  529 1035:aload_1         
	//  530 1036:iload           8
	//  531 1038:iload           10
	//  532 1040:iload           9
	//  533 1042:iload           11
	//  534 1044:invokevirtual   #461 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			if(((LayoutParams) (state)).isItemRemoved() || ((LayoutParams) (state)).isItemChanged())
	//* 535 1047:aload_2         
	//* 536 1048:invokevirtual   #462 <Method boolean GridLayoutManager$LayoutParams.isItemRemoved()>
	//* 537 1051:ifne            1061
	//* 538 1054:aload_2         
	//* 539 1055:invokevirtual   #465 <Method boolean GridLayoutManager$LayoutParams.isItemChanged()>
	//* 540 1058:ifeq            1067
				layoutchunkresult.mIgnoreConsumed = true;
	//  541 1061:aload           4
	//  542 1063:iconst_1        
	//  543 1064:putfield        #468 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
			layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | ((View) (recycler)).hasFocusable();
	//  544 1067:aload           4
	//  545 1069:aload           4
	//  546 1071:getfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  547 1074:aload_1         
	//  548 1075:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//  549 1078:ior             
	//  550 1079:putfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
		}

	//  551 1082:iload           13
	//  552 1084:iconst_1        
	//  553 1085:iadd            
	//  554 1086:istore          13
	//* 555 1088:goto            898
		Arrays.fill(((Object []) (mSet)), ((Object) (null)));
	//  556 1091:aload_0         
	//  557 1092:getfield        #87  <Field View[] mSet>
	//  558 1095:aconst_null     
	//  559 1096:invokestatic    #480 <Method void Arrays.fill(Object[], Object)>
	//  560 1099:return          
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
		if(view4 == null)
	//*   4    7:aload           27
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		Object obj = ((Object) ((LayoutParams)view4.getLayoutParams()));
	//    8   14:aload           27
	//    9   16:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   10   19:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   11   22:astore          23
		int i3 = ((LayoutParams) (obj)).mSpanIndex;
	//   12   24:aload           23
	//   13   26:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   14   29:istore          17
		int j3 = ((LayoutParams) (obj)).mSpanIndex + ((LayoutParams) (obj)).mSpanSize;
	//   15   31:aload           23
	//   16   33:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   17   36:aload           23
	//   18   38:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   19   41:iadd            
	//   20   42:istore          18
		if(super.onFocusSearchFailed(view, i, recycler, state) == null)
	//*  21   44:aload_0         
	//*  22   45:aload_1         
	//*  23   46:iload_2         
	//*  24   47:aload_3         
	//*  25   48:aload           4
	//*  26   50:invokespecial   #495 <Method View LinearLayoutManager.onFocusSearchFailed(View, int, RecyclerView$Recycler, RecyclerView$State)>
	//*  27   53:ifnonnull       58
			return null;
	//   28   56:aconst_null     
	//   29   57:areturn         
		boolean flag;
		if(convertFocusDirectionToLayoutDirection(i) == 1)
	//*  30   58:aload_0         
	//*  31   59:iload_2         
	//*  32   60:invokevirtual   #498 <Method int convertFocusDirectionToLayoutDirection(int)>
	//*  33   63:iconst_1        
	//*  34   64:icmpne          73
			flag = true;
	//   35   67:iconst_1        
	//   36   68:istore          22
		else
	//*  37   70:goto            76
			flag = false;
	//   38   73:iconst_0        
	//   39   74:istore          22
		if(flag != mShouldReverseLayout)
	//*  40   76:iload           22
	//*  41   78:aload_0         
	//*  42   79:getfield        #501 <Field boolean mShouldReverseLayout>
	//*  43   82:icmpeq          90
			i = 1;
	//   44   85:iconst_1        
	//   45   86:istore_2        
		else
	//*  46   87:goto            92
			i = 0;
	//   47   90:iconst_0        
	//   48   91:istore_2        
		byte byte0;
		int j;
		if(i != 0)
	//*  49   92:iload_2         
	//*  50   93:ifeq            112
		{
			i = getChildCount() - 1;
	//   51   96:aload_0         
	//   52   97:invokevirtual   #112 <Method int getChildCount()>
	//   53  100:iconst_1        
	//   54  101:isub            
	//   55  102:istore_2        
			byte0 = -1;
	//   56  103:iconst_m1       
	//   57  104:istore          5
			j = -1;
	//   58  106:iconst_m1       
	//   59  107:istore          6
		} else
	//*  60  109:goto            123
		{
			i = 0;
	//   61  112:iconst_0        
	//   62  113:istore_2        
			byte0 = 1;
	//   63  114:iconst_1        
	//   64  115:istore          5
			j = getChildCount();
	//   65  117:aload_0         
	//   66  118:invokevirtual   #112 <Method int getChildCount()>
	//   67  121:istore          6
		}
		int k;
		if(mOrientation == 1 && isLayoutRTL())
	//*  68  123:aload_0         
	//*  69  124:getfield        #245 <Field int mOrientation>
	//*  70  127:iconst_1        
	//*  71  128:icmpne          144
	//*  72  131:aload_0         
	//*  73  132:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//*  74  135:ifeq            144
			k = 1;
	//   75  138:iconst_1        
	//   76  139:istore          7
		else
	//*  77  141:goto            147
			k = 0;
	//   78  144:iconst_0        
	//   79  145:istore          7
		obj = null;
	//   80  147:aconst_null     
	//   81  148:astore          23
		int l1 = -1;
	//   82  150:iconst_m1       
	//   83  151:istore          12
		int k1 = 0;
	//   84  153:iconst_0        
	//   85  154:istore          11
		view = null;
	//   86  156:aconst_null     
	//   87  157:astore_1        
		int j1 = -1;
	//   88  158:iconst_m1       
	//   89  159:istore          10
		int i1 = 0;
	//   90  161:iconst_0        
	//   91  162:istore          9
		int k3 = getSpanGroupIndex(recycler, state, i);
	//   92  164:aload_0         
	//   93  165:aload_3         
	//   94  166:aload           4
	//   95  168:iload_2         
	//   96  169:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   97  172:istore          19
		for(int l = i; l != j;)
	//*  98  174:iload_2         
	//*  99  175:istore          8
	//* 100  177:iload           8
	//* 101  179:iload           6
	//* 102  181:icmpeq          647
		{
			i = getSpanGroupIndex(recycler, state, l);
	//  103  184:aload_0         
	//  104  185:aload_3         
	//  105  186:aload           4
	//  106  188:iload           8
	//  107  190:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//  108  193:istore_2        
			View view1 = getChildAt(l);
	//  109  194:aload_0         
	//  110  195:iload           8
	//  111  197:invokevirtual   #116 <Method View getChildAt(int)>
	//  112  200:astore          24
			if(view1 == view4)
	//* 113  202:aload           24
	//* 114  204:aload           27
	//* 115  206:if_acmpne       212
				break;
	//  116  209:goto            647
			int i2;
			int j2;
			int k2;
			int l2;
			View view2;
			View view3;
			if(view1.hasFocusable() && i != k3)
	//* 117  212:aload           24
	//* 118  214:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 119  217:ifeq            257
	//* 120  220:iload_2         
	//* 121  221:iload           19
	//* 122  223:icmpeq          257
			{
				view2 = ((View) (obj));
	//  123  226:aload           23
	//  124  228:astore          25
				i2 = l1;
	//  125  230:iload           12
	//  126  232:istore          13
				k2 = k1;
	//  127  234:iload           11
	//  128  236:istore          15
				view3 = view;
	//  129  238:aload_1         
	//  130  239:astore          26
				l2 = j1;
	//  131  241:iload           10
	//  132  243:istore          16
				j2 = i1;
	//  133  245:iload           9
	//  134  247:istore          14
				if(obj != null)
	//* 135  249:aload           23
	//* 136  251:ifnull          614
					break;
	//  137  254:goto            647
			} else
			{
				LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  138  257:aload           24
	//  139  259:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  140  262:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  141  265:astore          28
				int l3 = layoutparams.mSpanIndex;
	//  142  267:aload           28
	//  143  269:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  144  272:istore          20
				int i4 = layoutparams.mSpanIndex + layoutparams.mSpanSize;
	//  145  274:aload           28
	//  146  276:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  147  279:aload           28
	//  148  281:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  149  284:iadd            
	//  150  285:istore          21
				if(view1.hasFocusable() && l3 == i3 && i4 == j3)
	//* 151  287:aload           24
	//* 152  289:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 153  292:ifeq            312
	//* 154  295:iload           20
	//* 155  297:iload           17
	//* 156  299:icmpne          312
	//* 157  302:iload           21
	//* 158  304:iload           18
	//* 159  306:icmpne          312
					return view1;
	//  160  309:aload           24
	//  161  311:areturn         
				j2 = 0;
	//  162  312:iconst_0        
	//  163  313:istore          14
				if(view1.hasFocusable() && obj == null || !view1.hasFocusable() && view == null)
	//* 164  315:aload           24
	//* 165  317:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 166  320:ifeq            328
	//* 167  323:aload           23
	//* 168  325:ifnull          340
	//* 169  328:aload           24
	//* 170  330:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 171  333:ifne            345
	//* 172  336:aload_1         
	//* 173  337:ifnonnull       345
				{
					i = 1;
	//  174  340:iconst_1        
	//  175  341:istore_2        
				} else
	//* 176  342:goto            497
				{
					i = Math.max(l3, i3);
	//  177  345:iload           20
	//  178  347:iload           17
	//  179  349:invokestatic    #210 <Method int Math.max(int, int)>
	//  180  352:istore_2        
					i2 = Math.min(i4, j3) - i;
	//  181  353:iload           21
	//  182  355:iload           18
	//  183  357:invokestatic    #504 <Method int Math.min(int, int)>
	//  184  360:iload_2         
	//  185  361:isub            
	//  186  362:istore          13
					if(view1.hasFocusable())
	//* 187  364:aload           24
	//* 188  366:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 189  369:ifeq            425
					{
						if(i2 > k1)
	//* 190  372:iload           13
	//* 191  374:iload           11
	//* 192  376:icmple          384
						{
							i = 1;
	//  193  379:iconst_1        
	//  194  380:istore_2        
						} else
	//* 195  381:goto            497
						{
							i = j2;
	//  196  384:iload           14
	//  197  386:istore_2        
							if(i2 == k1)
	//* 198  387:iload           13
	//* 199  389:iload           11
	//* 200  391:icmpne          497
							{
								if(l3 > l1)
	//* 201  394:iload           20
	//* 202  396:iload           12
	//* 203  398:icmple          407
									i2 = 1;
	//  204  401:iconst_1        
	//  205  402:istore          13
								else
	//* 206  404:goto            410
									i2 = 0;
	//  207  407:iconst_0        
	//  208  408:istore          13
								i = j2;
	//  209  410:iload           14
	//  210  412:istore_2        
								if(k == i2)
	//* 211  413:iload           7
	//* 212  415:iload           13
	//* 213  417:icmpne          497
									i = 1;
	//  214  420:iconst_1        
	//  215  421:istore_2        
							}
						}
					} else
	//* 216  422:goto            497
					{
						i = j2;
	//  217  425:iload           14
	//  218  427:istore_2        
						if(obj == null)
	//* 219  428:aload           23
	//* 220  430:ifnonnull       497
						{
							i = j2;
	//  221  433:iload           14
	//  222  435:istore_2        
							if(isViewPartiallyVisible(view1, false, true))
	//* 223  436:aload_0         
	//* 224  437:aload           24
	//* 225  439:iconst_0        
	//* 226  440:iconst_1        
	//* 227  441:invokevirtual   #508 <Method boolean isViewPartiallyVisible(View, boolean, boolean)>
	//* 228  444:ifeq            497
								if(i2 > i1)
	//* 229  447:iload           13
	//* 230  449:iload           9
	//* 231  451:icmple          459
								{
									i = 1;
	//  232  454:iconst_1        
	//  233  455:istore_2        
								} else
	//* 234  456:goto            497
								{
									i = j2;
	//  235  459:iload           14
	//  236  461:istore_2        
									if(i2 == i1)
	//* 237  462:iload           13
	//* 238  464:iload           9
	//* 239  466:icmpne          497
									{
										if(l3 > j1)
	//* 240  469:iload           20
	//* 241  471:iload           10
	//* 242  473:icmple          482
											i2 = 1;
	//  243  476:iconst_1        
	//  244  477:istore          13
										else
	//* 245  479:goto            485
											i2 = 0;
	//  246  482:iconst_0        
	//  247  483:istore          13
										i = j2;
	//  248  485:iload           14
	//  249  487:istore_2        
										if(k == i2)
	//* 250  488:iload           7
	//* 251  490:iload           13
	//* 252  492:icmpne          497
											i = 1;
	//  253  495:iconst_1        
	//  254  496:istore_2        
									}
								}
						}
					}
				}
				view2 = ((View) (obj));
	//  255  497:aload           23
	//  256  499:astore          25
				i2 = l1;
	//  257  501:iload           12
	//  258  503:istore          13
				k2 = k1;
	//  259  505:iload           11
	//  260  507:istore          15
				view3 = view;
	//  261  509:aload_1         
	//  262  510:astore          26
				l2 = j1;
	//  263  512:iload           10
	//  264  514:istore          16
				j2 = i1;
	//  265  516:iload           9
	//  266  518:istore          14
				if(i != 0)
	//* 267  520:iload_2         
	//* 268  521:ifeq            614
					if(view1.hasFocusable())
	//* 269  524:aload           24
	//* 270  526:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 271  529:ifeq            574
					{
						i2 = layoutparams.mSpanIndex;
	//  272  532:aload           28
	//  273  534:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  274  537:istore          13
						k2 = Math.min(i4, j3) - Math.max(l3, i3);
	//  275  539:iload           21
	//  276  541:iload           18
	//  277  543:invokestatic    #504 <Method int Math.min(int, int)>
	//  278  546:iload           20
	//  279  548:iload           17
	//  280  550:invokestatic    #210 <Method int Math.max(int, int)>
	//  281  553:isub            
	//  282  554:istore          15
						view2 = view1;
	//  283  556:aload           24
	//  284  558:astore          25
						view3 = view;
	//  285  560:aload_1         
	//  286  561:astore          26
						l2 = j1;
	//  287  563:iload           10
	//  288  565:istore          16
						j2 = i1;
	//  289  567:iload           9
	//  290  569:istore          14
					} else
	//* 291  571:goto            614
					{
						l2 = layoutparams.mSpanIndex;
	//  292  574:aload           28
	//  293  576:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  294  579:istore          16
						j2 = Math.min(i4, j3) - Math.max(l3, i3);
	//  295  581:iload           21
	//  296  583:iload           18
	//  297  585:invokestatic    #504 <Method int Math.min(int, int)>
	//  298  588:iload           20
	//  299  590:iload           17
	//  300  592:invokestatic    #210 <Method int Math.max(int, int)>
	//  301  595:isub            
	//  302  596:istore          14
						view3 = view1;
	//  303  598:aload           24
	//  304  600:astore          26
						k2 = k1;
	//  305  602:iload           11
	//  306  604:istore          15
						i2 = l1;
	//  307  606:iload           12
	//  308  608:istore          13
						view2 = ((View) (obj));
	//  309  610:aload           23
	//  310  612:astore          25
					}
			}
			l += ((int) (byte0));
	//  311  614:iload           8
	//  312  616:iload           5
	//  313  618:iadd            
	//  314  619:istore          8
			obj = ((Object) (view2));
	//  315  621:aload           25
	//  316  623:astore          23
			l1 = i2;
	//  317  625:iload           13
	//  318  627:istore          12
			k1 = k2;
	//  319  629:iload           15
	//  320  631:istore          11
			view = view3;
	//  321  633:aload           26
	//  322  635:astore_1        
			j1 = l2;
	//  323  636:iload           16
	//  324  638:istore          10
			i1 = j2;
	//  325  640:iload           14
	//  326  642:istore          9
		}

	//* 327  644:goto            177
		if(obj != null)
	//* 328  647:aload           23
	//* 329  649:ifnull          655
			return ((View) (obj));
	//  330  652:aload           23
	//  331  654:areturn         
		else
			return view;
	//  332  655:aload_1         
	//  333  656:areturn         
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
	//*  33   64:icmple          84
	//*  34   67:aload_3         
	//*  35   68:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  36   71:aload_0         
	//*  37   72:getfield        #45  <Field int mSpanCount>
	//*  38   75:icmpne          84
				flag = true;
	//   39   78:iconst_1        
	//   40   79:istore          8
			else
	//*  41   81:goto            87
				flag = false;
	//   42   84:iconst_0        
	//   43   85:istore          8
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(j, l, i, 1, flag, false))));
	//   44   87:aload           4
	//   45   89:iload           6
	//   46   91:iload           7
	//   47   93:iload           5
	//   48   95:iconst_1        
	//   49   96:iload           8
	//   50   98:iconst_0        
	//   51   99:invokestatic    #519 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   52  102:invokevirtual   #525 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   53  105:return          
		}
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
	//*  63  123:icmple          143
	//*  64  126:aload_3         
	//*  65  127:invokevirtual   #121 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  66  130:aload_0         
	//*  67  131:getfield        #45  <Field int mSpanCount>
	//*  68  134:icmpne          143
			flag1 = true;
	//   69  137:iconst_1        
	//   70  138:istore          8
		else
	//*  71  140:goto            146
			flag1 = false;
	//   72  143:iconst_0        
	//   73  144:istore          8
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, k, i1, flag1, false))));
	//   74  146:aload           4
	//   75  148:iload           5
	//   76  150:iconst_1        
	//   77  151:iload           6
	//   78  153:iload           7
	//   79  155:iload           8
	//   80  157:iconst_0        
	//   81  158:invokestatic    #519 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   82  161:invokevirtual   #525 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   83  164:return          
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
		int k = getPaddingLeft() + getPaddingRight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #299 <Method int getPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #296 <Method int getPaddingRight()>
	//   12   22:iadd            
	//   13   23:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #308 <Method int getPaddingTop()>
	//   16   29:aload_0         
	//   17   30:invokevirtual   #305 <Method int getPaddingBottom()>
	//   18   33:iadd            
	//   19   34:istore          5
		if(mOrientation == 1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #245 <Field int mOrientation>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          87
		{
			j = chooseSize(j, rect.height() + l, getMinimumHeight());
	//   24   44:iload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #562 <Method int Rect.height()>
	//   27   49:iload           5
	//   28   51:iadd            
	//   29   52:aload_0         
	//   30   53:invokevirtual   #565 <Method int getMinimumHeight()>
	//   31   56:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   32   59:istore_3        
			i = chooseSize(i, mCachedBorders[mCachedBorders.length - 1] + k, getMinimumWidth());
	//   33   60:iload_2         
	//   34   61:aload_0         
	//   35   62:getfield        #131 <Field int[] mCachedBorders>
	//   36   65:aload_0         
	//   37   66:getfield        #131 <Field int[] mCachedBorders>
	//   38   69:arraylength     
	//   39   70:iconst_1        
	//   40   71:isub            
	//   41   72:iaload          
	//   42   73:iload           4
	//   43   75:iadd            
	//   44   76:aload_0         
	//   45   77:invokevirtual   #572 <Method int getMinimumWidth()>
	//   46   80:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   47   83:istore_2        
		} else
	//*  48   84:goto            127
		{
			i = chooseSize(i, rect.width() + k, getMinimumWidth());
	//   49   87:iload_2         
	//   50   88:aload_1         
	//   51   89:invokevirtual   #574 <Method int Rect.width()>
	//   52   92:iload           4
	//   53   94:iadd            
	//   54   95:aload_0         
	//   55   96:invokevirtual   #572 <Method int getMinimumWidth()>
	//   56   99:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   57  102:istore_2        
			j = chooseSize(j, mCachedBorders[mCachedBorders.length - 1] + l, getMinimumHeight());
	//   58  103:iload_3         
	//   59  104:aload_0         
	//   60  105:getfield        #131 <Field int[] mCachedBorders>
	//   61  108:aload_0         
	//   62  109:getfield        #131 <Field int[] mCachedBorders>
	//   63  112:arraylength     
	//   64  113:iconst_1        
	//   65  114:isub            
	//   66  115:iaload          
	//   67  116:iload           5
	//   68  118:iadd            
	//   69  119:aload_0         
	//   70  120:invokevirtual   #565 <Method int getMinimumHeight()>
	//   71  123:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   72  126:istore_3        
		}
		setMeasuredDimension(i, j);
	//   73  127:aload_0         
	//   74  128:iload_2         
	//   75  129:iload_3         
	//   76  130:invokevirtual   #576 <Method void setMeasuredDimension(int, int)>
	//   77  133:return          
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
