// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			b

class b$5
	implements o
{

	public aa a(View view, aa aa1)
	{
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), aa1.d());
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method int View.getPaddingLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method int View.getPaddingTop()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #33  <Method int View.getPaddingRight()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method int aa.d()>
	//    9   17:invokevirtual   #42  <Method void View.setPadding(int, int, int, int)>
		return aa1;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	final b a;

	b$5(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
