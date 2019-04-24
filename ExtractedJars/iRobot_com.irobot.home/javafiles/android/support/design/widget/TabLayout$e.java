// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static final class TabLayout$e
{

	public TabLayout$e a(int j)
	{
		return a(LayoutInflater.from(b.getContext()).inflate(j, ((android.view.ViewGroup) (b)), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field TabLayout$g b>
	//    3    5:invokevirtual   #37  <Method android.content.Context TabLayout$g.getContext()>
	//    4    8:invokestatic    #43  <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    5   11:iload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field TabLayout$g b>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #47  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   10   20:invokevirtual   #50  <Method TabLayout$e a(View)>
	//   11   23:areturn         
	}

	public TabLayout$e a(Drawable drawable)
	{
		d = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field Drawable d>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void h()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$e a(View view)
	{
		h = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field View h>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void h()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$e a(CharSequence charsequence)
	{
		e = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field CharSequence e>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void h()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public View a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field View h>
	//    2    4:areturn         
	}

	public Drawable b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Drawable d>
	//    2    4:areturn         
	}

	public TabLayout$e b(CharSequence charsequence)
	{
		f = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field CharSequence f>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void h()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	void b(int j)
	{
		g = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int g>
	//    3    5:return          
	}

	public int c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int g>
	//    2    4:ireturn         
	}

	public CharSequence d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field CharSequence e>
	//    2    4:areturn         
	}

	public void e()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TabLayout a>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #71  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		} else
		{
			a.b(this);
	//    8   17:aload_0         
	//    9   18:getfield        #69  <Field TabLayout a>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #79  <Method void TabLayout.b(TabLayout$e)>
			return;
	//   12   25:return          
		}
	}

	public boolean f()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TabLayout a>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #71  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		return a.getSelectedTabPosition() == g;
	//    8   17:aload_0         
	//    9   18:getfield        #69  <Field TabLayout a>
	//   10   21:invokevirtual   #83  <Method int TabLayout.getSelectedTabPosition()>
	//   11   24:aload_0         
	//   12   25:getfield        #27  <Field int g>
	//   13   28:icmpne          33
	//   14   31:iconst_1        
	//   15   32:ireturn         
	//   16   33:iconst_0        
	//   17   34:ireturn         
	}

	public CharSequence g()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field CharSequence f>
	//    2    4:areturn         
	}

	void h()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field TabLayout$g b>
	//*   2    4:ifnull          14
			b.b();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field TabLayout$g b>
	//    5   11:invokevirtual   #85  <Method void TabLayout$g.b()>
	//    6   14:return          
	}

	void i()
	{
		a = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #69  <Field TabLayout a>
		b = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #31  <Field TabLayout$g b>
		c = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #88  <Field Object c>
		d = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #53  <Field Drawable d>
		e = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #60  <Field CharSequence e>
		f = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #64  <Field CharSequence f>
		g = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #27  <Field int g>
		h = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #57  <Field View h>
	//   24   40:return          
	}

	TabLayout a;
	TabLayout$g b;
	private Object c;
	private Drawable d;
	private CharSequence e;
	private CharSequence f;
	private int g;
	private View h;

	TabLayout$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		g = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #27  <Field int g>
	//    5    9:return          
	}
}
