// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.OutputStreamCounter;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			DocListener, DocumentException, ExceptionConverter, Document, 
//			Rectangle, Element

public abstract class DocWriter
	implements DocListener
{

	protected DocWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		open = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean open>
		pause = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #41  <Field boolean pause>
		closeStream = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #43  <Field boolean closeStream>
	//   11   19:return          
	}

	protected DocWriter(Document document1, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		open = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean open>
		pause = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #41  <Field boolean pause>
		closeStream = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #43  <Field boolean closeStream>
		document = document1;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #47  <Field Document document>
		os = new OutputStreamCounter(((OutputStream) (new BufferedOutputStream(outputstream))));
	//   14   24:aload_0         
	//   15   25:new             #49  <Class OutputStreamCounter>
	//   16   28:dup             
	//   17   29:new             #51  <Class BufferedOutputStream>
	//   18   32:dup             
	//   19   33:aload_2         
	//   20   34:invokespecial   #54  <Method void BufferedOutputStream(OutputStream)>
	//   21   37:invokespecial   #55  <Method void OutputStreamCounter(OutputStream)>
	//   22   40:putfield        #57  <Field OutputStreamCounter os>
	//   23   43:return          
	}

	public static final byte[] getISOBytes(String s)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		byte abyte0[] = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
_L4:
		return abyte0;
	//    4    6:aload_3         
	//    5    7:areturn         
_L2:
		int j = s.length();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #65  <Method int String.length()>
	//    8   12:istore_2        
		byte abyte1[] = new byte[j];
	//    9   13:iload_2         
	//   10   14:newarray        byte[]
	//   11   16:astore          4
		int i = 0;
	//   12   18:iconst_0        
	//   13   19:istore_1        
		do
		{
			abyte0 = abyte1;
	//   14   20:aload           4
	//   15   22:astore_3        
			if(i >= j)
				continue;
	//   16   23:iload_1         
	//   17   24:iload_2         
	//   18   25:icmpge          6
			abyte1[i] = (byte)s.charAt(i);
	//   19   28:aload           4
	//   20   30:iload_1         
	//   21   31:aload_0         
	//   22   32:iload_1         
	//   23   33:invokevirtual   #69  <Method char String.charAt(int)>
	//   24   36:int2byte        
	//   25   37:bastore         
			i++;
	//   26   38:iload_1         
	//   27   39:iconst_1        
	//   28   40:iadd            
	//   29   41:istore_1        
		} while(true);
	//   30   42:goto            20
		if(true) goto _L4; else goto _L3
