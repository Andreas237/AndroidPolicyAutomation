// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager

protected static class LinearLayoutManager$LayoutChunkResult
{

	void resetInternal()
	{
		mConsumed = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field int mConsumed>
		mFinished = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #23  <Field boolean mFinished>
		mIgnoreConsumed = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #25  <Field boolean mIgnoreConsumed>
		mFocusable = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #27  <Field boolean mFocusable>
	//   12   20:return          
	}

	public int mConsumed;
	public boolean mFinished;
	public boolean mFocusable;
	public boolean mIgnoreConsumed;

	protected LinearLayoutManager$LayoutChunkResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
