// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bsf, bvi, bve

final class qs
	implements bsf
{

	private qs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final void a(bvi bvi1)
	{
		bvi1.d.a = Integer.valueOf(3);
	//    0    0:aload_1         
	//    1    1:getfield        #24  <Field bve bvi.d>
	//    2    4:iconst_3        
	//    3    5:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    4    8:putfield        #35  <Field Integer bve.a>
	//    5   11:return          
	}

	static final bsf a = new qs();

	static 
	{
	//    0    0:new             #2   <Class qs>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void qs()>
	//    3    7:putstatic       #15  <Field bsf a>
	//*   4   10:return          
	}
}
