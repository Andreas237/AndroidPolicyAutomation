// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;
import android.view.*;

public class ViewGroupUtils
{

	public static void getDescendantRect(ViewGroup viewgroup, View view, Rect rect)
	{
		rect.set(0, 0, view.getWidth(), view.getHeight());
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #33  <Method int View.getWidth()>
	//    5    7:aload_1         
	//    6    8:invokevirtual   #36  <Method int View.getHeight()>
	//    7   11:invokevirtual   #42  <Method void Rect.set(int, int, int, int)>
		offsetDescendantRect(viewgroup, view, rect);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokestatic    #45  <Method void offsetDescendantRect(ViewGroup, View, Rect)>
	//   12   20:return          
	}

	private static void offsetDescendantMatrix(ViewParent viewparent, View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method ViewParent View.getParent()>
	//    2    4:astore_3        
		if((obj instanceof View) && obj != viewparent)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #29  <Class View>
	//*   5    9:ifeq            45
	//*   6   12:aload_3         
	//*   7   13:aload_0         
	//*   8   14:if_acmpeq       45
		{
			obj = ((Object) ((View)obj));
	//    9   17:aload_3         
	//   10   18:checkcast       #29  <Class View>
	//   11   21:astore_3        
			offsetDescendantMatrix(viewparent, ((View) (obj)), matrix);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:aload_2         
	//   15   25:invokestatic    #53  <Method void offsetDescendantMatrix(ViewParent, View, Matrix)>
			matrix.preTranslate(-((View) (obj)).getScrollX(), -((View) (obj)).getScrollY());
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #56  <Method int View.getScrollX()>
	//   19   33:ineg            
	//   20   34:i2f             
	//   21   35:aload_3         
	//   22   36:invokevirtual   #59  <Method int View.getScrollY()>
	//   23   39:ineg            
	//   24   40:i2f             
	//   25   41:invokevirtual   #65  <Method boolean Matrix.preTranslate(float, float)>
	//   26   44:pop             
		}
		matrix.preTranslate(view.getLeft(), view.getTop());
	//   27   45:aload_2         
	//   28   46:aload_1         
	//   29   47:invokevirtual   #68  <Method int View.getLeft()>
	//   30   50:i2f             
	//   31   51:aload_1         
	//   32   52:invokevirtual   #71  <Method int View.getTop()>
	//   33   55:i2f             
	//   34   56:invokevirtual   #65  <Method boolean Matrix.preTranslate(float, float)>
	//   35   59:pop             
		if(!view.getMatrix().isIdentity())
	//*  36   60:aload_1         
	//*  37   61:invokevirtual   #75  <Method Matrix View.getMatrix()>
	//*  38   64:invokevirtual   #79  <Method boolean Matrix.isIdentity()>
	//*  39   67:ifne            79
			matrix.preConcat(view.getMatrix());
	//   40   70:aload_2         
	//   41   71:aload_1         
	//   42   72:invokevirtual   #75  <Method Matrix View.getMatrix()>
	//   43   75:invokevirtual   #83  <Method boolean Matrix.preConcat(Matrix)>
	//   44   78:pop             
	//   45   79:return          
	}

	static void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect)
	{
		Matrix matrix = (Matrix)sMatrix.get();
	//    0    0:getstatic       #22  <Field ThreadLocal sMatrix>
	//    1    3:invokevirtual   #87  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #61  <Class Matrix>
	//    3    9:astore_3        
		if(matrix == null)
	//*   4   10:aload_3         
	//*   5   11:ifnonnull       32
		{
			matrix = new Matrix();
	//    6   14:new             #61  <Class Matrix>
	//    7   17:dup             
	//    8   18:invokespecial   #88  <Method void Matrix()>
	//    9   21:astore_3        
			sMatrix.set(((Object) (matrix)));
	//   10   22:getstatic       #22  <Field ThreadLocal sMatrix>
	//   11   25:aload_3         
	//   12   26:invokevirtual   #91  <Method void ThreadLocal.set(Object)>
		} else
	//*  13   29:goto            36
		{
			matrix.reset();
	//   14   32:aload_3         
	//   15   33:invokevirtual   #94  <Method void Matrix.reset()>
		}
		offsetDescendantMatrix(((ViewParent) (viewgroup)), view, matrix);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_3         
	//   19   39:invokestatic    #53  <Method void offsetDescendantMatrix(ViewParent, View, Matrix)>
		view = ((View) ((RectF)sRectF.get()));
	//   20   42:getstatic       #24  <Field ThreadLocal sRectF>
	//   21   45:invokevirtual   #87  <Method Object ThreadLocal.get()>
	//   22   48:checkcast       #96  <Class RectF>
	//   23   51:astore_1        
		viewgroup = ((ViewGroup) (view));
	//   24   52:aload_1         
	//   25   53:astore_0        
		if(view == null)
	//*  26   54:aload_1         
	//*  27   55:ifnonnull       73
		{
			viewgroup = ((ViewGroup) (new RectF()));
	//   28   58:new             #96  <Class RectF>
	//   29   61:dup             
	//   30   62:invokespecial   #97  <Method void RectF()>
	//   31   65:astore_0        
			sRectF.set(((Object) (viewgroup)));
	//   32   66:getstatic       #24  <Field ThreadLocal sRectF>
	//   33   69:aload_0         
	//   34   70:invokevirtual   #91  <Method void ThreadLocal.set(Object)>
		}
		((RectF) (viewgroup)).set(rect);
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:invokevirtual   #100 <Method void RectF.set(Rect)>
		matrix.mapRect(((RectF) (viewgroup)));
	//   38   78:aload_3         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   41   83:pop             
		rect.set((int)(((RectF) (viewgroup)).left + 0.5F), (int)(((RectF) (viewgroup)).top + 0.5F), (int)(((RectF) (viewgroup)).right + 0.5F), (int)(((RectF) (viewgroup)).bottom + 0.5F));
	//   42   84:aload_2         
	//   43   85:aload_0         
	//   44   86:getfield        #108 <Field float RectF.left>
	//   45   89:ldc1            #109 <Float 0.5F>
	//   46   91:fadd            
	//   47   92:f2i             
	//   48   93:aload_0         
	//   49   94:getfield        #112 <Field float RectF.top>
	//   50   97:ldc1            #109 <Float 0.5F>
	//   51   99:fadd            
	//   52  100:f2i             
	//   53  101:aload_0         
	//   54  102:getfield        #115 <Field float RectF.right>
	//   55  105:ldc1            #109 <Float 0.5F>
	//   56  107:fadd            
	//   57  108:f2i             
	//   58  109:aload_0         
	//   59  110:getfield        #118 <Field float RectF.bottom>
	//   60  113:ldc1            #109 <Float 0.5F>
	//   61  115:fadd            
	//   62  116:f2i             
	//   63  117:invokevirtual   #42  <Method void Rect.set(int, int, int, int)>
	//   64  120:return          
	}

	private static final ThreadLocal sMatrix = new ThreadLocal();
	private static final ThreadLocal sRectF = new ThreadLocal();

	static 
	{
	//    0    0:new             #17  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ThreadLocal()>
	//    3    7:putstatic       #22  <Field ThreadLocal sMatrix>
	//    4   10:new             #17  <Class ThreadLocal>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void ThreadLocal()>
	//    7   17:putstatic       #24  <Field ThreadLocal sRectF>
	//*   8   20:return          
	}
}
