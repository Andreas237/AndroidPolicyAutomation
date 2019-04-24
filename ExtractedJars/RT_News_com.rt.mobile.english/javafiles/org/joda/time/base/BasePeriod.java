// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.*;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.base:
//			AbstractPeriod, BaseLocal

public abstract class BasePeriod extends AbstractPeriod
	implements ReadablePeriod, Serializable
{

	protected BasePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		iType = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload           9
	//    5    8:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    6   11:putfield        #36  <Field PeriodType iType>
		iValues = setPeriodInternal(i, j, k, l, i1, j1, k1, l1);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:iload_1         
	//   10   17:iload_2         
	//   11   18:iload_3         
	//   12   19:iload           4
	//   13   21:iload           5
	//   14   23:iload           6
	//   15   25:iload           7
	//   16   27:iload           8
	//   17   29:invokespecial   #40  <Method int[] setPeriodInternal(int, int, int, int, int, int, int, int)>
	//   18   32:putfield        #42  <Field int[] iValues>
	//   19   35:return          
	}

	protected BasePeriod(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		iType = PeriodType.standard();
	//    2    4:aload_0         
	//    3    5:invokestatic    #49  <Method PeriodType PeriodType.standard()>
	//    4    8:putfield        #36  <Field PeriodType iType>
		int ai[] = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, l);
	//    5   11:invokestatic    #55  <Method ISOChronology ISOChronology.getInstanceUTC()>
	//    6   14:getstatic       #27  <Field ReadablePeriod DUMMY_PERIOD>
	//    7   17:lload_1         
	//    8   18:invokevirtual   #59  <Method int[] ISOChronology.get(ReadablePeriod, long)>
	//    9   21:astore_3        
		iValues = new int[8];
	//   10   22:aload_0         
	//   11   23:bipush          8
	//   12   25:newarray        int[]
	//   13   27:putfield        #42  <Field int[] iValues>
		System.arraycopy(((Object) (ai)), 0, ((Object) (iValues)), 4, 4);
	//   14   30:aload_3         
	//   15   31:iconst_0        
	//   16   32:aload_0         
	//   17   33:getfield        #42  <Field int[] iValues>
	//   18   36:iconst_4        
	//   19   37:iconst_4        
	//   20   38:invokestatic    #65  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   21   41:return          
	}

	protected BasePeriod(long l, long l1, PeriodType periodtype, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		periodtype = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    5   10:astore          5
		chronology = DateTimeUtils.getChronology(chronology);
	//    6   12:aload           6
	//    7   14:invokestatic    #72  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    8   17:astore          6
		iType = periodtype;
	//    9   19:aload_0         
	//   10   20:aload           5
	//   11   22:putfield        #36  <Field PeriodType iType>
		iValues = chronology.get(((ReadablePeriod) (this)), l, l1);
	//   12   25:aload_0         
	//   13   26:aload           6
	//   14   28:aload_0         
	//   15   29:lload_1         
	//   16   30:lload_3         
	//   17   31:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   18   34:putfield        #42  <Field int[] iValues>
	//   19   37:return          
	}

	protected BasePeriod(long l, PeriodType periodtype, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		periodtype = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    5    9:astore_3        
		chronology = DateTimeUtils.getChronology(chronology);
	//    6   10:aload           4
	//    7   12:invokestatic    #72  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    8   15:astore          4
		iType = periodtype;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #36  <Field PeriodType iType>
		iValues = chronology.get(((ReadablePeriod) (this)), l);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:aload_0         
	//   15   26:lload_1         
	//   16   27:invokevirtual   #79  <Method int[] Chronology.get(ReadablePeriod, long)>
	//   17   30:putfield        #42  <Field int[] iValues>
	//   18   33:return          
	}

	protected BasePeriod(Object obj, PeriodType periodtype, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		PeriodConverter periodconverter = ConverterManager.getInstance().getPeriodConverter(obj);
	//    2    4:invokestatic    #86  <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #90  <Method PeriodConverter ConverterManager.getPeriodConverter(Object)>
	//    5   11:astore          5
		PeriodType periodtype1 = periodtype;
	//    6   13:aload_2         
	//    7   14:astore          4
		if(periodtype == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       30
			periodtype1 = periodconverter.getPeriodType(obj);
	//   10   20:aload           5
	//   11   22:aload_1         
	//   12   23:invokeinterface #96  <Method PeriodType PeriodConverter.getPeriodType(Object)>
	//   13   28:astore          4
		periodtype = checkPeriodType(periodtype1);
	//   14   30:aload_0         
	//   15   31:aload           4
	//   16   33:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//   17   36:astore_2        
		iType = periodtype;
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:putfield        #36  <Field PeriodType iType>
		if(this instanceof ReadWritablePeriod)
	//*  21   42:aload_0         
	//*  22   43:instanceof      #98  <Class ReadWritablePeriod>
	//*  23   46:ifeq            78
		{
			iValues = new int[size()];
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:invokevirtual   #102 <Method int size()>
	//   27   54:newarray        int[]
	//   28   56:putfield        #42  <Field int[] iValues>
			periodtype = ((PeriodType) (DateTimeUtils.getChronology(chronology)));
	//   29   59:aload_3         
	//   30   60:invokestatic    #72  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   31   63:astore_2        
			periodconverter.setInto((ReadWritablePeriod)this, obj, ((Chronology) (periodtype)));
	//   32   64:aload           5
	//   33   66:aload_0         
	//   34   67:checkcast       #98  <Class ReadWritablePeriod>
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:invokeinterface #106 <Method void PeriodConverter.setInto(ReadWritablePeriod, Object, Chronology)>
			return;
	//   38   77:return          
		} else
		{
			iValues = (new MutablePeriod(obj, periodtype, chronology)).getValues();
	//   39   78:aload_0         
	//   40   79:new             #108 <Class MutablePeriod>
	//   41   82:dup             
	//   42   83:aload_1         
	//   43   84:aload_2         
	//   44   85:aload_3         
	//   45   86:invokespecial   #110 <Method void MutablePeriod(Object, PeriodType, Chronology)>
	//   46   89:invokevirtual   #114 <Method int[] MutablePeriod.getValues()>
	//   47   92:putfield        #42  <Field int[] iValues>
			return;
	//   48   95:return          
		}
	}

	protected BasePeriod(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		periodtype = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    5    9:astore_3        
		long l1 = DateTimeUtils.getDurationMillis(readableduration);
	//    6   10:aload_1         
	//    7   11:invokestatic    #119 <Method long DateTimeUtils.getDurationMillis(ReadableDuration)>
	//    8   14:lstore          6
		long l = DateTimeUtils.getInstantMillis(readableinstant);
	//    9   16:aload_2         
	//   10   17:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   11   20:lstore          4
		l1 = FieldUtils.safeSubtract(l, l1);
	//   12   22:lload           4
	//   13   24:lload           6
	//   14   26:invokestatic    #129 <Method long FieldUtils.safeSubtract(long, long)>
	//   15   29:lstore          6
		readableduration = ((ReadableDuration) (DateTimeUtils.getInstantChronology(readableinstant)));
	//   16   31:aload_2         
	//   17   32:invokestatic    #133 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//   18   35:astore_1        
		iType = periodtype;
	//   19   36:aload_0         
	//   20   37:aload_3         
	//   21   38:putfield        #36  <Field PeriodType iType>
		iValues = ((Chronology) (readableduration)).get(((ReadablePeriod) (this)), l1, l);
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:lload           6
	//   26   46:lload           4
	//   27   48:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   28   51:putfield        #42  <Field int[] iValues>
	//   29   54:return          
	}

	protected BasePeriod(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		periodtype = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    5    9:astore_3        
		long l = DateTimeUtils.getInstantMillis(readableinstant);
	//    6   10:aload_1         
	//    7   11:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    8   14:lstore          4
		long l1 = FieldUtils.safeAdd(l, DateTimeUtils.getDurationMillis(readableduration));
	//    9   16:lload           4
	//   10   18:aload_2         
	//   11   19:invokestatic    #119 <Method long DateTimeUtils.getDurationMillis(ReadableDuration)>
	//   12   22:invokestatic    #137 <Method long FieldUtils.safeAdd(long, long)>
	//   13   25:lstore          6
		readableinstant = ((ReadableInstant) (DateTimeUtils.getInstantChronology(readableinstant)));
	//   14   27:aload_1         
	//   15   28:invokestatic    #133 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//   16   31:astore_1        
		iType = periodtype;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #36  <Field PeriodType iType>
		iValues = ((Chronology) (readableinstant)).get(((ReadablePeriod) (this)), l, l1);
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:lload           4
	//   24   42:lload           6
	//   25   44:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   26   47:putfield        #42  <Field int[] iValues>
	//   27   50:return          
	}

	protected BasePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		periodtype = checkPeriodType(periodtype);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//    5    9:astore_3        
		if(readableinstant == null && readableinstant1 == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       34
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       34
		{
			iType = periodtype;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #36  <Field PeriodType iType>
			iValues = new int[size()];
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #102 <Method int size()>
	//   16   28:newarray        int[]
	//   17   30:putfield        #42  <Field int[] iValues>
			return;
	//   18   33:return          
		} else
		{
			long l = DateTimeUtils.getInstantMillis(readableinstant);
	//   19   34:aload_1         
	//   20   35:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   21   38:lstore          4
			long l1 = DateTimeUtils.getInstantMillis(readableinstant1);
	//   22   40:aload_2         
	//   23   41:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//   24   44:lstore          6
			readableinstant = ((ReadableInstant) (DateTimeUtils.getIntervalChronology(readableinstant, readableinstant1)));
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokestatic    #142 <Method Chronology DateTimeUtils.getIntervalChronology(ReadableInstant, ReadableInstant)>
	//   28   51:astore_1        
			iType = periodtype;
	//   29   52:aload_0         
	//   30   53:aload_3         
	//   31   54:putfield        #36  <Field PeriodType iType>
			iValues = ((Chronology) (readableinstant)).get(((ReadablePeriod) (this)), l, l1);
	//   32   57:aload_0         
	//   33   58:aload_1         
	//   34   59:aload_0         
	//   35   60:lload           4
	//   36   62:lload           6
	//   37   64:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   38   67:putfield        #42  <Field int[] iValues>
			return;
	//   39   70:return          
		}
	}

	protected BasePeriod(ReadablePartial readablepartial, ReadablePartial readablepartial1, PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		if(readablepartial != null && readablepartial1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          235
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       15
	//*   6   12:goto            235
		{
			if((readablepartial instanceof BaseLocal) && (readablepartial1 instanceof BaseLocal) && ((Object) (readablepartial)).getClass() == ((Object) (readablepartial1)).getClass())
	//*   7   15:aload_1         
	//*   8   16:instanceof      #145 <Class BaseLocal>
	//*   9   19:ifeq            93
	//*  10   22:aload_2         
	//*  11   23:instanceof      #145 <Class BaseLocal>
	//*  12   26:ifeq            93
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #151 <Method Class Object.getClass()>
	//*  15   33:aload_2         
	//*  16   34:invokevirtual   #151 <Method Class Object.getClass()>
	//*  17   37:if_acmpne       93
			{
				periodtype = checkPeriodType(periodtype);
	//   18   40:aload_0         
	//   19   41:aload_3         
	//   20   42:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//   21   45:astore_3        
				long l = ((BaseLocal)readablepartial).getLocalMillis();
	//   22   46:aload_1         
	//   23   47:checkcast       #145 <Class BaseLocal>
	//   24   50:invokevirtual   #155 <Method long BaseLocal.getLocalMillis()>
	//   25   53:lstore          6
				long l1 = ((BaseLocal)readablepartial1).getLocalMillis();
	//   26   55:aload_2         
	//   27   56:checkcast       #145 <Class BaseLocal>
	//   28   59:invokevirtual   #155 <Method long BaseLocal.getLocalMillis()>
	//   29   62:lstore          8
				readablepartial = ((ReadablePartial) (DateTimeUtils.getChronology(readablepartial.getChronology())));
	//   30   64:aload_1         
	//   31   65:invokeinterface #160 <Method Chronology ReadablePartial.getChronology()>
	//   32   70:invokestatic    #72  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   33   73:astore_1        
				iType = periodtype;
	//   34   74:aload_0         
	//   35   75:aload_3         
	//   36   76:putfield        #36  <Field PeriodType iType>
				iValues = ((Chronology) (readablepartial)).get(((ReadablePeriod) (this)), l, l1);
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:lload           6
	//   41   84:lload           8
	//   42   86:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//   43   89:putfield        #42  <Field int[] iValues>
				return;
	//   44   92:return          
			}
			if(readablepartial.size() != readablepartial1.size())
	//*  45   93:aload_1         
	//*  46   94:invokeinterface #161 <Method int ReadablePartial.size()>
	//*  47   99:aload_2         
	//*  48  100:invokeinterface #161 <Method int ReadablePartial.size()>
	//*  49  105:icmpeq          118
				throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   50  108:new             #163 <Class IllegalArgumentException>
	//   51  111:dup             
	//   52  112:ldc1            #165 <String "ReadablePartial objects must have the same set of fields">
	//   53  114:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   54  117:athrow          
			int i = 0;
	//   55  118:iconst_0        
	//   56  119:istore          4
			for(int j = readablepartial.size(); i < j; i++)
	//*  57  121:aload_1         
	//*  58  122:invokeinterface #161 <Method int ReadablePartial.size()>
	//*  59  127:istore          5
	//*  60  129:iload           4
	//*  61  131:iload           5
	//*  62  133:icmpge          174
				if(readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
	//*  63  136:aload_1         
	//*  64  137:iload           4
	//*  65  139:invokeinterface #172 <Method org.joda.time.DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  66  144:aload_2         
	//*  67  145:iload           4
	//*  68  147:invokeinterface #172 <Method org.joda.time.DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  69  152:if_acmpeq       165
					throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
	//   70  155:new             #163 <Class IllegalArgumentException>
	//   71  158:dup             
	//   72  159:ldc1            #165 <String "ReadablePartial objects must have the same set of fields">
	//   73  161:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   74  164:athrow          

	//   75  165:iload           4
	//   76  167:iconst_1        
	//   77  168:iadd            
	//   78  169:istore          4
	//*  79  171:goto            129
			if(!DateTimeUtils.isContiguous(readablepartial))
	//*  80  174:aload_1         
	//*  81  175:invokestatic    #176 <Method boolean DateTimeUtils.isContiguous(ReadablePartial)>
	//*  82  178:ifne            191
			{
				throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
	//   83  181:new             #163 <Class IllegalArgumentException>
	//   84  184:dup             
	//   85  185:ldc1            #178 <String "ReadablePartial objects must be contiguous">
	//   86  187:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   87  190:athrow          
			} else
			{
				iType = checkPeriodType(periodtype);
	//   88  191:aload_0         
	//   89  192:aload_0         
	//   90  193:aload_3         
	//   91  194:invokevirtual   #34  <Method PeriodType checkPeriodType(PeriodType)>
	//   92  197:putfield        #36  <Field PeriodType iType>
				periodtype = ((PeriodType) (DateTimeUtils.getChronology(readablepartial.getChronology()).withUTC()));
	//   93  200:aload_1         
	//   94  201:invokeinterface #160 <Method Chronology ReadablePartial.getChronology()>
	//   95  206:invokestatic    #72  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   96  209:invokevirtual   #181 <Method Chronology Chronology.withUTC()>
	//   97  212:astore_3        
				iValues = ((Chronology) (periodtype)).get(((ReadablePeriod) (this)), ((Chronology) (periodtype)).set(readablepartial, 0L), ((Chronology) (periodtype)).set(readablepartial1, 0L));
	//   98  213:aload_0         
	//   99  214:aload_3         
	//  100  215:aload_0         
	//  101  216:aload_3         
	//  102  217:aload_1         
	//  103  218:lconst_0        
	//  104  219:invokevirtual   #185 <Method long Chronology.set(ReadablePartial, long)>
	//  105  222:aload_3         
	//  106  223:aload_2         
	//  107  224:lconst_0        
	//  108  225:invokevirtual   #185 <Method long Chronology.set(ReadablePartial, long)>
	//  109  228:invokevirtual   #77  <Method int[] Chronology.get(ReadablePeriod, long, long)>
	//  110  231:putfield        #42  <Field int[] iValues>
				return;
	//  111  234:return          
			}
		} else
		{
			throw new IllegalArgumentException("ReadablePartial objects must not be null");
	//  112  235:new             #163 <Class IllegalArgumentException>
	//  113  238:dup             
	//  114  239:ldc1            #187 <String "ReadablePartial objects must not be null">
	//  115  241:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//  116  244:athrow          
		}
	}

	protected BasePeriod(int ai[], PeriodType periodtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractPeriod()>
		iType = periodtype;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #36  <Field PeriodType iType>
		iValues = ai;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #42  <Field int[] iValues>
	//    8   14:return          
	}

	private void checkAndUpdate(DurationFieldType durationfieldtype, int ai[], int i)
	{
		int j = indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method int indexOf(DurationFieldType)>
	//    3    5:istore          4
		if(j == -1)
	//*   4    7:iload           4
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          60
		{
			if(i != 0)
	//*   7   13:iload_3         
	//*   8   14:ifeq            65
			{
				ai = ((int []) (new StringBuilder()));
	//    9   17:new             #196 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #197 <Method void StringBuilder()>
	//   12   24:astore_2        
				((StringBuilder) (ai)).append("Period does not support field '");
	//   13   25:aload_2         
	//   14   26:ldc1            #199 <String "Period does not support field '">
	//   15   28:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
				((StringBuilder) (ai)).append(durationfieldtype.getName());
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #209 <Method String DurationFieldType.getName()>
	//   20   37:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				((StringBuilder) (ai)).append("'");
	//   22   41:aload_2         
	//   23   42:ldc1            #211 <String "'">
	//   24   44:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai)).toString());
	//   26   48:new             #163 <Class IllegalArgumentException>
	//   27   51:dup             
	//   28   52:aload_2         
	//   29   53:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   56:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   31   59:athrow          
			}
		} else
		{
			ai[j] = i;
	//   32   60:aload_2         
	//   33   61:iload           4
	//   34   63:iload_3         
	//   35   64:iastore         
		}
	//   36   65:return          
	}

	private void setPeriodInternal(ReadablePeriod readableperiod)
	{
		int ai[] = new int[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int size()>
	//    2    4:newarray        int[]
	//    3    6:astore          4
		int j = readableperiod.size();
	//    4    8:aload_1         
	//    5    9:invokeinterface #216 <Method int ReadablePeriod.size()>
	//    6   14:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:iload_3         
	//*  11   19:icmpge          49
			checkAndUpdate(readableperiod.getFieldType(i), ai, readableperiod.getValue(i));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokeinterface #219 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   16   30:aload           4
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:invokeinterface #223 <Method int ReadablePeriod.getValue(int)>
	//   20   39:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>

	//   21   42:iload_2         
	//   22   43:iconst_1        
	//   23   44:iadd            
	//   24   45:istore_2        
	//*  25   46:goto            17
		setValues(ai);
	//   26   49:aload_0         
	//   27   50:aload           4
	//   28   52:invokevirtual   #229 <Method void setValues(int[])>
	//   29   55:return          
	}

	private int[] setPeriodInternal(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		int ai[] = new int[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int size()>
	//    2    4:newarray        int[]
	//    3    6:astore          9
		checkAndUpdate(DurationFieldType.years(), ai, i);
	//    4    8:aload_0         
	//    5    9:invokestatic    #233 <Method DurationFieldType DurationFieldType.years()>
	//    6   12:aload           9
	//    7   14:iload_1         
	//    8   15:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.months(), ai, j);
	//    9   18:aload_0         
	//   10   19:invokestatic    #236 <Method DurationFieldType DurationFieldType.months()>
	//   11   22:aload           9
	//   12   24:iload_2         
	//   13   25:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.weeks(), ai, k);
	//   14   28:aload_0         
	//   15   29:invokestatic    #239 <Method DurationFieldType DurationFieldType.weeks()>
	//   16   32:aload           9
	//   17   34:iload_3         
	//   18   35:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.days(), ai, l);
	//   19   38:aload_0         
	//   20   39:invokestatic    #242 <Method DurationFieldType DurationFieldType.days()>
	//   21   42:aload           9
	//   22   44:iload           4
	//   23   46:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.hours(), ai, i1);
	//   24   49:aload_0         
	//   25   50:invokestatic    #245 <Method DurationFieldType DurationFieldType.hours()>
	//   26   53:aload           9
	//   27   55:iload           5
	//   28   57:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.minutes(), ai, j1);
	//   29   60:aload_0         
	//   30   61:invokestatic    #248 <Method DurationFieldType DurationFieldType.minutes()>
	//   31   64:aload           9
	//   32   66:iload           6
	//   33   68:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.seconds(), ai, k1);
	//   34   71:aload_0         
	//   35   72:invokestatic    #251 <Method DurationFieldType DurationFieldType.seconds()>
	//   36   75:aload           9
	//   37   77:iload           7
	//   38   79:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		checkAndUpdate(DurationFieldType.millis(), ai, l1);
	//   39   82:aload_0         
	//   40   83:invokestatic    #254 <Method DurationFieldType DurationFieldType.millis()>
	//   41   86:aload           9
	//   42   88:iload           8
	//   43   90:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>
		return ai;
	//   44   93:aload           9
	//   45   95:areturn         
	}

	protected void addField(DurationFieldType durationfieldtype, int i)
	{
		addFieldInto(iValues, durationfieldtype, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field int[] iValues>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #260 <Method void addFieldInto(int[], DurationFieldType, int)>
	//    6   10:return          
	}

	protected void addFieldInto(int ai[], DurationFieldType durationfieldtype, int i)
	{
		int j = indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #194 <Method int indexOf(DurationFieldType)>
	//    3    5:istore          4
		if(j == -1)
	//*   4    7:iload           4
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          61
		{
			if(i != 0 || durationfieldtype == null)
	//*   7   13:iload_3         
	//*   8   14:ifne            21
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       73
			{
				ai = ((int []) (new StringBuilder()));
	//   11   21:new             #196 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #197 <Method void StringBuilder()>
	//   14   28:astore_1        
				((StringBuilder) (ai)).append("Period does not support field '");
	//   15   29:aload_1         
	//   16   30:ldc1            #199 <String "Period does not support field '">
	//   17   32:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
				((StringBuilder) (ai)).append(((Object) (durationfieldtype)));
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #263 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
				((StringBuilder) (ai)).append("'");
	//   23   42:aload_1         
	//   24   43:ldc1            #211 <String "'">
	//   25   45:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai)).toString());
	//   27   49:new             #163 <Class IllegalArgumentException>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   31   57:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   32   60:athrow          
			}
		} else
		{
			ai[j] = FieldUtils.safeAdd(ai[j], i);
	//   33   61:aload_1         
	//   34   62:iload           4
	//   35   64:aload_1         
	//   36   65:iload           4
	//   37   67:iaload          
	//   38   68:iload_3         
	//   39   69:invokestatic    #266 <Method int FieldUtils.safeAdd(int, int)>
	//   40   72:iastore         
		}
	//   41   73:return          
	}

	protected void addPeriod(ReadablePeriod readableperiod)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			setValues(addPeriodInto(getValues(), readableperiod));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #268 <Method int[] getValues()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #272 <Method int[] addPeriodInto(int[], ReadablePeriod)>
	//    8   14:invokevirtual   #229 <Method void setValues(int[])>
	//    9   17:return          
	}

	protected int[] addPeriodInto(int ai[], ReadablePeriod readableperiod)
	{
		int j = readableperiod.size();
	//    0    0:aload_2         
	//    1    1:invokeinterface #216 <Method int ReadablePeriod.size()>
	//    2    6:istore          4
		for(int i = 0; i < j; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_3        
	//*   5   10:iload_3         
	//*   6   11:iload           4
	//*   7   13:icmpge          119
		{
			DurationFieldType durationfieldtype = readableperiod.getFieldType(i);
	//    8   16:aload_2         
	//    9   17:iload_3         
	//   10   18:invokeinterface #219 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   11   23:astore          7
			int k = readableperiod.getValue(i);
	//   12   25:aload_2         
	//   13   26:iload_3         
	//   14   27:invokeinterface #223 <Method int ReadablePeriod.getValue(int)>
	//   15   32:istore          5
			if(k == 0)
				continue;
	//   16   34:iload           5
	//   17   36:ifeq            112
			int l = indexOf(durationfieldtype);
	//   18   39:aload_0         
	//   19   40:aload           7
	//   20   42:invokevirtual   #194 <Method int indexOf(DurationFieldType)>
	//   21   45:istore          6
			if(l == -1)
	//*  22   47:iload           6
	//*  23   49:iconst_m1       
	//*  24   50:icmpne          97
			{
				ai = ((int []) (new StringBuilder()));
	//   25   53:new             #196 <Class StringBuilder>
	//   26   56:dup             
	//   27   57:invokespecial   #197 <Method void StringBuilder()>
	//   28   60:astore_1        
				((StringBuilder) (ai)).append("Period does not support field '");
	//   29   61:aload_1         
	//   30   62:ldc1            #199 <String "Period does not support field '">
	//   31   64:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
				((StringBuilder) (ai)).append(durationfieldtype.getName());
	//   33   68:aload_1         
	//   34   69:aload           7
	//   35   71:invokevirtual   #209 <Method String DurationFieldType.getName()>
	//   36   74:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
				((StringBuilder) (ai)).append("'");
	//   38   78:aload_1         
	//   39   79:ldc1            #211 <String "'">
	//   40   81:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai)).toString());
	//   42   85:new             #163 <Class IllegalArgumentException>
	//   43   88:dup             
	//   44   89:aload_1         
	//   45   90:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   46   93:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   47   96:athrow          
			}
			ai[l] = FieldUtils.safeAdd(getValue(l), k);
	//   48   97:aload_1         
	//   49   98:iload           6
	//   50  100:aload_0         
	//   51  101:iload           6
	//   52  103:invokevirtual   #273 <Method int getValue(int)>
	//   53  106:iload           5
	//   54  108:invokestatic    #266 <Method int FieldUtils.safeAdd(int, int)>
	//   55  111:iastore         
		}

	//   56  112:iload_3         
	//   57  113:iconst_1        
	//   58  114:iadd            
	//   59  115:istore_3        
	//*  60  116:goto            10
		return ai;
	//   61  119:aload_1         
	//   62  120:areturn         
	}

	protected PeriodType checkPeriodType(PeriodType periodtype)
	{
		return DateTimeUtils.getPeriodType(periodtype);
	//    0    0:aload_1         
	//    1    1:invokestatic    #275 <Method PeriodType DateTimeUtils.getPeriodType(PeriodType)>
	//    2    4:areturn         
	}

	public PeriodType getPeriodType()
	{
		return iType;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PeriodType iType>
	//    2    4:areturn         
	}

	public int getValue(int i)
	{
		return iValues[i];
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int[] iValues>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	protected void mergePeriod(ReadablePeriod readableperiod)
	{
		if(readableperiod != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			setValues(mergePeriodInto(getValues(), readableperiod));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #268 <Method int[] getValues()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #279 <Method int[] mergePeriodInto(int[], ReadablePeriod)>
	//    8   14:invokevirtual   #229 <Method void setValues(int[])>
	//    9   17:return          
	}

	protected int[] mergePeriodInto(int ai[], ReadablePeriod readableperiod)
	{
		int j = readableperiod.size();
	//    0    0:aload_2         
	//    1    1:invokeinterface #216 <Method int ReadablePeriod.size()>
	//    2    6:istore          4
		for(int i = 0; i < j; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_3        
	//*   5   10:iload_3         
	//*   6   11:iload           4
	//*   7   13:icmpge          42
			checkAndUpdate(readableperiod.getFieldType(i), ai, readableperiod.getValue(i));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:invokeinterface #219 <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:iload_3         
	//   15   27:invokeinterface #223 <Method int ReadablePeriod.getValue(int)>
	//   16   32:invokespecial   #225 <Method void checkAndUpdate(DurationFieldType, int[], int)>

	//   17   35:iload_3         
	//   18   36:iconst_1        
	//   19   37:iadd            
	//   20   38:istore_3        
	//*  21   39:goto            10
		return ai;
	//   22   42:aload_1         
	//   23   43:areturn         
	}

	protected void setField(DurationFieldType durationfieldtype, int i)
	{
		setFieldInto(iValues, durationfieldtype, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field int[] iValues>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #283 <Method void setFieldInto(int[], DurationFieldType, int)>
	//    6   10:return          
	}

	protected void setFieldInto(int ai[], DurationFieldType durationfieldtype, int i)
	{
		int j = indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #194 <Method int indexOf(DurationFieldType)>
	//    3    5:istore          4
		if(j == -1)
	//*   4    7:iload           4
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          61
		{
			if(i != 0 || durationfieldtype == null)
	//*   7   13:iload_3         
	//*   8   14:ifne            21
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       66
			{
				ai = ((int []) (new StringBuilder()));
	//   11   21:new             #196 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #197 <Method void StringBuilder()>
	//   14   28:astore_1        
				((StringBuilder) (ai)).append("Period does not support field '");
	//   15   29:aload_1         
	//   16   30:ldc1            #199 <String "Period does not support field '">
	//   17   32:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
				((StringBuilder) (ai)).append(((Object) (durationfieldtype)));
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #263 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
				((StringBuilder) (ai)).append("'");
	//   23   42:aload_1         
	//   24   43:ldc1            #211 <String "'">
	//   25   45:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai)).toString());
	//   27   49:new             #163 <Class IllegalArgumentException>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   31   57:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   32   60:athrow          
			}
		} else
		{
			ai[j] = i;
	//   33   61:aload_1         
	//   34   62:iload           4
	//   35   64:iload_3         
	//   36   65:iastore         
		}
	//   37   66:return          
	}

	protected void setPeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		setValues(setPeriodInternal(i, j, k, l, i1, j1, k1, l1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:iload           5
	//    7    9:iload           6
	//    8   11:iload           7
	//    9   13:iload           8
	//   10   15:invokespecial   #40  <Method int[] setPeriodInternal(int, int, int, int, int, int, int, int)>
	//   11   18:invokevirtual   #229 <Method void setValues(int[])>
	//   12   21:return          
	}

	protected void setPeriod(ReadablePeriod readableperiod)
	{
		if(readableperiod == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			setValues(new int[size()]);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #102 <Method int size()>
	//    5    9:newarray        int[]
	//    6   11:invokevirtual   #229 <Method void setValues(int[])>
			return;
	//    7   14:return          
		} else
		{
			setPeriodInternal(readableperiod);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #287 <Method void setPeriodInternal(ReadablePeriod)>
			return;
	//   11   20:return          
		}
	}

	protected void setValue(int i, int j)
	{
		iValues[i] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int[] iValues>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iastore         
	//    5    7:return          
	}

	protected void setValues(int ai[])
	{
		System.arraycopy(((Object) (ai)), 0, ((Object) (iValues)), 0, iValues.length);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field int[] iValues>
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field int[] iValues>
	//    7   11:arraylength     
	//    8   12:invokestatic    #65  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    9   15:return          
	}

	public Duration toDurationFrom(ReadableInstant readableinstant)
	{
		long l = DateTimeUtils.getInstantMillis(readableinstant);
	//    0    0:aload_1         
	//    1    1:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    2    4:lstore_2        
		return new Duration(l, DateTimeUtils.getInstantChronology(readableinstant).add(((ReadablePeriod) (this)), l, 1));
	//    3    5:new             #293 <Class Duration>
	//    4    8:dup             
	//    5    9:lload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #133 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//    8   14:aload_0         
	//    9   15:lload_2         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #297 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   12   20:invokespecial   #300 <Method void Duration(long, long)>
	//   13   23:areturn         
	}

	public Duration toDurationTo(ReadableInstant readableinstant)
	{
		long l = DateTimeUtils.getInstantMillis(readableinstant);
	//    0    0:aload_1         
	//    1    1:invokestatic    #123 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    2    4:lstore_2        
		return new Duration(DateTimeUtils.getInstantChronology(readableinstant).add(((ReadablePeriod) (this)), l, -1), l);
	//    3    5:new             #293 <Class Duration>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #133 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//    7   13:aload_0         
	//    8   14:lload_2         
	//    9   15:iconst_m1       
	//   10   16:invokevirtual   #297 <Method long Chronology.add(ReadablePeriod, long, int)>
	//   11   19:lload_2         
	//   12   20:invokespecial   #300 <Method void Duration(long, long)>
	//   13   23:areturn         
	}

	private static final ReadablePeriod DUMMY_PERIOD = new _cls1();
	private static final long serialVersionUID = 0x2628cc87L;
	private final PeriodType iType;
	private final int iValues[];

	static 
	{
	//    0    0:new             #22  <Class BasePeriod$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void BasePeriod$1()>
	//    3    7:putstatic       #27  <Field ReadablePeriod DUMMY_PERIOD>
	//*   4   10:return          
	}

	/* member class not found */
	class _cls1 {}

}
