// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdj

public final class bjp extends bdj
{

	public bjp(String s, Uri uri)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void bdj(String)>
		a = uri;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field Uri a>
	//    6   10:return          
	}

	private final Uri a;
}
