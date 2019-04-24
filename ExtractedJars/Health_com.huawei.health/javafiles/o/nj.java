// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import com.github.mikephil.charting.data.Entry;

// Referenced classes of package o:
//			nl, oc, mr, ma, 
//			oa, ml, mz, la, 
//			mh

public abstract class nj extends nl
{

	public nj(la la, oa oa1)
	{
		super(oa1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void nl(oa)>
		i = la;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field la i>
		h = new Paint(1);
	//    6   10:aload_0         
	//    7   11:new             #20  <Class Paint>
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:invokespecial   #23  <Method void Paint(int)>
	//   11   19:putfield        #25  <Field Paint h>
		h.setStyle(android.graphics.Paint.Style.FILL);
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field Paint h>
	//   14   26:getstatic       #31  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   15   29:invokevirtual   #35  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		g = new Paint(4);
	//   16   32:aload_0         
	//   17   33:new             #20  <Class Paint>
	//   18   36:dup             
	//   19   37:iconst_4        
	//   20   38:invokespecial   #23  <Method void Paint(int)>
	//   21   41:putfield        #37  <Field Paint g>
		n = new Paint(1);
	//   22   44:aload_0         
	//   23   45:new             #20  <Class Paint>
	//   24   48:dup             
	//   25   49:iconst_1        
	//   26   50:invokespecial   #23  <Method void Paint(int)>
	//   27   53:putfield        #39  <Field Paint n>
		n.setColor(Color.rgb(63, 63, 63));
	//   28   56:aload_0         
	//   29   57:getfield        #39  <Field Paint n>
	//   30   60:bipush          63
	//   31   62:bipush          63
	//   32   64:bipush          63
	//   33   66:invokestatic    #45  <Method int Color.rgb(int, int, int)>
	//   34   69:invokevirtual   #48  <Method void Paint.setColor(int)>
		n.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   35   72:aload_0         
	//   36   73:getfield        #39  <Field Paint n>
	//   37   76:getstatic       #54  <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   38   79:invokevirtual   #58  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		n.setTextSize(oc.b(9F));
	//   39   82:aload_0         
	//   40   83:getfield        #39  <Field Paint n>
	//   41   86:ldc1            #59  <Float 9F>
	//   42   88:invokestatic    #65  <Method float oc.b(float)>
	//   43   91:invokevirtual   #69  <Method void Paint.setTextSize(float)>
		k = new Paint(1);
	//   44   94:aload_0         
	//   45   95:new             #20  <Class Paint>
	//   46   98:dup             
	//   47   99:iconst_1        
	//   48  100:invokespecial   #23  <Method void Paint(int)>
	//   49  103:putfield        #71  <Field Paint k>
		k.setStyle(android.graphics.Paint.Style.STROKE);
	//   50  106:aload_0         
	//   51  107:getfield        #71  <Field Paint k>
	//   52  110:getstatic       #74  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   53  113:invokevirtual   #35  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		k.setStrokeWidth(2.0F);
	//   54  116:aload_0         
	//   55  117:getfield        #71  <Field Paint k>
	//   56  120:fconst_2        
	//   57  121:invokevirtual   #77  <Method void Paint.setStrokeWidth(float)>
		k.setColor(Color.rgb(255, 187, 115));
	//   58  124:aload_0         
	//   59  125:getfield        #71  <Field Paint k>
	//   60  128:sipush          255
	//   61  131:sipush          187
	//   62  134:bipush          115
	//   63  136:invokestatic    #45  <Method int Color.rgb(int, int, int)>
	//   64  139:invokevirtual   #48  <Method void Paint.setColor(int)>
	//   65  142:return          
	}

	public abstract void a(Canvas canvas);

	protected boolean c(mr mr1)
	{
		return (float)mr1.getData().o() < (float)mr1.getMaxVisibleCount() * l.u();
	//    0    0:aload_1         
	//    1    1:invokeinterface #88  <Method ma mr.getData()>
	//    2    6:invokevirtual   #94  <Method int ma.o()>
	//    3    9:i2f             
	//    4   10:aload_1         
	//    5   11:invokeinterface #97  <Method int mr.getMaxVisibleCount()>
	//    6   16:i2f             
	//    7   17:aload_0         
	//    8   18:getfield        #101 <Field oa l>
	//    9   21:invokevirtual   #107 <Method float oa.u()>
	//   10   24:fmul            
	//   11   25:fcmpg           
	//   12   26:ifge            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	public abstract void d(Canvas canvas);

	public void d(Canvas canvas, ml ml1, float f, Entry entry, int j, float f1, float f2, 
			int l)
	{
		n.setColor(l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Paint n>
	//    2    4:iload           8
	//    3    6:invokevirtual   #48  <Method void Paint.setColor(int)>
		canvas.drawText(ml1.b(f, entry, j, this.l), f1, f2, n);
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:fload_3         
	//    7   12:aload           4
	//    8   14:iload           5
	//    9   16:aload_0         
	//   10   17:getfield        #101 <Field oa l>
	//   11   20:invokeinterface #114 <Method String ml.b(float, Entry, int, oa)>
	//   12   25:fload           6
	//   13   27:fload           7
	//   14   29:aload_0         
	//   15   30:getfield        #39  <Field Paint n>
	//   16   33:invokevirtual   #120 <Method void Canvas.drawText(String, float, float, Paint)>
	//   17   36:return          
	}

	public abstract void d(Canvas canvas, mh amh[]);

	public abstract void e();

	public abstract void e(Canvas canvas);

	protected void e(mz mz1)
	{
		n.setTypeface(mz1.r());
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Paint n>
	//    2    4:aload_1         
	//    3    5:invokeinterface #130 <Method android.graphics.Typeface mz.r()>
	//    4   10:invokevirtual   #134 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    5   13:pop             
		n.setTextSize(mz1.s());
	//    6   14:aload_0         
	//    7   15:getfield        #39  <Field Paint n>
	//    8   18:aload_1         
	//    9   19:invokeinterface #137 <Method float mz.s()>
	//   10   24:invokevirtual   #69  <Method void Paint.setTextSize(float)>
	//   11   27:return          
	}

	protected Paint g;
	protected Paint h;
	protected la i;
	protected Paint k;
	protected Paint n;
}
