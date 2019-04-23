// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;


// Referenced classes of package android.support.v4.content.res:
//			ResourcesCompat

class ResourcesCompat$FontCallback$2
	implements Runnable
{

	public void run()
	{
		onFontRetrievalFailed(val$reason);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ResourcesCompat$FontCallback this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int val$reason>
	//    4    8:invokevirtual   #33  <Method void ResourcesCompat$FontCallback.onFontRetrievalFailed(int)>
	//    5   11:return          
	}

	final ResourcesCompat.FontCallback this$0;
	final int val$reason;

	ResourcesCompat$FontCallback$2()
	{
		this$0 = final_fontcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ResourcesCompat$FontCallback this$0>
		val$reason = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int val$reason>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
