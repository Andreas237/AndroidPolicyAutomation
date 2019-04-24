// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.auth;


// Referenced classes of package com.amazonaws.auth:
//			AWS4Signer

protected static class AWS4Signer$HeaderSigningResult
{

	public byte[] a()
	{
		byte abyte0[] = new byte[d.length];
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field byte[] d>
	//    2    4:arraylength     
	//    3    5:newarray        byte[]
	//    4    7:astore_1        
		System.arraycopy(((Object) (d)), 0, ((Object) (abyte0)), 0, d.length);
	//    5    8:aload_0         
	//    6    9:getfield        #26  <Field byte[] d>
	//    7   12:iconst_0        
	//    8   13:aload_1         
	//    9   14:iconst_0        
	//   10   15:aload_0         
	//   11   16:getfield        #26  <Field byte[] d>
	//   12   19:arraylength     
	//   13   20:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   14   23:aload_1         
	//   15   24:areturn         
	}

	private final String a;
	private final String b;
	private final byte c[];
	private final byte d[];

	public AWS4Signer$HeaderSigningResult(String s, String s1, byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String b>
		c = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field byte[] c>
		d = abyte1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field byte[] d>
	//   14   25:return          
	}
}
