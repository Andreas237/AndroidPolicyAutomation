// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;
import android.view.ViewStub;

// Referenced classes of package android.databinding:
//			ViewStubProxy, ViewDataBinding, DataBindingUtil

class ViewStubProxy$1
	implements android.view.teListener
{

	public void onInflate(ViewStub viewstub, View view)
	{
		ViewStubProxy.access$002(ViewStubProxy.this, view);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ViewStubProxy this$0>
	//    2    4:aload_2         
	//    3    5:invokestatic    #24  <Method View ViewStubProxy.access$002(ViewStubProxy, View)>
	//    4    8:pop             
		ViewStubProxy.access$102(ViewStubProxy.this, DataBindingUtil.bind(ViewStubProxy.access$200(ViewStubProxy.this).mBindingComponent, view, viewstub.getLayoutResource()));
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field ViewStubProxy this$0>
	//    7   13:aload_0         
	//    8   14:getfield        #14  <Field ViewStubProxy this$0>
	//    9   17:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   10   20:getfield        #34  <Field DataBindingComponent ViewDataBinding.mBindingComponent>
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #40  <Method int ViewStub.getLayoutResource()>
	//   14   28:invokestatic    #46  <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//   15   31:invokestatic    #50  <Method ViewDataBinding ViewStubProxy.access$102(ViewStubProxy, ViewDataBinding)>
	//   16   34:pop             
		ViewStubProxy.access$302(ViewStubProxy.this, ((ViewStub) (null)));
	//   17   35:aload_0         
	//   18   36:getfield        #14  <Field ViewStubProxy this$0>
	//   19   39:aconst_null     
	//   20   40:invokestatic    #54  <Method ViewStub ViewStubProxy.access$302(ViewStubProxy, ViewStub)>
	//   21   43:pop             
		if(ViewStubProxy.access$400(ViewStubProxy.this) != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #14  <Field ViewStubProxy this$0>
	//*  24   48:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
	//*  25   51:ifnull          77
		{
			ViewStubProxy.access$400(ViewStubProxy.this).onInflate(viewstub, view);
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field ViewStubProxy this$0>
	//   28   58:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokeinterface #60  <Method void android.view.ViewStub$OnInflateListener.onInflate(ViewStub, View)>
			ViewStubProxy.access$402(ViewStubProxy.this, ((android.view.teListener) (null)));
	//   32   68:aload_0         
	//   33   69:getfield        #14  <Field ViewStubProxy this$0>
	//   34   72:aconst_null     
	//   35   73:invokestatic    #64  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$402(ViewStubProxy, android.view.ViewStub$OnInflateListener)>
	//   36   76:pop             
		}
		ViewStubProxy.access$200(ViewStubProxy.this).invalidateAll();
	//   37   77:aload_0         
	//   38   78:getfield        #14  <Field ViewStubProxy this$0>
	//   39   81:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   40   84:invokevirtual   #67  <Method void ViewDataBinding.invalidateAll()>
		ViewStubProxy.access$200(ViewStubProxy.this).forceExecuteBindings();
	//   41   87:aload_0         
	//   42   88:getfield        #14  <Field ViewStubProxy this$0>
	//   43   91:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   44   94:invokevirtual   #70  <Method void ViewDataBinding.forceExecuteBindings()>
	//   45   97:return          
	}

	final ViewStubProxy this$0;

	ViewStubProxy$1()
	{
		this$0 = ViewStubProxy.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ViewStubProxy this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
