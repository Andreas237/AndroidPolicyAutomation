// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;


// Referenced classes of package com.google.android.exoplayer2.ui:
//			AspectRatioFrameLayout

private final class AspectRatioFrameLayout$AspectRatioUpdateDispatcher
	implements Runnable
{

	public void run()
	{
		isScheduled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #31  <Field boolean isScheduled>
		if(AspectRatioFrameLayout.access$100(AspectRatioFrameLayout.this) == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field AspectRatioFrameLayout this$0>
	//*   5    9:invokestatic    #35  <Method AspectRatioFrameLayout$AspectRatioListener AspectRatioFrameLayout.access$100(AspectRatioFrameLayout)>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			AspectRatioFrameLayout.access$100(AspectRatioFrameLayout.this).onAspectRatioUpdated(targetAspectRatio, naturalAspectRatio, aspectRatioMismatch);
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field AspectRatioFrameLayout this$0>
	//   10   20:invokestatic    #35  <Method AspectRatioFrameLayout$AspectRatioListener AspectRatioFrameLayout.access$100(AspectRatioFrameLayout)>
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field float targetAspectRatio>
	//   13   27:aload_0         
	//   14   28:getfield        #39  <Field float naturalAspectRatio>
	//   15   31:aload_0         
	//   16   32:getfield        #41  <Field boolean aspectRatioMismatch>
	//   17   35:invokeinterface #47  <Method void AspectRatioFrameLayout$AspectRatioListener.onAspectRatioUpdated(float, float, boolean)>
			return;
	//   18   40:return          
		}
	}

	public void scheduleUpdate(float f, float f1, boolean flag)
	{
		targetAspectRatio = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #37  <Field float targetAspectRatio>
		naturalAspectRatio = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #39  <Field float naturalAspectRatio>
		aspectRatioMismatch = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #41  <Field boolean aspectRatioMismatch>
		if(!isScheduled)
	//*   9   15:aload_0         
	//*  10   16:getfield        #31  <Field boolean isScheduled>
	//*  11   19:ifne            36
		{
			isScheduled = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #31  <Field boolean isScheduled>
			post(((Runnable) (this)));
	//   15   27:aload_0         
	//   16   28:getfield        #21  <Field AspectRatioFrameLayout this$0>
	//   17   31:aload_0         
	//   18   32:invokevirtual   #52  <Method boolean AspectRatioFrameLayout.post(Runnable)>
	//   19   35:pop             
		}
	//   20   36:return          
	}

	private boolean aspectRatioMismatch;
	private boolean isScheduled;
	private float naturalAspectRatio;
	private float targetAspectRatio;
	final AspectRatioFrameLayout this$0;

	private AspectRatioFrameLayout$AspectRatioUpdateDispatcher()
	{
		this$0 = AspectRatioFrameLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AspectRatioFrameLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}

	AspectRatioFrameLayout$AspectRatioUpdateDispatcher(AspectRatioFrameLayout._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void AspectRatioFrameLayout$AspectRatioUpdateDispatcher(AspectRatioFrameLayout)>
	//    3    5:return          
	}
}
