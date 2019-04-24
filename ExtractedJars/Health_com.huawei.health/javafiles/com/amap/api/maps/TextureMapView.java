// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.amap.api.mapcore.util.*;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

// Referenced classes of package com.amap.api.maps:
//			AMap, AMapOptions

public class TextureMapView extends FrameLayout
{

	public TextureMapView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void FrameLayout(Context)>
		c = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #16  <Field int c>
		getMapFragmentDelegate().setContext(context);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    8   14:aload_1         
	//    9   15:invokeinterface #25  <Method void IMapFragmentDelegate.setContext(Context)>
	//   10   20:return          
	}

	public TextureMapView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void FrameLayout(Context, AttributeSet)>
		c = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #16  <Field int c>
		c = attributeset.getAttributeIntValue(0x10100dc, 0);
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:ldc1            #30  <Int 0x10100dc>
	//   10   15:iconst_0        
	//   11   16:invokeinterface #36  <Method int AttributeSet.getAttributeIntValue(int, int)>
	//   12   21:putfield        #16  <Field int c>
		getMapFragmentDelegate().setContext(context);
	//   13   24:aload_0         
	//   14   25:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   15   28:aload_1         
	//   16   29:invokeinterface #25  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setVisibility(c);
	//   17   34:aload_0         
	//   18   35:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   19   38:aload_0         
	//   20   39:getfield        #16  <Field int c>
	//   21   42:invokeinterface #40  <Method void IMapFragmentDelegate.setVisibility(int)>
	//   22   47:return          
	}

	public TextureMapView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #43  <Method void FrameLayout(Context, AttributeSet, int)>
		c = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #16  <Field int c>
		c = attributeset.getAttributeIntValue(0x10100dc, 0);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:ldc1            #30  <Int 0x10100dc>
	//   11   16:iconst_0        
	//   12   17:invokeinterface #36  <Method int AttributeSet.getAttributeIntValue(int, int)>
	//   13   22:putfield        #16  <Field int c>
		getMapFragmentDelegate().setContext(context);
	//   14   25:aload_0         
	//   15   26:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   16   29:aload_1         
	//   17   30:invokeinterface #25  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setVisibility(c);
	//   18   35:aload_0         
	//   19   36:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   20   39:aload_0         
	//   21   40:getfield        #16  <Field int c>
	//   22   43:invokeinterface #40  <Method void IMapFragmentDelegate.setVisibility(int)>
	//   23   48:return          
	}

	public TextureMapView(Context context, AMapOptions amapoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void FrameLayout(Context)>
		c = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #16  <Field int c>
		getMapFragmentDelegate().setContext(context);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    8   14:aload_1         
	//    9   15:invokeinterface #25  <Method void IMapFragmentDelegate.setContext(Context)>
		getMapFragmentDelegate().setOptions(amapoptions);
	//   10   20:aload_0         
	//   11   21:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//   12   24:aload_2         
	//   13   25:invokeinterface #48  <Method void IMapFragmentDelegate.setOptions(AMapOptions)>
	//   14   30:return          
	}

	public AMap getMap()
	{
		Object obj = ((Object) (getMapFragmentDelegate()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:astore_1        
		try
		{
			obj = ((Object) (((IMapFragmentDelegate) (obj)).getMap()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #55  <Method com.autonavi.amap.mapcore.interfaces.IAMap IMapFragmentDelegate.getMap()>
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
		if(b == null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #57  <Field AMap b>
	//*  16   28:ifnonnull       43
			b = new AMap(((com.autonavi.amap.mapcore.interfaces.IAMap) (obj)));
	//   17   31:aload_0         
	//   18   32:new             #59  <Class AMap>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokespecial   #62  <Method void AMap(com.autonavi.amap.mapcore.interfaces.IAMap)>
	//   22   40:putfield        #57  <Field AMap b>
		return b;
	//   23   43:aload_0         
	//   24   44:getfield        #57  <Field AMap b>
	//   25   47:areturn         
	}

	protected IMapFragmentDelegate getMapFragmentDelegate()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field IMapFragmentDelegate a>
	//*   2    4:ifnonnull       72
		{
			try
			{
				a = (IMapFragmentDelegate)hy.a(getContext(), fd.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", com/amap/api/mapcore/util/x, new Class[] {
					Integer.TYPE
				}, new Object[] {
					Integer.valueOf(1)
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #68  <Method Context getContext()>
	//    6   12:invokestatic    #74  <Method com.amap.api.mapcore.util.gy fd.e()>
	//    7   15:ldc1            #76  <String "com.amap.api.wrapper.MapFragmentDelegateWrapper">
	//    8   17:ldc1            #78  <Class x>
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:getstatic       #86  <Field Class Integer.TYPE>
	//   14   28:aastore         
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:iconst_1        
	//   20   36:invokestatic    #92  <Method Integer Integer.valueOf(int)>
	//   21   39:aastore         
	//   22   40:invokestatic    #97  <Method Object hy.a(Context, com.amap.api.mapcore.util.gy, String, Class, Class[], Object[])>
	//   23   43:checkcast       #22  <Class IMapFragmentDelegate>
	//   24   46:putfield        #64  <Field IMapFragmentDelegate a>
			}
	//*  25   49:goto            53
			catch(Throwable throwable) { }
	//   26   52:astore_1        
			if(a == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #64  <Field IMapFragmentDelegate a>
	//*  29   57:ifnonnull       72
				a = ((IMapFragmentDelegate) (new x(1)));
	//   30   60:aload_0         
	//   31   61:new             #78  <Class x>
	//   32   64:dup             
	//   33   65:iconst_1        
	//   34   66:invokespecial   #99  <Method void x(int)>
	//   35   69:putfield        #64  <Field IMapFragmentDelegate a>
		}
		return a;
	//   36   72:aload_0         
	//   37   73:getfield        #64  <Field IMapFragmentDelegate a>
	//   38   76:areturn         
	}

	public final void onCreate(Bundle bundle)
	{
		try
		{
			addView(getMapFragmentDelegate().onCreateView(((android.view.LayoutInflater) (null)), ((android.view.ViewGroup) (null)), bundle), new android.view.ViewGroup.LayoutParams(-1, -1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aload_1         
	//    6    8:invokeinterface #105 <Method android.view.View IMapFragmentDelegate.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, Bundle)>
	//    7   13:new             #107 <Class android.view.ViewGroup$LayoutParams>
	//    8   16:dup             
	//    9   17:iconst_m1       
	//   10   18:iconst_m1       
	//   11   19:invokespecial   #110 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   12   22:invokevirtual   #114 <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  14   26:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//   17   31:return          
	}

	public final void onDestroy()
	{
		try
		{
			getMapFragmentDelegate().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #121 <Method void IMapFragmentDelegate.onDestroy()>
			b = null;
	//    3    9:aload_0         
	//    4   10:aconst_null     
	//    5   11:putfield        #57  <Field AMap b>
			return;
	//    6   14:return          
		}
		catch(Throwable throwable)
	//*   7   15:astore_1        
		{
			throwable.printStackTrace();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//   10   20:return          
	}

	public final void onLowMemory()
	{
		try
		{
			getMapFragmentDelegate().onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #124 <Method void IMapFragmentDelegate.onLowMemory()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void onPause()
	{
		try
		{
			getMapFragmentDelegate().onPause();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #127 <Method void IMapFragmentDelegate.onPause()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void onResume()
	{
		try
		{
			getMapFragmentDelegate().onResume();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #130 <Method void IMapFragmentDelegate.onResume()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			getMapFragmentDelegate().onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #133 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   5   11:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #118 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #134 <Method void FrameLayout.setVisibility(int)>
		getMapFragmentDelegate().setVisibility(i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    5    9:iload_1         
	//    6   10:invokeinterface #40  <Method void IMapFragmentDelegate.setVisibility(int)>
	//    7   15:return          
	}

	private IMapFragmentDelegate a;
	private AMap b;
	private int c;
}
