// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.*;
import java.util.*;
import org.apache.commons.cli.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			GlobalOptions, DumpException, DumperPlugin, DumperContext, 
//			DumpappOutputBrokenException

public class Dumper
{

	public Dumper(Iterable iterable)
	{
		this(iterable, ((CommandLineParser) (new GnuParser())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #15  <Class GnuParser>
	//    3    5:dup             
	//    4    6:invokespecial   #18  <Method void GnuParser()>
	//    5    9:invokespecial   #21  <Method void Dumper(Iterable, CommandLineParser)>
	//    6   12:return          
	}

	public Dumper(Iterable iterable, CommandLineParser commandlineparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mDumperPlugins = generatePluginMap(iterable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #29  <Method Map generatePluginMap(Iterable)>
	//    5    9:putfield        #31  <Field Map mDumperPlugins>
		mParser = commandlineparser;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #33  <Field CommandLineParser mParser>
		mGlobalOptions = new GlobalOptions();
	//    9   17:aload_0         
	//   10   18:new             #35  <Class GlobalOptions>
	//   11   21:dup             
	//   12   22:invokespecial   #36  <Method void GlobalOptions()>
	//   13   25:putfield        #38  <Field GlobalOptions mGlobalOptions>
	//   14   28:return          
	}

	private int doDump(InputStream inputstream, PrintStream printstream, PrintStream printstream1, String as[])
		throws ParseException, DumpException
	{
		as = ((String []) (mParser.parse(mGlobalOptions.options, as, true)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field CommandLineParser mParser>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field GlobalOptions mGlobalOptions>
	//    4    8:getfield        #49  <Field org.apache.commons.cli.Options GlobalOptions.options>
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:invokeinterface #55  <Method CommandLine CommandLineParser.parse(org.apache.commons.cli.Options, String[], boolean)>
	//    8   19:astore          4
		if(((CommandLine) (as)).hasOption(mGlobalOptions.optionHelp.getOpt()))
	//*   9   21:aload           4
	//*  10   23:aload_0         
	//*  11   24:getfield        #38  <Field GlobalOptions mGlobalOptions>
	//*  12   27:getfield        #59  <Field Option GlobalOptions.optionHelp>
	//*  13   30:invokevirtual   #65  <Method String Option.getOpt()>
	//*  14   33:invokevirtual   #71  <Method boolean CommandLine.hasOption(String)>
	//*  15   36:ifeq            46
		{
			dumpUsage(printstream);
	//   16   39:aload_0         
	//   17   40:aload_2         
	//   18   41:invokespecial   #75  <Method void dumpUsage(PrintStream)>
			return 0;
	//   19   44:iconst_0        
	//   20   45:ireturn         
		}
		if(((CommandLine) (as)).hasOption(mGlobalOptions.optionListPlugins.getOpt()))
	//*  21   46:aload           4
	//*  22   48:aload_0         
	//*  23   49:getfield        #38  <Field GlobalOptions mGlobalOptions>
	//*  24   52:getfield        #78  <Field Option GlobalOptions.optionListPlugins>
	//*  25   55:invokevirtual   #65  <Method String Option.getOpt()>
	//*  26   58:invokevirtual   #71  <Method boolean CommandLine.hasOption(String)>
	//*  27   61:ifeq            71
		{
			dumpAvailablePlugins(printstream);
	//   28   64:aload_0         
	//   29   65:aload_2         
	//   30   66:invokespecial   #81  <Method void dumpAvailablePlugins(PrintStream)>
			return 0;
	//   31   69:iconst_0        
	//   32   70:ireturn         
		}
		if(!((CommandLine) (as)).getArgList().isEmpty())
	//*  33   71:aload           4
	//*  34   73:invokevirtual   #85  <Method List CommandLine.getArgList()>
	//*  35   76:invokeinterface #91  <Method boolean List.isEmpty()>
	//*  36   81:ifne            95
		{
			dumpPluginOutput(inputstream, printstream, printstream1, ((CommandLine) (as)));
	//   37   84:aload_0         
	//   38   85:aload_1         
	//   39   86:aload_2         
	//   40   87:aload_3         
	//   41   88:aload           4
	//   42   90:invokespecial   #95  <Method void dumpPluginOutput(InputStream, PrintStream, PrintStream, CommandLine)>
			return 0;
	//   43   93:iconst_0        
	//   44   94:ireturn         
		} else
		{
			dumpUsage(printstream1);
	//   45   95:aload_0         
	//   46   96:aload_3         
	//   47   97:invokespecial   #75  <Method void dumpUsage(PrintStream)>
			return 1;
	//   48  100:iconst_1        
	//   49  101:ireturn         
		}
	}

	private void dumpAvailablePlugins(PrintStream printstream)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #98  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void ArrayList()>
	//    3    7:astore_2        
		for(Iterator iterator = mDumperPlugins.values().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (((DumperPlugin)iterator.next()).getName()))));
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field Map mDumperPlugins>
	//    6   12:invokeinterface #105 <Method Collection Map.values()>
	//    7   17:invokeinterface #111 <Method Iterator Collection.iterator()>
	//    8   22:astore_3        
	//    9   23:aload_3         
	//   10   24:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            56
	//   12   32:aload_2         
	//   13   33:aload_3         
	//   14   34:invokeinterface #120 <Method Object Iterator.next()>
	//   15   39:checkcast       #122 <Class DumperPlugin>
	//   16   42:invokeinterface #125 <Method String DumperPlugin.getName()>
	//   17   47:invokeinterface #129 <Method boolean List.add(Object)>
	//   18   52:pop             
	//*  19   53:goto            23
		Collections.sort(((List) (obj)));
	//   20   56:aload_2         
	//   21   57:invokestatic    #135 <Method void Collections.sort(List)>
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); printstream.println((String)((Iterator) (obj)).next()));
	//   22   60:aload_2         
	//   23   61:invokeinterface #136 <Method Iterator List.iterator()>
	//   24   66:astore_2        
	//   25   67:aload_2         
	//   26   68:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//   27   73:ifeq            92
	//   28   76:aload_1         
	//   29   77:aload_2         
	//   30   78:invokeinterface #120 <Method Object Iterator.next()>
	//   31   83:checkcast       #138 <Class String>
	//   32   86:invokevirtual   #144 <Method void PrintStream.println(String)>
	//*  33   89:goto            67
	//   34   92:return          
	}

