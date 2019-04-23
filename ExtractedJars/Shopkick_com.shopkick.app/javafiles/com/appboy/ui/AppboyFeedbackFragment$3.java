// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.appboy.Appboy;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedbackFragment

class AppboyFeedbackFragment$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(AppboyFeedbackFragment.access$100(AppboyFeedbackFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//*   2    4:invokestatic    #27  <Method boolean AppboyFeedbackFragment.access$100(AppboyFeedbackFragment)>
	//*   3    7:ifeq            133
		{
			AppboyFeedbackFragment.access$200(AppboyFeedbackFragment.this);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//    6   14:invokestatic    #30  <Method void AppboyFeedbackFragment.access$200(AppboyFeedbackFragment)>
			boolean flag = AppboyFeedbackFragment.access$500(AppboyFeedbackFragment.this).isChecked();
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//    9   21:invokestatic    #34  <Method CheckBox AppboyFeedbackFragment.access$500(AppboyFeedbackFragment)>
	//   10   24:invokevirtual   #40  <Method boolean CheckBox.isChecked()>
	//   11   27:istore_2        
			String s = ((Object) (AppboyFeedbackFragment.access$600(AppboyFeedbackFragment.this).getText())).toString();
	//   12   28:aload_0         
	//   13   29:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   14   32:invokestatic    #44  <Method EditText AppboyFeedbackFragment.access$600(AppboyFeedbackFragment)>
	//   15   35:invokevirtual   #50  <Method android.text.Editable EditText.getText()>
	//   16   38:invokevirtual   #54  <Method String Object.toString()>
	//   17   41:astore_3        
			String s1 = ((Object) (AppboyFeedbackFragment.access$700(AppboyFeedbackFragment.this).getText())).toString();
	//   18   42:aload_0         
	//   19   43:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   20   46:invokestatic    #57  <Method EditText AppboyFeedbackFragment.access$700(AppboyFeedbackFragment)>
	//   21   49:invokevirtual   #50  <Method android.text.Editable EditText.getText()>
	//   22   52:invokevirtual   #54  <Method String Object.toString()>
	//   23   55:astore          4
			view = ((View) (s));
	//   24   57:aload_3         
	//   25   58:astore_1        
			if(AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//*  28   63:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//*  29   66:ifnull          83
				view = ((View) (AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this).beforeFeedbackSubmitted(s)));
	//   30   69:aload_0         
	//   31   70:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   32   73:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//   33   76:aload_3         
	//   34   77:invokeinterface #67  <Method String AppboyFeedbackFragment$IFeedbackFinishedListener.beforeFeedbackSubmitted(String)>
	//   35   82:astore_1        
			Appboy.getInstance(((android.content.Context) (getActivity()))).submitFeedback(s1, ((String) (view)), flag);
	//   36   83:aload_0         
	//   37   84:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   38   87:invokevirtual   #71  <Method android.support.v4.app.FragmentActivity AppboyFeedbackFragment.getActivity()>
	//   39   90:invokestatic    #77  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   40   93:aload           4
	//   41   95:aload_1         
	//   42   96:iload_2         
	//   43   97:invokevirtual   #81  <Method void Appboy.submitFeedback(String, String, boolean)>
			if(AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
	//*  44  100:aload_0         
	//*  45  101:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//*  46  104:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//*  47  107:ifnull          125
				AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this).onFeedbackFinished(edbackResult.SUBMITTED);
	//   48  110:aload_0         
	//   49  111:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   50  114:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//   51  117:getstatic       #87  <Field AppboyFeedbackFragment$FeedbackResult AppboyFeedbackFragment$FeedbackResult.SUBMITTED>
	//   52  120:invokeinterface #91  <Method void AppboyFeedbackFragment$IFeedbackFinishedListener.onFeedbackFinished(AppboyFeedbackFragment$FeedbackResult)>
			AppboyFeedbackFragment.access$400(AppboyFeedbackFragment.this);
	//   53  125:aload_0         
	//   54  126:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   55  129:invokestatic    #94  <Method void AppboyFeedbackFragment.access$400(AppboyFeedbackFragment)>
			return;
	//   56  132:return          
		} else
		{
			AppboyFeedbackFragment.access$002(AppboyFeedbackFragment.this, true);
	//   57  133:aload_0         
	//   58  134:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   59  137:iconst_1        
	//   60  138:invokestatic    #98  <Method boolean AppboyFeedbackFragment.access$002(AppboyFeedbackFragment, boolean)>
	//   61  141:pop             
			return;
	//   62  142:return          
		}
	}

	final AppboyFeedbackFragment this$0;

	AppboyFeedbackFragment$3()
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
