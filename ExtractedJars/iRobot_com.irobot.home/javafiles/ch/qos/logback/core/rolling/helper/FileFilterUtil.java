// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFilterUtil
{

	public FileFilterUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static String afterLastSlash(String s)
	{
		int i = s.lastIndexOf('/');
	//    0    0:aload_0         
	//    1    1:bipush          47
	//    2    3:invokevirtual   #23  <Method int String.lastIndexOf(int)>
	//    3    6:istore_1        
		if(i == -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          14
			return s;
	//    7   12:aload_0         
	//    8   13:areturn         
		else
			return s.substring(i + 1);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:invokevirtual   #27  <Method String String.substring(int)>
	//   14   21:areturn         
	}

	public static int extractCounter(File file, String s)
	{
		Object obj = ((Object) (Pattern.compile(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method Pattern Pattern.compile(String)>
	//    2    4:astore_2        
		file = ((File) (file.getName()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #41  <Method String File.getName()>
	//    5    9:astore_0        
		obj = ((Object) (((Pattern) (obj)).matcher(((CharSequence) (file)))));
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #45  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   15:astore_2        
		if(!((Matcher) (obj)).matches())
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #51  <Method boolean Matcher.matches()>
	//*  12   20:ifne            76
		{
			obj = ((Object) (new StringBuilder()));
	//   13   23:new             #53  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #54  <Method void StringBuilder()>
	//   16   30:astore_2        
			((StringBuilder) (obj)).append("The regex [");
	//   17   31:aload_2         
	//   18   32:ldc1            #56  <String "The regex [">
	//   19   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			((StringBuilder) (obj)).append(s);
	//   21   38:aload_2         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			((StringBuilder) (obj)).append("] should match [");
	//   25   44:aload_2         
	//   26   45:ldc1            #62  <String "] should match [">
	//   27   47:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			((StringBuilder) (obj)).append(((String) (file)));
	//   29   51:aload_2         
	//   30   52:aload_0         
	//   31   53:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
			((StringBuilder) (obj)).append("]");
	//   33   57:aload_2         
	//   34   58:ldc1            #64  <String "]">
	//   35   60:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   36   63:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   37   64:new             #66  <Class IllegalStateException>
	//   38   67:dup             
	//   39   68:aload_2         
	//   40   69:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   41   72:invokespecial   #72  <Method void IllegalStateException(String)>
	//   42   75:athrow          
		} else
		{
			return (new Integer(((Matcher) (obj)).group(1))).intValue();
	//   43   76:new             #74  <Class Integer>
	//   44   79:dup             
	//   45   80:aload_2         
	//   46   81:iconst_1        
	//   47   82:invokevirtual   #77  <Method String Matcher.group(int)>
	//   48   85:invokespecial   #78  <Method void Integer(String)>
	//   49   88:invokevirtual   #82  <Method int Integer.intValue()>
	//   50   91:ireturn         
		}
	}

	public static File[] filesInFolderMatchingStemRegex(File file, String s)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return new File[0];
	//    2    4:iconst_0        
	//    3    5:anewarray       File[]
	//    4    8:areturn         
		if(file.exists() && file.isDirectory())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #87  <Method boolean File.exists()>
	//*   7   13:ifeq            39
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #90  <Method boolean File.isDirectory()>
	//*  10   20:ifne            26
	//*  11   23:goto            39
			return file.listFiles(new FilenameFilter(s) {

				public boolean accept(File file1, String s1)
				{
					return s1.matches(stemRegex);
				//    0    0:aload_2         
				//    1    1:aload_0         
				//    2    2:getfield        #17  <Field String val$stemRegex>
				//    3    5:invokevirtual   #29  <Method boolean String.matches(String)>
				//    4    8:ireturn         
				}

				final String val$stemRegex;

			
			{
				stemRegex = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$stemRegex>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   26:aload_0         
	//   13   27:new             #10  <Class FileFilterUtil$3>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #91  <Method void FileFilterUtil$3(String)>
	//   17   35:invokevirtual   #95  <Method File[] File.listFiles(FilenameFilter)>
	//   18   38:areturn         
		else
			return new File[0];
	//   19   39:iconst_0        
	//   20   40:anewarray       File[]
	//   21   43:areturn         
	}

	public static int findHighestCounter(File afile[], String s)
	{
		int i1 = afile.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          6
		int j = 0x80000000;
	//    3    4:ldc1            #98  <Int 0x80000000>
	//    4    6:istore_3        
		for(int i = 0; i < i1;)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload           6
	//*   9   12:icmpge          47
		{
			int l = extractCounter(afile[i], s);
	//   10   15:aload_0         
	//   11   16:iload_2         
	//   12   17:aaload          
	//   13   18:aload_1         
	//   14   19:invokestatic    #100 <Method int extractCounter(File, String)>
	//   15   22:istore          5
			int k = j;
	//   16   24:iload_3         
	//   17   25:istore          4
			if(j < l)
	//*  18   27:iload_3         
	//*  19   28:iload           5
	//*  20   30:icmpge          37
				k = l;
	//   21   33:iload           5
	//   22   35:istore          4
			i++;
	//   23   37:iload_2         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_2        
			j = k;
	//   27   41:iload           4
	//   28   43:istore_3        
		}

	//*  29   44:goto            9
		return j;
	//   30   47:iload_3         
	//   31   48:ireturn         
	}

	public static boolean isEmptyDirectory(File file)
	{
		if(!file.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #90  <Method boolean File.isDirectory()>
	//*   2    4:ifne            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #53  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #54  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("[");
	//    7   15:aload_1         
	//    8   16:ldc1            #104 <String "[">
	//    9   18:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(((Object) (file)));
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//   14   27:pop             
			stringbuilder.append("] must be a directory");
	//   15   28:aload_1         
	//   16   29:ldc1            #109 <String "] must be a directory">
	//   17   31:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   19   35:new             #111 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		}
		file = ((File) (file.list()));
	//   25   47:aload_0         
	//   26   48:invokevirtual   #116 <Method String[] File.list()>
	//   27   51:astore_0        
		return file == null || file.length == 0;
	//   28   52:aload_0         
	//   29   53:ifnull          66
	//   30   56:aload_0         
	//   31   57:arraylength     
	//   32   58:ifne            64
	//   33   61:goto            66
	//   34   64:iconst_0        
	//   35   65:ireturn         
	//   36   66:iconst_1        
	//   37   67:ireturn         
	}

	public static void removeEmptyParentDirectories(File file, int i)
	{
		if(i >= 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmplt          6
			return;
	//    3    5:return          
		file = file.getParentFile();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #122 <Method File File.getParentFile()>
	//    6   10:astore_0        
		if(file.isDirectory() && isEmptyDirectory(file))
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #90  <Method boolean File.isDirectory()>
	//*   9   15:ifeq            37
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #124 <Method boolean isEmptyDirectory(File)>
	//*  12   22:ifeq            37
		{
			file.delete();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #127 <Method boolean File.delete()>
	//   15   29:pop             
			removeEmptyParentDirectories(file, i + 1);
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:invokestatic    #129 <Method void removeEmptyParentDirectories(File, int)>
		}
	//   21   37:return          
	}

	public static void reverseSortFileArrayByName(File afile[])
	{
		Arrays.sort(((Object []) (afile)), new Comparator() {

			public int compare(File file, File file1)
			{
				file = ((File) (file.getName()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method String File.getName()>
			//    2    4:astore_1        
				return file1.getName().compareTo(((String) (file)));
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method String File.getName()>
			//    5    9:aload_1         
			//    6   10:invokevirtual   #31  <Method int String.compareTo(String)>
			//    7   13:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((File)obj, (File)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class File>
			//    3    5:aload_2         
			//    4    6:checkcast       #21  <Class File>
			//    5    9:invokevirtual   #34  <Method int compare(File, File)>
			//    6   12:ireturn         
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class FileFilterUtil$2>
	//    2    4:dup             
	//    3    5:invokespecial   #132 <Method void FileFilterUtil$2()>
	//    4    8:invokestatic    #138 <Method void Arrays.sort(Object[], Comparator)>
	//    5   11:return          
	}

	public static String slashify(String s)
	{
		return s.replace('\\', '/');
	//    0    0:aload_0         
	//    1    1:bipush          92
	//    2    3:bipush          47
	//    3    5:invokevirtual   #143 <Method String String.replace(char, char)>
	//    4    8:areturn         
	}

	public static void sortFileArrayByName(File afile[])
	{
		Arrays.sort(((Object []) (afile)), new Comparator() {

			public int compare(File file, File file1)
			{
				return file.getName().compareTo(file1.getName());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method String File.getName()>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #25  <Method String File.getName()>
			//    4    8:invokevirtual   #31  <Method int String.compareTo(String)>
			//    5   11:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((File)obj, (File)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class File>
			//    3    5:aload_2         
			//    4    6:checkcast       #21  <Class File>
			//    5    9:invokevirtual   #34  <Method int compare(File, File)>
			//    6   12:ireturn         
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class FileFilterUtil$1>
	//    2    4:dup             
	//    3    5:invokespecial   #145 <Method void FileFilterUtil$1()>
	//    4    8:invokestatic    #138 <Method void Arrays.sort(Object[], Comparator)>
	//    5   11:return          
	}
}
