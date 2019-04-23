// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Context;
import android.graphics.*;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

public class ProgressWheel extends View
{

	public ProgressWheel(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void View(Context)>
		fullRadius = 100;
	//    3    5:aload_0         
	//    4    6:bipush          100
	//    5    8:putfield        #54  <Field int fullRadius>
		circleRadius = 80;
	//    6   11:aload_0         
	//    7   12:bipush          80
	//    8   14:putfield        #56  <Field int circleRadius>
		barLength = 60;
	//    9   17:aload_0         
	//   10   18:bipush          60
	//   11   20:putfield        #58  <Field int barLength>
		barWidth = 20;
	//   12   23:aload_0         
	//   13   24:bipush          20
	//   14   26:putfield        #60  <Field int barWidth>
		rimWidth = 20;
	//   15   29:aload_0         
	//   16   30:bipush          20
	//   17   32:putfield        #62  <Field int rimWidth>
		textSize = 20;
	//   18   35:aload_0         
	//   19   36:bipush          20
	//   20   38:putfield        #64  <Field int textSize>
		paddingTop = 0;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #66  <Field int paddingTop>
		paddingBottom = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #68  <Field int paddingBottom>
		paddingLeft = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #70  <Field int paddingLeft>
		paddingRight = 0;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #72  <Field int paddingRight>
		barColor = 0xaa000000;
	//   33   61:aload_0         
	//   34   62:ldc1            #73  <Int 0xaa000000>
	//   35   64:putfield        #75  <Field int barColor>
		circleColor = 0;
	//   36   67:aload_0         
	//   37   68:iconst_0        
	//   38   69:putfield        #77  <Field int circleColor>
		rimColor = 0xaadddddd;
	//   39   72:aload_0         
	//   40   73:ldc1            #78  <Int 0xaadddddd>
	//   41   75:putfield        #80  <Field int rimColor>
		textColor = 0xff000000;
	//   42   78:aload_0         
	//   43   79:ldc1            #81  <Int 0xff000000>
	//   44   81:putfield        #83  <Field int textColor>
		barPaint = new Paint();
	//   45   84:aload_0         
	//   46   85:new             #85  <Class Paint>
	//   47   88:dup             
	//   48   89:invokespecial   #88  <Method void Paint()>
	//   49   92:putfield        #90  <Field Paint barPaint>
		circlePaint = new Paint();
	//   50   95:aload_0         
	//   51   96:new             #85  <Class Paint>
	//   52   99:dup             
	//   53  100:invokespecial   #88  <Method void Paint()>
	//   54  103:putfield        #92  <Field Paint circlePaint>
		rimPaint = new Paint();
	//   55  106:aload_0         
	//   56  107:new             #85  <Class Paint>
	//   57  110:dup             
	//   58  111:invokespecial   #88  <Method void Paint()>
	//   59  114:putfield        #94  <Field Paint rimPaint>
		textPaint = new Paint();
	//   60  117:aload_0         
	//   61  118:new             #85  <Class Paint>
	//   62  121:dup             
	//   63  122:invokespecial   #88  <Method void Paint()>
	//   64  125:putfield        #96  <Field Paint textPaint>
		rectBounds = new RectF();
	//   65  128:aload_0         
	//   66  129:new             #98  <Class RectF>
	//   67  132:dup             
	//   68  133:invokespecial   #99  <Method void RectF()>
	//   69  136:putfield        #101 <Field RectF rectBounds>
		circleBounds = new RectF();
	//   70  139:aload_0         
	//   71  140:new             #98  <Class RectF>
	//   72  143:dup             
	//   73  144:invokespecial   #99  <Method void RectF()>
	//   74  147:putfield        #103 <Field RectF circleBounds>
		typeface = Typeface.DEFAULT;
	//   75  150:aload_0         
	//   76  151:getstatic       #108 <Field Typeface Typeface.DEFAULT>
	//   77  154:putfield        #110 <Field Typeface typeface>
		spinSpeed = 2;
	//   78  157:aload_0         
	//   79  158:iconst_2        
	//   80  159:putfield        #112 <Field int spinSpeed>
		delayMillis = 0;
	//   81  162:aload_0         
	//   82  163:iconst_0        
	//   83  164:putfield        #114 <Field int delayMillis>
	//   84  167:aload_0         
	//   85  168:new             #6   <Class ProgressWheel$1>
	//   86  171:dup             
	//   87  172:aload_0         
	//   88  173:invokespecial   #117 <Method void ProgressWheel$1(ProgressWheel)>
	//   89  176:putfield        #119 <Field Handler spinHandler>
		progress = 0;
	//   90  179:aload_0         
	//   91  180:iconst_0        
	//   92  181:putfield        #121 <Field int progress>
		isSpinning = false;
	//   93  184:aload_0         
	//   94  185:iconst_0        
	//   95  186:putfield        #123 <Field boolean isSpinning>
		spinOnce = false;
	//   96  189:aload_0         
	//   97  190:iconst_0        
	//   98  191:putfield        #125 <Field boolean spinOnce>
		text = "";
	//   99  194:aload_0         
	//  100  195:ldc1            #127 <String "">
	//  101  197:putfield        #129 <Field String text>
		mTextBaseline = 0;
	//  102  200:aload_0         
	//  103  201:iconst_0        
	//  104  202:putfield        #131 <Field int mTextBaseline>
		isConfigured = false;
	//  105  205:aload_0         
	//  106  206:iconst_0        
	//  107  207:putfield        #133 <Field boolean isConfigured>
	//  108  210:return          
	}

