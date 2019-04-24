// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.*;

public final class zzash extends MutableContextWrapper
{

	public zzash(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void MutableContextWrapper(Context)>
		setBaseContext(context);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #17  <Method void setBaseContext(Context)>
	//    6   10:return          
	}

	public final Object getSystemService(String s)
	{
		return zzdeq.getSystemService(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context zzdeq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method Object Context.getSystemService(String)>
	//    4    8:areturn         
	}

	public final void setBaseContext(Context context)
	{
		zzaeo = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #32  <Field Context zzaeo>
		Activity activity;
		if(context instanceof Activity)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #34  <Class Activity>
	//*   6   12:ifeq            23
			activity = (Activity)context;
	//    7   15:aload_1         
	//    8   16:checkcast       #34  <Class Activity>
	//    9   19:astore_2        
		else
	//*  10   20:goto            25
			activity = null;
	//   11   23:aconst_null     
	//   12   24:astore_2        
		zzcuj = activity;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #36  <Field Activity zzcuj>
		zzdeq = context;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #22  <Field Context zzdeq>
		super.setBaseContext(zzaeo);
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #32  <Field Context zzaeo>
	//   22   40:invokespecial   #37  <Method void MutableContextWrapper.setBaseContext(Context)>
	//   23   43:return          
	}

	public final void startActivity(Intent intent)
	{
		if(zzcuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Activity zzcuj>
	//*   2    4:ifnull          16
		{
			zzcuj.startActivity(intent);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field Activity zzcuj>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #41  <Method void Activity.startActivity(Intent)>
			return;
	//    7   15:return          
		} else
		{
			intent.setFlags(0x10000000);
	//    8   16:aload_1         
	//    9   17:ldc1            #42  <Int 0x10000000>
	//   10   19:invokevirtual   #48  <Method Intent Intent.setFlags(int)>
	//   11   22:pop             
			zzaeo.startActivity(intent);
	//   12   23:aload_0         
	//   13   24:getfield        #32  <Field Context zzaeo>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #49  <Method void Context.startActivity(Intent)>
			return;
	//   16   31:return          
		}
	}

	public final Activity zzto()
	{
		return zzcuj;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Activity zzcuj>
	//    2    4:areturn         
	}

	public final Context zzua()
	{
		return zzdeq;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context zzdeq>
	//    2    4:areturn         
	}

	private Context zzaeo;
	private Activity zzcuj;
	private Context zzdeq;
}
