// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FacebookDialogBase, AppCall

protected abstract class FacebookDialogBase$ModeHandler
{

	public abstract boolean canShow(Object obj, boolean flag);

	public abstract AppCall createAppCall(Object obj);

	public Object getMode()
	{
		return FacebookDialogBase.BASE_AUTOMATIC_MODE;
	//    0    0:getstatic       #27  <Field Object FacebookDialogBase.BASE_AUTOMATIC_MODE>
	//    1    3:areturn         
	}

	final FacebookDialogBase this$0;

	protected FacebookDialogBase$ModeHandler()
	{
		this$0 = FacebookDialogBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field FacebookDialogBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}
}
