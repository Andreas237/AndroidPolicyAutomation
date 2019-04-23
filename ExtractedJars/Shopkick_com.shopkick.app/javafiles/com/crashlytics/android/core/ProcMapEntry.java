// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


class ProcMapEntry
{

	public ProcMapEntry(long l, long l1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		address = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long address>
		size = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long size>
		perms = s;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #21  <Field String perms>
		path = s1;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #23  <Field String path>
	//   14   26:return          
	}

	public final long address;
	public final String path;
	public final String perms;
	public final long size;
}
