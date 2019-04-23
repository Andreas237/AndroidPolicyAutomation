// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ac;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;

// Referenced classes of package android.support.design.widget:
//			ab

public class CheckableImageButton extends AppCompatImageButton
	implements Checkable
{

	public CheckableImageButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.imageButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #24  <Field int android.support.v7.appcompat.R$attr.imageButtonStyle>
	//    4    6:invokespecial   #27  <Method void CheckableImageButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CheckableImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void AppCompatImageButton(Context, AttributeSet, int)>
		ac.a(((android.view.View) (this)), ((android.support.v4.view.b) (new ab(this))));
	//    5    7:aload_0         
	//    6    8:new             #30  <Class ab>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #33  <Method void ab(CheckableImageButton)>
	//   10   16:invokestatic    #38  <Method void ac.a(android.view.View, android.support.v4.view.b)>
	//   11   19:return          
	}

	public boolean isChecked()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean b>
	//    2    4:ireturn         
	}

	public int[] onCreateDrawableState(int i)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean b>
	//*   2    4:ifeq            24
			return mergeDrawableStates(super.onCreateDrawableState(i + a.length), a);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:getstatic       #15  <Field int[] a>
	//    6   12:arraylength     
	//    7   13:iadd            
	//    8   14:invokespecial   #46  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//    9   17:getstatic       #15  <Field int[] a>
	//   10   20:invokestatic    #50  <Method int[] mergeDrawableStates(int[], int[])>
	//   11   23:areturn         
		else
			return super.onCreateDrawableState(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #46  <Method int[] AppCompatImageButton.onCreateDrawableState(int)>
	//   15   29:areturn         
	}

	public void setChecked(boolean flag)
	{
		if(b != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          24
		{
			b = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #42  <Field boolean b>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #55  <Method void refreshDrawableState()>
			sendAccessibilityEvent(2048);
	//    9   17:aload_0         
	//   10   18:sipush          2048
	//   11   21:invokevirtual   #59  <Method void sendAccessibilityEvent(int)>
		}
	//   12   24:return          
	}

	public void toggle()
	{
		setChecked(b ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field boolean b>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:invokevirtual   #62  <Method void setChecked(boolean)>
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
	//    4    5:ldc1            #13  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #15  <Field int[] a>
	//*   7   11:return          
	}
}
