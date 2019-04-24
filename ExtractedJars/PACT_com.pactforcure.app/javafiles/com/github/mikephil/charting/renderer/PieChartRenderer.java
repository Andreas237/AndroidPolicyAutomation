// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			DataRenderer

public class PieChartRenderer extends DataRenderer
{

	public PieChartRenderer(PieChart piechart, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #33  <Method void DataRenderer(ChartAnimator, ViewPortHandler)>
		mCenterTextLastBounds = new RectF();
	//    4    6:aload_0         
	//    5    7:new             #35  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #38  <Method void RectF()>
	//    8   14:putfield        #40  <Field RectF mCenterTextLastBounds>
	//    9   17:aload_0         
	//   10   18:iconst_3        
	//   11   19:anewarray       RectF[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:new             #35  <Class RectF>
	//   15   27:dup             
	//   16   28:invokespecial   #38  <Method void RectF()>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_1        
	//   20   34:new             #35  <Class RectF>
	//   21   37:dup             
	//   22   38:invokespecial   #38  <Method void RectF()>
	//   23   41:aastore         
	//   24   42:dup             
	//   25   43:iconst_2        
	//   26   44:new             #35  <Class RectF>
	//   27   47:dup             
	//   28   48:invokespecial   #38  <Method void RectF()>
	//   29   51:aastore         
	//   30   52:putfield        #42  <Field RectF[] mRectBuffer>
		mPathBuffer = new Path();
	//   31   55:aload_0         
	//   32   56:new             #44  <Class Path>
	//   33   59:dup             
	//   34   60:invokespecial   #45  <Method void Path()>
	//   35   63:putfield        #47  <Field Path mPathBuffer>
		mInnerRectBuffer = new RectF();
	//   36   66:aload_0         
	//   37   67:new             #35  <Class RectF>
	//   38   70:dup             
	//   39   71:invokespecial   #38  <Method void RectF()>
	//   40   74:putfield        #49  <Field RectF mInnerRectBuffer>
		mHoleCirclePath = new Path();
	//   41   77:aload_0         
	//   42   78:new             #44  <Class Path>
	//   43   81:dup             
	//   44   82:invokespecial   #45  <Method void Path()>
	//   45   85:putfield        #51  <Field Path mHoleCirclePath>
		mChart = piechart;
	//   46   88:aload_0         
	//   47   89:aload_1         
	//   48   90:putfield        #53  <Field PieChart mChart>
		mHolePaint = new Paint(1);
	//   49   93:aload_0         
	//   50   94:new             #55  <Class Paint>
	//   51   97:dup             
	//   52   98:iconst_1        
	//   53   99:invokespecial   #58  <Method void Paint(int)>
	//   54  102:putfield        #60  <Field Paint mHolePaint>
		mHolePaint.setColor(-1);
	//   55  105:aload_0         
	//   56  106:getfield        #60  <Field Paint mHolePaint>
	//   57  109:iconst_m1       
	//   58  110:invokevirtual   #63  <Method void Paint.setColor(int)>
		mHolePaint.setStyle(android.graphics.Paint.Style.FILL);
	//   59  113:aload_0         
	//   60  114:getfield        #60  <Field Paint mHolePaint>
	//   61  117:getstatic       #69  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   62  120:invokevirtual   #73  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mTransparentCirclePaint = new Paint(1);
	//   63  123:aload_0         
	//   64  124:new             #55  <Class Paint>
	//   65  127:dup             
	//   66  128:iconst_1        
	//   67  129:invokespecial   #58  <Method void Paint(int)>
	//   68  132:putfield        #75  <Field Paint mTransparentCirclePaint>
		mTransparentCirclePaint.setColor(-1);
	//   69  135:aload_0         
	//   70  136:getfield        #75  <Field Paint mTransparentCirclePaint>
	//   71  139:iconst_m1       
	//   72  140:invokevirtual   #63  <Method void Paint.setColor(int)>
		mTransparentCirclePaint.setStyle(android.graphics.Paint.Style.FILL);
	//   73  143:aload_0         
	//   74  144:getfield        #75  <Field Paint mTransparentCirclePaint>
	//   75  147:getstatic       #69  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   76  150:invokevirtual   #73  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mTransparentCirclePaint.setAlpha(105);
	//   77  153:aload_0         
	//   78  154:getfield        #75  <Field Paint mTransparentCirclePaint>
	//   79  157:bipush          105
	//   80  159:invokevirtual   #78  <Method void Paint.setAlpha(int)>
		mCenterTextPaint = new TextPaint(1);
	//   81  162:aload_0         
	//   82  163:new             #80  <Class TextPaint>
	//   83  166:dup             
	//   84  167:iconst_1        
	//   85  168:invokespecial   #81  <Method void TextPaint(int)>
	//   86  171:putfield        #83  <Field TextPaint mCenterTextPaint>
		mCenterTextPaint.setColor(0xff000000);
	//   87  174:aload_0         
	//   88  175:getfield        #83  <Field TextPaint mCenterTextPaint>
	//   89  178:ldc1            #84  <Int 0xff000000>
	//   90  180:invokevirtual   #85  <Method void TextPaint.setColor(int)>
		mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12F));
	//   91  183:aload_0         
	//   92  184:getfield        #83  <Field TextPaint mCenterTextPaint>
	//   93  187:ldc1            #86  <Float 12F>
	//   94  189:invokestatic    #92  <Method float Utils.convertDpToPixel(float)>
	//   95  192:invokevirtual   #96  <Method void TextPaint.setTextSize(float)>
		mValuePaint.setTextSize(Utils.convertDpToPixel(13F));
	//   96  195:aload_0         
	//   97  196:getfield        #99  <Field Paint mValuePaint>
	//   98  199:ldc1            #100 <Float 13F>
	//   99  201:invokestatic    #92  <Method float Utils.convertDpToPixel(float)>
	//  100  204:invokevirtual   #101 <Method void Paint.setTextSize(float)>
		mValuePaint.setColor(-1);
	//  101  207:aload_0         
	//  102  208:getfield        #99  <Field Paint mValuePaint>
	//  103  211:iconst_m1       
	//  104  212:invokevirtual   #63  <Method void Paint.setColor(int)>
		mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//  105  215:aload_0         
	//  106  216:getfield        #99  <Field Paint mValuePaint>
	//  107  219:getstatic       #107 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//  108  222:invokevirtual   #111 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//  109  225:return          
	}

	protected float calculateMinimumRadiusForSpacedSlice(PointF pointf, float f, float f1, float f2, float f3, float f4, float f5)
	{
		float f7 = f4 + f5 / 2.0F;
	//    0    0:fload           6
	//    1    2:fload           7
	//    2    4:fconst_2        
	//    3    5:fdiv            
	//    4    6:fadd            
	//    5    7:fstore          9
		float f6 = pointf.x + (float)Math.cos((f4 + f5) * 0.01745329F) * f;
	//    6    9:aload_1         
	//    7   10:getfield        #120 <Field float PointF.x>
	//    8   13:fload           6
	//    9   15:fload           7
	//   10   17:fadd            
	//   11   18:ldc1            #121 <Float 0.01745329F>
	//   12   20:fmul            
	//   13   21:f2d             
	//   14   22:invokestatic    #127 <Method double Math.cos(double)>
	//   15   25:d2f             
	//   16   26:fload_2         
	//   17   27:fmul            
	//   18   28:fadd            
	//   19   29:fstore          8
		f4 = pointf.y + (float)Math.sin((f4 + f5) * 0.01745329F) * f;
	//   20   31:aload_1         
	//   21   32:getfield        #130 <Field float PointF.y>
	//   22   35:fload           6
	//   23   37:fload           7
	//   24   39:fadd            
	//   25   40:ldc1            #121 <Float 0.01745329F>
	//   26   42:fmul            
	//   27   43:f2d             
	//   28   44:invokestatic    #133 <Method double Math.sin(double)>
	//   29   47:d2f             
	//   30   48:fload_2         
	//   31   49:fmul            
	//   32   50:fadd            
	//   33   51:fstore          6
		f5 = pointf.x;
	//   34   53:aload_1         
	//   35   54:getfield        #120 <Field float PointF.x>
	//   36   57:fstore          7
		float f8 = (float)Math.cos(0.01745329F * f7);
	//   37   59:ldc1            #121 <Float 0.01745329F>
	//   38   61:fload           9
	//   39   63:fmul            
	//   40   64:f2d             
	//   41   65:invokestatic    #127 <Method double Math.cos(double)>
	//   42   68:d2f             
	//   43   69:fstore          10
		float f9 = pointf.y;
	//   44   71:aload_1         
	//   45   72:getfield        #130 <Field float PointF.y>
	//   46   75:fstore          11
		f7 = (float)Math.sin(0.01745329F * f7);
	//   47   77:ldc1            #121 <Float 0.01745329F>
	//   48   79:fload           9
	//   49   81:fmul            
	//   50   82:f2d             
	//   51   83:invokestatic    #133 <Method double Math.sin(double)>
	//   52   86:d2f             
	//   53   87:fstore          9
		return (float)((double)(f - (float)((Math.sqrt(Math.pow(f6 - f2, 2D) + Math.pow(f4 - f3, 2D)) / 2D) * Math.tan(((180D - (double)f1) / 2D) * 0.017453292519943295D))) - Math.sqrt(Math.pow((f5 + f8 * f) - (f6 + f2) / 2.0F, 2D) + Math.pow((f9 + f7 * f) - (f4 + f3) / 2.0F, 2D)));
	//   54   89:fload_2         
	//   55   90:fload           8
	//   56   92:fload           4
	//   57   94:fsub            
	//   58   95:f2d             
	//   59   96:ldc2w           #134 <Double 2D>
	//   60   99:invokestatic    #139 <Method double Math.pow(double, double)>
	//   61  102:fload           6
	//   62  104:fload           5
	//   63  106:fsub            
	//   64  107:f2d             
	//   65  108:ldc2w           #134 <Double 2D>
	//   66  111:invokestatic    #139 <Method double Math.pow(double, double)>
	//   67  114:dadd            
	//   68  115:invokestatic    #142 <Method double Math.sqrt(double)>
	//   69  118:ldc2w           #134 <Double 2D>
	//   70  121:ddiv            
	//   71  122:ldc2w           #143 <Double 180D>
	//   72  125:fload_3         
	//   73  126:f2d             
	//   74  127:dsub            
	//   75  128:ldc2w           #134 <Double 2D>
	//   76  131:ddiv            
	//   77  132:ldc2w           #145 <Double 0.017453292519943295D>
	//   78  135:dmul            
	//   79  136:invokestatic    #149 <Method double Math.tan(double)>
	//   80  139:dmul            
	//   81  140:d2f             
	//   82  141:fsub            
	//   83  142:f2d             
	//   84  143:fload           7
	//   85  145:fload           10
	//   86  147:fload_2         
	//   87  148:fmul            
	//   88  149:fadd            
	//   89  150:fload           8
	//   90  152:fload           4
	//   91  154:fadd            
	//   92  155:fconst_2        
	//   93  156:fdiv            
	//   94  157:fsub            
	//   95  158:f2d             
	//   96  159:ldc2w           #134 <Double 2D>
	//   97  162:invokestatic    #139 <Method double Math.pow(double, double)>
	//   98  165:fload           11
	//   99  167:fload           9
	//  100  169:fload_2         
	//  101  170:fmul            
	//  102  171:fadd            
	//  103  172:fload           6
	//  104  174:fload           5
	//  105  176:fadd            
	//  106  177:fconst_2        
	//  107  178:fdiv            
	//  108  179:fsub            
	//  109  180:f2d             
	//  110  181:ldc2w           #134 <Double 2D>
	//  111  184:invokestatic    #139 <Method double Math.pow(double, double)>
	//  112  187:dadd            
	//  113  188:invokestatic    #142 <Method double Math.sqrt(double)>
	//  114  191:dsub            
	//  115  192:d2f             
	//  116  193:freturn         
	}

	protected void drawCenterText(Canvas canvas)
	{
		CharSequence charsequence = mChart.getCenterText();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PieChart mChart>
	//    2    4:invokevirtual   #157 <Method CharSequence PieChart.getCenterText()>
	//    3    7:astore          4
		if(mChart.isDrawCenterTextEnabled() && charsequence != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #53  <Field PieChart mChart>
	//*   6   13:invokevirtual   #161 <Method boolean PieChart.isDrawCenterTextEnabled()>
	//*   7   16:ifeq            361
	//*   8   19:aload           4
	//*   9   21:ifnull          361
		{
			Object obj = ((Object) (mChart.getCenterCircleBox()));
	//   10   24:aload_0         
	//   11   25:getfield        #53  <Field PieChart mChart>
	//   12   28:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//   13   31:astore          5
			float f;
			RectF rectf;
			if(mChart.isDrawHoleEnabled() && !mChart.isDrawSlicesUnderHoleEnabled())
	//*  14   33:aload_0         
	//*  15   34:getfield        #53  <Field PieChart mChart>
	//*  16   37:invokevirtual   #168 <Method boolean PieChart.isDrawHoleEnabled()>
	//*  17   40:ifeq            362
	//*  18   43:aload_0         
	//*  19   44:getfield        #53  <Field PieChart mChart>
	//*  20   47:invokevirtual   #171 <Method boolean PieChart.isDrawSlicesUnderHoleEnabled()>
	//*  21   50:ifne            362
				f = mChart.getRadius() * (mChart.getHoleRadius() / 100F);
	//   22   53:aload_0         
	//   23   54:getfield        #53  <Field PieChart mChart>
	//   24   57:invokevirtual   #175 <Method float PieChart.getRadius()>
	//   25   60:aload_0         
	//   26   61:getfield        #53  <Field PieChart mChart>
	//   27   64:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   28   67:ldc1            #179 <Float 100F>
	//   29   69:fdiv            
	//   30   70:fmul            
	//   31   71:fstore_2        
			else
	//*  32   72:aload_0         
	//*  33   73:getfield        #42  <Field RectF[] mRectBuffer>
	//*  34   76:iconst_0        
	//*  35   77:aaload          
	//*  36   78:astore_3        
	//*  37   79:aload_3         
	//*  38   80:aload           5
	//*  39   82:getfield        #120 <Field float PointF.x>
	//*  40   85:fload_2         
	//*  41   86:fsub            
	//*  42   87:putfield        #182 <Field float RectF.left>
	//*  43   90:aload_3         
	//*  44   91:aload           5
	//*  45   93:getfield        #130 <Field float PointF.y>
	//*  46   96:fload_2         
	//*  47   97:fsub            
	//*  48   98:putfield        #185 <Field float RectF.top>
	//*  49  101:aload_3         
	//*  50  102:aload           5
	//*  51  104:getfield        #120 <Field float PointF.x>
	//*  52  107:fload_2         
	//*  53  108:fadd            
	//*  54  109:putfield        #188 <Field float RectF.right>
	//*  55  112:aload_3         
	//*  56  113:aload           5
	//*  57  115:getfield        #130 <Field float PointF.y>
	//*  58  118:fload_2         
	//*  59  119:fadd            
	//*  60  120:putfield        #191 <Field float RectF.bottom>
	//*  61  123:aload_0         
	//*  62  124:getfield        #42  <Field RectF[] mRectBuffer>
	//*  63  127:iconst_1        
	//*  64  128:aaload          
	//*  65  129:astore          5
	//*  66  131:aload           5
	//*  67  133:aload_3         
	//*  68  134:invokevirtual   #195 <Method void RectF.set(RectF)>
	//*  69  137:aload_0         
	//*  70  138:getfield        #53  <Field PieChart mChart>
	//*  71  141:invokevirtual   #198 <Method float PieChart.getCenterTextRadiusPercent()>
	//*  72  144:ldc1            #179 <Float 100F>
	//*  73  146:fdiv            
	//*  74  147:fstore_2        
	//*  75  148:fload_2         
	//*  76  149:f2d             
	//*  77  150:dconst_0        
	//*  78  151:dcmpl           
	//*  79  152:ifle            190
	//*  80  155:aload           5
	//*  81  157:aload           5
	//*  82  159:invokevirtual   #201 <Method float RectF.width()>
	//*  83  162:aload           5
	//*  84  164:invokevirtual   #201 <Method float RectF.width()>
	//*  85  167:fload_2         
	//*  86  168:fmul            
	//*  87  169:fsub            
	//*  88  170:fconst_2        
	//*  89  171:fdiv            
	//*  90  172:aload           5
	//*  91  174:invokevirtual   #204 <Method float RectF.height()>
	//*  92  177:aload           5
	//*  93  179:invokevirtual   #204 <Method float RectF.height()>
	//*  94  182:fload_2         
	//*  95  183:fmul            
	//*  96  184:fsub            
	//*  97  185:fconst_2        
	//*  98  186:fdiv            
	//*  99  187:invokevirtual   #208 <Method void RectF.inset(float, float)>
	//* 100  190:aload           4
	//* 101  192:aload_0         
	//* 102  193:getfield        #210 <Field CharSequence mCenterTextLastValue>
	//* 103  196:invokevirtual   #216 <Method boolean Object.equals(Object)>
	//* 104  199:ifeq            214
	//* 105  202:aload           5
	//* 106  204:aload_0         
	//* 107  205:getfield        #40  <Field RectF mCenterTextLastBounds>
	//* 108  208:invokevirtual   #217 <Method boolean RectF.equals(Object)>
	//* 109  211:ifne            278
	//* 110  214:aload_0         
	//* 111  215:getfield        #40  <Field RectF mCenterTextLastBounds>
	//* 112  218:aload           5
	//* 113  220:invokevirtual   #195 <Method void RectF.set(RectF)>
	//* 114  223:aload_0         
	//* 115  224:aload           4
	//* 116  226:putfield        #210 <Field CharSequence mCenterTextLastValue>
	//* 117  229:aload_0         
	//* 118  230:getfield        #40  <Field RectF mCenterTextLastBounds>
	//* 119  233:invokevirtual   #201 <Method float RectF.width()>
	//* 120  236:fstore_2        
	//* 121  237:aload_0         
	//* 122  238:new             #219 <Class StaticLayout>
	//* 123  241:dup             
	//* 124  242:aload           4
	//* 125  244:iconst_0        
	//* 126  245:aload           4
	//* 127  247:invokeinterface #225 <Method int CharSequence.length()>
	//* 128  252:aload_0         
	//* 129  253:getfield        #83  <Field TextPaint mCenterTextPaint>
	//* 130  256:fload_2         
	//* 131  257:f2d             
	//* 132  258:invokestatic    #228 <Method double Math.ceil(double)>
	//* 133  261:dconst_1        
	//* 134  262:invokestatic    #231 <Method double Math.max(double, double)>
	//* 135  265:d2i             
	//* 136  266:getstatic       #237 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//* 137  269:fconst_1        
	//* 138  270:fconst_0        
	//* 139  271:iconst_0        
	//* 140  272:invokespecial   #240 <Method void StaticLayout(CharSequence, int, int, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//* 141  275:putfield        #242 <Field StaticLayout mCenterTextLayout>
	//* 142  278:aload_0         
	//* 143  279:getfield        #242 <Field StaticLayout mCenterTextLayout>
	//* 144  282:invokevirtual   #245 <Method int StaticLayout.getHeight()>
	//* 145  285:i2f             
	//* 146  286:fstore_2        
	//* 147  287:aload_1         
	//* 148  288:invokevirtual   #250 <Method int Canvas.save()>
	//* 149  291:pop             
	//* 150  292:getstatic       #256 <Field int android.os.Build$VERSION.SDK_INT>
	//* 151  295:bipush          18
	//* 152  297:icmplt          325
	//* 153  300:new             #44  <Class Path>
	//* 154  303:dup             
	//* 155  304:invokespecial   #45  <Method void Path()>
	//* 156  307:astore          4
	//* 157  309:aload           4
	//* 158  311:aload_3         
	//* 159  312:getstatic       #262 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//* 160  315:invokevirtual   #266 <Method void Path.addOval(RectF, android.graphics.Path$Direction)>
	//* 161  318:aload_1         
	//* 162  319:aload           4
	//* 163  321:invokevirtual   #270 <Method boolean Canvas.clipPath(Path)>
	//* 164  324:pop             
	//* 165  325:aload_1         
	//* 166  326:aload           5
	//* 167  328:getfield        #182 <Field float RectF.left>
	//* 168  331:aload           5
	//* 169  333:getfield        #185 <Field float RectF.top>
	//* 170  336:aload           5
	//* 171  338:invokevirtual   #204 <Method float RectF.height()>
	//* 172  341:fload_2         
	//* 173  342:fsub            
	//* 174  343:fconst_2        
	//* 175  344:fdiv            
	//* 176  345:fadd            
	//* 177  346:invokevirtual   #273 <Method void Canvas.translate(float, float)>
	//* 178  349:aload_0         
	//* 179  350:getfield        #242 <Field StaticLayout mCenterTextLayout>
	//* 180  353:aload_1         
	//* 181  354:invokevirtual   #276 <Method void StaticLayout.draw(Canvas)>
	//* 182  357:aload_1         
	//* 183  358:invokevirtual   #279 <Method void Canvas.restore()>
	//* 184  361:return          
				f = mChart.getRadius();
	//  185  362:aload_0         
	//  186  363:getfield        #53  <Field PieChart mChart>
	//  187  366:invokevirtual   #175 <Method float PieChart.getRadius()>
	//  188  369:fstore_2        
			rectf = mRectBuffer[0];
			rectf.left = ((PointF) (obj)).x - f;
			rectf.top = ((PointF) (obj)).y - f;
			rectf.right = ((PointF) (obj)).x + f;
			rectf.bottom = ((PointF) (obj)).y + f;
			obj = ((Object) (mRectBuffer[1]));
			((RectF) (obj)).set(rectf);
			f = mChart.getCenterTextRadiusPercent() / 100F;
			if((double)f > 0.0D)
				((RectF) (obj)).inset((((RectF) (obj)).width() - ((RectF) (obj)).width() * f) / 2.0F, (((RectF) (obj)).height() - ((RectF) (obj)).height() * f) / 2.0F);
			if(!((Object) (charsequence)).equals(((Object) (mCenterTextLastValue))) || !((RectF) (obj)).equals(((Object) (mCenterTextLastBounds))))
			{
				mCenterTextLastBounds.set(((RectF) (obj)));
				mCenterTextLastValue = charsequence;
				f = mCenterTextLastBounds.width();
				mCenterTextLayout = new StaticLayout(charsequence, 0, charsequence.length(), mCenterTextPaint, (int)Math.max(Math.ceil(f), 1.0D), android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
			}
			f = mCenterTextLayout.getHeight();
			canvas.save();
			if(android.os.Build.VERSION.SDK_INT >= 18)
			{
				Path path = new Path();
				path.addOval(rectf, android.graphics.Path.Direction.CW);
				canvas.clipPath(path);
			}
			canvas.translate(((RectF) (obj)).left, ((RectF) (obj)).top + (((RectF) (obj)).height() - f) / 2.0F);
			mCenterTextLayout.draw(canvas);
			canvas.restore();
		}
	//* 189  370:goto            72
	}

	public void drawData(Canvas canvas)
	{
label0:
		{
			int i = (int)mViewPortHandler.getChartWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #289 <Method float ViewPortHandler.getChartWidth()>
	//    3    7:f2i             
	//    4    8:istore_2        
			int j = (int)mViewPortHandler.getChartHeight();
	//    5    9:aload_0         
	//    6   10:getfield        #284 <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #292 <Method float ViewPortHandler.getChartHeight()>
	//    8   16:f2i             
	//    9   17:istore_3        
			if(mDrawBitmap == null || ((Bitmap)mDrawBitmap.get()).getWidth() != i || ((Bitmap)mDrawBitmap.get()).getHeight() != j)
	//*  10   18:aload_0         
	//*  11   19:getfield        #294 <Field WeakReference mDrawBitmap>
	//*  12   22:ifnull          59
	//*  13   25:aload_0         
	//*  14   26:getfield        #294 <Field WeakReference mDrawBitmap>
	//*  15   29:invokevirtual   #300 <Method Object WeakReference.get()>
	//*  16   32:checkcast       #302 <Class Bitmap>
	//*  17   35:invokevirtual   #305 <Method int Bitmap.getWidth()>
	//*  18   38:iload_2         
	//*  19   39:icmpne          59
	//*  20   42:aload_0         
	//*  21   43:getfield        #294 <Field WeakReference mDrawBitmap>
	//*  22   46:invokevirtual   #300 <Method Object WeakReference.get()>
	//*  23   49:checkcast       #302 <Class Bitmap>
	//*  24   52:invokevirtual   #306 <Method int Bitmap.getHeight()>
	//*  25   55:iload_3         
	//*  26   56:icmpeq          107
			{
				if(i <= 0 || j <= 0)
					break label0;
	//   27   59:iload_2         
	//   28   60:ifle            193
	//   29   63:iload_3         
	//   30   64:ifle            193
				mDrawBitmap = new WeakReference(((Object) (Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_4444))));
	//   31   67:aload_0         
	//   32   68:new             #296 <Class WeakReference>
	//   33   71:dup             
	//   34   72:iload_2         
	//   35   73:iload_3         
	//   36   74:getstatic       #312 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//   37   77:invokestatic    #316 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   38   80:invokespecial   #319 <Method void WeakReference(Object)>
	//   39   83:putfield        #294 <Field WeakReference mDrawBitmap>
				mBitmapCanvas = new Canvas((Bitmap)mDrawBitmap.get());
	//   40   86:aload_0         
	//   41   87:new             #247 <Class Canvas>
	//   42   90:dup             
	//   43   91:aload_0         
	//   44   92:getfield        #294 <Field WeakReference mDrawBitmap>
	//   45   95:invokevirtual   #300 <Method Object WeakReference.get()>
	//   46   98:checkcast       #302 <Class Bitmap>
	//   47  101:invokespecial   #322 <Method void Canvas(Bitmap)>
	//   48  104:putfield        #324 <Field Canvas mBitmapCanvas>
			}
			((Bitmap)mDrawBitmap.get()).eraseColor(0);
	//   49  107:aload_0         
	//   50  108:getfield        #294 <Field WeakReference mDrawBitmap>
	//   51  111:invokevirtual   #300 <Method Object WeakReference.get()>
	//   52  114:checkcast       #302 <Class Bitmap>
	//   53  117:iconst_0        
	//   54  118:invokevirtual   #327 <Method void Bitmap.eraseColor(int)>
			Iterator iterator = ((PieData)mChart.getData()).getDataSets().iterator();
	//   55  121:aload_0         
	//   56  122:getfield        #53  <Field PieChart mChart>
	//   57  125:invokevirtual   #331 <Method com.github.mikephil.charting.data.ChartData PieChart.getData()>
	//   58  128:checkcast       #333 <Class PieData>
	//   59  131:invokevirtual   #337 <Method List PieData.getDataSets()>
	//   60  134:invokeinterface #343 <Method Iterator List.iterator()>
	//   61  139:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   62  141:aload           4
	//   63  143:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//   64  148:ifeq            193
				IPieDataSet ipiedataset = (IPieDataSet)iterator.next();
	//   65  151:aload           4
	//   66  153:invokeinterface #351 <Method Object Iterator.next()>
	//   67  158:checkcast       #353 <Class IPieDataSet>
	//   68  161:astore          5
				if(ipiedataset.isVisible() && ipiedataset.getEntryCount() > 0)
	//*  69  163:aload           5
	//*  70  165:invokeinterface #356 <Method boolean IPieDataSet.isVisible()>
	//*  71  170:ifeq            141
	//*  72  173:aload           5
	//*  73  175:invokeinterface #359 <Method int IPieDataSet.getEntryCount()>
	//*  74  180:ifle            141
					drawDataSet(canvas, ipiedataset);
	//   75  183:aload_0         
	//   76  184:aload_1         
	//   77  185:aload           5
	//   78  187:invokevirtual   #363 <Method void drawDataSet(Canvas, IPieDataSet)>
			} while(true);
	//   79  190:goto            141
		}
	//   80  193:return          
	}

	protected void drawDataSet(Canvas canvas, IPieDataSet ipiedataset)
	{
		float f;
		float f1;
		float f8;
		float f9;
		float f10;
		float f11;
		float f12;
		int i;
		int k;
		int i1;
		float af[];
		PointF pointf;
		f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		f8 = mChart.getRotationAngle();
	//    2    3:aload_0         
	//    3    4:getfield        #53  <Field PieChart mChart>
	//    4    7:invokevirtual   #366 <Method float PieChart.getRotationAngle()>
	//    5   10:fstore          10
		f9 = mAnimator.getPhaseX();
	//    6   12:aload_0         
	//    7   13:getfield        #370 <Field ChartAnimator mAnimator>
	//    8   16:invokevirtual   #375 <Method float ChartAnimator.getPhaseX()>
	//    9   19:fstore          11
		f10 = mAnimator.getPhaseY();
	//   10   21:aload_0         
	//   11   22:getfield        #370 <Field ChartAnimator mAnimator>
	//   12   25:invokevirtual   #378 <Method float ChartAnimator.getPhaseY()>
	//   13   28:fstore          12
		canvas = ((Canvas) (mChart.getCircleBox()));
	//   14   30:aload_0         
	//   15   31:getfield        #53  <Field PieChart mChart>
	//   16   34:invokevirtual   #382 <Method RectF PieChart.getCircleBox()>
	//   17   37:astore_1        
		i1 = ipiedataset.getEntryCount();
	//   18   38:aload_2         
	//   19   39:invokeinterface #359 <Method int IPieDataSet.getEntryCount()>
	//   20   44:istore          20
		af = mChart.getDrawAngles();
	//   21   46:aload_0         
	//   22   47:getfield        #53  <Field PieChart mChart>
	//   23   50:invokevirtual   #386 <Method float[] PieChart.getDrawAngles()>
	//   24   53:astore          21
		f11 = ipiedataset.getSliceSpace();
	//   25   55:aload_2         
	//   26   56:invokeinterface #389 <Method float IPieDataSet.getSliceSpace()>
	//   27   61:fstore          13
		pointf = mChart.getCenterCircleBox();
	//   28   63:aload_0         
	//   29   64:getfield        #53  <Field PieChart mChart>
	//   30   67:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//   31   70:astore          22
		f12 = mChart.getRadius();
	//   32   72:aload_0         
	//   33   73:getfield        #53  <Field PieChart mChart>
	//   34   76:invokevirtual   #175 <Method float PieChart.getRadius()>
	//   35   79:fstore          14
		if(mChart.isDrawHoleEnabled() && !mChart.isDrawSlicesUnderHoleEnabled())
	//*  36   81:aload_0         
	//*  37   82:getfield        #53  <Field PieChart mChart>
	//*  38   85:invokevirtual   #168 <Method boolean PieChart.isDrawHoleEnabled()>
	//*  39   88:ifeq            173
	//*  40   91:aload_0         
	//*  41   92:getfield        #53  <Field PieChart mChart>
	//*  42   95:invokevirtual   #171 <Method boolean PieChart.isDrawSlicesUnderHoleEnabled()>
	//*  43   98:ifne            173
			f = f12 * (mChart.getHoleRadius() / 100F);
	//   44  101:fload           14
	//   45  103:aload_0         
	//   46  104:getfield        #53  <Field PieChart mChart>
	//   47  107:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   48  110:ldc1            #179 <Float 100F>
	//   49  112:fdiv            
	//   50  113:fmul            
	//   51  114:fstore_3        
		else
	//*  52  115:iconst_0        
	//*  53  116:istore          17
	//*  54  118:iconst_0        
	//*  55  119:istore          18
	//*  56  121:iload           18
	//*  57  123:iload           20
	//*  58  125:icmpge          178
	//*  59  128:iload           17
	//*  60  130:istore          19
	//*  61  132:aload_2         
	//*  62  133:iload           18
	//*  63  135:invokeinterface #393 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//*  64  140:invokevirtual   #398 <Method float Entry.getVal()>
	//*  65  143:invokestatic    #401 <Method float Math.abs(float)>
	//*  66  146:f2d             
	//*  67  147:ldc2w           #402 <Double 9.9999999999999995E-07D>
	//*  68  150:dcmpl           
	//*  69  151:ifle            160
	//*  70  154:iload           17
	//*  71  156:iconst_1        
	//*  72  157:iadd            
	//*  73  158:istore          19
	//*  74  160:iload           18
	//*  75  162:iconst_1        
	//*  76  163:iadd            
	//*  77  164:istore          18
	//*  78  166:iload           19
	//*  79  168:istore          17
	//*  80  170:goto            121
			f = 0.0F;
	//   81  173:fconst_0        
	//   82  174:fstore_3        
		i = 0;
		for(int j = 0; j < i1;)
		{
			int l = i;
			if((double)Math.abs(ipiedataset.getEntryForIndex(j).getVal()) > 9.9999999999999995E-07D)
				l = i + 1;
			j++;
			i = l;
		}

	//*  83  175:goto            115
		k = 0;
	//   84  178:iconst_0        
	//   85  179:istore          18
_L9:
		if(k >= i1) goto _L2; else goto _L1
	//   86  181:iload           18
	//   87  183:iload           20
	//   88  185:icmpge          766
_L1:
		float f3;
		float f13;
		Entry entry;
		f13 = af[k];
	//   89  188:aload           21
	//   90  190:iload           18
	//   91  192:faload          
	//   92  193:fstore          15
		f3 = f;
	//   93  195:fload_3         
	//   94  196:fstore          6
		entry = ipiedataset.getEntryForIndex(k);
	//   95  198:aload_2         
	//   96  199:iload           18
	//   97  201:invokeinterface #393 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//   98  206:astore          23
		if((double)Math.abs(entry.getVal()) <= 9.9999999999999995E-07D || mChart.needsHighlight(entry.getXIndex(), ((PieData)mChart.getData()).getIndexOfDataSet(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ipiedataset))))) goto _L4; else goto _L3
	//   99  208:aload           23
	//  100  210:invokevirtual   #398 <Method float Entry.getVal()>
	//  101  213:invokestatic    #401 <Method float Math.abs(float)>
	//  102  216:f2d             
	//  103  217:ldc2w           #402 <Double 9.9999999999999995E-07D>
	//  104  220:dcmpl           
	//  105  221:ifle            558
	//  106  224:aload_0         
	//  107  225:getfield        #53  <Field PieChart mChart>
	//  108  228:aload           23
	//  109  230:invokevirtual   #406 <Method int Entry.getXIndex()>
	//  110  233:aload_0         
	//  111  234:getfield        #53  <Field PieChart mChart>
	//  112  237:invokevirtual   #331 <Method com.github.mikephil.charting.data.ChartData PieChart.getData()>
	//  113  240:checkcast       #333 <Class PieData>
	//  114  243:aload_2         
	//  115  244:invokevirtual   #410 <Method int PieData.getIndexOfDataSet(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
	//  116  247:invokevirtual   #414 <Method boolean PieChart.needsHighlight(int, int)>
	//  117  250:ifne            558
