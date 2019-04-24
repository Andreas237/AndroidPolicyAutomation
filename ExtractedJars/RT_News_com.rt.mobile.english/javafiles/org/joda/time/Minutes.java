// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//			PeriodType, DurationFieldType, LocalTime, ReadablePartial, 
//			DateTimeUtils, Chronology, DurationField, ReadableInterval, 
//			Period, Days, Duration, Hours, 
//			Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Minutes extends BaseSingleFieldPeriod
{

	private Minutes(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #59  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Minutes minutes(int i)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #35  <Int 0x80000000>
	//*   2    3:icmpeq          73
		{
			if(i != 0x7fffffff)
	//*   3    6:iload_0         
	//*   4    7:ldc1            #32  <Int 0x7fffffff>
	//*   5    9:icmpeq          69
				switch(i)
	//*   6   12:iload_0         
				{
	//*   7   13:tableswitch     0 3: default 44
	//	               0 65
	//	               1 61
	//	               2 57
	//	               3 53
				default:
					return new Minutes(i);
	//    8   44:new             #2   <Class Minutes>
	//    9   47:dup             
	//   10   48:iload_0         
	//   11   49:invokespecial   #23  <Method void Minutes(int)>
	//   12   52:areturn         

				case 3: // '\003'
					return THREE;
	//   13   53:getstatic       #31  <Field Minutes THREE>
	//   14   56:areturn         

				case 2: // '\002'
					return TWO;
	//   15   57:getstatic       #29  <Field Minutes TWO>
	//   16   60:areturn         

				case 1: // '\001'
					return ONE;
	//   17   61:getstatic       #27  <Field Minutes ONE>
	//   18   64:areturn         

				case 0: // '\0'
					return ZERO;
	//   19   65:getstatic       #25  <Field Minutes ZERO>
	//   20   68:areturn         
				}
			else
				return MAX_VALUE;
	//   21   69:getstatic       #34  <Field Minutes MAX_VALUE>
	//   22   72:areturn         
		} else
		{
			return MIN_VALUE;
	//   23   73:getstatic       #37  <Field Minutes MIN_VALUE>
	//   24   76:areturn         
		}
	}

	public static Minutes minutesBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return minutes(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.minutes()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #67  <Method DurationFieldType DurationFieldType.minutes()>
	//    3    5:invokestatic    #71  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #73  <Method Minutes minutes(int)>
	//    5   11:areturn         
	}

	public static Minutes minutesBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalTime) && (readablepartial1 instanceof LocalTime))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #76  <Class LocalTime>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #76  <Class LocalTime>
	//*   5   11:ifeq            47
			return minutes(DateTimeUtils.getChronology(readablepartial.getChronology()).minutes().getDifference(((LocalTime)readablepartial1).getLocalMillis(), ((LocalTime)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #82  <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #87  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #92  <Method DurationField Chronology.minutes()>
	//   10   26:aload_1         
	//   11   27:checkcast       #76  <Class LocalTime>
	//   12   30:invokevirtual   #96  <Method long LocalTime.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #76  <Class LocalTime>
	//   15   37:invokevirtual   #96  <Method long LocalTime.getLocalMillis()>
	//   16   40:invokevirtual   #102 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #73  <Method Minutes minutes(int)>
	//   18   46:areturn         
		else
			return minutes(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #25  <Field Minutes ZERO>
	//   22   52:invokestatic    #105 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #73  <Method Minutes minutes(int)>
	//   24   58:areturn         
	}

	public static Minutes minutesIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Minutes ZERO>
	//    3    7:areturn         
		else
			return minutes(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.minutes()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #113 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #116 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #67  <Method DurationFieldType DurationFieldType.minutes()>
	//    9   23:invokestatic    #71  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #73  <Method Minutes minutes(int)>
	//   11   29:areturn         
	}

	public static Minutes parseMinutes(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Minutes ZERO>
	//    3    7:areturn         
		else
			return minutes(PARSER.parsePeriod(s).getMinutes());
	//    4    8:getstatic       #57  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #123 <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #129 <Method int Period.getMinutes()>
	//    8   18:invokestatic    #73  <Method Minutes minutes(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (minutes(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:invokestatic    #73  <Method Minutes minutes(int)>
	//    3    7:areturn         
	}

	public static Minutes standardMinutesIn(ReadablePeriod readableperiod)
	{
		return minutes(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 60000L));
	//    0    0:aload_0         
	//    1    1:ldc2w           #138 <Long 60000L>
	//    2    4:invokestatic    #143 <Method int BaseSingleFieldPeriod.standardPeriodIn(ReadablePeriod, long)>
	//    3    7:invokestatic    #73  <Method Minutes minutes(int)>
	//    4   10:areturn         
	}

	public Minutes dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return minutes(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #135 <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #73  <Method Minutes minutes(int)>
	//   10   16:areturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.minutes();
	//    0    0:invokestatic    #67  <Method DurationFieldType DurationFieldType.minutes()>
	//    1    3:areturn         
	}

	public int getMinutes()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:ireturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.minutes();
	//    0    0:invokestatic    #49  <Method PeriodType PeriodType.minutes()>
	//    1    3:areturn         
	}

	public boolean isGreaterThan(Minutes minutes1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(minutes1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() > 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #135 <Method int getValue()>
	//*   8   12:ifle            17
				flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_2        
			return flag;
	//   11   17:iload_2         
	//   12   18:ireturn         
		}
		flag = flag1;
	//   13   19:iload_3         
	//   14   20:istore_2        
		if(getValue() > minutes1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #135 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #135 <Method int getValue()>
	//*  19   29:icmple          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public boolean isLessThan(Minutes minutes1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(minutes1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() < 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #135 <Method int getValue()>
	//*   8   12:ifge            17
				flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_2        
			return flag;
	//   11   17:iload_2         
	//   12   18:ireturn         
		}
		flag = flag1;
	//   13   19:iload_3         
	//   14   20:istore_2        
		if(getValue() < minutes1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #135 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #135 <Method int getValue()>
	//*  19   29:icmpge          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public Minutes minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #156 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #159 <Method Minutes plus(int)>
	//    4    8:areturn         
	}

	public Minutes minus(Minutes minutes1)
	{
		if(minutes1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(minutes1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #135 <Method int getValue()>
	//    7   11:invokevirtual   #162 <Method Minutes minus(int)>
	//    8   14:areturn         
	}

	public Minutes multipliedBy(int i)
	{
		return minutes(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #73  <Method Minutes minutes(int)>
	//    5   11:areturn         
	}

	public Minutes negated()
	{
		return minutes(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:invokestatic    #156 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #73  <Method Minutes minutes(int)>
	//    4   10:areturn         
	}

	public Minutes plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minutes(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #135 <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #172 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #73  <Method Minutes minutes(int)>
	//    9   17:areturn         
	}

	public Minutes plus(Minutes minutes1)
	{
		if(minutes1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(minutes1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #135 <Method int getValue()>
	//    7   11:invokevirtual   #159 <Method Minutes plus(int)>
	//    8   14:areturn         
	}

	public Days toStandardDays()
	{
		return Days.days(getValue() / 1440);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:sipush          1440
	//    3    7:idiv            
	//    4    8:invokestatic    #180 <Method Days Days.days(int)>
	//    5   11:areturn         
	}

	public Duration toStandardDuration()
	{
		return new Duration((long)getValue() * 60000L);
	//    0    0:new             #184 <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #135 <Method int getValue()>
	//    4    8:i2l             
	//    5    9:ldc2w           #138 <Long 60000L>
	//    6   12:lmul            
	//    7   13:invokespecial   #187 <Method void Duration(long)>
	//    8   16:areturn         
	}

	public Hours toStandardHours()
	{
		return Hours.hours(getValue() / 60);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:bipush          60
	//    3    6:idiv            
	//    4    7:invokestatic    #195 <Method Hours Hours.hours(int)>
	//    5   10:areturn         
	}

	public Seconds toStandardSeconds()
	{
		return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 60));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:bipush          60
	//    3    6:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #203 <Method Seconds Seconds.seconds(int)>
	//    5   12:areturn         
	}

	public Weeks toStandardWeeks()
	{
		return Weeks.weeks(getValue() / 10080);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int getValue()>
	//    2    4:sipush          10080
	//    3    7:idiv            
	//    4    8:invokestatic    #211 <Method Weeks Weeks.weeks(int)>
	//    5   11:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #216 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PT");
	//    4    8:aload_1         
	//    5    9:ldc1            #220 <String "PT">
	//    6   11:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #135 <Method int getValue()>
	//   11   20:invokestatic    #230 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("M");
	//   14   27:aload_1         
	//   15   28:ldc1            #232 <String "M">
	//   16   30:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Minutes MAX_VALUE = new Minutes(0x7fffffff);
	public static final Minutes MIN_VALUE = new Minutes(0x80000000);
	public static final Minutes ONE = new Minutes(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());
	public static final Minutes THREE = new Minutes(3);
	public static final Minutes TWO = new Minutes(2);
	public static final Minutes ZERO = new Minutes(0);
	private static final long serialVersionUID = 0x4899417fL;

	static 
	{
	//    0    0:new             #2   <Class Minutes>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #23  <Method void Minutes(int)>
	//    4    8:putstatic       #25  <Field Minutes ZERO>
	//    5   11:new             #2   <Class Minutes>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #23  <Method void Minutes(int)>
	//    9   19:putstatic       #27  <Field Minutes ONE>
	//   10   22:new             #2   <Class Minutes>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #23  <Method void Minutes(int)>
	//   14   30:putstatic       #29  <Field Minutes TWO>
	//   15   33:new             #2   <Class Minutes>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #23  <Method void Minutes(int)>
	//   19   41:putstatic       #31  <Field Minutes THREE>
	//   20   44:new             #2   <Class Minutes>
	//   21   47:dup             
	//   22   48:ldc1            #32  <Int 0x7fffffff>
	//   23   50:invokespecial   #23  <Method void Minutes(int)>
	//   24   53:putstatic       #34  <Field Minutes MAX_VALUE>
	//   25   56:new             #2   <Class Minutes>
	//   26   59:dup             
	//   27   60:ldc1            #35  <Int 0x80000000>
	//   28   62:invokespecial   #23  <Method void Minutes(int)>
	//   29   65:putstatic       #37  <Field Minutes MIN_VALUE>
	//   30   68:invokestatic    #43  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   31   71:invokestatic    #49  <Method PeriodType PeriodType.minutes()>
	//   32   74:invokevirtual   #55  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   33   77:putstatic       #57  <Field PeriodFormatter PARSER>
	//*  34   80:return          
	}
}
