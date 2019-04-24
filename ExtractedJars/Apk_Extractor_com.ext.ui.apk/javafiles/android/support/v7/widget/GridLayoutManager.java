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
			j = 1;
	//    2    5:iconst_1        
	//    3    6:istore          4
			boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore          7
			k = i;
	//    6   11:iload_3         
	//    7   12:istore          6
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
			k = -1;
	//   46   86:iconst_m1       
	//   47   87:istore          6
			i--;
	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:isub            
	//   51   92:istore_3        
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
		boolean flag;
		int ai1[];
label0:
		{
			flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			if(ai != null && ai.length == i + 1)
	//*   2    3:aload_0         
	//*   3    4:ifnull          28
	//*   4    7:aload_0         
	//*   5    8:arraylength     
	//*   6    9:iload_1         
	//*   7   10:iconst_1        
	//*   8   11:iadd            
	//*   9   12:icmpne          28
			{
				ai1 = ai;
	//   10   15:aload_0         
	//   11   16:astore          8
				if(ai[ai.length - 1] == j)
					break label0;
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:arraylength     
	//   15   21:iconst_1        
	//   16   22:isub            
	//   17   23:iaload          
	//   18   24:iload_2         
	//   19   25:icmpeq          35
			}
			ai1 = new int[i + 1];
	//   20   28:iload_1         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:newarray        int[]
	//   24   33:astore          8
		}
		ai1[0] = 0;
	//   25   35:aload           8
	//   26   37:iconst_0        
	//   27   38:iconst_0        
	//   28   39:iastore         
		int j1 = j / i;
	//   29   40:iload_2         
	//   30   41:iload_1         
	//   31   42:idiv            
	//   32   43:istore          6
		int k1 = j % i;
	//   33   45:iload_2         
	//   34   46:iload_1         
	//   35   47:irem            
	//   36   48:istore          7
		int k = 1;
	//   37   50:iconst_1        
	//   38   51:istore_3        
		int l = 0;
	//   39   52:iconst_0        
	//   40   53:istore          4
		j = ((int) (flag));
	//   41   55:iload           5
	//   42   57:istore_2        
		while(k <= i) 
	//*  43   58:iload_3         
	//*  44   59:iload_1         
	//*  45   60:icmpgt          110
		{
			j += k1;
	//   46   63:iload_2         
	//   47   64:iload           7
	//   48   66:iadd            
	//   49   67:istore_2        
			int i1;
			if(j > 0 && i - j < k1)
	//*  50   68:iload_2         
	//*  51   69:ifle            113
	//*  52   72:iload_1         
	//*  53   73:iload_2         
	//*  54   74:isub            
	//*  55   75:iload           7
	//*  56   77:icmpge          113
			{
				i1 = j1 + 1;
	//   57   80:iload           6
	//   58   82:iconst_1        
	//   59   83:iadd            
	//   60   84:istore          5
				j -= i;
	//   61   86:iload_2         
	//   62   87:iload_1         
	//   63   88:isub            
	//   64   89:istore_2        
			} else
	//*  65   90:iload           4
	//*  66   92:iload           5
	//*  67   94:iadd            
	//*  68   95:istore          4
	//*  69   97:aload           8
	//*  70   99:iload_3         
	//*  71  100:iload           4
	//*  72  102:iastore         
	//*  73  103:iload_3         
	//*  74  104:iconst_1        
	//*  75  105:iadd            
	//*  76  106:istore_3        
	//*  77  107:goto            58
	//*  78  110:aload           8
	//*  79  112:areturn         
			{
				i1 = j1;
	//   80  113:iload           6
	//   81  115:istore          5
			}
			l += i1;
			ai1[k] = l;
			k++;
		}
		return ai1;
	//*  82  117:goto            90
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
	//    3    7:astore          8
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           8
	//    5   11:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//    6   14:astore          9
		int k = rect.top + rect.bottom + layoutparams.topMargin + layoutparams.bottomMargin;
	//    7   16:aload           9
	//    8   18:getfield        #218 <Field int Rect.top>
	//    9   21:aload           9
	//   10   23:getfield        #221 <Field int Rect.bottom>
	//   11   26:iadd            
	//   12   27:aload           8
	//   13   29:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//   14   32:iadd            
	//   15   33:aload           8
	//   16   35:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//   17   38:iadd            
	//   18   39:istore          5
		int j = rect.left;
	//   19   41:aload           9
	//   20   43:getfield        #230 <Field int Rect.left>
	//   21   46:istore          4
		int l = rect.right;
	//   22   48:aload           9
	//   23   50:getfield        #233 <Field int Rect.right>
	//   24   53:istore          6
		int i1 = layoutparams.leftMargin;
	//   25   55:aload           8
	//   26   57:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//   27   60:istore          7
		j = layoutparams.rightMargin + (l + j + i1);
	//   28   62:aload           8
	//   29   64:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//   30   67:iload           6
	//   31   69:iload           4
	//   32   71:iadd            
	//   33   72:iload           7
	//   34   74:iadd            
	//   35   75:iadd            
	//   36   76:istore          4
		l = getSpaceForSpanRange(layoutparams.mSpanIndex, layoutparams.mSpanSize);
	//   37   78:aload_0         
	//   38   79:aload           8
	//   39   81:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   40   84:aload           8
	//   41   86:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   42   89:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//   43   92:istore          6
		if(mOrientation == 1)
	//*  44   94:aload_0         
	//*  45   95:getfield        #245 <Field int mOrientation>
	//*  46   98:iconst_1        
	//*  47   99:icmpne          151
		{
			j = getChildMeasureSpec(l, i, j, layoutparams.width, false);
	//   48  102:iload           6
	//   49  104:iload_2         
	//   50  105:iload           4
	//   51  107:aload           8
	//   52  109:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   53  112:iconst_0        
	//   54  113:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   55  116:istore          4
			i = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getHeightMode(), k, layoutparams.height, true);
	//   56  118:aload_0         
	//   57  119:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   58  122:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   59  125:aload_0         
	//   60  126:invokevirtual   #264 <Method int getHeightMode()>
	//   61  129:iload           5
	//   62  131:aload           8
	//   63  133:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   64  136:iconst_1        
	//   65  137:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   66  140:istore_2        
		} else
	//*  67  141:aload_0         
	//*  68  142:aload_1         
	//*  69  143:iload           4
	//*  70  145:iload_2         
	//*  71  146:iload_3         
	//*  72  147:invokespecial   #271 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//*  73  150:return          
		{
			i = getChildMeasureSpec(l, i, k, layoutparams.height, false);
	//   74  151:iload           6
	//   75  153:iload_2         
	//   76  154:iload           5
	//   77  156:aload           8
	//   78  158:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   79  161:iconst_0        
	//   80  162:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   81  165:istore_2        
			j = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), j, layoutparams.width, true);
	//   82  166:aload_0         
	//   83  167:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   84  170:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   85  173:aload_0         
	//   86  174:invokevirtual   #274 <Method int getWidthMode()>
	//   87  177:iload           4
	//   88  179:aload           8
	//   89  181:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   90  184:iconst_1        
	//   91  185:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   92  188:istore          4
		}
		measureChildWithDecorationsAndMargin(view, j, i, flag);
	//*  93  190:goto            141
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
		int i1;
		int j1;
		View view;
		View view1;
		View view2;
		view1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		ensureLayoutState();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #337 <Method void ensureLayoutState()>
		i1 = mOrientationHelper.getStartAfterPadding();
	//    4    7:aload_0         
	//    5    8:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    6   11:invokevirtual   #340 <Method int OrientationHelper.getStartAfterPadding()>
	//    7   14:istore          7
		j1 = mOrientationHelper.getEndAfterPadding();
	//    8   16:aload_0         
	//    9   17:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   10   20:invokevirtual   #343 <Method int OrientationHelper.getEndAfterPadding()>
	//   11   23:istore          8
		int l;
		int k1;
		if(j > i)
	//*  12   25:iload           4
	//*  13   27:iload_3         
	//*  14   28:icmple          113
			l = 1;
	//   15   31:iconst_1        
	//   16   32:istore          6
		else
	//*  17   34:aconst_null     
	//*  18   35:astore          10
	//*  19   37:iload_3         
	//*  20   38:iload           4
	//*  21   40:icmpeq          197
	//*  22   43:aload_0         
	//*  23   44:iload_3         
	//*  24   45:invokevirtual   #116 <Method View getChildAt(int)>
	//*  25   48:astore          12
	//*  26   50:aload_0         
	//*  27   51:aload           12
	//*  28   53:invokevirtual   #97  <Method int getPosition(View)>
	//*  29   56:istore          9
	//*  30   58:iload           9
	//*  31   60:iflt            216
	//*  32   63:iload           9
	//*  33   65:iload           5
	//*  34   67:icmpge          216
	//*  35   70:aload_0         
	//*  36   71:aload_1         
	//*  37   72:aload_2         
	//*  38   73:iload           9
	//*  39   75:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  40   78:ifeq            119
	//*  41   81:aload           11
	//*  42   83:astore          12
	//*  43   85:aload           10
	//*  44   87:astore          11
	//*  45   89:aload           12
	//*  46   91:astore          10
	//*  47   93:iload_3         
	//*  48   94:iload           6
	//*  49   96:iadd            
	//*  50   97:istore_3        
	//*  51   98:aload           11
	//*  52  100:astore          12
	//*  53  102:aload           10
	//*  54  104:astore          11
	//*  55  106:aload           12
	//*  56  108:astore          10
	//*  57  110:goto            37
			l = -1;
	//   58  113:iconst_m1       
	//   59  114:istore          6
		view = null;
		if(i == j)
			break; /* Loop/switch isn't completed */
		view2 = getChildAt(i);
		k1 = getPosition(view2);
		if(k1 < 0 || k1 >= k)
			break MISSING_BLOCK_LABEL_216;
		if(getSpanIndex(recycler, state, k1) != 0)
		{
			view2 = view1;
			view1 = view;
			view = view2;
		} else
	//*  60  116:goto            34
		{
label0:
			{
				if(!((RecyclerView.LayoutParams)view2.getLayoutParams()).isItemRemoved())
					break label0;
	//   61  119:aload           12
	//   62  121:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  124:checkcast       #276 <Class RecyclerView$LayoutParams>
	//   64  127:invokevirtual   #346 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//   65  130:ifeq            149
				if(view != null)
					break MISSING_BLOCK_LABEL_216;
	//   66  133:aload           10
	//   67  135:ifnonnull       216
				view = view1;
	//   68  138:aload           11
	//   69  140:astore          10
				view1 = view2;
	//   70  142:aload           12
	//   71  144:astore          11
			}
		}
