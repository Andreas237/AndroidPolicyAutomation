// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.app.ActivityManager;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.util.Preconditions;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat

public class IconCompat extends CustomVersionedParcelable
{
	public static interface IconType
		extends Annotation
	{
	}


	public IconCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void CustomVersionedParcelable()>
		mTintList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #81  <Field ColorStateList mTintList>
		mTintMode = DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//    7   13:putfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    8   16:return          
	}

	private IconCompat(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void CustomVersionedParcelable()>
		mTintList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #81  <Field ColorStateList mTintList>
		mTintMode = DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//    7   13:putfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
		mType = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #87  <Field int mType>
	//   11   21:return          
	}

	public static IconCompat createFromBundle(Bundle bundle)
	{
		int i = bundle.getInt("type");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "type">
	//    2    3:invokevirtual   #97  <Method int Bundle.getInt(String)>
	//    3    6:istore_1        
		IconCompat iconcompat = new IconCompat(i);
	//    4    7:new             #2   <Class IconCompat>
	//    5   10:dup             
	//    6   11:iload_1         
	//    7   12:invokespecial   #99  <Method void IconCompat(int)>
	//    8   15:astore_2        
		iconcompat.mInt1 = bundle.getInt("int1");
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:ldc1            #23  <String "int1">
	//   12   20:invokevirtual   #97  <Method int Bundle.getInt(String)>
	//   13   23:putfield        #101 <Field int mInt1>
		iconcompat.mInt2 = bundle.getInt("int2");
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:ldc1            #26  <String "int2">
	//   17   30:invokevirtual   #97  <Method int Bundle.getInt(String)>
	//   18   33:putfield        #103 <Field int mInt2>
		if(bundle.containsKey("tint_list"))
	//*  19   36:aload_0         
	//*  20   37:ldc1            #32  <String "tint_list">
	//*  21   39:invokevirtual   #107 <Method boolean Bundle.containsKey(String)>
	//*  22   42:ifeq            58
			iconcompat.mTintList = (ColorStateList)bundle.getParcelable("tint_list");
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:ldc1            #32  <String "tint_list">
	//   26   49:invokevirtual   #111 <Method Parcelable Bundle.getParcelable(String)>
	//   27   52:checkcast       #113 <Class ColorStateList>
	//   28   55:putfield        #81  <Field ColorStateList mTintList>
		if(bundle.containsKey("tint_mode"))
	//*  29   58:aload_0         
	//*  30   59:ldc1            #35  <String "tint_mode">
	//*  31   61:invokevirtual   #107 <Method boolean Bundle.containsKey(String)>
	//*  32   64:ifeq            80
			iconcompat.mTintMode = android.graphics.PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:ldc1            #35  <String "tint_mode">
	//   36   71:invokevirtual   #117 <Method String Bundle.getString(String)>
	//   37   74:invokestatic    #121 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//   38   77:putfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
		if(i != -1)
	//*  39   80:iload_1         
	//*  40   81:iconst_m1       
	//*  41   82:icmpeq          177
			switch(i)
	//*  42   85:iload_1         
			{
	//*  43   86:tableswitch     1 5: default 120
	//	               1 177
	//	               2 165
	//	               3 153
	//	               4 165
	//	               5 177
			default:
				bundle = ((Bundle) (new StringBuilder()));
	//   44  120:new             #123 <Class StringBuilder>
	//   45  123:dup             
	//   46  124:invokespecial   #124 <Method void StringBuilder()>
	//   47  127:astore_0        
				((StringBuilder) (bundle)).append("Unknown type ");
	//   48  128:aload_0         
	//   49  129:ldc1            #126 <String "Unknown type ">
	//   50  131:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   51  134:pop             
				((StringBuilder) (bundle)).append(i);
	//   52  135:aload_0         
	//   53  136:iload_1         
	//   54  137:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   55  140:pop             
				Log.w("IconCompat", ((StringBuilder) (bundle)).toString());
	//   56  141:ldc1            #47  <String "IconCompat">
	//   57  143:aload_0         
	//   58  144:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   59  147:invokestatic    #143 <Method int Log.w(String, String)>
	//   60  150:pop             
				return null;
	//   61  151:aconst_null     
	//   62  152:areturn         

			case 3: // '\003'
				iconcompat.mObj1 = ((Object) (bundle.getByteArray("obj")));
	//   63  153:aload_2         
	//   64  154:aload_0         
	//   65  155:ldc1            #29  <String "obj">
	//   66  157:invokevirtual   #147 <Method byte[] Bundle.getByteArray(String)>
	//   67  160:putfield        #149 <Field Object mObj1>
				return iconcompat;
	//   68  163:aload_2         
	//   69  164:areturn         

			case 2: // '\002'
			case 4: // '\004'
				iconcompat.mObj1 = ((Object) (bundle.getString("obj")));
	//   70  165:aload_2         
	//   71  166:aload_0         
	//   72  167:ldc1            #29  <String "obj">
	//   73  169:invokevirtual   #117 <Method String Bundle.getString(String)>
	//   74  172:putfield        #149 <Field Object mObj1>
				return iconcompat;
	//   75  175:aload_2         
	//   76  176:areturn         

			case 1: // '\001'
			case 5: // '\005'
				break;
			}
		iconcompat.mObj1 = ((Object) (bundle.getParcelable("obj")));
	//   77  177:aload_2         
	//   78  178:aload_0         
	//   79  179:ldc1            #29  <String "obj">
	//   80  181:invokevirtual   #111 <Method Parcelable Bundle.getParcelable(String)>
	//   81  184:putfield        #149 <Field Object mObj1>
		return iconcompat;
	//   82  187:aload_2         
	//   83  188:areturn         
	}

	public static IconCompat createFromIcon(Context context, Icon icon)
	{
		Preconditions.checkNotNull(((Object) (icon)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		int i = getType(icon);
	//    3    5:aload_1         
	//    4    6:invokestatic    #166 <Method int getType(Icon)>
	//    5    9:istore_2        
		if(i != 2)
	//*   6   10:iload_2         
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          44
			if(i != 4)
	//*   9   15:iload_2         
	//*  10   16:iconst_4        
	//*  11   17:icmpeq          36
			{
				context = ((Context) (new IconCompat(-1)));
	//   12   20:new             #2   <Class IconCompat>
	//   13   23:dup             
	//   14   24:iconst_m1       
	//   15   25:invokespecial   #99  <Method void IconCompat(int)>
	//   16   28:astore_0        
				context.mObj1 = ((Object) (icon));
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #149 <Field Object mObj1>
				return ((IconCompat) (context));
	//   20   34:aload_0         
	//   21   35:areturn         
			} else
			{
				return createWithContentUri(getUri(icon));
	//   22   36:aload_1         
	//   23   37:invokestatic    #170 <Method Uri getUri(Icon)>
	//   24   40:invokestatic    #174 <Method IconCompat createWithContentUri(Uri)>
	//   25   43:areturn         
			}
		String s = getResPackage(icon);
	//   26   44:aload_1         
	//   27   45:invokestatic    #178 <Method String getResPackage(Icon)>
	//   28   48:astore_3        
		try
		{
			context = ((Context) (createWithResource(getResources(context, s), s, getResId(icon))));
	//   29   49:aload_0         
	//   30   50:aload_3         
	//   31   51:invokestatic    #182 <Method Resources getResources(Context, String)>
	//   32   54:aload_3         
	//   33   55:aload_1         
	//   34   56:invokestatic    #185 <Method int getResId(Icon)>
	//   35   59:invokestatic    #189 <Method IconCompat createWithResource(Resources, String, int)>
	//   36   62:astore_0        
		}
	//*  37   63:aload_0         
	//*  38   64:areturn         
	//*  39   65:new             #191 <Class IllegalArgumentException>
	//*  40   68:dup             
	//*  41   69:ldc1            #193 <String "Icon resource cannot be found">
	//*  42   71:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//*  43   74:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IllegalArgumentException("Icon resource cannot be found");
		}
		return ((IconCompat) (context));
	//*  44   75:astore_0        
	//*  45   76:goto            65
	}

	public static IconCompat createFromIcon(Icon icon)
	{
		Preconditions.checkNotNull(((Object) (icon)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #162 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		int i = getType(icon);
	//    3    5:aload_0         
	//    4    6:invokestatic    #166 <Method int getType(Icon)>
	//    5    9:istore_1        
		if(i != 2)
	//*   6   10:iload_1         
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          44
		{
			if(i != 4)
	//*   9   15:iload_1         
	//*  10   16:iconst_4        
	//*  11   17:icmpeq          36
			{
				IconCompat iconcompat = new IconCompat(-1);
	//   12   20:new             #2   <Class IconCompat>
	//   13   23:dup             
	//   14   24:iconst_m1       
	//   15   25:invokespecial   #99  <Method void IconCompat(int)>
	//   16   28:astore_2        
				iconcompat.mObj1 = ((Object) (icon));
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:putfield        #149 <Field Object mObj1>
				return iconcompat;
	//   20   34:aload_2         
	//   21   35:areturn         
			} else
			{
				return createWithContentUri(getUri(icon));
	//   22   36:aload_0         
	//   23   37:invokestatic    #170 <Method Uri getUri(Icon)>
	//   24   40:invokestatic    #174 <Method IconCompat createWithContentUri(Uri)>
	//   25   43:areturn         
			}
		} else
		{
			return createWithResource(((Resources) (null)), getResPackage(icon), getResId(icon));
	//   26   44:aconst_null     
	//   27   45:aload_0         
	//   28   46:invokestatic    #178 <Method String getResPackage(Icon)>
	//   29   49:aload_0         
	//   30   50:invokestatic    #185 <Method int getResId(Icon)>
	//   31   53:invokestatic    #189 <Method IconCompat createWithResource(Resources, String, int)>
	//   32   56:areturn         
		}
	}

	static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean flag)
	{
		int i = (int)((float)Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667F);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #210 <Method int Bitmap.getHeight()>
	//    4    8:invokestatic    #216 <Method int Math.min(int, int)>
	//    5   11:i2f             
	//    6   12:ldc1            #19  <Float 0.6666667F>
	//    7   14:fmul            
	//    8   15:f2i             
	//    9   16:istore          6
		Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   10   18:iload           6
	//   11   20:iload           6
	//   12   22:getstatic       #222 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   13   25:invokestatic    #226 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   14   28:astore          7
		Canvas canvas = new Canvas(bitmap1);
	//   15   30:new             #228 <Class Canvas>
	//   16   33:dup             
	//   17   34:aload           7
	//   18   36:invokespecial   #231 <Method void Canvas(Bitmap)>
	//   19   39:astore          8
		Paint paint = new Paint(3);
	//   20   41:new             #233 <Class Paint>
	//   21   44:dup             
	//   22   45:iconst_3        
	//   23   46:invokespecial   #234 <Method void Paint(int)>
	//   24   49:astore          9
		float f = i;
	//   25   51:iload           6
	//   26   53:i2f             
	//   27   54:fstore_2        
		float f1 = 0.5F * f;
	//   28   55:ldc1            #235 <Float 0.5F>
	//   29   57:fload_2         
	//   30   58:fmul            
	//   31   59:fstore_3        
		float f2 = 0.9166667F * f1;
	//   32   60:ldc1            #40  <Float 0.9166667F>
	//   33   62:fload_3         
	//   34   63:fmul            
	//   35   64:fstore          4
		if(flag)
	//*  36   66:iload_1         
	//*  37   67:ifeq            134
		{
			float f3 = 0.01041667F * f;
	//   38   70:ldc1            #15  <Float 0.01041667F>
	//   39   72:fload_2         
	//   40   73:fmul            
	//   41   74:fstore          5
			paint.setColor(0);
	//   42   76:aload           9
	//   43   78:iconst_0        
	//   44   79:invokevirtual   #238 <Method void Paint.setColor(int)>
			paint.setShadowLayer(f3, 0.0F, f * 0.02083333F, 0x3d000000);
	//   45   82:aload           9
	//   46   84:fload           5
	//   47   86:fconst_0        
	//   48   87:fload_2         
	//   49   88:ldc1            #44  <Float 0.02083333F>
	//   50   90:fmul            
	//   51   91:ldc1            #239 <Int 0x3d000000>
	//   52   93:invokevirtual   #243 <Method void Paint.setShadowLayer(float, float, float, int)>
			canvas.drawCircle(f1, f1, f2, paint);
	//   53   96:aload           8
	//   54   98:fload_3         
	//   55   99:fload_3         
	//   56  100:fload           4
	//   57  102:aload           9
	//   58  104:invokevirtual   #247 <Method void Canvas.drawCircle(float, float, float, Paint)>
			paint.setShadowLayer(f3, 0.0F, 0.0F, 0x1e000000);
	//   59  107:aload           9
	//   60  109:fload           5
	//   61  111:fconst_0        
	//   62  112:fconst_0        
	//   63  113:ldc1            #248 <Int 0x1e000000>
	//   64  115:invokevirtual   #243 <Method void Paint.setShadowLayer(float, float, float, int)>
			canvas.drawCircle(f1, f1, f2, paint);
	//   65  118:aload           8
	//   66  120:fload_3         
	//   67  121:fload_3         
	//   68  122:fload           4
	//   69  124:aload           9
	//   70  126:invokevirtual   #247 <Method void Canvas.drawCircle(float, float, float, Paint)>
			paint.clearShadowLayer();
	//   71  129:aload           9
	//   72  131:invokevirtual   #251 <Method void Paint.clearShadowLayer()>
		}
		paint.setColor(0xff000000);
	//   73  134:aload           9
	//   74  136:ldc1            #252 <Int 0xff000000>
	//   75  138:invokevirtual   #238 <Method void Paint.setColor(int)>
		BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
	//   76  141:new             #254 <Class BitmapShader>
	//   77  144:dup             
	//   78  145:aload_0         
	//   79  146:getstatic       #260 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   80  149:getstatic       #260 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   81  152:invokespecial   #263 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   82  155:astore          10
		Matrix matrix = new Matrix();
	//   83  157:new             #265 <Class Matrix>
	//   84  160:dup             
	//   85  161:invokespecial   #266 <Method void Matrix()>
	//   86  164:astore          11
		matrix.setTranslate(-(bitmap.getWidth() - i) / 2, -(bitmap.getHeight() - i) / 2);
	//   87  166:aload           11
	//   88  168:aload_0         
	//   89  169:invokevirtual   #207 <Method int Bitmap.getWidth()>
	//   90  172:iload           6
	//   91  174:isub            
	//   92  175:ineg            
	//   93  176:iconst_2        
	//   94  177:idiv            
	//   95  178:i2f             
	//   96  179:aload_0         
	//   97  180:invokevirtual   #210 <Method int Bitmap.getHeight()>
	//   98  183:iload           6
	//   99  185:isub            
	//  100  186:ineg            
	//  101  187:iconst_2        
	//  102  188:idiv            
	//  103  189:i2f             
	//  104  190:invokevirtual   #270 <Method void Matrix.setTranslate(float, float)>
		bitmapshader.setLocalMatrix(matrix);
	//  105  193:aload           10
	//  106  195:aload           11
	//  107  197:invokevirtual   #274 <Method void BitmapShader.setLocalMatrix(Matrix)>
		paint.setShader(((android.graphics.Shader) (bitmapshader)));
	//  108  200:aload           9
	//  109  202:aload           10
	//  110  204:invokevirtual   #278 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  111  207:pop             
		canvas.drawCircle(f1, f1, f2, paint);
	//  112  208:aload           8
	//  113  210:fload_3         
	//  114  211:fload_3         
	//  115  212:fload           4
	//  116  214:aload           9
	//  117  216:invokevirtual   #247 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.setBitmap(((Bitmap) (null)));
	//  118  219:aload           8
	//  119  221:aconst_null     
	//  120  222:invokevirtual   #281 <Method void Canvas.setBitmap(Bitmap)>
		return bitmap1;
	//  121  225:aload           7
	//  122  227:areturn         
	}

	public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
		{
			IconCompat iconcompat = new IconCompat(5);
	//    2    4:new             #2   <Class IconCompat>
	//    3    7:dup             
	//    4    8:iconst_5        
	//    5    9:invokespecial   #99  <Method void IconCompat(int)>
	//    6   12:astore_1        
			iconcompat.mObj1 = ((Object) (bitmap));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:putfield        #149 <Field Object mObj1>
			return iconcompat;
	//   10   18:aload_1         
	//   11   19:areturn         
		} else
		{
			throw new IllegalArgumentException("Bitmap must not be null.");
	//   12   20:new             #191 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc2            #285 <String "Bitmap must not be null.">
	//   15   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   30:athrow          
		}
	}

	public static IconCompat createWithBitmap(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
		{
			IconCompat iconcompat = new IconCompat(1);
	//    2    4:new             #2   <Class IconCompat>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #99  <Method void IconCompat(int)>
	//    6   12:astore_1        
			iconcompat.mObj1 = ((Object) (bitmap));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:putfield        #149 <Field Object mObj1>
			return iconcompat;
	//   10   18:aload_1         
	//   11   19:areturn         
		} else
		{
			throw new IllegalArgumentException("Bitmap must not be null.");
	//   12   20:new             #191 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc2            #285 <String "Bitmap must not be null.">
	//   15   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   30:athrow          
		}
	}

	public static IconCompat createWithContentUri(Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return createWithContentUri(uri.toString());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #289 <Method String Uri.toString()>
	//    4    8:invokestatic    #292 <Method IconCompat createWithContentUri(String)>
	//    5   11:areturn         
		else
			throw new IllegalArgumentException("Uri must not be null.");
	//    6   12:new             #191 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc2            #294 <String "Uri must not be null.">
	//    9   19:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   10   22:athrow          
	}

	public static IconCompat createWithContentUri(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
		{
			IconCompat iconcompat = new IconCompat(4);
	//    2    4:new             #2   <Class IconCompat>
	//    3    7:dup             
	//    4    8:iconst_4        
	//    5    9:invokespecial   #99  <Method void IconCompat(int)>
	//    6   12:astore_1        
			iconcompat.mObj1 = ((Object) (s));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:putfield        #149 <Field Object mObj1>
			return iconcompat;
	//   10   18:aload_1         
	//   11   19:areturn         
		} else
		{
			throw new IllegalArgumentException("Uri must not be null.");
	//   12   20:new             #191 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc2            #294 <String "Uri must not be null.">
	//   15   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   30:athrow          
		}
	}

	public static IconCompat createWithData(byte abyte0[], int i, int j)
	{
		if(abyte0 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          30
		{
			IconCompat iconcompat = new IconCompat(3);
	//    2    4:new             #2   <Class IconCompat>
	//    3    7:dup             
	//    4    8:iconst_3        
	//    5    9:invokespecial   #99  <Method void IconCompat(int)>
	//    6   12:astore_3        
			iconcompat.mObj1 = ((Object) (abyte0));
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:putfield        #149 <Field Object mObj1>
			iconcompat.mInt1 = i;
	//   10   18:aload_3         
	//   11   19:iload_1         
	//   12   20:putfield        #101 <Field int mInt1>
			iconcompat.mInt2 = j;
	//   13   23:aload_3         
	//   14   24:iload_2         
	//   15   25:putfield        #103 <Field int mInt2>
			return iconcompat;
	//   16   28:aload_3         
	//   17   29:areturn         
		} else
		{
			throw new IllegalArgumentException("Data must not be null.");
	//   18   30:new             #191 <Class IllegalArgumentException>
	//   19   33:dup             
	//   20   34:ldc2            #298 <String "Data must not be null.">
	//   21   37:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   22   40:athrow          
		}
	}

	public static IconCompat createWithResource(Context context, int i)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
			return createWithResource(context.getResources(), context.getPackageName(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #305 <Method Resources Context.getResources()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #308 <Method String Context.getPackageName()>
	//    6   12:iload_1         
	//    7   13:invokestatic    #189 <Method IconCompat createWithResource(Resources, String, int)>
	//    8   16:areturn         
		else
			throw new IllegalArgumentException("Context must not be null.");
	//    9   17:new             #191 <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc2            #310 <String "Context must not be null.">
	//   12   24:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
	}

	public static IconCompat createWithResource(Resources resources, String s, int i)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(i != 0)
	//*   2    4:iload_2         
	//*   3    5:ifeq            54
			{
				IconCompat iconcompat = new IconCompat(2);
	//    4    8:new             #2   <Class IconCompat>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #99  <Method void IconCompat(int)>
	//    8   16:astore_3        
				iconcompat.mInt1 = i;
	//    9   17:aload_3         
	//   10   18:iload_2         
	//   11   19:putfield        #101 <Field int mInt1>
				if(resources != null)
	//*  12   22:aload_0         
	//*  13   23:ifnull          47
				{
					try
					{
						iconcompat.mObj1 = ((Object) (resources.getResourceName(i)));
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #316 <Method String Resources.getResourceName(int)>
	//   18   32:putfield        #149 <Field Object mObj1>
					}
	//*  19   35:aload_3         
	//*  20   36:areturn         
	//*  21   37:new             #191 <Class IllegalArgumentException>
	//*  22   40:dup             
	//*  23   41:ldc1            #193 <String "Icon resource cannot be found">
	//*  24   43:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//*  25   46:athrow          
	//*  26   47:aload_3         
	//*  27   48:aload_1         
	//*  28   49:putfield        #149 <Field Object mObj1>
	//*  29   52:aload_3         
	//*  30   53:areturn         
	//*  31   54:new             #191 <Class IllegalArgumentException>
	//*  32   57:dup             
	//*  33   58:ldc2            #318 <String "Drawable resource ID must not be 0">
	//*  34   61:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//*  35   64:athrow          
	//*  36   65:new             #191 <Class IllegalArgumentException>
	//*  37   68:dup             
	//*  38   69:ldc2            #320 <String "Package must not be null.">
	//*  39   72:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//*  40   75:athrow          
					// Misplaced declaration of an exception variable
					catch(Resources resources)
					{
						throw new IllegalArgumentException("Icon resource cannot be found");
					}
					return iconcompat;
				} else
				{
					iconcompat.mObj1 = ((Object) (s));
					return iconcompat;
				}
			} else
			{
				throw new IllegalArgumentException("Drawable resource ID must not be 0");
			}
		} else
		{
			throw new IllegalArgumentException("Package must not be null.");
		}
	//*  41   76:astore_0        
	//*  42   77:goto            37
	}

	private static int getResId(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #336 <Method int Icon.getResId()>
	//    5   12:ireturn         
		int i;
		try
		{
			i = ((Integer)((Object) (icon)).getClass().getMethod("getResId", new Class[0]).invoke(((Object) (icon)), new Object[0])).intValue();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #342 <Method Class Object.getClass()>
	//    8   17:ldc2            #343 <String "getResId">
	//    9   20:iconst_0        
	//   10   21:anewarray       Class[]
	//   11   24:invokevirtual   #349 <Method Method Class.getMethod(String, Class[])>
	//   12   27:aload_0         
	//   13   28:iconst_0        
	//   14   29:anewarray       Object[]
	//   15   32:invokevirtual   #355 <Method Object Method.invoke(Object, Object[])>
	//   16   35:checkcast       #357 <Class Integer>
	//   17   38:invokevirtual   #360 <Method int Integer.intValue()>
	//   18   41:istore_1        
		}
	//*  19   42:iload_1         
	//*  20   43:ireturn         
	//*  21   44:astore_0        
	//*  22   45:ldc1            #47  <String "IconCompat">
	//*  23   47:ldc2            #362 <String "Unable to get icon resource">
	//*  24   50:aload_0         
	//*  25   51:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  26   54:pop             
	//*  27   55:iconst_0        
	//*  28   56:ireturn         
	//*  29   57:astore_0        
	//*  30   58:ldc1            #47  <String "IconCompat">
	//*  31   60:ldc2            #362 <String "Unable to get icon resource">
	//*  32   63:aload_0         
	//*  33   64:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  34   67:pop             
	//*  35   68:iconst_0        
	//*  36   69:ireturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  37   70:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
	//   38   71:ldc1            #47  <String "IconCompat">
	//   39   73:ldc2            #362 <String "Unable to get icon resource">
	//   40   76:aload_0         
	//   41   77:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   42   80:pop             
			return 0;
	//   43   81:iconst_0        
	//   44   82:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
			return 0;
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
			return 0;
		}
		return i;
	}

	private static String getResPackage(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResPackage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #368 <Method String Icon.getResPackage()>
	//    5   12:areturn         
		try
		{
			icon = ((Icon) ((String)((Object) (icon)).getClass().getMethod("getResPackage", new Class[0]).invoke(((Object) (icon)), new Object[0])));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #342 <Method Class Object.getClass()>
	//    8   17:ldc2            #369 <String "getResPackage">
	//    9   20:iconst_0        
	//   10   21:anewarray       Class[]
	//   11   24:invokevirtual   #349 <Method Method Class.getMethod(String, Class[])>
	//   12   27:aload_0         
	//   13   28:iconst_0        
	//   14   29:anewarray       Object[]
	//   15   32:invokevirtual   #355 <Method Object Method.invoke(Object, Object[])>
	//   16   35:checkcast       #371 <Class String>
	//   17   38:astore_0        
		}
	//*  18   39:aload_0         
	//*  19   40:areturn         
	//*  20   41:astore_0        
	//*  21   42:ldc1            #47  <String "IconCompat">
	//*  22   44:ldc2            #373 <String "Unable to get icon package">
	//*  23   47:aload_0         
	//*  24   48:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  25   51:pop             
	//*  26   52:aconst_null     
	//*  27   53:areturn         
	//*  28   54:astore_0        
	//*  29   55:ldc1            #47  <String "IconCompat">
	//*  30   57:ldc2            #373 <String "Unable to get icon package">
	//*  31   60:aload_0         
	//*  32   61:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  33   64:pop             
	//*  34   65:aconst_null     
	//*  35   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  36   67:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
	//   37   68:ldc1            #47  <String "IconCompat">
	//   38   70:ldc2            #373 <String "Unable to get icon package">
	//   39   73:aload_0         
	//   40   74:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   41   77:pop             
			return null;
	//   42   78:aconst_null     
	//   43   79:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
			return null;
		}
		return ((String) (icon));
	}

	private static Resources getResources(Context context, String s)
	{
		if("android".equals(((Object) (s))))
	//*   0    0:ldc2            #377 <String "android">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #381 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            14
			return Resources.getSystem();
	//    4   10:invokestatic    #384 <Method Resources Resources.getSystem()>
	//    5   13:areturn         
		context = ((Context) (context.getPackageManager()));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #388 <Method PackageManager Context.getPackageManager()>
	//    8   18:astore_0        
		android.content.pm.ApplicationInfo applicationinfo;
		try
		{
			applicationinfo = ((PackageManager) (context)).getApplicationInfo(s, 8192);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:sipush          8192
	//   12   24:invokevirtual   #394 <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   13   27:astore_2        
		}
	//*  14   28:aload_2         
	//*  15   29:ifnull          40
	//*  16   32:aload_0         
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #398 <Method Resources PackageManager.getResourcesForApplication(android.content.pm.ApplicationInfo)>
	//*  19   37:astore_0        
	//*  20   38:aload_0         
	//*  21   39:areturn         
	//*  22   40:aconst_null     
	//*  23   41:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  24   42:astore_0        
		{
			Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[] {
				s
			}), ((Throwable) (context)));
	//   25   43:ldc1            #47  <String "IconCompat">
	//   26   45:ldc2            #400 <String "Unable to find pkg=%s for icon">
	//   27   48:iconst_1        
	//   28   49:anewarray       Object[]
	//   29   52:dup             
	//   30   53:iconst_0        
	//   31   54:aload_1         
	//   32   55:aastore         
	//   33   56:invokestatic    #404 <Method String String.format(String, Object[])>
	//   34   59:aload_0         
	//   35   60:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   36   63:pop             
			return null;
	//   37   64:aconst_null     
	//   38   65:areturn         
		}
		if(applicationinfo == null)
			break MISSING_BLOCK_LABEL_40;
		context = ((Context) (((PackageManager) (context)).getResourcesForApplication(applicationinfo)));
		return ((Resources) (context));
		return null;
	}

	private static int getType(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getType();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #406 <Method int Icon.getType()>
	//    5   12:ireturn         
		int i;
		try
		{
			i = ((Integer)((Object) (icon)).getClass().getMethod("getType", new Class[0]).invoke(((Object) (icon)), new Object[0])).intValue();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #342 <Method Class Object.getClass()>
	//    8   17:ldc2            #407 <String "getType">
	//    9   20:iconst_0        
	//   10   21:anewarray       Class[]
	//   11   24:invokevirtual   #349 <Method Method Class.getMethod(String, Class[])>
	//   12   27:aload_0         
	//   13   28:iconst_0        
	//   14   29:anewarray       Object[]
	//   15   32:invokevirtual   #355 <Method Object Method.invoke(Object, Object[])>
	//   16   35:checkcast       #357 <Class Integer>
	//   17   38:invokevirtual   #360 <Method int Integer.intValue()>
	//   18   41:istore_1        
		}
	//*  19   42:iload_1         
	//*  20   43:ireturn         
	//*  21   44:astore_2        
	//*  22   45:new             #123 <Class StringBuilder>
	//*  23   48:dup             
	//*  24   49:invokespecial   #124 <Method void StringBuilder()>
	//*  25   52:astore_3        
	//*  26   53:aload_3         
	//*  27   54:ldc2            #409 <String "Unable to get icon type ">
	//*  28   57:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  29   60:pop             
	//*  30   61:aload_3         
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//*  33   66:pop             
	//*  34   67:ldc1            #47  <String "IconCompat">
	//*  35   69:aload_3         
	//*  36   70:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  37   73:aload_2         
	//*  38   74:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  39   77:pop             
	//*  40   78:iconst_m1       
	//*  41   79:ireturn         
	//*  42   80:astore_2        
	//*  43   81:new             #123 <Class StringBuilder>
	//*  44   84:dup             
	//*  45   85:invokespecial   #124 <Method void StringBuilder()>
	//*  46   88:astore_3        
	//*  47   89:aload_3         
	//*  48   90:ldc2            #409 <String "Unable to get icon type ">
	//*  49   93:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  50   96:pop             
	//*  51   97:aload_3         
	//*  52   98:aload_0         
	//*  53   99:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//*  54  102:pop             
	//*  55  103:ldc1            #47  <String "IconCompat">
	//*  56  105:aload_3         
	//*  57  106:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  58  109:aload_2         
	//*  59  110:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  60  113:pop             
	//*  61  114:iconst_m1       
	//*  62  115:ireturn         
		catch(IllegalAccessException illegalaccessexception)
	//*  63  116:astore_2        
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   64  117:new             #123 <Class StringBuilder>
	//   65  120:dup             
	//   66  121:invokespecial   #124 <Method void StringBuilder()>
	//   67  124:astore_3        
			stringbuilder2.append("Unable to get icon type ");
	//   68  125:aload_3         
	//   69  126:ldc2            #409 <String "Unable to get icon type ">
	//   70  129:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   71  132:pop             
			stringbuilder2.append(((Object) (icon)));
	//   72  133:aload_3         
	//   73  134:aload_0         
	//   74  135:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   75  138:pop             
			Log.e("IconCompat", stringbuilder2.toString(), ((Throwable) (illegalaccessexception)));
	//   76  139:ldc1            #47  <String "IconCompat">
	//   77  141:aload_3         
	//   78  142:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   79  145:aload_2         
	//   80  146:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   81  149:pop             
			return -1;
	//   82  150:iconst_m1       
	//   83  151:ireturn         
		}
		catch(InvocationTargetException invocationtargetexception)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Unable to get icon type ");
			stringbuilder1.append(((Object) (icon)));
			Log.e("IconCompat", stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
			return -1;
		}
		catch(NoSuchMethodException nosuchmethodexception)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Unable to get icon type ");
			stringbuilder.append(((Object) (icon)));
			Log.e("IconCompat", stringbuilder.toString(), ((Throwable) (nosuchmethodexception)));
			return -1;
		}
		return i;
	}

	private static Uri getUri(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getUri();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #415 <Method Uri Icon.getUri()>
	//    5   12:areturn         
		try
		{
			icon = ((Icon) ((Uri)((Object) (icon)).getClass().getMethod("getUri", new Class[0]).invoke(((Object) (icon)), new Object[0])));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #342 <Method Class Object.getClass()>
	//    8   17:ldc2            #416 <String "getUri">
	//    9   20:iconst_0        
	//   10   21:anewarray       Class[]
	//   11   24:invokevirtual   #349 <Method Method Class.getMethod(String, Class[])>
	//   12   27:aload_0         
	//   13   28:iconst_0        
	//   14   29:anewarray       Object[]
	//   15   32:invokevirtual   #355 <Method Object Method.invoke(Object, Object[])>
	//   16   35:checkcast       #288 <Class Uri>
	//   17   38:astore_0        
		}
	//*  18   39:aload_0         
	//*  19   40:areturn         
	//*  20   41:astore_0        
	//*  21   42:ldc1            #47  <String "IconCompat">
	//*  22   44:ldc2            #418 <String "Unable to get icon uri">
	//*  23   47:aload_0         
	//*  24   48:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  25   51:pop             
	//*  26   52:aconst_null     
	//*  27   53:areturn         
	//*  28   54:astore_0        
	//*  29   55:ldc1            #47  <String "IconCompat">
	//*  30   57:ldc2            #418 <String "Unable to get icon uri">
	//*  31   60:aload_0         
	//*  32   61:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//*  33   64:pop             
	//*  34   65:aconst_null     
	//*  35   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  36   67:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon uri", ((Throwable) (icon)));
	//   37   68:ldc1            #47  <String "IconCompat">
	//   38   70:ldc2            #418 <String "Unable to get icon uri">
	//   39   73:aload_0         
	//   40   74:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   41   77:pop             
			return null;
	//   42   78:aconst_null     
	//   43   79:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon uri", ((Throwable) (icon)));
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon uri", ((Throwable) (icon)));
			return null;
		}
		return ((Uri) (icon));
	}

	private Drawable loadDrawableInner(Context context)
	{
		switch(mType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 349
	//	               2 272
	//	               3 242
	//	               4 65
	//	               5 42
		default:
			return null;
	//    3   40:aconst_null     
	//    4   41:areturn         

		case 5: // '\005'
			return ((Drawable) (new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false))));
	//    5   42:new             #428 <Class BitmapDrawable>
	//    6   45:dup             
	//    7   46:aload_1         
	//    8   47:invokevirtual   #305 <Method Resources Context.getResources()>
	//    9   50:aload_0         
	//   10   51:getfield        #149 <Field Object mObj1>
	//   11   54:checkcast       #203 <Class Bitmap>
	//   12   57:iconst_0        
	//   13   58:invokestatic    #430 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap, boolean)>
	//   14   61:invokespecial   #433 <Method void BitmapDrawable(Resources, Bitmap)>
	//   15   64:areturn         

		case 4: // '\004'
			Object obj;
