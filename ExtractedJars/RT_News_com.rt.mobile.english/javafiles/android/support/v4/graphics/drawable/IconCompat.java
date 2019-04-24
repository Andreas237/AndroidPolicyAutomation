// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v4.content.ContextCompat;

public class IconCompat
{

	private IconCompat(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int mType>
	//    5    9:return          
	}

	static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean flag)
	{
		int i = (int)(0.6666667F * (float)Math.min(bitmap.getWidth(), bitmap.getHeight()));
	//    0    0:ldc1            #14  <Float 0.6666667F>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #52  <Method int Bitmap.getWidth()>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #55  <Method int Bitmap.getHeight()>
	//    5   10:invokestatic    #61  <Method int Math.min(int, int)>
	//    6   13:i2f             
	//    7   14:fmul            
	//    8   15:f2i             
	//    9   16:istore          6
		Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   10   18:iload           6
	//   11   20:iload           6
	//   12   22:getstatic       #67  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   13   25:invokestatic    #71  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   14   28:astore          7
		Canvas canvas = new Canvas(bitmap1);
	//   15   30:new             #73  <Class Canvas>
	//   16   33:dup             
	//   17   34:aload           7
	//   18   36:invokespecial   #76  <Method void Canvas(Bitmap)>
	//   19   39:astore          8
		Paint paint = new Paint(3);
	//   20   41:new             #78  <Class Paint>
	//   21   44:dup             
	//   22   45:iconst_3        
	//   23   46:invokespecial   #80  <Method void Paint(int)>
	//   24   49:astore          9
		float f = i;
	//   25   51:iload           6
	//   26   53:i2f             
	//   27   54:fstore_2        
		float f1 = 0.5F * f;
	//   28   55:ldc1            #81  <Float 0.5F>
	//   29   57:fload_2         
	//   30   58:fmul            
	//   31   59:fstore_3        
		float f2 = 0.9166667F * f1;
	//   32   60:ldc1            #16  <Float 0.9166667F>
	//   33   62:fload_3         
	//   34   63:fmul            
	//   35   64:fstore          4
		if(flag)
	//*  36   66:iload_1         
	//*  37   67:ifeq            134
		{
			float f3 = 0.01041667F * f;
	//   38   70:ldc1            #12  <Float 0.01041667F>
	//   39   72:fload_2         
	//   40   73:fmul            
	//   41   74:fstore          5
			paint.setColor(0);
	//   42   76:aload           9
	//   43   78:iconst_0        
	//   44   79:invokevirtual   #84  <Method void Paint.setColor(int)>
			paint.setShadowLayer(f3, 0.0F, 0.02083333F * f, 0x3d000000);
	//   45   82:aload           9
	//   46   84:fload           5
	//   47   86:fconst_0        
	//   48   87:ldc1            #20  <Float 0.02083333F>
	//   49   89:fload_2         
	//   50   90:fmul            
	//   51   91:ldc1            #85  <Int 0x3d000000>
	//   52   93:invokevirtual   #89  <Method void Paint.setShadowLayer(float, float, float, int)>
			canvas.drawCircle(f1, f1, f2, paint);
	//   53   96:aload           8
	//   54   98:fload_3         
	//   55   99:fload_3         
	//   56  100:fload           4
	//   57  102:aload           9
	//   58  104:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
			paint.setShadowLayer(f3, 0.0F, 0.0F, 0x1e000000);
	//   59  107:aload           9
	//   60  109:fload           5
	//   61  111:fconst_0        
	//   62  112:fconst_0        
	//   63  113:ldc1            #94  <Int 0x1e000000>
	//   64  115:invokevirtual   #89  <Method void Paint.setShadowLayer(float, float, float, int)>
			canvas.drawCircle(f1, f1, f2, paint);
	//   65  118:aload           8
	//   66  120:fload_3         
	//   67  121:fload_3         
	//   68  122:fload           4
	//   69  124:aload           9
	//   70  126:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
			paint.clearShadowLayer();
	//   71  129:aload           9
	//   72  131:invokevirtual   #97  <Method void Paint.clearShadowLayer()>
		}
		paint.setColor(0xff000000);
	//   73  134:aload           9
	//   74  136:ldc1            #98  <Int 0xff000000>
	//   75  138:invokevirtual   #84  <Method void Paint.setColor(int)>
		BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
	//   76  141:new             #100 <Class BitmapShader>
	//   77  144:dup             
	//   78  145:aload_0         
	//   79  146:getstatic       #106 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   80  149:getstatic       #106 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   81  152:invokespecial   #109 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   82  155:astore          10
		Matrix matrix = new Matrix();
	//   83  157:new             #111 <Class Matrix>
	//   84  160:dup             
	//   85  161:invokespecial   #112 <Method void Matrix()>
	//   86  164:astore          11
		matrix.setTranslate(-(bitmap.getWidth() - i) / 2, -(bitmap.getHeight() - i) / 2);
	//   87  166:aload           11
	//   88  168:aload_0         
	//   89  169:invokevirtual   #52  <Method int Bitmap.getWidth()>
	//   90  172:iload           6
	//   91  174:isub            
	//   92  175:ineg            
	//   93  176:iconst_2        
	//   94  177:idiv            
	//   95  178:i2f             
	//   96  179:aload_0         
	//   97  180:invokevirtual   #55  <Method int Bitmap.getHeight()>
	//   98  183:iload           6
	//   99  185:isub            
	//  100  186:ineg            
	//  101  187:iconst_2        
	//  102  188:idiv            
	//  103  189:i2f             
	//  104  190:invokevirtual   #116 <Method void Matrix.setTranslate(float, float)>
		bitmapshader.setLocalMatrix(matrix);
	//  105  193:aload           10
	//  106  195:aload           11
	//  107  197:invokevirtual   #120 <Method void BitmapShader.setLocalMatrix(Matrix)>
		paint.setShader(((android.graphics.Shader) (bitmapshader)));
	//  108  200:aload           9
	//  109  202:aload           10
	//  110  204:invokevirtual   #124 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  111  207:pop             
		canvas.drawCircle(f1, f1, f2, paint);
	//  112  208:aload           8
	//  113  210:fload_3         
	//  114  211:fload_3         
	//  115  212:fload           4
	//  116  214:aload           9
	//  117  216:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.setBitmap(((Bitmap) (null)));
	//  118  219:aload           8
	//  119  221:aconst_null     
	//  120  222:invokevirtual   #127 <Method void Canvas.setBitmap(Bitmap)>
		return bitmap1;
	//  121  225:aload           7
	//  122  227:areturn         
	}

	public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Bitmap must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #134 <String "Bitmap must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			IconCompat iconcompat = new IconCompat(5);
	//    7   14:new             #2   <Class IconCompat>
	//    8   17:dup             
	//    9   18:iconst_5        
	//   10   19:invokespecial   #138 <Method void IconCompat(int)>
	//   11   22:astore_1        
			iconcompat.mObj1 = ((Object) (bitmap));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:putfield        #140 <Field Object mObj1>
			return iconcompat;
	//   15   28:aload_1         
	//   16   29:areturn         
		}
	}

	public static IconCompat createWithBitmap(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Bitmap must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #134 <String "Bitmap must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			IconCompat iconcompat = new IconCompat(1);
	//    7   14:new             #2   <Class IconCompat>
	//    8   17:dup             
	//    9   18:iconst_1        
	//   10   19:invokespecial   #138 <Method void IconCompat(int)>
	//   11   22:astore_1        
			iconcompat.mObj1 = ((Object) (bitmap));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:putfield        #140 <Field Object mObj1>
			return iconcompat;
	//   15   28:aload_1         
	//   16   29:areturn         
		}
	}

	public static IconCompat createWithContentUri(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Uri must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #145 <String "Uri must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return createWithContentUri(uri.toString());
	//    7   14:aload_0         
	//    8   15:invokevirtual   #151 <Method String Uri.toString()>
	//    9   18:invokestatic    #154 <Method IconCompat createWithContentUri(String)>
	//   10   21:areturn         
	}

	public static IconCompat createWithContentUri(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Uri must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #145 <String "Uri must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			IconCompat iconcompat = new IconCompat(4);
	//    7   14:new             #2   <Class IconCompat>
	//    8   17:dup             
	//    9   18:iconst_4        
	//   10   19:invokespecial   #138 <Method void IconCompat(int)>
	//   11   22:astore_1        
			iconcompat.mObj1 = ((Object) (s));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:putfield        #140 <Field Object mObj1>
			return iconcompat;
	//   15   28:aload_1         
	//   16   29:areturn         
		}
	}

	public static IconCompat createWithData(byte abyte0[], int i, int j)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Data must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #158 <String "Data must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			IconCompat iconcompat = new IconCompat(3);
	//    7   14:new             #2   <Class IconCompat>
	//    8   17:dup             
	//    9   18:iconst_3        
	//   10   19:invokespecial   #138 <Method void IconCompat(int)>
	//   11   22:astore_3        
			iconcompat.mObj1 = ((Object) (abyte0));
	//   12   23:aload_3         
	//   13   24:aload_0         
	//   14   25:putfield        #140 <Field Object mObj1>
			iconcompat.mInt1 = i;
	//   15   28:aload_3         
	//   16   29:iload_1         
	//   17   30:putfield        #160 <Field int mInt1>
			iconcompat.mInt2 = j;
	//   18   33:aload_3         
	//   19   34:iload_2         
	//   20   35:putfield        #162 <Field int mInt2>
			return iconcompat;
	//   21   38:aload_3         
	//   22   39:areturn         
		}
	}

	public static IconCompat createWithResource(Context context, int i)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Context must not be null.");
	//    2    4:new             #132 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #167 <String "Context must not be null.">
	//    5   10:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			IconCompat iconcompat = new IconCompat(2);
	//    7   14:new             #2   <Class IconCompat>
	//    8   17:dup             
	//    9   18:iconst_2        
	//   10   19:invokespecial   #138 <Method void IconCompat(int)>
	//   11   22:astore_2        
			iconcompat.mInt1 = i;
	//   12   23:aload_2         
	//   13   24:iload_1         
	//   14   25:putfield        #160 <Field int mInt1>
			iconcompat.mObj1 = ((Object) (context));
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:putfield        #140 <Field Object mObj1>
			return iconcompat;
	//   18   33:aload_2         
	//   19   34:areturn         
		}
	}

	public void addToShortcutIntent(Intent intent)
	{
		addToShortcutIntent(intent, ((Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #179 <Method void addToShortcutIntent(Intent, Drawable)>
	//    4    6:return          
	}

	public void addToShortcutIntent(Intent intent, Drawable drawable)
	{
		int i = mType;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mType>
	//    2    4:istore_3        
		Object obj;
		if(i != 5)
	//*   3    5:iload_3         
	//*   4    6:iconst_5        
	//*   5    7:icmpeq          219
			switch(i)
	//*   6   10:iload_3         
			{
	//*   7   11:tableswitch     1 2: default 32
	//	               1 186
	//	               2 42
			default:
				throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
	//    8   32:new             #132 <Class IllegalArgumentException>
	//    9   35:dup             
	//   10   36:ldc1            #183 <String "Icon type not supported for intent shortcuts">
	//   11   38:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//   12   41:athrow          

			case 2: // '\002'
				if(drawable == null)
	//*  13   42:aload_2         
	//*  14   43:ifnonnull       68
				{
					intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ((android.os.Parcelable) (android.content.Intent.ShortcutIconResource.fromContext((Context)mObj1, mInt1))));
	//   15   46:aload_1         
	//   16   47:ldc1            #185 <String "android.intent.extra.shortcut.ICON_RESOURCE">
	//   17   49:aload_0         
	//   18   50:getfield        #140 <Field Object mObj1>
	//   19   53:checkcast       #187 <Class Context>
	//   20   56:aload_0         
	//   21   57:getfield        #160 <Field int mInt1>
	//   22   60:invokestatic    #193 <Method android.content.Intent$ShortcutIconResource android.content.Intent$ShortcutIconResource.fromContext(Context, int)>
	//   23   63:invokevirtual   #199 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   24   66:pop             
					return;
	//   25   67:return          
				}
				obj = ((Object) ((Context)mObj1));
	//   26   68:aload_0         
	//   27   69:getfield        #140 <Field Object mObj1>
	//   28   72:checkcast       #187 <Class Context>
	//   29   75:astore          5
				Drawable drawable1 = ContextCompat.getDrawable(((Context) (obj)), mInt1);
	//   30   77:aload           5
	//   31   79:aload_0         
	//   32   80:getfield        #160 <Field int mInt1>
	//   33   83:invokestatic    #205 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   34   86:astore          6
				if(drawable1.getIntrinsicWidth() > 0 && drawable1.getIntrinsicHeight() > 0)
	//*  35   88:aload           6
	//*  36   90:invokevirtual   #210 <Method int Drawable.getIntrinsicWidth()>
	//*  37   93:ifle            128
	//*  38   96:aload           6
	//*  39   98:invokevirtual   #213 <Method int Drawable.getIntrinsicHeight()>
	//*  40  101:ifgt            107
	//*  41  104:goto            128
				{
					obj = ((Object) (Bitmap.createBitmap(drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//   42  107:aload           6
	//   43  109:invokevirtual   #210 <Method int Drawable.getIntrinsicWidth()>
	//   44  112:aload           6
	//   45  114:invokevirtual   #213 <Method int Drawable.getIntrinsicHeight()>
	//   46  117:getstatic       #67  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   47  120:invokestatic    #71  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   48  123:astore          5
				} else
	//*  49  125:goto            152
				{
					int j = ((ActivityManager)((Context) (obj)).getSystemService("activity")).getLauncherLargeIconSize();
	//   50  128:aload           5
	//   51  130:ldc1            #215 <String "activity">
	//   52  132:invokevirtual   #219 <Method Object Context.getSystemService(String)>
	//   53  135:checkcast       #221 <Class ActivityManager>
	//   54  138:invokevirtual   #224 <Method int ActivityManager.getLauncherLargeIconSize()>
	//   55  141:istore_3        
					obj = ((Object) (Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888)));
	//   56  142:iload_3         
	//   57  143:iload_3         
	//   58  144:getstatic       #67  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   59  147:invokestatic    #71  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   60  150:astore          5
				}
				drawable1.setBounds(0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
	//   61  152:aload           6
	//   62  154:iconst_0        
	//   63  155:iconst_0        
	//   64  156:aload           5
	//   65  158:invokevirtual   #52  <Method int Bitmap.getWidth()>
	//   66  161:aload           5
	//   67  163:invokevirtual   #55  <Method int Bitmap.getHeight()>
	//   68  166:invokevirtual   #228 <Method void Drawable.setBounds(int, int, int, int)>
				drawable1.draw(new Canvas(((Bitmap) (obj))));
	//   69  169:aload           6
	//   70  171:new             #73  <Class Canvas>
	//   71  174:dup             
	//   72  175:aload           5
	//   73  177:invokespecial   #76  <Method void Canvas(Bitmap)>
	//   74  180:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
				break;

	//*  75  183:goto            232
			case 1: // '\001'
				Bitmap bitmap = (Bitmap)mObj1;
	//   76  186:aload_0         
	//   77  187:getfield        #140 <Field Object mObj1>
	//   78  190:checkcast       #48  <Class Bitmap>
	//   79  193:astore          6
				obj = ((Object) (bitmap));
	//   80  195:aload           6
	//   81  197:astore          5
				if(drawable != null)
	//*  82  199:aload_2         
	//*  83  200:ifnull          232
					obj = ((Object) (bitmap.copy(bitmap.getConfig(), true)));
	//   84  203:aload           6
	//   85  205:aload           6
	//   86  207:invokevirtual   #236 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   87  210:iconst_1        
	//   88  211:invokevirtual   #240 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   89  214:astore          5
				break;
			}
		else
	//*  90  216:goto            232
			obj = ((Object) (createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, true)));
	//   91  219:aload_0         
	//   92  220:getfield        #140 <Field Object mObj1>
	//   93  223:checkcast       #48  <Class Bitmap>
	//   94  226:iconst_1        
	//   95  227:invokestatic    #242 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap, boolean)>
	//   96  230:astore          5
		if(drawable != null)
	//*  97  232:aload_2         
	//*  98  233:ifnull          276
		{
			int k = ((Bitmap) (obj)).getWidth();
	//   99  236:aload           5
	//  100  238:invokevirtual   #52  <Method int Bitmap.getWidth()>
	//  101  241:istore_3        
			int l = ((Bitmap) (obj)).getHeight();
	//  102  242:aload           5
	//  103  244:invokevirtual   #55  <Method int Bitmap.getHeight()>
	//  104  247:istore          4
			drawable.setBounds(k / 2, l / 2, k, l);
	//  105  249:aload_2         
	//  106  250:iload_3         
	//  107  251:iconst_2        
	//  108  252:idiv            
	//  109  253:iload           4
	//  110  255:iconst_2        
	//  111  256:idiv            
	//  112  257:iload_3         
	//  113  258:iload           4
	//  114  260:invokevirtual   #228 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(new Canvas(((Bitmap) (obj))));
	//  115  263:aload_2         
	//  116  264:new             #73  <Class Canvas>
	//  117  267:dup             
	//  118  268:aload           5
	//  119  270:invokespecial   #76  <Method void Canvas(Bitmap)>
	//  120  273:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
		}
		intent.putExtra("android.intent.extra.shortcut.ICON", ((android.os.Parcelable) (obj)));
	//  121  276:aload_1         
	//  122  277:ldc1            #244 <String "android.intent.extra.shortcut.ICON">
	//  123  279:aload           5
	//  124  281:invokevirtual   #199 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  125  284:pop             
	//  126  285:return          
	}

	public Icon toIcon()
	{
		switch(mType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int mType>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 129
	//	               2 114
	//	               3 95
	//	               4 84
	//	               5 50
		default:
			throw new IllegalArgumentException("Unknown type");
	//    3   40:new             #132 <Class IllegalArgumentException>
	//    4   43:dup             
	//    5   44:ldc1            #250 <String "Unknown type">
	//    6   46:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    7   49:athrow          

		case 5: // '\005'
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   8   50:getstatic       #255 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   53:bipush          26
	//*  10   55:icmplt          69
				return Icon.createWithAdaptiveBitmap((Bitmap)mObj1);
	//   11   58:aload_0         
	//   12   59:getfield        #140 <Field Object mObj1>
	//   13   62:checkcast       #48  <Class Bitmap>
	//   14   65:invokestatic    #260 <Method Icon Icon.createWithAdaptiveBitmap(Bitmap)>
	//   15   68:areturn         
			else
				return Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false));
	//   16   69:aload_0         
	//   17   70:getfield        #140 <Field Object mObj1>
	//   18   73:checkcast       #48  <Class Bitmap>
	//   19   76:iconst_0        
	//   20   77:invokestatic    #242 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap, boolean)>
	//   21   80:invokestatic    #262 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   22   83:areturn         

		case 4: // '\004'
			return Icon.createWithContentUri((String)mObj1);
	//   23   84:aload_0         
	//   24   85:getfield        #140 <Field Object mObj1>
	//   25   88:checkcast       #264 <Class String>
	//   26   91:invokestatic    #267 <Method Icon Icon.createWithContentUri(String)>
	//   27   94:areturn         

		case 3: // '\003'
			return Icon.createWithData((byte[])mObj1, mInt1, mInt2);
	//   28   95:aload_0         
	//   29   96:getfield        #140 <Field Object mObj1>
	//   30   99:checkcast       #269 <Class byte[]>
	//   31  102:aload_0         
	//   32  103:getfield        #160 <Field int mInt1>
	//   33  106:aload_0         
	//   34  107:getfield        #162 <Field int mInt2>
	//   35  110:invokestatic    #272 <Method Icon Icon.createWithData(byte[], int, int)>
	//   36  113:areturn         

		case 2: // '\002'
			return Icon.createWithResource((Context)mObj1, mInt1);
	//   37  114:aload_0         
	//   38  115:getfield        #140 <Field Object mObj1>
	//   39  118:checkcast       #187 <Class Context>
	//   40  121:aload_0         
	//   41  122:getfield        #160 <Field int mInt1>
	//   42  125:invokestatic    #275 <Method Icon Icon.createWithResource(Context, int)>
	//   43  128:areturn         

		case 1: // '\001'
			return Icon.createWithBitmap((Bitmap)mObj1);
	//   44  129:aload_0         
	//   45  130:getfield        #140 <Field Object mObj1>
	//   46  133:checkcast       #48  <Class Bitmap>
	//   47  136:invokestatic    #262 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   48  139:areturn         
		}
	}

	private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25F;
	private static final int AMBIENT_SHADOW_ALPHA = 30;
	private static final float BLUR_FACTOR = 0.01041667F;
	private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667F;
	private static final float ICON_DIAMETER_FACTOR = 0.9166667F;
	private static final int KEY_SHADOW_ALPHA = 61;
	private static final float KEY_SHADOW_OFFSET_FACTOR = 0.02083333F;
	private static final int TYPE_ADAPTIVE_BITMAP = 5;
	private static final int TYPE_BITMAP = 1;
	private static final int TYPE_DATA = 3;
	private static final int TYPE_RESOURCE = 2;
	private static final int TYPE_URI = 4;
	private int mInt1;
	private int mInt2;
	private Object mObj1;
	private final int mType;
}
