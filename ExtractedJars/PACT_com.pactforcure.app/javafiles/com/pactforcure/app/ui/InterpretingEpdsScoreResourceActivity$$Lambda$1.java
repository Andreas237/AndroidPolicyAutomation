// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			InterpretingEpdsScoreResourceActivity

final class InterpretingEpdsScoreResourceActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(InterpretingEpdsScoreResourceActivity interpretingepdsscoreresourceactivity)
	{
		return ((android.view.View.OnClickListener) (new InterpretingEpdsScoreResourceActivity$$Lambda$1(interpretingepdsscoreresourceactivity)));
	//    0    0:new             #2   <Class InterpretingEpdsScoreResourceActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void InterpretingEpdsScoreResourceActivity$$Lambda$1(InterpretingEpdsScoreResourceActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		InterpretingEpdsScoreResourceActivity.lambda$onCreate$14(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field InterpretingEpdsScoreResourceActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void InterpretingEpdsScoreResourceActivity.lambda$onCreate$14(InterpretingEpdsScoreResourceActivity, View)>
	//    4    8:return          
	}

	private final InterpretingEpdsScoreResourceActivity arg$1;

	private InterpretingEpdsScoreResourceActivity$$Lambda$1(InterpretingEpdsScoreResourceActivity interpretingepdsscoreresourceactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = interpretingepdsscoreresourceactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field InterpretingEpdsScoreResourceActivity arg$1>
	//    5    9:return          
	}
}
