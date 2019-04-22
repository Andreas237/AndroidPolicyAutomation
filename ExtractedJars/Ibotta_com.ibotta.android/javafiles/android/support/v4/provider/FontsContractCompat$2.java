// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.os.Handler;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

static final class FontsContractCompat$2
	implements ReplyCallback
{

	public void onReply(pefaceResult pefaceresult)
	{
		if(pefaceresult == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			val$fontCallback.callbackFailAsync(1, val$handler);
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field Handler val$handler>
	//    7   13:invokevirtual   #34  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return;
	//    8   16:return          
		}
		if(pefaceresult.mResult == 0)
	//*   9   17:aload_1         
	//*  10   18:getfield        #40  <Field int FontsContractCompat$TypefaceResult.mResult>
	//*  11   21:ifne            40
		{
			val$fontCallback.callbackSuccessAsync(pefaceresult.mTypeface, val$handler);
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
	//   14   28:aload_1         
	//   15   29:getfield        #44  <Field android.graphics.Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   16   32:aload_0         
	//   17   33:getfield        #22  <Field Handler val$handler>
	//   18   36:invokevirtual   #48  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(android.graphics.Typeface, Handler)>
			return;
	//   19   39:return          
		} else
		{
			val$fontCallback.callbackFailAsync(pefaceresult.mResult, val$handler);
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
	//   22   44:aload_1         
	//   23   45:getfield        #40  <Field int FontsContractCompat$TypefaceResult.mResult>
	//   24   48:aload_0         
	//   25   49:getfield        #22  <Field Handler val$handler>
	//   26   52:invokevirtual   #34  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return;
	//   27   55:return          
		}
	}

	public volatile void onReply(Object obj)
	{
		onReply((pefaceResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class FontsContractCompat$TypefaceResult>
	//    3    5:invokevirtual   #51  <Method void onReply(FontsContractCompat$TypefaceResult)>
	//    4    8:return          
	}

	final android.support.v4.content.res.llback val$fontCallback;
	final Handler val$handler;

	FontsContractCompat$2(android.support.v4.content.res.llback llback, Handler handler1)
	{
		val$fontCallback = llback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
		val$handler = handler1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Handler val$handler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
