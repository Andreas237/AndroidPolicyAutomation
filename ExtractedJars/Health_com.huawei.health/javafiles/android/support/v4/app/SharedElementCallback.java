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
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	private static Bitmap createDrawableBitmap(Drawable drawable)
	{
		int i = drawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method int Drawable.getIntrinsicWidth()>
	//    2    4:istore_2        
		int j = drawable.getIntrinsicHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #42  <Method int Drawable.getIntrinsicHeight()>
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
	//   13   21:getstatic       #27  <Field int MAX_IMAGE_SIZE>
	//   14   24:i2f             
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:imul            
	//   18   28:i2f             
	//   19   29:fdiv            
	//   20   30:invokestatic    #48  <Method float Math.min(float, float)>
	//   21   33:fstore_1        
		if((drawable instanceof BitmapDrawable) && f == 1.0F)
	//*  22   34:aload_0         
	//*  23   35:instanceof      #50  <Class BitmapDrawable>
	//*  24   38:ifeq            55
	//*  25   41:fload_1         
	//*  26   42:fconst_1        
	//*  27   43:fcmpl           
	//*  28   44:ifne            55
		{
			return ((BitmapDrawable)drawable).getBitmap();
	//   29   47:aload_0         
	//   30   48:checkcast       #50  <Class BitmapDrawable>
	//   31   51:invokevirtual   #54  <Method Bitmap BitmapDrawable.getBitmap()>
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
	//   47   69:getstatic       #60  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   48   72:invokestatic    #66  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   49   75:astore          8
			Canvas canvas = new Canvas(bitmap);
	//   50   77:new             #68  <Class Canvas>
	//   51   80:dup             
	//   52   81:aload           8
	//   53   83:invokespecial   #71  <Method void Canvas(Bitmap)>
	//   54   86:astore          9
			Rect rect = drawable.getBounds();
	//   55   88:aload_0         
	//   56   89:invokevirtual   #75  <Method Rect Drawable.getBounds()>
	//   57   92:astore          10
			int k = rect.left;
	//   58   94:aload           10
	//   59   96:getfield        #80  <Field int Rect.left>
	//   60   99:istore          4
			int l = rect.top;
	//   61  101:aload           10
	//   62  103:getfield        #83  <Field int Rect.top>
	//   63  106:istore          5
			int i1 = rect.right;
	//   64  108:aload           10
	//   65  110:getfield        #86  <Field int Rect.right>
	//   66  113:istore          6
			int j1 = rect.bottom;
	//   67  115:aload           10
	//   68  117:getfield        #89  <Field int Rect.bottom>
	//   69  120:istore          7
			drawable.setBounds(0, 0, i, j);
	//   70  122:aload_0         
	//   71  123:iconst_0        
	//   72  124:iconst_0        
	//   73  125:iload_2         
	//   74  126:iload_3         
	//   75  127:invokevirtual   #93  <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   76  130:aload_0         
	//   77  131:aload           9
	//   78  133:invokevirtual   #97  <Method void Drawable.draw(Canvas)>
			drawable.setBounds(k, l, i1, j1);
	//   79  136:aload_0         
	//   80  137:iload           4
	//   81  139:iload           5
	//   82  141:iload           6
	//   83  143:iload           7
	//   84  145:invokevirtual   #93  <Method void Drawable.setBounds(int, int, int, int)>
			return bitmap;
	//   85  148:aload           8
	//   86  150:areturn         
		}
	}

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		if(view instanceof ImageView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #101 <Class ImageView>
	//*   2    4:ifeq            115
		{
			ImageView imageview = (ImageView)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #101 <Class ImageView>
	//    5   11:astore          7
			Object obj = ((Object) (imageview.getDrawable()));
	//    6   13:aload           7
	//    7   15:invokevirtual   #105 <Method Drawable ImageView.getDrawable()>
	//    8   18:astore          8
			Drawable drawable = imageview.getBackground();
	//    9   20:aload           7
	//   10   22:invokevirtual   #108 <Method Drawable ImageView.getBackground()>
	//   11   25:astore          9
			if(obj != null && drawable == null)
	//*  12   27:aload           8
	//*  13   29:ifnull          115
	//*  14   32:aload           9
	//*  15   34:ifnonnull       115
			{
				obj = ((Object) (createDrawableBitmap(((Drawable) (obj)))));
	//   16   37:aload           8
	//   17   39:invokestatic    #110 <Method Bitmap createDrawableBitmap(Drawable)>
	//   18   42:astore          8
				if(obj != null)
	//*  19   44:aload           8
	//*  20   46:ifnull          115
				{
					view = ((View) (new Bundle()));
	//   21   49:new             #112 <Class Bundle>
	//   22   52:dup             
	//   23   53:invokespecial   #113 <Method void Bundle()>
	//   24   56:astore_1        
					((Bundle) (view)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj)));
	//   25   57:aload_1         
	//   26   58:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   27   60:aload           8
	//   28   62:invokevirtual   #117 <Method void Bundle.putParcelable(String, Parcelable)>
					((Bundle) (view)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
	//   29   65:aload_1         
	//   30   66:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   31   68:aload           7
	//   32   70:invokevirtual   #121 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   33   73:invokevirtual   #127 <Method String android.widget.ImageView$ScaleType.toString()>
	//   34   76:invokevirtual   #131 <Method void Bundle.putString(String, String)>
					if(imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   79:aload           7
	//*  36   81:invokevirtual   #121 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   84:getstatic       #135 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   87:if_acmpne       113
					{
						matrix = imageview.getImageMatrix();
	//   39   90:aload           7
	//   40   92:invokevirtual   #139 <Method Matrix ImageView.getImageMatrix()>
	//   41   95:astore_2        
						rectf = ((RectF) (new float[9]));
	//   42   96:bipush          9
	//   43   98:newarray        float[]
	//   44  100:astore_3        
						matrix.getValues(((float []) (rectf)));
	//   45  101:aload_2         
	//   46  102:aload_3         
	//   47  103:invokevirtual   #145 <Method void Matrix.getValues(float[])>
						((Bundle) (view)).putFloatArray("sharedElement:snapshot:imageMatrix", ((float []) (rectf)));
	//   48  106:aload_1         
	//   49  107:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   50  109:aload_3         
	//   51  110:invokevirtual   #149 <Method void Bundle.putFloatArray(String, float[])>
					}
					return ((Parcelable) (view));
	//   52  113:aload_1         
	//   53  114:areturn         
				}
			}
		}
		int j = Math.round(rectf.width());
	//   54  115:aload_3         
	//   55  116:invokevirtual   #155 <Method float RectF.width()>
	//   56  119:invokestatic    #159 <Method int Math.round(float)>
	//   57  122:istore          6
		int i = Math.round(rectf.height());
	//   58  124:aload_3         
	//   59  125:invokevirtual   #162 <Method float RectF.height()>
	//   60  128:invokestatic    #159 <Method int Math.round(float)>
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
	//   73  155:getstatic       #27  <Field int MAX_IMAGE_SIZE>
	//   74  158:i2f             
	//   75  159:iload           6
	//   76  161:iload           5
	//   77  163:imul            
	//   78  164:i2f             
	//   79  165:fdiv            
	//   80  166:invokestatic    #48  <Method float Math.min(float, float)>
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
	//*  95  190:getfield        #164 <Field Matrix mTempMatrix>
	//*  96  193:ifnonnull       207
					mTempMatrix = new Matrix();
	//   97  196:aload_0         
	//   98  197:new             #141 <Class Matrix>
	//   99  200:dup             
	//  100  201:invokespecial   #165 <Method void Matrix()>
	//  101  204:putfield        #164 <Field Matrix mTempMatrix>
				mTempMatrix.set(matrix);
	//  102  207:aload_0         
	//  103  208:getfield        #164 <Field Matrix mTempMatrix>
	//  104  211:aload_2         
	//  105  212:invokevirtual   #169 <Method void Matrix.set(Matrix)>
				mTempMatrix.postTranslate(-rectf.left, -rectf.top);
	//  106  215:aload_0         
	//  107  216:getfield        #164 <Field Matrix mTempMatrix>
	//  108  219:aload_3         
	//  109  220:getfield        #172 <Field float RectF.left>
	//  110  223:fneg            
	//  111  224:aload_3         
	//  112  225:getfield        #174 <Field float RectF.top>
	//  113  228:fneg            
	//  114  229:invokevirtual   #178 <Method boolean Matrix.postTranslate(float, float)>
	//  115  232:pop             
				mTempMatrix.postScale(f, f);
	//  116  233:aload_0         
	//  117  234:getfield        #164 <Field Matrix mTempMatrix>
	//  118  237:fload           4
	//  119  239:fload           4
	//  120  241:invokevirtual   #181 <Method boolean Matrix.postScale(float, float)>
	//  121  244:pop             
				bitmap = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
	//  122  245:iload           6
	//  123  247:iload           5
	//  124  249:getstatic       #60  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  125  252:invokestatic    #66  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  126  255:astore          7
				matrix = ((Matrix) (new Canvas(bitmap)));
	//  127  257:new             #68  <Class Canvas>
	//  128  260:dup             
	//  129  261:aload           7
	//  130  263:invokespecial   #71  <Method void Canvas(Bitmap)>
	//  131  266:astore_2        
				((Canvas) (matrix)).concat(mTempMatrix);
	//  132  267:aload_2         
	//  133  268:aload_0         
	//  134  269:getfield        #164 <Field Matrix mTempMatrix>
	//  135  272:invokevirtual   #184 <Method void Canvas.concat(Matrix)>
				view.draw(((Canvas) (matrix)));
	//  136  275:aload_1         
	//  137  276:aload_2         
	//  138  277:invokevirtual   #187 <Method void View.draw(Canvas)>
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
		if(parcelable instanceof Bundle)
	//*   2    2:aload_2         
	//*   3    3:instanceof      #112 <Class Bundle>
	//*   4    6:ifeq            94
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    5    9:aload_2         
	//    6   10:checkcast       #112 <Class Bundle>
	//    7   13:astore_2        
			obj = ((Object) ((Bitmap)((Bundle) (parcelable)).getParcelable("sharedElement:snapshot:bitmap")));
	//    8   14:aload_2         
	//    9   15:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   10   17:invokevirtual   #193 <Method Parcelable Bundle.getParcelable(String)>
	//   11   20:checkcast       #62  <Class Bitmap>
	//   12   23:astore_3        
			if(obj == null)
	//*  13   24:aload_3         
	//*  14   25:ifnonnull       30
				return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
			context = ((Context) (new ImageView(context)));
	//   17   30:new             #101 <Class ImageView>
	//   18   33:dup             
	//   19   34:aload_1         
	//   20   35:invokespecial   #196 <Method void ImageView(Context)>
	//   21   38:astore_1        
			((ImageView) (context)).setImageBitmap(((Bitmap) (obj)));
	//   22   39:aload_1         
	//   23   40:aload_3         
	//   24   41:invokevirtual   #199 <Method void ImageView.setImageBitmap(Bitmap)>
			((ImageView) (context)).setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (parcelable)).getString("sharedElement:snapshot:imageScaleType")));
	//   25   44:aload_1         
	//   26   45:aload_2         
	//   27   46:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   28   48:invokevirtual   #203 <Method String Bundle.getString(String)>
	//   29   51:invokestatic    #207 <Method android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.valueOf(String)>
	//   30   54:invokevirtual   #211 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			if(((ImageView) (context)).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  31   57:aload_1         
	//*  32   58:invokevirtual   #121 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  33   61:getstatic       #135 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  34   64:if_acmpne       92
			{
				parcelable = ((Parcelable) (((Bundle) (parcelable)).getFloatArray("sharedElement:snapshot:imageMatrix")));
	//   35   67:aload_2         
	//   36   68:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   37   70:invokevirtual   #215 <Method float[] Bundle.getFloatArray(String)>
	//   38   73:astore_2        
				obj = ((Object) (new Matrix()));
	//   39   74:new             #141 <Class Matrix>
	//   40   77:dup             
	//   41   78:invokespecial   #165 <Method void Matrix()>
	//   42   81:astore_3        
				((Matrix) (obj)).setValues(((float []) (parcelable)));
	//   43   82:aload_3         
	//   44   83:aload_2         
	//   45   84:invokevirtual   #218 <Method void Matrix.setValues(float[])>
				((ImageView) (context)).setImageMatrix(((Matrix) (obj)));
	//   46   87:aload_1         
	//   47   88:aload_3         
	//   48   89:invokevirtual   #221 <Method void ImageView.setImageMatrix(Matrix)>
			}
			return ((View) (context));
	//   49   92:aload_1         
	//   50   93:areturn         
		}
		if(parcelable instanceof Bitmap)
	//*  51   94:aload_2         
	//*  52   95:instanceof      #62  <Class Bitmap>
	//*  53   98:ifeq            120
		{
			parcelable = ((Parcelable) ((Bitmap)parcelable));
	//   54  101:aload_2         
	//   55  102:checkcast       #62  <Class Bitmap>
	//   56  105:astore_2        
			obj = ((Object) (new ImageView(context)));
	//   57  106:new             #101 <Class ImageView>
	//   58  109:dup             
	//   59  110:aload_1         
	//   60  111:invokespecial   #196 <Method void ImageView(Context)>
	//   61  114:astore_3        
			((ImageView) (obj)).setImageBitmap(((Bitmap) (parcelable)));
	//   62  115:aload_3         
	//   63  116:aload_2         
	//   64  117:invokevirtual   #199 <Method void ImageView.setImageBitmap(Bitmap)>
		}
		return ((View) (obj));
	//   65  120:aload_3         
	//   66  121:areturn         
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
	//    1    1:invokeinterface #237 <Method void SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
	//    2    6:return          
	}

	private static final String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
	private static final String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
	private static final String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
	private static int MAX_IMAGE_SIZE = 0;
	private Matrix mTempMatrix;

	static 
	{
		MAX_IMAGE_SIZE = 0x100000;
	//    0    0:ldc1            #25  <Int 0x100000>
	//    1    2:putstatic       #27  <Field int MAX_IMAGE_SIZE>
	//*   2    5:return          
	}
}
