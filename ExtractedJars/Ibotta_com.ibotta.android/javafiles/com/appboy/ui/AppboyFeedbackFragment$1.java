// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedbackFragment

class AppboyFeedbackFragment$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		if(AppboyFeedbackFragment.access$000(AppboyFeedbackFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//*   2    4:invokestatic    #27  <Method boolean AppboyFeedbackFragment.access$000(AppboyFeedbackFragment)>
	//*   3    7:ifeq            18
		{
			boolean _tmp = AppboyFeedbackFragment.access$100(AppboyFeedbackFragment.this);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//    6   14:invokestatic    #30  <Method boolean AppboyFeedbackFragment.access$100(AppboyFeedbackFragment)>
	//    7   17:pop             
		}
	//    8   18:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final AppboyFeedbackFragment this$0;

	AppboyFeedbackFragment$1()
	{
		this$0 = AppboyFeedbackFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyFeedbackFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
