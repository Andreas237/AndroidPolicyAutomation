// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$2
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		if(j.i(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field String a>
	//*   2    4:invokestatic    #32  <Method boolean j.i(String)>
	//*   3    7:ifeq            55
		{
			WebViewActivity_.a(((android.content.Context) (b.getActivity()))).a(a).a(Integer.valueOf(0x7f0f0848)).a();
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field ag b>
	//    6   14:invokevirtual   #36  <Method android.app.Activity ag.getActivity()>
	//    7   17:invokestatic    #41  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//    8   20:aload_0         
	//    9   21:getfield        #20  <Field String a>
	//   10   24:invokevirtual   #46  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   11   27:ldc1            #47  <Int 0x7f0f0848>
	//   12   29:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   13   32:invokevirtual   #56  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   14   35:invokevirtual   #59  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   15   38:pop             
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.ConnectedHome, j.j().a());
	//   16   39:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   42:getstatic       #71  <Field ViewId ViewId.ConnectedHome>
	//   18   45:invokestatic    #75  <Method a j.j()>
	//   19   48:invokevirtual   #80  <Method com.irobot.core.AssetInfo a.a()>
	//   20   51:invokevirtual   #84  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
			return;
	//   21   54:return          
		} else
		{
			(new android.app.Dialog.Builder(((android.content.Context) (b.getActivity())))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.gInterface.OnClickListener) (null))).show();
	//   22   55:new             #86  <Class android.app.AlertDialog$Builder>
	//   23   58:dup             
	//   24   59:aload_0         
	//   25   60:getfield        #18  <Field ag b>
	//   26   63:invokevirtual   #36  <Method android.app.Activity ag.getActivity()>
	//   27   66:invokespecial   #89  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   28   69:ldc1            #90  <Int 0x7f0f0960>
	//   29   71:invokevirtual   #94  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   30   74:ldc1            #95  <Int 0x7f0f05bb>
	//   31   76:aconst_null     
	//   32   77:invokevirtual   #99  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   33   80:invokevirtual   #103 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   34   83:pop             
			return;
	//   35   84:return          
		}
	}

	final String a;
	final ag b;

	ag$2(ag ag1, String s)
	{
		b = ag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ag b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
