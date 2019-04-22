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


	private static Bitmap createDrawableBitmap(Drawable drawable)
	{
		int i = drawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int Drawable.getIntrinsicWidth()>
	//    2    4:istore_2        
		int j = drawable.getIntrinsicHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method int Drawable.getIntrinsicHeight()>
	//    5    9:istore_3        
		if(i > 0 && j > 0)
	//*   6   10:iload_2         
	//*   7   11:ifle            150
	//*   8   14:iload_3         
	//*   9   15:ifgt            21
	//*  10   18:goto            150
		{
			float f = Math.min(1.0F, 1048576F / (float)(i * j));
	//   11   21:fconst_1        
	//   12   22:ldc1            #21  <Float 1048576F>
	//   13   24:iload_2         
	//   14   25:iload_3         
	//   15   26:imul            
	//   16   27:i2f             
	//   17   28:fdiv            
	//   18   29:invokestatic    #27  <Method float Math.min(float, float)>
	//   19   32:fstore_1        
			if((drawable instanceof BitmapDrawable) && f == 1.0F)
	//*  20   33:aload_0         
	//*  21   34:instanceof      #29  <Class BitmapDrawable>
	//*  22   37:ifeq            54
	//*  23   40:fload_1         
	//*  24   41:fconst_1        
	//*  25   42:fcmpl           
	//*  26   43:ifne            54
			{
				return ((BitmapDrawable)drawable).getBitmap();
	//   27   46:aload_0         
	//   28   47:checkcast       #29  <Class BitmapDrawable>
	//   29   50:invokevirtual   #33  <Method Bitmap BitmapDrawable.getBitmap()>
	//   30   53:areturn         
			} else
			{
				i = (int)((float)i * f);
	//   31   54:iload_2         
	//   32   55:i2f             
	//   33   56:fload_1         
	//   34   57:fmul            
	//   35   58:f2i             
	//   36   59:istore_2        
				j = (int)((float)j * f);
	//   37   60:iload_3         
	//   38   61:i2f             
	//   39   62:fload_1         
	//   40   63:fmul            
	//   41   64:f2i             
	//   42   65:istore_3        
				Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   43   66:iload_2         
	//   44   67:iload_3         
	//   45   68:getstatic       #39  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   46   71:invokestatic    #45  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   47   74:astore          8
				Canvas canvas = new Canvas(bitmap);
	//   48   76:new             #47  <Class Canvas>
	//   49   79:dup             
	//   50   80:aload           8
	//   51   82:invokespecial   #51  <Method void Canvas(Bitmap)>
	//   52   85:astore          9
				Rect rect = drawable.getBounds();
	//   53   87:aload_0         
	//   54   88:invokevirtual   #55  <Method Rect Drawable.getBounds()>
	//   55   91:astore          10
				int k = rect.left;
	//   56   93:aload           10
	//   57   95:getfield        #61  <Field int Rect.left>
	//   58   98:istore          4
				int l = rect.top;
	//   59  100:aload           10
	//   60  102:getfield        #64  <Field int Rect.top>
	//   61  105:istore          5
				int i1 = rect.right;
	//   62  107:aload           10
	//   63  109:getfield        #67  <Field int Rect.right>
	//   64  112:istore          6
				int j1 = rect.bottom;
	//   65  114:aload           10
	//   66  116:getfield        #70  <Field int Rect.bottom>
	//   67  119:istore          7
				drawable.setBounds(0, 0, i, j);
	//   68  121:aload_0         
	//   69  122:iconst_0        
	//   70  123:iconst_0        
	//   71  124:iload_2         
	//   72  125:iload_3         
	//   73  126:invokevirtual   #74  <Method void Drawable.setBounds(int, int, int, int)>
				drawable.draw(canvas);
	//   74  129:aload_0         
	//   75  130:aload           9
	//   76  132:invokevirtual   #78  <Method void Drawable.draw(Canvas)>
				drawable.setBounds(k, l, i1, j1);
	//   77  135:aload_0         
	//   78  136:iload           4
	//   79  138:iload           5
	//   80  140:iload           6
	//   81  142:iload           7
	//   82  144:invokevirtual   #74  <Method void Drawable.setBounds(int, int, int, int)>
				return bitmap;
	//   83  147:aload           8
	//   84  149:areturn         
			}
		} else
		{
			return null;
	//   85  150:aconst_null     
	//   86  151:areturn         
		}
	}

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		if(view instanceof ImageView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #83  <Class ImageView>
	//*   2    4:ifeq            115
		{
			ImageView imageview = (ImageView)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #83  <Class ImageView>
	//    5   11:astore          7
			Object obj = ((Object) (imageview.getDrawable()));
	//    6   13:aload           7
	//    7   15:invokevirtual   #87  <Method Drawable ImageView.getDrawable()>
	//    8   18:astore          8
			Drawable drawable = imageview.getBackground();
	//    9   20:aload           7
	//   10   22:invokevirtual   #90  <Method Drawable ImageView.getBackground()>
	//   11   25:astore          9
			if(obj != null && drawable == null)
	//*  12   27:aload           8
	//*  13   29:ifnull          115
	//*  14   32:aload           9
	//*  15   34:ifnonnull       115
			{
				obj = ((Object) (createDrawableBitmap(((Drawable) (obj)))));
	//   16   37:aload           8
	//   17   39:invokestatic    #92  <Method Bitmap createDrawableBitmap(Drawable)>
	//   18   42:astore          8
				if(obj != null)
	//*  19   44:aload           8
	//*  20   46:ifnull          115
				{
					view = ((View) (new Bundle()));
	//   21   49:new             #94  <Class Bundle>
	//   22   52:dup             
	//   23   53:invokespecial   #97  <Method void Bundle()>
	//   24   56:astore_1        
					((Bundle) (view)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj)));
	//   25   57:aload_1         
	//   26   58:ldc1            #99  <String "sharedElement:snapshot:bitmap">
	//   27   60:aload           8
	//   28   62:invokevirtual   #103 <Method void Bundle.putParcelable(String, Parcelable)>
					((Bundle) (view)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
	//   29   65:aload_1         
	//   30   66:ldc1            #105 <String "sharedElement:snapshot:imageScaleType">
	//   31   68:aload           7
	//   32   70:invokevirtual   #109 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   33   73:invokevirtual   #115 <Method String android.widget.ImageView$ScaleType.toString()>
	//   34   76:invokevirtual   #119 <Method void Bundle.putString(String, String)>
					if(imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   79:aload           7
	//*  36   81:invokevirtual   #109 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   84:getstatic       #123 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   87:if_acmpne       113
					{
						matrix = imageview.getImageMatrix();
	//   39   90:aload           7
	//   40   92:invokevirtual   #127 <Method Matrix ImageView.getImageMatrix()>
	//   41   95:astore_2        
						rectf = ((RectF) (new float[9]));
	//   42   96:bipush          9
	//   43   98:newarray        float[]
	//   44  100:astore_3        
						matrix.getValues(((float []) (rectf)));
	//   45  101:aload_2         
	//   46  102:aload_3         
	//   47  103:invokevirtual   #133 <Method void Matrix.getValues(float[])>
						((Bundle) (view)).putFloatArray("sharedElement:snapshot:imageMatrix", ((float []) (rectf)));
	//   48  106:aload_1         
	//   49  107:ldc1            #135 <String "sharedElement:snapshot:imageMatrix">
	//   50  109:aload_3         
	//   51  110:invokevirtual   #139 <Method void Bundle.putFloatArray(String, float[])>
					}
					return ((Parcelable) (view));
	//   52  113:aload_1         
	//   53  114:areturn         
				}
			}
		}
		int j = Math.round(rectf.width());
	//   54  115:aload_3         
	//   55  116:invokevirtual   #145 <Method float RectF.width()>
	//   56  119:invokestatic    #149 <Method int Math.round(float)>
	//   57  122:istore          6
		int i = Math.round(rectf.height());
	//   58  124:aload_3         
	//   59  125:invokevirtual   #152 <Method float RectF.height()>
	//   60  128:invokestatic    #149 <Method int Math.round(float)>
	//   61  131:istore          5
		Object obj1 = null;
	//   62  133:aconst_null     
	//   63  134:astore          8
		Bitmap bitmap = ((Bitmap) (obj1));
	//   64  136:aload           8
	//   65  138:astore          7
		if(j > 0)
	//*  66  140:iload           6
	//*  67  142:ifle            278
		{
			bitmap = ((Bitmap) (obj1));
	//   68  145:aload           8
	//   69  147:astore          7
			if(i > 0)
	//*  70  149:iload           5
	//*  71  151:ifle            278
			{
				float f = Math.min(1.0F, 1048576F / (float)(j * i));
	//   72  154:fconst_1        
	//   73  155:ldc1            #21  <Float 1048576F>
	//   74  157:iload           6
	//   75  159:iload           5
	//   76  161:imul            
	//   77  162:i2f             
	//   78  163:fdiv            
	//   79  164:invokestatic    #27  <Method float Math.min(float, float)>
	//   80  167:fstore          4
				j = (int)((float)j * f);
	//   81  169:iload           6
	//   82  171:i2f             
	//   83  172:fload           4
	//   84  174:fmul            
	//   85  175:f2i             
	//   86  176:istore          6
				i = (int)((float)i * f);
	//   87  178:iload           5
	//   88  180:i2f             
	//   89  181:fload           4
	//   90  183:fmul            
	//   91  184:f2i             
	//   92  185:istore          5
				if(mTempMatrix == null)
	//*  93  187:aload_0         
	//*  94  188:getfield        #154 <Field Matrix mTempMatrix>
	//*  95  191:ifnonnull       205
					mTempMatrix = new Matrix();
	//   96  194:aload_0         
	//   97  195:new             #129 <Class Matrix>
	//   98  198:dup             
	//   99  199:invokespecial   #155 <Method void Matrix()>
	//  100  202:putfield        #154 <Field Matrix mTempMatrix>
				mTempMatrix.set(matrix);
	//  101  205:aload_0         
	//  102  206:getfield        #154 <Field Matrix mTempMatrix>
	//  103  209:aload_2         
	//  104  210:invokevirtual   #159 <Method void Matrix.set(Matrix)>
				mTempMatrix.postTranslate(-rectf.left, -rectf.top);
	//  105  213:aload_0         
	//  106  214:getfield        #154 <Field Matrix mTempMatrix>
	//  107  217:aload_3         
	//  108  218:getfield        #162 <Field float RectF.left>
	//  109  221:fneg            
	//  110  222:aload_3         
	//  111  223:getfield        #164 <Field float RectF.top>
	//  112  226:fneg            
	//  113  227:invokevirtual   #168 <Method boolean Matrix.postTranslate(float, float)>
	//  114  230:pop             
				mTempMatrix.postScale(f, f);
	//  115  231:aload_0         
	//  116  232:getfield        #154 <Field Matrix mTempMatrix>
	//  117  235:fload           4
	//  118  237:fload           4
	//  119  239:invokevirtual   #171 <Method boolean Matrix.postScale(float, float)>
	//  120  242:pop             
				bitmap = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
	//  121  243:iload           6
	//  122  245:iload           5
	//  123  247:getstatic       #39  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  124  250:invokestatic    #45  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  125  253:astore          7
				matrix = ((Matrix) (new Canvas(bitmap)));
	//  126  255:new             #47  <Class Canvas>
	//  127  258:dup             
	//  128  259:aload           7
	//  129  261:invokespecial   #51  <Method void Canvas(Bitmap)>
	//  130  264:astore_2        
				((Canvas) (matrix)).concat(mTempMatrix);
	//  131  265:aload_2         
	//  132  266:aload_0         
	//  133  267:getfield        #154 <Field Matrix mTempMatrix>
	//  134  270:invokevirtual   #174 <Method void Canvas.concat(Matrix)>
				view.draw(((Canvas) (matrix)));
	//  135  273:aload_1         
	//  136  274:aload_2         
	//  137  275:invokevirtual   #177 <Method void View.draw(Canvas)>
			}
		}
		return ((Parcelable) (bitmap));
	//  138  278:aload           7
	//  139  280:areturn         
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		boolean flag = parcelable instanceof Bundle;
	//    0    0:aload_2         
	//    1    1:instanceof      #94  <Class Bundle>
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
	//    8   13:checkcast       #94  <Class Bundle>
	//    9   16:astore_2        
			obj = ((Object) ((Bitmap)((Bundle) (parcelable)).getParcelable("sharedElement:snapshot:bitmap")));
	//   10   17:aload_2         
	//   11   18:ldc1            #99  <String "sharedElement:snapshot:bitmap">
	//   12   20:invokevirtual   #183 <Method Parcelable Bundle.getParcelable(String)>
	//   13   23:checkcast       #41  <Class Bitmap>
	//   14   26:astore          4
			if(obj == null)
	//*  15   28:aload           4
	//*  16   30:ifnonnull       35
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
			context = ((Context) (new ImageView(context)));
	//   19   35:new             #83  <Class ImageView>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #186 <Method void ImageView(Context)>
	//   23   43:astore_1        
			((ImageView) (context)).setImageBitmap(((Bitmap) (obj)));
	//   24   44:aload_1         
	//   25   45:aload           4
	//   26   47:invokevirtual   #189 <Method void ImageView.setImageBitmap(Bitmap)>
			((ImageView) (context)).setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (parcelable)).getString("sharedElement:snapshot:imageScaleType")));
	//   27   50:aload_1         
	//   28   51:aload_2         
	//   29   52:ldc1            #105 <String "sharedElement:snapshot:imageScaleType">
	//   30   54:invokevirtual   #193 <Method String Bundle.getString(String)>
	//   31   57:invokestatic    #197 <Method android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.valueOf(String)>
	//   32   60:invokevirtual   #201 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			obj = ((Object) (context));
	//   33   63:aload_1         
	//   34   64:astore          4
			if(((ImageView) (context)).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   66:aload_1         
	//*  36   67:invokevirtual   #109 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   70:getstatic       #123 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   73:if_acmpne       134
			{
				parcelable = ((Parcelable) (((Bundle) (parcelable)).getFloatArray("sharedElement:snapshot:imageMatrix")));
	//   39   76:aload_2         
	//   40   77:ldc1            #135 <String "sharedElement:snapshot:imageMatrix">
	//   41   79:invokevirtual   #205 <Method float[] Bundle.getFloatArray(String)>
	//   42   82:astore_2        
				obj = ((Object) (new Matrix()));
	//   43   83:new             #129 <Class Matrix>
	//   44   86:dup             
	//   45   87:invokespecial   #155 <Method void Matrix()>
	//   46   90:astore          4
				((Matrix) (obj)).setValues(((float []) (parcelable)));
	//   47   92:aload           4
	//   48   94:aload_2         
	//   49   95:invokevirtual   #208 <Method void Matrix.setValues(float[])>
				((ImageView) (context)).setImageMatrix(((Matrix) (obj)));
	//   50   98:aload_1         
	//   51   99:aload           4
	//   52  101:invokevirtual   #211 <Method void ImageView.setImageMatrix(Matrix)>
				return ((View) (context));
	//   53  104:aload_1         
	//   54  105:areturn         
			}
		} else
		if(parcelable instanceof Bitmap)
	//*  55  106:aload_2         
	//*  56  107:instanceof      #41  <Class Bitmap>
	//*  57  110:ifeq            134
		{
			parcelable = ((Parcelable) ((Bitmap)parcelable));
	//   58  113:aload_2         
	//   59  114:checkcast       #41  <Class Bitmap>
	//   60  117:astore_2        
			obj = ((Object) (new ImageView(context)));
	//   61  118:new             #83  <Class ImageView>
	//   62  121:dup             
	//   63  122:aload_1         
	//   64  123:invokespecial   #186 <Method void ImageView(Context)>
	//   65  126:astore          4
			((ImageView) (obj)).setImageBitmap(((Bitmap) (parcelable)));
	//   66  128:aload           4
	//   67  130:aload_2         
	//   68  131:invokevirtual   #189 <Method void ImageView.setImageBitmap(Bitmap)>
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
	//    1    1:invokeinterface #227 <Method void SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
	//    2    6:return          
	}

	private Matrix mTempMatrix;
}
