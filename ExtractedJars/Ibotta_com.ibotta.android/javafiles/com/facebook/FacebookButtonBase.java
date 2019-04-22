// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.support.v4.app.Fragment;
import android.text.TextPaint;
import android.widget.Button;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FragmentWrapper;

// Referenced classes of package com.facebook:
//			FacebookException

public abstract class FacebookButtonBase extends Button
{

	private void logButtonCreated(Context context)
	{
		AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonCreatedEventName, ((Double) (null)), ((android.os.Bundle) (null)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field String analyticsButtonCreatedEventName>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #31  <Method void AppEventsLogger.logSdkEvent(String, Double, android.os.Bundle)>
	//    7   13:return          
	}

	protected Activity getActivity()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Context getContext()>
	//    2    4:astore_2        
		boolean flag;
		do
		{
			flag = context instanceof Activity;
	//    3    5:aload_2         
	//    4    6:instanceof      #40  <Class Activity>
	//    5    9:istore_1        
			if(flag || !(context instanceof ContextWrapper))
				break;
	//    6   10:iload_1         
	//    7   11:ifne            32
	//    8   14:aload_2         
	//    9   15:instanceof      #42  <Class ContextWrapper>
	//   10   18:ifeq            32
			context = ((ContextWrapper)context).getBaseContext();
	//   11   21:aload_2         
	//   12   22:checkcast       #42  <Class ContextWrapper>
	//   13   25:invokevirtual   #45  <Method Context ContextWrapper.getBaseContext()>
	//   14   28:astore_2        
		} while(true);
	//   15   29:goto            5
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            41
			return (Activity)context;
	//   18   36:aload_2         
	//   19   37:checkcast       #40  <Class Activity>
	//   20   40:areturn         
		else
			throw new FacebookException("Unable to get Activity.");
	//   21   41:new             #47  <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc1            #49  <String "Unable to get Activity.">
	//   24   47:invokespecial   #53  <Method void FacebookException(String)>
	//   25   50:athrow          
	}

