// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.feed.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.feed.view:
//			BaseFeedCardView

class BaseFeedCardView$1
	implements android.widget.ctory
{

	public View makeView()
	{
		return ((View) (new ImageView(BaseFeedCardView.access$000(BaseFeedCardView.this).getApplicationContext())));
	//    0    0:new             #24  <Class ImageView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field BaseFeedCardView this$0>
	//    4    8:invokestatic    #28  <Method Context BaseFeedCardView.access$000(BaseFeedCardView)>
	//    5   11:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//    6   14:invokespecial   #35  <Method void ImageView(Context)>
	//    7   17:areturn         
	}

	final BaseFeedCardView this$0;

	BaseFeedCardView$1()
	{
		this$0 = BaseFeedCardView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseFeedCardView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
