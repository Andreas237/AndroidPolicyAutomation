// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			kh

public class kf extends kh
{

	public kf(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void kh()>
		b = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #13  <Field boolean b>
	//    5    9:return          
	}

	protected boolean a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field boolean b>
	//    2    4:ireturn         
	}

	private boolean b;
}
