// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;

// Referenced classes of package com.amap.api.mapcore.util:
//			fy

class fy$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		a.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field fy a>
	//    2    4:invokevirtual   #24  <Method void fy.dismiss()>
	//    3    7:return          
	}

	final fy a;

	fy$1(fy fy1)
	{
		a = fy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field fy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
