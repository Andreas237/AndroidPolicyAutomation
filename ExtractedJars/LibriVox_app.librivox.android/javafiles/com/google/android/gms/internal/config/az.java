// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.config;

import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal.config:
//			ay, ba, e

abstract class az extends ay
{

	public az(w w)
	{
		super(w);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ay(w)>
		a = ((e) (new ba(this)));
	//    3    5:aload_0         
	//    4    6:new             #12  <Class ba>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #15  <Method void ba(az)>
	//    8   14:putfield        #17  <Field e a>
	//    9   17:return          
	}

	protected e a;
}
