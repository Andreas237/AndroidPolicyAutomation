// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			z

class z$2
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		if(j.i(((Object) (editable)).toString()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #25  <Method String Object.toString()>
	//*   2    4:invokestatic    #31  <Method boolean j.i(String)>
	//*   3    7:ifeq            30
		{
			a.l = false;
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field z a>
	//    6   14:iconst_0        
	//    7   15:putfield        #35  <Field boolean z.l>
			a.e.setVisibility(8);
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field z a>
	//   10   22:getfield        #39  <Field TextView z.e>
	//   11   25:bipush          8
	//   12   27:invokevirtual   #45  <Method void TextView.setVisibility(int)>
		}
		z.a(a);
	//   13   30:aload_0         
	//   14   31:getfield        #16  <Field z a>
	//   15   34:invokestatic    #47  <Method void z.a(z)>
	//   16   37:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int k, int l)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int k, int l)
	{
	//    0    0:return          
	}

	final z a;

	z$2(z z1)
	{
		a = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field z a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
