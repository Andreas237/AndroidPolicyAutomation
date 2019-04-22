// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.stetho.common.Predicate;
import com.facebook.stetho.common.Util;

public final class ViewUtil
{
	private static class ViewCompat
	{

		public static ViewCompat getInstance()
		{
			return sInstance;
		//    0    0:getstatic       #26  <Field ViewUtil$ViewCompat sInstance>
		//    1    3:areturn         
		}

		public float getAlpha(View view)
		{
			return 1.0F;
		//    0    0:fconst_1        
		//    1    1:freturn         
		}

		private static final ViewCompat sInstance;

		static 
		{
			if(android.os.Build.VERSION.SDK_INT >= 11)
		//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          11
		//*   2    5:icmplt          20
				sInstance = ((ViewCompat) (new ViewCompatHoneycomb()));
		//    3    8:new             #9   <Class ViewUtil$ViewCompat$ViewCompatHoneycomb>
		//    4   11:dup             
		//    5   12:aconst_null     
		//    6   13:invokespecial   #24  <Method void ViewUtil$ViewCompat$ViewCompatHoneycomb(ViewUtil$1)>
		//    7   16:putstatic       #26  <Field ViewUtil$ViewCompat sInstance>
		//    8   19:return          
			else
				sInstance = new ViewCompat();
		//    9   20:new             #2   <Class ViewUtil$ViewCompat>
		//   10   23:dup             
		//   11   24:invokespecial   #28  <Method void ViewUtil$ViewCompat()>
		//   12   27:putstatic       #26  <Field ViewUtil$ViewCompat sInstance>
		//*  13   30:return          
		}

		protected ViewCompat()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ViewCompat.ViewCompatHoneycomb extends ViewCompat
	{

		public float getAlpha(View view)
		{
			return view.getAlpha();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method float View.getAlpha()>
		//    2    4:freturn         
		}

		private ViewCompat.ViewCompatHoneycomb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void ViewUtil$ViewCompat()>
		//    2    4:return          
		}

	}


