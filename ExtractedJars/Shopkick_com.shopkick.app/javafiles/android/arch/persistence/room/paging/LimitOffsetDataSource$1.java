// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.paging;

import java.util.Set;

// Referenced classes of package android.arch.persistence.room.paging:
//			LimitOffsetDataSource

class LimitOffsetDataSource$1 extends android.arch.persistence.room.rver
{

	public void onInvalidated(Set set)
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field LimitOffsetDataSource this$0>
	//    2    4:invokevirtual   #25  <Method void LimitOffsetDataSource.invalidate()>
	//    3    7:return          
	}

	final LimitOffsetDataSource this$0;

	LimitOffsetDataSource$1(String as[])
	{
		this$0 = LimitOffsetDataSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LimitOffsetDataSource this$0>
		super(as);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String[])>
	//    6   10:return          
	}
}
