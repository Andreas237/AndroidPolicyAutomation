// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.Rect;

// Referenced classes of package com.autonavi.amap.mapcore:
//			FPoint, IPoint

public class Rectangle
{

	public Rectangle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		rect = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Rect()>
	//    6   12:putfield        #24  <Field Rect rect>
		clipRect = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #26  <Field IPoint[] clipRect>
		clipMapRect = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #28  <Field FPoint[] clipMapRect>
	//   13   25:return          
	}

	public Rectangle(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		rect = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Rect()>
	//    6   12:putfield        #24  <Field Rect rect>
		clipRect = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #26  <Field IPoint[] clipRect>
		clipMapRect = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #28  <Field FPoint[] clipMapRect>
		if(f >= f1 || f3 <= f2)
	//*  13   25:fload_1         
	//*  14   26:fload_2         
	//*  15   27:fcmpl           
	//*  16   28:ifge            38
	//*  17   31:fload           4
	//*  18   33:fload_3         
	//*  19   34:fcmpg           
	//*  20   35:ifgt            39
		{
			return;
	//   21   38:return          
		} else
		{
			left = f;
	//   22   39:aload_0         
	//   23   40:fload_1         
	//   24   41:putfield        #32  <Field float left>
			right = f1;
	//   25   44:aload_0         
	//   26   45:fload_2         
	//   27   46:putfield        #34  <Field float right>
			top = f3;
	//   28   49:aload_0         
	//   29   50:fload           4
	//   30   52:putfield        #36  <Field float top>
			bottom = f2;
	//   31   55:aload_0         
	//   32   56:fload_3         
	//   33   57:putfield        #38  <Field float bottom>
			return;
	//   34   60:return          
		}
	}

	public Rectangle(Rect rect1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		rect = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Rect()>
	//    6   12:putfield        #24  <Field Rect rect>
		clipRect = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #26  <Field IPoint[] clipRect>
		clipMapRect = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #28  <Field FPoint[] clipMapRect>
		rect = rect1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #24  <Field Rect rect>
		if(rect1 != null)
	//*  16   30:aload_1         
	//*  17   31:ifnull          57
		{
			updateRect(rect1, i, j);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #42  <Method void updateRect(Rect, int, int)>
			updateClipRect();
	//   23   41:aload_0         
	//   24   42:invokespecial   #45  <Method void updateClipRect()>
			updateClipMapRect(rect1.centerX(), rect1.centerY());
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #49  <Method int Rect.centerX()>
	//   28   50:aload_1         
	//   29   51:invokevirtual   #52  <Method int Rect.centerY()>
	//   30   54:invokespecial   #56  <Method void updateClipMapRect(int, int)>
		}
	//   31   57:return          
	}

	private void updateClipMapRect(int i, int j)
	{
		if(clipMapRect == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field FPoint[] clipMapRect>
	//*   2    4:ifnonnull       59
		{
			clipMapRect = new FPoint[4];
	//    3    7:aload_0         
	//    4    8:iconst_4        
	//    5    9:anewarray       FPoint[]
	//    6   12:putfield        #28  <Field FPoint[] clipMapRect>
			clipMapRect[0] = FPoint.obtain(0.0F, 0.0F);
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field FPoint[] clipMapRect>
	//    9   19:iconst_0        
	//   10   20:fconst_0        
	//   11   21:fconst_0        
	//   12   22:invokestatic    #62  <Method FPoint FPoint.obtain(float, float)>
	//   13   25:aastore         
			clipMapRect[1] = FPoint.obtain(0.0F, 0.0F);
	//   14   26:aload_0         
	//   15   27:getfield        #28  <Field FPoint[] clipMapRect>
	//   16   30:iconst_1        
	//   17   31:fconst_0        
	//   18   32:fconst_0        
	//   19   33:invokestatic    #62  <Method FPoint FPoint.obtain(float, float)>
	//   20   36:aastore         
			clipMapRect[2] = FPoint.obtain(0.0F, 0.0F);
	//   21   37:aload_0         
	//   22   38:getfield        #28  <Field FPoint[] clipMapRect>
	//   23   41:iconst_2        
	//   24   42:fconst_0        
	//   25   43:fconst_0        
	//   26   44:invokestatic    #62  <Method FPoint FPoint.obtain(float, float)>
	//   27   47:aastore         
			clipMapRect[3] = FPoint.obtain(0.0F, 0.0F);
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field FPoint[] clipMapRect>
	//   30   52:iconst_3        
	//   31   53:fconst_0        
	//   32   54:fconst_0        
	//   33   55:invokestatic    #62  <Method FPoint FPoint.obtain(float, float)>
	//   34   58:aastore         
		}
		if(rect != null)
	//*  35   59:aload_0         
	//*  36   60:getfield        #24  <Field Rect rect>
	//*  37   63:ifnull          218
		{
			clipMapRect[0].x = rect.left - i;
	//   38   66:aload_0         
	//   39   67:getfield        #28  <Field FPoint[] clipMapRect>
	//   40   70:iconst_0        
	//   41   71:aaload          
	//   42   72:aload_0         
	//   43   73:getfield        #24  <Field Rect rect>
	//   44   76:getfield        #65  <Field int Rect.left>
	//   45   79:iload_1         
	//   46   80:isub            
	//   47   81:i2f             
	//   48   82:putfield        #68  <Field float FPoint.x>
			clipMapRect[0].y = rect.top - j;
	//   49   85:aload_0         
	//   50   86:getfield        #28  <Field FPoint[] clipMapRect>
	//   51   89:iconst_0        
	//   52   90:aaload          
	//   53   91:aload_0         
	//   54   92:getfield        #24  <Field Rect rect>
	//   55   95:getfield        #70  <Field int Rect.top>
	//   56   98:iload_2         
	//   57   99:isub            
	//   58  100:i2f             
	//   59  101:putfield        #73  <Field float FPoint.y>
			clipMapRect[1].x = rect.right - i;
	//   60  104:aload_0         
	//   61  105:getfield        #28  <Field FPoint[] clipMapRect>
	//   62  108:iconst_1        
	//   63  109:aaload          
	//   64  110:aload_0         
	//   65  111:getfield        #24  <Field Rect rect>
	//   66  114:getfield        #75  <Field int Rect.right>
	//   67  117:iload_1         
	//   68  118:isub            
	//   69  119:i2f             
	//   70  120:putfield        #68  <Field float FPoint.x>
			clipMapRect[1].y = rect.top - j;
	//   71  123:aload_0         
	//   72  124:getfield        #28  <Field FPoint[] clipMapRect>
	//   73  127:iconst_1        
	//   74  128:aaload          
	//   75  129:aload_0         
	//   76  130:getfield        #24  <Field Rect rect>
	//   77  133:getfield        #70  <Field int Rect.top>
	//   78  136:iload_2         
	//   79  137:isub            
	//   80  138:i2f             
	//   81  139:putfield        #73  <Field float FPoint.y>
			clipMapRect[2].x = rect.right - i;
	//   82  142:aload_0         
	//   83  143:getfield        #28  <Field FPoint[] clipMapRect>
	//   84  146:iconst_2        
	//   85  147:aaload          
	//   86  148:aload_0         
	//   87  149:getfield        #24  <Field Rect rect>
	//   88  152:getfield        #75  <Field int Rect.right>
	//   89  155:iload_1         
	//   90  156:isub            
	//   91  157:i2f             
	//   92  158:putfield        #68  <Field float FPoint.x>
			clipMapRect[2].y = rect.bottom - j;
	//   93  161:aload_0         
	//   94  162:getfield        #28  <Field FPoint[] clipMapRect>
	//   95  165:iconst_2        
	//   96  166:aaload          
	//   97  167:aload_0         
	//   98  168:getfield        #24  <Field Rect rect>
	//   99  171:getfield        #77  <Field int Rect.bottom>
	//  100  174:iload_2         
	//  101  175:isub            
	//  102  176:i2f             
	//  103  177:putfield        #73  <Field float FPoint.y>
			clipMapRect[3].x = rect.left - i;
	//  104  180:aload_0         
	//  105  181:getfield        #28  <Field FPoint[] clipMapRect>
	//  106  184:iconst_3        
	//  107  185:aaload          
	//  108  186:aload_0         
	//  109  187:getfield        #24  <Field Rect rect>
	//  110  190:getfield        #65  <Field int Rect.left>
	//  111  193:iload_1         
	//  112  194:isub            
	//  113  195:i2f             
	//  114  196:putfield        #68  <Field float FPoint.x>
			clipMapRect[3].y = rect.bottom - j;
	//  115  199:aload_0         
	//  116  200:getfield        #28  <Field FPoint[] clipMapRect>
	//  117  203:iconst_3        
	//  118  204:aaload          
	//  119  205:aload_0         
	//  120  206:getfield        #24  <Field Rect rect>
	//  121  209:getfield        #77  <Field int Rect.bottom>
	//  122  212:iload_2         
	//  123  213:isub            
	//  124  214:i2f             
	//  125  215:putfield        #73  <Field float FPoint.y>
		}
	//  126  218:return          
	}

	private void updateClipRect()
	{
		if(clipRect == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field IPoint[] clipRect>
	//*   2    4:ifnonnull       59
		{
			clipRect = new IPoint[4];
	//    3    7:aload_0         
	//    4    8:iconst_4        
	//    5    9:anewarray       IPoint[]
	//    6   12:putfield        #26  <Field IPoint[] clipRect>
			clipRect[0] = IPoint.obtain(0, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field IPoint[] clipRect>
	//    9   19:iconst_0        
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokestatic    #82  <Method IPoint IPoint.obtain(int, int)>
	//   13   25:aastore         
			clipRect[1] = IPoint.obtain(0, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field IPoint[] clipRect>
	//   16   30:iconst_1        
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:invokestatic    #82  <Method IPoint IPoint.obtain(int, int)>
	//   20   36:aastore         
			clipRect[2] = IPoint.obtain(0, 0);
	//   21   37:aload_0         
	//   22   38:getfield        #26  <Field IPoint[] clipRect>
	//   23   41:iconst_2        
	//   24   42:iconst_0        
	//   25   43:iconst_0        
	//   26   44:invokestatic    #82  <Method IPoint IPoint.obtain(int, int)>
	//   27   47:aastore         
			clipRect[3] = IPoint.obtain(0, 0);
	//   28   48:aload_0         
	//   29   49:getfield        #26  <Field IPoint[] clipRect>
	//   30   52:iconst_3        
	//   31   53:iconst_0        
	//   32   54:iconst_0        
	//   33   55:invokestatic    #82  <Method IPoint IPoint.obtain(int, int)>
	//   34   58:aastore         
		}
		if(rect != null)
	//*  35   59:aload_0         
	//*  36   60:getfield        #24  <Field Rect rect>
	//*  37   63:ifnull          194
		{
			clipRect[0].x = rect.left;
	//   38   66:aload_0         
	//   39   67:getfield        #26  <Field IPoint[] clipRect>
	//   40   70:iconst_0        
	//   41   71:aaload          
	//   42   72:aload_0         
	//   43   73:getfield        #24  <Field Rect rect>
	//   44   76:getfield        #65  <Field int Rect.left>
	//   45   79:putfield        #84  <Field int IPoint.x>
			clipRect[0].y = rect.top;
	//   46   82:aload_0         
	//   47   83:getfield        #26  <Field IPoint[] clipRect>
	//   48   86:iconst_0        
	//   49   87:aaload          
	//   50   88:aload_0         
	//   51   89:getfield        #24  <Field Rect rect>
	//   52   92:getfield        #70  <Field int Rect.top>
	//   53   95:putfield        #86  <Field int IPoint.y>
			clipRect[1].x = rect.right;
	//   54   98:aload_0         
	//   55   99:getfield        #26  <Field IPoint[] clipRect>
	//   56  102:iconst_1        
	//   57  103:aaload          
	//   58  104:aload_0         
	//   59  105:getfield        #24  <Field Rect rect>
	//   60  108:getfield        #75  <Field int Rect.right>
	//   61  111:putfield        #84  <Field int IPoint.x>
			clipRect[1].y = rect.top;
	//   62  114:aload_0         
	//   63  115:getfield        #26  <Field IPoint[] clipRect>
	//   64  118:iconst_1        
	//   65  119:aaload          
	//   66  120:aload_0         
	//   67  121:getfield        #24  <Field Rect rect>
	//   68  124:getfield        #70  <Field int Rect.top>
	//   69  127:putfield        #86  <Field int IPoint.y>
			clipRect[2].x = rect.right;
	//   70  130:aload_0         
	//   71  131:getfield        #26  <Field IPoint[] clipRect>
	//   72  134:iconst_2        
	//   73  135:aaload          
	//   74  136:aload_0         
	//   75  137:getfield        #24  <Field Rect rect>
	//   76  140:getfield        #75  <Field int Rect.right>
	//   77  143:putfield        #84  <Field int IPoint.x>
			clipRect[2].y = rect.bottom;
	//   78  146:aload_0         
	//   79  147:getfield        #26  <Field IPoint[] clipRect>
	//   80  150:iconst_2        
	//   81  151:aaload          
	//   82  152:aload_0         
	//   83  153:getfield        #24  <Field Rect rect>
	//   84  156:getfield        #77  <Field int Rect.bottom>
	//   85  159:putfield        #86  <Field int IPoint.y>
			clipRect[3].x = rect.left;
	//   86  162:aload_0         
	//   87  163:getfield        #26  <Field IPoint[] clipRect>
	//   88  166:iconst_3        
	//   89  167:aaload          
	//   90  168:aload_0         
	//   91  169:getfield        #24  <Field Rect rect>
	//   92  172:getfield        #65  <Field int Rect.left>
	//   93  175:putfield        #84  <Field int IPoint.x>
			clipRect[3].y = rect.bottom;
	//   94  178:aload_0         
	//   95  179:getfield        #26  <Field IPoint[] clipRect>
	//   96  182:iconst_3        
	//   97  183:aaload          
	//   98  184:aload_0         
	//   99  185:getfield        #24  <Field Rect rect>
	//  100  188:getfield        #77  <Field int Rect.bottom>
	//  101  191:putfield        #86  <Field int IPoint.y>
		}
	//  102  194:return          
	}

	public boolean contains(int i, int j)
	{
		if(rect != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Rect rect>
	//*   2    4:ifnull          17
			return rect.contains(i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Rect rect>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #90  <Method boolean Rect.contains(int, int)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean contains(Rect rect1)
	{
		if(rect1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return rect.contains(rect1);
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field Rect rect>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #93  <Method boolean Rect.contains(Rect)>
	//    8   14:ireturn         
	}

	public boolean contains(IPoint ipoint)
	{
		if(ipoint == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return contains(ipoint.x, ipoint.y);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #84  <Field int IPoint.x>
	//    7   11:aload_1         
	//    8   12:getfield        #86  <Field int IPoint.y>
	//    9   15:invokevirtual   #95  <Method boolean contains(int, int)>
	//   10   18:ireturn         
	}

	public FPoint[] getClipMapRect()
	{
		return clipMapRect;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field FPoint[] clipMapRect>
	//    2    4:areturn         
	}

	public IPoint[] getClipRect()
	{
		return clipRect;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IPoint[] clipRect>
	//    2    4:areturn         
	}

	public Rect getRect()
	{
		return rect;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Rect rect>
	//    2    4:areturn         
	}

	public boolean isOverlap(Rect rect1)
	{
		if(rect == null || rect1 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Rect rect>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		return rect.left + rect.width() > rect1.left && rect1.left + rect1.width() > rect.left && rect.top + rect.height() > rect1.top && rect1.top + rect1.height() > rect.top;
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field Rect rect>
	//    9   17:getfield        #65  <Field int Rect.left>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field Rect rect>
	//   12   24:invokevirtual   #105 <Method int Rect.width()>
	//   13   27:iadd            
	//   14   28:aload_1         
	//   15   29:getfield        #65  <Field int Rect.left>
	//   16   32:icmple          97
	//   17   35:aload_1         
	//   18   36:getfield        #65  <Field int Rect.left>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #105 <Method int Rect.width()>
	//   21   43:iadd            
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field Rect rect>
	//   24   48:getfield        #65  <Field int Rect.left>
	//   25   51:icmple          97
	//   26   54:aload_0         
	//   27   55:getfield        #24  <Field Rect rect>
	//   28   58:getfield        #70  <Field int Rect.top>
	//   29   61:aload_0         
	//   30   62:getfield        #24  <Field Rect rect>
	//   31   65:invokevirtual   #108 <Method int Rect.height()>
	//   32   68:iadd            
	//   33   69:aload_1         
	//   34   70:getfield        #70  <Field int Rect.top>
	//   35   73:icmple          97
	//   36   76:aload_1         
	//   37   77:getfield        #70  <Field int Rect.top>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #108 <Method int Rect.height()>
	//   40   84:iadd            
	//   41   85:aload_0         
	//   42   86:getfield        #24  <Field Rect rect>
	//   43   89:getfield        #70  <Field int Rect.top>
	//   44   92:icmple          97
	//   45   95:iconst_1        
	//   46   96:ireturn         
	//   47   97:iconst_0        
	//   48   98:ireturn         
	}

	public void updateRect(Rect rect1, int i, int j)
	{
		if(rect1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          42
		{
			rect = rect1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Rect rect>
			rect.inset(-rect1.width() / 8, -rect1.height() / 8);
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Rect rect>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #105 <Method int Rect.width()>
	//    9   17:ineg            
	//   10   18:bipush          8
	//   11   20:idiv            
	//   12   21:aload_1         
	//   13   22:invokevirtual   #108 <Method int Rect.height()>
	//   14   25:ineg            
	//   15   26:bipush          8
	//   16   28:idiv            
	//   17   29:invokevirtual   #111 <Method void Rect.inset(int, int)>
			updateClipRect();
	//   18   32:aload_0         
	//   19   33:invokespecial   #45  <Method void updateClipRect()>
			updateClipMapRect(i, j);
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:iload_3         
	//   23   39:invokespecial   #56  <Method void updateClipMapRect(int, int)>
		}
	//   24   42:return          
	}

	public float bottom;
	public FPoint clipMapRect[];
	public IPoint clipRect[];
	public float left;
	public Rect rect;
	public float right;
	public float top;
}
