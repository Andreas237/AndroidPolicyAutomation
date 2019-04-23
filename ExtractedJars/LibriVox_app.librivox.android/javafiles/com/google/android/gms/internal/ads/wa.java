// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wc, abo, bwk, zv, 
//			wb, xe, aas, abe

public final class wa
	implements wc
{

	public wa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final abe a(Context context)
	{
		abo abo1 = new abo();
	//    0    0:new             #16  <Class abo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void abo()>
	//    3    7:astore_2        
		bwk.a();
	//    4    8:invokestatic    #22  <Method zv bwk.a()>
	//    5   11:pop             
		if(zv.c(context))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #28  <Method boolean zv.c(Context)>
	//*   8   16:ifeq            33
			xe.a(((Runnable) (new wb(this, context, abo1))));
	//    9   19:new             #30  <Class wb>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokespecial   #33  <Method void wb(wa, Context, abo)>
	//   15   29:invokestatic    #38  <Method abe xe.a(Runnable)>
	//   16   32:pop             
		return ((abe) (abo1));
	//   17   33:aload_2         
	//   18   34:areturn         
	}

	public final abe a(String s, PackageInfo packageinfo)
	{
		return ((abe) (aas.a(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #44  <Method abd aas.a(Object)>
	//    2    4:areturn         
	}
}