_L4:
		i += l;
		view2 = view1;
		view1 = view;
		view = view2;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_37;
	//*  72  146:goto            93
		View view4;
		if(mOrientationHelper.getDecoratedStart(view2) < j1)
	//*  73  149:aload_0         
	//*  74  150:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  75  153:aload           12
	//*  76  155:invokevirtual   #349 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  77  158:iload           8
	//*  78  160:icmpge          181
		{
			view4 = view2;
	//   79  163:aload           12
	//   80  165:astore          13
			if(mOrientationHelper.getDecoratedEnd(view2) >= i1)
				break MISSING_BLOCK_LABEL_206;
	//   81  167:aload_0         
	//   82  168:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   83  171:aload           12
	//   84  173:invokevirtual   #352 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   85  176:iload           7
	//   86  178:icmpge          206
		}
		if(view1 != null)
			break MISSING_BLOCK_LABEL_216;
	//   87  181:aload           11
	//   88  183:ifnonnull       216
		view1 = view;
	//   89  186:aload           10
	//   90  188:astore          11
		view = view2;
	//   91  190:aload           12
	//   92  192:astore          10
		continue; /* Loop/switch isn't completed */
	//   93  194:goto            93
_L1:
		if(view1 == null)
	//*  94  197:aload           11
	//*  95  199:ifnull          209
	//*  96  202:aload           11
	//*  97  204:astore          13
	//*  98  206:aload           13
	//*  99  208:areturn         
			view1 = view;
	//  100  209:aload           10
	//  101  211:astore          11
		view4 = view1;
		return view4;
	//* 102  213:goto            202
		View view3 = view;
	//  103  216:aload           10
	//  104  218:astore          12
		view = view1;
	//  105  220:aload           11
	//  106  222:astore          10
		view1 = view3;
	//  107  224:aload           12
	//  108  226:astore          11
		if(true) goto _L4; else goto _L3
	//  109  228:goto            93
