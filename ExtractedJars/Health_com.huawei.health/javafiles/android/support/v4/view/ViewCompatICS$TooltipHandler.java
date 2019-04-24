// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

// Referenced classes of package android.support.v4.view:
//			ViewCompatICS, ViewCompat

static class ViewCompatICS$TooltipHandler
	implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener
{

	private void hide()
	{
		if(mTooltip != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Toast mTooltip>
	//*   2    4:ifnull          19
		{
			mTooltip.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field Toast mTooltip>
	//    5   11:invokevirtual   #60  <Method void Toast.cancel()>
			mTooltip = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #55  <Field Toast mTooltip>
		}
		mAnchor.getHandler().removeCallbacks(mShowRunnable);
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field View mAnchor>
	//   11   23:invokevirtual   #64  <Method Handler View.getHandler()>
	//   12   26:aload_0         
	//   13   27:getfield        #31  <Field Runnable mShowRunnable>
	//   14   30:invokevirtual   #70  <Method void Handler.removeCallbacks(Runnable)>
	//   15   33:return          
	}

	private void show(int i)
	{
		Context context = mAnchor.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field View mAnchor>
	//    2    4:invokevirtual   #74  <Method Context View.getContext()>
	//    3    7:astore          5
		Resources resources = context.getResources();
	//    4    9:aload           5
	//    5   11:invokevirtual   #80  <Method Resources Context.getResources()>
	//    6   14:astore          7
		int i1 = resources.getDisplayMetrics().widthPixels;
	//    7   16:aload           7
	//    8   18:invokevirtual   #86  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   21:getfield        #92  <Field int DisplayMetrics.widthPixels>
	//   10   24:istore          4
		int l = resources.getDisplayMetrics().heightPixels;
	//   11   26:aload           7
	//   12   28:invokevirtual   #86  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   13   31:getfield        #95  <Field int DisplayMetrics.heightPixels>
	//   14   34:istore_3        
		Rect rect = new Rect();
	//   15   35:new             #97  <Class Rect>
	//   16   38:dup             
	//   17   39:invokespecial   #98  <Method void Rect()>
	//   18   42:astore          6
		mAnchor.getWindowVisibleDisplayFrame(rect);
	//   19   44:aload_0         
	//   20   45:getfield        #33  <Field View mAnchor>
	//   21   48:aload           6
	//   22   50:invokevirtual   #102 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(rect.left < 0 && rect.top < 0)
	//*  23   53:aload           6
	//*  24   55:getfield        #105 <Field int Rect.left>
	//*  25   58:ifge            107
	//*  26   61:aload           6
	//*  27   63:getfield        #108 <Field int Rect.top>
	//*  28   66:ifge            107
		{
			int j = resources.getIdentifier("status_bar_height", "dimen", "android");
	//   29   69:aload           7
	//   30   71:ldc1            #110 <String "status_bar_height">
	//   31   73:ldc1            #112 <String "dimen">
	//   32   75:ldc1            #114 <String "android">
	//   33   77:invokevirtual   #118 <Method int Resources.getIdentifier(String, String, String)>
	//   34   80:istore_2        
			if(j > 0)
	//*  35   81:iload_2         
	//*  36   82:ifle            95
				j = resources.getDimensionPixelSize(j);
	//   37   85:aload           7
	//   38   87:iload_2         
	//   39   88:invokevirtual   #122 <Method int Resources.getDimensionPixelSize(int)>
	//   40   91:istore_2        
			else
	//*  41   92:goto            97
				j = 0;
	//   42   95:iconst_0        
	//   43   96:istore_2        
			rect.set(0, j, i1, l);
	//   44   97:aload           6
	//   45   99:iconst_0        
	//   46  100:iload_2         
	//   47  101:iload           4
	//   48  103:iload_3         
	//   49  104:invokevirtual   #126 <Method void Rect.set(int, int, int, int)>
		}
		int ai[] = new int[2];
	//   50  107:iconst_2        
	//   51  108:newarray        int[]
	//   52  110:astore          7
		mAnchor.getLocationOnScreen(ai);
	//   53  112:aload_0         
	//   54  113:getfield        #33  <Field View mAnchor>
	//   55  116:aload           7
	//   56  118:invokevirtual   #130 <Method void View.getLocationOnScreen(int[])>
		l = ai[0] + mAnchor.getWidth() / 2;
	//   57  121:aload           7
	//   58  123:iconst_0        
	//   59  124:iaload          
	//   60  125:aload_0         
	//   61  126:getfield        #33  <Field View mAnchor>
	//   62  129:invokevirtual   #134 <Method int View.getWidth()>
	//   63  132:iconst_2        
	//   64  133:idiv            
	//   65  134:iadd            
	//   66  135:istore_3        
		int k = l;
	//   67  136:iload_3         
	//   68  137:istore_2        
		if(ViewCompat.getLayoutDirection(mAnchor) == 0)
	//*  69  138:aload_0         
	//*  70  139:getfield        #33  <Field View mAnchor>
	//*  71  142:invokestatic    #140 <Method int ViewCompat.getLayoutDirection(View)>
	//*  72  145:ifne            153
			k = i1 - l;
	//   73  148:iload           4
	//   74  150:iload_3         
	//   75  151:isub            
	//   76  152:istore_2        
		l = ai[1];
	//   77  153:aload           7
	//   78  155:iconst_1        
	//   79  156:iaload          
	//   80  157:istore_3        
		hide();
	//   81  158:aload_0         
	//   82  159:invokespecial   #142 <Method void hide()>
		mTooltip = Toast.makeText(context, mTooltipText, i);
	//   83  162:aload_0         
	//   84  163:aload           5
	//   85  165:aload_0         
	//   86  166:getfield        #35  <Field CharSequence mTooltipText>
	//   87  169:iload_1         
	//   88  170:invokestatic    #146 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//   89  173:putfield        #55  <Field Toast mTooltip>
		if((double)l < (double)rect.height() * 0.80000000000000004D)
	//*  90  176:iload_3         
	//*  91  177:i2d             
	//*  92  178:aload           6
	//*  93  180:invokevirtual   #149 <Method int Rect.height()>
	//*  94  183:i2d             
	//*  95  184:ldc2w           #150 <Double 0.80000000000000004D>
	//*  96  187:dmul            
	//*  97  188:dcmpg           
	//*  98  189:ifge            220
			mTooltip.setGravity(0x800035, k, (mAnchor.getHeight() + l) - rect.top);
	//   99  192:aload_0         
	//  100  193:getfield        #55  <Field Toast mTooltip>
	//  101  196:ldc1            #152 <Int 0x800035>
	//  102  198:iload_2         
	//  103  199:aload_0         
	//  104  200:getfield        #33  <Field View mAnchor>
	//  105  203:invokevirtual   #155 <Method int View.getHeight()>
	//  106  206:iload_3         
	//  107  207:iadd            
	//  108  208:aload           6
	//  109  210:getfield        #108 <Field int Rect.top>
	//  110  213:isub            
	//  111  214:invokevirtual   #159 <Method void Toast.setGravity(int, int, int)>
		else
	//* 112  217:goto            237
			mTooltip.setGravity(0x800055, k, rect.bottom - l);
	//  113  220:aload_0         
	//  114  221:getfield        #55  <Field Toast mTooltip>
	//  115  224:ldc1            #160 <Int 0x800055>
	//  116  226:iload_2         
	//  117  227:aload           6
	//  118  229:getfield        #163 <Field int Rect.bottom>
	//  119  232:iload_3         
	//  120  233:isub            
	//  121  234:invokevirtual   #159 <Method void Toast.setGravity(int, int, int)>
		mTooltip.show();
	//  122  237:aload_0         
	//  123  238:getfield        #55  <Field Toast mTooltip>
	//  124  241:invokevirtual   #165 <Method void Toast.show()>
	//  125  244:return          
	}

	public boolean onHover(View view, MotionEvent motionevent)
	{
		view = ((View) ((AccessibilityManager)mAnchor.getContext().getSystemService("accessibility")));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field View mAnchor>
	//    2    4:invokevirtual   #74  <Method Context View.getContext()>
	//    3    7:ldc1            #169 <String "accessibility">
	//    4    9:invokevirtual   #173 <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #175 <Class AccessibilityManager>
	//    6   15:astore_1        
		if(((AccessibilityManager) (view)).isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(((AccessibilityManager) (view))))
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #179 <Method boolean AccessibilityManager.isEnabled()>
	//*   9   20:ifeq            32
	//*  10   23:aload_1         
	//*  11   24:invokestatic    #185 <Method boolean AccessibilityManagerCompat.isTouchExplorationEnabled(AccessibilityManager)>
	//*  12   27:ifeq            32
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
		int i = motionevent.getAction();
	//   15   32:aload_2         
	//   16   33:invokevirtual   #190 <Method int MotionEvent.getAction()>
	//   17   36:istore_3        
		if(i == 7)
	//*  18   37:iload_3         
	//*  19   38:bipush          7
	//*  20   40:icmpne          69
		{
			hide();
	//   21   43:aload_0         
	//   22   44:invokespecial   #142 <Method void hide()>
			mAnchor.getHandler().postDelayed(mShowRunnable, ViewConfiguration.getLongPressTimeout());
	//   23   47:aload_0         
	//   24   48:getfield        #33  <Field View mAnchor>
	//   25   51:invokevirtual   #64  <Method Handler View.getHandler()>
	//   26   54:aload_0         
	//   27   55:getfield        #31  <Field Runnable mShowRunnable>
	//   28   58:invokestatic    #195 <Method int ViewConfiguration.getLongPressTimeout()>
	//   29   61:i2l             
	//   30   62:invokevirtual   #199 <Method boolean Handler.postDelayed(Runnable, long)>
	//   31   65:pop             
		} else
	//*  32   66:goto            79
		if(i == 10)
	//*  33   69:iload_3         
	//*  34   70:bipush          10
	//*  35   72:icmpne          79
			hide();
	//   36   75:aload_0         
	//   37   76:invokespecial   #142 <Method void hide()>
		return false;
	//   38   79:iconst_0        
	//   39   80:ireturn         
	}

	public boolean onLongClick(View view)
	{
		show(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #52  <Method void show(int)>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	private final View mAnchor;
	private final Runnable mShowRunnable = new Runnable() {

		public void run()
		{
			show(1);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ViewCompatICS$TooltipHandler this$0>
		//    2    4:iconst_1        
		//    3    5:invokestatic    #26  <Method void ViewCompatICS$TooltipHandler.access$000(ViewCompatICS$TooltipHandler, int)>
		//    4    8:return          
		}

		final ViewCompatICS.TooltipHandler this$0;

			
			{
				this$0 = ViewCompatICS.TooltipHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewCompatICS$TooltipHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private Toast mTooltip;
	private final CharSequence mTooltipText;


/*
	static void access$000(ViewCompatICS$TooltipHandler viewcompatics$tooltiphandler, int i)
	{
		viewcompatics$tooltiphandler.show(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void show(int)>
		return;
	//    3    5:return          
	}

*/

	ViewCompatICS$TooltipHandler(View view, CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ViewCompatICS$TooltipHandler$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void ViewCompatICS$TooltipHandler$1(ViewCompatICS$TooltipHandler)>
	//    7   13:putfield        #31  <Field Runnable mShowRunnable>
		mAnchor = view;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #33  <Field View mAnchor>
		mTooltipText = charsequence;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #35  <Field CharSequence mTooltipText>
		mAnchor.setOnLongClickListener(((android.view.View.OnLongClickListener) (this)));
	//   14   26:aload_0         
	//   15   27:getfield        #33  <Field View mAnchor>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #41  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mAnchor.setOnHoverListener(((android.view.View.OnHoverListener) (this)));
	//   18   34:aload_0         
	//   19   35:getfield        #33  <Field View mAnchor>
	//   20   38:aload_0         
	//   21   39:invokevirtual   #45  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
	//   22   42:return          
	}
}
