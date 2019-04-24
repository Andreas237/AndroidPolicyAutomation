// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.widget.ProgressBar;

// Referenced classes of package com.irobot.home.fragments:
//			j, av

public class au extends j
{

	public au()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void j()>
	//    2    4:return          
	}

	public static au b()
	{
		return av.c().a();
	//    0    0:invokestatic    #19  <Method av$a av.c()>
	//    1    3:invokevirtual   #23  <Method au av$a.a()>
	//    2    6:areturn         
	}

	void a()
	{
		a.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ProgressBar a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #31  <Method void ProgressBar.setVisibility(int)>
	//    4    8:return          
	}

	public void onStop()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void j.onPause()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field ProgressBar a>
	//*   4    8:ifnull          20
			a.setVisibility(8);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field ProgressBar a>
	//    7   15:bipush          8
	//    8   17:invokevirtual   #31  <Method void ProgressBar.setVisibility(int)>
	//    9   20:return          
	}

	ProgressBar a;
}
