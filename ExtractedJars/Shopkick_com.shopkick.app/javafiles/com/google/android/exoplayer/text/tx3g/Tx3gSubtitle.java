// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.tx3g;

import com.google.android.exoplayer.text.Cue;
import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.util.Assertions;
import java.util.Collections;
import java.util.List;

final class Tx3gSubtitle
	implements Subtitle
{

	private Tx3gSubtitle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		cues = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #26  <Method List Collections.emptyList()>
	//    4    8:putfield        #28  <Field List cues>
	//    5   11:return          
	}

	public Tx3gSubtitle(Cue cue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		cues = Collections.singletonList(((Object) (cue)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method List Collections.singletonList(Object)>
	//    5    9:putfield        #28  <Field List cues>
	//    6   12:return          
	}

	public List getCues(long l)
	{
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            11
			return cues;
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field List cues>
	//    6   10:areturn         
		else
			return Collections.emptyList();
	//    7   11:invokestatic    #26  <Method List Collections.emptyList()>
	//    8   14:areturn         
	}

	public long getEventTime(int i)
	{
		boolean flag;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Assertions.checkArgument(flag);
	//    7   11:iload_2         
	//    8   12:invokestatic    #45  <Method void Assertions.checkArgument(boolean)>
		return 0L;
	//    9   15:lconst_0        
	//   10   16:lreturn         
	}

	public int getEventTimeCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long getLastEventTime()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		return l >= 0L ? -1 : 0;
	//    0    0:lload_1         
	//    1    1:lconst_0        
	//    2    2:lcmp            
	//    3    3:ifge            8
	//    4    6:iconst_0        
	//    5    7:ireturn         
	//    6    8:iconst_m1       
	//    7    9:ireturn         
	}

	public static final Tx3gSubtitle EMPTY = new Tx3gSubtitle();
	private final List cues;

	static 
	{
	//    0    0:new             #2   <Class Tx3gSubtitle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Tx3gSubtitle()>
	//    3    7:putstatic       #18  <Field Tx3gSubtitle EMPTY>
	//*   4   10:return          
	}
}
