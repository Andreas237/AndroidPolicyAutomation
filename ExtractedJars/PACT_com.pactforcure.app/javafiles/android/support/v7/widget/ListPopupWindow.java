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
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		Object obj;
		Object obj1;
		View view;
		Object obj2;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		if(mDropDownList != null)
			break MISSING_BLOCK_LABEL_485;
	//    4    4:aload_0         
	//    5    5:getfield        #266 <Field DropDownListView mDropDownList>
	//    6    8:ifnonnull       485
		obj2 = ((Object) (mContext));
	//    7   11:aload_0         
	//    8   12:getfield        #210 <Field Context mContext>
	//    9   15:astore          9
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
	//   10   17:aload_0         
	//   11   18:new             #10  <Class ListPopupWindow$2>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #267 <Method void ListPopupWindow$2(ListPopupWindow)>
	//   15   26:putfield        #269 <Field Runnable mShowDropDownRunnable>
		if(!mModal)
	//*  16   29:aload_0         
	//*  17   30:getfield        #271 <Field boolean mModal>
	//*  18   33:ifne            434
			flag = true;
	//   19   36:iconst_1        
	//   20   37:istore          5
		else
	//*  21   39:aload_0         
	//*  22   40:aload_0         
	//*  23   41:aload           9
	//*  24   43:iload           5
	//*  25   45:invokevirtual   #275 <Method DropDownListView createDropDownListView(Context, boolean)>
	//*  26   48:putfield        #266 <Field DropDownListView mDropDownList>
	//*  27   51:aload_0         
	//*  28   52:getfield        #277 <Field Drawable mDropDownListHighlight>
	//*  29   55:ifnull          69
	//*  30   58:aload_0         
	//*  31   59:getfield        #266 <Field DropDownListView mDropDownList>
	//*  32   62:aload_0         
	//*  33   63:getfield        #277 <Field Drawable mDropDownListHighlight>
	//*  34   66:invokevirtual   #283 <Method void DropDownListView.setSelector(Drawable)>
	//*  35   69:aload_0         
	//*  36   70:getfield        #266 <Field DropDownListView mDropDownList>
	//*  37   73:aload_0         
	//*  38   74:getfield        #285 <Field ListAdapter mAdapter>
	//*  39   77:invokevirtual   #289 <Method void DropDownListView.setAdapter(ListAdapter)>
	//*  40   80:aload_0         
	//*  41   81:getfield        #266 <Field DropDownListView mDropDownList>
	//*  42   84:aload_0         
	//*  43   85:getfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//*  44   88:invokevirtual   #295 <Method void DropDownListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//*  45   91:aload_0         
	//*  46   92:getfield        #266 <Field DropDownListView mDropDownList>
	//*  47   95:iconst_1        
	//*  48   96:invokevirtual   #299 <Method void DropDownListView.setFocusable(boolean)>
	//*  49   99:aload_0         
	//*  50  100:getfield        #266 <Field DropDownListView mDropDownList>
	//*  51  103:iconst_1        
	//*  52  104:invokevirtual   #302 <Method void DropDownListView.setFocusableInTouchMode(boolean)>
	//*  53  107:aload_0         
	//*  54  108:getfield        #266 <Field DropDownListView mDropDownList>
	//*  55  111:new             #12  <Class ListPopupWindow$3>
	//*  56  114:dup             
	//*  57  115:aload_0         
	//*  58  116:invokespecial   #303 <Method void ListPopupWindow$3(ListPopupWindow)>
	//*  59  119:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//*  60  122:aload_0         
	//*  61  123:getfield        #266 <Field DropDownListView mDropDownList>
	//*  62  126:aload_0         
	//*  63  127:getfield        #202 <Field ListPopupWindow$PopupScrollListener mScrollListener>
	//*  64  130:invokevirtual   #311 <Method void DropDownListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//*  65  133:aload_0         
	//*  66  134:getfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//*  67  137:ifnull          151
	//*  68  140:aload_0         
	//*  69  141:getfield        #266 <Field DropDownListView mDropDownList>
	//*  70  144:aload_0         
	//*  71  145:getfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//*  72  148:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//*  73  151:aload_0         
	//*  74  152:getfield        #266 <Field DropDownListView mDropDownList>
	//*  75  155:astore          7
	//*  76  157:aload_0         
	//*  77  158:getfield        #315 <Field View mPromptView>
	//*  78  161:astore          8
	//*  79  163:aload           7
	//*  80  165:astore          6
	//*  81  167:aload           8
	//*  82  169:ifnull          312
	//*  83  172:new             #317 <Class LinearLayout>
	//*  84  175:dup             
	//*  85  176:aload           9
	//*  86  178:invokespecial   #319 <Method void LinearLayout(Context)>
	//*  87  181:astore          6
	//*  88  183:aload           6
	//*  89  185:iconst_1        
	//*  90  186:invokevirtual   #322 <Method void LinearLayout.setOrientation(int)>
	//*  91  189:new             #324 <Class android.widget.LinearLayout$LayoutParams>
	//*  92  192:dup             
	//*  93  193:iconst_m1       
	//*  94  194:iconst_0        
	//*  95  195:fconst_1        
	//*  96  196:invokespecial   #327 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//*  97  199:astore          9
	//*  98  201:aload_0         
	//*  99  202:getfield        #191 <Field int mPromptPosition>
	//* 100  205:tableswitch     0 1: default 228
	//	               0 459
	//	               1 440
	//* 101  228:ldc1            #46  <String "ListPopupWindow">
	//* 102  230:new             #329 <Class StringBuilder>
	//* 103  233:dup             
	//* 104  234:invokespecial   #330 <Method void StringBuilder()>
	//* 105  237:ldc2            #332 <String "Invalid hint position ">
	//* 106  240:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//* 107  243:aload_0         
	//* 108  244:getfield        #191 <Field int mPromptPosition>
	//* 109  247:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//* 110  250:invokevirtual   #343 <Method String StringBuilder.toString()>
	//* 111  253:invokestatic    #346 <Method int Log.e(String, String)>
	//* 112  256:pop             
	//* 113  257:aload_0         
	//* 114  258:getfield        #176 <Field int mDropDownWidth>
	//* 115  261:iflt            478
	//* 116  264:ldc2            #347 <Int 0x80000000>
	//* 117  267:istore_1        
	//* 118  268:aload_0         
	//* 119  269:getfield        #176 <Field int mDropDownWidth>
	//* 120  272:istore_2        
	//* 121  273:aload           8
	//* 122  275:iload_2         
	//* 123  276:iload_1         
	//* 124  277:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 125  280:iconst_0        
	//* 126  281:invokevirtual   #356 <Method void View.measure(int, int)>
	//* 127  284:aload           8
	//* 128  286:invokevirtual   #360 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 129  289:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//* 130  292:astore          7
	//* 131  294:aload           8
	//* 132  296:invokevirtual   #363 <Method int View.getMeasuredHeight()>
	//* 133  299:aload           7
	//* 134  301:getfield        #366 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//* 135  304:iadd            
	//* 136  305:aload           7
	//* 137  307:getfield        #369 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//* 138  310:iadd            
	//* 139  311:istore_1        
	//* 140  312:aload_0         
	//* 141  313:getfield        #258 <Field PopupWindow mPopup>
	//* 142  316:aload           6
	//* 143  318:invokevirtual   #373 <Method void PopupWindow.setContentView(View)>
	//* 144  321:aload_0         
	//* 145  322:getfield        #258 <Field PopupWindow mPopup>
	//* 146  325:invokevirtual   #377 <Method Drawable PopupWindow.getBackground()>
	//* 147  328:astore          6
	//* 148  330:aload           6
	//* 149  332:ifnull          541
	//* 150  335:aload           6
	//* 151  337:aload_0         
	//* 152  338:getfield        #208 <Field Rect mTempRect>
	//* 153  341:invokevirtual   #383 <Method boolean Drawable.getPadding(Rect)>
	//* 154  344:pop             
	//* 155  345:aload_0         
	//* 156  346:getfield        #208 <Field Rect mTempRect>
	//* 157  349:getfield        #386 <Field int Rect.top>
	//* 158  352:aload_0         
	//* 159  353:getfield        #208 <Field Rect mTempRect>
	//* 160  356:getfield        #389 <Field int Rect.bottom>
	//* 161  359:iadd            
	//* 162  360:istore_2        
	//* 163  361:iload_2         
	//* 164  362:istore_3        
	//* 165  363:aload_0         
	//* 166  364:getfield        #250 <Field boolean mDropDownVerticalOffsetSet>
	//* 167  367:ifne            384
	//* 168  370:aload_0         
	//* 169  371:aload_0         
	//* 170  372:getfield        #208 <Field Rect mTempRect>
	//* 171  375:getfield        #386 <Field int Rect.top>
	//* 172  378:ineg            
	//* 173  379:putfield        #248 <Field int mDropDownVerticalOffset>
	//* 174  382:iload_2         
	//* 175  383:istore_3        
	//* 176  384:aload_0         
	//* 177  385:getfield        #258 <Field PopupWindow mPopup>
	//* 178  388:invokevirtual   #392 <Method int PopupWindow.getInputMethodMode()>
	//* 179  391:iconst_2        
	//* 180  392:icmpne          553
	//* 181  395:iconst_1        
	//* 182  396:istore          5
	//* 183  398:aload_0         
	//* 184  399:aload_0         
	//* 185  400:invokevirtual   #396 <Method View getAnchorView()>
	//* 186  403:aload_0         
	//* 187  404:getfield        #248 <Field int mDropDownVerticalOffset>
	//* 188  407:iload           5
	//* 189  409:invokespecial   #399 <Method int getMaxAvailableHeight(View, int, boolean)>
	//* 190  412:istore          4
	//* 191  414:aload_0         
	//* 192  415:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 193  418:ifne            429
	//* 194  421:aload_0         
	//* 195  422:getfield        #174 <Field int mDropDownHeight>
	//* 196  425:iconst_m1       
	//* 197  426:icmpne          559
	//* 198  429:iload           4
	//* 199  431:iload_3         
	//* 200  432:iadd            
	//* 201  433:ireturn         
			flag = false;
	//  202  434:iconst_0        
	//  203  435:istore          5
		mDropDownList = createDropDownListView(((Context) (obj2)), flag);
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
		obj1 = ((Object) (mDropDownList));
		view = mPromptView;
		obj = obj1;
		if(view == null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (new LinearLayout(((Context) (obj2)))));
		((LinearLayout) (obj)).setOrientation(1);
		obj2 = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F)));
		mPromptPosition;
		JVM INSTR tableswitch 0 1: default 228
	//	               0 459
	//	               1 440;
		   goto _L3 _L4 _L5
