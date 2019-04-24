// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.io.PrintStream;
import java.io.PrintWriter;

public class ExceptionConverter extends RuntimeException
{

	public ExceptionConverter(Exception exception)
	{
		super(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void RuntimeException(Throwable)>
		ex = exception;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #19  <Field Exception ex>
		if(exception instanceof RuntimeException)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #4   <Class RuntimeException>
	//*   8   14:ifeq            26
			exception = "";
	//    9   17:ldc1            #21  <String "">
	//   10   19:astore_1        
		else
	//*  11   20:aload_0         
	//*  12   21:aload_1         
	//*  13   22:putfield        #23  <Field String prefix>
	//*  14   25:return          
			exception = "ExceptionConverter: ";
	//   15   26:ldc1            #25  <String "ExceptionConverter: ">
	//   16   28:astore_1        
		prefix = ((String) (exception));
	//*  17   29:goto            20
	}

	public static final RuntimeException convertException(Exception exception)
	{
		if(exception instanceof RuntimeException)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #4   <Class RuntimeException>
	//*   2    4:ifeq            12
			return (RuntimeException)exception;
	//    3    7:aload_0         
	//    4    8:checkcast       #4   <Class RuntimeException>
	//    5   11:areturn         
		else
			return ((RuntimeException) (new ExceptionConverter(exception)));
	//    6   12:new             #2   <Class ExceptionConverter>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #30  <Method void ExceptionConverter(Exception)>
	//   10   20:areturn         
	}

	public Throwable fillInStackTrace()
	{
		return ((Throwable) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Exception getException()
	{
		return ex;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Exception ex>
	//    2    4:areturn         
	}

	public String getLocalizedMessage()
	{
		return ex.getLocalizedMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Exception ex>
	//    2    4:invokevirtual   #40  <Method String Exception.getLocalizedMessage()>
	//    3    7:areturn         
	}

	public String getMessage()
	{
		return ex.getMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Exception ex>
	//    2    4:invokevirtual   #43  <Method String Exception.getMessage()>
	//    3    7:areturn         
	}

	public void printStackTrace()
	{
		printStackTrace(System.err);
	//    0    0:aload_0         
	//    1    1:getstatic       #51  <Field PrintStream System.err>
	//    2    4:invokevirtual   #54  <Method void printStackTrace(PrintStream)>
	//    3    7:return          
	}

	public void printStackTrace(PrintStream printstream)
	{
		printstream;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		printstream.print(prefix);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #23  <Field String prefix>
	//    5    7:invokevirtual   #60  <Method void PrintStream.print(String)>
		ex.printStackTrace(printstream);
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field Exception ex>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #61  <Method void Exception.printStackTrace(PrintStream)>
		printstream;
	//   10   18:aload_1         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		Exception exception;
		exception;
	//   13   21:astore_2        
		printstream;
	//   14   22:aload_1         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw exception;
	//   16   24:aload_2         
	//   17   25:athrow          
	}

	public void printStackTrace(PrintWriter printwriter)
	{
		printwriter;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		printwriter.print(prefix);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #23  <Field String prefix>
	//    5    7:invokevirtual   #65  <Method void PrintWriter.print(String)>
		ex.printStackTrace(printwriter);
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field Exception ex>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #67  <Method void Exception.printStackTrace(PrintWriter)>
		printwriter;
	//   10   18:aload_1         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		Exception exception;
		exception;
	//   13   21:astore_2        
		printwriter;
	//   14   22:aload_1         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw exception;
	//   16   24:aload_2         
	//   17   25:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append(prefix).append(((Object) (ex))).toString();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String prefix>
	//    5   11:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field Exception ex>
	//    8   18:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   10   24:areturn         
	}

	private static final long serialVersionUID = 0x6d87cb7L;
	private Exception ex;
	private String prefix;
}
