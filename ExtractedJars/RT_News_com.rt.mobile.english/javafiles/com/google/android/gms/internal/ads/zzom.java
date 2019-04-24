// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoj, zzakq, zzkb, zzamu, 
//			zzon, zzakb

public final class zzom extends RelativeLayout
{

	public zzom(Context context, zzoj zzoj1, android.widget.RelativeLayout.LayoutParams layoutparams)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void RelativeLayout(Context)>
		Preconditions.checkNotNull(((Object) (zzoj1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		ShapeDrawable shapedrawable = new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new RoundRectShape(zzbhs, ((android.graphics.RectF) (null)), ((float []) (null))))));
	//    6   10:new             #32  <Class ShapeDrawable>
	//    7   13:dup             
	//    8   14:new             #34  <Class RoundRectShape>
	//    9   17:dup             
	//   10   18:getstatic       #16  <Field float[] zzbhs>
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:invokespecial   #37  <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
	//   14   26:invokespecial   #40  <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//   15   29:astore          5
		shapedrawable.getPaint().setColor(zzoj1.getBackgroundColor());
	//   16   31:aload           5
	//   17   33:invokevirtual   #44  <Method Paint ShapeDrawable.getPaint()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #50  <Method int zzoj.getBackgroundColor()>
	//   20   40:invokevirtual   #56  <Method void Paint.setColor(int)>
		setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokevirtual   #60  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
		zzbv.zzem().setBackground(((android.view.View) (this)), ((Drawable) (shapedrawable)));
	//   24   48:invokestatic    #66  <Method zzakq zzbv.zzem()>
	//   25   51:aload_0         
	//   26   52:aload           5
	//   27   54:invokevirtual   #72  <Method void zzakq.setBackground(android.view.View, Drawable)>
		layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
	//   28   57:new             #74  <Class android.widget.RelativeLayout$LayoutParams>
	//   29   60:dup             
	//   30   61:bipush          -2
	//   31   63:bipush          -2
	//   32   65:invokespecial   #77  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   33   68:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (zzoj1.getText()))))
	//*  34   69:aload_2         
	//*  35   70:invokevirtual   #81  <Method String zzoj.getText()>
	//*  36   73:invokestatic    #87  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   76:ifne            197
		{
			android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
	//   38   79:new             #74  <Class android.widget.RelativeLayout$LayoutParams>
	//   39   82:dup             
	//   40   83:bipush          -2
	//   41   85:bipush          -2
	//   42   87:invokespecial   #77  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   43   90:astore          5
			TextView textview = new TextView(context);
	//   44   92:new             #89  <Class TextView>
	//   45   95:dup             
	//   46   96:aload_1         
	//   47   97:invokespecial   #90  <Method void TextView(Context)>
	//   48  100:astore          6
			textview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   49  102:aload           6
	//   50  104:aload           5
	//   51  106:invokevirtual   #91  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			textview.setId(0x47470001);
	//   52  109:aload           6
	//   53  111:ldc1            #92  <Int 0x47470001>
	//   54  113:invokevirtual   #95  <Method void TextView.setId(int)>
			textview.setTypeface(Typeface.DEFAULT);
	//   55  116:aload           6
	//   56  118:getstatic       #101 <Field Typeface Typeface.DEFAULT>
	//   57  121:invokevirtual   #105 <Method void TextView.setTypeface(Typeface)>
			textview.setText(((CharSequence) (zzoj1.getText())));
	//   58  124:aload           6
	//   59  126:aload_2         
	//   60  127:invokevirtual   #81  <Method String zzoj.getText()>
	//   61  130:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
			textview.setTextColor(zzoj1.getTextColor());
	//   62  133:aload           6
	//   63  135:aload_2         
	//   64  136:invokevirtual   #112 <Method int zzoj.getTextColor()>
	//   65  139:invokevirtual   #115 <Method void TextView.setTextColor(int)>
			textview.setTextSize(zzoj1.getTextSize());
	//   66  142:aload           6
	//   67  144:aload_2         
	//   68  145:invokevirtual   #118 <Method int zzoj.getTextSize()>
	//   69  148:i2f             
	//   70  149:invokevirtual   #122 <Method void TextView.setTextSize(float)>
			zzkb.zzif();
	//   71  152:invokestatic    #128 <Method zzamu zzkb.zzif()>
	//   72  155:pop             
			int i = zzamu.zza(context, 4);
	//   73  156:aload_1         
	//   74  157:iconst_4        
	//   75  158:invokestatic    #134 <Method int zzamu.zza(Context, int)>
	//   76  161:istore          4
			zzkb.zzif();
	//   77  163:invokestatic    #128 <Method zzamu zzkb.zzif()>
	//   78  166:pop             
			textview.setPadding(i, 0, zzamu.zza(context, 4), 0);
	//   79  167:aload           6
	//   80  169:iload           4
	//   81  171:iconst_0        
	//   82  172:aload_1         
	//   83  173:iconst_4        
	//   84  174:invokestatic    #134 <Method int zzamu.zza(Context, int)>
	//   85  177:iconst_0        
	//   86  178:invokevirtual   #138 <Method void TextView.setPadding(int, int, int, int)>
			addView(((android.view.View) (textview)));
	//   87  181:aload_0         
	//   88  182:aload           6
	//   89  184:invokevirtual   #142 <Method void addView(android.view.View)>
			layoutparams.addRule(1, textview.getId());
	//   90  187:aload_3         
	//   91  188:iconst_1        
	//   92  189:aload           6
	//   93  191:invokevirtual   #145 <Method int TextView.getId()>
	//   94  194:invokevirtual   #148 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		}
		context = ((Context) (new ImageView(context)));
	//   95  197:new             #150 <Class ImageView>
	//   96  200:dup             
	//   97  201:aload_1         
	//   98  202:invokespecial   #151 <Method void ImageView(Context)>
	//   99  205:astore_1        
		((ImageView) (context)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  100  206:aload_1         
	//  101  207:aload_3         
	//  102  208:invokevirtual   #152 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((ImageView) (context)).setId(0x47470002);
	//  103  211:aload_1         
	//  104  212:ldc1            #153 <Int 0x47470002>
	//  105  214:invokevirtual   #154 <Method void ImageView.setId(int)>
		layoutparams = ((android.widget.RelativeLayout.LayoutParams) (zzoj1.zzjs()));
	//  106  217:aload_2         
	//  107  218:invokevirtual   #158 <Method List zzoj.zzjs()>
	//  108  221:astore_3        
		if(layoutparams != null && ((List) (layoutparams)).size() > 1)
	//* 109  222:aload_3         
	//* 110  223:ifnull          329
	//* 111  226:aload_3         
	//* 112  227:invokeinterface #163 <Method int List.size()>
	//* 113  232:iconst_1        
	//* 114  233:icmple          329
		{
			zzbht = new AnimationDrawable();
	//  115  236:aload_0         
	//  116  237:new             #165 <Class AnimationDrawable>
	//  117  240:dup             
	//  118  241:invokespecial   #167 <Method void AnimationDrawable()>
	//  119  244:putfield        #169 <Field AnimationDrawable zzbht>
			for(layoutparams = ((android.widget.RelativeLayout.LayoutParams) (((List) (layoutparams)).iterator())); ((Iterator) (layoutparams)).hasNext();)
	//* 120  247:aload_3         
	//* 121  248:invokeinterface #173 <Method Iterator List.iterator()>
	//* 122  253:astore_3        
	//* 123  254:aload_3         
	//* 124  255:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//* 125  260:ifeq            315
			{
				Object obj = ((Object) ((zzon)((Iterator) (layoutparams)).next()));
	//  126  263:aload_3         
	//  127  264:invokeinterface #183 <Method Object Iterator.next()>
	//  128  269:checkcast       #185 <Class zzon>
	//  129  272:astore          5
				try
				{
					obj = ((Object) ((Drawable)ObjectWrapper.unwrap(((zzon) (obj)).zzjy())));
	//  130  274:aload           5
	//  131  276:invokevirtual   #189 <Method com.google.android.gms.dynamic.IObjectWrapper zzon.zzjy()>
	//  132  279:invokestatic    #195 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//  133  282:checkcast       #197 <Class Drawable>
	//  134  285:astore          5
					zzbht.addFrame(((Drawable) (obj)), zzoj1.zzjt());
	//  135  287:aload_0         
	//  136  288:getfield        #169 <Field AnimationDrawable zzbht>
	//  137  291:aload           5
	//  138  293:aload_2         
	//  139  294:invokevirtual   #200 <Method int zzoj.zzjt()>
	//  140  297:invokevirtual   #204 <Method void AnimationDrawable.addFrame(Drawable, int)>
				}
	//* 141  300:goto            254
				catch(Exception exception)
	//* 142  303:astore          5
				{
					zzakb.zzb("Error while getting drawable.", ((Throwable) (exception)));
	//  143  305:ldc1            #206 <String "Error while getting drawable.">
	//  144  307:aload           5
	//  145  309:invokestatic    #212 <Method void zzakb.zzb(String, Throwable)>
				}
			}

	//* 146  312:goto            254
			zzbv.zzem().setBackground(((android.view.View) (context)), ((Drawable) (zzbht)));
	//  147  315:invokestatic    #66  <Method zzakq zzbv.zzem()>
	//  148  318:aload_1         
	//  149  319:aload_0         
	//  150  320:getfield        #169 <Field AnimationDrawable zzbht>
	//  151  323:invokevirtual   #72  <Method void zzakq.setBackground(android.view.View, Drawable)>
		} else
	//* 152  326:goto            372
		if(((List) (layoutparams)).size() == 1)
	//* 153  329:aload_3         
	//* 154  330:invokeinterface #163 <Method int List.size()>
	//* 155  335:iconst_1        
	//* 156  336:icmpne          372
			try
			{
				((ImageView) (context)).setImageDrawable((Drawable)ObjectWrapper.unwrap(((zzon)((List) (layoutparams)).get(0)).zzjy()));
	//  157  339:aload_1         
	//  158  340:aload_3         
	//  159  341:iconst_0        
	//  160  342:invokeinterface #216 <Method Object List.get(int)>
	//  161  347:checkcast       #185 <Class zzon>
	//  162  350:invokevirtual   #189 <Method com.google.android.gms.dynamic.IObjectWrapper zzon.zzjy()>
	//  163  353:invokestatic    #195 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//  164  356:checkcast       #197 <Class Drawable>
	//  165  359:invokevirtual   #220 <Method void ImageView.setImageDrawable(Drawable)>
			}
	//* 166  362:goto            372
			// Misplaced declaration of an exception variable
			catch(zzoj zzoj1)
	//* 167  365:astore_2        
			{
				zzakb.zzb("Error while getting drawable.", ((Throwable) (zzoj1)));
	//  168  366:ldc1            #206 <String "Error while getting drawable.">
	//  169  368:aload_2         
	//  170  369:invokestatic    #212 <Method void zzakb.zzb(String, Throwable)>
			}
		addView(((android.view.View) (context)));
	//  171  372:aload_0         
	//  172  373:aload_1         
	//  173  374:invokevirtual   #142 <Method void addView(android.view.View)>
	//  174  377:return          
	}

	public final void onAttachedToWindow()
	{
		if(zzbht != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AnimationDrawable zzbht>
	//*   2    4:ifnull          14
			zzbht.start();
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AnimationDrawable zzbht>
	//    5   11:invokevirtual   #224 <Method void AnimationDrawable.start()>
		super.onAttachedToWindow();
	//    6   14:aload_0         
	//    7   15:invokespecial   #226 <Method void RelativeLayout.onAttachedToWindow()>
	//    8   18:return          
	}

	private static final float zzbhs[] = {
		5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
	};
	private AnimationDrawable zzbht;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        float[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #14  <Float 5F>
	//    5    8:fastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #14  <Float 5F>
	//    9   13:fastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #14  <Float 5F>
	//   13   18:fastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #14  <Float 5F>
	//   17   23:fastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #14  <Float 5F>
	//   21   28:fastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #14  <Float 5F>
	//   25   33:fastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #14  <Float 5F>
	//   29   39:fastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #14  <Float 5F>
	//   33   45:fastore         
	//   34   46:putstatic       #16  <Field float[] zzbhs>
	//*  35   49:return          
	}
}
