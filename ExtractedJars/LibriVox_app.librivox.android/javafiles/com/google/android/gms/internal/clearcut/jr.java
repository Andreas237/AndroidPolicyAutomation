// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import android.util.Log;
import com.google.android.gms.clearcut.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			jv, ju, js, fy, 
//			jz

final class jr extends e
{

	jr(zze zze1, w w)
	{
		super(a.a, w);
	//    0    0:aload_0         
	//    1    1:getstatic       #13  <Field com.google.android.gms.common.api.a a.a>
	//    2    4:aload_2         
	//    3    5:invokespecial   #16  <Method void e(com.google.android.gms.common.api.a, w)>
		a = zze1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #18  <Field zze a>
	//    7   13:return          
	}

	protected final ah a(Status status)
	{
		return ((ah) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected final void a(c c)
	{
		c = ((c) ((jv)c));
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class jv>
	//    2    4:astore_1        
		ju ju1 = new ju(this);
	//    3    5:new             #27  <Class ju>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void ju(jr)>
	//    7   13:astore_2        
		try
		{
			zze zze1 = a;
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field zze a>
	//   10   18:astore_3        
			if(zze1.d != null && zze1.c.f.length == 0)
	//*  11   19:aload_3         
	//*  12   20:getfield        #36  <Field d zze.d>
	//*  13   23:ifnull          53
	//*  14   26:aload_3         
	//*  15   27:getfield        #40  <Field js zze.c>
	//*  16   30:getfield        #46  <Field byte[] js.f>
	//*  17   33:arraylength     
	//*  18   34:ifne            53
				zze1.c.f = zze1.d.a();
	//   19   37:aload_3         
	//   20   38:getfield        #40  <Field js zze.c>
	//   21   41:aload_3         
	//   22   42:getfield        #36  <Field d zze.d>
	//   23   45:invokeinterface #51  <Method byte[] d.a()>
	//   24   50:putfield        #46  <Field byte[] js.f>
			if(zze1.e != null && zze1.c.h.length == 0)
	//*  25   53:aload_3         
	//*  26   54:getfield        #54  <Field d zze.e>
	//*  27   57:ifnull          87
	//*  28   60:aload_3         
	//*  29   61:getfield        #40  <Field js zze.c>
	//*  30   64:getfield        #57  <Field byte[] js.h>
	//*  31   67:arraylength     
	//*  32   68:ifne            87
				zze1.c.h = zze1.e.a();
	//   33   71:aload_3         
	//   34   72:getfield        #40  <Field js zze.c>
	//   35   75:aload_3         
	//   36   76:getfield        #54  <Field d zze.e>
	//   37   79:invokeinterface #51  <Method byte[] d.a()>
	//   38   84:putfield        #57  <Field byte[] js.h>
			js js1 = zze1.c;
	//   39   87:aload_3         
	//   40   88:getfield        #40  <Field js zze.c>
	//   41   91:astore          4
			byte abyte0[] = new byte[((fy) (js1)).d()];
	//   42   93:aload           4
	//   43   95:invokevirtual   #62  <Method int com.google.android.gms.internal.clearcut.fy.d()>
	//   44   98:newarray        byte[]
	//   45  100:astore          5
			com.google.android.gms.internal.clearcut.fy.a(((fy) (js1)), abyte0, 0, abyte0.length);
	//   46  102:aload           4
	//   47  104:aload           5
	//   48  106:iconst_0        
	//   49  107:aload           5
	//   50  109:arraylength     
	//   51  110:invokestatic    #65  <Method void com.google.android.gms.internal.clearcut.fy.a(fy, byte[], int, int)>
			zze1.b = abyte0;
	//   52  113:aload_3         
	//   53  114:aload           5
	//   54  116:putfield        #68  <Field byte[] zze.b>
		}
	//*  55  119:aload_1         
	//*  56  120:invokevirtual   #72  <Method android.os.IInterface jv.x()>
	//*  57  123:checkcast       #74  <Class jz>
	//*  58  126:aload_2         
	//*  59  127:aload_0         
	//*  60  128:getfield        #18  <Field zze a>
	//*  61  131:invokeinterface #77  <Method void com.google.android.gms.internal.clearcut.jz.a(jx, zze)>
	//*  62  136:return          
		// Misplaced declaration of an exception variable
		catch(c c)
	//*  63  137:astore_1        
		{
			Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", ((Throwable) (c)));
	//   64  138:ldc1            #79  <String "ClearcutLoggerApiImpl">
	//   65  140:ldc1            #81  <String "derived ClearcutLogger.MessageProducer ">
	//   66  142:aload_1         
	//   67  143:invokestatic    #86  <Method int Log.e(String, String, Throwable)>
	//   68  146:pop             
			b(new Status(10, "MessageProducer"));
	//   69  147:aload_0         
	//   70  148:new             #88  <Class Status>
	//   71  151:dup             
	//   72  152:bipush          10
	//   73  154:ldc1            #90  <String "MessageProducer">
	//   74  156:invokespecial   #93  <Method void Status(int, String)>
	//   75  159:invokevirtual   #96  <Method void b(Status)>
			return;
	//   76  162:return          
		}
		((jz)((jv) (c)).x()).a(((jx) (ju1)), a);
	}

	private final zze a;
}
