// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v4.widget:
//			AutoScrollHelper

class AutoScrollHelper$ScrollAnimationRunnable
	implements Runnable
{

	public void run()
	{
		if(!mAnimating)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AutoScrollHelper this$0>
	//*   2    4:getfield        #24  <Field boolean AutoScrollHelper.mAnimating>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(mNeedsReset)
	//*   5   11:aload_0         
	//*   6   12:getfield        #15  <Field AutoScrollHelper this$0>
	//*   7   15:getfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
	//*   8   18:ifeq            39
		{
			mNeedsReset = false;
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field AutoScrollHelper this$0>
	//   11   25:iconst_0        
	//   12   26:putfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
			mScroller.start();
	//   13   29:aload_0         
	//   14   30:getfield        #15  <Field AutoScrollHelper this$0>
	//   15   33:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
	//   16   36:invokevirtual   #36  <Method void AutoScrollHelper$ClampedScroller.start()>
		}
		AutoScrollHelper.ClampedScroller clampedscroller = mScroller;
	//   17   39:aload_0         
	//   18   40:getfield        #15  <Field AutoScrollHelper this$0>
	//   19   43:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
	//   20   46:astore_3        
		if(clampedscroller.isFinished() || !shouldAnimate())
	//*  21   47:aload_3         
	//*  22   48:invokevirtual   #40  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
	//*  23   51:ifne            64
	//*  24   54:aload_0         
	//*  25   55:getfield        #15  <Field AutoScrollHelper this$0>
	//*  26   58:invokevirtual   #43  <Method boolean AutoScrollHelper.shouldAnimate()>
	//*  27   61:ifne            73
		{
			mAnimating = false;
	//   28   64:aload_0         
	//   29   65:getfield        #15  <Field AutoScrollHelper this$0>
	//   30   68:iconst_0        
	//   31   69:putfield        #24  <Field boolean AutoScrollHelper.mAnimating>
			return;
	//   32   72:return          
		}
		if(mNeedsCancel)
	//*  33   73:aload_0         
	//*  34   74:getfield        #15  <Field AutoScrollHelper this$0>
	//*  35   77:getfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
	//*  36   80:ifeq            98
		{
			mNeedsCancel = false;
	//   37   83:aload_0         
	//   38   84:getfield        #15  <Field AutoScrollHelper this$0>
	//   39   87:iconst_0        
	//   40   88:putfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
			cancelTargetTouch();
	//   41   91:aload_0         
	//   42   92:getfield        #15  <Field AutoScrollHelper this$0>
	//   43   95:invokevirtual   #49  <Method void AutoScrollHelper.cancelTargetTouch()>
		}
		clampedscroller.computeScrollDelta();
	//   44   98:aload_3         
	//   45   99:invokevirtual   #52  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
		int i = clampedscroller.getDeltaX();
	//   46  102:aload_3         
	//   47  103:invokevirtual   #56  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
	//   48  106:istore_1        
		int j = clampedscroller.getDeltaY();
	//   49  107:aload_3         
	//   50  108:invokevirtual   #59  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
	//   51  111:istore_2        
		scrollTargetBy(i, j);
	//   52  112:aload_0         
	//   53  113:getfield        #15  <Field AutoScrollHelper this$0>
	//   54  116:iload_1         
	//   55  117:iload_2         
	//   56  118:invokevirtual   #63  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
		ViewCompat.postOnAnimation(mTarget, ((Runnable) (this)));
	//   57  121:aload_0         
	//   58  122:getfield        #15  <Field AutoScrollHelper this$0>
	//   59  125:getfield        #67  <Field android.view.View AutoScrollHelper.mTarget>
	//   60  128:aload_0         
	//   61  129:invokestatic    #73  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
	//   62  132:return          
	}

	final AutoScrollHelper this$0;

	AutoScrollHelper$ScrollAnimationRunnable()
	{
		this$0 = AutoScrollHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AutoScrollHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
