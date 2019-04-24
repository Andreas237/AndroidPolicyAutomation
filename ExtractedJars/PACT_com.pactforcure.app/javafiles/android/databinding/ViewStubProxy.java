// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;
import android.view.ViewStub;

// Referenced classes of package android.databinding:
//			ViewDataBinding, DataBindingUtil

public class ViewStubProxy
{

	public ViewStubProxy(ViewStub viewstub)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mProxyListener = new android.view.ViewStub.OnInflateListener() {

			public void onInflate(ViewStub viewstub1, View view)
			{
				mRoot = view;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ViewStubProxy this$0>
			//    2    4:aload_2         
			//    3    5:invokestatic    #24  <Method View ViewStubProxy.access$002(ViewStubProxy, View)>
			//    4    8:pop             
				mViewDataBinding = DataBindingUtil.bind(mContainingBinding.mBindingComponent, view, viewstub1.getLayoutResource());
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
				mViewStub = null;
			//   17   35:aload_0         
			//   18   36:getfield        #14  <Field ViewStubProxy this$0>
			//   19   39:aconst_null     
			//   20   40:invokestatic    #54  <Method ViewStub ViewStubProxy.access$302(ViewStubProxy, ViewStub)>
			//   21   43:pop             
				if(mOnInflateListener != null)
			//*  22   44:aload_0         
			//*  23   45:getfield        #14  <Field ViewStubProxy this$0>
			//*  24   48:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
			//*  25   51:ifnull          77
				{
					mOnInflateListener.onInflate(viewstub1, view);
			//   26   54:aload_0         
			//   27   55:getfield        #14  <Field ViewStubProxy this$0>
			//   28   58:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
			//   29   61:aload_1         
			//   30   62:aload_2         
			//   31   63:invokeinterface #60  <Method void android.view.ViewStub$OnInflateListener.onInflate(ViewStub, View)>
					mOnInflateListener = null;
			//   32   68:aload_0         
			//   33   69:getfield        #14  <Field ViewStubProxy this$0>
			//   34   72:aconst_null     
			//   35   73:invokestatic    #64  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$402(ViewStubProxy, android.view.ViewStub$OnInflateListener)>
			//   36   76:pop             
				}
				mContainingBinding.invalidateAll();
			//   37   77:aload_0         
			//   38   78:getfield        #14  <Field ViewStubProxy this$0>
			//   39   81:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
			//   40   84:invokevirtual   #67  <Method void ViewDataBinding.invalidateAll()>
				mContainingBinding.forceExecuteBindings();
			//   41   87:aload_0         
			//   42   88:getfield        #14  <Field ViewStubProxy this$0>
			//   43   91:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
			//   44   94:invokevirtual   #70  <Method void ViewDataBinding.forceExecuteBindings()>
			//   45   97:return          
			}

			final ViewStubProxy this$0;

			
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
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ViewStubProxy$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #24  <Method void ViewStubProxy$1(ViewStubProxy)>
	//    7   13:putfield        #26  <Field android.view.ViewStub$OnInflateListener mProxyListener>
		mViewStub = viewstub;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #28  <Field ViewStub mViewStub>
		mViewStub.setOnInflateListener(mProxyListener);
	//   11   21:aload_0         
	//   12   22:getfield        #28  <Field ViewStub mViewStub>
	//   13   25:aload_0         
	//   14   26:getfield        #26  <Field android.view.ViewStub$OnInflateListener mProxyListener>
	//   15   29:invokevirtual   #34  <Method void ViewStub.setOnInflateListener(android.view.ViewStub$OnInflateListener)>
	//   16   32:return          
	}

	public ViewDataBinding getBinding()
	{
		return mViewDataBinding;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ViewDataBinding mViewDataBinding>
	//    2    4:areturn         
	}

	public View getRoot()
	{
		return mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field View mRoot>
	//    2    4:areturn         
	}

	public ViewStub getViewStub()
	{
		return mViewStub;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ViewStub mViewStub>
	//    2    4:areturn         
	}

	public boolean isInflated()
	{
		return mRoot != null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field View mRoot>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setContainingBinding(ViewDataBinding viewdatabinding)
	{
		mContainingBinding = viewdatabinding;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field ViewDataBinding mContainingBinding>
	//    3    5:return          
	}

	public void setOnInflateListener(android.view.ViewStub.OnInflateListener oninflatelistener)
	{
		if(mViewStub != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ViewStub mViewStub>
	//*   2    4:ifnull          12
			mOnInflateListener = oninflatelistener;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #53  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
	//    6   12:return          
	}

	private ViewDataBinding mContainingBinding;
	private android.view.ViewStub.OnInflateListener mOnInflateListener;
	private android.view.ViewStub.OnInflateListener mProxyListener;
	private View mRoot;
	private ViewDataBinding mViewDataBinding;
	private ViewStub mViewStub;


/*
	static View access$002(ViewStubProxy viewstubproxy, View view)
	{
		viewstubproxy.mRoot = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field View mRoot>
		return view;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ViewDataBinding access$102(ViewStubProxy viewstubproxy, ViewDataBinding viewdatabinding)
	{
		viewstubproxy.mViewDataBinding = viewdatabinding;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ViewDataBinding mViewDataBinding>
		return viewdatabinding;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ViewDataBinding access$200(ViewStubProxy viewstubproxy)
	{
		return viewstubproxy.mContainingBinding;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ViewDataBinding mContainingBinding>
	//    2    4:areturn         
	}

*/


/*
	static ViewStub access$302(ViewStubProxy viewstubproxy, ViewStub viewstub)
	{
		viewstubproxy.mViewStub = viewstub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field ViewStub mViewStub>
		return viewstub;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static android.view.ViewStub.OnInflateListener access$400(ViewStubProxy viewstubproxy)
	{
		return viewstubproxy.mOnInflateListener;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
	//    2    4:areturn         
	}

*/


/*
	static android.view.ViewStub.OnInflateListener access$402(ViewStubProxy viewstubproxy, android.view.ViewStub.OnInflateListener oninflatelistener)
	{
		viewstubproxy.mOnInflateListener = oninflatelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
		return oninflatelistener;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
