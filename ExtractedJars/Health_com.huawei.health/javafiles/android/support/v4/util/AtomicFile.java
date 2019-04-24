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
		if(fileoutputstream != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			sync(fileoutputstream);
	//    2    4:aload_1         
	//    3    5:invokestatic    #60  <Method boolean sync(FileOutputStream)>
	//    4    8:pop             
			try
			{
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
			}
			// Misplaced declaration of an exception variable
			catch(FileOutputStream fileoutputstream)
	//*  18   34:astore_1        
			{
				Log.w("AtomicFile", "failWrite: Got exception:", ((Throwable) (fileoutputstream)));
	//   19   35:ldc1            #69  <String "AtomicFile">
	//   20   37:ldc1            #71  <String "failWrite: Got exception:">
	//   21   39:aload_1         
	//   22   40:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   23   43:pop             
			}
		}
	//   24   44:return          
	}

	public void finishWrite(FileOutputStream fileoutputstream)
	{
		if(fileoutputstream != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			sync(fileoutputstream);
	//    2    4:aload_1         
	//    3    5:invokestatic    #60  <Method boolean sync(FileOutputStream)>
	//    4    8:pop             
			try
			{
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
			}
			// Misplaced declaration of an exception variable
			catch(FileOutputStream fileoutputstream)
	//*  12   22:astore_1        
			{
				Log.w("AtomicFile", "finishWrite: Got exception:", ((Throwable) (fileoutputstream)));
	//   13   23:ldc1            #69  <String "AtomicFile">
	//   14   25:ldc1            #80  <String "finishWrite: Got exception:">
	//   15   27:aload_1         
	//   16   28:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   17   31:pop             
			}
		}
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
	//    2    4:astore          5
		i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		byte abyte0[] = new byte[fileinputstream.available()];
	//    5    8:aload           5
	//    6   10:invokevirtual   #102 <Method int FileInputStream.available()>
	//    7   13:newarray        byte[]
	//    8   15:astore_3        
_L1:
		int j = fileinputstream.read(abyte0, i, abyte0.length - i);
	//    9   16:aload           5
	//   10   18:aload_3         
	//   11   19:iload_1         
	//   12   20:aload_3         
	//   13   21:arraylength     
	//   14   22:iload_1         
	//   15   23:isub            
	//   16   24:invokevirtual   #106 <Method int FileInputStream.read(byte[], int, int)>
	//   17   27:istore_2        
		if(j <= 0)
	//*  18   28:iload_2         
	//*  19   29:ifgt            39
		{
			fileinputstream.close();
	//   20   32:aload           5
	//   21   34:invokevirtual   #107 <Method void FileInputStream.close()>
			return abyte0;
	//   22   37:aload_3         
	//   23   38:areturn         
		}
		i += j;
	//   24   39:iload_1         
	//   25   40:iload_2         
	//   26   41:iadd            
	//   27   42:istore_1        
		j = fileinputstream.available();
	//   28   43:aload           5
	//   29   45:invokevirtual   #102 <Method int FileInputStream.available()>
	//   30   48:istore_2        
		byte abyte1[] = abyte0;
	//   31   49:aload_3         
	//   32   50:astore          4
		if(j > abyte0.length - i)
	//*  33   52:iload_2         
	//*  34   53:aload_3         
	//*  35   54:arraylength     
	//*  36   55:iload_1         
	//*  37   56:isub            
	//*  38   57:icmple          76
		{
			abyte1 = new byte[i + j];
	//   39   60:iload_1         
	//   40   61:iload_2         
	//   41   62:iadd            
	//   42   63:newarray        byte[]
	//   43   65:astore          4
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, i);
	//   44   67:aload_3         
	//   45   68:iconst_0        
	//   46   69:aload           4
	//   47   71:iconst_0        
	//   48   72:iload_1         
	//   49   73:invokestatic    #113 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		abyte0 = abyte1;
	//   50   76:aload           4
	//   51   78:astore_3        
		  goto _L1
	//*  52   79:goto            16
		Exception exception;
		exception;
	//   53   82:astore_3        
		fileinputstream.close();
	//   54   83:aload           5
	//   55   85:invokevirtual   #107 <Method void FileInputStream.close()>
		throw exception;
	//   56   88:aload_3         
	//   57   89:athrow          
	}

	public FileOutputStream startWrite()
		throws IOException
	{
		if(mBaseName.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field File mBaseName>
	//*   2    4:invokevirtual   #89  <Method boolean File.exists()>
	//*   3    7:ifeq            85
			if(!mBackupName.exists())
	//*   4   10:aload_0         
	//*   5   11:getfield        #37  <Field File mBackupName>
	//*   6   14:invokevirtual   #89  <Method boolean File.exists()>
	//*   7   17:ifne            77
			{
				if(!mBaseName.renameTo(mBackupName))
	//*   8   20:aload_0         
	//*   9   21:getfield        #14  <Field File mBaseName>
	//*  10   24:aload_0         
	//*  11   25:getfield        #37  <Field File mBackupName>
	//*  12   28:invokevirtual   #67  <Method boolean File.renameTo(File)>
	//*  13   31:ifne            85
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
	//*  31   74:goto            85
			{
				mBaseName.delete();
	//   32   77:aload_0         
	//   33   78:getfield        #14  <Field File mBaseName>
	//   34   81:invokevirtual   #56  <Method boolean File.delete()>
	//   35   84:pop             
			}
		FileOutputStream fileoutputstream;
		try
		{
			fileoutputstream = new FileOutputStream(mBaseName);
	//   36   85:new             #44  <Class FileOutputStream>
	//   37   88:dup             
	//   38   89:aload_0         
	//   39   90:getfield        #14  <Field File mBaseName>
	//   40   93:invokespecial   #126 <Method void FileOutputStream(File)>
	//   41   96:astore_1        
		}
	//*  42   97:aload_1         
	//*  43   98:areturn         
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
