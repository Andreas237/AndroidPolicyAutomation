// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.text.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ISO8601Utils

public class ISO8601DateFormat extends DateFormat
{

	public ISO8601DateFormat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void DateFormat()>
		numberFormat = NUMBER_FORMAT;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field NumberFormat NUMBER_FORMAT>
	//    4    8:putfield        #31  <Field NumberFormat numberFormat>
		calendar = CALENDAR;
	//    5   11:aload_0         
	//    6   12:getstatic       #21  <Field Calendar CALENDAR>
	//    7   15:putfield        #34  <Field Calendar calendar>
	//    8   18:return          
	}

	public Object clone()
	{
		return ((Object) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
	{
		stringbuffer.append(ISO8601Utils.format(date));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method String ISO8601Utils.format(Date)>
	//    3    5:invokevirtual   #49  <Method StringBuffer StringBuffer.append(String)>
	//    4    8:pop             
		return stringbuffer;
	//    5    9:aload_2         
	//    6   10:areturn         
	}

	public Date parse(String s)
		throws ParseException
	{
		return ISO8601Utils.parse(s, new ParsePosition(0));
	//    0    0:aload_1         
	//    1    1:new             #55  <Class ParsePosition>
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:invokespecial   #58  <Method void ParsePosition(int)>
	//    5    9:invokestatic    #61  <Method Date ISO8601Utils.parse(String, ParsePosition)>
	//    6   12:areturn         
	}

	public Date parse(String s, ParsePosition parseposition)
	{
		try
		{
			s = ((String) (ISO8601Utils.parse(s, parseposition)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #61  <Method Date ISO8601Utils.parse(String, ParsePosition)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    8:astore_1        
		{
			return null;
	//    7    9:aconst_null     
	//    8   10:areturn         
		}
		return ((Date) (s));
	}

	public String toString()
	{
		return ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #75  <Method String Class.getName()>
	//    3    7:areturn         
	}

	private static Calendar CALENDAR = new GregorianCalendar();
	private static NumberFormat NUMBER_FORMAT = new DecimalFormat();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #16  <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void GregorianCalendar()>
	//    3    7:putstatic       #21  <Field Calendar CALENDAR>
	//    4   10:new             #23  <Class DecimalFormat>
	//    5   13:dup             
	//    6   14:invokespecial   #24  <Method void DecimalFormat()>
	//    7   17:putstatic       #26  <Field NumberFormat NUMBER_FORMAT>
	//*   8   20:return          
	}
}
