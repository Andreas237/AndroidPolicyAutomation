// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			SearchView

private static class SearchView$e extends TouchDelegate
{

	public void a(Rect rect, Rect rect1)
	{
		b.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Rect b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method void Rect.set(Rect)>
		d.set(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field Rect d>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #60  <Method void Rect.set(Rect)>
		d.inset(-e, -e);
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field Rect d>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field int e>
	//   12   24:ineg            
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field int e>
	//   15   29:ineg            
	//   16   30:invokevirtual   #64  <Method void Rect.inset(int, int)>
		c.set(rect1);
	//   17   33:aload_0         
	//   18   34:getfield        #50  <Field Rect c>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #60  <Method void Rect.set(Rect)>
	//   21   41:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int j = (int)motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore          5
		int k = (int)motionevent.getY();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #75  <Method float MotionEvent.getY()>
	//    6   11:f2i             
	//    7   12:istore          6
		int i = motionevent.getAction();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #78  <Method int MotionEvent.getAction()>
	//   10   18:istore_3        
		boolean flag = true;
	//   11   19:iconst_1        
	//   12   20:istore          4
		boolean flag2 = false;
	//   13   22:iconst_0        
	//   14   23:istore          8
		boolean flag1;
		switch(i)
	//*  15   25:iload_3         
		{
	//*  16   26:tableswitch     0 3: default 56
	//	               0 124
	//	               1 76
	//	               2 76
	//	               3 59
	//*  17   56:goto            152
		case 3: // '\003'
			flag1 = f;
	//   18   59:aload_0         
	//   19   60:getfield        #80  <Field boolean f>
	//   20   63:istore          7
			f = false;
	//   21   65:aload_0         
	//   22   66:iconst_0        
	//   23   67:putfield        #80  <Field boolean f>
			i = ((int) (flag));
	//   24   70:iload           4
	//   25   72:istore_3        
			break;
	//   26   73:goto            158

		case 1: // '\001'
		case 2: // '\002'
			boolean flag3 = f;
	//   27   76:aload_0         
	//   28   77:getfield        #80  <Field boolean f>
	//   29   80:istore          9
			flag1 = flag3;
	//   30   82:iload           9
	//   31   84:istore          7
			i = ((int) (flag));
	//   32   86:iload           4
	//   33   88:istore_3        
			if(flag3)
	//*  34   89:iload           9
	//*  35   91:ifeq            158
			{
				flag1 = flag3;
	//   36   94:iload           9
	//   37   96:istore          7
				i = ((int) (flag));
	//   38   98:iload           4
	//   39  100:istore_3        
				if(!d.contains(j, k))
	//*  40  101:aload_0         
	//*  41  102:getfield        #48  <Field Rect d>
	//*  42  105:iload           5
	//*  43  107:iload           6
	//*  44  109:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
	//*  45  112:ifne            158
				{
					i = 0;
	//   46  115:iconst_0        
	//   47  116:istore_3        
					flag1 = flag3;
	//   48  117:iload           9
	//   49  119:istore          7
				}
			}
			break;
	//   50  121:goto            158

		case 0: // '\0'
			if(b.contains(j, k))
	//*  51  124:aload_0         
	//*  52  125:getfield        #46  <Field Rect b>
	//*  53  128:iload           5
	//*  54  130:iload           6
	//*  55  132:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
	//*  56  135:ifeq            152
			{
				f = true;
	//   57  138:aload_0         
	//   58  139:iconst_1        
	//   59  140:putfield        #80  <Field boolean f>
				flag1 = true;
	//   60  143:iconst_1        
	//   61  144:istore          7
				i = ((int) (flag));
	//   62  146:iload           4
	//   63  148:istore_3        
				break;
	//   64  149:goto            158
			}
			// fall through

		default:
			flag1 = false;
	//   65  152:iconst_0        
	//   66  153:istore          7
			i = ((int) (flag));
	//   67  155:iload           4
	//   68  157:istore_3        
			break;
		}
		if(flag1)
	//*  69  158:iload           7
	//*  70  160:ifeq            245
		{
			float f1;
			if(i && !c.contains(j, k))
	//*  71  163:iload_3         
	//*  72  164:ifeq            205
	//*  73  167:aload_0         
	//*  74  168:getfield        #50  <Field Rect c>
	//*  75  171:iload           5
	//*  76  173:iload           6
	//*  77  175:invokevirtual   #84  <Method boolean Rect.contains(int, int)>
	//*  78  178:ifne            205
			{
				f1 = a.getWidth() / 2;
	//   79  181:aload_0         
	//   80  182:getfield        #55  <Field View a>
	//   81  185:invokevirtual   #87  <Method int View.getWidth()>
	//   82  188:iconst_2        
	//   83  189:idiv            
	//   84  190:i2f             
	//   85  191:fstore_2        
				i = a.getHeight() / 2;
	//   86  192:aload_0         
	//   87  193:getfield        #55  <Field View a>
	//   88  196:invokevirtual   #90  <Method int View.getHeight()>
	//   89  199:iconst_2        
	//   90  200:idiv            
	//   91  201:istore_3        
			} else
	//*  92  202:goto            228
			{
				f1 = j - c.left;
	//   93  205:iload           5
	//   94  207:aload_0         
	//   95  208:getfield        #50  <Field Rect c>
	//   96  211:getfield        #93  <Field int Rect.left>
	//   97  214:isub            
	//   98  215:i2f             
	//   99  216:fstore_2        
				i = k - c.top;
	//  100  217:iload           6
	//  101  219:aload_0         
	//  102  220:getfield        #50  <Field Rect c>
	//  103  223:getfield        #96  <Field int Rect.top>
	//  104  226:isub            
	//  105  227:istore_3        
			}
			motionevent.setLocation(f1, i);
	//  106  228:aload_1         
	//  107  229:fload_2         
	//  108  230:iload_3         
	//  109  231:i2f             
	//  110  232:invokevirtual   #100 <Method void MotionEvent.setLocation(float, float)>
			flag2 = a.dispatchTouchEvent(motionevent);
	//  111  235:aload_0         
	//  112  236:getfield        #55  <Field View a>
	//  113  239:aload_1         
	//  114  240:invokevirtual   #103 <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//  115  243:istore          8
		}
		return flag2;
	//  116  245:iload           8
	//  117  247:ireturn         
	}

	private final View a;
	private final Rect b = new Rect();
	private final Rect c = new Rect();
	private final Rect d = new Rect();
	private final int e;
	private boolean f;

	public SearchView$e(Rect rect, Rect rect1, View view)
	{
		super(rect, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #21  <Method void TouchDelegate(Rect, View)>
		e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #27  <Method android.content.Context View.getContext()>
	//    7   11:invokestatic    #33  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    8   14:invokevirtual   #37  <Method int ViewConfiguration.getScaledTouchSlop()>
	//    9   17:putfield        #39  <Field int e>
	//   10   20:aload_0         
	//   11   21:new             #41  <Class Rect>
	//   12   24:dup             
	//   13   25:invokespecial   #44  <Method void Rect()>
	//   14   28:putfield        #46  <Field Rect b>
	//   15   31:aload_0         
	//   16   32:new             #41  <Class Rect>
	//   17   35:dup             
	//   18   36:invokespecial   #44  <Method void Rect()>
	//   19   39:putfield        #48  <Field Rect d>
	//   20   42:aload_0         
	//   21   43:new             #41  <Class Rect>
	//   22   46:dup             
	//   23   47:invokespecial   #44  <Method void Rect()>
	//   24   50:putfield        #50  <Field Rect c>
		a(rect, rect1);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #53  <Method void a(Rect, Rect)>
		a = view;
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:putfield        #55  <Field View a>
	//   32   64:return          
	}
}
