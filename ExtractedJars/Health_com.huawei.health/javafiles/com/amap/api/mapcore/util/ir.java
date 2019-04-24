// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj, io

public final class ir extends jj
{

	public ir(io io1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void jj()>
		a = io1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field io a>
	//    5    9:return          
	}

	public final Map a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final String c()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field io a>
	//*   2    4:ifnonnull       10
			return "";
	//    3    7:ldc1            #22  <String "">
	//    4    9:areturn         
		else
			return a.a();
	//    5   10:aload_0         
	//    6   11:getfield        #13  <Field io a>
	//    7   14:invokevirtual   #26  <Method String io.a()>
	//    8   17:areturn         
	}

	private io a;
}
