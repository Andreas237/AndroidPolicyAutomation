// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//			as, av, f, l

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView
	implements r
{

	public AppCompatAutoCompleteTextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.autoCompleteTextViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #29  <Field int android.support.v7.a.a$a.autoCompleteTextViewStyle>
	//    4    6:invokespecial   #32  <Method void AppCompatAutoCompleteTextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
	{
		super(as.a(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #37  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #38  <Method void AutoCompleteTextView(Context, AttributeSet, int)>
		context = ((Context) (av.a(getContext(), attributeset, a, i, 0)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #42  <Method Context getContext()>
	//    8   14:aload_2         
	//    9   15:getstatic       #17  <Field int[] a>
	//   10   18:iload_3         
	//   11   19:iconst_0        
	//   12   20:invokestatic    #47  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   13   23:astore_1        
		if(((av) (context)).g(0))
	//*  14   24:aload_1         
	//*  15   25:iconst_0        
	//*  16   26:invokevirtual   #51  <Method boolean av.g(int)>
	//*  17   29:ifeq            41
			setDropDownBackgroundDrawable(((av) (context)).a(0));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #54  <Method Drawable av.a(int)>
	//   22   38:invokevirtual   #58  <Method void setDropDownBackgroundDrawable(Drawable)>
		((av) (context)).a();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #60  <Method void av.a()>
		b = new f(((android.view.View) (this)));
	//   25   45:aload_0         
	//   26   46:new             #62  <Class f>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:invokespecial   #65  <Method void f(android.view.View)>
	//   30   54:putfield        #67  <Field f b>
		b.a(attributeset, i);
	//   31   57:aload_0         
	//   32   58:getfield        #67  <Field f b>
	//   33   61:aload_2         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #70  <Method void f.a(AttributeSet, int)>
		c = l.a(((android.widget.TextView) (this)));
	//   36   66:aload_0         
	//   37   67:aload_0         
	//   38   68:invokestatic    #75  <Method l l.a(android.widget.TextView)>
	//   39   71:putfield        #77  <Field l c>
		c.a(attributeset, i);
	//   40   74:aload_0         
	//   41   75:getfield        #77  <Field l c>
	//   42   78:aload_2         
	//   43   79:iload_3         
	//   44   80:invokevirtual   #78  <Method void l.a(AttributeSet, int)>
		c.a();
	//   45   83:aload_0         
	//   46   84:getfield        #77  <Field l c>
	//   47   87:invokevirtual   #79  <Method void l.a()>
	//   48   90:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void AutoCompleteTextView.drawableStateChanged()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field f b>
	//*   4    8:ifnull          18
			b.c();
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field f b>
	//    7   15:invokevirtual   #84  <Method void f.c()>
		if(c != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #77  <Field l c>
	//*  10   22:ifnull          32
			c.a();
	//   11   25:aload_0         
	//   12   26:getfield        #77  <Field l c>
	//   13   29:invokevirtual   #79  <Method void l.a()>
	//   14   32:return          
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field f b>
	//*   2    4:ifnull          15
			return b.a();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field f b>
	//    5   11:invokevirtual   #88  <Method ColorStateList f.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field f b>
	//*   2    4:ifnull          15
			return b.b();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field f b>
	//    5   11:invokevirtual   #92  <Method android.graphics.PorterDuff$Mode android.support.v7.widget.f.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void AutoCompleteTextView.setBackgroundDrawable(Drawable)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #67  <Field f b>
	//*   5    9:ifnull          20
			b.a(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field f b>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #97  <Method void f.a(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #101 <Method void AutoCompleteTextView.setBackgroundResource(int)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #67  <Field f b>
	//*   5    9:ifnull          20
			b.a(i);
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field f b>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #103 <Method void f.a(int)>
	//   10   20:return          
	}

	public void setDropDownBackgroundResource(int i)
	{
		setDropDownBackgroundDrawable(android.support.v7.c.a.b.b(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #42  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #109 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #58  <Method void setDropDownBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field f b>
	//*   2    4:ifnull          15
			b.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field f b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #113 <Method void f.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field f b>
	//*   2    4:ifnull          15
			b.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field f b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #117 <Method void f.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #121 <Method void AutoCompleteTextView.setTextAppearance(Context, int)>
		if(c != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #77  <Field l c>
	//*   6   10:ifnull          22
			c.a(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #77  <Field l c>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #123 <Method void l.a(Context, int)>
	//   12   22:return          
	}

	private static final int a[] = {
		0x1010176
	};
	private final f b;
	private final l c;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #15  <Int 0x1010176>
	//    5    7:iastore         
	//    6    8:putstatic       #17  <Field int[] a>
	//*   7   11:return          
	}
}
