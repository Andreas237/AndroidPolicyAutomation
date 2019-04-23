// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.Window;

public final class WindowCompat
{

	private WindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static View requireViewById(Window window, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          14
			return window.requireViewById(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #30  <Method View Window.requireViewById(int)>
	//    6   13:areturn         
		window = ((Window) (window.findViewById(i)));
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #33  <Method View Window.findViewById(int)>
	//   10   19:astore_0        
		if(window != null)
	//*  11   20:aload_0         
	//*  12   21:ifnull          26
			return ((View) (window));
	//   13   24:aload_0         
	//   14   25:areturn         
		else
			throw new IllegalArgumentException("ID does not reference a View inside this Window");
	//   15   26:new             #35  <Class IllegalArgumentException>
	//   16   29:dup             
	//   17   30:ldc1            #37  <String "ID does not reference a View inside this Window">
	//   18   32:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   19   35:athrow          
	}

	public static final int FEATURE_ACTION_BAR = 8;
	public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
	public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
}
