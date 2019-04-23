// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			RecyclableBufferedInputStream, Downsampler

public class StreamBitmapDecoder
	implements ResourceDecoder
{
	static class UntrustedCallbacks
		implements Downsampler.DecodeCallbacks
	{

		public void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
			throws IOException
		{
			IOException ioexception = exceptionStream.getException();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field ExceptionCatchingInputStream exceptionStream>
		//    2    4:invokevirtual   #33  <Method IOException ExceptionCatchingInputStream.getException()>
		//    3    7:astore_3        
			if(ioexception != null)
		//*   4    8:aload_3         
		//*   5    9:ifnull          25
			{
				if(bitmap != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          23
					bitmappool.put(bitmap);
		//    8   16:aload_1         
		//    9   17:aload_2         
		//   10   18:invokeinterface #39  <Method void BitmapPool.put(Bitmap)>
				throw ioexception;
		//   11   23:aload_3         
		//   12   24:athrow          
			} else
			{
				return;
		//   13   25:return          
			}
		}

		public void onObtainBounds()
		{
			bufferedStream.fixMarkLimit();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RecyclableBufferedInputStream bufferedStream>
		//    2    4:invokevirtual   #46  <Method void RecyclableBufferedInputStream.fixMarkLimit()>
		//    3    7:return          
		}

		private final RecyclableBufferedInputStream bufferedStream;
		private final ExceptionCatchingInputStream exceptionStream;

		UntrustedCallbacks(RecyclableBufferedInputStream recyclablebufferedinputstream, ExceptionCatchingInputStream exceptioncatchinginputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			bufferedStream = recyclablebufferedinputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field RecyclableBufferedInputStream bufferedStream>
			exceptionStream = exceptioncatchinginputstream;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ExceptionCatchingInputStream exceptionStream>
		//    8   14:return          
		}
	}


	public StreamBitmapDecoder(Downsampler downsampler1, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		downsampler = downsampler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Downsampler downsampler>
		byteArrayPool = arraypool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field ArrayPool byteArrayPool>
	//    8   14:return          
	}

	public Resource decode(InputStream inputstream, int i, int j, Options options)
		throws IOException
	{
		boolean flag;
		ExceptionCatchingInputStream exceptioncatchinginputstream;
		MarkEnforcingInputStream markenforcinginputstream;
		UntrustedCallbacks untrustedcallbacks;
		if(inputstream instanceof RecyclableBufferedInputStream)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #31  <Class RecyclableBufferedInputStream>
	//*   2    4:ifeq            18
		{
			inputstream = ((InputStream) ((RecyclableBufferedInputStream)inputstream));
	//    3    7:aload_1         
	//    4    8:checkcast       #31  <Class RecyclableBufferedInputStream>
	//    5   11:astore_1        
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          5
		} else
	//*   8   15:goto            34
		{
			inputstream = ((InputStream) (new RecyclableBufferedInputStream(inputstream, byteArrayPool)));
	//    9   18:new             #31  <Class RecyclableBufferedInputStream>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #23  <Field ArrayPool byteArrayPool>
	//   14   27:invokespecial   #34  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//   15   30:astore_1        
			flag = true;
	//   16   31:iconst_1        
	//   17   32:istore          5
		}
		exceptioncatchinginputstream = ExceptionCatchingInputStream.obtain(inputstream);
	//   18   34:aload_1         
	//   19   35:invokestatic    #40  <Method ExceptionCatchingInputStream ExceptionCatchingInputStream.obtain(InputStream)>
	//   20   38:astore          6
		markenforcinginputstream = new MarkEnforcingInputStream(((InputStream) (exceptioncatchinginputstream)));
	//   21   40:new             #42  <Class MarkEnforcingInputStream>
	//   22   43:dup             
	//   23   44:aload           6
	//   24   46:invokespecial   #45  <Method void MarkEnforcingInputStream(InputStream)>
	//   25   49:astore          7
		untrustedcallbacks = new UntrustedCallbacks(((RecyclableBufferedInputStream) (inputstream)), exceptioncatchinginputstream);
	//   26   51:new             #9   <Class StreamBitmapDecoder$UntrustedCallbacks>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:aload           6
	//   30   58:invokespecial   #48  <Method void StreamBitmapDecoder$UntrustedCallbacks(RecyclableBufferedInputStream, ExceptionCatchingInputStream)>
	//   31   61:astore          8
		options = ((Options) (downsampler.decode(((InputStream) (markenforcinginputstream)), i, j, options, ((Downsampler.DecodeCallbacks) (untrustedcallbacks)))));
	//   32   63:aload_0         
	//   33   64:getfield        #21  <Field Downsampler downsampler>
	//   34   67:aload           7
	//   35   69:iload_2         
	//   36   70:iload_3         
	//   37   71:aload           4
	//   38   73:aload           8
	//   39   75:invokevirtual   #53  <Method Resource Downsampler.decode(InputStream, int, int, Options, Downsampler$DecodeCallbacks)>
	//   40   78:astore          4
		exceptioncatchinginputstream.release();
	//   41   80:aload           6
	//   42   82:invokevirtual   #56  <Method void ExceptionCatchingInputStream.release()>
		if(flag)
	//*  43   85:iload           5
	//*  44   87:ifeq            94
			((RecyclableBufferedInputStream) (inputstream)).release();
	//   45   90:aload_1         
	//   46   91:invokevirtual   #57  <Method void RecyclableBufferedInputStream.release()>
		return ((Resource) (options));
	//   47   94:aload           4
	//   48   96:areturn         
		options;
	//   49   97:astore          4
		exceptioncatchinginputstream.release();
	//   50   99:aload           6
	//   51  101:invokevirtual   #56  <Method void ExceptionCatchingInputStream.release()>
		if(flag)
	//*  52  104:iload           5
	//*  53  106:ifeq            113
			((RecyclableBufferedInputStream) (inputstream)).release();
	//   54  109:aload_1         
	//   55  110:invokevirtual   #57  <Method void RecyclableBufferedInputStream.release()>
		throw options;
	//   56  113:aload           4
	//   57  115:athrow          
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((InputStream)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #64  <Class InputStream>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #66  <Method Resource decode(InputStream, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(InputStream inputstream, Options options)
	{
		return downsampler.handles(inputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Downsampler downsampler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method boolean Downsampler.handles(InputStream)>
	//    4    8:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((InputStream)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #64  <Class InputStream>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #74  <Method boolean handles(InputStream, Options)>
	//    5    9:ireturn         
	}

	private final ArrayPool byteArrayPool;
	private final Downsampler downsampler;
}
