// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;


// Referenced classes of package org.joda.time.base:
//			AbstractPartial

public abstract class BaseLocal extends AbstractPartial
{

	protected BaseLocal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractPartial()>
	//    2    4:return          
	}

	protected abstract long getLocalMillis();

	private static final long serialVersionUID = 0xc550cf17L;
}
