// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.g.s;
import android.support.v4.g.t;

class ViewInfoStore$InfoRecord
{

	static void drainCache()
	{
		while(sPool.a() != null) ;
	//    0    0:getstatic       #35  <Field s sPool>
	//    1    3:invokeinterface #45  <Method Object s.a()>
	//    2    8:ifnull          14
	//*   3   11:goto            0
	//    4   14:return          
	}

	static ViewInfoStore$InfoRecord obtain()
	{
		ViewInfoStore$InfoRecord viewinfostore$inforecord1 = (ViewInfoStore$InfoRecord)sPool.a();
	//    0    0:getstatic       #35  <Field s sPool>
	//    1    3:invokeinterface #45  <Method Object s.a()>
	//    2    8:checkcast       #2   <Class ViewInfoStore$InfoRecord>
	//    3   11:astore_1        
		ViewInfoStore$InfoRecord viewinfostore$inforecord = viewinfostore$inforecord1;
	//    4   12:aload_1         
	//    5   13:astore_0        
		if(viewinfostore$inforecord1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       26
			viewinfostore$inforecord = new ViewInfoStore$InfoRecord();
	//    8   18:new             #2   <Class ViewInfoStore$InfoRecord>
	//    9   21:dup             
	//   10   22:invokespecial   #48  <Method void ViewInfoStore$InfoRecord()>
	//   11   25:astore_0        
		return viewinfostore$inforecord;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	static void recycle(ViewInfoStore$InfoRecord viewinfostore$inforecord)
	{
		viewinfostore$inforecord.flags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #52  <Field int flags>
		viewinfostore$inforecord.preInfo = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #54  <Field RecyclerView$ItemAnimator$ItemHolderInfo preInfo>
		viewinfostore$inforecord.postInfo = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo postInfo>
		sPool.a(((Object) (viewinfostore$inforecord)));
	//    9   15:getstatic       #35  <Field s sPool>
	//   10   18:aload_0         
	//   11   19:invokeinterface #59  <Method boolean s.a(Object)>
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
	static s sPool = new t(20);
	int flags;
	.ItemHolderInfo postInfo;
	.ItemHolderInfo preInfo;

	static 
	{
	//    0    0:new             #29  <Class t>
	//    1    3:dup             
	//    2    4:bipush          20
	//    3    6:invokespecial   #33  <Method void t(int)>
	//    4    9:putstatic       #35  <Field s sPool>
	//*   5   12:return          
	}

	private ViewInfoStore$InfoRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}
}
