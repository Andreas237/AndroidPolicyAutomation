// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.util;

import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.amazonaws.util:
//			DateUtils

static final class DateUtils$1 extends ThreadLocal
{

	protected SimpleDateFormat a()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat(a, Locale.US);
	//    0    0:new             #22  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String a>
	//    4    8:getstatic       #28  <Field Locale Locale.US>
	//    5   11:invokespecial   #31  <Method void SimpleDateFormat(String, Locale)>
	//    6   14:astore_1        
		simpledateformat.setTimeZone(DateUtils.a());
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method java.util.TimeZone DateUtils.a()>
	//    9   19:invokevirtual   #38  <Method void SimpleDateFormat.setTimeZone(java.util.TimeZone)>
		simpledateformat.setLenient(false);
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #42  <Method void SimpleDateFormat.setLenient(boolean)>
		return simpledateformat;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	protected Object initialValue()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method SimpleDateFormat a()>
	//    2    4:areturn         
	}

	final String a;

	DateUtils$1(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void ThreadLocal()>
	//    5    9:return          
	}
}
