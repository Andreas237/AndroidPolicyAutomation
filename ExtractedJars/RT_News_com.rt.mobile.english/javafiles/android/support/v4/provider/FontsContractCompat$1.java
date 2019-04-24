// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.support.v4.util.LruCache;
import java.util.concurrent.Callable;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat, FontRequest

static final class FontsContractCompat$1
	implements Callable
{

	public pefaceResult call()
		throws Exception
	{
		pefaceResult pefaceresult = FontsContractCompat.access$000(val$context, val$request, val$style);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context val$context>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field FontRequest val$request>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field int val$style>
	//    6   12:invokestatic    #42  <Method FontsContractCompat$TypefaceResult FontsContractCompat.access$000(Context, FontRequest, int)>
	//    7   15:astore_1        
		if(pefaceresult.mTypeface != null)
	//*   8   16:aload_1         
	//*   9   17:getfield        #48  <Field android.graphics.Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//*  10   20:ifnull          38
			FontsContractCompat.access$100().put(((Object) (val$id)), ((Object) (pefaceresult.mTypeface)));
	//   11   23:invokestatic    #52  <Method LruCache FontsContractCompat.access$100()>
	//   12   26:aload_0         
	//   13   27:getfield        #30  <Field String val$id>
	//   14   30:aload_1         
	//   15   31:getfield        #48  <Field android.graphics.Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   16   34:invokevirtual   #58  <Method Object LruCache.put(Object, Object)>
	//   17   37:pop             
		return pefaceresult;
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method FontsContractCompat$TypefaceResult call()>
	//    2    4:areturn         
	}

	final Context val$context;
	final String val$id;
	final FontRequest val$request;
	final int val$style;

	FontsContractCompat$1(Context context1, FontRequest fontrequest, int i, String s)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Context val$context>
		val$request = fontrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field FontRequest val$request>
		val$style = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field int val$style>
		val$id = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field String val$id>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
