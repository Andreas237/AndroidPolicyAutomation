// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, AppCompatSpinner, ViewUtils

class AppCompatSpinner$DropdownPopup extends ListPopupWindow
{

	void computeContentWidth()
	{
		Drawable drawable = getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method Drawable getBackground()>
	//    2    4:astore          8
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		if(drawable != null)
	//*   5    8:aload           8
	//*   6   10:ifnull          65
		{
			drawable.getPadding(mTempRect);
	//    7   13:aload           8
	//    8   15:aload_0         
	//    9   16:getfield        #16  <Field AppCompatSpinner this$0>
	//   10   19:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   11   22:invokevirtual   #69  <Method boolean Drawable.getPadding(Rect)>
	//   12   25:pop             
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
	//*  13   26:aload_0         
	//*  14   27:getfield        #16  <Field AppCompatSpinner this$0>
	//*  15   30:invokestatic    #75  <Method boolean ViewUtils.isLayoutRtl(View)>
	//*  16   33:ifeq            50
				i = mTempRect.right;
	//   17   36:aload_0         
	//   18   37:getfield        #16  <Field AppCompatSpinner this$0>
	//   19   40:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   20   43:getfield        #79  <Field int Rect.right>
	//   21   46:istore_1        
			else
	//*  22   47:goto            62
				i = -mTempRect.left;
	//   23   50:aload_0         
	//   24   51:getfield        #16  <Field AppCompatSpinner this$0>
	//   25   54:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   26   57:getfield        #82  <Field int Rect.left>
	//   27   60:ineg            
	//   28   61:istore_1        
		} else
	//*  29   62:goto            91
		{
			Rect rect = mTempRect;
	//   30   65:aload_0         
	//   31   66:getfield        #16  <Field AppCompatSpinner this$0>
	//   32   69:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   33   72:astore          8
			mTempRect.right = 0;
	//   34   74:aload_0         
	//   35   75:getfield        #16  <Field AppCompatSpinner this$0>
	//   36   78:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   37   81:iconst_0        
	//   38   82:putfield        #79  <Field int Rect.right>
			rect.left = 0;
	//   39   85:aload           8
	//   40   87:iconst_0        
	//   41   88:putfield        #82  <Field int Rect.left>
		}
		int i1 = getPaddingLeft();
	//   42   91:aload_0         
	//   43   92:getfield        #16  <Field AppCompatSpinner this$0>
	//   44   95:invokevirtual   #86  <Method int AppCompatSpinner.getPaddingLeft()>
	//   45   98:istore          5
		int j1 = getPaddingRight();
	//   46  100:aload_0         
	//   47  101:getfield        #16  <Field AppCompatSpinner this$0>
	//   48  104:invokevirtual   #89  <Method int AppCompatSpinner.getPaddingRight()>
	//   49  107:istore          6
		int k1 = getWidth();
	//   50  109:aload_0         
	//   51  110:getfield        #16  <Field AppCompatSpinner this$0>
	//   52  113:invokevirtual   #92  <Method int AppCompatSpinner.getWidth()>
	//   53  116:istore          7
		if(mDropDownWidth == -2)
	//*  54  118:aload_0         
	//*  55  119:getfield        #16  <Field AppCompatSpinner this$0>
	//*  56  122:getfield        #95  <Field int AppCompatSpinner.mDropDownWidth>
	//*  57  125:bipush          -2
	//*  58  127:icmpne          219
		{
			int k = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
	//   59  130:aload_0         
	//   60  131:getfield        #16  <Field AppCompatSpinner this$0>
	//   61  134:aload_0         
	//   62  135:getfield        #97  <Field ListAdapter mAdapter>
	//   63  138:checkcast       #99  <Class SpinnerAdapter>
	//   64  141:aload_0         
	//   65  142:invokevirtual   #58  <Method Drawable getBackground()>
	//   66  145:invokevirtual   #103 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
	//   67  148:istore_3        
			int l = getContext().getResources().getDisplayMetrics().widthPixels - mTempRect.left - mTempRect.right;
	//   68  149:aload_0         
	//   69  150:getfield        #16  <Field AppCompatSpinner this$0>
	//   70  153:invokevirtual   #107 <Method Context AppCompatSpinner.getContext()>
	//   71  156:invokevirtual   #113 <Method Resources Context.getResources()>
	//   72  159:invokevirtual   #119 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   73  162:getfield        #124 <Field int DisplayMetrics.widthPixels>
	//   74  165:aload_0         
	//   75  166:getfield        #16  <Field AppCompatSpinner this$0>
	//   76  169:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   77  172:getfield        #82  <Field int Rect.left>
	//   78  175:isub            
	//   79  176:aload_0         
	//   80  177:getfield        #16  <Field AppCompatSpinner this$0>
	//   81  180:getfield        #63  <Field Rect AppCompatSpinner.mTempRect>
	//   82  183:getfield        #79  <Field int Rect.right>
	//   83  186:isub            
	//   84  187:istore          4
			int j = k;
	//   85  189:iload_3         
	//   86  190:istore_2        
			if(k > l)
	//*  87  191:iload_3         
	//*  88  192:iload           4
	//*  89  194:icmple          200
				j = l;
	//   90  197:iload           4
	//   91  199:istore_2        
			setContentWidth(Math.max(j, k1 - i1 - j1));
	//   92  200:aload_0         
	//   93  201:iload_2         
	//   94  202:iload           7
	//   95  204:iload           5
	//   96  206:isub            
	//   97  207:iload           6
	//   98  209:isub            
	//   99  210:invokestatic    #130 <Method int Math.max(int, int)>
	//  100  213:invokevirtual   #133 <Method void setContentWidth(int)>
		} else
	//* 101  216:goto            256
		if(mDropDownWidth == -1)
	//* 102  219:aload_0         
	//* 103  220:getfield        #16  <Field AppCompatSpinner this$0>
	//* 104  223:getfield        #95  <Field int AppCompatSpinner.mDropDownWidth>
	//* 105  226:iconst_m1       
	//* 106  227:icmpne          245
			setContentWidth(k1 - i1 - j1);
	//  107  230:aload_0         
	//  108  231:iload           7
	//  109  233:iload           5
	//  110  235:isub            
	//  111  236:iload           6
	//  112  238:isub            
	//  113  239:invokevirtual   #133 <Method void setContentWidth(int)>
		else
	//* 114  242:goto            256
			setContentWidth(mDropDownWidth);
	//  115  245:aload_0         
	//  116  246:aload_0         
	//  117  247:getfield        #16  <Field AppCompatSpinner this$0>
	//  118  250:getfield        #95  <Field int AppCompatSpinner.mDropDownWidth>
	//  119  253:invokevirtual   #133 <Method void setContentWidth(int)>
		if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
	//* 120  256:aload_0         
	//* 121  257:getfield        #16  <Field AppCompatSpinner this$0>
	//* 122  260:invokestatic    #75  <Method boolean ViewUtils.isLayoutRtl(View)>
	//* 123  263:ifeq            282
			i += k1 - j1 - getWidth();
	//  124  266:iload_1         
	//  125  267:iload           7
	//  126  269:iload           6
	//  127  271:isub            
	//  128  272:aload_0         
	//  129  273:invokevirtual   #134 <Method int getWidth()>
	//  130  276:isub            
	//  131  277:iadd            
	//  132  278:istore_1        
		else
	//* 133  279:goto            287
			i += i1;
	//  134  282:iload_1         
	//  135  283:iload           5
	//  136  285:iadd            
	//  137  286:istore_1        
		setHorizontalOffset(i);
	//  138  287:aload_0         
	//  139  288:iload_1         
	//  140  289:invokevirtual   #137 <Method void setHorizontalOffset(int)>
	//  141  292:return          
	}

