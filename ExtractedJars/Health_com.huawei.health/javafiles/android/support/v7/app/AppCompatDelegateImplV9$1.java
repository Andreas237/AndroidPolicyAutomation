// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$1
	implements Runnable
{

	public void run()
	{
		if((mInvalidatePanelMenuFeatures & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//*   2    4:getfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
	//*   3    7:iconst_1        
	//*   4    8:iand            
	//*   5    9:ifeq            20
			doInvalidatePanelMenu(0);
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #27  <Method void AppCompatDelegateImplV9.doInvalidatePanelMenu(int)>
		if((mInvalidatePanelMenuFeatures & 0x1000) != 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//*  12   24:getfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
	//*  13   27:sipush          4096
	//*  14   30:iand            
	//*  15   31:ifeq            43
			doInvalidatePanelMenu(108);
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//   18   38:bipush          108
	//   19   40:invokevirtual   #27  <Method void AppCompatDelegateImplV9.doInvalidatePanelMenu(int)>
		mInvalidatePanelMenuPosted = false;
	//   20   43:aload_0         
	//   21   44:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//   22   47:iconst_0        
	//   23   48:putfield        #31  <Field boolean AppCompatDelegateImplV9.mInvalidatePanelMenuPosted>
		mInvalidatePanelMenuFeatures = 0;
	//   24   51:aload_0         
	//   25   52:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
	//   26   55:iconst_0        
	//   27   56:putfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
	//   28   59:return          
	}

	final AppCompatDelegateImplV9 this$0;

	AppCompatDelegateImplV9$1()
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatDelegateImplV9 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
