// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			apw, aor, apv

public final class aos extends apw
{

	public aos(byte abyte0[])
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void apw(byte[])>
	//    3    5:return          
	}

	final apv a(byte abyte0[], int i)
	{
		return ((apv) (new aor(abyte0, i)));
	//    0    0:new             #13  <Class aor>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #16  <Method void aor(byte[], int)>
	//    5    9:areturn         
	}

	public final volatile byte[] a(byte abyte0[], byte abyte1[])
	{
		return super.a(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method byte[] apw.a(byte[], byte[])>
	//    4    6:areturn         
	}
}
