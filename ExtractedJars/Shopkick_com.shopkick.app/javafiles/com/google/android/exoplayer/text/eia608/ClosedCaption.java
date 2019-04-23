// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;


abstract class ClosedCaption
{

	protected ClosedCaption(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int type>
	//    5    9:return          
	}

	public static final int TYPE_CTRL = 0;
	public static final int TYPE_TEXT = 1;
	public final int type;
}
