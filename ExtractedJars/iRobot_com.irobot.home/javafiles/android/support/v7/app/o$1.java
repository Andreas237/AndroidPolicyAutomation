// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.s;
import android.support.v4.view.y;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			o

class o$1 extends y
{

	public void b(View view)
	{
		if(a.k && a.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field o a>
	//*   2    4:getfield        #22  <Field boolean o.k>
	//*   3    7:ifeq            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field o a>
	//*   6   14:getfield        #26  <Field View o.f>
	//*   7   17:ifnull          42
		{
			a.f.setTranslationY(0.0F);
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field o a>
	//   10   24:getfield        #26  <Field View o.f>
	//   11   27:fconst_0        
	//   12   28:invokevirtual   #32  <Method void View.setTranslationY(float)>
			a.c.setTranslationY(0.0F);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field o a>
	//   15   35:getfield        #36  <Field ActionBarContainer o.c>
	//   16   38:fconst_0        
	//   17   39:invokevirtual   #39  <Method void ActionBarContainer.setTranslationY(float)>
		}
		a.c.setVisibility(8);
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field o a>
	//   20   46:getfield        #36  <Field ActionBarContainer o.c>
	//   21   49:bipush          8
	//   22   51:invokevirtual   #43  <Method void ActionBarContainer.setVisibility(int)>
		a.c.setTransitioning(false);
	//   23   54:aload_0         
	//   24   55:getfield        #12  <Field o a>
	//   25   58:getfield        #36  <Field ActionBarContainer o.c>
	//   26   61:iconst_0        
	//   27   62:invokevirtual   #47  <Method void ActionBarContainer.setTransitioning(boolean)>
		a.n = null;
	//   28   65:aload_0         
	//   29   66:getfield        #12  <Field o a>
	//   30   69:aconst_null     
	//   31   70:putfield        #51  <Field android.support.v7.view.h o.n>
		a.h();
	//   32   73:aload_0         
	//   33   74:getfield        #12  <Field o a>
	//   34   77:invokevirtual   #54  <Method void o.h()>
		if(a.b != null)
	//*  35   80:aload_0         
	//*  36   81:getfield        #12  <Field o a>
	//*  37   84:getfield        #57  <Field android.support.v7.widget.ActionBarOverlayLayout o.b>
	//*  38   87:ifnull          100
			s.p(((View) (a.b)));
	//   39   90:aload_0         
	//   40   91:getfield        #12  <Field o a>
	//   41   94:getfield        #57  <Field android.support.v7.widget.ActionBarOverlayLayout o.b>
	//   42   97:invokestatic    #62  <Method void s.p(View)>
	//   43  100:return          
	}

	final o a;

	o$1(o o1)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field o a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void y()>
	//    5    9:return          
	}
}
