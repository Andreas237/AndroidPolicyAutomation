// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aao, ve

final class vg
	implements aao
{

	private vg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final Object a(Object obj)
	{
		return ((Object) (ve.d((String)obj)));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class String>
	//    2    4:invokestatic    #26  <Method Void ve.d(String)>
	//    3    7:areturn         
	}

	static final aao a = new vg();

	static 
	{
	//    0    0:new             #2   <Class vg>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void vg()>
	//    3    7:putstatic       #15  <Field aao a>
	//*   4   10:return          
	}
}