_L3:
		float f2;
		float f5;
		float f6;
		mRenderPaint.setColor(ipiedataset.getColor(k));
	//  118  253:aload_0         
	//  119  254:getfield        #417 <Field Paint mRenderPaint>
	//  120  257:aload_2         
	//  121  258:iload           18
	//  122  260:invokeinterface #421 <Method int IPieDataSet.getColor(int)>
	//  123  265:invokevirtual   #63  <Method void Paint.setColor(int)>
		float f7;
		float f14;
		if(i == 1)
	//* 124  268:iload           17
	//* 125  270:iconst_1        
	//* 126  271:icmpne          577
			f2 = 0.0F;
	//  127  274:fconst_0        
	//  128  275:fstore          5
		else
	//* 129  277:fload           10
	//* 130  279:fload           5
	//* 131  281:fconst_2        
	//* 132  282:fdiv            
	//* 133  283:fload           4
	//* 134  285:fadd            
	//* 135  286:fload           12
	//* 136  288:fmul            
	//* 137  289:fadd            
	//* 138  290:fstore          16
	//* 139  292:fload           15
	//* 140  294:fload           5
	//* 141  296:fsub            
	//* 142  297:fload           12
	//* 143  299:fmul            
	//* 144  300:fstore          7
	//* 145  302:fload           7
	//* 146  304:fstore          5
	//* 147  306:fload           7
	//* 148  308:fconst_0        
	//* 149  309:fcmpg           
	//* 150  310:ifge            316
	//* 151  313:fconst_0        
	//* 152  314:fstore          5
	//* 153  316:aload_0         
	//* 154  317:getfield        #47  <Field Path mPathBuffer>
	//* 155  320:invokevirtual   #424 <Method void Path.reset()>
	//* 156  323:fconst_0        
	//* 157  324:fstore          8
	//* 158  326:fconst_0        
	//* 159  327:fstore          9
	//* 160  329:fload           5
	//* 161  331:ldc2            #425 <Float 360F>
	//* 162  334:frem            
	//* 163  335:fconst_0        
	//* 164  336:fcmpl           
	//* 165  337:ifne            590
	//* 166  340:aload_0         
	//* 167  341:getfield        #47  <Field Path mPathBuffer>
	//* 168  344:aload           22
	//* 169  346:getfield        #120 <Field float PointF.x>
	//* 170  349:aload           22
	//* 171  351:getfield        #130 <Field float PointF.y>
	//* 172  354:fload           14
	//* 173  356:getstatic       #262 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//* 174  359:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
	//* 175  362:fload           6
	//* 176  364:fstore          7
	//* 177  366:fload           13
	//* 178  368:fconst_0        
	//* 179  369:fcmpl           
	//* 180  370:ifle            401
	//* 181  373:fload           6
	//* 182  375:aload_0         
	//* 183  376:aload           22
	//* 184  378:fload           14
	//* 185  380:fload           15
	//* 186  382:fload           12
	//* 187  384:fmul            
	//* 188  385:fload           8
	//* 189  387:fload           9
	//* 190  389:fload           16
	//* 191  391:fload           5
	//* 192  393:invokevirtual   #431 <Method float calculateMinimumRadiusForSpacedSlice(PointF, float, float, float, float, float, float)>
	//* 193  396:invokestatic    #434 <Method float Math.max(float, float)>
	//* 194  399:fstore          7
	//* 195  401:aload_0         
	//* 196  402:getfield        #49  <Field RectF mInnerRectBuffer>
	//* 197  405:aload           22
	//* 198  407:getfield        #120 <Field float PointF.x>
	//* 199  410:fload           7
	//* 200  412:fsub            
	//* 201  413:aload           22
	//* 202  415:getfield        #130 <Field float PointF.y>
	//* 203  418:fload           7
	//* 204  420:fsub            
	//* 205  421:aload           22
	//* 206  423:getfield        #120 <Field float PointF.x>
	//* 207  426:fload           7
	//* 208  428:fadd            
	//* 209  429:aload           22
	//* 210  431:getfield        #130 <Field float PointF.y>
	//* 211  434:fload           7
	//* 212  436:fadd            
	//* 213  437:invokevirtual   #437 <Method void RectF.set(float, float, float, float)>
	//* 214  440:fload           7
	//* 215  442:f2d             
	//* 216  443:dconst_0        
	//* 217  444:dcmpl           
	//* 218  445:ifle            735
	//* 219  448:iload           17
	//* 220  450:iconst_1        
	//* 221  451:icmpne          658
	//* 222  454:fconst_0        
	//* 223  455:fstore          6
	//* 224  457:fload           6
	//* 225  459:fconst_2        
	//* 226  460:fdiv            
	//* 227  461:fstore          9
	//* 228  463:fload           15
	//* 229  465:fload           6
	//* 230  467:fsub            
	//* 231  468:fload           12
	//* 232  470:fmul            
	//* 233  471:fstore          8
	//* 234  473:fload           8
	//* 235  475:fstore          6
	//* 236  477:fload           8
	//* 237  479:fconst_0        
	//* 238  480:fcmpg           
	//* 239  481:ifge            487
	//* 240  484:fconst_0        
	//* 241  485:fstore          6
	//* 242  487:fload           10
	//* 243  489:fload           9
	//* 244  491:fload           4
	//* 245  493:fadd            
	//* 246  494:fload           12
	//* 247  496:fmul            
	//* 248  497:fadd            
	//* 249  498:fload           6
	//* 250  500:fadd            
	//* 251  501:fstore          8
	//* 252  503:fload           5
	//* 253  505:ldc2            #425 <Float 360F>
	//* 254  508:frem            
	//* 255  509:fconst_0        
	//* 256  510:fcmpl           
	//* 257  511:ifne            671
	//* 258  514:aload_0         
	//* 259  515:getfield        #47  <Field Path mPathBuffer>
	//* 260  518:aload           22
	//* 261  520:getfield        #120 <Field float PointF.x>
	//* 262  523:aload           22
	//* 263  525:getfield        #130 <Field float PointF.y>
	//* 264  528:fload           7
	//* 265  530:getstatic       #440 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CCW>
	//* 266  533:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
	//* 267  536:aload_0         
	//* 268  537:getfield        #47  <Field Path mPathBuffer>
	//* 269  540:invokevirtual   #443 <Method void Path.close()>
	//* 270  543:aload_0         
	//* 271  544:getfield        #324 <Field Canvas mBitmapCanvas>
	//* 272  547:aload_0         
	//* 273  548:getfield        #47  <Field Path mPathBuffer>
	//* 274  551:aload_0         
	//* 275  552:getfield        #417 <Field Paint mRenderPaint>
	//* 276  555:invokevirtual   #447 <Method void Canvas.drawPath(Path, Paint)>
	//* 277  558:fload           4
	//* 278  560:fload           15
	//* 279  562:fload           11
	//* 280  564:fmul            
	//* 281  565:fadd            
	//* 282  566:fstore          4
	//* 283  568:iload           18
	//* 284  570:iconst_1        
	//* 285  571:iadd            
	//* 286  572:istore          18
	//* 287  574:goto            181
			f2 = f11 / (0.01745329F * f12);
	//  288  577:fload           13
	//  289  579:ldc1            #121 <Float 0.01745329F>
	//  290  581:fload           14
	//  291  583:fmul            
	//  292  584:fdiv            
	//  293  585:fstore          5
		f14 = f8 + (f2 / 2.0F + f1) * f10;
		f5 = (f13 - f2) * f10;
		f2 = f5;
		if(f5 < 0.0F)
			f2 = 0.0F;
		mPathBuffer.reset();
		f6 = 0.0F;
		f7 = 0.0F;
		if(f2 % 360F == 0.0F)
		{
			mPathBuffer.addCircle(pointf.x, pointf.y, f12, android.graphics.Path.Direction.CW);
		} else
	//* 294  587:goto            277
		{
			f6 = pointf.x + (float)Math.cos(0.01745329F * f14) * f12;
	//  295  590:aload           22
	//  296  592:getfield        #120 <Field float PointF.x>
	//  297  595:ldc1            #121 <Float 0.01745329F>
	//  298  597:fload           16
	//  299  599:fmul            
	//  300  600:f2d             
	//  301  601:invokestatic    #127 <Method double Math.cos(double)>
	//  302  604:d2f             
	//  303  605:fload           14
	//  304  607:fmul            
	//  305  608:fadd            
	//  306  609:fstore          8
			f7 = pointf.y + (float)Math.sin(0.01745329F * f14) * f12;
	//  307  611:aload           22
	//  308  613:getfield        #130 <Field float PointF.y>
	//  309  616:ldc1            #121 <Float 0.01745329F>
	//  310  618:fload           16
	//  311  620:fmul            
	//  312  621:f2d             
	//  313  622:invokestatic    #133 <Method double Math.sin(double)>
	//  314  625:d2f             
	//  315  626:fload           14
	//  316  628:fmul            
	//  317  629:fadd            
	//  318  630:fstore          9
			mPathBuffer.moveTo(f6, f7);
	//  319  632:aload_0         
	//  320  633:getfield        #47  <Field Path mPathBuffer>
	//  321  636:fload           8
	//  322  638:fload           9
	//  323  640:invokevirtual   #450 <Method void Path.moveTo(float, float)>
			mPathBuffer.arcTo(((RectF) (canvas)), f14, f2);
	//  324  643:aload_0         
	//  325  644:getfield        #47  <Field Path mPathBuffer>
	//  326  647:aload_1         
	//  327  648:fload           16
	//  328  650:fload           5
	//  329  652:invokevirtual   #454 <Method void Path.arcTo(RectF, float, float)>
		}
		f5 = f3;
		if(f11 > 0.0F)
			f5 = Math.max(f3, calculateMinimumRadiusForSpacedSlice(pointf, f12, f13 * f10, f6, f7, f14, f2));
		mInnerRectBuffer.set(pointf.x - f5, pointf.y - f5, pointf.x + f5, pointf.y + f5);
		if((double)f5 <= 0.0D) goto _L6; else goto _L5
