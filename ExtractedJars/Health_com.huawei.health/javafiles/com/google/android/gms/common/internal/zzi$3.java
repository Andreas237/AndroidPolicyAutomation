// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.internal.zzabf;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzi

final class zzi$3 extends zzi
{

	public void zzxT()
	{
		if(val$intent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Intent val$intent>
	//*   2    4:ifnull          24
			zzaFF.startActivityForResult(val$intent, val$requestCode);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field zzabf zzaFF>
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field Intent val$intent>
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field int val$requestCode>
	//    9   19:invokeinterface #32  <Method void zzabf.startActivityForResult(Intent, int)>
	//   10   24:return          
	}

	final Intent val$intent;
	final int val$requestCode;
	final zzabf zzaFF;

	zzi$3(int i)
	{
		val$intent = intent1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Intent val$intent>
		zzaFF = final_zzabf1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field zzabf zzaFF>
		val$requestCode = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #21  <Field int val$requestCode>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void zzi()>
	//   11   19:return          
	}
}
