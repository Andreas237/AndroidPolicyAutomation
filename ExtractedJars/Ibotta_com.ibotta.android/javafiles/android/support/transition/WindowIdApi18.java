// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.WindowId;

// Referenced classes of package android.support.transition:
//			WindowIdImpl

class WindowIdApi18
	implements WindowIdImpl
{

	WindowIdApi18(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mWindowId = view.getWindowId();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method WindowId View.getWindowId()>
	//    5    9:putfield        #25  <Field WindowId mWindowId>
	//    6   12:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof WindowIdApi18) && ((WindowIdApi18)obj).mWindowId.equals(((Object) (mWindowId)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class WindowIdApi18>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class WindowIdApi18>
	//    5   11:getfield        #25  <Field WindowId mWindowId>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field WindowId mWindowId>
	//    8   18:invokevirtual   #33  <Method boolean WindowId.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int hashCode()
	{
		return mWindowId.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WindowId mWindowId>
	//    2    4:invokevirtual   #37  <Method int WindowId.hashCode()>
	//    3    7:ireturn         
	}

	private final WindowId mWindowId;
}
