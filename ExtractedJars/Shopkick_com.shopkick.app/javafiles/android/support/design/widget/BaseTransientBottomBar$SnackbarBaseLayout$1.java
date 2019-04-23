// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$SnackbarBaseLayout$1
	implements android.support.v4.view.accessibility.tateChangeListener
{

	public void onTouchExplorationStateChanged(boolean flag)
	{
		BaseTransientBottomBar.SnackbarBaseLayout.access$300(BaseTransientBottomBar.SnackbarBaseLayout.this, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
	//    2    4:iload_1         
	//    3    5:invokestatic    #29  <Method void BaseTransientBottomBar$SnackbarBaseLayout.access$300(BaseTransientBottomBar$SnackbarBaseLayout, boolean)>
	//    4    8:return          
	}

	final BaseTransientBottomBar.SnackbarBaseLayout this$0;

	BaseTransientBottomBar$SnackbarBaseLayout$1()
	{
		this$0 = BaseTransientBottomBar.SnackbarBaseLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
