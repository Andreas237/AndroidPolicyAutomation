// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.irobot.core.AccountSessionDelegate;
import java.util.HashSet;

// Referenced classes of package com.irobot.home.a:
//			a

class a$3
	implements a$a
{

	public void a(HashSet hashset, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
			com.irobot.home.a.a.a(a).onSupportedBetaFeaturesUpdated(hashset);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field a a>
	//    4    8:invokestatic    #24  <Method AccountSessionDelegate a.a(a)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #30  <Method void AccountSessionDelegate.onSupportedBetaFeaturesUpdated(HashSet)>
	//    7   15:return          
	}

	final a a;

	a$3(a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
