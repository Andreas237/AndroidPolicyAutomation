// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

// Referenced classes of package com.amap.api.mapcore.util:
//			ao

public abstract class an extends ao
{

	public an(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ao(Context)>
		q = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #24  <Field float q>
		r = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #26  <Field float r>
		s = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #28  <Field float s>
		t = 0.0F;
	//   12   20:aload_0         
	//   13   21:fconst_0        
	//   14   22:putfield        #30  <Field float t>
		l = ViewConfiguration.get(context).getScaledEdgeSlop();
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokestatic    #36  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   18   30:invokevirtual   #40  <Method int ViewConfiguration.getScaledEdgeSlop()>
	//   19   33:i2f             
	//   20   34:putfield        #42  <Field float l>
	//   21   37:return          
	}

	protected static float a(MotionEvent motionevent, int i)
	{
		float f = motionevent.getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method float MotionEvent.getX()>
	//    2    4:fstore_2        
		float f1 = motionevent.getRawX();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #53  <Method float MotionEvent.getRawX()>
	//    5    9:fstore_3        
		if(i < motionevent.getPointerCount())
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #56  <Method int MotionEvent.getPointerCount()>
	//*   9   15:icmpge          28
			return motionevent.getX(i) + (f - f1);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #59  <Method float MotionEvent.getX(int)>
	//   13   23:fload_2         
	//   14   24:fload_3         
	//   15   25:fsub            
	//   16   26:fadd            
	//   17   27:freturn         
		else
			return 0.0F;
	//   18   28:fconst_0        
	//   19   29:freturn         
	}

	protected static float b(MotionEvent motionevent, int i)
	{
		float f = motionevent.getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method float MotionEvent.getY()>
	//    2    4:fstore_2        
		float f1 = motionevent.getRawY();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #65  <Method float MotionEvent.getRawY()>
	//    5    9:fstore_3        
		if(i < motionevent.getPointerCount())
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #56  <Method int MotionEvent.getPointerCount()>
	//*   9   15:icmpge          28
			return motionevent.getY(i) + (f - f1);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #67  <Method float MotionEvent.getY(int)>
	//   13   23:fload_2         
	//   14   24:fload_3         
	//   15   25:fsub            
	//   16   26:fadd            
	//   17   27:freturn         
		else
			return 0.0F;
	//   18   28:fconst_0        
	//   19   29:freturn         
	}

	public PointF a(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            20
			return new PointF(q, r);
	//    2    4:new             #70  <Class PointF>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field float q>
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field float r>
	//    8   16:invokespecial   #73  <Method void PointF(float, float)>
	//    9   19:areturn         
		else
			return new PointF(s, t);
	//   10   20:new             #70  <Class PointF>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #28  <Field float s>
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field float t>
	//   16   32:invokespecial   #73  <Method void PointF(float, float)>
	//   17   35:areturn         
	}

