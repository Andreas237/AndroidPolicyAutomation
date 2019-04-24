// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import java.io.*;
import java.nio.charset.Charset;

// Referenced classes of package ch.qos.logback.core.encoder:
//			EncoderBase

public class LayoutWrappingEncoder extends EncoderBase
{

	public LayoutWrappingEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void EncoderBase()>
		immediateFlush = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean immediateFlush>
	//    5    9:return          
	}

	private void appendIfNotNull(StringBuilder stringbuilder, String s)
	{
		if(s != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			stringbuilder.append(s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    5    9:pop             
	//    6   10:return          
	}

	private byte[] convertToBytes(String s)
	{
		if(charset == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Charset charset>
	//*   2    4:ifnonnull       12
			return s.getBytes();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #39  <Method byte[] String.getBytes()>
	//    5   11:areturn         
		try
		{
			s = ((String) (s.getBytes(charset.name())));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field Charset charset>
	//    9   17:invokevirtual   #45  <Method String Charset.name()>
	//   10   20:invokevirtual   #47  <Method byte[] String.getBytes(String)>
	//   11   23:astore_1        
		}
	//*  12   24:aload_1         
	//*  13   25:areturn         
	//*  14   26:new             #49  <Class IllegalStateException>
	//*  15   29:dup             
	//*  16   30:ldc1            #51  <String "An existing charset cannot possibly be unsupported.">
	//*  17   32:invokespecial   #54  <Method void IllegalStateException(String)>
	//*  18   35:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new IllegalStateException("An existing charset cannot possibly be unsupported.");
		}
		return ((byte []) (s));
	//*  19   36:astore_1        
	//*  20   37:goto            26
	}

	public void close()
	{
		writeFooter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method void writeFooter()>
	//    2    4:return          
	}

	public void doEncode(Object obj)
	{
		obj = ((Object) (layout.doLayout(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Layout layout>
	//    2    4:aload_1         
	//    3    5:invokeinterface #68  <Method String Layout.doLayout(Object)>
	//    4   10:astore_1        
		outputStream.write(convertToBytes(((String) (obj))));
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field OutputStream outputStream>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #74  <Method byte[] convertToBytes(String)>
	//   10   20:invokevirtual   #80  <Method void OutputStream.write(byte[])>
		if(immediateFlush)
	//*  11   23:aload_0         
	//*  12   24:getfield        #18  <Field boolean immediateFlush>
	//*  13   27:ifeq            37
			outputStream.flush();
	//   14   30:aload_0         
	//   15   31:getfield        #72  <Field OutputStream outputStream>
	//   16   34:invokevirtual   #83  <Method void OutputStream.flush()>
	//   17   37:return          
	}

	public Charset getCharset()
	{
		return charset;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Charset charset>
	//    2    4:areturn         
	}

	public Layout getLayout()
	{
		return layout;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Layout layout>
	//    2    4:areturn         
	}

	public void init(OutputStream outputstream)
	{
		super.init(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void EncoderBase.init(OutputStream)>
		writeHeader();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #97  <Method void writeHeader()>
	//    5    9:return          
	}

	public boolean isImmediateFlush()
	{
		return immediateFlush;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean immediateFlush>
	//    2    4:ireturn         
	}

	public boolean isStarted()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCharset(Charset charset1)
	{
		charset = charset1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Charset charset>
	//    3    5:return          
	}

	public void setImmediateFlush(boolean flag)
	{
		immediateFlush = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean immediateFlush>
	//    3    5:return          
	}

	public void setLayout(Layout layout1)
	{
		layout = layout1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Layout layout>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #111 <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #111 <Field boolean started>
		if(outputStream == null)
			break MISSING_BLOCK_LABEL_19;
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field OutputStream outputStream>
	//    5    9:ifnull          19
		outputStream.flush();
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field OutputStream outputStream>
	//    8   16:invokevirtual   #83  <Method void OutputStream.flush()>
		return;
	//    9   19:return          
		IOException ioexception;
		ioexception;
	//   10   20:astore_1        
	//   11   21:return          
	}

	void writeFooter()
	{
		if(layout != null && outputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Layout layout>
	//*   2    4:ifnull          79
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field OutputStream outputStream>
	//*   5   11:ifnull          79
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #23  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #115 <Method void StringBuilder()>
	//    9   21:astore_1        
			appendIfNotNull(stringbuilder, layout.getPresentationFooter());
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #62  <Field Layout layout>
	//   14   28:invokeinterface #118 <Method String Layout.getPresentationFooter()>
	//   15   33:invokespecial   #120 <Method void appendIfNotNull(StringBuilder, String)>
			appendIfNotNull(stringbuilder, layout.getFileFooter());
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #62  <Field Layout layout>
	//   20   42:invokeinterface #123 <Method String Layout.getFileFooter()>
	//   21   47:invokespecial   #120 <Method void appendIfNotNull(StringBuilder, String)>
			if(stringbuilder.length() > 0)
	//*  22   50:aload_1         
	//*  23   51:invokevirtual   #127 <Method int StringBuilder.length()>
	//*  24   54:ifle            79
			{
				outputStream.write(convertToBytes(stringbuilder.toString()));
	//   25   57:aload_0         
	//   26   58:getfield        #72  <Field OutputStream outputStream>
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #74  <Method byte[] convertToBytes(String)>
	//   31   69:invokevirtual   #80  <Method void OutputStream.write(byte[])>
				outputStream.flush();
	//   32   72:aload_0         
	//   33   73:getfield        #72  <Field OutputStream outputStream>
	//   34   76:invokevirtual   #83  <Method void OutputStream.flush()>
			}
		}
	//   35   79:return          
	}

	void writeHeader()
	{
		if(layout != null && outputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Layout layout>
	//*   2    4:ifnull          87
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field OutputStream outputStream>
	//*   5   11:ifnull          87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #23  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #115 <Method void StringBuilder()>
	//    9   21:astore_1        
			appendIfNotNull(stringbuilder, layout.getFileHeader());
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #62  <Field Layout layout>
	//   14   28:invokeinterface #133 <Method String Layout.getFileHeader()>
	//   15   33:invokespecial   #120 <Method void appendIfNotNull(StringBuilder, String)>
			appendIfNotNull(stringbuilder, layout.getPresentationHeader());
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #62  <Field Layout layout>
	//   20   42:invokeinterface #136 <Method String Layout.getPresentationHeader()>
	//   21   47:invokespecial   #120 <Method void appendIfNotNull(StringBuilder, String)>
			if(stringbuilder.length() > 0)
	//*  22   50:aload_1         
	//*  23   51:invokevirtual   #127 <Method int StringBuilder.length()>
	//*  24   54:ifle            87
			{
				stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   25   57:aload_1         
	//   26   58:getstatic       #142 <Field String CoreConstants.LINE_SEPARATOR>
	//   27   61:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   28   64:pop             
				outputStream.write(convertToBytes(stringbuilder.toString()));
	//   29   65:aload_0         
	//   30   66:getfield        #72  <Field OutputStream outputStream>
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   34   74:invokespecial   #74  <Method byte[] convertToBytes(String)>
	//   35   77:invokevirtual   #80  <Method void OutputStream.write(byte[])>
				outputStream.flush();
	//   36   80:aload_0         
	//   37   81:getfield        #72  <Field OutputStream outputStream>
	//   38   84:invokevirtual   #83  <Method void OutputStream.flush()>
			}
		}
	//   39   87:return          
	}

	private Charset charset;
	private boolean immediateFlush;
	protected Layout layout;
}
