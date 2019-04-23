// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//			zaa, zae, zac, zad, 
//			LifecycleDelegate, zab, zag, zaf, 
//			OnDelegateCreatedListener

public abstract class DeferredLifecycleHelper
{
	private static interface zaa
	{

		public abstract int getState();

		public abstract void zaa(LifecycleDelegate lifecycledelegate);
	}


	public DeferredLifecycleHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class zaa>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void zaa(DeferredLifecycleHelper)>
	//    7   13:putfield        #31  <Field OnDelegateCreatedListener zarh>
	//    8   16:return          
	}

	public static void showGooglePlayUnavailableMessage(FrameLayout framelayout)
	{
		GoogleApiAvailability googleapiavailability = GoogleApiAvailability.getInstance();
	//    0    0:invokestatic    #41  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    1    3:astore          5
		android.content.Context context = framelayout.getContext();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #47  <Method android.content.Context FrameLayout.getContext()>
	//    4    9:astore_2        
		int i = googleapiavailability.isGooglePlayServicesAvailable(context);
	//    5   10:aload           5
	//    6   12:aload_2         
	//    7   13:invokevirtual   #51  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//    8   16:istore_1        
		String s1 = ConnectionErrorMessages.getErrorMessage(context, i);
	//    9   17:aload_2         
	//   10   18:iload_1         
	//   11   19:invokestatic    #57  <Method String ConnectionErrorMessages.getErrorMessage(android.content.Context, int)>
	//   12   22:astore          6
		String s = ConnectionErrorMessages.getErrorDialogButtonMessage(context, i);
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokestatic    #60  <Method String ConnectionErrorMessages.getErrorDialogButtonMessage(android.content.Context, int)>
	//   16   29:astore_3        
		LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
	//   17   30:new             #62  <Class LinearLayout>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:invokevirtual   #47  <Method android.content.Context FrameLayout.getContext()>
	//   21   38:invokespecial   #65  <Method void LinearLayout(android.content.Context)>
	//   22   41:astore          4
		linearlayout.setOrientation(1);
	//   23   43:aload           4
	//   24   45:iconst_1        
	//   25   46:invokevirtual   #69  <Method void LinearLayout.setOrientation(int)>
		linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   26   49:aload           4
	//   27   51:new             #71  <Class android.widget.FrameLayout$LayoutParams>
	//   28   54:dup             
	//   29   55:bipush          -2
	//   30   57:bipush          -2
	//   31   59:invokespecial   #74  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   32   62:invokevirtual   #78  <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		framelayout.addView(((View) (linearlayout)));
	//   33   65:aload_0         
	//   34   66:aload           4
	//   35   68:invokevirtual   #82  <Method void FrameLayout.addView(View)>
		framelayout = ((FrameLayout) (new TextView(framelayout.getContext())));
	//   36   71:new             #84  <Class TextView>
	//   37   74:dup             
	//   38   75:aload_0         
	//   39   76:invokevirtual   #47  <Method android.content.Context FrameLayout.getContext()>
	//   40   79:invokespecial   #85  <Method void TextView(android.content.Context)>
	//   41   82:astore_0        
		((TextView) (framelayout)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   42   83:aload_0         
	//   43   84:new             #71  <Class android.widget.FrameLayout$LayoutParams>
	//   44   87:dup             
	//   45   88:bipush          -2
	//   46   90:bipush          -2
	//   47   92:invokespecial   #74  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   48   95:invokevirtual   #86  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((TextView) (framelayout)).setText(((CharSequence) (s1)));
	//   49   98:aload_0         
	//   50   99:aload           6
	//   51  101:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
		linearlayout.addView(((View) (framelayout)));
	//   52  104:aload           4
	//   53  106:aload_0         
	//   54  107:invokevirtual   #91  <Method void LinearLayout.addView(View)>
		framelayout = ((FrameLayout) (googleapiavailability.getErrorResolutionIntent(context, i, ((String) (null)))));
	//   55  110:aload           5
	//   56  112:aload_2         
	//   57  113:iload_1         
	//   58  114:aconst_null     
	//   59  115:invokevirtual   #95  <Method android.content.Intent GoogleApiAvailability.getErrorResolutionIntent(android.content.Context, int, String)>
	//   60  118:astore_0        
		if(framelayout != null)
	//*  61  119:aload_0         
	//*  62  120:ifnull          183
		{
			Button button = new Button(context);
	//   63  123:new             #97  <Class Button>
	//   64  126:dup             
	//   65  127:aload_2         
	//   66  128:invokespecial   #98  <Method void Button(android.content.Context)>
	//   67  131:astore          5
			button.setId(0x1020019);
	//   68  133:aload           5
	//   69  135:ldc1            #99  <Int 0x1020019>
	//   70  137:invokevirtual   #102 <Method void Button.setId(int)>
			button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   71  140:aload           5
	//   72  142:new             #71  <Class android.widget.FrameLayout$LayoutParams>
	//   73  145:dup             
	//   74  146:bipush          -2
	//   75  148:bipush          -2
	//   76  150:invokespecial   #74  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   77  153:invokevirtual   #103 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			button.setText(((CharSequence) (s)));
	//   78  156:aload           5
	//   79  158:aload_3         
	//   80  159:invokevirtual   #104 <Method void Button.setText(CharSequence)>
			linearlayout.addView(((View) (button)));
	//   81  162:aload           4
	//   82  164:aload           5
	//   83  166:invokevirtual   #91  <Method void LinearLayout.addView(View)>
			button.setOnClickListener(((android.view.View.OnClickListener) (new zae(context, ((android.content.Intent) (framelayout))))));
	//   84  169:aload           5
	//   85  171:new             #106 <Class zae>
	//   86  174:dup             
	//   87  175:aload_2         
	//   88  176:aload_0         
	//   89  177:invokespecial   #109 <Method void zae(android.content.Context, android.content.Intent)>
	//   90  180:invokevirtual   #113 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		}
	//   91  183:return          
	}

	static Bundle zaa(DeferredLifecycleHelper deferredlifecyclehelper, Bundle bundle)
	{
		deferredlifecyclehelper.zarf = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #116 <Field Bundle zarf>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static LifecycleDelegate zaa(DeferredLifecycleHelper deferredlifecyclehelper, LifecycleDelegate lifecycledelegate)
	{
		deferredlifecyclehelper.zare = lifecycledelegate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field LifecycleDelegate zare>
		return lifecycledelegate;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static LinkedList zaa(DeferredLifecycleHelper deferredlifecyclehelper)
	{
		return deferredlifecyclehelper.zarg;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field LinkedList zarg>
	//    2    4:areturn         
	}

	private final void zaa(Bundle bundle, zaa zaa1)
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_3        
		if(lifecycledelegate != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
		{
			zaa1.zaa(lifecycledelegate);
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #126 <Method void DeferredLifecycleHelper$zaa.zaa(LifecycleDelegate)>
			return;
	//    8   16:return          
		}
		if(zarg == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #122 <Field LinkedList zarg>
	//*  11   21:ifnonnull       35
			zarg = new LinkedList();
	//   12   24:aload_0         
	//   13   25:new             #128 <Class LinkedList>
	//   14   28:dup             
	//   15   29:invokespecial   #129 <Method void LinkedList()>
	//   16   32:putfield        #122 <Field LinkedList zarg>
		zarg.add(((Object) (zaa1)));
	//   17   35:aload_0         
	//   18   36:getfield        #122 <Field LinkedList zarg>
	//   19   39:aload_2         
	//   20   40:invokevirtual   #133 <Method boolean LinkedList.add(Object)>
	//   21   43:pop             
		if(bundle != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          76
		{
			zaa1 = ((zaa) (zarf));
	//   24   48:aload_0         
	//   25   49:getfield        #116 <Field Bundle zarf>
	//   26   52:astore_2        
			if(zaa1 == null)
	//*  27   53:aload_2         
	//*  28   54:ifnonnull       71
				zarf = (Bundle)bundle.clone();
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #139 <Method Object Bundle.clone()>
	//   32   62:checkcast       #135 <Class Bundle>
	//   33   65:putfield        #116 <Field Bundle zarf>
			else
	//*  34   68:goto            76
				((Bundle) (zaa1)).putAll(bundle);
	//   35   71:aload_2         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #143 <Method void Bundle.putAll(Bundle)>
		}
		createDelegate(zarh);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #31  <Field OnDelegateCreatedListener zarh>
	//   41   81:invokevirtual   #147 <Method void createDelegate(OnDelegateCreatedListener)>
	//   42   84:return          
	}

	static LifecycleDelegate zab(DeferredLifecycleHelper deferredlifecyclehelper)
	{
		return deferredlifecyclehelper.zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:areturn         
	}

	private final void zal(int i)
	{
		for(; !zarg.isEmpty() && ((zaa)zarg.getLast()).getState() >= i; zarg.removeLast());
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field LinkedList zarg>
	//    2    4:invokevirtual   #154 <Method boolean LinkedList.isEmpty()>
	//    3    7:ifne            40
	//    4   10:aload_0         
	//    5   11:getfield        #122 <Field LinkedList zarg>
	//    6   14:invokevirtual   #157 <Method Object LinkedList.getLast()>
	//    7   17:checkcast       #7   <Class DeferredLifecycleHelper$zaa>
	//    8   20:invokeinterface #161 <Method int DeferredLifecycleHelper$zaa.getState()>
	//    9   25:iload_1         
	//   10   26:icmplt          40
	//   11   29:aload_0         
	//   12   30:getfield        #122 <Field LinkedList zarg>
	//   13   33:invokevirtual   #164 <Method Object LinkedList.removeLast()>
	//   14   36:pop             
	//*  15   37:goto            0
	//   16   40:return          
	}

	protected abstract void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener);

	public LifecycleDelegate getDelegate()
	{
		return zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:areturn         
	}

	protected void handleGooglePlayUnavailable(FrameLayout framelayout)
	{
		showGooglePlayUnavailableMessage(framelayout);
	//    0    0:aload_1         
	//    1    1:invokestatic    #171 <Method void showGooglePlayUnavailableMessage(FrameLayout)>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		zaa(bundle, ((zaa) (new zac(this, bundle))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #174 <Class zac>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #177 <Method void zac(DeferredLifecycleHelper, Bundle)>
	//    7   11:invokespecial   #179 <Method void zaa(Bundle, DeferredLifecycleHelper$zaa)>
	//    8   14:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
	//    0    0:new             #43  <Class FrameLayout>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method android.content.Context LayoutInflater.getContext()>
	//    4    8:invokespecial   #185 <Method void FrameLayout(android.content.Context)>
	//    5   11:astore          4
		zaa(bundle, ((zaa) (new zad(this, framelayout, layoutinflater, viewgroup, bundle))));
	//    6   13:aload_0         
	//    7   14:aload_3         
	//    8   15:new             #187 <Class zad>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokespecial   #190 <Method void zad(DeferredLifecycleHelper, FrameLayout, LayoutInflater, ViewGroup, Bundle)>
	//   16   28:invokespecial   #179 <Method void zaa(Bundle, DeferredLifecycleHelper$zaa)>
		if(zare == null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #119 <Field LifecycleDelegate zare>
	//*  19   35:ifnonnull       44
			handleGooglePlayUnavailable(framelayout);
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:invokevirtual   #192 <Method void handleGooglePlayUnavailable(FrameLayout)>
		return ((View) (framelayout));
	//   23   44:aload           4
	//   24   46:areturn         
	}

	public void onDestroy()
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onDestroy();
	//    5    9:aload_1         
	//    6   10:invokeinterface #197 <Method void LifecycleDelegate.onDestroy()>
			return;
	//    7   15:return          
		} else
		{
			zal(1);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #199 <Method void zal(int)>
			return;
	//   11   21:return          
		}
	}

	public void onDestroyView()
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onDestroyView();
	//    5    9:aload_1         
	//    6   10:invokeinterface #202 <Method void LifecycleDelegate.onDestroyView()>
			return;
	//    7   15:return          
		} else
		{
			zal(2);
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:invokespecial   #199 <Method void zal(int)>
			return;
	//   11   21:return          
		}
	}

	public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		zaa(bundle1, ((zaa) (new zab(this, activity, bundle, bundle1))));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:new             #206 <Class zab>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #209 <Method void zab(DeferredLifecycleHelper, Activity, Bundle, Bundle)>
	//    9   13:invokespecial   #179 <Method void zaa(Bundle, DeferredLifecycleHelper$zaa)>
	//   10   16:return          
	}

	public void onLowMemory()
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			lifecycledelegate.onLowMemory();
	//    5    9:aload_1         
	//    6   10:invokeinterface #212 <Method void LifecycleDelegate.onLowMemory()>
	//    7   15:return          
	}

	public void onPause()
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onPause();
	//    5    9:aload_1         
	//    6   10:invokeinterface #215 <Method void LifecycleDelegate.onPause()>
			return;
	//    7   15:return          
		} else
		{
			zal(5);
	//    8   16:aload_0         
	//    9   17:iconst_5        
	//   10   18:invokespecial   #199 <Method void zal(int)>
			return;
	//   11   21:return          
		}
	}

	public void onResume()
	{
		zaa(((Bundle) (null)), ((zaa) (new zag(this))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #218 <Class zag>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #219 <Method void zag(DeferredLifecycleHelper)>
	//    6   10:invokespecial   #179 <Method void zaa(Bundle, DeferredLifecycleHelper$zaa)>
	//    7   13:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		Object obj = ((Object) (zare));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			((LifecycleDelegate) (obj)).onSaveInstanceState(bundle);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #222 <Method void LifecycleDelegate.onSaveInstanceState(Bundle)>
			return;
	//    8   16:return          
		}
		obj = ((Object) (zarf));
	//    9   17:aload_0         
	//   10   18:getfield        #116 <Field Bundle zarf>
	//   11   21:astore_2        
		if(obj != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          31
			bundle.putAll(((Bundle) (obj)));
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #143 <Method void Bundle.putAll(Bundle)>
	//   17   31:return          
	}

	public void onStart()
	{
		zaa(((Bundle) (null)), ((zaa) (new zaf(this))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #225 <Class zaf>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #226 <Method void zaf(DeferredLifecycleHelper)>
	//    6   10:invokespecial   #179 <Method void zaa(Bundle, DeferredLifecycleHelper$zaa)>
	//    7   13:return          
	}

	public void onStop()
	{
		LifecycleDelegate lifecycledelegate = zare;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field LifecycleDelegate zare>
	//    2    4:astore_1        
		if(lifecycledelegate != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			lifecycledelegate.onStop();
	//    5    9:aload_1         
	//    6   10:invokeinterface #229 <Method void LifecycleDelegate.onStop()>
			return;
	//    7   15:return          
		} else
		{
			zal(4);
	//    8   16:aload_0         
	//    9   17:iconst_4        
	//   10   18:invokespecial   #199 <Method void zal(int)>
			return;
	//   11   21:return          
		}
	}

	private LifecycleDelegate zare;
	private Bundle zarf;
	private LinkedList zarg;
	private final OnDelegateCreatedListener zarh = new com.google.android.gms.dynamic.zaa(this);
}
