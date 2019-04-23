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
	//*   8   18:ifeq            38
		{
			AutoScrollHelper autoscrollhelper = AutoScrollHelper.this;
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field AutoScrollHelper this$0>
	//   11   25:astore_3        
			autoscrollhelper.mNeedsReset = false;
	//   12   26:aload_3         
	//   13   27:iconst_0        
	//   14   28:putfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
			autoscrollhelper.mScroller.start();
	//   15   31:aload_3         
	//   16   32:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
	//   17   35:invokevirtual   #36  <Method void AutoScrollHelper$ClampedScroller.start()>
		}
		AutoScrollHelper.ClampedScroller clampedscroller = mScroller;
	//   18   38:aload_0         
	//   19   39:getfield        #15  <Field AutoScrollHelper this$0>
	//   20   42:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
	//   21   45:astore_3        
		if(!clampedscroller.isFinished() && shouldAnimate())
	//*  22   46:aload_3         
	//*  23   47:invokevirtual   #40  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
	//*  24   50:ifne            128
	//*  25   53:aload_0         
	//*  26   54:getfield        #15  <Field AutoScrollHelper this$0>
	//*  27   57:invokevirtual   #43  <Method boolean AutoScrollHelper.shouldAnimate()>
	//*  28   60:ifne            66
	//*  29   63:goto            128
		{
			if(mNeedsCancel)
	//*  30   66:aload_0         
	//*  31   67:getfield        #15  <Field AutoScrollHelper this$0>
	//*  32   70:getfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
	//*  33   73:ifeq            93
			{
				AutoScrollHelper autoscrollhelper1 = AutoScrollHelper.this;
	//   34   76:aload_0         
	//   35   77:getfield        #15  <Field AutoScrollHelper this$0>
	//   36   80:astore          4
				autoscrollhelper1.mNeedsCancel = false;
	//   37   82:aload           4
	//   38   84:iconst_0        
	//   39   85:putfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
				autoscrollhelper1.cancelTargetTouch();
	//   40   88:aload           4
	//   41   90:invokevirtual   #49  <Method void AutoScrollHelper.cancelTargetTouch()>
			}
			clampedscroller.computeScrollDelta();
	//   42   93:aload_3         
	//   43   94:invokevirtual   #52  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
			int i = clampedscroller.getDeltaX();
	//   44   97:aload_3         
	//   45   98:invokevirtual   #56  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
	//   46  101:istore_1        
			int j = clampedscroller.getDeltaY();
	//   47  102:aload_3         
	//   48  103:invokevirtual   #59  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
	//   49  106:istore_2        
			scrollTargetBy(i, j);
	//   50  107:aload_0         
	//   51  108:getfield        #15  <Field AutoScrollHelper this$0>
	//   52  111:iload_1         
	//   53  112:iload_2         
	//   54  113:invokevirtual   #63  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
			ViewCompat.postOnAnimation(mTarget, ((Runnable) (this)));
	//   55  116:aload_0         
	//   56  117:getfield        #15  <Field AutoScrollHelper this$0>
	//   57  120:getfield        #67  <Field android.view.View AutoScrollHelper.mTarget>
	//   58  123:aload_0         
	//   59  124:invokestatic    #73  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   60  127:return          
		} else
		{
			mAnimating = false;
	//   61  128:aload_0         
	//   62  129:getfield        #15  <Field AutoScrollHelper this$0>
	//   63  132:iconst_0        
	//   64  133:putfield        #24  <Field boolean AutoScrollHelper.mAnimating>
			return;
	//   65  136:return          
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
