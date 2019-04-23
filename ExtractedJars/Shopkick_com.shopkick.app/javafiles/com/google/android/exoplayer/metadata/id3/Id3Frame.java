// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


public abstract class Id3Frame
{

	public Id3Frame(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String id>
	//    5    9:return          
	}

	public final String id;
}
