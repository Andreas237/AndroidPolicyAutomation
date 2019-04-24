// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.TextView;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class TextViewTextChangeEvent extends ViewEvent
{

	private TextViewTextChangeEvent(TextView textview, CharSequence charsequence, int i, int j, int k)
	{
		super(((android.view.View) (textview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void ViewEvent(android.view.View)>
		text = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field CharSequence text>
		start = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #21  <Field int start>
		before = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #23  <Field int before>
		count = k;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #25  <Field int count>
	//   15   27:return          
	}

	public static TextViewTextChangeEvent create(TextView textview, CharSequence charsequence, int i, int j, int k)
	{
		return new TextViewTextChangeEvent(textview, charsequence, i, j, k);
	//    0    0:new             #2   <Class TextViewTextChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #32  <Method void TextViewTextChangeEvent(TextView, CharSequence, int, int, int)>
	//    8   13:areturn         
	}

	public int before()
	{
		return before;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int before>
	//    2    4:ireturn         
	}

	public int count()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int count>
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
			if(!(obj instanceof TextViewTextChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class TextViewTextChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((TextViewTextChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class TextViewTextChangeEvent>
	//   12   20:astore_1        
			if(((TextViewTextChangeEvent) (obj)).view() != view() || !((Object) (text)).equals(((Object) (((TextViewTextChangeEvent) (obj)).text))) || start != ((TextViewTextChangeEvent) (obj)).start || before != ((TextViewTextChangeEvent) (obj)).before || count != ((TextViewTextChangeEvent) (obj)).count)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #40  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #40  <Method android.view.View view()>
	//*  17   29:if_acmpne       79
	//*  18   32:aload_0         
	//*  19   33:getfield        #19  <Field CharSequence text>
	//*  20   36:aload_1         
	//*  21   37:getfield        #19  <Field CharSequence text>
	//*  22   40:invokevirtual   #44  <Method boolean Object.equals(Object)>
	//*  23   43:ifeq            79
	//*  24   46:aload_0         
	//*  25   47:getfield        #21  <Field int start>
	//*  26   50:aload_1         
	//*  27   51:getfield        #21  <Field int start>
	//*  28   54:icmpne          79
	//*  29   57:aload_0         
	//*  30   58:getfield        #23  <Field int before>
	//*  31   61:aload_1         
	//*  32   62:getfield        #23  <Field int before>
	//*  33   65:icmpne          79
	//*  34   68:aload_0         
	//*  35   69:getfield        #25  <Field int count>
	//*  36   72:aload_1         
	//*  37   73:getfield        #25  <Field int count>
	//*  38   76:icmpeq          5
				return false;
	//   39   79:iconst_0        
	//   40   80:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return ((((((Object) ((TextView)view())).hashCode() + 629) * 37 + ((Object) (text)).hashCode()) * 37 + start) * 37 + before) * 37 + count;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method android.view.View view()>
	//    2    4:checkcast       #47  <Class TextView>
	//    3    7:invokevirtual   #49  <Method int Object.hashCode()>
	//    4   10:sipush          629
	//    5   13:iadd            
	//    6   14:bipush          37
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field CharSequence text>
	//   10   21:invokevirtual   #49  <Method int Object.hashCode()>
	//   11   24:iadd            
	//   12   25:bipush          37
	//   13   27:imul            
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field int start>
	//   16   32:iadd            
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:aload_0         
	//   20   37:getfield        #23  <Field int before>
	//   21   40:iadd            
	//   22   41:bipush          37
	//   23   43:imul            
	//   24   44:aload_0         
	//   25   45:getfield        #25  <Field int count>
	//   26   48:iadd            
	//   27   49:ireturn         
	}

	public int start()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int start>
	//    2    4:ireturn         
	}

	public CharSequence text()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CharSequence text>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("TextViewTextChangeEvent{text=").append(((Object) (text))).append(", start=").append(start).append(", before=").append(before).append(", count=").append(count).append(", view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuilder()>
	//    3    7:ldc1            #59  <String "TextViewTextChangeEvent{text=">
	//    4    9:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field CharSequence text>
	//    7   16:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #68  <String ", start=">
	//    9   21:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field int start>
	//   12   28:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #73  <String ", before=">
	//   14   33:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #23  <Field int before>
	//   17   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #75  <String ", count=">
	//   19   45:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #25  <Field int count>
	//   22   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #77  <String ", view=">
	//   24   57:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:invokevirtual   #40  <Method android.view.View view()>
	//   27   64:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   28   67:bipush          125
	//   29   69:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//   30   72:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   31   75:areturn         
	}

	private final int before;
	private final int count;
	private final int start;
	private final CharSequence text;
}