_L5:
		float f4;
		if(i == 1)
			f4 = 0.0F;
		else
	//* 330  655:goto            362
			f4 = f11 / (0.01745329F * f5);
	//  331  658:fload           13
	//  332  660:ldc1            #121 <Float 0.01745329F>
	//  333  662:fload           7
	//  334  664:fmul            
	//  335  665:fdiv            
	//  336  666:fstore          6
		f7 = f4 / 2.0F;
		f6 = (f13 - f4) * f10;
		f4 = f6;
		if(f6 < 0.0F)
			f4 = 0.0F;
		f6 = f8 + (f7 + f1) * f10 + f4;
		if(f2 % 360F == 0.0F)
		{
			mPathBuffer.addCircle(pointf.x, pointf.y, f5, android.graphics.Path.Direction.CCW);
		} else
	//* 337  668:goto            457
		{
			mPathBuffer.lineTo(pointf.x + (float)Math.cos(0.01745329F * f6) * f5, pointf.y + (float)Math.sin(0.01745329F * f6) * f5);
	//  338  671:aload_0         
	//  339  672:getfield        #47  <Field Path mPathBuffer>
	//  340  675:aload           22
	//  341  677:getfield        #120 <Field float PointF.x>
	//  342  680:ldc1            #121 <Float 0.01745329F>
	//  343  682:fload           8
	//  344  684:fmul            
	//  345  685:f2d             
	//  346  686:invokestatic    #127 <Method double Math.cos(double)>
	//  347  689:d2f             
	//  348  690:fload           7
	//  349  692:fmul            
	//  350  693:fadd            
	//  351  694:aload           22
	//  352  696:getfield        #130 <Field float PointF.y>
	//  353  699:ldc1            #121 <Float 0.01745329F>
	//  354  701:fload           8
	//  355  703:fmul            
	//  356  704:f2d             
	//  357  705:invokestatic    #133 <Method double Math.sin(double)>
	//  358  708:d2f             
	//  359  709:fload           7
	//  360  711:fmul            
	//  361  712:fadd            
	//  362  713:invokevirtual   #457 <Method void Path.lineTo(float, float)>
			mPathBuffer.arcTo(mInnerRectBuffer, f6, -f4);
	//  363  716:aload_0         
	//  364  717:getfield        #47  <Field Path mPathBuffer>
	//  365  720:aload_0         
	//  366  721:getfield        #49  <Field RectF mInnerRectBuffer>
	//  367  724:fload           8
	//  368  726:fload           6
	//  369  728:fneg            
	//  370  729:invokevirtual   #454 <Method void Path.arcTo(RectF, float, float)>
		}
