// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BaseSetupActivity, BraavaSetupWelcomeActivity_

public class BraavaSetupActivity extends BaseSetupActivity
{

	public BraavaSetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BaseSetupActivity()>
	//    2    4:return          
	}

	void e()
	{
		b(0x7f0f013d);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Int 0x7f0f013d>
	//    2    3:invokevirtual   #22  <Method void b(int)>
		f.setSource(j.a(((android.content.Context) (this)), 0x7f0e0006));
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field CustomVideoView f>
	//    5   10:aload_0         
	//    6   11:ldc1            #25  <Int 0x7f0e0006>
	//    7   13:invokestatic    #31  <Method android.net.Uri j.a(android.content.Context, int)>
	//    8   16:invokevirtual   #37  <Method void CustomVideoView.setSource(android.net.Uri)>
		f.setLooping(false);
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field CustomVideoView f>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #41  <Method void CustomVideoView.setLooping(boolean)>
		super.e();
	//   13   27:aload_0         
	//   14   28:invokespecial   #43  <Method void BaseSetupActivity.e()>
		a("Braava jet");
	//   15   31:aload_0         
	//   16   32:ldc1            #45  <String "Braava jet">
	//   17   34:invokevirtual   #48  <Method void a(String)>
	//   18   37:return          
	}

	public void g()
	{
		f.d();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CustomVideoView f>
	//    2    4:invokevirtual   #51  <Method void CustomVideoView.d()>
		BraavaSetupWelcomeActivity_.a(((android.content.Context) (this))).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #56  <Method BraavaSetupWelcomeActivity_$a BraavaSetupWelcomeActivity_.a(android.content.Context)>
	//    5   11:invokevirtual   #61  <Method org.androidannotations.api.a.e BraavaSetupWelcomeActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void BaseSetupActivity.onResume()>
		f.a();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field CustomVideoView f>
	//    4    8:invokevirtual   #66  <Method void CustomVideoView.a()>
	//    5   11:return          
	}

	protected void onStop()
	{
		f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CustomVideoView f>
	//    2    4:invokevirtual   #69  <Method void CustomVideoView.b()>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #71  <Method void BaseSetupActivity.onStop()>
	//    5   11:return          
	}

	private static final String g = "BraavaSetupActivity";
	CustomVideoView f;

	static 
	{
	//    0    0:return          
	}
}
