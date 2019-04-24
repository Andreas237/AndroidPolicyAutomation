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
	//    1    1:astore          9
		int i = 0x7fffffff;
	//    2    3:ldc1            #19  <Int 0x7fffffff>
	//    3    5:istore_3        
		int j1 = layoutmanager.getChildCount();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #25  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    6   10:istore          8
		if(j1 == 0)
	//*   7   12:iload           8
	//*   8   14:ifne            19
			return 1.0F;
	//    9   17:fconst_1        
	//   10   18:freturn         
		int k = 0;
	//   11   19:iconst_0        
	//   12   20:istore          5
		View view1 = null;
	//   13   22:aconst_null     
	//   14   23:astore          10
		int l = 0x80000000;
	//   15   25:ldc1            #26  <Int 0x80000000>
	//   16   27:istore          6
		while(k < j1) 
	//*  17   29:iload           5
	//*  18   31:iload           8
	//*  19   33:icmpge          105
		{
			View view2 = layoutmanager.getChildAt(k);
	//   20   36:aload_1         
	//   21   37:iload           5
	//   22   39:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   23   42:astore          11
			int i1 = layoutmanager.getPosition(view2);
	//   24   44:aload_1         
	//   25   45:aload           11
	//   26   47:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   27   50:istore          7
			if(i1 != -1)
	//*  28   52:iload           7
	//*  29   54:iconst_m1       
	//*  30   55:icmpne          67
	//*  31   58:iload           5
	//*  32   60:iconst_1        
	//*  33   61:iadd            
	//*  34   62:istore          5
	//*  35   64:goto            29
			{
				int j = i;
	//   36   67:iload_3         
	//   37   68:istore          4
				if(i1 < i)
	//*  38   70:iload           7
	//*  39   72:iload_3         
	//*  40   73:icmpge          84
				{
					j = i1;
	//   41   76:iload           7
	//   42   78:istore          4
					view1 = view2;
	//   43   80:aload           11
	//   44   82:astore          10
				}
				if(i1 > l)
	//*  45   84:iload           7
	//*  46   86:iload           6
	//*  47   88:icmple          175
				{
					l = i1;
	//   48   91:iload           7
	//   49   93:istore          6
					i = j;
	//   50   95:iload           4
	//   51   97:istore_3        
					view = view2;
	//   52   98:aload           11
	//   53  100:astore          9
				} else
	//*  54  102:goto            58
	//*  55  105:aload           10
	//*  56  107:ifnull          115
	//*  57  110:aload           9
	//*  58  112:ifnonnull       117
	//*  59  115:fconst_1        
	//*  60  116:freturn         
	//*  61  117:aload_2         
	//*  62  118:aload           10
	//*  63  120:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  64  123:aload_2         
	//*  65  124:aload           9
	//*  66  126:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  67  129:invokestatic    #45  <Method int Math.min(int, int)>
	//*  68  132:istore          4
	//*  69  134:aload_2         
	//*  70  135:aload           10
	//*  71  137:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  72  140:aload_2         
	//*  73  141:aload           9
	//*  74  143:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  75  146:invokestatic    #51  <Method int Math.max(int, int)>
	//*  76  149:iload           4
	//*  77  151:isub            
	//*  78  152:istore          4
	//*  79  154:iload           4
	//*  80  156:ifne            161
	//*  81  159:fconst_1        
	//*  82  160:freturn         
	//*  83  161:iload           4
	//*  84  163:i2f             
	//*  85  164:fconst_1        
	//*  86  165:fmul            
	//*  87  166:iload           6
	//*  88  168:iload_3         
	//*  89  169:isub            
	//*  90  170:iconst_1        
	//*  91  171:iadd            
	//*  92  172:i2f             
	//*  93  173:fdiv            
	//*  94  174:freturn         
				{
					i = j;
	//   95  175:iload           4
	//   96  177:istore_3        
				}
			}
			k++;
		}
		if(view1 == null || view == null)
			return 1.0F;
		j = Math.min(orientationhelper.getDecoratedStart(view1), orientationhelper.getDecoratedStart(view));
		j = Math.max(orientationhelper.getDecoratedEnd(view1), orientationhelper.getDecoratedEnd(view)) - j;
		if(j == 0)
			return 1.0F;
		else
			return ((float)j * 1.0F) / (float)((l - i) + 1);
	//*  97  178:goto            58
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
	//*  21   36:iload           6
	//*  22   38:iload           5
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
		return (k + j) - i;
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
		int i1;
		View view;
		View view1;
		view = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		view1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		i1 = layoutmanager.getChildCount();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #25  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    6   10:istore          7
		if(i1 != 0) goto _L2; else goto _L1
	//    7   12:iload           7
	//    8   14:ifne            20