	private void dumpPluginOutput(InputStream inputstream, PrintStream printstream, PrintStream printstream1, CommandLine commandline)
		throws DumpException
	{
		ArrayList arraylist = new ArrayList(((Collection) (commandline.getArgList())));
	//    0    0:new             #98  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:invokevirtual   #85  <Method List CommandLine.getArgList()>
	//    4    9:invokespecial   #147 <Method void ArrayList(Collection)>
	//    5   12:astore          5
		if(((List) (arraylist)).size() < 1)
	//*   6   14:aload           5
	//*   7   16:invokeinterface #151 <Method int List.size()>
	//*   8   21:iconst_1        
	//*   9   22:icmpge          35
			throw new DumpException("Expected plugin argument");
	//   10   25:new             #45  <Class DumpException>
	//   11   28:dup             
	//   12   29:ldc1            #153 <String "Expected plugin argument">
	//   13   31:invokespecial   #155 <Method void DumpException(String)>
	//   14   34:athrow          
		commandline = ((CommandLine) ((String)((List) (arraylist)).remove(0)));
	//   15   35:aload           5
	//   16   37:iconst_0        
	//   17   38:invokeinterface #159 <Method Object List.remove(int)>
	//   18   43:checkcast       #138 <Class String>
	//   19   46:astore          4
		DumperPlugin dumperplugin = (DumperPlugin)mDumperPlugins.get(((Object) (commandline)));
	//   20   48:aload_0         
	//   21   49:getfield        #31  <Field Map mDumperPlugins>
	//   22   52:aload           4
	//   23   54:invokeinterface #163 <Method Object Map.get(Object)>
	//   24   59:checkcast       #122 <Class DumperPlugin>
	//   25   62:astore          6
		if(dumperplugin == null)
	//*  26   64:aload           6
	//*  27   66:ifnonnull       110
		{
			inputstream = ((InputStream) (new StringBuilder()));
	//   28   69:new             #165 <Class StringBuilder>
	//   29   72:dup             
	//   30   73:invokespecial   #166 <Method void StringBuilder()>
	//   31   76:astore_1        
			((StringBuilder) (inputstream)).append("No plugin named '");
	//   32   77:aload_1         
	//   33   78:ldc1            #168 <String "No plugin named '">
	//   34   80:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   35   83:pop             
			((StringBuilder) (inputstream)).append(((String) (commandline)));
	//   36   84:aload_1         
	//   37   85:aload           4
	//   38   87:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   39   90:pop             
			((StringBuilder) (inputstream)).append("'");
	//   40   91:aload_1         
	//   41   92:ldc1            #174 <String "'">
	//   42   94:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   43   97:pop             
			throw new DumpException(((StringBuilder) (inputstream)).toString());
	//   44   98:new             #45  <Class DumpException>
	//   45  101:dup             
	//   46  102:aload_1         
	//   47  103:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   48  106:invokespecial   #155 <Method void DumpException(String)>
	//   49  109:athrow          
		} else
		{
			dumperplugin.dump(new DumperContext(inputstream, printstream, printstream1, mParser, ((List) (arraylist))));
	//   50  110:aload           6
	//   51  112:new             #179 <Class DumperContext>
	//   52  115:dup             
	//   53  116:aload_1         
	//   54  117:aload_2         
	//   55  118:aload_3         
	//   56  119:aload_0         
	//   57  120:getfield        #33  <Field CommandLineParser mParser>
	//   58  123:aload           5
	//   59  125:invokespecial   #182 <Method void DumperContext(InputStream, PrintStream, PrintStream, CommandLineParser, List)>
	//   60  128:invokeinterface #186 <Method void DumperPlugin.dump(DumperContext)>
			return;
	//   61  133:return          
		}
	}