	protected void a(MotionEvent motionevent)
	{
		super.a(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void ao.a(MotionEvent)>
		MotionEvent motionevent1 = g;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field MotionEvent g>
	//    5    9:astore          12
		int i = g.getPointerCount();
	//    6   11:aload_0         
	//    7   12:getfield        #80  <Field MotionEvent g>
	//    8   15:invokevirtual   #56  <Method int MotionEvent.getPointerCount()>
	//    9   18:istore          10
		int j = motionevent.getPointerCount();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #56  <Method int MotionEvent.getPointerCount()>
	//   12   24:istore          11
		if(j != 2 || j != i)
	//*  13   26:iload           11
	//*  14   28:iconst_2        
	//*  15   29:icmpne          39
	//*  16   32:iload           11
	//*  17   34:iload           10
	//*  18   36:icmpeq          40
		{
			return;
	//   19   39:return          
		} else
		{
			o = -1F;
	//   20   40:aload_0         
	//   21   41:ldc1            #81  <Float -1F>
	//   22   43:putfield        #83  <Field float o>
			p = -1F;
	//   23   46:aload_0         
	//   24   47:ldc1            #81  <Float -1F>
	//   25   49:putfield        #85  <Field float p>
			float f = motionevent1.getX(0);
	//   26   52:aload           12
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #59  <Method float MotionEvent.getX(int)>
	//   29   58:fstore_2        
			float f1 = motionevent1.getY(0);
	//   30   59:aload           12
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #67  <Method float MotionEvent.getY(int)>
	//   33   65:fstore_3        
			float f2 = motionevent1.getX(1);
	//   34   66:aload           12
	//   35   68:iconst_1        
	//   36   69:invokevirtual   #59  <Method float MotionEvent.getX(int)>
	//   37   72:fstore          4
			float f3 = motionevent1.getY(1);
	//   38   74:aload           12
	//   39   76:iconst_1        
	//   40   77:invokevirtual   #67  <Method float MotionEvent.getY(int)>
	//   41   80:fstore          5
			a = f2 - f;
	//   42   82:aload_0         
	//   43   83:fload           4
	//   44   85:fload_2         
	//   45   86:fsub            
	//   46   87:putfield        #87  <Field float a>
			b = f3 - f1;
	//   47   90:aload_0         
	//   48   91:fload           5
	//   49   93:fload_3         
	//   50   94:fsub            
	//   51   95:putfield        #89  <Field float b>
			float f4 = motionevent.getX(0);
	//   52   98:aload_1         
	//   53   99:iconst_0        
	//   54  100:invokevirtual   #59  <Method float MotionEvent.getX(int)>
	//   55  103:fstore          6
			float f5 = motionevent.getY(0);
	//   56  105:aload_1         
	//   57  106:iconst_0        
	//   58  107:invokevirtual   #67  <Method float MotionEvent.getY(int)>
	//   59  110:fstore          7
			float f6 = motionevent.getX(1);
	//   60  112:aload_1         
	//   61  113:iconst_1        
	//   62  114:invokevirtual   #59  <Method float MotionEvent.getX(int)>
	//   63  117:fstore          8
			float f7 = motionevent.getY(1);
	//   64  119:aload_1         
	//   65  120:iconst_1        
	//   66  121:invokevirtual   #67  <Method float MotionEvent.getY(int)>
	//   67  124:fstore          9
			c = f6 - f4;
	//   68  126:aload_0         
	//   69  127:fload           8
	//   70  129:fload           6
	//   71  131:fsub            
	//   72  132:putfield        #91  <Field float c>
			d = f7 - f5;
	//   73  135:aload_0         
	//   74  136:fload           9
	//   75  138:fload           7
	//   76  140:fsub            
	//   77  141:putfield        #93  <Field float d>
			q = f4 - f;
	//   78  144:aload_0         
	//   79  145:fload           6
	//   80  147:fload_2         
	//   81  148:fsub            
	//   82  149:putfield        #24  <Field float q>
			r = f5 - f1;
	//   83  152:aload_0         
	//   84  153:fload           7
	//   85  155:fload_3         
	//   86  156:fsub            
	//   87  157:putfield        #26  <Field float r>
			s = f6 - f2;
	//   88  160:aload_0         
	//   89  161:fload           8
	//   90  163:fload           4
	//   91  165:fsub            
	//   92  166:putfield        #28  <Field float s>
			t = f7 - f3;
	//   93  169:aload_0         
	//   94  170:fload           9
	//   95  172:fload           5
	//   96  174:fsub            
	//   97  175:putfield        #30  <Field float t>
			return;
	//   98  178:return          
		}
	}

	protected boolean b(MotionEvent motionevent)
	{
		DisplayMetrics displaymetrics = e.getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Context e>
	//    2    4:invokevirtual   #104 <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #110 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   10:astore          11
		m = (float)displaymetrics.widthPixels - l;
	//    5   12:aload_0         
	//    6   13:aload           11
	//    7   15:getfield        #116 <Field int DisplayMetrics.widthPixels>
	//    8   18:i2f             
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field float l>
	//   11   23:fsub            
	//   12   24:putfield        #118 <Field float m>
		n = (float)displaymetrics.heightPixels - l;
	//   13   27:aload_0         
	//   14   28:aload           11
	//   15   30:getfield        #121 <Field int DisplayMetrics.heightPixels>
	//   16   33:i2f             
	//   17   34:aload_0         
	//   18   35:getfield        #42  <Field float l>
	//   19   38:fsub            
	//   20   39:putfield        #123 <Field float n>
		float f = l;
	//   21   42:aload_0         
	//   22   43:getfield        #42  <Field float l>
	//   23   46:fstore_2        
		float f1 = m;
	//   24   47:aload_0         
	//   25   48:getfield        #118 <Field float m>
	//   26   51:fstore_3        
		float f2 = n;
	//   27   52:aload_0         
	//   28   53:getfield        #123 <Field float n>
	//   29   56:fstore          4
		float f3 = motionevent.getRawX();
	//   30   58:aload_1         
	//   31   59:invokevirtual   #53  <Method float MotionEvent.getRawX()>
	//   32   62:fstore          5
		float f4 = motionevent.getRawY();
	//   33   64:aload_1         
	//   34   65:invokevirtual   #65  <Method float MotionEvent.getRawY()>
	//   35   68:fstore          6
		float f5 = a(motionevent, 1);
	//   36   70:aload_1         
	//   37   71:iconst_1        
	//   38   72:invokestatic    #125 <Method float a(MotionEvent, int)>
	//   39   75:fstore          7
		float f6 = b(motionevent, 1);
	//   40   77:aload_1         
	//   41   78:iconst_1        
	//   42   79:invokestatic    #127 <Method float b(MotionEvent, int)>
	//   43   82:fstore          8
		boolean flag;
		if(f3 < f || f4 < f || f3 > f1 || f4 > f2)
	//*  44   84:fload           5
	//*  45   86:fload_2         
	//*  46   87:fcmpg           
	//*  47   88:iflt            113
	//*  48   91:fload           6
	//*  49   93:fload_2         
	//*  50   94:fcmpg           
	//*  51   95:iflt            113
	//*  52   98:fload           5
	//*  53  100:fload_3         
	//*  54  101:fcmpl           
	//*  55  102:ifgt            113
	//*  56  105:fload           6
	//*  57  107:fload           4
	//*  58  109:fcmpl           
	//*  59  110:ifle            119
			flag = true;
	//   60  113:iconst_1        
	//   61  114:istore          9
		else
	//*  62  116:goto            122
			flag = false;
	//   63  119:iconst_0        
	//   64  120:istore          9
		boolean flag1;
		if(f5 < f || f6 < f || f5 > f1 || f6 > f2)
	//*  65  122:fload           7
	//*  66  124:fload_2         
	//*  67  125:fcmpg           
	//*  68  126:iflt            151
	//*  69  129:fload           8
	//*  70  131:fload_2         
	//*  71  132:fcmpg           
	//*  72  133:iflt            151
	//*  73  136:fload           7
	//*  74  138:fload_3         
	//*  75  139:fcmpl           
	//*  76  140:ifgt            151
	//*  77  143:fload           8
	//*  78  145:fload           4
	//*  79  147:fcmpl           
	//*  80  148:ifle            157
			flag1 = true;
	//   81  151:iconst_1        
	//   82  152:istore          10
		else
	//*  83  154:goto            160
			flag1 = false;
	//   84  157:iconst_0        
	//   85  158:istore          10
		if(flag && flag1)
	//*  86  160:iload           9
	//*  87  162:ifeq            172
	//*  88  165:iload           10
	//*  89  167:ifeq            172
			return true;
	//   90  170:iconst_1        
	//   91  171:ireturn         
		if(flag)
	//*  92  172:iload           9
	//*  93  174:ifeq            179
			return true;
	//   94  177:iconst_1        
	//   95  178:ireturn         
		return flag1;
	//   96  179:iload           10
	//   97  181:ifeq            186
	//   98  184:iconst_1        
	//   99  185:ireturn         
	//  100  186:iconst_0        
	//  101  187:ireturn         
	}

	protected float a;
	protected float b;
	protected float c;
	protected float d;
	private final float l;
	private float m;
	private float n;
	private float o;
	private float p;
	private float q;
	private float r;
	private float s;
	private float t;
}
