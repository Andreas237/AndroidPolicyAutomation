// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApi;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zab

public final class zabv
{

	public zabv(zab zab, int i, GoogleApi googleapi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zajq = zab;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zab zajq>
		zajr = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int zajr>
		zajs = googleapi;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field GoogleApi zajs>
	//   11   19:return          
	}

	public final zab zajq;
	public final int zajr;
	public final GoogleApi zajs;
}
