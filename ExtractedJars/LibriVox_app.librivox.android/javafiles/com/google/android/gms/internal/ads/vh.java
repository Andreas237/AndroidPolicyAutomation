// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ve, ayl, ayg

final class vh
	implements Runnable
{

	vh(ve ve1, Bitmap bitmap)
	{
		b = ve1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ve b>
		a = bitmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Bitmap a>
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
		a.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Bitmap a>
	//    6   12:getstatic       #30  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//    7   15:iconst_0        
	//    8   16:aload_2         
	//    9   17:invokevirtual   #36  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   10   20:pop             
		synchronized(ve.a(b))
	//*  11   21:aload_0         
	//*  12   22:getfield        #14  <Field ve b>
	//*  13   25:invokestatic    #41  <Method Object ve.a(ve)>
	//*  14   28:astore_1        
	//*  15   29:aload_1         
	//*  16   30:monitorenter    
		{
			ve.b(b).g = new ayl();
	//   17   31:aload_0         
	//   18   32:getfield        #14  <Field ve b>
	//   19   35:invokestatic    #44  <Method ayg ve.b(ve)>
	//   20   38:new             #46  <Class ayl>
	//   21   41:dup             
	//   22   42:invokespecial   #47  <Method void ayl()>
	//   23   45:putfield        #53  <Field ayl ayg.g>
			ve.b(b).g.c = bytearrayoutputstream.toByteArray();
	//   24   48:aload_0         
	//   25   49:getfield        #14  <Field ve b>
	//   26   52:invokestatic    #44  <Method ayg ve.b(ve)>
	//   27   55:getfield        #53  <Field ayl ayg.g>
	//   28   58:aload_2         
	//   29   59:invokevirtual   #57  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   30   62:putfield        #61  <Field byte[] ayl.c>
			ve.b(b).g.b = "image/png";
	//   31   65:aload_0         
	//   32   66:getfield        #14  <Field ve b>
	//   33   69:invokestatic    #44  <Method ayg ve.b(ve)>
	//   34   72:getfield        #53  <Field ayl ayg.g>
	//   35   75:ldc1            #63  <String "image/png">
	//   36   77:putfield        #66  <Field String ayl.b>
			ve.b(b).g.a = Integer.valueOf(1);
	//   37   80:aload_0         
	//   38   81:getfield        #14  <Field ve b>
	//   39   84:invokestatic    #44  <Method ayg ve.b(ve)>
	//   40   87:getfield        #53  <Field ayl ayg.g>
	//   41   90:iconst_1        
	//   42   91:invokestatic    #72  <Method Integer Integer.valueOf(int)>
	//   43   94:putfield        #75  <Field Integer ayl.a>
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

	private final Bitmap a;
	private final ve b;
}