_L1:
		return view1;
	//    9   17:aload           9
	//   10   19:areturn         
_L2:
		int i;
		int j;
		int k;
		int l;
		if(layoutmanager.getClipToPadding())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #61  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  13   24:ifeq            110
			j = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   14   27:aload_2         
	//   15   28:invokevirtual   #64  <Method int OrientationHelper.getStartAfterPadding()>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #67  <Method int OrientationHelper.getTotalSpace()>
	//   18   35:iconst_2        
	//   19   36:idiv            
	//   20   37:iadd            
	//   21   38:istore          4
		else
	//*  22   40:ldc1            #19  <Int 0x7fffffff>
	//*  23   42:istore_3        
	//*  24   43:iconst_0        
	//*  25   44:istore          5
	//*  26   46:aload           8
	//*  27   48:astore          9
	//*  28   50:iload           5
	//*  29   52:iload           7
	//*  30   54:icmpge          17
	//*  31   57:aload_1         
	//*  32   58:iload           5
	//*  33   60:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//*  34   63:astore          9
	//*  35   65:aload_2         
	//*  36   66:aload           9
	//*  37   68:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  38   71:aload_2         
	//*  39   72:aload           9
	//*  40   74:invokevirtual   #57  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  41   77:iconst_2        
	//*  42   78:idiv            
	//*  43   79:iadd            
	//*  44   80:iload           4
	//*  45   82:isub            
	//*  46   83:invokestatic    #83  <Method int Math.abs(int)>
	//*  47   86:istore          6
	//*  48   88:iload           6
	//*  49   90:iload_3         
	//*  50   91:icmpge          121
	//*  51   94:aload           9
	//*  52   96:astore          8
	//*  53   98:iload           6
	//*  54  100:istore_3        
	//*  55  101:iload           5
	//*  56  103:iconst_1        
	//*  57  104:iadd            
	//*  58  105:istore          5
	//*  59  107:goto            46
			j = orientationhelper.getEnd() / 2;
	//   60  110:aload_2         
	//   61  111:invokevirtual   #70  <Method int OrientationHelper.getEnd()>
	//   62  114:iconst_2        
	//   63  115:idiv            
	//   64  116:istore          4
		i = 0x7fffffff;
		k = 0;
		view1 = view;
		if(k < i1)
		{
			view1 = layoutmanager.getChildAt(k);
			l = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - j);
			if(l < i)
			{
				view = view1;
				i = l;
			}
			k++;
			break MISSING_BLOCK_LABEL_46;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
	//*  65  118:goto            40
	//*  66  121:goto            101
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
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #129 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   2    4:ifne            11
		{
			j = -1;
	//    3    7:iconst_m1       
	//    4    8:istore_3        
		} else
	//*   5    9:iload_3         
	//*   6   10:ireturn         
		{
			int i1 = layoutmanager.getItemCount();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #132 <Method int RecyclerView$LayoutManager.getItemCount()>
	//    9   15:istore          5
			if(i1 == 0)
	//*  10   17:iload           5
	//*  11   19:ifne            24
				return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
			Object obj = ((Object) (findSnapView(layoutmanager)));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #134 <Method View findSnapView(RecyclerView$LayoutManager)>
	//   17   29:astore          7
			if(obj == null)
	//*  18   31:aload           7
	//*  19   33:ifnonnull       38
				return -1;
	//   20   36:iconst_m1       
	//   21   37:ireturn         
			int j1 = layoutmanager.getPosition(((View) (obj)));
	//   22   38:aload_1         
	//   23   39:aload           7
	//   24   41:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   25   44:istore          6
			if(j1 == -1)
	//*  26   46:iload           6
	//*  27   48:iconst_m1       
	//*  28   49:icmpne          54
				return -1;
	//   29   52:iconst_m1       
	//   30   53:ireturn         
			obj = ((Object) (((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(i1 - 1)));
	//   31   54:aload_1         
	//   32   55:checkcast       #129 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   33   58:iload           5
	//   34   60:iconst_1        
	//   35   61:isub            
	//   36   62:invokeinterface #138 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   37   67:astore          7
			if(obj == null)
	//*  38   69:aload           7
	//*  39   71:ifnonnull       76
				return -1;
	//   40   74:iconst_m1       
	//   41   75:ireturn         
			if(layoutmanager.canScrollHorizontally())
	//*  42   76:aload_1         
	//*  43   77:invokevirtual   #112 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  44   80:ifeq            165
			{
				int k = estimateNextPositionDiffForFling(layoutmanager, getHorizontalHelper(layoutmanager), i, 0);
	//   45   83:aload_0         
	//   46   84:aload_1         
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:invokespecial   #114 <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   50   90:iload_2         
	//   51   91:iconst_0        
	//   52   92:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//   53   95:istore          4
				i = k;
	//   54   97:iload           4
	//   55   99:istore_2        
				if(((PointF) (obj)).x < 0.0F)
	//*  56  100:aload           7
	//*  57  102:getfield        #145 <Field float PointF.x>
	//*  58  105:fconst_0        
	//*  59  106:fcmpg           
	//*  60  107:ifge            114
					i = -k;
	//   61  110:iload           4
	//   62  112:ineg            
	//   63  113:istore_2        
			} else
	//*  64  114:aload_1         
	//*  65  115:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  66  118:ifeq            170
	//*  67  121:aload_0         
	//*  68  122:aload_1         
	//*  69  123:aload_0         
	//*  70  124:aload_1         
	//*  71  125:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//*  72  128:iconst_0        
	//*  73  129:iload_3         
	//*  74  130:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//*  75  133:istore          4
	//*  76  135:iload           4
	//*  77  137:istore_3        
	//*  78  138:aload           7
	//*  79  140:getfield        #148 <Field float PointF.y>
	//*  80  143:fconst_0        
	//*  81  144:fcmpg           
	//*  82  145:ifge            152
	//*  83  148:iload           4
	//*  84  150:ineg            
	//*  85  151:istore_3        
	//*  86  152:aload_1         
	//*  87  153:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  88  156:ifeq            175
	//*  89  159:iload_3         
	//*  90  160:ifne            180
	//*  91  163:iconst_m1       
	//*  92  164:ireturn         
			{
				i = 0;
	//   93  165:iconst_0        
	//   94  166:istore_2        
			}
			if(layoutmanager.canScrollVertically())
			{
				int l = estimateNextPositionDiffForFling(layoutmanager, getVerticalHelper(layoutmanager), 0, j);
				j = l;
				if(((PointF) (obj)).y < 0.0F)
					j = -l;
			} else
	//*  95  167:goto            114
			{
				j = 0;
	//   96  170:iconst_0        
	//   97  171:istore_3        
			}
			if(!layoutmanager.canScrollVertically())
	//*  98  172:goto            152
				j = i;
	//   99  175:iload_2         
	//  100  176:istore_3        
			if(j == 0)
				return -1;
	//* 101  177:goto            159
			j = j1 + j;
	//  102  180:iload           6
	//  103  182:iload_3         
	//  104  183:iadd            
	//  105  184:istore_3        
			i = j;
	//  106  185:iload_3         
	//  107  186:istore_2        
			if(j < 0)
	//* 108  187:iload_3         
	//* 109  188:ifge            193
				i = 0;
	//  110  191:iconst_0        
	//  111  192:istore_2        
			j = i;
	//  112  193:iload_2         
	//  113  194:istore_3        
			if(i >= i1)
	//* 114  195:iload_2         
	//* 115  196:iload           5
	//* 116  198:icmplt          9
				return i1 - 1;
	//  117  201:iload           5
	//  118  203:iconst_1        
	//  119  204:isub            
	//  120  205:ireturn         
		}
		return j;
	}

	private static final float INVALID_DISTANCE = 1F;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
