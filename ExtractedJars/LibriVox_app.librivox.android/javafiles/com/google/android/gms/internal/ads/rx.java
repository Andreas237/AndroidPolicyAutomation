// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.k;
import java.io.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, wi, zzasy

final class rx
	implements Runnable
{

	rx(zzasy zzasy, OutputStream outputstream, byte abyte0[])
	{
		a = outputstream;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field OutputStream a>
		b = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field byte[] b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		Object obj1 = ((Object) (new DataOutputStream(a)));
	//    0    0:new             #25  <Class DataOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field OutputStream a>
	//    4    8:invokespecial   #28  <Method void DataOutputStream(OutputStream)>
	//    5   11:astore_2        
		Object obj = obj1;
	//    6   12:aload_2         
	//    7   13:astore_1        
		((DataOutputStream) (obj1)).writeInt(b.length);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field byte[] b>
	//   11   19:arraylength     
	//   12   20:invokevirtual   #32  <Method void DataOutputStream.writeInt(int)>
		obj = obj1;
	//   13   23:aload_2         
	//   14   24:astore_1        
		((DataOutputStream) (obj1)).write(b);
	//   15   25:aload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field byte[] b>
	//   18   30:invokevirtual   #36  <Method void DataOutputStream.write(byte[])>
		k.a(((java.io.Closeable) (obj1)));
	//   19   33:aload_2         
	//   20   34:invokestatic    #41  <Method void k.a(java.io.Closeable)>
		return;
	//   21   37:return          
		Object obj2;
		obj2;
	//   22   38:astore_3        
		break MISSING_BLOCK_LABEL_51;
	//   23   39:goto            51
		obj;
	//   24   42:astore_1        
		obj1 = null;
	//   25   43:aconst_null     
	//   26   44:astore_2        
		break MISSING_BLOCK_LABEL_92;
	//   27   45:goto            92
		obj2;
	//   28   48:astore_3        
		obj1 = null;
	//   29   49:aconst_null     
	//   30   50:astore_2        
		obj = obj1;
	//   31   51:aload_2         
	//   32   52:astore_1        
		wx.b("Error transporting the ad response", ((Throwable) (obj2)));
	//   33   53:ldc1            #43  <String "Error transporting the ad response">
	//   34   55:aload_3         
	//   35   56:invokestatic    #48  <Method void wx.b(String, Throwable)>
		obj = obj1;
	//   36   59:aload_2         
	//   37   60:astore_1        
		aw.i().a(((Throwable) (obj2)), "LargeParcelTeleporter.pipeData.1");
	//   38   61:invokestatic    #54  <Method wi aw.i()>
	//   39   64:aload_3         
	//   40   65:ldc1            #56  <String "LargeParcelTeleporter.pipeData.1">
	//   41   67:invokevirtual   #61  <Method void wi.a(Throwable, String)>
		if(obj1 == null)
	//*  42   70:aload_2         
	//*  43   71:ifnonnull       82
		{
			k.a(((java.io.Closeable) (a)));
	//   44   74:aload_0         
	//   45   75:getfield        #14  <Field OutputStream a>
	//   46   78:invokestatic    #41  <Method void k.a(java.io.Closeable)>
			return;
	//   47   81:return          
		} else
		{
			k.a(((java.io.Closeable) (obj1)));
	//   48   82:aload_2         
	//   49   83:invokestatic    #41  <Method void k.a(java.io.Closeable)>
			return;
	//   50   86:return          
		}
		obj2;
	//   51   87:astore_3        
		obj1 = obj;
	//   52   88:aload_1         
	//   53   89:astore_2        
		obj = obj2;
	//   54   90:aload_3         
	//   55   91:astore_1        
		if(obj1 == null)
	//*  56   92:aload_2         
	//*  57   93:ifnonnull       106
			k.a(((java.io.Closeable) (a)));
	//   58   96:aload_0         
	//   59   97:getfield        #14  <Field OutputStream a>
	//   60  100:invokestatic    #41  <Method void k.a(java.io.Closeable)>
		else
	//*  61  103:goto            110
			k.a(((java.io.Closeable) (obj1)));
	//   62  106:aload_2         
	//   63  107:invokestatic    #41  <Method void k.a(java.io.Closeable)>
		throw obj;
	//   64  110:aload_1         
	//   65  111:athrow          
	}

	private final OutputStream a;
	private final byte b[];
}
