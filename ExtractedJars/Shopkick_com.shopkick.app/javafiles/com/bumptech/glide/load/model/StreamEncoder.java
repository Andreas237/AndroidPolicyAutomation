// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.*;

public class StreamEncoder
	implements Encoder
{

	public StreamEncoder(ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		byteArrayPool = arraypool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ArrayPool byteArrayPool>
	//    5    9:return          
	}

	public boolean encode(InputStream inputstream, File file, Options options)
	{
		boolean flag1;
		boolean flag2;
		Object obj;
		byte abyte0[];
		abyte0 = (byte[])byteArrayPool.get(0x10000, [B);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool byteArrayPool>
	//    2    4:ldc1            #27  <Int 0x10000>
	//    3    6:ldc1            #29  <Class byte[]>
	//    4    8:invokeinterface #35  <Method Object ArrayPool.get(int, Class)>
	//    5   13:checkcast       #29  <Class byte[]>
	//    6   16:astore          9
		flag2 = false;
	//    7   18:iconst_0        
	//    8   19:istore          7
		flag1 = false;
	//    9   21:iconst_0        
	//   10   22:istore          6
		obj = null;
	//   11   24:aconst_null     
	//   12   25:astore          8
		options = null;
	//   13   27:aconst_null     
	//   14   28:astore_3        
		file = ((File) (new FileOutputStream(file)));
	//   15   29:new             #37  <Class FileOutputStream>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokespecial   #40  <Method void FileOutputStream(File)>
	//   19   37:astore_2        
_L1:
		int i = inputstream.read(abyte0);
	//   20   38:aload_1         
	//   21   39:aload           9
	//   22   41:invokevirtual   #46  <Method int InputStream.read(byte[])>
	//   23   44:istore          4
		if(i == -1)
			break MISSING_BLOCK_LABEL_64;
	//   24   46:iload           4
	//   25   48:iconst_m1       
	//   26   49:icmpeq          64
		((OutputStream) (file)).write(abyte0, 0, i);
	//   27   52:aload_2         
	//   28   53:aload           9
	//   29   55:iconst_0        
	//   30   56:iload           4
	//   31   58:invokevirtual   #52  <Method void OutputStream.write(byte[], int, int)>
		  goto _L1
	//*  32   61:goto            38
		((OutputStream) (file)).close();
	//   33   64:aload_2         
	//   34   65:invokevirtual   #55  <Method void OutputStream.close()>
		boolean flag;
		flag = true;
	//   35   68:iconst_1        
	//   36   69:istore          5
		flag1 = true;
	//   37   71:iconst_1        
	//   38   72:istore          6
		((OutputStream) (file)).close();
	//   39   74:aload_2         
	//   40   75:invokevirtual   #55  <Method void OutputStream.close()>
		flag = flag1;
	//   41   78:iload           6
	//   42   80:istore          5
		  goto _L2
	//*  43   82:goto            149
		inputstream;
	//   44   85:astore_1        
		options = ((Options) (file));
	//   45   86:aload_2         
	//   46   87:astore_3        
		  goto _L3
	//*  47   88:goto            163
		options;
	//   48   91:astore_3        
		inputstream = ((InputStream) (file));
	//   49   92:aload_2         
	//   50   93:astore_1        
		file = ((File) (options));
	//   51   94:aload_3         
	//   52   95:astore_2        
		  goto _L4
	//*  53   96:goto            107
		inputstream;
	//   54   99:astore_1        
		  goto _L3
	//*  55  100:goto            163
		file;
	//   56  103:astore_2        
		inputstream = ((InputStream) (obj));
	//   57  104:aload           8
	//   58  106:astore_1        
_L4:
		options = ((Options) (inputstream));
	//   59  107:aload_1         
	//   60  108:astore_3        
		if(!Log.isLoggable("StreamEncoder", 3))
			break MISSING_BLOCK_LABEL_129;
	//   61  109:ldc1            #11  <String "StreamEncoder">
	//   62  111:iconst_3        
	//   63  112:invokestatic    #61  <Method boolean Log.isLoggable(String, int)>
	//   64  115:ifeq            129
		options = ((Options) (inputstream));
	//   65  118:aload_1         
	//   66  119:astore_3        
		Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", ((Throwable) (file)));
	//   67  120:ldc1            #11  <String "StreamEncoder">
	//   68  122:ldc1            #63  <String "Failed to encode data onto the OutputStream">
	//   69  124:aload_2         
	//   70  125:invokestatic    #67  <Method int Log.d(String, String, Throwable)>
	//   71  128:pop             
		flag = flag1;
	//   72  129:iload           6
	//   73  131:istore          5
		if(inputstream == null) goto _L2; else goto _L5
	//   74  133:aload_1         
	//   75  134:ifnull          149
_L5:
		flag = flag2;
	//   76  137:iload           7
	//   77  139:istore          5
		((OutputStream) (inputstream)).close();
	//   78  141:aload_1         
	//   79  142:invokevirtual   #55  <Method void OutputStream.close()>
		flag = flag1;
	//   80  145:iload           6
	//   81  147:istore          5
_L2:
		byteArrayPool.put(((Object) (abyte0)));
	//   82  149:aload_0         
	//   83  150:getfield        #20  <Field ArrayPool byteArrayPool>
	//   84  153:aload           9
	//   85  155:invokeinterface #71  <Method void ArrayPool.put(Object)>
		return flag;
	//   86  160:iload           5
	//   87  162:ireturn         
_L3:
		if(options != null)
	//*  88  163:aload_3         
	//*  89  164:ifnull          171
			try
			{
				((OutputStream) (options)).close();
	//   90  167:aload_3         
	//   91  168:invokevirtual   #55  <Method void OutputStream.close()>
			}
	//*  92  171:aload_0         
	//*  93  172:getfield        #20  <Field ArrayPool byteArrayPool>
	//*  94  175:aload           9
	//*  95  177:invokeinterface #71  <Method void ArrayPool.put(Object)>
	//*  96  182:aload_1         
	//*  97  183:athrow          
	//*  98  184:astore_1        
	//*  99  185:goto            149
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//  100  188:astore_2        
		byteArrayPool.put(((Object) (abyte0)));
		throw inputstream;
		inputstream;
		if(true) goto _L2; else goto _L6
_L6:
	//* 101  189:goto            171
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((InputStream)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class InputStream>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #75  <Method boolean encode(InputStream, File, Options)>
	//    6   10:ireturn         
	}

	private static final String TAG = "StreamEncoder";
	private final ArrayPool byteArrayPool;
}
