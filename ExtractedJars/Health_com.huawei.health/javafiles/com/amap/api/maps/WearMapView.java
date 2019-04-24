// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import com.amap.api.mapcore.util.*;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissView, AMap, AMapOptions

public class WearMapView extends ViewGroup
{
	public static interface OnDismissCallback
	{

		public abstract void onDismiss();

		public abstract void onNotifySwipe();
	}


	public WearMapView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void ViewGroup(Context)>
		a = ((Class) (com/amap/api/maps/WearMapView)).getSimpleName();
	//    3    5:aload_0         
	//    4    6:ldc1            #2   <Class WearMapView>
	//    5    8:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    6   11:putfield        #43  <Field String a>
		h = 0;
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:putfield        #45  <Field int h>
		getMapFragmentDelegate().setContext(context);
	//   10   19:aload_0         
	//   11   20:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   12   23:aload_1         
	//   13   24:invokeinterface #54  <Method void IMapFragmentDelegate.setContext(Context)>
		a(context);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokespecial   #56  <Method void a(Context)>
		b(context);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokespecial   #58  <Method void b(Context)>
	//   20   39:return          
	}

	public WearMapView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #61  <Method void ViewGroup(Context, AttributeSet)>
		a = ((Class) (com/amap/api/maps/WearMapView)).getSimpleName();
	//    4    6:aload_0         
	//    5    7:ldc1            #2   <Class WearMapView>
	//    6    9:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    7   12:putfield        #43  <Field String a>
		h = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #45  <Field int h>
		h = attributeset.getAttributeIntValue(0x10100dc, 0);
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:ldc1            #62  <Int 0x10100dc>
	//   14   24:iconst_0        
	//   15   25:invokeinterface #68  <Method int AttributeSet.getAttributeIntValue(int, int)>
	//   16   30:putfield        #45  <Field int h>
		getMapFragmentDelegate().setContext(context);
	//   17   33:aload_0         
	//   18   34:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   19   37:aload_1         
	//   20   38:invokeinterface #54  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setVisibility(h);
	//   21   43:aload_0         
	//   22   44:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   23   47:aload_0         
	//   24   48:getfield        #45  <Field int h>
	//   25   51:invokeinterface #72  <Method void IMapFragmentDelegate.setVisibility(int)>
		a(context);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:invokespecial   #56  <Method void a(Context)>
		b(context);
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokespecial   #58  <Method void b(Context)>
	//   32   66:return          
	}

	public WearMapView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #75  <Method void ViewGroup(Context, AttributeSet, int)>
		a = ((Class) (com/amap/api/maps/WearMapView)).getSimpleName();
	//    5    7:aload_0         
	//    6    8:ldc1            #2   <Class WearMapView>
	//    7   10:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    8   13:putfield        #43  <Field String a>
		h = 0;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #45  <Field int h>
		h = attributeset.getAttributeIntValue(0x10100dc, 0);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:ldc1            #62  <Int 0x10100dc>
	//   15   25:iconst_0        
	//   16   26:invokeinterface #68  <Method int AttributeSet.getAttributeIntValue(int, int)>
	//   17   31:putfield        #45  <Field int h>
		getMapFragmentDelegate().setContext(context);
	//   18   34:aload_0         
	//   19   35:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   20   38:aload_1         
	//   21   39:invokeinterface #54  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setVisibility(h);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   24   48:aload_0         
	//   25   49:getfield        #45  <Field int h>
	//   26   52:invokeinterface #72  <Method void IMapFragmentDelegate.setVisibility(int)>
		a(context);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #56  <Method void a(Context)>
		b(context);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokespecial   #58  <Method void b(Context)>
	//   33   67:return          
	}

	public WearMapView(Context context, AMapOptions amapoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void ViewGroup(Context)>
		a = ((Class) (com/amap/api/maps/WearMapView)).getSimpleName();
	//    3    5:aload_0         
	//    4    6:ldc1            #2   <Class WearMapView>
	//    5    8:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    6   11:putfield        #43  <Field String a>
		h = 0;
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:putfield        #45  <Field int h>
		getMapFragmentDelegate().setContext(context);
	//   10   19:aload_0         
	//   11   20:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   12   23:aload_1         
	//   13   24:invokeinterface #54  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setOptions(amapoptions);
	//   14   29:aload_0         
	//   15   30:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   16   33:aload_2         
	//   17   34:invokeinterface #80  <Method void IMapFragmentDelegate.setOptions(AMapOptions)>
		a(context);
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokespecial   #56  <Method void a(Context)>
		b(context);
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:invokespecial   #58  <Method void b(Context)>
	//   24   49:return          
	}

	private void a(Context context)
	{
		context = ((Context) ((WindowManager)context.getSystemService("window")));
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "window">
	//    2    3:invokevirtual   #88  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #90  <Class WindowManager>
	//    4    9:astore_1        
		if(context != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          52
		{
			context = ((Context) (((WindowManager) (context)).getDefaultDisplay()));
	//    7   14:aload_1         
	//    8   15:invokeinterface #94  <Method Display WindowManager.getDefaultDisplay()>
	//    9   20:astore_1        
			Point point = new Point();
	//   10   21:new             #96  <Class Point>
	//   11   24:dup             
	//   12   25:invokespecial   #98  <Method void Point()>
	//   13   28:astore_2        
			if(context != null)
	//*  14   29:aload_1         
	//*  15   30:ifnull          38
				((Display) (context)).getSize(point);
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:invokevirtual   #104 <Method void Display.getSize(Point)>
			f = point.x;
	//   19   38:aload_2         
	//   20   39:getfield        #107 <Field int Point.x>
	//   21   42:putstatic       #28  <Field int f>
			g = point.y;
	//   22   45:aload_2         
	//   23   46:getfield        #110 <Field int Point.y>
	//   24   49:putstatic       #30  <Field int g>
		}
	//   25   52:return          
	}

	private void a(View view)
	{
		android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          5
		android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
	//    3    6:aload           5
	//    4    8:astore          4
		if(layoutparams1 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       28
			layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
	//    7   15:new             #119 <Class android.view.ViewGroup$LayoutParams>
	//    8   18:dup             
	//    9   19:bipush          -2
	//   10   21:bipush          -2
	//   11   23:invokespecial   #122 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   12   26:astore          4
		int i = layoutparams.width;
	//   13   28:aload           4
	//   14   30:getfield        #125 <Field int android.view.ViewGroup$LayoutParams.width>
	//   15   33:istore_2        
		if(i > 0)
	//*  16   34:iload_2         
	//*  17   35:ifle            48
			i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//   18   38:iload_2         
	//   19   39:ldc1            #126 <Int 0x40000000>
	//   20   41:invokestatic    #131 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   44:istore_2        
		else
	//*  22   45:goto            54
			i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   23   48:iconst_0        
	//   24   49:iconst_0        
	//   25   50:invokestatic    #131 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   53:istore_2        
		int j = layoutparams.height;
	//   27   54:aload           4
	//   28   56:getfield        #134 <Field int android.view.ViewGroup$LayoutParams.height>
	//   29   59:istore_3        
		if(j > 0)
	//*  30   60:iload_3         
	//*  31   61:ifle            74
			j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//   32   64:iload_3         
	//   33   65:ldc1            #126 <Int 0x40000000>
	//   34   67:invokestatic    #131 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   35   70:istore_3        
		else
	//*  36   71:goto            80
			j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   37   74:iconst_0        
	//   38   75:iconst_0        
	//   39   76:invokestatic    #131 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   40   79:istore_3        
		view.measure(i, j);
	//   41   80:aload_1         
	//   42   81:iload_2         
	//   43   82:iload_3         
	//   44   83:invokevirtual   #137 <Method void View.measure(int, int)>
	//   45   86:return          
	}

	private void b(Context context)
	{
		e = new SwipeDismissView(context, ((View) (this)));
	//    0    0:aload_0         
	//    1    1:new             #139 <Class SwipeDismissView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokespecial   #142 <Method void SwipeDismissView(Context, View)>
	//    6   10:putfield        #144 <Field SwipeDismissView e>
		context = ((Context) (new android.view.ViewGroup.LayoutParams((int)(context.getResources().getDisplayMetrics().density * 30F + 0.5F), g)));
	//    7   13:new             #119 <Class android.view.ViewGroup$LayoutParams>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #148 <Method Resources Context.getResources()>
	//   11   21:invokevirtual   #154 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   12   24:getfield        #160 <Field float DisplayMetrics.density>
	//   13   27:ldc1            #161 <Float 30F>
	//   14   29:fmul            
	//   15   30:ldc1            #162 <Float 0.5F>
	//   16   32:fadd            
	//   17   33:f2i             
	//   18   34:getstatic       #30  <Field int g>
	//   19   37:invokespecial   #122 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   20   40:astore_1        
		e.setBackgroundColor(Color.argb(0, 0, 0, 0));
	//   21   41:aload_0         
	//   22   42:getfield        #144 <Field SwipeDismissView e>
	//   23   45:iconst_0        
	//   24   46:iconst_0        
	//   25   47:iconst_0        
	//   26   48:iconst_0        
	//   27   49:invokestatic    #168 <Method int Color.argb(int, int, int, int)>
	//   28   52:invokevirtual   #171 <Method void SwipeDismissView.setBackgroundColor(int)>
		setBackgroundColor(Color.argb(0, 0, 0, 0));
	//   29   55:aload_0         
	//   30   56:iconst_0        
	//   31   57:iconst_0        
	//   32   58:iconst_0        
	//   33   59:iconst_0        
	//   34   60:invokestatic    #168 <Method int Color.argb(int, int, int, int)>
	//   35   63:invokevirtual   #172 <Method void setBackgroundColor(int)>
		addView(((View) (e)), ((android.view.ViewGroup.LayoutParams) (context)));
	//   36   66:aload_0         
	//   37   67:aload_0         
	//   38   68:getfield        #144 <Field SwipeDismissView e>
	//   39   71:aload_1         
	//   40   72:invokevirtual   #176 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   41   75:return          
	}

	public AMap getMap()
	{
		Object obj = ((Object) (getMapFragmentDelegate()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:astore_1        
		try
		{
			obj = ((Object) (((IMapFragmentDelegate) (obj)).getMap()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #183 <Method com.autonavi.amap.mapcore.interfaces.IAMap IMapFragmentDelegate.getMap()>
	//    5   11:astore_1        
		}
	//*   6   12:goto            18
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   15:astore_1        
		{
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		if(obj == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		if(c == null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #185 <Field AMap c>
	//*  16   28:ifnonnull       43
			c = new AMap(((com.autonavi.amap.mapcore.interfaces.IAMap) (obj)));
	//   17   31:aload_0         
	//   18   32:new             #187 <Class AMap>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokespecial   #190 <Method void AMap(com.autonavi.amap.mapcore.interfaces.IAMap)>
	//   22   40:putfield        #185 <Field AMap c>
		return c;
	//   23   43:aload_0         
	//   24   44:getfield        #185 <Field AMap c>
	//   25   47:areturn         
	}

	protected IMapFragmentDelegate getMapFragmentDelegate()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field IMapFragmentDelegate b>
	//*   2    4:ifnonnull       72
		{
			try
			{
				b = (IMapFragmentDelegate)hy.a(getContext(), fd.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", com/amap/api/mapcore/util/x, new Class[] {
					Integer.TYPE
				}, new Object[] {
					Integer.valueOf(1)
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #196 <Method Context getContext()>
	//    6   12:invokestatic    #201 <Method com.amap.api.mapcore.util.gy fd.e()>
	//    7   15:ldc1            #203 <String "com.amap.api.wrapper.MapFragmentDelegateWrapper">
	//    8   17:ldc1            #205 <Class x>
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:getstatic       #211 <Field Class Integer.TYPE>
	//   14   28:aastore         
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:iconst_1        
	//   20   36:invokestatic    #217 <Method Integer Integer.valueOf(int)>
	//   21   39:aastore         
	//   22   40:invokestatic    #222 <Method Object hy.a(Context, com.amap.api.mapcore.util.gy, String, Class, Class[], Object[])>
	//   23   43:checkcast       #51  <Class IMapFragmentDelegate>
	//   24   46:putfield        #192 <Field IMapFragmentDelegate b>
			}
	//*  25   49:goto            53
			catch(Throwable throwable) { }
	//   26   52:astore_1        
			if(b == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #192 <Field IMapFragmentDelegate b>
	//*  29   57:ifnonnull       72
				b = ((IMapFragmentDelegate) (new x(1)));
	//   30   60:aload_0         
	//   31   61:new             #205 <Class x>
	//   32   64:dup             
	//   33   65:iconst_1        
	//   34   66:invokespecial   #224 <Method void x(int)>
	//   35   69:putfield        #192 <Field IMapFragmentDelegate b>
		}
		return b;
	//   36   72:aload_0         
	//   37   73:getfield        #192 <Field IMapFragmentDelegate b>
	//   38   76:areturn         
	}

	public final void onCreate(Bundle bundle)
	{
		try
		{
			d = getMapFragmentDelegate().onCreateView(((android.view.LayoutInflater) (null)), ((ViewGroup) (null)), bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aload_1         
	//    6    8:invokeinterface #230 <Method View IMapFragmentDelegate.onCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//    7   13:putfield        #232 <Field View d>
			bundle = ((Bundle) (new android.view.ViewGroup.LayoutParams(-1, -1)));
	//    8   16:new             #119 <Class android.view.ViewGroup$LayoutParams>
	//    9   19:dup             
	//   10   20:iconst_m1       
	//   11   21:iconst_m1       
	//   12   22:invokespecial   #122 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   13   25:astore_1        
			addView(d, 0, ((android.view.ViewGroup.LayoutParams) (bundle)));
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #232 <Field View d>
	//   17   31:iconst_0        
	//   18   32:aload_1         
	//   19   33:invokevirtual   #235 <Method void addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   20   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  21   37:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//   22   38:aload_1         
	//   23   39:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//   24   42:return          
	}

	public final void onDestroy()
	{
		try
		{
			getMapFragmentDelegate().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #241 <Method void IMapFragmentDelegate.onDestroy()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public void onDismiss()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method void removeAllViews()>
	//    2    4:return          
	}

	public void onEnterAmbient(Bundle bundle)
	{
		onResume();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method void onResume()>
	//    2    4:return          
	}

	public void onExitAmbient()
	{
		onPause();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method void onPause()>
	//    2    4:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:istore_3        
		for(i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          92
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #263 <Method View getChildAt(int)>
	//   11   17:astore          6
			if(view == d)
	//*  12   19:aload           6
	//*  13   21:aload_0         
	//*  14   22:getfield        #232 <Field View d>
	//*  15   25:if_acmpne       46
			{
				view.layout(0, 0, getWidth(), getHeight());
	//   16   28:aload           6
	//   17   30:iconst_0        
	//   18   31:iconst_0        
	//   19   32:aload_0         
	//   20   33:invokevirtual   #266 <Method int getWidth()>
	//   21   36:aload_0         
	//   22   37:invokevirtual   #269 <Method int getHeight()>
	//   23   40:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
				continue;
	//   24   43:goto            85
			}
			if(view == e)
	//*  25   46:aload           6
	//*  26   48:aload_0         
	//*  27   49:getfield        #144 <Field SwipeDismissView e>
	//*  28   52:if_acmpne       85
			{
				a(((View) (e)));
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #144 <Field SwipeDismissView e>
	//   32   60:invokespecial   #275 <Method void a(View)>
				l = e.getMeasuredWidth();
	//   33   63:aload_0         
	//   34   64:getfield        #144 <Field SwipeDismissView e>
	//   35   67:invokevirtual   #278 <Method int SwipeDismissView.getMeasuredWidth()>
	//   36   70:istore          5
				e.layout(0, 0, l, k);
	//   37   72:aload_0         
	//   38   73:getfield        #144 <Field SwipeDismissView e>
	//   39   76:iconst_0        
	//   40   77:iconst_0        
	//   41   78:iload           5
	//   42   80:iload           4
	//   43   82:invokevirtual   #279 <Method void SwipeDismissView.layout(int, int, int, int)>
			}
		}

	//   44   85:iload_2         
	//   45   86:iconst_1        
	//   46   87:iadd            
	//   47   88:istore_2        
	//*  48   89:goto            7
	//   49   92:return          
	}

	public final void onLowMemory()
	{
		try
		{
			getMapFragmentDelegate().onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #282 <Method void IMapFragmentDelegate.onLowMemory()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:istore          4
		for(int k = 0; k < l; k++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          74
		{
			View view = getChildAt(k);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #263 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(view instanceof SwipeDismissView)
	//*  12   21:aload           5
	//*  13   23:instanceof      #139 <Class SwipeDismissView>
	//*  14   26:ifeq            60
			{
				SwipeDismissView swipedismissview = (SwipeDismissView)view;
	//   15   29:aload           5
	//   16   31:checkcast       #139 <Class SwipeDismissView>
	//   17   34:astore          6
				view.measure(swipedismissview.getLayoutParams().width, swipedismissview.getLayoutParams().height);
	//   18   36:aload           5
	//   19   38:aload           6
	//   20   40:invokevirtual   #284 <Method android.view.ViewGroup$LayoutParams SwipeDismissView.getLayoutParams()>
	//   21   43:getfield        #125 <Field int android.view.ViewGroup$LayoutParams.width>
	//   22   46:aload           6
	//   23   48:invokevirtual   #284 <Method android.view.ViewGroup$LayoutParams SwipeDismissView.getLayoutParams()>
	//   24   51:getfield        #134 <Field int android.view.ViewGroup$LayoutParams.height>
	//   25   54:invokevirtual   #137 <Method void View.measure(int, int)>
			} else
	//*  26   57:goto            67
			{
				view.measure(i, j);
	//   27   60:aload           5
	//   28   62:iload_1         
	//   29   63:iload_2         
	//   30   64:invokevirtual   #137 <Method void View.measure(int, int)>
			}
		}

	//   31   67:iload_3         
	//   32   68:iconst_1        
	//   33   69:iadd            
	//   34   70:istore_3        
	//*  35   71:goto            8
		super.onMeasure(i, j);
	//   36   74:aload_0         
	//   37   75:iload_1         
	//   38   76:iload_2         
	//   39   77:invokespecial   #286 <Method void ViewGroup.onMeasure(int, int)>
	//   40   80:return          
	}

	public final void onPause()
	{
		try
		{
			getMapFragmentDelegate().onPause();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #287 <Method void IMapFragmentDelegate.onPause()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void onResume()
	{
		try
		{
			getMapFragmentDelegate().onResume();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #288 <Method void IMapFragmentDelegate.onResume()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			getMapFragmentDelegate().onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #291 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   5   11:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setLayerType(int i, Paint paint)
	{
	//    0    0:return          
	}

	public void setOnDismissCallbackListener(OnDismissCallback ondismisscallback)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field SwipeDismissView e>
	//*   2    4:ifnull          15
			e.setCallback(ondismisscallback);
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field SwipeDismissView e>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #298 <Method void SwipeDismissView.setCallback(WearMapView$OnDismissCallback)>
	//    7   15:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #299 <Method void ViewGroup.setVisibility(int)>
		getMapFragmentDelegate().setVisibility(i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #49  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    5    9:iload_1         
	//    6   10:invokeinterface #72  <Method void IMapFragmentDelegate.setVisibility(int)>
	//    7   15:return          
	}

	private static int f = 0;
	private static int g = 0;
	private final String a;
	private IMapFragmentDelegate b;
	private AMap c;
	private View d;
	private SwipeDismissView e;
	private int h;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #28  <Field int f>
	//    2    4:iconst_0        
	//    3    5:putstatic       #30  <Field int g>
	//*   4    8:return          
	}
}
