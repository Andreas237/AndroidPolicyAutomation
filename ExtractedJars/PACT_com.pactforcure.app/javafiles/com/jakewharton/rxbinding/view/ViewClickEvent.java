// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewEvent

public final class ViewClickEvent extends ViewEvent
{

	private ViewClickEvent(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ViewEvent(View)>
	//    3    5:return          
	}

	public static ViewClickEvent create(View view)
	{
		return new ViewClickEvent(view);
	//    0    0:new             #2   <Class ViewClickEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #16  <Method void ViewClickEvent(View)>
	//    4    8:areturn         
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
			if(!(obj instanceof ViewClickEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ViewClickEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			if(((ViewClickEvent)obj).view() != view())
	//*  10   16:aload_1         
	//*  11   17:checkcast       #2   <Class ViewClickEvent>
	//*  12   20:invokevirtual   #23  <Method View view()>
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #23  <Method View view()>
	//*  15   27:if_acmpeq       5
				return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return ((Object) (view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method View view()>
	//    2    4:invokevirtual   #29  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ViewClickEvent{view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:ldc1            #38  <String "ViewClickEvent{view=">
	//    4    9:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #23  <Method View view()>
	//    7   16:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}
}