	private void dumpUsage(PrintStream printstream)
	{
		HelpFormatter helpformatter;
		helpformatter = new HelpFormatter();
	//    0    0:new             #188 <Class HelpFormatter>
	//    1    3:dup             
	//    2    4:invokespecial   #189 <Method void HelpFormatter()>
	//    3    7:astore_2        
		printstream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
	//    4    8:aload_1         
	//    5    9:ldc1            #191 <String "Usage: dumpapp [options] <plugin> [plugin-options]">
	//    6   11:invokevirtual   #144 <Method void PrintStream.println(String)>
		printstream = ((PrintStream) (new PrintWriter(((java.io.OutputStream) (printstream)))));
	//    7   14:new             #193 <Class PrintWriter>
	//    8   17:dup             
	//    9   18:aload_1         
	//   10   19:invokespecial   #196 <Method void PrintWriter(java.io.OutputStream)>
	//   11   22:astore_1        
		helpformatter.printOptions(((PrintWriter) (printstream)), helpformatter.getWidth(), mGlobalOptions.options, helpformatter.getLeftPadding(), helpformatter.getDescPadding());
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #199 <Method int HelpFormatter.getWidth()>
	//   16   29:aload_0         
	//   17   30:getfield        #38  <Field GlobalOptions mGlobalOptions>
	//   18   33:getfield        #49  <Field org.apache.commons.cli.Options GlobalOptions.options>
	//   19   36:aload_2         
	//   20   37:invokevirtual   #202 <Method int HelpFormatter.getLeftPadding()>
	//   21   40:aload_2         
	//   22   41:invokevirtual   #205 <Method int HelpFormatter.getDescPadding()>
	//   23   44:invokevirtual   #209 <Method void HelpFormatter.printOptions(PrintWriter, int, org.apache.commons.cli.Options, int, int)>
		((PrintWriter) (printstream)).flush();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #212 <Method void PrintWriter.flush()>
		return;
	//   26   51:return          
		Exception exception;
		exception;
	//   27   52:astore_2        
		((PrintWriter) (printstream)).flush();
	//   28   53:aload_1         
	//   29   54:invokevirtual   #212 <Method void PrintWriter.flush()>
		throw exception;
	//   30   57:aload_2         
	//   31   58:athrow          
	}

