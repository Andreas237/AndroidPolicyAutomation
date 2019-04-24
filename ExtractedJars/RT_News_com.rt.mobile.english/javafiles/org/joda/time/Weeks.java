// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//			PeriodType, Period, DurationFieldType, LocalDate, 
//			ReadablePartial, DateTimeUtils, Chronology, DurationField, 
//			ReadableInterval, Days, Duration, Hours, 
//			Minutes, Seconds, ReadablePeriod, ReadableInstant

public final class Weeks extends BaseSingleFieldPeriod
{

	private Weeks(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #59  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Weeks parseWeeks(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Weeks ZERO>
	//    3    7:areturn         
		else
			return weeks(PARSER.parsePeriod(s).getWeeks());
	//    4    8:getstatic       #57  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #66  <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #72  <Method int Period.getWeeks()>
	//    8   18:invokestatic    #75  <Method Weeks weeks(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (weeks(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:invokestatic    #75  <Method Weeks weeks(int)>
	//    3    7:areturn         
	}

	public static Weeks standardWeeksIn(ReadablePeriod readableperiod)
	{
		return weeks(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x240c8400L));
	//    0    0:aload_0         
	//    1    1:ldc2w           #84  <Long 0x240c8400L>
	//    2    4:invokestatic    #89  <Method int BaseSingleFieldPeriod.standardPeriodIn(ReadablePeriod, long)>
	//    3    7:invokestatic    #75  <Method Weeks weeks(int)>
	//    4   10:areturn         
	}

	public static Weeks weeks(int i)
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
					return new Weeks(i);
	//    8   44:new             #2   <Class Weeks>
	//    9   47:dup             
	//   10   48:iload_0         
	//   11   49:invokespecial   #23  <Method void Weeks(int)>
	//   12   52:areturn         

				case 3: // '\003'
					return THREE;
	//   13   53:getstatic       #31  <Field Weeks THREE>
	//   14   56:areturn         

				case 2: // '\002'
					return TWO;
	//   15   57:getstatic       #29  <Field Weeks TWO>
	//   16   60:areturn         

				case 1: // '\001'
					return ONE;
	//   17   61:getstatic       #27  <Field Weeks ONE>
	//   18   64:areturn         

				case 0: // '\0'
					return ZERO;
	//   19   65:getstatic       #25  <Field Weeks ZERO>
	//   20   68:areturn         
				}
			else
				return MAX_VALUE;
	//   21   69:getstatic       #34  <Field Weeks MAX_VALUE>
	//   22   72:areturn         
		} else
		{
			return MIN_VALUE;
	//   23   73:getstatic       #37  <Field Weeks MIN_VALUE>
	//   24   76:areturn         
		}
	}

	public static Weeks weeksBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return weeks(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.weeks()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #96  <Method DurationFieldType DurationFieldType.weeks()>
	//    3    5:invokestatic    #100 <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #75  <Method Weeks weeks(int)>
	//    5   11:areturn         
	}

	public static Weeks weeksBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #103 <Class LocalDate>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #103 <Class LocalDate>
	//*   5   11:ifeq            47
			return weeks(DateTimeUtils.getChronology(readablepartial.getChronology()).weeks().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #109 <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #114 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #119 <Method DurationField Chronology.weeks()>
	//   10   26:aload_1         
	//   11   27:checkcast       #103 <Class LocalDate>
	//   12   30:invokevirtual   #123 <Method long LocalDate.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #103 <Class LocalDate>
	//   15   37:invokevirtual   #123 <Method long LocalDate.getLocalMillis()>
	//   16   40:invokevirtual   #129 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #75  <Method Weeks weeks(int)>
	//   18   46:areturn         
		else
			return weeks(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #25  <Field Weeks ZERO>
	//   22   52:invokestatic    #132 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #75  <Method Weeks weeks(int)>
	//   24   58:areturn         
	}

	public static Weeks weeksIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Weeks ZERO>
	//    3    7:areturn         
		else
			return weeks(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.weeks()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #140 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #143 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #96  <Method DurationFieldType DurationFieldType.weeks()>
	//    9   23:invokestatic    #100 <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #75  <Method Weeks weeks(int)>
	//   11   29:areturn         
	}

	public Weeks dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return weeks(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #75  <Method Weeks weeks(int)>
	//   10   16:areturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.weeks();
	//    0    0:invokestatic    #96  <Method DurationFieldType DurationFieldType.weeks()>
	//    1    3:areturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.weeks();
	//    0    0:invokestatic    #49  <Method PeriodType PeriodType.weeks()>
	//    1    3:areturn         
	}

	public int getWeeks()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:ireturn         
	}

	public boolean isGreaterThan(Weeks weeks1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(weeks1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() > 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #81  <Method int getValue()>
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
		if(getValue() > weeks1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #81  <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #81  <Method int getValue()>
	//*  19   29:icmple          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public boolean isLessThan(Weeks weeks1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(weeks1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() < 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #81  <Method int getValue()>
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
		if(getValue() < weeks1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #81  <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #81  <Method int getValue()>
	//*  19   29:icmpge          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public Weeks minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #156 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #159 <Method Weeks plus(int)>
	//    4    8:areturn         
	}

	public Weeks minus(Weeks weeks1)
	{
		if(weeks1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(weeks1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:invokevirtual   #162 <Method Weeks minus(int)>
	//    8   14:areturn         
	}

	public Weeks multipliedBy(int i)
	{
		return weeks(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #75  <Method Weeks weeks(int)>
	//    5   11:areturn         
	}

	public Weeks negated()
	{
		return weeks(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:invokestatic    #156 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #75  <Method Weeks weeks(int)>
	//    4   10:areturn         
	}

	public Weeks plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return weeks(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #81  <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #172 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #75  <Method Weeks weeks(int)>
	//    9   17:areturn         
	}

	public Weeks plus(Weeks weeks1)
	{
		if(weeks1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(weeks1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:invokevirtual   #159 <Method Weeks plus(int)>
	//    8   14:areturn         
	}

	public Days toStandardDays()
	{
		return Days.days(FieldUtils.safeMultiply(getValue(), 7));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:bipush          7
	//    3    6:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #180 <Method Days Days.days(int)>
	//    5   12:areturn         
	}

	public Duration toStandardDuration()
	{
		return new Duration((long)getValue() * 0x240c8400L);
	//    0    0:new             #184 <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #81  <Method int getValue()>
	//    4    8:i2l             
	//    5    9:ldc2w           #84  <Long 0x240c8400L>
	//    6   12:lmul            
	//    7   13:invokespecial   #187 <Method void Duration(long)>
	//    8   16:areturn         
	}

	public Hours toStandardHours()
	{
		return Hours.hours(FieldUtils.safeMultiply(getValue(), 168));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:sipush          168
	//    3    7:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4   10:invokestatic    #195 <Method Hours Hours.hours(int)>
	//    5   13:areturn         
	}

	public Minutes toStandardMinutes()
	{
		return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 10080));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:sipush          10080
	//    3    7:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4   10:invokestatic    #203 <Method Minutes Minutes.minutes(int)>
	//    5   13:areturn         
	}

	public Seconds toStandardSeconds()
	{
		return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 0x93a80));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:ldc1            #206 <Int 0x93a80>
	//    3    6:invokestatic    #167 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #212 <Method Seconds Seconds.seconds(int)>
	//    5   12:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #217 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("P");
	//    4    8:aload_1         
	//    5    9:ldc1            #221 <String "P">
	//    6   11:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #81  <Method int getValue()>
	//   11   20:invokestatic    #231 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("W");
	//   14   27:aload_1         
	//   15   28:ldc1            #233 <String "W">
	//   16   30:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #235 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Weeks MAX_VALUE = new Weeks(0x7fffffff);
	public static final Weeks MIN_VALUE = new Weeks(0x80000000);
	public static final Weeks ONE = new Weeks(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());
	public static final Weeks THREE = new Weeks(3);
	public static final Weeks TWO = new Weeks(2);
	public static final Weeks ZERO = new Weeks(0);
	private static final long serialVersionUID = 0x48994182L;

	static 
	{
	//    0    0:new             #2   <Class Weeks>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #23  <Method void Weeks(int)>
	//    4    8:putstatic       #25  <Field Weeks ZERO>
	//    5   11:new             #2   <Class Weeks>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #23  <Method void Weeks(int)>
	//    9   19:putstatic       #27  <Field Weeks ONE>
	//   10   22:new             #2   <Class Weeks>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #23  <Method void Weeks(int)>
	//   14   30:putstatic       #29  <Field Weeks TWO>
	//   15   33:new             #2   <Class Weeks>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #23  <Method void Weeks(int)>
	//   19   41:putstatic       #31  <Field Weeks THREE>
	//   20   44:new             #2   <Class Weeks>
	//   21   47:dup             
	//   22   48:ldc1            #32  <Int 0x7fffffff>
	//   23   50:invokespecial   #23  <Method void Weeks(int)>
	//   24   53:putstatic       #34  <Field Weeks MAX_VALUE>
	//   25   56:new             #2   <Class Weeks>
	//   26   59:dup             
	//   27   60:ldc1            #35  <Int 0x80000000>
	//   28   62:invokespecial   #23  <Method void Weeks(int)>
	//   29   65:putstatic       #37  <Field Weeks MIN_VALUE>
	//   30   68:invokestatic    #43  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   31   71:invokestatic    #49  <Method PeriodType PeriodType.weeks()>
	//   32   74:invokevirtual   #55  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   33   77:putstatic       #57  <Field PeriodFormatter PARSER>
	//*  34   80:return          
	}
}
