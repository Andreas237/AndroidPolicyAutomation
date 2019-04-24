// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback
{
	public static interface OnSharedElementsReadyListener
	{

		public abstract void onSharedElementsReady();
	}


	public SharedElementCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	private static Bitmap createDrawableBitmap(Drawable drawable)
	{
		int i = drawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method int Drawable.getIntrinsicWidth()>
	//    2    4:istore_2        
		int j = drawable.getIntrinsicHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #41  <Method int Drawable.getIntrinsicHeight()>
	//    5    9:istore_3        
		if(i <= 0 || j <= 0)
	//*   6   10:iload_2         
	//*   7   11:ifle            18
	//*   8   14:iload_3         
	//*   9   15:ifgt            20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(i * j));
	//   12   20:fconst_1        
	//   13   21:getstatic       #26  <Field int MAX_IMAGE_SIZE>
	//   14   24:i2f             
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:imul            
	//   18   28:i2f             
	//   19   29:fdiv            
	//   20   30:invokestatic    #47  <Method float Math.min(float, float)>
	//   21   33:fstore_1        
		if((drawable instanceof BitmapDrawable) && f == 1.0F)
	//*  22   34:aload_0         
	//*  23   35:instanceof      #49  <Class BitmapDrawable>
	//*  24   38:ifeq            55
	//*  25   41:fload_1         
	//*  26   42:fconst_1        
	//*  27   43:fcmpl           
	//*  28   44:ifne            55
		{
			return ((BitmapDrawable)drawable).getBitmap();
	//   29   47:aload_0         
	//   30   48:checkcast       #49  <Class BitmapDrawable>
	//   31   51:invokevirtual   #53  <Method Bitmap BitmapDrawable.getBitmap()>
	//   32   54:areturn         
		} else
		{
			i = (int)((float)i * f);
	//   33   55:iload_2         
	//   34   56:i2f             
	//   35   57:fload_1         
	//   36   58:fmul            
	//   37   59:f2i             
	//   38   60:istore_2        
			j = (int)((float)j * f);
	//   39   61:iload_3         
	//   40   62:i2f             
	//   41   63:fload_1         
	//   42   64:fmul            
	//   43   65:f2i             
	//   44   66:istore_3        
			Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   45   67:iload_2         
	//   46   68:iload_3         
	//   47   69:getstatic       #59  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   48   72:invokestatic    #65  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   49   75:astore          8
			Canvas canvas = new Canvas(bitmap);
	//   50   77:new             #67  <Class Canvas>
	//   51   80:dup             
	//   52   81:aload           8
	//   53   83:invokespecial   #70  <Method void Canvas(Bitmap)>
	//   54   86:astore          9
			Rect rect = drawable.getBounds();
	//   55   88:aload_0         
	//   56   89:invokevirtual   #74  <Method Rect Drawable.getBounds()>
	//   57   92:astore          10
			int k = rect.left;
	//   58   94:aload           10
	//   59   96:getfield        #79  <Field int Rect.left>
	//   60   99:istore          4
			int l = rect.top;
	//   61  101:aload           10
	//   62  103:getfield        #82  <Field int Rect.top>
	//   63  106:istore          5
			int i1 = rect.right;
	//   64  108:aload           10
	//   65  110:getfield        #85  <Field int Rect.right>
	//   66  113:istore          6
			int j1 = rect.bottom;
	//   67  115:aload           10
	//   68  117:getfield        #88  <Field int Rect.bottom>
	//   69  120:istore          7
			drawable.setBounds(0, 0, i, j);
	//   70  122:aload_0         
	//   71  123:iconst_0        
	//   72  124:iconst_0        
	//   73  125:iload_2         
	//   74  126:iload_3         
	//   75  127:invokevirtual   #92  <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   76  130:aload_0         
	//   77  131:aload           9
	//   78  133:invokevirtual   #96  <Method void Drawable.draw(Canvas)>
			drawable.setBounds(k, l, i1, j1);
	//   79  136:aload_0         
	//   80  137:iload           4
	//   81  139:iload           5
	//   82  141:iload           6
	//   83  143:iload           7
	//   84  145:invokevirtual   #92  <Method void Drawable.setBounds(int, int, int, int)>
			return bitmap;
	//   85  148:aload           8
	//   86  150:areturn         
		}
	}

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		if(view instanceof ImageView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #100 <Class ImageView>
	//*   2    4:ifeq            115
		{
			ImageView imageview = (ImageView)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #100 <Class ImageView>
	//    5   11:astore          7
			Object obj = ((Object) (imageview.getDrawable()));
	//    6   13:aload           7
	//    7   15:invokevirtual   #104 <Method Drawable ImageView.getDrawable()>
	//    8   18:astore          8
			Drawable drawable = imageview.getBackground();
	//    9   20:aload           7
	//   10   22:invokevirtual   #107 <Method Drawable ImageView.getBackground()>
	//   11   25:astore          9
			if(obj != null && drawable == null)
	//*  12   27:aload           8
	//*  13   29:ifnull          115
	//*  14   32:aload           9
	//*  15   34:ifnonnull       115
			{
				obj = ((Object) (createDrawableBitmap(((Drawable) (obj)))));
	//   16   37:aload           8
	//   17   39:invokestatic    #109 <Method Bitmap createDrawableBitmap(Drawable)>
	//   18   42:astore          8
				if(obj != null)
	//*  19   44:aload           8
	//*  20   46:ifnull          115
				{
					view = ((View) (new Bundle()));
	//   21   49:new             #111 <Class Bundle>
	//   22   52:dup             
	//   23   53:invokespecial   #112 <Method void Bundle()>
	//   24   56:astore_1        
					((Bundle) (view)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj)));
	//   25   57:aload_1         
	//   26   58:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   27   60:aload           8
	//   28   62:invokevirtual   #116 <Method void Bundle.putParcelable(String, Parcelable)>
					((Bundle) (view)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
	//   29   65:aload_1         
	//   30   66:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   31   68:aload           7
	//   32   70:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   33   73:invokevirtual   #126 <Method String android.widget.ImageView$ScaleType.toString()>
	//   34   76:invokevirtual   #130 <Method void Bundle.putString(String, String)>
					if(imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   79:aload           7
	//*  36   81:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   84:getstatic       #134 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   87:if_acmpne       113
					{
						matrix = imageview.getImageMatrix();
	//   39   90:aload           7
	//   40   92:invokevirtual   #138 <Method Matrix ImageView.getImageMatrix()>
	//   41   95:astore_2        
						rectf = ((RectF) (new float[9]));
	//   42   96:bipush          9
	//   43   98:newarray        float[]
	//   44  100:astore_3        
						matrix.getValues(((float []) (rectf)));
	//   45  101:aload_2         
	//   46  102:aload_3         
	//   47  103:invokevirtual   #144 <Method void Matrix.getValues(float[])>
						((Bundle) (view)).putFloatArray("sharedElement:snapshot:imageMatrix", ((float []) (rectf)));
	//   48  106:aload_1         
	//   49  107:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   50  109:aload_3         
	//   51  110:invokevirtual   #148 <Method void Bundle.putFloatArray(String, float[])>
					}
					return ((Parcelable) (view));
	//   52  113:aload_1         
	//   53  114:areturn         
				}
			}
		}
		int j = Math.round(rectf.width());
	//   54  115:aload_3         
	//   55  116:invokevirtual   #154 <Method float RectF.width()>
	//   56  119:invokestatic    #158 <Method int Math.round(float)>
	//   57  122:istore          6
		int i = Math.round(rectf.height());
	//   58  124:aload_3         
	//   59  125:invokevirtual   #161 <Method float RectF.height()>
	//   60  128:invokestatic    #158 <Method int Math.round(float)>
	//   61  131:istore          5
		Object obj1 = null;
	//   62  133:aconst_null     
	//   63  134:astore          8
		Bitmap bitmap = ((Bitmap) (obj1));
	//   64  136:aload           8
	//   65  138:astore          7
		if(j > 0)
	//*  66  140:iload           6
	//*  67  142:ifle            280
		{
			bitmap = ((Bitmap) (obj1));
	//   68  145:aload           8
	//   69  147:astore          7
			if(i > 0)
	//*  70  149:iload           5
	//*  71  151:ifle            280
			{
				float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(j * i));
	//   72  154:fconst_1        
	//   73  155:getstatic       #26  <Field int MAX_IMAGE_SIZE>
	//   74  158:i2f             
	//   75  159:iload           6
	//   76  161:iload           5
	//   77  163:imul            
	//   78  164:i2f             
	//   79  165:fdiv            
	//   80  166:invokestatic    #47  <Method float Math.min(float, float)>
	//   81  169:fstore          4
				j = (int)((float)j * f);
	//   82  171:iload           6
	//   83  173:i2f             
	//   84  174:fload           4
	//   85  176:fmul            
	//   86  177:f2i             
	//   87  178:istore          6
				i = (int)((float)i * f);
	//   88  180:iload           5
	//   89  182:i2f             
	//   90  183:fload           4
	//   91  185:fmul            
	//   92  186:f2i             
	//   93  187:istore          5
				if(mTempMatrix == null)
	//*  94  189:aload_0         
	//*  95  190:getfield        #163 <Field Matrix mTempMatrix>
	//*  96  193:ifnonnull       207
					mTempMatrix = new Matrix();
	//   97  196:aload_0         
	//   98  197:new             #140 <Class Matrix>
	//   99  200:dup             
	//  100  201:invokespecial   #164 <Method void Matrix()>
	//  101  204:putfield        #163 <Field Matrix mTempMatrix>
				mTempMatrix.set(matrix);
	//  102  207:aload_0         
	//  103  208:getfield        #163 <Field Matrix mTempMatrix>
	//  104  211:aload_2         
	//  105  212:invokevirtual   #168 <Method void Matrix.set(Matrix)>
				mTempMatrix.postTranslate(-rectf.left, -rectf.top);
	//  106  215:aload_0         
	//  107  216:getfield        #163 <Field Matrix mTempMatrix>
	//  108  219:aload_3         
	//  109  220:getfield        #171 <Field float RectF.left>
	//  110  223:fneg            
	//  111  224:aload_3         
	//  112  225:getfield        #173 <Field float RectF.top>
	//  113  228:fneg            
	//  114  229:invokevirtual   #177 <Method boolean Matrix.postTranslate(float, float)>
	//  115  232:pop             
				mTempMatrix.postScale(f, f);
	//  116  233:aload_0         
	//  117  234:getfield        #163 <Field Matrix mTempMatrix>
	//  118  237:fload           4
	//  119  239:fload           4
	//  120  241:invokevirtual   #180 <Method boolean Matrix.postScale(float, float)>
	//  121  244:pop             
				bitmap = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
	//  122  245:iload           6
	//  123  247:iload           5
	//  124  249:getstatic       #59  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  125  252:invokestatic    #65  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  126  255:astore          7
				matrix = ((Matrix) (new Canvas(bitmap)));
	//  127  257:new             #67  <Class Canvas>
	//  128  260:dup             
	//  129  261:aload           7
	//  130  263:invokespecial   #70  <Method void Canvas(Bitmap)>
	//  131  266:astore_2        
				((Canvas) (matrix)).concat(mTempMatrix);
	//  132  267:aload_2         
	//  133  268:aload_0         
	//  134  269:getfield        #163 <Field Matrix mTempMatrix>
	//  135  272:invokevirtual   #183 <Method void Canvas.concat(Matrix)>
				view.draw(((Canvas) (matrix)));
	//  136  275:aload_1         
	//  137  276:aload_2         
	//  138  277:invokevirtual   #186 <Method void View.draw(Canvas)>
			}
		}
		return ((Parcelable) (bitmap));
	//  139  280:aload           7
	//  140  282:areturn         
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(!(parcelable instanceof Bundle)) goto _L2; else goto _L1
	//    2    2:aload_2         
	//    3    3:instanceof      #111 <Class Bundle>
	//    4    6:ifeq            107
_L1:
		Object obj1 = ((Object) ((Bundle)parcelable));
	//    5    9:aload_2         
	//    6   10:checkcast       #111 <Class Bundle>
	//    7   13:astore          4
		obj = ((Object) ((Bitmap)((Bundle) (obj1)).getParcelable("sharedElement:snapshot:bitmap")));
	//    8   15:aload           4
	//    9   17:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   10   19:invokevirtual   #192 <Method Parcelable Bundle.getParcelable(String)>
	//   11   22:checkcast       #61  <Class Bitmap>
	//   12   25:astore_3        
		if(obj == null)
	//*  13   26:aload_3         
	//*  14   27:ifnonnull       32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		parcelable = ((Parcelable) (new ImageView(context)));
	//   17   32:new             #100 <Class ImageView>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #195 <Method void ImageView(Context)>
	//   21   40:astore_2        
		context = ((Context) (parcelable));
	//   22   41:aload_2         
	//   23   42:astore_1        
		((ImageView) (parcelable)).setImageBitmap(((Bitmap) (obj)));
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
		((ImageView) (parcelable)).setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (obj1)).getString("sharedElement:snapshot:imageScaleType")));
	//   27   48:aload_2         
	//   28   49:aload           4
	//   29   51:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   30   53:invokevirtual   #202 <Method String Bundle.getString(String)>
	//   31   56:invokestatic    #206 <Method android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.valueOf(String)>
	//   32   59:invokevirtual   #210 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		obj = ((Object) (context));
	//   33   62:aload_1         
	//   34   63:astore_3        
		if(((ImageView) (parcelable)).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   64:aload_2         
	//*  36   65:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   68:getstatic       #134 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   71:if_acmpne       105
		{
			obj = ((Object) (((Bundle) (obj1)).getFloatArray("sharedElement:snapshot:imageMatrix")));
	//   39   74:aload           4
	//   40   76:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   41   78:invokevirtual   #214 <Method float[] Bundle.getFloatArray(String)>
	//   42   81:astore_3        
			obj1 = ((Object) (new Matrix()));
	//   43   82:new             #140 <Class Matrix>
	//   44   85:dup             
	//   45   86:invokespecial   #164 <Method void Matrix()>
	//   46   89:astore          4
			((Matrix) (obj1)).setValues(((float []) (obj)));
	//   47   91:aload           4
	//   48   93:aload_3         
	//   49   94:invokevirtual   #217 <Method void Matrix.setValues(float[])>
			((ImageView) (parcelable)).setImageMatrix(((Matrix) (obj1)));
	//   50   97:aload_2         
	//   51   98:aload           4
	//   52  100:invokevirtual   #220 <Method void ImageView.setImageMatrix(Matrix)>
			obj = ((Object) (context));
	//   53  103:aload_1         
	//   54  104:astore_3        
		}
_L4:
		return ((View) (obj));
	//   55  105:aload_3         
	//   56  106:areturn         
_L2:
		if(parcelable instanceof Bitmap)
	//*  57  107:aload_2         
	//*  58  108:instanceof      #61  <Class Bitmap>
	//*  59  111:ifeq            105
		{
			parcelable = ((Parcelable) ((Bitmap)parcelable));
	//   60  114:aload_2         
	//   61  115:checkcast       #61  <Class Bitmap>
	//   62  118:astore_2        
			obj = ((Object) (new ImageView(context)));
	//   63  119:new             #100 <Class ImageView>
	//   64  122:dup             
	//   65  123:aload_1         
	//   66  124:invokespecial   #195 <Method void ImageView(Context)>
	//   67  127:astore_3        
			((ImageView) (obj)).setImageBitmap(((Bitmap) (parcelable)));
	//   68  128:aload_3         
	//   69  129:aload_2         
	//   70  130:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
		}
		if(true) goto _L4; else goto _L3
	//   71  133:goto            105
_L3:
	}

	public void onMapSharedElements(List list, Map map)
	{
	//    0    0:return          
	}

	public void onRejectSharedElements(List list)
	{
	//    0    0:return          
	}

	public void onSharedElementEnd(List list, List list1, List list2)
	{
	//    0    0:return          
	}

	public void onSharedElementStart(List list, List list1, List list2)
	{
	//    0    0:return          
	}

	public void onSharedElementsArrived(List list, List list1, OnSharedElementsReadyListener onsharedelementsreadylistener)
	{
		onsharedelementsreadylistener.onSharedElementsReady();
	//    0    0:aload_3         
	//    1    1:invokeinterface #236 <Method void SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
	//    2    6:return          
	}

	private static final String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
	private static final String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
	private static final String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
	private static int MAX_IMAGE_SIZE = 0x100000;
	private Matrix mTempMatrix;

	static 
	{
	//    0    0:ldc1            #24  <Int 0x100000>
	//    1    2:putstatic       #26  <Field int MAX_IMAGE_SIZE>
	//*   2    5:return          
	}
}
