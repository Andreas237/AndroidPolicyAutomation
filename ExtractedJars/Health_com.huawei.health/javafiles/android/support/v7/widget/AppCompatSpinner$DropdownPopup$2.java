// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$DropdownPopup$2
	implements android.view.stener
{

	public void onGlobalLayout()
	{
		if(!isVisibleToUser(((android.view.View) (this$0))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//*   4    8:getfield        #28  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//*   5   11:invokevirtual   #32  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(android.view.View)>
	//*   6   14:ifne            25
		{
			dismiss();
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//    9   21:invokevirtual   #35  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
			return;
	//   10   24:return          
		} else
		{
			computeContentWidth();
	//   11   25:aload_0         
	//   12   26:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//   13   29:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
			AppCompatSpinner.DropdownPopup.access$001(AppCompatSpinner.DropdownPopup.this);
	//   14   32:aload_0         
	//   15   33:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//   16   36:invokestatic    #41  <Method void AppCompatSpinner$DropdownPopup.access$001(AppCompatSpinner$DropdownPopup)>
			return;
	//   17   39:return          
		}
	}

	final AppCompatSpinner.DropdownPopup this$1;

	AppCompatSpinner$DropdownPopup$2()
	{
		this$1 = AppCompatSpinner.DropdownPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
