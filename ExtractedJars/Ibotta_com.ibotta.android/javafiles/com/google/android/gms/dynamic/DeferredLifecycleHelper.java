// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//			zza, zze, zzc, zzd, 
//			LifecycleDelegate, zzb, zzg, zzf, 
//			OnDelegateCreatedListener

public abstract class DeferredLifecycleHelper
{
	private static interface zza
	{

		public abstract int getState();

		public abstract void zza(LifecycleDelegate lifecycledelegate);
	}


	public DeferredLifecycleHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class zza>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void zza(DeferredLifecycleHelper)>
	//    7   13:putfield        #31  <Field OnDelegateCreatedListener zzabf>
	//    8   16:return          
	}

	public static void showGooglePlayUnavailableMessage(FrameLayout framelayout)
	{
		Object obj1 = ((Object) (GoogleApiAvailability.getInstance()));
	//    0    0:invokestatic    #40  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    1    3:astore          5
		Object obj = ((Object) (framelayout.getContext()));
	//    2    5:aload_0         
	//    3    6:invokevirtual   #46  <Method android.content.Context FrameLayout.getContext()>
	//    4    9:astore_2        
		int i = ((GoogleApiAvailabilityLight) (obj1)).isGooglePlayServicesAvailable(((android.content.Context) (obj)));
	//    5   10:aload           5
	//    6   12:aload_2         
	//    7   13:invokevirtual   #52  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(android.content.Context)>
	//    8   16:istore_1        
		String s1 = ConnectionErrorMessages.getErrorMessage(((android.content.Context) (obj)), i);
	//    9   17:aload_2         
	//   10   18:iload_1         
	//   11   19:invokestatic    #58  <Method String ConnectionErrorMessages.getErrorMessage(android.content.Context, int)>
	//   12   22:astore          6
		String s = ConnectionErrorMessages.getErrorDialogButtonMessage(((android.content.Context) (obj)), i);
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokestatic    #61  <Method String ConnectionErrorMessages.getErrorDialogButtonMessage(android.content.Context, int)>
	//   16   29:astore_3        
		LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
	//   17   30:new             #63  <Class LinearLayout>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:invokevirtual   #46  <Method android.content.Context FrameLayout.getContext()>
	//   21   38:invokespecial   #66  <Method void LinearLayout(android.content.Context)>
	//   22   41:astore          4
		linearlayout.setOrientation(1);
	//   23   43:aload           4
	//   24   45:iconst_1        
	//   25   46:invokevirtual   #70  <Method void LinearLayout.setOrientation(int)>
		linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   26   49:aload           4
	//   27   51:new             #72  <Class android.widget.FrameLayout$LayoutParams>
	//   28   54:dup             
	//   29   55:bipush          -2
	//   30   57:bipush          -2
	//   31   59:invokespecial   #75  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   32   62:invokevirtual   #79  <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		framelayout.addView(((View) (linearlayout)));
	//   33   65:aload_0         
	//   34   66:aload           4
	//   35   68:invokevirtual   #83  <Method void FrameLayout.addView(View)>
		framelayout = ((FrameLayout) (new TextView(framelayout.getContext())));
	//   36   71:new             #85  <Class TextView>
	//   37   74:dup             
	//   38   75:aload_0         
	//   39   76:invokevirtual   #46  <Method android.content.Context FrameLayout.getContext()>
	//   40   79:invokespecial   #86  <Method void TextView(android.content.Context)>
	//   41   82:astore_0        
		((TextView) (framelayout)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   42   83:aload_0         
	//   43   84:new             #72  <Class android.widget.FrameLayout$LayoutParams>
	//   44   87:dup             
	//   45   88:bipush          -2
	//   46   90:bipush          -2
	//   47   92:invokespecial   #75  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   48   95:invokevirtual   #87  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((TextView) (framelayout)).setText(((CharSequence) (s1)));
	//   49   98:aload_0         
	//   50   99:aload           6
	//   51  101:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		linearlayout.addView(((View) (framelayout)));
	//   52  104:aload           4
	//   53  106:aload_0         
	//   54  107:invokevirtual   #92  <Method void LinearLayout.addView(View)>
		obj1 = ((Object) (((GoogleApiAvailabilityLight) (obj1)).getErrorResolutionIntent(((android.content.Context) (obj)), i, ((String) (null)))));
	//   55  110:aload           5
	//   56  112:aload_2         
	//   57  113:iload_1         
	//   58  114:aconst_null     
	//   59  115:invokevirtual   #96  <Method android.content.Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(android.content.Context, int, String)>
	//   60  118:astore          5
		if(obj1 != null)
	//*  61  120:aload           5
	//*  62  122:ifnull          198
		{
			framelayout = ((FrameLayout) (new Button(((android.content.Context) (obj)))));
	//   63  125:new             #98  <Class Button>
	//   64  128:dup             
	//   65  129:aload_2         
	//   66  130:invokespecial   #99  <Method void Button(android.content.Context)>
	//   67  133:astore_0        
			((Button) (framelayout)).setId(0x1020019);
	//   68  134:aload_0         
	//   69  135:ldc1            #100 <Int 0x1020019>
	//   70  137:invokevirtual   #103 <Method void Button.setId(int)>
			((Button) (framelayout)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   71  140:aload_0         
	//   72  141:new             #72  <Class android.widget.FrameLayout$LayoutParams>
	//   73  144:dup             
	//   74  145:bipush          -2
	//   75  147:bipush          -2
	//   76  149:invokespecial   #75  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   77  152:invokevirtual   #104 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			((Button) (framelayout)).setText(((CharSequence) (s)));
	//   78  155:aload_0         
	//   79  156:aload_3         
	//   80  157:invokevirtual   #105 <Method void Button.setText(CharSequence)>
			linearlayout.addView(((View) (framelayout)));
	//   81  160:aload           4
	//   82  162:aload_0         
	//   83  163:invokevirtual   #92  <Method void LinearLayout.addView(View)>
			obj = ((Object) (new zze(((android.content.Context) (obj)), ((android.content.Intent) (obj1)))));
	//   84  166:new             #107 <Class zze>
	//   85  169:dup             
	//   86  170:aload_2         
	//   87  171:aload           5
	//   88  173:invokespecial   #110 <Method void zze(android.content.Context, android.content.Intent)>
	//   89  176:astore_2        
			if(!(framelayout instanceof View))
	//*  90  177:aload_0         
	//*  91  178:instanceof      #112 <Class View>
	//*  92  181:ifne            190
			{
				((Button) (framelayout)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   93  184:aload_0         
	//   94  185:aload_2         
	//   95  186:invokevirtual   #116 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
				return;
	//   96  189:return          
			}
			ViewInstrumentation.setOnClickListener((View)framelayout, ((android.view.View.OnClickListener) (obj)));
	//   97  190:aload_0         
	//   98  191:checkcast       #112 <Class View>
	//   99  194:aload_2         
	//  100  195:invokestatic    #121 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		}
	//  101  198:return          
	}

	static Bundle zza(DeferredLifecycleHelper deferredlifecyclehelper, Bundle bundle)
	{
		deferredlifecyclehelper.zzabd = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #124 <Field Bundle zzabd>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static LifecycleDelegate zza(DeferredLifecycleHelper deferredlifecyclehelper, LifecycleDelegate lifecycledelegate)
	{
		deferredlifecyclehelper.zzabc = lifecycledelegate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field LifecycleDelegate zzabc>
		return lifecycledelegate;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static LinkedList zza(DeferredLifecycleHelper deferredlifecyclehelper)
	{
		return deferredlifecyclehelper.zzabe;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field LinkedList zzabe>
	//    2    4:areturn         
	}

	private final void zza(Bundle bundle, zza zza1)
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_3        
		if(lifecycledelegate != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
		{
			zza1.zza(lifecycledelegate);
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #134 <Method void DeferredLifecycleHelper$zza.zza(LifecycleDelegate)>
			return;
	//    8   16:return          
		}
		if(zzabe == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #130 <Field LinkedList zzabe>
	//*  11   21:ifnonnull       35
			zzabe = new LinkedList();
	//   12   24:aload_0         
	//   13   25:new             #136 <Class LinkedList>
	//   14   28:dup             
	//   15   29:invokespecial   #137 <Method void LinkedList()>
	//   16   32:putfield        #130 <Field LinkedList zzabe>
		zzabe.add(((Object) (zza1)));
	//   17   35:aload_0         
	//   18   36:getfield        #130 <Field LinkedList zzabe>
	//   19   39:aload_2         
	//   20   40:invokevirtual   #141 <Method boolean LinkedList.add(Object)>
	//   21   43:pop             
		if(bundle != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          76
		{
			zza1 = ((zza) (zzabd));
	//   24   48:aload_0         
	//   25   49:getfield        #124 <Field Bundle zzabd>
	//   26   52:astore_2        
			if(zza1 == null)
	//*  27   53:aload_2         
	//*  28   54:ifnonnull       71
				zzabd = (Bundle)bundle.clone();
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #147 <Method Object Bundle.clone()>
	//   32   62:checkcast       #143 <Class Bundle>
	//   33   65:putfield        #124 <Field Bundle zzabd>
			else
	//*  34   68:goto            76
				((Bundle) (zza1)).putAll(bundle);
	//   35   71:aload_2         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #151 <Method void Bundle.putAll(Bundle)>
		}
		createDelegate(zzabf);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #31  <Field OnDelegateCreatedListener zzabf>
	//   41   81:invokevirtual   #155 <Method void createDelegate(OnDelegateCreatedListener)>
	//   42   84:return          
	}

	static LifecycleDelegate zzb(DeferredLifecycleHelper deferredlifecyclehelper)
	{
		return deferredlifecyclehelper.zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:areturn         
	}

	private final void zzm(int i)
	{
		for(; !zzabe.isEmpty() && ((zza)zzabe.getLast()).getState() >= i; zzabe.removeLast());
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field LinkedList zzabe>
	//    2    4:invokevirtual   #162 <Method boolean LinkedList.isEmpty()>
	//    3    7:ifne            40
	//    4   10:aload_0         
	//    5   11:getfield        #130 <Field LinkedList zzabe>
	//    6   14:invokevirtual   #165 <Method Object LinkedList.getLast()>
	//    7   17:checkcast       #7   <Class DeferredLifecycleHelper$zza>
	//    8   20:invokeinterface #169 <Method int DeferredLifecycleHelper$zza.getState()>
	//    9   25:iload_1         
	//   10   26:icmplt          40
	//   11   29:aload_0         
	//   12   30:getfield        #130 <Field LinkedList zzabe>
	//   13   33:invokevirtual   #172 <Method Object LinkedList.removeLast()>
	//   14   36:pop             
	//*  15   37:goto            0
	//   16   40:return          
	}

	protected abstract void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener);

	public LifecycleDelegate getDelegate()
	{
		return zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:areturn         
	}

	protected void handleGooglePlayUnavailable(FrameLayout framelayout)
	{
		showGooglePlayUnavailableMessage(framelayout);
	//    0    0:aload_1         
	//    1    1:invokestatic    #179 <Method void showGooglePlayUnavailableMessage(FrameLayout)>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		zza(bundle, ((zza) (new zzc(this, bundle))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #182 <Class zzc>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #185 <Method void zzc(DeferredLifecycleHelper, Bundle)>
	//    7   11:invokespecial   #187 <Method void zza(Bundle, DeferredLifecycleHelper$zza)>
	//    8   14:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
	//    0    0:new             #42  <Class FrameLayout>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #192 <Method android.content.Context LayoutInflater.getContext()>
	//    4    8:invokespecial   #193 <Method void FrameLayout(android.content.Context)>
	//    5   11:astore          4
		zza(bundle, ((zza) (new zzd(this, framelayout, layoutinflater, viewgroup, bundle))));
	//    6   13:aload_0         
	//    7   14:aload_3         
	//    8   15:new             #195 <Class zzd>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokespecial   #198 <Method void zzd(DeferredLifecycleHelper, FrameLayout, LayoutInflater, ViewGroup, Bundle)>
	//   16   28:invokespecial   #187 <Method void zza(Bundle, DeferredLifecycleHelper$zza)>
		if(zzabc == null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #127 <Field LifecycleDelegate zzabc>
	//*  19   35:ifnonnull       44
			handleGooglePlayUnavailable(framelayout);
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:invokevirtual   #200 <Method void handleGooglePlayUnavailable(FrameLayout)>
		return ((View) (framelayout));
	//   23   44:aload           4
	//   24   46:areturn         
	}

	public void onDestroy()
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onDestroy();
	//    5    9:aload_1         
	//    6   10:invokeinterface #205 <Method void LifecycleDelegate.onDestroy()>
			return;
	//    7   15:return          
		} else
		{
			zzm(1);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #207 <Method void zzm(int)>
			return;
	//   11   21:return          
		}
	}

	public void onDestroyView()
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onDestroyView();
	//    5    9:aload_1         
	//    6   10:invokeinterface #210 <Method void LifecycleDelegate.onDestroyView()>
			return;
	//    7   15:return          
		} else
		{
			zzm(2);
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:invokespecial   #207 <Method void zzm(int)>
			return;
	//   11   21:return          
		}
	}

	public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		zza(bundle1, ((zza) (new zzb(this, activity, bundle, bundle1))));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:new             #214 <Class zzb>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #217 <Method void zzb(DeferredLifecycleHelper, Activity, Bundle, Bundle)>
	//    9   13:invokespecial   #187 <Method void zza(Bundle, DeferredLifecycleHelper$zza)>
	//   10   16:return          
	}

	public void onLowMemory()
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			lifecycledelegate.onLowMemory();
	//    5    9:aload_1         
	//    6   10:invokeinterface #220 <Method void LifecycleDelegate.onLowMemory()>
	//    7   15:return          
	}

	public void onPause()
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onPause();
	//    5    9:aload_1         
	//    6   10:invokeinterface #223 <Method void LifecycleDelegate.onPause()>
			return;
	//    7   15:return          
		} else
		{
			zzm(5);
	//    8   16:aload_0         
	//    9   17:iconst_5        
	//   10   18:invokespecial   #207 <Method void zzm(int)>
			return;
	//   11   21:return          
		}
	}

	public void onResume()
	{
		zza(((Bundle) (null)), ((zza) (new zzg(this))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #226 <Class zzg>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #227 <Method void zzg(DeferredLifecycleHelper)>
	//    6   10:invokespecial   #187 <Method void zza(Bundle, DeferredLifecycleHelper$zza)>
	//    7   13:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		Object obj = ((Object) (zzabc));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			((LifecycleDelegate) (obj)).onSaveInstanceState(bundle);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #230 <Method void LifecycleDelegate.onSaveInstanceState(Bundle)>
			return;
	//    8   16:return          
		}
		obj = ((Object) (zzabd));
	//    9   17:aload_0         
	//   10   18:getfield        #124 <Field Bundle zzabd>
	//   11   21:astore_2        
		if(obj != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          31
			bundle.putAll(((Bundle) (obj)));
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #151 <Method void Bundle.putAll(Bundle)>
	//   17   31:return          
	}

	public void onStart()
	{
		zza(((Bundle) (null)), ((zza) (new zzf(this))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #233 <Class zzf>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #234 <Method void zzf(DeferredLifecycleHelper)>
	//    6   10:invokespecial   #187 <Method void zza(Bundle, DeferredLifecycleHelper$zza)>
	//    7   13:return          
	}

	public void onStop()
	{
		LifecycleDelegate lifecycledelegate = zzabc;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LifecycleDelegate zzabc>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onStop();
	//    5    9:aload_1         
	//    6   10:invokeinterface #237 <Method void LifecycleDelegate.onStop()>
			return;
	//    7   15:return          
		} else
		{
			zzm(4);
	//    8   16:aload_0         
	//    9   17:iconst_4        
	//   10   18:invokespecial   #207 <Method void zzm(int)>
			return;
	//   11   21:return          
		}
	}

	private LifecycleDelegate zzabc;
	private Bundle zzabd;
	private LinkedList zzabe;
	private final OnDelegateCreatedListener zzabf = new com.google.android.gms.dynamic.zza(this);
}
