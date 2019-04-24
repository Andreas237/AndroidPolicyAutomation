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
	class ListSelectorHider
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

	class PopupDataSetObserver extends DataSetObserver
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

	class PopupScrollListener
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

	class PopupTouchInterceptor
		implements android.view.View.OnTouchListener
	{

		public boolean onTouch(View view, MotionEvent motionevent)
		{
			int i = motionevent.getAction();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
		//    2    4:istore_3        
			int j = (int)motionevent.getX();
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method float MotionEvent.getX()>
		//    5    9:f2i             
		//    6   10:istore          4
			int k = (int)motionevent.getY();
		//    7   12:aload_2         
		//    8   13:invokevirtual   #34  <Method float MotionEvent.getY()>
		//    9   16:f2i             
		//   10   17:istore          5
			if(i == 0 && mPopup != null && mPopup.isShowing() && j >= 0 && j < mPopup.getWidth() && k >= 0 && k < mPopup.getHeight())
		//*  11   19:iload_3         
		//*  12   20:ifne            110
		//*  13   23:aload_0         
		//*  14   24:getfield        #15  <Field ListPopupWindow this$0>
		//*  15   27:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//*  16   30:ifnull          110
		//*  17   33:aload_0         
		//*  18   34:getfield        #15  <Field ListPopupWindow this$0>
		//*  19   37:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//*  20   40:invokevirtual   #44  <Method boolean PopupWindow.isShowing()>
		//*  21   43:ifeq            110
		//*  22   46:iload           4
		//*  23   48:iflt            110
		//*  24   51:iload           4
		//*  25   53:aload_0         
		//*  26   54:getfield        #15  <Field ListPopupWindow this$0>
		//*  27   57:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//*  28   60:invokevirtual   #47  <Method int PopupWindow.getWidth()>
		//*  29   63:icmpge          110
		//*  30   66:iload           5
		//*  31   68:iflt            110
		//*  32   71:iload           5
		//*  33   73:aload_0         
		//*  34   74:getfield        #15  <Field ListPopupWindow this$0>
		//*  35   77:getfield        #38  <Field PopupWindow ListPopupWindow.mPopup>
		//*  36   80:invokevirtual   #50  <Method int PopupWindow.getHeight()>
		//*  37   83:icmpge          110
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
			else
		//*  47  107:goto            132
			if(i == 1)
		//*  48  110:iload_3         
		//*  49  111:iconst_1        
		//*  50  112:icmpne          132
				mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
		//   51  115:aload_0         
		//   52  116:getfield        #15  <Field ListPopupWindow this$0>
		//   53  119:getfield        #54  <Field Handler ListPopupWindow.mHandler>
		//   54  122:aload_0         
		//   55  123:getfield        #15  <Field ListPopupWindow this$0>
		//   56  126:getfield        #58  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
		//   57  129:invokevirtual   #70  <Method void Handler.removeCallbacks(Runnable)>
			return false;
		//   58  132:iconst_0        
		//   59  133:ireturn         
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

	class ResizePopupRunnable
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
	//    3    3:getstatic       #157 <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
	//    4    6:invokespecial   #160 <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.listPopupWindowStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #157 <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
	//    4    6:invokespecial   #160 <Method void ListPopupWindow(Context, AttributeSet, int)>
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
	//    5    5:invokespecial   #167 <Method void ListPopupWindow(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method void Object()>
		mDropDownHeight = -2;
	//    2    4:aload_0         
	//    3    5:bipush          -2
	//    4    7:putfield        #172 <Field int mDropDownHeight>
		mDropDownWidth = -2;
	//    5   10:aload_0         
	//    6   11:bipush          -2
	//    7   13:putfield        #174 <Field int mDropDownWidth>
		mDropDownWindowLayoutType = 1002;
	//    8   16:aload_0         
	//    9   17:sipush          1002
	//   10   20:putfield        #176 <Field int mDropDownWindowLayoutType>
		mIsAnimatedFromAnchor = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #178 <Field boolean mIsAnimatedFromAnchor>
		mDropDownGravity = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #180 <Field int mDropDownGravity>
		mDropDownAlwaysVisible = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #182 <Field boolean mDropDownAlwaysVisible>
		mForceIgnoreOutsideTouch = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #184 <Field boolean mForceIgnoreOutsideTouch>
		mListItemExpandMaximum = 0x7fffffff;
	//   23   43:aload_0         
	//   24   44:ldc1            #185 <Int 0x7fffffff>
	//   25   46:putfield        #187 <Field int mListItemExpandMaximum>
		mPromptPosition = 0;
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:putfield        #189 <Field int mPromptPosition>
		mResizePopupRunnable = new ResizePopupRunnable();
	//   29   54:aload_0         
	//   30   55:new             #26  <Class ListPopupWindow$ResizePopupRunnable>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:invokespecial   #192 <Method void ListPopupWindow$ResizePopupRunnable(ListPopupWindow)>
	//   34   63:putfield        #194 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
		mTouchInterceptor = new PopupTouchInterceptor();
	//   35   66:aload_0         
	//   36   67:new             #23  <Class ListPopupWindow$PopupTouchInterceptor>
	//   37   70:dup             
	//   38   71:aload_0         
	//   39   72:invokespecial   #195 <Method void ListPopupWindow$PopupTouchInterceptor(ListPopupWindow)>
	//   40   75:putfield        #197 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
		mScrollListener = new PopupScrollListener();
	//   41   78:aload_0         
	//   42   79:new             #20  <Class ListPopupWindow$PopupScrollListener>
	//   43   82:dup             
	//   44   83:aload_0         
	//   45   84:invokespecial   #198 <Method void ListPopupWindow$PopupScrollListener(ListPopupWindow)>
	//   46   87:putfield        #200 <Field ListPopupWindow$PopupScrollListener mScrollListener>
		mHideSelector = new ListSelectorHider();
	//   47   90:aload_0         
	//   48   91:new             #14  <Class ListPopupWindow$ListSelectorHider>
	//   49   94:dup             
	//   50   95:aload_0         
	//   51   96:invokespecial   #201 <Method void ListPopupWindow$ListSelectorHider(ListPopupWindow)>
	//   52   99:putfield        #203 <Field ListPopupWindow$ListSelectorHider mHideSelector>
		mTempRect = new Rect();
	//   53  102:aload_0         
	//   54  103:new             #144 <Class Rect>
	//   55  106:dup             
	//   56  107:invokespecial   #204 <Method void Rect()>
	//   57  110:putfield        #206 <Field Rect mTempRect>
		mContext = context;
	//   58  113:aload_0         
	//   59  114:aload_1         
	//   60  115:putfield        #208 <Field Context mContext>
		mHandler = new Handler(context.getMainLooper());
	//   61  118:aload_0         
	//   62  119:new             #210 <Class Handler>
	//   63  122:dup             
	//   64  123:aload_1         
	//   65  124:invokevirtual   #216 <Method android.os.Looper Context.getMainLooper()>
	//   66  127:invokespecial   #219 <Method void Handler(android.os.Looper)>
	//   67  130:putfield        #221 <Field Handler mHandler>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ListPopupWindow, i, j);
	//   68  133:aload_1         
	//   69  134:aload_2         
	//   70  135:getstatic       #226 <Field int[] android.support.v7.appcompat.R$styleable.ListPopupWindow>
	//   71  138:iload_3         
	//   72  139:iload           4
	//   73  141:invokevirtual   #230 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   74  144:astore          5
		mDropDownHorizontalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
	//   75  146:aload_0         
	//   76  147:aload           5
	//   77  149:getstatic       #233 <Field int android.support.v7.appcompat.R$styleable.ListPopupWindow_android_dropDownHorizontalOffset>
	//   78  152:iconst_0        
	//   79  153:invokevirtual   #239 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   80  156:putfield        #241 <Field int mDropDownHorizontalOffset>
		mDropDownVerticalOffset = typedarray.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
	//   81  159:aload_0         
	//   82  160:aload           5
	//   83  162:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.ListPopupWindow_android_dropDownVerticalOffset>
	//   84  165:iconst_0        
	//   85  166:invokevirtual   #239 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   86  169:putfield        #246 <Field int mDropDownVerticalOffset>
		if(mDropDownVerticalOffset != 0)
	//*  87  172:aload_0         
	//*  88  173:getfield        #246 <Field int mDropDownVerticalOffset>
	//*  89  176:ifeq            184
			mDropDownVerticalOffsetSet = true;
	//   90  179:aload_0         
	//   91  180:iconst_1        
	//   92  181:putfield        #248 <Field boolean mDropDownVerticalOffsetSet>
		typedarray.recycle();
	//   93  184:aload           5
	//   94  186:invokevirtual   #251 <Method void TypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  95  189:getstatic       #256 <Field int android.os.Build$VERSION.SDK_INT>
	//*  96  192:bipush          11
	//*  97  194:icmplt          216
			mPopup = ((PopupWindow) (new AppCompatPopupWindow(context, attributeset, i, j)));
	//   98  197:aload_0         
	//   99  198:new             #258 <Class AppCompatPopupWindow>
	//  100  201:dup             
	//  101  202:aload_1         
	//  102  203:aload_2         
	//  103  204:iload_3         
	//  104  205:iload           4
	//  105  207:invokespecial   #259 <Method void AppCompatPopupWindow(Context, AttributeSet, int, int)>
	//  106  210:putfield        #261 <Field PopupWindow mPopup>
		else
	//* 107  213:goto            230
			mPopup = ((PopupWindow) (new AppCompatPopupWindow(context, attributeset, i)));
	//  108  216:aload_0         
	//  109  217:new             #258 <Class AppCompatPopupWindow>
	//  110  220:dup             
	//  111  221:aload_1         
	//  112  222:aload_2         
	//  113  223:iload_3         
	//  114  224:invokespecial   #262 <Method void AppCompatPopupWindow(Context, AttributeSet, int)>
	//  115  227:putfield        #261 <Field PopupWindow mPopup>
		mPopup.setInputMethodMode(1);
	//  116  230:aload_0         
	//  117  231:getfield        #261 <Field PopupWindow mPopup>
	//  118  234:iconst_1        
	//  119  235:invokevirtual   #266 <Method void PopupWindow.setInputMethodMode(int)>
	//  120  238:return          
	}

	private int buildDropDown()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		if(mDropDownList == null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #270 <Field DropDownListView mDropDownList>
	//*   6    8:ifnonnull       380
		{
			Object obj3 = ((Object) (mContext));
	//    7   11:aload_0         
	//    8   12:getfield        #208 <Field Context mContext>
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
	//   14   23:invokespecial   #271 <Method void ListPopupWindow$2(ListPopupWindow)>
	//   15   26:putfield        #273 <Field Runnable mShowDropDownRunnable>
			boolean flag;
			if(!mModal)
	//*  16   29:aload_0         
	//*  17   30:getfield        #275 <Field boolean mModal>
	//*  18   33:ifne            42
				flag = true;
	//   19   36:iconst_1        
	//   20   37:istore          5
			else
	//*  21   39:goto            45
				flag = false;
	//   22   42:iconst_0        
	//   23   43:istore          5
			mDropDownList = createDropDownListView(((Context) (obj3)), flag);
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:aload           9
	//   27   49:iload           5
	//   28   51:invokevirtual   #279 <Method DropDownListView createDropDownListView(Context, boolean)>
	//   29   54:putfield        #270 <Field DropDownListView mDropDownList>
			if(mDropDownListHighlight != null)
	//*  30   57:aload_0         
	//*  31   58:getfield        #281 <Field Drawable mDropDownListHighlight>
	//*  32   61:ifnull          75
				mDropDownList.setSelector(mDropDownListHighlight);
	//   33   64:aload_0         
	//   34   65:getfield        #270 <Field DropDownListView mDropDownList>
	//   35   68:aload_0         
	//   36   69:getfield        #281 <Field Drawable mDropDownListHighlight>
	//   37   72:invokevirtual   #287 <Method void DropDownListView.setSelector(Drawable)>
			mDropDownList.setAdapter(mAdapter);
	//   38   75:aload_0         
	//   39   76:getfield        #270 <Field DropDownListView mDropDownList>
	//   40   79:aload_0         
	//   41   80:getfield        #289 <Field ListAdapter mAdapter>
	//   42   83:invokevirtual   #293 <Method void DropDownListView.setAdapter(ListAdapter)>
			mDropDownList.setOnItemClickListener(mItemClickListener);
	//   43   86:aload_0         
	//   44   87:getfield        #270 <Field DropDownListView mDropDownList>
	//   45   90:aload_0         
	//   46   91:getfield        #295 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//   47   94:invokevirtual   #299 <Method void DropDownListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mDropDownList.setFocusable(true);
	//   48   97:aload_0         
	//   49   98:getfield        #270 <Field DropDownListView mDropDownList>
	//   50  101:iconst_1        
	//   51  102:invokevirtual   #303 <Method void DropDownListView.setFocusable(boolean)>
			mDropDownList.setFocusableInTouchMode(true);
	//   52  105:aload_0         
	//   53  106:getfield        #270 <Field DropDownListView mDropDownList>
	//   54  109:iconst_1        
	//   55  110:invokevirtual   #306 <Method void DropDownListView.setFocusableInTouchMode(boolean)>
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
	//   56  113:aload_0         
	//   57  114:getfield        #270 <Field DropDownListView mDropDownList>
	//   58  117:new             #12  <Class ListPopupWindow$3>
	//   59  120:dup             
	//   60  121:aload_0         
	//   61  122:invokespecial   #307 <Method void ListPopupWindow$3(ListPopupWindow)>
	//   62  125:invokevirtual   #311 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			mDropDownList.setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (mScrollListener)));
	//   63  128:aload_0         
	//   64  129:getfield        #270 <Field DropDownListView mDropDownList>
	//   65  132:aload_0         
	//   66  133:getfield        #200 <Field ListPopupWindow$PopupScrollListener mScrollListener>
	//   67  136:invokevirtual   #315 <Method void DropDownListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
			if(mItemSelectedListener != null)
	//*  68  139:aload_0         
	//*  69  140:getfield        #317 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//*  70  143:ifnull          157
				mDropDownList.setOnItemSelectedListener(mItemSelectedListener);
	//   71  146:aload_0         
	//   72  147:getfield        #270 <Field DropDownListView mDropDownList>
	//   73  150:aload_0         
	//   74  151:getfield        #317 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//   75  154:invokevirtual   #311 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			Object obj2 = ((Object) (mDropDownList));
	//   76  157:aload_0         
	//   77  158:getfield        #270 <Field DropDownListView mDropDownList>
	//   78  161:astore          7
			View view = mPromptView;
	//   79  163:aload_0         
	//   80  164:getfield        #319 <Field View mPromptView>
	//   81  167:astore          8
			Object obj = obj2;
	//   82  169:aload           7
	//   83  171:astore          6
			if(view != null)
	//*  84  173:aload           8
	//*  85  175:ifnull          368
			{
				obj = ((Object) (new LinearLayout(((Context) (obj3)))));
	//   86  178:new             #321 <Class LinearLayout>
	//   87  181:dup             
	//   88  182:aload           9
	//   89  184:invokespecial   #323 <Method void LinearLayout(Context)>
	//   90  187:astore          6
				((LinearLayout) (obj)).setOrientation(1);
	//   91  189:aload           6
	//   92  191:iconst_1        
	//   93  192:invokevirtual   #326 <Method void LinearLayout.setOrientation(int)>
				obj3 = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F)));
	//   94  195:new             #328 <Class android.widget.LinearLayout$LayoutParams>
	//   95  198:dup             
	//   96  199:iconst_m1       
	//   97  200:iconst_0        
	//   98  201:fconst_1        
	//   99  202:invokespecial   #331 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//  100  205:astore          9
				switch(mPromptPosition)
	//* 101  207:aload_0         
	//* 102  208:getfield        #189 <Field int mPromptPosition>
				{
	//* 103  211:lookupswitch    2: default 236
	//	               0: 258
	//	               1: 239
	//* 104  236:goto            277
				case 1: // '\001'
					((LinearLayout) (obj)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
	//  105  239:aload           6
	//  106  241:aload           7
	//  107  243:aload           9
	//  108  245:invokevirtual   #335 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					((LinearLayout) (obj)).addView(view);
	//  109  248:aload           6
	//  110  250:aload           8
	//  111  252:invokevirtual   #338 <Method void LinearLayout.addView(View)>
					break;

	//* 112  255:goto            306
				case 0: // '\0'
					((LinearLayout) (obj)).addView(view);
	//  113  258:aload           6
	//  114  260:aload           8
	//  115  262:invokevirtual   #338 <Method void LinearLayout.addView(View)>
					((LinearLayout) (obj)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
	//  116  265:aload           6
	//  117  267:aload           7
	//  118  269:aload           9
	//  119  271:invokevirtual   #335 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					break;

	//* 120  274:goto            306
				default:
					Log.e("ListPopupWindow", (new StringBuilder()).append("Invalid hint position ").append(mPromptPosition).toString());
	//  121  277:ldc1            #46  <String "ListPopupWindow">
	//  122  279:new             #340 <Class StringBuilder>
	//  123  282:dup             
	//  124  283:invokespecial   #341 <Method void StringBuilder()>
	//  125  286:ldc2            #343 <String "Invalid hint position ">
	//  126  289:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  127  292:aload_0         
	//  128  293:getfield        #189 <Field int mPromptPosition>
	//  129  296:invokevirtual   #350 <Method StringBuilder StringBuilder.append(int)>
	//  130  299:invokevirtual   #354 <Method String StringBuilder.toString()>
	//  131  302:invokestatic    #357 <Method int Log.e(String, String)>
	//  132  305:pop             
					break;
				}
				if(mDropDownWidth >= 0)
	//* 133  306:aload_0         
	//* 134  307:getfield        #174 <Field int mDropDownWidth>
	//* 135  310:iflt            325
				{
					j = 0x80000000;
	//  136  313:ldc2            #358 <Int 0x80000000>
	//  137  316:istore_2        
					i = mDropDownWidth;
	//  138  317:aload_0         
	//  139  318:getfield        #174 <Field int mDropDownWidth>
	//  140  321:istore_1        
				} else
	//* 141  322:goto            329
				{
					j = 0;
	//  142  325:iconst_0        
	//  143  326:istore_2        
					i = 0;
	//  144  327:iconst_0        
	//  145  328:istore_1        
				}
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, j), 0);
	//  146  329:aload           8
	//  147  331:iload_1         
	//  148  332:iload_2         
	//  149  333:invokestatic    #363 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  150  336:iconst_0        
	//  151  337:invokevirtual   #367 <Method void View.measure(int, int)>
				obj2 = ((Object) ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()));
	//  152  340:aload           8
	//  153  342:invokevirtual   #371 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  154  345:checkcast       #328 <Class android.widget.LinearLayout$LayoutParams>
	//  155  348:astore          7
				i = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj2)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj2)).bottomMargin;
	//  156  350:aload           8
	//  157  352:invokevirtual   #374 <Method int View.getMeasuredHeight()>
	//  158  355:aload           7
	//  159  357:getfield        #377 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  160  360:iadd            
	//  161  361:aload           7
	//  162  363:getfield        #380 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  163  366:iadd            
	//  164  367:istore_1        
			}
			mPopup.setContentView(((View) (obj)));
	//  165  368:aload_0         
	//  166  369:getfield        #261 <Field PopupWindow mPopup>
	//  167  372:aload           6
	//  168  374:invokevirtual   #383 <Method void PopupWindow.setContentView(View)>
		} else
	//* 169  377:goto            433
		{
			Object obj1 = ((Object) ((ViewGroup)mPopup.getContentView()));
	//  170  380:aload_0         
	//  171  381:getfield        #261 <Field PopupWindow mPopup>
	//  172  384:invokevirtual   #387 <Method View PopupWindow.getContentView()>
	//  173  387:checkcast       #389 <Class ViewGroup>
	//  174  390:astore          6
			obj1 = ((Object) (mPromptView));
	//  175  392:aload_0         
	//  176  393:getfield        #319 <Field View mPromptView>
	//  177  396:astore          6
			i = j;
	//  178  398:iload_2         
	//  179  399:istore_1        
			if(obj1 != null)
	//* 180  400:aload           6
	//* 181  402:ifnull          433
			{
				android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
	//  182  405:aload           6
	//  183  407:invokevirtual   #371 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  184  410:checkcast       #328 <Class android.widget.LinearLayout$LayoutParams>
	//  185  413:astore          7
				i = ((View) (obj1)).getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//  186  415:aload           6
	//  187  417:invokevirtual   #374 <Method int View.getMeasuredHeight()>
	//  188  420:aload           7
	//  189  422:getfield        #377 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  190  425:iadd            
	//  191  426:aload           7
	//  192  428:getfield        #380 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  193  431:iadd            
	//  194  432:istore_1        
			}
		}
		Drawable drawable = mPopup.getBackground();
	//  195  433:aload_0         
	//  196  434:getfield        #261 <Field PopupWindow mPopup>
	//  197  437:invokevirtual   #393 <Method Drawable PopupWindow.getBackground()>
	//  198  440:astore          6
		int k;
		if(drawable != null)
	//* 199  442:aload           6
	//* 200  444:ifnull          499
		{
			drawable.getPadding(mTempRect);
	//  201  447:aload           6
	//  202  449:aload_0         
	//  203  450:getfield        #206 <Field Rect mTempRect>
	//  204  453:invokevirtual   #399 <Method boolean Drawable.getPadding(Rect)>
	//  205  456:pop             
			j = mTempRect.top + mTempRect.bottom;
	//  206  457:aload_0         
	//  207  458:getfield        #206 <Field Rect mTempRect>
	//  208  461:getfield        #402 <Field int Rect.top>
	//  209  464:aload_0         
	//  210  465:getfield        #206 <Field Rect mTempRect>
	//  211  468:getfield        #405 <Field int Rect.bottom>
	//  212  471:iadd            
	//  213  472:istore_2        
			k = j;
	//  214  473:iload_2         
	//  215  474:istore_3        
			if(!mDropDownVerticalOffsetSet)
	//* 216  475:aload_0         
	//* 217  476:getfield        #248 <Field boolean mDropDownVerticalOffsetSet>
	//* 218  479:ifne            508
			{
				mDropDownVerticalOffset = -mTempRect.top;
	//  219  482:aload_0         
	//  220  483:aload_0         
	//  221  484:getfield        #206 <Field Rect mTempRect>
	//  222  487:getfield        #402 <Field int Rect.top>
	//  223  490:ineg            
	//  224  491:putfield        #246 <Field int mDropDownVerticalOffset>
				k = j;
	//  225  494:iload_2         
	//  226  495:istore_3        
			}
		} else
	//* 227  496:goto            508
		{
			mTempRect.setEmpty();
	//  228  499:aload_0         
	//  229  500:getfield        #206 <Field Rect mTempRect>
	//  230  503:invokevirtual   #408 <Method void Rect.setEmpty()>
			k = 0;
	//  231  506:iconst_0        
	//  232  507:istore_3        
		}
		boolean flag1;
		if(mPopup.getInputMethodMode() == 2)
	//* 233  508:aload_0         
	//* 234  509:getfield        #261 <Field PopupWindow mPopup>
	//* 235  512:invokevirtual   #411 <Method int PopupWindow.getInputMethodMode()>
	//* 236  515:iconst_2        
	//* 237  516:icmpne          525
			flag1 = true;
	//  238  519:iconst_1        
	//  239  520:istore          5
		else
	//* 240  522:goto            528
			flag1 = false;
	//  241  525:iconst_0        
	//  242  526:istore          5
		int l = getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset, flag1);
	//  243  528:aload_0         
	//  244  529:aload_0         
	//  245  530:invokevirtual   #414 <Method View getAnchorView()>
	//  246  533:aload_0         
	//  247  534:getfield        #246 <Field int mDropDownVerticalOffset>
	//  248  537:iload           5
	//  249  539:invokespecial   #417 <Method int getMaxAvailableHeight(View, int, boolean)>
	//  250  542:istore          4
		if(mDropDownAlwaysVisible || mDropDownHeight == -1)
	//* 251  544:aload_0         
	//* 252  545:getfield        #182 <Field boolean mDropDownAlwaysVisible>
	//* 253  548:ifne            559
	//* 254  551:aload_0         
	//* 255  552:getfield        #172 <Field int mDropDownHeight>
	//* 256  555:iconst_m1       
	//* 257  556:icmpne          564
			return l + k;
	//  258  559:iload           4
	//  259  561:iload_3         
	//  260  562:iadd            
	//  261  563:ireturn         
		switch(mDropDownWidth)
	//* 262  564:aload_0         
	//* 263  565:getfield        #174 <Field int mDropDownWidth>
		{
	//* 264  568:lookupswitch    2: default 596
	//	               -2: 599
	//	               -1: 638
	//* 265  596:goto            677
		case -2: 
			j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
	//  266  599:aload_0         
	//  267  600:getfield        #208 <Field Context mContext>
	//  268  603:invokevirtual   #421 <Method Resources Context.getResources()>
	//  269  606:invokevirtual   #427 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  270  609:getfield        #432 <Field int DisplayMetrics.widthPixels>
	//  271  612:aload_0         
	//  272  613:getfield        #206 <Field Rect mTempRect>
	//  273  616:getfield        #435 <Field int Rect.left>
	//  274  619:aload_0         
	//  275  620:getfield        #206 <Field Rect mTempRect>
	//  276  623:getfield        #438 <Field int Rect.right>
	//  277  626:iadd            
	//  278  627:isub            
	//  279  628:ldc2            #358 <Int 0x80000000>
	//  280  631:invokestatic    #363 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  281  634:istore_2        
			break;

	//* 282  635:goto            688
		case -1: 
			j = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
	//  283  638:aload_0         
	//  284  639:getfield        #208 <Field Context mContext>
	//  285  642:invokevirtual   #421 <Method Resources Context.getResources()>
	//  286  645:invokevirtual   #427 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  287  648:getfield        #432 <Field int DisplayMetrics.widthPixels>
	//  288  651:aload_0         
	//  289  652:getfield        #206 <Field Rect mTempRect>
	//  290  655:getfield        #435 <Field int Rect.left>
	//  291  658:aload_0         
	//  292  659:getfield        #206 <Field Rect mTempRect>
	//  293  662:getfield        #438 <Field int Rect.right>
	//  294  665:iadd            
	//  295  666:isub            
	//  296  667:ldc2            #439 <Int 0x40000000>
	//  297  670:invokestatic    #363 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  298  673:istore_2        
			break;

	//* 299  674:goto            688
		default:
			j = android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x40000000);
	//  300  677:aload_0         
	//  301  678:getfield        #174 <Field int mDropDownWidth>
	//  302  681:ldc2            #439 <Int 0x40000000>
	//  303  684:invokestatic    #363 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  304  687:istore_2        
			break;
		}
		l = mDropDownList.measureHeightOfChildrenCompat(j, 0, -1, l - i, -1);
	//  305  688:aload_0         
	//  306  689:getfield        #270 <Field DropDownListView mDropDownList>
	//  307  692:iload_2         
	//  308  693:iconst_0        
	//  309  694:iconst_m1       
	//  310  695:iload           4
	//  311  697:iload_1         
	//  312  698:isub            
	//  313  699:iconst_m1       
	//  314  700:invokevirtual   #443 <Method int DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
	//  315  703:istore          4
		j = i;
	//  316  705:iload_1         
	//  317  706:istore_2        
		if(l > 0)
	//* 318  707:iload           4
	//* 319  709:ifle            732
			j = i + (k + (mDropDownList.getPaddingTop() + mDropDownList.getPaddingBottom()));
	//  320  712:iload_1         
	//  321  713:iload_3         
	//  322  714:aload_0         
	//  323  715:getfield        #270 <Field DropDownListView mDropDownList>
	//  324  718:invokevirtual   #446 <Method int DropDownListView.getPaddingTop()>
	//  325  721:aload_0         
	//  326  722:getfield        #270 <Field DropDownListView mDropDownList>
	//  327  725:invokevirtual   #449 <Method int DropDownListView.getPaddingBottom()>
	//  328  728:iadd            
	//  329  729:iadd            
	//  330  730:iadd            
	//  331  731:istore_2        
		return l + j;
	//  332  732:iload           4
	//  333  734:iload_2         
	//  334  735:iadd            
	//  335  736:ireturn         
	}

	private int getMaxAvailableHeight(View view, int i, boolean flag)
	{
		if(sGetMaxAvailableHeightMethod == null)
			break MISSING_BLOCK_LABEL_60;
	//    0    0:getstatic       #138 <Field Method sGetMaxAvailableHeightMethod>
	//    1    3:ifnull          60
		int j = ((Integer)sGetMaxAvailableHeightMethod.invoke(((Object) (mPopup)), new Object[] {
			view, Integer.valueOf(i), Boolean.valueOf(flag)
		})).intValue();
	//    2    6:getstatic       #138 <Field Method sGetMaxAvailableHeightMethod>
	//    3    9:aload_0         
	//    4   10:getfield        #261 <Field PopupWindow mPopup>
	//    5   13:iconst_3        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_1         
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:iload_2         
	//   14   24:invokestatic    #455 <Method Integer Integer.valueOf(int)>
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_2        
	//   18   30:iload_3         
	//   19   31:invokestatic    #458 <Method Boolean Boolean.valueOf(boolean)>
	//   20   34:aastore         
	//   21   35:invokevirtual   #464 <Method Object Method.invoke(Object, Object[])>
	//   22   38:checkcast       #135 <Class Integer>
	//   23   41:invokevirtual   #467 <Method int Integer.intValue()>
	//   24   44:istore          4
		return j;
	//   25   46:iload           4
	//   26   48:ireturn         
		Exception exception;
		exception;
	//   27   49:astore          5
		Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
	//   28   51:ldc1            #46  <String "ListPopupWindow">
	//   29   53:ldc2            #469 <String "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.">
	//   30   56:invokestatic    #129 <Method int Log.i(String, String)>
	//   31   59:pop             
		return mPopup.getMaxAvailableHeight(view, i);
	//   32   60:aload_0         
	//   33   61:getfield        #261 <Field PopupWindow mPopup>
	//   34   64:aload_1         
	//   35   65:iload_2         
	//   36   66:invokevirtual   #472 <Method int PopupWindow.getMaxAvailableHeight(View, int)>
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
	//*   1    1:getfield        #319 <Field View mPromptView>
	//*   2    4:ifnull          33
		{
			android.view.ViewParent viewparent = mPromptView.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #319 <Field View mPromptView>
	//    5   11:invokevirtual   #479 <Method android.view.ViewParent View.getParent()>
	//    6   14:astore_1        
			if(viewparent instanceof ViewGroup)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #389 <Class ViewGroup>
	//*   9   19:ifeq            33
				((ViewGroup)viewparent).removeView(mPromptView);
	//   10   22:aload_1         
	//   11   23:checkcast       #389 <Class ViewGroup>
	//   12   26:aload_0         
	//   13   27:getfield        #319 <Field View mPromptView>
	//   14   30:invokevirtual   #482 <Method void ViewGroup.removeView(View)>
		}
	//   15   33:return          
	}

	private void setPopupClipToScreenEnabled(boolean flag)
	{
		if(sClipToWindowEnabledMethod != null)
	//*   0    0:getstatic       #121 <Field Method sClipToWindowEnabledMethod>
	//*   1    3:ifnull          39
			try
			{
				sClipToWindowEnabledMethod.invoke(((Object) (mPopup)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    2    6:getstatic       #121 <Field Method sClipToWindowEnabledMethod>
	//    3    9:aload_0         
	//    4   10:getfield        #261 <Field PopupWindow mPopup>
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iload_1         
	//   10   20:invokestatic    #458 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:aastore         
	//   12   24:invokevirtual   #464 <Method Object Method.invoke(Object, Object[])>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
			catch(Exception exception)
	//*  15   29:astore_2        
			{
				Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
	//   16   30:ldc1            #46  <String "ListPopupWindow">
	//   17   32:ldc2            #485 <String "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.">
	//   18   35:invokestatic    #129 <Method int Log.i(String, String)>
	//   19   38:pop             
			}
	//   20   39:return          
	}

	public void clearListSelection()
	{
		DropDownListView dropdownlistview = mDropDownList;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field DropDownListView mDropDownList>
	//    2    4:astore_1        
		if(dropdownlistview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			dropdownlistview.setListSelectionHidden(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #489 <Method void DropDownListView.setListSelectionHidden(boolean)>
			dropdownlistview.requestLayout();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #492 <Method void DropDownListView.requestLayout()>
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
	//    4    6:invokespecial   #497 <Method void ListPopupWindow$1(ListPopupWindow, View)>
	//    5    9:areturn         
	}

	DropDownListView createDropDownListView(Context context, boolean flag)
	{
		return new DropDownListView(context, flag);
	//    0    0:new             #283 <Class DropDownListView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #500 <Method void DropDownListView(Context, boolean)>
	//    5    9:areturn         
	}

	public void dismiss()
	{
		mPopup.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #504 <Method void PopupWindow.dismiss()>
		removePromptView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #506 <Method void removePromptView()>
		mPopup.setContentView(((View) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #261 <Field PopupWindow mPopup>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #383 <Method void PopupWindow.setContentView(View)>
		mDropDownList = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #270 <Field DropDownListView mDropDownList>
		mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
	//   12   24:aload_0         
	//   13   25:getfield        #221 <Field Handler mHandler>
	//   14   28:aload_0         
	//   15   29:getfield        #194 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
	//   16   32:invokevirtual   #510 <Method void Handler.removeCallbacks(Runnable)>
	//   17   35:return          
	}

	public View getAnchorView()
	{
		return mDropDownAnchorView;
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field View mDropDownAnchorView>
	//    2    4:areturn         
	}

	public int getAnimationStyle()
	{
		return mPopup.getAnimationStyle();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #515 <Method int PopupWindow.getAnimationStyle()>
	//    3    7:ireturn         
	}

	public Drawable getBackground()
	{
		return mPopup.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #393 <Method Drawable PopupWindow.getBackground()>
	//    3    7:areturn         
	}

	public int getHeight()
	{
		return mDropDownHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field int mDropDownHeight>
	//    2    4:ireturn         
	}

	public int getHorizontalOffset()
	{
		return mDropDownHorizontalOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field int mDropDownHorizontalOffset>
	//    2    4:ireturn         
	}

	public int getInputMethodMode()
	{
		return mPopup.getInputMethodMode();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #411 <Method int PopupWindow.getInputMethodMode()>
	//    3    7:ireturn         
	}

	public ListView getListView()
	{
		return ((ListView) (mDropDownList));
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field DropDownListView mDropDownList>
	//    2    4:areturn         
	}

	public int getPromptPosition()
	{
		return mPromptPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int mPromptPosition>
	//    2    4:ireturn         
	}

	public Object getSelectedItem()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mDropDownList.getSelectedItem();
	//    5    9:aload_0         
	//    6   10:getfield        #270 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #528 <Method Object DropDownListView.getSelectedItem()>
	//    8   16:areturn         
	}

	public long getSelectedItemId()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifne            11
			return 0x0L;
	//    3    7:ldc2w           #531 <Long 0x0L>
	//    4   10:lreturn         
		else
			return mDropDownList.getSelectedItemId();
	//    5   11:aload_0         
	//    6   12:getfield        #270 <Field DropDownListView mDropDownList>
	//    7   15:invokevirtual   #534 <Method long DropDownListView.getSelectedItemId()>
	//    8   18:lreturn         
	}

	public int getSelectedItemPosition()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return mDropDownList.getSelectedItemPosition();
	//    5    9:aload_0         
	//    6   10:getfield        #270 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #537 <Method int DropDownListView.getSelectedItemPosition()>
	//    8   16:ireturn         
	}

	public View getSelectedView()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mDropDownList.getSelectedView();
	//    5    9:aload_0         
	//    6   10:getfield        #270 <Field DropDownListView mDropDownList>
	//    7   13:invokevirtual   #540 <Method View DropDownListView.getSelectedView()>
	//    8   16:areturn         
	}

	public int getSoftInputMode()
	{
		return mPopup.getSoftInputMode();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #543 <Method int PopupWindow.getSoftInputMode()>
	//    3    7:ireturn         
	}

	public int getVerticalOffset()
	{
		if(!mDropDownVerticalOffsetSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #248 <Field boolean mDropDownVerticalOffsetSet>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mDropDownVerticalOffset;
	//    5    9:aload_0         
	//    6   10:getfield        #246 <Field int mDropDownVerticalOffset>
	//    7   13:ireturn         
	}

	public int getWidth()
	{
		return mDropDownWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field int mDropDownWidth>
	//    2    4:ireturn         
	}

	public boolean isDropDownAlwaysVisible()
	{
		return mDropDownAlwaysVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean mDropDownAlwaysVisible>
	//    2    4:ireturn         
	}

	public boolean isInputMethodNotNeeded()
	{
		return mPopup.getInputMethodMode() == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #411 <Method int PopupWindow.getInputMethodMode()>
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
	//    1    1:getfield        #275 <Field boolean mModal>
	//    2    4:ireturn         
	}

	public boolean isShowing()
	{
		return mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #553 <Method boolean PopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(isShowing() && i != 62 && (mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i)))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifeq            327
	//*   3    7:iload_1         
	//*   4    8:bipush          62
	//*   5   10:icmpeq          327
	//*   6   13:aload_0         
	//*   7   14:getfield        #270 <Field DropDownListView mDropDownList>
	//*   8   17:invokevirtual   #537 <Method int DropDownListView.getSelectedItemPosition()>
	//*   9   20:ifge            30
	//*  10   23:iload_1         
	//*  11   24:invokestatic    #557 <Method boolean isConfirmKey(int)>
	//*  12   27:ifne            327
		{
			int l = mDropDownList.getSelectedItemPosition();
	//   13   30:aload_0         
	//   14   31:getfield        #270 <Field DropDownListView mDropDownList>
	//   15   34:invokevirtual   #537 <Method int DropDownListView.getSelectedItemPosition()>
	//   16   37:istore          6
			boolean flag;
			if(!mPopup.isAboveAnchor())
	//*  17   39:aload_0         
	//*  18   40:getfield        #261 <Field PopupWindow mPopup>
	//*  19   43:invokevirtual   #560 <Method boolean PopupWindow.isAboveAnchor()>
	//*  20   46:ifne            55
				flag = true;
	//   21   49:iconst_1        
	//   22   50:istore          5
			else
	//*  23   52:goto            58
				flag = false;
	//   24   55:iconst_0        
	//   25   56:istore          5
			ListAdapter listadapter = mAdapter;
	//   26   58:aload_0         
	//   27   59:getfield        #289 <Field ListAdapter mAdapter>
	//   28   62:astore          8
			int j = 0x7fffffff;
	//   29   64:ldc1            #185 <Int 0x7fffffff>
	//   30   66:istore_3        
			int k = 0x80000000;
	//   31   67:ldc2            #358 <Int 0x80000000>
	//   32   70:istore          4
			if(listadapter != null)
	//*  33   72:aload           8
	//*  34   74:ifnull          144
			{
				boolean flag1 = listadapter.areAllItemsEnabled();
	//   35   77:aload           8
	//   36   79:invokeinterface #565 <Method boolean ListAdapter.areAllItemsEnabled()>
	//   37   84:istore          7
				if(flag1)
	//*  38   86:iload           7
	//*  39   88:ifeq            96
					j = 0;
	//   40   91:iconst_0        
	//   41   92:istore_3        
				else
	//*  42   93:goto            106
					j = mDropDownList.lookForSelectablePosition(0, true);
	//   43   96:aload_0         
	//   44   97:getfield        #270 <Field DropDownListView mDropDownList>
	//   45  100:iconst_0        
	//   46  101:iconst_1        
	//   47  102:invokevirtual   #569 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   48  105:istore_3        
				if(flag1)
	//*  49  106:iload           7
	//*  50  108:ifeq            125
					k = listadapter.getCount() - 1;
	//   51  111:aload           8
	//   52  113:invokeinterface #572 <Method int ListAdapter.getCount()>
	//   53  118:iconst_1        
	//   54  119:isub            
	//   55  120:istore          4
				else
	//*  56  122:goto            144
					k = mDropDownList.lookForSelectablePosition(listadapter.getCount() - 1, false);
	//   57  125:aload_0         
	//   58  126:getfield        #270 <Field DropDownListView mDropDownList>
	//   59  129:aload           8
	//   60  131:invokeinterface #572 <Method int ListAdapter.getCount()>
	//   61  136:iconst_1        
	//   62  137:isub            
	//   63  138:iconst_0        
	//   64  139:invokevirtual   #569 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   65  142:istore          4
			}
			if(flag && i == 19 && l <= j || !flag && i == 20 && l >= k)
	//*  66  144:iload           5
	//*  67  146:ifeq            161
	//*  68  149:iload_1         
	//*  69  150:bipush          19
	//*  70  152:icmpne          161
	//*  71  155:iload           6
	//*  72  157:iload_3         
	//*  73  158:icmple          179
	//*  74  161:iload           5
	//*  75  163:ifne            197
	//*  76  166:iload_1         
	//*  77  167:bipush          20
	//*  78  169:icmpne          197
	//*  79  172:iload           6
	//*  80  174:iload           4
	//*  81  176:icmplt          197
			{
				clearListSelection();
	//   82  179:aload_0         
	//   83  180:invokevirtual   #574 <Method void clearListSelection()>
				mPopup.setInputMethodMode(1);
	//   84  183:aload_0         
	//   85  184:getfield        #261 <Field PopupWindow mPopup>
	//   86  187:iconst_1        
	//   87  188:invokevirtual   #266 <Method void PopupWindow.setInputMethodMode(int)>
				show();
	//   88  191:aload_0         
	//   89  192:invokevirtual   #577 <Method void show()>
				return true;
	//   90  195:iconst_1        
	//   91  196:ireturn         
			}
			mDropDownList.setListSelectionHidden(false);
	//   92  197:aload_0         
	//   93  198:getfield        #270 <Field DropDownListView mDropDownList>
	//   94  201:iconst_0        
	//   95  202:invokevirtual   #489 <Method void DropDownListView.setListSelectionHidden(boolean)>
			if(mDropDownList.onKeyDown(i, keyevent))
	//*  96  205:aload_0         
	//*  97  206:getfield        #270 <Field DropDownListView mDropDownList>
	//*  98  209:iload_1         
	//*  99  210:aload_2         
	//* 100  211:invokevirtual   #579 <Method boolean DropDownListView.onKeyDown(int, KeyEvent)>
	//* 101  214:ifeq            288
			{
				mPopup.setInputMethodMode(2);
	//  102  217:aload_0         
	//  103  218:getfield        #261 <Field PopupWindow mPopup>
	//  104  221:iconst_2        
	//  105  222:invokevirtual   #266 <Method void PopupWindow.setInputMethodMode(int)>
				mDropDownList.requestFocusFromTouch();
	//  106  225:aload_0         
	//  107  226:getfield        #270 <Field DropDownListView mDropDownList>
	//  108  229:invokevirtual   #582 <Method boolean DropDownListView.requestFocusFromTouch()>
	//  109  232:pop             
				show();
	//  110  233:aload_0         
	//  111  234:invokevirtual   #577 <Method void show()>
				switch(i)
	//* 112  237:iload_1         
				{
	//* 113  238:lookupswitch    4: default 280
	//	               19: 283
	//	               20: 283
	//	               23: 283
	//	               66: 283
	//* 114  280:goto            285
				case 19: // '\023'
				case 20: // '\024'
				case 23: // '\027'
				case 66: // 'B'
					return true;
	//  115  283:iconst_1        
	//  116  284:ireturn         
				}
			} else
	//* 117  285:goto            327
			if(flag && i == 20)
	//* 118  288:iload           5
	//* 119  290:ifeq            308
	//* 120  293:iload_1         
	//* 121  294:bipush          20
	//* 122  296:icmpne          308
			{
				if(l == k)
	//* 123  299:iload           6
	//* 124  301:iload           4
	//* 125  303:icmpne          327
					return true;
	//  126  306:iconst_1        
	//  127  307:ireturn         
			} else
			if(!flag && i == 19 && l == j)
	//* 128  308:iload           5
	//* 129  310:ifne            327
	//* 130  313:iload_1         
	//* 131  314:bipush          19
	//* 132  316:icmpne          327
	//* 133  319:iload           6
	//* 134  321:iload_3         
	//* 135  322:icmpne          327
				return true;
	//  136  325:iconst_1        
	//  137  326:ireturn         
		}
		return false;
	//  138  327:iconst_0        
	//  139  328:ireturn         
	}

	public boolean onKeyPreIme(int i, KeyEvent keyevent)
	{
		if(i == 4 && isShowing())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          90
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #526 <Method boolean isShowing()>
	//*   5    9:ifeq            90
		{
			Object obj = ((Object) (mDropDownAnchorView));
	//    6   12:aload_0         
	//    7   13:getfield        #512 <Field View mDropDownAnchorView>
	//    8   16:astore_3        
			if(keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #588 <Method int KeyEvent.getAction()>
	//*  11   21:ifne            48
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #591 <Method int KeyEvent.getRepeatCount()>
	//*  14   28:ifne            48
			{
				obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   15   31:aload_3         
	//   16   32:invokevirtual   #595 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   17   35:astore_3        
				if(obj != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          46
					((android.view.KeyEvent.DispatcherState) (obj)).startTracking(keyevent, ((Object) (this)));
	//   20   40:aload_3         
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #601 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
				return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
			}
			if(keyevent.getAction() == 1)
	//*  26   48:aload_2         
	//*  27   49:invokevirtual   #588 <Method int KeyEvent.getAction()>
	//*  28   52:iconst_1        
	//*  29   53:icmpne          90
			{
				obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #595 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   32   60:astore_3        
				if(obj != null)
	//*  33   61:aload_3         
	//*  34   62:ifnull          70
					((android.view.KeyEvent.DispatcherState) (obj)).handleUpEvent(keyevent);
	//   35   65:aload_3         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #605 <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
				if(keyevent.isTracking() && !keyevent.isCanceled())
	//*  38   70:aload_2         
	//*  39   71:invokevirtual   #608 <Method boolean KeyEvent.isTracking()>
	//*  40   74:ifeq            90
	//*  41   77:aload_2         
	//*  42   78:invokevirtual   #611 <Method boolean KeyEvent.isCanceled()>
	//*  43   81:ifne            90
				{
					dismiss();
	//   44   84:aload_0         
	//   45   85:invokevirtual   #612 <Method void dismiss()>
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
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifeq            44
	//*   3    7:aload_0         
	//*   4    8:getfield        #270 <Field DropDownListView mDropDownList>
	//*   5   11:invokevirtual   #537 <Method int DropDownListView.getSelectedItemPosition()>
	//*   6   14:iflt            44
		{
			boolean flag = mDropDownList.onKeyUp(i, keyevent);
	//    7   17:aload_0         
	//    8   18:getfield        #270 <Field DropDownListView mDropDownList>
	//    9   21:iload_1         
	//   10   22:aload_2         
	//   11   23:invokevirtual   #615 <Method boolean DropDownListView.onKeyUp(int, KeyEvent)>
	//   12   26:istore_3        
			if(flag && isConfirmKey(i))
	//*  13   27:iload_3         
	//*  14   28:ifeq            42
	//*  15   31:iload_1         
	//*  16   32:invokestatic    #557 <Method boolean isConfirmKey(int)>
	//*  17   35:ifeq            42
				dismiss();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #612 <Method void dismiss()>
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
	//*   1    1:invokevirtual   #526 <Method boolean isShowing()>
	//*   2    4:ifeq            58
		{
			if(mItemClickListener != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #295 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//*   5   11:ifnull          56
			{
				DropDownListView dropdownlistview = mDropDownList;
	//    6   14:aload_0         
	//    7   15:getfield        #270 <Field DropDownListView mDropDownList>
	//    8   18:astore_2        
				View view = dropdownlistview.getChildAt(i - dropdownlistview.getFirstVisiblePosition());
	//    9   19:aload_2         
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #619 <Method int DropDownListView.getFirstVisiblePosition()>
	//   13   25:isub            
	//   14   26:invokevirtual   #623 <Method View DropDownListView.getChildAt(int)>
	//   15   29:astore_3        
				ListAdapter listadapter = dropdownlistview.getAdapter();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #627 <Method ListAdapter DropDownListView.getAdapter()>
	//   18   34:astore          4
				mItemClickListener.onItemClick(((AdapterView) (dropdownlistview)), view, i, listadapter.getItemId(i));
	//   19   36:aload_0         
	//   20   37:getfield        #295 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//   21   40:aload_2         
	//   22   41:aload_3         
	//   23   42:iload_1         
	//   24   43:aload           4
	//   25   45:iload_1         
	//   26   46:invokeinterface #631 <Method long ListAdapter.getItemId(int)>
	//   27   51:invokeinterface #637 <Method void android.widget.AdapterView$OnItemClickListener.onItemClick(AdapterView, View, int, long)>
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
	//    1    1:getfield        #221 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #273 <Field Runnable mShowDropDownRunnable>
	//    4    8:invokevirtual   #642 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setAdapter(ListAdapter listadapter)
	{
		if(mObserver == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #644 <Field DataSetObserver mObserver>
	//*   2    4:ifnonnull       22
			mObserver = ((DataSetObserver) (new PopupDataSetObserver()));
	//    3    7:aload_0         
	//    4    8:new             #17  <Class ListPopupWindow$PopupDataSetObserver>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #645 <Method void ListPopupWindow$PopupDataSetObserver(ListPopupWindow)>
	//    8   16:putfield        #644 <Field DataSetObserver mObserver>
		else
	//*   9   19:goto            42
		if(mAdapter != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #289 <Field ListAdapter mAdapter>
	//*  12   26:ifnull          42
			mAdapter.unregisterDataSetObserver(mObserver);
	//   13   29:aload_0         
	//   14   30:getfield        #289 <Field ListAdapter mAdapter>
	//   15   33:aload_0         
	//   16   34:getfield        #644 <Field DataSetObserver mObserver>
	//   17   37:invokeinterface #649 <Method void ListAdapter.unregisterDataSetObserver(DataSetObserver)>
		mAdapter = listadapter;
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:putfield        #289 <Field ListAdapter mAdapter>
		if(mAdapter != null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #289 <Field ListAdapter mAdapter>
	//*  23   51:ifnull          64
			listadapter.registerDataSetObserver(mObserver);
	//   24   54:aload_1         
	//   25   55:aload_0         
	//   26   56:getfield        #644 <Field DataSetObserver mObserver>
	//   27   59:invokeinterface #652 <Method void ListAdapter.registerDataSetObserver(DataSetObserver)>
		if(mDropDownList != null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #270 <Field DropDownListView mDropDownList>
	//*  30   68:ifnull          82
			mDropDownList.setAdapter(mAdapter);
	//   31   71:aload_0         
	//   32   72:getfield        #270 <Field DropDownListView mDropDownList>
	//   33   75:aload_0         
	//   34   76:getfield        #289 <Field ListAdapter mAdapter>
	//   35   79:invokevirtual   #293 <Method void DropDownListView.setAdapter(ListAdapter)>
	//   36   82:return          
	}

	public void setAnchorView(View view)
	{
		mDropDownAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #512 <Field View mDropDownAnchorView>
	//    3    5:return          
	}

	public void setAnimationStyle(int i)
	{
		mPopup.setAnimationStyle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #656 <Method void PopupWindow.setAnimationStyle(int)>
	//    4    8:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mPopup.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #659 <Method void PopupWindow.setBackgroundDrawable(Drawable)>
	//    4    8:return          
	}

	public void setContentWidth(int i)
	{
		Drawable drawable = mPopup.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:invokevirtual   #393 <Method Drawable PopupWindow.getBackground()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          43
		{
			drawable.getPadding(mTempRect);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #206 <Field Rect mTempRect>
	//    9   17:invokevirtual   #399 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			mDropDownWidth = mTempRect.left + mTempRect.right + i;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #206 <Field Rect mTempRect>
	//   14   26:getfield        #435 <Field int Rect.left>
	//   15   29:aload_0         
	//   16   30:getfield        #206 <Field Rect mTempRect>
	//   17   33:getfield        #438 <Field int Rect.right>
	//   18   36:iadd            
	//   19   37:iload_1         
	//   20   38:iadd            
	//   21   39:putfield        #174 <Field int mDropDownWidth>
			return;
	//   22   42:return          
		} else
		{
			setWidth(i);
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:invokevirtual   #663 <Method void setWidth(int)>
			return;
	//   26   48:return          
		}
	}

	public void setDropDownAlwaysVisible(boolean flag)
	{
		mDropDownAlwaysVisible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #182 <Field boolean mDropDownAlwaysVisible>
	//    3    5:return          
	}

	public void setDropDownGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #180 <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setEpicenterBounds(Rect rect)
	{
		mEpicenterBounds = rect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #668 <Field Rect mEpicenterBounds>
	//    3    5:return          
	}

	public void setForceIgnoreOutsideTouch(boolean flag)
	{
		mForceIgnoreOutsideTouch = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #184 <Field boolean mForceIgnoreOutsideTouch>
	//    3    5:return          
	}

	public void setHeight(int i)
	{
		mDropDownHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field int mDropDownHeight>
	//    3    5:return          
	}

	public void setHorizontalOffset(int i)
	{
		mDropDownHorizontalOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #241 <Field int mDropDownHorizontalOffset>
	//    3    5:return          
	}

	public void setInputMethodMode(int i)
	{
		mPopup.setInputMethodMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #266 <Method void PopupWindow.setInputMethodMode(int)>
	//    4    8:return          
	}

	void setListItemExpandMax(int i)
	{
		mListItemExpandMaximum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field int mListItemExpandMaximum>
	//    3    5:return          
	}

	public void setListSelector(Drawable drawable)
	{
		mDropDownListHighlight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #281 <Field Drawable mDropDownListHighlight>
	//    3    5:return          
	}

	public void setModal(boolean flag)
	{
		mModal = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #275 <Field boolean mModal>
		mPopup.setFocusable(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #261 <Field PopupWindow mPopup>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #675 <Method void PopupWindow.setFocusable(boolean)>
	//    7   13:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mPopup.setOnDismissListener(ondismisslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #679 <Method void PopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//    4    8:return          
	}

	public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
	{
		mItemClickListener = onitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #295 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//    3    5:return          
	}

	public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
	{
		mItemSelectedListener = onitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #317 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//    3    5:return          
	}

	public void setPromptPosition(int i)
	{
		mPromptPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int mPromptPosition>
	//    3    5:return          
	}

	public void setPromptView(View view)
	{
		boolean flag = isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #526 <Method boolean isShowing()>
	//    2    4:istore_2        
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            13
			removePromptView();
	//    5    9:aload_0         
	//    6   10:invokespecial   #506 <Method void removePromptView()>
		mPromptView = view;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #319 <Field View mPromptView>
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            26
			show();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #577 <Method void show()>
	//   14   26:return          
	}

	public void setSelection(int i)
	{
		DropDownListView dropdownlistview = mDropDownList;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field DropDownListView mDropDownList>
	//    2    4:astore_2        
		if(isShowing() && dropdownlistview != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #526 <Method boolean isShowing()>
	//*   5    9:ifeq            47
	//*   6   12:aload_2         
	//*   7   13:ifnull          47
		{
			dropdownlistview.setListSelectionHidden(false);
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #489 <Method void DropDownListView.setListSelectionHidden(boolean)>
			dropdownlistview.setSelection(i);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #684 <Method void DropDownListView.setSelection(int)>
			if(android.os.Build.VERSION.SDK_INT >= 11 && dropdownlistview.getChoiceMode() != 0)
	//*  14   26:getstatic       #256 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   29:bipush          11
	//*  16   31:icmplt          47
	//*  17   34:aload_2         
	//*  18   35:invokevirtual   #687 <Method int DropDownListView.getChoiceMode()>
	//*  19   38:ifeq            47
				dropdownlistview.setItemChecked(i, true);
	//   20   41:aload_2         
	//   21   42:iload_1         
	//   22   43:iconst_1        
	//   23   44:invokevirtual   #691 <Method void DropDownListView.setItemChecked(int, boolean)>
		}
	//   24   47:return          
	}

	public void setSoftInputMode(int i)
	{
		mPopup.setSoftInputMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field PopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #694 <Method void PopupWindow.setSoftInputMode(int)>
	//    4    8:return          
	}

	public void setVerticalOffset(int i)
	{
		mDropDownVerticalOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #246 <Field int mDropDownVerticalOffset>
		mDropDownVerticalOffsetSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #248 <Field boolean mDropDownVerticalOffsetSet>
	//    6   10:return          
	}

	public void setWidth(int i)
	{
		mDropDownWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #174 <Field int mDropDownWidth>
	//    3    5:return          
	}

	public void setWindowLayoutType(int i)
	{
		mDropDownWindowLayoutType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #176 <Field int mDropDownWindowLayoutType>
	//    3    5:return          
	}

	public void show()
	{
		int k = buildDropDown();
	//    0    0:aload_0         
	//    1    1:invokespecial   #698 <Method int buildDropDown()>
	//    2    4:istore_2        
		boolean flag = isInputMethodNotNeeded();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #700 <Method boolean isInputMethodNotNeeded()>
	//    5    9:istore          5
		PopupWindowCompat.setWindowLayoutType(mPopup, mDropDownWindowLayoutType);
	//    6   11:aload_0         
	//    7   12:getfield        #261 <Field PopupWindow mPopup>
	//    8   15:aload_0         
	//    9   16:getfield        #176 <Field int mDropDownWindowLayoutType>
	//   10   19:invokestatic    #705 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
		if(mPopup.isShowing())
	//*  11   22:aload_0         
	//*  12   23:getfield        #261 <Field PopupWindow mPopup>
	//*  13   26:invokevirtual   #553 <Method boolean PopupWindow.isShowing()>
	//*  14   29:ifeq            276
		{
			int i;
			if(mDropDownWidth == -1)
	//*  15   32:aload_0         
	//*  16   33:getfield        #174 <Field int mDropDownWidth>
	//*  17   36:iconst_m1       
	//*  18   37:icmpne          45
				i = -1;
	//   19   40:iconst_m1       
	//   20   41:istore_1        
			else
	//*  21   42:goto            70
			if(mDropDownWidth == -2)
	//*  22   45:aload_0         
	//*  23   46:getfield        #174 <Field int mDropDownWidth>
	//*  24   49:bipush          -2
	//*  25   51:icmpne          65
				i = getAnchorView().getWidth();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #414 <Method View getAnchorView()>
	//   28   58:invokevirtual   #707 <Method int View.getWidth()>
	//   29   61:istore_1        
			else
	//*  30   62:goto            70
				i = mDropDownWidth;
	//   31   65:aload_0         
	//   32   66:getfield        #174 <Field int mDropDownWidth>
	//   33   69:istore_1        
			if(mDropDownHeight == -1)
	//*  34   70:aload_0         
	//*  35   71:getfield        #172 <Field int mDropDownHeight>
	//*  36   74:iconst_m1       
	//*  37   75:icmpne          169
			{
				if(!flag)
	//*  38   78:iload           5
	//*  39   80:ifeq            86
	//*  40   83:goto            88
					k = -1;
	//   41   86:iconst_m1       
	//   42   87:istore_2        
				if(flag)
	//*  43   88:iload           5
	//*  44   90:ifeq            131
				{
					PopupWindow popupwindow = mPopup;
	//   45   93:aload_0         
	//   46   94:getfield        #261 <Field PopupWindow mPopup>
	//   47   97:astore          6
					byte byte0;
					if(mDropDownWidth == -1)
	//*  48   99:aload_0         
	//*  49  100:getfield        #174 <Field int mDropDownWidth>
	//*  50  103:iconst_m1       
	//*  51  104:icmpne          112
						byte0 = -1;
	//   52  107:iconst_m1       
	//   53  108:istore_3        
					else
	//*  54  109:goto            114
						byte0 = 0;
	//   55  112:iconst_0        
	//   56  113:istore_3        
					popupwindow.setWidth(((int) (byte0)));
	//   57  114:aload           6
	//   58  116:iload_3         
	//   59  117:invokevirtual   #708 <Method void PopupWindow.setWidth(int)>
					mPopup.setHeight(0);
	//   60  120:aload_0         
	//   61  121:getfield        #261 <Field PopupWindow mPopup>
	//   62  124:iconst_0        
	//   63  125:invokevirtual   #710 <Method void PopupWindow.setHeight(int)>
				} else
	//*  64  128:goto            186
				{
					PopupWindow popupwindow1 = mPopup;
	//   65  131:aload_0         
	//   66  132:getfield        #261 <Field PopupWindow mPopup>
	//   67  135:astore          6
					byte byte1;
					if(mDropDownWidth == -1)
	//*  68  137:aload_0         
	//*  69  138:getfield        #174 <Field int mDropDownWidth>
	//*  70  141:iconst_m1       
	//*  71  142:icmpne          150
						byte1 = -1;
	//   72  145:iconst_m1       
	//   73  146:istore_3        
					else
	//*  74  147:goto            152
						byte1 = 0;
	//   75  150:iconst_0        
	//   76  151:istore_3        
					popupwindow1.setWidth(((int) (byte1)));
	//   77  152:aload           6
	//   78  154:iload_3         
	//   79  155:invokevirtual   #708 <Method void PopupWindow.setWidth(int)>
					mPopup.setHeight(-1);
	//   80  158:aload_0         
	//   81  159:getfield        #261 <Field PopupWindow mPopup>
	//   82  162:iconst_m1       
	//   83  163:invokevirtual   #710 <Method void PopupWindow.setHeight(int)>
				}
			} else
	//*  84  166:goto            186
			if(mDropDownHeight != -2)
	//*  85  169:aload_0         
	//*  86  170:getfield        #172 <Field int mDropDownHeight>
	//*  87  173:bipush          -2
	//*  88  175:icmpne          181
	//*  89  178:goto            186
				k = mDropDownHeight;
	//   90  181:aload_0         
	//   91  182:getfield        #172 <Field int mDropDownHeight>
	//   92  185:istore_2        
			PopupWindow popupwindow2 = mPopup;
	//   93  186:aload_0         
	//   94  187:getfield        #261 <Field PopupWindow mPopup>
	//   95  190:astore          6
			if(!mForceIgnoreOutsideTouch && !mDropDownAlwaysVisible)
	//*  96  192:aload_0         
	//*  97  193:getfield        #184 <Field boolean mForceIgnoreOutsideTouch>
	//*  98  196:ifne            212
	//*  99  199:aload_0         
	//* 100  200:getfield        #182 <Field boolean mDropDownAlwaysVisible>
	//* 101  203:ifne            212
				flag = true;
	//  102  206:iconst_1        
	//  103  207:istore          5
			else
	//* 104  209:goto            215
				flag = false;
	//  105  212:iconst_0        
	//  106  213:istore          5
			popupwindow2.setOutsideTouchable(flag);
	//  107  215:aload           6
	//  108  217:iload           5
	//  109  219:invokevirtual   #713 <Method void PopupWindow.setOutsideTouchable(boolean)>
			popupwindow2 = mPopup;
	//  110  222:aload_0         
	//  111  223:getfield        #261 <Field PopupWindow mPopup>
	//  112  226:astore          6
			View view = getAnchorView();
	//  113  228:aload_0         
	//  114  229:invokevirtual   #414 <Method View getAnchorView()>
	//  115  232:astore          7
			int l = mDropDownHorizontalOffset;
	//  116  234:aload_0         
	//  117  235:getfield        #241 <Field int mDropDownHorizontalOffset>
	//  118  238:istore_3        
			int i1 = mDropDownVerticalOffset;
	//  119  239:aload_0         
	//  120  240:getfield        #246 <Field int mDropDownVerticalOffset>
	//  121  243:istore          4
			if(i < 0)
	//* 122  245:iload_1         
	//* 123  246:ifge            254
				i = -1;
	//  124  249:iconst_m1       
	//  125  250:istore_1        
	//* 126  251:goto            254
			if(k < 0)
	//* 127  254:iload_2         
	//* 128  255:ifge            263
				k = -1;
	//  129  258:iconst_m1       
	//  130  259:istore_2        
	//* 131  260:goto            263
			popupwindow2.update(view, l, i1, i, k);
	//  132  263:aload           6
	//  133  265:aload           7
	//  134  267:iload_3         
	//  135  268:iload           4
	//  136  270:iload_1         
	//  137  271:iload_2         
	//  138  272:invokevirtual   #717 <Method void PopupWindow.update(View, int, int, int, int)>
			return;
	//  139  275:return          
		}
		int j;
		if(mDropDownWidth == -1)
	//* 140  276:aload_0         
	//* 141  277:getfield        #174 <Field int mDropDownWidth>
	//* 142  280:iconst_m1       
	//* 143  281:icmpne          289
			j = -1;
	//  144  284:iconst_m1       
	//  145  285:istore_1        
		else
	//* 146  286:goto            314
		if(mDropDownWidth == -2)
	//* 147  289:aload_0         
	//* 148  290:getfield        #174 <Field int mDropDownWidth>
	//* 149  293:bipush          -2
	//* 150  295:icmpne          309
			j = getAnchorView().getWidth();
	//  151  298:aload_0         
	//  152  299:invokevirtual   #414 <Method View getAnchorView()>
	//  153  302:invokevirtual   #707 <Method int View.getWidth()>
	//  154  305:istore_1        
		else
	//* 155  306:goto            314
			j = mDropDownWidth;
	//  156  309:aload_0         
	//  157  310:getfield        #174 <Field int mDropDownWidth>
	//  158  313:istore_1        
		if(mDropDownHeight == -1)
	//* 159  314:aload_0         
	//* 160  315:getfield        #172 <Field int mDropDownHeight>
	//* 161  318:iconst_m1       
	//* 162  319:icmpne          327
			k = -1;
	//  163  322:iconst_m1       
	//  164  323:istore_2        
		else
	//* 165  324:goto            344
		if(mDropDownHeight != -2)
	//* 166  327:aload_0         
	//* 167  328:getfield        #172 <Field int mDropDownHeight>
	//* 168  331:bipush          -2
	//* 169  333:icmpne          339
	//* 170  336:goto            344
			k = mDropDownHeight;
	//  171  339:aload_0         
	//  172  340:getfield        #172 <Field int mDropDownHeight>
	//  173  343:istore_2        
		mPopup.setWidth(j);
	//  174  344:aload_0         
	//  175  345:getfield        #261 <Field PopupWindow mPopup>
	//  176  348:iload_1         
	//  177  349:invokevirtual   #708 <Method void PopupWindow.setWidth(int)>
		mPopup.setHeight(k);
	//  178  352:aload_0         
	//  179  353:getfield        #261 <Field PopupWindow mPopup>
	//  180  356:iload_2         
	//  181  357:invokevirtual   #710 <Method void PopupWindow.setHeight(int)>
		setPopupClipToScreenEnabled(true);
	//  182  360:aload_0         
	//  183  361:iconst_1        
	//  184  362:invokespecial   #719 <Method void setPopupClipToScreenEnabled(boolean)>
		PopupWindow popupwindow3 = mPopup;
	//  185  365:aload_0         
	//  186  366:getfield        #261 <Field PopupWindow mPopup>
	//  187  369:astore          6
		if(!mForceIgnoreOutsideTouch && !mDropDownAlwaysVisible)
	//* 188  371:aload_0         
	//* 189  372:getfield        #184 <Field boolean mForceIgnoreOutsideTouch>
	//* 190  375:ifne            391
	//* 191  378:aload_0         
	//* 192  379:getfield        #182 <Field boolean mDropDownAlwaysVisible>
	//* 193  382:ifne            391
			flag = true;
	//  194  385:iconst_1        
	//  195  386:istore          5
		else
	//* 196  388:goto            394
			flag = false;
	//  197  391:iconst_0        
	//  198  392:istore          5
		popupwindow3.setOutsideTouchable(flag);
	//  199  394:aload           6
	//  200  396:iload           5
	//  201  398:invokevirtual   #713 <Method void PopupWindow.setOutsideTouchable(boolean)>
		mPopup.setTouchInterceptor(((android.view.View.OnTouchListener) (mTouchInterceptor)));
	//  202  401:aload_0         
	//  203  402:getfield        #261 <Field PopupWindow mPopup>
	//  204  405:aload_0         
	//  205  406:getfield        #197 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
	//  206  409:invokevirtual   #723 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
		if(sSetEpicenterBoundsMethod != null)
	//* 207  412:getstatic       #146 <Field Method sSetEpicenterBoundsMethod>
	//* 208  415:ifnull          456
			try
			{
				sSetEpicenterBoundsMethod.invoke(((Object) (mPopup)), new Object[] {
					mEpicenterBounds
				});
	//  209  418:getstatic       #146 <Field Method sSetEpicenterBoundsMethod>
	//  210  421:aload_0         
	//  211  422:getfield        #261 <Field PopupWindow mPopup>
	//  212  425:iconst_1        
	//  213  426:anewarray       Object[]
	//  214  429:dup             
	//  215  430:iconst_0        
	//  216  431:aload_0         
	//  217  432:getfield        #668 <Field Rect mEpicenterBounds>
	//  218  435:aastore         
	//  219  436:invokevirtual   #464 <Method Object Method.invoke(Object, Object[])>
	//  220  439:pop             
			}
	//* 221  440:goto            456
			catch(Exception exception)
	//* 222  443:astore          6
			{
				Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", ((Throwable) (exception)));
	//  223  445:ldc1            #46  <String "ListPopupWindow">
	//  224  447:ldc2            #725 <String "Could not invoke setEpicenterBounds on PopupWindow">
	//  225  450:aload           6
	//  226  452:invokestatic    #728 <Method int Log.e(String, String, Throwable)>
	//  227  455:pop             
			}
		PopupWindowCompat.showAsDropDown(mPopup, getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
	//  228  456:aload_0         
	//  229  457:getfield        #261 <Field PopupWindow mPopup>
	//  230  460:aload_0         
	//  231  461:invokevirtual   #414 <Method View getAnchorView()>
	//  232  464:aload_0         
	//  233  465:getfield        #241 <Field int mDropDownHorizontalOffset>
	//  234  468:aload_0         
	//  235  469:getfield        #246 <Field int mDropDownVerticalOffset>
	//  236  472:aload_0         
	//  237  473:getfield        #180 <Field int mDropDownGravity>
	//  238  476:invokestatic    #732 <Method void PopupWindowCompat.showAsDropDown(PopupWindow, View, int, int, int)>
		mDropDownList.setSelection(-1);
	//  239  479:aload_0         
	//  240  480:getfield        #270 <Field DropDownListView mDropDownList>
	//  241  483:iconst_m1       
	//  242  484:invokevirtual   #684 <Method void DropDownListView.setSelection(int)>
		if(!mModal || mDropDownList.isInTouchMode())
	//* 243  487:aload_0         
	//* 244  488:getfield        #275 <Field boolean mModal>
	//* 245  491:ifeq            504
	//* 246  494:aload_0         
	//* 247  495:getfield        #270 <Field DropDownListView mDropDownList>
	//* 248  498:invokevirtual   #735 <Method boolean DropDownListView.isInTouchMode()>
	//* 249  501:ifeq            508
			clearListSelection();
	//  250  504:aload_0         
	//  251  505:invokevirtual   #574 <Method void clearListSelection()>
		if(!mModal)
	//* 252  508:aload_0         
	//* 253  509:getfield        #275 <Field boolean mModal>
	//* 254  512:ifne            527
			mHandler.post(((Runnable) (mHideSelector)));
	//  255  515:aload_0         
	//  256  516:getfield        #221 <Field Handler mHandler>
	//  257  519:aload_0         
	//  258  520:getfield        #203 <Field ListPopupWindow$ListSelectorHider mHideSelector>
	//  259  523:invokevirtual   #642 <Method boolean Handler.post(Runnable)>
	//  260  526:pop             
	//  261  527:return          
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
	//    0    0:ldc1            #105 <Class PopupWindow>
	//    1    2:ldc1            #107 <String "setClipToScreenEnabled">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #115 <Field Class Boolean.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #119 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   17:putstatic       #121 <Field Method sClipToWindowEnabledMethod>
		}
	//*  10   20:goto            32
		catch(NoSuchMethodException nosuchmethodexception)
	//*  11   23:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
	//   12   24:ldc1            #46  <String "ListPopupWindow">
	//   13   26:ldc1            #123 <String "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.">
	//   14   28:invokestatic    #129 <Method int Log.i(String, String)>
	//   15   31:pop             
		}
		try
		{
			sGetMaxAvailableHeightMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getMaxAvailableHeight", new Class[] {
				android/view/View, Integer.TYPE, Boolean.TYPE
			});
	//   16   32:ldc1            #105 <Class PopupWindow>
	//   17   34:ldc1            #131 <String "getMaxAvailableHeight">
	//   18   36:iconst_3        
	//   19   37:anewarray       Class[]
	//   20   40:dup             
	//   21   41:iconst_0        
	//   22   42:ldc1            #133 <Class View>
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:getstatic       #136 <Field Class Integer.TYPE>
	//   27   50:aastore         
	//   28   51:dup             
	//   29   52:iconst_2        
	//   30   53:getstatic       #115 <Field Class Boolean.TYPE>
	//   31   56:aastore         
	//   32   57:invokevirtual   #119 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   33   60:putstatic       #138 <Field Method sGetMaxAvailableHeightMethod>
		}
	//*  34   63:goto            75
		catch(NoSuchMethodException nosuchmethodexception1)
	//*  35   66:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
	//   36   67:ldc1            #46  <String "ListPopupWindow">
	//   37   69:ldc1            #140 <String "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.">
	//   38   71:invokestatic    #129 <Method int Log.i(String, String)>
	//   39   74:pop             
		}
		try
		{
			sSetEpicenterBoundsMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setEpicenterBounds", new Class[] {
				android/graphics/Rect
			});
	//   40   75:ldc1            #105 <Class PopupWindow>
	//   41   77:ldc1            #142 <String "setEpicenterBounds">
	//   42   79:iconst_1        
	//   43   80:anewarray       Class[]
	//   44   83:dup             
	//   45   84:iconst_0        
	//   46   85:ldc1            #144 <Class Rect>
	//   47   87:aastore         
	//   48   88:invokevirtual   #119 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   49   91:putstatic       #146 <Field Method sSetEpicenterBoundsMethod>
	//   50   94:return          
		}
		catch(NoSuchMethodException nosuchmethodexception2)
	//*  51   95:astore_0        
		{
			Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
	//   52   96:ldc1            #46  <String "ListPopupWindow">
	//   53   98:ldc1            #148 <String "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.">
	//   54  100:invokestatic    #129 <Method int Log.i(String, String)>
	//   55  103:pop             
		}
	//*  56  104:return          
	}
}
