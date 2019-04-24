// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.graphics.Rect;
import android.support.v4.view.*;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			ScrimInsetsFrameLayout

class ScrimInsetsFrameLayout$1
	implements o
{

	public aa a(View view, aa aa1)
	{
		if(a.b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//*   2    4:getfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
	//*   3    7:ifnonnull       24
			a.b = new Rect();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//    6   14:new             #27  <Class Rect>
	//    7   17:dup             
	//    8   18:invokespecial   #28  <Method void Rect()>
	//    9   21:putfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
		a.b.set(aa1.a(), aa1.b(), aa1.c(), aa1.d());
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//   12   28:getfield        #25  <Field Rect ScrimInsetsFrameLayout.b>
	//   13   31:aload_2         
	//   14   32:invokevirtual   #33  <Method int aa.a()>
	//   15   35:aload_2         
	//   16   36:invokevirtual   #35  <Method int aa.b()>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #38  <Method int aa.c()>
	//   19   43:aload_2         
	//   20   44:invokevirtual   #41  <Method int aa.d()>
	//   21   47:invokevirtual   #45  <Method void Rect.set(int, int, int, int)>
		a.a(aa1);
	//   22   50:aload_0         
	//   23   51:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//   24   54:aload_2         
	//   25   55:invokevirtual   #48  <Method void ScrimInsetsFrameLayout.a(aa)>
		view = ((View) (a));
	//   26   58:aload_0         
	//   27   59:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//   28   62:astore_1        
		boolean flag;
		if(aa1.e() && a.a != null)
	//*  29   63:aload_2         
	//*  30   64:invokevirtual   #52  <Method boolean aa.e()>
	//*  31   67:ifeq            88
	//*  32   70:aload_0         
	//*  33   71:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//*  34   74:getfield        #55  <Field android.graphics.drawable.Drawable ScrimInsetsFrameLayout.a>
	//*  35   77:ifnonnull       83
	//*  36   80:goto            88
			flag = false;
	//   37   83:iconst_0        
	//   38   84:istore_3        
		else
	//*  39   85:goto            90
			flag = true;
	//   40   88:iconst_1        
	//   41   89:istore_3        
		((ScrimInsetsFrameLayout) (view)).setWillNotDraw(flag);
	//   42   90:aload_1         
	//   43   91:iload_3         
	//   44   92:invokevirtual   #59  <Method void ScrimInsetsFrameLayout.setWillNotDraw(boolean)>
		s.c(((View) (a)));
	//   45   95:aload_0         
	//   46   96:getfield        #16  <Field ScrimInsetsFrameLayout a>
	//   47   99:invokestatic    #64  <Method void s.c(View)>
		return aa1.g();
	//   48  102:aload_2         
	//   49  103:invokevirtual   #68  <Method aa aa.g()>
	//   50  106:areturn         
	}

	final ScrimInsetsFrameLayout a;

	ScrimInsetsFrameLayout$1(ScrimInsetsFrameLayout scriminsetsframelayout)
	{
		a = scriminsetsframelayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ScrimInsetsFrameLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
