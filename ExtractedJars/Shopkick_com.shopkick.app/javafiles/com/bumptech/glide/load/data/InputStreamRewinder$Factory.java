// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.data:
//			InputStreamRewinder, DataRewinder

public static final class InputStreamRewinder$Factory
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

	public InputStreamRewinder$Factory(ArrayPool arraypool)
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
