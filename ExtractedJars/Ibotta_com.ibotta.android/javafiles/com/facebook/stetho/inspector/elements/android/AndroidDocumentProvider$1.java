// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.inspector.elements.DocumentProviderListener;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider

class AndroidDocumentProvider$1
	implements Runnable
{

	public void run()
	{
		AndroidDocumentProvider.access$002(AndroidDocumentProvider.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AndroidDocumentProvider this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #23  <Method boolean AndroidDocumentProvider.access$002(AndroidDocumentProvider, boolean)>
	//    4    8:pop             
		if(AndroidDocumentProvider.access$100(AndroidDocumentProvider.this) != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #14  <Field AndroidDocumentProvider this$0>
	//*   7   13:invokestatic    #27  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
	//*   8   16:ifnull          51
		{
			AndroidDocumentProvider.access$100(AndroidDocumentProvider.this).onPossiblyChanged();
	//    9   19:aload_0         
	//   10   20:getfield        #14  <Field AndroidDocumentProvider this$0>
	//   11   23:invokestatic    #27  <Method DocumentProviderListener AndroidDocumentProvider.access$100(AndroidDocumentProvider)>
	//   12   26:invokeinterface #32  <Method void DocumentProviderListener.onPossiblyChanged()>
			AndroidDocumentProvider.access$002(AndroidDocumentProvider.this, true);
	//   13   31:aload_0         
	//   14   32:getfield        #14  <Field AndroidDocumentProvider this$0>
	//   15   35:iconst_1        
	//   16   36:invokestatic    #23  <Method boolean AndroidDocumentProvider.access$002(AndroidDocumentProvider, boolean)>
	//   17   39:pop             
			postDelayed(((Runnable) (this)), 1000L);
	//   18   40:aload_0         
	//   19   41:getfield        #14  <Field AndroidDocumentProvider this$0>
	//   20   44:aload_0         
	//   21   45:ldc2w           #33  <Long 1000L>
	//   22   48:invokevirtual   #38  <Method void AndroidDocumentProvider.postDelayed(Runnable, long)>
		}
	//   23   51:return          
	}

	final AndroidDocumentProvider this$0;

	AndroidDocumentProvider$1()
	{
		this$0 = AndroidDocumentProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AndroidDocumentProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
