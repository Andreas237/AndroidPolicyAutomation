// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			GapWorker, RecyclerView

static class GapWorker$Task
{

	public void clear()
	{
		immediate = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #23  <Field boolean immediate>
		viewVelocity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int viewVelocity>
		distanceToItem = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #27  <Field int distanceToItem>
		view = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #29  <Field RecyclerView view>
		position = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #31  <Field int position>
	//   15   25:return          
	}

	public int distanceToItem;
	public boolean immediate;
	public int position;
	public RecyclerView view;
	public int viewVelocity;

	GapWorker$Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
