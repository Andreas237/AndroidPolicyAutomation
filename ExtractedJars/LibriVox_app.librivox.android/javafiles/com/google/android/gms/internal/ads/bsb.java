// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bry, brw

final class bsb extends PushbackInputStream
{

	bsb(bry bry1, InputStream inputstream, int i)
	{
		a = bry1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field bry a>
		super(inputstream, 1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #13  <Method void PushbackInputStream(InputStream, int)>
	//    7   11:return          
	}

	public final void close()
	{
		brw.a(a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field bry a>
	//    2    4:getfield        #21  <Field brw bry.a>
	//    3    7:invokestatic    #26  <Method void brw.a(brw)>
		super.close();
	//    4   10:aload_0         
	//    5   11:invokespecial   #28  <Method void PushbackInputStream.close()>
	//    6   14:return          
	}

	private final bry a;
}
