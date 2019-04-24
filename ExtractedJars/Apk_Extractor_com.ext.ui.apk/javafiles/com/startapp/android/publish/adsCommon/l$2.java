// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.common.metaData.d;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			l

static final class l$2
	implements d
{

	public void a()
	{
		l.a(false);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #22  <Method boolean l.a(boolean)>
	//    2    4:pop             
		l.c(a);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field Context a>
	//    5    9:invokestatic    #25  <Method void l.c(Context)>
	//    6   12:return          
	}

	public void b()
	{
	//    0    0:return          
	}

	final Context a;

	l$2(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