_L3:
		Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(mPromptPosition).toString());
_L6:
		if(mDropDownWidth >= 0)
		{
			i = 0x80000000;
			j = mDropDownWidth;
		} else
	//* 204  437:goto            39
	//* 205  440:aload           6
	//* 206  442:aload           7
	//* 207  444:aload           9
	//* 208  446:invokevirtual   #403 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 209  449:aload           6
	//* 210  451:aload           8
	//* 211  453:invokevirtual   #405 <Method void LinearLayout.addView(View)>
	//* 212  456:goto            257
	//* 213  459:aload           6
	//* 214  461:aload           8
	//* 215  463:invokevirtual   #405 <Method void LinearLayout.addView(View)>
	//* 216  466:aload           6
	//* 217  468:aload           7
	//* 218  470:aload           9
	//* 219  472:invokevirtual   #403 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 220  475:goto            257
		{
			i = 0;
	//  221  478:iconst_0        
	//  222  479:istore_1        
			j = 0;
	//  223  480:iconst_0        
	//  224  481:istore_2        
		}
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, i), 0);
		obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()));
		i = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
_L2:
		mPopup.setContentView(((View) (obj)));
_L7:
		obj = ((Object) (mPopup.getBackground()));
		if(obj != null)
		{
			((Drawable) (obj)).getPadding(mTempRect);
			j = mTempRect.top + mTempRect.bottom;
			k = j;
			if(!mDropDownVerticalOffsetSet)
			{
				mDropDownVerticalOffset = -mTempRect.top;
				k = j;
			}
		} else
	//* 225  482:goto            273
	//* 226  485:aload_0         
	//* 227  486:getfield        #258 <Field PopupWindow mPopup>
	//* 228  489:invokevirtual   #408 <Method View PopupWindow.getContentView()>
	//* 229  492:checkcast       #410 <Class ViewGroup>
	//* 230  495:astore          6
	//* 231  497:aload_0         
	//* 232  498:getfield        #315 <Field View mPromptView>
	//* 233  501:astore          6
	//* 234  503:iload_2         
	//* 235  504:istore_1        
	//* 236  505:aload           6
	//* 237  507:ifnull          321
	//* 238  510:aload           6
	//* 239  512:invokevirtual   #360 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 240  515:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//* 241  518:astore          7
	//* 242  520:aload           6
	//* 243  522:invokevirtual   #363 <Method int View.getMeasuredHeight()>
	//* 244  525:aload           7
	//* 245  527:getfield        #366 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//* 246  530:iadd            
	//* 247  531:aload           7
	//* 248  533:getfield        #369 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//* 249  536:iadd            
	//* 250  537:istore_1        
	//* 251  538:goto            321
		{
			mTempRect.setEmpty();
	//  252  541:aload_0         
	//  253  542:getfield        #208 <Field Rect mTempRect>
	//  254  545:invokevirtual   #413 <Method void Rect.setEmpty()>
			k = 0;
	//  255  548:iconst_0        
	//  256  549:istore_3        
		}
		if(mPopup.getInputMethodMode() == 2)
			flag = true;
		else
	//* 257  550:goto            384
			flag = false;
	//  258  553:iconst_0        
	//  259  554:istore          5
		l = getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset, flag);
		if(mDropDownAlwaysVisible || mDropDownHeight == -1)
			return l + k;
		break MISSING_BLOCK_LABEL_559;
	//  260  556:goto            398
