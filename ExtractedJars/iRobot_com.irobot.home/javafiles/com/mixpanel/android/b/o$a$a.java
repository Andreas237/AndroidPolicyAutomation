// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;

// Referenced classes of package com.mixpanel.android.b:
//			o

private class o$a$a extends android.view.ccessibilityDelegate
{

	public android.view.ccessibilityDelegate a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//    2    4:areturn         
	}

	public void a(o$a$a o$a$a1)
	{
		if(b == o$a$a1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       17
		{
			b = o$a$a1.a();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method android.view.View$AccessibilityDelegate a()>
	//    7   13:putfield        #21  <Field android.view.View$AccessibilityDelegate b>
			return;
	//    8   16:return          
		}
		if(b instanceof o$a$a)
	//*   9   17:aload_0         
	//*  10   18:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//*  11   21:instanceof      #2   <Class o$a$a>
	//*  12   24:ifeq            38
			((o$a$a)b).a(o$a$a1);
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//   15   31:checkcast       #2   <Class o$a$a>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #28  <Method void a(o$a$a)>
	//   18   38:return          
	}

	public boolean a(String s)
	{
		if(a.d() == s)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field o$a a>
	//*   2    4:invokevirtual   #33  <Method String o$a.d()>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(b instanceof o$a$a)
	//*   7   13:aload_0         
	//*   8   14:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//*   9   17:instanceof      #2   <Class o$a$a>
	//*  10   20:ifeq            35
			return ((o$a$a)b).a(s);
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//   13   27:checkcast       #2   <Class o$a$a>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #35  <Method boolean a(String)>
	//   16   34:ireturn         
		else
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		if(i == o.a.a(a))
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #16  <Field o$a a>
	//*   3    5:invokestatic    #40  <Method int o$a.a(o$a)>
	//*   4    8:icmpne          19
			a.c(view);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field o$a a>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #44  <Method void o$a.c(View)>
		if(b != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//*  11   23:ifnull          35
			b.sendAccessibilityEvent(view, i);
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokevirtual   #46  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
	//   17   35:return          
	}

	final o.a a;
	private android.view.ccessibilityDelegate b;

	public o$a$a(o.a a1, android.view.ccessibilityDelegate ccessibilitydelegate)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field o$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void android.view.View$AccessibilityDelegate()>
		b = ccessibilitydelegate;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field android.view.View$AccessibilityDelegate b>
	//    8   14:return          
	}
}
