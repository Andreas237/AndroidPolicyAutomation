// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import com.github.amlcurran.showcaseview.targets.Target;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView, ShotStateStore, AnimationFactory

class ShowcaseView$1
	implements Runnable
{

	public void run()
	{
		if(!ShowcaseView.access$000(ShowcaseView.this).hasShot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ShowcaseView this$0>
	//*   2    4:invokestatic    #34  <Method ShotStateStore ShowcaseView.access$000(ShowcaseView)>
	//*   3    7:invokevirtual   #40  <Method boolean ShotStateStore.hasShot()>
	//*   4   10:ifne            93
		{
			ShowcaseView.access$100(ShowcaseView.this);
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field ShowcaseView this$0>
	//    7   17:invokestatic    #44  <Method void ShowcaseView.access$100(ShowcaseView)>
			android.graphics.Point point = val$target.getPoint();
	//    8   20:aload_0         
	//    9   21:getfield        #23  <Field Target val$target>
	//   10   24:invokeinterface #50  <Method android.graphics.Point Target.getPoint()>
	//   11   29:astore_1        
			if(point != null)
	//*  12   30:aload_1         
	//*  13   31:ifnull          77
			{
				ShowcaseView.access$202(ShowcaseView.this, false);
	//   14   34:aload_0         
	//   15   35:getfield        #21  <Field ShowcaseView this$0>
	//   16   38:iconst_0        
	//   17   39:invokestatic    #54  <Method boolean ShowcaseView.access$202(ShowcaseView, boolean)>
	//   18   42:pop             
				if(val$animate)
	//*  19   43:aload_0         
	//*  20   44:getfield        #25  <Field boolean val$animate>
	//*  21   47:ifeq            68
				{
					ShowcaseView.access$300(ShowcaseView.this).animateTargetToPoint(ShowcaseView.this, point);
	//   22   50:aload_0         
	//   23   51:getfield        #21  <Field ShowcaseView this$0>
	//   24   54:invokestatic    #58  <Method AnimationFactory ShowcaseView.access$300(ShowcaseView)>
	//   25   57:aload_0         
	//   26   58:getfield        #21  <Field ShowcaseView this$0>
	//   27   61:aload_1         
	//   28   62:invokeinterface #64  <Method void AnimationFactory.animateTargetToPoint(ShowcaseView, android.graphics.Point)>
					return;
	//   29   67:return          
				} else
				{
					setShowcasePosition(point);
	//   30   68:aload_0         
	//   31   69:getfield        #21  <Field ShowcaseView this$0>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #68  <Method void ShowcaseView.setShowcasePosition(android.graphics.Point)>
					return;
	//   34   76:return          
				}
			}
			ShowcaseView.access$202(ShowcaseView.this, true);
	//   35   77:aload_0         
	//   36   78:getfield        #21  <Field ShowcaseView this$0>
	//   37   81:iconst_1        
	//   38   82:invokestatic    #54  <Method boolean ShowcaseView.access$202(ShowcaseView, boolean)>
	//   39   85:pop             
			invalidate();
	//   40   86:aload_0         
	//   41   87:getfield        #21  <Field ShowcaseView this$0>
	//   42   90:invokevirtual   #71  <Method void ShowcaseView.invalidate()>
		}
	//   43   93:return          
	}

	final ShowcaseView this$0;
	final boolean val$animate;
	final Target val$target;

	ShowcaseView$1()
	{
		this$0 = final_showcaseview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ShowcaseView this$0>
		val$target = target1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Target val$target>
		val$animate = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$animate>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
