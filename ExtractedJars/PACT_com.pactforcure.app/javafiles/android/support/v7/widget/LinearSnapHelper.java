// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.PointF;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SnapHelper, OrientationHelper

public class LinearSnapHelper extends SnapHelper
{

	public LinearSnapHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void SnapHelper()>
	//    2    4:return          
	}

	private float computeDistancePerChild(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		View view = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		View view2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          12
		int i = 0x7fffffff;
	//    4    6:ldc1            #19  <Int 0x7fffffff>
	//    5    8:istore_3        
		int l = 0x80000000;
	//    6    9:ldc1            #20  <Int 0x80000000>
	//    7   11:istore          5
		int l1 = layoutmanager.getChildCount();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getChildCount()>
	//   10   17:istore          9
		if(l1 == 0)
	//*  11   19:iload           9
	//*  12   21:ifne            26
			return 1.0F;
	//   13   24:fconst_1        
	//   14   25:freturn         
		int i1 = 0;
	//   15   26:iconst_0        
	//   16   27:istore          6
		while(i1 < l1) 
	//*  17   29:iload           6
	//*  18   31:iload           9
	//*  19   33:icmpge          140
		{
			View view1 = layoutmanager.getChildAt(i1);
	//   20   36:aload_1         
	//   21   37:iload           6
	//   22   39:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   23   42:astore          11
			int j1 = layoutmanager.getPosition(view1);
	//   24   44:aload_1         
	//   25   45:aload           11
	//   26   47:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   27   50:istore          7
			int k1;
			View view3;
			if(j1 == -1)
	//*  28   52:iload           7
	//*  29   54:iconst_m1       
	//*  30   55:icmpne          87
			{
				view3 = view;
	//   31   58:aload           10
	//   32   60:astore          13
				k1 = i;
	//   33   62:iload_3         
	//   34   63:istore          8
				i = l;
	//   35   65:iload           5
	//   36   67:istore_3        
			} else
	//*  37   68:iload           6
	//*  38   70:iconst_1        
	//*  39   71:iadd            
	//*  40   72:istore          6
	//*  41   74:iload_3         
	//*  42   75:istore          5
	//*  43   77:iload           8
	//*  44   79:istore_3        
	//*  45   80:aload           13
	//*  46   82:astore          10
	//*  47   84:goto            29
			{
				int j = i;
	//   48   87:iload_3         
	//   49   88:istore          4
				if(j1 < i)
	//*  50   90:iload           7
	//*  51   92:iload_3         
	//*  52   93:icmpge          104
				{
					j = j1;
	//   53   96:iload           7
	//   54   98:istore          4
					view = view1;
	//   55  100:aload           11
	//   56  102:astore          10
				}
				i = l;
	//   57  104:iload           5
	//   58  106:istore_3        
				k1 = j;
	//   59  107:iload           4
	//   60  109:istore          8
				view3 = view;
	//   61  111:aload           10
	//   62  113:astore          13
				if(j1 > l)
	//*  63  115:iload           7
	//*  64  117:iload           5
	//*  65  119:icmple          68
				{
					i = j1;
	//   66  122:iload           7
	//   67  124:istore_3        
					view2 = view1;
	//   68  125:aload           11
	//   69  127:astore          12
					k1 = j;
	//   70  129:iload           4
	//   71  131:istore          8
					view3 = view;
	//   72  133:aload           10
	//   73  135:astore          13
				}
			}
			i1++;
			l = i;
			i = k1;
			view = view3;
		}
	//*  74  137:goto            68
		if(view == null || view2 == null)
	//*  75  140:aload           10
	//*  76  142:ifnull          150
	//*  77  145:aload           12
	//*  78  147:ifnonnull       152
			return 1.0F;
	//   79  150:fconst_1        
	//   80  151:freturn         
		int k = Math.min(orientationhelper.getDecoratedStart(view), orientationhelper.getDecoratedStart(view2));
	//   81  152:aload_2         
	//   82  153:aload           10
	//   83  155:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//   84  158:aload_2         
	//   85  159:aload           12
	//   86  161:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//   87  164:invokestatic    #45  <Method int Math.min(int, int)>
	//   88  167:istore          4
		k = Math.max(orientationhelper.getDecoratedEnd(view), orientationhelper.getDecoratedEnd(view2)) - k;
	//   89  169:aload_2         
	//   90  170:aload           10
	//   91  172:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   92  175:aload_2         
	//   93  176:aload           12
	//   94  178:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   95  181:invokestatic    #51  <Method int Math.max(int, int)>
	//   96  184:iload           4
	//   97  186:isub            
	//   98  187:istore          4
		if(k == 0)
	//*  99  189:iload           4
	//* 100  191:ifne            196
			return 1.0F;
	//  101  194:fconst_1        
	//  102  195:freturn         
		else
			return (1.0F * (float)k) / (float)((l - i) + 1);
	//  103  196:fconst_1        
	//  104  197:iload           4
	//  105  199:i2f             
	//  106  200:fmul            
	//  107  201:iload           5
	//  108  203:iload_3         
	//  109  204:isub            
	//  110  205:iconst_1        
	//  111  206:iadd            
	//  112  207:i2f             
	//  113  208:fdiv            
	//  114  209:freturn         
	}

	private int distanceToCenter(RecyclerView.LayoutManager layoutmanager, View view, OrientationHelper orientationhelper)
	{
		int j = orientationhelper.getDecoratedStart(view);
	//    0    0:aload_3         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//    3    5:istore          5
		int k = orientationhelper.getDecoratedMeasurement(view) / 2;
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #57  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//    7   12:iconst_2        
	//    8   13:idiv            
	//    9   14:istore          6
		int i;
		if(layoutmanager.getClipToPadding())
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #61  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  12   20:ifeq            45
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   13   23:aload_3         
	//   14   24:invokevirtual   #64  <Method int OrientationHelper.getStartAfterPadding()>
	//   15   27:aload_3         
	//   16   28:invokevirtual   #67  <Method int OrientationHelper.getTotalSpace()>
	//   17   31:iconst_2        
	//   18   32:idiv            
	//   19   33:iadd            
	//   20   34:istore          4
		else
	//*  21   36:iload           5
	//*  22   38:iload           6
	//*  23   40:iadd            
	//*  24   41:iload           4
	//*  25   43:isub            
	//*  26   44:ireturn         
			i = orientationhelper.getEnd() / 2;
	//   27   45:aload_3         
	//   28   46:invokevirtual   #70  <Method int OrientationHelper.getEnd()>
	//   29   49:iconst_2        
	//   30   50:idiv            
	//   31   51:istore          4
		return (j + k) - i;
	//*  32   53:goto            36
	}

	private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper, int i, int j)
	{
		int ai[] = calculateScrollDistance(i, j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:iload           4
	//    3    4:invokevirtual   #77  <Method int[] calculateScrollDistance(int, int)>
	//    4    7:astore          6
		float f = computeDistancePerChild(layoutmanager, orientationhelper);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #79  <Method float computeDistancePerChild(RecyclerView$LayoutManager, OrientationHelper)>
	//    9   15:fstore          5
		if(f <= 0.0F)
	//*  10   17:fload           5
	//*  11   19:fconst_0        
	//*  12   20:fcmpg           
	//*  13   21:ifgt            26
			return 0;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		if(Math.abs(ai[0]) > Math.abs(ai[1]))
	//*  16   26:aload           6
	//*  17   28:iconst_0        
	//*  18   29:iaload          
	//*  19   30:invokestatic    #83  <Method int Math.abs(int)>
	//*  20   33:aload           6
	//*  21   35:iconst_1        
	//*  22   36:iaload          
	//*  23   37:invokestatic    #83  <Method int Math.abs(int)>
	//*  24   40:icmple          57
			i = ai[0];
	//   25   43:aload           6
	//   26   45:iconst_0        
	//   27   46:iaload          
	//   28   47:istore_3        
		else
	//*  29   48:iload_3         
	//*  30   49:i2f             
	//*  31   50:fload           5
	//*  32   52:fdiv            
	//*  33   53:invokestatic    #87  <Method int Math.round(float)>
	//*  34   56:ireturn         
			i = ai[1];
	//   35   57:aload           6
	//   36   59:iconst_1        
	//   37   60:iaload          
	//   38   61:istore_3        
		return Math.round((float)i / f);
	//*  39   62:goto            48
	}

	private View findCenterView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int j1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          8
		if(j1 != 0) goto _L2; else goto _L1
	//    3    6:iload           8
	//    4    8:ifne            17
_L1:
		View view1 = null;
	//    5   11:aconst_null     
	//    6   12:astore          10
_L4:
		return view1;
	//    7   14:aload           10
	//    8   16:areturn         
_L2:
		View view = null;
	//    9   17:aconst_null     
	//   10   18:astore          9
		int i;
		int j;
		int k;
		int l;
		int i1;
		if(layoutmanager.getClipToPadding())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #61  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  13   24:ifeq            119
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   14   27:aload_2         
	//   15   28:invokevirtual   #64  <Method int OrientationHelper.getStartAfterPadding()>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #67  <Method int OrientationHelper.getTotalSpace()>
	//   18   35:iconst_2        
	//   19   36:idiv            
	//   20   37:iadd            
	//   21   38:istore_3        
		else
	//*  22   39:ldc1            #19  <Int 0x7fffffff>
	//*  23   41:istore          5
	//*  24   43:iconst_0        
	//*  25   44:istore          4
	//*  26   46:aload           9
	//*  27   48:astore          10
	//*  28   50:iload           4
	//*  29   52:iload           8
	//*  30   54:icmpge          14
	//*  31   57:aload_1         
	//*  32   58:iload           4
	//*  33   60:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//*  34   63:astore          10
	//*  35   65:aload_2         
	//*  36   66:aload           10
	//*  37   68:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  38   71:aload_2         
	//*  39   72:aload           10
	//*  40   74:invokevirtual   #57  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  41   77:iconst_2        
	//*  42   78:idiv            
	//*  43   79:iadd            
	//*  44   80:iload_3         
	//*  45   81:isub            
	//*  46   82:invokestatic    #83  <Method int Math.abs(int)>
	//*  47   85:istore          7
	//*  48   87:iload           5
	//*  49   89:istore          6
	//*  50   91:iload           7
	//*  51   93:iload           5
	//*  52   95:icmpge          106
	//*  53   98:iload           7
	//*  54  100:istore          6
	//*  55  102:aload           10
	//*  56  104:astore          9
	//*  57  106:iload           4
	//*  58  108:iconst_1        
	//*  59  109:iadd            
	//*  60  110:istore          4
	//*  61  112:iload           6
	//*  62  114:istore          5
	//*  63  116:goto            46
			i = orientationhelper.getEnd() / 2;
	//   64  119:aload_2         
	//   65  120:invokevirtual   #70  <Method int OrientationHelper.getEnd()>
	//   66  123:iconst_2        
	//   67  124:idiv            
	//   68  125:istore_3        
		k = 0x7fffffff;
		j = 0;
		view1 = view;
		if(j < j1)
		{
			view1 = layoutmanager.getChildAt(j);
			i1 = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - i);
			l = k;
			if(i1 < k)
			{
				l = i1;
				view = view1;
			}
			j++;
			k = l;
			break MISSING_BLOCK_LABEL_46;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
	//*  69  126:goto            39
	}

	private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		if(mHorizontalHelper == null || mHorizontalHelper.mLayoutManager != layoutmanager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field OrientationHelper mHorizontalHelper>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #94  <Field OrientationHelper mHorizontalHelper>
	//*   5   11:getfield        #98  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       26
			mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutmanager);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #101 <Method OrientationHelper OrientationHelper.createHorizontalHelper(RecyclerView$LayoutManager)>
	//   11   23:putfield        #94  <Field OrientationHelper mHorizontalHelper>
		return mHorizontalHelper;
	//   12   26:aload_0         
	//   13   27:getfield        #94  <Field OrientationHelper mHorizontalHelper>
	//   14   30:areturn         
	}

	private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		if(mVerticalHelper == null || mVerticalHelper.mLayoutManager != layoutmanager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field OrientationHelper mVerticalHelper>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #104 <Field OrientationHelper mVerticalHelper>
	//*   5   11:getfield        #98  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       26
			mVerticalHelper = OrientationHelper.createVerticalHelper(layoutmanager);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #107 <Method OrientationHelper OrientationHelper.createVerticalHelper(RecyclerView$LayoutManager)>
	//   11   23:putfield        #104 <Field OrientationHelper mVerticalHelper>
		return mVerticalHelper;
	//   12   26:aload_0         
	//   13   27:getfield        #104 <Field OrientationHelper mVerticalHelper>
	//   14   30:areturn         
	}

	public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutmanager, View view)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_3        
		if(layoutmanager.canScrollHorizontally())
	//*   3    4:aload_1         
	//*   4    5:invokevirtual   #112 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*   5    8:ifeq            48
			ai[0] = distanceToCenter(layoutmanager, view, getHorizontalHelper(layoutmanager));
	//    6   11:aload_3         
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:aload_2         
	//   11   16:aload_0         
	//   12   17:aload_1         
	//   13   18:invokespecial   #114 <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   14   21:invokespecial   #116 <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//   15   24:iastore         
		else
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  18   29:ifeq            55
	//*  19   32:aload_3         
	//*  20   33:iconst_1        
	//*  21   34:aload_0         
	//*  22   35:aload_1         
	//*  23   36:aload_2         
	//*  24   37:aload_0         
	//*  25   38:aload_1         
	//*  26   39:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//*  27   42:invokespecial   #116 <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//*  28   45:iastore         
	//*  29   46:aload_3         
	//*  30   47:areturn         
			ai[0] = 0;
	//   31   48:aload_3         
	//   32   49:iconst_0        
	//   33   50:iconst_0        
	//   34   51:iastore         
		if(layoutmanager.canScrollVertically())
		{
			ai[1] = distanceToCenter(layoutmanager, view, getVerticalHelper(layoutmanager));
			return ai;
		} else
	//*  35   52:goto            25
		{
			ai[1] = 0;
	//   36   55:aload_3         
	//   37   56:iconst_1        
	//   38   57:iconst_0        
	//   39   58:iastore         
			return ai;
	//   40   59:aload_3         
	//   41   60:areturn         
		}
	}

	public View findSnapView(RecyclerView.LayoutManager layoutmanager)
	{
		if(layoutmanager.canScrollVertically())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*   2    4:ifeq            18
			return findCenterView(layoutmanager, getVerticalHelper(layoutmanager));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//    8   14:invokespecial   #125 <Method View findCenterView(RecyclerView$LayoutManager, OrientationHelper)>
	//    9   17:areturn         
		if(layoutmanager.canScrollHorizontally())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #112 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  12   22:ifeq            36
			return findCenterView(layoutmanager, getHorizontalHelper(layoutmanager));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #114 <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   18   32:invokespecial   #125 <Method View findCenterView(RecyclerView$LayoutManager, OrientationHelper)>
	//   19   35:areturn         
		else
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	public int findTargetSnapPosition(RecyclerView.LayoutManager layoutmanager, int i, int j)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		int k;
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   2    3:aload_1         
	//*   3    4:instanceof      #129 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   4    7:ifne            17
		{
			k = ((int) (byte0));
	//    5   10:iload           5
	//    6   12:istore          4
		} else
	//*   7   14:iload           4
	//*   8   16:ireturn         
		{
			int l = layoutmanager.getItemCount();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #132 <Method int RecyclerView$LayoutManager.getItemCount()>
	//   11   21:istore          6
			k = ((int) (byte0));
	//   12   23:iload           5
	//   13   25:istore          4
			if(l != 0)
	//*  14   27:iload           6
	//*  15   29:ifeq            14
			{
				View view = findSnapView(layoutmanager);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #134 <Method View findSnapView(RecyclerView$LayoutManager)>
	//   19   37:astore          8
				k = ((int) (byte0));
	//   20   39:iload           5
	//   21   41:istore          4
				if(view != null)
	//*  22   43:aload           8
	//*  23   45:ifnull          14
				{
					int i1 = layoutmanager.getPosition(view);
	//   24   48:aload_1         
	//   25   49:aload           8
	//   26   51:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   27   54:istore          7
					k = ((int) (byte0));
	//   28   56:iload           5
	//   29   58:istore          4
					if(i1 != -1)
	//*  30   60:iload           7
	//*  31   62:iconst_m1       
	//*  32   63:icmpeq          14
					{
						PointF pointf = ((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(l - 1);
	//   33   66:aload_1         
	//   34   67:checkcast       #129 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   35   70:iload           6
	//   36   72:iconst_1        
	//   37   73:isub            
	//   38   74:invokeinterface #138 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   39   79:astore          8
						k = ((int) (byte0));
	//   40   81:iload           5
	//   41   83:istore          4
						if(pointf != null)
	//*  42   85:aload           8
	//*  43   87:ifnull          14
						{
							if(layoutmanager.canScrollHorizontally())
	//*  44   90:aload_1         
	//*  45   91:invokevirtual   #112 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  46   94:ifeq            210
							{
								k = estimateNextPositionDiffForFling(layoutmanager, getHorizontalHelper(layoutmanager), i, 0);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:invokespecial   #114 <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   52  104:iload_2         
	//   53  105:iconst_0        
	//   54  106:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//   55  109:istore          4
								i = k;
	//   56  111:iload           4
	//   57  113:istore_2        
								if(pointf.x < 0.0F)
	//*  58  114:aload           8
	//*  59  116:getfield        #145 <Field float PointF.x>
	//*  60  119:fconst_0        
	//*  61  120:fcmpg           
	//*  62  121:ifge            128
									i = -k;
	//   63  124:iload           4
	//   64  126:ineg            
	//   65  127:istore_2        
							} else
	//*  66  128:aload_1         
	//*  67  129:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  68  132:ifeq            215
	//*  69  135:aload_0         
	//*  70  136:aload_1         
	//*  71  137:aload_0         
	//*  72  138:aload_1         
	//*  73  139:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//*  74  142:iconst_0        
	//*  75  143:iload_3         
	//*  76  144:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//*  77  147:istore          4
	//*  78  149:iload           4
	//*  79  151:istore_3        
	//*  80  152:aload           8
	//*  81  154:getfield        #148 <Field float PointF.y>
	//*  82  157:fconst_0        
	//*  83  158:fcmpg           
	//*  84  159:ifge            166
	//*  85  162:iload           4
	//*  86  164:ineg            
	//*  87  165:istore_3        
	//*  88  166:aload_1         
	//*  89  167:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  90  170:ifeq            220
	//*  91  173:iload_3         
	//*  92  174:istore_2        
	//*  93  175:iload           5
	//*  94  177:istore          4
	//*  95  179:iload_2         
	//*  96  180:ifeq            14
	//*  97  183:iload           7
	//*  98  185:iload_2         
	//*  99  186:iadd            
	//* 100  187:istore_3        
	//* 101  188:iload_3         
	//* 102  189:istore_2        
	//* 103  190:iload_3         
	//* 104  191:ifge            196
	//* 105  194:iconst_0        
	//* 106  195:istore_2        
	//* 107  196:iload_2         
	//* 108  197:istore          4
	//* 109  199:iload_2         
	//* 110  200:iload           6
	//* 111  202:icmplt          14
	//* 112  205:iload           6
	//* 113  207:iconst_1        
	//* 114  208:isub            
	//* 115  209:ireturn         
							{
								i = 0;
	//  116  210:iconst_0        
	//  117  211:istore_2        
							}
							if(layoutmanager.canScrollVertically())
							{
								k = estimateNextPositionDiffForFling(layoutmanager, getVerticalHelper(layoutmanager), 0, j);
								j = k;
								if(pointf.y < 0.0F)
									j = -k;
							} else
	//* 118  212:goto            128
							{
								j = 0;
	//  119  215:iconst_0        
	//  120  216:istore_3        
							}
							if(layoutmanager.canScrollVertically())
								i = j;
							k = ((int) (byte0));
							if(i != 0)
							{
								j = i1 + i;
								i = j;
								if(j < 0)
									i = 0;
								k = i;
								if(i >= l)
									return l - 1;
							}
						}
					}
				}
			}
		}
		return k;
	//* 121  217:goto            166
	//* 122  220:goto            175
	}

	private static final float INVALID_DISTANCE = 1F;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
