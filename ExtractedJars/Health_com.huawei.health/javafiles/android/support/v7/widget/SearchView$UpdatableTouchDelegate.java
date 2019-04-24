// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			SearchView

static class SearchView$UpdatableTouchDelegate extends TouchDelegate
{

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = (int)motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore          4
		int j = (int)motionevent.getY();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #69  <Method float MotionEvent.getY()>
	//    6   11:f2i             
	//    7   12:istore          5
		boolean flag2 = false;
	//    8   14:iconst_0        
	//    9   15:istore          6
		boolean flag1 = true;
	//   10   17:iconst_1        
	//   11   18:istore_3        
		boolean flag3 = false;
	//   12   19:iconst_0        
	//   13   20:istore          7
		boolean flag;
		switch(motionevent.getAction())
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #72  <Method int MotionEvent.getAction()>
		{
	//*  16   26:tableswitch     0 3: default 56
	//	               0 61
	//	               1 90
	//	               2 90
	//	               3 136
		default:
			flag = flag1;
	//   17   56:iload_3         
	//   18   57:istore_2        
			break;

	//*  19   58:goto            149
		case 0: // '\0'
			flag = flag1;
	//   20   61:iload_3         
	//   21   62:istore_2        
			if(mTargetBounds.contains(i, j))
	//*  22   63:aload_0         
	//*  23   64:getfield        #47  <Field Rect mTargetBounds>
	//*  24   67:iload           4
	//*  25   69:iload           5
	//*  26   71:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  27   74:ifeq            149
			{
				mDelegateTargeted = true;
	//   28   77:aload_0         
	//   29   78:iconst_1        
	//   30   79:putfield        #78  <Field boolean mDelegateTargeted>
				flag2 = true;
	//   31   82:iconst_1        
	//   32   83:istore          6
				flag = flag1;
	//   33   85:iload_3         
	//   34   86:istore_2        
			}
			break;

	//*  35   87:goto            149
		case 1: // '\001'
		case 2: // '\002'
			boolean flag4 = mDelegateTargeted;
	//   36   90:aload_0         
	//   37   91:getfield        #78  <Field boolean mDelegateTargeted>
	//   38   94:istore          8
			flag2 = flag4;
	//   39   96:iload           8
	//   40   98:istore          6
			flag = flag1;
	//   41  100:iload_3         
	//   42  101:istore_2        
			if(flag4)
	//*  43  102:iload           8
	//*  44  104:ifeq            149
			{
				flag2 = flag4;
	//   45  107:iload           8
	//   46  109:istore          6
				flag = flag1;
	//   47  111:iload_3         
	//   48  112:istore_2        
				if(!mSlopBounds.contains(i, j))
	//*  49  113:aload_0         
	//*  50  114:getfield        #49  <Field Rect mSlopBounds>
	//*  51  117:iload           4
	//*  52  119:iload           5
	//*  53  121:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  54  124:ifne            149
				{
					flag = false;
	//   55  127:iconst_0        
	//   56  128:istore_2        
					flag2 = flag4;
	//   57  129:iload           8
	//   58  131:istore          6
				}
			}
			break;

	//*  59  133:goto            149
		case 3: // '\003'
			flag2 = mDelegateTargeted;
	//   60  136:aload_0         
	//   61  137:getfield        #78  <Field boolean mDelegateTargeted>
	//   62  140:istore          6
			mDelegateTargeted = false;
	//   63  142:aload_0         
	//   64  143:iconst_0        
	//   65  144:putfield        #78  <Field boolean mDelegateTargeted>
			flag = flag1;
	//   66  147:iload_3         
	//   67  148:istore_2        
			break;
		}
		if(flag2)
	//*  68  149:iload           6
	//*  69  151:ifeq            235
		{
			if(flag && !mActualBounds.contains(i, j))
	//*  70  154:iload_2         
	//*  71  155:ifeq            199
	//*  72  158:aload_0         
	//*  73  159:getfield        #51  <Field Rect mActualBounds>
	//*  74  162:iload           4
	//*  75  164:iload           5
	//*  76  166:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  77  169:ifne            199
				motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
	//   78  172:aload_1         
	//   79  173:aload_0         
	//   80  174:getfield        #57  <Field View mDelegateView>
	//   81  177:invokevirtual   #81  <Method int View.getWidth()>
	//   82  180:iconst_2        
	//   83  181:idiv            
	//   84  182:i2f             
	//   85  183:aload_0         
	//   86  184:getfield        #57  <Field View mDelegateView>
	//   87  187:invokevirtual   #84  <Method int View.getHeight()>
	//   88  190:iconst_2        
	//   89  191:idiv            
	//   90  192:i2f             
	//   91  193:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
			else
	//*  92  196:goto            225
				motionevent.setLocation(i - mActualBounds.left, j - mActualBounds.top);
	//   93  199:aload_1         
	//   94  200:iload           4
	//   95  202:aload_0         
	//   96  203:getfield        #51  <Field Rect mActualBounds>
	//   97  206:getfield        #91  <Field int Rect.left>
	//   98  209:isub            
	//   99  210:i2f             
	//  100  211:iload           5
	//  101  213:aload_0         
	//  102  214:getfield        #51  <Field Rect mActualBounds>
	//  103  217:getfield        #94  <Field int Rect.top>
	//  104  220:isub            
	//  105  221:i2f             
	//  106  222:invokevirtual   #88  <Method void MotionEvent.setLocation(float, float)>
			flag3 = mDelegateView.dispatchTouchEvent(motionevent);
	//  107  225:aload_0         
	//  108  226:getfield        #57  <Field View mDelegateView>
	//  109  229:aload_1         
	//  110  230:invokevirtual   #97  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//  111  233:istore          7
		}
		return flag3;
	//  112  235:iload           7
	//  113  237:ireturn         
	}

	public void setBounds(Rect rect, Rect rect1)
	{
		mTargetBounds.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Rect mTargetBounds>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method void Rect.set(Rect)>
		mSlopBounds.set(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field Rect mSlopBounds>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #101 <Method void Rect.set(Rect)>
		mSlopBounds.inset(-mSlop, -mSlop);
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field Rect mSlopBounds>
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field int mSlop>
	//   12   24:ineg            
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field int mSlop>
	//   15   29:ineg            
	//   16   30:invokevirtual   #105 <Method void Rect.inset(int, int)>
		mActualBounds.set(rect1);
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field Rect mActualBounds>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #101 <Method void Rect.set(Rect)>
	//   21   41:return          
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
	//    3    3:invokespecial   #22  <Method void TouchDelegate(Rect, View)>
		mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #28  <Method android.content.Context View.getContext()>
	//    7   11:invokestatic    #34  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    8   14:invokevirtual   #38  <Method int ViewConfiguration.getScaledTouchSlop()>
	//    9   17:putfield        #40  <Field int mSlop>
	//   10   20:aload_0         
	//   11   21:new             #42  <Class Rect>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void Rect()>
	//   14   28:putfield        #47  <Field Rect mTargetBounds>
	//   15   31:aload_0         
	//   16   32:new             #42  <Class Rect>
	//   17   35:dup             
	//   18   36:invokespecial   #45  <Method void Rect()>
	//   19   39:putfield        #49  <Field Rect mSlopBounds>
	//   20   42:aload_0         
	//   21   43:new             #42  <Class Rect>
	//   22   46:dup             
	//   23   47:invokespecial   #45  <Method void Rect()>
	//   24   50:putfield        #51  <Field Rect mActualBounds>
		setBounds(rect, rect1);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #55  <Method void setBounds(Rect, Rect)>
		mDelegateView = view;
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:putfield        #57  <Field View mDelegateView>
	//   32   64:return          
	}
}
