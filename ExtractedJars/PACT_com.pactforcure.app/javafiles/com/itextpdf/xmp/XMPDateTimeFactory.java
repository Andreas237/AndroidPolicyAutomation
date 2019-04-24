// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.XMPDateTimeImpl;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp:
//			XMPDateTime, XMPException

public final class XMPDateTimeFactory
{

	private XMPDateTimeFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static XMPDateTime convertToLocalTime(XMPDateTime xmpdatetime)
	{
		long l = xmpdatetime.getCalendar().getTimeInMillis();
	//    0    0:aload_0         
	//    1    1:invokeinterface #29  <Method Calendar XMPDateTime.getCalendar()>
	//    2    6:invokevirtual   #35  <Method long Calendar.getTimeInMillis()>
	//    3    9:lstore_1        
		xmpdatetime = ((XMPDateTime) (new GregorianCalendar()));
	//    4   10:new             #37  <Class GregorianCalendar>
	//    5   13:dup             
	//    6   14:invokespecial   #38  <Method void GregorianCalendar()>
	//    7   17:astore_0        
		((GregorianCalendar) (xmpdatetime)).setTimeInMillis(l);
	//    8   18:aload_0         
	//    9   19:lload_1         
	//   10   20:invokevirtual   #42  <Method void GregorianCalendar.setTimeInMillis(long)>
		return ((XMPDateTime) (new XMPDateTimeImpl(((Calendar) (xmpdatetime)))));
	//   11   23:new             #44  <Class XMPDateTimeImpl>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #47  <Method void XMPDateTimeImpl(Calendar)>
	//   15   31:areturn         
	}

	public static XMPDateTime convertToUTCTime(XMPDateTime xmpdatetime)
	{
		long l = xmpdatetime.getCalendar().getTimeInMillis();
	//    0    0:aload_0         
	//    1    1:invokeinterface #29  <Method Calendar XMPDateTime.getCalendar()>
	//    2    6:invokevirtual   #35  <Method long Calendar.getTimeInMillis()>
	//    3    9:lstore_1        
		xmpdatetime = ((XMPDateTime) (new GregorianCalendar(UTC)));
	//    4   10:new             #37  <Class GregorianCalendar>
	//    5   13:dup             
	//    6   14:getstatic       #17  <Field TimeZone UTC>
	//    7   17:invokespecial   #51  <Method void GregorianCalendar(TimeZone)>
	//    8   20:astore_0        
		((GregorianCalendar) (xmpdatetime)).setGregorianChange(new Date(0x0L));
	//    9   21:aload_0         
	//   10   22:new             #53  <Class Date>
	//   11   25:dup             
	//   12   26:ldc2w           #54  <Long 0x0L>
	//   13   29:invokespecial   #57  <Method void Date(long)>
	//   14   32:invokevirtual   #61  <Method void GregorianCalendar.setGregorianChange(Date)>
		((GregorianCalendar) (xmpdatetime)).setTimeInMillis(l);
	//   15   35:aload_0         
	//   16   36:lload_1         
	//   17   37:invokevirtual   #42  <Method void GregorianCalendar.setTimeInMillis(long)>
		return ((XMPDateTime) (new XMPDateTimeImpl(((Calendar) (xmpdatetime)))));
	//   18   40:new             #44  <Class XMPDateTimeImpl>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:invokespecial   #47  <Method void XMPDateTimeImpl(Calendar)>
	//   22   48:areturn         
	}

	public static XMPDateTime create()
	{
		return ((XMPDateTime) (new XMPDateTimeImpl()));
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void XMPDateTimeImpl()>
	//    3    7:areturn         
	}

	public static XMPDateTime create(int i, int j, int k)
	{
		XMPDateTimeImpl xmpdatetimeimpl = new XMPDateTimeImpl();
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void XMPDateTimeImpl()>
	//    3    7:astore_3        
		((XMPDateTime) (xmpdatetimeimpl)).setYear(i);
	//    4    8:aload_3         
	//    5    9:iload_0         
	//    6   10:invokeinterface #69  <Method void XMPDateTime.setYear(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setMonth(j);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokeinterface #72  <Method void XMPDateTime.setMonth(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setDay(k);
	//   10   22:aload_3         
	//   11   23:iload_2         
	//   12   24:invokeinterface #75  <Method void XMPDateTime.setDay(int)>
		return ((XMPDateTime) (xmpdatetimeimpl));
	//   13   29:aload_3         
	//   14   30:areturn         
	}

