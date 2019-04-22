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
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class android.view.WindowManager$LayoutParams>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void android.view.WindowManager$LayoutParams()>
	//    6   12:putfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void Rect()>
	//   11   23:putfield        #36  <Field Rect mTmpDisplayFrame>
	//   12   26:aload_0         
	//   13   27:iconst_2        
	//   14   28:newarray        int[]
	//   15   30:putfield        #38  <Field int[] mTmpAnchorPos>
	//   16   33:aload_0         
	//   17   34:iconst_2        
	//   18   35:newarray        int[]
	//   19   37:putfield        #40  <Field int[] mTmpAppPos>
		mContext = context;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #42  <Field Context mContext>
		mContentView = LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.abc_tooltip, ((android.view.ViewGroup) (null)));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #42  <Field Context mContext>
	//   26   50:invokestatic    #48  <Method LayoutInflater LayoutInflater.from(Context)>
	//   27   53:getstatic       #54  <Field int android.support.v7.appcompat.R$layout.abc_tooltip>
	//   28   56:aconst_null     
	//   29   57:invokevirtual   #58  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   30   60:putfield        #60  <Field View mContentView>
		mMessageView = (TextView)mContentView.findViewById(android.support.v7.appcompat.R.id.message);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #60  <Field View mContentView>
	//   34   68:getstatic       #65  <Field int android.support.v7.appcompat.R$id.message>
	//   35   71:invokevirtual   #71  <Method View View.findViewById(int)>
	//   36   74:checkcast       #73  <Class TextView>
	//   37   77:putfield        #75  <Field TextView mMessageView>
		mLayoutParams.setTitle(((CharSequence) (((Object)this).getClass().getSimpleName())));
	//   38   80:aload_0         
	//   39   81:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   40   84:aload_0         
	//   41   85:invokevirtual   #79  <Method Class Object.getClass()>
	//   42   88:invokevirtual   #85  <Method String Class.getSimpleName()>
	//   43   91:invokevirtual   #89  <Method void android.view.WindowManager$LayoutParams.setTitle(CharSequence)>
		mLayoutParams.packageName = mContext.getPackageName();
	//   44   94:aload_0         
	//   45   95:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   46   98:aload_0         
	//   47   99:getfield        #42  <Field Context mContext>
	//   48  102:invokevirtual   #94  <Method String Context.getPackageName()>
	//   49  105:putfield        #98  <Field String android.view.WindowManager$LayoutParams.packageName>
		context = ((Context) (mLayoutParams));
	//   50  108:aload_0         
	//   51  109:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   52  112:astore_1        
		context.type = 1002;
	//   53  113:aload_1         
	//   54  114:sipush          1002
	//   55  117:putfield        #101 <Field int android.view.WindowManager$LayoutParams.type>
		context.width = -2;
	//   56  120:aload_1         
	//   57  121:bipush          -2
	//   58  123:putfield        #104 <Field int android.view.WindowManager$LayoutParams.width>
		context.height = -2;
	//   59  126:aload_1         
	//   60  127:bipush          -2
	//   61  129:putfield        #107 <Field int android.view.WindowManager$LayoutParams.height>
		context.format = -3;
	//   62  132:aload_1         
	//   63  133:bipush          -3
	//   64  135:putfield        #110 <Field int android.view.WindowManager$LayoutParams.format>
		context.windowAnimations = android.support.v7.appcompat.R.style.Animation_AppCompat_Tooltip;
	//   65  138:aload_1         
	//   66  139:getstatic       #115 <Field int android.support.v7.appcompat.R$style.Animation_AppCompat_Tooltip>
	//   67  142:putfield        #118 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		mLayoutParams.flags = 24;
	//   68  145:aload_0         
	//   69  146:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   70  149:bipush          24
	//   71  151:putfield        #121 <Field int android.view.WindowManager$LayoutParams.flags>
	//   72  154:return          
	}

	private void computePosition(View view, int i, int j, boolean flag, android.view.WindowManager.LayoutParams layoutparams)
	{
		layoutparams.token = view.getApplicationWindowToken();
	//    0    0:aload           5
	//    1    2:aload_1         
	//    2    3:invokevirtual   #128 <Method android.os.IBinder View.getApplicationWindowToken()>
	//    3    6:putfield        #132 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
		int k = mContext.getResources().getDimensionPixelOffset(android.support.v7.appcompat.R.dimen.tooltip_precise_anchor_threshold);
	//    4    9:aload_0         
	//    5   10:getfield        #42  <Field Context mContext>
	//    6   13:invokevirtual   #136 <Method Resources Context.getResources()>
	//    7   16:getstatic       #141 <Field int android.support.v7.appcompat.R$dimen.tooltip_precise_anchor_threshold>
	//    8   19:invokevirtual   #147 <Method int Resources.getDimensionPixelOffset(int)>
	//    9   22:istore          6
		if(view.getWidth() < k)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #151 <Method int View.getWidth()>
	//*  12   28:iload           6
	//*  13   30:icmplt          36
	//*  14   33:goto            43
			i = view.getWidth() / 2;
	//   15   36:aload_1         
	//   16   37:invokevirtual   #151 <Method int View.getWidth()>
	//   17   40:iconst_2        
	//   18   41:idiv            
	//   19   42:istore_2        
		if(view.getHeight() >= k)
	//*  20   43:aload_1         
	//*  21   44:invokevirtual   #154 <Method int View.getHeight()>
	//*  22   47:iload           6
	//*  23   49:icmplt          89
		{
			int l = mContext.getResources().getDimensionPixelOffset(android.support.v7.appcompat.R.dimen.tooltip_precise_anchor_extra_offset);
	//   24   52:aload_0         
	//   25   53:getfield        #42  <Field Context mContext>
	//   26   56:invokevirtual   #136 <Method Resources Context.getResources()>
	//   27   59:getstatic       #157 <Field int android.support.v7.appcompat.R$dimen.tooltip_precise_anchor_extra_offset>
	//   28   62:invokevirtual   #147 <Method int Resources.getDimensionPixelOffset(int)>
	//   29   65:istore          7
			k = j + l;
	//   30   67:iload_3         
	//   31   68:iload           7
	//   32   70:iadd            
	//   33   71:istore          6
			l = j - l;
	//   34   73:iload_3         
	//   35   74:iload           7
	//   36   76:isub            
	//   37   77:istore          7
			j = k;
	//   38   79:iload           6
	//   39   81:istore_3        
			k = l;
	//   40   82:iload           7
	//   41   84:istore          6
		} else
	//*  42   86:goto            97
		{
			j = view.getHeight();
	//   43   89:aload_1         
	//   44   90:invokevirtual   #154 <Method int View.getHeight()>
	//   45   93:istore_3        
			k = 0;
	//   46   94:iconst_0        
	//   47   95:istore          6
		}
		layoutparams.gravity = 49;
	//   48   97:aload           5
	//   49   99:bipush          49
	//   50  101:putfield        #160 <Field int android.view.WindowManager$LayoutParams.gravity>
		Object obj = ((Object) (mContext.getResources()));
	//   51  104:aload_0         
	//   52  105:getfield        #42  <Field Context mContext>
	//   53  108:invokevirtual   #136 <Method Resources Context.getResources()>
	//   54  111:astore          9
		int i1;
		if(flag)
	//*  55  113:iload           4
	//*  56  115:ifeq            126
			i1 = android.support.v7.appcompat.R.dimen.tooltip_y_offset_touch;
	//   57  118:getstatic       #163 <Field int android.support.v7.appcompat.R$dimen.tooltip_y_offset_touch>
	//   58  121:istore          7
		else
	//*  59  123:goto            131
			i1 = android.support.v7.appcompat.R.dimen.tooltip_y_offset_non_touch;
	//   60  126:getstatic       #166 <Field int android.support.v7.appcompat.R$dimen.tooltip_y_offset_non_touch>
	//   61  129:istore          7
		int j1 = ((Resources) (obj)).getDimensionPixelOffset(i1);
	//   62  131:aload           9
	//   63  133:iload           7
	//   64  135:invokevirtual   #147 <Method int Resources.getDimensionPixelOffset(int)>
	//   65  138:istore          8
		obj = ((Object) (getAppRootView(view)));
	//   66  140:aload_1         
	//   67  141:invokestatic    #170 <Method View getAppRootView(View)>
	//   68  144:astore          9
		if(obj == null)
	//*  69  146:aload           9
	//*  70  148:ifnonnull       160
		{
			Log.e("TooltipPopup", "Cannot find app view");
	//   71  151:ldc1            #172 <String "TooltipPopup">
	//   72  153:ldc1            #174 <String "Cannot find app view">
	//   73  155:invokestatic    #180 <Method int Log.e(String, String)>
	//   74  158:pop             
			return;
	//   75  159:return          
		}
		((View) (obj)).getWindowVisibleDisplayFrame(mTmpDisplayFrame);
	//   76  160:aload           9
	//   77  162:aload_0         
	//   78  163:getfield        #36  <Field Rect mTmpDisplayFrame>
	//   79  166:invokevirtual   #184 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mTmpDisplayFrame.left < 0 && mTmpDisplayFrame.top < 0)
	//*  80  169:aload_0         
	//*  81  170:getfield        #36  <Field Rect mTmpDisplayFrame>
	//*  82  173:getfield        #187 <Field int Rect.left>
	//*  83  176:ifge            258
	//*  84  179:aload_0         
	//*  85  180:getfield        #36  <Field Rect mTmpDisplayFrame>
	//*  86  183:getfield        #190 <Field int Rect.top>
	//*  87  186:ifge            258
		{
			Object obj1 = ((Object) (mContext.getResources()));
	//   88  189:aload_0         
	//   89  190:getfield        #42  <Field Context mContext>
	//   90  193:invokevirtual   #136 <Method Resources Context.getResources()>
	//   91  196:astore          10
			i1 = ((Resources) (obj1)).getIdentifier("status_bar_height", "dimen", "android");
	//   92  198:aload           10
	//   93  200:ldc1            #192 <String "status_bar_height">
	//   94  202:ldc1            #194 <String "dimen">
	//   95  204:ldc1            #196 <String "android">
	//   96  206:invokevirtual   #200 <Method int Resources.getIdentifier(String, String, String)>
	//   97  209:istore          7
			if(i1 != 0)
	//*  98  211:iload           7
	//*  99  213:ifeq            228
				i1 = ((Resources) (obj1)).getDimensionPixelSize(i1);
	//  100  216:aload           10
	//  101  218:iload           7
	//  102  220:invokevirtual   #203 <Method int Resources.getDimensionPixelSize(int)>
	//  103  223:istore          7
			else
	//* 104  225:goto            231
				i1 = 0;
	//  105  228:iconst_0        
	//  106  229:istore          7
			obj1 = ((Object) (((Resources) (obj1)).getDisplayMetrics()));
	//  107  231:aload           10
	//  108  233:invokevirtual   #207 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  109  236:astore          10
			mTmpDisplayFrame.set(0, i1, ((DisplayMetrics) (obj1)).widthPixels, ((DisplayMetrics) (obj1)).heightPixels);
	//  110  238:aload_0         
	//  111  239:getfield        #36  <Field Rect mTmpDisplayFrame>
	//  112  242:iconst_0        
	//  113  243:iload           7
	//  114  245:aload           10
	//  115  247:getfield        #212 <Field int DisplayMetrics.widthPixels>
	//  116  250:aload           10
	//  117  252:getfield        #215 <Field int DisplayMetrics.heightPixels>
	//  118  255:invokevirtual   #219 <Method void Rect.set(int, int, int, int)>
		}
		((View) (obj)).getLocationOnScreen(mTmpAppPos);
	//  119  258:aload           9
	//  120  260:aload_0         
	//  121  261:getfield        #40  <Field int[] mTmpAppPos>
	//  122  264:invokevirtual   #223 <Method void View.getLocationOnScreen(int[])>
		view.getLocationOnScreen(mTmpAnchorPos);
	//  123  267:aload_1         
	//  124  268:aload_0         
	//  125  269:getfield        #38  <Field int[] mTmpAnchorPos>
	//  126  272:invokevirtual   #223 <Method void View.getLocationOnScreen(int[])>
		view = ((View) (mTmpAnchorPos));
	//  127  275:aload_0         
	//  128  276:getfield        #38  <Field int[] mTmpAnchorPos>
	//  129  279:astore_1        
		i1 = view[0];
	//  130  280:aload_1         
	//  131  281:iconst_0        
	//  132  282:iaload          
	//  133  283:istore          7
		int ai[] = mTmpAppPos;
	//  134  285:aload_0         
	//  135  286:getfield        #40  <Field int[] mTmpAppPos>
	//  136  289:astore          10
		view[0] = i1 - ai[0];
	//  137  291:aload_1         
	//  138  292:iconst_0        
	//  139  293:iload           7
	//  140  295:aload           10
	//  141  297:iconst_0        
	//  142  298:iaload          
	//  143  299:isub            
	//  144  300:iastore         
		view[1] = view[1] - ai[1];
	//  145  301:aload_1         
	//  146  302:iconst_1        
	//  147  303:aload_1         
	//  148  304:iconst_1        
	//  149  305:iaload          
	//  150  306:aload           10
	//  151  308:iconst_1        
	//  152  309:iaload          
	//  153  310:isub            
	//  154  311:iastore         
		layoutparams.x = (view[0] + i) - ((View) (obj)).getWidth() / 2;
	//  155  312:aload           5
	//  156  314:aload_1         
	//  157  315:iconst_0        
	//  158  316:iaload          
	//  159  317:iload_2         
	//  160  318:iadd            
	//  161  319:aload           9
	//  162  321:invokevirtual   #151 <Method int View.getWidth()>
	//  163  324:iconst_2        
	//  164  325:idiv            
	//  165  326:isub            
	//  166  327:putfield        #226 <Field int android.view.WindowManager$LayoutParams.x>
		i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  167  330:iconst_0        
	//  168  331:iconst_0        
	//  169  332:invokestatic    #232 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  170  335:istore_2        
		mContentView.measure(i, i);
	//  171  336:aload_0         
	//  172  337:getfield        #60  <Field View mContentView>
	//  173  340:iload_2         
	//  174  341:iload_2         
	//  175  342:invokevirtual   #236 <Method void View.measure(int, int)>
		i = mContentView.getMeasuredHeight();
	//  176  345:aload_0         
	//  177  346:getfield        #60  <Field View mContentView>
	//  178  349:invokevirtual   #239 <Method int View.getMeasuredHeight()>
	//  179  352:istore_2        
		view = ((View) (mTmpAnchorPos));
	//  180  353:aload_0         
	//  181  354:getfield        #38  <Field int[] mTmpAnchorPos>
	//  182  357:astore_1        
		k = (view[1] + k) - j1 - i;
	//  183  358:aload_1         
	//  184  359:iconst_1        
	//  185  360:iaload          
	//  186  361:iload           6
	//  187  363:iadd            
	//  188  364:iload           8
	//  189  366:isub            
	//  190  367:iload_2         
	//  191  368:isub            
	//  192  369:istore          6
		j = view[1] + j + j1;
	//  193  371:aload_1         
	//  194  372:iconst_1        
	//  195  373:iaload          
	//  196  374:iload_3         
	//  197  375:iadd            
	//  198  376:iload           8
	//  199  378:iadd            
	//  200  379:istore_3        
		if(flag)
	//* 201  380:iload           4
	//* 202  382:ifeq            405
			if(k >= 0)
	//* 203  385:iload           6
	//* 204  387:iflt            398
			{
				layoutparams.y = k;
	//  205  390:aload           5
	//  206  392:iload           6
	//  207  394:putfield        #242 <Field int android.view.WindowManager$LayoutParams.y>
				return;
	//  208  397:return          
			} else
			{
				layoutparams.y = j;
	//  209  398:aload           5
	//  210  400:iload_3         
	//  211  401:putfield        #242 <Field int android.view.WindowManager$LayoutParams.y>
				return;
	//  212  404:return          
			}
		if(i + j <= mTmpDisplayFrame.height())
	//* 213  405:iload_2         
	//* 214  406:iload_3         
	//* 215  407:iadd            
	//* 216  408:aload_0         
	//* 217  409:getfield        #36  <Field Rect mTmpDisplayFrame>
	//* 218  412:invokevirtual   #244 <Method int Rect.height()>
	//* 219  415:icmpgt          425
		{
			layoutparams.y = j;
	//  220  418:aload           5
	//  221  420:iload_3         
	//  222  421:putfield        #242 <Field int android.view.WindowManager$LayoutParams.y>
			return;
	//  223  424:return          
		} else
		{
			layoutparams.y = k;
	//  224  425:aload           5
	//  225  427:iload           6
	//  226  429:putfield        #242 <Field int android.view.WindowManager$LayoutParams.y>
			return;
	//  227  432:return          
		}
	}

	private static View getAppRootView(View view)
	{
		View view1 = view.getRootView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #248 <Method View View.getRootView()>
	//    2    4:astore_1        
		android.view.ViewGroup.LayoutParams layoutparams = view1.getLayoutParams();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #252 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    9:astore_2        
		if((layoutparams instanceof android.view.WindowManager.LayoutParams) && ((android.view.WindowManager.LayoutParams)layoutparams).type == 2)
	//*   6   10:aload_2         
	//*   7   11:instanceof      #28  <Class android.view.WindowManager$LayoutParams>
	//*   8   14:ifeq            30
	//*   9   17:aload_2         
	//*  10   18:checkcast       #28  <Class android.view.WindowManager$LayoutParams>
	//*  11   21:getfield        #101 <Field int android.view.WindowManager$LayoutParams.type>
	//*  12   24:iconst_2        
	//*  13   25:icmpne          30
			return view1;
	//   14   28:aload_1         
	//   15   29:areturn         
		for(view = ((View) (view.getContext())); view instanceof ContextWrapper; view = ((View) (((ContextWrapper)view).getBaseContext())))
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #256 <Method Context View.getContext()>
	//*  18   34:astore_0        
	//*  19   35:aload_0         
	//*  20   36:instanceof      #258 <Class ContextWrapper>
	//*  21   39:ifeq            71
			if(view instanceof Activity)
	//*  22   42:aload_0         
	//*  23   43:instanceof      #260 <Class Activity>
	//*  24   46:ifeq            60
				return ((Activity)view).getWindow().getDecorView();
	//   25   49:aload_0         
	//   26   50:checkcast       #260 <Class Activity>
	//   27   53:invokevirtual   #264 <Method Window Activity.getWindow()>
	//   28   56:invokevirtual   #269 <Method View Window.getDecorView()>
	//   29   59:areturn         

	//   30   60:aload_0         
	//   31   61:checkcast       #258 <Class ContextWrapper>
	//   32   64:invokevirtual   #272 <Method Context ContextWrapper.getBaseContext()>
	//   33   67:astore_0        
	//*  34   68:goto            35
		return view1;
	//   35   71:aload_1         
	//   36   72:areturn         
	}

	void hide()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #277 <Method boolean isShowing()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			((WindowManager)mContext.getSystemService("window")).removeView(mContentView);
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field Context mContext>
	//    6   12:ldc2            #279 <String "window">
	//    7   15:invokevirtual   #283 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #285 <Class WindowManager>
	//    9   21:aload_0         
	//   10   22:getfield        #60  <Field View mContentView>
	//   11   25:invokeinterface #289 <Method void WindowManager.removeView(View)>
			return;
	//   12   30:return          
		}
	}

	boolean isShowing()
	{
		return mContentView.getParent() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field View mContentView>
	//    2    4:invokevirtual   #293 <Method android.view.ViewParent View.getParent()>
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
	//*   1    1:invokevirtual   #277 <Method boolean isShowing()>
	//*   2    4:ifeq            11
			hide();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #297 <Method void hide()>
		mMessageView.setText(charsequence);
	//    5   11:aload_0         
	//    6   12:getfield        #75  <Field TextView mMessageView>
	//    7   15:aload           5
	//    8   17:invokevirtual   #300 <Method void TextView.setText(CharSequence)>
		computePosition(view, i, j, flag, mLayoutParams);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:iload_2         
	//   12   23:iload_3         
	//   13   24:iload           4
	//   14   26:aload_0         
	//   15   27:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   16   30:invokespecial   #302 <Method void computePosition(View, int, int, boolean, android.view.WindowManager$LayoutParams)>
		((WindowManager)mContext.getSystemService("window")).addView(mContentView, ((android.view.ViewGroup.LayoutParams) (mLayoutParams)));
	//   17   33:aload_0         
	//   18   34:getfield        #42  <Field Context mContext>
	//   19   37:ldc2            #279 <String "window">
	//   20   40:invokevirtual   #283 <Method Object Context.getSystemService(String)>
	//   21   43:checkcast       #285 <Class WindowManager>
	//   22   46:aload_0         
	//   23   47:getfield        #60  <Field View mContentView>
	//   24   50:aload_0         
	//   25   51:getfield        #31  <Field android.view.WindowManager$LayoutParams mLayoutParams>
	//   26   54:invokeinterface #306 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
	//   27   59:return          
	}

	private final View mContentView;
	private final Context mContext;
	private final android.view.WindowManager.LayoutParams mLayoutParams = new android.view.WindowManager.LayoutParams();
	private final TextView mMessageView;
	private final int mTmpAnchorPos[] = new int[2];
	private final int mTmpAppPos[] = new int[2];
	private final Rect mTmpDisplayFrame = new Rect();
}
