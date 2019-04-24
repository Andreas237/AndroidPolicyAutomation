// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcu, zzbav, zzbah, zzbam

public abstract class zzazy
	implements zzbcu
{

	public zzazy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzdpf = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int zzdpf>
	//    5    9:return          
	}

	public final byte[] toByteArray()
	{
		byte abyte0[];
		try
		{
			abyte0 = new byte[zzacw()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int zzacw()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
			zzbav zzbav1 = zzbav.zzq(abyte0);
	//    4    7:aload_1         
	//    5    8:invokestatic    #34  <Method zzbav zzbav.zzq(byte[])>
	//    6   11:astore_2        
			zzb(zzbav1);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #38  <Method void zzb(zzbav)>
			zzbav1.zzacl();
	//   10   17:aload_2         
	//   11   18:invokevirtual   #41  <Method void zzbav.zzacl()>
		}
	//*  12   21:aload_1         
	//*  13   22:areturn         
		catch(IOException ioexception)
	//*  14   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   15   24:aload_0         
	//   16   25:invokevirtual   #45  <Method Class Object.getClass()>
	//   17   28:invokevirtual   #51  <Method String Class.getName()>
	//   18   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(62 + String.valueOf(((Object) (s))).length() + String.valueOf("byte array").length());
	//   19   32:new             #53  <Class StringBuilder>
	//   20   35:dup             
	//   21   36:bipush          62
	//   22   38:aload_2         
	//   23   39:invokestatic    #59  <Method String String.valueOf(Object)>
	//   24   42:invokevirtual   #62  <Method int String.length()>
	//   25   45:iadd            
	//   26   46:ldc1            #64  <String "byte array">
	//   27   48:invokestatic    #59  <Method String String.valueOf(Object)>
	//   28   51:invokevirtual   #62  <Method int String.length()>
	//   29   54:iadd            
	//   30   55:invokespecial   #67  <Method void StringBuilder(int)>
	//   31   58:astore_3        
			stringbuilder.append("Serializing ");
	//   32   59:aload_3         
	//   33   60:ldc1            #69  <String "Serializing ">
	//   34   62:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
			stringbuilder.append(s);
	//   36   66:aload_3         
	//   37   67:aload_2         
	//   38   68:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
			stringbuilder.append(" to a ");
	//   40   72:aload_3         
	//   41   73:ldc1            #75  <String " to a ">
	//   42   75:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
			stringbuilder.append("byte array");
	//   44   79:aload_3         
	//   45   80:ldc1            #64  <String "byte array">
	//   46   82:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   48   86:aload_3         
	//   49   87:ldc1            #77  <String " threw an IOException (should never happen).">
	//   50   89:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   52   93:new             #79  <Class RuntimeException>
	//   53   96:dup             
	//   54   97:aload_3         
	//   55   98:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   56  101:aload_1         
	//   57  102:invokespecial   #85  <Method void RuntimeException(String, Throwable)>
	//   58  105:athrow          
		}
		return abyte0;
	}

	public final zzbah zzaav()
	{
		Object obj;
		try
		{
			obj = ((Object) (zzbah.zzbo(zzacw())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int zzacw()>
	//    2    4:invokestatic    #93  <Method zzbam zzbah.zzbo(int)>
	//    3    7:astore_1        
			zzb(((zzbam) (obj)).zzabj());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #99  <Method zzbav zzbam.zzabj()>
	//    7   13:invokevirtual   #38  <Method void zzb(zzbav)>
			obj = ((Object) (((zzbam) (obj)).zzabi()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #102 <Method zzbah zzbam.zzabi()>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(IOException ioexception)
	//*  13   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #45  <Method Class Object.getClass()>
	//   16   28:invokevirtual   #51  <Method String Class.getName()>
	//   17   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(62 + String.valueOf(((Object) (s))).length() + String.valueOf("ByteString").length());
	//   18   32:new             #53  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:bipush          62
	//   21   38:aload_2         
	//   22   39:invokestatic    #59  <Method String String.valueOf(Object)>
	//   23   42:invokevirtual   #62  <Method int String.length()>
	//   24   45:iadd            
	//   25   46:ldc1            #104 <String "ByteString">
	//   26   48:invokestatic    #59  <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #62  <Method int String.length()>
	//   28   54:iadd            
	//   29   55:invokespecial   #67  <Method void StringBuilder(int)>
	//   30   58:astore_3        
			stringbuilder.append("Serializing ");
	//   31   59:aload_3         
	//   32   60:ldc1            #69  <String "Serializing ">
	//   33   62:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(s);
	//   35   66:aload_3         
	//   36   67:aload_2         
	//   37   68:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			stringbuilder.append(" to a ");
	//   39   72:aload_3         
	//   40   73:ldc1            #75  <String " to a ">
	//   41   75:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			stringbuilder.append("ByteString");
	//   43   79:aload_3         
	//   44   80:ldc1            #104 <String "ByteString">
	//   45   82:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   47   86:aload_3         
	//   48   87:ldc1            #77  <String " threw an IOException (should never happen).">
	//   49   89:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   51   93:new             #79  <Class RuntimeException>
	//   52   96:dup             
	//   53   97:aload_3         
	//   54   98:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   55  101:aload_1         
	//   56  102:invokespecial   #85  <Method void RuntimeException(String, Throwable)>
	//   57  105:athrow          
		}
		return ((zzbah) (obj));
	}

	int zzaaw()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #107 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	void zzbj(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #107 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static boolean zzdpg = false;
	protected int zzdpf;

	static 
	{
	//    0    0:return          
	}
}
