// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable

public class GifDrawableEncoder
	implements ResourceEncoder
{

	public GifDrawableEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public boolean encode(Resource resource, File file, Options options)
	{
		resource = ((Resource) ((GifDrawable)resource.get()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #27  <Method Object Resource.get()>
	//    2    6:checkcast       #29  <Class GifDrawable>
	//    3    9:astore_1        
		try
		{
			ByteBufferUtil.toFile(((GifDrawable) (resource)).getBuffer(), file);
	//    4   10:aload_1         
	//    5   11:invokevirtual   #33  <Method java.nio.ByteBuffer GifDrawable.getBuffer()>
	//    6   14:aload_2         
	//    7   15:invokestatic    #39  <Method void ByteBufferUtil.toFile(java.nio.ByteBuffer, File)>
		}
	//*   8   18:iconst_1        
	//*   9   19:ireturn         
		// Misplaced declaration of an exception variable
		catch(Resource resource)
	//*  10   20:astore_1        
		{
			if(Log.isLoggable("GifEncoder", 5))
	//*  11   21:ldc1            #11  <String "GifEncoder">
	//*  12   23:iconst_5        
	//*  13   24:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
	//*  14   27:ifeq            39
				Log.w("GifEncoder", "Failed to encode GIF drawable data", ((Throwable) (resource)));
	//   15   30:ldc1            #11  <String "GifEncoder">
	//   16   32:ldc1            #47  <String "Failed to encode GIF drawable data">
	//   17   34:aload_1         
	//   18   35:invokestatic    #51  <Method int Log.w(String, String, Throwable)>
	//   19   38:pop             
			return false;
	//   20   39:iconst_0        
	//   21   40:ireturn         
		}
		return true;
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((Resource)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Resource>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #57  <Method boolean encode(Resource, File, Options)>
	//    6   10:ireturn         
	}

	public EncodeStrategy getEncodeStrategy(Options options)
	{
		return EncodeStrategy.SOURCE;
	//    0    0:getstatic       #65  <Field EncodeStrategy EncodeStrategy.SOURCE>
	//    1    3:areturn         
	}

	private static final String TAG = "GifEncoder";
}
