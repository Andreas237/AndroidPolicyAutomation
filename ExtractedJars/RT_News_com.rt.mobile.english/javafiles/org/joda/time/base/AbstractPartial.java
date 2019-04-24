// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import org.joda.time.*;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

public abstract class AbstractPartial
	implements ReadablePartial, Comparable
{

	protected AbstractPartial()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadablePartial)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ReadablePartial>
	//    3    5:invokevirtual   #19  <Method int compareTo(ReadablePartial)>
	//    4    8:ireturn         
	}

	public int compareTo(ReadablePartial readablepartial)
	{
		if(this == readablepartial)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(size() != readablepartial.size())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #23  <Method int size()>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #24  <Method int ReadablePartial.size()>
	//*   9   17:icmpeq          30
			throw new ClassCastException("ReadablePartial objects must have matching field types");
	//   10   20:new             #26  <Class ClassCastException>
	//   11   23:dup             
	//   12   24:ldc1            #28  <String "ReadablePartial objects must have matching field types">
	//   13   26:invokespecial   #31  <Method void ClassCastException(String)>
	//   14   29:athrow          
		int k = size();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #23  <Method int size()>
	//   17   34:istore_3        
		for(int i = 0; i < k; i++)
	//*  18   35:iconst_0        
	//*  19   36:istore_2        
	//*  20   37:iload_2         
	//*  21   38:iload_3         
	//*  22   39:icmpge          74
			if(getFieldType(i) != readablepartial.getFieldType(i))
	//*  23   42:aload_0         
	//*  24   43:iload_2         
	//*  25   44:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//*  26   47:aload_1         
	//*  27   48:iload_2         
	//*  28   49:invokeinterface #36  <Method DateTimeFieldType ReadablePartial.getFieldType(int)>
	//*  29   54:if_acmpeq       67
				throw new ClassCastException("ReadablePartial objects must have matching field types");
	//   30   57:new             #26  <Class ClassCastException>
	//   31   60:dup             
	//   32   61:ldc1            #28  <String "ReadablePartial objects must have matching field types">
	//   33   63:invokespecial   #31  <Method void ClassCastException(String)>
	//   34   66:athrow          

	//   35   67:iload_2         
	//   36   68:iconst_1        
	//   37   69:iadd            
	//   38   70:istore_2        
	//*  39   71:goto            37
		k = size();
	//   40   74:aload_0         
	//   41   75:invokevirtual   #23  <Method int size()>
	//   42   78:istore_3        
		for(int j = 0; j < k; j++)
	//*  43   79:iconst_0        
	//*  44   80:istore_2        
	//*  45   81:iload_2         
	//*  46   82:iload_3         
	//*  47   83:icmpge          127
		{
			if(getValue(j) > readablepartial.getValue(j))
	//*  48   86:aload_0         
	//*  49   87:iload_2         
	//*  50   88:invokevirtual   #40  <Method int getValue(int)>
	//*  51   91:aload_1         
	//*  52   92:iload_2         
	//*  53   93:invokeinterface #41  <Method int ReadablePartial.getValue(int)>
	//*  54   98:icmple          103
				return 1;
	//   55  101:iconst_1        
	//   56  102:ireturn         
			if(getValue(j) < readablepartial.getValue(j))
	//*  57  103:aload_0         
	//*  58  104:iload_2         
	//*  59  105:invokevirtual   #40  <Method int getValue(int)>
	//*  60  108:aload_1         
	//*  61  109:iload_2         
	//*  62  110:invokeinterface #41  <Method int ReadablePartial.getValue(int)>
	//*  63  115:icmpge          120
				return -1;
	//   64  118:iconst_m1       
	//   65  119:ireturn         
		}

	//   66  120:iload_2         
	//   67  121:iconst_1        
	//   68  122:iadd            
	//   69  123:istore_2        
	//*  70  124:goto            81
		return 0;
	//   71  127:iconst_0        
	//   72  128:ireturn         
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
		if(!(obj instanceof ReadablePartial))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #7   <Class ReadablePartial>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ReadablePartial)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #7   <Class ReadablePartial>
	//   12   20:astore_1        
		if(size() != ((ReadablePartial) (obj)).size())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #23  <Method int size()>
	//*  15   25:aload_1         
	//*  16   26:invokeinterface #24  <Method int ReadablePartial.size()>
	//*  17   31:icmpeq          36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		int j = size();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #23  <Method int size()>
	//   22   40:istore_3        
		for(int i = 0; i < j;)
	//*  23   41:iconst_0        
	//*  24   42:istore_2        
	//*  25   43:iload_2         
	//*  26   44:iload_3         
	//*  27   45:icmpge          89
			if(getValue(i) == ((ReadablePartial) (obj)).getValue(i))
	//*  28   48:aload_0         
	//*  29   49:iload_2         
	//*  30   50:invokevirtual   #40  <Method int getValue(int)>
	//*  31   53:aload_1         
	//*  32   54:iload_2         
	//*  33   55:invokeinterface #41  <Method int ReadablePartial.getValue(int)>
	//*  34   60:icmpne          87
			{
				if(getFieldType(i) != ((ReadablePartial) (obj)).getFieldType(i))
	//*  35   63:aload_0         
	//*  36   64:iload_2         
	//*  37   65:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//*  38   68:aload_1         
	//*  39   69:iload_2         
	//*  40   70:invokeinterface #36  <Method DateTimeFieldType ReadablePartial.getFieldType(int)>
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

		return FieldUtils.equals(((Object) (getChronology())), ((Object) (((ReadablePartial) (obj)).getChronology())));
	//   51   89:aload_0         
	//   52   90:invokevirtual   #47  <Method Chronology getChronology()>
	//   53   93:aload_1         
	//   54   94:invokeinterface #48  <Method Chronology ReadablePartial.getChronology()>
	//   55   99:invokestatic    #53  <Method boolean FieldUtils.equals(Object, Object)>
	//   56  102:ireturn         
	}

	public int get(DateTimeFieldType datetimefieldtype)
	{
		return getValue(indexOfSupported(datetimefieldtype));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #58  <Method int indexOfSupported(DateTimeFieldType)>
	//    4    6:invokevirtual   #40  <Method int getValue(int)>
	//    5    9:ireturn         
	}

	public DateTimeField getField(int i)
	{
		return getField(i, getChronology());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #47  <Method Chronology getChronology()>
	//    4    6:invokevirtual   #63  <Method DateTimeField getField(int, Chronology)>
	//    5    9:areturn         
	}

	protected abstract DateTimeField getField(int i, Chronology chronology);

	public DateTimeFieldType getFieldType(int i)
	{
		return getField(i, getChronology()).getType();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #47  <Method Chronology getChronology()>
	//    4    6:invokevirtual   #63  <Method DateTimeField getField(int, Chronology)>
	//    5    9:invokevirtual   #69  <Method DateTimeFieldType DateTimeField.getType()>
	//    6   12:areturn         
	}

	public DateTimeFieldType[] getFieldTypes()
	{
		DateTimeFieldType adatetimefieldtype[] = new DateTimeFieldType[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:anewarray       DateTimeFieldType[]
	//    3    7:astore_2        
		for(int i = 0; i < adatetimefieldtype.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          31
			adatetimefieldtype[i] = getFieldType(i);
	//   10   16:aload_2         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//   15   23:aastore         

	//   16   24:iload_1         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_1        
	//*  20   28:goto            10
		return adatetimefieldtype;
	//   21   31:aload_2         
	//   22   32:areturn         
	}

	public DateTimeField[] getFields()
	{
		DateTimeField adatetimefield[] = new DateTimeField[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:anewarray       DateTimeField[]
	//    3    7:astore_2        
		for(int i = 0; i < adatetimefield.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          31
			adatetimefield[i] = getField(i);
	//   10   16:aload_2         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #77  <Method DateTimeField getField(int)>
	//   15   23:aastore         

	//   16   24:iload_1         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_1        
	//*  20   28:goto            10
		return adatetimefield;
	//   21   31:aload_2         
	//   22   32:areturn         
	}

	public int[] getValues()
	{
		int ai[] = new int[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
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
	//   14   19:invokevirtual   #40  <Method int getValue(int)>
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
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:istore_3        
		int j = 157;
	//    3    5:sipush          157
	//    4    8:istore_2        
		for(int i = 0; i < k; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:iload_3         
	//*   9   13:icmpge          50
		{
			int l = getValue(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #40  <Method int getValue(int)>
	//   13   21:istore          4
			j = ((Object) (getFieldType(i))).hashCode() + 23 * (j * 23 + l);
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//   17   28:invokevirtual   #82  <Method int Object.hashCode()>
	//   18   31:bipush          23
	//   19   33:iload_2         
	//   20   34:bipush          23
	//   21   36:imul            
	//   22   37:iload           4
	//   23   39:iadd            
	//   24   40:imul            
	//   25   41:iadd            
	//   26   42:istore_2        
		}

	//   27   43:iload_1         
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:istore_1        
	//*  31   47:goto            11
		return j + ((Object) (getChronology())).hashCode();
	//   32   50:iload_2         
	//   33   51:aload_0         
	//   34   52:invokevirtual   #47  <Method Chronology getChronology()>
	//   35   55:invokevirtual   #82  <Method int Object.hashCode()>
	//   36   58:iadd            
	//   37   59:ireturn         
	}

	public int indexOf(DateTimeFieldType datetimefieldtype)
	{
		int j = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          30
			if(getFieldType(i) == datetimefieldtype)
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//*  11   17:aload_1         
	//*  12   18:if_acmpne       23
				return i;
	//   13   21:iload_2         
	//   14   22:ireturn         

	//   15   23:iload_2         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_2        
	//*  19   27:goto            7
		return -1;
	//   20   30:iconst_m1       
	//   21   31:ireturn         
	}

	protected int indexOf(DurationFieldType durationfieldtype)
	{
		int j = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          33
			if(getFieldType(i).getDurationType() == durationfieldtype)
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #35  <Method DateTimeFieldType getFieldType(int)>
	//*  11   17:invokevirtual   #88  <Method DurationFieldType DateTimeFieldType.getDurationType()>
	//*  12   20:aload_1         
	//*  13   21:if_acmpne       26
				return i;
	//   14   24:iload_2         
	//   15   25:ireturn         

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            7
		return -1;
	//   21   33:iconst_m1       
	//   22   34:ireturn         
	}

	protected int indexOfSupported(DateTimeFieldType datetimefieldtype)
	{
		int i = indexOf(datetimefieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method int indexOf(DateTimeFieldType)>
	//    3    5:istore_2        
		if(i == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #92  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #93  <Method void StringBuilder()>
	//   10   18:astore_3        
			stringbuilder.append("Field '");
	//   11   19:aload_3         
	//   12   20:ldc1            #95  <String "Field '">
	//   13   22:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(((Object) (datetimefieldtype)));
	//   15   26:aload_3         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   18   31:pop             
			stringbuilder.append("' is not supported");
	//   19   32:aload_3         
	//   20   33:ldc1            #104 <String "' is not supported">
	//   21   35:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   22   38:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   39:new             #106 <Class IllegalArgumentException>
	//   24   42:dup             
	//   25   43:aload_3         
	//   26   44:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   27   47:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//   28   50:athrow          
		} else
		{
			return i;
	//   29   51:iload_2         
	//   30   52:ireturn         
		}
	}

	protected int indexOfSupported(DurationFieldType durationfieldtype)
	{
		int i = indexOf(durationfieldtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method int indexOf(DurationFieldType)>
	//    3    5:istore_2        
		if(i == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #92  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #93  <Method void StringBuilder()>
	//   10   18:astore_3        
			stringbuilder.append("Field '");
	//   11   19:aload_3         
	//   12   20:ldc1            #95  <String "Field '">
	//   13   22:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(((Object) (durationfieldtype)));
	//   15   26:aload_3         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   18   31:pop             
			stringbuilder.append("' is not supported");
	//   19   32:aload_3         
	//   20   33:ldc1            #104 <String "' is not supported">
	//   21   35:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   22   38:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   39:new             #106 <Class IllegalArgumentException>
	//   24   42:dup             
	//   25   43:aload_3         
	//   26   44:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   27   47:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//   28   50:athrow          
		} else
		{
			return i;
	//   29   51:iload_2         
	//   30   52:ireturn         
		}
	}

	public boolean isAfter(ReadablePartial readablepartial)
	{
		if(readablepartial == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Partial cannot be null");
	//    2    4:new             #106 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #117 <String "Partial cannot be null">
	//    5   10:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		return compareTo(readablepartial) > 0;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #19  <Method int compareTo(ReadablePartial)>
	//   10   19:ifle            24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public boolean isBefore(ReadablePartial readablepartial)
	{
		if(readablepartial == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Partial cannot be null");
	//    2    4:new             #106 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #117 <String "Partial cannot be null">
	//    5   10:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		return compareTo(readablepartial) < 0;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #19  <Method int compareTo(ReadablePartial)>
	//   10   19:ifge            24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public boolean isEqual(ReadablePartial readablepartial)
	{
		if(readablepartial == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Partial cannot be null");
	//    2    4:new             #106 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #117 <String "Partial cannot be null">
	//    5   10:invokespecial   #111 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		return compareTo(readablepartial) == 0;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #19  <Method int compareTo(ReadablePartial)>
	//   10   19:ifne            24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public boolean isSupported(DateTimeFieldType datetimefieldtype)
	{
		return indexOf(datetimefieldtype) != -1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method int indexOf(DateTimeFieldType)>
	//    3    5:iconst_m1       
	//    4    6:icmpeq          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public DateTime toDateTime(ReadableInstant readableinstant)
	{
		Chronology chronology = DateTimeUtils.getInstantChronology(readableinstant);
	//    0    0:aload_1         
	//    1    1:invokestatic    #129 <Method Chronology DateTimeUtils.getInstantChronology(ReadableInstant)>
	//    2    4:astore_2        
		return new DateTime(chronology.set(((ReadablePartial) (this)), DateTimeUtils.getInstantMillis(readableinstant)), chronology);
	//    3    5:new             #131 <Class DateTime>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #135 <Method long DateTimeUtils.getInstantMillis(ReadableInstant)>
	//    9   15:invokevirtual   #141 <Method long Chronology.set(ReadablePartial, long)>
	//   10   18:aload_2         
	//   11   19:invokespecial   #144 <Method void DateTime(long, Chronology)>
	//   12   22:areturn         
	}

	public String toString(DateTimeFormatter datetimeformatter)
	{
		if(datetimeformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((Object)this).toString();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #146 <Method String Object.toString()>
	//    4    8:areturn         
		else
			return datetimeformatter.print(((ReadablePartial) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #152 <Method String DateTimeFormatter.print(ReadablePartial)>
	//    8   14:areturn         
	}
}
