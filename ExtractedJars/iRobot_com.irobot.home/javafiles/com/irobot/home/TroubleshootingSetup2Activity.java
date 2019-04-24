// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.TextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class TroubleshootingSetup2Activity extends BaseFragmentActivity
{

	public TroubleshootingSetup2Activity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void e()
	{
		b(0x7f0f08f5);
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <Int 0x7f0f08f5>
	//    2    3:invokevirtual   #20  <Method void b(int)>
		c.setText(((CharSequence) (a)));
	//    3    6:aload_0         
	//    4    7:getfield        #22  <Field TextView c>
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field String a>
	//    7   14:invokevirtual   #30  <Method void TextView.setText(CharSequence)>
		d.setText(((CharSequence) (b)));
	//    8   17:aload_0         
	//    9   18:getfield        #32  <Field TextView d>
	//   10   21:aload_0         
	//   11   22:getfield        #34  <Field String b>
	//   12   25:invokevirtual   #30  <Method void TextView.setText(CharSequence)>
	//   13   28:return          
	}

	String a;
	String b;
	TextView c;
	TextView d;
}
