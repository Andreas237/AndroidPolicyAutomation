// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.view.View;

// Referenced classes of package com.bumptech.glide.request.target:
//			CustomViewTarget

class CustomViewTarget$1
	implements android.view.hangeListener
{

	public void onViewAttachedToWindow(View view)
	{
		resumeMyRequest();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CustomViewTarget this$0>
	//    2    4:invokevirtual   #26  <Method void CustomViewTarget.resumeMyRequest()>
	//    3    7:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		pauseMyRequest();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CustomViewTarget this$0>
	//    2    4:invokevirtual   #30  <Method void CustomViewTarget.pauseMyRequest()>
	//    3    7:return          
	}

	final CustomViewTarget this$0;

	CustomViewTarget$1()
	{
		this$0 = CustomViewTarget.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CustomViewTarget this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
