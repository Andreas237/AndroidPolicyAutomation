// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;

public final class zzcv
{

	public static IntentFilter zza(String s, Uri uri, int i)
	{
		s = ((String) (new IntentFilter(s)));
	//    0    0:new             #8   <Class IntentFilter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void IntentFilter(String)>
	//    4    8:astore_0        
		if(uri.getScheme() != null)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #18  <Method String Uri.getScheme()>
	//*   7   13:ifnull          24
			((IntentFilter) (s)).addDataScheme(uri.getScheme());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #18  <Method String Uri.getScheme()>
	//   11   21:invokevirtual   #21  <Method void IntentFilter.addDataScheme(String)>
		if(uri.getAuthority() != null)
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #24  <Method String Uri.getAuthority()>
	//*  14   28:ifnull          46
			((IntentFilter) (s)).addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #24  <Method String Uri.getAuthority()>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #28  <Method int Uri.getPort()>
	//   20   40:invokestatic    #34  <Method String Integer.toString(int)>
	//   21   43:invokevirtual   #38  <Method void IntentFilter.addDataAuthority(String, String)>
		if(uri.getPath() != null)
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #41  <Method String Uri.getPath()>
	//*  24   50:ifnull          62
			((IntentFilter) (s)).addDataPath(uri.getPath(), i);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #41  <Method String Uri.getPath()>
	//   28   58:iload_2         
	//   29   59:invokevirtual   #45  <Method void IntentFilter.addDataPath(String, int)>
		return ((IntentFilter) (s));
	//   30   62:aload_0         
	//   31   63:areturn         
	}

	public static IntentFilter zzip(String s)
	{
		s = ((String) (new IntentFilter(s)));
	//    0    0:new             #8   <Class IntentFilter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void IntentFilter(String)>
	//    4    8:astore_0        
		((IntentFilter) (s)).addDataScheme("wear");
	//    5    9:aload_0         
	//    6   10:ldc1            #50  <String "wear">
	//    7   12:invokevirtual   #21  <Method void IntentFilter.addDataScheme(String)>
		((IntentFilter) (s)).addDataAuthority("*", ((String) (null)));
	//    8   15:aload_0         
	//    9   16:ldc1            #52  <String "*">
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #38  <Method void IntentFilter.addDataAuthority(String, String)>
		return ((IntentFilter) (s));
	//   12   22:aload_0         
	//   13   23:areturn         
	}
}
