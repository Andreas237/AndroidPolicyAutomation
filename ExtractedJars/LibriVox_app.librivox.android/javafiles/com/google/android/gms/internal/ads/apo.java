// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class apo
{

	private apo(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = new byte[j];
	//    2    4:aload_0         
	//    3    5:iload_3         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #13  <Field byte[] a>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (a)), 0, j);
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #13  <Field byte[] a>
	//   10   17:iconst_0        
	//   11   18:iload_3         
	//   12   19:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   13   22:return          
	}

	public static apo a(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new apo(abyte0, 0, abyte0.length);
	//    4    6:new             #2   <Class apo>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokespecial   #23  <Method void apo(byte[], int, int)>
	//   11   17:areturn         
	}

	public final byte[] a()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] a>
	//    2    4:astore_1        
		byte abyte1[] = new byte[abyte0.length];
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:astore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//    7   10:aload_1         
	//    8   11:iconst_0        
	//    9   12:aload_2         
	//   10   13:iconst_0        
	//   11   14:aload_1         
	//   12   15:arraylength     
	//   13   16:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//   14   19:aload_2         
	//   15   20:areturn         
	}

	private final byte a[];
}