	public CharSequence getHintText()
	{
		return mHintText;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field CharSequence mHintText>
	//    2    4:areturn         
	}

	boolean isVisibleToUser(View view)
	{
		return ac.A(view) && view.getGlobalVisibleRect(mVisibleRect);
	//    0    0:aload_1         
	//    1    1:invokestatic    #147 <Method boolean ac.A(View)>
	//    2    4:ifeq            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field Rect mVisibleRect>
	//    6   12:invokevirtual   #152 <Method boolean View.getGlobalVisibleRect(Rect)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void setAdapter(ListAdapter listadapter)
	{
		super.setAdapter(listadapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void ListPopupWindow.setAdapter(ListAdapter)>
		mAdapter = listadapter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #97  <Field ListAdapter mAdapter>
	//    6   10:return          
	}

	public void setPromptText(CharSequence charsequence)
	{
		mHintText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field CharSequence mHintText>
	//    3    5:return          
	}

	public void show()
	{
		boolean flag = isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method boolean isShowing()>
	//    2    4:istore_1        
		computeContentWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #164 <Method void computeContentWidth()>
		setInputMethodMode(2);
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:invokevirtual   #167 <Method void setInputMethodMode(int)>
		super.show();
	//    8   14:aload_0         
	//    9   15:invokespecial   #53  <Method void ListPopupWindow.show()>
		getListView().setChoiceMode(1);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #171 <Method ListView getListView()>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #176 <Method void ListView.setChoiceMode(int)>
		setSelection(getSelectedItemPosition());
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #16  <Field AppCompatSpinner this$0>
	//   17   31:invokevirtual   #179 <Method int AppCompatSpinner.getSelectedItemPosition()>
	//   18   34:invokevirtual   #182 <Method void setSelection(int)>
		if(flag)
	//*  19   37:iload_1         
	//*  20   38:ifeq            42
			return;
	//   21   41:return          
		ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//   22   42:aload_0         
	//   23   43:getfield        #16  <Field AppCompatSpinner this$0>
	//   24   46:invokevirtual   #186 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
	//   25   49:astore_2        
		if(viewtreeobserver != null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          81
		{
			class _cls2
				implements android.view.ViewTreeObserver.OnGlobalLayoutListener
			{

				public void onGlobalLayout()
				{
					AppCompatSpinner.DropdownPopup dropdownpopup = AppCompatSpinner.DropdownPopup.this;
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
				//    2    4:astore_1        
					if(!dropdownpopup.isVisibleToUser(((View) (dropdownpopup.this$0))))
				//*   3    5:aload_1         
				//*   4    6:aload_1         
				//*   5    7:getfield        #23  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
				//*   6   10:invokevirtual   #27  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(View)>
				//*   7   13:ifne            24
					{
						dismiss();
				//    8   16:aload_0         
				//    9   17:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
				//   10   20:invokevirtual   #30  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
						return;
				//   11   23:return          
					} else
					{
						computeContentWidth();
				//   12   24:aload_0         
				//   13   25:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
				//   14   28:invokevirtual   #33  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
						show();
				//   15   31:aload_0         
				//   16   32:getfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
				//   17   35:invokestatic    #36  <Method void AppCompatSpinner$DropdownPopup.access$001(AppCompatSpinner$DropdownPopup)>
						return;
				//   18   38:return          
					}
				}

				final AppCompatSpinner.DropdownPopup this$1;

			_cls2()
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field AppCompatSpinner$DropdownPopup this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Object()>
			//    5    9:return          
			}
			}

			final _cls2 layoutListener = new _cls2();
	//   28   54:new             #188 <Class AppCompatSpinner$DropdownPopup$2>
	//   29   57:dup             
	//   30   58:aload_0         
	//   31   59:invokespecial   #190 <Method void AppCompatSpinner$DropdownPopup$2(AppCompatSpinner$DropdownPopup)>
	//   32   62:astore_3        
			viewtreeobserver.addOnGlobalLayoutListener(((android.view.Listener) (layoutListener)));
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #196 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			class _cls3
				implements android.widget.PopupWindow.OnDismissListener
			{

				public void onDismiss()
				{
					ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
				//    0    0:aload_0         
				//    1    1:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
				//    2    4:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
				//    3    7:invokevirtual   #33  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
				//    4   10:astore_1        
					if(viewtreeobserver1 != null)
				//*   5   11:aload_1         
				//*   6   12:ifnull          23
						viewtreeobserver1.removeGlobalOnLayoutListener(layoutListener);
				//    7   15:aload_1         
				//    8   16:aload_0         
				//    9   17:getfield        #16  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
				//   10   20:invokevirtual   #39  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				//   11   23:return          
				}

				final AppCompatSpinner.DropdownPopup this$1;
				final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

			_cls3()
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
				layoutListener = ongloballayoutlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #16  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void Object()>
			//    8   14:return          
			}
			}

			setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (new _cls3())));
	//   36   68:aload_0         
	//   37   69:new             #198 <Class AppCompatSpinner$DropdownPopup$3>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:invokespecial   #201 <Method void AppCompatSpinner$DropdownPopup$3(AppCompatSpinner$DropdownPopup, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   42   78:invokevirtual   #205 <Method void setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		}
	//   43   81:return          
	}

