// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

// Referenced classes of package android.support.v7.widget:
//			as, l, av

public class AppCompatCheckedTextView extends CheckedTextView
{

	public AppCompatCheckedTextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x10103c8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #20  <Int 0x10103c8>
	//    4    5:invokespecial   #23  <Method void AppCompatCheckedTextView(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public AppCompatCheckedTextView(Context context, AttributeSet attributeset, int i)
	{
		super(as.a(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #29  <Method void CheckedTextView(Context, AttributeSet, int)>
		b = l.a(((android.widget.TextView) (this)));
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokestatic    #34  <Method l l.a(android.widget.TextView)>
	//    9   15:putfield        #36  <Field l b>
		b.a(attributeset, i);
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field l b>
	//   12   22:aload_2         
	//   13   23:iload_3         
	//   14   24:invokevirtual   #39  <Method void l.a(AttributeSet, int)>
		b.a();
	//   15   27:aload_0         
	//   16   28:getfield        #36  <Field l b>
	//   17   31:invokevirtual   #41  <Method void l.a()>
		context = ((Context) (av.a(getContext(), attributeset, a, i, 0)));
	//   18   34:aload_0         
	//   19   35:invokevirtual   #45  <Method Context getContext()>
	//   20   38:aload_2         
	//   21   39:getstatic       #13  <Field int[] a>
	//   22   42:iload_3         
	//   23   43:iconst_0        
	//   24   44:invokestatic    #50  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   25   47:astore_1        
		setCheckMarkDrawable(((av) (context)).a(0));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:iconst_0        
	//   29   51:invokevirtual   #53  <Method android.graphics.drawable.Drawable av.a(int)>
	//   30   54:invokevirtual   #57  <Method void setCheckMarkDrawable(android.graphics.drawable.Drawable)>
		((av) (context)).a();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #58  <Method void av.a()>
	//   33   61:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void CheckedTextView.drawableStateChanged()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field l b>
	//*   4    8:ifnull          18
			b.a();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field l b>
	//    7   15:invokevirtual   #41  <Method void l.a()>
	//    8   18:return          
	}

	public void setCheckMarkDrawable(int i)
	{
		setCheckMarkDrawable(android.support.v7.c.a.b.b(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #45  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #67  <Method android.graphics.drawable.Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #57  <Method void setCheckMarkDrawable(android.graphics.drawable.Drawable)>
	//    6   12:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #71  <Method void CheckedTextView.setTextAppearance(Context, int)>
		if(b != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #36  <Field l b>
	//*   6   10:ifnull          22
			b.a(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field l b>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #73  <Method void l.a(Context, int)>
	//   12   22:return          
	}

	private static final int a[] = {
		0x1010108
	};
	private final l b;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #11  <Int 0x1010108>
	//    5    7:iastore         
	//    6    8:putstatic       #13  <Field int[] a>
	//*   7   11:return          
	}
}
