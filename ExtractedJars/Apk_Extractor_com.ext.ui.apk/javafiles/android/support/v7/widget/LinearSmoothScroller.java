// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller extends RecyclerView.SmoothScroller
{

	public LinearSmoothScroller(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void RecyclerView$SmoothScroller()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class LinearInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void LinearInterpolator()>
	//    6   12:putfield        #43  <Field LinearInterpolator mLinearInterpolator>
	//    7   15:aload_0         
	//    8   16:new             #45  <Class DecelerateInterpolator>
	//    9   19:dup             
	//   10   20:invokespecial   #46  <Method void DecelerateInterpolator()>
	//   11   23:putfield        #48  <Field DecelerateInterpolator mDecelerateInterpolator>
		mInterimTargetDx = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #50  <Field int mInterimTargetDx>
		mInterimTargetDy = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #52  <Field int mInterimTargetDy>
		MILLISECONDS_PER_PX = calculateSpeedPerPixel(context.getResources().getDisplayMetrics());
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #58  <Method Resources Context.getResources()>
	//   22   42:invokevirtual   #64  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   23   45:invokevirtual   #68  <Method float calculateSpeedPerPixel(DisplayMetrics)>
	//   24   48:putfield        #70  <Field float MILLISECONDS_PER_PX>
	//   25   51:return          
	}

	private int clampApplyScroll(int i, int j)
	{
		int k = i - j;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:isub            
	//    3    3:istore_3        
		j = k;
	//    4    4:iload_3         
	//    5    5:istore_2        
		if(i * k <= 0)
	//*   6    6:iload_1         
	//*   7    7:iload_3         
	//*   8    8:imul            
	//*   9    9:ifgt            14
			j = 0;
	//   10   12:iconst_0        
	//   11   13:istore_2        
		return j;
	//   12   14:iload_2         
	//   13   15:ireturn         
	}

	public int calculateDtToFit(int i, int j, int k, int l, int i1)
	{
		i1;
	//    0    0:iload           5
		JVM INSTR tableswitch -1 1: default 28
	//	               -1 38
	//	               0 49
	//	               1 44;
	//    1    2:tableswitch     -1 1: default 28
	//	               -1 38
	//	               0 49
	//	               1 44
		   goto _L1 _L2 _L3 _L4
_L1:
		throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
	//    2   28:new             #77  <Class IllegalArgumentException>
	//    3   31:dup             
	//    4   32:ldc1            #79  <String "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_">
	//    5   34:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//    6   37:athrow          
_L2:
		i = k - i;
	//    7   38:iload_3         
	//    8   39:iload_1         
	//    9   40:isub            
	//   10   41:istore_1        
_L6:
		return i;
	//   11   42:iload_1         
	//   12   43:ireturn         
_L4:
		return l - j;
	//   13   44:iload           4
	//   14   46:iload_2         
	//   15   47:isub            
	//   16   48:ireturn         
_L3:
		k -= i;
	//   17   49:iload_3         
	//   18   50:iload_1         
	//   19   51:isub            
	//   20   52:istore_3        
		i = k;
	//   21   53:iload_3         
	//   22   54:istore_1        
		if(k <= 0)
	//*  23   55:iload_3         
	//*  24   56:ifgt            42
		{
			j = l - j;
	//   25   59:iload           4
	//   26   61:iload_2         
	//   27   62:isub            
	//   28   63:istore_2        
			i = j;
	//   29   64:iload_2         
	//   30   65:istore_1        
			if(j >= 0)
	//*  31   66:iload_2         
	//*  32   67:iflt            42
				return 0;
	//   33   70:iconst_0        
	//   34   71:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public int calculateDxToMakeVisible(View view, int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_3        
		if(layoutmanager == null || !layoutmanager.canScrollHorizontally())
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*   7   13:ifne            18
		{
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		} else
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   22:checkcast       #102 <Class RecyclerView$LayoutParams>
	//   13   25:astore          4
			return calculateDtToFit(layoutmanager.getDecoratedLeft(view) - layoutparams.leftMargin, layoutmanager.getDecoratedRight(view) + layoutparams.rightMargin, layoutmanager.getPaddingLeft(), layoutmanager.getWidth() - layoutmanager.getPaddingRight(), i);
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #106 <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
	//   18   33:aload           4
	//   19   35:getfield        #109 <Field int RecyclerView$LayoutParams.leftMargin>
	//   20   38:isub            
	//   21   39:aload_3         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #112 <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
	//   24   44:aload           4
	//   25   46:getfield        #115 <Field int RecyclerView$LayoutParams.rightMargin>
	//   26   49:iadd            
	//   27   50:aload_3         
	//   28   51:invokevirtual   #119 <Method int RecyclerView$LayoutManager.getPaddingLeft()>
	//   29   54:aload_3         
	//   30   55:invokevirtual   #122 <Method int RecyclerView$LayoutManager.getWidth()>
	//   31   58:aload_3         
	//   32   59:invokevirtual   #125 <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//   33   62:isub            
	//   34   63:iload_2         
	//   35   64:invokevirtual   #127 <Method int calculateDtToFit(int, int, int, int, int)>
	//   36   67:ireturn         
		}
	}

	public int calculateDyToMakeVisible(View view, int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_3        
		if(layoutmanager == null || !layoutmanager.canScrollVertically())
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #131 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*   7   13:ifne            18
		{
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		} else
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   22:checkcast       #102 <Class RecyclerView$LayoutParams>
	//   13   25:astore          4
			return calculateDtToFit(layoutmanager.getDecoratedTop(view) - layoutparams.topMargin, layoutmanager.getDecoratedBottom(view) + layoutparams.bottomMargin, layoutmanager.getPaddingTop(), layoutmanager.getHeight() - layoutmanager.getPaddingBottom(), i);
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #134 <Method int RecyclerView$LayoutManager.getDecoratedTop(View)>
	//   18   33:aload           4
	//   19   35:getfield        #137 <Field int RecyclerView$LayoutParams.topMargin>
	//   20   38:isub            
	//   21   39:aload_3         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #140 <Method int RecyclerView$LayoutManager.getDecoratedBottom(View)>
	//   24   44:aload           4
	//   25   46:getfield        #143 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   26   49:iadd            
	//   27   50:aload_3         
	//   28   51:invokevirtual   #146 <Method int RecyclerView$LayoutManager.getPaddingTop()>
	//   29   54:aload_3         
	//   30   55:invokevirtual   #149 <Method int RecyclerView$LayoutManager.getHeight()>
	//   31   58:aload_3         
	//   32   59:invokevirtual   #152 <Method int RecyclerView$LayoutManager.getPaddingBottom()>
	//   33   62:isub            
	//   34   63:iload_2         
	//   35   64:invokevirtual   #127 <Method int calculateDtToFit(int, int, int, int, int)>
	//   36   67:ireturn         
		}
	}

	protected float calculateSpeedPerPixel(DisplayMetrics displaymetrics)
	{
		return 25F / (float)displaymetrics.densityDpi;
	//    0    0:ldc1            #10  <Float 25F>
	//    1    2:aload_1         
	//    2    3:getfield        #157 <Field int DisplayMetrics.densityDpi>
	//    3    6:i2f             
	//    4    7:fdiv            
	//    5    8:freturn         
	}

	protected int calculateTimeForDeceleration(int i)
	{
		return (int)Math.ceil((double)calculateTimeForScrolling(i) / 0.33560000000000001D);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #162 <Method int calculateTimeForScrolling(int)>
	//    3    5:i2d             
	//    4    6:ldc2w           #163 <Double 0.33560000000000001D>
	//    5    9:ddiv            
	//    6   10:invokestatic    #170 <Method double Math.ceil(double)>
	//    7   13:d2i             
	//    8   14:ireturn         
	}

	protected int calculateTimeForScrolling(int i)
	{
		return (int)Math.ceil((float)Math.abs(i) * MILLISECONDS_PER_PX);
	//    0    0:iload_1         
	//    1    1:invokestatic    #173 <Method int Math.abs(int)>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field float MILLISECONDS_PER_PX>
	//    5    9:fmul            
	//    6   10:f2d             
	//    7   11:invokestatic    #170 <Method double Math.ceil(double)>
	//    8   14:d2i             
	//    9   15:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_2        
		if(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #178 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   5    9:ifeq            23
		{
			return ((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(i);
	//    6   12:aload_2         
	//    7   13:checkcast       #178 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//    8   16:iload_1         
	//    9   17:invokeinterface #180 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   10   22:areturn         
		} else
		{
			Log.w("LinearSmoothScroller", (new StringBuilder()).append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ").append(((Class) (android/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider)).getCanonicalName()).toString());
	//   11   23:ldc1            #20  <String "LinearSmoothScroller">
	//   12   25:new             #182 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:invokespecial   #183 <Method void StringBuilder()>
	//   15   32:ldc1            #185 <String "You should override computeScrollVectorForPosition when the LayoutManager does not implement ">
	//   16   34:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc1            #178 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   18   39:invokevirtual   #195 <Method String Class.getCanonicalName()>
	//   19   42:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   21   48:invokestatic    #204 <Method int Log.w(String, String)>
	//   22   51:pop             
			return null;
	//   23   52:aconst_null     
	//   24   53:areturn         
		}
	}

	protected int getHorizontalSnapPreference()
	{
		if(mTargetVector == null || mTargetVector.x == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field PointF mTargetVector>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #208 <Field PointF mTargetVector>
	//*   5   11:getfield        #213 <Field float PointF.x>
	//*   6   14:fconst_0        
	//*   7   15:fcmpl           
	//*   8   16:ifne            21
			return 0;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		return mTargetVector.x <= 0.0F ? -1 : 1;
	//   11   21:aload_0         
	//   12   22:getfield        #208 <Field PointF mTargetVector>
	//   13   25:getfield        #213 <Field float PointF.x>
	//   14   28:fconst_0        
	//   15   29:fcmpl           
	//   16   30:ifle            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_m1       
	//   20   36:ireturn         
	}

	protected int getVerticalSnapPreference()
	{
		if(mTargetVector == null || mTargetVector.y == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field PointF mTargetVector>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #208 <Field PointF mTargetVector>
	//*   5   11:getfield        #217 <Field float PointF.y>
	//*   6   14:fconst_0        
	//*   7   15:fcmpl           
	//*   8   16:ifne            21
			return 0;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		return mTargetVector.y <= 0.0F ? -1 : 1;
	//   11   21:aload_0         
	//   12   22:getfield        #208 <Field PointF mTargetVector>
	//   13   25:getfield        #217 <Field float PointF.y>
	//   14   28:fconst_0        
	//   15   29:fcmpl           
	//   16   30:ifle            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_m1       
	//   20   36:ireturn         
	}

	protected void onSeekTargetStep(int i, int j, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #222 <Method int getChildCount()>
	//*   2    4:ifne            12
		{
			stop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #225 <Method void stop()>
		} else
	//*   5   11:return          
		{
			mInterimTargetDx = clampApplyScroll(mInterimTargetDx, i);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field int mInterimTargetDx>
	//   10   18:iload_1         
	//   11   19:invokespecial   #227 <Method int clampApplyScroll(int, int)>
	//   12   22:putfield        #50  <Field int mInterimTargetDx>
			mInterimTargetDy = clampApplyScroll(mInterimTargetDy, j);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #52  <Field int mInterimTargetDy>
	//   17   31:iload_2         
	//   18   32:invokespecial   #227 <Method int clampApplyScroll(int, int)>
	//   19   35:putfield        #52  <Field int mInterimTargetDy>
			if(mInterimTargetDx == 0 && mInterimTargetDy == 0)
	//*  20   38:aload_0         
	//*  21   39:getfield        #50  <Field int mInterimTargetDx>
	//*  22   42:ifne            11
	//*  23   45:aload_0         
	//*  24   46:getfield        #52  <Field int mInterimTargetDy>
	//*  25   49:ifne            11
			{
				updateActionForInterimTarget(action);
	//   26   52:aload_0         
	//   27   53:aload           4
	//   28   55:invokevirtual   #231 <Method void updateActionForInterimTarget(RecyclerView$SmoothScroller$Action)>
				return;
	//   29   58:return          
			}
		}
	}

	protected void onStart()
	{
	//    0    0:return          
	}

	protected void onStop()
	{
		mInterimTargetDy = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #52  <Field int mInterimTargetDy>
		mInterimTargetDx = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #50  <Field int mInterimTargetDx>
		mTargetVector = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #208 <Field PointF mTargetVector>
	//    9   15:return          
	}

	protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
	{
		int i = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #237 <Method int getHorizontalSnapPreference()>
	//    4    6:invokevirtual   #239 <Method int calculateDxToMakeVisible(View, int)>
	//    5    9:istore          4
		int j = calculateDyToMakeVisible(view, getVerticalSnapPreference());
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:invokevirtual   #241 <Method int getVerticalSnapPreference()>
	//   10   17:invokevirtual   #243 <Method int calculateDyToMakeVisible(View, int)>
	//   11   20:istore          5
		int k = calculateTimeForDeceleration((int)Math.sqrt(i * i + j * j));
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:iload           4
	//   15   27:imul            
	//   16   28:iload           5
	//   17   30:iload           5
	//   18   32:imul            
	//   19   33:iadd            
	//   20   34:i2d             
	//   21   35:invokestatic    #246 <Method double Math.sqrt(double)>
	//   22   38:d2i             
	//   23   39:invokevirtual   #248 <Method int calculateTimeForDeceleration(int)>
	//   24   42:istore          6
		if(k > 0)
	//*  25   44:iload           6
	//*  26   46:ifle            65
			action.update(-i, -j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   27   49:aload_3         
	//   28   50:iload           4
	//   29   52:ineg            
	//   30   53:iload           5
	//   31   55:ineg            
	//   32   56:iload           6
	//   33   58:aload_0         
	//   34   59:getfield        #48  <Field DecelerateInterpolator mDecelerateInterpolator>
	//   35   62:invokevirtual   #254 <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   36   65:return          
	}

	protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action)
	{
		PointF pointf = computeScrollVectorForPosition(getTargetPosition());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #257 <Method int getTargetPosition()>
	//    3    5:invokevirtual   #258 <Method PointF computeScrollVectorForPosition(int)>
	//    4    8:astore_3        
		if(pointf == null || pointf.x == 0.0F && pointf.y == 0.0F)
	//*   5    9:aload_3         
	//*   6   10:ifnull          31
	//*   7   13:aload_3         
	//*   8   14:getfield        #213 <Field float PointF.x>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifne            44
	//*  12   22:aload_3         
	//*  13   23:getfield        #217 <Field float PointF.y>
	//*  14   26:fconst_0        
	//*  15   27:fcmpl           
	//*  16   28:ifne            44
		{
			action.jumpTo(getTargetPosition());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #257 <Method int getTargetPosition()>
	//   20   36:invokevirtual   #262 <Method void RecyclerView$SmoothScroller$Action.jumpTo(int)>
			stop();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #225 <Method void stop()>
			return;
	//   23   43:return          
		} else
		{
			normalize(pointf);
	//   24   44:aload_0         
	//   25   45:aload_3         
	//   26   46:invokevirtual   #266 <Method void normalize(PointF)>
			mTargetVector = pointf;
	//   27   49:aload_0         
	//   28   50:aload_3         
	//   29   51:putfield        #208 <Field PointF mTargetVector>
			mInterimTargetDx = (int)(pointf.x * 10000F);
	//   30   54:aload_0         
	//   31   55:aload_3         
	//   32   56:getfield        #213 <Field float PointF.x>
	//   33   59:ldc2            #267 <Float 10000F>
	//   34   62:fmul            
	//   35   63:f2i             
	//   36   64:putfield        #50  <Field int mInterimTargetDx>
			mInterimTargetDy = (int)(pointf.y * 10000F);
	//   37   67:aload_0         
	//   38   68:aload_3         
	//   39   69:getfield        #217 <Field float PointF.y>
	//   40   72:ldc2            #267 <Float 10000F>
	//   41   75:fmul            
	//   42   76:f2i             
	//   43   77:putfield        #52  <Field int mInterimTargetDy>
			int i = calculateTimeForScrolling(10000);
	//   44   80:aload_0         
	//   45   81:sipush          10000
	//   46   84:invokevirtual   #162 <Method int calculateTimeForScrolling(int)>
	//   47   87:istore_2        
			action.update((int)((float)mInterimTargetDx * 1.2F), (int)((float)mInterimTargetDy * 1.2F), (int)((float)i * 1.2F), ((android.view.animation.Interpolator) (mLinearInterpolator)));
	//   48   88:aload_1         
	//   49   89:aload_0         
	//   50   90:getfield        #50  <Field int mInterimTargetDx>
	//   51   93:i2f             
	//   52   94:ldc1            #22  <Float 1.2F>
	//   53   96:fmul            
	//   54   97:f2i             
	//   55   98:aload_0         
	//   56   99:getfield        #52  <Field int mInterimTargetDy>
	//   57  102:i2f             
	//   58  103:ldc1            #22  <Float 1.2F>
	//   59  105:fmul            
	//   60  106:f2i             
	//   61  107:iload_2         
	//   62  108:i2f             
	//   63  109:ldc1            #22  <Float 1.2F>
	//   64  111:fmul            
	//   65  112:f2i             
	//   66  113:aload_0         
	//   67  114:getfield        #43  <Field LinearInterpolator mLinearInterpolator>
	//   68  117:invokevirtual   #254 <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
			return;
	//   69  120:return          
		}
	}

	private static final boolean DEBUG = false;
	private static final float MILLISECONDS_PER_INCH = 25F;
	public static final int SNAP_TO_ANY = 0;
	public static final int SNAP_TO_END = 1;
	public static final int SNAP_TO_START = -1;
	private static final String TAG = "LinearSmoothScroller";
	private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2F;
	private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
	private final float MILLISECONDS_PER_PX;
	protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
	protected int mInterimTargetDx;
	protected int mInterimTargetDy;
	protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
	protected PointF mTargetVector;
}
