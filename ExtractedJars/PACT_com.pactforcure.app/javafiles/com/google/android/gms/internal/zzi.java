// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Map;

public class zzi
{

	public zzi(int i, byte abyte0[], Map map, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int statusCode>
		data = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field byte[] data>
		zzy = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Map zzy>
		zzz = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field boolean zzz>
		zzA = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #30  <Field long zzA>
	//   17   31:return          
	}

	public zzi(byte abyte0[], Map map)
	{
		this(200, abyte0, map, false, 0L);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:lconst_0        
	//    6    8:invokespecial   #36  <Method void zzi(int, byte[], Map, boolean, long)>
	//    7   11:return          
	}

	public final byte data[];
	public final int statusCode;
	public final long zzA;
	public final Map zzy;
	public final boolean zzz;
}
