// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zze extends zzj
{

	protected zze(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzj()>
		boolean flag;
		if(abyte0.length == 25)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          25
	//*   5    8:icmpne          16
			flag = true;
	//    6   11:iconst_1        
	//    7   12:istore_2        
		else
	//*   8   13:goto            18
			flag = false;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		Preconditions.checkArgument(flag);
	//   11   18:iload_2         
	//   12   19:invokestatic    #17  <Method void Preconditions.checkArgument(boolean)>
		zzt = Arrays.hashCode(abyte0);
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:invokestatic    #23  <Method int Arrays.hashCode(byte[])>
	//   16   27:putfield        #25  <Field int zzt>
	//   17   30:return          
	}

	protected static byte[] zza(String s)
	{
		try
		{
			s = ((String) (s.getBytes("ISO-8859-1")));
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "ISO-8859-1">
	//    2    3:invokevirtual   #37  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_0        
		{
			throw new AssertionError(((Object) (s)));
	//    7   10:new             #39  <Class AssertionError>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #42  <Method void AssertionError(Object)>
	//   11   18:athrow          
		}
		return ((byte []) (s));
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
			break MISSING_BLOCK_LABEL_75;
	//    0    0:aload_1         
	//    1    1:ifnull          75
		if(!(obj instanceof zzi))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #48  <Class zzi>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		obj = ((Object) ((zzi)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #48  <Class zzi>
	//    9   17:astore_1        
		if(((zzi) (obj)).zzc() != hashCode())
	//*  10   18:aload_1         
	//*  11   19:invokeinterface #52  <Method int zzi.zzc()>
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #54  <Method int hashCode()>
	//*  14   28:icmpeq          33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		obj = ((Object) (((zzi) (obj)).zzb()));
	//   17   33:aload_1         
	//   18   34:invokeinterface #58  <Method IObjectWrapper zzi.zzb()>
	//   19   39:astore_1        
		if(obj == null)
	//*  20   40:aload_1         
	//*  21   41:ifnonnull       46
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		boolean flag;
		obj = ((Object) ((byte[])ObjectWrapper.unwrap(((IObjectWrapper) (obj)))));
	//   24   46:aload_1         
	//   25   47:invokestatic    #64  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   26   50:checkcast       #66  <Class byte[]>
	//   27   53:astore_1        
		flag = Arrays.equals(getBytes(), ((byte []) (obj)));
	//   28   54:aload_0         
	//   29   55:invokevirtual   #69  <Method byte[] getBytes()>
	//   30   58:aload_1         
	//   31   59:invokestatic    #72  <Method boolean Arrays.equals(byte[], byte[])>
	//   32   62:istore_2        
		return flag;
	//   33   63:iload_2         
	//   34   64:ireturn         
		obj;
	//   35   65:astore_1        
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable) (obj)));
	//   36   66:ldc1            #74  <String "GoogleCertificates">
	//   37   68:ldc1            #76  <String "Failed to get Google certificates from remote">
	//   38   70:aload_1         
	//   39   71:invokestatic    #82  <Method int Log.e(String, String, Throwable)>
	//   40   74:pop             
		return false;
	//   41   75:iconst_0        
	//   42   76:ireturn         
	}

	abstract byte[] getBytes();

	public int hashCode()
	{
		return zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzt>
	//    2    4:ireturn         
	}

	public final IObjectWrapper zzb()
	{
		return ObjectWrapper.wrap(((Object) (getBytes())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method byte[] getBytes()>
	//    2    4:invokestatic    #86  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    3    7:areturn         
	}

	public final int zzc()
	{
		return hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method int hashCode()>
	//    2    4:ireturn         
	}

	private int zzt;
}
