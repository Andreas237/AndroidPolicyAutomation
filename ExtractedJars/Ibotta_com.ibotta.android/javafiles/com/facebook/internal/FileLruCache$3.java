// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FileLruCache

class FileLruCache$3
	implements Runnable
{

	public void run()
	{
		FileLruCache.access$200(FileLruCache.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FileLruCache this$0>
	//    2    4:invokestatic    #24  <Method void FileLruCache.access$200(FileLruCache)>
	//    3    7:return          
	}

	final FileLruCache this$0;

	FileLruCache$3()
	{
		this$0 = FileLruCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FileLruCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
