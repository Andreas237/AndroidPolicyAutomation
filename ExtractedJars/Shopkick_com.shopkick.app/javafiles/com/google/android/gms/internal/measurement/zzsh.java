// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class zzsh
{

	public static Uri zzfq(String s)
	{
		s = String.valueOf(((Object) (Uri.encode(s))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #12  <Method String Uri.encode(String)>
	//    2    4:invokestatic    #18  <Method String String.valueOf(Object)>
	//    3    7:astore_0        
		if(s.length() != 0)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #22  <Method int String.length()>
	//*   6   12:ifeq            25
			s = "content://com.google.android.gms.phenotype/".concat(s);
	//    7   15:ldc1            #24  <String "content://com.google.android.gms.phenotype/">
	//    8   17:aload_0         
	//    9   18:invokevirtual   #27  <Method String String.concat(String)>
	//   10   21:astore_0        
		else
	//*  11   22:goto            35
			s = new String("content://com.google.android.gms.phenotype/");
	//   12   25:new             #14  <Class String>
	//   13   28:dup             
	//   14   29:ldc1            #24  <String "content://com.google.android.gms.phenotype/">
	//   15   31:invokespecial   #31  <Method void String(String)>
	//   16   34:astore_0        
		return Uri.parse(s);
	//   17   35:aload_0         
	//   18   36:invokestatic    #34  <Method Uri Uri.parse(String)>
	//   19   39:areturn         
	}
}
