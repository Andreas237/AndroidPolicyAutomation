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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(textview.getLayoutDirection() != 1)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//*   4    6:iconst_1        
	//*   5    7:icmpne          39
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #28  <Method Drawable[] TextView.getCompoundDrawables()>
	//*   8   14:astore_1        
	//*   9   15:iload_2         
	//*  10   16:ifeq            37
	//*  11   19:aload_1         
	//*  12   20:iconst_2        
	//*  13   21:aaload          
	//*  14   22:astore_3        
	//*  15   23:aload_1         
	//*  16   24:iconst_0        
	//*  17   25:aaload          
	//*  18   26:astore          4
	//*  19   28:aload_1         
	//*  20   29:iconst_0        
	//*  21   30:aload_3         
	//*  22   31:aastore         
	//*  23   32:aload_1         
	//*  24   33:iconst_2        
	//*  25   34:aload           4
	//*  26   36:aastore         
	//*  27   37:aload_1         
	//*  28   38:areturn         
			flag = false;
	//   29   39:iconst_0        
	//   30   40:istore_2        
		textview = ((TextView) (textview.getCompoundDrawables()));
		if(flag)
		{
			Object obj = textview[2];
			Object obj1 = textview[0];
			textview[0] = obj;
			textview[2] = obj1;
		}
		return ((Drawable []) (textview));
	//*  31   41:goto            10
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		Drawable drawable4;
		if(textview.getLayoutDirection() != 1)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//*   4    7:iconst_1        
	//*   5    8:icmpne          36
	//*   6   11:iload           6
	//*   7   13:ifeq            42
	//*   8   16:aload           4
	//*   9   18:astore          7
	//*  10   20:iload           6
	//*  11   22:ifeq            48
	//*  12   25:aload_1         
	//*  13   26:aload           7
	//*  14   28:aload_3         
	//*  15   29:aload_2         
	//*  16   30:aload           5
	//*  17   32:invokevirtual   #36  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//*  18   35:return          
			flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          6
		if(flag)
			drawable4 = drawable2;
		else
	//*  21   39:goto            11
			drawable4 = drawable;
	//   22   42:aload_2         
	//   23   43:astore          7
		if(!flag)
	//*  24   45:goto            20
			drawable = drawable2;
	//   25   48:aload           4
	//   26   50:astore_2        
		textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
	//*  27   51:goto            25
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		int i1;
		if(textview.getLayoutDirection() != 1)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//*   4    7:iconst_1        
	//*   5    8:icmpne          36
	//*   6   11:iload           6
	//*   7   13:ifeq            42
	//*   8   16:iload           4
	//*   9   18:istore          7
	//*  10   20:iload           6
	//*  11   22:ifeq            48
	//*  12   25:aload_1         
	//*  13   26:iload           7
	//*  14   28:iload_3         
	//*  15   29:iload_2         
	//*  16   30:iload           5
	//*  17   32:invokevirtual   #43  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
	//*  18   35:return          
			flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          6
		if(flag)
			i1 = k;
		else
	//*  21   39:goto            11
			i1 = i;
	//   22   42:iload_2         
	//   23   43:istore          7
		if(!flag)
	//*  24   45:goto            20
			i = k;
	//   25   48:iload           4
	//   26   50:istore_2        
		textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
	//*  27   51:goto            25
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		Drawable drawable4;
		if(textview.getLayoutDirection() != 1)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
	//*   4    7:iconst_1        
	//*   5    8:icmpne          36
	//*   6   11:iload           6
	//*   7   13:ifeq            42
	//*   8   16:aload           4
	//*   9   18:astore          7
	//*  10   20:iload           6
	//*  11   22:ifeq            48
	//*  12   25:aload_1         
	//*  13   26:aload           7
	//*  14   28:aload_3         
	//*  15   29:aload_2         
	//*  16   30:aload           5
	//*  17   32:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//*  18   35:return          
			flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          6
		if(flag)
			drawable4 = drawable2;
		else
	//*  21   39:goto            11
			drawable4 = drawable;
	//   22   42:aload_2         
	//   23   43:astore          7
		if(!flag)
	//*  24   45:goto            20
			drawable = drawable2;
	//   25   48:aload           4
	//   26   50:astore_2        
		textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
	//*  27   51:goto            25
	}

	TextViewCompat$TextViewCompatApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi16Impl()>
	//    2    4:return          
	}
}
