// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SeekBarChangeEvent

public final class SeekBarStartChangeEvent extends SeekBarChangeEvent
{

	private SeekBarStartChangeEvent(SeekBar seekbar)
	{
		super(seekbar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void SeekBarChangeEvent(SeekBar)>
	//    3    5:return          
	}

	public static SeekBarStartChangeEvent create(SeekBar seekbar)
	{
		return new SeekBarStartChangeEvent(seekbar);
	//    0    0:new             #2   <Class SeekBarStartChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #15  <Method void SeekBarStartChangeEvent(SeekBar)>
	//    4    8:areturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof SeekBarStartChangeEvent) && ((SeekBarStartChangeEvent)obj).view() == view();
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SeekBarStartChangeEvent>
	//    2    4:ifeq            23
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SeekBarStartChangeEvent>
	//    5   11:invokevirtual   #22  <Method android.view.View view()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #22  <Method android.view.View view()>
	//    8   18:if_acmpne       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int hashCode()
	{
		return ((Object) ((SeekBar)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.view.View view()>
	//    2    4:checkcast       #26  <Class SeekBar>
	//    3    7:invokevirtual   #30  <Method int Object.hashCode()>
	//    4   10:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("SeekBarStartChangeEvent{view=").append(((Object) (view()))).append('}').toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:ldc1            #39  <String "SeekBarStartChangeEvent{view=">
	//    4    9:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #22  <Method android.view.View view()>
	//    7   16:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}
}
