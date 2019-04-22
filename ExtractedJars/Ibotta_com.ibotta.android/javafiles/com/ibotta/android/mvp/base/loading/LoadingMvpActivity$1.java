// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import android.view.View;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			LoadingMvpActivity

class LoadingMvpActivity$1 extends android.support.design.widget.ottomSheetCallback
{

	public void onSlide(View view, float f)
	{
	//    0    0:return          
	}

	public void onStateChanged(View view, int i)
	{
		if(i != 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			finish();
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field LoadingMvpActivity this$0>
	//    6   10:invokevirtual   #28  <Method void LoadingMvpActivity.finish()>
			return;
	//    7   13:return          
		}
	}

	final LoadingMvpActivity this$0;

	LoadingMvpActivity$1()
	{
		this$0 = LoadingMvpActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LoadingMvpActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.support.design.widget.BottomSheetBehavior$BottomSheetCallback()>
	//    5    9:return          
	}
}
