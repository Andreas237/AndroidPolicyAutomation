// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

public static interface DynamiteModule$VersionPolicy
{
	public static interface IVersions
	{

		public abstract int getLocalVersion(Context context, String s);

		public abstract int getRemoteVersion(Context context, String s, boolean flag)
			throws DynamiteModule.LoadingException;
	}

	public static class SelectionResult
	{

		public int localVersion;
		public int remoteVersion;
		public int selection;

		public SelectionResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			localVersion = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field int localVersion>
			remoteVersion = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field int remoteVersion>
			selection = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #24  <Field int selection>
		//   11   19:return          
		}
	}


	public abstract SelectionResult selectModule(Context context, String s, IVersions iversions)
		throws on;
}
