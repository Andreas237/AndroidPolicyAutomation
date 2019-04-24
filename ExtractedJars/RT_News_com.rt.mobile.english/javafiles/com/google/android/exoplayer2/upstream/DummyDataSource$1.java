// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DummyDataSource, DataSource

static final class DummyDataSource$1
	implements 
{

	public DataSource createDataSource()
	{
		return ((DataSource) (new DummyDataSource(((DummyDataSource$1) (null)))));
	//    0    0:new             #8   <Class DummyDataSource>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void DummyDataSource(DummyDataSource$1)>
	//    4    8:areturn         
	}

	DummyDataSource$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
