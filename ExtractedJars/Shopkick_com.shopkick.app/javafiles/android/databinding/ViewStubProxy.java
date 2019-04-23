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
	//    1    1:invokespecial   #22  <Method void Object()>
		mProxyListener = new android.view.ViewStub.OnInflateListener() {

			public void onInflate(ViewStub viewstub1, View view)
			{
				mRoot = view;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ViewStubProxy this$0>
			//    2    4:aload_2         
			//    3    5:invokestatic    #24  <Method View ViewStubProxy.access$002(ViewStubProxy, View)>
			//    4    8:pop             
				ViewStubProxy viewstubproxy = ViewStubProxy.this;
			//    5    9:aload_0         
			//    6   10:getfield        #14  <Field ViewStubProxy this$0>
			//    7   13:astore_3        
				viewstubproxy.mViewDataBinding = DataBindingUtil.bind(viewstubproxy.mContainingBinding.mBindingComponent, view, viewstub1.getLayoutResource());
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
				mViewStub = null;
			//   18   34:aload_0         
			//   19   35:getfield        #14  <Field ViewStubProxy this$0>
			//   20   38:aconst_null     
			//   21   39:invokestatic    #54  <Method ViewStub ViewStubProxy.access$302(ViewStubProxy, ViewStub)>
			//   22   42:pop             
				if(mOnInflateListener != null)
			//*  23   43:aload_0         
			//*  24   44:getfield        #14  <Field ViewStubProxy this$0>
			//*  25   47:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
			//*  26   50:ifnull          76
				{
					mOnInflateListener.onInflate(viewstub1, view);
			//   27   53:aload_0         
			//   28   54:getfield        #14  <Field ViewStubProxy this$0>
			//   29   57:invokestatic    #58  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$400(ViewStubProxy)>
			//   30   60:aload_1         
			//   31   61:aload_2         
			//   32   62:invokeinterface #60  <Method void android.view.ViewStub$OnInflateListener.onInflate(ViewStub, View)>
					mOnInflateListener = null;
			//   33   67:aload_0         
			//   34   68:getfield        #14  <Field ViewStubProxy this$0>
			//   35   71:aconst_null     
			//   36   72:invokestatic    #64  <Method android.view.ViewStub$OnInflateListener ViewStubProxy.access$402(ViewStubProxy, android.view.ViewStub$OnInflateListener)>
			//   37   75:pop             
				}
				mContainingBinding.invalidateAll();
			//   38   76:aload_0         
			//   39   77:getfield        #14  <Field ViewStubProxy this$0>
			//   40   80:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
			//   41   83:invokevirtual   #67  <Method void ViewDataBinding.invalidateAll()>
				mContainingBinding.forceExecuteBindings();
			//   42   86:aload_0         
			//   43   87:getfield        #14  <Field ViewStubProxy this$0>
			//   44   90:invokestatic    #28  <Method ViewDataBinding ViewStubProxy.access$200(ViewStubProxy)>
			//   45   93:invokevirtual   #70  <Method void ViewDataBinding.forceExecuteBindings()>
			//   46   96:return          
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
	//    6   10:invokespecial   #25  <Method void ViewStubProxy$1(ViewStubProxy)>
	//    7   13:putfield        #27  <Field android.view.ViewStub$OnInflateListener mProxyListener>
		mViewStub = viewstub;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #29  <Field ViewStub mViewStub>
		mViewStub.setOnInflateListener(mProxyListener);
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field ViewStub mViewStub>
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field android.view.ViewStub$OnInflateListener mProxyListener>
	//   15   29:invokevirtual   #35  <Method void ViewStub.setOnInflateListener(android.view.ViewStub$OnInflateListener)>
	//   16   32:return          
	}

	public ViewDataBinding getBinding()
	{
		return mViewDataBinding;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ViewDataBinding mViewDataBinding>
	//    2    4:areturn         
	}

	public View getRoot()
	{
		return mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field View mRoot>
	//    2    4:areturn         
	}

	public ViewStub getViewStub()
	{
		return mViewStub;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewStub mViewStub>
	//    2    4:areturn         
	}

	public boolean isInflated()
	{
		return mRoot != null;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field View mRoot>
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
	//    2    2:putfield        #49  <Field ViewDataBinding mContainingBinding>
	//    3    5:return          
	}

	public void setOnInflateListener(android.view.ViewStub.OnInflateListener oninflatelistener)
	{
		if(mViewStub != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ViewStub mViewStub>
	//*   2    4:ifnull          12
			mOnInflateListener = oninflatelistener;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #55  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
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
	//    2    2:putfield        #41  <Field View mRoot>
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
	//    2    2:putfield        #45  <Field ViewDataBinding mViewDataBinding>
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
	//    1    1:getfield        #49  <Field ViewDataBinding mContainingBinding>
	//    2    4:areturn         
	}

*/


/*
	static ViewStub access$302(ViewStubProxy viewstubproxy, ViewStub viewstub)
	{
		viewstubproxy.mViewStub = viewstub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field ViewStub mViewStub>
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
	//    1    1:getfield        #55  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
	//    2    4:areturn         
	}

*/


/*
	static android.view.ViewStub.OnInflateListener access$402(ViewStubProxy viewstubproxy, android.view.ViewStub.OnInflateListener oninflatelistener)
	{
		viewstubproxy.mOnInflateListener = oninflatelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field android.view.ViewStub$OnInflateListener mOnInflateListener>
		return oninflatelistener;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
