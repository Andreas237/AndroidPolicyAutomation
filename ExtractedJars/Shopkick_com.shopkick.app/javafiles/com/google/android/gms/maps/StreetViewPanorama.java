// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

// Referenced classes of package com.google.android.gms.maps:
//			zzae, zzad, zzaf, zzag

public class StreetViewPanorama
{
	public static interface OnStreetViewPanoramaCameraChangeListener
	{

		public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera);
	}

	public static interface OnStreetViewPanoramaChangeListener
	{

		public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation);
	}

	public static interface OnStreetViewPanoramaClickListener
	{

		public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
	}

	public static interface OnStreetViewPanoramaLongClickListener
	{

		public abstract void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
	}


	public StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbn = (IStreetViewPanoramaDelegate)Preconditions.checkNotNull(((Object) (istreetviewpanoramadelegate)), "delegate");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #26  <String "delegate">
	//    5    8:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    6   11:checkcast       #34  <Class IStreetViewPanoramaDelegate>
	//    7   14:putfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    8   17:return          
	}

	public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
	{
		try
		{
			zzbn.animateTo(streetviewpanoramacamera, l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #44  <Method void IStreetViewPanoramaDelegate.animateTo(StreetViewPanoramaCamera, long)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(StreetViewPanoramaCamera streetviewpanoramacamera)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (streetviewpanoramacamera)));
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public StreetViewPanoramaLocation getLocation()
	{
		StreetViewPanoramaLocation streetviewpanoramalocation;
		try
		{
			streetviewpanoramalocation = zzbn.getStreetViewPanoramaLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #54  <Method StreetViewPanoramaLocation IStreetViewPanoramaDelegate.getStreetViewPanoramaLocation()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return streetviewpanoramalocation;
	}

	public StreetViewPanoramaCamera getPanoramaCamera()
	{
		StreetViewPanoramaCamera streetviewpanoramacamera;
		try
		{
			streetviewpanoramacamera = zzbn.getPanoramaCamera();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #58  <Method StreetViewPanoramaCamera IStreetViewPanoramaDelegate.getPanoramaCamera()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return streetviewpanoramacamera;
	}

	public boolean isPanningGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbn.isPanningGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #62  <Method boolean IStreetViewPanoramaDelegate.isPanningGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isStreetNamesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbn.isStreetNamesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #65  <Method boolean IStreetViewPanoramaDelegate.isStreetNamesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isUserNavigationEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbn.isUserNavigationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #68  <Method boolean IStreetViewPanoramaDelegate.isUserNavigationEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isZoomGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbn.isZoomGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:invokeinterface #71  <Method boolean IStreetViewPanoramaDelegate.isZoomGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public Point orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		try
		{
			streetviewpanoramaorientation = ((StreetViewPanoramaOrientation) (zzbn.orientationToPoint(streetviewpanoramaorientation)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #76  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaDelegate.orientationToPoint(StreetViewPanoramaOrientation)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:aconst_null     
	//*   8   16:areturn         
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #82  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  11   21:checkcast       #84  <Class Point>
	//*  12   24:astore_1        
	//*  13   25:aload_1         
	//*  14   26:areturn         
		// Misplaced declaration of an exception variable
		catch(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	//*  15   27:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (streetviewpanoramaorientation)));
	//   16   28:new             #46  <Class RuntimeRemoteException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   20   36:athrow          
		}
		if(streetviewpanoramaorientation == null)
			return null;
		streetviewpanoramaorientation = ((StreetViewPanoramaOrientation) ((Point)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (streetviewpanoramaorientation)))));
		return ((Point) (streetviewpanoramaorientation));
	}

	public StreetViewPanoramaOrientation pointToOrientation(Point point)
	{
		try
		{
			point = ((Point) (zzbn.pointToOrientation(ObjectWrapper.wrap(((Object) (point))))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:invokestatic    #90  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #93  <Method StreetViewPanoramaOrientation IStreetViewPanoramaDelegate.pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   13:astore_1        
		}
	//*   6   14:aload_1         
	//*   7   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Point point)
	//*   8   16:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (point)));
	//    9   17:new             #46  <Class RuntimeRemoteException>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   13   25:athrow          
		}
		return ((StreetViewPanoramaOrientation) (point));
	}

	public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
	{
		if(onstreetviewpanoramacamerachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzbn.setOnStreetViewPanoramaCameraChangeListener(((com.google.android.gms.maps.internal.zzbh) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #98  <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzbh)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//*   9   19:new             #100 <Class zzae>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #103 <Method void zzae(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener)>
	//*  14   28:invokeinterface #98  <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzbh)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramacamerachangelistener)));
	//   17   35:new             #46  <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzbn.setOnStreetViewPanoramaCameraChangeListener(((com.google.android.gms.maps.internal.zzbh) (new zzae(this, onstreetviewpanoramacamerachangelistener))));
		return;
	}

	public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
	{
		if(onstreetviewpanoramachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzbn.setOnStreetViewPanoramaChangeListener(((com.google.android.gms.maps.internal.zzbj) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #108 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzbj)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//*   9   19:new             #110 <Class zzad>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #113 <Method void zzad(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaChangeListener)>
	//*  14   28:invokeinterface #108 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzbj)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramachangelistener)));
	//   17   35:new             #46  <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzbn.setOnStreetViewPanoramaChangeListener(((com.google.android.gms.maps.internal.zzbj) (new zzad(this, onstreetviewpanoramachangelistener))));
		return;
	}

	public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
	{
		if(onstreetviewpanoramaclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzbn.setOnStreetViewPanoramaClickListener(((com.google.android.gms.maps.internal.zzbl) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #118 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzbl)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//*   9   19:new             #120 <Class zzaf>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #123 <Method void zzaf(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaClickListener)>
	//*  14   28:invokeinterface #118 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzbl)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramaclicklistener)));
	//   17   35:new             #46  <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzbn.setOnStreetViewPanoramaClickListener(((com.google.android.gms.maps.internal.zzbl) (new zzaf(this, onstreetviewpanoramaclicklistener))));
		return;
	}

	public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
	{
		if(onstreetviewpanoramalongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzbn.setOnStreetViewPanoramaLongClickListener(((com.google.android.gms.maps.internal.zzbn) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #128 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzbn)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//*   9   19:new             #130 <Class zzag>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #133 <Method void zzag(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaLongClickListener)>
	//*  14   28:invokeinterface #128 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzbn)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramalongclicklistener)));
	//   17   35:new             #46  <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzbn.setOnStreetViewPanoramaLongClickListener(((com.google.android.gms.maps.internal.zzbn) (new zzag(this, onstreetviewpanoramalongclicklistener))));
		return;
	}

	public void setPanningGesturesEnabled(boolean flag)
	{
		try
		{
			zzbn.enablePanning(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #138 <Method void IStreetViewPanoramaDelegate.enablePanning(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setPosition(LatLng latlng)
	{
		try
		{
			zzbn.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #142 <Method void IStreetViewPanoramaDelegate.setPosition(LatLng)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setPosition(LatLng latlng, int i)
	{
		try
		{
			zzbn.setPositionWithRadius(latlng, i);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #146 <Method void IStreetViewPanoramaDelegate.setPositionWithRadius(LatLng, int)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public void setPosition(LatLng latlng, int i, StreetViewSource streetviewsource)
	{
		try
		{
			zzbn.setPositionWithRadiusAndSource(latlng, i, streetviewsource);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #150 <Method void IStreetViewPanoramaDelegate.setPositionWithRadiusAndSource(LatLng, int, StreetViewSource)>
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   7   13:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    8   14:new             #46  <Class RuntimeRemoteException>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   12   22:athrow          
		}
	}

	public void setPosition(LatLng latlng, StreetViewSource streetviewsource)
	{
		try
		{
			zzbn.setPositionWithSource(latlng, streetviewsource);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #154 <Method void IStreetViewPanoramaDelegate.setPositionWithSource(LatLng, StreetViewSource)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    7   13:new             #46  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public void setPosition(String s)
	{
		try
		{
			zzbn.setPositionWithID(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #158 <Method void IStreetViewPanoramaDelegate.setPositionWithID(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setStreetNamesEnabled(boolean flag)
	{
		try
		{
			zzbn.enableStreetNames(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #162 <Method void IStreetViewPanoramaDelegate.enableStreetNames(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setUserNavigationEnabled(boolean flag)
	{
		try
		{
			zzbn.enableUserNavigation(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #166 <Method void IStreetViewPanoramaDelegate.enableUserNavigation(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setZoomGesturesEnabled(boolean flag)
	{
		try
		{
			zzbn.enableZoom(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field IStreetViewPanoramaDelegate zzbn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #170 <Method void IStreetViewPanoramaDelegate.enableZoom(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #46  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #49  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	private final IStreetViewPanoramaDelegate zzbn;
}
