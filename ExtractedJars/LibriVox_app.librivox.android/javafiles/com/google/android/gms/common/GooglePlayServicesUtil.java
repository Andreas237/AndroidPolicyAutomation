// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.*;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.t;

// Referenced classes of package com.google.android.gms.common:
//			h, c

public final class GooglePlayServicesUtil extends h
{

	private GooglePlayServicesUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void h()>
	//    2    4:return          
	}

	public static Dialog getErrorDialog(int i, Activity activity, int j)
	{
		return getErrorDialog(i, activity, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #31  <Method Dialog getErrorDialog(int, Activity, int, android.content.DialogInterface$OnCancelListener)>
	//    5    7:areturn         
	}

	public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		if(h.isPlayServicesPossiblyUpdating(((Context) (activity)), i))
	//*   2    3:aload_1         
	//*   3    4:iload_0         
	//*   4    5:invokestatic    #36  <Method boolean h.isPlayServicesPossiblyUpdating(Context, int)>
	//*   5    8:ifeq            15
			k = 18;
	//    6   11:bipush          18
	//    7   13:istore          4
		return c.a().a(activity, k, j, oncancellistener);
	//    8   15:invokestatic    #42  <Method c c.a()>
	//    9   18:aload_1         
	//   10   19:iload           4
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #45  <Method Dialog c.a(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   14   26:areturn         
	}

	public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
	{
		return h.getErrorPendingIntent(i, context, j);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #49  <Method PendingIntent h.getErrorPendingIntent(int, Context, int)>
	//    4    6:areturn         
	}

	public static String getErrorString(int i)
	{
		return h.getErrorString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #53  <Method String h.getErrorString(int)>
	//    2    4:areturn         
	}

	public static Context getRemoteContext(Context context)
	{
		return h.getRemoteContext(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method Context h.getRemoteContext(Context)>
	//    2    4:areturn         
	}

	public static Resources getRemoteResource(Context context)
	{
		return h.getRemoteResource(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #61  <Method Resources h.getRemoteResource(Context)>
	//    2    4:areturn         
	}

	public static int isGooglePlayServicesAvailable(Context context)
	{
		return h.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #65  <Method int h.isGooglePlayServicesAvailable(Context)>
	//    2    4:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context, int i)
	{
		return h.isGooglePlayServicesAvailable(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #68  <Method int h.isGooglePlayServicesAvailable(Context, int)>
	//    3    5:ireturn         
	}

	public static boolean isUserRecoverableError(int i)
	{
		return h.isUserRecoverableError(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #72  <Method boolean h.isUserRecoverableError(int)>
	//    2    4:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, int j)
	{
		return showErrorDialogFragment(i, activity, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #77  <Method boolean showErrorDialogFragment(int, Activity, int, android.content.DialogInterface$OnCancelListener)>
	//    5    7:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		return showErrorDialogFragment(i, activity, ((Fragment) (null)), j, oncancellistener);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:aload_3         
	//    5    5:invokestatic    #80  <Method boolean showErrorDialogFragment(int, Activity, Fragment, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore          5
		if(h.isPlayServicesPossiblyUpdating(((Context) (activity)), i))
	//*   2    3:aload_1         
	//*   3    4:iload_0         
	//*   4    5:invokestatic    #36  <Method boolean h.isPlayServicesPossiblyUpdating(Context, int)>
	//*   5    8:ifeq            15
			k = 18;
	//    6   11:bipush          18
	//    7   13:istore          5
		c c1 = c.a();
	//    8   15:invokestatic    #42  <Method c c.a()>
	//    9   18:astore          6
		if(fragment == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       36
			return c1.b(activity, k, j, oncancellistener);
	//   12   24:aload           6
	//   13   26:aload_1         
	//   14   27:iload           5
	//   15   29:iload_3         
	//   16   30:aload           4
	//   17   32:invokevirtual   #84  <Method boolean c.b(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   18   35:ireturn         
		fragment = ((Fragment) (c.a(((Context) (activity)), k, t.a(fragment, c.a().a(((Context) (activity)), k, "d"), j), oncancellistener)));
	//   19   36:aload_1         
	//   20   37:iload           5
	//   21   39:aload_2         
	//   22   40:invokestatic    #42  <Method c c.a()>
	//   23   43:aload_1         
	//   24   44:iload           5
	//   25   46:ldc1            #86  <String "d">
	//   26   48:invokevirtual   #89  <Method android.content.Intent c.a(Context, int, String)>
	//   27   51:iload_3         
	//   28   52:invokestatic    #94  <Method t t.a(Fragment, android.content.Intent, int)>
	//   29   55:aload           4
	//   30   57:invokestatic    #97  <Method Dialog c.a(Context, int, t, android.content.DialogInterface$OnCancelListener)>
	//   31   60:astore_2        
		if(fragment == null)
	//*  32   61:aload_2         
	//*  33   62:ifnonnull       67
		{
			return false;
	//   34   65:iconst_0        
	//   35   66:ireturn         
		} else
		{
			c.a(activity, ((Dialog) (fragment)), "GooglePlayServicesErrorDialog", oncancellistener);
	//   36   67:aload_1         
	//   37   68:aload_2         
	//   38   69:ldc1            #8   <String "GooglePlayServicesErrorDialog">
	//   39   71:aload           4
	//   40   73:invokestatic    #100 <Method void c.a(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   41   76:iconst_1        
	//   42   77:ireturn         
		}
	}

	public static void showErrorNotification(int i, Context context)
	{
		c c1 = c.a();
	//    0    0:invokestatic    #42  <Method c c.a()>
	//    1    3:astore_2        
		if(!h.isPlayServicesPossiblyUpdating(context, i) && !h.isPlayStorePossiblyUpdating(context, i))
	//*   2    4:aload_1         
	//*   3    5:iload_0         
	//*   4    6:invokestatic    #36  <Method boolean h.isPlayServicesPossiblyUpdating(Context, int)>
	//*   5    9:ifne            30
	//*   6   12:aload_1         
	//*   7   13:iload_0         
	//*   8   14:invokestatic    #105 <Method boolean h.isPlayStorePossiblyUpdating(Context, int)>
	//*   9   17:ifeq            23
	//*  10   20:goto            30
		{
			c1.a(context, i);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:iload_0         
	//   14   26:invokevirtual   #108 <Method void c.a(Context, int)>
			return;
	//   15   29:return          
		} else
		{
			c1.b(context);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #111 <Method void c.b(Context)>
			return;
	//   19   35:return          
		}
	}

	public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

	static 
	{
		GOOGLE_PLAY_SERVICES_VERSION_CODE = h.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #21  <Field int h.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:putstatic       #22  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*   2    6:return          
	}
}
