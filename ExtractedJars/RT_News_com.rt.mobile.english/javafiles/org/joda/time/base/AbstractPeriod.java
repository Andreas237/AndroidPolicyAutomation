// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import org.joda.time.*;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public abstract class AbstractPeriod
	implements ReadablePeriod
{

	protected AbstractPeriod()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
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
	//*   6    8:instanceof      #6   <Class ReadablePeriod>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ReadablePeriod)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #6   <Class ReadablePeriod>
	//   12   20:astore_1        
		if(size() != ((ReadablePeriod) (obj)).size())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #17  <Method int size()>
	//*  15   25:aload_1         
	//*  16   26:invokeinterface #18  <Method int ReadablePeriod.size()>
	//*  17   31:icmpeq          36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		int j = size();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #17  <Method int size()>
	//   22   40:istore_3        
		for(int i = 0; i < j;)
	//*  23   41:iconst_0        
	//*  24   42:istore_2        
	//*  25   43:iload_2         
	//*  26   44:iload_3         
	//*  27   45:icmpge          89
			if(getValue(i) == ((ReadablePeriod) (obj)).getValue(i))
	//*  28   48:aload_0         
	//*  29   49:iload_2         
	//*  30   50:invokevirtual   #22  <Method int getValue(int)>
	//*  31   53:aload_1         
	//*  32   54:iload_2         
	//*  33   55:invokeinterface #23  <Method int ReadablePeriod.getValue(int)>
	//*  34   60:icmpne          87
			{
				if(getFieldType(i) != ((ReadablePeriod) (obj)).getFieldType(i))
	//*  35   63:aload_0         
	//*  36   64:iload_2         
	//*  37   65:invokevirtual   #27  <Method DurationFieldType getFieldType(int)>
	//*  38   68:aload_1         
	//*  39   69:iload_2         
	//*  40   70:invokeinterface #28  <Method DurationFieldType ReadablePeriod.getFieldType(int)>
	//*  41   75:if_acmpeq       80
					return false;
	//   42   78:iconst_0        
	//   43   79:ireturn         
				i++;
	//   44   80:iload_2         
	//   45   81:iconst_1        
	//   46   82:iadd            
	//   47   83:istore_2        
			} else
	//*  48   84:goto            43
			{
				return false;
	//   49   87:iconst_0        
	//   50   88:ireturn         
			}

		return true;
	//   51   89:iconst_1        
	//   52   90:ireturn         
	}

	public int get(DurationFieldType durationfieldtype)
	{
		int i = indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method int indexOf(DurationFieldType)>
	//    3    5:istore_2        
		if(i == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          13
			return 0;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		else
			return getValue(i);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #22  <Method int getValue(int)>
	//   12   18:ireturn         
	}

	public DurationFieldType getFieldType(int i)
	{
		return getPeriodType().getFieldType(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method PeriodType getPeriodType()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #40  <Method DurationFieldType PeriodType.getFieldType(int)>
	//    4    8:areturn         
	}

	public DurationFieldType[] getFieldTypes()
	{
		DurationFieldType adurationfieldtype[] = new DurationFieldType[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int size()>
	//    2    4:anewarray       DurationFieldType[]
	//    3    7:astore_2        
		for(int i = 0; i < adurationfieldtype.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          31
			adurationfieldtype[i] = getFieldType(i);
	//   10   16:aload_2         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #27  <Method DurationFieldType getFieldType(int)>
	//   15   23:aastore         

	//   16   24:iload_1         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_1        
	//*  20   28:goto            10
		return adurationfieldtype;
	//   21   31:aload_2         
	//   22   32:areturn         
	}

	public int[] getValues()
	{
		int ai[] = new int[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int size()>
	//    2    4:newarray        int[]
	//    3    6:astore_2        
		for(int i = 0; i < ai.length; i++)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_2         
	//*   8   11:arraylength     
	//*   9   12:icmpge          30
			ai[i] = getValue(i);
	//   10   15:aload_2         
	//   11   16:iload_1         
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #22  <Method int getValue(int)>
	//   15   22:iastore         

	//   16   23:iload_1         
	//   17   24:iconst_1        
	//   18   25:iadd            
	//   19   26:istore_1        
	//*  20   27:goto            9
		return ai;
	//   21   30:aload_2         
	//   22   31:areturn         
	}

	public int hashCode()
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int size()>
	//    2    4:istore_3        
		int j = 17;
	//    3    5:bipush          17
	//    4    7:istore_2        
		for(int i = 0; i < k; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_1        
	//*   7   10:iload_1         
	//*   8   11:iload_3         
	//*   9   12:icmpge          49
		{
			int l = getValue(i);
	//   10   15:aload_0         
	//   11   16:iload_1         
	//   12   17:invokevirtual   #22  <Method int getValue(int)>
	//   13   20:istore          4
			j = ((Object) (getFieldType(i))).hashCode() + 27 * (j * 27 + l);
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #27  <Method DurationFieldType getFieldType(int)>
	//   17   27:invokevirtual   #49  <Method int Object.hashCode()>
	//   18   30:bipush          27
	//   19   32:iload_2         
	//   20   33:bipush          27
	//   21   35:imul            
	//   22   36:iload           4
	//   23   38:iadd            
	//   24   39:imul            
	//   25   40:iadd            
	//   26   41:istore_2        
		}

	//   27   42:iload_1         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_1        
	//*  31   46:goto            10
		return j;
	//   32   49:iload_2         
	//   33   50:ireturn         
	}

	public int indexOf(DurationFieldType durationfieldtype)
	{
		return getPeriodType().indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method PeriodType getPeriodType()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method int PeriodType.indexOf(DurationFieldType)>
	//    4    8:ireturn         
	}

	public boolean isSupported(DurationFieldType durationfieldtype)
	{
		return getPeriodType().isSupported(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method PeriodType getPeriodType()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method boolean PeriodType.isSupported(DurationFieldType)>
	//    4    8:ireturn         
	}

	public int size()
	{
		return getPeriodType().size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method PeriodType getPeriodType()>
	//    2    4:invokevirtual   #55  <Method int PeriodType.size()>
	//    3    7:ireturn         
	}

	public MutablePeriod toMutablePeriod()
	{
		return new MutablePeriod(((Object) (this)));
	//    0    0:new             #59  <Class MutablePeriod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void MutablePeriod(Object)>
	//    4    8:areturn         
	}

	public Period toPeriod()
	{
		return new Period(((Object) (this)));
	//    0    0:new             #66  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method void Period(Object)>
	//    4    8:areturn         
	}

	public String toString()
	{
		return ISOPeriodFormat.standard().print(((ReadablePeriod) (this)));
	//    0    0:invokestatic    #76  <Method PeriodFormatter ISOPeriodFormat.standard()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #82  <Method String PeriodFormatter.print(ReadablePeriod)>
	//    3    7:areturn         
	}

	public String toString(PeriodFormatter periodformatter)
	{
		if(periodformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method String toString()>
	//    4    8:areturn         
		else
			return periodformatter.print(((ReadablePeriod) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #82  <Method String PeriodFormatter.print(ReadablePeriod)>
	//    8   14:areturn         
	}
}
