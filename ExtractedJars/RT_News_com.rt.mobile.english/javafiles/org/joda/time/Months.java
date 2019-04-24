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
//			Period, ReadableInstant

public final class Months extends BaseSingleFieldPeriod
{

	private Months(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #86  <Method void BaseSingleFieldPeriod(int)>
	//    3    5:return          
	}

	public static Months months(int i)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #62  <Int 0x80000000>
	//*   2    3:icmpeq          145
		{
			if(i != 0x7fffffff)
	//*   3    6:iload_0         
	//*   4    7:ldc1            #59  <Int 0x7fffffff>
	//*   5    9:icmpeq          141
				switch(i)
	//*   6   12:iload_0         
				{
	//*   7   13:tableswitch     0 12: default 80
	//	               0 137
	//	               1 133
	//	               2 129
	//	               3 125
	//	               4 121
	//	               5 117
	//	               6 113
	//	               7 109
	//	               8 105
	//	               9 101
	//	               10 97
	//	               11 93
	//	               12 89
				default:
					return new Months(i);
	//    8   80:new             #2   <Class Months>
	//    9   83:dup             
	//   10   84:iload_0         
	//   11   85:invokespecial   #32  <Method void Months(int)>
	//   12   88:areturn         

				case 12: // '\f'
					return TWELVE;
	//   13   89:getstatic       #58  <Field Months TWELVE>
	//   14   92:areturn         

				case 11: // '\013'
					return ELEVEN;
	//   15   93:getstatic       #56  <Field Months ELEVEN>
	//   16   96:areturn         

				case 10: // '\n'
					return TEN;
	//   17   97:getstatic       #54  <Field Months TEN>
	//   18  100:areturn         

				case 9: // '\t'
					return NINE;
	//   19  101:getstatic       #52  <Field Months NINE>
	//   20  104:areturn         

				case 8: // '\b'
					return EIGHT;
	//   21  105:getstatic       #50  <Field Months EIGHT>
	//   22  108:areturn         

				case 7: // '\007'
					return SEVEN;
	//   23  109:getstatic       #48  <Field Months SEVEN>
	//   24  112:areturn         

				case 6: // '\006'
					return SIX;
	//   25  113:getstatic       #46  <Field Months SIX>
	//   26  116:areturn         

				case 5: // '\005'
					return FIVE;
	//   27  117:getstatic       #44  <Field Months FIVE>
	//   28  120:areturn         

				case 4: // '\004'
					return FOUR;
	//   29  121:getstatic       #42  <Field Months FOUR>
	//   30  124:areturn         

				case 3: // '\003'
					return THREE;
	//   31  125:getstatic       #40  <Field Months THREE>
	//   32  128:areturn         

				case 2: // '\002'
					return TWO;
	//   33  129:getstatic       #38  <Field Months TWO>
	//   34  132:areturn         

				case 1: // '\001'
					return ONE;
	//   35  133:getstatic       #36  <Field Months ONE>
	//   36  136:areturn         

				case 0: // '\0'
					return ZERO;
	//   37  137:getstatic       #34  <Field Months ZERO>
	//   38  140:areturn         
				}
			else
				return MAX_VALUE;
	//   39  141:getstatic       #61  <Field Months MAX_VALUE>
	//   40  144:areturn         
		} else
		{
			return MIN_VALUE;
	//   41  145:getstatic       #64  <Field Months MIN_VALUE>
	//   42  148:areturn         
		}
	}

	public static Months monthsBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		return months(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.months()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method DurationFieldType DurationFieldType.months()>
	//    3    5:invokestatic    #98  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//    4    8:invokestatic    #100 <Method Months months(int)>
	//    5   11:areturn         
	}

	public static Months monthsBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #103 <Class LocalDate>
	//*   2    4:ifeq            47
	//*   3    7:aload_1         
	//*   4    8:instanceof      #103 <Class LocalDate>
	//*   5   11:ifeq            47
			return months(DateTimeUtils.getChronology(readablepartial.getChronology()).months().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #109 <Method Chronology ReadablePartial.getChronology()>
	//    8   20:invokestatic    #114 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   23:invokevirtual   #119 <Method DurationField Chronology.months()>
	//   10   26:aload_1         
	//   11   27:checkcast       #103 <Class LocalDate>
	//   12   30:invokevirtual   #123 <Method long LocalDate.getLocalMillis()>
	//   13   33:aload_0         
	//   14   34:checkcast       #103 <Class LocalDate>
	//   15   37:invokevirtual   #123 <Method long LocalDate.getLocalMillis()>
	//   16   40:invokevirtual   #129 <Method int DurationField.getDifference(long, long)>
	//   17   43:invokestatic    #100 <Method Months months(int)>
	//   18   46:areturn         
		else
			return months(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ((ReadablePeriod) (ZERO))));
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:getstatic       #34  <Field Months ZERO>
	//   22   52:invokestatic    #132 <Method int BaseSingleFieldPeriod.between(ReadablePartial, ReadablePartial, ReadablePeriod)>
	//   23   55:invokestatic    #100 <Method Months months(int)>
	//   24   58:areturn         
	}

	public static Months monthsIn(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #34  <Field Months ZERO>
	//    3    7:areturn         
		else
			return months(BaseSingleFieldPeriod.between(((ReadableInstant) (readableinterval.getStart())), ((ReadableInstant) (readableinterval.getEnd())), DurationFieldType.months()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #140 <Method DateTime ReadableInterval.getStart()>
	//    6   14:aload_0         
	//    7   15:invokeinterface #143 <Method DateTime ReadableInterval.getEnd()>
	//    8   20:invokestatic    #94  <Method DurationFieldType DurationFieldType.months()>
	//    9   23:invokestatic    #98  <Method int BaseSingleFieldPeriod.between(ReadableInstant, ReadableInstant, DurationFieldType)>
	//   10   26:invokestatic    #100 <Method Months months(int)>
	//   11   29:areturn         
	}

	public static Months parseMonths(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ZERO;
	//    2    4:getstatic       #34  <Field Months ZERO>
	//    3    7:areturn         
		else
			return months(PARSER.parsePeriod(s).getMonths());
	//    4    8:getstatic       #84  <Field PeriodFormatter PARSER>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #150 <Method Period PeriodFormatter.parsePeriod(String)>
	//    7   15:invokevirtual   #156 <Method int Period.getMonths()>
	//    8   18:invokestatic    #100 <Method Months months(int)>
	//    9   21:areturn         
	}

	private Object readResolve()
	{
		return ((Object) (months(getValue())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int getValue()>
	//    2    4:invokestatic    #100 <Method Months months(int)>
	//    3    7:areturn         
	}

	public Months dividedBy(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		else
			return months(getValue() / i);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #162 <Method int getValue()>
	//    7   11:iload_1         
	//    8   12:idiv            
	//    9   13:invokestatic    #100 <Method Months months(int)>
	//   10   16:areturn         
	}

	public DurationFieldType getFieldType()
	{
		return DurationFieldType.months();
	//    0    0:invokestatic    #94  <Method DurationFieldType DurationFieldType.months()>
	//    1    3:areturn         
	}

	public int getMonths()
	{
		return getValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int getValue()>
	//    2    4:ireturn         
	}

	public PeriodType getPeriodType()
	{
		return PeriodType.months();
	//    0    0:invokestatic    #76  <Method PeriodType PeriodType.months()>
	//    1    3:areturn         
	}

	public boolean isGreaterThan(Months months1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(months1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() > 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #162 <Method int getValue()>
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
		if(getValue() > months1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #162 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #162 <Method int getValue()>
	//*  19   29:icmple          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public boolean isLessThan(Months months1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(months1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       19
		{
			if(getValue() < 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #162 <Method int getValue()>
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
		if(getValue() < months1.getValue())
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #162 <Method int getValue()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #162 <Method int getValue()>
	//*  19   29:icmpge          34
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore_2        
		return flag;
	//   22   34:iload_2         
	//   23   35:ireturn         
	}

	public Months minus(int i)
	{
		return plus(FieldUtils.safeNegate(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #175 <Method int FieldUtils.safeNegate(int)>
	//    3    5:invokevirtual   #178 <Method Months plus(int)>
	//    4    8:areturn         
	}

	public Months minus(Months months1)
	{
		if(months1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return minus(months1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #162 <Method int getValue()>
	//    7   11:invokevirtual   #181 <Method Months minus(int)>
	//    8   14:areturn         
	}

	public Months multipliedBy(int i)
	{
		return months(FieldUtils.safeMultiply(getValue(), i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int getValue()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #186 <Method int FieldUtils.safeMultiply(int, int)>
	//    4    8:invokestatic    #100 <Method Months months(int)>
	//    5   11:areturn         
	}

	public Months negated()
	{
		return months(FieldUtils.safeNegate(getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int getValue()>
	//    2    4:invokestatic    #175 <Method int FieldUtils.safeNegate(int)>
	//    3    7:invokestatic    #100 <Method Months months(int)>
	//    4   10:areturn         
	}

	public Months plus(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return months(FieldUtils.safeAdd(getValue(), i));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #162 <Method int getValue()>
	//    6   10:iload_1         
	//    7   11:invokestatic    #191 <Method int FieldUtils.safeAdd(int, int)>
	//    8   14:invokestatic    #100 <Method Months months(int)>
	//    9   17:areturn         
	}

	public Months plus(Months months1)
	{
		if(months1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return plus(months1.getValue());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #162 <Method int getValue()>
	//    7   11:invokevirtual   #178 <Method Months plus(int)>
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("P");
	//    4    8:aload_1         
	//    5    9:ldc1            #200 <String "P">
	//    6   11:invokevirtual   #204 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(getValue()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #162 <Method int getValue()>
	//   11   20:invokestatic    #210 <Method String String.valueOf(int)>
	//   12   23:invokevirtual   #204 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("M");
	//   14   27:aload_1         
	//   15   28:ldc1            #212 <String "M">
	//   16   30:invokevirtual   #204 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public static final Months EIGHT = new Months(8);
	public static final Months ELEVEN = new Months(11);
	public static final Months FIVE = new Months(5);
	public static final Months FOUR = new Months(4);
	public static final Months MAX_VALUE = new Months(0x7fffffff);
	public static final Months MIN_VALUE = new Months(0x80000000);
	public static final Months NINE = new Months(9);
	public static final Months ONE = new Months(1);
	private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.months());
	public static final Months SEVEN = new Months(7);
	public static final Months SIX = new Months(6);
	public static final Months TEN = new Months(10);
	public static final Months THREE = new Months(3);
	public static final Months TWELVE = new Months(12);
	public static final Months TWO = new Months(2);
	public static final Months ZERO = new Months(0);
	private static final long serialVersionUID = 0x48994183L;

	static 
	{
	//    0    0:new             #2   <Class Months>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #32  <Method void Months(int)>
	//    4    8:putstatic       #34  <Field Months ZERO>
	//    5   11:new             #2   <Class Months>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #32  <Method void Months(int)>
	//    9   19:putstatic       #36  <Field Months ONE>
	//   10   22:new             #2   <Class Months>
	//   11   25:dup             
	//   12   26:iconst_2        
	//   13   27:invokespecial   #32  <Method void Months(int)>
	//   14   30:putstatic       #38  <Field Months TWO>
	//   15   33:new             #2   <Class Months>
	//   16   36:dup             
	//   17   37:iconst_3        
	//   18   38:invokespecial   #32  <Method void Months(int)>
	//   19   41:putstatic       #40  <Field Months THREE>
	//   20   44:new             #2   <Class Months>
	//   21   47:dup             
	//   22   48:iconst_4        
	//   23   49:invokespecial   #32  <Method void Months(int)>
	//   24   52:putstatic       #42  <Field Months FOUR>
	//   25   55:new             #2   <Class Months>
	//   26   58:dup             
	//   27   59:iconst_5        
	//   28   60:invokespecial   #32  <Method void Months(int)>
	//   29   63:putstatic       #44  <Field Months FIVE>
	//   30   66:new             #2   <Class Months>
	//   31   69:dup             
	//   32   70:bipush          6
	//   33   72:invokespecial   #32  <Method void Months(int)>
	//   34   75:putstatic       #46  <Field Months SIX>
	//   35   78:new             #2   <Class Months>
	//   36   81:dup             
	//   37   82:bipush          7
	//   38   84:invokespecial   #32  <Method void Months(int)>
	//   39   87:putstatic       #48  <Field Months SEVEN>
	//   40   90:new             #2   <Class Months>
	//   41   93:dup             
	//   42   94:bipush          8
	//   43   96:invokespecial   #32  <Method void Months(int)>
	//   44   99:putstatic       #50  <Field Months EIGHT>
	//   45  102:new             #2   <Class Months>
	//   46  105:dup             
	//   47  106:bipush          9
	//   48  108:invokespecial   #32  <Method void Months(int)>
	//   49  111:putstatic       #52  <Field Months NINE>
	//   50  114:new             #2   <Class Months>
	//   51  117:dup             
	//   52  118:bipush          10
	//   53  120:invokespecial   #32  <Method void Months(int)>
	//   54  123:putstatic       #54  <Field Months TEN>
	//   55  126:new             #2   <Class Months>
	//   56  129:dup             
	//   57  130:bipush          11
	//   58  132:invokespecial   #32  <Method void Months(int)>
	//   59  135:putstatic       #56  <Field Months ELEVEN>
	//   60  138:new             #2   <Class Months>
	//   61  141:dup             
	//   62  142:bipush          12
	//   63  144:invokespecial   #32  <Method void Months(int)>
	//   64  147:putstatic       #58  <Field Months TWELVE>
	//   65  150:new             #2   <Class Months>
	//   66  153:dup             
	//   67  154:ldc1            #59  <Int 0x7fffffff>
	//   68  156:invokespecial   #32  <Method void Months(int)>
	//   69  159:putstatic       #61  <Field Months MAX_VALUE>
	//   70  162:new             #2   <Class Months>
	//   71  165:dup             
	//   72  166:ldc1            #62  <Int 0x80000000>
	//   73  168:invokespecial   #32  <Method void Months(int)>
	//   74  171:putstatic       #64  <Field Months MIN_VALUE>
	//   75  174:invokestatic    #70  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//   76  177:invokestatic    #76  <Method PeriodType PeriodType.months()>
	//   77  180:invokevirtual   #82  <Method PeriodFormatter PeriodFormatter.withParseType(PeriodType)>
	//   78  183:putstatic       #84  <Field PeriodFormatter PARSER>
	//*  79  186:return          
	}
}
