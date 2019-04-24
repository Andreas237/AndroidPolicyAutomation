// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Cue;

final class Cea708Cue extends Cue
	implements Comparable
{

	public Cea708Cue(CharSequence charsequence, android.text.Layout.Alignment alignment, float f, int i, int j, float f1, int k, 
			float f2, boolean flag, int l, int i1)
	{
		super(charsequence, alignment, f, i, j, f1, k, f2, flag, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:fload           6
	//    7   10:iload           7
	//    8   12:fload           8
	//    9   14:iload           9
	//   10   16:iload           10
	//   11   18:invokespecial   #16  <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float, boolean, int)>
		priority = i1;
	//   12   21:aload_0         
	//   13   22:iload           11
	//   14   24:putfield        #18  <Field int priority>
	//   15   27:return          
	}

	public int compareTo(Cea708Cue cea708cue)
	{
		if(cea708cue.priority < priority)
	//*   0    0:aload_1         
	//*   1    1:getfield        #18  <Field int priority>
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field int priority>
	//*   4    8:icmpge          13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		return cea708cue.priority <= priority ? 0 : 1;
	//    7   13:aload_1         
	//    8   14:getfield        #18  <Field int priority>
	//    9   17:aload_0         
	//   10   18:getfield        #18  <Field int priority>
	//   11   21:icmple          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Cea708Cue)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Cea708Cue>
	//    3    5:invokevirtual   #26  <Method int compareTo(Cea708Cue)>
	//    4    8:ireturn         
	}

	public static final int PRIORITY_UNSET = -1;
	public final int priority;
}
