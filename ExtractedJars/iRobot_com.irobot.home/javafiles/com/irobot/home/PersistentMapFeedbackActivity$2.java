// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.EditText;
import com.irobot.core.ApplicationUIServiceData;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			PersistentMapFeedbackActivity

class PersistentMapFeedbackActivity$2
	implements Runnable
{

	public void run()
	{
		String s = ((Object) (a.c.getText())).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//    2    4:getfield        #25  <Field EditText PersistentMapFeedbackActivity.c>
	//    3    7:invokevirtual   #31  <Method android.text.Editable EditText.getText()>
	//    4   10:invokevirtual   #35  <Method String Object.toString()>
	//    5   13:astore_1        
		ApplicationUIServiceData.create().setPersistentMapFeedbackData(s, a.e, PersistentMapFeedbackActivity.b(a), PersistentMapFeedbackActivity.c(a), a.g, a.h, a.f, j.b(((android.content.Context) (a))));
	//    6   14:invokestatic    #41  <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   10   22:getfield        #45  <Field String PersistentMapFeedbackActivity.e>
	//   11   25:aload_0         
	//   12   26:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   13   29:invokestatic    #49  <Method boolean PersistentMapFeedbackActivity.b(PersistentMapFeedbackActivity)>
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   16   36:invokestatic    #51  <Method boolean PersistentMapFeedbackActivity.c(PersistentMapFeedbackActivity)>
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   19   43:getfield        #54  <Field String PersistentMapFeedbackActivity.g>
	//   20   46:aload_0         
	//   21   47:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   22   50:getfield        #57  <Field String PersistentMapFeedbackActivity.h>
	//   23   53:aload_0         
	//   24   54:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   25   57:getfield        #59  <Field String PersistentMapFeedbackActivity.f>
	//   26   60:aload_0         
	//   27   61:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   28   64:invokestatic    #64  <Method String j.b(android.content.Context)>
	//   29   67:invokevirtual   #68  <Method void ApplicationUIServiceData.setPersistentMapFeedbackData(String, String, boolean, boolean, String, String, String, String)>
	//   30   70:return          
	}

	final PersistentMapFeedbackActivity a;

	PersistentMapFeedbackActivity$2(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		a = persistentmapfeedbackactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
