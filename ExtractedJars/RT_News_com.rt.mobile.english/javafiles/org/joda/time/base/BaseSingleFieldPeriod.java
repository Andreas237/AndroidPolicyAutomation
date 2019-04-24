// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.*;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

public abstract class BaseSingleFieldPeriod
	implements ReadablePeriod, Comparable, Serializable
{

	protected BaseSingleFieldPeriod(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		iPeriod = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int iPeriod>
	//    5    9:return          
	}

	protected static int between(ReadableInstant readableinstant, ReadableInstant readableinstant1, DurationFieldType durationfieldtype)
	{
		if(readableinstant != null && readableinstant1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            35
			return durationfieldtype.getField(DateTimeUtils.getInstantChronology(readableinstant)).getDifference(readableinstant1.getMillis(), readableinstant.getMillis());
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:invokestatic    #36  <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//    8   16:invokevirtual   #42  <Method DurationField DurationFieldType.getField(Chronology)>
	//    9   19:aload_1         
	//   10   20:invokeinterface #48  <Method long ReadableInstant.getMillis()>
	//   11   25:aload_0         
	//   12   26:invokeinterface #48  <Method long ReadableInstant.getMillis()>
	//   13   31:invokevirtual   #54  <Method int DurationField.getDifference(long, long)>
	//   14   34:ireturn         
		else
			throw new IllegalArgumentException("ReadableInstant objects must not be null");
	//   15   35:new             #56  <Class IllegalArgumentException>
	//   16   38:dup             
	//   17   39:ldc1            #58  <String "ReadableInstant objects must not be null">
	//   18   41:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   19   44:athrow          
	}

	protected static int between(ReadablePartial readablepartial, ReadablePartial readablepartial1, ReadablePeriod readableperiod)
	{
		if(readablepartial != null && readablepartial1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          144
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            144
		{
			if(readablepartial.size() != readablepartial1.size())
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #68  <Method int ReadablePartial.size()>
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #68  <Method int ReadablePartial.size()>
	//*   9   23:icmpeq          36
				throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   10   26:new             #56  <Class IllegalArgumentException>
	//   11   29:dup             
	//   12   30:ldc1            #70  <String "ReadablePartial objects must have the same set of fields">
	//   13   32:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   14   35:athrow          
			int j = readablepartial.size();
	//   15   36:aload_0         
	//   16   37:invokeinterface #68  <Method int ReadablePartial.size()>
	//   17   42:istore          4
			for(int i = 0; i < j; i++)
	//*  18   44:iconst_0        
	//*  19   45:istore_3        
	//*  20   46:iload_3         
	//*  21   47:iload           4
	//*  22   49:icmpge          86
				if(readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
	//*  23   52:aload_0         
	//*  24   53:iload_3         
	//*  25   54:invokeinterface #74  <Method org.joda.time.DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  26   59:aload_1         
	//*  27   60:iload_3         
	//*  28   61:invokeinterface #74  <Method org.joda.time.DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  29   66:if_acmpeq       79
					throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   30   69:new             #56  <Class IllegalArgumentException>
	//   31   72:dup             
	//   32   73:ldc1            #70  <String "ReadablePartial objects must have the same set of fields">
	//   33   75:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   34   78:athrow          

	//   35   79:iload_3         
	//   36   80:iconst_1        
	//   37   81:iadd            
	//   38   82:istore_3        
	//*  39   83:goto            46
			if(!DateTimeUtils.isContiguous(readablepartial))
	//*  40   86:aload_0         
	//*  41   87:invokestatic    #78  <Method boolean DateTimeUtils.isContiguous(ReadablePartial)>
	//*  42   90:ifne            103
			{
				throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
	//   43   93:new             #56  <Class IllegalArgumentException>
	//   44   96:dup             
	//   45   97:ldc1            #80  <String "ReadablePartial objects must be contiguous">
	//   46   99:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   47  102:athrow          
			} else
			{
				Chronology chronology = DateTimeUtils.getChronology(readablepartial.getChronology()).withUTC();
	//   48  103:aload_0         
	//   49  104:invokeinterface #84  <Method Chronology ReadablePartial.getChronology()>
	//   50  109:invokestatic    #87  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   51  112:invokevirtual   #92  <Method Chronology Chronology.withUTC()>
	//   52  115:astore          5
				return chronology.get(readableperiod, chronology.set(readablepartial, 0xaf625800L), chronology.set(readablepartial1, 0xaf625800L))[0];
	//   53  117:aload           5
	//   54  119:aload_2         
	//   55  120:aload           5
	//   56  122:aload_0         
	//   57  123:ldc2w           #14  <Long 0xaf625800L>
	//   58  126:invokevirtual   #96  <Method long Chronology.set(ReadablePartial, long)>
	//   59  129:aload           5
	//   60  131:aload_1         
	//   61  132:ldc2w           #14  <Long 0xaf625800L>
	//   62  135:invokevirtual   #96  <Method long Chronology.set(ReadablePartial, long)>
	//   63  138:invokevirtual   #100 <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   64  141:iconst_0        
	//   65  142:iaload          
	//   66  143:ireturn         
			}
		} else
		{
			throw new IllegalArgumentException("ReadablePartial objects must not be null");
	//   67  144:new             #56  <Class IllegalArgumentException>
	//   68  147:dup             
	//   69  148:ldc1            #102 <String "ReadablePartial objects must not be null">
	//   70  150:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   71  153:athrow          
		}
	}

	protected static int standardPeriodIn(ReadablePeriod readableperiod, long l)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(readableperiod == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return 0;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		ISOChronology isochronology = ISOChronology.getInstanceUTC();
	//    6    8:invokestatic    #110 <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    7   11:astore          10
		long l1;
		long l2;
		for(l1 = 0L; i < readableperiod.size(); l1 = l2)
	//*   8   13:lconst_0        
	//*   9   14:lstore          5
	//*  10   16:iload_3         
	//*  11   17:aload_0         
	//*  12   18:invokeinterface #111 <Method int ReadablePeriod.size()>
	//*  13   23:icmpge          150
		{
			int j = readableperiod.getValue(i);
	//   14   26:aload_0         
	//   15   27:iload_3         
	//   16   28:invokeinterface #115 <Method int ReadablePeriod.getValue(int)>
	//   17   33:istore          4
			l2 = l1;
	//   18   35:lload           5
	//   19   37:lstore          7
			if(j != 0)
	//*  20   39:iload           4
	//*  21   41:ifeq            139
			{
				DurationField durationfield = readableperiod.getFieldType(i).getField(((Chronology) (isochronology)));
	//   22   44:aload_0         
	//   23   45:iload_3         
	//   24   46:invokeinterface #118 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   25   51:aload           10
	//   26   53:invokevirtual   #42  <Method DurationField DurationFieldType.getField(Chronology)>
	//   27   56:astore          9
				if(!durationfield.isPrecise())
	//*  28   58:aload           9
	//*  29   60:invokevirtual   #122 <Method boolean DurationField.isPrecise()>
	//*  30   63:ifne            122
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   31   66:new             #124 <Class StringBuilder>
	//   32   69:dup             
	//   33   70:invokespecial   #125 <Method void StringBuilder()>
	//   34   73:astore          10
					stringbuilder.append("Cannot convert period to duration as ");
	//   35   75:aload           10
	//   36   77:ldc1            #127 <String "Cannot convert period to duration as ">
	//   37   79:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:pop             
					stringbuilder.append(durationfield.getName());
	//   39   83:aload           10
	//   40   85:aload           9
	//   41   87:invokevirtual   #135 <Method String DurationField.getName()>
	//   42   90:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
					stringbuilder.append(" is not precise in the period ");
	//   44   94:aload           10
	//   45   96:ldc1            #137 <String " is not precise in the period ">
	//   46   98:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
					stringbuilder.append(((Object) (readableperiod)));
	//   48  102:aload           10
	//   49  104:aload_0         
	//   50  105:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   51  108:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   52  109:new             #56  <Class IllegalArgumentException>
	//   53  112:dup             
	//   54  113:aload           10
	//   55  115:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   56  118:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   57  121:athrow          
				}
				l2 = FieldUtils.safeAdd(l1, FieldUtils.safeMultiply(durationfield.getUnitMillis(), j));
	//   58  122:lload           5
	//   59  124:aload           9
	//   60  126:invokevirtual   #146 <Method long DurationField.getUnitMillis()>
	//   61  129:iload           4
	//   62  131:invokestatic    #152 <Method long FieldUtils.safeMultiply(long, int)>
	//   63  134:invokestatic    #156 <Method long FieldUtils.safeAdd(long, long)>
	//   64  137:lstore          7
			}
			i++;
	//   65  139:iload_3         
	//   66  140:iconst_1        
	//   67  141:iadd            
	//   68  142:istore_3        
		}

	//   69  143:lload           7
	//   70  145:lstore          5
	//*  71  147:goto            16
		return FieldUtils.safeToInt(l1 / l);
	//   72  150:lload           5
	//   73  152:lload_1         
	//   74  153:ldiv            
	//   75  154:invokestatic    #160 <Method int FieldUtils.safeToInt(long)>
	//   76  157:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((BaseSingleFieldPeriod)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class BaseSingleFieldPeriod>
	//    3    5:invokevirtual   #165 <Method int compareTo(BaseSingleFieldPeriod)>
	//    4    8:ireturn         
	}

	public int compareTo(BaseSingleFieldPeriod basesinglefieldperiod)
	{
		if(((Object) (basesinglefieldperiod)).getClass() != ((Object)this).getClass())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #169 <Method Class Object.getClass()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #169 <Method Class Object.getClass()>
	//*   4    8:if_acmpeq       61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #124 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #125 <Method void StringBuilder()>
	//    8   18:astore          4
			stringbuilder.append(((Object) (((Object)this).getClass())));
	//    9   20:aload           4
	//   10   22:aload_0         
	//   11   23:invokevirtual   #169 <Method Class Object.getClass()>
	//   12   26:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:pop             
			stringbuilder.append(" cannot be compared to ");
	//   14   30:aload           4
	//   15   32:ldc1            #171 <String " cannot be compared to ">
	//   16   34:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder.append(((Object) (((Object) (basesinglefieldperiod)).getClass())));
	//   18   38:aload           4
	//   19   40:aload_1         
	//   20   41:invokevirtual   #169 <Method Class Object.getClass()>
	//   21   44:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   22   47:pop             
			throw new ClassCastException(stringbuilder.toString());
	//   23   48:new             #173 <Class ClassCastException>
	//   24   51:dup             
	//   25   52:aload           4
	//   26   54:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   27   57:invokespecial   #174 <Method void ClassCastException(String)>
	//   28   60:athrow          
		}
		int i = basesinglefieldperiod.getValue();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #176 <Method int getValue()>
	//   31   65:istore_2        
		int j = getValue();
	//   32   66:aload_0         
	//   33   67:invokevirtual   #176 <Method int getValue()>
	//   34   70:istore_3        
		if(j > i)
	//*  35   71:iload_3         
	//*  36   72:iload_2         
	//*  37   73:icmple          78
			return 1;
	//   38   76:iconst_1        
	//   39   77:ireturn         
		return j >= i ? 0 : -1;
	//   40   78:iload_3         
	//   41   79:iload_2         
	//   42   80:icmpge          85
	//   43   83:iconst_m1       
	//   44   84:ireturn         
	//   45   85:iconst_0        
	//   46   86:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ReadablePeriod))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #7   <Class ReadablePeriod>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ReadablePeriod)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #7   <Class ReadablePeriod>
	//   12   20:astore_1        
		return ((ReadablePeriod) (obj)).getPeriodType() == getPeriodType() && ((ReadablePeriod) (obj)).getValue(0) == getValue();
	//   13   21:aload_1         
	//   14   22:invokeinterface #182 <Method PeriodType ReadablePeriod.getPeriodType()>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #183 <Method PeriodType getPeriodType()>
	//   17   31:if_acmpne       50
	//   18   34:aload_1         
	//   19   35:iconst_0        
	//   20   36:invokeinterface #115 <Method int ReadablePeriod.getValue(int)>
	//   21   41:aload_0         
	//   22   42:invokevirtual   #176 <Method int getValue()>
	//   23   45:icmpne          50
	//   24   48:iconst_1        
	//   25   49:ireturn         
	//   26   50:iconst_0        
	//   27   51:ireturn         
	}

	public int get(DurationFieldType durationfieldtype)
	{
		if(durationfieldtype == getFieldType())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #187 <Method DurationFieldType getFieldType()>
	//*   3    5:if_acmpne       13
			return getValue();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #176 <Method int getValue()>
	//    6   12:ireturn         
		else
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public abstract DurationFieldType getFieldType();

	public DurationFieldType getFieldType(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			throw new IndexOutOfBoundsException(String.valueOf(i));
	//    2    4:new             #189 <Class IndexOutOfBoundsException>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokestatic    #195 <Method String String.valueOf(int)>
	//    6   12:invokespecial   #196 <Method void IndexOutOfBoundsException(String)>
	//    7   15:athrow          
		else
			return getFieldType();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #187 <Method DurationFieldType getFieldType()>
	//   10   20:areturn         
	}

	public abstract PeriodType getPeriodType();

	protected int getValue()
	{
		return iPeriod;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int iPeriod>
	//    2    4:ireturn         
	}

	public int getValue(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			throw new IndexOutOfBoundsException(String.valueOf(i));
	//    2    4:new             #189 <Class IndexOutOfBoundsException>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokestatic    #195 <Method String String.valueOf(int)>
	//    6   12:invokespecial   #196 <Method void IndexOutOfBoundsException(String)>
	//    7   15:athrow          
		else
			return getValue();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #176 <Method int getValue()>
	//   10   20:ireturn         
	}

	public int hashCode()
	{
		return 27 * (459 + getValue()) + ((Object) (getFieldType())).hashCode();
	//    0    0:bipush          27
	//    1    2:sipush          459
	//    2    5:aload_0         
	//    3    6:invokevirtual   #176 <Method int getValue()>
	//    4    9:iadd            
	//    5   10:imul            
	//    6   11:aload_0         
	//    7   12:invokevirtual   #187 <Method DurationFieldType getFieldType()>
	//    8   15:invokevirtual   #199 <Method int Object.hashCode()>
	//    9   18:iadd            
	//   10   19:ireturn         
	}

	public boolean isSupported(DurationFieldType durationfieldtype)
	{
		return durationfieldtype == getFieldType();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #187 <Method DurationFieldType getFieldType()>
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected void setValue(int i)
	{
		iPeriod = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int iPeriod>
	//    3    5:return          
	}

	public int size()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public MutablePeriod toMutablePeriod()
	{
		MutablePeriod mutableperiod = new MutablePeriod();
	//    0    0:new             #206 <Class MutablePeriod>
	//    1    3:dup             
	//    2    4:invokespecial   #207 <Method void MutablePeriod()>
	//    3    7:astore_1        
		mutableperiod.add(((ReadablePeriod) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method void MutablePeriod.add(ReadablePeriod)>
		return mutableperiod;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public Period toPeriod()
	{
		return Period.ZERO.withFields(((ReadablePeriod) (this)));
	//    0    0:getstatic       #219 <Field Period Period.ZERO>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #223 <Method Period Period.withFields(ReadablePeriod)>
	//    3    7:areturn         
	}

	private static final long START_1972 = 0xaf625800L;
	private static final long serialVersionUID = 0x8d4e461cL;
	private volatile int iPeriod;
}
