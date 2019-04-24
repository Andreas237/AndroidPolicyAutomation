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
			int k = j1;
		//    6   10:iload           6
		//    7   12:istore_3        
			int l;
			int i1;
			for(l = k; j1 < i; l = i1)
		//*   8   13:iload_3         
		//*   9   14:istore          4
		//*  10   16:iload           6
		//*  11   18:iload_1         
		//*  12   19:icmpge          88
			{
				int k1 = getSpanSize(j1);
		//   13   22:aload_0         
		//   14   23:iload           6
		//   15   25:invokevirtual   #48  <Method int getSpanSize(int)>
		//   16   28:istore          7
				int l1 = k + k1;
		//   17   30:iload_3         
		//   18   31:iload           7
		//   19   33:iadd            
		//   20   34:istore          8
				if(l1 == j)
		//*  21   36:iload           8
		//*  22   38:iload_2         
		//*  23   39:icmpne          53
				{
					i1 = l + 1;
		//   24   42:iload           4
		//   25   44:iconst_1        
		//   26   45:iadd            
		//   27   46:istore          5
					k = 0;
		//   28   48:iconst_0        
		//   29   49:istore_3        
				} else
		//*  30   50:goto            75
				{
					k = l1;
		//   31   53:iload           8
		//   32   55:istore_3        
					i1 = l;
		//   33   56:iload           4
		//   34   58:istore          5
					if(l1 > j)
		//*  35   60:iload           8
		//*  36   62:iload_2         
		//*  37   63:icmple          75
					{
						i1 = l + 1;
		//   38   66:iload           4
		//   39   68:iconst_1        
		//   40   69:iadd            
		//   41   70:istore          5
						k = k1;
		//   42   72:iload           7
		//   43   74:istore_3        
					}
				}
				j1++;
		//   44   75:iload           6
		//   45   77:iconst_1        
		//   46   78:iadd            
		//   47   79:istore          6
			}

		//   48   81:iload           5
		//   49   83:istore          4
		//*  50   85:goto            16
			i = l;
		//   51   88:iload           4
		//   52   90:istore_1        
			if(k + i2 > j)
		//*  53   91:iload_3         
		//*  54   92:iload           9
		//*  55   94:iadd            
		//*  56   95:iload_2         
		//*  57   96:icmple          104
				i = l + 1;
		//   58   99:iload           4
		//   59  101:iconst_1        
		//   60  102:iadd            
		//   61  103:istore_1        
			return i;
		//   62  104:iload_1         
		//   63  105:ireturn         
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
		//*  35   67:goto            76
			l = 0;
		//   36   70:iconst_0        
		//   37   71:istore          4
			k = l;
		//   38   73:iload           4
		//   39   75:istore_3        
