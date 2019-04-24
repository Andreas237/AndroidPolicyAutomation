// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;


public final class TrackKey
{

	public TrackKey(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		periodIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int periodIndex>
		groupIndex = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int groupIndex>
		trackIndex = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #19  <Field int trackIndex>
	//   11   19:return          
	}

	public final int groupIndex;
	public final int periodIndex;
	public final int trackIndex;
}
