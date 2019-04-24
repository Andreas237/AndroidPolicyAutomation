// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.core.*;
import com.irobot.home.BetaFeaturesActivity_;
import com.irobot.home.BetaIntroductionActivity_;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$6
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		if(Assembler.getInstance().getAccountService().isFeatureEnabled(FeatureType.BetaProgram))
	//*   0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//*   1    3:invokevirtual   #32  <Method AccountService Assembler.getAccountService()>
	//*   2    6:getstatic       #38  <Field FeatureType FeatureType.BetaProgram>
	//*   3    9:invokevirtual   #44  <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*   4   12:ifeq            30
		{
			BetaFeaturesActivity_.a(((android.content.Context) (a.getActivity()))).a();
	//    5   15:aload_0         
	//    6   16:getfield        #17  <Field ag a>
	//    7   19:invokevirtual   #48  <Method android.app.Activity ag.getActivity()>
	//    8   22:invokestatic    #53  <Method com.irobot.home.BetaFeaturesActivity_$a BetaFeaturesActivity_.a(android.content.Context)>
	//    9   25:invokevirtual   #58  <Method org.androidannotations.api.a.e com.irobot.home.BetaFeaturesActivity_$a.a()>
	//   10   28:pop             
			return;
	//   11   29:return          
		} else
		{
			BetaIntroductionActivity_.a(((android.content.Context) (a.getActivity()))).a();
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field ag a>
	//   14   34:invokevirtual   #48  <Method android.app.Activity ag.getActivity()>
	//   15   37:invokestatic    #63  <Method com.irobot.home.BetaIntroductionActivity_$a BetaIntroductionActivity_.a(android.content.Context)>
	//   16   40:invokevirtual   #66  <Method org.androidannotations.api.a.e com.irobot.home.BetaIntroductionActivity_$a.a()>
	//   17   43:pop             
			return;
	//   18   44:return          
		}
	}

	final ag a;

	ag$6(ag ag1)
	{
		a = ag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ag a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
