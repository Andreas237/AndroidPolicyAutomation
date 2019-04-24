// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtil

class ItemTouchUIUtilImpl
{
	static class Api21Impl extends BaseImpl
	{

		private float findMaxElevation(RecyclerView recyclerview, View view)
		{
			int j = recyclerview.getChildCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #20  <Method int RecyclerView.getChildCount()>
		//    2    4:istore          7
			float f = 0.0F;
		//    3    6:fconst_0        
		//    4    7:fstore_3        
			int i = 0;
		//    5    8:iconst_0        
		//    6    9:istore          6
			while(i < j) 
		//*   7   11:iload           6
		//*   8   13:iload           7
		//*   9   15:icmpge          71
			{
				View view1 = recyclerview.getChildAt(i);
		//   10   18:aload_1         
		//   11   19:iload           6
		//   12   21:invokevirtual   #24  <Method View RecyclerView.getChildAt(int)>
		//   13   24:astore          8
				float f1;
				if(view1 == view)
		//*  14   26:aload           8
		//*  15   28:aload_2         
		//*  16   29:if_acmpne       47
				{
					f1 = f;
		//   17   32:fload_3         
		//   18   33:fstore          4
				} else
		//*  19   35:iload           6
		//*  20   37:iconst_1        
		//*  21   38:iadd            
		//*  22   39:istore          6
		//*  23   41:fload           4
		//*  24   43:fstore_3        
		//*  25   44:goto            11
				{
					float f2 = ViewCompat.getElevation(view1);
		//   26   47:aload           8
		//   27   49:invokestatic    #30  <Method float ViewCompat.getElevation(View)>
		//   28   52:fstore          5
					f1 = f;
		//   29   54:fload_3         
		//   30   55:fstore          4
					if(f2 > f)
		//*  31   57:fload           5
		//*  32   59:fload_3         
		//*  33   60:fcmpl           
		//*  34   61:ifle            35
						f1 = f2;
		//   35   64:fload           5
		//   36   66:fstore          4
				}
				i++;
				f = f1;
			}
		//*  37   68:goto            35
			return f;
		//   38   71:fload_3         
		//   39   72:freturn         
		}

		public void clearView(View view)
		{
			Object obj = view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation);
		//    0    0:aload_1         
		//    1    1:getstatic       #38  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
		//    2    4:invokevirtual   #44  <Method Object View.getTag(int)>
		//    3    7:astore_2        
			if(obj != null && (obj instanceof Float))
		//*   4    8:aload_2         
		//*   5    9:ifnull          30
		//*   6   12:aload_2         
		//*   7   13:instanceof      #46  <Class Float>
		//*   8   16:ifeq            30
				ViewCompat.setElevation(view, ((Float)obj).floatValue());
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:checkcast       #46  <Class Float>
		//   12   24:invokevirtual   #50  <Method float Float.floatValue()>
		//   13   27:invokestatic    #54  <Method void ViewCompat.setElevation(View, float)>
			view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, ((Object) (null)));
		//   14   30:aload_1         
		//   15   31:getstatic       #38  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
		//   16   34:aconst_null     
		//   17   35:invokevirtual   #58  <Method void View.setTag(int, Object)>
			super.clearView(view);
		//   18   38:aload_0         
		//   19   39:aload_1         
		//   20   40:invokespecial   #60  <Method void ItemTouchUIUtilImpl$BaseImpl.clearView(View)>
		//   21   43:return          
		}

		public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
		{
			if(flag && view.getTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation) == null)
		//*   0    0:iload           7
		//*   1    2:ifeq            45
		//*   2    5:aload_3         
		//*   3    6:getstatic       #38  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
		//*   4    9:invokevirtual   #44  <Method Object View.getTag(int)>
		//*   5   12:ifnonnull       45
			{
				float f2 = ViewCompat.getElevation(view);
		//    6   15:aload_3         
		//    7   16:invokestatic    #30  <Method float ViewCompat.getElevation(View)>
		//    8   19:fstore          8
				ViewCompat.setElevation(view, 1.0F + findMaxElevation(recyclerview, view));
		//    9   21:aload_3         
		//   10   22:fconst_1        
		//   11   23:aload_0         
		//   12   24:aload_2         
		//   13   25:aload_3         
		//   14   26:invokespecial   #64  <Method float findMaxElevation(RecyclerView, View)>
		//   15   29:fadd            
		//   16   30:invokestatic    #54  <Method void ViewCompat.setElevation(View, float)>
				view.setTag(android.support.v7.recyclerview.R.id.item_touch_helper_previous_elevation, ((Object) (Float.valueOf(f2))));
		//   17   33:aload_3         
		//   18   34:getstatic       #38  <Field int android.support.v7.recyclerview.R$id.item_touch_helper_previous_elevation>
		//   19   37:fload           8
		//   20   39:invokestatic    #68  <Method Float Float.valueOf(float)>
		//   21   42:invokevirtual   #58  <Method void View.setTag(int, Object)>
			}
			super.onDraw(canvas, recyclerview, view, f, f1, i, flag);
		//   22   45:aload_0         
		//   23   46:aload_1         
		//   24   47:aload_2         
		//   25   48:aload_3         
		//   26   49:fload           4
		//   27   51:fload           5
		//   28   53:iload           6
		//   29   55:iload           7
		//   30   57:invokespecial   #70  <Method void ItemTouchUIUtilImpl$BaseImpl.onDraw(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   31   60:return          
		}

		Api21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ItemTouchUIUtilImpl$BaseImpl()>
		//    2    4:return          
		}
	}

	static class BaseImpl
		implements ItemTouchUIUtil
	{

		public void clearView(View view)
		{
			view.setTranslationX(0.0F);
		//    0    0:aload_1         
		//    1    1:fconst_0        
		//    2    2:invokevirtual   #22  <Method void View.setTranslationX(float)>
			view.setTranslationY(0.0F);
		//    3    5:aload_1         
		//    4    6:fconst_0        
		//    5    7:invokevirtual   #25  <Method void View.setTranslationY(float)>
		//    6   10:return          
		}

		public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
		{
			view.setTranslationX(f);
		//    0    0:aload_3         
		//    1    1:fload           4
		//    2    3:invokevirtual   #22  <Method void View.setTranslationX(float)>
			view.setTranslationY(f1);
		//    3    6:aload_3         
		//    4    7:fload           5
		//    5    9:invokevirtual   #25  <Method void View.setTranslationY(float)>
		//    6   12:return          
		}

		public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
		{
		//    0    0:return          
		}

		public void onSelected(View view)
		{
		//    0    0:return          
		}

		BaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	ItemTouchUIUtilImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
