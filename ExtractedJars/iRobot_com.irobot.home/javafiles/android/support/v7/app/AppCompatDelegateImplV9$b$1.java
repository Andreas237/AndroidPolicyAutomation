// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$b$1 extends y
{

	public void b(View view)
	{
		a.a.n.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//    2    4:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//    3    7:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    4   10:bipush          8
	//    5   12:invokevirtual   #35  <Method void ActionBarContextView.setVisibility(int)>
		if(a.a.o != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//*   8   19:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//*   9   22:getfield        #39  <Field PopupWindow AppCompatDelegateImplV9.o>
	//*  10   25:ifnull          44
			a.a.o.dismiss();
	//   11   28:aload_0         
	//   12   29:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//   13   32:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//   14   35:getfield        #39  <Field PopupWindow AppCompatDelegateImplV9.o>
	//   15   38:invokevirtual   #44  <Method void PopupWindow.dismiss()>
		else
	//*  16   41:goto            82
		if(a.a.n.getParent() instanceof View)
	//*  17   44:aload_0         
	//*  18   45:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//*  19   48:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//*  20   51:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//*  21   54:invokevirtual   #48  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  22   57:instanceof      #50  <Class View>
	//*  23   60:ifeq            82
			s.p((View)a.a.n.getParent());
	//   24   63:aload_0         
	//   25   64:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//   26   67:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//   27   70:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//   28   73:invokevirtual   #48  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   29   76:checkcast       #50  <Class View>
	//   30   79:invokestatic    #55  <Method void s.p(View)>
		a.a.n.removeAllViews();
	//   31   82:aload_0         
	//   32   83:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//   33   86:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//   34   89:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//   35   92:invokevirtual   #58  <Method void ActionBarContextView.removeAllViews()>
		a.a.q.a(((android.support.v4.view.x) (null)));
	//   36   95:aload_0         
	//   37   96:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//   38   99:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//   39  102:getfield        #62  <Field w AppCompatDelegateImplV9.q>
	//   40  105:aconst_null     
	//   41  106:invokevirtual   #67  <Method w w.a(android.support.v4.view.x)>
	//   42  109:pop             
		a.a.q = null;
	//   43  110:aload_0         
	//   44  111:getfield        #17  <Field AppCompatDelegateImplV9$b a>
	//   45  114:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
	//   46  117:aconst_null     
	//   47  118:putfield        #62  <Field w AppCompatDelegateImplV9.q>
	//   48  121:return          
	}

	final AppCompatDelegateImplV9.b a;

	AppCompatDelegateImplV9$b$1(AppCompatDelegateImplV9.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppCompatDelegateImplV9$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void y()>
	//    5    9:return          
	}
}
