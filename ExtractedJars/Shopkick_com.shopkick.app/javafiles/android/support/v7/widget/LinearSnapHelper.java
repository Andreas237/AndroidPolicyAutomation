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
		int l1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          9
		if(l1 == 0)
	//*   3    6:iload           9
	//*   4    8:ifne            13
			return 1.0F;
	//    5   11:fconst_1        
	//    6   12:freturn         
		int i1 = 0;
	//    7   13:iconst_0        
	//    8   14:istore          6
		View view = null;
	//    9   16:aconst_null     
	//   10   17:astore          10
		int l = 0x80000000;
	//   11   19:ldc1            #25  <Int 0x80000000>
	//   12   21:istore          5
		int i = 0x7fffffff;
	//   13   23:ldc1            #26  <Int 0x7fffffff>
	//   14   25:istore_3        
		View view1 = null;
	//   15   26:aconst_null     
	//   16   27:astore          11
		while(i1 < l1) 
	//*  17   29:iload           6
	//*  18   31:iload           9
	//*  19   33:icmpge          136
		{
			View view2 = layoutmanager.getChildAt(i1);
	//   20   36:aload_1         
	//   21   37:iload           6
	//   22   39:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   23   42:astore          12
			int j1 = layoutmanager.getPosition(view2);
	//   24   44:aload_1         
	//   25   45:aload           12
	//   26   47:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   27   50:istore          7
			int k1;
			View view3;
			if(j1 == -1)
	//*  28   52:iload           7
	//*  29   54:iconst_m1       
	//*  30   55:icmpne          69
			{
				view3 = view;
	//   31   58:aload           10
	//   32   60:astore          13
				k1 = l;
	//   33   62:iload           5
	//   34   64:istore          8
			} else
	//*  35   66:goto            119
			{
				int j = i;
	//   36   69:iload_3         
	//   37   70:istore          4
				if(j1 < i)
	//*  38   72:iload           7
	//*  39   74:iload_3         
	//*  40   75:icmpge          86
				{
					view = view2;
	//   41   78:aload           12
	//   42   80:astore          10
					j = j1;
	//   43   82:iload           7
	//   44   84:istore          4
				}
				view3 = view;
	//   45   86:aload           10
	//   46   88:astore          13
				i = j;
	//   47   90:iload           4
	//   48   92:istore_3        
				k1 = l;
	//   49   93:iload           5
	//   50   95:istore          8
				if(j1 > l)
	//*  51   97:iload           7
	//*  52   99:iload           5
	//*  53  101:icmple          119
				{
					view1 = view2;
	//   54  104:aload           12
	//   55  106:astore          11
					k1 = j1;
	//   56  108:iload           7
	//   57  110:istore          8
					i = j;
	//   58  112:iload           4
	//   59  114:istore_3        
					view3 = view;
	//   60  115:aload           10
	//   61  117:astore          13
				}
			}
			i1++;
	//   62  119:iload           6
	//   63  121:iconst_1        
	//   64  122:iadd            
	//   65  123:istore          6
			view = view3;
	//   66  125:aload           13
	//   67  127:astore          10
			l = k1;
	//   68  129:iload           8
	//   69  131:istore          5
		}
	//*  70  133:goto            29
		if(view != null)
	//*  71  136:aload           10
	//*  72  138:ifnull          206
		{
			if(view1 == null)
	//*  73  141:aload           11
	//*  74  143:ifnonnull       148
				return 1.0F;
	//   75  146:fconst_1        
	//   76  147:freturn         
			int k = Math.min(orientationhelper.getDecoratedStart(view), orientationhelper.getDecoratedStart(view1));
	//   77  148:aload_2         
	//   78  149:aload           10
	//   79  151:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//   80  154:aload_2         
	//   81  155:aload           11
	//   82  157:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//   83  160:invokestatic    #45  <Method int Math.min(int, int)>
	//   84  163:istore          4
			k = Math.max(orientationhelper.getDecoratedEnd(view), orientationhelper.getDecoratedEnd(view1)) - k;
	//   85  165:aload_2         
	//   86  166:aload           10
	//   87  168:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   88  171:aload_2         
	//   89  172:aload           11
	//   90  174:invokevirtual   #48  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   91  177:invokestatic    #51  <Method int Math.max(int, int)>
	//   92  180:iload           4
	//   93  182:isub            
	//   94  183:istore          4
			if(k == 0)
	//*  95  185:iload           4
	//*  96  187:ifne            192
				return 1.0F;
	//   97  190:fconst_1        
	//   98  191:freturn         
			else
				return ((float)k * 1.0F) / (float)((l - i) + 1);
	//   99  192:iload           4
	//  100  194:i2f             
	//  101  195:fconst_1        
	//  102  196:fmul            
	//  103  197:iload           5
	//  104  199:iload_3         
	//  105  200:isub            
	//  106  201:iconst_1        
	//  107  202:iadd            
	//  108  203:i2f             
	//  109  204:fdiv            
	//  110  205:freturn         
		} else
		{
			return 1.0F;
	//  111  206:fconst_1        
	//  112  207:freturn         
		}
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
	//*  12   20:ifeq            39
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
	//*  21   36:goto            47
			i = orientationhelper.getEnd() / 2;
	//   22   39:aload_3         
	//   23   40:invokevirtual   #70  <Method int OrientationHelper.getEnd()>
	//   24   43:iconst_2        
	//   25   44:idiv            
	//   26   45:istore          4
		return (j + k) - i;
	//   27   47:iload           5
	//   28   49:iload           6
	//   29   51:iadd            
	//   30   52:iload           4
	//   31   54:isub            
	//   32   55:ireturn         
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
	//*  24   40:icmple          51
			i = ai[0];
	//   25   43:aload           6
	//   26   45:iconst_0        
	//   27   46:iaload          
	//   28   47:istore_3        
		else
	//*  29   48:goto            56
			i = ai[1];
	//   30   51:aload           6
	//   31   53:iconst_1        
	//   32   54:iaload          
	//   33   55:istore_3        
		return Math.round((float)i / f);
	//   34   56:iload_3         
	//   35   57:i2f             
	//   36   58:fload           5
	//   37   60:fdiv            
	//   38   61:invokestatic    #87  <Method int Math.round(float)>
	//   39   64:ireturn         
	}

	private View findCenterView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int j1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          8
		View view = null;
	//    3    6:aconst_null     
	//    4    7:astore          9
		if(j1 == 0)
	//*   5    9:iload           8
	//*   6   11:ifne            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		int i;
		if(layoutmanager.getClipToPadding())
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #61  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  11   20:ifeq            38
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   12   23:aload_2         
	//   13   24:invokevirtual   #64  <Method int OrientationHelper.getStartAfterPadding()>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #67  <Method int OrientationHelper.getTotalSpace()>
	//   16   31:iconst_2        
	//   17   32:idiv            
	//   18   33:iadd            
	//   19   34:istore_3        
		else
	//*  20   35:goto            45
			i = orientationhelper.getEnd() / 2;
	//   21   38:aload_2         
	//   22   39:invokevirtual   #70  <Method int OrientationHelper.getEnd()>
	//   23   42:iconst_2        
	//   24   43:idiv            
	//   25   44:istore_3        
		int k = 0x7fffffff;
	//   26   45:ldc1            #26  <Int 0x7fffffff>
	//   27   47:istore          5
		for(int j = 0; j < j1;)
	//*  28   49:iconst_0        
	//*  29   50:istore          4
	//*  30   52:iload           4
	//*  31   54:iload           8
	//*  32   56:icmpge          121
		{
			View view1 = layoutmanager.getChildAt(j);
	//   33   59:aload_1         
	//   34   60:iload           4
	//   35   62:invokevirtual   #30  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   36   65:astore          10
			int i1 = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - i);
	//   37   67:aload_2         
	//   38   68:aload           10
	//   39   70:invokevirtual   #39  <Method int OrientationHelper.getDecoratedStart(View)>
	//   40   73:aload_2         
	//   41   74:aload           10
	//   42   76:invokevirtual   #57  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   43   79:iconst_2        
	//   44   80:idiv            
	//   45   81:iadd            
	//   46   82:iload_3         
	//   47   83:isub            
	//   48   84:invokestatic    #83  <Method int Math.abs(int)>
	//   49   87:istore          7
			int l = k;
	//   50   89:iload           5
	//   51   91:istore          6
			if(i1 < k)
	//*  52   93:iload           7
	//*  53   95:iload           5
	//*  54   97:icmpge          108
			{
				view = view1;
	//   55  100:aload           10
	//   56  102:astore          9
				l = i1;
	//   57  104:iload           7
	//   58  106:istore          6
			}
			j++;
	//   59  108:iload           4
	//   60  110:iconst_1        
	//   61  111:iadd            
	//   62  112:istore          4
			k = l;
	//   63  114:iload           6
	//   64  116:istore          5
		}

	//*  65  118:goto            52
		return view;
	//   66  121:aload           9
	//   67  123:areturn         
	}

	private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		OrientationHelper orientationhelper = mHorizontalHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field OrientationHelper mHorizontalHelper>
	//    2    4:astore_2        
		if(orientationhelper == null || orientationhelper.mLayoutManager != layoutmanager)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:getfield        #98  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutmanager);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #101 <Method OrientationHelper OrientationHelper.createHorizontalHelper(RecyclerView$LayoutManager)>
	//   12   22:putfield        #94  <Field OrientationHelper mHorizontalHelper>
		return mHorizontalHelper;
	//   13   25:aload_0         
	//   14   26:getfield        #94  <Field OrientationHelper mHorizontalHelper>
	//   15   29:areturn         
	}

	private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		OrientationHelper orientationhelper = mVerticalHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field OrientationHelper mVerticalHelper>
	//    2    4:astore_2        
		if(orientationhelper == null || orientationhelper.mLayoutManager != layoutmanager)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:getfield        #98  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			mVerticalHelper = OrientationHelper.createVerticalHelper(layoutmanager);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #107 <Method OrientationHelper OrientationHelper.createVerticalHelper(RecyclerView$LayoutManager)>
	//   12   22:putfield        #104 <Field OrientationHelper mVerticalHelper>
		return mVerticalHelper;
	//   13   25:aload_0         
	//   14   26:getfield        #104 <Field OrientationHelper mVerticalHelper>
	//   15   29:areturn         
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
	//*   5    8:ifeq            28
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
	//*  16   25:goto            32
			ai[0] = 0;
	//   17   28:aload_3         
	//   18   29:iconst_0        
	//   19   30:iconst_0        
	//   20   31:iastore         
		if(layoutmanager.canScrollVertically())
	//*  21   32:aload_1         
	//*  22   33:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  23   36:ifeq            55
		{
			ai[1] = distanceToCenter(layoutmanager, view, getVerticalHelper(layoutmanager));
	//   24   39:aload_3         
	//   25   40:iconst_1        
	//   26   41:aload_0         
	//   27   42:aload_1         
	//   28   43:aload_2         
	//   29   44:aload_0         
	//   30   45:aload_1         
	//   31   46:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   32   49:invokespecial   #116 <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//   33   52:iastore         
			return ai;
	//   34   53:aload_3         
	//   35   54:areturn         
		} else
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
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		int j1 = layoutmanager.getItemCount();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method int RecyclerView$LayoutManager.getItemCount()>
	//    7   13:istore          6
		if(j1 == 0)
	//*   8   15:iload           6
	//*   9   17:ifne            22
			return -1;
	//   10   20:iconst_m1       
	//   11   21:ireturn         
		Object obj = ((Object) (findSnapView(layoutmanager)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #134 <Method View findSnapView(RecyclerView$LayoutManager)>
	//   15   27:astore          8
		if(obj == null)
	//*  16   29:aload           8
	//*  17   31:ifnonnull       36
			return -1;
	//   18   34:iconst_m1       
	//   19   35:ireturn         
		int k1 = layoutmanager.getPosition(((View) (obj)));
	//   20   36:aload_1         
	//   21   37:aload           8
	//   22   39:invokevirtual   #34  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   23   42:istore          7
		if(k1 == -1)
	//*  24   44:iload           7
	//*  25   46:iconst_m1       
	//*  26   47:icmpne          52
			return -1;
	//   27   50:iconst_m1       
	//   28   51:ireturn         
		obj = ((Object) ((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager));
	//   29   52:aload_1         
	//   30   53:checkcast       #129 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   31   56:astore          8
		int k = j1 - 1;
	//   32   58:iload           6
	//   33   60:iconst_1        
	//   34   61:isub            
	//   35   62:istore          4
		obj = ((Object) (((RecyclerView.SmoothScroller.ScrollVectorProvider) (obj)).computeScrollVectorForPosition(k)));
	//   36   64:aload           8
	//   37   66:iload           4
	//   38   68:invokeinterface #138 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   39   73:astore          8
		if(obj == null)
	//*  40   75:aload           8
	//*  41   77:ifnonnull       82
			return -1;
	//   42   80:iconst_m1       
	//   43   81:ireturn         
		if(layoutmanager.canScrollHorizontally())
	//*  44   82:aload_1         
	//*  45   83:invokevirtual   #112 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  46   86:ifeq            123
		{
			int l = estimateNextPositionDiffForFling(layoutmanager, getHorizontalHelper(layoutmanager), i, 0);
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:aload_0         
	//   50   92:aload_1         
	//   51   93:invokespecial   #114 <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   52   96:iload_2         
	//   53   97:iconst_0        
	//   54   98:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//   55  101:istore          5
			i = l;
	//   56  103:iload           5
	//   57  105:istore_2        
			if(((PointF) (obj)).x < 0.0F)
	//*  58  106:aload           8
	//*  59  108:getfield        #145 <Field float PointF.x>
	//*  60  111:fconst_0        
	//*  61  112:fcmpg           
	//*  62  113:ifge            125
				i = -l;
	//   63  116:iload           5
	//   64  118:ineg            
	//   65  119:istore_2        
		} else
	//*  66  120:goto            125
		{
			i = 0;
	//   67  123:iconst_0        
	//   68  124:istore_2        
		}
		if(layoutmanager.canScrollVertically())
	//*  69  125:aload_1         
	//*  70  126:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  71  129:ifeq            166
		{
			int i1 = estimateNextPositionDiffForFling(layoutmanager, getVerticalHelper(layoutmanager), 0, j);
	//   72  132:aload_0         
	//   73  133:aload_1         
	//   74  134:aload_0         
	//   75  135:aload_1         
	//   76  136:invokespecial   #121 <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   77  139:iconst_0        
	//   78  140:iload_3         
	//   79  141:invokespecial   #140 <Method int estimateNextPositionDiffForFling(RecyclerView$LayoutManager, OrientationHelper, int, int)>
	//   80  144:istore          5
			j = i1;
	//   81  146:iload           5
	//   82  148:istore_3        
			if(((PointF) (obj)).y < 0.0F)
	//*  83  149:aload           8
	//*  84  151:getfield        #148 <Field float PointF.y>
	//*  85  154:fconst_0        
	//*  86  155:fcmpg           
	//*  87  156:ifge            168
				j = -i1;
	//   88  159:iload           5
	//   89  161:ineg            
	//   90  162:istore_3        
		} else
	//*  91  163:goto            168
		{
			j = 0;
	//   92  166:iconst_0        
	//   93  167:istore_3        
		}
		if(layoutmanager.canScrollVertically())
	//*  94  168:aload_1         
	//*  95  169:invokevirtual   #119 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  96  172:ifeq            177
			i = j;
	//   97  175:iload_3         
	//   98  176:istore_2        
		if(i == 0)
	//*  99  177:iload_2         
	//* 100  178:ifne            183
			return -1;
	//  101  181:iconst_m1       
	//  102  182:ireturn         
		j = k1 + i;
	//  103  183:iload           7
	//  104  185:iload_2         
	//  105  186:iadd            
	//  106  187:istore_3        
		i = j;
	//  107  188:iload_3         
	//  108  189:istore_2        
		if(j < 0)
	//* 109  190:iload_3         
	//* 110  191:ifge            196
			i = 0;
	//  111  194:iconst_0        
	//  112  195:istore_2        
		j = i;
	//  113  196:iload_2         
	//  114  197:istore_3        
		if(i >= j1)
	//* 115  198:iload_2         
	//* 116  199:iload           6
	//* 117  201:icmplt          207
			j = k;
	//  118  204:iload           4
	//  119  206:istore_3        
		return j;
	//  120  207:iload_3         
	//  121  208:ireturn         
	}

	private static final float INVALID_DISTANCE = 1F;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
