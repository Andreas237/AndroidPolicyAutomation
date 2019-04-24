// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//			ReadWritablePeriod, PeriodType, Period, ReadableDuration, 
//			ReadableInterval, DurationFieldType, DateTimeUtils, Chronology, 
//			ReadableInstant, ReadablePeriod

public class MutablePeriod extends BasePeriod
	implements ReadWritablePeriod, Cloneable, Serializable
{

	public MutablePeriod()
	{
		super(0L, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #19  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(int i, int j, int k, int l)
	{
		super(0, 0, 0, 0, i, j, k, l, PeriodType.standard());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iload_1         
	//    6    6:iload_2         
	//    7    7:iload_3         
	//    8    8:iload           4
	//    9   10:invokestatic    #27  <Method PeriodType PeriodType.standard()>
	//   10   13:invokespecial   #30  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   16:return          
	}

	public MutablePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		super(i, j, k, l, i1, j1, k1, l1, PeriodType.standard());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:invokestatic    #27  <Method PeriodType PeriodType.standard()>
	//   10   17:invokespecial   #30  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   20:return          
	}

	public MutablePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, PeriodType periodtype)
	{
		super(i, j, k, l, i1, j1, k1, l1, periodtype);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:aload           9
	//   10   16:invokespecial   #30  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   19:return          
	}

	public MutablePeriod(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #34  <Method void BasePeriod(long)>
	//    3    5:return          
	}

	public MutablePeriod(long l, long l1)
	{
		super(l, l1, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #38  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    8:return          
	}

	public MutablePeriod(long l, long l1, Chronology chronology)
	{
		super(l, l1, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aconst_null     
	//    4    4:aload           5
	//    5    6:invokespecial   #38  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    9:return          
	}

	public MutablePeriod(long l, long l1, PeriodType periodtype)
	{
		super(l, l1, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:aconst_null     
	//    5    6:invokespecial   #38  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    9:return          
	}

	public MutablePeriod(long l, long l1, PeriodType periodtype, Chronology chronology)
	{
		super(l, l1, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:aload           6
	//    5    7:invokespecial   #38  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6   10:return          
	}

	public MutablePeriod(long l, Chronology chronology)
	{
		super(l, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:aload_3         
	//    4    4:invokespecial   #19  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(long l, PeriodType periodtype)
	{
		super(l, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #19  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(long l, PeriodType periodtype, Chronology chronology)
	{
		super(l, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #19  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    8:return          
	}

	public MutablePeriod(Object obj)
	{
		super(obj, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #46  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(Object obj, Chronology chronology)
	{
		super(obj, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #46  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(Object obj, PeriodType periodtype)
	{
		super(obj, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #46  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(Object obj, PeriodType periodtype, Chronology chronology)
	{
		super(obj, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #46  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(PeriodType periodtype)
	{
		super(0L, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #19  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableDuration readableduration, ReadableInstant readableinstant)
	{
		super(readableduration, readableinstant, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #53  <Method void BasePeriod(ReadableDuration, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
	{
		super(readableduration, readableinstant, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #53  <Method void BasePeriod(ReadableDuration, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableInstant readableinstant, ReadableDuration readableduration)
	{
		super(readableinstant, readableduration, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #57  <Method void BasePeriod(ReadableInstant, ReadableDuration, PeriodType)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
	{
		super(readableinstant, readableduration, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #57  <Method void BasePeriod(ReadableInstant, ReadableDuration, PeriodType)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		super(readableinstant, readableinstant1, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #61  <Method void BasePeriod(ReadableInstant, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public MutablePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
	{
		super(readableinstant, readableinstant1, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #61  <Method void BasePeriod(ReadableInstant, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public static MutablePeriod parse(String s)
	{
		return parse(s, ISOPeriodFormat.standard());
	//    0    0:aload_0         
	//    1    1:invokestatic    #69  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//    2    4:invokestatic    #72  <Method MutablePeriod parse(String, PeriodFormatter)>
	//    3    7:areturn         
	}

	public static MutablePeriod parse(String s, PeriodFormatter periodformatter)
	{
		return periodformatter.parsePeriod(s).toMutablePeriod();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #79  <Method Period PeriodFormatter.parsePeriod(String)>
	//    3    5:invokevirtual   #85  <Method MutablePeriod Period.toMutablePeriod()>
	//    4    8:areturn         
	}

	public void add(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		setPeriod(FieldUtils.safeAdd(getYears(), i), FieldUtils.safeAdd(getMonths(), j), FieldUtils.safeAdd(getWeeks(), k), FieldUtils.safeAdd(getDays(), l), FieldUtils.safeAdd(getHours(), i1), FieldUtils.safeAdd(getMinutes(), j1), FieldUtils.safeAdd(getSeconds(), k1), FieldUtils.safeAdd(getMillis(), l1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #90  <Method int getYears()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #99  <Method int getMonths()>
	//    7   13:iload_2         
	//    8   14:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #102 <Method int getWeeks()>
	//   11   21:iload_3         
	//   12   22:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #105 <Method int getDays()>
	//   15   29:iload           4
	//   16   31:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   17   34:aload_0         
	//   18   35:invokevirtual   #108 <Method int getHours()>
	//   19   38:iload           5
	//   20   40:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   21   43:aload_0         
	//   22   44:invokevirtual   #111 <Method int getMinutes()>
	//   23   47:iload           6
	//   24   49:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   25   52:aload_0         
	//   26   53:invokevirtual   #114 <Method int getSeconds()>
	//   27   56:iload           7
	//   28   58:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #117 <Method int getMillis()>
	//   31   65:iload           8
	//   32   67:invokestatic    #96  <Method int FieldUtils.safeAdd(int, int)>
	//   33   70:invokevirtual   #120 <Method void setPeriod(int, int, int, int, int, int, int, int)>
	//   34   73:return          
	}

	public void add(long l)
	{
		add(((ReadablePeriod) (new Period(l, getPeriodType()))));
	//    0    0:aload_0         
	//    1    1:new             #81  <Class Period>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    6   10:invokespecial   #125 <Method void Period(long, PeriodType)>
	//    7   13:invokevirtual   #128 <Method void add(ReadablePeriod)>
	//    8   16:return          
	}

	public void add(long l, Chronology chronology)
	{
		add(((ReadablePeriod) (new Period(l, getPeriodType(), chronology))));
	//    0    0:aload_0         
	//    1    1:new             #81  <Class Period>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    6   10:aload_3         
	//    7   11:invokespecial   #129 <Method void Period(long, PeriodType, Chronology)>
	//    8   14:invokevirtual   #128 <Method void add(ReadablePeriod)>
	//    9   17:return          
	}

	public void add(DurationFieldType durationfieldtype, int i)
	{
		super.addField(durationfieldtype, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    6:return          
	}

	public void add(ReadableDuration readableduration)
	{
		if(readableduration != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
			add(((ReadablePeriod) (new Period(readableduration.getMillis(), getPeriodType()))));
	//    2    4:aload_0         
	//    3    5:new             #81  <Class Period>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokeinterface #139 <Method long ReadableDuration.getMillis()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    9   19:invokespecial   #125 <Method void Period(long, PeriodType)>
	//   10   22:invokevirtual   #128 <Method void add(ReadablePeriod)>
	//   11   25:return          
	}

	public void add(ReadableInterval readableinterval)
	{
		if(readableinterval != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			add(((ReadablePeriod) (readableinterval.toPeriod(getPeriodType()))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    6   10:invokeinterface #146 <Method Period ReadableInterval.toPeriod(PeriodType)>
	//    7   15:invokevirtual   #128 <Method void add(ReadablePeriod)>
	//    8   18:return          
	}

	public void add(ReadablePeriod readableperiod)
	{
		super.addPeriod(readableperiod);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method void BasePeriod.addPeriod(ReadablePeriod)>
	//    3    5:return          
	}

	public void addDays(int i)
	{
		super.addField(DurationFieldType.days(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #157 <Method DurationFieldType DurationFieldType.days()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addHours(int i)
	{
		super.addField(DurationFieldType.hours(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #161 <Method DurationFieldType DurationFieldType.hours()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addMillis(int i)
	{
		super.addField(DurationFieldType.millis(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #165 <Method DurationFieldType DurationFieldType.millis()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addMinutes(int i)
	{
		super.addField(DurationFieldType.minutes(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #169 <Method DurationFieldType DurationFieldType.minutes()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addMonths(int i)
	{
		super.addField(DurationFieldType.months(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addSeconds(int i)
	{
		super.addField(DurationFieldType.seconds(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #177 <Method DurationFieldType DurationFieldType.seconds()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addWeeks(int i)
	{
		super.addField(DurationFieldType.weeks(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #181 <Method DurationFieldType DurationFieldType.weeks()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void addYears(int i)
	{
		super.addField(DurationFieldType.years(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DurationFieldType DurationFieldType.years()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #133 <Method void BasePeriod.addField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void clear()
	{
		super.setValues(new int[size()]);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #189 <Method int size()>
	//    3    5:newarray        int[]
	//    4    7:invokespecial   #193 <Method void BasePeriod.setValues(int[])>
	//    5   10:return          
	}

	public Object clone()
	{
		CloneNotSupportedException clonenotsupportedexception;
		Object obj;
		try
		{
			obj = ((Object)this).clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:new             #203 <Class InternalError>
	//*   6   10:dup             
	//*   7   11:ldc1            #205 <String "Clone error">
	//*   8   13:invokespecial   #208 <Method void InternalError(String)>
	//*   9   16:athrow          
		// Misplaced declaration of an exception variable
		catch(CloneNotSupportedException clonenotsupportedexception)
		{
			throw new InternalError("Clone error");
		}
		return obj;
	//*  10   17:astore_1        
	//*  11   18:goto            7
	}

	public MutablePeriod copy()
	{
		return (MutablePeriod)clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method Object clone()>
	//    2    4:checkcast       #2   <Class MutablePeriod>
	//    3    7:areturn         
	}

	public int getDays()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #214 <Field int PeriodType.DAY_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getHours()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #221 <Field int PeriodType.HOUR_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMillis()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #224 <Field int PeriodType.MILLI_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMinutes()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #227 <Field int PeriodType.MINUTE_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMonths()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #230 <Field int PeriodType.MONTH_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getSeconds()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field int PeriodType.SECOND_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getWeeks()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #236 <Field int PeriodType.WEEK_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getYears()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #239 <Field int PeriodType.YEAR_INDEX>
	//    4    8:invokevirtual   #218 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public void mergePeriod(ReadablePeriod readableperiod)
	{
		super.mergePeriod(readableperiod);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #242 <Method void BasePeriod.mergePeriod(ReadablePeriod)>
	//    3    5:return          
	}

	public void set(DurationFieldType durationfieldtype, int i)
	{
		super.setField(durationfieldtype, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    6:return          
	}

	public void setDays(int i)
	{
		super.setField(DurationFieldType.days(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #157 <Method DurationFieldType DurationFieldType.days()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setHours(int i)
	{
		super.setField(DurationFieldType.hours(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #161 <Method DurationFieldType DurationFieldType.hours()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setMillis(int i)
	{
		super.setField(DurationFieldType.millis(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #165 <Method DurationFieldType DurationFieldType.millis()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setMinutes(int i)
	{
		super.setField(DurationFieldType.minutes(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #169 <Method DurationFieldType DurationFieldType.minutes()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setMonths(int i)
	{
		super.setField(DurationFieldType.months(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method DurationFieldType DurationFieldType.months()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setPeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		super.setPeriod(i, j, k, l, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:invokespecial   #252 <Method void BasePeriod.setPeriod(int, int, int, int, int, int, int, int)>
	//   10   17:return          
	}

	public void setPeriod(long l)
	{
		setPeriod(l, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #254 <Method void setPeriod(long, Chronology)>
	//    4    6:return          
	}

	public void setPeriod(long l, long l1)
	{
		setPeriod(l, l1, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #256 <Method void setPeriod(long, long, Chronology)>
	//    5    7:return          
	}

	public void setPeriod(long l, long l1, Chronology chronology)
	{
		setValues(DateTimeUtils.getChronology(chronology).get(((ReadablePeriod) (this)), l, l1));
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:invokestatic    #262 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:lload_3         
	//    6    9:invokevirtual   #268 <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//    7   12:invokevirtual   #269 <Method void setValues(int[])>
	//    8   15:return          
	}

	public void setPeriod(long l, Chronology chronology)
	{
		setValues(DateTimeUtils.getChronology(chronology).get(((ReadablePeriod) (this)), l));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokestatic    #262 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:invokevirtual   #272 <Method int[] Chronology.get(ReadablePeriod, long)>
	//    6   10:invokevirtual   #269 <Method void setValues(int[])>
	//    7   13:return          
	}

	public void setPeriod(ReadableDuration readableduration)
	{
		setPeriod(readableduration, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #275 <Method void setPeriod(ReadableDuration, Chronology)>
	//    4    6:return          
	}

	public void setPeriod(ReadableDuration readableduration, Chronology chronology)
	{
		setPeriod(DateTimeUtils.getDurationMillis(readableduration), chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #279 <Method long DateTimeUtils.getDurationMillis(ReadableDuration)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #254 <Method void setPeriod(long, Chronology)>
	//    5    9:return          
	}

	public void setPeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		if(readableinstant == readableinstant1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       11
		{
			setPeriod(0L);
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:invokevirtual   #281 <Method void setPeriod(long)>
			return;
	//    6   10:return          
		} else
		{
			setPeriod(DateTimeUtils.getInstantMillis(readableinstant), DateTimeUtils.getInstantMillis(readableinstant1), DateTimeUtils.getIntervalChronology(readableinstant, readableinstant1));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #285 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   10   16:aload_2         
	//   11   17:invokestatic    #285 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokestatic    #289 <Method Chronology DateTimeUtils.getIntervalChronology(ReadableInstant, ReadableInstant)>
	//   15   25:invokevirtual   #256 <Method void setPeriod(long, long, Chronology)>
			return;
	//   16   28:return          
		}
	}

	public void setPeriod(ReadableInterval readableinterval)
	{
		if(readableinterval == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			setPeriod(0L);
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:invokevirtual   #281 <Method void setPeriod(long)>
			return;
	//    5    9:return          
		} else
		{
			Chronology chronology = DateTimeUtils.getChronology(readableinterval.getChronology());
	//    6   10:aload_1         
	//    7   11:invokeinterface #292 <Method Chronology ReadableInterval.getChronology()>
	//    8   16:invokestatic    #262 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    9   19:astore_2        
			setPeriod(readableinterval.getStartMillis(), readableinterval.getEndMillis(), chronology);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokeinterface #295 <Method long ReadableInterval.getStartMillis()>
	//   13   27:aload_1         
	//   14   28:invokeinterface #298 <Method long ReadableInterval.getEndMillis()>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #256 <Method void setPeriod(long, long, Chronology)>
			return;
	//   17   37:return          
		}
	}

	public void setPeriod(ReadablePeriod readableperiod)
	{
		super.setPeriod(readableperiod);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #300 <Method void BasePeriod.setPeriod(ReadablePeriod)>
	//    3    5:return          
	}

	public void setSeconds(int i)
	{
		super.setField(DurationFieldType.seconds(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #177 <Method DurationFieldType DurationFieldType.seconds()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setValue(int i, int j)
	{
		super.setValue(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #305 <Method void BasePeriod.setValue(int, int)>
	//    4    6:return          
	}

	public void setWeeks(int i)
	{
		super.setField(DurationFieldType.weeks(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #181 <Method DurationFieldType DurationFieldType.weeks()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	public void setYears(int i)
	{
		super.setField(DurationFieldType.years(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method DurationFieldType DurationFieldType.years()>
	//    2    4:iload_1         
	//    3    5:invokespecial   #246 <Method void BasePeriod.setField(DurationFieldType, int)>
	//    4    8:return          
	}

	private static final long serialVersionUID = 0x8501a285L;
}
