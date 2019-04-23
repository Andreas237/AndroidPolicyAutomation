// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$2
	implements Runnable
{

	public void run()
	{
		if((mInvalidatePanelMenuFeatures & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field AppCompatDelegateImpl this$0>
	//*   2    4:getfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
	//*   3    7:iconst_1        
	//*   4    8:iand            
	//*   5    9:ifeq            20
			doInvalidatePanelMenu(0);
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field AppCompatDelegateImpl this$0>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #27  <Method void AppCompatDelegateImpl.doInvalidatePanelMenu(int)>
		if((mInvalidatePanelMenuFeatures & 0x1000) != 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field AppCompatDelegateImpl this$0>
	//*  12   24:getfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
	//*  13   27:sipush          4096
	//*  14   30:iand            
	//*  15   31:ifeq            43
			doInvalidatePanelMenu(108);
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field AppCompatDelegateImpl this$0>
	//   18   38:bipush          108
	//   19   40:invokevirtual   #27  <Method void AppCompatDelegateImpl.doInvalidatePanelMenu(int)>
		AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
	//   20   43:aload_0         
	//   21   44:getfield        #14  <Field AppCompatDelegateImpl this$0>
	//   22   47:astore_1        
		appcompatdelegateimpl.mInvalidatePanelMenuPosted = false;
	//   23   48:aload_1         
	//   24   49:iconst_0        
	//   25   50:putfield        #31  <Field boolean AppCompatDelegateImpl.mInvalidatePanelMenuPosted>
		appcompatdelegateimpl.mInvalidatePanelMenuFeatures = 0;
	//   26   53:aload_1         
	//   27   54:iconst_0        
	//   28   55:putfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
	//   29   58:return          
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$2()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
