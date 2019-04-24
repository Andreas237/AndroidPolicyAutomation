// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapi, zzapw, zznw, zznq, 
//			zzaqw, zzapv

public final class zzapn
{

	private zzapn(Context context, ViewGroup viewgroup, zzapw zzapw1, zzapi zzapi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzapi1 = ((zzapi) (context));
	//    2    4:aload_1         
	//    3    5:astore          4
		if(context.getApplicationContext() != null)
	//*   4    7:aload_1         
	//*   5    8:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//*   6   11:ifnull          20
			zzapi1 = ((zzapi) (context.getApplicationContext()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//    9   18:astore          4
		zzcyf = ((Context) (zzapi1));
	//   10   20:aload_0         
	//   11   21:aload           4
	//   12   23:putfield        #27  <Field Context zzcyf>
		zzcyh = viewgroup;
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:putfield        #29  <Field ViewGroup zzcyh>
		zzcyg = zzapw1;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #31  <Field zzapw zzcyg>
		zzcyi = null;
	//   19   36:aload_0         
	//   20   37:aconst_null     
	//   21   38:putfield        #33  <Field zzapi zzcyi>
	//   22   41:return          
	}

	public zzapn(Context context, ViewGroup viewgroup, zzaqw zzaqw)
	{
		this(context, viewgroup, ((zzapw) (zzaqw)), ((zzapi) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #38  <Method void zzapn(Context, ViewGroup, zzapw, zzapi)>
	//    6    8:return          
	}

	public final void onDestroy()
	{
		Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
	//    0    0:ldc1            #41  <String "onDestroy must be called from the UI thread.">
	//    1    2:invokestatic    #47  <Method void Preconditions.checkMainThread(String)>
		if(zzcyi != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #33  <Field zzapi zzcyi>
	//*   4    9:ifnull          35
		{
			zzcyi.destroy();
	//    5   12:aload_0         
	//    6   13:getfield        #33  <Field zzapi zzcyi>
	//    7   16:invokevirtual   #52  <Method void zzapi.destroy()>
			zzcyh.removeView(((android.view.View) (zzcyi)));
	//    8   19:aload_0         
	//    9   20:getfield        #29  <Field ViewGroup zzcyh>
	//   10   23:aload_0         
	//   11   24:getfield        #33  <Field zzapi zzcyi>
	//   12   27:invokevirtual   #58  <Method void ViewGroup.removeView(android.view.View)>
			zzcyi = null;
	//   13   30:aload_0         
	//   14   31:aconst_null     
	//   15   32:putfield        #33  <Field zzapi zzcyi>
		}
	//   16   35:return          
	}

	public final void onPause()
	{
		Preconditions.checkMainThread("onPause must be called from the UI thread.");
	//    0    0:ldc1            #61  <String "onPause must be called from the UI thread.">
	//    1    2:invokestatic    #47  <Method void Preconditions.checkMainThread(String)>
		if(zzcyi != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #33  <Field zzapi zzcyi>
	//*   4    9:ifnull          19
			zzcyi.pause();
	//    5   12:aload_0         
	//    6   13:getfield        #33  <Field zzapi zzcyi>
	//    7   16:invokevirtual   #64  <Method void zzapi.pause()>
	//    8   19:return          
	}

	public final void zza(int i, int j, int k, int l, int i1, boolean flag, zzapv zzapv)
	{
		if(zzcyi != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field zzapi zzcyi>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			zznq.zza(zzcyg.zztp().zzji(), zzcyg.zztn(), new String[] {
				"vpr2"
			});
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field zzapw zzcyg>
	//    6   12:invokeinterface #72  <Method zznw zzapw.zztp()>
	//    7   17:invokevirtual   #78  <Method zznx zznw.zzji()>
	//    8   20:aload_0         
	//    9   21:getfield        #31  <Field zzapw zzcyg>
	//   10   24:invokeinterface #82  <Method zznv zzapw.zztn()>
	//   11   29:iconst_1        
	//   12   30:anewarray       String[]
	//   13   33:dup             
	//   14   34:iconst_0        
	//   15   35:ldc1            #86  <String "vpr2">
	//   16   37:aastore         
	//   17   38:invokestatic    #91  <Method boolean zznq.zza(zznx, zznv, String[])>
	//   18   41:pop             
			zzcyi = new zzapi(zzcyf, zzcyg, i1, flag, zzcyg.zztp().zzji(), zzapv);
	//   19   42:aload_0         
	//   20   43:new             #49  <Class zzapi>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:getfield        #27  <Field Context zzcyf>
	//   24   51:aload_0         
	//   25   52:getfield        #31  <Field zzapw zzcyg>
	//   26   55:iload           5
	//   27   57:iload           6
	//   28   59:aload_0         
	//   29   60:getfield        #31  <Field zzapw zzcyg>
	//   30   63:invokeinterface #72  <Method zznw zzapw.zztp()>
	//   31   68:invokevirtual   #78  <Method zznx zznw.zzji()>
	//   32   71:aload           7
	//   33   73:invokespecial   #94  <Method void zzapi(Context, zzapw, int, boolean, zznx, zzapv)>
	//   34   76:putfield        #33  <Field zzapi zzcyi>
			zzcyh.addView(((android.view.View) (zzcyi)), 0, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   35   79:aload_0         
	//   36   80:getfield        #29  <Field ViewGroup zzcyh>
	//   37   83:aload_0         
	//   38   84:getfield        #33  <Field zzapi zzcyi>
	//   39   87:iconst_0        
	//   40   88:new             #96  <Class android.view.ViewGroup$LayoutParams>
	//   41   91:dup             
	//   42   92:iconst_m1       
	//   43   93:iconst_m1       
	//   44   94:invokespecial   #99  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   45   97:invokevirtual   #103 <Method void ViewGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams)>
			zzcyi.zzd(i, j, k, l);
	//   46  100:aload_0         
	//   47  101:getfield        #33  <Field zzapi zzcyi>
	//   48  104:iload_1         
	//   49  105:iload_2         
	//   50  106:iload_3         
	//   51  107:iload           4
	//   52  109:invokevirtual   #107 <Method void zzapi.zzd(int, int, int, int)>
			zzcyg.zzah(false);
	//   53  112:aload_0         
	//   54  113:getfield        #31  <Field zzapw zzcyg>
	//   55  116:iconst_0        
	//   56  117:invokeinterface #111 <Method void zzapw.zzah(boolean)>
			return;
	//   57  122:return          
		}
	}

	public final void zze(int i, int j, int k, int l)
	{
		Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
	//    0    0:ldc1            #114 <String "The underlay may only be modified from the UI thread.">
	//    1    2:invokestatic    #47  <Method void Preconditions.checkMainThread(String)>
		if(zzcyi != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #33  <Field zzapi zzcyi>
	//*   4    9:ifnull          24
			zzcyi.zzd(i, j, k, l);
	//    5   12:aload_0         
	//    6   13:getfield        #33  <Field zzapi zzcyi>
	//    7   16:iload_1         
	//    8   17:iload_2         
	//    9   18:iload_3         
	//   10   19:iload           4
	//   11   21:invokevirtual   #107 <Method void zzapi.zzd(int, int, int, int)>
	//   12   24:return          
	}

	public final zzapi zzth()
	{
		Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
	//    0    0:ldc1            #118 <String "getAdVideoUnderlay must be called from the UI thread.">
	//    1    2:invokestatic    #47  <Method void Preconditions.checkMainThread(String)>
		return zzcyi;
	//    2    5:aload_0         
	//    3    6:getfield        #33  <Field zzapi zzcyi>
	//    4    9:areturn         
	}

	private final Context zzcyf;
	private final zzapw zzcyg;
	private final ViewGroup zzcyh;
	private zzapi zzcyi;
}
