// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.views.search.suggested.SuggestedSearchItemViewState;
import com.ibotta.api.model.search.SuggestedSearchItem;
import java9.util.function.Predicate;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter

public final class _2D_$$Lambda$AbstractSearchMvpPresenter$CCjzNeqnwbWuzZCdiXeU1slTG_2D_g
	implements Predicate
{

	public Predicate and(Predicate predicate)
	{
		return java9.util.function.Predicate._2D_CC.$default$and(((Predicate) (this)), predicate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #24  <Method Predicate java9.util.function.Predicate$_2D_CC.$default$and(Predicate, Predicate)>
	//    3    5:areturn         
	}

	public Predicate negate()
	{
		return java9.util.function.Predicate._2D_CC.$default$negate(((Predicate) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method Predicate java9.util.function.Predicate$_2D_CC.$default$negate(Predicate)>
	//    2    4:areturn         
	}

	public Predicate or(Predicate predicate)
	{
		return java9.util.function.Predicate._2D_CC.$default$or(((Predicate) (this)), predicate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #36  <Method Predicate java9.util.function.Predicate$_2D_CC.$default$or(Predicate, Predicate)>
	//    3    5:areturn         
	}

	public final boolean test(Object obj)
	{
		return AbstractSearchMvpPresenter.lambda$onSuggestionRowClicked$2(f$0, (SuggestedSearchItem)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SuggestedSearchItemViewState f$0>
	//    2    4:aload_1         
	//    3    5:checkcast       #40  <Class SuggestedSearchItem>
	//    4    8:invokestatic    #46  <Method boolean AbstractSearchMvpPresenter.lambda$onSuggestionRowClicked$2(SuggestedSearchItemViewState, SuggestedSearchItem)>
	//    5   11:ireturn         
	}

	private final SuggestedSearchItemViewState f$0;

	public _2D_$$Lambda$AbstractSearchMvpPresenter$CCjzNeqnwbWuzZCdiXeU1slTG_2D_g(SuggestedSearchItemViewState suggestedsearchitemviewstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		f$0 = suggestedsearchitemviewstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SuggestedSearchItemViewState f$0>
	//    5    9:return          
	}
}
