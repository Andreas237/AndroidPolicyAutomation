// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			QuestionsListActivity

class QuestionsListActivity$1
	implements android.content.sListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QuestionsListActivity a>
	//    2    4:invokevirtual   #26  <Method void QuestionsListActivity.finish()>
	//    3    7:return          
	}

	final QuestionsListActivity a;

	QuestionsListActivity$1(QuestionsListActivity questionslistactivity)
	{
		a = questionslistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field QuestionsListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
