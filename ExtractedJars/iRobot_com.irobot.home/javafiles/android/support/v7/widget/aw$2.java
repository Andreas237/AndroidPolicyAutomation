// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.y;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			aw, Toolbar

class aw$2 extends y
{

	public void a(View view)
	{
		b.a.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field aw b>
	//    2    4:getfield        #30  <Field Toolbar aw.a>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #36  <Method void Toolbar.setVisibility(int)>
	//    5   11:return          
	}

	public void b(View view)
	{
		if(!c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean c>
	//*   2    4:ifne            21
			b.a.setVisibility(a);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field aw b>
	//    5   11:getfield        #30  <Field Toolbar aw.a>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field int a>
	//    8   18:invokevirtual   #36  <Method void Toolbar.setVisibility(int)>
	//    9   21:return          
	}

	public void c(View view)
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #25  <Field boolean c>
	//    3    5:return          
	}

	final int a;
	final aw b;
	private boolean c;

	aw$2(aw aw1, int i)
	{
		b = aw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field aw b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void y()>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field boolean c>
	//   11   19:return          
	}
}