	public ProgressWheel(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #137 <Method void View(Context, AttributeSet)>
		fullRadius = 100;
	//    4    6:aload_0         
	//    5    7:bipush          100
	//    6    9:putfield        #54  <Field int fullRadius>
		circleRadius = 80;
	//    7   12:aload_0         
	//    8   13:bipush          80
	//    9   15:putfield        #56  <Field int circleRadius>
		barLength = 60;
	//   10   18:aload_0         
	//   11   19:bipush          60
	//   12   21:putfield        #58  <Field int barLength>
		barWidth = 20;
	//   13   24:aload_0         
	//   14   25:bipush          20
	//   15   27:putfield        #60  <Field int barWidth>
		rimWidth = 20;
	//   16   30:aload_0         
	//   17   31:bipush          20
	//   18   33:putfield        #62  <Field int rimWidth>
		textSize = 20;
	//   19   36:aload_0         
	//   20   37:bipush          20
	//   21   39:putfield        #64  <Field int textSize>
		paddingTop = 0;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #66  <Field int paddingTop>
		paddingBottom = 0;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #68  <Field int paddingBottom>
		paddingLeft = 0;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #70  <Field int paddingLeft>
		paddingRight = 0;
	//   31   57:aload_0         
	//   32   58:iconst_0        
	//   33   59:putfield        #72  <Field int paddingRight>
		barColor = 0xaa000000;
	//   34   62:aload_0         
	//   35   63:ldc1            #73  <Int 0xaa000000>
	//   36   65:putfield        #75  <Field int barColor>
		circleColor = 0;
	//   37   68:aload_0         
	//   38   69:iconst_0        
	//   39   70:putfield        #77  <Field int circleColor>
		rimColor = 0xaadddddd;
	//   40   73:aload_0         
	//   41   74:ldc1            #78  <Int 0xaadddddd>
	//   42   76:putfield        #80  <Field int rimColor>
		textColor = 0xff000000;
	//   43   79:aload_0         
	//   44   80:ldc1            #81  <Int 0xff000000>
	//   45   82:putfield        #83  <Field int textColor>
		barPaint = new Paint();
	//   46   85:aload_0         
	//   47   86:new             #85  <Class Paint>
	//   48   89:dup             
	//   49   90:invokespecial   #88  <Method void Paint()>
	//   50   93:putfield        #90  <Field Paint barPaint>
		circlePaint = new Paint();
	//   51   96:aload_0         
	//   52   97:new             #85  <Class Paint>
	//   53  100:dup             
	//   54  101:invokespecial   #88  <Method void Paint()>
	//   55  104:putfield        #92  <Field Paint circlePaint>
		rimPaint = new Paint();
	//   56  107:aload_0         
	//   57  108:new             #85  <Class Paint>
	//   58  111:dup             
	//   59  112:invokespecial   #88  <Method void Paint()>
	//   60  115:putfield        #94  <Field Paint rimPaint>
		textPaint = new Paint();
	//   61  118:aload_0         
	//   62  119:new             #85  <Class Paint>
	//   63  122:dup             
	//   64  123:invokespecial   #88  <Method void Paint()>
	//   65  126:putfield        #96  <Field Paint textPaint>
		rectBounds = new RectF();
	//   66  129:aload_0         
	//   67  130:new             #98  <Class RectF>
	//   68  133:dup             
	//   69  134:invokespecial   #99  <Method void RectF()>
	//   70  137:putfield        #101 <Field RectF rectBounds>
		circleBounds = new RectF();
	//   71  140:aload_0         
	//   72  141:new             #98  <Class RectF>
	//   73  144:dup             
	//   74  145:invokespecial   #99  <Method void RectF()>
	//   75  148:putfield        #103 <Field RectF circleBounds>
		typeface = Typeface.DEFAULT;
	//   76  151:aload_0         
	//   77  152:getstatic       #108 <Field Typeface Typeface.DEFAULT>
	//   78  155:putfield        #110 <Field Typeface typeface>
		spinSpeed = 2;
	//   79  158:aload_0         
	//   80  159:iconst_2        
	//   81  160:putfield        #112 <Field int spinSpeed>
		delayMillis = 0;
	//   82  163:aload_0         
	//   83  164:iconst_0        
	//   84  165:putfield        #114 <Field int delayMillis>
	//   85  168:aload_0         
	//   86  169:new             #6   <Class ProgressWheel$1>
	//   87  172:dup             
	//   88  173:aload_0         
	//   89  174:invokespecial   #117 <Method void ProgressWheel$1(ProgressWheel)>
	//   90  177:putfield        #119 <Field Handler spinHandler>
		progress = 0;
	//   91  180:aload_0         
	//   92  181:iconst_0        
	//   93  182:putfield        #121 <Field int progress>
		isSpinning = false;
	//   94  185:aload_0         
	//   95  186:iconst_0        
	//   96  187:putfield        #123 <Field boolean isSpinning>
		spinOnce = false;
	//   97  190:aload_0         
	//   98  191:iconst_0        
	//   99  192:putfield        #125 <Field boolean spinOnce>
		text = "";
	//  100  195:aload_0         
	//  101  196:ldc1            #127 <String "">
	//  102  198:putfield        #129 <Field String text>
		mTextBaseline = 0;
	//  103  201:aload_0         
	//  104  202:iconst_0        
	//  105  203:putfield        #131 <Field int mTextBaseline>
		isConfigured = false;
	//  106  206:aload_0         
	//  107  207:iconst_0        
	//  108  208:putfield        #133 <Field boolean isConfigured>
	//  109  211:return          
	}

