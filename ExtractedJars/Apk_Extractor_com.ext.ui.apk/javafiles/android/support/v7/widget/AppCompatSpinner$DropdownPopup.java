// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, AppCompatSpinner, ViewUtils

private class AppCompatSpinner$DropdownPopup extends ListPopupWindow
{

	void computeContentWidth()
	{
		Drawable drawable = getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Drawable getBackground()>
	//    2    4:astore          7
		int i;
		int l;
		int i1;
		int j1;
		if(drawable != null)
	//*   3    6:aload           7
	//*   4    8:ifnull          209
		{
			drawable.getPadding(AppCompatSpinner.access$100(AppCompatSpinner.this));
	//    5   11:aload           7
	//    6   13:aload_0         
	//    7   14:getfield        #25  <Field AppCompatSpinner this$0>
	//    8   17:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//    9   20:invokevirtual   #75  <Method boolean Drawable.getPadding(Rect)>
	//   10   23:pop             
			int j;
			int k;
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
	//*  11   24:aload_0         
	//*  12   25:getfield        #25  <Field AppCompatSpinner this$0>
	//*  13   28:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
	//*  14   31:ifeq            194
				i = AppCompatSpinner.access$100(AppCompatSpinner.this).right;
	//   15   34:aload_0         
	//   16   35:getfield        #25  <Field AppCompatSpinner this$0>
	//   17   38:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//   18   41:getfield        #85  <Field int Rect.right>
	//   19   44:istore_1        
			else
	//*  20   45:aload_0         
	//*  21   46:getfield        #25  <Field AppCompatSpinner this$0>
	//*  22   49:invokevirtual   #89  <Method int AppCompatSpinner.getPaddingLeft()>
	//*  23   52:istore          4
	//*  24   54:aload_0         
	//*  25   55:getfield        #25  <Field AppCompatSpinner this$0>
	//*  26   58:invokevirtual   #92  <Method int AppCompatSpinner.getPaddingRight()>
	//*  27   61:istore          5
	//*  28   63:aload_0         
	//*  29   64:getfield        #25  <Field AppCompatSpinner this$0>
	//*  30   67:invokevirtual   #95  <Method int AppCompatSpinner.getWidth()>
	//*  31   70:istore          6
	//*  32   72:aload_0         
	//*  33   73:getfield        #25  <Field AppCompatSpinner this$0>
	//*  34   76:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//*  35   79:bipush          -2
	//*  36   81:icmpne          240
	//*  37   84:aload_0         
	//*  38   85:getfield        #25  <Field AppCompatSpinner this$0>
	//*  39   88:aload_0         
	//*  40   89:getfield        #101 <Field ListAdapter mAdapter>
	//*  41   92:checkcast       #103 <Class SpinnerAdapter>
	//*  42   95:aload_0         
	//*  43   96:invokevirtual   #65  <Method Drawable getBackground()>
	//*  44   99:invokevirtual   #107 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
	//*  45  102:istore_2        
	//*  46  103:aload_0         
	//*  47  104:getfield        #25  <Field AppCompatSpinner this$0>
	//*  48  107:invokevirtual   #111 <Method Context AppCompatSpinner.getContext()>
	//*  49  110:invokevirtual   #117 <Method Resources Context.getResources()>
	//*  50  113:invokevirtual   #123 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//*  51  116:getfield        #128 <Field int DisplayMetrics.widthPixels>
	//*  52  119:aload_0         
	//*  53  120:getfield        #25  <Field AppCompatSpinner this$0>
	//*  54  123:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//*  55  126:getfield        #131 <Field int Rect.left>
	//*  56  129:isub            
	//*  57  130:aload_0         
	//*  58  131:getfield        #25  <Field AppCompatSpinner this$0>
	//*  59  134:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//*  60  137:getfield        #85  <Field int Rect.right>
	//*  61  140:isub            
	//*  62  141:istore_3        
	//*  63  142:iload_2         
	//*  64  143:iload_3         
	//*  65  144:icmple          288
	//*  66  147:iload_3         
	//*  67  148:istore_2        
	//*  68  149:aload_0         
	//*  69  150:iload_2         
	//*  70  151:iload           6
	//*  71  153:iload           4
	//*  72  155:isub            
	//*  73  156:iload           5
	//*  74  158:isub            
	//*  75  159:invokestatic    #137 <Method int Math.max(int, int)>
	//*  76  162:invokevirtual   #140 <Method void setContentWidth(int)>
	//*  77  165:aload_0         
	//*  78  166:getfield        #25  <Field AppCompatSpinner this$0>
	//*  79  169:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
	//*  80  172:ifeq            280
	//*  81  175:iload           6
	//*  82  177:iload           5
	//*  83  179:isub            
	//*  84  180:aload_0         
	//*  85  181:invokevirtual   #141 <Method int getWidth()>
	//*  86  184:isub            
	//*  87  185:iload_1         
	//*  88  186:iadd            
	//*  89  187:istore_1        
	//*  90  188:aload_0         
	//*  91  189:iload_1         
	//*  92  190:invokevirtual   #144 <Method void setHorizontalOffset(int)>
	//*  93  193:return          
				i = -AppCompatSpinner.access$100(AppCompatSpinner.this).left;
	//   94  194:aload_0         
	//   95  195:getfield        #25  <Field AppCompatSpinner this$0>
	//   96  198:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//   97  201:getfield        #131 <Field int Rect.left>
	//   98  204:ineg            
	//   99  205:istore_1        
		} else
	//* 100  206:goto            45
		{
			Rect rect = AppCompatSpinner.access$100(AppCompatSpinner.this);
	//  101  209:aload_0         
	//  102  210:getfield        #25  <Field AppCompatSpinner this$0>
	//  103  213:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//  104  216:astore          7
			AppCompatSpinner.access$100(AppCompatSpinner.this).right = 0;
	//  105  218:aload_0         
	//  106  219:getfield        #25  <Field AppCompatSpinner this$0>
	//  107  222:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//  108  225:iconst_0        
	//  109  226:putfield        #85  <Field int Rect.right>
			rect.left = 0;
	//  110  229:aload           7
	//  111  231:iconst_0        
	//  112  232:putfield        #131 <Field int Rect.left>
			i = 0;
	//  113  235:iconst_0        
	//  114  236:istore_1        
		}
		l = getPaddingLeft();
		i1 = getPaddingRight();
		j1 = getWidth();
		if(AppCompatSpinner.access$200(AppCompatSpinner.this) == -2)
		{
			j = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
			k = getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.access$100(AppCompatSpinner.this).left - AppCompatSpinner.access$100(AppCompatSpinner.this).right;
			if(j > k)
				j = k;
			setContentWidth(Math.max(j, j1 - l - i1));
		} else
	//* 115  237:goto            45
		if(AppCompatSpinner.access$200(AppCompatSpinner.this) == -1)
	//* 116  240:aload_0         
	//* 117  241:getfield        #25  <Field AppCompatSpinner this$0>
	//* 118  244:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//* 119  247:iconst_m1       
	//* 120  248:icmpne          266
			setContentWidth(j1 - l - i1);
	//  121  251:aload_0         
	//  122  252:iload           6
	//  123  254:iload           4
	//  124  256:isub            
	//  125  257:iload           5
	//  126  259:isub            
	//  127  260:invokevirtual   #140 <Method void setContentWidth(int)>
		else
	//* 128  263:goto            165
			setContentWidth(AppCompatSpinner.access$200(AppCompatSpinner.this));
	//  129  266:aload_0         
	//  130  267:aload_0         
	//  131  268:getfield        #25  <Field AppCompatSpinner this$0>
	//  132  271:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//  133  274:invokevirtual   #140 <Method void setContentWidth(int)>
		if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
			i = (j1 - i1 - getWidth()) + i;
		else
	//* 134  277:goto            165
			i += l;
	//  135  280:iload_1         
	//  136  281:iload           4
	//  137  283:iadd            
	//  138  284:istore_1        
		setHorizontalOffset(i);
	//* 139  285:goto            188
	//* 140  288:goto            149
	}

