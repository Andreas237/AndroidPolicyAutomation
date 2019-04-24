// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.HoverGestureMapMessage;

// Referenced classes of package com.amap.api.mapcore.util:
//			o, ap, s, v, 
//			hm

class o$b
	implements 
{

	public boolean a(ap ap1)
	{
		b.mGestureState = 2;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    2    4:iconst_2        
	//    3    5:putfield        #35  <Field int EAMapPlatformGestureInfo.mGestureState>
		b.mGestureType = 6;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    6   12:bipush          6
	//    7   14:putfield        #38  <Field int EAMapPlatformGestureInfo.mGestureType>
		b.mLocation = (new float[] {
			ap1.c().getX(), ap1.c().getY()
		});
	//    8   17:aload_0         
	//    9   18:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   10   21:iconst_2        
	//   11   22:newarray        float[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_1         
	//   15   27:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   16   30:invokevirtual   #50  <Method float MotionEvent.getX()>
	//   17   33:fastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:aload_1         
	//   21   37:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   22   40:invokevirtual   #53  <Method float MotionEvent.getY()>
	//   23   43:fastore         
	//   24   44:putfield        #57  <Field float[] EAMapPlatformGestureInfo.mLocation>
		boolean flag2;
		try
		{
			flag2 = a.a.h().isTiltGesturesEnabled();
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field o a>
	//   27   51:getfield        #60  <Field s o.a>
	//   28   54:invokeinterface #66  <Method v s.h()>
	//   29   59:invokeinterface #72  <Method boolean v.isTiltGesturesEnabled()>
	//   30   64:istore          7
		}
	//*  31   66:iload           7
	//*  32   68:ifne            73
	//*  33   71:iconst_1        
	//*  34   72:ireturn         
	//*  35   73:goto            91
		// Misplaced declaration of an exception variable
		catch(ap ap1)
	//*  36   76:astore_1        
		{
			hm.c(((Throwable) (ap1)), "GLMapGestrureDetector", "onHove");
	//   37   77:aload_1         
	//   38   78:ldc1            #74  <String "GLMapGestrureDetector">
	//   39   80:ldc1            #76  <String "onHove">
	//   40   82:invokestatic    #81  <Method void hm.c(Throwable, String, String)>
			((Throwable) (ap1)).printStackTrace();
	//   41   85:aload_1         
	//   42   86:invokevirtual   #84  <Method void Throwable.printStackTrace()>
			return true;
	//   43   89:iconst_1        
	//   44   90:ireturn         
		}
		if(!flag2)
			return true;
		int i = a.a.a(b);
	//   45   91:aload_0         
	//   46   92:getfield        #16  <Field o a>
	//   47   95:getfield        #60  <Field s o.a>
	//   48   98:aload_0         
	//   49   99:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   50  102:invokeinterface #87  <Method int s.a(EAMapPlatformGestureInfo)>
	//   51  107:istore          6
		if(a.a.d(i))
	//*  52  109:aload_0         
	//*  53  110:getfield        #16  <Field o a>
	//*  54  113:getfield        #60  <Field s o.a>
	//*  55  116:iload           6
	//*  56  118:invokeinterface #91  <Method boolean s.d(int)>
	//*  57  123:ifeq            128
			return false;
	//   58  126:iconst_0        
	//   59  127:ireturn         
		if(o.c(a) > 3)
	//*  60  128:aload_0         
	//*  61  129:getfield        #16  <Field o a>
	//*  62  132:invokestatic    #94  <Method int o.c(o)>
	//*  63  135:iconst_3        
	//*  64  136:icmple          141
			return false;
	//   65  139:iconst_0        
	//   66  140:ireturn         
		float f = ap1.d().x;
	//   67  141:aload_1         
	//   68  142:invokevirtual   #97  <Method PointF ap.d()>
	//   69  145:getfield        #103 <Field float PointF.x>
	//   70  148:fstore_2        
		float f2 = ap1.d().y;
	//   71  149:aload_1         
	//   72  150:invokevirtual   #97  <Method PointF ap.d()>
	//   73  153:getfield        #106 <Field float PointF.y>
	//   74  156:fstore_3        
		if(!o.i(a))
	//*  75  157:aload_0         
	//*  76  158:getfield        #16  <Field o a>
	//*  77  161:invokestatic    #110 <Method boolean o.i(o)>
	//*  78  164:ifne            276
		{
			PointF pointf = ap1.a(0);
	//   79  167:aload_1         
	//   80  168:iconst_0        
	//   81  169:invokevirtual   #113 <Method PointF ap.a(int)>
	//   82  172:astore          8
			ap1 = ((ap) (ap1.a(1)));
	//   83  174:aload_1         
	//   84  175:iconst_1        
	//   85  176:invokevirtual   #113 <Method PointF ap.a(int)>
	//   86  179:astore_1        
			boolean flag1 = false;
	//   87  180:iconst_0        
	//   88  181:istore          5
			boolean flag;
			if(pointf.y > 10F && ((PointF) (ap1)).y > 10F || pointf.y < -10F && ((PointF) (ap1)).y < -10F)
	//*  89  183:aload           8
	//*  90  185:getfield        #106 <Field float PointF.y>
	//*  91  188:ldc1            #114 <Float 10F>
	//*  92  190:fcmpl           
	//*  93  191:ifle            204
	//*  94  194:aload_1         
	//*  95  195:getfield        #106 <Field float PointF.y>
	//*  96  198:ldc1            #114 <Float 10F>
	//*  97  200:fcmpl           
	//*  98  201:ifgt            225
	//*  99  204:aload           8
	//* 100  206:getfield        #106 <Field float PointF.y>
	//* 101  209:ldc1            #115 <Float -10F>
	//* 102  211:fcmpg           
	//* 103  212:ifge            231
	//* 104  215:aload_1         
	//* 105  216:getfield        #106 <Field float PointF.y>
	//* 106  219:ldc1            #115 <Float -10F>
	//* 107  221:fcmpg           
	//* 108  222:ifge            231
				flag = true;
	//  109  225:iconst_1        
	//  110  226:istore          4
			else
	//* 111  228:goto            234
				flag = false;
	//  112  231:iconst_0        
	//  113  232:istore          4
			if(flag)
	//* 114  234:iload           4
	//* 115  236:ifeq            242
				flag1 = true;
	//  116  239:iconst_1        
	//  117  240:istore          5
			if(flag1 && Math.abs(f2) > 10F && Math.abs(f) < 10F)
	//* 118  242:iload           5
	//* 119  244:ifeq            276
	//* 120  247:fload_3         
	//* 121  248:invokestatic    #121 <Method float Math.abs(float)>
	//* 122  251:ldc1            #114 <Float 10F>
	//* 123  253:fcmpl           
	//* 124  254:ifle            276
	//* 125  257:fload_2         
	//* 126  258:invokestatic    #121 <Method float Math.abs(float)>
	//* 127  261:ldc1            #114 <Float 10F>
	//* 128  263:fcmpg           
	//* 129  264:ifge            276
				o.b(a, true);
	//  130  267:aload_0         
	//  131  268:getfield        #16  <Field o a>
	//  132  271:iconst_1        
	//  133  272:invokestatic    #124 <Method boolean o.b(o, boolean)>
	//  134  275:pop             
		}
		if(o.i(a))
	//* 135  276:aload_0         
	//* 136  277:getfield        #16  <Field o a>
	//* 137  280:invokestatic    #110 <Method boolean o.i(o)>
	//* 138  283:ifeq            339
		{
			o.b(a, true);
	//  139  286:aload_0         
	//  140  287:getfield        #16  <Field o a>
	//  141  290:iconst_1        
	//  142  291:invokestatic    #124 <Method boolean o.b(o, boolean)>
	//  143  294:pop             
			float f1 = f2 / 6F;
	//  144  295:fload_3         
	//  145  296:ldc1            #125 <Float 6F>
	//  146  298:fdiv            
	//  147  299:fstore_2        
			if(Math.abs(f1) > 1.0F)
	//* 148  300:fload_2         
	//* 149  301:invokestatic    #121 <Method float Math.abs(float)>
	//* 150  304:fconst_1        
	//* 151  305:fcmpl           
	//* 152  306:ifle            339
			{
				a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (HoverGestureMapMessage.obtain(101, f1))));
	//  153  309:aload_0         
	//  154  310:getfield        #16  <Field o a>
	//  155  313:getfield        #60  <Field s o.a>
	//  156  316:iload           6
	//  157  318:bipush          101
	//  158  320:fload_2         
	//  159  321:invokestatic    #131 <Method HoverGestureMapMessage HoverGestureMapMessage.obtain(int, float)>
	//  160  324:invokeinterface #134 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
				o.m(a);
	//  161  329:aload_0         
	//  162  330:getfield        #16  <Field o a>
	//  163  333:invokestatic    #137 <Method int o.m(o)>
	//  164  336:pop             
				return true;
	//  165  337:iconst_1        
	//  166  338:ireturn         
			}
		}
		return true;
	//  167  339:iconst_1        
	//  168  340:ireturn         
	}

	public boolean b(ap ap1)
	{
		b.mGestureState = 1;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    2    4:iconst_1        
	//    3    5:putfield        #35  <Field int EAMapPlatformGestureInfo.mGestureState>
		b.mGestureType = 6;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    6   12:bipush          6
	//    7   14:putfield        #38  <Field int EAMapPlatformGestureInfo.mGestureType>
		b.mLocation = (new float[] {
			ap1.c().getX(), ap1.c().getY()
		});
	//    8   17:aload_0         
	//    9   18:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   10   21:iconst_2        
	//   11   22:newarray        float[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_1         
	//   15   27:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   16   30:invokevirtual   #50  <Method float MotionEvent.getX()>
	//   17   33:fastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:aload_1         
	//   21   37:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   22   40:invokevirtual   #53  <Method float MotionEvent.getY()>
	//   23   43:fastore         
	//   24   44:putfield        #57  <Field float[] EAMapPlatformGestureInfo.mLocation>
		boolean flag;
		try
		{
			flag = a.a.h().isTiltGesturesEnabled();
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field o a>
	//   27   51:getfield        #60  <Field s o.a>
	//   28   54:invokeinterface #66  <Method v s.h()>
	//   29   59:invokeinterface #72  <Method boolean v.isTiltGesturesEnabled()>
	//   30   64:istore_3        
		}
	//*  31   65:iload_3         
	//*  32   66:ifne            71
	//*  33   69:iconst_1        
	//*  34   70:ireturn         
	//*  35   71:goto            89
		// Misplaced declaration of an exception variable
		catch(ap ap1)
	//*  36   74:astore_1        
		{
			hm.c(((Throwable) (ap1)), "GLMapGestrureDetector", "onHoveBegin");
	//   37   75:aload_1         
	//   38   76:ldc1            #74  <String "GLMapGestrureDetector">
	//   39   78:ldc1            #139 <String "onHoveBegin">
	//   40   80:invokestatic    #81  <Method void hm.c(Throwable, String, String)>
			((Throwable) (ap1)).printStackTrace();
	//   41   83:aload_1         
	//   42   84:invokevirtual   #84  <Method void Throwable.printStackTrace()>
			return true;
	//   43   87:iconst_1        
	//   44   88:ireturn         
		}
		if(!flag)
			return true;
		int i = a.a.a(b);
	//   45   89:aload_0         
	//   46   90:getfield        #16  <Field o a>
	//   47   93:getfield        #60  <Field s o.a>
	//   48   96:aload_0         
	//   49   97:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   50  100:invokeinterface #87  <Method int s.a(EAMapPlatformGestureInfo)>
	//   51  105:istore_2        
		if(a.a.d(i))
	//*  52  106:aload_0         
	//*  53  107:getfield        #16  <Field o a>
	//*  54  110:getfield        #60  <Field s o.a>
	//*  55  113:iload_2         
	//*  56  114:invokeinterface #91  <Method boolean s.d(int)>
	//*  57  119:ifeq            124
		{
			return false;
	//   58  122:iconst_0        
	//   59  123:ireturn         
		} else
		{
			a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (HoverGestureMapMessage.obtain(100, a.a.o(i)))));
	//   60  124:aload_0         
	//   61  125:getfield        #16  <Field o a>
	//   62  128:getfield        #60  <Field s o.a>
	//   63  131:iload_2         
	//   64  132:bipush          100
	//   65  134:aload_0         
	//   66  135:getfield        #16  <Field o a>
	//   67  138:getfield        #60  <Field s o.a>
	//   68  141:iload_2         
	//   69  142:invokeinterface #143 <Method float s.o(int)>
	//   70  147:invokestatic    #131 <Method HoverGestureMapMessage HoverGestureMapMessage.obtain(int, float)>
	//   71  150:invokeinterface #134 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
			return true;
	//   72  155:iconst_1        
	//   73  156:ireturn         
		}
	}

	public void c(ap ap1)
	{
		b.mGestureState = 3;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    2    4:iconst_3        
	//    3    5:putfield        #35  <Field int EAMapPlatformGestureInfo.mGestureState>
		b.mGestureType = 6;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//    6   12:bipush          6
	//    7   14:putfield        #38  <Field int EAMapPlatformGestureInfo.mGestureType>
		b.mLocation = (new float[] {
			ap1.c().getX(), ap1.c().getY()
		});
	//    8   17:aload_0         
	//    9   18:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   10   21:iconst_2        
	//   11   22:newarray        float[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_1         
	//   15   27:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   16   30:invokevirtual   #50  <Method float MotionEvent.getX()>
	//   17   33:fastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:aload_1         
	//   21   37:invokevirtual   #44  <Method MotionEvent ap.c()>
	//   22   40:invokevirtual   #53  <Method float MotionEvent.getY()>
	//   23   43:fastore         
	//   24   44:putfield        #57  <Field float[] EAMapPlatformGestureInfo.mLocation>
		boolean flag;
		try
		{
			flag = a.a.h().isTiltGesturesEnabled();
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field o a>
	//   27   51:getfield        #60  <Field s o.a>
	//   28   54:invokeinterface #66  <Method v s.h()>
	//   29   59:invokeinterface #72  <Method boolean v.isTiltGesturesEnabled()>
	//   30   64:istore_3        
		}
	//*  31   65:iload_3         
	//*  32   66:ifne            70
	//*  33   69:return          
	//*  34   70:goto            87
		// Misplaced declaration of an exception variable
		catch(ap ap1)
	//*  35   73:astore_1        
		{
			hm.c(((Throwable) (ap1)), "GLMapGestrureDetector", "onHoveEnd");
	//   36   74:aload_1         
	//   37   75:ldc1            #74  <String "GLMapGestrureDetector">
	//   38   77:ldc1            #146 <String "onHoveEnd">
	//   39   79:invokestatic    #81  <Method void hm.c(Throwable, String, String)>
			((Throwable) (ap1)).printStackTrace();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #84  <Method void Throwable.printStackTrace()>
			return;
	//   42   86:return          
		}
		if(!flag)
			return;
		int i = a.a.a(b);
	//   43   87:aload_0         
	//   44   88:getfield        #16  <Field o a>
	//   45   91:getfield        #60  <Field s o.a>
	//   46   94:aload_0         
	//   47   95:getfield        #24  <Field EAMapPlatformGestureInfo b>
	//   48   98:invokeinterface #87  <Method int s.a(EAMapPlatformGestureInfo)>
	//   49  103:istore_2        
		if(a.a.d(i))
	//*  50  104:aload_0         
	//*  51  105:getfield        #16  <Field o a>
	//*  52  108:getfield        #60  <Field s o.a>
	//*  53  111:iload_2         
	//*  54  112:invokeinterface #91  <Method boolean s.d(int)>
	//*  55  117:ifeq            121
			return;
	//   56  120:return          
		if(a.a.o(i) >= 0.0F && o.a(a) > 0)
	//*  57  121:aload_0         
	//*  58  122:getfield        #16  <Field o a>
	//*  59  125:getfield        #60  <Field s o.a>
	//*  60  128:iload_2         
	//*  61  129:invokeinterface #143 <Method float s.o(int)>
	//*  62  134:fconst_0        
	//*  63  135:fcmpl           
	//*  64  136:iflt            164
	//*  65  139:aload_0         
	//*  66  140:getfield        #16  <Field o a>
	//*  67  143:invokestatic    #148 <Method int o.a(o)>
	//*  68  146:ifle            164
			a.a.a(i, 7);
	//   69  149:aload_0         
	//   70  150:getfield        #16  <Field o a>
	//   71  153:getfield        #60  <Field s o.a>
	//   72  156:iload_2         
	//   73  157:bipush          7
	//   74  159:invokeinterface #151 <Method void s.a(int, int)>
		o.b(a, false);
	//   75  164:aload_0         
	//   76  165:getfield        #16  <Field o a>
	//   77  168:iconst_0        
	//   78  169:invokestatic    #124 <Method boolean o.b(o, boolean)>
	//   79  172:pop             
		a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (HoverGestureMapMessage.obtain(102, a.a.o(i)))));
	//   80  173:aload_0         
	//   81  174:getfield        #16  <Field o a>
	//   82  177:getfield        #60  <Field s o.a>
	//   83  180:iload_2         
	//   84  181:bipush          102
	//   85  183:aload_0         
	//   86  184:getfield        #16  <Field o a>
	//   87  187:getfield        #60  <Field s o.a>
	//   88  190:iload_2         
	//   89  191:invokeinterface #143 <Method float s.o(int)>
	//   90  196:invokestatic    #131 <Method HoverGestureMapMessage HoverGestureMapMessage.obtain(int, float)>
	//   91  199:invokeinterface #134 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
	//   92  204:return          
	}

	final o a;
	private EAMapPlatformGestureInfo b;

	private o$b(o o1)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field o a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		b = new EAMapPlatformGestureInfo();
	//    5    9:aload_0         
	//    6   10:new             #21  <Class EAMapPlatformGestureInfo>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void EAMapPlatformGestureInfo()>
	//    9   17:putfield        #24  <Field EAMapPlatformGestureInfo b>
	//   10   20:return          
	}

	o$b(o o1, o$1 o$1)
	{
		this(o1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void o$b(o)>
	//    3    5:return          
	}
}
