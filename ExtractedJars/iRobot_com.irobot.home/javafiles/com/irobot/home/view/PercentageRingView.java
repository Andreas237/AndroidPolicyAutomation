// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.view:
//			d

public class PercentageRingView extends View
{

	public PercentageRingView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void View(Context)>
		a(((AttributeSet) (null)), 0);
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_0        
	//    6    8:invokespecial   #21  <Method void a(AttributeSet, int)>
	//    7   11:return          
	}

	public PercentageRingView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void View(Context, AttributeSet)>
		a(attributeset, 0);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:invokespecial   #21  <Method void a(AttributeSet, int)>
	//    8   12:return          
	}

	public PercentageRingView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #27  <Method void View(Context, AttributeSet, int)>
		a(attributeset, i);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:invokespecial   #21  <Method void a(AttributeSet, int)>
	//    9   13:return          
	}

	private void a(AttributeSet attributeset, int i)
	{
		b = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #29  <Field int b>
		c = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #31  <String "">
	//    5    8:putfield        #33  <Field String c>
		setLayerType(1, ((android.graphics.Paint) (null)));
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #37  <Method void setLayerType(int, android.graphics.Paint)>
	//   10   17:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void View.onDraw(Canvas)>
		d.a(canvas, getContext(), getResources().getColor(0x7f060093), getResources().getColor(0x7f060092), getResources().getColor(0x7f060091), new RectF(0.0F, 0.0F, getWidth(), getHeight()), (float)b / 100F, c, true, 2.0F);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #45  <Method Context getContext()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #49  <Method Resources getResources()>
	//    8   14:ldc1            #50  <Int 0x7f060093>
	//    9   16:invokevirtual   #56  <Method int Resources.getColor(int)>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #49  <Method Resources getResources()>
	//   12   23:ldc1            #57  <Int 0x7f060092>
	//   13   25:invokevirtual   #56  <Method int Resources.getColor(int)>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #49  <Method Resources getResources()>
	//   16   32:ldc1            #58  <Int 0x7f060091>
	//   17   34:invokevirtual   #56  <Method int Resources.getColor(int)>
	//   18   37:new             #60  <Class RectF>
	//   19   40:dup             
	//   20   41:fconst_0        
	//   21   42:fconst_0        
	//   22   43:aload_0         
	//   23   44:invokevirtual   #64  <Method int getWidth()>
	//   24   47:i2f             
	//   25   48:aload_0         
	//   26   49:invokevirtual   #67  <Method int getHeight()>
	//   27   52:i2f             
	//   28   53:invokespecial   #70  <Method void RectF(float, float, float, float)>
	//   29   56:aload_0         
	//   30   57:getfield        #29  <Field int b>
	//   31   60:i2f             
	//   32   61:ldc1            #71  <Float 100F>
	//   33   63:fdiv            
	//   34   64:aload_0         
	//   35   65:getfield        #33  <Field String c>
	//   36   68:iconst_1        
	//   37   69:fconst_2        
	//   38   70:invokestatic    #76  <Method void d.a(Canvas, Context, int, int, int, RectF, float, String, boolean, float)>
	//   39   73:return          
	}

	public void setRingFillPercentile(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int b>
		if(b > 100)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int b>
	//*   5    9:bipush          100
	//*   6   11:icmple          56
		{
			String s = a;
	//    7   14:getstatic       #80  <Field String a>
	//    8   17:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #82  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #84  <Method void StringBuilder()>
	//   12   25:astore_3        
			stringbuilder.append("Ring view percentile out of range: ");
	//   13   26:aload_3         
	//   14   27:ldc1            #86  <String "Ring view percentile out of range: ">
	//   15   29:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(String.valueOf(i));
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:invokestatic    #96  <Method String String.valueOf(int)>
	//   20   38:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			o.e(s, stringbuilder.toString());
	//   22   42:aload_2         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #106 <Method void o.e(String, String)>
			b = 100;
	//   26   50:aload_0         
	//   27   51:bipush          100
	//   28   53:putfield        #29  <Field int b>
		}
		if(b < 0)
	//*  29   56:aload_0         
	//*  30   57:getfield        #29  <Field int b>
	//*  31   60:ifge            104
		{
			String s1 = a;
	//   32   63:getstatic       #80  <Field String a>
	//   33   66:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   34   67:new             #82  <Class StringBuilder>
	//   35   70:dup             
	//   36   71:invokespecial   #84  <Method void StringBuilder()>
	//   37   74:astore_3        
			stringbuilder1.append("Ring view percentile out of range: ");
	//   38   75:aload_3         
	//   39   76:ldc1            #86  <String "Ring view percentile out of range: ">
	//   40   78:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			stringbuilder1.append(String.valueOf(i));
	//   42   82:aload_3         
	//   43   83:iload_1         
	//   44   84:invokestatic    #96  <Method String String.valueOf(int)>
	//   45   87:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
			o.e(s1, stringbuilder1.toString());
	//   47   91:aload_2         
	//   48   92:aload_3         
	//   49   93:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #106 <Method void o.e(String, String)>
			b = 0;
	//   51   99:aload_0         
	//   52  100:iconst_0        
	//   53  101:putfield        #29  <Field int b>
		}
		invalidate();
	//   54  104:aload_0         
	//   55  105:invokevirtual   #109 <Method void invalidate()>
	//   56  108:return          
	}

	public void setRingLabelText(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String c>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #109 <Method void invalidate()>
	//    5    9:return          
	}

	private static String a = "PercentageRingView";
	private int b;
	private String c;

	static 
	{
	//    0    0:return          
	}
}
