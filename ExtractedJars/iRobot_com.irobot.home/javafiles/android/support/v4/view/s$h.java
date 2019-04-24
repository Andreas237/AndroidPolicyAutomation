// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.PointerIcon;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			s, q

static class s$h extends s$g
{

	public void a(View view, q q1)
	{
		if(q1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			q1 = ((q) (q1.a()));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #19  <Method Object q.a()>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			q1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		view.setPointerIcon((PointerIcon)q1);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:checkcast       #21  <Class PointerIcon>
	//   11   19:invokevirtual   #27  <Method void View.setPointerIcon(PointerIcon)>
	//   12   22:return          
	}

	s$h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$g()>
	//    2    4:return          
	}
}
