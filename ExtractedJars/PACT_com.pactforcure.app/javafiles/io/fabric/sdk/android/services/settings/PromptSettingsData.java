// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class PromptSettingsData
{

	public PromptSettingsData(String s, String s1, String s2, boolean flag, String s3, boolean flag1, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		title = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String title>
		message = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String message>
		sendButtonTitle = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field String sendButtonTitle>
		showCancelButton = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field boolean showCancelButton>
		cancelButtonTitle = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #28  <Field String cancelButtonTitle>
		showAlwaysSendButton = flag1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #30  <Field boolean showAlwaysSendButton>
		alwaysSendButtonTitle = s4;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #32  <Field String alwaysSendButtonTitle>
	//   23   43:return          
	}

	public final String alwaysSendButtonTitle;
	public final String cancelButtonTitle;
	public final String message;
	public final String sendButtonTitle;
	public final boolean showAlwaysSendButton;
	public final boolean showCancelButton;
	public final String title;
}
