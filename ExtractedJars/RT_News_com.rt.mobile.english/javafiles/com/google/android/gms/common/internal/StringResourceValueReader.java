// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public class StringResourceValueReader
{

	public StringResourceValueReader(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		Preconditions.checkNotNull(((Object) (context)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		zzvb = context.getResources();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method Resources Context.getResources()>
	//    8   14:putfield        #27  <Field Resources zzvb>
		zzvc = zzvb.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field Resources zzvb>
	//   12   22:getstatic       #33  <Field int com.google.android.gms.common.R$string.common_google_play_services_unknown_issue>
	//   13   25:invokevirtual   #39  <Method String Resources.getResourcePackageName(int)>
	//   14   28:putfield        #41  <Field String zzvc>
	//   15   31:return          
	}

	public String getString(String s)
	{
		int i = zzvb.getIdentifier(s, "string", zzvc);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Resources zzvb>
	//    2    4:aload_1         
	//    3    5:ldc1            #47  <String "string">
	//    4    7:aload_0         
	//    5    8:getfield        #41  <Field String zzvc>
	//    6   11:invokevirtual   #51  <Method int Resources.getIdentifier(String, String, String)>
	//    7   14:istore_2        
		if(i == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            21
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		else
			return zzvb.getString(i);
	//   12   21:aload_0         
	//   13   22:getfield        #27  <Field Resources zzvb>
	//   14   25:iload_2         
	//   15   26:invokevirtual   #53  <Method String Resources.getString(int)>
	//   16   29:areturn         
	}

	private final Resources zzvb;
	private final String zzvc;
}
