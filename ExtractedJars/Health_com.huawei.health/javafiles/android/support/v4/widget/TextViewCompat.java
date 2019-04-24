// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompatApi23, TextViewCompatJbMr2, TextViewCompatJbMr1, TextViewCompatJb, 
//			TextViewCompatGingerbread

public final class TextViewCompat
{
	static class Api23TextViewCompatImpl extends JbMr2TextViewCompatImpl
	{

		public void setTextAppearance(TextView textview, int i)
		{
			TextViewCompatApi23.setTextAppearance(textview, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #20  <Method void TextViewCompatApi23.setTextAppearance(TextView, int)>
		//    3    5:return          
		}

		Api23TextViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void TextViewCompat$JbMr2TextViewCompatImpl()>
		//    2    4:return          
		}
	}

	static class BaseTextViewCompatImpl
		implements TextViewCompatImpl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return TextViewCompatGingerbread.getCompoundDrawablesRelative(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method Drawable[] TextViewCompatGingerbread.getCompoundDrawablesRelative(TextView)>
		//    2    4:areturn         
		}

		public int getMaxLines(TextView textview)
		{
			return TextViewCompatGingerbread.getMaxLines(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int TextViewCompatGingerbread.getMaxLines(TextView)>
		//    2    4:ireturn         
		}

		public int getMinLines(TextView textview)
		{
			return TextViewCompatGingerbread.getMinLines(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #29  <Method int TextViewCompatGingerbread.getMinLines(TextView)>
		//    2    4:ireturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #38  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #47  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setTextAppearance(TextView textview, int i)
		{
			TextViewCompatGingerbread.setTextAppearance(textview, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #52  <Method void TextViewCompatGingerbread.setTextAppearance(TextView, int)>
		//    3    5:return          
		}

		BaseTextViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class JbMr1TextViewCompatImpl extends JbTextViewCompatImpl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return TextViewCompatJbMr1.getCompoundDrawablesRelative(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #19  <Method Drawable[] TextViewCompatJbMr1.getCompoundDrawablesRelative(TextView)>
		//    2    4:areturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			TextViewCompatJbMr1.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokestatic    #25  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokestatic    #30  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokestatic    #32  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		JbMr1TextViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void TextViewCompat$JbTextViewCompatImpl()>
		//    2    4:return          
		}
	}

	static class JbMr2TextViewCompatImpl extends JbMr1TextViewCompatImpl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return TextViewCompatJbMr2.getCompoundDrawablesRelative(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #19  <Method Drawable[] TextViewCompatJbMr2.getCompoundDrawablesRelative(TextView)>
		//    2    4:areturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			TextViewCompatJbMr2.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokestatic    #25  <Method void TextViewCompatJbMr2.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokestatic    #30  <Method void TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokestatic    #32  <Method void TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		JbMr2TextViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void TextViewCompat$JbMr1TextViewCompatImpl()>
		//    2    4:return          
		}
	}

	static class JbTextViewCompatImpl extends BaseTextViewCompatImpl
	{

		public int getMaxLines(TextView textview)
		{
			return TextViewCompatJb.getMaxLines(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method int TextViewCompatJb.getMaxLines(TextView)>
		//    2    4:ireturn         
		}

		public int getMinLines(TextView textview)
		{
			return TextViewCompatJb.getMinLines(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method int TextViewCompatJb.getMinLines(TextView)>
		//    2    4:ireturn         
		}

		JbTextViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void TextViewCompat$BaseTextViewCompatImpl()>
		//    2    4:return          
		}
	}

	static interface TextViewCompatImpl
	{

		public abstract Drawable[] getCompoundDrawablesRelative(TextView textview);

		public abstract int getMaxLines(TextView textview);

		public abstract int getMinLines(TextView textview);

		public abstract void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);

		public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l);

		public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);

		public abstract void setTextAppearance(TextView textview, int i);
	}


	private TextViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return IMPL.getCompoundDrawablesRelative(textview);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #48  <Method Drawable[] TextViewCompat$TextViewCompatImpl.getCompoundDrawablesRelative(TextView)>
	//    3    9:areturn         
	}

	public static int getMaxLines(TextView textview)
	{
		return IMPL.getMaxLines(textview);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #53  <Method int TextViewCompat$TextViewCompatImpl.getMaxLines(TextView)>
	//    3    9:ireturn         
	}

	public static int getMinLines(TextView textview)
	{
		return IMPL.getMinLines(textview);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #56  <Method int TextViewCompat$TextViewCompatImpl.getMinLines(TextView)>
	//    3    9:ireturn         
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #61  <Method void TextViewCompat$TextViewCompatImpl.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   14:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokeinterface #66  <Method void TextViewCompat$TextViewCompatImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
	//    7   14:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #68  <Method void TextViewCompat$TextViewCompatImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   14:return          
	}

	public static void setTextAppearance(TextView textview, int i)
	{
		IMPL.setTextAppearance(textview, i);
	//    0    0:getstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #73  <Method void TextViewCompat$TextViewCompatImpl.setTextAppearance(TextView, int)>
	//    4   10:return          
	}

	static final TextViewCompatImpl IMPL;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 23)
	//*   2    4:iload_0         
	//*   3    5:bipush          23
	//*   4    7:icmplt          21
			IMPL = ((TextViewCompatImpl) (new Api23TextViewCompatImpl()));
	//    5   10:new             #6   <Class TextViewCompat$Api23TextViewCompatImpl>
	//    6   13:dup             
	//    7   14:invokespecial   #35  <Method void TextViewCompat$Api23TextViewCompatImpl()>
	//    8   17:putstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//    9   20:return          
		else
		if(i >= 18)
	//*  10   21:iload_0         
	//*  11   22:bipush          18
	//*  12   24:icmplt          38
			IMPL = ((TextViewCompatImpl) (new JbMr2TextViewCompatImpl()));
	//   13   27:new             #15  <Class TextViewCompat$JbMr2TextViewCompatImpl>
	//   14   30:dup             
	//   15   31:invokespecial   #38  <Method void TextViewCompat$JbMr2TextViewCompatImpl()>
	//   16   34:putstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//   17   37:return          
		else
		if(i >= 17)
	//*  18   38:iload_0         
	//*  19   39:bipush          17
	//*  20   41:icmplt          55
			IMPL = ((TextViewCompatImpl) (new JbMr1TextViewCompatImpl()));
	//   21   44:new             #12  <Class TextViewCompat$JbMr1TextViewCompatImpl>
	//   22   47:dup             
	//   23   48:invokespecial   #39  <Method void TextViewCompat$JbMr1TextViewCompatImpl()>
	//   24   51:putstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//   25   54:return          
		else
		if(i >= 16)
	//*  26   55:iload_0         
	//*  27   56:bipush          16
	//*  28   58:icmplt          72
			IMPL = ((TextViewCompatImpl) (new JbTextViewCompatImpl()));
	//   29   61:new             #18  <Class TextViewCompat$JbTextViewCompatImpl>
	//   30   64:dup             
	//   31   65:invokespecial   #40  <Method void TextViewCompat$JbTextViewCompatImpl()>
	//   32   68:putstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//   33   71:return          
		else
			IMPL = ((TextViewCompatImpl) (new BaseTextViewCompatImpl()));
	//   34   72:new             #9   <Class TextViewCompat$BaseTextViewCompatImpl>
	//   35   75:dup             
	//   36   76:invokespecial   #41  <Method void TextViewCompat$BaseTextViewCompatImpl()>
	//   37   79:putstatic       #37  <Field TextViewCompat$TextViewCompatImpl IMPL>
	//*  38   82:return          
	}
}