_L1:
			for(l++; l < i; l++)
		//*  40   76:iload           4
		//*  41   78:iload_1         
		//*  42   79:icmpge          128
			{
				int i1 = getSpanSize(l);
		//   43   82:aload_0         
		//   44   83:iload           4
		//   45   85:invokevirtual   #48  <Method int getSpanSize(int)>
		//   46   88:istore          5
				int j1 = k + i1;
		//   47   90:iload_3         
		//   48   91:iload           5
		//   49   93:iadd            
		//   50   94:istore          6
				if(j1 == j)
		//*  51   96:iload           6
		//*  52   98:iload_2         
		//*  53   99:icmpne          107
				{
					k = 0;
		//   54  102:iconst_0        
		//   55  103:istore_3        
					continue;
		//   56  104:goto            119
				}
				k = j1;
		//   57  107:iload           6
		//   58  109:istore_3        
				if(j1 > j)
		//*  59  110:iload           6
		//*  60  112:iload_2         
		//*  61  113:icmple          119
					k = i1;
		//   62  116:iload           5
		//   63  118:istore_3        
			}

		//   64  119:iload           4
		//   65  121:iconst_1        
		//   66  122:iadd            
		//   67  123:istore          4
		//*  68  125:goto            76
			if(k1 + k <= j)
		//*  69  128:iload           7
		//*  70  130:iload_3         
		//*  71  131:iadd            
		//*  72  132:iload_2         
		//*  73  133:icmpgt          138
				return k;
		//   74  136:iload_3         
		//   75  137:ireturn         
			else
				return 0;
		//   76  138:iconst_0        
		//   77  139:ireturn         
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
		j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		int k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		byte byte0;
		if(flag)
	//*   4    6:iload           5
	//*   5    8:ifeq            22
		{
			byte0 = 1;
	//    6   11:iconst_1        
	//    7   12:istore          6
			j = i;
	//    8   14:iload_3         
	//    9   15:istore          4
			i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		} else
	//*  12   19:goto            29
		{
			i--;
	//   13   22:iload_3         
	//   14   23:iconst_1        
	//   15   24:isub            
	//   16   25:istore_3        
			byte0 = -1;
	//   17   26:iconst_m1       
	//   18   27:istore          6
		}
		for(; i != j; i += ((int) (byte0)))
	//*  19   29:iload_3         
	//*  20   30:iload           4
	//*  21   32:icmpeq          95
		{
			View view = mSet[i];
	//   22   35:aload_0         
	//   23   36:getfield        #87  <Field View[] mSet>
	//   24   39:iload_3         
	//   25   40:aaload          
	//   26   41:astore          8
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   27   43:aload           8
	//   28   45:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   48:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   30   51:astore          9
			layoutparams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
	//   31   53:aload           9
	//   32   55:aload_0         
	//   33   56:aload_1         
	//   34   57:aload_2         
	//   35   58:aload_0         
	//   36   59:aload           8
	//   37   61:invokevirtual   #97  <Method int getPosition(View)>
	//   38   64:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   39   67:putfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
			layoutparams.mSpanIndex = k;
	//   40   70:aload           9
	//   41   72:iload           7
	//   42   74:putfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
			k += layoutparams.mSpanSize;
	//   43   77:iload           7
	//   44   79:aload           9
	//   45   81:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   46   84:iadd            
	//   47   85:istore          7
		}

	//   48   87:iload_3         
	//   49   88:iload           6
	//   50   90:iadd            
	//   51   91:istore_3        
	//*  52   92:goto            29
	//   53   95:return          
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
	//   12   19:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   13   22:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   14   25:istore          5
		if(i != 0)
	//*  15   27:iload           4
	//*  16   29:ifeq            69
		{
			for(; j > 0 && anchorinfo.mPosition > 0; j = getSpanIndex(recycler, state, anchorinfo.mPosition))
	//*  17   32:iload           5
	//*  18   34:ifle            130
	//*  19   37:aload_3         
	//*  20   38:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  21   41:ifle            130
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
	//   34   64:istore          5
		} else
	//*  35   66:goto            32
		{
			int i1 = state.getItemCount();
	//   36   69:aload_2         
	//   37   70:invokevirtual   #152 <Method int RecyclerView$State.getItemCount()>
	//   38   73:istore          8
			i = anchorinfo.mPosition;
	//   39   75:aload_3         
	//   40   76:getfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
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
	//   55  101:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
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
	//   67  127:putfield        #145 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		}
	//   68  130:return          
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
	//*  16   30:icmpne          66
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   17   33:new             #169 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #170 <Method void StringBuilder()>
	//   20   40:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. ");
	//   21   41:aload_1         
	//   22   42:ldc1            #172 <String "Cannot find span size for pre layout position. ">
	//   23   44:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (recycler)).append(i);
	//   25   48:aload_1         
	//   26   49:iload_3         
	//   27   50:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   29   54:ldc1            #23  <String "GridLayoutManager">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   32   60:invokestatic    #189 <Method int Log.w(String, String)>
	//   33   63:pop             
			return 0;
	//   34   64:iconst_0        
	//   35   65:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanGroupIndex(j, mSpanCount);
	//   36   66:aload_0         
	//   37   67:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   38   70:iload           4
	//   39   72:aload_0         
	//   40   73:getfield        #45  <Field int mSpanCount>
	//   41   76:invokevirtual   #161 <Method int GridLayoutManager$SpanSizeLookup.getSpanGroupIndex(int, int)>
	//   42   79:ireturn         
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
	//*  27   50:icmpne          86
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   28   53:new             #169 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:invokespecial   #170 <Method void StringBuilder()>
	//   31   60:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   32   61:aload_1         
	//   33   62:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   34   64:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (recycler)).append(i);
	//   36   68:aload_1         
	//   37   69:iload_3         
	//   38   70:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   39   73:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   40   74:ldc1            #23  <String "GridLayoutManager">
	//   41   76:aload_1         
	//   42   77:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   43   80:invokestatic    #189 <Method int Log.w(String, String)>
	//   44   83:pop             
			return 0;
	//   45   84:iconst_0        
	//   46   85:ireturn         
		} else
		{
			return mSpanSizeLookup.getCachedSpanIndex(j, mSpanCount);
	//   47   86:aload_0         
	//   48   87:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   49   90:iload           4
	//   50   92:aload_0         
	//   51   93:getfield        #45  <Field int mSpanCount>
	//   52   96:invokevirtual   #192 <Method int GridLayoutManager$SpanSizeLookup.getCachedSpanIndex(int, int)>
	//   53   99:ireturn         
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
	//*  25   46:icmpne          82
		{
			recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   26   49:new             #169 <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #170 <Method void StringBuilder()>
	//   29   56:astore_1        
			((StringBuilder) (recycler)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   30   57:aload_1         
	//   31   58:ldc1            #197 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   32   60:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			((StringBuilder) (recycler)).append(i);
	//   34   64:aload_1         
	//   35   65:iload_3         
	//   36   66:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   37   69:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (recycler)).toString());
	//   38   70:ldc1            #23  <String "GridLayoutManager">
	//   39   72:aload_1         
	//   40   73:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   41   76:invokestatic    #189 <Method int Log.w(String, String)>
	//   42   79:pop             
			return 1;
	//   43   80:iconst_1        
	//   44   81:ireturn         
		} else
		{
			return mSpanSizeLookup.getSpanSize(j);
	//   45   82:aload_0         
	//   46   83:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   47   86:iload           4
	//   48   88:invokevirtual   #199 <Method int GridLayoutManager$SpanSizeLookup.getSpanSize(int)>
	//   49   91:ireturn         
		}
	}

	private void guessMeasurement(float f, int i)
	{
		calculateItemBorders(Math.max(Math.round(f * (float)mSpanCount), i));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field int mSpanCount>
	//    4    6:i2f             
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
	//*  41   87:icmpne          132
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
	//*  61  129:goto            171
		{
			i = getChildMeasureSpec(l, i, k, layoutparams.height, false);
	//   62  132:iload           6
	//   63  134:iload_2         
	//   64  135:iload           5
	//   65  137:aload           7
	//   66  139:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//   67  142:iconst_0        
	//   68  143:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   69  146:istore_2        
			j = getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), j, layoutparams.width, true);
	//   70  147:aload_0         
	//   71  148:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//   72  151:invokevirtual   #261 <Method int OrientationHelper.getTotalSpace()>
	//   73  154:aload_0         
	//   74  155:invokevirtual   #270 <Method int getWidthMode()>
	//   75  158:iload           4
	//   76  160:aload           7
	//   77  162:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//   78  165:iconst_1        
	//   79  166:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   80  169:istore          4
		}
		measureChildWithDecorationsAndMargin(view, j, i, flag);
	//   81  171:aload_0         
	//   82  172:aload_1         
	//   83  173:iload           4
	//   84  175:iload_2         
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
		int l = mOrientationHelper.getStartAfterPadding();
	//    2    4:aload_0         
	//    3    5:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #340 <Method int OrientationHelper.getStartAfterPadding()>
	//    5   11:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//    6   13:aload_0         
	//    7   14:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    8   17:invokevirtual   #343 <Method int OrientationHelper.getEndAfterPadding()>
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
	//   27   51:invokevirtual   #116 <Method View getChildAt(int)>
	//   28   54:astore          14
			int j1 = getPosition(view4);
	//   29   56:aload_0         
	//   30   57:aload           14
	//   31   59:invokevirtual   #97  <Method int getPosition(View)>
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
	//*  50   97:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
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
	//*  58  116:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  59  119:checkcast       #276 <Class RecyclerView$LayoutParams>
	//*  60  122:invokevirtual   #346 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
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
	//*  74  153:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  75  156:aload           14
	//*  76  158:invokevirtual   #349 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  77  161:iload           8
	//*  78  163:icmpge          186
	//*  79  166:aload_0         
	//*  80  167:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//*  81  170:aload           14
	//*  82  172:invokevirtual   #352 <Method int OrientationHelper.getDecoratedEnd(View)>
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
			return mCachedBorders[j + i] - mCachedBorders[i];
	//   25   41:aload_0         
	//   26   42:getfield        #131 <Field int[] mCachedBorders>
	//   27   45:iload_2         
	//   28   46:iload_1         
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
		int j4 = mOrientationHelper.getModeInOther();
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #386 <Method int OrientationHelper.getModeInOther()>
	//    3    7:istore          15
		boolean flag;
		if(j4 != 0x40000000)
	//*   4    9:iload           15
	//*   5   11:ldc2            #387 <Int 0x40000000>
	//*   6   14:icmpeq          23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          10
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          10
		int k1;
		if(getChildCount() > 0)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #112 <Method int getChildCount()>
	//*  14   30:ifle            47
			k1 = mCachedBorders[mSpanCount];
	//   15   33:aload_0         
	//   16   34:getfield        #131 <Field int[] mCachedBorders>
	//   17   37:aload_0         
	//   18   38:getfield        #45  <Field int mSpanCount>
	//   19   41:iaload          
	//   20   42:istore          11
		else
	//*  21   44:goto            50
			k1 = 0;
	//   22   47:iconst_0        
	//   23   48:istore          11
		if(flag)
	//*  24   50:iload           10
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
		int i = mSpanCount;
	//   37   76:aload_0         
	//   38   77:getfield        #45  <Field int mSpanCount>
	//   39   80:istore          8
		if(!flag2)
	//*  40   82:iload           16
	//*  41   84:ifne            110
			i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:aload_2         
	//   45   90:aload_3         
	//   46   91:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   47   94:invokespecial   #147 <Method int getSpanIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:aload_2         
	//   51  100:aload_3         
	//   52  101:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   53  104:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   54  107:iadd            
	//   55  108:istore          8
		int j = 0;
	//   56  110:iconst_0        
	//   57  111:istore          9
		int l1 = 0;
	//   58  113:iconst_0        
	//   59  114:istore          12
		do
		{
			if(l1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0)
				break;
	//   60  116:iload           12
	//   61  118:aload_0         
	//   62  119:getfield        #45  <Field int mSpanCount>
	//   63  122:icmpge          293
	//   64  125:aload_3         
	//   65  126:aload_2         
	//   66  127:invokevirtual   #318 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   67  130:ifeq            293
	//   68  133:iload           8
	//   69  135:ifle            293
			int i3 = layoutstate.mCurrentPosition;
	//   70  138:aload_3         
	//   71  139:getfield        #321 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//   72  142:istore          14
			int i2 = getSpanSize(recycler, state, i3);
	//   73  144:aload_0         
	//   74  145:aload_1         
	//   75  146:aload_2         
	//   76  147:iload           14
	//   77  149:invokespecial   #101 <Method int getSpanSize(RecyclerView$Recycler, RecyclerView$State, int)>
	//   78  152:istore          13
			if(i2 > mSpanCount)
	//*  79  154:iload           13
	//*  80  156:aload_0         
	//*  81  157:getfield        #45  <Field int mSpanCount>
	//*  82  160:icmple          238
			{
				recycler = ((RecyclerView.Recycler) (new StringBuilder()));
	//   83  163:new             #169 <Class StringBuilder>
	//   84  166:dup             
	//   85  167:invokespecial   #170 <Method void StringBuilder()>
	//   86  170:astore_1        
				((StringBuilder) (recycler)).append("Item at position ");
	//   87  171:aload_1         
	//   88  172:ldc2            #391 <String "Item at position ">
	//   89  175:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   90  178:pop             
				((StringBuilder) (recycler)).append(i3);
	//   91  179:aload_1         
	//   92  180:iload           14
	//   93  182:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   94  185:pop             
				((StringBuilder) (recycler)).append(" requires ");
	//   95  186:aload_1         
	//   96  187:ldc2            #393 <String " requires ">
	//   97  190:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   98  193:pop             
				((StringBuilder) (recycler)).append(i2);
	//   99  194:aload_1         
	//  100  195:iload           13
	//  101  197:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  102  200:pop             
				((StringBuilder) (recycler)).append(" spans but GridLayoutManager has only ");
	//  103  201:aload_1         
	//  104  202:ldc2            #395 <String " spans but GridLayoutManager has only ">
	//  105  205:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  106  208:pop             
				((StringBuilder) (recycler)).append(mSpanCount);
	//  107  209:aload_1         
	//  108  210:aload_0         
	//  109  211:getfield        #45  <Field int mSpanCount>
	//  110  214:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//  111  217:pop             
				((StringBuilder) (recycler)).append(" spans.");
	//  112  218:aload_1         
	//  113  219:ldc2            #397 <String " spans.">
	//  114  222:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//  115  225:pop             
				throw new IllegalArgumentException(((StringBuilder) (recycler)).toString());
	//  116  226:new             #399 <Class IllegalArgumentException>
	//  117  229:dup             
	//  118  230:aload_1         
	//  119  231:invokevirtual   #183 <Method String StringBuilder.toString()>
	//  120  234:invokespecial   #402 <Method void IllegalArgumentException(String)>
	//  121  237:athrow          
			}
			i -= i2;
	//  122  238:iload           8
	//  123  240:iload           13
	//  124  242:isub            
	//  125  243:istore          8
			if(i < 0)
	//* 126  245:iload           8
	//* 127  247:ifge            253
				break;
	//  128  250:goto            293
			View view = layoutstate.next(recycler);
	//  129  253:aload_3         
	//  130  254:aload_1         
	//  131  255:invokevirtual   #406 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//  132  258:astore          17
			if(view == null)
	//* 133  260:aload           17
	//* 134  262:ifnonnull       268
				break;
	//  135  265:goto            293
			j += i2;
	//  136  268:iload           9
	//  137  270:iload           13
	//  138  272:iadd            
	//  139  273:istore          9
			mSet[l1] = view;
	//  140  275:aload_0         
	//  141  276:getfield        #87  <Field View[] mSet>
	//  142  279:iload           12
	//  143  281:aload           17
	//  144  283:aastore         
			l1++;
	//  145  284:iload           12
	//  146  286:iconst_1        
	//  147  287:iadd            
	//  148  288:istore          12
		} while(true);
	//  149  290:goto            116
		if(l1 == 0)
	//* 150  293:iload           12
	//* 151  295:ifne            305
		{
			layoutchunkresult.mFinished = true;
	//  152  298:aload           4
	//  153  300:iconst_1        
	//  154  301:putfield        #411 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//  155  304:return          
		}
		float f = 0.0F;
	//  156  305:fconst_0        
	//  157  306:fstore          5
		assignSpans(recycler, state, l1, j, flag2);
	//  158  308:aload_0         
	//  159  309:aload_1         
	//  160  310:aload_2         
	//  161  311:iload           12
	//  162  313:iload           9
	//  163  315:iload           16
	//  164  317:invokespecial   #413 <Method void assignSpans(RecyclerView$Recycler, RecyclerView$State, int, int, boolean)>
		j = 0;
	//  165  320:iconst_0        
	//  166  321:istore          9
		i = 0;
	//  167  323:iconst_0        
	//  168  324:istore          8
		while(j < l1) 
	//* 169  326:iload           9
	//* 170  328:iload           12
	//* 171  330:icmpge          491
		{
			recycler = ((RecyclerView.Recycler) (mSet[j]));
	//  172  333:aload_0         
	//  173  334:getfield        #87  <Field View[] mSet>
	//  174  337:iload           9
	//  175  339:aaload          
	//  176  340:astore_1        
			if(layoutstate.mScrapList == null)
	//* 177  341:aload_3         
	//* 178  342:getfield        #417 <Field java.util.List LinearLayoutManager$LayoutState.mScrapList>
	//* 179  345:ifnonnull       370
			{
				if(flag2)
	//* 180  348:iload           16
	//* 181  350:ifeq            361
					addView(((View) (recycler)));
	//  182  353:aload_0         
	//  183  354:aload_1         
	//  184  355:invokevirtual   #421 <Method void addView(View)>
				else
	//* 185  358:goto            389
					addView(((View) (recycler)), 0);
	//  186  361:aload_0         
	//  187  362:aload_1         
	//  188  363:iconst_0        
	//  189  364:invokevirtual   #424 <Method void addView(View, int)>
			} else
	//* 190  367:goto            389
			if(flag2)
	//* 191  370:iload           16
	//* 192  372:ifeq            383
				addDisappearingView(((View) (recycler)));
	//  193  375:aload_0         
	//  194  376:aload_1         
	//  195  377:invokevirtual   #427 <Method void addDisappearingView(View)>
			else
	//* 196  380:goto            389
				addDisappearingView(((View) (recycler)), 0);
	//  197  383:aload_0         
	//  198  384:aload_1         
	//  199  385:iconst_0        
	//  200  386:invokevirtual   #429 <Method void addDisappearingView(View, int)>
			calculateItemDecorationsForChild(((View) (recycler)), mDecorInsets);
	//  201  389:aload_0         
	//  202  390:aload_1         
	//  203  391:aload_0         
	//  204  392:getfield        #62  <Field Rect mDecorInsets>
	//  205  395:invokevirtual   #433 <Method void calculateItemDecorationsForChild(View, Rect)>
			measureChild(((View) (recycler)), j4, false);
	//  206  398:aload_0         
	//  207  399:aload_1         
	//  208  400:iload           15
	//  209  402:iconst_0        
	//  210  403:invokespecial   #435 <Method void measureChild(View, int, boolean)>
			int j3 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  211  406:aload_0         
	//  212  407:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  213  410:aload_1         
	//  214  411:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  215  414:istore          14
			int j2 = i;
	//  216  416:iload           8
	//  217  418:istore          13
			if(j3 > i)
	//* 218  420:iload           14
	//* 219  422:iload           8
	//* 220  424:icmple          431
				j2 = j3;
	//  221  427:iload           14
	//  222  429:istore          13
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  223  431:aload_1         
	//  224  432:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  225  435:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  226  438:astore_2        
			float f2 = (1.0F * (float)mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)))) / (float)((LayoutParams) (state)).mSpanSize;
	//  227  439:fconst_1        
	//  228  440:aload_0         
	//  229  441:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  230  444:aload_1         
	//  231  445:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  232  448:i2f             
	//  233  449:fmul            
	//  234  450:aload_2         
	//  235  451:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  236  454:i2f             
	//  237  455:fdiv            
	//  238  456:fstore          7
			float f1 = f;
	//  239  458:fload           5
	//  240  460:fstore          6
			if(f2 > f)
	//* 241  462:fload           7
	//* 242  464:fload           5
	//* 243  466:fcmpl           
	//* 244  467:ifle            474
				f1 = f2;
	//  245  470:fload           7
	//  246  472:fstore          6
			j++;
	//  247  474:iload           9
	//  248  476:iconst_1        
	//  249  477:iadd            
	//  250  478:istore          9
			i = j2;
	//  251  480:iload           13
	//  252  482:istore          8
			f = f1;
	//  253  484:fload           6
	//  254  486:fstore          5
		}
	//* 255  488:goto            326
		j = i;
	//  256  491:iload           8
	//  257  493:istore          9
		if(flag)
	//* 258  495:iload           10
	//* 259  497:ifeq            580
		{
			guessMeasurement(f, k1);
	//  260  500:aload_0         
	//  261  501:fload           5
	//  262  503:iload           11
	//  263  505:invokespecial   #443 <Method void guessMeasurement(float, int)>
			int k = 0;
	//  264  508:iconst_0        
	//  265  509:istore          10
			i = 0;
	//  266  511:iconst_0        
	//  267  512:istore          8
			do
			{
				j = i;
	//  268  514:iload           8
	//  269  516:istore          9
				if(k >= l1)
					break;
	//  270  518:iload           10
	//  271  520:iload           12
	//  272  522:icmpge          580
				recycler = ((RecyclerView.Recycler) (mSet[k]));
	//  273  525:aload_0         
	//  274  526:getfield        #87  <Field View[] mSet>
	//  275  529:iload           10
	//  276  531:aaload          
	//  277  532:astore_1        
				measureChild(((View) (recycler)), 0x40000000, true);
	//  278  533:aload_0         
	//  279  534:aload_1         
	//  280  535:ldc2            #387 <Int 0x40000000>
	//  281  538:iconst_1        
	//  282  539:invokespecial   #435 <Method void measureChild(View, int, boolean)>
				k1 = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//  283  542:aload_0         
	//  284  543:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  285  546:aload_1         
	//  286  547:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  287  550:istore          11
				j = i;
	//  288  552:iload           8
	//  289  554:istore          9
				if(k1 > i)
	//* 290  556:iload           11
	//* 291  558:iload           8
	//* 292  560:icmple          567
					j = k1;
	//  293  563:iload           11
	//  294  565:istore          9
				k++;
	//  295  567:iload           10
	//  296  569:iconst_1        
	//  297  570:iadd            
	//  298  571:istore          10
				i = j;
	//  299  573:iload           9
	//  300  575:istore          8
			} while(true);
	//  301  577:goto            514
		}
		for(i = 0; i < l1; i++)
	//* 302  580:iconst_0        
	//* 303  581:istore          8
	//* 304  583:iload           8
	//* 305  585:iload           12
	//* 306  587:icmpge          778
		{
			recycler = ((RecyclerView.Recycler) (mSet[i]));
	//  307  590:aload_0         
	//  308  591:getfield        #87  <Field View[] mSet>
	//  309  594:iload           8
	//  310  596:aaload          
	//  311  597:astore_1        
			if(mOrientationHelper.getDecoratedMeasurement(((View) (recycler))) == j)
				continue;
	//  312  598:aload_0         
	//  313  599:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  314  602:aload_1         
	//  315  603:invokevirtual   #438 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  316  606:iload           9
	//  317  608:icmpeq          769
			state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  318  611:aload_1         
	//  319  612:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  320  615:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  321  618:astore_2        
			Rect rect = ((LayoutParams) (state)).mDecorInsets;
	//  322  619:aload_2         
	//  323  620:getfield        #215 <Field Rect GridLayoutManager$LayoutParams.mDecorInsets>
	//  324  623:astore          17
			k1 = rect.top + rect.bottom + ((LayoutParams) (state)).topMargin + ((LayoutParams) (state)).bottomMargin;
	//  325  625:aload           17
	//  326  627:getfield        #218 <Field int Rect.top>
	//  327  630:aload           17
	//  328  632:getfield        #221 <Field int Rect.bottom>
	//  329  635:iadd            
	//  330  636:aload_2         
	//  331  637:getfield        #224 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  332  640:iadd            
	//  333  641:aload_2         
	//  334  642:getfield        #227 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  335  645:iadd            
	//  336  646:istore          11
			int l = rect.left + rect.right + ((LayoutParams) (state)).leftMargin + ((LayoutParams) (state)).rightMargin;
	//  337  648:aload           17
	//  338  650:getfield        #230 <Field int Rect.left>
	//  339  653:aload           17
	//  340  655:getfield        #233 <Field int Rect.right>
	//  341  658:iadd            
	//  342  659:aload_2         
	//  343  660:getfield        #236 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  344  663:iadd            
	//  345  664:aload_2         
	//  346  665:getfield        #239 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  347  668:iadd            
	//  348  669:istore          10
			int k2 = getSpaceForSpanRange(((LayoutParams) (state)).mSpanIndex, ((LayoutParams) (state)).mSpanSize);
	//  349  671:aload_0         
	//  350  672:aload_2         
	//  351  673:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  352  676:aload_2         
	//  353  677:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  354  680:invokevirtual   #242 <Method int getSpaceForSpanRange(int, int)>
	//  355  683:istore          13
			if(mOrientation == 1)
	//* 356  685:aload_0         
	//* 357  686:getfield        #245 <Field int mOrientation>
	//* 358  689:iconst_1        
	//* 359  690:icmpne          726
			{
				l = getChildMeasureSpec(k2, 0x40000000, l, ((LayoutParams) (state)).width, false);
	//  360  693:iload           13
	//  361  695:ldc2            #387 <Int 0x40000000>
	//  362  698:iload           10
	//  363  700:aload_2         
	//  364  701:getfield        #248 <Field int GridLayoutManager$LayoutParams.width>
	//  365  704:iconst_0        
	//  366  705:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  367  708:istore          10
				k1 = android.view.View.MeasureSpec.makeMeasureSpec(j - k1, 0x40000000);
	//  368  710:iload           9
	//  369  712:iload           11
	//  370  714:isub            
	//  371  715:ldc2            #387 <Int 0x40000000>
	//  372  718:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  373  721:istore          11
			} else
	//* 374  723:goto            756
			{
				l = android.view.View.MeasureSpec.makeMeasureSpec(j - l, 0x40000000);
	//  375  726:iload           9
	//  376  728:iload           10
	//  377  730:isub            
	//  378  731:ldc2            #387 <Int 0x40000000>
	//  379  734:invokestatic    #448 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  380  737:istore          10
				k1 = getChildMeasureSpec(k2, 0x40000000, k1, ((LayoutParams) (state)).height, false);
	//  381  739:iload           13
	//  382  741:ldc2            #387 <Int 0x40000000>
	//  383  744:iload           11
	//  384  746:aload_2         
	//  385  747:getfield        #267 <Field int GridLayoutManager$LayoutParams.height>
	//  386  750:iconst_0        
	//  387  751:invokestatic    #252 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  388  754:istore          11
			}
			measureChildWithDecorationsAndMargin(((View) (recycler)), l, k1, true);
	//  389  756:aload_0         
	//  390  757:aload_1         
	//  391  758:iload           10
	//  392  760:iload           11
	//  393  762:iconst_1        
	//  394  763:invokespecial   #274 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
		}

	//  395  766:goto            769
	//  396  769:iload           8
	//  397  771:iconst_1        
	//  398  772:iadd            
	//  399  773:istore          8
	//* 400  775:goto            583
		boolean flag1 = false;
	//  401  778:iconst_0        
	//  402  779:istore          14
		layoutchunkresult.mConsumed = j;
	//  403  781:aload           4
	//  404  783:iload           9
	//  405  785:putfield        #451 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		int j1;
		int l2;
		if(mOrientation == 1)
	//* 406  788:aload_0         
	//* 407  789:getfield        #245 <Field int mOrientation>
	//* 408  792:iconst_1        
	//* 409  793:icmpne          863
		{
			if(layoutstate.mLayoutDirection == -1)
	//* 410  796:aload_3         
	//* 411  797:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 412  800:iconst_m1       
	//* 413  801:icmpne          843
			{
				int i1 = layoutstate.mOffset;
	//  414  804:aload_3         
	//  415  805:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  416  808:istore          10
				i = i1;
	//  417  810:iload           10
	//  418  812:istore          8
				i1 -= j;
	//  419  814:iload           10
	//  420  816:iload           9
	//  421  818:isub            
	//  422  819:istore          10
				j = i;
	//  423  821:iload           8
	//  424  823:istore          9
				i = i1;
	//  425  825:iload           10
	//  426  827:istore          8
			} else
	//* 427  829:iconst_0        
	//* 428  830:istore          10
	//* 429  832:iload           10
	//* 430  834:istore          11
	//* 431  836:iload           14
	//* 432  838:istore          13
	//* 433  840:goto            930
			{
				j1 = layoutstate.mOffset;
	//  434  843:aload_3         
	//  435  844:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  436  847:istore          10
				i = j1;
	//  437  849:iload           10
	//  438  851:istore          8
				j += j1;
	//  439  853:iload           9
	//  440  855:iload           10
	//  441  857:iadd            
	//  442  858:istore          9
			}
			j1 = 0;
			k1 = j1;
			l2 = ((int) (flag1));
		} else
	//* 443  860:goto            829
		if(layoutstate.mLayoutDirection == -1)
	//* 444  863:aload_3         
	//* 445  864:getfield        #454 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 446  867:iconst_m1       
	//* 447  868:icmpne          906
		{
			j1 = layoutstate.mOffset;
	//  448  871:aload_3         
	//  449  872:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  450  875:istore          10
			i = 0;
	//  451  877:iconst_0        
	//  452  878:istore          8
			l2 = i;
	//  453  880:iload           8
	//  454  882:istore          13
			k1 = j1;
	//  455  884:iload           10
	//  456  886:istore          11
			j1 -= j;
	//  457  888:iload           10
	//  458  890:iload           9
	//  459  892:isub            
	//  460  893:istore          10
			j = l2;
	//  461  895:iload           13
	//  462  897:istore          9
			l2 = ((int) (flag1));
	//  463  899:iload           14
	//  464  901:istore          13
		} else
	//* 465  903:goto            930
		{
			j1 = layoutstate.mOffset;
	//  466  906:aload_3         
	//  467  907:getfield        #457 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  468  910:istore          10
			k1 = j + j1;
	//  469  912:iload           9
	//  470  914:iload           10
	//  471  916:iadd            
	//  472  917:istore          11
			i = 0;
	//  473  919:iconst_0        
	//  474  920:istore          8
			j = i;
	//  475  922:iload           8
	//  476  924:istore          9
			l2 = ((int) (flag1));
	//  477  926:iload           14
	//  478  928:istore          13
		}
		int i4;
		for(; l2 < l1; l2 = i4)
	//* 479  930:iload           13
	//* 480  932:iload           12
	//* 481  934:icmpge          1159
		{
label0:
			{
				recycler = ((RecyclerView.Recycler) (mSet[l2]));
	//  482  937:aload_0         
	//  483  938:getfield        #87  <Field View[] mSet>
	//  484  941:iload           13
	//  485  943:aaload          
	//  486  944:astore_1        
				state = ((RecyclerView.State) ((LayoutParams)((View) (recycler)).getLayoutParams()));
	//  487  945:aload_1         
	//  488  946:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  489  949:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  490  952:astore_2        
				if(mOrientation == 1)
	//* 491  953:aload_0         
	//* 492  954:getfield        #245 <Field int mOrientation>
	//* 493  957:iconst_1        
	//* 494  958:icmpne          1045
				{
					if(isLayoutRTL())
	//* 495  961:aload_0         
	//* 496  962:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//* 497  965:ifeq            1013
					{
						k1 = getPaddingLeft() + mCachedBorders[mSpanCount - ((LayoutParams) (state)).mSpanIndex];
	//  498  968:aload_0         
	//  499  969:invokevirtual   #299 <Method int getPaddingLeft()>
	//  500  972:aload_0         
	//  501  973:getfield        #131 <Field int[] mCachedBorders>
	//  502  976:aload_0         
	//  503  977:getfield        #45  <Field int mSpanCount>
	//  504  980:aload_2         
	//  505  981:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  506  984:isub            
	//  507  985:iaload          
	//  508  986:iadd            
	//  509  987:istore          11
						int k3 = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  510  989:aload_0         
	//  511  990:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  512  993:aload_1         
	//  513  994:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  514  997:istore          14
						j1 = k1;
	//  515  999:iload           11
	//  516 1001:istore          10
						k1 -= k3;
	//  517 1003:iload           11
	//  518 1005:iload           14
	//  519 1007:isub            
	//  520 1008:istore          11
						break label0;
	//  521 1010:goto            1086
					}
					j1 = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  522 1013:aload_0         
	//  523 1014:invokevirtual   #299 <Method int getPaddingLeft()>
	//  524 1017:aload_0         
	//  525 1018:getfield        #131 <Field int[] mCachedBorders>
	//  526 1021:aload_2         
	//  527 1022:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  528 1025:iaload          
	//  529 1026:iadd            
	//  530 1027:istore          10
					k1 = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + j1;
	//  531 1029:aload_0         
	//  532 1030:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  533 1033:aload_1         
	//  534 1034:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  535 1037:iload           10
	//  536 1039:iadd            
	//  537 1040:istore          11
				} else
	//* 538 1042:goto            1074
				{
					i = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
	//  539 1045:aload_0         
	//  540 1046:invokevirtual   #308 <Method int getPaddingTop()>
	//  541 1049:aload_0         
	//  542 1050:getfield        #131 <Field int[] mCachedBorders>
	//  543 1053:aload_2         
	//  544 1054:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  545 1057:iaload          
	//  546 1058:iadd            
	//  547 1059:istore          8
					j = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + i;
	//  548 1061:aload_0         
	//  549 1062:getfield        #256 <Field OrientationHelper mOrientationHelper>
	//  550 1065:aload_1         
	//  551 1066:invokevirtual   #441 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  552 1069:iload           8
	//  553 1071:iadd            
	//  554 1072:istore          9
				}
				int l3 = j1;
	//  555 1074:iload           10
	//  556 1076:istore          14
				j1 = k1;
	//  557 1078:iload           11
	//  558 1080:istore          10
				k1 = l3;
	//  559 1082:iload           14
	//  560 1084:istore          11
			}
			layoutDecoratedWithMargins(((View) (recycler)), k1, i, j1, j);
	//  561 1086:aload_0         
	//  562 1087:aload_1         
	//  563 1088:iload           11
	//  564 1090:iload           8
	//  565 1092:iload           10
	//  566 1094:iload           9
	//  567 1096:invokevirtual   #461 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			if(((LayoutParams) (state)).isItemRemoved() || ((LayoutParams) (state)).isItemChanged())
	//* 568 1099:aload_2         
	//* 569 1100:invokevirtual   #462 <Method boolean GridLayoutManager$LayoutParams.isItemRemoved()>
	//* 570 1103:ifne            1113
	//* 571 1106:aload_2         
	//* 572 1107:invokevirtual   #465 <Method boolean GridLayoutManager$LayoutParams.isItemChanged()>
	//* 573 1110:ifeq            1119
				layoutchunkresult.mIgnoreConsumed = true;
	//  574 1113:aload           4
	//  575 1115:iconst_1        
	//  576 1116:putfield        #468 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
			layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | ((View) (recycler)).hasFocusable();
	//  577 1119:aload           4
	//  578 1121:aload           4
	//  579 1123:getfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  580 1126:aload_1         
	//  581 1127:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//  582 1130:ior             
	//  583 1131:putfield        #471 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
			i4 = l2 + 1;
	//  584 1134:iload           13
	//  585 1136:iconst_1        
	//  586 1137:iadd            
	//  587 1138:istore          14
			l2 = j1;
	//  588 1140:iload           10
	//  589 1142:istore          13
			j1 = k1;
	//  590 1144:iload           11
	//  591 1146:istore          10
			k1 = l2;
	//  592 1148:iload           13
	//  593 1150:istore          11
		}

	//  594 1152:iload           14
	//  595 1154:istore          13
	//* 596 1156:goto            930
		Arrays.fill(((Object []) (mSet)), ((Object) (null)));
	//  597 1159:aload_0         
	//  598 1160:getfield        #87  <Field View[] mSet>
	//  599 1163:aconst_null     
	//  600 1164:invokestatic    #480 <Method void Arrays.fill(Object[], Object)>
	//  601 1167:return          
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
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i3;
		int j3;
		int k3;
		View view1;
		View view2;
		view2 = findContainingItemView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method View findContainingItemView(View)>
	//    3    5:astore          22
		view1 = null;
	//    4    7:aconst_null     
	//    5    8:astore          21
		if(view2 == null)
	//*   6   10:aload           22
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		LayoutParams layoutparams = (LayoutParams)view2.getLayoutParams();
	//   10   17:aload           22
	//   11   19:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   22:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//   13   25:astore          23
		i3 = layoutparams.mSpanIndex;
	//   14   27:aload           23
	//   15   29:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   16   32:istore          14
		j3 = layoutparams.mSpanIndex + layoutparams.mSpanSize;
	//   17   34:aload           23
	//   18   36:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//   19   39:aload           23
	//   20   41:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//   21   44:iadd            
	//   22   45:istore          15
		if(super.onFocusSearchFailed(view, i, recycler, state) == null)
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:iload_2         
	//*  26   50:aload_3         
	//*  27   51:aload           4
	//*  28   53:invokespecial   #495 <Method View LinearLayoutManager.onFocusSearchFailed(View, int, RecyclerView$Recycler, RecyclerView$State)>
	//*  29   56:ifnonnull       61
			return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		boolean flag;
		if(convertFocusDirectionToLayoutDirection(i) == 1)
	//*  32   61:aload_0         
	//*  33   62:iload_2         
	//*  34   63:invokevirtual   #498 <Method int convertFocusDirectionToLayoutDirection(int)>
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
	//*  44   82:getfield        #501 <Field boolean mShouldReverseLayout>
	//*  45   85:icmpeq          93
			i = 1;
	//   46   88:iconst_1        
	//   47   89:istore_2        
		else
	//*  48   90:goto            95
			i = 0;
	//   49   93:iconst_0        
	//   50   94:istore_2        
		if(i != 0)
	//*  51   95:iload_2         
	//*  52   96:ifeq            117
		{
			l = getChildCount() - 1;
	//   53   99:aload_0         
	//   54  100:invokevirtual   #112 <Method int getChildCount()>
	//   55  103:iconst_1        
	//   56  104:isub            
	//   57  105:istore          7
			j = -1;
	//   58  107:iconst_m1       
	//   59  108:istore          5
			i1 = j;
	//   60  110:iload           5
	//   61  112:istore          8
		} else
	//*  62  114:goto            129
		{
			j = getChildCount();
	//   63  117:aload_0         
	//   64  118:invokevirtual   #112 <Method int getChildCount()>
	//   65  121:istore          5
			i1 = 1;
	//   66  123:iconst_1        
	//   67  124:istore          8
			l = 0;
	//   68  126:iconst_0        
	//   69  127:istore          7
		}
		if(mOrientation == 1 && isLayoutRTL())
	//*  70  129:aload_0         
	//*  71  130:getfield        #245 <Field int mOrientation>
	//*  72  133:iconst_1        
	//*  73  134:icmpne          150
	//*  74  137:aload_0         
	//*  75  138:invokevirtual   #378 <Method boolean isLayoutRTL()>
	//*  76  141:ifeq            150
			j1 = 1;
	//   77  144:iconst_1        
	//   78  145:istore          9
		else
	//*  79  147:goto            153
			j1 = 0;
	//   80  150:iconst_0        
	//   81  151:istore          9
		k3 = getSpanGroupIndex(recycler, state, l);
	//   82  153:aload_0         
	//   83  154:aload_3         
	//   84  155:aload           4
	//   85  157:iload           7
	//   86  159:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//   87  162:istore          16
		byte byte0 = -1;
	//   88  164:iconst_m1       
	//   89  165:istore          12
		k = ((int) (byte0));
	//   90  167:iload           12
	//   91  169:istore          6
		l1 = 0;
	//   92  171:iconst_0        
	//   93  172:istore          11
		i = 0;
	//   94  174:iconst_0        
	//   95  175:istore_2        
		view = null;
	//   96  176:aconst_null     
	//   97  177:astore_1        
		k1 = j;
	//   98  178:iload           5
	//   99  180:istore          10
		j = ((int) (byte0));
	//  100  182:iload           12
	//  101  184:istore          5
