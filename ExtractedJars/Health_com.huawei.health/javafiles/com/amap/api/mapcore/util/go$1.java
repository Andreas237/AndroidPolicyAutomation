// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.amap.api.mapcore.util:
//			go, hk, gz, hj

static final class go$1
	implements Runnable
{

	public void run()
	{
		Object obj;
		FileOutputStream fileoutputstream;
		FileOutputStream fileoutputstream1;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		fileoutputstream1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		fileoutputstream = fileoutputstream1;
	//    4    5:aload_3         
	//    5    6:astore_2        
		obj = ((Object) (obj1));
	//    6    7:aload           4
	//    7    9:astore_1        
		File file = new File(hk.c(a, "k.store"));
	//    8   10:new             #28  <Class File>
	//    9   13:dup             
	//   10   14:aload_0         
	//   11   15:getfield        #17  <Field Context a>
	//   12   18:ldc1            #30  <String "k.store">
	//   13   20:invokestatic    #36  <Method String hk.c(Context, String)>
	//   14   23:invokespecial   #39  <Method void File(String)>
	//   15   26:astore          5
		fileoutputstream = fileoutputstream1;
	//   16   28:aload_3         
	//   17   29:astore_2        
		obj = ((Object) (obj1));
	//   18   30:aload           4
	//   19   32:astore_1        
		if(file.getParentFile().exists())
			break MISSING_BLOCK_LABEL_58;
	//   20   33:aload           5
	//   21   35:invokevirtual   #43  <Method File File.getParentFile()>
	//   22   38:invokevirtual   #47  <Method boolean File.exists()>
	//   23   41:ifne            58
		fileoutputstream = fileoutputstream1;
	//   24   44:aload_3         
	//   25   45:astore_2        
		obj = ((Object) (obj1));
	//   26   46:aload           4
	//   27   48:astore_1        
		file.getParentFile().mkdirs();
	//   28   49:aload           5
	//   29   51:invokevirtual   #43  <Method File File.getParentFile()>
	//   30   54:invokevirtual   #50  <Method boolean File.mkdirs()>
	//   31   57:pop             
		fileoutputstream = fileoutputstream1;
	//   32   58:aload_3         
	//   33   59:astore_2        
		obj = ((Object) (obj1));
	//   34   60:aload           4
	//   35   62:astore_1        
		fileoutputstream1 = new FileOutputStream(file);
	//   36   63:new             #52  <Class FileOutputStream>
	//   37   66:dup             
	//   38   67:aload           5
	//   39   69:invokespecial   #55  <Method void FileOutputStream(File)>
	//   40   72:astore_3        
		fileoutputstream = fileoutputstream1;
	//   41   73:aload_3         
	//   42   74:astore_2        
		obj = ((Object) (fileoutputstream1));
	//   43   75:aload_3         
	//   44   76:astore_1        
		fileoutputstream1.write(gz.a(b));
	//   45   77:aload_3         
	//   46   78:aload_0         
	//   47   79:getfield        #19  <Field String b>
	//   48   82:invokestatic    #60  <Method byte[] gz.a(String)>
	//   49   85:invokevirtual   #64  <Method void FileOutputStream.write(byte[])>
		if(fileoutputstream1 != null)
	//*  50   88:aload_3         
	//*  51   89:ifnull          148
		{
			try
			{
				fileoutputstream1.close();
	//   52   92:aload_3         
	//   53   93:invokevirtual   #67  <Method void FileOutputStream.close()>
				return;
	//   54   96:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  55   97:astore_1        
			{
				((Throwable) (obj)).printStackTrace();
	//   56   98:aload_1         
	//   57   99:invokevirtual   #70  <Method void Throwable.printStackTrace()>
			}
			return;
	//   58  102:return          
		}
		break MISSING_BLOCK_LABEL_148;
		Throwable throwable1;
		throwable1;
	//   59  103:astore_3        
		obj = ((Object) (fileoutputstream));
	//   60  104:aload_2         
	//   61  105:astore_1        
		hj.a(throwable1, "AI", "stf");
	//   62  106:aload_3         
	//   63  107:ldc1            #72  <String "AI">
	//   64  109:ldc1            #74  <String "stf">
	//   65  111:invokestatic    #79  <Method void hj.a(Throwable, String, String)>
		if(fileoutputstream != null)
	//*  66  114:aload_2         
	//*  67  115:ifnull          148
		{
			try
			{
				fileoutputstream.close();
	//   68  118:aload_2         
	//   69  119:invokevirtual   #67  <Method void FileOutputStream.close()>
				return;
	//   70  122:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  71  123:astore_1        
			{
				((Throwable) (obj)).printStackTrace();
	//   72  124:aload_1         
	//   73  125:invokevirtual   #70  <Method void Throwable.printStackTrace()>
			}
			return;
	//   74  128:return          
		}
		break MISSING_BLOCK_LABEL_148;
		Exception exception;
		exception;
	//   75  129:astore_2        
		if(obj != null)
	//*  76  130:aload_1         
	//*  77  131:ifnull          146
			try
			{
				((FileOutputStream) (obj)).close();
	//   78  134:aload_1         
	//   79  135:invokevirtual   #67  <Method void FileOutputStream.close()>
			}
	//*  80  138:goto            146
			catch(Throwable throwable)
	//*  81  141:astore_1        
			{
				throwable.printStackTrace();
	//   82  142:aload_1         
	//   83  143:invokevirtual   #70  <Method void Throwable.printStackTrace()>
			}
		throw exception;
	//   84  146:aload_2         
	//   85  147:athrow          
	//   86  148:return          
	}

	final Context a;
	final String b;

	go$1(Context context, String s)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
