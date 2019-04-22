// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


public class BinaryImageData
{

	public BinaryImageData(long l, long l1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		baseAddress = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long baseAddress>
		size = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long size>
		path = s;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #21  <Field String path>
		id = s1;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #23  <Field String id>
	//   14   26:return          
	}

	public final long baseAddress;
	public final String id;
	public final String path;
	public final long size;
}