_L9:
		if(l == k1) goto _L2; else goto _L1
	//  102  186:iload           7
	//  103  188:iload           10
	//  104  190:icmpeq          557
_L1:
		int l3;
		int i4;
		View view3;
		LayoutParams layoutparams1;
		int i2 = getSpanGroupIndex(recycler, state, l);
	//  105  193:aload_0         
	//  106  194:aload_3         
	//  107  195:aload           4
	//  108  197:iload           7
	//  109  199:invokespecial   #374 <Method int getSpanGroupIndex(RecyclerView$Recycler, RecyclerView$State, int)>
	//  110  202:istore          12
		view3 = getChildAt(l);
	//  111  204:aload_0         
	//  112  205:iload           7
	//  113  207:invokevirtual   #116 <Method View getChildAt(int)>
	//  114  210:astore          23
		if(view3 == view2)
	//* 115  212:aload           23
	//* 116  214:aload           22
	//* 117  216:if_acmpne       222
			break; /* Loop/switch isn't completed */
	//  118  219:goto            557
		if(view3.hasFocusable() && i2 != k3)
	//* 119  222:aload           23
	//* 120  224:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 121  227:ifeq            248
	//* 122  230:iload           12
	//* 123  232:iload           16
	//* 124  234:icmpeq          248
		{
			if(view1 != null)
	//* 125  237:aload           21
	//* 126  239:ifnull          245
				break; /* Loop/switch isn't completed */
	//  127  242:goto            557
			continue; /* Loop/switch isn't completed */
	//  128  245:goto            547
		}
		layoutparams1 = (LayoutParams)view3.getLayoutParams();
	//  129  248:aload           23
	//  130  250:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  131  253:checkcast       #9   <Class GridLayoutManager$LayoutParams>
	//  132  256:astore          24
		l3 = layoutparams1.mSpanIndex;
	//  133  258:aload           24
	//  134  260:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  135  263:istore          17
		i4 = layoutparams1.mSpanIndex + layoutparams1.mSpanSize;
	//  136  265:aload           24
	//  137  267:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  138  270:aload           24
	//  139  272:getfield        #104 <Field int GridLayoutManager$LayoutParams.mSpanSize>
	//  140  275:iadd            
	//  141  276:istore          18
		if(view3.hasFocusable() && l3 == i3 && i4 == j3)
	//* 142  278:aload           23
	//* 143  280:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 144  283:ifeq            303
	//* 145  286:iload           17
	//* 146  288:iload           14
	//* 147  290:icmpne          303
	//* 148  293:iload           18
	//* 149  295:iload           15
	//* 150  297:icmpne          303
			return view3;
	//  151  300:aload           23
	//  152  302:areturn         
		if((!view3.hasFocusable() || view1 != null) && (view3.hasFocusable() || view != null)) goto _L4; else goto _L3
	//  153  303:aload           23
	//  154  305:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//  155  308:ifeq            316
	//  156  311:aload           21
	//  157  313:ifnull          328
	//  158  316:aload           23
	//  159  318:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//  160  321:ifne            334
	//  161  324:aload_1         
	//  162  325:ifnonnull       334
