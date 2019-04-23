// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedFragment

class AppboyFeedFragment$1
	implements Runnable
{

	public void run()
	{
		if(AppboyFeedFragment.access$000(AppboyFeedFragment.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field AppboyFeedFragment this$0>
	//*   2    4:invokestatic    #23  <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
	//*   3    7:ifnull          22
			AppboyFeedFragment.access$000(AppboyFeedFragment.this).setVisibility(8);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field AppboyFeedFragment this$0>
	//    6   14:invokestatic    #23  <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
	//    7   17:bipush          8
	//    8   19:invokevirtual   #29  <Method void ProgressBar.setVisibility(int)>
		if(AppboyFeedFragment.access$100(AppboyFeedFragment.this) != null)
	//*   9   22:aload_0         
	//*  10   23:getfield        #14  <Field AppboyFeedFragment this$0>
	//*  11   26:invokestatic    #33  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
	//*  12   29:ifnull          43
			AppboyFeedFragment.access$100(AppboyFeedFragment.this).setVisibility(0);
	//   13   32:aload_0         
	//   14   33:getfield        #14  <Field AppboyFeedFragment this$0>
	//   15   36:invokestatic    #33  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
	//   16   39:iconst_0        
	//   17   40:invokevirtual   #36  <Method void LinearLayout.setVisibility(int)>
	//   18   43:return          
	}

	final AppboyFeedFragment this$0;

	AppboyFeedFragment$1()
	{
		this$0 = AppboyFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppboyFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
