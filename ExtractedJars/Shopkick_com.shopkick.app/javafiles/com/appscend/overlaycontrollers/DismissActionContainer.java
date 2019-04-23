// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;


// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class DismissActionContainer
{

	public DismissActionContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		dismissAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//    4    8:putfield        #26  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissAction>
	//    5   11:return          
	}

	public com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction getDismissAction()
	{
		return dismissAction;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissAction>
	//    2    4:areturn         
	}

	public APSMediaPlayerOverlayController getDismissOverlay()
	{
		return overlay;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field APSMediaPlayerOverlayController overlay>
	//    2    4:areturn         
	}

	public void setDismissAction(com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction apswebviewdismissedaction)
	{
		dismissAction = apswebviewdismissedaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissAction>
	//    3    5:return          
	}

	public void setDismissAction(com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction apswebviewdismissedaction, APSMediaPlayerOverlayController apsmediaplayeroverlaycontroller)
	{
		dismissAction = apswebviewdismissedaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissAction>
		overlay = apsmediaplayeroverlaycontroller;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field APSMediaPlayerOverlayController overlay>
	//    6   10:return          
	}

	public void unsetDismissAction()
	{
		dismissAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//    2    4:putfield        #26  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissAction>
		overlay = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #32  <Field APSMediaPlayerOverlayController overlay>
	//    6   12:return          
	}

	public static DismissActionContainer INSTANCE = new DismissActionContainer();
	private com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction dismissAction;
	private APSMediaPlayerOverlayController overlay;

	static 
	{
	//    0    0:new             #2   <Class DismissActionContainer>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void DismissActionContainer()>
	//    3    7:putstatic       #17  <Field DismissActionContainer INSTANCE>
	//*   4   10:return          
	}
}
