// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

// Referenced classes of package o:
//			lk, nz, ld, mh

public class lr extends RelativeLayout
	implements lk
{

	public lr(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void RelativeLayout(Context)>
		e = new nz();
	//    3    5:aload_0         
	//    4    6:new             #19  <Class nz>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void nz()>
	//    7   13:putfield        #24  <Field nz e>
		b = new nz();
	//    8   16:aload_0         
	//    9   17:new             #19  <Class nz>
	//   10   20:dup             
	//   11   21:invokespecial   #22  <Method void nz()>
	//   12   24:putfield        #26  <Field nz b>
		setupLayoutResource(i);
	//   13   27:aload_0         
	//   14   28:iload_2         
	//   15   29:invokespecial   #30  <Method void setupLayoutResource(int)>
	//   16   32:return          
	}

	private void setupLayoutResource(int i)
	{
		View view = LayoutInflater.from(getContext()).inflate(i, ((android.view.ViewGroup) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method Context getContext()>
	//    2    4:invokestatic    #41  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    6   12:astore_2        
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-2, -2))));
	//    7   13:aload_2         
	//    8   14:new             #47  <Class android.widget.RelativeLayout$LayoutParams>
	//    9   17:dup             
	//   10   18:bipush          -2
	//   11   20:bipush          -2
	//   12   22:invokespecial   #50  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   13   25:invokevirtual   #56  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//   14   28:aload_2         
	//   15   29:iconst_0        
	//   16   30:iconst_0        
	//   17   31:invokestatic    #62  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:invokestatic    #62  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   39:invokevirtual   #65  <Method void View.measure(int, int)>
		view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
	//   22   42:aload_2         
	//   23   43:iconst_0        
	//   24   44:iconst_0        
	//   25   45:aload_2         
	//   26   46:invokevirtual   #69  <Method int View.getMeasuredWidth()>
	//   27   49:aload_2         
	//   28   50:invokevirtual   #72  <Method int View.getMeasuredHeight()>
	//   29   53:invokevirtual   #76  <Method void View.layout(int, int, int, int)>
	//   30   56:return          
	}

	public nz b(float f, float f1)
	{
		Object obj = ((Object) (getOffset()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method nz getOffset()>
	//    2    4:astore          5
		b.e = ((nz) (obj)).e;
	//    3    6:aload_0         
	//    4    7:getfield        #26  <Field nz b>
	//    5   10:aload           5
	//    6   12:getfield        #84  <Field float nz.e>
	//    7   15:putfield        #84  <Field float nz.e>
		b.c = ((nz) (obj)).c;
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field nz b>
	//   10   22:aload           5
	//   11   24:getfield        #86  <Field float nz.c>
	//   12   27:putfield        #86  <Field float nz.c>
		obj = ((Object) (getChartView()));
	//   13   30:aload_0         
	//   14   31:invokevirtual   #90  <Method ld getChartView()>
	//   15   34:astore          5
		float f2 = getWidth();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #93  <Method int getWidth()>
	//   18   40:i2f             
	//   19   41:fstore_3        
		float f3 = getHeight();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #96  <Method int getHeight()>
	//   22   46:i2f             
	//   23   47:fstore          4
		if(b.e + f < 0.0F)
	//*  24   49:aload_0         
	//*  25   50:getfield        #26  <Field nz b>
	//*  26   53:getfield        #84  <Field float nz.e>
	//*  27   56:fload_1         
	//*  28   57:fadd            
	//*  29   58:fconst_0        
	//*  30   59:fcmpg           
	//*  31   60:ifge            75
			b.e = -f;
	//   32   63:aload_0         
	//   33   64:getfield        #26  <Field nz b>
	//   34   67:fload_1         
	//   35   68:fneg            
	//   36   69:putfield        #84  <Field float nz.e>
		else
	//*  37   72:goto            118
		if(obj != null && f + f2 + b.e > (float)((ld) (obj)).getWidth())
	//*  38   75:aload           5
	//*  39   77:ifnull          118
	//*  40   80:fload_1         
	//*  41   81:fload_3         
	//*  42   82:fadd            
	//*  43   83:aload_0         
	//*  44   84:getfield        #26  <Field nz b>
	//*  45   87:getfield        #84  <Field float nz.e>
	//*  46   90:fadd            
	//*  47   91:aload           5
	//*  48   93:invokevirtual   #99  <Method int ld.getWidth()>
	//*  49   96:i2f             
	//*  50   97:fcmpl           
	//*  51   98:ifle            118
			b.e = (float)((ld) (obj)).getWidth() - f - f2;
	//   52  101:aload_0         
	//   53  102:getfield        #26  <Field nz b>
	//   54  105:aload           5
	//   55  107:invokevirtual   #99  <Method int ld.getWidth()>
	//   56  110:i2f             
	//   57  111:fload_1         
	//   58  112:fsub            
	//   59  113:fload_3         
	//   60  114:fsub            
	//   61  115:putfield        #84  <Field float nz.e>
		if(b.c + f1 < 0.0F)
	//*  62  118:aload_0         
	//*  63  119:getfield        #26  <Field nz b>
	//*  64  122:getfield        #86  <Field float nz.c>
	//*  65  125:fload_2         
	//*  66  126:fadd            
	//*  67  127:fconst_0        
	//*  68  128:fcmpg           
	//*  69  129:ifge            144
			b.c = -f1;
	//   70  132:aload_0         
	//   71  133:getfield        #26  <Field nz b>
	//   72  136:fload_2         
	//   73  137:fneg            
	//   74  138:putfield        #86  <Field float nz.c>
		else
	//*  75  141:goto            189
		if(obj != null && f1 + f3 + b.c > (float)((ld) (obj)).getHeight())
	//*  76  144:aload           5
	//*  77  146:ifnull          189
	//*  78  149:fload_2         
	//*  79  150:fload           4
	//*  80  152:fadd            
	//*  81  153:aload_0         
	//*  82  154:getfield        #26  <Field nz b>
	//*  83  157:getfield        #86  <Field float nz.c>
	//*  84  160:fadd            
	//*  85  161:aload           5
	//*  86  163:invokevirtual   #100 <Method int ld.getHeight()>
	//*  87  166:i2f             
	//*  88  167:fcmpl           
	//*  89  168:ifle            189
			b.c = (float)((ld) (obj)).getHeight() - f1 - f3;
	//   90  171:aload_0         
	//   91  172:getfield        #26  <Field nz b>
	//   92  175:aload           5
	//   93  177:invokevirtual   #100 <Method int ld.getHeight()>
	//   94  180:i2f             
	//   95  181:fload_2         
	//   96  182:fsub            
	//   97  183:fload           4
	//   98  185:fsub            
	//   99  186:putfield        #86  <Field float nz.c>
		return b;
	//  100  189:aload_0         
	//  101  190:getfield        #26  <Field nz b>
	//  102  193:areturn         
	}

	public void b(Canvas canvas, float f, float f1)
	{
		nz nz1 = b(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #103 <Method nz b(float, float)>
	//    4    6:astore          5
		int i = canvas.save();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #108 <Method int Canvas.save()>
	//    7   12:istore          4
		canvas.translate(nz1.e + f, nz1.c + f1);
	//    8   14:aload_1         
	//    9   15:aload           5
	//   10   17:getfield        #84  <Field float nz.e>
	//   11   20:fload_2         
	//   12   21:fadd            
	//   13   22:aload           5
	//   14   24:getfield        #86  <Field float nz.c>
	//   15   27:fload_3         
	//   16   28:fadd            
	//   17   29:invokevirtual   #112 <Method void Canvas.translate(float, float)>
		draw(canvas);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #116 <Method void draw(Canvas)>
		canvas.restoreToCount(i);
	//   21   37:aload_1         
	//   22   38:iload           4
	//   23   40:invokevirtual   #119 <Method void Canvas.restoreToCount(int)>
	//   24   43:return          
	}

	public void d(Entry entry, mh mh)
	{
		measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokestatic    #62  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokestatic    #62  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    7   11:invokevirtual   #122 <Method void measure(int, int)>
		layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:iconst_0        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #123 <Method int getMeasuredWidth()>
	//   13   21:aload_0         
	//   14   22:invokevirtual   #124 <Method int getMeasuredHeight()>
	//   15   25:invokevirtual   #125 <Method void layout(int, int, int, int)>
	//   16   28:return          
	}

	public ld getChartView()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field WeakReference c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (ld)c.get();
	//    5    9:aload_0         
	//    6   10:getfield        #127 <Field WeakReference c>
	//    7   13:invokevirtual   #133 <Method Object WeakReference.get()>
	//    8   16:checkcast       #98  <Class ld>
	//    9   19:areturn         
	}

	public nz getOffset()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field nz e>
	//    2    4:areturn         
	}

	public void setChartView(ld ld1)
	{
		c = new WeakReference(((Object) (ld1)));
	//    0    0:aload_0         
	//    1    1:new             #129 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #138 <Method void WeakReference(Object)>
	//    5    9:putfield        #127 <Field WeakReference c>
	//    6   12:return          
	}

	public void setOffset(float f, float f1)
	{
		e.e = f;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field nz e>
	//    2    4:fload_1         
	//    3    5:putfield        #84  <Field float nz.e>
		e.c = f1;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field nz e>
	//    6   12:fload_2         
	//    7   13:putfield        #86  <Field float nz.c>
	//    8   16:return          
	}

	public void setOffset(nz nz1)
	{
		e = nz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field nz e>
		if(e == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field nz e>
	//*   5    9:ifnonnull       23
			e = new nz();
	//    6   12:aload_0         
	//    7   13:new             #19  <Class nz>
	//    8   16:dup             
	//    9   17:invokespecial   #22  <Method void nz()>
	//   10   20:putfield        #24  <Field nz e>
	//   11   23:return          
	}

	private nz b;
	private WeakReference c;
	private nz e;
}
