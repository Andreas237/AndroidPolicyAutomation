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
		window = ((Window) (window.findViewById(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method View Window.findViewById(int)>
	//    3    5:astore_0        
		if(window == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       20
			throw new IllegalArgumentException("ID does not reference a View inside this Window");
	//    6   10:new             #28  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc1            #30  <String "ID does not reference a View inside this Window">
	//    9   16:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//   10   19:athrow          
		else
			return ((View) (window));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public static final int FEATURE_ACTION_BAR = 8;
	public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
	public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
}
