// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.search.SuggestedSearchMode;
import com.ibotta.api.model.search.SuggestedSearches;
import java9.util.function.Consumer;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter

public final class _2D_$$Lambda$AbstractSearchMvpPresenter$6S8lYTvYWsgC0kBCf8TX94_2D_oQm4
	implements Consumer
{

	public final void accept(Object obj)
	{
		AbstractSearchMvpPresenter.lambda$onQueryRecentSearches$1(f$0, f$1, (SuggestedSearches)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AbstractSearchMvpPresenter f$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field SuggestedSearchMode f$1>
	//    4    8:aload_1         
	//    5    9:checkcast       #24  <Class SuggestedSearches>
	//    6   12:invokestatic    #30  <Method void AbstractSearchMvpPresenter.lambda$onQueryRecentSearches$1(AbstractSearchMvpPresenter, SuggestedSearchMode, SuggestedSearches)>
	//    7   15:return          
	}

	public Consumer andThen(Consumer consumer)
	{
		return java9.util.function.Consumer._2D_CC.$default$andThen(((Consumer) (this)), consumer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method Consumer java9.util.function.Consumer$_2D_CC.$default$andThen(Consumer, Consumer)>
	//    3    5:areturn         
	}

	private final AbstractSearchMvpPresenter f$0;
	private final SuggestedSearchMode f$1;

	public _2D_$$Lambda$AbstractSearchMvpPresenter$6S8lYTvYWsgC0kBCf8TX94_2D_oQm4(AbstractSearchMvpPresenter abstractsearchmvppresenter, SuggestedSearchMode suggestedsearchmode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		f$0 = abstractsearchmvppresenter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field AbstractSearchMvpPresenter f$0>
		f$1 = suggestedsearchmode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field SuggestedSearchMode f$1>
	//    8   14:return          
	}
}
