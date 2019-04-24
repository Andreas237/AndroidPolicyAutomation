// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.Context;
import android.content.Intent;
import android.graphics.*;
import android.graphics.drawable.Icon;
import android.net.Uri;

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

	static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap)
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
	//    9   16:istore          4
		Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   10   18:iload           4
	//   11   20:iload           4
	//   12   22:getstatic       #67  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   13   25:invokestatic    #71  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   14   28:astore          5
		Canvas canvas = new Canvas(bitmap1);
	//   15   30:new             #73  <Class Canvas>
	//   16   33:dup             
	//   17   34:aload           5
	//   18   36:invokespecial   #76  <Method void Canvas(Bitmap)>
	//   19   39:astore          6
		Paint paint = new Paint(3);
	//   20   41:new             #78  <Class Paint>
	//   21   44:dup             
	//   22   45:iconst_3        
	//   23   46:invokespecial   #80  <Method void Paint(int)>
	//   24   49:astore          7
		float f = (float)i * 0.5F;
	//   25   51:iload           4
	//   26   53:i2f             
	//   27   54:ldc1            #81  <Float 0.5F>
	//   28   56:fmul            
	//   29   57:fstore_1        
		float f1 = 0.9166667F * f;
	//   30   58:ldc1            #16  <Float 0.9166667F>
	//   31   60:fload_1         
	//   32   61:fmul            
	//   33   62:fstore_2        
		float f2 = 0.01041667F * (float)i;
	//   34   63:ldc1            #12  <Float 0.01041667F>
	//   35   65:iload           4
	//   36   67:i2f             
	//   37   68:fmul            
	//   38   69:fstore_3        
		paint.setColor(0);
	//   39   70:aload           7
	//   40   72:iconst_0        
	//   41   73:invokevirtual   #84  <Method void Paint.setColor(int)>
		paint.setShadowLayer(f2, 0.0F, 0.02083333F * (float)i, 0x3d000000);
	//   42   76:aload           7
	//   43   78:fload_3         
	//   44   79:fconst_0        
	//   45   80:ldc1            #20  <Float 0.02083333F>
	//   46   82:iload           4
	//   47   84:i2f             
	//   48   85:fmul            
	//   49   86:ldc1            #85  <Int 0x3d000000>
	//   50   88:invokevirtual   #89  <Method void Paint.setShadowLayer(float, float, float, int)>
		canvas.drawCircle(f, f, f1, paint);
	//   51   91:aload           6
	//   52   93:fload_1         
	//   53   94:fload_1         
	//   54   95:fload_2         
	//   55   96:aload           7
	//   56   98:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
		paint.setShadowLayer(f2, 0.0F, 0.0F, 0x1e000000);
	//   57  101:aload           7
	//   58  103:fload_3         
	//   59  104:fconst_0        
	//   60  105:fconst_0        
	//   61  106:ldc1            #94  <Int 0x1e000000>
	//   62  108:invokevirtual   #89  <Method void Paint.setShadowLayer(float, float, float, int)>
		canvas.drawCircle(f, f, f1, paint);
	//   63  111:aload           6
	//   64  113:fload_1         
	//   65  114:fload_1         
	//   66  115:fload_2         
	//   67  116:aload           7
	//   68  118:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
		paint.clearShadowLayer();
	//   69  121:aload           7
	//   70  123:invokevirtual   #97  <Method void Paint.clearShadowLayer()>
		paint.setColor(0xff000000);
	//   71  126:aload           7
	//   72  128:ldc1            #98  <Int 0xff000000>
	//   73  130:invokevirtual   #84  <Method void Paint.setColor(int)>
		BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
	//   74  133:new             #100 <Class BitmapShader>
	//   75  136:dup             
	//   76  137:aload_0         
	//   77  138:getstatic       #106 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   78  141:getstatic       #106 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   79  144:invokespecial   #109 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   80  147:astore          8
		Matrix matrix = new Matrix();
	//   81  149:new             #111 <Class Matrix>
	//   82  152:dup             
	//   83  153:invokespecial   #112 <Method void Matrix()>
	//   84  156:astore          9
		matrix.setTranslate(-(bitmap.getWidth() - i) / 2, -(bitmap.getHeight() - i) / 2);
	//   85  158:aload           9
	//   86  160:aload_0         
	//   87  161:invokevirtual   #52  <Method int Bitmap.getWidth()>
	//   88  164:iload           4
	//   89  166:isub            
	//   90  167:ineg            
	//   91  168:iconst_2        
	//   92  169:idiv            
	//   93  170:i2f             
	//   94  171:aload_0         
	//   95  172:invokevirtual   #55  <Method int Bitmap.getHeight()>
	//   96  175:iload           4
	//   97  177:isub            
	//   98  178:ineg            
	//   99  179:iconst_2        
	//  100  180:idiv            
	//  101  181:i2f             
	//  102  182:invokevirtual   #116 <Method void Matrix.setTranslate(float, float)>
		bitmapshader.setLocalMatrix(matrix);
	//  103  185:aload           8
	//  104  187:aload           9
	//  105  189:invokevirtual   #120 <Method void BitmapShader.setLocalMatrix(Matrix)>
		paint.setShader(((android.graphics.Shader) (bitmapshader)));
	//  106  192:aload           7
	//  107  194:aload           8
	//  108  196:invokevirtual   #124 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  109  199:pop             
		canvas.drawCircle(f, f, f1, paint);
	//  110  200:aload           6
	//  111  202:fload_1         
	//  112  203:fload_1         
	//  113  204:fload_2         
	//  114  205:aload           7
	//  115  207:invokevirtual   #93  <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.setBitmap(((Bitmap) (null)));
	//  116  210:aload           6
	//  117  212:aconst_null     
	//  118  213:invokevirtual   #127 <Method void Canvas.setBitmap(Bitmap)>
		return bitmap1;
	//  119  216:aload           5
	//  120  218:areturn         
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
		switch(mType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int mType>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 50
	//	               2 83
	//	               3 40
	//	               4 40
	//	               5 65
		case 3: // '\003'
		case 4: // '\004'
		default:
			throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
	//    3   40:new             #132 <Class IllegalArgumentException>
	//    4   43:dup             
	//    5   44:ldc1            #176 <String "Icon type not supported for intent shortcuts">
	//    6   46:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    7   49:athrow          

		case 1: // '\001'
			intent.putExtra("android.intent.extra.shortcut.ICON", ((android.os.Parcelable) ((Bitmap)mObj1)));
	//    8   50:aload_1         
	//    9   51:ldc1            #178 <String "android.intent.extra.shortcut.ICON">
	//   10   53:aload_0         
	//   11   54:getfield        #140 <Field Object mObj1>
	//   12   57:checkcast       #48  <Class Bitmap>
	//   13   60:invokevirtual   #184 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   14   63:pop             
			return;
	//   15   64:return          

		case 5: // '\005'
			intent.putExtra("android.intent.extra.shortcut.ICON", ((android.os.Parcelable) (createLegacyIconFromAdaptiveIcon((Bitmap)mObj1))));
	//   16   65:aload_1         
	//   17   66:ldc1            #178 <String "android.intent.extra.shortcut.ICON">
	//   18   68:aload_0         
	//   19   69:getfield        #140 <Field Object mObj1>
	//   20   72:checkcast       #48  <Class Bitmap>
	//   21   75:invokestatic    #186 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap)>
	//   22   78:invokevirtual   #184 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   23   81:pop             
			return;
	//   24   82:return          

		case 2: // '\002'
			intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ((android.os.Parcelable) (android.content.Intent.ShortcutIconResource.fromContext((Context)mObj1, mInt1))));
	//   25   83:aload_1         
	//   26   84:ldc1            #188 <String "android.intent.extra.shortcut.ICON_RESOURCE">
	//   27   86:aload_0         
	//   28   87:getfield        #140 <Field Object mObj1>
	//   29   90:checkcast       #190 <Class Context>
	//   30   93:aload_0         
	//   31   94:getfield        #160 <Field int mInt1>
	//   32   97:invokestatic    #196 <Method android.content.Intent$ShortcutIconResource android.content.Intent$ShortcutIconResource.fromContext(Context, int)>
	//   33  100:invokevirtual   #184 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   34  103:pop             
			return;
	//   35  104:return          
		}
	}

	public Icon toIcon()
	{
		switch(mType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int mType>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 50
	//	               2 94
	//	               3 109
	//	               4 131
	//	               5 61
		default:
			throw new IllegalArgumentException("Unknown type");
	//    3   40:new             #132 <Class IllegalArgumentException>
	//    4   43:dup             
	//    5   44:ldc1            #202 <String "Unknown type">
	//    6   46:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    7   49:athrow          

		case 1: // '\001'
			return Icon.createWithBitmap((Bitmap)mObj1);
	//    8   50:aload_0         
	//    9   51:getfield        #140 <Field Object mObj1>
	//   10   54:checkcast       #48  <Class Bitmap>
	//   11   57:invokestatic    #207 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   12   60:areturn         

		case 5: // '\005'
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  13   61:getstatic       #212 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   64:bipush          26
	//*  15   66:icmplt          80
				return Icon.createWithAdaptiveBitmap((Bitmap)mObj1);
	//   16   69:aload_0         
	//   17   70:getfield        #140 <Field Object mObj1>
	//   18   73:checkcast       #48  <Class Bitmap>
	//   19   76:invokestatic    #214 <Method Icon Icon.createWithAdaptiveBitmap(Bitmap)>
	//   20   79:areturn         
			else
				return Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap)mObj1));
	//   21   80:aload_0         
	//   22   81:getfield        #140 <Field Object mObj1>
	//   23   84:checkcast       #48  <Class Bitmap>
	//   24   87:invokestatic    #186 <Method Bitmap createLegacyIconFromAdaptiveIcon(Bitmap)>
	//   25   90:invokestatic    #207 <Method Icon Icon.createWithBitmap(Bitmap)>
	//   26   93:areturn         

		case 2: // '\002'
			return Icon.createWithResource((Context)mObj1, mInt1);
	//   27   94:aload_0         
	//   28   95:getfield        #140 <Field Object mObj1>
	//   29   98:checkcast       #190 <Class Context>
	//   30  101:aload_0         
	//   31  102:getfield        #160 <Field int mInt1>
	//   32  105:invokestatic    #217 <Method Icon Icon.createWithResource(Context, int)>
	//   33  108:areturn         

		case 3: // '\003'
			return Icon.createWithData((byte[])(byte[])mObj1, mInt1, mInt2);
	//   34  109:aload_0         
	//   35  110:getfield        #140 <Field Object mObj1>
	//   36  113:checkcast       #219 <Class byte[]>
	//   37  116:checkcast       #219 <Class byte[]>
	//   38  119:aload_0         
	//   39  120:getfield        #160 <Field int mInt1>
	//   40  123:aload_0         
	//   41  124:getfield        #162 <Field int mInt2>
	//   42  127:invokestatic    #222 <Method Icon Icon.createWithData(byte[], int, int)>
	//   43  130:areturn         

		case 4: // '\004'
			return Icon.createWithContentUri((String)mObj1);
	//   44  131:aload_0         
	//   45  132:getfield        #140 <Field Object mObj1>
	//   46  135:checkcast       #224 <Class String>
	//   47  138:invokestatic    #227 <Method Icon Icon.createWithContentUri(String)>
	//   48  141:areturn         
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
