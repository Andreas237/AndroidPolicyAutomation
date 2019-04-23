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
	//   54  103:new             #146 <Class Rect>
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
		Object obj = ((Object) (mDropDownList));
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field DropDownListView mDropDownList>
	//    2    4:astore          6
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		int i;
		if(obj == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       381
		{
			obj = ((Object) (mContext));
	//    7   14:aload_0         
	//    8   15:getfield        #210 <Field Context mContext>
	//    9   18:astore          6
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
	//   10   20:aload_0         
	//   11   21:new             #10  <Class ListPopupWindow$2>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #267 <Method void ListPopupWindow$2(ListPopupWindow)>
	//   15   29:putfield        #269 <Field Runnable mShowDropDownRunnable>
			mDropDownList = createDropDownListView(((Context) (obj)), mModal ^ true);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:aload           6
	//   19   36:aload_0         
	//   20   37:getfield        #271 <Field boolean mModal>
	//   21   40:iconst_1        
	//   22   41:ixor            
	//   23   42:invokevirtual   #275 <Method DropDownListView createDropDownListView(Context, boolean)>
	//   24   45:putfield        #266 <Field DropDownListView mDropDownList>
			Object obj1 = ((Object) (mDropDownListHighlight));
	//   25   48:aload_0         
	//   26   49:getfield        #277 <Field Drawable mDropDownListHighlight>
	//   27   52:astore          7
			if(obj1 != null)
	//*  28   54:aload           7
	//*  29   56:ifnull          68
				mDropDownList.setSelector(((Drawable) (obj1)));
	//   30   59:aload_0         
	//   31   60:getfield        #266 <Field DropDownListView mDropDownList>
	//   32   63:aload           7
	//   33   65:invokevirtual   #283 <Method void DropDownListView.setSelector(Drawable)>
			mDropDownList.setAdapter(mAdapter);
	//   34   68:aload_0         
	//   35   69:getfield        #266 <Field DropDownListView mDropDownList>
	//   36   72:aload_0         
	//   37   73:getfield        #285 <Field ListAdapter mAdapter>
	//   38   76:invokevirtual   #289 <Method void DropDownListView.setAdapter(ListAdapter)>
			mDropDownList.setOnItemClickListener(mItemClickListener);
	//   39   79:aload_0         
	//   40   80:getfield        #266 <Field DropDownListView mDropDownList>
	//   41   83:aload_0         
	//   42   84:getfield        #291 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
	//   43   87:invokevirtual   #295 <Method void DropDownListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mDropDownList.setFocusable(true);
	//   44   90:aload_0         
	//   45   91:getfield        #266 <Field DropDownListView mDropDownList>
	//   46   94:iconst_1        
	//   47   95:invokevirtual   #299 <Method void DropDownListView.setFocusable(boolean)>
			mDropDownList.setFocusableInTouchMode(true);
	//   48   98:aload_0         
	//   49   99:getfield        #266 <Field DropDownListView mDropDownList>
	//   50  102:iconst_1        
	//   51  103:invokevirtual   #302 <Method void DropDownListView.setFocusableInTouchMode(boolean)>
			mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

				public void onItemSelected(AdapterView adapterview, View view1, int k1, long l1)
				{
					if(k1 != -1)
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
	//   52  106:aload_0         
	//   53  107:getfield        #266 <Field DropDownListView mDropDownList>
	//   54  110:new             #12  <Class ListPopupWindow$3>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:invokespecial   #303 <Method void ListPopupWindow$3(ListPopupWindow)>
	//   58  118:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			mDropDownList.setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (mScrollListener)));
	//   59  121:aload_0         
	//   60  122:getfield        #266 <Field DropDownListView mDropDownList>
	//   61  125:aload_0         
	//   62  126:getfield        #202 <Field ListPopupWindow$PopupScrollListener mScrollListener>
	//   63  129:invokevirtual   #311 <Method void DropDownListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
			obj1 = ((Object) (mItemSelectedListener));
	//   64  132:aload_0         
	//   65  133:getfield        #313 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//   66  136:astore          7
			if(obj1 != null)
	//*  67  138:aload           7
	//*  68  140:ifnull          152
				mDropDownList.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (obj1)));
	//   69  143:aload_0         
	//   70  144:getfield        #266 <Field DropDownListView mDropDownList>
	//   71  147:aload           7
	//   72  149:invokevirtual   #307 <Method void DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			obj1 = ((Object) (mDropDownList));
	//   73  152:aload_0         
	//   74  153:getfield        #266 <Field DropDownListView mDropDownList>
	//   75  156:astore          7
			View view = mPromptView;
	//   76  158:aload_0         
	//   77  159:getfield        #315 <Field View mPromptView>
	//   78  162:astore          8
			if(view != null)
	//*  79  164:aload           8
	//*  80  166:ifnull          363
			{
				obj = ((Object) (new LinearLayout(((Context) (obj)))));
	//   81  169:new             #317 <Class LinearLayout>
	//   82  172:dup             
	//   83  173:aload           6
	//   84  175:invokespecial   #319 <Method void LinearLayout(Context)>
	//   85  178:astore          6
				((LinearLayout) (obj)).setOrientation(1);
	//   86  180:aload           6
	//   87  182:iconst_1        
	//   88  183:invokevirtual   #322 <Method void LinearLayout.setOrientation(int)>
				android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
	//   89  186:new             #324 <Class android.widget.LinearLayout$LayoutParams>
	//   90  189:dup             
	//   91  190:iconst_m1       
	//   92  191:iconst_0        
	//   93  192:fconst_1        
	//   94  193:invokespecial   #327 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   95  196:astore          9
				switch(mPromptPosition)
	//*  96  198:aload_0         
	//*  97  199:getfield        #191 <Field int mPromptPosition>
				{
	//*  98  202:tableswitch     0 1: default 224
	//	               0 285
	//	               1 266
				default:
					obj1 = ((Object) (new StringBuilder()));
	//   99  224:new             #329 <Class StringBuilder>
	//  100  227:dup             
	//  101  228:invokespecial   #330 <Method void StringBuilder()>
	//  102  231:astore          7
					((StringBuilder) (obj1)).append("Invalid hint position ");
	//  103  233:aload           7
	//  104  235:ldc2            #332 <String "Invalid hint position ">
	//  105  238:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//  106  241:pop             
					((StringBuilder) (obj1)).append(mPromptPosition);
	//  107  242:aload           7
	//  108  244:aload_0         
	//  109  245:getfield        #191 <Field int mPromptPosition>
	//  110  248:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  111  251:pop             
					Log.e("ListPopupWindow", ((StringBuilder) (obj1)).toString());
	//  112  252:ldc1            #46  <String "ListPopupWindow">
	//  113  254:aload           7
	//  114  256:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  115  259:invokestatic    #346 <Method int Log.e(String, String)>
	//  116  262:pop             
					break;

	//* 117  263:goto            301
				case 1: // '\001'
					((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  118  266:aload           6
	//  119  268:aload           7
	//  120  270:aload           9
	//  121  272:invokevirtual   #350 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					((LinearLayout) (obj)).addView(view);
	//  122  275:aload           6
	//  123  277:aload           8
	//  124  279:invokevirtual   #353 <Method void LinearLayout.addView(View)>
					break;

	//* 125  282:goto            301
				case 0: // '\0'
					((LinearLayout) (obj)).addView(view);
	//  126  285:aload           6
	//  127  287:aload           8
	//  128  289:invokevirtual   #353 <Method void LinearLayout.addView(View)>
					((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  129  292:aload           6
	//  130  294:aload           7
	//  131  296:aload           9
	//  132  298:invokevirtual   #350 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					break;
				}
				i = mDropDownWidth;
	//  133  301:aload_0         
	//  134  302:getfield        #176 <Field int mDropDownWidth>
	//  135  305:istore_1        
				int j;
				if(i >= 0)
	//* 136  306:iload_1         
	//* 137  307:iflt            317
				{
					j = 0x80000000;
	//  138  310:ldc2            #354 <Int 0x80000000>
	//  139  313:istore_2        
				} else
	//* 140  314:goto            321
				{
					i = 0;
	//  141  317:iconst_0        
	//  142  318:istore_1        
					j = i;
	//  143  319:iload_1         
	//  144  320:istore_2        
				}
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, j), 0);
	//  145  321:aload           8
	//  146  323:iload_1         
	//  147  324:iload_2         
	//  148  325:invokestatic    #359 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  149  328:iconst_0        
	//  150  329:invokevirtual   #363 <Method void View.measure(int, int)>
				obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()));
	//  151  332:aload           8
	//  152  334:invokevirtual   #367 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  153  337:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//  154  340:astore          7
				i = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
	//  155  342:aload           8
	//  156  344:invokevirtual   #370 <Method int View.getMeasuredHeight()>
	//  157  347:aload           7
	//  158  349:getfield        #373 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  159  352:iadd            
	//  160  353:aload           7
	//  161  355:getfield        #376 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  162  358:iadd            
	//  163  359:istore_1        
			} else
	//* 164  360:goto            369
			{
				i = 0;
	//  165  363:iconst_0        
	//  166  364:istore_1        
				obj = obj1;
	//  167  365:aload           7
	//  168  367:astore          6
			}
			mPopup.setContentView(((View) (obj)));
	//  169  369:aload_0         
	//  170  370:getfield        #258 <Field PopupWindow mPopup>
	//  171  373:aload           6
	//  172  375:invokevirtual   #379 <Method void PopupWindow.setContentView(View)>
		} else
	//* 173  378:goto            437
		{
			obj = ((Object) ((ViewGroup)mPopup.getContentView()));
	//  174  381:aload_0         
	//  175  382:getfield        #258 <Field PopupWindow mPopup>
	//  176  385:invokevirtual   #383 <Method View PopupWindow.getContentView()>
	//  177  388:checkcast       #385 <Class ViewGroup>
	//  178  391:astore          6
			obj = ((Object) (mPromptView));
	//  179  393:aload_0         
	//  180  394:getfield        #315 <Field View mPromptView>
	//  181  397:astore          6
			if(obj != null)
	//* 182  399:aload           6
	//* 183  401:ifnull          435
			{
				android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
	//  184  404:aload           6
	//  185  406:invokevirtual   #367 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  186  409:checkcast       #324 <Class android.widget.LinearLayout$LayoutParams>
	//  187  412:astore          7
				i = ((View) (obj)).getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//  188  414:aload           6
	//  189  416:invokevirtual   #370 <Method int View.getMeasuredHeight()>
	//  190  419:aload           7
	//  191  421:getfield        #373 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  192  424:iadd            
	//  193  425:aload           7
	//  194  427:getfield        #376 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  195  430:iadd            
	//  196  431:istore_1        
			} else
	//* 197  432:goto            437
			{
				i = 0;
	//  198  435:iconst_0        
	//  199  436:istore_1        
			}
		}
		obj = ((Object) (mPopup.getBackground()));
	//  200  437:aload_0         
	//  201  438:getfield        #258 <Field PopupWindow mPopup>
	//  202  441:invokevirtual   #389 <Method Drawable PopupWindow.getBackground()>
	//  203  444:astore          6
		int i1;
		if(obj != null)
	//* 204  446:aload           6
	//* 205  448:ifnull          503
		{
			((Drawable) (obj)).getPadding(mTempRect);
	//  206  451:aload           6
	//  207  453:aload_0         
	//  208  454:getfield        #208 <Field Rect mTempRect>
	//  209  457:invokevirtual   #395 <Method boolean Drawable.getPadding(Rect)>
	//  210  460:pop             
			int k = mTempRect.top + mTempRect.bottom;
	//  211  461:aload_0         
	//  212  462:getfield        #208 <Field Rect mTempRect>
	//  213  465:getfield        #398 <Field int Rect.top>
	//  214  468:aload_0         
	//  215  469:getfield        #208 <Field Rect mTempRect>
	//  216  472:getfield        #401 <Field int Rect.bottom>
	//  217  475:iadd            
	//  218  476:istore_2        
			i1 = k;
	//  219  477:iload_2         
	//  220  478:istore_3        
			if(!mDropDownVerticalOffsetSet)
	//* 221  479:aload_0         
	//* 222  480:getfield        #250 <Field boolean mDropDownVerticalOffsetSet>
	//* 223  483:ifne            512
			{
				mDropDownVerticalOffset = -mTempRect.top;
	//  224  486:aload_0         
	//  225  487:aload_0         
	//  226  488:getfield        #208 <Field Rect mTempRect>
	//  227  491:getfield        #398 <Field int Rect.top>
	//  228  494:ineg            
	//  229  495:putfield        #248 <Field int mDropDownVerticalOffset>
				i1 = k;
	//  230  498:iload_2         
	//  231  499:istore_3        
			}
		} else
	//* 232  500:goto            512
		{
			mTempRect.setEmpty();
	//  233  503:aload_0         
	//  234  504:getfield        #208 <Field Rect mTempRect>
	//  235  507:invokevirtual   #404 <Method void Rect.setEmpty()>
			i1 = 0;
	//  236  510:iconst_0        
	//  237  511:istore_3        
		}
		if(mPopup.getInputMethodMode() != 2)
	//* 238  512:aload_0         
	//* 239  513:getfield        #258 <Field PopupWindow mPopup>
	//* 240  516:invokevirtual   #407 <Method int PopupWindow.getInputMethodMode()>
	//* 241  519:iconst_2        
	//* 242  520:icmpne          526
	//* 243  523:goto            529
			flag = false;
	//  244  526:iconst_0        
	//  245  527:istore          5
		int j1 = getMaxAvailableHeight(getAnchorView(), mDropDownVerticalOffset, flag);
	//  246  529:aload_0         
	//  247  530:aload_0         
	//  248  531:invokevirtual   #410 <Method View getAnchorView()>
	//  249  534:aload_0         
	//  250  535:getfield        #248 <Field int mDropDownVerticalOffset>
	//  251  538:iload           5
	//  252  540:invokespecial   #413 <Method int getMaxAvailableHeight(View, int, boolean)>
	//  253  543:istore          4
		if(!mDropDownAlwaysVisible && mDropDownHeight != -1)
	//* 254  545:aload_0         
	//* 255  546:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 256  549:ifne            727
	//* 257  552:aload_0         
	//* 258  553:getfield        #174 <Field int mDropDownHeight>
	//* 259  556:iconst_m1       
	//* 260  557:icmpne          563
	//* 261  560:goto            727
		{
			int l = mDropDownWidth;
	//  262  563:aload_0         
	//  263  564:getfield        #176 <Field int mDropDownWidth>
	//  264  567:istore_2        
			switch(l)
	//* 265  568:iload_2         
			{
	//* 266  569:tableswitch     -2 -1: default 592
	//	               -2 642
	//	               -1 603
			default:
				l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
	//  267  592:iload_2         
	//  268  593:ldc2            #414 <Int 0x40000000>
	//  269  596:invokestatic    #359 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  270  599:istore_2        
				break;

	//* 271  600:goto            678
			case -1: 
				l = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x40000000);
	//  272  603:aload_0         
	//  273  604:getfield        #210 <Field Context mContext>
	//  274  607:invokevirtual   #418 <Method Resources Context.getResources()>
	//  275  610:invokevirtual   #424 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  276  613:getfield        #429 <Field int DisplayMetrics.widthPixels>
	//  277  616:aload_0         
	//  278  617:getfield        #208 <Field Rect mTempRect>
	//  279  620:getfield        #432 <Field int Rect.left>
	//  280  623:aload_0         
	//  281  624:getfield        #208 <Field Rect mTempRect>
	//  282  627:getfield        #435 <Field int Rect.right>
	//  283  630:iadd            
	//  284  631:isub            
	//  285  632:ldc2            #414 <Int 0x40000000>
	//  286  635:invokestatic    #359 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  287  638:istore_2        
				break;

	//* 288  639:goto            678
			case -2: 
				l = android.view.View.MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), 0x80000000);
	//  289  642:aload_0         
	//  290  643:getfield        #210 <Field Context mContext>
	//  291  646:invokevirtual   #418 <Method Resources Context.getResources()>
	//  292  649:invokevirtual   #424 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  293  652:getfield        #429 <Field int DisplayMetrics.widthPixels>
	//  294  655:aload_0         
	//  295  656:getfield        #208 <Field Rect mTempRect>
	//  296  659:getfield        #432 <Field int Rect.left>
	//  297  662:aload_0         
	//  298  663:getfield        #208 <Field Rect mTempRect>
	//  299  666:getfield        #435 <Field int Rect.right>
	//  300  669:iadd            
	//  301  670:isub            
	//  302  671:ldc2            #354 <Int 0x80000000>
	//  303  674:invokestatic    #359 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  304  677:istore_2        
				break;
			}
			j1 = mDropDownList.measureHeightOfChildrenCompat(l, 0, -1, j1 - i, -1);
	//  305  678:aload_0         
	//  306  679:getfield        #266 <Field DropDownListView mDropDownList>
	//  307  682:iload_2         
	//  308  683:iconst_0        
	//  309  684:iconst_m1       
	//  310  685:iload           4
	//  311  687:iload_1         
	//  312  688:isub            
	//  313  689:iconst_m1       
	//  314  690:invokevirtual   #439 <Method int DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
	//  315  693:istore          4
			l = i;
	//  316  695:iload_1         
	//  317  696:istore_2        
			if(j1 > 0)
	//* 318  697:iload           4
	//* 319  699:ifle            722
				l = i + (i1 + (mDropDownList.getPaddingTop() + mDropDownList.getPaddingBottom()));
	//  320  702:iload_1         
	//  321  703:iload_3         
	//  322  704:aload_0         
	//  323  705:getfield        #266 <Field DropDownListView mDropDownList>
	//  324  708:invokevirtual   #442 <Method int DropDownListView.getPaddingTop()>
	//  325  711:aload_0         
	//  326  712:getfield        #266 <Field DropDownListView mDropDownList>
	//  327  715:invokevirtual   #445 <Method int DropDownListView.getPaddingBottom()>
	//  328  718:iadd            
	//  329  719:iadd            
	//  330  720:iadd            
	//  331  721:istore_2        
			return j1 + l;
	//  332  722:iload           4
	//  333  724:iload_2         
	//  334  725:iadd            
	//  335  726:ireturn         
		} else
		{
			return j1 + i1;
	//  336  727:iload           4
	//  337  729:iload_3         
	//  338  730:iadd            
	//  339  731:ireturn         
		}
	}

	private int getMaxAvailableHeight(View view, int i, boolean flag)
	{
		Method method = sGetMaxAvailableHeightMethod;
	//    0    0:getstatic       #140 <Field Method sGetMaxAvailableHeightMethod>
	//    1    3:astore          5
		if(method == null) goto _L2; else goto _L1
	//    2    5:aload           5
	//    3    7:ifnull          61
_L1:
		int j = ((Integer)method.invoke(((Object) (mPopup)), new Object[] {
			view, Integer.valueOf(i), Boolean.valueOf(flag)
		})).intValue();
	//    4   10:aload           5
	//    5   12:aload_0         
	//    6   13:getfield        #258 <Field PopupWindow mPopup>
	//    7   16:iconst_3        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_1         
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:iload_2         
	//   16   27:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:dup             
	//   19   32:iconst_2        
	//   20   33:iload_3         
	//   21   34:invokestatic    #454 <Method Boolean Boolean.valueOf(boolean)>
	//   22   37:aastore         
	//   23   38:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//   24   41:checkcast       #137 <Class Integer>
	//   25   44:invokevirtual   #463 <Method int Integer.intValue()>
	//   26   47:istore          4
		return j;
	//   27   49:iload           4
	//   28   51:ireturn         
_L4:
		Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
	//   29   52:ldc1            #46  <String "ListPopupWindow">
	//   30   54:ldc2            #465 <String "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.">
	//   31   57:invokestatic    #131 <Method int Log.i(String, String)>
	//   32   60:pop             
_L2:
		return mPopup.getMaxAvailableHeight(view, i);
	//   33   61:aload_0         
	//   34   62:getfield        #258 <Field PopupWindow mPopup>
	//   35   65:aload_1         
	//   36   66:iload_2         
	//   37   67:invokevirtual   #468 <Method int PopupWindow.getMaxAvailableHeight(View, int)>
	//   38   70:ireturn         
		Exception exception;
		exception;
	//   39   71:astore          5
		if(true) goto _L4; else goto _L3
	//   40   73:goto            52
_L3:
	}

	private static boolean isConfirmKey(int i)
	{
		return i == 66 || i == 23;
	//    0    0:iload_0         
	//    1    1:bipush          66
	//    2    3:icmpeq          17
	//    3    6:iload_0         
	//    4    7:bipush          23
	//    5    9:icmpne          15
	//    6   12:goto            17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	private void removePromptView()
	{
		Object obj = ((Object) (mPromptView));
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field View mPromptView>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
		{
			obj = ((Object) (((View) (obj)).getParent()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #475 <Method android.view.ViewParent View.getParent()>
	//    7   13:astore_1        
			if(obj instanceof ViewGroup)
	//*   8   14:aload_1         
	//*   9   15:instanceof      #385 <Class ViewGroup>
	//*  10   18:ifeq            32
				((ViewGroup)obj).removeView(mPromptView);
	//   11   21:aload_1         
	//   12   22:checkcast       #385 <Class ViewGroup>
	//   13   25:aload_0         
	//   14   26:getfield        #315 <Field View mPromptView>
	//   15   29:invokevirtual   #478 <Method void ViewGroup.removeView(View)>
		}
	//   16   32:return          
	}

	private void setPopupClipToScreenEnabled(boolean flag)
	{
		Exception exception;
		Method method = sClipToWindowEnabledMethod;
	//    0    0:getstatic       #123 <Field Method sClipToWindowEnabledMethod>
	//    1    3:astore_2        
		if(method != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          38
			try
			{
				method.invoke(((Object) (mPopup)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #258 <Field PopupWindow mPopup>
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:iload_1         
	//   12   20:invokestatic    #454 <Method Boolean Boolean.valueOf(boolean)>
	//   13   23:aastore         
	//   14   24:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//   15   27:pop             
				return;
	//   16   28:return          
			}
	//*  17   29:ldc1            #46  <String "ListPopupWindow">
	//*  18   31:ldc2            #481 <String "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.">
	//*  19   34:invokestatic    #131 <Method int Log.i(String, String)>
	//*  20   37:pop             
	//*  21   38:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
			}
	//*  22   39:astore_2        
	//*  23   40:goto            29
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
	//    8   16:invokevirtual   #379 <Method void PopupWindow.setContentView(View)>
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
	//    2    4:invokevirtual   #389 <Method Drawable PopupWindow.getBackground()>
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
	//    2    4:invokevirtual   #407 <Method int PopupWindow.getInputMethodMode()>
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
	//    2    4:invokevirtual   #407 <Method int PopupWindow.getInputMethodMode()>
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
		if(isShowing() && i != 62 && (mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i)))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #522 <Method boolean isShowing()>
	//*   2    4:ifeq            311
	//*   3    7:iload_1         
	//*   4    8:bipush          62
	//*   5   10:icmpeq          311
	//*   6   13:aload_0         
	//*   7   14:getfield        #266 <Field DropDownListView mDropDownList>
	//*   8   17:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//*   9   20:ifge            30
	//*  10   23:iload_1         
	//*  11   24:invokestatic    #553 <Method boolean isConfirmKey(int)>
	//*  12   27:ifne            311
		{
			int l = mDropDownList.getSelectedItemPosition();
	//   13   30:aload_0         
	//   14   31:getfield        #266 <Field DropDownListView mDropDownList>
	//   15   34:invokevirtual   #533 <Method int DropDownListView.getSelectedItemPosition()>
	//   16   37:istore          5
			boolean flag = mPopup.isAboveAnchor() ^ true;
	//   17   39:aload_0         
	//   18   40:getfield        #258 <Field PopupWindow mPopup>
	//   19   43:invokevirtual   #556 <Method boolean PopupWindow.isAboveAnchor()>
	//   20   46:iconst_1        
	//   21   47:ixor            
	//   22   48:istore          6
			ListAdapter listadapter = mAdapter;
	//   23   50:aload_0         
	//   24   51:getfield        #285 <Field ListAdapter mAdapter>
	//   25   54:astore          8
			int j = 0x7fffffff;
	//   26   56:ldc1            #187 <Int 0x7fffffff>
	//   27   58:istore_3        
			int k;
			if(listadapter != null)
	//*  28   59:aload           8
	//*  29   61:ifnull          134
			{
				boolean flag1 = listadapter.areAllItemsEnabled();
	//   30   64:aload           8
	//   31   66:invokeinterface #561 <Method boolean ListAdapter.areAllItemsEnabled()>
	//   32   71:istore          7
				if(flag1)
	//*  33   73:iload           7
	//*  34   75:ifeq            83
					j = 0;
	//   35   78:iconst_0        
	//   36   79:istore_3        
				else
	//*  37   80:goto            93
					j = mDropDownList.lookForSelectablePosition(0, true);
	//   38   83:aload_0         
	//   39   84:getfield        #266 <Field DropDownListView mDropDownList>
	//   40   87:iconst_0        
	//   41   88:iconst_1        
	//   42   89:invokevirtual   #565 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   43   92:istore_3        
				if(flag1)
	//*  44   93:iload           7
	//*  45   95:ifeq            112
					k = listadapter.getCount() - 1;
	//   46   98:aload           8
	//   47  100:invokeinterface #568 <Method int ListAdapter.getCount()>
	//   48  105:iconst_1        
	//   49  106:isub            
	//   50  107:istore          4
				else
	//*  51  109:goto            131
					k = mDropDownList.lookForSelectablePosition(listadapter.getCount() - 1, false);
	//   52  112:aload_0         
	//   53  113:getfield        #266 <Field DropDownListView mDropDownList>
	//   54  116:aload           8
	//   55  118:invokeinterface #568 <Method int ListAdapter.getCount()>
	//   56  123:iconst_1        
	//   57  124:isub            
	//   58  125:iconst_0        
	//   59  126:invokevirtual   #565 <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//   60  129:istore          4
			} else
	//*  61  131:goto            139
			{
				k = 0x80000000;
	//   62  134:ldc2            #354 <Int 0x80000000>
	//   63  137:istore          4
			}
			if(flag && i == 19 && l <= j || !flag && i == 20 && l >= k)
	//*  64  139:iload           6
	//*  65  141:ifeq            156
	//*  66  144:iload_1         
	//*  67  145:bipush          19
	//*  68  147:icmpne          156
	//*  69  150:iload           5
	//*  70  152:iload_3         
	//*  71  153:icmple          174
	//*  72  156:iload           6
	//*  73  158:ifne            192
	//*  74  161:iload_1         
	//*  75  162:bipush          20
	//*  76  164:icmpne          192
	//*  77  167:iload           5
	//*  78  169:iload           4
	//*  79  171:icmplt          192
			{
				clearListSelection();
	//   80  174:aload_0         
	//   81  175:invokevirtual   #570 <Method void clearListSelection()>
				mPopup.setInputMethodMode(1);
	//   82  178:aload_0         
	//   83  179:getfield        #258 <Field PopupWindow mPopup>
	//   84  182:iconst_1        
	//   85  183:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
				show();
	//   86  186:aload_0         
	//   87  187:invokevirtual   #573 <Method void show()>
				return true;
	//   88  190:iconst_1        
	//   89  191:ireturn         
			}
			mDropDownList.setListSelectionHidden(false);
	//   90  192:aload_0         
	//   91  193:getfield        #266 <Field DropDownListView mDropDownList>
	//   92  196:iconst_0        
	//   93  197:invokevirtual   #485 <Method void DropDownListView.setListSelectionHidden(boolean)>
			if(mDropDownList.onKeyDown(i, keyevent))
	//*  94  200:aload_0         
	//*  95  201:getfield        #266 <Field DropDownListView mDropDownList>
	//*  96  204:iload_1         
	//*  97  205:aload_2         
	//*  98  206:invokevirtual   #575 <Method boolean DropDownListView.onKeyDown(int, KeyEvent)>
	//*  99  209:ifeq            272
			{
				mPopup.setInputMethodMode(2);
	//  100  212:aload_0         
	//  101  213:getfield        #258 <Field PopupWindow mPopup>
	//  102  216:iconst_2        
	//  103  217:invokevirtual   #262 <Method void PopupWindow.setInputMethodMode(int)>
				mDropDownList.requestFocusFromTouch();
	//  104  220:aload_0         
	//  105  221:getfield        #266 <Field DropDownListView mDropDownList>
	//  106  224:invokevirtual   #578 <Method boolean DropDownListView.requestFocusFromTouch()>
	//  107  227:pop             
				show();
	//  108  228:aload_0         
	//  109  229:invokevirtual   #573 <Method void show()>
				if(i != 23 && i != 66)
	//* 110  232:iload_1         
	//* 111  233:bipush          23
	//* 112  235:icmpeq          270
	//* 113  238:iload_1         
	//* 114  239:bipush          66
	//* 115  241:icmpeq          270
					switch(i)
	//* 116  244:iload_1         
					{
	//* 117  245:tableswitch     19 20: default 268
	//	               19 270
	//	               20 270
					default:
						return false;
	//  118  268:iconst_0        
	//  119  269:ireturn         

					case 19: // '\023'
					case 20: // '\024'
						break;
					}
				return true;
	//  120  270:iconst_1        
	//  121  271:ireturn         
			}
			if(flag && i == 20)
	//* 122  272:iload           6
	//* 123  274:ifeq            292
	//* 124  277:iload_1         
	//* 125  278:bipush          20
	//* 126  280:icmpne          292
			{
				if(l == k)
	//* 127  283:iload           5
	//* 128  285:iload           4
	//* 129  287:icmpne          311
					return true;
	//  130  290:iconst_1        
	//  131  291:ireturn         
			} else
			if(!flag && i == 19 && l == j)
	//* 132  292:iload           6
	//* 133  294:ifne            311
	//* 134  297:iload_1         
	//* 135  298:bipush          19
	//* 136  300:icmpne          311
	//* 137  303:iload           5
	//* 138  305:iload_3         
	//* 139  306:icmpne          311
				return true;
	//  140  309:iconst_1        
	//  141  310:ireturn         
		}
		return false;
	//  142  311:iconst_0        
	//  143  312:ireturn         
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
		DataSetObserver datasetobserver = mObserver;
	//    0    0:aload_0         
	//    1    1:getfield        #640 <Field DataSetObserver mObserver>
	//    2    4:astore_2        
		if(datasetobserver == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       24
		{
			mObserver = ((DataSetObserver) (new PopupDataSetObserver()));
	//    5    9:aload_0         
	//    6   10:new             #17  <Class ListPopupWindow$PopupDataSetObserver>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #641 <Method void ListPopupWindow$PopupDataSetObserver(ListPopupWindow)>
	//   10   18:putfield        #640 <Field DataSetObserver mObserver>
		} else
	//*  11   21:goto            40
		{
			ListAdapter listadapter1 = mAdapter;
	//   12   24:aload_0         
	//   13   25:getfield        #285 <Field ListAdapter mAdapter>
	//   14   28:astore_3        
			if(listadapter1 != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          40
				listadapter1.unregisterDataSetObserver(datasetobserver);
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:invokeinterface #645 <Method void ListAdapter.unregisterDataSetObserver(DataSetObserver)>
		}
		mAdapter = listadapter;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #285 <Field ListAdapter mAdapter>
		if(listadapter != null)
	//*  23   45:aload_1         
	//*  24   46:ifnull          59
			listadapter.registerDataSetObserver(mObserver);
	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #640 <Field DataSetObserver mObserver>
	//   28   54:invokeinterface #648 <Method void ListAdapter.registerDataSetObserver(DataSetObserver)>
		listadapter = ((ListAdapter) (mDropDownList));
	//   29   59:aload_0         
	//   30   60:getfield        #266 <Field DropDownListView mDropDownList>
	//   31   63:astore_1        
		if(listadapter != null)
	//*  32   64:aload_1         
	//*  33   65:ifnull          76
			((DropDownListView) (listadapter)).setAdapter(mAdapter);
	//   34   68:aload_1         
	//   35   69:aload_0         
	//   36   70:getfield        #285 <Field ListAdapter mAdapter>
	//   37   73:invokevirtual   #289 <Method void DropDownListView.setAdapter(ListAdapter)>
	//   38   76:return          
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
	//    2    4:invokevirtual   #389 <Method Drawable PopupWindow.getBackground()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          43
		{
			drawable.getPadding(mTempRect);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #208 <Field Rect mTempRect>
	//    9   17:invokevirtual   #395 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			mDropDownWidth = mTempRect.left + mTempRect.right + i;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #208 <Field Rect mTempRect>
	//   14   26:getfield        #432 <Field int Rect.left>
	//   15   29:aload_0         
	//   16   30:getfield        #208 <Field Rect mTempRect>
	//   17   33:getfield        #435 <Field int Rect.right>
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
	//*   1    1:ifge            29
	//*   2    4:bipush          -2
	//*   3    6:iload_1         
	//*   4    7:icmpeq          29
	//*   5   10:iconst_m1       
	//*   6   11:iload_1         
	//*   7   12:icmpne          18
	//*   8   15:goto            29
		{
			throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
	//    9   18:new             #668 <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc2            #670 <String "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.">
	//   12   25:invokespecial   #673 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			mDropDownHeight = i;
	//   14   29:aload_0         
	//   15   30:iload_1         
	//   16   31:putfield        #174 <Field int mDropDownHeight>
			return;
	//   17   34:return          
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
	//   13   23:invokevirtual   #573 <Method void show()>
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
		int k = buildDropDown();
	//    0    0:aload_0         
	//    1    1:invokespecial   #706 <Method int buildDropDown()>
	//    2    4:istore_2        
		boolean flag1 = isInputMethodNotNeeded();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #708 <Method boolean isInputMethodNotNeeded()>
	//    5    9:istore          6
		PopupWindowCompat.setWindowLayoutType(mPopup, mDropDownWindowLayoutType);
	//    6   11:aload_0         
	//    7   12:getfield        #258 <Field PopupWindow mPopup>
	//    8   15:aload_0         
	//    9   16:getfield        #178 <Field int mDropDownWindowLayoutType>
	//   10   19:invokestatic    #713 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
		boolean flag2 = mPopup.isShowing();
	//   11   22:aload_0         
	//   12   23:getfield        #258 <Field PopupWindow mPopup>
	//   13   26:invokevirtual   #549 <Method boolean PopupWindow.isShowing()>
	//   14   29:istore          7
		boolean flag = true;
	//   15   31:iconst_1        
	//   16   32:istore          5
		if(flag2)
	//*  17   34:iload           7
	//*  18   36:ifeq            280
		{
			if(!ViewCompat.isAttachedToWindow(getAnchorView()))
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #410 <Method View getAnchorView()>
	//*  21   43:invokestatic    #719 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  22   46:ifne            50
				return;
	//   23   49:return          
			int l = mDropDownWidth;
	//   24   50:aload_0         
	//   25   51:getfield        #176 <Field int mDropDownWidth>
	//   26   54:istore_3        
			int i;
			if(l == -1)
	//*  27   55:iload_3         
	//*  28   56:iconst_m1       
	//*  29   57:icmpne          65
			{
				i = -1;
	//   30   60:iconst_m1       
	//   31   61:istore_1        
			} else
	//*  32   62:goto            81
			{
				i = l;
	//   33   65:iload_3         
	//   34   66:istore_1        
				if(l == -2)
	//*  35   67:iload_3         
	//*  36   68:bipush          -2
	//*  37   70:icmpne          81
					i = getAnchorView().getWidth();
	//   38   73:aload_0         
	//   39   74:invokevirtual   #410 <Method View getAnchorView()>
	//   40   77:invokevirtual   #721 <Method int View.getWidth()>
	//   41   80:istore_1        
			}
			l = mDropDownHeight;
	//   42   81:aload_0         
	//   43   82:getfield        #174 <Field int mDropDownHeight>
	//   44   85:istore_3        
			if(l == -1)
	//*  45   86:iload_3         
	//*  46   87:iconst_m1       
	//*  47   88:icmpne          182
			{
				if(!flag1)
	//*  48   91:iload           6
	//*  49   93:ifeq            99
	//*  50   96:goto            101
					k = -1;
	//   51   99:iconst_m1       
	//   52  100:istore_2        
				if(flag1)
	//*  53  101:iload           6
	//*  54  103:ifeq            144
				{
					PopupWindow popupwindow = mPopup;
	//   55  106:aload_0         
	//   56  107:getfield        #258 <Field PopupWindow mPopup>
	//   57  110:astore          8
					if(mDropDownWidth == -1)
	//*  58  112:aload_0         
	//*  59  113:getfield        #176 <Field int mDropDownWidth>
	//*  60  116:iconst_m1       
	//*  61  117:icmpne          125
						l = -1;
	//   62  120:iconst_m1       
	//   63  121:istore_3        
					else
	//*  64  122:goto            127
						l = 0;
	//   65  125:iconst_0        
	//   66  126:istore_3        
					popupwindow.setWidth(l);
	//   67  127:aload           8
	//   68  129:iload_3         
	//   69  130:invokevirtual   #722 <Method void PopupWindow.setWidth(int)>
					mPopup.setHeight(0);
	//   70  133:aload_0         
	//   71  134:getfield        #258 <Field PopupWindow mPopup>
	//   72  137:iconst_0        
	//   73  138:invokevirtual   #724 <Method void PopupWindow.setHeight(int)>
				} else
	//*  74  141:goto            193
				{
					PopupWindow popupwindow1 = mPopup;
	//   75  144:aload_0         
	//   76  145:getfield        #258 <Field PopupWindow mPopup>
	//   77  148:astore          8
					if(mDropDownWidth == -1)
	//*  78  150:aload_0         
	//*  79  151:getfield        #176 <Field int mDropDownWidth>
	//*  80  154:iconst_m1       
	//*  81  155:icmpne          163
						l = -1;
	//   82  158:iconst_m1       
	//   83  159:istore_3        
					else
	//*  84  160:goto            165
						l = 0;
	//   85  163:iconst_0        
	//   86  164:istore_3        
					popupwindow1.setWidth(l);
	//   87  165:aload           8
	//   88  167:iload_3         
	//   89  168:invokevirtual   #722 <Method void PopupWindow.setWidth(int)>
					mPopup.setHeight(-1);
	//   90  171:aload_0         
	//   91  172:getfield        #258 <Field PopupWindow mPopup>
	//   92  175:iconst_m1       
	//   93  176:invokevirtual   #724 <Method void PopupWindow.setHeight(int)>
				}
			} else
	//*  94  179:goto            193
			if(l != -2)
	//*  95  182:iload_3         
	//*  96  183:bipush          -2
	//*  97  185:icmpne          191
	//*  98  188:goto            193
				k = l;
	//   99  191:iload_3         
	//  100  192:istore_2        
			PopupWindow popupwindow2 = mPopup;
	//  101  193:aload_0         
	//  102  194:getfield        #258 <Field PopupWindow mPopup>
	//  103  197:astore          8
			if(mForceIgnoreOutsideTouch || mDropDownAlwaysVisible)
	//* 104  199:aload_0         
	//* 105  200:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//* 106  203:ifne            216
	//* 107  206:aload_0         
	//* 108  207:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 109  210:ifne            216
	//* 110  213:goto            219
				flag = false;
	//  111  216:iconst_0        
	//  112  217:istore          5
			popupwindow2.setOutsideTouchable(flag);
	//  113  219:aload           8
	//  114  221:iload           5
	//  115  223:invokevirtual   #727 <Method void PopupWindow.setOutsideTouchable(boolean)>
			popupwindow2 = mPopup;
	//  116  226:aload_0         
	//  117  227:getfield        #258 <Field PopupWindow mPopup>
	//  118  230:astore          8
			View view = getAnchorView();
	//  119  232:aload_0         
	//  120  233:invokevirtual   #410 <Method View getAnchorView()>
	//  121  236:astore          9
			l = mDropDownHorizontalOffset;
	//  122  238:aload_0         
	//  123  239:getfield        #243 <Field int mDropDownHorizontalOffset>
	//  124  242:istore_3        
			int j1 = mDropDownVerticalOffset;
	//  125  243:aload_0         
	//  126  244:getfield        #248 <Field int mDropDownVerticalOffset>
	//  127  247:istore          4
			if(i < 0)
	//* 128  249:iload_1         
	//* 129  250:ifge            258
				i = -1;
	//  130  253:iconst_m1       
	//  131  254:istore_1        
	//* 132  255:goto            258
			if(k < 0)
	//* 133  258:iload_2         
	//* 134  259:ifge            267
				k = -1;
	//  135  262:iconst_m1       
	//  136  263:istore_2        
	//* 137  264:goto            267
			popupwindow2.update(view, l, j1, i, k);
	//  138  267:aload           8
	//  139  269:aload           9
	//  140  271:iload_3         
	//  141  272:iload           4
	//  142  274:iload_1         
	//  143  275:iload_2         
	//  144  276:invokevirtual   #731 <Method void PopupWindow.update(View, int, int, int, int)>
			return;
	//  145  279:return          
		}
		int i1 = mDropDownWidth;
	//  146  280:aload_0         
	//  147  281:getfield        #176 <Field int mDropDownWidth>
	//  148  284:istore_3        
		int j;
		if(i1 == -1)
	//* 149  285:iload_3         
	//* 150  286:iconst_m1       
	//* 151  287:icmpne          295
		{
			j = -1;
	//  152  290:iconst_m1       
	//  153  291:istore_1        
		} else
	//* 154  292:goto            311
		{
			j = i1;
	//  155  295:iload_3         
	//  156  296:istore_1        
			if(i1 == -2)
	//* 157  297:iload_3         
	//* 158  298:bipush          -2
	//* 159  300:icmpne          311
				j = getAnchorView().getWidth();
	//  160  303:aload_0         
	//  161  304:invokevirtual   #410 <Method View getAnchorView()>
	//  162  307:invokevirtual   #721 <Method int View.getWidth()>
	//  163  310:istore_1        
		}
		i1 = mDropDownHeight;
	//  164  311:aload_0         
	//  165  312:getfield        #174 <Field int mDropDownHeight>
	//  166  315:istore_3        
		if(i1 == -1)
	//* 167  316:iload_3         
	//* 168  317:iconst_m1       
	//* 169  318:icmpne          326
			k = -1;
	//  170  321:iconst_m1       
	//  171  322:istore_2        
		else
	//* 172  323:goto            337
		if(i1 != -2)
	//* 173  326:iload_3         
	//* 174  327:bipush          -2
	//* 175  329:icmpne          335
	//* 176  332:goto            337
			k = i1;
	//  177  335:iload_3         
	//  178  336:istore_2        
		mPopup.setWidth(j);
	//  179  337:aload_0         
	//  180  338:getfield        #258 <Field PopupWindow mPopup>
	//  181  341:iload_1         
	//  182  342:invokevirtual   #722 <Method void PopupWindow.setWidth(int)>
		mPopup.setHeight(k);
	//  183  345:aload_0         
	//  184  346:getfield        #258 <Field PopupWindow mPopup>
	//  185  349:iload_2         
	//  186  350:invokevirtual   #724 <Method void PopupWindow.setHeight(int)>
		setPopupClipToScreenEnabled(true);
	//  187  353:aload_0         
	//  188  354:iconst_1        
	//  189  355:invokespecial   #733 <Method void setPopupClipToScreenEnabled(boolean)>
		Object obj = ((Object) (mPopup));
	//  190  358:aload_0         
	//  191  359:getfield        #258 <Field PopupWindow mPopup>
	//  192  362:astore          8
		if(!mForceIgnoreOutsideTouch && !mDropDownAlwaysVisible)
	//* 193  364:aload_0         
	//* 194  365:getfield        #186 <Field boolean mForceIgnoreOutsideTouch>
	//* 195  368:ifne            384
	//* 196  371:aload_0         
	//* 197  372:getfield        #184 <Field boolean mDropDownAlwaysVisible>
	//* 198  375:ifne            384
			flag = true;
	//  199  378:iconst_1        
	//  200  379:istore          5
		else
	//* 201  381:goto            387
			flag = false;
	//  202  384:iconst_0        
	//  203  385:istore          5
		((PopupWindow) (obj)).setOutsideTouchable(flag);
	//  204  387:aload           8
	//  205  389:iload           5
	//  206  391:invokevirtual   #727 <Method void PopupWindow.setOutsideTouchable(boolean)>
		mPopup.setTouchInterceptor(((android.view.View.OnTouchListener) (mTouchInterceptor)));
	//  207  394:aload_0         
	//  208  395:getfield        #258 <Field PopupWindow mPopup>
	//  209  398:aload_0         
	//  210  399:getfield        #199 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
	//  211  402:invokevirtual   #737 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
		if(mOverlapAnchorSet)
	//* 212  405:aload_0         
	//* 213  406:getfield        #685 <Field boolean mOverlapAnchorSet>
	//* 214  409:ifeq            423
			PopupWindowCompat.setOverlapAnchor(mPopup, mOverlapAnchor);
	//  215  412:aload_0         
	//  216  413:getfield        #258 <Field PopupWindow mPopup>
	//  217  416:aload_0         
	//  218  417:getfield        #687 <Field boolean mOverlapAnchor>
	//  219  420:invokestatic    #740 <Method void PopupWindowCompat.setOverlapAnchor(PopupWindow, boolean)>
		obj = ((Object) (sSetEpicenterBoundsMethod));
	//  220  423:getstatic       #148 <Field Method sSetEpicenterBoundsMethod>
	//  221  426:astore          8
		if(obj != null)
	//* 222  428:aload           8
	//* 223  430:ifnull          470
			try
			{
				((Method) (obj)).invoke(((Object) (mPopup)), new Object[] {
					mEpicenterBounds
				});
	//  224  433:aload           8
	//  225  435:aload_0         
	//  226  436:getfield        #258 <Field PopupWindow mPopup>
	//  227  439:iconst_1        
	//  228  440:anewarray       Object[]
	//  229  443:dup             
	//  230  444:iconst_0        
	//  231  445:aload_0         
	//  232  446:getfield        #664 <Field Rect mEpicenterBounds>
	//  233  449:aastore         
	//  234  450:invokevirtual   #460 <Method Object Method.invoke(Object, Object[])>
	//  235  453:pop             
			}
	//* 236  454:goto            470
			catch(Exception exception)
	//* 237  457:astore          8
			{
				Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", ((Throwable) (exception)));
	//  238  459:ldc1            #46  <String "ListPopupWindow">
	//  239  461:ldc2            #742 <String "Could not invoke setEpicenterBounds on PopupWindow">
	//  240  464:aload           8
	//  241  466:invokestatic    #745 <Method int Log.e(String, String, Throwable)>
	//  242  469:pop             
			}
		PopupWindowCompat.showAsDropDown(mPopup, getAnchorView(), mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
	//  243  470:aload_0         
	//  244  471:getfield        #258 <Field PopupWindow mPopup>
	//  245  474:aload_0         
	//  246  475:invokevirtual   #410 <Method View getAnchorView()>
	//  247  478:aload_0         
	//  248  479:getfield        #243 <Field int mDropDownHorizontalOffset>
	//  249  482:aload_0         
	//  250  483:getfield        #248 <Field int mDropDownVerticalOffset>
	//  251  486:aload_0         
	//  252  487:getfield        #182 <Field int mDropDownGravity>
	//  253  490:invokestatic    #749 <Method void PopupWindowCompat.showAsDropDown(PopupWindow, View, int, int, int)>
		mDropDownList.setSelection(-1);
	//  254  493:aload_0         
	//  255  494:getfield        #266 <Field DropDownListView mDropDownList>
	//  256  497:iconst_m1       
	//  257  498:invokevirtual   #692 <Method void DropDownListView.setSelection(int)>
		if(!mModal || mDropDownList.isInTouchMode())
	//* 258  501:aload_0         
	//* 259  502:getfield        #271 <Field boolean mModal>
	//* 260  505:ifeq            518
	//* 261  508:aload_0         
	//* 262  509:getfield        #266 <Field DropDownListView mDropDownList>
	//* 263  512:invokevirtual   #752 <Method boolean DropDownListView.isInTouchMode()>
	//* 264  515:ifeq            522
			clearListSelection();
	//  265  518:aload_0         
	//  266  519:invokevirtual   #570 <Method void clearListSelection()>
		if(!mModal)
	//* 267  522:aload_0         
	//* 268  523:getfield        #271 <Field boolean mModal>
	//* 269  526:ifne            541
			mHandler.post(((Runnable) (mHideSelector)));
	//  270  529:aload_0         
	//  271  530:getfield        #223 <Field Handler mHandler>
	//  272  533:aload_0         
	//  273  534:getfield        #205 <Field ListPopupWindow$ListSelectorHider mHideSelector>
	//  274  537:invokevirtual   #638 <Method boolean Handler.post(Runnable)>
	//  275  540:pop             
	//  276  541:return          
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
		NoSuchMethodException nosuchmethodexception;
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
	//*  10   20:goto            31
	//*  11   23:ldc1            #46  <String "ListPopupWindow">
	//*  12   25:ldc1            #125 <String "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.">
	//*  13   27:invokestatic    #131 <Method int Log.i(String, String)>
	//*  14   30:pop             
	//*  15   31:ldc1            #107 <Class PopupWindow>
	//*  16   33:ldc1            #133 <String "getMaxAvailableHeight">
	//*  17   35:iconst_3        
	//*  18   36:anewarray       Class[]
	//*  19   39:dup             
	//*  20   40:iconst_0        
	//*  21   41:ldc1            #135 <Class View>
	//*  22   43:aastore         
	//*  23   44:dup             
	//*  24   45:iconst_1        
	//*  25   46:getstatic       #138 <Field Class Integer.TYPE>
	//*  26   49:aastore         
	//*  27   50:dup             
	//*  28   51:iconst_2        
	//*  29   52:getstatic       #117 <Field Class Boolean.TYPE>
	//*  30   55:aastore         
	//*  31   56:invokevirtual   #121 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  32   59:putstatic       #140 <Field Method sGetMaxAvailableHeightMethod>
	//*  33   62:goto            73
	//*  34   65:ldc1            #46  <String "ListPopupWindow">
	//*  35   67:ldc1            #142 <String "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.">
	//*  36   69:invokestatic    #131 <Method int Log.i(String, String)>
	//*  37   72:pop             
	//*  38   73:ldc1            #107 <Class PopupWindow>
	//*  39   75:ldc1            #144 <String "setEpicenterBounds">
	//*  40   77:iconst_1        
	//*  41   78:anewarray       Class[]
	//*  42   81:dup             
	//*  43   82:iconst_0        
	//*  44   83:ldc1            #146 <Class Rect>
	//*  45   85:aastore         
	//*  46   86:invokevirtual   #121 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  47   89:putstatic       #148 <Field Method sSetEpicenterBoundsMethod>
	//*  48   92:return          
	//*  49   93:ldc1            #46  <String "ListPopupWindow">
	//*  50   95:ldc1            #150 <String "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.">
	//*  51   97:invokestatic    #131 <Method int Log.i(String, String)>
	//*  52  100:pop             
	//*  53  101:return          
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
		}
		try
		{
			sGetMaxAvailableHeightMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getMaxAvailableHeight", new Class[] {
				android/view/View, Integer.TYPE, Boolean.TYPE
			});
		}
	//*  54  102:astore_0        
	//*  55  103:goto            23
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
		}
		try
		{
			sSetEpicenterBoundsMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setEpicenterBounds", new Class[] {
				android/graphics/Rect
			});
			return;
		}
	//*  56  106:astore_0        
	//*  57  107:goto            65
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
		}
	//*  58  110:astore_0        
	//*  59  111:goto            93
	}
}
