// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcActivity_ViewBinding, AddUpcActivity

class AddUpcActivity_ViewBinding$2 extends DebouncingOnClickListener
{

	public void doClick(View view)
	{
		val$target.onNoClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AddUpcActivity val$target>
	//    2    4:invokevirtual   #29  <Method void AddUpcActivity.onNoClicked()>
	//    3    7:return          
	}

	final AddUpcActivity_ViewBinding this$0;
	final AddUpcActivity val$target;

	AddUpcActivity_ViewBinding$2()
	{
		this$0 = final_addupcactivity_viewbinding;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AddUpcActivity_ViewBinding this$0>
		val$target = AddUpcActivity.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field AddUpcActivity val$target>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void DebouncingOnClickListener()>
	//    8   14:return          
	}
}
