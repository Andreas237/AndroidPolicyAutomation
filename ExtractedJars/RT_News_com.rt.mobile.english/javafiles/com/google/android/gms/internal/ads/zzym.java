// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzya, zzon, zzlo, zzpw, 
//			zzps

public final class zzym extends zzya
{

	public zzym(NativeAppInstallAdMapper nativeappinstalladmapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzya()>
		zzbuy = nativeappinstalladmapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    5    9:return          
	}

	public final String getBody()
	{
		return zzbuy.getBody();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #21  <Method String NativeAppInstallAdMapper.getBody()>
	//    3    7:areturn         
	}

	public final String getCallToAction()
	{
		return zzbuy.getCallToAction();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #24  <Method String NativeAppInstallAdMapper.getCallToAction()>
	//    3    7:areturn         
	}

	public final Bundle getExtras()
	{
		return ((NativeAdMapper) (zzbuy)).getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #30  <Method Bundle NativeAdMapper.getExtras()>
	//    3    7:areturn         
	}

	public final String getHeadline()
	{
		return zzbuy.getHeadline();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #33  <Method String NativeAppInstallAdMapper.getHeadline()>
	//    3    7:areturn         
	}

	public final List getImages()
	{
		Object obj = ((Object) (zzbuy.getImages()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #37  <Method List NativeAppInstallAdMapper.getImages()>
	//    3    7:astore_2        
		if(obj != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          77
		{
			ArrayList arraylist = new ArrayList();
	//    6   12:new             #39  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #40  <Method void ArrayList()>
	//    9   19:astore_1        
			com.google.android.gms.ads.formats.NativeAd.Image image;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new zzon(image.getDrawable(), image.getUri(), image.getScale())))))
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #46  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            75
				image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #56  <Method Object Iterator.next()>
	//   18   42:checkcast       #58  <Class com.google.android.gms.ads.formats.NativeAd$Image>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:new             #60  <Class zzon>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:invokevirtual   #64  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #68  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   27   59:aload_3         
	//   28   60:invokevirtual   #72  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   29   63:invokespecial   #75  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   30   66:invokeinterface #79  <Method boolean List.add(Object)>
	//   31   71:pop             
	//*  32   72:goto            27
			return ((List) (arraylist));
	//   33   75:aload_1         
	//   34   76:areturn         
		} else
		{
			return null;
	//   35   77:aconst_null     
	//   36   78:areturn         
		}
	}

	public final boolean getOverrideClickHandling()
	{
		return ((NativeAdMapper) (zzbuy)).getOverrideClickHandling();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #82  <Method boolean NativeAdMapper.getOverrideClickHandling()>
	//    3    7:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
	{
		return ((NativeAdMapper) (zzbuy)).getOverrideImpressionRecording();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #85  <Method boolean NativeAdMapper.getOverrideImpressionRecording()>
	//    3    7:ireturn         
	}

	public final String getPrice()
	{
		return zzbuy.getPrice();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #88  <Method String NativeAppInstallAdMapper.getPrice()>
	//    3    7:areturn         
	}

	public final double getStarRating()
	{
		return zzbuy.getStarRating();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #91  <Method double NativeAppInstallAdMapper.getStarRating()>
	//    3    7:dreturn         
	}

	public final String getStore()
	{
		return zzbuy.getStore();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #94  <Method String NativeAppInstallAdMapper.getStore()>
	//    3    7:areturn         
	}

	public final zzlo getVideoController()
	{
		if(((NativeAdMapper) (zzbuy)).getVideoController() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//*   2    4:invokevirtual   #99  <Method VideoController NativeAdMapper.getVideoController()>
	//*   3    7:ifnull          21
			return ((NativeAdMapper) (zzbuy)).getVideoController().zzbc();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    6   14:invokevirtual   #99  <Method VideoController NativeAdMapper.getVideoController()>
	//    7   17:invokevirtual   #104 <Method zzlo VideoController.zzbc()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public final void recordImpression()
	{
		((NativeAdMapper) (zzbuy)).recordImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #107 <Method void NativeAdMapper.recordImpression()>
	//    3    7:return          
	}

	public final void zzb(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
	{
		iobjectwrapper1 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #117 <Class HashMap>
	//    3    7:astore_2        
		iobjectwrapper2 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper2)));
	//    4    8:aload_3         
	//    5    9:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    6   12:checkcast       #117 <Class HashMap>
	//    7   15:astore_3        
		((NativeAdMapper) (zzbuy)).trackViews((View)ObjectWrapper.unwrap(iobjectwrapper), ((java.util.Map) (iobjectwrapper1)), ((java.util.Map) (iobjectwrapper2)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//   10   20:aload_1         
	//   11   21:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   12   24:checkcast       #119 <Class View>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #123 <Method void NativeAdMapper.trackViews(View, java.util.Map, java.util.Map)>
	//   16   32:return          
	}

	public final void zzj(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuy)).handleClick((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:aload_1         
	//    3    5:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #119 <Class View>
	//    5   11:invokevirtual   #129 <Method void NativeAdMapper.handleClick(View)>
	//    6   14:return          
	}

	public final zzpw zzjz()
	{
		com.google.android.gms.ads.formats.NativeAd.Image image = zzbuy.getIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #135 <Method com.google.android.gms.ads.formats.NativeAd$Image NativeAppInstallAdMapper.getIcon()>
	//    3    7:astore_1        
		if(image != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			return ((zzpw) (new zzon(image.getDrawable(), image.getUri(), image.getScale())));
	//    6   12:new             #60  <Class zzon>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #64  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #68  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #72  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   14   28:invokespecial   #75  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public final void zzk(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuy)).trackView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:aload_1         
	//    3    5:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #119 <Class View>
	//    5   11:invokevirtual   #139 <Method void NativeAdMapper.trackView(View)>
	//    6   14:return          
	}

	public final IObjectWrapper zzke()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzps zzkf()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void zzl(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuy)).untrackView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:aload_1         
	//    3    5:invokestatic    #115 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #119 <Class View>
	//    5   11:invokevirtual   #147 <Method void NativeAdMapper.untrackView(View)>
	//    6   14:return          
	}

	public final IObjectWrapper zzmv()
	{
		View view = ((NativeAdMapper) (zzbuy)).getAdChoicesContent();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #152 <Method View NativeAdMapper.getAdChoicesContent()>
	//    3    7:astore_1        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return ObjectWrapper.wrap(((Object) (view)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #156 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	public final IObjectWrapper zzmw()
	{
		View view = ((NativeAdMapper) (zzbuy)).zzvy();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeAppInstallAdMapper zzbuy>
	//    2    4:invokevirtual   #160 <Method View NativeAdMapper.zzvy()>
	//    3    7:astore_1        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return ObjectWrapper.wrap(((Object) (view)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #156 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	private final NativeAppInstallAdMapper zzbuy;
}