	private void setupBounds()
	{
		paddingTop = getPaddingTop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #147 <Method int getPaddingTop()>
	//    3    5:putfield        #66  <Field int paddingTop>
		paddingBottom = getPaddingBottom();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method int getPaddingBottom()>
	//    7   13:putfield        #68  <Field int paddingBottom>
		paddingLeft = getPaddingLeft();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #153 <Method int getPaddingLeft()>
	//   11   21:putfield        #70  <Field int paddingLeft>
		paddingRight = getPaddingRight();
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #156 <Method int getPaddingRight()>
	//   15   29:putfield        #72  <Field int paddingRight>
		rectBounds = new RectF(paddingLeft, paddingTop, getLayoutParams().width - paddingRight, getLayoutParams().height - paddingBottom);
	//   16   32:aload_0         
	//   17   33:new             #98  <Class RectF>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #70  <Field int paddingLeft>
	//   21   41:i2f             
	//   22   42:aload_0         
	//   23   43:getfield        #66  <Field int paddingTop>
	//   24   46:i2f             
	//   25   47:aload_0         
	//   26   48:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   27   51:getfield        #165 <Field int android.view.ViewGroup$LayoutParams.width>
	//   28   54:aload_0         
	//   29   55:getfield        #72  <Field int paddingRight>
	//   30   58:isub            
	//   31   59:i2f             
	//   32   60:aload_0         
	//   33   61:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   34   64:getfield        #168 <Field int android.view.ViewGroup$LayoutParams.height>
	//   35   67:aload_0         
	//   36   68:getfield        #68  <Field int paddingBottom>
	//   37   71:isub            
	//   38   72:i2f             
	//   39   73:invokespecial   #171 <Method void RectF(float, float, float, float)>
	//   40   76:putfield        #101 <Field RectF rectBounds>
		int i = paddingLeft;
	//   41   79:aload_0         
	//   42   80:getfield        #70  <Field int paddingLeft>
	//   43   83:istore_1        
		int j = barWidth;
	//   44   84:aload_0         
	//   45   85:getfield        #60  <Field int barWidth>
	//   46   88:istore_2        
		circleBounds = new RectF(i + j, paddingTop + j, getLayoutParams().width - paddingRight - barWidth, getLayoutParams().height - paddingBottom - barWidth);
	//   47   89:aload_0         
	//   48   90:new             #98  <Class RectF>
	//   49   93:dup             
	//   50   94:iload_1         
	//   51   95:iload_2         
	//   52   96:iadd            
	//   53   97:i2f             
	//   54   98:aload_0         
	//   55   99:getfield        #66  <Field int paddingTop>
	//   56  102:iload_2         
	//   57  103:iadd            
	//   58  104:i2f             
	//   59  105:aload_0         
	//   60  106:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   61  109:getfield        #165 <Field int android.view.ViewGroup$LayoutParams.width>
	//   62  112:aload_0         
	//   63  113:getfield        #72  <Field int paddingRight>
	//   64  116:isub            
	//   65  117:aload_0         
	//   66  118:getfield        #60  <Field int barWidth>
	//   67  121:isub            
	//   68  122:i2f             
	//   69  123:aload_0         
	//   70  124:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   71  127:getfield        #168 <Field int android.view.ViewGroup$LayoutParams.height>
	//   72  130:aload_0         
	//   73  131:getfield        #68  <Field int paddingBottom>
	//   74  134:isub            
	//   75  135:aload_0         
	//   76  136:getfield        #60  <Field int barWidth>
	//   77  139:isub            
	//   78  140:i2f             
	//   79  141:invokespecial   #171 <Method void RectF(float, float, float, float)>
	//   80  144:putfield        #103 <Field RectF circleBounds>
		i = getLayoutParams().width;
	//   81  147:aload_0         
	//   82  148:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   83  151:getfield        #165 <Field int android.view.ViewGroup$LayoutParams.width>
	//   84  154:istore_1        
		j = paddingRight;
	//   85  155:aload_0         
	//   86  156:getfield        #72  <Field int paddingRight>
	//   87  159:istore_2        
		int k = barWidth;
	//   88  160:aload_0         
	//   89  161:getfield        #60  <Field int barWidth>
	//   90  164:istore_3        
		fullRadius = (i - j - k) / 2;
	//   91  165:aload_0         
	//   92  166:iload_1         
	//   93  167:iload_2         
	//   94  168:isub            
	//   95  169:iload_3         
	//   96  170:isub            
	//   97  171:iconst_2        
	//   98  172:idiv            
	//   99  173:putfield        #54  <Field int fullRadius>
		circleRadius = (fullRadius - k) + 1;
	//  100  176:aload_0         
	//  101  177:aload_0         
	//  102  178:getfield        #54  <Field int fullRadius>
	//  103  181:iload_3         
	//  104  182:isub            
	//  105  183:iconst_1        
	//  106  184:iadd            
	//  107  185:putfield        #56  <Field int circleRadius>
	//  108  188:return          
	}

