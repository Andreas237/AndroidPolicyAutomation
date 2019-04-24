// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.XAxisValueFormatter;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			AxisRenderer

public class XAxisRenderer extends AxisRenderer
{

	public XAxisRenderer(ViewPortHandler viewporthandler, XAxis xaxis, Transformer transformer)
	{
		super(viewporthandler, transformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #15  <Method void AxisRenderer(ViewPortHandler, Transformer)>
		mLimitLineSegmentsBuffer = new float[4];
	//    4    6:aload_0         
	//    5    7:iconst_4        
	//    6    8:newarray        float[]
	//    7   10:putfield        #17  <Field float[] mLimitLineSegmentsBuffer>
		mLimitLinePath = new Path();
	//    8   13:aload_0         
	//    9   14:new             #19  <Class Path>
	//   10   17:dup             
	//   11   18:invokespecial   #22  <Method void Path()>
	//   12   21:putfield        #24  <Field Path mLimitLinePath>
		mXAxis = xaxis;
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:putfield        #26  <Field XAxis mXAxis>
		mAxisLabelPaint.setColor(0xff000000);
	//   16   29:aload_0         
	//   17   30:getfield        #30  <Field Paint mAxisLabelPaint>
	//   18   33:ldc1            #31  <Int 0xff000000>
	//   19   35:invokevirtual   #37  <Method void Paint.setColor(int)>
		mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   20   38:aload_0         
	//   21   39:getfield        #30  <Field Paint mAxisLabelPaint>
	//   22   42:getstatic       #43  <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   23   45:invokevirtual   #47  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10F));
	//   24   48:aload_0         
	//   25   49:getfield        #30  <Field Paint mAxisLabelPaint>
	//   26   52:ldc1            #48  <Float 10F>
	//   27   54:invokestatic    #54  <Method float Utils.convertDpToPixel(float)>
	//   28   57:invokevirtual   #58  <Method void Paint.setTextSize(float)>
	//   29   60:return          
	}

	public void computeAxis(float f, List list)
	{
		mAxisLabelPaint.setTypeface(mXAxis.getTypeface());
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Paint mAxisLabelPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field XAxis mXAxis>
	//    4    8:invokevirtual   #67  <Method android.graphics.Typeface XAxis.getTypeface()>
	//    5   11:invokevirtual   #71  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    6   14:pop             
		mAxisLabelPaint.setTextSize(mXAxis.getTextSize());
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field Paint mAxisLabelPaint>
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field XAxis mXAxis>
	//   11   23:invokevirtual   #75  <Method float XAxis.getTextSize()>
	//   12   26:invokevirtual   #58  <Method void Paint.setTextSize(float)>
		Object obj = ((Object) (new StringBuilder()));
	//   13   29:new             #77  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #78  <Method void StringBuilder()>
	//   16   36:astore          6
		int k = Math.round(f);
	//   17   38:fload_1         
	//   18   39:invokestatic    #84  <Method int Math.round(float)>
	//   19   42:istore          5
		for(int i = 0; i < k; i++)
	//*  20   44:iconst_0        
	//*  21   45:istore          4
	//*  22   47:iload           4
	//*  23   49:iload           5
	//*  24   51:icmpge          71
			((StringBuilder) (obj)).append('h');
	//   25   54:aload           6
	//   26   56:bipush          104
	//   27   58:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   28   61:pop             

	//   29   62:iload           4
	//   30   64:iconst_1        
	//   31   65:iadd            
	//   32   66:istore          4
	//*  33   68:goto            47
		f = Utils.calcTextSize(mAxisLabelPaint, ((StringBuilder) (obj)).toString()).width;
	//   34   71:aload_0         
	//   35   72:getfield        #30  <Field Paint mAxisLabelPaint>
	//   36   75:aload           6
	//   37   77:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   38   80:invokestatic    #96  <Method FSize Utils.calcTextSize(Paint, String)>
	//   39   83:getfield        #102 <Field float FSize.width>
	//   40   86:fstore_1        
		float f1 = Utils.calcTextHeight(mAxisLabelPaint, "Q");
	//   41   87:aload_0         
	//   42   88:getfield        #30  <Field Paint mAxisLabelPaint>
	//   43   91:ldc1            #104 <String "Q">
	//   44   93:invokestatic    #108 <Method int Utils.calcTextHeight(Paint, String)>
	//   45   96:i2f             
	//   46   97:fstore_3        
		obj = ((Object) (Utils.getSizeOfRotatedRectangleByDegrees(f, f1, mXAxis.getLabelRotationAngle())));
	//   47   98:fload_1         
	//   48   99:fload_3         
	//   49  100:aload_0         
	//   50  101:getfield        #26  <Field XAxis mXAxis>
	//   51  104:invokevirtual   #111 <Method float XAxis.getLabelRotationAngle()>
	//   52  107:invokestatic    #115 <Method FSize Utils.getSizeOfRotatedRectangleByDegrees(float, float, float)>
	//   53  110:astore          6
		Object obj1 = ((Object) (new StringBuilder()));
	//   54  112:new             #77  <Class StringBuilder>
	//   55  115:dup             
	//   56  116:invokespecial   #78  <Method void StringBuilder()>
	//   57  119:astore          7
		k = mXAxis.getSpaceBetweenLabels();
	//   58  121:aload_0         
	//   59  122:getfield        #26  <Field XAxis mXAxis>
	//   60  125:invokevirtual   #119 <Method int XAxis.getSpaceBetweenLabels()>
	//   61  128:istore          5
		for(int j = 0; j < k; j++)
	//*  62  130:iconst_0        
	//*  63  131:istore          4
	//*  64  133:iload           4
	//*  65  135:iload           5
	//*  66  137:icmpge          157
			((StringBuilder) (obj1)).append('h');
	//   67  140:aload           7
	//   68  142:bipush          104
	//   69  144:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   70  147:pop             

	//   71  148:iload           4
	//   72  150:iconst_1        
	//   73  151:iadd            
	//   74  152:istore          4
	//*  75  154:goto            133
		obj1 = ((Object) (Utils.calcTextSize(mAxisLabelPaint, ((StringBuilder) (obj1)).toString())));
	//   76  157:aload_0         
	//   77  158:getfield        #30  <Field Paint mAxisLabelPaint>
	//   78  161:aload           7
	//   79  163:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   80  166:invokestatic    #96  <Method FSize Utils.calcTextSize(Paint, String)>
	//   81  169:astore          7
		mXAxis.mLabelWidth = Math.round(((FSize) (obj1)).width + f);
	//   82  171:aload_0         
	//   83  172:getfield        #26  <Field XAxis mXAxis>
	//   84  175:aload           7
	//   85  177:getfield        #102 <Field float FSize.width>
	//   86  180:fload_1         
	//   87  181:fadd            
	//   88  182:invokestatic    #84  <Method int Math.round(float)>
	//   89  185:putfield        #123 <Field int XAxis.mLabelWidth>
		mXAxis.mLabelHeight = Math.round(f1);
	//   90  188:aload_0         
	//   91  189:getfield        #26  <Field XAxis mXAxis>
	//   92  192:fload_3         
	//   93  193:invokestatic    #84  <Method int Math.round(float)>
	//   94  196:putfield        #126 <Field int XAxis.mLabelHeight>
		mXAxis.mLabelRotatedWidth = Math.round(((FSize) (obj)).width + ((FSize) (obj1)).width);
	//   95  199:aload_0         
	//   96  200:getfield        #26  <Field XAxis mXAxis>
	//   97  203:aload           6
	//   98  205:getfield        #102 <Field float FSize.width>
	//   99  208:aload           7
	//  100  210:getfield        #102 <Field float FSize.width>
	//  101  213:fadd            
	//  102  214:invokestatic    #84  <Method int Math.round(float)>
	//  103  217:putfield        #129 <Field int XAxis.mLabelRotatedWidth>
		mXAxis.mLabelRotatedHeight = Math.round(((FSize) (obj)).height);
	//  104  220:aload_0         
	//  105  221:getfield        #26  <Field XAxis mXAxis>
	//  106  224:aload           6
	//  107  226:getfield        #132 <Field float FSize.height>
	//  108  229:invokestatic    #84  <Method int Math.round(float)>
	//  109  232:putfield        #135 <Field int XAxis.mLabelRotatedHeight>
		mXAxis.setValues(list);
	//  110  235:aload_0         
	//  111  236:getfield        #26  <Field XAxis mXAxis>
	//  112  239:aload_2         
	//  113  240:invokevirtual   #139 <Method void XAxis.setValues(List)>
	//  114  243:return          
	}

	protected void drawLabel(Canvas canvas, String s, int i, float f, float f1, PointF pointf, float f2)
	{
		Utils.drawText(canvas, mXAxis.getValueFormatter().getXValue(s, i, mViewPortHandler), f, f1, mAxisLabelPaint, pointf, f2);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field XAxis mXAxis>
	//    3    5:invokevirtual   #147 <Method XAxisValueFormatter XAxis.getValueFormatter()>
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//    8   14:invokeinterface #157 <Method String XAxisValueFormatter.getXValue(String, int, ViewPortHandler)>
	//    9   19:fload           4
	//   10   21:fload           5
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field Paint mAxisLabelPaint>
	//   13   27:aload           6
	//   14   29:fload           7
	//   15   31:invokestatic    #161 <Method void Utils.drawText(Canvas, String, float, float, Paint, PointF, float)>
	//   16   34:return          
	}

	protected void drawLabels(Canvas canvas, float f, PointF pointf)
	{
		float f1;
		int i;
		float af[];
		f1 = mXAxis.getLabelRotationAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field XAxis mXAxis>
	//    2    4:invokevirtual   #111 <Method float XAxis.getLabelRotationAngle()>
	//    3    7:fstore          4
		af = new float[2];
	//    4    9:iconst_2        
	//    5   10:newarray        float[]
	//    6   12:astore          7
		af;
	//    7   14:aload           7
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:fconst_0        
	//   11   19:fastore         
	//   12   20:dup             
	//   13   21:iconst_1        
	//   14   22:fconst_0        
	//   15   23:fastore         
	//   16   24:pop             
		af[0] = 0.0F;
		af[1] = 0.0F;
		i = mMinX;
	//   17   25:aload_0         
	//   18   26:getfield        #166 <Field int mMinX>
	//   19   29:istore          6
_L10:
		if(i > mMaxX) goto _L2; else goto _L1
	//   20   31:iload           6
	//   21   33:aload_0         
	//   22   34:getfield        #169 <Field int mMaxX>
	//   23   37:icmpgt          257
_L1:
		af[0] = i;
	//   24   40:aload           7
	//   25   42:iconst_0        
	//   26   43:iload           6
	//   27   45:i2f             
	//   28   46:fastore         
		mTrans.pointValuesToPixel(af);
	//   29   47:aload_0         
	//   30   48:getfield        #173 <Field Transformer mTrans>
	//   31   51:aload           7
	//   32   53:invokevirtual   #179 <Method void Transformer.pointValuesToPixel(float[])>
		if(!mViewPortHandler.isInBoundsX(af[0])) goto _L4; else goto _L3
	//   33   56:aload_0         
	//   34   57:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   35   60:aload           7
	//   36   62:iconst_0        
	//   37   63:faload          
	//   38   64:invokevirtual   #185 <Method boolean ViewPortHandler.isInBoundsX(float)>
	//   39   67:ifeq            209
_L3:
		String s = (String)mXAxis.getValues().get(i);
	//   40   70:aload_0         
	//   41   71:getfield        #26  <Field XAxis mXAxis>
	//   42   74:invokevirtual   #189 <Method List XAxis.getValues()>
	//   43   77:iload           6
	//   44   79:invokeinterface #195 <Method Object List.get(int)>
	//   45   84:checkcast       #197 <Class String>
	//   46   87:astore          8
		if(!mXAxis.isAvoidFirstLastClippingEnabled()) goto _L6; else goto _L5
	//   47   89:aload_0         
	//   48   90:getfield        #26  <Field XAxis mXAxis>
	//   49   93:invokevirtual   #201 <Method boolean XAxis.isAvoidFirstLastClippingEnabled()>
	//   50   96:ifeq            192
_L5:
		if(i != mXAxis.getValues().size() - 1 || mXAxis.getValues().size() <= 1) goto _L8; else goto _L7
	//   51   99:iload           6
	//   52  101:aload_0         
	//   53  102:getfield        #26  <Field XAxis mXAxis>
	//   54  105:invokevirtual   #189 <Method List XAxis.getValues()>
	//   55  108:invokeinterface #204 <Method int List.size()>
	//   56  113:iconst_1        
	//   57  114:isub            
	//   58  115:icmpne          224
	//   59  118:aload_0         
	//   60  119:getfield        #26  <Field XAxis mXAxis>
	//   61  122:invokevirtual   #189 <Method List XAxis.getValues()>
	//   62  125:invokeinterface #204 <Method int List.size()>
	//   63  130:iconst_1        
	//   64  131:icmple          224
_L7:
		float f2 = Utils.calcTextWidth(mAxisLabelPaint, s);
	//   65  134:aload_0         
	//   66  135:getfield        #30  <Field Paint mAxisLabelPaint>
	//   67  138:aload           8
	//   68  140:invokestatic    #207 <Method int Utils.calcTextWidth(Paint, String)>
	//   69  143:i2f             
	//   70  144:fstore          5
		if(f2 > mViewPortHandler.offsetRight() * 2.0F && af[0] + f2 > mViewPortHandler.getChartWidth())
	//*  71  146:fload           5
	//*  72  148:aload_0         
	//*  73  149:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//*  74  152:invokevirtual   #210 <Method float ViewPortHandler.offsetRight()>
	//*  75  155:fconst_2        
	//*  76  156:fmul            
	//*  77  157:fcmpl           
	//*  78  158:ifle            192
	//*  79  161:aload           7
	//*  80  163:iconst_0        
	//*  81  164:faload          
	//*  82  165:fload           5
	//*  83  167:fadd            
	//*  84  168:aload_0         
	//*  85  169:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//*  86  172:invokevirtual   #213 <Method float ViewPortHandler.getChartWidth()>
	//*  87  175:fcmpl           
	//*  88  176:ifle            192
			af[0] = af[0] - f2 / 2.0F;
	//   89  179:aload           7
	//   90  181:iconst_0        
	//   91  182:aload           7
	//   92  184:iconst_0        
	//   93  185:faload          
	//   94  186:fload           5
	//   95  188:fconst_2        
	//   96  189:fdiv            
	//   97  190:fsub            
	//   98  191:fastore         
_L6:
		drawLabel(canvas, s, i, af[0], f, pointf, f1);
	//   99  192:aload_0         
	//  100  193:aload_1         
	//  101  194:aload           8
	//  102  196:iload           6
	//  103  198:aload           7
	//  104  200:iconst_0        
	//  105  201:faload          
	//  106  202:fload_2         
	//  107  203:aload_3         
	//  108  204:fload           4
	//  109  206:invokevirtual   #215 <Method void drawLabel(Canvas, String, int, float, float, PointF, float)>
_L4:
		i += mXAxis.mAxisLabelModulus;
	//  110  209:iload           6
	//  111  211:aload_0         
	//  112  212:getfield        #26  <Field XAxis mXAxis>
	//  113  215:getfield        #218 <Field int XAxis.mAxisLabelModulus>
	//  114  218:iadd            
	//  115  219:istore          6
		continue; /* Loop/switch isn't completed */
	//  116  221:goto            31
_L8:
		if(i == 0)
	//* 117  224:iload           6
	//* 118  226:ifne            192
		{
			float f3 = Utils.calcTextWidth(mAxisLabelPaint, s);
	//  119  229:aload_0         
	//  120  230:getfield        #30  <Field Paint mAxisLabelPaint>
	//  121  233:aload           8
	//  122  235:invokestatic    #207 <Method int Utils.calcTextWidth(Paint, String)>
	//  123  238:i2f             
	//  124  239:fstore          5
			af[0] = af[0] + f3 / 2.0F;
	//  125  241:aload           7
	//  126  243:iconst_0        
	//  127  244:aload           7
	//  128  246:iconst_0        
	//  129  247:faload          
	//  130  248:fload           5
	//  131  250:fconst_2        
	//  132  251:fdiv            
	//  133  252:fadd            
	//  134  253:fastore         
		}
		if(true) goto _L6; else goto _L2
	//  135  254:goto            192
_L2:
		return;
	//  136  257:return          
		if(true) goto _L10; else goto _L9
_L9:
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(!mXAxis.isEnabled() || !mXAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #223 <Method boolean XAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #26  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #226 <Method boolean XAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float f = mXAxis.getYOffset();
	//    9   21:aload_0         
	//   10   22:getfield        #26  <Field XAxis mXAxis>
	//   11   25:invokevirtual   #229 <Method float XAxis.getYOffset()>
	//   12   28:fstore_2        
		mAxisLabelPaint.setTypeface(mXAxis.getTypeface());
	//   13   29:aload_0         
	//   14   30:getfield        #30  <Field Paint mAxisLabelPaint>
	//   15   33:aload_0         
	//   16   34:getfield        #26  <Field XAxis mXAxis>
	//   17   37:invokevirtual   #67  <Method android.graphics.Typeface XAxis.getTypeface()>
	//   18   40:invokevirtual   #71  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   19   43:pop             
		mAxisLabelPaint.setTextSize(mXAxis.getTextSize());
	//   20   44:aload_0         
	//   21   45:getfield        #30  <Field Paint mAxisLabelPaint>
	//   22   48:aload_0         
	//   23   49:getfield        #26  <Field XAxis mXAxis>
	//   24   52:invokevirtual   #75  <Method float XAxis.getTextSize()>
	//   25   55:invokevirtual   #58  <Method void Paint.setTextSize(float)>
		mAxisLabelPaint.setColor(mXAxis.getTextColor());
	//   26   58:aload_0         
	//   27   59:getfield        #30  <Field Paint mAxisLabelPaint>
	//   28   62:aload_0         
	//   29   63:getfield        #26  <Field XAxis mXAxis>
	//   30   66:invokevirtual   #232 <Method int XAxis.getTextColor()>
	//   31   69:invokevirtual   #37  <Method void Paint.setColor(int)>
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP)
	//*  32   72:aload_0         
	//*  33   73:getfield        #26  <Field XAxis mXAxis>
	//*  34   76:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  35   79:getstatic       #242 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//*  36   82:if_acmpne       110
		{
			drawLabels(canvas, mViewPortHandler.contentTop() - f, new PointF(0.5F, 1.0F));
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:aload_0         
	//   40   88:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   41   91:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   42   94:fload_2         
	//   43   95:fsub            
	//   44   96:new             #247 <Class PointF>
	//   45   99:dup             
	//   46  100:ldc1            #248 <Float 0.5F>
	//   47  102:fconst_1        
	//   48  103:invokespecial   #251 <Method void PointF(float, float)>
	//   49  106:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   50  109:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE)
	//*  51  110:aload_0         
	//*  52  111:getfield        #26  <Field XAxis mXAxis>
	//*  53  114:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  54  117:getstatic       #256 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP_INSIDE>
	//*  55  120:if_acmpne       157
		{
			drawLabels(canvas, mViewPortHandler.contentTop() + f + (float)mXAxis.mLabelRotatedHeight, new PointF(0.5F, 1.0F));
	//   56  123:aload_0         
	//   57  124:aload_1         
	//   58  125:aload_0         
	//   59  126:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   60  129:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   61  132:fload_2         
	//   62  133:fadd            
	//   63  134:aload_0         
	//   64  135:getfield        #26  <Field XAxis mXAxis>
	//   65  138:getfield        #135 <Field int XAxis.mLabelRotatedHeight>
	//   66  141:i2f             
	//   67  142:fadd            
	//   68  143:new             #247 <Class PointF>
	//   69  146:dup             
	//   70  147:ldc1            #248 <Float 0.5F>
	//   71  149:fconst_1        
	//   72  150:invokespecial   #251 <Method void PointF(float, float)>
	//   73  153:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   74  156:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM)
	//*  75  157:aload_0         
	//*  76  158:getfield        #26  <Field XAxis mXAxis>
	//*  77  161:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  78  164:getstatic       #259 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//*  79  167:if_acmpne       195
		{
			drawLabels(canvas, mViewPortHandler.contentBottom() + f, new PointF(0.5F, 0.0F));
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:aload_0         
	//   83  173:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   84  176:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   85  179:fload_2         
	//   86  180:fadd            
	//   87  181:new             #247 <Class PointF>
	//   88  184:dup             
	//   89  185:ldc1            #248 <Float 0.5F>
	//   90  187:fconst_0        
	//   91  188:invokespecial   #251 <Method void PointF(float, float)>
	//   92  191:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   93  194:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE)
	//*  94  195:aload_0         
	//*  95  196:getfield        #26  <Field XAxis mXAxis>
	//*  96  199:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  97  202:getstatic       #265 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM_INSIDE>
	//*  98  205:if_acmpne       242
		{
			drawLabels(canvas, mViewPortHandler.contentBottom() - f - (float)mXAxis.mLabelRotatedHeight, new PointF(0.5F, 0.0F));
	//   99  208:aload_0         
	//  100  209:aload_1         
	//  101  210:aload_0         
	//  102  211:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//  103  214:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//  104  217:fload_2         
	//  105  218:fsub            
	//  106  219:aload_0         
	//  107  220:getfield        #26  <Field XAxis mXAxis>
	//  108  223:getfield        #135 <Field int XAxis.mLabelRotatedHeight>
	//  109  226:i2f             
	//  110  227:fsub            
	//  111  228:new             #247 <Class PointF>
	//  112  231:dup             
	//  113  232:ldc1            #248 <Float 0.5F>
	//  114  234:fconst_0        
	//  115  235:invokespecial   #251 <Method void PointF(float, float)>
	//  116  238:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//  117  241:return          
		} else
		{
			drawLabels(canvas, mViewPortHandler.contentTop() - f, new PointF(0.5F, 1.0F));
	//  118  242:aload_0         
	//  119  243:aload_1         
	//  120  244:aload_0         
	//  121  245:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//  122  248:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//  123  251:fload_2         
	//  124  252:fsub            
	//  125  253:new             #247 <Class PointF>
	//  126  256:dup             
	//  127  257:ldc1            #248 <Float 0.5F>
	//  128  259:fconst_1        
	//  129  260:invokespecial   #251 <Method void PointF(float, float)>
	//  130  263:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			drawLabels(canvas, mViewPortHandler.contentBottom() + f, new PointF(0.5F, 0.0F));
	//  131  266:aload_0         
	//  132  267:aload_1         
	//  133  268:aload_0         
	//  134  269:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//  135  272:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//  136  275:fload_2         
	//  137  276:fadd            
	//  138  277:new             #247 <Class PointF>
	//  139  280:dup             
	//  140  281:ldc1            #248 <Float 0.5F>
	//  141  283:fconst_0        
	//  142  284:invokespecial   #251 <Method void PointF(float, float)>
	//  143  287:invokevirtual   #253 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//  144  290:return          
		}
	}

	public void renderAxisLine(Canvas canvas)
	{
		if(mXAxis.isDrawAxisLineEnabled() && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #269 <Method boolean XAxis.isDrawAxisLineEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #26  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #223 <Method boolean XAxis.isEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			mAxisLinePaint.setColor(mXAxis.getAxisLineColor());
	//    9   21:aload_0         
	//   10   22:getfield        #272 <Field Paint mAxisLinePaint>
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field XAxis mXAxis>
	//   13   29:invokevirtual   #275 <Method int XAxis.getAxisLineColor()>
	//   14   32:invokevirtual   #37  <Method void Paint.setColor(int)>
			mAxisLinePaint.setStrokeWidth(mXAxis.getAxisLineWidth());
	//   15   35:aload_0         
	//   16   36:getfield        #272 <Field Paint mAxisLinePaint>
	//   17   39:aload_0         
	//   18   40:getfield        #26  <Field XAxis mXAxis>
	//   19   43:invokevirtual   #278 <Method float XAxis.getAxisLineWidth()>
	//   20   46:invokevirtual   #281 <Method void Paint.setStrokeWidth(float)>
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//*  21   49:aload_0         
	//*  22   50:getfield        #26  <Field XAxis mXAxis>
	//*  23   53:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  24   56:getstatic       #242 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//*  25   59:if_acmpeq       88
	//*  26   62:aload_0         
	//*  27   63:getfield        #26  <Field XAxis mXAxis>
	//*  28   66:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  29   69:getstatic       #256 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP_INSIDE>
	//*  30   72:if_acmpeq       88
	//*  31   75:aload_0         
	//*  32   76:getfield        #26  <Field XAxis mXAxis>
	//*  33   79:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  34   82:getstatic       #284 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//*  35   85:if_acmpne       124
				canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), mViewPortHandler.contentRight(), mViewPortHandler.contentTop(), mAxisLinePaint);
	//   36   88:aload_1         
	//   37   89:aload_0         
	//   38   90:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   39   93:invokevirtual   #287 <Method float ViewPortHandler.contentLeft()>
	//   40   96:aload_0         
	//   41   97:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   42  100:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   43  103:aload_0         
	//   44  104:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   45  107:invokevirtual   #290 <Method float ViewPortHandler.contentRight()>
	//   46  110:aload_0         
	//   47  111:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   48  114:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   49  117:aload_0         
	//   50  118:getfield        #272 <Field Paint mAxisLinePaint>
	//   51  121:invokevirtual   #296 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//*  52  124:aload_0         
	//*  53  125:getfield        #26  <Field XAxis mXAxis>
	//*  54  128:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  55  131:getstatic       #259 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//*  56  134:if_acmpeq       163
	//*  57  137:aload_0         
	//*  58  138:getfield        #26  <Field XAxis mXAxis>
	//*  59  141:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  60  144:getstatic       #265 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM_INSIDE>
	//*  61  147:if_acmpeq       163
	//*  62  150:aload_0         
	//*  63  151:getfield        #26  <Field XAxis mXAxis>
	//*  64  154:invokevirtual   #236 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  65  157:getstatic       #284 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//*  66  160:if_acmpne       20
			{
				canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentBottom(), mViewPortHandler.contentRight(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   67  163:aload_1         
	//   68  164:aload_0         
	//   69  165:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   70  168:invokevirtual   #287 <Method float ViewPortHandler.contentLeft()>
	//   71  171:aload_0         
	//   72  172:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   73  175:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   74  178:aload_0         
	//   75  179:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   76  182:invokevirtual   #290 <Method float ViewPortHandler.contentRight()>
	//   77  185:aload_0         
	//   78  186:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   79  189:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   80  192:aload_0         
	//   81  193:getfield        #272 <Field Paint mAxisLinePaint>
	//   82  196:invokevirtual   #296 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				return;
	//   83  199:return          
			}
		}
	}

	public void renderGridLines(Canvas canvas)
	{
		if(mXAxis.isDrawGridLinesEnabled() && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #300 <Method boolean XAxis.isDrawGridLinesEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #26  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #223 <Method boolean XAxis.isEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			float af[] = new float[2];
	//    9   21:iconst_2        
	//   10   22:newarray        float[]
	//   11   24:astore_3        
			float[] _tmp = af;
	//   12   25:aload_3         
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:fconst_0        
	//   16   29:fastore         
	//   17   30:dup             
	//   18   31:iconst_1        
	//   19   32:fconst_0        
	//   20   33:fastore         
	//   21   34:pop             
			af[0] = 0.0F;
			af[1] = 0.0F;
			mGridPaint.setColor(mXAxis.getGridColor());
	//   22   35:aload_0         
	//   23   36:getfield        #303 <Field Paint mGridPaint>
	//   24   39:aload_0         
	//   25   40:getfield        #26  <Field XAxis mXAxis>
	//   26   43:invokevirtual   #306 <Method int XAxis.getGridColor()>
	//   27   46:invokevirtual   #37  <Method void Paint.setColor(int)>
			mGridPaint.setStrokeWidth(mXAxis.getGridLineWidth());
	//   28   49:aload_0         
	//   29   50:getfield        #303 <Field Paint mGridPaint>
	//   30   53:aload_0         
	//   31   54:getfield        #26  <Field XAxis mXAxis>
	//   32   57:invokevirtual   #309 <Method float XAxis.getGridLineWidth()>
	//   33   60:invokevirtual   #281 <Method void Paint.setStrokeWidth(float)>
			mGridPaint.setPathEffect(((android.graphics.PathEffect) (mXAxis.getGridDashPathEffect())));
	//   34   63:aload_0         
	//   35   64:getfield        #303 <Field Paint mGridPaint>
	//   36   67:aload_0         
	//   37   68:getfield        #26  <Field XAxis mXAxis>
	//   38   71:invokevirtual   #313 <Method android.graphics.DashPathEffect XAxis.getGridDashPathEffect()>
	//   39   74:invokevirtual   #317 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   40   77:pop             
			Path path = new Path();
	//   41   78:new             #19  <Class Path>
	//   42   81:dup             
	//   43   82:invokespecial   #22  <Method void Path()>
	//   44   85:astore          4
			int i = mMinX;
	//   45   87:aload_0         
	//   46   88:getfield        #166 <Field int mMinX>
	//   47   91:istore_2        
			while(i <= mMaxX) 
	//*  48   92:iload_2         
	//*  49   93:aload_0         
	//*  50   94:getfield        #169 <Field int mMaxX>
	//*  51   97:icmpgt          20
			{
				af[0] = i;
	//   52  100:aload_3         
	//   53  101:iconst_0        
	//   54  102:iload_2         
	//   55  103:i2f             
	//   56  104:fastore         
				mTrans.pointValuesToPixel(af);
	//   57  105:aload_0         
	//   58  106:getfield        #173 <Field Transformer mTrans>
	//   59  109:aload_3         
	//   60  110:invokevirtual   #179 <Method void Transformer.pointValuesToPixel(float[])>
				if(af[0] >= mViewPortHandler.offsetLeft() && af[0] <= mViewPortHandler.getChartWidth())
	//*  61  113:aload_3         
	//*  62  114:iconst_0        
	//*  63  115:faload          
	//*  64  116:aload_0         
	//*  65  117:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//*  66  120:invokevirtual   #320 <Method float ViewPortHandler.offsetLeft()>
	//*  67  123:fcmpl           
	//*  68  124:iflt            181
	//*  69  127:aload_3         
	//*  70  128:iconst_0        
	//*  71  129:faload          
	//*  72  130:aload_0         
	//*  73  131:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//*  74  134:invokevirtual   #213 <Method float ViewPortHandler.getChartWidth()>
	//*  75  137:fcmpg           
	//*  76  138:ifgt            181
				{
					path.moveTo(af[0], mViewPortHandler.contentBottom());
	//   77  141:aload           4
	//   78  143:aload_3         
	//   79  144:iconst_0        
	//   80  145:faload          
	//   81  146:aload_0         
	//   82  147:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   83  150:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   84  153:invokevirtual   #323 <Method void Path.moveTo(float, float)>
					path.lineTo(af[0], mViewPortHandler.contentTop());
	//   85  156:aload           4
	//   86  158:aload_3         
	//   87  159:iconst_0        
	//   88  160:faload          
	//   89  161:aload_0         
	//   90  162:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   91  165:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   92  168:invokevirtual   #326 <Method void Path.lineTo(float, float)>
					canvas.drawPath(path, mGridPaint);
	//   93  171:aload_1         
	//   94  172:aload           4
	//   95  174:aload_0         
	//   96  175:getfield        #303 <Field Paint mGridPaint>
	//   97  178:invokevirtual   #330 <Method void Canvas.drawPath(Path, Paint)>
				}
				path.reset();
	//   98  181:aload           4
	//   99  183:invokevirtual   #333 <Method void Path.reset()>
				i += mXAxis.mAxisLabelModulus;
	//  100  186:iload_2         
	//  101  187:aload_0         
	//  102  188:getfield        #26  <Field XAxis mXAxis>
	//  103  191:getfield        #218 <Field int XAxis.mAxisLabelModulus>
	//  104  194:iadd            
	//  105  195:istore_2        
			}
		}
	//* 106  196:goto            92
	}

	public void renderLimitLineLabel(Canvas canvas, LimitLine limitline, float af[], float f)
	{
		float f1;
		String s;
label0:
		{
			s = limitline.getLabel();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #340 <Method String LimitLine.getLabel()>
	//    2    4:astore          7
			if(s != null && !s.equals(""))
	//*   3    6:aload           7
	//*   4    8:ifnull          147
	//*   5   11:aload           7
	//*   6   13:ldc2            #342 <String "">
	//*   7   16:invokevirtual   #346 <Method boolean String.equals(Object)>
	//*   8   19:ifne            147
			{
				mLimitLinePaint.setStyle(limitline.getTextStyle());
	//    9   22:aload_0         
	//   10   23:getfield        #349 <Field Paint mLimitLinePaint>
	//   11   26:aload_2         
	//   12   27:invokevirtual   #353 <Method android.graphics.Paint$Style LimitLine.getTextStyle()>
	//   13   30:invokevirtual   #357 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//   14   33:aload_0         
	//   15   34:getfield        #349 <Field Paint mLimitLinePaint>
	//   16   37:aconst_null     
	//   17   38:invokevirtual   #317 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   18   41:pop             
				mLimitLinePaint.setColor(limitline.getTextColor());
	//   19   42:aload_0         
	//   20   43:getfield        #349 <Field Paint mLimitLinePaint>
	//   21   46:aload_2         
	//   22   47:invokevirtual   #358 <Method int LimitLine.getTextColor()>
	//   23   50:invokevirtual   #37  <Method void Paint.setColor(int)>
				mLimitLinePaint.setStrokeWidth(0.5F);
	//   24   53:aload_0         
	//   25   54:getfield        #349 <Field Paint mLimitLinePaint>
	//   26   57:ldc1            #248 <Float 0.5F>
	//   27   59:invokevirtual   #281 <Method void Paint.setStrokeWidth(float)>
				mLimitLinePaint.setTextSize(limitline.getTextSize());
	//   28   62:aload_0         
	//   29   63:getfield        #349 <Field Paint mLimitLinePaint>
	//   30   66:aload_2         
	//   31   67:invokevirtual   #359 <Method float LimitLine.getTextSize()>
	//   32   70:invokevirtual   #58  <Method void Paint.setTextSize(float)>
				f1 = limitline.getLineWidth() + limitline.getXOffset();
	//   33   73:aload_2         
	//   34   74:invokevirtual   #362 <Method float LimitLine.getLineWidth()>
	//   35   77:aload_2         
	//   36   78:invokevirtual   #365 <Method float LimitLine.getXOffset()>
	//   37   81:fadd            
	//   38   82:fstore          5
				limitline = ((LimitLine) (limitline.getLabelPosition()));
	//   39   84:aload_2         
	//   40   85:invokevirtual   #369 <Method com.github.mikephil.charting.components.LimitLine$LimitLabelPosition LimitLine.getLabelPosition()>
	//   41   88:astore_2        
				if(limitline != com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP)
					break label0;
	//   42   89:aload_2         
	//   43   90:getstatic       #375 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_TOP>
	//   44   93:if_acmpne       148
				float f2 = Utils.calcTextHeight(mLimitLinePaint, s);
	//   45   96:aload_0         
	//   46   97:getfield        #349 <Field Paint mLimitLinePaint>
	//   47  100:aload           7
	//   48  102:invokestatic    #108 <Method int Utils.calcTextHeight(Paint, String)>
	//   49  105:i2f             
	//   50  106:fstore          6
				mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   51  108:aload_0         
	//   52  109:getfield        #349 <Field Paint mLimitLinePaint>
	//   53  112:getstatic       #378 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   54  115:invokevirtual   #47  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				canvas.drawText(s, af[0] + f1, mViewPortHandler.contentTop() + f + f2, mLimitLinePaint);
	//   55  118:aload_1         
	//   56  119:aload           7
	//   57  121:aload_3         
	//   58  122:iconst_0        
	//   59  123:faload          
	//   60  124:fload           5
	//   61  126:fadd            
	//   62  127:aload_0         
	//   63  128:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   64  131:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   65  134:fload           4
	//   66  136:fadd            
	//   67  137:fload           6
	//   68  139:fadd            
	//   69  140:aload_0         
	//   70  141:getfield        #349 <Field Paint mLimitLinePaint>
	//   71  144:invokevirtual   #381 <Method void Canvas.drawText(String, float, float, Paint)>
			}
			return;
	//   72  147:return          
		}
		if(limitline == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM)
	//*  73  148:aload_2         
	//*  74  149:getstatic       #384 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_BOTTOM>
	//*  75  152:if_acmpne       192
		{
			mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   76  155:aload_0         
	//   77  156:getfield        #349 <Field Paint mLimitLinePaint>
	//   78  159:getstatic       #378 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   79  162:invokevirtual   #47  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			canvas.drawText(s, af[0] + f1, mViewPortHandler.contentBottom() - f, mLimitLinePaint);
	//   80  165:aload_1         
	//   81  166:aload           7
	//   82  168:aload_3         
	//   83  169:iconst_0        
	//   84  170:faload          
	//   85  171:fload           5
	//   86  173:fadd            
	//   87  174:aload_0         
	//   88  175:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   89  178:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   90  181:fload           4
	//   91  183:fsub            
	//   92  184:aload_0         
	//   93  185:getfield        #349 <Field Paint mLimitLinePaint>
	//   94  188:invokevirtual   #381 <Method void Canvas.drawText(String, float, float, Paint)>
			return;
	//   95  191:return          
		}
		if(limitline == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP)
	//*  96  192:aload_2         
	//*  97  193:getstatic       #387 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.LEFT_TOP>
	//*  98  196:if_acmpne       251
		{
			mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   99  199:aload_0         
	//  100  200:getfield        #349 <Field Paint mLimitLinePaint>
	//  101  203:getstatic       #390 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  102  206:invokevirtual   #47  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			float f3 = Utils.calcTextHeight(mLimitLinePaint, s);
	//  103  209:aload_0         
	//  104  210:getfield        #349 <Field Paint mLimitLinePaint>
	//  105  213:aload           7
	//  106  215:invokestatic    #108 <Method int Utils.calcTextHeight(Paint, String)>
	//  107  218:i2f             
	//  108  219:fstore          6
			canvas.drawText(s, af[0] - f1, mViewPortHandler.contentTop() + f + f3, mLimitLinePaint);
	//  109  221:aload_1         
	//  110  222:aload           7
	//  111  224:aload_3         
	//  112  225:iconst_0        
	//  113  226:faload          
	//  114  227:fload           5
	//  115  229:fsub            
	//  116  230:aload_0         
	//  117  231:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//  118  234:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//  119  237:fload           4
	//  120  239:fadd            
	//  121  240:fload           6
	//  122  242:fadd            
	//  123  243:aload_0         
	//  124  244:getfield        #349 <Field Paint mLimitLinePaint>
	//  125  247:invokevirtual   #381 <Method void Canvas.drawText(String, float, float, Paint)>
			return;
	//  126  250:return          
		} else
		{
			mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  127  251:aload_0         
	//  128  252:getfield        #349 <Field Paint mLimitLinePaint>
	//  129  255:getstatic       #390 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  130  258:invokevirtual   #47  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			canvas.drawText(s, af[0] - f1, mViewPortHandler.contentBottom() - f, mLimitLinePaint);
	//  131  261:aload_1         
	//  132  262:aload           7
	//  133  264:aload_3         
	//  134  265:iconst_0        
	//  135  266:faload          
	//  136  267:fload           5
	//  137  269:fsub            
	//  138  270:aload_0         
	//  139  271:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//  140  274:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//  141  277:fload           4
	//  142  279:fsub            
	//  143  280:aload_0         
	//  144  281:getfield        #349 <Field Paint mLimitLinePaint>
	//  145  284:invokevirtual   #381 <Method void Canvas.drawText(String, float, float, Paint)>
			return;
	//  146  287:return          
		}
	}

	public void renderLimitLineLine(Canvas canvas, LimitLine limitline, float af[])
	{
		mLimitLineSegmentsBuffer[0] = af[0];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//    2    4:iconst_0        
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:faload          
	//    6    8:fastore         
		mLimitLineSegmentsBuffer[1] = mViewPortHandler.contentTop();
	//    7    9:aload_0         
	//    8   10:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//    9   13:iconst_1        
	//   10   14:aload_0         
	//   11   15:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   12   18:invokevirtual   #245 <Method float ViewPortHandler.contentTop()>
	//   13   21:fastore         
		mLimitLineSegmentsBuffer[2] = af[0];
	//   14   22:aload_0         
	//   15   23:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   16   26:iconst_2        
	//   17   27:aload_3         
	//   18   28:iconst_0        
	//   19   29:faload          
	//   20   30:fastore         
		mLimitLineSegmentsBuffer[3] = mViewPortHandler.contentBottom();
	//   21   31:aload_0         
	//   22   32:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   23   35:iconst_3        
	//   24   36:aload_0         
	//   25   37:getfield        #151 <Field ViewPortHandler mViewPortHandler>
	//   26   40:invokevirtual   #262 <Method float ViewPortHandler.contentBottom()>
	//   27   43:fastore         
		mLimitLinePath.reset();
	//   28   44:aload_0         
	//   29   45:getfield        #24  <Field Path mLimitLinePath>
	//   30   48:invokevirtual   #333 <Method void Path.reset()>
		mLimitLinePath.moveTo(mLimitLineSegmentsBuffer[0], mLimitLineSegmentsBuffer[1]);
	//   31   51:aload_0         
	//   32   52:getfield        #24  <Field Path mLimitLinePath>
	//   33   55:aload_0         
	//   34   56:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   35   59:iconst_0        
	//   36   60:faload          
	//   37   61:aload_0         
	//   38   62:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   39   65:iconst_1        
	//   40   66:faload          
	//   41   67:invokevirtual   #323 <Method void Path.moveTo(float, float)>
		mLimitLinePath.lineTo(mLimitLineSegmentsBuffer[2], mLimitLineSegmentsBuffer[3]);
	//   42   70:aload_0         
	//   43   71:getfield        #24  <Field Path mLimitLinePath>
	//   44   74:aload_0         
	//   45   75:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   46   78:iconst_2        
	//   47   79:faload          
	//   48   80:aload_0         
	//   49   81:getfield        #17  <Field float[] mLimitLineSegmentsBuffer>
	//   50   84:iconst_3        
	//   51   85:faload          
	//   52   86:invokevirtual   #326 <Method void Path.lineTo(float, float)>
		mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   53   89:aload_0         
	//   54   90:getfield        #349 <Field Paint mLimitLinePaint>
	//   55   93:getstatic       #398 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   56   96:invokevirtual   #357 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mLimitLinePaint.setColor(limitline.getLineColor());
	//   57   99:aload_0         
	//   58  100:getfield        #349 <Field Paint mLimitLinePaint>
	//   59  103:aload_2         
	//   60  104:invokevirtual   #401 <Method int LimitLine.getLineColor()>
	//   61  107:invokevirtual   #37  <Method void Paint.setColor(int)>
		mLimitLinePaint.setStrokeWidth(limitline.getLineWidth());
	//   62  110:aload_0         
	//   63  111:getfield        #349 <Field Paint mLimitLinePaint>
	//   64  114:aload_2         
	//   65  115:invokevirtual   #362 <Method float LimitLine.getLineWidth()>
	//   66  118:invokevirtual   #281 <Method void Paint.setStrokeWidth(float)>
		mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (limitline.getDashPathEffect())));
	//   67  121:aload_0         
	//   68  122:getfield        #349 <Field Paint mLimitLinePaint>
	//   69  125:aload_2         
	//   70  126:invokevirtual   #404 <Method android.graphics.DashPathEffect LimitLine.getDashPathEffect()>
	//   71  129:invokevirtual   #317 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   72  132:pop             
		canvas.drawPath(mLimitLinePath, mLimitLinePaint);
	//   73  133:aload_1         
	//   74  134:aload_0         
	//   75  135:getfield        #24  <Field Path mLimitLinePath>
	//   76  138:aload_0         
	//   77  139:getfield        #349 <Field Paint mLimitLinePaint>
	//   78  142:invokevirtual   #330 <Method void Canvas.drawPath(Path, Paint)>
	//   79  145:return          
	}

	public void renderLimitLines(Canvas canvas)
	{
		List list = mXAxis.getLimitLines();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field XAxis mXAxis>
	//    2    4:invokevirtual   #408 <Method List XAxis.getLimitLines()>
	//    3    7:astore_3        
		if(list != null && list.size() > 0)
	//*   4    8:aload_3         
	//*   5    9:ifnull          21
	//*   6   12:aload_3         
	//*   7   13:invokeinterface #204 <Method int List.size()>
	//*   8   18:ifgt            22
	//*   9   21:return          
		{
			float af[] = new float[2];
	//   10   22:iconst_2        
	//   11   23:newarray        float[]
	//   12   25:astore          4
			int i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
			while(i < list.size()) 
	//*  15   29:iload_2         
	//*  16   30:aload_3         
	//*  17   31:invokeinterface #204 <Method int List.size()>
	//*  18   36:icmpge          21
			{
				LimitLine limitline = (LimitLine)list.get(i);
	//   19   39:aload_3         
	//   20   40:iload_2         
	//   21   41:invokeinterface #195 <Method Object List.get(int)>
	//   22   46:checkcast       #337 <Class LimitLine>
	//   23   49:astore          5
				if(limitline.isEnabled())
	//*  24   51:aload           5
	//*  25   53:invokevirtual   #409 <Method boolean LimitLine.isEnabled()>
	//*  26   56:ifne            66
	//*  27   59:iload_2         
	//*  28   60:iconst_1        
	//*  29   61:iadd            
	//*  30   62:istore_2        
	//*  31   63:goto            29
				{
					af[0] = limitline.getLimit();
	//   32   66:aload           4
	//   33   68:iconst_0        
	//   34   69:aload           5
	//   35   71:invokevirtual   #412 <Method float LimitLine.getLimit()>
	//   36   74:fastore         
					af[1] = 0.0F;
	//   37   75:aload           4
	//   38   77:iconst_1        
	//   39   78:fconst_0        
	//   40   79:fastore         
					mTrans.pointValuesToPixel(af);
	//   41   80:aload_0         
	//   42   81:getfield        #173 <Field Transformer mTrans>
	//   43   84:aload           4
	//   44   86:invokevirtual   #179 <Method void Transformer.pointValuesToPixel(float[])>
					renderLimitLineLine(canvas, limitline, af);
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:aload           5
	//   48   93:aload           4
	//   49   95:invokevirtual   #414 <Method void renderLimitLineLine(Canvas, LimitLine, float[])>
					renderLimitLineLabel(canvas, limitline, af, 2.0F + limitline.getYOffset());
	//   50   98:aload_0         
	//   51   99:aload_1         
	//   52  100:aload           5
	//   53  102:aload           4
	//   54  104:fconst_2        
	//   55  105:aload           5
	//   56  107:invokevirtual   #415 <Method float LimitLine.getYOffset()>
	//   57  110:fadd            
	//   58  111:invokevirtual   #417 <Method void renderLimitLineLabel(Canvas, LimitLine, float[], float)>
				}
				i++;
			}
		}
	//*  59  114:goto            59
	}

	private Path mLimitLinePath;
	float mLimitLineSegmentsBuffer[];
	protected XAxis mXAxis;
}
