// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class RadioGroupCheckedChangeEvent extends ViewEvent
{

	private RadioGroupCheckedChangeEvent(RadioGroup radiogroup, int i)
	{
		super(((android.view.View) (radiogroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ViewEvent(android.view.View)>
		checkedId = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #15  <Field int checkedId>
	//    6   10:return          
	}

	public static RadioGroupCheckedChangeEvent create(RadioGroup radiogroup, int i)
	{
		return new RadioGroupCheckedChangeEvent(radiogroup, i);
	//    0    0:new             #2   <Class RadioGroupCheckedChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #23  <Method void RadioGroupCheckedChangeEvent(RadioGroup, int)>
	//    5    9:areturn         
	}

	public int checkedId()
	{
		return checkedId;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int checkedId>
	//    2    4:ireturn         
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
			if(!(obj instanceof RadioGroupCheckedChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class RadioGroupCheckedChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((RadioGroupCheckedChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class RadioGroupCheckedChangeEvent>
	//   12   20:astore_1        
			if(((RadioGroupCheckedChangeEvent) (obj)).view() != view() || ((RadioGroupCheckedChangeEvent) (obj)).checkedId != checkedId)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #31  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #31  <Method android.view.View view()>
	//*  17   29:if_acmpne       43
	//*  18   32:aload_1         
	//*  19   33:getfield        #15  <Field int checkedId>
	//*  20   36:aload_0         
	//*  21   37:getfield        #15  <Field int checkedId>
	//*  22   40:icmpeq          5
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return (((Object) ((RadioGroup)view())).hashCode() + 629) * 37 + checkedId;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method android.view.View view()>
	//    2    4:checkcast       #34  <Class RadioGroup>
	//    3    7:invokevirtual   #38  <Method int Object.hashCode()>
	//    4   10:sipush          629
	//    5   13:iadd            
	//    6   14:bipush          37
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #15  <Field int checkedId>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("RadioGroupCheckedChangeEvent{view=").append(((Object) (view()))).append(", checkedId=").append(checkedId).append('}').toString();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:ldc1            #47  <String "RadioGroupCheckedChangeEvent{view=">
	//    4    9:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #31  <Method android.view.View view()>
	//    7   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #56  <String ", checkedId=">
	//    9   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #15  <Field int checkedId>
	//   12   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private final int checkedId;
}