	public CharSequence getHintText()
	{
		return mHintText;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field CharSequence mHintText>
	//    2    4:areturn         
	}

	boolean isVisibleToUser(View view)
	{
		return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(mVisibleRect);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//    2    4:ifeq            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Rect mVisibleRect>
	//    6   12:invokevirtual   #159 <Method boolean View.getGlobalVisibleRect(Rect)>
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
	//    2    2:invokespecial   #163 <Method void ListPopupWindow.setAdapter(ListAdapter)>
		mAdapter = listadapter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #101 <Field ListAdapter mAdapter>
	//    6   10:return          
	}

	public void setPromptText(CharSequence charsequence)
	{
		mHintText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field CharSequence mHintText>
	//    3    5:return          
	}

	public void show()
	{
		boolean flag = isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method boolean isShowing()>
	//    2    4:istore_1        
		computeContentWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #171 <Method void computeContentWidth()>
		setInputMethodMode(2);
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:invokevirtual   #174 <Method void setInputMethodMode(int)>
		super.show();
	//    8   14:aload_0         
	//    9   15:invokespecial   #60  <Method void ListPopupWindow.show()>
		getListView().setChoiceMode(1);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #178 <Method ListView getListView()>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #183 <Method void ListView.setChoiceMode(int)>
		setSelection(getSelectedItemPosition());
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #25  <Field AppCompatSpinner this$0>
	//   17   31:invokevirtual   #186 <Method int AppCompatSpinner.getSelectedItemPosition()>
	//   18   34:invokevirtual   #189 <Method void setSelection(int)>
		ViewTreeObserver viewtreeobserver;
		if(!flag)
	//*  19   37:iload_1         
	//*  20   38:ifeq            42
	//*  21   41:return          
	//*  22   42:aload_0         
	//*  23   43:getfield        #25  <Field AppCompatSpinner this$0>
	//*  24   46:invokevirtual   #193 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
	//*  25   49:astore_2        
			if((viewtreeobserver = getViewTreeObserver()) != null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          41
			{
				final android.view.Listener layoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

					public void onGlobalLayout()
					{
						if(!isVisibleToUser(((View) (this$0))))
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
					//*   2    4:aload_0         
					//*   3    5:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
					//*   4    8:getfield        #28  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
					//*   5   11:invokevirtual   #32  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(View)>
					//*   6   14:ifne            25
						{
							dismiss();
					//    7   17:aload_0         
					//    8   18:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
					//    9   21:invokevirtual   #35  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
							return;
					//   10   24:return          
						} else
						{
							computeContentWidth();
					//   11   25:aload_0         
					//   12   26:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
					//   13   29:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
							show();
					//   14   32:aload_0         
					//   15   33:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
					//   16   36:invokestatic    #41  <Method void AppCompatSpinner$DropdownPopup.access$301(AppCompatSpinner$DropdownPopup)>
							return;
					//   17   39:return          
						}
					}

					final AppCompatSpinner.DropdownPopup this$1;

			
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   28   54:new             #11  <Class AppCompatSpinner$DropdownPopup$2>
	//   29   57:dup             
	//   30   58:aload_0         
	//   31   59:invokespecial   #195 <Method void AppCompatSpinner$DropdownPopup$2(AppCompatSpinner$DropdownPopup)>
	//   32   62:astore_3        
				viewtreeobserver.addOnGlobalLayoutListener(layoutListener);
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #201 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

					public void onDismiss()
					{
						ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
					//    2    4:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
					//    3    7:invokevirtual   #36  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
					//    4   10:astore_1        
						if(viewtreeobserver1 != null)
					//*   5   11:aload_1         
					//*   6   12:ifnull          23
							viewtreeobserver1.removeGlobalOnLayoutListener(layoutListener);
					//    7   15:aload_1         
					//    8   16:aload_0         
					//    9   17:getfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
					//   10   20:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					//   11   23:return          
					}

					final AppCompatSpinner.DropdownPopup this$1;
					final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

			
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
				layoutListener = ongloballayoutlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   36   68:aload_0         
	//   37   69:new             #13  <Class AppCompatSpinner$DropdownPopup$3>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:invokespecial   #204 <Method void AppCompatSpinner$DropdownPopup$3(AppCompatSpinner$DropdownPopup, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   42   78:invokevirtual   #208 <Method void setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
				return;
	//   43   81:return          
			}
	}

	ListAdapter mAdapter;
	private CharSequence mHintText;
	private final Rect mVisibleRect = new Rect();
	final AppCompatSpinner this$0;


/*
	static void access$301(AppCompatSpinner$DropdownPopup appcompatspinner$dropdownpopup)
	{
		((ListPopupWindow) (appcompatspinner$dropdownpopup)).super.show();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void ListPopupWindow.show()>
		return;
	//    2    4:return          
	}

*/

	public AppCompatSpinner$DropdownPopup(Context context, AttributeSet attributeset, int i)
	{
		this.this$0 = AppCompatSpinner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field AppCompatSpinner this$0>
		super(context, attributeset, i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #28  <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    8   13:aload_0         
	//    9   14:new             #30  <Class Rect>
	//   10   17:dup             
	//   11   18:invokespecial   #33  <Method void Rect()>
	//   12   21:putfield        #35  <Field Rect mVisibleRect>
		setAnchorView(((View) (AppCompatSpinner.this)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #39  <Method void setAnchorView(View)>
		setModal(true);
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:invokevirtual   #43  <Method void setModal(boolean)>
		setPromptPosition(0);
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #47  <Method void setPromptPosition(int)>
		setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int j, long l)
			{
				setSelection(j);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
			//    2    4:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//    3    7:iload_3         
			//    4    8:invokevirtual   #36  <Method void AppCompatSpinner.setSelection(int)>
				if(getOnItemClickListener() != null)
			//*   5   11:aload_0         
			//*   6   12:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
			//*   7   15:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//*   8   18:invokevirtual   #40  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
			//*   9   21:ifnull          50
					performItemClick(view, j, mAdapter.getItemId(j));
			//   10   24:aload_0         
			//   11   25:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
			//   12   28:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
			//   13   31:aload_2         
			//   14   32:iload_3         
			//   15   33:aload_0         
			//   16   34:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
			//   17   37:getfield        #44  <Field ListAdapter AppCompatSpinner$DropdownPopup.mAdapter>
			//   18   40:iload_3         
			//   19   41:invokeinterface #50  <Method long ListAdapter.getItemId(int)>
			//   20   46:invokevirtual   #54  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
			//   21   49:pop             
				dismiss();
			//   22   50:aload_0         
			//   23   51:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
			//   24   54:invokevirtual   #57  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
			//   25   57:return          
			}

			final AppCompatSpinner.DropdownPopup this$1;
			final AppCompatSpinner val$this$0;

			
			{
				this$1 = AppCompatSpinner.DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
				this$0 = appcompatspinner;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AppCompatSpinner val$this$0>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   22   39:aload_0         
	//   23   40:new             #9   <Class AppCompatSpinner$DropdownPopup$1>
	//   24   43:dup             
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokespecial   #50  <Method void AppCompatSpinner$DropdownPopup$1(AppCompatSpinner$DropdownPopup, AppCompatSpinner)>
	//   28   49:invokevirtual   #54  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   29   52:return          
	}
}
