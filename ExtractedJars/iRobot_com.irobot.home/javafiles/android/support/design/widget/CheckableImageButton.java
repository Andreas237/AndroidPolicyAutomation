// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.s;
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
	//    3    3:invokespecial   #23  <Method void CheckableImageButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public CheckableImageButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.imageButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #29  <Field int android.support.v7.a.a$a.imageButtonStyle>
	//    4    6:invokespecial   #32  <Method void CheckableImageButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CheckableImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #33  <Method void AppCompatImageButton(Context, AttributeSet, int)>
		s.a(((View) (this)), ((a) (new a() {

			public void a(View view, b b1)
			{
				super.a(view, b1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #21  <Method void a.a(View, b)>
				b1.a(true);
			//    4    6:aload_2         
			//    5    7:iconst_1        
			//    6    8:invokevirtual   #26  <Method void b.a(boolean)>
				b1.b(a.isChecked());
			//    7   11:aload_2         
			//    8   12:aload_0         
			//    9   13:getfield        #14  <Field CheckableImageButton a>
			//   10   16:invokevirtual   #30  <Method boolean CheckableImageButton.isChecked()>
			//   11   19:invokevirtual   #33  <Method void b.b(boolean)>
			//   12   22:return          
			}

			public void a(View view, AccessibilityEvent accessibilityevent)
			{
				super.a(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #36  <Method void a.a(View, AccessibilityEvent)>
				accessibilityevent.setChecked(a.isChecked());
			//    4    6:aload_2         
			//    5    7:aload_0         
			//    6    8:getfield        #14  <Field CheckableImageButton a>
			//    7   11:invokevirtual   #30  <Method boolean CheckableImageButton.isChecked()>
			//    8   14:invokevirtual   #41  <Method void AccessibilityEvent.setChecked(boolean)>
			//    9   17:return          
			}

			final CheckableImageButton a;

			
			{
				a = CheckableImageButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CheckableImageButton a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void a()>
			//    5    9:return          
			}
		}
)));
	//    5    7:aload_0         
	//    6    8:new             #8   <Class CheckableImageButton$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #36  <Method void CheckableImageButton$1(CheckableImageButton)>
	//   10   16:invokestatic    #41  <Method void s.a(View, a)>
	//   11   19:return          
	}

	public boolean isChecked()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean b>
	//    2    4:ireturn         
	}

	public int[] onCreateDrawableState(int i)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean b>
	//*   2    4:ifeq            24
			return mergeDrawableStates(super.onCreateDrawableState(i + a.length), a);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:getstatic       #17  <Field int[] a>
	//    6   12:arraylength     
	//    7   13:iadd            
	//    8   14:invokespecial   #49  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//    9   17:getstatic       #17  <Field int[] a>
	//   10   20:invokestatic    #53  <Method int[] mergeDrawableStates(int[], int[])>
	//   11   23:areturn         
		else
			return super.onCreateDrawableState(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #49  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//   15   29:areturn         
	}

	public void setChecked(boolean flag)
	{
		if(b != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          24
		{
			b = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #45  <Field boolean b>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #58  <Method void refreshDrawableState()>
			sendAccessibilityEvent(2048);
	//    9   17:aload_0         
	//   10   18:sipush          2048
	//   11   21:invokevirtual   #62  <Method void sendAccessibilityEvent(int)>
		}
	//   12   24:return          
	}

	public void toggle()
	{
		setChecked(b ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field boolean b>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:invokevirtual   #65  <Method void setChecked(boolean)>
	//    6   10:return          
	}

	private static final int a[] = {
		0x10100a0
	};
	private boolean b;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #15  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #17  <Field int[] a>
	//*   7   11:return          
	}
}
