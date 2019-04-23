// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.*;
import java.nio.charset.Charset;

final class ay
{

	static void a(Closeable closeable)
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
			try
			{
				closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #34  <Method void Closeable.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   5   11:astore_0        
			{
				throw closeable;
	//    6   12:aload_0         
	//    7   13:athrow          
			}
	//*   8   14:return          
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   9   15:astore_0        
			{
				return;
	//   10   16:return          
			}
		else
			return;
	}

	static void a(File file)
	{
		File afile[] = file.listFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method File[] File.listFiles()>
	//    2    4:astore_3        
		if(afile != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          82
		{
			int j = afile.length;
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:istore_2        
			for(int i = 0; i < j;)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          81
			{
				file = afile[i];
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:astore_0        
				if(file.isDirectory())
	//*  17   23:aload_0         
	//*  18   24:invokevirtual   #45  <Method boolean File.isDirectory()>
	//*  19   27:ifeq            34
					a(file);
	//   20   30:aload_0         
	//   21   31:invokestatic    #47  <Method void a(File)>
				if(file.delete())
	//*  22   34:aload_0         
	//*  23   35:invokevirtual   #50  <Method boolean File.delete()>
	//*  24   38:ifeq            48
				{
					i++;
	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_1        
				} else
	//*  29   45:goto            14
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   30   48:new             #52  <Class StringBuilder>
	//   31   51:dup             
	//   32   52:invokespecial   #55  <Method void StringBuilder()>
	//   33   55:astore_3        
					stringbuilder.append("failed to delete file: ");
	//   34   56:aload_3         
	//   35   57:ldc1            #57  <String "failed to delete file: ">
	//   36   59:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   37   62:pop             
					stringbuilder.append(((Object) (file)));
	//   38   63:aload_3         
	//   39   64:aload_0         
	//   40   65:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   41   68:pop             
					throw new IOException(stringbuilder.toString());
	//   42   69:new             #66  <Class IOException>
	//   43   72:dup             
	//   44   73:aload_3         
	//   45   74:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   46   77:invokespecial   #73  <Method void IOException(String)>
	//   47   80:athrow          
				}
			}

			return;
	//   48   81:return          
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   49   82:new             #52  <Class StringBuilder>
	//   50   85:dup             
	//   51   86:invokespecial   #55  <Method void StringBuilder()>
	//   52   89:astore_3        
			stringbuilder1.append("not a readable directory: ");
	//   53   90:aload_3         
	//   54   91:ldc1            #75  <String "not a readable directory: ">
	//   55   93:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   56   96:pop             
			stringbuilder1.append(((Object) (file)));
	//   57   97:aload_3         
	//   58   98:aload_0         
	//   59   99:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   60  102:pop             
			throw new IOException(stringbuilder1.toString());
	//   61  103:new             #66  <Class IOException>
	//   62  106:dup             
	//   63  107:aload_3         
	//   64  108:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   65  111:invokespecial   #73  <Method void IOException(String)>
	//   66  114:athrow          
		}
	}

	static final Charset a = Charset.forName("US-ASCII");
	static final Charset b = Charset.forName("UTF-8");

	static 
	{
	//    0    0:ldc1            #11  <String "US-ASCII">
	//    1    2:invokestatic    #17  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #19  <Field Charset a>
	//    3    8:ldc1            #21  <String "UTF-8">
	//    4   10:invokestatic    #17  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #23  <Field Charset b>
	//*   6   16:return          
	}
}
