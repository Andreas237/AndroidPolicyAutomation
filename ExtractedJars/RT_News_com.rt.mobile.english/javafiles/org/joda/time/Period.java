// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//			ReadablePeriod, PeriodType, ReadablePartial, DurationFieldType, 
//			DateTimeFieldType, DateTimeUtils, Days, Duration, 
//			Hours, Minutes, Seconds, Weeks, 
//			Chronology, ReadableDuration, ReadableInstant

public final class Period extends BasePeriod
	implements ReadablePeriod, Serializable
{

	public Period()
	{
		super(0L, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #25  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(int i, int j, int k, int l)
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
	//    9   10:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//   10   13:invokespecial   #35  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   16:return          
	}

	public Period(int i, int j, int k, int l, int i1, int j1, int k1, 
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
	//    9   14:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//   10   17:invokespecial   #35  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   20:return          
	}

	public Period(int i, int j, int k, int l, int i1, int j1, int k1, 
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
	//   10   16:invokespecial   #35  <Method void BasePeriod(int, int, int, int, int, int, int, int, PeriodType)>
	//   11   19:return          
	}

	public Period(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #39  <Method void BasePeriod(long)>
	//    3    5:return          
	}

	public Period(long l, long l1)
	{
		super(l, l1, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #43  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    8:return          
	}

	public Period(long l, long l1, Chronology chronology)
	{
		super(l, l1, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aconst_null     
	//    4    4:aload           5
	//    5    6:invokespecial   #43  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    9:return          
	}

	public Period(long l, long l1, PeriodType periodtype)
	{
		super(l, l1, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:aconst_null     
	//    5    6:invokespecial   #43  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6    9:return          
	}

	public Period(long l, long l1, PeriodType periodtype, Chronology chronology)
	{
		super(l, l1, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:aload           6
	//    5    7:invokespecial   #43  <Method void BasePeriod(long, long, PeriodType, Chronology)>
	//    6   10:return          
	}

	public Period(long l, Chronology chronology)
	{
		super(l, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:aload_3         
	//    4    4:invokespecial   #25  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(long l, PeriodType periodtype)
	{
		super(l, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #25  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(long l, PeriodType periodtype, Chronology chronology)
	{
		super(l, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #25  <Method void BasePeriod(long, PeriodType, Chronology)>
	//    5    8:return          
	}

	public Period(Object obj)
	{
		super(obj, ((PeriodType) (null)), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #51  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(Object obj, Chronology chronology)
	{
		super(obj, ((PeriodType) (null)), chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #51  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(Object obj, PeriodType periodtype)
	{
		super(obj, periodtype, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #51  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(Object obj, PeriodType periodtype, Chronology chronology)
	{
		super(obj, periodtype, chronology);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #51  <Method void BasePeriod(Object, PeriodType, Chronology)>
	//    5    7:return          
	}

	public Period(ReadableDuration readableduration, ReadableInstant readableinstant)
	{
		super(readableduration, readableinstant, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #57  <Method void BasePeriod(ReadableDuration, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
	{
		super(readableduration, readableinstant, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #57  <Method void BasePeriod(ReadableDuration, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadableInstant readableinstant, ReadableDuration readableduration)
	{
		super(readableinstant, readableduration, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #61  <Method void BasePeriod(ReadableInstant, ReadableDuration, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
	{
		super(readableinstant, readableduration, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #61  <Method void BasePeriod(ReadableInstant, ReadableDuration, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadableInstant readableinstant, ReadableInstant readableinstant1)
	{
		super(readableinstant, readableinstant1, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #65  <Method void BasePeriod(ReadableInstant, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
	{
		super(readableinstant, readableinstant1, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #65  <Method void BasePeriod(ReadableInstant, ReadableInstant, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		super(readablepartial, readablepartial1, ((PeriodType) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #69  <Method void BasePeriod(ReadablePartial, ReadablePartial, PeriodType)>
	//    5    7:return          
	}

	public Period(ReadablePartial readablepartial, ReadablePartial readablepartial1, PeriodType periodtype)
	{
		super(readablepartial, readablepartial1, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #69  <Method void BasePeriod(ReadablePartial, ReadablePartial, PeriodType)>
	//    5    7:return          
	}

	private Period(int ai[], PeriodType periodtype)
	{
		super(ai, periodtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #72  <Method void BasePeriod(int[], PeriodType)>
	//    4    6:return          
	}

	private void checkYearsAndMonths(String s)
	{
		if(getMonths() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method int getMonths()>
	//*   2    4:ifeq            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #80  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #81  <Method void StringBuilder()>
	//    6   14:astore_2        
			stringbuilder.append("Cannot convert to ");
	//    7   15:aload_2         
	//    8   16:ldc1            #83  <String "Cannot convert to ">
	//    9   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(s);
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(" as this period contains months and months vary in length");
	//   15   28:aload_2         
	//   16   29:ldc1            #89  <String " as this period contains months and months vary in length">
	//   17   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new UnsupportedOperationException(stringbuilder.toString());
	//   19   35:new             #91  <Class UnsupportedOperationException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #97  <Method void UnsupportedOperationException(String)>
	//   24   46:athrow          
		}
		if(getYears() != 0)
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #100 <Method int getYears()>
	//*  27   51:ifeq            94
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   28   54:new             #80  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #81  <Method void StringBuilder()>
	//   31   61:astore_2        
			stringbuilder1.append("Cannot convert to ");
	//   32   62:aload_2         
	//   33   63:ldc1            #83  <String "Cannot convert to ">
	//   34   65:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			stringbuilder1.append(s);
	//   36   69:aload_2         
	//   37   70:aload_1         
	//   38   71:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			stringbuilder1.append(" as this period contains years and years vary in length");
	//   40   75:aload_2         
	//   41   76:ldc1            #102 <String " as this period contains years and years vary in length">
	//   42   78:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
			throw new UnsupportedOperationException(stringbuilder1.toString());
	//   44   82:new             #91  <Class UnsupportedOperationException>
	//   45   85:dup             
	//   46   86:aload_2         
	//   47   87:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   48   90:invokespecial   #97  <Method void UnsupportedOperationException(String)>
	//   49   93:athrow          
		} else
		{
			return;
	//   50   94:return          
		}
	}

	public static Period days(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, 0, i, 0, 0, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iload_0         
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period fieldDifference(ReadablePartial readablepartial, ReadablePartial readablepartial1)
	{
		if(readablepartial != null && readablepartial1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          180
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            180
		{
			if(readablepartial.size() != readablepartial1.size())
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #112 <Method int ReadablePartial.size()>
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #112 <Method int ReadablePartial.size()>
	//*   9   23:icmpeq          36
				throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   10   26:new             #114 <Class IllegalArgumentException>
	//   11   29:dup             
	//   12   30:ldc1            #116 <String "ReadablePartial objects must have the same set of fields">
	//   13   32:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   14   35:athrow          
			DurationFieldType adurationfieldtype[] = new DurationFieldType[readablepartial.size()];
	//   15   36:aload_0         
	//   16   37:invokeinterface #112 <Method int ReadablePartial.size()>
	//   17   42:anewarray       DurationFieldType[]
	//   18   45:astore          4
			int ai[] = new int[readablepartial.size()];
	//   19   47:aload_0         
	//   20   48:invokeinterface #112 <Method int ReadablePartial.size()>
	//   21   53:newarray        int[]
	//   22   55:astore          5
			int i = 0;
	//   23   57:iconst_0        
	//   24   58:istore_2        
			for(int j = readablepartial.size(); i < j; i++)
	//*  25   59:aload_0         
	//*  26   60:invokeinterface #112 <Method int ReadablePartial.size()>
	//*  27   65:istore_3        
	//*  28   66:iload_2         
	//*  29   67:iload_3         
	//*  30   68:icmpge          165
			{
				if(readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
	//*  31   71:aload_0         
	//*  32   72:iload_2         
	//*  33   73:invokeinterface #123 <Method DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  34   78:aload_1         
	//*  35   79:iload_2         
	//*  36   80:invokeinterface #123 <Method DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  37   85:if_acmpeq       98
					throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   38   88:new             #114 <Class IllegalArgumentException>
	//   39   91:dup             
	//   40   92:ldc1            #116 <String "ReadablePartial objects must have the same set of fields">
	//   41   94:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   42   97:athrow          
				adurationfieldtype[i] = readablepartial.getFieldType(i).getDurationType();
	//   43   98:aload           4
	//   44  100:iload_2         
	//   45  101:aload_0         
	//   46  102:iload_2         
	//   47  103:invokeinterface #123 <Method DateTimeFieldType ReadablePartial.getFieldType(int)>
	//   48  108:invokevirtual   #129 <Method DurationFieldType DateTimeFieldType.getDurationType()>
	//   49  111:aastore         
				if(i > 0 && adurationfieldtype[i - 1] == adurationfieldtype[i])
	//*  50  112:iload_2         
	//*  51  113:ifle            139
	//*  52  116:aload           4
	//*  53  118:iload_2         
	//*  54  119:iconst_1        
	//*  55  120:isub            
	//*  56  121:aaload          
	//*  57  122:aload           4
	//*  58  124:iload_2         
	//*  59  125:aaload          
	//*  60  126:if_acmpne       139
					throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
	//   61  129:new             #114 <Class IllegalArgumentException>
	//   62  132:dup             
	//   63  133:ldc1            #131 <String "ReadablePartial objects must not have overlapping fields">
	//   64  135:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   65  138:athrow          
				ai[i] = readablepartial1.getValue(i) - readablepartial.getValue(i);
	//   66  139:aload           5
	//   67  141:iload_2         
	//   68  142:aload_1         
	//   69  143:iload_2         
	//   70  144:invokeinterface #135 <Method int ReadablePartial.getValue(int)>
	//   71  149:aload_0         
	//   72  150:iload_2         
	//   73  151:invokeinterface #135 <Method int ReadablePartial.getValue(int)>
	//   74  156:isub            
	//   75  157:iastore         
			}

	//   76  158:iload_2         
	//   77  159:iconst_1        
	//   78  160:iadd            
	//   79  161:istore_2        
	//*  80  162:goto            66
			return new Period(ai, PeriodType.forFields(adurationfieldtype));
	//   81  165:new             #2   <Class Period>
	//   82  168:dup             
	//   83  169:aload           5
	//   84  171:aload           4
	//   85  173:invokestatic    #139 <Method PeriodType PeriodType.forFields(DurationFieldType[])>
	//   86  176:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   87  179:areturn         
		} else
		{
			throw new IllegalArgumentException("ReadablePartial objects must not be null");
	//   88  180:new             #114 <Class IllegalArgumentException>
	//   89  183:dup             
	//   90  184:ldc1            #141 <String "ReadablePartial objects must not be null">
	//   91  186:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   92  189:athrow          
		}
	}

	public static Period hours(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, 0, 0, i, 0, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iload_0         
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period millis(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, 0, 0, 0, 0, 0, i
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iload_0         
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period minutes(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, 0, 0, 0, i, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iload_0         
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period months(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, i, 0, 0, 0, 0, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iload_0         
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period parse(String s)
	{
		return parse(s, ISOPeriodFormat.standard());
	//    0    0:aload_0         
	//    1    1:invokestatic    #153 <Method PeriodFormatter ISOPeriodFormat.standard()>
	//    2    4:invokestatic    #156 <Method Period parse(String, PeriodFormatter)>
	//    3    7:areturn         
	}

	public static Period parse(String s, PeriodFormatter periodformatter)
	{
		return periodformatter.parsePeriod(s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #162 <Method Period PeriodFormatter.parsePeriod(String)>
	//    3    5:areturn         
	}

	public static Period seconds(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, 0, 0, 0, 0, i, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iload_0         
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period weeks(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			0, 0, i, 0, 0, 0, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iload_0         
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:aload_1         
	//   39   47:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   40   50:areturn         
	}

	public static Period years(int i)
	{
		PeriodType periodtype = PeriodType.standard();
	//    0    0:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    1    3:astore_1        
		return new Period(new int[] {
			i, 0, 0, 0, 0, 0, 0, 0, 0
		}, periodtype);
	//    2    4:new             #2   <Class Period>
	//    3    7:dup             
	//    4    8:bipush          9
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iload_0         
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_0        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_0        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:iconst_0        
	//   25   31:iastore         
	//   26   32:dup             
	//   27   33:iconst_5        
	//   28   34:iconst_0        
	//   29   35:iastore         
	//   30   36:dup             
	//   31   37:bipush          6
	//   32   39:iconst_0        
	//   33   40:iastore         
	//   34   41:dup             
	//   35   42:bipush          7
	//   36   44:iconst_0        
	//   37   45:iastore         
	//   38   46:dup             
	//   39   47:bipush          8
	//   40   49:iconst_0        
	//   41   50:iastore         
	//   42   51:aload_1         
	//   43   52:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   44   55:areturn         
	}

	public int getDays()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #173 <Field int PeriodType.DAY_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getHours()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #181 <Field int PeriodType.HOUR_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMillis()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #185 <Field int PeriodType.MILLI_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMinutes()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #189 <Field int PeriodType.MINUTE_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getMonths()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #192 <Field int PeriodType.MONTH_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getSeconds()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #196 <Field int PeriodType.SECOND_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getWeeks()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #200 <Field int PeriodType.WEEK_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public int getYears()
	{
		return getPeriodType().getIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    2    4:aload_0         
	//    3    5:getstatic       #203 <Field int PeriodType.YEAR_INDEX>
	//    4    8:invokevirtual   #177 <Method int PeriodType.getIndexedField(ReadablePeriod, int)>
	//    5   11:ireturn         
	}

	public Period minus(ReadablePeriod readableperiod)
	{
		if(readableperiod == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX, ai, -readableperiod.get(DurationFieldType.YEARS_TYPE));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #203 <Field int PeriodType.YEAR_INDEX>
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:getstatic       #213 <Field DurationFieldType DurationFieldType.YEARS_TYPE>
	//   14   24:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   15   29:ineg            
	//   16   30:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   17   33:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX, ai, -readableperiod.get(DurationFieldType.MONTHS_TYPE));
	//   18   34:aload_0         
	//   19   35:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   38:aload_0         
	//   21   39:getstatic       #192 <Field int PeriodType.MONTH_INDEX>
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:getstatic       #224 <Field DurationFieldType DurationFieldType.MONTHS_TYPE>
	//   25   47:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   26   52:ineg            
	//   27   53:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   28   56:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX, ai, -readableperiod.get(DurationFieldType.WEEKS_TYPE));
	//   29   57:aload_0         
	//   30   58:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   31   61:aload_0         
	//   32   62:getstatic       #200 <Field int PeriodType.WEEK_INDEX>
	//   33   65:aload_2         
	//   34   66:aload_1         
	//   35   67:getstatic       #227 <Field DurationFieldType DurationFieldType.WEEKS_TYPE>
	//   36   70:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   37   75:ineg            
	//   38   76:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   39   79:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX, ai, -readableperiod.get(DurationFieldType.DAYS_TYPE));
	//   40   80:aload_0         
	//   41   81:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   42   84:aload_0         
	//   43   85:getstatic       #173 <Field int PeriodType.DAY_INDEX>
	//   44   88:aload_2         
	//   45   89:aload_1         
	//   46   90:getstatic       #230 <Field DurationFieldType DurationFieldType.DAYS_TYPE>
	//   47   93:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   48   98:ineg            
	//   49   99:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   50  102:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX, ai, -readableperiod.get(DurationFieldType.HOURS_TYPE));
	//   51  103:aload_0         
	//   52  104:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   53  107:aload_0         
	//   54  108:getstatic       #181 <Field int PeriodType.HOUR_INDEX>
	//   55  111:aload_2         
	//   56  112:aload_1         
	//   57  113:getstatic       #233 <Field DurationFieldType DurationFieldType.HOURS_TYPE>
	//   58  116:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   59  121:ineg            
	//   60  122:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   61  125:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX, ai, -readableperiod.get(DurationFieldType.MINUTES_TYPE));
	//   62  126:aload_0         
	//   63  127:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   64  130:aload_0         
	//   65  131:getstatic       #189 <Field int PeriodType.MINUTE_INDEX>
	//   66  134:aload_2         
	//   67  135:aload_1         
	//   68  136:getstatic       #236 <Field DurationFieldType DurationFieldType.MINUTES_TYPE>
	//   69  139:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   70  144:ineg            
	//   71  145:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   72  148:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX, ai, -readableperiod.get(DurationFieldType.SECONDS_TYPE));
	//   73  149:aload_0         
	//   74  150:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   75  153:aload_0         
	//   76  154:getstatic       #196 <Field int PeriodType.SECOND_INDEX>
	//   77  157:aload_2         
	//   78  158:aload_1         
	//   79  159:getstatic       #239 <Field DurationFieldType DurationFieldType.SECONDS_TYPE>
	//   80  162:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   81  167:ineg            
	//   82  168:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   83  171:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX, ai, -readableperiod.get(DurationFieldType.MILLIS_TYPE));
	//   84  172:aload_0         
	//   85  173:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   86  176:aload_0         
	//   87  177:getstatic       #185 <Field int PeriodType.MILLI_INDEX>
	//   88  180:aload_2         
	//   89  181:aload_1         
	//   90  182:getstatic       #242 <Field DurationFieldType DurationFieldType.MILLIS_TYPE>
	//   91  185:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   92  190:ineg            
	//   93  191:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   94  194:pop             
			return new Period(ai, getPeriodType());
	//   95  195:new             #2   <Class Period>
	//   96  198:dup             
	//   97  199:aload_2         
	//   98  200:aload_0         
	//   99  201:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//  100  204:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//  101  207:areturn         
		}
	}

	public Period minusDays(int i)
	{
		return plusDays(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #246 <Method Period plusDays(int)>
	//    4    6:areturn         
	}

	public Period minusHours(int i)
	{
		return plusHours(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #250 <Method Period plusHours(int)>
	//    4    6:areturn         
	}

	public Period minusMillis(int i)
	{
		return plusMillis(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #254 <Method Period plusMillis(int)>
	//    4    6:areturn         
	}

	public Period minusMinutes(int i)
	{
		return plusMinutes(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #258 <Method Period plusMinutes(int)>
	//    4    6:areturn         
	}

	public Period minusMonths(int i)
	{
		return plusMonths(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #262 <Method Period plusMonths(int)>
	//    4    6:areturn         
	}

	public Period minusSeconds(int i)
	{
		return plusSeconds(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #266 <Method Period plusSeconds(int)>
	//    4    6:areturn         
	}

	public Period minusWeeks(int i)
	{
		return plusWeeks(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #270 <Method Period plusWeeks(int)>
	//    4    6:areturn         
	}

	public Period minusYears(int i)
	{
		return plusYears(-i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:invokevirtual   #274 <Method Period plusYears(int)>
	//    4    6:areturn         
	}

	public Period multipliedBy(int i)
	{
		if(this != ZERO)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #21  <Field Period ZERO>
	//*   2    4:if_acmpeq       57
		{
			if(i == 1)
	//*   3    7:iload_1         
	//*   4    8:iconst_1        
	//*   5    9:icmpne          14
				return this;
	//    6   12:aload_0         
	//    7   13:areturn         
			int ai[] = getValues();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #209 <Method int[] getValues()>
	//   10   18:astore_3        
			for(int j = 0; j < ai.length; j++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:aload_3         
	//*  15   23:arraylength     
	//*  16   24:icmpge          44
				ai[j] = FieldUtils.safeMultiply(ai[j], i);
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:aload_3         
	//   20   30:iload_2         
	//   21   31:iaload          
	//   22   32:iload_1         
	//   23   33:invokestatic    #281 <Method int FieldUtils.safeMultiply(int, int)>
	//   24   36:iastore         

	//   25   37:iload_2         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_2        
	//*  29   41:goto            21
			return new Period(ai, getPeriodType());
	//   30   44:new             #2   <Class Period>
	//   31   47:dup             
	//   32   48:aload_3         
	//   33   49:aload_0         
	//   34   50:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   35   53:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   36   56:areturn         
		} else
		{
			return this;
	//   37   57:aload_0         
	//   38   58:areturn         
		}
	}

	public Period negated()
	{
		return multipliedBy(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #285 <Method Period multipliedBy(int)>
	//    3    5:areturn         
	}

	public Period normalizedStandard()
	{
		return normalizedStandard(PeriodType.standard());
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method PeriodType PeriodType.standard()>
	//    2    4:invokevirtual   #289 <Method Period normalizedStandard(PeriodType)>
	//    3    7:areturn         
	}

	public Period normalizedStandard(PeriodType periodtype)
	{
		Object obj;
label0:
		{
			PeriodType periodtype1 = DateTimeUtils.getPeriodType(periodtype);
	//    0    0:aload_1         
	//    1    1:invokestatic    #294 <Method PeriodType DateTimeUtils.getPeriodType(PeriodType)>
	//    2    4:astore          9
			periodtype = ((PeriodType) (new Period((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L + (long)getDays() * 0x5265c00L + (long)getWeeks() * 0x240c8400L, periodtype1, ((Chronology) (ISOChronology.getInstanceUTC())))));
	//    3    6:new             #2   <Class Period>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokevirtual   #296 <Method int getMillis()>
	//    7   14:i2l             
	//    8   15:aload_0         
	//    9   16:invokevirtual   #298 <Method int getSeconds()>
	//   10   19:i2l             
	//   11   20:ldc2w           #299 <Long 1000L>
	//   12   23:lmul            
	//   13   24:ladd            
	//   14   25:aload_0         
	//   15   26:invokevirtual   #302 <Method int getMinutes()>
	//   16   29:i2l             
	//   17   30:ldc2w           #303 <Long 60000L>
	//   18   33:lmul            
	//   19   34:ladd            
	//   20   35:aload_0         
	//   21   36:invokevirtual   #306 <Method int getHours()>
	//   22   39:i2l             
	//   23   40:ldc2w           #307 <Long 0x36ee80L>
	//   24   43:lmul            
	//   25   44:ladd            
	//   26   45:aload_0         
	//   27   46:invokevirtual   #310 <Method int getDays()>
	//   28   49:i2l             
	//   29   50:ldc2w           #311 <Long 0x5265c00L>
	//   30   53:lmul            
	//   31   54:ladd            
	//   32   55:aload_0         
	//   33   56:invokevirtual   #314 <Method int getWeeks()>
	//   34   59:i2l             
	//   35   60:ldc2w           #315 <Long 0x240c8400L>
	//   36   63:lmul            
	//   37   64:ladd            
	//   38   65:aload           9
	//   39   67:invokestatic    #322 <Method ISOChronology ISOChronology.getInstanceUTC()>
	//   40   70:invokespecial   #323 <Method void Period(long, PeriodType, Chronology)>
	//   41   73:astore_1        
			int i = getYears();
	//   42   74:aload_0         
	//   43   75:invokevirtual   #100 <Method int getYears()>
	//   44   78:istore_2        
			int l = getMonths();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #78  <Method int getMonths()>
	//   47   83:istore_3        
			if(i == 0)
	//*  48   84:iload_2         
	//*  49   85:ifne            95
			{
				obj = ((Object) (periodtype));
	//   50   88:aload_1         
	//   51   89:astore          8
				if(l == 0)
					break label0;
	//   52   91:iload_3         
	//   53   92:ifeq            228
			}
			long l1 = (long)i * 12L + (long)l;
	//   54   95:iload_2         
	//   55   96:i2l             
	//   56   97:ldc2w           #324 <Long 12L>
	//   57  100:lmul            
	//   58  101:iload_3         
	//   59  102:i2l             
	//   60  103:ladd            
	//   61  104:lstore          4
			if(periodtype1.isSupported(DurationFieldType.YEARS_TYPE))
	//*  62  106:aload           9
	//*  63  108:getstatic       #213 <Field DurationFieldType DurationFieldType.YEARS_TYPE>
	//*  64  111:invokevirtual   #329 <Method boolean PeriodType.isSupported(DurationFieldType)>
	//*  65  114:ifeq            146
			{
				int j = FieldUtils.safeToInt(l1 / 12L);
	//   66  117:lload           4
	//   67  119:ldc2w           #324 <Long 12L>
	//   68  122:ldiv            
	//   69  123:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   70  126:istore_2        
				periodtype = ((PeriodType) (((Period) (periodtype)).withYears(j)));
	//   71  127:aload_1         
	//   72  128:iload_2         
	//   73  129:invokevirtual   #336 <Method Period withYears(int)>
	//   74  132:astore_1        
				l1 -= j * 12;
	//   75  133:lload           4
	//   76  135:iload_2         
	//   77  136:bipush          12
	//   78  138:imul            
	//   79  139:i2l             
	//   80  140:lsub            
	//   81  141:lstore          4
			}
	//*  82  143:goto            146
			obj = ((Object) (periodtype));
	//   83  146:aload_1         
	//   84  147:astore          8
			long l2 = l1;
	//   85  149:lload           4
	//   86  151:lstore          6
			if(periodtype1.isSupported(DurationFieldType.MONTHS_TYPE))
	//*  87  153:aload           9
	//*  88  155:getstatic       #224 <Field DurationFieldType DurationFieldType.MONTHS_TYPE>
	//*  89  158:invokevirtual   #329 <Method boolean PeriodType.isSupported(DurationFieldType)>
	//*  90  161:ifeq            184
			{
				int k = FieldUtils.safeToInt(l1);
	//   91  164:lload           4
	//   92  166:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   93  169:istore_2        
				obj = ((Object) (((Period) (periodtype)).withMonths(k)));
	//   94  170:aload_1         
	//   95  171:iload_2         
	//   96  172:invokevirtual   #339 <Method Period withMonths(int)>
	//   97  175:astore          8
				l2 = l1 - (long)k;
	//   98  177:lload           4
	//   99  179:iload_2         
	//  100  180:i2l             
	//  101  181:lsub            
	//  102  182:lstore          6
			}
			if(l2 != 0L)
	//* 103  184:lload           6
	//* 104  186:lconst_0        
	//* 105  187:lcmp            
	//* 106  188:ifeq            228
			{
				periodtype = ((PeriodType) (new StringBuilder()));
	//  107  191:new             #80  <Class StringBuilder>
	//  108  194:dup             
	//  109  195:invokespecial   #81  <Method void StringBuilder()>
	//  110  198:astore_1        
				((StringBuilder) (periodtype)).append("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ");
	//  111  199:aload_1         
	//  112  200:ldc2            #341 <String "Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ">
	//  113  203:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  114  206:pop             
				((StringBuilder) (periodtype)).append(toString());
	//  115  207:aload_1         
	//  116  208:aload_0         
	//  117  209:invokevirtual   #342 <Method String toString()>
	//  118  212:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  119  215:pop             
				throw new UnsupportedOperationException(((StringBuilder) (periodtype)).toString());
	//  120  216:new             #91  <Class UnsupportedOperationException>
	//  121  219:dup             
	//  122  220:aload_1         
	//  123  221:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  124  224:invokespecial   #97  <Method void UnsupportedOperationException(String)>
	//  125  227:athrow          
			}
		}
		return ((Period) (obj));
	//  126  228:aload           8
	//  127  230:areturn         
	}

	public Period plus(ReadablePeriod readableperiod)
	{
		if(readableperiod == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX, ai, readableperiod.get(DurationFieldType.YEARS_TYPE));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #203 <Field int PeriodType.YEAR_INDEX>
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:getstatic       #213 <Field DurationFieldType DurationFieldType.YEARS_TYPE>
	//   14   24:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   15   29:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   16   32:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX, ai, readableperiod.get(DurationFieldType.MONTHS_TYPE));
	//   17   33:aload_0         
	//   18   34:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   19   37:aload_0         
	//   20   38:getstatic       #192 <Field int PeriodType.MONTH_INDEX>
	//   21   41:aload_2         
	//   22   42:aload_1         
	//   23   43:getstatic       #224 <Field DurationFieldType DurationFieldType.MONTHS_TYPE>
	//   24   46:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   25   51:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   26   54:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX, ai, readableperiod.get(DurationFieldType.WEEKS_TYPE));
	//   27   55:aload_0         
	//   28   56:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   29   59:aload_0         
	//   30   60:getstatic       #200 <Field int PeriodType.WEEK_INDEX>
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:getstatic       #227 <Field DurationFieldType DurationFieldType.WEEKS_TYPE>
	//   34   68:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   35   73:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   36   76:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX, ai, readableperiod.get(DurationFieldType.DAYS_TYPE));
	//   37   77:aload_0         
	//   38   78:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   39   81:aload_0         
	//   40   82:getstatic       #173 <Field int PeriodType.DAY_INDEX>
	//   41   85:aload_2         
	//   42   86:aload_1         
	//   43   87:getstatic       #230 <Field DurationFieldType DurationFieldType.DAYS_TYPE>
	//   44   90:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   45   95:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   46   98:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX, ai, readableperiod.get(DurationFieldType.HOURS_TYPE));
	//   47   99:aload_0         
	//   48  100:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   49  103:aload_0         
	//   50  104:getstatic       #181 <Field int PeriodType.HOUR_INDEX>
	//   51  107:aload_2         
	//   52  108:aload_1         
	//   53  109:getstatic       #233 <Field DurationFieldType DurationFieldType.HOURS_TYPE>
	//   54  112:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   55  117:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   56  120:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX, ai, readableperiod.get(DurationFieldType.MINUTES_TYPE));
	//   57  121:aload_0         
	//   58  122:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   59  125:aload_0         
	//   60  126:getstatic       #189 <Field int PeriodType.MINUTE_INDEX>
	//   61  129:aload_2         
	//   62  130:aload_1         
	//   63  131:getstatic       #236 <Field DurationFieldType DurationFieldType.MINUTES_TYPE>
	//   64  134:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   65  139:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   66  142:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX, ai, readableperiod.get(DurationFieldType.SECONDS_TYPE));
	//   67  143:aload_0         
	//   68  144:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   69  147:aload_0         
	//   70  148:getstatic       #196 <Field int PeriodType.SECOND_INDEX>
	//   71  151:aload_2         
	//   72  152:aload_1         
	//   73  153:getstatic       #239 <Field DurationFieldType DurationFieldType.SECONDS_TYPE>
	//   74  156:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   75  161:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   76  164:pop             
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX, ai, readableperiod.get(DurationFieldType.MILLIS_TYPE));
	//   77  165:aload_0         
	//   78  166:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   79  169:aload_0         
	//   80  170:getstatic       #185 <Field int PeriodType.MILLI_INDEX>
	//   81  173:aload_2         
	//   82  174:aload_1         
	//   83  175:getstatic       #242 <Field DurationFieldType DurationFieldType.MILLIS_TYPE>
	//   84  178:invokeinterface #217 <Method int ReadablePeriod.get(DurationFieldType)>
	//   85  183:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   86  186:pop             
			return new Period(ai, getPeriodType());
	//   87  187:new             #2   <Class Period>
	//   88  190:dup             
	//   89  191:aload_2         
	//   90  192:aload_0         
	//   91  193:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   92  196:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   93  199:areturn         
		}
	}

	public Period plusDays(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #173 <Field int PeriodType.DAY_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusHours(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #181 <Field int PeriodType.HOUR_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusMillis(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #185 <Field int PeriodType.MILLI_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusMinutes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #189 <Field int PeriodType.MINUTE_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusMonths(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #192 <Field int PeriodType.MONTH_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusSeconds(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #196 <Field int PeriodType.SECOND_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusWeeks(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #200 <Field int PeriodType.WEEK_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period plusYears(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			int ai[] = getValues();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #209 <Method int[] getValues()>
	//    6   10:astore_2        
			getPeriodType().addIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX, ai, i);
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    9   15:aload_0         
	//   10   16:getstatic       #203 <Field int PeriodType.YEAR_INDEX>
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #221 <Method boolean PeriodType.addIndexedField(ReadablePeriod, int, int[], int)>
	//   14   24:pop             
			return new Period(ai, getPeriodType());
	//   15   25:new             #2   <Class Period>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   34:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   37:areturn         
		}
	}

	public Period toPeriod()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Days toStandardDays()
	{
		checkYearsAndMonths("Days");
	//    0    0:aload_0         
	//    1    1:ldc2            #348 <String "Days">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L) / 0x5265c00L, getDays()), (long)getWeeks() * 7L)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method int getMillis()>
	//    5   11:i2l             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #298 <Method int getSeconds()>
	//    8   16:i2l             
	//    9   17:ldc2w           #299 <Long 1000L>
	//   10   20:lmul            
	//   11   21:ladd            
	//   12   22:aload_0         
	//   13   23:invokevirtual   #302 <Method int getMinutes()>
	//   14   26:i2l             
	//   15   27:ldc2w           #303 <Long 60000L>
	//   16   30:lmul            
	//   17   31:ladd            
	//   18   32:aload_0         
	//   19   33:invokevirtual   #306 <Method int getHours()>
	//   20   36:i2l             
	//   21   37:ldc2w           #307 <Long 0x36ee80L>
	//   22   40:lmul            
	//   23   41:ladd            
	//   24   42:ldc2w           #311 <Long 0x5265c00L>
	//   25   45:ldiv            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #310 <Method int getDays()>
	//   28   50:i2l             
	//   29   51:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   30   54:aload_0         
	//   31   55:invokevirtual   #314 <Method int getWeeks()>
	//   32   58:i2l             
	//   33   59:ldc2w           #355 <Long 7L>
	//   34   62:lmul            
	//   35   63:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   36   66:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   37   69:invokestatic    #361 <Method Days Days.days(int)>
	//   38   72:areturn         
	}

	public Duration toStandardDuration()
	{
		checkYearsAndMonths("Duration");
	//    0    0:aload_0         
	//    1    1:ldc2            #365 <String "Duration">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		return new Duration((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L + (long)getDays() * 0x5265c00L + (long)getWeeks() * 0x240c8400L);
	//    3    7:new             #367 <Class Duration>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #296 <Method int getMillis()>
	//    7   15:i2l             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #298 <Method int getSeconds()>
	//   10   20:i2l             
	//   11   21:ldc2w           #299 <Long 1000L>
	//   12   24:lmul            
	//   13   25:ladd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #302 <Method int getMinutes()>
	//   16   30:i2l             
	//   17   31:ldc2w           #303 <Long 60000L>
	//   18   34:lmul            
	//   19   35:ladd            
	//   20   36:aload_0         
	//   21   37:invokevirtual   #306 <Method int getHours()>
	//   22   40:i2l             
	//   23   41:ldc2w           #307 <Long 0x36ee80L>
	//   24   44:lmul            
	//   25   45:ladd            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #310 <Method int getDays()>
	//   28   50:i2l             
	//   29   51:ldc2w           #311 <Long 0x5265c00L>
	//   30   54:lmul            
	//   31   55:ladd            
	//   32   56:aload_0         
	//   33   57:invokevirtual   #314 <Method int getWeeks()>
	//   34   60:i2l             
	//   35   61:ldc2w           #315 <Long 0x240c8400L>
	//   36   64:lmul            
	//   37   65:ladd            
	//   38   66:invokespecial   #368 <Method void Duration(long)>
	//   39   69:areturn         
	}

	public Hours toStandardHours()
	{
		checkYearsAndMonths("Hours");
	//    0    0:aload_0         
	//    1    1:ldc2            #372 <String "Hours">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L) / 0x36ee80L, getHours()), (long)getDays() * 24L), (long)getWeeks() * 168L)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method int getMillis()>
	//    5   11:i2l             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #298 <Method int getSeconds()>
	//    8   16:i2l             
	//    9   17:ldc2w           #299 <Long 1000L>
	//   10   20:lmul            
	//   11   21:ladd            
	//   12   22:aload_0         
	//   13   23:invokevirtual   #302 <Method int getMinutes()>
	//   14   26:i2l             
	//   15   27:ldc2w           #303 <Long 60000L>
	//   16   30:lmul            
	//   17   31:ladd            
	//   18   32:ldc2w           #307 <Long 0x36ee80L>
	//   19   35:ldiv            
	//   20   36:aload_0         
	//   21   37:invokevirtual   #306 <Method int getHours()>
	//   22   40:i2l             
	//   23   41:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #310 <Method int getDays()>
	//   26   48:i2l             
	//   27   49:ldc2w           #373 <Long 24L>
	//   28   52:lmul            
	//   29   53:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   30   56:aload_0         
	//   31   57:invokevirtual   #314 <Method int getWeeks()>
	//   32   60:i2l             
	//   33   61:ldc2w           #375 <Long 168L>
	//   34   64:lmul            
	//   35   65:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   36   68:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   37   71:invokestatic    #381 <Method Hours Hours.hours(int)>
	//   38   74:areturn         
	}

	public Minutes toStandardMinutes()
	{
		checkYearsAndMonths("Minutes");
	//    0    0:aload_0         
	//    1    1:ldc2            #385 <String "Minutes">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L) / 60000L, getMinutes()), (long)getHours() * 60L), (long)getDays() * 1440L), (long)getWeeks() * 10080L)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method int getMillis()>
	//    5   11:i2l             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #298 <Method int getSeconds()>
	//    8   16:i2l             
	//    9   17:ldc2w           #299 <Long 1000L>
	//   10   20:lmul            
	//   11   21:ladd            
	//   12   22:ldc2w           #303 <Long 60000L>
	//   13   25:ldiv            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #302 <Method int getMinutes()>
	//   16   30:i2l             
	//   17   31:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #306 <Method int getHours()>
	//   20   38:i2l             
	//   21   39:ldc2w           #386 <Long 60L>
	//   22   42:lmul            
	//   23   43:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   24   46:aload_0         
	//   25   47:invokevirtual   #310 <Method int getDays()>
	//   26   50:i2l             
	//   27   51:ldc2w           #388 <Long 1440L>
	//   28   54:lmul            
	//   29   55:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   30   58:aload_0         
	//   31   59:invokevirtual   #314 <Method int getWeeks()>
	//   32   62:i2l             
	//   33   63:ldc2w           #390 <Long 10080L>
	//   34   66:lmul            
	//   35   67:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   36   70:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   37   73:invokestatic    #396 <Method Minutes Minutes.minutes(int)>
	//   38   76:areturn         
	}

	public Seconds toStandardSeconds()
	{
		checkYearsAndMonths("Seconds");
	//    0    0:aload_0         
	//    1    1:ldc2            #400 <String "Seconds">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), (long)getMinutes() * 60L), (long)getHours() * 3600L), (long)getDays() * 0x15180L), (long)getWeeks() * 0x93a80L)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method int getMillis()>
	//    5   11:sipush          1000
	//    6   14:idiv            
	//    7   15:i2l             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #298 <Method int getSeconds()>
	//   10   20:i2l             
	//   11   21:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #302 <Method int getMinutes()>
	//   14   28:i2l             
	//   15   29:ldc2w           #386 <Long 60L>
	//   16   32:lmul            
	//   17   33:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   18   36:aload_0         
	//   19   37:invokevirtual   #306 <Method int getHours()>
	//   20   40:i2l             
	//   21   41:ldc2w           #401 <Long 3600L>
	//   22   44:lmul            
	//   23   45:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   24   48:aload_0         
	//   25   49:invokevirtual   #310 <Method int getDays()>
	//   26   52:i2l             
	//   27   53:ldc2w           #403 <Long 0x15180L>
	//   28   56:lmul            
	//   29   57:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   30   60:aload_0         
	//   31   61:invokevirtual   #314 <Method int getWeeks()>
	//   32   64:i2l             
	//   33   65:ldc2w           #405 <Long 0x93a80L>
	//   34   68:lmul            
	//   35   69:invokestatic    #354 <Method long FieldUtils.safeAdd(long, long)>
	//   36   72:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   37   75:invokestatic    #411 <Method Seconds Seconds.seconds(int)>
	//   38   78:areturn         
	}

	public Weeks toStandardWeeks()
	{
		checkYearsAndMonths("Weeks");
	//    0    0:aload_0         
	//    1    1:ldc2            #415 <String "Weeks">
	//    2    4:invokespecial   #350 <Method void checkYearsAndMonths(String)>
		long l = getMillis();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method int getMillis()>
	//    5   11:i2l             
	//    6   12:lstore_1        
		long l1 = getSeconds();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #298 <Method int getSeconds()>
	//    9   17:i2l             
	//   10   18:lstore_3        
		long l2 = getMinutes();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #302 <Method int getMinutes()>
	//   13   23:i2l             
	//   14   24:lstore          5
		long l3 = getHours();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #306 <Method int getHours()>
	//   17   30:i2l             
	//   18   31:lstore          7
		long l4 = getDays();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #310 <Method int getDays()>
	//   21   37:i2l             
	//   22   38:lstore          9
		return Weeks.weeks(FieldUtils.safeToInt((long)getWeeks() + (l + l1 * 1000L + l2 * 60000L + l3 * 0x36ee80L + l4 * 0x5265c00L) / 0x240c8400L));
	//   23   40:aload_0         
	//   24   41:invokevirtual   #314 <Method int getWeeks()>
	//   25   44:i2l             
	//   26   45:lload_1         
	//   27   46:lload_3         
	//   28   47:ldc2w           #299 <Long 1000L>
	//   29   50:lmul            
	//   30   51:ladd            
	//   31   52:lload           5
	//   32   54:ldc2w           #303 <Long 60000L>
	//   33   57:lmul            
	//   34   58:ladd            
	//   35   59:lload           7
	//   36   61:ldc2w           #307 <Long 0x36ee80L>
	//   37   64:lmul            
	//   38   65:ladd            
	//   39   66:lload           9
	//   40   68:ldc2w           #311 <Long 0x5265c00L>
	//   41   71:lmul            
	//   42   72:ladd            
	//   43   73:ldc2w           #315 <Long 0x240c8400L>
	//   44   76:ldiv            
	//   45   77:ladd            
	//   46   78:invokestatic    #333 <Method int FieldUtils.safeToInt(long)>
	//   47   81:invokestatic    #420 <Method Weeks Weeks.weeks(int)>
	//   48   84:areturn         
	}

	public Period withDays(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.DAY_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #173 <Field int PeriodType.DAY_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withField(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #114 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #428 <String "Field must not be null">
	//    5   11:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			int ai[] = getValues();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #209 <Method int[] getValues()>
	//    9   19:astore_3        
			super.setFieldInto(ai, durationfieldtype, i);
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokespecial   #432 <Method void BasePeriod.setFieldInto(int[], DurationFieldType, int)>
			return new Period(ai, getPeriodType());
	//   15   27:new             #2   <Class Period>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   20   36:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   21   39:areturn         
		}
	}

	public Period withFieldAdded(DurationFieldType durationfieldtype, int i)
	{
		if(durationfieldtype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Field must not be null");
	//    2    4:new             #114 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #428 <String "Field must not be null">
	//    5   11:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(i == 0)
	//*   7   15:iload_2         
	//*   8   16:ifne            21
		{
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		} else
		{
			int ai[] = getValues();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #209 <Method int[] getValues()>
	//   13   25:astore_3        
			super.addFieldInto(ai, durationfieldtype, i);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokespecial   #436 <Method void BasePeriod.addFieldInto(int[], DurationFieldType, int)>
			return new Period(ai, getPeriodType());
	//   19   33:new             #2   <Class Period>
	//   20   36:dup             
	//   21   37:aload_3         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   24   42:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   25   45:areturn         
		}
	}

	public Period withFields(ReadablePeriod readableperiod)
	{
		if(readableperiod == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return new Period(super.mergePeriodInto(getValues(), readableperiod), getPeriodType());
	//    4    6:new             #2   <Class Period>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #209 <Method int[] getValues()>
	//    9   15:aload_1         
	//   10   16:invokespecial   #441 <Method int[] BasePeriod.mergePeriodInto(int[], ReadablePeriod)>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   13   23:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   14   26:areturn         
	}

	public Period withHours(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.HOUR_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #181 <Field int PeriodType.HOUR_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withMillis(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.MILLI_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #185 <Field int PeriodType.MILLI_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withMinutes(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.MINUTE_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #189 <Field int PeriodType.MINUTE_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withMonths(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.MONTH_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #192 <Field int PeriodType.MONTH_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withPeriodType(PeriodType periodtype)
	{
		periodtype = DateTimeUtils.getPeriodType(periodtype);
	//    0    0:aload_1         
	//    1    1:invokestatic    #294 <Method PeriodType DateTimeUtils.getPeriodType(PeriodType)>
	//    2    4:astore_1        
		if(periodtype.equals(((Object) (getPeriodType()))))
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//*   6   10:invokevirtual   #449 <Method boolean PeriodType.equals(Object)>
	//*   7   13:ifeq            18
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			return new Period(((Object) (this)), periodtype);
	//   10   18:new             #2   <Class Period>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #451 <Method void Period(Object, PeriodType)>
	//   15   27:areturn         
	}

	public Period withSeconds(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.SECOND_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #196 <Field int PeriodType.SECOND_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withWeeks(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.WEEK_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #200 <Field int PeriodType.WEEK_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public Period withYears(int i)
	{
		int ai[] = getValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int[] getValues()>
	//    2    4:astore_2        
		getPeriodType().setIndexedField(((ReadablePeriod) (this)), PeriodType.YEAR_INDEX, ai, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//    5    9:aload_0         
	//    6   10:getstatic       #203 <Field int PeriodType.YEAR_INDEX>
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #424 <Method boolean PeriodType.setIndexedField(ReadablePeriod, int, int[], int)>
	//   10   18:pop             
		return new Period(ai, getPeriodType());
	//   11   19:new             #2   <Class Period>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #169 <Method PeriodType getPeriodType()>
	//   16   28:invokespecial   #105 <Method void Period(int[], PeriodType)>
	//   17   31:areturn         
	}

	public static final Period ZERO = new Period();
	private static final long serialVersionUID = 0x88c66fdbL;

	static 
	{
	//    0    0:new             #2   <Class Period>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Period()>
	//    3    7:putstatic       #21  <Field Period ZERO>
	//*   4   10:return          
	}
}
