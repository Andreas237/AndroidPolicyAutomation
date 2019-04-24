// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number
{

	public LazilyParsedNumber(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Number()>
		value = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String value>
	//    5    9:return          
	}

	private Object writeReplace()
		throws ObjectStreamException
	{
		return ((Object) (new BigDecimal(value)));
	//    0    0:new             #20  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field String value>
	//    4    8:invokespecial   #22  <Method void BigDecimal(String)>
	//    5   11:areturn         
	}

	public double doubleValue()
	{
		return Double.parseDouble(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #31  <Method double Double.parseDouble(String)>
	//    3    7:dreturn         
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
		if(obj instanceof LazilyParsedNumber)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LazilyParsedNumber>
	//*   7   11:ifeq            48
		{
			obj = ((Object) ((LazilyParsedNumber)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class LazilyParsedNumber>
	//   10   18:astore_1        
			return value == ((LazilyParsedNumber) (obj)).value || value.equals(((Object) (((LazilyParsedNumber) (obj)).value)));
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field String value>
	//   13   23:aload_1         
	//   14   24:getfield        #13  <Field String value>
	//   15   27:if_acmpeq       44
	//   16   30:aload_0         
	//   17   31:getfield        #13  <Field String value>
	//   18   34:aload_1         
	//   19   35:getfield        #13  <Field String value>
	//   20   38:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   21   41:ifeq            46
	//   22   44:iconst_1        
	//   23   45:ireturn         
	//   24   46:iconst_0        
	//   25   47:ireturn         
		} else
		{
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
	}

	public float floatValue()
	{
		return Float.parseFloat(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #45  <Method float Float.parseFloat(String)>
	//    3    7:freturn         
	}

	public int hashCode()
	{
		return value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokevirtual   #49  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public int intValue()
	{
		int i;
		try
		{
			i = Integer.parseInt(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #58  <Method int Integer.parseInt(String)>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(NumberFormatException numberformatexception)
	//*   6   10:astore          4
		{
			long l;
			try
			{
				l = Long.parseLong(value);
	//    7   12:aload_0         
	//    8   13:getfield        #13  <Field String value>
	//    9   16:invokestatic    #64  <Method long Long.parseLong(String)>
	//   10   19:lstore_2        
			}
	//*  11   20:lload_2         
	//*  12   21:l2i             
	//*  13   22:ireturn         
			catch(NumberFormatException numberformatexception1)
	//*  14   23:astore          4
			{
				return (new BigDecimal(value)).intValue();
	//   15   25:new             #20  <Class BigDecimal>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:getfield        #13  <Field String value>
	//   19   33:invokespecial   #22  <Method void BigDecimal(String)>
	//   20   36:invokevirtual   #66  <Method int BigDecimal.intValue()>
	//   21   39:ireturn         
			}
			return (int)l;
		}
		return i;
	}

	public long longValue()
	{
		long l;
		try
		{
			l = Long.parseLong(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #64  <Method long Long.parseLong(String)>
	//    3    7:lstore_1        
		}
	//*   4    8:lload_1         
	//*   5    9:lreturn         
		catch(NumberFormatException numberformatexception)
	//*   6   10:astore_3        
		{
			return (new BigDecimal(value)).longValue();
	//    7   11:new             #20  <Class BigDecimal>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #13  <Field String value>
	//   11   19:invokespecial   #22  <Method void BigDecimal(String)>
	//   12   22:invokevirtual   #70  <Method long BigDecimal.longValue()>
	//   13   25:lreturn         
		}
		return l;
	}

	public String toString()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:areturn         
	}

	private final String value;
}
