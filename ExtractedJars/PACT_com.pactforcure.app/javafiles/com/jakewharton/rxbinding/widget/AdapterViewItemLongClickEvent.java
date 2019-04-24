// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class AdapterViewItemLongClickEvent extends ViewEvent
{

	private AdapterViewItemLongClickEvent(AdapterView adapterview, View view, int i, long l)
	{
		super(((View) (adapterview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void ViewEvent(View)>
		clickedView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field View clickedView>
		position = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #21  <Field int position>
		id = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #23  <Field long id>
	//   12   21:return          
	}

	public static AdapterViewItemLongClickEvent create(AdapterView adapterview, View view, int i, long l)
	{
		return new AdapterViewItemLongClickEvent(adapterview, view, i, l);
	//    0    0:new             #2   <Class AdapterViewItemLongClickEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:lload_3         
	//    6    8:invokespecial   #32  <Method void AdapterViewItemLongClickEvent(AdapterView, View, int, long)>
	//    7   11:areturn         
	}

	public View clickedView()
	{
		return clickedView;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View clickedView>
	//    2    4:areturn         
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
			if(!(obj instanceof AdapterViewItemLongClickEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdapterViewItemLongClickEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((AdapterViewItemLongClickEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdapterViewItemLongClickEvent>
	//   12   20:astore_1        
			if(((AdapterViewItemLongClickEvent) (obj)).view() != view() || ((AdapterViewItemLongClickEvent) (obj)).clickedView != clickedView || ((AdapterViewItemLongClickEvent) (obj)).position != position || ((AdapterViewItemLongClickEvent) (obj)).id != id)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #40  <Method View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #40  <Method View view()>
	//*  17   29:if_acmpne       66
	//*  18   32:aload_1         
	//*  19   33:getfield        #19  <Field View clickedView>
	//*  20   36:aload_0         
	//*  21   37:getfield        #19  <Field View clickedView>
	//*  22   40:if_acmpne       66
	//*  23   43:aload_1         
	//*  24   44:getfield        #21  <Field int position>
	//*  25   47:aload_0         
	//*  26   48:getfield        #21  <Field int position>
	//*  27   51:icmpne          66
	//*  28   54:aload_1         
	//*  29   55:getfield        #23  <Field long id>
	//*  30   58:aload_0         
	//*  31   59:getfield        #23  <Field long id>
	//*  32   62:lcmp            
	//*  33   63:ifeq            5
				return false;
	//   34   66:iconst_0        
	//   35   67:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return (((((Object) ((AdapterView)view())).hashCode() + 629) * 37 + ((Object) (clickedView)).hashCode()) * 37 + position) * 37 + (int)(id ^ id >>> 32);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method View view()>
	//    2    4:checkcast       #44  <Class AdapterView>
	//    3    7:invokevirtual   #48  <Method int Object.hashCode()>
	//    4   10:sipush          629
	//    5   13:iadd            
	//    6   14:bipush          37
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field View clickedView>
	//   10   21:invokevirtual   #48  <Method int Object.hashCode()>
	//   11   24:iadd            
	//   12   25:bipush          37
	//   13   27:imul            
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field int position>
	//   16   32:iadd            
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:aload_0         
	//   20   37:getfield        #23  <Field long id>
	//   21   40:aload_0         
	//   22   41:getfield        #23  <Field long id>
	//   23   44:bipush          32
	//   24   46:lushr           
	//   25   47:lxor            
	//   26   48:l2i             
	//   27   49:iadd            
	//   28   50:ireturn         
	}

	public long id()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long id>
	//    2    4:lreturn         
	}

	public int position()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int position>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("AdapterViewItemLongClickEvent{view=").append(((Object) (view()))).append(", clickedView=").append(((Object) (clickedView))).append(", position=").append(position).append(", id=").append(id).append('}').toString();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void StringBuilder()>
	//    3    7:ldc1            #58  <String "AdapterViewItemLongClickEvent{view=">
	//    4    9:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #40  <Method View view()>
	//    7   16:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #67  <String ", clickedView=">
	//    9   21:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field View clickedView>
	//   12   28:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #69  <String ", position=">
	//   14   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #21  <Field int position>
	//   17   40:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #74  <String ", id=">
	//   19   45:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #23  <Field long id>
	//   22   52:invokevirtual   #77  <Method StringBuilder StringBuilder.append(long)>
	//   23   55:bipush          125
	//   24   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//   25   60:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	private final View clickedView;
	private final long id;
	private final int position;
}
