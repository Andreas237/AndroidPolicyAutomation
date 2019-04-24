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
		Object obj;
		byte abyte0[];
		abyte0 = (byte[])byteArrayPool.get(0x10000, [B);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool byteArrayPool>
	//    2    4:ldc1            #26  <Int 0x10000>
	//    3    6:ldc1            #28  <Class byte[]>
	//    4    8:invokeinterface #34  <Method Object ArrayPool.get(int, Class)>
	//    5   13:checkcast       #28  <Class byte[]>
	//    6   16:astore          6
		obj = null;
	//    7   18:aconst_null     
	//    8   19:astore          5
		options = null;
	//    9   21:aconst_null     
	//   10   22:astore_3        
		file = ((File) (new FileOutputStream(file)));
	//   11   23:new             #36  <Class FileOutputStream>
	//   12   26:dup             
	//   13   27:aload_2         
	//   14   28:invokespecial   #39  <Method void FileOutputStream(File)>
	//   15   31:astore_2        
_L2:
		options = ((Options) (file));
	//   16   32:aload_2         
	//   17   33:astore_3        
		obj = ((Object) (file));
	//   18   34:aload_2         
	//   19   35:astore          5
		int i = inputstream.read(abyte0);
	//   20   37:aload_1         
	//   21   38:aload           6
	//   22   40:invokevirtual   #45  <Method int InputStream.read(byte[])>
	//   23   43:istore          4
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   24   45:iload           4
	//   25   47:iconst_m1       
	//   26   48:icmpeq          68
		options = ((Options) (file));
	//   27   51:aload_2         
	//   28   52:astore_3        
		obj = ((Object) (file));
	//   29   53:aload_2         
	//   30   54:astore          5
		((OutputStream) (file)).write(abyte0, 0, i);
	//   31   56:aload_2         
	//   32   57:aload           6
	//   33   59:iconst_0        
	//   34   60:iload           4
	//   35   62:invokevirtual   #51  <Method void OutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   36   65:goto            32
_L1:
		options = ((Options) (file));
	//   37   68:aload_2         
	//   38   69:astore_3        
		obj = ((Object) (file));
	//   39   70:aload_2         
	//   40   71:astore          5
		((OutputStream) (file)).close();
	//   41   73:aload_2         
	//   42   74:invokevirtual   #54  <Method void OutputStream.close()>
		if(file != null)
	//*  43   77:aload_2         
	//*  44   78:ifnull          89
			try
			{
				((OutputStream) (file)).close();
	//   45   81:aload_2         
	//   46   82:invokevirtual   #54  <Method void OutputStream.close()>
			}
	//*  47   85:goto            89
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream) { }
	//   48   88:astore_1        
		byteArrayPool.put(((Object) (abyte0)), [B);
	//   49   89:aload_0         
	//   50   90:getfield        #20  <Field ArrayPool byteArrayPool>
	//   51   93:aload           6
	//   52   95:ldc1            #28  <Class byte[]>
	//   53   97:invokeinterface #58  <Method void ArrayPool.put(Object, Class)>
		return true;
	//   54  102:iconst_1        
	//   55  103:ireturn         
		inputstream;
	//   56  104:astore_1        
		obj = ((Object) (options));
	//   57  105:aload_3         
	//   58  106:astore          5
		if(!Log.isLoggable("StreamEncoder", 3))
			break MISSING_BLOCK_LABEL_129;
	//   59  108:ldc1            #11  <String "StreamEncoder">
	//   60  110:iconst_3        
	//   61  111:invokestatic    #64  <Method boolean Log.isLoggable(String, int)>
	//   62  114:ifeq            129
		obj = ((Object) (options));
	//   63  117:aload_3         
	//   64  118:astore          5
		Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", ((Throwable) (inputstream)));
	//   65  120:ldc1            #11  <String "StreamEncoder">
	//   66  122:ldc1            #66  <String "Failed to encode data onto the OutputStream">
	//   67  124:aload_1         
	//   68  125:invokestatic    #70  <Method int Log.d(String, String, Throwable)>
	//   69  128:pop             
		if(options != null)
	//*  70  129:aload_3         
	//*  71  130:ifnull          141
			try
			{
				((OutputStream) (options)).close();
	//   72  133:aload_3         
	//   73  134:invokevirtual   #54  <Method void OutputStream.close()>
			}
	//*  74  137:goto            141
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream) { }
	//   75  140:astore_1        
		byteArrayPool.put(((Object) (abyte0)), [B);
	//   76  141:aload_0         
	//   77  142:getfield        #20  <Field ArrayPool byteArrayPool>
	//   78  145:aload           6
	//   79  147:ldc1            #28  <Class byte[]>
	//   80  149:invokeinterface #58  <Method void ArrayPool.put(Object, Class)>
		return false;
	//   81  154:iconst_0        
	//   82  155:ireturn         
		inputstream;
	//   83  156:astore_1        
		if(obj != null)
	//*  84  157:aload           5
	//*  85  159:ifnull          171
			try
			{
				((OutputStream) (obj)).close();
	//   86  162:aload           5
	//   87  164:invokevirtual   #54  <Method void OutputStream.close()>
			}
	//*  88  167:goto            171
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//   89  170:astore_2        
		byteArrayPool.put(((Object) (abyte0)), [B);
	//   90  171:aload_0         
	//   91  172:getfield        #20  <Field ArrayPool byteArrayPool>
	//   92  175:aload           6
	//   93  177:ldc1            #28  <Class byte[]>
	//   94  179:invokeinterface #58  <Method void ArrayPool.put(Object, Class)>
		throw inputstream;
	//   95  184:aload_1         
	//   96  185:athrow          
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((InputStream)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class InputStream>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #73  <Method boolean encode(InputStream, File, Options)>
	//    6   10:ireturn         
	}

	private static final String TAG = "StreamEncoder";
	private final ArrayPool byteArrayPool;
}
