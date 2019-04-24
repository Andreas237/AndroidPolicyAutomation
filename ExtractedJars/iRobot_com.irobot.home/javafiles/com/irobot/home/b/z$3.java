// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.widget.CompoundButton;

// Referenced classes of package com.irobot.home.b:
//			z

class z$3
	implements android.widget.oundButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		z.b(a).a(((Integer)compoundbutton.getTag()).intValue(), flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field z a>
	//    2    4:invokestatic    #24  <Method z$a z.b(z)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #30  <Method Object CompoundButton.getTag()>
	//    5   11:checkcast       #32  <Class Integer>
	//    6   14:invokevirtual   #36  <Method int Integer.intValue()>
	//    7   17:iload_2         
	//    8   18:invokeinterface #41  <Method void z$a.a(int, boolean)>
	//    9   23:return          
	}

	final z a;

	z$3(z z1)
	{
		a = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field z a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
