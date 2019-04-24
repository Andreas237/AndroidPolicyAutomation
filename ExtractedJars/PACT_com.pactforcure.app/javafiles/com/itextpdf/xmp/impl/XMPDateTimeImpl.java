// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPDateTime;
import com.itextpdf.xmp.XMPException;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			ISO8601Converter

public class XMPDateTimeImpl
	implements XMPDateTime
{

	public XMPDateTimeImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		year = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int year>
		month = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field int month>
		day = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field int day>
		hour = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #32  <Field int hour>
		minute = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #34  <Field int minute>
		second = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #36  <Field int second>
		timeZone = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #38  <Field TimeZone timeZone>
		hasDate = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #40  <Field boolean hasDate>
		hasTime = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #42  <Field boolean hasTime>
		hasTimeZone = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #44  <Field boolean hasTimeZone>
	//   32   54:return          
	}

	public XMPDateTimeImpl(String s)
		throws XMPException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		year = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int year>
		month = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field int month>
		day = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field int day>
		hour = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #32  <Field int hour>
		minute = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #34  <Field int minute>
		second = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #36  <Field int second>
		timeZone = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #38  <Field TimeZone timeZone>
		hasDate = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #40  <Field boolean hasDate>
		hasTime = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #42  <Field boolean hasTime>
		hasTimeZone = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #44  <Field boolean hasTimeZone>
		ISO8601Converter.parse(s, ((XMPDateTime) (this)));
	//   32   54:aload_1         
	//   33   55:aload_0         
	//   34   56:invokestatic    #54  <Method XMPDateTime ISO8601Converter.parse(String, XMPDateTime)>
	//   35   59:pop             
	//   36   60:return          
	}

	public XMPDateTimeImpl(Calendar calendar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		year = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int year>
		month = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field int month>
		day = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field int day>
		hour = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #32  <Field int hour>
		minute = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #34  <Field int minute>
		second = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #36  <Field int second>
		timeZone = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #38  <Field TimeZone timeZone>
		hasDate = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #40  <Field boolean hasDate>
		hasTime = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #42  <Field boolean hasTime>
		hasTimeZone = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #44  <Field boolean hasTimeZone>
		Date date = calendar.getTime();
	//   32   54:aload_1         
	//   33   55:invokevirtual   #62  <Method Date Calendar.getTime()>
	//   34   58:astore_2        
		calendar = ((Calendar) (calendar.getTimeZone()));
	//   35   59:aload_1         
	//   36   60:invokevirtual   #66  <Method TimeZone Calendar.getTimeZone()>
	//   37   63:astore_1        
		GregorianCalendar gregoriancalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
	//   38   64:getstatic       #72  <Field Locale Locale.US>
	//   39   67:invokestatic    #76  <Method Calendar Calendar.getInstance(Locale)>
	//   40   70:checkcast       #78  <Class GregorianCalendar>
	//   41   73:astore_3        
		gregoriancalendar.setGregorianChange(new Date(0x0L));
	//   42   74:aload_3         
	//   43   75:new             #80  <Class Date>
	//   44   78:dup             
	//   45   79:ldc2w           #81  <Long 0x0L>
	//   46   82:invokespecial   #85  <Method void Date(long)>
	//   47   85:invokevirtual   #89  <Method void GregorianCalendar.setGregorianChange(Date)>
		gregoriancalendar.setTimeZone(((TimeZone) (calendar)));
	//   48   88:aload_3         
	//   49   89:aload_1         
	//   50   90:invokevirtual   #93  <Method void GregorianCalendar.setTimeZone(TimeZone)>
		gregoriancalendar.setTime(date);
	//   51   93:aload_3         
	//   52   94:aload_2         
	//   53   95:invokevirtual   #96  <Method void GregorianCalendar.setTime(Date)>
		year = gregoriancalendar.get(1);
	//   54   98:aload_0         
	//   55   99:aload_3         
	//   56  100:iconst_1        
	//   57  101:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   58  104:putfield        #26  <Field int year>
		month = gregoriancalendar.get(2) + 1;
	//   59  107:aload_0         
	//   60  108:aload_3         
	//   61  109:iconst_2        
	//   62  110:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   63  113:iconst_1        
	//   64  114:iadd            
	//   65  115:putfield        #28  <Field int month>
		day = gregoriancalendar.get(5);
	//   66  118:aload_0         
	//   67  119:aload_3         
	//   68  120:iconst_5        
	//   69  121:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   70  124:putfield        #30  <Field int day>
		hour = gregoriancalendar.get(11);
	//   71  127:aload_0         
	//   72  128:aload_3         
	//   73  129:bipush          11
	//   74  131:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   75  134:putfield        #32  <Field int hour>
		minute = gregoriancalendar.get(12);
	//   76  137:aload_0         
	//   77  138:aload_3         
	//   78  139:bipush          12
	//   79  141:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   80  144:putfield        #34  <Field int minute>
		second = gregoriancalendar.get(13);
	//   81  147:aload_0         
	//   82  148:aload_3         
	//   83  149:bipush          13
	//   84  151:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   85  154:putfield        #36  <Field int second>
		nanoSeconds = gregoriancalendar.get(14) * 0xf4240;
	//   86  157:aload_0         
	//   87  158:aload_3         
	//   88  159:bipush          14
	//   89  161:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   90  164:ldc1            #101 <Int 0xf4240>
	//   91  166:imul            
	//   92  167:putfield        #103 <Field int nanoSeconds>
		timeZone = gregoriancalendar.getTimeZone();
	//   93  170:aload_0         
	//   94  171:aload_3         
	//   95  172:invokevirtual   #104 <Method TimeZone GregorianCalendar.getTimeZone()>
	//   96  175:putfield        #38  <Field TimeZone timeZone>
		hasTimeZone = true;
	//   97  178:aload_0         
	//   98  179:iconst_1        
	//   99  180:putfield        #44  <Field boolean hasTimeZone>
		hasTime = true;
	//  100  183:aload_0         
	//  101  184:iconst_1        
	//  102  185:putfield        #42  <Field boolean hasTime>
		hasDate = true;
	//  103  188:aload_0         
	//  104  189:iconst_1        
	//  105  190:putfield        #40  <Field boolean hasDate>
	//  106  193:return          
	}

	public XMPDateTimeImpl(Date date, TimeZone timezone)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		year = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int year>
		month = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field int month>
		day = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field int day>
		hour = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #32  <Field int hour>
		minute = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #34  <Field int minute>
		second = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #36  <Field int second>
		timeZone = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #38  <Field TimeZone timeZone>
		hasDate = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #40  <Field boolean hasDate>
		hasTime = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #42  <Field boolean hasTime>
		hasTimeZone = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #44  <Field boolean hasTimeZone>
		GregorianCalendar gregoriancalendar = new GregorianCalendar(timezone);
	//   32   54:new             #78  <Class GregorianCalendar>
	//   33   57:dup             
	//   34   58:aload_2         
	//   35   59:invokespecial   #107 <Method void GregorianCalendar(TimeZone)>
	//   36   62:astore_3        
		gregoriancalendar.setTime(date);
	//   37   63:aload_3         
	//   38   64:aload_1         
	//   39   65:invokevirtual   #96  <Method void GregorianCalendar.setTime(Date)>
		year = gregoriancalendar.get(1);
	//   40   68:aload_0         
	//   41   69:aload_3         
	//   42   70:iconst_1        
	//   43   71:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   44   74:putfield        #26  <Field int year>
		month = gregoriancalendar.get(2) + 1;
	//   45   77:aload_0         
	//   46   78:aload_3         
	//   47   79:iconst_2        
	//   48   80:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   49   83:iconst_1        
	//   50   84:iadd            
	//   51   85:putfield        #28  <Field int month>
		day = gregoriancalendar.get(5);
	//   52   88:aload_0         
	//   53   89:aload_3         
	//   54   90:iconst_5        
	//   55   91:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   56   94:putfield        #30  <Field int day>
		hour = gregoriancalendar.get(11);
	//   57   97:aload_0         
	//   58   98:aload_3         
	//   59   99:bipush          11
	//   60  101:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   61  104:putfield        #32  <Field int hour>
		minute = gregoriancalendar.get(12);
	//   62  107:aload_0         
	//   63  108:aload_3         
	//   64  109:bipush          12
	//   65  111:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   66  114:putfield        #34  <Field int minute>
		second = gregoriancalendar.get(13);
	//   67  117:aload_0         
	//   68  118:aload_3         
	//   69  119:bipush          13
	//   70  121:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   71  124:putfield        #36  <Field int second>
		nanoSeconds = gregoriancalendar.get(14) * 0xf4240;
	//   72  127:aload_0         
	//   73  128:aload_3         
	//   74  129:bipush          14
	//   75  131:invokevirtual   #100 <Method int GregorianCalendar.get(int)>
	//   76  134:ldc1            #101 <Int 0xf4240>
	//   77  136:imul            
	//   78  137:putfield        #103 <Field int nanoSeconds>
		timeZone = timezone;
	//   79  140:aload_0         
	//   80  141:aload_2         
	//   81  142:putfield        #38  <Field TimeZone timeZone>
		hasTimeZone = true;
	//   82  145:aload_0         
	//   83  146:iconst_1        
	//   84  147:putfield        #44  <Field boolean hasTimeZone>
		hasTime = true;
	//   85  150:aload_0         
	//   86  151:iconst_1        
	//   87  152:putfield        #42  <Field boolean hasTime>
		hasDate = true;
	//   88  155:aload_0         
	//   89  156:iconst_1        
	//   90  157:putfield        #40  <Field boolean hasDate>
	//   91  160:return          
	}

	public int compareTo(Object obj)
	{
		long l = getCalendar().getTimeInMillis() - ((XMPDateTime)obj).getCalendar().getTimeInMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Calendar getCalendar()>
	//    2    4:invokevirtual   #117 <Method long Calendar.getTimeInMillis()>
	//    3    7:aload_1         
	//    4    8:checkcast       #6   <Class XMPDateTime>
	//    5   11:invokeinterface #118 <Method Calendar XMPDateTime.getCalendar()>
	//    6   16:invokevirtual   #117 <Method long Calendar.getTimeInMillis()>
	//    7   19:lsub            
	//    8   20:lstore_2        
		if(l != 0L)
	//*   9   21:lload_2         
	//*  10   22:lconst_0        
	//*  11   23:lcmp            
	//*  12   24:ifeq            34
			return (int)Math.signum(l);
	//   13   27:lload_2         
	//   14   28:l2f             
	//   15   29:invokestatic    #124 <Method float Math.signum(float)>
	//   16   32:f2i             
	//   17   33:ireturn         
		else
			return (int)Math.signum((long)(nanoSeconds - ((XMPDateTime)obj).getNanoSecond()));
	//   18   34:aload_0         
	//   19   35:getfield        #103 <Field int nanoSeconds>
	//   20   38:aload_1         
	//   21   39:checkcast       #6   <Class XMPDateTime>
	//   22   42:invokeinterface #128 <Method int XMPDateTime.getNanoSecond()>
	//   23   47:isub            
	//   24   48:i2l             
	//   25   49:l2f             
	//   26   50:invokestatic    #124 <Method float Math.signum(float)>
	//   27   53:f2i             
	//   28   54:ireturn         
	}

	public Calendar getCalendar()
	{
		GregorianCalendar gregoriancalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
	//    0    0:getstatic       #72  <Field Locale Locale.US>
	//    1    3:invokestatic    #76  <Method Calendar Calendar.getInstance(Locale)>
	//    2    6:checkcast       #78  <Class GregorianCalendar>
	//    3    9:astore_1        
		gregoriancalendar.setGregorianChange(new Date(0x0L));
	//    4   10:aload_1         
	//    5   11:new             #80  <Class Date>
	//    6   14:dup             
	//    7   15:ldc2w           #81  <Long 0x0L>
	//    8   18:invokespecial   #85  <Method void Date(long)>
	//    9   21:invokevirtual   #89  <Method void GregorianCalendar.setGregorianChange(Date)>
		if(hasTimeZone)
	//*  10   24:aload_0         
	//*  11   25:getfield        #44  <Field boolean hasTimeZone>
	//*  12   28:ifeq            39
			gregoriancalendar.setTimeZone(timeZone);
	//   13   31:aload_1         
	//   14   32:aload_0         
	//   15   33:getfield        #38  <Field TimeZone timeZone>
	//   16   36:invokevirtual   #93  <Method void GregorianCalendar.setTimeZone(TimeZone)>
		gregoriancalendar.set(1, year);
	//   17   39:aload_1         
	//   18   40:iconst_1        
	//   19   41:aload_0         
	//   20   42:getfield        #26  <Field int year>
	//   21   45:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(2, month - 1);
	//   22   48:aload_1         
	//   23   49:iconst_2        
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field int month>
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(5, day);
	//   29   59:aload_1         
	//   30   60:iconst_5        
	//   31   61:aload_0         
	//   32   62:getfield        #30  <Field int day>
	//   33   65:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(11, hour);
	//   34   68:aload_1         
	//   35   69:bipush          11
	//   36   71:aload_0         
	//   37   72:getfield        #32  <Field int hour>
	//   38   75:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(12, minute);
	//   39   78:aload_1         
	//   40   79:bipush          12
	//   41   81:aload_0         
	//   42   82:getfield        #34  <Field int minute>
	//   43   85:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(13, second);
	//   44   88:aload_1         
	//   45   89:bipush          13
	//   46   91:aload_0         
	//   47   92:getfield        #36  <Field int second>
	//   48   95:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		gregoriancalendar.set(14, nanoSeconds / 0xf4240);
	//   49   98:aload_1         
	//   50   99:bipush          14
	//   51  101:aload_0         
	//   52  102:getfield        #103 <Field int nanoSeconds>
	//   53  105:ldc1            #101 <Int 0xf4240>
	//   54  107:idiv            
	//   55  108:invokevirtual   #132 <Method void GregorianCalendar.set(int, int)>
		return ((Calendar) (gregoriancalendar));
	//   56  111:aload_1         
	//   57  112:areturn         
	}

	public int getDay()
	{
		return day;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int day>
	//    2    4:ireturn         
	}

	public int getHour()
	{
		return hour;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int hour>
	//    2    4:ireturn         
	}

	public String getISO8601String()
	{
		return ISO8601Converter.render(((XMPDateTime) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #140 <Method String ISO8601Converter.render(XMPDateTime)>
	//    2    4:areturn         
	}

	public int getMinute()
	{
		return minute;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int minute>
	//    2    4:ireturn         
	}

	public int getMonth()
	{
		return month;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int month>
	//    2    4:ireturn         
	}

	public int getNanoSecond()
	{
		return nanoSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int nanoSeconds>
	//    2    4:ireturn         
	}

	public int getSecond()
	{
		return second;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int second>
	//    2    4:ireturn         
	}

	public TimeZone getTimeZone()
	{
		return timeZone;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field TimeZone timeZone>
	//    2    4:areturn         
	}

	public int getYear()
	{
		return year;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int year>
	//    2    4:ireturn         
	}

	public boolean hasDate()
	{
		return hasDate;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean hasDate>
	//    2    4:ireturn         
	}

	public boolean hasTime()
	{
		return hasTime;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean hasTime>
	//    2    4:ireturn         
	}

	public boolean hasTimeZone()
	{
		return hasTimeZone;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean hasTimeZone>
	//    2    4:ireturn         
	}

	public void setDay(int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          16
			day = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #30  <Field int day>
		else
	//*   6   10:aload_0         
	//*   7   11:iconst_1        
	//*   8   12:putfield        #40  <Field boolean hasDate>
	//*   9   15:return          
		if(i > 31)
	//*  10   16:iload_1         
	//*  11   17:bipush          31
	//*  12   19:icmple          31
			day = 31;
	//   13   22:aload_0         
	//   14   23:bipush          31
	//   15   25:putfield        #30  <Field int day>
		else
	//*  16   28:goto            10
			day = i;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:putfield        #30  <Field int day>
		hasDate = true;
	//*  20   36:goto            10
	}

	public void setHour(int i)
	{
		hour = Math.min(Math.abs(i), 23);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #151 <Method int Math.abs(int)>
	//    3    5:bipush          23
	//    4    7:invokestatic    #155 <Method int Math.min(int, int)>
	//    5   10:putfield        #32  <Field int hour>
		hasTime = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #42  <Field boolean hasTime>
	//    9   18:return          
	}

	public void setMinute(int i)
	{
		minute = Math.min(Math.abs(i), 59);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #151 <Method int Math.abs(int)>
	//    3    5:bipush          59
	//    4    7:invokestatic    #155 <Method int Math.min(int, int)>
	//    5   10:putfield        #34  <Field int minute>
		hasTime = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #42  <Field boolean hasTime>
	//    9   18:return          
	}

	public void setMonth(int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          16
			month = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #28  <Field int month>
		else
	//*   6   10:aload_0         
	//*   7   11:iconst_1        
	//*   8   12:putfield        #40  <Field boolean hasDate>
	//*   9   15:return          
		if(i > 12)
	//*  10   16:iload_1         
	//*  11   17:bipush          12
	//*  12   19:icmple          31
			month = 12;
	//   13   22:aload_0         
	//   14   23:bipush          12
	//   15   25:putfield        #28  <Field int month>
		else
	//*  16   28:goto            10
			month = i;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:putfield        #28  <Field int month>
		hasDate = true;
	//*  20   36:goto            10
	}

	public void setNanoSecond(int i)
	{
		nanoSeconds = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #103 <Field int nanoSeconds>
		hasTime = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #42  <Field boolean hasTime>
	//    6   10:return          
	}

	public void setSecond(int i)
	{
		second = Math.min(Math.abs(i), 59);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #151 <Method int Math.abs(int)>
	//    3    5:bipush          59
	//    4    7:invokestatic    #155 <Method int Math.min(int, int)>
	//    5   10:putfield        #36  <Field int second>
		hasTime = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #42  <Field boolean hasTime>
	//    9   18:return          
	}

	public void setTimeZone(TimeZone timezone)
	{
		timeZone = timezone;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field TimeZone timeZone>
		hasTime = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #42  <Field boolean hasTime>
		hasTimeZone = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #44  <Field boolean hasTimeZone>
	//    9   15:return          
	}

	public void setYear(int i)
	{
		year = Math.min(Math.abs(i), 9999);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #151 <Method int Math.abs(int)>
	//    3    5:sipush          9999
	//    4    8:invokestatic    #155 <Method int Math.min(int, int)>
	//    5   11:putfield        #26  <Field int year>
		hasDate = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #40  <Field boolean hasDate>
	//    9   19:return          
	}

	public String toString()
	{
		return getISO8601String();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method String getISO8601String()>
	//    2    4:areturn         
	}

	private int day;
	private boolean hasDate;
	private boolean hasTime;
	private boolean hasTimeZone;
	private int hour;
	private int minute;
	private int month;
	private int nanoSeconds;
	private int second;
	private TimeZone timeZone;
	private int year;
}
