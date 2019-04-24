// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaii, zzbft, zzbfm

final class zzail
	implements Runnable
{

	zzail(zzaii zzaii1, Bitmap bitmap)
	{
		zzcna = zzaii1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzaii zzcna>
		val$bitmap = bitmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Bitmap val$bitmap>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #23  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		val$bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Bitmap val$bitmap>
	//    6   12:getstatic       #30  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//    7   15:iconst_0        
	//    8   16:aload_2         
	//    9   17:invokevirtual   #36  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   10   20:pop             
		synchronized(zzaii.zza(zzcna))
	//*  11   21:aload_0         
	//*  12   22:getfield        #14  <Field zzaii zzcna>
	//*  13   25:invokestatic    #42  <Method Object zzaii.zza(zzaii)>
	//*  14   28:astore_1        
	//*  15   29:aload_1         
	//*  16   30:monitorenter    
		{
			zzaii.zzb(zzcna).zzecm = new zzbft();
	//   17   31:aload_0         
	//   18   32:getfield        #14  <Field zzaii zzcna>
	//   19   35:invokestatic    #46  <Method zzbfm zzaii.zzb(zzaii)>
	//   20   38:new             #48  <Class zzbft>
	//   21   41:dup             
	//   22   42:invokespecial   #49  <Method void zzbft()>
	//   23   45:putfield        #55  <Field zzbft zzbfm.zzecm>
			zzaii.zzb(zzcna).zzecm.zzedl = bytearrayoutputstream.toByteArray();
	//   24   48:aload_0         
	//   25   49:getfield        #14  <Field zzaii zzcna>
	//   26   52:invokestatic    #46  <Method zzbfm zzaii.zzb(zzaii)>
	//   27   55:getfield        #55  <Field zzbft zzbfm.zzecm>
	//   28   58:aload_2         
	//   29   59:invokevirtual   #59  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   30   62:putfield        #63  <Field byte[] zzbft.zzedl>
			zzaii.zzb(zzcna).zzecm.mimeType = "image/png";
	//   31   65:aload_0         
	//   32   66:getfield        #14  <Field zzaii zzcna>
	//   33   69:invokestatic    #46  <Method zzbfm zzaii.zzb(zzaii)>
	//   34   72:getfield        #55  <Field zzbft zzbfm.zzecm>
	//   35   75:ldc1            #65  <String "image/png">
	//   36   77:putfield        #69  <Field String zzbft.mimeType>
			zzaii.zzb(zzcna).zzecm.zzamf = Integer.valueOf(1);
	//   37   80:aload_0         
	//   38   81:getfield        #14  <Field zzaii zzcna>
	//   39   84:invokestatic    #46  <Method zzbfm zzaii.zzb(zzaii)>
	//   40   87:getfield        #55  <Field zzbft zzbfm.zzecm>
	//   41   90:iconst_1        
	//   42   91:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   43   94:putfield        #79  <Field Integer zzbft.zzamf>
		}
	//   44   97:aload_1         
	//   45   98:monitorexit     
		return;
	//   46   99:return          
		exception;
	//   47  100:astore_2        
		obj;
	//   48  101:aload_1         
		JVM INSTR monitorexit ;
	//   49  102:monitorexit     
		throw exception;
	//   50  103:aload_2         
	//   51  104:athrow          
	}

	private final Bitmap val$bitmap;
	private final zzaii zzcna;
}
