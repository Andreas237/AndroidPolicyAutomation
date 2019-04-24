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
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	private static Bitmap createDrawableBitmap(Drawable drawable)
	{
		int i = drawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method int Drawable.getIntrinsicWidth()>
	//    2    4:istore_2        
		int j = drawable.getIntrinsicHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #39  <Method int Drawable.getIntrinsicHeight()>
	//    5    9:istore_3        
		if(i > 0 && j > 0)
	//*   6   10:iload_2         
	//*   7   11:ifle            152
	//*   8   14:iload_3         
	//*   9   15:ifgt            21
	//*  10   18:goto            152
		{
			float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(i * j));
	//   11   21:fconst_1        
	//   12   22:getstatic       #41  <Field int MAX_IMAGE_SIZE>
	//   13   25:i2f             
	//   14   26:iload_2         
	//   15   27:iload_3         
	//   16   28:imul            
	//   17   29:i2f             
	//   18   30:fdiv            
	//   19   31:invokestatic    #47  <Method float Math.min(float, float)>
	//   20   34:fstore_1        
			if((drawable instanceof BitmapDrawable) && f == 1.0F)
	//*  21   35:aload_0         
	//*  22   36:instanceof      #49  <Class BitmapDrawable>
	//*  23   39:ifeq            56
	//*  24   42:fload_1         
	//*  25   43:fconst_1        
	//*  26   44:fcmpl           
	//*  27   45:ifne            56
			{
				return ((BitmapDrawable)drawable).getBitmap();
	//   28   48:aload_0         
	//   29   49:checkcast       #49  <Class BitmapDrawable>
	//   30   52:invokevirtual   #53  <Method Bitmap BitmapDrawable.getBitmap()>
	//   31   55:areturn         
			} else
			{
				i = (int)((float)i * f);
	//   32   56:iload_2         
	//   33   57:i2f             
	//   34   58:fload_1         
	//   35   59:fmul            
	//   36   60:f2i             
	//   37   61:istore_2        
				j = (int)((float)j * f);
	//   38   62:iload_3         
	//   39   63:i2f             
	//   40   64:fload_1         
	//   41   65:fmul            
	//   42   66:f2i             
	//   43   67:istore_3        
				Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   44   68:iload_2         
	//   45   69:iload_3         
	//   46   70:getstatic       #59  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   47   73:invokestatic    #65  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   48   76:astore          8
				Canvas canvas = new Canvas(bitmap);
	//   49   78:new             #67  <Class Canvas>
	//   50   81:dup             
	//   51   82:aload           8
	//   52   84:invokespecial   #70  <Method void Canvas(Bitmap)>
	//   53   87:astore          9
				Rect rect = drawable.getBounds();
	//   54   89:aload_0         
	//   55   90:invokevirtual   #74  <Method Rect Drawable.getBounds()>
	//   56   93:astore          10
				int k = rect.left;
	//   57   95:aload           10
	//   58   97:getfield        #79  <Field int Rect.left>
	//   59  100:istore          4
				int l = rect.top;
	//   60  102:aload           10
	//   61  104:getfield        #82  <Field int Rect.top>
	//   62  107:istore          5
				int i1 = rect.right;
	//   63  109:aload           10
	//   64  111:getfield        #85  <Field int Rect.right>
	//   65  114:istore          6
				int j1 = rect.bottom;
	//   66  116:aload           10
	//   67  118:getfield        #88  <Field int Rect.bottom>
	//   68  121:istore          7
				drawable.setBounds(0, 0, i, j);
	//   69  123:aload_0         
	//   70  124:iconst_0        
	//   71  125:iconst_0        
	//   72  126:iload_2         
	//   73  127:iload_3         
	//   74  128:invokevirtual   #92  <Method void Drawable.setBounds(int, int, int, int)>
				drawable.draw(canvas);
	//   75  131:aload_0         
	//   76  132:aload           9
	//   77  134:invokevirtual   #96  <Method void Drawable.draw(Canvas)>
				drawable.setBounds(k, l, i1, j1);
	//   78  137:aload_0         
	//   79  138:iload           4
	//   80  140:iload           5
	//   81  142:iload           6
	//   82  144:iload           7
	//   83  146:invokevirtual   #92  <Method void Drawable.setBounds(int, int, int, int)>
				return bitmap;
	//   84  149:aload           8
	//   85  151:areturn         
			}
		} else
		{
			return null;
	//   86  152:aconst_null     
	//   87  153:areturn         
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
	//   73  155:getstatic       #41  <Field int MAX_IMAGE_SIZE>
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
		boolean flag = parcelable instanceof Bundle;
	//    0    0:aload_2         
	//    1    1:instanceof      #111 <Class Bundle>
	//    2    4:istore_3        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		if(flag)
	//*   5    8:iload_3         
	//*   6    9:ifeq            106
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    7   12:aload_2         
	//    8   13:checkcast       #111 <Class Bundle>
	//    9   16:astore_2        
			obj = ((Object) ((Bitmap)((Bundle) (parcelable)).getParcelable("sharedElement:snapshot:bitmap")));
	//   10   17:aload_2         
	//   11   18:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   12   20:invokevirtual   #192 <Method Parcelable Bundle.getParcelable(String)>
	//   13   23:checkcast       #61  <Class Bitmap>
	//   14   26:astore          4
			if(obj == null)
	//*  15   28:aload           4
	//*  16   30:ifnonnull       35
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
			context = ((Context) (new ImageView(context)));
	//   19   35:new             #100 <Class ImageView>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #195 <Method void ImageView(Context)>
	//   23   43:astore_1        
			((ImageView) (context)).setImageBitmap(((Bitmap) (obj)));
	//   24   44:aload_1         
	//   25   45:aload           4
	//   26   47:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
			((ImageView) (context)).setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (parcelable)).getString("sharedElement:snapshot:imageScaleType")));
	//   27   50:aload_1         
	//   28   51:aload_2         
	//   29   52:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   30   54:invokevirtual   #202 <Method String Bundle.getString(String)>
	//   31   57:invokestatic    #206 <Method android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.valueOf(String)>
	//   32   60:invokevirtual   #210 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			obj = ((Object) (context));
	//   33   63:aload_1         
	//   34   64:astore          4
			if(((ImageView) (context)).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   66:aload_1         
	//*  36   67:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   70:getstatic       #134 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   73:if_acmpne       134
			{
				parcelable = ((Parcelable) (((Bundle) (parcelable)).getFloatArray("sharedElement:snapshot:imageMatrix")));
	//   39   76:aload_2         
	//   40   77:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   41   79:invokevirtual   #214 <Method float[] Bundle.getFloatArray(String)>
	//   42   82:astore_2        
				obj = ((Object) (new Matrix()));
	//   43   83:new             #140 <Class Matrix>
	//   44   86:dup             
	//   45   87:invokespecial   #164 <Method void Matrix()>
	//   46   90:astore          4
				((Matrix) (obj)).setValues(((float []) (parcelable)));
	//   47   92:aload           4
	//   48   94:aload_2         
	//   49   95:invokevirtual   #217 <Method void Matrix.setValues(float[])>
				((ImageView) (context)).setImageMatrix(((Matrix) (obj)));
	//   50   98:aload_1         
	//   51   99:aload           4
	//   52  101:invokevirtual   #220 <Method void ImageView.setImageMatrix(Matrix)>
				return ((View) (context));
	//   53  104:aload_1         
	//   54  105:areturn         
			}
		} else
		if(parcelable instanceof Bitmap)
	//*  55  106:aload_2         
	//*  56  107:instanceof      #61  <Class Bitmap>
	//*  57  110:ifeq            134
		{
			parcelable = ((Parcelable) ((Bitmap)parcelable));
	//   58  113:aload_2         
	//   59  114:checkcast       #61  <Class Bitmap>
	//   60  117:astore_2        
			obj = ((Object) (new ImageView(context)));
	//   61  118:new             #100 <Class ImageView>
	//   62  121:dup             
	//   63  122:aload_1         
	//   64  123:invokespecial   #195 <Method void ImageView(Context)>
	//   65  126:astore          4
			((ImageView) (obj)).setImageBitmap(((Bitmap) (parcelable)));
	//   66  128:aload           4
	//   67  130:aload_2         
	//   68  131:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
		}
		return ((View) (obj));
	//   69  134:aload           4
	//   70  136:areturn         
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
	//    0    0:return          
	}
}
