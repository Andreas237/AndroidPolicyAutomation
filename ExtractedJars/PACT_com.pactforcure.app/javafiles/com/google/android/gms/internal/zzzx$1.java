// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzzx

final class zzzx$1 extends ThreadLocal
{

	protected Object initialValue()
	{
		return ((Object) (zzvg()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method Boolean zzvg()>
	//    2    4:areturn         
	}

	protected Boolean zzvg()
	{
		return Boolean.valueOf(false);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:areturn         
	}

	zzzx$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ThreadLocal()>
	//    2    4:return          
	}
}
