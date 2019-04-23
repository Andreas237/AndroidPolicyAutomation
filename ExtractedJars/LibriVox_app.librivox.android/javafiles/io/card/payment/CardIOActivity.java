// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import io.card.payment.a.b;
import io.card.payment.a.c;
import io.card.payment.b.a;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.util.Date;

// Referenced classes of package io.card.payment:
//			CardScanner, p, o, CameraUnavailableException, 
//			t, b, DataEntryActivity, c, 
//			d, DetectionInfo, CreditCard

public final class CardIOActivity extends Activity
{

	public CardIOActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void Activity()>
		v = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #156 <Field boolean v>
	//    5    9:return          
	}

	static CreditCard a(CardIOActivity cardioactivity, CreditCard creditcard)
	{
		cardioactivity.i = creditcard;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field CreditCard i>
		return creditcard;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static o a(CardIOActivity cardioactivity)
	{
		return cardioactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field o g>
	//    2    4:areturn         
	}

	private void a(float f1)
	{
		Object obj = ((Object) (o));
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field LinearLayout o>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          59
		{
			obj = ((Object) (new RotateAnimation(0.0F, f1, ((LinearLayout) (obj)).getWidth() / 2, o.getHeight() / 2)));
	//    5    9:new             #167 <Class RotateAnimation>
	//    6   12:dup             
	//    7   13:fconst_0        
	//    8   14:fload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #173 <Method int LinearLayout.getWidth()>
	//   11   19:iconst_2        
	//   12   20:idiv            
	//   13   21:i2f             
	//   14   22:aload_0         
	//   15   23:getfield        #165 <Field LinearLayout o>
	//   16   26:invokevirtual   #176 <Method int LinearLayout.getHeight()>
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:i2f             
	//   20   32:invokespecial   #179 <Method void RotateAnimation(float, float, float, float)>
	//   21   35:astore_2        
			((Animation) (obj)).setDuration(0L);
	//   22   36:aload_2         
	//   23   37:lconst_0        
	//   24   38:invokevirtual   #185 <Method void Animation.setDuration(long)>
			((Animation) (obj)).setRepeatCount(0);
	//   25   41:aload_2         
	//   26   42:iconst_0        
	//   27   43:invokevirtual   #189 <Method void Animation.setRepeatCount(int)>
			((Animation) (obj)).setFillAfter(true);
	//   28   46:aload_2         
	//   29   47:iconst_1        
	//   30   48:invokevirtual   #193 <Method void Animation.setFillAfter(boolean)>
			o.setAnimation(((Animation) (obj)));
	//   31   51:aload_0         
	//   32   52:getfield        #165 <Field LinearLayout o>
	//   33   55:aload_2         
	//   34   56:invokevirtual   #197 <Method void LinearLayout.setAnimation(Animation)>
		}
	//   35   59:return          
	}

	private void a(int i1, Intent intent)
	{
		setResult(i1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #201 <Method void setResult(int, Intent)>
		b = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #150 <Field Bitmap b>
		finish();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #204 <Method void finish()>
	//    8   14:return          
	}

	static void a(CardIOActivity cardioactivity, int i1)
	{
		cardioactivity.b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #207 <Method void b(int)>
	//    3    5:return          
	}

	private void a(Exception exception)
	{
		String s1 = io.card.payment.a.b.a(c.t);
	//    0    0:getstatic       #213 <Field c c.t>
	//    1    3:invokestatic    #218 <Method String b.a(c)>
	//    2    6:astore_2        
		Log.e("card.io", "Unknown exception, please post the stack trace as a GitHub issue", ((Throwable) (exception)));
	//    3    7:ldc1            #220 <String "card.io">
	//    4    9:ldc1            #222 <String "Unknown exception, please post the stack trace as a GitHub issue">
	//    5   11:aload_1         
	//    6   12:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//    7   15:pop             
		exception = ((Exception) (Toast.makeText(((android.content.Context) (this)), ((CharSequence) (s1)), 1)));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:iconst_1        
	//   11   19:invokestatic    #233 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   12   22:astore_1        
		((Toast) (exception)).setGravity(17, 0, -75);
	//   13   23:aload_1         
	//   14   24:bipush          17
	//   15   26:iconst_0        
	//   16   27:bipush          -75
	//   17   29:invokevirtual   #237 <Method void Toast.setGravity(int, int, int)>
		((Toast) (exception)).show();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #240 <Method void Toast.show()>
		v = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #156 <Field boolean v>
	//   23   41:return          
	}

	private void a(String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #243 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("error display: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #246 <String "error display: ">
	//    6   11:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s1);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		Log.e("card.io", stringbuilder.toString());
	//   12   21:ldc1            #220 <String "card.io">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #256 <Method int Log.e(String, String)>
	//   16   30:pop             
		Toast.makeText(((android.content.Context) (this)), ((CharSequence) (s1)), 1).show();
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:iconst_1        
	//   20   34:invokestatic    #233 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   21   37:invokevirtual   #240 <Method void Toast.show()>
	//   22   40:return          
	}

	static CreditCard b(CardIOActivity cardioactivity)
	{
		return cardioactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field CreditCard i>
	//    2    4:areturn         
	}

	private void b(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            207
		{
			CardScanner cardscanner = u;
	//    2    4:aload_0         
	//    3    5:getfield        #259 <Field CardScanner u>
	//    4    8:astore          4
			if(cardscanner == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       16
				return;
	//    7   15:return          
			i1 += cardscanner.g();
	//    8   16:iload_1         
	//    9   17:aload           4
	//   10   19:invokevirtual   #263 <Method int CardScanner.g()>
	//   11   22:iadd            
	//   12   23:istore_1        
			int j1 = i1;
	//   13   24:iload_1         
	//   14   25:istore_2        
			if(i1 > 360)
	//*  15   26:iload_1         
	//*  16   27:sipush          360
	//*  17   30:icmple          39
				j1 = i1 - 360;
	//   18   33:iload_1         
	//   19   34:sipush          360
	//   20   37:isub            
	//   21   38:istore_2        
			byte byte0 = -1;
	//   22   39:iconst_m1       
	//   23   40:istore_3        
			if(j1 >= 15 && j1 <= 345)
	//*  24   41:iload_2         
	//*  25   42:bipush          15
	//*  26   44:icmplt          136
	//*  27   47:iload_2         
	//*  28   48:sipush          345
	//*  29   51:icmple          57
	//*  30   54:goto            136
			{
				if(j1 > 75 && j1 < 105)
	//*  31   57:iload_2         
	//*  32   58:bipush          75
	//*  33   60:icmple          80
	//*  34   63:iload_2         
	//*  35   64:bipush          105
	//*  36   66:icmpge          80
				{
					l = 4;
	//   37   69:aload_0         
	//   38   70:iconst_4        
	//   39   71:putfield        #265 <Field int l>
					i1 = 90;
	//   40   74:bipush          90
	//   41   76:istore_1        
				} else
	//*  42   77:goto            143
				if(j1 > 165 && j1 < 195)
	//*  43   80:iload_2         
	//*  44   81:sipush          165
	//*  45   84:icmple          106
	//*  46   87:iload_2         
	//*  47   88:sipush          195
	//*  48   91:icmpge          106
				{
					i1 = 180;
	//   49   94:sipush          180
	//   50   97:istore_1        
					l = 2;
	//   51   98:aload_0         
	//   52   99:iconst_2        
	//   53  100:putfield        #265 <Field int l>
				} else
	//*  54  103:goto            143
				{
					i1 = ((int) (byte0));
	//   55  106:iload_3         
	//   56  107:istore_1        
					if(j1 > 255)
	//*  57  108:iload_2         
	//*  58  109:sipush          255
	//*  59  112:icmple          143
					{
						i1 = ((int) (byte0));
	//   60  115:iload_3         
	//   61  116:istore_1        
						if(j1 < 285)
	//*  62  117:iload_2         
	//*  63  118:sipush          285
	//*  64  121:icmpge          143
						{
							l = 3;
	//   65  124:aload_0         
	//   66  125:iconst_3        
	//   67  126:putfield        #265 <Field int l>
							i1 = 270;
	//   68  129:sipush          270
	//   69  132:istore_1        
						}
					}
				}
			} else
	//*  70  133:goto            143
			{
				i1 = 0;
	//   71  136:iconst_0        
	//   72  137:istore_1        
				l = 1;
	//   73  138:aload_0         
	//   74  139:iconst_1        
	//   75  140:putfield        #265 <Field int l>
			}
			if(i1 >= 0 && i1 != k)
	//*  76  143:iload_1         
	//*  77  144:iflt            206
	//*  78  147:iload_1         
	//*  79  148:aload_0         
	//*  80  149:getfield        #267 <Field int k>
	//*  81  152:icmpeq          206
			{
				u.a(l);
	//   82  155:aload_0         
	//   83  156:getfield        #259 <Field CardScanner u>
	//   84  159:aload_0         
	//   85  160:getfield        #265 <Field int l>
	//   86  163:invokevirtual   #269 <Method void io.card.payment.CardScanner.a(int)>
				c(i1);
	//   87  166:aload_0         
	//   88  167:iload_1         
	//   89  168:invokespecial   #271 <Method void c(int)>
				if(i1 == 90)
	//*  90  171:iload_1         
	//*  91  172:bipush          90
	//*  92  174:icmpne          185
				{
					a(270F);
	//   93  177:aload_0         
	//   94  178:ldc2            #272 <Float 270F>
	//   95  181:invokespecial   #274 <Method void a(float)>
					return;
	//   96  184:return          
				}
				if(i1 == 270)
	//*  97  185:iload_1         
	//*  98  186:sipush          270
	//*  99  189:icmpne          200
				{
					a(90F);
	//  100  192:aload_0         
	//  101  193:ldc2            #275 <Float 90F>
	//  102  196:invokespecial   #274 <Method void a(float)>
					return;
	//  103  199:return          
				}
				a(i1);
	//  104  200:aload_0         
	//  105  201:iload_1         
	//  106  202:i2f             
	//  107  203:invokespecial   #274 <Method void a(float)>
			}
			return;
	//  108  206:return          
		} else
		{
			return;
	//  109  207:return          
		}
	}

	private void c()
	{
		if(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean v>
	//*   2    4:ifeq            12
		{
			e();
	//    3    7:aload_0         
	//    4    8:invokespecial   #277 <Method void e()>
			return;
	//    5   11:return          
		} else
		{
			g();
	//    6   12:aload_0         
	//    7   13:invokespecial   #279 <Method void g()>
			return;
	//    8   16:return          
		}
	}

	private void c(int i1)
	{
		SurfaceView surfaceview = a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field p a>
	//    2    4:invokevirtual   #286 <Method SurfaceView io.card.payment.p.a()>
	//    3    7:astore_2        
		if(surfaceview == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       22
		{
			Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
	//    6   12:ldc1            #220 <String "card.io">
	//    7   14:ldc2            #288 <String "surface view is null.. recovering... rotation might be weird.">
	//    8   17:invokestatic    #291 <Method int Log.wtf(String, String)>
	//    9   20:pop             
			return;
	//   10   21:return          
		} else
		{
			j = u.a(((View) (surfaceview)).getWidth(), ((View) (surfaceview)).getHeight());
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #259 <Field CardScanner u>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #294 <Method int View.getWidth()>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #295 <Method int View.getHeight()>
	//   18   35:invokevirtual   #298 <Method Rect io.card.payment.CardScanner.a(int, int)>
	//   19   38:putfield        #300 <Field Rect j>
			Rect rect = j;
	//   20   41:aload_0         
	//   21   42:getfield        #300 <Field Rect j>
	//   22   45:astore_3        
			rect.top = rect.top + ((View) (surfaceview)).getTop();
	//   23   46:aload_3         
	//   24   47:aload_3         
	//   25   48:getfield        #305 <Field int Rect.top>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #308 <Method int View.getTop()>
	//   28   55:iadd            
	//   29   56:putfield        #305 <Field int Rect.top>
			rect = j;
	//   30   59:aload_0         
	//   31   60:getfield        #300 <Field Rect j>
	//   32   63:astore_3        
			rect.bottom = rect.bottom + ((View) (surfaceview)).getTop();
	//   33   64:aload_3         
	//   34   65:aload_3         
	//   35   66:getfield        #311 <Field int Rect.bottom>
	//   36   69:aload_2         
	//   37   70:invokevirtual   #308 <Method int View.getTop()>
	//   38   73:iadd            
	//   39   74:putfield        #311 <Field int Rect.bottom>
			g.a(j, i1);
	//   40   77:aload_0         
	//   41   78:getfield        #162 <Field o g>
	//   42   81:aload_0         
	//   43   82:getfield        #300 <Field Rect j>
	//   44   85:iload_1         
	//   45   86:invokevirtual   #316 <Method void io.card.payment.o.a(Rect, int)>
			k = i1;
	//   46   89:aload_0         
	//   47   90:iload_1         
	//   48   91:putfield        #267 <Field int k>
			return;
	//   49   94:return          
		}
	}

	static void c(CardIOActivity cardioactivity)
	{
		cardioactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method void h()>
	//    2    4:return          
	}

	public static boolean canReadCardWithCamera()
	{
		RuntimeException runtimeexception;
		boolean flag;
		try
		{
			flag = io.card.payment.t.a();
	//    0    0:invokestatic    #328 <Method boolean io.card.payment.t.a()>
	//    1    3:istore_0        
		}
	//*   2    4:iload_0         
	//*   3    5:ireturn         
	//*   4    6:getstatic       #140 <Field String e>
	//*   5    9:ldc2            #330 <String "RuntimeException accessing Util.hardwareSupported()">
	//*   6   12:invokestatic    #333 <Method int Log.w(String, String)>
	//*   7   15:pop             
	//*   8   16:iconst_0        
	//*   9   17:ireturn         
		catch(CameraUnavailableException cameraunavailableexception)
	//*  10   18:astore_1        
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(RuntimeException runtimeexception)
		{
			Log.w(e, "RuntimeException accessing Util.hardwareSupported()");
			return false;
		}
		return flag;
	//*  13   21:astore_1        
	//*  14   22:goto            6
	}

	private void d()
	{
		if(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean v>
	//*   2    4:ifeq            12
		{
			e();
	//    3    7:aload_0         
	//    4    8:invokespecial   #277 <Method void e()>
			return;
	//    5   11:return          
		} else
		{
			requestWindowFeature(1);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #337 <Method boolean requestWindowFeature(int)>
	//    9   17:pop             
			g();
	//   10   18:aload_0         
	//   11   19:invokespecial   #279 <Method void g()>
			return;
	//   12   22:return          
		}
	}

	private void e()
	{
		if(m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #339 <Field boolean m>
	//*   2    4:ifeq            24
		{
			Log.i("card.io", "Camera not available and manual entry suppressed.");
	//    3    7:ldc1            #220 <String "card.io">
	//    4    9:ldc2            #341 <String "Camera not available and manual entry suppressed.">
	//    5   12:invokestatic    #343 <Method int Log.i(String, String)>
	//    6   15:pop             
			a(RESULT_SCAN_NOT_AVAILABLE, ((Intent) (null)));
	//    7   16:aload_0         
	//    8   17:getstatic       #130 <Field int RESULT_SCAN_NOT_AVAILABLE>
	//    9   20:aconst_null     
	//   10   21:invokespecial   #345 <Method void a(int, Intent)>
		}
	//   11   24:return          
	}

	private void f()
	{
		CameraUnavailableException cameraunavailableexception;
		Object obj;
		String s2;
		StringBuilder stringbuilder1;
		try
		{
			if(!io.card.payment.t.a())
	//*   0    0:invokestatic    #328 <Method boolean io.card.payment.t.a()>
	//*   1    3:ifne            131
			{
				c c1 = c.r;
	//    2    6:getstatic       #347 <Field c c.r>
	//    3    9:astore_1        
				String s1 = io.card.payment.a.b.a(c1);
	//    4   10:aload_1         
	//    5   11:invokestatic    #218 <Method String b.a(c)>
	//    6   14:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #243 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #244 <Method void StringBuilder()>
	//   10   22:astore_3        
				stringbuilder.append(((Object) (c1)));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #350 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
				stringbuilder.append(": ");
	//   15   29:aload_3         
	//   16   30:ldc2            #352 <String ": ">
	//   17   33:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
				stringbuilder.append(s1);
	//   19   37:aload_3         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
				Log.w("card.io", stringbuilder.toString());
	//   23   43:ldc1            #220 <String "card.io">
	//   24   45:aload_3         
	//   25   46:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #333 <Method int Log.w(String, String)>
	//   27   52:pop             
				v = true;
	//   28   53:aload_0         
	//   29   54:iconst_1        
	//   30   55:putfield        #156 <Field boolean v>
				return;
	//   31   58:return          
			}
		}
	//*  32   59:getstatic       #354 <Field c c.s>
	//*  33   62:astore_1        
	//*  34   63:aload_1         
	//*  35   64:invokestatic    #218 <Method String b.a(c)>
	//*  36   67:astore_2        
	//*  37   68:new             #243 <Class StringBuilder>
	//*  38   71:dup             
	//*  39   72:invokespecial   #244 <Method void StringBuilder()>
	//*  40   75:astore_3        
	//*  41   76:aload_3         
	//*  42   77:aload_1         
	//*  43   78:invokevirtual   #350 <Method StringBuilder StringBuilder.append(Object)>
	//*  44   81:pop             
	//*  45   82:aload_3         
	//*  46   83:ldc2            #352 <String ": ">
	//*  47   86:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//*  48   89:pop             
	//*  49   90:aload_3         
	//*  50   91:aload_2         
	//*  51   92:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//*  52   95:pop             
	//*  53   96:ldc1            #220 <String "card.io">
	//*  54   98:aload_3         
	//*  55   99:invokevirtual   #253 <Method String StringBuilder.toString()>
	//*  56  102:invokestatic    #256 <Method int Log.e(String, String)>
	//*  57  105:pop             
	//*  58  106:aload_0         
	//*  59  107:aload_2         
	//*  60  108:iconst_1        
	//*  61  109:invokestatic    #233 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//*  62  112:astore_1        
	//*  63  113:aload_1         
	//*  64  114:bipush          17
	//*  65  116:iconst_0        
	//*  66  117:bipush          -75
	//*  67  119:invokevirtual   #237 <Method void Toast.setGravity(int, int, int)>
	//*  68  122:aload_1         
	//*  69  123:invokevirtual   #240 <Method void Toast.show()>
	//*  70  126:aload_0         
	//*  71  127:iconst_1        
	//*  72  128:putfield        #156 <Field boolean v>
	//*  73  131:return          
		// Misplaced declaration of an exception variable
		catch(CameraUnavailableException cameraunavailableexception)
		{
			obj = ((Object) (c.s));
			s2 = io.card.payment.a.b.a(((c) (obj)));
			stringbuilder1 = new StringBuilder();
			stringbuilder1.append(obj);
			stringbuilder1.append(": ");
			stringbuilder1.append(s2);
			Log.e("card.io", stringbuilder1.toString());
			obj = ((Object) (Toast.makeText(((android.content.Context) (this)), ((CharSequence) (s2)), 1)));
			((Toast) (obj)).setGravity(17, 0, -75);
			((Toast) (obj)).show();
			v = true;
		}
	//*  74  132:astore_1        
	//*  75  133:goto            59
	}

	private void g()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #361 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          32
		{
			getWindow().getDecorView().setSystemUiVisibility(4);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #365 <Method Window getWindow()>
	//    5   12:invokevirtual   #371 <Method View Window.getDecorView()>
	//    6   15:iconst_4        
	//    7   16:invokevirtual   #374 <Method void View.setSystemUiVisibility(int)>
			ActionBar actionbar = getActionBar();
	//    8   19:aload_0         
	//    9   20:invokevirtual   #378 <Method ActionBar getActionBar()>
	//   10   23:astore_1        
			if(actionbar != null)
	//*  11   24:aload_1         
	//*  12   25:ifnull          32
				actionbar.hide();
	//   13   28:aload_1         
	//   14   29:invokevirtual   #383 <Method void ActionBar.hide()>
		}
		try
		{
			j = new Rect();
	//   15   32:aload_0         
	//   16   33:new             #302 <Class Rect>
	//   17   36:dup             
	//   18   37:invokespecial   #384 <Method void Rect()>
	//   19   40:putfield        #300 <Field Rect j>
			l = 1;
	//   20   43:aload_0         
	//   21   44:iconst_1        
	//   22   45:putfield        #265 <Field int l>
			if(!getIntent().getBooleanExtra("io.card.payment.cameraBypassTestMode", false))
				break MISSING_BLOCK_LABEL_143;
	//   23   48:aload_0         
	//   24   49:invokevirtual   #388 <Method Intent getIntent()>
	//   25   52:ldc2            #390 <String "io.card.payment.cameraBypassTestMode">
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   28   59:ifeq            143
			if(getPackageName().contentEquals("io.card.development"))
	//*  29   62:aload_0         
	//*  30   63:invokevirtual   #399 <Method String getPackageName()>
	//*  31   66:ldc2            #401 <String "io.card.development">
	//*  32   69:invokevirtual   #407 <Method boolean String.contentEquals(CharSequence)>
	//*  33   72:ifeq            132
			{
				u = (CardScanner)Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[] {
					((Object)this).getClass(), Integer.TYPE
				}).newInstance(new Object[] {
					this, Integer.valueOf(l)
				});
	//   34   75:aload_0         
	//   35   76:ldc2            #409 <String "io.card.payment.CardScannerTester">
	//   36   79:invokestatic    #413 <Method Class Class.forName(String)>
	//   37   82:iconst_2        
	//   38   83:anewarray       Class[]
	//   39   86:dup             
	//   40   87:iconst_0        
	//   41   88:aload_0         
	//   42   89:invokevirtual   #419 <Method Class Object.getClass()>
	//   43   92:aastore         
	//   44   93:dup             
	//   45   94:iconst_1        
	//   46   95:getstatic       #425 <Field Class Integer.TYPE>
	//   47   98:aastore         
	//   48   99:invokevirtual   #429 <Method Constructor Class.getConstructor(Class[])>
	//   49  102:iconst_2        
	//   50  103:anewarray       Object[]
	//   51  106:dup             
	//   52  107:iconst_0        
	//   53  108:aload_0         
	//   54  109:aastore         
	//   55  110:dup             
	//   56  111:iconst_1        
	//   57  112:aload_0         
	//   58  113:getfield        #265 <Field int l>
	//   59  116:invokestatic    #433 <Method Integer Integer.valueOf(int)>
	//   60  119:aastore         
	//   61  120:invokevirtual   #439 <Method Object Constructor.newInstance(Object[])>
	//   62  123:checkcast       #261 <Class CardScanner>
	//   63  126:putfield        #259 <Field CardScanner u>
				break MISSING_BLOCK_LABEL_159;
	//   64  129:goto            159
			}
		}
	//*  65  132:new             #441 <Class IllegalStateException>
	//*  66  135:dup             
	//*  67  136:ldc2            #443 <String "Illegal access of private extra">
	//*  68  139:invokespecial   #445 <Method void IllegalStateException(String)>
	//*  69  142:athrow          
	//*  70  143:aload_0         
	//*  71  144:new             #261 <Class CardScanner>
	//*  72  147:dup             
	//*  73  148:aload_0         
	//*  74  149:aload_0         
	//*  75  150:getfield        #265 <Field int l>
	//*  76  153:invokespecial   #447 <Method void CardScanner(CardIOActivity, int)>
	//*  77  156:putfield        #259 <Field CardScanner u>
	//*  78  159:aload_0         
	//*  79  160:getfield        #259 <Field CardScanner u>
	//*  80  163:invokevirtual   #449 <Method void io.card.payment.CardScanner.b()>
	//*  81  166:aload_0         
	//*  82  167:invokespecial   #451 <Method void j()>
	//*  83  170:aload_0         
	//*  84  171:new             #453 <Class io.card.payment.b>
	//*  85  174:dup             
	//*  86  175:aload_0         
	//*  87  176:aload_0         
	//*  88  177:iconst_2        
	//*  89  178:invokespecial   #456 <Method void io.card.payment.b(CardIOActivity, android.content.Context, int)>
	//*  90  181:putfield        #458 <Field OrientationEventListener h>
	//*  91  184:return          
		catch(Exception exception)
	//*  92  185:astore_1        
		{
			a(exception);
	//   93  186:aload_0         
	//   94  187:aload_1         
	//   95  188:invokespecial   #460 <Method void a(Exception)>
			return;
	//   96  191:return          
		}
		throw new IllegalStateException("Illegal access of private extra");
		u = new CardScanner(this, l);
		u.b();
		j();
		h = ((OrientationEventListener) (new io.card.payment.b(this, ((android.content.Context) (this)), 2)));
		return;
	}

	public static Bitmap getCapturedCardImage(Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          40
		{
			if(!intent.hasExtra("io.card.payment.capturedCardImage"))
	//*   2    4:aload_0         
	//*   3    5:ldc1            #8   <String "io.card.payment.capturedCardImage">
	//*   4    7:invokevirtual   #466 <Method boolean Intent.hasExtra(String)>
	//*   5   10:ifne            15
				return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
			else
				return BitmapFactory.decodeStream(((java.io.InputStream) (new ByteArrayInputStream(intent.getByteArrayExtra("io.card.payment.capturedCardImage")))), ((Rect) (null)), new android.graphics.BitmapFactory.Options());
	//    8   15:new             #468 <Class ByteArrayInputStream>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:ldc1            #8   <String "io.card.payment.capturedCardImage">
	//   12   22:invokevirtual   #472 <Method byte[] Intent.getByteArrayExtra(String)>
	//   13   25:invokespecial   #475 <Method void ByteArrayInputStream(byte[])>
	//   14   28:aconst_null     
	//   15   29:new             #477 <Class android.graphics.BitmapFactory$Options>
	//   16   32:dup             
	//   17   33:invokespecial   #478 <Method void android.graphics.BitmapFactory$Options()>
	//   18   36:invokestatic    #484 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream, Rect, android.graphics.BitmapFactory$Options)>
	//   19   39:areturn         
		} else
		{
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
		}
	}

	private void h()
	{
		Intent intent = getIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method Intent getIntent()>
	//    2    4:astore_1        
		if(intent != null && intent.getBooleanExtra("io.card.payment.suppressConfirmation", false))
	//*   3    5:aload_1         
	//*   4    6:ifnull          71
	//*   5    9:aload_1         
	//*   6   10:ldc1            #56  <String "io.card.payment.suppressConfirmation">
	//*   7   12:iconst_0        
	//*   8   13:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*   9   16:ifeq            71
		{
			Intent intent1 = new Intent(((android.content.Context) (this)), io/card/payment/DataEntryActivity);
	//   10   19:new             #392 <Class Intent>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:ldc2            #486 <Class DataEntryActivity>
	//   14   27:invokespecial   #489 <Method void Intent(android.content.Context, Class)>
	//   15   30:astore_2        
			CreditCard creditcard = i;
	//   16   31:aload_0         
	//   17   32:getfield        #159 <Field CreditCard i>
	//   18   35:astore_3        
			if(creditcard != null)
	//*  19   36:aload_3         
	//*  20   37:ifnull          53
			{
				intent1.putExtra("io.card.payment.scanResult", ((android.os.Parcelable) (creditcard)));
	//   21   40:aload_2         
	//   22   41:ldc1            #53  <String "io.card.payment.scanResult">
	//   23   43:aload_3         
	//   24   44:invokevirtual   #493 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   25   47:pop             
				i = null;
	//   26   48:aload_0         
	//   27   49:aconst_null     
	//   28   50:putfield        #159 <Field CreditCard i>
			}
			io.card.payment.t.a(intent, intent1, g);
	//   29   53:aload_1         
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #162 <Field o g>
	//   33   59:invokestatic    #496 <Method void io.card.payment.t.a(Intent, Intent, o)>
			a(RESULT_CONFIRMATION_SUPPRESSED, intent1);
	//   34   62:aload_0         
	//   35   63:getstatic       #134 <Field int RESULT_CONFIRMATION_SUPPRESSED>
	//   36   66:aload_2         
	//   37   67:invokespecial   #345 <Method void a(int, Intent)>
			return;
	//   38   70:return          
		} else
		{
			(new Handler()).post(((Runnable) (new io.card.payment.c(this, intent))));
	//   39   71:new             #498 <Class Handler>
	//   40   74:dup             
	//   41   75:invokespecial   #499 <Method void Handler()>
	//   42   78:new             #501 <Class io.card.payment.c>
	//   43   81:dup             
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:invokespecial   #504 <Method void io.card.payment.c(CardIOActivity, Intent)>
	//   47   87:invokevirtual   #508 <Method boolean Handler.post(Runnable)>
	//   48   90:pop             
			return;
	//   49   91:return          
		}
	}

	private boolean i()
	{
		i = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #159 <Field CreditCard i>
		if(!c && a == null)
	//*   3    5:getstatic       #121 <Field boolean c>
	//*   4    8:ifne            29
	//*   5   11:aload_0         
	//*   6   12:getfield        #281 <Field p a>
	//*   7   15:ifnull          21
	//*   8   18:goto            29
			throw new AssertionError();
	//    9   21:new             #510 <Class AssertionError>
	//   10   24:dup             
	//   11   25:invokespecial   #511 <Method void AssertionError()>
	//   12   28:athrow          
		boolean flag = u.a(a.b());
	//   13   29:aload_0         
	//   14   30:getfield        #259 <Field CardScanner u>
	//   15   33:aload_0         
	//   16   34:getfield        #281 <Field p a>
	//   17   37:invokevirtual   #514 <Method android.view.SurfaceHolder io.card.payment.p.b()>
	//   18   40:invokevirtual   #517 <Method boolean io.card.payment.CardScanner.a(android.view.SurfaceHolder)>
	//   19   43:istore_1        
		if(flag)
	//*  20   44:iload_1         
	//*  21   45:ifeq            56
			q.setVisibility(0);
	//   22   48:aload_0         
	//   23   49:getfield        #519 <Field RelativeLayout q>
	//   24   52:iconst_0        
	//   25   53:invokevirtual   #524 <Method void RelativeLayout.setVisibility(int)>
		return flag;
	//   26   56:iload_1         
	//   27   57:ireturn         
	}

	private void j()
	{
		r = new FrameLayout(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #526 <Class FrameLayout>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #529 <Method void FrameLayout(android.content.Context)>
	//    5    9:putfield        #531 <Field FrameLayout r>
		r.setBackgroundColor(0xff000000);
	//    6   12:aload_0         
	//    7   13:getfield        #531 <Field FrameLayout r>
	//    8   16:ldc2            #532 <Int 0xff000000>
	//    9   19:invokevirtual   #535 <Method void FrameLayout.setBackgroundColor(int)>
		r.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   10   22:aload_0         
	//   11   23:getfield        #531 <Field FrameLayout r>
	//   12   26:new             #537 <Class android.view.ViewGroup$LayoutParams>
	//   13   29:dup             
	//   14   30:iconst_m1       
	//   15   31:iconst_m1       
	//   16   32:invokespecial   #540 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   17   35:invokevirtual   #544 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		Object obj = ((Object) (new FrameLayout(((android.content.Context) (this)))));
	//   18   38:new             #526 <Class FrameLayout>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:invokespecial   #529 <Method void FrameLayout(android.content.Context)>
	//   22   46:astore          4
		((FrameLayout) (obj)).setId(1);
	//   23   48:aload           4
	//   24   50:iconst_1        
	//   25   51:invokevirtual   #547 <Method void FrameLayout.setId(int)>
		((Object) (u)).getClass();
	//   26   54:aload_0         
	//   27   55:getfield        #259 <Field CardScanner u>
	//   28   58:invokevirtual   #419 <Method Class Object.getClass()>
	//   29   61:pop             
		((Object) (u)).getClass();
	//   30   62:aload_0         
	//   31   63:getfield        #259 <Field CardScanner u>
	//   32   66:invokevirtual   #419 <Method Class Object.getClass()>
	//   33   69:pop             
		a = new p(((android.content.Context) (this)), ((android.util.AttributeSet) (null)), 640, 480);
	//   34   70:aload_0         
	//   35   71:new             #283 <Class p>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:sipush          640
	//   40   80:sipush          480
	//   41   83:invokespecial   #550 <Method void p(android.content.Context, android.util.AttributeSet, int, int)>
	//   42   86:putfield        #281 <Field p a>
		a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1, 48))));
	//   43   89:aload_0         
	//   44   90:getfield        #281 <Field p a>
	//   45   93:new             #552 <Class android.widget.FrameLayout$LayoutParams>
	//   46   96:dup             
	//   47   97:iconst_m1       
	//   48   98:iconst_m1       
	//   49   99:bipush          48
	//   50  101:invokespecial   #554 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   51  104:invokevirtual   #555 <Method void p.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((FrameLayout) (obj)).addView(((View) (a)));
	//   52  107:aload           4
	//   53  109:aload_0         
	//   54  110:getfield        #281 <Field p a>
	//   55  113:invokevirtual   #559 <Method void FrameLayout.addView(View)>
		g = new o(this, ((android.util.AttributeSet) (null)), io.card.payment.t.a(((android.content.Context) (this))));
	//   56  116:aload_0         
	//   57  117:new             #313 <Class o>
	//   58  120:dup             
	//   59  121:aload_0         
	//   60  122:aconst_null     
	//   61  123:aload_0         
	//   62  124:invokestatic    #562 <Method boolean io.card.payment.t.a(android.content.Context)>
	//   63  127:invokespecial   #565 <Method void o(CardIOActivity, android.util.AttributeSet, boolean)>
	//   64  130:putfield        #162 <Field o g>
		g.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   65  133:aload_0         
	//   66  134:getfield        #162 <Field o g>
	//   67  137:new             #537 <Class android.view.ViewGroup$LayoutParams>
	//   68  140:dup             
	//   69  141:iconst_m1       
	//   70  142:iconst_m1       
	//   71  143:invokespecial   #540 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   72  146:invokevirtual   #566 <Method void o.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(getIntent() != null)
	//*  73  149:aload_0         
	//*  74  150:invokevirtual   #388 <Method Intent getIntent()>
	//*  75  153:ifnull          275
		{
			boolean flag = getIntent().getBooleanExtra("io.card.payment.useCardIOLogo", false);
	//   76  156:aload_0         
	//   77  157:invokevirtual   #388 <Method Intent getIntent()>
	//   78  160:ldc1            #68  <String "io.card.payment.useCardIOLogo">
	//   79  162:iconst_0        
	//   80  163:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   81  166:istore_3        
			g.c(flag);
	//   82  167:aload_0         
	//   83  168:getfield        #162 <Field o g>
	//   84  171:iload_3         
	//   85  172:invokevirtual   #568 <Method void io.card.payment.o.c(boolean)>
			int i1 = getIntent().getIntExtra("io.card.payment.guideColor", 0);
	//   86  175:aload_0         
	//   87  176:invokevirtual   #388 <Method Intent getIntent()>
	//   88  179:ldc1            #11  <String "io.card.payment.guideColor">
	//   89  181:iconst_0        
	//   90  182:invokevirtual   #572 <Method int Intent.getIntExtra(String, int)>
	//   91  185:istore_1        
			if(i1 != 0)
	//*  92  186:iload_1         
	//*  93  187:ifeq            221
			{
				int l1 = 0xff000000 | i1;
	//   94  190:ldc2            #532 <Int 0xff000000>
	//   95  193:iload_1         
	//   96  194:ior             
	//   97  195:istore_2        
				if(i1 != l1)
	//*  98  196:iload_1         
	//*  99  197:iload_2         
	//* 100  198:icmpeq          210
					Log.w("card.io", "Removing transparency from provided guide color.");
	//  101  201:ldc1            #220 <String "card.io">
	//  102  203:ldc2            #574 <String "Removing transparency from provided guide color.">
	//  103  206:invokestatic    #333 <Method int Log.w(String, String)>
	//  104  209:pop             
				g.a(l1);
	//  105  210:aload_0         
	//  106  211:getfield        #162 <Field o g>
	//  107  214:iload_2         
	//  108  215:invokevirtual   #575 <Method void io.card.payment.o.a(int)>
			} else
	//* 109  218:goto            231
			{
				g.a(0xff00ff00);
	//  110  221:aload_0         
	//  111  222:getfield        #162 <Field o g>
	//  112  225:ldc2            #576 <Int 0xff00ff00>
	//  113  228:invokevirtual   #575 <Method void io.card.payment.o.a(int)>
			}
			flag = getIntent().getBooleanExtra("io.card.payment.hideLogo", false);
	//  114  231:aload_0         
	//  115  232:invokevirtual   #388 <Method Intent getIntent()>
	//  116  235:ldc1            #14  <String "io.card.payment.hideLogo">
	//  117  237:iconst_0        
	//  118  238:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  119  241:istore_3        
			g.a(flag);
	//  120  242:aload_0         
	//  121  243:getfield        #162 <Field o g>
	//  122  246:iload_3         
	//  123  247:invokevirtual   #578 <Method void io.card.payment.o.a(boolean)>
			String s1 = getIntent().getStringExtra("io.card.payment.scanInstructions");
	//  124  250:aload_0         
	//  125  251:invokevirtual   #388 <Method Intent getIntent()>
	//  126  254:ldc1            #47  <String "io.card.payment.scanInstructions">
	//  127  256:invokevirtual   #582 <Method String Intent.getStringExtra(String)>
	//  128  259:astore          5
			if(s1 != null)
	//* 129  261:aload           5
	//* 130  263:ifnull          275
				g.a(s1);
	//  131  266:aload_0         
	//  132  267:getfield        #162 <Field o g>
	//  133  270:aload           5
	//  134  272:invokevirtual   #584 <Method void io.card.payment.o.a(String)>
		}
		((FrameLayout) (obj)).addView(((View) (g)));
	//  135  275:aload           4
	//  136  277:aload_0         
	//  137  278:getfield        #162 <Field o g>
	//  138  281:invokevirtual   #559 <Method void FrameLayout.addView(View)>
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
	//  139  284:new             #586 <Class android.widget.RelativeLayout$LayoutParams>
	//  140  287:dup             
	//  141  288:iconst_m1       
	//  142  289:iconst_m1       
	//  143  290:invokespecial   #587 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  144  293:astore          5
		layoutparams.addRule(10);
	//  145  295:aload           5
	//  146  297:bipush          10
	//  147  299:invokevirtual   #590 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		layoutparams.addRule(2, 2);
	//  148  302:aload           5
	//  149  304:iconst_2        
	//  150  305:iconst_2        
	//  151  306:invokevirtual   #592 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		r.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  152  309:aload_0         
	//  153  310:getfield        #531 <Field FrameLayout r>
	//  154  313:aload           4
	//  155  315:aload           5
	//  156  317:invokevirtual   #595 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		q = new RelativeLayout(((android.content.Context) (this)));
	//  157  320:aload_0         
	//  158  321:new             #521 <Class RelativeLayout>
	//  159  324:dup             
	//  160  325:aload_0         
	//  161  326:invokespecial   #596 <Method void RelativeLayout(android.content.Context)>
	//  162  329:putfield        #519 <Field RelativeLayout q>
		q.setGravity(80);
	//  163  332:aload_0         
	//  164  333:getfield        #519 <Field RelativeLayout q>
	//  165  336:bipush          80
	//  166  338:invokevirtual   #598 <Method void RelativeLayout.setGravity(int)>
		obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(-1, -2)));
	//  167  341:new             #586 <Class android.widget.RelativeLayout$LayoutParams>
	//  168  344:dup             
	//  169  345:iconst_m1       
	//  170  346:bipush          -2
	//  171  348:invokespecial   #587 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  172  351:astore          4
		layoutparams.addRule(12);
	//  173  353:aload           5
	//  174  355:bipush          12
	//  175  357:invokevirtual   #590 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		q.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//  176  360:aload_0         
	//  177  361:getfield        #519 <Field RelativeLayout q>
	//  178  364:aload           4
	//  179  366:invokevirtual   #599 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		q.setId(2);
	//  180  369:aload_0         
	//  181  370:getfield        #519 <Field RelativeLayout q>
	//  182  373:iconst_2        
	//  183  374:invokevirtual   #600 <Method void RelativeLayout.setId(int)>
		q.setGravity(85);
	//  184  377:aload_0         
	//  185  378:getfield        #519 <Field RelativeLayout q>
	//  186  381:bipush          85
	//  187  383:invokevirtual   #598 <Method void RelativeLayout.setGravity(int)>
		if(!m)
	//* 188  386:aload_0         
	//* 189  387:getfield        #339 <Field boolean m>
	//* 190  390:ifne            541
		{
			obj = ((Object) (new Button(((android.content.Context) (this)))));
	//  191  393:new             #602 <Class Button>
	//  192  396:dup             
	//  193  397:aload_0         
	//  194  398:invokespecial   #603 <Method void Button(android.content.Context)>
	//  195  401:astore          4
			((Button) (obj)).setId(3);
	//  196  403:aload           4
	//  197  405:iconst_3        
	//  198  406:invokevirtual   #604 <Method void Button.setId(int)>
			((Button) (obj)).setText(((CharSequence) (io.card.payment.a.b.a(c.o))));
	//  199  409:aload           4
	//  200  411:getstatic       #606 <Field c c.o>
	//  201  414:invokestatic    #218 <Method String b.a(c)>
	//  202  417:invokevirtual   #610 <Method void Button.setText(CharSequence)>
			((Button) (obj)).setOnClickListener(((android.view.View.OnClickListener) (new d(this))));
	//  203  420:aload           4
	//  204  422:new             #612 <Class d>
	//  205  425:dup             
	//  206  426:aload_0         
	//  207  427:invokespecial   #614 <Method void d(CardIOActivity)>
	//  208  430:invokevirtual   #618 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			q.addView(((View) (obj)));
	//  209  433:aload_0         
	//  210  434:getfield        #519 <Field RelativeLayout q>
	//  211  437:aload           4
	//  212  439:invokevirtual   #619 <Method void RelativeLayout.addView(View)>
			io.card.payment.b.c.a(((Button) (obj)), false, ((android.content.Context) (this)), s);
	//  213  442:aload           4
	//  214  444:iconst_0        
	//  215  445:aload_0         
	//  216  446:aload_0         
	//  217  447:getfield        #621 <Field boolean s>
	//  218  450:invokestatic    #626 <Method void io.card.payment.b.c.a(Button, boolean, android.content.Context, boolean)>
			if(!s)
	//* 219  453:aload_0         
	//* 220  454:getfield        #621 <Field boolean s>
	//* 221  457:ifne            468
				((Button) (obj)).setTextSize(14F);
	//  222  460:aload           4
	//  223  462:ldc2            #627 <Float 14F>
	//  224  465:invokevirtual   #630 <Method void Button.setTextSize(float)>
			((Button) (obj)).setMinimumHeight(io.card.payment.b.c.a("42dip", ((android.content.Context) (this))));
	//  225  468:aload           4
	//  226  470:ldc2            #632 <String "42dip">
	//  227  473:aload_0         
	//  228  474:invokestatic    #635 <Method int io.card.payment.b.c.a(String, android.content.Context)>
	//  229  477:invokevirtual   #638 <Method void Button.setMinimumHeight(int)>
			android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)((Button) (obj)).getLayoutParams();
	//  230  480:aload           4
	//  231  482:invokevirtual   #642 <Method android.view.ViewGroup$LayoutParams Button.getLayoutParams()>
	//  232  485:checkcast       #586 <Class android.widget.RelativeLayout$LayoutParams>
	//  233  488:astore          5
			layoutparams1.width = -2;
	//  234  490:aload           5
	//  235  492:bipush          -2
	//  236  494:putfield        #645 <Field int android.widget.RelativeLayout$LayoutParams.width>
			layoutparams1.height = -2;
	//  237  497:aload           5
	//  238  499:bipush          -2
	//  239  501:putfield        #648 <Field int android.widget.RelativeLayout$LayoutParams.height>
			layoutparams1.addRule(12);
	//  240  504:aload           5
	//  241  506:bipush          12
	//  242  508:invokevirtual   #590 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			io.card.payment.b.c.a(((View) (obj)), "16dip", ((String) (null)), "16dip", ((String) (null)));
	//  243  511:aload           4
	//  244  513:ldc2            #650 <String "16dip">
	//  245  516:aconst_null     
	//  246  517:ldc2            #650 <String "16dip">
	//  247  520:aconst_null     
	//  248  521:invokestatic    #653 <Method void io.card.payment.b.c.a(View, String, String, String, String)>
			io.card.payment.b.c.b(((View) (obj)), "4dip", "4dip", "4dip", "4dip");
	//  249  524:aload           4
	//  250  526:ldc2            #655 <String "4dip">
	//  251  529:ldc2            #655 <String "4dip">
	//  252  532:ldc2            #655 <String "4dip">
	//  253  535:ldc2            #655 <String "4dip">
	//  254  538:invokestatic    #657 <Method void io.card.payment.b.c.b(View, String, String, String, String)>
		}
		obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(-1, -2)));
	//  255  541:new             #586 <Class android.widget.RelativeLayout$LayoutParams>
	//  256  544:dup             
	//  257  545:iconst_m1       
	//  258  546:bipush          -2
	//  259  548:invokespecial   #587 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  260  551:astore          4
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
	//  261  553:aload           4
	//  262  555:bipush          12
	//  263  557:invokevirtual   #590 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		int j1 = (int)(getResources().getDisplayMetrics().density * 15F + 0.5F);
	//  264  560:aload_0         
	//  265  561:invokevirtual   #661 <Method Resources getResources()>
	//  266  564:invokevirtual   #667 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  267  567:getfield        #673 <Field float DisplayMetrics.density>
	//  268  570:ldc2            #674 <Float 15F>
	//  269  573:fmul            
	//  270  574:ldc2            #675 <Float 0.5F>
	//  271  577:fadd            
	//  272  578:f2i             
	//  273  579:istore_1        
		((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, j1, 0, j1);
	//  274  580:aload           4
	//  275  582:iconst_0        
	//  276  583:iload_1         
	//  277  584:iconst_0        
	//  278  585:iload_1         
	//  279  586:invokevirtual   #679 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
		r.addView(((View) (q)), ((android.view.ViewGroup.LayoutParams) (obj)));
	//  280  589:aload_0         
	//  281  590:getfield        #531 <Field FrameLayout r>
	//  282  593:aload_0         
	//  283  594:getfield        #519 <Field RelativeLayout q>
	//  284  597:aload           4
	//  285  599:invokevirtual   #595 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		if(getIntent() != null)
	//* 286  602:aload_0         
	//* 287  603:invokevirtual   #388 <Method Intent getIntent()>
	//* 288  606:ifnull          702
		{
			LinearLayout linearlayout = o;
	//  289  609:aload_0         
	//  290  610:getfield        #165 <Field LinearLayout o>
	//  291  613:astore          4
			if(linearlayout != null)
	//* 292  615:aload           4
	//* 293  617:ifnull          634
			{
				r.removeView(((View) (linearlayout)));
	//  294  620:aload_0         
	//  295  621:getfield        #531 <Field FrameLayout r>
	//  296  624:aload           4
	//  297  626:invokevirtual   #682 <Method void FrameLayout.removeView(View)>
				o = null;
	//  298  629:aload_0         
	//  299  630:aconst_null     
	//  300  631:putfield        #165 <Field LinearLayout o>
			}
			int k1 = getIntent().getIntExtra("io.card.payment.scanOverlayLayoutId", -1);
	//  301  634:aload_0         
	//  302  635:invokevirtual   #388 <Method Intent getIntent()>
	//  303  638:ldc1            #50  <String "io.card.payment.scanOverlayLayoutId">
	//  304  640:iconst_m1       
	//  305  641:invokevirtual   #572 <Method int Intent.getIntExtra(String, int)>
	//  306  644:istore_1        
			if(k1 != -1)
	//* 307  645:iload_1         
	//* 308  646:iconst_m1       
	//* 309  647:icmpeq          702
			{
				o = new LinearLayout(((android.content.Context) (this)));
	//  310  650:aload_0         
	//  311  651:new             #169 <Class LinearLayout>
	//  312  654:dup             
	//  313  655:aload_0         
	//  314  656:invokespecial   #683 <Method void LinearLayout(android.content.Context)>
	//  315  659:putfield        #165 <Field LinearLayout o>
				o.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//  316  662:aload_0         
	//  317  663:getfield        #165 <Field LinearLayout o>
	//  318  666:new             #537 <Class android.view.ViewGroup$LayoutParams>
	//  319  669:dup             
	//  320  670:iconst_m1       
	//  321  671:iconst_m1       
	//  322  672:invokespecial   #540 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  323  675:invokevirtual   #684 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				getLayoutInflater().inflate(k1, ((android.view.ViewGroup) (o)));
	//  324  678:aload_0         
	//  325  679:invokevirtual   #688 <Method LayoutInflater getLayoutInflater()>
	//  326  682:iload_1         
	//  327  683:aload_0         
	//  328  684:getfield        #165 <Field LinearLayout o>
	//  329  687:invokevirtual   #694 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//  330  690:pop             
				r.addView(((View) (o)));
	//  331  691:aload_0         
	//  332  692:getfield        #531 <Field FrameLayout r>
	//  333  695:aload_0         
	//  334  696:getfield        #165 <Field LinearLayout o>
	//  335  699:invokevirtual   #559 <Method void FrameLayout.addView(View)>
			}
		}
		setContentView(((View) (r)));
	//  336  702:aload_0         
	//  337  703:aload_0         
	//  338  704:getfield        #531 <Field FrameLayout r>
	//  339  707:invokevirtual   #697 <Method void setContentView(View)>
	//  340  710:return          
	}

	public static Date sdkBuildDate()
	{
		return new Date("03/17/2017 14:23:12 -0400");
	//    0    0:new             #701 <Class Date>
	//    1    3:dup             
	//    2    4:ldc2            #703 <String "03/17/2017 14:23:12 -0400">
	//    3    7:invokespecial   #704 <Method void Date(String)>
	//    4   10:areturn         
	}

	public static String sdkVersion()
	{
		return "5.5.1";
	//    0    0:ldc2            #707 <String "5.5.1">
	//    1    3:areturn         
	}

	void a()
	{
		a(u.f() ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #259 <Field CardScanner u>
	//    3    5:invokevirtual   #709 <Method boolean CardScanner.f()>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:invokevirtual   #710 <Method void a(boolean)>
	//    7   13:return          
	}

	void a(int i1)
	{
		SurfaceView surfaceview = a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field p a>
	//    2    4:invokevirtual   #286 <Method SurfaceView io.card.payment.p.a()>
	//    3    7:astore_2        
		o o1 = g;
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field o g>
	//    6   12:astore_3        
		if(o1 != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          44
			o1.a(new Rect(surfaceview.getLeft(), surfaceview.getTop(), surfaceview.getRight(), surfaceview.getBottom()));
	//    9   17:aload_3         
	//   10   18:new             #302 <Class Rect>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:invokevirtual   #715 <Method int SurfaceView.getLeft()>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #716 <Method int SurfaceView.getTop()>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #719 <Method int SurfaceView.getRight()>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #722 <Method int SurfaceView.getBottom()>
	//   20   38:invokespecial   #724 <Method void Rect(int, int, int, int)>
	//   21   41:invokevirtual   #727 <Method void io.card.payment.o.a(Rect)>
		l = 1;
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:putfield        #265 <Field int l>
		c(0);
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:invokespecial   #271 <Method void c(int)>
		if(i1 != l)
	//*  28   54:iload_1         
	//*  29   55:aload_0         
	//*  30   56:getfield        #265 <Field int l>
	//*  31   59:icmpeq          71
			Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
	//   32   62:ldc1            #220 <String "card.io">
	//   33   64:ldc2            #729 <String "the orientation of the scanner doesn't match the orientation of the activity">
	//   34   67:invokestatic    #291 <Method int Log.wtf(String, String)>
	//   35   70:pop             
		a(new DetectionInfo());
	//   36   71:aload_0         
	//   37   72:new             #731 <Class DetectionInfo>
	//   38   75:dup             
	//   39   76:invokespecial   #732 <Method void DetectionInfo()>
	//   40   79:invokevirtual   #735 <Method void a(DetectionInfo)>
	//   41   82:return          
	}

	void a(Bitmap bitmap, DetectionInfo detectioninfo)
	{
		SecurityException securityexception;
		try
		{
			((Vibrator)getSystemService("vibrator")).vibrate(f, -1);
	//    0    0:aload_0         
	//    1    1:ldc2            #740 <String "vibrator">
	//    2    4:invokevirtual   #744 <Method Object getSystemService(String)>
	//    3    7:checkcast       #746 <Class Vibrator>
	//    4   10:getstatic       #148 <Field long[] f>
	//    5   13:iconst_m1       
	//    6   14:invokevirtual   #750 <Method void Vibrator.vibrate(long[], int)>
		}
	//*   7   17:goto            45
	//*   8   20:astore          5
	//*   9   22:ldc1            #220 <String "card.io">
	//*  10   24:ldc2            #752 <String "Exception while attempting to vibrate: ">
	//*  11   27:aload           5
	//*  12   29:invokestatic    #754 <Method int Log.w(String, String, Throwable)>
	//*  13   32:pop             
	//*  14   33:goto            45
	//*  15   36:ldc1            #220 <String "card.io">
	//*  16   38:ldc2            #756 <String "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.">
	//*  17   41:invokestatic    #256 <Method int Log.e(String, String)>
	//*  18   44:pop             
	//*  19   45:aload_0         
	//*  20   46:getfield        #259 <Field CardScanner u>
	//*  21   49:invokevirtual   #758 <Method void io.card.payment.CardScanner.c()>
	//*  22   52:aload_0         
	//*  23   53:getfield        #519 <Field RelativeLayout q>
	//*  24   56:iconst_4        
	//*  25   57:invokevirtual   #524 <Method void RelativeLayout.setVisibility(int)>
	//*  26   60:aload_2         
	//*  27   61:invokevirtual   #760 <Method boolean io.card.payment.DetectionInfo.b()>
	//*  28   64:ifeq            86
	//*  29   67:aload_0         
	//*  30   68:aload_2         
	//*  31   69:invokevirtual   #763 <Method CreditCard io.card.payment.DetectionInfo.c()>
	//*  32   72:putfield        #159 <Field CreditCard i>
	//*  33   75:aload_0         
	//*  34   76:getfield        #162 <Field o g>
	//*  35   79:aload_0         
	//*  36   80:getfield        #159 <Field CreditCard i>
	//*  37   83:invokevirtual   #766 <Method void io.card.payment.o.a(CreditCard)>
	//*  38   86:aload_0         
	//*  39   87:getfield        #265 <Field int l>
	//*  40   90:istore          4
	//*  41   92:iload           4
	//*  42   94:iconst_1        
	//*  43   95:icmpeq          127
	//*  44   98:iload           4
	//*  45  100:iconst_2        
	//*  46  101:icmpne          107
	//*  47  104:goto            127
	//*  48  107:aload_0         
	//*  49  108:getfield        #300 <Field Rect j>
	//*  50  111:getfield        #769 <Field int Rect.right>
	//*  51  114:i2f             
	//*  52  115:ldc2            #770 <Float 428F>
	//*  53  118:fdiv            
	//*  54  119:ldc2            #771 <Float 1.15F>
	//*  55  122:fmul            
	//*  56  123:fstore_3        
	//*  57  124:goto            144
	//*  58  127:aload_0         
	//*  59  128:getfield        #300 <Field Rect j>
	//*  60  131:getfield        #769 <Field int Rect.right>
	//*  61  134:i2f             
	//*  62  135:ldc2            #770 <Float 428F>
	//*  63  138:fdiv            
	//*  64  139:ldc2            #772 <Float 0.95F>
	//*  65  142:fmul            
	//*  66  143:fstore_3        
	//*  67  144:new             #774 <Class Matrix>
	//*  68  147:dup             
	//*  69  148:invokespecial   #775 <Method void Matrix()>
	//*  70  151:astore_2        
	//*  71  152:aload_2         
	//*  72  153:fload_3         
	//*  73  154:fload_3         
	//*  74  155:invokevirtual   #779 <Method boolean Matrix.postScale(float, float)>
	//*  75  158:pop             
	//*  76  159:aload_1         
	//*  77  160:iconst_0        
	//*  78  161:iconst_0        
	//*  79  162:aload_1         
	//*  80  163:invokevirtual   #782 <Method int Bitmap.getWidth()>
	//*  81  166:aload_1         
	//*  82  167:invokevirtual   #783 <Method int Bitmap.getHeight()>
	//*  83  170:aload_2         
	//*  84  171:iconst_0        
	//*  85  172:invokestatic    #787 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
	//*  86  175:astore_1        
	//*  87  176:aload_0         
	//*  88  177:getfield        #162 <Field o g>
	//*  89  180:aload_1         
	//*  90  181:invokevirtual   #790 <Method void io.card.payment.o.a(Bitmap)>
	//*  91  184:aload_0         
	//*  92  185:getfield        #792 <Field boolean n>
	//*  93  188:ifeq            220
	//*  94  191:new             #392 <Class Intent>
	//*  95  194:dup             
	//*  96  195:invokespecial   #793 <Method void Intent()>
	//*  97  198:astore_1        
	//*  98  199:aload_0         
	//*  99  200:invokevirtual   #388 <Method Intent getIntent()>
	//* 100  203:aload_1         
	//* 101  204:aload_0         
	//* 102  205:getfield        #162 <Field o g>
	//* 103  208:invokestatic    #496 <Method void io.card.payment.t.a(Intent, Intent, o)>
	//* 104  211:aload_0         
	//* 105  212:getstatic       #132 <Field int RESULT_SCAN_SUPPRESSED>
	//* 106  215:aload_1         
	//* 107  216:invokespecial   #345 <Method void a(int, Intent)>
	//* 108  219:return          
	//* 109  220:aload_0         
	//* 110  221:invokespecial   #319 <Method void h()>
	//* 111  224:return          
		// Misplaced declaration of an exception variable
		catch(SecurityException securityexception)
		{
			Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
		}
		catch(Exception exception)
		{
			Log.w("card.io", "Exception while attempting to vibrate: ", ((Throwable) (exception)));
		}
		u.c();
		q.setVisibility(4);
		if(detectioninfo.b())
		{
			i = detectioninfo.c();
			g.a(i);
		}
		int i1 = l;
		float f1;
		if(i1 != 1 && i1 != 2)
			f1 = ((float)j.right / 428F) * 1.15F;
		else
			f1 = ((float)j.right / 428F) * 0.95F;
		detectioninfo = ((DetectionInfo) (new Matrix()));
		((Matrix) (detectioninfo)).postScale(f1, f1);
		bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (detectioninfo)), false);
		g.a(bitmap);
		if(n)
		{
			bitmap = ((Bitmap) (new Intent()));
			io.card.payment.t.a(getIntent(), ((Intent) (bitmap)), g);
			a(RESULT_SCAN_SUPPRESSED, ((Intent) (bitmap)));
			return;
		} else
		{
			h();
			return;
		}
	//* 112  225:astore          5
	//* 113  227:goto            36
	}

	void a(DetectionInfo detectioninfo)
	{
		g.a(detectioninfo);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field o g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #794 <Method void io.card.payment.o.a(DetectionInfo)>
	//    4    8:return          
	}

	void a(boolean flag)
	{
		boolean flag1;
		if(a != null && g != null && u.b(flag))
	//*   0    0:aload_0         
	//*   1    1:getfield        #281 <Field p a>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #162 <Field o g>
	//*   5   11:ifnull          30
	//*   6   14:aload_0         
	//*   7   15:getfield        #259 <Field CardScanner u>
	//*   8   18:iload_1         
	//*   9   19:invokevirtual   #797 <Method boolean io.card.payment.CardScanner.b(boolean)>
	//*  10   22:ifeq            30
			flag1 = true;
	//   11   25:iconst_1        
	//   12   26:istore_2        
		else
	//*  13   27:goto            32
			flag1 = false;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		if(flag1)
	//*  16   32:iload_2         
	//*  17   33:ifeq            44
			g.b(flag);
	//   18   36:aload_0         
	//   19   37:getfield        #162 <Field o g>
	//   20   40:iload_1         
	//   21   41:invokevirtual   #799 <Method void io.card.payment.o.b(boolean)>
	//   22   44:return          
	}

	void b()
	{
		u.a(true);
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field CardScanner u>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #800 <Method void io.card.payment.CardScanner.a(boolean)>
	//    4    8:return          
	}

	public Rect getTorchRect()
	{
		o o1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field o g>
	//    2    4:astore_1        
		if(o1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return o1.e();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #804 <Method Rect o.e()>
	//    9   15:areturn         
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		super.onActivityResult(i1, j1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #808 <Method void Activity.onActivityResult(int, int, Intent)>
		if(i1 != 10)
	//*   5    7:iload_1         
	//*   6    8:bipush          10
	//*   7   10:icmpeq          14
			return;
	//    8   13:return          
		if(j1 == 0)
	//*   9   14:iload_2         
	//*  10   15:ifne            29
		{
			Log.d(e, "ignoring onActivityResult(RESULT_CANCELED) caused only when Camera Permissions are Denied in Android 23");
	//   11   18:getstatic       #140 <Field String e>
	//   12   21:ldc2            #810 <String "ignoring onActivityResult(RESULT_CANCELED) caused only when Camera Permissions are Denied in Android 23">
	//   13   24:invokestatic    #812 <Method int Log.d(String, String)>
	//   14   27:pop             
			return;
	//   15   28:return          
		}
		if(j1 != RESULT_CARD_INFO && j1 != RESULT_ENTRY_CANCELED && !v)
	//*  16   29:iload_2         
	//*  17   30:getstatic       #126 <Field int RESULT_CARD_INFO>
	//*  18   33:icmpeq          68
	//*  19   36:iload_2         
	//*  20   37:getstatic       #128 <Field int RESULT_ENTRY_CANCELED>
	//*  21   40:icmpeq          68
	//*  22   43:aload_0         
	//*  23   44:getfield        #156 <Field boolean v>
	//*  24   47:ifeq            53
	//*  25   50:goto            68
		{
			intent = ((Intent) (q));
	//   26   53:aload_0         
	//   27   54:getfield        #519 <Field RelativeLayout q>
	//   28   57:astore_3        
			if(intent != null)
	//*  29   58:aload_3         
	//*  30   59:ifnull          146
			{
				((RelativeLayout) (intent)).setVisibility(0);
	//   31   62:aload_3         
	//   32   63:iconst_0        
	//   33   64:invokevirtual   #524 <Method void RelativeLayout.setVisibility(int)>
				return;
	//   34   67:return          
			}
		} else
		{
			if(intent != null && intent.hasExtra("io.card.payment.scanResult"))
	//*  35   68:aload_3         
	//*  36   69:ifnull          130
	//*  37   72:aload_3         
	//*  38   73:ldc1            #53  <String "io.card.payment.scanResult">
	//*  39   75:invokevirtual   #466 <Method boolean Intent.hasExtra(String)>
	//*  40   78:ifeq            130
			{
				String s1 = e;
	//   41   81:getstatic       #140 <Field String e>
	//   42   84:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   43   86:new             #243 <Class StringBuilder>
	//   44   89:dup             
	//   45   90:invokespecial   #244 <Method void StringBuilder()>
	//   46   93:astore          5
				stringbuilder.append("EXTRA_SCAN_RESULT: ");
	//   47   95:aload           5
	//   48   97:ldc2            #814 <String "EXTRA_SCAN_RESULT: ">
	//   49  100:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
				stringbuilder.append(((Object) (intent.getParcelableExtra("io.card.payment.scanResult"))));
	//   51  104:aload           5
	//   52  106:aload_3         
	//   53  107:ldc1            #53  <String "io.card.payment.scanResult">
	//   54  109:invokevirtual   #818 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   55  112:invokevirtual   #350 <Method StringBuilder StringBuilder.append(Object)>
	//   56  115:pop             
				Log.v(s1, stringbuilder.toString());
	//   57  116:aload           4
	//   58  118:aload           5
	//   59  120:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   60  123:invokestatic    #820 <Method int Log.v(String, String)>
	//   61  126:pop             
			} else
	//*  62  127:goto            140
			{
				Log.d(e, "no data in EXTRA_SCAN_RESULT");
	//   63  130:getstatic       #140 <Field String e>
	//   64  133:ldc2            #822 <String "no data in EXTRA_SCAN_RESULT">
	//   65  136:invokestatic    #812 <Method int Log.d(String, String)>
	//   66  139:pop             
			}
			a(j1, intent);
	//   67  140:aload_0         
	//   68  141:iload_2         
	//   69  142:aload_3         
	//   70  143:invokespecial   #345 <Method void a(int, Intent)>
		}
	//   71  146:return          
	}

	public void onBackPressed()
	{
		if(!v && g.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field boolean v>
	//*   2    4:ifne            60
	//*   3    7:aload_0         
	//*   4    8:getfield        #162 <Field o g>
	//*   5   11:invokevirtual   #825 <Method boolean o.d()>
	//*   6   14:ifeq            60
			try
			{
				i();
	//    7   17:aload_0         
	//    8   18:invokespecial   #827 <Method boolean i()>
	//    9   21:pop             
				return;
	//   10   22:return          
			}
			catch(RuntimeException runtimeexception)
	//*  11   23:astore_1        
			{
				String s1 = e;
	//   12   24:getstatic       #140 <Field String e>
	//   13   27:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #243 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #244 <Method void StringBuilder()>
	//   17   35:astore_3        
				stringbuilder.append("*** could not return to preview: ");
	//   18   36:aload_3         
	//   19   37:ldc2            #829 <String "*** could not return to preview: ">
	//   20   40:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
				stringbuilder.append(((Object) (runtimeexception)));
	//   22   44:aload_3         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #350 <Method StringBuilder StringBuilder.append(Object)>
	//   25   49:pop             
				Log.w(s1, stringbuilder.toString());
	//   26   50:aload_2         
	//   27   51:aload_3         
	//   28   52:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   29   55:invokestatic    #333 <Method int Log.w(String, String)>
	//   30   58:pop             
				return;
	//   31   59:return          
			}
		if(u != null)
	//*  32   60:aload_0         
	//*  33   61:getfield        #259 <Field CardScanner u>
	//*  34   64:ifnull          71
			super.onBackPressed();
	//   35   67:aload_0         
	//   36   68:invokespecial   #831 <Method void Activity.onBackPressed()>
	//   37   71:return          
	}

	protected void onCreate(Bundle bundle)
	{
		String s1;
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #835 <Method void Activity.onCreate(Bundle)>
		t++;
	//    3    5:getstatic       #837 <Field int t>
	//    4    8:iconst_1        
	//    5    9:iadd            
	//    6   10:putstatic       #837 <Field int t>
		int i1 = t;
	//    7   13:getstatic       #837 <Field int t>
	//    8   16:istore_2        
		if(i1 != 1)
	//*   9   17:iload_2         
	//*  10   18:iconst_1        
	//*  11   19:icmpeq          46
			Log.i(e, String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[] {
				Integer.valueOf(i1)
			}));
	//   12   22:getstatic       #140 <Field String e>
	//   13   25:ldc2            #839 <String "INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!">
	//   14   28:iconst_1        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:iload_2         
	//   19   35:invokestatic    #433 <Method Integer Integer.valueOf(int)>
	//   20   38:aastore         
	//   21   39:invokestatic    #843 <Method String String.format(String, Object[])>
	//   22   42:invokestatic    #343 <Method int Log.i(String, String)>
	//   23   45:pop             
		Intent intent = getIntent();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #388 <Method Intent getIntent()>
	//   26   50:astore_3        
		s = getIntent().getBooleanExtra("io.card.payment.keepApplicationTheme", false);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #388 <Method Intent getIntent()>
	//   30   56:ldc1            #17  <String "io.card.payment.keepApplicationTheme">
	//   31   58:iconst_0        
	//   32   59:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   33   62:putfield        #621 <Field boolean s>
		io.card.payment.b.a.a(((Activity) (this)), s);
	//   34   65:aload_0         
	//   35   66:aload_0         
	//   36   67:getfield        #621 <Field boolean s>
	//   37   70:invokestatic    #848 <Method void a.a(Activity, boolean)>
		io.card.payment.a.b.a(intent);
	//   38   73:aload_3         
	//   39   74:invokestatic    #851 <Method void b.a(Intent)>
		n = intent.getBooleanExtra("io.card.payment.suppressScan", false);
	//   40   77:aload_0         
	//   41   78:aload_3         
	//   42   79:ldc1            #62  <String "io.card.payment.suppressScan">
	//   43   81:iconst_0        
	//   44   82:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   45   85:putfield        #792 <Field boolean n>
		s1 = io.card.payment.t.a(getPackageManager().resolveActivity(intent, 0x10000), io/card/payment/CardIOActivity);
	//   46   88:aload_0         
	//   47   89:invokevirtual   #855 <Method PackageManager getPackageManager()>
	//   48   92:aload_3         
	//   49   93:ldc2            #856 <Int 0x10000>
	//   50   96:invokevirtual   #862 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   51   99:ldc1            #2   <Class CardIOActivity>
	//   52  101:invokestatic    #865 <Method String io.card.payment.t.a(android.content.pm.ResolveInfo, Class)>
	//   53  104:astore          4
		if(s1 != null)
			break MISSING_BLOCK_LABEL_266;
	//   54  106:aload           4
	//   55  108:ifnonnull       266
		m = intent.getBooleanExtra("io.card.payment.suppressManual", false);
	//   56  111:aload_0         
	//   57  112:aload_3         
	//   58  113:ldc1            #59  <String "io.card.payment.suppressManual">
	//   59  115:iconst_0        
	//   60  116:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   61  119:putfield        #339 <Field boolean m>
		if(bundle != null)
	//*  62  122:aload_1         
	//*  63  123:ifnull          137
			p = bundle.getBoolean("io.card.payment.waitingForPermission");
	//   64  126:aload_0         
	//   65  127:aload_1         
	//   66  128:ldc2            #867 <String "io.card.payment.waitingForPermission">
	//   67  131:invokevirtual   #872 <Method boolean Bundle.getBoolean(String)>
	//   68  134:putfield        #874 <Field boolean p>
		if(intent.getBooleanExtra("io.card.payment.noCamera", false))
	//*  69  137:aload_3         
	//*  70  138:ldc1            #23  <String "io.card.payment.noCamera">
	//*  71  140:iconst_0        
	//*  72  141:invokevirtual   #396 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  73  144:ifeq            162
		{
			Log.i("card.io", "EXTRA_NO_CAMERA set to true. Skipping camera.");
	//   74  147:ldc1            #220 <String "card.io">
	//   75  149:ldc2            #876 <String "EXTRA_NO_CAMERA set to true. Skipping camera.">
	//   76  152:invokestatic    #343 <Method int Log.i(String, String)>
	//   77  155:pop             
			v = true;
	//   78  156:aload_0         
	//   79  157:iconst_1        
	//   80  158:putfield        #156 <Field boolean v>
			return;
	//   81  161:return          
		}
		if(!io.card.payment.CardScanner.a())
	//*  82  162:invokestatic    #877 <Method boolean io.card.payment.CardScanner.a()>
	//*  83  165:ifne            183
		{
			Log.i("card.io", "Processor not Supported. Skipping camera.");
	//   84  168:ldc1            #220 <String "card.io">
	//   85  170:ldc2            #879 <String "Processor not Supported. Skipping camera.">
	//   86  173:invokestatic    #343 <Method int Log.i(String, String)>
	//   87  176:pop             
			v = true;
	//   88  177:aload_0         
	//   89  178:iconst_1        
	//   90  179:putfield        #156 <Field boolean v>
			return;
	//   91  182:return          
		}
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_250;
	//   92  183:getstatic       #361 <Field int android.os.Build$VERSION.SDK_INT>
	//   93  186:bipush          23
	//   94  188:icmplt          250
		if(p)
			break MISSING_BLOCK_LABEL_265;
	//   95  191:aload_0         
	//   96  192:getfield        #874 <Field boolean p>
	//   97  195:ifne            265
		if(checkSelfPermission("android.permission.CAMERA") == -1)
	//*  98  198:aload_0         
	//*  99  199:ldc2            #881 <String "android.permission.CAMERA">
	//* 100  202:invokevirtual   #885 <Method int checkSelfPermission(String)>
	//* 101  205:iconst_m1       
	//* 102  206:icmpne          241
		{
			Log.d(e, "permission denied to camera - requesting it");
	//  103  209:getstatic       #140 <Field String e>
	//  104  212:ldc2            #887 <String "permission denied to camera - requesting it">
	//  105  215:invokestatic    #812 <Method int Log.d(String, String)>
	//  106  218:pop             
			p = true;
	//  107  219:aload_0         
	//  108  220:iconst_1        
	//  109  221:putfield        #874 <Field boolean p>
			requestPermissions(new String[] {
				"android.permission.CAMERA"
			}, 11);
	//  110  224:aload_0         
	//  111  225:iconst_1        
	//  112  226:anewarray       String[]
	//  113  229:dup             
	//  114  230:iconst_0        
	//  115  231:ldc2            #881 <String "android.permission.CAMERA">
	//  116  234:aastore         
	//  117  235:bipush          11
	//  118  237:invokevirtual   #891 <Method void requestPermissions(String[], int)>
			return;
	//  119  240:return          
		}
		try
		{
			f();
	//  120  241:aload_0         
	//  121  242:invokespecial   #893 <Method void f()>
			c();
	//  122  245:aload_0         
	//  123  246:invokespecial   #894 <Method void c()>
			return;
	//  124  249:return          
		}
	//* 125  250:aload_0         
	//* 126  251:invokespecial   #893 <Method void f()>
	//* 127  254:aload_0         
	//* 128  255:invokespecial   #896 <Method void d()>
	//* 129  258:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//* 130  259:astore_1        
		{
			a(((Exception) (bundle)));
	//  131  260:aload_0         
	//  132  261:aload_1         
	//  133  262:invokespecial   #460 <Method void a(Exception)>
		}
		break MISSING_BLOCK_LABEL_265;
		f();
		d();
		return;
		return;
	//  134  265:return          
		throw new RuntimeException(s1);
	//  135  266:new             #324 <Class RuntimeException>
	//  136  269:dup             
	//  137  270:aload           4
	//  138  272:invokespecial   #897 <Method void RuntimeException(String)>
	//  139  275:athrow          
	}

	protected void onDestroy()
	{
		g = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #162 <Field o g>
		t--;
	//    3    5:getstatic       #837 <Field int t>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:putstatic       #837 <Field int t>
		Object obj = ((Object) (h));
	//    7   13:aload_0         
	//    8   14:getfield        #458 <Field OrientationEventListener h>
	//    9   17:astore_1        
		if(obj != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          26
			((OrientationEventListener) (obj)).disable();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #903 <Method void OrientationEventListener.disable()>
		a(false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #710 <Method void a(boolean)>
		obj = ((Object) (u));
	//   17   31:aload_0         
	//   18   32:getfield        #259 <Field CardScanner u>
	//   19   35:astore_1        
		if(obj != null)
	//*  20   36:aload_1         
	//*  21   37:ifnull          49
		{
			((CardScanner) (obj)).d();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #904 <Method void CardScanner.d()>
			u = null;
	//   24   44:aload_0         
	//   25   45:aconst_null     
	//   26   46:putfield        #259 <Field CardScanner u>
		}
		super.onDestroy();
	//   27   49:aload_0         
	//   28   50:invokespecial   #906 <Method void Activity.onDestroy()>
	//   29   53:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #909 <Method void Activity.onPause()>
		Object obj = ((Object) (h));
	//    2    4:aload_0         
	//    3    5:getfield        #458 <Field OrientationEventListener h>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((OrientationEventListener) (obj)).disable();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #903 <Method void OrientationEventListener.disable()>
		a(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #710 <Method void a(boolean)>
		obj = ((Object) (u));
	//   12   22:aload_0         
	//   13   23:getfield        #259 <Field CardScanner u>
	//   14   26:astore_1        
		if(obj != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          35
			((CardScanner) (obj)).c();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #758 <Method void io.card.payment.CardScanner.c()>
	//   19   35:return          
	}

	public void onRequestPermissionsResult(int i1, String as[], int ai[])
	{
		if(i1 == 11)
	//*   0    0:iload_1         
	//*   1    1:bipush          11
	//*   2    3:icmpne          32
		{
			p = false;
	//    3    6:aload_0         
	//    4    7:iconst_0        
	//    5    8:putfield        #874 <Field boolean p>
			if(ai.length > 0 && ai[0] == 0)
	//*   6   11:aload_3         
	//*   7   12:arraylength     
	//*   8   13:ifle            27
	//*   9   16:aload_3         
	//*  10   17:iconst_0        
	//*  11   18:iaload          
	//*  12   19:ifne            27
			{
				g();
	//   13   22:aload_0         
	//   14   23:invokespecial   #279 <Method void g()>
				return;
	//   15   26:return          
			}
			v = true;
	//   16   27:aload_0         
	//   17   28:iconst_1        
	//   18   29:putfield        #156 <Field boolean v>
		}
	//   19   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #914 <Method void Activity.onResume()>
		if(!p)
	//*   2    4:aload_0         
	//*   3    5:getfield        #874 <Field boolean p>
	//*   4    8:ifne            109
		{
			if(v)
	//*   5   11:aload_0         
	//*   6   12:getfield        #156 <Field boolean v>
	//*   7   15:ifeq            23
			{
				h();
	//    8   18:aload_0         
	//    9   19:invokespecial   #319 <Method void h()>
				return;
	//   10   22:return          
			}
			io.card.payment.t.c();
	//   11   23:invokestatic    #915 <Method void io.card.payment.t.c()>
			getWindow().addFlags(1024);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #365 <Method Window getWindow()>
	//   14   30:sipush          1024
	//   15   33:invokevirtual   #918 <Method void Window.addFlags(int)>
			getWindow().addFlags(128);
	//   16   36:aload_0         
	//   17   37:invokevirtual   #365 <Method Window getWindow()>
	//   18   40:sipush          128
	//   19   43:invokevirtual   #918 <Method void Window.addFlags(int)>
			io.card.payment.b.a.b(((Activity) (this)));
	//   20   46:aload_0         
	//   21   47:invokestatic    #921 <Method void a.b(Activity)>
			setRequestedOrientation(1);
	//   22   50:aload_0         
	//   23   51:iconst_1        
	//   24   52:invokevirtual   #924 <Method void setRequestedOrientation(int)>
			h.enable();
	//   25   55:aload_0         
	//   26   56:getfield        #458 <Field OrientationEventListener h>
	//   27   59:invokevirtual   #927 <Method void OrientationEventListener.enable()>
			if(!i())
	//*  28   62:aload_0         
	//*  29   63:invokespecial   #827 <Method boolean i()>
	//*  30   66:ifne            96
			{
				Log.e(e, "Could not connect to camera.");
	//   31   69:getstatic       #140 <Field String e>
	//   32   72:ldc2            #929 <String "Could not connect to camera.">
	//   33   75:invokestatic    #256 <Method int Log.e(String, String)>
	//   34   78:pop             
				a(io.card.payment.a.b.a(c.t));
	//   35   79:aload_0         
	//   36   80:getstatic       #213 <Field c c.t>
	//   37   83:invokestatic    #218 <Method String b.a(c)>
	//   38   86:invokespecial   #930 <Method void a(String)>
				h();
	//   39   89:aload_0         
	//   40   90:invokespecial   #319 <Method void h()>
			} else
	//*  41   93:goto            101
			{
				a(false);
	//   42   96:aload_0         
	//   43   97:iconst_0        
	//   44   98:invokevirtual   #710 <Method void a(boolean)>
			}
			b(k);
	//   45  101:aload_0         
	//   46  102:aload_0         
	//   47  103:getfield        #267 <Field int k>
	//   48  106:invokespecial   #207 <Method void b(int)>
		}
	//   49  109:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #933 <Method void Activity.onSaveInstanceState(Bundle)>
		bundle.putBoolean("io.card.payment.waitingForPermission", p);
	//    3    5:aload_1         
	//    4    6:ldc2            #867 <String "io.card.payment.waitingForPermission">
	//    5    9:aload_0         
	//    6   10:getfield        #874 <Field boolean p>
	//    7   13:invokevirtual   #937 <Method void Bundle.putBoolean(String, boolean)>
	//    8   16:return          
	}

	public static final String EXTRA_CAPTURED_CARD_IMAGE = "io.card.payment.capturedCardImage";
	public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
	public static final String EXTRA_HIDE_CARDIO_LOGO = "io.card.payment.hideLogo";
	public static final String EXTRA_KEEP_APPLICATION_THEME = "io.card.payment.keepApplicationTheme";
	public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
	public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
	public static final String EXTRA_REQUIRE_CARDHOLDER_NAME = "io.card.payment.requireCardholderName";
	public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
	public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
	public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
	public static final String EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY = "io.card.payment.restrictPostalCodeToNumericOnly";
	public static final String EXTRA_RETURN_CARD_IMAGE = "io.card.payment.returnCardImage";
	public static final String EXTRA_SCAN_EXPIRY = "io.card.payment.scanExpiry";
	public static final String EXTRA_SCAN_INSTRUCTIONS = "io.card.payment.scanInstructions";
	public static final String EXTRA_SCAN_OVERLAY_LAYOUT_ID = "io.card.payment.scanOverlayLayoutId";
	public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
	public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
	public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
	public static final String EXTRA_SUPPRESS_SCAN = "io.card.payment.suppressScan";
	public static final String EXTRA_UNBLUR_DIGITS = "io.card.payment.unblurDigits";
	public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
	public static final String EXTRA_USE_PAYPAL_ACTIONBAR_ICON = "io.card.payment.intentSenderIsPayPal";
	public static final int RESULT_CARD_INFO;
	public static final int RESULT_CONFIRMATION_SUPPRESSED;
	public static final int RESULT_ENTRY_CANCELED;
	public static final int RESULT_SCAN_NOT_AVAILABLE;
	public static final int RESULT_SCAN_SUPPRESSED;
	static Bitmap b = null;
	static final boolean c = ((Class) (io/card/payment/CardIOActivity)).desiredAssertionStatus() ^ true;
	private static int d;
	private static final String e = ((Class) (io/card/payment/CardIOActivity)).getSimpleName();
	private static final long f[] = {
		0L, 70L, 10L, 40L
	};
	private static int t;
	p a;
	private o g;
	private OrientationEventListener h;
	private CreditCard i;
	private Rect j;
	private int k;
	private int l;
	private boolean m;
	private boolean n;
	private LinearLayout o;
	private boolean p;
	private RelativeLayout q;
	private FrameLayout r;
	private boolean s;
	private CardScanner u;
	private boolean v;

	static 
	{
	//    0    0:ldc1            #2   <Class CardIOActivity>
	//    1    2:invokevirtual   #119 <Method boolean Class.desiredAssertionStatus()>
	//    2    5:iconst_1        
	//    3    6:ixor            
	//    4    7:putstatic       #121 <Field boolean c>
		d = 0xca8d10;
	//    5   10:ldc1            #122 <Int 0xca8d10>
	//    6   12:putstatic       #124 <Field int d>
		int i1 = d;
	//    7   15:getstatic       #124 <Field int d>
	//    8   18:istore_0        
		d = i1 + 1;
	//    9   19:iload_0         
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putstatic       #124 <Field int d>
		RESULT_CARD_INFO = i1;
	//   13   25:iload_0         
	//   14   26:putstatic       #126 <Field int RESULT_CARD_INFO>
		i1 = d;
	//   15   29:getstatic       #124 <Field int d>
	//   16   32:istore_0        
		d = i1 + 1;
	//   17   33:iload_0         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putstatic       #124 <Field int d>
		RESULT_ENTRY_CANCELED = i1;
	//   21   39:iload_0         
	//   22   40:putstatic       #128 <Field int RESULT_ENTRY_CANCELED>
		i1 = d;
	//   23   43:getstatic       #124 <Field int d>
	//   24   46:istore_0        
		d = i1 + 1;
	//   25   47:iload_0         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:putstatic       #124 <Field int d>
		RESULT_SCAN_NOT_AVAILABLE = i1;
	//   29   53:iload_0         
	//   30   54:putstatic       #130 <Field int RESULT_SCAN_NOT_AVAILABLE>
		i1 = d;
	//   31   57:getstatic       #124 <Field int d>
	//   32   60:istore_0        
		d = i1 + 1;
	//   33   61:iload_0         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:putstatic       #124 <Field int d>
		RESULT_SCAN_SUPPRESSED = i1;
	//   37   67:iload_0         
	//   38   68:putstatic       #132 <Field int RESULT_SCAN_SUPPRESSED>
		i1 = d;
	//   39   71:getstatic       #124 <Field int d>
	//   40   74:istore_0        
		d = i1 + 1;
	//   41   75:iload_0         
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:putstatic       #124 <Field int d>
		RESULT_CONFIRMATION_SUPPRESSED = i1;
	//   45   81:iload_0         
	//   46   82:putstatic       #134 <Field int RESULT_CONFIRMATION_SUPPRESSED>
	//   47   85:ldc1            #2   <Class CardIOActivity>
	//   48   87:invokevirtual   #138 <Method String Class.getSimpleName()>
	//   49   90:putstatic       #140 <Field String e>
	//   50   93:iconst_4        
	//   51   94:newarray        long[]
	//   52   96:dup             
	//   53   97:iconst_0        
	//   54   98:lconst_0        
	//   55   99:lastore         
	//   56  100:dup             
	//   57  101:iconst_1        
	//   58  102:ldc2w           #141 <Long 70L>
	//   59  105:lastore         
	//   60  106:dup             
	//   61  107:iconst_2        
	//   62  108:ldc2w           #143 <Long 10L>
	//   63  111:lastore         
	//   64  112:dup             
	//   65  113:iconst_3        
	//   66  114:ldc2w           #145 <Long 40L>
	//   67  117:lastore         
	//   68  118:putstatic       #148 <Field long[] f>
	//   69  121:aconst_null     
	//   70  122:putstatic       #150 <Field Bitmap b>
	//*  71  125:return          
	}
}
