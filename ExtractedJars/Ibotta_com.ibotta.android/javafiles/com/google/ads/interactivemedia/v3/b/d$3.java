// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import java.lang.reflect.Field;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			d

static final class d$3 extends d
{

	public String a(Field field)
	{
		return d.a(d.a(field.getName(), " "));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method String Field.getName()>
	//    2    4:ldc1            #20  <String " ">
	//    3    6:invokestatic    #23  <Method String d.a(String, String)>
	//    4    9:invokestatic    #26  <Method String d.a(String)>
	//    5   12:areturn         
	}

	d$3(String s, int i)
	{
		super(s, i, ((d$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #9   <Method void d(String, int, d$1)>
	//    5    7:return          
	}
}
