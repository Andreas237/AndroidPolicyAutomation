// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewEvent

public final class ViewFocusChangeEvent extends ViewEvent
{

	private ViewFocusChangeEvent(View view, boolean flag)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ViewEvent(View)>
		hasFocus = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #15  <Field boolean hasFocus>
	//    6   10:return          
	}

	public static ViewFocusChangeEvent create(View view, boolean flag)
	{
		return new ViewFocusChangeEvent(view, flag);
	//    0    0:new             #2   <Class ViewFocusChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #22  <Method void ViewFocusChangeEvent(View, boolean)>
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
			if(!(obj instanceof ViewFocusChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ViewFocusChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((ViewFocusChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ViewFocusChangeEvent>
	//   12   20:astore_1        
			if(((ViewFocusChangeEvent) (obj)).view() != view() || ((ViewFocusChangeEvent) (obj)).hasFocus != hasFocus)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #29  <Method View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #29  <Method View view()>
	//*  17   29:if_acmpne       43
	//*  18   32:aload_1         
	//*  19   33:getfield        #15  <Field boolean hasFocus>
	//*  20   36:aload_0         
	//*  21   37:getfield        #15  <Field boolean hasFocus>
	//*  22   40:icmpeq          5
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		}
		return true;
	}

	public boolean hasFocus()
	{
		return hasFocus;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field boolean hasFocus>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int j = ((Object) (view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method View view()>
	//    2    4:invokevirtual   #36  <Method int Object.hashCode()>
	//    3    7:istore_2        
		int i;
		if(hasFocus)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field boolean hasFocus>
	//*   6   12:ifeq            28
			i = 1;
	//    7   15:iconst_1        
	//    8   16:istore_1        
		else
	//*   9   17:iload_2         
	//*  10   18:sipush          629
	//*  11   21:iadd            
	//*  12   22:bipush          37
	//*  13   24:imul            
	//*  14   25:iload_1         
	//*  15   26:iadd            
	//*  16   27:ireturn         
			i = 0;
	//   17   28:iconst_0        
	//   18   29:istore_1        
		return (j + 629) * 37 + i;
	//*  19   30:goto            17
	}

	public String toString()
	{
		return (new StringBuilder()).append("ViewFocusChangeEvent{hasFocus=").append(hasFocus).append(", view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:ldc1            #45  <String "ViewFocusChangeEvent{hasFocus=">
	//    4    9:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #15  <Field boolean hasFocus>
	//    7   16:invokevirtual   #52  <Method StringBuilder StringBuilder.append(boolean)>
	//    8   19:ldc1            #54  <String ", view=">
	//    9   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #29  <Method View view()>
	//   12   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #60  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private final boolean hasFocus;
}
