// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.widget.TextView;

class TooltipPopup
{

	TooltipPopup(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class android.view.WindowManager$LayoutParams>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void android.view.WindowManager$LayoutParams()>
	//    6   12:putfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//    7   15:aload_0         
	//    8   16:new             #37  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void Rect()>
	//   11   23:putfield        #40  <Field Rect mTmpDisplayFrame>
	//   12   26:aload_0         
	//   13   27:iconst_2        
	//   14   28:newarray        int[]
	//   15   30:putfield        #42  <Field int[] mTmpAnchorPos>
	//   16   33:aload_0         
	//   17   34:iconst_2        
	//   18   35:newarray        int[]
	//   19   37:putfield        #44  <Field int[] mTmpAppPos>
		mContext = context;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #46  <Field Context mContext>
		mContentView = LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.tooltip, ((android.view.ViewGroup) (null)));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #46  <Field Context mContext>
	//   26   50:invokestatic    #52  <Method LayoutInflater LayoutInflater.from(Context)>
	//   27   53:getstatic       #58  <Field int android.support.v7.appcompat.R$layout.tooltip>
	//   28   56:aconst_null     
	//   29   57:invokevirtual   #62  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   30   60:putfield        #64  <Field View mContentView>
		mMessageView = (TextView)mContentView.findViewById(android.support.v7.appcompat.R.id.message);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #64  <Field View mContentView>
	//   34   68:getstatic       #69  <Field int android.support.v7.appcompat.R$id.message>
	//   35   71:invokevirtual   #75  <Method View View.findViewById(int)>
	//   36   74:checkcast       #77  <Class TextView>
	//   37   77:putfield        #79  <Field TextView mMessageView>
		mLayoutParams.setTitle(((CharSequence) (((Object)this).getClass().getSimpleName())));
	//   38   80:aload_0         
	//   39   81:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   40   84:aload_0         
	//   41   85:invokevirtual   #83  <Method Class Object.getClass()>
	//   42   88:invokevirtual   #89  <Method String Class.getSimpleName()>
	//   43   91:invokevirtual   #93  <Method void android.view.WindowManager$LayoutParams.setTitle(CharSequence)>
		mLayoutParams.packageName = mContext.getPackageName();
	//   44   94:aload_0         
	//   45   95:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   46   98:aload_0         
	//   47   99:getfield        #46  <Field Context mContext>
	//   48  102:invokevirtual   #98  <Method String Context.getPackageName()>
	//   49  105:putfield        #101 <Field String android.view.WindowManager$LayoutParams.packageName>
		mLayoutParams.type = 1002;
	//   50  108:aload_0         
	//   51  109:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   52  112:sipush          1002
	//   53  115:putfield        #104 <Field int android.view.WindowManager$LayoutParams.type>
		mLayoutParams.width = -2;
	//   54  118:aload_0         
	//   55  119:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   56  122:bipush          -2
	//   57  124:putfield        #107 <Field int android.view.WindowManager$LayoutParams.width>
		mLayoutParams.height = -2;
	//   58  127:aload_0         
	//   59  128:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   60  131:bipush          -2
	//   61  133:putfield        #110 <Field int android.view.WindowManager$LayoutParams.height>
		mLayoutParams.format = -3;
	//   62  136:aload_0         
	//   63  137:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   64  140:bipush          -3
	//   65  142:putfield        #113 <Field int android.view.WindowManager$LayoutParams.format>
		mLayoutParams.windowAnimations = android.support.v7.appcompat.R.style.Animation_AppCompat_Tooltip;
	//   66  145:aload_0         
	//   67  146:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   68  149:getstatic       #118 <Field int android.support.v7.appcompat.R$style.Animation_AppCompat_Tooltip>
	//   69  152:putfield        #121 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		mLayoutParams.flags = 24;
	//   70  155:aload_0         
	//   71  156:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   72  159:bipush          24
	//   73  161:putfield        #124 <Field int android.view.WindowManager$LayoutParams.flags>
	//   74  164:return          
	}

	private void computePosition(View view, int i, int j, boolean flag, android.view.WindowManager.LayoutParams layoutparams)
	{
		int k = mContext.getResources().getDimensionPixelOffset(android.support.v7.appcompat.R.dimen.tooltip_precise_anchor_threshold);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Context mContext>
	//    2    4:invokevirtual   #131 <Method Resources Context.getResources()>
	//    3    7:getstatic       #136 <Field int android.support.v7.appcompat.R$dimen.tooltip_precise_anchor_threshold>
	//    4   10:invokevirtual   #142 <Method int Resources.getDimensionPixelOffset(int)>
	//    5   13:istore          6
		int i1;
		int k1;
		Object obj;
		if(view.getWidth() < k)
	//*   6   15:aload_1         
	//*   7   16:invokevirtual   #146 <Method int View.getWidth()>
	//*   8   19:iload           6
	//*   9   21:icmplt          122
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #149 <Method int View.getHeight()>
	//*  12   28:iload           6
	//*  13   30:icmplt          132
	//*  14   33:aload_0         
	//*  15   34:getfield        #46  <Field Context mContext>
	//*  16   37:invokevirtual   #131 <Method Resources Context.getResources()>
	//*  17   40:getstatic       #152 <Field int android.support.v7.appcompat.R$dimen.tooltip_precise_anchor_extra_offset>
	//*  18   43:invokevirtual   #142 <Method int Resources.getDimensionPixelOffset(int)>
	//*  19   46:istore          7
	//*  20   48:iload_3         
	//*  21   49:iload           7
	//*  22   51:iadd            
	//*  23   52:istore          6
	//*  24   54:iload_3         
	//*  25   55:iload           7
	//*  26   57:isub            
	//*  27   58:istore          7
	//*  28   60:iload           6
	//*  29   62:istore_3        
	//*  30   63:iload           7
	//*  31   65:istore          6
	//*  32   67:aload           5
	//*  33   69:bipush          49
	//*  34   71:putfield        #155 <Field int android.view.WindowManager$LayoutParams.gravity>
	//*  35   74:aload_0         
	//*  36   75:getfield        #46  <Field Context mContext>
	//*  37   78:invokevirtual   #131 <Method Resources Context.getResources()>
	//*  38   81:astore          9
	//*  39   83:iload           4
	//*  40   85:ifeq            143
	//*  41   88:getstatic       #158 <Field int android.support.v7.appcompat.R$dimen.tooltip_y_offset_touch>
	//*  42   91:istore          7
	//*  43   93:aload           9
	//*  44   95:iload           7
	//*  45   97:invokevirtual   #142 <Method int Resources.getDimensionPixelOffset(int)>
	//*  46  100:istore          8
	//*  47  102:aload_1         
	//*  48  103:invokestatic    #162 <Method View getAppRootView(View)>
	//*  49  106:astore          9
	//*  50  108:aload           9
	//*  51  110:ifnonnull       151
	//*  52  113:ldc1            #12  <String "TooltipPopup">
	//*  53  115:ldc1            #164 <String "Cannot find app view">
	//*  54  117:invokestatic    #170 <Method int Log.e(String, String)>
	//*  55  120:pop             
	//*  56  121:return          
			i = view.getWidth() / 2;
	//   57  122:aload_1         
	//   58  123:invokevirtual   #146 <Method int View.getWidth()>
	//   59  126:iconst_2        
	//   60  127:idiv            
	//   61  128:istore_2        
		if(view.getHeight() >= k)
		{
			int l = mContext.getResources().getDimensionPixelOffset(android.support.v7.appcompat.R.dimen.tooltip_precise_anchor_extra_offset);
			k = j + l;
			l = j - l;
			j = k;
			k = l;
		} else
	//*  62  129:goto            24
		{
			j = view.getHeight();
	//   63  132:aload_1         
	//   64  133:invokevirtual   #149 <Method int View.getHeight()>
	//   65  136:istore_3        
			k = 0;
	//   66  137:iconst_0        
	//   67  138:istore          6
		}
		layoutparams.gravity = 49;
		obj = ((Object) (mContext.getResources()));
		if(flag)
			i1 = android.support.v7.appcompat.R.dimen.tooltip_y_offset_touch;
		else
	//*  68  140:goto            67
			i1 = android.support.v7.appcompat.R.dimen.tooltip_y_offset_non_touch;
	//   69  143:getstatic       #173 <Field int android.support.v7.appcompat.R$dimen.tooltip_y_offset_non_touch>
	//   70  146:istore          7
		k1 = ((Resources) (obj)).getDimensionPixelOffset(i1);
		obj = ((Object) (getAppRootView(view)));
		if(obj == null)
		{
			Log.e("TooltipPopup", "Cannot find app view");
			return;
		}
	//*  71  148:goto            93
		((View) (obj)).getWindowVisibleDisplayFrame(mTmpDisplayFrame);
	//   72  151:aload           9
	//   73  153:aload_0         
	//   74  154:getfield        #40  <Field Rect mTmpDisplayFrame>
	//   75  157:invokevirtual   #177 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mTmpDisplayFrame.left < 0 && mTmpDisplayFrame.top < 0)
	//*  76  160:aload_0         
	//*  77  161:getfield        #40  <Field Rect mTmpDisplayFrame>
	//*  78  164:getfield        #180 <Field int Rect.left>
	//*  79  167:ifge            243
	//*  80  170:aload_0         
	//*  81  171:getfield        #40  <Field Rect mTmpDisplayFrame>
	//*  82  174:getfield        #183 <Field int Rect.top>
	//*  83  177:ifge            243
		{
			Object obj1 = ((Object) (mContext.getResources()));
	//   84  180:aload_0         
	//   85  181:getfield        #46  <Field Context mContext>
	//   86  184:invokevirtual   #131 <Method Resources Context.getResources()>
	//   87  187:astore          10
			int j1 = ((Resources) (obj1)).getIdentifier("status_bar_height", "dimen", "android");
	//   88  189:aload           10
	//   89  191:ldc1            #185 <String "status_bar_height">
	//   90  193:ldc1            #187 <String "dimen">
	//   91  195:ldc1            #189 <String "android">
	//   92  197:invokevirtual   #193 <Method int Resources.getIdentifier(String, String, String)>
	//   93  200:istore          7
			if(j1 != 0)
	//*  94  202:iload           7
	//*  95  204:ifeq            388
				j1 = ((Resources) (obj1)).getDimensionPixelSize(j1);
	//   96  207:aload           10
	//   97  209:iload           7
	//   98  211:invokevirtual   #196 <Method int Resources.getDimensionPixelSize(int)>
	//   99  214:istore          7
			else
	//* 100  216:aload           10
	//* 101  218:invokevirtual   #200 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 102  221:astore          10
	//* 103  223:aload_0         
	//* 104  224:getfield        #40  <Field Rect mTmpDisplayFrame>
	//* 105  227:iconst_0        
	//* 106  228:iload           7
	//* 107  230:aload           10
	//* 108  232:getfield        #205 <Field int DisplayMetrics.widthPixels>
	//* 109  235:aload           10
	//* 110  237:getfield        #208 <Field int DisplayMetrics.heightPixels>
	//* 111  240:invokevirtual   #212 <Method void Rect.set(int, int, int, int)>
	//* 112  243:aload           9
	//* 113  245:aload_0         
	//* 114  246:getfield        #44  <Field int[] mTmpAppPos>
	//* 115  249:invokevirtual   #216 <Method void View.getLocationOnScreen(int[])>
	//* 116  252:aload_1         
	//* 117  253:aload_0         
	//* 118  254:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 119  257:invokevirtual   #216 <Method void View.getLocationOnScreen(int[])>
	//* 120  260:aload_0         
	//* 121  261:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 122  264:astore_1        
	//* 123  265:aload_1         
	//* 124  266:iconst_0        
	//* 125  267:aload_1         
	//* 126  268:iconst_0        
	//* 127  269:iaload          
	//* 128  270:aload_0         
	//* 129  271:getfield        #44  <Field int[] mTmpAppPos>
	//* 130  274:iconst_0        
	//* 131  275:iaload          
	//* 132  276:isub            
	//* 133  277:iastore         
	//* 134  278:aload_0         
	//* 135  279:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 136  282:astore_1        
	//* 137  283:aload_1         
	//* 138  284:iconst_1        
	//* 139  285:aload_1         
	//* 140  286:iconst_1        
	//* 141  287:iaload          
	//* 142  288:aload_0         
	//* 143  289:getfield        #44  <Field int[] mTmpAppPos>
	//* 144  292:iconst_1        
	//* 145  293:iaload          
	//* 146  294:isub            
	//* 147  295:iastore         
	//* 148  296:aload           5
	//* 149  298:aload_0         
	//* 150  299:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 151  302:iconst_0        
	//* 152  303:iaload          
	//* 153  304:iload_2         
	//* 154  305:iadd            
	//* 155  306:aload_0         
	//* 156  307:getfield        #40  <Field Rect mTmpDisplayFrame>
	//* 157  310:invokevirtual   #218 <Method int Rect.width()>
	//* 158  313:iconst_2        
	//* 159  314:idiv            
	//* 160  315:isub            
	//* 161  316:putfield        #221 <Field int android.view.WindowManager$LayoutParams.x>
	//* 162  319:iconst_0        
	//* 163  320:iconst_0        
	//* 164  321:invokestatic    #227 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 165  324:istore_2        
	//* 166  325:aload_0         
	//* 167  326:getfield        #64  <Field View mContentView>
	//* 168  329:iload_2         
	//* 169  330:iload_2         
	//* 170  331:invokevirtual   #231 <Method void View.measure(int, int)>
	//* 171  334:aload_0         
	//* 172  335:getfield        #64  <Field View mContentView>
	//* 173  338:invokevirtual   #234 <Method int View.getMeasuredHeight()>
	//* 174  341:istore_2        
	//* 175  342:iload           6
	//* 176  344:aload_0         
	//* 177  345:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 178  348:iconst_1        
	//* 179  349:iaload          
	//* 180  350:iadd            
	//* 181  351:iload           8
	//* 182  353:isub            
	//* 183  354:iload_2         
	//* 184  355:isub            
	//* 185  356:istore          6
	//* 186  358:iload_3         
	//* 187  359:aload_0         
	//* 188  360:getfield        #42  <Field int[] mTmpAnchorPos>
	//* 189  363:iconst_1        
	//* 190  364:iaload          
	//* 191  365:iadd            
	//* 192  366:iload           8
	//* 193  368:iadd            
	//* 194  369:istore_3        
	//* 195  370:iload           4
	//* 196  372:ifeq            401
	//* 197  375:iload           6
	//* 198  377:iflt            394
	//* 199  380:aload           5
	//* 200  382:iload           6
	//* 201  384:putfield        #237 <Field int android.view.WindowManager$LayoutParams.y>
	//* 202  387:return          
				j1 = 0;
	//  203  388:iconst_0        
	//  204  389:istore          7
			obj1 = ((Object) (((Resources) (obj1)).getDisplayMetrics()));
			mTmpDisplayFrame.set(0, j1, ((DisplayMetrics) (obj1)).widthPixels, ((DisplayMetrics) (obj1)).heightPixels);
		}
		((View) (obj)).getLocationOnScreen(mTmpAppPos);
		view.getLocationOnScreen(mTmpAnchorPos);
		view = ((View) (mTmpAnchorPos));
		view[0] = view[0] - mTmpAppPos[0];
		view = ((View) (mTmpAnchorPos));
		view[1] = view[1] - mTmpAppPos[1];
		layoutparams.x = (mTmpAnchorPos[0] + i) - mTmpDisplayFrame.width() / 2;
		i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		mContentView.measure(i, i);
		i = mContentView.getMeasuredHeight();
		k = (k + mTmpAnchorPos[1]) - k1 - i;
		j = j + mTmpAnchorPos[1] + k1;
		if(flag)
			if(k >= 0)
			{
				layoutparams.y = k;
				return;
			} else
	//* 205  391:goto            216
			{
				layoutparams.y = j;
	//  206  394:aload           5
	//  207  396:iload_3         
	//  208  397:putfield        #237 <Field int android.view.WindowManager$LayoutParams.y>
				return;
	//  209  400:return          
			}
		if(i + j <= mTmpDisplayFrame.height())
	//* 210  401:iload_2         
	//* 211  402:iload_3         
	//* 212  403:iadd            
	//* 213  404:aload_0         
	//* 214  405:getfield        #40  <Field Rect mTmpDisplayFrame>
	//* 215  408:invokevirtual   #239 <Method int Rect.height()>
	//* 216  411:icmpgt          421
		{
			layoutparams.y = j;
	//  217  414:aload           5
	//  218  416:iload_3         
	//  219  417:putfield        #237 <Field int android.view.WindowManager$LayoutParams.y>
			return;
	//  220  420:return          
		} else
		{
			layoutparams.y = k;
	//  221  421:aload           5
	//  222  423:iload           6
	//  223  425:putfield        #237 <Field int android.view.WindowManager$LayoutParams.y>
			return;
	//  224  428:return          
		}
	}

	private static View getAppRootView(View view)
	{
		for(Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #243 <Method Context View.getContext()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:instanceof      #245 <Class ContextWrapper>
	//*   5    9:ifeq            41
			if(context instanceof Activity)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #247 <Class Activity>
	//*   8   16:ifeq            30
				return ((Activity)context).getWindow().getDecorView();
	//    9   19:aload_1         
	//   10   20:checkcast       #247 <Class Activity>
	//   11   23:invokevirtual   #251 <Method Window Activity.getWindow()>
	//   12   26:invokevirtual   #257 <Method View Window.getDecorView()>
	//   13   29:areturn         

	//   14   30:aload_1         
	//   15   31:checkcast       #245 <Class ContextWrapper>
	//   16   34:invokevirtual   #260 <Method Context ContextWrapper.getBaseContext()>
	//   17   37:astore_1        
	//*  18   38:goto            5
		return view.getRootView();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #263 <Method View View.getRootView()>
	//   21   45:areturn         
	}

	void hide()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #268 <Method boolean isShowing()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			((WindowManager)mContext.getSystemService("window")).removeView(mContentView);
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field Context mContext>
	//    6   12:ldc2            #270 <String "window">
	//    7   15:invokevirtual   #274 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #276 <Class WindowManager>
	//    9   21:aload_0         
	//   10   22:getfield        #64  <Field View mContentView>
	//   11   25:invokeinterface #280 <Method void WindowManager.removeView(View)>
			return;
	//   12   30:return          
		}
	}

	boolean isShowing()
	{
		return mContentView.getParent() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field View mContentView>
	//    2    4:invokevirtual   #284 <Method android.view.ViewParent View.getParent()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	void show(View view, int i, int j, boolean flag, CharSequence charsequence)
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #268 <Method boolean isShowing()>
	//*   2    4:ifeq            11
			hide();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #288 <Method void hide()>
		mMessageView.setText(charsequence);
	//    5   11:aload_0         
	//    6   12:getfield        #79  <Field TextView mMessageView>
	//    7   15:aload           5
	//    8   17:invokevirtual   #291 <Method void TextView.setText(CharSequence)>
		computePosition(view, i, j, flag, mLayoutParams);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:iload_2         
	//   12   23:iload_3         
	//   13   24:iload           4
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   16   30:invokespecial   #293 <Method void computePosition(View, int, int, boolean, android.view.WindowManager$LayoutParams)>
		((WindowManager)mContext.getSystemService("window")).addView(mContentView, ((android.view.ViewGroup.LayoutParams) (mLayoutParams)));
	//   17   33:aload_0         
	//   18   34:getfield        #46  <Field Context mContext>
	//   19   37:ldc2            #270 <String "window">
	//   20   40:invokevirtual   #274 <Method Object Context.getSystemService(String)>
	//   21   43:checkcast       #276 <Class WindowManager>
	//   22   46:aload_0         
	//   23   47:getfield        #64  <Field View mContentView>
	//   24   50:aload_0         
	//   25   51:getfield        #35  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   26   54:invokeinterface #297 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
	//   27   59:return          
	}

	private static final String TAG = "TooltipPopup";
	private final View mContentView;
	private final Context mContext;
	private final android.view.WindowManager.LayoutParams mLayoutParams = new android.view.WindowManager.LayoutParams();
	private final TextView mMessageView;
	private final int mTmpAnchorPos[] = new int[2];
	private final int mTmpAppPos[] = new int[2];
	private final Rect mTmpDisplayFrame = new Rect();
}
