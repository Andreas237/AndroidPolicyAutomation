// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package ch.qos.logback.core:
//			UnsynchronizedAppenderBase, Layout

public class OutputStreamAppender extends UnsynchronizedAppenderBase
{

	public OutputStreamAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void UnsynchronizedAppenderBase()>
		lock = new LogbackLock();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class LogbackLock>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void LogbackLock()>
	//    6   12:putfield        #21  <Field LogbackLock lock>
	//    7   15:return          
	}

	protected void append(Object obj)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean isStarted()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			subAppend(obj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #31  <Method void subAppend(Object)>
			return;
	//    7   13:return          
		}
	}

	protected void closeOutputStream()
	{
		if(outputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field OutputStream outputStream>
	//*   2    4:ifnull          40
			try
			{
				encoderClose();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #41  <Method void encoderClose()>
				outputStream.close();
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field OutputStream outputStream>
	//    7   15:invokevirtual   #46  <Method void OutputStream.close()>
				outputStream = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #38  <Field OutputStream outputStream>
				return;
	//   11   23:return          
			}
			catch(IOException ioexception)
	//*  12   24:astore_1        
			{
				addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus("Could not close output stream for OutputStreamAppender.", ((Object) (this)), ((Throwable) (ioexception))))));
	//   13   25:aload_0         
	//   14   26:new             #48  <Class ErrorStatus>
	//   15   29:dup             
	//   16   30:ldc1            #50  <String "Could not close output stream for OutputStreamAppender.">
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokespecial   #53  <Method void ErrorStatus(String, Object, Throwable)>
	//   20   37:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
			}
	//   21   40:return          
	}

	void encoderClose()
	{
		if(encoder != null && outputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Encoder encoder>
	//*   2    4:ifnull          78
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field OutputStream outputStream>
	//*   5   11:ifnull          78
			try
			{
				encoder.close();
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field Encoder encoder>
	//    8   18:invokeinterface #62  <Method void Encoder.close()>
				return;
	//    9   23:return          
			}
			catch(IOException ioexception)
	//*  10   24:astore_1        
			{
				started = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #66  <Field boolean started>
				StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #68  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #69  <Method void StringBuilder()>
	//   17   37:astore_2        
				stringbuilder.append("Failed to write footer for appender named [");
	//   18   38:aload_2         
	//   19   39:ldc1            #71  <String "Failed to write footer for appender named [">
	//   20   41:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
				stringbuilder.append(name);
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #78  <Field String name>
	//   25   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
				stringbuilder.append("].");
	//   27   54:aload_2         
	//   28   55:ldc1            #80  <String "].">
	//   29   57:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
				addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this)), ((Throwable) (ioexception))))));
	//   31   61:aload_0         
	//   32   62:new             #48  <Class ErrorStatus>
	//   33   65:dup             
	//   34   66:aload_2         
	//   35   67:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokespecial   #53  <Method void ErrorStatus(String, Object, Throwable)>
	//   39   75:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
			}
	//   40   78:return          
	}

	void encoderInit()
	{
		if(encoder != null && outputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Encoder encoder>
	//*   2    4:ifnull          82
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field OutputStream outputStream>
	//*   5   11:ifnull          82
			try
			{
				encoder.init(outputStream);
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field Encoder encoder>
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field OutputStream outputStream>
	//   10   22:invokeinterface #89  <Method void Encoder.init(OutputStream)>
				return;
	//   11   27:return          
			}
			catch(IOException ioexception)
	//*  12   28:astore_1        
			{
				started = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #66  <Field boolean started>
				StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #68  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #69  <Method void StringBuilder()>
	//   19   41:astore_2        
				stringbuilder.append("Failed to initialize encoder for appender named [");
	//   20   42:aload_2         
	//   21   43:ldc1            #91  <String "Failed to initialize encoder for appender named [">
	//   22   45:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
				stringbuilder.append(name);
	//   24   49:aload_2         
	//   25   50:aload_0         
	//   26   51:getfield        #78  <Field String name>
	//   27   54:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
				stringbuilder.append("].");
	//   29   58:aload_2         
	//   30   59:ldc1            #80  <String "].">
	//   31   61:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
				addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this)), ((Throwable) (ioexception))))));
	//   33   65:aload_0         
	//   34   66:new             #48  <Class ErrorStatus>
	//   35   69:dup             
	//   36   70:aload_2         
	//   37   71:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokespecial   #53  <Method void ErrorStatus(String, Object, Throwable)>
	//   41   79:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
			}
	//   42   82:return          
	}

	public Encoder getEncoder()
	{
		return encoder;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Encoder encoder>
	//    2    4:areturn         
	}

	public OutputStream getOutputStream()
	{
		return outputStream;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field OutputStream outputStream>
	//    2    4:areturn         
	}

	public void setEncoder(Encoder encoder1)
	{
		encoder = encoder1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field Encoder encoder>
	//    3    5:return          
	}

	public void setLayout(Layout layout)
	{
		addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "This appender no longer admits a layout as a sub-component, set an encoder instead.">
	//    2    3:invokevirtual   #107 <Method void addWarn(String)>
		addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
	//    3    6:aload_0         
	//    4    7:ldc1            #109 <String "To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.">
	//    5    9:invokevirtual   #107 <Method void addWarn(String)>
		addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
	//    6   12:aload_0         
	//    7   13:ldc1            #111 <String "See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details">
	//    8   15:invokevirtual   #107 <Method void addWarn(String)>
		LayoutWrappingEncoder layoutwrappingencoder = new LayoutWrappingEncoder();
	//    9   18:new             #113 <Class LayoutWrappingEncoder>
	//   10   21:dup             
	//   11   22:invokespecial   #114 <Method void LayoutWrappingEncoder()>
	//   12   25:astore_2        
		layoutwrappingencoder.setLayout(layout);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #116 <Method void LayoutWrappingEncoder.setLayout(Layout)>
		layoutwrappingencoder.setContext(context);
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:getfield        #120 <Field Context context>
	//   19   36:invokevirtual   #124 <Method void LayoutWrappingEncoder.setContext(Context)>
		encoder = ((Encoder) (layoutwrappingencoder));
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #59  <Field Encoder encoder>
	//   23   44:return          
	}

	public void setOutputStream(OutputStream outputstream)
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field LogbackLock lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				closeOutputStream();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #128 <Method void closeOutputStream()>
				outputStream = outputstream;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #38  <Field OutputStream outputStream>
				if(encoder != null)
					break label0;
	//   10   16:aload_0         
	//   11   17:getfield        #59  <Field Encoder encoder>
	//   12   20:ifnonnull       32
				addWarn("Encoder has not been set. Cannot invoke its init method.");
	//   13   23:aload_0         
	//   14   24:ldc1            #130 <String "Encoder has not been set. Cannot invoke its init method.">
	//   15   26:invokevirtual   #107 <Method void addWarn(String)>
			}
	//   16   29:aload_2         
	//   17   30:monitorexit     
			return;
	//   18   31:return          
		}
		encoderInit();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #132 <Method void encoderInit()>
		logbacklock;
	//   21   36:aload_2         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		return;
	//   23   38:return          
		outputstream;
	//   24   39:astore_1        
		logbacklock;
	//   25   40:aload_2         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		throw outputstream;
	//   27   42:aload_1         
	//   28   43:athrow          
	}

	public void start()
	{
		int i;
		if(encoder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Encoder encoder>
	//*   2    4:ifnonnull       59
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #68  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #69  <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("No encoder set for the appender named \"");
	//    7   15:aload_3         
	//    8   16:ldc1            #135 <String "No encoder set for the appender named \"">
	//    9   18:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(name);
	//   11   22:aload_3         
	//   12   23:aload_0         
	//   13   24:getfield        #78  <Field String name>
	//   14   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append("\".");
	//   16   31:aload_3         
	//   17   32:ldc1            #137 <String "\".">
	//   18   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this))))));
	//   20   38:aload_0         
	//   21   39:new             #48  <Class ErrorStatus>
	//   22   42:dup             
	//   23   43:aload_3         
	//   24   44:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   25   47:aload_0         
	//   26   48:invokespecial   #140 <Method void ErrorStatus(String, Object)>
	//   27   51:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
			i = 1;
	//   28   54:iconst_1        
	//   29   55:istore_1        
		} else
	//*  30   56:goto            61
		{
			i = 0;
	//   31   59:iconst_0        
	//   32   60:istore_1        
		}
		int j = i;
	//   33   61:iload_1         
	//   34   62:istore_2        
		if(outputStream == null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #38  <Field OutputStream outputStream>
	//*  37   67:ifnonnull       121
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   70:new             #68  <Class StringBuilder>
	//   39   73:dup             
	//   40   74:invokespecial   #69  <Method void StringBuilder()>
	//   41   77:astore_3        
			stringbuilder1.append("No output stream set for the appender named \"");
	//   42   78:aload_3         
	//   43   79:ldc1            #142 <String "No output stream set for the appender named \"">
	//   44   81:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			stringbuilder1.append(name);
	//   46   85:aload_3         
	//   47   86:aload_0         
	//   48   87:getfield        #78  <Field String name>
	//   49   90:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   50   93:pop             
			stringbuilder1.append("\".");
	//   51   94:aload_3         
	//   52   95:ldc1            #137 <String "\".">
	//   53   97:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
			addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder1.toString(), ((Object) (this))))));
	//   55  101:aload_0         
	//   56  102:new             #48  <Class ErrorStatus>
	//   57  105:dup             
	//   58  106:aload_3         
	//   59  107:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   60  110:aload_0         
	//   61  111:invokespecial   #140 <Method void ErrorStatus(String, Object)>
	//   62  114:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
			j = i + 1;
	//   63  117:iload_1         
	//   64  118:iconst_1        
	//   65  119:iadd            
	//   66  120:istore_2        
		}
		if(j == 0)
	//*  67  121:iload_2         
	//*  68  122:ifne            129
			super.start();
	//   69  125:aload_0         
	//   70  126:invokespecial   #144 <Method void UnsynchronizedAppenderBase.start()>
	//   71  129:return          
	}

	public void stop()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field LogbackLock lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			closeOutputStream();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #128 <Method void closeOutputStream()>
			super.stop();
	//    7   11:aload_0         
	//    8   12:invokespecial   #147 <Method void UnsynchronizedAppenderBase.stop()>
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		exception;
	//   12   18:astore_2        
		logbacklock;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw exception;
	//   15   21:aload_2         
	//   16   22:athrow          
	}

	protected void subAppend(Object obj)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(obj instanceof DeferredProcessingAware)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #149 <Class DeferredProcessingAware>
	//*   6   12:ifeq            24
			((DeferredProcessingAware)obj).prepareForDeferredProcessing();
	//    7   15:aload_1         
	//    8   16:checkcast       #149 <Class DeferredProcessingAware>
	//    9   19:invokeinterface #152 <Method void DeferredProcessingAware.prepareForDeferredProcessing()>
		synchronized(lock)
	//*  10   24:aload_0         
	//*  11   25:getfield        #21  <Field LogbackLock lock>
	//*  12   28:astore_2        
	//*  13   29:aload_2         
	//*  14   30:monitorenter    
		{
			writeOut(obj);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #155 <Method void writeOut(Object)>
		}
	//   18   36:aload_2         
	//   19   37:monitorexit     
		return;
	//   20   38:return          
		obj;
	//   21   39:astore_1        
		logbacklock;
	//   22   40:aload_2         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		try
		{
			throw obj;
	//   24   42:aload_1         
	//   25   43:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  26   44:astore_1        
		{
			started = false;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #66  <Field boolean started>
		}
		addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus("IO failure in appender", ((Object) (this)), ((Throwable) (obj))))));
	//   30   50:aload_0         
	//   31   51:new             #48  <Class ErrorStatus>
	//   32   54:dup             
	//   33   55:ldc1            #157 <String "IO failure in appender">
	//   34   57:aload_0         
	//   35   58:aload_1         
	//   36   59:invokespecial   #53  <Method void ErrorStatus(String, Object, Throwable)>
	//   37   62:invokevirtual   #57  <Method void addStatus(ch.qos.logback.core.status.Status)>
		return;
	//   38   65:return          
	}

	protected void writeOut(Object obj)
	{
		encoder.doEncode(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Encoder encoder>
	//    2    4:aload_1         
	//    3    5:invokeinterface #160 <Method void Encoder.doEncode(Object)>
	//    4   10:return          
	}

	protected Encoder encoder;
	protected LogbackLock lock;
	private OutputStream outputStream;
}
