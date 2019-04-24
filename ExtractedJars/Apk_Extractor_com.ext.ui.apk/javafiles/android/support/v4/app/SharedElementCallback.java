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
		if(!(view instanceof ImageView)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #100 <Class ImageView>
	//    2    4:ifeq            120
_L1:
		Object obj;
		ImageView imageview;
		Object obj2;
		imageview = (ImageView)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #100 <Class ImageView>
	//    5   11:astore          8
		obj = ((Object) (imageview.getDrawable()));
	//    6   13:aload           8
	//    7   15:invokevirtual   #104 <Method Drawable ImageView.getDrawable()>
	//    8   18:astore          7
		obj2 = ((Object) (imageview.getBackground()));
	//    9   20:aload           8
	//   10   22:invokevirtual   #107 <Method Drawable ImageView.getBackground()>
	//   11   25:astore          9
		if(obj == null || obj2 != null) goto _L2; else goto _L3
	//   12   27:aload           7
	//   13   29:ifnull          120
	//   14   32:aload           9
	//   15   34:ifnonnull       120
_L3:
		obj2 = ((Object) (createDrawableBitmap(((Drawable) (obj)))));
	//   16   37:aload           7
	//   17   39:invokestatic    #109 <Method Bitmap createDrawableBitmap(Drawable)>
	//   18   42:astore          9
		if(obj2 == null) goto _L2; else goto _L4
	//   19   44:aload           9
	//   20   46:ifnull          120
_L4:
		obj = ((Object) (new Bundle()));
	//   21   49:new             #111 <Class Bundle>
	//   22   52:dup             
	//   23   53:invokespecial   #112 <Method void Bundle()>
	//   24   56:astore          7
		((Bundle) (obj)).putParcelable("sharedElement:snapshot:bitmap", ((Parcelable) (obj2)));
	//   25   58:aload           7
	//   26   60:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//   27   62:aload           9
	//   28   64:invokevirtual   #116 <Method void Bundle.putParcelable(String, Parcelable)>
		((Bundle) (obj)).putString("sharedElement:snapshot:imageScaleType", imageview.getScaleType().toString());
	//   29   67:aload           7
	//   30   69:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   31   71:aload           8
	//   32   73:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   33   76:invokevirtual   #126 <Method String android.widget.ImageView$ScaleType.toString()>
	//   34   79:invokevirtual   #130 <Method void Bundle.putString(String, String)>
		if(imageview.getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  35   82:aload           8
	//*  36   84:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  37   87:getstatic       #134 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  38   90:if_acmpne       117
		{
			view = ((View) (imageview.getImageMatrix()));
	//   39   93:aload           8
	//   40   95:invokevirtual   #138 <Method Matrix ImageView.getImageMatrix()>
	//   41   98:astore_1        
			matrix = ((Matrix) (new float[9]));
	//   42   99:bipush          9
	//   43  101:newarray        float[]
	//   44  103:astore_2        
			((Matrix) (view)).getValues(((float []) (matrix)));
	//   45  104:aload_1         
	//   46  105:aload_2         
	//   47  106:invokevirtual   #144 <Method void Matrix.getValues(float[])>
			((Bundle) (obj)).putFloatArray("sharedElement:snapshot:imageMatrix", ((float []) (matrix)));
	//   48  109:aload           7
	//   49  111:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   50  113:aload_2         
	//   51  114:invokevirtual   #148 <Method void Bundle.putFloatArray(String, float[])>
		}
_L6:
		return ((Parcelable) (obj));
	//   52  117:aload           7
	//   53  119:areturn         
_L2:
		int j = Math.round(rectf.width());
	//   54  120:aload_3         
	//   55  121:invokevirtual   #154 <Method float RectF.width()>
	//   56  124:invokestatic    #158 <Method int Math.round(float)>
	//   57  127:istore          6
		int i = Math.round(rectf.height());
	//   58  129:aload_3         
	//   59  130:invokevirtual   #161 <Method float RectF.height()>
	//   60  133:invokestatic    #158 <Method int Math.round(float)>
	//   61  136:istore          5
		Object obj1 = null;
	//   62  138:aconst_null     
	//   63  139:astore          8
		obj = ((Object) (obj1));
	//   64  141:aload           8
	//   65  143:astore          7
		if(j > 0)
	//*  66  145:iload           6
	//*  67  147:ifle            117
		{
			obj = ((Object) (obj1));
	//   68  150:aload           8
	//   69  152:astore          7
			if(i > 0)
	//*  70  154:iload           5
	//*  71  156:ifle            117
			{
				float f = Math.min(1.0F, (float)MAX_IMAGE_SIZE / (float)(j * i));
	//   72  159:fconst_1        
	//   73  160:getstatic       #26  <Field int MAX_IMAGE_SIZE>
	//   74  163:i2f             
	//   75  164:iload           6
	//   76  166:iload           5
	//   77  168:imul            
	//   78  169:i2f             
	//   79  170:fdiv            
	//   80  171:invokestatic    #47  <Method float Math.min(float, float)>
	//   81  174:fstore          4
				j = (int)((float)j * f);
	//   82  176:iload           6
	//   83  178:i2f             
	//   84  179:fload           4
	//   85  181:fmul            
	//   86  182:f2i             
	//   87  183:istore          6
				i = (int)((float)i * f);
	//   88  185:iload           5
	//   89  187:i2f             
	//   90  188:fload           4
	//   91  190:fmul            
	//   92  191:f2i             
	//   93  192:istore          5
				if(mTempMatrix == null)
	//*  94  194:aload_0         
	//*  95  195:getfield        #163 <Field Matrix mTempMatrix>
	//*  96  198:ifnonnull       212
					mTempMatrix = new Matrix();
	//   97  201:aload_0         
	//   98  202:new             #140 <Class Matrix>
	//   99  205:dup             
	//  100  206:invokespecial   #164 <Method void Matrix()>
	//  101  209:putfield        #163 <Field Matrix mTempMatrix>
				mTempMatrix.set(matrix);
	//  102  212:aload_0         
	//  103  213:getfield        #163 <Field Matrix mTempMatrix>
	//  104  216:aload_2         
	//  105  217:invokevirtual   #168 <Method void Matrix.set(Matrix)>
				mTempMatrix.postTranslate(-rectf.left, -rectf.top);
	//  106  220:aload_0         
	//  107  221:getfield        #163 <Field Matrix mTempMatrix>
	//  108  224:aload_3         
	//  109  225:getfield        #171 <Field float RectF.left>
	//  110  228:fneg            
	//  111  229:aload_3         
	//  112  230:getfield        #173 <Field float RectF.top>
	//  113  233:fneg            
	//  114  234:invokevirtual   #177 <Method boolean Matrix.postTranslate(float, float)>
	//  115  237:pop             
				mTempMatrix.postScale(f, f);
	//  116  238:aload_0         
	//  117  239:getfield        #163 <Field Matrix mTempMatrix>
	//  118  242:fload           4
	//  119  244:fload           4
	//  120  246:invokevirtual   #180 <Method boolean Matrix.postScale(float, float)>
	//  121  249:pop             
				matrix = ((Matrix) (Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888)));
	//  122  250:iload           6
	//  123  252:iload           5
	//  124  254:getstatic       #59  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  125  257:invokestatic    #65  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  126  260:astore_2        
				rectf = ((RectF) (new Canvas(((Bitmap) (matrix)))));
	//  127  261:new             #67  <Class Canvas>
	//  128  264:dup             
	//  129  265:aload_2         
	//  130  266:invokespecial   #70  <Method void Canvas(Bitmap)>
	//  131  269:astore_3        
				((Canvas) (rectf)).concat(mTempMatrix);
	//  132  270:aload_3         
	//  133  271:aload_0         
	//  134  272:getfield        #163 <Field Matrix mTempMatrix>
	//  135  275:invokevirtual   #183 <Method void Canvas.concat(Matrix)>
				view.draw(((Canvas) (rectf)));
	//  136  278:aload_1         
	//  137  279:aload_3         
	//  138  280:invokevirtual   #186 <Method void View.draw(Canvas)>
				return ((Parcelable) (matrix));
	//  139  283:aload_2         
	//  140  284:areturn         
			}
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #111 <Class Bundle>
	//*   2    4:ifeq            92
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_2         
	//    4    8:checkcast       #111 <Class Bundle>
	//    5   11:astore_2        
			Bitmap bitmap = (Bitmap)((Bundle) (parcelable)).getParcelable("sharedElement:snapshot:bitmap");
	//    6   12:aload_2         
	//    7   13:ldc1            #11  <String "sharedElement:snapshot:bitmap">
	//    8   15:invokevirtual   #192 <Method Parcelable Bundle.getParcelable(String)>
	//    9   18:checkcast       #61  <Class Bitmap>
	//   10   21:astore_3        
			if(bitmap == null)
	//*  11   22:aload_3         
	//*  12   23:ifnonnull       28
				return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
			context = ((Context) (new ImageView(context)));
	//   15   28:new             #100 <Class ImageView>
	//   16   31:dup             
	//   17   32:aload_1         
	//   18   33:invokespecial   #195 <Method void ImageView(Context)>
	//   19   36:astore_1        
			((ImageView) (context)).setImageBitmap(bitmap);
	//   20   37:aload_1         
	//   21   38:aload_3         
	//   22   39:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
			((ImageView) (context)).setScaleType(android.widget.ImageView.ScaleType.valueOf(((Bundle) (parcelable)).getString("sharedElement:snapshot:imageScaleType")));
	//   23   42:aload_1         
	//   24   43:aload_2         
	//   25   44:ldc1            #17  <String "sharedElement:snapshot:imageScaleType">
	//   26   46:invokevirtual   #202 <Method String Bundle.getString(String)>
	//   27   49:invokestatic    #206 <Method android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.valueOf(String)>
	//   28   52:invokevirtual   #210 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			if(((ImageView) (context)).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
	//*  29   55:aload_1         
	//*  30   56:invokevirtual   #120 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  31   59:getstatic       #134 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  32   62:if_acmpne       90
			{
				parcelable = ((Parcelable) (((Bundle) (parcelable)).getFloatArray("sharedElement:snapshot:imageMatrix")));
	//   33   65:aload_2         
	//   34   66:ldc1            #14  <String "sharedElement:snapshot:imageMatrix">
	//   35   68:invokevirtual   #214 <Method float[] Bundle.getFloatArray(String)>
	//   36   71:astore_2        
				Matrix matrix = new Matrix();
	//   37   72:new             #140 <Class Matrix>
	//   38   75:dup             
	//   39   76:invokespecial   #164 <Method void Matrix()>
	//   40   79:astore_3        
				matrix.setValues(((float []) (parcelable)));
	//   41   80:aload_3         
	//   42   81:aload_2         
	//   43   82:invokevirtual   #217 <Method void Matrix.setValues(float[])>
				((ImageView) (context)).setImageMatrix(matrix);
	//   44   85:aload_1         
	//   45   86:aload_3         
	//   46   87:invokevirtual   #220 <Method void ImageView.setImageMatrix(Matrix)>
			}
		} else
	//*  47   90:aload_1         
	//*  48   91:areturn         
		if(parcelable instanceof Bitmap)
	//*  49   92:aload_2         
	//*  50   93:instanceof      #61  <Class Bitmap>
	//*  51   96:ifeq            121
		{
			parcelable = ((Parcelable) ((Bitmap)parcelable));
	//   52   99:aload_2         
	//   53  100:checkcast       #61  <Class Bitmap>
	//   54  103:astore_2        
			context = ((Context) (new ImageView(context)));
	//   55  104:new             #100 <Class ImageView>
	//   56  107:dup             
	//   57  108:aload_1         
	//   58  109:invokespecial   #195 <Method void ImageView(Context)>
	//   59  112:astore_1        
			((ImageView) (context)).setImageBitmap(((Bitmap) (parcelable)));
	//   60  113:aload_1         
	//   61  114:aload_2         
	//   62  115:invokevirtual   #198 <Method void ImageView.setImageBitmap(Bitmap)>
		} else
	//*  63  118:goto            90
		{
			context = null;
	//   64  121:aconst_null     
	//   65  122:astore_1        
		}
		return ((View) (context));
	//*  66  123:goto            90
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
