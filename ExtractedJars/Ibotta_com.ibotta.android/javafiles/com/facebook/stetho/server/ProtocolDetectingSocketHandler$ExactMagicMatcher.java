// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.facebook.stetho.server:
//			ProtocolDetectingSocketHandler

public static class ProtocolDetectingSocketHandler$ExactMagicMatcher
	implements ProtocolDetectingSocketHandler.MagicMatcher
{

	public boolean matches(InputStream inputstream)
		throws IOException
	{
		byte abyte0[] = new byte[mMagic.length];
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field byte[] mMagic>
	//    2    4:arraylength     
	//    3    5:newarray        byte[]
	//    4    7:astore_2        
		return inputstream.read(abyte0) == abyte0.length && Arrays.equals(abyte0, mMagic);
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokevirtual   #29  <Method int InputStream.read(byte[])>
	//    8   13:aload_2         
	//    9   14:arraylength     
	//   10   15:icmpne          31
	//   11   18:aload_2         
	//   12   19:aload_0         
	//   13   20:getfield        #18  <Field byte[] mMagic>
	//   14   23:invokestatic    #35  <Method boolean Arrays.equals(byte[], byte[])>
	//   15   26:ifeq            31
	//   16   29:iconst_1        
	//   17   30:ireturn         
	//   18   31:iconst_0        
	//   19   32:ireturn         
	}

	private final byte mMagic[];

	public ProtocolDetectingSocketHandler$ExactMagicMatcher(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mMagic = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field byte[] mMagic>
	//    5    9:return          
	}
}