label0:
			{
				Uri uri = Uri.parse((String)mObj1);
	//   16   65:aload_0         
	//   17   66:getfield        #149 <Field Object mObj1>
	//   18   69:checkcast       #371 <Class String>
	//   19   72:invokestatic    #437 <Method Uri Uri.parse(String)>
	//   20   75:astore_3        
				obj = ((Object) (uri.getScheme()));
	//   21   76:aload_3         
	//   22   77:invokevirtual   #440 <Method String Uri.getScheme()>
	//   23   80:astore_2        
				if(!"content".equals(obj) && !"file".equals(obj))
	//*  24   81:ldc2            #442 <String "content">
	//*  25   84:aload_2         
	//*  26   85:invokevirtual   #381 <Method boolean String.equals(Object)>
	//*  27   88:ifne            170
	//*  28   91:ldc2            #444 <String "file">
	//*  29   94:aload_2         
	//*  30   95:invokevirtual   #381 <Method boolean String.equals(Object)>
	//*  31   98:ifeq            104
	//*  32  101:goto            170
					try
					{
						obj = ((Object) (new FileInputStream(new File((String)mObj1))));
	//   33  104:new             #446 <Class FileInputStream>
	//   34  107:dup             
	//   35  108:new             #448 <Class File>
	//   36  111:dup             
	//   37  112:aload_0         
	//   38  113:getfield        #149 <Field Object mObj1>
	//   39  116:checkcast       #371 <Class String>
	//   40  119:invokespecial   #449 <Method void File(String)>
	//   41  122:invokespecial   #452 <Method void FileInputStream(File)>
	//   42  125:astore_2        
						break label0;
	//   43  126:goto            222
					}
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//*  44  129:astore_2        
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   45  130:new             #123 <Class StringBuilder>
	//   46  133:dup             
	//   47  134:invokespecial   #124 <Method void StringBuilder()>
	//   48  137:astore          4
						stringbuilder.append("Unable to load image from path: ");
	//   49  139:aload           4
	//   50  141:ldc2            #454 <String "Unable to load image from path: ">
	//   51  144:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   52  147:pop             
						stringbuilder.append(((Object) (uri)));
	//   53  148:aload           4
	//   54  150:aload_3         
	//   55  151:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   56  154:pop             
						Log.w("IconCompat", stringbuilder.toString(), ((Throwable) (obj)));
	//   57  155:ldc1            #47  <String "IconCompat">
	//   58  157:aload           4
	//   59  159:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   60  162:aload_2         
	//   61  163:invokestatic    #456 <Method int Log.w(String, String, Throwable)>
	//   62  166:pop             
					}
				else
	//*  63  167:goto            220
					try
					{
						obj = ((Object) (context.getContentResolver().openInputStream(uri)));
	//   64  170:aload_1         
	//   65  171:invokevirtual   #460 <Method ContentResolver Context.getContentResolver()>
	//   66  174:aload_3         
	//   67  175:invokevirtual   #466 <Method java.io.InputStream ContentResolver.openInputStream(Uri)>
	//   68  178:astore_2        
						break label0;
	//   69  179:goto            222
					}
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//*  70  182:astore_2        
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   71  183:new             #123 <Class StringBuilder>
	//   72  186:dup             
	//   73  187:invokespecial   #124 <Method void StringBuilder()>
	//   74  190:astore          4
						stringbuilder1.append("Unable to load image from URI: ");
	//   75  192:aload           4
	//   76  194:ldc2            #468 <String "Unable to load image from URI: ">
	//   77  197:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   78  200:pop             
						stringbuilder1.append(((Object) (uri)));
	//   79  201:aload           4
	//   80  203:aload_3         
	//   81  204:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   82  207:pop             
						Log.w("IconCompat", stringbuilder1.toString(), ((Throwable) (obj)));
	//   83  208:ldc1            #47  <String "IconCompat">
	//   84  210:aload           4
	//   85  212:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   86  215:aload_2         
	//   87  216:invokestatic    #456 <Method int Log.w(String, String, Throwable)>
	//   88  219:pop             
					}
				obj = null;
	//   89  220:aconst_null     
	//   90  221:astore_2        
			}
			String s;
			if(obj != null)
	//*  91  222:aload_2         
	//*  92  223:ifnull          368
				return ((Drawable) (new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(((java.io.InputStream) (obj))))));
	//   93  226:new             #428 <Class BitmapDrawable>
	//   94  229:dup             
	//   95  230:aload_1         
	//   96  231:invokevirtual   #305 <Method Resources Context.getResources()>
	//   97  234:aload_2         
	//   98  235:invokestatic    #474 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
	//   99  238:invokespecial   #433 <Method void BitmapDrawable(Resources, Bitmap)>
	//  100  241:areturn         
			else
	//* 101  242:new             #428 <Class BitmapDrawable>
	//* 102  245:dup             
	//* 103  246:aload_1         
	//* 104  247:invokevirtual   #305 <Method Resources Context.getResources()>
	//* 105  250:aload_0         
	//* 106  251:getfield        #149 <Field Object mObj1>
	//* 107  254:checkcast       #475 <Class byte[]>
	//* 108  257:aload_0         
	//* 109  258:getfield        #101 <Field int mInt1>
	//* 110  261:aload_0         
	//* 111  262:getfield        #103 <Field int mInt2>
	//* 112  265:invokestatic    #479 <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//* 113  268:invokespecial   #433 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 114  271:areturn         
	//* 115  272:aload_0         
	//* 116  273:invokevirtual   #480 <Method String getResPackage()>
	//* 117  276:astore_3        
	//* 118  277:aload_3         
	//* 119  278:astore_2        
	//* 120  279:aload_3         
	//* 121  280:invokestatic    #486 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 122  283:ifeq            291
	//* 123  286:aload_1         
	//* 124  287:invokevirtual   #308 <Method String Context.getPackageName()>
	//* 125  290:astore_2        
	//* 126  291:aload_1         
	//* 127  292:aload_2         
	//* 128  293:invokestatic    #182 <Method Resources getResources(Context, String)>
	//* 129  296:astore_2        
	//* 130  297:aload_2         
	//* 131  298:aload_0         
	//* 132  299:getfield        #101 <Field int mInt1>
	//* 133  302:aload_1         
	//* 134  303:invokevirtual   #490 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 135  306:invokestatic    #496 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//* 136  309:astore_1        
	//* 137  310:aload_1         
	//* 138  311:areturn         
	//* 139  312:astore_1        
	//* 140  313:ldc1            #47  <String "IconCompat">
	//* 141  315:ldc2            #498 <String "Unable to load resource 0x%08x from pkg=%s">
	//* 142  318:iconst_2        
	//* 143  319:anewarray       Object[]
	//* 144  322:dup             
	//* 145  323:iconst_0        
	//* 146  324:aload_0         
	//* 147  325:getfield        #101 <Field int mInt1>
	//* 148  328:invokestatic    #501 <Method Integer Integer.valueOf(int)>
	//* 149  331:aastore         
	//* 150  332:dup             
	//* 151  333:iconst_1        
	//* 152  334:aload_0         
	//* 153  335:getfield        #149 <Field Object mObj1>
	//* 154  338:aastore         
	//* 155  339:invokestatic    #404 <Method String String.format(String, Object[])>
	//* 156  342:aload_1         
	//* 157  343:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//* 158  346:pop             
	//* 159  347:aconst_null     
	//* 160  348:areturn         
	//* 161  349:new             #428 <Class BitmapDrawable>
	//* 162  352:dup             
	//* 163  353:aload_1         
	//* 164  354:invokevirtual   #305 <Method Resources Context.getResources()>
	//* 165  357:aload_0         
	//* 166  358:getfield        #149 <Field Object mObj1>
	//* 167  361:checkcast       #203 <Class Bitmap>
	//* 168  364:invokespecial   #433 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 169  367:areturn         
				return null;
	//  170  368:aconst_null     
	//  171  369:areturn         

		case 3: // '\003'
			return ((Drawable) (new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[])mObj1, mInt1, mInt2))));

		case 2: // '\002'
			s = getResPackage();
			obj = ((Object) (s));
			if(TextUtils.isEmpty(((CharSequence) (s))))
				obj = ((Object) (context.getPackageName()));
			obj = ((Object) (getResources(context, ((String) (obj)))));
			try
			{
				context = ((Context) (ResourcesCompat.getDrawable(((Resources) (obj)), mInt1, context.getTheme())));
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[] {
					Integer.valueOf(mInt1), mObj1
				}), ((Throwable) (context)));
				return null;
			}
			return ((Drawable) (context));

		case 1: // '\001'
			return ((Drawable) (new BitmapDrawable(context.getResources(), (Bitmap)mObj1)));
		}
	}

	private static String typeToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 56
	//	               2 52
	//	               3 48
	//	               4 44
	//	               5 40
		default:
			return "UNKNOWN";
	//    2   36:ldc2            #504 <String "UNKNOWN">
	//    3   39:areturn         

		case 5: // '\005'
			return "BITMAP_MASKABLE";
	//    4   40:ldc2            #506 <String "BITMAP_MASKABLE">
	//    5   43:areturn         

		case 4: // '\004'
			return "URI";
	//    6   44:ldc2            #508 <String "URI">
	//    7   47:areturn         

		case 3: // '\003'
			return "DATA";
	//    8   48:ldc2            #510 <String "DATA">
	//    9   51:areturn         

		case 2: // '\002'
			return "RESOURCE";
	//   10   52:ldc2            #512 <String "RESOURCE">
	//   11   55:areturn         

		case 1: // '\001'
			return "BITMAP";
	//   12   56:ldc2            #514 <String "BITMAP">
	//   13   59:areturn         
		}
	}

	public void addToShortcutIntent(Intent intent, Drawable drawable, Context context)
	{
		int i;
		checkResource(context);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #520 <Method void checkResource(Context)>
		i = mType;
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field int mType>
	//    5    9:istore          4
		if(i == 5) goto _L2; else goto _L1
	//    6   11:iload           4
	//    7   13:iconst_5        
	//    8   14:icmpeq          258
_L1:
		i;
	//    9   17:iload           4
		JVM INSTR tableswitch 1 2: default 40
	//	               1 227
	//	               2 51;
	//   10   19:tableswitch     1 2: default 40
	//	               1 227
	//	               2 51
		   goto _L3 _L4 _L5
_L3:
		throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
	//   11   40:new             #191 <Class IllegalArgumentException>
	//   12   43:dup             
	//   13   44:ldc2            #522 <String "Icon type not supported for intent shortcuts">
	//   14   47:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   15   50:athrow          
_L5:
		context = context.createPackageContext(getResPackage(), 0);
	//   16   51:aload_3         
	//   17   52:aload_0         
	//   18   53:invokevirtual   #480 <Method String getResPackage()>
	//   19   56:iconst_0        
	//   20   57:invokevirtual   #526 <Method Context Context.createPackageContext(String, int)>
	//   21   60:astore_3        
		if(drawable == null)
	//*  22   61:aload_2         
	//*  23   62:ifnonnull       82
		{
			int j;
			Drawable drawable1;
			try
			{
				intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ((Parcelable) (android.content.Intent.ShortcutIconResource.fromContext(context, mInt1))));
	//   24   65:aload_1         
	//   25   66:ldc2            #528 <String "android.intent.extra.shortcut.ICON_RESOURCE">
	//   26   69:aload_3         
	//   27   70:aload_0         
	//   28   71:getfield        #101 <Field int mInt1>
	//   29   74:invokestatic    #534 <Method android.content.Intent$ShortcutIconResource android.content.Intent$ShortcutIconResource.fromContext(Context, int)>
	//   30   77:invokevirtual   #540 <Method Intent Intent.putExtra(String, Parcelable)>
	//   31   80:pop             
				return;
	//   32   81:return          
			}
	//*  33   82:aload_3         
	//*  34   83:aload_0         
	//*  35   84:getfield        #101 <Field int mInt1>
	//*  36   87:invokestatic    #545 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  37   90:astore          6
	//*  38   92:aload           6
	//*  39   94:invokevirtual   #550 <Method int Drawable.getIntrinsicWidth()>
	//*  40   97:ifle            131
	//*  41  100:aload           6
	//*  42  102:invokevirtual   #553 <Method int Drawable.getIntrinsicHeight()>
	//*  43  105:ifgt            111
	//*  44  108:goto            131
	//*  45  111:aload           6
	//*  46  113:invokevirtual   #550 <Method int Drawable.getIntrinsicWidth()>
	//*  47  116:aload           6
	//*  48  118:invokevirtual   #553 <Method int Drawable.getIntrinsicHeight()>
	//*  49  121:getstatic       #222 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  50  124:invokestatic    #226 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  51  127:astore_3        
	//*  52  128:goto            157
	//*  53  131:aload_3         
	//*  54  132:ldc2            #555 <String "activity">
	//*  55  135:invokevirtual   #559 <Method Object Context.getSystemService(String)>
	//*  56  138:checkcast       #561 <Class ActivityManager>
	//*  57  141:invokevirtual   #564 <Method int ActivityManager.getLauncherLargeIconSize()>
	//*  58  144:istore          4
	//*  59  146:iload           4
	//*  60  148:iload           4
	//*  61  150:getstatic       #222 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  62  153:invokestatic    #226 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  63  156:astore_3        
	//*  64  157:aload           6
	//*  65  159:iconst_0        
	//*  66  160:iconst_0        
	//*  67  161:aload_3         
	//*  68  162:invokevirtual   #207 <Method int Bitmap.getWidth()>
	//*  69  165:aload_3         
	//*  70  166:invokevirtual   #210 <Method int Bitmap.getHeight()>
	//*  71  169:invokevirtual   #568 <Method void Drawable.setBounds(int, int, int, int)>
	//*  72  172:aload           6
	//*  73  174:new             #228 <Class Canvas>
	//*  74  177:dup             
	//*  75  178:aload_3         
	//*  76  179:invokespecial   #231 <Method void Canvas(Bitmap)>
	//*  77  182:invokevirtual   #572 <Method void Drawable.draw(Canvas)>
	//*  78  185:goto            270
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  79  188:astore_1        
			{
				drawable = ((Drawable) (new StringBuilder()));
	//   80  189:new             #123 <Class StringBuilder>
	//   81  192:dup             
	//   82  193:invokespecial   #124 <Method void StringBuilder()>
	//   83  196:astore_2        
			}
			((StringBuilder) (drawable)).append("Can't find package ");
	//   84  197:aload_2         
	//   85  198:ldc2            #574 <String "Can't find package ">
	//   86  201:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   87  204:pop             
			((StringBuilder) (drawable)).append(mObj1);
	//   88  205:aload_2         
	//   89  206:aload_0         
	//   90  207:getfield        #149 <Field Object mObj1>
	//   91  210:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   92  213:pop             
			throw new IllegalArgumentException(((StringBuilder) (drawable)).toString(), ((Throwable) (intent)));
	//   93  214:new             #191 <Class IllegalArgumentException>
	//   94  217:dup             
	//   95  218:aload_2         
	//   96  219:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   97  222:aload_1         
	//   98  223:invokespecial   #577 <Method void IllegalArgumentException(String, Throwable)>
	//   99  226:athrow          
		}
		drawable1 = ContextCompat.getDrawable(context, mInt1);
		if(drawable1.getIntrinsicWidth() > 0 && drawable1.getIntrinsicHeight() > 0) goto _L7; else goto _L6
