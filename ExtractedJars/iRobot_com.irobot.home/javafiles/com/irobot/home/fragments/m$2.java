// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.widget.ProgressBar;

// Referenced classes of package com.irobot.home.fragments:
//			m

class m$2
	implements Runnable
{

	public void run()
	{
		ProgressBar progressbar = c.i;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field m c>
	//    2    4:getfield        #33  <Field ProgressBar m.i>
	//    3    7:astore_2        
		byte byte0;
		if(a == android.net.orkInfo.State.CONNECTING)
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field android.net.NetworkInfo$State a>
	//*   6   12:getstatic       #38  <Field android.net.NetworkInfo$State android.net.NetworkInfo$State.CONNECTING>
	//*   7   15:if_acmpne       23
			byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		else
	//*  10   20:goto            26
			byte0 = 8;
	//   11   23:bipush          8
	//   12   25:istore_1        
		progressbar.setVisibility(((int) (byte0)));
	//   13   26:aload_2         
	//   14   27:iload_1         
	//   15   28:invokevirtual   #44  <Method void ProgressBar.setVisibility(int)>
		m.a(c, b);
	//   16   31:aload_0         
	//   17   32:getfield        #20  <Field m c>
	//   18   35:aload_0         
	//   19   36:getfield        #24  <Field String b>
	//   20   39:invokestatic    #47  <Method void m.a(m, String)>
	//   21   42:return          
	}

	final android.net.orkInfo.State a;
	final String b;
	final m c;

	m$2(m m1, android.net.orkInfo.State state, String s)
	{
		c = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field m c>
		a = state;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field android.net.NetworkInfo$State a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
