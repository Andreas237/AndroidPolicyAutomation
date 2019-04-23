// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, ActivityChooserModel

public class ActivityChooserView extends ViewGroup
	implements ActivityChooserModel.ActivityChooserModelClient
{

	public ActivityChooserView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #46  <Method void ActivityChooserView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #50  <Method void ActivityChooserView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #51  <Method void ViewGroup(Context, AttributeSet, int)>
		mModelDataSetObserver = ((DataSetObserver) (new _cls1()));
	//    5    7:aload_0         
	//    6    8:new             #53  <Class ActivityChooserView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #56  <Method void ActivityChooserView$1(ActivityChooserView)>
	//   10   16:putfield        #58  <Field DataSetObserver mModelDataSetObserver>
		mOnGlobalLayoutListener = ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new _cls2()));
	//   11   19:aload_0         
	//   12   20:new             #60  <Class ActivityChooserView$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #61  <Method void ActivityChooserView$2(ActivityChooserView)>
	//   16   28:putfield        #63  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
		mInitialActivityCount = 4;
	//   17   31:aload_0         
	//   18   32:iconst_4        
	//   19   33:putfield        #65  <Field int mInitialActivityCount>
		Object obj = ((Object) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActivityChooserView, i, 0)));
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:getstatic       #70  <Field int[] android.support.v7.appcompat.R$styleable.ActivityChooserView>
	//   23   41:iload_3         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #76  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   26   46:astore          4
		mInitialActivityCount = ((TypedArray) (obj)).getInt(android.support.v7.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:getstatic       #79  <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_initialActivityCount>
	//   30   54:iconst_4        
	//   31   55:invokevirtual   #85  <Method int TypedArray.getInt(int, int)>
	//   32   58:putfield        #65  <Field int mInitialActivityCount>
		attributeset = ((AttributeSet) (((TypedArray) (obj)).getDrawable(android.support.v7.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable)));
	//   33   61:aload           4
	//   34   63:getstatic       #88  <Field int android.support.v7.appcompat.R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable>
	//   35   66:invokevirtual   #92  <Method Drawable TypedArray.getDrawable(int)>
	//   36   69:astore_2        
		((TypedArray) (obj)).recycle();
	//   37   70:aload           4
	//   38   72:invokevirtual   #96  <Method void TypedArray.recycle()>
		LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view, ((ViewGroup) (this)), true);
	//   39   75:aload_0         
	//   40   76:invokevirtual   #100 <Method Context getContext()>
	//   41   79:invokestatic    #106 <Method LayoutInflater LayoutInflater.from(Context)>
	//   42   82:getstatic       #111 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view>
	//   43   85:aload_0         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #115 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   46   90:pop             
		mCallbacks = new Callbacks();
	//   47   91:aload_0         
	//   48   92:new             #117 <Class ActivityChooserView$Callbacks>
	//   49   95:dup             
	//   50   96:aload_0         
	//   51   97:invokespecial   #118 <Method void ActivityChooserView$Callbacks(ActivityChooserView)>
	//   52  100:putfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
		mActivityChooserContent = findViewById(android.support.v7.appcompat.R.id.activity_chooser_view_content);
	//   53  103:aload_0         
	//   54  104:aload_0         
	//   55  105:getstatic       #125 <Field int android.support.v7.appcompat.R$id.activity_chooser_view_content>
	//   56  108:invokevirtual   #129 <Method View findViewById(int)>
	//   57  111:putfield        #131 <Field View mActivityChooserContent>
		mActivityChooserContentBackground = mActivityChooserContent.getBackground();
	//   58  114:aload_0         
	//   59  115:aload_0         
	//   60  116:getfield        #131 <Field View mActivityChooserContent>
	//   61  119:invokevirtual   #137 <Method Drawable View.getBackground()>
	//   62  122:putfield        #139 <Field Drawable mActivityChooserContentBackground>
		mDefaultActivityButton = (FrameLayout)findViewById(android.support.v7.appcompat.R.id.default_activity_button);
	//   63  125:aload_0         
	//   64  126:aload_0         
	//   65  127:getstatic       #142 <Field int android.support.v7.appcompat.R$id.default_activity_button>
	//   66  130:invokevirtual   #129 <Method View findViewById(int)>
	//   67  133:checkcast       #144 <Class FrameLayout>
	//   68  136:putfield        #146 <Field FrameLayout mDefaultActivityButton>
		mDefaultActivityButton.setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   69  139:aload_0         
	//   70  140:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   71  143:aload_0         
	//   72  144:getfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
	//   73  147:invokevirtual   #150 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mDefaultActivityButton.setOnLongClickListener(((android.view.View.OnLongClickListener) (mCallbacks)));
	//   74  150:aload_0         
	//   75  151:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   76  154:aload_0         
	//   77  155:getfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
	//   78  158:invokevirtual   #154 <Method void FrameLayout.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mDefaultActivityButtonImage = (ImageView)mDefaultActivityButton.findViewById(android.support.v7.appcompat.R.id.image);
	//   79  161:aload_0         
	//   80  162:aload_0         
	//   81  163:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   82  166:getstatic       #157 <Field int android.support.v7.appcompat.R$id.image>
	//   83  169:invokevirtual   #158 <Method View FrameLayout.findViewById(int)>
	//   84  172:checkcast       #160 <Class ImageView>
	//   85  175:putfield        #162 <Field ImageView mDefaultActivityButtonImage>
		obj = ((Object) ((FrameLayout)findViewById(android.support.v7.appcompat.R.id.expand_activities_button)));
	//   86  178:aload_0         
	//   87  179:getstatic       #165 <Field int android.support.v7.appcompat.R$id.expand_activities_button>
	//   88  182:invokevirtual   #129 <Method View findViewById(int)>
	//   89  185:checkcast       #144 <Class FrameLayout>
	//   90  188:astore          4
		((FrameLayout) (obj)).setOnClickListener(((android.view.View.OnClickListener) (mCallbacks)));
	//   91  190:aload           4
	//   92  192:aload_0         
	//   93  193:getfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
	//   94  196:invokevirtual   #150 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		((FrameLayout) (obj)).setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (new _cls3())));
	//   95  199:aload           4
	//   96  201:new             #167 <Class ActivityChooserView$3>
	//   97  204:dup             
	//   98  205:aload_0         
	//   99  206:invokespecial   #168 <Method void ActivityChooserView$3(ActivityChooserView)>
	//  100  209:invokevirtual   #172 <Method void FrameLayout.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
		((FrameLayout) (obj)).setOnTouchListener(((android.view.View.OnTouchListener) (new _cls4(((View) (obj))))));
	//  101  212:aload           4
	//  102  214:new             #174 <Class ActivityChooserView$4>
	//  103  217:dup             
	//  104  218:aload_0         
	//  105  219:aload           4
	//  106  221:invokespecial   #177 <Method void ActivityChooserView$4(ActivityChooserView, View)>
	//  107  224:invokevirtual   #181 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		mExpandActivityOverflowButton = ((FrameLayout) (obj));
	//  108  227:aload_0         
	//  109  228:aload           4
	//  110  230:putfield        #183 <Field FrameLayout mExpandActivityOverflowButton>
		mExpandActivityOverflowButtonImage = (ImageView)((FrameLayout) (obj)).findViewById(android.support.v7.appcompat.R.id.image);
	//  111  233:aload_0         
	//  112  234:aload           4
	//  113  236:getstatic       #157 <Field int android.support.v7.appcompat.R$id.image>
	//  114  239:invokevirtual   #158 <Method View FrameLayout.findViewById(int)>
	//  115  242:checkcast       #160 <Class ImageView>
	//  116  245:putfield        #185 <Field ImageView mExpandActivityOverflowButtonImage>
		mExpandActivityOverflowButtonImage.setImageDrawable(((Drawable) (attributeset)));
	//  117  248:aload_0         
	//  118  249:getfield        #185 <Field ImageView mExpandActivityOverflowButtonImage>
	//  119  252:aload_2         
	//  120  253:invokevirtual   #189 <Method void ImageView.setImageDrawable(Drawable)>
		mAdapter = new ActivityChooserViewAdapter();
	//  121  256:aload_0         
	//  122  257:new             #191 <Class ActivityChooserView$ActivityChooserViewAdapter>
	//  123  260:dup             
	//  124  261:aload_0         
	//  125  262:invokespecial   #192 <Method void ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView)>
	//  126  265:putfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
		mAdapter.registerDataSetObserver(((DataSetObserver) (new _cls5())));
	//  127  268:aload_0         
	//  128  269:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//  129  272:new             #196 <Class ActivityChooserView$5>
	//  130  275:dup             
	//  131  276:aload_0         
	//  132  277:invokespecial   #197 <Method void ActivityChooserView$5(ActivityChooserView)>
	//  133  280:invokevirtual   #201 <Method void ActivityChooserView$ActivityChooserViewAdapter.registerDataSetObserver(DataSetObserver)>
		context = ((Context) (context.getResources()));
	//  134  283:aload_1         
	//  135  284:invokevirtual   #205 <Method Resources Context.getResources()>
	//  136  287:astore_1        
		mListPopupMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//  137  288:aload_0         
	//  138  289:aload_1         
	//  139  290:invokevirtual   #211 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  140  293:getfield        #216 <Field int DisplayMetrics.widthPixels>
	//  141  296:iconst_2        
	//  142  297:idiv            
	//  143  298:aload_1         
	//  144  299:getstatic       #221 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//  145  302:invokevirtual   #225 <Method int Resources.getDimensionPixelSize(int)>
	//  146  305:invokestatic    #230 <Method int Math.max(int, int)>
	//  147  308:putfield        #232 <Field int mListPopupMaxWidth>
	//  148  311:return          
	}

	public boolean dismissPopup()
	{
		if(isShowingPopup())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #237 <Method boolean isShowingPopup()>
	//*   2    4:ifeq            34
		{
			getListPopupWindow().dismiss();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #241 <Method ListPopupWindow getListPopupWindow()>
	//    5   11:invokevirtual   #246 <Method void ListPopupWindow.dismiss()>
			ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #250 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:astore_1        
			if(viewtreeobserver.isAlive())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #255 <Method boolean ViewTreeObserver.isAlive()>
	//*  11   23:ifeq            34
				viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   15   31:invokevirtual   #259 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public ActivityChooserModel getDataModel()
	{
		return mAdapter.getDataModel();
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:invokevirtual   #263 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    3    7:areturn         
	}

	ListPopupWindow getListPopupWindow()
	{
		if(mListPopupWindow == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//*   2    4:ifnonnull       71
		{
			mListPopupWindow = new ListPopupWindow(getContext());
	//    3    7:aload_0         
	//    4    8:new             #243 <Class ListPopupWindow>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #100 <Method Context getContext()>
	//    8   16:invokespecial   #267 <Method void ListPopupWindow(Context)>
	//    9   19:putfield        #265 <Field ListPopupWindow mListPopupWindow>
			mListPopupWindow.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   10   22:aload_0         
	//   11   23:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   12   26:aload_0         
	//   13   27:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   14   30:invokevirtual   #271 <Method void ListPopupWindow.setAdapter(android.widget.ListAdapter)>
			mListPopupWindow.setAnchorView(((View) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #275 <Method void ListPopupWindow.setAnchorView(View)>
			mListPopupWindow.setModal(true);
	//   19   41:aload_0         
	//   20   42:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #279 <Method void ListPopupWindow.setModal(boolean)>
			mListPopupWindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (mCallbacks)));
	//   23   49:aload_0         
	//   24   50:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   25   53:aload_0         
	//   26   54:getfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
	//   27   57:invokevirtual   #283 <Method void ListPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mListPopupWindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (mCallbacks)));
	//   28   60:aload_0         
	//   29   61:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   30   64:aload_0         
	//   31   65:getfield        #120 <Field ActivityChooserView$Callbacks mCallbacks>
	//   32   68:invokevirtual   #287 <Method void ListPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		}
		return mListPopupWindow;
	//   33   71:aload_0         
	//   34   72:getfield        #265 <Field ListPopupWindow mListPopupWindow>
	//   35   75:areturn         
	}

	public boolean isShowingPopup()
	{
		return getListPopupWindow().isShowing();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method ListPopupWindow getListPopupWindow()>
	//    2    4:invokevirtual   #290 <Method boolean ListPopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method void ViewGroup.onAttachedToWindow()>
		ActivityChooserModel activitychoosermodel = mAdapter.getDataModel();
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #263 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(activitychoosermodel != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #299 <Method void ActivityChooserModel.registerObserver(Object)>
		mIsAttachedToWindow = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #301 <Field boolean mIsAttachedToWindow>
	//   15   29:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void ViewGroup.onDetachedFromWindow()>
		Object obj = ((Object) (mAdapter.getDataModel()));
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    4    8:invokevirtual   #263 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//    5   11:astore_1        
		if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			((ActivityChooserModel) (obj)).unregisterObserver(((Object) (mModelDataSetObserver)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field DataSetObserver mModelDataSetObserver>
	//   11   21:invokevirtual   #307 <Method void ActivityChooserModel.unregisterObserver(Object)>
		obj = ((Object) (getViewTreeObserver()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #250 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   28:astore_1        
		if(((ViewTreeObserver) (obj)).isAlive())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #255 <Method boolean ViewTreeObserver.isAlive()>
	//*  17   33:ifeq            44
			((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #63  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
	//   21   41:invokevirtual   #259 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(isShowingPopup())
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #237 <Method boolean isShowingPopup()>
	//*  24   48:ifeq            56
			dismissPopup();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #309 <Method boolean dismissPopup()>
	//   27   55:pop             
		mIsAttachedToWindow = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #301 <Field boolean mIsAttachedToWindow>
	//   31   61:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mActivityChooserContent.layout(0, 0, k - i, l - j);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field View mActivityChooserContent>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload           4
	//    5    8:iload_2         
	//    6    9:isub            
	//    7   10:iload           5
	//    8   12:iload_3         
	//    9   13:isub            
	//   10   14:invokevirtual   #315 <Method void View.layout(int, int, int, int)>
		if(!isShowingPopup())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #237 <Method boolean isShowingPopup()>
	//*  13   21:ifne            29
			dismissPopup();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #309 <Method boolean dismissPopup()>
	//   16   28:pop             
	//   17   29:return          
	}

	protected void onMeasure(int i, int j)
	{
		View view = mActivityChooserContent;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field View mActivityChooserContent>
	//    2    4:astore          4
		int k = j;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(mDefaultActivityButton.getVisibility() != 0)
	//*   5    8:aload_0         
	//*   6    9:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//*   7   12:invokevirtual   #321 <Method int FrameLayout.getVisibility()>
	//*   8   15:ifeq            29
			k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
	//    9   18:iload_2         
	//   10   19:invokestatic    #326 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:ldc2            #327 <Int 0x40000000>
	//   12   25:invokestatic    #330 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   28:istore_3        
		measureChild(view, i, k);
	//   14   29:aload_0         
	//   15   30:aload           4
	//   16   32:iload_1         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #334 <Method void measureChild(View, int, int)>
		setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #337 <Method int View.getMeasuredWidth()>
	//   22   43:aload           4
	//   23   45:invokevirtual   #340 <Method int View.getMeasuredHeight()>
	//   24   48:invokevirtual   #343 <Method void setMeasuredDimension(int, int)>
	//   25   51:return          
	}

	public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
	{
		mAdapter.setDataModel(activitychoosermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #348 <Method void ActivityChooserView$ActivityChooserViewAdapter.setDataModel(ActivityChooserModel)>
		if(isShowingPopup())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #237 <Method boolean isShowingPopup()>
	//*   6   12:ifeq            25
		{
			dismissPopup();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #309 <Method boolean dismissPopup()>
	//    9   19:pop             
			showPopup();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #351 <Method boolean showPopup()>
	//   12   24:pop             
		}
	//   13   25:return          
	}

	public void setDefaultActionButtonContentDescription(int i)
	{
		mDefaultActionButtonContentDescription = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #355 <Field int mDefaultActionButtonContentDescription>
	//    3    5:return          
	}

	public void setExpandActivityOverflowButtonContentDescription(int i)
	{
		String s = getContext().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Context getContext()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #360 <Method String Context.getString(int)>
	//    4    8:astore_2        
		mExpandActivityOverflowButtonImage.setContentDescription(((CharSequence) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #185 <Field ImageView mExpandActivityOverflowButtonImage>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #364 <Method void ImageView.setContentDescription(CharSequence)>
	//    9   17:return          
	}

	public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
	{
		mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field ImageView mExpandActivityOverflowButtonImage>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #189 <Method void ImageView.setImageDrawable(Drawable)>
	//    4    8:return          
	}

	public void setInitialActivityCount(int i)
	{
		mInitialActivityCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int mInitialActivityCount>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #368 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setProvider(d d)
	{
		mProvider = d;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #372 <Field d mProvider>
	//    3    5:return          
	}

	public boolean showPopup()
	{
		if(!isShowingPopup())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #237 <Method boolean isShowingPopup()>
	//*   2    4:ifne            31
		{
			if(!mIsAttachedToWindow)
	//*   3    7:aload_0         
	//*   4    8:getfield        #301 <Field boolean mIsAttachedToWindow>
	//*   5   11:ifne            16
			{
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			} else
			{
				mIsSelectingDefaultActivity = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #374 <Field boolean mIsSelectingDefaultActivity>
				showPopupUnchecked(mInitialActivityCount);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #65  <Field int mInitialActivityCount>
	//   14   26:invokevirtual   #377 <Method void showPopupUnchecked(int)>
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
			}
		} else
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
	}

	void showPopupUnchecked(int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #379 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #381 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #386 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	void updateAppearance()
	{
		if(mAdapter.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//*   2    4:invokevirtual   #390 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
	//*   3    7:ifle            21
			mExpandActivityOverflowButton.setEnabled(true);
	//    4   10:aload_0         
	//    5   11:getfield        #183 <Field FrameLayout mExpandActivityOverflowButton>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #393 <Method void FrameLayout.setEnabled(boolean)>
		else
	//*   8   18:goto            29
			mExpandActivityOverflowButton.setEnabled(false);
	//    9   21:aload_0         
	//   10   22:getfield        #183 <Field FrameLayout mExpandActivityOverflowButton>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #393 <Method void FrameLayout.setEnabled(boolean)>
		int i = mAdapter.getActivityCount();
	//   13   29:aload_0         
	//   14   30:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   15   33:invokevirtual   #396 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
	//   16   36:istore_1        
		int j = mAdapter.getHistorySize();
	//   17   37:aload_0         
	//   18   38:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   19   41:invokevirtual   #399 <Method int ActivityChooserView$ActivityChooserViewAdapter.getHistorySize()>
	//   20   44:istore_2        
		if(i != 1 && (i <= 1 || j <= 0))
	//*  21   45:iload_1         
	//*  22   46:iconst_1        
	//*  23   47:icmpeq          74
	//*  24   50:iload_1         
	//*  25   51:iconst_1        
	//*  26   52:icmple          62
	//*  27   55:iload_2         
	//*  28   56:ifle            62
	//*  29   59:goto            74
		{
			mDefaultActivityButton.setVisibility(8);
	//   30   62:aload_0         
	//   31   63:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   32   66:bipush          8
	//   33   68:invokevirtual   #402 <Method void FrameLayout.setVisibility(int)>
		} else
	//*  34   71:goto            154
		{
			mDefaultActivityButton.setVisibility(0);
	//   35   74:aload_0         
	//   36   75:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   37   78:iconst_0        
	//   38   79:invokevirtual   #402 <Method void FrameLayout.setVisibility(int)>
			Object obj = ((Object) (mAdapter.getDefaultActivity()));
	//   39   82:aload_0         
	//   40   83:getfield        #194 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
	//   41   86:invokevirtual   #406 <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
	//   42   89:astore_3        
			android.content.pm.PackageManager packagemanager = getContext().getPackageManager();
	//   43   90:aload_0         
	//   44   91:invokevirtual   #100 <Method Context getContext()>
	//   45   94:invokevirtual   #410 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   46   97:astore          4
			mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
	//   47   99:aload_0         
	//   48  100:getfield        #162 <Field ImageView mDefaultActivityButtonImage>
	//   49  103:aload_3         
	//   50  104:aload           4
	//   51  106:invokevirtual   #416 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   52  109:invokevirtual   #189 <Method void ImageView.setImageDrawable(Drawable)>
			if(mDefaultActionButtonContentDescription != 0)
	//*  53  112:aload_0         
	//*  54  113:getfield        #355 <Field int mDefaultActionButtonContentDescription>
	//*  55  116:ifeq            154
			{
				obj = ((Object) (((ResolveInfo) (obj)).loadLabel(packagemanager)));
	//   56  119:aload_3         
	//   57  120:aload           4
	//   58  122:invokevirtual   #420 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   59  125:astore_3        
				obj = ((Object) (getContext().getString(mDefaultActionButtonContentDescription, new Object[] {
					obj
				})));
	//   60  126:aload_0         
	//   61  127:invokevirtual   #100 <Method Context getContext()>
	//   62  130:aload_0         
	//   63  131:getfield        #355 <Field int mDefaultActionButtonContentDescription>
	//   64  134:iconst_1        
	//   65  135:anewarray       Object[]
	//   66  138:dup             
	//   67  139:iconst_0        
	//   68  140:aload_3         
	//   69  141:aastore         
	//   70  142:invokevirtual   #425 <Method String Context.getString(int, Object[])>
	//   71  145:astore_3        
				mDefaultActivityButton.setContentDescription(((CharSequence) (obj)));
	//   72  146:aload_0         
	//   73  147:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//   74  150:aload_3         
	//   75  151:invokevirtual   #426 <Method void FrameLayout.setContentDescription(CharSequence)>
			}
		}
		if(mDefaultActivityButton.getVisibility() == 0)
	//*  76  154:aload_0         
	//*  77  155:getfield        #146 <Field FrameLayout mDefaultActivityButton>
	//*  78  158:invokevirtual   #321 <Method int FrameLayout.getVisibility()>
	//*  79  161:ifne            176
		{
			mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
	//   80  164:aload_0         
	//   81  165:getfield        #131 <Field View mActivityChooserContent>
	//   82  168:aload_0         
	//   83  169:getfield        #139 <Field Drawable mActivityChooserContentBackground>
	//   84  172:invokevirtual   #429 <Method void View.setBackgroundDrawable(Drawable)>
			return;
	//   85  175:return          
		} else
		{
			mActivityChooserContent.setBackgroundDrawable(((Drawable) (null)));
	//   86  176:aload_0         
	//   87  177:getfield        #131 <Field View mActivityChooserContent>
	//   88  180:aconst_null     
	//   89  181:invokevirtual   #429 <Method void View.setBackgroundDrawable(Drawable)>
			return;
	//   90  184:return          
		}
	}

	private static final String LOG_TAG = "ActivityChooserView";
	private final View mActivityChooserContent;
	private final Drawable mActivityChooserContentBackground;
	final ActivityChooserViewAdapter mAdapter;
	private final Callbacks mCallbacks;
	private int mDefaultActionButtonContentDescription;
	final FrameLayout mDefaultActivityButton;
	private final ImageView mDefaultActivityButtonImage;
	final FrameLayout mExpandActivityOverflowButton;
	private final ImageView mExpandActivityOverflowButtonImage;
	int mInitialActivityCount;
	private boolean mIsAttachedToWindow;
	boolean mIsSelectingDefaultActivity;
	private final int mListPopupMaxWidth;
	private ListPopupWindow mListPopupWindow;
	final DataSetObserver mModelDataSetObserver;
	android.widget.PopupWindow.OnDismissListener mOnDismissListener;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
	d mProvider;

	private class _cls1 extends DataSetObserver
	{

		public void onChanged()
		{
			super.onChanged();
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void DataSetObserver.onChanged()>
			mAdapter.notifyDataSetChanged();
		//    2    4:aload_0         
		//    3    5:getfield        #10  <Field ActivityChooserView this$0>
		//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//    5   11:invokevirtual   #28  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetChanged()>
		//    6   14:return          
		}

		public void onInvalidated()
		{
			super.onInvalidated();
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void DataSetObserver.onInvalidated()>
			mAdapter.notifyDataSetInvalidated();
		//    2    4:aload_0         
		//    3    5:getfield        #10  <Field ActivityChooserView this$0>
		//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//    5   11:invokevirtual   #34  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetInvalidated()>
		//    6   14:return          
		}

		final ActivityChooserView this$0;

		_cls1()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener
	{

		public void onGlobalLayout()
		{
			if(isShowingPopup())
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ActivityChooserView this$0>
		//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.isShowingPopup()>
		//*   3    7:ifeq            62
			{
				if(!isShown())
		//*   4   10:aload_0         
		//*   5   11:getfield        #12  <Field ActivityChooserView this$0>
		//*   6   14:invokevirtual   #26  <Method boolean ActivityChooserView.isShown()>
		//*   7   17:ifne            31
				{
					getListPopupWindow().dismiss();
		//    8   20:aload_0         
		//    9   21:getfield        #12  <Field ActivityChooserView this$0>
		//   10   24:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
		//   11   27:invokevirtual   #35  <Method void ListPopupWindow.dismiss()>
					return;
		//   12   30:return          
				}
				getListPopupWindow().show();
		//   13   31:aload_0         
		//   14   32:getfield        #12  <Field ActivityChooserView this$0>
		//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
		//   16   38:invokevirtual   #38  <Method void ListPopupWindow.show()>
				if(mProvider != null)
		//*  17   41:aload_0         
		//*  18   42:getfield        #12  <Field ActivityChooserView this$0>
		//*  19   45:getfield        #42  <Field d ActivityChooserView.mProvider>
		//*  20   48:ifnull          62
					mProvider.subUiVisibilityChanged(true);
		//   21   51:aload_0         
		//   22   52:getfield        #12  <Field ActivityChooserView this$0>
		//   23   55:getfield        #42  <Field d ActivityChooserView.mProvider>
		//   24   58:iconst_1        
		//   25   59:invokevirtual   #48  <Method void d.subUiVisibilityChanged(boolean)>
			}
		//   26   62:return          
		}

		final ActivityChooserView this$0;

		_cls2()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class Callbacks
		implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
	{

		private void notifyOnDismissListener()
		{
			if(mOnDismissListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ActivityChooserView this$0>
		//*   2    4:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
		//*   3    7:ifnull          22
				mOnDismissListener.onDismiss();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field ActivityChooserView this$0>
		//    6   14:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
		//    7   17:invokeinterface #32  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
		//    8   22:return          
		}

		public void onClick(View view)
		{
label0:
			{
				if(view == mDefaultActivityButton)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #18  <Field ActivityChooserView this$0>
		//*   3    5:getfield        #38  <Field FrameLayout ActivityChooserView.mDefaultActivityButton>
		//*   4    8:if_acmpne       83
				{
					dismissPopup();
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field ActivityChooserView this$0>
		//    7   15:invokevirtual   #42  <Method boolean ActivityChooserView.dismissPopup()>
		//    8   18:pop             
					view = ((View) (mAdapter.getDefaultActivity()));
		//    9   19:aload_0         
		//   10   20:getfield        #18  <Field ActivityChooserView this$0>
		//   11   23:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   12   26:invokevirtual   #52  <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
		//   13   29:astore_1        
					int i = mAdapter.getDataModel().getActivityIndex(((ResolveInfo) (view)));
		//   14   30:aload_0         
		//   15   31:getfield        #18  <Field ActivityChooserView this$0>
		//   16   34:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   17   37:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   18   40:aload_1         
		//   19   41:invokevirtual   #62  <Method int ActivityChooserModel.getActivityIndex(ResolveInfo)>
		//   20   44:istore_2        
					view = ((View) (mAdapter.getDataModel().chooseActivity(i)));
		//   21   45:aload_0         
		//   22   46:getfield        #18  <Field ActivityChooserView this$0>
		//   23   49:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   24   52:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   25   55:iload_2         
		//   26   56:invokevirtual   #66  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//   27   59:astore_1        
					if(view != null)
		//*  28   60:aload_1         
		//*  29   61:ifnull          112
					{
						((Intent) (view)).addFlags(0x80000);
		//   30   64:aload_1         
		//   31   65:ldc1            #67  <Int 0x80000>
		//   32   67:invokevirtual   #72  <Method Intent Intent.addFlags(int)>
		//   33   70:pop             
						getContext().startActivity(((Intent) (view)));
		//   34   71:aload_0         
		//   35   72:getfield        #18  <Field ActivityChooserView this$0>
		//   36   75:invokevirtual   #76  <Method Context ActivityChooserView.getContext()>
		//   37   78:aload_1         
		//   38   79:invokevirtual   #82  <Method void Context.startActivity(Intent)>
						return;
		//   39   82:return          
					}
				} else
				{
					if(view != mExpandActivityOverflowButton)
						break label0;
		//   40   83:aload_1         
		//   41   84:aload_0         
		//   42   85:getfield        #18  <Field ActivityChooserView this$0>
		//   43   88:getfield        #85  <Field FrameLayout ActivityChooserView.mExpandActivityOverflowButton>
		//   44   91:if_acmpne       113
					view = ((View) (ActivityChooserView.this));
		//   45   94:aload_0         
		//   46   95:getfield        #18  <Field ActivityChooserView this$0>
		//   47   98:astore_1        
					view.mIsSelectingDefaultActivity = false;
		//   48   99:aload_1         
		//   49  100:iconst_0        
		//   50  101:putfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
					((ActivityChooserView) (view)).showPopupUnchecked(((ActivityChooserView) (view)).mInitialActivityCount);
		//   51  104:aload_1         
		//   52  105:aload_1         
		//   53  106:getfield        #93  <Field int ActivityChooserView.mInitialActivityCount>
		//   54  109:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
				}
				return;
		//   55  112:return          
			}
			throw new IllegalArgumentException();
		//   56  113:new             #99  <Class IllegalArgumentException>
		//   57  116:dup             
		//   58  117:invokespecial   #100 <Method void IllegalArgumentException()>
		//   59  120:athrow          
		}

		public void onDismiss()
		{
			notifyOnDismissListener();
		//    0    0:aload_0         
		//    1    1:invokespecial   #102 <Method void notifyOnDismissListener()>
			if(mProvider != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #18  <Field ActivityChooserView this$0>
		//*   4    8:getfield        #106 <Field d ActivityChooserView.mProvider>
		//*   5   11:ifnull          25
				mProvider.subUiVisibilityChanged(false);
		//    6   14:aload_0         
		//    7   15:getfield        #18  <Field ActivityChooserView this$0>
		//    8   18:getfield        #106 <Field d ActivityChooserView.mProvider>
		//    9   21:iconst_0        
		//   10   22:invokevirtual   #112 <Method void d.subUiVisibilityChanged(boolean)>
		//   11   25:return          
		}

		public void onItemClick(AdapterView adapterview, View view, int i, long l)
		{
			switch(((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #120 <Method android.widget.Adapter AdapterView.getAdapter()>
		//*   2    4:checkcast       #48  <Class ActivityChooserView$ActivityChooserViewAdapter>
		//*   3    7:iload_3         
		//*   4    8:invokevirtual   #124 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
			{
		//*   5   11:tableswitch     0 1: default 32
		//		               0 50
		//		               1 40
			default:
				throw new IllegalArgumentException();
		//    6   32:new             #99  <Class IllegalArgumentException>
		//    7   35:dup             
		//    8   36:invokespecial   #100 <Method void IllegalArgumentException()>
		//    9   39:athrow          

			case 1: // '\001'
				showPopupUnchecked(0x7fffffff);
		//   10   40:aload_0         
		//   11   41:getfield        #18  <Field ActivityChooserView this$0>
		//   12   44:ldc1            #125 <Int 0x7fffffff>
		//   13   46:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
				return;
		//   14   49:return          

			case 0: // '\0'
				dismissPopup();
		//   15   50:aload_0         
		//   16   51:getfield        #18  <Field ActivityChooserView this$0>
		//   17   54:invokevirtual   #42  <Method boolean ActivityChooserView.dismissPopup()>
		//   18   57:pop             
				break;
			}
			if(mIsSelectingDefaultActivity)
		//*  19   58:aload_0         
		//*  20   59:getfield        #18  <Field ActivityChooserView this$0>
		//*  21   62:getfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
		//*  22   65:ifeq            87
			{
				if(i > 0)
		//*  23   68:iload_3         
		//*  24   69:ifle            144
				{
					mAdapter.getDataModel().setDefaultActivity(i);
		//   25   72:aload_0         
		//   26   73:getfield        #18  <Field ActivityChooserView this$0>
		//   27   76:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   28   79:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   29   82:iload_3         
		//   30   83:invokevirtual   #128 <Method void ActivityChooserModel.setDefaultActivity(int)>
					return;
		//   31   86:return          
				}
			} else
			{
				if(!mAdapter.getShowDefaultActivity())
		//*  32   87:aload_0         
		//*  33   88:getfield        #18  <Field ActivityChooserView this$0>
		//*  34   91:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*  35   94:invokevirtual   #131 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
		//*  36   97:ifeq            103
		//*  37  100:goto            107
					i++;
		//   38  103:iload_3         
		//   39  104:iconst_1        
		//   40  105:iadd            
		//   41  106:istore_3        
				adapterview = ((AdapterView) (mAdapter.getDataModel().chooseActivity(i)));
		//   42  107:aload_0         
		//   43  108:getfield        #18  <Field ActivityChooserView this$0>
		//   44  111:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//   45  114:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
		//   46  117:iload_3         
		//   47  118:invokevirtual   #66  <Method Intent ActivityChooserModel.chooseActivity(int)>
		//   48  121:astore_1        
				if(adapterview != null)
		//*  49  122:aload_1         
		//*  50  123:ifnull          144
				{
					((Intent) (adapterview)).addFlags(0x80000);
		//   51  126:aload_1         
		//   52  127:ldc1            #67  <Int 0x80000>
		//   53  129:invokevirtual   #72  <Method Intent Intent.addFlags(int)>
		//   54  132:pop             
					getContext().startActivity(((Intent) (adapterview)));
		//   55  133:aload_0         
		//   56  134:getfield        #18  <Field ActivityChooserView this$0>
		//   57  137:invokevirtual   #76  <Method Context ActivityChooserView.getContext()>
		//   58  140:aload_1         
		//   59  141:invokevirtual   #82  <Method void Context.startActivity(Intent)>
				}
			}
		//   60  144:return          
		}

		public boolean onLongClick(View view)
		{
			if(view == mDefaultActivityButton)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #18  <Field ActivityChooserView this$0>
		//*   3    5:getfield        #38  <Field FrameLayout ActivityChooserView.mDefaultActivityButton>
		//*   4    8:if_acmpne       44
			{
				if(mAdapter.getCount() > 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #18  <Field ActivityChooserView this$0>
		//*   7   15:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//*   8   18:invokevirtual   #137 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
		//*   9   21:ifle            42
				{
					view = ((View) (ActivityChooserView.this));
		//   10   24:aload_0         
		//   11   25:getfield        #18  <Field ActivityChooserView this$0>
		//   12   28:astore_1        
					view.mIsSelectingDefaultActivity = true;
		//   13   29:aload_1         
		//   14   30:iconst_1        
		//   15   31:putfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
					((ActivityChooserView) (view)).showPopupUnchecked(((ActivityChooserView) (view)).mInitialActivityCount);
		//   16   34:aload_1         
		//   17   35:aload_1         
		//   18   36:getfield        #93  <Field int ActivityChooserView.mInitialActivityCount>
		//   19   39:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
				}
				return true;
		//   20   42:iconst_1        
		//   21   43:ireturn         
			} else
			{
				throw new IllegalArgumentException();
		//   22   44:new             #99  <Class IllegalArgumentException>
		//   23   47:dup             
		//   24   48:invokespecial   #100 <Method void IllegalArgumentException()>
		//   25   51:athrow          
			}
		}

		final ActivityChooserView this$0;

		Callbacks()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls3 extends android.view.View.AccessibilityDelegate
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
			e.a(accessibilitynodeinfo).e(true);
		//    4    6:aload_2         
		//    5    7:invokestatic    #24  <Method e e.a(AccessibilityNodeInfo)>
		//    6   10:iconst_1        
		//    7   11:invokevirtual   #28  <Method void e.e(boolean)>
		//    8   14:return          
		}

		final ActivityChooserView this$0;

		_cls3()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.view.View$AccessibilityDelegate()>
		//    5    9:return          
		}
	}


	private class _cls4 extends ForwardingListener
	{

		public ShowableListMenu getPopup()
		{
			return ((ShowableListMenu) (getListPopupWindow()));
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field ActivityChooserView this$0>
		//    2    4:invokevirtual   #22  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
		//    3    7:areturn         
		}

		protected boolean onForwardingStarted()
		{
			showPopup();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field ActivityChooserView this$0>
		//    2    4:invokevirtual   #27  <Method boolean ActivityChooserView.showPopup()>
		//    3    7:pop             
			return true;
		//    4    8:iconst_1        
		//    5    9:ireturn         
		}

		protected boolean onForwardingStopped()
		{
			dismissPopup();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field ActivityChooserView this$0>
		//    2    4:invokevirtual   #31  <Method boolean ActivityChooserView.dismissPopup()>
		//    3    7:pop             
			return true;
		//    4    8:iconst_1        
		//    5    9:ireturn         
		}

		final ActivityChooserView this$0;

		_cls4(View view)
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActivityChooserView this$0>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #13  <Method void ForwardingListener(View)>
		//    6   10:return          
		}
	}


	private class ActivityChooserViewAdapter extends BaseAdapter
	{

		public int getActivityCount()
		{
			return mDataModel.getActivityCount();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #42  <Method int ActivityChooserModel.getActivityCount()>
		//    3    7:ireturn         
		}

		public int getCount()
		{
			int j = mDataModel.getActivityCount();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #42  <Method int ActivityChooserModel.getActivityCount()>
		//    3    7:istore_2        
			int i = j;
		//    4    8:iload_2         
		//    5    9:istore_1        
			if(!mShowDefaultActivity)
		//*   6   10:aload_0         
		//*   7   11:getfield        #45  <Field boolean mShowDefaultActivity>
		//*   8   14:ifne            33
			{
				i = j;
		//    9   17:iload_2         
		//   10   18:istore_1        
				if(mDataModel.getDefaultActivity() != null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #38  <Field ActivityChooserModel mDataModel>
		//*  13   23:invokevirtual   #49  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//*  14   26:ifnull          33
					i = j - 1;
		//   15   29:iload_2         
		//   16   30:iconst_1        
		//   17   31:isub            
		//   18   32:istore_1        
			}
			j = Math.min(i, mMaxActivityCount);
		//   19   33:iload_1         
		//   20   34:aload_0         
		//   21   35:getfield        #33  <Field int mMaxActivityCount>
		//   22   38:invokestatic    #55  <Method int Math.min(int, int)>
		//   23   41:istore_2        
			i = j;
		//   24   42:iload_2         
		//   25   43:istore_1        
			if(mShowFooterView)
		//*  26   44:aload_0         
		//*  27   45:getfield        #57  <Field boolean mShowFooterView>
		//*  28   48:ifeq            55
				i = j + 1;
		//   29   51:iload_2         
		//   30   52:iconst_1        
		//   31   53:iadd            
		//   32   54:istore_1        
			return i;
		//   33   55:iload_1         
		//   34   56:ireturn         
		}

		public ActivityChooserModel getDataModel()
		{
			return mDataModel;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ActivityChooserModel mDataModel>
		//    2    4:areturn         
		}

		public ResolveInfo getDefaultActivity()
		{
			return mDataModel.getDefaultActivity();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #49  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//    3    7:areturn         
		}

		public int getHistorySize()
		{
			return mDataModel.getHistorySize();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ActivityChooserModel mDataModel>
		//    2    4:invokevirtual   #62  <Method int ActivityChooserModel.getHistorySize()>
		//    3    7:ireturn         
		}

		public Object getItem(int i)
		{
			int j;
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokevirtual   #68  <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 1: default 28
		//		               0 38
		//		               1 36
			default:
				throw new IllegalArgumentException();
		//    4   28:new             #70  <Class IllegalArgumentException>
		//    5   31:dup             
		//    6   32:invokespecial   #71  <Method void IllegalArgumentException()>
		//    7   35:athrow          

			case 1: // '\001'
				return ((Object) (null));
		//    8   36:aconst_null     
		//    9   37:areturn         

			case 0: // '\0'
				j = i;
		//   10   38:iload_1         
		//   11   39:istore_2        
				break;
			}
			if(!mShowDefaultActivity)
		//*  12   40:aload_0         
		//*  13   41:getfield        #45  <Field boolean mShowDefaultActivity>
		//*  14   44:ifne            63
			{
				j = i;
		//   15   47:iload_1         
		//   16   48:istore_2        
				if(mDataModel.getDefaultActivity() != null)
		//*  17   49:aload_0         
		//*  18   50:getfield        #38  <Field ActivityChooserModel mDataModel>
		//*  19   53:invokevirtual   #49  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
		//*  20   56:ifnull          63
					j = i + 1;
		//   21   59:iload_1         
		//   22   60:iconst_1        
		//   23   61:iadd            
		//   24   62:istore_2        
			}
			return ((Object) (mDataModel.getActivity(j)));
		//   25   63:aload_0         
		//   26   64:getfield        #38  <Field ActivityChooserModel mDataModel>
		//   27   67:iload_2         
		//   28   68:invokevirtual   #75  <Method ResolveInfo ActivityChooserModel.getActivity(int)>
		//   29   71:areturn         
		}

		public long getItemId(int i)
		{
			return (long)i;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public int getItemViewType(int i)
		{
			return !mShowFooterView || i != getCount() - 1 ? 0 : 1;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field boolean mShowFooterView>
		//    2    4:ifeq            19
		//    3    7:iload_1         
		//    4    8:aload_0         
		//    5    9:invokevirtual   #79  <Method int getCount()>
		//    6   12:iconst_1        
		//    7   13:isub            
		//    8   14:icmpne          19
		//    9   17:iconst_1        
		//   10   18:ireturn         
		//   11   19:iconst_0        
		//   12   20:ireturn         
		}

		public boolean getShowDefaultActivity()
		{
			return mShowDefaultActivity;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field boolean mShowDefaultActivity>
		//    2    4:ireturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			getItemViewType(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #68  <Method int getItemViewType(int)>
			JVM INSTR tableswitch 0 1: default 28
		//		               0 107
		//		               1 36;
		//    3    5:tableswitch     0 1: default 28
		//		               0 107
		//		               1 36
			   goto _L1 _L2 _L3
_L1:
			throw new IllegalArgumentException();
		//    4   28:new             #70  <Class IllegalArgumentException>
		//    5   31:dup             
		//    6   32:invokespecial   #71  <Method void IllegalArgumentException()>
		//    7   35:athrow          
_L3:
			if(view == null) goto _L5; else goto _L4
		//    8   36:aload_2         
		//    9   37:ifnull          51
_L4:
			View view1 = view;
		//   10   40:aload_2         
		//   11   41:astore          4
			if(view.getId() == 1) goto _L6; else goto _L5
		//   12   43:aload_2         
		//   13   44:invokevirtual   #88  <Method int View.getId()>
		//   14   47:iconst_1        
		//   15   48:icmpeq          104
_L5:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   16   51:aload_0         
		//   17   52:getfield        #28  <Field ActivityChooserView this$0>
		//   18   55:invokevirtual   #94  <Method Context ActivityChooserView.getContext()>
		//   19   58:invokestatic    #100 <Method LayoutInflater LayoutInflater.from(Context)>
		//   20   61:getstatic       #105 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   21   64:aload_3         
		//   22   65:iconst_0        
		//   23   66:invokevirtual   #109 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   24   69:astore          4
			view1.setId(1);
		//   25   71:aload           4
		//   26   73:iconst_1        
		//   27   74:invokevirtual   #113 <Method void View.setId(int)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(((CharSequence) (getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all))));
		//   28   77:aload           4
		//   29   79:getstatic       #118 <Field int android.support.v7.appcompat.R$id.title>
		//   30   82:invokevirtual   #122 <Method View View.findViewById(int)>
		//   31   85:checkcast       #124 <Class TextView>
		//   32   88:aload_0         
		//   33   89:getfield        #28  <Field ActivityChooserView this$0>
		//   34   92:invokevirtual   #94  <Method Context ActivityChooserView.getContext()>
		//   35   95:getstatic       #129 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
		//   36   98:invokevirtual   #135 <Method String Context.getString(int)>
		//   37  101:invokevirtual   #139 <Method void TextView.setText(CharSequence)>
_L6:
			return view1;
		//   38  104:aload           4
		//   39  106:areturn         
_L2:
			if(view == null) goto _L8; else goto _L7
		//   40  107:aload_2         
		//   41  108:ifnull          124
_L7:
			view1 = view;
		//   42  111:aload_2         
		//   43  112:astore          4
			if(view.getId() == android.support.v7.appcompat.R.id.list_item) goto _L9; else goto _L8
		//   44  114:aload_2         
		//   45  115:invokevirtual   #88  <Method int View.getId()>
		//   46  118:getstatic       #142 <Field int android.support.v7.appcompat.R$id.list_item>
		//   47  121:icmpeq          144
_L8:
			view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
		//   48  124:aload_0         
		//   49  125:getfield        #28  <Field ActivityChooserView this$0>
		//   50  128:invokevirtual   #94  <Method Context ActivityChooserView.getContext()>
		//   51  131:invokestatic    #100 <Method LayoutInflater LayoutInflater.from(Context)>
		//   52  134:getstatic       #105 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
		//   53  137:aload_3         
		//   54  138:iconst_0        
		//   55  139:invokevirtual   #109 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   56  142:astore          4
_L9:
			view = ((View) (getContext().getPackageManager()));
		//   57  144:aload_0         
		//   58  145:getfield        #28  <Field ActivityChooserView this$0>
		//   59  148:invokevirtual   #94  <Method Context ActivityChooserView.getContext()>
		//   60  151:invokevirtual   #146 <Method android.content.pm.PackageManager Context.getPackageManager()>
		//   61  154:astore_2        
			viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon)));
		//   62  155:aload           4
		//   63  157:getstatic       #149 <Field int android.support.v7.appcompat.R$id.icon>
		//   64  160:invokevirtual   #122 <Method View View.findViewById(int)>
		//   65  163:checkcast       #151 <Class ImageView>
		//   66  166:astore_3        
			ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
		//   67  167:aload_0         
		//   68  168:iload_1         
		//   69  169:invokevirtual   #153 <Method Object getItem(int)>
		//   70  172:checkcast       #155 <Class ResolveInfo>
		//   71  175:astore          5
			((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
		//   72  177:aload_3         
		//   73  178:aload           5
		//   74  180:aload_2         
		//   75  181:invokevirtual   #159 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
		//   76  184:invokevirtual   #163 <Method void ImageView.setImageDrawable(Drawable)>
			((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
		//   77  187:aload           4
		//   78  189:getstatic       #118 <Field int android.support.v7.appcompat.R$id.title>
		//   79  192:invokevirtual   #122 <Method View View.findViewById(int)>
		//   80  195:checkcast       #124 <Class TextView>
		//   81  198:aload           5
		//   82  200:aload_2         
		//   83  201:invokevirtual   #167 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
		//   84  204:invokevirtual   #139 <Method void TextView.setText(CharSequence)>
			if(mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
		//*  85  207:aload_0         
		//*  86  208:getfield        #45  <Field boolean mShowDefaultActivity>
		//*  87  211:ifeq            234
		//*  88  214:iload_1         
		//*  89  215:ifne            234
		//*  90  218:aload_0         
		//*  91  219:getfield        #169 <Field boolean mHighlightDefaultActivity>
		//*  92  222:ifeq            234
			{
				view1.setActivated(true);
		//   93  225:aload           4
		//   94  227:iconst_1        
		//   95  228:invokevirtual   #173 <Method void View.setActivated(boolean)>
				return view1;
		//   96  231:aload           4
		//   97  233:areturn         
			} else
			{
				view1.setActivated(false);
		//   98  234:aload           4
		//   99  236:iconst_0        
		//  100  237:invokevirtual   #173 <Method void View.setActivated(boolean)>
				return view1;
		//  101  240:aload           4
		//  102  242:areturn         
			}
		}

		public int getViewTypeCount()
		{
			return 3;
		//    0    0:iconst_3        
		//    1    1:ireturn         
		}

		public int measureContentWidth()
		{
			int k = mMaxActivityCount;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int mMaxActivityCount>
		//    2    4:istore_3        
			mMaxActivityCount = 0x7fffffff;
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <Int 0x7fffffff>
		//    5    8:putfield        #33  <Field int mMaxActivityCount>
			int i = 0;
		//    6   11:iconst_0        
		//    7   12:istore_1        
			int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//    8   13:iconst_0        
		//    9   14:iconst_0        
		//   10   15:invokestatic    #180 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   11   18:istore          4
			int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//   12   20:iconst_0        
		//   13   21:iconst_0        
		//   14   22:invokestatic    #180 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   15   25:istore          5
			int j1 = getCount();
		//   16   27:aload_0         
		//   17   28:invokevirtual   #79  <Method int getCount()>
		//   18   31:istore          6
			View view = null;
		//   19   33:aconst_null     
		//   20   34:astore          7
			int j = 0;
		//   21   36:iconst_0        
		//   22   37:istore_2        
			for(; i < j1; i++)
		//*  23   38:iload_1         
		//*  24   39:iload           6
		//*  25   41:icmpge          80
			{
				view = getView(i, view, ((ViewGroup) (null)));
		//   26   44:aload_0         
		//   27   45:iload_1         
		//   28   46:aload           7
		//   29   48:aconst_null     
		//   30   49:invokevirtual   #182 <Method View getView(int, View, ViewGroup)>
		//   31   52:astore          7
				view.measure(l, i1);
		//   32   54:aload           7
		//   33   56:iload           4
		//   34   58:iload           5
		//   35   60:invokevirtual   #186 <Method void View.measure(int, int)>
				j = Math.max(j, view.getMeasuredWidth());
		//   36   63:iload_2         
		//   37   64:aload           7
		//   38   66:invokevirtual   #189 <Method int View.getMeasuredWidth()>
		//   39   69:invokestatic    #192 <Method int Math.max(int, int)>
		//   40   72:istore_2        
			}

		//   41   73:iload_1         
		//   42   74:iconst_1        
		//   43   75:iadd            
		//   44   76:istore_1        
		//*  45   77:goto            38
			mMaxActivityCount = k;
		//   46   80:aload_0         
		//   47   81:iload_3         
		//   48   82:putfield        #33  <Field int mMaxActivityCount>
			return j;
		//   49   85:iload_2         
		//   50   86:ireturn         
		}

		public void setDataModel(ActivityChooserModel activitychoosermodel)
		{
			ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ActivityChooserView this$0>
		//    2    4:getfield        #198 <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
		//    3    7:invokevirtual   #200 <Method ActivityChooserModel getDataModel()>
		//    4   10:astore_2        
			if(activitychoosermodel1 != null && isShown())
		//*   5   11:aload_2         
		//*   6   12:ifnull          36
		//*   7   15:aload_0         
		//*   8   16:getfield        #28  <Field ActivityChooserView this$0>
		//*   9   19:invokevirtual   #203 <Method boolean ActivityChooserView.isShown()>
		//*  10   22:ifeq            36
				activitychoosermodel1.unregisterObserver(((Object) (mModelDataSetObserver)));
		//   11   25:aload_2         
		//   12   26:aload_0         
		//   13   27:getfield        #28  <Field ActivityChooserView this$0>
		//   14   30:getfield        #207 <Field DataSetObserver ActivityChooserView.mModelDataSetObserver>
		//   15   33:invokevirtual   #211 <Method void ActivityChooserModel.unregisterObserver(Object)>
			mDataModel = activitychoosermodel;
		//   16   36:aload_0         
		//   17   37:aload_1         
		//   18   38:putfield        #38  <Field ActivityChooserModel mDataModel>
			if(activitychoosermodel != null && isShown())
		//*  19   41:aload_1         
		//*  20   42:ifnull          66
		//*  21   45:aload_0         
		//*  22   46:getfield        #28  <Field ActivityChooserView this$0>
		//*  23   49:invokevirtual   #203 <Method boolean ActivityChooserView.isShown()>
		//*  24   52:ifeq            66
				activitychoosermodel.registerObserver(((Object) (mModelDataSetObserver)));
		//   25   55:aload_1         
		//   26   56:aload_0         
		//   27   57:getfield        #28  <Field ActivityChooserView this$0>
		//   28   60:getfield        #207 <Field DataSetObserver ActivityChooserView.mModelDataSetObserver>
		//   29   63:invokevirtual   #214 <Method void ActivityChooserModel.registerObserver(Object)>
			notifyDataSetChanged();
		//   30   66:aload_0         
		//   31   67:invokevirtual   #217 <Method void notifyDataSetChanged()>
		//   32   70:return          
		}

		public void setMaxActivityCount(int i)
		{
			if(mMaxActivityCount != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int mMaxActivityCount>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mMaxActivityCount = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #33  <Field int mMaxActivityCount>
				notifyDataSetChanged();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #217 <Method void notifyDataSetChanged()>
			}
		//    9   17:return          
		}

		public void setShowDefaultActivity(boolean flag, boolean flag1)
		{
			if(mShowDefaultActivity != flag || mHighlightDefaultActivity != flag1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field boolean mShowDefaultActivity>
		//*   2    4:iload_1         
		//*   3    5:icmpne          16
		//*   4    8:aload_0         
		//*   5    9:getfield        #169 <Field boolean mHighlightDefaultActivity>
		//*   6   12:iload_2         
		//*   7   13:icmpeq          30
			{
				mShowDefaultActivity = flag;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #45  <Field boolean mShowDefaultActivity>
				mHighlightDefaultActivity = flag1;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #169 <Field boolean mHighlightDefaultActivity>
				notifyDataSetChanged();
		//   14   26:aload_0         
		//   15   27:invokevirtual   #217 <Method void notifyDataSetChanged()>
			}
		//   16   30:return          
		}

		public void setShowFooterView(boolean flag)
		{
			if(mShowFooterView != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #57  <Field boolean mShowFooterView>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mShowFooterView = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #57  <Field boolean mShowFooterView>
				notifyDataSetChanged();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #217 <Method void notifyDataSetChanged()>
			}
		//    9   17:return          
		}

		private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
		private static final int ITEM_VIEW_TYPE_COUNT = 3;
		private static final int ITEM_VIEW_TYPE_FOOTER = 1;
		public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
		public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
		private ActivityChooserModel mDataModel;
		private boolean mHighlightDefaultActivity;
		private int mMaxActivityCount;
		private boolean mShowDefaultActivity;
		private boolean mShowFooterView;
		final ActivityChooserView this$0;

		ActivityChooserViewAdapter()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void BaseAdapter()>
			mMaxActivityCount = 4;
		//    5    9:aload_0         
		//    6   10:iconst_4        
		//    7   11:putfield        #33  <Field int mMaxActivityCount>
		//    8   14:return          
		}
	}


	private class _cls5 extends DataSetObserver
	{

		public void onChanged()
		{
			super.onChanged();
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void DataSetObserver.onChanged()>
			updateAppearance();
		//    2    4:aload_0         
		//    3    5:getfield        #10  <Field ActivityChooserView this$0>
		//    4    8:invokevirtual   #22  <Method void ActivityChooserView.updateAppearance()>
		//    5   11:return          
		}

		final ActivityChooserView this$0;

		_cls5()
		{
			this$0 = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActivityChooserView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

}
