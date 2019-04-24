// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomTabLayout extends TabLayout
{

	public CustomTabLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void TabLayout(Context)>
		a(context, ((AttributeSet) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    7   11:return          
	}

	public CustomTabLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void TabLayout(Context, AttributeSet)>
		a(context, attributeset);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    8   12:return          
	}

	public CustomTabLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #20  <Method void TabLayout(Context, AttributeSet, int)>
		a(context, attributeset);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    9   13:return          
	}

	private void a(Context context, AttributeSet attributeset)
	{
		String s;
		s = "";
	//    0    0:ldc1            #22  <String "">
	//    1    2:astore_3        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_38;
	//    2    3:aload_2         
	//    3    4:ifnull          38
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.irobotAttributes, 0, 0)));
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:getstatic       #28  <Field int[] com.irobot.home.g$a.irobotAttributes>
	//    7   12:iconst_0        
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #34  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   17:astore_2        
		s = ((TypedArray) (attributeset)).getString(0);
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #40  <Method String TypedArray.getString(int)>
	//   14   23:astore_3        
		((TypedArray) (attributeset)).recycle();
	//   15   24:aload_2         
	//   16   25:invokevirtual   #44  <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_38;
	//   17   28:goto            38
		context;
	//   18   31:astore_1        
		((TypedArray) (attributeset)).recycle();
	//   19   32:aload_2         
	//   20   33:invokevirtual   #44  <Method void TypedArray.recycle()>
		throw context;
	//   21   36:aload_1         
	//   22   37:athrow          
		if(s != null && !s.equals(""))
	//*  23   38:aload_3         
	//*  24   39:ifnull          63
	//*  25   42:aload_3         
	//*  26   43:ldc1            #22  <String "">
	//*  27   45:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  28   48:ifne            63
			n = Typeface.createFromAsset(context.getAssets(), s);
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #54  <Method android.content.res.AssetManager Context.getAssets()>
	//   32   56:aload_3         
	//   33   57:invokestatic    #60  <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//   34   60:putfield        #62  <Field Typeface n>
		return;
	//   35   63:return          
	}

	public void a(android.support.design.widget.TabLayout.e e)
	{
		super.a(e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void TabLayout.a(android.support.design.widget.TabLayout$e)>
		if(n != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #62  <Field Typeface n>
	//*   5    9:ifnull          78
		{
			e = ((android.support.design.widget.TabLayout.e) ((ViewGroup)((ViewGroup)getChildAt(0)).getChildAt(e.c())));
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #69  <Method android.view.View getChildAt(int)>
	//    9   17:checkcast       #71  <Class ViewGroup>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #77  <Method int android.support.design.widget.TabLayout$e.c()>
	//   12   24:invokevirtual   #78  <Method android.view.View ViewGroup.getChildAt(int)>
	//   13   27:checkcast       #71  <Class ViewGroup>
	//   14   30:astore_1        
			int j = ((ViewGroup) (e)).getChildCount();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #81  <Method int ViewGroup.getChildCount()>
	//   17   35:istore_3        
			for(int i = 0; i < j; i++)
	//*  18   36:iconst_0        
	//*  19   37:istore_2        
	//*  20   38:iload_2         
	//*  21   39:iload_3         
	//*  22   40:icmpge          78
			{
				android.view.View view = ((ViewGroup) (e)).getChildAt(i);
	//   23   43:aload_1         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #78  <Method android.view.View ViewGroup.getChildAt(int)>
	//   26   48:astore          4
				if(view instanceof TextView)
	//*  27   50:aload           4
	//*  28   52:instanceof      #83  <Class TextView>
	//*  29   55:ifeq            71
					((TextView)view).setTypeface(n, 0);
	//   30   58:aload           4
	//   31   60:checkcast       #83  <Class TextView>
	//   32   63:aload_0         
	//   33   64:getfield        #62  <Field Typeface n>
	//   34   67:iconst_0        
	//   35   68:invokevirtual   #87  <Method void TextView.setTypeface(Typeface, int)>
			}

	//   36   71:iload_2         
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore_2        
		}
	//*  40   75:goto            38
	//   41   78:return          
	}

	private Typeface n;
}
