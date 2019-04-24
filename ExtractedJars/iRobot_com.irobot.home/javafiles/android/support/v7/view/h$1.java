// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.support.v4.view.x;
import android.support.v4.view.y;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view:
//			h

class h$1 extends y
{

	void a()
	{
		c = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #23  <Field int c>
		b = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #21  <Field boolean b>
		a.b();
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field h a>
	//    8   14:invokevirtual   #26  <Method void h.b()>
	//    9   17:return          
	}

	public void a(View view)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean b>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		b = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #21  <Field boolean b>
		if(a.b != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #16  <Field h a>
	//*   9   17:getfield        #30  <Field x h.b>
	//*  10   20:ifnull          36
			a.b.a(((View) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #16  <Field h a>
	//   13   27:getfield        #30  <Field x h.b>
	//   14   30:aconst_null     
	//   15   31:invokeinterface #34  <Method void x.a(View)>
	//   16   36:return          
	}

	public void b(View view)
	{
		int i = c + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int c>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		c = i;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #23  <Field int c>
		if(i == a.a.size())
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #16  <Field h a>
	//*  11   17:getfield        #37  <Field ArrayList h.a>
	//*  12   20:invokevirtual   #43  <Method int ArrayList.size()>
	//*  13   23:icmpne          53
		{
			if(a.b != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #16  <Field h a>
	//*  16   30:getfield        #30  <Field x h.b>
	//*  17   33:ifnull          49
				a.b.b(((View) (null)));
	//   18   36:aload_0         
	//   19   37:getfield        #16  <Field h a>
	//   20   40:getfield        #30  <Field x h.b>
	//   21   43:aconst_null     
	//   22   44:invokeinterface #45  <Method void x.b(View)>
			a();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #47  <Method void a()>
		}
	//   25   53:return          
	}

	final h a;
	private boolean b;
	private int c;

	h$1(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void y()>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field boolean b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #23  <Field int c>
	//   11   19:return          
	}
}
