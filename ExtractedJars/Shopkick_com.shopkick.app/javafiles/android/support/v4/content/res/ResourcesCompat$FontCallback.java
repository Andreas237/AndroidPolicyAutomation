// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package android.support.v4.content.res:
//			ResourcesCompat

public static abstract class ResourcesCompat$FontCallback
{

	public final void callbackFailAsync(final int reason, Handler handler)
	{
		Handler handler1 = handler;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(handler == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       17
			handler1 = new Handler(Looper.getMainLooper());
	//    4    6:new             #25  <Class Handler>
	//    5    9:dup             
	//    6   10:invokestatic    #31  <Method Looper Looper.getMainLooper()>
	//    7   13:invokespecial   #34  <Method void Handler(Looper)>
	//    8   16:astore_3        
		handler1.post(new Runnable() {

			public void run()
			{
				onFontRetrievalFailed(reason);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ResourcesCompat$FontCallback this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field int val$reason>
			//    4    8:invokevirtual   #33  <Method void ResourcesCompat$FontCallback.onFontRetrievalFailed(int)>
			//    5   11:return          
			}

			final ResourcesCompat.FontCallback this$0;
			final int val$reason;

			
			{
				this$0 = ResourcesCompat.FontCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ResourcesCompat$FontCallback this$0>
				reason = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$reason>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    9   17:aload_3         
	//   10   18:new             #11  <Class ResourcesCompat$FontCallback$2>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokespecial   #37  <Method void ResourcesCompat$FontCallback$2(ResourcesCompat$FontCallback, int)>
	//   15   27:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
	//   16   30:pop             
	//   17   31:return          
	}

	public final void callbackSuccessAsync(final Typeface typeface, Handler handler)
	{
		Handler handler1 = handler;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(handler == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       17
			handler1 = new Handler(Looper.getMainLooper());
	//    4    6:new             #25  <Class Handler>
	//    5    9:dup             
	//    6   10:invokestatic    #31  <Method Looper Looper.getMainLooper()>
	//    7   13:invokespecial   #34  <Method void Handler(Looper)>
	//    8   16:astore_3        
		handler1.post(new Runnable() {

			public void run()
			{
				onFontRetrieved(typeface);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ResourcesCompat$FontCallback this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field Typeface val$typeface>
			//    4    8:invokevirtual   #33  <Method void ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
			//    5   11:return          
			}

			final ResourcesCompat.FontCallback this$0;
			final Typeface val$typeface;

			
			{
				this$0 = ResourcesCompat.FontCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ResourcesCompat$FontCallback this$0>
				typeface = typeface1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Typeface val$typeface>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    9   17:aload_3         
	//   10   18:new             #9   <Class ResourcesCompat$FontCallback$1>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #48  <Method void ResourcesCompat$FontCallback$1(ResourcesCompat$FontCallback, Typeface)>
	//   15   27:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
	//   16   30:pop             
	//   17   31:return          
	}

	public abstract void onFontRetrievalFailed(int i);

	public abstract void onFontRetrieved(Typeface typeface);

	public ResourcesCompat$FontCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
