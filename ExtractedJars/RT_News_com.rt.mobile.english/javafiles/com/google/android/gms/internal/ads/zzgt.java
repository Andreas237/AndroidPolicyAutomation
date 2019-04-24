// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb

final class zzgt
{

	public zzgt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzajc = new ByteArrayOutputStream(4096);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:sipush          4096
	//    6   12:invokespecial   #18  <Method void ByteArrayOutputStream(int)>
	//    7   15:putfield        #20  <Field ByteArrayOutputStream zzajc>
		zzajd = new Base64OutputStream(((java.io.OutputStream) (zzajc)), 10);
	//    8   18:aload_0         
	//    9   19:new             #22  <Class Base64OutputStream>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #20  <Field ByteArrayOutputStream zzajc>
	//   13   27:bipush          10
	//   14   29:invokespecial   #25  <Method void Base64OutputStream(java.io.OutputStream, int)>
	//   15   32:putfield        #27  <Field Base64OutputStream zzajd>
	//   16   35:return          
	}

	public final String toString()
	{
		try
		{
			zzajd.close();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Base64OutputStream zzajd>
	//    2    4:invokevirtual   #35  <Method void Base64OutputStream.close()>
		}
	//*   3    7:goto            17
		catch(IOException ioexception)
	//*   4   10:astore_1        
		{
			zzakb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (ioexception)));
	//    5   11:ldc1            #37  <String "HashManager: Unable to convert to Base64.">
	//    6   13:aload_1         
	//    7   14:invokestatic    #43  <Method void zzakb.zzb(String, Throwable)>
		}
		Object obj;
		zzajc.close();
	//    8   17:aload_0         
	//    9   18:getfield        #20  <Field ByteArrayOutputStream zzajc>
	//   10   21:invokevirtual   #44  <Method void ByteArrayOutputStream.close()>
		obj = ((Object) (zzajc.toString()));
	//   11   24:aload_0         
	//   12   25:getfield        #20  <Field ByteArrayOutputStream zzajc>
	//   13   28:invokevirtual   #46  <Method String ByteArrayOutputStream.toString()>
	//   14   31:astore_1        
_L2:
		zzajc = null;
	//   15   32:aload_0         
	//   16   33:aconst_null     
	//   17   34:putfield        #20  <Field ByteArrayOutputStream zzajc>
		zzajd = null;
	//   18   37:aload_0         
	//   19   38:aconst_null     
	//   20   39:putfield        #27  <Field Base64OutputStream zzajd>
		return ((String) (obj));
	//   21   42:aload_1         
	//   22   43:areturn         
		obj;
	//   23   44:astore_1        
		break; /* Loop/switch isn't completed */
	//   24   45:goto            61
		IOException ioexception1;
		ioexception1;
	//   25   48:astore_1        
		zzakb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (ioexception1)));
	//   26   49:ldc1            #37  <String "HashManager: Unable to convert to Base64.">
	//   27   51:aload_1         
	//   28   52:invokestatic    #43  <Method void zzakb.zzb(String, Throwable)>
		ioexception1 = "";
	//   29   55:ldc1            #48  <String "">
	//   30   57:astore_1        
		if(true) goto _L2; else goto _L1
	//   31   58:goto            32
_L1:
		zzajc = null;
	//   32   61:aload_0         
	//   33   62:aconst_null     
	//   34   63:putfield        #20  <Field ByteArrayOutputStream zzajc>
		zzajd = null;
	//   35   66:aload_0         
	//   36   67:aconst_null     
	//   37   68:putfield        #27  <Field Base64OutputStream zzajd>
		throw ioexception1;
	//   38   71:aload_1         
	//   39   72:athrow          
	}

	public final void write(byte abyte0[])
		throws IOException
	{
		zzajd.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Base64OutputStream zzajd>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method void Base64OutputStream.write(byte[])>
	//    4    8:return          
	}

	private ByteArrayOutputStream zzajc;
	private Base64OutputStream zzajd;
}
