// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeSequenceableLoaderFactory, CompositeSequenceableLoader, SequenceableLoader

public final class DefaultCompositeSequenceableLoaderFactory
	implements CompositeSequenceableLoaderFactory
{

	public DefaultCompositeSequenceableLoaderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public transient SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader asequenceableloader[])
	{
		return ((SequenceableLoader) (new CompositeSequenceableLoader(asequenceableloader)));
	//    0    0:new             #15  <Class CompositeSequenceableLoader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void CompositeSequenceableLoader(SequenceableLoader[])>
	//    4    8:areturn         
	}
}
