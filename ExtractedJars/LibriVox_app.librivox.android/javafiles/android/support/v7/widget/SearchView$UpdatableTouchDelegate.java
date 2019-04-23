// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.*;

class SearchView$UpdatableTouchDelegate extends TouchDelegate
{

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int j = (int)motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore          4
		int k = (int)motionevent.getY();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #66  <Method float MotionEvent.getY()>
	//    6   11:f2i             
	//    7   12:istore          5
		int i = motionevent.getAction();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #69  <Method int MotionEvent.getAction()>
	//   10   18:istore_2        
		boolean flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_3        
		boolean flag2 = false;
	//   13   21:iconst_0        
	//   14   22:istore          7
		boolean flag1;
		switch(i)
	//*  15   24:iload_2         
		{
	//*  16   25:tableswitch     0 3: default 56
	//	               0 121
	//	               1 75
	//	               2 75
	//	               3 59
	//*  17   56:goto            148
		case 3: // '\003'
			flag1 = mDelegateTargeted;
	//   18   59:aload_0         
	//   19   60:getfield        #71  <Field boolean mDelegateTargeted>
	//   20   63:istore          6
			mDelegateTargeted = false;
	//   21   65:aload_0         
	//   22   66:iconst_0        
	//   23   67:putfield        #71  <Field boolean mDelegateTargeted>
			i = ((int) (flag));
	//   24   70:iload_3         
	//   25   71:istore_2        
			break;
	//   26   72:goto            153

		case 1: // '\001'
		case 2: // '\002'
			boolean flag3 = mDelegateTargeted;
	//   27   75:aload_0         
	//   28   76:getfield        #71  <Field boolean mDelegateTargeted>
	//   29   79:istore          8
			flag1 = flag3;
	//   30   81:iload           8
	//   31   83:istore          6
			i = ((int) (flag));
	//   32   85:iload_3         
	//   33   86:istore_2        
			if(flag3)
	//*  34   87:iload           8
	//*  35   89:ifeq            153
			{
				flag1 = flag3;
	//   36   92:iload           8
	//   37   94:istore          6
				i = ((int) (flag));
	//   38   96:iload_3         
	//   39   97:istore_2        
				if(!mSlopBounds.contains(j, k))
	//*  40   98:aload_0         
	//*  41   99:getfield        #46  <Field Rect mSlopBounds>
	//*  42  102:iload           4
	//*  43  104:iload           5
	//*  44  106:invokevirtual   #75  <Method boolean Rect.contains(int, int)>
	//*  45  109:ifne            153
				{
					i = 0;
	//   46  112:iconst_0        
	//   47  113:istore_2        
					flag1 = flag3;
	//   48  114:iload           8
	//   49  116:istore          6
				}
			}
			break;
	//   50  118:goto            153

		case 0: // '\0'
			if(mTargetBounds.contains(j, k))
	//*  51  121:aload_0         
	//*  52  122:getfield        #44  <Field Rect mTargetBounds>
	//*  53  125:iload           4
	//*  54  127:iload           5
	//*  55  129:invokevirtual   #75  <Method boolean Rect.contains(int, int)>
	//*  56  132:ifeq            148
			{
				mDelegateTargeted = true;
	//   57  135:aload_0         
	//   58  136:iconst_1        
	//   59  137:putfield        #71  <Field boolean mDelegateTargeted>
				flag1 = true;
	//   60  140:iconst_1        
	//   61  141:istore          6
				i = ((int) (flag));
	//   62  143:iload_3         
	//   63  144:istore_2        
				break;
	//   64  145:goto            153
			}
			// fall through

		default:
			flag1 = false;
	//   65  148:iconst_0        
	//   66  149:istore          6
			i = ((int) (flag));
	//   67  151:iload_3         
	//   68  152:istore_2        
			break;
		}
		if(flag1)
	//*  69  153:iload           6
	//*  70  155:ifeq            239
		{
			if(i && !mActualBounds.contains(j, k))
	//*  71  158:iload_2         
	//*  72  159:ifeq            203
	//*  73  162:aload_0         
	//*  74  163:getfield        #48  <Field Rect mActualBounds>
	//*  75  166:iload           4
	//*  76  168:iload           5
	//*  77  170:invokevirtual   #75  <Method boolean Rect.contains(int, int)>
	//*  78  173:ifne            203
				motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
	//   79  176:aload_1         
	//   80  177:aload_0         
	//   81  178:getfield        #54  <Field View mDelegateView>
	//   82  181:invokevirtual   #78  <Method int View.getWidth()>
	//   83  184:iconst_2        
	//   84  185:idiv            
	//   85  186:i2f             
	//   86  187:aload_0         
	//   87  188:getfield        #54  <Field View mDelegateView>
	//   88  191:invokevirtual   #81  <Method int View.getHeight()>
	//   89  194:iconst_2        
	//   90  195:idiv            
	//   91  196:i2f             
	//   92  197:invokevirtual   #85  <Method void MotionEvent.setLocation(float, float)>
			else
	//*  93  200:goto            229
				motionevent.setLocation(j - mActualBounds.left, k - mActualBounds.top);
	//   94  203:aload_1         
	//   95  204:iload           4
	//   96  206:aload_0         
	//   97  207:getfield        #48  <Field Rect mActualBounds>
	//   98  210:getfield        #88  <Field int Rect.left>
	//   99  213:isub            
	//  100  214:i2f             
	//  101  215:iload           5
	//  102  217:aload_0         
	//  103  218:getfield        #48  <Field Rect mActualBounds>
	//  104  221:getfield        #91  <Field int Rect.top>
	//  105  224:isub            
	//  106  225:i2f             
	//  107  226:invokevirtual   #85  <Method void MotionEvent.setLocation(float, float)>
			flag2 = mDelegateView.dispatchTouchEvent(motionevent);
	//  108  229:aload_0         
	//  109  230:getfield        #54  <Field View mDelegateView>
	//  110  233:aload_1         
	//  111  234:invokevirtual   #94  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//  112  237:istore          7
		}
		return flag2;
	//  113  239:iload           7
	//  114  241:ireturn         
	}

	public void setBounds(Rect rect, Rect rect1)
	{
		mTargetBounds.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Rect mTargetBounds>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method void Rect.set(Rect)>
		mSlopBounds.set(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field Rect mSlopBounds>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #98  <Method void Rect.set(Rect)>
		rect = mSlopBounds;
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field Rect mSlopBounds>
	//   10   20:astore_1        
		int i = mSlop;
	//   11   21:aload_0         
	//   12   22:getfield        #37  <Field int mSlop>
	//   13   25:istore_3        
		rect.inset(-i, -i);
	//   14   26:aload_1         
	//   15   27:iload_3         
	//   16   28:ineg            
	//   17   29:iload_3         
	//   18   30:ineg            
	//   19   31:invokevirtual   #102 <Method void Rect.inset(int, int)>
		mActualBounds.set(rect1);
	//   20   34:aload_0         
	//   21   35:getfield        #48  <Field Rect mActualBounds>
	//   22   38:aload_2         
	//   23   39:invokevirtual   #98  <Method void Rect.set(Rect)>
	//   24   42:return          
	}

	private final Rect mActualBounds = new Rect();
	private boolean mDelegateTargeted;
	private final View mDelegateView;
	private final int mSlop;
	private final Rect mSlopBounds = new Rect();
	private final Rect mTargetBounds = new Rect();

	public SearchView$UpdatableTouchDelegate(Rect rect, Rect rect1, View view)
	{
		super(rect, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #19  <Method void TouchDelegate(Rect, View)>
		mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #25  <Method android.content.Context View.getContext()>
	//    7   11:invokestatic    #31  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    8   14:invokevirtual   #35  <Method int ViewConfiguration.getScaledTouchSlop()>
	//    9   17:putfield        #37  <Field int mSlop>
	//   10   20:aload_0         
	//   11   21:new             #39  <Class Rect>
	//   12   24:dup             
	//   13   25:invokespecial   #42  <Method void Rect()>
	//   14   28:putfield        #44  <Field Rect mTargetBounds>
	//   15   31:aload_0         
	//   16   32:new             #39  <Class Rect>
	//   17   35:dup             
	//   18   36:invokespecial   #42  <Method void Rect()>
	//   19   39:putfield        #46  <Field Rect mSlopBounds>
	//   20   42:aload_0         
	//   21   43:new             #39  <Class Rect>
	//   22   46:dup             
	//   23   47:invokespecial   #42  <Method void Rect()>
	//   24   50:putfield        #48  <Field Rect mActualBounds>
		setBounds(rect, rect1);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #52  <Method void setBounds(Rect, Rect)>
		mDelegateView = view;
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:putfield        #54  <Field View mDelegateView>
	//   32   64:return          
	}
}
