// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

final class DashMediaSource$ManifestLoadErrorThrower
	implements LoaderErrorThrower
{

	private void maybeThrowManifestError()
		throws IOException
	{
		if(DashMediaSource.access$800(DashMediaSource.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field DashMediaSource this$0>
	//*   2    4:invokestatic    #26  <Method IOException DashMediaSource.access$800(DashMediaSource)>
	//*   3    7:ifnull          18
			throw DashMediaSource.access$800(DashMediaSource.this);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field DashMediaSource this$0>
	//    6   14:invokestatic    #26  <Method IOException DashMediaSource.access$800(DashMediaSource)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void maybeThrowError()
		throws IOException
	{
		DashMediaSource.access$700(DashMediaSource.this).maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DashMediaSource this$0>
	//    2    4:invokestatic    #32  <Method Loader DashMediaSource.access$700(DashMediaSource)>
	//    3    7:invokevirtual   #36  <Method void Loader.maybeThrowError()>
		maybeThrowManifestError();
	//    4   10:aload_0         
	//    5   11:invokespecial   #38  <Method void maybeThrowManifestError()>
	//    6   14:return          
	}

	public void maybeThrowError(int i)
		throws IOException
	{
		DashMediaSource.access$700(DashMediaSource.this).maybeThrowError(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DashMediaSource this$0>
	//    2    4:invokestatic    #32  <Method Loader DashMediaSource.access$700(DashMediaSource)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #41  <Method void Loader.maybeThrowError(int)>
		maybeThrowManifestError();
	//    5   11:aload_0         
	//    6   12:invokespecial   #38  <Method void maybeThrowManifestError()>
	//    7   15:return          
	}

	final DashMediaSource this$0;

	DashMediaSource$ManifestLoadErrorThrower()
	{
		this$0 = DashMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DashMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
