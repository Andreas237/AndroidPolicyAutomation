// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, we, wd, zzasi, 
//			zzasm, xg, oo, ol

public final class on extends wt
{

	public on(we we1, ol ol)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void wt()>
		c = we1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field we c>
		b = c.b;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field we c>
	//    8   14:getfield        #22  <Field zzasm we.b>
	//    9   17:putfield        #23  <Field zzasm b>
		a = ol;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #25  <Field ol a>
	//   13   25:return          
	}

	static ol a(on on1)
	{
		return on1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ol a>
	//    2    4:areturn         
	}

	public final void a()
	{
		wd wd1 = new wd(c.a.c, ((afn) (null)), ((java.util.List) (null)), 0, ((java.util.List) (null)), ((java.util.List) (null)), b.k, b.j, c.a.i, false, ((jv) (null)), ((kp) (null)), ((String) (null)), ((jw) (null)), ((jy) (null)), b.h, c.d, b.f, c.f, b.m, b.n, c.h, ((bj) (null)), ((zzawd) (null)), ((java.util.List) (null)), ((java.util.List) (null)), c.b.D, c.b.E, ((String) (null)), ((java.util.List) (null)), ((String) (null)), c.i, c.b.O, c.j, c.b.Q, ((java.util.List) (null)), c.b.S, c.b.T, c.b.V);
	//    0    0:new             #29  <Class wd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field we c>
	//    4    8:getfield        #32  <Field zzasi we.a>
	//    5   11:getfield        #37  <Field zzwb zzasi.c>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:iconst_0        
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aload_0         
	//   12   20:getfield        #23  <Field zzasm b>
	//   13   23:getfield        #43  <Field int zzasm.k>
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field zzasm b>
	//   16   30:getfield        #47  <Field long zzasm.j>
	//   17   33:aload_0         
	//   18   34:getfield        #18  <Field we c>
	//   19   37:getfield        #32  <Field zzasi we.a>
	//   20   40:getfield        #51  <Field String zzasi.i>
	//   21   43:iconst_0        
	//   22   44:aconst_null     
	//   23   45:aconst_null     
	//   24   46:aconst_null     
	//   25   47:aconst_null     
	//   26   48:aconst_null     
	//   27   49:aload_0         
	//   28   50:getfield        #23  <Field zzasm b>
	//   29   53:getfield        #54  <Field long zzasm.h>
	//   30   56:aload_0         
	//   31   57:getfield        #18  <Field we c>
	//   32   60:getfield        #58  <Field zzwf we.d>
	//   33   63:aload_0         
	//   34   64:getfield        #23  <Field zzasm b>
	//   35   67:getfield        #61  <Field long zzasm.f>
	//   36   70:aload_0         
	//   37   71:getfield        #18  <Field we c>
	//   38   74:getfield        #62  <Field long we.f>
	//   39   77:aload_0         
	//   40   78:getfield        #23  <Field zzasm b>
	//   41   81:getfield        #65  <Field long zzasm.m>
	//   42   84:aload_0         
	//   43   85:getfield        #23  <Field zzasm b>
	//   44   88:getfield        #68  <Field String zzasm.n>
	//   45   91:aload_0         
	//   46   92:getfield        #18  <Field we c>
	//   47   95:getfield        #71  <Field org.json.JSONObject we.h>
	//   48   98:aconst_null     
	//   49   99:aconst_null     
	//   50  100:aconst_null     
	//   51  101:aconst_null     
	//   52  102:aload_0         
	//   53  103:getfield        #18  <Field we c>
	//   54  106:getfield        #22  <Field zzasm we.b>
	//   55  109:getfield        #75  <Field boolean zzasm.D>
	//   56  112:aload_0         
	//   57  113:getfield        #18  <Field we c>
	//   58  116:getfield        #22  <Field zzasm we.b>
	//   59  119:getfield        #79  <Field zzaso zzasm.E>
	//   60  122:aconst_null     
	//   61  123:aconst_null     
	//   62  124:aconst_null     
	//   63  125:aload_0         
	//   64  126:getfield        #18  <Field we c>
	//   65  129:getfield        #82  <Field bse we.i>
	//   66  132:aload_0         
	//   67  133:getfield        #18  <Field we c>
	//   68  136:getfield        #22  <Field zzasm we.b>
	//   69  139:getfield        #85  <Field boolean zzasm.O>
	//   70  142:aload_0         
	//   71  143:getfield        #18  <Field we c>
	//   72  146:getfield        #87  <Field boolean we.j>
	//   73  149:aload_0         
	//   74  150:getfield        #18  <Field we c>
	//   75  153:getfield        #22  <Field zzasm we.b>
	//   76  156:getfield        #90  <Field boolean zzasm.Q>
	//   77  159:aconst_null     
	//   78  160:aload_0         
	//   79  161:getfield        #18  <Field we c>
	//   80  164:getfield        #22  <Field zzasm we.b>
	//   81  167:getfield        #93  <Field boolean zzasm.S>
	//   82  170:aload_0         
	//   83  171:getfield        #18  <Field we c>
	//   84  174:getfield        #22  <Field zzasm we.b>
	//   85  177:getfield        #96  <Field String zzasm.T>
	//   86  180:aload_0         
	//   87  181:getfield        #18  <Field we c>
	//   88  184:getfield        #22  <Field zzasm we.b>
	//   89  187:getfield        #99  <Field boolean zzasm.V>
	//   90  190:invokespecial   #102 <Method void wd(zzwb, afn, java.util.List, int, java.util.List, java.util.List, int, long, String, boolean, jv, kp, String, jw, jy, long, zzwf, long, long, long, String, org.json.JSONObject, bj, zzawd, java.util.List, java.util.List, boolean, zzaso, String, java.util.List, String, bse, boolean, boolean, boolean, java.util.List, boolean, String, boolean)>
	//   91  193:astore_1        
		xg.a.post(((Runnable) (new oo(this, wd1))));
	//   92  194:getstatic       #107 <Field Handler xg.a>
	//   93  197:new             #109 <Class oo>
	//   94  200:dup             
	//   95  201:aload_0         
	//   96  202:aload_1         
	//   97  203:invokespecial   #112 <Method void oo(on, wd)>
	//   98  206:invokevirtual   #118 <Method boolean Handler.post(Runnable)>
	//   99  209:pop             
	//  100  210:return          
	}

	public final void b_()
	{
	//    0    0:return          
	}

	private final ol a;
	private final zzasm b;
	private final we c;
}
