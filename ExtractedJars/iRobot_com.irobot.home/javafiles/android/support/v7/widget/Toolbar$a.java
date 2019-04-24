// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.c;
import android.support.v7.view.menu.*;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

private class Toolbar$a
	implements o
{

	public void a(Context context, h h1)
	{
		if(a != null && b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field h a>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field j b>
	//*   5   11:ifnull          26
			a.d(b);
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field h a>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field j b>
	//   10   22:invokevirtual   #33  <Method boolean h.d(j)>
	//   11   25:pop             
		a = h1;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #25  <Field h a>
	//   15   31:return          
	}

	public void a(Parcelable parcelable)
	{
	//    0    0:return          
	}

	public void a(h h1, boolean flag)
	{
	//    0    0:return          
	}

	public void a(android.support.v7.view.menu.o.a a1)
	{
	//    0    0:return          
	}

	public void a(boolean flag)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field j b>
	//*   2    4:ifnull          88
		{
			h h1 = a;
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field h a>
	//    5   11:astore          6
			boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
			boolean flag1 = flag2;
	//    8   16:iload           4
	//    9   18:istore_3        
			if(h1 != null)
	//*  10   19:aload           6
	//*  11   21:ifnull          71
			{
				int k = a.size();
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field h a>
	//   14   28:invokevirtual   #41  <Method int h.size()>
	//   15   31:istore          5
				int i = 0;
	//   16   33:iconst_0        
	//   17   34:istore_2        
				do
				{
					flag1 = flag2;
	//   18   35:iload           4
	//   19   37:istore_3        
					if(i >= k)
						break;
	//   20   38:iload_2         
	//   21   39:iload           5
	//   22   41:icmpge          71
					if(a.getItem(i) == b)
	//*  23   44:aload_0         
	//*  24   45:getfield        #25  <Field h a>
	//*  25   48:iload_2         
	//*  26   49:invokevirtual   #45  <Method android.view.MenuItem h.getItem(int)>
	//*  27   52:aload_0         
	//*  28   53:getfield        #27  <Field j b>
	//*  29   56:if_acmpne       64
					{
						flag1 = true;
	//   30   59:iconst_1        
	//   31   60:istore_3        
						break;
	//   32   61:goto            71
					}
					i++;
	//   33   64:iload_2         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_2        
				} while(true);
	//   37   68:goto            35
			}
			if(!flag1)
	//*  38   71:iload_3         
	//*  39   72:ifne            88
				b(a, b);
	//   40   75:aload_0         
	//   41   76:aload_0         
	//   42   77:getfield        #25  <Field h a>
	//   43   80:aload_0         
	//   44   81:getfield        #27  <Field j b>
	//   45   84:invokevirtual   #48  <Method boolean b(h, j)>
	//   46   87:pop             
		}
	//   47   88:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(h h1, j j1)
	{
		c.i();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Toolbar c>
	//    2    4:invokevirtual   #52  <Method void Toolbar.i()>
		if(c.a.getParent() != c)
	//*   3    7:aload_0         
	//*   4    8:getfield        #18  <Field Toolbar c>
	//*   5   11:getfield        #55  <Field ImageButton Toolbar.a>
	//*   6   14:invokevirtual   #61  <Method android.view.ViewParent ImageButton.getParent()>
	//*   7   17:aload_0         
	//*   8   18:getfield        #18  <Field Toolbar c>
	//*   9   21:if_acmpeq       38
			c.addView(((View) (c.a)));
	//   10   24:aload_0         
	//   11   25:getfield        #18  <Field Toolbar c>
	//   12   28:aload_0         
	//   13   29:getfield        #18  <Field Toolbar c>
	//   14   32:getfield        #55  <Field ImageButton Toolbar.a>
	//   15   35:invokevirtual   #65  <Method void Toolbar.addView(View)>
		c.b = j1.getActionView();
	//   16   38:aload_0         
	//   17   39:getfield        #18  <Field Toolbar c>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #71  <Method View j.getActionView()>
	//   20   46:putfield        #74  <Field View Toolbar.b>
		b = j1;
	//   21   49:aload_0         
	//   22   50:aload_2         
	//   23   51:putfield        #27  <Field j b>
		if(c.b.getParent() != c)
	//*  24   54:aload_0         
	//*  25   55:getfield        #18  <Field Toolbar c>
	//*  26   58:getfield        #74  <Field View Toolbar.b>
	//*  27   61:invokevirtual   #77  <Method android.view.ViewParent View.getParent()>
	//*  28   64:aload_0         
	//*  29   65:getfield        #18  <Field Toolbar c>
	//*  30   68:if_acmpeq       126
		{
			h1 = ((h) (c.j()));
	//   31   71:aload_0         
	//   32   72:getfield        #18  <Field Toolbar c>
	//   33   75:invokevirtual   #81  <Method Toolbar$LayoutParams android.support.v7.widget.Toolbar.j()>
	//   34   78:astore_1        
			h1.a = 0x800003 | c.c & 0x70;
	//   35   79:aload_1         
	//   36   80:ldc1            #82  <Int 0x800003>
	//   37   82:aload_0         
	//   38   83:getfield        #18  <Field Toolbar c>
	//   39   86:getfield        #85  <Field int android.support.v7.widget.Toolbar.c>
	//   40   89:bipush          112
	//   41   91:iand            
	//   42   92:ior             
	//   43   93:putfield        #89  <Field int Toolbar$LayoutParams.a>
			h1.b = 2;
	//   44   96:aload_1         
	//   45   97:iconst_2        
	//   46   98:putfield        #91  <Field int Toolbar$LayoutParams.b>
			c.b.setLayoutParams(((android.view.LayoutParams) (h1)));
	//   47  101:aload_0         
	//   48  102:getfield        #18  <Field Toolbar c>
	//   49  105:getfield        #74  <Field View Toolbar.b>
	//   50  108:aload_1         
	//   51  109:invokevirtual   #95  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			c.addView(c.b);
	//   52  112:aload_0         
	//   53  113:getfield        #18  <Field Toolbar c>
	//   54  116:aload_0         
	//   55  117:getfield        #18  <Field Toolbar c>
	//   56  120:getfield        #74  <Field View Toolbar.b>
	//   57  123:invokevirtual   #65  <Method void Toolbar.addView(View)>
		}
		c.k();
	//   58  126:aload_0         
	//   59  127:getfield        #18  <Field Toolbar c>
	//   60  130:invokevirtual   #98  <Method void Toolbar.k()>
		c.requestLayout();
	//   61  133:aload_0         
	//   62  134:getfield        #18  <Field Toolbar c>
	//   63  137:invokevirtual   #101 <Method void Toolbar.requestLayout()>
		j1.e(true);
	//   64  140:aload_2         
	//   65  141:iconst_1        
	//   66  142:invokevirtual   #104 <Method void j.e(boolean)>
		if(c.b instanceof c)
	//*  67  145:aload_0         
	//*  68  146:getfield        #18  <Field Toolbar c>
	//*  69  149:getfield        #74  <Field View Toolbar.b>
	//*  70  152:instanceof      #106 <Class c>
	//*  71  155:ifeq            173
			((c)c.b).a();
	//   72  158:aload_0         
	//   73  159:getfield        #18  <Field Toolbar c>
	//   74  162:getfield        #74  <Field View Toolbar.b>
	//   75  165:checkcast       #106 <Class c>
	//   76  168:invokeinterface #108 <Method void c.a()>
		return true;
	//   77  173:iconst_1        
	//   78  174:ireturn         
	}

	public boolean a(u u)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int b()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean b(h h1, j j1)
	{
		if(c.b instanceof c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Toolbar c>
	//*   2    4:getfield        #74  <Field View Toolbar.b>
	//*   3    7:instanceof      #106 <Class c>
	//*   4   10:ifeq            28
			((c)c.b).b();
	//    5   13:aload_0         
	//    6   14:getfield        #18  <Field Toolbar c>
	//    7   17:getfield        #74  <Field View Toolbar.b>
	//    8   20:checkcast       #106 <Class c>
	//    9   23:invokeinterface #111 <Method void c.b()>
		c.removeView(c.b);
	//   10   28:aload_0         
	//   11   29:getfield        #18  <Field Toolbar c>
	//   12   32:aload_0         
	//   13   33:getfield        #18  <Field Toolbar c>
	//   14   36:getfield        #74  <Field View Toolbar.b>
	//   15   39:invokevirtual   #114 <Method void Toolbar.removeView(View)>
		c.removeView(((View) (c.a)));
	//   16   42:aload_0         
	//   17   43:getfield        #18  <Field Toolbar c>
	//   18   46:aload_0         
	//   19   47:getfield        #18  <Field Toolbar c>
	//   20   50:getfield        #55  <Field ImageButton Toolbar.a>
	//   21   53:invokevirtual   #114 <Method void Toolbar.removeView(View)>
		c.b = null;
	//   22   56:aload_0         
	//   23   57:getfield        #18  <Field Toolbar c>
	//   24   60:aconst_null     
	//   25   61:putfield        #74  <Field View Toolbar.b>
		c.l();
	//   26   64:aload_0         
	//   27   65:getfield        #18  <Field Toolbar c>
	//   28   68:invokevirtual   #117 <Method void Toolbar.l()>
		b = null;
	//   29   71:aload_0         
	//   30   72:aconst_null     
	//   31   73:putfield        #27  <Field j b>
		c.requestLayout();
	//   32   76:aload_0         
	//   33   77:getfield        #18  <Field Toolbar c>
	//   34   80:invokevirtual   #101 <Method void Toolbar.requestLayout()>
		j1.e(false);
	//   35   83:aload_2         
	//   36   84:iconst_0        
	//   37   85:invokevirtual   #104 <Method void j.e(boolean)>
		return true;
	//   38   88:iconst_1        
	//   39   89:ireturn         
	}

	public Parcelable c()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	h a;
	j b;
	final Toolbar c;

	Toolbar$a(Toolbar toolbar)
	{
		c = toolbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Toolbar c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
