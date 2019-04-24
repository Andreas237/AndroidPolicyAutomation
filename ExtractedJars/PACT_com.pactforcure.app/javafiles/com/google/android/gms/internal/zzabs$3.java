// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzabs

final class zzabs$3 extends zzabs
{

	protected Object zzdd(String s)
	{
		return ((Object) (zzdg(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method Integer zzdg(String)>
	//    3    5:areturn         
	}

	protected Integer zzdg(String s)
	{
		s = zzAH;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String zzAH>
	//    2    4:astore_1        
		s = ((String) ((Integer)zzAI));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field Object zzAI>
	//    5    9:checkcast       #30  <Class Integer>
	//    6   12:astore_1        
		throw new NullPointerException();
	//    7   13:new             #32  <Class NullPointerException>
	//    8   16:dup             
	//    9   17:invokespecial   #35  <Method void NullPointerException()>
	//   10   20:athrow          
	}

	zzabs$3(String s, Integer integer)
	{
		super(s, ((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
	//    4    6:return          
	}
}
