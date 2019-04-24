// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.*;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaor, zzakq

public final class zzamt
{

	public zzamt(Activity activity, View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzcuj = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Activity zzcuj>
		mView = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field View mView>
		zzcun = ongloballayoutlistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
		zzcuo = onscrollchangedlistener;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//   14   25:return          
	}

	private static ViewTreeObserver zzj(Activity activity)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		activity = ((Activity) (activity.getWindow()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #39  <Method Window Activity.getWindow()>
	//    6   10:astore_0        
		if(activity == null)
	//*   7   11:aload_0         
	//*   8   12:ifnonnull       17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		activity = ((Activity) (((Window) (activity)).getDecorView()));
	//   11   17:aload_0         
	//   12   18:invokevirtual   #45  <Method View Window.getDecorView()>
	//   13   21:astore_0        
		if(activity == null)
	//*  14   22:aload_0         
	//*  15   23:ifnonnull       28
			return null;
	//   16   26:aconst_null     
	//   17   27:areturn         
		else
			return ((View) (activity)).getViewTreeObserver();
	//   18   28:aload_0         
	//   19   29:invokevirtual   #51  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   20   32:areturn         
	}

	private final void zzse()
	{
		if(!zzcuk)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field boolean zzcuk>
	//*   2    4:ifne            118
		{
			if(zzcun != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
	//*   5   11:ifnull          60
			{
				if(zzcuj != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #24  <Field Activity zzcuj>
	//*   8   18:ifnull          45
				{
					Object obj = ((Object) (zzcuj));
	//    9   21:aload_0         
	//   10   22:getfield        #24  <Field Activity zzcuj>
	//   11   25:astore_2        
					android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = zzcun;
	//   12   26:aload_0         
	//   13   27:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
	//   14   30:astore_1        
					obj = ((Object) (zzj(((Activity) (obj)))));
	//   15   31:aload_2         
	//   16   32:invokestatic    #56  <Method ViewTreeObserver zzj(Activity)>
	//   17   35:astore_2        
					if(obj != null)
	//*  18   36:aload_2         
	//*  19   37:ifnull          45
						((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(ongloballayoutlistener);
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #62  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				}
				zzbv.zzfg();
	//   23   45:invokestatic    #68  <Method zzaor zzbv.zzfg()>
	//   24   48:pop             
				zzaor.zza(mView, zzcun);
	//   25   49:aload_0         
	//   26   50:getfield        #26  <Field View mView>
	//   27   53:aload_0         
	//   28   54:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
	//   29   57:invokestatic    #74  <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			if(zzcuo != null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//*  32   64:ifnull          113
			{
				if(zzcuj != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #24  <Field Activity zzcuj>
	//*  35   71:ifnull          98
				{
					Object obj1 = ((Object) (zzcuj));
	//   36   74:aload_0         
	//   37   75:getfield        #24  <Field Activity zzcuj>
	//   38   78:astore_2        
					android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = zzcuo;
	//   39   79:aload_0         
	//   40   80:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//   41   83:astore_1        
					obj1 = ((Object) (zzj(((Activity) (obj1)))));
	//   42   84:aload_2         
	//   43   85:invokestatic    #56  <Method ViewTreeObserver zzj(Activity)>
	//   44   88:astore_2        
					if(obj1 != null)
	//*  45   89:aload_2         
	//*  46   90:ifnull          98
						((ViewTreeObserver) (obj1)).addOnScrollChangedListener(onscrollchangedlistener);
	//   47   93:aload_2         
	//   48   94:aload_1         
	//   49   95:invokevirtual   #78  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				}
				zzbv.zzfg();
	//   50   98:invokestatic    #68  <Method zzaor zzbv.zzfg()>
	//   51  101:pop             
				zzaor.zza(mView, zzcuo);
	//   52  102:aload_0         
	//   53  103:getfield        #26  <Field View mView>
	//   54  106:aload_0         
	//   55  107:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//   56  110:invokestatic    #81  <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
			}
			zzcuk = true;
	//   57  113:aload_0         
	//   58  114:iconst_1        
	//   59  115:putfield        #54  <Field boolean zzcuk>
		}
	//   60  118:return          
	}

	private final void zzsf()
	{
		if(zzcuj == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Activity zzcuj>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(zzcuk)
	//*   4    8:aload_0         
	//*   5    9:getfield        #54  <Field boolean zzcuk>
	//*   6   12:ifeq            85
		{
			if(zzcun != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
	//*   9   19:ifnull          49
			{
				Object obj = ((Object) (zzcuj));
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field Activity zzcuj>
	//   12   26:astore_2        
				android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = zzcun;
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcun>
	//   15   31:astore_1        
				obj = ((Object) (zzj(((Activity) (obj)))));
	//   16   32:aload_2         
	//   17   33:invokestatic    #56  <Method ViewTreeObserver zzj(Activity)>
	//   18   36:astore_2        
				if(obj != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          49
					zzbv.zzem().zza(((ViewTreeObserver) (obj)), ongloballayoutlistener);
	//   21   41:invokestatic    #86  <Method zzakq zzbv.zzem()>
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #91  <Method void zzakq.zza(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			if(zzcuo != null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//*  27   53:ifnull          80
			{
				Object obj1 = ((Object) (zzcuj));
	//   28   56:aload_0         
	//   29   57:getfield        #24  <Field Activity zzcuj>
	//   30   60:astore_2        
				android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = zzcuo;
	//   31   61:aload_0         
	//   32   62:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcuo>
	//   33   65:astore_1        
				obj1 = ((Object) (zzj(((Activity) (obj1)))));
	//   34   66:aload_2         
	//   35   67:invokestatic    #56  <Method ViewTreeObserver zzj(Activity)>
	//   36   70:astore_2        
				if(obj1 != null)
	//*  37   71:aload_2         
	//*  38   72:ifnull          80
					((ViewTreeObserver) (obj1)).removeOnScrollChangedListener(onscrollchangedlistener);
	//   39   75:aload_2         
	//   40   76:aload_1         
	//   41   77:invokevirtual   #94  <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			}
			zzcuk = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #54  <Field boolean zzcuk>
		}
	//   45   85:return          
	}

	public final void onAttachedToWindow()
	{
		zzcul = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #97  <Field boolean zzcul>
		if(zzcum)
	//*   3    5:aload_0         
	//*   4    6:getfield        #99  <Field boolean zzcum>
	//*   5    9:ifeq            16
			zzse();
	//    6   12:aload_0         
	//    7   13:invokespecial   #101 <Method void zzse()>
	//    8   16:return          
	}

	public final void onDetachedFromWindow()
	{
		zzcul = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #97  <Field boolean zzcul>
		zzsf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #104 <Method void zzsf()>
	//    5    9:return          
	}

	public final void zzi(Activity activity)
	{
		zzcuj = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Activity zzcuj>
	//    3    5:return          
	}

	public final void zzsc()
	{
		zzcum = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #99  <Field boolean zzcum>
		if(zzcul)
	//*   3    5:aload_0         
	//*   4    6:getfield        #97  <Field boolean zzcul>
	//*   5    9:ifeq            16
			zzse();
	//    6   12:aload_0         
	//    7   13:invokespecial   #101 <Method void zzse()>
	//    8   16:return          
	}

	public final void zzsd()
	{
		zzcum = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #99  <Field boolean zzcum>
		zzsf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #104 <Method void zzsf()>
	//    5    9:return          
	}

	private final View mView;
	private Activity zzcuj;
	private boolean zzcuk;
	private boolean zzcul;
	private boolean zzcum;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener zzcun;
	private android.view.ViewTreeObserver.OnScrollChangedListener zzcuo;
}
