// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.MotionEvent;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;

// Referenced classes of package com.amap.api.mapcore.util:
//			o, s, v, hm, 
//			at

class o$e extends 
{

	public void a(at at1)
	{
		boolean flag;
		try
		{
			flag = b.a.h().isZoomGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field o b>
	//    2    4:getfield        #33  <Field s o.a>
	//    3    7:invokeinterface #39  <Method v s.h()>
	//    4   12:invokeinterface #45  <Method boolean v.isZoomGesturesEnabled()>
	//    5   17:istore_3        
		}
	//*   6   18:iload_3         
	//*   7   19:ifne            23
	//*   8   22:return          
	//*   9   23:goto            40
		// Misplaced declaration of an exception variable
		catch(at at1)
	//*  10   26:astore_1        
		{
			hm.c(((Throwable) (at1)), "GLMapGestrureDetector", "onZoomOut");
	//   11   27:aload_1         
	//   12   28:ldc1            #47  <String "GLMapGestrureDetector">
	//   13   30:ldc1            #49  <String "onZoomOut">
	//   14   32:invokestatic    #55  <Method void hm.c(Throwable, String, String)>
			((Throwable) (at1)).printStackTrace();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #58  <Method void Throwable.printStackTrace()>
			return;
	//   17   39:return          
		}
		if(!flag)
			return;
		if(Math.abs(at1.d()) <= 10F && Math.abs(at1.e()) <= 10F && at1.b() < 200L)
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #64  <Method float at.d()>
	//*  20   44:invokestatic    #70  <Method float Math.abs(float)>
	//*  21   47:ldc1            #71  <Float 10F>
	//*  22   49:fcmpg           
	//*  23   50:ifgt            176
	//*  24   53:aload_1         
	//*  25   54:invokevirtual   #73  <Method float at.e()>
	//*  26   57:invokestatic    #70  <Method float Math.abs(float)>
	//*  27   60:ldc1            #71  <Float 10F>
	//*  28   62:fcmpg           
	//*  29   63:ifgt            176
	//*  30   66:aload_1         
	//*  31   67:invokevirtual   #76  <Method long at.b()>
	//*  32   70:ldc2w           #77  <Long 200L>
	//*  33   73:lcmp            
	//*  34   74:ifge            176
		{
			o.c(b, true);
	//   35   77:aload_0         
	//   36   78:getfield        #15  <Field o b>
	//   37   81:iconst_1        
	//   38   82:invokestatic    #81  <Method boolean o.c(o, boolean)>
	//   39   85:pop             
			a.mGestureState = 2;
	//   40   86:aload_0         
	//   41   87:getfield        #23  <Field EAMapPlatformGestureInfo a>
	//   42   90:iconst_2        
	//   43   91:putfield        #85  <Field int EAMapPlatformGestureInfo.mGestureState>
			a.mGestureType = 2;
	//   44   94:aload_0         
	//   45   95:getfield        #23  <Field EAMapPlatformGestureInfo a>
	//   46   98:iconst_2        
	//   47   99:putfield        #88  <Field int EAMapPlatformGestureInfo.mGestureType>
			a.mLocation = (new float[] {
				at1.c().getX(), at1.c().getY()
			});
	//   48  102:aload_0         
	//   49  103:getfield        #23  <Field EAMapPlatformGestureInfo a>
	//   50  106:iconst_2        
	//   51  107:newarray        float[]
	//   52  109:dup             
	//   53  110:iconst_0        
	//   54  111:aload_1         
	//   55  112:invokevirtual   #91  <Method MotionEvent at.c()>
	//   56  115:invokevirtual   #96  <Method float MotionEvent.getX()>
	//   57  118:fastore         
	//   58  119:dup             
	//   59  120:iconst_1        
	//   60  121:aload_1         
	//   61  122:invokevirtual   #91  <Method MotionEvent at.c()>
	//   62  125:invokevirtual   #99  <Method float MotionEvent.getY()>
	//   63  128:fastore         
	//   64  129:putfield        #103 <Field float[] EAMapPlatformGestureInfo.mLocation>
			int i = b.a.a(a);
	//   65  132:aload_0         
	//   66  133:getfield        #15  <Field o b>
	//   67  136:getfield        #33  <Field s o.a>
	//   68  139:aload_0         
	//   69  140:getfield        #23  <Field EAMapPlatformGestureInfo a>
	//   70  143:invokeinterface #106 <Method int s.a(EAMapPlatformGestureInfo)>
	//   71  148:istore_2        
			b.a.a(i, 4);
	//   72  149:aload_0         
	//   73  150:getfield        #15  <Field o b>
	//   74  153:getfield        #33  <Field s o.a>
	//   75  156:iload_2         
	//   76  157:iconst_4        
	//   77  158:invokeinterface #109 <Method void s.a(int, int)>
			b.a.c(i);
	//   78  163:aload_0         
	//   79  164:getfield        #15  <Field o b>
	//   80  167:getfield        #33  <Field s o.a>
	//   81  170:iload_2         
	//   82  171:invokeinterface #112 <Method void s.c(int)>
		}
	//   83  176:return          
	}

	EAMapPlatformGestureInfo a;
	final o b;

	private o$e(o o1)
	{
		b = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field o b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void at$b()>
		a = new EAMapPlatformGestureInfo();
	//    5    9:aload_0         
	//    6   10:new             #20  <Class EAMapPlatformGestureInfo>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void EAMapPlatformGestureInfo()>
	//    9   17:putfield        #23  <Field EAMapPlatformGestureInfo a>
	//   10   20:return          
	}

	o$e(o o1, o$1 o$1)
	{
		this(o1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void o$e(o)>
	//    3    5:return          
	}
}
