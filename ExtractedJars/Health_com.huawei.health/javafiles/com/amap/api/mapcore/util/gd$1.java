// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.amap.api.mapcore.util:
//			gd

class gd$1
	implements android.view.tInflater.Factory
{

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return gd.a(a, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field gd a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #23  <Method View gd.a(gd, String, Context, AttributeSet)>
	//    6   10:areturn         
	}

	final gd a;

	gd$1(gd gd1)
	{
		a = gd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field gd a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
