// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

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
	{
		return ((Object) (new BigDecimal(value)));
	//    0    0:new             #18  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field String value>
	//    4    8:invokespecial   #20  <Method void BigDecimal(String)>
	//    5   11:areturn         
	}

	public double doubleValue()
	{
		return Double.parseDouble(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #28  <Method double Double.parseDouble(String)>
	//    3    7:dreturn         
	}

	public float floatValue()
	{
		return Float.parseFloat(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #36  <Method float Float.parseFloat(String)>
	//    3    7:freturn         
	}

	public int intValue()
	{
		NumberFormatException numberformatexception;
		int i;
		long l;
		try
		{
			i = Integer.parseInt(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #46  <Method int Integer.parseInt(String)>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
	//*   6   10:aload_0         
	//*   7   11:getfield        #13  <Field String value>
	//*   8   14:invokestatic    #52  <Method long Long.parseLong(String)>
	//*   9   17:lstore_2        
	//*  10   18:lload_2         
	//*  11   19:l2i             
	//*  12   20:ireturn         
	//*  13   21:new             #18  <Class BigDecimal>
	//*  14   24:dup             
	//*  15   25:aload_0         
	//*  16   26:getfield        #13  <Field String value>
	//*  17   29:invokespecial   #20  <Method void BigDecimal(String)>
	//*  18   32:invokevirtual   #54  <Method int BigDecimal.intValue()>
	//*  19   35:ireturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			try
			{
				l = Long.parseLong(value);
			}
	//*  20   36:astore          4
	//*  21   38:goto            10
			// Misplaced declaration of an exception variable
			catch(NumberFormatException numberformatexception)
			{
				return (new BigDecimal(value)).intValue();
			}
			return (int)l;
		}
		return i;
	//*  22   41:astore          4
	//*  23   43:goto            21
	}

	public long longValue()
	{
		NumberFormatException numberformatexception;
		long l;
		try
		{
			l = Long.parseLong(value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String value>
	//    2    4:invokestatic    #52  <Method long Long.parseLong(String)>
	//    3    7:lstore_1        
		}
	//*   4    8:lload_1         
	//*   5    9:lreturn         
	//*   6   10:new             #18  <Class BigDecimal>
	//*   7   13:dup             
	//*   8   14:aload_0         
	//*   9   15:getfield        #13  <Field String value>
	//*  10   18:invokespecial   #20  <Method void BigDecimal(String)>
	//*  11   21:invokevirtual   #58  <Method long BigDecimal.longValue()>
	//*  12   24:lreturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			return (new BigDecimal(value)).longValue();
		}
		return l;
	//*  13   25:astore_3        
	//*  14   26:goto            10
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
