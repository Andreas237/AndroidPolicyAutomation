// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferEncoder
	implements Encoder
{

	public ByteBufferEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((ByteBuffer)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class ByteBuffer>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #23  <Method boolean encode(ByteBuffer, File, Options)>
	//    6   10:ireturn         
	}

	public boolean encode(ByteBuffer bytebuffer, File file, Options options)
	{
		try
		{
			ByteBufferUtil.toFile(bytebuffer, file);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #31  <Method void ByteBufferUtil.toFile(ByteBuffer, File)>
		}
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*   5    7:astore_1        
		{
			if(Log.isLoggable("ByteBufferEncoder", 3))
	//*   6    8:ldc1            #11  <String "ByteBufferEncoder">
	//*   7   10:iconst_3        
	//*   8   11:invokestatic    #37  <Method boolean Log.isLoggable(String, int)>
	//*   9   14:ifeq            26
				Log.d("ByteBufferEncoder", "Failed to write data", ((Throwable) (bytebuffer)));
	//   10   17:ldc1            #11  <String "ByteBufferEncoder">
	//   11   19:ldc1            #39  <String "Failed to write data">
	//   12   21:aload_1         
	//   13   22:invokestatic    #43  <Method int Log.d(String, String, Throwable)>
	//   14   25:pop             
			return false;
	//   15   26:iconst_0        
	//   16   27:ireturn         
		}
		return true;
	}

	private static final String TAG = "ByteBufferEncoder";
}
