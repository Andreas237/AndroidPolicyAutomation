// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class AppCompatSpinner$DropdownPopup$2
	implements android.view.stener
{

	public void onGlobalLayout()
	{
		AppCompatSpinner.DropdownPopup dropdownpopup = AppCompatSpinner.DropdownPopup.this;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
	//    2    4:astore_1        
		if(!dropdownpopup.isVisibleToUser(((android.view.View) (dropdownpopup.this$0))))
	//*   3    5:aload_1         
	//*   4    6:aload_1         
	//*   5    7:getfield        #23  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//*   6   10:invokevirtual   #27  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(android.view.View)>
	//*   7   13:ifne            24
		{
			dismiss();
	//    8   16:aload_0         
	//    9   17:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
	//   10   20:invokevirtual   #30  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
			return;
	//   11   23:return          
		} else
		{
			computeContentWidth();
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
	//   14   28:invokevirtual   #33  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
			AppCompatSpinner.DropdownPopup.access$001(AppCompatSpinner.DropdownPopup.this);
	//   15   31:aload_0         
	//   16   32:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
	//   17   35:invokestatic    #36  <Method void AppCompatSpinner$DropdownPopup.access$001(AppCompatSpinner$DropdownPopup)>
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
	//    2    2:putfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
