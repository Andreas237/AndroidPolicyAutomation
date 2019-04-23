// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;
import java.io.PushbackInputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brp, brt, zztv, abo, 
//			bry, brw, bsb, wx, 
//			zzty

final class brz
	implements Runnable
{

	brz(bry bry1, brp brp1, zzty zzty, abo abo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = bry1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field bry a>
		b = brp1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field brp b>
		c = zzty;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field zzty c>
		d = abo1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field abo d>
	//   14   25:return          
	}

	public final void run()
	{
		Object obj;
		bry bry1;
		abo abo1;
		zzty zzty;
		bry1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field bry a>
	//    2    4:astore_3        
		obj = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field brp b>
	//    5    9:astore_2        
		zzty = c;
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field zzty c>
	//    8   14:astore          5
		abo1 = d;
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field abo d>
	//   11   20:astore          4
		obj = ((Object) (((brp) (obj)).e().a(zzty)));
	//   12   22:aload_2         
	//   13   23:invokevirtual   #39  <Method brt brp.e()>
	//   14   26:aload           5
	//   15   28:invokeinterface #44  <Method zztv brt.a(zzty)>
	//   16   33:astore_2        
		if(!((zztv) (obj)).a())
	//*  17   34:aload_2         
	//*  18   35:invokevirtual   #49  <Method boolean zztv.a()>
	//*  19   38:ifne            63
		{
			abo1.a(((Throwable) (new RuntimeException("No entry contents."))));
	//   20   41:aload           4
	//   21   43:new             #51  <Class RuntimeException>
	//   22   46:dup             
	//   23   47:ldc1            #53  <String "No entry contents.">
	//   24   49:invokespecial   #56  <Method void RuntimeException(String)>
	//   25   52:invokevirtual   #61  <Method void abo.a(Throwable)>
			brw.a(bry1.a);
	//   26   55:aload_3         
	//   27   56:getfield        #66  <Field brw bry.a>
	//   28   59:invokestatic    #71  <Method void brw.a(brw)>
			return;
	//   29   62:return          
		}
		int i;
		obj = ((Object) (new bsb(bry1, ((zztv) (obj)).b(), 1)));
	//   30   63:new             #73  <Class bsb>
	//   31   66:dup             
	//   32   67:aload_3         
	//   33   68:aload_2         
	//   34   69:invokevirtual   #76  <Method java.io.InputStream zztv.b()>
	//   35   72:iconst_1        
	//   36   73:invokespecial   #79  <Method void bsb(bry, java.io.InputStream, int)>
	//   37   76:astore_2        
		i = ((PushbackInputStream) (obj)).read();
	//   38   77:aload_2         
	//   39   78:invokevirtual   #85  <Method int PushbackInputStream.read()>
	//   40   81:istore_1        
		if(i == -1)
			break MISSING_BLOCK_LABEL_99;
	//   41   82:iload_1         
	//   42   83:iconst_m1       
	//   43   84:icmpeq          99
		((PushbackInputStream) (obj)).unread(i);
	//   44   87:aload_2         
	//   45   88:iload_1         
	//   46   89:invokevirtual   #89  <Method void PushbackInputStream.unread(int)>
		abo1.b(obj);
	//   47   92:aload           4
	//   48   94:aload_2         
	//   49   95:invokevirtual   #92  <Method void abo.b(Object)>
		return;
	//   50   98:return          
		throw new IOException("Unable to read from cache.");
	//   51   99:new             #31  <Class IOException>
	//   52  102:dup             
	//   53  103:ldc1            #94  <String "Unable to read from cache.">
	//   54  105:invokespecial   #95  <Method void IOException(String)>
	//   55  108:athrow          
		Object obj1;
		obj1;
	//   56  109:astore_2        
		break MISSING_BLOCK_LABEL_114;
	//   57  110:goto            114
		obj1;
	//   58  113:astore_2        
		wx.b("Unable to obtain a cache service instance.", ((Throwable) (obj1)));
	//   59  114:ldc1            #97  <String "Unable to obtain a cache service instance.">
	//   60  116:aload_2         
	//   61  117:invokestatic    #102 <Method void wx.b(String, Throwable)>
		abo1.a(((Throwable) (obj1)));
	//   62  120:aload           4
	//   63  122:aload_2         
	//   64  123:invokevirtual   #61  <Method void abo.a(Throwable)>
		brw.a(bry1.a);
	//   65  126:aload_3         
	//   66  127:getfield        #66  <Field brw bry.a>
	//   67  130:invokestatic    #71  <Method void brw.a(brw)>
		return;
	//   68  133:return          
	}

	private final bry a;
	private final brp b;
	private final zzty c;
	private final abo d;
}