_L7:
		mPathBuffer.close();
		mBitmapCanvas.drawPath(mPathBuffer, mRenderPaint);
_L4:
		f1 += f13 * f9;
		k++;
		continue; /* Loop/switch isn't completed */
	//* 371  732:goto            536
_L6:
		if(f2 % 360F != 0.0F)
	//* 372  735:fload           5
	//* 373  737:ldc2            #425 <Float 360F>
	//* 374  740:frem            
	//* 375  741:fconst_0        
	//* 376  742:fcmpl           
	//* 377  743:ifeq            536
			mPathBuffer.lineTo(pointf.x, pointf.y);
	//  378  746:aload_0         
	//  379  747:getfield        #47  <Field Path mPathBuffer>
	//  380  750:aload           22
	//  381  752:getfield        #120 <Field float PointF.x>
	//  382  755:aload           22
	//  383  757:getfield        #130 <Field float PointF.y>
	//  384  760:invokevirtual   #457 <Method void Path.lineTo(float, float)>
		if(true) goto _L7; else goto _L2
	//  385  763:goto            536
_L2:
		return;
	//  386  766:return          
		if(true) goto _L9; else goto _L8
_L8:
	}

	public void drawExtras(Canvas canvas)
	{
		drawHole(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #461 <Method void drawHole(Canvas)>
		canvas.drawBitmap((Bitmap)mDrawBitmap.get(), 0.0F, 0.0F, ((Paint) (null)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #294 <Field WeakReference mDrawBitmap>
	//    6   10:invokevirtual   #300 <Method Object WeakReference.get()>
	//    7   13:checkcast       #302 <Class Bitmap>
	//    8   16:fconst_0        
	//    9   17:fconst_0        
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #465 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
		drawCenterText(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #467 <Method void drawCenterText(Canvas)>
	//   15   27:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		float f7 = mAnimator.getPhaseX();
	//    0    0:aload_0         
	//    1    1:getfield        #370 <Field ChartAnimator mAnimator>
	//    2    4:invokevirtual   #375 <Method float ChartAnimator.getPhaseX()>
	//    3    7:fstore          9
		float f8 = mAnimator.getPhaseY();
	//    4    9:aload_0         
	//    5   10:getfield        #370 <Field ChartAnimator mAnimator>
	//    6   13:invokevirtual   #378 <Method float ChartAnimator.getPhaseY()>
	//    7   16:fstore          10
		float f9 = mChart.getRotationAngle();
	//    8   18:aload_0         
	//    9   19:getfield        #53  <Field PieChart mChart>
	//   10   22:invokevirtual   #366 <Method float PieChart.getRotationAngle()>
	//   11   25:fstore          11
		canvas = ((Canvas) (mChart.getDrawAngles()));
	//   12   27:aload_0         
	//   13   28:getfield        #53  <Field PieChart mChart>
	//   14   31:invokevirtual   #386 <Method float[] PieChart.getDrawAngles()>
	//   15   34:astore_1        
		float af[] = mChart.getAbsoluteAngles();
	//   16   35:aload_0         
	//   17   36:getfield        #53  <Field PieChart mChart>
	//   18   39:invokevirtual   #472 <Method float[] PieChart.getAbsoluteAngles()>
	//   19   42:astore          23
		PointF pointf = mChart.getCenterCircleBox();
	//   20   44:aload_0         
	//   21   45:getfield        #53  <Field PieChart mChart>
	//   22   48:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//   23   51:astore          24
		float f10 = mChart.getRadius();
	//   24   53:aload_0         
	//   25   54:getfield        #53  <Field PieChart mChart>
	//   26   57:invokevirtual   #175 <Method float PieChart.getRadius()>
	//   27   60:fstore          12
		float f;
		int i;
		RectF rectf;
		if(mChart.isDrawHoleEnabled() && !mChart.isDrawSlicesUnderHoleEnabled())
	//*  28   62:aload_0         
	//*  29   63:getfield        #53  <Field PieChart mChart>
	//*  30   66:invokevirtual   #168 <Method boolean PieChart.isDrawHoleEnabled()>
	//*  31   69:ifeq            140
	//*  32   72:aload_0         
	//*  33   73:getfield        #53  <Field PieChart mChart>
	//*  34   76:invokevirtual   #171 <Method boolean PieChart.isDrawSlicesUnderHoleEnabled()>
	//*  35   79:ifne            140
			f = f10 * (mChart.getHoleRadius() / 100F);
	//   36   82:fload           12
	//   37   84:aload_0         
	//   38   85:getfield        #53  <Field PieChart mChart>
	//   39   88:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   40   91:ldc1            #179 <Float 100F>
	//   41   93:fdiv            
	//   42   94:fmul            
	//   43   95:fstore_3        
		else
	//*  44   96:new             #35  <Class RectF>
	//*  45   99:dup             
	//*  46  100:invokespecial   #38  <Method void RectF()>
	//*  47  103:astore          25
	//*  48  105:iconst_0        
	//*  49  106:istore          17
	//*  50  108:iload           17
	//*  51  110:aload_2         
	//*  52  111:arraylength     
	//*  53  112:icmpge          861
	//*  54  115:aload_2         
	//*  55  116:iload           17
	//*  56  118:aaload          
	//*  57  119:invokevirtual   #475 <Method int Highlight.getXIndex()>
	//*  58  122:istore          21
	//*  59  124:iload           21
	//*  60  126:aload_1         
	//*  61  127:arraylength     
	//*  62  128:icmplt          145
	//*  63  131:iload           17
	//*  64  133:iconst_1        
	//*  65  134:iadd            
	//*  66  135:istore          17
	//*  67  137:goto            108
			f = 0.0F;
	//   68  140:fconst_0        
	//   69  141:fstore_3        
		rectf = new RectF();
		i = 0;
		while(i < ahighlight.length) 
		{
			int i1 = ahighlight[i].getXIndex();
			if(i1 < canvas.length)
	//*  70  142:goto            96
			{
				IPieDataSet ipiedataset = ((PieData)mChart.getData()).getDataSetByIndex(ahighlight[i].getDataSetIndex());
	//   71  145:aload_0         
	//   72  146:getfield        #53  <Field PieChart mChart>
	//   73  149:invokevirtual   #331 <Method com.github.mikephil.charting.data.ChartData PieChart.getData()>
	//   74  152:checkcast       #333 <Class PieData>
	//   75  155:aload_2         
	//   76  156:iload           17
	//   77  158:aaload          
	//   78  159:invokevirtual   #478 <Method int Highlight.getDataSetIndex()>
	//   79  162:invokevirtual   #482 <Method IPieDataSet PieData.getDataSetByIndex(int)>
	//   80  165:astore          26
				if(ipiedataset != null && ipiedataset.isHighlightEnabled())
	//*  81  167:aload           26
	//*  82  169:ifnull          131
	//*  83  172:aload           26
	//*  84  174:invokeinterface #485 <Method boolean IPieDataSet.isHighlightEnabled()>
	//*  85  179:ifeq            131
				{
					int j1 = ipiedataset.getEntryCount();
	//   86  182:aload           26
	//   87  184:invokeinterface #359 <Method int IPieDataSet.getEntryCount()>
	//   88  189:istore          22
					int k = 0;
	//   89  191:iconst_0        
	//   90  192:istore          19
					for(int j = 0; j < j1;)
	//*  91  194:iconst_0        
	//*  92  195:istore          18
	//*  93  197:iload           18
	//*  94  199:iload           22
	//*  95  201:icmpge          250
					{
						int l = k;
	//   96  204:iload           19
	//   97  206:istore          20
						if((double)Math.abs(ipiedataset.getEntryForIndex(j).getVal()) > 9.9999999999999995E-07D)
	//*  98  208:aload           26
	//*  99  210:iload           18
	//* 100  212:invokeinterface #393 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//* 101  217:invokevirtual   #398 <Method float Entry.getVal()>
	//* 102  220:invokestatic    #401 <Method float Math.abs(float)>
	//* 103  223:f2d             
	//* 104  224:ldc2w           #402 <Double 9.9999999999999995E-07D>
	//* 105  227:dcmpl           
	//* 106  228:ifle            237
							l = k + 1;
	//  107  231:iload           19
	//  108  233:iconst_1        
	//  109  234:iadd            
	//  110  235:istore          20
						j++;
	//  111  237:iload           18
	//  112  239:iconst_1        
	//  113  240:iadd            
	//  114  241:istore          18
						k = l;
	//  115  243:iload           20
	//  116  245:istore          19
					}

	//* 117  247:goto            197
					float f1;
					float f2;
					float f3;
					float f5;
					float f6;
					float f11;
					float f12;
					float f13;
					if(i1 == 0)
	//* 118  250:iload           21
	//* 119  252:ifne            664
						f1 = 0.0F;
	//  120  255:fconst_0        
	//  121  256:fstore          4
					else
	//* 122  258:aload           26
	//* 123  260:invokeinterface #389 <Method float IPieDataSet.getSliceSpace()>
	//* 124  265:fstore          13
	//* 125  267:aload_1         
	//* 126  268:iload           21
	//* 127  270:faload          
	//* 128  271:fstore          8
	//* 129  273:iload           19
	//* 130  275:iconst_1        
	//* 131  276:icmpne          679
	//* 132  279:fconst_0        
	//* 133  280:fstore          5
	//* 134  282:fload_3         
	//* 135  283:fstore          6
	//* 136  285:aload           26
	//* 137  287:invokeinterface #488 <Method float IPieDataSet.getSelectionShift()>
	//* 138  292:fstore          7
	//* 139  294:fload           12
	//* 140  296:fload           7
	//* 141  298:fadd            
	//* 142  299:fstore          15
	//* 143  301:aload           25
	//* 144  303:aload_0         
	//* 145  304:getfield        #53  <Field PieChart mChart>
	//* 146  307:invokevirtual   #382 <Method RectF PieChart.getCircleBox()>
	//* 147  310:invokevirtual   #195 <Method void RectF.set(RectF)>
	//* 148  313:aload           25
	//* 149  315:fload           7
	//* 150  317:fneg            
	//* 151  318:fload           7
	//* 152  320:fneg            
	//* 153  321:invokevirtual   #208 <Method void RectF.inset(float, float)>
	//* 154  324:aload_0         
	//* 155  325:getfield        #417 <Field Paint mRenderPaint>
	//* 156  328:aload           26
	//* 157  330:iload           21
	//* 158  332:invokeinterface #421 <Method int IPieDataSet.getColor(int)>
	//* 159  337:invokevirtual   #63  <Method void Paint.setColor(int)>
	//* 160  340:fload           11
	//* 161  342:fload           5
	//* 162  344:fconst_2        
	//* 163  345:fdiv            
	//* 164  346:fload           4
	//* 165  348:fadd            
	//* 166  349:fload           10
	//* 167  351:fmul            
	//* 168  352:fadd            
	//* 169  353:fstore          14
	//* 170  355:fload           8
	//* 171  357:fload           5
	//* 172  359:fsub            
	//* 173  360:fload           10
	//* 174  362:fmul            
	//* 175  363:fstore          7
	//* 176  365:fload           7
	//* 177  367:fstore          5
	//* 178  369:fload           7
	//* 179  371:fconst_0        
	//* 180  372:fcmpg           
	//* 181  373:ifge            379
	//* 182  376:fconst_0        
	//* 183  377:fstore          5
	//* 184  379:aload_0         
	//* 185  380:getfield        #47  <Field Path mPathBuffer>
	//* 186  383:invokevirtual   #424 <Method void Path.reset()>
	//* 187  386:fload           5
	//* 188  388:ldc2            #425 <Float 360F>
	//* 189  391:frem            
	//* 190  392:fconst_0        
	//* 191  393:fcmpl           
	//* 192  394:ifne            692
	//* 193  397:aload_0         
	//* 194  398:getfield        #47  <Field Path mPathBuffer>
	//* 195  401:aload           24
	//* 196  403:getfield        #120 <Field float PointF.x>
	//* 197  406:aload           24
	//* 198  408:getfield        #130 <Field float PointF.y>
	//* 199  411:fload           15
	//* 200  413:getstatic       #262 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//* 201  416:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
	//* 202  419:fload           6
	//* 203  421:fstore          7
	//* 204  423:fload           13
	//* 205  425:fconst_0        
	//* 206  426:fcmpl           
	//* 207  427:ifle            504
	//* 208  430:aload           24
	//* 209  432:getfield        #120 <Field float PointF.x>
	//* 210  435:fstore          7
	//* 211  437:ldc1            #121 <Float 0.01745329F>
	//* 212  439:fload           14
	//* 213  441:fmul            
	//* 214  442:f2d             
	//* 215  443:invokestatic    #127 <Method double Math.cos(double)>
	//* 216  446:d2f             
	//* 217  447:fstore          15
	//* 218  449:aload           24
	//* 219  451:getfield        #130 <Field float PointF.y>
	//* 220  454:fstore          16
	//* 221  456:fload           6
	//* 222  458:aload_0         
	//* 223  459:aload           24
	//* 224  461:fload           12
	//* 225  463:fload           8
	//* 226  465:fload           10
	//* 227  467:fmul            
	//* 228  468:fload           15
	//* 229  470:fload           12
	//* 230  472:fmul            
	//* 231  473:fload           7
	//* 232  475:fadd            
	//* 233  476:ldc1            #121 <Float 0.01745329F>
	//* 234  478:fload           14
	//* 235  480:fmul            
	//* 236  481:f2d             
	//* 237  482:invokestatic    #133 <Method double Math.sin(double)>
	//* 238  485:d2f             
	//* 239  486:fload           12
	//* 240  488:fmul            
	//* 241  489:fload           16
	//* 242  491:fadd            
	//* 243  492:fload           14
	//* 244  494:fload           5
	//* 245  496:invokevirtual   #431 <Method float calculateMinimumRadiusForSpacedSlice(PointF, float, float, float, float, float, float)>
	//* 246  499:invokestatic    #434 <Method float Math.max(float, float)>
	//* 247  502:fstore          7
	//* 248  504:aload_0         
	//* 249  505:getfield        #49  <Field RectF mInnerRectBuffer>
	//* 250  508:aload           24
	//* 251  510:getfield        #120 <Field float PointF.x>
	//* 252  513:fload           7
	//* 253  515:fsub            
	//* 254  516:aload           24
	//* 255  518:getfield        #130 <Field float PointF.y>
	//* 256  521:fload           7
	//* 257  523:fsub            
	//* 258  524:aload           24
	//* 259  526:getfield        #120 <Field float PointF.x>
	//* 260  529:fload           7
	//* 261  531:fadd            
	//* 262  532:aload           24
	//* 263  534:getfield        #130 <Field float PointF.y>
	//* 264  537:fload           7
	//* 265  539:fadd            
	//* 266  540:invokevirtual   #437 <Method void RectF.set(float, float, float, float)>
	//* 267  543:fload           7
	//* 268  545:f2d             
	//* 269  546:dconst_0        
	//* 270  547:dcmpl           
	//* 271  548:ifle            830
	//* 272  551:iload           19
	//* 273  553:iconst_1        
	//* 274  554:icmpne          753
	//* 275  557:fconst_0        
	//* 276  558:fstore          6
	//* 277  560:fload           6
	//* 278  562:fconst_2        
	//* 279  563:fdiv            
	//* 280  564:fstore          13
	//* 281  566:fload           8
	//* 282  568:fload           6
	//* 283  570:fsub            
	//* 284  571:fload           10
	//* 285  573:fmul            
	//* 286  574:fstore          8
	//* 287  576:fload           8
	//* 288  578:fstore          6
	//* 289  580:fload           8
	//* 290  582:fconst_0        
	//* 291  583:fcmpg           
	//* 292  584:ifge            590
	//* 293  587:fconst_0        
	//* 294  588:fstore          6
	//* 295  590:fload           11
	//* 296  592:fload           13
	//* 297  594:fload           4
	//* 298  596:fadd            
	//* 299  597:fload           10
	//* 300  599:fmul            
	//* 301  600:fadd            
	//* 302  601:fload           6
	//* 303  603:fadd            
	//* 304  604:fstore          4
	//* 305  606:fload           5
	//* 306  608:ldc2            #425 <Float 360F>
	//* 307  611:frem            
	//* 308  612:fconst_0        
	//* 309  613:fcmpl           
	//* 310  614:ifne            766
	//* 311  617:aload_0         
	//* 312  618:getfield        #47  <Field Path mPathBuffer>
	//* 313  621:aload           24
	//* 314  623:getfield        #120 <Field float PointF.x>
	//* 315  626:aload           24
	//* 316  628:getfield        #130 <Field float PointF.y>
	//* 317  631:fload           7
	//* 318  633:getstatic       #440 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CCW>
	//* 319  636:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
	//* 320  639:aload_0         
	//* 321  640:getfield        #47  <Field Path mPathBuffer>
	//* 322  643:invokevirtual   #443 <Method void Path.close()>
	//* 323  646:aload_0         
	//* 324  647:getfield        #324 <Field Canvas mBitmapCanvas>
	//* 325  650:aload_0         
	//* 326  651:getfield        #47  <Field Path mPathBuffer>
	//* 327  654:aload_0         
	//* 328  655:getfield        #417 <Field Paint mRenderPaint>
	//* 329  658:invokevirtual   #447 <Method void Canvas.drawPath(Path, Paint)>
	//* 330  661:goto            131
						f1 = af[i1 - 1] * f7;
	//  331  664:aload           23
	//  332  666:iload           21
	//  333  668:iconst_1        
	//  334  669:isub            
	//  335  670:faload          
	//  336  671:fload           9
	//  337  673:fmul            
	//  338  674:fstore          4
					f11 = ipiedataset.getSliceSpace();
					f6 = canvas[i1];
					if(k == 1)
						f2 = 0.0F;
					else
	//* 339  676:goto            258
						f2 = f11 / (0.01745329F * f10);
	//  340  679:fload           13
	//  341  681:ldc1            #121 <Float 0.01745329F>
	//  342  683:fload           12
	//  343  685:fmul            
	//  344  686:fdiv            
	//  345  687:fstore          5
					f3 = f;
					f5 = ipiedataset.getSelectionShift();
					f13 = f10 + f5;
					rectf.set(mChart.getCircleBox());
					rectf.inset(-f5, -f5);
					mRenderPaint.setColor(ipiedataset.getColor(i1));
					f12 = f9 + (f2 / 2.0F + f1) * f8;
					f5 = (f6 - f2) * f8;
					f2 = f5;
					if(f5 < 0.0F)
						f2 = 0.0F;
					mPathBuffer.reset();
					if(f2 % 360F == 0.0F)
					{
						mPathBuffer.addCircle(pointf.x, pointf.y, f13, android.graphics.Path.Direction.CW);
					} else
	//* 346  689:goto            282
					{
						mPathBuffer.moveTo(pointf.x + (float)Math.cos(0.01745329F * f12) * f13, pointf.y + (float)Math.sin(0.01745329F * f12) * f13);
	//  347  692:aload_0         
	//  348  693:getfield        #47  <Field Path mPathBuffer>
	//  349  696:aload           24
	//  350  698:getfield        #120 <Field float PointF.x>
	//  351  701:ldc1            #121 <Float 0.01745329F>
	//  352  703:fload           14
	//  353  705:fmul            
	//  354  706:f2d             
	//  355  707:invokestatic    #127 <Method double Math.cos(double)>
	//  356  710:d2f             
	//  357  711:fload           15
	//  358  713:fmul            
	//  359  714:fadd            
	//  360  715:aload           24
	//  361  717:getfield        #130 <Field float PointF.y>
	//  362  720:ldc1            #121 <Float 0.01745329F>
	//  363  722:fload           14
	//  364  724:fmul            
	//  365  725:f2d             
	//  366  726:invokestatic    #133 <Method double Math.sin(double)>
	//  367  729:d2f             
	//  368  730:fload           15
	//  369  732:fmul            
	//  370  733:fadd            
	//  371  734:invokevirtual   #450 <Method void Path.moveTo(float, float)>
						mPathBuffer.arcTo(rectf, f12, f2);
	//  372  737:aload_0         
	//  373  738:getfield        #47  <Field Path mPathBuffer>
	//  374  741:aload           25
	//  375  743:fload           14
	//  376  745:fload           5
	//  377  747:invokevirtual   #454 <Method void Path.arcTo(RectF, float, float)>
					}
					f5 = f3;
					if(f11 > 0.0F)
					{
						f5 = pointf.x;
						f13 = (float)Math.cos(0.01745329F * f12);
						float f14 = pointf.y;
						f5 = Math.max(f3, calculateMinimumRadiusForSpacedSlice(pointf, f10, f6 * f8, f13 * f10 + f5, (float)Math.sin(0.01745329F * f12) * f10 + f14, f12, f2));
					}
					mInnerRectBuffer.set(pointf.x - f5, pointf.y - f5, pointf.x + f5, pointf.y + f5);
					if((double)f5 > 0.0D)
					{
						float f4;
						if(k == 1)
							f4 = 0.0F;
						else
	//* 378  750:goto            419
							f4 = f11 / (0.01745329F * f5);
	//  379  753:fload           13
	//  380  755:ldc1            #121 <Float 0.01745329F>
	//  381  757:fload           7
	//  382  759:fmul            
	//  383  760:fdiv            
	//  384  761:fstore          6
						f11 = f4 / 2.0F;
						f6 = (f6 - f4) * f8;
						f4 = f6;
						if(f6 < 0.0F)
							f4 = 0.0F;
						f1 = f9 + (f11 + f1) * f8 + f4;
						if(f2 % 360F == 0.0F)
						{
							mPathBuffer.addCircle(pointf.x, pointf.y, f5, android.graphics.Path.Direction.CCW);
						} else
	//* 385  763:goto            560
						{
							mPathBuffer.lineTo(pointf.x + (float)Math.cos(0.01745329F * f1) * f5, pointf.y + (float)Math.sin(0.01745329F * f1) * f5);
	//  386  766:aload_0         
	//  387  767:getfield        #47  <Field Path mPathBuffer>
	//  388  770:aload           24
	//  389  772:getfield        #120 <Field float PointF.x>
	//  390  775:ldc1            #121 <Float 0.01745329F>
	//  391  777:fload           4
	//  392  779:fmul            
	//  393  780:f2d             
	//  394  781:invokestatic    #127 <Method double Math.cos(double)>
	//  395  784:d2f             
	//  396  785:fload           7
	//  397  787:fmul            
	//  398  788:fadd            
	//  399  789:aload           24
	//  400  791:getfield        #130 <Field float PointF.y>
	//  401  794:ldc1            #121 <Float 0.01745329F>
	//  402  796:fload           4
	//  403  798:fmul            
	//  404  799:f2d             
	//  405  800:invokestatic    #133 <Method double Math.sin(double)>
	//  406  803:d2f             
	//  407  804:fload           7
	//  408  806:fmul            
	//  409  807:fadd            
	//  410  808:invokevirtual   #457 <Method void Path.lineTo(float, float)>
							mPathBuffer.arcTo(mInnerRectBuffer, f1, -f4);
	//  411  811:aload_0         
	//  412  812:getfield        #47  <Field Path mPathBuffer>
	//  413  815:aload_0         
	//  414  816:getfield        #49  <Field RectF mInnerRectBuffer>
	//  415  819:fload           4
	//  416  821:fload           6
	//  417  823:fneg            
	//  418  824:invokevirtual   #454 <Method void Path.arcTo(RectF, float, float)>
						}
					} else
	//* 419  827:goto            639
					if(f2 % 360F != 0.0F)
	//* 420  830:fload           5
	//* 421  832:ldc2            #425 <Float 360F>
	//* 422  835:frem            
	//* 423  836:fconst_0        
	//* 424  837:fcmpl           
	//* 425  838:ifeq            639
						mPathBuffer.lineTo(pointf.x, pointf.y);
	//  426  841:aload_0         
	//  427  842:getfield        #47  <Field Path mPathBuffer>
	//  428  845:aload           24
	//  429  847:getfield        #120 <Field float PointF.x>
	//  430  850:aload           24
	//  431  852:getfield        #130 <Field float PointF.y>
	//  432  855:invokevirtual   #457 <Method void Path.lineTo(float, float)>
					mPathBuffer.close();
					mBitmapCanvas.drawPath(mPathBuffer, mRenderPaint);
				}
			}
			i++;
		}
	//* 433  858:goto            639
	//  434  861:return          
	}

	protected void drawHole(Canvas canvas)
	{
		if(mChart.isDrawHoleEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field PieChart mChart>
	//*   2    4:invokevirtual   #168 <Method boolean PieChart.isDrawHoleEnabled()>
	//*   3    7:ifeq            223
		{
			float f = mChart.getRadius();
	//    4   10:aload_0         
	//    5   11:getfield        #53  <Field PieChart mChart>
	//    6   14:invokevirtual   #175 <Method float PieChart.getRadius()>
	//    7   17:fstore_2        
			float f1 = f * (mChart.getHoleRadius() / 100F);
	//    8   18:fload_2         
	//    9   19:aload_0         
	//   10   20:getfield        #53  <Field PieChart mChart>
	//   11   23:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   12   26:ldc1            #179 <Float 100F>
	//   13   28:fdiv            
	//   14   29:fmul            
	//   15   30:fstore_3        
			canvas = ((Canvas) (mChart.getCenterCircleBox()));
	//   16   31:aload_0         
	//   17   32:getfield        #53  <Field PieChart mChart>
	//   18   35:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//   19   38:astore_1        
			if(Color.alpha(mHolePaint.getColor()) > 0)
	//*  20   39:aload_0         
	//*  21   40:getfield        #60  <Field Paint mHolePaint>
	//*  22   43:invokevirtual   #490 <Method int Paint.getColor()>
	//*  23   46:invokestatic    #495 <Method int Color.alpha(int)>
	//*  24   49:ifle            72
				mBitmapCanvas.drawCircle(((PointF) (canvas)).x, ((PointF) (canvas)).y, f1, mHolePaint);
	//   25   52:aload_0         
	//   26   53:getfield        #324 <Field Canvas mBitmapCanvas>
	//   27   56:aload_1         
	//   28   57:getfield        #120 <Field float PointF.x>
	//   29   60:aload_1         
	//   30   61:getfield        #130 <Field float PointF.y>
	//   31   64:fload_3         
	//   32   65:aload_0         
	//   33   66:getfield        #60  <Field Paint mHolePaint>
	//   34   69:invokevirtual   #499 <Method void Canvas.drawCircle(float, float, float, Paint)>
			if(Color.alpha(mTransparentCirclePaint.getColor()) > 0 && mChart.getTransparentCircleRadius() > mChart.getHoleRadius())
	//*  35   72:aload_0         
	//*  36   73:getfield        #75  <Field Paint mTransparentCirclePaint>
	//*  37   76:invokevirtual   #490 <Method int Paint.getColor()>
	//*  38   79:invokestatic    #495 <Method int Color.alpha(int)>
	//*  39   82:ifle            223
	//*  40   85:aload_0         
	//*  41   86:getfield        #53  <Field PieChart mChart>
	//*  42   89:invokevirtual   #502 <Method float PieChart.getTransparentCircleRadius()>
	//*  43   92:aload_0         
	//*  44   93:getfield        #53  <Field PieChart mChart>
	//*  45   96:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//*  46   99:fcmpl           
	//*  47  100:ifle            223
			{
				int i = mTransparentCirclePaint.getAlpha();
	//   48  103:aload_0         
	//   49  104:getfield        #75  <Field Paint mTransparentCirclePaint>
	//   50  107:invokevirtual   #505 <Method int Paint.getAlpha()>
	//   51  110:istore          5
				float f2 = mChart.getTransparentCircleRadius() / 100F;
	//   52  112:aload_0         
	//   53  113:getfield        #53  <Field PieChart mChart>
	//   54  116:invokevirtual   #502 <Method float PieChart.getTransparentCircleRadius()>
	//   55  119:ldc1            #179 <Float 100F>
	//   56  121:fdiv            
	//   57  122:fstore          4
				mTransparentCirclePaint.setAlpha((int)((float)i * mAnimator.getPhaseX() * mAnimator.getPhaseY()));
	//   58  124:aload_0         
	//   59  125:getfield        #75  <Field Paint mTransparentCirclePaint>
	//   60  128:iload           5
	//   61  130:i2f             
	//   62  131:aload_0         
	//   63  132:getfield        #370 <Field ChartAnimator mAnimator>
	//   64  135:invokevirtual   #375 <Method float ChartAnimator.getPhaseX()>
	//   65  138:fmul            
	//   66  139:aload_0         
	//   67  140:getfield        #370 <Field ChartAnimator mAnimator>
	//   68  143:invokevirtual   #378 <Method float ChartAnimator.getPhaseY()>
	//   69  146:fmul            
	//   70  147:f2i             
	//   71  148:invokevirtual   #78  <Method void Paint.setAlpha(int)>
				mHoleCirclePath.reset();
	//   72  151:aload_0         
	//   73  152:getfield        #51  <Field Path mHoleCirclePath>
	//   74  155:invokevirtual   #424 <Method void Path.reset()>
				mHoleCirclePath.addCircle(((PointF) (canvas)).x, ((PointF) (canvas)).y, f * f2, android.graphics.Path.Direction.CW);
	//   75  158:aload_0         
	//   76  159:getfield        #51  <Field Path mHoleCirclePath>
	//   77  162:aload_1         
	//   78  163:getfield        #120 <Field float PointF.x>
	//   79  166:aload_1         
	//   80  167:getfield        #130 <Field float PointF.y>
	//   81  170:fload_2         
	//   82  171:fload           4
	//   83  173:fmul            
	//   84  174:getstatic       #262 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//   85  177:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
				mHoleCirclePath.addCircle(((PointF) (canvas)).x, ((PointF) (canvas)).y, f1, android.graphics.Path.Direction.CCW);
	//   86  180:aload_0         
	//   87  181:getfield        #51  <Field Path mHoleCirclePath>
	//   88  184:aload_1         
	//   89  185:getfield        #120 <Field float PointF.x>
	//   90  188:aload_1         
	//   91  189:getfield        #130 <Field float PointF.y>
	//   92  192:fload_3         
	//   93  193:getstatic       #440 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CCW>
	//   94  196:invokevirtual   #429 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
				mBitmapCanvas.drawPath(mHoleCirclePath, mTransparentCirclePaint);
	//   95  199:aload_0         
	//   96  200:getfield        #324 <Field Canvas mBitmapCanvas>
	//   97  203:aload_0         
	//   98  204:getfield        #51  <Field Path mHoleCirclePath>
	//   99  207:aload_0         
	//  100  208:getfield        #75  <Field Paint mTransparentCirclePaint>
	//  101  211:invokevirtual   #447 <Method void Canvas.drawPath(Path, Paint)>
				mTransparentCirclePaint.setAlpha(i);
	//  102  214:aload_0         
	//  103  215:getfield        #75  <Field Paint mTransparentCirclePaint>
	//  104  218:iload           5
	//  105  220:invokevirtual   #78  <Method void Paint.setAlpha(int)>
			}
		}
	//  106  223:return          
	}

	protected void drawRoundedSlices(Canvas canvas)
	{
		if(mChart.isDrawRoundedSlicesEnabled()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PieChart mChart>
	//    2    4:invokevirtual   #509 <Method boolean PieChart.isDrawRoundedSlicesEnabled()>
	//    3    7:ifne            11
_L1:
		return;
	//    4   10:return          
	//*   5   11:aload_0         
	//*   6   12:getfield        #53  <Field PieChart mChart>
	//*   7   15:invokevirtual   #331 <Method com.github.mikephil.charting.data.ChartData PieChart.getData()>
	//*   8   18:checkcast       #333 <Class PieData>
	//*   9   21:invokevirtual   #513 <Method IPieDataSet PieData.getDataSet()>
	//*  10   24:astore_1        
_L2:
		if(((IPieDataSet) (canvas = ((Canvas) (((PieData)mChart.getData()).getDataSet())))).isVisible())
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #356 <Method boolean IPieDataSet.isVisible()>
	//*  13   31:ifeq            10
		{
			float f1 = mAnimator.getPhaseX();
	//   14   34:aload_0         
	//   15   35:getfield        #370 <Field ChartAnimator mAnimator>
	//   16   38:invokevirtual   #375 <Method float ChartAnimator.getPhaseX()>
	//   17   41:fstore_3        
			float f2 = mAnimator.getPhaseY();
	//   18   42:aload_0         
	//   19   43:getfield        #370 <Field ChartAnimator mAnimator>
	//   20   46:invokevirtual   #378 <Method float ChartAnimator.getPhaseY()>
	//   21   49:fstore          4
			PointF pointf = mChart.getCenterCircleBox();
	//   22   51:aload_0         
	//   23   52:getfield        #53  <Field PieChart mChart>
	//   24   55:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//   25   58:astore          11
			float f3 = mChart.getRadius();
	//   26   60:aload_0         
	//   27   61:getfield        #53  <Field PieChart mChart>
	//   28   64:invokevirtual   #175 <Method float PieChart.getRadius()>
	//   29   67:fstore          5
			float f4 = (f3 - (mChart.getHoleRadius() * f3) / 100F) / 2.0F;
	//   30   69:fload           5
	//   31   71:aload_0         
	//   32   72:getfield        #53  <Field PieChart mChart>
	//   33   75:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   34   78:fload           5
	//   35   80:fmul            
	//   36   81:ldc1            #179 <Float 100F>
	//   37   83:fdiv            
	//   38   84:fsub            
	//   39   85:fconst_2        
	//   40   86:fdiv            
	//   41   87:fstore          6
			float af[] = mChart.getDrawAngles();
	//   42   89:aload_0         
	//   43   90:getfield        #53  <Field PieChart mChart>
	//   44   93:invokevirtual   #386 <Method float[] PieChart.getDrawAngles()>
	//   45   96:astore          12
			float f = mChart.getRotationAngle();
	//   46   98:aload_0         
	//   47   99:getfield        #53  <Field PieChart mChart>
	//   48  102:invokevirtual   #366 <Method float PieChart.getRotationAngle()>
	//   49  105:fstore_2        
			int i = 0;
	//   50  106:iconst_0        
	//   51  107:istore          10
			while(i < ((IPieDataSet) (canvas)).getEntryCount()) 
	//*  52  109:iload           10
	//*  53  111:aload_1         
	//*  54  112:invokeinterface #359 <Method int IPieDataSet.getEntryCount()>
	//*  55  117:icmpge          10
			{
				float f5 = af[i];
	//   56  120:aload           12
	//   57  122:iload           10
	//   58  124:faload          
	//   59  125:fstore          7
				if((double)Math.abs(((IPieDataSet) (canvas)).getEntryForIndex(i).getVal()) > 9.9999999999999995E-07D)
	//*  60  127:aload_1         
	//*  61  128:iload           10
	//*  62  130:invokeinterface #393 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//*  63  135:invokevirtual   #398 <Method float Entry.getVal()>
	//*  64  138:invokestatic    #401 <Method float Math.abs(float)>
	//*  65  141:f2d             
	//*  66  142:ldc2w           #402 <Double 9.9999999999999995E-07D>
	//*  67  145:dcmpl           
	//*  68  146:ifle            243
				{
					float f6 = (float)((double)(f3 - f4) * Math.cos(Math.toRadians((f + f5) * f2)) + (double)pointf.x);
	//   69  149:fload           5
	//   70  151:fload           6
	//   71  153:fsub            
	//   72  154:f2d             
	//   73  155:fload_2         
	//   74  156:fload           7
	//   75  158:fadd            
	//   76  159:fload           4
	//   77  161:fmul            
	//   78  162:f2d             
	//   79  163:invokestatic    #516 <Method double Math.toRadians(double)>
	//   80  166:invokestatic    #127 <Method double Math.cos(double)>
	//   81  169:dmul            
	//   82  170:aload           11
	//   83  172:getfield        #120 <Field float PointF.x>
	//   84  175:f2d             
	//   85  176:dadd            
	//   86  177:d2f             
	//   87  178:fstore          8
					float f7 = (float)((double)(f3 - f4) * Math.sin(Math.toRadians((f + f5) * f2)) + (double)pointf.y);
	//   88  180:fload           5
	//   89  182:fload           6
	//   90  184:fsub            
	//   91  185:f2d             
	//   92  186:fload_2         
	//   93  187:fload           7
	//   94  189:fadd            
	//   95  190:fload           4
	//   96  192:fmul            
	//   97  193:f2d             
	//   98  194:invokestatic    #516 <Method double Math.toRadians(double)>
	//   99  197:invokestatic    #133 <Method double Math.sin(double)>
	//  100  200:dmul            
	//  101  201:aload           11
	//  102  203:getfield        #130 <Field float PointF.y>
	//  103  206:f2d             
	//  104  207:dadd            
	//  105  208:d2f             
	//  106  209:fstore          9
					mRenderPaint.setColor(((IPieDataSet) (canvas)).getColor(i));
	//  107  211:aload_0         
	//  108  212:getfield        #417 <Field Paint mRenderPaint>
	//  109  215:aload_1         
	//  110  216:iload           10
	//  111  218:invokeinterface #421 <Method int IPieDataSet.getColor(int)>
	//  112  223:invokevirtual   #63  <Method void Paint.setColor(int)>
					mBitmapCanvas.drawCircle(f6, f7, f4, mRenderPaint);
	//  113  226:aload_0         
	//  114  227:getfield        #324 <Field Canvas mBitmapCanvas>
	//  115  230:fload           8
	//  116  232:fload           9
	//  117  234:fload           6
	//  118  236:aload_0         
	//  119  237:getfield        #417 <Field Paint mRenderPaint>
	//  120  240:invokevirtual   #499 <Method void Canvas.drawCircle(float, float, float, Paint)>
				}
				f += f5 * f1;
	//  121  243:fload_2         
	//  122  244:fload           7
	//  123  246:fload_3         
	//  124  247:fmul            
	//  125  248:fadd            
	//  126  249:fstore_2        
				i++;
	//  127  250:iload           10
	//  128  252:iconst_1        
	//  129  253:iadd            
	//  130  254:istore          10
			}
		}
		if(true) goto _L1; else goto _L3
	//  131  256:goto            109
_L3:
	}

	public void drawValues(Canvas canvas)
	{
		float f2;
		float f3;
		float f4;
		float f5;
		int i;
		int j;
		boolean flag;
		PointF pointf;
		float af[];
		float af1[];
		PieData piedata;
		List list;
		pointf = mChart.getCenterCircleBox();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PieChart mChart>
	//    2    4:invokevirtual   #165 <Method PointF PieChart.getCenterCircleBox()>
	//    3    7:astore          17
		f4 = mChart.getRadius();
	//    4    9:aload_0         
	//    5   10:getfield        #53  <Field PieChart mChart>
	//    6   13:invokevirtual   #175 <Method float PieChart.getRadius()>
	//    7   16:fstore          5
		f2 = mChart.getRotationAngle();
	//    8   18:aload_0         
	//    9   19:getfield        #53  <Field PieChart mChart>
	//   10   22:invokevirtual   #366 <Method float PieChart.getRotationAngle()>
	//   11   25:fstore_3        
		af = mChart.getDrawAngles();
	//   12   26:aload_0         
	//   13   27:getfield        #53  <Field PieChart mChart>
	//   14   30:invokevirtual   #386 <Method float[] PieChart.getDrawAngles()>
	//   15   33:astore          18
		af1 = mChart.getAbsoluteAngles();
	//   16   35:aload_0         
	//   17   36:getfield        #53  <Field PieChart mChart>
	//   18   39:invokevirtual   #472 <Method float[] PieChart.getAbsoluteAngles()>
	//   19   42:astore          19
		f3 = mAnimator.getPhaseX();
	//   20   44:aload_0         
	//   21   45:getfield        #370 <Field ChartAnimator mAnimator>
	//   22   48:invokevirtual   #375 <Method float ChartAnimator.getPhaseX()>
	//   23   51:fstore          4
		mAnimator.getPhaseY();
	//   24   53:aload_0         
	//   25   54:getfield        #370 <Field ChartAnimator mAnimator>
	//   26   57:invokevirtual   #378 <Method float ChartAnimator.getPhaseY()>
	//   27   60:pop             
		float f = (f4 / 10F) * 3.6F;
	//   28   61:fload           5
	//   29   63:ldc2            #518 <Float 10F>
	//   30   66:fdiv            
	//   31   67:ldc2            #519 <Float 3.6F>
	//   32   70:fmul            
	//   33   71:fstore_2        
		if(mChart.isDrawHoleEnabled())
	//*  34   72:aload_0         
	//*  35   73:getfield        #53  <Field PieChart mChart>
	//*  36   76:invokevirtual   #168 <Method boolean PieChart.isDrawHoleEnabled()>
	//*  37   79:ifeq            101
			f = (f4 - (f4 / 100F) * mChart.getHoleRadius()) / 2.0F;
	//   38   82:fload           5
	//   39   84:fload           5
	//   40   86:ldc1            #179 <Float 100F>
	//   41   88:fdiv            
	//   42   89:aload_0         
	//   43   90:getfield        #53  <Field PieChart mChart>
	//   44   93:invokevirtual   #178 <Method float PieChart.getHoleRadius()>
	//   45   96:fmul            
	//   46   97:fsub            
	//   47   98:fconst_2        
	//   48   99:fdiv            
	//   49  100:fstore_2        
		f4 -= f;
	//   50  101:fload           5
	//   51  103:fload_2         
	//   52  104:fsub            
	//   53  105:fstore          5
		piedata = (PieData)mChart.getData();
	//   54  107:aload_0         
	//   55  108:getfield        #53  <Field PieChart mChart>
	//   56  111:invokevirtual   #331 <Method com.github.mikephil.charting.data.ChartData PieChart.getData()>
	//   57  114:checkcast       #333 <Class PieData>
	//   58  117:astore          20
		list = piedata.getDataSets();
	//   59  119:aload           20
	//   60  121:invokevirtual   #337 <Method List PieData.getDataSets()>
	//   61  124:astore          21
		f5 = piedata.getYValueSum();
	//   62  126:aload           20
	//   63  128:invokevirtual   #522 <Method float PieData.getYValueSum()>
	//   64  131:fstore          6
		flag = mChart.isDrawSliceTextEnabled();
	//   65  133:aload_0         
	//   66  134:getfield        #53  <Field PieChart mChart>
	//   67  137:invokevirtual   #525 <Method boolean PieChart.isDrawSliceTextEnabled()>
	//   68  140:istore          15
		i = 0;
	//   69  142:iconst_0        
	//   70  143:istore          10
		j = 0;
	//   71  145:iconst_0        
	//   72  146:istore          11
_L2:
		int k;
		IPieDataSet ipiedataset;
		if(j >= list.size())
			break MISSING_BLOCK_LABEL_620;
	//   73  148:iload           11
	//   74  150:aload           21
	//   75  152:invokeinterface #528 <Method int List.size()>
	//   76  157:icmpge          620
		ipiedataset = (IPieDataSet)list.get(j);
	//   77  160:aload           21
	//   78  162:iload           11
	//   79  164:invokeinterface #531 <Method Object List.get(int)>
	//   80  169:checkcast       #353 <Class IPieDataSet>
	//   81  172:astore          22
		if(ipiedataset.isDrawValuesEnabled() || flag)
			break; /* Loop/switch isn't completed */
	//   82  174:aload           22
	//   83  176:invokeinterface #534 <Method boolean IPieDataSet.isDrawValuesEnabled()>
	//   84  181:ifne            206
	//   85  184:iload           15
	//   86  186:ifne            206
		k = i;
	//   87  189:iload           10
	//   88  191:istore          12
_L4:
		j++;
	//   89  193:iload           11
	//   90  195:iconst_1        
	//   91  196:iadd            
	//   92  197:istore          11
		i = k;
	//   93  199:iload           12
	//   94  201:istore          10
		if(true) goto _L2; else goto _L1
	//   95  203:goto            148
_L1:
		float f6;
		int l;
		int i1;
		applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ipiedataset)));
	//   96  206:aload_0         
	//   97  207:aload           22
	//   98  209:invokevirtual   #538 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
		f6 = (float)Utils.calcTextHeight(mValuePaint, "Q") + Utils.convertDpToPixel(4F);
	//   99  212:aload_0         
	//  100  213:getfield        #99  <Field Paint mValuePaint>
	//  101  216:ldc2            #540 <String "Q">
	//  102  219:invokestatic    #544 <Method int Utils.calcTextHeight(Paint, String)>
	//  103  222:i2f             
	//  104  223:ldc2            #545 <Float 4F>
	//  105  226:invokestatic    #92  <Method float Utils.convertDpToPixel(float)>
	//  106  229:fadd            
	//  107  230:fstore          7
		k = ipiedataset.getEntryCount();
	//  108  232:aload           22
	//  109  234:invokeinterface #359 <Method int IPieDataSet.getEntryCount()>
	//  110  239:istore          12
		l = 0;
	//  111  241:iconst_0        
	//  112  242:istore          13
		i1 = Math.min((int)Math.ceil((float)k * f3), k);
	//  113  244:iload           12
	//  114  246:i2f             
	//  115  247:fload           4
	//  116  249:fmul            
	//  117  250:f2d             
	//  118  251:invokestatic    #228 <Method double Math.ceil(double)>
	//  119  254:d2i             
	//  120  255:iload           12
	//  121  257:invokestatic    #549 <Method int Math.min(int, int)>
	//  122  260:istore          14
_L5:
		k = i;
	//  123  262:iload           10
	//  124  264:istore          12
		if(l >= i1) goto _L4; else goto _L3
	//  125  266:iload           13
	//  126  268:iload           14
	//  127  270:icmpge          193
_L3:
		Entry entry = ipiedataset.getEntryForIndex(l);
	//  128  273:aload           22
	//  129  275:iload           13
	//  130  277:invokeinterface #393 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//  131  282:astore          23
		float f1;
		float f7;
		float f8;
		boolean flag1;
		com.github.mikephil.charting.formatter.ValueFormatter valueformatter;
		if(i == 0)
	//* 132  284:iload           10
	//* 133  286:ifne            494
			f1 = 0.0F;
	//  134  289:fconst_0        
	//  135  290:fstore_2        
		else
	//* 136  291:fload_2         
	//* 137  292:aload           18
	//* 138  294:iload           10
	//* 139  296:faload          
	//* 140  297:aload           22
	//* 141  299:invokeinterface #389 <Method float IPieDataSet.getSliceSpace()>
	//* 142  304:ldc1            #121 <Float 0.01745329F>
	//* 143  306:fload           5
	//* 144  308:fmul            
	//* 145  309:fdiv            
	//* 146  310:fconst_2        
	//* 147  311:fdiv            
	//* 148  312:fsub            
	//* 149  313:fconst_2        
	//* 150  314:fdiv            
	//* 151  315:fadd            
	//* 152  316:fstore_2        
	//* 153  317:fload           5
	//* 154  319:f2d             
	//* 155  320:fload_3         
	//* 156  321:fload_2         
	//* 157  322:fadd            
	//* 158  323:f2d             
	//* 159  324:invokestatic    #516 <Method double Math.toRadians(double)>
	//* 160  327:invokestatic    #127 <Method double Math.cos(double)>
	//* 161  330:dmul            
	//* 162  331:aload           17
	//* 163  333:getfield        #120 <Field float PointF.x>
	//* 164  336:f2d             
	//* 165  337:dadd            
	//* 166  338:d2f             
	//* 167  339:fstore          8
	//* 168  341:fload           5
	//* 169  343:f2d             
	//* 170  344:fload_3         
	//* 171  345:fload_2         
	//* 172  346:fadd            
	//* 173  347:f2d             
	//* 174  348:invokestatic    #516 <Method double Math.toRadians(double)>
	//* 175  351:invokestatic    #133 <Method double Math.sin(double)>
	//* 176  354:dmul            
	//* 177  355:aload           17
	//* 178  357:getfield        #130 <Field float PointF.y>
	//* 179  360:f2d             
	//* 180  361:dadd            
	//* 181  362:d2f             
	//* 182  363:fstore          9
	//* 183  365:aload_0         
	//* 184  366:getfield        #53  <Field PieChart mChart>
	//* 185  369:invokevirtual   #552 <Method boolean PieChart.isUsePercentValuesEnabled()>
	//* 186  372:ifeq            508
	//* 187  375:aload           23
	//* 188  377:invokevirtual   #398 <Method float Entry.getVal()>
	//* 189  380:fload           6
	//* 190  382:fdiv            
	//* 191  383:ldc1            #179 <Float 100F>
	//* 192  385:fmul            
	//* 193  386:fstore_2        
	//* 194  387:aload           22
	//* 195  389:invokeinterface #556 <Method com.github.mikephil.charting.formatter.ValueFormatter IPieDataSet.getValueFormatter()>
	//* 196  394:astore          24
	//* 197  396:aload           22
	//* 198  398:invokeinterface #534 <Method boolean IPieDataSet.isDrawValuesEnabled()>
	//* 199  403:istore          16
	//* 200  405:iload           15
	//* 201  407:ifeq            517
	//* 202  410:iload           16
	//* 203  412:ifeq            517
	//* 204  415:aload_0         
	//* 205  416:aload_1         
	//* 206  417:aload           24
	//* 207  419:fload_2         
	//* 208  420:aload           23
	//* 209  422:iconst_0        
	//* 210  423:fload           8
	//* 211  425:fload           9
	//* 212  427:aload           22
	//* 213  429:iload           13
	//* 214  431:invokeinterface #559 <Method int IPieDataSet.getValueTextColor(int)>
	//* 215  436:invokevirtual   #563 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, Entry, int, float, float, int)>
	//* 216  439:iload           13
	//* 217  441:aload           20
	//* 218  443:invokevirtual   #566 <Method int PieData.getXValCount()>
	//* 219  446:icmpge          479
	//* 220  449:aload_1         
	//* 221  450:aload           20
	//* 222  452:invokevirtual   #569 <Method List PieData.getXVals()>
	//* 223  455:iload           13
	//* 224  457:invokeinterface #531 <Method Object List.get(int)>
	//* 225  462:checkcast       #571 <Class String>
	//* 226  465:fload           8
	//* 227  467:fload           9
	//* 228  469:fload           7
	//* 229  471:fadd            
	//* 230  472:aload_0         
	//* 231  473:getfield        #99  <Field Paint mValuePaint>
	//* 232  476:invokevirtual   #575 <Method void Canvas.drawText(String, float, float, Paint)>
	//* 233  479:iload           10
	//* 234  481:iconst_1        
	//* 235  482:iadd            
	//* 236  483:istore          10
	//* 237  485:iload           13
	//* 238  487:iconst_1        
	//* 239  488:iadd            
	//* 240  489:istore          13
	//* 241  491:goto            262
			f1 = af1[i - 1] * f3;
	//  242  494:aload           19
	//  243  496:iload           10
	//  244  498:iconst_1        
	//  245  499:isub            
	//  246  500:faload          
	//  247  501:fload           4
	//  248  503:fmul            
	//  249  504:fstore_2        
		f1 += (af[i] - ipiedataset.getSliceSpace() / (0.01745329F * f4) / 2.0F) / 2.0F;
		f7 = (float)((double)f4 * Math.cos(Math.toRadians(f2 + f1)) + (double)pointf.x);
		f8 = (float)((double)f4 * Math.sin(Math.toRadians(f2 + f1)) + (double)pointf.y);
		if(mChart.isUsePercentValuesEnabled())
			f1 = (entry.getVal() / f5) * 100F;
		else
	//* 250  505:goto            291
			f1 = entry.getVal();
	//  251  508:aload           23
	//  252  510:invokevirtual   #398 <Method float Entry.getVal()>
	//  253  513:fstore_2        
		valueformatter = ipiedataset.getValueFormatter();
		flag1 = ipiedataset.isDrawValuesEnabled();
		if(flag && flag1)
		{
			drawValue(canvas, valueformatter, f1, entry, 0, f7, f8, ipiedataset.getValueTextColor(l));
			if(l < piedata.getXValCount())
				canvas.drawText((String)piedata.getXVals().get(l), f7, f8 + f6, mValuePaint);
		} else
	//* 254  514:goto            387
		if(flag)
	//* 255  517:iload           15
	//* 256  519:ifeq            583
		{
			if(l < piedata.getXValCount())
	//* 257  522:iload           13
	//* 258  524:aload           20
	//* 259  526:invokevirtual   #566 <Method int PieData.getXValCount()>
	//* 260  529:icmpge          479
			{
				mValuePaint.setColor(ipiedataset.getValueTextColor(l));
	//  261  532:aload_0         
	//  262  533:getfield        #99  <Field Paint mValuePaint>
	//  263  536:aload           22
	//  264  538:iload           13
	//  265  540:invokeinterface #559 <Method int IPieDataSet.getValueTextColor(int)>
	//  266  545:invokevirtual   #63  <Method void Paint.setColor(int)>
				canvas.drawText((String)piedata.getXVals().get(l), f7, f6 / 2.0F + f8, mValuePaint);
	//  267  548:aload_1         
	//  268  549:aload           20
	//  269  551:invokevirtual   #569 <Method List PieData.getXVals()>
	//  270  554:iload           13
	//  271  556:invokeinterface #531 <Method Object List.get(int)>
	//  272  561:checkcast       #571 <Class String>
	//  273  564:fload           8
	//  274  566:fload           7
	//  275  568:fconst_2        
	//  276  569:fdiv            
	//  277  570:fload           9
	//  278  572:fadd            
	//  279  573:aload_0         
	//  280  574:getfield        #99  <Field Paint mValuePaint>
	//  281  577:invokevirtual   #575 <Method void Canvas.drawText(String, float, float, Paint)>
			}
		} else
	//* 282  580:goto            479
		if(flag1)
	//* 283  583:iload           16
	//* 284  585:ifeq            479
			drawValue(canvas, valueformatter, f1, entry, 0, f7, f8 + f6 / 2.0F, ipiedataset.getValueTextColor(l));
	//  285  588:aload_0         
	//  286  589:aload_1         
	//  287  590:aload           24
	//  288  592:fload_2         
	//  289  593:aload           23
	//  290  595:iconst_0        
	//  291  596:fload           8
	//  292  598:fload           9
	//  293  600:fload           7
	//  294  602:fconst_2        
	//  295  603:fdiv            
	//  296  604:fadd            
	//  297  605:aload           22
	//  298  607:iload           13
	//  299  609:invokeinterface #559 <Method int IPieDataSet.getValueTextColor(int)>
	//  300  614:invokevirtual   #563 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, Entry, int, float, float, int)>
		i++;
		l++;
		  goto _L5
		  goto _L4
	//* 301  617:goto            479
	//  302  620:return          
	}

	public TextPaint getPaintCenterText()
	{
		return mCenterTextPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field TextPaint mCenterTextPaint>
	//    2    4:areturn         
	}

	public Paint getPaintHole()
	{
		return mHolePaint;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Paint mHolePaint>
	//    2    4:areturn         
	}

	public Paint getPaintTransparentCircle()
	{
		return mTransparentCirclePaint;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Paint mTransparentCirclePaint>
	//    2    4:areturn         
	}

	public void initBuffers()
	{
	//    0    0:return          
	}

	public void releaseBitmap()
	{
		if(mDrawBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field WeakReference mDrawBitmap>
	//*   2    4:ifnull          32
		{
			((Bitmap)mDrawBitmap.get()).recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #294 <Field WeakReference mDrawBitmap>
	//    5   11:invokevirtual   #300 <Method Object WeakReference.get()>
	//    6   14:checkcast       #302 <Class Bitmap>
	//    7   17:invokevirtual   #585 <Method void Bitmap.recycle()>
			mDrawBitmap.clear();
	//    8   20:aload_0         
	//    9   21:getfield        #294 <Field WeakReference mDrawBitmap>
	//   10   24:invokevirtual   #588 <Method void WeakReference.clear()>
			mDrawBitmap = null;
	//   11   27:aload_0         
	//   12   28:aconst_null     
	//   13   29:putfield        #294 <Field WeakReference mDrawBitmap>
		}
	//   14   32:return          
	}

	protected Canvas mBitmapCanvas;
	private RectF mCenterTextLastBounds;
	private CharSequence mCenterTextLastValue;
	private StaticLayout mCenterTextLayout;
	private TextPaint mCenterTextPaint;
	protected PieChart mChart;
	protected WeakReference mDrawBitmap;
	private Path mHoleCirclePath;
	protected Paint mHolePaint;
	private RectF mInnerRectBuffer;
	private Path mPathBuffer;
	private RectF mRectBuffer[] = {
		new RectF(), new RectF(), new RectF()
	};
	protected Paint mTransparentCirclePaint;
}