_L3:
		int j2;
		j2 = 1;
	//  163  328:iconst_1        
	//  164  329:istore          12
		break MISSING_BLOCK_LABEL_468;
	//  165  331:goto            468
_L4:
		int j4;
		j2 = Math.max(l3, i3);
	//  166  334:iload           17
	//  167  336:iload           14
	//  168  338:invokestatic    #210 <Method int Math.max(int, int)>
	//  169  341:istore          12
		j4 = Math.min(i4, j3) - j2;
	//  170  343:iload           18
	//  171  345:iload           15
	//  172  347:invokestatic    #504 <Method int Math.min(int, int)>
	//  173  350:iload           12
	//  174  352:isub            
	//  175  353:istore          19
		if(!view3.hasFocusable())
			break MISSING_BLOCK_LABEL_406;
	//  176  355:aload           23
	//  177  357:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//  178  360:ifeq            406
		if(j4 <= l1) goto _L5; else goto _L3
	//  179  363:iload           19
	//  180  365:iload           11
	//  181  367:icmple          373
	//* 182  370:goto            328
_L5:
		if(j4 != l1)
			break; /* Loop/switch isn't completed */
	//  183  373:iload           19
	//  184  375:iload           11
	//  185  377:icmpne          465
		if(l3 > j)
	//* 186  380:iload           17
	//* 187  382:iload           5
	//* 188  384:icmple          393
			j2 = 1;
	//  189  387:iconst_1        
	//  190  388:istore          12
		else
	//* 191  390:goto            396
			j2 = 0;
	//  192  393:iconst_0        
	//  193  394:istore          12
		if(j1 != j2) goto _L6; else goto _L3
	//  194  396:iload           9
	//  195  398:iload           12
	//  196  400:icmpne          465
