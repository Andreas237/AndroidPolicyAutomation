// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.net.Uri;

// Referenced classes of package com.appboy:
//			IAppboyEndpointProvider, Appboy

class Appboy$24
	implements IAppboyEndpointProvider
{

	public Uri getApiEndpoint(Uri uri)
	{
		return uri.buildUpon().encodedAuthority(a).build();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokevirtual   #38  <Method android.net.Uri$Builder android.net.Uri$Builder.encodedAuthority(String)>
	//    5   11:invokevirtual   #42  <Method Uri android.net.Uri$Builder.build()>
	//    6   14:areturn         
	}

	final String a;
	final Appboy b;

	Appboy$24(Appboy appboy, String s)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
