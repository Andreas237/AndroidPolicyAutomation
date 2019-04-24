// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.KeyEvent;
import android.widget.TextView;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.b:
//			u

class u$3
	implements android.widget.View.OnEditorActionListener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 6)
	//*   0    0:iload_2         
	//*   1    1:bipush          6
	//*   2    3:icmpne          48
		{
			j.a(textview.getContext(), ((android.view.View) (textview)));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #28  <Method android.content.Context TextView.getContext()>
	//    5   10:aload_1         
	//    6   11:invokestatic    #33  <Method boolean j.a(android.content.Context, android.view.View)>
	//    7   14:pop             
			if(u.a(a) != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #16  <Field u a>
	//*  10   19:invokestatic    #36  <Method u$a u.a(u)>
	//*  11   22:ifnull          46
				u.a(a).b(textview.getText().toString());
	//   12   25:aload_0         
	//   13   26:getfield        #16  <Field u a>
	//   14   29:invokestatic    #36  <Method u$a u.a(u)>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #40  <Method CharSequence TextView.getText()>
	//   17   36:invokeinterface #46  <Method String CharSequence.toString()>
	//   18   41:invokeinterface #52  <Method void u$a.b(String)>
			return true;
	//   19   46:iconst_1        
	//   20   47:ireturn         
		} else
		{
			return false;
	//   21   48:iconst_0        
	//   22   49:ireturn         
		}
	}

	final u a;

	u$3(u u1)
	{
		a = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field u a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
