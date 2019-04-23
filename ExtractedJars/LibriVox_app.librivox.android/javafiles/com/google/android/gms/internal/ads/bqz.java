// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx

final class bqz
{

	public bqz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = new ByteArrayOutputStream(4096);
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:sipush          4096
	//    6   12:invokespecial   #17  <Method void ByteArrayOutputStream(int)>
	//    7   15:putfield        #19  <Field ByteArrayOutputStream a>
		b = new Base64OutputStream(((java.io.OutputStream) (a)), 10);
	//    8   18:aload_0         
	//    9   19:new             #21  <Class Base64OutputStream>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field ByteArrayOutputStream a>
	//   13   27:bipush          10
	//   14   29:invokespecial   #24  <Method void Base64OutputStream(java.io.OutputStream, int)>
	//   15   32:putfield        #26  <Field Base64OutputStream b>
	//   16   35:return          
	}

	public final void a(byte abyte0[])
	{
		b.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Base64OutputStream b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void Base64OutputStream.write(byte[])>
	//    4    8:return          
	}

	public final String toString()
	{
		try
		{
			b.close();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Base64OutputStream b>
	//    2    4:invokevirtual   #38  <Method void Base64OutputStream.close()>
		}
	//*   3    7:goto            17
		catch(IOException ioexception)
	//*   4   10:astore_1        
		{
			wx.b("HashManager: Unable to convert to Base64.", ((Throwable) (ioexception)));
	//    5   11:ldc1            #40  <String "HashManager: Unable to convert to Base64.">
	//    6   13:aload_1         
	//    7   14:invokestatic    #45  <Method void wx.b(String, Throwable)>
		}
		String s;
		a.close();
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field ByteArrayOutputStream a>
	//   10   21:invokevirtual   #46  <Method void ByteArrayOutputStream.close()>
		s = a.toString();
	//   11   24:aload_0         
	//   12   25:getfield        #19  <Field ByteArrayOutputStream a>
	//   13   28:invokevirtual   #48  <Method String ByteArrayOutputStream.toString()>
	//   14   31:astore_1        
		a = null;
	//   15   32:aload_0         
	//   16   33:aconst_null     
	//   17   34:putfield        #19  <Field ByteArrayOutputStream a>
		b = null;
	//   18   37:aload_0         
	//   19   38:aconst_null     
	//   20   39:putfield        #26  <Field Base64OutputStream b>
		return s;
	//   21   42:aload_1         
	//   22   43:areturn         
		Object obj;
		obj;
	//   23   44:astore_1        
		break MISSING_BLOCK_LABEL_68;
	//   24   45:goto            68
		obj;
	//   25   48:astore_1        
		wx.b("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
	//   26   49:ldc1            #40  <String "HashManager: Unable to convert to Base64.">
	//   27   51:aload_1         
	//   28   52:invokestatic    #45  <Method void wx.b(String, Throwable)>
		a = null;
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:putfield        #19  <Field ByteArrayOutputStream a>
		b = null;
	//   32   60:aload_0         
	//   33   61:aconst_null     
	//   34   62:putfield        #26  <Field Base64OutputStream b>
		return "";
	//   35   65:ldc1            #50  <String "">
	//   36   67:areturn         
		a = null;
	//   37   68:aload_0         
	//   38   69:aconst_null     
	//   39   70:putfield        #19  <Field ByteArrayOutputStream a>
		b = null;
	//   40   73:aload_0         
	//   41   74:aconst_null     
	//   42   75:putfield        #26  <Field Base64OutputStream b>
		throw obj;
	//   43   78:aload_1         
	//   44   79:athrow          
	}

	private ByteArrayOutputStream a;
	private Base64OutputStream b;
}
