// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyg, zzon, zzlo, zzpw, 
//			zzps

public final class zzze extends zzyg
{

	public zzze(UnifiedNativeAdMapper unifiednativeadmapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzyg()>
		zzbvh = unifiednativeadmapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    5    9:return          
	}

	public final String getAdvertiser()
	{
		return zzbvh.getAdvertiser();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #21  <Method String UnifiedNativeAdMapper.getAdvertiser()>
	//    3    7:areturn         
	}

	public final String getBody()
	{
		return zzbvh.getBody();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #24  <Method String UnifiedNativeAdMapper.getBody()>
	//    3    7:areturn         
	}

	public final String getCallToAction()
	{
		return zzbvh.getCallToAction();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #27  <Method String UnifiedNativeAdMapper.getCallToAction()>
	//    3    7:areturn         
	}

	public final Bundle getExtras()
	{
		return zzbvh.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #31  <Method Bundle UnifiedNativeAdMapper.getExtras()>
	//    3    7:areturn         
	}

	public final String getHeadline()
	{
		return zzbvh.getHeadline();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #34  <Method String UnifiedNativeAdMapper.getHeadline()>
	//    3    7:areturn         
	}

	public final List getImages()
	{
		Object obj = ((Object) (zzbvh.getImages()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #38  <Method List UnifiedNativeAdMapper.getImages()>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #40  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #41  <Method void ArrayList()>
	//    7   15:astore_1        
		if(obj != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          75
		{
			com.google.android.gms.ads.formats.NativeAd.Image image;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new zzon(image.getDrawable(), image.getUri(), image.getScale())))))
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #47  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            75
				image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #57  <Method Object Iterator.next()>
	//   18   42:checkcast       #59  <Class com.google.android.gms.ads.formats.NativeAd$Image>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:new             #61  <Class zzon>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:invokevirtual   #65  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #69  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   27   59:aload_3         
	//   28   60:invokevirtual   #73  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   29   63:invokespecial   #76  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   30   66:invokeinterface #80  <Method boolean List.add(Object)>
	//   31   71:pop             
		}
	//*  32   72:goto            27
		return ((List) (arraylist));
	//   33   75:aload_1         
	//   34   76:areturn         
	}

	public final boolean getOverrideClickHandling()
	{
		return zzbvh.getOverrideClickHandling();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #83  <Method boolean UnifiedNativeAdMapper.getOverrideClickHandling()>
	//    3    7:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
	{
		return zzbvh.getOverrideImpressionRecording();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #86  <Method boolean UnifiedNativeAdMapper.getOverrideImpressionRecording()>
	//    3    7:ireturn         
	}

	public final String getPrice()
	{
		return zzbvh.getPrice();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #89  <Method String UnifiedNativeAdMapper.getPrice()>
	//    3    7:areturn         
	}

	public final double getStarRating()
	{
		if(zzbvh.getStarRating() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//*   2    4:invokevirtual   #93  <Method Double UnifiedNativeAdMapper.getStarRating()>
	//*   3    7:ifnull          21
			return zzbvh.getStarRating().doubleValue();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    6   14:invokevirtual   #93  <Method Double UnifiedNativeAdMapper.getStarRating()>
	//    7   17:invokevirtual   #98  <Method double Double.doubleValue()>
	//    8   20:dreturn         
		else
			return -1D;
	//    9   21:ldc2w           #99  <Double -1D>
	//   10   24:dreturn         
	}

	public final String getStore()
	{
		return zzbvh.getStore();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #103 <Method String UnifiedNativeAdMapper.getStore()>
	//    3    7:areturn         
	}

	public final zzlo getVideoController()
	{
		if(zzbvh.getVideoController() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//*   2    4:invokevirtual   #108 <Method VideoController UnifiedNativeAdMapper.getVideoController()>
	//*   3    7:ifnull          21
			return zzbvh.getVideoController().zzbc();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    6   14:invokevirtual   #108 <Method VideoController UnifiedNativeAdMapper.getVideoController()>
	//    7   17:invokevirtual   #113 <Method zzlo VideoController.zzbc()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public final void recordImpression()
	{
		zzbvh.recordImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #116 <Method void UnifiedNativeAdMapper.recordImpression()>
	//    3    7:return          
	}

	public final void zzb(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
	{
		iobjectwrapper1 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #124 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #126 <Class HashMap>
	//    3    7:astore_2        
		iobjectwrapper2 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper2)));
	//    4    8:aload_3         
	//    5    9:invokestatic    #124 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    6   12:checkcast       #126 <Class HashMap>
	//    7   15:astore_3        
		zzbvh.trackViews((View)ObjectWrapper.unwrap(iobjectwrapper), ((java.util.Map) (iobjectwrapper1)), ((java.util.Map) (iobjectwrapper2)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//   10   20:aload_1         
	//   11   21:invokestatic    #124 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   12   24:checkcast       #128 <Class View>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #132 <Method void UnifiedNativeAdMapper.trackViews(View, java.util.Map, java.util.Map)>
	//   16   32:return          
	}

	public final void zzj(IObjectWrapper iobjectwrapper)
	{
		zzbvh.handleClick((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:aload_1         
	//    3    5:invokestatic    #124 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #128 <Class View>
	//    5   11:invokevirtual   #138 <Method void UnifiedNativeAdMapper.handleClick(View)>
	//    6   14:return          
	}

	public final zzpw zzjz()
	{
		com.google.android.gms.ads.formats.NativeAd.Image image = zzbvh.getIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #144 <Method com.google.android.gms.ads.formats.NativeAd$Image UnifiedNativeAdMapper.getIcon()>
	//    3    7:astore_1        
		if(image != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			return ((zzpw) (new zzon(image.getDrawable(), image.getUri(), image.getScale())));
	//    6   12:new             #61  <Class zzon>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #65  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #69  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #73  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   14   28:invokespecial   #76  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public final IObjectWrapper zzke()
	{
		Object obj = zzbvh.zzbh();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #149 <Method Object UnifiedNativeAdMapper.zzbh()>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return ObjectWrapper.wrap(obj);
	//    8   14:aload_1         
	//    9   15:invokestatic    #153 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	public final zzps zzkf()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void zzl(IObjectWrapper iobjectwrapper)
	{
		zzbvh.untrackView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:aload_1         
	//    3    5:invokestatic    #124 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #128 <Class View>
	//    5   11:invokevirtual   #159 <Method void UnifiedNativeAdMapper.untrackView(View)>
	//    6   14:return          
	}

	public final IObjectWrapper zzmv()
	{
		View view = zzbvh.getAdChoicesContent();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #164 <Method View UnifiedNativeAdMapper.getAdChoicesContent()>
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
	//    9   15:invokestatic    #153 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	public final IObjectWrapper zzmw()
	{
		View view = zzbvh.zzvy();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field UnifiedNativeAdMapper zzbvh>
	//    2    4:invokevirtual   #168 <Method View UnifiedNativeAdMapper.zzvy()>
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
	//    9   15:invokestatic    #153 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	private final UnifiedNativeAdMapper zzbvh;
}
