// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.b.a.a;

import com.d.a.a.a;
import java.nio.ByteBuffer;

// Referenced classes of package com.b.a.a:
//			v

final class ai extends v
{

	ai(String s, int i)
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
		return ((String)obj).getBytes(a.c).length + 1;
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class String>
	//    2    4:getstatic       #21  <Field java.nio.charset.Charset a.c>
	//    3    7:invokevirtual   #25  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    4   10:arraylength     
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	public void b(ByteBuffer bytebuffer, Object obj)
	{
		bytebuffer.put(((String)obj).getBytes(a.c)).put((byte)0);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #15  <Class String>
	//    3    5:getstatic       #21  <Field java.nio.charset.Charset a.c>
	//    4    8:invokevirtual   #25  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    5   11:invokevirtual   #34  <Method ByteBuffer ByteBuffer.put(byte[])>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #37  <Method ByteBuffer ByteBuffer.put(byte)>
	//    8   18:pop             
	//    9   19:return          
	}
}
