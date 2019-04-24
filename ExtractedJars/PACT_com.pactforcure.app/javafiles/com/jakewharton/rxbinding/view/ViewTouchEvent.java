// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewEvent

public final class ViewTouchEvent extends ViewEvent
{

	private ViewTouchEvent(View view, MotionEvent motionevent)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ViewEvent(View)>
		motionEvent = motionevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field MotionEvent motionEvent>
	//    6   10:return          
	}

	public static ViewTouchEvent create(View view, MotionEvent motionevent)
	{
		return new ViewTouchEvent(view, motionevent);
	//    0    0:new             #2   <Class ViewTouchEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #22  <Method void ViewTouchEvent(View, MotionEvent)>
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof ViewTouchEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ViewTouchEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((ViewTouchEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ViewTouchEvent>
	//   12   20:astore_1        
			if(((ViewTouchEvent) (obj)).view() != view() || !((Object) (((ViewTouchEvent) (obj)).motionEvent)).equals(((Object) (motionEvent))))
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #29  <Method View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #29  <Method View view()>
	//*  17   29:if_acmpne       46
	//*  18   32:aload_1         
	//*  19   33:getfield        #15  <Field MotionEvent motionEvent>
	//*  20   36:aload_0         
	//*  21   37:getfield        #15  <Field MotionEvent motionEvent>
	//*  22   40:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//*  23   43:ifne            5
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return (((Object) (view())).hashCode() + 629) * 37 + ((Object) (motionEvent)).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method View view()>
	//    2    4:invokevirtual   #37  <Method int Object.hashCode()>
	//    3    7:sipush          629
	//    4   10:iadd            
	//    5   11:bipush          37
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #15  <Field MotionEvent motionEvent>
	//    9   18:invokevirtual   #37  <Method int Object.hashCode()>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	public MotionEvent motionEvent()
	{
		return motionEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MotionEvent motionEvent>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ViewTouchEvent{view=").append(((Object) (view()))).append(", motionEvent=").append(((Object) (motionEvent))).append('}').toString();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:ldc1            #47  <String "ViewTouchEvent{view=">
	//    4    9:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #29  <Method View view()>
	//    7   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #56  <String ", motionEvent=">
	//    9   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #15  <Field MotionEvent motionEvent>
	//   12   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private final MotionEvent motionEvent;
}