	private ViewUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static View hitTest(View view, float f, float f1)
	{
		return hitTest(view, f, f1, ((Predicate) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #23  <Method View hitTest(View, float, float, Predicate)>
	//    5    7:areturn         
	}

	public static View hitTest(View view, float f, float f1, Predicate predicate)
	{
		View view2 = hitTestImpl(view, f, f1, predicate, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #28  <Method View hitTestImpl(View, float, float, Predicate, boolean)>
	//    6    8:astore          5
		View view1 = view2;
	//    7   10:aload           5
	//    8   12:astore          4
		if(view2 == null)
	//*   9   14:aload           5
	//*  10   16:ifnonnull       29
			view1 = hitTestImpl(view, f, f1, predicate, true);
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:fload_2         
	//   14   22:aload_3         
	//   15   23:iconst_1        
	//   16   24:invokestatic    #28  <Method View hitTestImpl(View, float, float, Predicate, boolean)>
	//   17   27:astore          4
		return view1;
	//   18   29:aload           4
	//   19   31:areturn         
	}

	private static View hitTestImpl(View view, float f, float f1, Predicate predicate, boolean flag)
	{
		if(!isHittable(view))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #35  <Method boolean isHittable(View)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(!pointInView(view, f, f1))
	//*   5    9:aload_0         
	//*   6   10:fload_1         
	//*   7   11:fload_2         
	//*   8   12:invokestatic    #39  <Method boolean pointInView(View, float, float)>
	//*   9   15:ifne            20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		if(predicate != null && !predicate.apply(((Object) (view))))
	//*  12   20:aload_3         
	//*  13   21:ifnull          36
	//*  14   24:aload_3         
	//*  15   25:aload_0         
	//*  16   26:invokeinterface #45  <Method boolean Predicate.apply(Object)>
	//*  17   31:ifne            36
			return null;
	//   18   34:aconst_null     
	//   19   35:areturn         
		if(!(view instanceof ViewGroup))
	//*  20   36:aload_0         
	//*  21   37:instanceof      #47  <Class ViewGroup>
	//*  22   40:ifne            45
			return view;
	//   23   43:aload_0         
	//   24   44:areturn         
		view = ((View) ((ViewGroup)view));
	//   25   45:aload_0         
	//   26   46:checkcast       #47  <Class ViewGroup>
	//   27   49:astore_0        
		if(((ViewGroup) (view)).getChildCount() > 0)
	//*  28   50:aload_0         
	//*  29   51:invokevirtual   #51  <Method int ViewGroup.getChildCount()>
	//*  30   54:ifle            137
		{
			PointF pointf = new PointF();
	//   31   57:new             #53  <Class PointF>
	//   32   60:dup             
	//   33   61:invokespecial   #54  <Method void PointF()>
	//   34   64:astore          6
			for(int i = ((ViewGroup) (view)).getChildCount() - 1; i >= 0; i--)
	//*  35   66:aload_0         
	//*  36   67:invokevirtual   #51  <Method int ViewGroup.getChildCount()>
	//*  37   70:iconst_1        
	//*  38   71:isub            
	//*  39   72:istore          5
	//*  40   74:iload           5
	//*  41   76:iflt            137
			{
				View view1 = ((ViewGroup) (view)).getChildAt(i);
	//   42   79:aload_0         
	//   43   80:iload           5
	//   44   82:invokevirtual   #58  <Method View ViewGroup.getChildAt(int)>
	//   45   85:astore          7
				if(!isTransformedPointInView(((ViewGroup) (view)), view1, f, f1, pointf))
					continue;
	//   46   87:aload_0         
	//   47   88:aload           7
	//   48   90:fload_1         
	//   49   91:fload_2         
	//   50   92:aload           6
	//   51   94:invokestatic    #62  <Method boolean isTransformedPointInView(ViewGroup, View, float, float, PointF)>
	//   52   97:ifeq            128
				view1 = hitTestImpl(view1, pointf.x, pointf.y, predicate, flag);
	//   53  100:aload           7
	//   54  102:aload           6
	//   55  104:getfield        #66  <Field float PointF.x>
	//   56  107:aload           6
	//   57  109:getfield        #69  <Field float PointF.y>
	//   58  112:aload_3         
	//   59  113:iload           4
	//   60  115:invokestatic    #28  <Method View hitTestImpl(View, float, float, Predicate, boolean)>
	//   61  118:astore          7
				if(view1 != null)
	//*  62  120:aload           7
	//*  63  122:ifnull          128
					return view1;
	//   64  125:aload           7
	//   65  127:areturn         
			}

	//   66  128:iload           5
	//   67  130:iconst_1        
	//   68  131:isub            
	//   69  132:istore          5
		}
	//*  70  134:goto            74
		if(flag)
	//*  71  137:iload           4
	//*  72  139:ifeq            144
			return view;
	//   73  142:aload_0         
	//   74  143:areturn         
		else
			return null;
	//   75  144:aconst_null     
	//   76  145:areturn         
	}

	private static boolean isHittable(View view)
	{
		if(view.getVisibility() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method int View.getVisibility()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		return ViewCompat.getInstance().getAlpha(view) >= 0.001F;
	//    5    9:invokestatic    #79  <Method ViewUtil$ViewCompat ViewUtil$ViewCompat.getInstance()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #83  <Method float ViewUtil$ViewCompat.getAlpha(View)>
	//    8   16:ldc1            #84  <Float 0.001F>
	//    9   18:fcmpg           
	//   10   19:ifge            24
	//   11   22:iconst_0        
	//   12   23:ireturn         
	//   13   24:iconst_1        
	//   14   25:ireturn         
	}

	public static boolean isTransformedPointInView(ViewGroup viewgroup, View view, float f, float f1, PointF pointf)
	{
		Util.throwIfNull(((Object) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #90  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNull(((Object) (view)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #90  <Method Object Util.throwIfNull(Object)>
	//    5    9:pop             
		f = (f + (float)viewgroup.getScrollX()) - (float)view.getLeft();
	//    6   10:fload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #93  <Method int ViewGroup.getScrollX()>
	//    9   15:i2f             
	//   10   16:fadd            
	//   11   17:aload_1         
	//   12   18:invokevirtual   #96  <Method int View.getLeft()>
	//   13   21:i2f             
	//   14   22:fsub            
	//   15   23:fstore_2        
		f1 = (f1 + (float)viewgroup.getScrollY()) - (float)view.getTop();
	//   16   24:fload_3         
	//   17   25:aload_0         
	//   18   26:invokevirtual   #99  <Method int ViewGroup.getScrollY()>
	//   19   29:i2f             
	//   20   30:fadd            
	//   21   31:aload_1         
	//   22   32:invokevirtual   #102 <Method int View.getTop()>
	//   23   35:i2f             
	//   24   36:fsub            
	//   25   37:fstore_3        
		boolean flag = pointInView(view, f, f1);
	//   26   38:aload_1         
	//   27   39:fload_2         
	//   28   40:fload_3         
	//   29   41:invokestatic    #39  <Method boolean pointInView(View, float, float)>
	//   30   44:istore          5
		if(flag && pointf != null)
	//*  31   46:iload           5
	//*  32   48:ifeq            63
	//*  33   51:aload           4
	//*  34   53:ifnull          63
			pointf.set(f, f1);
	//   35   56:aload           4
	//   36   58:fload_2         
	//   37   59:fload_3         
	//   38   60:invokevirtual   #106 <Method void PointF.set(float, float)>
		return flag;
	//   39   63:iload           5
	//   40   65:ireturn         
	}

	public static boolean pointInView(View view, float f, float f1)
	{
		return f >= 0.0F && f < (float)(view.getRight() - view.getLeft()) && f1 >= 0.0F && f1 < (float)(view.getBottom() - view.getTop());
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fcmpl           
	//    3    3:iflt            44
	//    4    6:fload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #109 <Method int View.getRight()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #96  <Method int View.getLeft()>
	//    9   15:isub            
	//   10   16:i2f             
	//   11   17:fcmpg           
	//   12   18:ifge            44
	//   13   21:fload_2         
	//   14   22:fconst_0        
	//   15   23:fcmpl           
	//   16   24:iflt            44
	//   17   27:fload_2         
	//   18   28:aload_0         
	//   19   29:invokevirtual   #112 <Method int View.getBottom()>
	//   20   32:aload_0         
	//   21   33:invokevirtual   #102 <Method int View.getTop()>
	//   22   36:isub            
	//   23   37:i2f             
	//   24   38:fcmpg           
	//   25   39:ifge            44
	//   26   42:iconst_1        
	//   27   43:ireturn         
	//   28   44:iconst_0        
	//   29   45:ireturn         
	}

	private static Activity tryGetActivity(Context context)
	{
		while(context != null) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
		{
			if(context instanceof Activity)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #116 <Class Activity>
	//*   4    8:ifeq            16
				return (Activity)context;
	//    5   11:aload_0         
	//    6   12:checkcast       #116 <Class Activity>
	//    7   15:areturn         
			if(context instanceof ContextWrapper)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #118 <Class ContextWrapper>
	//*  10   20:ifeq            34
				context = ((ContextWrapper)context).getBaseContext();
	//   11   23:aload_0         
	//   12   24:checkcast       #118 <Class ContextWrapper>
	//   13   27:invokevirtual   #122 <Method Context ContextWrapper.getBaseContext()>
	//   14   30:astore_0        
			else
	//*  15   31:goto            0
				return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
		}
		return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
	}

	public static Activity tryGetActivity(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Activity activity = tryGetActivity(view.getContext());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #126 <Method Context View.getContext()>
	//    6   10:invokestatic    #128 <Method Activity tryGetActivity(Context)>
	//    7   13:astore_1        
		if(activity != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          20
			return activity;
	//   10   18:aload_1         
	//   11   19:areturn         
		view = ((View) (view.getParent()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #132 <Method android.view.ViewParent View.getParent()>
	//   14   24:astore_0        
		if(view instanceof View)
	//*  15   25:aload_0         
	//*  16   26:instanceof      #72  <Class View>
	//*  17   29:ifeq            40
			return tryGetActivity((View)view);
	//   18   32:aload_0         
	//   19   33:checkcast       #72  <Class View>
	//   20   36:invokestatic    #134 <Method Activity tryGetActivity(View)>
	//   21   39:areturn         
		else
			return null;
	//   22   40:aconst_null     
	//   23   41:areturn         
	}
}
