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
		ViewStubProxy viewstubproxy = ViewStubProxy.this;
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field ViewStubProxy this$0>
	//    7   13:astore_3        
		ViewStubProxy.access$102(viewstubproxy, DataBindingUtil.bind(ViewStubProxy.access$200(viewstubproxy).mBindingComponent, view, viewstub.getLayoutResource()));
	//    8   14:aload_3         
	//    9   15:aload_3         
	//   10   16:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   11   19:getfield        #34  <Field DataBindingComponent ViewDataBinding.mBindingComponent>
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #40  <Method int ViewStub.getLayoutResource()>
	//   15   27:invokestatic    #46  <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//   16   30:invokestatic    #50  <Method ViewDataBinding ViewStubProxy.access$102(ViewStubProxy, ViewDataBinding)>
	//   17   33:pop             
		ViewStubProxy.access$302(ViewStubProxy.this, ((ViewStub) (null)));
	//   18   34:aload_0         
	//   19   35:getfield        #14  <Field ViewStubProxy this$0>
	//   20   38:aconst_null     
	//   21   39:invokestatic    #54  <Method ViewStub ViewStubProxy.access$302(ViewStubProxy, ViewStub)>
	//   22   42:pop             
		if(ViewStubProxy.access$400(ViewStubProxy.this) != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #14  <Field ViewStubProxy this$0>
	//*  25   47:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
	//*  26   50:ifnull          76
		{
			ViewStubProxy.access$400(ViewStubProxy.this).onInflate(viewstub, view);
	//   27   53:aload_0         
	//   28   54:getfield        #14  <Field ViewStubProxy this$0>
	//   29   57:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:invokeinterface #60  <Method void android.view.ViewStub$OnInflateListener.onInflate(ViewStub, View)>
			ViewStubProxy.access$402(ViewStubProxy.this, ((android.view.teListener) (null)));
	//   33   67:aload_0         
	//   34   68:getfield        #14  <Field ViewStubProxy this$0>
	//   35   71:aconst_null     
	//   36   72:invokestatic    #64  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$402(ViewStubProxy, android.view.ViewStub$OnInflateListener)>
	//   37   75:pop             
		}
		ViewStubProxy.access$200(ViewStubProxy.this).invalidateAll();
	//   38   76:aload_0         
	//   39   77:getfield        #14  <Field ViewStubProxy this$0>
	//   40   80:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   41   83:invokevirtual   #67  <Method void ViewDataBinding.invalidateAll()>
		ViewStubProxy.access$200(ViewStubProxy.this).forceExecuteBindings();
	//   42   86:aload_0         
	//   43   87:getfield        #14  <Field ViewStubProxy this$0>
	//   44   90:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
	//   45   93:invokevirtual   #70  <Method void ViewDataBinding.forceExecuteBindings()>
	//   46   96:return          
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
