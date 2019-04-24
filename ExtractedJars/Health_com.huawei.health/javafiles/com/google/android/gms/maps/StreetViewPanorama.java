// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

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


	protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zzboA = (IStreetViewPanoramaDelegate)zzac.zzw(((Object) (istreetviewpanoramadelegate)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #37  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #39  <Class IStreetViewPanoramaDelegate>
	//    6   12:putfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    7   15:return          
	}

	public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
	{
		try
		{
			zzboA.animateTo(streetviewpanoramacamera, l);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #48  <Method void IStreetViewPanoramaDelegate.animateTo(StreetViewPanoramaCamera, long)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(StreetViewPanoramaCamera streetviewpanoramacamera)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (streetviewpanoramacamera)));
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public StreetViewPanoramaLocation getLocation()
	{
		StreetViewPanoramaLocation streetviewpanoramalocation;
		try
		{
			streetviewpanoramalocation = zzboA.getStreetViewPanoramaLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #58  <Method StreetViewPanoramaLocation IStreetViewPanoramaDelegate.getStreetViewPanoramaLocation()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return streetviewpanoramalocation;
	}

	public StreetViewPanoramaCamera getPanoramaCamera()
	{
		StreetViewPanoramaCamera streetviewpanoramacamera;
		try
		{
			streetviewpanoramacamera = zzboA.getPanoramaCamera();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #62  <Method StreetViewPanoramaCamera IStreetViewPanoramaDelegate.getPanoramaCamera()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return streetviewpanoramacamera;
	}

	public boolean isPanningGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboA.isPanningGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #66  <Method boolean IStreetViewPanoramaDelegate.isPanningGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isStreetNamesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboA.isStreetNamesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #69  <Method boolean IStreetViewPanoramaDelegate.isStreetNamesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isUserNavigationEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboA.isUserNavigationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #72  <Method boolean IStreetViewPanoramaDelegate.isUserNavigationEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public boolean isZoomGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboA.isZoomGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:invokeinterface #75  <Method boolean IStreetViewPanoramaDelegate.isZoomGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public Point orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		try
		{
			streetviewpanoramaorientation = ((StreetViewPanoramaOrientation) (zzboA.orientationToPoint(streetviewpanoramaorientation)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaDelegate.orientationToPoint(StreetViewPanoramaOrientation)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:aconst_null     
	//*   8   16:areturn         
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #86  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  11   21:checkcast       #88  <Class Point>
	//*  12   24:astore_1        
	//*  13   25:aload_1         
	//*  14   26:areturn         
		// Misplaced declaration of an exception variable
		catch(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	//*  15   27:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (streetviewpanoramaorientation)));
	//   16   28:new             #50  <Class RuntimeRemoteException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   20   36:athrow          
		}
		if(streetviewpanoramaorientation == null)
			return null;
		streetviewpanoramaorientation = ((StreetViewPanoramaOrientation) ((Point)zzd.zzF(((com.google.android.gms.dynamic.IObjectWrapper) (streetviewpanoramaorientation)))));
		return ((Point) (streetviewpanoramaorientation));
	}

	public StreetViewPanoramaOrientation pointToOrientation(Point point)
	{
		try
		{
			point = ((Point) (zzboA.pointToOrientation(zzd.zzA(((Object) (point))))));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:invokestatic    #94  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #97  <Method StreetViewPanoramaOrientation IStreetViewPanoramaDelegate.pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   13:astore_1        
		}
	//*   6   14:aload_1         
	//*   7   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Point point)
	//*   8   16:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (point)));
	//    9   17:new             #50  <Class RuntimeRemoteException>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   13   25:athrow          
		}
		return ((StreetViewPanoramaOrientation) (point));
	}

	public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
	{
		if(onstreetviewpanoramacamerachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzboA.setOnStreetViewPanoramaCameraChangeListener(((com.google.android.gms.maps.internal.zzab) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #102 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzab)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//*   9   21:new             #8   <Class StreetViewPanorama$2>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #105 <Method void StreetViewPanorama$2(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener)>
	//*  14   30:invokeinterface #102 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzab)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramacamerachangelistener)));
	//   17   37:new             #50  <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzboA.setOnStreetViewPanoramaCameraChangeListener(((com.google.android.gms.maps.internal.zzab) (new com.google.android.gms.maps.internal.zzab.zza(onstreetviewpanoramacamerachangelistener) {

			public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
			{
				zzboC.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzboC>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera)>
			//    4   10:return          
			}

			final OnStreetViewPanoramaCameraChangeListener zzboC;

			
			{
				zzboC = onstreetviewpanoramacamerachangelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzboC>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzab$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
	{
		if(onstreetviewpanoramachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzboA.setOnStreetViewPanoramaChangeListener(((com.google.android.gms.maps.internal.zzac) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #110 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzac)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//*   9   21:new             #6   <Class StreetViewPanorama$1>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #113 <Method void StreetViewPanorama$1(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaChangeListener)>
	//*  14   30:invokeinterface #110 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzac)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramachangelistener)));
	//   17   37:new             #50  <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzboA.setOnStreetViewPanoramaChangeListener(((com.google.android.gms.maps.internal.zzac) (new com.google.android.gms.maps.internal.zzac.zza(onstreetviewpanoramachangelistener) {

			public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
			{
				zzboB.onStreetViewPanoramaChange(streetviewpanoramalocation);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzboB>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(StreetViewPanoramaLocation)>
			//    4   10:return          
			}

			final OnStreetViewPanoramaChangeListener zzboB;

			
			{
				zzboB = onstreetviewpanoramachangelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzboB>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzac$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
	{
		if(onstreetviewpanoramaclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzboA.setOnStreetViewPanoramaClickListener(((com.google.android.gms.maps.internal.zzad) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #118 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzad)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//*   9   21:new             #10  <Class StreetViewPanorama$3>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #121 <Method void StreetViewPanorama$3(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaClickListener)>
	//*  14   30:invokeinterface #118 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzad)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramaclicklistener)));
	//   17   37:new             #50  <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzboA.setOnStreetViewPanoramaClickListener(((com.google.android.gms.maps.internal.zzad) (new com.google.android.gms.maps.internal.zzad.zza(onstreetviewpanoramaclicklistener) {

			public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
			{
				zzboD.onStreetViewPanoramaClick(streetviewpanoramaorientation);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzboD>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(StreetViewPanoramaOrientation)>
			//    4   10:return          
			}

			final OnStreetViewPanoramaClickListener zzboD;

			
			{
				zzboD = onstreetviewpanoramaclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzboD>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzad$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
	{
		if(onstreetviewpanoramalongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzboA.setOnStreetViewPanoramaLongClickListener(((com.google.android.gms.maps.internal.zzae) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #126 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzae)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//*   9   21:new             #12  <Class StreetViewPanorama$4>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #129 <Method void StreetViewPanorama$4(StreetViewPanorama, StreetViewPanorama$OnStreetViewPanoramaLongClickListener)>
	//*  14   30:invokeinterface #126 <Method void IStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzae)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramalongclicklistener)));
	//   17   37:new             #50  <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzboA.setOnStreetViewPanoramaLongClickListener(((com.google.android.gms.maps.internal.zzae) (new com.google.android.gms.maps.internal.zzae.zza(onstreetviewpanoramalongclicklistener) {

			public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
			{
				zzboE.onStreetViewPanoramaLongClick(streetviewpanoramaorientation);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaLongClickListener zzboE>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation)>
			//    4   10:return          
			}

			final OnStreetViewPanoramaLongClickListener zzboE;

			
			{
				zzboE = onstreetviewpanoramalongclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaLongClickListener zzboE>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzae$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public void setPanningGesturesEnabled(boolean flag)
	{
		try
		{
			zzboA.enablePanning(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:iload_1         
	//    3    5:invokeinterface #134 <Method void IStreetViewPanoramaDelegate.enablePanning(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setPosition(LatLng latlng)
	{
		try
		{
			zzboA.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:invokeinterface #138 <Method void IStreetViewPanoramaDelegate.setPosition(LatLng)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setPosition(LatLng latlng, int i)
	{
		try
		{
			zzboA.setPositionWithRadius(latlng, i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #142 <Method void IStreetViewPanoramaDelegate.setPositionWithRadius(LatLng, int)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    7   13:new             #50  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public void setPosition(String s)
	{
		try
		{
			zzboA.setPositionWithID(s);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:aload_1         
	//    3    5:invokeinterface #146 <Method void IStreetViewPanoramaDelegate.setPositionWithID(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setStreetNamesEnabled(boolean flag)
	{
		try
		{
			zzboA.enableStreetNames(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:iload_1         
	//    3    5:invokeinterface #150 <Method void IStreetViewPanoramaDelegate.enableStreetNames(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setUserNavigationEnabled(boolean flag)
	{
		try
		{
			zzboA.enableUserNavigation(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:iload_1         
	//    3    5:invokeinterface #154 <Method void IStreetViewPanoramaDelegate.enableUserNavigation(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setZoomGesturesEnabled(boolean flag)
	{
		try
		{
			zzboA.enableZoom(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field IStreetViewPanoramaDelegate zzboA>
	//    2    4:iload_1         
	//    3    5:invokeinterface #158 <Method void IStreetViewPanoramaDelegate.enableZoom(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #50  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	private final IStreetViewPanoramaDelegate zzboA;
}
