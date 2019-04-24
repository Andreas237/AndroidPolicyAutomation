// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.*;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

// Referenced classes of package org.joda.time.base:
//			AbstractDateTime

public abstract class BaseDateTime extends AbstractDateTime
	implements ReadableDateTime, Serializable
{

	public BaseDateTime()
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:invokestatic    #29  <Method ISOChronology ISOChronology.getInstance()>
	//    3    7:invokespecial   #32  <Method void BaseDateTime(long, Chronology)>
	//    4   10:return          
	}

	public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:invokestatic    #29  <Method ISOChronology ISOChronology.getInstance()>
	//    9   15:invokespecial   #37  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   10   18:return          
	}

	public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
			Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractDateTime()>
		iChronology = checkChronology(chronology);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload           8
	//    5    8:invokevirtual   #43  <Method Chronology checkChronology(Chronology)>
	//    6   11:putfield        #45  <Field Chronology iChronology>
		iMillis = checkInstant(iChronology.getDateTimeMillis(i, j, k, l, i1, j1, k1), iChronology);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #45  <Field Chronology iChronology>
	//   11   20:iload_1         
	//   12   21:iload_2         
	//   13   22:iload_3         
	//   14   23:iload           4
	//   15   25:iload           5
	//   16   27:iload           6
	//   17   29:iload           7
	//   18   31:invokevirtual   #51  <Method long Chronology.getDateTimeMillis(int, int, int, int, int, int, int)>
	//   19   34:aload_0         
	//   20   35:getfield        #45  <Field Chronology iChronology>
	//   21   38:invokevirtual   #55  <Method long checkInstant(long, Chronology)>
	//   22   41:putfield        #57  <Field long iMillis>
	//   23   44:return          
	}

	public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
			DateTimeZone datetimezone)
	{
		this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:invokestatic    #61  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//   10   17:invokespecial   #37  <Method void BaseDateTime(int, int, int, int, int, int, int, Chronology)>
	//   11   20:return          
	}

	public BaseDateTime(long l)
	{
		this(l, ((Chronology) (ISOChronology.getInstance())));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #29  <Method ISOChronology ISOChronology.getInstance()>
	//    3    5:invokespecial   #32  <Method void BaseDateTime(long, Chronology)>
	//    4    8:return          
	}

	public BaseDateTime(long l, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractDateTime()>
		iChronology = checkChronology(chronology);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #43  <Method Chronology checkChronology(Chronology)>
	//    6   10:putfield        #45  <Field Chronology iChronology>
		iMillis = checkInstant(l, iChronology);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #45  <Field Chronology iChronology>
	//   12   20:invokevirtual   #55  <Method long checkInstant(long, Chronology)>
	//   13   23:putfield        #57  <Field long iMillis>
		if(iChronology.year().isSupported())
	//*  14   26:aload_0         
	//*  15   27:getfield        #45  <Field Chronology iChronology>
	//*  16   30:invokevirtual   #66  <Method DateTimeField Chronology.year()>
	//*  17   33:invokevirtual   #72  <Method boolean DateTimeField.isSupported()>
	//*  18   36:ifeq            68
			iChronology.year().set(iMillis, iChronology.year().get(iMillis));
	//   19   39:aload_0         
	//   20   40:getfield        #45  <Field Chronology iChronology>
	//   21   43:invokevirtual   #66  <Method DateTimeField Chronology.year()>
	//   22   46:aload_0         
	//   23   47:getfield        #57  <Field long iMillis>
	//   24   50:aload_0         
	//   25   51:getfield        #45  <Field Chronology iChronology>
	//   26   54:invokevirtual   #66  <Method DateTimeField Chronology.year()>
	//   27   57:aload_0         
	//   28   58:getfield        #57  <Field long iMillis>
	//   29   61:invokevirtual   #76  <Method int DateTimeField.get(long)>
	//   30   64:invokevirtual   #80  <Method long DateTimeField.set(long, int)>
	//   31   67:pop2            
	//   32   68:return          
	}

	public BaseDateTime(long l, DateTimeZone datetimezone)
	{
		this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #61  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    6:invokespecial   #32  <Method void BaseDateTime(long, Chronology)>
	//    5    9:return          
	}

	public BaseDateTime(Object obj, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractDateTime()>
		InstantConverter instantconverter = ConverterManager.getInstance().getInstantConverter(obj);
	//    2    4:invokestatic    #87  <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method InstantConverter ConverterManager.getInstantConverter(Object)>
	//    5   11:astore_3        
		iChronology = checkChronology(instantconverter.getChronology(obj, chronology));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokeinterface #97  <Method Chronology InstantConverter.getChronology(Object, Chronology)>
	//   12   22:invokevirtual   #43  <Method Chronology checkChronology(Chronology)>
	//   13   25:putfield        #45  <Field Chronology iChronology>
		iMillis = checkInstant(instantconverter.getInstantMillis(obj, chronology), iChronology);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokeinterface #101 <Method long InstantConverter.getInstantMillis(Object, Chronology)>
	//   20   38:aload_0         
	//   21   39:getfield        #45  <Field Chronology iChronology>
	//   22   42:invokevirtual   #55  <Method long checkInstant(long, Chronology)>
	//   23   45:putfield        #57  <Field long iMillis>
	//   24   48:return          
	}

	public BaseDateTime(Object obj, DateTimeZone datetimezone)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractDateTime()>
		InstantConverter instantconverter = ConverterManager.getInstance().getInstantConverter(obj);
	//    2    4:invokestatic    #87  <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method InstantConverter ConverterManager.getInstantConverter(Object)>
	//    5   11:astore_3        
		datetimezone = ((DateTimeZone) (checkChronology(instantconverter.getChronology(obj, datetimezone))));
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokeinterface #105 <Method Chronology InstantConverter.getChronology(Object, DateTimeZone)>
	//   11   21:invokevirtual   #43  <Method Chronology checkChronology(Chronology)>
	//   12   24:astore_2        
		iChronology = ((Chronology) (datetimezone));
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #45  <Field Chronology iChronology>
		iMillis = checkInstant(instantconverter.getInstantMillis(obj, ((Chronology) (datetimezone))), ((Chronology) (datetimezone)));
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokeinterface #101 <Method long InstantConverter.getInstantMillis(Object, Chronology)>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #55  <Method long checkInstant(long, Chronology)>
	//   24   44:putfield        #57  <Field long iMillis>
	//   25   47:return          
	}

	public BaseDateTime(Chronology chronology)
	{
		this(DateTimeUtils.currentTimeMillis(), chronology);
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #32  <Method void BaseDateTime(long, Chronology)>
	//    4    8:return          
	}

	public BaseDateTime(DateTimeZone datetimezone)
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #61  <Method ISOChronology ISOChronology.getInstance(DateTimeZone)>
	//    4    8:invokespecial   #32  <Method void BaseDateTime(long, Chronology)>
	//    5   11:return          
	}

	protected Chronology checkChronology(Chronology chronology)
	{
		return DateTimeUtils.getChronology(chronology);
	//    0    0:aload_1         
	//    1    1:invokestatic    #109 <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    2    4:areturn         
	}

	protected long checkInstant(long l, Chronology chronology)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	public Chronology getChronology()
	{
		return iChronology;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Chronology iChronology>
	//    2    4:areturn         
	}

	public long getMillis()
	{
		return iMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long iMillis>
	//    2    4:lreturn         
	}

	protected void setChronology(Chronology chronology)
	{
		iChronology = checkChronology(chronology);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #43  <Method Chronology checkChronology(Chronology)>
	//    4    6:putfield        #45  <Field Chronology iChronology>
	//    5    9:return          
	}

	protected void setMillis(long l)
	{
		iMillis = checkInstant(l, iChronology);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:lload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #45  <Field Chronology iChronology>
	//    5    7:invokevirtual   #55  <Method long checkInstant(long, Chronology)>
	//    6   10:putfield        #57  <Field long iMillis>
	//    7   13:return          
	}

	private static final long serialVersionUID = 0x4f5d2ea3L;
	private volatile Chronology iChronology;
	private volatile long iMillis;
}