	private void setupPaints()
	{
		barPaint.setColor(barColor);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Paint barPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field int barColor>
	//    4    8:invokevirtual   #176 <Method void Paint.setColor(int)>
		barPaint.setAntiAlias(true);
	//    5   11:aload_0         
	//    6   12:getfield        #90  <Field Paint barPaint>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #180 <Method void Paint.setAntiAlias(boolean)>
		barPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//    9   19:aload_0         
	//   10   20:getfield        #90  <Field Paint barPaint>
	//   11   23:getstatic       #186 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   12   26:invokevirtual   #190 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		barPaint.setStrokeWidth(barWidth);
	//   13   29:aload_0         
	//   14   30:getfield        #90  <Field Paint barPaint>
	//   15   33:aload_0         
	//   16   34:getfield        #60  <Field int barWidth>
	//   17   37:i2f             
	//   18   38:invokevirtual   #194 <Method void Paint.setStrokeWidth(float)>
		rimPaint.setColor(rimColor);
	//   19   41:aload_0         
	//   20   42:getfield        #94  <Field Paint rimPaint>
	//   21   45:aload_0         
	//   22   46:getfield        #80  <Field int rimColor>
	//   23   49:invokevirtual   #176 <Method void Paint.setColor(int)>
		rimPaint.setAntiAlias(true);
	//   24   52:aload_0         
	//   25   53:getfield        #94  <Field Paint rimPaint>
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #180 <Method void Paint.setAntiAlias(boolean)>
		rimPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   28   60:aload_0         
	//   29   61:getfield        #94  <Field Paint rimPaint>
	//   30   64:getstatic       #186 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   31   67:invokevirtual   #190 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		rimPaint.setStrokeWidth(rimWidth);
	//   32   70:aload_0         
	//   33   71:getfield        #94  <Field Paint rimPaint>
	//   34   74:aload_0         
	//   35   75:getfield        #62  <Field int rimWidth>
	//   36   78:i2f             
	//   37   79:invokevirtual   #194 <Method void Paint.setStrokeWidth(float)>
		circlePaint.setColor(circleColor);
	//   38   82:aload_0         
	//   39   83:getfield        #92  <Field Paint circlePaint>
	//   40   86:aload_0         
	//   41   87:getfield        #77  <Field int circleColor>
	//   42   90:invokevirtual   #176 <Method void Paint.setColor(int)>
		circlePaint.setAntiAlias(true);
	//   43   93:aload_0         
	//   44   94:getfield        #92  <Field Paint circlePaint>
	//   45   97:iconst_1        
	//   46   98:invokevirtual   #180 <Method void Paint.setAntiAlias(boolean)>
		circlePaint.setStyle(android.graphics.Paint.Style.FILL);
	//   47  101:aload_0         
	//   48  102:getfield        #92  <Field Paint circlePaint>
	//   49  105:getstatic       #197 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   50  108:invokevirtual   #190 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		textPaint.setColor(textColor);
	//   51  111:aload_0         
	//   52  112:getfield        #96  <Field Paint textPaint>
	//   53  115:aload_0         
	//   54  116:getfield        #83  <Field int textColor>
	//   55  119:invokevirtual   #176 <Method void Paint.setColor(int)>
		textPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   56  122:aload_0         
	//   57  123:getfield        #96  <Field Paint textPaint>
	//   58  126:getstatic       #197 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   59  129:invokevirtual   #190 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		textPaint.setAntiAlias(true);
	//   60  132:aload_0         
	//   61  133:getfield        #96  <Field Paint textPaint>
	//   62  136:iconst_1        
	//   63  137:invokevirtual   #180 <Method void Paint.setAntiAlias(boolean)>
		textPaint.setTextSize(textSize);
	//   64  140:aload_0         
	//   65  141:getfield        #96  <Field Paint textPaint>
	//   66  144:aload_0         
	//   67  145:getfield        #64  <Field int textSize>
	//   68  148:i2f             
	//   69  149:invokevirtual   #200 <Method void Paint.setTextSize(float)>
		textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   70  152:aload_0         
	//   71  153:getfield        #96  <Field Paint textPaint>
	//   72  156:getstatic       #206 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   73  159:invokevirtual   #210 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		textPaint.setTypeface(typeface);
	//   74  162:aload_0         
	//   75  163:getfield        #96  <Field Paint textPaint>
	//   76  166:aload_0         
	//   77  167:getfield        #110 <Field Typeface typeface>
	//   78  170:invokevirtual   #214 <Method Typeface Paint.setTypeface(Typeface)>
	//   79  173:pop             
	//   80  174:return          
	}

