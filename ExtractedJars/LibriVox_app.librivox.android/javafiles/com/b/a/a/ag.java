// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.b.a.a;

import java.nio.ByteBuffer;

// Referenced classes of package com.b.a.a:
//			v

final class ag extends v
{

	ag(String s, int i)
	{
		super(s, i, ((w) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #9   <Method void v(String, int, w)>
	//    5    7:return          
	}

	public int a(Object obj)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public void b(ByteBuffer bytebuffer, Object obj)
	{
		bytebuffer.putLong(((Long)obj).longValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #18  <Class Long>
	//    3    5:invokevirtual   #22  <Method long Long.longValue()>
	//    4    8:invokevirtual   #28  <Method ByteBuffer ByteBuffer.putLong(long)>
	//    5   11:pop             
	//    6   12:return          
	}
}
