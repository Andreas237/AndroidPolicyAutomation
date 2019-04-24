// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzuq
{

	public zzuq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void initialize(Context context)
	{
		if(mContext != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Context mContext>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		if(context.getApplicationContext() != null)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #22  <Method Context Context.getApplicationContext()>
	//*   6   12:ifnonnull       18
	//*   7   15:goto            23
			context = context.getApplicationContext();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #22  <Method Context Context.getApplicationContext()>
	//   10   22:astore_1        
		mContext = context;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #16  <Field Context mContext>
	//   14   28:return          
	}

	private Context mContext;
}
