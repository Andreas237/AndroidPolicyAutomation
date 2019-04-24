// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.MoveGestureMapMessage;

// Referenced classes of package com.amap.api.mapcore.util:
//			o, s, v, hm, 
//			aq

class o$c
	implements 
{

	public boolean a(aq aq1)
	{
label0:
		{
			if(o.i(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field o a>
	//*   2    4:invokestatic    #36  <Method boolean o.i(o)>
	//*   3    7:ifeq            12
				return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
			boolean flag;
			try
			{
				if(!a.a.h().isScrollGesturesEnabled())
					break label0;
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field o a>
	//    8   16:getfield        #39  <Field s o.a>
	//    9   19:invokeinterface #45  <Method v s.h()>
	//   10   24:invokeinterface #51  <Method boolean v.isScrollGesturesEnabled()>
	//   11   29:ifeq            46
				flag = o.j(a);
	//   12   32:aload_0         
	//   13   33:getfield        #17  <Field o a>
	//   14   36:invokestatic    #54  <Method boolean o.j(o)>
	//   15   39:istore          4
			}
	//*  16   41:iload           4
	//*  17   43:ifeq            48
	//*  18   46:iconst_1        
	//*  19   47:ireturn         
	//*  20   48:goto            66
			// Misplaced declaration of an exception variable
			catch(aq aq1)
	//*  21   51:astore_1        
			{
				hm.c(((Throwable) (aq1)), "GLMapGestrureDetector", "onMove");
	//   22   52:aload_1         
	//   23   53:ldc1            #56  <String "GLMapGestrureDetector">
	//   24   55:ldc1            #58  <String "onMove">
	//   25   57:invokestatic    #63  <Method void hm.c(Throwable, String, String)>
				((Throwable) (aq1)).printStackTrace();
	//   26   60:aload_1         
	//   27   61:invokevirtual   #66  <Method void Throwable.printStackTrace()>
				return true;
	//   28   64:iconst_1        
	//   29   65:ireturn         
			}
			if(!flag)
				break MISSING_BLOCK_LABEL_66;
		}
		return true;
		b.mGestureState = 2;
	//   30   66:aload_0         
	//   31   67:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   32   70:iconst_2        
	//   33   71:putfield        #70  <Field int EAMapPlatformGestureInfo.mGestureState>
		b.mGestureType = 3;
	//   34   74:aload_0         
	//   35   75:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   36   78:iconst_3        
	//   37   79:putfield        #73  <Field int EAMapPlatformGestureInfo.mGestureType>
		b.mLocation = (new float[] {
			aq1.c().getX(), aq1.c().getY()
		});
	//   38   82:aload_0         
	//   39   83:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   40   86:iconst_2        
	//   41   87:newarray        float[]
	//   42   89:dup             
	//   43   90:iconst_0        
	//   44   91:aload_1         
	//   45   92:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   46   95:invokevirtual   #84  <Method float MotionEvent.getX()>
	//   47   98:fastore         
	//   48   99:dup             
	//   49  100:iconst_1        
	//   50  101:aload_1         
	//   51  102:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   52  105:invokevirtual   #87  <Method float MotionEvent.getY()>
	//   53  108:fastore         
	//   54  109:putfield        #91  <Field float[] EAMapPlatformGestureInfo.mLocation>
		int i = a.a.a(b);
	//   55  112:aload_0         
	//   56  113:getfield        #17  <Field o a>
	//   57  116:getfield        #39  <Field s o.a>
	//   58  119:aload_0         
	//   59  120:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   60  123:invokeinterface #94  <Method int s.a(EAMapPlatformGestureInfo)>
	//   61  128:istore_3        
		aq1 = ((aq) (aq1.d()));
	//   62  129:aload_1         
	//   63  130:invokevirtual   #98  <Method PointF aq.d()>
	//   64  133:astore_1        
		float f = 1.0F;
	//   65  134:fconst_1        
	//   66  135:fstore_2        
		if(o.k(a) == 0)
	//*  67  136:aload_0         
	//*  68  137:getfield        #17  <Field o a>
	//*  69  140:invokestatic    #102 <Method int o.k(o)>
	//*  70  143:ifne            149
			f = 4F;
	//   71  146:ldc1            #103 <Float 4F>
	//   72  148:fstore_2        
		if(Math.abs(((PointF) (aq1)).x) > f || Math.abs(((PointF) (aq1)).y) > f)
	//*  73  149:aload_1         
	//*  74  150:getfield        #109 <Field float PointF.x>
	//*  75  153:invokestatic    #115 <Method float Math.abs(float)>
	//*  76  156:fload_2         
	//*  77  157:fcmpl           
	//*  78  158:ifgt            173
	//*  79  161:aload_1         
	//*  80  162:getfield        #118 <Field float PointF.y>
	//*  81  165:invokestatic    #115 <Method float Math.abs(float)>
	//*  82  168:fload_2         
	//*  83  169:fcmpl           
	//*  84  170:ifle            236
		{
			if(o.k(a) == 0)
	//*  85  173:aload_0         
	//*  86  174:getfield        #17  <Field o a>
	//*  87  177:invokestatic    #102 <Method int o.k(o)>
	//*  88  180:ifne            200
				a.a.a().clearAnimations(i, false);
	//   89  183:aload_0         
	//   90  184:getfield        #17  <Field o a>
	//   91  187:getfield        #39  <Field s o.a>
	//   92  190:invokeinterface #121 <Method GLMapEngine s.a()>
	//   93  195:iload_3         
	//   94  196:iconst_0        
	//   95  197:invokevirtual   #127 <Method void GLMapEngine.clearAnimations(int, boolean)>
			a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (MoveGestureMapMessage.obtain(101, ((PointF) (aq1)).x, ((PointF) (aq1)).y))));
	//   96  200:aload_0         
	//   97  201:getfield        #17  <Field o a>
	//   98  204:getfield        #39  <Field s o.a>
	//   99  207:iload_3         
	//  100  208:bipush          101
	//  101  210:aload_1         
	//  102  211:getfield        #109 <Field float PointF.x>
	//  103  214:aload_1         
	//  104  215:getfield        #118 <Field float PointF.y>
	//  105  218:invokestatic    #133 <Method MoveGestureMapMessage MoveGestureMapMessage.obtain(int, float, float)>
	//  106  221:invokeinterface #136 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
			o.l(a);
	//  107  226:aload_0         
	//  108  227:getfield        #17  <Field o a>
	//  109  230:invokestatic    #139 <Method int o.l(o)>
	//  110  233:pop             
			return true;
	//  111  234:iconst_1        
	//  112  235:ireturn         
		} else
		{
			return false;
	//  113  236:iconst_0        
	//  114  237:ireturn         
		}
	}

	public boolean b(aq aq1)
	{
		boolean flag;
		try
		{
			flag = a.a.h().isScrollGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field o a>
	//    2    4:getfield        #39  <Field s o.a>
	//    3    7:invokeinterface #45  <Method v s.h()>
	//    4   12:invokeinterface #51  <Method boolean v.isScrollGesturesEnabled()>
	//    5   17:istore_3        
		}
	//*   6   18:iload_3         
	//*   7   19:ifne            24
	//*   8   22:iconst_1        
	//*   9   23:ireturn         
	//*  10   24:goto            42
		// Misplaced declaration of an exception variable
		catch(aq aq1)
	//*  11   27:astore_1        
		{
			hm.c(((Throwable) (aq1)), "GLMapGestrureDetector", "onMoveBegin");
	//   12   28:aload_1         
	//   13   29:ldc1            #56  <String "GLMapGestrureDetector">
	//   14   31:ldc1            #141 <String "onMoveBegin">
	//   15   33:invokestatic    #63  <Method void hm.c(Throwable, String, String)>
			((Throwable) (aq1)).printStackTrace();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #66  <Method void Throwable.printStackTrace()>
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		}
		if(!flag)
		{
			return true;
		} else
		{
			b.mGestureState = 1;
	//   20   42:aload_0         
	//   21   43:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   22   46:iconst_1        
	//   23   47:putfield        #70  <Field int EAMapPlatformGestureInfo.mGestureState>
			b.mGestureType = 3;
	//   24   50:aload_0         
	//   25   51:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   26   54:iconst_3        
	//   27   55:putfield        #73  <Field int EAMapPlatformGestureInfo.mGestureType>
			b.mLocation = (new float[] {
				aq1.c().getX(), aq1.c().getY()
			});
	//   28   58:aload_0         
	//   29   59:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   30   62:iconst_2        
	//   31   63:newarray        float[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:aload_1         
	//   35   68:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   36   71:invokevirtual   #84  <Method float MotionEvent.getX()>
	//   37   74:fastore         
	//   38   75:dup             
	//   39   76:iconst_1        
	//   40   77:aload_1         
	//   41   78:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   42   81:invokevirtual   #87  <Method float MotionEvent.getY()>
	//   43   84:fastore         
	//   44   85:putfield        #91  <Field float[] EAMapPlatformGestureInfo.mLocation>
			int i = a.a.a(b);
	//   45   88:aload_0         
	//   46   89:getfield        #17  <Field o a>
	//   47   92:getfield        #39  <Field s o.a>
	//   48   95:aload_0         
	//   49   96:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   50   99:invokeinterface #94  <Method int s.a(EAMapPlatformGestureInfo)>
	//   51  104:istore_2        
			a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (MoveGestureMapMessage.obtain(100, 0.0F, 0.0F))));
	//   52  105:aload_0         
	//   53  106:getfield        #17  <Field o a>
	//   54  109:getfield        #39  <Field s o.a>
	//   55  112:iload_2         
	//   56  113:bipush          100
	//   57  115:fconst_0        
	//   58  116:fconst_0        
	//   59  117:invokestatic    #133 <Method MoveGestureMapMessage MoveGestureMapMessage.obtain(int, float, float)>
	//   60  120:invokeinterface #136 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
			return true;
	//   61  125:iconst_1        
	//   62  126:ireturn         
		}
	}

	public void c(aq aq1)
	{
		boolean flag;
		try
		{
			flag = a.a.h().isScrollGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field o a>
	//    2    4:getfield        #39  <Field s o.a>
	//    3    7:invokeinterface #45  <Method v s.h()>
	//    4   12:invokeinterface #51  <Method boolean v.isScrollGesturesEnabled()>
	//    5   17:istore_3        
		}
	//*   6   18:iload_3         
	//*   7   19:ifne            23
	//*   8   22:return          
	//*   9   23:goto            40
		// Misplaced declaration of an exception variable
		catch(aq aq1)
	//*  10   26:astore_1        
		{
			hm.c(((Throwable) (aq1)), "GLMapGestrureDetector", "onMoveEnd");
	//   11   27:aload_1         
	//   12   28:ldc1            #56  <String "GLMapGestrureDetector">
	//   13   30:ldc1            #144 <String "onMoveEnd">
	//   14   32:invokestatic    #63  <Method void hm.c(Throwable, String, String)>
			((Throwable) (aq1)).printStackTrace();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #66  <Method void Throwable.printStackTrace()>
			return;
	//   17   39:return          
		}
		if(!flag)
			return;
		b.mGestureState = 3;
	//   18   40:aload_0         
	//   19   41:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   20   44:iconst_3        
	//   21   45:putfield        #70  <Field int EAMapPlatformGestureInfo.mGestureState>
		b.mGestureType = 3;
	//   22   48:aload_0         
	//   23   49:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   24   52:iconst_3        
	//   25   53:putfield        #73  <Field int EAMapPlatformGestureInfo.mGestureType>
		b.mLocation = (new float[] {
			aq1.c().getX(), aq1.c().getY()
		});
	//   26   56:aload_0         
	//   27   57:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   28   60:iconst_2        
	//   29   61:newarray        float[]
	//   30   63:dup             
	//   31   64:iconst_0        
	//   32   65:aload_1         
	//   33   66:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   34   69:invokevirtual   #84  <Method float MotionEvent.getX()>
	//   35   72:fastore         
	//   36   73:dup             
	//   37   74:iconst_1        
	//   38   75:aload_1         
	//   39   76:invokevirtual   #78  <Method MotionEvent aq.c()>
	//   40   79:invokevirtual   #87  <Method float MotionEvent.getY()>
	//   41   82:fastore         
	//   42   83:putfield        #91  <Field float[] EAMapPlatformGestureInfo.mLocation>
		int i = a.a.a(b);
	//   43   86:aload_0         
	//   44   87:getfield        #17  <Field o a>
	//   45   90:getfield        #39  <Field s o.a>
	//   46   93:aload_0         
	//   47   94:getfield        #25  <Field EAMapPlatformGestureInfo b>
	//   48   97:invokeinterface #94  <Method int s.a(EAMapPlatformGestureInfo)>
	//   49  102:istore_2        
		if(o.k(a) > 0)
	//*  50  103:aload_0         
	//*  51  104:getfield        #17  <Field o a>
	//*  52  107:invokestatic    #102 <Method int o.k(o)>
	//*  53  110:ifle            127
			a.a.a(i, 5);
	//   54  113:aload_0         
	//   55  114:getfield        #17  <Field o a>
	//   56  117:getfield        #39  <Field s o.a>
	//   57  120:iload_2         
	//   58  121:iconst_5        
	//   59  122:invokeinterface #147 <Method void s.a(int, int)>
		a.a.a(i, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (MoveGestureMapMessage.obtain(102, 0.0F, 0.0F))));
	//   60  127:aload_0         
	//   61  128:getfield        #17  <Field o a>
	//   62  131:getfield        #39  <Field s o.a>
	//   63  134:iload_2         
	//   64  135:bipush          102
	//   65  137:fconst_0        
	//   66  138:fconst_0        
	//   67  139:invokestatic    #133 <Method MoveGestureMapMessage MoveGestureMapMessage.obtain(int, float, float)>
	//   68  142:invokeinterface #136 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
	//   69  147:return          
	}

	final o a;
	private EAMapPlatformGestureInfo b;

	private o$c(o o1)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field o a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		b = new EAMapPlatformGestureInfo();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class EAMapPlatformGestureInfo>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void EAMapPlatformGestureInfo()>
	//    9   17:putfield        #25  <Field EAMapPlatformGestureInfo b>
	//   10   20:return          
	}

	o$c(o o1, o$1 o$1)
	{
		this(o1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void o$c(o)>
	//    3    5:return          
	}
}
