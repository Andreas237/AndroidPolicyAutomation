// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.*;

final class MediaRouteDialogHelper
{

	private MediaRouteDialogHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getDialogWidth(Context context)
	{
		DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #23  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore_2        
		boolean flag;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*   4    8:aload_2         
	//*   5    9:getfield        #29  <Field int DisplayMetrics.widthPixels>
	//*   6   12:aload_2         
	//*   7   13:getfield        #32  <Field int DisplayMetrics.heightPixels>
	//*   8   16:icmpge          24
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		TypedValue typedvalue = new TypedValue();
	//   14   26:new             #34  <Class TypedValue>
	//   15   29:dup             
	//   16   30:invokespecial   #35  <Method void TypedValue()>
	//   17   33:astore_3        
		context = ((Context) (context.getResources()));
	//   18   34:aload_0         
	//   19   35:invokevirtual   #17  <Method Resources Context.getResources()>
	//   20   38:astore_0        
		int i;
		if(flag)
	//*  21   39:iload_1         
	//*  22   40:ifeq            50
			i = android.support.v7.mediarouter.R.dimen.mr_dialog_fixed_width_minor;
	//   23   43:getstatic       #40  <Field int android.support.v7.mediarouter.R$dimen.mr_dialog_fixed_width_minor>
	//   24   46:istore_1        
		else
	//*  25   47:goto            54
			i = android.support.v7.mediarouter.R.dimen.mr_dialog_fixed_width_major;
	//   26   50:getstatic       #43  <Field int android.support.v7.mediarouter.R$dimen.mr_dialog_fixed_width_major>
	//   27   53:istore_1        
		((Resources) (context)).getValue(i, typedvalue, true);
	//   28   54:aload_0         
	//   29   55:iload_1         
	//   30   56:aload_3         
	//   31   57:iconst_1        
	//   32   58:invokevirtual   #47  <Method void Resources.getValue(int, TypedValue, boolean)>
		if(typedvalue.type == 5)
	//*  33   61:aload_3         
	//*  34   62:getfield        #50  <Field int TypedValue.type>
	//*  35   65:iconst_5        
	//*  36   66:icmpne          76
			return (int)typedvalue.getDimension(displaymetrics);
	//   37   69:aload_3         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #54  <Method float TypedValue.getDimension(DisplayMetrics)>
	//   40   74:f2i             
	//   41   75:ireturn         
		if(typedvalue.type == 6)
	//*  42   76:aload_3         
	//*  43   77:getfield        #50  <Field int TypedValue.type>
	//*  44   80:bipush          6
	//*  45   82:icmpne          101
			return (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//   46   85:aload_3         
	//   47   86:aload_2         
	//   48   87:getfield        #29  <Field int DisplayMetrics.widthPixels>
	//   49   90:i2f             
	//   50   91:aload_2         
	//   51   92:getfield        #29  <Field int DisplayMetrics.widthPixels>
	//   52   95:i2f             
	//   53   96:invokevirtual   #58  <Method float TypedValue.getFraction(float, float)>
	//   54   99:f2i             
	//   55  100:ireturn         
		else
			return -2;
	//   56  101:bipush          -2
	//   57  103:ireturn         
	}

	public static HashMap getItemBitmapMap(Context context, ListView listview, ArrayAdapter arrayadapter)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #62  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void HashMap()>
	//    3    7:astore          5
		int j = listview.getFirstVisiblePosition();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #69  <Method int ListView.getFirstVisiblePosition()>
	//    6   13:istore          4
		for(int i = 0; i < listview.getChildCount(); i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_3        
	//*   9   17:iload_3         
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #72  <Method int ListView.getChildCount()>
	//*  12   22:icmpge          55
			hashmap.put(arrayadapter.getItem(j + i), ((Object) (getViewBitmap(context, listview.getChildAt(i)))));
	//   13   25:aload           5
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:iload_3         
	//   17   31:iadd            
	//   18   32:invokevirtual   #78  <Method Object ArrayAdapter.getItem(int)>
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #82  <Method View ListView.getChildAt(int)>
	//   23   41:invokestatic    #86  <Method BitmapDrawable getViewBitmap(Context, View)>
	//   24   44:invokevirtual   #90  <Method Object HashMap.put(Object, Object)>
	//   25   47:pop             

	//   26   48:iload_3         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_3        
	//*  30   52:goto            17
		return hashmap;
	//   31   55:aload           5
	//   32   57:areturn         
	}

	public static HashMap getItemBoundMap(ListView listview, ArrayAdapter arrayadapter)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #62  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void HashMap()>
	//    3    7:astore          4
		int j = listview.getFirstVisiblePosition();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #69  <Method int ListView.getFirstVisiblePosition()>
	//    6   13:istore_3        
		for(int i = 0; i < listview.getChildCount(); i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #72  <Method int ListView.getChildCount()>
	//*  12   21:icmpge          82
		{
			Object obj = arrayadapter.getItem(j + i);
	//   13   24:aload_1         
	//   14   25:iload_3         
	//   15   26:iload_2         
	//   16   27:iadd            
	//   17   28:invokevirtual   #78  <Method Object ArrayAdapter.getItem(int)>
	//   18   31:astore          5
			View view = listview.getChildAt(i);
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #82  <Method View ListView.getChildAt(int)>
	//   22   38:astore          6
			hashmap.put(obj, ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   23   40:aload           4
	//   24   42:aload           5
	//   25   44:new             #94  <Class Rect>
	//   26   47:dup             
	//   27   48:aload           6
	//   28   50:invokevirtual   #99  <Method int View.getLeft()>
	//   29   53:aload           6
	//   30   55:invokevirtual   #102 <Method int View.getTop()>
	//   31   58:aload           6
	//   32   60:invokevirtual   #105 <Method int View.getRight()>
	//   33   63:aload           6
	//   34   65:invokevirtual   #108 <Method int View.getBottom()>
	//   35   68:invokespecial   #111 <Method void Rect(int, int, int, int)>
	//   36   71:invokevirtual   #90  <Method Object HashMap.put(Object, Object)>
	//   37   74:pop             
		}

	//   38   75:iload_2         
	//   39   76:iconst_1        
	//   40   77:iadd            
	//   41   78:istore_2        
	//*  42   79:goto            16
		return hashmap;
	//   43   82:aload           4
	//   44   84:areturn         
	}

	public static Set getItemsAdded(List list, List list1)
	{
		list1 = ((List) (new HashSet(((java.util.Collection) (list1)))));
	//    0    0:new             #115 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #118 <Method void HashSet(java.util.Collection)>
	//    4    8:astore_1        
		((HashSet) (list1)).removeAll(((java.util.Collection) (list)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #122 <Method boolean HashSet.removeAll(java.util.Collection)>
	//    8   14:pop             
		return ((Set) (list1));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public static Set getItemsRemoved(List list, List list1)
	{
		list = ((List) (new HashSet(((java.util.Collection) (list)))));
	//    0    0:new             #115 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #118 <Method void HashSet(java.util.Collection)>
	//    4    8:astore_0        
		((HashSet) (list)).removeAll(((java.util.Collection) (list1)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #122 <Method boolean HashSet.removeAll(java.util.Collection)>
	//    8   14:pop             
		return ((Set) (list));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	private static BitmapDrawable getViewBitmap(Context context, View view)
	{
		Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method int View.getWidth()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method int View.getHeight()>
	//    4    8:getstatic       #135 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    5   11:invokestatic    #141 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    6   14:astore_2        
		view.draw(new Canvas(bitmap));
	//    7   15:aload_1         
	//    8   16:new             #143 <Class Canvas>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokespecial   #146 <Method void Canvas(Bitmap)>
	//   12   24:invokevirtual   #150 <Method void View.draw(Canvas)>
		return new BitmapDrawable(context.getResources(), bitmap);
	//   13   27:new             #152 <Class BitmapDrawable>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokevirtual   #17  <Method Resources Context.getResources()>
	//   17   35:aload_2         
	//   18   36:invokespecial   #155 <Method void BitmapDrawable(Resources, Bitmap)>
	//   19   39:areturn         
	}

	public static boolean listUnorderedEquals(List list, List list1)
	{
		return (new HashSet(((java.util.Collection) (list)))).equals(((Object) (new HashSet(((java.util.Collection) (list1))))));
	//    0    0:new             #115 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #118 <Method void HashSet(java.util.Collection)>
	//    4    8:new             #115 <Class HashSet>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #118 <Method void HashSet(java.util.Collection)>
	//    8   16:invokevirtual   #161 <Method boolean HashSet.equals(Object)>
	//    9   19:ireturn         
	}
}
