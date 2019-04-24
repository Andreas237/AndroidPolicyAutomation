// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class CompoundButtonCheckedChangeEvent extends ViewEvent
{

	private CompoundButtonCheckedChangeEvent(CompoundButton compoundbutton, boolean flag)
	{
		super(((android.view.View) (compoundbutton)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ViewEvent(android.view.View)>
		isChecked = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #15  <Field boolean isChecked>
	//    6   10:return          
	}

	public static CompoundButtonCheckedChangeEvent create(CompoundButton compoundbutton, boolean flag)
	{
		return new CompoundButtonCheckedChangeEvent(compoundbutton, flag);
	//    0    0:new             #2   <Class CompoundButtonCheckedChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #22  <Method void CompoundButtonCheckedChangeEvent(CompoundButton, boolean)>
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
			if(!(obj instanceof CompoundButtonCheckedChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class CompoundButtonCheckedChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((CompoundButtonCheckedChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class CompoundButtonCheckedChangeEvent>
	//   12   20:astore_1        
			if(((CompoundButtonCheckedChangeEvent) (obj)).view() != view() || isChecked != ((CompoundButtonCheckedChangeEvent) (obj)).isChecked)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #29  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #29  <Method android.view.View view()>
	//*  17   29:if_acmpne       43
	//*  18   32:aload_0         
	//*  19   33:getfield        #15  <Field boolean isChecked>
	//*  20   36:aload_1         
	//*  21   37:getfield        #15  <Field boolean isChecked>
	//*  22   40:icmpeq          5
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		int j = ((Object) ((CompoundButton)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method android.view.View view()>
	//    2    4:checkcast       #33  <Class CompoundButton>
	//    3    7:invokevirtual   #37  <Method int Object.hashCode()>
	//    4   10:istore_2        
		int i;
		if(isChecked)
	//*   5   11:aload_0         
	//*   6   12:getfield        #15  <Field boolean isChecked>
	//*   7   15:ifeq            31
			i = 1;
	//    8   18:iconst_1        
	//    9   19:istore_1        
		else
	//*  10   20:iload_2         
	//*  11   21:sipush          629
	//*  12   24:iadd            
	//*  13   25:bipush          37
	//*  14   27:imul            
	//*  15   28:iload_1         
	//*  16   29:iadd            
	//*  17   30:ireturn         
			i = 0;
	//   18   31:iconst_0        
	//   19   32:istore_1        
		return (j + 629) * 37 + i;
	//*  20   33:goto            20
	}

	public boolean isChecked()
	{
		return isChecked;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field boolean isChecked>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("CompoundButtonCheckedChangeEvent{isChecked=").append(isChecked).append(", view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:ldc1            #47  <String "CompoundButtonCheckedChangeEvent{isChecked=">
	//    4    9:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #15  <Field boolean isChecked>
	//    7   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(boolean)>
	//    8   19:ldc1            #56  <String ", view=">
	//    9   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #29  <Method android.view.View view()>
	//   12   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private final boolean isChecked;
}