_L3:
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
		int l3;
		boolean flag1;
		l3 = mOrientationHelper.getModeInOther();
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #386 <Method int OrientationHelper.getModeInOther()>
	//    3    7:istore          14
		int i3;
		if(l3 != 0x40000000)
	//*   4    9:iload           14
	//*   5   11:ldc2            #387 <Int 0x40000000>
	//*   6   14:icmpeq          220
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          8
		else
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #112 <Method int getChildCount()>
	//*  11   24:ifle            226
	//*  12   27:aload_0         
	//*  13   28:getfield        #131 <Field int[] mCachedBorders>
	//*  14   31:aload_0         
	//*  15   32:getfield        #45  <Field int mSpanCount>
	//*  16   35:iaload          
	//*  17   36:istore          10
	//*  18   38:iload           8
	//*  19   40:ifeq            47
	//*  20   43:aload_0         
	//*  21   44:invokespecial   #389 <Method void updateMeasurements()>
	//*  22   47:aload_3         
	//*  23   48:getfield        #332 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  24   51:iconst_1        
	//*  25   52:icmpne          232
	//*  26   55:iconst_1        
	//*  27   56:istore          15
	//*  28   58:iconst_0        
	//*  29   59:istore          12
	//*  30   61:iconst_0        
	//*  31   62:istore          13
	//*  32   64:aload_0         
	//*  33   65:getfield        #45  <Field int mSpanCount>
	//*  34   68:istore          7
	//*  35   70:iload           12
	//*  36   72:istore          11
	//*  37   74:iload           13
	//*  38   76:istore          9
	//*  39   78:iload           15
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
	//*  54  104:istore          7
	//*  55  106:iload           13
	//*  56  108:istore          9
	//*  57  110:iload           12
	//*  58  112:istore          11
	//*  59  114:iload           11
	//*  60  116:aload_0         
	//*  61  117:getfield        #45  <Field int mSpanCount>
	//*  62  120:icmpge          250
	//*  63  123:aload_3         
	//*  64  124:aload_2         
	//*  65  125:invokevirtual   #318 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//*  66  128:ifeq            250
	//*  67  131:iload           7
	//*  68  133:ifle            250
	//*  69  136:aload_3         
	//*  70  137:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  71  140:istore          13
	//*  72  142:aload_0         
	//*  73  143:aload_1         
	//*  74  144:aload_2         
	//*  75  145:iload           13
	//*  76  147:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  77  150:istore          12
	//*  78  152:iload           12
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
	//*  89  178:iload           13
	//*  90  180:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//*  91  183:ldc2            #395 <String " requires ">
	//*  92  186:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//*  93  189:iload           12
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
	//  106  221:istore          8
		if(getChildCount() > 0)
			k1 = mCachedBorders[mSpanCount];
		else
	//* 107  223:goto            20
			k1 = 0;
	//  108  226:iconst_0        
	//  109  227:istore          10
		if(flag)
			updateMeasurements();
		if(layoutstate.mItemDirection == 1)
			flag1 = true;
		else
	//* 110  229:goto            38
			flag1 = false;
	//  111  232:iconst_0        
	//  112  233:istore          15
		i2 = 0;
		i3 = 0;
		i = mSpanCount;
		l1 = i2;
		j1 = i3;
		if(!flag1)
		{
			i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
			j1 = i3;
			l1 = i2;
		}
_L6:
		if(l1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0) goto _L2; else goto _L1