_L3:
	}

	public boolean add(Element element)
		throws DocumentException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void addTabs(int i)
		throws IOException
	{
		os.write(10);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:bipush          10
	//    3    6:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		for(int j = 0; j < i; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:iload_1         
	//*   8   13:icmpge          32
			os.write(9);
	//    9   16:aload_0         
	//   10   17:getfield        #57  <Field OutputStreamCounter os>
	//   11   20:bipush          9
	//   12   22:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>

	//   13   25:iload_2         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
	//*  17   29:goto            11
	//   18   32:return          
	}

	public void close()
	{
		open = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #39  <Field boolean open>
		try
		{
			os.flush();
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field OutputStreamCounter os>
	//    5    9:invokevirtual   #85  <Method void OutputStreamCounter.flush()>
			if(closeStream)
	//*   6   12:aload_0         
	//*   7   13:getfield        #43  <Field boolean closeStream>
	//*   8   16:ifeq            26
				os.close();
	//    9   19:aload_0         
	//   10   20:getfield        #57  <Field OutputStreamCounter os>
	//   11   23:invokevirtual   #87  <Method void OutputStreamCounter.close()>
			return;
	//   12   26:return          
		}
		catch(IOException ioexception)
	//*  13   27:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//   14   28:new             #89  <Class ExceptionConverter>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokespecial   #92  <Method void ExceptionConverter(Exception)>
	//   18   36:athrow          
		}
	}

	public void flush()
	{
		try
		{
			os.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:invokevirtual   #85  <Method void OutputStreamCounter.flush()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//    5    9:new             #89  <Class ExceptionConverter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #92  <Method void ExceptionConverter(Exception)>
	//    9   17:athrow          
		}
	}

	public boolean isCloseStream()
	{
		return closeStream;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean closeStream>
	//    2    4:ireturn         
	}

	public boolean isPaused()
	{
		return pause;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean pause>
	//    2    4:ireturn         
	}

	public boolean newPage()
	{
		return open;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean open>
	//    2    4:ifne            9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public void open()
	{
		open = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean open>
	//    3    5:return          
	}

	public void pause()
	{
		pause = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #41  <Field boolean pause>
	//    3    5:return          
	}

	public void resetPageCount()
	{
	//    0    0:return          
	}

	public void resume()
	{
		pause = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #41  <Field boolean pause>
	//    3    5:return          
	}

	public void setCloseStream(boolean flag)
	{
		closeStream = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean closeStream>
	//    3    5:return          
	}

	public boolean setMarginMirroring(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setMarginMirroringTopBottom(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setMargins(float f, float f1, float f2, float f3)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setPageCount(int i)
	{
	//    0    0:return          
	}

	public boolean setPageSize(Rectangle rectangle)
	{
		pageSize = rectangle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field Rectangle pageSize>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	protected void write(String s)
		throws IOException
	{
		os.write(getISOBytes(s));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:aload_1         
	//    3    5:invokestatic    #113 <Method byte[] getISOBytes(String)>
	//    4    8:invokevirtual   #116 <Method void OutputStreamCounter.write(byte[])>
	//    5   11:return          
	}

	protected void write(String s, String s1)
		throws IOException
	{
		os.write(32);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:bipush          32
	//    3    6:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		write(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #119 <Method void write(String)>
		os.write(61);
	//    7   14:aload_0         
	//    8   15:getfield        #57  <Field OutputStreamCounter os>
	//    9   18:bipush          61
	//   10   20:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		os.write(34);
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field OutputStreamCounter os>
	//   13   27:bipush          34
	//   14   29:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		write(s1);
	//   15   32:aload_0         
	//   16   33:aload_2         
	//   17   34:invokevirtual   #119 <Method void write(String)>
		os.write(34);
	//   18   37:aload_0         
	//   19   38:getfield        #57  <Field OutputStreamCounter os>
	//   20   41:bipush          34
	//   21   43:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
	//   22   46:return          
	}

	protected void writeEnd()
		throws IOException
	{
		os.write(32);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:bipush          32
	//    3    6:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		os.write(47);
	//    4    9:aload_0         
	//    5   10:getfield        #57  <Field OutputStreamCounter os>
	//    6   13:bipush          47
	//    7   15:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		os.write(62);
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field OutputStreamCounter os>
	//   10   22:bipush          62
	//   11   24:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
	//   12   27:return          
	}

	protected void writeEnd(String s)
		throws IOException
	{
		os.write(60);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:bipush          60
	//    3    6:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		os.write(47);
	//    4    9:aload_0         
	//    5   10:getfield        #57  <Field OutputStreamCounter os>
	//    6   13:bipush          47
	//    7   15:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		write(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #119 <Method void write(String)>
		os.write(62);
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field OutputStreamCounter os>
	//   13   27:bipush          62
	//   14   29:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
	//   15   32:return          
	}

	protected boolean writeMarkupAttributes(Properties properties)
		throws IOException
	{
		if(properties == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String s;
		for(Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); write(s, properties.getProperty(s)))
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #128 <Method Set Properties.keySet()>
	//*   6   10:invokeinterface #134 <Method Iterator Set.iterator()>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #139 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            48
			s = String.valueOf(iterator.next());
	//   11   25:aload_2         
	//   12   26:invokeinterface #143 <Method Object Iterator.next()>
	//   13   31:invokestatic    #147 <Method String String.valueOf(Object)>
	//   14   34:astore_3        

	//   15   35:aload_0         
	//   16   36:aload_3         
	//   17   37:aload_1         
	//   18   38:aload_3         
	//   19   39:invokevirtual   #151 <Method String Properties.getProperty(String)>
	//   20   42:invokevirtual   #153 <Method void write(String, String)>
	//*  21   45:goto            16
		properties.clear();
	//   22   48:aload_1         
	//   23   49:invokevirtual   #156 <Method void Properties.clear()>
		return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
	}

	protected void writeStart(String s)
		throws IOException
	{
		os.write(60);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field OutputStreamCounter os>
	//    2    4:bipush          60
	//    3    6:invokevirtual   #81  <Method void OutputStreamCounter.write(int)>
		write(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #119 <Method void write(String)>
	//    7   14:return          
	}

	public static final byte EQUALS = 61;
	public static final byte FORWARD = 47;
	public static final byte GT = 62;
	public static final byte LT = 60;
	public static final byte NEWLINE = 10;
	public static final byte QUOTE = 34;
	public static final byte SPACE = 32;
	public static final byte TAB = 9;
	protected boolean closeStream;
	protected Document document;
	protected boolean open;
	protected OutputStreamCounter os;
	protected Rectangle pageSize;
	protected boolean pause;
}
