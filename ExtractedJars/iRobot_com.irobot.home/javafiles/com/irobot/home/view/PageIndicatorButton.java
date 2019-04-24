// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import java.util.*;

public class PageIndicatorButton extends ImageButton
{
	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/view/PageIndicatorButton$a, s);
		//    0    0:ldc1            #2   <Class PageIndicatorButton$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PageIndicatorButton$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field PageIndicatorButton$a[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.view.PageIndicatorButton$a_3B_.clone()>
		//    2    6:checkcast       #42  <Class PageIndicatorButton$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a Blue;
		public static final a Green;
		public static final a Grey;

		static 
		{
			Blue = new a("Blue", 0);
		//    0    0:new             #2   <Class PageIndicatorButton$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Blue">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
		//    5   10:putstatic       #23  <Field PageIndicatorButton$a Blue>
			Green = new a("Green", 1);
		//    6   13:new             #2   <Class PageIndicatorButton$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Green">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
		//   11   23:putstatic       #26  <Field PageIndicatorButton$a Green>
			Grey = new a("Grey", 2);
		//   12   26:new             #2   <Class PageIndicatorButton$a>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Grey">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
		//   17   36:putstatic       #29  <Field PageIndicatorButton$a Grey>
			$VALUES = (new a[] {
				Blue, Green, Grey
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field PageIndicatorButton$a Blue>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field PageIndicatorButton$a Green>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field PageIndicatorButton$a Grey>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field PageIndicatorButton$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PageIndicatorButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void ImageButton(Context)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void b()>
	//    5    9:return          
	}

	public PageIndicatorButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method void ImageButton(Context, AttributeSet)>
		b();
	//    4    6:aload_0         
	//    5    7:invokespecial   #56  <Method void b()>
	//    6   10:return          
	}

	public PageIndicatorButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #62  <Method void ImageButton(Context, AttributeSet, int)>
		b();
	//    5    7:aload_0         
	//    6    8:invokespecial   #56  <Method void b()>
	//    7   11:return          
	}

	private void b()
	{
		setLayoutParams(new android.view.ViewGroup.LayoutParams((int)getResources().getDimension(0x7f070146), (int)getResources().getDimension(0x7f070146)));
	//    0    0:aload_0         
	//    1    1:new             #64  <Class android.view.ViewGroup$LayoutParams>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #68  <Method Resources getResources()>
	//    5    9:ldc1            #69  <Int 0x7f070146>
	//    6   11:invokevirtual   #75  <Method float Resources.getDimension(int)>
	//    7   14:f2i             
	//    8   15:aload_0         
	//    9   16:invokevirtual   #68  <Method Resources getResources()>
	//   10   19:ldc1            #69  <Int 0x7f070146>
	//   11   21:invokevirtual   #75  <Method float Resources.getDimension(int)>
	//   12   24:f2i             
	//   13   25:invokespecial   #78  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   14   28:invokevirtual   #82  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
		a();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #84  <Method void a()>
		setBackgroundColor(0);
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #88  <Method void setBackgroundColor(int)>
		setScaleType(android.widget.ImageView.ScaleType.CENTER);
	//   20   40:aload_0         
	//   21   41:getstatic       #94  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//   22   44:invokevirtual   #98  <Method void setScaleType(android.widget.ImageView$ScaleType)>
	//   23   47:return          
	}

	public void a()
	{
		setImageDrawable(getResources().getDrawable(((Integer)a.get(((Object) (a.Grey)))).intValue()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #68  <Method Resources getResources()>
	//    3    5:getstatic       #49  <Field Map a>
	//    4    8:getstatic       #40  <Field PageIndicatorButton$a PageIndicatorButton$a.Grey>
	//    5   11:invokeinterface #102 <Method Object Map.get(Object)>
	//    6   16:checkcast       #23  <Class Integer>
	//    7   19:invokevirtual   #106 <Method int Integer.intValue()>
	//    8   22:invokevirtual   #110 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//    9   25:invokevirtual   #114 <Method void setImageDrawable(android.graphics.drawable.Drawable)>
	//   10   28:return          
	}

	public void a(a a1)
	{
		setImageDrawable(getResources().getDrawable(((Integer)a.get(((Object) (a1)))).intValue()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #68  <Method Resources getResources()>
	//    3    5:getstatic       #49  <Field Map a>
	//    4    8:aload_1         
	//    5    9:invokeinterface #102 <Method Object Map.get(Object)>
	//    6   14:checkcast       #23  <Class Integer>
	//    7   17:invokevirtual   #106 <Method int Integer.intValue()>
	//    8   20:invokevirtual   #110 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//    9   23:invokevirtual   #114 <Method void setImageDrawable(android.graphics.drawable.Drawable)>
	//   10   26:return          
	}

	private static transient Map a;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #13  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put(((Object) (a.Blue)), ((Object) (Integer.valueOf(0x7f08007e))));
	//    4    8:aload_0         
	//    5    9:getstatic       #20  <Field PageIndicatorButton$a PageIndicatorButton$a.Blue>
	//    6   12:ldc1            #21  <Int 0x7f08007e>
	//    7   14:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    8   17:invokeinterface #33  <Method Object Map.put(Object, Object)>
	//    9   22:pop             
		((Map) (hashmap)).put(((Object) (a.Green)), ((Object) (Integer.valueOf(0x7f08007f))));
	//   10   23:aload_0         
	//   11   24:getstatic       #36  <Field PageIndicatorButton$a PageIndicatorButton$a.Green>
	//   12   27:ldc1            #37  <Int 0x7f08007f>
	//   13   29:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   14   32:invokeinterface #33  <Method Object Map.put(Object, Object)>
	//   15   37:pop             
		((Map) (hashmap)).put(((Object) (a.Grey)), ((Object) (Integer.valueOf(0x7f080080))));
	//   16   38:aload_0         
	//   17   39:getstatic       #40  <Field PageIndicatorButton$a PageIndicatorButton$a.Grey>
	//   18   42:ldc1            #41  <Int 0x7f080080>
	//   19   44:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   20   47:invokeinterface #33  <Method Object Map.put(Object, Object)>
	//   21   52:pop             
		a = Collections.unmodifiableMap(((Map) (hashmap)));
	//   22   53:aload_0         
	//   23   54:invokestatic    #47  <Method Map Collections.unmodifiableMap(Map)>
	//   24   57:putstatic       #49  <Field Map a>
	//*  25   60:return          
	}
}