_L7:
		context = ((Context) (Bitmap.createBitmap(drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
		  goto _L8
_L6:
		j = ((ActivityManager)context.getSystemService("activity")).getLauncherLargeIconSize();
		context = ((Context) (Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888)));
_L8:
		drawable1.setBounds(0, 0, ((Bitmap) (context)).getWidth(), ((Bitmap) (context)).getHeight());
		drawable1.draw(new Canvas(((Bitmap) (context))));
		break; /* Loop/switch isn't completed */
_L4:
		Bitmap bitmap = (Bitmap)mObj1;
	//  100  227:aload_0         
	//  101  228:getfield        #149 <Field Object mObj1>
	//  102  231:checkcast       #203 <Class Bitmap>
	//  103  234:astore          6
		context = ((Context) (bitmap));
	//  104  236:aload           6
	//  105  238:astore_3        
		if(drawable != null)
	//* 106  239:aload_2         
	//* 107  240:ifnull          270
			context = ((Context) (bitmap.copy(bitmap.getConfig(), true)));
	//  108  243:aload           6
	//  109  245:aload           6
	//  110  247:invokevirtual   #581 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//  111  250:iconst_1        
	//  112  251:invokevirtual   #585 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//  113  254:astore_3        
		break; /* Loop/switch isn't completed */
	//  114  255:goto            270
_L2:
		context = ((Context) (createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, true)));
	//  115  258:aload_0         
	//  116  259:getfield        #149 <Field Object mObj1>
	//  117  262:checkcast       #203 <Class Bitmap>
	//  118  265:iconst_1        
	//  119  266:invokestatic    #430 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap, boolean)>
	//  120  269:astore_3        
		if(drawable != null)
	//* 121  270:aload_2         
	//* 122  271:ifnull          314
		{
			int k = ((Bitmap) (context)).getWidth();
	//  123  274:aload_3         
	//  124  275:invokevirtual   #207 <Method int Bitmap.getWidth()>
	//  125  278:istore          4
			int l = ((Bitmap) (context)).getHeight();
	//  126  280:aload_3         
	//  127  281:invokevirtual   #210 <Method int Bitmap.getHeight()>
	//  128  284:istore          5
			drawable.setBounds(k / 2, l / 2, k, l);
	//  129  286:aload_2         
	//  130  287:iload           4
	//  131  289:iconst_2        
	//  132  290:idiv            
	//  133  291:iload           5
	//  134  293:iconst_2        
	//  135  294:idiv            
	//  136  295:iload           4
	//  137  297:iload           5
	//  138  299:invokevirtual   #568 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(new Canvas(((Bitmap) (context))));
	//  139  302:aload_2         
	//  140  303:new             #228 <Class Canvas>
	//  141  306:dup             
	//  142  307:aload_3         
	//  143  308:invokespecial   #231 <Method void Canvas(Bitmap)>
	//  144  311:invokevirtual   #572 <Method void Drawable.draw(Canvas)>
		}
		intent.putExtra("android.intent.extra.shortcut.ICON", ((Parcelable) (context)));
	//  145  314:aload_1         
	//  146  315:ldc2            #587 <String "android.intent.extra.shortcut.ICON">
	//  147  318:aload_3         
	//  148  319:invokevirtual   #540 <Method Intent Intent.putExtra(String, Parcelable)>
	//  149  322:pop             
		return;
	//  150  323:return          
	}

	public void checkResource(Context context)
	{
		if(mType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          156
		{
			String s2 = (String)mObj1;
	//    4    8:aload_0         
	//    5    9:getfield        #149 <Field Object mObj1>
	//    6   12:checkcast       #371 <Class String>
	//    7   15:astore          5
			if(!s2.contains(":"))
	//*   8   17:aload           5
	//*   9   19:ldc2            #589 <String ":">
	//*  10   22:invokevirtual   #592 <Method boolean String.contains(CharSequence)>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			String s1 = s2.split(":", -1)[1];
	//   13   29:aload           5
	//   14   31:ldc2            #589 <String ":">
	//   15   34:iconst_m1       
	//   16   35:invokevirtual   #596 <Method String[] String.split(String, int)>
	//   17   38:iconst_1        
	//   18   39:aaload          
	//   19   40:astore          4
			String s = s1.split("/", -1)[0];
	//   20   42:aload           4
	//   21   44:ldc2            #598 <String "/">
	//   22   47:iconst_m1       
	//   23   48:invokevirtual   #596 <Method String[] String.split(String, int)>
	//   24   51:iconst_0        
	//   25   52:aaload          
	//   26   53:astore_3        
			s1 = s1.split("/", -1)[1];
	//   27   54:aload           4
	//   28   56:ldc2            #598 <String "/">
	//   29   59:iconst_m1       
	//   30   60:invokevirtual   #596 <Method String[] String.split(String, int)>
	//   31   63:iconst_1        
	//   32   64:aaload          
	//   33   65:astore          4
			s2 = s2.split(":", -1)[0];
	//   34   67:aload           5
	//   35   69:ldc2            #589 <String ":">
	//   36   72:iconst_m1       
	//   37   73:invokevirtual   #596 <Method String[] String.split(String, int)>
	//   38   76:iconst_0        
	//   39   77:aaload          
	//   40   78:astore          5
			int i = getResources(context, s2).getIdentifier(s1, s, s2);
	//   41   80:aload_1         
	//   42   81:aload           5
	//   43   83:invokestatic    #182 <Method Resources getResources(Context, String)>
	//   44   86:aload           4
	//   45   88:aload_3         
	//   46   89:aload           5
	//   47   91:invokevirtual   #602 <Method int Resources.getIdentifier(String, String, String)>
	//   48   94:istore_2        
			if(mInt1 != i)
	//*  49   95:aload_0         
	//*  50   96:getfield        #101 <Field int mInt1>
	//*  51   99:iload_2         
	//*  52  100:icmpeq          156
			{
				context = ((Context) (new StringBuilder()));
	//   53  103:new             #123 <Class StringBuilder>
	//   54  106:dup             
	//   55  107:invokespecial   #124 <Method void StringBuilder()>
	//   56  110:astore_1        
				((StringBuilder) (context)).append("Id has changed for ");
	//   57  111:aload_1         
	//   58  112:ldc2            #604 <String "Id has changed for ">
	//   59  115:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   60  118:pop             
				((StringBuilder) (context)).append(s2);
	//   61  119:aload_1         
	//   62  120:aload           5
	//   63  122:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   64  125:pop             
				((StringBuilder) (context)).append("/");
	//   65  126:aload_1         
	//   66  127:ldc2            #598 <String "/">
	//   67  130:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   68  133:pop             
				((StringBuilder) (context)).append(s1);
	//   69  134:aload_1         
	//   70  135:aload           4
	//   71  137:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   72  140:pop             
				Log.i("IconCompat", ((StringBuilder) (context)).toString());
	//   73  141:ldc1            #47  <String "IconCompat">
	//   74  143:aload_1         
	//   75  144:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   76  147:invokestatic    #607 <Method int Log.i(String, String)>
	//   77  150:pop             
				mInt1 = i;
	//   78  151:aload_0         
	//   79  152:iload_2         
	//   80  153:putfield        #101 <Field int mInt1>
			}
		}
	//   81  156:return          
	}

	public int getResId()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getResId((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #149 <Field Object mObj1>
	//    9   20:checkcast       #334 <Class Icon>
	//   10   23:invokestatic    #185 <Method int getResId(Icon)>
	//   11   26:ireturn         
		if(mType == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #87  <Field int mType>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          40
		{
			return mInt1;
	//   16   35:aload_0         
	//   17   36:getfield        #101 <Field int mInt1>
	//   18   39:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #123 <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #124 <Method void StringBuilder()>
	//   22   47:astore_1        
			stringbuilder.append("called getResId() on ");
	//   23   48:aload_1         
	//   24   49:ldc2            #609 <String "called getResId() on ">
	//   25   52:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			stringbuilder.append(((Object) (this)));
	//   27   56:aload_1         
	//   28   57:aload_0         
	//   29   58:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   30   61:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   31   62:new             #611 <Class IllegalStateException>
	//   32   65:dup             
	//   33   66:aload_1         
	//   34   67:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   35   70:invokespecial   #612 <Method void IllegalStateException(String)>
	//   36   73:athrow          
		}
	}

	public String getResPackage()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getResPackage((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #149 <Field Object mObj1>
	//    9   20:checkcast       #334 <Class Icon>
	//   10   23:invokestatic    #178 <Method String getResPackage(Icon)>
	//   11   26:areturn         
		if(mType == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #87  <Field int mType>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          52
		{
			return ((String)mObj1).split(":", -1)[0];
	//   16   35:aload_0         
	//   17   36:getfield        #149 <Field Object mObj1>
	//   18   39:checkcast       #371 <Class String>
	//   19   42:ldc2            #589 <String ":">
	//   20   45:iconst_m1       
	//   21   46:invokevirtual   #596 <Method String[] String.split(String, int)>
	//   22   49:iconst_0        
	//   23   50:aaload          
	//   24   51:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   52:new             #123 <Class StringBuilder>
	//   26   55:dup             
	//   27   56:invokespecial   #124 <Method void StringBuilder()>
	//   28   59:astore_1        
			stringbuilder.append("called getResPackage() on ");
	//   29   60:aload_1         
	//   30   61:ldc2            #614 <String "called getResPackage() on ">
	//   31   64:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
			stringbuilder.append(((Object) (this)));
	//   33   68:aload_1         
	//   34   69:aload_0         
	//   35   70:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   36   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   37   74:new             #611 <Class IllegalStateException>
	//   38   77:dup             
	//   39   78:aload_1         
	//   40   79:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   41   82:invokespecial   #612 <Method void IllegalStateException(String)>
	//   42   85:athrow          
		}
	}

	public int getType()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getType((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #149 <Field Object mObj1>
	//    9   20:checkcast       #334 <Class Icon>
	//   10   23:invokestatic    #166 <Method int getType(Icon)>
	//   11   26:ireturn         
		else
			return mType;
	//   12   27:aload_0         
	//   13   28:getfield        #87  <Field int mType>
	//   14   31:ireturn         
	}

	public Uri getUri()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getUri((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #149 <Field Object mObj1>
	//    9   20:checkcast       #334 <Class Icon>
	//   10   23:invokestatic    #170 <Method Uri getUri(Icon)>
	//   11   26:areturn         
		else
			return Uri.parse((String)mObj1);
	//   12   27:aload_0         
	//   13   28:getfield        #149 <Field Object mObj1>
	//   14   31:checkcast       #371 <Class String>
	//   15   34:invokestatic    #437 <Method Uri Uri.parse(String)>
	//   16   37:areturn         
	}

	public Drawable loadDrawable(Context context)
	{
		checkResource(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #520 <Method void checkResource(Context)>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   3    5:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          23
	//*   5   10:icmplt          22
			return toIcon().loadDrawable(context);
	//    6   13:aload_0         
	//    7   14:invokevirtual   #619 <Method Icon toIcon()>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #621 <Method Drawable Icon.loadDrawable(Context)>
	//   10   21:areturn         
		context = ((Context) (loadDrawableInner(context)));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #623 <Method Drawable loadDrawableInner(Context)>
	//   14   27:astore_1        
		if(context != null && (mTintList != null || mTintMode != DEFAULT_TINT_MODE))
	//*  15   28:aload_1         
	//*  16   29:ifnull          70
	//*  17   32:aload_0         
	//*  18   33:getfield        #81  <Field ColorStateList mTintList>
	//*  19   36:ifnonnull       49
	//*  20   39:aload_0         
	//*  21   40:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//*  22   43:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*  23   46:if_acmpeq       70
		{
			((Drawable) (context)).mutate();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #627 <Method Drawable Drawable.mutate()>
	//   26   53:pop             
			DrawableCompat.setTintList(((Drawable) (context)), mTintList);
	//   27   54:aload_1         
	//   28   55:aload_0         
	//   29   56:getfield        #81  <Field ColorStateList mTintList>
	//   30   59:invokestatic    #633 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			DrawableCompat.setTintMode(((Drawable) (context)), mTintMode);
	//   31   62:aload_1         
	//   32   63:aload_0         
	//   33   64:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   34   67:invokestatic    #637 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		}
		return ((Drawable) (context));
	//   35   70:aload_1         
	//   36   71:areturn         
	}

	public void onPostParceling()
	{
		mTintMode = android.graphics.PorterDuff.Mode.valueOf(mTintModeStr);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #640 <Field String mTintModeStr>
	//    3    5:invokestatic    #121 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//    4    8:putfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
		int i = mType;
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field int mType>
	//    7   15:istore_1        
		if(i != -1)
	//*   8   16:iload_1         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          130
		{
			Parcelable parcelable;
			switch(i)
	//*  11   21:iload_1         
			{
	//*  12   22:tableswitch     1 5: default 56
	//	               1 88
	//	               2 66
	//	               3 57
	//	               4 66
	//	               5 88
			default:
				return;
	//   13   56:return          

			case 3: // '\003'
				mObj1 = ((Object) (mData));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #642 <Field byte[] mData>
	//   17   62:putfield        #149 <Field Object mObj1>
				return;
	//   18   65:return          

			case 2: // '\002'
			case 4: // '\004'
				mObj1 = ((Object) (new String(mData, Charset.forName("UTF-16"))));
	//   19   66:aload_0         
	//   20   67:new             #371 <Class String>
	//   21   70:dup             
	//   22   71:aload_0         
	//   23   72:getfield        #642 <Field byte[] mData>
	//   24   75:ldc2            #644 <String "UTF-16">
	//   25   78:invokestatic    #650 <Method Charset Charset.forName(String)>
	//   26   81:invokespecial   #653 <Method void String(byte[], Charset)>
	//   27   84:putfield        #149 <Field Object mObj1>
				return;
	//   28   87:return          

			case 1: // '\001'
			case 5: // '\005'
				parcelable = mParcelable;
	//   29   88:aload_0         
	//   30   89:getfield        #655 <Field Parcelable mParcelable>
	//   31   92:astore_2        
				break;
			}
			if(parcelable != null)
	//*  32   93:aload_2         
	//*  33   94:ifnull          103
			{
				mObj1 = ((Object) (parcelable));
	//   34   97:aload_0         
	//   35   98:aload_2         
	//   36   99:putfield        #149 <Field Object mObj1>
				return;
	//   37  102:return          
			} else
			{
				byte abyte0[] = mData;
	//   38  103:aload_0         
	//   39  104:getfield        #642 <Field byte[] mData>
	//   40  107:astore_2        
				mObj1 = ((Object) (abyte0));
	//   41  108:aload_0         
	//   42  109:aload_2         
	//   43  110:putfield        #149 <Field Object mObj1>
				mType = 3;
	//   44  113:aload_0         
	//   45  114:iconst_3        
	//   46  115:putfield        #87  <Field int mType>
				mInt1 = 0;
	//   47  118:aload_0         
	//   48  119:iconst_0        
	//   49  120:putfield        #101 <Field int mInt1>
				mInt2 = abyte0.length;
	//   50  123:aload_0         
	//   51  124:aload_2         
	//   52  125:arraylength     
	//   53  126:putfield        #103 <Field int mInt2>
				return;
	//   54  129:return          
			}
		}
		Parcelable parcelable1 = mParcelable;
	//   55  130:aload_0         
	//   56  131:getfield        #655 <Field Parcelable mParcelable>
	//   57  134:astore_2        
		if(parcelable1 != null)
	//*  58  135:aload_2         
	//*  59  136:ifnull          145
		{
			mObj1 = ((Object) (parcelable1));
	//   60  139:aload_0         
	//   61  140:aload_2         
	//   62  141:putfield        #149 <Field Object mObj1>
			return;
	//   63  144:return          
		} else
		{
			throw new IllegalArgumentException("Invalid icon");
	//   64  145:new             #191 <Class IllegalArgumentException>
	//   65  148:dup             
	//   66  149:ldc2            #657 <String "Invalid icon">
	//   67  152:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   68  155:athrow          
		}
	}

	public void onPreParceling(boolean flag)
	{
		mTintModeStr = mTintMode.name();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    3    5:invokevirtual   #662 <Method String android.graphics.PorterDuff$Mode.name()>
	//    4    8:putfield        #640 <Field String mTintModeStr>
		int i = mType;
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field int mType>
	//    7   15:istore_2        
		if(i != -1)
	//*   8   16:iload_2         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          166
		{
			switch(i)
	//*  11   21:iload_2         
			{
	//*  12   22:tableswitch     1 5: default 56
	//	               1 111
	//	               2 90
	//	               3 78
	//	               4 57
	//	               5 111
			default:
				return;
	//   13   56:return          

			case 4: // '\004'
				mData = mObj1.toString().getBytes(Charset.forName("UTF-16"));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #149 <Field Object mObj1>
	//   17   62:invokevirtual   #663 <Method String Object.toString()>
	//   18   65:ldc2            #644 <String "UTF-16">
	//   19   68:invokestatic    #650 <Method Charset Charset.forName(String)>
	//   20   71:invokevirtual   #667 <Method byte[] String.getBytes(Charset)>
	//   21   74:putfield        #642 <Field byte[] mData>
				return;
	//   22   77:return          

			case 3: // '\003'
				mData = (byte[])mObj1;
	//   23   78:aload_0         
	//   24   79:aload_0         
	//   25   80:getfield        #149 <Field Object mObj1>
	//   26   83:checkcast       #475 <Class byte[]>
	//   27   86:putfield        #642 <Field byte[] mData>
				return;
	//   28   89:return          

			case 2: // '\002'
				mData = ((String)mObj1).getBytes(Charset.forName("UTF-16"));
	//   29   90:aload_0         
	//   30   91:aload_0         
	//   31   92:getfield        #149 <Field Object mObj1>
	//   32   95:checkcast       #371 <Class String>
	//   33   98:ldc2            #644 <String "UTF-16">
	//   34  101:invokestatic    #650 <Method Charset Charset.forName(String)>
	//   35  104:invokevirtual   #667 <Method byte[] String.getBytes(Charset)>
	//   36  107:putfield        #642 <Field byte[] mData>
				return;
	//   37  110:return          

			case 1: // '\001'
			case 5: // '\005'
				break;
			}
			if(flag)
	//*  38  111:iload_1         
	//*  39  112:ifeq            154
			{
				Bitmap bitmap = (Bitmap)mObj1;
	//   40  115:aload_0         
	//   41  116:getfield        #149 <Field Object mObj1>
	//   42  119:checkcast       #203 <Class Bitmap>
	//   43  122:astore_3        
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   44  123:new             #669 <Class ByteArrayOutputStream>
	//   45  126:dup             
	//   46  127:invokespecial   #670 <Method void ByteArrayOutputStream()>
	//   47  130:astore          4
				bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, ((java.io.OutputStream) (bytearrayoutputstream)));
	//   48  132:aload_3         
	//   49  133:getstatic       #676 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   50  136:bipush          90
	//   51  138:aload           4
	//   52  140:invokevirtual   #680 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   53  143:pop             
				mData = bytearrayoutputstream.toByteArray();
	//   54  144:aload_0         
	//   55  145:aload           4
	//   56  147:invokevirtual   #684 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   57  150:putfield        #642 <Field byte[] mData>
				return;
	//   58  153:return          
			} else
			{
				mParcelable = (Parcelable)mObj1;
	//   59  154:aload_0         
	//   60  155:aload_0         
	//   61  156:getfield        #149 <Field Object mObj1>
	//   62  159:checkcast       #686 <Class Parcelable>
	//   63  162:putfield        #655 <Field Parcelable mParcelable>
				return;
	//   64  165:return          
			}
		}
		if(!flag)
	//*  65  166:iload_1         
	//*  66  167:ifne            182
		{
			mParcelable = (Parcelable)mObj1;
	//   67  170:aload_0         
	//   68  171:aload_0         
	//   69  172:getfield        #149 <Field Object mObj1>
	//   70  175:checkcast       #686 <Class Parcelable>
	//   71  178:putfield        #655 <Field Parcelable mParcelable>
			return;
	//   72  181:return          
		} else
		{
			throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
	//   73  182:new             #191 <Class IllegalArgumentException>
	//   74  185:dup             
	//   75  186:ldc2            #688 <String "Can't serialize Icon created with IconCompat#createFromIcon">
	//   76  189:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   77  192:athrow          
		}
	}

	public IconCompat setTint(int i)
	{
		return setTintList(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #694 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #697 <Method IconCompat setTintList(ColorStateList)>
	//    4    8:areturn         
	}

	public IconCompat setTintList(ColorStateList colorstatelist)
	{
		mTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field ColorStateList mTintList>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public IconCompat setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #93  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #701 <Method void Bundle()>
	//    3    7:astore_2        
		int i = mType;
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field int mType>
	//    6   12:istore_1        
		if(i != -1)
	//*   7   13:iload_1         
	//*   8   14:iconst_m1       
	//*   9   15:icmpeq          111
			switch(i)
	//*  10   18:iload_1         
			{
	//*  11   19:tableswitch     1 5: default 52
	//	               1 95
	//	               2 79
	//	               3 63
	//	               4 79
	//	               5 95
			default:
				throw new IllegalArgumentException("Invalid icon");
	//   12   52:new             #191 <Class IllegalArgumentException>
	//   13   55:dup             
	//   14   56:ldc2            #657 <String "Invalid icon">
	//   15   59:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   16   62:athrow          

			case 3: // '\003'
				bundle.putByteArray("obj", (byte[])mObj1);
	//   17   63:aload_2         
	//   18   64:ldc1            #29  <String "obj">
	//   19   66:aload_0         
	//   20   67:getfield        #149 <Field Object mObj1>
	//   21   70:checkcast       #475 <Class byte[]>
	//   22   73:invokevirtual   #705 <Method void Bundle.putByteArray(String, byte[])>
				break;

	//*  23   76:goto            124
			case 2: // '\002'
			case 4: // '\004'
				bundle.putString("obj", (String)mObj1);
	//   24   79:aload_2         
	//   25   80:ldc1            #29  <String "obj">
	//   26   82:aload_0         
	//   27   83:getfield        #149 <Field Object mObj1>
	//   28   86:checkcast       #371 <Class String>
	//   29   89:invokevirtual   #709 <Method void Bundle.putString(String, String)>
				break;

	//*  30   92:goto            124
			case 1: // '\001'
			case 5: // '\005'
				bundle.putParcelable("obj", ((Parcelable) ((Bitmap)mObj1)));
	//   31   95:aload_2         
	//   32   96:ldc1            #29  <String "obj">
	//   33   98:aload_0         
	//   34   99:getfield        #149 <Field Object mObj1>
	//   35  102:checkcast       #203 <Class Bitmap>
	//   36  105:invokevirtual   #713 <Method void Bundle.putParcelable(String, Parcelable)>
				break;
			}
		else
	//*  37  108:goto            124
			bundle.putParcelable("obj", (Parcelable)mObj1);
	//   38  111:aload_2         
	//   39  112:ldc1            #29  <String "obj">
	//   40  114:aload_0         
	//   41  115:getfield        #149 <Field Object mObj1>
	//   42  118:checkcast       #686 <Class Parcelable>
	//   43  121:invokevirtual   #713 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putInt("type", mType);
	//   44  124:aload_2         
	//   45  125:ldc1            #38  <String "type">
	//   46  127:aload_0         
	//   47  128:getfield        #87  <Field int mType>
	//   48  131:invokevirtual   #717 <Method void Bundle.putInt(String, int)>
		bundle.putInt("int1", mInt1);
	//   49  134:aload_2         
	//   50  135:ldc1            #23  <String "int1">
	//   51  137:aload_0         
	//   52  138:getfield        #101 <Field int mInt1>
	//   53  141:invokevirtual   #717 <Method void Bundle.putInt(String, int)>
		bundle.putInt("int2", mInt2);
	//   54  144:aload_2         
	//   55  145:ldc1            #26  <String "int2">
	//   56  147:aload_0         
	//   57  148:getfield        #103 <Field int mInt2>
	//   58  151:invokevirtual   #717 <Method void Bundle.putInt(String, int)>
		Object obj = ((Object) (mTintList));
	//   59  154:aload_0         
	//   60  155:getfield        #81  <Field ColorStateList mTintList>
	//   61  158:astore_3        
		if(obj != null)
	//*  62  159:aload_3         
	//*  63  160:ifnull          170
			bundle.putParcelable("tint_list", ((Parcelable) (obj)));
	//   64  163:aload_2         
	//   65  164:ldc1            #32  <String "tint_list">
	//   66  166:aload_3         
	//   67  167:invokevirtual   #713 <Method void Bundle.putParcelable(String, Parcelable)>
		obj = ((Object) (mTintMode));
	//   68  170:aload_0         
	//   69  171:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   70  174:astore_3        
		if(obj != DEFAULT_TINT_MODE)
	//*  71  175:aload_3         
	//*  72  176:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*  73  179:if_acmpeq       192
			bundle.putString("tint_mode", ((android.graphics.PorterDuff.Mode) (obj)).name());
	//   74  182:aload_2         
	//   75  183:ldc1            #35  <String "tint_mode">
	//   76  185:aload_3         
	//   77  186:invokevirtual   #662 <Method String android.graphics.PorterDuff$Mode.name()>
	//   78  189:invokevirtual   #709 <Method void Bundle.putString(String, String)>
		return bundle;
	//   79  192:aload_2         
	//   80  193:areturn         
	}

	public Icon toIcon()
	{
		int i = mType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int mType>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          192
		{
			Icon icon;
			switch(i)
	//*   6   10:iload_1         
			{
	//*   7   11:tableswitch     1 5: default 44
	//	               1 146
	//	               2 131
	//	               3 109
	//	               4 95
	//	               5 55
			default:
				throw new IllegalArgumentException("Unknown type");
	//    8   44:new             #191 <Class IllegalArgumentException>
	//    9   47:dup             
	//   10   48:ldc2            #719 <String "Unknown type">
	//   11   51:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   12   54:athrow          

			case 5: // '\005'
				if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  13   55:getstatic       #332 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   58:bipush          26
	//*  15   60:icmplt          77
					icon = Icon.createWithAdaptiveBitmap((Bitmap)mObj1);
	//   16   63:aload_0         
	//   17   64:getfield        #149 <Field Object mObj1>
	//   18   67:checkcast       #203 <Class Bitmap>
	//   19   70:invokestatic    #722 <Method Icon Icon.createWithAdaptiveBitmap(Bitmap)>
	//   20   73:astore_2        
				else
	//*  21   74:goto            157
					icon = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false));
	//   22   77:aload_0         
	//   23   78:getfield        #149 <Field Object mObj1>
	//   24   81:checkcast       #203 <Class Bitmap>
	//   25   84:iconst_0        
	//   26   85:invokestatic    #430 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap, boolean)>
	//   27   88:invokestatic    #724 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   28   91:astore_2        
				break;

	//*  29   92:goto            157
			case 4: // '\004'
				icon = Icon.createWithContentUri((String)mObj1);
	//   30   95:aload_0         
	//   31   96:getfield        #149 <Field Object mObj1>
	//   32   99:checkcast       #371 <Class String>
	//   33  102:invokestatic    #727 <Method Icon Icon.createWithContentUri(String)>
	//   34  105:astore_2        
				break;

	//*  35  106:goto            157
			case 3: // '\003'
				icon = Icon.createWithData((byte[])mObj1, mInt1, mInt2);
	//   36  109:aload_0         
	//   37  110:getfield        #149 <Field Object mObj1>
	//   38  113:checkcast       #475 <Class byte[]>
	//   39  116:aload_0         
	//   40  117:getfield        #101 <Field int mInt1>
	//   41  120:aload_0         
	//   42  121:getfield        #103 <Field int mInt2>
	//   43  124:invokestatic    #730 <Method Icon Icon.createWithData(byte[], int, int)>
	//   44  127:astore_2        
				break;

	//*  45  128:goto            157
			case 2: // '\002'
				icon = Icon.createWithResource(getResPackage(), mInt1);
	//   46  131:aload_0         
	//   47  132:invokevirtual   #480 <Method String getResPackage()>
	//   48  135:aload_0         
	//   49  136:getfield        #101 <Field int mInt1>
	//   50  139:invokestatic    #733 <Method Icon Icon.createWithResource(String, int)>
	//   51  142:astore_2        
				break;

	//*  52  143:goto            157
			case 1: // '\001'
				icon = Icon.createWithBitmap((Bitmap)mObj1);
	//   53  146:aload_0         
	//   54  147:getfield        #149 <Field Object mObj1>
	//   55  150:checkcast       #203 <Class Bitmap>
	//   56  153:invokestatic    #724 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   57  156:astore_2        
				break;
			}
			Object obj = ((Object) (mTintList));
	//   58  157:aload_0         
	//   59  158:getfield        #81  <Field ColorStateList mTintList>
	//   60  161:astore_3        
			if(obj != null)
	//*  61  162:aload_3         
	//*  62  163:ifnull          172
				icon.setTintList(((ColorStateList) (obj)));
	//   63  166:aload_2         
	//   64  167:aload_3         
	//   65  168:invokevirtual   #736 <Method Icon Icon.setTintList(ColorStateList)>
	//   66  171:pop             
			obj = ((Object) (mTintMode));
	//   67  172:aload_0         
	//   68  173:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   69  176:astore_3        
			if(obj != DEFAULT_TINT_MODE)
	//*  70  177:aload_3         
	//*  71  178:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*  72  181:if_acmpeq       190
				icon.setTintMode(((android.graphics.PorterDuff.Mode) (obj)));
	//   73  184:aload_2         
	//   74  185:aload_3         
	//   75  186:invokevirtual   #739 <Method Icon Icon.setTintMode(android.graphics.PorterDuff$Mode)>
	//   76  189:pop             
			return icon;
	//   77  190:aload_2         
	//   78  191:areturn         
		} else
		{
			return (Icon)mObj1;
	//   79  192:aload_0         
	//   80  193:getfield        #149 <Field Object mObj1>
	//   81  196:checkcast       #334 <Class Icon>
	//   82  199:areturn         
		}
	}

	public String toString()
	{
		if(mType == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			return String.valueOf(mObj1);
	//    4    8:aload_0         
	//    5    9:getfield        #149 <Field Object mObj1>
	//    6   12:invokestatic    #742 <Method String String.valueOf(Object)>
	//    7   15:areturn         
		StringBuilder stringbuilder = new StringBuilder("Icon(typ=");
	//    8   16:new             #123 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:ldc2            #744 <String "Icon(typ=">
	//   11   23:invokespecial   #745 <Method void StringBuilder(String)>
	//   12   26:astore_1        
		stringbuilder.append(typeToString(mType));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int mType>
	//   16   32:invokestatic    #747 <Method String typeToString(int)>
	//   17   35:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		switch(mType)
	//*  19   39:aload_0         
	//*  20   40:getfield        #87  <Field int mType>
		{
	//*  21   43:tableswitch     1 5: default 76
	//	               1 196
	//	               2 143
	//	               3 99
	//	               4 79
	//	               5 196
	//*  22   76:goto            242
		case 4: // '\004'
			stringbuilder.append(" uri=");
	//   23   79:aload_1         
	//   24   80:ldc2            #749 <String " uri=">
	//   25   83:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   26   86:pop             
			stringbuilder.append(mObj1);
	//   27   87:aload_1         
	//   28   88:aload_0         
	//   29   89:getfield        #149 <Field Object mObj1>
	//   30   92:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   31   95:pop             
			break;

	//*  32   96:goto            242
		case 3: // '\003'
			stringbuilder.append(" len=");
	//   33   99:aload_1         
	//   34  100:ldc2            #751 <String " len=">
	//   35  103:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   36  106:pop             
			stringbuilder.append(mInt1);
	//   37  107:aload_1         
	//   38  108:aload_0         
	//   39  109:getfield        #101 <Field int mInt1>
	//   40  112:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   41  115:pop             
			if(mInt2 != 0)
	//*  42  116:aload_0         
	//*  43  117:getfield        #103 <Field int mInt2>
	//*  44  120:ifeq            242
			{
				stringbuilder.append(" off=");
	//   45  123:aload_1         
	//   46  124:ldc2            #753 <String " off=">
	//   47  127:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   48  130:pop             
				stringbuilder.append(mInt2);
	//   49  131:aload_1         
	//   50  132:aload_0         
	//   51  133:getfield        #103 <Field int mInt2>
	//   52  136:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   53  139:pop             
			}
			break;

	//*  54  140:goto            242
		case 2: // '\002'
			stringbuilder.append(" pkg=");
	//   55  143:aload_1         
	//   56  144:ldc2            #755 <String " pkg=">
	//   57  147:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   58  150:pop             
			stringbuilder.append(getResPackage());
	//   59  151:aload_1         
	//   60  152:aload_0         
	//   61  153:invokevirtual   #480 <Method String getResPackage()>
	//   62  156:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   63  159:pop             
			stringbuilder.append(" id=");
	//   64  160:aload_1         
	//   65  161:ldc2            #757 <String " id=">
	//   66  164:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   67  167:pop             
			stringbuilder.append(String.format("0x%08x", new Object[] {
				Integer.valueOf(getResId())
			}));
	//   68  168:aload_1         
	//   69  169:ldc2            #759 <String "0x%08x">
	//   70  172:iconst_1        
	//   71  173:anewarray       Object[]
	//   72  176:dup             
	//   73  177:iconst_0        
	//   74  178:aload_0         
	//   75  179:invokevirtual   #760 <Method int getResId()>
	//   76  182:invokestatic    #501 <Method Integer Integer.valueOf(int)>
	//   77  185:aastore         
	//   78  186:invokestatic    #404 <Method String String.format(String, Object[])>
	//   79  189:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   80  192:pop             
			break;

	//*  81  193:goto            242
		case 1: // '\001'
		case 5: // '\005'
			stringbuilder.append(" size=");
	//   82  196:aload_1         
	//   83  197:ldc2            #762 <String " size=">
	//   84  200:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   85  203:pop             
			stringbuilder.append(((Bitmap)mObj1).getWidth());
	//   86  204:aload_1         
	//   87  205:aload_0         
	//   88  206:getfield        #149 <Field Object mObj1>
	//   89  209:checkcast       #203 <Class Bitmap>
	//   90  212:invokevirtual   #207 <Method int Bitmap.getWidth()>
	//   91  215:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   92  218:pop             
			stringbuilder.append("x");
	//   93  219:aload_1         
	//   94  220:ldc2            #764 <String "x">
	//   95  223:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   96  226:pop             
			stringbuilder.append(((Bitmap)mObj1).getHeight());
	//   97  227:aload_1         
	//   98  228:aload_0         
	//   99  229:getfield        #149 <Field Object mObj1>
	//  100  232:checkcast       #203 <Class Bitmap>
	//  101  235:invokevirtual   #210 <Method int Bitmap.getHeight()>
	//  102  238:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//  103  241:pop             
			break;
		}
		if(mTintList != null)
	//* 104  242:aload_0         
	//* 105  243:getfield        #81  <Field ColorStateList mTintList>
	//* 106  246:ifnull          266
		{
			stringbuilder.append(" tint=");
	//  107  249:aload_1         
	//  108  250:ldc2            #766 <String " tint=">
	//  109  253:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  110  256:pop             
			stringbuilder.append(((Object) (mTintList)));
	//  111  257:aload_1         
	//  112  258:aload_0         
	//  113  259:getfield        #81  <Field ColorStateList mTintList>
	//  114  262:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//  115  265:pop             
		}
		if(mTintMode != DEFAULT_TINT_MODE)
	//* 116  266:aload_0         
	//* 117  267:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//* 118  270:getstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//* 119  273:if_acmpeq       293
		{
			stringbuilder.append(" mode=");
	//  120  276:aload_1         
	//  121  277:ldc2            #768 <String " mode=">
	//  122  280:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  123  283:pop             
			stringbuilder.append(((Object) (mTintMode)));
	//  124  284:aload_1         
	//  125  285:aload_0         
	//  126  286:getfield        #83  <Field android.graphics.PorterDuff$Mode mTintMode>
	//  127  289:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//  128  292:pop             
		}
		stringbuilder.append(")");
	//  129  293:aload_1         
	//  130  294:ldc2            #770 <String ")">
	//  131  297:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  132  300:pop             
		return stringbuilder.toString();
	//  133  301:aload_1         
	//  134  302:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  135  305:areturn         
	}

	private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25F;
	private static final int AMBIENT_SHADOW_ALPHA = 30;
	private static final float BLUR_FACTOR = 0.01041667F;
	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
	private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667F;
	private static final String EXTRA_INT1 = "int1";
	private static final String EXTRA_INT2 = "int2";
	private static final String EXTRA_OBJ = "obj";
	private static final String EXTRA_TINT_LIST = "tint_list";
	private static final String EXTRA_TINT_MODE = "tint_mode";
	private static final String EXTRA_TYPE = "type";
	private static final float ICON_DIAMETER_FACTOR = 0.9166667F;
	private static final int KEY_SHADOW_ALPHA = 61;
	private static final float KEY_SHADOW_OFFSET_FACTOR = 0.02083333F;
	private static final String TAG = "IconCompat";
	public static final int TYPE_UNKNOWN = -1;
	public byte mData[];
	public int mInt1;
	public int mInt2;
	Object mObj1;
	public Parcelable mParcelable;
	public ColorStateList mTintList;
	android.graphics.PorterDuff.Mode mTintMode;
	public String mTintModeStr;
	public int mType;

	static 
	{
		DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #73  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #75  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
