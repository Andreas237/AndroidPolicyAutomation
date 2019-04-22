// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifOptions

public class StreamGifDecoder
	implements ResourceDecoder
{

	public StreamGifDecoder(List list, ResourceDecoder resourcedecoder, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		parsers = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field List parsers>
		byteBufferDecoder = resourcedecoder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ResourceDecoder byteBufferDecoder>
		byteArrayPool = arraypool;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field ArrayPool byteArrayPool>
	//   11   19:return          
	}

	private static byte[] inputStreamToBytes(InputStream inputstream)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(16384);
	//    0    0:new             #35  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:sipush          16384
	//    3    7:invokespecial   #38  <Method void ByteArrayOutputStream(int)>
	//    4   10:astore_2        
		byte abyte0[] = new byte[16384];
	//    5   11:sipush          16384
	//    6   14:newarray        byte[]
	//    7   16:astore_3        
_L1:
		int i = inputstream.read(abyte0);
	//    8   17:aload_0         
	//    9   18:aload_3         
	//   10   19:invokevirtual   #44  <Method int InputStream.read(byte[])>
	//   11   22:istore_1        
label0:
		{
			if(i == -1)
				break label0;
	//   12   23:iload_1         
	//   13   24:iconst_m1       
	//   14   25:icmpeq          38
			try
			{
				bytearrayoutputstream.write(abyte0, 0, i);
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:iconst_0        
	//   18   31:iload_1         
	//   19   32:invokevirtual   #48  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			}
	//*  20   35:goto            17
	//*  21   38:aload_2         
	//*  22   39:invokevirtual   #51  <Method void ByteArrayOutputStream.flush()>
	//*  23   42:aload_2         
	//*  24   43:invokevirtual   #55  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  25   46:areturn         
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  26   47:astore_0        
			{
				if(Log.isLoggable("StreamGifDecoder", 5))
	//*  27   48:ldc1            #57  <String "StreamGifDecoder">
	//*  28   50:iconst_5        
	//*  29   51:invokestatic    #63  <Method boolean Log.isLoggable(String, int)>
	//*  30   54:ifeq            66
					Log.w("StreamGifDecoder", "Error reading data from stream", ((Throwable) (inputstream)));
	//   31   57:ldc1            #57  <String "StreamGifDecoder">
	//   32   59:ldc1            #65  <String "Error reading data from stream">
	//   33   61:aload_0         
	//   34   62:invokestatic    #69  <Method int Log.w(String, String, Throwable)>
	//   35   65:pop             
				return null;
	//   36   66:aconst_null     
	//   37   67:areturn         
			}
		}
		  goto _L1
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	public Resource decode(InputStream inputstream, int i, int j, Options options)
		throws IOException
	{
		inputstream = ((InputStream) (inputStreamToBytes(inputstream)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #74  <Method byte[] inputStreamToBytes(InputStream)>
	//    2    4:astore_1        
		if(inputstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
		{
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		} else
		{
			inputstream = ((InputStream) (ByteBuffer.wrap(((byte []) (inputstream)))));
	//    7   11:aload_1         
	//    8   12:invokestatic    #80  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    9   15:astore_1        
			return byteBufferDecoder.decode(((Object) (inputstream)), i, j, options);
	//   10   16:aload_0         
	//   11   17:getfield        #24  <Field ResourceDecoder byteBufferDecoder>
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:iload_3         
	//   15   23:aload           4
	//   16   25:invokeinterface #83  <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//   17   30:areturn         
		}
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((InputStream)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class InputStream>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #88  <Method Resource decode(InputStream, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(InputStream inputstream, Options options)
		throws IOException
	{
		return !((Boolean)options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(parsers, inputstream, byteArrayPool) == com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF;
	//    0    0:aload_2         
	//    1    1:getstatic       #96  <Field com.bumptech.glide.load.Option GifOptions.DISABLE_ANIMATION>
	//    2    4:invokevirtual   #102 <Method Object Options.get(com.bumptech.glide.load.Option)>
	//    3    7:checkcast       #104 <Class Boolean>
	//    4   10:invokevirtual   #108 <Method boolean Boolean.booleanValue()>
	//    5   13:ifne            36
	//    6   16:aload_0         
	//    7   17:getfield        #22  <Field List parsers>
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:getfield        #26  <Field ArrayPool byteArrayPool>
	//   11   25:invokestatic    #114 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, InputStream, ArrayPool)>
	//   12   28:getstatic       #120 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF>
	//   13   31:if_acmpne       36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((InputStream)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class InputStream>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #123 <Method boolean handles(InputStream, Options)>
	//    5    9:ireturn         
	}

	private final ArrayPool byteArrayPool;
	private final ResourceDecoder byteBufferDecoder;
	private final List parsers;
}
