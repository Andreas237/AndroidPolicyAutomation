// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcPresenterImpl, AddUpcView, AddUpcPresenter

public class AddUpcModule extends AbstractMvpModule
{

	public AddUpcModule(AddUpcView addupcview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (addupcview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public AddUpcPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, GraphQLCallFactory graphqlcallfactory)
	{
		return ((AddUpcPresenter) (new AddUpcPresenterImpl(mvppresenteractions, graphqlcallfactory)));
	//    0    0:new             #18  <Class AddUpcPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void AddUpcPresenterImpl(MvpPresenterActions, GraphQLCallFactory)>
	//    5    9:areturn         
	}
}
