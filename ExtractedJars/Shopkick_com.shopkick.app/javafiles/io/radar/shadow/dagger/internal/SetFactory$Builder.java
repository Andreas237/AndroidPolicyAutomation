// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;
import java.util.List;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			SetFactory, DaggerCollections

public static final class SetFactory$Builder
{

	public SetFactory$Builder addCollectionProvider(Provider provider)
	{
		collectionProviders.add(((Object) (provider)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List collectionProviders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SetFactory$Builder addProvider(Provider provider)
	{
		individualProviders.add(((Object) (provider)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List individualProviders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SetFactory build()
	{
		return new SetFactory(individualProviders, collectionProviders, ((SetFactory._cls1) (null)));
	//    0    0:new             #7   <Class SetFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field List individualProviders>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field List collectionProviders>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #53  <Method void SetFactory(List, List, SetFactory$1)>
	//    8   16:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final List collectionProviders;
	private final List individualProviders;

	static 
	{
	//    0    0:return          
	}

	private SetFactory$Builder(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		individualProviders = DaggerCollections.presizedList(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #29  <Method List DaggerCollections.presizedList(int)>
	//    5    9:putfield        #31  <Field List individualProviders>
		collectionProviders = DaggerCollections.presizedList(j);
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:invokestatic    #29  <Method List DaggerCollections.presizedList(int)>
	//    9   17:putfield        #33  <Field List collectionProviders>
	//   10   20:return          
	}

	SetFactory$Builder(int i, int j, SetFactory._cls1 _pcls1)
	{
		this(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void SetFactory$Builder(int, int)>
	//    4    6:return          
	}
}
