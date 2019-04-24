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
	//    2    4:astore          8
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int i1;
		int j1;
		int k1;
		if(drawable != null)
	//*   5    8:aload           8
	//*   6   10:ifnull          216
		{
			drawable.getPadding(AppCompatSpinner.access$100(AppCompatSpinner.this));
	//    7   13:aload           8
	//    8   15:aload_0         
	//    9   16:getfield        #25  <Field AppCompatSpinner this$0>
	//   10   19:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//   11   22:invokevirtual   #75  <Method boolean Drawable.getPadding(Rect)>
	//   12   25:pop             
			int j;
			int k;
			int l;
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
	//*  13   26:aload_0         
	//*  14   27:getfield        #25  <Field AppCompatSpinner this$0>
	//*  15   30:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
	//*  16   33:ifeq            201
				i = AppCompatSpinner.access$100(AppCompatSpinner.this).right;
	//   17   36:aload_0         
	//   18   37:getfield        #25  <Field AppCompatSpinner this$0>
	//   19   40:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//   20   43:getfield        #85  <Field int Rect.right>
	//   21   46:istore_1        
			else
	//*  22   47:aload_0         
	//*  23   48:getfield        #25  <Field AppCompatSpinner this$0>
	//*  24   51:invokevirtual   #89  <Method int AppCompatSpinner.getPaddingLeft()>
	//*  25   54:istore          5
	//*  26   56:aload_0         
	//*  27   57:getfield        #25  <Field AppCompatSpinner this$0>
	//*  28   60:invokevirtual   #92  <Method int AppCompatSpinner.getPaddingRight()>
	//*  29   63:istore          6
	//*  30   65:aload_0         
	//*  31   66:getfield        #25  <Field AppCompatSpinner this$0>
	//*  32   69:invokevirtual   #95  <Method int AppCompatSpinner.getWidth()>
	//*  33   72:istore          7
	//*  34   74:aload_0         
	//*  35   75:getfield        #25  <Field AppCompatSpinner this$0>
	//*  36   78:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//*  37   81:bipush          -2
	//*  38   83:icmpne          245
	//*  39   86:aload_0         
	//*  40   87:getfield        #25  <Field AppCompatSpinner this$0>
	//*  41   90:aload_0         
	//*  42   91:getfield        #101 <Field ListAdapter mAdapter>
	//*  43   94:checkcast       #103 <Class SpinnerAdapter>
	//*  44   97:aload_0         
	//*  45   98:invokevirtual   #65  <Method Drawable getBackground()>
	//*  46  101:invokevirtual   #107 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
	//*  47  104:istore_3        
	//*  48  105:aload_0         
	//*  49  106:getfield        #25  <Field AppCompatSpinner this$0>
	//*  50  109:invokevirtual   #111 <Method Context AppCompatSpinner.getContext()>
	//*  51  112:invokevirtual   #117 <Method Resources Context.getResources()>
	//*  52  115:invokevirtual   #123 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//*  53  118:getfield        #128 <Field int DisplayMetrics.widthPixels>
	//*  54  121:aload_0         
	//*  55  122:getfield        #25  <Field AppCompatSpinner this$0>
	//*  56  125:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//*  57  128:getfield        #131 <Field int Rect.left>
	//*  58  131:isub            
	//*  59  132:aload_0         
	//*  60  133:getfield        #25  <Field AppCompatSpinner this$0>
	//*  61  136:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//*  62  139:getfield        #85  <Field int Rect.right>
	//*  63  142:isub            
	//*  64  143:istore          4
	//*  65  145:iload_3         
	//*  66  146:istore_2        
	//*  67  147:iload_3         
	//*  68  148:iload           4
	//*  69  150:icmple          156
	//*  70  153:iload           4
	//*  71  155:istore_2        
	//*  72  156:aload_0         
	//*  73  157:iload_2         
	//*  74  158:iload           7
	//*  75  160:iload           5
	//*  76  162:isub            
	//*  77  163:iload           6
	//*  78  165:isub            
	//*  79  166:invokestatic    #137 <Method int Math.max(int, int)>
	//*  80  169:invokevirtual   #140 <Method void setContentWidth(int)>
	//*  81  172:aload_0         
	//*  82  173:getfield        #25  <Field AppCompatSpinner this$0>
	//*  83  176:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
	//*  84  179:ifeq            285
	//*  85  182:iload_1         
	//*  86  183:iload           7
	//*  87  185:iload           6
	//*  88  187:isub            
	//*  89  188:aload_0         
	//*  90  189:invokevirtual   #141 <Method int getWidth()>
	//*  91  192:isub            
	//*  92  193:iadd            
	//*  93  194:istore_1        
	//*  94  195:aload_0         
	//*  95  196:iload_1         
	//*  96  197:invokevirtual   #144 <Method void setHorizontalOffset(int)>
	//*  97  200:return          
				i = -AppCompatSpinner.access$100(AppCompatSpinner.this).left;
	//   98  201:aload_0         
	//   99  202:getfield        #25  <Field AppCompatSpinner this$0>
	//  100  205:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//  101  208:getfield        #131 <Field int Rect.left>
	//  102  211:ineg            
	//  103  212:istore_1        
		} else
	//* 104  213:goto            47
		{
			Rect rect = AppCompatSpinner.access$100(AppCompatSpinner.this);
	//  105  216:aload_0         
	//  106  217:getfield        #25  <Field AppCompatSpinner this$0>
	//  107  220:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//  108  223:astore          8
			AppCompatSpinner.access$100(AppCompatSpinner.this).right = 0;
	//  109  225:aload_0         
	//  110  226:getfield        #25  <Field AppCompatSpinner this$0>
	//  111  229:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
	//  112  232:iconst_0        
	//  113  233:putfield        #85  <Field int Rect.right>
			rect.left = 0;
	//  114  236:aload           8
	//  115  238:iconst_0        
	//  116  239:putfield        #131 <Field int Rect.left>
		}
		i1 = getPaddingLeft();
		j1 = getPaddingRight();
		k1 = getWidth();
		if(AppCompatSpinner.access$200(AppCompatSpinner.this) == -2)
		{
			k = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
			l = getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.access$100(AppCompatSpinner.this).left - AppCompatSpinner.access$100(AppCompatSpinner.this).right;
			j = k;
			if(k > l)
				j = l;
			setContentWidth(Math.max(j, k1 - i1 - j1));
		} else
	//* 117  242:goto            47
		if(AppCompatSpinner.access$200(AppCompatSpinner.this) == -1)
	//* 118  245:aload_0         
	//* 119  246:getfield        #25  <Field AppCompatSpinner this$0>
	//* 120  249:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//* 121  252:iconst_m1       
	//* 122  253:icmpne          271
			setContentWidth(k1 - i1 - j1);
	//  123  256:aload_0         
	//  124  257:iload           7
	//  125  259:iload           5
	//  126  261:isub            
	//  127  262:iload           6
	//  128  264:isub            
	//  129  265:invokevirtual   #140 <Method void setContentWidth(int)>
		else
	//* 130  268:goto            172
			setContentWidth(AppCompatSpinner.access$200(AppCompatSpinner.this));
	//  131  271:aload_0         
	//  132  272:aload_0         
	//  133  273:getfield        #25  <Field AppCompatSpinner this$0>
	//  134  276:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
	//  135  279:invokevirtual   #140 <Method void setContentWidth(int)>
		if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
			i += k1 - j1 - getWidth();
		else
	//* 136  282:goto            172
			i += i1;
	//  137  285:iload_1         
	//  138  286:iload           5
	//  139  288:iadd            
	//  140  289:istore_1        
		setHorizontalOffset(i);
	//* 141  290:goto            195
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
