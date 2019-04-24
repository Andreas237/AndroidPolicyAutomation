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
//			ReadableInterval, ReadableInstant

public final class Years extends BaseSingleFieldPeriod
{

	private Years(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #59  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Years parseYears(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Years ZERO>
	//    3    7:areturn         
		else
			return years(PARSER.parsePeriod(s).getYears());
	//    4    8:getstatic       #57  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #66  <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #72  <Method int Period.getYears()>
	//    8   18:invokestatic    #75  <Method Years years(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (years(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:invokestatic    #75  <Method Years years(int)>
	//    3    7:areturn         
	}

	public static Years years(int i)
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
					return new Years(i);
	//    8   44:new             #2   <Class Years>
	//    9   47:dup             
	//   10   48:iload_0         
	//   11   49:invokespecial   #23  <Method void Years(int)>
	//   12   52:areturn         

				case 3: // '\003'
					return THREE;
	//   13   53:getstatic       #31  <Field Years THREE>
	//   14   56:areturn         

				case 2: // '\002'
					return TWO;
	//   15   57:getstatic       #29  <Field Years TWO>
	//   16   60:areturn         

				case 1: // '\001'
					return ONE;
	//   17   61:getstatic       #27  <Field Years ONE>
	//   18   64:areturn         

				case 0: // '\0'
					return ZERO;
	//   19   65:getstatic       #25  <Field Years ZERO>
	//   20   68:areturn         
				}
			else
				return MAX_VALUE;
	//   21   69:getstatic       #34  <Field Years MAX_VALUE>
	//   22   72:areturn         
		} else
		{
			return MIN_VALUE;
	//   23   73:getstatic       #37  <Field Years MIN_VALUE>
	//   24   76:areturn         
		}
	}

	public static Years yearsBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return years(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.years()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #88  <Method DurationFieldType DurationFieldType.years()>
	//    3    5:invokestatic    #92  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #75  <Method Years years(int)>
	//    5   11:areturn         
	}

	public static Years yearsBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #95  <Class LocalDate>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #95  <Class LocalDate>
	//*   5   11:ifeq            47
			return years(DateTimeUtils.getChronology(readablepartial.getChronology()).years().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #101 <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #106 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #111 <Method DurationField Chronology.years()>
	//   10   26:aload_1         
	//   11   27:checkcast       #95  <Class LocalDate>
	//   12   30:invokevirtual   #115 <Method long LocalDate.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #95  <Class LocalDate>
	//   15   37:invokevirtual   #115 <Method long LocalDate.getLocalMillis()>
	//   16   40:invokevirtual   #121 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #75  <Method Years years(int)>
	//   18   46:areturn         
		else
			return years(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #25  <Field Years ZERO>
	//   22   52:invokestatic    #124 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #75  <Method Years years(int)>
	//   24   58:areturn         
	}

	public static Years yearsIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #25  <Field Years ZERO>
	//    3    7:areturn         
		else
			return years(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.years()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #132 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #135 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #88  <Method DurationFieldType DurationFieldType.years()>
	//    9   23:invokestatic    #92  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #75  <Method Years years(int)>
	//   11   29:areturn         
	}

	public Years dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return years(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #75  <Method Years years(int)>
	//   10   16:areturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.years();
	//    0    0:invokestatic    #88  <Method DurationFieldType DurationFieldType.years()>
	//    1    3:areturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.years();
	//    0    0:invokestatic    #49  <Method PeriodType PeriodType.years()>
	//    1    3:areturn         
	}

	public int getYears()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:ireturn         
	}

	public boolean isGreaterThan(Years years1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(years1 == null)
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
		if(getValue() > years1.getValue())
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

	public boolean isLessThan(Years years1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(years1 == null)
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
		if(getValue() < years1.getValue())
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

	public Years minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #148 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #151 <Method Years plus(int)>
	//    4    8:areturn         
	}

	public Years minus(Years years1)
	{
		if(years1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(years1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:invokevirtual   #154 <Method Years minus(int)>
	//    8   14:areturn         
	}

	public Years multipliedBy(int i)
	{
		return years(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #159 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #75  <Method Years years(int)>
	//    5   11:areturn         
	}

	public Years negated()
	{
		return years(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method int getValue()>
	//    2    4:invokestatic    #148 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #75  <Method Years years(int)>
	//    4   10:areturn         
	}

	public Years plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return years(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #81  <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #164 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #75  <Method Years years(int)>
	//    9   17:areturn         
	}

	public Years plus(Years years1)
	{
		if(years1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(years1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #81  <Method int getValue()>
	//    7   11:invokevirtual   #151 <Method Years plus(int)>
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #169 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("P");
	//    4    8:aload_1         
	//    5    9:ldc1            #173 <String "P">
	//    6   11:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #81  <Method int getValue()>
	//   11   20:invokestatic    #183 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("Y");
	//   14   27:aload_1         
	//   15   28:ldc1            #185 <String "Y">
	//   16   30:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Years MAX_VALUE = new Years(0x7fffffff);
	public static final Years MIN_VALUE = new Years(0x80000000);
	public static final Years ONE = new Years(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.years());
	public static final Years THREE = new Years(3);
	public static final Years TWO = new Years(2);
	public static final Years ZERO = new Years(0);
	private static final long serialVersionUID = 0x48994184L;

	static 
	{
	//    0    0:new             #2   <Class Years>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #23  <Method void Years(int)>
	//    4    8:putstatic       #25  <Field Years ZERO>
	//    5   11:new             #2   <Class Years>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #23  <Method void Years(int)>
	//    9   19:putstatic       #27  <Field Years ONE>
	//   10   22:new             #2   <Class Years>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #23  <Method void Years(int)>
	//   14   30:putstatic       #29  <Field Years TWO>
	//   15   33:new             #2   <Class Years>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #23  <Method void Years(int)>
	//   19   41:putstatic       #31  <Field Years THREE>
	//   20   44:new             #2   <Class Years>
	//   21   47:dup             
	//   22   48:ldc1            #32  <Int 0x7fffffff>
	//   23   50:invokespecial   #23  <Method void Years(int)>
	//   24   53:putstatic       #34  <Field Years MAX_VALUE>
	//   25   56:new             #2   <Class Years>
	//   26   59:dup             
	//   27   60:ldc1            #35  <Int 0x80000000>
	//   28   62:invokespecial   #23  <Method void Years(int)>
	//   29   65:putstatic       #37  <Field Years MIN_VALUE>
	//   30   68:invokestatic    #43  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   31   71:invokestatic    #49  <Method PeriodType PeriodType.years()>
	//   32   74:invokevirtual   #55  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   33   77:putstatic       #57  <Field PeriodFormatter PARSER>
	//*  34   80:return          
	}
}
