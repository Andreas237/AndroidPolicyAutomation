// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			OnApplyWindowInsetsListener, ViewPager, ViewCompat, WindowInsetsCompat

class ViewPager$4
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		view = ((View) (ViewCompat.onApplyWindowInsets(view, windowinsetscompat)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #33  <Method WindowInsetsCompat ViewCompat.onApplyWindowInsets(View, WindowInsetsCompat)>
	//    3    5:astore_1        
		if(((WindowInsetsCompat) (view)).isConsumed())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #39  <Method boolean WindowInsetsCompat.isConsumed()>
	//*   6   10:ifeq            15
			return ((WindowInsetsCompat) (view));
	//    7   13:aload_1         
	//    8   14:areturn         
		windowinsetscompat = ((WindowInsetsCompat) (mTempRect));
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field Rect mTempRect>
	//   11   19:astore_2        
		windowinsetscompat.left = ((WindowInsetsCompat) (view)).getSystemWindowInsetLeft();
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   15   25:putfield        #47  <Field int Rect.left>
		windowinsetscompat.top = ((WindowInsetsCompat) (view)).getSystemWindowInsetTop();
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   19   33:putfield        #53  <Field int Rect.top>
		windowinsetscompat.right = ((WindowInsetsCompat) (view)).getSystemWindowInsetRight();
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   23   41:putfield        #59  <Field int Rect.right>
		windowinsetscompat.bottom = ((WindowInsetsCompat) (view)).getSystemWindowInsetBottom();
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   27   49:putfield        #65  <Field int Rect.bottom>
		int i = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
		for(int j = getChildCount(); i < j; i++)
	//*  30   54:aload_0         
	//*  31   55:getfield        #19  <Field ViewPager this$0>
	//*  32   58:invokevirtual   #68  <Method int ViewPager.getChildCount()>
	//*  33   61:istore          4
	//*  34   63:iload_3         
	//*  35   64:iload           4
	//*  36   66:icmpge          154
		{
			WindowInsetsCompat windowinsetscompat1 = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), ((WindowInsetsCompat) (view)));
	//   37   69:aload_0         
	//   38   70:getfield        #19  <Field ViewPager this$0>
	//   39   73:iload_3         
	//   40   74:invokevirtual   #72  <Method View ViewPager.getChildAt(int)>
	//   41   77:aload_1         
	//   42   78:invokestatic    #75  <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
	//   43   81:astore          5
			windowinsetscompat.left = Math.min(windowinsetscompat1.getSystemWindowInsetLeft(), ((Rect) (windowinsetscompat)).left);
	//   44   83:aload_2         
	//   45   84:aload           5
	//   46   86:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   47   89:aload_2         
	//   48   90:getfield        #47  <Field int Rect.left>
	//   49   93:invokestatic    #81  <Method int Math.min(int, int)>
	//   50   96:putfield        #47  <Field int Rect.left>
			windowinsetscompat.top = Math.min(windowinsetscompat1.getSystemWindowInsetTop(), ((Rect) (windowinsetscompat)).top);
	//   51   99:aload_2         
	//   52  100:aload           5
	//   53  102:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   54  105:aload_2         
	//   55  106:getfield        #53  <Field int Rect.top>
	//   56  109:invokestatic    #81  <Method int Math.min(int, int)>
	//   57  112:putfield        #53  <Field int Rect.top>
			windowinsetscompat.right = Math.min(windowinsetscompat1.getSystemWindowInsetRight(), ((Rect) (windowinsetscompat)).right);
	//   58  115:aload_2         
	//   59  116:aload           5
	//   60  118:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   61  121:aload_2         
	//   62  122:getfield        #59  <Field int Rect.right>
	//   63  125:invokestatic    #81  <Method int Math.min(int, int)>
	//   64  128:putfield        #59  <Field int Rect.right>
			windowinsetscompat.bottom = Math.min(windowinsetscompat1.getSystemWindowInsetBottom(), ((Rect) (windowinsetscompat)).bottom);
	//   65  131:aload_2         
	//   66  132:aload           5
	//   67  134:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   68  137:aload_2         
	//   69  138:getfield        #65  <Field int Rect.bottom>
	//   70  141:invokestatic    #81  <Method int Math.min(int, int)>
	//   71  144:putfield        #65  <Field int Rect.bottom>
		}

	//   72  147:iload_3         
	//   73  148:iconst_1        
	//   74  149:iadd            
	//   75  150:istore_3        
	//*  76  151:goto            63
		return ((WindowInsetsCompat) (view)).replaceSystemWindowInsets(((Rect) (windowinsetscompat)).left, ((Rect) (windowinsetscompat)).top, ((Rect) (windowinsetscompat)).right, ((Rect) (windowinsetscompat)).bottom);
	//   77  154:aload_1         
	//   78  155:aload_2         
	//   79  156:getfield        #47  <Field int Rect.left>
	//   80  159:aload_2         
	//   81  160:getfield        #53  <Field int Rect.top>
	//   82  163:aload_2         
	//   83  164:getfield        #59  <Field int Rect.right>
	//   84  167:aload_2         
	//   85  168:getfield        #65  <Field int Rect.bottom>
	//   86  171:invokevirtual   #85  <Method WindowInsetsCompat WindowInsetsCompat.replaceSystemWindowInsets(int, int, int, int)>
	//   87  174:areturn         
	}

	private final Rect mTempRect = new Rect();
	final ViewPager this$0;

	ViewPager$4()
	{
		this$0 = ViewPager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewPager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #23  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void Rect()>
	//    9   17:putfield        #26  <Field Rect mTempRect>
	//   10   20:return          
	}
}
