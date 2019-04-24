// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;


// Referenced classes of package com.bumptech.glide.util:
//			ByteBufferUtil

static final class ByteBufferUtil$SafeArray
{

	final byte data[];
	final int limit;
	final int offset;

	public ByteBufferUtil$SafeArray(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field byte[] data>
		offset = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int offset>
		limit = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int limit>
	//   11   19:return          
	}
}
