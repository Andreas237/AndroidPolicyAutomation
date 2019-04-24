// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi17Impl extends TextViewCompat$TextViewCompatApi16Impl
{

	public Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		int i = textview.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_3         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		textview = ((TextView) (textview.getCompoundDrawables()));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #28  <Method Drawable[] TextView.getCompoundDrawables()>
	//   13   21:astore_1        
		if(flag)
	//*  14   22:iload_2         
	//*  15   23:ifeq            46
		{
			Object obj = textview[2];
	//   16   26:aload_1         
	//   17   27:iconst_2        
	//   18   28:aaload          
	//   19   29:astore          4
			Object obj1 = textview[0];
	//   20   31:aload_1         
	//   21   32:iconst_0        
	//   22   33:aaload          
	//   23   34:astore          5
			textview[0] = obj;
	//   24   36:aload_1         
	//   25   37:iconst_0        
	//   26   38:aload           4
	//   27   40:aastore         
			textview[2] = obj1;
	//   28   41:aload_1         
	//   29   42:iconst_2        
	//   30   43:aload           5
	//   31   45:aastore         
		}
		return ((Drawable []) (textview));
	//   32   46:aload_1         
	//   33   47:areturn         
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		int i = textview.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//    2    4:istore          7
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		if(i != 1)
	//*   5    9:iload           7
	//*   6   11:iconst_1        
	//*   7   12:icmpne          18
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
		Drawable drawable4;
		if(flag)
	//*  11   21:iload           6
	//*  12   23:ifeq            33
			drawable4 = drawable2;
	//   13   26:aload           4
	//   14   28:astore          8
		else
	//*  15   30:goto            36
			drawable4 = drawable;
	//   16   33:aload_2         
	//   17   34:astore          8
		if(!flag)
	//*  18   36:iload           6
	//*  19   38:ifeq            44
	//*  20   41:goto            47
			drawable = drawable2;
	//   21   44:aload           4
	//   22   46:astore_2        
		textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
	//   23   47:aload_1         
	//   24   48:aload           8
	//   25   50:aload_3         
	//   26   51:aload_2         
	//   27   52:aload           5
	//   28   54:invokevirtual   #36  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   29   57:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		int i1 = textview.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//    2    4:istore          7
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		if(i1 != 1)
	//*   5    9:iload           7
	//*   6   11:iconst_1        
	//*   7   12:icmpne          18
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
		if(flag)
	//*  11   21:iload           6
	//*  12   23:ifeq            33
			i1 = k;
	//   13   26:iload           4
	//   14   28:istore          7
		else
	//*  15   30:goto            36
			i1 = i;
	//   16   33:iload_2         
	//   17   34:istore          7
		if(!flag)
	//*  18   36:iload           6
	//*  19   38:ifeq            44
	//*  20   41:goto            47
			i = k;
	//   21   44:iload           4
	//   22   46:istore_2        
		textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
	//   23   47:aload_1         
	//   24   48:iload           7
	//   25   50:iload_3         
	//   26   51:iload_2         
	//   27   52:iload           5
	//   28   54:invokevirtual   #43  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
	//   29   57:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		int i = textview.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//    2    4:istore          7
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		if(i != 1)
	//*   5    9:iload           7
	//*   6   11:iconst_1        
	//*   7   12:icmpne          18
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
		Drawable drawable4;
		if(flag)
	//*  11   21:iload           6
	//*  12   23:ifeq            33
			drawable4 = drawable2;
	//   13   26:aload           4
	//   14   28:astore          8
		else
	//*  15   30:goto            36
			drawable4 = drawable;
	//   16   33:aload_2         
	//   17   34:astore          8
		if(!flag)
	//*  18   36:iload           6
	//*  19   38:ifeq            44
	//*  20   41:goto            47
			drawable = drawable2;
	//   21   44:aload           4
	//   22   46:astore_2        
		textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
	//   23   47:aload_1         
	//   24   48:aload           8
	//   25   50:aload_3         
	//   26   51:aload_2         
	//   27   52:aload           5
	//   28   54:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//   29   57:return          
	}

	TextViewCompat$TextViewCompatApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi16Impl()>
	//    2    4:return          
	}
}
