// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import java.lang.reflect.Field;
import java.util.Locale;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			d

static final class d$4 extends d
{

	public String a(Field field)
	{
		return d.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method String Field.getName()>
	//    2    4:ldc1            #20  <String "_">
	//    3    6:invokestatic    #23  <Method String d.a(String, String)>
	//    4    9:getstatic       #29  <Field Locale Locale.ENGLISH>
	//    5   12:invokevirtual   #35  <Method String String.toLowerCase(Locale)>
	//    6   15:areturn         
	}

	d$4(String s, int i)
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
