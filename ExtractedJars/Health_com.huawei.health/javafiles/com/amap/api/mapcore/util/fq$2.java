// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;

// Referenced classes of package com.amap.api.mapcore.util:
//			fq, fd

class fq$2
	implements Runnable
{

	public void run()
	{
		if(fq.d(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field fq a>
	//*   2    4:invokestatic    #25  <Method View fq.d(fq)>
	//*   3    7:ifnull          66
		{
			fq.d(a).clearFocus();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field fq a>
	//    6   14:invokestatic    #25  <Method View fq.d(fq)>
	//    7   17:invokevirtual   #30  <Method void View.clearFocus()>
			a.removeView(fq.d(a));
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field fq a>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field fq a>
	//   12   28:invokestatic    #25  <Method View fq.d(fq)>
	//   13   31:invokevirtual   #34  <Method void fq.removeView(View)>
			fd.a(fq.d(a).getBackground());
	//   14   34:aload_0         
	//   15   35:getfield        #17  <Field fq a>
	//   16   38:invokestatic    #25  <Method View fq.d(fq)>
	//   17   41:invokevirtual   #38  <Method android.graphics.drawable.Drawable View.getBackground()>
	//   18   44:invokestatic    #43  <Method void fd.a(android.graphics.drawable.Drawable)>
			fd.a(fq.e(a));
	//   19   47:aload_0         
	//   20   48:getfield        #17  <Field fq a>
	//   21   51:invokestatic    #47  <Method android.graphics.drawable.Drawable fq.e(fq)>
	//   22   54:invokestatic    #43  <Method void fd.a(android.graphics.drawable.Drawable)>
			fq.a(a, ((View) (null)));
	//   23   57:aload_0         
	//   24   58:getfield        #17  <Field fq a>
	//   25   61:aconst_null     
	//   26   62:invokestatic    #50  <Method View fq.a(fq, View)>
	//   27   65:pop             
		}
	//   28   66:return          
	}

	final fq a;

	fq$2(fq fq1)
	{
		a = fq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field fq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
