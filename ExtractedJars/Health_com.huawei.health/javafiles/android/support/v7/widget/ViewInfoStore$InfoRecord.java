// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ViewInfoStore

static class ViewInfoStore$InfoRecord
{

	static void drainCache()
	{
		while(sPool.acquire() != null) ;
	//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
	//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:ifnull          14
	//*   3   11:goto            0
	//    4   14:return          
	}

	static ViewInfoStore$InfoRecord obtain()
	{
		ViewInfoStore$InfoRecord viewinfostore$inforecord = (ViewInfoStore$InfoRecord)sPool.acquire();
	//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
	//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class ViewInfoStore$InfoRecord>
	//    3   11:astore_0        
		if(viewinfostore$inforecord == null)
	//*   4   12:aload_0         
	//*   5   13:ifnonnull       24
			return new ViewInfoStore$InfoRecord();
	//    6   16:new             #2   <Class ViewInfoStore$InfoRecord>
	//    7   19:dup             
	//    8   20:invokespecial   #53  <Method void ViewInfoStore$InfoRecord()>
	//    9   23:areturn         
		else
			return viewinfostore$inforecord;
	//   10   24:aload_0         
	//   11   25:areturn         
	}

	static void recycle(ViewInfoStore$InfoRecord viewinfostore$inforecord)
	{
		viewinfostore$inforecord.flags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #57  <Field int flags>
		viewinfostore$inforecord.preInfo = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #59  <Field RecyclerView$ItemAnimator$ItemHolderInfo preInfo>
		viewinfostore$inforecord.postInfo = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #61  <Field RecyclerView$ItemAnimator$ItemHolderInfo postInfo>
		sPool.release(((Object) (viewinfostore$inforecord)));
	//    9   15:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
	//   10   18:aload_0         
	//   11   19:invokeinterface #65  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   12   24:pop             
	//   13   25:return          
	}

	static final int FLAG_APPEAR = 2;
	static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
	static final int FLAG_APPEAR_PRE_AND_POST = 14;
	static final int FLAG_DISAPPEARED = 1;
	static final int FLAG_POST = 8;
	static final int FLAG_PRE = 4;
	static final int FLAG_PRE_AND_POST = 12;
	static android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(20);
	int flags;
	.ItemHolderInfo postInfo;
	.ItemHolderInfo preInfo;

	static 
	{
	//    0    0:new             #34  <Class android.support.v4.util.Pools$SimplePool>
	//    1    3:dup             
	//    2    4:bipush          20
	//    3    6:invokespecial   #38  <Method void android.support.v4.util.Pools$SimplePool(int)>
	//    4    9:putstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
	//*   5   12:return          
	}

	private ViewInfoStore$InfoRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}
}
