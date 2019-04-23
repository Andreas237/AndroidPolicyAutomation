// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnd, bnw, bkj

final class bkr
	implements bnd
{

	private bkr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	bkr(bkj bkj)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void bkr()>
	//    2    4:return          
	}

	public final Object a(Uri uri, InputStream inputstream)
	{
		return ((Object) (Long.valueOf(bnw.e((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine()))));
	//    0    0:new             #17  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #19  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #22  <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #25  <Method void BufferedReader(java.io.Reader)>
	//    7   15:invokevirtual   #29  <Method String BufferedReader.readLine()>
	//    8   18:invokestatic    #35  <Method long bnw.e(String)>
	//    9   21:invokestatic    #41  <Method Long Long.valueOf(long)>
	//   10   24:areturn         
	}
}
