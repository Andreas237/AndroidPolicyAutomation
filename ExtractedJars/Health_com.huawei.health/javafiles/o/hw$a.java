// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.*;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.animation.*;
import android.widget.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package o:
//			hw, go

public final class hw$a extends AlertDialog
{

	private static Drawable b(Context context, String s)
	{
		String s1;
		String s2;
		s2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		s1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		Object obj;
		try
		{
			s = ((String) (new ByteArrayInputStream(go.c(s))));
	//    4    4:new             #24  <Class ByteArrayInputStream>
	//    5    7:dup             
	//    6    8:aload_1         
	//    7    9:invokestatic    #30  <Method byte[] go.c(String)>
	//    8   12:invokespecial   #33  <Method void ByteArrayInputStream(byte[])>
	//    9   15:astore_1        
		}
	//*  10   16:aload_1         
	//*  11   17:astore_2        
	//*  12   18:aload_1         
	//*  13   19:astore_3        
	//*  14   20:new             #35  <Class android.graphics.BitmapFactory$Options>
	//*  15   23:dup             
	//*  16   24:invokespecial   #38  <Method void android.graphics.BitmapFactory$Options()>
	//*  17   27:astore          4
	//*  18   29:aload_1         
	//*  19   30:astore_2        
	//*  20   31:aload_1         
	//*  21   32:astore_3        
	//*  22   33:aload           4
	//*  23   35:sipush          480
	//*  24   38:putfield        #42  <Field int android.graphics.BitmapFactory$Options.inDensity>
	//*  25   41:aload_1         
	//*  26   42:astore_2        
	//*  27   43:aload_1         
	//*  28   44:astore_3        
	//*  29   45:aload           4
	//*  30   47:aload_0         
	//*  31   48:invokevirtual   #48  <Method Resources Context.getResources()>
	//*  32   51:invokevirtual   #54  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//*  33   54:getfield        #59  <Field int DisplayMetrics.densityDpi>
	//*  34   57:putfield        #62  <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//*  35   60:aload_1         
	//*  36   61:astore_2        
	//*  37   62:aload_1         
	//*  38   63:astore_3        
	//*  39   64:aload_1         
	//*  40   65:aconst_null     
	//*  41   66:aload           4
	//*  42   68:invokestatic    #68  <Method android.graphics.Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//*  43   71:astore          4
	//*  44   73:aload_1         
	//*  45   74:astore_2        
	//*  46   75:aload_1         
	//*  47   76:astore_3        
	//*  48   77:new             #70  <Class BitmapDrawable>
	//*  49   80:dup             
	//*  50   81:aload_0         
	//*  51   82:invokevirtual   #48  <Method Resources Context.getResources()>
	//*  52   85:aload           4
	//*  53   87:invokespecial   #73  <Method void BitmapDrawable(Resources, android.graphics.Bitmap)>
	//*  54   90:astore_0        
	//*  55   91:aload_1         
	//*  56   92:invokevirtual   #78  <Method void InputStream.close()>
	//*  57   95:aload_0         
	//*  58   96:areturn         
	//*  59   97:aload_3         
	//*  60   98:ifnull          118
	//*  61  101:aload_3         
	//*  62  102:invokevirtual   #78  <Method void InputStream.close()>
	//*  63  105:aconst_null     
	//*  64  106:areturn         
	//*  65  107:astore_0        
	//*  66  108:aload_2         
	//*  67  109:ifnull          116
	//*  68  112:aload_2         
	//*  69  113:invokevirtual   #78  <Method void InputStream.close()>
	//*  70  116:aload_0         
	//*  71  117:athrow          
	//*  72  118:aconst_null     
	//*  73  119:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			if(s2 != null)
			{
				try
				{
					((InputStream) (s2)).close();
				}
	//*  74  120:astore_0        
	//*  75  121:goto            97
	//*  76  124:astore_1        
	//*  77  125:aload_0         
	//*  78  126:areturn         
				// Misplaced declaration of an exception variable
				catch(Context context)
	//*  79  127:astore_0        
				{
					return null;
	//   80  128:aconst_null     
	//   81  129:areturn         
				}
				return null;
			} else
			{
				return null;
			}
		}
		s1 = s;
		s2 = s;
		obj = ((Object) (new android.graphics.pFactory.Options()));
		s1 = s;
		s2 = s;
		obj.inDensity = 480;
		s1 = s;
		s2 = s;
		obj.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
		s1 = s;
		s2 = s;
		obj = ((Object) (BitmapFactory.decodeStream(((InputStream) (s)), ((android.graphics.Rect) (null)), ((android.graphics.pFactory.Options) (obj)))));
		s1 = s;
		s2 = s;
		context = ((Context) (new BitmapDrawable(context.getResources(), ((android.graphics.Bitmap) (obj)))));
		try
		{
			((InputStream) (s)).close();
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return ((Drawable) (context));
		}
		return ((Drawable) (context));
		context;
		if(s1 != null)
			try
			{
				((InputStream) (s1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   82  130:astore_1        
		throw context;
	//*  83  131:goto            116
	}

	private static int e(Context context, float f)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       11
			context = ((Context) (Resources.getSystem()));
	//    2    4:invokestatic    #83  <Method Resources Resources.getSystem()>
	//    3    7:astore_0        
		else
	//*   4    8:goto            16
			context = ((Context) (context.getResources()));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #48  <Method Resources Context.getResources()>
	//    7   15:astore_0        
		return (int)(f * ((Resources) (context)).getDisplayMetrics().density);
	//    8   16:fload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #54  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   11   21:getfield        #87  <Field float DisplayMetrics.density>
	//   12   24:fmul            
	//   13   25:f2i             
	//   14   26:ireturn         
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method void AlertDialog.onCreate(Bundle)>
		Context context = getContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #95  <Method Context getContext()>
	//    5    9:astore_2        
		LinearLayout linearlayout = new LinearLayout(context);
	//    6   10:new             #97  <Class LinearLayout>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #98  <Method void LinearLayout(Context)>
	//   10   18:astore_3        
		bundle = ((Bundle) (new android.widget.Layout.LayoutParams(-2, e(context, 50F))));
	//   11   19:new             #100 <Class android.widget.FrameLayout$LayoutParams>
	//   12   22:dup             
	//   13   23:bipush          -2
	//   14   25:aload_2         
	//   15   26:ldc1            #101 <Float 50F>
	//   16   28:invokestatic    #103 <Method int e(Context, float)>
	//   17   31:invokespecial   #106 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   18   34:astore_1        
		bundle.gravity = 17;
	//   19   35:aload_1         
	//   20   36:bipush          17
	//   21   38:putfield        #109 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		linearlayout.setOrientation(0);
	//   22   41:aload_3         
	//   23   42:iconst_0        
	//   24   43:invokevirtual   #113 <Method void LinearLayout.setOrientation(int)>
		linearlayout.setLayoutParams(((android.view.roup.LayoutParams) (bundle)));
	//   25   46:aload_3         
	//   26   47:aload_1         
	//   27   48:invokevirtual   #117 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		bundle = ((Bundle) (new GradientDrawable()));
	//   28   51:new             #119 <Class GradientDrawable>
	//   29   54:dup             
	//   30   55:invokespecial   #120 <Method void GradientDrawable()>
	//   31   58:astore_1        
		((GradientDrawable) (bundle)).setColor(0xe51f2337);
	//   32   59:aload_1         
	//   33   60:ldc1            #121 <Int 0xe51f2337>
	//   34   62:invokevirtual   #124 <Method void GradientDrawable.setColor(int)>
		((GradientDrawable) (bundle)).setCornerRadius(e(context, 5F));
	//   35   65:aload_1         
	//   36   66:aload_2         
	//   37   67:ldc1            #125 <Float 5F>
	//   38   69:invokestatic    #103 <Method int e(Context, float)>
	//   39   72:i2f             
	//   40   73:invokevirtual   #129 <Method void GradientDrawable.setCornerRadius(float)>
		linearlayout.setBackgroundDrawable(((Drawable) (bundle)));
	//   41   76:aload_3         
	//   42   77:aload_1         
	//   43   78:invokevirtual   #133 <Method void LinearLayout.setBackgroundDrawable(Drawable)>
		ImageView imageview = new ImageView(context);
	//   44   81:new             #135 <Class ImageView>
	//   45   84:dup             
	//   46   85:aload_2         
	//   47   86:invokespecial   #136 <Method void ImageView(Context)>
	//   48   89:astore          4
		bundle = ((Bundle) (new android.widget.rLayout.LayoutParams(e(context, 20F), e(context, 20F))));
	//   49   91:new             #138 <Class android.widget.LinearLayout$LayoutParams>
	//   50   94:dup             
	//   51   95:aload_2         
	//   52   96:ldc1            #139 <Float 20F>
	//   53   98:invokestatic    #103 <Method int e(Context, float)>
	//   54  101:aload_2         
	//   55  102:ldc1            #139 <Float 20F>
	//   56  104:invokestatic    #103 <Method int e(Context, float)>
	//   57  107:invokespecial   #140 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   58  110:astore_1        
		bundle.gravity = 16;
	//   59  111:aload_1         
	//   60  112:bipush          16
	//   61  114:putfield        #141 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		((android.widget.rLayout.LayoutParams) (bundle)).setMargins(e(((Context) (hw.a(b))), 17F), e(((Context) (hw.a(b))), 10F), e(((Context) (hw.a(b))), 8F), e(((Context) (hw.a(b))), 10F));
	//   62  117:aload_1         
	//   63  118:aload_0         
	//   64  119:getfield        #13  <Field hw b>
	//   65  122:invokestatic    #144 <Method android.app.Activity hw.a(hw)>
	//   66  125:ldc1            #145 <Float 17F>
	//   67  127:invokestatic    #103 <Method int e(Context, float)>
	//   68  130:aload_0         
	//   69  131:getfield        #13  <Field hw b>
	//   70  134:invokestatic    #144 <Method android.app.Activity hw.a(hw)>
	//   71  137:ldc1            #146 <Float 10F>
	//   72  139:invokestatic    #103 <Method int e(Context, float)>
	//   73  142:aload_0         
	//   74  143:getfield        #13  <Field hw b>
	//   75  146:invokestatic    #144 <Method android.app.Activity hw.a(hw)>
	//   76  149:ldc1            #147 <Float 8F>
	//   77  151:invokestatic    #103 <Method int e(Context, float)>
	//   78  154:aload_0         
	//   79  155:getfield        #13  <Field hw b>
	//   80  158:invokestatic    #144 <Method android.app.Activity hw.a(hw)>
	//   81  161:ldc1            #146 <Float 10F>
	//   82  163:invokestatic    #103 <Method int e(Context, float)>
	//   83  166:invokevirtual   #151 <Method void android.widget.LinearLayout$LayoutParams.setMargins(int, int, int, int)>
		imageview.setLayoutParams(((android.view.roup.LayoutParams) (bundle)));
	//   84  169:aload           4
	//   85  171:aload_1         
	//   86  172:invokevirtual   #152 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		imageview.setScaleType(android.widget.View.ScaleType.FIT_CENTER);
	//   87  175:aload           4
	//   88  177:getstatic       #158 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   89  180:invokevirtual   #162 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		imageview.setImageDrawable(b(context, hw.d));
	//   90  183:aload           4
	//   91  185:aload_2         
	//   92  186:getstatic       #166 <Field String hw.d>
	//   93  189:invokestatic    #168 <Method Drawable b(Context, String)>
	//   94  192:invokevirtual   #171 <Method void ImageView.setImageDrawable(Drawable)>
		bundle = ((Bundle) (new RotateAnimation(0.0F, 359F, 1, 0.5F, 1, 0.5F)));
	//   95  195:new             #173 <Class RotateAnimation>
	//   96  198:dup             
	//   97  199:fconst_0        
	//   98  200:ldc1            #174 <Float 359F>
	//   99  202:iconst_1        
	//  100  203:ldc1            #175 <Float 0.5F>
	//  101  205:iconst_1        
	//  102  206:ldc1            #175 <Float 0.5F>
	//  103  208:invokespecial   #178 <Method void RotateAnimation(float, float, int, float, int, float)>
	//  104  211:astore_1        
		((Animation) (bundle)).setRepeatCount(-1);
	//  105  212:aload_1         
	//  106  213:iconst_m1       
	//  107  214:invokevirtual   #183 <Method void Animation.setRepeatCount(int)>
		((Animation) (bundle)).setDuration(900L);
	//  108  217:aload_1         
	//  109  218:ldc2w           #184 <Long 900L>
	//  110  221:invokevirtual   #189 <Method void Animation.setDuration(long)>
		((Animation) (bundle)).setInterpolator(((android.view.animation.Interpolator) (new LinearInterpolator())));
	//  111  224:aload_1         
	//  112  225:new             #191 <Class LinearInterpolator>
	//  113  228:dup             
	//  114  229:invokespecial   #192 <Method void LinearInterpolator()>
	//  115  232:invokevirtual   #196 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		imageview.startAnimation(((Animation) (bundle)));
	//  116  235:aload           4
	//  117  237:aload_1         
	//  118  238:invokevirtual   #200 <Method void ImageView.startAnimation(Animation)>
		TextView textview = new TextView(context);
	//  119  241:new             #202 <Class TextView>
	//  120  244:dup             
	//  121  245:aload_2         
	//  122  246:invokespecial   #203 <Method void TextView(Context)>
	//  123  249:astore          5
		if(TextUtils.isEmpty(((CharSequence) (hw.b(b)))))
	//* 124  251:aload_0         
	//* 125  252:getfield        #13  <Field hw b>
	//* 126  255:invokestatic    #206 <Method String hw.b(hw)>
	//* 127  258:invokestatic    #212 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 128  261:ifeq            270
			bundle = "\u6B63\u5728\u52A0\u8F7D";
	//  129  264:ldc1            #214 <String "\u6B63\u5728\u52A0\u8F7D">
	//  130  266:astore_1        
		else
	//* 131  267:goto            278
			bundle = ((Bundle) (hw.b(b)));
	//  132  270:aload_0         
	//  133  271:getfield        #13  <Field hw b>
	//  134  274:invokestatic    #206 <Method String hw.b(hw)>
	//  135  277:astore_1        
		textview.setText(((CharSequence) (bundle)));
	//  136  278:aload           5
	//  137  280:aload_1         
	//  138  281:invokevirtual   #218 <Method void TextView.setText(CharSequence)>
		textview.setTextSize(16F);
	//  139  284:aload           5
	//  140  286:ldc1            #219 <Float 16F>
	//  141  288:invokevirtual   #222 <Method void TextView.setTextSize(float)>
		textview.setTextColor(-1);
	//  142  291:aload           5
	//  143  293:iconst_m1       
	//  144  294:invokevirtual   #225 <Method void TextView.setTextColor(int)>
		bundle = ((Bundle) (new android.widget.rLayout.LayoutParams(-2, -2)));
	//  145  297:new             #138 <Class android.widget.LinearLayout$LayoutParams>
	//  146  300:dup             
	//  147  301:bipush          -2
	//  148  303:bipush          -2
	//  149  305:invokespecial   #140 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  150  308:astore_1        
		bundle.gravity = 16;
	//  151  309:aload_1         
	//  152  310:bipush          16
	//  153  312:putfield        #141 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		((android.widget.rLayout.LayoutParams) (bundle)).setMargins(0, 0, e(context, 17F), 0);
	//  154  315:aload_1         
	//  155  316:iconst_0        
	//  156  317:iconst_0        
	//  157  318:aload_2         
	//  158  319:ldc1            #145 <Float 17F>
	//  159  321:invokestatic    #103 <Method int e(Context, float)>
	//  160  324:iconst_0        
	//  161  325:invokevirtual   #151 <Method void android.widget.LinearLayout$LayoutParams.setMargins(int, int, int, int)>
		textview.setLayoutParams(((android.view.roup.LayoutParams) (bundle)));
	//  162  328:aload           5
	//  163  330:aload_1         
	//  164  331:invokevirtual   #226 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		linearlayout.addView(((android.view.View) (imageview)));
	//  165  334:aload_3         
	//  166  335:aload           4
	//  167  337:invokevirtual   #230 <Method void LinearLayout.addView(android.view.View)>
		linearlayout.addView(((android.view.View) (textview)));
	//  168  340:aload_3         
	//  169  341:aload           5
	//  170  343:invokevirtual   #230 <Method void LinearLayout.addView(android.view.View)>
		setContentView(((android.view.View) (linearlayout)));
	//  171  346:aload_0         
	//  172  347:aload_3         
	//  173  348:invokevirtual   #233 <Method void setContentView(android.view.View)>
		getWindow().setBackgroundDrawable(((Drawable) (new ColorDrawable(0x106000d))));
	//  174  351:aload_0         
	//  175  352:invokevirtual   #237 <Method Window getWindow()>
	//  176  355:new             #239 <Class ColorDrawable>
	//  177  358:dup             
	//  178  359:ldc1            #240 <Int 0x106000d>
	//  179  361:invokespecial   #242 <Method void ColorDrawable(int)>
	//  180  364:invokevirtual   #245 <Method void Window.setBackgroundDrawable(Drawable)>
	//  181  367:return          
	}

	final hw b;

	protected hw$a(hw hw1, Context context)
	{
		b = hw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field hw b>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void AlertDialog(Context)>
	//    6   10:return          
	}
}