	void adjustTextScale()
	{
		textPaint.setTextScaleX(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Paint textPaint>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #218 <Method void Paint.setTextScaleX(float)>
		Rect rect = new Rect();
	//    4    8:new             #220 <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #221 <Method void Rect()>
	//    7   15:astore_3        
		Paint paint = textPaint;
	//    8   16:aload_0         
	//    9   17:getfield        #96  <Field Paint textPaint>
	//   10   20:astore          4
		String s = text;
	//   11   22:aload_0         
	//   12   23:getfield        #129 <Field String text>
	//   13   26:astore          5
		paint.getTextBounds(s, 0, s.length(), rect);
	//   14   28:aload           4
	//   15   30:aload           5
	//   16   32:iconst_0        
	//   17   33:aload           5
	//   18   35:invokevirtual   #226 <Method int String.length()>
	//   19   38:aload_3         
	//   20   39:invokevirtual   #230 <Method void Paint.getTextBounds(String, int, int, Rect)>
		int i = rect.right;
	//   21   42:aload_3         
	//   22   43:getfield        #233 <Field int Rect.right>
	//   23   46:istore_1        
		i = rect.left;
	//   24   47:aload_3         
	//   25   48:getfield        #236 <Field int Rect.left>
	//   26   51:istore_1        
		i = rect.bottom;
	//   27   52:aload_3         
	//   28   53:getfield        #239 <Field int Rect.bottom>
	//   29   56:istore_1        
		int j = rect.top;
	//   30   57:aload_3         
	//   31   58:getfield        #242 <Field int Rect.top>
	//   32   61:istore_2        
		mTextBaseline = rect.bottom + (mViewHeight - (i - j)) / 2;
	//   33   62:aload_0         
	//   34   63:aload_3         
	//   35   64:getfield        #239 <Field int Rect.bottom>
	//   36   67:aload_0         
	//   37   68:getfield        #244 <Field int mViewHeight>
	//   38   71:iload_1         
	//   39   72:iload_2         
	//   40   73:isub            
	//   41   74:isub            
	//   42   75:iconst_2        
	//   43   76:idiv            
	//   44   77:iadd            
	//   45   78:putfield        #131 <Field int mTextBaseline>
	//   46   81:return          
	}

	void adjustTextSize()
	{
		textPaint.setTextSize(100F);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Paint textPaint>
	//    2    4:ldc1            #246 <Float 100F>
	//    3    6:invokevirtual   #200 <Method void Paint.setTextSize(float)>
		textPaint.setTextScaleX(1.0F);
	//    4    9:aload_0         
	//    5   10:getfield        #96  <Field Paint textPaint>
	//    6   13:fconst_1        
	//    7   14:invokevirtual   #218 <Method void Paint.setTextScaleX(float)>
		Rect rect = new Rect();
	//    8   17:new             #220 <Class Rect>
	//    9   20:dup             
	//   10   21:invokespecial   #221 <Method void Rect()>
	//   11   24:astore          4
		Paint paint = textPaint;
	//   12   26:aload_0         
	//   13   27:getfield        #96  <Field Paint textPaint>
	//   14   30:astore          5
		String s = text;
	//   15   32:aload_0         
	//   16   33:getfield        #129 <Field String text>
	//   17   36:astore          6
		paint.getTextBounds(s, 0, s.length(), rect);
	//   18   38:aload           5
	//   19   40:aload           6
	//   20   42:iconst_0        
	//   21   43:aload           6
	//   22   45:invokevirtual   #226 <Method int String.length()>
	//   23   48:aload           4
	//   24   50:invokevirtual   #230 <Method void Paint.getTextBounds(String, int, int, Rect)>
		int i = rect.bottom;
	//   25   53:aload           4
	//   26   55:getfield        #239 <Field int Rect.bottom>
	//   27   58:istore_2        
		int j = rect.top;
	//   28   59:aload           4
	//   29   61:getfield        #242 <Field int Rect.top>
	//   30   64:istore_3        
		float f = ((float)mViewHeight * 0.4F) / (float)(i - j);
	//   31   65:aload_0         
	//   32   66:getfield        #244 <Field int mViewHeight>
	//   33   69:i2f             
	//   34   70:ldc1            #247 <Float 0.4F>
	//   35   72:fmul            
	//   36   73:iload_2         
	//   37   74:iload_3         
	//   38   75:isub            
	//   39   76:i2f             
	//   40   77:fdiv            
	//   41   78:fstore_1        
		textPaint.setTextSize(f * 100F);
	//   42   79:aload_0         
	//   43   80:getfield        #96  <Field Paint textPaint>
	//   44   83:fload_1         
	//   45   84:ldc1            #246 <Float 100F>
	//   46   86:fmul            
	//   47   87:invokevirtual   #200 <Method void Paint.setTextSize(float)>
	//   48   90:return          
	}

	public int getBarColor()
	{
		return barColor;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int barColor>
	//    2    4:ireturn         
	}

	public int getBarLength()
	{
		return barLength;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int barLength>
	//    2    4:ireturn         
	}

	public int getBarWidth()
	{
		return barWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int barWidth>
	//    2    4:ireturn         
	}

	public int getCircleColor()
	{
		return circleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int circleColor>
	//    2    4:ireturn         
	}

	public int getCircleRadius()
	{
		return circleRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int circleRadius>
	//    2    4:ireturn         
	}

	public int getDelayMillis()
	{
		return delayMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int delayMillis>
	//    2    4:ireturn         
	}

	public int getPaddingBottom()
	{
		return paddingBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int paddingBottom>
	//    2    4:ireturn         
	}

	public int getPaddingLeft()
	{
		return paddingLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int paddingLeft>
	//    2    4:ireturn         
	}

	public int getPaddingRight()
	{
		return paddingRight;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int paddingRight>
	//    2    4:ireturn         
	}

	public int getPaddingTop()
	{
		return paddingTop;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int paddingTop>
	//    2    4:ireturn         
	}

	public int getRimColor()
	{
		return rimColor;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int rimColor>
	//    2    4:ireturn         
	}

	public Shader getRimShader()
	{
		return rimPaint.getShader();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Paint rimPaint>
	//    2    4:invokevirtual   #259 <Method Shader Paint.getShader()>
	//    3    7:areturn         
	}

	public int getRimWidth()
	{
		return rimWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int rimWidth>
	//    2    4:ireturn         
	}

	public int getSpinSpeed()
	{
		return spinSpeed;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int spinSpeed>
	//    2    4:ireturn         
	}

	public int getTextColor()
	{
		return textColor;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int textColor>
	//    2    4:ireturn         
	}

	public int getTextSize()
	{
		return textSize;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int textSize>
	//    2    4:ireturn         
	}

	public Typeface getTypeface()
	{
		return typeface;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Typeface typeface>
	//    2    4:areturn         
	}

	public void incrementProgress()
	{
		isSpinning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #123 <Field boolean isSpinning>
		progress = progress + 1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #121 <Field int progress>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #121 <Field int progress>
		StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #268 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #269 <Method void StringBuilder()>
	//   12   22:astore_1        
		stringbuilder.append(Math.round(((float)progress / 360F) * 100F));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #121 <Field int progress>
	//   16   28:i2f             
	//   17   29:ldc2            #270 <Float 360F>
	//   18   32:fdiv            
	//   19   33:ldc1            #246 <Float 100F>
	//   20   35:fmul            
	//   21   36:invokestatic    #276 <Method int Math.round(float)>
	//   22   39:invokevirtual   #280 <Method StringBuilder StringBuilder.append(int)>
	//   23   42:pop             
		stringbuilder.append("%");
	//   24   43:aload_1         
	//   25   44:ldc2            #282 <String "%">
	//   26   47:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		setText(stringbuilder.toString());
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   31   56:invokevirtual   #293 <Method void setText(String)>
		spinHandler.sendEmptyMessage(0);
	//   32   59:aload_0         
	//   33   60:getfield        #119 <Field Handler spinHandler>
	//   34   63:iconst_0        
	//   35   64:invokevirtual   #299 <Method boolean Handler.sendEmptyMessage(int)>
	//   36   67:pop             
	//   37   68:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void View.onAttachedToWindow()>
		if(!isConfigured)
	//*   2    4:aload_0         
	//*   3    5:getfield        #133 <Field boolean isConfigured>
	//*   4    8:ifne            28
		{
			setupBounds();
	//    5   11:aload_0         
	//    6   12:invokespecial   #304 <Method void setupBounds()>
			setupPaints();
	//    7   15:aload_0         
	//    8   16:invokespecial   #306 <Method void setupPaints()>
			invalidate();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #309 <Method void invalidate()>
			isConfigured = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #133 <Field boolean isConfigured>
		}
	//   14   28:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #313 <Method void View.onDraw(Canvas)>
		canvas.drawArc(circleBounds, 360F, 360F, false, rimPaint);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #103 <Field RectF circleBounds>
	//    6   10:ldc2            #270 <Float 360F>
	//    7   13:ldc2            #270 <Float 360F>
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:getfield        #94  <Field Paint rimPaint>
	//   11   21:invokevirtual   #319 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		if(isSpinning && !spinOnce)
	//*  12   24:aload_0         
	//*  13   25:getfield        #123 <Field boolean isSpinning>
	//*  14   28:ifeq            67
	//*  15   31:aload_0         
	//*  16   32:getfield        #125 <Field boolean spinOnce>
	//*  17   35:ifne            67
			canvas.drawArc(circleBounds, progress - 90, barLength, false, barPaint);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #103 <Field RectF circleBounds>
	//   21   43:aload_0         
	//   22   44:getfield        #121 <Field int progress>
	//   23   47:bipush          90
	//   24   49:isub            
	//   25   50:i2f             
	//   26   51:aload_0         
	//   27   52:getfield        #58  <Field int barLength>
	//   28   55:i2f             
	//   29   56:iconst_0        
	//   30   57:aload_0         
	//   31   58:getfield        #90  <Field Paint barPaint>
	//   32   61:invokevirtual   #319 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		else
	//*  33   64:goto            88
			canvas.drawArc(circleBounds, -90F, progress, false, barPaint);
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:getfield        #103 <Field RectF circleBounds>
	//   37   72:ldc2            #320 <Float -90F>
	//   38   75:aload_0         
	//   39   76:getfield        #121 <Field int progress>
	//   40   79:i2f             
	//   41   80:iconst_0        
	//   42   81:aload_0         
	//   43   82:getfield        #90  <Field Paint barPaint>
	//   44   85:invokevirtual   #319 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		canvas.drawCircle(circleBounds.width() / 2.0F + (float)rimWidth + (float)paddingLeft, circleBounds.height() / 2.0F + (float)rimWidth + (float)paddingTop, circleRadius, circlePaint);
	//   45   88:aload_1         
	//   46   89:aload_0         
	//   47   90:getfield        #103 <Field RectF circleBounds>
	//   48   93:invokevirtual   #323 <Method float RectF.width()>
	//   49   96:fconst_2        
	//   50   97:fdiv            
	//   51   98:aload_0         
	//   52   99:getfield        #62  <Field int rimWidth>
	//   53  102:i2f             
	//   54  103:fadd            
	//   55  104:aload_0         
	//   56  105:getfield        #70  <Field int paddingLeft>
	//   57  108:i2f             
	//   58  109:fadd            
	//   59  110:aload_0         
	//   60  111:getfield        #103 <Field RectF circleBounds>
	//   61  114:invokevirtual   #325 <Method float RectF.height()>
	//   62  117:fconst_2        
	//   63  118:fdiv            
	//   64  119:aload_0         
	//   65  120:getfield        #62  <Field int rimWidth>
	//   66  123:i2f             
	//   67  124:fadd            
	//   68  125:aload_0         
	//   69  126:getfield        #66  <Field int paddingTop>
	//   70  129:i2f             
	//   71  130:fadd            
	//   72  131:aload_0         
	//   73  132:getfield        #56  <Field int circleRadius>
	//   74  135:i2f             
	//   75  136:aload_0         
	//   76  137:getfield        #92  <Field Paint circlePaint>
	//   77  140:invokevirtual   #329 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawText(text, mViewWidth / 2, mViewHeight - mTextBaseline, textPaint);
	//   78  143:aload_1         
	//   79  144:aload_0         
	//   80  145:getfield        #129 <Field String text>
	//   81  148:aload_0         
	//   82  149:getfield        #331 <Field int mViewWidth>
	//   83  152:iconst_2        
	//   84  153:idiv            
	//   85  154:i2f             
	//   86  155:aload_0         
	//   87  156:getfield        #244 <Field int mViewHeight>
	//   88  159:aload_0         
	//   89  160:getfield        #131 <Field int mTextBaseline>
	//   90  163:isub            
	//   91  164:i2f             
	//   92  165:aload_0         
	//   93  166:getfield        #96  <Field Paint textPaint>
	//   94  169:invokevirtual   #335 <Method void Canvas.drawText(String, float, float, Paint)>
	//   95  172:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #339 <Method void View.onSizeChanged(int, int, int, int)>
		mViewWidth = i;
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:putfield        #331 <Field int mViewWidth>
		mViewHeight = j;
	//    9   14:aload_0         
	//   10   15:iload_2         
	//   11   16:putfield        #244 <Field int mViewHeight>
		if(text.equals(""))
	//*  12   19:aload_0         
	//*  13   20:getfield        #129 <Field String text>
	//*  14   23:ldc1            #127 <String "">
	//*  15   25:invokevirtual   #343 <Method boolean String.equals(Object)>
	//*  16   28:ifeq            32
		{
			return;
	//   17   31:return          
		} else
		{
			adjustTextSize();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #345 <Method void adjustTextSize()>
			adjustTextScale();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #347 <Method void adjustTextScale()>
			return;
	//   22   40:return          
		}
	}

	public void resetCount()
	{
		progress = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #121 <Field int progress>
		setText("0%");
	//    3    5:aload_0         
	//    4    6:ldc2            #350 <String "0%">
	//    5    9:invokevirtual   #293 <Method void setText(String)>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #309 <Method void invalidate()>
	//    8   16:return          
	}

	public void setBarColor(int i)
	{
		barColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field int barColor>
	//    3    5:return          
	}

	public void setBarLength(int i)
	{
		barLength = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int barLength>
	//    3    5:return          
	}

	public void setBarWidth(int i)
	{
		barWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int barWidth>
	//    3    5:return          
	}

	public void setCircleColor(int i)
	{
		circleColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int circleColor>
	//    3    5:return          
	}

	public void setCircleRadius(int i)
	{
		circleRadius = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int circleRadius>
	//    3    5:return          
	}

	public void setDelayMillis(int i)
	{
		delayMillis = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field int delayMillis>
	//    3    5:return          
	}

	public void setPaddingBottom(int i)
	{
		paddingBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int paddingBottom>
	//    3    5:return          
	}

	public void setPaddingLeft(int i)
	{
		paddingLeft = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int paddingLeft>
	//    3    5:return          
	}

	public void setPaddingRight(int i)
	{
		paddingRight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int paddingRight>
	//    3    5:return          
	}

	public void setPaddingTop(int i)
	{
		paddingTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int paddingTop>
	//    3    5:return          
	}

	public void setProgress(int i)
	{
		isSpinning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #123 <Field boolean isSpinning>
		progress = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #121 <Field int progress>
		spinHandler.sendEmptyMessage(0);
	//    6   10:aload_0         
	//    7   11:getfield        #119 <Field Handler spinHandler>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #299 <Method boolean Handler.sendEmptyMessage(int)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void setRimColor(int i)
	{
		rimColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field int rimColor>
	//    3    5:return          
	}

	public void setRimShader(Shader shader)
	{
		rimPaint.setShader(shader);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Paint rimPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #368 <Method Shader Paint.setShader(Shader)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setRimWidth(int i)
	{
		rimWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int rimWidth>
	//    3    5:return          
	}

	public void setSpinSpeed(int i)
	{
		spinSpeed = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field int spinSpeed>
	//    3    5:return          
	}

	public void setText(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field String text>
		postInvalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #373 <Method void postInvalidate()>
	//    5    9:return          
	}

	public void setTextColor(int i)
	{
		textColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field int textColor>
	//    3    5:return          
	}

	public void setTextSize(int i)
	{
		textSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int textSize>
	//    3    5:return          
	}

	public void setTypeface(Typeface typeface1)
	{
		typeface = typeface1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field Typeface typeface>
	//    3    5:return          
	}

	public void spin()
	{
		isSpinning = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #123 <Field boolean isSpinning>
		spinHandler.sendEmptyMessage(0);
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field Handler spinHandler>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #299 <Method boolean Handler.sendEmptyMessage(int)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void spinOnce()
	{
		isSpinning = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #123 <Field boolean isSpinning>
		spinOnce = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #125 <Field boolean spinOnce>
		spinHandler.sendEmptyMessage(0);
	//    6   10:aload_0         
	//    7   11:getfield        #119 <Field Handler spinHandler>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #299 <Method boolean Handler.sendEmptyMessage(int)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void stopSpinning()
	{
		isSpinning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #123 <Field boolean isSpinning>
		progress = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #121 <Field int progress>
		spinHandler.removeMessages(0);
	//    6   10:aload_0         
	//    7   11:getfield        #119 <Field Handler spinHandler>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #380 <Method void Handler.removeMessages(int)>
	//   10   18:return          
	}

	private int barColor;
	private int barLength;
	private Paint barPaint;
	private int barWidth;
	private RectF circleBounds;
	private int circleColor;
	private Paint circlePaint;
	private int circleRadius;
	private int delayMillis;
	private int fullRadius;
	private boolean isConfigured;
	boolean isSpinning;
	private int mTextBaseline;
	private int mViewHeight;
	private int mViewWidth;
	private int paddingBottom;
	private int paddingLeft;
	private int paddingRight;
	private int paddingTop;
	int progress;
	private RectF rectBounds;
	private int rimColor;
	private Paint rimPaint;
	private int rimWidth;
	private Handler spinHandler = new Handler() {

		public void handleMessage(Message message)
		{
			invalidate();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ProgressWheel this$0>
		//    2    4:invokevirtual   #21  <Method void ProgressWheel.invalidate()>
			if(isSpinning)
		//*   3    7:aload_0         
		//*   4    8:getfield        #12  <Field ProgressWheel this$0>
		//*   5   11:getfield        #25  <Field boolean ProgressWheel.isSpinning>
		//*   6   14:ifeq            103
			{
				message = ((Message) (ProgressWheel.this));
		//    7   17:aload_0         
		//    8   18:getfield        #12  <Field ProgressWheel this$0>
		//    9   21:astore_1        
				message.progress = ((ProgressWheel) (message)).progress + spinSpeed;
		//   10   22:aload_1         
		//   11   23:aload_1         
		//   12   24:getfield        #29  <Field int ProgressWheel.progress>
		//   13   27:aload_0         
		//   14   28:getfield        #12  <Field ProgressWheel this$0>
		//   15   31:invokestatic    #33  <Method int ProgressWheel.access$000(ProgressWheel)>
		//   16   34:iadd            
		//   17   35:putfield        #29  <Field int ProgressWheel.progress>
				if(spinOnce && progress >= 360)
		//*  18   38:aload_0         
		//*  19   39:getfield        #12  <Field ProgressWheel this$0>
		//*  20   42:getfield        #36  <Field boolean ProgressWheel.spinOnce>
		//*  21   45:ifeq            62
		//*  22   48:aload_0         
		//*  23   49:getfield        #12  <Field ProgressWheel this$0>
		//*  24   52:getfield        #29  <Field int ProgressWheel.progress>
		//*  25   55:sipush          360
		//*  26   58:icmplt          62
					return;
		//   27   61:return          
				if(progress > 360)
		//*  28   62:aload_0         
		//*  29   63:getfield        #12  <Field ProgressWheel this$0>
		//*  30   66:getfield        #29  <Field int ProgressWheel.progress>
		//*  31   69:sipush          360
		//*  32   72:icmple          83
					progress = 0;
		//   33   75:aload_0         
		//   34   76:getfield        #12  <Field ProgressWheel this$0>
		//   35   79:iconst_0        
		//   36   80:putfield        #29  <Field int ProgressWheel.progress>
				spinHandler.sendEmptyMessageDelayed(0, delayMillis);
		//   37   83:aload_0         
		//   38   84:getfield        #12  <Field ProgressWheel this$0>
		//   39   87:invokestatic    #40  <Method Handler ProgressWheel.access$200(ProgressWheel)>
		//   40   90:iconst_0        
		//   41   91:aload_0         
		//   42   92:getfield        #12  <Field ProgressWheel this$0>
		//   43   95:invokestatic    #43  <Method int ProgressWheel.access$100(ProgressWheel)>
		//   44   98:i2l             
		//   45   99:invokevirtual   #47  <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
		//   46  102:pop             
			}
		//   47  103:return          
		}

		final ProgressWheel this$0;

			
			{
				this$0 = ProgressWheel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ProgressWheel this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Handler()>
			//    5    9:return          
			}
	}
;
	boolean spinOnce;
	private int spinSpeed;
	private String text;
	private int textColor;
	private Paint textPaint;
	private int textSize;
	private Typeface typeface;


/*
	static int access$000(ProgressWheel progresswheel)
	{
		return progresswheel.spinSpeed;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int spinSpeed>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(ProgressWheel progresswheel)
	{
		return progresswheel.delayMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int delayMillis>
	//    2    4:ireturn         
	}

*/


/*
	static Handler access$200(ProgressWheel progresswheel)
	{
		return progresswheel.spinHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Handler spinHandler>
	//    2    4:areturn         
	}

*/
}
