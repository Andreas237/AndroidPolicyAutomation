// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzly;

// Referenced classes of package com.google.android.gms.ads.search:
//			DynamicHeightSearchAdRequest, SearchAdRequest

public final class SearchAdView extends ViewGroup
{

	public SearchAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ViewGroup(Context)>
		zzut = new zzly(((ViewGroup) (this)));
	//    3    5:aload_0         
	//    4    6:new             #13  <Class zzly>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #16  <Method void zzly(ViewGroup)>
	//    8   14:putfield        #18  <Field zzly zzut>
	//    9   17:return          
	}

	public SearchAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void ViewGroup(Context, AttributeSet)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, false);
	//    4    6:aload_0         
	//    5    7:new             #13  <Class zzly>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:invokespecial   #25  <Method void zzly(ViewGroup, AttributeSet, boolean)>
	//   11   17:putfield        #18  <Field zzly zzut>
	//   12   20:return          
	}

	public SearchAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void ViewGroup(Context, AttributeSet, int)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, false);
	//    5    7:aload_0         
	//    6    8:new             #13  <Class zzly>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iconst_0        
	//   11   15:invokespecial   #25  <Method void zzly(ViewGroup, AttributeSet, boolean)>
	//   12   18:putfield        #18  <Field zzly zzut>
	//   13   21:return          
	}

	public final void destroy()
	{
		zzut.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #32  <Method void zzly.destroy()>
	//    3    7:return          
	}

	public final AdListener getAdListener()
	{
		return zzut.getAdListener();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #36  <Method AdListener zzly.getAdListener()>
	//    3    7:areturn         
	}

	public final AdSize getAdSize()
	{
		return zzut.getAdSize();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #40  <Method AdSize zzly.getAdSize()>
	//    3    7:areturn         
	}

	public final String getAdUnitId()
	{
		return zzut.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #44  <Method String zzly.getAdUnitId()>
	//    3    7:areturn         
	}

	public final void loadAd(DynamicHeightSearchAdRequest dynamicheightsearchadrequest)
	{
		if(AdSize.SEARCH.equals(((Object) (getAdSize()))))
	//*   0    0:getstatic       #55  <Field AdSize AdSize.SEARCH>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #56  <Method AdSize getAdSize()>
	//*   3    7:invokevirtual   #60  <Method boolean AdSize.equals(Object)>
	//*   4   10:ifeq            25
		{
			zzut.zza(dynamicheightsearchadrequest.zzay());
	//    5   13:aload_0         
	//    6   14:getfield        #18  <Field zzly zzut>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #66  <Method com.google.android.gms.internal.ads.zzlw DynamicHeightSearchAdRequest.zzay()>
	//    9   21:invokevirtual   #70  <Method void zzly.zza(com.google.android.gms.internal.ads.zzlw)>
			return;
	//   10   24:return          
		} else
		{
			throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
	//   11   25:new             #72  <Class IllegalStateException>
	//   12   28:dup             
	//   13   29:ldc1            #74  <String "You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest">
	//   14   31:invokespecial   #77  <Method void IllegalStateException(String)>
	//   15   34:athrow          
		}
	}

	public final void loadAd(SearchAdRequest searchadrequest)
	{
		zzut.zza(searchadrequest.zzay());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method com.google.android.gms.internal.ads.zzlw SearchAdRequest.zzay()>
	//    4    8:invokevirtual   #70  <Method void zzly.zza(com.google.android.gms.internal.ads.zzlw)>
	//    5   11:return          
	}

	protected final void onLayout(boolean flag, int i, int j, int k, int l)
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #88  <Method View getChildAt(int)>
	//    3    5:astore          8
		if(view != null && view.getVisibility() != 8)
	//*   4    7:aload           8
	//*   5    9:ifnull          71
	//*   6   12:aload           8
	//*   7   14:invokevirtual   #94  <Method int View.getVisibility()>
	//*   8   17:bipush          8
	//*   9   19:icmpeq          71
		{
			int i1 = view.getMeasuredWidth();
	//   10   22:aload           8
	//   11   24:invokevirtual   #97  <Method int View.getMeasuredWidth()>
	//   12   27:istore          6
			int j1 = view.getMeasuredHeight();
	//   13   29:aload           8
	//   14   31:invokevirtual   #100 <Method int View.getMeasuredHeight()>
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
	//   41   68:invokevirtual   #104 <Method void View.layout(int, int, int, int)>
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
	//    4    4:invokevirtual   #88  <Method View getChildAt(int)>
	//    5    7:astore          5
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*   6    9:aload           5
	//*   7   11:ifnull          48
	//*   8   14:aload           5
	//*   9   16:invokevirtual   #94  <Method int View.getVisibility()>
	//*  10   19:bipush          8
	//*  11   21:icmpeq          48
		{
			measureChild(((View) (obj)), i, j);
	//   12   24:aload_0         
	//   13   25:aload           5
	//   14   27:iload_1         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #112 <Method void measureChild(View, int, int)>
			k = ((View) (obj)).getMeasuredWidth();
	//   17   32:aload           5
	//   18   34:invokevirtual   #97  <Method int View.getMeasuredWidth()>
	//   19   37:istore_3        
			l = ((View) (obj)).getMeasuredHeight();
	//   20   38:aload           5
	//   21   40:invokevirtual   #100 <Method int View.getMeasuredHeight()>
	//   22   43:istore          4
			break MISSING_BLOCK_LABEL_107;
	//   23   45:goto            107
		}
		obj = null;
	//   24   48:aconst_null     
	//   25   49:astore          5
		AdSize adsize = getAdSize();
	//   26   51:aload_0         
	//   27   52:invokevirtual   #56  <Method AdSize getAdSize()>
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
	//   33   66:ldc1            #114 <String "Unable to retrieve ad size.">
	//   34   68:aload           6
	//   35   70:invokestatic    #120 <Method void zzane.zzb(String, Throwable)>
		if(obj != null)
	//*  36   73:aload           5
	//*  37   75:ifnull          104
		{
			Context context = getContext();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #124 <Method Context getContext()>
	//   40   82:astore          6
			k = ((AdSize) (obj)).getWidthInPixels(context);
	//   41   84:aload           5
	//   42   86:aload           6
	//   43   88:invokevirtual   #128 <Method int AdSize.getWidthInPixels(Context)>
	//   44   91:istore_3        
			l = ((AdSize) (obj)).getHeightInPixels(context);
	//   45   92:aload           5
	//   46   94:aload           6
	//   47   96:invokevirtual   #131 <Method int AdSize.getHeightInPixels(Context)>
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
	//   54  109:invokevirtual   #134 <Method int getSuggestedMinimumWidth()>
	//   55  112:invokestatic    #140 <Method int Math.max(int, int)>
	//   56  115:istore_3        
		l = Math.max(l, getSuggestedMinimumHeight());
	//   57  116:iload           4
	//   58  118:aload_0         
	//   59  119:invokevirtual   #143 <Method int getSuggestedMinimumHeight()>
	//   60  122:invokestatic    #140 <Method int Math.max(int, int)>
	//   61  125:istore          4
		setMeasuredDimension(View.resolveSize(k, i), View.resolveSize(l, j));
	//   62  127:aload_0         
	//   63  128:iload_3         
	//   64  129:iload_1         
	//   65  130:invokestatic    #146 <Method int View.resolveSize(int, int)>
	//   66  133:iload           4
	//   67  135:iload_2         
	//   68  136:invokestatic    #146 <Method int View.resolveSize(int, int)>
	//   69  139:invokevirtual   #149 <Method void setMeasuredDimension(int, int)>
		return;
	//   70  142:return          
	}

	public final void pause()
	{
		zzut.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #152 <Method void zzly.pause()>
	//    3    7:return          
	}

	public final void resume()
	{
		zzut.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #155 <Method void zzly.resume()>
	//    3    7:return          
	}

	public final void setAdListener(AdListener adlistener)
	{
		zzut.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method void zzly.setAdListener(AdListener)>
	//    4    8:return          
	}

	public final void setAdSize(AdSize adsize)
	{
		zzut.setAdSizes(new AdSize[] {
			adsize
		});
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:iconst_1        
	//    3    5:anewarray       AdSize[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #165 <Method void zzly.setAdSizes(AdSize[])>
	//    9   15:return          
	}

	public final void setAdUnitId(String s)
	{
		zzut.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #168 <Method void zzly.setAdUnitId(String)>
	//    4    8:return          
	}

	private final zzly zzut;
}
