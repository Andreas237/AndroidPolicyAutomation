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
	//    2    2:invokespecial   #12  <Method void DocumentFile(DocumentFile)>
		mFile = file;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field File mFile>
	//    6   10:return          
	}

	private static boolean deleteContents(File file)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(file != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          104
		{
			int j = file.length;
	//    7   11:aload_0         
	//    8   12:arraylength     
	//    9   13:istore_2        
			flag = true;
	//   10   14:iconst_1        
	//   11   15:istore_3        
			for(int i = 0; i < j; i++)
	//*  12   16:iconst_0        
	//*  13   17:istore_1        
	//*  14   18:iload_1         
	//*  15   19:iload_2         
	//*  16   20:icmpge          104
			{
				File file1 = ((File) (file[i]));
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:aaload          
	//   20   26:astore          5
				boolean flag1 = flag;
	//   21   28:iload_3         
	//   22   29:istore          4
				if(file1.isDirectory())
	//*  23   31:aload           5
	//*  24   33:invokevirtual   #28  <Method boolean File.isDirectory()>
	//*  25   36:ifeq            48
					flag1 = flag & deleteContents(file1);
	//   26   39:iload_3         
	//   27   40:aload           5
	//   28   42:invokestatic    #30  <Method boolean deleteContents(File)>
	//   29   45:iand            
	//   30   46:istore          4
				flag = flag1;
	//   31   48:iload           4
	//   32   50:istore_3        
				if(!file1.delete())
	//*  33   51:aload           5
	//*  34   53:invokevirtual   #33  <Method boolean File.delete()>
	//*  35   56:ifne            97
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   36   59:new             #35  <Class StringBuilder>
	//   37   62:dup             
	//   38   63:invokespecial   #38  <Method void StringBuilder()>
	//   39   66:astore          6
					stringbuilder.append("Failed to delete ");
	//   40   68:aload           6
	//   41   70:ldc1            #40  <String "Failed to delete ">
	//   42   72:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   43   75:pop             
					stringbuilder.append(((Object) (file1)));
	//   44   76:aload           6
	//   45   78:aload           5
	//   46   80:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   47   83:pop             
					Log.w("DocumentFile", stringbuilder.toString());
	//   48   84:ldc1            #49  <String "DocumentFile">
	//   49   86:aload           6
	//   50   88:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   51   91:invokestatic    #59  <Method int Log.w(String, String)>
	//   52   94:pop             
					flag = false;
	//   53   95:iconst_0        
	//   54   96:istore_3        
				}
			}

	//   55   97:iload_1         
	//   56   98:iconst_1        
	//   57   99:iadd            
	//   58  100:istore_1        
		}
	//*  59  101:goto            18
		return flag;
	//   60  104:iload_3         
	//   61  105:ireturn         
	}

	private static String getTypeForName(String s)
	{
		int i = s.lastIndexOf('.');
	//    0    0:aload_0         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #67  <Method int String.lastIndexOf(int)>
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
	//   10   15:invokevirtual   #71  <Method String String.substring(int)>
	//   11   18:invokevirtual   #74  <Method String String.toLowerCase()>
	//   12   21:astore_0        
			s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
	//   13   22:invokestatic    #80  <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   14   25:aload_0         
	//   15   26:invokevirtual   #83  <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   16   29:astore_0        
			if(s != null)
	//*  17   30:aload_0         
	//*  18   31:ifnull          36
				return s;
	//   19   34:aload_0         
	//   20   35:areturn         
		}
		return "application/octet-stream";
	//   21   36:ldc1            #85  <String "application/octet-stream">
	//   22   38:areturn         
	}

	public boolean canRead()
	{
		return mFile.canRead();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #88  <Method boolean File.canRead()>
	//    3    7:ireturn         
	}

	public boolean canWrite()
	{
		return mFile.canWrite();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #91  <Method boolean File.canWrite()>
	//    3    7:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		s = ((String) (new File(mFile, s)));
	//    0    0:new             #20  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field File mFile>
	//    4    8:aload_1         
	//    5    9:invokespecial   #96  <Method void File(File, String)>
	//    6   12:astore_1        
		if(!((File) (s)).isDirectory() && !((File) (s)).mkdir())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #28  <Method boolean File.isDirectory()>
	//*   9   17:ifne            32
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #99  <Method boolean File.mkdir()>
	//*  12   24:ifeq            30
	//*  13   27:goto            32
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		else
			return ((DocumentFile) (new RawDocumentFile(((DocumentFile) (this)), ((File) (s)))));
	//   16   32:new             #2   <Class RawDocumentFile>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #101 <Method void RawDocumentFile(DocumentFile, File)>
	//   21   41:areturn         
	}

	public DocumentFile createFile(String s, String s1)
	{
		String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
	//    0    0:invokestatic    #80  <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #109 <Method String MimeTypeMap.getExtensionFromMimeType(String)>
	//    3    7:astore_3        
		s = s1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(s2 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          46
		{
			s = ((String) (new StringBuilder()));
	//    8   14:new             #35  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #38  <Method void StringBuilder()>
	//   11   21:astore_1        
			((StringBuilder) (s)).append(s1);
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			((StringBuilder) (s)).append(".");
	//   16   28:aload_1         
	//   17   29:ldc1            #111 <String ".">
	//   18   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			((StringBuilder) (s)).append(s2);
	//   20   35:aload_1         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
			s = ((StringBuilder) (s)).toString();
	//   24   41:aload_1         
	//   25   42:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   26   45:astore_1        
		}
		s = ((String) (new File(mFile, s)));
	//   27   46:new             #20  <Class File>
	//   28   49:dup             
	//   29   50:aload_0         
	//   30   51:getfield        #14  <Field File mFile>
	//   31   54:aload_1         
	//   32   55:invokespecial   #96  <Method void File(File, String)>
	//   33   58:astore_1        
		try
		{
			((File) (s)).createNewFile();
	//   34   59:aload_1         
	//   35   60:invokevirtual   #114 <Method boolean File.createNewFile()>
	//   36   63:pop             
			s = ((String) (new RawDocumentFile(((DocumentFile) (this)), ((File) (s)))));
	//   37   64:new             #2   <Class RawDocumentFile>
	//   38   67:dup             
	//   39   68:aload_0         
	//   40   69:aload_1         
	//   41   70:invokespecial   #101 <Method void RawDocumentFile(DocumentFile, File)>
	//   42   73:astore_1        
		}
	//*  43   74:aload_1         
	//*  44   75:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   76:astore_1        
		{
			s1 = ((String) (new StringBuilder()));
	//   46   77:new             #35  <Class StringBuilder>
	//   47   80:dup             
	//   48   81:invokespecial   #38  <Method void StringBuilder()>
	//   49   84:astore_2        
			((StringBuilder) (s1)).append("Failed to createFile: ");
	//   50   85:aload_2         
	//   51   86:ldc1            #116 <String "Failed to createFile: ">
	//   52   88:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   53   91:pop             
			((StringBuilder) (s1)).append(((Object) (s)));
	//   54   92:aload_2         
	//   55   93:aload_1         
	//   56   94:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   57   97:pop             
			Log.w("DocumentFile", ((StringBuilder) (s1)).toString());
	//   58   98:ldc1            #49  <String "DocumentFile">
	//   59  100:aload_2         
	//   60  101:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   61  104:invokestatic    #59  <Method int Log.w(String, String)>
	//   62  107:pop             
			return null;
	//   63  108:aconst_null     
	//   64  109:areturn         
		}
		return ((DocumentFile) (s));
	}

	public boolean delete()
	{
		deleteContents(mFile);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokestatic    #30  <Method boolean deleteContents(File)>
	//    3    7:pop             
		return mFile.delete();
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field File mFile>
	//    6   12:invokevirtual   #33  <Method boolean File.delete()>
	//    7   15:ireturn         
	}

	public boolean exists()
	{
		return mFile.exists();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #119 <Method boolean File.exists()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return mFile.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #122 <Method String File.getName()>
	//    3    7:areturn         
	}

	public String getType()
	{
		if(mFile.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field File mFile>
	//*   2    4:invokevirtual   #28  <Method boolean File.isDirectory()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return getTypeForName(mFile.getName());
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field File mFile>
	//    8   16:invokevirtual   #122 <Method String File.getName()>
	//    9   19:invokestatic    #125 <Method String getTypeForName(String)>
	//   10   22:areturn         
	}

	public Uri getUri()
	{
		return Uri.fromFile(mFile);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokestatic    #133 <Method Uri Uri.fromFile(File)>
	//    3    7:areturn         
	}

	public boolean isDirectory()
	{
		return mFile.isDirectory();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #28  <Method boolean File.isDirectory()>
	//    3    7:ireturn         
	}

	public boolean isFile()
	{
		return mFile.isFile();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #136 <Method boolean File.isFile()>
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
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #141 <Method long File.lastModified()>
	//    3    7:lreturn         
	}

	public long length()
	{
		return mFile.length();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mFile>
	//    2    4:invokevirtual   #144 <Method long File.length()>
	//    3    7:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #147 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #148 <Method void ArrayList()>
	//    3    7:astore_3        
		File afile[] = mFile.listFiles();
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field File mFile>
	//    6   12:invokevirtual   #24  <Method File[] File.listFiles()>
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
	//   25   43:invokespecial   #101 <Method void RawDocumentFile(DocumentFile, File)>
	//   26   46:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
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
	//   35   59:invokevirtual   #156 <Method int ArrayList.size()>
	//   36   62:anewarray       DocumentFile[]
	//   37   65:invokevirtual   #160 <Method Object[] ArrayList.toArray(Object[])>
	//   38   68:checkcast       #162 <Class DocumentFile[]>
	//   39   71:areturn         
	}

	public boolean renameTo(String s)
	{
		s = ((String) (new File(mFile.getParentFile(), s)));
	//    0    0:new             #20  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field File mFile>
	//    4    8:invokevirtual   #168 <Method File File.getParentFile()>
	//    5   11:aload_1         
	//    6   12:invokespecial   #96  <Method void File(File, String)>
	//    7   15:astore_1        
		if(mFile.renameTo(((File) (s))))
	//*   8   16:aload_0         
	//*   9   17:getfield        #14  <Field File mFile>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #170 <Method boolean File.renameTo(File)>
	//*  12   24:ifeq            34
		{
			mFile = ((File) (s));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #14  <Field File mFile>
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
