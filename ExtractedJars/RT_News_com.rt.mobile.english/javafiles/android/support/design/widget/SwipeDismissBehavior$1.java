// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior

class SwipeDismissBehavior$1 extends android.support.v4.widget.
{

	private boolean shouldDismiss(View view, float f)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(f != 0.0F)
	//*   2    3:fload_2         
	//*   3    4:fconst_0        
	//*   4    5:fcmpl           
	//*   5    6:ifeq            106
		{
			boolean flag;
			if(ViewCompat.getLayoutDirection(view) == 1)
	//*   6    9:aload_1         
	//*   7   10:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
	//*   8   13:iconst_1        
	//*   9   14:icmpne          22
				flag = true;
	//   10   17:iconst_1        
	//   11   18:istore_3        
			else
	//*  12   19:goto            24
				flag = false;
	//   13   22:iconst_0        
	//   14   23:istore_3        
			if(mSwipeDirection == 2)
	//*  15   24:aload_0         
	//*  16   25:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  17   28:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  18   31:iconst_2        
	//*  19   32:icmpne          37
				return true;
	//   20   35:iconst_1        
	//   21   36:ireturn         
			if(mSwipeDirection == 0)
	//*  22   37:aload_0         
	//*  23   38:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  24   41:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  25   44:ifne            70
				return flag ? f >= 0.0F : f <= 0.0F;
	//   26   47:iload_3         
	//   27   48:ifeq            59
	//   28   51:fload_2         
	//   29   52:fconst_0        
	//   30   53:fcmpg           
	//   31   54:ifge            68
	//   32   57:iconst_1        
	//   33   58:ireturn         
	//   34   59:fload_2         
	//   35   60:fconst_0        
	//   36   61:fcmpl           
	//   37   62:ifle            68
	//   38   65:goto            57
	//   39   68:iconst_0        
	//   40   69:ireturn         
			if(mSwipeDirection == 1)
	//*  41   70:aload_0         
	//*  42   71:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  43   74:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  44   77:iconst_1        
	//*  45   78:icmpne          104
				return flag ? f <= 0.0F : f >= 0.0F;
	//   46   81:iload_3         
	//   47   82:ifeq            93
	//   48   85:fload_2         
	//   49   86:fconst_0        
	//   50   87:fcmpl           
	//   51   88:ifle            102
	//   52   91:iconst_1        
	//   53   92:ireturn         
	//   54   93:fload_2         
	//   55   94:fconst_0        
	//   56   95:fcmpg           
	//   57   96:ifge            102
	//   58   99:goto            91
	//   59  102:iconst_0        
	//   60  103:ireturn         
			else
				return false;
	//   61  104:iconst_0        
	//   62  105:ireturn         
		}
		int i = view.getLeft();
	//   63  106:aload_1         
	//   64  107:invokevirtual   #40  <Method int View.getLeft()>
	//   65  110:istore_3        
		int j = mOriginalCapturedViewLeft;
	//   66  111:aload_0         
	//   67  112:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   68  115:istore          4
		int k = Math.round((float)view.getWidth() * mDragDismissThreshold);
	//   69  117:aload_1         
	//   70  118:invokevirtual   #45  <Method int View.getWidth()>
	//   71  121:i2f             
	//   72  122:aload_0         
	//   73  123:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   74  126:getfield        #49  <Field float SwipeDismissBehavior.mDragDismissThreshold>
	//   75  129:fmul            
	//   76  130:invokestatic    #55  <Method int Math.round(float)>
	//   77  133:istore          5
		if(Math.abs(i - j) >= k)
	//*  78  135:iload_3         
	//*  79  136:iload           4
	//*  80  138:isub            
	//*  81  139:invokestatic    #59  <Method int Math.abs(int)>
	//*  82  142:iload           5
	//*  83  144:icmplt          150
			flag1 = true;
	//   84  147:iconst_1        
	//   85  148:istore          6
		return flag1;
	//   86  150:iload           6
	//   87  152:ireturn         
	}

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		if(ViewCompat.getLayoutDirection(view) == 1)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			j = 1;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		int k;
		if(mSwipeDirection == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  11   19:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  12   22:ifne            69
		{
			if(j != 0)
	//*  13   25:iload_3         
	//*  14   26:ifeq            48
			{
				k = mOriginalCapturedViewLeft - view.getWidth();
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #45  <Method int View.getWidth()>
	//   19   37:isub            
	//   20   38:istore          4
				j = mOriginalCapturedViewLeft;
	//   21   40:aload_0         
	//   22   41:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   23   44:istore_3        
			} else
	//*  24   45:goto            147
			{
				k = mOriginalCapturedViewLeft;
	//   25   48:aload_0         
	//   26   49:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   27   52:istore          4
				j = mOriginalCapturedViewLeft;
	//   28   54:aload_0         
	//   29   55:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   30   58:istore_3        
				j = view.getWidth() + j;
	//   31   59:aload_1         
	//   32   60:invokevirtual   #45  <Method int View.getWidth()>
	//   33   63:iload_3         
	//   34   64:iadd            
	//   35   65:istore_3        
			}
		} else
	//*  36   66:goto            147
		if(mSwipeDirection == 1)
	//*  37   69:aload_0         
	//*  38   70:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  39   73:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  40   76:iconst_1        
	//*  41   77:icmpne          124
		{
			if(j != 0)
	//*  42   80:iload_3         
	//*  43   81:ifeq            105
			{
				k = mOriginalCapturedViewLeft;
	//   44   84:aload_0         
	//   45   85:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   46   88:istore          4
				j = mOriginalCapturedViewLeft;
	//   47   90:aload_0         
	//   48   91:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   49   94:istore_3        
				j = view.getWidth() + j;
	//   50   95:aload_1         
	//   51   96:invokevirtual   #45  <Method int View.getWidth()>
	//   52   99:iload_3         
	//   53  100:iadd            
	//   54  101:istore_3        
			} else
	//*  55  102:goto            147
			{
				k = mOriginalCapturedViewLeft - view.getWidth();
	//   56  105:aload_0         
	//   57  106:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   58  109:aload_1         
	//   59  110:invokevirtual   #45  <Method int View.getWidth()>
	//   60  113:isub            
	//   61  114:istore          4
				j = mOriginalCapturedViewLeft;
	//   62  116:aload_0         
	//   63  117:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   64  120:istore_3        
			}
		} else
	//*  65  121:goto            147
		{
			k = mOriginalCapturedViewLeft - view.getWidth();
	//   66  124:aload_0         
	//   67  125:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   68  128:aload_1         
	//   69  129:invokevirtual   #45  <Method int View.getWidth()>
	//   70  132:isub            
	//   71  133:istore          4
			j = mOriginalCapturedViewLeft;
	//   72  135:aload_0         
	//   73  136:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   74  139:istore_3        
			j = view.getWidth() + j;
	//   75  140:aload_1         
	//   76  141:invokevirtual   #45  <Method int View.getWidth()>
	//   77  144:iload_3         
	//   78  145:iadd            
	//   79  146:istore_3        
		}
		return SwipeDismissBehavior.clamp(k, i, j);
	//   80  147:iload           4
	//   81  149:iload_2         
	//   82  150:iload_3         
	//   83  151:invokestatic    #65  <Method int SwipeDismissBehavior.clamp(int, int, int)>
	//   84  154:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #69  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		return view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method int View.getWidth()>
	//    2    4:ireturn         
	}

	public void onViewCaptured(View view, int i)
	{
		mActivePointerId = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #22  <Field int mActivePointerId>
		mOriginalCapturedViewLeft = view.getLeft();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method int View.getLeft()>
	//    6   10:putfield        #42  <Field int mOriginalCapturedViewLeft>
		view = ((View) (view.getParent()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method ViewParent View.getParent()>
	//    9   17:astore_1        
		if(view != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          29
			((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
	//   12   22:aload_1         
	//   13   23:iconst_1        
	//   14   24:invokeinterface #82  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   15   29:return          
	}

	public void onViewDragStateChanged(int i)
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*   2    4:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//*   3    7:ifnull          23
			mListener.onDragStateChanged(i);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    6   14:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//    7   17:iload_1         
	//    8   18:invokeinterface #93  <Method void SwipeDismissBehavior$OnDismissListener.onDragStateChanged(int)>
	//    9   23:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		float f = (float)mOriginalCapturedViewLeft + (float)view.getWidth() * mAlphaStartSwipeDistance;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//    2    4:i2f             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method int View.getWidth()>
	//    5    9:i2f             
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    8   14:getfield        #98  <Field float SwipeDismissBehavior.mAlphaStartSwipeDistance>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:fstore          6
		float f1 = (float)mOriginalCapturedViewLeft + (float)view.getWidth() * mAlphaEndSwipeDistance;
	//   12   21:aload_0         
	//   13   22:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   14   25:i2f             
	//   15   26:aload_1         
	//   16   27:invokevirtual   #45  <Method int View.getWidth()>
	//   17   30:i2f             
	//   18   31:aload_0         
	//   19   32:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   20   35:getfield        #101 <Field float SwipeDismissBehavior.mAlphaEndSwipeDistance>
	//   21   38:fmul            
	//   22   39:fadd            
	//   23   40:fstore          7
		float f2 = i;
	//   24   42:iload_2         
	//   25   43:i2f             
	//   26   44:fstore          8
		if(f2 <= f)
	//*  27   46:fload           8
	//*  28   48:fload           6
	//*  29   50:fcmpg           
	//*  30   51:ifgt            60
		{
			view.setAlpha(1.0F);
	//   31   54:aload_1         
	//   32   55:fconst_1        
	//   33   56:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   34   59:return          
		}
		if(f2 >= f1)
	//*  35   60:fload           8
	//*  36   62:fload           7
	//*  37   64:fcmpl           
	//*  38   65:iflt            74
		{
			view.setAlpha(0.0F);
	//   39   68:aload_1         
	//   40   69:fconst_0        
	//   41   70:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   42   73:return          
		} else
		{
			view.setAlpha(SwipeDismissBehavior.clamp(0.0F, 1.0F - SwipeDismissBehavior.fraction(f, f1, f2), 1.0F));
	//   43   74:aload_1         
	//   44   75:fconst_0        
	//   45   76:fconst_1        
	//   46   77:fload           6
	//   47   79:fload           7
	//   48   81:fload           8
	//   49   83:invokestatic    #109 <Method float SwipeDismissBehavior.fraction(float, float, float)>
	//   50   86:fsub            
	//   51   87:fconst_1        
	//   52   88:invokestatic    #111 <Method float SwipeDismissBehavior.clamp(float, float, float)>
	//   53   91:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   54   94:return          
		}
	}

	public void onViewReleased(View view, float f, float f1)
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #22  <Field int mActivePointerId>
		int i = view.getWidth();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method int View.getWidth()>
	//    5    9:istore          4
		boolean flag;
		if(shouldDismiss(view, f))
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:fload_2         
	//*   9   14:invokespecial   #115 <Method boolean shouldDismiss(View, float)>
	//*  10   17:ifeq            58
		{
			if(view.getLeft() < mOriginalCapturedViewLeft)
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #40  <Method int View.getLeft()>
	//*  13   24:aload_0         
	//*  14   25:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//*  15   28:icmpge          43
				i = mOriginalCapturedViewLeft - i;
	//   16   31:aload_0         
	//   17   32:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   18   35:iload           4
	//   19   37:isub            
	//   20   38:istore          4
			else
	//*  21   40:goto            52
				i = mOriginalCapturedViewLeft + i;
	//   22   43:aload_0         
	//   23   44:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   24   47:iload           4
	//   25   49:iadd            
	//   26   50:istore          4
			flag = true;
	//   27   52:iconst_1        
	//   28   53:istore          5
		} else
	//*  29   55:goto            67
		{
			i = mOriginalCapturedViewLeft;
	//   30   58:aload_0         
	//   31   59:getfield        #42  <Field int mOriginalCapturedViewLeft>
	//   32   62:istore          4
			flag = false;
	//   33   64:iconst_0        
	//   34   65:istore          5
		}
		if(mViewDragHelper.settleCapturedViewAt(i, view.getTop()))
	//*  35   67:aload_0         
	//*  36   68:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  37   71:getfield        #119 <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
	//*  38   74:iload           4
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #69  <Method int View.getTop()>
	//*  41   80:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  42   83:ifeq            105
		{
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(SwipeDismissBehavior.this, view, flag))));
	//   43   86:aload_1         
	//   44   87:new             #127 <Class SwipeDismissBehavior$SettleRunnable>
	//   45   90:dup             
	//   46   91:aload_0         
	//   47   92:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   48   95:aload_1         
	//   49   96:iload           5
	//   50   98:invokespecial   #130 <Method void SwipeDismissBehavior$SettleRunnable(SwipeDismissBehavior, View, boolean)>
	//   51  101:invokestatic    #134 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   52  104:return          
		}
		if(flag && mListener != null)
	//*  53  105:iload           5
	//*  54  107:ifeq            133
	//*  55  110:aload_0         
	//*  56  111:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  57  114:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//*  58  117:ifnull          133
			mListener.onDismiss(view);
	//   59  120:aload_0         
	//   60  121:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   61  124:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//   62  127:aload_1         
	//   63  128:invokeinterface #138 <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
	//   64  133:return          
	}

	public boolean tryCaptureView(View view, int i)
	{
		return mActivePointerId == -1 && canSwipeDismissView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mActivePointerId>
	//    2    4:iconst_m1       
	//    3    5:icmpne          21
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #144 <Method boolean SwipeDismissBehavior.canSwipeDismissView(View)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private static final int INVALID_POINTER_ID = -1;
	private int mActivePointerId;
	private int mOriginalCapturedViewLeft;
	final SwipeDismissBehavior this$0;

	SwipeDismissBehavior$1()
	{
		this$0 = SwipeDismissBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SwipeDismissBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
		mActivePointerId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #22  <Field int mActivePointerId>
	//    8   14:return          
	}
}