	private static Map generatePluginMap(Iterable iterable)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #214 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #215 <Method void HashMap()>
	//    3    7:astore_1        
		DumperPlugin dumperplugin;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); ((Map) (hashmap)).put(((Object) (dumperplugin.getName())), ((Object) (dumperplugin))))
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #218 <Method Iterator Iterable.iterator()>
	//*   6   14:astore_0        
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            51
			dumperplugin = (DumperPlugin)((Iterator) (iterable)).next();
	//   10   24:aload_0         
	//   11   25:invokeinterface #120 <Method Object Iterator.next()>
	//   12   30:checkcast       #122 <Class DumperPlugin>
	//   13   33:astore_2        

	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:invokeinterface #125 <Method String DumperPlugin.getName()>
	//   17   41:aload_2         
	//   18   42:invokeinterface #222 <Method Object Map.put(Object, Object)>
	//   19   47:pop             
	//*  20   48:goto            15
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   21   51:aload_1         
	//   22   52:invokestatic    #226 <Method Map Collections.unmodifiableMap(Map)>
	//   23   55:areturn         
	}

	public int dump(InputStream inputstream, PrintStream printstream, PrintStream printstream1, String as[])
	{
		int i;
		try
		{
			i = doDump(inputstream, printstream, printstream1, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #233 <Method int doDump(InputStream, PrintStream, PrintStream, String[])>
	//    6    9:istore          5
		}
	//*   7   11:iload           5
	//*   8   13:ireturn         
	//*   9   14:astore_1        
	//*  10   15:aload_1         
	//*  11   16:aload_3         
	//*  12   17:invokestatic    #239 <Method void ThrowableExtension.printStackTrace(Throwable, PrintStream)>
	//*  13   20:iconst_1        
	//*  14   21:ireturn         
	//*  15   22:astore_1        
	//*  16   23:aload_1         
	//*  17   24:athrow          
	//*  18   25:astore_1        
	//*  19   26:aload_3         
	//*  20   27:aload_1         
	//*  21   28:invokevirtual   #242 <Method String DumpException.getMessage()>
	//*  22   31:invokevirtual   #144 <Method void PrintStream.println(String)>
	//*  23   34:iconst_1        
	//*  24   35:ireturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  25   36:astore_1        
		{
			printstream1.println(((ParseException) (inputstream)).getMessage());
	//   26   37:aload_3         
	//   27   38:aload_1         
	//   28   39:invokevirtual   #243 <Method String ParseException.getMessage()>
	//   29   42:invokevirtual   #144 <Method void PrintStream.println(String)>
			dumpUsage(printstream1);
	//   30   45:aload_0         
	//   31   46:aload_3         
	//   32   47:invokespecial   #75  <Method void dumpUsage(PrintStream)>
			return 1;
	//   33   50:iconst_1        
	//   34   51:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			printstream1.println(((DumpException) (inputstream)).getMessage());
			return 1;
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			throw inputstream;
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			ThrowableExtension.printStackTrace(((Throwable) (inputstream)), printstream1);
			return 1;
		}
		return i;
	}

	private final Map mDumperPlugins;
	private final GlobalOptions mGlobalOptions;
	private final CommandLineParser mParser;
}
