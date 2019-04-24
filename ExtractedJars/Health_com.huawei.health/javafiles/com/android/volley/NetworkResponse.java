// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

public class NetworkResponse
{

	public NetworkResponse(int i, byte abyte0[], Map map, boolean flag)
	{
		this(i, abyte0, map, flag, 0L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:lconst_0        
	//    6    7:invokespecial   #20  <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//    7   10:return          
	}

	public NetworkResponse(int i, byte abyte0[], Map map, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int statusCode>
		data = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field byte[] data>
		headers = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field Map headers>
		notModified = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field boolean notModified>
		networkTimeMs = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #36  <Field long networkTimeMs>
	//   17   31:return          
	}

	public NetworkResponse(byte abyte0[])
	{
		this(200, abyte0, Collections.emptyMap(), false, 0L);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:aload_1         
	//    3    5:invokestatic    #44  <Method Map Collections.emptyMap()>
	//    4    8:iconst_0        
	//    5    9:lconst_0        
	//    6   10:invokespecial   #20  <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//    7   13:return          
	}

	public NetworkResponse(byte abyte0[], Map map)
	{
		this(200, abyte0, map, false, 0L);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:lconst_0        
	//    6    8:invokespecial   #20  <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//    7   11:return          
	}

	public final byte data[];
	public final Map headers;
	public final long networkTimeMs;
	public final boolean notModified;
	public final int statusCode;
}
