// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.h;
import java.io.IOException;
import java.net.URL;
import okhttp3.*;

// Referenced classes of package com.google.firebase.perf.network:
//			g, h

public class FirebasePerfOkHttpClient
{

	private FirebasePerfOkHttpClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static void a(bc bc1, v v1, long l, long l1)
	{
		Object obj = ((Object) (bc1.a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method ay bc.a()>
	//    2    4:astore          8
		if(obj == null)
	//*   3    6:aload           8
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		v1.a(((ay) (obj)).a().a().toString());
	//    6   12:aload_1         
	//    7   13:aload           8
	//    8   15:invokevirtual   #21  <Method am ay.a()>
	//    9   18:invokevirtual   #26  <Method URL am.a()>
	//   10   21:invokevirtual   #32  <Method String URL.toString()>
	//   11   24:invokevirtual   #37  <Method v v.a(String)>
	//   12   27:pop             
		v1.b(((ay) (obj)).b());
	//   13   28:aload_1         
	//   14   29:aload           8
	//   15   31:invokevirtual   #40  <Method String ay.b()>
	//   16   34:invokevirtual   #42  <Method v v.b(String)>
	//   17   37:pop             
		if(((ay) (obj)).d() != null)
	//*  18   38:aload           8
	//*  19   40:invokevirtual   #46  <Method ba ay.d()>
	//*  20   43:ifnull          72
		{
			long l2 = ((ay) (obj)).d().b();
	//   21   46:aload           8
	//   22   48:invokevirtual   #46  <Method ba ay.d()>
	//   23   51:invokevirtual   #51  <Method long ba.b()>
	//   24   54:lstore          6
			if(l2 != -1L)
	//*  25   56:lload           6
	//*  26   58:ldc2w           #52  <Long -1L>
	//*  27   61:lcmp            
	//*  28   62:ifeq            72
				v1.a(l2);
	//   29   65:aload_1         
	//   30   66:lload           6
	//   31   68:invokevirtual   #56  <Method v v.a(long)>
	//   32   71:pop             
		}
		obj = ((Object) (bc1.h()));
	//   33   72:aload_0         
	//   34   73:invokevirtual   #60  <Method be bc.h()>
	//   35   76:astore          8
		if(obj != null)
	//*  36   78:aload           8
	//*  37   80:ifnull          128
		{
			long l3 = ((be) (obj)).b();
	//   38   83:aload           8
	//   39   85:invokevirtual   #63  <Method long be.b()>
	//   40   88:lstore          6
			if(l3 != -1L)
	//*  41   90:lload           6
	//*  42   92:ldc2w           #52  <Long -1L>
	//*  43   95:lcmp            
	//*  44   96:ifeq            106
				v1.f(l3);
	//   45   99:aload_1         
	//   46  100:lload           6
	//   47  102:invokevirtual   #66  <Method v v.f(long)>
	//   48  105:pop             
			obj = ((Object) (((be) (obj)).a()));
	//   49  106:aload           8
	//   50  108:invokevirtual   #69  <Method ar be.a()>
	//   51  111:astore          8
			if(obj != null)
	//*  52  113:aload           8
	//*  53  115:ifnull          128
				v1.c(((ar) (obj)).toString());
	//   54  118:aload_1         
	//   55  119:aload           8
	//   56  121:invokevirtual   #72  <Method String ar.toString()>
	//   57  124:invokevirtual   #75  <Method v v.c(String)>
	//   58  127:pop             
		}
		v1.a(bc1.c());
	//   59  128:aload_1         
	//   60  129:aload_0         
	//   61  130:invokevirtual   #78  <Method int bc.c()>
	//   62  133:invokevirtual   #81  <Method v v.a(int)>
	//   63  136:pop             
		v1.b(l);
	//   64  137:aload_1         
	//   65  138:lload_2         
	//   66  139:invokevirtual   #83  <Method v v.b(long)>
	//   67  142:pop             
		v1.e(l1);
	//   68  143:aload_1         
	//   69  144:lload           4
	//   70  146:invokevirtual   #86  <Method v v.e(long)>
	//   71  149:pop             
		v1.d();
	//   72  150:aload_1         
	//   73  151:invokevirtual   #89  <Method com.google.android.gms.internal.firebase_2D_perf.bt v.d()>
	//   74  154:pop             
	//   75  155:return          
	}

	public static void enqueue(m m1, o o)
	{
		zzbg zzbg1 = new zzbg();
	//    0    0:new             #94  <Class zzbg>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void zzbg()>
	//    3    7:astore          4
		long l = zzbg1.b();
	//    4    9:aload           4
	//    5   11:invokevirtual   #96  <Method long zzbg.b()>
	//    6   14:lstore_2        
		m1.a(((o) (new g(o, h.a(), zzbg1, l))));
	//    7   15:aload_0         
	//    8   16:new             #98  <Class g>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #103 <Method h h.a()>
	//   12   24:aload           4
	//   13   26:lload_2         
	//   14   27:invokespecial   #106 <Method void g(o, h, zzbg, long)>
	//   15   30:invokeinterface #111 <Method void m.a(o)>
	//   16   35:return          
	}

	public static bc execute(m m1)
	{
		v v1 = v.a(h.a());
	//    0    0:invokestatic    #103 <Method h h.a()>
	//    1    3:invokestatic    #119 <Method v v.a(h)>
	//    2    6:astore_3        
		zzbg zzbg1 = new zzbg();
	//    3    7:new             #94  <Class zzbg>
	//    4   10:dup             
	//    5   11:invokespecial   #95  <Method void zzbg()>
	//    6   14:astore          4
		long l = zzbg1.b();
	//    7   16:aload           4
	//    8   18:invokevirtual   #96  <Method long zzbg.b()>
	//    9   21:lstore_1        
		bc bc1;
		try
		{
			bc1 = m1.b();
	//   10   22:aload_0         
	//   11   23:invokeinterface #122 <Method bc m.b()>
	//   12   28:astore          5
			a(bc1, v1, l, zzbg1.c());
	//   13   30:aload           5
	//   14   32:aload_3         
	//   15   33:lload_1         
	//   16   34:aload           4
	//   17   36:invokevirtual   #124 <Method long zzbg.c()>
	//   18   39:invokestatic    #126 <Method void a(bc, v, long, long)>
		}
	//*  19   42:aload           5
	//*  20   44:areturn         
		catch(IOException ioexception)
	//*  21   45:astore          5
		{
			m1 = ((m) (m1.a()));
	//   22   47:aload_0         
	//   23   48:invokeinterface #127 <Method ay m.a()>
	//   24   53:astore_0        
			if(m1 != null)
	//*  25   54:aload_0         
	//*  26   55:ifnull          98
			{
				am am1 = ((ay) (m1)).a();
	//   27   58:aload_0         
	//   28   59:invokevirtual   #21  <Method am ay.a()>
	//   29   62:astore          6
				if(am1 != null)
	//*  30   64:aload           6
	//*  31   66:ifnull          82
					v1.a(am1.a().toString());
	//   32   69:aload_3         
	//   33   70:aload           6
	//   34   72:invokevirtual   #26  <Method URL am.a()>
	//   35   75:invokevirtual   #32  <Method String URL.toString()>
	//   36   78:invokevirtual   #37  <Method v v.a(String)>
	//   37   81:pop             
				if(((ay) (m1)).b() != null)
	//*  38   82:aload_0         
	//*  39   83:invokevirtual   #40  <Method String ay.b()>
	//*  40   86:ifnull          98
					v1.b(((ay) (m1)).b());
	//   41   89:aload_3         
	//   42   90:aload_0         
	//   43   91:invokevirtual   #40  <Method String ay.b()>
	//   44   94:invokevirtual   #42  <Method v v.b(String)>
	//   45   97:pop             
			}
			v1.b(l);
	//   46   98:aload_3         
	//   47   99:lload_1         
	//   48  100:invokevirtual   #83  <Method v v.b(long)>
	//   49  103:pop             
			v1.e(zzbg1.c());
	//   50  104:aload_3         
	//   51  105:aload           4
	//   52  107:invokevirtual   #124 <Method long zzbg.c()>
	//   53  110:invokevirtual   #86  <Method v v.e(long)>
	//   54  113:pop             
			h.a(v1);
	//   55  114:aload_3         
	//   56  115:invokestatic    #132 <Method void h.a(v)>
			throw ioexception;
	//   57  118:aload           5
	//   58  120:athrow          
		}
		return bc1;
	}
}
