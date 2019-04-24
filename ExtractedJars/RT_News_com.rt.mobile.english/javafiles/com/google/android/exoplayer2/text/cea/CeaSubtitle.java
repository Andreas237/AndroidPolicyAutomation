// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

final class CeaSubtitle
	implements Subtitle
{

	public CeaSubtitle(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		cues = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List cues>
	//    5    9:return          
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
	//    5    7:getfield        #16  <Field List cues>
	//    6   10:areturn         
		else
			return Collections.emptyList();
	//    7   11:invokestatic    #27  <Method List Collections.emptyList()>
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
	//    8   12:invokestatic    #36  <Method void Assertions.checkArgument(boolean)>
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

	private final List cues;
}
