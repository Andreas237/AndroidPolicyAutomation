// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor

final class WindowDescriptor extends AbstractChainedDescriptor
	implements HighlightableDescriptor
{

	WindowDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractChainedDescriptor()>
	//    2    4:return          
	}

	public View getViewForHighlighting(Object obj)
	{
		return ((Window)obj).peekDecorView();
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Window>
	//    2    4:invokevirtual   #21  <Method View Window.peekDecorView()>
	//    3    7:areturn         
	}

	protected void onGetChildren(Window window, Accumulator accumulator)
	{
		window = ((Window) (window.peekDecorView()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method View Window.peekDecorView()>
	//    2    4:astore_1        
		if(window != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			accumulator.store(((Object) (window)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #30  <Method void Accumulator.store(Object)>
	//    8   16:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((Window)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class Window>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #35  <Method void onGetChildren(Window, Accumulator)>
	//    5    9:return          
	}
}
