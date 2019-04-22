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
		//    1    1:getfield        #16  <Field int mSpanIndex>
		//    2    4:ireturn         
		}

		public int getSpanSize()
		{
			return mSpanSize;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int mSpanSize>
		//    2    4:ireturn         
		}

		int mSpanIndex;
		int mSpanSize;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #14  <Method void RecyclerView$LayoutParams(int, int)>
			mSpanIndex = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #16  <Field int mSpanIndex>
			mSpanSize = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #18  <Field int mSpanSize>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #22  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
			mSpanIndex = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #16  <Field int mSpanIndex>
			mSpanSize = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #18  <Field int mSpanSize>
		//   10   16:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mSpanIndex = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #16  <Field int mSpanIndex>
			mSpanSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #18  <Field int mSpanSize>
		//    9   15:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mSpanIndex = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #16  <Field int mSpanIndex>
			mSpanSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #18  <Field int mSpanSize>
		//    9   15:return          
		}
	}

	public static abstract class SpanSizeLookup
	{

		int findReferenceIndexFromCache(int i)
		{
			int k = mSpanIndexCache.size() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SparseIntArray mSpanIndexCache>
		//    2    4:invokevirtual   #29  <Method int SparseIntArray.size()>
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
			int i2 = getSpanSize(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
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
		//   15   24:invokevirtual   #48  <Method int getSpanSize(int)>
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
		//    2    2:invokevirtual   #48  <Method int getSpanSize(int)>
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
		//   10   16:getfield        #22  <Field boolean mCacheSpanIndices>
		//   11   19:ifeq            70
		//   12   22:aload_0         
		//   13   23:getfield        #20  <Field SparseIntArray mSpanIndexCache>
		//   14   26:invokevirtual   #29  <Method int SparseIntArray.size()>
		//   15   29:ifle            70
				l = findReferenceIndexFromCache(i);
		//   16   32:aload_0         
		//   17   33:iload_1         
		//   18   34:invokevirtual   #50  <Method int findReferenceIndexFromCache(int)>
		//   19   37:istore          4
				if(l < 0)
					break label0;
		//   20   39:iload           4
		//   21   41:iflt            70
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
		//   45   84:invokevirtual   #48  <Method int getSpanSize(int)>
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
	//    2    2:invokespecial   #33  <Method void LinearLayoutManager(Context)>
		mPendingSpanCountChange = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #35  <Field boolean mPendingSpanCountChange>
		mSpanCount = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #37  <Field int mSpanCount>
		mPreLayoutSpanSizeCache = new SparseIntArray();
	//    9   15:aload_0         
	//   10   16:new             #39  <Class SparseIntArray>
	//   11   19:dup             
	//   12   20:invokespecial   #42  <Method void SparseIntArray()>
	//   13   23:putfield        #44  <Field SparseIntArray mPreLayoutSpanSizeCache>
		mPreLayoutSpanIndexCache = new SparseIntArray();
	//   14   26:aload_0         
	//   15   27:new             #39  <Class SparseIntArray>
	//   16   30:dup             
	//   17   31:invokespecial   #42  <Method void SparseIntArray()>
	//   18   34:putfield        #46  <Field SparseIntArray mPreLayoutSpanIndexCache>
		mSpanSizeLookup = ((SpanSizeLookup) (new DefaultSpanSizeLookup()));
	//   19   37:aload_0         
	//   20   38:new             #6   <Class GridLayoutManager$DefaultSpanSizeLookup>
	//   21   41:dup             
	//   22   42:invokespecial   #47  <Method void GridLayoutManager$DefaultSpanSizeLookup()>
	//   23   45:putfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
		mDecorInsets = new Rect();
	//   24   48:aload_0         
	//   25   49:new             #51  <Class Rect>
	//   26   52:dup             
	//   27   53:invokespecial   #52  <Method void Rect()>
	//   28   56:putfield        #54  <Field Rect mDecorInsets>
		setSpanCount(i);
	//   29   59:aload_0         
	//   30   60:iload_2         
	//   31   61:invokevirtual   #58  <Method void setSpanCount(int)>
	//   32   64:return          
	}

	public GridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #62  <Method void LinearLayoutManager(Context, AttributeSet, int, int)>
		mPendingSpanCountChange = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #35  <Field boolean mPendingSpanCountChange>
		mSpanCount = -1;
	//    9   14:aload_0         
	//   10   15:iconst_m1       
	//   11   16:putfield        #37  <Field int mSpanCount>
		mPreLayoutSpanSizeCache = new SparseIntArray();
	//   12   19:aload_0         
	//   13   20:new             #39  <Class SparseIntArray>
	//   14   23:dup             
	//   15   24:invokespecial   #42  <Method void SparseIntArray()>
	//   16   27:putfield        #44  <Field SparseIntArray mPreLayoutSpanSizeCache>
		mPreLayoutSpanIndexCache = new SparseIntArray();
	//   17   30:aload_0         
	//   18   31:new             #39  <Class SparseIntArray>
	//   19   34:dup             
	//   20   35:invokespecial   #42  <Method void SparseIntArray()>
	//   21   38:putfield        #46  <Field SparseIntArray mPreLayoutSpanIndexCache>
		mSpanSizeLookup = ((SpanSizeLookup) (new DefaultSpanSizeLookup()));
	//   22   41:aload_0         
	//   23   42:new             #6   <Class GridLayoutManager$DefaultSpanSizeLookup>
	//   24   45:dup             
	//   25   46:invokespecial   #47  <Method void GridLayoutManager$DefaultSpanSizeLookup()>
	//   26   49:putfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
		mDecorInsets = new Rect();
	//   27   52:aload_0         
	//   28   53:new             #51  <Class Rect>
	//   29   56:dup             
	//   30   57:invokespecial   #52  <Method void Rect()>
	//   31   60:putfield        #54  <Field Rect mDecorInsets>
		setSpanCount(getProperties(context, attributeset, i, j).spanCount);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:iload_3         
	//   36   67:iload           4
	//   37   69:invokestatic    #66  <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   38   72:getfield        #71  <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   39   75:invokevirtual   #58  <Method void setSpanCount(int)>
	//   40   78:return          
	}

	private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, boolean flag)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		j = -1;
	//    2    3:iconst_m1       
	//    3    4:istore          4
		byte byte0;
		if(flag)
	//*   4    6:iload           5
	//*   5    8:ifeq            26
		{
			boolean flag1 = false;
	//    6   11:iconst_0        
	//    7   12:istore          8
			byte0 = 1;
	//    8   14:iconst_1        
	//    9   15:istore          6
			j = i;
	//   10   17:iload_3         
	//   11   18:istore          4
			i = ((int) (flag1));
	//   12   20:iload           8
	//   13   22:istore_3        
		} else
	//*  14   23:goto            33
		{
			i--;
	//   15   26:iload_3         
	//   16   27:iconst_1        
	//   17   28:isub            
	//   18   29:istore_3        
			byte0 = -1;
	//   19   30:iconst_m1       
	//   20   31:istore          6
		}
		for(; i != j; i += ((int) (byte0)))
	//*  21   33:iload_3         
	//*  22   34:iload           4
	//*  23   36:icmpeq          99
		{
			View view = mSet[i];
	//   24   39:aload_0         
	//   25   40:getfield        #75  <Field View[] mSet>
	//   26   43:iload_3         
	//   27   44:aaload          
	//   28   45:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   29   47:aload           9
	//   30   49:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   31   52:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   32   55:astore          10
			layoutparams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
	//   33   57:aload           10
	//   34   59:aload_0         
	//   35   60:aload_1         
	//   36   61:aload_2         
	//   37   62:aload_0         
	//   38   63:aload           9
	//   39   65:invokevirtual   #85  <Method int getPosition(View)>
	//   40   68:invokespecial   #89  <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   41   71:putfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
			layoutparams.mSpanIndex = k;
	//   42   74:aload           10
	//   43   76:iload           7
	//   44   78:putfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
			k += layoutparams.mSpanSize;
	//   45   81:iload           7
	//   46   83:aload           10
	//   47   85:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
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
	//    1    1:invokevirtual   #100 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #104 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   23:astore          4
			int k = layoutparams.getViewLayoutPosition();
	//   14   25:aload           4
	//   15   27:invokevirtual   #107 <Method int GridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   16   30:istore_3        
			mPreLayoutSpanSizeCache.put(k, layoutparams.getSpanSize());
	//   17   31:aload_0         
	//   18   32:getfield        #44  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//   19   35:iload_3         
	//   20   36:aload           4
	//   21   38:invokevirtual   #109 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   22   41:invokevirtual   #113 <Method void SparseIntArray.put(int, int)>
			mPreLayoutSpanIndexCache.put(k, layoutparams.getSpanIndex());
	//   23   44:aload_0         
	//   24   45:getfield        #46  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//   25   48:iload_3         
	//   26   49:aload           4
	//   27   51:invokevirtual   #116 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   28   54:invokevirtual   #113 <Method void SparseIntArray.put(int, int)>
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
	//    2    2:getfield        #119 <Field int[] mCachedBorders>
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field int mSpanCount>
	//    5    9:iload_1         
	//    6   10:invokestatic    #122 <Method int[] calculateItemBorders(int[], int, int)>
	//    7   13:putfield        #119 <Field int[] mCachedBorders>
	//    8   16:return          
	}

	static int[] calculateItemBorders(int ai[], int i, int j)
	{
		int l;
		int ai1[];
label0:
		{
			l = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
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
		boolean flag = false;
	//   25   35:iconst_0        
	//   26   36:istore          5
		ai1[0] = 0;
	//   27   38:aload           8
	//   28   40:iconst_0        
	//   29   41:iconst_0        
	//   30   42:iastore         
		int j1 = j / i;
	//   31   43:iload_2         
	//   32   44:iload_1         
	//   33   45:idiv            
	//   34   46:istore          6
		int k1 = j % i;
	//   35   48:iload_2         
	//   36   49:iload_1         
	//   37   50:irem            
	//   38   51:istore          7
		int k = 0;
	//   39   53:iconst_0        
	//   40   54:istore_3        
		j = ((int) (flag));
	//   41   55:iload           5
	//   42   57:istore_2        
		for(; l <= i; l++)
	//*  43   58:iload           4
	//*  44   60:iload_1         
	//*  45   61:icmpgt          118
		{
			j += k1;
	//   46   64:iload_2         
	//   47   65:iload           7
	//   48   67:iadd            
	//   49   68:istore_2        
			int i1;
			if(j > 0 && i - j < k1)
	//*  50   69:iload_2         
	//*  51   70:ifle            94
	//*  52   73:iload_1         
	//*  53   74:iload_2         
	//*  54   75:isub            
	//*  55   76:iload           7
	//*  56   78:icmpge          94
			{
				i1 = j1 + 1;
	//   57   81:iload           6
	//   58   83:iconst_1        
	//   59   84:iadd            
	//   60   85:istore          5
				j -= i;
	//   61   87:iload_2         
	//   62   88:iload_1         
	//   63   89:isub            
	//   64   90:istore_2        
			} else
	//*  65   91:goto            98
			{
				i1 = j1;
	//   66   94:iload           6
	//   67   96:istore          5
			}
			k += i1;
	//   68   98:iload_3         
	//   69   99:iload           5
	//   70  101:iadd            
	//   71  102:istore_3        
			ai1[l] = k;
	//   72  103:aload           8
	//   73  105:iload           4
	//   74  107:iload_3         
	//   75  108:iastore         
		}

	//   76  109:iload           4
	//   77  111:iconst_1        
	//   78  112:iadd            
	//   79  113:istore          4
	//*  80  115:goto            58
		return ai1;
	//   81  118:aload           8
	//   82  120:areturn         
	}

	private void clearPreLayoutSpanMappingCache()
	{
		mPreLayoutSpanSizeCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//    2    4:invokevirtual   #126 <Method void SparseIntArray.clear()>
		mPreLayoutSpanIndexCache.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//    5   11:invokevirtual   #126 <Method void SparseIntArray.clear()>
	//    6   14:return          
	}

	private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo, int i)
	{
		if(i == 1)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:icmpne          12
			i = 1;
	//    3    6:iconst_1        
	//    4    7:istore          4
		else
	//*   5    9:goto            15
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore          4
		int j = getSpanIndex(recycler, state, anchorinfo.mPosition);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:getfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   13   22:invokespecial   #135 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   14   25:istore          5
		if(i != 0)
	//*  15   27:iload           4
	//*  16   29:ifeq            69
		{
			for(; j > 0 && anchorinfo.mPosition > 0; j = getSpanIndex(recycler, state, anchorinfo.mPosition))
	//*  17   32:iload           5
	//*  18   34:ifle            130
	//*  19   37:aload_3         
	//*  20   38:getfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  21   41:ifle            130
				anchorinfo.mPosition = anchorinfo.mPosition - 1;
	//   22   44:aload_3         
	//   23   45:aload_3         
	//   24   46:getfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   25   49:iconst_1        
	//   26   50:isub            
	//   27   51:putfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>

	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:getfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   33   61:invokespecial   #135 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   34   64:istore          5
		} else
	//*  35   66:goto            32
		{
			int i1 = state.getItemCount();
	//   36   69:aload_2         
	//   37   70:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
	//   38   73:istore          8
			i = anchorinfo.mPosition;
	//   39   75:aload_3         
	//   40   76:getfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   41   79:istore          4
			do
			{
				if(i >= i1 - 1)
					break;
	//   42   81:iload           4
	//   43   83:iload           8
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:icmpge          124
				int l = i + 1;
	//   47   90:iload           4
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore          7
				int k = getSpanIndex(recycler, state, l);
	//   51   96:aload_0         
	//   52   97:aload_1         
	//   53   98:aload_2         
	//   54   99:iload           7
	//   55  101:invokespecial   #135 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   56  104:istore          6
				if(k <= j)
					break;
	//   57  106:iload           6
	//   58  108:iload           5
	//   59  110:icmple          124
				i = l;
	//   60  113:iload           7
	//   61  115:istore          4
				j = k;
	//   62  117:iload           6
	//   63  119:istore          5
			} while(true);
	//   64  121:goto            81
			anchorinfo.mPosition = i;
	//   65  124:aload_3         
	//   66  125:iload           4
	//   67  127:putfield        #133 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		}
	//   68  130:return          
	}

	private void ensureViewSet()
	{
		View aview[] = mSet;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field View[] mSet>
	//    2    4:astore_1        
		if(aview == null || aview.length != mSpanCount)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:aload_0         
	//*   8   12:getfield        #37  <Field int mSpanCount>
	//*   9   15:icmpeq          29
			mSet = new View[mSpanCount];
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field int mSpanCount>
	//   13   23:anewarray       View[]
	//   14   26:putfield        #75  <Field View[] mSet>
	//   15   29:return          
	}

	private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #146 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            20
			return mSpanSizeLookup.getSpanGroupIndex(i, mSpanCount);
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field int mSpanCount>
	//    8   16:invokevirtual   #149 <Method int GridLayoutManager$SpanSizeLookup.getSpanGroupIndex(int, int)>
	//    9   19:ireturn         
		int j = recycler.convertPreLayoutPositionToPostLayout(i);
	//   10   20:aload_1         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #155 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   13   25:istore          4
		if(j == -1)
	//*  14   27:iload           4
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          66
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   17   33:new             #157 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #158 <Method void StringBuilder()>
	//   20   40:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. ");
	//   21   41:aload_1         
	//   22   42:ldc1            #160 <String "Cannot find span size for pre layout position. ">
	//   23   44:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (recycler)).append(i);
	//   25   48:aload_1         
	//   26   49:iload_3         
	//   27   50:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   29   54:ldc1            #169 <String "GridLayoutManager">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   32   60:invokestatic    #179 <Method int Log.w(String, String)>
	//   33   63:pop             
			return 0;
	//   34   64:iconst_0        
	//   35   65:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanGroupIndex(j, mSpanCount);
	//   36   66:aload_0         
	//   37   67:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   38   70:iload           4
	//   39   72:aload_0         
	//   40   73:getfield        #37  <Field int mSpanCount>
	//   41   76:invokevirtual   #149 <Method int GridLayoutManager$SpanSizeLookup.getSpanGroupIndex(int, int)>
	//   42   79:ireturn         
		}
	}

	private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #146 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            20
			return mSpanSizeLookup.getCachedSpanIndex(i, mSpanCount);
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field int mSpanCount>
	//    8   16:invokevirtual   #182 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//    9   19:ireturn         
		int j = mPreLayoutSpanIndexCache.get(i, -1);
	//   10   20:aload_0         
	//   11   21:getfield        #46  <Field SparseIntArray mPreLayoutSpanIndexCache>
	//   12   24:iload_3         
	//   13   25:iconst_m1       
	//   14   26:invokevirtual   #185 <Method int SparseIntArray.get(int, int)>
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
	//   23   42:invokevirtual   #155 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   24   45:istore          4
		if(j == -1)
	//*  25   47:iload           4
	//*  26   49:iconst_m1       
	//*  27   50:icmpne          86
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   28   53:new             #157 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:invokespecial   #158 <Method void StringBuilder()>
	//   31   60:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   32   61:aload_1         
	//   33   62:ldc1            #187 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   34   64:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (recycler)).append(i);
	//   36   68:aload_1         
	//   37   69:iload_3         
	//   38   70:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//   39   73:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   40   74:ldc1            #169 <String "GridLayoutManager">
	//   41   76:aload_1         
	//   42   77:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   43   80:invokestatic    #179 <Method int Log.w(String, String)>
	//   44   83:pop             
			return 0;
	//   45   84:iconst_0        
	//   46   85:ireturn         
		} else
		{
			return mSpanSizeLookup.getCachedSpanIndex(j, mSpanCount);
	//   47   86:aload_0         
	//   48   87:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   49   90:iload           4
	//   50   92:aload_0         
	//   51   93:getfield        #37  <Field int mSpanCount>
	//   52   96:invokevirtual   #182 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//   53   99:ireturn         
		}
	}

	private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
	{
		if(!state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #146 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            16
			return mSpanSizeLookup.getSpanSize(i);
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    5   11:iload_3         
	//    6   12:invokevirtual   #189 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//    7   15:ireturn         
		int j = mPreLayoutSpanSizeCache.get(i, -1);
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field SparseIntArray mPreLayoutSpanSizeCache>
	//   10   20:iload_3         
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #185 <Method int SparseIntArray.get(int, int)>
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
	//   21   38:invokevirtual   #155 <Method int RecyclerView$Recycler.convertPreLayoutPositionToPostLayout(int)>
	//   22   41:istore          4
		if(j == -1)
	//*  23   43:iload           4
	//*  24   45:iconst_m1       
	//*  25   46:icmpne          82
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   26   49:new             #157 <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #158 <Method void StringBuilder()>
	//   29   56:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   30   57:aload_1         
	//   31   58:ldc1            #187 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   32   60:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			((StringBuilder) (recycler)).append(i);
	//   34   64:aload_1         
	//   35   65:iload_3         
	//   36   66:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//   37   69:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   38   70:ldc1            #169 <String "GridLayoutManager">
	//   39   72:aload_1         
	//   40   73:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   41   76:invokestatic    #179 <Method int Log.w(String, String)>
	//   42   79:pop             
			return 1;
	//   43   80:iconst_1        
	//   44   81:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanSize(j);
	//   45   82:aload_0         
	//   46   83:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   47   86:iload           4
	//   48   88:invokevirtual   #189 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   49   91:ireturn         
		}
	}

	private void guessMeasurement(float f, int i)
	{
		calculateItemBorders(Math.max(Math.round(f * (float)mSpanCount), i));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field int mSpanCount>
	//    4    6:i2f             
	//    5    7:fmul            
	//    6    8:invokestatic    #197 <Method int Math.round(float)>
	//    7   11:iload_2         
	//    8   12:invokestatic    #200 <Method int Math.max(int, int)>
	//    9   15:invokespecial   #202 <Method void calculateItemBorders(int)>
	//   10   18:return          
	}

	private void measureChild(View view, int i, boolean flag)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//    3    7:astore          7
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           7
	//    5   11:getfield        #205 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//    6   14:astore          8
		int k = rect.top + rect.bottom + layoutparams.topMargin + layoutparams.bottomMargin;
	//    7   16:aload           8
	//    8   18:getfield        #208 <Field int Rect.top>
	//    9   21:aload           8
	//   10   23:getfield        #211 <Field int Rect.bottom>
	//   11   26:iadd            
	//   12   27:aload           7
	//   13   29:getfield        #214 <Field int GridLayoutManager$LayoutParams.topMargin>
	//   14   32:iadd            
	//   15   33:aload           7
	//   16   35:getfield        #217 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//   17   38:iadd            
	//   18   39:istore          5
		int j = rect.left + rect.right + layoutparams.leftMargin + layoutparams.rightMargin;
	//   19   41:aload           8
	//   20   43:getfield        #220 <Field int Rect.left>
	//   21   46:aload           8
	//   22   48:getfield        #223 <Field int Rect.right>
	//   23   51:iadd            
	//   24   52:aload           7
	//   25   54:getfield        #226 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//   26   57:iadd            
	//   27   58:aload           7
	//   28   60:getfield        #229 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//   29   63:iadd            
	//   30   64:istore          4
		int l = getSpaceForSpanRange(layoutparams.mSpanIndex, layoutparams.mSpanSize);
	//   31   66:aload_0         
	//   32   67:aload           7
	//   33   69:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   34   72:aload           7
	//   35   74:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   36   77:invokevirtual   #232 <Method int getSpaceForSpanRange(int, int)>
	//   37   80:istore          6
		if(mOrientation == 1)
	//*  38   82:aload_0         
	//*  39   83:getfield        #235 <Field int mOrientation>
	//*  40   86:iconst_1        
	//*  41   87:icmpne          132
		{
			j = getChildMeasureSpec(l, i, j, layoutparams.width, false);
	//   42   90:iload           6
	//   43   92:iload_2         
	//   44   93:iload           4
	//   45   95:aload           7
	//   46   97:getfield        #238 <Field int GridLayoutManager$LayoutParams.width>
	//   47  100:iconst_0        
	//   48  101:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   49  104:istore          4
			i = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getHeightMode(), k, layoutparams.height, true);
	//   50  106:aload_0         
	//   51  107:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//   52  110:invokevirtual   #251 <Method int OrientationHelper.getTotalSpace()>
	//   53  113:aload_0         
	//   54  114:invokevirtual   #254 <Method int getHeightMode()>
	//   55  117:iload           5
	//   56  119:aload           7
	//   57  121:getfield        #257 <Field int GridLayoutManager$LayoutParams.height>
	//   58  124:iconst_1        
	//   59  125:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   60  128:istore_2        
		} else
	//*  61  129:goto            171
		{
			i = getChildMeasureSpec(l, i, k, layoutparams.height, false);
	//   62  132:iload           6
	//   63  134:iload_2         
	//   64  135:iload           5
	//   65  137:aload           7
	//   66  139:getfield        #257 <Field int GridLayoutManager$LayoutParams.height>
	//   67  142:iconst_0        
	//   68  143:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   69  146:istore_2        
			j = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), j, layoutparams.width, true);
	//   70  147:aload_0         
	//   71  148:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//   72  151:invokevirtual   #251 <Method int OrientationHelper.getTotalSpace()>
	//   73  154:aload_0         
	//   74  155:invokevirtual   #260 <Method int getWidthMode()>
	//   75  158:iload           4
	//   76  160:aload           7
	//   77  162:getfield        #238 <Field int GridLayoutManager$LayoutParams.width>
	//   78  165:iconst_1        
	//   79  166:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   80  169:istore          4
		}
		measureChildWithDecorationsAndMargin(view, j, i, flag);
	//   81  171:aload_0         
	//   82  172:aload_1         
	//   83  173:iload           4
	//   84  175:iload_2         
	//   85  176:iload_3         
	//   86  177:invokespecial   #264 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
	//   87  180:return          
	}

	private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #266 <Class RecyclerView$LayoutParams>
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
	//   11   20:invokevirtual   #270 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   12   23:istore          4
		else
	//*  13   25:goto            39
			flag = shouldMeasureChild(view, i, j, layoutparams);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:aload           5
	//   19   34:invokevirtual   #273 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   20   37:istore          4
		if(flag)
	//*  21   39:iload           4
	//*  22   41:ifeq            50
			view.measure(i, j);
	//   23   44:aload_1         
	//   24   45:iload_2         
	//   25   46:iload_3         
	//   26   47:invokevirtual   #276 <Method void View.measure(int, int)>
	//   27   50:return          
	}

	private void updateMeasurements()
	{
		int i;
		if(getOrientation() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #280 <Method int getOrientation()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
			i = getWidth() - getPaddingRight() - getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #283 <Method int getWidth()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #286 <Method int getPaddingRight()>
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:invokevirtual   #289 <Method int getPaddingLeft()>
	//   11   21:isub            
	//   12   22:istore_1        
		else
	//*  13   23:goto            41
			i = getHeight() - getPaddingBottom() - getPaddingTop();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #292 <Method int getHeight()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #295 <Method int getPaddingBottom()>
	//   18   34:isub            
	//   19   35:aload_0         
	//   20   36:invokevirtual   #298 <Method int getPaddingTop()>
	//   21   39:isub            
	//   22   40:istore_1        
		calculateItemBorders(i);
	//   23   41:aload_0         
	//   24   42:iload_1         
	//   25   43:invokespecial   #202 <Method void calculateItemBorders(int)>
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
	//    1    1:getfield        #37  <Field int mSpanCount>
	//    2    4:istore          5
		for(int i = 0; i < mSpanCount && layoutstate.hasMore(state) && j > 0; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:aload_0         
	//*   7   12:getfield        #37  <Field int mSpanCount>
	//*   8   15:icmpge          89
	//*   9   18:aload_2         
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #308 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//*  12   23:ifeq            89
	//*  13   26:iload           5
	//*  14   28:ifle            89
		{
			int k = layoutstate.mCurrentPosition;
	//   15   31:aload_2         
	//   16   32:getfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   17   35:istore          6
			layoutprefetchregistry.addPosition(k, Math.max(0, layoutstate.mScrollingOffset));
	//   18   37:aload_3         
	//   19   38:iload           6
	//   20   40:iconst_0        
	//   21   41:aload_2         
	//   22   42:getfield        #314 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   23   45:invokestatic    #200 <Method int Math.max(int, int)>
	//   24   48:invokeinterface #319 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
			j -= mSpanSizeLookup.getSpanSize(k);
	//   25   53:iload           5
	//   26   55:aload_0         
	//   27   56:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   28   59:iload           6
	//   29   61:invokevirtual   #189 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   30   64:isub            
	//   31   65:istore          5
			layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + layoutstate.mItemDirection;
	//   32   67:aload_2         
	//   33   68:aload_2         
	//   34   69:getfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   35   72:aload_2         
	//   36   73:getfield        #322 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//   37   76:iadd            
	//   38   77:putfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
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
	//    1    1:invokevirtual   #327 <Method void ensureLayoutState()>
		int l = mOrientationHelper.getStartAfterPadding();
	//    2    4:aload_0         
	//    3    5:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #330 <Method int OrientationHelper.getStartAfterPadding()>
	//    5   11:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//    6   13:aload_0         
	//    7   14:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//    8   17:invokevirtual   #333 <Method int OrientationHelper.getEndAfterPadding()>
	//    9   20:istore          8
		byte byte0;
		if(j > i)
	//*  10   22:iload           4
	//*  11   24:iload_3         
	//*  12   25:icmple          34
			byte0 = 1;
	//   13   28:iconst_1        
	//   14   29:istore          6
		else
	//*  15   31:goto            37
			byte0 = -1;
	//   16   34:iconst_m1       
	//   17   35:istore          6
		View view1 = null;
	//   18   37:aconst_null     
	//   19   38:astore          11
		View view;
		View view3;
		for(view = null; i != j; view = view3)
	//*  20   40:aconst_null     
	//*  21   41:astore          10
	//*  22   43:iload_3         
	//*  23   44:iload           4
	//*  24   46:icmpeq          223
		{
			View view4 = getChildAt(i);
	//   25   49:aload_0         
	//   26   50:iload_3         
	//   27   51:invokevirtual   #104 <Method View getChildAt(int)>
	//   28   54:astore          14
			int j1 = getPosition(view4);
	//   29   56:aload_0         
	//   30   57:aload           14
	//   31   59:invokevirtual   #85  <Method int getPosition(View)>
	//   32   62:istore          9
			View view2 = view1;
	//   33   64:aload           11
	//   34   66:astore          12
			view3 = view;
	//   35   68:aload           10
	//   36   70:astore          13
			if(j1 >= 0)
	//*  37   72:iload           9
	//*  38   74:iflt            207
			{
				view2 = view1;
	//   39   77:aload           11
	//   40   79:astore          12
				view3 = view;
	//   41   81:aload           10
	//   42   83:astore          13
				if(j1 < k)
	//*  43   85:iload           9
	//*  44   87:iload           5
	//*  45   89:icmpge          207
					if(getSpanIndex(recycler, state, j1) != 0)
	//*  46   92:aload_0         
	//*  47   93:aload_1         
	//*  48   94:aload_2         
	//*  49   95:iload           9
	//*  50   97:invokespecial   #135 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//*  51  100:ifeq            114
					{
						view2 = view1;
	//   52  103:aload           11
	//   53  105:astore          12
						view3 = view;
	//   54  107:aload           10
	//   55  109:astore          13
					} else
	//*  56  111:goto            207
					if(((RecyclerView.LayoutParams)view4.getLayoutParams()).isItemRemoved())
	//*  57  114:aload           14
	//*  58  116:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  59  119:checkcast       #266 <Class RecyclerView$LayoutParams>
	//*  60  122:invokevirtual   #336 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  61  125:ifeq            152
					{
						view2 = view1;
	//   62  128:aload           11
	//   63  130:astore          12
						view3 = view;
	//   64  132:aload           10
	//   65  134:astore          13
						if(view == null)
	//*  66  136:aload           10
	//*  67  138:ifnonnull       207
						{
							view3 = view4;
	//   68  141:aload           14
	//   69  143:astore          13
							view2 = view1;
	//   70  145:aload           11
	//   71  147:astore          12
						}
					} else
	//*  72  149:goto            207
					{
						if(mOrientationHelper.getDecoratedStart(view4) < i1 && mOrientationHelper.getDecoratedEnd(view4) >= l)
	//*  73  152:aload_0         
	//*  74  153:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//*  75  156:aload           14
	//*  76  158:invokevirtual   #339 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  77  161:iload           8
	//*  78  163:icmpge          186
	//*  79  166:aload_0         
	//*  80  167:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//*  81  170:aload           14
	//*  82  172:invokevirtual   #342 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  83  175:iload           7
	//*  84  177:icmpge          183
	//*  85  180:goto            186
							return view4;
	//   86  183:aload           14
	//   87  185:areturn         
						view2 = view1;
	//   88  186:aload           11
	//   89  188:astore          12
						view3 = view;
	//   90  190:aload           10
	//   91  192:astore          13
						if(view1 == null)
	//*  92  194:aload           11
	//*  93  196:ifnonnull       207
						{
							view2 = view4;
	//   94  199:aload           14
	//   95  201:astore          12
							view3 = view;
	//   96  203:aload           10
	//   97  205:astore          13
						}
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
		}

	//  104  216:aload           13
	//  105  218:astore          10
	//* 106  220:goto            43
		if(view1 != null)
	//* 107  223:aload           11
	//* 108  225:ifnull          231
			return view1;
	//  109  228:aload           11
	//  110  230:areturn         
		else
			return view;
	//  111  231:aload           10
	//  112  233:areturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field int mOrientation>
	//*   2    4:ifne            18
			return ((RecyclerView.LayoutParams) (new LayoutParams(-2, -1)));
	//    3    7:new             #9   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #346 <Method void GridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #9   <Class GridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #346 <Method void GridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #9   <Class GridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #351 <Method void GridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #9   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #357 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #9   <Class GridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #360 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return mSpanCount;
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field int mSpanCount>
	//    6   12:ireturn         
		if(state.getItemCount() < 1)
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
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
	//   17   27:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:invokespecial   #364 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field int mOrientation>
	//*   2    4:ifne            12
			return mSpanCount;
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field int mSpanCount>
	//    5   11:ireturn         
		if(state.getItemCount() < 1)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
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
	//   16   26:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:invokespecial   #364 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	int getSpaceForSpanRange(int i, int j)
	{
		if(mOrientation == 1 && isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          42
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #368 <Method boolean isLayoutRTL()>
	//*   6   12:ifeq            42
		{
			int ai[] = mCachedBorders;
	//    7   15:aload_0         
	//    8   16:getfield        #119 <Field int[] mCachedBorders>
	//    9   19:astore          4
			int k = mSpanCount;
	//   10   21:aload_0         
	//   11   22:getfield        #37  <Field int mSpanCount>
	//   12   25:istore_3        
			return ai[k - i] - ai[k - i - j];
	//   13   26:aload           4
	//   14   28:iload_3         
	//   15   29:iload_1         
	//   16   30:isub            
	//   17   31:iaload          
	//   18   32:aload           4
	//   19   34:iload_3         
	//   20   35:iload_1         
	//   21   36:isub            
	//   22   37:iload_2         
	//   23   38:isub            
	//   24   39:iaload          
	//   25   40:isub            
	//   26   41:ireturn         
		} else
		{
			int ai1[] = mCachedBorders;
	//   27   42:aload_0         
	//   28   43:getfield        #119 <Field int[] mCachedBorders>
	//   29   46:astore          4
			return ai1[j + i] - ai1[i];
	//   30   48:aload           4
	//   31   50:iload_2         
	//   32   51:iload_1         
	//   33   52:iadd            
	//   34   53:iaload          
	//   35   54:aload           4
	//   36   56:iload_1         
	//   37   57:iaload          
	//   38   58:isub            
	//   39   59:ireturn         
		}
	}

	public int getSpanCount()
	{
		return mSpanCount;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mSpanCount>
	//    2    4:ireturn         
	}

	public SpanSizeLookup getSpanSizeLookup()
	{
		return mSpanSizeLookup;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:areturn         
	}

	void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutstate, LinearLayoutManager.LayoutChunkResult layoutchunkresult)
	{
		int j4 = mOrientationHelper.getModeInOther();
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #376 <Method int OrientationHelper.getModeInOther()>
	//    3    7:istore          15
		boolean flag;
		if(j4 != 0x40000000)
	//*   4    9:iload           15
	//*   5   11:ldc2            #377 <Int 0x40000000>
	//*   6   14:icmpeq          23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          10
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          10
		int j1;
		if(getChildCount() > 0)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #100 <Method int getChildCount()>
	//*  14   30:ifle            47
			j1 = mCachedBorders[mSpanCount];
	//   15   33:aload_0         
	//   16   34:getfield        #119 <Field int[] mCachedBorders>
	//   17   37:aload_0         
	//   18   38:getfield        #37  <Field int mSpanCount>
	//   19   41:iaload          
	//   20   42:istore          11
		else
	//*  21   44:goto            50
			j1 = 0;
	//   22   47:iconst_0        
	//   23   48:istore          11
		if(flag)
	//*  24   50:iload           10
	//*  25   52:ifeq            59
			updateMeasurements();
	//   26   55:aload_0         
	//   27   56:invokespecial   #379 <Method void updateMeasurements()>
		boolean flag2;
		if(layoutstate.mItemDirection == 1)
	//*  28   59:aload_3         
	//*  29   60:getfield        #322 <Field int LinearLayoutManager$LayoutState.mItemDirection>
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
		int i = mSpanCount;
	//   37   76:aload_0         
	//   38   77:getfield        #37  <Field int mSpanCount>
	//   39   80:istore          8
		int j;
		int k1;
		if(!flag2)
	//*  40   82:iload           16
	//*  41   84:ifne            119
		{
			i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:aload_2         
	//   45   90:aload_3         
	//   46   91:getfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   47   94:invokespecial   #135 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:aload_2         
	//   51  100:aload_3         
	//   52  101:getfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   53  104:invokespecial   #89  <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   54  107:iadd            
	//   55  108:istore          8
			j = 0;
	//   56  110:iconst_0        
	//   57  111:istore          9
			k1 = 0;
	//   58  113:iconst_0        
	//   59  114:istore          12
		} else
	//*  60  116:goto            125
		{
			j = 0;
	//   61  119:iconst_0        
	//   62  120:istore          9
			k1 = 0;
	//   63  122:iconst_0        
	//   64  123:istore          12
		}
label0:
		do
		{
label1:
			{
				if(k1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0)
					break label1;
	//   65  125:iload           12
	//   66  127:aload_0         
	//   67  128:getfield        #37  <Field int mSpanCount>
	//   68  131:icmpge          302
	//   69  134:aload_3         
	//   70  135:aload_2         
	//   71  136:invokevirtual   #308 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   72  139:ifeq            302
	//   73  142:iload           8
	//   74  144:ifle            302
				int l2 = layoutstate.mCurrentPosition;
	//   75  147:aload_3         
	//   76  148:getfield        #311 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   77  151:istore          14
				int l1 = getSpanSize(recycler, state, l2);
	//   78  153:aload_0         
	//   79  154:aload_1         
	//   80  155:aload_2         
	//   81  156:iload           14
	//   82  158:invokespecial   #89  <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   83  161:istore          13
				if(l1 <= mSpanCount)
	//*  84  163:iload           13
	//*  85  165:aload_0         
	//*  86  166:getfield        #37  <Field int mSpanCount>
	//*  87  169:icmpgt          227
				{
					i -= l1;
	//   88  172:iload           8
	//   89  174:iload           13
	//   90  176:isub            
	//   91  177:istore          8
					if(i < 0)
	//*  92  179:iload           8
	//*  93  181:ifge            187
						break label1;
	//   94  184:goto            302
					View view = layoutstate.next(recycler);
	//   95  187:aload_3         
	//   96  188:aload_1         
	//   97  189:invokevirtual   #383 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//   98  192:astore          17
					if(view == null)
	//*  99  194:aload           17
	//* 100  196:ifnonnull       202
						break label1;
	//  101  199:goto            302
					j += l1;
	//  102  202:iload           9
	//  103  204:iload           13
	//  104  206:iadd            
	//  105  207:istore          9
					mSet[k1] = view;
	//  106  209:aload_0         
	//  107  210:getfield        #75  <Field View[] mSet>
	//  108  213:iload           12
	//  109  215:aload           17
	//  110  217:aastore         
					k1++;
	//  111  218:iload           12
	//  112  220:iconst_1        
	//  113  221:iadd            
	//  114  222:istore          12
				} else
	//* 115  224:goto            125
				{
					recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//  116  227:new             #157 <Class StringBuilder>
	//  117  230:dup             
	//  118  231:invokespecial   #158 <Method void StringBuilder()>
	//  119  234:astore_1        
					((StringBuilder) (recycler)).append("Item at position ");
	//  120  235:aload_1         
	//  121  236:ldc2            #385 <String "Item at position ">
	//  122  239:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//  123  242:pop             
					((StringBuilder) (recycler)).append(l2);
	//  124  243:aload_1         
	//  125  244:iload           14
	//  126  246:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//  127  249:pop             
					((StringBuilder) (recycler)).append(" requires ");
	//  128  250:aload_1         
	//  129  251:ldc2            #387 <String " requires ">
	//  130  254:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//  131  257:pop             
					((StringBuilder) (recycler)).append(l1);
	//  132  258:aload_1         
	//  133  259:iload           13
	//  134  261:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//  135  264:pop             
					((StringBuilder) (recycler)).append(" spans but GridLayoutManager has only ");
	//  136  265:aload_1         
	//  137  266:ldc2            #389 <String " spans but GridLayoutManager has only ">
	//  138  269:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//  139  272:pop             
					((StringBuilder) (recycler)).append(mSpanCount);
	//  140  273:aload_1         
	//  141  274:aload_0         
	//  142  275:getfield        #37  <Field int mSpanCount>
	//  143  278:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//  144  281:pop             
					((StringBuilder) (recycler)).append(" spans.");
	//  145  282:aload_1         
	//  146  283:ldc2            #391 <String " spans.">
	//  147  286:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//  148  289:pop             
					throw new IllegalArgumentException(((StringBuilder) (recycler)).toString());
	//  149  290:new             #393 <Class IllegalArgumentException>
	//  150  293:dup             
	//  151  294:aload_1         
	//  152  295:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  153  298:invokespecial   #396 <Method void IllegalArgumentException(String)>
	//  154  301:athrow          
				}
			}
		} while(true);
		if(k1 == 0)
	//* 155  302:iload           12
	//* 156  304:ifne            314
		{
			layoutchunkresult.mFinished = true;
	//  157  307:aload           4
	//  158  309:iconst_1        
	//  159  310:putfield        #401 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//  160  313:return          
		}
		float f = 0.0F;
	//  161  314:fconst_0        
	//  162  315:fstore          5
		assignSpans(recycler, state, k1, j, flag2);
	//  163  317:aload_0         
	//  164  318:aload_1         
	//  165  319:aload_2         
	//  166  320:iload           12
	//  167  322:iload           9
	//  168  324:iload           16
	//  169  326:invokespecial   #403 <Method void assignSpans(RecyclerView$Recycler, RecyclerView$State, int, int, boolean)>
		j = 0;
	//  170  329:iconst_0        
	//  171  330:istore          9
		i = 0;
	//  172  332:iconst_0        
	//  173  333:istore          8
		while(j < k1) 
	//* 174  335:iload           9
	//* 175  337:iload           12
	//* 176  339:icmpge          500
		{
			recycler = ((RecyclerView.Recycler) (mSet[j]));
	//  177  342:aload_0         
	//  178  343:getfield        #75  <Field View[] mSet>
	//  179  346:iload           9
	//  180  348:aaload          
	//  181  349:astore_1        
			if(layoutstate.mScrapList == null)
	//* 182  350:aload_3         
	//* 183  351:getfield        #407 <Field java.util.List LinearLayoutManager$LayoutState.mScrapList>
	//* 184  354:ifnonnull       379
			{
				if(flag2)
	//* 185  357:iload           16
	//* 186  359:ifeq            370
					addView(((View) (recycler)));
	//  187  362:aload_0         
	//  188  363:aload_1         
	//  189  364:invokevirtual   #411 <Method void addView(View)>
				else
	//* 190  367:goto            398
					addView(((View) (recycler)), 0);
	//  191  370:aload_0         
	//  192  371:aload_1         
	//  193  372:iconst_0        
	//  194  373:invokevirtual   #414 <Method void addView(View, int)>
			} else
	//* 195  376:goto            398
			if(flag2)
	//* 196  379:iload           16
	//* 197  381:ifeq            392
				addDisappearingView(((View) (recycler)));
	//  198  384:aload_0         
	//  199  385:aload_1         
	//  200  386:invokevirtual   #417 <Method void addDisappearingView(View)>
			else
	//* 201  389:goto            398
				addDisappearingView(((View) (recycler)), 0);
	//  202  392:aload_0         
	//  203  393:aload_1         
	//  204  394:iconst_0        
	//  205  395:invokevirtual   #419 <Method void addDisappearingView(View, int)>
			calculateItemDecorationsForChild(((View) (recycler)), mDecorInsets);
	//  206  398:aload_0         
	//  207  399:aload_1         
	//  208  400:aload_0         
	//  209  401:getfield        #54  <Field Rect mDecorInsets>
	//  210  404:invokevirtual   #423 <Method void calculateItemDecorationsForChild(View, Rect)>
			measureChild(((View) (recycler)), j4, false);
	//  211  407:aload_0         
	//  212  408:aload_1         
	//  213  409:iload           15
	//  214  411:iconst_0        
	//  215  412:invokespecial   #425 <Method void measureChild(View, int, boolean)>
			int i3 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  216  415:aload_0         
	//  217  416:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  218  419:aload_1         
	//  219  420:invokevirtual   #428 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  220  423:istore          14
			int i2 = i;
	//  221  425:iload           8
	//  222  427:istore          13
			if(i3 > i)
	//* 223  429:iload           14
	//* 224  431:iload           8
	//* 225  433:icmple          440
				i2 = i3;
	//  226  436:iload           14
	//  227  438:istore          13
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  228  440:aload_1         
	//  229  441:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  230  444:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  231  447:astore_2        
			float f2 = ((float)mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) * 1.0F) / (float)((LayoutParams) (state)).mSpanSize;
	//  232  448:aload_0         
	//  233  449:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  234  452:aload_1         
	//  235  453:invokevirtual   #431 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  236  456:i2f             
	//  237  457:fconst_1        
	//  238  458:fmul            
	//  239  459:aload_2         
	//  240  460:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  241  463:i2f             
	//  242  464:fdiv            
	//  243  465:fstore          7
			float f1 = f;
	//  244  467:fload           5
	//  245  469:fstore          6
			if(f2 > f)
	//* 246  471:fload           7
	//* 247  473:fload           5
	//* 248  475:fcmpl           
	//* 249  476:ifle            483
				f1 = f2;
	//  250  479:fload           7
	//  251  481:fstore          6
			j++;
	//  252  483:iload           9
	//  253  485:iconst_1        
	//  254  486:iadd            
	//  255  487:istore          9
			i = i2;
	//  256  489:iload           13
	//  257  491:istore          8
			f = f1;
	//  258  493:fload           6
	//  259  495:fstore          5
		}
	//* 260  497:goto            335
		j = i;
	//  261  500:iload           8
	//  262  502:istore          9
		if(flag)
	//* 263  504:iload           10
	//* 264  506:ifeq            589
		{
			guessMeasurement(f, j1);
	//  265  509:aload_0         
	//  266  510:fload           5
	//  267  512:iload           11
	//  268  514:invokespecial   #433 <Method void guessMeasurement(float, int)>
			int k = 0;
	//  269  517:iconst_0        
	//  270  518:istore          10
			i = 0;
	//  271  520:iconst_0        
	//  272  521:istore          8
			do
			{
				j = i;
	//  273  523:iload           8
	//  274  525:istore          9
				if(k >= k1)
					break;
	//  275  527:iload           10
	//  276  529:iload           12
	//  277  531:icmpge          589
				recycler = ((RecyclerView.Recycler) (mSet[k]));
	//  278  534:aload_0         
	//  279  535:getfield        #75  <Field View[] mSet>
	//  280  538:iload           10
	//  281  540:aaload          
	//  282  541:astore_1        
				measureChild(((View) (recycler)), 0x40000000, true);
	//  283  542:aload_0         
	//  284  543:aload_1         
	//  285  544:ldc2            #377 <Int 0x40000000>
	//  286  547:iconst_1        
	//  287  548:invokespecial   #425 <Method void measureChild(View, int, boolean)>
				j1 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  288  551:aload_0         
	//  289  552:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  290  555:aload_1         
	//  291  556:invokevirtual   #428 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  292  559:istore          11
				j = i;
	//  293  561:iload           8
	//  294  563:istore          9
				if(j1 > i)
	//* 295  565:iload           11
	//* 296  567:iload           8
	//* 297  569:icmple          576
					j = j1;
	//  298  572:iload           11
	//  299  574:istore          9
				k++;
	//  300  576:iload           10
	//  301  578:iconst_1        
	//  302  579:iadd            
	//  303  580:istore          10
				i = j;
	//  304  582:iload           9
	//  305  584:istore          8
			} while(true);
	//  306  586:goto            523
		}
		for(i = 0; i < k1; i++)
	//* 307  589:iconst_0        
	//* 308  590:istore          8
	//* 309  592:iload           8
	//* 310  594:iload           12
	//* 311  596:icmpge          787
		{
			recycler = ((RecyclerView.Recycler) (mSet[i]));
	//  312  599:aload_0         
	//  313  600:getfield        #75  <Field View[] mSet>
	//  314  603:iload           8
	//  315  605:aaload          
	//  316  606:astore_1        
			if(mOrientationHelper.getDecoratedMeasurement(((View) (recycler))) == j)
				continue;
	//  317  607:aload_0         
	//  318  608:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  319  611:aload_1         
	//  320  612:invokevirtual   #428 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  321  615:iload           9
	//  322  617:icmpeq          778
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  323  620:aload_1         
	//  324  621:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  325  624:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  326  627:astore_2        
			Rect rect = ((LayoutParams) (state)).mDecorInsets;
	//  327  628:aload_2         
	//  328  629:getfield        #205 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//  329  632:astore          17
			j1 = rect.top + rect.bottom + ((LayoutParams) (state)).topMargin + ((LayoutParams) (state)).bottomMargin;
	//  330  634:aload           17
	//  331  636:getfield        #208 <Field int Rect.top>
	//  332  639:aload           17
	//  333  641:getfield        #211 <Field int Rect.bottom>
	//  334  644:iadd            
	//  335  645:aload_2         
	//  336  646:getfield        #214 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  337  649:iadd            
	//  338  650:aload_2         
	//  339  651:getfield        #217 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  340  654:iadd            
	//  341  655:istore          11
			int l = rect.left + rect.right + ((LayoutParams) (state)).leftMargin + ((LayoutParams) (state)).rightMargin;
	//  342  657:aload           17
	//  343  659:getfield        #220 <Field int Rect.left>
	//  344  662:aload           17
	//  345  664:getfield        #223 <Field int Rect.right>
	//  346  667:iadd            
	//  347  668:aload_2         
	//  348  669:getfield        #226 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  349  672:iadd            
	//  350  673:aload_2         
	//  351  674:getfield        #229 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  352  677:iadd            
	//  353  678:istore          10
			int j2 = getSpaceForSpanRange(((LayoutParams) (state)).mSpanIndex, ((LayoutParams) (state)).mSpanSize);
	//  354  680:aload_0         
	//  355  681:aload_2         
	//  356  682:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  357  685:aload_2         
	//  358  686:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  359  689:invokevirtual   #232 <Method int getSpaceForSpanRange(int, int)>
	//  360  692:istore          13
			if(mOrientation == 1)
	//* 361  694:aload_0         
	//* 362  695:getfield        #235 <Field int mOrientation>
	//* 363  698:iconst_1        
	//* 364  699:icmpne          735
			{
				l = getChildMeasureSpec(j2, 0x40000000, l, ((LayoutParams) (state)).width, false);
	//  365  702:iload           13
	//  366  704:ldc2            #377 <Int 0x40000000>
	//  367  707:iload           10
	//  368  709:aload_2         
	//  369  710:getfield        #238 <Field int GridLayoutManager$LayoutParams.width>
	//  370  713:iconst_0        
	//  371  714:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  372  717:istore          10
				j1 = android.view.View.MeasureSpec.makeMeasureSpec(j - j1, 0x40000000);
	//  373  719:iload           9
	//  374  721:iload           11
	//  375  723:isub            
	//  376  724:ldc2            #377 <Int 0x40000000>
	//  377  727:invokestatic    #438 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  378  730:istore          11
			} else
	//* 379  732:goto            765
			{
				l = android.view.View.MeasureSpec.makeMeasureSpec(j - l, 0x40000000);
	//  380  735:iload           9
	//  381  737:iload           10
	//  382  739:isub            
	//  383  740:ldc2            #377 <Int 0x40000000>
	//  384  743:invokestatic    #438 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  385  746:istore          10
				j1 = getChildMeasureSpec(j2, 0x40000000, j1, ((LayoutParams) (state)).height, false);
	//  386  748:iload           13
	//  387  750:ldc2            #377 <Int 0x40000000>
	//  388  753:iload           11
	//  389  755:aload_2         
	//  390  756:getfield        #257 <Field int GridLayoutManager$LayoutParams.height>
	//  391  759:iconst_0        
	//  392  760:invokestatic    #242 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  393  763:istore          11
			}
			measureChildWithDecorationsAndMargin(((View) (recycler)), l, j1, true);
	//  394  765:aload_0         
	//  395  766:aload_1         
	//  396  767:iload           10
	//  397  769:iload           11
	//  398  771:iconst_1        
	//  399  772:invokespecial   #264 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
		}

	//  400  775:goto            778
	//  401  778:iload           8
	//  402  780:iconst_1        
	//  403  781:iadd            
	//  404  782:istore          8
	//* 405  784:goto            592
		boolean flag1 = false;
	//  406  787:iconst_0        
	//  407  788:istore          14
		layoutchunkresult.mConsumed = j;
	//  408  790:aload           4
	//  409  792:iload           9
	//  410  794:putfield        #441 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		int i1;
		int k2;
		if(mOrientation == 1)
	//* 411  797:aload_0         
	//* 412  798:getfield        #235 <Field int mOrientation>
	//* 413  801:iconst_1        
	//* 414  802:icmpne          877
		{
			if(layoutstate.mLayoutDirection == -1)
	//* 415  805:aload_3         
	//* 416  806:getfield        #444 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 417  809:iconst_m1       
	//* 418  810:icmpne          847
			{
				i = layoutstate.mOffset;
	//  419  813:aload_3         
	//  420  814:getfield        #447 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  421  817:istore          8
				k2 = i;
	//  422  819:iload           8
	//  423  821:istore          13
				i -= j;
	//  424  823:iload           8
	//  425  825:iload           9
	//  426  827:isub            
	//  427  828:istore          8
				i1 = 0;
	//  428  830:iconst_0        
	//  429  831:istore          10
				j1 = 0;
	//  430  833:iconst_0        
	//  431  834:istore          11
				j = k2;
	//  432  836:iload           13
	//  433  838:istore          9
				k2 = ((int) (flag1));
	//  434  840:iload           14
	//  435  842:istore          13
			} else
	//* 436  844:goto            942
			{
				i1 = layoutstate.mOffset;
	//  437  847:aload_3         
	//  438  848:getfield        #447 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  439  851:istore          10
				i = i1;
	//  440  853:iload           10
	//  441  855:istore          8
				j += i1;
	//  442  857:iload           9
	//  443  859:iload           10
	//  444  861:iadd            
	//  445  862:istore          9
				i1 = 0;
	//  446  864:iconst_0        
	//  447  865:istore          10
				j1 = 0;
	//  448  867:iconst_0        
	//  449  868:istore          11
				k2 = ((int) (flag1));
	//  450  870:iload           14
	//  451  872:istore          13
			}
		} else
	//* 452  874:goto            942
		if(layoutstate.mLayoutDirection == -1)
	//* 453  877:aload_3         
	//* 454  878:getfield        #444 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 455  881:iconst_m1       
	//* 456  882:icmpne          919
		{
			i1 = layoutstate.mOffset;
	//  457  885:aload_3         
	//  458  886:getfield        #447 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  459  889:istore          10
			i = 0;
	//  460  891:iconst_0        
	//  461  892:istore          8
			k2 = 0;
	//  462  894:iconst_0        
	//  463  895:istore          13
			j1 = i1;
	//  464  897:iload           10
	//  465  899:istore          11
			i1 -= j;
	//  466  901:iload           10
	//  467  903:iload           9
	//  468  905:isub            
	//  469  906:istore          10
			j = k2;
	//  470  908:iload           13
	//  471  910:istore          9
			k2 = ((int) (flag1));
	//  472  912:iload           14
	//  473  914:istore          13
		} else
	//* 474  916:goto            942
		{
			i1 = layoutstate.mOffset;
	//  475  919:aload_3         
	//  476  920:getfield        #447 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  477  923:istore          10
			j1 = j + i1;
	//  478  925:iload           9
	//  479  927:iload           10
	//  480  929:iadd            
	//  481  930:istore          11
			i = 0;
	//  482  932:iconst_0        
	//  483  933:istore          8
			j = 0;
	//  484  935:iconst_0        
	//  485  936:istore          9
			k2 = ((int) (flag1));
	//  486  938:iload           14
	//  487  940:istore          13
		}
		int j5;
		for(; k2 < k1; k2 = j5)
	//* 488  942:iload           13
	//* 489  944:iload           12
	//* 490  946:icmpge          1231
		{
			recycler = ((RecyclerView.Recycler) (mSet[k2]));
	//  491  949:aload_0         
	//  492  950:getfield        #75  <Field View[] mSet>
	//  493  953:iload           13
	//  494  955:aaload          
	//  495  956:astore_1        
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  496  957:aload_1         
	//  497  958:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  498  961:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  499  964:astore_2        
			if(mOrientation == 1)
	//* 500  965:aload_0         
	//* 501  966:getfield        #235 <Field int mOrientation>
	//* 502  969:iconst_1        
	//* 503  970:icmpne          1101
			{
				if(isLayoutRTL())
	//* 504  973:aload_0         
	//* 505  974:invokevirtual   #368 <Method boolean isLayoutRTL()>
	//* 506  977:ifeq            1041
				{
					j1 = getPaddingLeft() + mCachedBorders[mSpanCount - ((LayoutParams) (state)).mSpanIndex];
	//  507  980:aload_0         
	//  508  981:invokevirtual   #289 <Method int getPaddingLeft()>
	//  509  984:aload_0         
	//  510  985:getfield        #119 <Field int[] mCachedBorders>
	//  511  988:aload_0         
	//  512  989:getfield        #37  <Field int mSpanCount>
	//  513  992:aload_2         
	//  514  993:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  515  996:isub            
	//  516  997:iaload          
	//  517  998:iadd            
	//  518  999:istore          11
					int j3 = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  519 1001:aload_0         
	//  520 1002:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  521 1005:aload_1         
	//  522 1006:invokevirtual   #431 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  523 1009:istore          14
					i1 = j1;
	//  524 1011:iload           11
	//  525 1013:istore          10
					int k4 = j1 - j3;
	//  526 1015:iload           11
	//  527 1017:iload           14
	//  528 1019:isub            
	//  529 1020:istore          15
					j3 = i;
	//  530 1022:iload           8
	//  531 1024:istore          14
					j1 = j;
	//  532 1026:iload           9
	//  533 1028:istore          11
					i = k4;
	//  534 1030:iload           15
	//  535 1032:istore          8
					j = j3;
	//  536 1034:iload           14
	//  537 1036:istore          9
				} else
	//* 538 1038:goto            1146
				{
					j1 = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  539 1041:aload_0         
	//  540 1042:invokevirtual   #289 <Method int getPaddingLeft()>
	//  541 1045:aload_0         
	//  542 1046:getfield        #119 <Field int[] mCachedBorders>
	//  543 1049:aload_2         
	//  544 1050:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  545 1053:iaload          
	//  546 1054:iadd            
	//  547 1055:istore          11
					int k3 = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  548 1057:aload_0         
	//  549 1058:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  550 1061:aload_1         
	//  551 1062:invokevirtual   #431 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  552 1065:istore          14
					i1 = j1;
	//  553 1067:iload           11
	//  554 1069:istore          10
					int l4 = k3 + j1;
	//  555 1071:iload           14
	//  556 1073:iload           11
	//  557 1075:iadd            
	//  558 1076:istore          15
					k3 = i;
	//  559 1078:iload           8
	//  560 1080:istore          14
					j1 = j;
	//  561 1082:iload           9
	//  562 1084:istore          11
					i = i1;
	//  563 1086:iload           10
	//  564 1088:istore          8
					j = k3;
	//  565 1090:iload           14
	//  566 1092:istore          9
					i1 = l4;
	//  567 1094:iload           15
	//  568 1096:istore          10
				}
			} else
	//* 569 1098:goto            1146
			{
				int l3 = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  570 1101:aload_0         
	//  571 1102:invokevirtual   #298 <Method int getPaddingTop()>
	//  572 1105:aload_0         
	//  573 1106:getfield        #119 <Field int[] mCachedBorders>
	//  574 1109:aload_2         
	//  575 1110:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  576 1113:iaload          
	//  577 1114:iadd            
	//  578 1115:istore          14
				int i5 = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  579 1117:aload_0         
	//  580 1118:getfield        #246 <Field OrientationHelper mOrientationHelper>
	//  581 1121:aload_1         
	//  582 1122:invokevirtual   #431 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  583 1125:istore          15
				i = i1;
	//  584 1127:iload           10
	//  585 1129:istore          8
				i1 = j1;
	//  586 1131:iload           11
	//  587 1133:istore          10
				j = l3;
	//  588 1135:iload           14
	//  589 1137:istore          9
				j1 = i5 + l3;
	//  590 1139:iload           15
	//  591 1141:iload           14
	//  592 1143:iadd            
	//  593 1144:istore          11
			}
			layoutDecoratedWithMargins(((View) (recycler)), i, j, i1, j1);
	//  594 1146:aload_0         
	//  595 1147:aload_1         
	//  596 1148:iload           8
	//  597 1150:iload           9
	//  598 1152:iload           10
	//  599 1154:iload           11
	//  600 1156:invokevirtual   #451 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			if(((LayoutParams) (state)).isItemRemoved() || ((LayoutParams) (state)).isItemChanged())
	//* 601 1159:aload_2         
	//* 602 1160:invokevirtual   #452 <Method boolean GridLayoutManager$LayoutParams.isItemRemoved()>
	//* 603 1163:ifne            1173
	//* 604 1166:aload_2         
	//* 605 1167:invokevirtual   #455 <Method boolean GridLayoutManager$LayoutParams.isItemChanged()>
	//* 606 1170:ifeq            1179
				layoutchunkresult.mIgnoreConsumed = true;
	//  607 1173:aload           4
	//  608 1175:iconst_1        
	//  609 1176:putfield        #458 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
			layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | ((View) (recycler)).hasFocusable();
	//  610 1179:aload           4
	//  611 1181:aload           4
	//  612 1183:getfield        #461 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  613 1186:aload_1         
	//  614 1187:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//  615 1190:ior             
	//  616 1191:putfield        #461 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
			j5 = k2 + 1;
	//  617 1194:iload           13
	//  618 1196:iconst_1        
	//  619 1197:iadd            
	//  620 1198:istore          15
			k2 = i;
	//  621 1200:iload           8
	//  622 1202:istore          13
			i = j;
	//  623 1204:iload           9
	//  624 1206:istore          8
			int i4 = i1;
	//  625 1208:iload           10
	//  626 1210:istore          14
			j = j1;
	//  627 1212:iload           11
	//  628 1214:istore          9
			i1 = k2;
	//  629 1216:iload           13
	//  630 1218:istore          10
			j1 = i4;
	//  631 1220:iload           14
	//  632 1222:istore          11
		}

	//  633 1224:iload           15
	//  634 1226:istore          13
	//* 635 1228:goto            942
		Arrays.fill(((Object []) (mSet)), ((Object) (null)));
	//  636 1231:aload_0         
	//  637 1232:getfield        #75  <Field View[] mSet>
	//  638 1235:aconst_null     
	//  639 1236:invokestatic    #470 <Method void Arrays.fill(Object[], Object)>
	//  640 1239:return          
	}

	void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo, int i)
	{
		super.onAnchorReady(recycler, state, anchorinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #473 <Method void LinearLayoutManager.onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		updateMeasurements();
	//    6    9:aload_0         
	//    7   10:invokespecial   #379 <Method void updateMeasurements()>
		if(state.getItemCount() > 0 && !state.isPreLayout())
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #140 <Method int RecyclerView$State.getItemCount()>
	//*  10   17:ifle            36
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #146 <Method boolean RecyclerView$State.isPreLayout()>
	//*  13   24:ifne            36
			ensureAnchorIsInCorrectSpan(recycler, state, anchorinfo, i);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:iload           4
	//   19   33:invokespecial   #475 <Method void ensureAnchorIsInCorrectSpan(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		ensureViewSet();
	//   20   36:aload_0         
	//   21   37:invokespecial   #477 <Method void ensureViewSet()>
	//   22   40:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		View view1 = findContainingItemView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #483 <Method View findContainingItemView(View)>
	//    3    5:astore          21
		View view2 = null;
	//    4    7:aconst_null     
	//    5    8:astore          22
		if(view1 == null)
	//*   6   10:aload           21
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   10   17:aload           21
	//   11   19:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   22:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   25:astore          23
		int i3 = layoutparams.mSpanIndex;
	//   14   27:aload           23
	//   15   29:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   16   32:istore          15
		int j3 = layoutparams.mSpanIndex + layoutparams.mSpanSize;
	//   17   34:aload           23
	//   18   36:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   19   39:aload           23
	//   20   41:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   21   44:iadd            
	//   22   45:istore          16
		if(super.onFocusSearchFailed(view, i, recycler, state) == null)
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:iload_2         
	//*  26   50:aload_3         
	//*  27   51:aload           4
	//*  28   53:invokespecial   #485 <Method View LinearLayoutManager.onFocusSearchFailed(View, int, RecyclerView$Recycler, RecyclerView$State)>
	//*  29   56:ifnonnull       61
			return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		boolean flag;
		if(convertFocusDirectionToLayoutDirection(i) == 1)
	//*  32   61:aload_0         
	//*  33   62:iload_2         
	//*  34   63:invokevirtual   #488 <Method int convertFocusDirectionToLayoutDirection(int)>
	//*  35   66:iconst_1        
	//*  36   67:icmpne          76
			flag = true;
	//   37   70:iconst_1        
	//   38   71:istore          20
		else
	//*  39   73:goto            79
			flag = false;
	//   40   76:iconst_0        
	//   41   77:istore          20
		if(flag != mShouldReverseLayout)
	//*  42   79:iload           20
	//*  43   81:aload_0         
	//*  44   82:getfield        #491 <Field boolean mShouldReverseLayout>
	//*  45   85:icmpeq          93
			i = 1;
	//   46   88:iconst_1        
	//   47   89:istore_2        
		else
	//*  48   90:goto            95
			i = 0;
	//   49   93:iconst_0        
	//   50   94:istore_2        
		int l;
		byte byte0;
		if(i != 0)
	//*  51   95:iload_2         
	//*  52   96:ifeq            115
		{
			i = getChildCount() - 1;
	//   53   99:aload_0         
	//   54  100:invokevirtual   #100 <Method int getChildCount()>
	//   55  103:iconst_1        
	//   56  104:isub            
	//   57  105:istore_2        
			l = -1;
	//   58  106:iconst_m1       
	//   59  107:istore          7
			byte0 = -1;
	//   60  109:iconst_m1       
	//   61  110:istore          8
		} else
	//*  62  112:goto            126
		{
			l = getChildCount();
	//   63  115:aload_0         
	//   64  116:invokevirtual   #100 <Method int getChildCount()>
	//   65  119:istore          7
			i = 0;
	//   66  121:iconst_0        
	//   67  122:istore_2        
			byte0 = 1;
	//   68  123:iconst_1        
	//   69  124:istore          8
		}
		int i1;
		if(mOrientation == 1 && isLayoutRTL())
	//*  70  126:aload_0         
	//*  71  127:getfield        #235 <Field int mOrientation>
	//*  72  130:iconst_1        
	//*  73  131:icmpne          147
	//*  74  134:aload_0         
	//*  75  135:invokevirtual   #368 <Method boolean isLayoutRTL()>
	//*  76  138:ifeq            147
			i1 = 1;
	//   77  141:iconst_1        
	//   78  142:istore          9
		else
	//*  79  144:goto            150
			i1 = 0;
	//   80  147:iconst_0        
	//   81  148:istore          9
		int k3 = getSpanGroupIndex(recycler, state, i);
	//   82  150:aload_0         
	//   83  151:aload_3         
	//   84  152:aload           4
	//   85  154:iload_2         
	//   86  155:invokespecial   #364 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   87  158:istore          17
		view = null;
	//   88  160:aconst_null     
	//   89  161:astore_1        
		byte byte1 = -1;
	//   90  162:iconst_m1       
	//   91  163:istore          11
		int l1 = 0;
	//   92  165:iconst_0        
	//   93  166:istore          12
		int j = 0;
	//   94  168:iconst_0        
	//   95  169:istore          5
		int k = -1;
	//   96  171:iconst_m1       
	//   97  172:istore          6
		int j1 = l;
	//   98  174:iload           7
	//   99  176:istore          10
		l = ((int) (byte1));
	//  100  178:iload           11
	//  101  180:istore          7
label0:
		for(int k1 = i; k1 != j1;)
	//* 102  182:iload_2         
	//* 103  183:istore          11
	//* 104  185:iload           11
	//* 105  187:iload           10
	//* 106  189:icmpeq          596
		{
label1:
			{
label2:
				{
					int l3;
					int i4;
					View view3;
					LayoutParams layoutparams1;
label3:
					{
						i = getSpanGroupIndex(recycler, state, k1);
	//  107  192:aload_0         
	//  108  193:aload_3         
	//  109  194:aload           4
	//  110  196:iload           11
	//  111  198:invokespecial   #364 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//  112  201:istore_2        
						view3 = getChildAt(k1);
	//  113  202:aload_0         
	//  114  203:iload           11
	//  115  205:invokevirtual   #104 <Method View getChildAt(int)>
	//  116  208:astore          23
						if(view3 == view1)
	//* 117  210:aload           23
	//* 118  212:aload           21
	//* 119  214:if_acmpne       220
							break label0;
	//  120  217:goto            596
						if(view3.hasFocusable() && i != k3)
	//* 121  220:aload           23
	//* 122  222:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 123  225:ifeq            245
	//* 124  228:iload_2         
	//* 125  229:iload           17
	//* 126  231:icmpeq          245
						{
							if(view2 != null)
	//* 127  234:aload           22
	//* 128  236:ifnull          242
								break label0;
	//  129  239:goto            596
							break label2;
	//  130  242:goto            572
						}
						layoutparams1 = (LayoutParams)view3.getLayoutParams();
	//  131  245:aload           23
	//  132  247:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  133  250:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  134  253:astore          24
						l3 = layoutparams1.mSpanIndex;
	//  135  255:aload           24
	//  136  257:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  137  260:istore          18
						i4 = layoutparams1.mSpanIndex + layoutparams1.mSpanSize;
	//  138  262:aload           24
	//  139  264:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  140  267:aload           24
	//  141  269:getfield        #92  <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  142  272:iadd            
	//  143  273:istore          19
						if(view3.hasFocusable() && l3 == i3 && i4 == j3)
	//* 144  275:aload           23
	//* 145  277:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 146  280:ifeq            300
	//* 147  283:iload           18
	//* 148  285:iload           15
	//* 149  287:icmpne          300
	//* 150  290:iload           19
	//* 151  292:iload           16
	//* 152  294:icmpne          300
							return view3;
	//  153  297:aload           23
	//  154  299:areturn         
						if(view3.hasFocusable() && view2 == null || !view3.hasFocusable() && view == null)
	//* 155  300:aload           23
	//* 156  302:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 157  305:ifeq            313
	//* 158  308:aload           22
	//* 159  310:ifnull          325
	//* 160  313:aload           23
	//* 161  315:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 162  318:ifne            330
	//* 163  321:aload_1         
	//* 164  322:ifnonnull       330
						{
							i = 1;
	//  165  325:iconst_1        
	//  166  326:istore_2        
							break label3;
	//  167  327:goto            473
						}
						i = Math.max(l3, i3);
	//  168  330:iload           18
	//  169  332:iload           15
	//  170  334:invokestatic    #200 <Method int Math.max(int, int)>
	//  171  337:istore_2        
						int k2 = Math.min(i4, j3) - i;
	//  172  338:iload           19
	//  173  340:iload           16
	//  174  342:invokestatic    #494 <Method int Math.min(int, int)>
	//  175  345:iload_2         
	//  176  346:isub            
	//  177  347:istore          14
						if(view3.hasFocusable())
	//* 178  349:aload           23
	//* 179  351:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 180  354:ifeq            404
						{
							if(k2 > l1)
	//* 181  357:iload           14
	//* 182  359:iload           12
	//* 183  361:icmple          369
							{
								i = 1;
	//  184  364:iconst_1        
	//  185  365:istore_2        
								break label3;
	//  186  366:goto            473
							}
							if(k2 == l1)
	//* 187  369:iload           14
	//* 188  371:iload           12
	//* 189  373:icmpne          401
							{
								if(l3 > l)
	//* 190  376:iload           18
	//* 191  378:iload           7
	//* 192  380:icmple          388
									i = 1;
	//  193  383:iconst_1        
	//  194  384:istore_2        
								else
	//* 195  385:goto            390
									i = 0;
	//  196  388:iconst_0        
	//  197  389:istore_2        
								if(i1 == i)
	//* 198  390:iload           9
	//* 199  392:iload_2         
	//* 200  393:icmpne          401
								{
									i = 1;
	//  201  396:iconst_1        
	//  202  397:istore_2        
									break label3;
	//  203  398:goto            473
								}
							}
						} else
	//* 204  401:goto            471
						if(view2 == null)
	//* 205  404:aload           22
	//* 206  406:ifnonnull       471
						{
							i = 0;
	//  207  409:iconst_0        
	//  208  410:istore_2        
							if(isViewPartiallyVisible(view3, false, true))
	//* 209  411:aload_0         
	//* 210  412:aload           23
	//* 211  414:iconst_0        
	//* 212  415:iconst_1        
	//* 213  416:invokevirtual   #498 <Method boolean isViewPartiallyVisible(View, boolean, boolean)>
	//* 214  419:ifeq            468
							{
								int i2 = j;
	//  215  422:iload           5
	//  216  424:istore          13
								if(k2 > i2)
	//* 217  426:iload           14
	//* 218  428:iload           13
	//* 219  430:icmple          438
								{
									i = 1;
	//  220  433:iconst_1        
	//  221  434:istore_2        
									break label3;
	//  222  435:goto            473
								}
								if(k2 == i2)
	//* 223  438:iload           14
	//* 224  440:iload           13
	//* 225  442:icmpne          465
								{
									if(l3 > k)
	//* 226  445:iload           18
	//* 227  447:iload           6
	//* 228  449:icmple          454
										i = 1;
	//  229  452:iconst_1        
	//  230  453:istore_2        
									if(i1 == i)
	//* 231  454:iload           9
	//* 232  456:iload_2         
	//* 233  457:icmpne          471
									{
										i = 1;
	//  234  460:iconst_1        
	//  235  461:istore_2        
										break label3;
	//  236  462:goto            473
									}
								}
							}
						}
	//* 237  465:goto            471
	//* 238  468:goto            471
						i = 0;
	//  239  471:iconst_0        
	//  240  472:istore_2        
					}
					int j2 = l;
	//  241  473:iload           7
	//  242  475:istore          13
					int l2 = j;
	//  243  477:iload           5
	//  244  479:istore          14
					if(i != 0)
	//* 245  481:iload_2         
	//* 246  482:ifeq            572
					{
						if(view3.hasFocusable())
	//* 247  485:aload           23
	//* 248  487:invokevirtual   #464 <Method boolean View.hasFocusable()>
	//* 249  490:ifeq            533
						{
							j = layoutparams1.mSpanIndex;
	//  250  493:aload           24
	//  251  495:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  252  498:istore          5
							i = Math.min(i4, j3);
	//  253  500:iload           19
	//  254  502:iload           16
	//  255  504:invokestatic    #494 <Method int Math.min(int, int)>
	//  256  507:istore_2        
							l = Math.max(l3, i3);
	//  257  508:iload           18
	//  258  510:iload           15
	//  259  512:invokestatic    #200 <Method int Math.max(int, int)>
	//  260  515:istore          7
							l1 = i - l;
	//  261  517:iload_2         
	//  262  518:iload           7
	//  263  520:isub            
	//  264  521:istore          12
							view2 = view3;
	//  265  523:aload           23
	//  266  525:astore          22
							i = l2;
	//  267  527:iload           14
	//  268  529:istore_2        
						} else
	//* 269  530:goto            579
						{
							k = layoutparams1.mSpanIndex;
	//  270  533:aload           24
	//  271  535:getfield        #95  <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  272  538:istore          6
							i = Math.min(i4, j3);
	//  273  540:iload           19
	//  274  542:iload           16
	//  275  544:invokestatic    #494 <Method int Math.min(int, int)>
	//  276  547:istore_2        
							j = Math.max(l3, i3);
	//  277  548:iload           18
	//  278  550:iload           15
	//  279  552:invokestatic    #200 <Method int Math.max(int, int)>
	//  280  555:istore          5
							view = view3;
	//  281  557:aload           23
	//  282  559:astore_1        
							i -= j;
	//  283  560:iload_2         
	//  284  561:iload           5
	//  285  563:isub            
	//  286  564:istore_2        
							j = j2;
	//  287  565:iload           13
	//  288  567:istore          5
						}
						break label1;
	//  289  569:goto            579
					}
				}
				i = j;
	//  290  572:iload           5
	//  291  574:istore_2        
				j = l;
	//  292  575:iload           7
	//  293  577:istore          5
			}
			k1 += ((int) (byte0));
	//  294  579:iload           11
	//  295  581:iload           8
	//  296  583:iadd            
	//  297  584:istore          11
			l = j;
	//  298  586:iload           5
	//  299  588:istore          7
			j = i;
	//  300  590:iload_2         
	//  301  591:istore          5
		}

	//* 302  593:goto            185
		if(view2 != null)
	//* 303  596:aload           22
	//* 304  598:ifnull          604
			return view2;
	//  305  601:aload           22
	//  306  603:areturn         
		else
			return view;
	//  307  604:aload_1         
	//  308  605:areturn         
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//    9   18:invokespecial   #503 <Method void LinearLayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
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
	//   18   32:invokevirtual   #107 <Method int GridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   19   35:invokespecial   #364 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   20   38:istore          5
		if(mOrientation == 0)
	//*  21   40:aload_0         
	//*  22   41:getfield        #235 <Field int mOrientation>
	//*  23   44:ifne            106
		{
			int j = ((LayoutParams) (view)).getSpanIndex();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #116 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   26   51:istore          6
			int l = ((LayoutParams) (view)).getSpanSize();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #109 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   29   57:istore          7
			boolean flag;
			if(mSpanCount > 1 && ((LayoutParams) (view)).getSpanSize() == mSpanCount)
	//*  30   59:aload_0         
	//*  31   60:getfield        #37  <Field int mSpanCount>
	//*  32   63:iconst_1        
	//*  33   64:icmple          84
	//*  34   67:aload_3         
	//*  35   68:invokevirtual   #109 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  36   71:aload_0         
	//*  37   72:getfield        #37  <Field int mSpanCount>
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
	//   51   99:invokestatic    #509 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   52  102:invokevirtual   #515 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   53  105:return          
		}
		int k = ((LayoutParams) (view)).getSpanIndex();
	//   54  106:aload_3         
	//   55  107:invokevirtual   #116 <Method int GridLayoutManager$LayoutParams.getSpanIndex()>
	//   56  110:istore          6
		int i1 = ((LayoutParams) (view)).getSpanSize();
	//   57  112:aload_3         
	//   58  113:invokevirtual   #109 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//   59  116:istore          7
		boolean flag1;
		if(mSpanCount > 1 && ((LayoutParams) (view)).getSpanSize() == mSpanCount)
	//*  60  118:aload_0         
	//*  61  119:getfield        #37  <Field int mSpanCount>
	//*  62  122:iconst_1        
	//*  63  123:icmple          143
	//*  64  126:aload_3         
	//*  65  127:invokevirtual   #109 <Method int GridLayoutManager$LayoutParams.getSpanSize()>
	//*  66  130:aload_0         
	//*  67  131:getfield        #37  <Field int mSpanCount>
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
	//   81  158:invokestatic    #509 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   82  161:invokevirtual   #515 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   83  164:return          
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		mSpanSizeLookup.invalidateSpanIndexCache();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    2    4:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
	//    3    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #146 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifeq            11
			cachePreLayoutSpanMapping();
	//    3    7:aload_0         
	//    4    8:invokespecial   #531 <Method void cachePreLayoutSpanMapping()>
		super.onLayoutChildren(recycler, state);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #533 <Method void LinearLayoutManager.onLayoutChildren(RecyclerView$Recycler, RecyclerView$State)>
		clearPreLayoutSpanMappingCache();
	//    9   17:aload_0         
	//   10   18:invokespecial   #535 <Method void clearPreLayoutSpanMappingCache()>
	//   11   21:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #539 <Method void LinearLayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingSpanCountChange = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #35  <Field boolean mPendingSpanCountChange>
	//    6   10:return          
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		updateMeasurements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #379 <Method void updateMeasurements()>
		ensureViewSet();
	//    2    4:aload_0         
	//    3    5:invokespecial   #477 <Method void ensureViewSet()>
		return super.scrollHorizontallyBy(i, recycler, state);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #543 <Method int LinearLayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    9   15:ireturn         
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		updateMeasurements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #379 <Method void updateMeasurements()>
		ensureViewSet();
	//    2    4:aload_0         
	//    3    5:invokespecial   #477 <Method void ensureViewSet()>
		return super.scrollVerticallyBy(i, recycler, state);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #546 <Method int LinearLayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    9   15:ireturn         
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		if(mCachedBorders == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field int[] mCachedBorders>
	//*   2    4:ifnonnull       14
			super.setMeasuredDimension(rect, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #550 <Method void LinearLayoutManager.setMeasuredDimension(Rect, int, int)>
		int k = getPaddingLeft() + getPaddingRight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #289 <Method int getPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #286 <Method int getPaddingRight()>
	//   12   22:iadd            
	//   13   23:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #298 <Method int getPaddingTop()>
	//   16   29:aload_0         
	//   17   30:invokevirtual   #295 <Method int getPaddingBottom()>
	//   18   33:iadd            
	//   19   34:istore          5
		if(mOrientation == 1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #235 <Field int mOrientation>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          92
		{
			j = chooseSize(j, rect.height() + l, getMinimumHeight());
	//   24   44:iload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #552 <Method int Rect.height()>
	//   27   49:iload           5
	//   28   51:iadd            
	//   29   52:aload_0         
	//   30   53:invokevirtual   #555 <Method int getMinimumHeight()>
	//   31   56:invokestatic    #559 <Method int chooseSize(int, int, int)>
	//   32   59:istore_3        
			rect = ((Rect) (mCachedBorders));
	//   33   60:aload_0         
	//   34   61:getfield        #119 <Field int[] mCachedBorders>
	//   35   64:astore_1        
			k = chooseSize(i, rect[rect.length - 1] + k, getMinimumWidth());
	//   36   65:iload_2         
	//   37   66:aload_1         
	//   38   67:aload_1         
	//   39   68:arraylength     
	//   40   69:iconst_1        
	//   41   70:isub            
	//   42   71:iaload          
	//   43   72:iload           4
	//   44   74:iadd            
	//   45   75:aload_0         
	//   46   76:invokevirtual   #562 <Method int getMinimumWidth()>
	//   47   79:invokestatic    #559 <Method int chooseSize(int, int, int)>
	//   48   82:istore          4
			i = j;
	//   49   84:iload_3         
	//   50   85:istore_2        
			j = k;
	//   51   86:iload           4
	//   52   88:istore_3        
		} else
	//*  53   89:goto            137
		{
			i = chooseSize(i, rect.width() + k, getMinimumWidth());
	//   54   92:iload_2         
	//   55   93:aload_1         
	//   56   94:invokevirtual   #564 <Method int Rect.width()>
	//   57   97:iload           4
	//   58   99:iadd            
	//   59  100:aload_0         
	//   60  101:invokevirtual   #562 <Method int getMinimumWidth()>
	//   61  104:invokestatic    #559 <Method int chooseSize(int, int, int)>
	//   62  107:istore_2        
			rect = ((Rect) (mCachedBorders));
	//   63  108:aload_0         
	//   64  109:getfield        #119 <Field int[] mCachedBorders>
	//   65  112:astore_1        
			k = chooseSize(j, rect[rect.length - 1] + l, getMinimumHeight());
	//   66  113:iload_3         
	//   67  114:aload_1         
	//   68  115:aload_1         
	//   69  116:arraylength     
	//   70  117:iconst_1        
	//   71  118:isub            
	//   72  119:iaload          
	//   73  120:iload           5
	//   74  122:iadd            
	//   75  123:aload_0         
	//   76  124:invokevirtual   #555 <Method int getMinimumHeight()>
	//   77  127:invokestatic    #559 <Method int chooseSize(int, int, int)>
	//   78  130:istore          4
			j = i;
	//   79  132:iload_2         
	//   80  133:istore_3        
			i = k;
	//   81  134:iload           4
	//   82  136:istore_2        
		}
		setMeasuredDimension(j, i);
	//   83  137:aload_0         
	//   84  138:iload_3         
	//   85  139:iload_2         
	//   86  140:invokevirtual   #566 <Method void setMeasuredDimension(int, int)>
	//   87  143:return          
	}

	public void setSpanCount(int i)
	{
		if(i == mSpanCount)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field int mSpanCount>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mPendingSpanCountChange = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #35  <Field boolean mPendingSpanCountChange>
		if(i >= 1)
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmplt          36
		{
			mSpanCount = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #37  <Field int mSpanCount>
			mSpanSizeLookup.invalidateSpanIndexCache();
	//   14   24:aload_0         
	//   15   25:getfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   16   28:invokevirtual   #520 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #569 <Method void requestLayout()>
			return;
	//   19   35:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #157 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #158 <Method void StringBuilder()>
	//   23   43:astore_2        
			stringbuilder.append("Span count should be at least 1. Provided ");
	//   24   44:aload_2         
	//   25   45:ldc2            #571 <String "Span count should be at least 1. Provided ">
	//   26   48:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			stringbuilder.append(i);
	//   28   52:aload_2         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//   31   57:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   58:new             #393 <Class IllegalArgumentException>
	//   33   61:dup             
	//   34   62:aload_2         
	//   35   63:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   36   66:invokespecial   #396 <Method void IllegalArgumentException(String)>
	//   37   69:athrow          
		}
	}

	public void setSpanSizeLookup(SpanSizeLookup spansizelookup)
	{
		mSpanSizeLookup = spansizelookup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//    3    5:return          
	}

	public void setStackFromEnd(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            10
		{
			super.setStackFromEnd(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #577 <Method void LinearLayoutManager.setStackFromEnd(boolean)>
			return;
	//    5    9:return          
		} else
		{
			throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
	//    6   10:new             #579 <Class UnsupportedOperationException>
	//    7   13:dup             
	//    8   14:ldc2            #581 <String "GridLayoutManager does not support stack from end. Consider using reverse layout">
	//    9   17:invokespecial   #582 <Method void UnsupportedOperationException(String)>
	//   10   20:athrow          
		}
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null && !mPendingSpanCountChange;
	//    0    0:aload_0         
	//    1    1:getfield        #587 <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field boolean mPendingSpanCountChange>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	int mCachedBorders[];
	final Rect mDecorInsets;
	boolean mPendingSpanCountChange;
	final SparseIntArray mPreLayoutSpanIndexCache;
	final SparseIntArray mPreLayoutSpanSizeCache;
	View mSet[];
	int mSpanCount;
	SpanSizeLookup mSpanSizeLookup;
}
