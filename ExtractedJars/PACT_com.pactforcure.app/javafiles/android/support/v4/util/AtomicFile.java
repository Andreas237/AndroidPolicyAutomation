// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import android.util.Log;
import java.io.*;

public class AtomicFile
{

	public AtomicFile(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mBaseName = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field File mBaseName>
		mBackupName = new File((new StringBuilder()).append(file.getPath()).append(".bak").toString());
	//    5    9:aload_0         
	//    6   10:new             #16  <Class File>
	//    7   13:dup             
	//    8   14:new             #18  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #19  <Method void StringBuilder()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #23  <Method String File.getPath()>
	//   13   25:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:ldc1            #29  <String ".bak">
	//   15   30:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   17   36:invokespecial   #35  <Method void File(String)>
	//   18   39:putfield        #37  <Field File mBackupName>
	//   19   42:return          
	}

	static boolean sync(FileOutputStream fileoutputstream)
	{
		if(fileoutputstream != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
			try
			{
				fileoutputstream.getFD().sync();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #48  <Method FileDescriptor FileOutputStream.getFD()>
	//    4    8:invokevirtual   #52  <Method void FileDescriptor.sync()>
			}
	//*   5   11:iconst_1        
	//*   6   12:ireturn         
			// Misplaced declaration of an exception variable
			catch(FileOutputStream fileoutputstream)
	//*   7   13:astore_0        
			{
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			}
		return true;
	}

	public void delete()
	{
		mBaseName.delete();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mBaseName>
	//    2    4:invokevirtual   #56  <Method boolean File.delete()>
	//    3    7:pop             
		mBackupName.delete();
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field File mBackupName>
	//    6   12:invokevirtual   #56  <Method boolean File.delete()>
	//    7   15:pop             
	//    8   16:return          
	}

	public void failWrite(FileOutputStream fileoutputstream)
	{
		if(fileoutputstream == null)
			break MISSING_BLOCK_LABEL_33;
	//    0    0:aload_1         
	//    1    1:ifnull          33
		sync(fileoutputstream);
	//    2    4:aload_1         
	//    3    5:invokestatic    #60  <Method boolean sync(FileOutputStream)>
	//    4    8:pop             
		fileoutputstream.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #63  <Method void FileOutputStream.close()>
		mBaseName.delete();
	//    7   13:aload_0         
	//    8   14:getfield        #14  <Field File mBaseName>
	//    9   17:invokevirtual   #56  <Method boolean File.delete()>
	//   10   20:pop             
		mBackupName.renameTo(mBaseName);
	//   11   21:aload_0         
	//   12   22:getfield        #37  <Field File mBackupName>
	//   13   25:aload_0         
	//   14   26:getfield        #14  <Field File mBaseName>
	//   15   29:invokevirtual   #67  <Method boolean File.renameTo(File)>
	//   16   32:pop             
		return;
	//   17   33:return          
		fileoutputstream;
	//   18   34:astore_1        
		Log.w("AtomicFile", "failWrite: Got exception:", ((Throwable) (fileoutputstream)));
	//   19   35:ldc1            #69  <String "AtomicFile">
	//   20   37:ldc1            #71  <String "failWrite: Got exception:">
	//   21   39:aload_1         
	//   22   40:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   23   43:pop             
		return;
	//   24   44:return          
	}

	public void finishWrite(FileOutputStream fileoutputstream)
	{
		if(fileoutputstream == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_1         
	//    1    1:ifnull          21
		sync(fileoutputstream);
	//    2    4:aload_1         
	//    3    5:invokestatic    #60  <Method boolean sync(FileOutputStream)>
	//    4    8:pop             
		fileoutputstream.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #63  <Method void FileOutputStream.close()>
		mBackupName.delete();
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field File mBackupName>
	//    9   17:invokevirtual   #56  <Method boolean File.delete()>
	//   10   20:pop             
		return;
	//   11   21:return          
		fileoutputstream;
	//   12   22:astore_1        
		Log.w("AtomicFile", "finishWrite: Got exception:", ((Throwable) (fileoutputstream)));
	//   13   23:ldc1            #69  <String "AtomicFile">
	//   14   25:ldc1            #80  <String "finishWrite: Got exception:">
	//   15   27:aload_1         
	//   16   28:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   17   31:pop             
		return;
	//   18   32:return          
	}

	public File getBaseFile()
	{
		return mBaseName;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field File mBaseName>
	//    2    4:areturn         
	}

	public FileInputStream openRead()
		throws FileNotFoundException
	{
		if(mBackupName.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field File mBackupName>
	//*   2    4:invokevirtual   #89  <Method boolean File.exists()>
	//*   3    7:ifeq            30
		{
			mBaseName.delete();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field File mBaseName>
	//    6   14:invokevirtual   #56  <Method boolean File.delete()>
	//    7   17:pop             
			mBackupName.renameTo(mBaseName);
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field File mBackupName>
	//   10   22:aload_0         
	//   11   23:getfield        #14  <Field File mBaseName>
	//   12   26:invokevirtual   #67  <Method boolean File.renameTo(File)>
	//   13   29:pop             
		}
		return new FileInputStream(mBaseName);
	//   14   30:new             #91  <Class FileInputStream>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field File mBaseName>
	//   18   38:invokespecial   #93  <Method void FileInputStream(File)>
	//   19   41:areturn         
	}

	public byte[] readFully()
		throws IOException
	{
		int i;
		FileInputStream fileinputstream;
		fileinputstream = openRead();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method FileInputStream openRead()>
	//    2    4:astore          6
		i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		byte abyte0[] = new byte[fileinputstream.available()];
	//    5    8:aload           6
	//    6   10:invokevirtual   #102 <Method int FileInputStream.available()>
	//    7   13:newarray        byte[]
	//    8   15:astore          4
_L2:
		int j = fileinputstream.read(abyte0, i, abyte0.length - i);
	//    9   17:aload           6
	//   10   19:aload           4
	//   11   21:iload_1         
	//   12   22:aload           4
	//   13   24:arraylength     
	//   14   25:iload_1         
	//   15   26:isub            
	//   16   27:invokevirtual   #106 <Method int FileInputStream.read(byte[], int, int)>
	//   17   30:istore_2        
		if(j <= 0)
	//*  18   31:iload_2         
	//*  19   32:ifgt            43
		{
			fileinputstream.close();
	//   20   35:aload           6
	//   21   37:invokevirtual   #107 <Method void FileInputStream.close()>
			return abyte0;
	//   22   40:aload           4
	//   23   42:areturn         
		}
		j = i + j;
	//   24   43:iload_1         
	//   25   44:iload_2         
	//   26   45:iadd            
	//   27   46:istore_2        
		int k = fileinputstream.available();
	//   28   47:aload           6
	//   29   49:invokevirtual   #102 <Method int FileInputStream.available()>
	//   30   52:istore_3        
		i = j;
	//   31   53:iload_2         
	//   32   54:istore_1        
		if(k <= abyte0.length - j) goto _L2; else goto _L1
	//   33   55:iload_3         
	//   34   56:aload           4
	//   35   58:arraylength     
	//   36   59:iload_2         
	//   37   60:isub            
	//   38   61:icmple          17
_L1:
		byte abyte1[];
		abyte1 = new byte[j + k];
	//   39   64:iload_2         
	//   40   65:iload_3         
	//   41   66:iadd            
	//   42   67:newarray        byte[]
	//   43   69:astore          5
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, j);
	//   44   71:aload           4
	//   45   73:iconst_0        
	//   46   74:aload           5
	//   47   76:iconst_0        
	//   48   77:iload_2         
	//   49   78:invokestatic    #113 <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = abyte1;
	//   50   81:aload           5
	//   51   83:astore          4
		i = j;
	//   52   85:iload_2         
	//   53   86:istore_1        
		  goto _L2
	//*  54   87:goto            17
		Exception exception;
		exception;
	//   55   90:astore          4
		fileinputstream.close();
	//   56   92:aload           6
	//   57   94:invokevirtual   #107 <Method void FileInputStream.close()>
		throw exception;
	//   58   97:aload           4
	//   59   99:athrow          
	}

	public FileOutputStream startWrite()
		throws IOException
	{
		FileOutputStream fileoutputstream;
		if(mBaseName.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field File mBaseName>
	//*   2    4:invokevirtual   #89  <Method boolean File.exists()>
	//*   3    7:ifeq            74
			if(!mBackupName.exists())
	//*   4   10:aload_0         
	//*   5   11:getfield        #37  <Field File mBackupName>
	//*   6   14:invokevirtual   #89  <Method boolean File.exists()>
	//*   7   17:ifne            88
			{
				if(!mBaseName.renameTo(mBackupName))
	//*   8   20:aload_0         
	//*   9   21:getfield        #14  <Field File mBaseName>
	//*  10   24:aload_0         
	//*  11   25:getfield        #37  <Field File mBackupName>
	//*  12   28:invokevirtual   #67  <Method boolean File.renameTo(File)>
	//*  13   31:ifne            74
					Log.w("AtomicFile", (new StringBuilder()).append("Couldn't rename file ").append(((Object) (mBaseName))).append(" to backup file ").append(((Object) (mBackupName))).toString());
	//   14   34:ldc1            #69  <String "AtomicFile">
	//   15   36:new             #18  <Class StringBuilder>
	//   16   39:dup             
	//   17   40:invokespecial   #19  <Method void StringBuilder()>
	//   18   43:ldc1            #117 <String "Couldn't rename file ">
	//   19   45:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #14  <Field File mBaseName>
	//   22   52:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #122 <String " to backup file ">
	//   24   57:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #37  <Field File mBackupName>
	//   27   64:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   28   67:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   29   70:invokestatic    #125 <Method int Log.w(String, String)>
	//   30   73:pop             
			} else
	//*  31   74:new             #44  <Class FileOutputStream>
	//*  32   77:dup             
	//*  33   78:aload_0         
	//*  34   79:getfield        #14  <Field File mBaseName>
	//*  35   82:invokespecial   #126 <Method void FileOutputStream(File)>
	//*  36   85:astore_1        
	//*  37   86:aload_1         
	//*  38   87:areturn         
			{
				mBaseName.delete();
	//   39   88:aload_0         
	//   40   89:getfield        #14  <Field File mBaseName>
	//   41   92:invokevirtual   #56  <Method boolean File.delete()>
	//   42   95:pop             
			}
		try
		{
			fileoutputstream = new FileOutputStream(mBaseName);
		}
	//*  43   96:goto            74
		catch(FileNotFoundException filenotfoundexception)
	//*  44   99:astore_1        
		{
			if(!mBaseName.getParentFile().mkdirs())
	//*  45  100:aload_0         
	//*  46  101:getfield        #14  <Field File mBaseName>
	//*  47  104:invokevirtual   #129 <Method File File.getParentFile()>
	//*  48  107:invokevirtual   #132 <Method boolean File.mkdirs()>
	//*  49  110:ifne            143
				throw new IOException((new StringBuilder()).append("Couldn't create directory ").append(((Object) (mBaseName))).toString());
	//   50  113:new             #42  <Class IOException>
	//   51  116:dup             
	//   52  117:new             #18  <Class StringBuilder>
	//   53  120:dup             
	//   54  121:invokespecial   #19  <Method void StringBuilder()>
	//   55  124:ldc1            #134 <String "Couldn't create directory ">
	//   56  126:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   57  129:aload_0         
	//   58  130:getfield        #14  <Field File mBaseName>
	//   59  133:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   60  136:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   61  139:invokespecial   #135 <Method void IOException(String)>
	//   62  142:athrow          
			FileOutputStream fileoutputstream1;
			try
			{
				fileoutputstream1 = new FileOutputStream(mBaseName);
	//   63  143:new             #44  <Class FileOutputStream>
	//   64  146:dup             
	//   65  147:aload_0         
	//   66  148:getfield        #14  <Field File mBaseName>
	//   67  151:invokespecial   #126 <Method void FileOutputStream(File)>
	//   68  154:astore_1        
			}
	//*  69  155:aload_1         
	//*  70  156:areturn         
			catch(FileNotFoundException filenotfoundexception1)
	//*  71  157:astore_1        
			{
				throw new IOException((new StringBuilder()).append("Couldn't create ").append(((Object) (mBaseName))).toString());
	//   72  158:new             #42  <Class IOException>
	//   73  161:dup             
	//   74  162:new             #18  <Class StringBuilder>
	//   75  165:dup             
	//   76  166:invokespecial   #19  <Method void StringBuilder()>
	//   77  169:ldc1            #137 <String "Couldn't create ">
	//   78  171:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   79  174:aload_0         
	//   80  175:getfield        #14  <Field File mBaseName>
	//   81  178:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   82  181:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   83  184:invokespecial   #135 <Method void IOException(String)>
	//   84  187:athrow          
			}
			return fileoutputstream1;
		}
		return fileoutputstream;
	}

	private final File mBackupName;
	private final File mBaseName;
}
