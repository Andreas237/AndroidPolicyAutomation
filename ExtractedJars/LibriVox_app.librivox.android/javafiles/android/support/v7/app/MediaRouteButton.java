// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.app.ae;
import android.support.v4.app.x;
import android.support.v4.graphics.drawable.a;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.widget.TooltipCompat;
import android.util.*;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouterThemeHelper, MediaRouteDialogFactory, MediaRouteControllerDialogFragment, MediaRouteChooserDialogFragment

public class MediaRouteButton extends View
{

	public MediaRouteButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #61  <Method void MediaRouteButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public MediaRouteButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.mediarouter.R.attr.mediaRouteButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #66  <Field int android.support.v7.mediarouter.R$attr.mediaRouteButtonStyle>
	//    4    6:invokespecial   #69  <Method void MediaRouteButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public MediaRouteButton(Context context, AttributeSet attributeset, int i)
	{
		super(MediaRouterThemeHelper.createThemedButtonContext(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method Context MediaRouterThemeHelper.createThemedButtonContext(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #76  <Method void View(Context, AttributeSet, int)>
		mSelector = MediaRouteSelector.EMPTY;
	//    6   10:aload_0         
	//    7   11:getstatic       #81  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    8   14:putfield        #83  <Field MediaRouteSelector mSelector>
		mDialogFactory = MediaRouteDialogFactory.getDefault();
	//    9   17:aload_0         
	//   10   18:invokestatic    #89  <Method MediaRouteDialogFactory MediaRouteDialogFactory.getDefault()>
	//   11   21:putfield        #91  <Field MediaRouteDialogFactory mDialogFactory>
		context = getContext();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #95  <Method Context getContext()>
	//   14   28:astore_1        
		mRouter = MediaRouter.getInstance(context);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #101 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   18   34:putfield        #103 <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   19   37:aload_0         
	//   20   38:new             #105 <Class MediaRouteButton$MediaRouterCallback>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokespecial   #108 <Method void MediaRouteButton$MediaRouterCallback(MediaRouteButton)>
	//   24   46:putfield        #110 <Field MediaRouteButton$MediaRouterCallback mCallback>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.mediarouter.R.styleable.MediaRouteButton, i, 0)));
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:getstatic       #114 <Field int[] android.support.v7.mediarouter.R$styleable.MediaRouteButton>
	//   28   54:iload_3         
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #120 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   31   59:astore_1        
		mButtonTint = ((TypedArray) (context)).getColorStateList(android.support.v7.mediarouter.R.styleable.MediaRouteButton_mediaRouteButtonTint);
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:getstatic       #123 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_mediaRouteButtonTint>
	//   35   65:invokevirtual   #129 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   36   68:putfield        #131 <Field ColorStateList mButtonTint>
		mMinWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minWidth, 0);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getstatic       #134 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_android_minWidth>
	//   40   76:iconst_0        
	//   41   77:invokevirtual   #138 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   42   80:putfield        #140 <Field int mMinWidth>
		mMinHeight = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minHeight, 0);
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:getstatic       #143 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_android_minHeight>
	//   46   88:iconst_0        
	//   47   89:invokevirtual   #138 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   48   92:putfield        #145 <Field int mMinHeight>
		i = ((TypedArray) (context)).getResourceId(android.support.v7.mediarouter.R.styleable.MediaRouteButton_externalRouteEnabledDrawable, 0);
	//   49   95:aload_1         
	//   50   96:getstatic       #148 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_externalRouteEnabledDrawable>
	//   51   99:iconst_0        
	//   52  100:invokevirtual   #151 <Method int TypedArray.getResourceId(int, int)>
	//   53  103:istore_3        
		((TypedArray) (context)).recycle();
	//   54  104:aload_1         
	//   55  105:invokevirtual   #154 <Method void TypedArray.recycle()>
		if(i != 0)
	//*  56  108:iload_3         
	//*  57  109:ifeq            166
		{
			context = ((Context) ((android.graphics.drawable.Drawable.ConstantState)sRemoteIndicatorCache.get(i)));
	//   58  112:getstatic       #50  <Field SparseArray sRemoteIndicatorCache>
	//   59  115:iload_3         
	//   60  116:invokevirtual   #158 <Method Object SparseArray.get(int)>
	//   61  119:checkcast       #160 <Class android.graphics.drawable.Drawable$ConstantState>
	//   62  122:astore_1        
			if(context != null)
	//*  63  123:aload_1         
	//*  64  124:ifnull          138
			{
				setRemoteIndicatorDrawable(((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable());
	//   65  127:aload_0         
	//   66  128:aload_1         
	//   67  129:invokevirtual   #164 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   68  132:invokevirtual   #168 <Method void setRemoteIndicatorDrawable(Drawable)>
			} else
	//*  69  135:goto            166
			{
				mRemoteIndicatorLoader = new RemoteIndicatorLoader(i);
	//   70  138:aload_0         
	//   71  139:new             #170 <Class MediaRouteButton$RemoteIndicatorLoader>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:iload_3         
	//   75  145:invokespecial   #173 <Method void MediaRouteButton$RemoteIndicatorLoader(MediaRouteButton, int)>
	//   76  148:putfield        #175 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
				mRemoteIndicatorLoader.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Void[0])));
	//   77  151:aload_0         
	//   78  152:getfield        #175 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
	//   79  155:getstatic       #181 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   80  158:iconst_0        
	//   81  159:anewarray       Void[]
	//   82  162:invokevirtual   #187 <Method AsyncTask MediaRouteButton$RemoteIndicatorLoader.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   83  165:pop             
			}
		}
		updateContentDescription();
	//   84  166:aload_0         
	//   85  167:invokespecial   #190 <Method void updateContentDescription()>
		setClickable(true);
	//   86  170:aload_0         
	//   87  171:iconst_1        
	//   88  172:invokevirtual   #194 <Method void setClickable(boolean)>
	//   89  175:return          
	}

