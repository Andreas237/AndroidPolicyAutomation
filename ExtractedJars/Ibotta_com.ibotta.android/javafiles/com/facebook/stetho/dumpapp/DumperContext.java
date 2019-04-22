// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import org.apache.commons.cli.CommandLineParser;

public class DumperContext
{

	protected DumperContext(DumperContext dumpercontext, List list)
	{
		this(dumpercontext.getStdin(), dumpercontext.getStdout(), dumpercontext.getStderr(), dumpercontext.getParser(), list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method InputStream getStdin()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method PrintStream getStdout()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method PrintStream getStderr()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method CommandLineParser getParser()>
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void DumperContext(InputStream, PrintStream, PrintStream, CommandLineParser, List)>
	//   11   21:return          
	}

	public DumperContext(InputStream inputstream, PrintStream printstream, PrintStream printstream1, CommandLineParser commandlineparser, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mStdin = (InputStream)Util.throwIfNull(((Object) (inputstream)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #49  <Class InputStream>
	//    6   12:putfield        #51  <Field InputStream mStdin>
		mStdout = (PrintStream)Util.throwIfNull(((Object) (printstream)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//   10   20:checkcast       #53  <Class PrintStream>
	//   11   23:putfield        #55  <Field PrintStream mStdout>
		mStderr = (PrintStream)Util.throwIfNull(((Object) (printstream1)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//   15   31:checkcast       #53  <Class PrintStream>
	//   16   34:putfield        #57  <Field PrintStream mStderr>
		mParser = (CommandLineParser)Util.throwIfNull(((Object) (commandlineparser)));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//   20   43:checkcast       #59  <Class CommandLineParser>
	//   21   46:putfield        #61  <Field CommandLineParser mParser>
		mArgs = (List)Util.throwIfNull(((Object) (list)));
	//   22   49:aload_0         
	//   23   50:aload           5
	//   24   52:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//   25   55:checkcast       #63  <Class List>
	//   26   58:putfield        #65  <Field List mArgs>
	//   27   61:return          
	}

	public List getArgsAsList()
	{
		return mArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mArgs>
	//    2    4:areturn         
	}

	public CommandLineParser getParser()
	{
		return mParser;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field CommandLineParser mParser>
	//    2    4:areturn         
	}

	public PrintStream getStderr()
	{
		return mStderr;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field PrintStream mStderr>
	//    2    4:areturn         
	}

	public InputStream getStdin()
	{
		return mStdin;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field InputStream mStdin>
	//    2    4:areturn         
	}

	public PrintStream getStdout()
	{
		return mStdout;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PrintStream mStdout>
	//    2    4:areturn         
	}

	private final List mArgs;
	private final CommandLineParser mParser;
	private final PrintStream mStderr;
	private final InputStream mStdin;
	private final PrintStream mStdout;
}