_L1:
		i3 = layoutstate.mCurrentPosition;
		i2 = getSpanSize(recycler, state, i3);
		if(i2 > mSpanCount)
			throw new IllegalArgumentException((new StringBuilder()).append("Item at position ").append(i3).append(" requires ").append(i2).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
	//* 113  235:goto            58
		i -= i2;
	//  114  238:iload           7
	//  115  240:iload           12
	//  116  242:isub            
	//  117  243:istore          7
		if(i >= 0) goto _L3; else goto _L2
	//  118  245:iload           7
	//  119  247:ifge            262
_L2:
		View view;
		if(l1 == 0)
	//* 120  250:iload           11
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
	//* 129  267:astore          16
_L3:
		if((view = layoutstate.next(recycler)) == null) goto _L2; else goto _L4
	//  130  269:aload           16
	//  131  271:ifnull          250
_L4:
		j1 += i2;
	//  132  274:iload           9
	//  133  276:iload           12
	//  134  278:iadd            
	//  135  279:istore          9
		mSet[l1] = view;
	//  136  281:aload_0         
	//  137  282:getfield        #87  <Field View[] mSet>
	//  138  285:iload           11
	//  139  287:aload           16
	//  140  289:aastore         
		l1++;
	//  141  290:iload           11
	//  142  292:iconst_1        
	//  143  293:iadd            
	//  144  294:istore          11
		if(true) goto _L6; else goto _L5
	//  145  296:goto            114
_L5:
		assignSpans(recycler, state, l1, j1, flag1);
	//  146  299:aload_0         
	//  147  300:aload_1         
	//  148  301:aload_2         
	//  149  302:iload           11
	//  150  304:iload           9
	//  151  306:iload           15
	//  152  308:invokespecial   #413 <Method void assignSpans(RecyclerView$Recycler, RecyclerView$State, int, int, boolean)>
		j1 = 0;
	//  153  311:iconst_0        
	//  154  312:istore          9
		float f = 0.0F;
	//  155  314:fconst_0        
	//  156  315:fstore          5
		int j = 0;
	//  157  317:iconst_0        
	//  158  318:istore          7
		while(j1 < l1) 
	//* 159  320:iload           9
	//* 160  322:iload           11
	//* 161  324:icmpge          477
		{
			recycler = ((RecyclerView.Recycler) (mSet[j1]));
	//  162  327:aload_0         
	//  163  328:getfield        #87  <Field View[] mSet>
	//  164  331:iload           9
	//  165  333:aaload          
	//  166  334:astore_1        
			float f1;
			int j2;
			int j3;
			if(layoutstate.mScrapList == null)
	//* 167  335:aload_3         
	//* 168  336:getfield        #417 <Field java.util.List LinearLayoutManager$LayoutState.mScrapList>
	//* 169  339:ifnonnull       455
			{
				if(flag1)
	//* 170  342:iload           15
	//* 171  344:ifeq            446
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
	//* 182  363:iload           14
	//* 183  365:iconst_0        
	//* 184  366:invokespecial   #427 <Method void measureChild(View, int, boolean)>
	//* 185  369:aload_0         
	//* 186  370:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 187  373:aload_1         
	//* 188  374:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 189  377:istore          13
	//* 190  379:iload           7
	//* 191  381:istore          12
	//* 192  383:iload           13
	//* 193  385:iload           7
	//* 194  387:icmple          394
	//* 195  390:iload           13
	//* 196  392:istore          12
	//* 197  394:aload_1         
	//* 198  395:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 199  398:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 200  401:astore_2        
	//* 201  402:aload_0         
	//* 202  403:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 203  406:aload_1         
	//* 204  407:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//* 205  410:i2f             
	//* 206  411:fconst_1        
	//* 207  412:fmul            
	//* 208  413:aload_2         
	//* 209  414:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//* 210  417:i2f             
	//* 211  418:fdiv            
	//* 212  419:fstore          6
	//* 213  421:fload           6
	//* 214  423:fload           5
	//* 215  425:fcmpl           
	//* 216  426:ifle            1106
	//* 217  429:fload           6
	//* 218  431:fstore          5
	//* 219  433:iload           9
	//* 220  435:iconst_1        
	//* 221  436:iadd            
	//* 222  437:istore          9
	//* 223  439:iload           12
	//* 224  441:istore          7
	//* 225  443:goto            320
					addView(((View) (recycler)), 0);
	//  226  446:aload_0         
	//  227  447:aload_1         
	//  228  448:iconst_0        
	//  229  449:invokevirtual   #436 <Method void addView(View, int)>
			} else
	//* 230  452:goto            352
			if(flag1)
	//* 231  455:iload           15
	//* 232  457:ifeq            468
				addDisappearingView(((View) (recycler)));
	//  233  460:aload_0         
	//  234  461:aload_1         
	//  235  462:invokevirtual   #439 <Method void addDisappearingView(View)>
			else
	//* 236  465:goto            352
				addDisappearingView(((View) (recycler)), 0);
	//  237  468:aload_0         
	//  238  469:aload_1         
	//  239  470:iconst_0        
	//  240  471:invokevirtual   #441 <Method void addDisappearingView(View, int)>
			calculateItemDecorationsForChild(((View) (recycler)), mDecorInsets);
			measureChild(((View) (recycler)), l3, false);
			j3 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
			j2 = j;
			if(j3 > j)
				j2 = j3;
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
			f1 = ((float)mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) * 1.0F) / (float)((LayoutParams) (state)).mSpanSize;
			if(f1 > f)
				f = f1;
			j1++;
			j = j2;
		}
	//* 241  474:goto            352
		j1 = j;
	//  242  477:iload           7
	//  243  479:istore          9
		if(flag)
	//* 244  481:iload           8
	//* 245  483:ifeq            558
		{
			guessMeasurement(f, k1);
	//  246  486:aload_0         
	//  247  487:fload           5
	//  248  489:iload           10
	//  249  491:invokespecial   #443 <Method void guessMeasurement(float, int)>
			j = 0;
	//  250  494:iconst_0        
	//  251  495:istore          7
			int k = 0;
	//  252  497:iconst_0        
	//  253  498:istore          8
			do
			{
				j1 = j;
	//  254  500:iload           7
	//  255  502:istore          9
				if(k >= l1)
					break;
	//  256  504:iload           8
	//  257  506:iload           11
	//  258  508:icmpge          558
				recycler = ((RecyclerView.Recycler) (mSet[k]));
	//  259  511:aload_0         
	//  260  512:getfield        #87  <Field View[] mSet>
	//  261  515:iload           8
	//  262  517:aaload          
	//  263  518:astore_1        
				measureChild(((View) (recycler)), 0x40000000, true);
	//  264  519:aload_0         
	//  265  520:aload_1         
	//  266  521:ldc2            #387 <Int 0x40000000>
	//  267  524:iconst_1        
	//  268  525:invokespecial   #427 <Method void measureChild(View, int, boolean)>
				j1 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  269  528:aload_0         
	//  270  529:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  271  532:aload_1         
	//  272  533:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  273  536:istore          9
				if(j1 > j)
	//* 274  538:iload           9
	//* 275  540:iload           7
	//* 276  542:icmple          1103
					j = j1;
	//  277  545:iload           9
	//  278  547:istore          7
				k++;
	//  279  549:iload           8
	//  280  551:iconst_1        
	//  281  552:iadd            
	//  282  553:istore          8
			} while(true);
	//  283  555:goto            500
		}
		j = 0;
	//  284  558:iconst_0        
	//  285  559:istore          7
		while(j < l1) 
	//* 286  561:iload           7
	//* 287  563:iload           11
	//* 288  565:icmpge          757
		{
			recycler = ((RecyclerView.Recycler) (mSet[j]));
	//  289  568:aload_0         
	//  290  569:getfield        #87  <Field View[] mSet>
	//  291  572:iload           7
	//  292  574:aaload          
	//  293  575:astore_1        
			if(mOrientationHelper.getDecoratedMeasurement(((View) (recycler))) != j1)
	//* 294  576:aload_0         
	//* 295  577:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 296  580:aload_1         
	//* 297  581:invokevirtual   #430 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 298  584:iload           9
	//* 299  586:icmpeq          715
			{
				state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  300  589:aload_1         
	//  301  590:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  302  593:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  303  596:astore_2        
				Rect rect = ((LayoutParams) (state)).mDecorInsets;
	//  304  597:aload_2         
	//  305  598:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//  306  601:astore          16
				int l = rect.top + rect.bottom + ((LayoutParams) (state)).topMargin + ((LayoutParams) (state)).bottomMargin;
	//  307  603:aload           16
	//  308  605:getfield        #218 <Field int Rect.top>
	//  309  608:aload           16
	//  310  610:getfield        #221 <Field int Rect.bottom>
	//  311  613:iadd            
	//  312  614:aload_2         
	//  313  615:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  314  618:iadd            
	//  315  619:aload_2         
	//  316  620:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  317  623:iadd            
	//  318  624:istore          8
				k1 = rect.left;
	//  319  626:aload           16
	//  320  628:getfield        #230 <Field int Rect.left>
	//  321  631:istore          10
				k1 = rect.right + k1 + ((LayoutParams) (state)).leftMargin + ((LayoutParams) (state)).rightMargin;
	//  322  633:aload           16
	//  323  635:getfield        #233 <Field int Rect.right>
	//  324  638:iload           10
	//  325  640:iadd            
	//  326  641:aload_2         
	//  327  642:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  328  645:iadd            
	//  329  646:aload_2         
	//  330  647:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  331  650:iadd            
	//  332  651:istore          10
				int k2 = getSpaceForSpanRange(((LayoutParams) (state)).mSpanIndex, ((LayoutParams) (state)).mSpanSize);
	//  333  653:aload_0         
	//  334  654:aload_2         
	//  335  655:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  336  658:aload_2         
	//  337  659:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  338  662:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//  339  665:istore          12
				if(mOrientation == 1)
	//* 340  667:aload_0         
	//* 341  668:getfield        #245 <Field int mOrientation>
	//* 342  671:iconst_1        
	//* 343  672:icmpne          724
				{
					k1 = getChildMeasureSpec(k2, 0x40000000, k1, ((LayoutParams) (state)).width, false);
	//  344  675:iload           12
	//  345  677:ldc2            #387 <Int 0x40000000>
	//  346  680:iload           10
	//  347  682:aload_2         
	//  348  683:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//  349  686:iconst_0        
	//  350  687:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  351  690:istore          10
					l = android.view.View.MeasureSpec.makeMeasureSpec(j1 - l, 0x40000000);
	//  352  692:iload           9
	//  353  694:iload           8
	//  354  696:isub            
	//  355  697:ldc2            #387 <Int 0x40000000>
	//  356  700:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  357  703:istore          8
				} else
	//* 358  705:aload_0         
	//* 359  706:aload_1         
	//* 360  707:iload           10
	//* 361  709:iload           8
	//* 362  711:iconst_1        
	//* 363  712:invokespecial   #271 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//* 364  715:iload           7
	//* 365  717:iconst_1        
	//* 366  718:iadd            
	//* 367  719:istore          7
	//* 368  721:goto            561
				{
					k1 = android.view.View.MeasureSpec.makeMeasureSpec(j1 - k1, 0x40000000);
	//  369  724:iload           9
	//  370  726:iload           10
	//  371  728:isub            
	//  372  729:ldc2            #387 <Int 0x40000000>
	//  373  732:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  374  735:istore          10
					l = getChildMeasureSpec(k2, 0x40000000, l, ((LayoutParams) (state)).height, false);
	//  375  737:iload           12
	//  376  739:ldc2            #387 <Int 0x40000000>
	//  377  742:iload           8
	//  378  744:aload_2         
	//  379  745:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//  380  748:iconst_0        
	//  381  749:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  382  752:istore          8
				}
				measureChildWithDecorationsAndMargin(((View) (recycler)), k1, l, true);
			}
			j++;
		}
	//* 383  754:goto            705
		layoutchunkresult.mConsumed = j1;
	//  384  757:aload           4
	//  385  759:iload           9
	//  386  761:putfield        #451 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		k1 = 0;
	//  387  764:iconst_0        
	//  388  765:istore          10
		int i1;
		int l2;
		int k3;
		if(mOrientation == 1)
	//* 389  767:aload_0         
	//* 390  768:getfield        #245 <Field int mOrientation>
	//* 391  771:iconst_1        
	//* 392  772:icmpne          976
		{
			if(layoutstate.mLayoutDirection == -1)
	//* 393  775:aload_3         
	//* 394  776:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 395  779:iconst_m1       
	//* 396  780:icmpne          954
			{
				k1 = layoutstate.mOffset;
	//  397  783:aload_3         
	//  398  784:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  399  787:istore          10
				j = k1 - j1;
	//  400  789:iload           10
	//  401  791:iload           9
	//  402  793:isub            
	//  403  794:istore          7
				i1 = 0;
	//  404  796:iconst_0        
	//  405  797:istore          8
				j1 = 0;
	//  406  799:iconst_0        
	//  407  800:istore          9
			} else
	//* 408  802:iload           9
	//* 409  804:istore          13
	//* 410  806:iconst_0        
	//* 411  807:istore          14
	//* 412  809:iload           10
	//* 413  811:istore          9
	//* 414  813:iload           7
	//* 415  815:istore          12
	//* 416  817:iload           13
	//* 417  819:istore          7
	//* 418  821:iload           14
	//* 419  823:istore          10
	//* 420  825:iload           10
	//* 421  827:iload           11
	//* 422  829:icmpge          1094
	//* 423  832:aload_0         
	//* 424  833:getfield        #87  <Field View[] mSet>
	//* 425  836:iload           10
	//* 426  838:aaload          
	//* 427  839:astore_1        
	//* 428  840:aload_1         
	//* 429  841:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 430  844:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 431  847:astore_2        
	//* 432  848:aload_0         
	//* 433  849:getfield        #245 <Field int mOrientation>
	//* 434  852:iconst_1        
	//* 435  853:icmpne          1062
	//* 436  856:aload_0         
	//* 437  857:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//* 438  860:ifeq            1030
	//* 439  863:aload_0         
	//* 440  864:invokevirtual   #299 <Method int getPaddingLeft()>
	//* 441  867:aload_0         
	//* 442  868:getfield        #131 <Field int[] mCachedBorders>
	//* 443  871:aload_0         
	//* 444  872:getfield        #45  <Field int mSpanCount>
	//* 445  875:aload_2         
	//* 446  876:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 447  879:isub            
	//* 448  880:iaload          
	//* 449  881:iadd            
	//* 450  882:istore          8
	//* 451  884:iload           8
	//* 452  886:aload_0         
	//* 453  887:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//* 454  890:aload_1         
	//* 455  891:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//* 456  894:isub            
	//* 457  895:istore          7
	//* 458  897:aload_0         
	//* 459  898:aload_1         
	//* 460  899:iload           7
	//* 461  901:iload           12
	//* 462  903:iload           8
	//* 463  905:iload           9
	//* 464  907:invokevirtual   #461 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
	//* 465  910:aload_2         
	//* 466  911:invokevirtual   #462 <Method boolean GridLayoutManager$LayoutParams.isItemRemoved()>
	//* 467  914:ifne            924
	//* 468  917:aload_2         
	//* 469  918:invokevirtual   #465 <Method boolean GridLayoutManager$LayoutParams.isItemChanged()>
	//* 470  921:ifeq            930
	//* 471  924:aload           4
	//* 472  926:iconst_1        
	//* 473  927:putfield        #468 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//* 474  930:aload           4
	//* 475  932:aload           4
	//* 476  934:getfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//* 477  937:aload_1         
	//* 478  938:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 479  941:ior             
	//* 480  942:putfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//* 481  945:iload           10
	//* 482  947:iconst_1        
	//* 483  948:iadd            
	//* 484  949:istore          10
	//* 485  951:goto            825
			{
				j = layoutstate.mOffset;
	//  486  954:aload_3         
	//  487  955:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  488  958:istore          7
				k1 = j + j1;
	//  489  960:iload           7
	//  490  962:iload           9
	//  491  964:iadd            
	//  492  965:istore          10
				i1 = 0;
	//  493  967:iconst_0        
	//  494  968:istore          8
				j1 = 0;
	//  495  970:iconst_0        
	//  496  971:istore          9
			}
		} else
	//* 497  973:goto            802
		if(layoutstate.mLayoutDirection == -1)
	//* 498  976:aload_3         
	//* 499  977:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 500  980:iconst_m1       
	//* 501  981:icmpne          1007
		{
			j = layoutstate.mOffset;
	//  502  984:aload_3         
	//  503  985:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  504  988:istore          7
			i1 = j;
	//  505  990:iload           7
	//  506  992:istore          8
			j1 = j - j1;
	//  507  994:iload           7
	//  508  996:iload           9
	//  509  998:isub            
	//  510  999:istore          9
			j = 0;
	//  511 1001:iconst_0        
	//  512 1002:istore          7
		} else
	//* 513 1004:goto            802
		{
			l2 = layoutstate.mOffset;
	//  514 1007:aload_3         
	//  515 1008:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  516 1011:istore          12
			i1 = j1 + l2;
	//  517 1013:iload           9
	//  518 1015:iload           12
	//  519 1017:iadd            
	//  520 1018:istore          8
			j = 0;
	//  521 1020:iconst_0        
	//  522 1021:istore          7
			j1 = l2;
	//  523 1023:iload           12
	//  524 1025:istore          9
		}
		k3 = j1;
		l3 = 0;
		j1 = k1;
		l2 = j;
		j = k3;
		k1 = l3;
		while(k1 < l1) 
		{
			recycler = ((RecyclerView.Recycler) (mSet[k1]));
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
			if(mOrientation == 1)
			{
				if(isLayoutRTL())
				{
					i1 = getPaddingLeft() + mCachedBorders[mSpanCount - ((LayoutParams) (state)).mSpanIndex];
					j = i1 - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
				} else
	//* 525 1027:goto            802
				{
					j = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  526 1030:aload_0         
	//  527 1031:invokevirtual   #299 <Method int getPaddingLeft()>
	//  528 1034:aload_0         
	//  529 1035:getfield        #131 <Field int[] mCachedBorders>
	//  530 1038:aload_2         
	//  531 1039:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  532 1042:iaload          
	//  533 1043:iadd            
	//  534 1044:istore          7
					i1 = j + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  535 1046:iload           7
	//  536 1048:aload_0         
	//  537 1049:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  538 1052:aload_1         
	//  539 1053:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  540 1056:iadd            
	//  541 1057:istore          8
				}
			} else
	//* 542 1059:goto            897
			{
				l2 = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  543 1062:aload_0         
	//  544 1063:invokevirtual   #308 <Method int getPaddingTop()>
	//  545 1066:aload_0         
	//  546 1067:getfield        #131 <Field int[] mCachedBorders>
	//  547 1070:aload_2         
	//  548 1071:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  549 1074:iaload          
	//  550 1075:iadd            
	//  551 1076:istore          12
				j1 = l2 + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  552 1078:iload           12
	//  553 1080:aload_0         
	//  554 1081:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  555 1084:aload_1         
	//  556 1085:invokevirtual   #433 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  557 1088:iadd            
	//  558 1089:istore          9
			}
			layoutDecoratedWithMargins(((View) (recycler)), j, l2, i1, j1);
			if(((LayoutParams) (state)).isItemRemoved() || ((LayoutParams) (state)).isItemChanged())
				layoutchunkresult.mIgnoreConsumed = true;
			layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | ((View) (recycler)).hasFocusable();
			k1++;
		}
	//* 559 1091:goto            897
		Arrays.fill(((Object []) (mSet)), ((Object) (null)));
	//  560 1094:aload_0         
	//  561 1095:getfield        #87  <Field View[] mSet>
	//  562 1098:aconst_null     
	//  563 1099:invokestatic    #480 <Method void Arrays.fill(Object[], Object)>
		return;
	//  564 1102:return          
	//* 565 1103:goto            549
	//* 566 1106:goto            433
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
		View view3 = findContainingItemView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method View findContainingItemView(View)>
	//    3    5:astore          24
		if(view3 != null) goto _L2; else goto _L1
	//    4    7:aload           24
	//    5    9:ifnonnull       18
