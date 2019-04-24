// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.coroutines:
//			CoroutineContext

public abstract class AbstractCoroutineContextElement
	implements CoroutineContext.Element
{

	public AbstractCoroutineContextElement(CoroutineContext.Key key1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key1)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "key">
	//    2    3:invokestatic    #38  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #41  <Method void Object()>
		key = key1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #43  <Field CoroutineContext$Key key>
	//    8   15:return          
	}

	public Object fold(Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc1            #51  <String "operation">
	//    2    3:invokestatic    #38  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CoroutineContext.Element.DefaultImpls.fold(((CoroutineContext.Element) (this)), obj, function2);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokestatic    #56  <Method Object CoroutineContext$Element$DefaultImpls.fold(CoroutineContext$Element, Object, Function2)>
	//    7   12:areturn         
	}

	public CoroutineContext.Element get(CoroutineContext.Key key1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key1)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "key">
	//    2    3:invokestatic    #38  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CoroutineContext.Element.DefaultImpls.get(((CoroutineContext.Element) (this)), key1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #63  <Method CoroutineContext$Element CoroutineContext$Element$DefaultImpls.get(CoroutineContext$Element, CoroutineContext$Key)>
	//    6   11:areturn         
	}

	public CoroutineContext.Key getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field CoroutineContext$Key key>
	//    2    4:areturn         
	}

	public CoroutineContext minusKey(CoroutineContext.Key key1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key1)), "key");
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "key">
	//    2    3:invokestatic    #38  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CoroutineContext.Element.DefaultImpls.minusKey(((CoroutineContext.Element) (this)), key1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #71  <Method CoroutineContext CoroutineContext$Element$DefaultImpls.minusKey(CoroutineContext$Element, CoroutineContext$Key)>
	//    6   11:areturn         
	}

	public CoroutineContext plus(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #76  <String "context">
	//    2    3:invokestatic    #38  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CoroutineContext.Element.DefaultImpls.plus(((CoroutineContext.Element) (this)), coroutinecontext);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #79  <Method CoroutineContext CoroutineContext$Element$DefaultImpls.plus(CoroutineContext$Element, CoroutineContext)>
	//    6   11:areturn         
	}

	private final CoroutineContext.Key key;
}
