// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.*;

// Referenced classes of package com.irobot.home.view:
//			GestureImageView, e

private class GestureImageView$c
	implements android.view.r
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(GestureImageView.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field GestureImageView a>
	//*   2    4:invokestatic    #34  <Method boolean GestureImageView.a(GestureImageView)>
	//*   3    7:ifeq            22
			GestureImageView.b(a).onTouchEvent(motionevent);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field GestureImageView a>
	//    6   14:invokestatic    #37  <Method ScaleGestureDetector GestureImageView.b(GestureImageView)>
	//    7   17:aload_2         
	//    8   18:invokevirtual   #43  <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
	//    9   21:pop             
		if(GestureImageView.c(a))
	//*  10   22:aload_0         
	//*  11   23:getfield        #17  <Field GestureImageView a>
	//*  12   26:invokestatic    #45  <Method boolean GestureImageView.c(GestureImageView)>
	//*  13   29:ifeq            44
			GestureImageView.d(a).a(motionevent);
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field GestureImageView a>
	//   16   36:invokestatic    #49  <Method e GestureImageView.d(GestureImageView)>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #53  <Method boolean e.a(MotionEvent)>
	//   19   43:pop             
		if(GestureImageView.e(a))
	//*  20   44:aload_0         
	//*  21   45:getfield        #17  <Field GestureImageView a>
	//*  22   48:invokestatic    #56  <Method boolean GestureImageView.e(GestureImageView)>
	//*  23   51:ifeq            66
			GestureImageView.f(a).onTouchEvent(motionevent);
	//   24   54:aload_0         
	//   25   55:getfield        #17  <Field GestureImageView a>
	//   26   58:invokestatic    #60  <Method GestureDetector GestureImageView.f(GestureImageView)>
	//   27   61:aload_2         
	//   28   62:invokevirtual   #63  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//   29   65:pop             
		if(!GestureImageView.g(a)) goto _L2; else goto _L1
	//   30   66:aload_0         
	//   31   67:getfield        #17  <Field GestureImageView a>
	//   32   70:invokestatic    #66  <Method boolean GestureImageView.g(GestureImageView)>
	//   33   73:ifeq            297
_L1:
		view = ((View) (new PointF(motionevent.getX(), motionevent.getY())));
	//   34   76:new             #22  <Class PointF>
	//   35   79:dup             
	//   36   80:aload_2         
	//   37   81:invokevirtual   #72  <Method float MotionEvent.getX()>
	//   38   84:aload_2         
	//   39   85:invokevirtual   #75  <Method float MotionEvent.getY()>
	//   40   88:invokespecial   #78  <Method void PointF(float, float)>
	//   41   91:astore_1        
		if(GestureImageView.h(a) != GestureImageView$g.NONE && GestureImageView.h(a) != GestureImageView$g.DRAG) goto _L2; else goto _L3
	//   42   92:aload_0         
	//   43   93:getfield        #17  <Field GestureImageView a>
	//   44   96:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
	//   45   99:getstatic       #88  <Field GestureImageView$g GestureImageView$g.NONE>
	//   46  102:if_acmpeq       118
	//   47  105:aload_0         
	//   48  106:getfield        #17  <Field GestureImageView a>
	//   49  109:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
	//   50  112:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
	//   51  115:if_acmpne       297
_L3:
		int i = motionevent.getActionMasked();
	//   52  118:aload_2         
	//   53  119:invokevirtual   #95  <Method int MotionEvent.getActionMasked()>
	//   54  122:istore          5
		if(i == 6) goto _L5; else goto _L4
	//   55  124:iload           5
	//   56  126:bipush          6
	//   57  128:icmpeq          285
_L4:
		i;
	//   58  131:iload           5
		JVM INSTR tableswitch 0 2: default 160
	//	               0 260
	//	               1 285
	//	               2 163;
	//   59  133:tableswitch     0 2: default 160
	//	               0 260
	//	               1 285
	//	               2 163
		   goto _L2 _L6 _L5 _L7
	//*  60  160:goto            297
_L7:
		if(GestureImageView.h(a) == GestureImageView$g.DRAG)
	//*  61  163:aload_0         
	//*  62  164:getfield        #17  <Field GestureImageView a>
	//*  63  167:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
	//*  64  170:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
	//*  65  173:if_acmpne       297
		{
			float f = ((PointF) (view)).x - b.x;
	//   66  176:aload_1         
	//   67  177:getfield        #99  <Field float PointF.x>
	//   68  180:aload_0         
	//   69  181:getfield        #25  <Field PointF b>
	//   70  184:getfield        #99  <Field float PointF.x>
	//   71  187:fsub            
	//   72  188:fstore_3        
			float f1 = ((PointF) (view)).y - b.y;
	//   73  189:aload_1         
	//   74  190:getfield        #102 <Field float PointF.y>
	//   75  193:aload_0         
	//   76  194:getfield        #25  <Field PointF b>
	//   77  197:getfield        #102 <Field float PointF.y>
	//   78  200:fsub            
	//   79  201:fstore          4
			GestureImageView.i(a).postTranslate(f, f1);
	//   80  203:aload_0         
	//   81  204:getfield        #17  <Field GestureImageView a>
	//   82  207:invokestatic    #106 <Method Matrix GestureImageView.i(GestureImageView)>
	//   83  210:fload_3         
	//   84  211:fload           4
	//   85  213:invokevirtual   #112 <Method boolean Matrix.postTranslate(float, float)>
	//   86  216:pop             
			b.set(((PointF) (view)).x, ((PointF) (view)).y);
	//   87  217:aload_0         
	//   88  218:getfield        #25  <Field PointF b>
	//   89  221:aload_1         
	//   90  222:getfield        #99  <Field float PointF.x>
	//   91  225:aload_1         
	//   92  226:getfield        #102 <Field float PointF.y>
	//   93  229:invokevirtual   #115 <Method void PointF.set(float, float)>
			if(GestureImageView.j(a) != null)
	//*  94  232:aload_0         
	//*  95  233:getfield        #17  <Field GestureImageView a>
	//*  96  236:invokestatic    #119 <Method GestureImageView$d GestureImageView.j(GestureImageView)>
	//*  97  239:ifnull          297
				GestureImageView.j(a).a(f, f1);
	//   98  242:aload_0         
	//   99  243:getfield        #17  <Field GestureImageView a>
	//  100  246:invokestatic    #119 <Method GestureImageView$d GestureImageView.j(GestureImageView)>
	//  101  249:fload_3         
	//  102  250:fload           4
	//  103  252:invokeinterface #123 <Method void GestureImageView$d.a(float, float)>
		}
		  goto _L2
	//* 104  257:goto            297
_L6:
		b.set(((PointF) (view)));
	//  105  260:aload_0         
	//  106  261:getfield        #25  <Field PointF b>
	//  107  264:aload_1         
	//  108  265:invokevirtual   #126 <Method void PointF.set(PointF)>
		view = ((View) (a));
	//  109  268:aload_0         
	//  110  269:getfield        #17  <Field GestureImageView a>
	//  111  272:astore_1        
		motionevent = ((MotionEvent) (GestureImageView$g.DRAG));
	//  112  273:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
	//  113  276:astore_2        
_L8:
		GestureImageView.a(((GestureImageView) (view)), ((GestureImageView$g) (motionevent)));
	//  114  277:aload_1         
	//  115  278:aload_2         
	//  116  279:invokestatic    #129 <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		break; /* Loop/switch isn't completed */
	//  117  282:goto            297
_L5:
		view = ((View) (a));
	//  118  285:aload_0         
	//  119  286:getfield        #17  <Field GestureImageView a>
	//  120  289:astore_1        
		motionevent = ((MotionEvent) (GestureImageView$g.NONE));
	//  121  290:getstatic       #88  <Field GestureImageView$g GestureImageView$g.NONE>
	//  122  293:astore_2        
		if(true) goto _L8; else goto _L2
	//  123  294:goto            277
_L2:
		a.setImageMatrix(GestureImageView.i(a));
	//  124  297:aload_0         
	//  125  298:getfield        #17  <Field GestureImageView a>
	//  126  301:aload_0         
	//  127  302:getfield        #17  <Field GestureImageView a>
	//  128  305:invokestatic    #106 <Method Matrix GestureImageView.i(GestureImageView)>
	//  129  308:invokevirtual   #133 <Method void GestureImageView.setImageMatrix(Matrix)>
		return true;
	//  130  311:iconst_1        
	//  131  312:ireturn         
	}

	final GestureImageView a;
	private PointF b;

	private GestureImageView$c(GestureImageView gestureimageview)
	{
		a = gestureimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GestureImageView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		b = new PointF();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class PointF>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void PointF()>
	//    9   17:putfield        #25  <Field PointF b>
	//   10   20:return          
	}

	GestureImageView$c(GestureImageView gestureimageview, GestureImageView$1 gestureimageview$1)
	{
		this(gestureimageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void GestureImageView$c(GestureImageView)>
	//    3    5:return          
	}
}
