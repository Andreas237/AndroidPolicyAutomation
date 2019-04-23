// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.View;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerButtonOverlayController

class APSMediaPlayerButtonOverlayController$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		overlayClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayerButtonOverlayController this$0>
	//    2    4:invokevirtual   #26  <Method void APSMediaPlayerButtonOverlayController.overlayClicked()>
	//    3    7:return          
	}

	final APSMediaPlayerButtonOverlayController this$0;

	APSMediaPlayerButtonOverlayController$1()
	{
		this$0 = APSMediaPlayerButtonOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerButtonOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
