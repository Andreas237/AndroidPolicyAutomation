// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbaq, zzbcu, zzbcv, zzbem

public final class zzbbq
{

	static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #52  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #55  <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return obj;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static int hashCode(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		int j = zza(i, abyte0, 0, i);
	//    3    3:iload_1         
	//    4    4:aload_0         
	//    5    5:iconst_0        
	//    6    6:iload_1         
	//    7    7:invokestatic    #62  <Method int zza(int, byte[], int, int)>
	//    8   10:istore_2        
		i = j;
	//    9   11:iload_2         
	//   10   12:istore_1        
		if(j == 0)
	//*  11   13:iload_2         
	//*  12   14:ifne            19
			i = 1;
	//   13   17:iconst_1        
	//   14   18:istore_1        
		return i;
	//   15   19:iload_1         
	//   16   20:ireturn         
	}

	static int zza(int i, byte abyte0[], int j, int k)
	{
		int l = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		for(i = j; i < j + k; i++)
	//*   2    3:iload_2         
	//*   3    4:istore_0        
	//*   4    5:iload_0         
	//*   5    6:iload_2         
	//*   6    7:iload_3         
	//*   7    8:iadd            
	//*   8    9:icmpge          30
			l = l * 31 + abyte0[i];
	//    9   12:iload           4
	//   10   14:bipush          31
	//   11   16:imul            
	//   12   17:aload_1         
	//   13   18:iload_0         
	//   14   19:baload          
	//   15   20:iadd            
	//   16   21:istore          4

	//   17   23:iload_0         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_0        
	//*  21   27:goto            5
		return l;
	//   22   30:iload           4
	//   23   32:ireturn         
	}

	static Object zza(Object obj, Object obj1)
	{
		return ((Object) (((zzbcu)obj).zzade().zzd((zzbcu)obj1).zzadj()));
	//    0    0:aload_0         
	//    1    1:checkcast       #65  <Class zzbcu>
	//    2    4:invokeinterface #69  <Method zzbcv zzbcu.zzade()>
	//    3    9:aload_1         
	//    4   10:checkcast       #65  <Class zzbcu>
	//    5   13:invokeinterface #75  <Method zzbcv zzbcv.zzd(zzbcu)>
	//    6   18:invokeinterface #79  <Method zzbcu zzbcv.zzadj()>
	//    7   23:areturn         
	}

	static Object zza(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
			throw new NullPointerException(s);
	//    2    4:new             #52  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #83  <Method void NullPointerException(String)>
	//    6   12:athrow          
		else
			return obj;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public static int zzar(boolean flag)
	{
		return !flag ? 1237 : 1231;
	//    0    0:iload_0         
	//    1    1:ifeq            8
	//    2    4:sipush          1231
	//    3    7:ireturn         
	//    4    8:sipush          1237
	//    5   11:ireturn         
	}

	static boolean zzi(zzbcu zzbcu1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean zzs(byte abyte0[])
	{
		return zzbem.zzs(abyte0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #94  <Method boolean zzbem.zzs(byte[])>
	//    2    4:ireturn         
	}

	public static String zzt(byte abyte0[])
	{
		return new String(abyte0, UTF_8);
	//    0    0:new             #98  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field Charset UTF_8>
	//    4    8:invokespecial   #101 <Method void String(byte[], Charset)>
	//    5   11:areturn         
	}

	public static int zzv(long l)
	{
		return (int)(l ^ l >>> 32);
	//    0    0:lload_0         
	//    1    1:lload_0         
	//    2    2:bipush          32
	//    3    4:lushr           
	//    4    5:lxor            
	//    5    6:l2i             
	//    6    7:ireturn         
	}

	private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final byte zzduq[];
	private static final ByteBuffer zzdur;
	private static final zzbaq zzdus;

	static 
	{
	//    0    0:ldc1            #17  <String "UTF-8">
	//    1    2:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #25  <Field Charset UTF_8>
	//    3    8:ldc1            #27  <String "ISO-8859-1">
	//    4   10:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #29  <Field Charset ISO_8859_1>
		byte abyte0[] = new byte[0];
	//    6   16:iconst_0        
	//    7   17:newarray        byte[]
	//    8   19:astore_0        
		zzduq = abyte0;
	//    9   20:aload_0         
	//   10   21:putstatic       #31  <Field byte[] zzduq>
		zzdur = ByteBuffer.wrap(abyte0);
	//   11   24:aload_0         
	//   12   25:invokestatic    #37  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   13   28:putstatic       #39  <Field ByteBuffer zzdur>
		abyte0 = zzduq;
	//   14   31:getstatic       #31  <Field byte[] zzduq>
	//   15   34:astore_0        
		zzdus = zzbaq.zza(abyte0, 0, abyte0.length, false);
	//   16   35:aload_0         
	//   17   36:iconst_0        
	//   18   37:aload_0         
	//   19   38:arraylength     
	//   20   39:iconst_0        
	//   21   40:invokestatic    #45  <Method zzbaq zzbaq.zza(byte[], int, int, boolean)>
	//   22   43:putstatic       #47  <Field zzbaq zzdus>
	//*  23   46:return          
	}
}
