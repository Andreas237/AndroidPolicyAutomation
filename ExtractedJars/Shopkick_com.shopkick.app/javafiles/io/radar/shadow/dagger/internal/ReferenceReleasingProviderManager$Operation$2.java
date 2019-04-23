// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;


// Referenced classes of package io.radar.shadow.dagger.internal:
//			ReferenceReleasingProviderManager, ReferenceReleasingProvider

final class ReferenceReleasingProviderManager$Operation$2 extends ReferenceReleasingProviderManager.Operation
{

	void execute(ReferenceReleasingProvider referencereleasingprovider)
	{
		referencereleasingprovider.restoreStrongReference();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method void ReferenceReleasingProvider.restoreStrongReference()>
	//    2    4:return          
	}

	ReferenceReleasingProviderManager$Operation$2(String s, int i)
	{
		super(s, i, ((ReferenceReleasingProviderManager._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #12  <Method void ReferenceReleasingProviderManager$Operation(String, int, ReferenceReleasingProviderManager$1)>
	//    5    7:return          
	}
}
