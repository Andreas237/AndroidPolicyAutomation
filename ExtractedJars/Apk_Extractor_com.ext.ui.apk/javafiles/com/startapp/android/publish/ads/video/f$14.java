// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import com.startapp.android.publish.ads.video.b.c;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$14
	implements com.startapp.android.publish.ads.video.b.c.c
{

	public void a(int i)
	{
		if(!a.u || !a.v || a.h == null || a.h.e() == 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:getfield        #25  <Field boolean f.u>
	//    3    7:ifeq            149
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field f a>
	//    6   14:getfield        #28  <Field boolean f.v>
	//    7   17:ifeq            149
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field f a>
	//   10   24:getfield        #32  <Field c f.h>
	//   11   27:ifnull          149
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field f a>
	//   14   34:getfield        #32  <Field c f.h>
	//   15   37:invokeinterface #38  <Method int c.e()>
	//   16   42:ifeq            149
_L1:
		g.a("VideoMode", 3, (new StringBuilder()).append("buffered percent = [").append(i).append("]").toString());
	//   17   45:ldc1            #40  <String "VideoMode">
	//   18   47:iconst_3        
	//   19   48:new             #42  <Class StringBuilder>
	//   20   51:dup             
	//   21   52:invokespecial   #43  <Method void StringBuilder()>
	//   22   55:ldc1            #45  <String "buffered percent = [">
	//   23   57:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   24   60:iload_1         
	//   25   61:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   26   64:ldc1            #54  <String "]">
	//   27   66:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   28   69:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   29   72:invokestatic    #63  <Method void g.a(String, int, String)>
		a.t = i;
	//   30   75:aload_0         
	//   31   76:getfield        #17  <Field f a>
	//   32   79:iload_1         
	//   33   80:putfield        #67  <Field int f.t>
		i = (a.h.d() * 100) / a.h.e();
	//   34   83:aload_0         
	//   35   84:getfield        #17  <Field f a>
	//   36   87:getfield        #32  <Field c f.h>
	//   37   90:invokeinterface #70  <Method int c.d()>
	//   38   95:bipush          100
	//   39   97:imul            
	//   40   98:aload_0         
	//   41   99:getfield        #17  <Field f a>
	//   42  102:getfield        #32  <Field c f.h>
	//   43  105:invokeinterface #38  <Method int c.e()>
	//   44  110:idiv            
	//   45  111:istore_1        
		if(!a.N()) goto _L4; else goto _L3
	//   46  112:aload_0         
	//   47  113:getfield        #17  <Field f a>
	//   48  116:invokevirtual   #74  <Method boolean f.N()>
	//   49  119:ifeq            191
_L3:
		if(a.w || !a.Y()) goto _L6; else goto _L5
	//   50  122:aload_0         
	//   51  123:getfield        #17  <Field f a>
	//   52  126:getfield        #77  <Field boolean f.w>
	//   53  129:ifne            150
	//   54  132:aload_0         
	//   55  133:getfield        #17  <Field f a>
	//   56  136:invokevirtual   #80  <Method boolean f.Y()>
	//   57  139:ifeq            150
_L5:
		a.K();
	//   58  142:aload_0         
	//   59  143:getfield        #17  <Field f a>
	//   60  146:invokevirtual   #83  <Method void f.K()>
_L2:
		return;
	//   61  149:return          
_L6:
		if(a.t == 100 || a.t - i > b.a().G().j())
	//*  62  150:aload_0         
	//*  63  151:getfield        #17  <Field f a>
	//*  64  154:getfield        #67  <Field int f.t>
	//*  65  157:bipush          100
	//*  66  159:icmpeq          183
	//*  67  162:aload_0         
	//*  68  163:getfield        #17  <Field f a>
	//*  69  166:getfield        #67  <Field int f.t>
	//*  70  169:iload_1         
	//*  71  170:isub            
	//*  72  171:invokestatic    #88  <Method b b.a()>
	//*  73  174:invokevirtual   #92  <Method n b.G()>
	//*  74  177:invokevirtual   #97  <Method int n.j()>
	//*  75  180:icmple          149
		{
			a.I();
	//   76  183:aload_0         
	//   77  184:getfield        #17  <Field f a>
	//   78  187:invokevirtual   #99  <Method void f.I()>
			return;
	//   79  190:return          
		}
		continue; /* Loop/switch isn't completed */
_L4:
		if(a.t < 100 && a.t - i <= b.a().G().k())
	//*  80  191:aload_0         
	//*  81  192:getfield        #17  <Field f a>
	//*  82  195:getfield        #67  <Field int f.t>
	//*  83  198:bipush          100
	//*  84  200:icmpge          149
	//*  85  203:aload_0         
	//*  86  204:getfield        #17  <Field f a>
	//*  87  207:getfield        #67  <Field int f.t>
	//*  88  210:iload_1         
	//*  89  211:isub            
	//*  90  212:invokestatic    #88  <Method b b.a()>
	//*  91  215:invokevirtual   #92  <Method n b.G()>
	//*  92  218:invokevirtual   #102 <Method int n.k()>
	//*  93  221:icmpgt          149
		{
			a.J();
	//   94  224:aload_0         
	//   95  225:getfield        #17  <Field f a>
	//   96  228:invokevirtual   #105 <Method void f.J()>
			return;
	//   97  231:return          
		}
		if(true) goto _L2; else goto _L7
_L7:
	}

	final f a;

	f$14(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
