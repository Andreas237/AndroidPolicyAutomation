// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ca, bw

static final class ca$1
	implements ca$c
{

	public void a()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field bw a>
	//*   2    4:ifnull          16
			a.r();
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field bw a>
	//    5   11:invokeinterface #25  <Method void bw.r()>
	//    6   16:return          
	}

	public void a(long l)
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field bw a>
	//*   2    4:ifnull          17
				a.a(l);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field bw a>
	//    5   11:lload_1         
	//    6   12:invokeinterface #30  <Method void bw.a(long)>
			return;
	//    7   17:return          
		}
		catch(Exception exception)
	//*   8   18:astore_3        
		{
			return;
	//    9   19:return          
		}
	}

	final bw a;

	ca$1(bw bw1)
	{
		a = bw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
