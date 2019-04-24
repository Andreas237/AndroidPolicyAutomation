// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.irobot.home:
//			PersistentMapFeedbackActivity

class PersistentMapFeedbackActivity$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
	//    0    0:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		PersistentMapFeedbackActivity persistentmapfeedbackactivity = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//    2    4:astore          6
		boolean flag;
		if(charsequence.toString().trim().length() != 0)
	//*   3    6:aload_1         
	//*   4    7:invokeinterface #31  <Method String CharSequence.toString()>
	//*   5   12:invokevirtual   #36  <Method String String.trim()>
	//*   6   15:invokevirtual   #40  <Method int String.length()>
	//*   7   18:ifeq            27
			flag = true;
	//    8   21:iconst_1        
	//    9   22:istore          5
		else
	//*  10   24:goto            30
			flag = false;
	//   11   27:iconst_0        
	//   12   28:istore          5
		PersistentMapFeedbackActivity.a(persistentmapfeedbackactivity, flag);
	//   13   30:aload           6
	//   14   32:iload           5
	//   15   34:invokestatic    #43  <Method boolean PersistentMapFeedbackActivity.a(PersistentMapFeedbackActivity, boolean)>
	//   16   37:pop             
		PersistentMapFeedbackActivity.a(a);
	//   17   38:aload_0         
	//   18   39:getfield        #17  <Field PersistentMapFeedbackActivity a>
	//   19   42:invokestatic    #45  <Method void PersistentMapFeedbackActivity.a(PersistentMapFeedbackActivity)>
	//   20   45:return          
	}

	final PersistentMapFeedbackActivity a;

	PersistentMapFeedbackActivity$1(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
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
