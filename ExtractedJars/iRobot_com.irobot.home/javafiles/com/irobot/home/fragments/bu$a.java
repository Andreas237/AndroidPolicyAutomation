// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.CountDownTimer;

// Referenced classes of package com.irobot.home.fragments:
//			bu

class bu$a extends CountDownTimer
{

	public void onFinish()
	{
		if(!a.isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field bu a>
	//*   2    4:invokevirtual   #22  <Method boolean bu.isAdded()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			a.k.a(true);
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field bu a>
	//    7   15:getfield        #26  <Field bu$b bu.k>
	//    8   18:iconst_1        
	//    9   19:invokeinterface #31  <Method void bu$b.a(boolean)>
			return;
	//   10   24:return          
		}
	}

	public void onTick(long l)
	{
	//    0    0:return          
	}

	final bu a;

	public bu$a(bu bu1, long l, long l1)
	{
		a = bu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bu a>
		super(l, l1);
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:lload           4
	//    6    9:invokespecial   #15  <Method void CountDownTimer(long, long)>
	//    7   12:return          
	}
}