_L1:
		View view2 = null;
	//    6   12:aconst_null     
	//    7   13:astore          23
_L11:
		return view2;
	//    8   15:aload           23
	//    9   17:areturn         
_L2:
		int j;
		int k;
		int l;
		int i1;
		byte byte0;
		int k1;
		int l1;
		int j2;
		int k2;
		int l2;
		Object obj;
		View view1;
		obj = ((Object) ((LayoutParams)view3.getLayoutParams()));
	//   10   18:aload           24
	//   11   20:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   23:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   26:astore          21
		j2 = ((LayoutParams) (obj)).mSpanIndex;
	//   14   28:aload           21
	//   15   30:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   16   33:istore          15
		k2 = ((LayoutParams) (obj)).mSpanIndex + ((LayoutParams) (obj)).mSpanSize;
	//   17   35:aload           21
	//   18   37:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   19   40:aload           21
	//   20   42:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   21   45:iadd            
	//   22   46:istore          16
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
		int j1;
		boolean flag1;
		if(convertFocusDirectionToLayoutDirection(i) == 1)
	//*  32   62:aload_0         
	//*  33   63:iload_2         
	//*  34   64:invokevirtual   #498 <Method int convertFocusDirectionToLayoutDirection(int)>
	//*  35   67:iconst_1        
	//*  36   68:icmpne          188
			flag1 = true;
	//   37   71:iconst_1        
	//   38   72:istore          20
		else
	//*  39   74:iload           20
	//*  40   76:aload_0         
	//*  41   77:getfield        #501 <Field boolean mShouldReverseLayout>
	//*  42   80:icmpeq          194
	//*  43   83:iconst_1        
	//*  44   84:istore_2        
	//*  45   85:iload_2         
	//*  46   86:ifeq            199
	//*  47   89:aload_0         
	//*  48   90:invokevirtual   #112 <Method int getChildCount()>
	//*  49   93:iconst_1        
	//*  50   94:isub            
	//*  51   95:istore_2        
	//*  52   96:iconst_m1       
	//*  53   97:istore          10
	//*  54   99:iconst_m1       
	//*  55  100:istore          9
	//*  56  102:aload_0         
	//*  57  103:getfield        #245 <Field int mOrientation>
	//*  58  106:iconst_1        
	//*  59  107:icmpne          213
	//*  60  110:aload_0         
	//*  61  111:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//*  62  114:ifeq            213
	//*  63  117:iconst_1        
	//*  64  118:istore          11
	//*  65  120:aconst_null     
	//*  66  121:astore_1        
	//*  67  122:iconst_m1       
	//*  68  123:istore          8
	//*  69  125:iconst_0        
	//*  70  126:istore          7
	//*  71  128:aconst_null     
	//*  72  129:astore          21
	//*  73  131:iconst_m1       
	//*  74  132:istore          6
	//*  75  134:iconst_0        
	//*  76  135:istore          5
	//*  77  137:aload_0         
	//*  78  138:aload_3         
	//*  79  139:aload           4
	//*  80  141:iload_2         
	//*  81  142:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  82  145:istore          17
	//*  83  147:iload_2         
	//*  84  148:istore          12
	//*  85  150:iload           12
	//*  86  152:iload           9
	//*  87  154:icmpeq          182
	//*  88  157:aload_0         
	//*  89  158:aload_3         
	//*  90  159:aload           4
	//*  91  161:iload           12
	//*  92  163:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  93  166:istore_2        
	//*  94  167:aload_0         
	//*  95  168:iload           12
	//*  96  170:invokevirtual   #116 <Method View getChildAt(int)>
	//*  97  173:astore          22
	//*  98  175:aload           22
	//*  99  177:aload           24
	//* 100  179:if_acmpne       219
	//* 101  182:aload_1         
	//* 102  183:ifnull          652
	//* 103  186:aload_1         
	//* 104  187:areturn         
			flag1 = false;
	//  105  188:iconst_0        
	//  106  189:istore          20
		if(flag1 != mShouldReverseLayout)
			i = 1;
		else
	//* 107  191:goto            74
			i = 0;
	//  108  194:iconst_0        
	//  109  195:istore_2        
		if(i != 0)
		{
			i = getChildCount() - 1;
			byte0 = -1;
			j1 = -1;
		} else
	//* 110  196:goto            85
		{
			j1 = getChildCount();
	//  111  199:aload_0         
	//  112  200:invokevirtual   #112 <Method int getChildCount()>
	//  113  203:istore          9
			i = 0;
	//  114  205:iconst_0        
	//  115  206:istore_2        
			byte0 = 1;
	//  116  207:iconst_1        
	//  117  208:istore          10
		}
		if(mOrientation == 1 && isLayoutRTL())
			k1 = 1;
		else
	//* 118  210:goto            102
			k1 = 0;
	//  119  213:iconst_0        
	//  120  214:istore          11
		view = null;
		i1 = -1;
		l = 0;
		obj = null;
		k = -1;
		j = 0;
		l2 = getSpanGroupIndex(recycler, state, i);
		l1 = i;
