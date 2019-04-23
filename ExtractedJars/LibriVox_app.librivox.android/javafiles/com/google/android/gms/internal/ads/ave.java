// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asu, atv

public final class ave extends RuntimeException
{

	public ave(atv atv)
	{
		super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "Message was missing required fields.  (Lite runtime could not determine which fields were missing).">
	//    2    3:invokespecial   #13  <Method void RuntimeException(String)>
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #15  <Field List a>
	//    6   11:return          
	}

	public final asu a()
	{
		return new asu(getMessage());
	//    0    0:new             #19  <Class asu>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #23  <Method String getMessage()>
	//    4    8:invokespecial   #24  <Method void asu(String)>
	//    5   11:areturn         
	}

	private final List a = null;
}
