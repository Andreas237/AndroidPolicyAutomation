// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ac;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtil

class ItemTouchUIUtilImpl
	implements ItemTouchUIUtil
{

	ItemTouchUIUtilImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private static float findMaxElevation(RecyclerView recyclerview, View view)
	{
		int j = recyclerview.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method int RecyclerView.getChildCount()>
	//    2    4:istore          6
		float f = 0.0F;
	//    3    6:fconst_0        
	//    4    7:fstore_2        
		for(int i = 0; i < j;)
	//*   5    8:iconst_0        
	//*   6    9:istore          5
	//*   7   11:iload           5
	//*   8   13:iload           6
	//*   9   15:icmpge          67
		{
			View view1 = recyclerview.getChildAt(i);
	//   10   18:aload_0         
	//   11   19:iload           5
	//   12   21:invokevirtual   #29  <Method View RecyclerView.getChildAt(int)>
	//   13   24:astore          7
			float f1;
			if(view1 == view)
	//*  14   26:aload           7
	//*  15   28:aload_1         
	//*  16   29:if_acmpne       37
			{
				f1 = f;
	//   17   32:fload_2         
	//   18   33:fstore_3        
			} else
	//*  19   34:goto            56
			{
				float f2 = ac.m(view1);
	//   20   37:aload           7
	//   21   39:invokestatic    #35  <Method float ac.m(View)>
	//   22   42:fstore          4
				f1 = f;
	//   23   44:fload_2         
	//   24   45:fstore_3        
				if(f2 > f)
	//*  25   46:fload           4
	//*  26   48:fload_2         
	//*  27   49:fcmpl           
	//*  28   50:ifle            56
					f1 = f2;
	//   29   53:fload           4
	//   30   55:fstore_3        
			}
			i++;
	//   31   56:iload           5
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore          5
			f = f1;
	//   35   62:fload_3         
	//   36   63:fstore_2        
		}

	//*  37   64:goto            11
		return f;
	//   38   67:fload_2         
	//   39   68:freturn         
	}

	public void clearView(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          46
		{
			Object obj = view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation);
	//    3    8:aload_1         
	//    4    9:getstatic       #48  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
	//    5   12:invokevirtual   #54  <Method Object View.getTag(int)>
	//    6   15:astore_2        
			if(obj != null && (obj instanceof Float))
	//*   7   16:aload_2         
	//*   8   17:ifnull          38
	//*   9   20:aload_2         
	//*  10   21:instanceof      #56  <Class Float>
	//*  11   24:ifeq            38
				ac.a(view, ((Float)obj).floatValue());
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:checkcast       #56  <Class Float>
	//   15   32:invokevirtual   #60  <Method float Float.floatValue()>
	//   16   35:invokestatic    #64  <Method void ac.a(View, float)>
			view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, ((Object) (null)));
	//   17   38:aload_1         
	//   18   39:getstatic       #48  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
	//   19   42:aconst_null     
	//   20   43:invokevirtual   #68  <Method void View.setTag(int, Object)>
		}
		view.setTranslationX(0.0F);
	//   21   46:aload_1         
	//   22   47:fconst_0        
	//   23   48:invokevirtual   #72  <Method void View.setTranslationX(float)>
		view.setTranslationY(0.0F);
	//   24   51:aload_1         
	//   25   52:fconst_0        
	//   26   53:invokevirtual   #75  <Method void View.setTranslationY(float)>
	//   27   56:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && flag && view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation) == null)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          52
	//*   3    8:iload           7
	//*   4   10:ifeq            52
	//*   5   13:aload_3         
	//*   6   14:getstatic       #48  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
	//*   7   17:invokevirtual   #54  <Method Object View.getTag(int)>
	//*   8   20:ifnonnull       52
		{
			float f2 = ac.m(view);
	//    9   23:aload_3         
	//   10   24:invokestatic    #35  <Method float ac.m(View)>
	//   11   27:fstore          8
			ac.a(view, findMaxElevation(recyclerview, view) + 1.0F);
	//   12   29:aload_3         
	//   13   30:aload_2         
	//   14   31:aload_3         
	//   15   32:invokestatic    #79  <Method float findMaxElevation(RecyclerView, View)>
	//   16   35:fconst_1        
	//   17   36:fadd            
	//   18   37:invokestatic    #64  <Method void ac.a(View, float)>
			view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, ((Object) (Float.valueOf(f2))));
	//   19   40:aload_3         
	//   20   41:getstatic       #48  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
	//   21   44:fload           8
	//   22   46:invokestatic    #83  <Method Float Float.valueOf(float)>
	//   23   49:invokevirtual   #68  <Method void View.setTag(int, Object)>
		}
		view.setTranslationX(f);
	//   24   52:aload_3         
	//   25   53:fload           4
	//   26   55:invokevirtual   #72  <Method void View.setTranslationX(float)>
		view.setTranslationY(f1);
	//   27   58:aload_3         
	//   28   59:fload           5
	//   29   61:invokevirtual   #75  <Method void View.setTranslationY(float)>
	//   30   64:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
	//    0    0:return          
	}

	public void onSelected(View view)
	{
	//    0    0:return          
	}

	static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

	static 
	{
	//    0    0:new             #2   <Class ItemTouchUIUtilImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ItemTouchUIUtilImpl()>
	//    3    7:putstatic       #15  <Field ItemTouchUIUtil INSTANCE>
	//*   4   10:return          
	}
}