_L6:
		break; /* Loop/switch isn't completed */
	//  197  403:goto            328
		int l2;
		if(view1 != null)
			break; /* Loop/switch isn't completed */
	//  198  406:aload           21
	//  199  408:ifnonnull       465
		j2 = 0;
	//  200  411:iconst_0        
	//  201  412:istore          12
		if(!isViewPartiallyVisible(view3, false, true))
			break; /* Loop/switch isn't completed */
	//  202  414:aload_0         
	//  203  415:aload           23
	//  204  417:iconst_0        
	//  205  418:iconst_1        
	//  206  419:invokevirtual   #508 <Method boolean isViewPartiallyVisible(View, boolean, boolean)>
	//  207  422:ifeq            465
		l2 = i;
	//  208  425:iload_2         
	//  209  426:istore          13
		if(j4 <= l2) goto _L7; else goto _L3
	//  210  428:iload           19
	//  211  430:iload           13
	//  212  432:icmple          438
	//* 213  435:goto            328
_L7:
		if(j4 != l2)
			break; /* Loop/switch isn't completed */
	//  214  438:iload           19
	//  215  440:iload           13
	//  216  442:icmpne          465
		if(l3 > k)
	//* 217  445:iload           17
	//* 218  447:iload           6
	//* 219  449:icmple          455
			j2 = 1;
	//  220  452:iconst_1        
	//  221  453:istore          12
		if(j1 != j2) goto _L8; else goto _L3
	//  222  455:iload           9
	//  223  457:iload           12
	//  224  459:icmpne          465
	//* 225  462:goto            328
