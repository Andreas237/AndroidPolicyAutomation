// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.ActionMode;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionBarContextView

class ActionBarContextView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		val$mode.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ActionMode val$mode>
	//    2    4:invokevirtual   #32  <Method void ActionMode.finish()>
	//    3    7:return          
	}

	final ActionBarContextView this$0;
	final ActionMode val$mode;

	ActionBarContextView$1()
	{
		this$0 = final_actionbarcontextview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ActionBarContextView this$0>
		val$mode = ActionMode.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ActionMode val$mode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
