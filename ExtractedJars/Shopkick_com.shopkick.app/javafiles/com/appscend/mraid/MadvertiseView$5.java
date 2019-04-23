// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import java.util.TimerTask;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseView, MadvertiseUtil

class MadvertiseView$5 extends TimerTask
{

	public void run()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "Refreshing ad ...");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc1            #22  <String "Refreshing ad ...">
	//    3    4:invokestatic    #28  <Method void MadvertiseUtil.logMessage(String, int, String)>
		MadvertiseView.access$1500(MadvertiseView.this, true);
	//    4    7:aload_0         
	//    5    8:getfield        #15  <Field MadvertiseView this$0>
	//    6   11:iconst_1        
	//    7   12:invokestatic    #32  <Method void MadvertiseView.access$1500(MadvertiseView, boolean)>
	//    8   15:return          
	}

	final MadvertiseView this$0;

	MadvertiseView$5()
	{
		this$0 = MadvertiseView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MadvertiseView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void TimerTask()>
	//    5    9:return          
	}
}
