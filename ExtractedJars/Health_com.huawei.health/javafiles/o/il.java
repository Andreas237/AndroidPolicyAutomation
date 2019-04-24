// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.Serializable;

final class il
	implements Serializable
{

	il()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = new byte[16];
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:newarray        byte[]
	//    5    9:putfield        #17  <Field byte[] b>
		c = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #19  <Field short c>
		d = new byte[32];
	//    9   17:aload_0         
	//   10   18:bipush          32
	//   11   20:newarray        byte[]
	//   12   22:putfield        #21  <Field byte[] d>
	//   13   25:return          
	}

	protected byte b[];
	protected short c;
	protected byte d[];
}
