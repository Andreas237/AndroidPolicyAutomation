// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AbstractAdglAnimationParam2V

public class AdglMapAnimFling extends AbstractAdglAnimation
{

	public AdglMapAnimFling(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractAdglAnimation()>
		screenCenterX = j;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #26  <Field int screenCenterX>
		screenCenterY = k;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #28  <Field int screenCenterY>
		lastMoveX = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #30  <Field int lastMoveX>
		lastMoveY = k;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #32  <Field int lastMoveY>
		moveParam = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
		reset();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #37  <Method void reset()>
		duration = i;
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:putfield        #40  <Field int duration>
	//   22   38:return          
	}

	public void commitAnimation(Object obj)
	{
		obj = ((Object) ((GLMapState)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class GLMapState>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		hasCheckParams = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #47  <Field boolean hasCheckParams>
		isOver = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #50  <Field boolean isOver>
		int i = (int)((velocityX * (float)duration) / 2000F);
	//   12   20:aload_0         
	//   13   21:getfield        #52  <Field float velocityX>
	//   14   24:aload_0         
	//   15   25:getfield        #40  <Field int duration>
	//   16   28:i2f             
	//   17   29:fmul            
	//   18   30:ldc1            #53  <Float 2000F>
	//   19   32:fdiv            
	//   20   33:f2i             
	//   21   34:istore_2        
		int j = (int)((velocityY * (float)duration) / 2000F);
	//   22   35:aload_0         
	//   23   36:getfield        #55  <Field float velocityY>
	//   24   39:aload_0         
	//   25   40:getfield        #40  <Field int duration>
	//   26   43:i2f             
	//   27   44:fmul            
	//   28   45:ldc1            #53  <Float 2000F>
	//   29   47:fdiv            
	//   30   48:f2i             
	//   31   49:istore_3        
		if(Math.abs(i) != 0 && Math.abs(j) != 0)
	//*  32   50:iload_2         
	//*  33   51:invokestatic    #61  <Method int Math.abs(int)>
	//*  34   54:ifeq            140
	//*  35   57:iload_3         
	//*  36   58:invokestatic    #61  <Method int Math.abs(int)>
	//*  37   61:ifeq            140
		{
			if(fromCenter == null)
	//*  38   64:aload_0         
	//*  39   65:getfield        #63  <Field IPoint fromCenter>
	//*  40   68:ifnonnull       78
				fromCenter = IPoint.obtain();
	//   41   71:aload_0         
	//   42   72:invokestatic    #69  <Method IPoint IPoint.obtain()>
	//   43   75:putfield        #63  <Field IPoint fromCenter>
			((GLMapState) (obj)).getMapGeoCenter(fromCenter);
	//   44   78:aload_1         
	//   45   79:aload_0         
	//   46   80:getfield        #63  <Field IPoint fromCenter>
	//   47   83:invokevirtual   #73  <Method void GLMapState.getMapGeoCenter(IPoint)>
			isOver = false;
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:putfield        #50  <Field boolean isOver>
			moveParam.setFromValue(screenCenterX, screenCenterY);
	//   51   91:aload_0         
	//   52   92:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   53   95:aload_0         
	//   54   96:getfield        #26  <Field int screenCenterX>
	//   55   99:i2f             
	//   56  100:aload_0         
	//   57  101:getfield        #28  <Field int screenCenterY>
	//   58  104:i2f             
	//   59  105:invokevirtual   #79  <Method void AbstractAdglAnimationParam2V.setFromValue(float, float)>
			moveParam.setToValue(screenCenterX - i, screenCenterY - j);
	//   60  108:aload_0         
	//   61  109:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   62  112:aload_0         
	//   63  113:getfield        #26  <Field int screenCenterX>
	//   64  116:iload_2         
	//   65  117:isub            
	//   66  118:i2f             
	//   67  119:aload_0         
	//   68  120:getfield        #28  <Field int screenCenterY>
	//   69  123:iload_3         
	//   70  124:isub            
	//   71  125:i2f             
	//   72  126:invokevirtual   #82  <Method void AbstractAdglAnimationParam2V.setToValue(float, float)>
			needMove = moveParam.needToCaculate();
	//   73  129:aload_0         
	//   74  130:aload_0         
	//   75  131:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   76  134:invokevirtual   #86  <Method boolean AbstractAdglAnimationParam2V.needToCaculate()>
	//   77  137:putfield        #88  <Field boolean needMove>
		}
		boolean flag = needMove;
	//   78  140:aload_0         
	//   79  141:getfield        #88  <Field boolean needMove>
	//   80  144:istore          4
		hasCheckParams = true;
	//   81  146:aload_0         
	//   82  147:iconst_1        
	//   83  148:putfield        #47  <Field boolean hasCheckParams>
		startTime = SystemClock.uptimeMillis();
	//   84  151:aload_0         
	//   85  152:invokestatic    #94  <Method long SystemClock.uptimeMillis()>
	//   86  155:putfield        #98  <Field long startTime>
	//   87  158:return          
	}

	public void commitAnimationold(Object obj)
	{
		obj = ((Object) ((GLMapState)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class GLMapState>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		hasCheckParams = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #47  <Field boolean hasCheckParams>
		isOver = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #50  <Field boolean isOver>
		float f = (float)Math.sqrt(velocityX * velocityX + velocityY * velocityY) / 1000F;
	//   12   20:aload_0         
	//   13   21:getfield        #52  <Field float velocityX>
	//   14   24:aload_0         
	//   15   25:getfield        #52  <Field float velocityX>
	//   16   28:fmul            
	//   17   29:aload_0         
	//   18   30:getfield        #55  <Field float velocityY>
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field float velocityY>
	//   21   37:fmul            
	//   22   38:fadd            
	//   23   39:f2d             
	//   24   40:invokestatic    #103 <Method double Math.sqrt(double)>
	//   25   43:d2f             
	//   26   44:ldc1            #104 <Float 1000F>
	//   27   46:fdiv            
	//   28   47:fstore_2        
		if(f >= 0.1F)
	//*  29   48:fload_2         
	//*  30   49:ldc1            #105 <Float 0.1F>
	//*  31   51:fcmpl           
	//*  32   52:iflt            146
		{
			f = 0.02F * f;
	//   33   55:ldc1            #106 <Float 0.02F>
	//   34   57:fload_2         
	//   35   58:fmul            
	//   36   59:fstore_2        
			if(fromCenter == null)
	//*  37   60:aload_0         
	//*  38   61:getfield        #63  <Field IPoint fromCenter>
	//*  39   64:ifnonnull       74
				fromCenter = IPoint.obtain();
	//   40   67:aload_0         
	//   41   68:invokestatic    #69  <Method IPoint IPoint.obtain()>
	//   42   71:putfield        #63  <Field IPoint fromCenter>
			((GLMapState) (obj)).getMapGeoCenter(fromCenter);
	//   43   74:aload_1         
	//   44   75:aload_0         
	//   45   76:getfield        #63  <Field IPoint fromCenter>
	//   46   79:invokevirtual   #73  <Method void GLMapState.getMapGeoCenter(IPoint)>
			isOver = false;
	//   47   82:aload_0         
	//   48   83:iconst_0        
	//   49   84:putfield        #50  <Field boolean isOver>
			moveParam.setFromValue(screenCenterX, screenCenterY);
	//   50   87:aload_0         
	//   51   88:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   52   91:aload_0         
	//   53   92:getfield        #26  <Field int screenCenterX>
	//   54   95:i2f             
	//   55   96:aload_0         
	//   56   97:getfield        #28  <Field int screenCenterY>
	//   57  100:i2f             
	//   58  101:invokevirtual   #79  <Method void AbstractAdglAnimationParam2V.setFromValue(float, float)>
			moveParam.setToValue((float)screenCenterX - velocityX * f, (float)screenCenterY - velocityY * f);
	//   59  104:aload_0         
	//   60  105:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   61  108:aload_0         
	//   62  109:getfield        #26  <Field int screenCenterX>
	//   63  112:i2f             
	//   64  113:aload_0         
	//   65  114:getfield        #52  <Field float velocityX>
	//   66  117:fload_2         
	//   67  118:fmul            
	//   68  119:fsub            
	//   69  120:aload_0         
	//   70  121:getfield        #28  <Field int screenCenterY>
	//   71  124:i2f             
	//   72  125:aload_0         
	//   73  126:getfield        #55  <Field float velocityY>
	//   74  129:fload_2         
	//   75  130:fmul            
	//   76  131:fsub            
	//   77  132:invokevirtual   #82  <Method void AbstractAdglAnimationParam2V.setToValue(float, float)>
			needMove = moveParam.needToCaculate();
	//   78  135:aload_0         
	//   79  136:aload_0         
	//   80  137:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   81  140:invokevirtual   #86  <Method boolean AbstractAdglAnimationParam2V.needToCaculate()>
	//   82  143:putfield        #88  <Field boolean needMove>
		}
		boolean flag = needMove;
	//   83  146:aload_0         
	//   84  147:getfield        #88  <Field boolean needMove>
	//   85  150:istore_3        
		hasCheckParams = true;
	//   86  151:aload_0         
	//   87  152:iconst_1        
	//   88  153:putfield        #47  <Field boolean hasCheckParams>
		startTime = SystemClock.uptimeMillis();
	//   89  156:aload_0         
	//   90  157:invokestatic    #94  <Method long SystemClock.uptimeMillis()>
	//   91  160:putfield        #98  <Field long startTime>
	//   92  163:return          
	}

	public void doAnimation(Object obj)
	{
		GLMapState glmapstate = (GLMapState)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class GLMapState>
	//    2    4:astore          6
		if(glmapstate == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(!hasCheckParams)
	//*   6   12:aload_0         
	//*   7   13:getfield        #47  <Field boolean hasCheckParams>
	//*   8   16:ifne            24
			commitAnimation(obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #109 <Method void commitAnimation(Object)>
		if(isOver)
	//*  12   24:aload_0         
	//*  13   25:getfield        #50  <Field boolean isOver>
	//*  14   28:ifeq            32
			return;
	//   15   31:return          
		offsetTime = SystemClock.uptimeMillis() - startTime;
	//   16   32:aload_0         
	//   17   33:invokestatic    #94  <Method long SystemClock.uptimeMillis()>
	//   18   36:aload_0         
	//   19   37:getfield        #98  <Field long startTime>
	//   20   40:lsub            
	//   21   41:putfield        #112 <Field long offsetTime>
		float f1 = (float)offsetTime / (float)duration;
	//   22   44:aload_0         
	//   23   45:getfield        #112 <Field long offsetTime>
	//   24   48:l2f             
	//   25   49:aload_0         
	//   26   50:getfield        #40  <Field int duration>
	//   27   53:i2f             
	//   28   54:fdiv            
	//   29   55:fstore_3        
		float f = f1;
	//   30   56:fload_3         
	//   31   57:fstore_2        
		if(f1 > 1.0F)
	//*  32   58:fload_3         
	//*  33   59:fconst_1        
	//*  34   60:fcmpl           
	//*  35   61:ifle            71
		{
			f = 1.0F;
	//   36   64:fconst_1        
	//   37   65:fstore_2        
			isOver = true;
	//   38   66:aload_0         
	//   39   67:iconst_1        
	//   40   68:putfield        #50  <Field boolean isOver>
		}
		if(f >= 0.0F && f <= 1.0F && needMove)
	//*  41   71:fload_2         
	//*  42   72:fconst_0        
	//*  43   73:fcmpl           
	//*  44   74:iflt            181
	//*  45   77:fload_2         
	//*  46   78:fconst_1        
	//*  47   79:fcmpg           
	//*  48   80:ifgt            181
	//*  49   83:aload_0         
	//*  50   84:getfield        #88  <Field boolean needMove>
	//*  51   87:ifeq            181
		{
			moveParam.setNormalizedTime(f);
	//   52   90:aload_0         
	//   53   91:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   54   94:fload_2         
	//   55   95:invokevirtual   #116 <Method void AbstractAdglAnimationParam2V.setNormalizedTime(float)>
			int i = (int)moveParam.getCurXValue();
	//   56   98:aload_0         
	//   57   99:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   58  102:invokevirtual   #120 <Method float AbstractAdglAnimationParam2V.getCurXValue()>
	//   59  105:f2i             
	//   60  106:istore          4
			int j = (int)moveParam.getCurYValue();
	//   61  108:aload_0         
	//   62  109:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   63  112:invokevirtual   #123 <Method float AbstractAdglAnimationParam2V.getCurYValue()>
	//   64  115:f2i             
	//   65  116:istore          5
			obj = ((Object) (IPoint.obtain()));
	//   66  118:invokestatic    #69  <Method IPoint IPoint.obtain()>
	//   67  121:astore_1        
			glmapstate.screenToP20Point((screenCenterX + i) - lastMoveX, (screenCenterY + j) - lastMoveY, ((android.graphics.Point) (obj)));
	//   68  122:aload           6
	//   69  124:aload_0         
	//   70  125:getfield        #26  <Field int screenCenterX>
	//   71  128:iload           4
	//   72  130:iadd            
	//   73  131:aload_0         
	//   74  132:getfield        #30  <Field int lastMoveX>
	//   75  135:isub            
	//   76  136:aload_0         
	//   77  137:getfield        #28  <Field int screenCenterY>
	//   78  140:iload           5
	//   79  142:iadd            
	//   80  143:aload_0         
	//   81  144:getfield        #32  <Field int lastMoveY>
	//   82  147:isub            
	//   83  148:aload_1         
	//   84  149:invokevirtual   #127 <Method void GLMapState.screenToP20Point(int, int, android.graphics.Point)>
			glmapstate.setMapGeoCenter(((IPoint) (obj)).x, ((IPoint) (obj)).y);
	//   85  152:aload           6
	//   86  154:aload_1         
	//   87  155:getfield        #130 <Field int IPoint.x>
	//   88  158:aload_1         
	//   89  159:getfield        #133 <Field int IPoint.y>
	//   90  162:invokevirtual   #137 <Method void GLMapState.setMapGeoCenter(int, int)>
			lastMoveX = i;
	//   91  165:aload_0         
	//   92  166:iload           4
	//   93  168:putfield        #30  <Field int lastMoveX>
			lastMoveY = j;
	//   94  171:aload_0         
	//   95  172:iload           5
	//   96  174:putfield        #32  <Field int lastMoveY>
			((IPoint) (obj)).recycle();
	//   97  177:aload_1         
	//   98  178:invokevirtual   #140 <Method void IPoint.recycle()>
		}
	//   99  181:return          
	}

	public void reset()
	{
		if(moveParam != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//*   2    4:ifnull          14
			moveParam.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//    5   11:invokevirtual   #141 <Method void AbstractAdglAnimationParam2V.reset()>
		velocityX = 0.0F;
	//    6   14:aload_0         
	//    7   15:fconst_0        
	//    8   16:putfield        #52  <Field float velocityX>
		velocityY = 0.0F;
	//    9   19:aload_0         
	//   10   20:fconst_0        
	//   11   21:putfield        #55  <Field float velocityY>
		needMove = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #88  <Field boolean needMove>
		hasCheckParams = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #47  <Field boolean hasCheckParams>
	//   18   34:return          
	}

	public void setPositionAndVelocity(float f, float f1)
	{
		moveParam = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
		velocityX = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #52  <Field float velocityX>
		velocityY = f1;
	//    6   10:aload_0         
	//    7   11:fload_2         
	//    8   12:putfield        #55  <Field float velocityY>
		moveParam = new AbstractAdglAnimationParam2V();
	//    9   15:aload_0         
	//   10   16:new             #75  <Class AbstractAdglAnimationParam2V>
	//   11   19:dup             
	//   12   20:invokespecial   #143 <Method void AbstractAdglAnimationParam2V()>
	//   13   23:putfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
		moveParam.setInterpolatorType(2, 1.2F);
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field AbstractAdglAnimationParam2V moveParam>
	//   16   30:iconst_2        
	//   17   31:ldc1            #144 <Float 1.2F>
	//   18   33:invokevirtual   #148 <Method void AbstractAdglAnimationParam2V.setInterpolatorType(int, float)>
		needMove = false;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #88  <Field boolean needMove>
		hasCheckParams = false;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #47  <Field boolean hasCheckParams>
	//   25   46:return          
	}

	private IPoint fromCenter;
	private boolean hasCheckParams;
	private int lastMoveX;
	private int lastMoveY;
	private AbstractAdglAnimationParam2V moveParam;
	private boolean needMove;
	private int screenCenterX;
	private int screenCenterY;
	private float velocityX;
	private float velocityY;
}
