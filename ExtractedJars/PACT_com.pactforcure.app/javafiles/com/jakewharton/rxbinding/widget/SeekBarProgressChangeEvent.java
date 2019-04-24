// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SeekBarChangeEvent

public final class SeekBarProgressChangeEvent extends SeekBarChangeEvent
{

	private SeekBarProgressChangeEvent(SeekBar seekbar, int i, boolean flag)
	{
		super(seekbar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void SeekBarChangeEvent(SeekBar)>
		progress = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int progress>
		fromUser = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #18  <Field boolean fromUser>
	//    9   15:return          
	}

	public static SeekBarProgressChangeEvent create(SeekBar seekbar, int i, boolean flag)
	{
		return new SeekBarProgressChangeEvent(seekbar, i, flag);
	//    0    0:new             #2   <Class SeekBarProgressChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #25  <Method void SeekBarProgressChangeEvent(SeekBar, int, boolean)>
	//    6   10:areturn         
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
			if(!(obj instanceof SeekBarProgressChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class SeekBarProgressChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((SeekBarProgressChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class SeekBarProgressChangeEvent>
	//   12   20:astore_1        
			if(((SeekBarProgressChangeEvent) (obj)).view() != view() || ((SeekBarProgressChangeEvent) (obj)).progress != progress || ((SeekBarProgressChangeEvent) (obj)).fromUser != fromUser)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #32  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #32  <Method android.view.View view()>
	//*  17   29:if_acmpne       54
	//*  18   32:aload_1         
	//*  19   33:getfield        #16  <Field int progress>
	//*  20   36:aload_0         
	//*  21   37:getfield        #16  <Field int progress>
	//*  22   40:icmpne          54
	//*  23   43:aload_1         
	//*  24   44:getfield        #18  <Field boolean fromUser>
	//*  25   47:aload_0         
	//*  26   48:getfield        #18  <Field boolean fromUser>
	//*  27   51:icmpeq          5
				return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return true;
	}

	public boolean fromUser()
	{
		return fromUser;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean fromUser>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int j = ((Object) ((SeekBar)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method android.view.View view()>
	//    2    4:checkcast       #37  <Class SeekBar>
	//    3    7:invokevirtual   #41  <Method int Object.hashCode()>
	//    4   10:istore_2        
		int k = progress;
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field int progress>
	//    7   15:istore_3        
		int i;
		if(fromUser)
	//*   8   16:aload_0         
	//*   9   17:getfield        #18  <Field boolean fromUser>
	//*  10   20:ifeq            41
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:iload_2         
	//*  14   26:sipush          629
	//*  15   29:iadd            
	//*  16   30:bipush          37
	//*  17   32:imul            
	//*  18   33:iload_3         
	//*  19   34:iadd            
	//*  20   35:bipush          37
	//*  21   37:imul            
	//*  22   38:iload_1         
	//*  23   39:iadd            
	//*  24   40:ireturn         
			i = 0;
	//   25   41:iconst_0        
	//   26   42:istore_1        
		return ((j + 629) * 37 + k) * 37 + i;
	//*  27   43:goto            25
	}

	public int progress()
	{
		return progress;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int progress>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("SeekBarProgressChangeEvent{view=").append(((Object) (view()))).append(", progress=").append(progress).append(", fromUser=").append(fromUser).append('}').toString();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:ldc1            #50  <String "SeekBarProgressChangeEvent{view=">
	//    4    9:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method android.view.View view()>
	//    7   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #59  <String ", progress=">
	//    9   21:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field int progress>
	//   12   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #64  <String ", fromUser=">
	//   14   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #18  <Field boolean fromUser>
	//   17   40:invokevirtual   #67  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private final boolean fromUser;
	private final int progress;
}
