// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.AdapterView;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewSelectionEvent

public final class AdapterViewNothingSelectionEvent extends AdapterViewSelectionEvent
{

	private AdapterViewNothingSelectionEvent(AdapterView adapterview)
	{
		super(adapterview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void AdapterViewSelectionEvent(AdapterView)>
	//    3    5:return          
	}

	public static AdapterViewSelectionEvent create(AdapterView adapterview)
	{
		return ((AdapterViewSelectionEvent) (new AdapterViewNothingSelectionEvent(adapterview)));
	//    0    0:new             #2   <Class AdapterViewNothingSelectionEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #17  <Method void AdapterViewNothingSelectionEvent(AdapterView)>
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
			if(!(obj instanceof AdapterViewNothingSelectionEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdapterViewNothingSelectionEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			if(((AdapterViewNothingSelectionEvent)obj).view() != view())
	//*  10   16:aload_1         
	//*  11   17:checkcast       #2   <Class AdapterViewNothingSelectionEvent>
	//*  12   20:invokevirtual   #25  <Method android.view.View view()>
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #25  <Method android.view.View view()>
	//*  15   27:if_acmpeq       5
				return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return ((Object) ((AdapterView)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method android.view.View view()>
	//    2    4:checkcast       #29  <Class AdapterView>
	//    3    7:invokevirtual   #33  <Method int Object.hashCode()>
	//    4   10:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("AdapterViewNothingSelectionEvent{view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:ldc1            #42  <String "AdapterViewNothingSelectionEvent{view=">
	//    4    9:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #25  <Method android.view.View view()>
	//    7   16:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}
}
