// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtilImpl

static class ItemTouchUIUtilImpl$Api21Impl extends ItemTouchUIUtilImpl.BaseImpl
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
		for(int i = 0; i < j;)
	//*   5    8:iconst_0        
	//*   6    9:istore          6
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
	//*  16   29:if_acmpne       38
			{
				f1 = f;
	//   17   32:fload_3         
	//   18   33:fstore          4
			} else
	//*  19   35:goto            59
			{
				float f2 = ViewCompat.getElevation(view1);
	//   20   38:aload           8
	//   21   40:invokestatic    #30  <Method float ViewCompat.getElevation(View)>
	//   22   43:fstore          5
				f1 = f;
	//   23   45:fload_3         
	//   24   46:fstore          4
				if(f2 > f)
	//*  25   48:fload           5
	//*  26   50:fload_3         
	//*  27   51:fcmpl           
	//*  28   52:ifle            59
					f1 = f2;
	//   29   55:fload           5
	//   30   57:fstore          4
			}
			i++;
	//   31   59:iload           6
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore          6
			f = f1;
	//   35   65:fload           4
	//   36   67:fstore_3        
		}

	//*  37   68:goto            11
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

	ItemTouchUIUtilImpl$Api21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ItemTouchUIUtilImpl$BaseImpl()>
	//    2    4:return          
	}
}
