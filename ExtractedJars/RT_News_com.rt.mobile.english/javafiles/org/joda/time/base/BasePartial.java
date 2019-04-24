// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.*;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.base:
//			AbstractPartial

public abstract class BasePartial extends AbstractPartial
	implements ReadablePartial, Serializable
{

	protected BasePartial()
	{
		this(DateTimeUtils.currentTimeMillis(), ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aconst_null     
	//    3    5:invokespecial   #27  <Method void BasePartial(long, Chronology)>
	//    4    8:return          
	}

	protected BasePartial(long l)
	{
		this(l, ((Chronology) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #27  <Method void BasePartial(long, Chronology)>
	//    4    6:return          
	}

	protected BasePartial(long l, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		chronology = DateTimeUtils.getChronology(chronology);
	//    2    4:aload_3         
	//    3    5:invokestatic    #35  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    8:astore_3        
		iChronology = chronology.withUTC();
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #41  <Method Chronology Chronology.withUTC()>
	//    8   14:putfield        #43  <Field Chronology iChronology>
		iValues = chronology.get(((ReadablePartial) (this)), l);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_0         
	//   12   20:lload_1         
	//   13   21:invokevirtual   #47  <Method int[] Chronology.get(ReadablePartial, long)>
	//   14   24:putfield        #49  <Field int[] iValues>
	//   15   27:return          
	}

	protected BasePartial(Object obj, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #56  <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #60  <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore_3        
		chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #65  <Method Chronology PartialConverter.getChronology(Object, Chronology)>
	//   10   20:invokestatic    #35  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   23:astore_2        
		iChronology = chronology.withUTC();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #41  <Method Chronology Chronology.withUTC()>
	//   15   29:putfield        #43  <Field Chronology iChronology>
		iValues = partialconverter.getPartialValues(((ReadablePartial) (this)), obj, chronology);
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:invokeinterface #69  <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology)>
	//   22   42:putfield        #49  <Field int[] iValues>
	//   23   45:return          
	}

	protected BasePartial(Object obj, Chronology chronology, DateTimeFormatter datetimeformatter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
	//    2    4:invokestatic    #56  <Method ConverterManager ConverterManager.getInstance()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #60  <Method PartialConverter ConverterManager.getPartialConverter(Object)>
	//    5   11:astore          4
		chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
	//    6   13:aload           4
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #65  <Method Chronology PartialConverter.getChronology(Object, Chronology)>
	//   10   22:invokestatic    #35  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//   11   25:astore_2        
		iChronology = chronology.withUTC();
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #41  <Method Chronology Chronology.withUTC()>
	//   15   31:putfield        #43  <Field Chronology iChronology>
		iValues = partialconverter.getPartialValues(((ReadablePartial) (this)), obj, chronology, datetimeformatter);
	//   16   34:aload_0         
	//   17   35:aload           4
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:aload_3         
	//   22   41:invokeinterface #73  <Method int[] PartialConverter.getPartialValues(ReadablePartial, Object, Chronology, DateTimeFormatter)>
	//   23   46:putfield        #49  <Field int[] iValues>
	//   24   49:return          
	}

	protected BasePartial(Chronology chronology)
	{
		this(DateTimeUtils.currentTimeMillis(), chronology);
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method long DateTimeUtils.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #27  <Method void BasePartial(long, Chronology)>
	//    4    8:return          
	}

	protected BasePartial(BasePartial basepartial, Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		iChronology = chronology.withUTC();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #41  <Method Chronology Chronology.withUTC()>
	//    5    9:putfield        #43  <Field Chronology iChronology>
		iValues = basepartial.iValues;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #49  <Field int[] iValues>
	//    9   17:putfield        #49  <Field int[] iValues>
	//   10   20:return          
	}

	protected BasePartial(BasePartial basepartial, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		iChronology = basepartial.iChronology;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #43  <Field Chronology iChronology>
	//    5    9:putfield        #43  <Field Chronology iChronology>
		iValues = ai;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #49  <Field int[] iValues>
	//    9   17:return          
	}

	protected BasePartial(int ai[], Chronology chronology)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractPartial()>
		chronology = DateTimeUtils.getChronology(chronology);
	//    2    4:aload_2         
	//    3    5:invokestatic    #35  <Method Chronology DateTimeUtils.getChronology(Chronology)>
	//    4    8:astore_2        
		iChronology = chronology.withUTC();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #41  <Method Chronology Chronology.withUTC()>
	//    8   14:putfield        #43  <Field Chronology iChronology>
		chronology.validate(((ReadablePartial) (this)), ai);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #81  <Method void Chronology.validate(ReadablePartial, int[])>
		iValues = ai;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #49  <Field int[] iValues>
	//   16   28:return          
	}

	public Chronology getChronology()
	{
		return iChronology;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Chronology iChronology>
	//    2    4:areturn         
	}

	public int getValue(int i)
	{
		return iValues[i];
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int[] iValues>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public int[] getValues()
	{
		return (int[])((int []) (iValues)).clone();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int[] iValues>
	//    2    4:invokevirtual   #90  <Method Object _5B_I.clone()>
	//    3    7:checkcast       #86  <Class int[]>
	//    4   10:areturn         
	}

	protected void setValue(int i, int j)
	{
		System.arraycopy(((Object) (getField(i).set(((ReadablePartial) (this)), i, iValues, j))), 0, ((Object) (iValues)), 0, iValues.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method DateTimeField getField(int)>
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field int[] iValues>
	//    7   11:iload_2         
	//    8   12:invokevirtual   #102 <Method int[] DateTimeField.set(ReadablePartial, int, int[], int)>
	//    9   15:iconst_0        
	//   10   16:aload_0         
	//   11   17:getfield        #49  <Field int[] iValues>
	//   12   20:iconst_0        
	//   13   21:aload_0         
	//   14   22:getfield        #49  <Field int[] iValues>
	//   15   25:arraylength     
	//   16   26:invokestatic    #108 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   17   29:return          
	}

	protected void setValues(int ai[])
	{
		getChronology().validate(((ReadablePartial) (this)), ai);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method Chronology getChronology()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #81  <Method void Chronology.validate(ReadablePartial, int[])>
		System.arraycopy(((Object) (ai)), 0, ((Object) (iValues)), 0, iValues.length);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:getfield        #49  <Field int[] iValues>
	//    9   15:iconst_0        
	//   10   16:aload_0         
	//   11   17:getfield        #49  <Field int[] iValues>
	//   12   20:arraylength     
	//   13   21:invokestatic    #108 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   14   24:return          
	}

	public String toString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((Object)this).toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #119 <Method String Object.toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #125 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #131 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    9   17:areturn         
	}

	public String toString(String s, Locale locale)
		throws IllegalArgumentException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((Object)this).toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #119 <Method String Object.toString()>
	//    4    8:areturn         
		else
			return DateTimeFormat.forPattern(s).withLocale(locale).print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #125 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #138 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #131 <Method String DateTimeFormatter.print(ReadablePartial)>
	//   11   21:areturn         
	}

	private static final long serialVersionUID = 0x82d5755cL;
	private final Chronology iChronology;
	private final int iValues[];
}
