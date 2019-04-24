// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v4.widget:
//			AutoScrollHelper

private class AutoScrollHelper$ScrollAnimationRunnable
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
		if(!clampedscroller.isFinished() && shouldAnimate())
	//*  21   47:aload_3         
	//*  22   48:invokevirtual   #40  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
	//*  23   51:ifne            127
	//*  24   54:aload_0         
	//*  25   55:getfield        #15  <Field AutoScrollHelper this$0>
	//*  26   58:invokevirtual   #43  <Method boolean AutoScrollHelper.shouldAnimate()>
	//*  27   61:ifne            67
	//*  28   64:goto            127
		{
			if(mNeedsCancel)
	//*  29   67:aload_0         
	//*  30   68:getfield        #15  <Field AutoScrollHelper this$0>
	//*  31   71:getfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
	//*  32   74:ifeq            92
			{
				mNeedsCancel = false;
	//   33   77:aload_0         
	//   34   78:getfield        #15  <Field AutoScrollHelper this$0>
	//   35   81:iconst_0        
	//   36   82:putfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
				cancelTargetTouch();
	//   37   85:aload_0         
	//   38   86:getfield        #15  <Field AutoScrollHelper this$0>
	//   39   89:invokevirtual   #49  <Method void AutoScrollHelper.cancelTargetTouch()>
			}
			clampedscroller.computeScrollDelta();
	//   40   92:aload_3         
	//   41   93:invokevirtual   #52  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
			int i = clampedscroller.getDeltaX();
	//   42   96:aload_3         
	//   43   97:invokevirtual   #56  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
	//   44  100:istore_1        
			int j = clampedscroller.getDeltaY();
	//   45  101:aload_3         
	//   46  102:invokevirtual   #59  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
	//   47  105:istore_2        
			scrollTargetBy(i, j);
	//   48  106:aload_0         
	//   49  107:getfield        #15  <Field AutoScrollHelper this$0>
	//   50  110:iload_1         
	//   51  111:iload_2         
	//   52  112:invokevirtual   #63  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
			ViewCompat.postOnAnimation(mTarget, ((Runnable) (this)));
	//   53  115:aload_0         
	//   54  116:getfield        #15  <Field AutoScrollHelper this$0>
	//   55  119:getfield        #67  <Field android.view.View AutoScrollHelper.mTarget>
	//   56  122:aload_0         
	//   57  123:invokestatic    #73  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   58  126:return          
		} else
		{
			mAnimating = false;
	//   59  127:aload_0         
	//   60  128:getfield        #15  <Field AutoScrollHelper this$0>
	//   61  131:iconst_0        
	//   62  132:putfield        #24  <Field boolean AutoScrollHelper.mAnimating>
			return;
	//   63  135:return          
		}
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
