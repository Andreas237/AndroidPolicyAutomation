// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class Utils
{

	private Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	static int capFileCount(File file, int i, Comparator comparator)
	{
		return capFileCount(file, ALL_FILES_FILTER, i, comparator);
	//    0    0:aload_0         
	//    1    1:getstatic       #15  <Field FilenameFilter ALL_FILES_FILTER>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #22  <Method int capFileCount(File, FilenameFilter, int, Comparator)>
	//    5    9:ireturn         
	}

	static int capFileCount(File file, FilenameFilter filenamefilter, int i, Comparator comparator)
	{
		file = ((File) (file.listFiles(filenamefilter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method File[] File.listFiles(FilenameFilter)>
	//    3    5:astore_0        
		int j = 0;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(file == null)
	//*   6    9:aload_0         
	//*   7   10:ifnonnull       15
			return 0;
	//    8   13:iconst_0        
	//    9   14:ireturn         
		int k = file.length;
	//   10   15:aload_0         
	//   11   16:arraylength     
	//   12   17:istore          5
		Arrays.sort(((Object []) (file)), comparator);
	//   13   19:aload_0         
	//   14   20:aload_3         
	//   15   21:invokestatic    #36  <Method void Arrays.sort(Object[], Comparator)>
		for(int l = file.length; j < l; j++)
	//*  16   24:aload_0         
	//*  17   25:arraylength     
	//*  18   26:istore          6
	//*  19   28:iload           4
	//*  20   30:iload           6
	//*  21   32:icmpge          69
		{
			filenamefilter = ((FilenameFilter) (file[j]));
	//   22   35:aload_0         
	//   23   36:iload           4
	//   24   38:aaload          
	//   25   39:astore_1        
			if(k <= i)
	//*  26   40:iload           5
	//*  27   42:iload_2         
	//*  28   43:icmpgt          49
				return k;
	//   29   46:iload           5
	//   30   48:ireturn         
			((File) (filenamefilter)).delete();
	//   31   49:aload_1         
	//   32   50:invokevirtual   #40  <Method boolean File.delete()>
	//   33   53:pop             
			k--;
	//   34   54:iload           5
	//   35   56:iconst_1        
	//   36   57:isub            
	//   37   58:istore          5
		}

	//   38   60:iload           4
	//   39   62:iconst_1        
	//   40   63:iadd            
	//   41   64:istore          4
	//*  42   66:goto            28
		return k;
	//   43   69:iload           5
	//   44   71:ireturn         
	}

	private static final FilenameFilter ALL_FILES_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class Utils$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Utils$1()>
	//    3    7:putstatic       #15  <Field FilenameFilter ALL_FILES_FILTER>
	//*   4   10:return          
	}
}
