// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat

class AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1
	implements tenerBridge
{

	public void onAccessibilityStateChanged(boolean flag)
	{
		val$listener.onAccessibilityStateChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener val$listener>
	//    2    4:iload_1         
	//    3    5:invokeinterface #34  <Method void AccessibilityManagerCompat$AccessibilityStateChangeListener.onAccessibilityStateChanged(boolean)>
	//    4   10:return          
	}

	final AccessibilityManagerCompat.AccessibilityManagerIcsImpl this$0;
	final er val$listener;

	AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1()
	{
		this$0 = final_accessibilitymanagericsimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0>
		val$listener = er.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
