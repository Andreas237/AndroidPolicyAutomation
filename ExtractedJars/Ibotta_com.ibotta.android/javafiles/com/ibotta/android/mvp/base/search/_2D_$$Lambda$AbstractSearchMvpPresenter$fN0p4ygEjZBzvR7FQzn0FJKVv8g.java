// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.api.model.search.SearchResults;
import java9.util.function.Consumer;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter

public final class _2D_$$Lambda$AbstractSearchMvpPresenter$fN0p4ygEjZBzvR7FQzn0FJKVv8g
	implements Consumer
{

	public final void accept(Object obj)
	{
		AbstractSearchMvpPresenter.lambda$fN0p4ygEjZBzvR7FQzn0FJKVv8g(f$0, (SearchResults)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AbstractSearchMvpPresenter f$0>
	//    2    4:aload_1         
	//    3    5:checkcast       #20  <Class SearchResults>
	//    4    8:invokestatic    #26  <Method void AbstractSearchMvpPresenter.lambda$fN0p4ygEjZBzvR7FQzn0FJKVv8g(AbstractSearchMvpPresenter, SearchResults)>
	//    5   11:return          
	}

	public Consumer andThen(Consumer consumer)
	{
		return java9.util.function.Consumer._2D_CC.$default$andThen(((Consumer) (this)), consumer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #34  <Method Consumer java9.util.function.Consumer$_2D_CC.$default$andThen(Consumer, Consumer)>
	//    3    5:areturn         
	}

	private final AbstractSearchMvpPresenter f$0;

	public _2D_$$Lambda$AbstractSearchMvpPresenter$fN0p4ygEjZBzvR7FQzn0FJKVv8g(AbstractSearchMvpPresenter abstractsearchmvppresenter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		f$0 = abstractsearchmvppresenter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field AbstractSearchMvpPresenter f$0>
	//    5    9:return          
	}
}
