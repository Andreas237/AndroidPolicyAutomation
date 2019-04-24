// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import java.io.File;

class DataCacheWriter
	implements com.bumptech.glide.load.engine.cache.DiskCache.Writer
{

	DataCacheWriter(Encoder encoder1, Object obj, Options options1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		encoder = encoder1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Encoder encoder>
		data = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object data>
		options = options1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Options options>
	//   11   19:return          
	}

	public boolean write(File file)
	{
		return encoder.encode(data, file, options);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Encoder encoder>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Object data>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field Options options>
	//    7   13:invokeinterface #37  <Method boolean Encoder.encode(Object, File, Options)>
	//    8   18:ireturn         
	}

	private final Object data;
	private final Encoder encoder;
	private final Options options;
}