	ListAdapter mAdapter;
	private CharSequence mHintText;
	private final Rect mVisibleRect = new Rect();
	final AppCompatSpinner this$0;


/*
	static void access$001(AppCompatSpinner$DropdownPopup appcompatspinner$dropdownpopup)
	{
		((ListPopupWindow) (appcompatspinner$dropdownpopup)).super.show();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void ListPopupWindow.show()>
		return;
	//    2    4:return          
	}

*/

	public AppCompatSpinner$DropdownPopup(Context context, AttributeSet attributeset, int i)
	{
		this.this$0 = AppCompatSpinner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppCompatSpinner this$0>
		super(context, attributeset, i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #19  <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    8   13:aload_0         
	//    9   14:new             #21  <Class Rect>
	//   10   17:dup             
	//   11   18:invokespecial   #24  <Method void Rect()>
	//   12   21:putfield        #26  <Field Rect mVisibleRect>
		setAnchorView(((View) (AppCompatSpinner.this)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #30  <Method void setAnchorView(View)>
		setModal(true);
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:invokevirtual   #34  <Method void setModal(boolean)>
		setPromptPosition(0);
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #38  <Method void setPromptPosition(int)>
		class _cls1
			implements android.widget.AdapterView.OnItemClickListener
		{

			public void onItemClick(AdapterView adapterview, View view, int j, long l)
			{
				setSelection(j);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
			//    2    4:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//    3    7:iload_3         
			//    4    8:invokevirtual   #33  <Method void AppCompatSpinner.setSelection(int)>
				if(getOnItemClickListener() != null)
			//*   5   11:aload_0         
			//*   6   12:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
			//*   7   15:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//*   8   18:invokevirtual   #37  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
			//*   9   21:ifnull          50
					performItemClick(view, j, mAdapter.getItemId(j));
			//   10   24:aload_0         
			//   11   25:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
			//   12   28:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//   13   31:aload_2         
			//   14   32:iload_3         
			//   15   33:aload_0         
			//   16   34:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
			//   17   37:getfield        #41  <Field ListAdapter AppCompatSpinner$DropdownPopup.mAdapter>
			//   18   40:iload_3         
			//   19   41:invokeinterface #47  <Method long ListAdapter.getItemId(int)>
			//   20   46:invokevirtual   #51  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
			//   21   49:pop             
				dismiss();
			//   22   50:aload_0         
			//   23   51:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
			//   24   54:invokevirtual   #54  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
			//   25   57:return          
			}

			final AppCompatSpinner.DropdownPopup this$1;
			final AppCompatSpinner val$this$0;

			_cls1()
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
				this$0 = appcompatspinner;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #16  <Field AppCompatSpinner val$this$0>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void Object()>
			//    8   14:return          
			}
		}

		setOnItemClickListener(((android.widget.) (new _cls1())));
	//   22   39:aload_0         
	//   23   40:new             #40  <Class AppCompatSpinner$DropdownPopup$1>
	//   24   43:dup             
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokespecial   #43  <Method void AppCompatSpinner$DropdownPopup$1(AppCompatSpinner$DropdownPopup, AppCompatSpinner)>
	//   28   49:invokevirtual   #47  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   29   52:return          
	}
}
