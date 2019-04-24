// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.*;
import com.amap.api.mapcore.util.*;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

// Referenced classes of package com.amap.api.maps:
//			AMapOptions, AMap

public class TextureMapFragment extends Fragment
{

	public TextureMapFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Fragment()>
	//    2    4:return          
	}

	public static TextureMapFragment newInstance()
	{
		return newInstance(new AMapOptions());
	//    0    0:new             #17  <Class AMapOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void AMapOptions()>
	//    3    7:invokestatic    #21  <Method TextureMapFragment newInstance(AMapOptions)>
	//    4   10:areturn         
	}

	public static TextureMapFragment newInstance(AMapOptions amapoptions)
	{
		TextureMapFragment texturemapfragment = new TextureMapFragment();
	//    0    0:new             #2   <Class TextureMapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void TextureMapFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #26  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void Bundle()>
	//    7   15:astore_2        
		try
		{
			Parcel parcel = Parcel.obtain();
	//    8   16:invokestatic    #33  <Method Parcel Parcel.obtain()>
	//    9   19:astore_3        
			amapoptions.writeToParcel(parcel, 0);
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #37  <Method void AMapOptions.writeToParcel(Parcel, int)>
			bundle.putByteArray("MAP_OPTIONS", parcel.marshall());
	//   14   26:aload_2         
	//   15   27:ldc1            #39  <String "MAP_OPTIONS">
	//   16   29:aload_3         
	//   17   30:invokevirtual   #43  <Method byte[] Parcel.marshall()>
	//   18   33:invokevirtual   #47  <Method void Bundle.putByteArray(String, byte[])>
		}
	//*  19   36:goto            44
		// Misplaced declaration of an exception variable
		catch(AMapOptions amapoptions)
	//*  20   39:astore_0        
		{
			((Throwable) (amapoptions)).printStackTrace();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
		texturemapfragment.setArguments(bundle);
	//   23   44:aload_1         
	//   24   45:aload_2         
	//   25   46:invokevirtual   #54  <Method void setArguments(Bundle)>
		return texturemapfragment;
	//   26   49:aload_1         
	//   27   50:areturn         
	}

	public AMap getMap()
	{
		Object obj = ((Object) (getMapFragmentDelegate()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
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
	//    8   12:invokeinterface #65  <Method com.autonavi.amap.mapcore.interfaces.IAMap IMapFragmentDelegate.getMap()>
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
	//*  19   31:getfield        #67  <Field AMap a>
	//*  20   34:ifnonnull       49
			a = new AMap(((com.autonavi.amap.mapcore.interfaces.IAMap) (obj)));
	//   21   37:aload_0         
	//   22   38:new             #69  <Class AMap>
	//   23   41:dup             
	//   24   42:aload_1         
	//   25   43:invokespecial   #72  <Method void AMap(com.autonavi.amap.mapcore.interfaces.IAMap)>
	//   26   46:putfield        #67  <Field AMap a>
		return a;
	//   27   49:aload_0         
	//   28   50:getfield        #67  <Field AMap a>
	//   29   53:areturn         
	}

	protected IMapFragmentDelegate getMapFragmentDelegate()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field IMapFragmentDelegate b>
	//*   2    4:ifnonnull       85
		{
			try
			{
				b = (IMapFragmentDelegate)hy.a(((android.content.Context) (getActivity())), fd.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", com/amap/api/mapcore/util/x, new Class[] {
					Integer.TYPE
				}, new Object[] {
					Integer.valueOf(1)
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #78  <Method Activity getActivity()>
	//    6   12:invokestatic    #84  <Method com.amap.api.mapcore.util.gy fd.e()>
	//    7   15:ldc1            #86  <String "com.amap.api.wrapper.MapFragmentDelegateWrapper">
	//    8   17:ldc1            #88  <Class x>
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:getstatic       #96  <Field Class Integer.TYPE>
	//   14   28:aastore         
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:iconst_1        
	//   20   36:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   21   39:aastore         
	//   22   40:invokestatic    #107 <Method Object hy.a(android.content.Context, com.amap.api.mapcore.util.gy, String, Class, Class[], Object[])>
	//   23   43:checkcast       #62  <Class IMapFragmentDelegate>
	//   24   46:putfield        #74  <Field IMapFragmentDelegate b>
			}
	//*  25   49:goto            53
			catch(Throwable throwable) { }
	//   26   52:astore_1        
			if(b == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #74  <Field IMapFragmentDelegate b>
	//*  29   57:ifnonnull       85
			{
				b = ((IMapFragmentDelegate) (new x(1)));
	//   30   60:aload_0         
	//   31   61:new             #88  <Class x>
	//   32   64:dup             
	//   33   65:iconst_1        
	//   34   66:invokespecial   #110 <Method void x(int)>
	//   35   69:putfield        #74  <Field IMapFragmentDelegate b>
				b.setContext(((android.content.Context) (getActivity())));
	//   36   72:aload_0         
	//   37   73:getfield        #74  <Field IMapFragmentDelegate b>
	//   38   76:aload_0         
	//   39   77:invokevirtual   #78  <Method Activity getActivity()>
	//   40   80:invokeinterface #114 <Method void IMapFragmentDelegate.setContext(android.content.Context)>
			}
		}
		return b;
	//   41   85:aload_0         
	//   42   86:getfield        #74  <Field IMapFragmentDelegate b>
	//   43   89:areturn         
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method void Fragment.onAttach(Activity)>
	//    3    5:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void Fragment.onCreate(Bundle)>
		try
		{
			getMapFragmentDelegate().onCreate(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    5    9:aload_1         
	//    6   10:invokeinterface #122 <Method void IMapFragmentDelegate.onCreate(Bundle)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   8   16:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
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
	//    5    8:invokevirtual   #128 <Method Bundle getArguments()>
	//    6   11:astore          4
		layoutinflater = ((LayoutInflater) (getMapFragmentDelegate().onCreateView(layoutinflater, viewgroup, bundle1)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload           4
	//   12   21:invokeinterface #130 <Method View IMapFragmentDelegate.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   13   26:astore_1        
		return ((View) (layoutinflater));
	//   14   27:aload_1         
	//   15   28:areturn         
		layoutinflater;
	//   16   29:astore_1        
		((Throwable) (layoutinflater)).printStackTrace();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
	}

	public void onDestroy()
	{
		try
		{
			getMapFragmentDelegate().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #133 <Method void IMapFragmentDelegate.onDestroy()>
			a = null;
	//    3    9:aload_0         
	//    4   10:aconst_null     
	//    5   11:putfield        #67  <Field AMap a>
		}
	//*   6   14:goto            22
		catch(Throwable throwable)
	//*   7   17:astore_1        
		{
			throwable.printStackTrace();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #134 <Method void Fragment.onDestroy()>
	//   12   26:return          
	}

	public void onDestroyView()
	{
		try
		{
			getMapFragmentDelegate().onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:invokeinterface #137 <Method void IMapFragmentDelegate.onDestroyView()>
		}
	//*   3    9:goto            17
		catch(Throwable throwable)
	//*   4   12:astore_1        
		{
			throwable.printStackTrace();
	//    5   13:aload_1         
	//    6   14:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
		super.onDestroyView();
	//    7   17:aload_0         
	//    8   18:invokespecial   #138 <Method void Fragment.onDestroyView()>
	//    9   21:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		super.onInflate(activity, attributeset, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #142 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		try
		{
			getMapFragmentDelegate().onInflate(activity, new AMapOptions(), bundle);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    7   11:aload_1         
	//    8   12:new             #17  <Class AMapOptions>
	//    9   15:dup             
	//   10   16:invokespecial   #18  <Method void AMapOptions()>
	//   11   19:aload_3         
	//   12   20:invokeinterface #145 <Method void IMapFragmentDelegate.onInflate(Activity, AMapOptions, Bundle)>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  14   26:astore_1        
		{
			((Throwable) (activity)).printStackTrace();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
	//   17   31:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void Fragment.onLowMemory()>
		try
		{
			getMapFragmentDelegate().onLowMemory();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    4    8:invokeinterface #149 <Method void IMapFragmentDelegate.onLowMemory()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method void Fragment.onPause()>
		try
		{
			getMapFragmentDelegate().onPause();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    4    8:invokeinterface #153 <Method void IMapFragmentDelegate.onPause()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Fragment.onResume()>
		try
		{
			getMapFragmentDelegate().onResume();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    4    8:invokeinterface #157 <Method void IMapFragmentDelegate.onResume()>
			return;
	//    5   13:return          
		}
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			throwable.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
	//    9   19:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			getMapFragmentDelegate().onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #160 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
		}
	//*   4   10:goto            18
		catch(Throwable throwable)
	//*   5   13:astore_2        
		{
			throwable.printStackTrace();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #50  <Method void Throwable.printStackTrace()>
		}
		super.onSaveInstanceState(bundle);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #161 <Method void Fragment.onSaveInstanceState(Bundle)>
	//   11   23:return          
	}

	public void setArguments(Bundle bundle)
	{
		super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #162 <Method void Fragment.setArguments(Bundle)>
	//    3    5:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			getMapFragmentDelegate().setVisibility(0);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    4    8:iconst_0        
	//    5    9:invokeinterface #167 <Method void IMapFragmentDelegate.setVisibility(int)>
			return;
	//    6   14:return          
		} else
		{
			getMapFragmentDelegate().setVisibility(8);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #60  <Method IMapFragmentDelegate getMapFragmentDelegate()>
	//    9   19:bipush          8
	//   10   21:invokeinterface #167 <Method void IMapFragmentDelegate.setVisibility(int)>
			return;
	//   11   26:return          
		}
	}

	private AMap a;
	private IMapFragmentDelegate b;
}