_L8:
		j2 = 0;
	//  226  465:iconst_0        
	//  227  466:istore          12
		if(j2 == 0)
			continue; /* Loop/switch isn't completed */
	//  228  468:iload           12
	//  229  470:ifeq            547
		if(view3.hasFocusable())
	//* 230  473:aload           23
	//* 231  475:invokevirtual   #474 <Method boolean View.hasFocusable()>
	//* 232  478:ifeq            512
		{
			j = layoutparams1.mSpanIndex;
	//  233  481:aload           24
	//  234  483:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  235  486:istore          5
			l1 = Math.min(i4, j3) - Math.max(l3, i3);
	//  236  488:iload           18
	//  237  490:iload           15
	//  238  492:invokestatic    #504 <Method int Math.min(int, int)>
	//  239  495:iload           17
	//  240  497:iload           14
	//  241  499:invokestatic    #210 <Method int Math.max(int, int)>
	//  242  502:isub            
	//  243  503:istore          11
			view1 = view3;
	//  244  505:aload           23
	//  245  507:astore          21
		} else
	//* 246  509:goto            547
		{
			k = layoutparams1.mSpanIndex;
	//  247  512:aload           24
	//  248  514:getfield        #107 <Field int GridLayoutManager$LayoutParams.mSpanIndex>
	//  249  517:istore          6
			i = Math.min(i4, j3);
	//  250  519:iload           18
	//  251  521:iload           15
	//  252  523:invokestatic    #504 <Method int Math.min(int, int)>
	//  253  526:istore_2        
			int k2 = Math.max(l3, i3);
	//  254  527:iload           17
	//  255  529:iload           14
	//  256  531:invokestatic    #210 <Method int Math.max(int, int)>
	//  257  534:istore          12
			view = view3;
	//  258  536:aload           23
	//  259  538:astore_1        
			i -= k2;
	//  260  539:iload_2         
	//  261  540:iload           12
	//  262  542:isub            
	//  263  543:istore_2        
		}
	//* 264  544:goto            547
		l += i1;
	//  265  547:iload           7
	//  266  549:iload           8
	//  267  551:iadd            
	//  268  552:istore          7
		  goto _L9
	//* 269  554:goto            186
