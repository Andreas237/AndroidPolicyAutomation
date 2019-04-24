// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, ByteBuffer

public class PdfNumber extends PdfObject
{

	public PdfNumber(double d)
	{
		super(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #11  <Method void PdfObject(int)>
		value = d;
	//    3    5:aload_0         
	//    4    6:dload_1         
	//    5    7:putfield        #13  <Field double value>
		setContent(ByteBuffer.formatDouble(d));
	//    6   10:aload_0         
	//    7   11:dload_1         
	//    8   12:invokestatic    #19  <Method String ByteBuffer.formatDouble(double)>
	//    9   15:invokevirtual   #23  <Method void setContent(String)>
	//   10   18:return          
	}

	public PdfNumber(float f)
	{
		this(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:invokespecial   #27  <Method void PdfNumber(double)>
	//    4    6:return          
	}

	public PdfNumber(int i)
	{
		super(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #11  <Method void PdfObject(int)>
		value = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:i2d             
	//    6    8:putfield        #13  <Field double value>
		setContent(String.valueOf(i));
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokestatic    #33  <Method String String.valueOf(int)>
	//   10   16:invokevirtual   #23  <Method void setContent(String)>
	//   11   19:return          
	}

	public PdfNumber(long l)
	{
		super(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #11  <Method void PdfObject(int)>
		value = l;
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:l2d             
	//    6    8:putfield        #13  <Field double value>
		setContent(String.valueOf(l));
	//    7   11:aload_0         
	//    8   12:lload_1         
	//    9   13:invokestatic    #37  <Method String String.valueOf(long)>
	//   10   16:invokevirtual   #23  <Method void setContent(String)>
	//   11   19:return          
	}

	public PdfNumber(String s)
	{
		super(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #11  <Method void PdfObject(int)>
		try
		{
			value = Double.parseDouble(s.trim());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #43  <Method String String.trim()>
	//    6   10:invokestatic    #49  <Method double Double.parseDouble(String)>
	//    7   13:putfield        #13  <Field double value>
			setContent(s);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #23  <Method void setContent(String)>
			return;
	//   11   21:return          
		}
		catch(NumberFormatException numberformatexception)
	//*  12   22:astore_2        
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("1.is.not.a.valid.number.2", new Object[] {
				s, numberformatexception.toString()
			}));
	//   13   23:new             #51  <Class RuntimeException>
	//   14   26:dup             
	//   15   27:ldc1            #53  <String "1.is.not.a.valid.number.2">
	//   16   29:iconst_2        
	//   17   30:anewarray       Object[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:aload_1         
	//   21   36:aastore         
	//   22   37:dup             
	//   23   38:iconst_1        
	//   24   39:aload_2         
	//   25   40:invokevirtual   #58  <Method String NumberFormatException.toString()>
	//   26   43:aastore         
	//   27   44:invokestatic    #64  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   47:invokespecial   #66  <Method void RuntimeException(String)>
	//   29   50:athrow          
		}
	}

	public double doubleValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double value>
	//    2    4:dreturn         
	}

	public float floatValue()
	{
		return (float)value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double value>
	//    2    4:d2f             
	//    3    5:freturn         
	}

	public void increment()
	{
		value = value + 1.0D;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field double value>
	//    3    5:dconst_1        
	//    4    6:dadd            
	//    5    7:putfield        #13  <Field double value>
		setContent(ByteBuffer.formatDouble(value));
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #13  <Field double value>
	//    9   15:invokestatic    #19  <Method String ByteBuffer.formatDouble(double)>
	//   10   18:invokevirtual   #23  <Method void setContent(String)>
	//   11   21:return          
	}

	public int intValue()
	{
		return (int)value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double value>
	//    2    4:d2i             
	//    3    5:ireturn         
	}

	public long longValue()
	{
		return (long)value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double value>
	//    2    4:d2l             
	//    3    5:lreturn         
	}

	private double value;
}
