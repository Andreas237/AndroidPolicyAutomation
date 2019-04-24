// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.IOUtils;
import java.io.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzajm, zzaev

final class zzaew
	implements Runnable
{

	zzaew(zzaev zzaev, OutputStream outputstream, byte abyte0[])
	{
		zzcfw = outputstream;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field OutputStream zzcfw>
		zzcfx = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field byte[] zzcfx>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		Object obj1 = ((Object) (new DataOutputStream(zzcfw)));
	//    0    0:new             #25  <Class DataOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field OutputStream zzcfw>
	//    4    8:invokespecial   #28  <Method void DataOutputStream(OutputStream)>
	//    5   11:astore_2        
		Object obj = obj1;
	//    6   12:aload_2         
	//    7   13:astore_1        
		((DataOutputStream) (obj1)).writeInt(zzcfx.length);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field byte[] zzcfx>
	//   11   19:arraylength     
	//   12   20:invokevirtual   #32  <Method void DataOutputStream.writeInt(int)>
		obj = obj1;
	//   13   23:aload_2         
	//   14   24:astore_1        
		((DataOutputStream) (obj1)).write(zzcfx);
	//   15   25:aload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field byte[] zzcfx>
	//   18   30:invokevirtual   #36  <Method void DataOutputStream.write(byte[])>
		IOUtils.closeQuietly(((java.io.Closeable) (obj1)));
	//   19   33:aload_2         
	//   20   34:invokestatic    #42  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return;
	//   21   37:return          
		IOException ioexception;
		ioexception;
	//   22   38:astore_3        
		break MISSING_BLOCK_LABEL_51;
	//   23   39:goto            51
		obj1;
	//   24   42:astore_2        
		obj = null;
	//   25   43:aconst_null     
	//   26   44:astore_1        
		break MISSING_BLOCK_LABEL_88;
	//   27   45:goto            88
		ioexception;
	//   28   48:astore_3        
		obj1 = null;
	//   29   49:aconst_null     
	//   30   50:astore_2        
		obj = obj1;
	//   31   51:aload_2         
	//   32   52:astore_1        
		zzakb.zzb("Error transporting the ad response", ((Throwable) (ioexception)));
	//   33   53:ldc1            #44  <String "Error transporting the ad response">
	//   34   55:aload_3         
	//   35   56:invokestatic    #50  <Method void zzakb.zzb(String, Throwable)>
		obj = obj1;
	//   36   59:aload_2         
	//   37   60:astore_1        
		zzbv.zzeo().zza(((Throwable) (ioexception)), "LargeParcelTeleporter.pipeData.1");
	//   38   61:invokestatic    #56  <Method zzajm zzbv.zzeo()>
	//   39   64:aload_3         
	//   40   65:ldc1            #58  <String "LargeParcelTeleporter.pipeData.1">
	//   41   67:invokevirtual   #64  <Method void zzajm.zza(Throwable, String)>
		if(obj1 == null)
	//*  42   70:aload_2         
	//*  43   71:ifnonnull       82
		{
			IOUtils.closeQuietly(((java.io.Closeable) (zzcfw)));
	//   44   74:aload_0         
	//   45   75:getfield        #14  <Field OutputStream zzcfw>
	//   46   78:invokestatic    #42  <Method void IOUtils.closeQuietly(java.io.Closeable)>
			return;
	//   47   81:return          
		} else
		{
			IOUtils.closeQuietly(((java.io.Closeable) (obj1)));
	//   48   82:aload_2         
	//   49   83:invokestatic    #42  <Method void IOUtils.closeQuietly(java.io.Closeable)>
			return;
	//   50   86:return          
		}
		obj1;
	//   51   87:astore_2        
		Object obj2 = obj;
	//   52   88:aload_1         
	//   53   89:astore_3        
		if(obj == null)
	//*  54   90:aload_1         
	//*  55   91:ifnonnull       99
			obj2 = ((Object) (zzcfw));
	//   56   94:aload_0         
	//   57   95:getfield        #14  <Field OutputStream zzcfw>
	//   58   98:astore_3        
		IOUtils.closeQuietly(((java.io.Closeable) (obj2)));
	//   59   99:aload_3         
	//   60  100:invokestatic    #42  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj1;
	//   61  103:aload_2         
	//   62  104:athrow          
	}

	private final OutputStream zzcfw;
	private final byte zzcfx[];
}
