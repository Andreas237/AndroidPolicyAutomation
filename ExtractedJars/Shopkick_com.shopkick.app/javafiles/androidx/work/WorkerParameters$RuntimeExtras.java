// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.net.Network;
import java.util.Collections;
import java.util.List;

// Referenced classes of package androidx.work:
//			WorkerParameters

public static class WorkerParameters$RuntimeExtras
{

	public Network network;
	public List triggeredContentAuthorities;
	public List triggeredContentUris;

	public WorkerParameters$RuntimeExtras()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		triggeredContentAuthorities = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method List Collections.emptyList()>
	//    4    8:putfield        #33  <Field List triggeredContentAuthorities>
		triggeredContentUris = Collections.emptyList();
	//    5   11:aload_0         
	//    6   12:invokestatic    #31  <Method List Collections.emptyList()>
	//    7   15:putfield        #35  <Field List triggeredContentUris>
	//    8   18:return          
	}
}
