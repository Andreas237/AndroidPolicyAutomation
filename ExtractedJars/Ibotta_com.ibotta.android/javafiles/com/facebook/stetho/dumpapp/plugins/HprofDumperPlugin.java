// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.os.Debug;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class HprofDumperPlugin
	implements DumperPlugin
{

	public HprofDumperPlugin(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context mContext>
	//    5    9:return          
	}

	private void handlePipeOutput(OutputStream outputstream)
		throws DumpException
	{
		File file = mContext.getFileStreamPath("hprof-dump.hprof");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:ldc1            #28  <String "hprof-dump.hprof">
	//    3    6:invokevirtual   #34  <Method File Context.getFileStreamPath(String)>
	//    4    9:astore_2        
		writeHprof(file);
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #38  <Method void writeHprof(File)>
		FileInputStream fileinputstream = new FileInputStream(file);
	//    8   15:new             #40  <Class FileInputStream>
	//    9   18:dup             
	//   10   19:aload_2         
	//   11   20:invokespecial   #42  <Method void FileInputStream(File)>
	//   12   23:astore_3        
		Util.copy(((InputStream) (fileinputstream)), outputstream, new byte[2048]);
	//   13   24:aload_3         
	//   14   25:aload_1         
	//   15   26:sipush          2048
	//   16   29:newarray        byte[]
	//   17   31:invokestatic    #48  <Method void Util.copy(InputStream, OutputStream, byte[])>
		((InputStream) (fileinputstream)).close();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #53  <Method void InputStream.close()>
		if(file.exists())
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #59  <Method boolean File.exists()>
	//*  22   42:ifeq            50
			file.delete();
	//   23   45:aload_2         
	//   24   46:invokevirtual   #62  <Method boolean File.delete()>
	//   25   49:pop             
		return;
	//   26   50:return          
		outputstream;
	//   27   51:astore_1        
		try
		{
			((InputStream) (fileinputstream)).close();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #53  <Method void InputStream.close()>
			throw outputstream;
	//   30   56:aload_1         
	//   31   57:athrow          
		}
	//*  32   58:new             #64  <Class StringBuilder>
	//*  33   61:dup             
	//*  34   62:invokespecial   #65  <Method void StringBuilder()>
	//*  35   65:astore_1        
	//*  36   66:aload_1         
	//*  37   67:ldc1            #67  <String "Failure copying ">
	//*  38   69:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  39   72:pop             
	//*  40   73:aload_1         
	//*  41   74:aload_2         
	//*  42   75:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//*  43   78:pop             
	//*  44   79:aload_1         
	//*  45   80:ldc1            #76  <String " to dumper output">
	//*  46   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  47   85:pop             
	//*  48   86:new             #24  <Class DumpException>
	//*  49   89:dup             
	//*  50   90:aload_1         
	//*  51   91:invokevirtual   #80  <Method String StringBuilder.toString()>
	//*  52   94:invokespecial   #83  <Method void DumpException(String)>
	//*  53   97:athrow          
	//*  54   98:astore_1        
	//*  55   99:aload_2         
	//*  56  100:invokevirtual   #59  <Method boolean File.exists()>
	//*  57  103:ifeq            111
	//*  58  106:aload_2         
	//*  59  107:invokevirtual   #62  <Method boolean File.delete()>
	//*  60  110:pop             
	//*  61  111:aload_1         
	//*  62  112:athrow          
		// Misplaced declaration of an exception variable
		catch(OutputStream outputstream)
		{
			outputstream = ((OutputStream) (new StringBuilder()));
		}
		((StringBuilder) (outputstream)).append("Failure copying ");
		((StringBuilder) (outputstream)).append(((Object) (file)));
		((StringBuilder) (outputstream)).append(" to dumper output");
		throw new DumpException(((StringBuilder) (outputstream)).toString());
		outputstream;
		if(file.exists())
			file.delete();
		throw outputstream;
	//*  63  113:astore_1        
	//*  64  114:goto            58
	}

	private static void truncateAndDeleteFile(File file)
		throws IOException
	{
		(new FileOutputStream(file)).close();
	//    0    0:new             #87  <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void FileOutputStream(File)>
	//    4    8:invokevirtual   #89  <Method void FileOutputStream.close()>
		if(file.delete())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #62  <Method boolean File.delete()>
	//*   7   15:ifeq            19
		{
			return;
	//    8   18:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #64  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #65  <Method void StringBuilder()>
	//   12   26:astore_1        
			stringbuilder.append("Failed to delete ");
	//   13   27:aload_1         
	//   14   28:ldc1            #91  <String "Failed to delete ">
	//   15   30:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((Object) (file)));
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			throw new IOException(stringbuilder.toString());
	//   21   40:new             #26  <Class IOException>
	//   22   43:dup             
	//   23   44:aload_1         
	//   24   45:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   25   48:invokespecial   #92  <Method void IOException(String)>
	//   26   51:athrow          
		}
	}

	private void usage(PrintStream printstream)
		throws DumpUsageException
	{
		printstream.println("Usage: dumpapp hprof [ path ]");
	//    0    0:aload_1         
	//    1    1:ldc1            #98  <String "Usage: dumpapp hprof [ path ]">
	//    2    3:invokevirtual   #103 <Method void PrintStream.println(String)>
		printstream.println("Dump HPROF memory usage data from the running application.");
	//    3    6:aload_1         
	//    4    7:ldc1            #105 <String "Dump HPROF memory usage data from the running application.">
	//    5    9:invokevirtual   #103 <Method void PrintStream.println(String)>
		printstream.println();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #107 <Method void PrintStream.println()>
		printstream.println("Where path can be any of:");
	//    8   16:aload_1         
	//    9   17:ldc1            #109 <String "Where path can be any of:">
	//   10   19:invokevirtual   #103 <Method void PrintStream.println(String)>
		printstream.println("  -           Output directly to stdout");
	//   11   22:aload_1         
	//   12   23:ldc1            #111 <String "  -           Output directly to stdout">
	//   13   25:invokevirtual   #103 <Method void PrintStream.println(String)>
		printstream.println("  <path>      Full path to a writable file on the device");
	//   14   28:aload_1         
	//   15   29:ldc1            #113 <String "  <path>      Full path to a writable file on the device">
	//   16   31:invokevirtual   #103 <Method void PrintStream.println(String)>
		printstream.println("  <filename>  Relative filename that will be stored in the app internal storage");
	//   17   34:aload_1         
	//   18   35:ldc1            #115 <String "  <filename>  Relative filename that will be stored in the app internal storage">
	//   19   37:invokevirtual   #103 <Method void PrintStream.println(String)>
		throw new DumpUsageException("Missing path");
	//   20   40:new             #96  <Class DumpUsageException>
	//   21   43:dup             
	//   22   44:ldc1            #117 <String "Missing path">
	//   23   46:invokespecial   #118 <Method void DumpUsageException(String)>
	//   24   49:athrow          
	}

	private void writeHprof(File file)
		throws DumpException
	{
		try
		{
			truncateAndDeleteFile(file);
	//    0    0:aload_1         
	//    1    1:invokestatic    #120 <Method void truncateAndDeleteFile(File)>
			Debug.dumpHprofData(file.getAbsolutePath());
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method String File.getAbsolutePath()>
	//    4    8:invokestatic    #128 <Method void Debug.dumpHprofData(String)>
			return;
	//    5   11:return          
		}
		catch(IOException ioexception)
	//*   6   12:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #64  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #65  <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Failure writing to ");
	//   11   21:aload_3         
	//   12   22:ldc1            #130 <String "Failure writing to ">
	//   13   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(((Object) (file)));
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   18   33:pop             
			stringbuilder.append(": ");
	//   19   34:aload_3         
	//   20   35:ldc1            #132 <String ": ">
	//   21   37:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append(ioexception.getMessage());
	//   23   41:aload_3         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #135 <Method String IOException.getMessage()>
	//   26   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			throw new DumpException(stringbuilder.toString());
	//   28   50:new             #24  <Class DumpException>
	//   29   53:dup             
	//   30   54:aload_3         
	//   31   55:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #83  <Method void DumpException(String)>
	//   33   61:athrow          
		}
	}

	public void dump(DumperContext dumpercontext)
		throws DumpException
	{
		PrintStream printstream = dumpercontext.getStdout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #143 <Method PrintStream DumperContext.getStdout()>
	//    2    4:astore          4
		dumpercontext = ((DumperContext) (dumpercontext.getArgsAsList().iterator()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #147 <Method List DumperContext.getArgsAsList()>
	//    5   10:invokeinterface #153 <Method Iterator List.iterator()>
	//    6   15:astore_1        
		Object obj;
		if(((Iterator) (dumpercontext)).hasNext())
	//*   7   16:aload_1         
	//*   8   17:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            38
			obj = ((Object) ((String)((Iterator) (dumpercontext)).next()));
	//   10   25:aload_1         
	//   11   26:invokeinterface #162 <Method Object Iterator.next()>
	//   12   31:checkcast       #164 <Class String>
	//   13   34:astore_2        
		else
	//*  14   35:goto            40
			obj = null;
	//   15   38:aconst_null     
	//   16   39:astore_2        
		if(obj == null)
	//*  17   40:aload_2         
	//*  18   41:ifnonnull       51
		{
			usage(printstream);
	//   19   44:aload_0         
	//   20   45:aload           4
	//   21   47:invokespecial   #166 <Method void usage(PrintStream)>
			return;
	//   22   50:return          
		}
		if("-".equals(obj))
	//*  23   51:ldc1            #168 <String "-">
	//*  24   53:aload_2         
	//*  25   54:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  26   57:ifeq            67
		{
			handlePipeOutput(((OutputStream) (printstream)));
	//   27   60:aload_0         
	//   28   61:aload           4
	//   29   63:invokespecial   #174 <Method void handlePipeOutput(OutputStream)>
			return;
	//   30   66:return          
		}
		File file = new File(((String) (obj)));
	//   31   67:new             #55  <Class File>
	//   32   70:dup             
	//   33   71:aload_2         
	//   34   72:invokespecial   #175 <Method void File(String)>
	//   35   75:astore_3        
		dumpercontext = ((DumperContext) (file));
	//   36   76:aload_3         
	//   37   77:astore_1        
		if(!file.isAbsolute())
	//*  38   78:aload_3         
	//*  39   79:invokevirtual   #178 <Method boolean File.isAbsolute()>
	//*  40   82:ifne            94
			dumpercontext = ((DumperContext) (mContext.getFileStreamPath(((String) (obj)))));
	//   41   85:aload_0         
	//   42   86:getfield        #19  <Field Context mContext>
	//   43   89:aload_2         
	//   44   90:invokevirtual   #34  <Method File Context.getFileStreamPath(String)>
	//   45   93:astore_1        
		writeHprof(((File) (dumpercontext)));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokespecial   #38  <Method void writeHprof(File)>
		obj = ((Object) (new StringBuilder()));
	//   49   99:new             #64  <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #65  <Method void StringBuilder()>
	//   52  106:astore_2        
		((StringBuilder) (obj)).append("Wrote to ");
	//   53  107:aload_2         
	//   54  108:ldc1            #180 <String "Wrote to ">
	//   55  110:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
		((StringBuilder) (obj)).append(((Object) (dumpercontext)));
	//   57  114:aload_2         
	//   58  115:aload_1         
	//   59  116:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   60  119:pop             
		printstream.println(((StringBuilder) (obj)).toString());
	//   61  120:aload           4
	//   62  122:aload_2         
	//   63  123:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   64  126:invokevirtual   #103 <Method void PrintStream.println(String)>
	//   65  129:return          
	}

	public String getName()
	{
		return "hprof";
	//    0    0:ldc1            #10  <String "hprof">
	//    1    2:areturn         
	}

	private static final String NAME = "hprof";
	private final Context mContext;
}