_L9:
		if(l1 == j1) goto _L4; else goto _L3
_L3:
		i = getSpanGroupIndex(recycler, state, l1);
		view1 = getChildAt(l1);
		if(view1 != view3) goto _L5; else goto _L4
_L4:
		int i2;
		boolean flag;
		int i3;
		int j3;
		LayoutParams layoutparams;
		if(view == null)
	//* 121  216:goto            120
	//* 122  219:aload           22
	//* 123  221:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 124  224:ifeq            309
	//* 125  227:iload_2         
	//* 126  228:iload           17
	//* 127  230:icmpeq          309
	//* 128  233:aload_1         
	//* 129  234:ifnonnull       182
	//* 130  237:iload           5
	//* 131  239:istore_2        
	//* 132  240:iload           6
	//* 133  242:istore          5
	//* 134  244:aload           21
	//* 135  246:astore          22
	//* 136  248:iload           7
	//* 137  250:istore          6
	//* 138  252:aload_1         
	//* 139  253:astore          21
	//* 140  255:iload           8
	//* 141  257:istore          7
	//* 142  259:aload           22
	//* 143  261:astore_1        
	//* 144  262:iload           12
	//* 145  264:iload           10
	//* 146  266:iadd            
	//* 147  267:istore          13
	//* 148  269:aload           21
	//* 149  271:astore          22
	//* 150  273:iload           6
	//* 151  275:istore          8
	//* 152  277:iload           7
	//* 153  279:istore          12
	//* 154  281:iload           5
	//* 155  283:istore          6
	//* 156  285:iload_2         
	//* 157  286:istore          5
	//* 158  288:aload_1         
	//* 159  289:astore          21
	//* 160  291:iload           8
	//* 161  293:istore          7
	//* 162  295:iload           12
	//* 163  297:istore          8
	//* 164  299:aload           22
	//* 165  301:astore_1        
	//* 166  302:iload           13
	//* 167  304:istore          12
	//* 168  306:goto            150
	//* 169  309:aload           22
	//* 170  311:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 171  314:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//* 172  317:astore          25
	//* 173  319:aload           25
	//* 174  321:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 175  324:istore          18
	//* 176  326:aload           25
	//* 177  328:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 178  331:aload           25
	//* 179  333:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//* 180  336:iadd            
	//* 181  337:istore          19
	//* 182  339:aload           22
	//* 183  341:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 184  344:ifeq            365
	//* 185  347:iload           18
	//* 186  349:iload           15
	//* 187  351:icmpne          365
	//* 188  354:aload           22
	//* 189  356:astore          23
	//* 190  358:iload           19
	//* 191  360:iload           16
	//* 192  362:icmpeq          15
	//* 193  365:iconst_0        
	//* 194  366:istore          14
	//* 195  368:aload           22
	//* 196  370:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 197  373:ifeq            380
	//* 198  376:aload_1         
	//* 199  377:ifnull          393
	//* 200  380:aload           22
	//* 201  382:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 202  385:ifne            458
	//* 203  388:aload           21
	//* 204  390:ifnonnull       458
	//* 205  393:iconst_1        
	//* 206  394:istore_2        
	//* 207  395:iload_2         
	//* 208  396:ifeq            237
	//* 209  399:aload           22
	//* 210  401:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 211  404:ifeq            612
	//* 212  407:aload           25
	//* 213  409:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 214  412:istore          7
	//* 215  414:iload           19
	//* 216  416:iload           16
	//* 217  418:invokestatic    #504 <Method int Math.min(int, int)>
	//* 218  421:istore_2        
	//* 219  422:iload           18
	//* 220  424:iload           15
	//* 221  426:invokestatic    #210 <Method int Math.max(int, int)>
	//* 222  429:istore          8
	//* 223  431:aload           21
	//* 224  433:astore_1        
	//* 225  434:iload_2         
	//* 226  435:iload           8
	//* 227  437:isub            
	//* 228  438:istore          8
	//* 229  440:iload           5
	//* 230  442:istore_2        
	//* 231  443:aload           22
	//* 232  445:astore          21
	//* 233  447:iload           6
	//* 234  449:istore          5
	//* 235  451:iload           8
	//* 236  453:istore          6
	//* 237  455:goto            262
	//* 238  458:iload           18
	//* 239  460:iload           15
	//* 240  462:invokestatic    #210 <Method int Math.max(int, int)>
	//* 241  465:istore_2        
	//* 242  466:iload           19
	//* 243  468:iload           16
	//* 244  470:invokestatic    #504 <Method int Math.min(int, int)>
	//* 245  473:iload_2         
	//* 246  474:isub            
	//* 247  475:istore          13
	//* 248  477:aload           22
	//* 249  479:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 250  482:ifeq            538
	//* 251  485:iload           13
	//* 252  487:iload           7
	//* 253  489:icmple          497
	//* 254  492:iconst_1        
	//* 255  493:istore_2        
	//* 256  494:goto            395
	//* 257  497:iload           14
	//* 258  499:istore_2        
	//* 259  500:iload           13
	//* 260  502:iload           7
	//* 261  504:icmpne          395
	//* 262  507:iload           18
	//* 263  509:iload           8
	//* 264  511:icmple          532
	//* 265  514:iconst_1        
	//* 266  515:istore          13
	//* 267  517:iload           14
	//* 268  519:istore_2        
	//* 269  520:iload           11
	//* 270  522:iload           13
	//* 271  524:icmpne          395
	//* 272  527:iconst_1        
	//* 273  528:istore_2        
	//* 274  529:goto            395
	//* 275  532:iconst_0        
	//* 276  533:istore          13
	//* 277  535:goto            517
	//* 278  538:iload           14
	//* 279  540:istore_2        
	//* 280  541:aload_1         
	//* 281  542:ifnonnull       395
	//* 282  545:iload           14
	//* 283  547:istore_2        
	//* 284  548:aload_0         
	//* 285  549:aload           22
	//* 286  551:iconst_0        
	//* 287  552:iconst_1        
	//* 288  553:invokevirtual   #508 <Method boolean isViewPartiallyVisible(View, boolean, boolean)>
	//* 289  556:ifeq            395
	//* 290  559:iload           13
	//* 291  561:iload           5
	//* 292  563:icmple          571
	//* 293  566:iconst_1        
	//* 294  567:istore_2        
	//* 295  568:goto            395
	//* 296  571:iload           14
	//* 297  573:istore_2        
	//* 298  574:iload           13
	//* 299  576:iload           5
	//* 300  578:icmpne          395
	//* 301  581:iload           18
	//* 302  583:iload           6
	//* 303  585:icmple          606
	//* 304  588:iconst_1        
	//* 305  589:istore          13
	//* 306  591:iload           14
	//* 307  593:istore_2        
	//* 308  594:iload           11
	//* 309  596:iload           13
	//* 310  598:icmpne          395
	//* 311  601:iconst_1        
	//* 312  602:istore_2        
	//* 313  603:goto            395
	//* 314  606:iconst_0        
	//* 315  607:istore          13
	//* 316  609:goto            591
	//* 317  612:aload           25
	//* 318  614:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//* 319  617:istore          5
	//* 320  619:iload           19
	//* 321  621:iload           16
	//* 322  623:invokestatic    #504 <Method int Math.min(int, int)>
	//* 323  626:iload           18
	//* 324  628:iload           15
	//* 325  630:invokestatic    #210 <Method int Math.max(int, int)>
	//* 326  633:isub            
	//* 327  634:istore_2        
	//* 328  635:iload           7
	//* 329  637:istore          6
	//* 330  639:iload           8
	//* 331  641:istore          7
	//* 332  643:aload_1         
	//* 333  644:astore          21
	//* 334  646:aload           22
	//* 335  648:astore_1        
	//* 336  649:goto            262
			view = ((View) (obj));
	//  337  652:aload           21
	//  338  654:astore_1        
		return view;