_L2:
		if(view1 != null)
	//* 270  557:aload           21
	//* 271  559:ifnull          565
			view = view1;
	//  272  562:aload           21
	//  273  564:astore_1        
		return view;
	//  274  565:aload_1         
	//  275  566:areturn         
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
	//*  23   41:icmpne          93
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
			k = chooseSize(i, mCachedBorders[mCachedBorders.length - 1] + k, getMinimumWidth());
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
	//   47   83:istore          4
			i = j;
	//   48   85:iload_3         
	//   49   86:istore_2        
			j = k;
	//   50   87:iload           4
	//   51   89:istore_3        
		} else
	//*  52   90:goto            139
		{
			i = chooseSize(i, rect.width() + k, getMinimumWidth());
	//   53   93:iload_2         
	//   54   94:aload_1         
	//   55   95:invokevirtual   #574 <Method int Rect.width()>
	//   56   98:iload           4
	//   57  100:iadd            
	//   58  101:aload_0         
	//   59  102:invokevirtual   #572 <Method int getMinimumWidth()>
	//   60  105:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   61  108:istore_2        
			k = chooseSize(j, mCachedBorders[mCachedBorders.length - 1] + l, getMinimumHeight());
	//   62  109:iload_3         
	//   63  110:aload_0         
	//   64  111:getfield        #131 <Field int[] mCachedBorders>
	//   65  114:aload_0         
	//   66  115:getfield        #131 <Field int[] mCachedBorders>
	//   67  118:arraylength     
	//   68  119:iconst_1        
	//   69  120:isub            
	//   70  121:iaload          
	//   71  122:iload           5
	//   72  124:iadd            
	//   73  125:aload_0         
	//   74  126:invokevirtual   #565 <Method int getMinimumHeight()>
	//   75  129:invokestatic    #569 <Method int chooseSize(int, int, int)>
	//   76  132:istore          4
			j = i;
	//   77  134:iload_2         
	//   78  135:istore_3        
			i = k;
	//   79  136:iload           4
	//   80  138:istore_2        
		}
		setMeasuredDimension(j, i);
	//   81  139:aload_0         
	//   82  140:iload_3         
	//   83  141:iload_2         
	//   84  142:invokevirtual   #576 <Method void setMeasuredDimension(int, int)>
	//   85  145:return          
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
	//*  10   16:icmpge          53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #169 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #170 <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Span count should be at least 1. Provided ");
	//   15   27:aload_2         
	//   16   28:ldc2            #578 <String "Span count should be at least 1. Provided ">
	//   17   31:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(i);
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   22   40:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   41:new             #399 <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #402 <Method void IllegalArgumentException(String)>
	//   28   52:athrow          
		} else
		{
			mSpanCount = i;
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:putfield        #45  <Field int mSpanCount>
			mSpanSizeLookup.invalidateSpanIndexCache();
	//   32   58:aload_0         
	//   33   59:getfield        #57  <Field GridLayoutManager$SpanSizeLookup mSpanSizeLookup>
	//   34   62:invokevirtual   #530 <Method void GridLayoutManager$SpanSizeLookup.invalidateSpanIndexCache()>
			requestLayout();
	//   35   65:aload_0         
	//   36   66:invokevirtual   #581 <Method void requestLayout()>
			return;
	//   37   69:return          
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
