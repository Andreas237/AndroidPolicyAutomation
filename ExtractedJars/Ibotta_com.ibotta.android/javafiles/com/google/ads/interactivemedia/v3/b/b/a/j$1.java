// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.*;
import java.sql.Date;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			j

static final class j$1
	implements x
{

	public w a(f f, a a1)
	{
		if(a1.a() == java/sql/Date)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #20  <Method Class a.a()>
	//*   2    4:ldc1            #22  <Class Date>
	//*   3    6:if_acmpne       17
			return ((w) (new j()));
	//    4    9:new             #8   <Class j>
	//    5   12:dup             
	//    6   13:invokespecial   #23  <Method void j()>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	j$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
