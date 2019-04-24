// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class TextViewEditorActionEvent extends ViewEvent
{

	private TextViewEditorActionEvent(TextView textview, int i, KeyEvent keyevent)
	{
		super(((android.view.View) (textview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ViewEvent(android.view.View)>
		actionId = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int actionId>
		keyEvent = keyevent;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field KeyEvent keyEvent>
	//    9   15:return          
	}

	public static TextViewEditorActionEvent create(TextView textview, int i, KeyEvent keyevent)
	{
		return new TextViewEditorActionEvent(textview, i, keyevent);
	//    0    0:new             #2   <Class TextViewEditorActionEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #26  <Method void TextViewEditorActionEvent(TextView, int, KeyEvent)>
	//    6   10:areturn         
	}

	public int actionId()
	{
		return actionId;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int actionId>
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
			if(!(obj instanceof TextViewEditorActionEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class TextViewEditorActionEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((TextViewEditorActionEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class TextViewEditorActionEvent>
	//   12   20:astore_1        
			if(((TextViewEditorActionEvent) (obj)).view() != view() || ((TextViewEditorActionEvent) (obj)).actionId != actionId || !((Object) (((TextViewEditorActionEvent) (obj)).keyEvent)).equals(((Object) (keyEvent))))
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #34  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #34  <Method android.view.View view()>
	//*  17   29:if_acmpne       57
	//*  18   32:aload_1         
	//*  19   33:getfield        #17  <Field int actionId>
	//*  20   36:aload_0         
	//*  21   37:getfield        #17  <Field int actionId>
	//*  22   40:icmpne          57
	//*  23   43:aload_1         
	//*  24   44:getfield        #19  <Field KeyEvent keyEvent>
	//*  25   47:aload_0         
	//*  26   48:getfield        #19  <Field KeyEvent keyEvent>
	//*  27   51:invokevirtual   #38  <Method boolean Object.equals(Object)>
	//*  28   54:ifne            5
				return false;
	//   29   57:iconst_0        
	//   30   58:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return ((((Object) ((TextView)view())).hashCode() + 629) * 37 + actionId) * 37 + ((Object) (keyEvent)).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method android.view.View view()>
	//    2    4:checkcast       #41  <Class TextView>
	//    3    7:invokevirtual   #43  <Method int Object.hashCode()>
	//    4   10:sipush          629
	//    5   13:iadd            
	//    6   14:bipush          37
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #17  <Field int actionId>
	//   10   21:iadd            
	//   11   22:bipush          37
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field KeyEvent keyEvent>
	//   15   29:invokevirtual   #43  <Method int Object.hashCode()>
	//   16   32:iadd            
	//   17   33:ireturn         
	}

	public KeyEvent keyEvent()
	{
		return keyEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field KeyEvent keyEvent>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("TextViewEditorActionEvent{view=").append(((Object) (view()))).append(", actionId=").append(actionId).append(", keyEvent=").append(((Object) (keyEvent))).append('}').toString();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:ldc1            #53  <String "TextViewEditorActionEvent{view=">
	//    4    9:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #34  <Method android.view.View view()>
	//    7   16:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #62  <String ", actionId=">
	//    9   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field int actionId>
	//   12   28:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #67  <String ", keyEvent=">
	//   14   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #19  <Field KeyEvent keyEvent>
	//   17   40:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private final int actionId;
	private final KeyEvent keyEvent;
}
