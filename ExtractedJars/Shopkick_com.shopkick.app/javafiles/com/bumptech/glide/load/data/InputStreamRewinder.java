// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.data:
//			DataRewinder

public final class InputStreamRewinder
	implements DataRewinder
{
	public static final class Factory
		implements DataRewinder.Factory
	{

		public DataRewinder build(InputStream inputstream)
		{
			return ((DataRewinder) (new InputStreamRewinder(inputstream, byteArrayPool)));
		//    0    0:new             #9   <Class InputStreamRewinder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #19  <Field ArrayPool byteArrayPool>
		//    5    9:invokespecial   #26  <Method void InputStreamRewinder(InputStream, ArrayPool)>
		//    6   12:areturn         
		}

		public volatile DataRewinder build(Object obj)
		{
			return build((InputStream)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class InputStream>
		//    3    5:invokevirtual   #34  <Method DataRewinder build(InputStream)>
		//    4    8:areturn         
		}

		public Class getDataClass()
		{
			return java/io/InputStream;
		//    0    0:ldc1            #32  <Class InputStream>
		//    1    2:areturn         
		}

		private final ArrayPool byteArrayPool;

		public Factory(ArrayPool arraypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			byteArrayPool = arraypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field ArrayPool byteArrayPool>
		//    5    9:return          
		}
	}


	InputStreamRewinder(InputStream inputstream, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		bufferedStream = new RecyclableBufferedInputStream(inputstream, arraypool);
	//    2    4:aload_0         
	//    3    5:new             #22  <Class RecyclableBufferedInputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #24  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//    8   14:putfield        #26  <Field RecyclableBufferedInputStream bufferedStream>
		bufferedStream.mark(0x500000);
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field RecyclableBufferedInputStream bufferedStream>
	//   11   21:ldc1            #13  <Int 0x500000>
	//   12   23:invokevirtual   #30  <Method void RecyclableBufferedInputStream.mark(int)>
	//   13   26:return          
	}

	public void cleanup()
	{
		bufferedStream.release();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclableBufferedInputStream bufferedStream>
	//    2    4:invokevirtual   #35  <Method void RecyclableBufferedInputStream.release()>
	//    3    7:return          
	}

	public InputStream rewindAndGet()
		throws IOException
	{
		bufferedStream.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclableBufferedInputStream bufferedStream>
	//    2    4:invokevirtual   #43  <Method void RecyclableBufferedInputStream.reset()>
		return ((InputStream) (bufferedStream));
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RecyclableBufferedInputStream bufferedStream>
	//    5   11:areturn         
	}

	public volatile Object rewindAndGet()
		throws IOException
	{
		return ((Object) (rewindAndGet()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method InputStream rewindAndGet()>
	//    2    4:areturn         
	}

	private static final int MARK_LIMIT = 0x500000;
	private final RecyclableBufferedInputStream bufferedStream;
}
