// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.view.View;

// Referenced classes of package com.facebook:
//			FacebookButtonBase

class FacebookButtonBase$1
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		FacebookButtonBase.access$000(FacebookButtonBase.this, getContext());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FacebookButtonBase this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field FacebookButtonBase this$0>
	//    4    8:invokevirtual   #26  <Method android.content.Context FacebookButtonBase.getContext()>
	//    5   11:invokestatic    #30  <Method void FacebookButtonBase.access$000(FacebookButtonBase, android.content.Context)>
		if(FacebookButtonBase.access$100(FacebookButtonBase.this) != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #17  <Field FacebookButtonBase this$0>
	//*   8   18:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
	//*   9   21:ifnull          38
		{
			FacebookButtonBase.access$100(FacebookButtonBase.this).onClick(view);
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field FacebookButtonBase this$0>
	//   12   28:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
	//   13   31:aload_1         
	//   14   32:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
			return;
	//   15   37:return          
		}
		if(FacebookButtonBase.access$200(FacebookButtonBase.this) != null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #17  <Field FacebookButtonBase this$0>
	//*  18   42:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
	//*  19   45:ifnull          61
			FacebookButtonBase.access$200(FacebookButtonBase.this).onClick(view);
	//   20   48:aload_0         
	//   21   49:getfield        #17  <Field FacebookButtonBase this$0>
	//   22   52:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
	//   23   55:aload_1         
	//   24   56:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
	//   25   61:return          
	}

	final FacebookButtonBase this$0;

	FacebookButtonBase$1()
	{
		this$0 = FacebookButtonBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FacebookButtonBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
