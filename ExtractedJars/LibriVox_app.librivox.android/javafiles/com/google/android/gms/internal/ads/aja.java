// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			anm, ajj, ash

public final class aja
{

	private aja(anm anm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = anm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field anm a>
	//    5    9:return          
	}

	static final aja a(anm anm1)
	{
		if(anm1 != null && anm1.c() > 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int anm.c()>
	//*   4    8:ifle            20
			return new aja(anm1);
	//    5   11:new             #2   <Class aja>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #23  <Method void aja(anm)>
	//    9   19:areturn         
		else
			throw new GeneralSecurityException("empty keyset");
	//   10   20:new             #25  <Class GeneralSecurityException>
	//   11   23:dup             
	//   12   24:ldc1            #27  <String "empty keyset">
	//   13   26:invokespecial   #30  <Method void GeneralSecurityException(String)>
	//   14   29:athrow          
	}

	final anm a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field anm a>
	//    2    4:areturn         
	}

	public final String toString()
	{
		return ((ash) (ajj.a(a))).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field anm a>
	//    2    4:invokestatic    #38  <Method anr ajj.a(anm)>
	//    3    7:invokevirtual   #42  <Method String ash.toString()>
	//    4   10:areturn         
	}

	private anm a;
}
