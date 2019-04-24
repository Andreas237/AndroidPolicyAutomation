// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import com.irobot.home.util.o;
import java.util.Queue;

// Referenced classes of package com.irobot.home.b:
//			ak

class ak$2
	implements android.view.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(ak.a(a) < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ak a>
	//*   2    4:invokestatic    #29  <Method int ak.a(ak)>
	//*   3    7:ifge            20
		{
			o.b(ak.d(), "Swiped off list, cancel on touch listener");
	//    4   10:invokestatic    #33  <Method String ak.d()>
	//    5   13:ldc1            #35  <String "Swiped off list, cancel on touch listener">
	//    6   15:invokestatic    #40  <Method void o.b(String, String)>
			return false;
	//    7   18:iconst_0        
	//    8   19:ireturn         
		}
		view = ((View) (ak.b(a).c(ak.a(a))));
	//    9   20:aload_0         
	//   10   21:getfield        #17  <Field ak a>
	//   11   24:invokestatic    #43  <Method RecyclerView ak.b(ak)>
	//   12   27:aload_0         
	//   13   28:getfield        #17  <Field ak a>
	//   14   31:invokestatic    #29  <Method int ak.a(ak)>
	//   15   34:invokevirtual   #48  <Method android.support.v7.widget.RecyclerView$u RecyclerView.c(int)>
	//   16   37:astore_1        
		if(view == null)
	//*  17   38:aload_1         
	//*  18   39:ifnonnull       44
			return false;
	//   19   42:iconst_0        
	//   20   43:ireturn         
		Rect rect = new Rect();
	//   21   44:new             #50  <Class Rect>
	//   22   47:dup             
	//   23   48:invokespecial   #51  <Method void Rect()>
	//   24   51:astore_3        
		((android.support.v7.widget.lerView.u) (view)).a.getGlobalVisibleRect(rect);
	//   25   52:aload_1         
	//   26   53:getfield        #56  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   27   56:aload_3         
	//   28   57:invokevirtual   #62  <Method boolean View.getGlobalVisibleRect(Rect)>
	//   29   60:pop             
		if(motionevent.getAction() == 0)
	//*  30   61:aload_2         
	//*  31   62:invokevirtual   #68  <Method int MotionEvent.getAction()>
	//*  32   65:ifne            92
			b = new Point((int)motionevent.getRawX(), (int)motionevent.getRawY());
	//   33   68:aload_0         
	//   34   69:new             #70  <Class Point>
	//   35   72:dup             
	//   36   73:aload_2         
	//   37   74:invokevirtual   #74  <Method float MotionEvent.getRawX()>
	//   38   77:f2i             
	//   39   78:aload_2         
	//   40   79:invokevirtual   #77  <Method float MotionEvent.getRawY()>
	//   41   82:f2i             
	//   42   83:invokespecial   #80  <Method void Point(int, int)>
	//   43   86:putfield        #82  <Field Point b>
		else
	//*  44   89:goto            221
		if(motionevent.getAction() == 1)
	//*  45   92:aload_2         
	//*  46   93:invokevirtual   #68  <Method int MotionEvent.getAction()>
	//*  47   96:iconst_1        
	//*  48   97:icmpne          221
		{
			c = new Point((int)motionevent.getRawX(), (int)motionevent.getRawY());
	//   49  100:aload_0         
	//   50  101:new             #70  <Class Point>
	//   51  104:dup             
	//   52  105:aload_2         
	//   53  106:invokevirtual   #74  <Method float MotionEvent.getRawX()>
	//   54  109:f2i             
	//   55  110:aload_2         
	//   56  111:invokevirtual   #77  <Method float MotionEvent.getRawY()>
	//   57  114:f2i             
	//   58  115:invokespecial   #80  <Method void Point(int, int)>
	//   59  118:putfield        #84  <Field Point c>
			if(ak.a(a, b, c))
	//*  60  121:aload_0         
	//*  61  122:getfield        #17  <Field ak a>
	//*  62  125:aload_0         
	//*  63  126:getfield        #82  <Field Point b>
	//*  64  129:aload_0         
	//*  65  130:getfield        #84  <Field Point c>
	//*  66  133:invokestatic    #87  <Method boolean ak.a(ak, Point, Point)>
	//*  67  136:ifeq            221
				if(rect.top < c.y && rect.bottom > c.y)
	//*  68  139:aload_3         
	//*  69  140:getfield        #91  <Field int Rect.top>
	//*  70  143:aload_0         
	//*  71  144:getfield        #84  <Field Point c>
	//*  72  147:getfield        #94  <Field int Point.y>
	//*  73  150:icmpge          182
	//*  74  153:aload_3         
	//*  75  154:getfield        #97  <Field int Rect.bottom>
	//*  76  157:aload_0         
	//*  77  158:getfield        #84  <Field Point c>
	//*  78  161:getfield        #94  <Field int Point.y>
	//*  79  164:icmple          182
				{
					ak.c(a).onTouchEvent(motionevent);
	//   80  167:aload_0         
	//   81  168:getfield        #17  <Field ak a>
	//   82  171:invokestatic    #100 <Method GestureDetector ak.c(ak)>
	//   83  174:aload_2         
	//   84  175:invokevirtual   #106 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//   85  178:pop             
				} else
	//*  86  179:goto            221
				{
					ak.d(a).add(((Object) (Integer.valueOf(ak.a(a)))));
	//   87  182:aload_0         
	//   88  183:getfield        #17  <Field ak a>
	//   89  186:invokestatic    #109 <Method Queue ak.d(ak)>
	//   90  189:aload_0         
	//   91  190:getfield        #17  <Field ak a>
	//   92  193:invokestatic    #29  <Method int ak.a(ak)>
	//   93  196:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   94  199:invokeinterface #121 <Method boolean Queue.add(Object)>
	//   95  204:pop             
					ak.a(a, -1);
	//   96  205:aload_0         
	//   97  206:getfield        #17  <Field ak a>
	//   98  209:iconst_m1       
	//   99  210:invokestatic    #124 <Method int ak.a(ak, int)>
	//  100  213:pop             
					ak.e(a);
	//  101  214:aload_0         
	//  102  215:getfield        #17  <Field ak a>
	//  103  218:invokestatic    #127 <Method void ak.e(ak)>
				}
		}
		if((motionevent.getAction() == 0 || motionevent.getAction() == 1 || motionevent.getAction() == 2) && b != null && rect.top < b.y && rect.bottom > b.y)
	//* 104  221:aload_2         
	//* 105  222:invokevirtual   #68  <Method int MotionEvent.getAction()>
	//* 106  225:ifeq            244
	//* 107  228:aload_2         
	//* 108  229:invokevirtual   #68  <Method int MotionEvent.getAction()>
	//* 109  232:iconst_1        
	//* 110  233:icmpeq          244
	//* 111  236:aload_2         
	//* 112  237:invokevirtual   #68  <Method int MotionEvent.getAction()>
	//* 113  240:iconst_2        
	//* 114  241:icmpne          291
	//* 115  244:aload_0         
	//* 116  245:getfield        #82  <Field Point b>
	//* 117  248:ifnull          291
	//* 118  251:aload_3         
	//* 119  252:getfield        #91  <Field int Rect.top>
	//* 120  255:aload_0         
	//* 121  256:getfield        #82  <Field Point b>
	//* 122  259:getfield        #94  <Field int Point.y>
	//* 123  262:icmpge          291
	//* 124  265:aload_3         
	//* 125  266:getfield        #97  <Field int Rect.bottom>
	//* 126  269:aload_0         
	//* 127  270:getfield        #82  <Field Point b>
	//* 128  273:getfield        #94  <Field int Point.y>
	//* 129  276:icmple          291
			ak.c(a).onTouchEvent(motionevent);
	//  130  279:aload_0         
	//  131  280:getfield        #17  <Field ak a>
	//  132  283:invokestatic    #100 <Method GestureDetector ak.c(ak)>
	//  133  286:aload_2         
	//  134  287:invokevirtual   #106 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//  135  290:pop             
		return false;
	//  136  291:iconst_0        
	//  137  292:ireturn         
	}

	final ak a;
	private Point b;
	private Point c;

	ak$2(ak ak1)
	{
		a = ak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ak a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