_L5:
		if(!view1.hasFocusable() || i == l2) goto _L7; else goto _L6
_L6:
		if(view != null) goto _L4; else goto _L8
_L8:
		i = j;
		j = k;
		view1 = ((View) (obj));
		k = l;
		obj = ((Object) (view));
		l = i1;
		view = view1;
_L13:
		i2 = l1 + byte0;
		view1 = ((View) (obj));
		i1 = k;
		l1 = l;
		k = j;
		j = i;
		obj = ((Object) (view));
		l = i1;
		i1 = l1;
		view = view1;
		l1 = i2;
		  goto _L9
_L7:
		layoutparams = (LayoutParams)view1.getLayoutParams();
		i3 = layoutparams.mSpanIndex;
		j3 = layoutparams.mSpanIndex + layoutparams.mSpanSize;
		if(!view1.hasFocusable() || i3 != j2)
			break; /* Loop/switch isn't completed */
		view2 = view1;
		if(j3 == k2) goto _L11; else goto _L10
_L10:
		flag = false;
		if(view1.hasFocusable() && view == null || !view1.hasFocusable() && obj == null)
		{
			i = 1;
		} else
		{
			i = Math.max(i3, j2);
			i2 = Math.min(j3, k2) - i;
			if(view1.hasFocusable())
			{
				if(i2 > l)
				{
					i = 1;
				} else
				{
					i = ((int) (flag));
					if(i2 == l)
					{
						if(i3 > i1)
							i2 = 1;
						else
							i2 = 0;
						i = ((int) (flag));
						if(k1 == i2)
							i = 1;
					}
				}
			} else
			{
				i = ((int) (flag));
				if(view == null)
				{
					i = ((int) (flag));
					if(isViewPartiallyVisible(view1, false, true))
						if(i2 > j)
						{
							i = 1;
						} else
						{
							i = ((int) (flag));
							if(i2 == j)
							{
								if(i3 > k)
									i2 = 1;
								else
									i2 = 0;
								i = ((int) (flag));
								if(k1 == i2)
									i = 1;
							}
						}
				}
			}
		}
		if(i == 0) goto _L8; else goto _L12
