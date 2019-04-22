// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

public final class AccessibilityEventCompat
{

	public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return accessibilityevent.getContentChangeTypes();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #17  <Method int AccessibilityEvent.getContentChangeTypes()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			accessibilityevent.setContentChangeTypes(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #23  <Method void AccessibilityEvent.setContentChangeTypes(int)>
	//    6   13:return          
	}
}