	public static XMPDateTime create(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		XMPDateTimeImpl xmpdatetimeimpl = new XMPDateTimeImpl();
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void XMPDateTimeImpl()>
	//    3    7:astore          7
		((XMPDateTime) (xmpdatetimeimpl)).setYear(i);
	//    4    9:aload           7
	//    5   11:iload_0         
	//    6   12:invokeinterface #69  <Method void XMPDateTime.setYear(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setMonth(j);
	//    7   17:aload           7
	//    8   19:iload_1         
	//    9   20:invokeinterface #72  <Method void XMPDateTime.setMonth(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setDay(k);
	//   10   25:aload           7
	//   11   27:iload_2         
	//   12   28:invokeinterface #75  <Method void XMPDateTime.setDay(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setHour(l);
	//   13   33:aload           7
	//   14   35:iload_3         
	//   15   36:invokeinterface #79  <Method void XMPDateTime.setHour(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setMinute(i1);
	//   16   41:aload           7
	//   17   43:iload           4
	//   18   45:invokeinterface #82  <Method void XMPDateTime.setMinute(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setSecond(j1);
	//   19   50:aload           7
	//   20   52:iload           5
	//   21   54:invokeinterface #85  <Method void XMPDateTime.setSecond(int)>
		((XMPDateTime) (xmpdatetimeimpl)).setNanoSecond(k1);
	//   22   59:aload           7
	//   23   61:iload           6
	//   24   63:invokeinterface #88  <Method void XMPDateTime.setNanoSecond(int)>
		return ((XMPDateTime) (xmpdatetimeimpl));
	//   25   68:aload           7
	//   26   70:areturn         
	}

	public static XMPDateTime createFromCalendar(Calendar calendar)
	{
		return ((XMPDateTime) (new XMPDateTimeImpl(calendar)));
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void XMPDateTimeImpl(Calendar)>
	//    4    8:areturn         
	}

	public static XMPDateTime createFromISO8601(String s)
		throws XMPException
	{
		return ((XMPDateTime) (new XMPDateTimeImpl(s)));
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #97  <Method void XMPDateTimeImpl(String)>
	//    4    8:areturn         
	}

	public static XMPDateTime getCurrentDateTime()
	{
		return ((XMPDateTime) (new XMPDateTimeImpl(((Calendar) (new GregorianCalendar())))));
	//    0    0:new             #44  <Class XMPDateTimeImpl>
	//    1    3:dup             
	//    2    4:new             #37  <Class GregorianCalendar>
	//    3    7:dup             
	//    4    8:invokespecial   #38  <Method void GregorianCalendar()>
	//    5   11:invokespecial   #47  <Method void XMPDateTimeImpl(Calendar)>
	//    6   14:areturn         
	}

	public static XMPDateTime setLocalTimeZone(XMPDateTime xmpdatetime)
	{
		xmpdatetime = ((XMPDateTime) (xmpdatetime.getCalendar()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #29  <Method Calendar XMPDateTime.getCalendar()>
	//    2    6:astore_0        
		((Calendar) (xmpdatetime)).setTimeZone(TimeZone.getDefault());
	//    3    7:aload_0         
	//    4    8:invokestatic    #104 <Method TimeZone TimeZone.getDefault()>
	//    5   11:invokevirtual   #107 <Method void Calendar.setTimeZone(TimeZone)>
		return ((XMPDateTime) (new XMPDateTimeImpl(((Calendar) (xmpdatetime)))));
	//    6   14:new             #44  <Class XMPDateTimeImpl>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #47  <Method void XMPDateTimeImpl(Calendar)>
	//   10   22:areturn         
	}

	private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

	static 
	{
	//    0    0:ldc1            #9   <String "UTC">
	//    1    2:invokestatic    #15  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #17  <Field TimeZone UTC>
	//*   3    8:return          
	}
}
