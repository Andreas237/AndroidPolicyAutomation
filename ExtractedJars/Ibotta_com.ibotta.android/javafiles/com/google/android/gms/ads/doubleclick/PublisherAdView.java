// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//			PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherAdView extends ViewGroup
{

	public PublisherAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ViewGroup(Context)>
		zzut = new zzly(((ViewGroup) (this)));
	//    3    5:aload_0         
	//    4    6:new             #12  <Class zzly>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #15  <Method void zzly(ViewGroup)>
	//    8   14:putfield        #17  <Field zzly zzut>
	//    9   17:return          
	}

	public PublisherAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void ViewGroup(Context, AttributeSet)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, true);
	//    4    6:aload_0         
	//    5    7:new             #12  <Class zzly>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:iconst_1        
	//   10   14:invokespecial   #24  <Method void zzly(ViewGroup, AttributeSet, boolean)>
	//   11   17:putfield        #17  <Field zzly zzut>
		Preconditions.checkNotNull(((Object) (context)), "Context cannot be null");
	//   12   20:aload_1         
	//   13   21:ldc1            #26  <String "Context cannot be null">
	//   14   23:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   15   26:pop             
	//   16   27:return          
	}

	public PublisherAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #35  <Method void ViewGroup(Context, AttributeSet, int)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, true);
	//    5    7:aload_0         
	//    6    8:new             #12  <Class zzly>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iconst_1        
	//   11   15:invokespecial   #24  <Method void zzly(ViewGroup, AttributeSet, boolean)>
	//   12   18:putfield        #17  <Field zzly zzut>
	//   13   21:return          
	}

	public final void destroy()
	{
		zzut.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #39  <Method void zzly.destroy()>
	//    3    7:return          
	}

	public final AdListener getAdListener()
	{
		return zzut.getAdListener();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #43  <Method AdListener zzly.getAdListener()>
	//    3    7:areturn         
	}

	public final AdSize getAdSize()
	{
		return zzut.getAdSize();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #47  <Method AdSize zzly.getAdSize()>
	//    3    7:areturn         
	}

	public final AdSize[] getAdSizes()
	{
		return zzut.getAdSizes();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #51  <Method AdSize[] zzly.getAdSizes()>
	//    3    7:areturn         
	}

	public final String getAdUnitId()
	{
		return zzut.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #55  <Method String zzly.getAdUnitId()>
	//    3    7:areturn         
	}

	public final AppEventListener getAppEventListener()
	{
		return zzut.getAppEventListener();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #59  <Method AppEventListener zzly.getAppEventListener()>
	//    3    7:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		return zzut.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #62  <Method String zzly.getMediationAdapterClassName()>
	//    3    7:areturn         
	}

	public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
	{
		return zzut.getOnCustomRenderedAdLoadedListener();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #66  <Method OnCustomRenderedAdLoadedListener zzly.getOnCustomRenderedAdLoadedListener()>
	//    3    7:areturn         
	}

	public final VideoController getVideoController()
	{
		return zzut.getVideoController();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #70  <Method VideoController zzly.getVideoController()>
	//    3    7:areturn         
	}

	public final VideoOptions getVideoOptions()
	{
		return zzut.getVideoOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #74  <Method VideoOptions zzly.getVideoOptions()>
	//    3    7:areturn         
	}

	public final boolean isLoading()
	{
		return zzut.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #78  <Method boolean zzly.isLoading()>
	//    3    7:ireturn         
	}

	public final void loadAd(PublisherAdRequest publisheradrequest)
	{
		zzut.zza(publisheradrequest.zzay());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method com.google.android.gms.internal.ads.zzlw PublisherAdRequest.zzay()>
	//    4    8:invokevirtual   #93  <Method void zzly.zza(com.google.android.gms.internal.ads.zzlw)>
	//    5   11:return          
	}

	protected final void onLayout(boolean flag, int i, int j, int k, int l)
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #100 <Method View getChildAt(int)>
	//    3    5:astore          8
		if(view != null && view.getVisibility() != 8)
	//*   4    7:aload           8
	//*   5    9:ifnull          71
	//*   6   12:aload           8
	//*   7   14:invokevirtual   #106 <Method int View.getVisibility()>
	//*   8   17:bipush          8
	//*   9   19:icmpeq          71
		{
			int i1 = view.getMeasuredWidth();
	//   10   22:aload           8
	//   11   24:invokevirtual   #109 <Method int View.getMeasuredWidth()>
	//   12   27:istore          6
			int j1 = view.getMeasuredHeight();
	//   13   29:aload           8
	//   14   31:invokevirtual   #112 <Method int View.getMeasuredHeight()>
	//   15   34:istore          7
			i = (k - i - i1) / 2;
	//   16   36:iload           4
	//   17   38:iload_2         
	//   18   39:isub            
	//   19   40:iload           6
	//   20   42:isub            
	//   21   43:iconst_2        
	//   22   44:idiv            
	//   23   45:istore_2        
			j = (l - j - j1) / 2;
	//   24   46:iload           5
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:iload           7
	//   28   52:isub            
	//   29   53:iconst_2        
	//   30   54:idiv            
	//   31   55:istore_3        
			view.layout(i, j, i1 + i, j1 + j);
	//   32   56:aload           8
	//   33   58:iload_2         
	//   34   59:iload_3         
	//   35   60:iload           6
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:iload           7
	//   39   66:iload_3         
	//   40   67:iadd            
	//   41   68:invokevirtual   #116 <Method void View.layout(int, int, int, int)>
		}
	//   42   71:return          
	}

	protected final void onMeasure(int i, int j)
	{
		int k;
		int l;
		Object obj;
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		obj = ((Object) (getChildAt(0)));
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #100 <Method View getChildAt(int)>
	//    5    7:astore          5
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*   6    9:aload           5
	//*   7   11:ifnull          48
	//*   8   14:aload           5
	//*   9   16:invokevirtual   #106 <Method int View.getVisibility()>
	//*  10   19:bipush          8
	//*  11   21:icmpeq          48
		{
			measureChild(((View) (obj)), i, j);
	//   12   24:aload_0         
	//   13   25:aload           5
	//   14   27:iload_1         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #124 <Method void measureChild(View, int, int)>
			k = ((View) (obj)).getMeasuredWidth();
	//   17   32:aload           5
	//   18   34:invokevirtual   #109 <Method int View.getMeasuredWidth()>
	//   19   37:istore_3        
			l = ((View) (obj)).getMeasuredHeight();
	//   20   38:aload           5
	//   21   40:invokevirtual   #112 <Method int View.getMeasuredHeight()>
	//   22   43:istore          4
			break MISSING_BLOCK_LABEL_107;
	//   23   45:goto            107
		}
		obj = null;
	//   24   48:aconst_null     
	//   25   49:astore          5
		AdSize adsize = getAdSize();
	//   26   51:aload_0         
	//   27   52:invokevirtual   #125 <Method AdSize getAdSize()>
	//   28   55:astore          6
		obj = ((Object) (adsize));
	//   29   57:aload           6
	//   30   59:astore          5
		break MISSING_BLOCK_LABEL_73;
	//   31   61:goto            73
		NullPointerException nullpointerexception;
		nullpointerexception;
	//   32   64:astore          6
		zzane.zzb("Unable to retrieve ad size.", ((Throwable) (nullpointerexception)));
	//   33   66:ldc1            #127 <String "Unable to retrieve ad size.">
	//   34   68:aload           6
	//   35   70:invokestatic    #133 <Method void zzane.zzb(String, Throwable)>
		if(obj != null)
	//*  36   73:aload           5
	//*  37   75:ifnull          104
		{
			Context context = getContext();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #137 <Method Context getContext()>
	//   40   82:astore          6
			k = ((AdSize) (obj)).getWidthInPixels(context);
	//   41   84:aload           5
	//   42   86:aload           6
	//   43   88:invokevirtual   #143 <Method int AdSize.getWidthInPixels(Context)>
	//   44   91:istore_3        
			l = ((AdSize) (obj)).getHeightInPixels(context);
	//   45   92:aload           5
	//   46   94:aload           6
	//   47   96:invokevirtual   #146 <Method int AdSize.getHeightInPixels(Context)>
	//   48   99:istore          4
		} else
	//*  49  101:goto            107
		{
			l = 0;
	//   50  104:iconst_0        
	//   51  105:istore          4
		}
		k = Math.max(k, getSuggestedMinimumWidth());
	//   52  107:iload_3         
	//   53  108:aload_0         
	//   54  109:invokevirtual   #149 <Method int getSuggestedMinimumWidth()>
	//   55  112:invokestatic    #155 <Method int Math.max(int, int)>
	//   56  115:istore_3        
		l = Math.max(l, getSuggestedMinimumHeight());
	//   57  116:iload           4
	//   58  118:aload_0         
	//   59  119:invokevirtual   #158 <Method int getSuggestedMinimumHeight()>
	//   60  122:invokestatic    #155 <Method int Math.max(int, int)>
	//   61  125:istore          4
		setMeasuredDimension(View.resolveSize(k, i), View.resolveSize(l, j));
	//   62  127:aload_0         
	//   63  128:iload_3         
	//   64  129:iload_1         
	//   65  130:invokestatic    #161 <Method int View.resolveSize(int, int)>
	//   66  133:iload           4
	//   67  135:iload_2         
	//   68  136:invokestatic    #161 <Method int View.resolveSize(int, int)>
	//   69  139:invokevirtual   #164 <Method void setMeasuredDimension(int, int)>
		return;
	//   70  142:return          
	}

	public final void pause()
	{
		zzut.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #167 <Method void zzly.pause()>
	//    3    7:return          
	}

	public final void recordManualImpression()
	{
		zzut.recordManualImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #170 <Method void zzly.recordManualImpression()>
	//    3    7:return          
	}

	public final void resume()
	{
		zzut.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:invokevirtual   #173 <Method void zzly.resume()>
	//    3    7:return          
	}

	public final void setAdListener(AdListener adlistener)
	{
		zzut.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void zzly.setAdListener(AdListener)>
	//    4    8:return          
	}

	public final transient void setAdSizes(AdSize aadsize[])
	{
		if(aadsize != null && aadsize.length > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifle            18
		{
			zzut.zza(aadsize);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field zzly zzut>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #181 <Method void zzly.zza(AdSize[])>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
	//   10   18:new             #183 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc1            #185 <String "The supported ad sizes must contain at least one valid ad size.">
	//   13   24:invokespecial   #188 <Method void IllegalArgumentException(String)>
	//   14   27:athrow          
		}
	}

	public final void setAdUnitId(String s)
	{
		zzut.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void zzly.setAdUnitId(String)>
	//    4    8:return          
	}

	public final void setAppEventListener(AppEventListener appeventlistener)
	{
		zzut.setAppEventListener(appeventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method void zzly.setAppEventListener(AppEventListener)>
	//    4    8:return          
	}

	public final void setCorrelator(Correlator correlator)
	{
		zzut.setCorrelator(correlator);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #199 <Method void zzly.setCorrelator(Correlator)>
	//    4    8:return          
	}

	public final void setManualImpressionsEnabled(boolean flag)
	{
		zzut.setManualImpressionsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #203 <Method void zzly.setManualImpressionsEnabled(boolean)>
	//    4    8:return          
	}

	public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
	{
		zzut.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #207 <Method void zzly.setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener)>
	//    4    8:return          
	}

	public final void setVideoOptions(VideoOptions videooptions)
	{
		zzut.setVideoOptions(videooptions);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #211 <Method void zzly.setVideoOptions(VideoOptions)>
	//    4    8:return          
	}

	public final boolean zza(zzks zzks)
	{
		return zzut.zza(zzks);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #214 <Method boolean zzly.zza(zzks)>
	//    4    8:ireturn         
	}

	private final zzly zzut;
}