	public int getCompoundPaddingLeft()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingLeft;
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field int overrideCompoundPaddingLeft>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingLeft();
	//    6   12:aload_0         
	//    7   13:invokespecial   #61  <Method int Button.getCompoundPaddingLeft()>
	//    8   16:ireturn         
	}

	public int getCompoundPaddingRight()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingRight;
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field int overrideCompoundPaddingRight>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokespecial   #66  <Method int Button.getCompoundPaddingRight()>
	//    8   16:ireturn         
	}

	protected abstract int getDefaultRequestCode();

	protected int getDefaultStyleResource()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Fragment getFragment()
	{
		FragmentWrapper fragmentwrapper = parentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentWrapper parentFragment>
	//    2    4:astore_1        
		if(fragmentwrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return fragmentwrapper.getSupportFragment();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method Fragment FragmentWrapper.getSupportFragment()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.app.Fragment getNativeFragment()
	{
		FragmentWrapper fragmentwrapper = parentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentWrapper parentFragment>
	//    2    4:astore_1        
		if(fragmentwrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return fragmentwrapper.getNativeFragment();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #81  <Method android.app.Fragment FragmentWrapper.getNativeFragment()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public int getRequestCode()
	{
		return getDefaultRequestCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method int getDefaultRequestCode()>
	//    2    4:ireturn         
	}

	protected int measureTextWidth(String s)
	{
		return (int)Math.ceil(getPaint().measureText(s));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method TextPaint getPaint()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method float TextPaint.measureText(String)>
	//    4    8:f2d             
	//    5    9:invokestatic    #102 <Method double Math.ceil(double)>
	//    6   12:d2i             
	//    7   13:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void Button.onAttachedToWindow()>
		if(!isInEditMode())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #110 <Method boolean isInEditMode()>
	//*   4    8:ifne            19
			logButtonCreated(getContext());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #38  <Method Context getContext()>
	//    8   16:invokespecial   #112 <Method void logButtonCreated(Context)>
	//    9   19:return          
	}

	protected void onDraw(Canvas canvas)
	{
		boolean flag;
		if((getGravity() & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #117 <Method int getGravity()>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:ifeq            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(flag)
	//*  10   16:iload_2         
	//*  11   17:ifeq            97
		{
			int i = getCompoundPaddingLeft();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #118 <Method int getCompoundPaddingLeft()>
	//   14   24:istore_2        
			int j = getCompoundPaddingRight();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #119 <Method int getCompoundPaddingRight()>
	//   17   29:istore_3        
			int k = getCompoundDrawablePadding();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #122 <Method int getCompoundDrawablePadding()>
	//   20   34:istore          4
			k = Math.min((getWidth() - (k + i) - j - measureTextWidth(getText().toString())) / 2, (i - getPaddingLeft()) / 2);
	//   21   36:aload_0         
	//   22   37:invokevirtual   #125 <Method int getWidth()>
	//   23   40:iload           4
	//   24   42:iload_2         
	//   25   43:iadd            
	//   26   44:isub            
	//   27   45:iload_3         
	//   28   46:isub            
	//   29   47:aload_0         
	//   30   48:aload_0         
	//   31   49:invokevirtual   #129 <Method CharSequence getText()>
	//   32   52:invokeinterface #135 <Method String CharSequence.toString()>
	//   33   57:invokevirtual   #137 <Method int measureTextWidth(String)>
	//   34   60:isub            
	//   35   61:iconst_2        
	//   36   62:idiv            
	//   37   63:iload_2         
	//   38   64:aload_0         
	//   39   65:invokevirtual   #140 <Method int getPaddingLeft()>
	//   40   68:isub            
	//   41   69:iconst_2        
	//   42   70:idiv            
	//   43   71:invokestatic    #144 <Method int Math.min(int, int)>
	//   44   74:istore          4
			overrideCompoundPaddingLeft = i - k;
	//   45   76:aload_0         
	//   46   77:iload_2         
	//   47   78:iload           4
	//   48   80:isub            
	//   49   81:putfield        #59  <Field int overrideCompoundPaddingLeft>
			overrideCompoundPaddingRight = j + k;
	//   50   84:aload_0         
	//   51   85:iload_3         
	//   52   86:iload           4
	//   53   88:iadd            
	//   54   89:putfield        #64  <Field int overrideCompoundPaddingRight>
			overrideCompoundPadding = true;
	//   55   92:aload_0         
	//   56   93:iconst_1        
	//   57   94:putfield        #57  <Field boolean overrideCompoundPadding>
		}
		super.onDraw(canvas);
	//   58   97:aload_0         
	//   59   98:aload_1         
	//   60   99:invokespecial   #146 <Method void Button.onDraw(Canvas)>
		overrideCompoundPadding = false;
	//   61  102:aload_0         
	//   62  103:iconst_0        
	//   63  104:putfield        #57  <Field boolean overrideCompoundPadding>
	//   64  107:return          
	}

	public void setFragment(android.app.Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #74  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #150 <Method void FragmentWrapper(android.app.Fragment)>
	//    5    9:putfield        #72  <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	public void setFragment(Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #74  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #153 <Method void FragmentWrapper(Fragment)>
	//    5    9:putfield        #72  <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	protected void setInternalOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		internalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #157 <Field android.view.View$OnClickListener internalOnClickListener>
	//    3    5:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		externalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field android.view.View$OnClickListener externalOnClickListener>
	//    3    5:return          
	}

	private String analyticsButtonCreatedEventName;
	private android.view.View.OnClickListener externalOnClickListener;
	private android.view.View.OnClickListener internalOnClickListener;
	private boolean overrideCompoundPadding;
	private int overrideCompoundPaddingLeft;
	private int overrideCompoundPaddingRight;
	private FragmentWrapper parentFragment;
}
