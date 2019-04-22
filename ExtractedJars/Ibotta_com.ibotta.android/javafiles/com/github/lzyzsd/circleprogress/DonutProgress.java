// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.lzyzsd.circleprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;

// Referenced classes of package com.github.lzyzsd.circleprogress:
//			Utils

public class DonutProgress extends View
{

	public DonutProgress(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #53  <Method void DonutProgress(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DonutProgress(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #55  <Method void View(Context, AttributeSet, int)>
		finishedOuterRect = new RectF();
	//    5    7:aload_0         
	//    6    8:new             #57  <Class RectF>
	//    7   11:dup             
	//    8   12:invokespecial   #60  <Method void RectF()>
	//    9   15:putfield        #62  <Field RectF finishedOuterRect>
		unfinishedOuterRect = new RectF();
	//   10   18:aload_0         
	//   11   19:new             #57  <Class RectF>
	//   12   22:dup             
	//   13   23:invokespecial   #60  <Method void RectF()>
	//   14   26:putfield        #64  <Field RectF unfinishedOuterRect>
		attributeResourceId = 0;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #66  <Field int attributeResourceId>
		progress = 0.0F;
	//   18   34:aload_0         
	//   19   35:fconst_0        
	//   20   36:putfield        #68  <Field float progress>
		prefixText = "";
	//   21   39:aload_0         
	//   22   40:ldc1            #70  <String "">
	//   23   42:putfield        #72  <Field String prefixText>
		suffixText = "%";
	//   24   45:aload_0         
	//   25   46:ldc1            #74  <String "%">
	//   26   48:putfield        #76  <Field String suffixText>
		text = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #78  <Field String text>
		default_finished_color = Color.rgb(66, 145, 241);
	//   30   56:aload_0         
	//   31   57:bipush          66
	//   32   59:sipush          145
	//   33   62:sipush          241
	//   34   65:invokestatic    #84  <Method int Color.rgb(int, int, int)>
	//   35   68:putfield        #86  <Field int default_finished_color>
		default_unfinished_color = Color.rgb(204, 204, 204);
	//   36   71:aload_0         
	//   37   72:sipush          204
	//   38   75:sipush          204
	//   39   78:sipush          204
	//   40   81:invokestatic    #84  <Method int Color.rgb(int, int, int)>
	//   41   84:putfield        #88  <Field int default_unfinished_color>
		default_text_color = Color.rgb(66, 145, 241);
	//   42   87:aload_0         
	//   43   88:bipush          66
	//   44   90:sipush          145
	//   45   93:sipush          241
	//   46   96:invokestatic    #84  <Method int Color.rgb(int, int, int)>
	//   47   99:putfield        #90  <Field int default_text_color>
		default_inner_bottom_text_color = Color.rgb(66, 145, 241);
	//   48  102:aload_0         
	//   49  103:bipush          66
	//   50  105:sipush          145
	//   51  108:sipush          241
	//   52  111:invokestatic    #84  <Method int Color.rgb(int, int, int)>
	//   53  114:putfield        #92  <Field int default_inner_bottom_text_color>
		default_inner_background_color = 0;
	//   54  117:aload_0         
	//   55  118:iconst_0        
	//   56  119:putfield        #94  <Field int default_inner_background_color>
		default_max = 100;
	//   57  122:aload_0         
	//   58  123:bipush          100
	//   59  125:putfield        #96  <Field int default_max>
		default_startingDegree = 0;
	//   60  128:aload_0         
	//   61  129:iconst_0        
	//   62  130:putfield        #98  <Field int default_startingDegree>
		default_text_size = Utils.sp2px(getResources(), 18F);
	//   63  133:aload_0         
	//   64  134:aload_0         
	//   65  135:invokevirtual   #102 <Method android.content.res.Resources getResources()>
	//   66  138:ldc1            #103 <Float 18F>
	//   67  140:invokestatic    #109 <Method float Utils.sp2px(android.content.res.Resources, float)>
	//   68  143:putfield        #111 <Field float default_text_size>
		min_size = (int)Utils.dp2px(getResources(), 100F);
	//   69  146:aload_0         
	//   70  147:aload_0         
	//   71  148:invokevirtual   #102 <Method android.content.res.Resources getResources()>
	//   72  151:ldc1            #112 <Float 100F>
	//   73  153:invokestatic    #115 <Method float Utils.dp2px(android.content.res.Resources, float)>
	//   74  156:f2i             
	//   75  157:putfield        #117 <Field int min_size>
		default_stroke_width = Utils.dp2px(getResources(), 10F);
	//   76  160:aload_0         
	//   77  161:aload_0         
	//   78  162:invokevirtual   #102 <Method android.content.res.Resources getResources()>
	//   79  165:ldc1            #118 <Float 10F>
	//   80  167:invokestatic    #115 <Method float Utils.dp2px(android.content.res.Resources, float)>
	//   81  170:putfield        #120 <Field float default_stroke_width>
		default_inner_bottom_text_size = Utils.sp2px(getResources(), 18F);
	//   82  173:aload_0         
	//   83  174:aload_0         
	//   84  175:invokevirtual   #102 <Method android.content.res.Resources getResources()>
	//   85  178:ldc1            #103 <Float 18F>
	//   86  180:invokestatic    #109 <Method float Utils.sp2px(android.content.res.Resources, float)>
	//   87  183:putfield        #122 <Field float default_inner_bottom_text_size>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, R.styleable.DonutProgress, i, 0)));
	//   88  186:aload_1         
	//   89  187:invokevirtual   #128 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   90  190:aload_2         
	//   91  191:getstatic       #134 <Field int[] R$styleable.DonutProgress>
	//   92  194:iload_3         
	//   93  195:iconst_0        
	//   94  196:invokevirtual   #140 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   95  199:astore_1        
		initByAttributes(((TypedArray) (context)));
	//   96  200:aload_0         
	//   97  201:aload_1         
	//   98  202:invokevirtual   #144 <Method void initByAttributes(TypedArray)>
		((TypedArray) (context)).recycle();
	//   99  205:aload_1         
	//  100  206:invokevirtual   #149 <Method void TypedArray.recycle()>
		initPainters();
	//  101  209:aload_0         
	//  102  210:invokevirtual   #152 <Method void initPainters()>
	//  103  213:return          
	}

	private float getProgressAngle()
	{
		return (getProgress() / (float)max) * 360F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method float getProgress()>
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field int max>
	//    4    8:i2f             
	//    5    9:fdiv            
	//    6   10:ldc1            #160 <Float 360F>
	//    7   12:fmul            
	//    8   13:freturn         
	}

	private int measure(int i)
	{
		int j = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #167 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    5:iload_1         
	//    4    6:invokestatic    #170 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		if(j == 0x40000000)
	//*   6   10:iload_2         
	//*   7   11:ldc1            #171 <Int 0x40000000>
	//*   8   13:icmpne          18
			return i;
	//    9   16:iload_1         
	//   10   17:ireturn         
		int k = min_size;
	//   11   18:aload_0         
	//   12   19:getfield        #117 <Field int min_size>
	//   13   22:istore_3        
		if(j == 0x80000000)
	//*  14   23:iload_2         
	//*  15   24:ldc1            #172 <Int 0x80000000>
	//*  16   26:icmpne          35
			return Math.min(k, i);
	//   17   29:iload_3         
	//   18   30:iload_1         
	//   19   31:invokestatic    #178 <Method int Math.min(int, int)>
	//   20   34:ireturn         
		else
			return k;
	//   21   35:iload_3         
	//   22   36:ireturn         
	}

