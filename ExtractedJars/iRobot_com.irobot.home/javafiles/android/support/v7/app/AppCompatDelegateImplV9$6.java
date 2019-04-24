// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$6 extends y
{

	public void a(View view)
	{
		a.n.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    2    4:getfield        #23  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #29  <Method void ActionBarContextView.setVisibility(int)>
		a.n.sendAccessibilityEvent(32);
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    7   15:getfield        #23  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    8   18:bipush          32
	//    9   20:invokevirtual   #32  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
		if(a.n.getParent() instanceof View)
	//*  10   23:aload_0         
	//*  11   24:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//*  12   27:getfield        #23  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//*  13   30:invokevirtual   #36  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  14   33:instanceof      #38  <Class View>
	//*  15   36:ifeq            55
			s.p((View)a.n.getParent());
	//   16   39:aload_0         
	//   17   40:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//   18   43:getfield        #23  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//   19   46:invokevirtual   #36  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   20   49:checkcast       #38  <Class View>
	//   21   52:invokestatic    #43  <Method void s.p(View)>
	//   22   55:return          
	}

	public void b(View view)
	{
		a.n.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    2    4:getfield        #23  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    3    7:fconst_1        
	//    4    8:invokevirtual   #48  <Method void ActionBarContextView.setAlpha(float)>
		a.q.a(((android.support.v4.view.x) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    7   15:getfield        #52  <Field w AppCompatDelegateImplV9.q>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #57  <Method w w.a(android.support.v4.view.x)>
	//   10   22:pop             
		a.q = null;
	//   11   23:aload_0         
	//   12   24:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//   13   27:aconst_null     
	//   14   28:putfield        #52  <Field w AppCompatDelegateImplV9.q>
	//   15   31:return          
	}

	final AppCompatDelegateImplV9 a;

	AppCompatDelegateImplV9$6(AppCompatDelegateImplV9 appcompatdelegateimplv9)
	{
		a = appcompatdelegateimplv9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatDelegateImplV9 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void y()>
	//    5    9:return          
	}
}
