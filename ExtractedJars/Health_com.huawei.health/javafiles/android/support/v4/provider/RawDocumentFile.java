// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.provider:
//			DocumentFile

class RawDocumentFile extends DocumentFile
{

	RawDocumentFile(DocumentFile documentfile, File file)
	{
		super(documentfile);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void DocumentFile(DocumentFile)>
		mFile = file;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field File mFile>
	//    6   10:return          
	}

	private static boolean deleteContents(File file)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
		boolean flag = true;
	//    5    8:iconst_1        
	//    6    9:istore_3        
		if(file != null)
	//*   7   10:aload_0         
	//*   8   11:ifnull          98
		{
			int j = file.length;
	//    9   14:aload_0         
	//   10   15:arraylength     
	//   11   16:istore_2        
			int i = 0;
	//   12   17:iconst_0        
	//   13   18:istore_1        
			do
			{
				flag1 = flag;
	//   14   19:iload_3         
	//   15   20:istore          4
				if(i >= j)
					break;
	//   16   22:iload_1         
	//   17   23:iload_2         
	//   18   24:icmpge          98
				File file1 = ((File) (file[i]));
	//   19   27:aload_0         
	//   20   28:iload_1         
	//   21   29:aaload          
	//   22   30:astore          5
				flag1 = flag;
	//   23   32:iload_3         
	//   24   33:istore          4
				if(file1.isDirectory())
	//*  25   35:aload           5
	//*  26   37:invokevirtual   #26  <Method boolean File.isDirectory()>
	//*  27   40:ifeq            52
					flag1 = flag & deleteContents(file1);
	//   28   43:iload_3         
	//   29   44:aload           5
	//   30   46:invokestatic    #28  <Method boolean deleteContents(File)>
	//   31   49:iand            
	//   32   50:istore          4
				flag = flag1;
	//   33   52:iload           4
	//   34   54:istore_3        
				if(!file1.delete())
	//*  35   55:aload           5
	//*  36   57:invokevirtual   #31  <Method boolean File.delete()>
	//*  37   60:ifne            91
				{
					Log.w("DocumentFile", (new StringBuilder()).append("Failed to delete ").append(((Object) (file1))).toString());
	//   38   63:ldc1            #33  <String "DocumentFile">
	//   39   65:new             #35  <Class StringBuilder>
	//   40   68:dup             
	//   41   69:invokespecial   #38  <Method void StringBuilder()>
	//   42   72:ldc1            #40  <String "Failed to delete ">
	//   43   74:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   44   77:aload           5
	//   45   79:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   46   82:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   47   85:invokestatic    #57  <Method int Log.w(String, String)>
	//   48   88:pop             
					flag = false;
	//   49   89:iconst_0        
	//   50   90:istore_3        
				}
				i++;
	//   51   91:iload_1         
	//   52   92:iconst_1        
	//   53   93:iadd            
	//   54   94:istore_1        
			} while(true);
	//   55   95:goto            19
		}
		return flag1;
	//   56   98:iload           4
	//   57  100:ireturn         
	}

	private static String getTypeForName(String s)
	{
		int i = s.lastIndexOf('.');
	//    0    0:aload_0         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #65  <Method int String.lastIndexOf(int)>
	//    3    6:istore_1        
		if(i >= 0)
	//*   4    7:iload_1         
	//*   5    8:iflt            36
		{
			s = s.substring(i + 1).toLowerCase();
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:invokevirtual   #69  <Method String String.substring(int)>
	//   11   18:invokevirtual   #72  <Method String String.toLowerCase()>
	//   12   21:astore_0        
			s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
	//   13   22:invokestatic    #78  <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   14   25:aload_0         
	//   15   26:invokevirtual   #81  <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   16   29:astore_0        
			if(s != null)
	//*  17   30:aload_0         
	//*  18   31:ifnull          36
				return s;
	//   19   34:aload_0         
	//   20   35:areturn         
		}
		return "application/octet-stream";
	//   21   36:ldc1            #83  <String "application/octet-stream">
	//   22   38:areturn         
	}

	public boolean canRead()
	{
		return mFile.canRead();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #86  <Method boolean File.canRead()>
	//    3    7:ireturn         
	}

	public boolean canWrite()
	{
		return mFile.canWrite();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #89  <Method boolean File.canWrite()>
	//    3    7:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		s = ((String) (new File(mFile, s)));
	//    0    0:new             #18  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field File mFile>
	//    4    8:aload_1         
	//    5    9:invokespecial   #94  <Method void File(File, String)>
	//    6   12:astore_1        
		if(((File) (s)).isDirectory() || ((File) (s)).mkdir())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #26  <Method boolean File.isDirectory()>
	//*   9   17:ifne            27
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #97  <Method boolean File.mkdir()>
	//*  12   24:ifeq            37
			return ((DocumentFile) (new RawDocumentFile(((DocumentFile) (this)), ((File) (s)))));
	//   13   27:new             #2   <Class RawDocumentFile>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #99  <Method void RawDocumentFile(DocumentFile, File)>
	//   18   36:areturn         
		else
			return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
	}

	public DocumentFile createFile(String s, String s1)
	{
		String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
	//    0    0:invokestatic    #78  <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #106 <Method String MimeTypeMap.getExtensionFromMimeType(String)>
	//    3    7:astore_3        
		s = s1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(s2 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          38
			s = (new StringBuilder()).append(s1).append(".").append(s2).toString();
	//    8   14:new             #35  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #38  <Method void StringBuilder()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:ldc1            #108 <String ".">
	//   14   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:aload_3         
	//   16   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   37:astore_1        
		s = ((String) (new File(mFile, s)));
	//   19   38:new             #18  <Class File>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:getfield        #13  <Field File mFile>
	//   23   46:aload_1         
	//   24   47:invokespecial   #94  <Method void File(File, String)>
	//   25   50:astore_1        
		try
		{
			((File) (s)).createNewFile();
	//   26   51:aload_1         
	//   27   52:invokevirtual   #111 <Method boolean File.createNewFile()>
	//   28   55:pop             
			s = ((String) (new RawDocumentFile(((DocumentFile) (this)), ((File) (s)))));
	//   29   56:new             #2   <Class RawDocumentFile>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokespecial   #99  <Method void RawDocumentFile(DocumentFile, File)>
	//   34   65:astore_1        
		}
	//*  35   66:aload_1         
	//*  36   67:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  37   68:astore_1        
		{
			Log.w("DocumentFile", (new StringBuilder()).append("Failed to createFile: ").append(((Object) (s))).toString());
	//   38   69:ldc1            #33  <String "DocumentFile">
	//   39   71:new             #35  <Class StringBuilder>
	//   40   74:dup             
	//   41   75:invokespecial   #38  <Method void StringBuilder()>
	//   42   78:ldc1            #113 <String "Failed to createFile: ">
	//   43   80:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:aload_1         
	//   45   84:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   46   87:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   47   90:invokestatic    #57  <Method int Log.w(String, String)>
	//   48   93:pop             
			return null;
	//   49   94:aconst_null     
	//   50   95:areturn         
		}
		return ((DocumentFile) (s));
	}

	public boolean delete()
	{
		deleteContents(mFile);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokestatic    #28  <Method boolean deleteContents(File)>
	//    3    7:pop             
		return mFile.delete();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field File mFile>
	//    6   12:invokevirtual   #31  <Method boolean File.delete()>
	//    7   15:ireturn         
	}

	public boolean exists()
	{
		return mFile.exists();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #116 <Method boolean File.exists()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return mFile.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #119 <Method String File.getName()>
	//    3    7:areturn         
	}

	public String getType()
	{
		if(mFile.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field File mFile>
	//*   2    4:invokevirtual   #26  <Method boolean File.isDirectory()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return getTypeForName(mFile.getName());
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field File mFile>
	//    8   16:invokevirtual   #119 <Method String File.getName()>
	//    9   19:invokestatic    #122 <Method String getTypeForName(String)>
	//   10   22:areturn         
	}

	public Uri getUri()
	{
		return Uri.fromFile(mFile);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokestatic    #130 <Method Uri Uri.fromFile(File)>
	//    3    7:areturn         
	}

	public boolean isDirectory()
	{
		return mFile.isDirectory();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #26  <Method boolean File.isDirectory()>
	//    3    7:ireturn         
	}

	public boolean isFile()
	{
		return mFile.isFile();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #133 <Method boolean File.isFile()>
	//    3    7:ireturn         
	}

	public boolean isVirtual()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long lastModified()
	{
		return mFile.lastModified();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #138 <Method long File.lastModified()>
	//    3    7:lreturn         
	}

	public long length()
	{
		return mFile.length();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field File mFile>
	//    2    4:invokevirtual   #141 <Method long File.length()>
	//    3    7:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #144 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void ArrayList()>
	//    3    7:astore_3        
		File afile[] = mFile.listFiles();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field File mFile>
	//    6   12:invokevirtual   #22  <Method File[] File.listFiles()>
	//    7   15:astore          4
		if(afile != null)
	//*   8   17:aload           4
	//*   9   19:ifnull          57
		{
			int j = afile.length;
	//   10   22:aload           4
	//   11   24:arraylength     
	//   12   25:istore_2        
			for(int i = 0; i < j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore_1        
	//*  15   28:iload_1         
	//*  16   29:iload_2         
	//*  17   30:icmpge          57
				arraylist.add(((Object) (new RawDocumentFile(((DocumentFile) (this)), afile[i]))));
	//   18   33:aload_3         
	//   19   34:new             #2   <Class RawDocumentFile>
	//   20   37:dup             
	//   21   38:aload_0         
	//   22   39:aload           4
	//   23   41:iload_1         
	//   24   42:aaload          
	//   25   43:invokespecial   #99  <Method void RawDocumentFile(DocumentFile, File)>
	//   26   46:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
	//   27   49:pop             

	//   28   50:iload_1         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_1        
		}
	//*  32   54:goto            28
		return (DocumentFile[])arraylist.toArray(((Object []) (new DocumentFile[arraylist.size()])));
	//   33   57:aload_3         
	//   34   58:aload_3         
	//   35   59:invokevirtual   #153 <Method int ArrayList.size()>
	//   36   62:anewarray       DocumentFile[]
	//   37   65:invokevirtual   #157 <Method Object[] ArrayList.toArray(Object[])>
	//   38   68:checkcast       #159 <Class DocumentFile[]>
	//   39   71:areturn         
	}

	public boolean renameTo(String s)
	{
		s = ((String) (new File(mFile.getParentFile(), s)));
	//    0    0:new             #18  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field File mFile>
	//    4    8:invokevirtual   #165 <Method File File.getParentFile()>
	//    5   11:aload_1         
	//    6   12:invokespecial   #94  <Method void File(File, String)>
	//    7   15:astore_1        
		if(mFile.renameTo(((File) (s))))
	//*   8   16:aload_0         
	//*   9   17:getfield        #13  <Field File mFile>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #167 <Method boolean File.renameTo(File)>
	//*  12   24:ifeq            34
		{
			mFile = ((File) (s));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #13  <Field File mFile>
			return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		} else
		{
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		}
	}

	private File mFile;
}