_L12:
		if(view1.hasFocusable())
		{
			l = layoutparams.mSpanIndex;
			i = Math.min(j3, k2);
			i1 = Math.max(i3, j2);
			view = ((View) (obj));
			i1 = i - i1;
			i = j;
			obj = ((Object) (view1));
			j = k;
			k = i1;
		} else
		{
			j = layoutparams.mSpanIndex;
			i = Math.min(j3, k2) - Math.max(i3, j2);
			k = l;
			l = i1;
			obj = ((Object) (view));
			view = view1;
		}
		  goto _L13
	//* 339  655:goto            186
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
		int k = getPaddingLeft();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #299 <Method int getPaddingLeft()>
	//   10   18:istore          4
		int j1 = getPaddingRight() + k;
	//   11   20:aload_0         
	//   12   21:invokevirtual   #296 <Method int getPaddingRight()>
	//   13   24:iload           4
	//   14   26:iadd            
	//   15   27:istore          5
		int k1 = getPaddingTop() + getPaddingBottom();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #308 <Method int getPaddingTop()>
	//   18   33:aload_0         
	//   19   34:invokevirtual   #305 <Method int getPaddingBottom()>
	//   20   37:iadd            
	//   21   38:istore          6
		if(mOrientation == 1)
	//*  22   40:aload_0         
	//*  23   41:getfield        #245 <Field int mOrientation>
	//*  24   44:iconst_1        
	//*  25   45:icmpne          99
		{
			int l = chooseSize(j, k1 + rect.height(), getMinimumHeight());
	//   26   48:iload_3         
	//   27   49:iload           6
	//   28   51:aload_1         
	//   29   52:invokevirtual   #562 <Method int Rect.height()>
	//   30   55:iadd            
	//   31   56:aload_0         
	//   32   57:invokevirtual   #565 <Method int getMinimumHeight()>
	//   33   60:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   34   63:istore          4
			j = chooseSize(i, j1 + mCachedBorders[mCachedBorders.length - 1], getMinimumWidth());
	//   35   65:iload_2         
	//   36   66:iload           5
	//   37   68:aload_0         
	//   38   69:getfield        #131 <Field int[] mCachedBorders>
	//   39   72:aload_0         
	//   40   73:getfield        #131 <Field int[] mCachedBorders>
	//   41   76:arraylength     
	//   42   77:iconst_1        
	//   43   78:isub            
	//   44   79:iaload          
	//   45   80:iadd            
	//   46   81:aload_0         
	//   47   82:invokevirtual   #572 <Method int getMinimumWidth()>
	//   48   85:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   49   88:istore_3        
			i = l;
	//   50   89:iload           4
	//   51   91:istore_2        
		} else
	//*  52   92:aload_0         
	//*  53   93:iload_3         
	//*  54   94:iload_2         
	//*  55   95:invokevirtual   #574 <Method void setMeasuredDimension(int, int)>
	//*  56   98:return          
		{
			int i1 = chooseSize(i, j1 + rect.width(), getMinimumWidth());
	//   57   99:iload_2         
	//   58  100:iload           5
	//   59  102:aload_1         
	//   60  103:invokevirtual   #576 <Method int Rect.width()>
	//   61  106:iadd            
	//   62  107:aload_0         
	//   63  108:invokevirtual   #572 <Method int getMinimumWidth()>
	//   64  111:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   65  114:istore          4
			i = chooseSize(j, k1 + mCachedBorders[mCachedBorders.length - 1], getMinimumHeight());
	//   66  116:iload_3         
	//   67  117:iload           6
	//   68  119:aload_0         
	//   69  120:getfield        #131 <Field int[] mCachedBorders>
	//   70  123:aload_0         
	//   71  124:getfield        #131 <Field int[] mCachedBorders>
	//   72  127:arraylength     
	//   73  128:iconst_1        
	//   74  129:isub            
	//   75  130:iaload          
	//   76  131:iadd            
	//   77  132:aload_0         
	//   78  133:invokevirtual   #565 <Method int getMinimumHeight()>
	//   79  136:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   80  139:istore_2        
			j = i1;
	//   81  140:iload           4
	//   82  142:istore_3        
		}
		setMeasuredDimension(j, i);
	//*  83  143:goto            92
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
