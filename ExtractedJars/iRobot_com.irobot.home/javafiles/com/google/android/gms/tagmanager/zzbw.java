// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

final class zzbw
{

	zzbw(long l, long l1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzbcl = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #18  <Field long zzbcl>
		zzaax = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #20  <Field long zzaax>
		zzbcm = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #22  <Field long zzbcm>
	//   11   20:return          
	}

	final void zzds(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			if(TextUtils.isEmpty(((CharSequence) (s.trim()))))
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #31  <Method String String.trim()>
	//*   4    8:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			zzbcn = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #39  <Field String zzbcn>
		}
	//   10   20:return          
	}

	final long zzov()
	{
		return zzbcl;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long zzbcl>
	//    2    4:lreturn         
	}

	final long zzow()
	{
		return zzbcm;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long zzbcm>
	//    2    4:lreturn         
	}

	final String zzox()
	{
		return zzbcn;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String zzbcn>
	//    2    4:areturn         
	}

	private final long zzaax;
	private final long zzbcl;
	private final long zzbcm;
	private String zzbcn;
}