_L5:
		((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
		((LinearLayout) (obj)).addView(view);
		  goto _L6
_L4:
		((LinearLayout) (obj)).addView(view);
		((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
		  goto _L6
		obj = ((Object) ((ViewGroup)mPopup.getContentView()));
		obj = ((Object) (mPromptView));
		i = j;
		if(obj != null)
		{
			obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()));
			i = ((View) (obj)).getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
		}
		  goto _L7
		mDropDownWidth;
	//  261  559:aload_0         
	//  262  560:getfield        #176 <Field int mDropDownWidth>
		JVM INSTR tableswitch -2 -1: default 584
	//	               -2 644
	//	               -1 683;
	//  263  563:tableswitch     -2 -1: default 584
	//	               -2 644
	//	               -1 683
		   goto _L8 _L9 _L10
_L8:
		j = android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x40000000);
	//  264  584:aload_0         
	//  265  585:getfield        #176 <Field int mDropDownWidth>
	//  266  588:ldc2            #414 <Int 0x40000000>
	//  267  591:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  268  594:istore_2        
_L12:
		l = mDropDownList.measureHeightOfChildrenCompat(j, 0, -1, l - i, -1);
	//  269  595:aload_0         
	//  270  596:getfield        #266 <Field DropDownListView mDropDownList>
	//  271  599:iload_2         
	//  272  600:iconst_0        
	//  273  601:iconst_m1       
	//  274  602:iload           4
	//  275  604:iload_1         
	//  276  605:isub            
	//  277  606:iconst_m1       
	//  278  607:invokevirtual   #418 <Method int DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
	//  279  610:istore          4
		j = i;
	//  280  612:iload_1         
	//  281  613:istore_2        
		if(l > 0)
	//* 282  614:iload           4
	//* 283  616:ifle            639
			j = i + (k + (mDropDownList.getPaddingTop() + mDropDownList.getPaddingBottom()));
	//  284  619:iload_1         
	//  285  620:iload_3         
	//  286  621:aload_0         
	//  287  622:getfield        #266 <Field DropDownListView mDropDownList>
	//  288  625:invokevirtual   #421 <Method int DropDownListView.getPaddingTop()>
	//  289  628:aload_0         
	//  290  629:getfield        #266 <Field DropDownListView mDropDownList>
	//  291  632:invokevirtual   #424 <Method int DropDownListView.getPaddingBottom()>
	//  292  635:iadd            
	//  293  636:iadd            
	//  294  637:iadd            
	//  295  638:istore_2        
		return l + j;
	//  296  639:iload           4
	//  297  641:iload_2         
	//  298  642:iadd            
	//  299  643:ireturn         
_L9:
		j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
	//  300  644:aload_0         
	//  301  645:getfield        #210 <Field Context mContext>
	//  302  648:invokevirtual   #428 <Method Resources Context.getResources()>
	//  303  651:invokevirtual   #434 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  304  654:getfield        #439 <Field int DisplayMetrics.widthPixels>
	//  305  657:aload_0         
	//  306  658:getfield        #208 <Field Rect mTempRect>
	//  307  661:getfield        #442 <Field int Rect.left>
	//  308  664:aload_0         
	//  309  665:getfield        #208 <Field Rect mTempRect>
	//  310  668:getfield        #445 <Field int Rect.right>
	//  311  671:iadd            
	//  312  672:isub            
	//  313  673:ldc2            #347 <Int 0x80000000>
	//  314  676:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  315  679:istore_2        
		continue; /* Loop/switch isn't completed */
	//  316  680:goto            595
_L10:
		j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
	//  317  683:aload_0         
	//  318  684:getfield        #210 <Field Context mContext>
	//  319  687:invokevirtual   #428 <Method Resources Context.getResources()>
	//  320  690:invokevirtual   #434 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  321  693:getfield        #439 <Field int DisplayMetrics.widthPixels>
	//  322  696:aload_0         
	//  323  697:getfield        #208 <Field Rect mTempRect>
	//  324  700:getfield        #442 <Field int Rect.left>
	//  325  703:aload_0         
	//  326  704:getfield        #208 <Field Rect mTempRect>
	//  327  707:getfield        #445 <Field int Rect.right>
	//  328  710:iadd            
	//  329  711:isub            
	//  330  712:ldc2            #414 <Int 0x40000000>
	//  331  715:invokestatic    #352 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  332  718:istore_2        
		if(true) goto _L12; else goto _L11
	//  333  719:goto            595
_L11:
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
		int k;
		byte byte1;
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          7
		byte1 = -1;
	//    4    6:iconst_m1       
	//    5    7:istore          4
		k = buildDropDown();
	//    6    9:aload_0         
	//    7   10:invokespecial   #706 <Method int buildDropDown()>
	//    8   13:istore_2        
		flag2 = isInputMethodNotNeeded();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #708 <Method boolean isInputMethodNotNeeded()>
	//   11   18:istore          8
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
	//   20   38:ifeq            299
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
		int i;
		if(mDropDownWidth == -1)
	//*  26   52:aload_0         
	//*  27   53:getfield        #176 <Field int mDropDownWidth>
	//*  28   56:iconst_m1       
	//*  29   57:icmpne          197
			i = -1;
	//   30   60:iconst_m1       
	//   31   61:istore_1        
		else
	//*  32   62:aload_0         
	//*  33   63:getfield        #174 <Field int mDropDownHeight>
	//*  34   66:iconst_m1       
	//*  35   67:icmpne          273
	//*  36   70:iload           8
	//*  37   72:ifeq            225
	//*  38   75:iload           8
	//*  39   77:ifeq            235
	//*  40   80:aload_0         
	//*  41   81:getfield        #258 <Field PopupWindow mPopup>
	//*  42   84:astore          9
	//*  43   86:aload_0         
	//*  44   87:getfield        #176 <Field int mDropDownWidth>
	//*  45   90:iconst_m1       
	//*  46   91:icmpne          230
	//*  47   94:iconst_m1       
	//*  48   95:istore_3        
	//*  49   96:aload           9
	//*  50   98:iload_3         
	//*  51   99:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//*  52  102:aload_0         
	//*  53  103:getfield        #258 <Field PopupWindow mPopup>
	//*  54  106:iconst_0        
	//*  55  107:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//*  56  110:aload_0         
	//*  57  111:getfield        #258 <Field PopupWindow mPopup>
	//*  58  114:astore          9
	//*  59  116:iload           7
	//*  60  118:istore          6
	//*  61  120:aload_0         
	//*  62  121:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//*  63  124:ifne            141
	//*  64  127:iload           7
	//*  65  129:istore          6
	//*  66  131:aload_0         
	//*  67  132:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//*  68  135:ifne            141
	//*  69  138:iconst_1        
	//*  70  139:istore          6
	//*  71  141:aload           9
	//*  72  143:iload           6
	//*  73  145:invokevirtual   #725 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//*  74  148:aload_0         
	//*  75  149:getfield        #258 <Field PopupWindow mPopup>
	//*  76  152:astore          9
	//*  77  154:aload_0         
	//*  78  155:invokevirtual   #396 <Method View getAnchorView()>
	//*  79  158:astore          10
	//*  80  160:aload_0         
	//*  81  161:getfield        #243 <Field int mDropDownHorizontalOffset>
	//*  82  164:istore_3        
	//*  83  165:aload_0         
	//*  84  166:getfield        #248 <Field int mDropDownVerticalOffset>
	//*  85  169:istore          5
	//*  86  171:iload_1         
	//*  87  172:ifge            293
	//*  88  175:iconst_m1       
	//*  89  176:istore_1        
	//*  90  177:iload_2         
	//*  91  178:ifge            296
	//*  92  181:iload           4
	//*  93  183:istore_2        
	//*  94  184:aload           9
	//*  95  186:aload           10
	//*  96  188:iload_3         
	//*  97  189:iload           5
	//*  98  191:iload_1         
	//*  99  192:iload_2         
	//* 100  193:invokevirtual   #729 <Method void PopupWindow.update(View, int, int, int, int)>
	//* 101  196:return          
		if(mDropDownWidth == -2)
	//* 102  197:aload_0         
	//* 103  198:getfield        #176 <Field int mDropDownWidth>
	//* 104  201:bipush          -2
	//* 105  203:icmpne          217
			i = getAnchorView().getWidth();
	//  106  206:aload_0         
	//  107  207:invokevirtual   #396 <Method View getAnchorView()>
	//  108  210:invokevirtual   #731 <Method int View.getWidth()>
	//  109  213:istore_1        
		else
	//* 110  214:goto            62
			i = mDropDownWidth;
	//  111  217:aload_0         
	//  112  218:getfield        #176 <Field int mDropDownWidth>
	//  113  221:istore_1        
		if(mDropDownHeight != -1) goto _L6; else goto _L5
_L5:
		if(!flag2)
	//* 114  222:goto            62
			k = -1;
	//  115  225:iconst_m1       
	//  116  226:istore_2        
		if(flag2)
		{
			PopupWindow popupwindow = mPopup;
			int l;
			int i1;
			View view;
			if(mDropDownWidth == -1)
				l = -1;
			else
	//* 117  227:goto            75
				l = 0;
	//  118  230:iconst_0        
	//  119  231:istore_3        
			popupwindow.setWidth(l);
			mPopup.setHeight(0);
		} else
	//* 120  232:goto            96
		{
			PopupWindow popupwindow1 = mPopup;
	//  121  235:aload_0         
	//  122  236:getfield        #258 <Field PopupWindow mPopup>
	//  123  239:astore          9
			byte byte0;
			if(mDropDownWidth == -1)
	//* 124  241:aload_0         
	//* 125  242:getfield        #176 <Field int mDropDownWidth>
	//* 126  245:iconst_m1       
	//* 127  246:icmpne          268
				byte0 = -1;
	//  128  249:iconst_m1       
	//  129  250:istore_3        
			else
	//* 130  251:aload           9
	//* 131  253:iload_3         
	//* 132  254:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//* 133  257:aload_0         
	//* 134  258:getfield        #258 <Field PopupWindow mPopup>
	//* 135  261:iconst_m1       
	//* 136  262:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//* 137  265:goto            110
				byte0 = 0;
	//  138  268:iconst_0        
	//  139  269:istore_3        
			popupwindow1.setWidth(((int) (byte0)));
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
		if(i < 0)
			i = -1;
		if(k < 0)
			k = ((int) (byte1));
		popupwindow.update(view, l, i1, i, k);
		return;
	//* 140  270:goto            251
_L6:
		if(mDropDownHeight != -2)
	//* 141  273:aload_0         
	//* 142  274:getfield        #174 <Field int mDropDownHeight>
	//* 143  277:bipush          -2
	//* 144  279:icmpne          285
	//* 145  282:goto            110
			k = mDropDownHeight;
	//  146  285:aload_0         
	//  147  286:getfield        #174 <Field int mDropDownHeight>
	//  148  289:istore_2        
		if(true) goto _L7; else goto _L2
	//  149  290:goto            110
	//* 150  293:goto            177
	//* 151  296:goto            184
_L2:
		int j;
		PopupWindow popupwindow2;
		if(mDropDownWidth == -1)
	//* 152  299:aload_0         
	//* 153  300:getfield        #176 <Field int mDropDownWidth>
	//* 154  303:iconst_m1       
	//* 155  304:icmpne          496
			j = -1;
	//  156  307:iconst_m1       
	//  157  308:istore_1        
		else
	//* 158  309:aload_0         
	//* 159  310:getfield        #174 <Field int mDropDownHeight>
	//* 160  313:iconst_m1       
	//* 161  314:icmpne          524
	//* 162  317:iconst_m1       
	//* 163  318:istore_2        
	//* 164  319:aload_0         
	//* 165  320:getfield        #258 <Field PopupWindow mPopup>
	//* 166  323:iload_1         
	//* 167  324:invokevirtual   #720 <Method void PopupWindow.setWidth(int)>
	//* 168  327:aload_0         
	//* 169  328:getfield        #258 <Field PopupWindow mPopup>
	//* 170  331:iload_2         
	//* 171  332:invokevirtual   #722 <Method void PopupWindow.setHeight(int)>
	//* 172  335:aload_0         
	//* 173  336:iconst_1        
	//* 174  337:invokespecial   #733 <Method void setPopupClipToScreenEnabled(boolean)>
	//* 175  340:aload_0         
	//* 176  341:getfield        #258 <Field PopupWindow mPopup>
	//* 177  344:astore          9
	//* 178  346:aload_0         
	//* 179  347:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//* 180  350:ifne            544
	//* 181  353:aload_0         
	//* 182  354:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 183  357:ifne            544
	//* 184  360:aload           9
	//* 185  362:iload           6
	//* 186  364:invokevirtual   #725 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//* 187  367:aload_0         
	//* 188  368:getfield        #258 <Field PopupWindow mPopup>
	//* 189  371:aload_0         
	//* 190  372:getfield        #199 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
	//* 191  375:invokevirtual   #737 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
	//* 192  378:aload_0         
	//* 193  379:getfield        #685 <Field boolean mOverlapAnchorSet>
	//* 194  382:ifeq            396
	//* 195  385:aload_0         
	//* 196  386:getfield        #258 <Field PopupWindow mPopup>
	//* 197  389:aload_0         
	//* 198  390:getfield        #687 <Field boolean mOverlapAnchor>
	//* 199  393:invokestatic    #740 <Method void PopupWindowCompat.setOverlapAnchor(PopupWindow, boolean)>
	//* 200  396:getstatic       #138 <Field Method sSetEpicenterBoundsMethod>
	//* 201  399:ifnull          424
	//* 202  402:getstatic       #138 <Field Method sSetEpicenterBoundsMethod>
	//* 203  405:aload_0         
	//* 204  406:getfield        #258 <Field PopupWindow mPopup>
	//* 205  409:iconst_1        
	//* 206  410:anewarray       Object[]
	//* 207  413:dup             
	//* 208  414:iconst_0        
	//* 209  415:aload_0         
	//* 210  416:getfield        #664 <Field Rect mEpicenterBounds>
	//* 211  419:aastore         
	//* 212  420:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//* 213  423:pop             
	//* 214  424:aload_0         
	//* 215  425:getfield        #258 <Field PopupWindow mPopup>
	//* 216  428:aload_0         
	//* 217  429:invokevirtual   #396 <Method View getAnchorView()>
	//* 218  432:aload_0         
	//* 219  433:getfield        #243 <Field int mDropDownHorizontalOffset>
	//* 220  436:aload_0         
	//* 221  437:getfield        #248 <Field int mDropDownVerticalOffset>
	//* 222  440:aload_0         
	//* 223  441:getfield        #182 <Field int mDropDownGravity>
	//* 224  444:invokestatic    #744 <Method void PopupWindowCompat.showAsDropDown(PopupWindow, View, int, int, int)>
	//* 225  447:aload_0         
	//* 226  448:getfield        #266 <Field DropDownListView mDropDownList>
	//* 227  451:iconst_m1       
	//* 228  452:invokevirtual   #692 <Method void DropDownListView.setSelection(int)>
	//* 229  455:aload_0         
	//* 230  456:getfield        #271 <Field boolean mModal>
	//* 231  459:ifeq            472
	//* 232  462:aload_0         
	//* 233  463:getfield        #266 <Field DropDownListView mDropDownList>
	//* 234  466:invokevirtual   #747 <Method boolean DropDownListView.isInTouchMode()>
	//* 235  469:ifeq            476
	//* 236  472:aload_0         
	//* 237  473:invokevirtual   #566 <Method void clearListSelection()>
	//* 238  476:aload_0         
	//* 239  477:getfield        #271 <Field boolean mModal>
	//* 240  480:ifne            51
	//* 241  483:aload_0         
	//* 242  484:getfield        #223 <Field Handler mHandler>
	//* 243  487:aload_0         
	//* 244  488:getfield        #205 <Field ListPopupWindow$ListSelectorHider mHideSelector>
	//* 245  491:invokevirtual   #638 <Method boolean Handler.post(Runnable)>
	//* 246  494:pop             
	//* 247  495:return          
		if(mDropDownWidth == -2)
	//* 248  496:aload_0         
	//* 249  497:getfield        #176 <Field int mDropDownWidth>
	//* 250  500:bipush          -2
	//* 251  502:icmpne          516
			j = getAnchorView().getWidth();
	//  252  505:aload_0         
	//  253  506:invokevirtual   #396 <Method View getAnchorView()>
	//  254  509:invokevirtual   #731 <Method int View.getWidth()>
	//  255  512:istore_1        
		else
	//* 256  513:goto            309
			j = mDropDownWidth;
	//  257  516:aload_0         
	//  258  517:getfield        #176 <Field int mDropDownWidth>
	//  259  520:istore_1        
		if(mDropDownHeight == -1)
			k = -1;
		else
	//* 260  521:goto            309
		if(mDropDownHeight != -2)
	//* 261  524:aload_0         
	//* 262  525:getfield        #174 <Field int mDropDownHeight>
	//* 263  528:bipush          -2
	//* 264  530:icmpne          536
	//* 265  533:goto            319
			k = mDropDownHeight;
	//  266  536:aload_0         
	//  267  537:getfield        #174 <Field int mDropDownHeight>
	//  268  540:istore_2        
		mPopup.setWidth(j);
		mPopup.setHeight(k);
		setPopupClipToScreenEnabled(true);
		popupwindow2 = mPopup;
		if(mForceIgnoreOutsideTouch || mDropDownAlwaysVisible)
	//* 269  541:goto            319
			flag = false;
	//  270  544:iconst_0        
	//  271  545:istore          6
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
	//* 272  547:goto            360
			catch(Exception exception)
	//* 273  550:astore          9
			{
				Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", ((Throwable) (exception)));
	//  274  552:ldc1            #46  <String "ListPopupWindow">
	//  275  554:ldc2            #749 <String "Could not invoke setEpicenterBounds on PopupWindow">
	//  276  557:aload           9
	//  277  559:invokestatic    #752 <Method int Log.e(String, String, Throwable)>
	//  278  562:pop             
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
	//  279  563:goto            424
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
