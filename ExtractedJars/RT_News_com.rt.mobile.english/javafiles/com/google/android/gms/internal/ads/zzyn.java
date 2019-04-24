// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyd, zzon, zzlo, zzps, 
//			zzpw

public final class zzyn extends zzyd
{

	public zzyn(NativeContentAdMapper nativecontentadmapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzyd()>
		zzbuz = nativecontentadmapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field NativeContentAdMapper zzbuz>
	//    5    9:return          
	}

	public final String getAdvertiser()
	{
		return zzbuz.getAdvertiser();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #21  <Method String NativeContentAdMapper.getAdvertiser()>
	//    3    7:areturn         
	}

	public final String getBody()
	{
		return zzbuz.getBody();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #24  <Method String NativeContentAdMapper.getBody()>
	//    3    7:areturn         
	}

	public final String getCallToAction()
	{
		return zzbuz.getCallToAction();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #27  <Method String NativeContentAdMapper.getCallToAction()>
	//    3    7:areturn         
	}

	public final Bundle getExtras()
	{
		return ((NativeAdMapper) (zzbuz)).getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #33  <Method Bundle NativeAdMapper.getExtras()>
	//    3    7:areturn         
	}

	public final String getHeadline()
	{
		return zzbuz.getHeadline();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #36  <Method String NativeContentAdMapper.getHeadline()>
	//    3    7:areturn         
	}

	public final List getImages()
	{
		Object obj = ((Object) (zzbuz.getImages()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #40  <Method List NativeContentAdMapper.getImages()>
	//    3    7:astore_2        
		if(obj != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          77
		{
			ArrayList arraylist = new ArrayList();
	//    6   12:new             #42  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #43  <Method void ArrayList()>
	//    9   19:astore_1        
			com.google.android.gms.ads.formats.NativeAd.Image image;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new zzon(image.getDrawable(), image.getUri(), image.getScale())))))
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #49  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            75
				image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #59  <Method Object Iterator.next()>
	//   18   42:checkcast       #61  <Class com.google.android.gms.ads.formats.NativeAd$Image>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:new             #63  <Class zzon>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:invokevirtual   #67  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #71  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   27   59:aload_3         
	//   28   60:invokevirtual   #75  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   29   63:invokespecial   #78  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   30   66:invokeinterface #82  <Method boolean List.add(Object)>
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
		return ((NativeAdMapper) (zzbuz)).getOverrideClickHandling();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #85  <Method boolean NativeAdMapper.getOverrideClickHandling()>
	//    3    7:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
	{
		return ((NativeAdMapper) (zzbuz)).getOverrideImpressionRecording();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #88  <Method boolean NativeAdMapper.getOverrideImpressionRecording()>
	//    3    7:ireturn         
	}

	public final zzlo getVideoController()
	{
		if(((NativeAdMapper) (zzbuz)).getVideoController() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//*   2    4:invokevirtual   #93  <Method VideoController NativeAdMapper.getVideoController()>
	//*   3    7:ifnull          21
			return ((NativeAdMapper) (zzbuz)).getVideoController().zzbc();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    6   14:invokevirtual   #93  <Method VideoController NativeAdMapper.getVideoController()>
	//    7   17:invokevirtual   #98  <Method zzlo VideoController.zzbc()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public final void recordImpression()
	{
		((NativeAdMapper) (zzbuz)).recordImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #101 <Method void NativeAdMapper.recordImpression()>
	//    3    7:return          
	}

	public final void zzb(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
	{
		iobjectwrapper1 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #111 <Class HashMap>
	//    3    7:astore_2        
		iobjectwrapper2 = ((IObjectWrapper) ((HashMap)ObjectWrapper.unwrap(iobjectwrapper2)));
	//    4    8:aload_3         
	//    5    9:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    6   12:checkcast       #111 <Class HashMap>
	//    7   15:astore_3        
		((NativeAdMapper) (zzbuz)).trackViews((View)ObjectWrapper.unwrap(iobjectwrapper), ((java.util.Map) (iobjectwrapper1)), ((java.util.Map) (iobjectwrapper2)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//   10   20:aload_1         
	//   11   21:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   12   24:checkcast       #113 <Class View>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #117 <Method void NativeAdMapper.trackViews(View, java.util.Map, java.util.Map)>
	//   16   32:return          
	}

	public final void zzj(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuz)).handleClick((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #113 <Class View>
	//    5   11:invokevirtual   #123 <Method void NativeAdMapper.handleClick(View)>
	//    6   14:return          
	}

	public final void zzk(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuz)).trackView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #113 <Class View>
	//    5   11:invokevirtual   #127 <Method void NativeAdMapper.trackView(View)>
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

	public final zzpw zzkg()
	{
		com.google.android.gms.ads.formats.NativeAd.Image image = zzbuz.getLogo();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #137 <Method com.google.android.gms.ads.formats.NativeAd$Image NativeContentAdMapper.getLogo()>
	//    3    7:astore_1        
		if(image != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			return ((zzpw) (new zzon(image.getDrawable(), image.getUri(), image.getScale())));
	//    6   12:new             #63  <Class zzon>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #67  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.NativeAd$Image.getDrawable()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #71  <Method android.net.Uri com.google.android.gms.ads.formats.NativeAd$Image.getUri()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #75  <Method double com.google.android.gms.ads.formats.NativeAd$Image.getScale()>
	//   14   28:invokespecial   #78  <Method void zzon(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public final void zzl(IObjectWrapper iobjectwrapper)
	{
		((NativeAdMapper) (zzbuz)).untrackView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #113 <Class View>
	//    5   11:invokevirtual   #141 <Method void NativeAdMapper.untrackView(View)>
	//    6   14:return          
	}

	public final IObjectWrapper zzmv()
	{
		View view = ((NativeAdMapper) (zzbuz)).getAdChoicesContent();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #146 <Method View NativeAdMapper.getAdChoicesContent()>
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
	//    9   15:invokestatic    #150 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	public final IObjectWrapper zzmw()
	{
		View view = ((NativeAdMapper) (zzbuz)).zzvy();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field NativeContentAdMapper zzbuz>
	//    2    4:invokevirtual   #154 <Method View NativeAdMapper.zzvy()>
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
	//    9   15:invokestatic    #150 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   18:areturn         
	}

	private final NativeContentAdMapper zzbuz;
}
