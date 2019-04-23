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
		AppCompatSpinner.DropdownPopup dropdownpopup = AppCompatSpinner.DropdownPopup.this;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//    2    4:astore_1        
		if(!dropdownpopup.isVisibleToUser(((android.view.View) (dropdownpopup.this$0))))
	//*   3    5:aload_1         
	//*   4    6:aload_1         
	//*   5    7:getfield        #28  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//*   6   10:invokevirtual   #32  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(android.view.View)>
	//*   7   13:ifne            24
		{
			dismiss();
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//   10   20:invokevirtual   #35  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
			return;
	//   11   23:return          
		} else
		{
			computeContentWidth();
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//   14   28:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
			AppCompatSpinner.DropdownPopup.access$001(AppCompatSpinner.DropdownPopup.this);
	//   15   31:aload_0         
	//   16   32:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
	//   17   35:invokestatic    #41  <Method void AppCompatSpinner$DropdownPopup.access$001(AppCompatSpinner$DropdownPopup)>
			return;
	//   18   38:return          
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
