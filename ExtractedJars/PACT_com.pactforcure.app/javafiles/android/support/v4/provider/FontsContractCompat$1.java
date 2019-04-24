// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import java.util.concurrent.Callable;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat, FontRequest

static final class FontsContractCompat$1
	implements Callable
{

	public Typeface call()
		throws Exception
	{
		Typeface typeface = FontsContractCompat.access$000(val$context, val$request, val$style);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context val$context>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field FontRequest val$request>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field int val$style>
	//    6   12:invokestatic    #42  <Method Typeface FontsContractCompat.access$000(Context, FontRequest, int)>
	//    7   15:astore_1        
		if(typeface != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          32
			FontsContractCompat.access$100().put(((Object) (val$id)), ((Object) (typeface)));
	//   10   20:invokestatic    #46  <Method LruCache FontsContractCompat.access$100()>
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field String val$id>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #52  <Method Object LruCache.put(Object, Object)>
	//   15   31:pop             
		return typeface;
	//   16   32:aload_1         
	//   17   33:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method Typeface call()>
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
