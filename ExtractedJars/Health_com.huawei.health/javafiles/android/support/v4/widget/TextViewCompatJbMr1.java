// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class TextViewCompatJbMr1
{

	TextViewCompatJbMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		boolean flag;
		if(textview.getLayoutDirection() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method int TextView.getLayoutDirection()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		textview = ((TextView) (textview.getCompoundDrawables()));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #25  <Method Drawable[] TextView.getCompoundDrawables()>
	//   11   19:astore_0        
		if(flag)
	//*  12   20:iload_1         
	//*  13   21:ifeq            40
		{
			Object obj = textview[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:aaload          
	//   17   27:astore_2        
			Object obj1 = textview[0];
	//   18   28:aload_0         
	//   19   29:iconst_0        
	//   20   30:aaload          
	//   21   31:astore_3        
			textview[0] = obj;
	//   22   32:aload_0         
	//   23   33:iconst_0        
	//   24   34:aload_2         
	//   25   35:aastore         
			textview[2] = obj1;
	//   26   36:aload_0         
	//   27   37:iconst_2        
	//   28   38:aload_3         
	//   29   39:aastore         
		}
		return ((Drawable []) (textview));
	//   30   40:aload_0         
	//   31   41:areturn         
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		boolean flag;
		if(textview.getLayoutDirection() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method int TextView.getLayoutDirection()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore          5
		else
	//*   6   11:goto            17
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		Drawable drawable4;
		if(flag)
	//*   9   17:iload           5
	//*  10   19:ifeq            28
			drawable4 = drawable2;
	//   11   22:aload_3         
	//   12   23:astore          6
		else
	//*  13   25:goto            31
			drawable4 = drawable;
	//   14   28:aload_1         
	//   15   29:astore          6
		if(!flag)
	//*  16   31:iload           5
	//*  17   33:ifeq            39
	//*  18   36:goto            41
			drawable = drawable2;
	//   19   39:aload_3         
	//   20   40:astore_1        
		textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
	//   21   41:aload_0         
	//   22   42:aload           6
	//   23   44:aload_2         
	//   24   45:aload_1         
	//   25   46:aload           4
	//   26   48:invokevirtual   #33  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   27   51:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		boolean flag;
		if(textview.getLayoutDirection() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method int TextView.getLayoutDirection()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore          6
		else
	//*   6   11:goto            17
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          6
		int i1;
		if(flag)
	//*   9   17:iload           6
	//*  10   19:ifeq            28
			i1 = k;
	//   11   22:iload_3         
	//   12   23:istore          5
		else
	//*  13   25:goto            31
			i1 = i;
	//   14   28:iload_1         
	//   15   29:istore          5
		if(!flag)
	//*  16   31:iload           6
	//*  17   33:ifeq            39
	//*  18   36:goto            41
			i = k;
	//   19   39:iload_3         
	//   20   40:istore_1        
		textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
	//   21   41:aload_0         
	//   22   42:iload           5
	//   23   44:iload_2         
	//   24   45:iload_1         
	//   25   46:iload           4
	//   26   48:invokevirtual   #39  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
	//   27   51:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		boolean flag;
		if(textview.getLayoutDirection() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method int TextView.getLayoutDirection()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore          5
		else
	//*   6   11:goto            17
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		Drawable drawable4;
		if(flag)
	//*   9   17:iload           5
	//*  10   19:ifeq            28
			drawable4 = drawable2;
	//   11   22:aload_3         
	//   12   23:astore          6
		else
	//*  13   25:goto            31
			drawable4 = drawable;
	//   14   28:aload_1         
	//   15   29:astore          6
		if(!flag)
	//*  16   31:iload           5
	//*  17   33:ifeq            39
	//*  18   36:goto            41
			drawable = drawable2;
	//   19   39:aload_3         
	//   20   40:astore_1        
		textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
	//   21   41:aload_0         
	//   22   42:aload           6
	//   23   44:aload_2         
	//   24   45:aload_1         
	//   25   46:aload           4
	//   26   48:invokevirtual   #41  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//   27   51:return          
	}
}
