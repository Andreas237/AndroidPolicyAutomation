// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzazh
{

	private zzazh(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		data = new byte[j];
	//    2    4:aload_0         
	//    3    5:iload_3         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #13  <Field byte[] data>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (data)), 0, j);
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #13  <Field byte[] data>
	//   10   17:iconst_0        
	//   11   18:iload_3         
	//   12   19:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   13   22:return          
	}

	public static zzazh zzm(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new zzazh(abyte0, 0, abyte0.length);
	//    4    6:new             #2   <Class zzazh>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokespecial   #24  <Method void zzazh(byte[], int, int)>
	//   11   17:areturn         
	}

	public final byte[] getBytes()
	{
		byte abyte0[] = new byte[data.length];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] data>
	//    2    4:arraylength     
	//    3    5:newarray        byte[]
	//    4    7:astore_1        
		System.arraycopy(((Object) (data)), 0, ((Object) (abyte0)), 0, data.length);
	//    5    8:aload_0         
	//    6    9:getfield        #13  <Field byte[] data>
	//    7   12:iconst_0        
	//    8   13:aload_1         
	//    9   14:iconst_0        
	//   10   15:aload_0         
	//   11   16:getfield        #13  <Field byte[] data>
	//   12   19:arraylength     
	//   13   20:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   14   23:aload_1         
	//   15   24:areturn         
	}

	private final byte data[];
}
