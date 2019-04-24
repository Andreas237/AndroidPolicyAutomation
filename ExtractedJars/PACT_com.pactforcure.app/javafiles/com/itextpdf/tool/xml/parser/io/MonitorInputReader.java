// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.io;

import java.io.*;

// Referenced classes of package com.itextpdf.tool.xml.parser.io:
//			ParserMonitor

public class MonitorInputReader extends BufferedReader
{

	public MonitorInputReader(Reader reader, ParserMonitor parsermonitor)
	{
		super(reader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void BufferedReader(Reader)>
		monitor = parsermonitor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field ParserMonitor monitor>
	//    6   10:return          
	}

	public int read(char ac[])
		throws IOException
	{
		int i = super.read(ac);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method int BufferedReader.read(char[])>
	//    3    5:istore_2        
		monitor.read(ac);
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field ParserMonitor monitor>
	//    6   10:aload_1         
	//    7   11:invokeinterface #25  <Method void ParserMonitor.read(char[])>
		return i;
	//    8   16:iload_2         
	//    9   17:ireturn         
	}

	private final ParserMonitor monitor;
}
