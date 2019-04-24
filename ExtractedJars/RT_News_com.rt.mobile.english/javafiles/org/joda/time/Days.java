// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//			PeriodType, DurationFieldType, LocalDate, ReadablePartial, 
//			DateTimeUtils, Chronology, DurationField, ReadableInterval, 
//			Period, Duration, Hours, Minutes, 
//			Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Days extends BaseSingleFieldPeriod
{

	private Days(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #71  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Days days(int i)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #47  <Int 0x80000000>
	//*   2    3:icmpeq          105
		{
			if(i != 0x7fffffff)
	//*   3    6:iload_0         
	//*   4    7:ldc1            #44  <Int 0x7fffffff>
	//*   5    9:icmpeq          101
				switch(i)
	//*   6   12:iload_0         
				{
	//*   7   13:tableswitch     0 7: default 60
	//	               0 97
	//	               1 93
	//	               2 89
	//	               3 85
	//	               4 81
	//	               5 77
	//	               6 73
	//	               7 69
				default:
					return new Days(i);
	//    8   60:new             #2   <Class Days>
	//    9   63:dup             
	//   10   64:iload_0         
	//   11   65:invokespecial   #27  <Method void Days(int)>
	//   12   68:areturn         

				case 7: // '\007'
					return SEVEN;
	//   13   69:getstatic       #43  <Field Days SEVEN>
	//   14   72:areturn         

				case 6: // '\006'
					return SIX;
	//   15   73:getstatic       #41  <Field Days SIX>
	//   16   76:areturn         

				case 5: // '\005'
					return FIVE;
	//   17   77:getstatic       #39  <Field Days FIVE>
	//   18   80:areturn         

				case 4: // '\004'
					return FOUR;
	//   19   81:getstatic       #37  <Field Days FOUR>
	//   20   84:areturn         

				case 3: // '\003'
					return THREE;
	//   21   85:getstatic       #35  <Field Days THREE>
	//   22   88:areturn         

				case 2: // '\002'
					return TWO;
	//   23   89:getstatic       #33  <Field Days TWO>
	//   24   92:areturn         

				case 1: // '\001'
					return ONE;
	//   25   93:getstatic       #31  <Field Days ONE>
	//   26   96:areturn         

				case 0: // '\0'
					return ZERO;
	//   27   97:getstatic       #29  <Field Days ZERO>
	//   28  100:areturn         
				}
			else
				return MAX_VALUE;
	//   29  101:getstatic       #46  <Field Days MAX_VALUE>
	//   30  104:areturn         
		} else
		{
			return MIN_VALUE;
	//   31  105:getstatic       #49  <Field Days MIN_VALUE>
	//   32  108:areturn         
		}
	}

	public static Days daysBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return days(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.days()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #79  <Method DurationFieldType DurationFieldType.days()>
	//    3    5:invokestatic    #83  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #85  <Method Days days(int)>
	//    5   11:areturn         
	}

	public static Days daysBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #88  <Class LocalDate>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #88  <Class LocalDate>
	//*   5   11:ifeq            47
			return days(DateTimeUtils.getChronology(readablepartial.getChronology()).days().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #94  <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #99  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #104 <Method DurationField Chronology.days()>
	//   10   26:aload_1         
	//   11   27:checkcast       #88  <Class LocalDate>
	//   12   30:invokevirtual   #108 <Method long LocalDate.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #88  <Class LocalDate>
	//   15   37:invokevirtual   #108 <Method long LocalDate.getLocalMillis()>
	//   16   40:invokevirtual   #114 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #85  <Method Days days(int)>
	//   18   46:areturn         
		else
			return days(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #29  <Field Days ZERO>
	//   22   52:invokestatic    #117 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #85  <Method Days days(int)>
	//   24   58:areturn         
	}

	public static Days daysIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #29  <Field Days ZERO>
	//    3    7:areturn         
		else
			return days(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.days()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #125 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #128 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #79  <Method DurationFieldType DurationFieldType.days()>
	//    9   23:invokestatic    #83  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #85  <Method Days days(int)>
	//   11   29:areturn         
	}

	public static Days parseDays(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #29  <Field Days ZERO>
	//    3    7:areturn         
		else
			return days(PARSER.parsePeriod(s).getDays());
	//    4    8:getstatic       #69  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #135 <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #141 <Method int Period.getDays()>
	//    8   18:invokestatic    #85  <Method Days days(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (days(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:invokestatic    #85  <Method Days days(int)>
	//    3    7:areturn         
	}

	public static Days standardDaysIn(ReadablePeriod readableperiod)
	{
		return days(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x5265c00L));
	//    0    0:aload_0         
	//    1    1:ldc2w           #150 <Long 0x5265c00L>
	//    2    4:invokestatic    #155 <Method int BaseSingleFieldPeriod.standardPeriodIn(ReadablePeriod, long)>
	//    3    7:invokestatic    #85  <Method Days days(int)>
	//    4   10:areturn         
	}

	public Days dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return days(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #147 <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #85  <Method Days days(int)>
	//   10   16:areturn         
	}

	public int getDays()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:ireturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.days();
	//    0    0:invokestatic    #79  <Method DurationFieldType DurationFieldType.days()>
	//    1    3:areturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.days();
	//    0    0:invokestatic    #61  <Method PeriodType PeriodType.days()>
	//    1    3:areturn         
	}

	public boolean isGreaterThan(Days days1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(days1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() > 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #147 <Method int getValue()>
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
		if(getValue() > days1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #147 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #147 <Method int getValue()>
	//*  19   29:icmple          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public boolean isLessThan(Days days1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(days1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() < 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #147 <Method int getValue()>
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
		if(getValue() < days1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #147 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #147 <Method int getValue()>
	//*  19   29:icmpge          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public Days minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #168 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #171 <Method Days plus(int)>
	//    4    8:areturn         
	}

	public Days minus(Days days1)
	{
		if(days1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(days1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #147 <Method int getValue()>
	//    7   11:invokevirtual   #174 <Method Days minus(int)>
	//    8   14:areturn         
	}

	public Days multipliedBy(int i)
	{
		return days(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #179 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #85  <Method Days days(int)>
	//    5   11:areturn         
	}

	public Days negated()
	{
		return days(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:invokestatic    #168 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #85  <Method Days days(int)>
	//    4   10:areturn         
	}

	public Days plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return days(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #147 <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #184 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #85  <Method Days days(int)>
	//    9   17:areturn         
	}

	public Days plus(Days days1)
	{
		if(days1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(days1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #147 <Method int getValue()>
	//    7   11:invokevirtual   #171 <Method Days plus(int)>
	//    8   14:areturn         
	}

	public Duration toStandardDuration()
	{
		return new Duration((long)getValue() * 0x5265c00L);
	//    0    0:new             #188 <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #147 <Method int getValue()>
	//    4    8:i2l             
	//    5    9:ldc2w           #150 <Long 0x5265c00L>
	//    6   12:lmul            
	//    7   13:invokespecial   #191 <Method void Duration(long)>
	//    8   16:areturn         
	}

	public Hours toStandardHours()
	{
		return Hours.hours(FieldUtils.safeMultiply(getValue(), 24));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:bipush          24
	//    3    6:invokestatic    #179 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #199 <Method Hours Hours.hours(int)>
	//    5   12:areturn         
	}

	public Minutes toStandardMinutes()
	{
		return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 1440));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:sipush          1440
	//    3    7:invokestatic    #179 <Method int FieldUtils.safeMultiply(int, int)>
	//    4   10:invokestatic    #207 <Method Minutes Minutes.minutes(int)>
	//    5   13:areturn         
	}

	public Seconds toStandardSeconds()
	{
		return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 0x15180));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:ldc1            #210 <Int 0x15180>
	//    3    6:invokestatic    #179 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #216 <Method Seconds Seconds.seconds(int)>
	//    5   12:areturn         
	}

	public Weeks toStandardWeeks()
	{
		return Weeks.weeks(getValue() / 7);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getValue()>
	//    2    4:bipush          7
	//    3    6:idiv            
	//    4    7:invokestatic    #224 <Method Weeks Weeks.weeks(int)>
	//    5   10:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #229 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("P");
	//    4    8:aload_1         
	//    5    9:ldc1            #233 <String "P">
	//    6   11:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #147 <Method int getValue()>
	//   11   20:invokestatic    #243 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("D");
	//   14   27:aload_1         
	//   15   28:ldc1            #245 <String "D">
	//   16   30:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Days FIVE = new Days(5);
	public static final Days FOUR = new Days(4);
	public static final Days MAX_VALUE = new Days(0x7fffffff);
	public static final Days MIN_VALUE = new Days(0x80000000);
	public static final Days ONE = new Days(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.days());
	public static final Days SEVEN = new Days(7);
	public static final Days SIX = new Days(6);
	public static final Days THREE = new Days(3);
	public static final Days TWO = new Days(2);
	public static final Days ZERO = new Days(0);
	private static final long serialVersionUID = 0x48994181L;

	static 
	{
	//    0    0:new             #2   <Class Days>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #27  <Method void Days(int)>
	//    4    8:putstatic       #29  <Field Days ZERO>
	//    5   11:new             #2   <Class Days>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #27  <Method void Days(int)>
	//    9   19:putstatic       #31  <Field Days ONE>
	//   10   22:new             #2   <Class Days>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #27  <Method void Days(int)>
	//   14   30:putstatic       #33  <Field Days TWO>
	//   15   33:new             #2   <Class Days>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #27  <Method void Days(int)>
	//   19   41:putstatic       #35  <Field Days THREE>
	//   20   44:new             #2   <Class Days>
	//   21   47:dup             
	//   22   48:iconst_4        
	//   23   49:invokespecial   #27  <Method void Days(int)>
	//   24   52:putstatic       #37  <Field Days FOUR>
	//   25   55:new             #2   <Class Days>
	//   26   58:dup             
	//   27   59:iconst_5        
	//   28   60:invokespecial   #27  <Method void Days(int)>
	//   29   63:putstatic       #39  <Field Days FIVE>
	//   30   66:new             #2   <Class Days>
	//   31   69:dup             
	//   32   70:bipush          6
	//   33   72:invokespecial   #27  <Method void Days(int)>
	//   34   75:putstatic       #41  <Field Days SIX>
	//   35   78:new             #2   <Class Days>
	//   36   81:dup             
	//   37   82:bipush          7
	//   38   84:invokespecial   #27  <Method void Days(int)>
	//   39   87:putstatic       #43  <Field Days SEVEN>
	//   40   90:new             #2   <Class Days>
	//   41   93:dup             
	//   42   94:ldc1            #44  <Int 0x7fffffff>
	//   43   96:invokespecial   #27  <Method void Days(int)>
	//   44   99:putstatic       #46  <Field Days MAX_VALUE>
	//   45  102:new             #2   <Class Days>
	//   46  105:dup             
	//   47  106:ldc1            #47  <Int 0x80000000>
	//   48  108:invokespecial   #27  <Method void Days(int)>
	//   49  111:putstatic       #49  <Field Days MIN_VALUE>
	//   50  114:invokestatic    #55  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   51  117:invokestatic    #61  <Method PeriodType PeriodType.days()>
	//   52  120:invokevirtual   #67  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   53  123:putstatic       #69  <Field PeriodFormatter PARSER>
	//*  54  126:return          
	}
}
