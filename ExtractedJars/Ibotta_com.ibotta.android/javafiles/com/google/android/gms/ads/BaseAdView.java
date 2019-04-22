// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads:
//			AdRequest, AdSize, AdListener

class BaseAdView extends ViewGroup
{

	public BaseAdView(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ViewGroup(Context)>
		zzut = new zzly(((ViewGroup) (this)), i);
	//    3    5:aload_0         
	//    4    6:new             #13  <Class zzly>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokespecial   #16  <Method void zzly(ViewGroup, int)>
	//    9   15:putfield        #18  <Field zzly zzut>
	//   10   18:return          
	}

	public BaseAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void ViewGroup(Context, AttributeSet)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, false, i);
	//    4    6:aload_0         
	//    5    7:new             #13  <Class zzly>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:iload_3         
	//   11   15:invokespecial   #26  <Method void zzly(ViewGroup, AttributeSet, boolean, int)>
	//   12   18:putfield        #18  <Field zzly zzut>
	//   13   21:return          
	}

	public BaseAdView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #29  <Method void ViewGroup(Context, AttributeSet, int)>
		zzut = new zzly(((ViewGroup) (this)), attributeset, false, j);
	//    5    7:aload_0         
	//    6    8:new             #13  <Class zzly>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iconst_0        
	//   11   15:iload           4
	//   12   17:invokespecial   #26  <Method void zzly(ViewGroup, AttributeSet, boolean, int)>
	//   13   20:putfield        #18  <Field zzly zzut>
	//   14   23:return          
	}

	public void destroy()
	{
		zzut.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #33  <Method void zzly.destroy()>
	//    3    7:return          
	}

	public AdListener getAdListener()
	{
		return zzut.getAdListener();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #37  <Method AdListener zzly.getAdListener()>
	//    3    7:areturn         
	}

	public AdSize getAdSize()
	{
		return zzut.getAdSize();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #41  <Method AdSize zzly.getAdSize()>
	//    3    7:areturn         
	}

	public String getAdUnitId()
	{
		return zzut.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #45  <Method String zzly.getAdUnitId()>
	//    3    7:areturn         
	}

	public String getMediationAdapterClassName()
	{
		return zzut.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #48  <Method String zzly.getMediationAdapterClassName()>
	//    3    7:areturn         
	}

	public boolean isLoading()
	{
		return zzut.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #52  <Method boolean zzly.isLoading()>
	//    3    7:ireturn         
	}

	public void loadAd(AdRequest adrequest)
	{
		zzut.zza(adrequest.zzay());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method com.google.android.gms.internal.ads.zzlw AdRequest.zzay()>
	//    4    8:invokevirtual   #67  <Method void zzly.zza(com.google.android.gms.internal.ads.zzlw)>
	//    5   11:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #74  <Method View getChildAt(int)>
	//    3    5:astore          8
		if(view != null && view.getVisibility() != 8)
	//*   4    7:aload           8
	//*   5    9:ifnull          71
	//*   6   12:aload           8
	//*   7   14:invokevirtual   #80  <Method int View.getVisibility()>
	//*   8   17:bipush          8
	//*   9   19:icmpeq          71
		{
			int i1 = view.getMeasuredWidth();
	//   10   22:aload           8
	//   11   24:invokevirtual   #83  <Method int View.getMeasuredWidth()>
	//   12   27:istore          6
			int j1 = view.getMeasuredHeight();
	//   13   29:aload           8
	//   14   31:invokevirtual   #86  <Method int View.getMeasuredHeight()>
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
	//   41   68:invokevirtual   #90  <Method void View.layout(int, int, int, int)>
		}
	//   42   71:return          
	}

	protected void onMeasure(int i, int j)
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
	//    4    4:invokevirtual   #74  <Method View getChildAt(int)>
	//    5    7:astore          5
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*   6    9:aload           5
	//*   7   11:ifnull          48
	//*   8   14:aload           5
	//*   9   16:invokevirtual   #80  <Method int View.getVisibility()>
	//*  10   19:bipush          8
	//*  11   21:icmpeq          48
		{
			measureChild(((View) (obj)), i, j);
	//   12   24:aload_0         
	//   13   25:aload           5
	//   14   27:iload_1         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #98  <Method void measureChild(View, int, int)>
			k = ((View) (obj)).getMeasuredWidth();
	//   17   32:aload           5
	//   18   34:invokevirtual   #83  <Method int View.getMeasuredWidth()>
	//   19   37:istore_3        
			l = ((View) (obj)).getMeasuredHeight();
	//   20   38:aload           5
	//   21   40:invokevirtual   #86  <Method int View.getMeasuredHeight()>
	//   22   43:istore          4
			break MISSING_BLOCK_LABEL_107;
	//   23   45:goto            107
		}
		obj = null;
	//   24   48:aconst_null     
	//   25   49:astore          5
		AdSize adsize = getAdSize();
	//   26   51:aload_0         
	//   27   52:invokevirtual   #99  <Method AdSize getAdSize()>
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
	//   33   66:ldc1            #101 <String "Unable to retrieve ad size.">
	//   34   68:aload           6
	//   35   70:invokestatic    #107 <Method void zzane.zzb(String, Throwable)>
		if(obj != null)
	//*  36   73:aload           5
	//*  37   75:ifnull          104
		{
			Context context = getContext();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #111 <Method Context getContext()>
	//   40   82:astore          6
			k = ((AdSize) (obj)).getWidthInPixels(context);
	//   41   84:aload           5
	//   42   86:aload           6
	//   43   88:invokevirtual   #117 <Method int AdSize.getWidthInPixels(Context)>
	//   44   91:istore_3        
			l = ((AdSize) (obj)).getHeightInPixels(context);
	//   45   92:aload           5
	//   46   94:aload           6
	//   47   96:invokevirtual   #120 <Method int AdSize.getHeightInPixels(Context)>
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
	//   54  109:invokevirtual   #123 <Method int getSuggestedMinimumWidth()>
	//   55  112:invokestatic    #129 <Method int Math.max(int, int)>
	//   56  115:istore_3        
		l = Math.max(l, getSuggestedMinimumHeight());
	//   57  116:iload           4
	//   58  118:aload_0         
	//   59  119:invokevirtual   #132 <Method int getSuggestedMinimumHeight()>
	//   60  122:invokestatic    #129 <Method int Math.max(int, int)>
	//   61  125:istore          4
		setMeasuredDimension(View.resolveSize(k, i), View.resolveSize(l, j));
	//   62  127:aload_0         
	//   63  128:iload_3         
	//   64  129:iload_1         
	//   65  130:invokestatic    #135 <Method int View.resolveSize(int, int)>
	//   66  133:iload           4
	//   67  135:iload_2         
	//   68  136:invokestatic    #135 <Method int View.resolveSize(int, int)>
	//   69  139:invokevirtual   #138 <Method void setMeasuredDimension(int, int)>
		return;
	//   70  142:return          
	}

	public void pause()
	{
		zzut.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #141 <Method void zzly.pause()>
	//    3    7:return          
	}

	public void resume()
	{
		zzut.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:invokevirtual   #144 <Method void zzly.resume()>
	//    3    7:return          
	}

	public void setAdListener(AdListener adlistener)
	{
		zzut.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method void zzly.setAdListener(AdListener)>
		if(adlistener == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       29
		{
			zzut.zza(((zzjd) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field zzly zzut>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #151 <Method void zzly.zza(zzjd)>
			zzut.setAppEventListener(((AppEventListener) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field zzly zzut>
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #155 <Method void zzly.setAppEventListener(AppEventListener)>
			return;
	//   14   28:return          
		}
		if(adlistener instanceof zzjd)
	//*  15   29:aload_1         
	//*  16   30:instanceof      #157 <Class zzjd>
	//*  17   33:ifeq            47
			zzut.zza((zzjd)adlistener);
	//   18   36:aload_0         
	//   19   37:getfield        #18  <Field zzly zzut>
	//   20   40:aload_1         
	//   21   41:checkcast       #157 <Class zzjd>
	//   22   44:invokevirtual   #151 <Method void zzly.zza(zzjd)>
		if(adlistener instanceof AppEventListener)
	//*  23   47:aload_1         
	//*  24   48:instanceof      #159 <Class AppEventListener>
	//*  25   51:ifeq            65
			zzut.setAppEventListener((AppEventListener)adlistener);
	//   26   54:aload_0         
	//   27   55:getfield        #18  <Field zzly zzut>
	//   28   58:aload_1         
	//   29   59:checkcast       #159 <Class AppEventListener>
	//   30   62:invokevirtual   #155 <Method void zzly.setAppEventListener(AppEventListener)>
	//   31   65:return          
	}

	public void setAdSize(AdSize adsize)
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

	public void setAdUnitId(String s)
	{
		zzut.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzly zzut>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #169 <Method void zzly.setAdUnitId(String)>
	//    4    8:return          
	}

	protected final zzly zzut;
}
