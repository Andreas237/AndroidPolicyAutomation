// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import java.io.OutputStream;
import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			ConsoleTarget

static final class ConsoleTarget$2 extends OutputStream
{

	public void flush()
	{
		System.err.flush();
	//    0    0:getstatic       #18  <Field PrintStream System.err>
	//    1    3:invokevirtual   #22  <Method void PrintStream.flush()>
	//    2    6:return          
	}

	public void write(int i)
	{
		System.err.write(i);
	//    0    0:getstatic       #18  <Field PrintStream System.err>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #26  <Method void PrintStream.write(int)>
	//    3    7:return          
	}

	public void write(byte abyte0[])
	{
		System.err.write(abyte0);
	//    0    0:getstatic       #18  <Field PrintStream System.err>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #29  <Method void PrintStream.write(byte[])>
	//    3    7:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		System.err.write(abyte0, i, j);
	//    0    0:getstatic       #18  <Field PrintStream System.err>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #32  <Method void PrintStream.write(byte[], int, int)>
	//    5    9:return          
	}

	ConsoleTarget$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void OutputStream()>
	//    2    4:return          
	}
}
