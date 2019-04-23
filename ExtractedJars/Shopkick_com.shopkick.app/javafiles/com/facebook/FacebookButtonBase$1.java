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
		FacebookButtonBase facebookbuttonbase = FacebookButtonBase.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FacebookButtonBase this$0>
	//    2    4:astore_2        
		FacebookButtonBase.access$000(facebookbuttonbase, facebookbuttonbase.getContext());
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #26  <Method android.content.Context FacebookButtonBase.getContext()>
	//    6   10:invokestatic    #30  <Method void FacebookButtonBase.access$000(FacebookButtonBase, android.content.Context)>
		if(FacebookButtonBase.access$100(FacebookButtonBase.this) != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #17  <Field FacebookButtonBase this$0>
	//*   9   17:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
	//*  10   20:ifnull          37
		{
			FacebookButtonBase.access$100(FacebookButtonBase.this).onClick(view);
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field FacebookButtonBase this$0>
	//   13   27:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
	//   14   30:aload_1         
	//   15   31:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
			return;
	//   16   36:return          
		}
		if(FacebookButtonBase.access$200(FacebookButtonBase.this) != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #17  <Field FacebookButtonBase this$0>
	//*  19   41:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
	//*  20   44:ifnull          60
			FacebookButtonBase.access$200(FacebookButtonBase.this).onClick(view);
	//   21   47:aload_0         
	//   22   48:getfield        #17  <Field FacebookButtonBase this$0>
	//   23   51:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
	//   24   54:aload_1         
	//   25   55:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
	//   26   60:return          
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
