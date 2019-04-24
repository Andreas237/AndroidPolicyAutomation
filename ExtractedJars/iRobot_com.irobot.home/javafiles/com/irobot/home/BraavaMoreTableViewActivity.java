// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, BraavaHelpTableViewActivity_, BraavaPrefsTableActivity_

public class BraavaMoreTableViewActivity extends BaseFragmentActivity
{

	public BraavaMoreTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	void e()
	{
		b(0x7f0f08cb);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Int 0x7f0f08cb>
	//    2    3:invokevirtual   #21  <Method void b(int)>
		b.setVisibility(8);
	//    3    6:aload_0         
	//    4    7:getfield        #23  <Field CustomTextView b>
	//    5   10:bipush          8
	//    6   12:invokevirtual   #28  <Method void CustomTextView.setVisibility(int)>
		c.setVisibility(8);
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field View c>
	//    9   19:bipush          8
	//   10   21:invokevirtual   #33  <Method void View.setVisibility(int)>
		d.setVisibility(8);
	//   11   24:aload_0         
	//   12   25:getfield        #35  <Field View d>
	//   13   28:bipush          8
	//   14   30:invokevirtual   #33  <Method void View.setVisibility(int)>
	//   15   33:return          
	}

	public void f()
	{
		BraavaHelpTableViewActivity_.a(((android.content.Context) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method BraavaHelpTableViewActivity_$a BraavaHelpTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field String a>
	//    4    8:invokevirtual   #48  <Method BraavaHelpTableViewActivity_$a BraavaHelpTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #51  <Method org.androidannotations.api.a.e BraavaHelpTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void g()
	{
		BraavaPrefsTableActivity_.a(((android.content.Context) (this))).a(a).a(0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method BraavaPrefsTableActivity_$a BraavaPrefsTableActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field String a>
	//    4    8:invokevirtual   #62  <Method BraavaPrefsTableActivity_$a BraavaPrefsTableActivity_$a.a(String)>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #65  <Method org.androidannotations.api.a.e BraavaPrefsTableActivity_$a.a(int)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if(i == 0 && j == -1)
	//*   0    0:iload_1         
	//*   1    1:ifne            13
	//*   2    4:iload_2         
	//*   3    5:iconst_m1       
	//*   4    6:icmpne          13
			finish();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #70  <Method void finish()>
	//    7   13:return          
	}

	String a;
	CustomTextView b;
	View c;
	View d;
}
