// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gx, gz, gv, hj

public class gs extends gx
{

	public gs(Context context, String s, String s1, String s2)
	{
		super(context, s, s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #8   <Method void gx(Context, String, String, String)>
	//    6    9:return          
	}

	private void a(File file, File file1)
	{
		FileInputStream fileinputstream;
		byte abyte0[];
		fileinputstream = new FileInputStream(file);
	//    0    0:new             #15  <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void FileInputStream(File)>
	//    4    8:astore          5
		fileinputstream.read(new byte[32]);
	//    5   10:aload           5
	//    6   12:bipush          32
	//    7   14:newarray        byte[]
	//    8   16:invokevirtual   #22  <Method int FileInputStream.read(byte[])>
	//    9   19:pop             
		file1 = ((File) (new RandomAccessFile(file1, "rw")));
	//   10   20:new             #24  <Class RandomAccessFile>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:ldc1            #26  <String "rw">
	//   14   27:invokespecial   #29  <Method void RandomAccessFile(File, String)>
	//   15   30:astore_2        
		abyte0 = new byte[1024];
	//   16   31:sipush          1024
	//   17   34:newarray        byte[]
	//   18   36:astore          6
		int i = 0;
	//   19   38:iconst_0        
	//   20   39:istore_3        
_L2:
		int j = fileinputstream.read(abyte0);
	//   21   40:aload           5
	//   22   42:aload           6
	//   23   44:invokevirtual   #22  <Method int FileInputStream.read(byte[])>
	//   24   47:istore          4
		if(j <= 0)
			break MISSING_BLOCK_LABEL_109;
	//   25   49:iload           4
	//   26   51:ifle            109
		if(j != 1024)
			break MISSING_BLOCK_LABEL_77;
	//   27   54:iload           4
	//   28   56:sipush          1024
	//   29   59:icmpne          77
		((RandomAccessFile) (file1)).seek(i);
	//   30   62:aload_2         
	//   31   63:iload_3         
	//   32   64:i2l             
	//   33   65:invokevirtual   #33  <Method void RandomAccessFile.seek(long)>
		((RandomAccessFile) (file1)).write(abyte0);
	//   34   68:aload_2         
	//   35   69:aload           6
	//   36   71:invokevirtual   #37  <Method void RandomAccessFile.write(byte[])>
		break MISSING_BLOCK_LABEL_130;
	//   37   74:goto            130
		byte abyte1[] = new byte[j];
	//   38   77:iload           4
	//   39   79:newarray        byte[]
	//   40   81:astore          7
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, j);
	//   41   83:aload           6
	//   42   85:iconst_0        
	//   43   86:aload           7
	//   44   88:iconst_0        
	//   45   89:iload           4
	//   46   91:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
		((RandomAccessFile) (file1)).seek(i);
	//   47   94:aload_2         
	//   48   95:iload_3         
	//   49   96:i2l             
	//   50   97:invokevirtual   #33  <Method void RandomAccessFile.seek(long)>
		((RandomAccessFile) (file1)).write(abyte1);
	//   51  100:aload_2         
	//   52  101:aload           7
	//   53  103:invokevirtual   #37  <Method void RandomAccessFile.write(byte[])>
		break MISSING_BLOCK_LABEL_130;
	//   54  106:goto            130
		try
		{
			fileinputstream.close();
	//   55  109:aload           5
	//   56  111:invokevirtual   #47  <Method void FileInputStream.close()>
			((RandomAccessFile) (file1)).close();
	//   57  114:aload_2         
	//   58  115:invokevirtual   #48  <Method void RandomAccessFile.close()>
			file.delete();
	//   59  118:aload_1         
	//   60  119:invokevirtual   #54  <Method boolean File.delete()>
	//   61  122:pop             
			return;
	//   62  123:return          
		}
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  63  124:astore_1        
		{
			((Throwable) (file)).printStackTrace();
	//   64  125:aload_1         
	//   65  126:invokevirtual   #57  <Method void Throwable.printStackTrace()>
		}
		return;
	//   66  129:return          
		i += j;
	//   67  130:iload_3         
	//   68  131:iload           4
	//   69  133:iadd            
	//   70  134:istore_3        
		if(true) goto _L2; else goto _L1
	//   71  135:goto            40
_L1:
	}