	private Activity getActivity()
	{
		for(Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #95  <Method Context getContext()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:instanceof      #198 <Class ContextWrapper>
	//*   5    9:ifeq            35
			if(context instanceof Activity)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #200 <Class Activity>
	//*   8   16:ifeq            24
				return (Activity)context;
	//    9   19:aload_1         
	//   10   20:checkcast       #200 <Class Activity>
	//   11   23:areturn         

	//   12   24:aload_1         
	//   13   25:checkcast       #198 <Class ContextWrapper>
	//   14   28:invokevirtual   #203 <Method Context ContextWrapper.getBaseContext()>
	//   15   31:astore_1        
	//*  16   32:goto            5
		return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
	}

	private ae getFragmentManager()
	{
		Activity activity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method Activity getActivity()>
	//    2    4:astore_1        
		if(activity instanceof x)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #209 <Class x>
	//*   5    9:ifeq            20
			return ((x)activity).getSupportFragmentManager();
	//    6   12:aload_1         
	//    7   13:checkcast       #209 <Class x>
	//    8   16:invokevirtual   #212 <Method ae x.getSupportFragmentManager()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	private void updateContentDescription()
	{
		int i;
		if(mIsConnecting)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field boolean mIsConnecting>
	//*   2    4:ifeq            14
			i = android.support.v7.mediarouter.R.string.mr_cast_button_connecting;
	//    3    7:getstatic       #219 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_connecting>
	//    4   10:istore_1        
		else
	//*   5   11:goto            32
		if(mRemoteActive)
	//*   6   14:aload_0         
	//*   7   15:getfield        #221 <Field boolean mRemoteActive>
	//*   8   18:ifeq            28
			i = android.support.v7.mediarouter.R.string.mr_cast_button_connected;
	//    9   21:getstatic       #224 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_connected>
	//   10   24:istore_1        
		else
	//*  11   25:goto            32
			i = android.support.v7.mediarouter.R.string.mr_cast_button_disconnected;
	//   12   28:getstatic       #227 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_disconnected>
	//   13   31:istore_1        
		setContentDescription(((CharSequence) (getContext().getString(i))));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:invokevirtual   #95  <Method Context getContext()>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #231 <Method String Context.getString(int)>
	//   19   41:invokevirtual   #235 <Method void setContentDescription(CharSequence)>
	//   20   44:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void View.drawableStateChanged()>
		if(mRemoteIndicator != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #240 <Field Drawable mRemoteIndicator>
	//*   4    8:ifnull          29
		{
			int ai[] = getDrawableState();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #244 <Method int[] getDrawableState()>
	//    7   15:astore_1        
			mRemoteIndicator.setState(ai);
	//    8   16:aload_0         
	//    9   17:getfield        #240 <Field Drawable mRemoteIndicator>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #250 <Method boolean Drawable.setState(int[])>
	//   12   24:pop             
			invalidate();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #253 <Method void invalidate()>
		}
	//   15   29:return          
	}

	public MediaRouteDialogFactory getDialogFactory()
	{
		return mDialogFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field MediaRouteDialogFactory mDialogFactory>
	//    2    4:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		if(getBackground() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #260 <Method Drawable getBackground()>
	//*   2    4:ifnull          14
			a.a(getBackground());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #260 <Method Drawable getBackground()>
	//    5   11:invokestatic    #265 <Method void a.a(Drawable)>
		Drawable drawable = mRemoteIndicator;
	//    6   14:aload_0         
	//    7   15:getfield        #240 <Field Drawable mRemoteIndicator>
	//    8   18:astore_1        
		if(drawable != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          27
			a.a(drawable);
	//   11   23:aload_1         
	//   12   24:invokestatic    #265 <Method void a.a(Drawable)>
	//   13   27:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #268 <Method void View.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #270 <Field boolean mAttachedToWindow>
		if(!mSelector.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #83  <Field MediaRouteSelector mSelector>
	//*   7   13:invokevirtual   #274 <Method boolean MediaRouteSelector.isEmpty()>
	//*   8   16:ifne            34
			mRouter.addCallback(mSelector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field MediaRouter mRouter>
	//   11   23:aload_0         
	//   12   24:getfield        #83  <Field MediaRouteSelector mSelector>
	//   13   27:aload_0         
	//   14   28:getfield        #110 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   15   31:invokevirtual   #278 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
		refreshRoute();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #281 <Method void refreshRoute()>
	//   18   38:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #285 <Method int[] View.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(mIsConnecting)
	//*   6    8:aload_0         
	//*   7    9:getfield        #214 <Field boolean mIsConnecting>
	//*   8   12:ifeq            25
		{
			mergeDrawableStates(ai, CHECKABLE_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #56  <Field int[] CHECKABLE_STATE_SET>
	//   11   19:invokestatic    #289 <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
			return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
		}
		if(mRemoteActive)
	//*  15   25:aload_0         
	//*  16   26:getfield        #221 <Field boolean mRemoteActive>
	//*  17   29:ifeq            40
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   18   32:aload_2         
	//   19   33:getstatic       #53  <Field int[] CHECKED_STATE_SET>
	//   20   36:invokestatic    #289 <Method int[] mergeDrawableStates(int[], int[])>
	//   21   39:pop             
		return ai;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	public void onDetachedFromWindow()
	{
		mAttachedToWindow = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #270 <Field boolean mAttachedToWindow>
		if(!mSelector.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #83  <Field MediaRouteSelector mSelector>
	//*   5    9:invokevirtual   #274 <Method boolean MediaRouteSelector.isEmpty()>
	//*   6   12:ifne            26
			mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field MediaRouter mRouter>
	//    9   19:aload_0         
	//   10   20:getfield        #110 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   11   23:invokevirtual   #294 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		super.onDetachedFromWindow();
	//   12   26:aload_0         
	//   13   27:invokespecial   #296 <Method void View.onDetachedFromWindow()>
	//   14   30:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #300 <Method void View.onDraw(Canvas)>
		if(mRemoteIndicator != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #240 <Field Drawable mRemoteIndicator>
	//*   5    9:ifnull          125
		{
			int j1 = getPaddingLeft();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #304 <Method int getPaddingLeft()>
	//    8   16:istore          7
			int k1 = getWidth();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #307 <Method int getWidth()>
	//   11   22:istore          8
			int l1 = getPaddingRight();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #310 <Method int getPaddingRight()>
	//   14   28:istore          9
			int k = getPaddingTop();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #313 <Method int getPaddingTop()>
	//   17   34:istore          4
			int l = getHeight();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #316 <Method int getHeight()>
	//   20   40:istore          5
			int i1 = getPaddingBottom();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #319 <Method int getPaddingBottom()>
	//   23   46:istore          6
			int i = mRemoteIndicator.getIntrinsicWidth();
	//   24   48:aload_0         
	//   25   49:getfield        #240 <Field Drawable mRemoteIndicator>
	//   26   52:invokevirtual   #322 <Method int Drawable.getIntrinsicWidth()>
	//   27   55:istore_2        
			int j = mRemoteIndicator.getIntrinsicHeight();
	//   28   56:aload_0         
	//   29   57:getfield        #240 <Field Drawable mRemoteIndicator>
	//   30   60:invokevirtual   #325 <Method int Drawable.getIntrinsicHeight()>
	//   31   63:istore_3        
			j1 += (k1 - l1 - j1 - i) / 2;
	//   32   64:iload           7
	//   33   66:iload           8
	//   34   68:iload           9
	//   35   70:isub            
	//   36   71:iload           7
	//   37   73:isub            
	//   38   74:iload_2         
	//   39   75:isub            
	//   40   76:iconst_2        
	//   41   77:idiv            
	//   42   78:iadd            
	//   43   79:istore          7
			k += (l - i1 - k - j) / 2;
	//   44   81:iload           4
	//   45   83:iload           5
	//   46   85:iload           6
	//   47   87:isub            
	//   48   88:iload           4
	//   49   90:isub            
	//   50   91:iload_3         
	//   51   92:isub            
	//   52   93:iconst_2        
	//   53   94:idiv            
	//   54   95:iadd            
	//   55   96:istore          4
			mRemoteIndicator.setBounds(j1, k, i + j1, j + k);
	//   56   98:aload_0         
	//   57   99:getfield        #240 <Field Drawable mRemoteIndicator>
	//   58  102:iload           7
	//   59  104:iload           4
	//   60  106:iload_2         
	//   61  107:iload           7
	//   62  109:iadd            
	//   63  110:iload_3         
	//   64  111:iload           4
	//   65  113:iadd            
	//   66  114:invokevirtual   #329 <Method void Drawable.setBounds(int, int, int, int)>
			mRemoteIndicator.draw(canvas);
	//   67  117:aload_0         
	//   68  118:getfield        #240 <Field Drawable mRemoteIndicator>
	//   69  121:aload_1         
	//   70  122:invokevirtual   #332 <Method void Drawable.draw(Canvas)>
		}
	//   71  125:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #340 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          4
		int k = android.view.View.MeasureSpec.getSize(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #340 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_3        
		int l1 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #343 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          8
		int k1 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #343 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          7
		int i1 = mMinWidth;
	//   12   23:aload_0         
	//   13   24:getfield        #140 <Field int mMinWidth>
	//   14   27:istore          5
		Drawable drawable = mRemoteIndicator;
	//   15   29:aload_0         
	//   16   30:getfield        #240 <Field Drawable mRemoteIndicator>
	//   17   33:astore          9
		j = 0;
	//   18   35:iconst_0        
	//   19   36:istore_2        
		if(drawable != null)
	//*  20   37:aload           9
	//*  21   39:ifnull          61
			i = drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight();
	//   22   42:aload           9
	//   23   44:invokevirtual   #322 <Method int Drawable.getIntrinsicWidth()>
	//   24   47:aload_0         
	//   25   48:invokevirtual   #304 <Method int getPaddingLeft()>
	//   26   51:iadd            
	//   27   52:aload_0         
	//   28   53:invokevirtual   #310 <Method int getPaddingRight()>
	//   29   56:iadd            
	//   30   57:istore_1        
		else
	//*  31   58:goto            63
			i = 0;
	//   32   61:iconst_0        
	//   33   62:istore_1        
		i1 = Math.max(i1, i);
	//   34   63:iload           5
	//   35   65:iload_1         
	//   36   66:invokestatic    #348 <Method int Math.max(int, int)>
	//   37   69:istore          5
		int j1 = mMinHeight;
	//   38   71:aload_0         
	//   39   72:getfield        #145 <Field int mMinHeight>
	//   40   75:istore          6
		drawable = mRemoteIndicator;
	//   41   77:aload_0         
	//   42   78:getfield        #240 <Field Drawable mRemoteIndicator>
	//   43   81:astore          9
		i = j;
	//   44   83:iload_2         
	//   45   84:istore_1        
		if(drawable != null)
	//*  46   85:aload           9
	//*  47   87:ifnull          106
			i = drawable.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
	//   48   90:aload           9
	//   49   92:invokevirtual   #325 <Method int Drawable.getIntrinsicHeight()>
	//   50   95:aload_0         
	//   51   96:invokevirtual   #313 <Method int getPaddingTop()>
	//   52   99:iadd            
	//   53  100:aload_0         
	//   54  101:invokevirtual   #319 <Method int getPaddingBottom()>
	//   55  104:iadd            
	//   56  105:istore_1        
		j1 = Math.max(j1, i);
	//   57  106:iload           6
	//   58  108:iload_1         
	//   59  109:invokestatic    #348 <Method int Math.max(int, int)>
	//   60  112:istore          6
		if(l1 != 0x80000000)
	//*  61  114:iload           8
	//*  62  116:ldc2            #349 <Int 0x80000000>
	//*  63  119:icmpeq          139
		{
			i = l;
	//   64  122:iload           4
	//   65  124:istore_1        
			if(l1 != 0x40000000)
	//*  66  125:iload           8
	//*  67  127:ldc2            #350 <Int 0x40000000>
	//*  68  130:icmpeq          147
				i = i1;
	//   69  133:iload           5
	//   70  135:istore_1        
		} else
	//*  71  136:goto            147
		{
			i = Math.min(l, i1);
	//   72  139:iload           4
	//   73  141:iload           5
	//   74  143:invokestatic    #353 <Method int Math.min(int, int)>
	//   75  146:istore_1        
		}
		if(k1 != 0x80000000)
	//*  76  147:iload           7
	//*  77  149:ldc2            #349 <Int 0x80000000>
	//*  78  152:icmpeq          171
		{
			j = k;
	//   79  155:iload_3         
	//   80  156:istore_2        
			if(k1 != 0x40000000)
	//*  81  157:iload           7
	//*  82  159:ldc2            #350 <Int 0x40000000>
	//*  83  162:icmpeq          178
				j = j1;
	//   84  165:iload           6
	//   85  167:istore_2        
		} else
	//*  86  168:goto            178
		{
			j = Math.min(k, j1);
	//   87  171:iload_3         
	//   88  172:iload           6
	//   89  174:invokestatic    #353 <Method int Math.min(int, int)>
	//   90  177:istore_2        
		}
		setMeasuredDimension(i, j);
	//   91  178:aload_0         
	//   92  179:iload_1         
	//   93  180:iload_2         
	//   94  181:invokevirtual   #356 <Method void setMeasuredDimension(int, int)>
	//   95  184:return          
	}

	public boolean performClick()
	{
		boolean flag1 = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method boolean View.performClick()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			playSoundEffect(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #362 <Method void playSoundEffect(int)>
		if(showDialog() || flag1)
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #365 <Method boolean showDialog()>
	//*  12   20:ifne            27
	//*  13   23:iload_2         
	//*  14   24:ifeq            29
			flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_1        
		return flag;
	//   17   29:iload_1         
	//   18   30:ireturn         
	}

	void refreshRoute()
	{
		Object obj = ((Object) (mRouter.getSelectedRoute()));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field MediaRouter mRouter>
	//    2    4:invokevirtual   #369 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//    3    7:astore          4
		boolean flag1 = ((android.support.v7.media.MediaRouter.RouteInfo) (obj)).isDefaultOrBluetooth();
	//    4    9:aload           4
	//    5   11:invokevirtual   #374 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//    6   14:istore_2        
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		if(!flag1 && ((android.support.v7.media.MediaRouter.RouteInfo) (obj)).matchesSelector(mSelector))
	//*   9   17:iload_2         
	//*  10   18:ifne            38
	//*  11   21:aload           4
	//*  12   23:aload_0         
	//*  13   24:getfield        #83  <Field MediaRouteSelector mSelector>
	//*  14   27:invokevirtual   #378 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  15   30:ifeq            38
			flag1 = true;
	//   16   33:iconst_1        
	//   17   34:istore_2        
		else
	//*  18   35:goto            40
			flag1 = false;
	//   19   38:iconst_0        
	//   20   39:istore_2        
		boolean flag2;
		if(flag1 && ((android.support.v7.media.MediaRouter.RouteInfo) (obj)).isConnecting())
	//*  21   40:iload_2         
	//*  22   41:ifeq            57
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #381 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isConnecting()>
	//*  25   49:ifeq            57
			flag2 = true;
	//   26   52:iconst_1        
	//   27   53:istore_3        
		else
	//*  28   54:goto            59
			flag2 = false;
	//   29   57:iconst_0        
	//   30   58:istore_3        
		if(mRemoteActive != flag1)
	//*  31   59:aload_0         
	//*  32   60:getfield        #221 <Field boolean mRemoteActive>
	//*  33   63:iload_2         
	//*  34   64:icmpeq          74
		{
			mRemoteActive = flag1;
	//   35   67:aload_0         
	//   36   68:iload_2         
	//   37   69:putfield        #221 <Field boolean mRemoteActive>
			flag = true;
	//   38   72:iconst_1        
	//   39   73:istore_1        
		}
		if(mIsConnecting != flag2)
	//*  40   74:aload_0         
	//*  41   75:getfield        #214 <Field boolean mIsConnecting>
	//*  42   78:iload_3         
	//*  43   79:icmpeq          89
		{
			mIsConnecting = flag2;
	//   44   82:aload_0         
	//   45   83:iload_3         
	//   46   84:putfield        #214 <Field boolean mIsConnecting>
			flag = true;
	//   47   87:iconst_1        
	//   48   88:istore_1        
		}
		if(flag)
	//*  49   89:iload_1         
	//*  50   90:ifeq            101
		{
			updateContentDescription();
	//   51   93:aload_0         
	//   52   94:invokespecial   #190 <Method void updateContentDescription()>
			refreshDrawableState();
	//   53   97:aload_0         
	//   54   98:invokevirtual   #384 <Method void refreshDrawableState()>
		}
		if(mAttachedToWindow)
	//*  55  101:aload_0         
	//*  56  102:getfield        #270 <Field boolean mAttachedToWindow>
	//*  57  105:ifeq            124
			setEnabled(mRouter.isRouteAvailable(mSelector, 1));
	//   58  108:aload_0         
	//   59  109:aload_0         
	//   60  110:getfield        #103 <Field MediaRouter mRouter>
	//   61  113:aload_0         
	//   62  114:getfield        #83  <Field MediaRouteSelector mSelector>
	//   63  117:iconst_1        
	//   64  118:invokevirtual   #388 <Method boolean MediaRouter.isRouteAvailable(MediaRouteSelector, int)>
	//   65  121:invokevirtual   #391 <Method void setEnabled(boolean)>
		obj = ((Object) (mRemoteIndicator));
	//   66  124:aload_0         
	//   67  125:getfield        #240 <Field Drawable mRemoteIndicator>
	//   68  128:astore          4
		if(obj != null && (((Drawable) (obj)).getCurrent() instanceof AnimationDrawable))
	//*  69  130:aload           4
	//*  70  132:ifnull          221
	//*  71  135:aload           4
	//*  72  137:invokevirtual   #394 <Method Drawable Drawable.getCurrent()>
	//*  73  140:instanceof      #396 <Class AnimationDrawable>
	//*  74  143:ifeq            221
		{
			AnimationDrawable animationdrawable = (AnimationDrawable)mRemoteIndicator.getCurrent();
	//   75  146:aload_0         
	//   76  147:getfield        #240 <Field Drawable mRemoteIndicator>
	//   77  150:invokevirtual   #394 <Method Drawable Drawable.getCurrent()>
	//   78  153:checkcast       #396 <Class AnimationDrawable>
	//   79  156:astore          4
			if(mAttachedToWindow)
	//*  80  158:aload_0         
	//*  81  159:getfield        #270 <Field boolean mAttachedToWindow>
	//*  82  162:ifeq            187
			{
				if((flag || flag2) && !animationdrawable.isRunning())
	//*  83  165:iload_1         
	//*  84  166:ifne            173
	//*  85  169:iload_3         
	//*  86  170:ifeq            221
	//*  87  173:aload           4
	//*  88  175:invokevirtual   #399 <Method boolean AnimationDrawable.isRunning()>
	//*  89  178:ifne            221
				{
					animationdrawable.start();
	//   90  181:aload           4
	//   91  183:invokevirtual   #402 <Method void AnimationDrawable.start()>
					return;
	//   92  186:return          
				}
			} else
			if(flag1 && !flag2)
	//*  93  187:iload_2         
	//*  94  188:ifeq            221
	//*  95  191:iload_3         
	//*  96  192:ifne            221
			{
				if(animationdrawable.isRunning())
	//*  97  195:aload           4
	//*  98  197:invokevirtual   #399 <Method boolean AnimationDrawable.isRunning()>
	//*  99  200:ifeq            208
					animationdrawable.stop();
	//  100  203:aload           4
	//  101  205:invokevirtual   #405 <Method void AnimationDrawable.stop()>
				animationdrawable.selectDrawable(animationdrawable.getNumberOfFrames() - 1);
	//  102  208:aload           4
	//  103  210:aload           4
	//  104  212:invokevirtual   #408 <Method int AnimationDrawable.getNumberOfFrames()>
	//  105  215:iconst_1        
	//  106  216:isub            
	//  107  217:invokevirtual   #412 <Method boolean AnimationDrawable.selectDrawable(int)>
	//  108  220:pop             
			}
		}
	//  109  221:return          
	}

	void setCheatSheetEnabled(boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            18
			s = getContext().getString(android.support.v7.mediarouter.R.string.mr_button_content_description);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #95  <Method Context getContext()>
	//    4    8:getstatic       #416 <Field int android.support.v7.mediarouter.R$string.mr_button_content_description>
	//    5   11:invokevirtual   #231 <Method String Context.getString(int)>
	//    6   14:astore_2        
		else
	//*   7   15:goto            20
			s = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (s)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokestatic    #422 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//   13   25:return          
	}

	public void setDialogFactory(MediaRouteDialogFactory mediaroutedialogfactory)
	{
		if(mediaroutedialogfactory != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			mDialogFactory = mediaroutedialogfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #91  <Field MediaRouteDialogFactory mDialogFactory>
			return;
	//    5    9:return          
		} else
		{
			throw new IllegalArgumentException("factory must not be null");
	//    6   10:new             #426 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc2            #428 <String "factory must not be null">
	//    9   17:invokespecial   #431 <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		}
	}

	public void setRemoteIndicatorDrawable(Drawable drawable)
	{
		Object obj = ((Object) (mRemoteIndicatorLoader));
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			((RemoteIndicatorLoader) (obj)).cancel(false);
	//    5    9:aload_3         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #435 <Method boolean MediaRouteButton$RemoteIndicatorLoader.cancel(boolean)>
	//    8   14:pop             
		obj = ((Object) (mRemoteIndicator));
	//    9   15:aload_0         
	//   10   16:getfield        #240 <Field Drawable mRemoteIndicator>
	//   11   19:astore_3        
		if(obj != null)
	//*  12   20:aload_3         
	//*  13   21:ifnull          37
		{
			((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   14   24:aload_3         
	//   15   25:aconst_null     
	//   16   26:invokevirtual   #439 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mRemoteIndicator);
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #240 <Field Drawable mRemoteIndicator>
	//   20   34:invokevirtual   #442 <Method void unscheduleDrawable(Drawable)>
		}
		obj = ((Object) (drawable));
	//   21   37:aload_1         
	//   22   38:astore_3        
		if(drawable != null)
	//*  23   39:aload_1         
	//*  24   40:ifnull          103
		{
			obj = ((Object) (drawable));
	//   25   43:aload_1         
	//   26   44:astore_3        
			if(mButtonTint != null)
	//*  27   45:aload_0         
	//*  28   46:getfield        #131 <Field ColorStateList mButtonTint>
	//*  29   49:ifnull          68
			{
				obj = ((Object) (a.g(drawable.mutate())));
	//   30   52:aload_1         
	//   31   53:invokevirtual   #445 <Method Drawable Drawable.mutate()>
	//   32   56:invokestatic    #449 <Method Drawable a.g(Drawable)>
	//   33   59:astore_3        
				a.a(((Drawable) (obj)), mButtonTint);
	//   34   60:aload_3         
	//   35   61:aload_0         
	//   36   62:getfield        #131 <Field ColorStateList mButtonTint>
	//   37   65:invokestatic    #452 <Method void a.a(Drawable, ColorStateList)>
			}
			((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   38   68:aload_3         
	//   39   69:aload_0         
	//   40   70:invokevirtual   #439 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			((Drawable) (obj)).setState(getDrawableState());
	//   41   73:aload_3         
	//   42   74:aload_0         
	//   43   75:invokevirtual   #244 <Method int[] getDrawableState()>
	//   44   78:invokevirtual   #250 <Method boolean Drawable.setState(int[])>
	//   45   81:pop             
			boolean flag;
			if(getVisibility() == 0)
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #455 <Method int getVisibility()>
	//*  48   86:ifne            94
				flag = true;
	//   49   89:iconst_1        
	//   50   90:istore_2        
			else
	//*  51   91:goto            96
				flag = false;
	//   52   94:iconst_0        
	//   53   95:istore_2        
			((Drawable) (obj)).setVisible(flag, false);
	//   54   96:aload_3         
	//   55   97:iload_2         
	//   56   98:iconst_0        
	//   57   99:invokevirtual   #459 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   58  102:pop             
		}
		mRemoteIndicator = ((Drawable) (obj));
	//   59  103:aload_0         
	//   60  104:aload_3         
	//   61  105:putfield        #240 <Field Drawable mRemoteIndicator>
		refreshDrawableState();
	//   62  108:aload_0         
	//   63  109:invokevirtual   #384 <Method void refreshDrawableState()>
		if(mAttachedToWindow)
	//*  64  112:aload_0         
	//*  65  113:getfield        #270 <Field boolean mAttachedToWindow>
	//*  66  116:ifeq            197
		{
			drawable = mRemoteIndicator;
	//   67  119:aload_0         
	//   68  120:getfield        #240 <Field Drawable mRemoteIndicator>
	//   69  123:astore_1        
			if(drawable != null && (drawable.getCurrent() instanceof AnimationDrawable))
	//*  70  124:aload_1         
	//*  71  125:ifnull          197
	//*  72  128:aload_1         
	//*  73  129:invokevirtual   #394 <Method Drawable Drawable.getCurrent()>
	//*  74  132:instanceof      #396 <Class AnimationDrawable>
	//*  75  135:ifeq            197
			{
				drawable = ((Drawable) ((AnimationDrawable)mRemoteIndicator.getCurrent()));
	//   76  138:aload_0         
	//   77  139:getfield        #240 <Field Drawable mRemoteIndicator>
	//   78  142:invokevirtual   #394 <Method Drawable Drawable.getCurrent()>
	//   79  145:checkcast       #396 <Class AnimationDrawable>
	//   80  148:astore_1        
				if(mIsConnecting)
	//*  81  149:aload_0         
	//*  82  150:getfield        #214 <Field boolean mIsConnecting>
	//*  83  153:ifeq            168
				{
					if(!((AnimationDrawable) (drawable)).isRunning())
	//*  84  156:aload_1         
	//*  85  157:invokevirtual   #399 <Method boolean AnimationDrawable.isRunning()>
	//*  86  160:ifne            197
					{
						((AnimationDrawable) (drawable)).start();
	//   87  163:aload_1         
	//   88  164:invokevirtual   #402 <Method void AnimationDrawable.start()>
						return;
	//   89  167:return          
					}
				} else
				if(mRemoteActive)
	//*  90  168:aload_0         
	//*  91  169:getfield        #221 <Field boolean mRemoteActive>
	//*  92  172:ifeq            197
				{
					if(((AnimationDrawable) (drawable)).isRunning())
	//*  93  175:aload_1         
	//*  94  176:invokevirtual   #399 <Method boolean AnimationDrawable.isRunning()>
	//*  95  179:ifeq            186
						((AnimationDrawable) (drawable)).stop();
	//   96  182:aload_1         
	//   97  183:invokevirtual   #405 <Method void AnimationDrawable.stop()>
					((AnimationDrawable) (drawable)).selectDrawable(((AnimationDrawable) (drawable)).getNumberOfFrames() - 1);
	//   98  186:aload_1         
	//   99  187:aload_1         
	//  100  188:invokevirtual   #408 <Method int AnimationDrawable.getNumberOfFrames()>
	//  101  191:iconst_1        
	//  102  192:isub            
	//  103  193:invokevirtual   #412 <Method boolean AnimationDrawable.selectDrawable(int)>
	//  104  196:pop             
				}
			}
		}
	//  105  197:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          72
		{
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #83  <Field MediaRouteSelector mSelector>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #465 <Method boolean MediaRouteSelector.equals(Object)>
	//*   6   12:ifne            71
			{
				if(mAttachedToWindow)
	//*   7   15:aload_0         
	//*   8   16:getfield        #270 <Field boolean mAttachedToWindow>
	//*   9   19:ifeq            62
				{
					if(!mSelector.isEmpty())
	//*  10   22:aload_0         
	//*  11   23:getfield        #83  <Field MediaRouteSelector mSelector>
	//*  12   26:invokevirtual   #274 <Method boolean MediaRouteSelector.isEmpty()>
	//*  13   29:ifne            43
						mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   14   32:aload_0         
	//   15   33:getfield        #103 <Field MediaRouter mRouter>
	//   16   36:aload_0         
	//   17   37:getfield        #110 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   18   40:invokevirtual   #294 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
					if(!mediarouteselector.isEmpty())
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #274 <Method boolean MediaRouteSelector.isEmpty()>
	//*  21   47:ifne            62
						mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   22   50:aload_0         
	//   23   51:getfield        #103 <Field MediaRouter mRouter>
	//   24   54:aload_1         
	//   25   55:aload_0         
	//   26   56:getfield        #110 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   27   59:invokevirtual   #278 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
				}
				mSelector = mediarouteselector;
	//   28   62:aload_0         
	//   29   63:aload_1         
	//   30   64:putfield        #83  <Field MediaRouteSelector mSelector>
				refreshRoute();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #281 <Method void refreshRoute()>
			}
			return;
	//   33   71:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   34   72:new             #426 <Class IllegalArgumentException>
	//   35   75:dup             
	//   36   76:ldc2            #467 <String "selector must not be null">
	//   37   79:invokespecial   #431 <Method void IllegalArgumentException(String)>
	//   38   82:athrow          
		}
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #470 <Method void View.setVisibility(int)>
		Drawable drawable = mRemoteIndicator;
	//    3    5:aload_0         
	//    4    6:getfield        #240 <Field Drawable mRemoteIndicator>
	//    5    9:astore_3        
		if(drawable != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          35
		{
			boolean flag;
			if(getVisibility() == 0)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #455 <Method int getVisibility()>
	//*  10   18:ifne            26
				flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			drawable.setVisible(flag, false);
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokevirtual   #459 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   20   34:pop             
		}
	//   21   35:return          
	}

	public boolean showDialog()
	{
		if(!mAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field boolean mAttachedToWindow>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ae ae1 = getFragmentManager();
	//    5    9:aload_0         
	//    6   10:invokespecial   #472 <Method ae getFragmentManager()>
	//    7   13:astore_1        
		if(ae1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          138
		{
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRouter.getSelectedRoute();
	//   10   18:aload_0         
	//   11   19:getfield        #103 <Field MediaRouter mRouter>
	//   12   22:invokevirtual   #369 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//   13   25:astore_2        
			if(!routeinfo.isDefaultOrBluetooth() && routeinfo.matchesSelector(mSelector))
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #374 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  16   30:ifne            93
	//*  17   33:aload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #83  <Field MediaRouteSelector mSelector>
	//*  20   38:invokevirtual   #378 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  21   41:ifne            47
	//*  22   44:goto            93
			{
				if(ae1.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
	//*  23   47:aload_1         
	//*  24   48:ldc1            #14  <String "android.support.v7.mediarouter:MediaRouteControllerDialogFragment">
	//*  25   50:invokevirtual   #477 <Method android.support.v4.app.Fragment ae.a(String)>
	//*  26   53:ifnull          67
				{
					Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
	//   27   56:ldc1            #17  <String "MediaRouteButton">
	//   28   58:ldc2            #479 <String "showDialog(): Route controller dialog already showing!">
	//   29   61:invokestatic    #485 <Method int Log.w(String, String)>
	//   30   64:pop             
					return false;
	//   31   65:iconst_0        
	//   32   66:ireturn         
				}
				MediaRouteControllerDialogFragment mediaroutecontrollerdialogfragment = mDialogFactory.onCreateControllerDialogFragment();
	//   33   67:aload_0         
	//   34   68:getfield        #91  <Field MediaRouteDialogFactory mDialogFactory>
	//   35   71:invokevirtual   #489 <Method MediaRouteControllerDialogFragment MediaRouteDialogFactory.onCreateControllerDialogFragment()>
	//   36   74:astore_2        
				mediaroutecontrollerdialogfragment.setRouteSelector(mSelector);
	//   37   75:aload_2         
	//   38   76:aload_0         
	//   39   77:getfield        #83  <Field MediaRouteSelector mSelector>
	//   40   80:invokevirtual   #493 <Method void MediaRouteControllerDialogFragment.setRouteSelector(MediaRouteSelector)>
				mediaroutecontrollerdialogfragment.show(ae1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
	//   41   83:aload_2         
	//   42   84:aload_1         
	//   43   85:ldc1            #14  <String "android.support.v7.mediarouter:MediaRouteControllerDialogFragment">
	//   44   87:invokevirtual   #497 <Method void MediaRouteControllerDialogFragment.show(ae, String)>
			} else
	//*  45   90:goto            136
			{
				if(ae1.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
	//*  46   93:aload_1         
	//*  47   94:ldc1            #11  <String "android.support.v7.mediarouter:MediaRouteChooserDialogFragment">
	//*  48   96:invokevirtual   #477 <Method android.support.v4.app.Fragment ae.a(String)>
	//*  49   99:ifnull          113
				{
					Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
	//   50  102:ldc1            #17  <String "MediaRouteButton">
	//   51  104:ldc2            #499 <String "showDialog(): Route chooser dialog already showing!">
	//   52  107:invokestatic    #485 <Method int Log.w(String, String)>
	//   53  110:pop             
					return false;
	//   54  111:iconst_0        
	//   55  112:ireturn         
				}
				MediaRouteChooserDialogFragment mediaroutechooserdialogfragment = mDialogFactory.onCreateChooserDialogFragment();
	//   56  113:aload_0         
	//   57  114:getfield        #91  <Field MediaRouteDialogFactory mDialogFactory>
	//   58  117:invokevirtual   #503 <Method MediaRouteChooserDialogFragment MediaRouteDialogFactory.onCreateChooserDialogFragment()>
	//   59  120:astore_2        
				mediaroutechooserdialogfragment.setRouteSelector(mSelector);
	//   60  121:aload_2         
	//   61  122:aload_0         
	//   62  123:getfield        #83  <Field MediaRouteSelector mSelector>
	//   63  126:invokevirtual   #506 <Method void MediaRouteChooserDialogFragment.setRouteSelector(MediaRouteSelector)>
				mediaroutechooserdialogfragment.show(ae1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
	//   64  129:aload_2         
	//   65  130:aload_1         
	//   66  131:ldc1            #11  <String "android.support.v7.mediarouter:MediaRouteChooserDialogFragment">
	//   67  133:invokevirtual   #507 <Method void MediaRouteChooserDialogFragment.show(ae, String)>
			}
			return true;
	//   68  136:iconst_1        
	//   69  137:ireturn         
		} else
		{
			throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
	//   70  138:new             #509 <Class IllegalStateException>
	//   71  141:dup             
	//   72  142:ldc2            #511 <String "The activity must be a subclass of FragmentActivity">
	//   73  145:invokespecial   #512 <Method void IllegalStateException(String)>
	//   74  148:athrow          
		}
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mRemoteIndicator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #516 <Method boolean View.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #240 <Field Drawable mRemoteIndicator>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	private static final int CHECKABLE_STATE_SET[] = {
		0x101009f
	};
	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
	private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
	private static final String TAG = "MediaRouteButton";
	static final SparseArray sRemoteIndicatorCache = new SparseArray(2);
	private boolean mAttachedToWindow;
	private ColorStateList mButtonTint;
	private final MediaRouterCallback mCallback;
	private MediaRouteDialogFactory mDialogFactory;
	private boolean mIsConnecting;
	private int mMinHeight;
	private int mMinWidth;
	private boolean mRemoteActive;
	private Drawable mRemoteIndicator;
	RemoteIndicatorLoader mRemoteIndicatorLoader;
	private final MediaRouter mRouter;
	private MediaRouteSelector mSelector;

	static 
	{
	//    0    0:new             #44  <Class SparseArray>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #48  <Method void SparseArray(int)>
	//    4    8:putstatic       #50  <Field SparseArray sRemoteIndicatorCache>
	//    5   11:iconst_1        
	//    6   12:newarray        int[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #51  <Int 0x10100a0>
	//   10   18:iastore         
	//   11   19:putstatic       #53  <Field int[] CHECKED_STATE_SET>
	//   12   22:iconst_1        
	//   13   23:newarray        int[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:ldc1            #54  <Int 0x101009f>
	//   17   29:iastore         
	//   18   30:putstatic       #56  <Field int[] CHECKABLE_STATE_SET>
	//*  19   33:return          
	}

	private class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		final MediaRouteButton this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}


	private class RemoteIndicatorLoader extends AsyncTask
	{

		private void cacheAndReset(Drawable drawable)
		{
			if(drawable != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          18
				MediaRouteButton.sRemoteIndicatorCache.put(mResId, ((Object) (drawable.getConstantState())));
		//    2    4:getstatic       #26  <Field SparseArray MediaRouteButton.sRemoteIndicatorCache>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field int mResId>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #32  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//    7   15:invokevirtual   #38  <Method void SparseArray.put(int, Object)>
			mRemoteIndicatorLoader = null;
		//    8   18:aload_0         
		//    9   19:getfield        #12  <Field MediaRouteButton this$0>
		//   10   22:aconst_null     
		//   11   23:putfield        #42  <Field MediaRouteButton$RemoteIndicatorLoader MediaRouteButton.mRemoteIndicatorLoader>
		//   12   26:return          
		}

		protected transient Drawable doInBackground(Void avoid[])
		{
			return getContext().getResources().getDrawable(mResId);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #48  <Method Context MediaRouteButton.getContext()>
		//    3    7:invokevirtual   #54  <Method Resources Context.getResources()>
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field int mResId>
		//    6   14:invokevirtual   #60  <Method Drawable Resources.getDrawable(int)>
		//    7   17:areturn         
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #63  <Class Void[]>
		//    3    5:invokevirtual   #65  <Method Drawable doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected void onCancelled(Drawable drawable)
		{
			cacheAndReset(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #68  <Method void cacheAndReset(Drawable)>
		//    3    5:return          
		}

		protected volatile void onCancelled(Object obj)
		{
			onCancelled((Drawable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #28  <Class Drawable>
		//    3    5:invokevirtual   #71  <Method void onCancelled(Drawable)>
		//    4    8:return          
		}

		protected void onPostExecute(Drawable drawable)
		{
			cacheAndReset(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #68  <Method void cacheAndReset(Drawable)>
			setRemoteIndicatorDrawable(drawable);
		//    3    5:aload_0         
		//    4    6:getfield        #12  <Field MediaRouteButton this$0>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #75  <Method void MediaRouteButton.setRemoteIndicatorDrawable(Drawable)>
		//    7   13:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Drawable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #28  <Class Drawable>
		//    3    5:invokevirtual   #77  <Method void onPostExecute(Drawable)>
		//    4    8:return          
		}

		private final int mResId;
		final MediaRouteButton this$0;

		RemoteIndicatorLoader(int i)
		{
			this$0 = MediaRouteButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void AsyncTask()>
			mResId = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #17  <Field int mResId>
		//    8   14:return          
		}
	}

}
