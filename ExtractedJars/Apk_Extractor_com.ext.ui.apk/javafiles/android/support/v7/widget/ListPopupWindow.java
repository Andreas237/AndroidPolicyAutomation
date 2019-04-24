// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.*;
import android.view.*;
import android.widget.*;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			AppCompatPopupWindow, DropDownListView, ForwardingListener

public class ListPopupWindow
	implements ShowableListMenu
{
	private class ListSelectorHider
		implements Runnable
	{

		public void run()
		{
			clearListSelection();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ListPopupWindow this$0>
		//    2    4:invokevirtual   #23  <Method void ListPopupWindow.clearListSelection()>
		//    3    7:return          
		}

		final ListPopupWindow this$0;

		ListSelectorHider()
		{
			this$0 = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class PopupDataSetObserver extends DataSetObserver
	{

		public void onChanged()
		{
			if(isShowing())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ListPopupWindow this$0>
		//*   2    4:invokevirtual   #22  <Method boolean ListPopupWindow.isShowing()>
		//*   3    7:ifeq            17
				show();
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ListPopupWindow this$0>
		//    6   14:invokevirtual   #25  <Method void ListPopupWindow.show()>
		//    7   17:return          
		}

		public void onInvalidated()
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ListPopupWindow this$0>
		//    2    4:invokevirtual   #29  <Method void ListPopupWindow.dismiss()>
		//    3    7:return          
		}

		final ListPopupWindow this$0;

		PopupDataSetObserver()
		{
			this$0 = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ListPopupWindow this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private class PopupScrollListener
		implements android.widget.AbsListView.OnScrollListener
	{

		public void onScroll(AbsListView abslistview, int i, int j, int k)
		{
		//    0    0:return          
		}

		public void onScrollStateChanged(AbsListView abslistview, int i)
		{
			if(i == 1 && !isInputMethodNotNeeded() && mPopup.getContentView() != null)
		//*   0    0:iload_2         
		//*   1    1:iconst_1        
		//*   2    2:icmpne          55
		//*   3    5:aload_0         
		//*   4    6:getfield        #15  <Field ListPopupWindow this$0>
		//*   5    9:invokevirtual   #27  <Method boolean ListPopupWindow.isInputMethodNotNeeded()>
		//*   6   12:ifne            55
		//*   7   15:aload_0         
		//*   8   16:getfield        #15  <Field ListPopupWindow this$0>
		//*   9   19:getfield        #31  <Field PopupWindow ListPopupWindow.mPopup>
		//*  10   22:invokevirtual   #37  <Method View PopupWindow.getContentView()>
		//*  11   25:ifnull          55
			{
				mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
		//   12   28:aload_0         
		//   13   29:getfield        #15  <Field ListPopupWindow this$0>
		//   14   32:getfield        #41  <Field Handler ListPopupWindow.mHandler>
		//   15   35:aload_0         
		//   16   36:getfield        #15  <Field ListPopupWindow this$0>
		//   17   39:getfield        #45  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
		//   18   42:invokevirtual   #51  <Method void Handler.removeCallbacks(Runnable)>
				mResizePopupRunnable.run();
		//   19   45:aload_0         
		//   20   46:getfield        #15  <Field ListPopupWindow this$0>
		//   21   49:getfield        #45  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
		//   22   52:invokevirtual   #56  <Method void ListPopupWindow$ResizePopupRunnable.run()>
			}
		//   23   55:return          
		}

		final ListPopupWindow this$0;

		PopupScrollListener()
		{
			this$0 = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class PopupTouchInterceptor
		implements android.view.View.OnTouchListener
	{

		public boolean onTouch(View view, MotionEvent motionevent)
		{
			int i;
			int j;
			int k;
			i = motionevent.getAction();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
		//    2    4:istore_3        
			j = (int)motionevent.getX();
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method float MotionEvent.getX()>
		//    5    9:f2i             
		//    6   10:istore          4
			k = (int)motionevent.getY();
		//    7   12:aload_2         
		//    8   13:invokevirtual   #34  <Method float MotionEvent.getY()>
		//    9   16:f2i             
		//   10   17:istore          5
			if(i != 0 || mPopup == null || !mPopup.isShowing() || j < 0 || j >= mPopup.getWidth() || k < 0 || k >= mPopup.getHeight()) goto _L2; else goto _L1
		//   11   19:iload_3         
		//   12   20:ifne            109
		//   13   23:aload_0         
		//   14   24:getfield        #15  <Field ListPopupWindow this$0>
		//   15   27:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//   16   30:ifnull          109
		//   17   33:aload_0         
		//   18   34:getfield        #15  <Field ListPopupWindow this$0>
		//   19   37:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//   20   40:invokevirtual   #44  <Method boolean PopupWindow.isShowing()>
		//   21   43:ifeq            109
		//   22   46:iload           4
		//   23   48:iflt            109
		//   24   51:iload           4
		//   25   53:aload_0         
		//   26   54:getfield        #15  <Field ListPopupWindow this$0>
		//   27   57:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//   28   60:invokevirtual   #47  <Method int PopupWindow.getWidth()>
		//   29   63:icmpge          109
		//   30   66:iload           5
		//   31   68:iflt            109
		//   32   71:iload           5
		//   33   73:aload_0         
		//   34   74:getfield        #15  <Field ListPopupWindow this$0>
		//   35   77:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//   36   80:invokevirtual   #50  <Method int PopupWindow.getHeight()>
		//   37   83:icmpge          109
_L1:
			mHandler.postDelayed(((Runnable) (mResizePopupRunnable)), 250L);
		//   38   86:aload_0         
		//   39   87:getfield        #15  <Field ListPopupWindow this$0>
		//   40   90:getfield        #54  <Field Handler ListPopupWindow.mHandler>
		//   41   93:aload_0         
		//   42   94:getfield        #15  <Field ListPopupWindow this$0>
		//   43   97:getfield        #58  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
		//   44  100:ldc2w           #59  <Long 250L>
		//   45  103:invokevirtual   #66  <Method boolean Handler.postDelayed(Runnable, long)>
		//   46  106:pop             
_L4:
			return false;
		//   47  107:iconst_0        
		//   48  108:ireturn         
_L2:
			if(i == 1)
		//*  49  109:iload_3         
		//*  50  110:iconst_1        
		//*  51  111:icmpne          107
				mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
		//   52  114:aload_0         
		//   53  115:getfield        #15  <Field ListPopupWindow this$0>
		//   54  118:getfield        #54  <Field Handler ListPopupWindow.mHandler>
		//   55  121:aload_0         
		//   56  122:getfield        #15  <Field ListPopupWindow this$0>
		//   57  125:getfield        #58  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
		//   58  128:invokevirtual   #70  <Method void Handler.removeCallbacks(Runnable)>
			if(true) goto _L4; else goto _L3
		//   59  131:goto            107
_L3:
		}

		final ListPopupWindow this$0;

		PopupTouchInterceptor()
		{
			this$0 = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class ResizePopupRunnable
		implements Runnable
	{

		public void run()
		{
			if(mDropDownList != null && ViewCompat.isAttachedToWindow(((View) (mDropDownList))) && mDropDownList.getCount() > mDropDownList.getChildCount() && mDropDownList.getChildCount() <= mListItemExpandMaximum)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ListPopupWindow this$0>
		//*   2    4:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
		//*   3    7:ifnull          84
		//*   4   10:aload_0         
		//*   5   11:getfield        #15  <Field ListPopupWindow this$0>
		//*   6   14:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
		//*   7   17:invokestatic    #30  <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*   8   20:ifeq            84
		//*   9   23:aload_0         
		//*  10   24:getfield        #15  <Field ListPopupWindow this$0>
		//*  11   27:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
		//*  12   30:invokevirtual   #36  <Method int DropDownListView.getCount()>
		//*  13   33:aload_0         
		//*  14   34:getfield        #15  <Field ListPopupWindow this$0>
		//*  15   37:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
		//*  16   40:invokevirtual   #39  <Method int DropDownListView.getChildCount()>
		//*  17   43:icmple          84
		//*  18   46:aload_0         
		//*  19   47:getfield        #15  <Field ListPopupWindow this$0>
		//*  20   50:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
		//*  21   53:invokevirtual   #39  <Method int DropDownListView.getChildCount()>
		//*  22   56:aload_0         
		//*  23   57:getfield        #15  <Field ListPopupWindow this$0>
		//*  24   60:getfield        #43  <Field int ListPopupWindow.mListItemExpandMaximum>
		//*  25   63:icmpgt          84
			{
				mPopup.setInputMethodMode(2);
		//   26   66:aload_0         
		//   27   67:getfield        #15  <Field ListPopupWindow this$0>
		//   28   70:getfield        #47  <Field PopupWindow ListPopupWindow.mPopup>
		//   29   73:iconst_2        
		//   30   74:invokevirtual   #53  <Method void PopupWindow.setInputMethodMode(int)>
				show();
		//   31   77:aload_0         
		//   32   78:getfield        #15  <Field ListPopupWindow this$0>
		//   33   81:invokevirtual   #56  <Method void ListPopupWindow.show()>
			}
		//   34   84:return          
		}

		final ListPopupWindow this$0;

		ResizePopupRunnable()
		{
			this$0 = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public ListPopupWindow(Context context)
	{
		this(context, ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.listPopupWindowStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #159 <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
	//    4    6:invokespecial   #162 <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #159 <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
	//    4    6:invokespecial   #162 <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #169 <Method void ListPopupWindow(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void Object()>
		mDropDownHeight = -2;
	//    2    4:aload_0         
	//    3    5:bipush          -2
	//    4    7:putfield        #174 <Field int mDropDownHeight>
		mDropDownWidth = -2;
	//    5   10:aload_0         
	//    6   11:bipush          -2
	//    7   13:putfield        #176 <Field int mDropDownWidth>
		mDropDownWindowLayoutType = 1002;
	//    8   16:aload_0         
	//    9   17:sipush          1002
	//   10   20:putfield        #178 <Field int mDropDownWindowLayoutType>
		mIsAnimatedFromAnchor = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #180 <Field boolean mIsAnimatedFromAnchor>
		mDropDownGravity = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #182 <Field int mDropDownGravity>
		mDropDownAlwaysVisible = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #184 <Field boolean mDropDownAlwaysVisible>
		mForceIgnoreOutsideTouch = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #186 <Field boolean mForceIgnoreOutsideTouch>
		mListItemExpandMaximum = 0x7fffffff;
	//   23   43:aload_0         
	//   24   44:ldc1            #187 <Int 0x7fffffff>
	//   25   46:putfield        #189 <Field int mListItemExpandMaximum>
		mPromptPosition = 0;
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:putfield        #191 <Field int mPromptPosition>
		mResizePopupRunnable = new ResizePopupRunnable();
	//   29   54:aload_0         
	//   30   55:new             #26  <Class ListPopupWindow$ResizePopupRunnable>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:invokespecial   #194 <Method void ListPopupWindow$ResizePopupRunnable(ListPopupWindow)>
	//   34   63:putfield        #196 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
		mTouchInterceptor = new PopupTouchInterceptor();
	//   35   66:aload_0         
	//   36   67:new             #23  <Class ListPopupWindow$PopupTouchInterceptor>
	//   37   70:dup             
	//   38   71:aload_0         
	//   39   72:invokespecial   #197 <Method void ListPopupWindow$PopupTouchInterceptor(ListPopupWindow)>
	//   40   75:putfield        #199 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
		mScrollListener = new PopupScrollListener();
	//   41   78:aload_0         
	//   42   79:new             #20  <Class ListPopupWindow$PopupScrollListener>
	//   43   82:dup             
	//   44   83:aload_0         
	//   45   84:invokespecial   #200 <Method void ListPopupWindow$PopupScrollListener(ListPopupWindow)>
	//   46   87:putfield        #202 <Field ListPopupWindow$PopupScrollListener mScrollListener>
		mHideSelector = new ListSelectorHider();
	//   47   90:aload_0         
	//   48   91:new             #14  <Class ListPopupWindow$ListSelectorHider>
	//   49   94:dup             
	//   50   95:aload_0         
	//   51   96:invokespecial   #203 <Method void ListPopupWindow$ListSelectorHider(ListPopupWindow)>
	//   52   99:putfield        #205 <Field ListPopupWindow$ListSelectorHider mHideSelector>
		mTempRect = new Rect();
	//   53  102:aload_0         
	//   54  103:new             #136 <Class Rect>
	//   55  106:dup             
	//   56  107:invokespecial   #206 <Method void Rect()>
	//   57  110:putfield        #208 <Field Rect mTempRect>
		mContext = context;
	//   58  113:aload_0         
	//   59  114:aload_1         
	//   60  115:putfield        #210 <Field Context mContext>
		mHandler = new Handler(context.getMainLooper());
	//   61  118:aload_0         
	//   62  119:new             #212 <Class Handler>
	//   63  122:dup             
	//   64  123:aload_1         
	//   65  124:invokevirtual   #218 <Method android.os.Looper Context.getMainLooper()>
	//   66  127:invokespecial   #221 <Method void Handler(android.os.Looper)>
	//   67  130:putfield        #223 <Field Handler mHandler>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ListPopupWindow, i, j);
	//   68  133:aload_1         
	//   69  134:aload_2         
	//   70  135:getstatic       #228 <Field int[] android.support.v7.appcompat.R$styleable.ListPopupWindow>
	//   71  138:iload_3         
	//   72  139:iload           4
	//   73  141:invokevirtual   #232 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   74  144:astore          5
		mDropDownHorizontalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
	//   75  146:aload_0         
	//   76  147:aload           5
	//   77  149:getstatic       #235 <Field int android.support.v7.appcompat.R$styleable.ListPopupWindow_android_dropDownHorizontalOffset>
	//   78  152:iconst_0        
	//   79  153:invokevirtual   #241 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   80  156:putfield        #243 <Field int mDropDownHorizontalOffset>
		mDropDownVerticalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
	//   81  159:aload_0         
	//   82  160:aload           5
	//   83  162:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.ListPopupWindow_android_dropDownVerticalOffset>
	//   84  165:iconst_0        
	//   85  166:invokevirtual   #241 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   86  169:putfield        #248 <Field int mDropDownVerticalOffset>
		if(mDropDownVerticalOffset != 0)
	//*  87  172:aload_0         
	//*  88  173:getfield        #248 <Field int mDropDownVerticalOffset>
	//*  89  176:ifeq            184
			mDropDownVerticalOffsetSet = true;
	//   90  179:aload_0         
	//   91  180:iconst_1        
	//   92  181:putfield        #250 <Field boolean mDropDownVerticalOffsetSet>
		typedarray.recycle();
	//   93  184:aload           5
	//   94  186:invokevirtual   #253 <Method void TypedArray.recycle()>
		mPopup = ((PopupWindow) (new AppCompatPopupWindow(context, attributeset, i, j)));
	//   95  189:aload_0         
	//   96  190:new             #255 <Class AppCompatPopupWindow>
	//   97  193:dup             
	//   98  194:aload_1         
	//   99  195:aload_2         
	//  100  196:iload_3         
	//  101  197:iload           4
	//  102  199:invokespecial   #256 <Method void AppCompatPopupWindow(Context, AttributeSet, int, int)>
	//  103  202:putfield        #258 <Field PopupWindow mPopup>
		mPopup.setInputMethodMode(1);
	//  104  205:aload_0         
	//  105  206:getfield        #258 <Field PopupWindow mPopup>
	//  106  209:iconst_1        
	//  107  210:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
	//  108  213:return          
	}

	private int buildDropDown()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(mDropDownList != null) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:getfield        #266 <Field DropDownListView mDropDownList>
	//    4    7:ifnonnull       486
_L1:
		int i;
		int j;
		int l;
		boolean flag;
		Object obj;
		Object obj1;
		View view;
		android.widget.LinearLayout.LayoutParams layoutparams;
		obj1 = ((Object) (mContext));
	//    5   10:aload_0         
	//    6   11:getfield        #210 <Field Context mContext>
	//    7   14:astore          8
		mShowDropDownRunnable = new Runnable() {

			public void run()
			{
				View view1 = getAnchorView();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ListPopupWindow this$0>
			//    2    4:invokevirtual   #26  <Method View ListPopupWindow.getAnchorView()>
			//    3    7:astore_1        
				if(view1 != null && view1.getWindowToken() != null)
			//*   4    8:aload_1         
			//*   5    9:ifnull          26
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #32  <Method android.os.IBinder View.getWindowToken()>
			//*   8   16:ifnull          26
					show();
			//    9   19:aload_0         
			//   10   20:getfield        #17  <Field ListPopupWindow this$0>
			//   11   23:invokevirtual   #35  <Method void ListPopupWindow.show()>
			//   12   26:return          
			}

			final ListPopupWindow this$0;

			
			{
				this$0 = ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPopupWindow this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    8   16:aload_0         
	//    9   17:new             #10  <Class ListPopupWindow$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #267 <Method void ListPopupWindow$2(ListPopupWindow)>
	//   13   25:putfield        #269 <Field Runnable mShowDropDownRunnable>
		if(!mModal)
	//*  14   28:aload_0         
	//*  15   29:getfield        #271 <Field boolean mModal>
	//*  16   32:ifne            435
			flag = true;
	//   17   35:iconst_1        
	//   18   36:istore          5
		else
	//*  19   38:aload_0         
	//*  20   39:aload_0         
	//*  21   40:aload           8
	//*  22   42:iload           5
	//*  23   44:invokevirtual   #275 <Method DropDownListView createDropDownListView(Context, boolean)>
	//*  24   47:putfield        #266 <Field DropDownListView mDropDownList>
	//*  25   50:aload_0         
	//*  26   51:getfield        #277 <Field Drawable mDropDownListHighlight>
	//*  27   54:ifnull          68
	//*  28   57:aload_0         
	//*  29   58:getfield        #266 <Field DropDownListView mDropDownList>
	//*  30   61:aload_0         
	//*  31   62:getfield        #277 <Field Drawable mDropDownListHighlight>
	//*  32   65:invokevirtual   #283 <Method void DropDownListView.setSelector(Drawable)>
	//*  33   68:aload_0         
	//*  34   69:getfield        #266 <Field DropDownListView mDropDownList>
	//*  35   72:aload_0         
	//*  36   73:getfield        #285 <Field ListAdapter mAdapter>
	//*  37   76:invokevirtual   #289 <Method void DropDownListView.setAdapter(ListAdapter)>
	//*  38   79:aload_0         
	//*  39   80:getfield        #266 <Field DropDownListView mDropDownList>
	//*  40   83:aload_0         
	//*  41   84:getfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//*  42   87:invokevirtual   #295 <Method void DropDownListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//*  43   90:aload_0         
	//*  44   91:getfield        #266 <Field DropDownListView mDropDownList>
	//*  45   94:iconst_1        
	//*  46   95:invokevirtual   #299 <Method void DropDownListView.setFocusable(boolean)>
	//*  47   98:aload_0         
	//*  48   99:getfield        #266 <Field DropDownListView mDropDownList>
	//*  49  102:iconst_1        
	//*  50  103:invokevirtual   #302 <Method void DropDownListView.setFocusableInTouchMode(boolean)>
	//*  51  106:aload_0         
	//*  52  107:getfield        #266 <Field DropDownListView mDropDownList>
	//*  53  110:new             #12  <Class ListPopupWindow$3>
	//*  54  113:dup             
	//*  55  114:aload_0         
	//*  56  115:invokespecial   #303 <Method void ListPopupWindow$3(ListPopupWindow)>
	//*  57  118:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//*  58  121:aload_0         
	//*  59  122:getfield        #266 <Field DropDownListView mDropDownList>
	//*  60  125:aload_0         
	//*  61  126:getfield        #202 <Field ListPopupWindow$PopupScrollListener mScrollListener>
	//*  62  129:invokevirtual   #311 <Method void DropDownListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//*  63  132:aload_0         
	//*  64  133:getfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//*  65  136:ifnull          150
	//*  66  139:aload_0         
	//*  67  140:getfield        #266 <Field DropDownListView mDropDownList>
	//*  68  143:aload_0         
	//*  69  144:getfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//*  70  147:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//*  71  150:aload_0         
	//*  72  151:getfield        #266 <Field DropDownListView mDropDownList>
	//*  73  154:astore          7
	//*  74  156:aload_0         
	//*  75  157:getfield        #315 <Field View mPromptView>
	//*  76  160:astore          9
	//*  77  162:aload           9
	//*  78  164:ifnull          734
	//*  79  167:new             #317 <Class LinearLayout>
	//*  80  170:dup             
	//*  81  171:aload           8
	//*  82  173:invokespecial   #319 <Method void LinearLayout(Context)>
	//*  83  176:astore          8
	//*  84  178:aload           8
	//*  85  180:iconst_1        
	//*  86  181:invokevirtual   #322 <Method void LinearLayout.setOrientation(int)>
	//*  87  184:new             #324 <Class android.widget.LinearLayout$LayoutParams>
	//*  88  187:dup             
	//*  89  188:iconst_m1       
	//*  90  189:iconst_0        
	//*  91  190:fconst_1        
	//*  92  191:invokespecial   #327 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//*  93  194:astore          10
	//*  94  196:aload_0         
	//*  95  197:getfield        #191 <Field int mPromptPosition>
	//*  96  200:tableswitch     0 1: default 224
	//	               0 460
	//	               1 441
	//*  97  224:ldc1            #46  <String "ListPopupWindow">
	//*  98  226:new             #329 <Class StringBuilder>
	//*  99  229:dup             
	//* 100  230:invokespecial   #330 <Method void StringBuilder()>
	//* 101  233:ldc2            #332 <String "Invalid hint position ">
	//* 102  236:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//* 103  239:aload_0         
	//* 104  240:getfield        #191 <Field int mPromptPosition>
	//* 105  243:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//* 106  246:invokevirtual   #343 <Method String StringBuilder.toString()>
	//* 107  249:invokestatic    #346 <Method int Log.e(String, String)>
	//* 108  252:pop             
	//* 109  253:aload_0         
	//* 110  254:getfield        #176 <Field int mDropDownWidth>
	//* 111  257:iflt            479
	//* 112  260:aload_0         
	//* 113  261:getfield        #176 <Field int mDropDownWidth>
	//* 114  264:istore_2        
	//* 115  265:ldc2            #347 <Int 0x80000000>
	//* 116  268:istore_1        
	//* 117  269:aload           9
	//* 118  271:iload_2         
	//* 119  272:iload_1         
	//* 120  273:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 121  276:iconst_0        
	//* 122  277:invokevirtual   #356 <Method void View.measure(int, int)>
	//* 123  280:aload           9
	//* 124  282:invokevirtual   #360 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 125  285:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//* 126  288:astore          7
	//* 127  290:aload           9
	//* 128  292:invokevirtual   #363 <Method int View.getMeasuredHeight()>
	//* 129  295:istore_1        
	//* 130  296:aload           7
	//* 131  298:getfield        #366 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//* 132  301:istore_2        
	//* 133  302:aload           7
	//* 134  304:getfield        #369 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//* 135  307:iload_1         
	//* 136  308:iload_2         
	//* 137  309:iadd            
	//* 138  310:iadd            
	//* 139  311:istore_1        
	//* 140  312:aload           8
	//* 141  314:astore          7
	//* 142  316:aload_0         
	//* 143  317:getfield        #258 <Field PopupWindow mPopup>
	//* 144  320:aload           7
	//* 145  322:invokevirtual   #373 <Method void PopupWindow.setContentView(View)>
	//* 146  325:aload_0         
	//* 147  326:getfield        #258 <Field PopupWindow mPopup>
	//* 148  329:invokevirtual   #377 <Method Drawable PopupWindow.getBackground()>
	//* 149  332:astore          7
	//* 150  334:aload           7
	//* 151  336:ifnull          544
	//* 152  339:aload           7
	//* 153  341:aload_0         
	//* 154  342:getfield        #208 <Field Rect mTempRect>
	//* 155  345:invokevirtual   #383 <Method boolean Drawable.getPadding(Rect)>
	//* 156  348:pop             
	//* 157  349:aload_0         
	//* 158  350:getfield        #208 <Field Rect mTempRect>
	//* 159  353:getfield        #386 <Field int Rect.top>
	//* 160  356:aload_0         
	//* 161  357:getfield        #208 <Field Rect mTempRect>
	//* 162  360:getfield        #389 <Field int Rect.bottom>
	//* 163  363:iadd            
	//* 164  364:istore_2        
	//* 165  365:aload_0         
	//* 166  366:getfield        #250 <Field boolean mDropDownVerticalOffsetSet>
	//* 167  369:ifne            726
	//* 168  372:aload_0         
	//* 169  373:aload_0         
	//* 170  374:getfield        #208 <Field Rect mTempRect>
	//* 171  377:getfield        #386 <Field int Rect.top>
	//* 172  380:ineg            
	//* 173  381:putfield        #248 <Field int mDropDownVerticalOffset>
	//* 174  384:aload_0         
	//* 175  385:getfield        #258 <Field PopupWindow mPopup>
	//* 176  388:invokevirtual   #392 <Method int PopupWindow.getInputMethodMode()>
	//* 177  391:iconst_2        
	//* 178  392:icmpne          556
	//* 179  395:iload           6
	//* 180  397:istore          5
	//* 181  399:aload_0         
	//* 182  400:aload_0         
	//* 183  401:invokevirtual   #396 <Method View getAnchorView()>
	//* 184  404:aload_0         
	//* 185  405:getfield        #248 <Field int mDropDownVerticalOffset>
	//* 186  408:iload           5
	//* 187  410:invokespecial   #399 <Method int getMaxAvailableHeight(View, int, boolean)>
	//* 188  413:istore          4
	//* 189  415:aload_0         
	//* 190  416:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 191  419:ifne            430
	//* 192  422:aload_0         
	//* 193  423:getfield        #174 <Field int mDropDownHeight>
	//* 194  426:iconst_m1       
	//* 195  427:icmpne          562
	//* 196  430:iload           4
	//* 197  432:iload_2         
	//* 198  433:iadd            
	//* 199  434:ireturn         
			flag = false;
	//  200  435:iconst_0        
	//  201  436:istore          5
		mDropDownList = createDropDownListView(((Context) (obj1)), flag);
		if(mDropDownListHighlight != null)
			mDropDownList.setSelector(mDropDownListHighlight);
		mDropDownList.setAdapter(mAdapter);
		mDropDownList.setOnItemClickListener(mItemClickListener);
		mDropDownList.setFocusable(true);
		mDropDownList.setFocusableInTouchMode(true);
		mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view1, int i1, long l1)
			{
				if(i1 != -1)
			//*   0    0:iload_3         
			//*   1    1:iconst_m1       
			//*   2    2:icmpeq          22
				{
					adapterview = ((AdapterView) (mDropDownList));
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field ListPopupWindow this$0>
			//    5    9:getfield        #27  <Field DropDownListView ListPopupWindow.mDropDownList>
			//    6   12:astore_1        
					if(adapterview != null)
			//*   7   13:aload_1         
			//*   8   14:ifnull          22
						((DropDownListView) (adapterview)).setListSelectionHidden(false);
			//    9   17:aload_1         
			//   10   18:iconst_0        
			//   11   19:invokevirtual   #33  <Method void DropDownListView.setListSelectionHidden(boolean)>
				}
			//   12   22:return          
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final ListPopupWindow this$0;

			
			{
				this$0 = ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPopupWindow this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		mDropDownList.setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (mScrollListener)));
		if(mItemSelectedListener != null)
			mDropDownList.setOnItemSelectedListener(mItemSelectedListener);
		obj = ((Object) (mDropDownList));
		view = mPromptView;
		if(view == null) goto _L4; else goto _L3
_L3:
		obj1 = ((Object) (new LinearLayout(((Context) (obj1)))));
		((LinearLayout) (obj1)).setOrientation(1);
		layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
		mPromptPosition;
		JVM INSTR tableswitch 0 1: default 224
	//	               0 460
	//	               1 441;
		   goto _L5 _L6 _L7
_L5:
		Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(mPromptPosition).toString());
_L9:
		if(mDropDownWidth >= 0)
		{
			j = mDropDownWidth;
			i = 0x80000000;
		} else
	//* 202  438:goto            38
	//* 203  441:aload           8
	//* 204  443:aload           7
	//* 205  445:aload           10
	//* 206  447:invokevirtual   #403 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 207  450:aload           8
	//* 208  452:aload           9
	//* 209  454:invokevirtual   #405 <Method void LinearLayout.addView(View)>
	//* 210  457:goto            253
	//* 211  460:aload           8
	//* 212  462:aload           9
	//* 213  464:invokevirtual   #405 <Method void LinearLayout.addView(View)>
	//* 214  467:aload           8
	//* 215  469:aload           7
	//* 216  471:aload           10
	//* 217  473:invokevirtual   #403 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 218  476:goto            253
		{
			i = 0;
	//  219  479:iconst_0        
	//  220  480:istore_1        
			j = 0;
	//  221  481:iconst_0        
	//  222  482:istore_2        
		}
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, i), 0);
		obj = ((Object) ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()));
		i = view.getMeasuredHeight();
		j = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
		i = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i + j);
		obj = obj1;
_L15:
		mPopup.setContentView(((View) (obj)));
_L10:
		obj = ((Object) (mPopup.getBackground()));
		if(obj != null)
		{
			((Drawable) (obj)).getPadding(mTempRect);
			j = mTempRect.top + mTempRect.bottom;
			if(!mDropDownVerticalOffsetSet)
				mDropDownVerticalOffset = -mTempRect.top;
		} else
	//* 223  483:goto            269
	//* 224  486:aload_0         
	//* 225  487:getfield        #258 <Field PopupWindow mPopup>
	//* 226  490:invokevirtual   #408 <Method View PopupWindow.getContentView()>
	//* 227  493:checkcast       #410 <Class ViewGroup>
	//* 228  496:astore          7
	//* 229  498:aload_0         
	//* 230  499:getfield        #315 <Field View mPromptView>
	//* 231  502:astore          7
	//* 232  504:aload           7
	//* 233  506:ifnull          729
	//* 234  509:aload           7
	//* 235  511:invokevirtual   #360 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 236  514:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//* 237  517:astore          8
	//* 238  519:aload           7
	//* 239  521:invokevirtual   #363 <Method int View.getMeasuredHeight()>
	//* 240  524:istore_1        
	//* 241  525:aload           8
	//* 242  527:getfield        #366 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//* 243  530:istore_2        
	//* 244  531:aload           8
	//* 245  533:getfield        #369 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//* 246  536:iload_1         
	//* 247  537:iload_2         
	//* 248  538:iadd            
	//* 249  539:iadd            
	//* 250  540:istore_1        
	//* 251  541:goto            325
		{
			mTempRect.setEmpty();
	//  252  544:aload_0         
	//  253  545:getfield        #208 <Field Rect mTempRect>
	//  254  548:invokevirtual   #413 <Method void Rect.setEmpty()>
			j = 0;
	//  255  551:iconst_0        
	//  256  552:istore_2        
		}
		if(mPopup.getInputMethodMode() == 2)
			flag = flag1;
		else
	//* 257  553:goto            384
			flag = false;
	//  258  556:iconst_0        
	//  259  557:istore          5
		l = getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset, flag);
		if(mDropDownAlwaysVisible || mDropDownHeight == -1)
			return l + j;
		  goto _L8
_L7:
		((LinearLayout) (obj1)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		((LinearLayout) (obj1)).addView(view);
		  goto _L9
_L6:
		((LinearLayout) (obj1)).addView(view);
		((LinearLayout) (obj1)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		  goto _L9
_L2:
		obj = ((Object) ((ViewGroup)mPopup.getContentView()));
		obj = ((Object) (mPromptView));
		int k;
		if(obj != null)
		{
			obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()));
			i = ((View) (obj)).getMeasuredHeight();
			j = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
			i = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i + j);
		} else
	//* 260  559:goto            399
	//* 261  562:aload_0         
	//* 262  563:getfield        #176 <Field int mDropDownWidth>
	//* 263  566:tableswitch     -2 -1: default 588
	//	               -2 648
	//	               -1 687
	//* 264  588:aload_0         
	//* 265  589:getfield        #176 <Field int mDropDownWidth>
	//* 266  592:ldc2            #414 <Int 0x40000000>
	//* 267  595:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 268  598:istore_3        
	//* 269  599:aload_0         
	//* 270  600:getfield        #266 <Field DropDownListView mDropDownList>
	//* 271  603:iload_3         
	//* 272  604:iconst_0        
	//* 273  605:iconst_m1       
	//* 274  606:iload           4
	//* 275  608:iload_1         
	//* 276  609:isub            
	//* 277  610:iconst_m1       
	//* 278  611:invokevirtual   #418 <Method int DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
	//* 279  614:istore          4
	//* 280  616:iload_1         
	//* 281  617:istore_3        
	//* 282  618:iload           4
	//* 283  620:ifle            643
	//* 284  623:iload_1         
	//* 285  624:aload_0         
	//* 286  625:getfield        #266 <Field DropDownListView mDropDownList>
	//* 287  628:invokevirtual   #421 <Method int DropDownListView.getPaddingTop()>
	//* 288  631:aload_0         
	//* 289  632:getfield        #266 <Field DropDownListView mDropDownList>
	//* 290  635:invokevirtual   #424 <Method int DropDownListView.getPaddingBottom()>
	//* 291  638:iadd            
	//* 292  639:iload_2         
	//* 293  640:iadd            
	//* 294  641:iadd            
	//* 295  642:istore_3        
	//* 296  643:iload           4
	//* 297  645:iload_3         
	//* 298  646:iadd            
	//* 299  647:ireturn         
	//* 300  648:aload_0         
	//* 301  649:getfield        #210 <Field Context mContext>
	//* 302  652:invokevirtual   #428 <Method Resources Context.getResources()>
	//* 303  655:invokevirtual   #434 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 304  658:getfield        #439 <Field int DisplayMetrics.widthPixels>
	//* 305  661:aload_0         
	//* 306  662:getfield        #208 <Field Rect mTempRect>
	//* 307  665:getfield        #442 <Field int Rect.left>
	//* 308  668:aload_0         
	//* 309  669:getfield        #208 <Field Rect mTempRect>
	//* 310  672:getfield        #445 <Field int Rect.right>
	//* 311  675:iadd            
	//* 312  676:isub            
	//* 313  677:ldc2            #347 <Int 0x80000000>
	//* 314  680:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 315  683:istore_3        
	//* 316  684:goto            599
	//* 317  687:aload_0         
	//* 318  688:getfield        #210 <Field Context mContext>
	//* 319  691:invokevirtual   #428 <Method Resources Context.getResources()>
	//* 320  694:invokevirtual   #434 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 321  697:getfield        #439 <Field int DisplayMetrics.widthPixels>
	//* 322  700:aload_0         
	//* 323  701:getfield        #208 <Field Rect mTempRect>
	//* 324  704:getfield        #442 <Field int Rect.left>
	//* 325  707:aload_0         
	//* 326  708:getfield        #208 <Field Rect mTempRect>
	//* 327  711:getfield        #445 <Field int Rect.right>
	//* 328  714:iadd            
	//* 329  715:isub            
	//* 330  716:ldc2            #414 <Int 0x40000000>
	//* 331  719:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 332  722:istore_3        
	//* 333  723:goto            599
	//* 334  726:goto            384
		{
			i = 0;
	//  335  729:iconst_0        
	//  336  730:istore_1        
		}
		  goto _L10
_L8:
		mDropDownWidth;
		JVM INSTR tableswitch -2 -1: default 588
	//	               -2 648
	//	               -1 687;
		   goto _L11 _L12 _L13
_L11:
		k = android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x40000000);
_L14:
		l = mDropDownList.measureHeightOfChildrenCompat(k, 0, -1, l - i, -1);
		k = i;
		if(l > 0)
			k = i + (mDropDownList.getPaddingTop() + mDropDownList.getPaddingBottom() + j);
		return l + k;
_L12:
		k = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
		continue; /* Loop/switch isn't completed */
_L13:
		k = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
		if(true) goto _L14; else goto _L4
	//* 337  731:goto            325
_L4:
		i = 0;
	//  338  734:iconst_0        
	//  339  735:istore_1        
		  goto _L15
	//* 340  736:goto            316
	}

	private int getMaxAvailableHeight(View view, int i, boolean flag)
	{
		if(sGetMaxAvailableHeightMethod == null)
			break MISSING_BLOCK_LABEL_60;
	//    0    0:getstatic       #132 <Field Method sGetMaxAvailableHeightMethod>
	//    1    3:ifnull          60
		int j = ((Integer)sGetMaxAvailableHeightMethod.invoke(((Object) (mPopup)), new Object[] {
			view, Integer.valueOf(i), Boolean.valueOf(flag)
		})).intValue();
	//    2    6:getstatic       #132 <Field Method sGetMaxAvailableHeightMethod>
	//    3    9:aload_0         
	//    4   10:getfield        #258 <Field PopupWindow mPopup>
	//    5   13:iconst_3        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_1         
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:iload_2         
	//   14   24:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_2        
	//   18   30:iload_3         
	//   19   31:invokestatic    #454 <Method Boolean Boolean.valueOf(boolean)>
	//   20   34:aastore         
	//   21   35:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//   22   38:checkcast       #129 <Class Integer>
	//   23   41:invokevirtual   #463 <Method int Integer.intValue()>
	//   24   44:istore          4
		return j;
	//   25   46:iload           4
	//   26   48:ireturn         
		Exception exception;
		exception;
	//   27   49:astore          5
		Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
	//   28   51:ldc1            #46  <String "ListPopupWindow">
	//   29   53:ldc2            #465 <String "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.">
	//   30   56:invokestatic    #146 <Method int Log.i(String, String)>
	//   31   59:pop             
		return mPopup.getMaxAvailableHeight(view, i);
	//   32   60:aload_0         
	//   33   61:getfield        #258 <Field PopupWindow mPopup>
	//   34   64:aload_1         
	//   35   65:iload_2         
	//   36   66:invokevirtual   #468 <Method int PopupWindow.getMaxAvailableHeight(View, int)>
	//   37   69:ireturn         
	}

	private static boolean isConfirmKey(int i)
	{
		return i == 66 || i == 23;
	//    0    0:iload_0         
	//    1    1:bipush          66
	//    2    3:icmpeq          12
	//    3    6:iload_0         
	//    4    7:bipush          23
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private void removePromptView()
	{
		if(mPromptView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field View mPromptView>
	//*   2    4:ifnull          33
		{
			android.view.ViewParent viewparent = mPromptView.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #315 <Field View mPromptView>
	//    5   11:invokevirtual   #475 <Method android.view.ViewParent View.getParent()>
	//    6   14:astore_1        
			if(viewparent instanceof ViewGroup)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #410 <Class ViewGroup>
	//*   9   19:ifeq            33
				((ViewGroup)viewparent).removeView(mPromptView);
	//   10   22:aload_1         
	//   11   23:checkcast       #410 <Class ViewGroup>
	//   12   26:aload_0         
	//   13   27:getfield        #315 <Field View mPromptView>
	//   14   30:invokevirtual   #478 <Method void ViewGroup.removeView(View)>
		}
	//   15   33:return          
	}

	private void setPopupClipToScreenEnabled(boolean flag)
	{
		if(sClipToWindowEnabledMethod == null)
			break MISSING_BLOCK_LABEL_28;
	//    0    0:getstatic       #123 <Field Method sClipToWindowEnabledMethod>
	//    1    3:ifnull          28
		sClipToWindowEnabledMethod.invoke(((Object) (mPopup)), new Object[] {
			Boolean.valueOf(flag)
		});
	//    2    6:getstatic       #123 <Field Method sClipToWindowEnabledMethod>
	//    3    9:aload_0         
	//    4   10:getfield        #258 <Field PopupWindow mPopup>
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iload_1         
	//   10   20:invokestatic    #454 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:aastore         
	//   12   24:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//   13   27:pop             
		return;
	//   14   28:return          
		Exception exception;
		exception;
	//   15   29:astore_2        
		Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
	//   16   30:ldc1            #46  <String "ListPopupWindow">
	//   17   32:ldc2            #481 <String "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.">
	//   18   35:invokestatic    #146 <Method int Log.i(String, String)>
	//   19   38:pop             
		return;
	//   20   39:return          
	}

	public void clearListSelection()
	{
		DropDownListView dropdownlistview = mDropDownList;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field DropDownListView mDropDownList>
	//    2    4:astore_1        
		if(dropdownlistview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			dropdownlistview.setListSelectionHidden(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #485 <Method void DropDownListView.setListSelectionHidden(boolean)>
			dropdownlistview.requestLayout();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #488 <Method void DropDownListView.requestLayout()>
		}
	//   10   18:return          
	}

	public android.view.View.OnTouchListener createDragToOpenListener(View view)
	{
		return ((android.view.View.OnTouchListener) (new ForwardingListener(view) {

			public volatile ShowableListMenu getPopup()
			{
				return ((ShowableListMenu) (getPopup()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #24  <Method ListPopupWindow getPopup()>
			//    2    4:areturn         
			}

			public ListPopupWindow getPopup()
			{
				return ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ListPopupWindow this$0>
			//    2    4:areturn         
			}

			final ListPopupWindow this$0;

			
			{
				this$0 = ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ListPopupWindow this$0>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void ForwardingListener(View)>
			//    6   10:return          
			}
		}
));
	//    0    0:new             #8   <Class ListPopupWindow$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #493 <Method void ListPopupWindow$1(ListPopupWindow, View)>
	//    5    9:areturn         
	}

	DropDownListView createDropDownListView(Context context, boolean flag)
	{
		return new DropDownListView(context, flag);
	//    0    0:new             #279 <Class DropDownListView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #496 <Method void DropDownListView(Context, boolean)>
	//    5    9:areturn         
	}

	public void dismiss()
	{
		mPopup.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #500 <Method void PopupWindow.dismiss()>
		removePromptView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #502 <Method void removePromptView()>
		mPopup.setContentView(((View) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #258 <Field PopupWindow mPopup>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #373 <Method void PopupWindow.setContentView(View)>
		mDropDownList = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #266 <Field DropDownListView mDropDownList>
		mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
	//   12   24:aload_0         
	//   13   25:getfield        #223 <Field Handler mHandler>
	//   14   28:aload_0         
	//   15   29:getfield        #196 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
	//   16   32:invokevirtual   #506 <Method void Handler.removeCallbacks(Runnable)>
	//   17   35:return          
	}

	public View getAnchorView()
	{
		return mDropDownAnchorView;
	//    0    0:aload_0         
	//    1    1:getfield        #508 <Field View mDropDownAnchorView>
	//    2    4:areturn         
	}

	public int getAnimationStyle()
	{
		return mPopup.getAnimationStyle();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #511 <Method int PopupWindow.getAnimationStyle()>
	//    3    7:ireturn         
	}

	public Drawable getBackground()
	{
		return mPopup.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #377 <Method Drawable PopupWindow.getBackground()>
	//    3    7:areturn         
	}

	public int getHeight()
	{
		return mDropDownHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field int mDropDownHeight>
	//    2    4:ireturn         
	}

	public int getHorizontalOffset()
	{
		return mDropDownHorizontalOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field int mDropDownHorizontalOffset>
	//    2    4:ireturn         
	}

	public int getInputMethodMode()
	{
		return mPopup.getInputMethodMode();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #392 <Method int PopupWindow.getInputMethodMode()>
	//    3    7:ireturn         
	}

	public ListView getListView()
	{
		return ((ListView) (mDropDownList));
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field DropDownListView mDropDownList>
	//    2    4:areturn         
	}

	public int getPromptPosition()
	{
		return mPromptPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int mPromptPosition>
	//    2    4:ireturn         
	}

	public Object getSelectedItem()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mDropDownList.getSelectedItem();
	//    5    9:aload_0         
	//    6   10:getfield        #266 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #524 <Method Object DropDownListView.getSelectedItem()>
	//    8   16:areturn         
	}

	public long getSelectedItemId()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifne            11
			return 0x0L;
	//    3    7:ldc2w           #527 <Long 0x0L>
	//    4   10:lreturn         
		else
			return mDropDownList.getSelectedItemId();
	//    5   11:aload_0         
	//    6   12:getfield        #266 <Field DropDownListView mDropDownList>
	//    7   15:invokevirtual   #530 <Method long DropDownListView.getSelectedItemId()>
	//    8   18:lreturn         
	}

	public int getSelectedItemPosition()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return mDropDownList.getSelectedItemPosition();
	//    5    9:aload_0         
	//    6   10:getfield        #266 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//    8   16:ireturn         
	}

	public View getSelectedView()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mDropDownList.getSelectedView();
	//    5    9:aload_0         
	//    6   10:getfield        #266 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #536 <Method View DropDownListView.getSelectedView()>
	//    8   16:areturn         
	}

	public int getSoftInputMode()
	{
		return mPopup.getSoftInputMode();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #539 <Method int PopupWindow.getSoftInputMode()>
	//    3    7:ireturn         
	}

	public int getVerticalOffset()
	{
		if(!mDropDownVerticalOffsetSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #250 <Field boolean mDropDownVerticalOffsetSet>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mDropDownVerticalOffset;
	//    5    9:aload_0         
	//    6   10:getfield        #248 <Field int mDropDownVerticalOffset>
	//    7   13:ireturn         
	}

	public int getWidth()
	{
		return mDropDownWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field int mDropDownWidth>
	//    2    4:ireturn         
	}

	public boolean isDropDownAlwaysVisible()
	{
		return mDropDownAlwaysVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//    2    4:ireturn         
	}

	public boolean isInputMethodNotNeeded()
	{
		return mPopup.getInputMethodMode() == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #392 <Method int PopupWindow.getInputMethodMode()>
	//    3    7:iconst_2        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isModal()
	{
		return mModal;
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field boolean mModal>
	//    2    4:ireturn         
	}

	public boolean isShowing()
	{
		return mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #549 <Method boolean PopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(!isShowing() || i == 62 || mDropDownList.getSelectedItemPosition() < 0 && isConfirmKey(i)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #522 <Method boolean isShowing()>
	//    2    4:ifeq            280
	//    3    7:iload_1         
	//    4    8:bipush          62
	//    5   10:icmpeq          280
	//    6   13:aload_0         
	//    7   14:getfield        #266 <Field DropDownListView mDropDownList>
	//    8   17:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//    9   20:ifge            30
	//   10   23:iload_1         
	//   11   24:invokestatic    #553 <Method boolean isConfirmKey(int)>
	//   12   27:ifne            280
_L1:
		int j;
		int k;
		boolean flag;
		int l;
		l = mDropDownList.getSelectedItemPosition();
	//   13   30:aload_0         
	//   14   31:getfield        #266 <Field DropDownListView mDropDownList>
	//   15   34:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//   16   37:istore          6
		ListAdapter listadapter;
		if(!mPopup.isAboveAnchor())
	//*  17   39:aload_0         
	//*  18   40:getfield        #258 <Field PopupWindow mPopup>
	//*  19   43:invokevirtual   #556 <Method boolean PopupWindow.isAboveAnchor()>
	//*  20   46:ifne            156
			flag = true;
	//   21   49:iconst_1        
	//   22   50:istore          5
		else
	//*  23   52:aload_0         
	//*  24   53:getfield        #285 <Field ListAdapter mAdapter>
	//*  25   56:astore          8
	//*  26   58:ldc1            #187 <Int 0x7fffffff>
	//*  27   60:istore_3        
	//*  28   61:ldc2            #347 <Int 0x80000000>
	//*  29   64:istore          4
	//*  30   66:aload           8
	//*  31   68:ifnull          103
	//*  32   71:aload           8
	//*  33   73:invokeinterface #561 <Method boolean ListAdapter.areAllItemsEnabled()>
	//*  34   78:istore          7
	//*  35   80:iload           7
	//*  36   82:ifeq            162
	//*  37   85:iconst_0        
	//*  38   86:istore_3        
	//*  39   87:iload           7
	//*  40   89:ifeq            175
	//*  41   92:aload           8
	//*  42   94:invokeinterface #564 <Method int ListAdapter.getCount()>
	//*  43   99:iconst_1        
	//*  44  100:isub            
	//*  45  101:istore          4
	//*  46  103:iload           5
	//*  47  105:ifeq            120
	//*  48  108:iload_1         
	//*  49  109:bipush          19
	//*  50  111:icmpne          120
	//*  51  114:iload           6
	//*  52  116:iload_3         
	//*  53  117:icmple          138
	//*  54  120:iload           5
	//*  55  122:ifne            197
	//*  56  125:iload_1         
	//*  57  126:bipush          20
	//*  58  128:icmpne          197
	//*  59  131:iload           6
	//*  60  133:iload           4
	//*  61  135:icmplt          197
	//*  62  138:aload_0         
	//*  63  139:invokevirtual   #566 <Method void clearListSelection()>
	//*  64  142:aload_0         
	//*  65  143:getfield        #258 <Field PopupWindow mPopup>
	//*  66  146:iconst_1        
	//*  67  147:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
	//*  68  150:aload_0         
	//*  69  151:invokevirtual   #569 <Method void show()>
	//*  70  154:iconst_1        
	//*  71  155:ireturn         
			flag = false;
	//   72  156:iconst_0        
	//   73  157:istore          5
		listadapter = mAdapter;
		j = 0x7fffffff;
		k = 0x80000000;
		if(listadapter != null)
		{
			boolean flag1 = listadapter.areAllItemsEnabled();
			if(flag1)
				j = 0;
			else
	//*  74  159:goto            52
				j = mDropDownList.lookForSelectablePosition(0, true);
	//   75  162:aload_0         
	//   76  163:getfield        #266 <Field DropDownListView mDropDownList>
	//   77  166:iconst_0        
	//   78  167:iconst_1        
	//   79  168:invokevirtual   #573 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   80  171:istore_3        
			if(flag1)
				k = listadapter.getCount() - 1;
			else
	//*  81  172:goto            87
				k = mDropDownList.lookForSelectablePosition(listadapter.getCount() - 1, false);
	//   82  175:aload_0         
	//   83  176:getfield        #266 <Field DropDownListView mDropDownList>
	//   84  179:aload           8
	//   85  181:invokeinterface #564 <Method int ListAdapter.getCount()>
	//   86  186:iconst_1        
	//   87  187:isub            
	//   88  188:iconst_0        
	//   89  189:invokevirtual   #573 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   90  192:istore          4
		}
		if((!flag || i != 19 || l > j) && (flag || i != 20 || l < k)) goto _L4; else goto _L3
_L3:
		clearListSelection();
		mPopup.setInputMethodMode(1);
		show();
_L7:
		return true;
	//*  91  194:goto            103
_L4:
		mDropDownList.setListSelectionHidden(false);
	//   92  197:aload_0         
	//   93  198:getfield        #266 <Field DropDownListView mDropDownList>
	//   94  201:iconst_0        
	//   95  202:invokevirtual   #485 <Method void DropDownListView.setListSelectionHidden(boolean)>
		if(!mDropDownList.onKeyDown(i, keyevent))
			break; /* Loop/switch isn't completed */
	//   96  205:aload_0         
	//   97  206:getfield        #266 <Field DropDownListView mDropDownList>
	//   98  209:iload_1         
	//   99  210:aload_2         
	//  100  211:invokevirtual   #575 <Method boolean DropDownListView.onKeyDown(int, KeyEvent)>
	//  101  214:ifeq            282
		mPopup.setInputMethodMode(2);
	//  102  217:aload_0         
	//  103  218:getfield        #258 <Field PopupWindow mPopup>
	//  104  221:iconst_2        
	//  105  222:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
		mDropDownList.requestFocusFromTouch();
	//  106  225:aload_0         
	//  107  226:getfield        #266 <Field DropDownListView mDropDownList>
	//  108  229:invokevirtual   #578 <Method boolean DropDownListView.requestFocusFromTouch()>
	//  109  232:pop             
		show();
	//  110  233:aload_0         
	//  111  234:invokevirtual   #569 <Method void show()>
		i;
	//  112  237:iload_1         
		JVM INSTR lookupswitch 4: default 280
	//	               19: 154
	//	               20: 154
	//	               23: 154
	//	               66: 154;
	//  113  238:lookupswitch    4: default 280
	//	               19: 154
	//	               20: 154
	//	               23: 154
	//	               66: 154
		   goto _L2 _L5 _L5 _L5 _L5
_L5:
		if(true) goto _L7; else goto _L6
_L2:
		return false;
	//  114  280:iconst_0        
	//  115  281:ireturn         
_L6:
		if(!flag || i != 20)
			continue; /* Loop/switch isn't completed */
	//  116  282:iload           5
	//  117  284:ifeq            302
	//  118  287:iload_1         
	//  119  288:bipush          20
	//  120  290:icmpne          302
		if(l != k) goto _L2; else goto _L8
	//  121  293:iload           6
	//  122  295:iload           4
	//  123  297:icmpne          280
_L8:
		return true;
	//  124  300:iconst_1        
	//  125  301:ireturn         
		if(flag || i != 19 || l != j) goto _L2; else goto _L9
	//  126  302:iload           5
	//  127  304:ifne            280
	//  128  307:iload_1         
	//  129  308:bipush          19
	//  130  310:icmpne          280
	//  131  313:iload           6
	//  132  315:iload_3         
	//  133  316:icmpne          280
_L9:
		return true;
	//  134  319:iconst_1        
	//  135  320:ireturn         
	}

	public boolean onKeyPreIme(int i, KeyEvent keyevent)
	{
		if(i == 4 && isShowing())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          90
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #522 <Method boolean isShowing()>
	//*   5    9:ifeq            90
		{
			Object obj = ((Object) (mDropDownAnchorView));
	//    6   12:aload_0         
	//    7   13:getfield        #508 <Field View mDropDownAnchorView>
	//    8   16:astore_3        
			if(keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #584 <Method int KeyEvent.getAction()>
	//*  11   21:ifne            48
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #587 <Method int KeyEvent.getRepeatCount()>
	//*  14   28:ifne            48
			{
				obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   15   31:aload_3         
	//   16   32:invokevirtual   #591 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   17   35:astore_3        
				if(obj != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          46
					((android.view.KeyEvent.DispatcherState) (obj)).startTracking(keyevent, ((Object) (this)));
	//   20   40:aload_3         
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #597 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
				return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
			}
			if(keyevent.getAction() == 1)
	//*  26   48:aload_2         
	//*  27   49:invokevirtual   #584 <Method int KeyEvent.getAction()>
	//*  28   52:iconst_1        
	//*  29   53:icmpne          90
			{
				obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #591 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   32   60:astore_3        
				if(obj != null)
	//*  33   61:aload_3         
	//*  34   62:ifnull          70
					((android.view.KeyEvent.DispatcherState) (obj)).handleUpEvent(keyevent);
	//   35   65:aload_3         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #601 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
				if(keyevent.isTracking() && !keyevent.isCanceled())
	//*  38   70:aload_2         
	//*  39   71:invokevirtual   #604 <Method boolean KeyEvent.isTracking()>
	//*  40   74:ifeq            90
	//*  41   77:aload_2         
	//*  42   78:invokevirtual   #607 <Method boolean KeyEvent.isCanceled()>
	//*  43   81:ifne            90
				{
					dismiss();
	//   44   84:aload_0         
	//   45   85:invokevirtual   #608 <Method void dismiss()>
					return true;
	//   46   88:iconst_1        
	//   47   89:ireturn         
				}
			}
		}
		return false;
	//   48   90:iconst_0        
	//   49   91:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(isShowing() && mDropDownList.getSelectedItemPosition() >= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifeq            44
	//*   3    7:aload_0         
	//*   4    8:getfield        #266 <Field DropDownListView mDropDownList>
	//*   5   11:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//*   6   14:iflt            44
		{
			boolean flag = mDropDownList.onKeyUp(i, keyevent);
	//    7   17:aload_0         
	//    8   18:getfield        #266 <Field DropDownListView mDropDownList>
	//    9   21:iload_1         
	//   10   22:aload_2         
	//   11   23:invokevirtual   #611 <Method boolean DropDownListView.onKeyUp(int, KeyEvent)>
	//   12   26:istore_3        
			if(flag && isConfirmKey(i))
	//*  13   27:iload_3         
	//*  14   28:ifeq            42
	//*  15   31:iload_1         
	//*  16   32:invokestatic    #553 <Method boolean isConfirmKey(int)>
	//*  17   35:ifeq            42
				dismiss();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #608 <Method void dismiss()>
			return flag;
	//   20   42:iload_3         
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	public boolean performItemClick(int i)
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifeq            58
		{
			if(mItemClickListener != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//*   5   11:ifnull          56
			{
				DropDownListView dropdownlistview = mDropDownList;
	//    6   14:aload_0         
	//    7   15:getfield        #266 <Field DropDownListView mDropDownList>
	//    8   18:astore_2        
				View view = dropdownlistview.getChildAt(i - dropdownlistview.getFirstVisiblePosition());
	//    9   19:aload_2         
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #615 <Method int DropDownListView.getFirstVisiblePosition()>
	//   13   25:isub            
	//   14   26:invokevirtual   #619 <Method View DropDownListView.getChildAt(int)>
	//   15   29:astore_3        
				ListAdapter listadapter = dropdownlistview.getAdapter();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #623 <Method ListAdapter DropDownListView.getAdapter()>
	//   18   34:astore          4
				mItemClickListener.onItemClick(((AdapterView) (dropdownlistview)), view, i, listadapter.getItemId(i));
	//   19   36:aload_0         
	//   20   37:getfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//   21   40:aload_2         
	//   22   41:aload_3         
	//   23   42:iload_1         
	//   24   43:aload           4
	//   25   45:iload_1         
	//   26   46:invokeinterface #627 <Method long ListAdapter.getItemId(int)>
	//   27   51:invokeinterface #633 <Method void android.widget.AdapterView$OnItemClickListener.onItemClick(AdapterView, View, int, long)>
			}
			return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
		} else
		{
			return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
		}
	}

	public void postShow()
	{
		mHandler.post(mShowDropDownRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #269 <Field Runnable mShowDropDownRunnable>
	//    4    8:invokevirtual   #638 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setAdapter(ListAdapter listadapter)
	{
		if(mObserver != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #640 <Field DataSetObserver mObserver>
	//    2    4:ifnonnull       60
_L1:
		mObserver = ((DataSetObserver) (new PopupDataSetObserver()));
	//    3    7:aload_0         
	//    4    8:new             #17  <Class ListPopupWindow$PopupDataSetObserver>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #641 <Method void ListPopupWindow$PopupDataSetObserver(ListPopupWindow)>
	//    8   16:putfield        #640 <Field DataSetObserver mObserver>
_L4:
		mAdapter = listadapter;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #285 <Field ListAdapter mAdapter>
		if(mAdapter != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #285 <Field ListAdapter mAdapter>
	//*  14   28:ifnull          41
			listadapter.registerDataSetObserver(mObserver);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #640 <Field DataSetObserver mObserver>
	//   18   36:invokeinterface #645 <Method void ListAdapter.registerDataSetObserver(DataSetObserver)>
		if(mDropDownList != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #266 <Field DropDownListView mDropDownList>
	//*  21   45:ifnull          59
			mDropDownList.setAdapter(mAdapter);
	//   22   48:aload_0         
	//   23   49:getfield        #266 <Field DropDownListView mDropDownList>
	//   24   52:aload_0         
	//   25   53:getfield        #285 <Field ListAdapter mAdapter>
	//   26   56:invokevirtual   #289 <Method void DropDownListView.setAdapter(ListAdapter)>
		return;
	//   27   59:return          
_L2:
		if(mAdapter != null)
	//*  28   60:aload_0         
	//*  29   61:getfield        #285 <Field ListAdapter mAdapter>
	//*  30   64:ifnull          19
			mAdapter.unregisterDataSetObserver(mObserver);
	//   31   67:aload_0         
	//   32   68:getfield        #285 <Field ListAdapter mAdapter>
	//   33   71:aload_0         
	//   34   72:getfield        #640 <Field DataSetObserver mObserver>
	//   35   75:invokeinterface #648 <Method void ListAdapter.unregisterDataSetObserver(DataSetObserver)>
		if(true) goto _L4; else goto _L3
	//   36   80:goto            19
_L3:
	}

	public void setAnchorView(View view)
	{
		mDropDownAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #508 <Field View mDropDownAnchorView>
	//    3    5:return          
	}

	public void setAnimationStyle(int i)
	{
		mPopup.setAnimationStyle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #652 <Method void PopupWindow.setAnimationStyle(int)>
	//    4    8:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mPopup.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #655 <Method void PopupWindow.setBackgroundDrawable(Drawable)>
	//    4    8:return          
	}

	public void setContentWidth(int i)
	{
		Drawable drawable = mPopup.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #377 <Method Drawable PopupWindow.getBackground()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          43
		{
			drawable.getPadding(mTempRect);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #208 <Field Rect mTempRect>
	//    9   17:invokevirtual   #383 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			mDropDownWidth = mTempRect.left + mTempRect.right + i;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #208 <Field Rect mTempRect>
	//   14   26:getfield        #442 <Field int Rect.left>
	//   15   29:aload_0         
	//   16   30:getfield        #208 <Field Rect mTempRect>
	//   17   33:getfield        #445 <Field int Rect.right>
	//   18   36:iadd            
	//   19   37:iload_1         
	//   20   38:iadd            
	//   21   39:putfield        #176 <Field int mDropDownWidth>
			return;
	//   22   42:return          
		} else
		{
			setWidth(i);
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:invokevirtual   #659 <Method void setWidth(int)>
			return;
	//   26   48:return          
		}
	}

	public void setDropDownAlwaysVisible(boolean flag)
	{
		mDropDownAlwaysVisible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #184 <Field boolean mDropDownAlwaysVisible>
	//    3    5:return          
	}

	public void setDropDownGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #182 <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setEpicenterBounds(Rect rect)
	{
		mEpicenterBounds = rect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #664 <Field Rect mEpicenterBounds>
	//    3    5:return          
	}

	public void setForceIgnoreOutsideTouch(boolean flag)
	{
		mForceIgnoreOutsideTouch = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//    3    5:return          
	}

	public void setHeight(int i)
	{
		if(i < 0 && -2 != i && -1 != i)
	//*   0    0:iload_1         
	//*   1    1:ifge            26
	//*   2    4:bipush          -2
	//*   3    6:iload_1         
	//*   4    7:icmpeq          26
	//*   5   10:iconst_m1       
	//*   6   11:iload_1         
	//*   7   12:icmpeq          26
		{
			throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
	//    8   15:new             #668 <Class IllegalArgumentException>
	//    9   18:dup             
	//   10   19:ldc2            #670 <String "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.">
	//   11   22:invokespecial   #673 <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
		} else
		{
			mDropDownHeight = i;
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:putfield        #174 <Field int mDropDownHeight>
			return;
	//   16   31:return          
		}
	}

	public void setHorizontalOffset(int i)
	{
		mDropDownHorizontalOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #243 <Field int mDropDownHorizontalOffset>
	//    3    5:return          
	}

	public void setInputMethodMode(int i)
	{
		mPopup.setInputMethodMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
	//    4    8:return          
	}

	void setListItemExpandMax(int i)
	{
		mListItemExpandMaximum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int mListItemExpandMaximum>
	//    3    5:return          
	}

	public void setListSelector(Drawable drawable)
	{
		mDropDownListHighlight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #277 <Field Drawable mDropDownListHighlight>
	//    3    5:return          
	}

	public void setModal(boolean flag)
	{
		mModal = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #271 <Field boolean mModal>
		mPopup.setFocusable(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #258 <Field PopupWindow mPopup>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #678 <Method void PopupWindow.setFocusable(boolean)>
	//    7   13:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mPopup.setOnDismissListener(ondismisslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #682 <Method void PopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//    4    8:return          
	}

	public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
	{
		mItemClickListener = onitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//    3    5:return          
	}

	public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
	{
		mItemSelectedListener = onitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//    3    5:return          
	}

	public void setOverlapAnchor(boolean flag)
	{
		mOverlapAnchorSet = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #685 <Field boolean mOverlapAnchorSet>
		mOverlapAnchor = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #687 <Field boolean mOverlapAnchor>
	//    6   10:return          
	}

	public void setPromptPosition(int i)
	{
		mPromptPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #191 <Field int mPromptPosition>
	//    3    5:return          
	}

	public void setPromptView(View view)
	{
		boolean flag = isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #522 <Method boolean isShowing()>
	//    2    4:istore_2        
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            13
			removePromptView();
	//    5    9:aload_0         
	//    6   10:invokespecial   #502 <Method void removePromptView()>
		mPromptView = view;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #315 <Field View mPromptView>
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            26
			show();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #569 <Method void show()>
	//   14   26:return          
	}

	public void setSelection(int i)
	{
		DropDownListView dropdownlistview = mDropDownList;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field DropDownListView mDropDownList>
	//    2    4:astore_2        
		if(isShowing() && dropdownlistview != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #522 <Method boolean isShowing()>
	//*   5    9:ifeq            39
	//*   6   12:aload_2         
	//*   7   13:ifnull          39
		{
			dropdownlistview.setListSelectionHidden(false);
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #485 <Method void DropDownListView.setListSelectionHidden(boolean)>
			dropdownlistview.setSelection(i);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #692 <Method void DropDownListView.setSelection(int)>
			if(dropdownlistview.getChoiceMode() != 0)
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #695 <Method int DropDownListView.getChoiceMode()>
	//*  16   30:ifeq            39
				dropdownlistview.setItemChecked(i, true);
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #699 <Method void DropDownListView.setItemChecked(int, boolean)>
		}
	//   21   39:return          
	}

	public void setSoftInputMode(int i)
	{
		mPopup.setSoftInputMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #702 <Method void PopupWindow.setSoftInputMode(int)>
	//    4    8:return          
	}

	public void setVerticalOffset(int i)
	{
		mDropDownVerticalOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #248 <Field int mDropDownVerticalOffset>
		mDropDownVerticalOffsetSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #250 <Field boolean mDropDownVerticalOffsetSet>
	//    6   10:return          
	}

	public void setWidth(int i)
	{
		mDropDownWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #176 <Field int mDropDownWidth>
	//    3    5:return          
	}

	public void setWindowLayoutType(int i)
	{
		mDropDownWindowLayoutType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #178 <Field int mDropDownWindowLayoutType>
	//    3    5:return          
	}

	public void show()
	{
		int i;
		byte byte2;
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		byte2 = -1;
	//    4    6:iconst_m1       
	//    5    7:istore          4
		i = buildDropDown();
	//    6    9:aload_0         
	//    7   10:invokespecial   #706 <Method int buildDropDown()>
	//    8   13:istore_1        
		flag2 = isInputMethodNotNeeded();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #708 <Method boolean isInputMethodNotNeeded()>
	//   11   18:istore          9
		PopupWindowCompat.setWindowLayoutType(mPopup, mDropDownWindowLayoutType);
	//   12   20:aload_0         
	//   13   21:getfield        #258 <Field PopupWindow mPopup>
	//   14   24:aload_0         
	//   15   25:getfield        #178 <Field int mDropDownWindowLayoutType>
	//   16   28:invokestatic    #713 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
		if(!mPopup.isShowing()) goto _L2; else goto _L1
	//   17   31:aload_0         
	//   18   32:getfield        #258 <Field PopupWindow mPopup>
	//   19   35:invokevirtual   #549 <Method boolean PopupWindow.isShowing()>
	//   20   38:ifeq            300
_L1:
		if(ViewCompat.isAttachedToWindow(getAnchorView())) goto _L4; else goto _L3
	//   21   41:aload_0         
	//   22   42:invokevirtual   #396 <Method View getAnchorView()>
	//   23   45:invokestatic    #719 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//   24   48:ifne            52
_L3:
		return;
	//   25   51:return          
_L4:
		int j;
		if(mDropDownWidth == -1)
	//*  26   52:aload_0         
	//*  27   53:getfield        #176 <Field int mDropDownWidth>
	//*  28   56:iconst_m1       
	//*  29   57:icmpne          201
			j = -1;
	//   30   60:iconst_m1       
	//   31   61:istore_2        
		else
	//*  32   62:aload_0         
	//*  33   63:getfield        #174 <Field int mDropDownHeight>
	//*  34   66:iconst_m1       
	//*  35   67:icmpne          277
	//*  36   70:iload           9
	//*  37   72:ifeq            229
	//*  38   75:iload           9
	//*  39   77:ifeq            239
	//*  40   80:aload_0         
	//*  41   81:getfield        #258 <Field PopupWindow mPopup>
	//*  42   84:astore          10
	//*  43   86:aload_0         
	//*  44   87:getfield        #176 <Field int mDropDownWidth>
	//*  45   90:iconst_m1       
	//*  46   91:icmpne          234
	//*  47   94:iconst_m1       
	//*  48   95:istore_3        
	//*  49   96:aload           10
	//*  50   98:iload_3         
	//*  51   99:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//*  52  102:aload_0         
	//*  53  103:getfield        #258 <Field PopupWindow mPopup>
	//*  54  106:iconst_0        
	//*  55  107:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//*  56  110:aload_0         
	//*  57  111:getfield        #258 <Field PopupWindow mPopup>
	//*  58  114:astore          10
	//*  59  116:iload           8
	//*  60  118:istore          7
	//*  61  120:aload_0         
	//*  62  121:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//*  63  124:ifne            141
	//*  64  127:iload           8
	//*  65  129:istore          7
	//*  66  131:aload_0         
	//*  67  132:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//*  68  135:ifne            141
	//*  69  138:iconst_1        
	//*  70  139:istore          7
	//*  71  141:aload           10
	//*  72  143:iload           7
	//*  73  145:invokevirtual   #725 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//*  74  148:aload_0         
	//*  75  149:getfield        #258 <Field PopupWindow mPopup>
	//*  76  152:astore          10
	//*  77  154:aload_0         
	//*  78  155:invokevirtual   #396 <Method View getAnchorView()>
	//*  79  158:astore          11
	//*  80  160:aload_0         
	//*  81  161:getfield        #243 <Field int mDropDownHorizontalOffset>
	//*  82  164:istore          5
	//*  83  166:aload_0         
	//*  84  167:getfield        #248 <Field int mDropDownVerticalOffset>
	//*  85  170:istore          6
	//*  86  172:iload_2         
	//*  87  173:istore_3        
	//*  88  174:iload_2         
	//*  89  175:ifge            180
	//*  90  178:iconst_m1       
	//*  91  179:istore_3        
	//*  92  180:iload_1         
	//*  93  181:ifge            297
	//*  94  184:iload           4
	//*  95  186:istore_1        
	//*  96  187:aload           10
	//*  97  189:aload           11
	//*  98  191:iload           5
	//*  99  193:iload           6
	//* 100  195:iload_3         
	//* 101  196:iload_1         
	//* 102  197:invokevirtual   #729 <Method void PopupWindow.update(View, int, int, int, int)>
	//* 103  200:return          
		if(mDropDownWidth == -2)
	//* 104  201:aload_0         
	//* 105  202:getfield        #176 <Field int mDropDownWidth>
	//* 106  205:bipush          -2
	//* 107  207:icmpne          221
			j = getAnchorView().getWidth();
	//  108  210:aload_0         
	//  109  211:invokevirtual   #396 <Method View getAnchorView()>
	//  110  214:invokevirtual   #731 <Method int View.getWidth()>
	//  111  217:istore_2        
		else
	//* 112  218:goto            62
			j = mDropDownWidth;
	//  113  221:aload_0         
	//  114  222:getfield        #176 <Field int mDropDownWidth>
	//  115  225:istore_2        
		if(mDropDownHeight != -1) goto _L6; else goto _L5
_L5:
		if(!flag2)
	//* 116  226:goto            62
			i = -1;
	//  117  229:iconst_m1       
	//  118  230:istore_1        
		if(flag2)
		{
			PopupWindow popupwindow = mPopup;
			byte byte0;
			int l;
			int i1;
			View view;
			if(mDropDownWidth == -1)
				byte0 = -1;
			else
	//* 119  231:goto            75
				byte0 = 0;
	//  120  234:iconst_0        
	//  121  235:istore_3        
			popupwindow.setWidth(((int) (byte0)));
			mPopup.setHeight(0);
		} else
	//* 122  236:goto            96
		{
			PopupWindow popupwindow1 = mPopup;
	//  123  239:aload_0         
	//  124  240:getfield        #258 <Field PopupWindow mPopup>
	//  125  243:astore          10
			byte byte1;
			if(mDropDownWidth == -1)
	//* 126  245:aload_0         
	//* 127  246:getfield        #176 <Field int mDropDownWidth>
	//* 128  249:iconst_m1       
	//* 129  250:icmpne          272
				byte1 = -1;
	//  130  253:iconst_m1       
	//  131  254:istore_3        
			else
	//* 132  255:aload           10
	//* 133  257:iload_3         
	//* 134  258:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//* 135  261:aload_0         
	//* 136  262:getfield        #258 <Field PopupWindow mPopup>
	//* 137  265:iconst_m1       
	//* 138  266:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//* 139  269:goto            110
				byte1 = 0;
	//  140  272:iconst_0        
	//  141  273:istore_3        
			popupwindow1.setWidth(((int) (byte1)));
			mPopup.setHeight(-1);
		}
_L7:
		popupwindow = mPopup;
		flag = flag1;
		if(!mForceIgnoreOutsideTouch)
		{
			flag = flag1;
			if(!mDropDownAlwaysVisible)
				flag = true;
		}
		popupwindow.setOutsideTouchable(flag);
		popupwindow = mPopup;
		view = getAnchorView();
		l = mDropDownHorizontalOffset;
		i1 = mDropDownVerticalOffset;
		byte0 = ((byte) (j));
		if(j < 0)
			byte0 = -1;
		if(i < 0)
			i = ((int) (byte2));
		popupwindow.update(view, l, i1, ((int) (byte0)), i);
		return;
	//* 142  274:goto            255
_L6:
		if(mDropDownHeight != -2)
	//* 143  277:aload_0         
	//* 144  278:getfield        #174 <Field int mDropDownHeight>
	//* 145  281:bipush          -2
	//* 146  283:icmpne          289
	//* 147  286:goto            110
			i = mDropDownHeight;
	//  148  289:aload_0         
	//  149  290:getfield        #174 <Field int mDropDownHeight>
	//  150  293:istore_1        
		if(true) goto _L7; else goto _L2
	//  151  294:goto            110
	//* 152  297:goto            187
_L2:
		int k;
		PopupWindow popupwindow2;
		if(mDropDownWidth == -1)
	//* 153  300:aload_0         
	//* 154  301:getfield        #176 <Field int mDropDownWidth>
	//* 155  304:iconst_m1       
	//* 156  305:icmpne          497
			k = -1;
	//  157  308:iconst_m1       
	//  158  309:istore_2        
		else
	//* 159  310:aload_0         
	//* 160  311:getfield        #174 <Field int mDropDownHeight>
	//* 161  314:iconst_m1       
	//* 162  315:icmpne          525
	//* 163  318:iconst_m1       
	//* 164  319:istore_1        
	//* 165  320:aload_0         
	//* 166  321:getfield        #258 <Field PopupWindow mPopup>
	//* 167  324:iload_2         
	//* 168  325:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//* 169  328:aload_0         
	//* 170  329:getfield        #258 <Field PopupWindow mPopup>
	//* 171  332:iload_1         
	//* 172  333:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//* 173  336:aload_0         
	//* 174  337:iconst_1        
	//* 175  338:invokespecial   #733 <Method void setPopupClipToScreenEnabled(boolean)>
	//* 176  341:aload_0         
	//* 177  342:getfield        #258 <Field PopupWindow mPopup>
	//* 178  345:astore          10
	//* 179  347:aload_0         
	//* 180  348:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//* 181  351:ifne            542
	//* 182  354:aload_0         
	//* 183  355:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 184  358:ifne            542
	//* 185  361:aload           10
	//* 186  363:iload           7
	//* 187  365:invokevirtual   #725 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//* 188  368:aload_0         
	//* 189  369:getfield        #258 <Field PopupWindow mPopup>
	//* 190  372:aload_0         
	//* 191  373:getfield        #199 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
	//* 192  376:invokevirtual   #737 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
	//* 193  379:aload_0         
	//* 194  380:getfield        #685 <Field boolean mOverlapAnchorSet>
	//* 195  383:ifeq            397
	//* 196  386:aload_0         
	//* 197  387:getfield        #258 <Field PopupWindow mPopup>
	//* 198  390:aload_0         
	//* 199  391:getfield        #687 <Field boolean mOverlapAnchor>
	//* 200  394:invokestatic    #740 <Method void PopupWindowCompat.setOverlapAnchor(PopupWindow, boolean)>
	//* 201  397:getstatic       #138 <Field Method sSetEpicenterBoundsMethod>
	//* 202  400:ifnull          425
	//* 203  403:getstatic       #138 <Field Method sSetEpicenterBoundsMethod>
	//* 204  406:aload_0         
	//* 205  407:getfield        #258 <Field PopupWindow mPopup>
	//* 206  410:iconst_1        
	//* 207  411:anewarray       Object[]
	//* 208  414:dup             
	//* 209  415:iconst_0        
	//* 210  416:aload_0         
	//* 211  417:getfield        #664 <Field Rect mEpicenterBounds>
	//* 212  420:aastore         
	//* 213  421:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//* 214  424:pop             
	//* 215  425:aload_0         
	//* 216  426:getfield        #258 <Field PopupWindow mPopup>
	//* 217  429:aload_0         
	//* 218  430:invokevirtual   #396 <Method View getAnchorView()>
	//* 219  433:aload_0         
	//* 220  434:getfield        #243 <Field int mDropDownHorizontalOffset>
	//* 221  437:aload_0         
	//* 222  438:getfield        #248 <Field int mDropDownVerticalOffset>
	//* 223  441:aload_0         
	//* 224  442:getfield        #182 <Field int mDropDownGravity>
	//* 225  445:invokestatic    #744 <Method void PopupWindowCompat.showAsDropDown(PopupWindow, View, int, int, int)>
	//* 226  448:aload_0         
	//* 227  449:getfield        #266 <Field DropDownListView mDropDownList>
	//* 228  452:iconst_m1       
	//* 229  453:invokevirtual   #692 <Method void DropDownListView.setSelection(int)>
	//* 230  456:aload_0         
	//* 231  457:getfield        #271 <Field boolean mModal>
	//* 232  460:ifeq            473
	//* 233  463:aload_0         
	//* 234  464:getfield        #266 <Field DropDownListView mDropDownList>
	//* 235  467:invokevirtual   #747 <Method boolean DropDownListView.isInTouchMode()>
	//* 236  470:ifeq            477
	//* 237  473:aload_0         
	//* 238  474:invokevirtual   #566 <Method void clearListSelection()>
	//* 239  477:aload_0         
	//* 240  478:getfield        #271 <Field boolean mModal>
	//* 241  481:ifne            51
	//* 242  484:aload_0         
	//* 243  485:getfield        #223 <Field Handler mHandler>
	//* 244  488:aload_0         
	//* 245  489:getfield        #205 <Field ListPopupWindow$ListSelectorHider mHideSelector>
	//* 246  492:invokevirtual   #638 <Method boolean Handler.post(Runnable)>
	//* 247  495:pop             
	//* 248  496:return          
		if(mDropDownWidth == -2)
	//* 249  497:aload_0         
	//* 250  498:getfield        #176 <Field int mDropDownWidth>
	//* 251  501:bipush          -2
	//* 252  503:icmpne          517
			k = getAnchorView().getWidth();
	//  253  506:aload_0         
	//  254  507:invokevirtual   #396 <Method View getAnchorView()>
	//  255  510:invokevirtual   #731 <Method int View.getWidth()>
	//  256  513:istore_2        
		else
	//* 257  514:goto            310
			k = mDropDownWidth;
	//  258  517:aload_0         
	//  259  518:getfield        #176 <Field int mDropDownWidth>
	//  260  521:istore_2        
		if(mDropDownHeight == -1)
			i = -1;
		else
	//* 261  522:goto            310
		if(mDropDownHeight != -2)
	//* 262  525:aload_0         
	//* 263  526:getfield        #174 <Field int mDropDownHeight>
	//* 264  529:bipush          -2
	//* 265  531:icmpeq          320
			i = mDropDownHeight;
	//  266  534:aload_0         
	//  267  535:getfield        #174 <Field int mDropDownHeight>
	//  268  538:istore_1        
		mPopup.setWidth(k);
		mPopup.setHeight(i);
		setPopupClipToScreenEnabled(true);
		popupwindow2 = mPopup;
		if(mForceIgnoreOutsideTouch || mDropDownAlwaysVisible)
	//* 269  539:goto            320
			flag = false;
	//  270  542:iconst_0        
	//  271  543:istore          7
		popupwindow2.setOutsideTouchable(flag);
		mPopup.setTouchInterceptor(((android.view.View.OnTouchListener) (mTouchInterceptor)));
		if(mOverlapAnchorSet)
			PopupWindowCompat.setOverlapAnchor(mPopup, mOverlapAnchor);
		if(sSetEpicenterBoundsMethod != null)
			try
			{
				sSetEpicenterBoundsMethod.invoke(((Object) (mPopup)), new Object[] {
					mEpicenterBounds
				});
			}
	//* 272  545:goto            361
			catch(Exception exception)
	//* 273  548:astore          10
			{
				Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", ((Throwable) (exception)));
	//  274  550:ldc1            #46  <String "ListPopupWindow">
	//  275  552:ldc2            #749 <String "Could not invoke setEpicenterBounds on PopupWindow">
	//  276  555:aload           10
	//  277  557:invokestatic    #752 <Method int Log.e(String, String, Throwable)>
	//  278  560:pop             
			}
		PopupWindowCompat.showAsDropDown(mPopup, getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
		mDropDownList.setSelection(-1);
		if(!mModal || mDropDownList.isInTouchMode())
			clearListSelection();
		if(!mModal)
		{
			mHandler.post(((Runnable) (mHideSelector)));
			return;
		}
		if(true) goto _L3; else goto _L8
	//  279  561:goto            425
_L8:
	}

	private static final boolean DEBUG = false;
	static final int EXPAND_LIST_TIMEOUT = 250;
	public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
	public static final int INPUT_METHOD_NEEDED = 1;
	public static final int INPUT_METHOD_NOT_NEEDED = 2;
	public static final int MATCH_PARENT = -1;
	public static final int POSITION_PROMPT_ABOVE = 0;
	public static final int POSITION_PROMPT_BELOW = 1;
	private static final String TAG = "ListPopupWindow";
	public static final int WRAP_CONTENT = -2;
	private static Method sClipToWindowEnabledMethod;
	private static Method sGetMaxAvailableHeightMethod;
	private static Method sSetEpicenterBoundsMethod;
	private ListAdapter mAdapter;
	private Context mContext;
	private boolean mDropDownAlwaysVisible;
	private View mDropDownAnchorView;
	private int mDropDownGravity;
	private int mDropDownHeight;
	private int mDropDownHorizontalOffset;
	DropDownListView mDropDownList;
	private Drawable mDropDownListHighlight;
	private int mDropDownVerticalOffset;
	private boolean mDropDownVerticalOffsetSet;
	private int mDropDownWidth;
	private int mDropDownWindowLayoutType;
	private Rect mEpicenterBounds;
	private boolean mForceIgnoreOutsideTouch;
	final Handler mHandler;
	private final ListSelectorHider mHideSelector;
	private boolean mIsAnimatedFromAnchor;
	private android.widget.AdapterView.OnItemClickListener mItemClickListener;
	private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
	int mListItemExpandMaximum;
	private boolean mModal;
	private DataSetObserver mObserver;
	private boolean mOverlapAnchor;
	private boolean mOverlapAnchorSet;
	PopupWindow mPopup;
	private int mPromptPosition;
	private View mPromptView;
	final ResizePopupRunnable mResizePopupRunnable;
	private final PopupScrollListener mScrollListener;
	private Runnable mShowDropDownRunnable;
	private final Rect mTempRect;
	private final PopupTouchInterceptor mTouchInterceptor;

	static 
	{
		try
		{
			sClipToWindowEnabledMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setClipToScreenEnabled", new Class[] {
				Boolean.TYPE
			});
	//    0    0:ldc1            #107 <Class PopupWindow>
	//    1    2:ldc1            #109 <String "setClipToScreenEnabled">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #117 <Field Class Boolean.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #121 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   17:putstatic       #123 <Field Method sClipToWindowEnabledMethod>
		}
	//*  10   20:ldc1            #107 <Class PopupWindow>
	//*  11   22:ldc1            #125 <String "getMaxAvailableHeight">
	//*  12   24:iconst_3        
	//*  13   25:anewarray       Class[]
	//*  14   28:dup             
	//*  15   29:iconst_0        
	//*  16   30:ldc1            #127 <Class View>
	//*  17   32:aastore         
	//*  18   33:dup             
	//*  19   34:iconst_1        
	//*  20   35:getstatic       #130 <Field Class Integer.TYPE>
	//*  21   38:aastore         
	//*  22   39:dup             
	//*  23   40:iconst_2        
	//*  24   41:getstatic       #117 <Field Class Boolean.TYPE>
	//*  25   44:aastore         
	//*  26   45:invokevirtual   #121 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  27   48:putstatic       #132 <Field Method sGetMaxAvailableHeightMethod>
	//*  28   51:ldc1            #107 <Class PopupWindow>
	//*  29   53:ldc1            #134 <String "setEpicenterBounds">
	//*  30   55:iconst_1        
	//*  31   56:anewarray       Class[]
	//*  32   59:dup             
	//*  33   60:iconst_0        
	//*  34   61:ldc1            #136 <Class Rect>
	//*  35   63:aastore         
	//*  36   64:invokevirtual   #121 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  37   67:putstatic       #138 <Field Method sSetEpicenterBoundsMethod>
	//*  38   70:return          
		catch(NoSuchMethodException nosuchmethodexception)
	//*  39   71:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
	//   40   72:ldc1            #46  <String "ListPopupWindow">
	//   41   74:ldc1            #140 <String "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.">
	//   42   76:invokestatic    #146 <Method int Log.i(String, String)>
	//   43   79:pop             
		}
		try
		{
			sGetMaxAvailableHeightMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getMaxAvailableHeight", new Class[] {
				android/view/View, Integer.TYPE, Boolean.TYPE
			});
		}
	//*  44   80:goto            20
		catch(NoSuchMethodException nosuchmethodexception1)
	//*  45   83:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
	//   46   84:ldc1            #46  <String "ListPopupWindow">
	//   47   86:ldc1            #148 <String "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.">
	//   48   88:invokestatic    #146 <Method int Log.i(String, String)>
	//   49   91:pop             
		}
		try
		{
			sSetEpicenterBoundsMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setEpicenterBounds", new Class[] {
				android/graphics/Rect
			});
		}
	//*  50   92:goto            51
		catch(NoSuchMethodException nosuchmethodexception2)
	//*  51   95:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
	//   52   96:ldc1            #46  <String "ListPopupWindow">
	//   53   98:ldc1            #150 <String "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.">
	//   54  100:invokestatic    #146 <Method int Log.i(String, String)>
	//   55  103:pop             
		}
	//*  56  104:return          
	}
}
