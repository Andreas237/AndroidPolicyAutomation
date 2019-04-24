// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.*;
import com.amap.api.mapcore.util.*;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

// Referenced classes of package com.amap.api.maps:
//			AMapOptions, AMap

public class TextureSupportMapFragment extends Fragment
{

	public TextureSupportMapFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Fragment()>
	//    2    4:return          
	}

	private IMapFragmentDelegate a()
	{
		return getMapFragmentDelegate(((Context) (getActivity())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #18  <Method android.support.v4.app.FragmentActivity getActivity()>
	//    3    5:invokevirtual   #22  <Method IMapFragmentDelegate getMapFragmentDelegate(Context)>
	//    4    8:areturn         
	}

	public static TextureSupportMapFragment newInstance()
	{
		return newInstance(new AMapOptions());
	//    0    0:new             #26  <Class AMapOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void AMapOptions()>
	//    3    7:invokestatic    #30  <Method TextureSupportMapFragment newInstance(AMapOptions)>
	//    4   10:areturn         
	}

	public static TextureSupportMapFragment newInstance(AMapOptions amapoptions)
	{
		TextureSupportMapFragment texturesupportmapfragment = new TextureSupportMapFragment();
	//    0    0:new             #2   <Class TextureSupportMapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void TextureSupportMapFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #35  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #36  <Method void Bundle()>
	//    7   15:astore_2        
		try
		{
			Parcel parcel = Parcel.obtain();
	//    8   16:invokestatic    #42  <Method Parcel Parcel.obtain()>
	//    9   19:astore_3        
			amapoptions.writeToParcel(parcel, 0);
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #46  <Method void AMapOptions.writeToParcel(Parcel, int)>
			bundle.putByteArray("MAP_OPTIONS", parcel.marshall());
	//   14   26:aload_2         
	//   15   27:ldc1            #48  <String "MAP_OPTIONS">
	//   16   29:aload_3         
	//   17   30:invokevirtual   #52  <Method byte[] Parcel.marshall()>
	//   18   33:invokevirtual   #56  <Method void Bundle.putByteArray(String, byte[])>
		}
	//*  19   36:goto            44
		// Misplaced declaration of an exception variable
		catch(AMapOptions amapoptions)
	//*  20   39:astore_0        
		{
			((Throwable) (amapoptions)).printStackTrace();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		texturesupportmapfragment.setArguments(bundle);
	//   23   44:aload_1         
	//   24   45:aload_2         
	//   25   46:invokevirtual   #63  <Method void setArguments(Bundle)>
		return texturesupportmapfragment;
	//   26   49:aload_1         
	//   27   50:areturn         
	}

	public AMap getMap()
	{
		Object obj = ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			obj = ((Object) (((IMapFragmentDelegate) (obj)).getMap()));
	//    7   11:aload_1         
	//    8   12:invokeinterface #72  <Method com.autonavi.amap.mapcore.interfaces.IAMap IMapFragmentDelegate.getMap()>
	//    9   17:astore_1        
		}
	//*  10   18:goto            24
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  11   21:astore_1        
		{
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		if(obj == null)
	//*  14   24:aload_1         
	//*  15   25:ifnonnull       30
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
		if(a == null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #74  <Field AMap a>
	//*  20   34:ifnonnull       49
			a = new AMap(((com.autonavi.amap.mapcore.interfaces.IAMap) (obj)));
	//   21   37:aload_0         
	//   22   38:new             #76  <Class AMap>
	//   23   41:dup             
	//   24   42:aload_1         
	//   25   43:invokespecial   #79  <Method void AMap(com.autonavi.amap.mapcore.interfaces.IAMap)>
	//   26   46:putfield        #74  <Field AMap a>
		return a;
	//   27   49:aload_0         
	//   28   50:getfield        #74  <Field AMap a>
	//   29   53:areturn         
	}

	protected IMapFragmentDelegate getMapFragmentDelegate(Context context)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field IMapFragmentDelegate b>
	//*   2    4:ifnonnull       79
		{
			try
			{
				b = (IMapFragmentDelegate)hy.a(context, fd.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", com/amap/api/mapcore/util/x, new Class[] {
					Integer.TYPE
				}, new Object[] {
					Integer.valueOf(1)
				});
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #87  <Method com.amap.api.mapcore.util.gy fd.e()>
	//    6   12:ldc1            #89  <String "com.amap.api.wrapper.MapFragmentDelegateWrapper">
	//    7   14:ldc1            #91  <Class x>
	//    8   16:iconst_1        
	//    9   17:anewarray       Class[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:getstatic       #99  <Field Class Integer.TYPE>
	//   13   25:aastore         
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:iconst_1        
	//   19   33:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   20   36:aastore         
	//   21   37:invokestatic    #110 <Method Object hy.a(Context, com.amap.api.mapcore.util.gy, String, Class, Class[], Object[])>
	//   22   40:checkcast       #69  <Class IMapFragmentDelegate>
	//   23   43:putfield        #81  <Field IMapFragmentDelegate b>
			}
	//*  24   46:goto            50
			catch(Throwable throwable) { }
	//   25   49:astore_2        
			if(b == null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #81  <Field IMapFragmentDelegate b>
	//*  28   54:ifnonnull       79
			{
				b = ((IMapFragmentDelegate) (new x(1)));
	//   29   57:aload_0         
	//   30   58:new             #91  <Class x>
	//   31   61:dup             
	//   32   62:iconst_1        
	//   33   63:invokespecial   #113 <Method void x(int)>
	//   34   66:putfield        #81  <Field IMapFragmentDelegate b>
				b.setContext(context);
	//   35   69:aload_0         
	//   36   70:getfield        #81  <Field IMapFragmentDelegate b>
	//   37   73:aload_1         
	//   38   74:invokeinterface #117 <Method void IMapFragmentDelegate.setContext(Context)>
			}
		}
		return b;
	//   39   79:aload_0         
	//   40   80:getfield        #81  <Field IMapFragmentDelegate b>
	//   41   83:areturn         
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void Fragment.onAttach(Activity)>
	//    3    5:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method void Fragment.onCreate(Bundle)>
	//    3    5:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		Bundle bundle1;
		bundle1 = bundle;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(bundle != null)
			break MISSING_BLOCK_LABEL_13;
	//    2    3:aload_3         
	//    3    4:ifnonnull       13
		bundle1 = getArguments();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #130 <Method Bundle getArguments()>
	//    6   11:astore          4
		layoutinflater = ((LayoutInflater) (a().onCreateView(layoutinflater, viewgroup, bundle1)));
	//    7   13:aload_0         
	//    8   14:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload           4
	//   12   21:invokeinterface #132 <Method View IMapFragmentDelegate.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   13   26:astore_1        
		return ((View) (layoutinflater));
	//   14   27:aload_1         
	//   15   28:areturn         
		layoutinflater;
	//   16   29:astore_1        
		((Throwable) (layoutinflater)).printStackTrace();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
	}

	public void onDestroy()
	{
		try
		{
			a().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    2    4:invokeinterface #135 <Method void IMapFragmentDelegate.onDestroy()>
			a = null;
	//    3    9:aload_0         
	//    4   10:aconst_null     
	//    5   11:putfield        #74  <Field AMap a>
		}
	//*   6   14:goto            22
		catch(Throwable throwable)
	//*   7   17:astore_1        
		{
			throwable.printStackTrace();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #136 <Method void Fragment.onDestroy()>
	//   12   26:return          
	}

	public void onDestroyView()
	{
		try
		{
			a().onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    2    4:invokeinterface #139 <Method void IMapFragmentDelegate.onDestroyView()>
		}
	//*   3    9:goto            17
		catch(Throwable throwable)
	//*   4   12:astore_1        
		{
			throwable.printStackTrace();
	//    5   13:aload_1         
	//    6   14:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		super.onDestroyView();
	//    7   17:aload_0         
	//    8   18:invokespecial   #140 <Method void Fragment.onDestroyView()>
	//    9   21:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		super.onInflate(activity, attributeset, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #144 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		try
		{
			getMapFragmentDelegate(((Context) (activity))).onInflate(activity, new AMapOptions(), bundle);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #22  <Method IMapFragmentDelegate getMapFragmentDelegate(Context)>
	//    8   12:aload_1         
	//    9   13:new             #26  <Class AMapOptions>
	//   10   16:dup             
	//   11   17:invokespecial   #27  <Method void AMapOptions()>
	//   12   20:aload_3         
	//   13   21:invokeinterface #147 <Method void IMapFragmentDelegate.onInflate(Activity, AMapOptions, Bundle)>
			return;
	//   14   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  15   27:astore_1        
		{
			((Throwable) (activity)).printStackTrace();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   18   32:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void Fragment.onLowMemory()>
		try
		{
			a().onLowMemory();
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    4    8:invokeinterface #151 <Method void IMapFragmentDelegate.onLowMemory()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void Fragment.onPause()>
		try
		{
			a().onPause();
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    4    8:invokeinterface #155 <Method void IMapFragmentDelegate.onPause()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void Fragment.onResume()>
		try
		{
			a().onResume();
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    4    8:invokeinterface #159 <Method void IMapFragmentDelegate.onResume()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			a().onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #162 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
		}
	//*   4   10:goto            18
		catch(Throwable throwable)
	//*   5   13:astore_2        
		{
			throwable.printStackTrace();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		super.onSaveInstanceState(bundle);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #163 <Method void Fragment.onSaveInstanceState(Bundle)>
	//   11   23:return          
	}

	public void setArguments(Bundle bundle)
	{
		try
		{
			super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #164 <Method void Fragment.setArguments(Bundle)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   4    6:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    7   11:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		super.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #168 <Method void Fragment.setUserVisibleHint(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            20
		{
			a().setVisibility(0);
	//    5    9:aload_0         
	//    6   10:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//    7   13:iconst_0        
	//    8   14:invokeinterface #171 <Method void IMapFragmentDelegate.setVisibility(int)>
			return;
	//    9   19:return          
		} else
		{
			a().setVisibility(8);
	//   10   20:aload_0         
	//   11   21:invokespecial   #67  <Method IMapFragmentDelegate a()>
	//   12   24:bipush          8
	//   13   26:invokeinterface #171 <Method void IMapFragmentDelegate.setVisibility(int)>
			return;
	//   14   31:return          
		}
	}

	private AMap a;
	private IMapFragmentDelegate b;
}
