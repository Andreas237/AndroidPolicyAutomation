// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import com.irobot.home.model.PadSettings;

// Referenced classes of package com.irobot.home.b:
//			w

class w$2
	implements android.view..OnClickListener
{

	public void onClick(View view)
	{
		w.a(c, a, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field w c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field PadSettings a>
	//    4    8:iconst_1        
	//    5    9:invokestatic    #33  <Method void w.a(w, PadSettings, int)>
		w.a(c, b, a);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field w c>
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field w$a b>
	//   10   20:aload_0         
	//   11   21:getfield        #22  <Field PadSettings a>
	//   12   24:invokestatic    #36  <Method void w.a(w, w$a, PadSettings)>
	//   13   27:return          
	}

	final PadSettings a;
	final w$a b;
	final w c;

	w$2(w w1, PadSettings padsettings, w$a w$a)
	{
		c = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field w c>
		a = padsettings;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field PadSettings a>
		b = w$a;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field w$a b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
