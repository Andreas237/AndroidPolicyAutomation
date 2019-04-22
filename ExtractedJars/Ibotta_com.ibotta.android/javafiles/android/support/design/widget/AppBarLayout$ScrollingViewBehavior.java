// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			HeaderScrollingViewBehavior, AppBarLayout, CoordinatorLayout

public static class AppBarLayout$ScrollingViewBehavior extends HeaderScrollingViewBehavior
{

	private static int getAppBarLayoutOffset(AppBarLayout appbarlayout)
	{
		appbarlayout = ((AppBarLayout) (((CoordinatorLayout.LayoutParams)appbarlayout.getLayoutParams()).getBehavior()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
	//    2    4:checkcast       #52  <Class CoordinatorLayout$LayoutParams>
	//    3    7:invokevirtual   #56  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    4   10:astore_0        
		if(appbarlayout instanceof AppBarLayout.BaseBehavior)
	//*   5   11:aload_0         
	//*   6   12:instanceof      #58  <Class AppBarLayout$BaseBehavior>
	//*   7   15:ifeq            26
			return ((AppBarLayout.BaseBehavior)appbarlayout).getTopBottomOffsetForScrollingSibling();
	//    8   18:aload_0         
	//    9   19:checkcast       #58  <Class AppBarLayout$BaseBehavior>
	//   10   22:invokevirtual   #62  <Method int AppBarLayout$BaseBehavior.getTopBottomOffsetForScrollingSibling()>
	//   11   25:ireturn         
		else
			return 0;
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	private void offsetChildAsNeeded(View view, View view1)
	{
		Object obj = ((Object) (((CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #67  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #52  <Class CoordinatorLayout$LayoutParams>
	//    3    7:invokevirtual   #56  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    4   10:astore_3        
		if(obj instanceof AppBarLayout.BaseBehavior)
	//*   5   11:aload_3         
	//*   6   12:instanceof      #58  <Class AppBarLayout$BaseBehavior>
	//*   7   15:ifeq            52
		{
			obj = ((Object) ((AppBarLayout.BaseBehavior)obj));
	//    8   18:aload_3         
	//    9   19:checkcast       #58  <Class AppBarLayout$BaseBehavior>
	//   10   22:astore_3        
			ViewCompat.offsetTopAndBottom(view, ((view1.getBottom() - view.getTop()) + AppBarLayout.BaseBehavior.access$000(((AppBarLayout.BaseBehavior) (obj))) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view1));
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #70  <Method int View.getBottom()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #73  <Method int View.getTop()>
	//   16   32:isub            
	//   17   33:aload_3         
	//   18   34:invokestatic    #77  <Method int AppBarLayout$BaseBehavior.access$000(AppBarLayout$BaseBehavior)>
	//   19   37:iadd            
	//   20   38:aload_0         
	//   21   39:invokevirtual   #80  <Method int getVerticalLayoutGap()>
	//   22   42:iadd            
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #84  <Method int getOverlapPixelsForOffset(View)>
	//   26   48:isub            
	//   27   49:invokestatic    #90  <Method void ViewCompat.offsetTopAndBottom(View, int)>
		}
	//   28   52:return          
	}

	private void updateLiftedStateIfNeeded(View view, View view1)
	{
		if(view1 instanceof AppBarLayout)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #6   <Class AppBarLayout>
	//*   2    4:ifeq            39
		{
			view1 = ((View) ((AppBarLayout)view1));
	//    3    7:aload_2         
	//    4    8:checkcast       #6   <Class AppBarLayout>
	//    5   11:astore_2        
			if(((AppBarLayout) (view1)).isLiftOnScroll())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #95  <Method boolean AppBarLayout.isLiftOnScroll()>
	//*   8   16:ifeq            39
			{
				boolean flag;
				if(view.getScrollY() > 0)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #98  <Method int View.getScrollY()>
	//*  11   23:ifle            31
					flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_3        
				else
	//*  14   28:goto            33
					flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_3        
				((AppBarLayout) (view1)).setLiftedState(flag);
	//   17   33:aload_2         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #102 <Method boolean AppBarLayout.setLiftedState(boolean)>
	//   20   38:pop             
			}
		}
	//   21   39:return          
	}

	AppBarLayout findFirstDependency(List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #109 <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          47
		{
			View view = (View)list.get(i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokeinterface #113 <Method Object List.get(int)>
	//   11   21:checkcast       #66  <Class View>
	//   12   24:astore          4
			if(view instanceof AppBarLayout)
	//*  13   26:aload           4
	//*  14   28:instanceof      #6   <Class AppBarLayout>
	//*  15   31:ifeq            40
				return (AppBarLayout)view;
	//   16   34:aload           4
	//   17   36:checkcast       #6   <Class AppBarLayout>
	//   18   39:areturn         
		}

	//   19   40:iload_2         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:istore_2        
	//*  23   44:goto            9
		return null;
	//   24   47:aconst_null     
	//   25   48:areturn         
	}

	volatile View findFirstDependency(List list)
	{
		return ((View) (findFirstDependency(list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method AppBarLayout findFirstDependency(List)>
	//    3    5:areturn         
	}

	float getOverlapRatioForOffset(View view)
	{
		if(view instanceof AppBarLayout)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class AppBarLayout>
	//*   2    4:ifeq            60
		{
			view = ((View) ((AppBarLayout)view));
	//    3    7:aload_1         
	//    4    8:checkcast       #6   <Class AppBarLayout>
	//    5   11:astore_1        
			int j = ((AppBarLayout) (view)).getTotalScrollRange();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #123 <Method int AppBarLayout.getTotalScrollRange()>
	//    8   16:istore_3        
			int k = ((AppBarLayout) (view)).getDownNestedPreScrollRange();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   11   21:istore          4
			int i = getAppBarLayoutOffset(((AppBarLayout) (view)));
	//   12   23:aload_1         
	//   13   24:invokestatic    #128 <Method int getAppBarLayoutOffset(AppBarLayout)>
	//   14   27:istore_2        
			if(k != 0 && j + i <= k)
	//*  15   28:iload           4
	//*  16   30:ifeq            43
	//*  17   33:iload_3         
	//*  18   34:iload_2         
	//*  19   35:iadd            
	//*  20   36:iload           4
	//*  21   38:icmpgt          43
				return 0.0F;
	//   22   41:fconst_0        
	//   23   42:freturn         
			j -= k;
	//   24   43:iload_3         
	//   25   44:iload           4
	//   26   46:isub            
	//   27   47:istore_3        
			if(j != 0)
	//*  28   48:iload_3         
	//*  29   49:ifeq            60
				return (float)i / (float)j + 1.0F;
	//   30   52:iload_2         
	//   31   53:i2f             
	//   32   54:iload_3         
	//   33   55:i2f             
	//   34   56:fdiv            
	//   35   57:fconst_1        
	//   36   58:fadd            
	//   37   59:freturn         
		}
		return 0.0F;
	//   38   60:fconst_0        
	//   39   61:freturn         
	}

	int getScrollRange(View view)
	{
		if(view instanceof AppBarLayout)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class AppBarLayout>
	//*   2    4:ifeq            15
			return ((AppBarLayout)view).getTotalScrollRange();
	//    3    7:aload_1         
	//    4    8:checkcast       #6   <Class AppBarLayout>
	//    5   11:invokevirtual   #123 <Method int AppBarLayout.getTotalScrollRange()>
	//    6   14:ireturn         
		else
			return super.getScrollRange(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #131 <Method int HeaderScrollingViewBehavior.getScrollRange(View)>
	//   10   20:ireturn         
	}

	public volatile int getTopAndBottomOffset()
	{
		return super.getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method int HeaderScrollingViewBehavior.getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return view1 instanceof AppBarLayout;
	//    0    0:aload_3         
	//    1    1:instanceof      #6   <Class AppBarLayout>
	//    2    4:ireturn         
	}

	public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		offsetChildAsNeeded(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #139 <Method void offsetChildAsNeeded(View, View)>
		updateLiftedStateIfNeeded(view, view1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #141 <Method void updateLiftedStateIfNeeded(View, View)>
		return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return super.onLayoutChild(coordinatorlayout, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #145 <Method boolean HeaderScrollingViewBehavior.onLayoutChild(CoordinatorLayout, View, int)>
	//    5    7:ireturn         
	}

	public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		return super.onMeasureChild(coordinatorlayout, view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #149 <Method boolean HeaderScrollingViewBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
	//    8   13:ireturn         
	}

	public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
	{
		AppBarLayout appbarlayout = findFirstDependency(coordinatorlayout.getDependencies(view));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #157 <Method List CoordinatorLayout.getDependencies(View)>
	//    4    6:invokevirtual   #118 <Method AppBarLayout findFirstDependency(List)>
	//    5    9:astore          5
		if(appbarlayout != null)
	//*   6   11:aload           5
	//*   7   13:ifnull          67
		{
			rect.offset(view.getLeft(), view.getTop());
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #160 <Method int View.getLeft()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #73  <Method int View.getTop()>
	//   13   25:invokevirtual   #166 <Method void Rect.offset(int, int)>
			view = ((View) (tempRect1));
	//   14   28:aload_0         
	//   15   29:getfield        #170 <Field Rect tempRect1>
	//   16   32:astore_2        
			((Rect) (view)).set(0, 0, coordinatorlayout.getWidth(), coordinatorlayout.getHeight());
	//   17   33:aload_2         
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:invokevirtual   #173 <Method int CoordinatorLayout.getWidth()>
	//   22   40:aload_1         
	//   23   41:invokevirtual   #176 <Method int CoordinatorLayout.getHeight()>
	//   24   44:invokevirtual   #180 <Method void Rect.set(int, int, int, int)>
			if(!((Rect) (view)).contains(rect))
	//*  25   47:aload_2         
	//*  26   48:aload_3         
	//*  27   49:invokevirtual   #184 <Method boolean Rect.contains(Rect)>
	//*  28   52:ifne            67
			{
				appbarlayout.setExpanded(false, flag ^ true);
	//   29   55:aload           5
	//   30   57:iconst_0        
	//   31   58:iload           4
	//   32   60:iconst_1        
	//   33   61:ixor            
	//   34   62:invokevirtual   #188 <Method void AppBarLayout.setExpanded(boolean, boolean)>
				return true;
	//   35   65:iconst_1        
	//   36   66:ireturn         
			}
		}
		return false;
	//   37   67:iconst_0        
	//   38   68:ireturn         
	}

	public volatile boolean setTopAndBottomOffset(int i)
	{
		return super.setTopAndBottomOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #192 <Method boolean HeaderScrollingViewBehavior.setTopAndBottomOffset(int)>
	//    3    5:ireturn         
	}

	public AppBarLayout$ScrollingViewBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HeaderScrollingViewBehavior()>
	//    2    4:return          
	}

	public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void HeaderScrollingViewBehavior(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ScrollingViewBehavior_Layout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #21  <Field int[] android.support.design.R$styleable.ScrollingViewBehavior_Layout>
	//    7   11:invokevirtual   #27  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		setOverlayTop(((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #31  <Field int android.support.design.R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop>
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   14   24:invokevirtual   #41  <Method void setOverlayTop(int)>
		((TypedArray) (context)).recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #44  <Method void TypedArray.recycle()>
	//   17   31:return          
	}
}