	public int getAttributeResourceId()
	{
		return attributeResourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int attributeResourceId>
	//    2    4:ireturn         
	}

	public int getFinishedStrokeColor()
	{
		return finishedStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field int finishedStrokeColor>
	//    2    4:ireturn         
	}

	public float getFinishedStrokeWidth()
	{
		return finishedStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field float finishedStrokeWidth>
	//    2    4:freturn         
	}

	public int getInnerBackgroundColor()
	{
		return innerBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int innerBackgroundColor>
	//    2    4:ireturn         
	}

	public String getInnerBottomText()
	{
		return innerBottomText;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field String innerBottomText>
	//    2    4:areturn         
	}

	public int getInnerBottomTextColor()
	{
		return innerBottomTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field int innerBottomTextColor>
	//    2    4:ireturn         
	}

	public float getInnerBottomTextSize()
	{
		return innerBottomTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field float innerBottomTextSize>
	//    2    4:freturn         
	}

	public int getMax()
	{
		return max;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field int max>
	//    2    4:ireturn         
	}

	public String getPrefixText()
	{
		return prefixText;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String prefixText>
	//    2    4:areturn         
	}

	public float getProgress()
	{
		return progress;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field float progress>
	//    2    4:freturn         
	}

	public int getStartingDegree()
	{
		return startingDegree;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field int startingDegree>
	//    2    4:ireturn         
	}

	public String getSuffixText()
	{
		return suffixText;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String suffixText>
	//    2    4:areturn         
	}