	public void a()
	{
		if(a == null || TextUtils.isEmpty(((CharSequence) (a.c()))) || !a.c().endsWith("png") || !a.c().contains(((CharSequence) (gz.a(f)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field gx$a a>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field gx$a a>
	//*   5   11:invokevirtual   #66  <Method String gx$a.c()>
	//*   6   14:invokestatic    #72  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            55
	//*   8   20:aload_0         
	//*   9   21:getfield        #60  <Field gx$a a>
	//*  10   24:invokevirtual   #66  <Method String gx$a.c()>
	//*  11   27:ldc1            #74  <String "png">
	//*  12   29:invokevirtual   #80  <Method boolean String.endsWith(String)>
	//*  13   32:ifeq            55
	//*  14   35:aload_0         
	//*  15   36:getfield        #60  <Field gx$a a>
	//*  16   39:invokevirtual   #66  <Method String gx$a.c()>
	//*  17   42:aload_0         
	//*  18   43:getfield        #84  <Field Context f>
	//*  19   46:invokestatic    #89  <Method String gz.a(Context)>
	//*  20   49:invokevirtual   #92  <Method boolean String.contains(CharSequence)>
	//*  21   52:ifne            56
			return;
	//   22   55:return          
		if((new File(d)).exists())
	//*  23   56:new             #50  <Class File>
	//*  24   59:dup             
	//*  25   60:aload_0         
	//*  26   61:getfield        #96  <Field String d>
	//*  27   64:invokespecial   #99  <Method void File(String)>
	//*  28   67:invokevirtual   #102 <Method boolean File.exists()>
	//*  29   70:ifeq            74
		{
			return;
	//   30   73:return          
		} else
		{
			start();
	//   31   74:aload_0         
	//   32   75:invokevirtual   #105 <Method void start()>
			return;
	//   33   78:return          
		}
	}

	public void e()
	{
		boolean flag;
		Object obj;
		File file;
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field RandomAccessFile b>
	//*   2    4:ifnull          14
				b.close();
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field RandomAccessFile b>
	//    5   11:invokevirtual   #48  <Method void RandomAccessFile.close()>
			obj = ((Object) (gv.a(c)));
	//    6   14:aload_0         
	//    7   15:getfield        #112 <Field String c>
	//    8   18:invokestatic    #117 <Method String gv.a(String)>
	//    9   21:astore_2        
		}
	//*  10   22:aload_2         
	//*  11   23:ifnull          100
	//*  12   26:aload_2         
	//*  13   27:aload_0         
	//*  14   28:getfield        #119 <Field String e>
	//*  15   31:invokevirtual   #122 <Method boolean String.equalsIgnoreCase(String)>
	//*  16   34:ifeq            100
	//*  17   37:new             #50  <Class File>
	//*  18   40:dup             
	//*  19   41:aload_0         
	//*  20   42:getfield        #96  <Field String d>
	//*  21   45:invokespecial   #99  <Method void File(String)>
	//*  22   48:astore_2        
	//*  23   49:aload_2         
	//*  24   50:invokevirtual   #102 <Method boolean File.exists()>
	//*  25   53:ifeq            61
	//*  26   56:aload_0         
	//*  27   57:invokevirtual   #124 <Method void b()>
	//*  28   60:return          
	//*  29   61:new             #50  <Class File>
	//*  30   64:dup             
	//*  31   65:aload_0         
	//*  32   66:getfield        #112 <Field String c>
	//*  33   69:invokespecial   #99  <Method void File(String)>
	//*  34   72:astore_3        
	//*  35   73:aload_3         
	//*  36   74:ifnull          86
	//*  37   77:aload_3         
	//*  38   78:invokevirtual   #102 <Method boolean File.exists()>
	//*  39   81:istore_1        
	//*  40   82:iload_1         
	//*  41   83:ifne            87
	//*  42   86:return          
	//*  43   87:aload_0         
	//*  44   88:aload_3         
	//*  45   89:aload_2         
	//*  46   90:invokespecial   #126 <Method void a(File, File)>
	//*  47   93:aload_0         
	//*  48   94:invokevirtual   #124 <Method void b()>
	//*  49   97:goto            104
	//*  50  100:aload_0         
	//*  51  101:invokevirtual   #124 <Method void b()>
	//*  52  104:return          
		catch(Throwable throwable)
	//*  53  105:astore_2        
		{
			b();
	//   54  106:aload_0         
	//   55  107:invokevirtual   #124 <Method void b()>
			File file1 = new File(d);
	//   56  110:new             #50  <Class File>
	//   57  113:dup             
	//   58  114:aload_0         
	//   59  115:getfield        #96  <Field String d>
	//   60  118:invokespecial   #99  <Method void File(String)>
	//   61  121:astore_3        
			if(file1.exists())
	//*  62  122:aload_3         
	//*  63  123:invokevirtual   #102 <Method boolean File.exists()>
	//*  64  126:ifeq            134
				file1.delete();
	//   65  129:aload_3         
	//   66  130:invokevirtual   #54  <Method boolean File.delete()>
	//   67  133:pop             
			hj.a(throwable, "sdl", "ofs");
	//   68  134:aload_2         
	//   69  135:ldc1            #128 <String "sdl">
	//   70  137:ldc1            #130 <String "ofs">
	//   71  139:invokestatic    #135 <Method void hj.a(Throwable, String, String)>
			return;
	//   72  142:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_100;
		if(!((String) (obj)).equalsIgnoreCase(e))
			break MISSING_BLOCK_LABEL_100;
		obj = ((Object) (new File(d)));
		if(((File) (obj)).exists())
		{
			b();
			return;
		}
		file = new File(c);
		if(file == null)
			break MISSING_BLOCK_LABEL_86;
		flag = file.exists();
		if(flag)
			break MISSING_BLOCK_LABEL_87;
		return;
		a(file, ((File) (obj)));
		b();
		break MISSING_BLOCK_LABEL_104;
		b();
	}
}
