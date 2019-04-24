// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;


public class OnPpdEndMessage
{

	public OnPpdEndMessage(boolean flag, int i, boolean flag1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		suicidality = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field boolean suicidality>
		score = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int score>
		currentSymptoms = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field boolean currentSymptoms>
		worstEpisode = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field String worstEpisode>
	//   14   25:return          
	}

	public final boolean currentSymptoms;
	public final int score;
	public final boolean suicidality;
	public final String worstEpisode;
}
