// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.b;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, d

private class ActivityChooserView$b
	implements android.view.View.OnClickListener, android.view.er, android.widget.kListener, android.widget.istener
{

	private void a()
	{
		if(a.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ActivityChooserView a>
	//*   2    4:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.f>
	//*   3    7:ifnull          22
			a.f.onDismiss();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field ActivityChooserView a>
	//    6   14:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.f>
	//    7   17:invokeinterface #32  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//    8   22:return          
	}

	public void onClick(View view)
	{
label0:
		{
			if(view == a.c)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field ActivityChooserView a>
	//*   3    5:getfield        #38  <Field android.widget.FrameLayout ActivityChooserView.c>
	//*   4    8:if_acmpne       83
			{
				a.b();
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field ActivityChooserView a>
	//    7   15:invokevirtual   #41  <Method boolean android.support.v7.widget.ActivityChooserView.b()>
	//    8   18:pop             
				view = ((View) (a.a.b()));
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field ActivityChooserView a>
	//   11   23:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//   12   26:invokevirtual   #49  <Method android.content.pm.ResolveInfo android.support.v7.widget.ActivityChooserView$a.b()>
	//   13   29:astore_1        
				int i = a.a.e().a(((android.content.pm.ResolveInfo) (view)));
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field ActivityChooserView a>
	//   16   34:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//   17   37:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #58  <Method int d.a(android.content.pm.ResolveInfo)>
	//   20   44:istore_2        
				view = ((View) (a.a.e().b(i)));
	//   21   45:aload_0         
	//   22   46:getfield        #21  <Field ActivityChooserView a>
	//   23   49:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//   24   52:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
	//   25   55:iload_2         
	//   26   56:invokevirtual   #61  <Method Intent android.support.v7.widget.d.b(int)>
	//   27   59:astore_1        
				if(view != null)
	//*  28   60:aload_1         
	//*  29   61:ifnull          116
				{
					((Intent) (view)).addFlags(0x80000);
	//   30   64:aload_1         
	//   31   65:ldc1            #62  <Int 0x80000>
	//   32   67:invokevirtual   #67  <Method Intent Intent.addFlags(int)>
	//   33   70:pop             
					a.getContext().startActivity(((Intent) (view)));
	//   34   71:aload_0         
	//   35   72:getfield        #21  <Field ActivityChooserView a>
	//   36   75:invokevirtual   #71  <Method Context ActivityChooserView.getContext()>
	//   37   78:aload_1         
	//   38   79:invokevirtual   #77  <Method void Context.startActivity(Intent)>
					return;
	//   39   82:return          
				}
			} else
			{
				if(view != a.b)
					break label0;
	//   40   83:aload_1         
	//   41   84:aload_0         
	//   42   85:getfield        #21  <Field ActivityChooserView a>
	//   43   88:getfield        #79  <Field android.widget.FrameLayout android.support.v7.widget.ActivityChooserView.b>
	//   44   91:if_acmpne       117
				a.g = false;
	//   45   94:aload_0         
	//   46   95:getfield        #21  <Field ActivityChooserView a>
	//   47   98:iconst_0        
	//   48   99:putfield        #83  <Field boolean ActivityChooserView.g>
				a.a(a.h);
	//   49  102:aload_0         
	//   50  103:getfield        #21  <Field ActivityChooserView a>
	//   51  106:aload_0         
	//   52  107:getfield        #21  <Field ActivityChooserView a>
	//   53  110:getfield        #87  <Field int ActivityChooserView.h>
	//   54  113:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
			}
			return;
	//   55  116:return          
		}
		throw new IllegalArgumentException();
	//   56  117:new             #92  <Class IllegalArgumentException>
	//   57  120:dup             
	//   58  121:invokespecial   #93  <Method void IllegalArgumentException()>
	//   59  124:athrow          
	}

	public void onDismiss()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void a()>
		if(a.d != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field ActivityChooserView a>
	//*   4    8:getfield        #99  <Field b ActivityChooserView.d>
	//*   5   11:ifnull          25
			a.d.a(false);
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field ActivityChooserView a>
	//    8   18:getfield        #99  <Field b ActivityChooserView.d>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #104 <Method void b.a(boolean)>
	//   11   25:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		switch(((ActivityChooserView$a)adapterview.getAdapter()).getItemViewType(i))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #112 <Method android.widget.Adapter AdapterView.getAdapter()>
	//*   2    4:checkcast       #46  <Class ActivityChooserView$a>
	//*   3    7:iload_3         
	//*   4    8:invokevirtual   #116 <Method int ActivityChooserView$a.getItemViewType(int)>
		{
	//*   5   11:tableswitch     0 1: default 32
	//	               0 50
	//	               1 40
		default:
			throw new IllegalArgumentException();
	//    6   32:new             #92  <Class IllegalArgumentException>
	//    7   35:dup             
	//    8   36:invokespecial   #93  <Method void IllegalArgumentException()>
	//    9   39:athrow          

		case 1: // '\001'
			a.a(0x7fffffff);
	//   10   40:aload_0         
	//   11   41:getfield        #21  <Field ActivityChooserView a>
	//   12   44:ldc1            #117 <Int 0x7fffffff>
	//   13   46:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
			return;
	//   14   49:return          

		case 0: // '\0'
			a.b();
	//   15   50:aload_0         
	//   16   51:getfield        #21  <Field ActivityChooserView a>
	//   17   54:invokevirtual   #41  <Method boolean android.support.v7.widget.ActivityChooserView.b()>
	//   18   57:pop             
			break;
		}
		if(a.g)
	//*  19   58:aload_0         
	//*  20   59:getfield        #21  <Field ActivityChooserView a>
	//*  21   62:getfield        #83  <Field boolean ActivityChooserView.g>
	//*  22   65:ifeq            87
		{
			if(i > 0)
	//*  23   68:iload_3         
	//*  24   69:ifle            144
			{
				a.a.e().c(i);
	//   25   72:aload_0         
	//   26   73:getfield        #21  <Field ActivityChooserView a>
	//   27   76:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//   28   79:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
	//   29   82:iload_3         
	//   30   83:invokevirtual   #119 <Method void d.c(int)>
				return;
	//   31   86:return          
			}
		} else
		{
			if(!a.a.f())
	//*  32   87:aload_0         
	//*  33   88:getfield        #21  <Field ActivityChooserView a>
	//*  34   91:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//*  35   94:invokevirtual   #121 <Method boolean ActivityChooserView$a.f()>
	//*  36   97:ifeq            103
	//*  37  100:goto            107
				i++;
	//   38  103:iload_3         
	//   39  104:iconst_1        
	//   40  105:iadd            
	//   41  106:istore_3        
			adapterview = ((AdapterView) (a.a.e().b(i)));
	//   42  107:aload_0         
	//   43  108:getfield        #21  <Field ActivityChooserView a>
	//   44  111:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//   45  114:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
	//   46  117:iload_3         
	//   47  118:invokevirtual   #61  <Method Intent android.support.v7.widget.d.b(int)>
	//   48  121:astore_1        
			if(adapterview != null)
	//*  49  122:aload_1         
	//*  50  123:ifnull          144
			{
				((Intent) (adapterview)).addFlags(0x80000);
	//   51  126:aload_1         
	//   52  127:ldc1            #62  <Int 0x80000>
	//   53  129:invokevirtual   #67  <Method Intent Intent.addFlags(int)>
	//   54  132:pop             
				a.getContext().startActivity(((Intent) (adapterview)));
	//   55  133:aload_0         
	//   56  134:getfield        #21  <Field ActivityChooserView a>
	//   57  137:invokevirtual   #71  <Method Context ActivityChooserView.getContext()>
	//   58  140:aload_1         
	//   59  141:invokevirtual   #77  <Method void Context.startActivity(Intent)>
			}
		}
	//   60  144:return          
	}

	public boolean onLongClick(View view)
	{
		if(view == a.c)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field ActivityChooserView a>
	//*   3    5:getfield        #38  <Field android.widget.FrameLayout ActivityChooserView.c>
	//*   4    8:if_acmpne       48
		{
			if(a.a.getCount() > 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #21  <Field ActivityChooserView a>
	//*   7   15:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
	//*   8   18:invokevirtual   #129 <Method int ActivityChooserView$a.getCount()>
	//*   9   21:ifle            46
			{
				a.g = true;
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field ActivityChooserView a>
	//   12   28:iconst_1        
	//   13   29:putfield        #83  <Field boolean ActivityChooserView.g>
				a.a(a.h);
	//   14   32:aload_0         
	//   15   33:getfield        #21  <Field ActivityChooserView a>
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field ActivityChooserView a>
	//   18   40:getfield        #87  <Field int ActivityChooserView.h>
	//   19   43:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
			}
			return true;
	//   20   46:iconst_1        
	//   21   47:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   22   48:new             #92  <Class IllegalArgumentException>
	//   23   51:dup             
	//   24   52:invokespecial   #93  <Method void IllegalArgumentException()>
	//   25   55:athrow          
		}
	}

	final ActivityChooserView a;

	ActivityChooserView$b(ActivityChooserView activitychooserview)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ActivityChooserView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
