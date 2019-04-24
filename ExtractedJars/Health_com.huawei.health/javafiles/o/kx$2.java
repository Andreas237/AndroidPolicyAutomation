// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.RectF;
import android.view.MotionEvent;

// Referenced classes of package o:
//			kx, ko, kp

class kx$2
	implements android.view.reDetector.OnDoubleTapListener
{

	public boolean onDoubleTap(MotionEvent motionevent)
	{
		float f;
		float f1;
		float f2;
		f = d.b();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field kx d>
	//    2    4:invokevirtual   #28  <Method float kx.b()>
	//    3    7:fstore_2        
		f1 = motionevent.getX();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #33  <Method float MotionEvent.getX()>
	//    6   12:fstore_3        
		f2 = motionevent.getY();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #36  <Method float MotionEvent.getY()>
	//    9   17:fstore          4
		if(f < d.e())
	//*  10   19:fload_2         
	//*  11   20:aload_0         
	//*  12   21:getfield        #16  <Field kx d>
	//*  13   24:invokevirtual   #39  <Method float kx.e()>
	//*  14   27:fcmpg           
	//*  15   28:ifge            52
		{
			d.d(d.e(), f1, f2, true);
	//   16   31:aload_0         
	//   17   32:getfield        #16  <Field kx d>
	//   18   35:aload_0         
	//   19   36:getfield        #16  <Field kx d>
	//   20   39:invokevirtual   #39  <Method float kx.e()>
	//   21   42:fload_3         
	//   22   43:fload           4
	//   23   45:iconst_1        
	//   24   46:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
			break MISSING_BLOCK_LABEL_119;
	//   25   49:goto            115
		}
		if(f >= d.e() && f < d.d())
	//*  26   52:fload_2         
	//*  27   53:aload_0         
	//*  28   54:getfield        #16  <Field kx d>
	//*  29   57:invokevirtual   #39  <Method float kx.e()>
	//*  30   60:fcmpl           
	//*  31   61:iflt            97
	//*  32   64:fload_2         
	//*  33   65:aload_0         
	//*  34   66:getfield        #16  <Field kx d>
	//*  35   69:invokevirtual   #44  <Method float kx.d()>
	//*  36   72:fcmpg           
	//*  37   73:ifge            97
		{
			d.d(d.d(), f1, f2, true);
	//   38   76:aload_0         
	//   39   77:getfield        #16  <Field kx d>
	//   40   80:aload_0         
	//   41   81:getfield        #16  <Field kx d>
	//   42   84:invokevirtual   #44  <Method float kx.d()>
	//   43   87:fload_3         
	//   44   88:fload           4
	//   45   90:iconst_1        
	//   46   91:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
			break MISSING_BLOCK_LABEL_119;
	//   47   94:goto            115
		}
		try
		{
			d.d(d.c(), f1, f2, true);
	//   48   97:aload_0         
	//   49   98:getfield        #16  <Field kx d>
	//   50  101:aload_0         
	//   51  102:getfield        #16  <Field kx d>
	//   52  105:invokevirtual   #47  <Method float kx.c()>
	//   53  108:fload_3         
	//   54  109:fload           4
	//   55  111:iconst_1        
	//   56  112:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
		}
	//*  57  115:goto            119
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent) { }
	//   58  118:astore_1        
		return true;
	//   59  119:iconst_1        
	//   60  120:ireturn         
	}

	public boolean onDoubleTapEvent(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onSingleTapConfirmed(MotionEvent motionevent)
	{
		if(kx.b(d) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field kx d>
	//*   2    4:invokestatic    #52  <Method android.view.View$OnClickListener kx.b(kx)>
	//*   3    7:ifnull          29
			kx.b(d).onClick(((android.view.View) (kx.c(d))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field kx d>
	//    6   14:invokestatic    #52  <Method android.view.View$OnClickListener kx.b(kx)>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field kx d>
	//    9   21:invokestatic    #55  <Method android.widget.ImageView kx.c(kx)>
	//   10   24:invokeinterface #61  <Method void android.view.View$OnClickListener.onClick(android.view.View)>
		RectF rectf = d.a();
	//   11   29:aload_0         
	//   12   30:getfield        #16  <Field kx d>
	//   13   33:invokevirtual   #65  <Method RectF kx.a()>
	//   14   36:astore          4
		if(rectf != null)
	//*  15   38:aload           4
	//*  16   40:ifnull          153
		{
			float f1 = motionevent.getX();
	//   17   43:aload_1         
	//   18   44:invokevirtual   #33  <Method float MotionEvent.getX()>
	//   19   47:fstore_3        
			float f = motionevent.getY();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #36  <Method float MotionEvent.getY()>
	//   22   52:fstore_2        
			if(rectf.contains(f1, f))
	//*  23   53:aload           4
	//*  24   55:fload_3         
	//*  25   56:fload_2         
	//*  26   57:invokevirtual   #71  <Method boolean RectF.contains(float, float)>
	//*  27   60:ifeq            124
			{
				f1 = (f1 - rectf.left) / rectf.width();
	//   28   63:fload_3         
	//   29   64:aload           4
	//   30   66:getfield        #75  <Field float RectF.left>
	//   31   69:fsub            
	//   32   70:aload           4
	//   33   72:invokevirtual   #78  <Method float RectF.width()>
	//   34   75:fdiv            
	//   35   76:fstore_3        
				f = (f - rectf.top) / rectf.height();
	//   36   77:fload_2         
	//   37   78:aload           4
	//   38   80:getfield        #81  <Field float RectF.top>
	//   39   83:fsub            
	//   40   84:aload           4
	//   41   86:invokevirtual   #84  <Method float RectF.height()>
	//   42   89:fdiv            
	//   43   90:fstore_2        
				if(kx.e(d) != null)
	//*  44   91:aload_0         
	//*  45   92:getfield        #16  <Field kx d>
	//*  46   95:invokestatic    #87  <Method ko kx.e(kx)>
	//*  47   98:ifnull          122
					kx.e(d).e(kx.c(d), f1, f);
	//   48  101:aload_0         
	//   49  102:getfield        #16  <Field kx d>
	//   50  105:invokestatic    #87  <Method ko kx.e(kx)>
	//   51  108:aload_0         
	//   52  109:getfield        #16  <Field kx d>
	//   53  112:invokestatic    #55  <Method android.widget.ImageView kx.c(kx)>
	//   54  115:fload_3         
	//   55  116:fload_2         
	//   56  117:invokeinterface #92  <Method void ko.e(android.widget.ImageView, float, float)>
				return true;
	//   57  122:iconst_1        
	//   58  123:ireturn         
			}
			if(kx.g(d) != null)
	//*  59  124:aload_0         
	//*  60  125:getfield        #16  <Field kx d>
	//*  61  128:invokestatic    #96  <Method kp kx.g(kx)>
	//*  62  131:ifnull          153
				kx.g(d).d(kx.c(d));
	//   63  134:aload_0         
	//   64  135:getfield        #16  <Field kx d>
	//   65  138:invokestatic    #96  <Method kp kx.g(kx)>
	//   66  141:aload_0         
	//   67  142:getfield        #16  <Field kx d>
	//   68  145:invokestatic    #55  <Method android.widget.ImageView kx.c(kx)>
	//   69  148:invokeinterface #100 <Method void kp.d(android.widget.ImageView)>
		}
		return false;
	//   70  153:iconst_0        
	//   71  154:ireturn         
	}

	final kx d;

	kx$2(kx kx1)
	{
		d = kx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field kx d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
