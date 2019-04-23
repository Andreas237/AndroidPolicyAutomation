// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			apo

public final class aoz
{

	public aoz(byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = apo.a(abyte0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method apo apo.a(byte[])>
	//    5    9:putfield        #19  <Field apo a>
		b = apo.a(abyte1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #17  <Method apo apo.a(byte[])>
	//    9   17:putfield        #21  <Field apo b>
	//   10   20:return          
	}

	public final byte[] a()
	{
		apo apo1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field apo a>
	//    2    4:astore_1        
		if(apo1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return apo1.a();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #25  <Method byte[] apo.a()>
	//    9   15:areturn         
	}

	public final byte[] b()
	{
		apo apo1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field apo b>
	//    2    4:astore_1        
		if(apo1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return apo1.a();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #25  <Method byte[] apo.a()>
	//    9   15:areturn         
	}

	private final apo a;
	private final apo b;
}
