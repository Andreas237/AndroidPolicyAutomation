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
//			Period, Days, Duration, Minutes, 
//			Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Hours extends BaseSingleFieldPeriod
{

	private Hours(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #74  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Hours hours(int i)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #50  <Int 0x80000000>
	//*   2    3:icmpeq          113
		{
			if(i != 0x7fffffff)
	//*   3    6:iload_0         
	//*   4    7:ldc1            #47  <Int 0x7fffffff>
	//*   5    9:icmpeq          109
				switch(i)
	//*   6   12:iload_0         
				{
	//*   7   13:tableswitch     0 8: default 64
	//	               0 105
	//	               1 101
	//	               2 97
	//	               3 93
	//	               4 89
	//	               5 85
	//	               6 81
	//	               7 77
	//	               8 73
				default:
					return new Hours(i);
	//    8   64:new             #2   <Class Hours>
	//    9   67:dup             
	//   10   68:iload_0         
	//   11   69:invokespecial   #28  <Method void Hours(int)>
	//   12   72:areturn         

				case 8: // '\b'
					return EIGHT;
	//   13   73:getstatic       #46  <Field Hours EIGHT>
	//   14   76:areturn         

				case 7: // '\007'
					return SEVEN;
	//   15   77:getstatic       #44  <Field Hours SEVEN>
	//   16   80:areturn         

				case 6: // '\006'
					return SIX;
	//   17   81:getstatic       #42  <Field Hours SIX>
	//   18   84:areturn         

				case 5: // '\005'
					return FIVE;
	//   19   85:getstatic       #40  <Field Hours FIVE>
	//   20   88:areturn         

				case 4: // '\004'
					return FOUR;
	//   21   89:getstatic       #38  <Field Hours FOUR>
	//   22   92:areturn         

				case 3: // '\003'
					return THREE;
	//   23   93:getstatic       #36  <Field Hours THREE>
	//   24   96:areturn         

				case 2: // '\002'
					return TWO;
	//   25   97:getstatic       #34  <Field Hours TWO>
	//   26  100:areturn         

				case 1: // '\001'
					return ONE;
	//   27  101:getstatic       #32  <Field Hours ONE>
	//   28  104:areturn         

				case 0: // '\0'
					return ZERO;
	//   29  105:getstatic       #30  <Field Hours ZERO>
	//   30  108:areturn         
				}
			else
				return MAX_VALUE;
	//   31  109:getstatic       #49  <Field Hours MAX_VALUE>
	//   32  112:areturn         
		} else
		{
			return MIN_VALUE;
	//   33  113:getstatic       #52  <Field Hours MIN_VALUE>
	//   34  116:areturn         
		}
	}

	public static Hours hoursBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return hours(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.hours()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #82  <Method DurationFieldType DurationFieldType.hours()>
	//    3    5:invokestatic    #86  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #88  <Method Hours hours(int)>
	//    5   11:areturn         
	}

	public static Hours hoursBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalTime) && (readablepartial1 instanceof LocalTime))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #91  <Class LocalTime>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #91  <Class LocalTime>
	//*   5   11:ifeq            47
			return hours(DateTimeUtils.getChronology(readablepartial.getChronology()).hours().getDifference(((LocalTime)readablepartial1).getLocalMillis(), ((LocalTime)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #97  <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #102 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #107 <Method DurationField Chronology.hours()>
	//   10   26:aload_1         
	//   11   27:checkcast       #91  <Class LocalTime>
	//   12   30:invokevirtual   #111 <Method long LocalTime.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #91  <Class LocalTime>
	//   15   37:invokevirtual   #111 <Method long LocalTime.getLocalMillis()>
	//   16   40:invokevirtual   #117 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #88  <Method Hours hours(int)>
	//   18   46:areturn         
		else
			return hours(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #30  <Field Hours ZERO>
	//   22   52:invokestatic    #120 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #88  <Method Hours hours(int)>
	//   24   58:areturn         
	}

	public static Hours hoursIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #30  <Field Hours ZERO>
	//    3    7:areturn         
		else
			return hours(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.hours()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #128 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #131 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #82  <Method DurationFieldType DurationFieldType.hours()>
	//    9   23:invokestatic    #86  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #88  <Method Hours hours(int)>
	//   11   29:areturn         
	}

	public static Hours parseHours(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #30  <Field Hours ZERO>
	//    3    7:areturn         
		else
			return hours(PARSER.parsePeriod(s).getHours());
	//    4    8:getstatic       #72  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #138 <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #144 <Method int Period.getHours()>
	//    8   18:invokestatic    #88  <Method Hours hours(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (hours(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:invokestatic    #88  <Method Hours hours(int)>
	//    3    7:areturn         
	}

	public static Hours standardHoursIn(ReadablePeriod readableperiod)
	{
		return hours(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x36ee80L));
	//    0    0:aload_0         
	//    1    1:ldc2w           #153 <Long 0x36ee80L>
	//    2    4:invokestatic    #158 <Method int BaseSingleFieldPeriod.standardPeriodIn(ReadablePeriod, long)>
	//    3    7:invokestatic    #88  <Method Hours hours(int)>
	//    4   10:areturn         
	}

	public Hours dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return hours(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #150 <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #88  <Method Hours hours(int)>
	//   10   16:areturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.hours();
	//    0    0:invokestatic    #82  <Method DurationFieldType DurationFieldType.hours()>
	//    1    3:areturn         
	}

	public int getHours()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:ireturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.hours();
	//    0    0:invokestatic    #64  <Method PeriodType PeriodType.hours()>
	//    1    3:areturn         
	}

	public boolean isGreaterThan(Hours hours1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(hours1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() > 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #150 <Method int getValue()>
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
		if(getValue() > hours1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #150 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #150 <Method int getValue()>
	//*  19   29:icmple          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public boolean isLessThan(Hours hours1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(hours1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() < 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #150 <Method int getValue()>
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
		if(getValue() < hours1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #150 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #150 <Method int getValue()>
	//*  19   29:icmpge          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public Hours minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #171 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #174 <Method Hours plus(int)>
	//    4    8:areturn         
	}

	public Hours minus(Hours hours1)
	{
		if(hours1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(hours1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #150 <Method int getValue()>
	//    7   11:invokevirtual   #177 <Method Hours minus(int)>
	//    8   14:areturn         
	}

	public Hours multipliedBy(int i)
	{
		return hours(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #182 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #88  <Method Hours hours(int)>
	//    5   11:areturn         
	}

	public Hours negated()
	{
		return hours(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:invokestatic    #171 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #88  <Method Hours hours(int)>
	//    4   10:areturn         
	}

	public Hours plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return hours(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #150 <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #187 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #88  <Method Hours hours(int)>
	//    9   17:areturn         
	}

	public Hours plus(Hours hours1)
	{
		if(hours1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(hours1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #150 <Method int getValue()>
	//    7   11:invokevirtual   #174 <Method Hours plus(int)>
	//    8   14:areturn         
	}

	public Days toStandardDays()
	{
		return Days.days(getValue() / 24);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:bipush          24
	//    3    6:idiv            
	//    4    7:invokestatic    #195 <Method Days Days.days(int)>
	//    5   10:areturn         
	}

	public Duration toStandardDuration()
	{
		return new Duration((long)getValue() * 0x36ee80L);
	//    0    0:new             #199 <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #150 <Method int getValue()>
	//    4    8:i2l             
	//    5    9:ldc2w           #153 <Long 0x36ee80L>
	//    6   12:lmul            
	//    7   13:invokespecial   #202 <Method void Duration(long)>
	//    8   16:areturn         
	}

	public Minutes toStandardMinutes()
	{
		return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:bipush          60
	//    3    6:invokestatic    #182 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    9:invokestatic    #210 <Method Minutes Minutes.minutes(int)>
	//    5   12:areturn         
	}

	public Seconds toStandardSeconds()
	{
		return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 3600));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:sipush          3600
	//    3    7:invokestatic    #182 <Method int FieldUtils.safeMultiply(int, int)>
	//    4   10:invokestatic    #218 <Method Seconds Seconds.seconds(int)>
	//    5   13:areturn         
	}

	public Weeks toStandardWeeks()
	{
		return Weeks.weeks(getValue() / 168);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int getValue()>
	//    2    4:sipush          168
	//    3    7:idiv            
	//    4    8:invokestatic    #226 <Method Weeks Weeks.weeks(int)>
	//    5   11:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #231 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PT");
	//    4    8:aload_1         
	//    5    9:ldc1            #235 <String "PT">
	//    6   11:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #150 <Method int getValue()>
	//   11   20:invokestatic    #245 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("H");
	//   14   27:aload_1         
	//   15   28:ldc1            #247 <String "H">
	//   16   30:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Hours EIGHT = new Hours(8);
	public static final Hours FIVE = new Hours(5);
	public static final Hours FOUR = new Hours(4);
	public static final Hours MAX_VALUE = new Hours(0x7fffffff);
	public static final Hours MIN_VALUE = new Hours(0x80000000);
	public static final Hours ONE = new Hours(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());
	public static final Hours SEVEN = new Hours(7);
	public static final Hours SIX = new Hours(6);
	public static final Hours THREE = new Hours(3);
	public static final Hours TWO = new Hours(2);
	public static final Hours ZERO = new Hours(0);
	private static final long serialVersionUID = 0x48994180L;

	static 
	{
	//    0    0:new             #2   <Class Hours>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #28  <Method void Hours(int)>
	//    4    8:putstatic       #30  <Field Hours ZERO>
	//    5   11:new             #2   <Class Hours>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #28  <Method void Hours(int)>
	//    9   19:putstatic       #32  <Field Hours ONE>
	//   10   22:new             #2   <Class Hours>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #28  <Method void Hours(int)>
	//   14   30:putstatic       #34  <Field Hours TWO>
	//   15   33:new             #2   <Class Hours>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #28  <Method void Hours(int)>
	//   19   41:putstatic       #36  <Field Hours THREE>
	//   20   44:new             #2   <Class Hours>
	//   21   47:dup             
	//   22   48:iconst_4        
	//   23   49:invokespecial   #28  <Method void Hours(int)>
	//   24   52:putstatic       #38  <Field Hours FOUR>
	//   25   55:new             #2   <Class Hours>
	//   26   58:dup             
	//   27   59:iconst_5        
	//   28   60:invokespecial   #28  <Method void Hours(int)>
	//   29   63:putstatic       #40  <Field Hours FIVE>
	//   30   66:new             #2   <Class Hours>
	//   31   69:dup             
	//   32   70:bipush          6
	//   33   72:invokespecial   #28  <Method void Hours(int)>
	//   34   75:putstatic       #42  <Field Hours SIX>
	//   35   78:new             #2   <Class Hours>
	//   36   81:dup             
	//   37   82:bipush          7
	//   38   84:invokespecial   #28  <Method void Hours(int)>
	//   39   87:putstatic       #44  <Field Hours SEVEN>
	//   40   90:new             #2   <Class Hours>
	//   41   93:dup             
	//   42   94:bipush          8
	//   43   96:invokespecial   #28  <Method void Hours(int)>
	//   44   99:putstatic       #46  <Field Hours EIGHT>
	//   45  102:new             #2   <Class Hours>
	//   46  105:dup             
	//   47  106:ldc1            #47  <Int 0x7fffffff>
	//   48  108:invokespecial   #28  <Method void Hours(int)>
	//   49  111:putstatic       #49  <Field Hours MAX_VALUE>
	//   50  114:new             #2   <Class Hours>
	//   51  117:dup             
	//   52  118:ldc1            #50  <Int 0x80000000>
	//   53  120:invokespecial   #28  <Method void Hours(int)>
	//   54  123:putstatic       #52  <Field Hours MIN_VALUE>
	//   55  126:invokestatic    #58  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   56  129:invokestatic    #64  <Method PeriodType PeriodType.hours()>
	//   57  132:invokevirtual   #70  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   58  135:putstatic       #72  <Field PeriodFormatter PARSER>
	//*  59  138:return          
	}
}
