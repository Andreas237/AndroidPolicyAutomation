// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton
	implements Checkable
{

	public CheckableImageButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #27  <Method void CheckableImageButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public CheckableImageButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.imageButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #33  <Field int android.support.v7.appcompat.R$attr.imageButtonStyle>
	//    4    6:invokespecial   #36  <Method void CheckableImageButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CheckableImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #37  <Method void AppCompatImageButton(Context, AttributeSet, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
			{
				super.onInitializeAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #22  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
				accessibilityevent.setChecked(d.isChecked());
			//    4    6:aload_2         
			//    5    7:aload_0         
			//    6    8:getfield        #14  <Field CheckableImageButton d>
			//    7   11:invokevirtual   #26  <Method boolean CheckableImageButton.isChecked()>
			//    8   14:invokevirtual   #32  <Method void AccessibilityEvent.setChecked(boolean)>
			//    9   17:return          
			}

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #36  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat.setCheckable(true);
			//    4    6:aload_2         
			//    5    7:iconst_1        
			//    6    8:invokevirtual   #41  <Method void AccessibilityNodeInfoCompat.setCheckable(boolean)>
				accessibilitynodeinfocompat.setChecked(d.isChecked());
			//    7   11:aload_2         
			//    8   12:aload_0         
			//    9   13:getfield        #14  <Field CheckableImageButton d>
			//   10   16:invokevirtual   #26  <Method boolean CheckableImageButton.isChecked()>
			//   11   19:invokevirtual   #42  <Method void AccessibilityNodeInfoCompat.setChecked(boolean)>
			//   12   22:return          
			}

			final CheckableImageButton d;

			
			{
				d = CheckableImageButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CheckableImageButton d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AccessibilityDelegateCompat()>
			//    5    9:return          
			}
		}
)));
	//    5    7:aload_0         
	//    6    8:new             #8   <Class CheckableImageButton$4>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #40  <Method void CheckableImageButton$4(CheckableImageButton)>
	//   10   16:invokestatic    #46  <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   11   19:return          
	}

	public boolean isChecked()
	{
		return mChecked;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mChecked>
	//    2    4:ireturn         
	}

	public int[] onCreateDrawableState(int i)
	{
		if(mChecked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mChecked>
	//*   2    4:ifeq            24
			return mergeDrawableStates(super.onCreateDrawableState(DRAWABLE_STATE_CHECKED.length + i), DRAWABLE_STATE_CHECKED);
	//    3    7:aload_0         
	//    4    8:getstatic       #21  <Field int[] DRAWABLE_STATE_CHECKED>
	//    5   11:arraylength     
	//    6   12:iload_1         
	//    7   13:iadd            
	//    8   14:invokespecial   #54  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//    9   17:getstatic       #21  <Field int[] DRAWABLE_STATE_CHECKED>
	//   10   20:invokestatic    #58  <Method int[] mergeDrawableStates(int[], int[])>
	//   11   23:areturn         
		else
			return super.onCreateDrawableState(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #54  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//   15   29:areturn         
	}

	public void setChecked(boolean flag)
	{
		if(mChecked != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mChecked>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          24
		{
			mChecked = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #50  <Field boolean mChecked>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #63  <Method void refreshDrawableState()>
			sendAccessibilityEvent(2048);
	//    9   17:aload_0         
	//   10   18:sipush          2048
	//   11   21:invokevirtual   #67  <Method void sendAccessibilityEvent(int)>
		}
	//   12   24:return          
	}

	public void toggle()
	{
		boolean flag;
		if(!mChecked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mChecked>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		setChecked(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #70  <Method void setChecked(boolean)>
	//   11   19:return          
	}

	private static final int DRAWABLE_STATE_CHECKED[] = {
		0x10100a0
	};
	private boolean mChecked;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #19  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #21  <Field int[] DRAWABLE_STATE_CHECKED>
	//*   7   11:return          
	}
}
