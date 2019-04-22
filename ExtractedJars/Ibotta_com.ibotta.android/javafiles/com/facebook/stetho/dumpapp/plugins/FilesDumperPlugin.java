// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.os.Environment;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.*;
import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FilesDumperPlugin
	implements DumperPlugin
{

	public FilesDumperPlugin(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context mContext>
	//    5    9:return          
	}

	private void addFiles(ZipOutputStream zipoutputstream, byte abyte0[], File afile[])
		throws IOException
	{
		int i;
		int j;
		j = afile.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          5
		i = 0;
	//    3    4:iconst_0        
	//    4    5:istore          4
_L2:
		Object obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:icmpge          108
		obj = ((Object) (afile[i]));
	//    8   14:aload_3         
	//    9   15:iload           4
	//   10   17:aaload          
	//   11   18:astore          6
		if(((File) (obj)).isDirectory())
	//*  12   20:aload           6
	//*  13   22:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*  14   25:ifeq            42
		{
			addFiles(zipoutputstream, abyte0, ((File) (obj)).listFiles());
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload           6
	//   19   33:invokevirtual   #34  <Method File[] File.listFiles()>
	//   20   36:invokespecial   #36  <Method void addFiles(ZipOutputStream, byte[], File[])>
			break MISSING_BLOCK_LABEL_91;
	//   21   39:goto            91
		}
		zipoutputstream.putNextEntry(new ZipEntry(relativizePath(getBaseDir(mContext).getParentFile(), ((File) (obj)))));
	//   22   42:aload_1         
	//   23   43:new             #38  <Class ZipEntry>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #19  <Field Context mContext>
	//   27   51:invokestatic    #42  <Method File getBaseDir(Context)>
	//   28   54:invokevirtual   #46  <Method File File.getParentFile()>
	//   29   57:aload           6
	//   30   59:invokestatic    #50  <Method String relativizePath(File, File)>
	//   31   62:invokespecial   #53  <Method void ZipEntry(String)>
	//   32   65:invokevirtual   #59  <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   33   68:new             #61  <Class FileInputStream>
	//   34   71:dup             
	//   35   72:aload           6
	//   36   74:invokespecial   #64  <Method void FileInputStream(File)>
	//   37   77:astore          6
		copy(((InputStream) (obj)), ((OutputStream) (zipoutputstream)), abyte0);
	//   38   79:aload           6
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:invokestatic    #68  <Method void copy(InputStream, OutputStream, byte[])>
		((FileInputStream) (obj)).close();
	//   42   86:aload           6
	//   43   88:invokevirtual   #71  <Method void FileInputStream.close()>
		i++;
	//   44   91:iload           4
	//   45   93:iconst_1        
	//   46   94:iadd            
	//   47   95:istore          4
		if(true) goto _L2; else goto _L1
	//   48   97:goto            7
		zipoutputstream;
	//   49  100:astore_1        
		((FileInputStream) (obj)).close();
	//   50  101:aload           6
	//   51  103:invokevirtual   #71  <Method void FileInputStream.close()>
		throw zipoutputstream;
	//   52  106:aload_1         
	//   53  107:athrow          
_L1:
	//   54  108:return          
	}

	private static void copy(InputStream inputstream, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		do
		{
			int i = inputstream.read(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #78  <Method int InputStream.read(byte[])>
	//    3    5:istore_3        
			if(i >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            20
				outputstream.write(abyte0, 0, i);
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:iload_3         
	//   10   14:invokevirtual   #84  <Method void OutputStream.write(byte[], int, int)>
			else
	//*  11   17:goto            0
				return;
	//   12   20:return          
		} while(true);
	}

	private void doDownload(PrintStream printstream, Iterator iterator)
		throws DumpUsageException
	{
		ArrayList arraylist;
		String s;
		s = ArgsHelper.nextArg(iterator, "Must specify output file or '-'");
	//    0    0:aload_2         
	//    1    1:ldc1            #90  <String "Must specify output file or '-'">
	//    2    3:invokestatic    #96  <Method String ArgsHelper.nextArg(Iterator, String)>
	//    3    6:astore          4
		arraylist = new ArrayList();
	//    4    8:new             #98  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #99  <Method void ArrayList()>
	//    7   15:astore_3        
		for(; iterator.hasNext(); arraylist.add(((Object) (resolvePossibleAppStoragePath(mContext, (String)iterator.next())))));
	//    8   16:aload_2         
	//    9   17:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            49
	//   11   25:aload_3         
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field Context mContext>
	//   14   30:aload_2         
	//   15   31:invokeinterface #108 <Method Object Iterator.next()>
	//   16   36:checkcast       #110 <Class String>
	//   17   39:invokestatic    #114 <Method File resolvePossibleAppStoragePath(Context, String)>
	//   18   42:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   19   45:pop             
	//*  20   46:goto            16
		if("-".equals(((Object) (s))))
	//*  21   49:ldc1            #120 <String "-">
	//*  22   51:aload           4
	//*  23   53:invokevirtual   #123 <Method boolean String.equals(Object)>
	//*  24   56:ifeq            62
			break MISSING_BLOCK_LABEL_75;
	//   25   59:goto            75
		printstream = ((PrintStream) (new FileOutputStream(resolvePossibleSdcardPath(s))));
	//   26   62:new             #125 <Class FileOutputStream>
	//   27   65:dup             
	//   28   66:aload           4
	//   29   68:invokestatic    #129 <Method File resolvePossibleSdcardPath(String)>
	//   30   71:invokespecial   #130 <Method void FileOutputStream(File)>
	//   31   74:astore_1        
		iterator = ((Iterator) (new ZipOutputStream(((OutputStream) (new BufferedOutputStream(((OutputStream) (printstream))))))));
	//   32   75:new             #55  <Class ZipOutputStream>
	//   33   78:dup             
	//   34   79:new             #132 <Class BufferedOutputStream>
	//   35   82:dup             
	//   36   83:aload_1         
	//   37   84:invokespecial   #135 <Method void BufferedOutputStream(OutputStream)>
	//   38   87:invokespecial   #136 <Method void ZipOutputStream(OutputStream)>
	//   39   90:astore_2        
		byte abyte0[];
		abyte0 = new byte[2048];
	//   40   91:sipush          2048
	//   41   94:newarray        byte[]
	//   42   96:astore          4
		if(arraylist.size() > 0)
	//*  43   98:aload_3         
	//*  44   99:invokevirtual   #140 <Method int ArrayList.size()>
	//*  45  102:ifle            129
		{
			addFiles(((ZipOutputStream) (iterator)), abyte0, (File[])arraylist.toArray(((Object []) (new File[arraylist.size()]))));
	//   46  105:aload_0         
	//   47  106:aload_2         
	//   48  107:aload           4
	//   49  109:aload_3         
	//   50  110:aload_3         
	//   51  111:invokevirtual   #140 <Method int ArrayList.size()>
	//   52  114:anewarray       File[]
	//   53  117:invokevirtual   #144 <Method Object[] ArrayList.toArray(Object[])>
	//   54  120:checkcast       #146 <Class File[]>
	//   55  123:invokespecial   #36  <Method void addFiles(ZipOutputStream, byte[], File[])>
			break MISSING_BLOCK_LABEL_146;
	//   56  126:goto            146
		}
		addFiles(((ZipOutputStream) (iterator)), abyte0, getBaseDir(mContext).listFiles());
	//   57  129:aload_0         
	//   58  130:aload_2         
	//   59  131:aload           4
	//   60  133:aload_0         
	//   61  134:getfield        #19  <Field Context mContext>
	//   62  137:invokestatic    #42  <Method File getBaseDir(Context)>
	//   63  140:invokevirtual   #34  <Method File[] File.listFiles()>
	//   64  143:invokespecial   #36  <Method void addFiles(ZipOutputStream, byte[], File[])>
		try
		{
			((ZipOutputStream) (iterator)).close();
	//   65  146:aload_2         
	//   66  147:invokevirtual   #147 <Method void ZipOutputStream.close()>
			return;
	//   67  150:return          
		}
		// Misplaced declaration of an exception variable
		catch(Iterator iterator) { }
	//   68  151:astore_2        
		Exception exception;
		try
		{
			Util.close(((java.io.Closeable) (printstream)), false);
	//   69  152:aload_1         
	//   70  153:iconst_0        
	//   71  154:invokestatic    #152 <Method void Util.close(java.io.Closeable, boolean)>
			throw iterator;
	//   72  157:aload_2         
	//   73  158:athrow          
		}
	//*  74  159:astore_3        
	//*  75  160:aload_2         
	//*  76  161:invokevirtual   #147 <Method void ZipOutputStream.close()>
	//*  77  164:goto            172
	//*  78  167:aload_1         
	//*  79  168:iconst_1        
	//*  80  169:invokestatic    #152 <Method void Util.close(java.io.Closeable, boolean)>
	//*  81  172:aload_3         
	//*  82  173:athrow          
		// Misplaced declaration of an exception variable
		catch(PrintStream printstream)
	//*  83  174:astore_1        
		{
			throw new RuntimeException(((Throwable) (printstream)));
	//   84  175:new             #154 <Class RuntimeException>
	//   85  178:dup             
	//   86  179:aload_1         
	//   87  180:invokespecial   #157 <Method void RuntimeException(Throwable)>
	//   88  183:athrow          
		}
		exception;
		((ZipOutputStream) (iterator)).close();
		  goto _L1
_L3:
		Util.close(((java.io.Closeable) (printstream)), true);
_L1:
		throw exception;
		iterator;
	//   89  184:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  90  185:goto            167
	}

	private void doLs(PrintStream printstream)
		throws DumpUsageException
	{
		File file = getBaseDir(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:invokestatic    #42  <Method File getBaseDir(Context)>
	//    3    7:astore_2        
		if(file.isDirectory())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*   6   12:ifeq            22
			printDirectoryText(file, "", printstream);
	//    7   15:aload_2         
	//    8   16:ldc1            #163 <String "">
	//    9   18:aload_1         
	//   10   19:invokestatic    #167 <Method void printDirectoryText(File, String, PrintStream)>
	//   11   22:return          
	}

	private void doTree(PrintStream printstream)
		throws DumpUsageException
	{
		printDirectoryVisual(getBaseDir(mContext), 0, printstream);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:invokestatic    #42  <Method File getBaseDir(Context)>
	//    3    7:iconst_0        
	//    4    8:aload_1         
	//    5    9:invokestatic    #172 <Method void printDirectoryVisual(File, int, PrintStream)>
	//    6   12:return          
	}

	private void doUsage(PrintStream printstream)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #175 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Usage: dumpapp files ");
	//    4    8:aload_2         
	//    5    9:ldc1            #178 <String "Usage: dumpapp files ">
	//    6   11:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("<command> [command-options]");
	//    8   15:aload_2         
	//    9   16:ldc1            #184 <String "<command> [command-options]">
	//   10   18:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		printstream.println(stringbuilder.toString());
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #193 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   16   30:new             #175 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #176 <Method void StringBuilder()>
	//   19   37:astore_2        
		stringbuilder.append("       dumpapp files ");
	//   20   38:aload_2         
	//   21   39:ldc1            #195 <String "       dumpapp files ">
	//   22   41:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append("ls");
	//   24   45:aload_2         
	//   25   46:ldc1            #197 <String "ls">
	//   26   48:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		printstream.println(stringbuilder.toString());
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #193 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   32   60:new             #175 <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #176 <Method void StringBuilder()>
	//   35   67:astore_2        
		stringbuilder.append("       dumpapp files ");
	//   36   68:aload_2         
	//   37   69:ldc1            #195 <String "       dumpapp files ">
	//   38   71:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
		stringbuilder.append("tree");
	//   40   75:aload_2         
	//   41   76:ldc1            #199 <String "tree">
	//   42   78:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
		printstream.println(stringbuilder.toString());
	//   44   82:aload_1         
	//   45   83:aload_2         
	//   46   84:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   47   87:invokevirtual   #193 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   48   90:new             #175 <Class StringBuilder>
	//   49   93:dup             
	//   50   94:invokespecial   #176 <Method void StringBuilder()>
	//   51   97:astore_2        
		stringbuilder.append("       dumpapp files ");
	//   52   98:aload_2         
	//   53   99:ldc1            #195 <String "       dumpapp files ">
	//   54  101:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
		stringbuilder.append("download <output.zip> [<path>...]");
	//   56  105:aload_2         
	//   57  106:ldc1            #201 <String "download <output.zip> [<path>...]">
	//   58  108:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
		printstream.println(stringbuilder.toString());
	//   60  112:aload_1         
	//   61  113:aload_2         
	//   62  114:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   63  117:invokevirtual   #193 <Method void PrintStream.println(String)>
		printstream.println();
	//   64  120:aload_1         
	//   65  121:invokevirtual   #203 <Method void PrintStream.println()>
		printstream.println("dumpapp files ls: List files similar to the ls command");
	//   66  124:aload_1         
	//   67  125:ldc1            #205 <String "dumpapp files ls: List files similar to the ls command">
	//   68  127:invokevirtual   #193 <Method void PrintStream.println(String)>
		printstream.println();
	//   69  130:aload_1         
	//   70  131:invokevirtual   #203 <Method void PrintStream.println()>
		printstream.println("dumpapp files tree: List files similar to the tree command");
	//   71  134:aload_1         
	//   72  135:ldc1            #207 <String "dumpapp files tree: List files similar to the tree command">
	//   73  137:invokevirtual   #193 <Method void PrintStream.println(String)>
		printstream.println();
	//   74  140:aload_1         
	//   75  141:invokevirtual   #203 <Method void PrintStream.println()>
		printstream.println("dumpapp files download: Fetch internal application storage");
	//   76  144:aload_1         
	//   77  145:ldc1            #209 <String "dumpapp files download: Fetch internal application storage">
	//   78  147:invokevirtual   #193 <Method void PrintStream.println(String)>
		printstream.println("    <output.zip>: Output location or '-' for stdout");
	//   79  150:aload_1         
	//   80  151:ldc1            #211 <String "    <output.zip>: Output location or '-' for stdout">
	//   81  153:invokevirtual   #193 <Method void PrintStream.println(String)>
		printstream.println("    <path>: Fetch only those paths named (directories fetch recursively)");
	//   82  156:aload_1         
	//   83  157:ldc1            #213 <String "    <path>: Fetch only those paths named (directories fetch recursively)">
	//   84  159:invokevirtual   #193 <Method void PrintStream.println(String)>
	//   85  162:return          
	}

	private static File getBaseDir(Context context)
	{
		return context.getFilesDir().getParentFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #218 <Method File Context.getFilesDir()>
	//    2    4:invokevirtual   #46  <Method File File.getParentFile()>
	//    3    7:areturn         
	}

	private static void printDirectoryText(File file, String s, PrintStream printstream)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		for(int i = 0; i < file.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmpge          118
		{
			File file1 = ((File) (file[i]));
	//    9   13:aload_0         
	//   10   14:iload_3         
	//   11   15:aaload          
	//   12   16:astore          4
			if(file1.isDirectory())
	//*  13   18:aload           4
	//*  14   20:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*  15   23:ifeq            75
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   26:new             #175 <Class StringBuilder>
	//   17   29:dup             
	//   18   30:invokespecial   #176 <Method void StringBuilder()>
	//   19   33:astore          5
				stringbuilder.append(s);
	//   20   35:aload           5
	//   21   37:aload_1         
	//   22   38:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
				stringbuilder.append(file1.getName());
	//   24   42:aload           5
	//   25   44:aload           4
	//   26   46:invokevirtual   #221 <Method String File.getName()>
	//   27   49:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
				stringbuilder.append("/");
	//   29   53:aload           5
	//   30   55:ldc1            #223 <String "/">
	//   31   57:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
				printDirectoryText(file1, stringbuilder.toString(), printstream);
	//   33   61:aload           4
	//   34   63:aload           5
	//   35   65:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   36   68:aload_2         
	//   37   69:invokestatic    #167 <Method void printDirectoryText(File, String, PrintStream)>
			} else
	//*  38   72:goto            111
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   39   75:new             #175 <Class StringBuilder>
	//   40   78:dup             
	//   41   79:invokespecial   #176 <Method void StringBuilder()>
	//   42   82:astore          5
				stringbuilder1.append(s);
	//   43   84:aload           5
	//   44   86:aload_1         
	//   45   87:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
				stringbuilder1.append(file1.getName());
	//   47   91:aload           5
	//   48   93:aload           4
	//   49   95:invokevirtual   #221 <Method String File.getName()>
	//   50   98:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
				printstream.println(stringbuilder1.toString());
	//   52  102:aload_2         
	//   53  103:aload           5
	//   54  105:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   55  108:invokevirtual   #193 <Method void PrintStream.println(String)>
			}
		}

	//   56  111:iload_3         
	//   57  112:iconst_1        
	//   58  113:iadd            
	//   59  114:istore_3        
	//*  60  115:goto            7
	//   61  118:return          
	}

	private static void printDirectoryVisual(File file, int i, PrintStream printstream)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		for(int j = 0; j < file.length; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmpge          66
		{
			printHeaderVisual(i, printstream);
	//    9   13:iload_1         
	//   10   14:aload_2         
	//   11   15:invokestatic    #227 <Method void printHeaderVisual(int, PrintStream)>
			File file1 = ((File) (file[j]));
	//   12   18:aload_0         
	//   13   19:iload_3         
	//   14   20:aaload          
	//   15   21:astore          4
			printstream.print("+---");
	//   16   23:aload_2         
	//   17   24:ldc1            #229 <String "+---">
	//   18   26:invokevirtual   #232 <Method void PrintStream.print(String)>
			printstream.print(file1.getName());
	//   19   29:aload_2         
	//   20   30:aload           4
	//   21   32:invokevirtual   #221 <Method String File.getName()>
	//   22   35:invokevirtual   #232 <Method void PrintStream.print(String)>
			printstream.println();
	//   23   38:aload_2         
	//   24   39:invokevirtual   #203 <Method void PrintStream.println()>
			if(file1.isDirectory())
	//*  25   42:aload           4
	//*  26   44:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*  27   47:ifeq            59
				printDirectoryVisual(file1, i + 1, printstream);
	//   28   50:aload           4
	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:aload_2         
	//   33   56:invokestatic    #172 <Method void printDirectoryVisual(File, int, PrintStream)>
		}

	//   34   59:iload_3         
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:istore_3        
	//*  38   63:goto            7
	//   39   66:return          
	}

	private static void printHeaderVisual(int i, PrintStream printstream)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iload_0         
	//*   4    4:icmpge          20
			printstream.print("|   ");
	//    5    7:aload_1         
	//    6    8:ldc1            #234 <String "|   ">
	//    7   10:invokevirtual   #232 <Method void PrintStream.print(String)>

	//    8   13:iload_2         
	//    9   14:iconst_1        
	//   10   15:iadd            
	//   11   16:istore_2        
	//*  12   17:goto            2
	//   13   20:return          
	}

	private static String relativizePath(File file, File file1)
	{
		file = ((File) (file.getAbsolutePath()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method String File.getAbsolutePath()>
	//    2    4:astore_0        
		file1 = ((File) (file1.getAbsolutePath()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #237 <Method String File.getAbsolutePath()>
	//    5    9:astore_1        
		if(((String) (file1)).startsWith(((String) (file))))
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #241 <Method boolean String.startsWith(String)>
	//*   9   15:ifeq            29
			return ((String) (file1)).substring(((String) (file)).length() + 1);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #244 <Method int String.length()>
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:invokevirtual   #248 <Method String String.substring(int)>
	//   16   28:areturn         
		else
			return ((String) (file1));
	//   17   29:aload_1         
	//   18   30:areturn         
	}

	private static File resolvePossibleAppStoragePath(Context context, String s)
	{
		if(s.startsWith("/"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #223 <String "/">
	//*   2    3:invokevirtual   #241 <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            18
			return new File(s);
	//    4    9:new             #26  <Class File>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #249 <Method void File(String)>
	//    8   17:areturn         
		else
			return new File(getBaseDir(context), s);
	//    9   18:new             #26  <Class File>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokestatic    #42  <Method File getBaseDir(Context)>
	//   13   26:aload_1         
	//   14   27:invokespecial   #252 <Method void File(File, String)>
	//   15   30:areturn         
	}

	private static File resolvePossibleSdcardPath(String s)
	{
		if(s.startsWith("/"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #223 <String "/">
	//*   2    3:invokevirtual   #241 <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            18
			return new File(s);
	//    4    9:new             #26  <Class File>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #249 <Method void File(String)>
	//    8   17:areturn         
		else
			return new File(Environment.getExternalStorageDirectory(), s);
	//    9   18:new             #26  <Class File>
	//   10   21:dup             
	//   11   22:invokestatic    #257 <Method File Environment.getExternalStorageDirectory()>
	//   12   25:aload_0         
	//   13   26:invokespecial   #252 <Method void File(File, String)>
	//   14   29:areturn         
	}

	public void dump(DumperContext dumpercontext)
		throws DumpException
	{
		Iterator iterator = dumpercontext.getArgsAsList().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #267 <Method List DumperContext.getArgsAsList()>
	//    2    4:invokeinterface #273 <Method Iterator List.iterator()>
	//    3    9:astore_3        
		String s = ArgsHelper.nextOptionalArg(iterator, "");
	//    4   10:aload_3         
	//    5   11:ldc1            #163 <String "">
	//    6   13:invokestatic    #276 <Method String ArgsHelper.nextOptionalArg(Iterator, String)>
	//    7   16:astore_2        
		if("ls".equals(((Object) (s))))
	//*   8   17:ldc1            #197 <String "ls">
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #123 <Method boolean String.equals(Object)>
	//*  11   23:ifeq            35
		{
			doLs(dumpercontext.getStdout());
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #280 <Method PrintStream DumperContext.getStdout()>
	//   15   31:invokespecial   #282 <Method void doLs(PrintStream)>
			return;
	//   16   34:return          
		}
		if("tree".equals(((Object) (s))))
	//*  17   35:ldc1            #199 <String "tree">
	//*  18   37:aload_2         
	//*  19   38:invokevirtual   #123 <Method boolean String.equals(Object)>
	//*  20   41:ifeq            53
		{
			doTree(dumpercontext.getStdout());
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:invokevirtual   #280 <Method PrintStream DumperContext.getStdout()>
	//   24   49:invokespecial   #284 <Method void doTree(PrintStream)>
			return;
	//   25   52:return          
		}
		if("download".equals(((Object) (s))))
	//*  26   53:ldc2            #286 <String "download">
	//*  27   56:aload_2         
	//*  28   57:invokevirtual   #123 <Method boolean String.equals(Object)>
	//*  29   60:ifeq            73
		{
			doDownload(dumpercontext.getStdout(), iterator);
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:invokevirtual   #280 <Method PrintStream DumperContext.getStdout()>
	//   33   68:aload_3         
	//   34   69:invokespecial   #288 <Method void doDownload(PrintStream, Iterator)>
			return;
	//   35   72:return          
		}
		doUsage(dumpercontext.getStdout());
	//   36   73:aload_0         
	//   37   74:aload_1         
	//   38   75:invokevirtual   #280 <Method PrintStream DumperContext.getStdout()>
	//   39   78:invokespecial   #290 <Method void doUsage(PrintStream)>
		if("".equals(((Object) (s))))
	//*  40   81:ldc1            #163 <String "">
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #123 <Method boolean String.equals(Object)>
	//*  43   87:ifeq            91
		{
			return;
	//   44   90:return          
		} else
		{
			dumpercontext = ((DumperContext) (new StringBuilder()));
	//   45   91:new             #175 <Class StringBuilder>
	//   46   94:dup             
	//   47   95:invokespecial   #176 <Method void StringBuilder()>
	//   48   98:astore_1        
			((StringBuilder) (dumpercontext)).append("Unknown command: ");
	//   49   99:aload_1         
	//   50  100:ldc2            #292 <String "Unknown command: ">
	//   51  103:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			((StringBuilder) (dumpercontext)).append(s);
	//   53  107:aload_1         
	//   54  108:aload_2         
	//   55  109:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
			throw new DumpUsageException(((StringBuilder) (dumpercontext)).toString());
	//   57  113:new             #88  <Class DumpUsageException>
	//   58  116:dup             
	//   59  117:aload_1         
	//   60  118:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   61  121:invokespecial   #293 <Method void DumpUsageException(String)>
	//   62  124:athrow          
		}
	}

	public String getName()
	{
		return "files";
	//    0    0:ldc1            #10  <String "files">
	//    1    2:areturn         
	}

	private static final String NAME = "files";
	private final Context mContext;
}
