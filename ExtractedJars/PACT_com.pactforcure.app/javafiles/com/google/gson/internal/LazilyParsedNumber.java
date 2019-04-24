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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(this != obj) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:if_acmpne       11
_L1:
		boolean flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
_L4:
		return flag;
	//    7    9:iload_2         
	//    8   10:ireturn         
_L2:
		flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
		if(!(obj instanceof LazilyParsedNumber)) goto _L4; else goto _L3
	//   11   13:aload_1         
	//   12   14:instanceof      #2   <Class LazilyParsedNumber>
	//   13   17:ifeq            9
_L3:
		obj = ((Object) ((LazilyParsedNumber)obj));
	//   14   20:aload_1         
	//   15   21:checkcast       #2   <Class LazilyParsedNumber>
	//   16   24:astore_1        
		if(value == ((LazilyParsedNumber) (obj)).value)
			break; /* Loop/switch isn't completed */
	//   17   25:aload_0         
	//   18   26:getfield        #13  <Field String value>
	//   19   29:aload_1         
	//   20   30:getfield        #13  <Field String value>
	//   21   33:if_acmpeq       52
		flag = flag1;
	//   22   36:iload_3         
	//   23   37:istore_2        
		if(!value.equals(((Object) (((LazilyParsedNumber) (obj)).value)))) goto _L4; else goto _L5
	//   24   38:aload_0         
	//   25   39:getfield        #13  <Field String value>
	//   26   42:aload_1         
	//   27   43:getfield        #13  <Field String value>
	//   28   46:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   29   49:ifeq            9
_L5:
		return true;
	//   30   52:iconst_1        
	//   31   53:ireturn         
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