	public String getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String text>
	//    2    4:areturn         
	}

	public int getTextColor()
	{
		return textColor;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field int textColor>
	//    2    4:ireturn         
	}

	public float getTextSize()
	{
		return textSize;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field float textSize>
	//    2    4:freturn         
	}

	public int getUnfinishedStrokeColor()
	{
		return unfinishedStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field int unfinishedStrokeColor>
	//    2    4:ireturn         
	}

	public float getUnfinishedStrokeWidth()
	{
		return unfinishedStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field float unfinishedStrokeWidth>
	//    2    4:freturn         
	}

	protected void initByAttributes(TypedArray typedarray)
	{
		finishedStrokeColor = typedarray.getColor(R.styleable.DonutProgress_donut_finished_color, default_finished_color);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #221 <Field int R$styleable.DonutProgress_donut_finished_color>
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field int default_finished_color>
	//    5    9:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//    6   12:putfield        #183 <Field int finishedStrokeColor>
		unfinishedStrokeColor = typedarray.getColor(R.styleable.DonutProgress_donut_unfinished_color, default_unfinished_color);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #227 <Field int R$styleable.DonutProgress_donut_unfinished_color>
	//   10   20:aload_0         
	//   11   21:getfield        #88  <Field int default_unfinished_color>
	//   12   24:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//   13   27:putfield        #215 <Field int unfinishedStrokeColor>
		showText = typedarray.getBoolean(R.styleable.DonutProgress_donut_show_text, true);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getstatic       #230 <Field int R$styleable.DonutProgress_donut_show_text>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #234 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   19   39:putfield        #236 <Field boolean showText>
		attributeResourceId = typedarray.getResourceId(R.styleable.DonutProgress_donut_inner_drawable, 0);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getstatic       #239 <Field int R$styleable.DonutProgress_donut_inner_drawable>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #242 <Method int TypedArray.getResourceId(int, int)>
	//   25   51:putfield        #66  <Field int attributeResourceId>
		setMax(typedarray.getInt(R.styleable.DonutProgress_donut_max, 100));
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:getstatic       #245 <Field int R$styleable.DonutProgress_donut_max>
	//   29   59:bipush          100
	//   30   61:invokevirtual   #248 <Method int TypedArray.getInt(int, int)>
	//   31   64:invokevirtual   #252 <Method void setMax(int)>
		setProgress(typedarray.getFloat(R.styleable.DonutProgress_donut_progress, 0.0F));
	//   32   67:aload_0         
	//   33   68:aload_1         
	//   34   69:getstatic       #255 <Field int R$styleable.DonutProgress_donut_progress>
	//   35   72:fconst_0        
	//   36   73:invokevirtual   #259 <Method float TypedArray.getFloat(int, float)>
	//   37   76:invokevirtual   #263 <Method void setProgress(float)>
		finishedStrokeWidth = typedarray.getDimension(R.styleable.DonutProgress_donut_finished_stroke_width, default_stroke_width);
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:getstatic       #266 <Field int R$styleable.DonutProgress_donut_finished_stroke_width>
	//   41   84:aload_0         
	//   42   85:getfield        #120 <Field float default_stroke_width>
	//   43   88:invokevirtual   #269 <Method float TypedArray.getDimension(int, float)>
	//   44   91:putfield        #186 <Field float finishedStrokeWidth>
		unfinishedStrokeWidth = typedarray.getDimension(R.styleable.DonutProgress_donut_unfinished_stroke_width, default_stroke_width);
	//   45   94:aload_0         
	//   46   95:aload_1         
	//   47   96:getstatic       #272 <Field int R$styleable.DonutProgress_donut_unfinished_stroke_width>
	//   48   99:aload_0         
	//   49  100:getfield        #120 <Field float default_stroke_width>
	//   50  103:invokevirtual   #269 <Method float TypedArray.getDimension(int, float)>
	//   51  106:putfield        #218 <Field float unfinishedStrokeWidth>
		if(showText)
	//*  52  109:aload_0         
	//*  53  110:getfield        #236 <Field boolean showText>
	//*  54  113:ifeq            250
		{
			if(typedarray.getString(R.styleable.DonutProgress_donut_prefix_text) != null)
	//*  55  116:aload_1         
	//*  56  117:getstatic       #275 <Field int R$styleable.DonutProgress_donut_prefix_text>
	//*  57  120:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//*  58  123:ifnull          137
				prefixText = typedarray.getString(R.styleable.DonutProgress_donut_prefix_text);
	//   59  126:aload_0         
	//   60  127:aload_1         
	//   61  128:getstatic       #275 <Field int R$styleable.DonutProgress_donut_prefix_text>
	//   62  131:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//   63  134:putfield        #72  <Field String prefixText>
			if(typedarray.getString(R.styleable.DonutProgress_donut_suffix_text) != null)
	//*  64  137:aload_1         
	//*  65  138:getstatic       #282 <Field int R$styleable.DonutProgress_donut_suffix_text>
	//*  66  141:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//*  67  144:ifnull          158
				suffixText = typedarray.getString(R.styleable.DonutProgress_donut_suffix_text);
	//   68  147:aload_0         
	//   69  148:aload_1         
	//   70  149:getstatic       #282 <Field int R$styleable.DonutProgress_donut_suffix_text>
	//   71  152:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//   72  155:putfield        #76  <Field String suffixText>
			if(typedarray.getString(R.styleable.DonutProgress_donut_text) != null)
	//*  73  158:aload_1         
	//*  74  159:getstatic       #285 <Field int R$styleable.DonutProgress_donut_text>
	//*  75  162:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//*  76  165:ifnull          179
				text = typedarray.getString(R.styleable.DonutProgress_donut_text);
	//   77  168:aload_0         
	//   78  169:aload_1         
	//   79  170:getstatic       #285 <Field int R$styleable.DonutProgress_donut_text>
	//   80  173:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//   81  176:putfield        #78  <Field String text>
			textColor = typedarray.getColor(R.styleable.DonutProgress_donut_text_color, default_text_color);
	//   82  179:aload_0         
	//   83  180:aload_1         
	//   84  181:getstatic       #288 <Field int R$styleable.DonutProgress_donut_text_color>
	//   85  184:aload_0         
	//   86  185:getfield        #90  <Field int default_text_color>
	//   87  188:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//   88  191:putfield        #209 <Field int textColor>
			textSize = typedarray.getDimension(R.styleable.DonutProgress_donut_text_size, default_text_size);
	//   89  194:aload_0         
	//   90  195:aload_1         
	//   91  196:getstatic       #291 <Field int R$styleable.DonutProgress_donut_text_size>
	//   92  199:aload_0         
	//   93  200:getfield        #111 <Field float default_text_size>
	//   94  203:invokevirtual   #269 <Method float TypedArray.getDimension(int, float)>
	//   95  206:putfield        #212 <Field float textSize>
			innerBottomTextSize = typedarray.getDimension(R.styleable.DonutProgress_donut_inner_bottom_text_size, default_inner_bottom_text_size);
	//   96  209:aload_0         
	//   97  210:aload_1         
	//   98  211:getstatic       #294 <Field int R$styleable.DonutProgress_donut_inner_bottom_text_size>
	//   99  214:aload_0         
	//  100  215:getfield        #122 <Field float default_inner_bottom_text_size>
	//  101  218:invokevirtual   #269 <Method float TypedArray.getDimension(int, float)>
	//  102  221:putfield        #199 <Field float innerBottomTextSize>
			innerBottomTextColor = typedarray.getColor(R.styleable.DonutProgress_donut_inner_bottom_text_color, default_inner_bottom_text_color);
	//  103  224:aload_0         
	//  104  225:aload_1         
	//  105  226:getstatic       #297 <Field int R$styleable.DonutProgress_donut_inner_bottom_text_color>
	//  106  229:aload_0         
	//  107  230:getfield        #92  <Field int default_inner_bottom_text_color>
	//  108  233:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//  109  236:putfield        #196 <Field int innerBottomTextColor>
			innerBottomText = typedarray.getString(R.styleable.DonutProgress_donut_inner_bottom_text);
	//  110  239:aload_0         
	//  111  240:aload_1         
	//  112  241:getstatic       #300 <Field int R$styleable.DonutProgress_donut_inner_bottom_text>
	//  113  244:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//  114  247:putfield        #193 <Field String innerBottomText>
		}
		innerBottomTextSize = typedarray.getDimension(R.styleable.DonutProgress_donut_inner_bottom_text_size, default_inner_bottom_text_size);
	//  115  250:aload_0         
	//  116  251:aload_1         
	//  117  252:getstatic       #294 <Field int R$styleable.DonutProgress_donut_inner_bottom_text_size>
	//  118  255:aload_0         
	//  119  256:getfield        #122 <Field float default_inner_bottom_text_size>
	//  120  259:invokevirtual   #269 <Method float TypedArray.getDimension(int, float)>
	//  121  262:putfield        #199 <Field float innerBottomTextSize>
		innerBottomTextColor = typedarray.getColor(R.styleable.DonutProgress_donut_inner_bottom_text_color, default_inner_bottom_text_color);
	//  122  265:aload_0         
	//  123  266:aload_1         
	//  124  267:getstatic       #297 <Field int R$styleable.DonutProgress_donut_inner_bottom_text_color>
	//  125  270:aload_0         
	//  126  271:getfield        #92  <Field int default_inner_bottom_text_color>
	//  127  274:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//  128  277:putfield        #196 <Field int innerBottomTextColor>
		innerBottomText = typedarray.getString(R.styleable.DonutProgress_donut_inner_bottom_text);
	//  129  280:aload_0         
	//  130  281:aload_1         
	//  131  282:getstatic       #300 <Field int R$styleable.DonutProgress_donut_inner_bottom_text>
	//  132  285:invokevirtual   #279 <Method String TypedArray.getString(int)>
	//  133  288:putfield        #193 <Field String innerBottomText>
		startingDegree = typedarray.getInt(R.styleable.DonutProgress_donut_circle_starting_degree, 0);
	//  134  291:aload_0         
	//  135  292:aload_1         
	//  136  293:getstatic       #303 <Field int R$styleable.DonutProgress_donut_circle_starting_degree>
	//  137  296:iconst_0        
	//  138  297:invokevirtual   #248 <Method int TypedArray.getInt(int, int)>
	//  139  300:putfield        #204 <Field int startingDegree>
		innerBackgroundColor = typedarray.getColor(R.styleable.DonutProgress_donut_background_color, 0);
	//  140  303:aload_0         
	//  141  304:aload_1         
	//  142  305:getstatic       #306 <Field int R$styleable.DonutProgress_donut_background_color>
	//  143  308:iconst_0        
	//  144  309:invokevirtual   #224 <Method int TypedArray.getColor(int, int)>
	//  145  312:putfield        #189 <Field int innerBackgroundColor>
	//  146  315:return          
	}

	protected void initPainters()
	{
		if(showText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field boolean showText>
	//*   2    4:ifeq            89
		{
			textPaint = ((Paint) (new TextPaint()));
	//    3    7:aload_0         
	//    4    8:new             #308 <Class TextPaint>
	//    5   11:dup             
	//    6   12:invokespecial   #309 <Method void TextPaint()>
	//    7   15:putfield        #311 <Field Paint textPaint>
			textPaint.setColor(textColor);
	//    8   18:aload_0         
	//    9   19:getfield        #311 <Field Paint textPaint>
	//   10   22:aload_0         
	//   11   23:getfield        #209 <Field int textColor>
	//   12   26:invokevirtual   #316 <Method void Paint.setColor(int)>
			textPaint.setTextSize(textSize);
	//   13   29:aload_0         
	//   14   30:getfield        #311 <Field Paint textPaint>
	//   15   33:aload_0         
	//   16   34:getfield        #212 <Field float textSize>
	//   17   37:invokevirtual   #319 <Method void Paint.setTextSize(float)>
			textPaint.setAntiAlias(true);
	//   18   40:aload_0         
	//   19   41:getfield        #311 <Field Paint textPaint>
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #323 <Method void Paint.setAntiAlias(boolean)>
			innerBottomTextPaint = ((Paint) (new TextPaint()));
	//   22   48:aload_0         
	//   23   49:new             #308 <Class TextPaint>
	//   24   52:dup             
	//   25   53:invokespecial   #309 <Method void TextPaint()>
	//   26   56:putfield        #325 <Field Paint innerBottomTextPaint>
			innerBottomTextPaint.setColor(innerBottomTextColor);
	//   27   59:aload_0         
	//   28   60:getfield        #325 <Field Paint innerBottomTextPaint>
	//   29   63:aload_0         
	//   30   64:getfield        #196 <Field int innerBottomTextColor>
	//   31   67:invokevirtual   #316 <Method void Paint.setColor(int)>
			innerBottomTextPaint.setTextSize(innerBottomTextSize);
	//   32   70:aload_0         
	//   33   71:getfield        #325 <Field Paint innerBottomTextPaint>
	//   34   74:aload_0         
	//   35   75:getfield        #199 <Field float innerBottomTextSize>
	//   36   78:invokevirtual   #319 <Method void Paint.setTextSize(float)>
			innerBottomTextPaint.setAntiAlias(true);
	//   37   81:aload_0         
	//   38   82:getfield        #325 <Field Paint innerBottomTextPaint>
	//   39   85:iconst_1        
	//   40   86:invokevirtual   #323 <Method void Paint.setAntiAlias(boolean)>
		}
		finishedPaint = new Paint();
	//   41   89:aload_0         
	//   42   90:new             #313 <Class Paint>
	//   43   93:dup             
	//   44   94:invokespecial   #326 <Method void Paint()>
	//   45   97:putfield        #328 <Field Paint finishedPaint>
		finishedPaint.setColor(finishedStrokeColor);
	//   46  100:aload_0         
	//   47  101:getfield        #328 <Field Paint finishedPaint>
	//   48  104:aload_0         
	//   49  105:getfield        #183 <Field int finishedStrokeColor>
	//   50  108:invokevirtual   #316 <Method void Paint.setColor(int)>
		finishedPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   51  111:aload_0         
	//   52  112:getfield        #328 <Field Paint finishedPaint>
	//   53  115:getstatic       #334 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   54  118:invokevirtual   #338 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		finishedPaint.setAntiAlias(true);
	//   55  121:aload_0         
	//   56  122:getfield        #328 <Field Paint finishedPaint>
	//   57  125:iconst_1        
	//   58  126:invokevirtual   #323 <Method void Paint.setAntiAlias(boolean)>
		finishedPaint.setStrokeWidth(finishedStrokeWidth);
	//   59  129:aload_0         
	//   60  130:getfield        #328 <Field Paint finishedPaint>
	//   61  133:aload_0         
	//   62  134:getfield        #186 <Field float finishedStrokeWidth>
	//   63  137:invokevirtual   #341 <Method void Paint.setStrokeWidth(float)>
		unfinishedPaint = new Paint();
	//   64  140:aload_0         
	//   65  141:new             #313 <Class Paint>
	//   66  144:dup             
	//   67  145:invokespecial   #326 <Method void Paint()>
	//   68  148:putfield        #343 <Field Paint unfinishedPaint>
		unfinishedPaint.setColor(unfinishedStrokeColor);
	//   69  151:aload_0         
	//   70  152:getfield        #343 <Field Paint unfinishedPaint>
	//   71  155:aload_0         
	//   72  156:getfield        #215 <Field int unfinishedStrokeColor>
	//   73  159:invokevirtual   #316 <Method void Paint.setColor(int)>
		unfinishedPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   74  162:aload_0         
	//   75  163:getfield        #343 <Field Paint unfinishedPaint>
	//   76  166:getstatic       #334 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   77  169:invokevirtual   #338 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		unfinishedPaint.setAntiAlias(true);
	//   78  172:aload_0         
	//   79  173:getfield        #343 <Field Paint unfinishedPaint>
	//   80  176:iconst_1        
	//   81  177:invokevirtual   #323 <Method void Paint.setAntiAlias(boolean)>
		unfinishedPaint.setStrokeWidth(unfinishedStrokeWidth);
	//   82  180:aload_0         
	//   83  181:getfield        #343 <Field Paint unfinishedPaint>
	//   84  184:aload_0         
	//   85  185:getfield        #218 <Field float unfinishedStrokeWidth>
	//   86  188:invokevirtual   #341 <Method void Paint.setStrokeWidth(float)>
		innerCirclePaint = new Paint();
	//   87  191:aload_0         
	//   88  192:new             #313 <Class Paint>
	//   89  195:dup             
	//   90  196:invokespecial   #326 <Method void Paint()>
	//   91  199:putfield        #345 <Field Paint innerCirclePaint>
		innerCirclePaint.setColor(innerBackgroundColor);
	//   92  202:aload_0         
	//   93  203:getfield        #345 <Field Paint innerCirclePaint>
	//   94  206:aload_0         
	//   95  207:getfield        #189 <Field int innerBackgroundColor>
	//   96  210:invokevirtual   #316 <Method void Paint.setColor(int)>
		innerCirclePaint.setAntiAlias(true);
	//   97  213:aload_0         
	//   98  214:getfield        #345 <Field Paint innerCirclePaint>
	//   99  217:iconst_1        
	//  100  218:invokevirtual   #323 <Method void Paint.setAntiAlias(boolean)>
	//  101  221:return          
	}

	public void invalidate()
	{
		initPainters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method void initPainters()>
		super.invalidate();
	//    2    4:aload_0         
	//    3    5:invokespecial   #348 <Method void View.invalidate()>
	//    4    8:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #352 <Method void View.onDraw(Canvas)>
		float f = Math.max(finishedStrokeWidth, unfinishedStrokeWidth);
	//    3    5:aload_0         
	//    4    6:getfield        #186 <Field float finishedStrokeWidth>
	//    5    9:aload_0         
	//    6   10:getfield        #218 <Field float unfinishedStrokeWidth>
	//    7   13:invokestatic    #355 <Method float Math.max(float, float)>
	//    8   16:fstore_2        
		finishedOuterRect.set(f, f, (float)getWidth() - f, (float)getHeight() - f);
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field RectF finishedOuterRect>
	//   11   21:fload_2         
	//   12   22:fload_2         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #358 <Method int getWidth()>
	//   15   27:i2f             
	//   16   28:fload_2         
	//   17   29:fsub            
	//   18   30:aload_0         
	//   19   31:invokevirtual   #361 <Method int getHeight()>
	//   20   34:i2f             
	//   21   35:fload_2         
	//   22   36:fsub            
	//   23   37:invokevirtual   #365 <Method void RectF.set(float, float, float, float)>
		unfinishedOuterRect.set(f, f, (float)getWidth() - f, (float)getHeight() - f);
	//   24   40:aload_0         
	//   25   41:getfield        #64  <Field RectF unfinishedOuterRect>
	//   26   44:fload_2         
	//   27   45:fload_2         
	//   28   46:aload_0         
	//   29   47:invokevirtual   #358 <Method int getWidth()>
	//   30   50:i2f             
	//   31   51:fload_2         
	//   32   52:fsub            
	//   33   53:aload_0         
	//   34   54:invokevirtual   #361 <Method int getHeight()>
	//   35   57:i2f             
	//   36   58:fload_2         
	//   37   59:fsub            
	//   38   60:invokevirtual   #365 <Method void RectF.set(float, float, float, float)>
		f = (((float)getWidth() - Math.min(finishedStrokeWidth, unfinishedStrokeWidth)) + Math.abs(finishedStrokeWidth - unfinishedStrokeWidth)) / 2.0F;
	//   39   63:aload_0         
	//   40   64:invokevirtual   #358 <Method int getWidth()>
	//   41   67:i2f             
	//   42   68:aload_0         
	//   43   69:getfield        #186 <Field float finishedStrokeWidth>
	//   44   72:aload_0         
	//   45   73:getfield        #218 <Field float unfinishedStrokeWidth>
	//   46   76:invokestatic    #367 <Method float Math.min(float, float)>
	//   47   79:fsub            
	//   48   80:aload_0         
	//   49   81:getfield        #186 <Field float finishedStrokeWidth>
	//   50   84:aload_0         
	//   51   85:getfield        #218 <Field float unfinishedStrokeWidth>
	//   52   88:fsub            
	//   53   89:invokestatic    #371 <Method float Math.abs(float)>
	//   54   92:fadd            
	//   55   93:fconst_2        
	//   56   94:fdiv            
	//   57   95:fstore_2        
		canvas.drawCircle((float)getWidth() / 2.0F, (float)getHeight() / 2.0F, f, innerCirclePaint);
	//   58   96:aload_1         
	//   59   97:aload_0         
	//   60   98:invokevirtual   #358 <Method int getWidth()>
	//   61  101:i2f             
	//   62  102:fconst_2        
	//   63  103:fdiv            
	//   64  104:aload_0         
	//   65  105:invokevirtual   #361 <Method int getHeight()>
	//   66  108:i2f             
	//   67  109:fconst_2        
	//   68  110:fdiv            
	//   69  111:fload_2         
	//   70  112:aload_0         
	//   71  113:getfield        #345 <Field Paint innerCirclePaint>
	//   72  116:invokevirtual   #377 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawArc(finishedOuterRect, getStartingDegree(), getProgressAngle(), false, finishedPaint);
	//   73  119:aload_1         
	//   74  120:aload_0         
	//   75  121:getfield        #62  <Field RectF finishedOuterRect>
	//   76  124:aload_0         
	//   77  125:invokevirtual   #379 <Method int getStartingDegree()>
	//   78  128:i2f             
	//   79  129:aload_0         
	//   80  130:invokespecial   #381 <Method float getProgressAngle()>
	//   81  133:iconst_0        
	//   82  134:aload_0         
	//   83  135:getfield        #328 <Field Paint finishedPaint>
	//   84  138:invokevirtual   #385 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		RectF rectf = unfinishedOuterRect;
	//   85  141:aload_0         
	//   86  142:getfield        #64  <Field RectF unfinishedOuterRect>
	//   87  145:astore          5
		f = getStartingDegree();
	//   88  147:aload_0         
	//   89  148:invokevirtual   #379 <Method int getStartingDegree()>
	//   90  151:i2f             
	//   91  152:fstore_2        
		canvas.drawArc(rectf, getProgressAngle() + f, 360F - getProgressAngle(), false, unfinishedPaint);
	//   92  153:aload_1         
	//   93  154:aload           5
	//   94  156:aload_0         
	//   95  157:invokespecial   #381 <Method float getProgressAngle()>
	//   96  160:fload_2         
	//   97  161:fadd            
	//   98  162:ldc1            #160 <Float 360F>
	//   99  164:aload_0         
	//  100  165:invokespecial   #381 <Method float getProgressAngle()>
	//  101  168:fsub            
	//  102  169:iconst_0        
	//  103  170:aload_0         
	//  104  171:getfield        #343 <Field Paint unfinishedPaint>
	//  105  174:invokevirtual   #385 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		if(showText)
	//* 106  177:aload_0         
	//* 107  178:getfield        #236 <Field boolean showText>
	//* 108  181:ifeq            394
		{
			Object obj = ((Object) (text));
	//  109  184:aload_0         
	//  110  185:getfield        #78  <Field String text>
	//  111  188:astore          5
			if(obj == null)
	//* 112  190:aload           5
	//* 113  192:ifnull          198
	//* 114  195:goto            244
			{
				obj = ((Object) (new StringBuilder()));
	//  115  198:new             #387 <Class StringBuilder>
	//  116  201:dup             
	//  117  202:invokespecial   #388 <Method void StringBuilder()>
	//  118  205:astore          5
				((StringBuilder) (obj)).append(prefixText);
	//  119  207:aload           5
	//  120  209:aload_0         
	//  121  210:getfield        #72  <Field String prefixText>
	//  122  213:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
	//  123  216:pop             
				((StringBuilder) (obj)).append(progress);
	//  124  217:aload           5
	//  125  219:aload_0         
	//  126  220:getfield        #68  <Field float progress>
	//  127  223:invokevirtual   #395 <Method StringBuilder StringBuilder.append(float)>
	//  128  226:pop             
				((StringBuilder) (obj)).append(suffixText);
	//  129  227:aload           5
	//  130  229:aload_0         
	//  131  230:getfield        #76  <Field String suffixText>
	//  132  233:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
	//  133  236:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  134  237:aload           5
	//  135  239:invokevirtual   #398 <Method String StringBuilder.toString()>
	//  136  242:astore          5
			}
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//* 137  244:aload           5
	//* 138  246:invokestatic    #404 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 139  249:ifne            306
			{
				float f1 = textPaint.descent();
	//  140  252:aload_0         
	//  141  253:getfield        #311 <Field Paint textPaint>
	//  142  256:invokevirtual   #407 <Method float Paint.descent()>
	//  143  259:fstore_2        
				float f3 = textPaint.ascent();
	//  144  260:aload_0         
	//  145  261:getfield        #311 <Field Paint textPaint>
	//  146  264:invokevirtual   #410 <Method float Paint.ascent()>
	//  147  267:fstore_3        
				canvas.drawText(((String) (obj)), ((float)getWidth() - textPaint.measureText(((String) (obj)))) / 2.0F, ((float)getWidth() - (f1 + f3)) / 2.0F, textPaint);
	//  148  268:aload_1         
	//  149  269:aload           5
	//  150  271:aload_0         
	//  151  272:invokevirtual   #358 <Method int getWidth()>
	//  152  275:i2f             
	//  153  276:aload_0         
	//  154  277:getfield        #311 <Field Paint textPaint>
	//  155  280:aload           5
	//  156  282:invokevirtual   #414 <Method float Paint.measureText(String)>
	//  157  285:fsub            
	//  158  286:fconst_2        
	//  159  287:fdiv            
	//  160  288:aload_0         
	//  161  289:invokevirtual   #358 <Method int getWidth()>
	//  162  292:i2f             
	//  163  293:fload_2         
	//  164  294:fload_3         
	//  165  295:fadd            
	//  166  296:fsub            
	//  167  297:fconst_2        
	//  168  298:fdiv            
	//  169  299:aload_0         
	//  170  300:getfield        #311 <Field Paint textPaint>
	//  171  303:invokevirtual   #418 <Method void Canvas.drawText(String, float, float, Paint)>
			}
			if(!TextUtils.isEmpty(((CharSequence) (getInnerBottomText()))))
	//* 172  306:aload_0         
	//* 173  307:invokevirtual   #420 <Method String getInnerBottomText()>
	//* 174  310:invokestatic    #404 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 175  313:ifne            394
			{
				innerBottomTextPaint.setTextSize(innerBottomTextSize);
	//  176  316:aload_0         
	//  177  317:getfield        #325 <Field Paint innerBottomTextPaint>
	//  178  320:aload_0         
	//  179  321:getfield        #199 <Field float innerBottomTextSize>
	//  180  324:invokevirtual   #319 <Method void Paint.setTextSize(float)>
				float f2 = getHeight();
	//  181  327:aload_0         
	//  182  328:invokevirtual   #361 <Method int getHeight()>
	//  183  331:i2f             
	//  184  332:fstore_2        
				float f4 = innerBottomTextHeight;
	//  185  333:aload_0         
	//  186  334:getfield        #422 <Field float innerBottomTextHeight>
	//  187  337:fstore_3        
				float f5 = (textPaint.descent() + textPaint.ascent()) / 2.0F;
	//  188  338:aload_0         
	//  189  339:getfield        #311 <Field Paint textPaint>
	//  190  342:invokevirtual   #407 <Method float Paint.descent()>
	//  191  345:aload_0         
	//  192  346:getfield        #311 <Field Paint textPaint>
	//  193  349:invokevirtual   #410 <Method float Paint.ascent()>
	//  194  352:fadd            
	//  195  353:fconst_2        
	//  196  354:fdiv            
	//  197  355:fstore          4
				canvas.drawText(getInnerBottomText(), ((float)getWidth() - innerBottomTextPaint.measureText(getInnerBottomText())) / 2.0F, f2 - f4 - f5, innerBottomTextPaint);
	//  198  357:aload_1         
	//  199  358:aload_0         
	//  200  359:invokevirtual   #420 <Method String getInnerBottomText()>
	//  201  362:aload_0         
	//  202  363:invokevirtual   #358 <Method int getWidth()>
	//  203  366:i2f             
	//  204  367:aload_0         
	//  205  368:getfield        #325 <Field Paint innerBottomTextPaint>
	//  206  371:aload_0         
	//  207  372:invokevirtual   #420 <Method String getInnerBottomText()>
	//  208  375:invokevirtual   #414 <Method float Paint.measureText(String)>
	//  209  378:fsub            
	//  210  379:fconst_2        
	//  211  380:fdiv            
	//  212  381:fload_2         
	//  213  382:fload_3         
	//  214  383:fsub            
	//  215  384:fload           4
	//  216  386:fsub            
	//  217  387:aload_0         
	//  218  388:getfield        #325 <Field Paint innerBottomTextPaint>
	//  219  391:invokevirtual   #418 <Method void Canvas.drawText(String, float, float, Paint)>
			}
		}
		if(attributeResourceId != 0)
	//* 220  394:aload_0         
	//* 221  395:getfield        #66  <Field int attributeResourceId>
	//* 222  398:ifeq            447
		{
			Bitmap bitmap = BitmapFactoryInstrumentation.decodeResource(getResources(), attributeResourceId);
	//  223  401:aload_0         
	//  224  402:invokevirtual   #102 <Method android.content.res.Resources getResources()>
	//  225  405:aload_0         
	//  226  406:getfield        #66  <Field int attributeResourceId>
	//  227  409:invokestatic    #428 <Method Bitmap BitmapFactoryInstrumentation.decodeResource(android.content.res.Resources, int)>
	//  228  412:astore          5
			canvas.drawBitmap(bitmap, (float)(getWidth() - bitmap.getWidth()) / 2.0F, (float)(getHeight() - bitmap.getHeight()) / 2.0F, ((Paint) (null)));
	//  229  414:aload_1         
	//  230  415:aload           5
	//  231  417:aload_0         
	//  232  418:invokevirtual   #358 <Method int getWidth()>
	//  233  421:aload           5
	//  234  423:invokevirtual   #431 <Method int Bitmap.getWidth()>
	//  235  426:isub            
	//  236  427:i2f             
	//  237  428:fconst_2        
	//  238  429:fdiv            
	//  239  430:aload_0         
	//  240  431:invokevirtual   #361 <Method int getHeight()>
	//  241  434:aload           5
	//  242  436:invokevirtual   #432 <Method int Bitmap.getHeight()>
	//  243  439:isub            
	//  244  440:i2f             
	//  245  441:fconst_2        
	//  246  442:fdiv            
	//  247  443:aconst_null     
	//  248  444:invokevirtual   #436 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
		}
	//  249  447:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(measure(i), measure(j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokespecial   #440 <Method int measure(int)>
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokespecial   #440 <Method int measure(int)>
	//    7   11:invokevirtual   #443 <Method void setMeasuredDimension(int, int)>
		innerBottomTextHeight = getHeight() - (getHeight() * 3) / 4;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #361 <Method int getHeight()>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #361 <Method int getHeight()>
	//   13   23:iconst_3        
	//   14   24:imul            
	//   15   25:iconst_4        
	//   16   26:idiv            
	//   17   27:isub            
	//   18   28:i2f             
	//   19   29:putfield        #422 <Field float innerBottomTextHeight>
	//   20   32:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #447 <Class Bundle>
	//*   2    4:ifeq            215
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_1         
	//    4    8:checkcast       #447 <Class Bundle>
	//    5   11:astore_1        
			textColor = ((Bundle) (parcelable)).getInt("text_color");
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc2            #449 <String "text_color">
	//    9   17:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   10   20:putfield        #209 <Field int textColor>
			textSize = ((Bundle) (parcelable)).getFloat("text_size");
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc2            #454 <String "text_size">
	//   14   28:invokevirtual   #456 <Method float Bundle.getFloat(String)>
	//   15   31:putfield        #212 <Field float textSize>
			innerBottomTextSize = ((Bundle) (parcelable)).getFloat("inner_bottom_text_size");
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:ldc2            #458 <String "inner_bottom_text_size">
	//   19   39:invokevirtual   #456 <Method float Bundle.getFloat(String)>
	//   20   42:putfield        #199 <Field float innerBottomTextSize>
			innerBottomText = ((Bundle) (parcelable)).getString("inner_bottom_text");
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:ldc2            #460 <String "inner_bottom_text">
	//   24   50:invokevirtual   #463 <Method String Bundle.getString(String)>
	//   25   53:putfield        #193 <Field String innerBottomText>
			innerBottomTextColor = ((Bundle) (parcelable)).getInt("inner_bottom_text_color");
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:ldc2            #465 <String "inner_bottom_text_color">
	//   29   61:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   30   64:putfield        #196 <Field int innerBottomTextColor>
			finishedStrokeColor = ((Bundle) (parcelable)).getInt("finished_stroke_color");
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:ldc2            #467 <String "finished_stroke_color">
	//   34   72:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   35   75:putfield        #183 <Field int finishedStrokeColor>
			unfinishedStrokeColor = ((Bundle) (parcelable)).getInt("unfinished_stroke_color");
	//   36   78:aload_0         
	//   37   79:aload_1         
	//   38   80:ldc2            #469 <String "unfinished_stroke_color">
	//   39   83:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   40   86:putfield        #215 <Field int unfinishedStrokeColor>
			finishedStrokeWidth = ((Bundle) (parcelable)).getFloat("finished_stroke_width");
	//   41   89:aload_0         
	//   42   90:aload_1         
	//   43   91:ldc2            #471 <String "finished_stroke_width">
	//   44   94:invokevirtual   #456 <Method float Bundle.getFloat(String)>
	//   45   97:putfield        #186 <Field float finishedStrokeWidth>
			unfinishedStrokeWidth = ((Bundle) (parcelable)).getFloat("unfinished_stroke_width");
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:ldc2            #473 <String "unfinished_stroke_width">
	//   49  105:invokevirtual   #456 <Method float Bundle.getFloat(String)>
	//   50  108:putfield        #218 <Field float unfinishedStrokeWidth>
			innerBackgroundColor = ((Bundle) (parcelable)).getInt("inner_background_color");
	//   51  111:aload_0         
	//   52  112:aload_1         
	//   53  113:ldc2            #475 <String "inner_background_color">
	//   54  116:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   55  119:putfield        #189 <Field int innerBackgroundColor>
			attributeResourceId = ((Bundle) (parcelable)).getInt("inner_drawable");
	//   56  122:aload_0         
	//   57  123:aload_1         
	//   58  124:ldc2            #477 <String "inner_drawable">
	//   59  127:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   60  130:putfield        #66  <Field int attributeResourceId>
			initPainters();
	//   61  133:aload_0         
	//   62  134:invokevirtual   #152 <Method void initPainters()>
			setMax(((Bundle) (parcelable)).getInt("max"));
	//   63  137:aload_0         
	//   64  138:aload_1         
	//   65  139:ldc2            #478 <String "max">
	//   66  142:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   67  145:invokevirtual   #252 <Method void setMax(int)>
			setStartingDegree(((Bundle) (parcelable)).getInt("starting_degree"));
	//   68  148:aload_0         
	//   69  149:aload_1         
	//   70  150:ldc2            #480 <String "starting_degree">
	//   71  153:invokevirtual   #452 <Method int Bundle.getInt(String)>
	//   72  156:invokevirtual   #483 <Method void setStartingDegree(int)>
			setProgress(((Bundle) (parcelable)).getFloat("progress"));
	//   73  159:aload_0         
	//   74  160:aload_1         
	//   75  161:ldc2            #484 <String "progress">
	//   76  164:invokevirtual   #456 <Method float Bundle.getFloat(String)>
	//   77  167:invokevirtual   #263 <Method void setProgress(float)>
			prefixText = ((Bundle) (parcelable)).getString("prefix");
	//   78  170:aload_0         
	//   79  171:aload_1         
	//   80  172:ldc2            #486 <String "prefix">
	//   81  175:invokevirtual   #463 <Method String Bundle.getString(String)>
	//   82  178:putfield        #72  <Field String prefixText>
			suffixText = ((Bundle) (parcelable)).getString("suffix");
	//   83  181:aload_0         
	//   84  182:aload_1         
	//   85  183:ldc2            #488 <String "suffix">
	//   86  186:invokevirtual   #463 <Method String Bundle.getString(String)>
	//   87  189:putfield        #76  <Field String suffixText>
			text = ((Bundle) (parcelable)).getString("text");
	//   88  192:aload_0         
	//   89  193:aload_1         
	//   90  194:ldc2            #489 <String "text">
	//   91  197:invokevirtual   #463 <Method String Bundle.getString(String)>
	//   92  200:putfield        #78  <Field String text>
			super.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("saved_instance"));
	//   93  203:aload_0         
	//   94  204:aload_1         
	//   95  205:ldc2            #491 <String "saved_instance">
	//   96  208:invokevirtual   #495 <Method Parcelable Bundle.getParcelable(String)>
	//   97  211:invokespecial   #497 <Method void View.onRestoreInstanceState(Parcelable)>
			return;
	//   98  214:return          
		} else
		{
			super.onRestoreInstanceState(parcelable);
	//   99  215:aload_0         
	//  100  216:aload_1         
	//  101  217:invokespecial   #497 <Method void View.onRestoreInstanceState(Parcelable)>
			return;
	//  102  220:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #447 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #500 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putParcelable("saved_instance", super.onSaveInstanceState());
	//    4    8:aload_1         
	//    5    9:ldc2            #491 <String "saved_instance">
	//    6   12:aload_0         
	//    7   13:invokespecial   #502 <Method Parcelable View.onSaveInstanceState()>
	//    8   16:invokevirtual   #506 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putInt("text_color", getTextColor());
	//    9   19:aload_1         
	//   10   20:ldc2            #449 <String "text_color">
	//   11   23:aload_0         
	//   12   24:invokevirtual   #508 <Method int getTextColor()>
	//   13   27:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putFloat("text_size", getTextSize());
	//   14   30:aload_1         
	//   15   31:ldc2            #454 <String "text_size">
	//   16   34:aload_0         
	//   17   35:invokevirtual   #514 <Method float getTextSize()>
	//   18   38:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
	//   19   41:aload_1         
	//   20   42:ldc2            #458 <String "inner_bottom_text_size">
	//   21   45:aload_0         
	//   22   46:invokevirtual   #520 <Method float getInnerBottomTextSize()>
	//   23   49:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
	//   24   52:aload_1         
	//   25   53:ldc2            #465 <String "inner_bottom_text_color">
	//   26   56:aload_0         
	//   27   57:invokevirtual   #522 <Method int getInnerBottomTextColor()>
	//   28   60:i2f             
	//   29   61:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putString("inner_bottom_text", getInnerBottomText());
	//   30   64:aload_1         
	//   31   65:ldc2            #460 <String "inner_bottom_text">
	//   32   68:aload_0         
	//   33   69:invokevirtual   #420 <Method String getInnerBottomText()>
	//   34   72:invokevirtual   #526 <Method void Bundle.putString(String, String)>
		bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
	//   35   75:aload_1         
	//   36   76:ldc2            #465 <String "inner_bottom_text_color">
	//   37   79:aload_0         
	//   38   80:invokevirtual   #522 <Method int getInnerBottomTextColor()>
	//   39   83:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
	//   40   86:aload_1         
	//   41   87:ldc2            #467 <String "finished_stroke_color">
	//   42   90:aload_0         
	//   43   91:invokevirtual   #528 <Method int getFinishedStrokeColor()>
	//   44   94:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putInt("unfinished_stroke_color", getUnfinishedStrokeColor());
	//   45   97:aload_1         
	//   46   98:ldc2            #469 <String "unfinished_stroke_color">
	//   47  101:aload_0         
	//   48  102:invokevirtual   #530 <Method int getUnfinishedStrokeColor()>
	//   49  105:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putInt("max", getMax());
	//   50  108:aload_1         
	//   51  109:ldc2            #478 <String "max">
	//   52  112:aload_0         
	//   53  113:invokevirtual   #532 <Method int getMax()>
	//   54  116:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putInt("starting_degree", getStartingDegree());
	//   55  119:aload_1         
	//   56  120:ldc2            #480 <String "starting_degree">
	//   57  123:aload_0         
	//   58  124:invokevirtual   #379 <Method int getStartingDegree()>
	//   59  127:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putFloat("progress", getProgress());
	//   60  130:aload_1         
	//   61  131:ldc2            #484 <String "progress">
	//   62  134:aload_0         
	//   63  135:invokevirtual   #157 <Method float getProgress()>
	//   64  138:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putString("suffix", getSuffixText());
	//   65  141:aload_1         
	//   66  142:ldc2            #488 <String "suffix">
	//   67  145:aload_0         
	//   68  146:invokevirtual   #534 <Method String getSuffixText()>
	//   69  149:invokevirtual   #526 <Method void Bundle.putString(String, String)>
		bundle.putString("prefix", getPrefixText());
	//   70  152:aload_1         
	//   71  153:ldc2            #486 <String "prefix">
	//   72  156:aload_0         
	//   73  157:invokevirtual   #536 <Method String getPrefixText()>
	//   74  160:invokevirtual   #526 <Method void Bundle.putString(String, String)>
		bundle.putString("text", getText());
	//   75  163:aload_1         
	//   76  164:ldc2            #489 <String "text">
	//   77  167:aload_0         
	//   78  168:invokevirtual   #538 <Method String getText()>
	//   79  171:invokevirtual   #526 <Method void Bundle.putString(String, String)>
		bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
	//   80  174:aload_1         
	//   81  175:ldc2            #471 <String "finished_stroke_width">
	//   82  178:aload_0         
	//   83  179:invokevirtual   #540 <Method float getFinishedStrokeWidth()>
	//   84  182:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("unfinished_stroke_width", getUnfinishedStrokeWidth());
	//   85  185:aload_1         
	//   86  186:ldc2            #473 <String "unfinished_stroke_width">
	//   87  189:aload_0         
	//   88  190:invokevirtual   #542 <Method float getUnfinishedStrokeWidth()>
	//   89  193:invokevirtual   #518 <Method void Bundle.putFloat(String, float)>
		bundle.putInt("inner_background_color", getInnerBackgroundColor());
	//   90  196:aload_1         
	//   91  197:ldc2            #475 <String "inner_background_color">
	//   92  200:aload_0         
	//   93  201:invokevirtual   #544 <Method int getInnerBackgroundColor()>
	//   94  204:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		bundle.putInt("inner_drawable", getAttributeResourceId());
	//   95  207:aload_1         
	//   96  208:ldc2            #477 <String "inner_drawable">
	//   97  211:aload_0         
	//   98  212:invokevirtual   #546 <Method int getAttributeResourceId()>
	//   99  215:invokevirtual   #512 <Method void Bundle.putInt(String, int)>
		return ((Parcelable) (bundle));
	//  100  218:aload_1         
	//  101  219:areturn         
	}

	public void setAttributeResourceId(int i)
	{
		attributeResourceId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int attributeResourceId>
	//    3    5:return          
	}

	public void setDonut_progress(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #404 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            16
			setProgress(Integer.parseInt(s));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #554 <Method int Integer.parseInt(String)>
	//    6   12:i2f             
	//    7   13:invokevirtual   #263 <Method void setProgress(float)>
	//    8   16:return          
	}

	public void setFinishedStrokeColor(int i)
	{
		finishedStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field int finishedStrokeColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setFinishedStrokeWidth(float f)
	{
		finishedStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #186 <Field float finishedStrokeWidth>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setInnerBackgroundColor(int i)
	{
		innerBackgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int innerBackgroundColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setInnerBottomText(String s)
	{
		innerBottomText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #193 <Field String innerBottomText>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setInnerBottomTextColor(int i)
	{
		innerBottomTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #196 <Field int innerBottomTextColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setInnerBottomTextSize(float f)
	{
		innerBottomTextSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #199 <Field float innerBottomTextSize>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setMax(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            13
		{
			max = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #159 <Field int max>
			invalidate();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #556 <Method void invalidate()>
		}
	//    7   13:return          
	}

	public void setPrefixText(String s)
	{
		prefixText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String prefixText>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setProgress(float f)
	{
		progress = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #68  <Field float progress>
		if(progress > (float)getMax())
	//*   3    5:aload_0         
	//*   4    6:getfield        #68  <Field float progress>
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #532 <Method int getMax()>
	//*   7   13:i2f             
	//*   8   14:fcmpl           
	//*   9   15:ifle            32
			progress = progress % (float)getMax();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #68  <Field float progress>
	//   13   23:aload_0         
	//   14   24:invokevirtual   #532 <Method int getMax()>
	//   15   27:i2f             
	//   16   28:frem            
	//   17   29:putfield        #68  <Field float progress>
		invalidate();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #556 <Method void invalidate()>
	//   20   36:return          
	}

	public void setShowText(boolean flag)
	{
		showText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #236 <Field boolean showText>
	//    3    5:return          
	}

	public void setStartingDegree(int i)
	{
		startingDegree = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #204 <Field int startingDegree>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setSuffixText(String s)
	{
		suffixText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String suffixText>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setText(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String text>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setTextColor(int i)
	{
		textColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field int textColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setTextSize(float f)
	{
		textSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #212 <Field float textSize>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setUnfinishedStrokeColor(int i)
	{
		unfinishedStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #215 <Field int unfinishedStrokeColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	public void setUnfinishedStrokeWidth(float f)
	{
		unfinishedStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #218 <Field float unfinishedStrokeWidth>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #556 <Method void invalidate()>
	//    5    9:return          
	}

	private int attributeResourceId;
	private final int default_finished_color;
	private final int default_inner_background_color;
	private final int default_inner_bottom_text_color;
	private final float default_inner_bottom_text_size;
	private final int default_max;
	private final int default_startingDegree;
	private final float default_stroke_width;
	private final int default_text_color;
	private final float default_text_size;
	private final int default_unfinished_color;
	private RectF finishedOuterRect;
	private Paint finishedPaint;
	private int finishedStrokeColor;
	private float finishedStrokeWidth;
	private int innerBackgroundColor;
	private String innerBottomText;
	private int innerBottomTextColor;
	private float innerBottomTextHeight;
	protected Paint innerBottomTextPaint;
	private float innerBottomTextSize;
	private Paint innerCirclePaint;
	private int max;
	private final int min_size;
	private String prefixText;
	private float progress;
	private boolean showText;
	private int startingDegree;
	private String suffixText;
	private String text;
	private int textColor;
	protected Paint textPaint;
	private float textSize;
	private RectF unfinishedOuterRect;
	private Paint unfinishedPaint;
	private int unfinishedStrokeColor;
	private float unfinishedStrokeWidth;
}
