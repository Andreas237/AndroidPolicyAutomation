// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.*;

public final class aha extends MutableContextWrapper
{

	public aha(Context context)
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

	public final Activity a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity a>
	//    2    4:areturn         
	}

	public final Context b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context c>
	//    2    4:areturn         
	}

	public final Object getSystemService(String s)
	{
		return c.getSystemService(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method Object Context.getSystemService(String)>
	//    4    8:areturn         
	}

	public final void setBaseContext(Context context)
	{
		b = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #35  <Field Context b>
		Activity activity;
		if(context instanceof Activity)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #37  <Class Activity>
	//*   6   12:ifeq            23
			activity = (Activity)context;
	//    7   15:aload_1         
	//    8   16:checkcast       #37  <Class Activity>
	//    9   19:astore_2        
		else
	//*  10   20:goto            25
			activity = null;
	//   11   23:aconst_null     
	//   12   24:astore_2        
		a = activity;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #21  <Field Activity a>
		c = context;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #24  <Field Context c>
		super.setBaseContext(b);
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #35  <Field Context b>
	//   22   40:invokespecial   #38  <Method void MutableContextWrapper.setBaseContext(Context)>
	//   23   43:return          
	}

	public final void startActivity(Intent intent)
	{
		Activity activity = a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity a>
	//    2    4:astore_2        
		if(activity != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			activity.startActivity(intent);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #42  <Method void Activity.startActivity(Intent)>
			return;
	//    8   14:return          
		} else
		{
			intent.setFlags(0x10000000);
	//    9   15:aload_1         
	//   10   16:ldc1            #43  <Int 0x10000000>
	//   11   18:invokevirtual   #49  <Method Intent Intent.setFlags(int)>
	//   12   21:pop             
			b.startActivity(intent);
	//   13   22:aload_0         
	//   14   23:getfield        #35  <Field Context b>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #50  <Method void Context.startActivity(Intent)>
			return;
	//   17   30:return          
		}
	}

	private Activity a;
	private Context b;
	private Context c;
}
