// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller extends RecyclerView.SmoothScroller
{

	public LinearSmoothScroller(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void RecyclerView$SmoothScroller()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class LinearInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void LinearInterpolator()>
	//    6   12:putfield        #25  <Field LinearInterpolator mLinearInterpolator>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class DecelerateInterpolator>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void DecelerateInterpolator()>
	//   11   23:putfield        #30  <Field DecelerateInterpolator mDecelerateInterpolator>
		mInterimTargetDx = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #32  <Field int mInterimTargetDx>
		mInterimTargetDy = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #34  <Field int mInterimTargetDy>
		MILLISECONDS_PER_PX = calculateSpeedPerPixel(context.getResources().getDisplayMetrics());
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #40  <Method Resources Context.getResources()>
	//   22   42:invokevirtual   #46  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   23   45:invokevirtual   #50  <Method float calculateSpeedPerPixel(DisplayMetrics)>
	//   24   48:putfield        #52  <Field float MILLISECONDS_PER_PX>
	//   25   51:return          
	}

	private int clampApplyScroll(int i, int j)
	{
		j = i - j;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:isub            
	//    3    3:istore_2        
		if(i * j <= 0)
	//*   4    4:iload_1         
	//*   5    5:iload_2         
	//*   6    6:imul            
	//*   7    7:ifgt            12
			return 0;
	//    8   10:iconst_0        
	//    9   11:ireturn         
		else
			return j;
	//   10   12:iload_2         
	//   11   13:ireturn         
	}

	public int calculateDtToFit(int i, int j, int k, int l, int i1)
	{
		switch(i1)
	//*   0    0:iload           5
		{
	//*   1    2:tableswitch     -1 1: default 28
	//	               -1 66
	//	               0 43
	//	               1 38
		default:
			throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
	//    2   28:new             #59  <Class IllegalArgumentException>
	//    3   31:dup             
	//    4   32:ldc1            #61  <String "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_">
	//    5   34:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//    6   37:athrow          

		case 1: // '\001'
			return l - j;
	//    7   38:iload           4
	//    8   40:iload_2         
	//    9   41:isub            
	//   10   42:ireturn         

		case 0: // '\0'
			i = k - i;
	//   11   43:iload_3         
	//   12   44:iload_1         
	//   13   45:isub            
	//   14   46:istore_1        
			if(i > 0)
	//*  15   47:iload_1         
	//*  16   48:ifle            53
				return i;
	//   17   51:iload_1         
	//   18   52:ireturn         
			i = l - j;
	//   19   53:iload           4
	//   20   55:iload_2         
	//   21   56:isub            
	//   22   57:istore_1        
			if(i < 0)
	//*  23   58:iload_1         
	//*  24   59:ifge            64
				return i;
	//   25   62:iload_1         
	//   26   63:ireturn         
			else
				return 0;
	//   27   64:iconst_0        
	//   28   65:ireturn         

		case -1: 
			return k - i;
	//   29   66:iload_3         
	//   30   67:iload_1         
	//   31   68:isub            
	//   32   69:ireturn         
		}
	}

	public int calculateDxToMakeVisible(View view, int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_3        
		if(layoutmanager != null && layoutmanager.canScrollHorizontally())
	//*   3    5:aload_3         
	//*   4    6:ifnull          69
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #76  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*   7   13:ifne            19
	//*   8   16:goto            69
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #82  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   23:checkcast       #84  <Class RecyclerView$LayoutParams>
	//   12   26:astore          4
			return calculateDtToFit(layoutmanager.getDecoratedLeft(view) - layoutparams.leftMargin, layoutmanager.getDecoratedRight(view) + layoutparams.rightMargin, layoutmanager.getPaddingLeft(), layoutmanager.getWidth() - layoutmanager.getPaddingRight(), i);
	//   13   28:aload_0         
	//   14   29:aload_3         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #88  <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
	//   17   34:aload           4
	//   18   36:getfield        #91  <Field int RecyclerView$LayoutParams.leftMargin>
	//   19   39:isub            
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #94  <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
	//   23   45:aload           4
	//   24   47:getfield        #97  <Field int RecyclerView$LayoutParams.rightMargin>
	//   25   50:iadd            
	//   26   51:aload_3         
	//   27   52:invokevirtual   #101 <Method int RecyclerView$LayoutManager.getPaddingLeft()>
	//   28   55:aload_3         
	//   29   56:invokevirtual   #104 <Method int RecyclerView$LayoutManager.getWidth()>
	//   30   59:aload_3         
	//   31   60:invokevirtual   #107 <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//   32   63:isub            
	//   33   64:iload_2         
	//   34   65:invokevirtual   #109 <Method int calculateDtToFit(int, int, int, int, int)>
	//   35   68:ireturn         
		} else
		{
			return 0;
	//   36   69:iconst_0        
	//   37   70:ireturn         
		}
	}

	public int calculateDyToMakeVisible(View view, int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_3        
		if(layoutmanager != null && layoutmanager.canScrollVertically())
	//*   3    5:aload_3         
	//*   4    6:ifnull          69
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #113 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*   7   13:ifne            19
	//*   8   16:goto            69
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #82  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   23:checkcast       #84  <Class RecyclerView$LayoutParams>
	//   12   26:astore          4
			return calculateDtToFit(layoutmanager.getDecoratedTop(view) - layoutparams.topMargin, layoutmanager.getDecoratedBottom(view) + layoutparams.bottomMargin, layoutmanager.getPaddingTop(), layoutmanager.getHeight() - layoutmanager.getPaddingBottom(), i);
	//   13   28:aload_0         
	//   14   29:aload_3         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #116 <Method int RecyclerView$LayoutManager.getDecoratedTop(View)>
	//   17   34:aload           4
	//   18   36:getfield        #119 <Field int RecyclerView$LayoutParams.topMargin>
	//   19   39:isub            
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #122 <Method int RecyclerView$LayoutManager.getDecoratedBottom(View)>
	//   23   45:aload           4
	//   24   47:getfield        #125 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   25   50:iadd            
	//   26   51:aload_3         
	//   27   52:invokevirtual   #128 <Method int RecyclerView$LayoutManager.getPaddingTop()>
	//   28   55:aload_3         
	//   29   56:invokevirtual   #131 <Method int RecyclerView$LayoutManager.getHeight()>
	//   30   59:aload_3         
	//   31   60:invokevirtual   #134 <Method int RecyclerView$LayoutManager.getPaddingBottom()>
	//   32   63:isub            
	//   33   64:iload_2         
	//   34   65:invokevirtual   #109 <Method int calculateDtToFit(int, int, int, int, int)>
	//   35   68:ireturn         
		} else
		{
			return 0;
	//   36   69:iconst_0        
	//   37   70:ireturn         
		}
	}

	protected float calculateSpeedPerPixel(DisplayMetrics displaymetrics)
	{
		return 25F / (float)displaymetrics.densityDpi;
	//    0    0:ldc1            #135 <Float 25F>
	//    1    2:aload_1         
	//    2    3:getfield        #140 <Field int DisplayMetrics.densityDpi>
	//    3    6:i2f             
	//    4    7:fdiv            
	//    5    8:freturn         
	}

	protected int calculateTimeForDeceleration(int i)
	{
		return (int)Math.ceil((double)calculateTimeForScrolling(i) / 0.33560000000000001D);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #145 <Method int calculateTimeForScrolling(int)>
	//    3    5:i2d             
	//    4    6:ldc2w           #146 <Double 0.33560000000000001D>
	//    5    9:ddiv            
	//    6   10:invokestatic    #153 <Method double Math.ceil(double)>
	//    7   13:d2i             
	//    8   14:ireturn         
	}

	protected int calculateTimeForScrolling(int i)
	{
		return (int)Math.ceil((float)Math.abs(i) * MILLISECONDS_PER_PX);
	//    0    0:iload_1         
	//    1    1:invokestatic    #156 <Method int Math.abs(int)>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field float MILLISECONDS_PER_PX>
	//    5    9:fmul            
	//    6   10:f2d             
	//    7   11:invokestatic    #153 <Method double Math.ceil(double)>
	//    8   14:d2i             
	//    9   15:ireturn         
	}

	protected int getHorizontalSnapPreference()
	{
		PointF pointf = mTargetVector;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field PointF mTargetVector>
	//    2    4:astore_1        
		if(pointf != null && pointf.x != 0.0F)
	//*   3    5:aload_1         
	//*   4    6:ifnull          37
	//*   5    9:aload_1         
	//*   6   10:getfield        #164 <Field float PointF.x>
	//*   7   13:fconst_0        
	//*   8   14:fcmpl           
	//*   9   15:ifne            21
	//*  10   18:goto            37
			return mTargetVector.x <= 0.0F ? -1 : 1;
	//   11   21:aload_0         
	//   12   22:getfield        #159 <Field PointF mTargetVector>
	//   13   25:getfield        #164 <Field float PointF.x>
	//   14   28:fconst_0        
	//   15   29:fcmpl           
	//   16   30:ifle            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_m1       
	//   20   36:ireturn         
		else
			return 0;
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	protected int getVerticalSnapPreference()
	{
		PointF pointf = mTargetVector;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field PointF mTargetVector>
	//    2    4:astore_1        
		if(pointf != null && pointf.y != 0.0F)
	//*   3    5:aload_1         
	//*   4    6:ifnull          37
	//*   5    9:aload_1         
	//*   6   10:getfield        #168 <Field float PointF.y>
	//*   7   13:fconst_0        
	//*   8   14:fcmpl           
	//*   9   15:ifne            21
	//*  10   18:goto            37
			return mTargetVector.y <= 0.0F ? -1 : 1;
	//   11   21:aload_0         
	//   12   22:getfield        #159 <Field PointF mTargetVector>
	//   13   25:getfield        #168 <Field float PointF.y>
	//   14   28:fconst_0        
	//   15   29:fcmpl           
	//   16   30:ifle            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_m1       
	//   20   36:ireturn         
		else
			return 0;
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	protected void onSeekTargetStep(int i, int j, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method int getChildCount()>
	//*   2    4:ifne            12
		{
			stop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #176 <Method void stop()>
			return;
	//    5   11:return          
		}
		mInterimTargetDx = clampApplyScroll(mInterimTargetDx, i);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field int mInterimTargetDx>
	//   10   18:iload_1         
	//   11   19:invokespecial   #178 <Method int clampApplyScroll(int, int)>
	//   12   22:putfield        #32  <Field int mInterimTargetDx>
		mInterimTargetDy = clampApplyScroll(mInterimTargetDy, j);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #34  <Field int mInterimTargetDy>
	//   17   31:iload_2         
	//   18   32:invokespecial   #178 <Method int clampApplyScroll(int, int)>
	//   19   35:putfield        #34  <Field int mInterimTargetDy>
		if(mInterimTargetDx == 0 && mInterimTargetDy == 0)
	//*  20   38:aload_0         
	//*  21   39:getfield        #32  <Field int mInterimTargetDx>
	//*  22   42:ifne            58
	//*  23   45:aload_0         
	//*  24   46:getfield        #34  <Field int mInterimTargetDy>
	//*  25   49:ifne            58
			updateActionForInterimTarget(action);
	//   26   52:aload_0         
	//   27   53:aload           4
	//   28   55:invokevirtual   #182 <Method void updateActionForInterimTarget(RecyclerView$SmoothScroller$Action)>
	//   29   58:return          
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
	//    2    2:putfield        #34  <Field int mInterimTargetDy>
		mInterimTargetDx = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field int mInterimTargetDx>
		mTargetVector = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #159 <Field PointF mTargetVector>
	//    9   15:return          
	}

	protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
	{
		int i = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #188 <Method int getHorizontalSnapPreference()>
	//    4    6:invokevirtual   #190 <Method int calculateDxToMakeVisible(View, int)>
	//    5    9:istore          4
		int j = calculateDyToMakeVisible(view, getVerticalSnapPreference());
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:invokevirtual   #192 <Method int getVerticalSnapPreference()>
	//   10   17:invokevirtual   #194 <Method int calculateDyToMakeVisible(View, int)>
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
	//   21   35:invokestatic    #197 <Method double Math.sqrt(double)>
	//   22   38:d2i             
	//   23   39:invokevirtual   #199 <Method int calculateTimeForDeceleration(int)>
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
	//   34   59:getfield        #30  <Field DecelerateInterpolator mDecelerateInterpolator>
	//   35   62:invokevirtual   #205 <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   36   65:return          
	}

	protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action)
	{
		PointF pointf = computeScrollVectorForPosition(getTargetPosition());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #208 <Method int getTargetPosition()>
	//    3    5:invokevirtual   #212 <Method PointF computeScrollVectorForPosition(int)>
	//    4    8:astore_3        
		if(pointf != null && (pointf.x != 0.0F || pointf.y != 0.0F))
	//*   5    9:aload_3         
	//*   6   10:ifnull          109
	//*   7   13:aload_3         
	//*   8   14:getfield        #164 <Field float PointF.x>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifne            34
	//*  12   22:aload_3         
	//*  13   23:getfield        #168 <Field float PointF.y>
	//*  14   26:fconst_0        
	//*  15   27:fcmpl           
	//*  16   28:ifne            34
	//*  17   31:goto            109
		{
			normalize(pointf);
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #216 <Method void normalize(PointF)>
			mTargetVector = pointf;
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:putfield        #159 <Field PointF mTargetVector>
			mInterimTargetDx = (int)(pointf.x * 10000F);
	//   24   44:aload_0         
	//   25   45:aload_3         
	//   26   46:getfield        #164 <Field float PointF.x>
	//   27   49:ldc1            #217 <Float 10000F>
	//   28   51:fmul            
	//   29   52:f2i             
	//   30   53:putfield        #32  <Field int mInterimTargetDx>
			mInterimTargetDy = (int)(pointf.y * 10000F);
	//   31   56:aload_0         
	//   32   57:aload_3         
	//   33   58:getfield        #168 <Field float PointF.y>
	//   34   61:ldc1            #217 <Float 10000F>
	//   35   63:fmul            
	//   36   64:f2i             
	//   37   65:putfield        #34  <Field int mInterimTargetDy>
			int i = calculateTimeForScrolling(10000);
	//   38   68:aload_0         
	//   39   69:sipush          10000
	//   40   72:invokevirtual   #145 <Method int calculateTimeForScrolling(int)>
	//   41   75:istore_2        
			action.update((int)((float)mInterimTargetDx * 1.2F), (int)((float)mInterimTargetDy * 1.2F), (int)((float)i * 1.2F), ((android.view.animation.Interpolator) (mLinearInterpolator)));
	//   42   76:aload_1         
	//   43   77:aload_0         
	//   44   78:getfield        #32  <Field int mInterimTargetDx>
	//   45   81:i2f             
	//   46   82:ldc1            #218 <Float 1.2F>
	//   47   84:fmul            
	//   48   85:f2i             
	//   49   86:aload_0         
	//   50   87:getfield        #34  <Field int mInterimTargetDy>
	//   51   90:i2f             
	//   52   91:ldc1            #218 <Float 1.2F>
	//   53   93:fmul            
	//   54   94:f2i             
	//   55   95:iload_2         
	//   56   96:i2f             
	//   57   97:ldc1            #218 <Float 1.2F>
	//   58   99:fmul            
	//   59  100:f2i             
	//   60  101:aload_0         
	//   61  102:getfield        #25  <Field LinearInterpolator mLinearInterpolator>
	//   62  105:invokevirtual   #205 <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
			return;
	//   63  108:return          
		} else
		{
			action.jumpTo(getTargetPosition());
	//   64  109:aload_1         
	//   65  110:aload_0         
	//   66  111:invokevirtual   #208 <Method int getTargetPosition()>
	//   67  114:invokevirtual   #222 <Method void RecyclerView$SmoothScroller$Action.jumpTo(int)>
			stop();
	//   68  117:aload_0         
	//   69  118:invokevirtual   #176 <Method void stop()>
			return;
	//   70  121:return          
		}
	}

	private final float MILLISECONDS_PER_PX;
	protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
	protected int mInterimTargetDx;
	protected int mInterimTargetDy;
	protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
	protected PointF mTargetVector;
}
